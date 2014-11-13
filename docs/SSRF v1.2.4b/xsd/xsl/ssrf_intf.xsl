<?xml version="1.0" ?>

<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:s="urn:us:gov:dod:standard:ssrf:1.2.4.b">

<xsl:output method="text"/>

<xsl:template match="s:IntfReport">
	<xsl:value-of select="s:checkcommon(current(),'IF')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:DetectedIntf">
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:IntfVictim">
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:SourceLinkRef | s:VictimLinkRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'AS','ID001')"/>
</xsl:template>

<xsl:template match="s:IntfMitigation">
	<xsl:value-of select="s:checkcommon(current(),'IM')"/>
	<xsl:value-of select="s:seterror(current(),not(s:Remarks),'IT001')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:IntfReportRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'IF','ID001')"/>
</xsl:template> 

</xsl:stylesheet>

