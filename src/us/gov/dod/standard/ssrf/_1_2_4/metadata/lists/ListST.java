package us.gov.dod.standard.ssrf._1_2_4.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._1_2_4.shared.Status;

/**
 * Enumerated values for fields using the ListST type.
 * <p>
 * Used in {@link Status}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlType(name = "ListST")
@XmlEnum
public enum ListST {

  @XmlEnumValue("ACCEPTED BY")
  ACCEPTED_BY("ACCEPTED BY"),
  @XmlEnumValue("ACTIVATED BY")
  ACTIVATED_BY("ACTIVATED BY"),
  @XmlEnumValue("ADMIN MOD BY")
  ADMIN_MOD_BY("ADMIN MOD BY"),
  @XmlEnumValue("APPROVED BY")
  APPROVED_BY("APPROVED BY"),
  @XmlEnumValue("ASSIGNED BY")
  ASSIGNED_BY("ASSIGNED BY"),
  @XmlEnumValue("AUTHORISED BY")
  AUTHORISED_BY("AUTHORISED BY"),
  COMPLIANCE("COMPLIANCE"),
  COORDINATION("COORDINATION"),
  @XmlEnumValue("DELETED BY")
  DELETED_BY("DELETED BY"),
  @XmlEnumValue("EXPIRED BY")
  EXPIRED_BY("EXPIRED BY"),
  FORWARDED("FORWARDED"),
  @XmlEnumValue("IMPORTED BY")
  IMPORTED_BY("IMPORTED BY"),
  @XmlEnumValue("IN-PROCESS AT")
  IN_PROCESS_AT("IN-PROCESS AT"),
  INFO("INFO"),
  @XmlEnumValue("LATERAL COORDINATION")
  LATERAL_COORDINATION("LATERAL COORDINATION"),
  @XmlEnumValue("MODIFIED BY")
  MODIFIED_BY("MODIFIED BY"),
  @XmlEnumValue("NOTIFIED BY")
  NOTIFIED_BY("NOTIFIED BY"),
  @XmlEnumValue("ORIGINATED BY")
  ORIGINATED_BY("ORIGINATED BY"),
  RECALLED("RECALLED"),
  @XmlEnumValue("RECEIVED BY")
  RECEIVED_BY("RECEIVED BY"),
  @XmlEnumValue("REGISTERED WITH")
  REGISTERED_WITH("REGISTERED WITH"),
  REJECTED("REJECTED"),
  RESOLVED("RESOLVED"),
  @XmlEnumValue("REVIEW REQUIRED")
  REVIEW_REQUIRED("REVIEW REQUIRED"),
  @XmlEnumValue("SUBMITTED TO")
  SUBMITTED_TO("SUBMITTED TO"),
  @XmlEnumValue("TABLED BY")
  TABLED_BY("TABLED BY");
  private final String value;

  ListST(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListST fromValue(String v) {
    for (ListST c : ListST.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
