package us.gov.dod.standard.ssrf._1_2_4.sspt;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.shared.FreqRange;
import us.gov.dod.standard.ssrf._1_2_4.shared.FreqSingle;

/**
 * AuthorisedTuning
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAuthorisedTuning", propOrder = {
  "freqSingle",
  "freqRange"
})
public class AuthorisedTuning {

  @XmlElement(name = "FreqSingle")
  protected Set<FreqSingle> freqSingle;

  @XmlElement(name = "FreqRange")
  protected Set<FreqRange> freqRange;
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

  @XmlAttribute(name = "tuningStep", required = true)
  protected BigDecimal tuningStep;

  @XmlAttribute(name = "numFreq", required = true)
  protected BigInteger numFreq;

  /**
   * Get
   * <p>
   * @return a {@link FreqSingle} instance
   * @since 3.1.0
   */
  public Set<FreqSingle> getFreqSingle() {
    if (freqSingle == null) {
      freqSingle = new HashSet<>();
    }
    return this.freqSingle;
  }

  public boolean isSetFreqSingle() {
    return ((this.freqSingle != null) && (!this.freqSingle.isEmpty()));
  }

  /**
   * Clear the FreqSingle field. This sets the field to null.
   */
  public void unsetFreqSingle() {
    this.freqSingle = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link FreqRange} instance
   * @since 3.1.0
   */
  public Set<FreqRange> getFreqRange() {
    if (freqRange == null) {
      freqRange = new HashSet<>();
    }
    return this.freqRange;
  }

  public boolean isSetFreqRange() {
    return ((this.freqRange != null) && (!this.freqRange.isEmpty()));
  }

  /**
   * Clear the FreqRange field. This sets the field to null.
   */
  public void unsetFreqRange() {
    this.freqRange = null;
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
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getTuningStep() {
    return tuningStep;
  }

  /**
   * Set
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
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getNumFreq() {
    return numFreq;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setNumFreq(BigInteger value) {
    this.numFreq = value;
  }

  public boolean isSetNumFreq() {
    return (this.numFreq != null);
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link FreqSingle...}
   * @return The current AuthorisedTuning object instance
   * @since 3.1.0
   */
  public AuthorisedTuning withFreqSingle(FreqSingle... values) {
    if (values != null) {
      getFreqSingle().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link FreqSingle} instances
   * @return The current AuthorisedTuning object instance
   * @since 3.1.0
   */
  public AuthorisedTuning withFreqSingle(Collection<FreqSingle> values) {
    if (values != null) {
      getFreqSingle().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link FreqRange...}
   * @return The current AuthorisedTuning object instance
   * @since 3.1.0
   */
  public AuthorisedTuning withFreqRange(FreqRange... values) {
    if (values != null) {
      getFreqRange().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link FreqRange} instances
   * @return The current AuthorisedTuning object instance
   * @since 3.1.0
   */
  public AuthorisedTuning withFreqRange(Collection<FreqRange> values) {
    if (values != null) {
      getFreqRange().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AuthorisedTuning object instance
   * @since 3.1.0
   */
  public AuthorisedTuning withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current AuthorisedTuning object instance
   * @since 3.1.0
   */
  public AuthorisedTuning withTuningStep(BigDecimal value) {
    setTuningStep(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current AuthorisedTuning object instance
   * @since 3.1.0
   */
  public AuthorisedTuning withNumFreq(BigInteger value) {
    setNumFreq(value);
    return this;
  }

  /**
   * Get a string representation of this AuthorisedTuning instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AuthorisedTuning {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AuthorisedTuning} requires
   * {@link null numFreq}, {@link null tuningStep}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetNumFreq() && isSetTuningStep();
  }

}
