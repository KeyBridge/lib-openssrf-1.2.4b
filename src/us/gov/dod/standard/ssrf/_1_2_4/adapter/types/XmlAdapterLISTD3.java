package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTD3 data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTD3 extends AXmlAdapterString {

  public XmlAdapterLISTD3() {
    super(null, 2, false, "CO|CS|OT|SU");
  }
}
