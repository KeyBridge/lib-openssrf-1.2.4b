package us.gov.dod.standard.ssrf._1_2_4;

import java.util.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._1_2_4.adapter.XmlAdapterDATE;
import us.gov.dod.standard.ssrf._1_2_4.adapter.XmlAdapterDATETIME;
import us.gov.dod.standard.ssrf._1_2_4.common.DatasetCls;
import us.gov.dod.standard.ssrf._1_2_4.organisation.Email;
import us.gov.dod.standard.ssrf._1_2_4.organisation.TelephoneFax;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;

/**
 * Role is the XML root for all parameters of a Role (position or role
 * representing an organisational user of the system; also known as Job Account
 * in the USA).
 * <p>
 * Sub-Elements are
 * {@link Address}, {@link ContactRef}, {@link Email}, {@link TelephoneFax}
 * <p>
 * Example:
 * <pre>
 * &lt;Role cls="U"&gt;
 *   &lt;Serial cls="U"&gt;USA::JA:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-12T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Name cls="U"&gt;EUCOM FMFO&lt;/Name&gt;
 *   &lt;Country cls="U"&gt;USA&lt;/Country&gt;
 *   &lt;ContactRef cls="U"&gt;USA:EU:CN:1&lt;/ContactRef&gt;
 * &lt;/Role&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRole", propOrder = {
  "datasetCls",
  "handling",
  "releasableTo",
  "effDate",
  "expire",
  "review",
  "project",
  "address",
  "telephoneFax",
  "email",
  "organisationRef",
  "contactRef",
  "remarks"
})
public class Role {

  @XmlElement(name = "DatasetCls", required = true)
  protected DatasetCls datasetCls;

  @XmlElement(name = "Handling")
  protected Set<Handling> handling;

  @XmlElement(name = "ReleasableTo")
  protected Set<ReleasableTo> releasableTo;

  @XmlElement(name = "EffDate", required = true)
  protected TDateTime effDate;

  @XmlElement(name = "Expire")
  protected TDateTime expire;
  /**
   * ReviewDate - Review Date (Optional)
   * <p>
   * The date by which the dataset is to be reviewed. The Review date should be
   * less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * Format is Date
   * <p>
   * Attribute group ExpireReview (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Review")
  protected TDateTime review;

  @XmlElement(name = "Project")
  protected Set<Project> project;
  /**
   * Address (Optional)
   * <p>
   * Address contains the address of a Contact, Organisation or Role.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Address")
  protected Address address;
  /**
   * TelephoneFax (Optional)
   * <p>
   * TelephoneFax reflects the telephone and/or telefax number(s) of the
   * Contact, Organisation or Role.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "TelephoneFax")
  protected Set<TelephoneFax> telephoneFax;
  /**
   * Email (Optional)
   * <p>
   * Email contains the email address of the Contact or Role.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Email")
  protected Set<Email> email;

  @XmlElement(name = "OrganisationRef", required = true)
  protected ElmRef organisationRef;
  /**
   * ContactRef (Optional)
   * <p>
   * ContactRef references a Contact.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ContactRef")
  protected Set<ElmRef> contactRef;
  /**
   * remarks - Links to Data Item Remarks (Optional)
   * <p>
   * A list of Common/Remarks idx values applicable to the current data item.
   * <p>
   * Format is List of UN6
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Remarks")
  protected Set<Remarks> remarks;
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

  @XmlAttribute(name = "entry", required = true)
  @XmlJavaTypeAdapter(XmlAdapterDATE.class)
  @XmlSchemaType(name = "date")
  protected Calendar entry;

  @XmlAttribute(name = "lastMod")
  @XmlJavaTypeAdapter(XmlAdapterDATETIME.class)
  @XmlSchemaType(name = "dateTime")
  protected Calendar lastMod;
  /**
   * Name - Role Name (Required)
   * <p>
   * The name or function of the Role. The name SHOULD be unique within the
   * agency.
   * <p>
   * Format is S50
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "name", required = true)
  protected String name;

  /**
   * Get
   * <p>
   * @return a {@link DatasetCls} instance
   * @since 3.1.0
   */
  public DatasetCls getDatasetCls() {
    return datasetCls;
  }

  /**
   * Set
   * <p>
   * @param value a {@link DatasetCls} instance
   * @since 3.1.0
   */
  public void setDatasetCls(DatasetCls value) {
    this.datasetCls = value;
  }

  public boolean isSetDatasetCls() {
    return (this.datasetCls != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Handling} instance
   * @since 3.1.0
   */
  public Set<Handling> getHandling() {
    if (handling == null) {
      handling = new HashSet<>();
    }
    return this.handling;
  }

  public boolean isSetHandling() {
    return ((this.handling != null) && (!this.handling.isEmpty()));
  }

  /**
   * Clear the Handling field. This sets the field to null.
   */
  public void unsetHandling() {
    this.handling = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link ReleasableTo} instance
   * @since 3.1.0
   */
  public Set<ReleasableTo> getReleasableTo() {
    if (releasableTo == null) {
      releasableTo = new HashSet<>();
    }
    return this.releasableTo;
  }

  public boolean isSetReleasableTo() {
    return ((this.releasableTo != null) && (!this.releasableTo.isEmpty()));
  }

  /**
   * Clear the ReleasableTo field. This sets the field to null.
   */
  public void unsetReleasableTo() {
    this.releasableTo = null;
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
   * Get the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @return the Review value in a {@link TDateTime} data type
   * @since 3.1.0
   */
  public TDateTime getReview() {
    return review;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value the Review value in a {@link TDateTime} data type
   * @since 3.1.0
   */
  public void setReview(TDateTime value) {
    this.review = value;
  }

  public boolean isSetReview() {
    return (this.review != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Project} instance
   * @since 3.1.0
   */
  public Set<Project> getProject() {
    if (project == null) {
      project = new HashSet<>();
    }
    return this.project;
  }

  public boolean isSetProject() {
    return ((this.project != null) && (!this.project.isEmpty()));
  }

  /**
   * Clear the Project field. This sets the field to null.
   */
  public void unsetProject() {
    this.project = null;
  }

  /**
   * Get the Address
   * <p>
   * Complex element Address contains the address of a Contact, Organisation or
   * Role.
   * <p>
   * @return a {@link Address} instance
   * @since 3.1.0
   */
  public Address getAddress() {
    return address;
  }

  /**
   * Set the Address
   * <p>
   * Complex element Address contains the address of a Contact, Organisation or
   * Role.
   * <p>
   * @param value a {@link Address} instance
   * @since 3.1.0
   */
  public void setAddress(Address value) {
    this.address = value;
  }

  public boolean isSetAddress() {
    return (this.address != null);
  }

  /**
   * Get the TelephoneFax
   * <p>
   * Complex element TelephoneFax reflects the telephone and/or telefax
   * number(s) of the Contact, Organisation or Role.
   * <p>
   * @return a {@link TelephoneFax} instance
   * @since 3.1.0
   */
  public Set<TelephoneFax> getTelephoneFax() {
    if (telephoneFax == null) {
      telephoneFax = new HashSet<>();
    }
    return this.telephoneFax;
  }

  public boolean isSetTelephoneFax() {
    return ((this.telephoneFax != null) && (!this.telephoneFax.isEmpty()));
  }

  /**
   * Clear the TelephoneFax field. This sets the field to null.
   */
  public void unsetTelephoneFax() {
    this.telephoneFax = null;
  }

  /**
   * Get the Email
   * <p>
   * Complex element Email contains the email address of the Contact or Role.
   * <p>
   * @return a {@link Email} instance
   * @since 3.1.0
   */
  public Set<Email> getEmail() {
    if (email == null) {
      email = new HashSet<>();
    }
    return this.email;
  }

  public boolean isSetEmail() {
    return ((this.email != null) && (!this.email.isEmpty()));
  }

  /**
   * Clear the Email field. This sets the field to null.
   */
  public void unsetEmail() {
    this.email = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public ElmRef getOrganisationRef() {
    return organisationRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ElmRef} instance
   * @since 3.1.0
   */
  public void setOrganisationRef(ElmRef value) {
    this.organisationRef = value;
  }

  public boolean isSetOrganisationRef() {
    return (this.organisationRef != null);
  }

  /**
   * Get the ContactRef
   * <p>
   * Complex element ContactRef references a Contact.
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public Set<ElmRef> getContactRef() {
    if (contactRef == null) {
      contactRef = new HashSet<>();
    }
    return this.contactRef;
  }

  public boolean isSetContactRef() {
    return ((this.contactRef != null) && (!this.contactRef.isEmpty()));
  }

  /**
   * Clear the ContactRef field. This sets the field to null.
   */
  public void unsetContactRef() {
    this.contactRef = null;
  }

  /**
   * Get a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @return a {@link Remarks} instance
   * @since 3.1.0
   */
  public Set<Remarks> getRemarks() {
    if (remarks == null) {
      remarks = new HashSet<>();
    }
    return this.remarks;
  }

  public boolean isSetRemarks() {
    return ((this.remarks != null) && (!this.remarks.isEmpty()));
  }

  /**
   * Clear the Remarks field. This sets the field to null.
   */
  public void unsetRemarks() {
    this.remarks = null;
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
   * Get
   * <p>
   * @return a {@link Calendar} instance
   * @since 3.1.0
   */
  public Calendar getEntry() {
    return entry;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Calendar} instance
   * @since 3.1.0
   */
  public void setEntry(Calendar value) {
    this.entry = value;
  }

  public boolean isSetEntry() {
    return (this.entry != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Calendar} instance
   * @since 3.1.0
   */
  public Calendar getLastMod() {
    return lastMod;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Calendar} instance
   * @since 3.1.0
   */
  public void setLastMod(Calendar value) {
    this.lastMod = value;
  }

  public boolean isSetLastMod() {
    return (this.lastMod != null);
  }

  /**
   * Get the name or function of the Role. The name SHOULD be unique within the
   * agency.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getName() {
    return name;
  }

  /**
   * Set the name or function of the Role. The name SHOULD be unique within the
   * agency.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setName(String value) {
    this.name = value;
  }

  public boolean isSetName() {
    return (this.name != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link DatasetCls}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withDatasetCls(DatasetCls value) {
    setDatasetCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Handling...}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withHandling(Handling... values) {
    if (values != null) {
      getHandling().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Handling} instances
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withHandling(Collection<Handling> values) {
    if (values != null) {
      getHandling().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ReleasableTo...}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withReleasableTo(ReleasableTo... values) {
    if (values != null) {
      getReleasableTo().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ReleasableTo} instances
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withReleasableTo(Collection<ReleasableTo> values) {
    if (values != null) {
      getReleasableTo().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TDateTime}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withEffDate(TDateTime value) {
    setEffDate(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TDateTime}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withExpire(TDateTime value) {
    setExpire(value);
    return this;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicates when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value An instances of type {@link TDateTime}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withReview(TDateTime value) {
    setReview(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Project...}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withProject(Project... values) {
    if (values != null) {
      getProject().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Project} instances
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withProject(Collection<Project> values) {
    if (values != null) {
      getProject().addAll(values);
    }
    return this;
  }

  /**
   * Set the Address
   * <p>
   * Complex element Address contains the address of a Contact, Organisation or
   * Role.
   * <p>
   * @param value An instances of type {@link Address}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withAddress(Address value) {
    setAddress(value);
    return this;
  }

  /**
   * Set the TelephoneFax
   * <p>
   * Complex element TelephoneFax reflects the telephone and/or telefax
   * number(s) of the Contact, Organisation or Role.
   * <p>
   * @param values One or more instances of type {@link TelephoneFax...}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withTelephoneFax(TelephoneFax... values) {
    if (values != null) {
      getTelephoneFax().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the TelephoneFax
   * <p>
   * Complex element TelephoneFax reflects the telephone and/or telefax
   * number(s) of the Contact, Organisation or Role.
   * <p>
   * @param values A collection of {@link TelephoneFax} instances
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withTelephoneFax(Collection<TelephoneFax> values) {
    if (values != null) {
      getTelephoneFax().addAll(values);
    }
    return this;
  }

  /**
   * Set the Email
   * <p>
   * Complex element Email contains the email address of the Contact or Role.
   * <p>
   * @param values One or more instances of type {@link Email...}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withEmail(Email... values) {
    if (values != null) {
      getEmail().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Email
   * <p>
   * Complex element Email contains the email address of the Contact or Role.
   * <p>
   * @param values A collection of {@link Email} instances
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withEmail(Collection<Email> values) {
    if (values != null) {
      getEmail().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ElmRef}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withOrganisationRef(ElmRef value) {
    setOrganisationRef(value);
    return this;
  }

  /**
   * Set the ContactRef
   * <p>
   * Complex element ContactRef references a Contact.
   * <p>
   * @param values One or more instances of type {@link ElmRef...}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withContactRef(ElmRef... values) {
    if (values != null) {
      getContactRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the ContactRef
   * <p>
   * Complex element ContactRef references a Contact.
   * <p>
   * @param values A collection of {@link ContactRef} instances
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withContactRef(Collection<ElmRef> values) {
    if (values != null) {
      getContactRef().addAll(values);
    }
    return this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values One or more instances of type {@link Remarks...}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withRemarks(Remarks... values) {
    if (values != null) {
      getRemarks().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values A collection of {@link Remarks} instances
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withRemarks(Collection<Remarks> values) {
    if (values != null) {
      getRemarks().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withSerial(String value) {
    setSerial(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withEntry(Calendar value) {
    setEntry(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withEntry(Date value) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.setTime(value);
    setEntry(calendar);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withLastMod(Calendar value) {
    setLastMod(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withLastMod(Date value) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.setTime(value);
    setLastMod(calendar);
    return this;
  }

  /**
   * Set the name or function of the Role. The name SHOULD be unique within the
   * agency.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Role object instance
   * @since 3.1.0
   */
  public Role withName(String value) {
    setName(value);
    return this;
  }

  /**
   * Get a string representation of this Role instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Role {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Role} requires
   * {@link null DatasetCls}, {@link null EffDate}, {@link null OrganisationRef}, {@link null entry}, {@link null name}, {@link null serial}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetDatasetCls() && isSetEffDate() && isSetOrganisationRef() && isSetEntry() && isSetName() && isSetSerial();
  }

}
