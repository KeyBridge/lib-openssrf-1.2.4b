package us.gov.dod.standard.ssrf._1_2_4.organisation;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.TDateTime;
import us.gov.dod.standard.ssrf._1_2_4.shared.TimeFrame;

/**
 * RelatedOrg
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRelatedOrg", propOrder = {
  "timeFrame",
  "quantity",
  "effDate",
  "expire"
})
public class RelatedOrg {

  @XmlElement(name = "TimeFrame")
  protected TimeFrame timeFrame;

  @XmlElement(name = "Quantity")
  protected Quantity quantity;

  @XmlElement(name = "EffDate")
  protected TDateTime effDate;

  @XmlElement(name = "Expire")
  protected TDateTime expire;
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
   * Type - Type (Optional)
   * <p>
   * The type of relationship.
   * <p>
   * Format is L:CFT
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "type", required = true)
  protected String type;
  /**
   * Relation - Relationship (Required)
   * <p>
   * The relationship between the two organisations.
   * <p>
   * Format is L:CFR
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "relation", required = true)
  protected String relation;
  /**
   * Serial - Organisation Serial (Required)
   * <p>
   * The unique reference of the Organisation associated with the current
   * Organisation.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "serial", required = true)
  protected String serial;

  /**
   * Get
   * <p>
   * @return the TimeFrame value in a {@link TimeFrame} data type
   * @since 3.1.0
   */
  public TimeFrame getTimeFrame() {
    return timeFrame;
  }

  /**
   * Set
   * <p>
   * @param value the TimeFrame value in a {@link TimeFrame} data type
   * @since 3.1.0
   */
  public void setTimeFrame(TimeFrame value) {
    this.timeFrame = value;
  }

  public boolean isSetTimeFrame() {
    return (this.timeFrame != null);
  }

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
   * Get
   * <p>
   * @return the EffDate value in a {@link TDateTime} data type
   * @since 3.1.0
   */
  public TDateTime getEffDate() {
    return effDate;
  }

  /**
   * Set
   * <p>
   * @param value the EffDate value in a {@link TDateTime} data type
   * @since 3.1.0
   */
  public void setEffDate(TDateTime value) {
    this.effDate = value;
  }

  public boolean isSetEffDate() {
    return (this.effDate != null);
  }

  /**
   * Get
   * <p>
   * @return the Expire value in a {@link TDateTime} data type
   * @since 3.1.0
   */
  public TDateTime getExpire() {
    return expire;
  }

  /**
   * Set
   * <p>
   * @param value the Expire value in a {@link TDateTime} data type
   * @since 3.1.0
   */
  public void setExpire(TDateTime value) {
    this.expire = value;
  }

  public boolean isSetExpire() {
    return (this.expire != null);
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
   * Get the type of relationship.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getType() {
    return type;
  }

  /**
   * Set the type of relationship.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setType(String value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Get the relationship between the two organisations.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getRelation() {
    return relation;
  }

  /**
   * Set the relationship between the two organisations.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setRelation(String value) {
    this.relation = value;
  }

  public boolean isSetRelation() {
    return (this.relation != null);
  }

  /**
   * Get the unique reference of the Organisation associated with the current
   * Organisation.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getSerial() {
    return serial;
  }

  /**
   * Set the unique reference of the Organisation associated with the current
   * Organisation.
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
   * @param value An instances of type {@link TimeFrame}
   * @return The current RelatedOrg object instance
   * @since 3.1.0
   */
  public RelatedOrg withTimeFrame(TimeFrame value) {
    setTimeFrame(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Quantity}
   * @return The current RelatedOrg object instance
   * @since 3.1.0
   */
  public RelatedOrg withQuantity(Quantity value) {
    setQuantity(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TDateTime}
   * @return The current RelatedOrg object instance
   * @since 3.1.0
   */
  public RelatedOrg withEffDate(TDateTime value) {
    setEffDate(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TDateTime}
   * @return The current RelatedOrg object instance
   * @since 3.1.0
   */
  public RelatedOrg withExpire(TDateTime value) {
    setExpire(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RelatedOrg object instance
   * @since 3.1.0
   */
  public RelatedOrg withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set the type of relationship.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RelatedOrg object instance
   * @since 3.1.0
   */
  public RelatedOrg withType(String value) {
    setType(value);
    return this;
  }

  /**
   * Set the relationship between the two organisations.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RelatedOrg object instance
   * @since 3.1.0
   */
  public RelatedOrg withRelation(String value) {
    setRelation(value);
    return this;
  }

  /**
   * Set the unique reference of the Organisation associated with the current
   * Organisation.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RelatedOrg object instance
   * @since 3.1.0
   */
  public RelatedOrg withSerial(String value) {
    setSerial(value);
    return this;
  }

  /**
   * Get a string representation of this RelatedOrg instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "RelatedOrg {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RelatedOrg} requires
   * {@link null relation}, {@link null serial}, {@link null type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetRelation() && isSetSerial() && isSetType();
  }

}
