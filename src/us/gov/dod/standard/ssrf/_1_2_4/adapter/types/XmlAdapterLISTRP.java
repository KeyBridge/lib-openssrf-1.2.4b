package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTRP data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTRP extends AXmlAdapterString {

  public XmlAdapterLISTRP() {
    super(null, 4, false, "PEER|SELF|SUB|SUP");
  }
}
