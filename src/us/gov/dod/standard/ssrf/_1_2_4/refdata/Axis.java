package us.gov.dod.standard.ssrf._1_2_4.refdata;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Axis
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAxis")
public class Axis {

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

  @XmlAttribute(name = "minAxis")
  protected BigDecimal minAxis;

  @XmlAttribute(name = "maxAxis")
  protected BigDecimal maxAxis;

  @XmlAttribute(name = "units")
  protected String units;

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
  public BigDecimal getMinAxis() {
    return minAxis;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMinAxis(BigDecimal value) {
    this.minAxis = value;
  }

  public boolean isSetMinAxis() {
    return (this.minAxis != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMaxAxis() {
    return maxAxis;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMaxAxis(BigDecimal value) {
    this.maxAxis = value;
  }

  public boolean isSetMaxAxis() {
    return (this.maxAxis != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getUnits() {
    return units;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setUnits(String value) {
    this.units = value;
  }

  public boolean isSetUnits() {
    return (this.units != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Axis object instance
   * @since 3.1.0
   */
  public Axis withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Axis object instance
   * @since 3.1.0
   */
  public Axis withMinAxis(BigDecimal value) {
    setMinAxis(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current Axis object instance
   * @since 3.1.0
   */
  public Axis withMaxAxis(BigDecimal value) {
    setMaxAxis(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Axis object instance
   * @since 3.1.0
   */
  public Axis withUnits(String value) {
    setUnits(value);
    return this;
  }

  /**
   * Get a string representation of this Axis instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Axis {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Axis} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
