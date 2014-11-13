package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTCO data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTCO extends AXmlAdapterString {

  public XmlAdapterLISTCO() {
    super(null, 3, false, "G|NH|SH|WH|EH|NWQ|SWQ|NEQ|SEQ");
  }
}
