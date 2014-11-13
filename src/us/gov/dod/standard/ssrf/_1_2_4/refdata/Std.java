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
package us.gov.dod.standard.ssrf._1_2_4.refdata;

import java.util.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._1_2_4.Note;
import us.gov.dod.standard.ssrf._1_2_4.adapter.*;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListAO;
import us.gov.dod.standard.ssrf._1_2_4.shared.Compartment;
import us.gov.dod.standard.ssrf._1_2_4.shared.ExtRef;
import us.gov.dod.standard.ssrf._1_2_4.shared.Remarks;

/**
 * Std
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TStd", propOrder = {
  "compartment",
  "extRef",
  "remarks"
})
@XmlSeeAlso({
  CoordStd.class,
  ChnlPlan.class,
  AntStd.class,
  BandApplication.class,
  BandUser.class,
  CurveStd.class,
  EmsStd.class,
  EmsMaskStd.class,
  Note.class,
  RxStd.class
})
@SuppressWarnings("unchecked")
public abstract class Std<T> {

  @XmlElement(name = "Compartment")
  protected List<Compartment> compartment;
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

  @XmlAttribute(name = "name")
  protected String name;

  @XmlAttribute(name = "source", required = true)
  protected ListAO source;

  @XmlAttribute(name = "admin")
  protected String admin;

  @XmlAttribute(name = "startDate")
  @XmlJavaTypeAdapter(XmlAdapterDATE.class)
  @XmlSchemaType(name = "date")
  protected Calendar startDate;

  @XmlAttribute(name = "stopDate")
  @XmlJavaTypeAdapter(XmlAdapterDATE.class)
  @XmlSchemaType(name = "date")
  protected Calendar stopDate;

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
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getName() {
    return name;
  }

  /**
   * Set
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
   * Get
   * <p>
   * @return a {@link ListAO} instance
   * @since 3.1.0
   */
  public ListAO getSource() {
    return source;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ListAO} instance
   * @since 3.1.0
   */
  public void setSource(ListAO value) {
    this.source = value;
  }

  public boolean isSetSource() {
    return (this.source != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getAdmin() {
    return admin;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setAdmin(String value) {
    this.admin = value;
  }

  public boolean isSetAdmin() {
    return (this.admin != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Calendar} instance
   * @since 3.1.0
   */
  public Calendar getStartDate() {
    return startDate;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Calendar} instance
   * @since 3.1.0
   */
  public void setStartDate(Calendar value) {
    this.startDate = value;
  }

  public boolean isSetStartDate() {
    return (this.startDate != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Calendar} instance
   * @since 3.1.0
   */
  public Calendar getStopDate() {
    return stopDate;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Calendar} instance
   * @since 3.1.0
   */
  public void setStopDate(Calendar value) {
    this.stopDate = value;
  }

  public boolean isSetStopDate() {
    return (this.stopDate != null);
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Compartment...}
   * @return The current Std object instance
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
   * @return The current Std object instance
   * @since 3.1.0
   */
  public T withCompartment(Collection<Compartment> values) {
    if (values != null) {
      getCompartment().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set a list of Conmmon/ExtReferenceRef idx values applicable to the current
   * data item.
   * <p>
   * @param values One or more instances of type {@link ExtRef...}
   * @return The current Std object instance
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
   * @return The current Std object instance
   * @since 3.1.0
   */
  public T withExtRef(Collection<ExtRef> values) {
    if (values != null) {
      getExtRef().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values One or more instances of type {@link Remarks...}
   * @return The current Std object instance
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
   * @return The current Std object instance
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
   * @return The current Std object instance
   * @since 3.1.0
   */
  public T withCls(String value) {
    setCls(value);
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Std object instance
   * @since 3.1.0
   */
  public T withSerial(String value) {
    setSerial(value);
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Std object instance
   * @since 3.1.0
   */
  public T withName(String value) {
    setName(value);
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ListAO}
   * @return The current Std object instance
   * @since 3.1.0
   */
  public T withSource(ListAO value) {
    setSource(value);
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Std object instance
   * @since 3.1.0
   */
  public T withAdmin(String value) {
    setAdmin(value);
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Std object instance
   * @since 3.1.0
   */
  public T withStartDate(Calendar value) {
    setStartDate(value);
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Std object instance
   * @since 3.1.0
   */
  public T withStartDate(Date value) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.setTime(value);
    setStartDate(calendar);
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Std object instance
   * @since 3.1.0
   */
  public T withStopDate(Calendar value) {
    setStopDate(value);
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Std object instance
   * @since 3.1.0
   */
  public T withStopDate(Date value) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.setTime(value);
    setStopDate(calendar);
    return (T) this;
  }

  /**
   * Get a string representation of this Std instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Std {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Std} requires {@link null serial}, {@link null source}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetSerial() && isSetSource();
  }

}
