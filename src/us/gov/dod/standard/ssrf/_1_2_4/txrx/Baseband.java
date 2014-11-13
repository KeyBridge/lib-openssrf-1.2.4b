package us.gov.dod.standard.ssrf._1_2_4.txrx;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListMO;
import us.gov.dod.standard.ssrf._1_2_4.shared.Curve;

/**
 * Baseband defines the parameters of the modulating or received signal.
 * <p>
 * Element of {@link RxMode}, {@link TxMode}
 * <p>
 * Example:
 * <pre>
 * &lt;Baseband&gt;
 *   &lt;ModFreqMin cls="U"&gt;0.0003&lt;/ModFreqMin&gt;
 *   &lt;ModFreqMax cls="U"&gt;0.0034&lt;/ModFreqMax&gt;
 *   &lt;SignalType cls="U"&gt;FM Clear Voice&lt;/SignalType&gt;
 * &lt;/Baseband&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TBaseband", propOrder = {
  "curve"
})
public class Baseband {

  @XmlElement(name = "Curve")
  protected Set<Curve> curve;
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

  @XmlAttribute(name = "minModFreq", required = true)
  protected BigDecimal minModFreq;

  @XmlAttribute(name = "maxModFreq", required = true)
  protected BigDecimal maxModFreq;
  /**
   * SignalType - Signal Type (Optional)
   * <p>
   * The type of modulation.
   * <p>
   * Format is L:CMO
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "signalType")
  protected ListMO signalType;

  @XmlAttribute(name = "BER")
  protected Float ber;

  @XmlAttribute(name = "chnlSpacing")
  protected BigDecimal chnlSpacing;

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
  public BigDecimal getMinModFreq() {
    return minModFreq;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMinModFreq(BigDecimal value) {
    this.minModFreq = value;
  }

  public boolean isSetMinModFreq() {
    return (this.minModFreq != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMaxModFreq() {
    return maxModFreq;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMaxModFreq(BigDecimal value) {
    this.maxModFreq = value;
  }

  public boolean isSetMaxModFreq() {
    return (this.maxModFreq != null);
  }

  /**
   * Get the type of modulation.
   * <p>
   * @return a {@link ListMO} instance
   * @since 3.1.0
   */
  public ListMO getSignalType() {
    return signalType;
  }

  /**
   * Set the type of modulation.
   * <p>
   * @param value a {@link ListMO} instance
   * @since 3.1.0
   */
  public void setSignalType(ListMO value) {
    this.signalType = value;
  }

  public boolean isSetSignalType() {
    return (this.signalType != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link float} instance
   * @since 3.1.0
   */
  public float getBER() {
    return ber;
  }

  /**
   * Set
   * <p>
   * @param value a {@link float} instance
   * @since 3.1.0
   */
  public void setBER(float value) {
    this.ber = value;
  }

  public boolean isSetBER() {
    return (this.ber != null);
  }

  /**
   * Clear the BER field. This sets the field to null.
   */
  public void unsetBER() {
    this.ber = null;
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
   * Set
   * <p>
   * @param values One or more instances of type {@link Curve...}
   * @return The current Baseband object instance
   * @since 3.1.0
   */
  public Baseband withCurve(Curve... values) {
    if (values != null) {
      getCurve().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Curve} instances
   * @return The current Baseband object instance
   * @since 3.1.0
   */
  public Baseband withCurve(Collection<Curve> values) {
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
   * @return The current Baseband object instance
   * @since 3.1.0
   */
  public Baseband withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Baseband object instance
   * @since 3.1.0
   */
  public Baseband withMinModFreq(BigDecimal value) {
    setMinModFreq(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Baseband object instance
   * @since 3.1.0
   */
  public Baseband withMaxModFreq(BigDecimal value) {
    setMaxModFreq(value);
    return this;
  }

  /**
   * Set the type of modulation.
   * <p>
   * @param value An instances of type {@link ListMO}
   * @return The current Baseband object instance
   * @since 3.1.0
   */
  public Baseband withSignalType(ListMO value) {
    setSignalType(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link float}
   * @return The current Baseband object instance
   * @since 3.1.0
   */
  public Baseband withBER(float value) {
    setBER(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Baseband object instance
   * @since 3.1.0
   */
  public Baseband withChnlSpacing(BigDecimal value) {
    setChnlSpacing(value);
    return this;
  }

  /**
   * Get a string representation of this Baseband instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Baseband {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Baseband} requires {@link null maxModFreq}, {@link null minModFreq}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetMaxModFreq() && isSetMinModFreq();
  }

}