/* 
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
 * Contact is the XML root for all parameters of a Contact.
 * <p>
 * Sub-Elements are {@link Address}, {@link Email}, {@link TelephoneFax}
 * <p>
 * Example:
 * <pre>
 * &lt;Contact cls="U"&gt;
 *   &lt;Serial cls="U"&gt;USA:AF:CN:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2004-05-20T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;FirstName cls="U"&gt;John&lt;/FirstName&gt;
 *   &lt;LastName cls="U"&gt;Doe&lt;/LastName&gt;
 *   &lt;TelephoneFax&gt;
 *     &lt;Number cls="U"&gt;(123)456.789&lt;/Number&gt;
 *   &lt;/TelephoneFax&gt;
 * &lt;/Contact&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TContact", propOrder = {
  "datasetCls",
  "compartment",
  "handling",
  "releasableTo",
  "effDate",
  "expire",
  "review",
  "project",
  "organisationRef",
  "address",
  "telephoneFax",
  "email",
  "remarks"
})
public class Contact {

  @XmlElement(name = "DatasetCls", required = true)
  protected DatasetCls datasetCls;

  @XmlElement(name = "Compartment")
  protected List<Compartment> compartment;

  @XmlElement(name = "Handling")
  protected List<Handling> handling;

  @XmlElement(name = "ReleasableTo")
  protected List<ReleasableTo> releasableTo;

  @XmlElement(name = "EffDate", required = true)
  protected TDateTime effDate;

  @XmlElement(name = "Expire")
  protected TDateTime expire;
  /**
   * ReviewDate - Review Date (Optional)
   * <p>
   * The date by which the dataset is to be reviewed. The Review date should be
   * less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
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
  protected List<Project> project;

  @XmlElement(name = "OrganisationRef")
  protected List<ElmRef> organisationRef;
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
  protected List<TelephoneFax> telephoneFax;
  /**
   * Email (Optional)
   * <p>
   * Email contains the email address of the Contact or Role.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Email")
  protected List<Email> email;
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
  protected List<Remarks> remarks;
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
   * TitleRank - Title or Rank (Optional)
   * <p>
   * The contact title or rank e.g., Ms, Col, etc.
   * <p>
   * Format is S10
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "title")
  protected String title;
  /**
   * FirstName - First Name (Optional)
   * <p>
   * The first name of the contact individual.
   * <p>
   * Format is S30
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "firstName")
  protected String firstName;
  /**
   * LastName - Last Name (Optional)
   * <p>
   * The last name of the contact individual.
   * <p>
   * Format is S30
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "lastName")
  protected String lastName;

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
   * @return a {@link Compartment} instance
   * @since 3.1.0
   */
  public List<Compartment> getCompartment() {
    if (compartment == null) {
      compartment = new ArrayList<>();
    }
    return this.compartment;
  }

  public boolean isSetCompartment() {
    return ((this.compartment != null) && (!this.compartment.isEmpty()));
  }

  /**
   * Clear the Compartment field. This sets the field to null.
   */
  public void unsetCompartment() {
    this.compartment = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link Handling} instance
   * @since 3.1.0
   */
  public List<Handling> getHandling() {
    if (handling == null) {
      handling = new ArrayList<>();
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
  public List<ReleasableTo> getReleasableTo() {
    if (releasableTo == null) {
      releasableTo = new ArrayList<>();
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
   * Supportability datasets, this date indicate when the organisation
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
   * Supportability datasets, this date indicate when the organisation
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
  public List<Project> getProject() {
    if (project == null) {
      project = new ArrayList<>();
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
   * Get
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public List<ElmRef> getOrganisationRef() {
    if (organisationRef == null) {
      organisationRef = new ArrayList<>();
    }
    return this.organisationRef;
  }

  public boolean isSetOrganisationRef() {
    return ((this.organisationRef != null) && (!this.organisationRef.isEmpty()));
  }

  /**
   * Clear the OrganisationRef field. This sets the field to null.
   */
  public void unsetOrganisationRef() {
    this.organisationRef = null;
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
  public List<TelephoneFax> getTelephoneFax() {
    if (telephoneFax == null) {
      telephoneFax = new ArrayList<>();
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
  public List<Email> getEmail() {
    if (email == null) {
      email = new ArrayList<>();
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
   * Get a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @return a {@link Remarks} instance
   * @since 3.1.0
   */
  public List<Remarks> getRemarks() {
    if (remarks == null) {
      remarks = new ArrayList<>();
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
   * Get the contact title or rank e.g., Ms, Col, etc.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getTitle() {
    return title;
  }

  /**
   * Set the contact title or rank e.g., Ms, Col, etc.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setTitle(String value) {
    this.title = value;
  }

  public boolean isSetTitle() {
    return (this.title != null);
  }

  /**
   * Get the first name of the contact individual.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Set the first name of the contact individual.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setFirstName(String value) {
    this.firstName = value;
  }

  public boolean isSetFirstName() {
    return (this.firstName != null);
  }

  /**
   * Get the last name of the contact individual.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Set the last name of the contact individual.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setLastName(String value) {
    this.lastName = value;
  }

  public boolean isSetLastName() {
    return (this.lastName != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link DatasetCls}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withDatasetCls(DatasetCls value) {
    setDatasetCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Compartment...}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withCompartment(Compartment... values) {
    if (values != null) {
      getCompartment().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Compartment} instances
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withCompartment(Collection<Compartment> values) {
    if (values != null) {
      getCompartment().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Handling...}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withHandling(Handling... values) {
    if (values != null) {
      getHandling().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Handling} instances
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withHandling(Collection<Handling> values) {
    if (values != null) {
      getHandling().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ReleasableTo...}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withReleasableTo(ReleasableTo... values) {
    if (values != null) {
      getReleasableTo().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ReleasableTo} instances
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withReleasableTo(Collection<ReleasableTo> values) {
    if (values != null) {
      getReleasableTo().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TDateTime}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withEffDate(TDateTime value) {
    setEffDate(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TDateTime}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withExpire(TDateTime value) {
    setExpire(value);
    return this;
  }

  /**
   * Set the date by which the dataset is to be reviewed. The Review date should
   * be less than five years from the effective date. In Data Item Spectrum
   * Supportability datasets, this date indicate when the organisation
   * responsible for re-initiating host coordination plans to resubmit a
   * Spectrum Supportability request to the host nation for continued use of the
   * equipment.
   * <p>
   * @param value An instances of type {@link TDateTime}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withReview(TDateTime value) {
    setReview(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Project...}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withProject(Project... values) {
    if (values != null) {
      getProject().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Project} instances
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withProject(Collection<Project> values) {
    if (values != null) {
      getProject().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ElmRef...}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withOrganisationRef(ElmRef... values) {
    if (values != null) {
      getOrganisationRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link OrganisationRef} instances
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withOrganisationRef(Collection<ElmRef> values) {
    if (values != null) {
      getOrganisationRef().addAll(values);
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
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withAddress(Address value) {
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
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withTelephoneFax(TelephoneFax... values) {
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
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withTelephoneFax(Collection<TelephoneFax> values) {
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
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withEmail(Email... values) {
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
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withEmail(Collection<Email> values) {
    if (values != null) {
      getEmail().addAll(values);
    }
    return this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values One or more instances of type {@link Remarks...}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withRemarks(Remarks... values) {
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
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withRemarks(Collection<Remarks> values) {
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
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withSerial(String value) {
    setSerial(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withEntry(Calendar value) {
    setEntry(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withEntry(Date value) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.setTime(value);
    setEntry(calendar);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withLastMod(Calendar value) {
    setLastMod(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withLastMod(Date value) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.setTime(value);
    setLastMod(calendar);
    return this;
  }

  /**
   * Set the contact title or rank e.g., Ms, Col, etc.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withTitle(String value) {
    setTitle(value);
    return this;
  }

  /**
   * Set the first name of the contact individual.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withFirstName(String value) {
    setFirstName(value);
    return this;
  }

  /**
   * Set the last name of the contact individual.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Contact object instance
   * @since 3.1.0
   */
  public Contact withLastName(String value) {
    setLastName(value);
    return this;
  }

  /**
   * Get a string representation of this Contact instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Contact {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Contact} requires
   * {@link null DatasetCls}, {@link null EffDate}, {@link null entry}, {@link null serial}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetDatasetCls() && isSetEffDate() && isSetEntry() && isSetSerial();
  }

}
