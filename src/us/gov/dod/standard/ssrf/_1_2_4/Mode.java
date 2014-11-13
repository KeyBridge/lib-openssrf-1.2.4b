package us.gov.dod.standard.ssrf._1_2_4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.antenna.AntMode;
import us.gov.dod.standard.ssrf._1_2_4.shared.Curve;
import us.gov.dod.standard.ssrf._1_2_4.txrx.RxMode;
import us.gov.dod.standard.ssrf._1_2_4.txrx.TxMode;
import us.gov.dod.standard.ssrf._1_2_4.txrx.TxRxMode;

/**
 * Mode
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mode", propOrder = {
  "curve"
})
@XmlSeeAlso({
  AntMode.class,
  RxMode.class,
  TxRxMode.class,
  TxMode.class
})
public abstract class Mode {

  /**
   * curves - Links to Curves (Optional)
   * <p>
   * The list of indices referring to Curves applicable to the data item.
   * <p>
   * Format is List of UN(6)
   * <p>
   * @since 3.1.0
   */
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
  /**
   * Description - Mode Description (Optional)
   * <p>
   * A description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * Format is S100
   * <p>
   * Attribute group ModeInfo (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "descr")
  protected String descr;

  /**
   * Get the list of indices referring to Curves applicable to the data item.
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
   * Get a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getDescr() {
    return descr;
  }

  /**
   * Set a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setDescr(String value) {
    this.descr = value;
  }

  public boolean isSetDescr() {
    return (this.descr != null);
  }

  /**
   * Set the list of indices referring to Curves applicable to the data item.
   * <p>
   * @param values One or more instances of type {@link Curve...}
   * @return The current Mode object instance
   * @since 3.1.0
   */
  public Mode withCurve(Curve... values) {
    if (values != null) {
      getCurve().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the list of indices referring to Curves applicable to the data item.
   * <p>
   * @param values A collection of {@link Curve} instances
   * @return The current Mode object instance
   * @since 3.1.0
   */
  public Mode withCurve(Collection<Curve> values) {
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
   * @return The current Mode object instance
   * @since 3.1.0
   */
  public Mode withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set a description of the operational mode; this description should be a
   * meaningful explanation of the mode main characteristics.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Mode object instance
   * @since 3.1.0
   */
  public Mode withDescr(String value) {
    setDescr(value);
    return this;
  }

  /**
   * Get a string representation of this Mode instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Mode {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Mode} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
