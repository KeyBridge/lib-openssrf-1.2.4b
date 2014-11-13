package us.gov.dod.standard.ssrf._1_2_4.adapter.types;

import us.gov.dod.standard.ssrf._1_2_4.adapter.*;

/**
 * XML data type adapter for the SSRF LISTPD data type.
 * <p>
 * @author Jesse Caulfield
 * @version 1.2.4, 11/12/2014
 */
public class XmlAdapterLISTPD extends AXmlAdapterString {

  public XmlAdapterLISTPD() {
    super(null, 10, false, "AIR|BREAK|CEASE|CHALLENGE|COMMENCE|LIFT|NO|OBJ|REPLY|REQUEST");
  }
}
