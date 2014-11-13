package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF TCLSREASON data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterTCLSREASON extends AXmlAdapterString {

  public XmlAdapterTCLSREASON() {
    super(null, null, false, "1.4[A-H]{1,8}");
  }
}
