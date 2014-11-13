package us.gov.dod.standard.ssrf._1_2_4.sspt;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._1_2_4.SSRequest;
import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * Stage contains information about the life-cycle management of the system.
 * <p>
 * Element of {@link SSRequest}
 * <p>
 * Sub-Element is {@link StageLocation}
 * <p>
 * Example:
 * <pre>
 * &lt;Stage&gt;
 *   &lt;Type cls="U"&gt;Experimental&lt;/Type&gt;
 *   &lt;StartDate cls="U"&gt;2004-01-01&lt;/StartDate&gt;
 *   &lt;TargetDate cls="U"&gt;2005-01-01&lt;/TargetDate&gt;
 *   &lt;DateApprovalRequired cls="U"&gt;2003-01-01&lt;/DateApprovalRequired&gt;
 *   &lt;TerminationDate cls="U"&gt;2009-01-01&lt;/TerminationDate&gt;
 *   &lt;NumEquip cls="U"&gt;2000&lt;/NumEquip&gt;
 * &lt;/Stage&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TStage")
public class Stage {

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
   * NumEquip - Number of Equipment (Optional)
   * <p>
   * The total number of units to be built, procured or used during this stage.
   * <p>
   * Format is UN(9)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "num", required = true)
  protected BigInteger num;
  /**
   * StartDate - Start Date (Optional)
   * <p>
   * The date upon which work will commence on this stage.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "startDate")
  @XmlJavaTypeAdapter(XmlAdapterDATE.class)
  @XmlSchemaType(name = "date")
  protected Calendar startDate;
  /**
   * TargetDate - Target Date (Optional)
   * <p>
   * The date by which a usable version of the system is expected to be
   * available for testing or deployment.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "targetDate")
  @XmlJavaTypeAdapter(XmlAdapterDATE.class)
  @XmlSchemaType(name = "date")
  protected Calendar targetDate;

  @XmlAttribute(name = "approvalDate")
  @XmlJavaTypeAdapter(XmlAdapterDATE.class)
  @XmlSchemaType(name = "date")
  protected Calendar approvalDate;
  /**
   * TerminationDate - Termination Date (Optional)
   * <p>
   * The date this stage is expected to terminate. For a stage 2 application the
   * date entered is the date when the system is expected to enter stage 3. The
   * date may be an estimate.
   * <p>
   * Format is Date
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "terminationDate")
  @XmlJavaTypeAdapter(XmlAdapterDATE.class)
  @XmlSchemaType(name = "date")
  protected Calendar terminationDate;

  @XmlAttribute(name = "numTx")
  protected BigInteger numTx;

  @XmlAttribute(name = "numRx")
  protected BigInteger numRx;

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
   * Get the total number of units to be built, procured or used during this
   * stage.
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getNum() {
    return num;
  }

  /**
   * Set the total number of units to be built, procured or used during this
   * stage.
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setNum(BigInteger value) {
    this.num = value;
  }

  public boolean isSetNum() {
    return (this.num != null);
  }

  /**
   * Get the date upon which work will commence on this stage.
   * <p>
   * @return a {@link Calendar} instance
   * @since 3.1.0
   */
  public Calendar getStartDate() {
    return startDate;
  }

  /**
   * Set the date upon which work will commence on this stage.
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
   * Get the date by which a usable version of the system is expected to be
   * available for testing or deployment.
   * <p>
   * @return a {@link Calendar} instance
   * @since 3.1.0
   */
  public Calendar getTargetDate() {
    return targetDate;
  }

  /**
   * Set the date by which a usable version of the system is expected to be
   * available for testing or deployment.
   * <p>
   * @param value a {@link Calendar} instance
   * @since 3.1.0
   */
  public void setTargetDate(Calendar value) {
    this.targetDate = value;
  }

  public boolean isSetTargetDate() {
    return (this.targetDate != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Calendar} instance
   * @since 3.1.0
   */
  public Calendar getApprovalDate() {
    return approvalDate;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Calendar} instance
   * @since 3.1.0
   */
  public void setApprovalDate(Calendar value) {
    this.approvalDate = value;
  }

  public boolean isSetApprovalDate() {
    return (this.approvalDate != null);
  }

  /**
   * Get the date this stage is expected to terminate. For a stage 2 application
   * the date entered is the date when the system is expected to enter stage 3.
   * The date may be an estimate.
   * <p>
   * @return a {@link Calendar} instance
   * @since 3.1.0
   */
  public Calendar getTerminationDate() {
    return terminationDate;
  }

  /**
   * Set the date this stage is expected to terminate. For a stage 2 application
   * the date entered is the date when the system is expected to enter stage 3.
   * The date may be an estimate.
   * <p>
   * @param value a {@link Calendar} instance
   * @since 3.1.0
   */
  public void setTerminationDate(Calendar value) {
    this.terminationDate = value;
  }

  public boolean isSetTerminationDate() {
    return (this.terminationDate != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getNumTx() {
    return numTx;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setNumTx(BigInteger value) {
    this.numTx = value;
  }

  public boolean isSetNumTx() {
    return (this.numTx != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getNumRx() {
    return numRx;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setNumRx(BigInteger value) {
    this.numRx = value;
  }

  public boolean isSetNumRx() {
    return (this.numRx != null);
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Stage object instance
   * @since 3.1.0
   */
  public Stage withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set the total number of units to be built, procured or used during this
   * stage.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Stage object instance
   * @since 3.1.0
   */
  public Stage withNum(BigInteger value) {
    setNum(value);
    return this;
  }

  /**
   * Set the date upon which work will commence on this stage.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Stage object instance
   * @since 3.1.0
   */
  public Stage withStartDate(Calendar value) {
    setStartDate(value);
    return this;
  }

  /**
   * Set the date upon which work will commence on this stage.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Stage object instance
   * @since 3.1.0
   */
  public Stage withStartDate(Date value) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.setTime(value);
    setStartDate(calendar);
    return this;
  }

  /**
   * Set the date by which a usable version of the system is expected to be
   * available for testing or deployment.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Stage object instance
   * @since 3.1.0
   */
  public Stage withTargetDate(Calendar value) {
    setTargetDate(value);
    return this;
  }

  /**
   * Set the date by which a usable version of the system is expected to be
   * available for testing or deployment.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Stage object instance
   * @since 3.1.0
   */
  public Stage withTargetDate(Date value) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.setTime(value);
    setTargetDate(calendar);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Stage object instance
   * @since 3.1.0
   */
  public Stage withApprovalDate(Calendar value) {
    setApprovalDate(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Stage object instance
   * @since 3.1.0
   */
  public Stage withApprovalDate(Date value) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.setTime(value);
    setApprovalDate(calendar);
    return this;
  }

  /**
   * Set the date this stage is expected to terminate. For a stage 2 application
   * the date entered is the date when the system is expected to enter stage 3.
   * The date may be an estimate.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Stage object instance
   * @since 3.1.0
   */
  public Stage withTerminationDate(Calendar value) {
    setTerminationDate(value);
    return this;
  }

  /**
   * Set the date this stage is expected to terminate. For a stage 2 application
   * the date entered is the date when the system is expected to enter stage 3.
   * The date may be an estimate.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Stage object instance
   * @since 3.1.0
   */
  public Stage withTerminationDate(Date value) {
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    calendar.setTime(value);
    setTerminationDate(calendar);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Stage object instance
   * @since 3.1.0
   */
  public Stage withNumTx(BigInteger value) {
    setNumTx(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Stage object instance
   * @since 3.1.0
   */
  public Stage withNumRx(BigInteger value) {
    setNumRx(value);
    return this;
  }

  /**
   * Get a string representation of this Stage instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Stage {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Stage} requires {@link null num}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetNum();
  }

}
