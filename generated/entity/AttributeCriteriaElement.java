package entity;

/**
 * AttributeCriteriaElement
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AttributeCriteriaElement.eti;AttributeCriteriaElement.eix;AttributeCriteriaElement.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "AttributeCriteriaElement")
public class AttributeCriteriaElement extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.AttributeCriteriaElement> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.AttributeCriteriaElement>("entity.AttributeCriteriaElement");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ATTRIBUTE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Attribute");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ATTRIBUTEBASEDASSIGNMENTCRITERIA_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AttributeBasedAssignmentCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ATTRIBUTEFIELD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AttributeField");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ATTRIBUTETYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "AttributeType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ATTRIBUTEVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AttributeValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPERATOR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Operator");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "State");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> USERFIELD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UserField");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Value");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.AttributeCriteriaElementInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public AttributeCriteriaElement()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public AttributeCriteriaElement(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected AttributeCriteriaElement(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.AttributeCriteriaElementInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.AttributeCriteriaElementInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * 
   * @return A copy of the current bean and a deep copy of all owned array elements
   */
  public entity.KeyableBean copy() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).copy();
  }
  
  /**
   * Gets the value of the Attribute field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Attribute getAttribute() {
    return (entity.Attribute)__getInternalInterface().getFieldValue(ATTRIBUTE_PROP.get());
  }
  
  /**
   * Gets the value of the AttributeBasedAssignmentCriteria field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AttributeBasedAssignmentCriteria getAttributeBasedAssignmentCriteria() {
    return (entity.AttributeBasedAssignmentCriteria)__getInternalInterface().getFieldValue(ATTRIBUTEBASEDASSIGNMENTCRITERIA_PROP.get());
  }
  
  /**
   * Gets the value of the AttributeField field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAttributeField() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ATTRIBUTEFIELD_PROP.get());
  }
  
  /**
   * Gets the value of the AttributeType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.UserAttributeType getAttributeType() {
    return (typekey.UserAttributeType)__getInternalInterface().getFieldValue(ATTRIBUTETYPE_PROP.get());
  }
  
  /**
   * Gets the value of the AttributeValue field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAttributeValue() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ATTRIBUTEVALUE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the Operator field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOperator() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(OPERATOR_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the State field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getState() {
    return (typekey.State)__getInternalInterface().getFieldValue(STATE_PROP.get());
  }
  
  /**
   * Gets the value of the UserField field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUserField() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(USERFIELD_PROP.get());
  }
  
  /**
   * Gets the value of the Value field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getValue() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(VALUE_PROP.get());
  }
  
  /**
   * 
   * @return true if this bean is to be inserted into the database when the bundle is committed.
   */
  public boolean isNew() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
  }
  
  /**
   * 
   * @return True if the object was created by importation from an external system,
   *         False if it was created internally. Note that this refers to the currently
   *         instantiated object, not the data it represents
   */
  public boolean isNewlyImported() {
    return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
  }
  
  /**
   * Refreshes this bean with the latest database version.
   * <p/>
   * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
   * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
   * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
   * updated.
   */
  public entity.KeyableBean refresh() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
  }
  
  /**
   * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
   * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
   * <p>
   * WARNING: This method is designed for simple custom entities which are normally not
   * associated with other entities. Undesirable results may occur when used on out-of-box entities.
   */
  public void remove() {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
  }
  
  /**
   * Sets the value of the Attribute field.
   */
  public void setAttribute(entity.Attribute value) {
    __getInternalInterface().setFieldValue(ATTRIBUTE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AttributeBasedAssignmentCriteria field.
   */
  public void setAttributeBasedAssignmentCriteria(entity.AttributeBasedAssignmentCriteria value) {
    __getInternalInterface().setFieldValue(ATTRIBUTEBASEDASSIGNMENTCRITERIA_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AttributeField field.
   */
  public void setAttributeField(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ATTRIBUTEFIELD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AttributeType field.
   */
  public void setAttributeType(typekey.UserAttributeType value) {
    __getInternalInterface().setFieldValue(ATTRIBUTETYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AttributeValue field.
   */
  public void setAttributeValue(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ATTRIBUTEVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Set a flag denoting that the currently instantiated object has been newly imported from
   * an external source
   * @param newlyImported 
   */
  public void setNewlyImported(boolean newlyImported) {
    ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
  }
  
  /**
   * Sets the value of the Operator field.
   */
  public void setOperator(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(OPERATOR_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.State value) {
    __getInternalInterface().setFieldValue(STATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UserField field.
   */
  public void setUserField(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(USERFIELD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Value field.
   */
  public void setValue(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(VALUE_PROP.get(), value);
  }
  
  /**
   * Set's the version of the bean to the next value (i.e. the bean version original value+1)
   * Multiple calls to this method on the same bean will result in the same value being used
   * for the version (i.e. it is idempotent).
   * 
   * Calling this method will force the bean to be written to the database and participate fully
   * in the commit cycle e.g. pre-update rules will be run, etc.
   */
  public void touch() {
    ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.AttributeCriteriaElementInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.AttributeCriteriaElement.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public java.lang.Integer calculateNextVersion() {
      return ((com.guidewire.pl.domain.persistence.core.impl.VersionableInternal)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal")).calculateNextVersion();
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    /**
     * 
     * @return A copy of the current bean and a deep copy of all owned array elements
     */
    public entity.KeyableBean copy() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).copy();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateInsertEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateInsertEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateRemoveEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateRemoveEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateUpdateEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateUpdateEventsInternal();
    }
    
    /**
     * Gets the value of the Attribute field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Attribute getAttribute() {
      return (entity.Attribute)__getInternalInterface().getFieldValue(ATTRIBUTE_PROP.get());
    }
    
    /**
     * Gets the value of the AttributeBasedAssignmentCriteria field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AttributeBasedAssignmentCriteria getAttributeBasedAssignmentCriteria() {
      return (entity.AttributeBasedAssignmentCriteria)__getInternalInterface().getFieldValue(ATTRIBUTEBASEDASSIGNMENTCRITERIA_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAttributeBasedAssignmentCriteriaID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ATTRIBUTEBASEDASSIGNMENTCRITERIA_PROP.get());
    }
    
    /**
     * Gets the value of the AttributeField field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAttributeField() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ATTRIBUTEFIELD_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAttributeID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ATTRIBUTE_PROP.get());
    }
    
    /**
     * Gets the value of the AttributeType field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.UserAttributeType getAttributeType() {
      return (typekey.UserAttributeType)__getInternalInterface().getFieldValue(ATTRIBUTETYPE_PROP.get());
    }
    
    /**
     * Gets the value of the AttributeValue field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAttributeValue() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ATTRIBUTEVALUE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    /**
     * Gets the value of the Operator field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getOperator() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(OPERATOR_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    public com.guidewire.commons.util.Relop getRelopOperator() {
      return ((com.guidewire.pl.domain.assignment.impl.AttributeCriteriaElementInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.assignment.impl.AttributeCriteriaElementInternalMethods")).getRelopOperator();
    }
    
    /**
     * Gets the value of the State field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.State getState() {
      return (typekey.State)__getInternalInterface().getFieldValue(STATE_PROP.get());
    }
    
    /**
     * Gets the value of the UserField field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getUserField() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(USERFIELD_PROP.get());
    }
    
    /**
     * Gets the value of the Value field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getValue() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(VALUE_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * 
     * @return true if this bean is to be inserted into the database when the bundle is committed.
     */
    public boolean isNew() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
    }
    
    /**
     * 
     * @return True if the object was created by importation from an external system,
     *         False if it was created internally. Note that this refers to the currently
     *         instantiated object, not the data it represents
     */
    public boolean isNewlyImported() {
      return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    public void putInBundle() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).putInBundle();
    }
    
    /**
     * Refreshes this bean with the latest database version.
     * <p/>
     * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
     * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
     * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
     * updated.
     */
    public entity.KeyableBean refresh() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
    }
    
    public entity.KeyableBean reload(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).reload(bundle);
    }
    
    /**
     * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
     * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
     * <p>
     * WARNING: This method is designed for simple custom entities which are normally not
     * associated with other entities. Undesirable results may occur when used on out-of-box entities.
     */
    public void remove() {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the Attribute field.
     */
    public void setAttribute(entity.Attribute value) {
      __getInternalInterface().setFieldValue(ATTRIBUTE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AttributeBasedAssignmentCriteria field.
     */
    public void setAttributeBasedAssignmentCriteria(entity.AttributeBasedAssignmentCriteria value) {
      __getInternalInterface().setFieldValue(ATTRIBUTEBASEDASSIGNMENTCRITERIA_PROP.get(), value);
    }
    
    public void setAttributeBasedAssignmentCriteriaID(gw.pl.persistence.core.Key value) {
      setFieldValue(ATTRIBUTEBASEDASSIGNMENTCRITERIA_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AttributeField field.
     */
    public void setAttributeField(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ATTRIBUTEFIELD_PROP.get(), value);
    }
    
    public void setAttributeID(gw.pl.persistence.core.Key value) {
      setFieldValue(ATTRIBUTE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AttributeType field.
     */
    public void setAttributeType(typekey.UserAttributeType value) {
      __getInternalInterface().setFieldValue(ATTRIBUTETYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AttributeValue field.
     */
    public void setAttributeValue(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ATTRIBUTEVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    /**
     * Sets the value of the Operator field.
     */
    public void setOperator(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(OPERATOR_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the State field.
     */
    public void setState(typekey.State value) {
      __getInternalInterface().setFieldValue(STATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UserField field.
     */
    public void setUserField(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(USERFIELD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Value field.
     */
    public void setValue(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(VALUE_PROP.get(), value);
    }
    
    /**
     * Set's the version of the bean to the next value (i.e. the bean version original value+1)
     * Multiple calls to this method on the same bean will result in the same value being used
     * for the version (i.e. it is idempotent).
     * 
     * Calling this method will force the bean to be written to the database and participate fully
     * in the commit cycle e.g. pre-update rules will be run, etc.
     */
    public void touch() {
      ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.assignment.impl.AttributeCriteriaElementInternalMethods", "com.guidewire.pl.domain.assignment.impl.AttributeCriteriaElementImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.AttributeCriteriaElement.class, config);
    com.guidewire._generated.entity.AttributeCriteriaElementInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.AttributeCriteriaElement, com.guidewire._generated.entity.AttributeCriteriaElementInternal>() {
      public java.lang.Object getImplementation(entity.AttributeCriteriaElement bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.AttributeCriteriaElementInternal getInternalInterface(entity.AttributeCriteriaElement bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.AttributeCriteriaElement newEmptyInstance() {
        return new entity.AttributeCriteriaElement((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}