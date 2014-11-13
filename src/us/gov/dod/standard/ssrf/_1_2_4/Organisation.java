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
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListAO;
import us.gov.dod.standard.ssrf._1_2_4.organisation.Email;
import us.gov.dod.standard.ssrf._1_2_4.organisation.RelatedOrg;
import us.gov.dod.standard.ssrf._1_2_4.organisation.TelephoneFax;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;

/**
 * Organisation is the XML root for all parameters of an Organisation (service,
 * agency, manufacturer, etc).
 * <p>
 * Sub-Elements are
 * {@link Address}, {@link Email}, {@link RelatedOrganisation}, {@link RoleRef}, {@link TelephoneFax}
 * <p>
 * Example:
 * <pre>
 * &lt;Organisation cls="U"&gt;
 *   &lt;Serial cls="U"&gt;DEU:AF:OR:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-12T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Name cls="U"&gt;LUFTWAFFE&lt;/Name&gt;
 *   &lt;Address&gt;
 *     &lt;CityArea cls="U"&gt;Berlin&lt;/CityArea&gt;
 *     &lt;Country cls="U"&gt;DEU&lt;/Country&gt;
 *   &lt;/Address&gt;
 * &lt;/Organisation&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOrganisation", propOrder = {
  "datasetCls",
  "compartment",
  "handling",
  "releasableTo",
  "effDate",
  "expire",
  "review",
  "title",
  "project",
  "relatedOrg",
  "remarks"
})
public class Organisation {

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

  @XmlElement(name = "Title")
  protected List<Title> title;

  @XmlElement(name = "Project")
  protected List<Project> project;

  @XmlElement(name = "RelatedOrg")
  protected List<RelatedOrg> relatedOrg;
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
   * Type - Type (Optional)
   * <p>
   * The type of relationship.
   * <p>
   * Format is L:CFT
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "type")
  protected String type;

  @XmlAttribute(name = "entry", required = true)
  @XmlJavaTypeAdapter(XmlAdapterDATE.class)
  @XmlSchemaType(name = "date")
  protected Calendar entry;

  @XmlAttribute(name = "lastMod")
  @XmlJavaTypeAdapter(XmlAdapterDATETIME.class)
  @XmlSchemaType(name = "dateTime")
  protected Calendar lastMod;

  @XmlAttribute(name = "country", required = true)
  protected ListAO country;

  @XmlAttribute(name = "orgCode", required = true)
  protected String orgCode;
  /**
   * AlternateName - Alternate Name (Optional)
   * <p>
   * An alternate name or nickname for the organisation.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "name")
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
   * @return a {@link Title} instance
   * @since 3.1.0
   */
  public List<Title> getTitle() {
    if (title == null) {
      title = new ArrayList<>();
    }
    return this.title;
  }

  public boolean isSetTitle() {
    return ((this.title != null) && (!this.title.isEmpty()));
  }

  /**
   * Clear the Title field. This sets the field to null.
   */
  public void unsetTitle() {
    this.title = null;
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
   * @return a {@link RelatedOrg} instance
   * @since 3.1.0
   */
  public List<RelatedOrg> getRelatedOrg() {
    if (relatedOrg == null) {
      relatedOrg = new ArrayList<>();
    }
    return this.relatedOrg;
  }

  public boolean isSetRelatedOrg() {
    return ((this.relatedOrg != null) && (!this.relatedOrg.isEmpty()));
  }

  /**
   * Clear the RelatedOrg field. This sets the field to null.
   */
  public void unsetRelatedOrg() {
    this.relatedOrg = null;
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
   * Get
   * <p>
   * @return a {@link ListAO} instance
   * @since 3.1.0
   */
  public ListAO getCountry() {
    return country;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ListAO} instance
   * @since 3.1.0
   */
  public void setCountry(ListAO value) {
    this.country = value;
  }

  public boolean isSetCountry() {
    return (this.country != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getOrgCode() {
    return orgCode;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setOrgCode(String value) {
    this.orgCode = value;
  }

  public boolean isSetOrgCode() {
    return (this.orgCode != null);
  }

  /**
   * Get an alternate name or nickname for the organisation.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getName() {
    return name;
  }

  /**
   * Set an alternate name or nickname for the organisation.
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
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withDatasetCls(DatasetCls value) {
    setDatasetCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Compartment...}
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withCompartment(Compartment... values) {
    if (values != null) {
      getCompartment().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Compartment} instances
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withCompartment(Collection<Compartment> values) {
    if (values != null) {
      getCompartment().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Handling...}
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withHandling(Handling... values) {
    if (values != null) {
      getHandling().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Handling} instances
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withHandling(Collection<Handling> values) {
    if (values != null) {
      getHandling().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ReleasableTo...}
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withReleasableTo(ReleasableTo... values) {
    if (values != null) {
      getReleasableTo().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ReleasableTo} instances
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withReleasableTo(Collection<ReleasableTo> values) {
    if (values != null) {
      getReleasableTo().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TDateTime}
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withEffDate(TDateTime value) {
    setEffDate(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TDateTime}
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withExpire(TDateTime value) {
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
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withReview(TDateTime value) {
    setReview(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Title...}
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withTitle(Title... values) {
    if (values != null) {
      getTitle().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Title} instances
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withTitle(Collection<Title> values) {
    if (values != null) {
      getTitle().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Project...}
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withProject(Project... values) {
    if (values != null) {
      getProject().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Project} instances
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withProject(Collection<Project> values) {
    if (values != null) {
      getProject().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link RelatedOrg...}
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withRelatedOrg(RelatedOrg... values) {
    if (values != null) {
      getRelatedOrg().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link RelatedOrg} instances
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withRelatedOrg(Collection<RelatedOrg> values) {
    if (values != null) {
      getRelatedOrg().addAll(values);
    }
    return this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values One or more instances of type {@link Remarks...}
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withRemarks(Remarks... values) {
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
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withRemarks(Collection<Remarks> values) {
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
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set the unique reference of the Organisation associated with the current
   * Organisation.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withSerial(String value) {
    setSerial(value);
    return this;
  }

  /**
   * Set the type of relationship.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withType(String value) {
    setType(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withEntry(Calendar value) {
    setEntry(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withEntry(Date value) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.setTime(value);
    setEntry(calendar);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withLastMod(Calendar value) {
    setLastMod(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withLastMod(Date value) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.setTime(value);
    setLastMod(calendar);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ListAO}
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withCountry(ListAO value) {
    setCountry(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withOrgCode(String value) {
    setOrgCode(value);
    return this;
  }

  /**
   * Set an alternate name or nickname for the organisation.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Organisation object instance
   * @since 3.1.0
   */
  public Organisation withName(String value) {
    setName(value);
    return this;
  }

  /**
   * Get a string representation of this Organisation instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Organisation {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Organisation} requires
   * {@link null DatasetCls}, {@link null EffDate}, {@link null country}, {@link null entry}, {@link null orgCode}, {@link null serial}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetDatasetCls() && isSetEffDate() && isSetCountry() && isSetEntry() && isSetOrgCode() && isSetSerial();
  }

}
