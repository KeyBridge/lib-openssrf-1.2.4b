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
package us.gov.dod.standard.ssrf._1_2_4.link;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.shared.LocationRef;

/**
 * Station (US) defines one or more transmitters or receivers or a combination
 * of transmitters and receivers, including the accessory
 * <p>
 * Element of {@link Station}
 * <p>
 * Example:
 * <pre>
 * &lt;StationLoc&gt;
 *   &lt;LocationExcluded  cls="U"&gt;Yes&lt;/LocationExcluded &gt;
 *   &lt;LocationRadius  cls="U"&gt;458&lt;/LocationRadius &gt;
 *   &lt;LocSatRef cls="U"&gt;GBR::SA:123&lt;/LocSatRef&gt;
 *   &lt;ServiceVolumeHeight  cls="U"&gt;5000&lt;/ServiceVolumeHeight &gt;
 *   &lt;ServiceVolumeLocRef  cls="U"&gt;GBR::SA:123&lt;/ServiceVolumeLocRef &gt;
 *   &lt;ServiceVolumeRadius  cls="U"&gt;252.65&lt;/ServiceVolumeRadius &gt;
 * &lt;/StationLoc&gt;
 * </pre>
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TStationLoc", propOrder = {
  "srvVolume"
})
public class StationLoc
  extends LocationRef {

  @XmlElement(name = "SrvVolume")
  protected SrvVolume srvVolume;

  /**
   * Get
   * <p>
   * @return a {@link SrvVolume} instance
   * @since 3.1.0
   */
  public SrvVolume getSrvVolume() {
    return srvVolume;
  }

  /**
   * Set
   * <p>
   * @param value a {@link SrvVolume} instance
   * @since 3.1.0
   */
  public void setSrvVolume(SrvVolume value) {
    this.srvVolume = value;
  }

  public boolean isSetSrvVolume() {
    return (this.srvVolume != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link SrvVolume}
   * @return The current StationLoc object instance
   * @since 3.1.0
   */
  public StationLoc withSrvVolume(SrvVolume value) {
    setSrvVolume(value);
    return this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current StationLoc object instance
   * @since 3.1.0
   */
  @Override
  public StationLoc withCls(String value) {
    setCls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current StationLoc object instance
   * @since 3.1.0
   */
  @Override
  public StationLoc withSerial(String value) {
    setSerial(value);
    return this;
  }

  /**
   * Set the radius associated with the Location to produce a circle. Radius
   * information only applies to points, and should be ignored in the case of
   * polygons and ellipses.
   * <p>
   * @param value An instances of type {@link BigInteger}
   * @return The current StationLoc object instance
   * @since 3.1.0
   */
  @Override
  public StationLoc withRadius(BigInteger value) {
    setRadius(value);
    return this;
  }

  /**
   * Set "Yes" to indicate that the LocSatRef is to be excluded from the
   * location set for the current station. If omitted, "No" is assumed, meaning
   * that the location is included.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current StationLoc object instance
   * @since 3.1.0
   */
  @Override
  public StationLoc withCat(String value) {
    setCat(value);
    return this;
  }

  /**
   * Get a string representation of this StationLoc instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "StationLoc {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link StationLoc} has no configuration requirements.
   * <p>
   * @return TRUE
   */
  @Override
  public boolean isSet() {
    return true;
  }

}
