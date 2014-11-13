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
package us.gov.dod.standard.ssrf._1_2_4.administrative;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListAO;
import us.gov.dod.standard.ssrf._1_2_4.shared.Compartment;
import us.gov.dod.standard.ssrf._1_2_4.shared.ContactOrgRef;
import us.gov.dod.standard.ssrf._1_2_4.shared.Remarks;

/**
 * Codes
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCodes", propOrder = {
  "compartment",
  "contactOrgRef",
  "code",
  "remarks"
})
public class Codes {

  @XmlElement(name = "Compartment")
  protected List<Compartment> compartment;

  @XmlElement(name = "ContactOrgRef", required = true)
  protected List<ContactOrgRef> contactOrgRef;

  @XmlElement(name = "Code", required = true)
  protected List<Codes.Code> code;
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

  public List<Codes.Code> getCode() {
    if (code == null) {
      code = new ArrayList<>();
    }
    return this.code;
  }

  public boolean isSetCode() {
    return ((this.code != null) && (!this.code.isEmpty()));
  }

  /**
   * Clear the Code field. This sets the field to null.
   */
  public void unsetCode() {
    this.code = null;
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
   * Set
   * <p>
   * @param values One or more instances of type {@link Compartment...}
   * @return The current Codes object instance
   * @since 3.1.0
   */
  public Codes withCompartment(Compartment... values) {
    if (values != null) {
      getCompartment().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Compartment} instances
   * @return The current Codes object instance
   * @since 3.1.0
   */
  public Codes withCompartment(Collection<Compartment> values) {
    if (values != null) {
      getCompartment().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ContactOrgRef...}
   * @return The current Codes object instance
   * @since 3.1.0
   */
  public Codes withContactOrgRef(ContactOrgRef... values) {
    if (values != null) {
      getContactOrgRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ContactOrgRef} instances
   * @return The current Codes object instance
   * @since 3.1.0
   */
  public Codes withContactOrgRef(Collection<ContactOrgRef> values) {
    if (values != null) {
      getContactOrgRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Codes.Code...}
   * @return The current Codes object instance
   * @since 3.1.0
   */
  public Codes withCode(Codes.Code... values) {
    if (values != null) {
      getCode().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Code} instances
   * @return The current Codes object instance
   * @since 3.1.0
   */
  public Codes withCode(Collection<Codes.Code> values) {
    if (values != null) {
      getCode().addAll(values);
    }
    return this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values One or more instances of type {@link Remarks...}
   * @return The current Codes object instance
   * @since 3.1.0
   */
  public Codes withRemarks(Remarks... values) {
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
   * @return The current Codes object instance
   * @since 3.1.0
   */
  public Codes withRemarks(Collection<Remarks> values) {
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
   * @return The current Codes object instance
   * @since 3.1.0
   */
  public Codes withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Codes object instance
   * @since 3.1.0
   */
  public Codes withSerial(String value) {
    setSerial(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "value"
  })
  public static class Code {

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

    @XmlAttribute(name = "cat", required = true)
    protected String cat;

    @XmlAttribute(name = "shortCode", required = true)
    protected String shortCode;

    @XmlAttribute(name = "origin", required = true)
    protected ListAO origin;

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
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getCat() {
      return cat;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setCat(String value) {
      this.cat = value;
    }

    public boolean isSetCat() {
      return (this.cat != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getShortCode() {
      return shortCode;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setShortCode(String value) {
      this.shortCode = value;
    }

    public boolean isSetShortCode() {
      return (this.shortCode != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link ListAO} instance
     * @since 3.1.0
     */
    public ListAO getOrigin() {
      return origin;
    }

    /**
     * Set
     * <p>
     * @param value a {@link ListAO} instance
     * @since 3.1.0
     */
    public void setOrigin(ListAO value) {
      this.origin = value;
    }

    public boolean isSetOrigin() {
      return (this.origin != null);
    }

    public Codes.Code withValue(String value) {
      setValue(value);
      return this;
    }

    public Codes.Code withCls(String value) {
      setCls(value);
      return this;
    }

    public Codes.Code withCat(String value) {
      setCat(value);
      return this;
    }

    public Codes.Code withShortCode(String value) {
      setShortCode(value);
      return this;
    }

    public Codes.Code withOrigin(ListAO value) {
      setOrigin(value);
      return this;
    }

  }

  /**
   * Get a string representation of this Codes instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Codes {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Codes} requires
   * {@link null Code}, {@link null ContactOrgRef}, {@link null cat}, {@link null origin}, {@link null serial}, {@link null shortCode}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetCode() && isSetContactOrgRef() && isSetSerial();
  }

}
