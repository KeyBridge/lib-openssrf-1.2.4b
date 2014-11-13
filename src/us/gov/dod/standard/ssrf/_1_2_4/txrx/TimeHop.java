package us.gov.dod.standard.ssrf._1_2_4.txrx;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * TimeHop
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTimeHop")
public class TimeHop {

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

  @XmlAttribute(name = "numSlots")
  protected BigInteger numSlots;

  @XmlAttribute(name = "numPulsesPerDwell")
  protected BigInteger numPulsesPerDwell;

  @XmlAttribute(name = "hopGateLength")
  protected BigDecimal hopGateLength;

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
  public BigInteger getNumSlots() {
    return numSlots;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setNumSlots(BigInteger value) {
    this.numSlots = value;
  }

  public boolean isSetNumSlots() {
    return (this.numSlots != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getNumPulsesPerDwell() {
    return numPulsesPerDwell;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setNumPulsesPerDwell(BigInteger value) {
    this.numPulsesPerDwell = value;
  }

  public boolean isSetNumPulsesPerDwell() {
    return (this.numPulsesPerDwell != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getHopGateLength() {
    return hopGateLength;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setHopGateLength(BigDecimal value) {
    this.hopGateLength = value;
  }

  public boolean isSetHopGateLength() {
    return (this.hopGateLength != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current TimeHop object instance
   * @since 3.1.0
   */
  public TimeHop withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current TimeHop object instance
   * @since 3.1.0
   */
  public TimeHop withNumSlots(BigInteger value) {
    setNumSlots(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current TimeHop object instance
   * @since 3.1.0
   */
  public TimeHop withNumPulsesPerDwell(BigInteger value) {
    setNumPulsesPerDwell(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current TimeHop object instance
   * @since 3.1.0
   */
  public TimeHop withHopGateLength(BigDecimal value) {
    setHopGateLength(value);
    return this;
  }

  /**
   * Get a string representation of this TimeHop instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TimeHop {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TimeHop} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
