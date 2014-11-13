<?xml version="1.0" ?>

<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
 xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:s="urn:us:gov:dod:standard:ssrf:1.2.4.b">

<xsl:include href="ssrf_toa_refdata.xsl"/>
<xsl:include href="ssrf_location.xsl"/>
<xsl:include href="ssrf_antenna.xsl"/>
<xsl:include href="ssrf_txrx.xsl"/>
<xsl:include href="ssrf_config_link.xsl"/>
<xsl:include href="ssrf_sspt.xsl"/>
<xsl:include href="ssrf_asgnallot.xsl"/>
<xsl:include href="ssrf_intf.xsl"/>
<xsl:include href="ssrf_fe.xsl"/>
<xsl:include href="ssrf_jrfl.xsl"/>
<xsl:include href="ssrf_bsm_ceoi.xsl"/>

<xsl:output method="text"/>

<xsl:template match="text()"/>

<!-- extract 2-letter dataset type from serial -->

<xsl:function name="s:gettype">
	<xsl:param name="serial"/>
	<xsl:value-of select="substring(substring-after(substring-after($serial,':'),':'),1,2)"/>
</xsl:function>

<!-- implements XOR operator -->

<xsl:function name="s:xor" as="xs:boolean">
	<xsl:param name="a" as="xs:boolean"/>
	<xsl:param name="b" as="xs:boolean"/>
	<xsl:sequence select="($a and not($b)) or (not($a) and $b)"/>
</xsl:function>

<!-- check if element elt fulfills error condition test; if yes, write err -->

<xsl:function name="s:seterror">
	<xsl:param name="elt"/>
	<xsl:param name="test"/>
	<xsl:param name="err"/>
	<xsl:if test="boolean($test)">
		<xsl:value-of select="concat('ERR|',$err,'|')"/>
		<xsl:for-each select="$elt/ancestor-or-self::*">
			<xsl:if test="name()!='SSRF'">/<xsl:value-of select="1+count(preceding-sibling::*)"/></xsl:if>
		</xsl:for-each>
		<xsl:text>;</xsl:text>
	</xsl:if>
</xsl:function>

<!-- check if type of serial matches expected code -->

<xsl:function name="s:checktype">
	<xsl:param name="elt"/>
	<xsl:param name="code"/>
	<xsl:variable name="dt" select="s:gettype($elt/@serial)"/>
	<xsl:choose>
		<xsl:when test="$code='LT'">
			<xsl:value-of select="s:seterror($elt,$dt != 'LT' and $dt != 'LG','ID001')"/>
		</xsl:when>
		<xsl:when test="$code='AS'">
			<xsl:value-of select="s:seterror($elt,$dt != 'AL' and $dt != 'AS','ID001')"/>
		</xsl:when>
		<xsl:otherwise>
			<xsl:value-of select="s:seterror($elt,$dt != $code,'ID001')"/>
		</xsl:otherwise>
	</xsl:choose>
</xsl:function>

<!-- check constraints in Common descendants : serial type (ID001), overall classification (GE003) and ContactOrgRef (GE004) -->

<xsl:function name="s:checkcommon">
	<xsl:param name="elt"/>
	<xsl:param name="code"/>
	<xsl:value-of select="concat('INF|',$elt/name(),'|',$elt/@serial,';')"/>

	<xsl:value-of select="s:checktype($elt,$code)"/>

	<xsl:variable name="cl" select="$elt/s:DatasetCls/@overallCls"/>
	<xsl:choose>
		<xsl:when test="$cl = 'U'">
			<xsl:for-each select="$elt//*">
				<xsl:value-of select="s:seterror(current(),@cls = 'R' or @cls = 'C' or @cls = 'S','GE003')"/>
			</xsl:for-each>
		</xsl:when>
		<xsl:when test="$cl = 'R'">
			<xsl:for-each select="$elt//*">
				<xsl:value-of select="s:seterror(current(),@cls = 'C' or @cls = 'S','GE003')"/>
			</xsl:for-each>
		</xsl:when>
		<xsl:when test="$cl = 'C'">
			<xsl:for-each select="$elt//*">
				<xsl:value-of select="s:seterror(current(),@cls = 'S','GE003')"/>
			</xsl:for-each>
		</xsl:when>
	</xsl:choose>

	<xsl:if test="$elt/name() != 'Contact' and $elt/name() != 'Organisation'">
		<xsl:value-of select="s:seterror($elt,not($elt/s:ContactOrgRef[@type = 'OWNER']) and not ($elt/s:ContactOrgRef[@type = 'GATEWAY']),'GE004')"/>
	</xsl:if>
</xsl:function>

<!-- rules for the Common element and sub-elements -->

<xsl:template match="s:SSRF">
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:Header">
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:MsgInfo">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'MS','ID001')"/>
</xsl:template>

<!-- [SMADEF 1.2.4.a] accepted new validation rules -->
<xsl:template match="s:MsgCls">
	<xsl:variable name="mcl" select="."/>
	<xsl:value-of select="concat('INF|MsgCls|',$mcl,';')"/>
	<xsl:choose>
		<xsl:when test="$mcl = 'U'">
			<xsl:for-each select="//s:DatasetCls">
				<xsl:value-of select="s:seterror(current(),@overallCls = 'R' or @overallCls = 'C' or @overallCls = 'S','GE005')"/>
			</xsl:for-each>
		</xsl:when>
		<xsl:when test="$mcl = 'R'">
			<xsl:for-each select="//s:DatasetCls">
				<xsl:value-of select="s:seterror(current(),@overallCls = 'C' or @overallCls = 'S','GE005')"/>
			</xsl:for-each>
		</xsl:when>
		<xsl:when test="$mcl = 'C'">
			<xsl:for-each select="//s:DatasetCls">
				<xsl:value-of select="s:seterror(current(),@overallCls= 'S','GE005')"/>
			</xsl:for-each>
		</xsl:when>
	</xsl:choose>
</xsl:template>

<xsl:template match="s:Body">
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:ExtRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'EX','ID001')"/>
</xsl:template>

<xsl:template match="s:ContactOrgRef">
	<xsl:apply-templates/>
</xsl:template> 

<!-- [SMADEF 1.2.4.a] accepted new validation rules -->
<xsl:template match="s:Status">
	<xsl:if test="@byContact"><xsl:value-of select="s:seterror(current(),s:gettype(@byContact) != 'CN','ID001')"/></xsl:if>
	<xsl:if test="@fromContact"><xsl:value-of select="s:seterror(current(),s:gettype(@fromContact) != 'CN','ID001')"/></xsl:if>
	<xsl:if test="@toContact"><xsl:value-of select="s:seterror(current(),s:gettype(@toContact) != 'CN','ID001')"/></xsl:if>
	<xsl:if test="@byRole"><xsl:value-of select="s:seterror(current(),s:gettype(@byRole) != 'JA','ID001')"/></xsl:if>
	<xsl:if test="@fromRole"><xsl:value-of select="s:seterror(current(),s:gettype(@fromRole) != 'JA','ID001')"/></xsl:if>
	<xsl:if test="@toRole"><xsl:value-of select="s:seterror(current(),s:gettype(@toRole) != 'JA','ID001')"/></xsl:if>
	<xsl:value-of select="s:seterror(current(),(@fromContact or @fromRole or @toContact or @toRole or not(@byContact or @byRole)) and (ends-with(@state,'BY') or ends-with(@state,'AT')),'AD002')"/>
	<xsl:value-of select="s:seterror(current(),(not((@fromContact or @fromRole) and (@toContact or @toRole)) or @byContact or @byRole) and not(ends-with(@state,'BY') or ends-with(@state,'AT')) and not(@state='COORDINATION' or @state='INFO'),'AD003')"/>
	<xsl:value-of select="s:seterror(current(),(not(@fromContact or @fromRole) or @byContact or @byRole or @toContact or @toRole or not(s:InfoTo)) and (@state='COORDINATION' or @state='INFO'),'AD004')"/>
	<xsl:if test="s:InfoTo">
		<xsl:value-of select="s:seterror(current(), not(@toContact or @toRole),'AD006')"/>
	</xsl:if>
</xsl:template> 

<!-- rules for ranges in multiple elements : min < max -->

<!-- Disabled min/max check for Azimuth per SDG-11a.USA-TG004, 2008-12-08T22:44, tony.greene@jsc-eses.com -->
<!-- xsl:template match="s:Azimuth">
	<xsl:value-of select="s:seterror(current(),number(@minAz) >= number(@maxAz),'GE002')"/>
</xsl:template --> 


<xsl:template match="s:Elevation">
	<xsl:value-of select="s:seterror(current(),number(@minElev) >= number(@maxElev),'GE002')"/>
</xsl:template> 

<xsl:template match="s:FreqRange | s:PostDetectionFreq">
	<xsl:value-of select="s:seterror(current(),number(@minFreq) >= number(@maxFreq),'GE002')"/>
</xsl:template> 

<xsl:template match="s:AuthorisedBW | s:OccupiedBw">
	<xsl:value-of select="s:seterror(current(),number(@minBw) >= number(@maxBw),'GE002')"/>
</xsl:template>

<!-- Admin and other shared elements -->

<xsl:template match="s:ExtReference">
	<xsl:value-of select="s:checkcommon(current(),'EX')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:Contact">
	<xsl:value-of select="s:checkcommon(current(),'CN')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:Organisation">
	<xsl:value-of select="s:checkcommon(current(),'OR')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:Role">
	<xsl:value-of select="s:checkcommon(current(),'JA')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:ContactRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'CN','ID001')"/>
</xsl:template> 

<xsl:template match="s:OrganisationRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'OR','ID001')"/>
</xsl:template> 

<xsl:template match="s:Deletion">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'DE','ID001')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:Administrative">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'DR','ID001')"/>
	<xsl:value-of select="s:seterror(current(),@serial='INVMSG' and not(s:MessageRef),'AD005')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:MessageRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'MS','ID001')"/>
</xsl:template>

<xsl:template match="s:Response">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'DP','ID001')"/>
	<xsl:value-of select="s:seterror(current(),s:Reason and s:Dataset/s:Reason,'AD001')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:Codes">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'CD','ID001')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:Dataset">
	<xsl:value-of select="s:seterror(current(),not(../s:Reason) and not(s:Reason),'AD001')"/>
</xsl:template> 

<xsl:template match="s:NoteRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'RN','ID001')"/>
</xsl:template>

<xsl:template match="s:AsgnAllotRef | s:LinkRef">
	<xsl:variable name="dt" select="s:gettype(@serial)"/>
	<xsl:value-of select="s:seterror(current(),$dt != 'AS' and $dt != 'AL','ID001')"/>
</xsl:template>

<xsl:template match="s:LocationRef">
	<xsl:variable name="dt" select="s:gettype(@serial)"/>
	<xsl:value-of select="s:seterror(current(),$dt != 'LT' and $dt != 'LG' and $dt != 'LA','ID001')"/>
</xsl:template>

</xsl:stylesheet>
