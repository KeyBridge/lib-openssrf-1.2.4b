package us.gov.dod.standard.ssrf._1_2_4.txrx;

import java.math.BigInteger;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.shared.FreqRange;
import us.gov.dod.standard.ssrf._1_2_4.shared.FreqSingle;

/**
 * IFreq
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIFreq", propOrder = {
  "freqSingle",
  "freqRange"
})
public class IFreq {

  @XmlElement(name = "FreqSingle")
  protected FreqSingle freqSingle;

  @XmlElement(name = "FreqRange")
  protected FreqRange freqRange;
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

  @XmlAttribute(name = "IFNum", required = true)
  protected BigInteger ifNum;

  @XmlAttribute(name = "tuning", required = true)
  protected String tuning;

  @XmlAttribute(name = "mixerType")
  protected String mixerType;

  /**
   * Get
   * <p>
   * @return a {@link FreqSingle} instance
   * @since 3.1.0
   */
  public FreqSingle getFreqSingle() {
    return freqSingle;
  }

  /**
   * Set
   * <p>
   * @param value a {@link FreqSingle} instance
   * @since 3.1.0
   */
  public void setFreqSingle(FreqSingle value) {
    this.freqSingle = value;
  }

  public boolean isSetFreqSingle() {
    return (this.freqSingle != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link FreqRange} instance
   * @since 3.1.0
   */
  public FreqRange getFreqRange() {
    return freqRange;
  }

  /**
   * Set
   * <p>
   * @param value a {@link FreqRange} instance
   * @since 3.1.0
   */
  public void setFreqRange(FreqRange value) {
    this.freqRange = value;
  }

  public boolean isSetFreqRange() {
    return (this.freqRange != null);
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
   * Get
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getIFNum() {
    return ifNum;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setIFNum(BigInteger value) {
    this.ifNum = value;
  }

  public boolean isSetIFNum() {
    return (this.ifNum != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getTuning() {
    return tuning;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setTuning(String value) {
    this.tuning = value;
  }

  public boolean isSetTuning() {
    return (this.tuning != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getMixerType() {
    return mixerType;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setMixerType(String value) {
    this.mixerType = value;
  }

  public boolean isSetMixerType() {
    return (this.mixerType != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link FreqSingle}
   * @return The current IFreq object instance
   * @since 3.1.0
   */
  public IFreq withFreqSingle(FreqSingle value) {
    setFreqSingle(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link FreqRange}
   * @return The current IFreq object instance
   * @since 3.1.0
   */
  public IFreq withFreqRange(FreqRange value) {
    setFreqRange(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IFreq object instance
   * @since 3.1.0
   */
  public IFreq withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current IFreq object instance
   * @since 3.1.0
   */
  public IFreq withIFNum(BigInteger value) {
    setIFNum(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IFreq object instance
   * @since 3.1.0
   */
  public IFreq withTuning(String value) {
    setTuning(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IFreq object instance
   * @since 3.1.0
   */
  public IFreq withMixerType(String value) {
    setMixerType(value);
    return this;
  }

  /**
   * Get a string representation of this IFreq instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "IFreq {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link IFreq} requires {@link null IFNum}, {@link null tuning}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetIFNum() && isSetTuning();
  }

}
