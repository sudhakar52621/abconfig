package entity;

/**
 * DateCriterionChoice
 * 
 *         A component used as part of a larger search criteria entity. Encapsulates the information
 *         entered by the user to restrict the search to a particular date range. Specifies the date
 *         field to be restricted and allows the date range to be restricted either through a typelist of
 *         preset ranges (such as next 30 days) or through a start and end date.
 *         <p>
 *         Very similar to DateCriteria, but DateCriterionChoice supports configurable search.
 *         (See the Configuration Guide for details of customizing search screens.)
 *       
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DateCriterionChoice.eti;DateCriterionChoice.eix;DateCriterionChoice.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "DateCriterionChoice")
public class DateCriterionChoice extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable, com.guidewire.pl.system.service.search.SearchCriterionChoice {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.DateCriterionChoice> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.DateCriterionChoice>("entity.DateCriterionChoice");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CHOSENOPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ChosenOption");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> DATERANGECHOICE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "DateRangeChoice");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> DATESEARCHTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "DateSearchType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EndDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SEARCHTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SearchType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StartDate");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.DateCriterionChoiceInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public DateCriterionChoice()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public DateCriterionChoice(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected DateCriterionChoice(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.DateCriterionChoiceInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.DateCriterionChoiceInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  public void addToRestriction(com.guidewire.pl.system.database.Restriction restriction, gw.entity.IQueryColumn queryColumn) {
    ((com.guidewire.pl.system.service.search.SearchCriterionChoice)__getDelegateManager().getImplementation("com.guidewire.pl.system.service.search.SearchCriterionChoice")).addToRestriction(restriction, queryColumn);
  }
  
  /**
   * 
   * @return A copy of the current bean and a deep copy of all owned array elements
   */
  public entity.KeyableBean copy() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).copy();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the ChosenOption field.
   * The chosen configurable search option, specifies the date field to be restricted.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getChosenOption() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CHOSENOPTION_PROP.get());
  }
  
  /**
   * Gets the value of the DateRangeChoice field.
   * The chosen preset date range, if any. The available ranges are filtered by the SearchType field. Used if DateSearchType is "fromlist".
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DateRangeChoiceType getDateRangeChoice() {
    return (typekey.DateRangeChoiceType)__getInternalInterface().getFieldValue(DATERANGECHOICE_PROP.get());
  }
  
  /**
   * The list of available date range choices (preset date ranges), as filtered by the SearchType.
   */
  public typekey.DateRangeChoiceType[] getDateRangeChoiceList() {
    return ((com.guidewire.pl.domain.custom.DateCriterionChoicePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.custom.DateCriterionChoicePublicMethods")).getDateRangeChoiceList();
  }
  
  /**
   * Gets the value of the DateSearchType field.
   * The type of date search, either "fromlist" (for a preset range) or "enteredrange" (for an explicitly entered range).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DateSearchType getDateSearchType() {
    return (typekey.DateSearchType)__getInternalInterface().getFieldValue(DATESEARCHTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the EndDate field.
   * The end (inclusive) of the date range to which the chosen date field should be restricted.  Used if DateSearchType is "enteredrange".
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ENDDATE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * The list of options specifying which field to search. This list is populated by the
   * configurable search mechanism. Each option is described by a display key name, as
   * given in the search-config.xml file.
   * @return an array of display key names
   */
  public java.lang.String[] getOptions() {
    return ((com.guidewire.pl.domain.custom.DateCriterionChoicePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.custom.DateCriterionChoicePublicMethods")).getOptions();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the SearchType field.
   * The type of search, filters the preset ranges allowed in the DateRangeChoice field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SearchObjectType getSearchType() {
    return (typekey.SearchObjectType)__getInternalInterface().getFieldValue(SEARCHTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the StartDate field.
   * The start (inclusive) of the date range to which the chosen date field should be restricted. Used if DateSearchType is "enteredrange".
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(STARTDATE_PROP.get());
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
  
  public boolean isSet() {
    return ((com.guidewire.pl.system.service.search.SearchCriterionChoice)__getDelegateManager().getImplementation("com.guidewire.pl.system.service.search.SearchCriterionChoice")).isSet();
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
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ChosenOption field.
   */
  public void setChosenOption(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CHOSENOPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateRangeChoice field.
   */
  public void setDateRangeChoice(typekey.DateRangeChoiceType value) {
    __getInternalInterface().setFieldValue(DATERANGECHOICE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateSearchType field.
   */
  public void setDateSearchType(typekey.DateSearchType value) {
    __getInternalInterface().setFieldValue(DATESEARCHTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EndDate field.
   */
  public void setEndDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(ENDDATE_PROP.get(), value);
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
  
  public void setOptions(java.lang.String[] options) {
    ((com.guidewire.pl.system.service.search.SearchCriterionChoice)__getDelegateManager().getImplementation("com.guidewire.pl.system.service.search.SearchCriterionChoice")).setOptions(options);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the SearchType field.
   */
  public void setSearchType(typekey.SearchObjectType value) {
    __getInternalInterface().setFieldValue(SEARCHTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StartDate field.
   */
  public void setStartDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(STARTDATE_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.DateCriterionChoiceInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.DateCriterionChoice.this.__getDelegateManager();
    }
    
    public void addToRestriction(com.guidewire.pl.system.database.Restriction restriction, gw.entity.IQueryColumn queryColumn) {
      ((com.guidewire.pl.system.service.search.SearchCriterionChoice)__getDelegateManager().getImplementation("com.guidewire.pl.system.service.search.SearchCriterionChoice")).addToRestriction(restriction, queryColumn);
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the ChosenOption field.
     * The chosen configurable search option, specifies the date field to be restricted.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getChosenOption() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CHOSENOPTION_PROP.get());
    }
    
    public java.lang.String getCodeForDateRange() {
      return ((com.guidewire.pl.domain.custom.impl.DateCriterionChoiceInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.custom.impl.DateCriterionChoiceInternalMethods")).getCodeForDateRange();
    }
    
    public java.lang.String getCodeForFromList() {
      return ((com.guidewire.pl.domain.custom.impl.DateCriterionChoiceInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.custom.impl.DateCriterionChoiceInternalMethods")).getCodeForFromList();
    }
    
    public java.lang.String getCodeForTypeKey(gw.entity.TypeKey typeKey) {
      return ((com.guidewire.pl.domain.custom.impl.DateCriterionChoiceInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.custom.impl.DateCriterionChoiceInternalMethods")).getCodeForTypeKey(typeKey);
    }
    
    /**
     * Gets the value of the DateRangeChoice field.
     * The chosen preset date range, if any. The available ranges are filtered by the SearchType field. Used if DateSearchType is "fromlist".
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DateRangeChoiceType getDateRangeChoice() {
      return (typekey.DateRangeChoiceType)__getInternalInterface().getFieldValue(DATERANGECHOICE_PROP.get());
    }
    
    /**
     * The list of available date range choices (preset date ranges), as filtered by the SearchType.
     */
    public typekey.DateRangeChoiceType[] getDateRangeChoiceList() {
      return ((com.guidewire.pl.domain.custom.DateCriterionChoicePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.custom.DateCriterionChoicePublicMethods")).getDateRangeChoiceList();
    }
    
    public gw.api.database.DBDateRange getDateRangeToSearch() {
      return ((com.guidewire.pl.domain.custom.impl.DateCriterionChoiceInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.custom.impl.DateCriterionChoiceInternalMethods")).getDateRangeToSearch();
    }
    
    /**
     * Gets the value of the DateSearchType field.
     * The type of date search, either "fromlist" (for a preset range) or "enteredrange" (for an explicitly entered range).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DateSearchType getDateSearchType() {
      return (typekey.DateSearchType)__getInternalInterface().getFieldValue(DATESEARCHTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the EndDate field.
     * The end (inclusive) of the date range to which the chosen date field should be restricted.  Used if DateSearchType is "enteredrange".
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getEndDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ENDDATE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    public java.lang.String getNameForTypeKey(gw.entity.TypeKey typeKey) {
      return ((com.guidewire.pl.domain.custom.impl.DateCriterionChoiceInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.custom.impl.DateCriterionChoiceInternalMethods")).getNameForTypeKey(typeKey);
    }
    
    /**
     * The list of options specifying which field to search. This list is populated by the
     * configurable search mechanism. Each option is described by a display key name, as
     * given in the search-config.xml file.
     * @return an array of display key names
     */
    public java.lang.String[] getOptions() {
      return ((com.guidewire.pl.domain.custom.DateCriterionChoicePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.custom.DateCriterionChoicePublicMethods")).getOptions();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the SearchType field.
     * The type of search, filters the preset ranges allowed in the DateRangeChoice field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.SearchObjectType getSearchType() {
      return (typekey.SearchObjectType)__getInternalInterface().getFieldValue(SEARCHTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the StartDate field.
     * The start (inclusive) of the date range to which the chosen date field should be restricted. Used if DateSearchType is "enteredrange".
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getStartDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(STARTDATE_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    public boolean isDateRangeSearch() {
      return ((com.guidewire.pl.domain.custom.impl.DateCriterionChoiceInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.custom.impl.DateCriterionChoiceInternalMethods")).isDateRangeSearch();
    }
    
    public boolean isFromListSearch() {
      return ((com.guidewire.pl.domain.custom.impl.DateCriterionChoiceInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.custom.impl.DateCriterionChoiceInternalMethods")).isFromListSearch();
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
    
    public boolean isSet() {
      return ((com.guidewire.pl.system.service.search.SearchCriterionChoice)__getDelegateManager().getImplementation("com.guidewire.pl.system.service.search.SearchCriterionChoice")).isSet();
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
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ChosenOption field.
     */
    public void setChosenOption(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CHOSENOPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateRangeChoice field.
     */
    public void setDateRangeChoice(typekey.DateRangeChoiceType value) {
      __getInternalInterface().setFieldValue(DATERANGECHOICE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateSearchType field.
     */
    public void setDateSearchType(typekey.DateSearchType value) {
      __getInternalInterface().setFieldValue(DATESEARCHTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EndDate field.
     */
    public void setEndDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(ENDDATE_PROP.get(), value);
    }
    
    public void setFromRange(gw.api.database.DBDateRange dateRange) {
      ((com.guidewire.pl.domain.custom.impl.DateCriterionChoiceInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.custom.impl.DateCriterionChoiceInternalMethods")).setFromRange(dateRange);
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
    
    public void setOptions(java.lang.String[] options) {
      ((com.guidewire.pl.system.service.search.SearchCriterionChoice)__getDelegateManager().getImplementation("com.guidewire.pl.system.service.search.SearchCriterionChoice")).setOptions(options);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the SearchType field.
     */
    public void setSearchType(typekey.SearchObjectType value) {
      __getInternalInterface().setFieldValue(SEARCHTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StartDate field.
     */
    public void setStartDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(STARTDATE_PROP.get(), value);
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
    config.put("com.guidewire.pl.domain.custom.DateCriterionChoicePublicMethods", "com.guidewire.pl.domain.custom.impl.DateCriterionChoiceImpl");
    config.put("com.guidewire.pl.domain.custom.impl.DateCriterionChoiceInternalMethods", "com.guidewire.pl.domain.custom.impl.DateCriterionChoiceImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.service.search.SearchCriterionChoice", "com.guidewire.pl.domain.custom.impl.DateCriterionChoiceImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.DateCriterionChoice.class, config);
    com.guidewire._generated.entity.DateCriterionChoiceInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.DateCriterionChoice, com.guidewire._generated.entity.DateCriterionChoiceInternal>() {
      public java.lang.Object getImplementation(entity.DateCriterionChoice bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.DateCriterionChoiceInternal getInternalInterface(entity.DateCriterionChoice bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.DateCriterionChoice newEmptyInstance() {
        return new entity.DateCriterionChoice((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}