package us.gov.dod.standard.ssrf._1_2_4.sspt;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.Common;
import us.gov.dod.standard.ssrf._1_2_4.Memo;
import us.gov.dod.standard.ssrf._1_2_4.TDate;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;

/**
 * OpClearanceRequest
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOpClearanceRequest", propOrder = {
  "description",
  "locationRef",
  "responseDate",
  "title",
  "txRxModeRef"
})
public class OpClearanceRequest extends Common<OpClearanceRequest> {

  @XmlElement(name = "Description", required = true)
  protected Memo description;

  @XmlElement(name = "LocationRef")
  protected Set<LocationRef> locationRef;

  @XmlElement(name = "ResponseDate")
  protected TDate responseDate;

  @XmlElement(name = "Title", required = true)
  protected Title title;

  @XmlElement(name = "TxRxModeRef", required = true)
  protected TxRxModeRef txRxModeRef;

  /**
   * Get
   * <p>
   * @return a {@link Memo} instance
   * @since 3.1.0
   */
  public Memo getDescription() {
    return description;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Memo} instance
   * @since 3.1.0
   */
  public void setDescription(Memo value) {
    this.description = value;
  }

  public boolean isSetDescription() {
    return (this.description != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link LocationRef} instance
   * @since 3.1.0
   */
  public Set<LocationRef> getLocationRef() {
    if (locationRef == null) {
      locationRef = new HashSet<>();
    }
    return this.locationRef;
  }

  public boolean isSetLocationRef() {
    return ((this.locationRef != null) && (!this.locationRef.isEmpty()));
  }

  /**
   * Clear the LocationRef field. This sets the field to null.
   */
  public void unsetLocationRef() {
    this.locationRef = null;
  }

  /**
   * Get
   * <p>
   * @return the ResponseDate value in a {@link TDate} data type
   * @since 3.1.0
   */
  public TDate getResponseDate() {
    return responseDate;
  }

  /**
   * Set
   * <p>
   * @param value the ResponseDate value in a {@link TDate} data type
   * @since 3.1.0
   */
  public void setResponseDate(TDate value) {
    this.responseDate = value;
  }

  public boolean isSetResponseDate() {
    return (this.responseDate != null);
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
   * Get
   * <p>
   * @return the TxRxModeRef value in a {@link TxRxModeRef} data type
   * @since 3.1.0
   */
  public TxRxModeRef getTxRxModeRef() {
    return txRxModeRef;
  }

  /**
   * Set
   * <p>
   * @param value the TxRxModeRef value in a {@link TxRxModeRef} data type
   * @since 3.1.0
   */
  public void setTxRxModeRef(TxRxModeRef value) {
    this.txRxModeRef = value;
  }

  public boolean isSetTxRxModeRef() {
    return (this.txRxModeRef != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Memo}
   * @return The current OpClearanceRequest object instance
   * @since 3.1.0
   */
  public OpClearanceRequest withDescription(Memo value) {
    setDescription(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link LocationRef...}
   * @return The current OpClearanceRequest object instance
   * @since 3.1.0
   */
  public OpClearanceRequest withLocationRef(LocationRef... values) {
    if (values != null) {
      getLocationRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link LocationRef} instances
   * @return The current OpClearanceRequest object instance
   * @since 3.1.0
   */
  public OpClearanceRequest withLocationRef(Collection<LocationRef> values) {
    if (values != null) {
      getLocationRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TDate}
   * @return The current OpClearanceRequest object instance
   * @since 3.1.0
   */
  public OpClearanceRequest withResponseDate(TDate value) {
    setResponseDate(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Title}
   * @return The current OpClearanceRequest object instance
   * @since 3.1.0
   */
  public OpClearanceRequest withTitle(Title value) {
    setTitle(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TxRxModeRef}
   * @return The current OpClearanceRequest object instance
   * @since 3.1.0
   */
  public OpClearanceRequest withTxRxModeRef(TxRxModeRef value) {
    setTxRxModeRef(value);
    return this;
  }

  /**
   * Get a string representation of this OpClearanceRequest instance
   * configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "OpClearanceRequest {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link OpClearanceRequest} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link null Description}, {@link null Title}, {@link null TxRxModeRef}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetDescription() && isSetTitle() && isSetTxRxModeRef();
  }

}
