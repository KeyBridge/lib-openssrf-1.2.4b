<?xml version="1.0" ?>

<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:s="urn:us:gov:dod:standard:ssrf:1.2.4.b">

<xsl:output method="text"/>

<xsl:template match="s:AsgnAllot">
	<xsl:value-of select="s:checkcommon(current(),'AS')"/>
	<!-- [SMADEF 1.2.4.a] accepted validation changes for FnctID. -->
	<xsl:variable name="fnctid1" select="substring(s:FnctID[1],1,6)" />
	<xsl:for-each select="s:FnctID">
		<xsl:value-of select="s:seterror(current(),substring(current(),1,6) != $fnctid1,'AS008')"/>
	</xsl:for-each>
	<xsl:apply-templates/>
</xsl:template>

<xsl:template match="s:AsgnType">
	<xsl:value-of select="s:seterror(current(),(@category='UHFMAS') and not(@resource),'AS001')"/>
</xsl:template>

<xsl:template match="s:HostNominate">
	<!-- [SMADEF 1.2.4.a] accepted validation changes for HostNominate -->
	<xsl:if test="@authority='U' or @authority='A'">
    <xsl:for-each select="../s:Link">
      <xsl:value-of select="s:seterror(current(),not(s:Tuning/s:FreqSingle),'AS002')"/>
    </xsl:for-each>
  </xsl:if>
</xsl:template>

<xsl:template match="s:Notification">
	<xsl:value-of select="s:checkcommon(current(),'NT')"/>
	<xsl:apply-templates/>
</xsl:template>

</xsl:stylesheet>
