package us.gov.dod.standard.ssrf._1_2_4.toa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.TOA;
import us.gov.dod.standard.ssrf._1_2_4.refdata.NoteRef;
import us.gov.dod.standard.ssrf._1_2_4.shared.FreqRange;
import us.gov.dod.standard.ssrf._1_2_4.shared.FreqSingle;

/**
 * FreqBand contains the allocation of a specific frequency band to
 * radiocommunication services. It may also provide additional information such
 * as the specification of the rights and responsibilities of a user.
 * <p>
 * Element of {@link TOA}
 * <p>
 * Sub-Element is {@link Allocation}
 * <p>
 * Example:
 * <pre>
 * &lt;FreqBand&gt;
 *   &lt;FreqMin cls="U"&gt;960&lt;/FreqMin&gt;
 *   &lt;FreqMax cls="U"&gt;1164&lt;/FreqMax&gt;
 *   &lt;Allocation&gt;
 *     &lt;AllocatedService cls="U"&gt;Aeronautical Mobile Service&lt;/AllocatedService&gt;
 *     &lt;Priority cls="U"&gt;Primary&lt;/Priority&gt;
 *   &lt;/Allocation&gt;
 * &lt;/FreqBand&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TFreqBand", propOrder = {
  "freqSingle",
  "freqRange",
  "noteRef",
  "allocApp"
})
public class FreqBand {

  @XmlElement(name = "FreqSingle")
  protected FreqSingle freqSingle;

  @XmlElement(name = "FreqRange")
  protected FreqRange freqRange;

  @XmlElement(name = "NoteRef")
  protected Set<NoteRef> noteRef;

  @XmlElement(name = "AllocApp", required = true)
  protected Set<AllocApp> allocApp;
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
   * UseIndicator - Use Indicator (Optional)
   * <p>
   * The permitted uses of this band (e.g., "Government", "Non-government",
   * etc).
   * <p>
   * Format is S40
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "useIndicator")
  protected String useIndicator;

  @XmlAttribute(name = "sharedUse")
  protected String sharedUse;

  /**
   * Get
   * <p>
   * @return a {@link FreqSingle} instance
   * @since 3.1.0
   */
  public FreqSingle getFreqSingle() {
    return freqSingle;
  }

  /**
   * Set
   * <p>
   * @param value a {@link FreqSingle} instance
   * @since 3.1.0
   */
  public void setFreqSingle(FreqSingle value) {
    this.freqSingle = value;
  }

  public boolean isSetFreqSingle() {
    return (this.freqSingle != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link FreqRange} instance
   * @since 3.1.0
   */
  public FreqRange getFreqRange() {
    return freqRange;
  }

  /**
   * Set
   * <p>
   * @param value a {@link FreqRange} instance
   * @since 3.1.0
   */
  public void setFreqRange(FreqRange value) {
    this.freqRange = value;
  }

  public boolean isSetFreqRange() {
    return (this.freqRange != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link NoteRef} instance
   * @since 3.1.0
   */
  public Set<NoteRef> getNoteRef() {
    if (noteRef == null) {
      noteRef = new HashSet<>();
    }
    return this.noteRef;
  }

  public boolean isSetNoteRef() {
    return ((this.noteRef != null) && (!this.noteRef.isEmpty()));
  }

  /**
   * Clear the NoteRef field. This sets the field to null.
   */
  public void unsetNoteRef() {
    this.noteRef = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link AllocApp} instance
   * @since 3.1.0
   */
  public Set<AllocApp> getAllocApp() {
    if (allocApp == null) {
      allocApp = new HashSet<>();
    }
    return this.allocApp;
  }

  public boolean isSetAllocApp() {
    return ((this.allocApp != null) && (!this.allocApp.isEmpty()));
  }

  /**
   * Clear the AllocApp field. This sets the field to null.
   */
  public void unsetAllocApp() {
    this.allocApp = null;
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
   * Get the permitted uses of this band (e.g., "Government", "Non-government",
   * etc).
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getUseIndicator() {
    return useIndicator;
  }

  /**
   * Set the permitted uses of this band (e.g., "Government", "Non-government",
   * etc).
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setUseIndicator(String value) {
    this.useIndicator = value;
  }

  public boolean isSetUseIndicator() {
    return (this.useIndicator != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getSharedUse() {
    return sharedUse;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setSharedUse(String value) {
    this.sharedUse = value;
  }

  public boolean isSetSharedUse() {
    return (this.sharedUse != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link FreqSingle}
   * @return The current FreqBand object instance
   * @since 3.1.0
   */
  public FreqBand withFreqSingle(FreqSingle value) {
    setFreqSingle(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link FreqRange}
   * @return The current FreqBand object instance
   * @since 3.1.0
   */
  public FreqBand withFreqRange(FreqRange value) {
    setFreqRange(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link NoteRef...}
   * @return The current FreqBand object instance
   * @since 3.1.0
   */
  public FreqBand withNoteRef(NoteRef... values) {
    if (values != null) {
      getNoteRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link NoteRef} instances
   * @return The current FreqBand object instance
   * @since 3.1.0
   */
  public FreqBand withNoteRef(Collection<NoteRef> values) {
    if (values != null) {
      getNoteRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link AllocApp...}
   * @return The current FreqBand object instance
   * @since 3.1.0
   */
  public FreqBand withAllocApp(AllocApp... values) {
    if (values != null) {
      getAllocApp().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link AllocApp} instances
   * @return The current FreqBand object instance
   * @since 3.1.0
   */
  public FreqBand withAllocApp(Collection<AllocApp> values) {
    if (values != null) {
      getAllocApp().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current FreqBand object instance
   * @since 3.1.0
   */
  public FreqBand withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set the permitted uses of this band (e.g., "Government", "Non-government",
   * etc).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current FreqBand object instance
   * @since 3.1.0
   */
  public FreqBand withUseIndicator(String value) {
    setUseIndicator(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current FreqBand object instance
   * @since 3.1.0
   */
  public FreqBand withSharedUse(String value) {
    setSharedUse(value);
    return this;
  }

  /**
   * Get a string representation of this FreqBand instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "FreqBand {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link FreqBand} requires {@link null AllocApp}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetAllocApp();
  }

}
