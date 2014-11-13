package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTFD data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTFD extends AXmlAdapterString {

  public XmlAdapterLISTFD() {
    super(null, 2, false, "CL|CO|CR|PL|PO|PR");
  }
}
