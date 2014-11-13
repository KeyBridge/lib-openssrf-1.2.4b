package us.gov.dod.standard.ssrf._1_2_4.interference;

import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.Memo;
import us.gov.dod.standard.ssrf._1_2_4.antenna.Pol;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;

/**
 * DetectedIntf
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDetectedIntf", propOrder = {
  "time",
  "receivedLevel",
  "pol",
  "locationRef",
  "azimuth",
  "sourceLinkRef",
  "sourceFreqInfo"
})
public class DetectedIntf {

  @XmlElement(name = "Time", required = true)
  protected Time time;

  @XmlElement(name = "ReceivedLevel")
  protected ReceivedLevel receivedLevel;

  @XmlElement(name = "Pol")
  protected Pol pol;

  @XmlElement(name = "LocationRef")
  protected LocationRef locationRef;

  @XmlElement(name = "Azimuth")
  protected Azimuth azimuth;

  @XmlElement(name = "SourceLinkRef")
  protected SourceLinkRef sourceLinkRef;

  @XmlElement(name = "SourceFreqInfo")
  protected DetectedIntf.SourceFreqInfo sourceFreqInfo;
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
   * Get
   * <p>
   * @return the Time value in a {@link Time} data type
   * @since 3.1.0
   */
  public Time getTime() {
    return time;
  }

  /**
   * Set
   * <p>
   * @param value the Time value in a {@link Time} data type
   * @since 3.1.0
   */
  public void setTime(Time value) {
    this.time = value;
  }

  public boolean isSetTime() {
    return (this.time != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link ReceivedLevel} instance
   * @since 3.1.0
   */
  public ReceivedLevel getReceivedLevel() {
    return receivedLevel;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ReceivedLevel} instance
   * @since 3.1.0
   */
  public void setReceivedLevel(ReceivedLevel value) {
    this.receivedLevel = value;
  }

  public boolean isSetReceivedLevel() {
    return (this.receivedLevel != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Pol} instance
   * @since 3.1.0
   */
  public Pol getPol() {
    return pol;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Pol} instance
   * @since 3.1.0
   */
  public void setPol(Pol value) {
    this.pol = value;
  }

  public boolean isSetPol() {
    return (this.pol != null);
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
   * @return a {@link Azimuth} instance
   * @since 3.1.0
   */
  public Azimuth getAzimuth() {
    return azimuth;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Azimuth} instance
   * @since 3.1.0
   */
  public void setAzimuth(Azimuth value) {
    this.azimuth = value;
  }

  public boolean isSetAzimuth() {
    return (this.azimuth != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link SourceLinkRef} instance
   * @since 3.1.0
   */
  public SourceLinkRef getSourceLinkRef() {
    return sourceLinkRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link SourceLinkRef} instance
   * @since 3.1.0
   */
  public void setSourceLinkRef(SourceLinkRef value) {
    this.sourceLinkRef = value;
  }

  public boolean isSetSourceLinkRef() {
    return (this.sourceLinkRef != null);
  }

  public DetectedIntf.SourceFreqInfo getSourceFreqInfo() {
    return sourceFreqInfo;
  }

  /**
   * Set
   * <p>
   * @param value a {@link DetectedIntf} instance
   * @since 3.1.0
   */
  public void setSourceFreqInfo(DetectedIntf.SourceFreqInfo value) {
    this.sourceFreqInfo = value;
  }

  public boolean isSetSourceFreqInfo() {
    return (this.sourceFreqInfo != null);
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
   * Set
   * <p>
   * @param value An instances of type {@link Time}
   * @return The current DetectedIntf object instance
   * @since 3.1.0
   */
  public DetectedIntf withTime(Time value) {
    setTime(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ReceivedLevel}
   * @return The current DetectedIntf object instance
   * @since 3.1.0
   */
  public DetectedIntf withReceivedLevel(ReceivedLevel value) {
    setReceivedLevel(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Pol}
   * @return The current DetectedIntf object instance
   * @since 3.1.0
   */
  public DetectedIntf withPol(Pol value) {
    setPol(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link LocationRef}
   * @return The current DetectedIntf object instance
   * @since 3.1.0
   */
  public DetectedIntf withLocationRef(LocationRef value) {
    setLocationRef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Azimuth}
   * @return The current DetectedIntf object instance
   * @since 3.1.0
   */
  public DetectedIntf withAzimuth(Azimuth value) {
    setAzimuth(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link SourceLinkRef}
   * @return The current DetectedIntf object instance
   * @since 3.1.0
   */
  public DetectedIntf withSourceLinkRef(SourceLinkRef value) {
    setSourceLinkRef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link DetectedIntf.SourceFreqInfo}
   * @return The current DetectedIntf object instance
   * @since 3.1.0
   */
  public DetectedIntf withSourceFreqInfo(DetectedIntf.SourceFreqInfo value) {
    setSourceFreqInfo(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current DetectedIntf object instance
   * @since 3.1.0
   */
  public DetectedIntf withCls(String value) {
    setCls(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "freqSingle",
    "freqRange",
    "emsDesignator",
    "authorisedBw",
    "modDetails"
  })
  public static class SourceFreqInfo {

    @XmlElement(name = "FreqSingle")
    protected FreqSingle freqSingle;

    @XmlElement(name = "FreqRange")
    protected FreqRange freqRange;

    @XmlElement(name = "EmsDesignator")
    protected EmsDesignator emsDesignator;

    @XmlElement(name = "AuthorisedBw")
    protected AuthorisedBw authorisedBw;

    @XmlElement(name = "ModDetails")
    protected Memo modDetails;
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
     * @return a {@link EmsDesignator} instance
     * @since 3.1.0
     */
    public EmsDesignator getEmsDesignator() {
      return emsDesignator;
    }

    /**
     * Set
     * <p>
     * @param value a {@link EmsDesignator} instance
     * @since 3.1.0
     */
    public void setEmsDesignator(EmsDesignator value) {
      this.emsDesignator = value;
    }

    public boolean isSetEmsDesignator() {
      return (this.emsDesignator != null);
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
     * @return a {@link Memo} instance
     * @since 3.1.0
     */
    public Memo getModDetails() {
      return modDetails;
    }

    /**
     * Set
     * <p>
     * @param value a {@link Memo} instance
     * @since 3.1.0
     */
    public void setModDetails(Memo value) {
      this.modDetails = value;
    }

    public boolean isSetModDetails() {
      return (this.modDetails != null);
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

    public DetectedIntf.SourceFreqInfo withFreqSingle(FreqSingle value) {
      setFreqSingle(value);
      return this;
    }

    public DetectedIntf.SourceFreqInfo withFreqRange(FreqRange value) {
      setFreqRange(value);
      return this;
    }

    public DetectedIntf.SourceFreqInfo withEmsDesignator(EmsDesignator value) {
      setEmsDesignator(value);
      return this;
    }

    public DetectedIntf.SourceFreqInfo withAuthorisedBw(AuthorisedBw value) {
      setAuthorisedBw(value);
      return this;
    }

    public DetectedIntf.SourceFreqInfo withModDetails(Memo value) {
      setModDetails(value);
      return this;
    }

    public DetectedIntf.SourceFreqInfo withCls(String value) {
      setCls(value);
      return this;
    }

  }

  /**
   * Get a string representation of this DetectedIntf instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "DetectedIntf {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link DetectedIntf} requires {@link null Time}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetTime();
  }

}
