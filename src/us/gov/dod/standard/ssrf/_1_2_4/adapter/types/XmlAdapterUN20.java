package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF UN20 data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterUN20 extends AXmlAdapterString {

  public XmlAdapterUN20() {
    super(null, 20, false, "[0-9]{1,20}");
  }
}
