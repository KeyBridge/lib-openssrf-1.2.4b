<?xml version="1.0" ?>

<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:s="urn:us:gov:dod:standard:ssrf:1.2.4.b">

<xsl:output method="text"/>

<xsl:template match="s:TOA">
	<xsl:value-of select="s:checkcommon(current(),'TA')"/>
	<xsl:apply-templates/>
</xsl:template>

<xsl:template match="s:FreqBand">
	<xsl:apply-templates/>
</xsl:template>

<xsl:template match="s:AllocApp">
	<xsl:apply-templates/>
</xsl:template>

<xsl:template match="s:CoordStd">
	<xsl:apply-templates/>
</xsl:template>

<xsl:template match="s:CoordSpec">
	<xsl:apply-templates/>
</xsl:template>

<xsl:template match="s:AntStdRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'RA','ID001')"/>
</xsl:template>

<xsl:template match="s:BandAppRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'RP','ID001')"/>
</xsl:template>

<xsl:template match="s:BandUserRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'RU','ID001')"/>
</xsl:template>

<xsl:template match="s:ChnlPlanRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'RH','ID001')"/>
</xsl:template>

<xsl:template match="s:CoordStdRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'RC','ID001')"/>
</xsl:template>

<xsl:template match="s:EmsMaskStdRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'RM','ID001')"/>
</xsl:template>

<xsl:template match="s:EmsStdRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'RT','ID001')"/>
</xsl:template>

<!-- [SMADEF 1.2.4.a] accepted validation correction for RxStd. -->
<xsl:template match="s:RxStdRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'RR','ID001')"/>
</xsl:template>


<xsl:template match="s:XAxis | s:YAxis">
	<xsl:value-of select="s:seterror(current(),number(@minAxis) >= number(@maxAxis),'GE002')"/>
</xsl:template> 

<xsl:template match="s:XAxis | s:YAxis">
	<xsl:value-of select="s:seterror(current(),not(@minAxis) and @maxAxis,'GE001')"/>
</xsl:template> 

</xsl:stylesheet>
