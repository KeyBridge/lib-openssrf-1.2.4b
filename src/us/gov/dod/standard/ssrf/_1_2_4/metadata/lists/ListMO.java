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
import us.gov.dod.standard.ssrf._1_2_4.txrx.Baseband;
import us.gov.dod.standard.ssrf._1_2_4.txrx.Modulation;

/**
 * Enumerated values for fields using the ListMO type.
 * <p>
 * Used in {@link Baseband}, {@link Modulation}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlType(name = "ListMO")
@XmlEnum
public enum ListMO {

  AMC("AMC"),
  AMS("AMS"),
  ASK("ASK"),
  AUDSK("AUDSK"),
  BPSK("BPSK"),
  CDM("CDM"),
  COFDM("COFDM"),
  DATA("DATA"),
  DOFSK("DOFSK"),
  DPSK("DPSK"),
  @XmlEnumValue("FDM|")
  FDM__("FDM|"),
  FMC("FMC"),
  FMS("FMS"),
  FSK("FSK"),
  GMSK("GMSK"),
  MDAT("MDAT"),
  MPCM("MPCM"),
  MSK("MSK"),
  MUL("MUL"),
  MVOI("MVOI"),
  NOISE("NOISE"),
  OFDM("OFDM"),
  PCM("PCM"),
  PSK("PSK"),
  QAM("QAM"),
  QPRS("QPRS"),
  QPSK("QPSK"),
  SDATA("SDATA"),
  SNGL("SNGL"),
  SNGLV("SNGLV"),
  SSVC("SSVC"),
  TDM("TDM"),
  TFM("TFM"),
  VIDEO("VIDEO"),
  VODA("VODA"),
  OTH("OTH");
  private final String value;

  ListMO(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListMO fromValue(String v) {
    for (ListMO c : ListMO.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
