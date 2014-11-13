package us.gov.dod.standard.ssrf._1_2_4.link;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * SrvVolume
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSrvVolume")
public class SrvVolume {

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

  @XmlAttribute(name = "serial", required = true)
  protected String serial;

  @XmlAttribute(name = "radius")
  protected BigInteger radius;

  @XmlAttribute(name = "height")
  protected BigInteger height;

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
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getSerial() {
    return serial;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setSerial(String value) {
    this.serial = value;
  }

  public boolean isSetSerial() {
    return (this.serial != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getRadius() {
    return radius;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setRadius(BigInteger value) {
    this.radius = value;
  }

  public boolean isSetRadius() {
    return (this.radius != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getHeight() {
    return height;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setHeight(BigInteger value) {
    this.height = value;
  }

  public boolean isSetHeight() {
    return (this.height != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SrvVolume object instance
   * @since 3.1.0
   */
  public SrvVolume withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current SrvVolume object instance
   * @since 3.1.0
   */
  public SrvVolume withSerial(String value) {
    setSerial(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current SrvVolume object instance
   * @since 3.1.0
   */
  public SrvVolume withRadius(BigInteger value) {
    setRadius(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current SrvVolume object instance
   * @since 3.1.0
   */
  public SrvVolume withHeight(BigInteger value) {
    setHeight(value);
    return this;
  }

  /**
   * Get a string representation of this SrvVolume instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "SrvVolume {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link SrvVolume} requires {@link null serial}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetSerial();
  }

}
