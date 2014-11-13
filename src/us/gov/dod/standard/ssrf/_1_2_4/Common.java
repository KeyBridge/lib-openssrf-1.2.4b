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
import us.gov.dod.standard.ssrf._1_2_4.ceoi.BSMPlan;
import us.gov.dod.standard.ssrf._1_2_4.ceoi.CEOI;
import us.gov.dod.standard.ssrf._1_2_4.ceoi.Dictionary;
import us.gov.dod.standard.ssrf._1_2_4.common.Action;
import us.gov.dod.standard.ssrf._1_2_4.common.DatasetCls;
import us.gov.dod.standard.ssrf._1_2_4.common.ExtReference;
import us.gov.dod.standard.ssrf._1_2_4.forceelement.Route;
import us.gov.dod.standard.ssrf._1_2_4.interference.IntfMitigation;
import us.gov.dod.standard.ssrf._1_2_4.location.LocationSet;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;
import us.gov.dod.standard.ssrf._1_2_4.sspt.OpClearance;
import us.gov.dod.standard.ssrf._1_2_4.sspt.OpClearanceRequest;
import us.gov.dod.standard.ssrf._1_2_4.txrx.SignalDescr;
import us.gov.dod.standard.ssrf._1_2_4.txrx.TxRx;

/**
 * Common is the parent complex element for all Datasets.
 * <p>
 * Sub-Elements are
 * {@link CaseNum}, {@link ExtReferenceRef}, {@link Remarks}, {@link SecurityClass}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCommon", propOrder = {
  "action",
  "datasetCls",
  "compartment",
  "handling",
  "releasableTo",
  "effDate",
  "expire",
  "review",
  "contactOrgRef",
  "status",
  "extRef",
  "legacyNum",
  "project",
  "datasetReplaced",
  "remarks"
})
@XmlSeeAlso({
  BSMPlan.class,
  IntfReport.class,
  LocationSet.class,
  OpClearance.class,
  SignalDescr.class,
  Route.class,
  SSReply.class,
  SSRequest.class,
  AsgnAllot.class,
  ExtReference.class,
  JRFL.class,
  TxRx.class,
  CEOI.class,
  FEDeployment.class,
  ForceElement.class,
  OpClearanceRequest.class,
  Dictionary.class,
  Antenna.class,
  Location.class,
  TOA.class,
  IntfMitigation.class
})
@SuppressWarnings("unchecked")
public abstract class Common<T> {

  @XmlElement(name = "Action")
  protected Action action;

  @XmlElement(name = "DatasetCls", required = true)
  protected DatasetCls datasetCls;

  @XmlElement(name = "Compartment")
  protected List<Compartment> compartment;

  @XmlElement(name = "Handling")
  protected List<Handling> handling;

  @XmlElement(name = "ReleasableTo")
  protected List<ReleasableTo> releasableTo;

  @XmlElement(name = "EffDate")
  protected TDateTime effDate;

  @XmlElement(name = "Expire")
  protected TDateTime expire;
  /**
   * LastReviewBy - Last Review Person RoleRef (Optional)
   * <p>
   * The Role reference serial of the person who last reviewed the dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group LastReview (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Review")
  protected TDateTime review;

  @XmlElement(name = "ContactOrgRef", required = true)
  protected List<ContactOrgRef> contactOrgRef;

  @XmlElement(name = "Status", required = true)
  protected List<Status> status;
  /**
   * extReferences - Links to External References (Optional)
   * <p>
   * A list of Conmmon/ExtReferenceRef idx values applicable to the current data
   * item.
   * <p>
   * Format is List of UN6
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "ExtRef")
  protected List<ExtRef> extRef;

  @XmlElement(name = "LegacyNum")
  protected List<LegacyNum> legacyNum;

  @XmlElement(name = "Project")
  protected List<Project> project;

  @XmlElement(name = "DatasetReplaced")
  protected List<Common.DatasetReplaced> datasetReplaced;
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
   * Serial - Serial (Required)
   * <p>
   * A unique Dataset identifier.
   * <p>
   * Serial is composed of four parts separated by colons (":"). The maximum
   * total length is 29 characters (5+1+4+1+2+1+15). . Part 1 is the Country and
   * is always REQUIRED. It contains one to five alphabetic uppercase characters
   * representing either the ITU country code or the NATO Command code
   * identifying the originator or organisation responsible for maintaining the
   * dataset, as listed in Code List CCY. . Part 2 is the orgCode and is
   * OPTIONAL. It may contain one to four alphanumeric characters (no spaces nor
   * special characters) representing a code for an Organisation within the
   * country or command. It will normally indicate the organisation responsible
   * for maintaining the dataset. Domain naming is left at the discretion of
   * each country, but should be managed by a central authority in the country
   * to allow deconfliction and uniqueness. It should enable the location in the
   * data repository where this dataset information is stored. . Part 3 is the
   * Dataset Type and MUST contain a two-character code from the table in the
   * Introduction section identifying the type of dataset (LO for a Location,
   * etc). . Part 4 is a Serial Identifier and is always REQUIRED. It contains
   * one to fifteen alphanumeric characters (including spaces and special
   * characters), whose meaning is left at the discretion of each domain
   * manager.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group Initial (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "serial", required = true)
  protected String serial;
  /**
   * EntryDateTime - Entry Date/Time (Required)
   * <p>
   * The date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * Format is DateTime
   * <p>
   * Attribute group Initial (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "entry", required = true)
  @XmlJavaTypeAdapter(XmlAdapterDATE.class)
  @XmlSchemaType(name = "date")
  protected Calendar entry;

  @XmlAttribute(name = "lastMod")
  @XmlJavaTypeAdapter(XmlAdapterDATETIME.class)
  @XmlSchemaType(name = "dateTime")
  protected Calendar lastMod;

  @XmlAttribute(name = "usageType")
  protected String usageType;

  /**
   * Get
   * <p>
   * @return a {@link Action} instance
   * @since 3.1.0
   */
  public Action getAction() {
    return action;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Action} instance
   * @since 3.1.0
   */
  public void setAction(Action value) {
    this.action = value;
  }

  public boolean isSetAction() {
    return (this.action != null);
  }

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
   * Get the Role reference serial of the person who last reviewed the dataset.
   * <p>
   * @return the Review value in a {@link TDateTime} data type
   * @since 3.1.0
   */
  public TDateTime getReview() {
    return review;
  }

  /**
   * Set the Role reference serial of the person who last reviewed the dataset.
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
   * @return a {@link ContactOrgRef} instance
   * @since 3.1.0
   */
  public List<ContactOrgRef> getContactOrgRef() {
    if (contactOrgRef == null) {
      contactOrgRef = new ArrayList<>();
    }
    return this.contactOrgRef;
  }

  public boolean isSetContactOrgRef() {
    return ((this.contactOrgRef != null) && (!this.contactOrgRef.isEmpty()));
  }

  /**
   * Clear the ContactOrgRef field. This sets the field to null.
   */
  public void unsetContactOrgRef() {
    this.contactOrgRef = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link Status} instance
   * @since 3.1.0
   */
  public List<Status> getStatus() {
    if (status == null) {
      status = new ArrayList<>();
    }
    return this.status;
  }

  public boolean isSetStatus() {
    return ((this.status != null) && (!this.status.isEmpty()));
  }

  /**
   * Clear the Status field. This sets the field to null.
   */
  public void unsetStatus() {
    this.status = null;
  }

  /**
   * Get a list of Conmmon/ExtReferenceRef idx values applicable to the current
   * data item.
   * <p>
   * @return a {@link ExtRef} instance
   * @since 3.1.0
   */
  public List<ExtRef> getExtRef() {
    if (extRef == null) {
      extRef = new ArrayList<>();
    }
    return this.extRef;
  }

  public boolean isSetExtRef() {
    return ((this.extRef != null) && (!this.extRef.isEmpty()));
  }

  /**
   * Clear the ExtRef field. This sets the field to null.
   */
  public void unsetExtRef() {
    this.extRef = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link LegacyNum} instance
   * @since 3.1.0
   */
  public List<LegacyNum> getLegacyNum() {
    if (legacyNum == null) {
      legacyNum = new ArrayList<>();
    }
    return this.legacyNum;
  }

  public boolean isSetLegacyNum() {
    return ((this.legacyNum != null) && (!this.legacyNum.isEmpty()));
  }

  /**
   * Clear the LegacyNum field. This sets the field to null.
   */
  public void unsetLegacyNum() {
    this.legacyNum = null;
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

  public List<Common.DatasetReplaced> getDatasetReplaced() {
    if (datasetReplaced == null) {
      datasetReplaced = new ArrayList<>();
    }
    return this.datasetReplaced;
  }

  public boolean isSetDatasetReplaced() {
    return ((this.datasetReplaced != null) && (!this.datasetReplaced.isEmpty()));
  }

  /**
   * Clear the DatasetReplaced field. This sets the field to null.
   */
  public void unsetDatasetReplaced() {
    this.datasetReplaced = null;
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
   * Get a unique Dataset identifier.
   * <p>
   * Serial is composed of four parts separated by colons (":"). The maximum
   * total length is 29 characters (5+1+4+1+2+1+15). . Part 1 is the Country and
   * is always REQUIRED. It contains one to five alphabetic uppercase characters
   * representing either the ITU country code or the NATO Command code
   * identifying the originator or organisation responsible for maintaining the
   * dataset, as listed in Code List CCY. . Part 2 is the orgCode and is
   * OPTIONAL. It may contain one to four alphanumeric characters (no spaces nor
   * special characters) representing a code for an Organisation within the
   * country or command. It will normally indicate the organisation responsible
   * for maintaining the dataset. Domain naming is left at the discretion of
   * each country, but should be managed by a central authority in the country
   * to allow deconfliction and uniqueness. It should enable the location in the
   * data repository where this dataset information is stored. . Part 3 is the
   * Dataset Type and MUST contain a two-character code from the table in the
   * Introduction section identifying the type of dataset (LO for a Location,
   * etc). . Part 4 is a Serial Identifier and is always REQUIRED. It contains
   * one to fifteen alphanumeric characters (including spaces and special
   * characters), whose meaning is left at the discretion of each domain
   * manager.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getSerial() {
    return serial;
  }

  /**
   * Set a unique Dataset identifier.
   * <p>
   * Serial is composed of four parts separated by colons (":"). The maximum
   * total length is 29 characters (5+1+4+1+2+1+15). . Part 1 is the Country and
   * is always REQUIRED. It contains one to five alphabetic uppercase characters
   * representing either the ITU country code or the NATO Command code
   * identifying the originator or organisation responsible for maintaining the
   * dataset, as listed in Code List CCY. . Part 2 is the orgCode and is
   * OPTIONAL. It may contain one to four alphanumeric characters (no spaces nor
   * special characters) representing a code for an Organisation within the
   * country or command. It will normally indicate the organisation responsible
   * for maintaining the dataset. Domain naming is left at the discretion of
   * each country, but should be managed by a central authority in the country
   * to allow deconfliction and uniqueness. It should enable the location in the
   * data repository where this dataset information is stored. . Part 3 is the
   * Dataset Type and MUST contain a two-character code from the table in the
   * Introduction section identifying the type of dataset (LO for a Location,
   * etc). . Part 4 is a Serial Identifier and is always REQUIRED. It contains
   * one to fifteen alphanumeric characters (including spaces and special
   * characters), whose meaning is left at the discretion of each domain
   * manager.
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
   * Get the date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * @return a {@link Calendar} instance
   * @since 3.1.0
   */
  public Calendar getEntry() {
    return entry;
  }

  /**
   * Set the date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * @param value a {@link Calendar} instance
   * @since 3.1.0
   */
  public void setEntry(Calendar value) {
    this.entry = value;
  }

  /**
   * Set the date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * @param value a {@link Calendar} instance
   * @since 3.1.0
   */
  public void setEntry(Date value) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.setTime(value);
    this.entry = calendar;
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

  public void setLastMod(Date value) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.setTime(value);
    this.lastMod = calendar;
  }

  public boolean isSetLastMod() {
    return (this.lastMod != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getUsageType() {
    return usageType;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setUsageType(String value) {
    this.usageType = value;
  }

  public boolean isSetUsageType() {
    return (this.usageType != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Action}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withAction(Action value) {
    setAction(value);
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link DatasetCls}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withDatasetCls(DatasetCls value) {
    setDatasetCls(value);
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Compartment...}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withCompartment(Compartment... values) {
    if (values != null) {
      getCompartment().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Compartment} instances
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withCompartment(Collection<Compartment> values) {
    if (values != null) {
      getCompartment().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Handling...}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withHandling(Handling... values) {
    if (values != null) {
      getHandling().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Handling} instances
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withHandling(Collection<Handling> values) {
    if (values != null) {
      getHandling().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ReleasableTo...}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withReleasableTo(ReleasableTo... values) {
    if (values != null) {
      getReleasableTo().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ReleasableTo} instances
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withReleasableTo(Collection<ReleasableTo> values) {
    if (values != null) {
      getReleasableTo().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TDateTime}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withEffDate(TDateTime value) {
    setEffDate(value);
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TDateTime}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withExpire(TDateTime value) {
    setExpire(value);
    return (T) this;
  }

  /**
   * Set the Role reference serial of the person who last reviewed the dataset.
   * <p>
   * @param value An instances of type {@link TDateTime}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withReview(TDateTime value) {
    setReview(value);
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ContactOrgRef...}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withContactOrgRef(ContactOrgRef... values) {
    if (values != null) {
      getContactOrgRef().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ContactOrgRef} instances
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withContactOrgRef(Collection<ContactOrgRef> values) {
    if (values != null) {
      getContactOrgRef().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Status...}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withStatus(Status... values) {
    if (values != null) {
      getStatus().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Status} instances
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withStatus(Collection<Status> values) {
    if (values != null) {
      getStatus().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set a list of Conmmon/ExtReferenceRef idx values applicable to the current
   * data item.
   * <p>
   * @param values One or more instances of type {@link ExtRef...}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withExtRef(ExtRef... values) {
    if (values != null) {
      getExtRef().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set a list of Conmmon/ExtReferenceRef idx values applicable to the current
   * data item.
   * <p>
   * @param values A collection of {@link ExtRef} instances
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withExtRef(Collection<ExtRef> values) {
    if (values != null) {
      getExtRef().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link LegacyNum...}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withLegacyNum(LegacyNum... values) {
    if (values != null) {
      getLegacyNum().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link LegacyNum} instances
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withLegacyNum(Collection<LegacyNum> values) {
    if (values != null) {
      getLegacyNum().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Project...}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withProject(Project... values) {
    if (values != null) {
      getProject().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Project} instances
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withProject(Collection<Project> values) {
    if (values != null) {
      getProject().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type
   *               {@link Common.DatasetReplaced...}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withDatasetReplaced(Common.DatasetReplaced... values) {
    if (values != null) {
      getDatasetReplaced().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link DatasetReplaced} instances
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withDatasetReplaced(Collection<Common.DatasetReplaced> values) {
    if (values != null) {
      getDatasetReplaced().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values One or more instances of type {@link Remarks...}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withRemarks(Remarks... values) {
    if (values != null) {
      getRemarks().addAll(Arrays.asList(values));
    }
    return (T) this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values A collection of {@link Remarks} instances
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withRemarks(Collection<Remarks> values) {
    if (values != null) {
      getRemarks().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withCls(String value) {
    setCls(value);
    return (T) this;
  }

  /**
   * Set a unique Dataset identifier.
   * <p>
   * Serial is composed of four parts separated by colons (":"). The maximum
   * total length is 29 characters (5+1+4+1+2+1+15). . Part 1 is the Country and
   * is always REQUIRED. It contains one to five alphabetic uppercase characters
   * representing either the ITU country code or the NATO Command code
   * identifying the originator or organisation responsible for maintaining the
   * dataset, as listed in Code List CCY. . Part 2 is the orgCode and is
   * OPTIONAL. It may contain one to four alphanumeric characters (no spaces nor
   * special characters) representing a code for an Organisation within the
   * country or command. It will normally indicate the organisation responsible
   * for maintaining the dataset. Domain naming is left at the discretion of
   * each country, but should be managed by a central authority in the country
   * to allow deconfliction and uniqueness. It should enable the location in the
   * data repository where this dataset information is stored. . Part 3 is the
   * Dataset Type and MUST contain a two-character code from the table in the
   * Introduction section identifying the type of dataset (LO for a Location,
   * etc). . Part 4 is a Serial Identifier and is always REQUIRED. It contains
   * one to fifteen alphanumeric characters (including spaces and special
   * characters), whose meaning is left at the discretion of each domain
   * manager.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withSerial(String value) {
    setSerial(value);
    return (T) this;
  }

  /**
   * Set the date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withEntry(Calendar value) {
    setEntry(value);
    return (T) this;
  }

  /**
   * Set the date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withEntry(Date value) {
    setEntry(value);
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withLastMod(Calendar value) {
    setLastMod(value);
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withLastMod(Date value) {
    setLastMod(value);
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withUsageType(String value) {
    setUsageType(value);
    return (T) this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "value"
  })
  public static class DatasetReplaced {

    @XmlValue
    protected String value;
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
    /**
     * Serial - Serial (Required)
     * <p>
     * A unique Dataset identifier.
     * <p>
     * Serial is composed of four parts separated by colons (":"). The maximum
     * total length is 29 characters (5+1+4+1+2+1+15). . Part 1 is the Country
     * and is always REQUIRED. It contains one to five alphabetic uppercase
     * characters representing either the ITU country code or the NATO Command
     * code identifying the originator or organisation responsible for
     * maintaining the dataset, as listed in Code List CCY. . Part 2 is the
     * orgCode and is OPTIONAL. It may contain one to four alphanumeric
     * characters (no spaces nor special characters) representing a code for an
     * Organisation within the country or command. It will normally indicate the
     * organisation responsible for maintaining the dataset. Domain naming is
     * left at the discretion of each country, but should be managed by a
     * central authority in the country to allow deconfliction and uniqueness.
     * It should enable the location in the data repository where this dataset
     * information is stored. . Part 3 is the Dataset Type and MUST contain a
     * two-character code from the table in the Introduction section identifying
     * the type of dataset (LO for a Location, etc). . Part 4 is a Serial
     * Identifier and is always REQUIRED. It contains one to fifteen
     * alphanumeric characters (including spaces and special characters), whose
     * meaning is left at the discretion of each domain manager.
     * <p>
     * Format is pattern (S29)
     * <p>
     * Attribute group Initial (Required)
     * <p>
     * @since 3.1.0
     */
    @XmlAttribute(name = "serial", required = true)
    protected String serial;

    @XmlAttribute(name = "retireDate")
    @XmlJavaTypeAdapter(XmlAdapterDATE.class)
    @XmlSchemaType(name = "date")
    protected Calendar retireDate;

    /**
     * Get a value that is most probably correct.
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getValue() {
      return value;
    }

    /**
     * Set a value that is most probably correct.
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setValue(String value) {
      this.value = value;
    }

    public boolean isSetValue() {
      return (this.value != null);
    }

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
     * Get a unique Dataset identifier.
     * <p>
     * Serial is composed of four parts separated by colons (":"). The maximum
     * total length is 29 characters (5+1+4+1+2+1+15). . Part 1 is the Country
     * and is always REQUIRED. It contains one to five alphabetic uppercase
     * characters representing either the ITU country code or the NATO Command
     * code identifying the originator or organisation responsible for
     * maintaining the dataset, as listed in Code List CCY. . Part 2 is the
     * orgCode and is OPTIONAL. It may contain one to four alphanumeric
     * characters (no spaces nor special characters) representing a code for an
     * Organisation within the country or command. It will normally indicate the
     * organisation responsible for maintaining the dataset. Domain naming is
     * left at the discretion of each country, but should be managed by a
     * central authority in the country to allow deconfliction and uniqueness.
     * It should enable the location in the data repository where this dataset
     * information is stored. . Part 3 is the Dataset Type and MUST contain a
     * two-character code from the table in the Introduction section identifying
     * the type of dataset (LO for a Location, etc). . Part 4 is a Serial
     * Identifier and is always REQUIRED. It contains one to fifteen
     * alphanumeric characters (including spaces and special characters), whose
     * meaning is left at the discretion of each domain manager.
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getSerial() {
      return serial;
    }

    /**
     * Set a unique Dataset identifier.
     * <p>
     * Serial is composed of four parts separated by colons (":"). The maximum
     * total length is 29 characters (5+1+4+1+2+1+15). . Part 1 is the Country
     * and is always REQUIRED. It contains one to five alphabetic uppercase
     * characters representing either the ITU country code or the NATO Command
     * code identifying the originator or organisation responsible for
     * maintaining the dataset, as listed in Code List CCY. . Part 2 is the
     * orgCode and is OPTIONAL. It may contain one to four alphanumeric
     * characters (no spaces nor special characters) representing a code for an
     * Organisation within the country or command. It will normally indicate the
     * organisation responsible for maintaining the dataset. Domain naming is
     * left at the discretion of each country, but should be managed by a
     * central authority in the country to allow deconfliction and uniqueness.
     * It should enable the location in the data repository where this dataset
     * information is stored. . Part 3 is the Dataset Type and MUST contain a
     * two-character code from the table in the Introduction section identifying
     * the type of dataset (LO for a Location, etc). . Part 4 is a Serial
     * Identifier and is always REQUIRED. It contains one to fifteen
     * alphanumeric characters (including spaces and special characters), whose
     * meaning is left at the discretion of each domain manager.
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
    public Calendar getRetireDate() {
      return retireDate;
    }

    /**
     * Set
     * <p>
     * @param value a {@link Calendar} instance
     * @since 3.1.0
     */
    public void setRetireDate(Calendar value) {
      this.retireDate = value;
    }

    public boolean isSetRetireDate() {
      return (this.retireDate != null);
    }

    public DatasetReplaced withValue(String value) {
      setValue(value);
      return this;
    }

    public DatasetReplaced withCls(String value) {
      setCls(value);
      return this;
    }

    public DatasetReplaced withSerial(String value) {
      setSerial(value);
      return this;
    }

    public DatasetReplaced withRetireDate(Calendar value) {
      setRetireDate(value);
      return this;
    }

  }

  /**
   * Get a string representation of this Common instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Common {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Common} requires
   * {@link null ContactOrgRef}, {@link null DatasetCls}, {@link null Status}, {@link null entry}, {@link null serial}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetContactOrgRef() && isSetDatasetCls() && isSetStatus() && isSetEntry() && isSetSerial();
  }

}
