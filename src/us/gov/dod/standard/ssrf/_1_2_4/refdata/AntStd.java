/* 
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._1_2_4.refdata;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * AntStd
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 1.2.4b, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAntStd", propOrder = {
  "antSpec"
})
public class AntStd extends Std<AntStd> {

  @XmlElement(name = "AntSpec", required = true)
  protected List<AntSpec> antSpec;

  /**
   * Get
   * <p>
   * @return a {@link AntSpec} instance
   * @since 3.1.0
   */
  public List<AntSpec> getAntSpec() {
    if (antSpec == null) {
      antSpec = new ArrayList<>();
    }
    return this.antSpec;
  }

  public boolean isSetAntSpec() {
    return ((this.antSpec != null) && (!this.antSpec.isEmpty()));
  }

  /**
   * Clear the AntSpec field. This sets the field to null.
   */
  public void unsetAntSpec() {
    this.antSpec = null;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link AntSpec...}
   * @return The current AntStd object instance
   * @since 3.1.0
   */
  public AntStd withAntSpec(AntSpec... values) {
    if (values != null) {
      getAntSpec().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link AntSpec} instances
   * @return The current AntStd object instance
   * @since 3.1.0
   */
  public AntStd withAntSpec(Collection<AntSpec> values) {
    if (values != null) {
      getAntSpec().addAll(values);
    }
    return this;
  }

  /**
   * Get a string representation of this AntStd instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "AntStd {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link AntStd} requires {@link null AntSpec}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return isSetAntSpec();
  }

}
