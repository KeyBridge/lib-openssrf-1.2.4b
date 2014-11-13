package us.gov.dod.standard.ssrf._1_2_4.forceelement;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.organisation.Quantity;

/**
 * FEAntenna
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TFEAntenna", propOrder = {
  "quantity"
})
public class FEAntenna {

  @XmlElement(name = "Quantity")
  protected Quantity quantity;
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

  /**
   * Get
   * <p>
   * @return a {@link Quantity} instance
   * @since 3.1.0
   */
  public Quantity getQuantity() {
    return quantity;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Quantity} instance
   * @since 3.1.0
   */
  public void setQuantity(Quantity value) {
    this.quantity = value;
  }

  public boolean isSetQuantity() {
    return (this.quantity != null);
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
   * Set
   * <p>
   * @param value An instances of type {@link Quantity}
   * @return The current FEAntenna object instance
   * @since 3.1.0
   */
  public FEAntenna withQuantity(Quantity value) {
    setQuantity(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current FEAntenna object instance
   * @since 3.1.0
   */
  public FEAntenna withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current FEAntenna object instance
   * @since 3.1.0
   */
  public FEAntenna withSerial(String value) {
    setSerial(value);
    return this;
  }

  /**
   * Get a string representation of this FEAntenna instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "FEAntenna {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link FEAntenna} requires {@link null serial}.
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
