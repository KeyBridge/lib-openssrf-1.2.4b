<?xml version="1.0" ?>

<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:s="urn:us:gov:dod:standard:ssrf:1.2.4.b">

<xsl:output method="text"/>

<xsl:template match="s:Antenna">
	<xsl:value-of select="s:checkcommon(current(),'AN')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:AntMode">
	<xsl:value-of select="s:seterror(current(),not(s:xor(boolean(../s:FreqRange),boolean(s:FreqRange))),'AN003')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:Beamwidth">
	<xsl:value-of select="s:seterror(current(),(not(@minHorz) and @maxHorz) or (not(@minVert) and @maxVert),'GE001')"/>
	<xsl:value-of select="s:seterror(current(),(number(@minHorz) >= number(@maxHorz)) or (number(@minVert) >= number(@maxVert)),'GE002')"/>
	<xsl:value-of select="s:seterror(current(),not(@minHorz) and not(@minVert),'AN002')"/>
</xsl:template> 

<xsl:template match="s:Gain">
	<xsl:value-of select="s:seterror(current(),number(@minGain) >= number(@maxGain),'GE002')"/>
</xsl:template> 

<xsl:template match="s:Pol">
	<xsl:value-of select="s:seterror(current(),((@type = 'L') and not(@angle)) or ((@type != 'L') and @angle),'AN001')"/>
</xsl:template> 

<xsl:template match="s:Rotation">
	<xsl:value-of select="s:seterror(current(),not(@minRate) and @maxRate,'GE001')"/>
	<xsl:value-of select="s:seterror(current(),number(@minRate) > number(@maxRate),'GE002')"/>
</xsl:template> 

</xsl:stylesheet>
