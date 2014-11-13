package us.gov.dod.standard.ssrf._1_2_4.forceelement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.Common;

/**
 * Route
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRoute", propOrder = {
  "wayPoint"
})
public class Route extends Common<Route> {

  @XmlElement(name = "WayPoint", required = true)
  protected Set<Route.WayPoint> wayPoint;

  @XmlAttribute(name = "name", required = true)
  protected String name;

  public Set<Route.WayPoint> getWayPoint() {
    if (wayPoint == null) {
      wayPoint = new HashSet<>();
    }
    return this.wayPoint;
  }

  public boolean isSetWayPoint() {
    return ((this.wayPoint != null) && (!this.wayPoint.isEmpty()));
  }

  /**
   * Clear the WayPoint field. This sets the field to null.
   */
  public void unsetWayPoint() {
    this.wayPoint = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getName() {
    return name;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setName(String value) {
    this.name = value;
  }

  public boolean isSetName() {
    return (this.name != null);
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Route.WayPoint...}
   * @return The current Route object instance
   * @since 3.1.0
   */
  public Route withWayPoint(Route.WayPoint... values) {
    if (values != null) {
      getWayPoint().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link WayPoint} instances
   * @return The current Route object instance
   * @since 3.1.0
   */
  public Route withWayPoint(Collection<Route.WayPoint> values) {
    if (values != null) {
      getWayPoint().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Route object instance
   * @since 3.1.0
   */
  public Route withName(String value) {
    setName(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class WayPoint {

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

    @XmlAttribute(name = "idx", required = true)
    protected BigInteger idx;

    @XmlAttribute(name = "alt")
    protected BigDecimal alt;

    @XmlAttribute(name = "lon", required = true)
    protected String lon;

    @XmlAttribute(name = "lat", required = true)
    protected String lat;

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
    public BigInteger getIdx() {
      return idx;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigInteger} instance
     * @since 3.1.0
     */
    public void setIdx(BigInteger value) {
      this.idx = value;
    }

    public boolean isSetIdx() {
      return (this.idx != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getAlt() {
      return alt;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setAlt(BigDecimal value) {
      this.alt = value;
    }

    public boolean isSetAlt() {
      return (this.alt != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getLon() {
      return lon;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setLon(String value) {
      this.lon = value;
    }

    public boolean isSetLon() {
      return (this.lon != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link String} instance
     * @since 3.1.0
     */
    public String getLat() {
      return lat;
    }

    /**
     * Set
     * <p>
     * @param value a {@link String} instance
     * @since 3.1.0
     */
    public void setLat(String value) {
      this.lat = value;
    }

    public boolean isSetLat() {
      return (this.lat != null);
    }

    public Route.WayPoint withCls(String value) {
      setCls(value);
      return this;
    }

    public Route.WayPoint withIdx(BigInteger value) {
      setIdx(value);
      return this;
    }

    public Route.WayPoint withAlt(BigDecimal value) {
      setAlt(value);
      return this;
    }

    public Route.WayPoint withLon(String value) {
      setLon(value);
      return this;
    }

    public Route.WayPoint withLat(String value) {
      setLat(value);
      return this;
    }

  }

  /**
   * Get a string representation of this Route instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Route {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Route} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and
   * {@link null WayPoint}, {@link null idx}, {@link null lat}, {@link null lon}, {@link null name}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetWayPoint() && isSetName();
  }

}
