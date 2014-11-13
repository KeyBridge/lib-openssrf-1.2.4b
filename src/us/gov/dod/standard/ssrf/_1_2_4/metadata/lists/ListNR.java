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
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
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
