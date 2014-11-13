package us.gov.dod.standard.ssrf._1_2_4.antenna;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * VertScan
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TVertScan")
public class VertScan {

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

  @XmlAttribute(name = "speed", required = true)
  protected BigDecimal speed;

  @XmlAttribute(name = "rate", required = true)
  protected BigInteger rate;

  @XmlAttribute(name = "scanType", required = true)
  protected String scanType;

  @XmlAttribute(name = "minScanAngle")
  protected BigDecimal minScanAngle;

  @XmlAttribute(name = "maxScanAngle")
  protected BigDecimal maxScanAngle;

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
  public BigDecimal getSpeed() {
    return speed;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setSpeed(BigDecimal value) {
    this.speed = value;
  }

  public boolean isSetSpeed() {
    return (this.speed != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getRate() {
    return rate;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setRate(BigInteger value) {
    this.rate = value;
  }

  public boolean isSetRate() {
    return (this.rate != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getScanType() {
    return scanType;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setScanType(String value) {
    this.scanType = value;
  }

  public boolean isSetScanType() {
    return (this.scanType != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMinScanAngle() {
    return minScanAngle;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMinScanAngle(BigDecimal value) {
    this.minScanAngle = value;
  }

  public boolean isSetMinScanAngle() {
    return (this.minScanAngle != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public BigDecimal getMaxScanAngle() {
    return maxScanAngle;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigDecimal} instance
   * @since 3.1.0
   */
  public void setMaxScanAngle(BigDecimal value) {
    this.maxScanAngle = value;
  }

  public boolean isSetMaxScanAngle() {
    return (this.maxScanAngle != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current VertScan object instance
   * @since 3.1.0
   */
  public VertScan withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current VertScan object instance
   * @since 3.1.0
   */
  public VertScan withSpeed(BigDecimal value) {
    setSpeed(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current VertScan object instance
   * @since 3.1.0
   */
  public VertScan withRate(BigInteger value) {
    setRate(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current VertScan object instance
   * @since 3.1.0
   */
  public VertScan withScanType(String value) {
    setScanType(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current VertScan object instance
   * @since 3.1.0
   */
  public VertScan withMinScanAngle(BigDecimal value) {
    setMinScanAngle(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigDecimal}
   * @return The current VertScan object instance
   * @since 3.1.0
   */
  public VertScan withMaxScanAngle(BigDecimal value) {
    setMaxScanAngle(value);
    return this;
  }

  /**
   * Get a string representation of this VertScan instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "VertScan {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link VertScan} requires
   * {@link null rate}, {@link null scanType}, {@link null speed}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetRate() && isSetScanType() && isSetSpeed();
  }

}
