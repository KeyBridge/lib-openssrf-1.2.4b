/* 
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._1_2_4;

import java.awt.Polygon;
import java.math.BigInteger;
import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.location.AGAProtection;
import us.gov.dod.standard.ssrf._1_2_4.location.Point;
import us.gov.dod.standard.ssrf._1_2_4.shared.*;

/**
 * Location is used to describe a geographical location, polygonal or ellipse
 * area, or a set of those.
 * <p>
 * Sub-Elements are
 * {@link Ellipse}, {@link LocationRef}, {@link POCInformation}, {@link Point}, {@link Polygon}
 * <p>
 * Example: A simple fixed location:
 * <pre>
 * &lt;Location cls="U"&gt;
 *   &lt;Serial cls="U"&gt;BEL::LO:111&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Name cls="U"&gt;Brussels National Airpt&lt;/Name&gt;
 *   &lt;Country cls="U"&gt;BEL&lt;/Country&gt;
 *   &lt;Point idx="1"&gt;
 *     &lt;Lon cls="U"&gt;0050000E&lt;/Lon&gt;
 *     &lt;Lat cls="U"&gt;503600N&lt;/Lat&gt;
 *     &lt;TerrainElevation cls="U"&gt;50&lt;/TerrainElevation&gt;
 *   &lt;/Point&gt;
 * &lt;/Location&gt;
 * A triangle* &lt;Location cls="U"&gt;
 *   &lt;Serial cls="U"&gt;BEL::LO:222&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Name cls="U"&gt;Melsbroek Approach&lt;/Name&gt;
 *   &lt;Country cls="U"&gt;BEL&lt;/Country&gt;
 *   &lt;Polygon idx="1"&gt;
 *     &lt;PolygonPoint sequence="1"&gt;
 *       &lt;Lon cls="U"&gt;0050000E&lt;/Lon&gt;
 *       &lt;Lat cls="U"&gt;503600N&lt;/Lat&gt;
 *     &lt;/PolygonPoint&gt;
 *     &lt;PolygonPoint sequence="2"&gt;
 *       &lt;Lon cls="U"&gt;0053000E&lt;/Lon&gt;
 *       &lt;Lat cls="U"&gt;503600N&lt;/Lat&gt;
 *     &lt;/PolygonPoint&gt;
 *     &lt;PolygonPoint sequence="3"&gt;
 *       &lt;Lon cls="U"&gt;0053000E&lt;/Lon&gt;
 *       &lt;Lat cls="U"&gt;504000N&lt;/Lat&gt;
 *     &lt;/PolygonPoint&gt;
 *   &lt;/Polygon&gt;
 * &lt;/Location&gt;
 * A composite area with a hole (doughnut):* &lt;Location cls="U"&gt;
 *   &lt;Serial cls="U"&gt;BEL::LO:333&lt;/Serial&gt;
 *   &lt;EntryDateTime cls="U"&gt;2011-12-25T00:00:00Z&lt;/EntryDateTime&gt;
 *   &lt;Name cls="U"&gt;BEL AF Training North&lt;/Name&gt;
 *   &lt;Country cls="U"&gt;BEL&lt;/Country&gt;
 *   &lt;Ellipse idx="1"&gt;
 *     &lt;Excluded cls="U"&gt;Yes&lt;/Excluded&gt;
 *     &lt;Lon cls="U"&gt;0050000E&lt;/Lon&gt;
 *     &lt;Lat cls="U"&gt;503600N&lt;/Lat&gt;
 *     &lt;SemiMajorAxis cls="U"&gt;10&lt;/SemiMajorAxis&gt;
 *     &lt;SemiMinorAxis cls="U"&gt;10&lt;/SemiMinorAxis&gt;
 *     &lt;Azimuth cls="U"&gt;0&lt;/Azimuth&gt;
 *   &lt;/Ellipse&gt;
 *   &lt;LocationRef cls="U"&gt;BEL::LO:222&lt;/LocationRef&gt;
 * &lt;/Location&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLocation", propOrder = {
  "address",
  "point",
  "boundingCircle",
  "agaProtection"
})
public class Location extends Common<Location> {

  @XmlElement(name = "Address", required = true)
  protected Address address;
  /**
   * AntFeedpointHeight - Antenna Feedpoint Height (Optional)
   * <p>
   * The antenna feed point height above the terrain, in metres. In the case
   * where the antenna is mounted pointing vertically to a reflector on the same
   * structure, enter the height of the reflector above ground. If the Station
   * is a flying object, this data represents the maximum altitude of the object
   * above ground.
   * <p>
   * Format is SN(7,2) (m)
   * <p>
   * @since 3.1.0
   */
  @XmlElement(name = "Point", required = true)
  protected List<Point> point;

  @XmlElement(name = "BoundingCircle")
  protected Location.BoundingCircle boundingCircle;

  @XmlElement(name = "AGAProtection")
  protected List<AGAProtection> agaProtection;
  /**
   * Name - Location Name (Required)
   * <p>
   * The name of the location.
   * <p>
   * Format is S100
   * <p>
   * @since 3.1.0
   */
  @XmlAttribute(name = "name", required = true)
  protected String name;

  @XmlAttribute(name = "ITU")
  protected BigInteger itu;

  /**
   * Get
   * <p>
   * @return a {@link Address} instance
   * @since 3.1.0
   */
  public Address getAddress() {
    return address;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Address} instance
   * @since 3.1.0
   */
  public void setAddress(Address value) {
    this.address = value;
  }

  public boolean isSetAddress() {
    return (this.address != null);
  }

  /**
   * Get the antenna feed point height above the terrain, in metres. In the case
   * where the antenna is mounted pointing vertically to a reflector on the same
   * structure, enter the height of the reflector above ground. If the Station
   * is a flying object, this data represents the maximum altitude of the object
   * above ground.
   * <p>
   * @return a {@link Point} instance
   * @since 3.1.0
   */
  public List<Point> getPoint() {
    if (point == null) {
      point = new ArrayList<>();
    }
    return this.point;
  }

  public boolean isSetPoint() {
    return ((this.point != null) && (!this.point.isEmpty()));
  }

  /**
   * Clear the Point field. This sets the field to null.
   */
  public void unsetPoint() {
    this.point = null;
  }

  public Location.BoundingCircle getBoundingCircle() {
    return boundingCircle;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Location} instance
   * @since 3.1.0
   */
  public void setBoundingCircle(Location.BoundingCircle value) {
    this.boundingCircle = value;
  }

  public boolean isSetBoundingCircle() {
    return (this.boundingCircle != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link AGAProtection} instance
   * @since 3.1.0
   */
  public List<AGAProtection> getAGAProtection() {
    if (agaProtection == null) {
      agaProtection = new ArrayList<>();
    }
    return this.agaProtection;
  }

  public boolean isSetAGAProtection() {
    return ((this.agaProtection != null) && (!this.agaProtection.isEmpty()));
  }

  /**
   * Clear the AGAProtection field. This sets the field to null.
   */
  public void unsetAGAProtection() {
    this.agaProtection = null;
  }

  /**
   * Get the name of the location.
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getName() {
    return name;
  }

  /**
   * Set the name of the location.
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
   * Get
   * <p>
   * @return a {@link BigInteger} instance
   * @since 3.1.0
   */
  public BigInteger getITU() {
    return itu;
  }

  /**
   * Set
   * <p>
   * @param value a {@link BigInteger} instance
   * @since 3.1.0
   */
  public void setITU(BigInteger value) {
    this.itu = value;
  }

  public boolean isSetITU() {
    return (this.itu != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Address}
   * @return The current Location object instance
   * @since 3.1.0
   */
  public Location withAddress(Address value) {
    setAddress(value);
    return this;
  }

  /**
   * Set the antenna feed point height above the terrain, in metres. In the case
   * where the antenna is mounted pointing vertically to a reflector on the same
   * structure, enter the height of the reflector above ground. If the Station
   * is a flying object, this data represents the maximum altitude of the object
   * above ground.
   * <p>
   * @param values One or more instances of type {@link Point...}
   * @return The current Location object instance
   * @since 3.1.0
   */
  public Location withPoint(Point... values) {
    if (values != null) {
      getPoint().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set the antenna feed point height above the terrain, in metres. In the case
   * where the antenna is mounted pointing vertically to a reflector on the same
   * structure, enter the height of the reflector above ground. If the Station
   * is a flying object, this data represents the maximum altitude of the object
   * above ground.
   * <p>
   * @param values A collection of {@link Point} instances
   * @return The current Location object instance
   * @since 3.1.0
   */
  public Location withPoint(Collection<Point> values) {
    if (values != null) {
      getPoint().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Location.BoundingCircle}
   * @return The current Location object instance
   * @since 3.1.0
   */
  public Location withBoundingCircle(Location.BoundingCircle value) {
    setBoundingCircle(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link AGAProtection...}
   * @return The current Location object instance
   * @since 3.1.0
   */
  public Location withAGAProtection(AGAProtection... values) {
    if (values != null) {
      getAGAProtection().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link AGAProtection} instances
   * @return The current Location object instance
   * @since 3.1.0
   */
  public Location withAGAProtection(Collection<AGAProtection> values) {
    if (values != null) {
      getAGAProtection().addAll(values);
    }
    return this;
  }

  /**
   * Set the name of the location.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Location object instance
   * @since 3.1.0
   */
  public Location withName(String value) {
    setName(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current Location object instance
   * @since 3.1.0
   */
  public Location withITU(BigInteger value) {
    setITU(value);
    return this;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "")
  public static class BoundingCircle {

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

    @XmlAttribute(name = "radius")
    protected BigInteger radius;

    @XmlAttribute(name = "avgElev")
    protected BigInteger avgElev;

    @XmlAttribute(name = "minElev")
    protected BigInteger minElev;

    @XmlAttribute(name = "maxElev")
    protected BigInteger maxElev;

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
    public BigInteger getRadius() {
      return radius;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigInteger} instance
     * @since 3.1.0
     */
    public void setRadius(BigInteger value) {
      this.radius = value;
    }

    public boolean isSetRadius() {
      return (this.radius != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link BigInteger} instance
     * @since 3.1.0
     */
    public BigInteger getAvgElev() {
      return avgElev;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigInteger} instance
     * @since 3.1.0
     */
    public void setAvgElev(BigInteger value) {
      this.avgElev = value;
    }

    public boolean isSetAvgElev() {
      return (this.avgElev != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link BigInteger} instance
     * @since 3.1.0
     */
    public BigInteger getMinElev() {
      return minElev;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigInteger} instance
     * @since 3.1.0
     */
    public void setMinElev(BigInteger value) {
      this.minElev = value;
    }

    public boolean isSetMinElev() {
      return (this.minElev != null);
    }

    /**
     * Get
     * <p>
     * @return a {@link BigInteger} instance
     * @since 3.1.0
     */
    public BigInteger getMaxElev() {
      return maxElev;
    }

    /**
     * Set
     * <p>
     * @param value a {@link BigInteger} instance
     * @since 3.1.0
     */
    public void setMaxElev(BigInteger value) {
      this.maxElev = value;
    }

    public boolean isSetMaxElev() {
      return (this.maxElev != null);
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

    public Location.BoundingCircle withCls(String value) {
      setCls(value);
      return this;
    }

    public Location.BoundingCircle withRadius(BigInteger value) {
      setRadius(value);
      return this;
    }

    public Location.BoundingCircle withAvgElev(BigInteger value) {
      setAvgElev(value);
      return this;
    }

    public Location.BoundingCircle withMinElev(BigInteger value) {
      setMinElev(value);
      return this;
    }

    public Location.BoundingCircle withMaxElev(BigInteger value) {
      setMaxElev(value);
      return this;
    }

    public Location.BoundingCircle withLon(String value) {
      setLon(value);
      return this;
    }

    public Location.BoundingCircle withLat(String value) {
      setLat(value);
      return this;
    }

  }

  /**
   * Get a string representation of this Location instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Location {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Location} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and
   * {@link null Address}, {@link null Point}, {@link null lat}, {@link null lon}, {@link null name}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetAddress() && isSetPoint() && isSetName();
  }

}
