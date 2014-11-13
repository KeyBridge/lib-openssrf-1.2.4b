package us.gov.dod.standard.ssrf._1_2_4.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.ceoi.BSMPlan;
import us.gov.dod.standard.ssrf._1_2_4.shared.ContactOrgRef;

/**
 * Enumerated values for fields using the ListCR type.
 * <p>
 * Used in {@link BSMPlan}, {@link ContactOrgRef}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlType(name = "ListCR")
@XmlEnum
public enum ListCR {

  AU,
  AUTH,
  COORD,
  FM,
  GATEWAY,
  LICENSEE,
  OTHER,
  OWNER,
  PE,
  PM,
  SM,
  STNCTRL,
  STOP,
  SUPPLIER,
  USER;

  public String value() {
    return name();
  }

  public static ListCR fromValue(String v) {
    return valueOf(v);
  }

}
