package us.gov.dod.standard.ssrf._1_2_4.location;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Point contains the coordinates (WGS 84) of point(s) that represent a fixed
 * site. It contains also the terrain elevation, in metres above mean sea level
 * (MSL) of this point. If the antenna installed at this point is located on a
 * structure such as a tower or a building, the site elevation is specified as
 * the ground elevation at the base of the structure.
 * <p>
 * Element of {@link Location}
 * <p>
 * Example:
 * <pre>
 * &lt;Point idx="1"&gt;
 *   &lt;Lon cls="U"&gt;0792823.5W&lt;/Lon&gt;
 *   &lt;Lat cls="U"&gt;394217.12N&lt;/Lat&gt;
 * &lt;/Point&gt;
 * </pre>
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPoint")
public class Point {

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
   * WayPointIdx - Waypoint Index (Required)
   * <p>
   * The sequential index of a Point within the referenced Location. Some points
   * of the Location may be omitted, and are not necessarily visited in the
   * order they are defined in the Location. For example a Location might have
   * 10 Points; however, a Force Element may use a route passing successively by
   * points 3, 1, 10, and 7.
   * <p>
   * Format is UN(6)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "idx")
  protected BigInteger idx;
  /**
   * TerrainElevation - Terrain Elevation (Optional)
   * <p>
   * The elevation of the base of the transmitting antenna structure above Mean
   * Sea Level (MSL).
   * <p>
   * Format is SN(7,2) (m)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "elev")
  protected BigInteger elev;
  /**
   * Lon - Longitude (Required)
   * <p>
   * The geographical longitude (degrees, minutes, seconds, and hemisphere E or
   * W) of the Point or center of the Ellipse. If the seconds are not known, use
   * 00, except in the case of navigation aid systems, geostationary satellites,
   * and microwave facilities where seconds are required. Use leading zeros as
   * appropriate for degrees, minutes, or seconds. Degrees longitude require
   * three digits. Seconds may have a decimal point followed by up to two
   * decimals. enter E or W immediately following the seconds. The format is:
   * dddmmss.hhH (where ".hh" is optional and H = E or W).
   * <p>
   * Format is pattern (S11) (deg)
   * <p>
   * Attribute group Coord (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "lon", required = true)
  protected String lon;
  /**
   * Lat - Latitude (Required)
   * <p>
   * The geographical latitude (degrees, minutes, seconds and hemisphere N or S)
   * of the Point or center of the Ellipse. Same remarks for seconds and leading
   * zeros. enter N or S immediately following the seconds. The format is:
   * ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * Format is pattern (S10) (deg)
   * <p>
   * Attribute group Coord (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "lat", required = true)
  protected String lat;

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
   * Get the sequential index of a Point within the referenced Location. Some
   * points of the Location may be omitted, and are not necessarily visited in
   * the order they are defined in the Location. For example a Location might
   * have 10 Points; however, a Force Element may use a route passing
   * successively by points 3, 1, 10, and 7.
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getIdx() {
    return idx;
  }

  /**
   * Set the sequential index of a Point within the referenced Location. Some
   * points of the Location may be omitted, and are not necessarily visited in
   * the order they are defined in the Location. For example a Location might
   * have 10 Points; however, a Force Element may use a route passing
   * successively by points 3, 1, 10, and 7.
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
   * Get the elevation of the base of the transmitting antenna structure above
   * Mean Sea Level (MSL).
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getElev() {
    return elev;
  }

  /**
   * Set the elevation of the base of the transmitting antenna structure above
   * Mean Sea Level (MSL).
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setElev(BigInteger value) {
    this.elev = value;
  }

  public boolean isSetElev() {
    return (this.elev != null);
  }

  /**
   * Get the geographical longitude (degrees, minutes, seconds, and hemisphere E
   * or W) of the Point or center of the Ellipse. If the seconds are not known,
   * use 00, except in the case of navigation aid systems, geostationary
   * satellites, and microwave facilities where seconds are required. Use
   * leading zeros as appropriate for degrees, minutes, or seconds. Degrees
   * longitude require three digits. Seconds may have a decimal point followed
   * by up to two decimals. enter E or W immediately following the seconds. The
   * format is: dddmmss.hhH (where ".hh" is optional and H = E or W).
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getLon() {
    return lon;
  }

  /**
   * Set the geographical longitude (degrees, minutes, seconds, and hemisphere E
   * or W) of the Point or center of the Ellipse. If the seconds are not known,
   * use 00, except in the case of navigation aid systems, geostationary
   * satellites, and microwave facilities where seconds are required. Use
   * leading zeros as appropriate for degrees, minutes, or seconds. Degrees
   * longitude require three digits. Seconds may have a decimal point followed
   * by up to two decimals. enter E or W immediately following the seconds. The
   * format is: dddmmss.hhH (where ".hh" is optional and H = E or W).
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
   * Get the geographical latitude (degrees, minutes, seconds and hemisphere N
   * or S) of the Point or center of the Ellipse. Same remarks for seconds and
   * leading zeros. enter N or S immediately following the seconds. The format
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getLat() {
    return lat;
  }

  /**
   * Set the geographical latitude (degrees, minutes, seconds and hemisphere N
   * or S) of the Point or center of the Ellipse. Same remarks for seconds and
   * leading zeros. enter N or S immediately following the seconds. The format
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S).
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

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Point object instance
   * @since 3.1.0
   */
  public Point withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set the sequential index of a Point within the referenced Location. Some
   * points of the Location may be omitted, and are not necessarily visited in
   * the order they are defined in the Location. For example a Location might
   * have 10 Points; however, a Force Element may use a route passing
   * successively by points 3, 1, 10, and 7.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Point object instance
   * @since 3.1.0
   */
  public Point withIdx(BigInteger value) {
    setIdx(value);
    return this;
  }

  /**
   * Set the elevation of the base of the transmitting antenna structure above
   * Mean Sea Level (MSL).
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Point object instance
   * @since 3.1.0
   */
  public Point withElev(BigInteger value) {
    setElev(value);
    return this;
  }

  /**
   * Set the geographical longitude (degrees, minutes, seconds, and hemisphere E
   * or W) of the Point or center of the Ellipse. If the seconds are not known,
   * use 00, except in the case of navigation aid systems, geostationary
   * satellites, and microwave facilities where seconds are required. Use
   * leading zeros as appropriate for degrees, minutes, or seconds. Degrees
   * longitude require three digits. Seconds may have a decimal point followed
   * by up to two decimals. enter E or W immediately following the seconds. The
   * format is: dddmmss.hhH (where ".hh" is optional and H = E or W).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Point object instance
   * @since 3.1.0
   */
  public Point withLon(String value) {
    setLon(value);
    return this;
  }

  /**
   * Set the geographical latitude (degrees, minutes, seconds and hemisphere N
   * or S) of the Point or center of the Ellipse. Same remarks for seconds and
   * leading zeros. enter N or S immediately following the seconds. The format
   * is: ddmmss.hhH (where ".hh" is optional and H = N or S).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Point object instance
   * @since 3.1.0
   */
  public Point withLat(String value) {
    setLat(value);
    return this;
  }

  /**
   * Get a string representation of this Point instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Point {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Point} requires {@link null lat}, {@link null lon}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetLat() && isSetLon();
  }

}
