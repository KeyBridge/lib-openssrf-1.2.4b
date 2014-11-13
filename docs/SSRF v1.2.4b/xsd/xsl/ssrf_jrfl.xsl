<?xml version="1.0" ?>

<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:s="urn:us:gov:dod:standard:ssrf:1.2.4.b">

<xsl:output method="text"/>

<xsl:template match="s:JRFL">
	<xsl:value-of select="s:checkcommon(current(),'JR')"/>
	<xsl:value-of select="s:seterror(current(),not(s:Project),'JR001')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:JRFLEntry">
	<xsl:value-of select="s:seterror(current(),@IDSF='Y' and @protCode!='T','JR002')"/>
</xsl:template>

<xsl:template match="s:JRFLRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'JR','ID001')"/>
</xsl:template>

</xsl:stylesheet>

