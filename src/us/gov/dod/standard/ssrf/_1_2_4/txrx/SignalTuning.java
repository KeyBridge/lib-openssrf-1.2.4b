package us.gov.dod.standard.ssrf._1_2_4.txrx;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.shared.FreqRange;
import us.gov.dod.standard.ssrf._1_2_4.shared.FreqSingle;

/**
 * SignalTuning
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSignalTuning", propOrder = {
  "freqRange",
  "freqSingle"
})
public class SignalTuning {

  @XmlElement(name = "FreqRange")
  protected FreqRange freqRange;

  @XmlElement(name = "FreqSingle")
  protected FreqSingle freqSingle;
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
   * TuningStep - Tuning Step (Optional)
   * <p>
   * The tuning increment.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "tuningStep")
  protected BigDecimal tuningStep;

  @XmlAttribute(name = "tunability")
  protected String tunability;

  @XmlAttribute(name = "numChnl")
  protected BigInteger numChnl;

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
   * Get the tuning increment.
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getTuningStep() {
    return tuningStep;
  }

  /**
   * Set the tuning increment.
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setTuningStep(BigDecimal value) {
    this.tuningStep = value;
  }

  public boolean isSetTuningStep() {
    return (this.tuningStep != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getTunability() {
    return tunability;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setTunability(String value) {
    this.tunability = value;
  }

  public boolean isSetTunability() {
    return (this.tunability != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getNumChnl() {
    return numChnl;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setNumChnl(BigInteger value) {
    this.numChnl = value;
  }

  public boolean isSetNumChnl() {
    return (this.numChnl != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link FreqRange}
   * @return The current SignalTuning object instance
   * @since 3.1.0
   */
  public SignalTuning withFreqRange(FreqRange value) {
    setFreqRange(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link FreqSingle}
   * @return The current SignalTuning object instance
   * @since 3.1.0
   */
  public SignalTuning withFreqSingle(FreqSingle value) {
    setFreqSingle(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SignalTuning object instance
   * @since 3.1.0
   */
  public SignalTuning withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set the tuning increment.
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current SignalTuning object instance
   * @since 3.1.0
   */
  public SignalTuning withTuningStep(BigDecimal value) {
    setTuningStep(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SignalTuning object instance
   * @since 3.1.0
   */
  public SignalTuning withTunability(String value) {
    setTunability(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current SignalTuning object instance
   * @since 3.1.0
   */
  public SignalTuning withNumChnl(BigInteger value) {
    setNumChnl(value);
    return this;
  }

  /**
   * Get a string representation of this SignalTuning instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SignalTuning {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SignalTuning} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
