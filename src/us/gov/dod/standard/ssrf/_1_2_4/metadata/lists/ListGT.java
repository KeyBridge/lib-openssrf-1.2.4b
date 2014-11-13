package us.gov.dod.standard.ssrf._1_2_4.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.ceoi.Share;

/**
 * Enumerated values for fields using the ListGT type.
 * <p>
 * Used in {@link Share}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlType(name = "ListGT")
@XmlEnum
public enum ListGT {

  CALLSIGN,
  CALLWORD,
  EXTRACT,
  FREQ,
  FREQSEP;

  public String value() {
    return name();
  }

  public static ListGT fromValue(String v) {
    return valueOf(v);
  }

}
