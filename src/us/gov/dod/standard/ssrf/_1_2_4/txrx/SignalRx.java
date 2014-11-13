package us.gov.dod.standard.ssrf._1_2_4.txrx;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.shared.Curve;

/**
 * SignalRx
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSignalRx", propOrder = {
  "signalTuning",
  "curve",
  "freqTolerance",
  "iFreq"
})
public class SignalRx {

  @XmlElement(name = "SignalTuning")
  protected Set<SignalTuning> signalTuning;

  @XmlElement(name = "Curve")
  protected Set<Curve> curve;

  @XmlElement(name = "FreqTolerance")
  protected ClassFreq freqTolerance;

  @XmlElement(name = "IFreq")
  protected Set<IFreq> iFreq;
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
   * Get
   * <p>
   * @return a {@link Curve} instance
   * @since 3.1.0
   */
  public Set<Curve> getCurve() {
    if (curve == null) {
      curve = new HashSet<>();
    }
    return this.curve;
  }

  public boolean isSetCurve() {
    return ((this.curve != null) && (!this.curve.isEmpty()));
  }

  /**
   * Clear the Curve field. This sets the field to null.
   */
  public void unsetCurve() {
    this.curve = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link ClassFreq} instance
   * @since 3.1.0
   */
  public ClassFreq getFreqTolerance() {
    return freqTolerance;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ClassFreq} instance
   * @since 3.1.0
   */
  public void setFreqTolerance(ClassFreq value) {
    this.freqTolerance = value;
  }

  public boolean isSetFreqTolerance() {
    return (this.freqTolerance != null);
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
   * Set
   * <p>
   * @param values One or more instances of type {@link SignalTuning...}
   * @return The current SignalRx object instance
   * @since 3.1.0
   */
  public SignalRx withSignalTuning(SignalTuning... values) {
    if (values != null) {
      getSignalTuning().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link SignalTuning} instances
   * @return The current SignalRx object instance
   * @since 3.1.0
   */
  public SignalRx withSignalTuning(Collection<SignalTuning> values) {
    if (values != null) {
      getSignalTuning().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Curve...}
   * @return The current SignalRx object instance
   * @since 3.1.0
   */
  public SignalRx withCurve(Curve... values) {
    if (values != null) {
      getCurve().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Curve} instances
   * @return The current SignalRx object instance
   * @since 3.1.0
   */
  public SignalRx withCurve(Collection<Curve> values) {
    if (values != null) {
      getCurve().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ClassFreq}
   * @return The current SignalRx object instance
   * @since 3.1.0
   */
  public SignalRx withFreqTolerance(ClassFreq value) {
    setFreqTolerance(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link IFreq...}
   * @return The current SignalRx object instance
   * @since 3.1.0
   */
  public SignalRx withIFreq(IFreq... values) {
    if (values != null) {
      getIFreq().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link IFreq} instances
   * @return The current SignalRx object instance
   * @since 3.1.0
   */
  public SignalRx withIFreq(Collection<IFreq> values) {
    if (values != null) {
      getIFreq().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SignalRx object instance
   * @since 3.1.0
   */
  public SignalRx withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Get a string representation of this SignalRx instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SignalRx {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SignalRx} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
