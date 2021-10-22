package entity;

/**
 * ContactHistory
 * Contact-specific history events
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ContactHistory.eti;ContactHistory.eix;ContactHistory.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ContactHistory")
public class ContactHistory extends entity.History implements entity.Extractable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ContactHistory> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ContactHistory>("entity.ContactHistory");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ABCONTACT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ABContact");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXTERNALUPDATEAPP_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExternalUpdateApp");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXTERNALUPDATEUSER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExternalUpdateUser");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ContactHistory()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ContactHistory(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ContactHistory(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.ContactHistoryInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.ContactHistoryInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.ContactHistoryInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the ABContact field.
   * The related account.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ABContact getABContact() {
    return (entity.ABContact)__getInternalInterface().getFieldValue(ABCONTACT_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getArchivePartition() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
  }
  
  /**
   * Gets the value of the ExternalUpdateApp field.
   * Name of external application remotely updating the associated contact or related entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExternalUpdateApp() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXTERNALUPDATEAPP_PROP.get());
  }
  
  /**
   * Gets the value of the ExternalUpdateUser field.
   * Name of external user remotely updating the associated contact or related entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExternalUpdateUser() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXTERNALUPDATEUSER_PROP.get());
  }
  
  /**
   * Convenience method for populating base fields on ContactHistory.
   * Fields populated: ABContact, CustomType, Description, EventTimestamp, and User (defaulted to current user).
   * @param contact contact of this history
   * @param type CustomType of this history
   * @param description Description of this history
   */
  public void populateBaseFields(entity.ABContact contact, typekey.CustomHistoryType type, java.lang.String description) {
    ((gw.ab.history.entity.ContactHistory)__getDelegateManager().getImplementation("gw.ab.history.entity.ContactHistory")).populateBaseFields(contact, type, description);
  }
  
  /**
   * Convenience method for populating base fields on ContactHistory.
   * Fields populated: ABContact, CustomType, Description, EventTimestamp, and User.
   * @param contact contact of this history
   * @param type CustomType of this history
   * @param description Description of this history
   * @param user User associated with this history
   */
  public void populateBaseFields(entity.ABContact contact, typekey.CustomHistoryType type, java.lang.String description, entity.User user) {
    ((gw.ab.history.entity.ContactHistory)__getDelegateManager().getImplementation("gw.ab.history.entity.ContactHistory")).populateBaseFields(contact, type, description, user);
  }
  
  /**
   * Sets the value of the ABContact field.
   */
  public void setABContact(entity.ABContact value) {
    __getInternalInterface().setFieldValue(ABCONTACT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  private void setArchivePartition(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExternalUpdateApp field.
   */
  public void setExternalUpdateApp(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EXTERNALUPDATEAPP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExternalUpdateUser field.
   */
  public void setExternalUpdateUser(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EXTERNALUPDATEUSER_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ContactHistoryInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ContactHistory.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the TrackedChanges array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToTrackedChanges(entity.TrackedChange element) {
      __getInternalInterface().addArrayElement(TRACKEDCHANGES_PROP.get(), element);
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
    
    public void createTrackedChanges(entity.KeyableBean bean) {
      ((com.guidewire.ab.domain.history.impl.HistoryCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.ab.domain.history.impl.HistoryCoreExtMethods")).createTrackedChanges(bean);
    }
    
    public void createTrackedChanges(entity.KeyableBean bean, java.util.Map<java.lang.String, java.lang.String> fieldsToTrack) {
      ((com.guidewire.ab.domain.history.impl.HistoryCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.ab.domain.history.impl.HistoryCoreExtMethods")).createTrackedChanges(bean, fieldsToTrack);
    }
    
    public void createTrackedChangesNoOriginalValues(java.lang.String fieldName, java.lang.String displayKey, java.lang.String newValue) {
      ((com.guidewire.ab.domain.history.impl.HistoryCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.ab.domain.history.impl.HistoryCoreExtMethods")).createTrackedChangesNoOriginalValues(fieldName, displayKey, newValue);
    }
    
    public void createTrackedChangesNoRestrict(entity.KeyableBean bean, java.util.Map<java.lang.String, java.lang.String> fieldsAndDisplayKeys) {
      ((com.guidewire.ab.domain.history.impl.HistoryCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.ab.domain.history.impl.HistoryCoreExtMethods")).createTrackedChangesNoRestrict(bean, fieldsAndDisplayKeys);
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
     * Gets the value of the ABContact field.
     * The related account.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ABContact getABContact() {
      return (entity.ABContact)__getInternalInterface().getFieldValue(ABCONTACT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getABContactID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ABCONTACT_PROP.get());
    }
    
    /**
     * Gets the value of the ArchivePartition field.
     * Unique number to partition the data so that the multiple workers can work independently
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getArchivePartition() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the CustomType field.
     * Customer-defined history event type. This is used to support rules that execute only once per claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CustomHistoryType getCustomType() {
      return (typekey.CustomHistoryType)__getInternalInterface().getFieldValue(CUSTOMTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the Description field.
     * Description of the history event.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
    }
    
    /**
     * Gets the value of the EventTimestamp field.
     * Timestamp when the event occurred.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getEventTimestamp() {
      return (java.util.Date)__getInternalInterface().getFieldValue(EVENTTIMESTAMP_PROP.get());
    }
    
    /**
     * Gets the value of the ExternalUpdateApp field.
     * Name of external application remotely updating the associated contact or related entity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getExternalUpdateApp() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXTERNALUPDATEAPP_PROP.get());
    }
    
    /**
     * Gets the value of the ExternalUpdateUser field.
     * Name of external user remotely updating the associated contact or related entity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getExternalUpdateUser() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXTERNALUPDATEUSER_PROP.get());
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
     * Gets the value of the LoadCommandID field.
     * LoadCommand for load where row was created. If not null this object was loaded via the loader.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLoadCommandID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RuleUID field.
     * The unique id of the rule that caused this history event to be created. Optional.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getRuleUID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RULEUID_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.History getSubtype() {
      return (typekey.History)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the TrackedChanges field.
     * Tracked changes.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TrackedChange[] getTrackedChanges() {
      return (entity.TrackedChange[])__getInternalInterface().getFieldValue(TRACKEDCHANGES_PROP.get());
    }
    
    /**
     * Gets the value of the Type field.
     * Type of claim or exposure event.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.HistoryType getType() {
      return (typekey.HistoryType)__getInternalInterface().getFieldValue(TYPE_PROP.get());
    }
    
    /**
     * Gets the value of the User field.
     * User who created this history event. Optional.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getUser() {
      return (entity.User)__getInternalInterface().getFieldValue(USER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(USER_PROP.get());
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
    
    /**
     * Convenience method for populating base fields on ContactHistory.
     * Fields populated: ABContact, CustomType, Description, EventTimestamp, and User (defaulted to current user).
     * @param contact contact of this history
     * @param type CustomType of this history
     * @param description Description of this history
     */
    public void populateBaseFields(entity.ABContact contact, typekey.CustomHistoryType type, java.lang.String description) {
      ((gw.ab.history.entity.ContactHistory)__getDelegateManager().getImplementation("gw.ab.history.entity.ContactHistory")).populateBaseFields(contact, type, description);
    }
    
    /**
     * Convenience method for populating base fields on ContactHistory.
     * Fields populated: ABContact, CustomType, Description, EventTimestamp, and User.
     * @param contact contact of this history
     * @param type CustomType of this history
     * @param description Description of this history
     * @param user User associated with this history
     */
    public void populateBaseFields(entity.ABContact contact, typekey.CustomHistoryType type, java.lang.String description, entity.User user) {
      ((gw.ab.history.entity.ContactHistory)__getDelegateManager().getImplementation("gw.ab.history.entity.ContactHistory")).populateBaseFields(contact, type, description, user);
    }
    
    public void populateBaseFields(typekey.CustomHistoryType type, java.lang.String description) {
      ((com.guidewire.ab.domain.history.impl.HistoryCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.ab.domain.history.impl.HistoryCoreExtMethods")).populateBaseFields(type, description);
    }
    
    public void populateBaseFields(typekey.CustomHistoryType type, java.lang.String description, entity.User user) {
      ((com.guidewire.ab.domain.history.impl.HistoryCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.ab.domain.history.impl.HistoryCoreExtMethods")).populateBaseFields(type, description, user);
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
    
    /**
     * Removes the given element from the TrackedChanges array. This is achieved by marking the element for removal.
     */
    public void removeFromTrackedChanges(entity.TrackedChange element) {
      __getInternalInterface().removeArrayElement(TRACKEDCHANGES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the TrackedChanges array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromTrackedChanges(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(TRACKEDCHANGES_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the ABContact field.
     */
    public void setABContact(entity.ABContact value) {
      __getInternalInterface().setFieldValue(ABCONTACT_PROP.get(), value);
    }
    
    public void setABContactID(gw.pl.persistence.core.Key value) {
      setFieldValue(ABCONTACT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArchivePartition field.
     */
    public void setArchivePartition(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CustomType field.
     */
    public void setCustomType(typekey.CustomHistoryType value) {
      __getInternalInterface().setFieldValue(CUSTOMTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Description field.
     */
    public void setDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EventTimestamp field.
     */
    public void setEventTimestamp(java.util.Date value) {
      __getInternalInterface().setFieldValue(EVENTTIMESTAMP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExternalUpdateApp field.
     */
    public void setExternalUpdateApp(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EXTERNALUPDATEAPP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExternalUpdateUser field.
     */
    public void setExternalUpdateUser(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EXTERNALUPDATEUSER_PROP.get(), value);
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
     * Sets the value of the LoadCommandID field.
     */
    public void setLoadCommandID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
    }
    
    /**
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RuleUID field.
     */
    public void setRuleUID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RULEUID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.History value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TrackedChanges field.
     */
    public void setTrackedChanges(entity.TrackedChange[] value) {
      __getInternalInterface().setFieldValue(TRACKEDCHANGES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Type field.
     */
    public void setType(typekey.HistoryType value) {
      __getInternalInterface().setFieldValue(TYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the User field.
     */
    public void setUser(entity.User value) {
      __getInternalInterface().setFieldValue(USER_PROP.get(), value);
    }
    
    public void setUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(USER_PROP.get(), value);
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
    config.put("com.guidewire.ab.domain.history.impl.HistoryCoreExtMethods", "com.guidewire.ab.domain.history.impl.HistoryCoreExtMethodsImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.ab.history.entity.ContactHistory", "com.guidewire.ab.domain.history.impl.ContactHistoryImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ContactHistory.class, config);
    com.guidewire._generated.entity.ContactHistoryInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ContactHistory, com.guidewire._generated.entity.ContactHistoryInternal>() {
      public java.lang.Object getImplementation(entity.ContactHistory bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ContactHistoryInternal getInternalInterface(entity.ContactHistory bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ContactHistory newEmptyInstance() {
        return new entity.ContactHistory((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}