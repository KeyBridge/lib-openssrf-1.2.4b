/* 
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._1_2_4.txrx;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * SpreadSpectrum contains characteristics of systems using spread spectrum
 * techniques.
 * <p>
 * Element of {@link RxMode}, {@link TxMode}
 * <p>
 * Example:
 * <pre>
 * &lt;SpreadSpectrum&gt;
 *   &lt;ChipRate  cls="U"&gt;4000&lt;/ChipRate &gt;
 *   &lt;CodeRate  cls="U"&gt;1987&lt;/CodeRate &gt;
 *   &lt;FreqBlocking  cls="U"&gt;Yes&lt;/FreqBlocking &gt;
 *   &lt;FreqMax  cls="U"&gt;3107.56&lt;/FreqMax &gt;
 *   &lt;FreqMin  cls="U"&gt;2999.753&lt;/FreqMin &gt;
 *   &lt;HopDwell  cls="U"&gt;82.46&lt;/HopDwell &gt;
 *   &lt;HopRate  cls="U"&gt;64&lt;/HopRate &gt;
 *   &lt;InfoDataRate  cls="U"&gt;6400&lt;/InfoDataRate &gt;
 *   &lt;MaxGain cls="U"&gt;87.89&lt;/MaxGain&gt;
 *   &lt;NumFreqsPerHopset  cls="U"&gt;7843&lt;/NumFreqsPerHopset &gt;
 *   &lt;NumHopsets  cls="U"&gt;12&lt;/NumHopsets &gt;
 *   &lt;PulseChirpDurationMin cls="U"&gt;300&lt;/PulseChirpDurationMin&gt;
 *   &lt;PulseChirpDurationMax cls="U"&gt;400&lt;/PulseChirpDurationMax&gt;
 *   &lt;PulseChirpFreqShift cls="U"&gt;47.98&lt;/PulseChirpFreqShift&gt;
 *   &lt;PulseChirpRate cls="U"&gt;800&lt;/PulseChirpRate&gt;
 *   &lt;PulseFreqDev cls="U"&gt;25.1&lt;/PulseFreqDev&gt;
 *   &lt;TimeHopNumSlots  cls="U"&gt;346&lt;/TimeHopNumSlots &gt;
 *   &lt;TimeHopPulsesPerDwell  cls="U"&gt;679&lt;/TimeHopPulsesPerDwell &gt;
 *   &lt;Type  cls="U"&gt;Direct sequence + Frequency hopped&lt;/Type &gt;
 *   &lt;ChipRate  cls="U"&gt;8954&lt;/ChipRate &gt;
 *   &lt;CodeRate  cls="U"&gt;236&lt;/CodeRate &gt;
 *   &lt;FreqBlocking  cls="U"&gt;Yes&lt;/FreqBlocking &gt;
 *   &lt;FreqMax  cls="U"&gt;3107.56&lt;/FreqMax &gt;
 *   &lt;FreqMin  cls="U"&gt;2999.753&lt;/FreqMin &gt;
 *   &lt;HopDwell  cls="U"&gt;79.235&lt;/HopDwell &gt;
 *   &lt;HopRate  cls="U"&gt;5000&lt;/HopRate &gt;
 *   &lt;InfoDataRate  cls="U"&gt;800&lt;/InfoDataRate &gt;
 *   &lt;MaxGain  cls="U"&gt;34&lt;/MaxGain &gt;
 *   &lt;NumFreqsPerHopset  cls="U"&gt;35&lt;/NumFreqsPerHopset &gt;
 *   &lt;NumHopsets  cls="U"&gt;23&lt;/NumHopsets &gt;
 *   &lt;PulseChirpDurationMin cls="U"&gt;100&lt;/PulseChirpDurationMin&gt;
 *   &lt;PulseChirpFreqShift cls="U"&gt;47.98&lt;/PulseChirpFreqShift&gt;
 *   &lt;PulseChirpRate cls="U"&gt;500&lt;/PulseChirpRate&gt;
 *   &lt;PulseFreqDev cls="U"&gt;347&lt;/PulseFreqDev&gt;
 *   &lt;TimeHopNumSlots  cls="U"&gt;890&lt;/TimeHopNumSlots &gt;
 *   &lt;TimeHopPulsesPerDwell  cls="U"&gt;679&lt;/TimeHopPulsesPerDwell &gt;
 *   &lt;Type  cls="U"&gt;Direct sequence + Frequency hopped&lt;/Type &gt;
 * &lt;/SpreadSpectrum&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSpreadSpectrum", propOrder = {
  "freqHopset",
  "spreadSpectrumPulse",
  "spreadSpectrumSweep",
  "timeHop"
})
public class SpreadSpectrum {

  @XmlElement(name = "FreqHopset")
  protected FreqHopset freqHopset;

  @XmlElement(name = "SpreadSpectrumPulse")
  protected List<SpreadSpectrumPulse> spreadSpectrumPulse;

  @XmlElement(name = "SpreadSpectrumSweep")
  protected SpreadSpectrumSweep spreadSpectrumSweep;
  /**
   * TimeHopNumSlots - Number of Time Hop Slots (Optional)
   * <p>
   * The number of time slots.
   * <p>
   * Format is UN(5)
   * <p>
   * Attribute group TimeHop (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TimeHop")
  protected TimeHop timeHop;
  /**
   * cls - Classification (Required)
   * <p>
   * The classification of the current data item. This attribute is REQUIRED on
   * each data item, even if the classification is "U".
   * <p>
   * Format is L:CCL
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "cls")
  protected String cls;
  /**
   * Type - Spread Spectrum Type (Optional)
   * <p>
   * The type of spread spectrum system being used.
   * <p>
   * Format is L:CSS
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "type")
  protected String type;
  /**
   * MaxGain - Spread Spectrum Processing Gain (Optional)
   * <p>
   * The processing gain.
   * <p>
   * Format is SN(6,3) (dB)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "gain")
  protected BigDecimal gain;
  /**
   * In Data Item PulseFreqDev, Enter, for FM pulse radars, the total frequency
   * shift during the pulse width.
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "pulseFreqDev")
  protected BigDecimal pulseFreqDev;
  /**
   * InfoDataRate - Information Data Rate (Optional)
   * <p>
   * The information data rate.
   * <p>
   * Format is UN(10,3) (bits/sec)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "infoDataRate")
  protected BigDecimal infoDataRate;

  @XmlAttribute(name = "chnlSpacing")
  protected BigDecimal chnlSpacing;

  @XmlAttribute(name = "directSequenceBw")
  protected BigDecimal directSequenceBw;

  @XmlAttribute(name = "blockLength")
  protected BigDecimal blockLength;

  @XmlAttribute(name = "dataBlockSize")
  protected BigDecimal dataBlockSize;
  /**
   * CodeRate - Code Rate (Optional)
   * <p>
   * The post encryption number of symbols per bit for a digital data stream.
   * This does not refer to modulation symbols in a format such as quadrature
   * amplitude modulation (QAM).
   * <p>
   * Format is UN(10,3) (symbols/bit)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "codeRate")
  protected BigDecimal codeRate;

  /**
   * Get
   * <p>
   * @return a {@link FreqHopset} instance
   * @since 3.1.0
   */
  public FreqHopset getFreqHopset() {
    return freqHopset;
  }

  /**
   * Set
   * <p>
   * @param value a {@link FreqHopset} instance
   * @since 3.1.0
   */
  public void setFreqHopset(FreqHopset value) {
    this.freqHopset = value;
  }

  public boolean isSetFreqHopset() {
    return (this.freqHopset != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link SpreadSpectrumPulse} instance
   * @since 3.1.0
   */
  public List<SpreadSpectrumPulse> getSpreadSpectrumPulse() {
    if (spreadSpectrumPulse == null) {
      spreadSpectrumPulse = new ArrayList<>();
    }
    return this.spreadSpectrumPulse;
  }

  public boolean isSetSpreadSpectrumPulse() {
    return ((this.spreadSpectrumPulse != null) && (!this.spreadSpectrumPulse.isEmpty()));
  }

  /**
   * Clear the SpreadSpectrumPulse field. This sets the field to null.
   */
  public void unsetSpreadSpectrumPulse() {
    this.spreadSpectrumPulse = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link SpreadSpectrumSweep} instance
   * @since 3.1.0
   */
  public SpreadSpectrumSweep getSpreadSpectrumSweep() {
    return spreadSpectrumSweep;
  }

  /**
   * Set
   * <p>
   * @param value a {@link SpreadSpectrumSweep} instance
   * @since 3.1.0
   */
  public void setSpreadSpectrumSweep(SpreadSpectrumSweep value) {
    this.spreadSpectrumSweep = value;
  }

  public boolean isSetSpreadSpectrumSweep() {
    return (this.spreadSpectrumSweep != null);
  }

  /**
   * Get the number of time slots.
   * <p>
   * @return the TimeHop value in a {@link TimeHop} data type
   * @since 3.1.0
   */
  public TimeHop getTimeHop() {
    return timeHop;
  }

  /**
   * Set the number of time slots.
   * <p>
   * @param value the TimeHop value in a {@link TimeHop} data type
   * @since 3.1.0
   */
  public void setTimeHop(TimeHop value) {
    this.timeHop = value;
  }

  public boolean isSetTimeHop() {
    return (this.timeHop != null);
  }

  /**
   * Get the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getCls() {
    return cls;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setCls(String value) {
    this.cls = value;
  }

  public boolean isSetCls() {
    return (this.cls != null);
  }

  /**
   * Get the type of spread spectrum system being used.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getType() {
    return type;
  }

  /**
   * Set the type of spread spectrum system being used.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setType(String value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Get the processing gain.
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getGain() {
    return gain;
  }

  /**
   * Set the processing gain.
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setGain(BigDecimal value) {
    this.gain = value;
  }

  public boolean isSetGain() {
    return (this.gain != null);
  }

  /**
   * Get In Data Item PulseFreqDev, Enter, for FM pulse radars, the total
   * frequency shift during the pulse width.
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getPulseFreqDev() {
    return pulseFreqDev;
  }

  /**
   * Set In Data Item PulseFreqDev, Enter, for FM pulse radars, the total
   * frequency shift during the pulse width.
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setPulseFreqDev(BigDecimal value) {
    this.pulseFreqDev = value;
  }

  public boolean isSetPulseFreqDev() {
    return (this.pulseFreqDev != null);
  }

  /**
   * Get the information data rate.
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getInfoDataRate() {
    return infoDataRate;
  }

  /**
   * Set the information data rate.
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setInfoDataRate(BigDecimal value) {
    this.infoDataRate = value;
  }

  public boolean isSetInfoDataRate() {
    return (this.infoDataRate != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getChnlSpacing() {
    return chnlSpacing;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setChnlSpacing(BigDecimal value) {
    this.chnlSpacing = value;
  }

  public boolean isSetChnlSpacing() {
    return (this.chnlSpacing != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getDirectSequenceBw() {
    return directSequenceBw;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setDirectSequenceBw(BigDecimal value) {
    this.directSequenceBw = value;
  }

  public boolean isSetDirectSequenceBw() {
    return (this.directSequenceBw != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getBlockLength() {
    return blockLength;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setBlockLength(BigDecimal value) {
    this.blockLength = value;
  }

  public boolean isSetBlockLength() {
    return (this.blockLength != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getDataBlockSize() {
    return dataBlockSize;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setDataBlockSize(BigDecimal value) {
    this.dataBlockSize = value;
  }

  public boolean isSetDataBlockSize() {
    return (this.dataBlockSize != null);
  }

  /**
   * Get the post encryption number of symbols per bit for a digital data
   * stream. This does not refer to modulation symbols in a format such as
   * quadrature amplitude modulation (QAM).
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getCodeRate() {
    return codeRate;
  }

  /**
   * Set the post encryption number of symbols per bit for a digital data
   * stream. This does not refer to modulation symbols in a format such as
   * quadrature amplitude modulation (QAM).
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setCodeRate(BigDecimal value) {
    this.codeRate = value;
  }

  public boolean isSetCodeRate() {
    return (this.codeRate != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link FreqHopset}
   * @return The current SpreadSpectrum object instance
   * @since 3.1.0
   */
  public SpreadSpectrum withFreqHopset(FreqHopset value) {
    setFreqHopset(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link SpreadSpectrumPulse...}
   * @return The current SpreadSpectrum object instance
   * @since 3.1.0
   */
  public SpreadSpectrum withSpreadSpectrumPulse(SpreadSpectrumPulse... values) {
    if (values != null) {
      getSpreadSpectrumPulse().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link SpreadSpectrumPulse} instances
   * @return The current SpreadSpectrum object instance
   * @since 3.1.0
   */
  public SpreadSpectrum withSpreadSpectrumPulse(Collection<SpreadSpectrumPulse> values) {
    if (values != null) {
      getSpreadSpectrumPulse().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link SpreadSpectrumSweep}
   * @return The current SpreadSpectrum object instance
   * @since 3.1.0
   */
  public SpreadSpectrum withSpreadSpectrumSweep(SpreadSpectrumSweep value) {
    setSpreadSpectrumSweep(value);
    return this;
  }

  /**
   * Set the number of time slots.
   * <p>
   * @param value An instances of type {@link TimeHop}
   * @return The current SpreadSpectrum object instance
   * @since 3.1.0
   */
  public SpreadSpectrum withTimeHop(TimeHop value) {
    setTimeHop(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SpreadSpectrum object instance
   * @since 3.1.0
   */
  public SpreadSpectrum withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set the type of spread spectrum system being used.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SpreadSpectrum object instance
   * @since 3.1.0
   */
  public SpreadSpectrum withType(String value) {
    setType(value);
    return this;
  }

  /**
   * Set the processing gain.
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current SpreadSpectrum object instance
   * @since 3.1.0
   */
  public SpreadSpectrum withGain(BigDecimal value) {
    setGain(value);
    return this;
  }

  /**
   * Set In Data Item PulseFreqDev, Enter, for FM pulse radars, the total
   * frequency shift during the pulse width.
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current SpreadSpectrum object instance
   * @since 3.1.0
   */
  public SpreadSpectrum withPulseFreqDev(BigDecimal value) {
    setPulseFreqDev(value);
    return this;
  }

  /**
   * Set the information data rate.
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current SpreadSpectrum object instance
   * @since 3.1.0
   */
  public SpreadSpectrum withInfoDataRate(BigDecimal value) {
    setInfoDataRate(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current SpreadSpectrum object instance
   * @since 3.1.0
   */
  public SpreadSpectrum withChnlSpacing(BigDecimal value) {
    setChnlSpacing(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current SpreadSpectrum object instance
   * @since 3.1.0
   */
  public SpreadSpectrum withDirectSequenceBw(BigDecimal value) {
    setDirectSequenceBw(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current SpreadSpectrum object instance
   * @since 3.1.0
   */
  public SpreadSpectrum withBlockLength(BigDecimal value) {
    setBlockLength(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current SpreadSpectrum object instance
   * @since 3.1.0
   */
  public SpreadSpectrum withDataBlockSize(BigDecimal value) {
    setDataBlockSize(value);
    return this;
  }

  /**
   * Set the post encryption number of symbols per bit for a digital data
   * stream. This does not refer to modulation symbols in a format such as
   * quadrature amplitude modulation (QAM).
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current SpreadSpectrum object instance
   * @since 3.1.0
   */
  public SpreadSpectrum withCodeRate(BigDecimal value) {
    setCodeRate(value);
    return this;
  }

  /**
   * Get a string representation of this SpreadSpectrum instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SpreadSpectrum {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SpreadSpectrum} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
