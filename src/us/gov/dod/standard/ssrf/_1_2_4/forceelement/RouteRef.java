package us.gov.dod.standard.ssrf._1_2_4.forceelement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * RouteRef
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRouteRef", propOrder = {
  "atWayPoint"
})
public class RouteRef {

  @XmlElement(name = "AtWayPoint", required = true)
  protected Set<RouteRef.AtWayPoint> atWayPoint;
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

  @XmlAttribute(name = "serial", required = true)
  protected String serial;

  public Set<RouteRef.AtWayPoint> getAtWayPoint() {
    if (atWayPoint == null) {
      atWayPoint = new HashSet<>();
    }
    return this.atWayPoint;
  }

  public boolean isSetAtWayPoint() {
    return ((this.atWayPoint != null) && (!this.atWayPoint.isEmpty()));
  }

  /**
   * Clear the AtWayPoint field. This sets the field to null.
   */
  public void unsetAtWayPoint() {
    this.atWayPoint = null;
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
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getSerial() {
    return serial;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setSerial(String value) {
    this.serial = value;
  }

  public boolean isSetSerial() {
    return (this.serial != null);
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link RouteRef.AtWayPoint...}
   * @return The current RouteRef object instance
   * @since 3.1.0
   */
  public RouteRef withAtWayPoint(RouteRef.AtWayPoint... values) {
    if (values != null) {
      getAtWayPoint().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link AtWayPoint} instances
   * @return The current RouteRef object instance
   * @since 3.1.0
   */
  public RouteRef withAtWayPoint(Collection<RouteRef.AtWayPoint> values) {
    if (values != null) {
      getAtWayPoint().addAll(values);
    }
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RouteRef object instance
   * @since 3.1.0
   */
  public RouteRef withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current RouteRef object instance
   * @since 3.1.0
   */
  public RouteRef withSerial(String value) {
    setSerial(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class AtWayPoint {

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

    @XmlAttribute(name = "wayPointIdx", required = true)
    protected BigInteger wayPointIdx;

    @XmlAttribute(name = "dateTime", required = true)
    @XmlJavaTypeAdapter(XmlAdapterDATETIME.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar dateTime;

    @XmlAttribute(name = "speed")
    protected BigDecimal speed;

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
    public BigInteger getWayPointIdx() {
      return wayPointIdx;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigInteger} instance
     * @since 3.1.0
     */
    public void setWayPointIdx(BigInteger value) {
      this.wayPointIdx = value;
    }

    public boolean isSetWayPointIdx() {
      return (this.wayPointIdx != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link Calendar} instance
     * @since 3.1.0
     */
    public Calendar getDateTime() {
      return dateTime;
    }

    /**
     * Set
     * <p>
     * @param value a {@link Calendar} instance
     * @since 3.1.0
     */
    public void setDateTime(Calendar value) {
      this.dateTime = value;
    }

    public boolean isSetDateTime() {
      return (this.dateTime != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public BigDecimal getSpeed() {
      return speed;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigDecimal} instance
     * @since 3.1.0
     */
    public void setSpeed(BigDecimal value) {
      this.speed = value;
    }

    public boolean isSetSpeed() {
      return (this.speed != null);
    }

    public RouteRef.AtWayPoint withCls(String value) {
      setCls(value);
      return this;
    }

    public RouteRef.AtWayPoint withWayPointIdx(BigInteger value) {
      setWayPointIdx(value);
      return this;
    }

    public RouteRef.AtWayPoint withDateTime(Calendar value) {
      setDateTime(value);
      return this;
    }

    public RouteRef.AtWayPoint withSpeed(BigDecimal value) {
      setSpeed(value);
      return this;
    }

  }

  /**
   * Get a string representation of this RouteRef instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "RouteRef {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link RouteRef} requires
   * {@link null AtWayPoint}, {@link null dateTime}, {@link null serial}, {@link null wayPointIdx}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetAtWayPoint() && isSetSerial();
  }

}
