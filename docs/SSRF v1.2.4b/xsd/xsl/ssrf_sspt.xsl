<?xml version="1.0" ?>

<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:s="urn:us:gov:dod:standard:ssrf:1.2.4.b">

<xsl:output method="text"/>

<xsl:template match="s:SSRequest">
	<xsl:value-of select="s:checkcommon(current(),'SR')"/>
	<xsl:value-of select="s:seterror(current(),(number(@stage) &lt; 4) and not(s:Stage),'SS001')"/>
	<xsl:value-of select="s:seterror(current(),(number(@stage) &lt; 4) and not(s:Stage4Srv),'SS002')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:SSReply">
	<xsl:value-of select="s:checkcommon(current(),'HD')"/>
	<xsl:value-of select="s:seterror(current(),(@status = 'C') and not(s:HostNationConstraints or s:Remarks),'SS004')"/>
	<xsl:apply-templates/>
</xsl:template>

<xsl:template match="s:HostNationConstraints">
	<xsl:value-of select="s:seterror(current(),not(./*),'SS003')"/>
</xsl:template>

<xsl:template match="s:OpClearanceRequest">
	<xsl:value-of select="s:checkcommon(current(),'CR')"/>
	<xsl:value-of select="s:seterror(current(),not(s:Project),'SS007')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:OpClearance">
	<xsl:value-of select="s:checkcommon(current(),'CL')"/>
	<xsl:value-of select="s:seterror(current(),not(s:ContactOrgRef[@type='AUTH']),'SS005')"/>
	<xsl:value-of select="s:seterror(current(),(@status='N' or @status='C') and not(s:Remarks),'SS006')"/>
	<xsl:apply-templates/>
</xsl:template>

<xsl:template match="s:SSRequestRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'SR','ID001')"/>
</xsl:template>

<xsl:template match="s:OpClearanceRequestRef">
	<xsl:value-of select="s:seterror(current(),s:gettype(@serial) != 'CR','ID001')"/>
</xsl:template>

</xsl:stylesheet>

