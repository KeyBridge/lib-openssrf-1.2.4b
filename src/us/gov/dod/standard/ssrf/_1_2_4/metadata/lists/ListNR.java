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
package us.gov.dod.standard.ssrf._1_2_4.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.allotment.AsgnType;

/**
 * Enumerated values for fields using the ListNR type.
 * <p>
 * Used in {@link AsgnType}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlType(name = "ListNR")
@XmlEnum
public enum ListNR {

  @XmlEnumValue("HQFMT1")
  HQFMT_1("HQFMT1"),
  @XmlEnumValue("HQFMT2")
  HQFMT_2("HQFMT2"),
  @XmlEnumValue("HQFMT3")
  HQFMT_3("HQFMT3"),
  @XmlEnumValue("HQFMT4")
  HQFMT_4("HQFMT4"),
  HQOP("HQOP"),
  PMRVHF("PMRVHF"),
  PMRUHF("PMRUHF"),
  SATST("SATST"),
  SATTRS("SATTRS"),
  SATTRF("SATTRF"),
  SATOPS("SATOPS"),
  SATOPF("SATOPF"),
  VHFAMS("VHFAMS"),
  UHFAMS("UHFAMS"),
  UHFNB("UHFNB"),
  UHFOLD("UHFOLD");
  private final String value;

  ListNR(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListNR fromValue(String v) {
    for (ListNR c : ListNR.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
