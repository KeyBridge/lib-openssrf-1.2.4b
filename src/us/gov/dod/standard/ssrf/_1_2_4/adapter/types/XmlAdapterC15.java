package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF C15 data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterC15 extends AXmlAdapterString {

  public XmlAdapterC15() {
    super(null, 15, false, "\\P{Ll}{1,15}");
  }
}
