package us.gov.dod.standard.ssrf._1_2_4.refdata;

import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.Memo;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;

/**
 * CoordStd
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCoordStd", propOrder = {
  "coordSpec"
})
public class CoordStd extends Std<CoordStd> {

  @XmlElement(name = "CoordSpec", required = true)
  protected Set<CoordStd.CoordSpec> coordSpec;

  public Set<CoordStd.CoordSpec> getCoordSpec() {
    if (coordSpec == null) {
      coordSpec = new HashSet<>();
    }
    return this.coordSpec;
  }

  public boolean isSetCoordSpec() {
    return ((this.coordSpec != null) && (!this.coordSpec.isEmpty()));
  }

  /**
   * Clear the CoordSpec field. This sets the field to null.
   */
  public void unsetCoordSpec() {
    this.coordSpec = null;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link CoordStd.CoordSpec...}
   * @return The current CoordStd object instance
   * @since 3.1.0
   */
  public CoordStd withCoordSpec(CoordStd.CoordSpec... values) {
    if (values != null) {
      getCoordSpec().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link CoordSpec} instances
   * @return The current CoordStd object instance
   * @since 3.1.0
   */
  public CoordStd withCoordSpec(Collection<CoordStd.CoordSpec> values) {
    if (values != null) {
      getCoordSpec().addAll(values);
    }
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "locationRef",
    "chnlPlanRef",
    "antStdRef",
    "emsStdRef",
    "rxStdRef",
    "coordProcess"
  })
  public static class CoordSpec {

    @XmlElement(name = "LocationRef")
    protected Set<LocationRef> locationRef;

    @XmlElement(name = "ChnlPlanRef")
    protected ElmRef chnlPlanRef;

    @XmlElement(name = "AntStdRef")
    protected NationalElmRef antStdRef;

    @XmlElement(name = "EmsStdRef")
    protected ElmRef emsStdRef;

    @XmlElement(name = "RxStdRef")
    protected NationalElmRef rxStdRef;

    @XmlElement(name = "CoordProcess", required = true)
    protected Memo coordProcess;
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
     * @return a {@link ElmRef} instance
     * @since 3.1.0
     */
    public ElmRef getChnlPlanRef() {
      return chnlPlanRef;
    }

    /**
     * Set
     * <p>
     * @param value a {@link ElmRef} instance
     * @since 3.1.0
     */
    public void setChnlPlanRef(ElmRef value) {
      this.chnlPlanRef = value;
    }

    public boolean isSetChnlPlanRef() {
      return (this.chnlPlanRef != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link NationalElmRef} instance
     * @since 3.1.0
     */
    public NationalElmRef getAntStdRef() {
      return antStdRef;
    }

    /**
     * Set
     * <p>
     * @param value a {@link NationalElmRef} instance
     * @since 3.1.0
     */
    public void setAntStdRef(NationalElmRef value) {
      this.antStdRef = value;
    }

    public boolean isSetAntStdRef() {
      return (this.antStdRef != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link ElmRef} instance
     * @since 3.1.0
     */
    public ElmRef getEmsStdRef() {
      return emsStdRef;
    }

    /**
     * Set
     * <p>
     * @param value a {@link ElmRef} instance
     * @since 3.1.0
     */
    public void setEmsStdRef(ElmRef value) {
      this.emsStdRef = value;
    }

    public boolean isSetEmsStdRef() {
      return (this.emsStdRef != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link NationalElmRef} instance
     * @since 3.1.0
     */
    public NationalElmRef getRxStdRef() {
      return rxStdRef;
    }

    /**
     * Set
     * <p>
     * @param value a {@link NationalElmRef} instance
     * @since 3.1.0
     */
    public void setRxStdRef(NationalElmRef value) {
      this.rxStdRef = value;
    }

    public boolean isSetRxStdRef() {
      return (this.rxStdRef != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link Memo} instance
     * @since 3.1.0
     */
    public Memo getCoordProcess() {
      return coordProcess;
    }

    /**
     * Set
     * <p>
     * @param value a {@link Memo} instance
     * @since 3.1.0
     */
    public void setCoordProcess(Memo value) {
      this.coordProcess = value;
    }

    public boolean isSetCoordProcess() {
      return (this.coordProcess != null);
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

    public CoordStd.CoordSpec withLocationRef(LocationRef... values) {
      if (values != null) {
        getLocationRef().addAll(Arrays.asList(values));
      }
      return this;
    }

    public CoordStd.CoordSpec withLocationRef(Collection<LocationRef> values) {
      if (values != null) {
        getLocationRef().addAll(values);
      }
      return this;
    }

    public CoordStd.CoordSpec withChnlPlanRef(ElmRef value) {
      setChnlPlanRef(value);
      return this;
    }

    public CoordStd.CoordSpec withAntStdRef(NationalElmRef value) {
      setAntStdRef(value);
      return this;
    }

    public CoordStd.CoordSpec withEmsStdRef(ElmRef value) {
      setEmsStdRef(value);
      return this;
    }

    public CoordStd.CoordSpec withRxStdRef(NationalElmRef value) {
      setRxStdRef(value);
      return this;
    }

    public CoordStd.CoordSpec withCoordProcess(Memo value) {
      setCoordProcess(value);
      return this;
    }

    public CoordStd.CoordSpec withCls(String value) {
      setCls(value);
      return this;
    }

  }

  /**
   * Get a string representation of this CoordStd instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "CoordStd {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link CoordStd} requires
   * {@link null CoordProcess}, {@link null CoordSpec}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return isSetCoordSpec();
  }

}
