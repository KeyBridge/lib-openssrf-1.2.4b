package us.gov.dod.standard.ssrf._1_2_4.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.toa.AllocApp;

/**
 * Enumerated values for fields using the ListAR type.
 * <p>
 * Used in {@link AllocApp}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlType(name = "ListAR")
@XmlEnum
public enum ListAR {

  NI,
  NIB,
  NPB;

  public String value() {
    return name();
  }

  public static ListAR fromValue(String v) {
    return valueOf(v);
  }

}
