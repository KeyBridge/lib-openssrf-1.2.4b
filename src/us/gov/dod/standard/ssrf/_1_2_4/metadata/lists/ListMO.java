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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
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
