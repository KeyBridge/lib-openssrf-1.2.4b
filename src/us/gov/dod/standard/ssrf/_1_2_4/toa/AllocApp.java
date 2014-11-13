package us.gov.dod.standard.ssrf._1_2_4.toa;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.TDateTime;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListAR;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListSC;
import us.gov.dod.standard.ssrf._1_2_4.metadata.lists.ListSN;
import us.gov.dod.standard.ssrf._1_2_4.refdata.NoteRef;
import us.gov.dod.standard.ssrf._1_2_4.shared.ElmRef;
import us.gov.dod.standard.ssrf._1_2_4.shared.LocationRef;
import us.gov.dod.standard.ssrf._1_2_4.shared.NationalElmRef;

/**
 * AllocApp
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAllocApp", propOrder = {
  "allocVariance",
  "effDate",
  "expire",
  "bandAppRef",
  "antStdRef",
  "chnlPlanRef",
  "coordStdRef",
  "curveStdRef",
  "emsMaskStdRef",
  "emsStdRef",
  "locationRef",
  "noteRef",
  "rxStdRef",
  "serviceUse",
  "stnClass",
  "bandUserRef"
})
public class AllocApp {

  @XmlElement(name = "AllocVariance")
  protected AllocApp.AllocVariance allocVariance;

  @XmlElement(name = "EffDate")
  protected TDateTime effDate;

  @XmlElement(name = "Expire")
  protected TDateTime expire;

  @XmlElement(name = "BandAppRef")
  protected ElmRef bandAppRef;

  @XmlElement(name = "AntStdRef")
  protected Set<NationalElmRef> antStdRef;

  @XmlElement(name = "ChnlPlanRef")
  protected Set<ElmRef> chnlPlanRef;

  @XmlElement(name = "CoordStdRef")
  protected Set<ElmRef> coordStdRef;

  @XmlElement(name = "CurveStdRef")
  protected Set<NationalElmRef> curveStdRef;

  @XmlElement(name = "EmsMaskStdRef")
  protected Set<NationalElmRef> emsMaskStdRef;

  @XmlElement(name = "EmsStdRef")
  protected Set<ElmRef> emsStdRef;

  @XmlElement(name = "LocationRef")
  protected Set<LocationRef> locationRef;

  @XmlElement(name = "NoteRef")
  protected Set<NoteRef> noteRef;

  @XmlElement(name = "RxStdRef")
  protected Set<NationalElmRef> rxStdRef;

  @XmlElement(name = "ServiceUse")
  protected Set<AllocApp.ServiceUse> serviceUse;

  @XmlElement(name = "StnClass")
  protected Set<AllocApp.StnClass> stnClass;

  @XmlElement(name = "BandUserRef")
  protected Set<ElmRef> bandUserRef;
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

  @XmlAttribute(name = "accomodation")
  protected ListAR accomodation;

  @XmlAttribute(name = "licensing")
  protected String licensing;

  @XmlAttribute(name = "exclusiveApp")
  protected String exclusiveApp;

  @XmlAttribute(name = "asgnAuthority")
  protected String asgnAuthority;

  @XmlAttribute(name = "permit")
  protected String permit;

  public AllocApp.AllocVariance getAllocVariance() {
    return allocVariance;
  }

  /**
   * Set
   * <p>
   * @param value a {@link AllocApp} instance
   * @since 3.1.0
   */
  public void setAllocVariance(AllocApp.AllocVariance value) {
    this.allocVariance = value;
  }

  public boolean isSetAllocVariance() {
    return (this.allocVariance != null);
  }

  /**
   * Get
   * <p>
   * @return the EffDate value in a {@link TDateTime} data type
   * @since 3.1.0
   */
  public TDateTime getEffDate() {
    return effDate;
  }

  /**
   * Set
   * <p>
   * @param value the EffDate value in a {@link TDateTime} data type
   * @since 3.1.0
   */
  public void setEffDate(TDateTime value) {
    this.effDate = value;
  }

  public boolean isSetEffDate() {
    return (this.effDate != null);
  }

  /**
   * Get
   * <p>
   * @return the Expire value in a {@link TDateTime} data type
   * @since 3.1.0
   */
  public TDateTime getExpire() {
    return expire;
  }

  /**
   * Set
   * <p>
   * @param value the Expire value in a {@link TDateTime} data type
   * @since 3.1.0
   */
  public void setExpire(TDateTime value) {
    this.expire = value;
  }

  public boolean isSetExpire() {
    return (this.expire != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public ElmRef getBandAppRef() {
    return bandAppRef;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ElmRef} instance
   * @since 3.1.0
   */
  public void setBandAppRef(ElmRef value) {
    this.bandAppRef = value;
  }

  public boolean isSetBandAppRef() {
    return (this.bandAppRef != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link NationalElmRef} instance
   * @since 3.1.0
   */
  public Set<NationalElmRef> getAntStdRef() {
    if (antStdRef == null) {
      antStdRef = new HashSet<>();
    }
    return this.antStdRef;
  }

  public boolean isSetAntStdRef() {
    return ((this.antStdRef != null) && (!this.antStdRef.isEmpty()));
  }

  /**
   * Clear the AntStdRef field. This sets the field to null.
   */
  public void unsetAntStdRef() {
    this.antStdRef = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public Set<ElmRef> getChnlPlanRef() {
    if (chnlPlanRef == null) {
      chnlPlanRef = new HashSet<>();
    }
    return this.chnlPlanRef;
  }

  public boolean isSetChnlPlanRef() {
    return ((this.chnlPlanRef != null) && (!this.chnlPlanRef.isEmpty()));
  }

  /**
   * Clear the ChnlPlanRef field. This sets the field to null.
   */
  public void unsetChnlPlanRef() {
    this.chnlPlanRef = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public Set<ElmRef> getCoordStdRef() {
    if (coordStdRef == null) {
      coordStdRef = new HashSet<>();
    }
    return this.coordStdRef;
  }

  public boolean isSetCoordStdRef() {
    return ((this.coordStdRef != null) && (!this.coordStdRef.isEmpty()));
  }

  /**
   * Clear the CoordStdRef field. This sets the field to null.
   */
  public void unsetCoordStdRef() {
    this.coordStdRef = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link NationalElmRef} instance
   * @since 3.1.0
   */
  public Set<NationalElmRef> getCurveStdRef() {
    if (curveStdRef == null) {
      curveStdRef = new HashSet<>();
    }
    return this.curveStdRef;
  }

  public boolean isSetCurveStdRef() {
    return ((this.curveStdRef != null) && (!this.curveStdRef.isEmpty()));
  }

  /**
   * Clear the CurveStdRef field. This sets the field to null.
   */
  public void unsetCurveStdRef() {
    this.curveStdRef = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link NationalElmRef} instance
   * @since 3.1.0
   */
  public Set<NationalElmRef> getEmsMaskStdRef() {
    if (emsMaskStdRef == null) {
      emsMaskStdRef = new HashSet<>();
    }
    return this.emsMaskStdRef;
  }

  public boolean isSetEmsMaskStdRef() {
    return ((this.emsMaskStdRef != null) && (!this.emsMaskStdRef.isEmpty()));
  }

  /**
   * Clear the EmsMaskStdRef field. This sets the field to null.
   */
  public void unsetEmsMaskStdRef() {
    this.emsMaskStdRef = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public Set<ElmRef> getEmsStdRef() {
    if (emsStdRef == null) {
      emsStdRef = new HashSet<>();
    }
    return this.emsStdRef;
  }

  public boolean isSetEmsStdRef() {
    return ((this.emsStdRef != null) && (!this.emsStdRef.isEmpty()));
  }

  /**
   * Clear the EmsStdRef field. This sets the field to null.
   */
  public void unsetEmsStdRef() {
    this.emsStdRef = null;
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
   * @return a {@link NationalElmRef} instance
   * @since 3.1.0
   */
  public Set<NationalElmRef> getRxStdRef() {
    if (rxStdRef == null) {
      rxStdRef = new HashSet<>();
    }
    return this.rxStdRef;
  }

  public boolean isSetRxStdRef() {
    return ((this.rxStdRef != null) && (!this.rxStdRef.isEmpty()));
  }

  /**
   * Clear the RxStdRef field. This sets the field to null.
   */
  public void unsetRxStdRef() {
    this.rxStdRef = null;
  }

  public Set<AllocApp.ServiceUse> getServiceUse() {
    if (serviceUse == null) {
      serviceUse = new HashSet<>();
    }
    return this.serviceUse;
  }

  public boolean isSetServiceUse() {
    return ((this.serviceUse != null) && (!this.serviceUse.isEmpty()));
  }

  /**
   * Clear the ServiceUse field. This sets the field to null.
   */
  public void unsetServiceUse() {
    this.serviceUse = null;
  }

  public Set<AllocApp.StnClass> getStnClass() {
    if (stnClass == null) {
      stnClass = new HashSet<>();
    }
    return this.stnClass;
  }

  public boolean isSetStnClass() {
    return ((this.stnClass != null) && (!this.stnClass.isEmpty()));
  }

  /**
   * Clear the StnClass field. This sets the field to null.
   */
  public void unsetStnClass() {
    this.stnClass = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link ElmRef} instance
   * @since 3.1.0
   */
  public Set<ElmRef> getBandUserRef() {
    if (bandUserRef == null) {
      bandUserRef = new HashSet<>();
    }
    return this.bandUserRef;
  }

  public boolean isSetBandUserRef() {
    return ((this.bandUserRef != null) && (!this.bandUserRef.isEmpty()));
  }

  /**
   * Clear the BandUserRef field. This sets the field to null.
   */
  public void unsetBandUserRef() {
    this.bandUserRef = null;
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
   * Get
   * <p>
   * @return a {@link ListAR} instance
   * @since 3.1.0
   */
  public ListAR getAccomodation() {
    return accomodation;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ListAR} instance
   * @since 3.1.0
   */
  public void setAccomodation(ListAR value) {
    this.accomodation = value;
  }

  public boolean isSetAccomodation() {
    return (this.accomodation != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getLicensing() {
    return licensing;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setLicensing(String value) {
    this.licensing = value;
  }

  public boolean isSetLicensing() {
    return (this.licensing != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getExclusiveApp() {
    return exclusiveApp;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setExclusiveApp(String value) {
    this.exclusiveApp = value;
  }

  public boolean isSetExclusiveApp() {
    return (this.exclusiveApp != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getAsgnAuthority() {
    return asgnAuthority;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setAsgnAuthority(String value) {
    this.asgnAuthority = value;
  }

  public boolean isSetAsgnAuthority() {
    return (this.asgnAuthority != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getPermit() {
    return permit;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setPermit(String value) {
    this.permit = value;
  }

  public boolean isSetPermit() {
    return (this.permit != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link AllocApp.AllocVariance}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withAllocVariance(AllocApp.AllocVariance value) {
    setAllocVariance(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TDateTime}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withEffDate(TDateTime value) {
    setEffDate(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link TDateTime}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withExpire(TDateTime value) {
    setExpire(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ElmRef}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withBandAppRef(ElmRef value) {
    setBandAppRef(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link NationalElmRef...}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withAntStdRef(NationalElmRef... values) {
    if (values != null) {
      getAntStdRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link AntStdRef} instances
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withAntStdRef(Collection<NationalElmRef> values) {
    if (values != null) {
      getAntStdRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ElmRef...}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withChnlPlanRef(ElmRef... values) {
    if (values != null) {
      getChnlPlanRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ChnlPlanRef} instances
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withChnlPlanRef(Collection<ElmRef> values) {
    if (values != null) {
      getChnlPlanRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ElmRef...}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withCoordStdRef(ElmRef... values) {
    if (values != null) {
      getCoordStdRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link CoordStdRef} instances
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withCoordStdRef(Collection<ElmRef> values) {
    if (values != null) {
      getCoordStdRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link NationalElmRef...}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withCurveStdRef(NationalElmRef... values) {
    if (values != null) {
      getCurveStdRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link CurveStdRef} instances
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withCurveStdRef(Collection<NationalElmRef> values) {
    if (values != null) {
      getCurveStdRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link NationalElmRef...}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withEmsMaskStdRef(NationalElmRef... values) {
    if (values != null) {
      getEmsMaskStdRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link EmsMaskStdRef} instances
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withEmsMaskStdRef(Collection<NationalElmRef> values) {
    if (values != null) {
      getEmsMaskStdRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ElmRef...}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withEmsStdRef(ElmRef... values) {
    if (values != null) {
      getEmsStdRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link EmsStdRef} instances
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withEmsStdRef(Collection<ElmRef> values) {
    if (values != null) {
      getEmsStdRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link LocationRef...}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withLocationRef(LocationRef... values) {
    if (values != null) {
      getLocationRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link LocationRef} instances
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withLocationRef(Collection<LocationRef> values) {
    if (values != null) {
      getLocationRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link NoteRef...}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withNoteRef(NoteRef... values) {
    if (values != null) {
      getNoteRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link NoteRef} instances
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withNoteRef(Collection<NoteRef> values) {
    if (values != null) {
      getNoteRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link NationalElmRef...}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withRxStdRef(NationalElmRef... values) {
    if (values != null) {
      getRxStdRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link RxStdRef} instances
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withRxStdRef(Collection<NationalElmRef> values) {
    if (values != null) {
      getRxStdRef().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link AllocApp.ServiceUse...}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withServiceUse(AllocApp.ServiceUse... values) {
    if (values != null) {
      getServiceUse().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ServiceUse} instances
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withServiceUse(Collection<AllocApp.ServiceUse> values) {
    if (values != null) {
      getServiceUse().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link AllocApp.StnClass...}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withStnClass(AllocApp.StnClass... values) {
    if (values != null) {
      getStnClass().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link StnClass} instances
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withStnClass(Collection<AllocApp.StnClass> values) {
    if (values != null) {
      getStnClass().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ElmRef...}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withBandUserRef(ElmRef... values) {
    if (values != null) {
      getBandUserRef().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link BandUserRef} instances
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withBandUserRef(Collection<ElmRef> values) {
    if (values != null) {
      getBandUserRef().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ListAR}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withAccomodation(ListAR value) {
    setAccomodation(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withLicensing(String value) {
    setLicensing(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withExclusiveApp(String value) {
    setExclusiveApp(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withAsgnAuthority(String value) {
    setAsgnAuthority(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current AllocApp object instance
   * @since 3.1.0
   */
  public AllocApp withPermit(String value) {
    setPermit(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class AllocVariance {

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

    @XmlAttribute(name = "type")
    protected String type;

    @XmlAttribute(name = "item")
    protected String item;

    @XmlAttribute(name = "radioService")
    protected ListSN radioService;

    @XmlAttribute(name = "priority")
    protected BigInteger priority;

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

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getType() {
      return type;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setType(String value) {
      this.type = value;
    }

    public boolean isSetType() {
      return (this.type != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getItem() {
      return item;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setItem(String value) {
      this.item = value;
    }

    public boolean isSetItem() {
      return (this.item != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link ListSN} instance
     * @since 3.1.0
     */
    public ListSN getRadioService() {
      return radioService;
    }

    /**
     * Set
     * <p>
     * @param value a {@link ListSN} instance
     * @since 3.1.0
     */
    public void setRadioService(ListSN value) {
      this.radioService = value;
    }

    public boolean isSetRadioService() {
      return (this.radioService != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link BigInteger} instance
     * @since 3.1.0
     */
    public BigInteger getPriority() {
      return priority;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigInteger} instance
     * @since 3.1.0
     */
    public void setPriority(BigInteger value) {
      this.priority = value;
    }

    public boolean isSetPriority() {
      return (this.priority != null);
    }

    public AllocApp.AllocVariance withCls(String value) {
      setCls(value);
      return this;
    }

    public AllocApp.AllocVariance withType(String value) {
      setType(value);
      return this;
    }

    public AllocApp.AllocVariance withItem(String value) {
      setItem(value);
      return this;
    }

    public AllocApp.AllocVariance withRadioService(ListSN value) {
      setRadioService(value);
      return this;
    }

    public AllocApp.AllocVariance withPriority(BigInteger value) {
      setPriority(value);
      return this;
    }

  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "value"
  })
  public static class ServiceUse {

    @XmlValue
    protected ListSN value;
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

    @XmlAttribute(name = "priority", required = true)
    protected BigInteger priority;

    /**
     * Get a value that is most probably correct.
     * <p>
     * @return a {@link ListSN} instance
     * @since 3.1.0
     */
    public ListSN getValue() {
      return value;
    }

    /**
     * Set a value that is most probably correct.
     * <p>
     * @param value a {@link ListSN} instance
     * @since 3.1.0
     */
    public void setValue(ListSN value) {
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

    /**
     * Get
     * <p>
     * @return a {@link BigInteger} instance
     * @since 3.1.0
     */
    public BigInteger getPriority() {
      return priority;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigInteger} instance
     * @since 3.1.0
     */
    public void setPriority(BigInteger value) {
      this.priority = value;
    }

    public boolean isSetPriority() {
      return (this.priority != null);
    }

    public AllocApp.ServiceUse withValue(ListSN value) {
      setValue(value);
      return this;
    }

    public AllocApp.ServiceUse withCls(String value) {
      setCls(value);
      return this;
    }

    public AllocApp.ServiceUse withPriority(BigInteger value) {
      setPriority(value);
      return this;
    }

  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "value"
  })
  public static class StnClass {

    @XmlValue
    protected ListSC value;
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
     * @return a {@link ListSC} instance
     * @since 3.1.0
     */
    public ListSC getValue() {
      return value;
    }

    /**
     * Set a value that is most probably correct.
     * <p>
     * @param value a {@link ListSC} instance
     * @since 3.1.0
     */
    public void setValue(ListSC value) {
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

    public AllocApp.StnClass withValue(ListSC value) {
      setValue(value);
      return this;
    }

    public AllocApp.StnClass withCls(String value) {
      setCls(value);
      return this;
    }

  }

  /**
   * Get a string representation of this AllocApp instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AllocApp {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AllocApp} requires {@link null priority}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
//    return isSetPriority();
    return true;
  }

}
