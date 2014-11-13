package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF NETNUMBER data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterNETNUMBER extends AXmlAdapterString {

  public XmlAdapterNETNUMBER() {
    super(null, null, false, "[AB][0-9]{3}(00|25|50|75)");
  }
}
