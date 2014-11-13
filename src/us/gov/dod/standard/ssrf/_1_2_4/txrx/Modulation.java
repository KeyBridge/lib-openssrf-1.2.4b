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
import java.math.BigInteger;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.Memo;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListMO;

/**
 * Modulation
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TModulation", propOrder = {
  "am",
  "fm",
  "suppression",
  "digitalFormat",
  "ppm",
  "modDetails"
})
public class Modulation {

  /**
   * AMIdx - Amplitude Modulation Index (Optional)
   * <p>
   * The amplitude modulation index, which is a unitless value for an amplitude
   * modulation signal derived by dividing the peak modulating voltage by the
   * peak carrier voltage. The modulation index should always be %gt; 0 and %lt;
   * 1. If = 0, the resultant modulated waveform is a constant keyed carrier
   * without a modulating signal. If %gt; 1, the envelope is over modulated and
   * distorted. A typical value is 0.6
   * <p>
   * Format is UN(5,3)
   * <p>
   * Attribute group AM (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AM")
  protected Modulation.AM am;
  /**
   * FMDeviationCode - Peak Frequency Deviation (Optional)
   * <p>
   * The code that indicates the type of Root Mean Square (RMS) deviation
   * (multichannel or per-channel).
   * <p>
   * Format is L:CFM
   * <p>
   * Attribute group FM (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FM")
  protected Modulation.FM fm;
  /**
   * CarrierSuppression - Level of Carrier Suppression (Optional)
   * <p>
   * The amount of reduction of the signals carrier, as compared to a non
   * attenuated signal carrier.
   * <p>
   * Format is UN(6,3) (dB)
   * <p>
   * Attribute group Suppression (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Suppression")
  protected Modulation.Suppression suppression;

  @XmlElement(name = "DigitalFormat")
  protected DigitalFormat digitalFormat;

  @XmlElement(name = "PPM")
  protected Modulation.PPM ppm;

  @XmlElement(name = "ModDetails")
  protected Memo modDetails;
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
   * MaxDevRatio - Maximum Deviation Ratio (Optional)
   * <p>
   * The deviation ratio data applicable to frequency- or phase-modulation
   * equipment. For FM systems the deviation ratio is directly proportional to
   * the frequency deviation of the variance of the modulator. In Data Item PM
   * systems the deviation ratio is tied to both the amplitude of the modulating
   * signal and phase deviation constant of the modulator. For example, for an
   * FM system a deviation ratio of 1 indicates that a 3 kHz input frequency
   * will cause a peak instantaneous frequency deviation of 3 kHz. a deviation
   * ratio of 3 is the result of a 9 kHz deviation of the emission when
   * modulated with a 3 kHz signal. Do not use this item for amplitude or pulse
   * modulated systems.
   * <p>
   * Format is UN(5,3)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "devRatio")
  protected BigDecimal devRatio;
  /**
   * DigitalModType - Digital Modulaton Type (Optional)
   * <p>
   * The type of digital modulation.
   * <p>
   * Format is L:CMO
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "digitalMod")
  protected ListMO digitalMod;
  /**
   * MaxBitRate - Maximum Bit Rate (Optional)
   * <p>
   * The maximum bit rate in kilobits per second applicable to digital
   * communications systems. For spread spectrum transmissions enter the bit
   * rate after error-correction coding. Do not enter the spectrum-spreading
   * clock or chip rate.
   * <p>
   * Format is UN(10,3) (kbit/sec)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "maxBitRate")
  protected BigInteger maxBitRate;

  @XmlAttribute(name = "numBsbChnl")
  protected BigInteger numBsbChnl;

  public Modulation.AM getAM() {
    return am;
  }

  /**
   * Set the amplitude modulation index, which is a unitless value for an
   * amplitude modulation signal derived by dividing the peak modulating voltage
   * by the peak carrier voltage. The modulation index should always be > 0 and
   * < 1. If = 0, the resultant modulated waveform is a constant keyed carrier
   * without a modulating signal. If > 1, the envelope is over modulated and
   * distorted. A typical value is 0.6
   * <p>
   * @param value a {@link Modulation} instance
   * @since 3.1.0
   */
  public void setAM(Modulation.AM value) {
    this.am = value;
  }

  public boolean isSetAM() {
    return (this.am != null);
  }

  public Modulation.FM getFM() {
    return fm;
  }

  /**
   * Set the code that indicates the type of Root Mean Square (RMS) deviation
   * (multichannel or per-channel).
   * <p>
   * @param value a {@link Modulation} instance
   * @since 3.1.0
   */
  public void setFM(Modulation.FM value) {
    this.fm = value;
  }

  public boolean isSetFM() {
    return (this.fm != null);
  }

  public Modulation.Suppression getSuppression() {
    return suppression;
  }

  /**
   * Set the amount of reduction of the signals carrier, as compared to a non
   * attenuated signal carrier.
   * <p>
   * @param value a {@link Modulation} instance
   * @since 3.1.0
   */
  public void setSuppression(Modulation.Suppression value) {
    this.suppression = value;
  }

  public boolean isSetSuppression() {
    return (this.suppression != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link DigitalFormat} instance
   * @since 3.1.0
   */
  public DigitalFormat getDigitalFormat() {
    return digitalFormat;
  }

  /**
   * Set
   * <p>
   * @param value a {@link DigitalFormat} instance
   * @since 3.1.0
   */
  public void setDigitalFormat(DigitalFormat value) {
    this.digitalFormat = value;
  }

  public boolean isSetDigitalFormat() {
    return (this.digitalFormat != null);
  }

  public Modulation.PPM getPPM() {
    return ppm;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Modulation} instance
   * @since 3.1.0
   */
  public void setPPM(Modulation.PPM value) {
    this.ppm = value;
  }

  public boolean isSetPPM() {
    return (this.ppm != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Memo} instance
   * @since 3.1.0
   */
  public Memo getModDetails() {
    return modDetails;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Memo} instance
   * @since 3.1.0
   */
  public void setModDetails(Memo value) {
    this.modDetails = value;
  }

  public boolean isSetModDetails() {
    return (this.modDetails != null);
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
   * Get the deviation ratio data applicable to frequency- or phase-modulation
   * equipment. For FM systems the deviation ratio is directly proportional to
   * the frequency deviation of the variance of the modulator. In Data Item PM
   * systems the deviation ratio is tied to both the amplitude of the modulating
   * signal and phase deviation constant of the modulator. For example, for an
   * FM system a deviation ratio of 1 indicates that a 3 kHz input frequency
   * will cause a peak instantaneous frequency deviation of 3 kHz. a deviation
   * ratio of 3 is the result of a 9 kHz deviation of the emission when
   * modulated with a 3 kHz signal. Do not use this item for amplitude or pulse
   * modulated systems.
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getDevRatio() {
    return devRatio;
  }

  /**
   * Set the deviation ratio data applicable to frequency- or phase-modulation
   * equipment. For FM systems the deviation ratio is directly proportional to
   * the frequency deviation of the variance of the modulator. In Data Item PM
   * systems the deviation ratio is tied to both the amplitude of the modulating
   * signal and phase deviation constant of the modulator. For example, for an
   * FM system a deviation ratio of 1 indicates that a 3 kHz input frequency
   * will cause a peak instantaneous frequency deviation of 3 kHz. a deviation
   * ratio of 3 is the result of a 9 kHz deviation of the emission when
   * modulated with a 3 kHz signal. Do not use this item for amplitude or pulse
   * modulated systems.
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setDevRatio(BigDecimal value) {
    this.devRatio = value;
  }

  public boolean isSetDevRatio() {
    return (this.devRatio != null);
  }

  /**
   * Get the type of digital modulation.
   * <p>
   * @return a {@link ListMO} instance
   * @since 3.1.0
   */
  public ListMO getDigitalMod() {
    return digitalMod;
  }

  /**
   * Set the type of digital modulation.
   * <p>
   * @param value a {@link ListMO} instance
   * @since 3.1.0
   */
  public void setDigitalMod(ListMO value) {
    this.digitalMod = value;
  }

  public boolean isSetDigitalMod() {
    return (this.digitalMod != null);
  }

  /**
   * Get the maximum bit rate in kilobits per second applicable to digital
   * communications systems. For spread spectrum transmissions enter the bit
   * rate after error-correction coding. Do not enter the spectrum-spreading
   * clock or chip rate.
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getMaxBitRate() {
    return maxBitRate;
  }

  /**
   * Set the maximum bit rate in kilobits per second applicable to digital
   * communications systems. For spread spectrum transmissions enter the bit
   * rate after error-correction coding. Do not enter the spectrum-spreading
   * clock or chip rate.
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setMaxBitRate(BigInteger value) {
    this.maxBitRate = value;
  }

  public boolean isSetMaxBitRate() {
    return (this.maxBitRate != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getNumBsbChnl() {
    return numBsbChnl;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setNumBsbChnl(BigInteger value) {
    this.numBsbChnl = value;
  }

  public boolean isSetNumBsbChnl() {
    return (this.numBsbChnl != null);
  }

  /**
   * Set the amplitude modulation index, which is a unitless value for an
   * amplitude modulation signal derived by dividing the peak modulating voltage
   * by the peak carrier voltage. The modulation index should always be > 0 and
   * < 1. If = 0, the resultant modulated waveform is a constant keyed carrier
   * without a modulating signal. If > 1, the envelope is over modulated and
   * distorted. A typical value is 0.6
   * <p>
   * @param value An instances of type {@link Modulation.AM}
   * @return The current Modulation object instance
   * @since 3.1.0
   */
  public Modulation withAM(Modulation.AM value) {
    setAM(value);
    return this;
  }

  /**
   * Set the code that indicates the type of Root Mean Square (RMS) deviation
   * (multichannel or per-channel).
   * <p>
   * @param value An instances of type {@link Modulation.FM}
   * @return The current Modulation object instance
   * @since 3.1.0
   */
  public Modulation withFM(Modulation.FM value) {
    setFM(value);
    return this;
  }

  /**
   * Set the amount of reduction of the signals carrier, as compared to a non
   * attenuated signal carrier.
   * <p>
   * @param value An instances of type {@link Modulation.Suppression}
   * @return The current Modulation object instance
   * @since 3.1.0
   */
  public Modulation withSuppression(Modulation.Suppression value) {
    setSuppression(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link DigitalFormat}
   * @return The current Modulation object instance
   * @since 3.1.0
   */
  public Modulation withDigitalFormat(DigitalFormat value) {
    setDigitalFormat(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Modulation.PPM}
   * @return The current Modulation object instance
   * @since 3.1.0
   */
  public Modulation withPPM(Modulation.PPM value) {
    setPPM(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Memo}
   * @return The current Modulation object instance
   * @since 3.1.0
   */
  public Modulation withModDetails(Memo value) {
    setModDetails(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Modulation object instance
   * @since 3.1.0
   */
  public Modulation withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set the deviation ratio data applicable to frequency- or phase-modulation
   * equipment. For FM systems the deviation ratio is directly proportional to
   * the frequency deviation of the variance of the modulator. In Data Item PM
   * systems the deviation ratio is tied to both the amplitude of the modulating
   * signal and phase deviation constant of the modulator. For example, for an
   * FM system a deviation ratio of 1 indicates that a 3 kHz input frequency
   * will cause a peak instantaneous frequency deviation of 3 kHz. a deviation
   * ratio of 3 is the result of a 9 kHz deviation of the emission when
   * modulated with a 3 kHz signal. Do not use this item for amplitude or pulse
   * modulated systems.
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Modulation object instance
   * @since 3.1.0
   */
  public Modulation withDevRatio(BigDecimal value) {
    setDevRatio(value);
    return this;
  }

  /**
   * Set the type of digital modulation.
   * <p>
   * @param value An instances of type {@link ListMO}
   * @return The current Modulation object instance
   * @since 3.1.0
   */
  public Modulation withDigitalMod(ListMO value) {
    setDigitalMod(value);
    return this;
  }

  /**
   * Set the maximum bit rate in kilobits per second applicable to digital
   * communications systems. For spread spectrum transmissions enter the bit
   * rate after error-correction coding. Do not enter the spectrum-spreading
   * clock or chip rate.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Modulation object instance
   * @since 3.1.0
   */
  public Modulation withMaxBitRate(BigInteger value) {
    setMaxBitRate(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Modulation object instance
   * @since 3.1.0
   */
  public Modulation withNumBsbChnl(BigInteger value) {
    setNumBsbChnl(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class AM {

    /**
     * cls - Classification (Required)
     * <p>
     * The classification of the current data item. This attribute is REQUIRED
     * on each data item, even if the classification is "U".
     * <p>
     * Format is L:CCL
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "cls")
    protected String cls;
    /**
     * AMIdx - Amplitude Modulation Index (Optional)
     * <p>
     * The amplitude modulation index, which is a unitless value for an
     * amplitude modulation signal derived by dividing the peak modulating
     * voltage by the peak carrier voltage. The modulation index should always
     * be %gt; 0 and %lt; 1. If = 0, the resultant modulated waveform is a
     * constant keyed carrier without a modulating signal. If %gt; 1, the
     * envelope is over modulated and distorted. A typical value is 0.6
     * <p>
     * Format is UN(5,3)
     * <p>
     * Attribute group AM (Optional)
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "idx")
    protected BigDecimal idx;
    /**
     * AMRMSIdx - RMS Amplitude Modulation Index (Optional)
     * <p>
     * The RMS modulation index when analog or phase modulation is used and the
     * baseband consists of FDM channels or multiple subcarrier signals. The RMS
     * Amplitude Modulation Index is a unitless value for an amplitude
     * modulation signal derived by dividing the RMS peak modulating voltage by
     * the RMS peak carrier voltage.
     * <p>
     * Format is UN(5,3)
     * <p>
     * Attribute group AM (Optional)
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "RMSIdx")
    protected BigDecimal rmsIdx;

    /**
     * Get the classification of the current data item. This attribute is
     * REQUIRED on each data item, even if the classification is "U".
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getCls() {
      return cls;
    }

    /**
     * Set the classification of the current data item. This attribute is
     * REQUIRED on each data item, even if the classification is "U".
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
     * Get the amplitude modulation index, which is a unitless value for an
     * amplitude modulation signal derived by dividing the peak modulating
     * voltage by the peak carrier voltage. The modulation index should always
     * be > 0 and < 1. If = 0, the resultant modulated waveform is a constant
     * keyed carrier without a modulating signal. If > 1, the envelope is over
     * modulated and distorted. A typical value is 0.6
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getIdx() {
      return idx;
    }

    /**
     * Set the amplitude modulation index, which is a unitless value for an
     * amplitude modulation signal derived by dividing the peak modulating
     * voltage by the peak carrier voltage. The modulation index should always
     * be > 0 and < 1. If = 0, the resultant modulated waveform is a constant
     * keyed carrier without a modulating signal. If > 1, the envelope is over
     * modulated and distorted. A typical value is 0.6
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setIdx(BigDecimal value) {
      this.idx = value;
    }

    public boolean isSetIdx() {
      return (this.idx != null);
    }

    /**
     * Get the RMS modulation index when analog or phase modulation is used and
     * the baseband consists of FDM channels or multiple subcarrier signals. The
     * RMS Amplitude Modulation Index is a unitless value for an amplitude
     * modulation signal derived by dividing the RMS peak modulating voltage by
     * the RMS peak carrier voltage.
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getRMSIdx() {
      return rmsIdx;
    }

    /**
     * Set the RMS modulation index when analog or phase modulation is used and
     * the baseband consists of FDM channels or multiple subcarrier signals. The
     * RMS Amplitude Modulation Index is a unitless value for an amplitude
     * modulation signal derived by dividing the RMS peak modulating voltage by
     * the RMS peak carrier voltage.
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setRMSIdx(BigDecimal value) {
      this.rmsIdx = value;
    }

    public boolean isSetRMSIdx() {
      return (this.rmsIdx != null);
    }

    public Modulation.AM withCls(String value) {
      setCls(value);
      return this;
    }

    public Modulation.AM withIdx(BigDecimal value) {
      setIdx(value);
      return this;
    }

    public Modulation.AM withRMSIdx(BigDecimal value) {
      setRMSIdx(value);
      return this;
    }

  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class FM {

    /**
     * cls - Classification (Required)
     * <p>
     * The classification of the current data item. This attribute is REQUIRED
     * on each data item, even if the classification is "U".
     * <p>
     * Format is L:CCL
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "cls")
    protected String cls;
    /**
     * FMPeakFreqDev - Peak Frequency Deviation (Optional)
     * <p>
     * The peak frequency deviation when analog modulation is employed.
     * <p>
     * Format is UN(16,9) [0..1E9] (MHz)
     * <p>
     * Attribute group FM (Optional)
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "peakFreqDev")
    protected BigDecimal peakFreqDev;
    /**
     * FMRmsFreqDev - RMS Frequency Deviation (Optional)
     * <p>
     * The Root Means Square (RMS) frequency deviation when frequency modulation
     * (FM) is employed and the base band consists of frequency-division
     * multiplexed (FDM) channels or multiple subcarrier signals.
     * <p>
     * Format is UN(16,9) [0..1E9] (MHz)
     * <p>
     * Attribute group FM (Optional)
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "RMSFreqDev")
    protected BigDecimal rmsFreqDev;
    /**
     * FMDeviationCode - Peak Frequency Deviation (Optional)
     * <p>
     * The code that indicates the type of Root Mean Square (RMS) deviation
     * (multichannel or per-channel).
     * <p>
     * Format is L:CFM
     * <p>
     * Attribute group FM (Optional)
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "deviationCode")
    protected BigInteger deviationCode;

    @XmlAttribute(name = "peakIdx")
    protected BigDecimal peakIdx;

    /**
     * Get the classification of the current data item. This attribute is
     * REQUIRED on each data item, even if the classification is "U".
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getCls() {
      return cls;
    }

    /**
     * Set the classification of the current data item. This attribute is
     * REQUIRED on each data item, even if the classification is "U".
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
     * Get the peak frequency deviation when analog modulation is employed.
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getPeakFreqDev() {
      return peakFreqDev;
    }

    /**
     * Set the peak frequency deviation when analog modulation is employed.
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setPeakFreqDev(BigDecimal value) {
      this.peakFreqDev = value;
    }

    public boolean isSetPeakFreqDev() {
      return (this.peakFreqDev != null);
    }

    /**
     * Get the Root Means Square (RMS) frequency deviation when frequency
     * modulation (FM) is employed and the base band consists of
     * frequency-division multiplexed (FDM) channels or multiple subcarrier
     * signals.
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getRMSFreqDev() {
      return rmsFreqDev;
    }

    /**
     * Set the Root Means Square (RMS) frequency deviation when frequency
     * modulation (FM) is employed and the base band consists of
     * frequency-division multiplexed (FDM) channels or multiple subcarrier
     * signals.
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setRMSFreqDev(BigDecimal value) {
      this.rmsFreqDev = value;
    }

    public boolean isSetRMSFreqDev() {
      return (this.rmsFreqDev != null);
    }

    /**
     * Get the code that indicates the type of Root Mean Square (RMS) deviation
     * (multichannel or per-channel).
     * <p>
     * @return a {@link BigInteger} instance
     * @since 3.1.0
     */
    public BigInteger getDeviationCode() {
      return deviationCode;
    }

    /**
     * Set the code that indicates the type of Root Mean Square (RMS) deviation
     * (multichannel or per-channel).
     * <p>
     * @param value a {@link BigInteger} instance
     * @since 3.1.0
     */
    public void setDeviationCode(BigInteger value) {
      this.deviationCode = value;
    }

    public boolean isSetDeviationCode() {
      return (this.deviationCode != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getPeakIdx() {
      return peakIdx;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setPeakIdx(BigDecimal value) {
      this.peakIdx = value;
    }

    public boolean isSetPeakIdx() {
      return (this.peakIdx != null);
    }

    public Modulation.FM withCls(String value) {
      setCls(value);
      return this;
    }

    public Modulation.FM withPeakFreqDev(BigDecimal value) {
      setPeakFreqDev(value);
      return this;
    }

    public Modulation.FM withRMSFreqDev(BigDecimal value) {
      setRMSFreqDev(value);
      return this;
    }

    public Modulation.FM withDeviationCode(BigInteger value) {
      setDeviationCode(value);
      return this;
    }

    public Modulation.FM withPeakIdx(BigDecimal value) {
      setPeakIdx(value);
      return this;
    }

  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class PPM {

    /**
     * cls - Classification (Required)
     * <p>
     * The classification of the current data item. This attribute is REQUIRED
     * on each data item, even if the classification is "U".
     * <p>
     * Format is L:CCL
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "cls")
    protected String cls;

    @XmlAttribute(name = "minPPS")
    protected BigDecimal minPPS;

    @XmlAttribute(name = "maxPPS")
    protected BigDecimal maxPPS;

    /**
     * Get the classification of the current data item. This attribute is
     * REQUIRED on each data item, even if the classification is "U".
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getCls() {
      return cls;
    }

    /**
     * Set the classification of the current data item. This attribute is
     * REQUIRED on each data item, even if the classification is "U".
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
     * Get
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getMinPPS() {
      return minPPS;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setMinPPS(BigDecimal value) {
      this.minPPS = value;
    }

    public boolean isSetMinPPS() {
      return (this.minPPS != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getMaxPPS() {
      return maxPPS;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setMaxPPS(BigDecimal value) {
      this.maxPPS = value;
    }

    public boolean isSetMaxPPS() {
      return (this.maxPPS != null);
    }

    public Modulation.PPM withCls(String value) {
      setCls(value);
      return this;
    }

    public Modulation.PPM withMinPPS(BigDecimal value) {
      setMinPPS(value);
      return this;
    }

    public Modulation.PPM withMaxPPS(BigDecimal value) {
      setMaxPPS(value);
      return this;
    }

  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class Suppression {

    /**
     * cls - Classification (Required)
     * <p>
     * The classification of the current data item. This attribute is REQUIRED
     * on each data item, even if the classification is "U".
     * <p>
     * Format is L:CCL
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "cls")
    protected String cls;
    /**
     * CarrierSuppression - Level of Carrier Suppression (Optional)
     * <p>
     * The amount of reduction of the signals carrier, as compared to a non
     * attenuated signal carrier.
     * <p>
     * Format is UN(6,3) (dB)
     * <p>
     * Attribute group Suppression (Optional)
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "carrier")
    protected BigDecimal carrier;
    /**
     * SidebandSuppressed - Sideband Suppressed (Optional)
     * <p>
     * The sideband that is suppressed in a single sideband signal.
     * <p>
     * Format is L:CSI
     * <p>
     * Attribute group Suppression (Optional)
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "sideBand")
    protected BigDecimal sideBand;

    /**
     * Get the classification of the current data item. This attribute is
     * REQUIRED on each data item, even if the classification is "U".
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getCls() {
      return cls;
    }

    /**
     * Set the classification of the current data item. This attribute is
     * REQUIRED on each data item, even if the classification is "U".
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
     * Get the amount of reduction of the signals carrier, as compared to a non
     * attenuated signal carrier.
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getCarrier() {
      return carrier;
    }

    /**
     * Set the amount of reduction of the signals carrier, as compared to a non
     * attenuated signal carrier.
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setCarrier(BigDecimal value) {
      this.carrier = value;
    }

    public boolean isSetCarrier() {
      return (this.carrier != null);
    }

    /**
     * Get the sideband that is suppressed in a single sideband signal.
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getSideBand() {
      return sideBand;
    }

    /**
     * Set the sideband that is suppressed in a single sideband signal.
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setSideBand(BigDecimal value) {
      this.sideBand = value;
    }

    public boolean isSetSideBand() {
      return (this.sideBand != null);
    }

    public Modulation.Suppression withCls(String value) {
      setCls(value);
      return this;
    }

    public Modulation.Suppression withCarrier(BigDecimal value) {
      setCarrier(value);
      return this;
    }

    public Modulation.Suppression withSideBand(BigDecimal value) {
      setSideBand(value);
      return this;
    }

  }

  /**
   * Get a string representation of this Modulation instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Modulation {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Modulation} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
