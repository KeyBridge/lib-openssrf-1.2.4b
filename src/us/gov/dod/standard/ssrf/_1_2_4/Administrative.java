package us.gov.dod.standard.ssrf._1_2_4;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.administrative.Dataset;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;

/**
 * Data element Administrative has several usages: It can be used to inform
 * other data repositories that datasets have been deleted from a data
 * repository; It can also be used to reject an incoming dataset which cannot be
 * validated against the local repository, for example if it refers to unknown
 * datasets. Automated local data repository changes are not permitted on US
 * systems.
 * <p>
 * Sub-Elements are {@link CodeList}, {@link Dataset}
 * <p>
 * Example: Rejecting an Assignment for which the recipient does not have the
 * referenced Transmitter dataset:
 * <pre>
 * &lt;Administrative cls="U"&gt;
 *   &lt;Serial cls="U"&gt;DEU:NFA:DR:123&lt;/Serial&gt;
 *   &lt;MessageRef cls="U"&gt;DEU:NFA:MS:123&lt;/MessageRef&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Action cls="U"&gt;Missing Refs&lt;/Action&gt;
 *   &lt;Dataset&gt;
 *     &lt;Serial cls="U"&gt;USA::AS:456&lt;/Serial&gt;
 *     &lt;MissingRef cls="U"&gt;USA::TX:123&lt;/MissingRef&gt;
 *   &lt;/Dataset&gt;
 * &lt;/Administrative&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAdministrative", propOrder = {
  "compartment",
  "contactOrgRef",
  "remarks",
  "title",
  "dataset",
  "messageRef",
  "extRef"
})
public class Administrative {

  @XmlElement(name = "Compartment")
  protected Set<Compartment> compartment;

  @XmlElement(name = "ContactOrgRef", required = true)
  protected Set<ContactOrgRef> contactOrgRef;
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

  @XmlElement(name = "Title")
  protected Title title;
  /**
   * Dataset (Optional)
   * <p>
   * Dataset is used within an Administrative transaction to specify the
   * identifier of the datasets on which the action must apply.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Dataset")
  protected Set<Dataset> dataset;
  /**
   * MessageRef - Message Reference (Optional)
   * <p>
   * The serial of the Message Dataset that is causing this response.
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "MessageRef")
  protected ElmRef messageRef;
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
  protected Set<ExtRef> extRef;
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

  @XmlAttribute(name = "reason", required = true)
  protected String reason;

  @XmlAttribute(name = "external", required = true)
  protected String external;

  /**
   * Get
   * <p>
   * @return a {@link Compartment} instance
   * @since 3.1.0
   */
  public Set<Compartment> getCompartment() {
    if (compartment == null) {
      compartment = new HashSet<>();
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
  public Set<ContactOrgRef> getContactOrgRef() {
    if (contactOrgRef == null) {
      contactOrgRef = new HashSet<>();
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
   * Get
   * <p>
   * @return the Title value in a {@link Title} data type
   * @since 3.1.0
   */
  public Title getTitle() {
    return title;
  }

  /**
   * Set
   * <p>
   * @param value the Title value in a {@link Title} data type
   * @since 3.1.0
   */
  public void setTitle(Title value) {
    this.title = value;
  }

  public boolean isSetTitle() {
    return (this.title != null);
  }

  /**
   * Get the Dataset
   * <p>
   * Complex element Dataset is used within an Administrative transaction to
   * specify the identifier of the datasets on which the action must apply.
   * <p>
   * @return a {@link Dataset} instance
   * @since 3.1.0
   */
  public Set<Dataset> getDataset() {
    if (dataset == null) {
      dataset = new HashSet<>();
    }
    return this.dataset;
  }

  public boolean isSetDataset() {
    return ((this.dataset != null) && (!this.dataset.isEmpty()));
  }

  /**
   * Clear the Dataset field. This sets the field to null.
   */
  public void unsetDataset() {
    this.dataset = null;
  }

  /**
   * Get the serial of the Message Dataset that is causing this response.
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public ElmRef getMessageRef() {
    return messageRef;
  }

  /**
   * Set the serial of the Message Dataset that is causing this response.
   * <p>
   * @param value a {@link ElmRef} instance
   * @since 3.1.0
   */
  public void setMessageRef(ElmRef value) {
    this.messageRef = value;
  }

  public boolean isSetMessageRef() {
    return (this.messageRef != null);
  }

  /**
   * Get a list of Conmmon/ExtReferenceRef idx values applicable to the current
   * data item.
   * <p>
   * @return a {@link ExtRef} instance
   * @since 3.1.0
   */
  public Set<ExtRef> getExtRef() {
    if (extRef == null) {
      extRef = new HashSet<>();
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
  public String getReason() {
    return reason;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setReason(String value) {
    this.reason = value;
  }

  public boolean isSetReason() {
    return (this.reason != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getExternal() {
    return external;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setExternal(String value) {
    this.external = value;
  }

  public boolean isSetExternal() {
    return (this.external != null);
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Compartment...}
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withCompartment(Compartment... values) {
    if (values != null) {
      getCompartment().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Compartment} instances
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withCompartment(Collection<Compartment> values) {
    if (values != null) {
      getCompartment().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ContactOrgRef...}
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withContactOrgRef(ContactOrgRef... values) {
    if (values != null) {
      getContactOrgRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ContactOrgRef} instances
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withContactOrgRef(Collection<ContactOrgRef> values) {
    if (values != null) {
      getContactOrgRef().addAll(values);
    }
    return this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values One or more instances of type {@link Remarks...}
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withRemarks(Remarks... values) {
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
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withRemarks(Collection<Remarks> values) {
    if (values != null) {
      getRemarks().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Title}
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withTitle(Title value) {
    setTitle(value);
    return this;
  }

  /**
   * Set the Dataset
   * <p>
   * Complex element Dataset is used within an Administrative transaction to
   * specify the identifier of the datasets on which the action must apply.
   * <p>
   * @param values One or more instances of type {@link Dataset...}
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withDataset(Dataset... values) {
    if (values != null) {
      getDataset().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Dataset
   * <p>
   * Complex element Dataset is used within an Administrative transaction to
   * specify the identifier of the datasets on which the action must apply.
   * <p>
   * @param values A collection of {@link Dataset} instances
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withDataset(Collection<Dataset> values) {
    if (values != null) {
      getDataset().addAll(values);
    }
    return this;
  }

  /**
   * Set the serial of the Message Dataset that is causing this response.
   * <p>
   * @param value An instances of type {@link ElmRef}
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withMessageRef(ElmRef value) {
    setMessageRef(value);
    return this;
  }

  /**
   * Set a list of Conmmon/ExtReferenceRef idx values applicable to the current
   * data item.
   * <p>
   * @param values One or more instances of type {@link ExtRef...}
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withExtRef(ExtRef... values) {
    if (values != null) {
      getExtRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set a list of Conmmon/ExtReferenceRef idx values applicable to the current
   * data item.
   * <p>
   * @param values A collection of {@link ExtRef} instances
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withExtRef(Collection<ExtRef> values) {
    if (values != null) {
      getExtRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withSerial(String value) {
    setSerial(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withReason(String value) {
    setReason(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Administrative object instance
   * @since 3.1.0
   */
  public Administrative withExternal(String value) {
    setExternal(value);
    return this;
  }

  /**
   * Get a string representation of this Administrative instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Administrative {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Administrative} requires
   * {@link null ContactOrgRef}, {@link null external}, {@link null reason}, {@link null serial}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetContactOrgRef() && isSetExternal() && isSetReason() && isSetSerial();
  }

}
