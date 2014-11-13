package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF C10 data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterC10 extends AXmlAdapterString {

  public XmlAdapterC10() {
    super(null, 10, false, "\\P{Ll}{1,10}");
  }
}
