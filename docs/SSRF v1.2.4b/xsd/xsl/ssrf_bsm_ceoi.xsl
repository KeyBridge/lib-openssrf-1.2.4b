<?xml version="1.0" ?>

<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:s="urn:us:gov:dod:standard:ssrf:1.2.4.b">

<xsl:output method="text"/>

<xsl:template match="s:BSMPlan">
	<xsl:value-of select="s:checkcommon(current(),'BS')"/>
	<xsl:value-of select="s:seterror(current(),not(s:Project),'BS001')"/>
	<xsl:value-of select="s:seterror(current(),not(s:ExtRef),'BS002')"/>
	<xsl:value-of select="s:seterror(current(),not(s:ContactOrgRef[@type='AUTH'] and s:ContactOrgRef[@type='SM']),'BS003')"/>
	<xsl:value-of select="s:seterror(current(),not(s:Responsibilities[@level='SELF']),'BS005')"/>
	<xsl:variable name="nb1" select="count(s:Responsibilities[@level='PEER'])"/>
	<xsl:variable name="nb2" select="count(s:Responsibilities[@level='SELF'])"/>
	<xsl:variable name="nb3" select="count(s:Responsibilities[@level='SUB'])"/>
	<xsl:variable name="nb4" select="count(s:Responsibilities[@level='SUP'])"/>
	<xsl:value-of select="s:seterror(current(),$nb1>1 or $nb2>1 or $nb3>1 or $nb4>1,'BS004')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:BSMPlanRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'BS','ID001')"/>
</xsl:template>

<xsl:template match="s:CEOI">
	<xsl:value-of select="s:checkcommon(current(),'CE')"/>
	<xsl:value-of select="s:seterror(current(),not(s:Project),'CE001')"/>
	<xsl:value-of select="s:seterror(current(),not(s:ExtRef[@type='DOCU']),'CE002')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:NetRef">
	<xsl:variable name="v1" select="@callSignGroup"/>
	<xsl:variable name="v2" select="@callWordGroup"/>
	<xsl:variable name="v3" select="@extractGroup"/>
	<xsl:variable name="v4" select="@freqGroup"/>
	<xsl:variable name="v5" select="@freqSepGroup"/>
	<xsl:if test="$v1">
		<xsl:value-of select="s:seterror(current(),not(..//s:Share[@type='CALLSIGN' and @name=$v1]),'CE008')"/>
	</xsl:if>
	<xsl:if test="$v2">
		<xsl:value-of select="s:seterror(current(),not(..//s:Share[@type='CALLWORD' and @name=$v2]),'CE009')"/>
	</xsl:if>
	<xsl:if test="$v3">
		<xsl:value-of select="s:seterror(current(),not(..//s:Share[@type='EXTRACT' and @name=$v3]),'CE010')"/>
	</xsl:if>
	<xsl:if test="$v4">
		<xsl:value-of select="s:seterror(current(),not(..//s:Share[@type='FREQ' and @name=$v4]),'CE0011')"/>
	</xsl:if>
	<xsl:if test="$v5">
		<xsl:value-of select="s:seterror(current(),not(..//s:Share[@type='FREQSEP' and @name=$v5]),'CE012')"/>
	</xsl:if>
</xsl:template> 

<xsl:template match="s:Share">
	<xsl:value-of select="s:seterror(current(),s:xor(boolean(@type),@desiredSep and @minSep),'CE0013')"/>
	<xsl:value-of select="s:seterror(current(),number(@minSep) > number(@desiredSep),'CE0014')"/>
</xsl:template>

<xsl:template match="s:Dictionary">
	<xsl:value-of select="s:checkcommon(current(),'DI')"/>
	<xsl:variable name="dt" select="@type"/>
	<xsl:value-of select="s:seterror(current(),($dt='FRQGP' or $dt='FQSGP' or $dt='SHRGP') and not(s:Group),'CE003')"/>
	<xsl:for-each select=".//s:Entry">
		<xsl:value-of select="s:seterror(current(),$dt='PYRO' and not(matches(text(),'AC|AP|GC|GP|GSS|RC|RP|RSS|VSS|WC|WP|YSS')),'CE004')"/>
		<xsl:value-of select="s:seterror(current(),$dt='PYDEF' and not(matches(text(),'AIR|BREAK|CEASE|CHALLENGE|COMMENCE|LIFT|NO|OBJ|REPLY|REQUEST')),'CE005')"/>
		<xsl:value-of select="s:seterror(current(),$dt='SMOKE' and not(matches(text(),'G|R|V|W|Y')),'CE006')"/>
		<xsl:value-of select="s:seterror(current(),$dt='SMDEF' and not(matches(text(),'DANGER|NO|REAL|SAFE|TARGET')),'CE007')"/>
	</xsl:for-each>
	<xsl:apply-templates/>
</xsl:template> 

</xsl:stylesheet>

