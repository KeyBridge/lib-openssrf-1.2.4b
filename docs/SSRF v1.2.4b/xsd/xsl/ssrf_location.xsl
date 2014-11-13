<?xml version="1.0" ?>

<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:s="urn:us:gov:dod:standard:ssrf:1.2.4.b">

<xsl:output method="text"/>

<xsl:template match="s:Locationref | s:StationLoc">
	<xsl:value-of select="s:seterror(current(),(s:gettype(@serial) != 'LT') and @radius,'LO006')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:Location">
	<xsl:value-of select="s:checkcommon(current(),'LT')"/>
	<xsl:variable name="dt" select="s:gettype(@serial)"/>
	<xsl:if test="$dt='LT'">
		<xsl:value-of select="s:seterror(current(),boolean(s:BoundingCircle),'LO008')"/>
		<xsl:value-of select="s:seterror(current(),count(s:Point) != 1,'LO002')"/>
		<xsl:value-of select="s:seterror(s:Point[1],s:Point[1]/@idx,'LO004')"/>
	</xsl:if>
	<xsl:if test="$dt='LG'">
		<xsl:value-of select="s:seterror(current(),count(s:Point) &lt; 3,'LO003')"/>
		<xsl:for-each select="s:Point">
			<xsl:value-of select="s:seterror(current(),not(@idx),'LO004')"/>
			<xsl:value-of select="s:seterror(current(),position() != @idx,'LO005')"/>
		</xsl:for-each>
	</xsl:if>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:BoundingCircle">
	<xsl:value-of select="s:seterror(current(),number(@minElev) > number(@maxElev),'GE002')"/>
</xsl:template> 

</xsl:stylesheet>

