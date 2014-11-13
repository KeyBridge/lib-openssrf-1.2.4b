package us.gov.dod.standard.ssrf._1_2_4.common;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * DatasetCls
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 11/12/2014
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDatasetCls", propOrder = {
  "clsOrigin",
  "clsDerived",
  "downgrade",
  "decls"
})
public class DatasetCls {

  @XmlElement(name = "ClsOrigin")
  protected ClsOrigin clsOrigin;

  @XmlElement(name = "ClsDerived")
  protected Set<ClsDerived> clsDerived;

  @XmlElement(name = "Downgrade")
  protected Set<Downgrade> downgrade;

  @XmlElement(name = "Decls")
  protected Decls decls;

  @XmlAttribute(name = "overallCls", required = true)
  protected String overallCls;

  /**
   * Get
   * <p>
   * @return a {@link ClsOrigin} instance
   * @since 3.1.0
   */
  public ClsOrigin getClsOrigin() {
    return clsOrigin;
  }

  /**
   * Set
   * <p>
   * @param value a {@link ClsOrigin} instance
   * @since 3.1.0
   */
  public void setClsOrigin(ClsOrigin value) {
    this.clsOrigin = value;
  }

  public boolean isSetClsOrigin() {
    return (this.clsOrigin != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link ClsDerived} instance
   * @since 3.1.0
   */
  public Set<ClsDerived> getClsDerived() {
    if (clsDerived == null) {
      clsDerived = new HashSet<>();
    }
    return this.clsDerived;
  }

  public boolean isSetClsDerived() {
    return ((this.clsDerived != null) && (!this.clsDerived.isEmpty()));
  }

  /**
   * Clear the ClsDerived field. This sets the field to null.
   */
  public void unsetClsDerived() {
    this.clsDerived = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link Downgrade} instance
   * @since 3.1.0
   */
  public Set<Downgrade> getDowngrade() {
    if (downgrade == null) {
      downgrade = new HashSet<>();
    }
    return this.downgrade;
  }

  public boolean isSetDowngrade() {
    return ((this.downgrade != null) && (!this.downgrade.isEmpty()));
  }

  /**
   * Clear the Downgrade field. This sets the field to null.
   */
  public void unsetDowngrade() {
    this.downgrade = null;
  }

  /**
   * Get
   * <p>
   * @return a {@link Decls} instance
   * @since 3.1.0
   */
  public Decls getDecls() {
    return decls;
  }

  /**
   * Set
   * <p>
   * @param value a {@link Decls} instance
   * @since 3.1.0
   */
  public void setDecls(Decls value) {
    this.decls = value;
  }

  public boolean isSetDecls() {
    return (this.decls != null);
  }

  /**
   * Get
   * <p>
   * @return a {@link String} instance
   * @since 3.1.0
   */
  public String getOverallCls() {
    return overallCls;
  }

  /**
   * Set
   * <p>
   * @param value a {@link String} instance
   * @since 3.1.0
   */
  public void setOverallCls(String value) {
    this.overallCls = value;
  }

  public boolean isSetOverallCls() {
    return (this.overallCls != null);
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link ClsOrigin}
   * @return The current DatasetCls object instance
   * @since 3.1.0
   */
  public DatasetCls withClsOrigin(ClsOrigin value) {
    setClsOrigin(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link ClsDerived...}
   * @return The current DatasetCls object instance
   * @since 3.1.0
   */
  public DatasetCls withClsDerived(ClsDerived... values) {
    if (values != null) {
      getClsDerived().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link ClsDerived} instances
   * @return The current DatasetCls object instance
   * @since 3.1.0
   */
  public DatasetCls withClsDerived(Collection<ClsDerived> values) {
    if (values != null) {
      getClsDerived().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link Downgrade...}
   * @return The current DatasetCls object instance
   * @since 3.1.0
   */
  public DatasetCls withDowngrade(Downgrade... values) {
    if (values != null) {
      getDowngrade().addAll(Arrays.asList(values));
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link Downgrade} instances
   * @return The current DatasetCls object instance
   * @since 3.1.0
   */
  public DatasetCls withDowngrade(Collection<Downgrade> values) {
    if (values != null) {
      getDowngrade().addAll(values);
    }
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link Decls}
   * @return The current DatasetCls object instance
   * @since 3.1.0
   */
  public DatasetCls withDecls(Decls value) {
    setDecls(value);
    return this;
  }

  /**
   * Set
   * <p>
   * @param value An instances of type {@link String}
   * @return The current DatasetCls object instance
   * @since 3.1.0
   */
  public DatasetCls withOverallCls(String value) {
    setOverallCls(value);
    return this;
  }

  /**
   * Get a string representation of this DatasetCls instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "DatasetCls {"
      + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link DatasetCls} requires {@link null overallCls}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetOverallCls();
  }

}
