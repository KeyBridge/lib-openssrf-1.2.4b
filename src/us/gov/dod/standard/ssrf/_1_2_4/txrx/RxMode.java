package us.gov.dod.standard.ssrf._1_2_4.txrx;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.Mode;
import us.gov.dod.standard.ssrf._1_2_4.Receiver;
import us.gov.dod.standard.ssrf._1_2_4.shared.Curve;

/**
 * RxMode and sub-elements define all the technical parameters for a mode of
 * operation of the Receiver.
 * <p>
 * Element of {@link Receiver}
 * <p>
 * Sub-Elements are
 * {@link Baseband}, {@link EmsClass}, {@link FreqConversion}, {@link RxModulation}, {@link RxSignalTuning}, {@link SpreadSpectrum}
 * <p>
 * Example:
 * <pre>
 * &lt;SensitivityLevel&gt;-92&lt;/SensitivityLevel&gt;
 * &lt;NoiseFigure&gt;9&lt;/NoiseFigure&gt;
 * &lt;NoiseTemp&gt;850&lt;/NoiseTemp&gt;
 * &lt;SensitivityCriteriaType&gt;SINAD&lt;/SensitivityCriteriaType&gt;
 *  &lt;SensitivityCriteriaText&gt;10 dB at 30 kHz BW&lt;/SensitivityCriteriaText&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRxMode", propOrder = {
  "signalTuning",
  "postDetectionFreq",
  "processGain",
  "iFreq",
  "sensitivity",
  "dynamicRange"
})
public class RxMode
  extends Mode {

  @XmlElement(name = "SignalTuning")
  protected Set<SignalTuning> signalTuning;
  /**
   * PostDetectionFreqMax - Maximum Post Detection Frequency (Optional)
   * <p>
   * The maximum post detection frequency at the baseband half-power point.
   * <p>
   * [XSL ERR MINMAX] If PostDetectionFreqMax is used, it MUST be greater than
   * PostDetectionFreqMin.
   * <p>
   * Format is UN(16,9) [0..1E9] (MHz)
   * <p>
   * Attribute group PostDetection (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "PostDetectionFreq")
  protected PostDetectionFreq postDetectionFreq;

  @XmlElement(name = "ProcessGain")
  protected BigDecimal processGain;

  @XmlElement(name = "IFreq")
  protected Set<IFreq> iFreq;
  /**
   * SensitivityCriteriaLevel - Sensitivity Criteria Level (Optional)
   * <p>
   * The value of the criteria; the meaning and unit of this value depends on
   * the Sensitivity Criteria Type selected.
   * <p>
   * Format is SN(16,15) (dBm)
   * <p>
   * Attribute group Sensitivity (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Sensitivity")
  protected Sensitivity sensitivity;

  @XmlElement(name = "DynamicRange")
  protected DynamicRange dynamicRange;
  /**
   * RxModeRef - Element Content (Required)
   * <p>
   * The unique identifier of a RxMode.
   * <p>
   * Format is S20
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "rxMode", required = true)
  protected String rxMode;
  /**
   * SensitivityCriteriaType - Type of Sensitivity Criteria (Optional)
   * <p>
   * The criteria used to determine the minimum RF signal power present at the
   * input terminals that ensures acceptable detection and demodulation of the
   * desired signal.
   * <p>
   * Format is L:CSE
   * <p>
   * Attribute group Sensitivity (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "type")
  protected String type;

  /**
   * Get
   * <p>
   * @return a {@link SignalTuning} instance
   * @since 3.1.0
   */
  public Set<SignalTuning> getSignalTuning() {
    if (signalTuning == null) {
      signalTuning = new HashSet<>();
    }
    return this.signalTuning;
  }

  public boolean isSetSignalTuning() {
    return ((this.signalTuning != null) && (!this.signalTuning.isEmpty()));
  }

  /**
   * Clear the SignalTuning field. This sets the field to null.
   */
  public void unsetSignalTuning() {
    this.signalTuning = null;
  }

  /**
   * Get the maximum post detection frequency at the baseband half-power point.
   * <p>
   * [XSL ERR MINMAX] If PostDetectionFreqMax is used, it MUST be greater than
   * PostDetectionFreqMin.
   * <p>
   * @return a {@link PostDetectionFreq} instance
   * @since 3.1.0
   */
  public PostDetectionFreq getPostDetectionFreq() {
    return postDetectionFreq;
  }

  /**
   * Set the maximum post detection frequency at the baseband half-power point.
   * <p>
   * [XSL ERR MINMAX] If PostDetectionFreqMax is used, it MUST be greater than
   * PostDetectionFreqMin.
   * <p>
   * @param value a {@link PostDetectionFreq} instance
   * @since 3.1.0
   */
  public void setPostDetectionFreq(PostDetectionFreq value) {
    this.postDetectionFreq = value;
  }

  public boolean isSetPostDetectionFreq() {
    return (this.postDetectionFreq != null);
  }

  /**
   * Get
   * <p>
   * @return the ProcessGain value in a {@link BigDecimal} data type
   * @since 3.1.0
   */
  public BigDecimal getProcessGain() {
    return processGain;
  }

  /**
   * Set
   * <p>
   * @param value the ProcessGain value in a {@link BigDecimal} data type
   * @since 3.1.0
   */
  public void setProcessGain(BigDecimal value) {
    this.processGain = value;
  }

  public boolean isSetProcessGain() {
    return (this.processGain != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link IFreq} instance
   * @since 3.1.0
   */
  public Set<IFreq> getIFreq() {
    if (iFreq == null) {
      iFreq = new HashSet<>();
    }
    return this.iFreq;
  }

  public boolean isSetIFreq() {
    return ((this.iFreq != null) && (!this.iFreq.isEmpty()));
  }

  /**
   * Clear the IFreq field. This sets the field to null.
   */
  public void unsetIFreq() {
    this.iFreq = null;
  }

  /**
   * Get the value of the criteria; the meaning and unit of this value depends
   * on the Sensitivity Criteria Type selected.
   * <p>
   * @return a {@link Sensitivity} instance
   * @since 3.1.0
   */
  public Sensitivity getSensitivity() {
    return sensitivity;
  }

  /**
   * Set the value of the criteria; the meaning and unit of this value depends
   * on the Sensitivity Criteria Type selected.
   * <p>
   * @param value a {@link Sensitivity} instance
   * @since 3.1.0
   */
  public void setSensitivity(Sensitivity value) {
    this.sensitivity = value;
  }

  public boolean isSetSensitivity() {
    return (this.sensitivity != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link DynamicRange} instance
   * @since 3.1.0
   */
  public DynamicRange getDynamicRange() {
    return dynamicRange;
  }

  /**
   * Set
   * <p>
   * @param value a {@link DynamicRange} instance
   * @since 3.1.0
   */
  public void setDynamicRange(DynamicRange value) {
    this.dynamicRange = value;
  }

  public boolean isSetDynamicRange() {
    return (this.dynamicRange != null);
  }

  /**
   * Get the unique identifier of a RxMode.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getRxMode() {
    return rxMode;
  }

  /**
   * Set the unique identifier of a RxMode.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setRxMode(String value) {
    this.rxMode = value;
  }

  public boolean isSetRxMode() {
    return (this.rxMode != null);
  }

  /**
   * Get the criteria used to determine the minimum RF signal power present at
   * the input terminals that ensures acceptable detection and demodulation of
   * the desired signal.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getType() {
    return type;
  }

  /**
   * Set the criteria used to determine the minimum RF signal power present at
   * the input terminals that ensures acceptable detection and demodulation of
   * the desired signal.
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
   * Set
   * <p>
   * @param values One or more instances of type {@link SignalTuning...}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withSignalTuning(SignalTuning... values) {
    if (values != null) {
      getSignalTuning().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link SignalTuning} instances
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withSignalTuning(Collection<SignalTuning> values) {
    if (values != null) {
      getSignalTuning().addAll(values);
    }
    return this;
  }

  /**
   * Set the maximum post detection frequency at the baseband half-power point.
   * <p>
   * [XSL ERR MINMAX] If PostDetectionFreqMax is used, it MUST be greater than
   * PostDetectionFreqMin.
   * <p>
   * @param value An instances of type {@link PostDetectionFreq}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withPostDetectionFreq(PostDetectionFreq value) {
    setPostDetectionFreq(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withProcessGain(BigDecimal value) {
    setProcessGain(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link IFreq...}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withIFreq(IFreq... values) {
    if (values != null) {
      getIFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link IFreq} instances
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withIFreq(Collection<IFreq> values) {
    if (values != null) {
      getIFreq().addAll(values);
    }
    return this;
  }

  /**
   * Set the value of the criteria; the meaning and unit of this value depends
   * on the Sensitivity Criteria Type selected.
   * <p>
   * @param value An instances of type {@link Sensitivity}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withSensitivity(Sensitivity value) {
    setSensitivity(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link DynamicRange}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withDynamicRange(DynamicRange value) {
    setDynamicRange(value);
    return this;
  }

  /**
   * Set the unique identifier of a RxMode.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withRxMode(String value) {
    setRxMode(value);
    return this;
  }

  /**
   * Set the criteria used to determine the minimum RF signal power present at
   * the input terminals that ensures acceptable detection and demodulation of
   * the desired signal.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  public RxMode withType(String value) {
    setType(value);
    return this;
  }

  /**
   * Set the list of indices referring to Curves applicable to the data item.
   * <p>
   * @param values One or more instances of type {@link Curve...}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  @Override
  public RxMode withCurve(Curve... values) {
    if (values != null) {
      getCurve().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the list of indices referring to Curves applicable to the data item.
   * <p>
   * @param values A collection of {@link Curve} instances
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  @Override
  public RxMode withCurve(Collection<Curve> values) {
    if (values != null) {
      getCurve().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  @Override
  public RxMode withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RxMode object instance
   * @since 3.1.0
   */
  @Override
  public RxMode withDescr(String value) {
    setDescr(value);
    return this;
  }

  /**
   * Get a string representation of this RxMode instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "RxMode {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RxMode} requires {@link null rxMode}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return isSetRxMode();
  }

}
