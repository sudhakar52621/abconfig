package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/basics/ABCompanyVendorBasicInputSet.ABCompanyVendor.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ABCompanyVendorBasicInputSet_ABCompanyVendor extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contact :  ABContact) : void {
    __widgetOf(this, pcf.ABCompanyVendorBasicInputSet_ABCompanyVendor, SECTION_WIDGET_CLASS).setVariables(false, {$contact})
  }
  
  function refreshVariables ($contact :  ABContact) : void {
    __widgetOf(this, pcf.ABCompanyVendorBasicInputSet_ABCompanyVendor, SECTION_WIDGET_CLASS).setVariables(true, {$contact})
  }
  
  
}