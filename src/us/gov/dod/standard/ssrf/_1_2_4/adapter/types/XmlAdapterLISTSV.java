package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTSV data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTSV extends AXmlAdapterString {

  public XmlAdapterLISTSV() {
    super(null, 2, false, "AS|AX|CA|CO|CP|CR|CV|FS|HP|MX|OT|PX|RC|RD|RG|RT|ST");
  }
}
