package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF C2 data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterC2 extends AXmlAdapterString {

  public XmlAdapterC2() {
    super(null, 2, false, "\\P{Ll}{1,2}");
  }
}
