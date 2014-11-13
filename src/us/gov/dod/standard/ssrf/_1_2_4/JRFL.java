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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.jrfl.JRFLEntry;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;

/**
 * JRFL is the XML root for all parameters of a JRFL. It inherits attributes and
 * sub-elements from element Common.
 * <p>
 * Sub-Element is {@link JRFLEntry}
 * <p>
 * Example:
 * <pre>
 * &lt;JRFL cls="U"&gt;
 *   &lt;Serial cls="U"&gt;NLD::JR:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;JRFLEntry&gt;
 *     &lt;ProtectionCode cls="U"&gt;Protected&lt;/ProtectionCode&gt;
 *     &lt;Justification cls="U"&gt;distress frequency&lt;/Justification&gt;
 *     &lt;FreqMin cls="U"&gt;243&lt;/FreqMin&gt;
 *     &lt;Bandwidth cls="U"&gt;0.1&lt;/Bandwidth&gt;
 *   &lt;/JRFLEntry&gt;
 * &lt;/JRFL&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TJRFL", propOrder = {
  "timeFrame",
  "jrflEntry"
})
public class JRFL extends Common<JRFL> {

  @XmlElement(name = "TimeFrame")
  protected TimeFrame timeFrame;
  /**
   * This data element defines the protection and priority codes for those nets
   * (frequencies) that are listed in the Joint Restricted Frequency List
   * (JRFL). A JRFL entry may either refer to an existing Assignment/Allotment
   * (in this case, use the sub-element AsgnAllotRef) or to an arbitrary set of
   * frequencies (in this case describe the frequency/range, its user, location
   * and duration). In the case of an arbitrary set of frequencies, if multiple
   * organisations are listed they will all use the same set of frequencies; if
   * it is not the case, split the JRFL entry into several entries.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "JRFLEntry", required = true)
  protected List<JRFLEntry> jrflEntry;

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
   * Get the JRFLEntry
   * <p>
   * This data element defines the protection and priority codes for those nets
   * (frequencies) that are listed in the Joint Restricted Frequency List
   * (JRFL). A JRFL entry may either refer to an existing Assignment/Allotment
   * (in this case, use the sub-element AsgnAllotRef) or to an arbitrary set of
   * frequencies (in this case describe the frequency/range, its user, location
   * and duration). In the case of an arbitrary set of frequencies, if multiple
   * organisations are listed they will all use the same set of frequencies; if
   * it is not the case, split the JRFL entry into several entries.
   * <p>
   * @return a {@link JRFLEntry} instance
   * @since 3.1.0
   */
  public List<JRFLEntry> getJRFLEntry() {
    if (jrflEntry == null) {
      jrflEntry = new ArrayList<>();
    }
    return this.jrflEntry;
  }

  public boolean isSetJRFLEntry() {
    return ((this.jrflEntry != null) && (!this.jrflEntry.isEmpty()));
  }

  /**
   * Clear the JRFLEntry field. This sets the field to null.
   */
  public void unsetJRFLEntry() {
    this.jrflEntry = null;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TimeFrame}
   * @return The current JRFL object instance
   * @since 3.1.0
   */
  public JRFL withTimeFrame(TimeFrame value) {
    setTimeFrame(value);
    return this;
  }

  /**
   * Set the JRFLEntry
   * <p>
   * This data element defines the protection and priority codes for those nets
   * (frequencies) that are listed in the Joint Restricted Frequency List
   * (JRFL). A JRFL entry may either refer to an existing Assignment/Allotment
   * (in this case, use the sub-element AsgnAllotRef) or to an arbitrary set of
   * frequencies (in this case describe the frequency/range, its user, location
   * and duration). In the case of an arbitrary set of frequencies, if multiple
   * organisations are listed they will all use the same set of frequencies; if
   * it is not the case, split the JRFL entry into several entries.
   * <p>
   * @param values One or more instances of type {@link JRFLEntry...}
   * @return The current JRFL object instance
   * @since 3.1.0
   */
  public JRFL withJRFLEntry(JRFLEntry... values) {
    if (values != null) {
      getJRFLEntry().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the JRFLEntry
   * <p>
   * This data element defines the protection and priority codes for those nets
   * (frequencies) that are listed in the Joint Restricted Frequency List
   * (JRFL). A JRFL entry may either refer to an existing Assignment/Allotment
   * (in this case, use the sub-element AsgnAllotRef) or to an arbitrary set of
   * frequencies (in this case describe the frequency/range, its user, location
   * and duration). In the case of an arbitrary set of frequencies, if multiple
   * organisations are listed they will all use the same set of frequencies; if
   * it is not the case, split the JRFL entry into several entries.
   * <p>
   * @param values A collection of {@link JRFLEntry} instances
   * @return The current JRFL object instance
   * @since 3.1.0
   */
  public JRFL withJRFLEntry(Collection<JRFLEntry> values) {
    if (values != null) {
      getJRFLEntry().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this JRFL instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "JRFL {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link JRFL} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link null JRFLEntry}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetJRFLEntry();
  }

}
