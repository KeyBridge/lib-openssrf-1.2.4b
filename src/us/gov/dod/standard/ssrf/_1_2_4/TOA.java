package us.gov.dod.standard.ssrf._1_2_4;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;
import us.gov.dod.standard.ssrf._1_2_4.toa.FreqBand;

/**
 * TOA is the XML root for all parameters of a Table of Allocations. It inherits
 * attributes and sub-elements from element Common.
 * <p>
 * Sub-Elements are
 * {@link ChannelPlanRef}, {@link Country}, {@link Footnote}, {@link FreqBand}
 * <p>
 * Example:
 * <pre>
 * &lt;TOA cls="U"&gt;
 *   &lt;Serial cls="U"&gt;USA:NTIA:TA:1&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Administration cls="U"&gt;NTIA&lt;/Administration&gt;
 *   &lt;FreqBand&gt;
 *     &lt;FreqMin cls="U"&gt;230&lt;/FreqMin&gt;
 *     &lt;FreqMax cls="U"&gt;400&lt;/FreqMax&gt;
 *     &lt;Allocation&gt;
 *       &lt;AllocatedService cls="U"&gt;Mobile Service&lt;/AllocatedService&gt;
 *       &lt;Priority cls="U"&gt;Primary&lt;/Priority&gt;
 *     &lt;/Allocation&gt;
 *   &lt;/FreqBand&gt;
 * &lt;/TOA&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTOA", propOrder = {
  "title",
  "locationRef",
  "freqBand"
})
public class TOA extends Common<TOA> {

  /**
   * Title - Title (Optional)
   * <p>
   * An identifying name for this Table of Allocations.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Title", required = true)
  protected Title title;

  @XmlElement(name = "LocationRef")
  protected Set<LocationRef> locationRef;
  /**
   * FreqBand (Required)
   * <p>
   * FreqBand contains the allocation of a specific frequency band to
   * radiocommunication services. It may also provide additional information
   * such as the specification of the rights and responsibilities of a user.
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "FreqBand", required = true)
  protected Set<FreqBand> freqBand;

  /**
   * Get an identifying name for this Table of Allocations.
   * <p>
   * @return the Title value in a {@link Title} data type
   * @since 3.1.0
   */
  public Title getTitle() {
    return title;
  }

  /**
   * Set an identifying name for this Table of Allocations.
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
   * Get the FreqBand
   * <p>
   * Complex element FreqBand contains the allocation of a specific frequency
   * band to radiocommunication services. It may also provide additional
   * information such as the specification of the rights and responsibilities of
   * a user.
   * <p>
   * @return a {@link FreqBand} instance
   * @since 3.1.0
   */
  public Set<FreqBand> getFreqBand() {
    if (freqBand == null) {
      freqBand = new HashSet<>();
    }
    return this.freqBand;
  }

  public boolean isSetFreqBand() {
    return ((this.freqBand != null) && (!this.freqBand.isEmpty()));
  }

  /**
   * Clear the FreqBand field. This sets the field to null.
   */
  public void unsetFreqBand() {
    this.freqBand = null;
  }

  /**
   * Set an identifying name for this Table of Allocations.
   * <p>
   * @param value An instances of type {@link Title}
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withTitle(Title value) {
    setTitle(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link LocationRef...}
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withLocationRef(LocationRef... values) {
    if (values != null) {
      getLocationRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link LocationRef} instances
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withLocationRef(Collection<LocationRef> values) {
    if (values != null) {
      getLocationRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the FreqBand
   * <p>
   * Complex element FreqBand contains the allocation of a specific frequency
   * band to radiocommunication services. It may also provide additional
   * information such as the specification of the rights and responsibilities of
   * a user.
   * <p>
   * @param values One or more instances of type {@link FreqBand...}
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withFreqBand(FreqBand... values) {
    if (values != null) {
      getFreqBand().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the FreqBand
   * <p>
   * Complex element FreqBand contains the allocation of a specific frequency
   * band to radiocommunication services. It may also provide additional
   * information such as the specification of the rights and responsibilities of
   * a user.
   * <p>
   * @param values A collection of {@link FreqBand} instances
   * @return The current TOA object instance
   * @since 3.1.0
   */
  public TOA withFreqBand(Collection<FreqBand> values) {
    if (values != null) {
      getFreqBand().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this TOA instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "TOA {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link TOA} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link null FreqBand}, {@link null Title}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetFreqBand() && isSetTitle();
  }

}
