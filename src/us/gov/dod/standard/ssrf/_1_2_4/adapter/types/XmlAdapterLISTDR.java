package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTDR data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTDR extends AXmlAdapterString {

  public XmlAdapterLISTDR() {
    super(null, 6, false, "ACCEPT|AOI|CRDCMT|INVMSG|MISREF|QUERY|RECALL|REJECT|UNSUP");
  }
}
