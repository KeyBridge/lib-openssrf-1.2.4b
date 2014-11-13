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

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.interference.DetectedIntf;
import us.gov.dod.standard.ssrf._1_2_4.interference.IntfVictim;
import us.gov.dod.standard.ssrf._1_2_4.interference.JSIR;

/**
 * IntfReport contains information on a source and victim of an interference
 * incident.
 * <p>
 * Sub-Element is {@link POCInformation}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIntfReport", propOrder = {
  "requirement",
  "helpRequired",
  "jsir",
  "detectedIntf",
  "intfVictim"
})
public class IntfReport extends Common<IntfReport> {

  @XmlElement(name = "Requirement")
  protected Memo requirement;
  /**
   * HelpRequired - Help Required (Optional)
   * <p>
   * Whether the user needs technical assistance from another organisation to
   * solve the interference. If not used, consider as "No".
   * <p>
   * Format is L:CBO
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "HelpRequired", required = true)
  protected IntfReport.HelpRequired helpRequired;

  @XmlElement(name = "JSIR")
  protected JSIR jsir;

  @XmlElement(name = "DetectedIntf", required = true)
  protected DetectedIntf detectedIntf;

  @XmlElement(name = "IntfVictim", required = true)
  protected IntfVictim intfVictim;

  /**
   * Get
   * <p>
   * @return a {@link Memo} instance
   * @since 3.1.0
   */
  public Memo getRequirement() {
    return requirement;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Memo} instance
   * @since 3.1.0
   */
  public void setRequirement(Memo value) {
    this.requirement = value;
  }

  public boolean isSetRequirement() {
    return (this.requirement != null);
  }

  public IntfReport.HelpRequired getHelpRequired() {
    return helpRequired;
  }

  /**
   * Set whether the user needs technical assistance from another organisation
   * to solve the interference. If not used, consider as "No".
   * <p>
   * @param value a {@link IntfReport} instance
   * @since 3.1.0
   */
  public void setHelpRequired(IntfReport.HelpRequired value) {
    this.helpRequired = value;
  }

  public boolean isSetHelpRequired() {
    return (this.helpRequired != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link JSIR} instance
   * @since 3.1.0
   */
  public JSIR getJSIR() {
    return jsir;
  }

  /**
   * Set
   * <p>
   * @param value a {@link JSIR} instance
   * @since 3.1.0
   */
  public void setJSIR(JSIR value) {
    this.jsir = value;
  }

  public boolean isSetJSIR() {
    return (this.jsir != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link DetectedIntf} instance
   * @since 3.1.0
   */
  public DetectedIntf getDetectedIntf() {
    return detectedIntf;
  }

  /**
   * Set
   * <p>
   * @param value a {@link DetectedIntf} instance
   * @since 3.1.0
   */
  public void setDetectedIntf(DetectedIntf value) {
    this.detectedIntf = value;
  }

  public boolean isSetDetectedIntf() {
    return (this.detectedIntf != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link IntfVictim} instance
   * @since 3.1.0
   */
  public IntfVictim getIntfVictim() {
    return intfVictim;
  }

  /**
   * Set
   * <p>
   * @param value a {@link IntfVictim} instance
   * @since 3.1.0
   */
  public void setIntfVictim(IntfVictim value) {
    this.intfVictim = value;
  }

  public boolean isSetIntfVictim() {
    return (this.intfVictim != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Memo}
   * @return The current IntfReport object instance
   * @since 3.1.0
   */
  public IntfReport withRequirement(Memo value) {
    setRequirement(value);
    return this;
  }

  /**
   * Set whether the user needs technical assistance from another organisation
   * to solve the interference. If not used, consider as "No".
   * <p>
   * @param value An instances of type {@link IntfReport.HelpRequired}
   * @return The current IntfReport object instance
   * @since 3.1.0
   */
  public IntfReport withHelpRequired(IntfReport.HelpRequired value) {
    setHelpRequired(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link JSIR}
   * @return The current IntfReport object instance
   * @since 3.1.0
   */
  public IntfReport withJSIR(JSIR value) {
    setJSIR(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link DetectedIntf}
   * @return The current IntfReport object instance
   * @since 3.1.0
   */
  public IntfReport withDetectedIntf(DetectedIntf value) {
    setDetectedIntf(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link IntfVictim}
   * @return The current IntfReport object instance
   * @since 3.1.0
   */
  public IntfReport withIntfVictim(IntfVictim value) {
    setIntfVictim(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "value"
  })
  public static class HelpRequired {

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

    public IntfReport.HelpRequired withValue(String value) {
      setValue(value);
      return this;
    }

    public IntfReport.HelpRequired withCls(String value) {
      setCls(value);
      return this;
    }

  }

  /**
   * Get a string representation of this IntfReport instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "IntfReport {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link IntfReport} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and
   * {@link null DetectedIntf}, {@link null HelpRequired}, {@link null IntfVictim}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetDetectedIntf() && isSetHelpRequired() && isSetIntfVictim();
  }

}
