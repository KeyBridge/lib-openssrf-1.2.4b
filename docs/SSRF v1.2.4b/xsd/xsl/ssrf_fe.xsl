<?xml version="1.0" ?>

<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:s="urn:us:gov:dod:standard:ssrf:1.2.4.b">

<xsl:output method="text"/>

<xsl:template match="s:ForceElement">
	<xsl:value-of select="s:checkcommon(current(),'FE')"/>
	<xsl:value-of select="s:seterror(current(),@FEType='E' and not(@platform),'FE001')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:FEDeployment">
	<xsl:value-of select="s:checkcommon(current(),'FD')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:Route">
	<xsl:value-of select="s:checkcommon(current(),'RO')"/>
	<xsl:for-each select="s:Point">
		<xsl:value-of select="s:seterror(current(),position() != @idx,'LO005')"/>
	</xsl:for-each>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:RouteRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'RO','ID001')"/>
</xsl:template>

<xsl:template match="s:FERef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'FE','ID001')"/>
</xsl:template>

<xsl:template match="s:IntfFEDeploymentRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'FD','ID001')"/>
</xsl:template>

</xsl:stylesheet>

