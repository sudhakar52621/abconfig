package entity;

/**
 * PendingContactCreateView
 * <p>Aggregates the information needed to display one PendingContactChange in the PendingContactChange.</p>
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PendingContactCreateView.eti;PendingContactCreateView.eix;PendingContactCreateView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "PendingContactCreateView")
public class PendingContactCreateView extends entity.PendingContactChangeView {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.PendingContactCreateView> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.PendingContactCreateView>("entity.PendingContactCreateView");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ABCONTACTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ABContactID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ABCONTACTSUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ABContactSubtype");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PENDINGCONTACTCREATE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PendingContactCreate");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public PendingContactCreateView()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public PendingContactCreateView(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected PendingContactCreateView(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.PendingContactCreateViewInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.PendingContactCreateViewInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.PendingContactCreateViewInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the ABContactID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getABContactID() {
    return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(ABCONTACTID_PROP.get());
  }
  
  /**
   * Gets the value of the ABContactSubtype field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ABContact getABContactSubtype() {
    return (typekey.ABContact)__getInternalInterface().getFieldValue(ABCONTACTSUBTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the PendingContactCreate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PendingContactCreate getPendingContactCreate() {
    return (entity.PendingContactCreate)__getInternalInterface().getFieldValue(PENDINGCONTACTCREATE_PROP.get());
  }
  
  /**
   * Sets the value of the ABContactID field.
   */
  public void setABContactID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ABCONTACTID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ABContactSubtype field.
   */
  public void setABContactSubtype(typekey.ABContact value) {
    __getInternalInterface().setFieldValue(ABCONTACTSUBTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PendingContactCreate field.
   */
  public void setPendingContactCreate(entity.PendingContactCreate value) {
    __getInternalInterface().setFieldValue(PENDINGCONTACTCREATE_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.PendingContactCreateViewInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.PendingContactCreateView.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
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
     * Gets the value of the ABContact field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getABContact() {
      return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(ABCONTACT_PROP.get());
    }
    
    /**
     * Gets the value of the ABContactID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getABContactID() {
      return (gw.pl.persistence.core.Key)__getInternalInterface().getFieldValue(ABCONTACTID_PROP.get());
    }
    
    /**
     * Gets the value of the ABContactName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getABContactName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ABCONTACTNAME_PROP.get());
    }
    
    /**
     * Gets the value of the ABContactSubtype field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ABContact getABContactSubtype() {
      return (typekey.ABContact)__getInternalInterface().getFieldValue(ABCONTACTSUBTYPE_PROP.get());
    }
    
    /**
     * 
     * @return Unique identifier of the object.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.commons.entity.Keyable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Keyable")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    /**
     * Gets the value of the PendingContactCreate field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.PendingContactCreate getPendingContactCreate() {
      return (entity.PendingContactCreate)__getInternalInterface().getFieldValue(PENDINGCONTACTCREATE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPendingContactCreateID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PENDINGCONTACTCREATE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RelatedTo field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getRelatedTo() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RELATEDTO_PROP.get());
    }
    
    /**
     * Gets the value of the RequestingUser field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getRequestingUser() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(REQUESTINGUSER_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PendingContactChangeView getSubtype() {
      return (typekey.PendingContactChangeView)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
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
     * Sets the value of the ABContact field.
     */
    public void setABContact(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ABCONTACT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ABContactID field.
     */
    public void setABContactID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ABCONTACTID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ABContactName field.
     */
    public void setABContactName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ABCONTACTNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ABContactSubtype field.
     */
    public void setABContactSubtype(typekey.ABContact value) {
      __getInternalInterface().setFieldValue(ABCONTACTSUBTYPE_PROP.get(), value);
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
     * Sets the value of the PendingContactCreate field.
     */
    public void setPendingContactCreate(entity.PendingContactCreate value) {
      __getInternalInterface().setFieldValue(PENDINGCONTACTCREATE_PROP.get(), value);
    }
    
    public void setPendingContactCreateID(gw.pl.persistence.core.Key value) {
      setFieldValue(PENDINGCONTACTCREATE_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RelatedTo field.
     */
    public void setRelatedTo(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RELATEDTO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RequestingUser field.
     */
    public void setRequestingUser(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(REQUESTINGUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.PendingContactChangeView value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.PendingContactCreateView.class, config);
    com.guidewire._generated.entity.PendingContactCreateViewInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.PendingContactCreateView, com.guidewire._generated.entity.PendingContactCreateViewInternal>() {
      public java.lang.Object getImplementation(entity.PendingContactCreateView bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.PendingContactCreateViewInternal getInternalInterface(entity.PendingContactCreateView bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.PendingContactCreateView newEmptyInstance() {
        return new entity.PendingContactCreateView((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}