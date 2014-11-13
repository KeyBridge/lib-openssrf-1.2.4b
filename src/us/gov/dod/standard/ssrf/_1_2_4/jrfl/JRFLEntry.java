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
package us.gov.dod.standard.ssrf._1_2_4.jrfl;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.JRFL;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;

/**
 * This data element defines the protection and priority codes for those nets
 * (frequencies) that are listed in the Joint Restricted Frequency List (JRFL).
 * A JRFL entry may either refer to an existing Assignment/Allotment (in this
 * case, use the sub-element AsgnAllotRef) or to an arbitrary set of frequencies
 * (in this case describe the frequency/range, its user, location and duration).
 * In the case of an arbitrary set of frequencies, if multiple organisations are
 * listed they will all use the same set of frequencies; if it is not the case,
 * split the JRFL entry into several entries.
 * <p>
 * Element of {@link JRFL}
 * <p>
 * Sub-Elements are
 * {@link JRFLEntryLocation}, {@link POCInformation}, {@link Project}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TJRFLEntry", propOrder = {
  "asgnAllotRef",
  "organisationRef",
  "timeFrame",
  "locationRef",
  "freqSingle",
  "authorisedBw",
  "freqRange"
})
public class JRFLEntry {

  /**
   * AsgnAllotRef - Assignment or Allotment Serial (Optional)
   * <p>
   * The Serial reference of the Assignment or Allotment to be protected.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS
   * or AL". [XSD ERR REGEX] This data item MUST comply to the regular
   * expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * Format is pattern (S29)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AsgnAllotRef")
  protected AsgnAllotRef asgnAllotRef;

  @XmlElement(name = "OrganisationRef")
  protected List<ElmRef> organisationRef;

  @XmlElement(name = "TimeFrame")
  protected TimeFrame timeFrame;

  @XmlElement(name = "LocationRef")
  protected LocationRef locationRef;

  @XmlElement(name = "FreqSingle")
  protected List<FreqSingle> freqSingle;

  @XmlElement(name = "AuthorisedBw")
  protected AuthorisedBw authorisedBw;

  @XmlElement(name = "FreqRange")
  protected List<FreqRange> freqRange;
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

  @XmlAttribute(name = "protCode", required = true)
  protected String protCode;
  /**
   * Priority - Priority (Optional)
   * <p>
   * The assigned priority code consisting of a letter followed by a number in
   * the range A1 through Z9, with A1 being the highest priority (all Taboo nets
   * should be assigned an A1 priority code). This code is set at the local
   * command level.
   * <p>
   * Format is US2
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "priority")
  protected String priority;
  /**
   * Justification - Justification (Required)
   * <p>
   * A description of the justification of why the JRFL entry is required, to
   * support the spectrum manager.
   * <p>
   * Format is s255
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "justification", required = true)
  protected String justification;

  @XmlAttribute(name = "status", required = true)
  protected String attributeStatus;

  @XmlAttribute(name = "IDSF", required = true)
  protected String idsf;

  /**
   * Get the Serial reference of the Assignment or Allotment to be protected.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS
   * or AL". [XSD ERR REGEX] This data item MUST comply to the regular
   * expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @return a {@link AsgnAllotRef} instance
   * @since 3.1.0
   */
  public AsgnAllotRef getAsgnAllotRef() {
    return asgnAllotRef;
  }

  /**
   * Set the Serial reference of the Assignment or Allotment to be protected.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS
   * or AL". [XSD ERR REGEX] This data item MUST comply to the regular
   * expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @param value a {@link AsgnAllotRef} instance
   * @since 3.1.0
   */
  public void setAsgnAllotRef(AsgnAllotRef value) {
    this.asgnAllotRef = value;
  }

  public boolean isSetAsgnAllotRef() {
    return (this.asgnAllotRef != null);
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
   * @return a {@link LocationRef} instance
   * @since 3.1.0
   */
  public LocationRef getLocationRef() {
    return locationRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link LocationRef} instance
   * @since 3.1.0
   */
  public void setLocationRef(LocationRef value) {
    this.locationRef = value;
  }

  public boolean isSetLocationRef() {
    return (this.locationRef != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link FreqSingle} instance
   * @since 3.1.0
   */
  public List<FreqSingle> getFreqSingle() {
    if (freqSingle == null) {
      freqSingle = new ArrayList<>();
    }
    return this.freqSingle;
  }

  public boolean isSetFreqSingle() {
    return ((this.freqSingle != null) && (!this.freqSingle.isEmpty()));
  }

  /**
   * Clear the FreqSingle field. This sets the field to null.
   */
  public void unsetFreqSingle() {
    this.freqSingle = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link AuthorisedBw} instance
   * @since 3.1.0
   */
  public AuthorisedBw getAuthorisedBw() {
    return authorisedBw;
  }

  /**
   * Set
   * <p>
   * @param value a {@link AuthorisedBw} instance
   * @since 3.1.0
   */
  public void setAuthorisedBw(AuthorisedBw value) {
    this.authorisedBw = value;
  }

  public boolean isSetAuthorisedBw() {
    return (this.authorisedBw != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link FreqRange} instance
   * @since 3.1.0
   */
  public List<FreqRange> getFreqRange() {
    if (freqRange == null) {
      freqRange = new ArrayList<>();
    }
    return this.freqRange;
  }

  public boolean isSetFreqRange() {
    return ((this.freqRange != null) && (!this.freqRange.isEmpty()));
  }

  /**
   * Clear the FreqRange field. This sets the field to null.
   */
  public void unsetFreqRange() {
    this.freqRange = null;
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
  public String getProtCode() {
    return protCode;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setProtCode(String value) {
    this.protCode = value;
  }

  public boolean isSetProtCode() {
    return (this.protCode != null);
  }

  /**
   * Get the assigned priority code consisting of a letter followed by a number
   * in the range A1 through Z9, with A1 being the highest priority (all Taboo
   * nets should be assigned an A1 priority code). This code is set at the local
   * command level.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getPriority() {
    return priority;
  }

  /**
   * Set the assigned priority code consisting of a letter followed by a number
   * in the range A1 through Z9, with A1 being the highest priority (all Taboo
   * nets should be assigned an A1 priority code). This code is set at the local
   * command level.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setPriority(String value) {
    this.priority = value;
  }

  public boolean isSetPriority() {
    return (this.priority != null);
  }

  /**
   * Get a description of the justification of why the JRFL entry is required,
   * to support the spectrum manager.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getJustification() {
    return justification;
  }

  /**
   * Set a description of the justification of why the JRFL entry is required,
   * to support the spectrum manager.
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setJustification(String value) {
    this.justification = value;
  }

  public boolean isSetJustification() {
    return (this.justification != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getAttributeStatus() {
    return attributeStatus;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setAttributeStatus(String value) {
    this.attributeStatus = value;
  }

  public boolean isSetAttributeStatus() {
    return (this.attributeStatus != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getIDSF() {
    return idsf;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setIDSF(String value) {
    this.idsf = value;
  }

  public boolean isSetIDSF() {
    return (this.idsf != null);
  }

  /**
   * Set the Serial reference of the Assignment or Allotment to be protected.
   * <p>
   * [XSL ERR DSTYPE] Part 3 of the serial reference (dataset type) MUST be "AS
   * or AL". [XSD ERR REGEX] This data item MUST comply to the regular
   * expression: "[A-Z0-9-]{1,5}:w{0,4}:[A-Z]{2}:S{1,15}"
   * <p>
   * @param value An instances of type {@link AsgnAllotRef}
   * @return The current JRFLEntry object instance
   * @since 3.1.0
   */
  public JRFLEntry withAsgnAllotRef(AsgnAllotRef value) {
    setAsgnAllotRef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ElmRef...}
   * @return The current JRFLEntry object instance
   * @since 3.1.0
   */
  public JRFLEntry withOrganisationRef(ElmRef... values) {
    if (values != null) {
      getOrganisationRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link OrganisationRef} instances
   * @return The current JRFLEntry object instance
   * @since 3.1.0
   */
  public JRFLEntry withOrganisationRef(Collection<ElmRef> values) {
    if (values != null) {
      getOrganisationRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TimeFrame}
   * @return The current JRFLEntry object instance
   * @since 3.1.0
   */
  public JRFLEntry withTimeFrame(TimeFrame value) {
    setTimeFrame(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link LocationRef}
   * @return The current JRFLEntry object instance
   * @since 3.1.0
   */
  public JRFLEntry withLocationRef(LocationRef value) {
    setLocationRef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link FreqSingle...}
   * @return The current JRFLEntry object instance
   * @since 3.1.0
   */
  public JRFLEntry withFreqSingle(FreqSingle... values) {
    if (values != null) {
      getFreqSingle().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link FreqSingle} instances
   * @return The current JRFLEntry object instance
   * @since 3.1.0
   */
  public JRFLEntry withFreqSingle(Collection<FreqSingle> values) {
    if (values != null) {
      getFreqSingle().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link AuthorisedBw}
   * @return The current JRFLEntry object instance
   * @since 3.1.0
   */
  public JRFLEntry withAuthorisedBw(AuthorisedBw value) {
    setAuthorisedBw(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link FreqRange...}
   * @return The current JRFLEntry object instance
   * @since 3.1.0
   */
  public JRFLEntry withFreqRange(FreqRange... values) {
    if (values != null) {
      getFreqRange().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link FreqRange} instances
   * @return The current JRFLEntry object instance
   * @since 3.1.0
   */
  public JRFLEntry withFreqRange(Collection<FreqRange> values) {
    if (values != null) {
      getFreqRange().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFLEntry object instance
   * @since 3.1.0
   */
  public JRFLEntry withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFLEntry object instance
   * @since 3.1.0
   */
  public JRFLEntry withProtCode(String value) {
    setProtCode(value);
    return this;
  }

  /**
   * Set the assigned priority code consisting of a letter followed by a number
   * in the range A1 through Z9, with A1 being the highest priority (all Taboo
   * nets should be assigned an A1 priority code). This code is set at the local
   * command level.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFLEntry object instance
   * @since 3.1.0
   */
  public JRFLEntry withPriority(String value) {
    setPriority(value);
    return this;
  }

  /**
   * Set a description of the justification of why the JRFL entry is required,
   * to support the spectrum manager.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFLEntry object instance
   * @since 3.1.0
   */
  public JRFLEntry withJustification(String value) {
    setJustification(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFLEntry object instance
   * @since 3.1.0
   */
  public JRFLEntry withAttributeStatus(String value) {
    setAttributeStatus(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current JRFLEntry object instance
   * @since 3.1.0
   */
  public JRFLEntry withIDSF(String value) {
    setIDSF(value);
    return this;
  }

  /**
   * Get a string representation of this JRFLEntry instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "JRFLEntry {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link JRFLEntry} requires
   * {@link null IDSF}, {@link null justification}, {@link null protCode}, {@link null status}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetIDSF() && isSetJustification() && isSetProtCode();
  }

}
