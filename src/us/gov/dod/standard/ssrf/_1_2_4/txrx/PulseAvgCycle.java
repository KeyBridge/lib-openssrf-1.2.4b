package us.gov.dod.standard.ssrf._1_2_4.txrx;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * PulseAvgCycle
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPulseAvgCycle")
public class PulseAvgCycle {

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

  @XmlAttribute(name = "minDutyCycle")
  protected BigDecimal minDutyCycle;

  @XmlAttribute(name = "maxDutyCycle")
  protected BigDecimal maxDutyCycle;

  @XmlAttribute(name = "minAvgPower")
  protected BigDecimal minAvgPower;

  @XmlAttribute(name = "maxAvgPower")
  protected BigDecimal maxAvgPower;

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
  public BigDecimal getMinDutyCycle() {
    return minDutyCycle;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMinDutyCycle(BigDecimal value) {
    this.minDutyCycle = value;
  }

  public boolean isSetMinDutyCycle() {
    return (this.minDutyCycle != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMaxDutyCycle() {
    return maxDutyCycle;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMaxDutyCycle(BigDecimal value) {
    this.maxDutyCycle = value;
  }

  public boolean isSetMaxDutyCycle() {
    return (this.maxDutyCycle != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMinAvgPower() {
    return minAvgPower;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMinAvgPower(BigDecimal value) {
    this.minAvgPower = value;
  }

  public boolean isSetMinAvgPower() {
    return (this.minAvgPower != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMaxAvgPower() {
    return maxAvgPower;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMaxAvgPower(BigDecimal value) {
    this.maxAvgPower = value;
  }

  public boolean isSetMaxAvgPower() {
    return (this.maxAvgPower != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current PulseAvgCycle object instance
   * @since 3.1.0
   */
  public PulseAvgCycle withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current PulseAvgCycle object instance
   * @since 3.1.0
   */
  public PulseAvgCycle withMinDutyCycle(BigDecimal value) {
    setMinDutyCycle(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current PulseAvgCycle object instance
   * @since 3.1.0
   */
  public PulseAvgCycle withMaxDutyCycle(BigDecimal value) {
    setMaxDutyCycle(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current PulseAvgCycle object instance
   * @since 3.1.0
   */
  public PulseAvgCycle withMinAvgPower(BigDecimal value) {
    setMinAvgPower(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current PulseAvgCycle object instance
   * @since 3.1.0
   */
  public PulseAvgCycle withMaxAvgPower(BigDecimal value) {
    setMaxAvgPower(value);
    return this;
  }

  /**
   * Get a string representation of this PulseAvgCycle instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "PulseAvgCycle {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link PulseAvgCycle} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
