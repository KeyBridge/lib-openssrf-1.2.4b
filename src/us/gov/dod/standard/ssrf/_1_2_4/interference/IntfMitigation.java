package us.gov.dod.standard.ssrf._1_2_4.interference;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.Common;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;

/**
 * IntfMitigation
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIntfMitigation", propOrder = {
  "intfReportRef"
})
public class IntfMitigation extends Common<IntfMitigation> {

  @XmlElement(name = "IntfReportRef", required = true)
  protected ElmRef intfReportRef;

  @XmlAttribute(name = "responseType", required = true)
  protected String responseType;

  @XmlAttribute(name = "evaluation")
  protected String evaluation;

  @XmlAttribute(name = "mod", required = true)
  protected String mod;

  /**
   * Get
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public ElmRef getIntfReportRef() {
    return intfReportRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ElmRef} instance
   * @since 3.1.0
   */
  public void setIntfReportRef(ElmRef value) {
    this.intfReportRef = value;
  }

  public boolean isSetIntfReportRef() {
    return (this.intfReportRef != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getResponseType() {
    return responseType;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setResponseType(String value) {
    this.responseType = value;
  }

  public boolean isSetResponseType() {
    return (this.responseType != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getEvaluation() {
    return evaluation;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setEvaluation(String value) {
    this.evaluation = value;
  }

  public boolean isSetEvaluation() {
    return (this.evaluation != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getMod() {
    return mod;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setMod(String value) {
    this.mod = value;
  }

  public boolean isSetMod() {
    return (this.mod != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ElmRef}
   * @return The current IntfMitigation object instance
   * @since 3.1.0
   */
  public IntfMitigation withIntfReportRef(ElmRef value) {
    setIntfReportRef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfMitigation object instance
   * @since 3.1.0
   */
  public IntfMitigation withResponseType(String value) {
    setResponseType(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfMitigation object instance
   * @since 3.1.0
   */
  public IntfMitigation withEvaluation(String value) {
    setEvaluation(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current IntfMitigation object instance
   * @since 3.1.0
   */
  public IntfMitigation withMod(String value) {
    setMod(value);
    return this;
  }

  /**
   * Get a string representation of this IntfMitigation instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "IntfMitigation {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link IntfMitigation} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and
   * {@link null IntfReportRef}, {@link null mod}, {@link null responseType}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetIntfReportRef() && isSetMod() && isSetResponseType();
  }

}
