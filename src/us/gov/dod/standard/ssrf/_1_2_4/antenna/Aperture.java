package us.gov.dod.standard.ssrf._1_2_4.antenna;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Aperture
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAperture", propOrder = {
  "diameter",
  "horzVert"
})
public class Aperture {

  @XmlElement(name = "Diameter")
  protected Diameter diameter;

  @XmlElement(name = "HorzVert")
  protected HorzVert horzVert;
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
   * @return a {@link Diameter} instance
   * @since 3.1.0
   */
  public Diameter getDiameter() {
    return diameter;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Diameter} instance
   * @since 3.1.0
   */
  public void setDiameter(Diameter value) {
    this.diameter = value;
  }

  public boolean isSetDiameter() {
    return (this.diameter != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link HorzVert} instance
   * @since 3.1.0
   */
  public HorzVert getHorzVert() {
    return horzVert;
  }

  /**
   * Set
   * <p>
   * @param value a {@link HorzVert} instance
   * @since 3.1.0
   */
  public void setHorzVert(HorzVert value) {
    this.horzVert = value;
  }

  public boolean isSetHorzVert() {
    return (this.horzVert != null);
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
   * @param value An instances of type {@link Diameter}
   * @return The current Aperture object instance
   * @since 3.1.0
   */
  public Aperture withDiameter(Diameter value) {
    setDiameter(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link HorzVert}
   * @return The current Aperture object instance
   * @since 3.1.0
   */
  public Aperture withHorzVert(HorzVert value) {
    setHorzVert(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Aperture object instance
   * @since 3.1.0
   */
  public Aperture withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Get a string representation of this Aperture instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Aperture {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Aperture} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  public boolean isSet() {
    return true;
  }

}
