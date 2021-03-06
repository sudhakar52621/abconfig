package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/EnableWorkQueuePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EnableWorkQueuePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/EnableWorkQueuePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EnableWorkQueuePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (enableAlertBar :  boolean[]) : int {
      return 0
    }
    
    // 'afterCommit' attribute on Popup (id=EnableWorkQueuePopup) at EnableWorkQueuePopup.pcf: line 10, column 82
    function afterCommit_7 (TopLocation :  pcf.api.Location) : void {
      enableAlertBar[0]=true;gw.api.profiler.GosuProfilerPageHelper.enableProfilingFor( typekey.ProfilerConfig.TC_WQPROFILERCONFIG, com.guidewire.pl.system.workqueue.WorkQueueProfiler.getEntryPointName( workQueueName ) )
    }
    
    // 'value' attribute on RangeInput (id=WorkQueue_Input) at EnableWorkQueuePopup.pcf: line 33, column 43
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      workQueueName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // EditButtons at EnableWorkQueuePopup.pcf: line 22, column 32
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'valueRange' attribute on RangeInput (id=WorkQueue_Input) at EnableWorkQueuePopup.pcf: line 33, column 43
    function valueRange_3 () : java.lang.Object {
      return gw.api.profiler.BatchProcessWorkQueueProfilerPageHelper.getNotEnabledWorkQueueNames().toTypedArray()
    }
    
    // 'value' attribute on RangeInput (id=WorkQueue_Input) at EnableWorkQueuePopup.pcf: line 33, column 43
    function value_1 () : java.lang.String {
      return workQueueName
    }
    
    // 'valueRange' attribute on RangeInput (id=WorkQueue_Input) at EnableWorkQueuePopup.pcf: line 33, column 43
    function verifyValueRangeIsAllowedType_4 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=WorkQueue_Input) at EnableWorkQueuePopup.pcf: line 33, column 43
    function verifyValueRangeIsAllowedType_4 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=WorkQueue_Input) at EnableWorkQueuePopup.pcf: line 33, column 43
    function verifyValueRange_5 () : void {
      var __valueRangeArg = gw.api.profiler.BatchProcessWorkQueueProfilerPageHelper.getNotEnabledWorkQueueNames().toTypedArray()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_4(__valueRangeArg)
    }
    
    override property get CurrentLocation () : pcf.EnableWorkQueuePopup {
      return super.CurrentLocation as pcf.EnableWorkQueuePopup
    }
    
    property get enableAlertBar () : boolean[] {
      return getVariableValue("enableAlertBar", 0) as boolean[]
    }
    
    property set enableAlertBar ($arg :  boolean[]) {
      setVariableValue("enableAlertBar", 0, $arg)
    }
    
    property get workQueueName () : String {
      return getVariableValue("workQueueName", 0) as String
    }
    
    property set workQueueName ($arg :  String) {
      setVariableValue("workQueueName", 0, $arg)
    }
    
    
  }
  
  
}