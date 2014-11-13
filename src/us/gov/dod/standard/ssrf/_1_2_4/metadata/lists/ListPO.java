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
import us.gov.dod.standard.ssrf._1_2_4.antenna.Pol;
import us.gov.dod.standard.ssrf._1_2_4.refdata.AntSpec;

/**
 * Enumerated values for fields using the ListPO type.
 * <p>
 * Used in {@link AntSpec}, {@link Pol}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlType(name = "ListPO")
@XmlEnum
public enum ListPO {

  @XmlEnumValue("45")
  FOUR_5("45"),
  @XmlEnumValue("CL")
  CL("CL"),
  @XmlEnumValue("CR")
  CR("CR"),
  @XmlEnumValue("D")
  D("D"),
  @XmlEnumValue("E")
  E("E"),
  @XmlEnumValue("EL")
  EL("EL"),
  @XmlEnumValue("ER")
  ER("ER"),
  @XmlEnumValue("H")
  H("H"),
  @XmlEnumValue("HV")
  HV("HV"),
  @XmlEnumValue("L")
  L("L"),
  @XmlEnumValue("M")
  M("M"),
  @XmlEnumValue("O")
  O("O"),
  @XmlEnumValue("R")
  R("R"),
  @XmlEnumValue("SL")
  SL("SL"),
  @XmlEnumValue("SR")
  SR("SR"),
  @XmlEnumValue("TC")
  TC("TC"),
  @XmlEnumValue("V")
  V("V"),
  @XmlEnumValue("X")
  X("X");

  private final String value;

  ListPO(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListPO fromValue(String v) {
    for (ListPO c : ListPO.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
