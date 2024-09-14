var $wnd = $wnd || window.parent;
var __gwtModuleFunction = $wnd.formatter;
var $sendStats = __gwtModuleFunction.__sendStats;
$sendStats('moduleStartup', 'moduleEvalStart');
var $gwt_version = "2.10.0";
var $strongName = 'D51EEDEB77B9A923D8ED4333F8CC2CAB';
var $gwt = {};
var $doc = $wnd.document;
var $moduleName, $moduleBase;
function __gwtStartLoadingFragment(frag) {
var fragFile = 'deferredjs/' + $strongName + '/' + frag + '.cache.js';
return __gwtModuleFunction.__startLoadingFragment(fragFile);
}
function __gwtInstallCode(code) {return __gwtModuleFunction.__installRunAsyncCode(code);}
function __gwt_isKnownPropertyValue(propName, propValue) {
return __gwtModuleFunction.__gwt_isKnownPropertyValue(propName, propValue);
}
function __gwt_getMetaProperty(name) {
return __gwtModuleFunction.__gwt_getMetaProperty(name);
}
var $stats = $wnd.__gwtStatsEvent ? function(a) {
return $wnd.__gwtStatsEvent && $wnd.__gwtStatsEvent(a);
} : null;
var $sessionId = $wnd.__gwtStatsSessionId ? $wnd.__gwtStatsSessionId : null;
var $intern_0 = {3:1, 5:1}, $intern_1 = {3:1}, $intern_2 = 65535, $intern_3 = 1900, $intern_4 = {3:1, 15:1}, $intern_5 = {3:1, 15:1, 9:1}, $intern_6 = -2147483648, $intern_7 = 4194303, $intern_8 = 1048575, $intern_9 = 524288, $intern_10 = 4194304, $intern_11 = 17592186044416, $intern_12 = -17592186044416, $intern_13 = {13:1};
var _, prototypesByTypeId_0, initFnList_0, permutationId = -1;
function setGwtProperty(propertyName, propertyValue){
  typeof window === 'object' && typeof window['$gwt'] === 'object' && (window['$gwt'][propertyName] = propertyValue);
}

function gwtOnLoad_0(errFn, modName, modBase, softPermutationId){
  ensureModuleInit();
  var initFnList = initFnList_0;
  $moduleName = modName;
  $moduleBase = modBase;
  permutationId = softPermutationId;
  function initializeModules(){
    for (var i = 0; i < initFnList.length; i++) {
      initFnList[i]();
    }
  }

  if (errFn) {
    try {
      $entry(initializeModules)();
    }
     catch (e) {
      errFn(modName, e);
    }
  }
   else {
    $entry(initializeModules)();
  }
}

function ensureModuleInit(){
  initFnList_0 == null && (initFnList_0 = []);
}

function addInitFunctions(){
  ensureModuleInit();
  var initFnList = initFnList_0;
  for (var i = 0; i < arguments.length; i++) {
    initFnList.push(arguments[i]);
  }
}

function typeMarkerFn(){
}

function toString_6(object){
  var number;
  if (Array.isArray(object) && object.typeMarker === typeMarkerFn) {
    return $getName(getClass__Ljava_lang_Class___devirtual$(object)) + '@' + (number = hashCode__I__devirtual$(object) >>> 0 , number.toString(16));
  }
  return object.toString();
}

function portableObjCreate(obj){
  function F(){
  }

  ;
  F.prototype = obj || {};
  return new F;
}

function emptyMethod(){
}

function defineClass(typeId, superTypeIdOrPrototype, castableTypeMap){
  var prototypesByTypeId = prototypesByTypeId_0, superPrototype;
  var prototype_0 = prototypesByTypeId[typeId];
  var clazz = prototype_0 instanceof Array?prototype_0[0]:null;
  if (prototype_0 && !clazz) {
    _ = prototype_0;
  }
   else {
    _ = (superPrototype = superTypeIdOrPrototype && superTypeIdOrPrototype.prototype , !superPrototype && (superPrototype = prototypesByTypeId_0[superTypeIdOrPrototype]) , portableObjCreate(superPrototype));
    _.castableTypeMap = castableTypeMap;
    !superTypeIdOrPrototype && (_.typeMarker = typeMarkerFn);
    prototypesByTypeId[typeId] = _;
  }
  for (var i = 3; i < arguments.length; ++i) {
    arguments[i].prototype = _;
  }
  clazz && (_.___clazz = clazz);
}

$wnd.goog = $wnd.goog || {};
$wnd.goog.global = $wnd.goog.global || $wnd;
prototypesByTypeId_0 = {};
function Object_0(){
}

function getClass__Ljava_lang_Class___devirtual$(this$static){
  return instanceOfString(this$static)?Ljava_lang_String_2_classLit:instanceOfDouble(this$static)?Ljava_lang_Double_2_classLit:instanceOfBoolean(this$static)?Ljava_lang_Boolean_2_classLit:hasJavaObjectVirtualDispatch(this$static)?this$static.___clazz:isJavaArray(this$static)?this$static.___clazz:this$static.___clazz || Array.isArray(this$static) && getClassLiteralForArray(Lcom_google_gwt_core_client_JavaScriptObject_2_classLit, 1) || Lcom_google_gwt_core_client_JavaScriptObject_2_classLit;
}

function hashCode__I__devirtual$(this$static){
  return instanceOfString(this$static)?$hashCode(this$static):instanceOfDouble(this$static)?round_int((checkCriticalNotNull(this$static) , this$static)):instanceOfBoolean(this$static)?(checkCriticalNotNull(this$static) , this$static)?1231:1237:hasJavaObjectVirtualDispatch(this$static)?this$static.hashCode_0():isJavaArray(this$static)?getObjectIdentityHashCode(this$static):!!this$static && !!this$static.hashCode?this$static.hashCode():getObjectIdentityHashCode(this$static);
}

defineClass(1, null, {}, Object_0);
_.getClass_0 = function getClass_0(){
  return this.___clazz;
}
;
_.hashCode_0 = function hashCode_0(){
  return getObjectIdentityHashCode(this);
}
;
_.toString_0 = function toString_0(){
  var number;
  return $getName(getClass__Ljava_lang_Class___devirtual$(this)) + '@' + (number = hashCode__I__devirtual$(this) >>> 0 , number.toString(16));
}
;
_.hashCode = function(){
  return this.hashCode_0();
}
;
_.toString = function(){
  return this.toString_0();
}
;
function canCast(src_0, dstId){
  if (instanceOfString(src_0)) {
    return !!stringCastMap[dstId];
  }
   else if (src_0.castableTypeMap) {
    return !!src_0.castableTypeMap[dstId];
  }
   else if (instanceOfDouble(src_0)) {
    return !!doubleCastMap[dstId];
  }
   else if (instanceOfBoolean(src_0)) {
    return !!booleanCastMap[dstId];
  }
  return false;
}

function castTo(src_0, dstId){
  checkCriticalType(src_0 == null || canCast(src_0, dstId));
  return src_0;
}

function castToJso(src_0){
  checkCriticalType(src_0 == null || isJsObjectOrFunction(src_0) && !(src_0.typeMarker === typeMarkerFn));
  return src_0;
}

function castToString(src_0){
  checkCriticalType(src_0 == null || instanceOfString(src_0));
  return src_0;
}

function hasJavaObjectVirtualDispatch(src_0){
  return !Array.isArray(src_0) && src_0.typeMarker === typeMarkerFn;
}

function instanceOf(src_0, dstId){
  return src_0 != null && canCast(src_0, dstId);
}

function instanceOfBoolean(src_0){
  return typeof src_0 === 'boolean';
}

function instanceOfDouble(src_0){
  return typeof src_0 === 'number';
}

function instanceOfJso(src_0){
  return src_0 != null && isJsObjectOrFunction(src_0) && !(src_0.typeMarker === typeMarkerFn);
}

function instanceOfString(src_0){
  return typeof src_0 === 'string';
}

function isJsObjectOrFunction(src_0){
  return typeof src_0 === 'object' || typeof src_0 === 'function';
}

function maskUndefined(src_0){
  return src_0 == null?null:src_0;
}

function round_int(x_0){
  return Math.max(Math.min(x_0, 2147483647), -2147483648) | 0;
}

var booleanCastMap, doubleCastMap, stringCastMap;
function $ensureNamesAreInitialized(this$static){
  if (this$static.typeName != null) {
    return;
  }
  initializeNames(this$static);
}

function $getName(this$static){
  $ensureNamesAreInitialized(this$static);
  return this$static.typeName;
}

function Class(){
  ++nextSequentialId;
  this.typeName = null;
  this.simpleName = null;
  this.packageName = null;
  this.compoundName = null;
  this.canonicalName = null;
  this.typeId = null;
  this.arrayLiterals = null;
}

function createClassObject(packageName, compoundClassName){
  var clazz;
  clazz = new Class;
  clazz.packageName = packageName;
  clazz.compoundName = compoundClassName;
  return clazz;
}

function createForClass(packageName, compoundClassName, typeId){
  var clazz;
  clazz = createClassObject(packageName, compoundClassName);
  maybeSetClassLiteral(typeId, clazz);
  return clazz;
}

function createForEnum(packageName, compoundClassName, typeId, enumConstantsFunc){
  var clazz;
  clazz = createClassObject(packageName, compoundClassName);
  maybeSetClassLiteral(typeId, clazz);
  clazz.modifiers = enumConstantsFunc?8:0;
  return clazz;
}

function createForPrimitive(className, primitiveTypeId){
  var clazz;
  clazz = createClassObject('', className);
  clazz.typeId = primitiveTypeId;
  clazz.modifiers = 1;
  return clazz;
}

function getClassLiteralForArray_0(leafClass, dimensions){
  var arrayLiterals = leafClass.arrayLiterals = leafClass.arrayLiterals || [];
  return arrayLiterals[dimensions] || (arrayLiterals[dimensions] = leafClass.createClassLiteralForArray(dimensions));
}

function getPrototypeForClass(clazz){
  if (clazz.isPrimitive()) {
    return null;
  }
  var typeId = clazz.typeId;
  return prototypesByTypeId_0[typeId];
}

function initializeNames(clazz){
  if (clazz.isArray_0()) {
    var componentType = clazz.componentType;
    componentType.isPrimitive()?(clazz.typeName = '[' + componentType.typeId):!componentType.isArray_0()?(clazz.typeName = '[L' + componentType.getName() + ';'):(clazz.typeName = '[' + componentType.getName());
    clazz.canonicalName = componentType.getCanonicalName() + '[]';
    clazz.simpleName = componentType.getSimpleName() + '[]';
    return;
  }
  var packageName = clazz.packageName;
  var compoundName = clazz.compoundName;
  compoundName = compoundName.split('/');
  clazz.typeName = join_0('.', [packageName, join_0('$', compoundName)]);
  clazz.canonicalName = join_0('.', [packageName, join_0('.', compoundName)]);
  clazz.simpleName = compoundName[compoundName.length - 1];
}

function join_0(separator, strings){
  var i = 0;
  while (!strings[i] || strings[i] == '') {
    i++;
  }
  var result = strings[i++];
  for (; i < strings.length; i++) {
    if (!strings[i] || strings[i] == '') {
      continue;
    }
    result += separator + strings[i];
  }
  return result;
}

function maybeSetClassLiteral(typeId, clazz){
  var proto;
  if (!typeId) {
    return;
  }
  clazz.typeId = typeId;
  var prototype_0 = getPrototypeForClass(clazz);
  if (!prototype_0) {
    prototypesByTypeId_0[typeId] = [clazz];
    return;
  }
  prototype_0.___clazz = clazz;
}

defineClass(28, 1, {}, Class);
_.createClassLiteralForArray = function createClassLiteralForArray(dimensions){
  var clazz;
  clazz = new Class;
  clazz.modifiers = 4;
  dimensions > 1?(clazz.componentType = getClassLiteralForArray_0(this, dimensions - 1)):(clazz.componentType = this);
  return clazz;
}
;
_.getCanonicalName = function getCanonicalName(){
  $ensureNamesAreInitialized(this);
  return this.canonicalName;
}
;
_.getName = function getName(){
  return $getName(this);
}
;
_.getSimpleName = function getSimpleName(){
  $ensureNamesAreInitialized(this);
  return this.simpleName;
}
;
_.isArray_0 = function isArray(){
  return (this.modifiers & 4) != 0;
}
;
_.isPrimitive = function isPrimitive(){
  return (this.modifiers & 1) != 0;
}
;
_.toString_0 = function toString_8(){
  return ((this.modifiers & 2) != 0?'interface ':(this.modifiers & 1) != 0?'':'class ') + ($ensureNamesAreInitialized(this) , this.typeName);
}
;
_.modifiers = 0;
var nextSequentialId = 1;
var Ljava_lang_Object_2_classLit = createForClass('java.lang', 'Object', 1);
var Ljava_lang_Class_2_classLit = createForClass('java.lang', 'Class', 28);
function $fillInStackTrace(this$static){
  this$static.writableStackTrace && this$static.backingJsObject !== '__noinit__' && this$static.initializeBackingError();
  return this$static;
}

function $linkBack(this$static, error){
  if (error instanceof Object) {
    try {
      error.__java$exception = this$static;
      if (navigator.userAgent.toLowerCase().indexOf('msie') != -1 && $doc.documentMode < 9) {
        return;
      }
      var throwable = this$static;
      Object.defineProperties(error, {cause:{get:function(){
        var cause = throwable.getCause();
        return cause && cause.getBackingJsObject();
      }
      }, suppressed:{get:function(){
        return throwable.getBackingSuppressed();
      }
      }});
    }
     catch (ignored) {
    }
  }
}

function $setBackingJsObject(this$static, backingJsObject){
  this$static.backingJsObject = backingJsObject;
  $linkBack(this$static, backingJsObject);
}

function $toString(this$static, message){
  var className;
  className = $getName(this$static.___clazz);
  return message == null?className:className + ': ' + message;
}

function fixIE(e){
  if (!('stack' in e)) {
    try {
      throw e;
    }
     catch (ignored) {
    }
  }
  return e;
}

defineClass(5, 1, $intern_0);
_.createError = function createError(msg){
  return new Error(msg);
}
;
_.getBackingJsObject = function getBackingJsObject(){
  return this.backingJsObject;
}
;
_.getBackingSuppressed = function getBackingSuppressed(){
  var i, result, suppressed;
  suppressed = (this.suppressedExceptions == null && (this.suppressedExceptions = initUnidimensionalArray(Ljava_lang_Throwable_2_classLit, $intern_1, 5, 0, 0, 1)) , this.suppressedExceptions);
  result = initUnidimensionalArray(Ljava_lang_Object_2_classLit, $intern_1, 1, suppressed.length, 5, 1);
  for (i = 0; i < suppressed.length; i++) {
    result[i] = suppressed[i].backingJsObject;
  }
  return result;
}
;
_.getCause = function getCause(){
  return this.cause_0;
}
;
_.getMessage = function getMessage(){
  return this.detailMessage;
}
;
_.initializeBackingError = function initializeBackingError(){
  $setBackingJsObject(this, fixIE(this.createError($toString(this, this.detailMessage))));
  captureStackTrace(this);
}
;
_.toString_0 = function toString_1(){
  return $toString(this, this.getMessage());
}
;
_.backingJsObject = '__noinit__';
_.writableStackTrace = true;
var Ljava_lang_Throwable_2_classLit = createForClass('java.lang', 'Throwable', 5);
defineClass(22, 5, $intern_0);
var Ljava_lang_Exception_2_classLit = createForClass('java.lang', 'Exception', 22);
function RuntimeException(){
  $fillInStackTrace(this);
  this.initializeBackingError();
}

function RuntimeException_0(message){
  this.detailMessage = message;
  $fillInStackTrace(this);
  this.initializeBackingError();
}

defineClass(10, 22, $intern_0);
var Ljava_lang_RuntimeException_2_classLit = createForClass('java.lang', 'RuntimeException', 10);
defineClass(29, 10, $intern_0);
var Ljava_lang_JsException_2_classLit = createForClass('java.lang', 'JsException', 29);
defineClass(41, 29, $intern_0);
var Lcom_google_gwt_core_client_impl_JavaScriptExceptionBase_2_classLit = createForClass('com.google.gwt.core.client.impl', 'JavaScriptExceptionBase', 41);
function $clinit_JavaScriptException(){
  $clinit_JavaScriptException = emptyMethod;
  NOT_SET = new Object_0;
}

function $ensureInit(this$static){
  var exception;
  if (this$static.message_0 == null) {
    exception = maskUndefined(this$static.e) === maskUndefined(NOT_SET)?null:this$static.e;
    this$static.name_0 = exception == null?'null':instanceOfJso(exception)?getExceptionName0(castToJso(exception)):instanceOfString(exception)?'String':$getName(getClass__Ljava_lang_Class___devirtual$(exception));
    this$static.description = this$static.description + ': ' + (instanceOfJso(exception)?getExceptionDescription0(castToJso(exception)):exception + '');
    this$static.message_0 = '(' + this$static.name_0 + ') ' + this$static.description;
  }
}

function JavaScriptException(e){
  $clinit_JavaScriptException();
  $fillInStackTrace(this);
  this.backingJsObject = e;
  $linkBack(this, e);
  this.detailMessage = e == null?'null':toString_6(e);
  this.description = '';
  this.e = e;
  this.description = '';
}

function getExceptionDescription0(e){
  return e == null?null:e.message;
}

function getExceptionName0(e){
  return e == null?null:e.name;
}

defineClass(16, 41, {16:1, 3:1, 5:1}, JavaScriptException);
_.getMessage = function getMessage_0(){
  $ensureInit(this);
  return this.message_0;
}
;
_.getThrown = function getThrown(){
  return maskUndefined(this.e) === maskUndefined(NOT_SET)?null:this.e;
}
;
var NOT_SET;
var Lcom_google_gwt_core_client_JavaScriptException_2_classLit = createForClass('com.google.gwt.core.client', 'JavaScriptException', 16);
var Lcom_google_gwt_core_client_JavaScriptObject_2_classLit = createForClass('com.google.gwt.core.client', 'JavaScriptObject$', 0);
defineClass(70, 1, {});
var Lcom_google_gwt_core_client_Scheduler_2_classLit = createForClass('com.google.gwt.core.client', 'Scheduler', 70);
function $clinit_Impl(){
  $clinit_Impl = emptyMethod;
  !!($clinit_StackTraceCreator() , collector);
}

function apply_0(jsFunction, thisObj, args){
  return jsFunction.apply(thisObj, args);
  var __0;
}

function enter(){
  var now_0;
  if (entryDepth != 0) {
    now_0 = Date.now();
    if (now_0 - watchdogEntryDepthLastScheduled > 2000) {
      watchdogEntryDepthLastScheduled = now_0;
      watchdogEntryDepthTimerId = $wnd.setTimeout(watchdogEntryDepthRun, 10);
    }
  }
  if (entryDepth++ == 0) {
    $flushEntryCommands(($clinit_SchedulerImpl() , INSTANCE));
    return true;
  }
  return false;
}

function entry_0(jsFunction){
  $clinit_Impl();
  return function(){
    return entry0(jsFunction, this, arguments);
    var __0;
  }
  ;
}

function entry0(jsFunction, thisObj, args){
  var initialEntry;
  initialEntry = enter();
  try {
    return apply_0(jsFunction, thisObj, args);
  }
   finally {
    exit(initialEntry);
  }
}

function exit(initialEntry){
  initialEntry && $flushFinallyCommands(($clinit_SchedulerImpl() , INSTANCE));
  --entryDepth;
  if (initialEntry) {
    if (watchdogEntryDepthTimerId != -1) {
      watchdogEntryDepthCancel(watchdogEntryDepthTimerId);
      watchdogEntryDepthTimerId = -1;
    }
  }
}

function reportToBrowser(e){
  $clinit_Impl();
  $wnd.setTimeout(function(){
    throw e;
  }
  , 0);
}

function watchdogEntryDepthCancel(timerId){
  $wnd.clearTimeout(timerId);
}

function watchdogEntryDepthRun(){
  entryDepth != 0 && (entryDepth = 0);
  watchdogEntryDepthTimerId = -1;
}

var entryDepth = 0, watchdogEntryDepthLastScheduled = 0, watchdogEntryDepthTimerId = -1;
function $clinit_SchedulerImpl(){
  $clinit_SchedulerImpl = emptyMethod;
  INSTANCE = new SchedulerImpl;
}

function $flushEntryCommands(this$static){
  var oldQueue, rescheduled;
  if (this$static.entryCommands) {
    rescheduled = null;
    do {
      oldQueue = this$static.entryCommands;
      this$static.entryCommands = null;
      rescheduled = runScheduledTasks(oldQueue, rescheduled);
    }
     while (this$static.entryCommands);
    this$static.entryCommands = rescheduled;
  }
}

function $flushFinallyCommands(this$static){
  var oldQueue, rescheduled;
  if (this$static.finallyCommands) {
    rescheduled = null;
    do {
      oldQueue = this$static.finallyCommands;
      this$static.finallyCommands = null;
      rescheduled = runScheduledTasks(oldQueue, rescheduled);
    }
     while (this$static.finallyCommands);
    this$static.finallyCommands = rescheduled;
  }
}

function SchedulerImpl(){
}

function push_0(queue, task){
  !queue && (queue = []);
  queue[queue.length] = task;
  return queue;
}

function runScheduledTasks(tasks, rescheduled){
  var e, i, j, t;
  for (i = 0 , j = tasks.length; i < j; i++) {
    t = tasks[i];
    try {
      t[1]?t[0].$_nullMethod() && (rescheduled = push_0(rescheduled, t)):t[0].$_nullMethod();
    }
     catch ($e0) {
      $e0 = toJava($e0);
      if (instanceOf($e0, 5)) {
        e = $e0;
        $clinit_Impl();
        reportToBrowser(instanceOf(e, 16)?castTo(e, 16).getThrown():e);
      }
       else 
        throw toJs($e0);
    }
  }
  return rescheduled;
}

defineClass(48, 70, {}, SchedulerImpl);
var INSTANCE;
var Lcom_google_gwt_core_client_impl_SchedulerImpl_2_classLit = createForClass('com.google.gwt.core.client.impl', 'SchedulerImpl', 48);
function $clinit_StackTraceCreator(){
  $clinit_StackTraceCreator = emptyMethod;
  var c, enforceLegacy;
  enforceLegacy = !supportsErrorStack();
  c = new StackTraceCreator$CollectorModernNoSourceMap;
  collector = enforceLegacy?new StackTraceCreator$CollectorLegacy:c;
}

function captureStackTrace(error){
  $clinit_StackTraceCreator();
  collector.collect(error);
}

function extractFunctionName(fnName){
  var fnRE = /function(?:\s+([\w$]+))?\s*\(/;
  var match_0 = fnRE.exec(fnName);
  return match_0 && match_0[1] || 'anonymous';
}

function supportsErrorStack(){
  if (Error.stackTraceLimit > 0) {
    $wnd.Error.stackTraceLimit = Error.stackTraceLimit = 64;
    return true;
  }
  return 'stack' in new Error;
}

var collector;
defineClass(84, 1, {});
var Lcom_google_gwt_core_client_impl_StackTraceCreator$Collector_2_classLit = createForClass('com.google.gwt.core.client.impl', 'StackTraceCreator/Collector', 84);
function StackTraceCreator$CollectorLegacy(){
}

defineClass(42, 84, {}, StackTraceCreator$CollectorLegacy);
_.collect = function collect(error){
  var seen = {}, name_1;
  var fnStack = [];
  error['fnStack'] = fnStack;
  var callee = arguments.callee.caller;
  while (callee) {
    var name_0 = ($clinit_StackTraceCreator() , callee.name || (callee.name = extractFunctionName(callee.toString())));
    fnStack.push(name_0);
    var keyName = ':' + name_0;
    var withThisName = seen[keyName];
    if (withThisName) {
      var i, j;
      for (i = 0 , j = withThisName.length; i < j; i++) {
        if (withThisName[i] === callee) {
          return;
        }
      }
    }
    (withThisName || (seen[keyName] = [])).push(callee);
    callee = callee.caller;
  }
}
;
var Lcom_google_gwt_core_client_impl_StackTraceCreator$CollectorLegacy_2_classLit = createForClass('com.google.gwt.core.client.impl', 'StackTraceCreator/CollectorLegacy', 42);
defineClass(85, 84, {});
_.collect = function collect_0(error){
}
;
var Lcom_google_gwt_core_client_impl_StackTraceCreator$CollectorModern_2_classLit = createForClass('com.google.gwt.core.client.impl', 'StackTraceCreator/CollectorModern', 85);
function StackTraceCreator$CollectorModernNoSourceMap(){
}

defineClass(43, 85, {}, StackTraceCreator$CollectorModernNoSourceMap);
var Lcom_google_gwt_core_client_impl_StackTraceCreator$CollectorModernNoSourceMap_2_classLit = createForClass('com.google.gwt.core.client.impl', 'StackTraceCreator/CollectorModernNoSourceMap', 43);
function $clinit_DateTimeFormat(){
  $clinit_DateTimeFormat = emptyMethod;
  new HashMap;
}

function $addPart(this$static, buf, count){
  var oldLength;
  if (buf.string.length > 0) {
    $add(this$static.patternParts, new DateTimeFormat$PatternPart(buf.string, count));
    oldLength = buf.string.length;
    0 < oldLength?(buf.string = $substring_0(buf.string, 0, 0)):0 > oldLength && (buf.string += valueOf(initUnidimensionalArray(C_classLit, $intern_1, 11, -oldLength, 15, 1)));
  }
}

function $format(this$static, date, timeZone){
  var ch_0, diff, i, j, keepDate, keepTime, n, toAppendTo, trailQuote;
  !timeZone && (timeZone = createTimeZone(date.jsdate.getTimezoneOffset()));
  diff = (date.jsdate.getTimezoneOffset() - timeZone.standardOffset) * 60000;
  keepDate = new Date_2(add_1(fromDouble_0(date.jsdate.getTime()), diff));
  keepTime = keepDate;
  if (keepDate.jsdate.getTimezoneOffset() != date.jsdate.getTimezoneOffset()) {
    diff > 0?(diff -= 86400000):(diff += 86400000);
    keepTime = new Date_2(add_1(fromDouble_0(date.jsdate.getTime()), diff));
  }
  toAppendTo = new StringBuilder_0;
  n = this$static.pattern.length;
  for (i = 0; i < n;) {
    ch_0 = $charAt_0(this$static.pattern, i);
    if (ch_0 >= 97 && ch_0 <= 122 || ch_0 >= 65 && ch_0 <= 90) {
      for (j = i + 1; j < n && $charAt_0(this$static.pattern, j) == ch_0; ++j)
      ;
      $subFormat(this$static, toAppendTo, ch_0, j - i, keepDate, keepTime, timeZone);
      i = j;
    }
     else if (ch_0 == 39) {
      ++i;
      if (i < n && $charAt_0(this$static.pattern, i) == 39) {
        toAppendTo.string += "'";
        ++i;
        continue;
      }
      trailQuote = false;
      while (!trailQuote) {
        j = i;
        while (j < n && $charAt_0(this$static.pattern, j) != 39) {
          ++j;
        }
        if (j >= n) {
          throw toJs(new IllegalArgumentException_0("Missing trailing '"));
        }
        j + 1 < n && $charAt_0(this$static.pattern, j + 1) == 39?++j:(trailQuote = true);
        $append_1(toAppendTo, $substring_0(this$static.pattern, i, j));
        i = j + 1;
      }
    }
     else {
      toAppendTo.string += String.fromCharCode(ch_0);
      ++i;
    }
  }
  return toAppendTo.string;
}

function $formatFractionalSeconds(buf, count, date){
  var time, value_0;
  time = fromDouble_0(date.jsdate.getTime());
  if (compare_0(time, 0) < 0) {
    value_0 = 1000 - toInt_0(mod(neg_0(time), 1000));
    value_0 == 1000 && (value_0 = 0);
  }
   else {
    value_0 = toInt_0(mod(time, 1000));
  }
  if (count == 1) {
    value_0 = $wnd.Math.min((value_0 + 50) / 100 | 0, 9);
    $append(buf, 48 + value_0 & $intern_2);
  }
   else if (count == 2) {
    value_0 = $wnd.Math.min((value_0 + 5) / 10 | 0, 99);
    $zeroPaddingNumber(buf, value_0, 2);
  }
   else {
    $zeroPaddingNumber(buf, value_0, 3);
    count > 3 && $zeroPaddingNumber(buf, 0, count - 3);
  }
}

function $formatMonth(this$static, buf, count, date){
  var value_0;
  value_0 = date.jsdate.getMonth();
  switch (count) {
    case 5:
      $append_1(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['J', 'F', 'M', 'A', 'M', 'J', 'J', 'A', 'S', 'O', 'N', 'D'])[value_0]);
      break;
    case 4:
      $append_1(buf, this$static.dateTimeFormatInfo.monthsFull()[value_0]);
      break;
    case 3:
      $append_1(buf, this$static.dateTimeFormatInfo.monthsShort()[value_0]);
      break;
    default:$zeroPaddingNumber(buf, value_0 + 1, count);
  }
}

function $formatYear(buf, count, date){
  var value_0;
  value_0 = date.jsdate.getFullYear() - $intern_3 + $intern_3;
  value_0 < 0 && (value_0 = -value_0);
  switch (count) {
    case 1:
      buf.string += value_0;
      break;
    case 2:
      $zeroPaddingNumber(buf, value_0 % 100, 2);
      break;
    default:$zeroPaddingNumber(buf, value_0, count);
  }
}

function $getNextCharCountInPattern(pattern, start_0){
  var ch_0, next;
  ch_0 = (checkCriticalStringElementIndex(start_0, pattern.length) , pattern.charCodeAt(start_0));
  next = start_0 + 1;
  while (next < pattern.length && (checkCriticalStringElementIndex(next, pattern.length) , pattern.charCodeAt(next) == ch_0)) {
    ++next;
  }
  return next - start_0;
}

function $identifyAbutStart(this$static){
  var abut, i, len;
  abut = false;
  len = this$static.patternParts.array.length;
  for (i = 0; i < len; i++) {
    if ($isNumeric(castTo($get(this$static.patternParts, i), 14))) {
      if (!abut && i + 1 < len && $isNumeric(castTo($get(this$static.patternParts, i + 1), 14))) {
        abut = true;
        castTo($get(this$static.patternParts, i), 14).abutStart = true;
      }
    }
     else {
      abut = false;
    }
  }
}

function $isNumeric(part){
  var i;
  if (part.count <= 0) {
    return false;
  }
  i = $indexOf('MLydhHmsSDkK', fromCodePoint($charAt_0(part.text_0, 0)));
  return i > 1 || i >= 0 && part.count < 3;
}

function $matchString(text_0, start_0, data_0, pos){
  var bestMatch, bestMatchLength, count, i, length_0, textInLowerCase;
  count = data_0.length;
  bestMatchLength = 0;
  bestMatch = -1;
  textInLowerCase = $toLowerCase((checkCriticalStringElementIndex(start_0, text_0.length + 1) , text_0.substr(start_0)), ($clinit_Locale() , ROOT));
  for (i = 0; i < count; ++i) {
    length_0 = data_0[i].length;
    if (length_0 > bestMatchLength && $startsWith(textInLowerCase, $toLowerCase(data_0[i], ROOT))) {
      bestMatch = i;
      bestMatchLength = length_0;
    }
  }
  bestMatch >= 0 && (pos[0] = start_0 + bestMatchLength);
  return bestMatch;
}

function $parse(this$static, text_0, date){
  var abutPass, abutPat, abutStart, cal, count, i, parsePos, part, s;
  cal = new DateRecord;
  parsePos = stampJavaTypeInfo(getClassLiteralForArray(I_classLit, 1), $intern_1, 11, 15, [0]);
  abutPat = -1;
  abutStart = 0;
  abutPass = 0;
  for (i = 0; i < this$static.patternParts.array.length; ++i) {
    part = castTo($get(this$static.patternParts, i), 14);
    if (part.count > 0) {
      if (abutPat < 0 && part.abutStart) {
        abutPat = i;
        abutStart = parsePos[0];
        abutPass = 0;
      }
      if (abutPat >= 0) {
        count = part.count;
        if (i == abutPat) {
          count -= abutPass++;
          if (count == 0) {
            return 0;
          }
        }
        if (!$subParse(this$static, text_0, parsePos, part, count, cal)) {
          i = abutPat - 1;
          parsePos[0] = abutStart;
          continue;
        }
      }
       else {
        abutPat = -1;
        if (!$subParse(this$static, text_0, parsePos, part, 0, cal)) {
          return 0;
        }
      }
    }
     else {
      abutPat = -1;
      if ($charAt_0(part.text_0, 0) == 32) {
        s = parsePos[0];
        $skipSpace(text_0, parsePos);
        if (parsePos[0] > s) {
          continue;
        }
      }
       else if ($startsWith_0(text_0, part.text_0, parsePos[0])) {
        parsePos[0] += part.text_0.length;
        continue;
      }
      return 0;
    }
  }
  if (!$calcDate(cal, date)) {
    return 0;
  }
  return parsePos[0];
}

function $parse_0(this$static, text_0){
  var charsConsumed, curDate, date;
  curDate = new Date_0;
  date = new Date_1(curDate.jsdate.getFullYear() - $intern_3, curDate.jsdate.getMonth(), curDate.jsdate.getDate());
  charsConsumed = $parse(this$static, text_0, date);
  if (charsConsumed == 0 || charsConsumed < text_0.length) {
    throw toJs(new IllegalArgumentException_0(text_0));
  }
  return date;
}

function $parseInt(text_0, pos){
  var ch_0, ind, ret;
  ret = 0;
  ind = pos[0];
  if (ind >= text_0.length) {
    return -1;
  }
  ch_0 = (checkCriticalStringElementIndex(ind, text_0.length) , text_0.charCodeAt(ind));
  while (ch_0 >= 48 && ch_0 <= 57) {
    ret = ret * 10 + (ch_0 - 48);
    ++ind;
    if (ind >= text_0.length) {
      break;
    }
    ch_0 = (checkCriticalStringElementIndex(ind, text_0.length) , text_0.charCodeAt(ind));
  }
  ind > pos[0]?(pos[0] = ind):(ret = -1);
  return ret;
}

function $parsePattern(this$static, pattern){
  var buf, ch_0, count, i, inQuote;
  buf = new StringBuilder_0;
  inQuote = false;
  for (i = 0; i < pattern.length; i++) {
    ch_0 = (checkCriticalStringElementIndex(i, pattern.length) , pattern.charCodeAt(i));
    if (ch_0 == 32) {
      $addPart(this$static, buf, 0);
      buf.string += ' ';
      $addPart(this$static, buf, 0);
      while (i + 1 < pattern.length && (checkCriticalStringElementIndex(i + 1, pattern.length) , pattern.charCodeAt(i + 1) == 32)) {
        ++i;
      }
      continue;
    }
    if (inQuote) {
      if (ch_0 == 39) {
        if (i + 1 < pattern.length && (checkCriticalStringElementIndex(i + 1, pattern.length) , pattern.charCodeAt(i + 1) == 39)) {
          buf.string += String.fromCharCode(ch_0);
          ++i;
        }
         else {
          inQuote = false;
        }
      }
       else {
        buf.string += String.fromCharCode(ch_0);
      }
      continue;
    }
    if ($indexOf('GyMLdkHmsSEcDahKzZv', fromCodePoint(ch_0)) > 0) {
      $addPart(this$static, buf, 0);
      buf.string += String.fromCharCode(ch_0);
      count = $getNextCharCountInPattern(pattern, i);
      $addPart(this$static, buf, count);
      i += count - 1;
      continue;
    }
    if (ch_0 == 39) {
      if (i + 1 < pattern.length && (checkCriticalStringElementIndex(i + 1, pattern.length) , pattern.charCodeAt(i + 1) == 39)) {
        buf.string += "'";
        ++i;
      }
       else {
        inQuote = true;
      }
    }
     else {
      buf.string += String.fromCharCode(ch_0);
    }
  }
  $addPart(this$static, buf, 0);
  $identifyAbutStart(this$static);
}

function $parseTimeZoneOffset(text_0, pos, cal){
  var offset, sign, st, value_0;
  if (pos[0] >= text_0.length) {
    cal.tzOffset = 0;
    return true;
  }
  switch ($charAt_0(text_0, pos[0])) {
    case 43:
      sign = 1;
      break;
    case 45:
      sign = -1;
      break;
    default:cal.tzOffset = 0;
      return true;
  }
  ++pos[0];
  st = pos[0];
  value_0 = $parseInt(text_0, pos);
  if (value_0 == 0 && pos[0] == st) {
    return false;
  }
  if (pos[0] < text_0.length && $charAt_0(text_0, pos[0]) == 58) {
    offset = value_0 * 60;
    ++pos[0];
    st = pos[0];
    value_0 = $parseInt(text_0, pos);
    if (value_0 == 0 && pos[0] == st) {
      return false;
    }
    offset += value_0;
  }
   else {
    offset = value_0;
    offset < 24 && pos[0] - st <= 2?(offset *= 60):(offset = offset % 100 + (offset / 100 | 0) * 60);
  }
  offset *= sign;
  cal.tzOffset = -offset;
  return true;
}

function $skipSpace(text_0, pos){
  while (pos[0] < text_0.length && $indexOf(' \t\r\n', fromCodePoint($charAt_0(text_0, pos[0]))) >= 0) {
    ++pos[0];
  }
}

function $subFormat(this$static, buf, ch_0, count, adjustedDate, adjustedTime, timezone){
  var value_0, value0, value1, value10, value2, value3, value4, value5, value6, value7, value8, value9;
  switch (ch_0) {
    case 71:
      value0 = adjustedDate.jsdate.getFullYear() - $intern_3 >= -1900?1:0;
      count >= 4?$append_1(buf, this$static.dateTimeFormatInfo.erasFull()[value0]):$append_1(buf, this$static.dateTimeFormatInfo.erasShort()[value0]);
      break;
    case 121:
      $formatYear(buf, count, adjustedDate);
      break;
    case 77:
      $formatMonth(this$static, buf, count, adjustedDate);
      break;
    case 107:
      value1 = adjustedTime.jsdate.getHours();
      value1 == 0?$zeroPaddingNumber(buf, 24, count):$zeroPaddingNumber(buf, value1, count);
      break;
    case 83:
      $formatFractionalSeconds(buf, count, adjustedTime);
      break;
    case 69:
      value2 = adjustedDate.jsdate.getDay();
      count == 5?$append_1(buf, this$static.dateTimeFormatInfo.weekdaysNarrow()[value2]):count == 4?$append_1(buf, this$static.dateTimeFormatInfo.weekdaysFull()[value2]):$append_1(buf, this$static.dateTimeFormatInfo.weekdaysShort()[value2]);
      break;
    case 97:
      adjustedTime.jsdate.getHours() >= 12 && adjustedTime.jsdate.getHours() < 24?$append_1(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['AM', 'PM'])[1]):$append_1(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['AM', 'PM'])[0]);
      break;
    case 104:
      value3 = adjustedTime.jsdate.getHours() % 12;
      value3 == 0?$zeroPaddingNumber(buf, 12, count):$zeroPaddingNumber(buf, value3, count);
      break;
    case 75:
      value4 = adjustedTime.jsdate.getHours() % 12;
      $zeroPaddingNumber(buf, value4, count);
      break;
    case 72:
      value5 = adjustedTime.jsdate.getHours();
      $zeroPaddingNumber(buf, value5, count);
      break;
    case 99:
      value6 = adjustedDate.jsdate.getDay();
      count == 5?$append_1(buf, this$static.dateTimeFormatInfo.weekdaysNarrow()[value6]):count == 4?$append_1(buf, this$static.dateTimeFormatInfo.weekdaysFull()[value6]):count == 3?$append_1(buf, this$static.dateTimeFormatInfo.weekdaysShortStandalone()[value6]):$zeroPaddingNumber(buf, value6, 1);
      break;
    case 76:
      value7 = adjustedDate.jsdate.getMonth();
      count == 5?$append_1(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['J', 'F', 'M', 'A', 'M', 'J', 'J', 'A', 'S', 'O', 'N', 'D'])[value7]):count == 4?$append_1(buf, this$static.dateTimeFormatInfo.monthsFull()[value7]):count == 3?$append_1(buf, this$static.dateTimeFormatInfo.monthsShortStandalone()[value7]):$zeroPaddingNumber(buf, value7 + 1, count);
      break;
    case 81:
      value8 = adjustedDate.jsdate.getMonth() / 3 | 0;
      count < 4?$append_1(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Q1', 'Q2', 'Q3', 'Q4'])[value8]):$append_1(buf, this$static.dateTimeFormatInfo.quartersFull()[value8]);
      break;
    case 100:
      value9 = adjustedDate.jsdate.getDate();
      $zeroPaddingNumber(buf, value9, count);
      break;
    case 109:
      value10 = adjustedTime.jsdate.getMinutes();
      $zeroPaddingNumber(buf, value10, count);
      break;
    case 115:
      value_0 = adjustedTime.jsdate.getSeconds();
      $zeroPaddingNumber(buf, value_0, count);
      break;
    case 122:
      count < 4?$append_1(buf, timezone.tzNames[0]):$append_1(buf, timezone.tzNames[1]);
      break;
    case 118:
      $append_1(buf, timezone.timezoneID);
      break;
    case 90:
      count < 3?$append_1(buf, $getRFCTimeZoneString(timezone)):count == 3?$append_1(buf, $getISOTimeZoneString(timezone)):$append_1(buf, composeGMTString(timezone.standardOffset));
      break;
    default:return false;
  }
  return true;
}

function $subParse(this$static, text_0, pos, part, digitCount, cal){
  var ch_0, start_0, value_0;
  $skipSpace(text_0, pos);
  start_0 = pos[0];
  ch_0 = $charAt_0(part.text_0, 0);
  value_0 = -1;
  if ($isNumeric(part)) {
    if (digitCount > 0) {
      if (start_0 + digitCount > text_0.length) {
        return false;
      }
      value_0 = $parseInt((checkCriticalStringBounds(0, start_0 + digitCount, text_0.length) , text_0.substr(0, start_0 + digitCount)), pos);
    }
     else {
      value_0 = $parseInt(text_0, pos);
    }
  }
  switch (ch_0) {
    case 71:
      value_0 = $matchString(text_0, start_0, this$static.dateTimeFormatInfo.erasFull(), pos);
      cal.era = value_0;
      return true;
    case 77:
      return $subParseMonth(this$static, text_0, pos, cal, value_0, start_0);
    case 76:
      return $subParseStandaloneMonth(this$static, text_0, pos, cal, value_0, start_0);
    case 69:
      return $subParseDayOfWeek(this$static, text_0, pos, start_0, cal);
    case 99:
      return $subParseStandaloneDay(this$static, text_0, pos, start_0, cal);
    case 97:
      value_0 = $matchString(text_0, start_0, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['AM', 'PM']), pos);
      cal.ampm = value_0;
      return true;
    case 121:
      return $subParseYear(text_0, pos, start_0, value_0, part, cal);
    case 100:
      if (value_0 <= 0) {
        return false;
      }

      cal.dayOfMonth = value_0;
      return true;
    case 83:
      if (value_0 < 0) {
        return false;
      }

      return $subParseFractionalSeconds(value_0, start_0, pos[0], cal);
    case 104:
      value_0 == 12 && (value_0 = 0);
    case 75:
    case 72:
      if (value_0 < 0) {
        return false;
      }

      cal.hours = value_0;
      cal.midnightIs24 = false;
      return true;
    case 107:
      if (value_0 < 0) {
        return false;
      }

      cal.hours = value_0;
      cal.midnightIs24 = true;
      return true;
    case 109:
      if (value_0 < 0) {
        return false;
      }

      cal.minutes = value_0;
      return true;
    case 115:
      if (value_0 < 0) {
        return false;
      }

      cal.seconds = value_0;
      return true;
    case 90:
      if (start_0 < text_0.length && (checkCriticalStringElementIndex(start_0, text_0.length) , text_0.charCodeAt(start_0) == 90)) {
        ++pos[0];
        cal.tzOffset = 0;
        return true;
      }

    case 122:
    case 118:
      return $subParseTimeZoneInGMT(text_0, start_0, pos, cal);
    default:return false;
  }
}

function $subParseDayOfWeek(this$static, text_0, pos, start_0, cal){
  var value_0;
  value_0 = $matchString(text_0, start_0, this$static.dateTimeFormatInfo.weekdaysFull(), pos);
  value_0 < 0 && (value_0 = $matchString(text_0, start_0, this$static.dateTimeFormatInfo.weekdaysShort(), pos));
  if (value_0 < 0) {
    return false;
  }
  cal.dayOfWeek = value_0;
  return true;
}

function $subParseFractionalSeconds(value_0, start_0, end, cal){
  var a, i;
  i = end - start_0;
  if (i < 3) {
    while (i < 3) {
      value_0 *= 10;
      ++i;
    }
  }
   else {
    a = 1;
    while (i > 3) {
      a *= 10;
      --i;
    }
    value_0 = (value_0 + (a >> 1)) / a | 0;
  }
  cal.milliseconds = value_0;
  return true;
}

function $subParseMonth(this$static, text_0, pos, cal, value_0, start_0){
  if (value_0 < 0) {
    value_0 = $matchString(text_0, start_0, this$static.dateTimeFormatInfo.monthsFull(), pos);
    value_0 < 0 && (value_0 = $matchString(text_0, start_0, this$static.dateTimeFormatInfo.monthsShort(), pos));
    if (value_0 < 0) {
      return false;
    }
    cal.month = value_0;
    return true;
  }
   else if (value_0 > 0) {
    cal.month = value_0 - 1;
    return true;
  }
  return false;
}

function $subParseStandaloneDay(this$static, text_0, pos, start_0, cal){
  var value_0;
  value_0 = $matchString(text_0, start_0, this$static.dateTimeFormatInfo.weekdaysFull(), pos);
  value_0 < 0 && (value_0 = $matchString(text_0, start_0, this$static.dateTimeFormatInfo.weekdaysShortStandalone(), pos));
  if (value_0 < 0) {
    return false;
  }
  cal.dayOfWeek = value_0;
  return true;
}

function $subParseStandaloneMonth(this$static, text_0, pos, cal, value_0, start_0){
  if (value_0 < 0) {
    value_0 = $matchString(text_0, start_0, this$static.dateTimeFormatInfo.monthsFull(), pos);
    value_0 < 0 && (value_0 = $matchString(text_0, start_0, this$static.dateTimeFormatInfo.monthsShortStandalone(), pos));
    if (value_0 < 0) {
      return false;
    }
    cal.month = value_0;
    return true;
  }
   else if (value_0 > 0) {
    cal.month = value_0 - 1;
    return true;
  }
  return false;
}

function $subParseTimeZoneInGMT(text_0, start_0, pos, cal){
  if (start_0 >= 0 && $equals(text_0.substr(start_0, 'GMT'.length), 'GMT')) {
    pos[0] = start_0 + 3;
    return $parseTimeZoneOffset(text_0, pos, cal);
  }
  if (start_0 >= 0 && $equals(text_0.substr(start_0, 'UTC'.length), 'UTC')) {
    pos[0] = start_0 + 3;
    return $parseTimeZoneOffset(text_0, pos, cal);
  }
  return $parseTimeZoneOffset(text_0, pos, cal);
}

function $subParseYear(text_0, pos, start_0, value_0, part, cal){
  var ambiguousTwoDigitYear, ch_0, date, defaultCenturyStartYear;
  ch_0 = 32;
  if (value_0 < 0) {
    if (pos[0] >= text_0.length) {
      return false;
    }
    ch_0 = $charAt_0(text_0, pos[0]);
    if (ch_0 != 43 && ch_0 != 45) {
      return false;
    }
    ++pos[0];
    value_0 = $parseInt(text_0, pos);
    if (value_0 < 0) {
      return false;
    }
    ch_0 == 45 && (value_0 = -value_0);
  }
  if (ch_0 == 32 && pos[0] - start_0 == 2 && part.count == 2) {
    date = new Date_0;
    defaultCenturyStartYear = date.jsdate.getFullYear() - $intern_3 + $intern_3 - 80;
    ambiguousTwoDigitYear = defaultCenturyStartYear % 100;
    cal.ambiguousYear = value_0 == ambiguousTwoDigitYear;
    value_0 += (defaultCenturyStartYear / 100 | 0) * 100 + (value_0 < ambiguousTwoDigitYear?100:0);
  }
  cal.year = value_0;
  return true;
}

function $zeroPaddingNumber(buf, value_0, minWidth){
  var b, i;
  b = 10;
  for (i = 0; i < minWidth - 1; i++) {
    value_0 < b && (buf.string += '0' , buf);
    b *= 10;
  }
  buf.string += value_0;
}

defineClass(50, 1, {});
var Lcom_google_gwt_i18n_shared_DateTimeFormat_2_classLit = createForClass('com.google.gwt.i18n.shared', 'DateTimeFormat', 50);
function $clinit_DateTimeFormat_0(){
  $clinit_DateTimeFormat_0 = emptyMethod;
  $clinit_DateTimeFormat();
  cache = new HashMap;
}

function DateTimeFormat(pattern, dtfi){
  $clinit_DateTimeFormat();
  this.patternParts = new ArrayList;
  this.pattern = pattern;
  this.dateTimeFormatInfo = dtfi;
  $parsePattern(this, pattern);
}

function getFormat(predef){
  $clinit_DateTimeFormat_0();
  var dtfi, pattern, pattern0;
  if (usesFixedEnglishStrings(predef)) {
    switch (predef.ordinal) {
      case 1:
        pattern0 = 'EEE, d MMM yyyy HH:mm:ss Z';
        break;
      case 0:
        pattern0 = "yyyy-MM-dd'T'HH:mm:ss.SSSZZZ";
        break;
      default:throw toJs(new IllegalStateException('Unexpected predef type ' + predef));
    }
    return getFormat_0(pattern0, new DateTimeFormatInfoImpl_en);
  }
  dtfi = $getDateTimeFormatInfo(($clinit_LocaleInfo() , $clinit_LocaleInfo() , instance));
  switch (predef.ordinal) {
    case 2:
      pattern = 'EEEE, d. MMMM y';
      break;
    case 30:
    case 3:
      pattern = 'd. MMMM y';
      break;
    case 4:
      pattern = 'dd.MM.y';
      break;
    case 5:
      pattern = 'dd.MM.yy';
      break;
    case 10:
      pattern = "EEEE, d. MMMM y 'um' HH:mm:ss zzzz";
      break;
    case 11:
      pattern = "d. MMMM y 'um' HH:mm:ss z";
      break;
    case 12:
      pattern = 'dd.MM.y, HH:mm:ss';
      break;
    case 13:
      pattern = 'dd.MM.yy, HH:mm';
      break;
    case 14:
      pattern = 'd';
      break;
    case 9:
    case 17:
      pattern = 'HH:mm';
      break;
    case 8:
    case 18:
      pattern = 'HH:mm:ss';
      break;
    case 15:
      pattern = 'h:mm a';
      break;
    case 16:
      pattern = 'h:mm:ss a';
      break;
    case 19:
      pattern = 'mm:ss';
      break;
    case 20:
      pattern = 'LLLL';
      break;
    case 21:
      pattern = 'LLL';
      break;
    case 22:
      pattern = 'd. MMM';
      break;
    case 23:
      pattern = 'd. MMMM';
      break;
    case 24:
      pattern = 'd.M.';
      break;
    case 25:
      pattern = 'EEEE, d. MMMM';
      break;
    case 6:
      pattern = 'HH:mm:ss zzzz';
      break;
    case 7:
      pattern = 'HH:mm:ss z';
      break;
    case 26:
      pattern = 'y';
      break;
    case 27:
      pattern = 'MMMM y';
      break;
    case 28:
      pattern = 'MMM y';
      break;
    case 29:
      pattern = 'd. MMM y';
      break;
    case 31:
      pattern = 'M.y';
      break;
    case 32:
      pattern = 'd.M.y';
      break;
    case 33:
      pattern = 'EEE, d. MMM y';
      break;
    case 34:
      pattern = 'QQQQ y';
      break;
    case 35:
      pattern = 'Q y';
      break;
    default:throw toJs(new IllegalArgumentException_0('Unexpected predefined format ' + predef));
  }
  return getFormat_0(pattern, dtfi);
}

function getFormat_0(pattern, dtfi){
  $clinit_DateTimeFormat_0();
  var defaultDtfi, dtf;
  defaultDtfi = $getDateTimeFormatInfo(($clinit_LocaleInfo() , $clinit_LocaleInfo() , instance));
  dtf = null;
  dtfi == defaultDtfi && (dtf = castTo($getStringValue(cache, pattern), 25));
  if (!dtf) {
    dtf = new DateTimeFormat(pattern, dtfi);
    dtfi == defaultDtfi && $putStringValue(cache, pattern, dtf);
  }
  return dtf;
}

function usesFixedEnglishStrings(predef){
  switch (predef.ordinal) {
    case 0:
    case 1:
      return true;
    default:return false;
  }
}

defineClass(25, 50, {25:1}, DateTimeFormat);
var cache;
var Lcom_google_gwt_i18n_client_DateTimeFormat_2_classLit = createForClass('com.google.gwt.i18n.client', 'DateTimeFormat', 25);
defineClass(37, 1, $intern_4);
_.hashCode_0 = function hashCode_1(){
  return getObjectIdentityHashCode(this);
}
;
_.toString_0 = function toString_2(){
  return this.name_0 != null?this.name_0:'' + this.ordinal;
}
;
_.ordinal = 0;
var Ljava_lang_Enum_2_classLit = createForClass('java.lang', 'Enum', 37);
function $clinit_DateTimeFormat$PredefinedFormat(){
  $clinit_DateTimeFormat$PredefinedFormat = emptyMethod;
  ISO_8601 = new DateTimeFormat$PredefinedFormat('ISO_8601', 0);
  RFC_2822 = new DateTimeFormat$PredefinedFormat('RFC_2822', 1);
  DATE_FULL = new DateTimeFormat$PredefinedFormat('DATE_FULL', 2);
  DATE_LONG = new DateTimeFormat$PredefinedFormat('DATE_LONG', 3);
  DATE_MEDIUM = new DateTimeFormat$PredefinedFormat('DATE_MEDIUM', 4);
  DATE_SHORT = new DateTimeFormat$PredefinedFormat('DATE_SHORT', 5);
  TIME_FULL = new DateTimeFormat$PredefinedFormat('TIME_FULL', 6);
  TIME_LONG = new DateTimeFormat$PredefinedFormat('TIME_LONG', 7);
  TIME_MEDIUM = new DateTimeFormat$PredefinedFormat('TIME_MEDIUM', 8);
  TIME_SHORT = new DateTimeFormat$PredefinedFormat('TIME_SHORT', 9);
  DATE_TIME_FULL = new DateTimeFormat$PredefinedFormat('DATE_TIME_FULL', 10);
  DATE_TIME_LONG = new DateTimeFormat$PredefinedFormat('DATE_TIME_LONG', 11);
  DATE_TIME_MEDIUM = new DateTimeFormat$PredefinedFormat('DATE_TIME_MEDIUM', 12);
  DATE_TIME_SHORT = new DateTimeFormat$PredefinedFormat('DATE_TIME_SHORT', 13);
  DAY = new DateTimeFormat$PredefinedFormat('DAY', 14);
  HOUR_MINUTE = new DateTimeFormat$PredefinedFormat('HOUR_MINUTE', 15);
  HOUR_MINUTE_SECOND = new DateTimeFormat$PredefinedFormat('HOUR_MINUTE_SECOND', 16);
  HOUR24_MINUTE = new DateTimeFormat$PredefinedFormat('HOUR24_MINUTE', 17);
  HOUR24_MINUTE_SECOND = new DateTimeFormat$PredefinedFormat('HOUR24_MINUTE_SECOND', 18);
  MINUTE_SECOND = new DateTimeFormat$PredefinedFormat('MINUTE_SECOND', 19);
  MONTH = new DateTimeFormat$PredefinedFormat('MONTH', 20);
  MONTH_ABBR = new DateTimeFormat$PredefinedFormat('MONTH_ABBR', 21);
  MONTH_ABBR_DAY = new DateTimeFormat$PredefinedFormat('MONTH_ABBR_DAY', 22);
  MONTH_DAY = new DateTimeFormat$PredefinedFormat('MONTH_DAY', 23);
  MONTH_NUM_DAY = new DateTimeFormat$PredefinedFormat('MONTH_NUM_DAY', 24);
  MONTH_WEEKDAY_DAY = new DateTimeFormat$PredefinedFormat('MONTH_WEEKDAY_DAY', 25);
  YEAR = new DateTimeFormat$PredefinedFormat('YEAR', 26);
  YEAR_MONTH = new DateTimeFormat$PredefinedFormat('YEAR_MONTH', 27);
  YEAR_MONTH_ABBR = new DateTimeFormat$PredefinedFormat('YEAR_MONTH_ABBR', 28);
  YEAR_MONTH_ABBR_DAY = new DateTimeFormat$PredefinedFormat('YEAR_MONTH_ABBR_DAY', 29);
  YEAR_MONTH_DAY = new DateTimeFormat$PredefinedFormat('YEAR_MONTH_DAY', 30);
  YEAR_MONTH_NUM = new DateTimeFormat$PredefinedFormat('YEAR_MONTH_NUM', 31);
  YEAR_MONTH_NUM_DAY = new DateTimeFormat$PredefinedFormat('YEAR_MONTH_NUM_DAY', 32);
  YEAR_MONTH_WEEKDAY_DAY = new DateTimeFormat$PredefinedFormat('YEAR_MONTH_WEEKDAY_DAY', 33);
  YEAR_QUARTER = new DateTimeFormat$PredefinedFormat('YEAR_QUARTER', 34);
  YEAR_QUARTER_ABBR = new DateTimeFormat$PredefinedFormat('YEAR_QUARTER_ABBR', 35);
}

function DateTimeFormat$PredefinedFormat(enum$name, enum$ordinal){
  this.name_0 = enum$name;
  this.ordinal = enum$ordinal;
}

function values(){
  $clinit_DateTimeFormat$PredefinedFormat();
  return stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_i18n_client_DateTimeFormat$PredefinedFormat_2_classLit, 1), $intern_1, 4, 0, [ISO_8601, RFC_2822, DATE_FULL, DATE_LONG, DATE_MEDIUM, DATE_SHORT, TIME_FULL, TIME_LONG, TIME_MEDIUM, TIME_SHORT, DATE_TIME_FULL, DATE_TIME_LONG, DATE_TIME_MEDIUM, DATE_TIME_SHORT, DAY, HOUR_MINUTE, HOUR_MINUTE_SECOND, HOUR24_MINUTE, HOUR24_MINUTE_SECOND, MINUTE_SECOND, MONTH, MONTH_ABBR, MONTH_ABBR_DAY, MONTH_DAY, MONTH_NUM_DAY, MONTH_WEEKDAY_DAY, YEAR, YEAR_MONTH, YEAR_MONTH_ABBR, YEAR_MONTH_ABBR_DAY, YEAR_MONTH_DAY, YEAR_MONTH_NUM, YEAR_MONTH_NUM_DAY, YEAR_MONTH_WEEKDAY_DAY, YEAR_QUARTER, YEAR_QUARTER_ABBR]);
}

defineClass(4, 37, $intern_4, DateTimeFormat$PredefinedFormat);
var DATE_FULL, DATE_LONG, DATE_MEDIUM, DATE_SHORT, DATE_TIME_FULL, DATE_TIME_LONG, DATE_TIME_MEDIUM, DATE_TIME_SHORT, DAY, HOUR24_MINUTE, HOUR24_MINUTE_SECOND, HOUR_MINUTE, HOUR_MINUTE_SECOND, ISO_8601, MINUTE_SECOND, MONTH, MONTH_ABBR, MONTH_ABBR_DAY, MONTH_DAY, MONTH_NUM_DAY, MONTH_WEEKDAY_DAY, RFC_2822, TIME_FULL, TIME_LONG, TIME_MEDIUM, TIME_SHORT, YEAR, YEAR_MONTH, YEAR_MONTH_ABBR, YEAR_MONTH_ABBR_DAY, YEAR_MONTH_DAY, YEAR_MONTH_NUM, YEAR_MONTH_NUM_DAY, YEAR_MONTH_WEEKDAY_DAY, YEAR_QUARTER, YEAR_QUARTER_ABBR;
var Lcom_google_gwt_i18n_client_DateTimeFormat$PredefinedFormat_2_classLit = createForEnum('com.google.gwt.i18n.client', 'DateTimeFormat/PredefinedFormat', 4, values);
defineClass(89, 1, {});
_.erasFull = function erasFull(){
  return stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Before Christ', 'Anno Domini']);
}
;
_.erasShort = function erasShort(){
  return stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['BC', 'AD']);
}
;
_.monthsFull = function monthsFull(){
  return stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December']);
}
;
_.monthsShort = function monthsShort(){
  return stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']);
}
;
_.monthsShortStandalone = function monthsShortStandalone(){
  return this.monthsShort();
}
;
_.quartersFull = function quartersFull(){
  return stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['1st quarter', '2nd quarter', '3rd quarter', '4th quarter']);
}
;
_.weekdaysFull = function weekdaysFull(){
  return stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']);
}
;
_.weekdaysNarrow = function weekdaysNarrow(){
  return stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['S', 'M', 'T', 'W', 'T', 'F', 'S']);
}
;
_.weekdaysShort = function weekdaysShort(){
  return stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']);
}
;
_.weekdaysShortStandalone = function weekdaysShortStandalone(){
  return this.weekdaysShort();
}
;
var Lcom_google_gwt_i18n_shared_DefaultDateTimeFormatInfo_2_classLit = createForClass('com.google.gwt.i18n.shared', 'DefaultDateTimeFormatInfo', 89);
defineClass(90, 89, {});
var Lcom_google_gwt_i18n_client_DefaultDateTimeFormatInfo_2_classLit = createForClass('com.google.gwt.i18n.client', 'DefaultDateTimeFormatInfo', 90);
function $clinit_LocaleInfo(){
  $clinit_LocaleInfo = emptyMethod;
  instance = new LocaleInfo;
}

function $getDateTimeFormatInfo(this$static){
  !this$static.dateTimeFormatInfo && (this$static.dateTimeFormatInfo = new DateTimeFormatInfoImpl_de);
  return this$static.dateTimeFormatInfo;
}

function $getNumberConstants(this$static){
  !this$static.numberConstants && (this$static.numberConstants = new NumberConstantsImpl_de);
  return this$static.numberConstants;
}

function LocaleInfo(){
}

defineClass(55, 1, {}, LocaleInfo);
var instance;
var Lcom_google_gwt_i18n_client_LocaleInfo_2_classLit = createForClass('com.google.gwt.i18n.client', 'LocaleInfo', 55);
function $clinit_NumberFormat(){
  $clinit_NumberFormat = emptyMethod;
  $getNumberConstants(($clinit_LocaleInfo() , $clinit_LocaleInfo() , instance));
}

function $addExponent(this$static, digits){
  var exponentDigits, i;
  digits.string += 'E';
  if (this$static.exponent < 0) {
    this$static.exponent = -this$static.exponent;
    digits.string += '-';
  }
  exponentDigits = '' + this$static.exponent;
  for (i = exponentDigits.length; i < this$static.minExponentDigits; ++i) {
    digits.string += '0';
  }
  digits.string += exponentDigits;
}

function $addZeroAndDecimal(this$static, digits, decimalSeparator){
  if (this$static.digitsLength == 0) {
    $insert(digits, 0, String.fromCharCode(48));
    ++this$static.decimalPosition;
    ++this$static.digitsLength;
  }
  if (this$static.decimalPosition < this$static.digitsLength || this$static.decimalSeparatorAlwaysShown) {
    $insert(digits, this$static.decimalPosition, String.fromCharCode(decimalSeparator));
    ++this$static.digitsLength;
  }
}

function $adjustFractionDigits(this$static, digits){
  var requiredDigits, toRemove;
  requiredDigits = this$static.decimalPosition + this$static.minimumFractionDigits;
  if (this$static.digitsLength < requiredDigits) {
    while (this$static.digitsLength < requiredDigits) {
      digits.string += '0';
      ++this$static.digitsLength;
    }
  }
   else {
    toRemove = this$static.decimalPosition + this$static.maximumFractionDigits;
    toRemove > this$static.digitsLength && (toRemove = this$static.digitsLength);
    while (toRemove > requiredDigits && $charAt_0(digits.string, toRemove - 1) == 48) {
      --toRemove;
    }
    if (toRemove < this$static.digitsLength) {
      $delete(digits, toRemove, this$static.digitsLength);
      this$static.digitsLength = toRemove;
    }
  }
}

function $computeExponent(this$static, digits){
  var remainder, strip;
  strip = 0;
  while (strip < this$static.digitsLength - 1 && $charAt_0(digits.string, strip) == 48) {
    ++strip;
  }
  if (strip > 0) {
    $replace0(digits, 0, strip, '');
    this$static.digitsLength -= strip;
    this$static.exponent -= strip;
  }
  if (this$static.maximumIntegerDigits > this$static.minimumIntegerDigits && this$static.maximumIntegerDigits > 0) {
    this$static.exponent += this$static.decimalPosition - 1;
    remainder = this$static.exponent % this$static.maximumIntegerDigits;
    remainder < 0 && (remainder += this$static.maximumIntegerDigits);
    this$static.decimalPosition = remainder + 1;
    this$static.exponent -= remainder;
  }
   else {
    this$static.exponent += this$static.decimalPosition - this$static.minimumIntegerDigits;
    this$static.decimalPosition = this$static.minimumIntegerDigits;
  }
  if (this$static.digitsLength == 1 && $charAt_0(digits.string, 0) == 48) {
    this$static.exponent = 0;
    this$static.decimalPosition = this$static.minimumIntegerDigits;
  }
}

function $format_0(this$static, number){
  var buf, isNegative, preRound, scale;
  if (isNaN(number)) {
    return 'NaN';
  }
  isNegative = number < 0 || number == 0 && 1 / number < 0;
  isNegative && (number = -number);
  buf = new StringBuilder;
  if (!isNaN(number) && !isFinite(number)) {
    $append_1(buf, isNegative?this$static.negativePrefix:this$static.positivePrefix);
    buf.string += '\u221E';
    $append_1(buf, isNegative?this$static.negativeSuffix:this$static.positiveSuffix);
    return buf.string;
  }
  number *= this$static.multiplier;
  scale = toScaledString(buf, number);
  preRound = buf.string.length + scale + this$static.maximumFractionDigits + 3;
  if (preRound > 0 && preRound < buf.string.length && $charAt_0(buf.string, preRound) == 57) {
    $propagateCarry(this$static, buf, preRound - 1);
    scale += buf.string.length - preRound;
    $delete(buf, preRound, buf.string.length);
  }
  $format_1(this$static, isNegative, buf, scale);
  return buf.string;
}

function $format_1(this$static, isNegative, digits, scale){
  var currentGroupingSize, decimalSeparator, groupingSeparator, useExponent, zeroChar;
  if (this$static.isCurrencyFormat) {
    decimalSeparator = (checkCriticalStringElementIndex(0, ','.length) , ','.charCodeAt(0));
    groupingSeparator = (checkCriticalStringElementIndex(0, '.'.length) , '.'.charCodeAt(0));
  }
   else {
    decimalSeparator = (checkCriticalStringElementIndex(0, ','.length) , ','.charCodeAt(0));
    groupingSeparator = (checkCriticalStringElementIndex(0, '.'.length) , '.'.charCodeAt(0));
  }
  this$static.exponent = 0;
  this$static.digitsLength = digits.string.length;
  this$static.decimalPosition = this$static.digitsLength + scale;
  useExponent = this$static.useExponentialNotation;
  currentGroupingSize = this$static.groupingSize;
  this$static.decimalPosition > 1024 && (useExponent = true);
  useExponent && $computeExponent(this$static, digits);
  $processLeadingZeros(this$static, digits);
  $roundValue(this$static, digits);
  $insertGroupingSeparators(this$static, digits, groupingSeparator, currentGroupingSize);
  $adjustFractionDigits(this$static, digits);
  $addZeroAndDecimal(this$static, digits, decimalSeparator);
  useExponent && $addExponent(this$static, digits);
  zeroChar = (checkCriticalStringElementIndex(0, '0'.length) , '0'.charCodeAt(0));
  zeroChar != 48 && $localizeDigits(digits, zeroChar);
  $insert(digits, 0, isNegative?this$static.negativePrefix:this$static.positivePrefix);
  $append_1(digits, isNegative?this$static.negativeSuffix:this$static.positiveSuffix);
}

function $getDigit(ch_0){
  var zeroChar;
  if (48 <= ch_0 && ch_0 <= 57) {
    return ch_0 - 48;
  }
   else {
    zeroChar = (checkCriticalStringElementIndex(0, '0'.length) , '0'.charCodeAt(0));
    return zeroChar <= ch_0 && ch_0 <= zeroChar + 9?ch_0 - zeroChar:-1;
  }
}

function $insertGroupingSeparators(this$static, digits, groupingSeparator, g){
  var i;
  if (g > 0) {
    for (i = g; i < this$static.decimalPosition; i += g + 1) {
      $insert(digits, this$static.decimalPosition - i, String.fromCharCode(groupingSeparator));
      ++this$static.decimalPosition;
      ++this$static.digitsLength;
    }
  }
}

function $localizeDigits(digits, zero){
  var ch_0, i, n;
  n = digits.string.length;
  for (i = 0; i < n; ++i) {
    ch_0 = $charAt_0(digits.string, i);
    ch_0 >= 48 && ch_0 <= 57 && $setCharAt(digits, i, ch_0 - 48 + zero & $intern_2);
  }
}

function $parse_1(this$static, text_0){
  var pos, result;
  pos = stampJavaTypeInfo(getClassLiteralForArray(I_classLit, 1), $intern_1, 11, 15, [0]);
  result = $parse_2(this$static, text_0, pos);
  if (pos[0] == 0 || pos[0] != text_0.length) {
    throw toJs(new NumberFormatException(text_0));
  }
  return result;
}

function $parse_2(this$static, text_0, inOutPos){
  var gotNegative, gotNegativePrefix, gotNegativeSuffix, gotPositive, gotPositivePrefix, gotPositiveSuffix, ret, tempPos, valueOnly;
  ret = 0;
  gotPositivePrefix = $startsWith_0(text_0, this$static.positivePrefix, inOutPos[0]);
  gotNegativePrefix = $startsWith_0(text_0, this$static.negativePrefix, inOutPos[0]);
  gotPositiveSuffix = $endsWith(text_0, this$static.positiveSuffix);
  gotNegativeSuffix = $endsWith(text_0, this$static.negativeSuffix);
  gotPositive = gotPositivePrefix && gotPositiveSuffix;
  gotNegative = gotNegativePrefix && gotNegativeSuffix;
  if (gotPositive && gotNegative) {
    this$static.positivePrefix.length > this$static.negativePrefix.length?(gotNegative = false):this$static.positivePrefix.length < this$static.negativePrefix.length?(gotPositive = false):this$static.positiveSuffix.length > this$static.negativeSuffix.length?(gotNegative = false):this$static.positiveSuffix.length < this$static.negativeSuffix.length?(gotPositive = false):(gotNegative = false);
  }
   else if (!gotPositive && !gotNegative) {
    throw toJs(new NumberFormatException(text_0 + ' does not have either positive or negative affixes'));
  }
  valueOnly = null;
  if (gotPositive) {
    inOutPos[0] += this$static.positivePrefix.length;
    valueOnly = $substring_0(text_0, inOutPos[0], text_0.length - this$static.positiveSuffix.length);
  }
   else {
    inOutPos[0] += this$static.negativePrefix.length;
    valueOnly = $substring_0(text_0, inOutPos[0], text_0.length - this$static.negativeSuffix.length);
  }
  if ($equals(valueOnly, '\u221E')) {
    inOutPos[0] += '\u221E'.length;
    ret = Infinity;
  }
   else if ($equals(valueOnly, 'NaN')) {
    inOutPos[0] += 'NaN'.length;
    ret = NaN;
  }
   else {
    tempPos = stampJavaTypeInfo(getClassLiteralForArray(I_classLit, 1), $intern_1, 11, 15, [0]);
    ret = $parseNumber(this$static, valueOnly, tempPos);
    inOutPos[0] += tempPos[0];
  }
  gotPositive?(inOutPos[0] += this$static.positiveSuffix.length):gotNegative && (inOutPos[0] += this$static.negativeSuffix.length);
  gotNegative && (ret = -ret);
  return ret;
}

function $parseAffix(this$static, pattern, start_0, affix, inNegativePattern){
  var ch_0, inQuote, len, pos;
  $delete(affix, 0, affix.string.length);
  inQuote = false;
  len = pattern.length;
  for (pos = start_0; pos < len; ++pos) {
    ch_0 = (checkCriticalStringElementIndex(pos, pattern.length) , pattern.charCodeAt(pos));
    if (ch_0 == 39) {
      if (pos + 1 < len && (checkCriticalStringElementIndex(pos + 1, pattern.length) , pattern.charCodeAt(pos + 1) == 39)) {
        ++pos;
        affix.string += "'";
      }
       else {
        inQuote = !inQuote;
      }
      continue;
    }
    if (inQuote) {
      affix.string += String.fromCharCode(ch_0);
    }
     else {
      switch (ch_0) {
        case 35:
        case 48:
        case 44:
        case 46:
        case 59:
          return pos - start_0;
        case 164:
          this$static.isCurrencyFormat = true;
          if (pos + 1 < len && (checkCriticalStringElementIndex(pos + 1, pattern.length) , pattern.charCodeAt(pos + 1) == 164)) {
            ++pos;
            if (pos < len - 2 && (checkCriticalStringElementIndex(pos + 1, pattern.length) , pattern.charCodeAt(pos + 1) == 164) && (checkCriticalStringElementIndex(pos + 2, pattern.length) , pattern.charCodeAt(pos + 2) == 164)) {
              pos += 2;
              $append_1(affix, $getSimpleCurrencySymbol(this$static.currencyData));
            }
             else {
              $append_1(affix, this$static.currencyData[0]);
            }
          }
           else {
            $append_1(affix, this$static.currencyData[1]);
          }

          break;
        case 37:
          if (!inNegativePattern) {
            if (this$static.multiplier != 1) {
              throw toJs(new IllegalArgumentException_0('Too many percent/per mille characters in pattern "' + pattern + '"'));
            }
            this$static.multiplier = 100;
          }

          affix.string += '%';
          break;
        case 8240:
          if (!inNegativePattern) {
            if (this$static.multiplier != 1) {
              throw toJs(new IllegalArgumentException_0('Too many percent/per mille characters in pattern "' + pattern + '"'));
            }
            this$static.multiplier = 1000;
          }

          affix.string += '\u2030';
          break;
        case 45:
          affix.string += '-';
          break;
        default:affix.string += String.fromCharCode(ch_0);
      }
    }
  }
  return len - start_0;
}

function $parseNumber(this$static, text_0, pos){
  var ch_0, decimal, digit, grouping, normalizedText, ret, sawDecimal, sawDigit, sawExponent, scale;
  sawDecimal = false;
  sawExponent = false;
  sawDigit = false;
  scale = 1;
  decimal = this$static.isCurrencyFormat?',':',';
  grouping = this$static.isCurrencyFormat?'.':'.';
  normalizedText = new StringBuilder;
  for (; pos[0] < text_0.length; ++pos[0]) {
    ch_0 = $charAt_0(text_0, pos[0]);
    digit = $getDigit(ch_0);
    if (digit >= 0 && digit <= 9) {
      $append(normalizedText, digit + 48 & $intern_2);
      sawDigit = true;
    }
     else if (ch_0 == (checkCriticalStringElementIndex(0, decimal.length) , decimal.charCodeAt(0))) {
      if (sawDecimal || sawExponent) {
        break;
      }
      normalizedText.string += '.';
      sawDecimal = true;
    }
     else if (ch_0 == (checkCriticalStringElementIndex(0, grouping.length) , grouping.charCodeAt(0))) {
      if (sawDecimal || sawExponent) {
        break;
      }
      continue;
    }
     else if (ch_0 == (checkCriticalStringElementIndex(0, 'E'.length) , 'E'.charCodeAt(0))) {
      if (sawExponent) {
        break;
      }
      normalizedText.string += 'E';
      sawExponent = true;
    }
     else if (ch_0 == 43 || ch_0 == 45) {
      normalizedText.string += String.fromCharCode(ch_0);
    }
     else if (ch_0 == (checkCriticalStringElementIndex(0, '%'.length) , '%'.charCodeAt(0))) {
      if (scale != 1) {
        break;
      }
      scale = 100;
      if (sawDigit) {
        ++pos[0];
        break;
      }
    }
     else if (ch_0 == (checkCriticalStringElementIndex(0, '\u2030'.length) , '\u2030'.charCodeAt(0))) {
      if (scale != 1) {
        break;
      }
      scale = 1000;
      if (sawDigit) {
        ++pos[0];
        break;
      }
    }
     else {
      break;
    }
  }
  try {
    ret = __parseAndValidateDouble(normalizedText.string);
  }
   catch ($e0) {
    $e0 = toJava($e0);
    if (instanceOf($e0, 6)) {
      throw toJs(new NumberFormatException(text_0));
    }
     else 
      throw toJs($e0);
  }
  ret = ret / scale;
  return ret;
}

function $parsePattern_0(this$static, pattern){
  var affix, pos;
  pos = 0;
  affix = new StringBuilder;
  pos += $parseAffix(this$static, pattern, pos, affix, false);
  this$static.positivePrefix = affix.string;
  pos += $parseTrunk(this$static, pattern, pos, false);
  pos += $parseAffix(this$static, pattern, pos, affix, false);
  this$static.positiveSuffix = affix.string;
  if (pos < pattern.length && (checkCriticalStringElementIndex(pos, pattern.length) , pattern.charCodeAt(pos) == 59)) {
    ++pos;
    pos += $parseAffix(this$static, pattern, pos, affix, true);
    this$static.negativePrefix = affix.string;
    pos += $parseTrunk(this$static, pattern, pos, true);
    pos += $parseAffix(this$static, pattern, pos, affix, true);
    this$static.negativeSuffix = affix.string;
  }
   else {
    this$static.negativePrefix = '-' + this$static.positivePrefix;
    this$static.negativeSuffix = this$static.positiveSuffix;
  }
}

function $parseTrunk(this$static, pattern, start_0, ignorePattern){
  var ch_0, decimalPos, digitLeftCount, digitRightCount, effectiveDecimalPos, groupingCount, len, loop, n, pos, totalDigits, zeroDigitCount;
  decimalPos = -1;
  digitLeftCount = 0;
  zeroDigitCount = 0;
  digitRightCount = 0;
  groupingCount = -1;
  len = pattern.length;
  pos = start_0;
  loop = true;
  for (; pos < len && loop; ++pos) {
    ch_0 = (checkCriticalStringElementIndex(pos, pattern.length) , pattern.charCodeAt(pos));
    switch (ch_0) {
      case 35:
        zeroDigitCount > 0?++digitRightCount:++digitLeftCount;
        groupingCount >= 0 && decimalPos < 0 && ++groupingCount;
        break;
      case 48:
        if (digitRightCount > 0) {
          throw toJs(new IllegalArgumentException_0("Unexpected '0' in pattern \"" + pattern + '"'));
        }

        ++zeroDigitCount;
        groupingCount >= 0 && decimalPos < 0 && ++groupingCount;
        break;
      case 44:
        groupingCount = 0;
        break;
      case 46:
        if (decimalPos >= 0) {
          throw toJs(new IllegalArgumentException_0('Multiple decimal separators in pattern "' + pattern + '"'));
        }

        decimalPos = digitLeftCount + zeroDigitCount + digitRightCount;
        break;
      case 69:
        if (!ignorePattern) {
          if (this$static.useExponentialNotation) {
            throw toJs(new IllegalArgumentException_0('Multiple exponential symbols in pattern "' + pattern + '"'));
          }
          this$static.useExponentialNotation = true;
          this$static.minExponentDigits = 0;
        }

        while (pos + 1 < len && (checkCriticalStringElementIndex(pos + 1, pattern.length) , pattern.charCodeAt(pos + 1) == 48)) {
          ++pos;
          ignorePattern || ++this$static.minExponentDigits;
        }

        if (!ignorePattern && digitLeftCount + zeroDigitCount < 1 || this$static.minExponentDigits < 1) {
          throw toJs(new IllegalArgumentException_0('Malformed exponential pattern "' + pattern + '"'));
        }

        loop = false;
        break;
      default:--pos;
        loop = false;
    }
  }
  if (zeroDigitCount == 0 && digitLeftCount > 0 && decimalPos >= 0) {
    n = decimalPos;
    n == 0 && ++n;
    digitRightCount = digitLeftCount - n;
    digitLeftCount = n - 1;
    zeroDigitCount = 1;
  }
  if (decimalPos < 0 && digitRightCount > 0 || decimalPos >= 0 && (decimalPos < digitLeftCount || decimalPos > digitLeftCount + zeroDigitCount) || groupingCount == 0) {
    throw toJs(new IllegalArgumentException_0('Malformed pattern "' + pattern + '"'));
  }
  if (ignorePattern) {
    return pos - start_0;
  }
  totalDigits = digitLeftCount + zeroDigitCount + digitRightCount;
  this$static.maximumFractionDigits = decimalPos >= 0?totalDigits - decimalPos:0;
  if (decimalPos >= 0) {
    this$static.minimumFractionDigits = digitLeftCount + zeroDigitCount - decimalPos;
    this$static.minimumFractionDigits < 0 && (this$static.minimumFractionDigits = 0);
  }
  effectiveDecimalPos = decimalPos >= 0?decimalPos:totalDigits;
  this$static.minimumIntegerDigits = effectiveDecimalPos - digitLeftCount;
  if (this$static.useExponentialNotation) {
    this$static.maximumIntegerDigits = digitLeftCount + this$static.minimumIntegerDigits;
    this$static.maximumFractionDigits == 0 && this$static.minimumIntegerDigits == 0 && (this$static.minimumIntegerDigits = 1);
  }
  this$static.groupingSize = groupingCount > 0?groupingCount:0;
  this$static.decimalSeparatorAlwaysShown = decimalPos == 0 || decimalPos == totalDigits;
  return pos - start_0;
}

function $processLeadingZeros(this$static, digits){
  var i, prefix, strip;
  if (this$static.decimalPosition > this$static.digitsLength) {
    while (this$static.digitsLength < this$static.decimalPosition) {
      digits.string += '0';
      ++this$static.digitsLength;
    }
  }
  if (!this$static.useExponentialNotation) {
    if (this$static.decimalPosition < this$static.minimumIntegerDigits) {
      prefix = new StringBuilder;
      while (this$static.decimalPosition < this$static.minimumIntegerDigits) {
        prefix.string += '0';
        ++this$static.decimalPosition;
        ++this$static.digitsLength;
      }
      $insert(digits, 0, prefix.string);
    }
     else if (this$static.decimalPosition > this$static.minimumIntegerDigits) {
      strip = this$static.decimalPosition - this$static.minimumIntegerDigits;
      for (i = 0; i < strip; ++i) {
        if ($charAt_0(digits.string, i) != 48) {
          strip = i;
          break;
        }
      }
      if (strip > 0) {
        $replace0(digits, 0, strip, '');
        this$static.digitsLength -= strip;
        this$static.decimalPosition -= strip;
      }
    }
  }
}

function $propagateCarry(this$static, digits, i){
  var carry, digit;
  carry = true;
  while (carry && i >= 0) {
    digit = $charAt_0(digits.string, i);
    if (digit == 57) {
      $setCharAt(digits, i--, 48);
    }
     else {
      $setCharAt(digits, i, digit + 1 & $intern_2);
      carry = false;
    }
  }
  if (carry) {
    $insert(digits, 0, String.fromCharCode(49));
    ++this$static.decimalPosition;
    ++this$static.digitsLength;
  }
}

function $roundValue(this$static, digits){
  var i;
  if (this$static.digitsLength > this$static.decimalPosition + this$static.maximumFractionDigits && $charAt(digits, this$static.decimalPosition + this$static.maximumFractionDigits) >= 53) {
    i = this$static.decimalPosition + this$static.maximumFractionDigits - 1;
    $propagateCarry(this$static, digits, i);
  }
}

function NumberFormat(pattern, cdata, userSuppliedPattern){
  if (!cdata) {
    throw toJs(new IllegalArgumentException_0('Unknown currency code'));
  }
  this.pattern = pattern;
  this.currencyData = cdata;
  $parsePattern_0(this, this.pattern);
  if (!userSuppliedPattern && this.isCurrencyFormat) {
    this.minimumFractionDigits = this.currencyData[2] & 7;
    this.maximumFractionDigits = this.minimumFractionDigits;
  }
}

function NumberFormat_0(pattern, cdata){
  $clinit_NumberFormat();
  NumberFormat.call(this, pattern, cdata, true);
}

function toScaledString(buf, val){
  var dot, expDigits, expIdx, scale, startLen;
  startLen = buf.string.length;
  $append_1(buf, val.toPrecision(20));
  scale = 0;
  expIdx = $indexOf_0(buf.string, 'e', startLen);
  expIdx < 0 && (expIdx = $indexOf_0(buf.string, 'E', startLen));
  if (expIdx >= 0) {
    expDigits = expIdx + 1;
    expDigits < buf.string.length && $charAt_0(buf.string, expDigits) == 43 && ++expDigits;
    expDigits < buf.string.length && (scale = __parseAndValidateInt($substring(buf.string, expDigits)));
    $delete(buf, expIdx, buf.string.length);
  }
  dot = $indexOf_0(buf.string, '.', startLen);
  if (dot >= 0) {
    $replace0(buf, dot, dot + 1, '');
    scale -= buf.string.length - dot;
  }
  return scale;
}

defineClass(33, 1, {}, NumberFormat_0);
_.decimalPosition = 0;
_.decimalSeparatorAlwaysShown = false;
_.digitsLength = 0;
_.exponent = 0;
_.groupingSize = 3;
_.isCurrencyFormat = false;
_.maximumFractionDigits = 3;
_.maximumIntegerDigits = 40;
_.minExponentDigits = 0;
_.minimumFractionDigits = 0;
_.minimumIntegerDigits = 1;
_.multiplier = 1;
_.negativePrefix = '-';
_.negativeSuffix = '';
_.positivePrefix = '';
_.positiveSuffix = '';
_.useExponentialNotation = false;
var Lcom_google_gwt_i18n_client_NumberFormat_2_classLit = createForClass('com.google.gwt.i18n.client', 'NumberFormat', 33);
function $getISOTimeZoneString(this$static){
  var data_0, offset;
  offset = -this$static.standardOffset;
  data_0 = stampJavaTypeInfo(getClassLiteralForArray(C_classLit, 1), $intern_1, 11, 15, [43, 48, 48, 58, 48, 48]);
  if (offset < 0) {
    data_0[0] = 45;
    offset = -offset;
  }
  data_0[1] = data_0[1] + ((offset / 60 | 0) / 10 | 0) & $intern_2;
  data_0[2] = data_0[2] + (offset / 60 | 0) % 10 & $intern_2;
  data_0[4] = data_0[4] + (offset % 60 / 10 | 0) & $intern_2;
  data_0[5] = data_0[5] + offset % 10 & $intern_2;
  return valueOf_0(data_0, data_0.length);
}

function $getRFCTimeZoneString(this$static){
  var data_0, offset;
  offset = -this$static.standardOffset;
  data_0 = stampJavaTypeInfo(getClassLiteralForArray(C_classLit, 1), $intern_1, 11, 15, [43, 48, 48, 48, 48]);
  if (offset < 0) {
    data_0[0] = 45;
    offset = -offset;
  }
  data_0[1] = data_0[1] + ((offset / 60 | 0) / 10 | 0) & $intern_2;
  data_0[2] = data_0[2] + (offset / 60 | 0) % 10 & $intern_2;
  data_0[3] = data_0[3] + (offset % 60 / 10 | 0) & $intern_2;
  data_0[4] = data_0[4] + offset % 10 & $intern_2;
  return valueOf_0(data_0, data_0.length);
}

function TimeZone(){
}

function composeGMTString(offset){
  var data_0;
  data_0 = stampJavaTypeInfo(getClassLiteralForArray(C_classLit, 1), $intern_1, 11, 15, [71, 77, 84, 45, 48, 48, 58, 48, 48]);
  if (offset <= 0) {
    data_0[3] = 43;
    offset = -offset;
  }
  data_0[4] = data_0[4] + ((offset / 60 | 0) / 10 | 0) & $intern_2;
  data_0[5] = data_0[5] + (offset / 60 | 0) % 10 & $intern_2;
  data_0[7] = data_0[7] + (offset % 60 / 10 | 0) & $intern_2;
  data_0[8] = data_0[8] + offset % 10 & $intern_2;
  return valueOf_0(data_0, data_0.length);
}

function composePOSIXTimeZoneID(offset){
  var str;
  if (offset == 0) {
    return 'Etc/GMT';
  }
  if (offset < 0) {
    offset = -offset;
    str = 'Etc/GMT-';
  }
   else {
    str = 'Etc/GMT+';
  }
  return str + offsetDisplay(offset);
}

function composeUTCString(offset){
  var str;
  if (offset == 0) {
    return 'UTC';
  }
  if (offset < 0) {
    offset = -offset;
    str = 'UTC+';
  }
   else {
    str = 'UTC-';
  }
  return str + offsetDisplay(offset);
}

function createTimeZone(timeZoneOffsetInMinutes){
  var tz;
  tz = new TimeZone;
  tz.standardOffset = timeZoneOffsetInMinutes;
  tz.timezoneID = composePOSIXTimeZoneID(timeZoneOffsetInMinutes);
  tz.tzNames = initUnidimensionalArray(Ljava_lang_String_2_classLit, $intern_1, 2, 2, 6, 1);
  tz.tzNames[0] = composeUTCString(timeZoneOffsetInMinutes);
  tz.tzNames[1] = composeUTCString(timeZoneOffsetInMinutes);
  return tz;
}

function offsetDisplay(offset){
  var hour, mins;
  hour = offset / 60 | 0;
  mins = offset % 60;
  if (mins == 0) {
    return '' + hour;
  }
  return '' + hour + ':' + ('' + mins);
}

defineClass(64, 1, {}, TimeZone);
_.standardOffset = 0;
var Lcom_google_gwt_i18n_client_TimeZone_2_classLit = createForClass('com.google.gwt.i18n.client', 'TimeZone', 64);
function NumberConstantsImpl_de(){
}

defineClass(63, 1, {}, NumberConstantsImpl_de);
var Lcom_google_gwt_i18n_client_constants_NumberConstantsImpl_1de_2_classLit = createForClass('com.google.gwt.i18n.client.constants', 'NumberConstantsImpl_de', 63);
function $getSimpleCurrencySymbol(this$static){
  return this$static[4] || this$static[1];
}

defineClass(91, 90, {});
var Lcom_google_gwt_i18n_client_impl_cldr_DateTimeFormatInfoImpl_2_classLit = createForClass('com.google.gwt.i18n.client.impl.cldr', 'DateTimeFormatInfoImpl', 91);
function DateTimeFormatInfoImpl_de(){
}

defineClass(62, 91, {}, DateTimeFormatInfoImpl_de);
_.erasFull = function erasFull_0(){
  return stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['v. Chr.', 'n. Chr.']);
}
;
_.erasShort = function erasShort_0(){
  return stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['v. Chr.', 'n. Chr.']);
}
;
_.monthsFull = function monthsFull_0(){
  return stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Januar', 'Februar', 'M\xE4rz', 'April', 'Mai', 'Juni', 'Juli', 'August', 'September', 'Oktober', 'November', 'Dezember']);
}
;
_.monthsShort = function monthsShort_0(){
  return stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Jan.', 'Feb.', 'M\xE4rz', 'Apr.', 'Mai', 'Juni', 'Juli', 'Aug.', 'Sept.', 'Okt.', 'Nov.', 'Dez.']);
}
;
_.monthsShortStandalone = function monthsShortStandalone_0(){
  return stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Jan', 'Feb', 'M\xE4r', 'Apr', 'Mai', 'Jun', 'Jul', 'Aug', 'Sep', 'Okt', 'Nov', 'Dez']);
}
;
_.quartersFull = function quartersFull_0(){
  return stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['1. Quartal', '2. Quartal', '3. Quartal', '4. Quartal']);
}
;
_.weekdaysFull = function weekdaysFull_0(){
  return stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Sonntag', 'Montag', 'Dienstag', 'Mittwoch', 'Donnerstag', 'Freitag', 'Samstag']);
}
;
_.weekdaysNarrow = function weekdaysNarrow_0(){
  return stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['S', 'M', 'D', 'M', 'D', 'F', 'S']);
}
;
_.weekdaysShort = function weekdaysShort_0(){
  return stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['So.', 'Mo.', 'Di.', 'Mi.', 'Do.', 'Fr.', 'Sa.']);
}
;
_.weekdaysShortStandalone = function weekdaysShortStandalone_0(){
  return stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['So', 'Mo', 'Di', 'Mi', 'Do', 'Fr', 'Sa']);
}
;
var Lcom_google_gwt_i18n_client_impl_cldr_DateTimeFormatInfoImpl_1de_2_classLit = createForClass('com.google.gwt.i18n.client.impl.cldr', 'DateTimeFormatInfoImpl_de', 62);
function DateTimeFormatInfoImpl_en(){
}

defineClass(54, 91, {}, DateTimeFormatInfoImpl_en);
var Lcom_google_gwt_i18n_client_impl_cldr_DateTimeFormatInfoImpl_1en_2_classLit = createForClass('com.google.gwt.i18n.client.impl.cldr', 'DateTimeFormatInfoImpl_en', 54);
function DateTimeFormat$PatternPart(txt, cnt){
  this.text_0 = txt;
  this.count = cnt;
  this.abutStart = false;
}

defineClass(14, 1, {14:1}, DateTimeFormat$PatternPart);
_.abutStart = false;
_.count = 0;
var Lcom_google_gwt_i18n_shared_DateTimeFormat$PatternPart_2_classLit = createForClass('com.google.gwt.i18n.shared', 'DateTimeFormat/PatternPart', 14);
function $fixDaylightSavings(this$static, requestedHours){
  var badHours, copy, day, newTime, originalTimeInMillis, timeDiff, timeDiffHours, timeDiffMinutes;
  requestedHours %= 24;
  if (this$static.jsdate.getHours() != requestedHours) {
    copy = new $wnd.Date(this$static.jsdate.getTime());
    copy.setDate(copy.getDate() + 1);
    timeDiff = this$static.jsdate.getTimezoneOffset() - copy.getTimezoneOffset();
    if (timeDiff > 0) {
      timeDiffHours = timeDiff / 60 | 0;
      timeDiffMinutes = timeDiff % 60;
      day = this$static.jsdate.getDate();
      badHours = this$static.jsdate.getHours();
      badHours + timeDiffHours >= 24 && ++day;
      newTime = new $wnd.Date(this$static.jsdate.getFullYear(), this$static.jsdate.getMonth(), day, requestedHours + timeDiffHours, this$static.jsdate.getMinutes() + timeDiffMinutes, this$static.jsdate.getSeconds(), this$static.jsdate.getMilliseconds());
      this$static.jsdate.setTime(newTime.getTime());
    }
  }
  originalTimeInMillis = this$static.jsdate.getTime();
  this$static.jsdate.setTime(originalTimeInMillis + 3600000);
  this$static.jsdate.getHours() != requestedHours && this$static.jsdate.setTime(originalTimeInMillis);
}

function $setDate(this$static, date){
  var hours;
  hours = this$static.jsdate.getHours();
  this$static.jsdate.setDate(date);
  $fixDaylightSavings(this$static, hours);
}

function $setHours(this$static, hours){
  this$static.jsdate.setHours(hours);
  $fixDaylightSavings(this$static, hours);
}

function $setMinutes(this$static, minutes){
  var hours;
  hours = this$static.jsdate.getHours() + (minutes / 60 | 0);
  this$static.jsdate.setMinutes(minutes);
  $fixDaylightSavings(this$static, hours);
}

function $setMonth(this$static, month){
  var hours;
  hours = this$static.jsdate.getHours();
  this$static.jsdate.setMonth(month);
  $fixDaylightSavings(this$static, hours);
}

function $setSeconds(this$static, seconds){
  var hours;
  hours = this$static.jsdate.getHours() + (seconds / 3600 | 0);
  this$static.jsdate.setSeconds(seconds);
  $fixDaylightSavings(this$static, hours);
}

function $setTime(this$static, time){
  this$static.jsdate.setTime(toDouble_0(time));
}

function $setYear(this$static, year){
  var hours;
  hours = this$static.jsdate.getHours();
  this$static.jsdate.setFullYear(year + $intern_3);
  $fixDaylightSavings(this$static, hours);
}

function Date_0(){
  this.jsdate = new $wnd.Date;
}

function Date_1(year, month, date){
  this.jsdate = new $wnd.Date;
  this.jsdate.setFullYear(year + $intern_3, month, date);
  this.jsdate.setHours(0, 0, 0, 0);
  $fixDaylightSavings(this, 0);
}

function Date_2(date){
  this.jsdate = new $wnd.Date(toDouble_0(date));
}

function padTwo(number){
  return number < 10?'0' + number:'' + number;
}

defineClass(9, 1, $intern_5, Date_0, Date_1, Date_2);
_.hashCode_0 = function hashCode_2(){
  var time;
  time = fromDouble_0(this.jsdate.getTime());
  return toInt_0(xor_0(time, createLongEmul(shru(isSmallLong0(time)?toBigLong(time):time, 32))));
}
;
_.toString_0 = function toString_3(){
  var hourOffset, minuteOffset, offset;
  offset = -this.jsdate.getTimezoneOffset();
  hourOffset = (offset >= 0?'+':'') + (offset / 60 | 0);
  minuteOffset = padTwo($wnd.Math.abs(offset) % 60);
  return ($clinit_Date$StringData() , DAYS)[this.jsdate.getDay()] + ' ' + MONTHS[this.jsdate.getMonth()] + ' ' + padTwo(this.jsdate.getDate()) + ' ' + padTwo(this.jsdate.getHours()) + ':' + padTwo(this.jsdate.getMinutes()) + ':' + padTwo(this.jsdate.getSeconds()) + ' GMT' + hourOffset + minuteOffset + ' ' + this.jsdate.getFullYear();
}
;
var Ljava_util_Date_2_classLit = createForClass('java.util', 'Date', 9);
function $calcDate(this$static, date){
  var adjustment, daysInCurrentMonth, defaultCenturyStart, offset, orgDayOfMonth, orgMonth, tmp;
  this$static.era == 0 && this$static.year > 0 && (this$static.year = -(this$static.year - 1));
  this$static.year > $intern_6 && $setYear(date, this$static.year - $intern_3);
  orgDayOfMonth = date.jsdate.getDate();
  $setDate(date, 1);
  this$static.month >= 0 && $setMonth(date, this$static.month);
  if (this$static.dayOfMonth >= 0) {
    $setDate(date, this$static.dayOfMonth);
  }
   else if (this$static.month >= 0) {
    tmp = new Date_1(date.jsdate.getFullYear() - $intern_3, date.jsdate.getMonth(), 35);
    daysInCurrentMonth = 35 - tmp.jsdate.getDate();
    $setDate(date, $wnd.Math.min(daysInCurrentMonth, orgDayOfMonth));
  }
   else {
    $setDate(date, orgDayOfMonth);
  }
  this$static.hours < 0 && (this$static.hours = date.jsdate.getHours());
  this$static.ampm > 0 && this$static.hours < 12 && (this$static.hours += 12);
  $setHours(date, this$static.hours == 24 && this$static.midnightIs24?0:this$static.hours);
  this$static.minutes >= 0 && $setMinutes(date, this$static.minutes);
  this$static.seconds >= 0 && $setSeconds(date, this$static.seconds);
  this$static.milliseconds >= 0 && $setTime(date, add_1(mul_0(div(fromDouble_0(date.jsdate.getTime()), 1000), 1000), this$static.milliseconds));
  if (this$static.ambiguousYear) {
    defaultCenturyStart = new Date_0;
    $setYear(defaultCenturyStart, defaultCenturyStart.jsdate.getFullYear() - $intern_3 - 80);
    lt(fromDouble_0(date.jsdate.getTime()), fromDouble_0(defaultCenturyStart.jsdate.getTime())) && $setYear(date, defaultCenturyStart.jsdate.getFullYear() - $intern_3 + 100);
  }
  if (this$static.dayOfWeek >= 0) {
    if (this$static.dayOfMonth == -1) {
      adjustment = (7 + this$static.dayOfWeek - date.jsdate.getDay()) % 7;
      adjustment > 3 && (adjustment -= 7);
      orgMonth = date.jsdate.getMonth();
      $setDate(date, date.jsdate.getDate() + adjustment);
      date.jsdate.getMonth() != orgMonth && $setDate(date, date.jsdate.getDate() + (adjustment > 0?-7:7));
    }
     else {
      if (date.jsdate.getDay() != this$static.dayOfWeek) {
        return false;
      }
    }
  }
  if (this$static.tzOffset > $intern_6) {
    offset = date.jsdate.getTimezoneOffset();
    $setTime(date, add_1(fromDouble_0(date.jsdate.getTime()), (this$static.tzOffset - offset) * 60 * 1000));
  }
  return true;
}

function DateRecord(){
  Date_0.call(this);
  this.era = -1;
  this.ambiguousYear = false;
  this.year = $intern_6;
  this.month = -1;
  this.dayOfMonth = -1;
  this.ampm = -1;
  this.midnightIs24 = false;
  this.hours = -1;
  this.minutes = -1;
  this.seconds = -1;
  this.milliseconds = -1;
  this.dayOfWeek = -1;
  this.tzOffset = $intern_6;
}

defineClass(65, 9, $intern_5, DateRecord);
_.ambiguousYear = false;
_.ampm = 0;
_.dayOfMonth = 0;
_.dayOfWeek = 0;
_.era = 0;
_.hours = 0;
_.midnightIs24 = false;
_.milliseconds = 0;
_.minutes = 0;
_.month = 0;
_.seconds = 0;
_.tzOffset = 0;
_.year = 0;
var Lcom_google_gwt_i18n_shared_impl_DateRecord_2_classLit = createForClass('com.google.gwt.i18n.shared.impl', 'DateRecord', 65);
function canSet(array, value_0){
  var elementTypeCategory;
  switch (getElementTypeCategory(array)) {
    case 6:
      return instanceOfString(value_0);
    case 7:
      return instanceOfDouble(value_0);
    case 8:
      return instanceOfBoolean(value_0);
    case 3:
      return Array.isArray(value_0) && (elementTypeCategory = getElementTypeCategory(value_0) , !(elementTypeCategory >= 14 && elementTypeCategory <= 16));
    case 11:
      return value_0 != null && typeof value_0 === 'function';
    case 12:
      return value_0 != null && (typeof value_0 === 'object' || typeof value_0 == 'function');
    case 0:
      return canCast(value_0, array.__elementTypeId$);
    case 2:
      return isJsObjectOrFunction(value_0) && !(value_0.typeMarker === typeMarkerFn);
    case 1:
      return isJsObjectOrFunction(value_0) && !(value_0.typeMarker === typeMarkerFn) || canCast(value_0, array.__elementTypeId$);
    default:return true;
  }
}

function getClassLiteralForArray(clazz, dimensions){
  return getClassLiteralForArray_0(clazz, dimensions);
}

function getElementTypeCategory(array){
  return array.__elementTypeCategory$ == null?10:array.__elementTypeCategory$;
}

function initUnidimensionalArray(leafClassLiteral, castableTypeMap, elementTypeId, length_0, elementTypeCategory, dimensions){
  var result;
  result = initializeArrayElementsWithDefaults(elementTypeCategory, length_0);
  elementTypeCategory != 10 && stampJavaTypeInfo(getClassLiteralForArray(leafClassLiteral, dimensions), castableTypeMap, elementTypeId, elementTypeCategory, result);
  return result;
}

function initializeArrayElementsWithDefaults(elementTypeCategory, length_0){
  var array = new Array(length_0);
  var initValue;
  switch (elementTypeCategory) {
    case 14:
    case 15:
      initValue = 0;
      break;
    case 16:
      initValue = false;
      break;
    default:return array;
  }
  for (var i = 0; i < length_0; ++i) {
    array[i] = initValue;
  }
  return array;
}

function isJavaArray(src_0){
  return Array.isArray(src_0) && src_0.typeMarker === typeMarkerFn;
}

function setCheck(array, index_0, value_0){
  checkCriticalArrayType(value_0 == null || canSet(array, value_0));
  return array[index_0] = value_0;
}

function stampJavaTypeInfo(arrayClass, castableTypeMap, elementTypeId, elementTypeCategory, array){
  array.___clazz = arrayClass;
  array.castableTypeMap = castableTypeMap;
  array.typeMarker = typeMarkerFn;
  array.__elementTypeId$ = elementTypeId;
  array.__elementTypeCategory$ = elementTypeCategory;
  return array;
}

function create(value_0){
  var a0, a1, a2;
  a0 = value_0 & $intern_7;
  a1 = value_0 >> 22 & $intern_7;
  a2 = value_0 < 0?$intern_8:0;
  return create0(a0, a1, a2);
}

function create_0(a){
  return create0(a.l, a.m, a.h);
}

function create0(l, m, h){
  return {l:l, m:m, h:h};
}

function divMod(a, b, computeRemainder){
  var aIsCopy, aIsMinValue, aIsNegative, bpower, c, negative;
  if (b.l == 0 && b.m == 0 && b.h == 0) {
    throw toJs(new ArithmeticException);
  }
  if (a.l == 0 && a.m == 0 && a.h == 0) {
    computeRemainder && (remainder_0 = create0(0, 0, 0));
    return create0(0, 0, 0);
  }
  if (b.h == $intern_9 && b.m == 0 && b.l == 0) {
    return divModByMinValue(a, computeRemainder);
  }
  negative = false;
  if (b.h >> 19 != 0) {
    b = neg(b);
    negative = !negative;
  }
  bpower = powerOfTwo(b);
  aIsNegative = false;
  aIsMinValue = false;
  aIsCopy = false;
  if (a.h == $intern_9 && a.m == 0 && a.l == 0) {
    aIsMinValue = true;
    aIsNegative = true;
    if (bpower == -1) {
      a = create_0(($clinit_BigLongLib$Const() , MAX_VALUE));
      aIsCopy = true;
      negative = !negative;
    }
     else {
      c = shr(a, bpower);
      negative && negate(c);
      computeRemainder && (remainder_0 = create0(0, 0, 0));
      return c;
    }
  }
   else if (a.h >> 19 != 0) {
    aIsNegative = true;
    a = neg(a);
    aIsCopy = true;
    negative = !negative;
  }
  if (bpower != -1) {
    return divModByShift(a, bpower, negative, aIsNegative, computeRemainder);
  }
  if (compare(a, b) < 0) {
    computeRemainder && (aIsNegative?(remainder_0 = neg(a)):(remainder_0 = create0(a.l, a.m, a.h)));
    return create0(0, 0, 0);
  }
  return divModHelper(aIsCopy?a:create0(a.l, a.m, a.h), b, negative, aIsNegative, aIsMinValue, computeRemainder);
}

function divModByMinValue(a, computeRemainder){
  if (a.h == $intern_9 && a.m == 0 && a.l == 0) {
    computeRemainder && (remainder_0 = create0(0, 0, 0));
    return create_0(($clinit_BigLongLib$Const() , ONE));
  }
  computeRemainder && (remainder_0 = create0(a.l, a.m, a.h));
  return create0(0, 0, 0);
}

function divModByShift(a, bpower, negative, aIsNegative, computeRemainder){
  var c;
  c = shr(a, bpower);
  negative && negate(c);
  if (computeRemainder) {
    a = maskRight(a, bpower);
    aIsNegative?(remainder_0 = neg(a)):(remainder_0 = create0(a.l, a.m, a.h));
  }
  return c;
}

function divModHelper(a, b, negative, aIsNegative, aIsMinValue, computeRemainder){
  var bshift, gte, quotient, shift_0, a1, a2, a0;
  shift_0 = numberOfLeadingZeros(b) - numberOfLeadingZeros(a);
  bshift = shl(b, shift_0);
  quotient = create0(0, 0, 0);
  while (shift_0 >= 0) {
    gte = trialSubtract(a, bshift);
    if (gte) {
      shift_0 < 22?(quotient.l |= 1 << shift_0 , undefined):shift_0 < 44?(quotient.m |= 1 << shift_0 - 22 , undefined):(quotient.h |= 1 << shift_0 - 44 , undefined);
      if (a.l == 0 && a.m == 0 && a.h == 0) {
        break;
      }
    }
    a1 = bshift.m;
    a2 = bshift.h;
    a0 = bshift.l;
    bshift.h = a2 >>> 1;
    bshift.m = a1 >>> 1 | (a2 & 1) << 21;
    bshift.l = a0 >>> 1 | (a1 & 1) << 21;
    --shift_0;
  }
  negative && negate(quotient);
  if (computeRemainder) {
    if (aIsNegative) {
      remainder_0 = neg(a);
      aIsMinValue && (remainder_0 = sub_0(remainder_0, ($clinit_BigLongLib$Const() , ONE)));
    }
     else {
      remainder_0 = create0(a.l, a.m, a.h);
    }
  }
  return quotient;
}

function maskRight(a, bits){
  var b0, b1, b2;
  if (bits <= 22) {
    b0 = a.l & (1 << bits) - 1;
    b1 = b2 = 0;
  }
   else if (bits <= 44) {
    b0 = a.l;
    b1 = a.m & (1 << bits - 22) - 1;
    b2 = 0;
  }
   else {
    b0 = a.l;
    b1 = a.m;
    b2 = a.h & (1 << bits - 44) - 1;
  }
  return create0(b0, b1, b2);
}

function negate(a){
  var neg0, neg1, neg2;
  neg0 = ~a.l + 1 & $intern_7;
  neg1 = ~a.m + (neg0 == 0?1:0) & $intern_7;
  neg2 = ~a.h + (neg0 == 0 && neg1 == 0?1:0) & $intern_8;
  a.l = neg0;
  a.m = neg1;
  a.h = neg2;
}

function numberOfLeadingZeros(a){
  var b1, b2;
  b2 = numberOfLeadingZeros_0(a.h);
  if (b2 == 32) {
    b1 = numberOfLeadingZeros_0(a.m);
    return b1 == 32?numberOfLeadingZeros_0(a.l) + 32:b1 + 20 - 10;
  }
   else {
    return b2 - 12;
  }
}

function powerOfTwo(a){
  var h, l, m;
  l = a.l;
  if ((l & l - 1) != 0) {
    return -1;
  }
  m = a.m;
  if ((m & m - 1) != 0) {
    return -1;
  }
  h = a.h;
  if ((h & h - 1) != 0) {
    return -1;
  }
  if (h == 0 && m == 0 && l == 0) {
    return -1;
  }
  if (h == 0 && m == 0 && l != 0) {
    return numberOfTrailingZeros(l);
  }
  if (h == 0 && m != 0 && l == 0) {
    return numberOfTrailingZeros(m) + 22;
  }
  if (h != 0 && m == 0 && l == 0) {
    return numberOfTrailingZeros(h) + 44;
  }
  return -1;
}

function toDoubleHelper(a){
  return a.l + a.m * $intern_10 + a.h * $intern_11;
}

function trialSubtract(a, b){
  var sum0, sum1, sum2;
  sum2 = a.h - b.h;
  if (sum2 < 0) {
    return false;
  }
  sum0 = a.l - b.l;
  sum1 = a.m - b.m + (sum0 >> 22);
  sum2 += sum1 >> 22;
  if (sum2 < 0) {
    return false;
  }
  a.l = sum0 & $intern_7;
  a.m = sum1 & $intern_7;
  a.h = sum2 & $intern_8;
  return true;
}

var remainder_0;
function add_0(a, b){
  var sum0, sum1, sum2;
  sum0 = a.l + b.l;
  sum1 = a.m + b.m + (sum0 >> 22);
  sum2 = a.h + b.h + (sum1 >> 22);
  return create0(sum0 & $intern_7, sum1 & $intern_7, sum2 & $intern_8);
}

function compare(a, b){
  var a0, a1, a2, b0, b1, b2, signA, signB;
  signA = a.h >> 19;
  signB = b.h >> 19;
  if (signA != signB) {
    return signB - signA;
  }
  a2 = a.h;
  b2 = b.h;
  if (a2 != b2) {
    return a2 - b2;
  }
  a1 = a.m;
  b1 = b.m;
  if (a1 != b1) {
    return a1 - b1;
  }
  a0 = a.l;
  b0 = b.l;
  return a0 - b0;
}

function fromDouble(value_0){
  var a0, a1, a2, negative, result;
  if (isNaN(value_0)) {
    return $clinit_BigLongLib$Const() , ZERO;
  }
  if (value_0 < -9223372036854775808) {
    return $clinit_BigLongLib$Const() , MIN_VALUE;
  }
  if (value_0 >= 9223372036854775807) {
    return $clinit_BigLongLib$Const() , MAX_VALUE;
  }
  negative = false;
  if (value_0 < 0) {
    negative = true;
    value_0 = -value_0;
  }
  a2 = 0;
  if (value_0 >= $intern_11) {
    a2 = round_int(value_0 / $intern_11);
    value_0 -= a2 * $intern_11;
  }
  a1 = 0;
  if (value_0 >= $intern_10) {
    a1 = round_int(value_0 / $intern_10);
    value_0 -= a1 * $intern_10;
  }
  a0 = round_int(value_0);
  result = create0(a0, a1, a2);
  negative && negate(result);
  return result;
}

function mul(a, b){
  var a0, a1, a2, a3, a4, b0, b1, b2, b3, b4, c0, c00, c01, c1, c10, c11, c12, c13, c2, c22, c23, c24, p0, p1, p2, p3, p4;
  a0 = a.l & 8191;
  a1 = a.l >> 13 | (a.m & 15) << 9;
  a2 = a.m >> 4 & 8191;
  a3 = a.m >> 17 | (a.h & 255) << 5;
  a4 = (a.h & 1048320) >> 8;
  b0 = b.l & 8191;
  b1 = b.l >> 13 | (b.m & 15) << 9;
  b2 = b.m >> 4 & 8191;
  b3 = b.m >> 17 | (b.h & 255) << 5;
  b4 = (b.h & 1048320) >> 8;
  p0 = a0 * b0;
  p1 = a1 * b0;
  p2 = a2 * b0;
  p3 = a3 * b0;
  p4 = a4 * b0;
  if (b1 != 0) {
    p1 += a0 * b1;
    p2 += a1 * b1;
    p3 += a2 * b1;
    p4 += a3 * b1;
  }
  if (b2 != 0) {
    p2 += a0 * b2;
    p3 += a1 * b2;
    p4 += a2 * b2;
  }
  if (b3 != 0) {
    p3 += a0 * b3;
    p4 += a1 * b3;
  }
  b4 != 0 && (p4 += a0 * b4);
  c00 = p0 & $intern_7;
  c01 = (p1 & 511) << 13;
  c0 = c00 + c01;
  c10 = p0 >> 22;
  c11 = p1 >> 9;
  c12 = (p2 & 262143) << 4;
  c13 = (p3 & 31) << 17;
  c1 = c10 + c11 + c12 + c13;
  c22 = p2 >> 18;
  c23 = p3 >> 5;
  c24 = (p4 & 4095) << 8;
  c2 = c22 + c23 + c24;
  c1 += c0 >> 22;
  c0 &= $intern_7;
  c2 += c1 >> 22;
  c1 &= $intern_7;
  c2 &= $intern_8;
  return create0(c0, c1, c2);
}

function neg(a){
  var neg0, neg1, neg2;
  neg0 = ~a.l + 1 & $intern_7;
  neg1 = ~a.m + (neg0 == 0?1:0) & $intern_7;
  neg2 = ~a.h + (neg0 == 0 && neg1 == 0?1:0) & $intern_8;
  return create0(neg0, neg1, neg2);
}

function shl(a, n){
  var res0, res1, res2;
  n &= 63;
  if (n < 22) {
    res0 = a.l << n;
    res1 = a.m << n | a.l >> 22 - n;
    res2 = a.h << n | a.m >> 22 - n;
  }
   else if (n < 44) {
    res0 = 0;
    res1 = a.l << n - 22;
    res2 = a.m << n - 22 | a.l >> 44 - n;
  }
   else {
    res0 = 0;
    res1 = 0;
    res2 = a.l << n - 44;
  }
  return create0(res0 & $intern_7, res1 & $intern_7, res2 & $intern_8);
}

function shr(a, n){
  var a2, negative, res0, res1, res2;
  n &= 63;
  a2 = a.h;
  negative = (a2 & $intern_9) != 0;
  negative && (a2 |= -1048576);
  if (n < 22) {
    res2 = a2 >> n;
    res1 = a.m >> n | a2 << 22 - n;
    res0 = a.l >> n | a.m << 22 - n;
  }
   else if (n < 44) {
    res2 = negative?$intern_8:0;
    res1 = a2 >> n - 22;
    res0 = a.m >> n - 22 | a2 << 44 - n;
  }
   else {
    res2 = negative?$intern_8:0;
    res1 = negative?$intern_7:0;
    res0 = a2 >> n - 44;
  }
  return create0(res0 & $intern_7, res1 & $intern_7, res2 & $intern_8);
}

function shru(a, n){
  var a2, res0, res1, res2;
  n &= 63;
  a2 = a.h & $intern_8;
  if (n < 22) {
    res2 = a2 >>> n;
    res1 = a.m >> n | a2 << 22 - n;
    res0 = a.l >> n | a.m << 22 - n;
  }
   else if (n < 44) {
    res2 = 0;
    res1 = a2 >>> n - 22;
    res0 = a.m >> n - 22 | a.h << 44 - n;
  }
   else {
    res2 = 0;
    res1 = 0;
    res0 = a2 >>> n - 44;
  }
  return create0(res0 & $intern_7, res1 & $intern_7, res2 & $intern_8);
}

function sub_0(a, b){
  var sum0, sum1, sum2;
  sum0 = a.l - b.l;
  sum1 = a.m - b.m + (sum0 >> 22);
  sum2 = a.h - b.h + (sum1 >> 22);
  return create0(sum0 & $intern_7, sum1 & $intern_7, sum2 & $intern_8);
}

function toDouble(a){
  if (compare(a, ($clinit_BigLongLib$Const() , ZERO)) < 0) {
    return -toDoubleHelper(neg(a));
  }
  return a.l + a.m * $intern_10 + a.h * $intern_11;
}

function toInt(a){
  return a.l | a.m << 22;
}

function toString_4(a){
  var digits, rem, res, tenPowerLong, zeroesNeeded;
  if (a.l == 0 && a.m == 0 && a.h == 0) {
    return '0';
  }
  if (a.h == $intern_9 && a.m == 0 && a.l == 0) {
    return '-9223372036854775808';
  }
  if (a.h >> 19 != 0) {
    return '-' + toString_4(neg(a));
  }
  rem = a;
  res = '';
  while (!(rem.l == 0 && rem.m == 0 && rem.h == 0)) {
    tenPowerLong = create(1000000000);
    rem = divMod(rem, tenPowerLong, true);
    digits = '' + toInt(remainder_0);
    if (!(rem.l == 0 && rem.m == 0 && rem.h == 0)) {
      zeroesNeeded = 9 - digits.length;
      for (; zeroesNeeded > 0; zeroesNeeded--) {
        digits = '0' + digits;
      }
    }
    res = digits + res;
  }
  return res;
}

function xor(a, b){
  return create0(a.l ^ b.l, a.m ^ b.m, a.h ^ b.h);
}

function $clinit_BigLongLib$Const(){
  $clinit_BigLongLib$Const = emptyMethod;
  MAX_VALUE = create0($intern_7, $intern_7, 524287);
  MIN_VALUE = create0(0, 0, $intern_9);
  ONE = create(1);
  create(2);
  ZERO = create(0);
}

var MAX_VALUE, MIN_VALUE, ONE, ZERO;
function toJava(e){
  var javaException;
  if (instanceOf(e, 5)) {
    return e;
  }
  javaException = e && e.__java$exception;
  if (!javaException) {
    javaException = new JavaScriptException(e);
    captureStackTrace(javaException);
  }
  return javaException;
}

function toJs(t){
  return t.backingJsObject;
}

function add_1(a, b){
  var result;
  if (isSmallLong0(a) && isSmallLong0(b)) {
    result = a + b;
    if ($intern_12 < result && result < $intern_11) {
      return result;
    }
  }
  return createLongEmul(add_0(isSmallLong0(a)?toBigLong(a):a, isSmallLong0(b)?toBigLong(b):b));
}

function compare_0(a, b){
  var result;
  if (isSmallLong0(a) && isSmallLong0(b)) {
    result = a - b;
    if (!isNaN(result)) {
      return result;
    }
  }
  return compare(isSmallLong0(a)?toBigLong(a):a, isSmallLong0(b)?toBigLong(b):b);
}

function createLongEmul(big_0){
  var a2;
  a2 = big_0.h;
  if (a2 == 0) {
    return big_0.l + big_0.m * $intern_10;
  }
  if (a2 == $intern_8) {
    return big_0.l + big_0.m * $intern_10 - $intern_11;
  }
  return big_0;
}

function div(a, b){
  var result;
  if (isSmallLong0(a) && isSmallLong0(b)) {
    result = a / b;
    if ($intern_12 < result && result < $intern_11) {
      return result < 0?$wnd.Math.ceil(result):$wnd.Math.floor(result);
    }
  }
  return createLongEmul(divMod(isSmallLong0(a)?toBigLong(a):a, isSmallLong0(b)?toBigLong(b):b, false));
}

function fromDouble_0(value_0){
  if ($intern_12 < value_0 && value_0 < $intern_11) {
    return value_0 < 0?$wnd.Math.ceil(value_0):$wnd.Math.floor(value_0);
  }
  return createLongEmul(fromDouble(value_0));
}

function isSmallLong0(value_0){
  return typeof value_0 === 'number';
}

function lt(a, b){
  return compare_0(a, b) < 0;
}

function mod(a, b){
  var result;
  if (isSmallLong0(a) && isSmallLong0(b)) {
    result = a % b;
    if ($intern_12 < result && result < $intern_11) {
      return result;
    }
  }
  return createLongEmul((divMod(isSmallLong0(a)?toBigLong(a):a, isSmallLong0(b)?toBigLong(b):b, true) , remainder_0));
}

function mul_0(a, b){
  var result;
  if (isSmallLong0(a) && isSmallLong0(b)) {
    result = a * b;
    if ($intern_12 < result && result < $intern_11) {
      return result;
    }
  }
  return createLongEmul(mul(isSmallLong0(a)?toBigLong(a):a, isSmallLong0(b)?toBigLong(b):b));
}

function neg_0(a){
  var result;
  if (isSmallLong0(a)) {
    result = 0 - a;
    if (!isNaN(result)) {
      return result;
    }
  }
  return createLongEmul(neg(a));
}

function sub_1(a, b){
  var result;
  if (isSmallLong0(a) && isSmallLong0(b)) {
    result = a - b;
    if ($intern_12 < result && result < $intern_11) {
      return result;
    }
  }
  return createLongEmul(sub_0(isSmallLong0(a)?toBigLong(a):a, isSmallLong0(b)?toBigLong(b):b));
}

function toBigLong(longValue){
  var a0, a1, a3, value_0;
  value_0 = longValue;
  a3 = 0;
  if (value_0 < 0) {
    value_0 += $intern_11;
    a3 = $intern_8;
  }
  a1 = round_int(value_0 / $intern_10);
  a0 = round_int(value_0 - a1 * $intern_10);
  return create0(a0, a1, a3);
}

function toDouble_0(a){
  var d;
  if (isSmallLong0(a)) {
    d = a;
    return d == -0.?0:d;
  }
  return toDouble(a);
}

function toInt_0(a){
  if (isSmallLong0(a)) {
    return a | 0;
  }
  return toInt(a);
}

function toString_5(a){
  if (isSmallLong0(a)) {
    return '' + a;
  }
  return toString_4(a);
}

function xor_0(a, b){
  return createLongEmul(xor(isSmallLong0(a)?toBigLong(a):a, isSmallLong0(b)?toBigLong(b):b));
}

function init(){
  $wnd.setTimeout($entry(assertCompileTimeUserAgent));
  $onModuleLoad();
  $addNativeMethods();
  typeof $wnd.gwtModuleLoaded == 'function' && $wnd.gwtModuleLoaded('formatter');
}

function $onModuleLoad(){
  var allowedModes, currentMode, i;
  currentMode = $doc.compatMode;
  allowedModes = stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['CSS1Compat']);
  for (i = 0; i < allowedModes.length; i++) {
    if ($equals(allowedModes[i], currentMode)) {
      return;
    }
  }
  allowedModes.length == 1 && $equals('CSS1Compat', allowedModes[0]) && $equals('BackCompat', currentMode)?"GWT no longer supports Quirks Mode (document.compatMode=' BackCompat').<br>Make sure your application's host HTML page has a Standards Mode (document.compatMode=' CSS1Compat') doctype,<br>e.g. by using &lt;!doctype html&gt; at the start of your application's HTML page.<br><br>To continue using this unsupported rendering mode and risk layout problems, suppress this message by adding<br>the following line to your*.gwt.xml module file:<br>&nbsp;&nbsp;&lt;extend-configuration-property name=\"document.compatMode\" value=\"" + currentMode + '"/&gt;':"Your *.gwt.xml module configuration prohibits the use of the current document rendering mode (document.compatMode=' " + currentMode + "').<br>Modify your application's host HTML page doctype, or update your custom " + "'document.compatMode' configuration property settings.";
}

function assertCompileTimeUserAgent(){
  var runtimeValue;
  runtimeValue = $getRuntimeValue();
  if (!$equals('gecko1_8', runtimeValue)) {
    throw toJs(new UserAgentAsserter$UserAgentAssertionError(runtimeValue));
  }
}

function Error_0(message, cause){
  this.cause_0 = cause;
  this.detailMessage = message;
  $fillInStackTrace(this);
  this.initializeBackingError();
}

defineClass(21, 5, $intern_0);
var Ljava_lang_Error_2_classLit = createForClass('java.lang', 'Error', 21);
defineClass(7, 21, $intern_0);
var Ljava_lang_AssertionError_2_classLit = createForClass('java.lang', 'AssertionError', 7);
function UserAgentAsserter$UserAgentAssertionError(runtimeValue){
  Error_0.call(this, 'Possible problem with your *.gwt.xml module file.\nThe compile time user.agent value (gecko1_8) does not match the runtime user.agent value (' + runtimeValue + ').\n' + 'Expect more errors.' == null?'null':toString_6('Possible problem with your *.gwt.xml module file.\nThe compile time user.agent value (gecko1_8) does not match the runtime user.agent value (' + runtimeValue + ').\n' + 'Expect more errors.'), instanceOf('Possible problem with your *.gwt.xml module file.\nThe compile time user.agent value (gecko1_8) does not match the runtime user.agent value (' + runtimeValue + ').\n' + 'Expect more errors.', 5)?castTo('Possible problem with your *.gwt.xml module file.\nThe compile time user.agent value (gecko1_8) does not match the runtime user.agent value (' + runtimeValue + ').\n' + 'Expect more errors.', 5):null);
}

defineClass(35, 7, $intern_0, UserAgentAsserter$UserAgentAssertionError);
var Lcom_google_gwt_useragent_client_UserAgentAsserter$UserAgentAssertionError_2_classLit = createForClass('com.google.gwt.useragent.client', 'UserAgentAsserter/UserAgentAssertionError', 35);
function $getRuntimeValue(){
  var ua = navigator.userAgent.toLowerCase();
  var docMode = $doc.documentMode;
  if (function(){
    return ua.indexOf('webkit') != -1;
  }
  ())
    return 'safari';
  if (function(){
    return ua.indexOf('gecko') != -1 || docMode >= 11;
  }
  ())
    return 'gecko1_8';
  return 'unknown';
}

function $charAt(this$static, index_0){
  return $charAt_0(this$static.string, index_0);
}

function $replace0(this$static, start_0, end, toInsert){
  var length_0;
  length_0 = this$static.string.length;
  end > length_0?(end = length_0):checkCriticalStringElementIndex(start_0, end + 1);
  this$static.string = $substring_0(this$static.string, 0, start_0) + ('' + toInsert) + $substring(this$static.string, end);
}

function $setCharAt(this$static, index_0, x_0){
  $replace0(this$static, index_0, index_0 + 1, String.fromCharCode(x_0));
}

function AbstractStringBuilder(string){
  this.string = string;
}

defineClass(23, 1, {36:1});
_.toString_0 = function toString_7(){
  return this.string;
}
;
var Ljava_lang_AbstractStringBuilder_2_classLit = createForClass('java.lang', 'AbstractStringBuilder', 23);
function ArithmeticException(){
  RuntimeException_0.call(this, 'divide by zero');
}

defineClass(47, 10, $intern_0, ArithmeticException);
var Ljava_lang_ArithmeticException_2_classLit = createForClass('java.lang', 'ArithmeticException', 47);
function ArrayStoreException(){
  RuntimeException.call(this);
}

defineClass(46, 10, $intern_0, ArrayStoreException);
var Ljava_lang_ArrayStoreException_2_classLit = createForClass('java.lang', 'ArrayStoreException', 46);
function $clinit_Boolean(){
  $clinit_Boolean = emptyMethod;
}

booleanCastMap = $intern_4;
var Ljava_lang_Boolean_2_classLit = createForClass('java.lang', 'Boolean', 80);
function digit_0(c){
  if (c >= 48 && c < 48 + $wnd.Math.min(10, 10)) {
    return c - 48;
  }
  if (c >= 97 && c < 97) {
    return c - 97 + 10;
  }
  if (c >= 65 && c < 65) {
    return c - 65 + 10;
  }
  return -1;
}

function ClassCastException(){
  RuntimeException_0.call(this, null);
}

defineClass(38, 10, $intern_0, ClassCastException);
var Ljava_lang_ClassCastException_2_classLit = createForClass('java.lang', 'ClassCastException', 38);
function __parseAndValidateDouble(s){
  floatRegex == null && (floatRegex = new RegExp('^\\s*[+-]?(NaN|Infinity|((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?\\d+)?[dDfF]?)\\s*$'));
  if (!floatRegex.test(s)) {
    throw toJs(new NumberFormatException('For input string: "' + s + '"'));
  }
  return parseFloat(s);
}

function __parseAndValidateInt(s){
  var i, isTooLow, length_0, startIndex, toReturn;
  if (s == null) {
    throw toJs(new NumberFormatException('null'));
  }
  length_0 = s.length;
  startIndex = length_0 > 0 && (checkCriticalStringElementIndex(0, s.length) , s.charCodeAt(0) == 45 || (checkCriticalStringElementIndex(0, s.length) , s.charCodeAt(0) == 43))?1:0;
  for (i = startIndex; i < length_0; i++) {
    if (digit_0((checkCriticalStringElementIndex(i, s.length) , s.charCodeAt(i))) == -1) {
      throw toJs(new NumberFormatException('For input string: "' + s + '"'));
    }
  }
  toReturn = parseInt(s, 10);
  isTooLow = toReturn < $intern_6;
  if (isNaN(toReturn)) {
    throw toJs(new NumberFormatException('For input string: "' + s + '"'));
  }
   else if (isTooLow || toReturn > 2147483647) {
    throw toJs(new NumberFormatException('For input string: "' + s + '"'));
  }
  return toReturn;
}

function __parseAndValidateLong(s){
  var c, firstTime, head, i, length_0, maxDigits, minValue, negative, orig, radixPower, toReturn;
  if (s == null) {
    throw toJs(new NumberFormatException('null'));
  }
  orig = s;
  length_0 = s.length;
  negative = false;
  if (length_0 > 0) {
    c = (checkCriticalStringElementIndex(0, s.length) , s.charCodeAt(0));
    if (c == 45 || c == 43) {
      s = (checkCriticalStringElementIndex(1, s.length + 1) , s.substr(1));
      --length_0;
      negative = c == 45;
    }
  }
  if (length_0 == 0) {
    throw toJs(new NumberFormatException('For input string: "' + orig + '"'));
  }
  while (s.length > 0 && (checkCriticalStringElementIndex(0, s.length) , s.charCodeAt(0) == 48)) {
    s = (checkCriticalStringElementIndex(1, s.length + 1) , s.substr(1));
    --length_0;
  }
  if (length_0 > ($clinit_Number$__ParseLong() , maxLengthForRadix)[10]) {
    throw toJs(new NumberFormatException('For input string: "' + orig + '"'));
  }
  for (i = 0; i < length_0; i++) {
    if (digit_0((checkCriticalStringElementIndex(i, s.length) , s.charCodeAt(i))) == -1) {
      throw toJs(new NumberFormatException('For input string: "' + orig + '"'));
    }
  }
  toReturn = 0;
  maxDigits = maxDigitsForRadix[10];
  radixPower = maxDigitsRadixPower[10];
  minValue = neg_0(maxValueForRadix[10]);
  firstTime = true;
  head = length_0 % maxDigits;
  if (head > 0) {
    toReturn = -parseInt((checkCriticalStringBounds(0, head, s.length) , s.substr(0, head)), 10);
    s = (checkCriticalStringElementIndex(head, s.length + 1) , s.substr(head));
    length_0 -= head;
    firstTime = false;
  }
  while (length_0 >= maxDigits) {
    head = parseInt((checkCriticalStringBounds(0, maxDigits, s.length) , s.substr(0, maxDigits)), 10);
    s = (checkCriticalStringElementIndex(maxDigits, s.length + 1) , s.substr(maxDigits));
    length_0 -= maxDigits;
    if (firstTime) {
      firstTime = false;
    }
     else {
      if (compare_0(toReturn, minValue) < 0) {
        throw toJs(new NumberFormatException('For input string: "' + orig + '"'));
      }
      toReturn = mul_0(toReturn, radixPower);
    }
    toReturn = sub_1(toReturn, head);
  }
  if (compare_0(toReturn, 0) > 0) {
    throw toJs(new NumberFormatException('For input string: "' + orig + '"'));
  }
  if (!negative) {
    toReturn = neg_0(toReturn);
    if (compare_0(toReturn, 0) < 0) {
      throw toJs(new NumberFormatException('For input string: "' + orig + '"'));
    }
  }
  return toReturn;
}

defineClass(81, 1, $intern_1);
var floatRegex;
var Ljava_lang_Number_2_classLit = createForClass('java.lang', 'Number', 81);
doubleCastMap = $intern_4;
var Ljava_lang_Double_2_classLit = createForClass('java.lang', 'Double', 82);
function IllegalArgumentException(){
  RuntimeException.call(this);
}

function IllegalArgumentException_0(message){
  RuntimeException_0.call(this, message);
}

defineClass(8, 10, $intern_0, IllegalArgumentException, IllegalArgumentException_0);
var Ljava_lang_IllegalArgumentException_2_classLit = createForClass('java.lang', 'IllegalArgumentException', 8);
function IllegalStateException(s){
  RuntimeException_0.call(this, s);
}

defineClass(44, 10, $intern_0, IllegalStateException);
var Ljava_lang_IllegalStateException_2_classLit = createForClass('java.lang', 'IllegalStateException', 44);
function IndexOutOfBoundsException(message){
  RuntimeException_0.call(this, message);
}

defineClass(31, 10, $intern_0, IndexOutOfBoundsException);
var Ljava_lang_IndexOutOfBoundsException_2_classLit = createForClass('java.lang', 'IndexOutOfBoundsException', 31);
function numberOfLeadingZeros_0(i){
  var m, n, y_0;
  if (i < 0) {
    return 0;
  }
   else if (i == 0) {
    return 32;
  }
   else {
    y_0 = -(i >> 16);
    m = y_0 >> 16 & 16;
    n = 16 - m;
    i = i >> m;
    y_0 = i - 256;
    m = y_0 >> 16 & 8;
    n += m;
    i <<= m;
    y_0 = i - 4096;
    m = y_0 >> 16 & 4;
    n += m;
    i <<= m;
    y_0 = i - 16384;
    m = y_0 >> 16 & 2;
    n += m;
    i <<= m;
    y_0 = i >> 14;
    m = y_0 & ~(y_0 >> 1);
    return n + 2 - m;
  }
}

function numberOfTrailingZeros(i){
  var r, rtn;
  if (i == 0) {
    return 32;
  }
   else {
    rtn = 0;
    for (r = 1; (r & i) == 0; r <<= 1) {
      ++rtn;
    }
    return rtn;
  }
}

var Ljava_lang_Integer_2_classLit = createForClass('java.lang', 'Integer', null);
defineClass(116, 1, {});
function NullPointerException(){
  RuntimeException.call(this);
}

defineClass(45, 29, $intern_0, NullPointerException);
_.createError = function createError_0(msg){
  return new TypeError(msg);
}
;
var Ljava_lang_NullPointerException_2_classLit = createForClass('java.lang', 'NullPointerException', 45);
function $clinit_Number$__ParseLong(){
  $clinit_Number$__ParseLong = emptyMethod;
  var i;
  maxDigitsForRadix = stampJavaTypeInfo(getClassLiteralForArray(I_classLit, 1), $intern_1, 11, 15, [-1, -1, 30, 19, 15, 13, 11, 11, 10, 9, 9, 8, 8, 8, 8, 7, 7, 7, 7, 7, 7, 7, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 5]);
  maxDigitsRadixPower = initUnidimensionalArray(I_classLit, $intern_1, 11, 37, 15, 1);
  maxLengthForRadix = stampJavaTypeInfo(getClassLiteralForArray(I_classLit, 1), $intern_1, 11, 15, [-1, -1, 63, 40, 32, 28, 25, 23, 21, 20, 19, 19, 18, 18, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 14, 14, 14, 13, 13, 13, 13, 13, 13, 13, 13]);
  maxValueForRadix = initUnidimensionalArray(J_classLit, $intern_1, 11, 37, 14, 1);
  for (i = 2; i <= 36; i++) {
    maxDigitsRadixPower[i] = round_int($wnd.Math.pow(i, maxDigitsForRadix[i]));
    maxValueForRadix[i] = div({l:$intern_7, m:$intern_7, h:524287}, maxDigitsRadixPower[i]);
  }
}

var maxDigitsForRadix, maxDigitsRadixPower, maxLengthForRadix, maxValueForRadix;
function NumberFormatException(message){
  IllegalArgumentException_0.call(this, message);
}

defineClass(6, 8, {3:1, 6:1, 5:1}, NumberFormatException);
var Ljava_lang_NumberFormatException_2_classLit = createForClass('java.lang', 'NumberFormatException', 6);
function $charAt_0(this$static, index_0){
  checkCriticalStringElementIndex(index_0, this$static.length);
  return this$static.charCodeAt(index_0);
}

function $endsWith(this$static, suffix){
  var suffixlength;
  suffixlength = suffix.length;
  return $equals(this$static.substr(this$static.length - suffixlength, suffixlength), suffix);
}

function $equals(this$static, other){
  return checkCriticalNotNull(this$static) , maskUndefined(this$static) === maskUndefined(other);
}

function $hashCode(this$static){
  var h, i;
  h = 0;
  for (i = 0; i < this$static.length; i++) {
    h = (h << 5) - h + (checkCriticalStringElementIndex(i, this$static.length) , this$static.charCodeAt(i)) | 0;
  }
  return h;
}

function $indexOf(this$static, str){
  return this$static.indexOf(str);
}

function $indexOf_0(this$static, str, startIndex){
  return this$static.indexOf(str, startIndex);
}

function $startsWith(this$static, prefix){
  return $equals(this$static.substr(0, prefix.length), prefix);
}

function $startsWith_0(this$static, prefix, toffset){
  return toffset >= 0 && $equals(this$static.substr(toffset, prefix.length), prefix);
}

function $substring(this$static, beginIndex){
  checkCriticalStringElementIndex(beginIndex, this$static.length + 1);
  return this$static.substr(beginIndex);
}

function $substring_0(this$static, beginIndex, endIndex){
  checkCriticalStringBounds(beginIndex, endIndex, this$static.length);
  return this$static.substr(beginIndex, endIndex - beginIndex);
}

function $toLowerCase(this$static, locale){
  return locale == ($clinit_Locale() , $clinit_Locale() , defaultLocale)?this$static.toLocaleLowerCase():this$static.toLowerCase();
}

function fromCharCode(array){
  return String.fromCharCode.apply(null, array);
}

function fromCodePoint(codePoint){
  var hiSurrogate, loSurrogate;
  if (codePoint >= 65536) {
    hiSurrogate = 55296 + (codePoint - 65536 >> 10 & 1023) & $intern_2;
    loSurrogate = 56320 + (codePoint - 65536 & 1023) & $intern_2;
    return String.fromCharCode(hiSurrogate) + ('' + String.fromCharCode(loSurrogate));
  }
   else {
    return String.fromCharCode(codePoint & $intern_2);
  }
}

function valueOf(x_0){
  return valueOf_0(x_0, x_0.length);
}

function valueOf_0(x_0, count){
  var batchEnd, batchStart, end, s;
  end = count;
  checkCriticalStringBounds(0, end, x_0.length);
  s = '';
  for (batchStart = 0; batchStart < end;) {
    batchEnd = $wnd.Math.min(batchStart + 10000, end);
    s += fromCharCode(x_0.slice(batchStart, batchEnd));
    batchStart = batchEnd;
  }
  return s;
}

stringCastMap = {3:1, 36:1, 15:1, 2:1};
var Ljava_lang_String_2_classLit = createForClass('java.lang', 'String', 2);
function $append(this$static, x_0){
  this$static.string += String.fromCharCode(x_0);
  return this$static;
}

function $append_0(this$static, x_0){
  this$static.string += '' + x_0;
  return this$static;
}

function $append_1(this$static, x_0){
  this$static.string += '' + x_0;
  return this$static;
}

function $delete(this$static, start_0, end){
  $replace0(this$static, start_0, end, '');
  return this$static;
}

function $insert(this$static, index_0, x_0){
  $replace0(this$static, index_0, index_0, x_0);
  return this$static;
}

function StringBuilder(){
  AbstractStringBuilder.call(this, '');
}

function StringBuilder_0(){
  AbstractStringBuilder.call(this, '');
}

function StringBuilder_1(s){
  AbstractStringBuilder.call(this, (checkCriticalNotNull(s) , s));
}

defineClass(12, 23, {36:1}, StringBuilder, StringBuilder_0, StringBuilder_1);
var Ljava_lang_StringBuilder_2_classLit = createForClass('java.lang', 'StringBuilder', 12);
function StringIndexOutOfBoundsException(message){
  IndexOutOfBoundsException.call(this, message);
}

defineClass(32, 31, $intern_0, StringIndexOutOfBoundsException);
var Ljava_lang_StringIndexOutOfBoundsException_2_classLit = createForClass('java.lang', 'StringIndexOutOfBoundsException', 32);
defineClass(121, 1, {});
function $toString_0(this$static){
  var e, e$iterator, joiner;
  joiner = new StringJoiner('[', ']');
  for (e$iterator = this$static.iterator(); e$iterator.hasNext_0();) {
    e = e$iterator.next_0();
    $add_0(joiner, maskUndefined(e) === maskUndefined(this$static)?'(this Collection)':e == null?'null':toString_6(e));
  }
  return !joiner.builder?joiner.emptyValue:joiner.suffix.length == 0?joiner.builder.string:joiner.builder.string + ('' + joiner.suffix);
}

defineClass(87, 1, {});
_.toString_0 = function toString_9(){
  return $toString_0(this);
}
;
var Ljava_util_AbstractCollection_2_classLit = createForClass('java.util', 'AbstractCollection', 87);
function $toString_1(this$static, o){
  return o === this$static?'(this Map)':o == null?'null':toString_6(o);
}

function getEntryValueOrNull(entry){
  return !entry?null:entry.getValue();
}

defineClass(86, 1, {34:1});
_.hashCode_0 = function hashCode_3(){
  return hashCode_8(new AbstractHashMap$EntrySet(this));
}
;
_.toString_0 = function toString_10(){
  var entry, entry$iterator, joiner;
  joiner = new StringJoiner('{', '}');
  for (entry$iterator = new AbstractHashMap$EntrySetIterator((new AbstractHashMap$EntrySet(this)).this$01); entry$iterator.hasNext;) {
    entry = $next(entry$iterator);
    $add_0(joiner, $toString_1(this, entry.getKey()) + '=' + $toString_1(this, entry.getValue()));
  }
  return !joiner.builder?joiner.emptyValue:joiner.suffix.length == 0?joiner.builder.string:joiner.builder.string + ('' + joiner.suffix);
}
;
var Ljava_util_AbstractMap_2_classLit = createForClass('java.util', 'AbstractMap', 86);
function $getStringValue(this$static, key){
  var chain;
  return key == null?getEntryValueOrNull($findEntryInChain((chain = this$static.hashCodeMap.backingMap.get(0) , chain == null?initUnidimensionalArray(Ljava_lang_Object_2_classLit, $intern_1, 1, 0, 5, 1):chain))):$get_0(this$static.stringMap, key);
}

function $putStringValue(this$static, key, value_0){
  return key == null?$put(this$static.hashCodeMap, value_0):$put_0(this$static.stringMap, key, value_0);
}

defineClass(51, 86, {34:1});
_.modCount = 0;
var Ljava_util_AbstractHashMap_2_classLit = createForClass('java.util', 'AbstractHashMap', 51);
defineClass(88, 87, {68:1});
_.hashCode_0 = function hashCode_4(){
  return hashCode_8(this);
}
;
var Ljava_util_AbstractSet_2_classLit = createForClass('java.util', 'AbstractSet', 88);
function AbstractHashMap$EntrySet(this$0){
  this.this$01 = this$0;
}

defineClass(17, 88, {17:1, 68:1}, AbstractHashMap$EntrySet);
_.iterator = function iterator(){
  return new AbstractHashMap$EntrySetIterator(this.this$01);
}
;
var Ljava_util_AbstractHashMap$EntrySet_2_classLit = createForClass('java.util', 'AbstractHashMap/EntrySet', 17);
function $computeHasNext(this$static){
  if (this$static.current.hasNext_0()) {
    return true;
  }
  if (this$static.current != this$static.stringMapEntries) {
    return false;
  }
  this$static.current = new InternalHashCodeMap$1(this$static.this$01.hashCodeMap);
  return this$static.current.hasNext_0();
}

function $next(this$static){
  var rv;
  checkCriticalConcurrentModification(this$static.this$01.modCount, this$static.lastModCount);
  checkCriticalElement(this$static.hasNext);
  rv = castTo(this$static.current.next_0(), 13);
  this$static.hasNext = $computeHasNext(this$static);
  return rv;
}

function AbstractHashMap$EntrySetIterator(this$0){
  this.this$01 = this$0;
  this.stringMapEntries = new InternalStringMap$1(this.this$01.stringMap);
  this.current = this.stringMapEntries;
  this.hasNext = $computeHasNext(this);
  this.lastModCount = this.this$01.modCount;
}

defineClass(18, 1, {}, AbstractHashMap$EntrySetIterator);
_.next_0 = function next_0(){
  return $next(this);
}
;
_.hasNext_0 = function hasNext(){
  return this.hasNext;
}
;
_.hasNext = false;
_.lastModCount = 0;
var Ljava_util_AbstractHashMap$EntrySetIterator_2_classLit = createForClass('java.util', 'AbstractHashMap/EntrySetIterator', 18);
defineClass(92, 87, {69:1});
_.hashCode_0 = function hashCode_5(){
  return hashCode_9(this);
}
;
_.iterator = function iterator_0(){
  return new AbstractList$IteratorImpl(this);
}
;
var Ljava_util_AbstractList_2_classLit = createForClass('java.util', 'AbstractList', 92);
function AbstractList$IteratorImpl(this$0){
  this.this$01 = this$0;
}

defineClass(56, 1, {}, AbstractList$IteratorImpl);
_.hasNext_0 = function hasNext_0(){
  return this.i < this.this$01.array.length;
}
;
_.next_0 = function next_1(){
  checkCriticalElement(this.i < this.this$01.array.length);
  return $get(this.this$01, this.i++);
}
;
_.i = 0;
var Ljava_util_AbstractList$IteratorImpl_2_classLit = createForClass('java.util', 'AbstractList/IteratorImpl', 56);
defineClass(52, 1, $intern_13);
_.getKey = function getKey(){
  return this.key;
}
;
_.getValue = function getValue(){
  return this.value_0;
}
;
_.hashCode_0 = function hashCode_6(){
  return hashCode_10(this.key) ^ hashCode_10(this.value_0);
}
;
_.setValue = function setValue(value_0){
  var oldValue;
  oldValue = this.value_0;
  this.value_0 = value_0;
  return oldValue;
}
;
_.toString_0 = function toString_11(){
  return this.key + '=' + this.value_0;
}
;
var Ljava_util_AbstractMap$AbstractEntry_2_classLit = createForClass('java.util', 'AbstractMap/AbstractEntry', 52);
function AbstractMap$SimpleEntry(value_0){
  this.key = null;
  this.value_0 = value_0;
}

defineClass(53, 52, $intern_13, AbstractMap$SimpleEntry);
var Ljava_util_AbstractMap$SimpleEntry_2_classLit = createForClass('java.util', 'AbstractMap/SimpleEntry', 53);
defineClass(93, 1, $intern_13);
_.hashCode_0 = function hashCode_7(){
  return hashCode_10(this.val$entry2.value[0]) ^ hashCode_10($getValue(this));
}
;
_.toString_0 = function toString_12(){
  return this.val$entry2.value[0] + '=' + $getValue(this);
}
;
var Ljava_util_AbstractMapEntry_2_classLit = createForClass('java.util', 'AbstractMapEntry', 93);
function $add(this$static, o){
  push_1(this$static.array, o);
  return true;
}

function $get(this$static, index_0){
  checkCriticalElementIndex(index_0, this$static.array.length);
  return this$static.array[index_0];
}

function ArrayList(){
  this.array = initUnidimensionalArray(Ljava_lang_Object_2_classLit, $intern_1, 1, 0, 5, 1);
}

defineClass(26, 92, {3:1, 26:1, 69:1}, ArrayList);
_.iterator = function iterator_1(){
  return new ArrayList$1(this);
}
;
var Ljava_util_ArrayList_2_classLit = createForClass('java.util', 'ArrayList', 26);
function $next_0(this$static){
  checkCriticalElement(this$static.i < this$static.this$01.array.length);
  this$static.last = this$static.i++;
  return this$static.this$01.array[this$static.last];
}

function ArrayList$1(this$0){
  this.this$01 = this$0;
}

defineClass(20, 1, {}, ArrayList$1);
_.hasNext_0 = function hasNext_1(){
  return this.i < this.this$01.array.length;
}
;
_.next_0 = function next_2(){
  return $next_0(this);
}
;
_.i = 0;
_.last = -1;
var Ljava_util_ArrayList$1_2_classLit = createForClass('java.util', 'ArrayList/1', 20);
function hashCode_8(collection){
  var e, e$iterator, hashCode;
  hashCode = 0;
  for (e$iterator = new AbstractHashMap$EntrySetIterator(collection.this$01); e$iterator.hasNext;) {
    e = $next(e$iterator);
    hashCode = hashCode + (e?hashCode__I__devirtual$(e):0);
    hashCode = hashCode | 0;
  }
  return hashCode;
}

function hashCode_9(list){
  var e, e$iterator, hashCode;
  hashCode = 1;
  for (e$iterator = new ArrayList$1(list); e$iterator.i < e$iterator.this$01.array.length;) {
    e = $next_0(e$iterator);
    hashCode = 31 * hashCode + (e != null?hashCode__I__devirtual$(e):0);
    hashCode = hashCode | 0;
  }
  return hashCode;
}

function ConcurrentModificationException(){
  RuntimeException.call(this);
}

defineClass(66, 10, $intern_0, ConcurrentModificationException);
var Ljava_util_ConcurrentModificationException_2_classLit = createForClass('java.util', 'ConcurrentModificationException', 66);
function $clinit_Date$StringData(){
  $clinit_Date$StringData = emptyMethod;
  DAYS = stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']);
  MONTHS = stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']);
}

var DAYS, MONTHS;
function HashMap(){
  this.hashCodeMap = new InternalHashCodeMap(this);
  this.stringMap = new InternalStringMap(this);
  ++this.modCount;
}

defineClass(19, 51, {3:1, 19:1, 34:1}, HashMap);
var Ljava_util_HashMap_2_classLit = createForClass('java.util', 'HashMap', 19);
function $findEntryInChain(chain){
  var entry, entry$array, entry$index, entry$max;
  for (entry$array = chain , entry$index = 0 , entry$max = entry$array.length; entry$index < entry$max; ++entry$index) {
    entry = entry$array[entry$index];
    if (null == entry.getKey()) {
      return entry;
    }
  }
  return null;
}

function $put(this$static, value_0){
  var chain, chain0, entry;
  chain0 = (chain = this$static.backingMap.get(0) , chain == null?initUnidimensionalArray(Ljava_lang_Object_2_classLit, $intern_1, 1, 0, 5, 1):chain);
  if (chain0.length == 0) {
    this$static.backingMap.set(0, chain0);
  }
   else {
    entry = $findEntryInChain(chain0);
    if (entry) {
      return entry.setValue(value_0);
    }
  }
  setCheck(chain0, chain0.length, new AbstractMap$SimpleEntry(value_0));
  ++this$static.size_0;
  ++this$static.host.modCount;
  return null;
}

function InternalHashCodeMap(host){
  this.backingMap = newJsMap();
  this.host = host;
}

defineClass(57, 1, {}, InternalHashCodeMap);
_.size_0 = 0;
var Ljava_util_InternalHashCodeMap_2_classLit = createForClass('java.util', 'InternalHashCodeMap', 57);
function InternalHashCodeMap$1(this$0){
  this.this$01 = this$0;
  this.chains = this.this$01.backingMap.entries();
  this.chain = initUnidimensionalArray(Ljava_lang_Object_2_classLit, $intern_1, 1, 0, 5, 1);
}

defineClass(58, 1, {}, InternalHashCodeMap$1);
_.next_0 = function next_3(){
  return this.lastEntry = this.chain[this.itemIndex++] , this.lastEntry;
}
;
_.hasNext_0 = function hasNext_2(){
  var current;
  if (this.itemIndex < this.chain.length) {
    return true;
  }
  current = this.chains.next();
  if (!current.done) {
    this.chain = current.value[1];
    this.itemIndex = 0;
    return true;
  }
  return false;
}
;
_.itemIndex = 0;
_.lastEntry = null;
var Ljava_util_InternalHashCodeMap$1_2_classLit = createForClass('java.util', 'InternalHashCodeMap/1', 58);
function $clinit_InternalJsMapFactory(){
  $clinit_InternalJsMapFactory = emptyMethod;
  jsMapCtor = getJsMapConstructor();
}

function canHandleObjectCreateAndProto(){
  if (!Object.create || !Object.getOwnPropertyNames) {
    return false;
  }
  var protoField = '__proto__';
  var map_0 = Object.create(null);
  if (map_0[protoField] !== undefined) {
    return false;
  }
  var keys_0 = Object.getOwnPropertyNames(map_0);
  if (keys_0.length != 0) {
    return false;
  }
  map_0[protoField] = 42;
  if (map_0[protoField] !== 42) {
    return false;
  }
  if (Object.getOwnPropertyNames(map_0).length == 0) {
    return false;
  }
  return true;
}

function getJsMapConstructor(){
  function isCorrectIterationProtocol(){
    try {
      return (new Map).entries().next().done;
    }
     catch (e) {
      return false;
    }
  }

  if (typeof Map === 'function' && Map.prototype.entries && isCorrectIterationProtocol()) {
    return Map;
  }
   else {
    return getJsMapPolyFill();
  }
}

function getJsMapPolyFill(){
  function Stringmap(){
    this.obj = this.createObject();
  }

  ;
  Stringmap.prototype.createObject = function(key){
    return Object.create(null);
  }
  ;
  Stringmap.prototype.get = function(key){
    return this.obj[key];
  }
  ;
  Stringmap.prototype.set = function(key, value_0){
    this.obj[key] = value_0;
  }
  ;
  Stringmap.prototype['delete'] = function(key){
    delete this.obj[key];
  }
  ;
  Stringmap.prototype.keys = function(){
    return Object.getOwnPropertyNames(this.obj);
  }
  ;
  Stringmap.prototype.entries = function(){
    var keys_0 = this.keys();
    var map_0 = this;
    var nextIndex = 0;
    return {next:function(){
      if (nextIndex >= keys_0.length)
        return {done:true};
      var key = keys_0[nextIndex++];
      return {value:[key, map_0.get(key)], done:false};
    }
    };
  }
  ;
  if (!canHandleObjectCreateAndProto()) {
    Stringmap.prototype.createObject = function(){
      return {};
    }
    ;
    Stringmap.prototype.get = function(key){
      return this.obj[':' + key];
    }
    ;
    Stringmap.prototype.set = function(key, value_0){
      this.obj[':' + key] = value_0;
    }
    ;
    Stringmap.prototype['delete'] = function(key){
      delete this.obj[':' + key];
    }
    ;
    Stringmap.prototype.keys = function(){
      var result = [];
      for (var key in this.obj) {
        key.charCodeAt(0) == 58 && result.push(key.substring(1));
      }
      return result;
    }
    ;
  }
  return Stringmap;
}

function newJsMap(){
  $clinit_InternalJsMapFactory();
  return new jsMapCtor;
}

var jsMapCtor;
function $get_0(this$static, key){
  return this$static.backingMap.get(key);
}

function $put_0(this$static, key, value_0){
  var oldValue;
  oldValue = this$static.backingMap.get(key);
  this$static.backingMap.set(key, value_0 === undefined?null:value_0);
  if (oldValue === undefined) {
    ++this$static.size_0;
    ++this$static.host.modCount;
  }
   else {
    ++this$static.valueMod;
  }
  return oldValue;
}

function InternalStringMap(host){
  this.backingMap = newJsMap();
  this.host = host;
}

defineClass(59, 1, {}, InternalStringMap);
_.size_0 = 0;
_.valueMod = 0;
var Ljava_util_InternalStringMap_2_classLit = createForClass('java.util', 'InternalStringMap', 59);
function InternalStringMap$1(this$0){
  this.this$01 = this$0;
  this.entries_0 = this.this$01.backingMap.entries();
  this.current = this.entries_0.next();
}

defineClass(60, 1, {}, InternalStringMap$1);
_.next_0 = function next_4(){
  return this.last = this.current , this.current = this.entries_0.next() , new InternalStringMap$2(this.this$01, this.last, this.this$01.valueMod);
}
;
_.hasNext_0 = function hasNext_3(){
  return !this.current.done;
}
;
var Ljava_util_InternalStringMap$1_2_classLit = createForClass('java.util', 'InternalStringMap/1', 60);
function $getValue(this$static){
  if (this$static.this$01.valueMod != this$static.val$lastValueMod3) {
    return $get_0(this$static.this$01, this$static.val$entry2.value[0]);
  }
  return this$static.val$entry2.value[1];
}

function InternalStringMap$2(this$0, val$entry, val$lastValueMod){
  this.this$01 = this$0;
  this.val$entry2 = val$entry;
  this.val$lastValueMod3 = val$lastValueMod;
}

defineClass(61, 93, $intern_13, InternalStringMap$2);
_.getKey = function getKey_0(){
  return this.val$entry2.value[0];
}
;
_.getValue = function getValue_0(){
  return $getValue(this);
}
;
_.setValue = function setValue_0(object){
  return $put_0(this.this$01, this.val$entry2.value[0], object);
}
;
_.val$lastValueMod3 = 0;
var Ljava_util_InternalStringMap$2_2_classLit = createForClass('java.util', 'InternalStringMap/2', 61);
function $clinit_Locale(){
  $clinit_Locale = emptyMethod;
  ROOT = new Locale$1;
  defaultLocale = new Locale$4;
}

defineClass(83, 1, {});
var ROOT, defaultLocale;
var Ljava_util_Locale_2_classLit = createForClass('java.util', 'Locale', 83);
function Locale$1(){
}

defineClass(39, 83, {}, Locale$1);
_.toString_0 = function toString_13(){
  return '';
}
;
var Ljava_util_Locale$1_2_classLit = createForClass('java.util', 'Locale/1', 39);
function Locale$4(){
}

defineClass(40, 83, {}, Locale$4);
_.toString_0 = function toString_14(){
  return 'unknown';
}
;
var Ljava_util_Locale$4_2_classLit = createForClass('java.util', 'Locale/4', 40);
function NoSuchElementException(){
  RuntimeException.call(this);
}

defineClass(67, 10, $intern_0, NoSuchElementException);
var Ljava_util_NoSuchElementException_2_classLit = createForClass('java.util', 'NoSuchElementException', 67);
function hashCode_10(o){
  return o != null?hashCode__I__devirtual$(o):0;
}

function $add_0(this$static, newElement){
  !this$static.builder?(this$static.builder = new StringBuilder_1(this$static.prefix)):$append_1(this$static.builder, this$static.delimiter);
  $append_0(this$static.builder, newElement);
  return this$static;
}

function StringJoiner(prefix, suffix){
  this.delimiter = ', ';
  this.prefix = prefix;
  this.suffix = suffix;
  this.emptyValue = this.prefix + ('' + this.suffix);
}

defineClass(30, 1, {}, StringJoiner);
_.toString_0 = function toString_15(){
  return !this.builder?this.emptyValue:this.suffix.length == 0?this.builder.string:this.builder.string + ('' + this.suffix);
}
;
var Ljava_util_StringJoiner_2_classLit = createForClass('java.util', 'StringJoiner', 30);
function push_1(array, o){
  array.push(o);
}

function getObjectIdentityHashCode(o){
  return o.$H || (o.$H = ++nextHash);
}

var nextHash = 0;
function checkCriticalArrayType(expression){
  if (!expression) {
    throw toJs(new ArrayStoreException);
  }
}

function checkCriticalConcurrentModification(currentModCount, recordedModCount){
  if (currentModCount != recordedModCount) {
    throw toJs(new ConcurrentModificationException);
  }
}

function checkCriticalElement(expression){
  if (!expression) {
    throw toJs(new NoSuchElementException);
  }
}

function checkCriticalElementIndex(index_0, size_0){
  if (index_0 < 0 || index_0 >= size_0) {
    throw toJs(new IndexOutOfBoundsException('Index: ' + index_0 + ', Size: ' + size_0));
  }
}

function checkCriticalNotNull(reference){
  if (reference == null) {
    throw toJs(new NullPointerException);
  }
  return reference;
}

function checkCriticalStringBounds(start_0, end, length_0){
  if (start_0 < 0 || end > length_0 || end < start_0) {
    throw toJs(new StringIndexOutOfBoundsException('fromIndex: ' + start_0 + ', toIndex: ' + end + ', length: ' + length_0));
  }
}

function checkCriticalStringElementIndex(index_0, size_0){
  if (index_0 < 0 || index_0 >= size_0) {
    throw toJs(new StringIndexOutOfBoundsException('Index: ' + index_0 + ', Size: ' + size_0));
  }
}

function checkCriticalType(expression){
  if (!expression) {
    throw toJs(new ClassCastException);
  }
}

defineClass(110, 1, {});
function JSDateTextFormatter(format){
  this.dateFormat = format;
  setupNativeFunctions(this);
}

function JSDateTextFormatter_0(pattern){
  JSDateTextFormatter.call(this, ($clinit_DateTimeFormat_0() , getFormat_0(pattern, $getDateTimeFormatInfo(($clinit_LocaleInfo() , $clinit_LocaleInfo() , instance)))));
}

function setupNativeFunctions(obj){
  obj.format = function(date){
    var d = date?'' + date.getTime():null;
    return this.format_0(d);
  }
  ;
  obj.parse = function(s){
    var d = parseFloat(this.parse_0(s));
    return new Date(d);
  }
  ;
}

defineClass(24, 1, {}, JSDateTextFormatter, JSDateTextFormatter_0);
_.format_0 = function format_0(value_0){
  if (value_0 == null) {
    return null;
  }
  if (!instanceOfString(value_0)) {
    throw toJs(new IllegalArgumentException);
  }
  return $format(this.dateFormat, new Date_2(__parseAndValidateLong(castToString(value_0))), null);
}
;
_.parse_0 = function parse_0(value_0){
  if (value_0 == null || value_0.length == 0) {
    return null;
  }
  return '' + toString_5(fromDouble_0($parse_0(this.dateFormat, value_0).jsdate.getTime()));
}
;
var Lorg_pentaho_gwt_widgets_client_formatter_JSDateTextFormatter_2_classLit = createForClass('org.pentaho.gwt.widgets.client.formatter', 'JSDateTextFormatter', 24);
function JSNumberTextFormatter(pattern){
  this.formatter = ($clinit_NumberFormat() , new NumberFormat_0(pattern, ['EUR', '\u20AC', 2, '\u20AC', '\u20AC']));
  setupNativeFunctions_0(this);
}

function setupNativeFunctions_0(obj){
  obj.format = function(number){
    var n = number?'' + number:null;
    return this.format_0(n);
  }
  ;
  obj.parse = function(s){
    return parseFloat(this.parse_0(s));
  }
  ;
}

defineClass(49, 1, {}, JSNumberTextFormatter);
_.format_0 = function format_1(value_0){
  if (value_0 == null) {
    return null;
  }
  if (!instanceOfString(value_0)) {
    throw toJs(new IllegalArgumentException);
  }
  return $format_0(this.formatter, __parseAndValidateDouble(castToString(value_0)));
}
;
_.parse_0 = function parse_1(value_0){
  if (value_0 == null || value_0.length == 0) {
    return null;
  }
  return '' + $parse_1(this.formatter, value_0);
}
;
var Lorg_pentaho_gwt_widgets_client_formatter_JSNumberTextFormatter_2_classLit = createForClass('org.pentaho.gwt.widgets.client.formatter', 'JSNumberTextFormatter', 49);
function $addNativeMethods(){
  $wnd.jsTextFormatter = {createFormatter:function(type_0, pattern){
    return createFormatter(type_0, pattern);
  }
  , createDefaultDateFormatter:function(){
    return new JSDateTextFormatter(getFormat(($clinit_DateTimeFormat$PredefinedFormat() , DATE_LONG)));
  }
  };
}

function createFormatter(type_0, pattern){
  if ($equals('number', type_0) || $equals(($ensureNamesAreInitialized(Ljava_lang_Number_2_classLit) , Ljava_lang_Number_2_classLit.typeName), type_0) || $equals(($ensureNamesAreInitialized(Ljava_lang_Byte_2_classLit) , Ljava_lang_Byte_2_classLit.typeName), type_0) || $equals(($ensureNamesAreInitialized(Ljava_lang_Short_2_classLit) , Ljava_lang_Short_2_classLit.typeName), type_0) || $equals(($ensureNamesAreInitialized(Ljava_lang_Integer_2_classLit) , Ljava_lang_Integer_2_classLit.typeName), type_0) || $equals(($ensureNamesAreInitialized(Ljava_lang_Long_2_classLit) , Ljava_lang_Long_2_classLit.typeName), type_0) || $equals(($ensureNamesAreInitialized(Ljava_lang_Float_2_classLit) , Ljava_lang_Float_2_classLit.typeName), type_0) || $equals(($ensureNamesAreInitialized(Ljava_lang_Double_2_classLit) , Ljava_lang_Double_2_classLit.typeName), type_0) || $equals('java.math.BigDecimal', type_0) || $equals('java.math.BigInteger', type_0)) {
    return new JSNumberTextFormatter(pattern);
  }
   else if ($equals('date', type_0) || $equals(($ensureNamesAreInitialized(Ljava_util_Date_2_classLit) , Ljava_util_Date_2_classLit.typeName), type_0) || $equals(($ensureNamesAreInitialized(Ljava_sql_Date_2_classLit) , Ljava_sql_Date_2_classLit.typeName), type_0) || $equals(($ensureNamesAreInitialized(Ljava_sql_Time_2_classLit) , Ljava_sql_Time_2_classLit.typeName), type_0) || $equals(($ensureNamesAreInitialized(Ljava_sql_Timestamp_2_classLit) , Ljava_sql_Timestamp_2_classLit.typeName), type_0)) {
    return new JSDateTextFormatter_0(pattern);
  }
  return null;
}

var C_classLit = createForPrimitive('char', 'C');
var I_classLit = createForPrimitive('int', 'I');
var J_classLit = createForPrimitive('long', 'J');
var Ljava_lang_Byte_2_classLit = createForClass('java.lang', 'Byte', null);
var Ljava_lang_Float_2_classLit = createForClass('java.lang', 'Float', null);
var Ljava_lang_Long_2_classLit = createForClass('java.lang', 'Long', null);
var Ljava_lang_Short_2_classLit = createForClass('java.lang', 'Short', null);
var Ljava_sql_Date_2_classLit = createForClass('java.sql', 'Date', null);
var Ljava_sql_Time_2_classLit = createForClass('java.sql', 'Time', null);
var Ljava_sql_Timestamp_2_classLit = createForClass('java.sql', 'Timestamp', null);
var $entry = ($clinit_Impl() , entry_0);
var gwtOnLoad = gwtOnLoad = gwtOnLoad_0;
addInitFunctions(init);
setGwtProperty('permProps', [[['locale', 'de'], ['user.agent', 'gecko1_8']]]);
$sendStats('moduleStartup', 'moduleEvalEnd');
gwtOnLoad(__gwtModuleFunction.__errFn, __gwtModuleFunction.__moduleName, __gwtModuleFunction.__moduleBase, __gwtModuleFunction.__softPermutationId,__gwtModuleFunction.__computePropValue);
$sendStats('moduleStartup', 'end');
$gwt && $gwt.permProps && __gwtModuleFunction.__moduleStartupDone($gwt.permProps);
//# sourceURL=formatter-0.js

