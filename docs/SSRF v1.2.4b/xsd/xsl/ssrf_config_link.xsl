<?xml version="1.0" ?>

<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:s="urn:us:gov:dod:standard:ssrf:1.2.4.b">

<xsl:output method="text"/>

<xsl:template match="s:Station">
	<xsl:value-of select="concat('INF|Station|',@name,';')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:StationLoc">
	<xsl:variable name="cat" select="../../s:AsgnType/@category"/>
	<xsl:if test="$cat = 'UHFAMS' or $cat = 'VHFAMS'">
		<xsl:value-of select="s:seterror(current(),not(s:SrvVolume) or not(s:SrvVolume/@height) or (s:SrvVolume/@type='LA'),'AS007')"/>
	</xsl:if>
</xsl:template>

<xsl:template match="s:SrvVolume">
	<xsl:value-of select="s:seterror(current(),@type != 'LT' and @radius,'LO006')"/>
	<xsl:value-of select="s:seterror(current(),@type = 'LT' and not(@radius),'LO007')"/>
</xsl:template>

<xsl:template match="s:Config">
	<xsl:value-of select="concat('INF|Config|',@name,';')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:EIRP">
	<xsl:value-of select="s:seterror(current(),not(@minEIRP) and (name(../..) != 'HostNationConstraints'),'AS004')"/>
	<xsl:value-of select="s:seterror(current(),@minEIRP and (name(../..) = 'HostNationConstraints'),'AS005')"/>
	<xsl:value-of select="s:seterror(current(),(number(@minEIRP) &gt; number(@maxEIRP)) and (name(../..) != 'HostNationConstraints'),'AS006')"/>
</xsl:template> 

<xsl:template match="s:AntModeRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'AN','ID001')"/>
</xsl:template>

<xsl:template match="s:TxRxModeRef | s:SignalDescrModeRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'TR','ID001')"/>
	<xsl:value-of select="s:seterror(current(),(@txMode or @rxMode) and not(@modeName),'ID002')"/>
</xsl:template>

<xsl:template match="s:SignalDescrRef | s:SignalDescrModeRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'SD','ID001')"/>
	<xsl:value-of select="s:seterror(current(),(@txMode or @rxMode) and not(@modeName),'ID002')"/>
</xsl:template>

</xsl:stylesheet>

