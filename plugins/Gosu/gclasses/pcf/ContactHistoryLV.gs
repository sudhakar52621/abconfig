package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/ContactHistoryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactHistoryLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contact :  ABContact) : void {
    __widgetOf(this, pcf.ContactHistoryLV, SECTION_WIDGET_CLASS).setVariables(false, {$contact})
  }
  
  function refreshVariables ($contact :  ABContact) : void {
    __widgetOf(this, pcf.ContactHistoryLV, SECTION_WIDGET_CLASS).setVariables(true, {$contact})
  }
  
  
}