package us.gov.dod.standard.ssrf._1_2_4.txrx;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * PulseForm
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPulseForm")
public class PulseForm {

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

  @XmlAttribute(name = "minRiseTime")
  protected BigDecimal minRiseTime;

  @XmlAttribute(name = "maxRiseTime")
  protected BigDecimal maxRiseTime;

  @XmlAttribute(name = "minFallTime")
  protected BigDecimal minFallTime;

  @XmlAttribute(name = "maxFallTime")
  protected BigDecimal maxFallTime;

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
  public BigDecimal getMinRiseTime() {
    return minRiseTime;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMinRiseTime(BigDecimal value) {
    this.minRiseTime = value;
  }

  public boolean isSetMinRiseTime() {
    return (this.minRiseTime != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMaxRiseTime() {
    return maxRiseTime;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMaxRiseTime(BigDecimal value) {
    this.maxRiseTime = value;
  }

  public boolean isSetMaxRiseTime() {
    return (this.maxRiseTime != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMinFallTime() {
    return minFallTime;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMinFallTime(BigDecimal value) {
    this.minFallTime = value;
  }

  public boolean isSetMinFallTime() {
    return (this.minFallTime != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMaxFallTime() {
    return maxFallTime;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMaxFallTime(BigDecimal value) {
    this.maxFallTime = value;
  }

  public boolean isSetMaxFallTime() {
    return (this.maxFallTime != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current PulseForm object instance
   * @since 3.1.0
   */
  public PulseForm withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current PulseForm object instance
   * @since 3.1.0
   */
  public PulseForm withMinRiseTime(BigDecimal value) {
    setMinRiseTime(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current PulseForm object instance
   * @since 3.1.0
   */
  public PulseForm withMaxRiseTime(BigDecimal value) {
    setMaxRiseTime(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current PulseForm object instance
   * @since 3.1.0
   */
  public PulseForm withMinFallTime(BigDecimal value) {
    setMinFallTime(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current PulseForm object instance
   * @since 3.1.0
   */
  public PulseForm withMaxFallTime(BigDecimal value) {
    setMaxFallTime(value);
    return this;
  }

  /**
   * Get a string representation of this PulseForm instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "PulseForm {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link PulseForm} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
