package us.gov.dod.standard.ssrf._1_2_4.sspt;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.Common;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;

/**
 * OpClearance
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOpClearance", propOrder = {
  "opClearanceRequestRef",
  "authorisedTuning"
})
public class OpClearance extends Common<OpClearance> {

  @XmlElement(name = "OpClearanceRequestRef", required = true)
  protected ElmRef opClearanceRequestRef;

  @XmlElement(name = "AuthorisedTuning")
  protected AuthorisedTuning authorisedTuning;

  @XmlAttribute(name = "status", required = true)
  protected String attributeStatus;

  /**
   * Get
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public ElmRef getOpClearanceRequestRef() {
    return opClearanceRequestRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ElmRef} instance
   * @since 3.1.0
   */
  public void setOpClearanceRequestRef(ElmRef value) {
    this.opClearanceRequestRef = value;
  }

  public boolean isSetOpClearanceRequestRef() {
    return (this.opClearanceRequestRef != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link AuthorisedTuning} instance
   * @since 3.1.0
   */
  public AuthorisedTuning getAuthorisedTuning() {
    return authorisedTuning;
  }

  /**
   * Set
   * <p>
   * @param value a {@link AuthorisedTuning} instance
   * @since 3.1.0
   */
  public void setAuthorisedTuning(AuthorisedTuning value) {
    this.authorisedTuning = value;
  }

  public boolean isSetAuthorisedTuning() {
    return (this.authorisedTuning != null);
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
   * Set
   * <p>
   * @param value An instances of type {@link ElmRef}
   * @return The current OpClearance object instance
   * @since 3.1.0
   */
  public OpClearance withOpClearanceRequestRef(ElmRef value) {
    setOpClearanceRequestRef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link AuthorisedTuning}
   * @return The current OpClearance object instance
   * @since 3.1.0
   */
  public OpClearance withAuthorisedTuning(AuthorisedTuning value) {
    setAuthorisedTuning(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current OpClearance object instance
   * @since 3.1.0
   */
  public OpClearance withAttributeStatus(String value) {
    setAttributeStatus(value);
    return this;
  }

  /**
   * Get a string representation of this OpClearance instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "OpClearance {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link OpClearance} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link null OpClearanceRequestRef}, {@link null status}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetOpClearanceRequestRef() && isSetStatus();
  }

}
