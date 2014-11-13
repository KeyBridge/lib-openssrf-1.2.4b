package us.gov.dod.standard.ssrf._1_2_4;

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.antenna.*;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListAU;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;

/**
 * Antenna is the XML root for all parameters of an Antenna. It also contains
 * various technical parameters of the antenna.
 * <p>
 * Sub-Elements are
 * {@link AntHardware}, {@link AntMode}, {@link Nomenclature}, {@link POCInformation}, {@link UsingCountries}
 * <p>
 * Example:
 * <pre>
 * &lt;Antenna cls="U"&gt;
 *   &lt;Serial cls="U"&gt;TUR::AN:123&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Generic cls="U"&gt;No&lt;/Generic&gt;
 *   &lt;AntType cls="U"&gt;Billboard&lt;/AntType&gt;
 *   &lt;Nomenclature&gt;
 *     &lt;Name cls="U"&gt;XYZ&lt;/Name&gt;
 *   &lt;/Nomenclature&gt;
 *   &lt;AntMode&gt;
 *     &lt;All_AntMode_elements/&gt;
 *     &lt;/AntMode&gt;
 *   &lt;/Antenna&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAntenna", propOrder = {
  "nomenclature",
  "stockNum",
  "willReplace",
  "freqSingle",
  "freqRange",
  "phasedArray",
  "antType",
  "curve",
  "antPattern",
  "dimension",
  "aperture",
  "horzSidelobe",
  "vertSidelobe",
  "sysLosses",
  "antMode"
})
public class Antenna extends Common<Antenna> {

  /**
   * Nomenclature (Optional)
   * <p>
   * Nomenclature identifies either the standard military, government,
   * nomenclature or the commercial model number of an equipment. Each device or
   * group of devices may have several types of nomenclatures, e.g. both a
   * military nomenclature and a commercial model number.
   * <p>
   * Divergence from SMADEF: SMADEF requires (1..n) Nomenclatures
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Nomenclature", required = true)
  protected Set<Nomenclature> nomenclature;

  @XmlElement(name = "StockNum")
  protected Set<StockNum> stockNum;

  @XmlElement(name = "WillReplace")
  protected Set<WillReplace> willReplace;

  @XmlElement(name = "FreqSingle")
  protected Set<FreqSingle> freqSingle;

  @XmlElement(name = "FreqRange")
  protected FreqRange freqRange;

  @XmlElement(name = "PhasedArray")
  protected PhasedArray phasedArray;
  /**
   * AntType - Antenna Type (Required)
   * <p>
   * The type of antenna.
   * <p>
   * Format is L:CAT
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AntType", required = true)
  protected AntType antType;

  @XmlElement(name = "Curve")
  protected Set<Curve> curve;

  @XmlElement(name = "AntPattern")
  protected Set<AntPattern> antPattern;
  /**
   * HorzDimension - Horizontal Dimension (Optional)
   * <p>
   * The linear horizontal dimension of the antenna.
   * <p>
   * Format is UN(6,2) (m)
   * <p>
   * Attribute group Dimension (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Dimension")
  protected Dimension dimension;
  /**
   * ApertureDiameter - Aperture Diameter (Optional)
   * <p>
   * The cross-section of an antenna radiation pattern in the direction of
   * highest gain.
   * <p>
   * Format is UN(6,2) (m)
   * <p>
   * Attribute group Aperture (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Aperture")
  protected Aperture aperture;
  /**
   * HorzSidelobeAttenuation - Horizontal Sidelobe Attenuation (Optional)
   * <p>
   * The amount of suppression relative to the main beam gain of the antenna.
   * <p>
   * Format is UN(5,2) (dB)
   * <p>
   * Attribute group Sidelobe (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "HorzSidelobe")
  protected HorzSidelobe horzSidelobe;
  /**
   * VertSidelobeAttenuation - Vertical Sidelobe Attenuation (Optional)
   * <p>
   * The attenuation of the sidelobe relative to the main beam gain.
   * <p>
   * Format is UN(5,2) (dB)
   * <p>
   * Attribute group Sidelobe (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "VertSidelobe")
  protected VertSidelobe vertSidelobe;

  @XmlElement(name = "SysLosses")
  protected SysLosses sysLosses;
  /**
   * AntMode (Optional)
   * <p>
   * AntMode contains the technical characteristics of one antenna mode.
   * <p>
   * Divergence from SMADEF: SMADEF requires (1..n) AntModes
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "AntMode", required = true)
  protected Set<AntMode> antMode;

  @XmlAttribute(name = "motionType", required = true)
  protected String motionType;

  @XmlAttribute(name = "antUse")
  protected ListAU antUse;

  @XmlAttribute(name = "sectBlanking")
  protected String sectBlanking;

  @XmlAttribute(name = "feedType")
  protected String feedType;

  @XmlAttribute(name = "leadType")
  protected String leadType;

  /**
   * Get the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   * <p>
   * @return a {@link Nomenclature} instance
   * @since 3.1.0
   */
  public Set<Nomenclature> getNomenclature() {
    if (nomenclature == null) {
      nomenclature = new HashSet<>();
    }
    return this.nomenclature;
  }

  public boolean isSetNomenclature() {
    return ((this.nomenclature != null) && (!this.nomenclature.isEmpty()));
  }

  /**
   * Clear the Nomenclature field. This sets the field to null.
   */
  public void unsetNomenclature() {
    this.nomenclature = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link StockNum} instance
   * @since 3.1.0
   */
  public Set<StockNum> getStockNum() {
    if (stockNum == null) {
      stockNum = new HashSet<>();
    }
    return this.stockNum;
  }

  public boolean isSetStockNum() {
    return ((this.stockNum != null) && (!this.stockNum.isEmpty()));
  }

  /**
   * Clear the StockNum field. This sets the field to null.
   */
  public void unsetStockNum() {
    this.stockNum = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link WillReplace} instance
   * @since 3.1.0
   */
  public Set<WillReplace> getWillReplace() {
    if (willReplace == null) {
      willReplace = new HashSet<>();
    }
    return this.willReplace;
  }

  public boolean isSetWillReplace() {
    return ((this.willReplace != null) && (!this.willReplace.isEmpty()));
  }

  /**
   * Clear the WillReplace field. This sets the field to null.
   */
  public void unsetWillReplace() {
    this.willReplace = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link FreqSingle} instance
   * @since 3.1.0
   */
  public Set<FreqSingle> getFreqSingle() {
    if (freqSingle == null) {
      freqSingle = new HashSet<>();
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
   * @return a {@link PhasedArray} instance
   * @since 3.1.0
   */
  public PhasedArray getPhasedArray() {
    return phasedArray;
  }

  /**
   * Set
   * <p>
   * @param value a {@link PhasedArray} instance
   * @since 3.1.0
   */
  public void setPhasedArray(PhasedArray value) {
    this.phasedArray = value;
  }

  public boolean isSetPhasedArray() {
    return (this.phasedArray != null);
  }

  /**
   * Get the type of antenna.
   * <p>
   * @return a {@link AntType} instance
   * @since 3.1.0
   */
  public AntType getAntType() {
    return antType;
  }

  /**
   * Set the type of antenna.
   * <p>
   * @param value a {@link AntType} instance
   * @since 3.1.0
   */
  public void setAntType(AntType value) {
    this.antType = value;
  }

  public boolean isSetAntType() {
    return (this.antType != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link Curve} instance
   * @since 3.1.0
   */
  public Set<Curve> getCurve() {
    if (curve == null) {
      curve = new HashSet<>();
    }
    return this.curve;
  }

  public boolean isSetCurve() {
    return ((this.curve != null) && (!this.curve.isEmpty()));
  }

  /**
   * Clear the Curve field. This sets the field to null.
   */
  public void unsetCurve() {
    this.curve = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link AntPattern} instance
   * @since 3.1.0
   */
  public Set<AntPattern> getAntPattern() {
    if (antPattern == null) {
      antPattern = new HashSet<>();
    }
    return this.antPattern;
  }

  public boolean isSetAntPattern() {
    return ((this.antPattern != null) && (!this.antPattern.isEmpty()));
  }

  /**
   * Clear the AntPattern field. This sets the field to null.
   */
  public void unsetAntPattern() {
    this.antPattern = null;
  }

  /**
   * Get the linear horizontal dimension of the antenna.
   * <p>
   * @return a {@link Dimension} instance
   * @since 3.1.0
   */
  public Dimension getDimension() {
    return dimension;
  }

  /**
   * Set the linear horizontal dimension of the antenna.
   * <p>
   * @param value a {@link Dimension} instance
   * @since 3.1.0
   */
  public void setDimension(Dimension value) {
    this.dimension = value;
  }

  public boolean isSetDimension() {
    return (this.dimension != null);
  }

  /**
   * Get the cross-section of an antenna radiation pattern in the direction of
   * highest gain.
   * <p>
   * @return a {@link Aperture} instance
   * @since 3.1.0
   */
  public Aperture getAperture() {
    return aperture;
  }

  /**
   * Set the cross-section of an antenna radiation pattern in the direction of
   * highest gain.
   * <p>
   * @param value a {@link Aperture} instance
   * @since 3.1.0
   */
  public void setAperture(Aperture value) {
    this.aperture = value;
  }

  public boolean isSetAperture() {
    return (this.aperture != null);
  }

  /**
   * Get the amount of suppression relative to the main beam gain of the
   * antenna.
   * <p>
   * @return a {@link HorzSidelobe} instance
   * @since 3.1.0
   */
  public HorzSidelobe getHorzSidelobe() {
    return horzSidelobe;
  }

  /**
   * Set the amount of suppression relative to the main beam gain of the
   * antenna.
   * <p>
   * @param value a {@link HorzSidelobe} instance
   * @since 3.1.0
   */
  public void setHorzSidelobe(HorzSidelobe value) {
    this.horzSidelobe = value;
  }

  public boolean isSetHorzSidelobe() {
    return (this.horzSidelobe != null);
  }

  /**
   * Get the attenuation of the sidelobe relative to the main beam gain.
   * <p>
   * @return a {@link VertSidelobe} instance
   * @since 3.1.0
   */
  public VertSidelobe getVertSidelobe() {
    return vertSidelobe;
  }

  /**
   * Set the attenuation of the sidelobe relative to the main beam gain.
   * <p>
   * @param value a {@link VertSidelobe} instance
   * @since 3.1.0
   */
  public void setVertSidelobe(VertSidelobe value) {
    this.vertSidelobe = value;
  }

  public boolean isSetVertSidelobe() {
    return (this.vertSidelobe != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link SysLosses} instance
   * @since 3.1.0
   */
  public SysLosses getSysLosses() {
    return sysLosses;
  }

  /**
   * Set
   * <p>
   * @param value a {@link SysLosses} instance
   * @since 3.1.0
   */
  public void setSysLosses(SysLosses value) {
    this.sysLosses = value;
  }

  public boolean isSetSysLosses() {
    return (this.sysLosses != null);
  }

  /**
   * Get the AntMode
   * <p>
   * Complex element AntMode contains the technical characteristics of one
   * antenna mode.
   * <p>
   * @return a {@link AntMode} instance
   * @since 3.1.0
   */
  public Set<AntMode> getAntMode() {
    if (antMode == null) {
      antMode = new HashSet<>();
    }
    return this.antMode;
  }

  public boolean isSetAntMode() {
    return ((this.antMode != null) && (!this.antMode.isEmpty()));
  }

  /**
   * Clear the AntMode field. This sets the field to null.
   */
  public void unsetAntMode() {
    this.antMode = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getMotionType() {
    return motionType;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setMotionType(String value) {
    this.motionType = value;
  }

  public boolean isSetMotionType() {
    return (this.motionType != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link ListAU} instance
   * @since 3.1.0
   */
  public ListAU getAntUse() {
    return antUse;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ListAU} instance
   * @since 3.1.0
   */
  public void setAntUse(ListAU value) {
    this.antUse = value;
  }

  public boolean isSetAntUse() {
    return (this.antUse != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getSectBlanking() {
    return sectBlanking;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setSectBlanking(String value) {
    this.sectBlanking = value;
  }

  public boolean isSetSectBlanking() {
    return (this.sectBlanking != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getFeedType() {
    return feedType;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setFeedType(String value) {
    this.feedType = value;
  }

  public boolean isSetFeedType() {
    return (this.feedType != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getLeadType() {
    return leadType;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setLeadType(String value) {
    this.leadType = value;
  }

  public boolean isSetLeadType() {
    return (this.leadType != null);
  }

  /**
   * Set the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   * <p>
   * @param values One or more instances of type {@link Nomenclature...}
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withNomenclature(Nomenclature... values) {
    if (values != null) {
      getNomenclature().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the Nomenclature
   * <p>
   * Complex element Nomenclature identifies either the standard military,
   * government, nomenclature or the commercial model number of an equipment.
   * Each device or group of devices may have several types of nomenclatures,
   * e.g. both a military nomenclature and a commercial model number.
   * <p>
   * @param values A collection of {@link Nomenclature} instances
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withNomenclature(Collection<Nomenclature> values) {
    if (values != null) {
      getNomenclature().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link StockNum...}
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withStockNum(StockNum... values) {
    if (values != null) {
      getStockNum().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link StockNum} instances
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withStockNum(Collection<StockNum> values) {
    if (values != null) {
      getStockNum().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link WillReplace...}
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withWillReplace(WillReplace... values) {
    if (values != null) {
      getWillReplace().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link WillReplace} instances
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withWillReplace(Collection<WillReplace> values) {
    if (values != null) {
      getWillReplace().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link FreqSingle...}
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withFreqSingle(FreqSingle... values) {
    if (values != null) {
      getFreqSingle().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link FreqSingle} instances
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withFreqSingle(Collection<FreqSingle> values) {
    if (values != null) {
      getFreqSingle().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link FreqRange}
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withFreqRange(FreqRange value) {
    setFreqRange(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link PhasedArray}
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withPhasedArray(PhasedArray value) {
    setPhasedArray(value);
    return this;
  }

  /**
   * Set the type of antenna.
   * <p>
   * @param value An instances of type {@link AntType}
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withAntType(AntType value) {
    setAntType(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Curve...}
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withCurve(Curve... values) {
    if (values != null) {
      getCurve().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Curve} instances
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withCurve(Collection<Curve> values) {
    if (values != null) {
      getCurve().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link AntPattern...}
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withAntPattern(AntPattern... values) {
    if (values != null) {
      getAntPattern().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link AntPattern} instances
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withAntPattern(Collection<AntPattern> values) {
    if (values != null) {
      getAntPattern().addAll(values);
    }
    return this;
  }

  /**
   * Set the linear horizontal dimension of the antenna.
   * <p>
   * @param value An instances of type {@link Dimension}
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withDimension(Dimension value) {
    setDimension(value);
    return this;
  }

  /**
   * Set the cross-section of an antenna radiation pattern in the direction of
   * highest gain.
   * <p>
   * @param value An instances of type {@link Aperture}
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withAperture(Aperture value) {
    setAperture(value);
    return this;
  }

  /**
   * Set the amount of suppression relative to the main beam gain of the
   * antenna.
   * <p>
   * @param value An instances of type {@link HorzSidelobe}
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withHorzSidelobe(HorzSidelobe value) {
    setHorzSidelobe(value);
    return this;
  }

  /**
   * Set the attenuation of the sidelobe relative to the main beam gain.
   * <p>
   * @param value An instances of type {@link VertSidelobe}
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withVertSidelobe(VertSidelobe value) {
    setVertSidelobe(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link SysLosses}
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withSysLosses(SysLosses value) {
    setSysLosses(value);
    return this;
  }

  /**
   * Set the AntMode
   * <p>
   * Complex element AntMode contains the technical characteristics of one
   * antenna mode.
   * <p>
   * @param values One or more instances of type {@link AntMode...}
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withAntMode(AntMode... values) {
    if (values != null) {
      getAntMode().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the AntMode
   * <p>
   * Complex element AntMode contains the technical characteristics of one
   * antenna mode.
   * <p>
   * @param values A collection of {@link AntMode} instances
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withAntMode(Collection<AntMode> values) {
    if (values != null) {
      getAntMode().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withMotionType(String value) {
    setMotionType(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ListAU}
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withAntUse(ListAU value) {
    setAntUse(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withSectBlanking(String value) {
    setSectBlanking(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withFeedType(String value) {
    setFeedType(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Antenna object instance
   * @since 3.1.0
   */
  public Antenna withLeadType(String value) {
    setLeadType(value);
    return this;
  }

  /**
   * Get a string representation of this Antenna instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Antenna {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Antenna} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and
   * {@link null AntMode}, {@link null AntType}, {@link null Nomenclature}, {@link null motionType}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetAntMode() && isSetAntType() && isSetNomenclature() && isSetMotionType();
  }

}
