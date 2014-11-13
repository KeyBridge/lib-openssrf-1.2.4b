<?xml version="1.0" ?>

<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:s="urn:us:gov:dod:standard:ssrf:1.2.4.b">

<xsl:output method="text"/>

<xsl:template match="s:TxRx">
	<xsl:value-of select="s:checkcommon(current(),'TR')"/>
	<xsl:value-of select="s:seterror(current(),s:FreqTolerance and */s:FreqTolerance,'TR003')"/>
	<xsl:value-of select="s:seterror(current(),s:SignalTuning and *//s:SignalTuning,'TR004')"/>
	<xsl:value-of select="s:seterror(current(),not(s:SignalDescrRef) and not(.//s:SignalTuning),'TR004')"/>
	<xsl:value-of select="s:seterror(current(),s:Receiver/s:IFreq and s:TxRxMode/s:RxMode/s:IFreq,'TR002')"/>
	<xsl:value-of select="s:seterror(current(),(s:Receiver or s:TxRxMode/s:RxMode) and not(s:SignalDescrRef) and not(*//s:IFreq),'TR002')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:SignalDescr">
	<xsl:value-of select="s:checkcommon(current(),'SD')"/>
	<xsl:value-of select="s:seterror(current(),s:FreqTolerance and */s:FreqTolerance,'TR003')"/>
	<xsl:value-of select="s:seterror(current(),(s:SignalTuning and *//s:SignalTuning) or not(.//s:SignalTuning),'TR004')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:Transmitter | s:SignalTx">
	<xsl:value-of select="s:seterror(current(),not(s:SignalTuning) and not(../s:TxRxMode//s:SignalTuning) and not(../s:SignalTuning) and not(../s:SignalDescrRef),'TR004')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:Receiver | s:SignalRx">
	<xsl:value-of select="s:seterror(current(),not(s:SignalTuning) and not(../s:TxRxMode//s:SignalTuning) and not(../s:SignalTuning) and not(../s:SignalDescrRef),'TR004')"/>
	<xsl:apply-templates/>	
</xsl:template> 

<xsl:template match="s:TxRxMode">
	<xsl:value-of select="s:seterror(current(),s:SignalTuning and */s:SignalTuning,'TR004')"/>
	<xsl:apply-templates/>
</xsl:template> 

<xsl:template match="s:TxMode">
	<xsl:value-of select="s:seterror(current(),not(s:SignalTuning) and not(../..//s:SignalTuning),'TR004')"/>
	<xsl:value-of select="s:seterror(current(),s:SubcarrierTone and not(@numSideTones),'TR006')"/>
	<xsl:value-of select="s:seterror(current(),s:SubcarrierFreq and not(@numSidecarriers),'TR007')"/>
	<xsl:apply-templates/>	
</xsl:template> 

<xsl:template match="s:RxMode">
	<xsl:apply-templates/>	
</xsl:template> 

<xsl:template match="s:Baseband">
	<xsl:value-of select="s:seterror(current(),number(@minModFreq) >= number(@maxModFreq),'GE002')"/>
</xsl:template>

<xsl:template match="s:Modulation">
	<xsl:value-of select="s:seterror(current(),(@digitalMod) and not(s:DigitalFormat),'TR001')"/>
	<xsl:apply-templates/>	
</xsl:template> 

<xsl:template match="s:PPM">
	<xsl:value-of select="s:seterror(current(),number(@minPPS) >= number(@maxPPS),'GE002')"/>
</xsl:template> 

<xsl:template match="s:Power">
	<xsl:value-of select="s:seterror(current(),number(@minPower) >= number(@maxPower),'GE002')"/>
</xsl:template> 

<xsl:template match="s:Pulse">
	<xsl:value-of select="s:seterror(current(),(not(@minPRR) and @maxPRR) or (not(@minPD) and @maxPD),'GE001')"/>
	<xsl:value-of select="s:seterror(current(),(number(@minPRR) >= number(@maxPRR)) or (number(@minPD) >= number(@maxPD)),'GE002')"/>
	<xsl:apply-templates/>	
</xsl:template> 

<xsl:template match="s:PulseAvgCycle">
	<xsl:value-of select="s:seterror(current(),(not(@minDutyCycle) and @maxDutyCycle) or (not(@minAvgPower) and @maxAvgPower),'GE001')"/>
	<xsl:value-of select="s:seterror(current(),(number(@minDutyCycle) >= number(@maxDutyCycle)) or (number(@minAvgPower) >= number(@maxAvgPower)),'GE002')"/>
</xsl:template> 

<xsl:template match="s:PulseForm">
	<xsl:value-of select="s:seterror(current(),(not(@minRiseTime) and @maxRiseTime) or (not(@minFallTime) and @maxFallTime),'GE001')"/>
	<xsl:value-of select="s:seterror(current(),(number(@minRiseTime) >= number(@maxRiseTime)) or (number(@minFallTime) >= number(@maxFallTime)),'GE002')"/>
</xsl:template> 

<xsl:template match="s:Sensitivity">
	<xsl:value-of select="s:seterror(current(),s:xor(boolean(@level),boolean(s:SensitivityCriterion)),'TR005')"/>
</xsl:template>

<xsl:template match="s:SpreadSpectrumPulse">
	<xsl:value-of select="s:seterror(current(),not(@minWidth) and @maxWidth,'GE001')"/>
	<xsl:value-of select="s:seterror(current(),number(@minWidth) >= number(@maxWidth),'GE002')"/>
</xsl:template> 

<xsl:template match="s:SpreadSpectrumSweep">
	<xsl:value-of select="s:seterror(current(),(not(@minFreq) and @maxFreq) or (not(@minTime) and @maxTime),'GE001')"/>
	<xsl:value-of select="s:seterror(current(),(number(@minFreq) >= number(@maxFreq)) or (number(@minTime) >= number(@maxTime)),'GE002')"/>
</xsl:template> 

<xsl:template match="s:PulseComp">
	<xsl:value-of select="s:seterror(current(),number(@minPlsCmpRatio) >= number(@maxPlsCmpRatio),'GE002')"/>
</xsl:template>

</xsl:stylesheet>
