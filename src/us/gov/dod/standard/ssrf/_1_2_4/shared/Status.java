package us.gov.dod.standard.ssrf._1_2_4.shared;

import java.util.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._1_2_4.adapter.*;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListST;

/**
 * Status
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TStatus", propOrder = {
  "infoTo"
})
public class Status {

  @XmlElement(name = "InfoTo")
  protected Set<Status.InfoTo> infoTo;
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
   * US:State - State (Required)
   * <p>
   * The action performed for this status log entry.
   * <p>
   * Format is L:UST
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "state", required = true)
  protected ListST state;
  /**
   * US:DateTime - DateTime (Required)
   * <p>
   * The date and UTC time of this status log entry.
   * <p>
   * Format is DateTime
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "dateTime", required = true)
  @XmlJavaTypeAdapter(XmlAdapterDATETIME.class)
  @XmlSchemaType(name = "dateTime")
  protected Calendar dateTime;

  @XmlAttribute(name = "byContact")
  protected String byContact;

  @XmlAttribute(name = "byRole")
  protected String byRole;

  @XmlAttribute(name = "fromContact")
  protected String fromContact;

  @XmlAttribute(name = "fromRole")
  protected String fromRole;

  @XmlAttribute(name = "toContact")
  protected String toContact;

  @XmlAttribute(name = "toRole")
  protected String toRole;

  public Set<Status.InfoTo> getInfoTo() {
    if (infoTo == null) {
      infoTo = new HashSet<>();
    }
    return this.infoTo;
  }

  public boolean isSetInfoTo() {
    return ((this.infoTo != null) && (!this.infoTo.isEmpty()));
  }

  /**
   * Clear the InfoTo field. This sets the field to null.
   */
  public void unsetInfoTo() {
    this.infoTo = null;
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
   * Get the action performed for this status log entry.
   * <p>
   * @return a {@link ListST} instance
   * @since 3.1.0
   */
  public ListST getState() {
    return state;
  }

  /**
   * Set the action performed for this status log entry.
   * <p>
   * @param value a {@link ListST} instance
   * @since 3.1.0
   */
  public void setState(ListST value) {
    this.state = value;
  }

  public boolean isSetState() {
    return (this.state != null);
  }

  /**
   * Get the date and UTC time of this status log entry.
   * <p>
   * @return a {@link Calendar} instance
   * @since 3.1.0
   */
  public Calendar getDateTime() {
    return dateTime;
  }

  /**
   * Set the date and UTC time of this status log entry.
   * <p>
   * @param value a {@link Calendar} instance
   * @since 3.1.0
   */
  public void setDateTime(Calendar value) {
    this.dateTime = value;
  }

  public boolean isSetDateTime() {
    return (this.dateTime != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getByContact() {
    return byContact;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setByContact(String value) {
    this.byContact = value;
  }

  public boolean isSetByContact() {
    return (this.byContact != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getByRole() {
    return byRole;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setByRole(String value) {
    this.byRole = value;
  }

  public boolean isSetByRole() {
    return (this.byRole != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getFromContact() {
    return fromContact;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setFromContact(String value) {
    this.fromContact = value;
  }

  public boolean isSetFromContact() {
    return (this.fromContact != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getFromRole() {
    return fromRole;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setFromRole(String value) {
    this.fromRole = value;
  }

  public boolean isSetFromRole() {
    return (this.fromRole != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getToContact() {
    return toContact;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setToContact(String value) {
    this.toContact = value;
  }

  public boolean isSetToContact() {
    return (this.toContact != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getToRole() {
    return toRole;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setToRole(String value) {
    this.toRole = value;
  }

  public boolean isSetToRole() {
    return (this.toRole != null);
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Status.InfoTo...}
   * @return The current Status object instance
   * @since 3.1.0
   */
  public Status withInfoTo(Status.InfoTo... values) {
    if (values != null) {
      getInfoTo().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link InfoTo} instances
   * @return The current Status object instance
   * @since 3.1.0
   */
  public Status withInfoTo(Collection<Status.InfoTo> values) {
    if (values != null) {
      getInfoTo().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Status object instance
   * @since 3.1.0
   */
  public Status withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set the action performed for this status log entry.
   * <p>
   * @param value An instances of type {@link ListST}
   * @return The current Status object instance
   * @since 3.1.0
   */
  public Status withState(ListST value) {
    setState(value);
    return this;
  }

  /**
   * Set the date and UTC time of this status log entry.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Status object instance
   * @since 3.1.0
   */
  public Status withDateTime(Calendar value) {
    setDateTime(value);
    return this;
  }

  /**
   * Set the date and UTC time of this status log entry.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Status object instance
   * @since 3.1.0
   */
  public Status withDateTime(Date value) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.setTime(value);
    setDateTime(calendar);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Status object instance
   * @since 3.1.0
   */
  public Status withByContact(String value) {
    setByContact(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Status object instance
   * @since 3.1.0
   */
  public Status withByRole(String value) {
    setByRole(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Status object instance
   * @since 3.1.0
   */
  public Status withFromContact(String value) {
    setFromContact(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Status object instance
   * @since 3.1.0
   */
  public Status withFromRole(String value) {
    setFromRole(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Status object instance
   * @since 3.1.0
   */
  public Status withToContact(String value) {
    setToContact(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Status object instance
   * @since 3.1.0
   */
  public Status withToRole(String value) {
    setToRole(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class InfoTo {

    /**
     * cls - Classification (Required)
     * <p>
     * The classification of the current data item. This attribute is REQUIRED
     * on each data item, even if the classification is "U".
     * <p>
     * Format is L:CCL
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "cls")
    protected String cls;

    @XmlAttribute(name = "toContact")
    protected String toContact;

    @XmlAttribute(name = "toRole")
    protected String toRole;

    /**
     * Get the classification of the current data item. This attribute is
     * REQUIRED on each data item, even if the classification is "U".
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getCls() {
      return cls;
    }

    /**
     * Set the classification of the current data item. This attribute is
     * REQUIRED on each data item, even if the classification is "U".
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
    public String getToContact() {
      return toContact;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setToContact(String value) {
      this.toContact = value;
    }

    public boolean isSetToContact() {
      return (this.toContact != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getToRole() {
      return toRole;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setToRole(String value) {
      this.toRole = value;
    }

    public boolean isSetToRole() {
      return (this.toRole != null);
    }

    public Status.InfoTo withCls(String value) {
      setCls(value);
      return this;
    }

    public Status.InfoTo withToContact(String value) {
      setToContact(value);
      return this;
    }

    public Status.InfoTo withToRole(String value) {
      setToRole(value);
      return this;
    }

  }

  /**
   * Get a string representation of this Status instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Status {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Status} requires {@link null dateTime}, {@link null state}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetDateTime() && isSetState();
  }

}
