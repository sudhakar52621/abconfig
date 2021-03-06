package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/BatchProcessInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BatchProcessInfo extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination () : pcf.api.Destination {
    return __newDestinationForLocation(pcf.BatchProcessInfo, {}, 1)
  }
  
  static function createDestination (batchProcessTypes :  BatchProcessType[]) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.BatchProcessInfo, {batchProcessTypes}, 0)
  }
  
  static function drilldown () : pcf.api.Location {
    return __newDestinationForLocation(pcf.BatchProcessInfo, {}, 1).drilldown()
  }
  
  static function drilldown (batchProcessTypes :  BatchProcessType[]) : pcf.api.Location {
    return __newDestinationForLocation(pcf.BatchProcessInfo, {batchProcessTypes}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go () : pcf.api.Location {
    return __newDestinationForLocation(pcf.BatchProcessInfo, {}, 1).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (batchProcessTypes :  BatchProcessType[]) : pcf.api.Location {
    return __newDestinationForLocation(pcf.BatchProcessInfo, {batchProcessTypes}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain () : pcf.api.Location {
    return __newDestinationForLocation(pcf.BatchProcessInfo, {}, 1).goInMain()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (batchProcessTypes :  BatchProcessType[]) : pcf.api.Location {
    return __newDestinationForLocation(pcf.BatchProcessInfo, {batchProcessTypes}, 0).goInMain()
  }
  
  static function printPage () : pcf.api.Location {
    return __newDestinationForLocation(pcf.BatchProcessInfo, {}, 1).printPage()
  }
  
  static function printPage (batchProcessTypes :  BatchProcessType[]) : pcf.api.Location {
    return __newDestinationForLocation(pcf.BatchProcessInfo, {batchProcessTypes}, 0).printPage()
  }
  
  static function push () : pcf.api.Location {
    return __newDestinationForLocation(pcf.BatchProcessInfo, {}, 1).push()
  }
  
  static function push (batchProcessTypes :  BatchProcessType[]) : pcf.api.Location {
    return __newDestinationForLocation(pcf.BatchProcessInfo, {batchProcessTypes}, 0).push()
  }
  
  
}