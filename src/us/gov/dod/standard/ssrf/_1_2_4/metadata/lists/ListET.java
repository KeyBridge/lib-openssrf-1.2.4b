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
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.ForceElement;

/**
 * Enumerated values for fields using the ListET type.
 * <p>
 * Used in {@link ForceElement}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlType(name = "ListET")
@XmlEnum
public enum ListET {

  AA,
  AH,
  AV,
  F,
  LA,
  LN,
  LT,
  MA,
  ML,
  MW,
  UV,
  VA,
  VH,
  VP,
  WAA,
  WAB,
  WAC,
  WAD,
  WAE,
  WCA,
  WCB,
  WCC,
  WCD,
  WCE,
  WCF,
  WCG,
  WMA,
  WMB,
  WSA,
  WSB,
  WSC,
  WSD,
  WSE,
  WSF,
  WSG,
  WTA,
  WTB,
  WTC,
  WTD,
  WDE,
  WTF,
  WTG,
  WTH,
  WTI,
  WTJ,
  WTK,
  WTL,
  WTM,
  WTN,
  WTO,
  WTP,
  WTQ,
  WTR,
  WUA,
  WUB,
  WUC,
  WXA,
  WXB,
  WXC,
  WXD,
  WZA;

  public String value() {
    return name();
  }

  public static ListET fromValue(String v) {
    return valueOf(v);
  }

}
