package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/basics/ContactBasicsDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactBasicsDV_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contact :  ABContact) : void {
    __widgetOf(this, pcf.ContactBasicsDV_default, SECTION_WIDGET_CLASS).setVariables(false, {$contact})
  }
  
  function refreshVariables ($contact :  ABContact) : void {
    __widgetOf(this, pcf.ContactBasicsDV_default, SECTION_WIDGET_CLASS).setVariables(true, {$contact})
  }
  
  
}