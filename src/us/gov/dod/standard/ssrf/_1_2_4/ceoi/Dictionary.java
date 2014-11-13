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
package us.gov.dod.standard.ssrf._1_2_4.ceoi;

import java.util.*;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf._1_2_4.Common;
import us.gov.dod.standard.ssrf._1_2_4.ceoi.Dictionary;

/**
 * Dictionary
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDictionary", propOrder = {
  "rest"
})
public class Dictionary extends Common<Dictionary> {

  @XmlElementRefs({
    @XmlElementRef(name = "Entry", namespace = "urn:us:gov:dod:standard:ssrf:1.2.4.b", type = JAXBElement.class, required = false),

    @XmlElementRef(name = "Group", namespace = "urn:us:gov:dod:standard:ssrf:1.2.4.b", type = JAXBElement.class, required = false)
  })
  protected List<JAXBElement<?>> rest;

  @XmlAttribute(name = "type", required = true)
  protected String type;

  @XmlAttribute(name = "name", required = true)
  protected String name;

  public List<JAXBElement<?>> getRest() {
    if (rest == null) {
      rest = new ArrayList<>();
    }
    return this.rest;
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

  public Dictionary withRest(JAXBElement<?>... values) {
    if (values != null) {
      getRest().addAll(Arrays.asList(values));
    }
    return this;
  }

  public Dictionary withRest(Collection<JAXBElement<?>> values) {
    if (values != null) {
      getRest().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Dictionary object instance
   * @since 3.1.0
   */
  public Dictionary withType(String value) {
    setType(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Dictionary object instance
   * @since 3.1.0
   */
  public Dictionary withName(String value) {
    setName(value);
    return this;
  }

  /**
   * Get a string representation of this Dictionary instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Dictionary {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Dictionary} requires
   * {@link ListCCL cls}, {@link TString Serial}, {@link TCalendar EntryDateTime}
   * and {@link null name}, {@link null type}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetName() && isSetType();
  }

}
