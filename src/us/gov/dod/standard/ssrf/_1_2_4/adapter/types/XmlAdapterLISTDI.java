package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTDI data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTDI extends AXmlAdapterString {

  public XmlAdapterLISTDI() {
    super(null, 6, false, "MD5|SHA1|SHA224|SHA256|SHA384|SHA512");
  }
}
