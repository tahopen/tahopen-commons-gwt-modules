var $wnd = $wnd || window.parent;
var __gwtModuleFunction = $wnd.org_pentaho_gwt_widgets_Widgets;
var $sendStats = __gwtModuleFunction.__sendStats;
$sendStats('moduleStartup', 'moduleEvalStart');
var $gwt_version = "2.10.0";
var $strongName = '87FBF77A0F8A583FE7CAFDC87C835CA4';
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
var $intern_0 = 3.141592653589793, $intern_1 = {3:1}, $intern_2 = {3:1, 19:1, 12:1, 8:1}, $intern_3 = {16:1, 17:1, 3:1, 5:1, 4:1}, $intern_4 = {17:1, 49:1, 3:1, 5:1, 4:1}, $intern_5 = {17:1, 50:1, 3:1, 5:1, 4:1}, $intern_6 = {17:1, 51:1, 3:1, 5:1, 4:1}, $intern_7 = {24:1, 3:1, 5:1, 4:1}, $intern_8 = {17:1, 43:1, 3:1, 5:1, 4:1}, $intern_9 = {81:1, 3:1, 19:1, 12:1, 8:1}, $intern_10 = {36:1, 3:1, 19:1, 8:1}, $intern_11 = 65535, $intern_12 = 4194303, $intern_13 = 1048575, $intern_14 = 524288, $intern_15 = 4194304, $intern_16 = 17592186044416, $intern_17 = -17592186044416, $intern_18 = {112:1, 3:1}, $intern_19 = {21:1, 482:1}, $intern_20 = {136:1, 21:1}, $intern_21 = 65536, $intern_22 = 1048576, $intern_23 = 16777216, $intern_24 = 33554432, $intern_25 = 67108864, $intern_26 = {14:1, 10:1, 13:1, 11:1, 15:1, 9:1, 6:1}, $intern_27 = {14:1, 10:1, 13:1, 44:1, 61:1, 11:1, 15:1, 9:1, 6:1}, $intern_28 = {14:1, 10:1, 13:1, 11:1, 15:1, 47:1, 9:1, 6:1}, $intern_29 = {168:1, 484:1, 170:1, 171:1, 169:1, 21:1}, $intern_30 = {14:1, 10:1, 13:1, 61:1, 11:1, 15:1, 9:1, 6:1}, $intern_31 = {488:1, 21:1}, $intern_32 = {485:1, 21:1}, $intern_33 = {487:1, 21:1}, $intern_34 = {483:1, 21:1}, $intern_35 = {14:1, 10:1, 13:1, 11:1, 15:1, 107:1, 9:1, 6:1}, $intern_36 = {53:1, 3:1, 5:1, 4:1}, $intern_37 = {3:1, 62:1, 8:1}, $intern_38 = {38:1, 77:1}, $intern_39 = {38:1, 37:1}, $intern_40 = {23:1}, $intern_41 = {3:1, 38:1, 37:1, 167:1}, $intern_42 = {486:1, 21:1}, $intern_43 = {135:1, 3:1}, $intern_44 = {14:1, 10:1, 13:1, 11:1, 15:1, 60:1, 137:1, 47:1, 9:1, 6:1}, $intern_45 = {138:1};
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

function toString_14(object){
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
function $equals(this$static, other){
  return maskUndefined(this$static) === maskUndefined(other);
}

function Object_0(){
}

function equals_Ljava_lang_Object__Z__devirtual$(this$static, other){
  return instanceOfString(this$static)?$equals_1(this$static, other):instanceOfDouble(this$static)?(checkCriticalNotNull(this$static) , maskUndefined(this$static) === maskUndefined(other)):instanceOfBoolean(this$static)?(checkCriticalNotNull(this$static) , maskUndefined(this$static) === maskUndefined(other)):hasJavaObjectVirtualDispatch(this$static)?this$static.equals_0(other):isJavaArray(this$static)?$equals(this$static, other):$equals_0(this$static, other);
}

function getClass__Ljava_lang_Class___devirtual$(this$static){
  return instanceOfString(this$static)?Ljava_lang_String_2_classLit:instanceOfDouble(this$static)?Ljava_lang_Double_2_classLit:instanceOfBoolean(this$static)?Ljava_lang_Boolean_2_classLit:hasJavaObjectVirtualDispatch(this$static)?this$static.___clazz:isJavaArray(this$static)?this$static.___clazz:this$static.___clazz || Array.isArray(this$static) && getClassLiteralForArray(Lcom_google_gwt_core_client_JavaScriptObject_2_classLit, 1) || Lcom_google_gwt_core_client_JavaScriptObject_2_classLit;
}

function hashCode__I__devirtual$(this$static){
  return instanceOfString(this$static)?$hashCode_1(this$static):instanceOfDouble(this$static)?$hashCode_0(this$static):instanceOfBoolean(this$static)?(checkCriticalNotNull(this$static) , this$static)?1231:1237:hasJavaObjectVirtualDispatch(this$static)?this$static.hashCode_0():isJavaArray(this$static)?getObjectIdentityHashCode(this$static):$hashCode(this$static);
}

defineClass(1, null, {}, Object_0);
_.equals_0 = function equals(other){
  return $equals(this, other);
}
;
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
_.equals = function(other){
  return this.equals_0(other);
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

function castToJsoArray(src_0, dstId){
  checkCriticalType(src_0 == null || canCast(src_0, dstId) || !(src_0.typeMarker === typeMarkerFn) && Array.isArray(src_0));
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

function throwClassCastExceptionUnlessNull(o){
  checkCriticalType(o == null);
  return o;
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
  if (clazz.isArray_1()) {
    var componentType = clazz.componentType;
    componentType.isPrimitive()?(clazz.typeName = '[' + componentType.typeId):!componentType.isArray_1()?(clazz.typeName = '[L' + componentType.getName() + ';'):(clazz.typeName = '[' + componentType.getName());
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

defineClass(139, 1, {}, Class);
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
_.isArray_1 = function isArray_1(){
  return (this.modifiers & 4) != 0;
}
;
_.isPrimitive = function isPrimitive(){
  return (this.modifiers & 1) != 0;
}
;
_.toString_0 = function toString_21(){
  return ((this.modifiers & 2) != 0?'interface ':(this.modifiers & 1) != 0?'':'class ') + ($ensureNamesAreInitialized(this) , this.typeName);
}
;
_.modifiers = 0;
var nextSequentialId = 1;
var Ljava_lang_Object_2_classLit = createForClass('java.lang', 'Object', 1);
var Ljava_lang_Class_2_classLit = createForClass('java.lang', 'Class', 139);
function $cancel(this$static){
  if (!this$static.isRunning) {
    return;
  }
  this$static.wasStarted = this$static.isStarted;
  this$static.element = null;
  this$static.isRunning = false;
  this$static.isStarted = false;
  if (this$static.requestHandle) {
    this$static.requestHandle.cancel();
    this$static.requestHandle = null;
  }
  this$static.wasStarted && this$static.onComplete();
}

function $run(this$static, startTime){
  $cancel(this$static);
  this$static.isRunning = true;
  this$static.isStarted = false;
  this$static.duration = 200;
  this$static.startTime = startTime;
  this$static.element = null;
  ++this$static.runId;
  $execute(this$static.callback, Date.now());
}

function $update(this$static, curTime){
  var curRunId, finished, progress;
  curRunId = this$static.runId;
  finished = curTime >= this$static.startTime + this$static.duration;
  if (this$static.isStarted && !finished) {
    progress = (curTime - this$static.startTime) / this$static.duration;
    this$static.onUpdate((1 + $wnd.Math.cos($intern_0 + progress * $intern_0)) / 2);
    return this$static.isRunning && this$static.runId == curRunId;
  }
  if (!this$static.isStarted && curTime >= this$static.startTime) {
    this$static.isStarted = true;
    this$static.onStart();
    if (!(this$static.isRunning && this$static.runId == curRunId)) {
      return false;
    }
  }
  if (finished) {
    this$static.isRunning = false;
    this$static.isStarted = false;
    this$static.onComplete();
    return false;
  }
  return true;
}

function Animation_0(){
  Animation_1.call(this, (!instance && (instance = !!$wnd.requestAnimationFrame && !!$wnd.cancelAnimationFrame?new AnimationSchedulerImplStandard:new AnimationSchedulerImplTimer) , instance));
}

function Animation_1(scheduler){
  this.callback = new Animation$1(this);
  this.scheduler = scheduler;
}

defineClass(119, 1, {});
_.onComplete = function onComplete(){
  this.onUpdate((1 + $wnd.Math.cos(6.283185307179586)) / 2);
}
;
_.onStart = function onStart(){
  this.onUpdate((1 + $wnd.Math.cos($intern_0)) / 2);
}
;
_.duration = -1;
_.isRunning = false;
_.isStarted = false;
_.runId = -1;
_.startTime = -1;
_.wasStarted = false;
var Lcom_google_gwt_animation_client_Animation_2_classLit = createForClass('com.google.gwt.animation.client', 'Animation', 119);
function $execute(this$static, timestamp){
  $update(this$static.this$01, timestamp)?(this$static.this$01.requestHandle = this$static.this$01.scheduler.requestAnimationFrame_0(this$static.this$01.callback, this$static.this$01.element)):(this$static.this$01.requestHandle = null);
}

function Animation$1(this$0){
  this.this$01 = this$0;
}

defineClass(289, 1, {}, Animation$1);
_.execute = function execute(timestamp){
  $execute(this, timestamp);
}
;
var Lcom_google_gwt_animation_client_Animation$1_2_classLit = createForClass('com.google.gwt.animation.client', 'Animation/1', 289);
defineClass(524, 1, {});
var instance;
var Lcom_google_gwt_animation_client_AnimationScheduler_2_classLit = createForClass('com.google.gwt.animation.client', 'AnimationScheduler', 524);
defineClass(128, 1, {128:1});
var Lcom_google_gwt_animation_client_AnimationScheduler$AnimationHandle_2_classLit = createForClass('com.google.gwt.animation.client', 'AnimationScheduler/AnimationHandle', 128);
function AnimationSchedulerImplStandard(){
}

function cancelImpl(holder){
  $wnd.cancelAnimationFrame(holder.id);
}

function requestImpl(cb, element){
  var callback = $entry(function(){
    var time = Date.now();
    cb.execute(time);
  }
  );
  var handle = $wnd.requestAnimationFrame(callback, element);
  return {id:handle};
}

defineClass(437, 524, {}, AnimationSchedulerImplStandard);
_.requestAnimationFrame_0 = function requestAnimationFrame_0(callback, element){
  var handle;
  handle = requestImpl(callback, element);
  return new AnimationSchedulerImplStandard$1(handle);
}
;
var Lcom_google_gwt_animation_client_AnimationSchedulerImplStandard_2_classLit = createForClass('com.google.gwt.animation.client', 'AnimationSchedulerImplStandard', 437);
function AnimationSchedulerImplStandard$1(val$handle){
  this.val$handle2 = val$handle;
}

defineClass(438, 128, {128:1}, AnimationSchedulerImplStandard$1);
_.cancel = function cancel(){
  cancelImpl(this.val$handle2);
}
;
var Lcom_google_gwt_animation_client_AnimationSchedulerImplStandard$1_2_classLit = createForClass('com.google.gwt.animation.client', 'AnimationSchedulerImplStandard/1', 438);
function $cancelAnimationFrame(this$static, requestId){
  $remove_12(this$static.animationRequests, requestId);
  this$static.animationRequests.array.length == 0 && $cancel_0(this$static.timer);
}

function $updateAnimations(this$static){
  var curAnimations, duration, requestId, requestId$array, requestId$index, requestId$max;
  curAnimations = initUnidimensionalArray(Lcom_google_gwt_animation_client_AnimationSchedulerImplTimer$AnimationHandleImpl_2_classLit, {532:1, 3:1}, 129, this$static.animationRequests.array.length, 0, 1);
  curAnimations = castTo($toArray_1(this$static.animationRequests, curAnimations), 532);
  duration = new Duration;
  for (requestId$array = curAnimations , requestId$index = 0 , requestId$max = requestId$array.length; requestId$index < requestId$max; ++requestId$index) {
    requestId = requestId$array[requestId$index];
    $remove_12(this$static.animationRequests, requestId);
    $execute(requestId.callback, duration.start_0);
  }
  this$static.animationRequests.array.length > 0 && $schedule(this$static.timer, $wnd.Math.max(5, 16 - (Date.now() - duration.start_0)));
}

function AnimationSchedulerImplTimer(){
  this.animationRequests = new ArrayList;
  this.timer = new AnimationSchedulerImplTimer$1(this);
}

defineClass(439, 524, {}, AnimationSchedulerImplTimer);
_.requestAnimationFrame_0 = function requestAnimationFrame_1(callback, element){
  var requestId;
  requestId = new AnimationSchedulerImplTimer$AnimationHandleImpl(this, callback);
  $add_6(this.animationRequests, requestId);
  this.animationRequests.array.length == 1 && $schedule(this.timer, 16);
  return requestId;
}
;
var Lcom_google_gwt_animation_client_AnimationSchedulerImplTimer_2_classLit = createForClass('com.google.gwt.animation.client', 'AnimationSchedulerImplTimer', 439);
function $cancel_0(this$static){
  if (!this$static.timerId) {
    return;
  }
  ++this$static.cancelCounter;
  this$static.isRepeating?clearInterval_0(this$static.timerId.value_0):clearTimeout_0(this$static.timerId.value_0);
  this$static.timerId = null;
}

function $schedule(this$static, delayMillis){
  if (delayMillis < 0) {
    throw toJs(new IllegalArgumentException_0('must be non-negative'));
  }
  !!this$static.timerId && $cancel_0(this$static);
  this$static.isRepeating = false;
  this$static.timerId = valueOf_0(setTimeout_0(createCallback(this$static, this$static.cancelCounter), delayMillis));
}

function Timer(){
}

function clearInterval_0(timerId){
  $wnd.clearInterval(timerId);
}

function clearTimeout_0(timerId){
  $wnd.clearTimeout(timerId);
}

function createCallback(timer, cancelCounter){
  return $entry(function(){
    timer.fire(cancelCounter);
  }
  );
}

function setTimeout_0(func, time){
  return $wnd.setTimeout(func, time);
}

defineClass(100, 1, {});
_.fire = function fire(scheduleCancelCounter){
  if (scheduleCancelCounter != this.cancelCounter) {
    return;
  }
  this.isRepeating || (this.timerId = null);
  this.run();
}
;
_.cancelCounter = 0;
_.isRepeating = false;
_.timerId = null;
var Lcom_google_gwt_user_client_Timer_2_classLit = createForClass('com.google.gwt.user.client', 'Timer', 100);
function AnimationSchedulerImplTimer$1(this$0){
  this.this$01 = this$0;
  Timer.call(this);
}

defineClass(440, 100, {}, AnimationSchedulerImplTimer$1);
_.run = function run(){
  $updateAnimations(this.this$01);
}
;
var Lcom_google_gwt_animation_client_AnimationSchedulerImplTimer$1_2_classLit = createForClass('com.google.gwt.animation.client', 'AnimationSchedulerImplTimer/1', 440);
function AnimationSchedulerImplTimer$AnimationHandleImpl(this$0, callback){
  this.this$01 = this$0;
  this.callback = callback;
}

defineClass(129, 128, {128:1, 129:1}, AnimationSchedulerImplTimer$AnimationHandleImpl);
_.cancel = function cancel_0(){
  $cancelAnimationFrame(this.this$01, this);
}
;
var Lcom_google_gwt_animation_client_AnimationSchedulerImplTimer$AnimationHandleImpl_2_classLit = createForClass('com.google.gwt.animation.client', 'AnimationSchedulerImplTimer/AnimationHandleImpl', 129);
function $removeAriaDescribedbyProperty(element){
  $remove(($clinit_Property() , DESCRIBEDBY), element);
}

function $set(this$static, element){
  $setAttribute(element, 'role', this$static.roleName);
}

function $setAriaDescribedbyProperty(element, value_0){
  $set_0(($clinit_Property() , DESCRIBEDBY), element, value_0);
}

function $setAriaLabelledbyProperty(element, value_0){
  $set_0(($clinit_Property() , LABELLEDBY), element, value_0);
}

function $setTabindexExtraAttribute(element){
  $set_0(($clinit_ExtraAttribute() , TABINDEX), element, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_Integer_2_classLit, 1), $intern_1, 40, 0, [valueOf_0(0)]));
}

function RoleImpl(roleName){
  this.roleName = roleName;
}

defineClass(7, 1, {});
var Lcom_google_gwt_aria_client_RoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'RoleImpl', 7);
function AlertRoleImpl(){
  RoleImpl.call(this, 'alert');
}

defineClass(339, 7, {}, AlertRoleImpl);
var Lcom_google_gwt_aria_client_AlertRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'AlertRoleImpl', 339);
function AlertdialogRoleImpl(){
  RoleImpl.call(this, 'alertdialog');
}

defineClass(338, 7, {}, AlertdialogRoleImpl);
var Lcom_google_gwt_aria_client_AlertdialogRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'AlertdialogRoleImpl', 338);
function ApplicationRoleImpl(){
  RoleImpl.call(this, 'application');
}

defineClass(340, 7, {}, ApplicationRoleImpl);
var Lcom_google_gwt_aria_client_ApplicationRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'ApplicationRoleImpl', 340);
function $getAriaValue(this$static, value_0){
  var buf, item_0, item$array, item$index, item$max;
  buf = new StringBuilder;
  for (item$array = value_0 , item$index = 0 , item$max = item$array.length; item$index < item$max; ++item$index) {
    item_0 = item$array[item$index];
    $append_2($append_2(buf, this$static.getSingleValue(item_0)), ' ');
  }
  return $trim(buf.string);
}

function $remove(this$static, element){
  $removeAttribute(element, this$static.name_0);
}

function $set_0(this$static, element, values){
  $setAttribute(element, this$static.name_0, $getAriaValue(this$static, values));
}

function Attribute(name_0){
  this.name_0 = name_0;
}

defineClass(163, 1, {});
var Lcom_google_gwt_aria_client_Attribute_2_classLit = createForClass('com.google.gwt.aria.client', 'Attribute', 163);
function AriaValueAttribute(name_0){
  Attribute.call(this, name_0);
}

defineClass(27, 163, {}, AriaValueAttribute);
_.getSingleValue = function getSingleValue(value_0){
  return castTo(value_0, 172).getAriaValue();
}
;
var Lcom_google_gwt_aria_client_AriaValueAttribute_2_classLit = createForClass('com.google.gwt.aria.client', 'AriaValueAttribute', 27);
function ArticleRoleImpl(){
  RoleImpl.call(this, 'article');
}

defineClass(341, 7, {}, ArticleRoleImpl);
var Lcom_google_gwt_aria_client_ArticleRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'ArticleRoleImpl', 341);
function BannerRoleImpl(){
  RoleImpl.call(this, 'banner');
}

defineClass(342, 7, {}, BannerRoleImpl);
var Lcom_google_gwt_aria_client_BannerRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'BannerRoleImpl', 342);
function ButtonRoleImpl(){
  RoleImpl.call(this, 'button');
}

defineClass(343, 7, {}, ButtonRoleImpl);
var Lcom_google_gwt_aria_client_ButtonRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'ButtonRoleImpl', 343);
function CheckboxRoleImpl(){
  RoleImpl.call(this, 'checkbox');
}

defineClass(344, 7, {}, CheckboxRoleImpl);
var Lcom_google_gwt_aria_client_CheckboxRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'CheckboxRoleImpl', 344);
function ColumnheaderRoleImpl(){
  RoleImpl.call(this, 'columnheader');
}

defineClass(345, 7, {}, ColumnheaderRoleImpl);
var Lcom_google_gwt_aria_client_ColumnheaderRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'ColumnheaderRoleImpl', 345);
function ComboboxRoleImpl(){
  RoleImpl.call(this, 'combobox');
}

defineClass(346, 7, {}, ComboboxRoleImpl);
var Lcom_google_gwt_aria_client_ComboboxRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'ComboboxRoleImpl', 346);
function ComplementaryRoleImpl(){
  RoleImpl.call(this, 'complementary');
}

defineClass(347, 7, {}, ComplementaryRoleImpl);
var Lcom_google_gwt_aria_client_ComplementaryRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'ComplementaryRoleImpl', 347);
function ContentinfoRoleImpl(){
  RoleImpl.call(this, 'contentinfo');
}

defineClass(348, 7, {}, ContentinfoRoleImpl);
var Lcom_google_gwt_aria_client_ContentinfoRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'ContentinfoRoleImpl', 348);
function DefinitionRoleImpl(){
  RoleImpl.call(this, 'definition');
}

defineClass(349, 7, {}, DefinitionRoleImpl);
var Lcom_google_gwt_aria_client_DefinitionRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'DefinitionRoleImpl', 349);
function DialogRoleImpl(){
  RoleImpl.call(this, 'dialog');
}

defineClass(350, 7, {}, DialogRoleImpl);
var Lcom_google_gwt_aria_client_DialogRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'DialogRoleImpl', 350);
function DirectoryRoleImpl(){
  RoleImpl.call(this, 'directory');
}

defineClass(351, 7, {}, DirectoryRoleImpl);
var Lcom_google_gwt_aria_client_DirectoryRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'DirectoryRoleImpl', 351);
function DocumentRoleImpl(){
  RoleImpl.call(this, 'document');
}

defineClass(352, 7, {}, DocumentRoleImpl);
var Lcom_google_gwt_aria_client_DocumentRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'DocumentRoleImpl', 352);
function $compareTo(this$static, other){
  return this$static.ordinal - other.ordinal;
}

function Enum(name_0, ordinal){
  this.name_0 = name_0;
  this.ordinal = ordinal;
}

defineClass(4, 1, {3:1, 5:1, 4:1});
_.compareTo = function compareTo(other){
  return $compareTo(this, castTo(other, 4));
}
;
_.equals_0 = function equals_0(other){
  return this === other;
}
;
_.hashCode_0 = function hashCode_1(){
  return getObjectIdentityHashCode(this);
}
;
_.toString_0 = function toString_1(){
  return this.name_0 != null?this.name_0:'' + this.ordinal;
}
;
_.ordinal = 0;
var Ljava_lang_Enum_2_classLit = createForClass('java.lang', 'Enum', 4);
function $clinit_ExpandedValue(){
  $clinit_ExpandedValue = emptyMethod;
  TRUE = new ExpandedValue('TRUE', 0);
  FALSE = new ExpandedValue('FALSE', 1);
  UNDEFINED = new ExpandedValue('UNDEFINED', 2);
}

function ExpandedValue(enum$name, enum$ordinal){
  Enum.call(this, enum$name, enum$ordinal);
}

function values_0(){
  $clinit_ExpandedValue();
  return stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_aria_client_ExpandedValue_2_classLit, 1), $intern_1, 82, 0, [TRUE, FALSE, UNDEFINED]);
}

defineClass(82, 4, {172:1, 82:1, 3:1, 5:1, 4:1}, ExpandedValue);
_.getAriaValue = function getAriaValue(){
  switch (this.ordinal) {
    case 0:
      return 'true';
    case 1:
      return 'false';
    case 2:
      return 'undefined';
  }
  return null;
}
;
var FALSE, TRUE, UNDEFINED;
var Lcom_google_gwt_aria_client_ExpandedValue_2_classLit = createForEnum('com.google.gwt.aria.client', 'ExpandedValue', 82, values_0);
function $clinit_ExtraAttribute(){
  $clinit_ExtraAttribute = emptyMethod;
  TABINDEX = new PrimitiveValueAttribute('tabIndex');
}

var TABINDEX;
function FormRoleImpl(){
  RoleImpl.call(this, 'form');
}

defineClass(353, 7, {}, FormRoleImpl);
var Lcom_google_gwt_aria_client_FormRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'FormRoleImpl', 353);
function GridRoleImpl(){
  RoleImpl.call(this, 'grid');
}

defineClass(355, 7, {}, GridRoleImpl);
var Lcom_google_gwt_aria_client_GridRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'GridRoleImpl', 355);
function GridcellRoleImpl(){
  RoleImpl.call(this, 'gridcell');
}

defineClass(354, 7, {}, GridcellRoleImpl);
var Lcom_google_gwt_aria_client_GridcellRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'GridcellRoleImpl', 354);
function GroupRoleImpl(){
  RoleImpl.call(this, 'group');
}

defineClass(356, 7, {}, GroupRoleImpl);
var Lcom_google_gwt_aria_client_GroupRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'GroupRoleImpl', 356);
function $setAriaLevelProperty(element){
  $set_0(($clinit_Property() , LEVEL), element, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_Integer_2_classLit, 1), $intern_1, 40, 0, [valueOf_0(2)]));
}

function HeadingRoleImpl(){
  RoleImpl.call(this, 'heading');
}

defineClass(357, 7, {}, HeadingRoleImpl);
var Lcom_google_gwt_aria_client_HeadingRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'HeadingRoleImpl', 357);
function $init(this$static, elementId){
  this$static.id_0 = elementId;
}

function Id(element){
  $init(this, element.id);
}

function Id_0(elementId){
  this.id_0 = elementId;
}

defineClass(58, 1, {172:1, 58:1}, Id, Id_0);
_.getAriaValue = function getAriaValue_0(){
  return this.id_0;
}
;
var Lcom_google_gwt_aria_client_Id_2_classLit = createForClass('com.google.gwt.aria.client', 'Id', 58);
function ImgRoleImpl(){
  RoleImpl.call(this, 'img');
}

defineClass(358, 7, {}, ImgRoleImpl);
var Lcom_google_gwt_aria_client_ImgRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'ImgRoleImpl', 358);
function LinkRoleImpl(){
  RoleImpl.call(this, 'link');
}

defineClass(359, 7, {}, LinkRoleImpl);
var Lcom_google_gwt_aria_client_LinkRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'LinkRoleImpl', 359);
function ListRoleImpl(){
  RoleImpl.call(this, 'list');
}

defineClass(362, 7, {}, ListRoleImpl);
var Lcom_google_gwt_aria_client_ListRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'ListRoleImpl', 362);
function ListboxRoleImpl(){
  RoleImpl.call(this, 'listbox');
}

defineClass(360, 7, {}, ListboxRoleImpl);
var Lcom_google_gwt_aria_client_ListboxRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'ListboxRoleImpl', 360);
function ListitemRoleImpl(){
  RoleImpl.call(this, 'listitem');
}

defineClass(361, 7, {}, ListitemRoleImpl);
var Lcom_google_gwt_aria_client_ListitemRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'ListitemRoleImpl', 361);
function LogRoleImpl(){
  RoleImpl.call(this, 'log');
}

defineClass(363, 7, {}, LogRoleImpl);
var Lcom_google_gwt_aria_client_LogRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'LogRoleImpl', 363);
function MainRoleImpl(){
  RoleImpl.call(this, 'main');
}

defineClass(364, 7, {}, MainRoleImpl);
var Lcom_google_gwt_aria_client_MainRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'MainRoleImpl', 364);
function MarqueeRoleImpl(){
  RoleImpl.call(this, 'marquee');
}

defineClass(365, 7, {}, MarqueeRoleImpl);
var Lcom_google_gwt_aria_client_MarqueeRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'MarqueeRoleImpl', 365);
function MathRoleImpl(){
  RoleImpl.call(this, 'math');
}

defineClass(366, 7, {}, MathRoleImpl);
var Lcom_google_gwt_aria_client_MathRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'MathRoleImpl', 366);
function MenuRoleImpl(){
  RoleImpl.call(this, 'menu');
}

defineClass(371, 7, {}, MenuRoleImpl);
var Lcom_google_gwt_aria_client_MenuRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'MenuRoleImpl', 371);
function MenubarRoleImpl(){
  RoleImpl.call(this, 'menubar');
}

defineClass(367, 7, {}, MenubarRoleImpl);
var Lcom_google_gwt_aria_client_MenubarRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'MenubarRoleImpl', 367);
function MenuitemRoleImpl(){
  RoleImpl.call(this, 'menuitem');
}

defineClass(370, 7, {}, MenuitemRoleImpl);
var Lcom_google_gwt_aria_client_MenuitemRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'MenuitemRoleImpl', 370);
function MenuitemcheckboxRoleImpl(){
  RoleImpl.call(this, 'menuitemcheckbox');
}

defineClass(368, 7, {}, MenuitemcheckboxRoleImpl);
var Lcom_google_gwt_aria_client_MenuitemcheckboxRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'MenuitemcheckboxRoleImpl', 368);
function MenuitemradioRoleImpl(){
  RoleImpl.call(this, 'menuitemradio');
}

defineClass(369, 7, {}, MenuitemradioRoleImpl);
var Lcom_google_gwt_aria_client_MenuitemradioRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'MenuitemradioRoleImpl', 369);
function NavigationRoleImpl(){
  RoleImpl.call(this, 'navigation');
}

defineClass(372, 7, {}, NavigationRoleImpl);
var Lcom_google_gwt_aria_client_NavigationRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'NavigationRoleImpl', 372);
function NoteRoleImpl(){
  RoleImpl.call(this, 'note');
}

defineClass(373, 7, {}, NoteRoleImpl);
var Lcom_google_gwt_aria_client_NoteRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'NoteRoleImpl', 373);
function OptionRoleImpl(){
  RoleImpl.call(this, 'option');
}

defineClass(374, 7, {}, OptionRoleImpl);
var Lcom_google_gwt_aria_client_OptionRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'OptionRoleImpl', 374);
function PresentationRoleImpl(){
  RoleImpl.call(this, 'presentation');
}

defineClass(375, 7, {}, PresentationRoleImpl);
var Lcom_google_gwt_aria_client_PresentationRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'PresentationRoleImpl', 375);
function PrimitiveValueAttribute(name_0){
  Attribute.call(this, name_0);
}

defineClass(28, 163, {}, PrimitiveValueAttribute);
_.getSingleValue = function getSingleValue_0(value_0){
  return value_0 == null?'null':toString_14(value_0);
}
;
var Lcom_google_gwt_aria_client_PrimitiveValueAttribute_2_classLit = createForClass('com.google.gwt.aria.client', 'PrimitiveValueAttribute', 28);
function ProgressbarRoleImpl(){
  RoleImpl.call(this, 'progressbar');
}

defineClass(376, 7, {}, ProgressbarRoleImpl);
var Lcom_google_gwt_aria_client_ProgressbarRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'ProgressbarRoleImpl', 376);
function $clinit_Property(){
  $clinit_Property = emptyMethod;
  ACTIVEDESCENDANT = new AriaValueAttribute('aria-activedescendant');
  new PrimitiveValueAttribute('aria-atomic');
  new AriaValueAttribute('aria-autocomplete');
  new AriaValueAttribute('aria-controls');
  DESCRIBEDBY = new AriaValueAttribute('aria-describedby');
  new AriaValueAttribute('aria-dropeffect');
  new AriaValueAttribute('aria-flowto');
  new PrimitiveValueAttribute('aria-haspopup');
  new PrimitiveValueAttribute('aria-label');
  LABELLEDBY = new AriaValueAttribute('aria-labelledby');
  LEVEL = new PrimitiveValueAttribute('aria-level');
  new AriaValueAttribute('aria-live');
  new PrimitiveValueAttribute('aria-multiline');
  new PrimitiveValueAttribute('aria-multiselectable');
  new AriaValueAttribute('aria-orientation');
  new AriaValueAttribute('aria-owns');
  POSINSET = new PrimitiveValueAttribute('aria-posinset');
  new PrimitiveValueAttribute('aria-readonly');
  new AriaValueAttribute('aria-relevant');
  new PrimitiveValueAttribute('aria-required');
  SETSIZE = new PrimitiveValueAttribute('aria-setsize');
  new AriaValueAttribute('aria-sort');
  new PrimitiveValueAttribute('aria-valuemax');
  new PrimitiveValueAttribute('aria-valuemin');
  new PrimitiveValueAttribute('aria-valuenow');
  new PrimitiveValueAttribute('aria-valuetext');
}

var ACTIVEDESCENDANT, DESCRIBEDBY, LABELLEDBY, LEVEL, POSINSET, SETSIZE;
function RadioRoleImpl(){
  RoleImpl.call(this, 'radio');
}

defineClass(378, 7, {}, RadioRoleImpl);
var Lcom_google_gwt_aria_client_RadioRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'RadioRoleImpl', 378);
function RadiogroupRoleImpl(){
  RoleImpl.call(this, 'radiogroup');
}

defineClass(377, 7, {}, RadiogroupRoleImpl);
var Lcom_google_gwt_aria_client_RadiogroupRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'RadiogroupRoleImpl', 377);
function RegionRoleImpl(){
  RoleImpl.call(this, 'region');
}

defineClass(379, 7, {}, RegionRoleImpl);
var Lcom_google_gwt_aria_client_RegionRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'RegionRoleImpl', 379);
function $clinit_Roles(){
  $clinit_Roles = emptyMethod;
  ALERTDIALOG = new AlertdialogRoleImpl;
  ALERT = new AlertRoleImpl;
  APPLICATION = new ApplicationRoleImpl;
  ARTICLE = new ArticleRoleImpl;
  BANNER = new BannerRoleImpl;
  BUTTON = new ButtonRoleImpl;
  CHECKBOX = new CheckboxRoleImpl;
  COLUMNHEADER = new ColumnheaderRoleImpl;
  COMBOBOX = new ComboboxRoleImpl;
  COMPLEMENTARY = new ComplementaryRoleImpl;
  CONTENTINFO = new ContentinfoRoleImpl;
  DEFINITION = new DefinitionRoleImpl;
  DIALOG = new DialogRoleImpl;
  DIRECTORY = new DirectoryRoleImpl;
  DOCUMENT = new DocumentRoleImpl;
  FORM = new FormRoleImpl;
  GRIDCELL = new GridcellRoleImpl;
  GRID = new GridRoleImpl;
  GROUP = new GroupRoleImpl;
  HEADING = new HeadingRoleImpl;
  IMG = new ImgRoleImpl;
  LINK = new LinkRoleImpl;
  LISTBOX = new ListboxRoleImpl;
  LISTITEM = new ListitemRoleImpl;
  LIST = new ListRoleImpl;
  LOG = new LogRoleImpl;
  MAIN = new MainRoleImpl;
  MARQUEE = new MarqueeRoleImpl;
  MATH = new MathRoleImpl;
  MENUBAR = new MenubarRoleImpl;
  MENUITEMCHECKBOX = new MenuitemcheckboxRoleImpl;
  MENUITEMRADIO = new MenuitemradioRoleImpl;
  MENUITEM = new MenuitemRoleImpl;
  MENU = new MenuRoleImpl;
  NAVIGATION = new NavigationRoleImpl;
  NOTE = new NoteRoleImpl;
  OPTION = new OptionRoleImpl;
  PRESENTATION = new PresentationRoleImpl;
  PROGRESSBAR = new ProgressbarRoleImpl;
  RADIOGROUP = new RadiogroupRoleImpl;
  RADIO = new RadioRoleImpl;
  REGION = new RegionRoleImpl;
  ROWGROUP = new RowgroupRoleImpl;
  ROWHEADER = new RowheaderRoleImpl;
  ROW = new RowRoleImpl;
  SCROLLBAR = new ScrollbarRoleImpl;
  SEARCH = new SearchRoleImpl;
  SEPARATOR = new SeparatorRoleImpl;
  SLIDER = new SliderRoleImpl;
  SPINBUTTON = new SpinbuttonRoleImpl;
  STATUS = new StatusRoleImpl;
  TABLIST = new TablistRoleImpl;
  TABPANEL = new TabpanelRoleImpl;
  TAB = new TabRoleImpl;
  TEXTBOX = new TextboxRoleImpl;
  TIMER = new TimerRoleImpl;
  TOOLBAR = new ToolbarRoleImpl;
  TOOLTIP = new TooltipRoleImpl;
  TREEGRID = new TreegridRoleImpl;
  TREEITEM = new TreeitemRoleImpl;
  TREE = new TreeRoleImpl;
  ROLES_MAP = new HashMap;
  $putStringValue(ROLES_MAP, 'region', REGION);
  $putStringValue(ROLES_MAP, 'alert', ALERT);
  $putStringValue(ROLES_MAP, 'dialog', DIALOG);
  $putStringValue(ROLES_MAP, 'alertdialog', ALERTDIALOG);
  $putStringValue(ROLES_MAP, 'application', APPLICATION);
  $putStringValue(ROLES_MAP, 'document', DOCUMENT);
  $putStringValue(ROLES_MAP, 'article', ARTICLE);
  $putStringValue(ROLES_MAP, 'banner', BANNER);
  $putStringValue(ROLES_MAP, 'button', BUTTON);
  $putStringValue(ROLES_MAP, 'checkbox', CHECKBOX);
  $putStringValue(ROLES_MAP, 'gridcell', GRIDCELL);
  $putStringValue(ROLES_MAP, 'columnheader', COLUMNHEADER);
  $putStringValue(ROLES_MAP, 'group', GROUP);
  $putStringValue(ROLES_MAP, 'combobox', COMBOBOX);
  $putStringValue(ROLES_MAP, 'complementary', COMPLEMENTARY);
  $putStringValue(ROLES_MAP, 'contentinfo', CONTENTINFO);
  $putStringValue(ROLES_MAP, 'definition', DEFINITION);
  $putStringValue(ROLES_MAP, 'list', LIST);
  $putStringValue(ROLES_MAP, 'directory', DIRECTORY);
  $putStringValue(ROLES_MAP, 'form', FORM);
  $putStringValue(ROLES_MAP, 'grid', GRID);
  $putStringValue(ROLES_MAP, 'heading', HEADING);
  $putStringValue(ROLES_MAP, 'img', IMG);
  $putStringValue(ROLES_MAP, 'link', LINK);
  $putStringValue(ROLES_MAP, 'listbox', LISTBOX);
  $putStringValue(ROLES_MAP, 'listitem', LISTITEM);
  $putStringValue(ROLES_MAP, 'log', LOG);
  $putStringValue(ROLES_MAP, 'main', MAIN);
  $putStringValue(ROLES_MAP, 'marquee', MARQUEE);
  $putStringValue(ROLES_MAP, 'math', MATH);
  $putStringValue(ROLES_MAP, 'menu', MENU);
  $putStringValue(ROLES_MAP, 'menubar', MENUBAR);
  $putStringValue(ROLES_MAP, 'menuitem', MENUITEM);
  $putStringValue(ROLES_MAP, 'menuitemcheckbox', MENUITEMCHECKBOX);
  $putStringValue(ROLES_MAP, 'option', OPTION);
  $putStringValue(ROLES_MAP, 'radio', RADIO);
  $putStringValue(ROLES_MAP, 'menuitemradio', MENUITEMRADIO);
  $putStringValue(ROLES_MAP, 'navigation', NAVIGATION);
  $putStringValue(ROLES_MAP, 'note', NOTE);
  $putStringValue(ROLES_MAP, 'presentation', PRESENTATION);
  $putStringValue(ROLES_MAP, 'progressbar', PROGRESSBAR);
  $putStringValue(ROLES_MAP, 'radiogroup', RADIOGROUP);
  $putStringValue(ROLES_MAP, 'row', ROW);
  $putStringValue(ROLES_MAP, 'rowgroup', ROWGROUP);
  $putStringValue(ROLES_MAP, 'rowheader', ROWHEADER);
  $putStringValue(ROLES_MAP, 'search', SEARCH);
  $putStringValue(ROLES_MAP, 'separator', SEPARATOR);
  $putStringValue(ROLES_MAP, 'scrollbar', SCROLLBAR);
  $putStringValue(ROLES_MAP, 'slider', SLIDER);
  $putStringValue(ROLES_MAP, 'spinbutton', SPINBUTTON);
  $putStringValue(ROLES_MAP, 'status', STATUS);
  $putStringValue(ROLES_MAP, 'tab', TAB);
  $putStringValue(ROLES_MAP, 'tablist', TABLIST);
  $putStringValue(ROLES_MAP, 'tabpanel', TABPANEL);
  $putStringValue(ROLES_MAP, 'textbox', TEXTBOX);
  $putStringValue(ROLES_MAP, 'timer', TIMER);
  $putStringValue(ROLES_MAP, 'toolbar', TOOLBAR);
  $putStringValue(ROLES_MAP, 'tooltip', TOOLTIP);
  $putStringValue(ROLES_MAP, 'tree', TREE);
  $putStringValue(ROLES_MAP, 'treegrid', TREEGRID);
  $putStringValue(ROLES_MAP, 'treeitem', TREEITEM);
}

var ALERT, ALERTDIALOG, APPLICATION, ARTICLE, BANNER, BUTTON, CHECKBOX, COLUMNHEADER, COMBOBOX, COMPLEMENTARY, CONTENTINFO, DEFINITION, DIALOG, DIRECTORY, DOCUMENT, FORM, GRID, GRIDCELL, GROUP, HEADING, IMG, LINK, LIST, LISTBOX, LISTITEM, LOG, MAIN, MARQUEE, MATH, MENU, MENUBAR, MENUITEM, MENUITEMCHECKBOX, MENUITEMRADIO, NAVIGATION, NOTE, OPTION, PRESENTATION, PROGRESSBAR, RADIO, RADIOGROUP, REGION, ROLES_MAP, ROW, ROWGROUP, ROWHEADER, SCROLLBAR, SEARCH, SEPARATOR, SLIDER, SPINBUTTON, STATUS, TAB, TABLIST, TABPANEL, TEXTBOX, TIMER, TOOLBAR, TOOLTIP, TREE, TREEGRID, TREEITEM;
function RowRoleImpl(){
  RoleImpl.call(this, 'row');
}

defineClass(382, 7, {}, RowRoleImpl);
var Lcom_google_gwt_aria_client_RowRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'RowRoleImpl', 382);
function RowgroupRoleImpl(){
  RoleImpl.call(this, 'rowgroup');
}

defineClass(380, 7, {}, RowgroupRoleImpl);
var Lcom_google_gwt_aria_client_RowgroupRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'RowgroupRoleImpl', 380);
function RowheaderRoleImpl(){
  RoleImpl.call(this, 'rowheader');
}

defineClass(381, 7, {}, RowheaderRoleImpl);
var Lcom_google_gwt_aria_client_RowheaderRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'RowheaderRoleImpl', 381);
function ScrollbarRoleImpl(){
  RoleImpl.call(this, 'scrollbar');
}

defineClass(383, 7, {}, ScrollbarRoleImpl);
var Lcom_google_gwt_aria_client_ScrollbarRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'ScrollbarRoleImpl', 383);
function SearchRoleImpl(){
  RoleImpl.call(this, 'search');
}

defineClass(384, 7, {}, SearchRoleImpl);
var Lcom_google_gwt_aria_client_SearchRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'SearchRoleImpl', 384);
function $clinit_SelectedValue(){
  $clinit_SelectedValue = emptyMethod;
  TRUE_0 = new SelectedValue('TRUE', 0);
  FALSE_0 = new SelectedValue('FALSE', 1);
  UNDEFINED_0 = new SelectedValue('UNDEFINED', 2);
}

function SelectedValue(enum$name, enum$ordinal){
  Enum.call(this, enum$name, enum$ordinal);
}

function values_1(){
  $clinit_SelectedValue();
  return stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_aria_client_SelectedValue_2_classLit, 1), $intern_1, 83, 0, [TRUE_0, FALSE_0, UNDEFINED_0]);
}

defineClass(83, 4, {172:1, 83:1, 3:1, 5:1, 4:1}, SelectedValue);
_.getAriaValue = function getAriaValue_1(){
  switch (this.ordinal) {
    case 0:
      return 'true';
    case 1:
      return 'false';
    case 2:
      return 'undefined';
  }
  return null;
}
;
var FALSE_0, TRUE_0, UNDEFINED_0;
var Lcom_google_gwt_aria_client_SelectedValue_2_classLit = createForEnum('com.google.gwt.aria.client', 'SelectedValue', 83, values_1);
function SeparatorRoleImpl(){
  RoleImpl.call(this, 'separator');
}

defineClass(385, 7, {}, SeparatorRoleImpl);
var Lcom_google_gwt_aria_client_SeparatorRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'SeparatorRoleImpl', 385);
function SliderRoleImpl(){
  RoleImpl.call(this, 'slider');
}

defineClass(386, 7, {}, SliderRoleImpl);
var Lcom_google_gwt_aria_client_SliderRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'SliderRoleImpl', 386);
function SpinbuttonRoleImpl(){
  RoleImpl.call(this, 'spinbutton');
}

defineClass(387, 7, {}, SpinbuttonRoleImpl);
var Lcom_google_gwt_aria_client_SpinbuttonRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'SpinbuttonRoleImpl', 387);
function $clinit_State(){
  $clinit_State = emptyMethod;
  new PrimitiveValueAttribute('aria-busy');
  new AriaValueAttribute('aria-checked');
  new PrimitiveValueAttribute('aria-disabled');
  EXPANDED = new AriaValueAttribute('aria-expanded');
  new AriaValueAttribute('aria-grabbed');
  new PrimitiveValueAttribute('aria-hidden');
  new AriaValueAttribute('aria-invalid');
  new AriaValueAttribute('aria-pressed');
  SELECTED = new AriaValueAttribute('aria-selected');
}

var EXPANDED, SELECTED;
function StatusRoleImpl(){
  RoleImpl.call(this, 'status');
}

defineClass(388, 7, {}, StatusRoleImpl);
var Lcom_google_gwt_aria_client_StatusRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'StatusRoleImpl', 388);
function TabRoleImpl(){
  RoleImpl.call(this, 'tab');
}

defineClass(391, 7, {}, TabRoleImpl);
var Lcom_google_gwt_aria_client_TabRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'TabRoleImpl', 391);
function TablistRoleImpl(){
  RoleImpl.call(this, 'tablist');
}

defineClass(389, 7, {}, TablistRoleImpl);
var Lcom_google_gwt_aria_client_TablistRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'TablistRoleImpl', 389);
function TabpanelRoleImpl(){
  RoleImpl.call(this, 'tabpanel');
}

defineClass(390, 7, {}, TabpanelRoleImpl);
var Lcom_google_gwt_aria_client_TabpanelRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'TabpanelRoleImpl', 390);
function TextboxRoleImpl(){
  RoleImpl.call(this, 'textbox');
}

defineClass(392, 7, {}, TextboxRoleImpl);
var Lcom_google_gwt_aria_client_TextboxRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'TextboxRoleImpl', 392);
function TimerRoleImpl(){
  RoleImpl.call(this, 'timer');
}

defineClass(393, 7, {}, TimerRoleImpl);
var Lcom_google_gwt_aria_client_TimerRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'TimerRoleImpl', 393);
function ToolbarRoleImpl(){
  RoleImpl.call(this, 'toolbar');
}

defineClass(394, 7, {}, ToolbarRoleImpl);
var Lcom_google_gwt_aria_client_ToolbarRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'ToolbarRoleImpl', 394);
function TooltipRoleImpl(){
  RoleImpl.call(this, 'tooltip');
}

defineClass(395, 7, {}, TooltipRoleImpl);
var Lcom_google_gwt_aria_client_TooltipRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'TooltipRoleImpl', 395);
function $setAriaActivedescendantProperty(element, value_0){
  $set_0(($clinit_Property() , ACTIVEDESCENDANT), element, stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_aria_client_Id_2_classLit, 1), $intern_1, 58, 0, [value_0]));
}

function TreeRoleImpl(){
  RoleImpl.call(this, 'tree');
}

defineClass(398, 7, {}, TreeRoleImpl);
var Lcom_google_gwt_aria_client_TreeRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'TreeRoleImpl', 398);
function TreegridRoleImpl(){
  RoleImpl.call(this, 'treegrid');
}

defineClass(396, 7, {}, TreegridRoleImpl);
var Lcom_google_gwt_aria_client_TreegridRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'TreegridRoleImpl', 396);
function $setAriaExpandedState(element, value_0){
  $set_0(($clinit_State() , EXPANDED), element, stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_aria_client_ExpandedValue_2_classLit, 1), $intern_1, 82, 0, [value_0]));
}

function $setAriaSelectedState(element, value_0){
  $set_0(($clinit_State() , SELECTED), element, stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_aria_client_SelectedValue_2_classLit, 1), $intern_1, 83, 0, [value_0]));
}

function $setAriaSetsizeProperty(element, value_0){
  $set_0(($clinit_Property() , SETSIZE), element, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_Integer_2_classLit, 1), $intern_1, 40, 0, [valueOf_0(value_0)]));
}

function TreeitemRoleImpl(){
  RoleImpl.call(this, 'treeitem');
}

defineClass(397, 7, {}, TreeitemRoleImpl);
var Lcom_google_gwt_aria_client_TreeitemRoleImpl_2_classLit = createForClass('com.google.gwt.aria.client', 'TreeitemRoleImpl', 397);
function $elapsedMillis(this$static){
  return Date.now() - this$static.start_0;
}

function Duration(){
  this.start_0 = Date.now();
}

defineClass(118, 1, {}, Duration);
_.start_0 = 0;
var Lcom_google_gwt_core_client_Duration_2_classLit = createForClass('com.google.gwt.core.client', 'Duration', 118);
function $addSuppressed(this$static, exception){
  checkCriticalNotNull_0(exception);
  checkCriticalArgument(exception != this$static, 'Exception can not suppress itself.');
  if (this$static.disableSuppression) {
    return;
  }
  this$static.suppressedExceptions == null?(this$static.suppressedExceptions = stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_Throwable_2_classLit, 1), $intern_1, 8, 0, [exception])):(this$static.suppressedExceptions[this$static.suppressedExceptions.length] = exception);
}

function $fillInStackTrace(this$static){
  this$static.writableStackTrace && this$static.backingJsObject !== '__noinit__' && this$static.initializeBackingError();
  return this$static;
}

function $initCause(this$static, cause){
  checkCriticalState_0(!this$static.cause_0);
  checkCriticalArgument(true, 'Self-causation not permitted');
  this$static.cause_0 = cause;
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

function Throwable(message, cause){
  this.cause_0 = cause;
  this.detailMessage = message;
  $fillInStackTrace(this);
  this.initializeBackingError();
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

defineClass(8, 1, {3:1, 8:1});
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
  suppressed = (this.suppressedExceptions == null && (this.suppressedExceptions = initUnidimensionalArray(Ljava_lang_Throwable_2_classLit, $intern_1, 8, 0, 0, 1)) , this.suppressedExceptions);
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
_.toString_0 = function toString_2(){
  return $toString(this, this.getMessage());
}
;
_.backingJsObject = '__noinit__';
_.disableSuppression = false;
_.writableStackTrace = true;
var Ljava_lang_Throwable_2_classLit = createForClass('java.lang', 'Throwable', 8);
function Exception(message){
  this.detailMessage = message;
  $fillInStackTrace(this);
  this.initializeBackingError();
}

defineClass(19, 8, {3:1, 19:1, 8:1});
var Ljava_lang_Exception_2_classLit = createForClass('java.lang', 'Exception', 19);
function RuntimeException(){
  $fillInStackTrace(this);
  this.initializeBackingError();
}

function RuntimeException_0(message){
  Exception.call(this, message);
}

function RuntimeException_1(message, cause){
  Throwable.call(this, message, cause);
}

defineClass(12, 19, $intern_2, RuntimeException_0);
var Ljava_lang_RuntimeException_2_classLit = createForClass('java.lang', 'RuntimeException', 12);
defineClass(115, 12, $intern_2);
var Ljava_lang_JsException_2_classLit = createForClass('java.lang', 'JsException', 115);
defineClass(180, 115, $intern_2);
var Lcom_google_gwt_core_client_impl_JavaScriptExceptionBase_2_classLit = createForClass('com.google.gwt.core.client.impl', 'JavaScriptExceptionBase', 180);
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
  this.detailMessage = e == null?'null':toString_14(e);
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

defineClass(48, 180, {48:1, 3:1, 19:1, 12:1, 8:1}, JavaScriptException);
_.getMessage = function getMessage_0(){
  return $ensureInit(this) , this.message_0;
}
;
_.getThrown = function getThrown(){
  return maskUndefined(this.e) === maskUndefined(NOT_SET)?null:this.e;
}
;
var NOT_SET;
var Lcom_google_gwt_core_client_JavaScriptException_2_classLit = createForClass('com.google.gwt.core.client', 'JavaScriptException', 48);
function $equals_0(this$static, other){
  return !!this$static && !!this$static.equals?this$static.equals(other):maskUndefined(this$static) === maskUndefined(other);
}

function $hashCode(this$static){
  return !!this$static && !!this$static.hashCode?this$static.hashCode():getObjectIdentityHashCode(this$static);
}

var Lcom_google_gwt_core_client_JavaScriptObject_2_classLit = createForClass('com.google.gwt.core.client', 'JavaScriptObject$', 0);
function escapeChar(c, escapeTable){
  var lookedUp = escapeTable_0[c.charCodeAt(0)];
  return lookedUp == null?c:lookedUp;
}

function escapeJsonForEval(toEscape){
  var escapeTable = getEscapeTable();
  var s = toEscape.replace(/[\xad\u0600-\u0603\u06dd\u070f\u17b4\u17b5\u200b-\u200f\u2028-\u202e\u2060-\u2064\u206a-\u206f\ufeff\ufff9-\ufffb]/g, function(x_0){
    return escapeChar(x_0, escapeTable);
  }
  );
  return s;
}

function escapeValue(toEscape){
  var escapeTable = getEscapeTable();
  var s = toEscape.replace(/[\x00-\x1f\xad\u0600-\u0603\u06dd\u070f\u17b4\u17b5\u200b-\u200f\u2028-\u202e\u2060-\u2064\u206a-\u206f\ufeff\ufff9-\ufffb"\\]/g, function(x_0){
    return escapeChar(x_0, escapeTable);
  }
  );
  return '"' + s + '"';
}

function getEscapeTable(){
  !escapeTable_0 && (escapeTable_0 = initEscapeTable());
  return escapeTable_0;
}

function initEscapeTable(){
  var out = ['\\u0000', '\\u0001', '\\u0002', '\\u0003', '\\u0004', '\\u0005', '\\u0006', '\\u0007', '\\b', '\\t', '\\n', '\\u000B', '\\f', '\\r', '\\u000E', '\\u000F', '\\u0010', '\\u0011', '\\u0012', '\\u0013', '\\u0014', '\\u0015', '\\u0016', '\\u0017', '\\u0018', '\\u0019', '\\u001A', '\\u001B', '\\u001C', '\\u001D', '\\u001E', '\\u001F'];
  out[34] = '\\"';
  out[92] = '\\\\';
  out[173] = '\\u00ad';
  out[1536] = '\\u0600';
  out[1537] = '\\u0601';
  out[1538] = '\\u0602';
  out[1539] = '\\u0603';
  out[1757] = '\\u06dd';
  out[1807] = '\\u070f';
  out[6068] = '\\u17b4';
  out[6069] = '\\u17b5';
  out[8203] = '\\u200b';
  out[8204] = '\\u200c';
  out[8205] = '\\u200d';
  out[8206] = '\\u200e';
  out[8207] = '\\u200f';
  out[8232] = '\\u2028';
  out[8233] = '\\u2029';
  out[8234] = '\\u202a';
  out[8235] = '\\u202b';
  out[8236] = '\\u202c';
  out[8237] = '\\u202d';
  out[8238] = '\\u202e';
  out[8288] = '\\u2060';
  out[8289] = '\\u2061';
  out[8290] = '\\u2062';
  out[8291] = '\\u2063';
  out[8292] = '\\u2064';
  out[8298] = '\\u206a';
  out[8299] = '\\u206b';
  out[8300] = '\\u206c';
  out[8301] = '\\u206d';
  out[8302] = '\\u206e';
  out[8303] = '\\u206f';
  out[65279] = '\\ufeff';
  out[65529] = '\\ufff9';
  out[65530] = '\\ufffa';
  out[65531] = '\\ufffb';
  return out;
}

var escapeTable_0;
defineClass(489, 1, {});
var Lcom_google_gwt_core_client_Scheduler_2_classLit = createForClass('com.google.gwt.core.client', 'Scheduler', 489);
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

function getModuleBaseURL(){
  $clinit_Impl();
  var key = '__gwtDevModeHook:' + $moduleName + ':moduleBase';
  var global_0 = $wnd || self;
  return global_0[key] || $moduleBase;
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

function $flushPostEventPumpCommands(this$static){
  var oldDeferred;
  if (this$static.deferredCommands) {
    oldDeferred = this$static.deferredCommands;
    this$static.deferredCommands = null;
    !this$static.incrementalCommands && (this$static.incrementalCommands = []);
    runScheduledTasks(oldDeferred, this$static.incrementalCommands);
  }
  !!this$static.incrementalCommands && (this$static.incrementalCommands = $runRepeatingTasks(this$static.incrementalCommands));
}

function $isWorkQueued(this$static){
  return !!this$static.deferredCommands || !!this$static.incrementalCommands;
}

function $maybeSchedulePostEventPumpCommands(this$static){
  if (!this$static.shouldBeRunning) {
    this$static.shouldBeRunning = true;
    !this$static.flusher && (this$static.flusher = new SchedulerImpl$Flusher(this$static));
    scheduleFixedDelayImpl(this$static.flusher, 1);
    !this$static.rescue && (this$static.rescue = new SchedulerImpl$Rescuer(this$static));
    scheduleFixedDelayImpl(this$static.rescue, 50);
  }
}

function $runRepeatingTasks(tasks){
  var canceledSomeTasks, duration, executedSomeTask, i, length_0, newTasks, t;
  length_0 = tasks.length;
  if (length_0 == 0) {
    return null;
  }
  canceledSomeTasks = false;
  duration = new Duration;
  while (Date.now() - duration.start_0 < 16) {
    executedSomeTask = false;
    for (i = 0; i < length_0; i++) {
      t = tasks[i];
      if (!t) {
        continue;
      }
      executedSomeTask = true;
      if (!t[0].execute_0()) {
        tasks[i] = null;
        canceledSomeTasks = true;
      }
    }
    if (!executedSomeTask) {
      break;
    }
  }
  if (canceledSomeTasks) {
    newTasks = [];
    for (i = 0; i < length_0; i++) {
      !!tasks[i] && (newTasks[newTasks.length] = tasks[i] , undefined);
    }
    return newTasks.length == 0?null:newTasks;
  }
   else {
    return tasks;
  }
}

function $scheduleDeferred(this$static, cmd){
  this$static.deferredCommands = push_0(this$static.deferredCommands, [cmd, false]);
  $maybeSchedulePostEventPumpCommands(this$static);
}

function $scheduleFinally(this$static, cmd){
  this$static.finallyCommands = push_0(this$static.finallyCommands, [cmd, false]);
}

function SchedulerImpl(){
}

function execute_0(cmd){
  return cmd.execute_0();
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
      t[1]?t[0].execute_0() && (rescheduled = push_0(rescheduled, t)):t[0].execute_1();
    }
     catch ($e0) {
      $e0 = toJava($e0);
      if (instanceOf($e0, 8)) {
        e = $e0;
        $clinit_Impl();
        reportToBrowser(instanceOf(e, 48)?castTo(e, 48).getThrown():e);
      }
       else 
        throw toJs($e0);
    }
  }
  return rescheduled;
}

function scheduleFixedDelayImpl(cmd, delayMs){
  $clinit_SchedulerImpl();
  function callback(){
    var ret = $entry(execute_0)(cmd);
    ret && $wnd.setTimeout(callback, delayMs);
  }

  $wnd.setTimeout(callback, delayMs);
}

defineClass(199, 489, {}, SchedulerImpl);
_.flushRunning = false;
_.shouldBeRunning = false;
var INSTANCE;
var Lcom_google_gwt_core_client_impl_SchedulerImpl_2_classLit = createForClass('com.google.gwt.core.client.impl', 'SchedulerImpl', 199);
function SchedulerImpl$Flusher(this$0){
  this.this$01 = this$0;
}

defineClass(200, 1, {}, SchedulerImpl$Flusher);
_.execute_0 = function execute_1(){
  this.this$01.flushRunning = true;
  $flushPostEventPumpCommands(this.this$01);
  this.this$01.flushRunning = false;
  return this.this$01.shouldBeRunning = $isWorkQueued(this.this$01);
}
;
var Lcom_google_gwt_core_client_impl_SchedulerImpl$Flusher_2_classLit = createForClass('com.google.gwt.core.client.impl', 'SchedulerImpl/Flusher', 200);
function SchedulerImpl$Rescuer(this$0){
  this.this$01 = this$0;
}

defineClass(201, 1, {}, SchedulerImpl$Rescuer);
_.execute_0 = function execute_2(){
  this.this$01.flushRunning && scheduleFixedDelayImpl(this.this$01.flusher, 1);
  return this.this$01.shouldBeRunning;
}
;
var Lcom_google_gwt_core_client_impl_SchedulerImpl$Rescuer_2_classLit = createForClass('com.google.gwt.core.client.impl', 'SchedulerImpl/Rescuer', 201);
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
defineClass(500, 1, {});
var Lcom_google_gwt_core_client_impl_StackTraceCreator$Collector_2_classLit = createForClass('com.google.gwt.core.client.impl', 'StackTraceCreator/Collector', 500);
function StackTraceCreator$CollectorLegacy(){
}

defineClass(181, 500, {}, StackTraceCreator$CollectorLegacy);
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
var Lcom_google_gwt_core_client_impl_StackTraceCreator$CollectorLegacy_2_classLit = createForClass('com.google.gwt.core.client.impl', 'StackTraceCreator/CollectorLegacy', 181);
defineClass(501, 500, {});
_.collect = function collect_0(error){
}
;
var Lcom_google_gwt_core_client_impl_StackTraceCreator$CollectorModern_2_classLit = createForClass('com.google.gwt.core.client.impl', 'StackTraceCreator/CollectorModern', 501);
function StackTraceCreator$CollectorModernNoSourceMap(){
}

defineClass(182, 501, {}, StackTraceCreator$CollectorModernNoSourceMap);
var Lcom_google_gwt_core_client_impl_StackTraceCreator$CollectorModernNoSourceMap_2_classLit = createForClass('com.google.gwt.core.client.impl', 'StackTraceCreator/CollectorModernNoSourceMap', 182);
function $appendChild(this$static, newChild){
  return this$static.appendChild(newChild);
}

function $getChild(this$static, index_0){
  return this$static.childNodes[index_0];
}

function $insertBefore(this$static, newChild, refChild){
  return this$static.insertBefore(newChild, refChild);
}

function $removeChild(this$static, oldChild){
  return this$static.removeChild(oldChild);
}

function is(o){
  try {
    return !!o && !!o.nodeType;
  }
   catch (e) {
    return false;
  }
}

function $addClassName(this$static, className){
  var idx, oldClassName;
  className = trimClassName(className);
  oldClassName = this$static.className || '';
  idx = indexOfName(oldClassName, className);
  if (idx == -1) {
    oldClassName.length > 0?(this$static.className = oldClassName + ' ' + className || '' , undefined):(this$static.className = className || '' , undefined);
    return true;
  }
  return false;
}

function $getPropertyInt(this$static, name_0){
  return parseInt(this$static[name_0]) | 0;
}

function $getPropertyString(this$static, name_0){
  return this$static[name_0] == null?null:String(this$static[name_0]);
}

function $removeAttribute(this$static, name_0){
  this$static.removeAttribute(name_0);
}

function $removeClassName(this$static, className){
  var begin, end, idx, newClassName, oldStyle;
  className = trimClassName(className);
  oldStyle = this$static.className || '';
  idx = indexOfName(oldStyle, className);
  if (idx != -1) {
    begin = $trim((checkCriticalStringBounds(0, idx, oldStyle.length) , oldStyle.substr(0, idx)));
    end = $trim($substring(oldStyle, idx + className.length));
    begin.length == 0?(newClassName = end):end.length == 0?(newClassName = begin):(newClassName = begin + ' ' + end);
    this$static.className = newClassName || '';
    return true;
  }
  return false;
}

function $setAttribute(this$static, name_0, value_0){
  this$static.setAttribute(name_0, value_0);
}

function $setInnerHTML(this$static, html){
  this$static.innerHTML = html || '';
}

function $setScrollTop(this$static, scrollTop){
  this$static.scrollTop = scrollTop;
}

function $setTitle(this$static, title_0){
  this$static.title = title_0 || '';
}

function indexOfName(nameList, name_0){
  var idx, last, lastPos;
  idx = nameList.indexOf(name_0);
  while (idx != -1) {
    if (idx == 0 || (checkCriticalStringElementIndex(idx - 1, nameList.length) , nameList.charCodeAt(idx - 1) == 32)) {
      last = idx + name_0.length;
      lastPos = nameList.length;
      if (last == lastPos || last < lastPos && (checkCriticalStringElementIndex(last, nameList.length) , nameList.charCodeAt(last) == 32)) {
        break;
      }
    }
    idx = nameList.indexOf(name_0, idx + 1);
  }
  return idx;
}

function is_0(o){
  if (is(o)) {
    return !!o && o.nodeType == 1;
  }
  return false;
}

function trimClassName(className){
  className = $trim(className);
  return className;
}

function $getFirstChildElement(elem){
  var child = elem.firstChild;
  while (child && child.nodeType != 1)
    child = child.nextSibling;
  return child;
}

function $getParentElement(node){
  var parent_0 = node.parentNode;
  (!parent_0 || parent_0.nodeType != 1) && (parent_0 = null);
  return parent_0;
}

function $getScrollLeft(doc){
  var scrollingElement;
  return $getScrollLeft_0((scrollingElement = $getDocumentScrollingElement(doc) , scrollingElement?scrollingElement:doc.documentElement));
}

function $getScrollTop(doc){
  var scrollingElement;
  return ((scrollingElement = $getDocumentScrollingElement(doc) , scrollingElement?scrollingElement:doc.documentElement).scrollTop || 0) | 0;
}

function $scrollIntoView(elem){
  var left = elem.offsetLeft, top_0 = elem.offsetTop;
  var width_0 = elem.offsetWidth, height = elem.offsetHeight;
  if (elem.parentNode != elem.offsetParent) {
    left -= elem.parentNode.offsetLeft;
    top_0 -= elem.parentNode.offsetTop;
  }
  var cur = elem.parentNode;
  while (cur && cur.nodeType == 1) {
    left < cur.scrollLeft && (cur.scrollLeft = left);
    left + width_0 > cur.scrollLeft + cur.clientWidth && (cur.scrollLeft = left + width_0 - cur.clientWidth);
    top_0 < cur.scrollTop && (cur.scrollTop = top_0);
    top_0 + height > cur.scrollTop + cur.clientHeight && (cur.scrollTop = top_0 + height - cur.clientHeight);
    var offsetLeft = cur.offsetLeft, offsetTop = cur.offsetTop;
    if (cur.parentNode != cur.offsetParent) {
      offsetLeft -= cur.parentNode.offsetLeft;
      offsetTop -= cur.parentNode.offsetTop;
    }
    left += offsetLeft - cur.scrollLeft;
    top_0 += offsetTop - cur.scrollTop;
    cur = cur.parentNode;
  }
}

function $dispatchEvent(target, evt){
  target.dispatchEvent(evt);
}

function $eventGetButton(evt){
  var button = evt.button;
  if (button == 1) {
    return 4;
  }
   else if (button == 2) {
    return 2;
  }
  return 1;
}

function $getDocumentScrollingElement(doc){
  if (doc.scrollingElement) {
    return doc.scrollingElement;
  }
  return doc.body;
}

function $isOrHasChild(parent_0, child){
  return parent_0.contains(child);
}

function $setInnerText(elem, text_0){
  elem.textContent = text_0 || '';
}

function $getAbsoluteLeft(elem){
  var left, rect;
  rect = elem.getBoundingClientRect && elem.getBoundingClientRect();
  left = rect?rect.left + $getScrollLeft(elem.ownerDocument):getAbsoluteLeftUsingOffsets(elem);
  return left | 0;
}

function $getAbsoluteTop(elem){
  var rect, top_0, top_1;
  rect = elem.getBoundingClientRect && elem.getBoundingClientRect();
  top_0 = rect?rect.top + $getScrollTop(elem.ownerDocument):getAbsoluteTopUsingOffsets(elem);
  return top_0 | 0;
}

function $getScrollLeft_0(elem){
  if (!$equalsIgnoreCase('body', elem.tagName) && $isRTL(elem)) {
    return ((elem.scrollLeft || 0) | 0) - (((elem.scrollWidth || 0) | 0) - (elem.clientWidth | 0));
  }
  return (elem.scrollLeft || 0) | 0;
}

function $getTabIndex(elem){
  return typeof elem.tabIndex != 'undefined'?elem.tabIndex:-1;
}

function $isRTL(elem){
  return elem.ownerDocument.defaultView.getComputedStyle(elem, '').direction == 'rtl';
}

function $setScrollLeft(elem, left){
  !$equalsIgnoreCase('body', elem.tagName) && $isRTL(elem) && (left += ((elem.scrollWidth || 0) | 0) - (elem.clientWidth | 0));
  elem.scrollLeft = left;
}

function getAbsoluteLeftUsingOffsets(elem){
  if (elem.offsetLeft == null) {
    return 0;
  }
  var left = 0;
  var doc = elem.ownerDocument;
  var curr = elem.parentNode;
  if (curr) {
    while (curr.offsetParent) {
      left -= curr.scrollLeft;
      doc.defaultView.getComputedStyle(curr, '').getPropertyValue('direction') == 'rtl' && (left += curr.scrollWidth - curr.clientWidth);
      curr = curr.parentNode;
    }
  }
  while (elem) {
    left += elem.offsetLeft;
    if (doc.defaultView.getComputedStyle(elem, '')['position'] == 'fixed') {
      left += doc.body.scrollLeft;
      return left;
    }
    var parent_0 = elem.offsetParent;
    parent_0 && $wnd.devicePixelRatio && (left += parseInt(doc.defaultView.getComputedStyle(parent_0, '').getPropertyValue('border-left-width')));
    if (parent_0 && parent_0.tagName == 'BODY' && elem.style.position == 'absolute') {
      break;
    }
    elem = parent_0;
  }
  return left;
}

function getAbsoluteTopUsingOffsets(elem){
  if (elem.offsetTop == null) {
    return 0;
  }
  var top_0 = 0;
  var doc = elem.ownerDocument;
  var curr = elem.parentNode;
  if (curr) {
    while (curr.offsetParent) {
      top_0 -= curr.scrollTop;
      curr = curr.parentNode;
    }
  }
  while (elem) {
    top_0 += elem.offsetTop;
    if (doc.defaultView.getComputedStyle(elem, '')['position'] == 'fixed') {
      top_0 += doc.body.scrollTop;
      return top_0;
    }
    var parent_0 = elem.offsetParent;
    parent_0 && $wnd.devicePixelRatio && (top_0 += parseInt(doc.defaultView.getComputedStyle(parent_0, '').getPropertyValue('border-top-width')));
    if (parent_0 && parent_0.tagName == 'BODY' && elem.style.position == 'absolute') {
      break;
    }
    elem = parent_0;
  }
  return top_0;
}

function $eventGetTarget(evt){
  var target = evt.target;
  target && target.nodeType == 3 && (target = target.parentNode);
  return target;
}

function $createUniqueId(this$static){
  !this$static.gwt_uid && (this$static.gwt_uid = 1);
  return 'gwt-uid-' + this$static.gwt_uid++;
}

function $getClientHeight(this$static){
  return ($equals_1(this$static.compatMode, 'CSS1Compat')?this$static.documentElement:this$static.body).clientHeight | 0;
}

function $getClientWidth(this$static){
  return ($equals_1(this$static.compatMode, 'CSS1Compat')?this$static.documentElement:this$static.body).clientWidth | 0;
}

function $getScrollHeight(this$static){
  return (($equals_1(this$static.compatMode, 'CSS1Compat')?this$static.documentElement:this$static.body).scrollHeight || 0) | 0;
}

function $getScrollLeft_1(this$static){
  var scrollingElement;
  return $getScrollLeft_0((scrollingElement = $getDocumentScrollingElement(this$static) , scrollingElement?scrollingElement:this$static.documentElement));
}

function $getScrollTop_0(this$static){
  var scrollingElement;
  return ((scrollingElement = $getDocumentScrollingElement(this$static) , scrollingElement?scrollingElement:this$static.documentElement).scrollTop || 0) | 0;
}

function $getScrollWidth(this$static){
  return (($equals_1(this$static.compatMode, 'CSS1Compat')?this$static.documentElement:this$static.body).scrollWidth || 0) | 0;
}

function $setSrc(this$static, src_0){
  this$static.src = src_0;
}

function $setSelectedIndex(this$static, index_0){
  this$static.selectedIndex = index_0;
}

function $clinit_Style$Display(){
  $clinit_Style$Display = emptyMethod;
  NONE = new Style$Display$1;
  BLOCK = new Style$Display$2;
  INLINE = new Style$Display$3;
  INLINE_BLOCK = new Style$Display$4;
  INLINE_TABLE = new Style$Display$5;
  LIST_ITEM = new Style$Display$6;
  RUN_IN = new Style$Display$7;
  TABLE = new Style$Display$8;
  TABLE_CAPTION = new Style$Display$9;
  TABLE_COLUMN_GROUP = new Style$Display$10;
  TABLE_HEADER_GROUP = new Style$Display$11;
  TABLE_FOOTER_GROUP = new Style$Display$12;
  TABLE_ROW_GROUP = new Style$Display$13;
  TABLE_CELL = new Style$Display$14;
  TABLE_COLUMN = new Style$Display$15;
  TABLE_ROW = new Style$Display$16;
  INITIAL = new Style$Display$17;
  FLEX = new Style$Display$18;
  INLINE_FLEX = new Style$Display$19;
}

function Style$Display(enum$name, enum$ordinal){
  Enum.call(this, enum$name, enum$ordinal);
}

function values_2(){
  $clinit_Style$Display();
  return stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_dom_client_Style$Display_2_classLit, 1), $intern_1, 16, 0, [NONE, BLOCK, INLINE, INLINE_BLOCK, INLINE_TABLE, LIST_ITEM, RUN_IN, TABLE, TABLE_CAPTION, TABLE_COLUMN_GROUP, TABLE_HEADER_GROUP, TABLE_FOOTER_GROUP, TABLE_ROW_GROUP, TABLE_CELL, TABLE_COLUMN, TABLE_ROW, INITIAL, FLEX, INLINE_FLEX]);
}

defineClass(16, 4, $intern_3);
var BLOCK, FLEX, INITIAL, INLINE, INLINE_BLOCK, INLINE_FLEX, INLINE_TABLE, LIST_ITEM, NONE, RUN_IN, TABLE, TABLE_CAPTION, TABLE_CELL, TABLE_COLUMN, TABLE_COLUMN_GROUP, TABLE_FOOTER_GROUP, TABLE_HEADER_GROUP, TABLE_ROW, TABLE_ROW_GROUP;
var Lcom_google_gwt_dom_client_Style$Display_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Display', 16, values_2);
function Style$Display$1(){
  Style$Display.call(this, 'NONE', 0);
}

defineClass(227, 16, $intern_3, Style$Display$1);
var Lcom_google_gwt_dom_client_Style$Display$1_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Display/1', 227, null);
function Style$Display$10(){
  Style$Display.call(this, 'TABLE_COLUMN_GROUP', 9);
}

defineClass(236, 16, $intern_3, Style$Display$10);
var Lcom_google_gwt_dom_client_Style$Display$10_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Display/10', 236, null);
function Style$Display$11(){
  Style$Display.call(this, 'TABLE_HEADER_GROUP', 10);
}

defineClass(237, 16, $intern_3, Style$Display$11);
var Lcom_google_gwt_dom_client_Style$Display$11_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Display/11', 237, null);
function Style$Display$12(){
  Style$Display.call(this, 'TABLE_FOOTER_GROUP', 11);
}

defineClass(238, 16, $intern_3, Style$Display$12);
var Lcom_google_gwt_dom_client_Style$Display$12_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Display/12', 238, null);
function Style$Display$13(){
  Style$Display.call(this, 'TABLE_ROW_GROUP', 12);
}

defineClass(239, 16, $intern_3, Style$Display$13);
var Lcom_google_gwt_dom_client_Style$Display$13_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Display/13', 239, null);
function Style$Display$14(){
  Style$Display.call(this, 'TABLE_CELL', 13);
}

defineClass(240, 16, $intern_3, Style$Display$14);
var Lcom_google_gwt_dom_client_Style$Display$14_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Display/14', 240, null);
function Style$Display$15(){
  Style$Display.call(this, 'TABLE_COLUMN', 14);
}

defineClass(241, 16, $intern_3, Style$Display$15);
var Lcom_google_gwt_dom_client_Style$Display$15_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Display/15', 241, null);
function Style$Display$16(){
  Style$Display.call(this, 'TABLE_ROW', 15);
}

defineClass(242, 16, $intern_3, Style$Display$16);
var Lcom_google_gwt_dom_client_Style$Display$16_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Display/16', 242, null);
function Style$Display$17(){
  Style$Display.call(this, 'INITIAL', 16);
}

defineClass(243, 16, $intern_3, Style$Display$17);
var Lcom_google_gwt_dom_client_Style$Display$17_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Display/17', 243, null);
function Style$Display$18(){
  Style$Display.call(this, 'FLEX', 17);
}

defineClass(244, 16, $intern_3, Style$Display$18);
var Lcom_google_gwt_dom_client_Style$Display$18_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Display/18', 244, null);
function Style$Display$19(){
  Style$Display.call(this, 'INLINE_FLEX', 18);
}

defineClass(245, 16, $intern_3, Style$Display$19);
var Lcom_google_gwt_dom_client_Style$Display$19_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Display/19', 245, null);
function Style$Display$2(){
  Style$Display.call(this, 'BLOCK', 1);
}

defineClass(228, 16, $intern_3, Style$Display$2);
var Lcom_google_gwt_dom_client_Style$Display$2_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Display/2', 228, null);
function Style$Display$3(){
  Style$Display.call(this, 'INLINE', 2);
}

defineClass(229, 16, $intern_3, Style$Display$3);
var Lcom_google_gwt_dom_client_Style$Display$3_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Display/3', 229, null);
function Style$Display$4(){
  Style$Display.call(this, 'INLINE_BLOCK', 3);
}

defineClass(230, 16, $intern_3, Style$Display$4);
var Lcom_google_gwt_dom_client_Style$Display$4_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Display/4', 230, null);
function Style$Display$5(){
  Style$Display.call(this, 'INLINE_TABLE', 4);
}

defineClass(231, 16, $intern_3, Style$Display$5);
var Lcom_google_gwt_dom_client_Style$Display$5_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Display/5', 231, null);
function Style$Display$6(){
  Style$Display.call(this, 'LIST_ITEM', 5);
}

defineClass(232, 16, $intern_3, Style$Display$6);
var Lcom_google_gwt_dom_client_Style$Display$6_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Display/6', 232, null);
function Style$Display$7(){
  Style$Display.call(this, 'RUN_IN', 6);
}

defineClass(233, 16, $intern_3, Style$Display$7);
var Lcom_google_gwt_dom_client_Style$Display$7_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Display/7', 233, null);
function Style$Display$8(){
  Style$Display.call(this, 'TABLE', 7);
}

defineClass(234, 16, $intern_3, Style$Display$8);
var Lcom_google_gwt_dom_client_Style$Display$8_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Display/8', 234, null);
function Style$Display$9(){
  Style$Display.call(this, 'TABLE_CAPTION', 8);
}

defineClass(235, 16, $intern_3, Style$Display$9);
var Lcom_google_gwt_dom_client_Style$Display$9_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Display/9', 235, null);
function $clinit_Style$Overflow(){
  $clinit_Style$Overflow = emptyMethod;
  VISIBLE = new Style$Overflow$1;
  HIDDEN = new Style$Overflow$2;
  SCROLL = new Style$Overflow$3;
  AUTO = new Style$Overflow$4;
}

function Style$Overflow(enum$name, enum$ordinal){
  Enum.call(this, enum$name, enum$ordinal);
}

function values_3(){
  $clinit_Style$Overflow();
  return stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_dom_client_Style$Overflow_2_classLit, 1), $intern_1, 49, 0, [VISIBLE, HIDDEN, SCROLL, AUTO]);
}

defineClass(49, 4, $intern_4);
var AUTO, HIDDEN, SCROLL, VISIBLE;
var Lcom_google_gwt_dom_client_Style$Overflow_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Overflow', 49, values_3);
function Style$Overflow$1(){
  Style$Overflow.call(this, 'VISIBLE', 0);
}

defineClass(246, 49, $intern_4, Style$Overflow$1);
var Lcom_google_gwt_dom_client_Style$Overflow$1_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Overflow/1', 246, null);
function Style$Overflow$2(){
  Style$Overflow.call(this, 'HIDDEN', 1);
}

defineClass(247, 49, $intern_4, Style$Overflow$2);
var Lcom_google_gwt_dom_client_Style$Overflow$2_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Overflow/2', 247, null);
function Style$Overflow$3(){
  Style$Overflow.call(this, 'SCROLL', 2);
}

defineClass(248, 49, $intern_4, Style$Overflow$3);
var Lcom_google_gwt_dom_client_Style$Overflow$3_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Overflow/3', 248, null);
function Style$Overflow$4(){
  Style$Overflow.call(this, 'AUTO', 3);
}

defineClass(249, 49, $intern_4, Style$Overflow$4);
var Lcom_google_gwt_dom_client_Style$Overflow$4_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Overflow/4', 249, null);
function $clinit_Style$Position(){
  $clinit_Style$Position = emptyMethod;
  STATIC = new Style$Position$1;
  RELATIVE = new Style$Position$2;
  ABSOLUTE = new Style$Position$3;
  FIXED = new Style$Position$4;
}

function Style$Position(enum$name, enum$ordinal){
  Enum.call(this, enum$name, enum$ordinal);
}

function values_4(){
  $clinit_Style$Position();
  return stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_dom_client_Style$Position_2_classLit, 1), $intern_1, 50, 0, [STATIC, RELATIVE, ABSOLUTE, FIXED]);
}

defineClass(50, 4, $intern_5);
var ABSOLUTE, FIXED, RELATIVE, STATIC;
var Lcom_google_gwt_dom_client_Style$Position_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Position', 50, values_4);
function Style$Position$1(){
  Style$Position.call(this, 'STATIC', 0);
}

defineClass(250, 50, $intern_5, Style$Position$1);
var Lcom_google_gwt_dom_client_Style$Position$1_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Position/1', 250, null);
function Style$Position$2(){
  Style$Position.call(this, 'RELATIVE', 1);
}

defineClass(251, 50, $intern_5, Style$Position$2);
var Lcom_google_gwt_dom_client_Style$Position$2_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Position/2', 251, null);
function Style$Position$3(){
  Style$Position.call(this, 'ABSOLUTE', 2);
}

defineClass(252, 50, $intern_5, Style$Position$3);
var Lcom_google_gwt_dom_client_Style$Position$3_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Position/3', 252, null);
function Style$Position$4(){
  Style$Position.call(this, 'FIXED', 3);
}

defineClass(253, 50, $intern_5, Style$Position$4);
var Lcom_google_gwt_dom_client_Style$Position$4_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Position/4', 253, null);
function $clinit_Style$TextAlign(){
  $clinit_Style$TextAlign = emptyMethod;
  CENTER = new Style$TextAlign$1;
  JUSTIFY = new Style$TextAlign$2;
  LEFT = new Style$TextAlign$3;
  RIGHT = new Style$TextAlign$4;
}

function Style$TextAlign(enum$name, enum$ordinal){
  Enum.call(this, enum$name, enum$ordinal);
}

function values_5(){
  $clinit_Style$TextAlign();
  return stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_dom_client_Style$TextAlign_2_classLit, 1), $intern_1, 51, 0, [CENTER, JUSTIFY, LEFT, RIGHT]);
}

defineClass(51, 4, $intern_6);
var CENTER, JUSTIFY, LEFT, RIGHT;
var Lcom_google_gwt_dom_client_Style$TextAlign_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/TextAlign', 51, values_5);
function Style$TextAlign$1(){
  Style$TextAlign.call(this, 'CENTER', 0);
}

defineClass(254, 51, $intern_6, Style$TextAlign$1);
var Lcom_google_gwt_dom_client_Style$TextAlign$1_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/TextAlign/1', 254, null);
function Style$TextAlign$2(){
  Style$TextAlign.call(this, 'JUSTIFY', 1);
}

defineClass(255, 51, $intern_6, Style$TextAlign$2);
var Lcom_google_gwt_dom_client_Style$TextAlign$2_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/TextAlign/2', 255, null);
function Style$TextAlign$3(){
  Style$TextAlign.call(this, 'LEFT', 2);
}

defineClass(256, 51, $intern_6, Style$TextAlign$3);
var Lcom_google_gwt_dom_client_Style$TextAlign$3_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/TextAlign/3', 256, null);
function Style$TextAlign$4(){
  Style$TextAlign.call(this, 'RIGHT', 3);
}

defineClass(257, 51, $intern_6, Style$TextAlign$4);
var Lcom_google_gwt_dom_client_Style$TextAlign$4_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/TextAlign/4', 257, null);
function $clinit_Style$Unit(){
  $clinit_Style$Unit = emptyMethod;
  PX = new Style$Unit$1;
  PCT = new Style$Unit$2;
  EM = new Style$Unit$3;
  EX = new Style$Unit$4;
  PT = new Style$Unit$5;
  PC = new Style$Unit$6;
  IN = new Style$Unit$7;
  CM = new Style$Unit$8;
  MM = new Style$Unit$9;
}

function Style$Unit(enum$name, enum$ordinal){
  Enum.call(this, enum$name, enum$ordinal);
}

function values_6(){
  $clinit_Style$Unit();
  return stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_dom_client_Style$Unit_2_classLit, 1), $intern_1, 24, 0, [PX, PCT, EM, EX, PT, PC, IN, CM, MM]);
}

defineClass(24, 4, $intern_7);
var CM, EM, EX, IN, MM, PC, PCT, PT, PX;
var Lcom_google_gwt_dom_client_Style$Unit_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Unit', 24, values_6);
function Style$Unit$1(){
  Style$Unit.call(this, 'PX', 0);
}

defineClass(218, 24, $intern_7, Style$Unit$1);
var Lcom_google_gwt_dom_client_Style$Unit$1_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Unit/1', 218, null);
function Style$Unit$2(){
  Style$Unit.call(this, 'PCT', 1);
}

defineClass(219, 24, $intern_7, Style$Unit$2);
var Lcom_google_gwt_dom_client_Style$Unit$2_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Unit/2', 219, null);
function Style$Unit$3(){
  Style$Unit.call(this, 'EM', 2);
}

defineClass(220, 24, $intern_7, Style$Unit$3);
var Lcom_google_gwt_dom_client_Style$Unit$3_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Unit/3', 220, null);
function Style$Unit$4(){
  Style$Unit.call(this, 'EX', 3);
}

defineClass(221, 24, $intern_7, Style$Unit$4);
var Lcom_google_gwt_dom_client_Style$Unit$4_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Unit/4', 221, null);
function Style$Unit$5(){
  Style$Unit.call(this, 'PT', 4);
}

defineClass(222, 24, $intern_7, Style$Unit$5);
var Lcom_google_gwt_dom_client_Style$Unit$5_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Unit/5', 222, null);
function Style$Unit$6(){
  Style$Unit.call(this, 'PC', 5);
}

defineClass(223, 24, $intern_7, Style$Unit$6);
var Lcom_google_gwt_dom_client_Style$Unit$6_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Unit/6', 223, null);
function Style$Unit$7(){
  Style$Unit.call(this, 'IN', 6);
}

defineClass(224, 24, $intern_7, Style$Unit$7);
var Lcom_google_gwt_dom_client_Style$Unit$7_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Unit/7', 224, null);
function Style$Unit$8(){
  Style$Unit.call(this, 'CM', 7);
}

defineClass(225, 24, $intern_7, Style$Unit$8);
var Lcom_google_gwt_dom_client_Style$Unit$8_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Unit/8', 225, null);
function Style$Unit$9(){
  Style$Unit.call(this, 'MM', 8);
}

defineClass(226, 24, $intern_7, Style$Unit$9);
var Lcom_google_gwt_dom_client_Style$Unit$9_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/Unit/9', 226, null);
function $clinit_Style$WhiteSpace(){
  $clinit_Style$WhiteSpace = emptyMethod;
  NORMAL = new Style$WhiteSpace$1;
  NOWRAP = new Style$WhiteSpace$2;
  PRE = new Style$WhiteSpace$3;
  PRE_LINE = new Style$WhiteSpace$4;
  PRE_WRAP = new Style$WhiteSpace$5;
}

function Style$WhiteSpace(enum$name, enum$ordinal){
  Enum.call(this, enum$name, enum$ordinal);
}

function values_7(){
  $clinit_Style$WhiteSpace();
  return stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_dom_client_Style$WhiteSpace_2_classLit, 1), $intern_1, 43, 0, [NORMAL, NOWRAP, PRE, PRE_LINE, PRE_WRAP]);
}

defineClass(43, 4, $intern_8);
var NORMAL, NOWRAP, PRE, PRE_LINE, PRE_WRAP;
var Lcom_google_gwt_dom_client_Style$WhiteSpace_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/WhiteSpace', 43, values_7);
function Style$WhiteSpace$1(){
  Style$WhiteSpace.call(this, 'NORMAL', 0);
}

defineClass(258, 43, $intern_8, Style$WhiteSpace$1);
var Lcom_google_gwt_dom_client_Style$WhiteSpace$1_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/WhiteSpace/1', 258, null);
function Style$WhiteSpace$2(){
  Style$WhiteSpace.call(this, 'NOWRAP', 1);
}

defineClass(259, 43, $intern_8, Style$WhiteSpace$2);
var Lcom_google_gwt_dom_client_Style$WhiteSpace$2_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/WhiteSpace/2', 259, null);
function Style$WhiteSpace$3(){
  Style$WhiteSpace.call(this, 'PRE', 2);
}

defineClass(260, 43, $intern_8, Style$WhiteSpace$3);
var Lcom_google_gwt_dom_client_Style$WhiteSpace$3_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/WhiteSpace/3', 260, null);
function Style$WhiteSpace$4(){
  Style$WhiteSpace.call(this, 'PRE_LINE', 3);
}

defineClass(261, 43, $intern_8, Style$WhiteSpace$4);
var Lcom_google_gwt_dom_client_Style$WhiteSpace$4_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/WhiteSpace/4', 261, null);
function Style$WhiteSpace$5(){
  Style$WhiteSpace.call(this, 'PRE_WRAP', 4);
}

defineClass(262, 43, $intern_8, Style$WhiteSpace$5);
var Lcom_google_gwt_dom_client_Style$WhiteSpace$5_2_classLit = createForEnum('com.google.gwt.dom.client', 'Style/WhiteSpace/5', 262, null);
function $clinit_StyleInjector(){
  $clinit_StyleInjector = emptyMethod;
  toInject = [];
  toInjectAtEnd = [];
  toInjectAtStart = [];
  flusher = new StyleInjector$1;
}

function flush(){
  $clinit_StyleInjector();
  var css, maybeReturn, toReturn;
  toReturn = null;
  if (toInjectAtStart.length != 0) {
    css = toInjectAtStart.join('');
    maybeReturn = $injectStyleSheetAtStart(($clinit_StyleInjector$StyleInjectorImpl() , IMPL), css);
    !toInjectAtStart && (toReturn = maybeReturn);
    toInjectAtStart.length = 0;
  }
  if (toInject.length != 0) {
    css = toInject.join('');
    maybeReturn = $injectStyleSheet(($clinit_StyleInjector$StyleInjectorImpl() , IMPL), css);
    !toInject && (toReturn = maybeReturn);
    toInject.length = 0;
  }
  if (toInjectAtEnd.length != 0) {
    css = toInjectAtEnd.join('');
    maybeReturn = $injectStyleSheet(($clinit_StyleInjector$StyleInjectorImpl() , IMPL), css);
    !toInjectAtEnd && (toReturn = maybeReturn);
    toInjectAtEnd.length = 0;
  }
  needsInjection = false;
  return toReturn;
}

function schedule(){
  $clinit_StyleInjector();
  if (!needsInjection) {
    needsInjection = true;
    $scheduleFinally(($clinit_SchedulerImpl() , INSTANCE), flusher);
  }
}

var flusher, needsInjection = false, toInject, toInjectAtEnd, toInjectAtStart;
function StyleInjector$1(){
}

defineClass(184, 1, {}, StyleInjector$1);
_.execute_1 = function execute_3(){
  ($clinit_StyleInjector() , needsInjection) && flush();
}
;
var Lcom_google_gwt_dom_client_StyleInjector$1_2_classLit = createForClass('com.google.gwt.dom.client', 'StyleInjector/1', 184);
function $clinit_StyleInjector$StyleInjectorImpl(){
  $clinit_StyleInjector$StyleInjectorImpl = emptyMethod;
  IMPL = new StyleInjector$StyleInjectorImpl;
}

function $createElement(contents){
  var style;
  style = $doc.createElement('style');
  style['language'] = 'text/css';
  style.textContent = contents || '';
  return style;
}

function $getHead(this$static){
  var elt;
  if (!this$static.head) {
    elt = $doc.getElementsByTagName('head')[0];
    this$static.head = elt;
  }
  return this$static.head;
}

function $injectStyleSheet(this$static, contents){
  var style;
  style = $createElement(contents);
  $appendChild($getHead(this$static), style);
  return style;
}

function $injectStyleSheetAtStart(this$static, contents){
  var style;
  style = $createElement(contents);
  $insertBefore($getHead(this$static), style, this$static.head.firstChild);
  return style;
}

function StyleInjector$StyleInjectorImpl(){
}

defineClass(183, 1, {}, StyleInjector$StyleInjectorImpl);
var IMPL;
var Lcom_google_gwt_dom_client_StyleInjector$StyleInjectorImpl_2_classLit = createForClass('com.google.gwt.dom.client', 'StyleInjector/StyleInjectorImpl', 183);
defineClass(503, 1, {});
_.toString_0 = function toString_3(){
  return 'An event type';
}
;
var Lcom_google_web_bindery_event_shared_Event_2_classLit = createForClass('com.google.web.bindery.event.shared', 'Event', 503);
function $overrideSource(this$static, source){
  this$static.source = source;
}

defineClass(504, 503, {});
_.getAssociatedType_0 = function getAssociatedType(){
  return this.getAssociatedType();
}
;
_.revive = function revive(){
  this.dead = false;
  this.source = null;
}
;
_.dead = false;
var Lcom_google_gwt_event_shared_GwtEvent_2_classLit = createForClass('com.google.gwt.event.shared', 'GwtEvent', 504);
function $setNativeEvent(this$static, nativeEvent){
  this$static.nativeEvent = nativeEvent;
}

function $setRelativeElement(this$static, relativeElem){
  this$static.relativeElem = relativeElem;
}

function fireNativeEvent(nativeEvent, handlerSource, relativeElem){
  var currentNative, currentRelativeElem, type_0, type$iterator, types;
  if (registered) {
    types = castTo($unsafeGet(registered, nativeEvent.type), 37);
    if (types) {
      for (type$iterator = types.iterator(); type$iterator.hasNext_0();) {
        type_0 = castTo(type$iterator.next_1(), 31);
        currentNative = type_0.flyweight.nativeEvent;
        currentRelativeElem = type_0.flyweight.relativeElem;
        $setNativeEvent(type_0.flyweight, nativeEvent);
        $setRelativeElement(type_0.flyweight, relativeElem);
        $fireEvent_0(handlerSource, type_0.flyweight);
        $setNativeEvent(type_0.flyweight, currentNative);
        $setRelativeElement(type_0.flyweight, currentRelativeElem);
      }
    }
  }
}

defineClass(513, 504, {});
_.getAssociatedType = function getAssociatedType_0(){
  return this.getAssociatedType_1();
}
;
_.getAssociatedType_0 = function getAssociatedType_1(){
  return this.getAssociatedType_1();
}
;
var registered;
var Lcom_google_gwt_event_dom_client_DomEvent_2_classLit = createForClass('com.google.gwt.event.dom.client', 'DomEvent', 513);
function $clinit_ChangeEvent(){
  $clinit_ChangeEvent = emptyMethod;
  TYPE = new DomEvent$Type('change', new ChangeEvent);
}

function ChangeEvent(){
}

defineClass(417, 513, {}, ChangeEvent);
_.dispatch = function dispatch(handler){
  castTo(handler, 488).onChange(this);
}
;
_.getAssociatedType = function getAssociatedType_3(){
  return TYPE;
}
;
_.getAssociatedType_0 = function getAssociatedType_4(){
  return TYPE;
}
;
_.getAssociatedType_1 = function getAssociatedType_2(){
  return TYPE;
}
;
var TYPE;
var Lcom_google_gwt_event_dom_client_ChangeEvent_2_classLit = createForClass('com.google.gwt.event.dom.client', 'ChangeEvent', 417);
defineClass(514, 513, {});
var Lcom_google_gwt_event_dom_client_HumanInputEvent_2_classLit = createForClass('com.google.gwt.event.dom.client', 'HumanInputEvent', 514);
function $getX(this$static){
  var e, relativeElem;
  relativeElem = this$static.relativeElem;
  if (relativeElem) {
    return e = this$static.nativeEvent , ((e.clientX || 0) | 0) - $getAbsoluteLeft(relativeElem) + $getScrollLeft_0(relativeElem) + $getScrollLeft_1(relativeElem.ownerDocument);
  }
  return (this$static.nativeEvent.clientX || 0) | 0;
}

function $getY(this$static){
  var e, relativeElem;
  relativeElem = this$static.relativeElem;
  if (relativeElem) {
    return e = this$static.nativeEvent , ((e.clientY || 0) | 0) - $getAbsoluteTop(relativeElem) + ((relativeElem.scrollTop || 0) | 0) + $getScrollTop_0(relativeElem.ownerDocument);
  }
  return (this$static.nativeEvent.clientY || 0) | 0;
}

defineClass(515, 514, {});
var Lcom_google_gwt_event_dom_client_MouseEvent_2_classLit = createForClass('com.google.gwt.event.dom.client', 'MouseEvent', 515);
function $clinit_ClickEvent(){
  $clinit_ClickEvent = emptyMethod;
  TYPE_0 = new DomEvent$Type('click', new ClickEvent);
}

function ClickEvent(){
}

defineClass(412, 515, {}, ClickEvent);
_.dispatch = function dispatch_0(handler){
  castTo(handler, 485).onClick(this);
}
;
_.getAssociatedType = function getAssociatedType_6(){
  return TYPE_0;
}
;
_.getAssociatedType_0 = function getAssociatedType_7(){
  return TYPE_0;
}
;
_.getAssociatedType_1 = function getAssociatedType_5(){
  return TYPE_0;
}
;
var TYPE_0;
var Lcom_google_gwt_event_dom_client_ClickEvent_2_classLit = createForClass('com.google.gwt.event.dom.client', 'ClickEvent', 412);
defineClass(193, 1, {});
_.hashCode_0 = function hashCode_2(){
  return this.index_0;
}
;
_.toString_0 = function toString_4(){
  return 'Event type';
}
;
_.index_0 = 0;
var nextHashCode = 0;
var Lcom_google_web_bindery_event_shared_Event$Type_2_classLit = createForClass('com.google.web.bindery.event.shared', 'Event/Type', 193);
function GwtEvent$Type(){
  this.index_0 = ++nextHashCode;
}

defineClass(56, 193, {}, GwtEvent$Type);
var Lcom_google_gwt_event_shared_GwtEvent$Type_2_classLit = createForClass('com.google.gwt.event.shared', 'GwtEvent/Type', 56);
function DomEvent$Type(eventName, flyweight){
  var types;
  GwtEvent$Type.call(this);
  this.flyweight = flyweight;
  !registered && (registered = new PrivateMap);
  types = castTo($unsafeGet(registered, eventName), 37);
  if (!types) {
    types = new ArrayList;
    $unsafePut(registered, eventName, types);
  }
  types.add_0(this);
  this.name_0 = eventName;
}

defineClass(31, 56, {31:1}, DomEvent$Type);
var Lcom_google_gwt_event_dom_client_DomEvent$Type_2_classLit = createForClass('com.google.gwt.event.dom.client', 'DomEvent/Type', 31);
defineClass(516, 513, {});
var Lcom_google_gwt_event_dom_client_KeyEvent_2_classLit = createForClass('com.google.gwt.event.dom.client', 'KeyEvent', 516);
defineClass(517, 516, {});
var Lcom_google_gwt_event_dom_client_KeyCodeEvent_2_classLit = createForClass('com.google.gwt.event.dom.client', 'KeyCodeEvent', 517);
function isArrowKey(code_0){
  switch (code_0) {
    case 40:
    case 39:
    case 38:
    case 37:
      return true;
    default:return false;
  }
}

function maybeSwapArrowKeysForRtl(code_0, isRtl){
  isRtl && (code_0 == 39?(code_0 = 37):code_0 == 37 && (code_0 = 39));
  return code_0;
}

function $clinit_KeyDownEvent(){
  $clinit_KeyDownEvent = emptyMethod;
  TYPE_1 = new DomEvent$Type('keydown', new KeyDownEvent);
}

function KeyDownEvent(){
}

defineClass(413, 517, {}, KeyDownEvent);
_.dispatch = function dispatch_1(handler){
  castTo(handler, 486).onKeyDown(this);
}
;
_.getAssociatedType = function getAssociatedType_9(){
  return TYPE_1;
}
;
_.getAssociatedType_0 = function getAssociatedType_10(){
  return TYPE_1;
}
;
_.getAssociatedType_1 = function getAssociatedType_8(){
  return TYPE_1;
}
;
var TYPE_1;
var Lcom_google_gwt_event_dom_client_KeyDownEvent_2_classLit = createForClass('com.google.gwt.event.dom.client', 'KeyDownEvent', 413);
function $clinit_KeyUpEvent(){
  $clinit_KeyUpEvent = emptyMethod;
  TYPE_2 = new DomEvent$Type('keyup', new KeyUpEvent);
}

function KeyUpEvent(){
}

defineClass(433, 517, {}, KeyUpEvent);
_.dispatch = function dispatch_2(handler){
  castTo(handler, 528).onKeyUp(this);
}
;
_.getAssociatedType = function getAssociatedType_12(){
  return TYPE_2;
}
;
_.getAssociatedType_0 = function getAssociatedType_13(){
  return TYPE_2;
}
;
_.getAssociatedType_1 = function getAssociatedType_11(){
  return TYPE_2;
}
;
var TYPE_2;
var Lcom_google_gwt_event_dom_client_KeyUpEvent_2_classLit = createForClass('com.google.gwt.event.dom.client', 'KeyUpEvent', 433);
function $clinit_MouseDownEvent(){
  $clinit_MouseDownEvent = emptyMethod;
  TYPE_3 = new DomEvent$Type('mousedown', new MouseDownEvent);
}

function MouseDownEvent(){
}

defineClass(420, 515, {}, MouseDownEvent);
_.dispatch = function dispatch_3(handler){
  castTo(handler, 168).onMouseDown(this);
}
;
_.getAssociatedType = function getAssociatedType_15(){
  return TYPE_3;
}
;
_.getAssociatedType_0 = function getAssociatedType_16(){
  return TYPE_3;
}
;
_.getAssociatedType_1 = function getAssociatedType_14(){
  return TYPE_3;
}
;
var TYPE_3;
var Lcom_google_gwt_event_dom_client_MouseDownEvent_2_classLit = createForClass('com.google.gwt.event.dom.client', 'MouseDownEvent', 420);
function $clinit_MouseMoveEvent(){
  $clinit_MouseMoveEvent = emptyMethod;
  TYPE_4 = new DomEvent$Type('mousemove', new MouseMoveEvent);
}

function MouseMoveEvent(){
}

defineClass(424, 515, {}, MouseMoveEvent);
_.dispatch = function dispatch_4(handler){
  castTo(handler, 484).onMouseMove(this);
}
;
_.getAssociatedType = function getAssociatedType_18(){
  return TYPE_4;
}
;
_.getAssociatedType_0 = function getAssociatedType_19(){
  return TYPE_4;
}
;
_.getAssociatedType_1 = function getAssociatedType_17(){
  return TYPE_4;
}
;
var TYPE_4;
var Lcom_google_gwt_event_dom_client_MouseMoveEvent_2_classLit = createForClass('com.google.gwt.event.dom.client', 'MouseMoveEvent', 424);
function $clinit_MouseOutEvent(){
  $clinit_MouseOutEvent = emptyMethod;
  TYPE_5 = new DomEvent$Type('mouseout', new MouseOutEvent);
}

function MouseOutEvent(){
}

defineClass(422, 515, {}, MouseOutEvent);
_.dispatch = function dispatch_5(handler){
  castTo(handler, 170).onMouseOut(this);
}
;
_.getAssociatedType = function getAssociatedType_21(){
  return TYPE_5;
}
;
_.getAssociatedType_0 = function getAssociatedType_22(){
  return TYPE_5;
}
;
_.getAssociatedType_1 = function getAssociatedType_20(){
  return TYPE_5;
}
;
var TYPE_5;
var Lcom_google_gwt_event_dom_client_MouseOutEvent_2_classLit = createForClass('com.google.gwt.event.dom.client', 'MouseOutEvent', 422);
function $clinit_MouseOverEvent(){
  $clinit_MouseOverEvent = emptyMethod;
  TYPE_6 = new DomEvent$Type('mouseover', new MouseOverEvent);
}

function MouseOverEvent(){
}

defineClass(423, 515, {}, MouseOverEvent);
_.dispatch = function dispatch_6(handler){
  castTo(handler, 171).onMouseOver(this);
}
;
_.getAssociatedType = function getAssociatedType_24(){
  return TYPE_6;
}
;
_.getAssociatedType_0 = function getAssociatedType_25(){
  return TYPE_6;
}
;
_.getAssociatedType_1 = function getAssociatedType_23(){
  return TYPE_6;
}
;
var TYPE_6;
var Lcom_google_gwt_event_dom_client_MouseOverEvent_2_classLit = createForClass('com.google.gwt.event.dom.client', 'MouseOverEvent', 423);
function $clinit_MouseUpEvent(){
  $clinit_MouseUpEvent = emptyMethod;
  TYPE_7 = new DomEvent$Type('mouseup', new MouseUpEvent);
}

function MouseUpEvent(){
}

defineClass(421, 515, {}, MouseUpEvent);
_.dispatch = function dispatch_7(handler){
  castTo(handler, 169).onMouseUp(this);
}
;
_.getAssociatedType = function getAssociatedType_27(){
  return TYPE_7;
}
;
_.getAssociatedType_0 = function getAssociatedType_28(){
  return TYPE_7;
}
;
_.getAssociatedType_1 = function getAssociatedType_26(){
  return TYPE_7;
}
;
var TYPE_7;
var Lcom_google_gwt_event_dom_client_MouseUpEvent_2_classLit = createForClass('com.google.gwt.event.dom.client', 'MouseUpEvent', 421);
function $unsafeGet(this$static, key){
  return this$static.map_0[key];
}

function $unsafePut(this$static, key, value_0){
  this$static.map_0[key] = value_0;
}

function PrivateMap(){
  this.map_0 = {};
}

defineClass(427, 1, {}, PrivateMap);
var Lcom_google_gwt_event_dom_client_PrivateMap_2_classLit = createForClass('com.google.gwt.event.dom.client', 'PrivateMap', 427);
defineClass(525, 514, {});
var impl;
var Lcom_google_gwt_event_dom_client_TouchEvent_2_classLit = createForClass('com.google.gwt.event.dom.client', 'TouchEvent', 525);
function $clinit_TouchCancelEvent(){
  $clinit_TouchCancelEvent = emptyMethod;
  TYPE_8 = new DomEvent$Type('touchcancel', new TouchCancelEvent);
}

function TouchCancelEvent(){
}

defineClass(466, 525, {}, TouchCancelEvent);
_.dispatch = function dispatch_8(handler){
  $onTouchEnd(castTo(handler, 536).this$01);
}
;
_.getAssociatedType = function getAssociatedType_30(){
  return TYPE_8;
}
;
_.getAssociatedType_0 = function getAssociatedType_31(){
  return TYPE_8;
}
;
_.getAssociatedType_1 = function getAssociatedType_29(){
  return TYPE_8;
}
;
var TYPE_8;
var Lcom_google_gwt_event_dom_client_TouchCancelEvent_2_classLit = createForClass('com.google.gwt.event.dom.client', 'TouchCancelEvent', 466);
function $clinit_TouchEndEvent(){
  $clinit_TouchEndEvent = emptyMethod;
  TYPE_9 = new DomEvent$Type('touchend', new TouchEndEvent);
}

function TouchEndEvent(){
}

defineClass(465, 525, {}, TouchEndEvent);
_.dispatch = function dispatch_9(handler){
  $onTouchEnd(castTo(handler, 535).this$01);
}
;
_.getAssociatedType = function getAssociatedType_33(){
  return TYPE_9;
}
;
_.getAssociatedType_0 = function getAssociatedType_34(){
  return TYPE_9;
}
;
_.getAssociatedType_1 = function getAssociatedType_32(){
  return TYPE_9;
}
;
var TYPE_9;
var Lcom_google_gwt_event_dom_client_TouchEndEvent_2_classLit = createForClass('com.google.gwt.event.dom.client', 'TouchEndEvent', 465);
function TouchEvent$TouchSupportDetector(){
  this.isSupported = 'ontouchstart' in $wnd;
}

defineClass(463, 1, {}, TouchEvent$TouchSupportDetector);
_.isSupported = false;
var Lcom_google_gwt_event_dom_client_TouchEvent$TouchSupportDetector_2_classLit = createForClass('com.google.gwt.event.dom.client', 'TouchEvent/TouchSupportDetector', 463);
function $clinit_TouchMoveEvent(){
  $clinit_TouchMoveEvent = emptyMethod;
  TYPE_10 = new DomEvent$Type('touchmove', new TouchMoveEvent);
}

function $dispatch(this$static, handler){
  $onTouchMove(handler.this$01, this$static);
}

function TouchMoveEvent(){
}

defineClass(464, 525, {}, TouchMoveEvent);
_.dispatch = function dispatch_10(handler){
  $dispatch(this, castTo(handler, 534));
}
;
_.getAssociatedType = function getAssociatedType_36(){
  return TYPE_10;
}
;
_.getAssociatedType_0 = function getAssociatedType_37(){
  return TYPE_10;
}
;
_.getAssociatedType_1 = function getAssociatedType_35(){
  return TYPE_10;
}
;
var TYPE_10;
var Lcom_google_gwt_event_dom_client_TouchMoveEvent_2_classLit = createForClass('com.google.gwt.event.dom.client', 'TouchMoveEvent', 464);
function $clinit_TouchStartEvent(){
  $clinit_TouchStartEvent = emptyMethod;
  TYPE_11 = new DomEvent$Type('touchstart', new TouchStartEvent);
}

function $dispatch_0(this$static, handler){
  $onTouchStart(handler.this$01, this$static);
}

function TouchStartEvent(){
}

defineClass(462, 525, {}, TouchStartEvent);
_.dispatch = function dispatch_11(handler){
  $dispatch_0(this, castTo(handler, 533));
}
;
_.getAssociatedType = function getAssociatedType_39(){
  return TYPE_11;
}
;
_.getAssociatedType_0 = function getAssociatedType_40(){
  return TYPE_11;
}
;
_.getAssociatedType_1 = function getAssociatedType_38(){
  return TYPE_11;
}
;
var TYPE_11;
var Lcom_google_gwt_event_dom_client_TouchStartEvent_2_classLit = createForClass('com.google.gwt.event.dom.client', 'TouchStartEvent', 462);
function $dispatch_1(this$static, handler){
  this$static.attached?$setupBustClickHandler(handler.this$01):$removeBustClickHandler(handler.this$01);
}

function AttachEvent(attached){
  this.attached = attached;
}

function fire_0(source, attached){
  var event_0;
  if (TYPE_12) {
    event_0 = new AttachEvent(attached);
    !!source.handlerManager && $fireEvent(source.handlerManager, event_0);
  }
}

defineClass(429, 504, {}, AttachEvent);
_.dispatch = function dispatch_12(handler){
  $dispatch_1(this, castTo(handler, 531));
}
;
_.getAssociatedType_0 = function getAssociatedType_42(){
  return TYPE_12;
}
;
_.getAssociatedType = function getAssociatedType_41(){
  return TYPE_12;
}
;
_.attached = false;
var TYPE_12;
var Lcom_google_gwt_event_logical_shared_AttachEvent_2_classLit = createForClass('com.google.gwt.event.logical.shared', 'AttachEvent', 429);
function CloseEvent_0(autoClosed){
  this.autoClosed = autoClosed;
}

function fire_1(source, autoClosed){
  var event_0;
  if (TYPE_13) {
    event_0 = new CloseEvent_0(autoClosed);
    source.fireEvent(event_0);
  }
}

defineClass(434, 504, {}, CloseEvent_0);
_.dispatch = function dispatch_13(handler){
  castTo(handler, 487).onClose(this);
}
;
_.getAssociatedType_0 = function getAssociatedType_44(){
  return TYPE_13;
}
;
_.getAssociatedType = function getAssociatedType_43(){
  return TYPE_13;
}
;
_.autoClosed = false;
var TYPE_13;
var Lcom_google_gwt_event_logical_shared_CloseEvent_2_classLit = createForClass('com.google.gwt.event.logical.shared', 'CloseEvent', 434);
function ResizeEvent(width_0){
  this.width_0 = width_0;
}

function fire_2(source, width_0){
  var event_0;
  if (TYPE_14) {
    event_0 = new ResizeEvent(width_0);
    $fireEvent(source, event_0);
  }
}

defineClass(468, 504, {}, ResizeEvent);
_.dispatch = function dispatch_14(handler){
  castTo(handler, 136).onResize(this);
}
;
_.getAssociatedType_0 = function getAssociatedType_46(){
  return TYPE_14;
}
;
_.getAssociatedType = function getAssociatedType_45(){
  return TYPE_14;
}
;
_.width_0 = 0;
var TYPE_14;
var Lcom_google_gwt_event_logical_shared_ResizeEvent_2_classLit = createForClass('com.google.gwt.event.logical.shared', 'ResizeEvent', 468);
function ValueChangeEvent(){
}

function fire_3(source){
  var event_0;
  if (TYPE_15) {
    event_0 = new ValueChangeEvent;
    source.fireEvent(event_0);
  }
}

defineClass(414, 504, {}, ValueChangeEvent);
_.dispatch = function dispatch_15(handler){
  castTo(handler, 483).onValueChange(this);
}
;
_.getAssociatedType_0 = function getAssociatedType_48(){
  return TYPE_15;
}
;
_.getAssociatedType = function getAssociatedType_47(){
  return TYPE_15;
}
;
var TYPE_15;
var Lcom_google_gwt_event_logical_shared_ValueChangeEvent_2_classLit = createForClass('com.google.gwt.event.logical.shared', 'ValueChangeEvent', 414);
function $addHandler(this$static, type_0, handler){
  return new LegacyHandlerWrapper($doAdd(this$static.eventBus, type_0, handler));
}

function $fireEvent(this$static, event_0){
  var e, oldSource;
  !event_0.dead || event_0.revive();
  oldSource = event_0.source;
  $overrideSource(event_0, this$static.source);
  try {
    $doFire(this$static.eventBus, event_0);
  }
   catch ($e0) {
    $e0 = toJava($e0);
    if (instanceOf($e0, 81)) {
      e = $e0;
      throw toJs(new UmbrellaException_0(e.causes));
    }
     else 
      throw toJs($e0);
  }
   finally {
    oldSource == null?(event_0.dead = true , event_0.source = null):(event_0.source = oldSource);
  }
}

function $isEventHandled(this$static, e){
  return $isEventHandled_0(this$static.eventBus, e);
}

function HandlerManager(source){
  HandlerManager_0.call(this, source, false);
}

function HandlerManager_0(source, fireInReverseOrder){
  this.eventBus = new HandlerManager$Bus(fireInReverseOrder);
  this.source = source;
}

defineClass(78, 1, {10:1}, HandlerManager, HandlerManager_0);
_.fireEvent = function fireEvent(event_0){
  $fireEvent(this, event_0);
}
;
var Lcom_google_gwt_event_shared_HandlerManager_2_classLit = createForClass('com.google.gwt.event.shared', 'HandlerManager', 78);
defineClass(505, 1, {});
var Lcom_google_web_bindery_event_shared_EventBus_2_classLit = createForClass('com.google.web.bindery.event.shared', 'EventBus', 505);
function $defer(this$static, command){
  !this$static.deferredDeltas && (this$static.deferredDeltas = new ArrayList);
  $add_6(this$static.deferredDeltas, command);
}

function $doAdd(this$static, type_0, handler){
  var l;
  if (!type_0) {
    throw toJs(new NullPointerException_0('Cannot add a handler with a null type'));
  }
  if (!handler) {
    throw toJs(new NullPointerException_0('Cannot add a null handler'));
  }
  this$static.firingDepth > 0?$defer(this$static, new SimpleEventBus$2(this$static, type_0, handler)):(l = $ensureHandlerList(this$static, type_0, null) , l.add_0(handler));
  return new SimpleEventBus$1(this$static, type_0, handler);
}

function $doAddNow(this$static, type_0, source, handler){
  var l;
  l = $ensureHandlerList(this$static, type_0, source);
  l.add_0(handler);
}

function $doFire(this$static, event_0){
  var causes, directHandlers, e, handler, handlers, it;
  if (!event_0) {
    throw toJs(new NullPointerException_0('Cannot fire null event'));
  }
  try {
    ++this$static.firingDepth;
    handlers = (directHandlers = $getHandlerList(this$static, event_0.getAssociatedType_0(), null) , directHandlers);
    causes = null;
    it = this$static.isReverseOrder?handlers.listIterator_0(handlers.size_1()):handlers.listIterator();
    while (this$static.isReverseOrder?it.hasPrevious():it.hasNext_0()) {
      handler = this$static.isReverseOrder?it.previous():it.next_1();
      try {
        event_0.dispatch(castTo(handler, 21));
      }
       catch ($e0) {
        $e0 = toJava($e0);
        if (instanceOf($e0, 8)) {
          e = $e0;
          !causes && (causes = new HashSet);
          $put_1(causes.map_0, e, causes);
        }
         else 
          throw toJs($e0);
      }
    }
    if (causes) {
      throw toJs(new UmbrellaException(causes));
    }
  }
   finally {
    --this$static.firingDepth;
    this$static.firingDepth == 0 && $handleQueuedAddsAndRemoves(this$static);
  }
}

function $doRemoveNow(this$static, type_0, source, handler){
  var l, removed, sourceMap;
  l = $getHandlerList(this$static, type_0, source);
  removed = l.remove_1(handler);
  removed && l.isEmpty() && (sourceMap = castTo($get_2(this$static.map_0, type_0), 70) , castTo(sourceMap.remove_2(source), 37) , sourceMap.isEmpty() && $remove_8(this$static.map_0, type_0) , undefined);
}

function $ensureHandlerList(this$static, type_0, source){
  var handlers, sourceMap;
  sourceMap = castTo($get_2(this$static.map_0, type_0), 70);
  if (!sourceMap) {
    sourceMap = new HashMap;
    $put_1(this$static.map_0, type_0, sourceMap);
  }
  handlers = castTo(sourceMap.get_0(source), 37);
  if (!handlers) {
    handlers = new ArrayList;
    sourceMap.put(source, handlers);
  }
  return handlers;
}

function $getHandlerList(this$static, type_0, source){
  var handlers, sourceMap;
  sourceMap = castTo($get_2(this$static.map_0, type_0), 70);
  if (!sourceMap) {
    return $clinit_Collections() , $clinit_Collections() , EMPTY_LIST;
  }
  handlers = castTo(sourceMap.get_0(source), 37);
  if (!handlers) {
    return $clinit_Collections() , $clinit_Collections() , EMPTY_LIST;
  }
  return handlers;
}

function $handleQueuedAddsAndRemoves(this$static){
  var c, c$iterator;
  if (this$static.deferredDeltas) {
    try {
      for (c$iterator = new ArrayList$1(this$static.deferredDeltas); c$iterator.i < c$iterator.this$01.array.length;) {
        c = castTo($next_4(c$iterator), 481);
        c.execute_1();
      }
    }
     finally {
      this$static.deferredDeltas = null;
    }
  }
}

function $isEventHandled_0(this$static, eventKey){
  return $containsKey(this$static.map_0, eventKey);
}

defineClass(194, 505, {});
_.firingDepth = 0;
_.isReverseOrder = false;
var Lcom_google_web_bindery_event_shared_SimpleEventBus_2_classLit = createForClass('com.google.web.bindery.event.shared', 'SimpleEventBus', 194);
function $doRemove(this$static, type_0, source, handler){
  this$static.firingDepth > 0?$defer(this$static, new SimpleEventBus$3(this$static, type_0, source, handler)):$doRemoveNow(this$static, type_0, source, handler);
}

function HandlerManager$Bus(fireInReverseOrder){
  this.map_0 = new HashMap;
  this.isReverseOrder = fireInReverseOrder;
}

defineClass(195, 194, {}, HandlerManager$Bus);
var Lcom_google_gwt_event_shared_HandlerManager$Bus_2_classLit = createForClass('com.google.gwt.event.shared', 'HandlerManager/Bus', 195);
function LegacyHandlerWrapper(real){
  this.real = real;
}

defineClass(428, 1, {529:1}, LegacyHandlerWrapper);
var Lcom_google_gwt_event_shared_LegacyHandlerWrapper_2_classLit = createForClass('com.google.gwt.event.shared', 'LegacyHandlerWrapper', 428);
function UmbrellaException(causes){
  var cause, cause$iterator, i;
  RuntimeException_1.call(this, makeMessage(causes), causes.isEmpty()?null:castTo(causes.iterator().next_1(), 8));
  this.causes = causes;
  i = 0;
  for (cause$iterator = causes.iterator(); cause$iterator.hasNext_0();) {
    cause = castTo(cause$iterator.next_1(), 8);
    if (i++ == 0) {
      continue;
    }
    $addSuppressed(this, cause);
  }
}

function makeMessage(causes){
  var b, count, first, t, t$iterator;
  count = causes.size_1();
  if (count == 0) {
    return null;
  }
  b = new StringBuilder_1(count == 1?'Exception caught: ':count + ' exceptions caught: ');
  first = true;
  for (t$iterator = causes.iterator(); t$iterator.hasNext_0();) {
    t = castTo(t$iterator.next_1(), 8);
    first?(first = false):(b.string += '; ' , b);
    $append_2(b, t.getMessage());
  }
  return b.string;
}

defineClass(81, 12, $intern_9, UmbrellaException);
var Lcom_google_web_bindery_event_shared_UmbrellaException_2_classLit = createForClass('com.google.web.bindery.event.shared', 'UmbrellaException', 81);
function UmbrellaException_0(causes){
  UmbrellaException.call(this, causes);
}

defineClass(156, 81, $intern_9, UmbrellaException_0);
var Lcom_google_gwt_event_shared_UmbrellaException_2_classLit = createForClass('com.google.gwt.event.shared', 'UmbrellaException', 156);
function $cancel_1(this$static){
  var xhr;
  if (!this$static.xmlHttpRequest) {
    return;
  }
  $cancel_0(this$static.timer);
  xhr = this$static.xmlHttpRequest;
  this$static.xmlHttpRequest = null;
  $clearOnReadyStateChange(xhr);
  xhr.abort();
}

function $fireOnResponseReceived(this$static, callback){
  var response, xhr;
  if (!this$static.xmlHttpRequest) {
    return;
  }
  $cancel_0(this$static.timer);
  xhr = this$static.xmlHttpRequest;
  this$static.xmlHttpRequest = null;
  response = new ResponseImpl(xhr);
  callback.onResponseReceived(this$static, response);
}

function $fireOnTimeout(this$static){
  if (!this$static.xmlHttpRequest) {
    return;
  }
  $cancel_1(this$static);
  this$static.callback.onError(this$static, new RequestTimeoutException(this$static.timeoutMillis));
}

function Request_0(xmlHttpRequest, timeoutMillis, callback){
  this.timer = new Request$1(this);
  if (!xmlHttpRequest) {
    throw toJs(new NullPointerException);
  }
  if (!callback) {
    throw toJs(new NullPointerException);
  }
  if (timeoutMillis < 0) {
    throw toJs(new IllegalArgumentException);
  }
  this.callback = callback;
  this.timeoutMillis = timeoutMillis;
  this.xmlHttpRequest = xmlHttpRequest;
  timeoutMillis > 0 && $schedule(this.timer, timeoutMillis);
}

defineClass(205, 1, {}, Request_0);
_.timeoutMillis = 0;
var Lcom_google_gwt_http_client_Request_2_classLit = createForClass('com.google.gwt.http.client', 'Request', 205);
function Request$1(this$0){
  this.this$01 = this$0;
  Timer.call(this);
}

defineClass(206, 100, {}, Request$1);
_.run = function run_0(){
  $fireOnTimeout(this.this$01);
}
;
var Lcom_google_gwt_http_client_Request$1_2_classLit = createForClass('com.google.gwt.http.client', 'Request/1', 206);
function $clinit_RequestBuilder(){
  $clinit_RequestBuilder = emptyMethod;
  new RequestBuilder$Method('DELETE');
  GET = new RequestBuilder$Method('GET');
  new RequestBuilder$Method('HEAD');
  new RequestBuilder$Method('POST');
  new RequestBuilder$Method('PUT');
}

function $doSend(this$static, callback){
  var e, request, requestPermissionException, xmlHttpRequest;
  xmlHttpRequest = new $wnd.XMLHttpRequest;
  try {
    $open(xmlHttpRequest, this$static.httpMethod, this$static.url_0);
  }
   catch ($e0) {
    $e0 = toJava($e0);
    if (instanceOf($e0, 48)) {
      e = $e0;
      requestPermissionException = new RequestPermissionException(this$static.url_0);
      $initCause(requestPermissionException, new RequestException(e.getMessage()));
      throw toJs(requestPermissionException);
    }
     else 
      throw toJs($e0);
  }
  $setHeaders(this$static, xmlHttpRequest);
  this$static.includeCredentials && (xmlHttpRequest.withCredentials = true , undefined);
  request = new Request_0(xmlHttpRequest, this$static.timeoutMillis, callback);
  $setOnReadyStateChange(xmlHttpRequest, new RequestBuilder$1(request, callback));
  try {
    xmlHttpRequest.send(null);
  }
   catch ($e1) {
    $e1 = toJava($e1);
    if (instanceOf($e1, 48)) {
      e = $e1;
      throw toJs(new RequestException(e.getMessage()));
    }
     else 
      throw toJs($e1);
  }
  return request;
}

function $sendRequest(this$static, callback){
  throwIfNull('callback', callback);
  return $doSend(this$static, callback);
}

function $setHeader(this$static, header, value_0){
  throwIfEmptyOrNull('header', header);
  throwIfEmptyOrNull('value', value_0);
  !this$static.headers && (this$static.headers = new HashMap);
  $putStringValue(this$static.headers, header, value_0);
}

function $setHeaders(this$static, xmlHttpRequest){
  var e, header, header$iterator;
  if (!!this$static.headers && $size(this$static.headers) > 0) {
    for (header$iterator = new AbstractHashMap$EntrySetIterator((new AbstractHashMap$EntrySet(this$static.headers)).this$01); header$iterator.hasNext;) {
      header = $next_3(header$iterator);
      try {
        $setRequestHeader(xmlHttpRequest, castToString(header.getKey()), castToString(header.getValue()));
      }
       catch ($e0) {
        $e0 = toJava($e0);
        if (instanceOf($e0, 48)) {
          e = $e0;
          throw toJs(new RequestException(e.getMessage()));
        }
         else 
          throw toJs($e0);
      }
    }
  }
   else {
    xmlHttpRequest.setRequestHeader('Content-Type', 'text/plain; charset=utf-8');
  }
}

function RequestBuilder(httpMethod, url_0){
  $clinit_RequestBuilder();
  RequestBuilder_0.call(this, !httpMethod?null:httpMethod.name_0, url_0);
}

function RequestBuilder_0(httpMethod, url_0){
  throwIfEmptyOrNull('httpMethod', httpMethod);
  throwIfEmptyOrNull('url', url_0);
  this.httpMethod = httpMethod;
  this.url_0 = url_0;
}

defineClass(79, 1, {}, RequestBuilder);
_.includeCredentials = false;
_.timeoutMillis = 0;
var GET;
var Lcom_google_gwt_http_client_RequestBuilder_2_classLit = createForClass('com.google.gwt.http.client', 'RequestBuilder', 79);
function RequestBuilder$1(val$request, val$callback){
  this.val$request2 = val$request;
  this.val$callback3 = val$callback;
}

defineClass(204, 1, {}, RequestBuilder$1);
_.onReadyStateChange = function onReadyStateChange(xhr){
  if (xhr.readyState == 4) {
    $clearOnReadyStateChange(xhr);
    $fireOnResponseReceived(this.val$request2, this.val$callback3);
  }
}
;
var Lcom_google_gwt_http_client_RequestBuilder$1_2_classLit = createForClass('com.google.gwt.http.client', 'RequestBuilder/1', 204);
function RequestBuilder$Method(name_0){
  this.name_0 = name_0;
}

defineClass(87, 1, {}, RequestBuilder$Method);
_.toString_0 = function toString_5(){
  return this.name_0;
}
;
var Lcom_google_gwt_http_client_RequestBuilder$Method_2_classLit = createForClass('com.google.gwt.http.client', 'RequestBuilder/Method', 87);
function RequestException(message){
  Exception.call(this, message);
}

defineClass(36, 19, $intern_10, RequestException);
var Lcom_google_gwt_http_client_RequestException_2_classLit = createForClass('com.google.gwt.http.client', 'RequestException', 36);
function RequestPermissionException(url_0){
  RequestException.call(this, 'The URL ' + url_0 + ' is invalid or violates the same-origin security restriction');
}

defineClass(309, 36, $intern_10, RequestPermissionException);
var Lcom_google_gwt_http_client_RequestPermissionException_2_classLit = createForClass('com.google.gwt.http.client', 'RequestPermissionException', 309);
function RequestTimeoutException(timeoutMillis){
  RequestException.call(this, 'A request timeout has expired after ' + timeoutMillis + ' ms');
}

defineClass(431, 36, $intern_10, RequestTimeoutException);
var Lcom_google_gwt_http_client_RequestTimeoutException_2_classLit = createForClass('com.google.gwt.http.client', 'RequestTimeoutException', 431);
defineClass(502, 1, {});
var Lcom_google_gwt_http_client_Response_2_classLit = createForClass('com.google.gwt.http.client', 'Response', 502);
function ResponseImpl(xmlHttpRequest){
  this.xmlHttpRequest = xmlHttpRequest;
}

defineClass(418, 502, {}, ResponseImpl);
_.getStatusCode = function getStatusCode(){
  return this.xmlHttpRequest.status;
}
;
_.getText = function getText(){
  return this.xmlHttpRequest.responseText;
}
;
var Lcom_google_gwt_http_client_ResponseImpl_2_classLit = createForClass('com.google.gwt.http.client', 'ResponseImpl', 418);
function throwIfEmptyOrNull(name_0, value_0){
  throwIfNull(name_0, value_0);
  if (0 == $trim(value_0).length) {
    throw toJs(new IllegalArgumentException_0(name_0 + ' cannot be empty'));
  }
}

function throwIfNull(name_0, value_0){
  if (null == value_0) {
    throw toJs(new NullPointerException_0(name_0 + ' cannot be null'));
  }
}

function getDirectionOnElement(elem){
  var dirPropertyValue;
  dirPropertyValue = $getPropertyString(elem, 'dir');
  if ($equalsIgnoreCase('rtl', dirPropertyValue)) {
    return $clinit_HasDirection$Direction() , RTL;
  }
   else if ($equalsIgnoreCase('ltr', dirPropertyValue)) {
    return $clinit_HasDirection$Direction() , LTR;
  }
  return $clinit_HasDirection$Direction() , DEFAULT;
}

function setDirectionOnElement(elem, direction){
  switch (direction.ordinal) {
    case 0:
      {
        elem['dir'] = 'rtl';
        break;
      }

    case 1:
      {
        elem['dir'] = 'ltr';
        break;
      }

    case 2:
      {
        getDirectionOnElement(elem) != ($clinit_HasDirection$Direction() , DEFAULT) && (elem['dir'] = '' , undefined);
        break;
      }

  }
}

function $clinit_DateTimeFormat(){
  $clinit_DateTimeFormat = emptyMethod;
  new HashMap;
}

function $addPart(this$static, buf, count){
  var oldLength;
  if (buf.string.length > 0) {
    $add_6(this$static.patternParts, new DateTimeFormat$PatternPart(buf.string, count));
    oldLength = buf.string.length;
    0 < oldLength?(buf.string = $substring_0(buf.string, 0, 0)):0 > oldLength && (buf.string += valueOf_2(initUnidimensionalArray(C_classLit, $intern_1, 32, -oldLength, 15, 1)));
  }
}

function $format(this$static, date, timeZone){
  var ch_0, diff, i, j, keepDate, keepTime, n, toAppendTo, trailQuote;
  !timeZone && (timeZone = createTimeZone(date.jsdate.getTimezoneOffset()));
  diff = (date.jsdate.getTimezoneOffset() - timeZone.standardOffset) * 60000;
  keepDate = new Date_0(add_2(fromDouble_0(date.jsdate.getTime()), diff));
  keepTime = keepDate;
  if (keepDate.jsdate.getTimezoneOffset() != date.jsdate.getTimezoneOffset()) {
    diff > 0?(diff -= 86400000):(diff += 86400000);
    keepTime = new Date_0(add_2(fromDouble_0(date.jsdate.getTime()), diff));
  }
  toAppendTo = new StringBuilder_0;
  n = this$static.pattern.length;
  for (i = 0; i < n;) {
    ch_0 = $charAt(this$static.pattern, i);
    if (ch_0 >= 97 && ch_0 <= 122 || ch_0 >= 65 && ch_0 <= 90) {
      for (j = i + 1; j < n && $charAt(this$static.pattern, j) == ch_0; ++j)
      ;
      $subFormat(toAppendTo, ch_0, j - i, keepDate, keepTime, timeZone);
      i = j;
    }
     else if (ch_0 == 39) {
      ++i;
      if (i < n && $charAt(this$static.pattern, i) == 39) {
        toAppendTo.string += "'";
        ++i;
        continue;
      }
      trailQuote = false;
      while (!trailQuote) {
        j = i;
        while (j < n && $charAt(this$static.pattern, j) != 39) {
          ++j;
        }
        if (j >= n) {
          throw toJs(new IllegalArgumentException_0("Missing trailing '"));
        }
        j + 1 < n && $charAt(this$static.pattern, j + 1) == 39?++j:(trailQuote = true);
        $append_2(toAppendTo, $substring_0(this$static.pattern, i, j));
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
    buf.string += String.fromCharCode(48 + value_0 & $intern_11);
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

function $formatMonth(buf, count, date){
  var value_0;
  value_0 = date.jsdate.getMonth();
  switch (count) {
    case 5:
      $append_2(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['J', 'F', 'M', 'A', 'M', 'J', 'J', 'A', 'S', 'O', 'N', 'D'])[value_0]);
      break;
    case 4:
      $append_2(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'])[value_0]);
      break;
    case 3:
      $append_2(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'])[value_0]);
      break;
    default:$zeroPaddingNumber(buf, value_0 + 1, count);
  }
}

function $formatYear(buf, count, date){
  var value_0;
  value_0 = date.jsdate.getFullYear() - 1900 + 1900;
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
    if ($isNumeric(castTo($get_3(this$static.patternParts, i), 91))) {
      if (!abut && i + 1 < len && $isNumeric(castTo($get_3(this$static.patternParts, i + 1), 91))) {
        abut = true;
        castTo($get_3(this$static.patternParts, i), 91).abutStart = true;
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
  i = $indexOf_0('MLydhHmsSDkK', fromCodePoint($charAt(part.text_0, 0)));
  return i > 1 || i >= 0 && part.count < 3;
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
    if ($indexOf_0('GyMLdkHmsSEcDahKzZv', fromCodePoint(ch_0)) > 0) {
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

function $subFormat(buf, ch_0, count, adjustedDate, adjustedTime, timezone){
  var value_0, value0, value1, value10, value2, value3, value4, value5, value6, value7, value8, value9;
  switch (ch_0) {
    case 71:
      value0 = adjustedDate.jsdate.getFullYear() - 1900 >= -1900?1:0;
      count >= 4?$append_2(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Before Christ', 'Anno Domini'])[value0]):$append_2(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['BC', 'AD'])[value0]);
      break;
    case 121:
      $formatYear(buf, count, adjustedDate);
      break;
    case 77:
      $formatMonth(buf, count, adjustedDate);
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
      count == 5?$append_2(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['S', 'M', 'T', 'W', 'T', 'F', 'S'])[value2]):count == 4?$append_2(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'])[value2]):$append_2(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'])[value2]);
      break;
    case 97:
      adjustedTime.jsdate.getHours() >= 12 && adjustedTime.jsdate.getHours() < 24?$append_2(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['AM', 'PM'])[1]):$append_2(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['AM', 'PM'])[0]);
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
      count == 5?$append_2(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['S', 'M', 'T', 'W', 'T', 'F', 'S'])[value6]):count == 4?$append_2(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'])[value6]):count == 3?$append_2(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'])[value6]):$zeroPaddingNumber(buf, value6, 1);
      break;
    case 76:
      value7 = adjustedDate.jsdate.getMonth();
      count == 5?$append_2(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['J', 'F', 'M', 'A', 'M', 'J', 'J', 'A', 'S', 'O', 'N', 'D'])[value7]):count == 4?$append_2(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'])[value7]):count == 3?$append_2(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'])[value7]):$zeroPaddingNumber(buf, value7 + 1, count);
      break;
    case 81:
      value8 = adjustedDate.jsdate.getMonth() / 3 | 0;
      count < 4?$append_2(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Q1', 'Q2', 'Q3', 'Q4'])[value8]):$append_2(buf, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['1st quarter', '2nd quarter', '3rd quarter', '4th quarter'])[value8]);
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
      count < 4?$append_2(buf, timezone.tzNames[0]):$append_2(buf, timezone.tzNames[1]);
      break;
    case 118:
      $append_2(buf, timezone.timezoneID);
      break;
    case 90:
      count < 3?$append_2(buf, $getRFCTimeZoneString(timezone)):count == 3?$append_2(buf, $getISOTimeZoneString(timezone)):$append_2(buf, composeGMTString(timezone.standardOffset));
      break;
    default:return false;
  }
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

defineClass(411, 1, {});
var Lcom_google_gwt_i18n_shared_DateTimeFormat_2_classLit = createForClass('com.google.gwt.i18n.shared', 'DateTimeFormat', 411);
function $clinit_DateTimeFormat_0(){
  $clinit_DateTimeFormat_0 = emptyMethod;
  $clinit_DateTimeFormat();
  cache_0 = new HashMap;
}

function DateTimeFormat(pattern){
  $clinit_DateTimeFormat();
  this.patternParts = new ArrayList;
  this.pattern = pattern;
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
      default:throw toJs(new IllegalStateException_0('Unexpected predef type ' + predef));
    }
    return getFormat_0(pattern0, new DateTimeFormatInfoImpl_en);
  }
  dtfi = $getDateTimeFormatInfo(($clinit_LocaleInfo() , $clinit_LocaleInfo() , instance_0));
  switch (predef.ordinal) {
    case 2:
      pattern = 'y MMMM d, EEEE';
      break;
    case 30:
    case 3:
      pattern = 'y MMMM d';
      break;
    case 29:
    case 4:
      pattern = 'y MMM d';
      break;
    case 5:
      pattern = 'y-MM-dd';
      break;
    case 10:
      pattern = 'y MMMM d, EEEE HH:mm:ss zzzz';
      break;
    case 11:
      pattern = 'y MMMM d HH:mm:ss z';
      break;
    case 12:
      pattern = 'y MMM d HH:mm:ss';
      break;
    case 13:
      pattern = 'y-MM-dd HH:mm';
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
      pattern = 'MMM d';
      break;
    case 23:
      pattern = 'MMMM d';
      break;
    case 24:
      pattern = 'MM-dd';
      break;
    case 25:
      pattern = 'MMMM d, EEEE';
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
      pattern = 'y MMMM';
      break;
    case 28:
      pattern = 'y MMM';
      break;
    case 31:
      pattern = 'y-MM';
      break;
    case 32:
      pattern = 'y-M-d';
      break;
    case 33:
      pattern = 'y MMM d, EEE';
      break;
    case 34:
      pattern = 'y QQQQ';
      break;
    case 35:
      pattern = 'y Q';
      break;
    default:throw toJs(new IllegalArgumentException_0('Unexpected predefined format ' + predef));
  }
  return getFormat_0(pattern, dtfi);
}

function getFormat_0(pattern, dtfi){
  var defaultDtfi, dtf;
  defaultDtfi = $getDateTimeFormatInfo(($clinit_LocaleInfo() , $clinit_LocaleInfo() , instance_0));
  dtf = null;
  dtfi == defaultDtfi && (dtf = castTo($getStringValue(cache_0, pattern), 126));
  if (!dtf) {
    dtf = new DateTimeFormat(pattern);
    dtfi == defaultDtfi && $putStringValue(cache_0, pattern, dtf);
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

defineClass(126, 411, {126:1}, DateTimeFormat);
var cache_0;
var Lcom_google_gwt_i18n_client_DateTimeFormat_2_classLit = createForClass('com.google.gwt.i18n.client', 'DateTimeFormat', 126);
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
  Enum.call(this, enum$name, enum$ordinal);
}

function values_8(){
  $clinit_DateTimeFormat$PredefinedFormat();
  return stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_i18n_client_DateTimeFormat$PredefinedFormat_2_classLit, 1), $intern_1, 18, 0, [ISO_8601, RFC_2822, DATE_FULL, DATE_LONG, DATE_MEDIUM, DATE_SHORT, TIME_FULL, TIME_LONG, TIME_MEDIUM, TIME_SHORT, DATE_TIME_FULL, DATE_TIME_LONG, DATE_TIME_MEDIUM, DATE_TIME_SHORT, DAY, HOUR_MINUTE, HOUR_MINUTE_SECOND, HOUR24_MINUTE, HOUR24_MINUTE_SECOND, MINUTE_SECOND, MONTH, MONTH_ABBR, MONTH_ABBR_DAY, MONTH_DAY, MONTH_NUM_DAY, MONTH_WEEKDAY_DAY, YEAR, YEAR_MONTH, YEAR_MONTH_ABBR, YEAR_MONTH_ABBR_DAY, YEAR_MONTH_DAY, YEAR_MONTH_NUM, YEAR_MONTH_NUM_DAY, YEAR_MONTH_WEEKDAY_DAY, YEAR_QUARTER, YEAR_QUARTER_ABBR]);
}

defineClass(18, 4, {18:1, 3:1, 5:1, 4:1}, DateTimeFormat$PredefinedFormat);
var DATE_FULL, DATE_LONG, DATE_MEDIUM, DATE_SHORT, DATE_TIME_FULL, DATE_TIME_LONG, DATE_TIME_MEDIUM, DATE_TIME_SHORT, DAY, HOUR24_MINUTE, HOUR24_MINUTE_SECOND, HOUR_MINUTE, HOUR_MINUTE_SECOND, ISO_8601, MINUTE_SECOND, MONTH, MONTH_ABBR, MONTH_ABBR_DAY, MONTH_DAY, MONTH_NUM_DAY, MONTH_WEEKDAY_DAY, RFC_2822, TIME_FULL, TIME_LONG, TIME_MEDIUM, TIME_SHORT, YEAR, YEAR_MONTH, YEAR_MONTH_ABBR, YEAR_MONTH_ABBR_DAY, YEAR_MONTH_DAY, YEAR_MONTH_NUM, YEAR_MONTH_NUM_DAY, YEAR_MONTH_WEEKDAY_DAY, YEAR_QUARTER, YEAR_QUARTER_ABBR;
var Lcom_google_gwt_i18n_client_DateTimeFormat$PredefinedFormat_2_classLit = createForEnum('com.google.gwt.i18n.client', 'DateTimeFormat/PredefinedFormat', 18, values_8);
defineClass(519, 1, {});
var Lcom_google_gwt_i18n_shared_DefaultDateTimeFormatInfo_2_classLit = createForClass('com.google.gwt.i18n.shared', 'DefaultDateTimeFormatInfo', 519);
defineClass(520, 519, {});
var Lcom_google_gwt_i18n_client_DefaultDateTimeFormatInfo_2_classLit = createForClass('com.google.gwt.i18n.client', 'DefaultDateTimeFormatInfo', 520);
function $clinit_HasDirection$Direction(){
  $clinit_HasDirection$Direction = emptyMethod;
  RTL = new HasDirection$Direction('RTL', 0);
  LTR = new HasDirection$Direction('LTR', 1);
  DEFAULT = new HasDirection$Direction('DEFAULT', 2);
}

function HasDirection$Direction(enum$name, enum$ordinal){
  Enum.call(this, enum$name, enum$ordinal);
}

function values_9(){
  $clinit_HasDirection$Direction();
  return stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_i18n_client_HasDirection$Direction_2_classLit, 1), $intern_1, 86, 0, [RTL, LTR, DEFAULT]);
}

defineClass(86, 4, {86:1, 3:1, 5:1, 4:1}, HasDirection$Direction);
var DEFAULT, LTR, RTL;
var Lcom_google_gwt_i18n_client_HasDirection$Direction_2_classLit = createForEnum('com.google.gwt.i18n.client', 'HasDirection/Direction', 86, values_9);
function $clinit_LocaleInfo(){
  $clinit_LocaleInfo = emptyMethod;
  instance_0 = new LocaleInfo;
}

function $getDateTimeFormatInfo(this$static){
  !this$static.dateTimeFormatInfo && (this$static.dateTimeFormatInfo = new DateTimeFormatInfoImpl);
  return this$static.dateTimeFormatInfo;
}

function LocaleInfo(){
}

defineClass(263, 1, {}, LocaleInfo);
var instance_0;
var Lcom_google_gwt_i18n_client_LocaleInfo_2_classLit = createForClass('com.google.gwt.i18n.client', 'LocaleInfo', 263);
function $getISOTimeZoneString(this$static){
  var data_0, offset;
  offset = -this$static.standardOffset;
  data_0 = stampJavaTypeInfo(getClassLiteralForArray(C_classLit, 1), $intern_1, 32, 15, [43, 48, 48, 58, 48, 48]);
  if (offset < 0) {
    data_0[0] = 45;
    offset = -offset;
  }
  data_0[1] = data_0[1] + ((offset / 60 | 0) / 10 | 0) & $intern_11;
  data_0[2] = data_0[2] + (offset / 60 | 0) % 10 & $intern_11;
  data_0[4] = data_0[4] + (offset % 60 / 10 | 0) & $intern_11;
  data_0[5] = data_0[5] + offset % 10 & $intern_11;
  return valueOf_3(data_0, data_0.length);
}

function $getRFCTimeZoneString(this$static){
  var data_0, offset;
  offset = -this$static.standardOffset;
  data_0 = stampJavaTypeInfo(getClassLiteralForArray(C_classLit, 1), $intern_1, 32, 15, [43, 48, 48, 48, 48]);
  if (offset < 0) {
    data_0[0] = 45;
    offset = -offset;
  }
  data_0[1] = data_0[1] + ((offset / 60 | 0) / 10 | 0) & $intern_11;
  data_0[2] = data_0[2] + (offset / 60 | 0) % 10 & $intern_11;
  data_0[3] = data_0[3] + (offset % 60 / 10 | 0) & $intern_11;
  data_0[4] = data_0[4] + offset % 10 & $intern_11;
  return valueOf_3(data_0, data_0.length);
}

function TimeZone(){
}

function composeGMTString(offset){
  var data_0;
  data_0 = stampJavaTypeInfo(getClassLiteralForArray(C_classLit, 1), $intern_1, 32, 15, [71, 77, 84, 45, 48, 48, 58, 48, 48]);
  if (offset <= 0) {
    data_0[3] = 43;
    offset = -offset;
  }
  data_0[4] = data_0[4] + ((offset / 60 | 0) / 10 | 0) & $intern_11;
  data_0[5] = data_0[5] + (offset / 60 | 0) % 10 & $intern_11;
  data_0[7] = data_0[7] + (offset % 60 / 10 | 0) & $intern_11;
  data_0[8] = data_0[8] + offset % 10 & $intern_11;
  return valueOf_3(data_0, data_0.length);
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

defineClass(452, 1, {}, TimeZone);
_.standardOffset = 0;
var Lcom_google_gwt_i18n_client_TimeZone_2_classLit = createForClass('com.google.gwt.i18n.client', 'TimeZone', 452);
function DateTimeFormatInfoImpl(){
}

defineClass(425, 520, {}, DateTimeFormatInfoImpl);
var Lcom_google_gwt_i18n_client_impl_cldr_DateTimeFormatInfoImpl_2_classLit = createForClass('com.google.gwt.i18n.client.impl.cldr', 'DateTimeFormatInfoImpl', 425);
function DateTimeFormatInfoImpl_en(){
}

defineClass(426, 425, {}, DateTimeFormatInfoImpl_en);
var Lcom_google_gwt_i18n_client_impl_cldr_DateTimeFormatInfoImpl_1en_2_classLit = createForClass('com.google.gwt.i18n.client.impl.cldr', 'DateTimeFormatInfoImpl_en', 426);
function DateTimeFormat$PatternPart(txt, cnt){
  this.text_0 = txt;
  this.count = cnt;
  this.abutStart = false;
}

defineClass(91, 1, {91:1}, DateTimeFormat$PatternPart);
_.abutStart = false;
_.count = 0;
var Lcom_google_gwt_i18n_shared_DateTimeFormat$PatternPart_2_classLit = createForClass('com.google.gwt.i18n.shared', 'DateTimeFormat/PatternPart', 91);
defineClass(521, 1, {});
_.isArray_0 = function isArray(){
  return null;
}
;
_.isObject = function isObject(){
  return null;
}
;
_.isString = function isString(){
  return null;
}
;
var Lcom_google_gwt_json_client_JSONValue_2_classLit = createForClass('com.google.gwt.json.client', 'JSONValue', 521);
function $get(this$static, index_0){
  var v = this$static.jsArray[index_0];
  var func = ($clinit_JSONParser() , typeMap)[typeof v];
  return func?func(v):throwUnknownTypeException(typeof v);
}

function $set0(this$static, index_0, value_0){
  if (value_0) {
    var func = value_0.getUnwrapper();
    value_0 = func(value_0);
  }
   else {
    value_0 = undefined;
  }
  this$static.jsArray[index_0] = value_0;
}

function JSONArray(){
  this.jsArray = [];
}

function JSONArray_0(arr){
  this.jsArray = arr;
}

function unwrap(value_0){
  return value_0.jsArray;
}

defineClass(67, 521, {67:1}, JSONArray, JSONArray_0);
_.equals_0 = function equals_1(other){
  if (!instanceOf(other, 67)) {
    return false;
  }
  return $equals_0(this.jsArray, castTo(other, 67).jsArray);
}
;
_.getUnwrapper = function getUnwrapper(){
  return unwrap;
}
;
_.hashCode_0 = function hashCode_3(){
  return $hashCode(this.jsArray);
}
;
_.isArray_0 = function isArray_0(){
  return this;
}
;
_.toString_0 = function toString_6(){
  var c, i, sb;
  sb = new StringBuilder_1('[');
  for (i = 0 , c = this.jsArray.length; i < c; i++) {
    i > 0 && (sb.string += ',' , sb);
    $append_1(sb, $get(this, i));
  }
  sb.string += ']';
  return sb.string;
}
;
var Lcom_google_gwt_json_client_JSONArray_2_classLit = createForClass('com.google.gwt.json.client', 'JSONArray', 67);
function $clinit_JSONBoolean(){
  $clinit_JSONBoolean = emptyMethod;
  FALSE_1 = new JSONBoolean(false);
  TRUE_1 = new JSONBoolean(true);
}

function JSONBoolean(value_0){
  this.value_0 = value_0;
}

function unwrap_0(value_0){
  return value_0.value_0;
}

defineClass(166, 521, {}, JSONBoolean);
_.getUnwrapper = function getUnwrapper_0(){
  return unwrap_0;
}
;
_.toString_0 = function toString_7(){
  return $clinit_Boolean() , '' + this.value_0;
}
;
_.value_0 = false;
var FALSE_1, TRUE_1;
var Lcom_google_gwt_json_client_JSONBoolean_2_classLit = createForClass('com.google.gwt.json.client', 'JSONBoolean', 166);
function JSONException(message){
  RuntimeException_0.call(this, message);
}

function JSONException_0(cause){
  this.detailMessage = !cause?null:$toString(cause, cause.getMessage());
  this.cause_0 = cause;
  $fillInStackTrace(this);
  this.initializeBackingError();
}

defineClass(130, 12, $intern_2, JSONException, JSONException_0);
var Lcom_google_gwt_json_client_JSONException_2_classLit = createForClass('com.google.gwt.json.client', 'JSONException', 130);
function $clinit_JSONNull(){
  $clinit_JSONNull = emptyMethod;
  instance_1 = new JSONNull;
}

function JSONNull(){
}

function unwrap_1(){
  return null;
}

defineClass(467, 521, {}, JSONNull);
_.getUnwrapper = function getUnwrapper_1(){
  return unwrap_1;
}
;
_.toString_0 = function toString_8(){
  return 'null';
}
;
var instance_1;
var Lcom_google_gwt_json_client_JSONNull_2_classLit = createForClass('com.google.gwt.json.client', 'JSONNull', 467);
function JSONNumber(value_0){
  this.value_0 = value_0;
}

function unwrap_2(value_0){
  return value_0.value_0;
}

defineClass(110, 521, {110:1}, JSONNumber);
_.equals_0 = function equals_2(other){
  if (!instanceOf(other, 110)) {
    return false;
  }
  return this.value_0 == castTo(other, 110).value_0;
}
;
_.getUnwrapper = function getUnwrapper_2(){
  return unwrap_2;
}
;
_.hashCode_0 = function hashCode_4(){
  return $hashCode_0(this.value_0);
}
;
_.toString_0 = function toString_9(){
  return this.value_0 + '';
}
;
_.value_0 = 0;
var Lcom_google_gwt_json_client_JSONNumber_2_classLit = createForClass('com.google.gwt.json.client', 'JSONNumber', 110);
function $computeKeys0(this$static, result){
  var jsObject = this$static.jsObject;
  var i = 0;
  for (var key in jsObject) {
    jsObject.hasOwnProperty(key) && (result[i++] = key);
  }
  return result;
}

function $get_0(this$static, key){
  if (key == null) {
    throw toJs(new NullPointerException);
  }
  return $get0(this$static, key);
}

function $get0(this$static, key){
  var jsObject = this$static.jsObject;
  var v;
  key = String(key);
  jsObject.hasOwnProperty(key) && (v = jsObject[key]);
  var func = ($clinit_JSONParser() , typeMap)[typeof v];
  var ret = func?func(v):throwUnknownTypeException(typeof v);
  return ret;
}

function $put(this$static, key, jsonValue){
  var previous;
  previous = $get_0(this$static, key);
  $put0(this$static, key, jsonValue);
  return previous;
}

function $put0(this$static, key, value_0){
  if (value_0) {
    var func = value_0.getUnwrapper();
    this$static.jsObject[key] = func(value_0);
  }
   else {
    delete this$static.jsObject[key];
  }
}

function $toString_0(this$static){
  var first, key, key$array, key$index, key$max, keys_0, sb;
  sb = new StringBuilder_1('{');
  first = true;
  keys_0 = $computeKeys0(this$static, initUnidimensionalArray(Ljava_lang_String_2_classLit, $intern_1, 2, 0, 6, 1));
  for (key$array = keys_0 , key$index = 0 , key$max = key$array.length; key$index < key$max; ++key$index) {
    key = key$array[key$index];
    first?(first = false):(sb.string += ', ' , sb);
    $append_2(sb, escapeValue(key));
    sb.string += ':';
    $append_1(sb, $get_0(this$static, key));
  }
  sb.string += '}';
  return sb.string;
}

function JSONObject(){
  JSONObject_0.call(this, {});
}

function JSONObject_0(jsValue){
  this.jsObject = jsValue;
}

function unwrap_3(value_0){
  return value_0.jsObject;
}

defineClass(66, 521, {66:1}, JSONObject, JSONObject_0);
_.equals_0 = function equals_3(other){
  if (!instanceOf(other, 66)) {
    return false;
  }
  return $equals_0(this.jsObject, castTo(other, 66).jsObject);
}
;
_.getUnwrapper = function getUnwrapper_3(){
  return unwrap_3;
}
;
_.hashCode_0 = function hashCode_5(){
  return $hashCode(this.jsObject);
}
;
_.isObject = function isObject_0(){
  return this;
}
;
_.toString_0 = function toString_10(){
  return $toString_0(this);
}
;
var Lcom_google_gwt_json_client_JSONObject_2_classLit = createForClass('com.google.gwt.json.client', 'JSONObject', 66);
function $clinit_JSONParser(){
  $clinit_JSONParser = emptyMethod;
  typeMap = {'boolean':createBoolean, 'number':createNumber, 'string':createString, 'object':createObject, 'function':createObject, 'undefined':createUndefined};
}

function createBoolean(v){
  return $clinit_JSONBoolean() , v?TRUE_1:FALSE_1;
}

function createNumber(v){
  return new JSONNumber(v);
}

function createObject(o){
  if (!o) {
    return $clinit_JSONNull() , instance_1;
  }
  var v = o.valueOf?o.valueOf():o;
  if (v !== o) {
    var func = typeMap[typeof v];
    return func?func(v):throwUnknownTypeException(typeof v);
  }
   else if (o instanceof Array || o instanceof $wnd.Array) {
    return new JSONArray_0(o);
  }
   else {
    return new JSONObject_0(o);
  }
}

function createString(v){
  return new JSONString(v);
}

function createUndefined(){
  return null;
}

function evaluate(json, strict){
  var v;
  if (strict) {
    try {
      v = JSON.parse(json);
    }
     catch (e) {
      return throwJSONException('Error parsing JSON: ' + e);
    }
  }
   else {
    json = escapeJsonForEval(json);
    try {
      v = eval('(' + json + ')');
    }
     catch (e) {
      return throwJSONException('Error parsing JSON: ' + e);
    }
  }
  var func = typeMap[typeof v];
  return func?func(v):throwUnknownTypeException(typeof v);
}

function parse_0(jsonString){
  $clinit_JSONParser();
  var ex;
  if (jsonString == null) {
    throw toJs(new NullPointerException);
  }
  if (jsonString.length == 0) {
    throw toJs(new IllegalArgumentException_0('empty argument'));
  }
  try {
    return evaluate(jsonString, false);
  }
   catch ($e0) {
    $e0 = toJava($e0);
    if (instanceOf($e0, 48)) {
      ex = $e0;
      throw toJs(new JSONException_0(ex));
    }
     else 
      throw toJs($e0);
  }
}

function throwJSONException(message){
  throw toJs(new JSONException(message));
}

function throwUnknownTypeException(typeString){
  $clinit_JSONParser();
  throw toJs(new JSONException("Unexpected typeof result '" + typeString + "'; please report this bug to the GWT team"));
}

var typeMap;
function JSONString(value_0){
  if (value_0 == null) {
    throw toJs(new NullPointerException);
  }
  this.value_0 = value_0;
}

function unwrap_4(value_0){
  return value_0.value_0;
}

defineClass(54, 521, {54:1}, JSONString);
_.equals_0 = function equals_4(other){
  if (!instanceOf(other, 54)) {
    return false;
  }
  return $equals_1(this.value_0, castTo(other, 54).value_0);
}
;
_.getUnwrapper = function getUnwrapper_4(){
  return unwrap_4;
}
;
_.hashCode_0 = function hashCode_6(){
  return $hashCode_1(this.value_0);
}
;
_.isString = function isString_0(){
  return this;
}
;
_.toString_0 = function toString_11(){
  return escapeValue(this.value_0);
}
;
var Lcom_google_gwt_json_client_JSONString_2_classLit = createForClass('com.google.gwt.json.client', 'JSONString', 54);
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
  a0 = value_0 & $intern_12;
  a1 = value_0 >> 22 & $intern_12;
  a2 = value_0 < 0?$intern_13:0;
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
    computeRemainder && (remainder = create0(0, 0, 0));
    return create0(0, 0, 0);
  }
  if (b.h == $intern_14 && b.m == 0 && b.l == 0) {
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
  if (a.h == $intern_14 && a.m == 0 && a.l == 0) {
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
      computeRemainder && (remainder = create0(0, 0, 0));
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
    computeRemainder && (aIsNegative?(remainder = neg(a)):(remainder = create0(a.l, a.m, a.h)));
    return create0(0, 0, 0);
  }
  return divModHelper(aIsCopy?a:create0(a.l, a.m, a.h), b, negative, aIsNegative, aIsMinValue, computeRemainder);
}

function divModByMinValue(a, computeRemainder){
  if (a.h == $intern_14 && a.m == 0 && a.l == 0) {
    computeRemainder && (remainder = create0(0, 0, 0));
    return create_0(($clinit_BigLongLib$Const() , ONE));
  }
  computeRemainder && (remainder = create0(a.l, a.m, a.h));
  return create0(0, 0, 0);
}

function divModByShift(a, bpower, negative, aIsNegative, computeRemainder){
  var c;
  c = shr(a, bpower);
  negative && negate(c);
  if (computeRemainder) {
    a = maskRight(a, bpower);
    aIsNegative?(remainder = neg(a)):(remainder = create0(a.l, a.m, a.h));
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
      remainder = neg(a);
      aIsMinValue && (remainder = sub_0(remainder, ($clinit_BigLongLib$Const() , ONE)));
    }
     else {
      remainder = create0(a.l, a.m, a.h);
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
  neg0 = ~a.l + 1 & $intern_12;
  neg1 = ~a.m + (neg0 == 0?1:0) & $intern_12;
  neg2 = ~a.h + (neg0 == 0 && neg1 == 0?1:0) & $intern_13;
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
  return a.l + a.m * $intern_15 + a.h * $intern_16;
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
  a.l = sum0 & $intern_12;
  a.m = sum1 & $intern_12;
  a.h = sum2 & $intern_13;
  return true;
}

var remainder;
function add_1(a, b){
  var sum0, sum1, sum2;
  sum0 = a.l + b.l;
  sum1 = a.m + b.m + (sum0 >> 22);
  sum2 = a.h + b.h + (sum1 >> 22);
  return create0(sum0 & $intern_12, sum1 & $intern_12, sum2 & $intern_13);
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
  if (value_0 >= $intern_16) {
    a2 = round_int(value_0 / $intern_16);
    value_0 -= a2 * $intern_16;
  }
  a1 = 0;
  if (value_0 >= $intern_15) {
    a1 = round_int(value_0 / $intern_15);
    value_0 -= a1 * $intern_15;
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
  c00 = p0 & $intern_12;
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
  c0 &= $intern_12;
  c2 += c1 >> 22;
  c1 &= $intern_12;
  c2 &= $intern_13;
  return create0(c0, c1, c2);
}

function neg(a){
  var neg0, neg1, neg2;
  neg0 = ~a.l + 1 & $intern_12;
  neg1 = ~a.m + (neg0 == 0?1:0) & $intern_12;
  neg2 = ~a.h + (neg0 == 0 && neg1 == 0?1:0) & $intern_13;
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
  return create0(res0 & $intern_12, res1 & $intern_12, res2 & $intern_13);
}

function shr(a, n){
  var a2, negative, res0, res1, res2;
  n &= 63;
  a2 = a.h;
  negative = (a2 & $intern_14) != 0;
  negative && (a2 |= -1048576);
  if (n < 22) {
    res2 = a2 >> n;
    res1 = a.m >> n | a2 << 22 - n;
    res0 = a.l >> n | a.m << 22 - n;
  }
   else if (n < 44) {
    res2 = negative?$intern_13:0;
    res1 = a2 >> n - 22;
    res0 = a.m >> n - 22 | a2 << 44 - n;
  }
   else {
    res2 = negative?$intern_13:0;
    res1 = negative?$intern_12:0;
    res0 = a2 >> n - 44;
  }
  return create0(res0 & $intern_12, res1 & $intern_12, res2 & $intern_13);
}

function shru(a, n){
  var a2, res0, res1, res2;
  n &= 63;
  a2 = a.h & $intern_13;
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
  return create0(res0 & $intern_12, res1 & $intern_12, res2 & $intern_13);
}

function sub_0(a, b){
  var sum0, sum1, sum2;
  sum0 = a.l - b.l;
  sum1 = a.m - b.m + (sum0 >> 22);
  sum2 = a.h - b.h + (sum1 >> 22);
  return create0(sum0 & $intern_12, sum1 & $intern_12, sum2 & $intern_13);
}

function toDouble(a){
  if (compare(a, ($clinit_BigLongLib$Const() , ZERO)) < 0) {
    return -toDoubleHelper(neg(a));
  }
  return a.l + a.m * $intern_15 + a.h * $intern_16;
}

function toInt(a){
  return a.l | a.m << 22;
}

function toString_12(a){
  var digits, rem, res, tenPowerLong, zeroesNeeded;
  if (a.l == 0 && a.m == 0 && a.h == 0) {
    return '0';
  }
  if (a.h == $intern_14 && a.m == 0 && a.l == 0) {
    return '-9223372036854775808';
  }
  if (a.h >> 19 != 0) {
    return '-' + toString_12(neg(a));
  }
  rem = a;
  res = '';
  while (!(rem.l == 0 && rem.m == 0 && rem.h == 0)) {
    tenPowerLong = create(1000000000);
    rem = divMod(rem, tenPowerLong, true);
    digits = '' + toInt(remainder);
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
  MAX_VALUE = create0($intern_12, $intern_12, 524287);
  MIN_VALUE = create0(0, 0, $intern_14);
  ONE = create(1);
  create(2);
  ZERO = create(0);
}

var MAX_VALUE, MIN_VALUE, ONE, ZERO;
function toJava(e){
  var javaException;
  if (instanceOf(e, 8)) {
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

function add_2(a, b){
  var result;
  if (isSmallLong0(a) && isSmallLong0(b)) {
    result = a + b;
    if ($intern_17 < result && result < $intern_16) {
      return result;
    }
  }
  return createLongEmul(add_1(isSmallLong0(a)?toBigLong(a):a, isSmallLong0(b)?toBigLong(b):b));
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
    return big_0.l + big_0.m * $intern_15;
  }
  if (a2 == $intern_13) {
    return big_0.l + big_0.m * $intern_15 - $intern_16;
  }
  return big_0;
}

function div_0(a, b){
  var result;
  if (isSmallLong0(a) && isSmallLong0(b)) {
    result = a / b;
    if ($intern_17 < result && result < $intern_16) {
      return result < 0?$wnd.Math.ceil(result):$wnd.Math.floor(result);
    }
  }
  return createLongEmul(divMod(isSmallLong0(a)?toBigLong(a):a, isSmallLong0(b)?toBigLong(b):b, false));
}

function eq(a, b){
  return compare_0(a, b) == 0;
}

function fromDouble_0(value_0){
  if ($intern_17 < value_0 && value_0 < $intern_16) {
    return value_0 < 0?$wnd.Math.ceil(value_0):$wnd.Math.floor(value_0);
  }
  return createLongEmul(fromDouble(value_0));
}

function isSmallLong0(value_0){
  return typeof value_0 === 'number';
}

function mod(a, b){
  var result;
  if (isSmallLong0(a) && isSmallLong0(b)) {
    result = a % b;
    if ($intern_17 < result && result < $intern_16) {
      return result;
    }
  }
  return createLongEmul((divMod(isSmallLong0(a)?toBigLong(a):a, isSmallLong0(b)?toBigLong(b):b, true) , remainder));
}

function mul_0(a, b){
  var result;
  if (isSmallLong0(a) && isSmallLong0(b)) {
    result = a * b;
    if ($intern_17 < result && result < $intern_16) {
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

function shru_0(a, n){
  return createLongEmul(shru(isSmallLong0(a)?toBigLong(a):a, n));
}

function sub_1(a, b){
  var result;
  if (isSmallLong0(a) && isSmallLong0(b)) {
    result = a - b;
    if ($intern_17 < result && result < $intern_16) {
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
    value_0 += $intern_16;
    a3 = $intern_13;
  }
  a1 = round_int(value_0 / $intern_15);
  a0 = round_int(value_0 - a1 * $intern_15);
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

function toString_13(a){
  if (isSmallLong0(a)) {
    return '' + a;
  }
  return toString_12(a);
}

function xor_0(a, b){
  return createLongEmul(xor(isSmallLong0(a)?toBigLong(a):a, isSmallLong0(b)?toBigLong(b):b));
}

function init(){
  $wnd.setTimeout($entry(assertCompileTimeUserAgent));
  $onModuleLoad();
  $wnd.$GWT_DND_VERSION = '3.3.4';
  $clinit_StyleInjector();
  toInjectAtStart.unshift('HTML{margin:0 !important;border:none !important;}.dragdrop-handle{cursor:move;user-select:none;-khtml-user-select:none;-moz-user-select:none;}.dragdrop-draggable{zoom:1;}.dragdrop-dragging{zoom:normal;}.dragdrop-positioner{border:1px dashed #1e90ff;margin:0 !important;zoom:1;z-index:100;}.dragdrop-flow-panel-positioner{color:#1e90ff;display:inline;text-align:center;vertical-align:middle;}.dragdrop-proxy{background-color:#7af;}.dragdrop-selected,.dragdrop-dragging,.dragdrop-proxy{opacity:0.3;}.dragdrop-movable-panel{z-index:200;margin:0 !important;border:none !important;}');
  schedule();
  $onModuleLoad_0(new WidgetModule);
  $onModuleLoad_1(new FileChooserEntryPoint);
}

function $replace(this$static, input_0, replacement){
  return input_0.replace(this$static, replacement);
}

function $test(this$static, input_0){
  return this$static.test(input_0);
}

function compile(pattern){
  return new RegExp(pattern);
}

function ImageResourcePrototype(url_0){
  this.left_0 = 0;
  this.top_0 = 0;
  this.height_0 = 16;
  this.width_0 = 16;
  this.url_0 = url_0;
}

defineClass(132, 1, {}, ImageResourcePrototype);
_.height_0 = 0;
_.left_0 = 0;
_.top_0 = 0;
_.width_0 = 0;
var Lcom_google_gwt_resources_client_impl_ImageResourcePrototype_2_classLit = createForClass('com.google.gwt.resources.client.impl', 'ImageResourcePrototype', 132);
function $append(this$static, styles){
  $append_2(this$static.sb, styles.css);
  return this$static;
}

function SafeStylesBuilder(){
  this.sb = new StringBuilder;
}

defineClass(474, 1, {}, SafeStylesBuilder);
var Lcom_google_gwt_safecss_shared_SafeStylesBuilder_2_classLit = createForClass('com.google.gwt.safecss.shared', 'SafeStylesBuilder', 474);
function SafeStylesString(css){
  verifySafeStylesConstraints(css);
  this.css = css;
}

defineClass(75, 1, {537:1, 75:1, 3:1}, SafeStylesString);
_.equals_0 = function equals_5(obj){
  if (!instanceOf(obj, 75)) {
    return false;
  }
  return $equals_1(this.css, castTo(obj, 537).css);
}
;
_.hashCode_0 = function hashCode_7(){
  return $hashCode_1(this.css);
}
;
var Lcom_google_gwt_safecss_shared_SafeStylesString_2_classLit = createForClass('com.google.gwt.safecss.shared', 'SafeStylesString', 75);
function verifySafeStylesConstraints(styles){
  if (styles == null) {
    throw toJs(new NullPointerException_0('css is null'));
  }
}

function OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(html){
  if (html == null) {
    throw toJs(new NullPointerException_0('html is null'));
  }
  this.html = html;
}

defineClass(480, 1, $intern_18, OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml);
_.asString = function asString(){
  return this.html;
}
;
_.equals_0 = function equals_6(obj){
  if (!instanceOf(obj, 112)) {
    return false;
  }
  return $equals_1(this.html, castTo(obj, 112).asString());
}
;
_.hashCode_0 = function hashCode_8(){
  return $hashCode_1(this.html);
}
;
var Lcom_google_gwt_safehtml_shared_OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml_2_classLit = createForClass('com.google.gwt.safehtml.shared', 'OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml', 480);
function SafeHtmlString(){
  this.html = '';
}

defineClass(320, 1, $intern_18, SafeHtmlString);
_.asString = function asString_0(){
  return this.html;
}
;
_.equals_0 = function equals_7(obj){
  if (!instanceOf(obj, 112)) {
    return false;
  }
  return $equals_1(this.html, castTo(obj, 112).asString());
}
;
_.hashCode_0 = function hashCode_9(){
  return $hashCode_1(this.html);
}
;
_.toString_0 = function toString_15(){
  return 'safe: "' + this.html + '"';
}
;
var Lcom_google_gwt_safehtml_shared_SafeHtmlString_2_classLit = createForClass('com.google.gwt.safehtml.shared', 'SafeHtmlString', 320);
function $clinit_SafeHtmlUtils(){
  $clinit_SafeHtmlUtils = emptyMethod;
  new SafeHtmlString;
  HTML_CHARS_RE = new RegExp('[&<>\'"]');
  AMP_RE = new RegExp('&', 'g');
  GT_RE = new RegExp('>', 'g');
  LT_RE = new RegExp('<', 'g');
  SQUOT_RE = new RegExp("'", 'g');
  QUOT_RE = new RegExp('"', 'g');
}

function htmlEscape(s){
  $clinit_SafeHtmlUtils();
  if (!$test(HTML_CHARS_RE, s)) {
    return s;
  }
  s.indexOf('&') != -1 && (s = $replace(AMP_RE, s, '&amp;'));
  s.indexOf('<') != -1 && (s = $replace(LT_RE, s, '&lt;'));
  s.indexOf('>') != -1 && (s = $replace(GT_RE, s, '&gt;'));
  s.indexOf('"') != -1 && (s = $replace(QUOT_RE, s, '&quot;'));
  s.indexOf("'") != -1 && (s = $replace(SQUOT_RE, s, '&#39;'));
  return s;
}

var AMP_RE, GT_RE, HTML_CHARS_RE, LT_RE, QUOT_RE, SQUOT_RE;
function SafeUriString(uri_0){
  if (uri_0 == null) {
    throw toJs(new NullPointerException_0('uri is null'));
  }
  this.uri_0 = uri_0;
}

defineClass(68, 1, {530:1, 68:1}, SafeUriString);
_.equals_0 = function equals_8(obj){
  if (!instanceOf(obj, 68)) {
    return false;
  }
  return $equals_1(this.uri_0, castTo(obj, 530).uri_0);
}
;
_.hashCode_0 = function hashCode_10(){
  return $hashCode_1(this.uri_0);
}
;
_.toString_0 = function toString_16(){
  return 'safe: "' + this.uri_0 + '"';
}
;
var Lcom_google_gwt_safehtml_shared_SafeUriString_2_classLit = createForClass('com.google.gwt.safehtml.shared', 'SafeUriString', 68);
function $clinit_UriUtils(){
  $clinit_UriUtils = emptyMethod;
  new RegExp('%5B', 'g');
  new RegExp('%5D', 'g');
}

defineClass(523, 1, {});
var Lcom_google_gwt_text_shared_AbstractRenderer_2_classLit = createForClass('com.google.gwt.text.shared', 'AbstractRenderer', 523);
function PassthroughParser(){
}

defineClass(436, 1, {}, PassthroughParser);
var INSTANCE_0;
var Lcom_google_gwt_text_shared_testing_PassthroughParser_2_classLit = createForClass('com.google.gwt.text.shared.testing', 'PassthroughParser', 436);
function PassthroughRenderer(){
}

defineClass(435, 523, {}, PassthroughRenderer);
var INSTANCE_1;
var Lcom_google_gwt_text_shared_testing_PassthroughRenderer_2_classLit = createForClass('com.google.gwt.text.shared.testing', 'PassthroughRenderer', 435);
function $calcNewVelocity(initialVelocity, decelFactor, oldVelocity, minDecel){
  var maxVelocityX, minVelocityX, newVelocity;
  newVelocity = initialVelocity * decelFactor;
  if (oldVelocity >= 0) {
    maxVelocityX = $wnd.Math.max(0, oldVelocity - minDecel);
    newVelocity = $wnd.Math.min(newVelocity, maxVelocityX);
  }
   else {
    minVelocityX = $wnd.Math.min(0, oldVelocity + minDecel);
    newVelocity = $wnd.Math.max(newVelocity, minVelocityX);
  }
  return newVelocity;
}

function $updateState(state){
  var decelFactor, dist, elapsedMillis, ellapsedMillis, initialVelocity, minDecel, newVelocity, newVelocityX, newVelocityY, oldVelocity, position, totalEllapsedMillis;
  ellapsedMillis = state.elapsedMillis;
  totalEllapsedMillis = state.cumulativeElapsedMillis;
  initialVelocity = state.initialVelocity;
  oldVelocity = state.velocity;
  decelFactor = $wnd.Math.pow(0.9993, totalEllapsedMillis);
  minDecel = ellapsedMillis * 5.0E-4;
  newVelocityX = $calcNewVelocity(initialVelocity.x_0, decelFactor, oldVelocity.x_0, minDecel);
  newVelocityY = $calcNewVelocity(initialVelocity.y_0, decelFactor, oldVelocity.y_0, minDecel);
  newVelocity = new Point(newVelocityX, newVelocityY);
  state.velocity = newVelocity;
  elapsedMillis = state.elapsedMillis;
  dist = $mult(newVelocity, new Point(elapsedMillis, elapsedMillis));
  position = state.position_0;
  $setPosition(state, new Point(position.x_0 + dist.x_0, position.y_0 + dist.y_0));
  if ($wnd.Math.abs(newVelocity.x_0) < 0.02 && $wnd.Math.abs(newVelocity.y_0) < 0.02) {
    return false;
  }
  return true;
}

function DefaultMomentum(){
}

defineClass(475, 1, {}, DefaultMomentum);
var Lcom_google_gwt_touch_client_DefaultMomentum_2_classLit = createForClass('com.google.gwt.touch.client', 'DefaultMomentum', 475);
function $setCumulativeElapsedMillis(this$static, cumulativeElapsedMillis){
  this$static.cumulativeElapsedMillis = cumulativeElapsedMillis;
}

function $setElapsedMillis(this$static, elapsedMillis){
  this$static.elapsedMillis = elapsedMillis;
}

function $setPosition(this$static, position){
  this$static.position_0 = position;
}

function Momentum$State(initialPosition, initialVelocity){
  this.initialVelocity = initialVelocity;
  this.position_0 = new Point_0(initialPosition);
  this.velocity = new Point_0(initialVelocity);
}

defineClass(476, 1, {}, Momentum$State);
_.cumulativeElapsedMillis = 0;
_.elapsedMillis = 0;
var Lcom_google_gwt_touch_client_Momentum$State_2_classLit = createForClass('com.google.gwt.touch.client', 'Momentum/State', 476);
function $minus(this$static, c){
  return new Point(this$static.x_0 - c.x_0, this$static.y_0 - c.y_0);
}

function $mult(this$static, c){
  return new Point(this$static.x_0 * c.x_0, this$static.y_0 * c.y_0);
}

function $plus(this$static, c){
  return new Point(this$static.x_0 + c.x_0, this$static.y_0 + c.y_0);
}

function Point(x_0, y_0){
  this.x_0 = x_0;
  this.y_0 = y_0;
}

function Point_0(c){
  Point.call(this, c.x_0, c.y_0);
}

defineClass(25, 1, {25:1}, Point, Point_0);
_.equals_0 = function equals_9(obj){
  var c;
  if (!instanceOf(obj, 25)) {
    return false;
  }
  c = castTo(obj, 25);
  return this.x_0 == c.x_0 && this.y_0 == c.y_0;
}
;
_.hashCode_0 = function hashCode_11(){
  return round_int(this.x_0) ^ round_int(this.y_0);
}
;
_.toString_0 = function toString_17(){
  return 'Point(' + this.x_0 + ',' + this.y_0 + ')';
}
;
_.x_0 = 0;
_.y_0 = 0;
var Lcom_google_gwt_touch_client_Point_2_classLit = createForClass('com.google.gwt.touch.client', 'Point', 25);
function $calculateEndVelocity(from, to){
  var dist, time;
  time = to.time - from.time;
  if (time <= 0) {
    return null;
  }
  dist = $minus(from.point, to.point);
  return new Point(dist.x_0 / time, dist.y_0 / time);
}

function $cancelAll(this$static){
  this$static.touching = false;
  this$static.dragging = false;
  this$static.momentumCommand = null;
}

function $getWidgetScrollPosition(this$static){
  return new Point($getHorizontalScrollPosition(this$static.widget), $getVerticalScrollPosition(this$static.widget));
}

function $hitTest(point1, point2){
  var absDiffX, absDiffY, diff;
  diff = new Point(point1.x_0 - point2.x_0, point1.y_0 - point2.y_0);
  absDiffX = $wnd.Math.abs(diff.x_0);
  absDiffY = $wnd.Math.abs(diff.y_0);
  return absDiffX <= 25 && absDiffY <= 25;
}

function $isClickScrollTriggeringTouch(this$static, clickPoint){
  if (this$static.recentScrollTriggeringTouchPosition.point) {
    return $hitTest(clickPoint, this$static.recentScrollTriggeringTouchPosition.point);
  }
  return false;
}

function $isClickTouchPositionDuringMomentum(this$static, clickPoint){
  var currentTime, point, point$iterator, same;
  currentTime = Date.now();
  same = false;
  for (point$iterator = new ArrayList$1(this$static.touchPositionsDuringMomentum); point$iterator.i < point$iterator.this$01.array.length;) {
    point = castTo($next_4(point$iterator), 69);
    if (currentTime - point.time <= 2500 && $hitTest(clickPoint, point.point)) {
      same = true;
      break;
    }
  }
  return same;
}

function $onDragEnd(this$static){
  var endVelocity;
  if (!this$static.momentum) {
    return;
  }
  endVelocity = $calculateEndVelocity(this$static.recentTouchPosition, this$static.lastTouchPosition);
  if (endVelocity) {
    this$static.momentumCommand = new TouchScroller$MomentumCommand(this$static, endVelocity);
    scheduleFixedDelayImpl(($clinit_SchedulerImpl() , this$static.momentumCommand), 16);
  }
}

function $onTouchEnd(this$static){
  if (!this$static.touching) {
    return;
  }
  this$static.touching = false;
  if (this$static.dragging) {
    this$static.dragging = false;
    $onDragEnd(this$static);
  }
}

function $onTouchMove(this$static, event_0){
  var absDiffX, absDiffY, diff, hMax, hMin, hPosition, touch, touchPoint, touchTime, touches, trackingTime, vMax, vPosition, diff_0, curScrollPosition;
  if (!this$static.touching) {
    return;
  }
  touch = (touches = event_0.nativeEvent.touches , touches.length > 0?touches[0]:null);
  touchPoint = new Point((touch.pageX || 0) | 0, (touch.pageY || 0) | 0);
  touchTime = Date.now();
  $setTemporalPoint(this$static.lastTouchPosition, touchPoint, touchTime);
  if (!this$static.dragging) {
    diff = $minus(touchPoint, this$static.startTouchPosition);
    absDiffX = $wnd.Math.abs(diff.x_0);
    absDiffY = $wnd.Math.abs(diff.y_0);
    if (absDiffX > 5 || absDiffY > 5) {
      $setTemporalPoint(this$static.recentScrollTriggeringTouchPosition, this$static.recentTouchPosition.point, this$static.recentTouchPosition.time);
      if (absDiffX > absDiffY) {
        hPosition = $getHorizontalScrollPosition(this$static.widget);
        hMin = $getMinimumHorizontalScrollPosition_0(this$static.widget);
        hMax = $getMaximumHorizontalScrollPosition_0(this$static.widget);
        if (diff.x_0 < 0 && hMax <= hPosition) {
          $cancelAll(this$static);
          return;
        }
         else if (diff.x_0 > 0 && hMin >= hPosition) {
          $cancelAll(this$static);
          return;
        }
      }
       else {
        vPosition = $getVerticalScrollPosition(this$static.widget);
        vMax = $getMaximumVerticalScrollPosition(this$static.widget);
        if (diff.y_0 < 0 && vMax <= vPosition) {
          $cancelAll(this$static);
          return;
        }
         else if (diff.y_0 > 0 && 0 >= vPosition) {
          $cancelAll(this$static);
          return;
        }
      }
      this$static.dragging = true;
    }
  }
  !!event_0.nativeEvent && (event_0.nativeEvent.preventDefault() , undefined);
  if (this$static.dragging) {
    diff_0 = $minus(this$static.startTouchPosition, this$static.lastTouchPosition.point);
    curScrollPosition = $plus(this$static.startScrollPosition, diff_0);
    $setHorizontalScrollPosition(this$static.widget, round_int(curScrollPosition.x_0));
    $setVerticalScrollPosition(this$static.widget, round_int(curScrollPosition.y_0));
    trackingTime = touchTime - this$static.recentTouchPosition.time;
    if (trackingTime > 200 && !!this$static.recentTouchPositionOnDeck) {
      $setTemporalPoint(this$static.recentTouchPosition, this$static.recentTouchPositionOnDeck.point, this$static.recentTouchPositionOnDeck.time);
      this$static.recentTouchPositionOnDeck = null;
    }
     else 
      trackingTime > 100 && !this$static.recentTouchPositionOnDeck && (this$static.recentTouchPositionOnDeck = new TouchScroller$TemporalPoint_0(touchPoint, touchTime));
  }
}

function $onTouchStart(this$static, event_0){
  var startTouchTime, touch, touches;
  $setTemporalPoint(this$static.recentScrollTriggeringTouchPosition, null, 0);
  if (this$static.touching) {
    return;
  }
  touch = (touches = event_0.nativeEvent.touches , touches.length > 0?touches[0]:null);
  this$static.startTouchPosition = new Point((touch.pageX || 0) | 0, (touch.pageY || 0) | 0);
  startTouchTime = Date.now();
  $setTemporalPoint(this$static.recentTouchPosition, this$static.startTouchPosition, startTouchTime);
  $setTemporalPoint(this$static.lastTouchPosition, this$static.startTouchPosition, startTouchTime);
  this$static.recentTouchPositionOnDeck = null;
  if (this$static.momentumCommand) {
    $add_6(this$static.touchPositionsDuringMomentum, new TouchScroller$TemporalPoint_0(this$static.startTouchPosition, startTouchTime));
    scheduleFixedDelayImpl(($clinit_SchedulerImpl() , this$static.momentumTouchRemovalCommand), 2500);
  }
  this$static.startScrollPosition = new Point($getHorizontalScrollPosition(this$static.widget), $getVerticalScrollPosition(this$static.widget));
  $cancelAll(this$static);
  this$static.touching = true;
}

function $removeAttachHandler(this$static){
  if (this$static.attachHandlerReg) {
    $removeHandler(this$static.attachHandlerReg.real);
    this$static.attachHandlerReg = null;
  }
}

function $removeBustClickHandler(this$static){
  if (this$static.bustClickHandlerReg) {
    $removeHandler(this$static.bustClickHandlerReg.real);
    this$static.bustClickHandlerReg = null;
  }
}

function $setMomentum(this$static, momentum){
  this$static.momentum = momentum;
}

function $setTargetWidget(this$static, widget){
  var reg, reg$iterator;
  if (this$static.widget == widget) {
    return;
  }
  $cancelAll(this$static);
  for (reg$iterator = new ArrayList$1(this$static.handlerRegs); reg$iterator.i < reg$iterator.this$01.array.length;) {
    reg = castTo($next_4(reg$iterator), 529);
    $removeHandler(reg.real);
  }
  this$static.handlerRegs.array.length = 0;
  $removeAttachHandler(this$static);
  $removeBustClickHandler(this$static);
  this$static.widget = widget;
  widget.attached && ($removeBustClickHandler(this$static) , this$static.bustClickHandlerReg = addNativePreviewHandler(new TouchScroller$6(this$static)));
  this$static.attachHandlerReg = $addHandler_0(widget, new TouchScroller$1(this$static), (!TYPE_12 && (TYPE_12 = new GwtEvent$Type) , TYPE_12));
  $add_6(this$static.handlerRegs, $addDomHandler(widget, new TouchScroller$2(this$static), ($clinit_TouchStartEvent() , $clinit_TouchStartEvent() , TYPE_11)));
  $add_6(this$static.handlerRegs, $addDomHandler(widget, new TouchScroller$3(this$static), ($clinit_TouchMoveEvent() , $clinit_TouchMoveEvent() , TYPE_10)));
  $add_6(this$static.handlerRegs, $addDomHandler(widget, new TouchScroller$4(this$static), ($clinit_TouchEndEvent() , $clinit_TouchEndEvent() , TYPE_9)));
  $add_6(this$static.handlerRegs, $addDomHandler(widget, new TouchScroller$5(this$static), ($clinit_TouchCancelEvent() , $clinit_TouchCancelEvent() , TYPE_8)));
}

function $setWidgetScrollPosition(this$static, position){
  $setHorizontalScrollPosition(this$static.widget, round_int(position.x_0));
  $setVerticalScrollPosition(this$static.widget, round_int(position.y_0));
}

function $setupBustClickHandler(this$static){
  $removeBustClickHandler(this$static);
  this$static.bustClickHandlerReg = addNativePreviewHandler(new TouchScroller$6(this$static));
}

function TouchScroller(){
  this.handlerRegs = new ArrayList;
  this.lastTouchPosition = new TouchScroller$TemporalPoint;
  this.recentTouchPosition = new TouchScroller$TemporalPoint;
  this.recentScrollTriggeringTouchPosition = new TouchScroller$TemporalPoint;
  this.touchPositionsDuringMomentum = new ArrayList;
  this.momentumTouchRemovalCommand = new TouchScroller$MomentumTouchRemovalCommand(this);
  $setMomentum(this, new DefaultMomentum);
}

defineClass(441, 1, {}, TouchScroller);
_.dragging = false;
_.touching = false;
var isSupported;
var Lcom_google_gwt_touch_client_TouchScroller_2_classLit = createForClass('com.google.gwt.touch.client', 'TouchScroller', 441);
function TouchScroller$1(this$0){
  this.this$01 = this$0;
}

defineClass(445, 1, {531:1, 21:1}, TouchScroller$1);
var Lcom_google_gwt_touch_client_TouchScroller$1_2_classLit = createForClass('com.google.gwt.touch.client', 'TouchScroller/1', 445);
function TouchScroller$2(this$0){
  this.this$01 = this$0;
}

defineClass(446, 1, {533:1, 21:1}, TouchScroller$2);
var Lcom_google_gwt_touch_client_TouchScroller$2_2_classLit = createForClass('com.google.gwt.touch.client', 'TouchScroller/2', 446);
function TouchScroller$3(this$0){
  this.this$01 = this$0;
}

defineClass(447, 1, {534:1, 21:1}, TouchScroller$3);
var Lcom_google_gwt_touch_client_TouchScroller$3_2_classLit = createForClass('com.google.gwt.touch.client', 'TouchScroller/3', 447);
function TouchScroller$4(this$0){
  this.this$01 = this$0;
}

defineClass(448, 1, {535:1, 21:1}, TouchScroller$4);
var Lcom_google_gwt_touch_client_TouchScroller$4_2_classLit = createForClass('com.google.gwt.touch.client', 'TouchScroller/4', 448);
function TouchScroller$5(this$0){
  this.this$01 = this$0;
}

defineClass(449, 1, {536:1, 21:1}, TouchScroller$5);
var Lcom_google_gwt_touch_client_TouchScroller$5_2_classLit = createForClass('com.google.gwt.touch.client', 'TouchScroller/5', 449);
function TouchScroller$6(this$0){
  this.this$01 = this$0;
}

defineClass(165, 1, $intern_19, TouchScroller$6);
_.onPreviewNativeEvent = function onPreviewNativeEvent(event_0){
  var clickPoint;
  if (1 == $getTypeInt(event_0.nativeEvent)) {
    clickPoint = new Point((event_0.nativeEvent.clientX || 0) | 0, (event_0.nativeEvent.clientY || 0) | 0);
    if ($isClickScrollTriggeringTouch(this.this$01, clickPoint) || $isClickTouchPositionDuringMomentum(this.this$01, clickPoint)) {
      event_0.isCanceled = true;
      event_0.nativeEvent.stopPropagation();
      event_0.nativeEvent.preventDefault();
    }
  }
}
;
var Lcom_google_gwt_touch_client_TouchScroller$6_2_classLit = createForClass('com.google.gwt.touch.client', 'TouchScroller/6', 165);
function $finish(this$static){
  if (this$static.windowResizeHandler) {
    $removeHandler(this$static.windowResizeHandler.real);
    this$static.windowResizeHandler = null;
  }
  this$static == this$static.this$01.momentumCommand && (this$static.this$01.momentumCommand = null);
}

function TouchScroller$MomentumCommand(this$0, endVelocity){
  this.this$01 = this$0;
  this.duration = new Duration;
  this.initialPosition = $getWidgetScrollPosition(this.this$01);
  this.state = new Momentum$State(this.initialPosition, endVelocity);
  this.windowResizeHandler = addResizeHandler(new TouchScroller$MomentumCommand$1(this));
}

defineClass(442, 1, {}, TouchScroller$MomentumCommand);
_.execute_0 = function execute_4(){
  var cumulativeElapsedMillis, hMax, hMin, hPos, notDone, vMax, vPos;
  if (this != this.this$01.momentumCommand) {
    $finish(this);
    return false;
  }
  cumulativeElapsedMillis = $elapsedMillis(this.duration);
  $setElapsedMillis(this.state, cumulativeElapsedMillis - this.lastElapsedMillis);
  this.lastElapsedMillis = cumulativeElapsedMillis;
  $setCumulativeElapsedMillis(this.state, cumulativeElapsedMillis);
  notDone = $updateState(this.state);
  notDone || $finish(this);
  $setWidgetScrollPosition(this.this$01, this.state.position_0);
  hPos = round_int(this.state.position_0.x_0);
  hMin = $getMinimumHorizontalScrollPosition_0(this.this$01.widget);
  hMax = $getMaximumHorizontalScrollPosition_0(this.this$01.widget);
  vMax = $getMaximumVerticalScrollPosition(this.this$01.widget);
  vPos = round_int(this.state.position_0.y_0);
  if ((vMax <= vPos || 0 >= vPos) && (hMax <= hPos || hMin >= hPos)) {
    $finish(this);
    return false;
  }
  return notDone;
}
;
_.lastElapsedMillis = 0;
var Lcom_google_gwt_touch_client_TouchScroller$MomentumCommand_2_classLit = createForClass('com.google.gwt.touch.client', 'TouchScroller/MomentumCommand', 442);
function TouchScroller$MomentumCommand$1(this$1){
  this.this$11 = this$1;
}

defineClass(444, 1, $intern_20, TouchScroller$MomentumCommand$1);
_.onResize = function onResize(event_0){
  $finish(this.this$11);
}
;
var Lcom_google_gwt_touch_client_TouchScroller$MomentumCommand$1_2_classLit = createForClass('com.google.gwt.touch.client', 'TouchScroller/MomentumCommand/1', 444);
function TouchScroller$MomentumTouchRemovalCommand(this$0){
  this.this$01 = this$0;
}

defineClass(443, 1, {}, TouchScroller$MomentumTouchRemovalCommand);
_.execute_0 = function execute_5(){
  var currentTime, iter, point;
  currentTime = Date.now();
  iter = new ArrayList$1(this.this$01.touchPositionsDuringMomentum);
  while (iter.i < iter.this$01.array.length) {
    point = castTo($next_4(iter), 69);
    currentTime - point.time >= 2500 && $remove_13(iter);
  }
  return this.this$01.touchPositionsDuringMomentum.array.length != 0;
}
;
var Lcom_google_gwt_touch_client_TouchScroller$MomentumTouchRemovalCommand_2_classLit = createForClass('com.google.gwt.touch.client', 'TouchScroller/MomentumTouchRemovalCommand', 443);
function $setTemporalPoint(this$static, point, time){
  this$static.point = point;
  this$static.time = time;
}

function TouchScroller$TemporalPoint(){
}

function TouchScroller$TemporalPoint_0(point, time){
  this.point = point;
  this.time = time;
}

defineClass(69, 1, {69:1}, TouchScroller$TemporalPoint, TouchScroller$TemporalPoint_0);
_.time = 0;
var Lcom_google_gwt_touch_client_TouchScroller$TemporalPoint_2_classLit = createForClass('com.google.gwt.touch.client', 'TouchScroller/TemporalPoint', 69);
defineClass(402, 1, {21:1});
var Lcom_google_gwt_user_client_BaseListenerWrapper_2_classLit = createForClass('com.google.gwt.user.client', 'BaseListenerWrapper', 402);
function $clinit_DOM(){
  $clinit_DOM = emptyMethod;
  $clinit_DOMImplStandard();
}

function dispatchEvent_0(evt, elem){
  $clinit_DOM();
  var eventListener;
  eventListener = getEventListener(elem);
  if (!eventListener) {
    return false;
  }
  dispatchEvent_1(evt, elem, eventListener);
  return true;
}

function dispatchEvent_1(evt, elem, listener){
  $clinit_DOM();
  var prevCurrentEvent;
  prevCurrentEvent = currentEvent;
  currentEvent = evt;
  elem == sCaptureElem && $eventGetTypeInt(evt.type) == 8192 && (sCaptureElem = null);
  listener.onBrowserEvent(evt);
  currentEvent = prevCurrentEvent;
}

function insertChild(parent_0, child, index_0){
  $clinit_DOM();
  $insertChild(parent_0, resolve(child), index_0);
}

function previewEvent(evt){
  $clinit_DOM();
  var ret;
  ret = fire_4(handlers_0, evt);
  if (!ret && !!evt) {
    evt.stopPropagation();
    evt.preventDefault();
  }
  return ret;
}

function releaseCapture(elem){
  $clinit_DOM();
  !!sCaptureElem && elem == sCaptureElem && (sCaptureElem = null);
  $maybeInitializeEventSystem();
  ($clinit_DOMImplStandard() , captureElem) == elem && (captureElem = null);
}

function resolve(maybePotential){
  $clinit_DOM();
  return maybePotential.__gwt_resolve?maybePotential.__gwt_resolve():maybePotential;
}

function setCapture(elem){
  $clinit_DOM();
  sCaptureElem = elem;
  $maybeInitializeEventSystem();
  $clinit_DOMImplStandard() , captureElem = elem;
}

function setIntStyleAttribute(elem, attr, value_0){
  $clinit_DOM();
  elem.style[attr] = '' + value_0;
}

function setStyleAttribute(elem, attr, value_0){
  $clinit_DOM();
  elem.style[attr] = value_0;
}

function sinkBitlessEvent(elem, eventTypeName){
  var dispatchMap, dispatcher;
  $clinit_DOM();
  $maybeInitializeEventSystem();
  dispatchMap = bitlessEventDispatchers;
  dispatcher = dispatchMap[eventTypeName] || dispatchMap['_default_'];
  elem.addEventListener(eventTypeName, dispatcher, false);
}

function sinkEvents(elem, eventBits){
  $clinit_DOM();
  $maybeInitializeEventSystem();
  $sinkEventsImpl(elem, eventBits);
}

var currentEvent = null, sCaptureElem;
function $onModuleLoad(){
  var allowedModes, currentMode, i;
  currentMode = $doc.compatMode;
  allowedModes = stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['CSS1Compat']);
  for (i = 0; i < allowedModes.length; i++) {
    if ($equals_1(allowedModes[i], currentMode)) {
      return;
    }
  }
  allowedModes.length == 1 && $equals_1('CSS1Compat', allowedModes[0]) && $equals_1('BackCompat', currentMode)?"GWT no longer supports Quirks Mode (document.compatMode=' BackCompat').<br>Make sure your application's host HTML page has a Standards Mode (document.compatMode=' CSS1Compat') doctype,<br>e.g. by using &lt;!doctype html&gt; at the start of your application's HTML page.<br><br>To continue using this unsupported rendering mode and risk layout problems, suppress this message by adding<br>the following line to your*.gwt.xml module file:<br>&nbsp;&nbsp;&lt;extend-configuration-property name=\"document.compatMode\" value=\"" + currentMode + '"/&gt;':"Your *.gwt.xml module configuration prohibits the use of the current document rendering mode (document.compatMode=' " + currentMode + "').<br>Modify your application's host HTML page doctype, or update your custom " + "'document.compatMode' configuration property settings.";
}

function $getTypeInt(this$static){
  return $clinit_DOM() , $eventGetTypeInt(this$static.type);
}

function addNativePreviewHandler(handler){
  $clinit_DOM();
  $maybeInitializeEventSystem();
  !TYPE_16 && (TYPE_16 = new GwtEvent$Type);
  if (!handlers_0) {
    handlers_0 = new HandlerManager_0(null, true);
    singleton = new Event$NativePreviewEvent;
  }
  return $addHandler(handlers_0, TYPE_16, handler);
}

function getTypeInt(typeName){
  return $eventGetTypeInt(($clinit_DOM() , typeName));
}

function sinkEvents_0(elem){
  $clinit_DOM();
  $maybeInitializeEventSystem();
  $sinkEventsImpl(elem, 32768);
}

var handlers_0;
function $revive(this$static){
  this$static.dead = false;
  this$static.source = null;
  this$static.isCanceled = false;
  this$static.isConsumed = false;
  this$static.isFirstHandler = true;
  this$static.nativeEvent = null;
}

function $setNativeEvent_0(this$static, nativeEvent){
  this$static.nativeEvent = nativeEvent;
}

function Event$NativePreviewEvent(){
}

function fire_4(handlers, nativeEvent){
  var lastIsCanceled, lastIsConsumed, lastIsFirstHandler, lastNativeEvent, ret;
  if (!!TYPE_16 && !!handlers && $isEventHandled(handlers, TYPE_16)) {
    lastIsCanceled = singleton.isCanceled;
    lastIsConsumed = singleton.isConsumed;
    lastIsFirstHandler = singleton.isFirstHandler;
    lastNativeEvent = singleton.nativeEvent;
    $revive(singleton);
    $setNativeEvent_0(singleton, nativeEvent);
    $fireEvent(handlers, singleton);
    ret = !(singleton.isCanceled && !singleton.isConsumed);
    singleton.isCanceled = lastIsCanceled;
    singleton.isConsumed = lastIsConsumed;
    singleton.isFirstHandler = lastIsFirstHandler;
    singleton.nativeEvent = lastNativeEvent;
    return ret;
  }
  return true;
}

defineClass(290, 504, {}, Event$NativePreviewEvent);
_.dispatch = function dispatch_16(handler){
  castTo(handler, 482).onPreviewNativeEvent(this);
  singleton.isFirstHandler = false;
}
;
_.getAssociatedType_0 = function getAssociatedType_50(){
  return TYPE_16;
}
;
_.getAssociatedType = function getAssociatedType_49(){
  return TYPE_16;
}
;
_.revive = function revive_0(){
  $revive(this);
}
;
_.isCanceled = false;
_.isConsumed = false;
_.isFirstHandler = false;
var TYPE_16, singleton;
var Lcom_google_gwt_user_client_Event$NativePreviewEvent_2_classLit = createForClass('com.google.gwt.user.client', 'Event/NativePreviewEvent', 290);
function $clinit_History(){
  $clinit_History = emptyMethod;
  new History$HistoryImpl;
  historyEventSource = new History$HistoryEventSource;
  token = getDecodedHash();
}

function addValueChangeHandler(handler){
  $clinit_History();
  return $addValueChangeHandler(historyEventSource, handler);
}

function getDecodedHash(){
  var hashToken;
  hashToken = $wnd.location.hash;
  if (hashToken == null || hashToken.length == 0) {
    return '';
  }
  return $decode((checkCriticalStringElementIndex(1, hashToken.length + 1) , hashToken.substr(1)));
}

function onHashChanged(){
  $clinit_History();
  var hashToken;
  hashToken = getDecodedHash();
  if (!$equals_1(hashToken, token)) {
    token = hashToken;
    fire_3(historyEventSource);
  }
}

var historyEventSource, token;
function $addValueChangeHandler(this$static, handler){
  return $addHandler(this$static.handlers, (!TYPE_15 && (TYPE_15 = new GwtEvent$Type) , TYPE_15), handler);
}

function History$HistoryEventSource(){
  this.handlers = new HandlerManager(null);
}

defineClass(469, 1, {10:1}, History$HistoryEventSource);
_.fireEvent = function fireEvent_0(event_0){
  $fireEvent(this.handlers, event_0);
}
;
var Lcom_google_gwt_user_client_History$HistoryEventSource_2_classLit = createForClass('com.google.gwt.user.client', 'History/HistoryEventSource', 469);
function History$HistoryImpl(){
  var handler;
  handler = $entry(onHashChanged);
  $wnd.addEventListener('hashchange', handler, false);
}

defineClass(470, 1, {}, History$HistoryImpl);
var Lcom_google_gwt_user_client_History$HistoryImpl_2_classLit = createForClass('com.google.gwt.user.client', 'History/HistoryImpl', 470);
function $decode(toDecode){
  return $wnd.decodeURI(toDecode.replace('%23', '#'));
}

function addCloseHandler(handler){
  maybeInitializeCloseHandlers();
  return addHandler(TYPE_13?TYPE_13:(TYPE_13 = new GwtEvent$Type), handler);
}

function addHandler(type_0, handler){
  return $addHandler((!handlers_1 && (handlers_1 = new Window$WindowHandlers) , handlers_1), type_0, handler);
}

function addResizeHandler(handler){
  maybeInitializeCloseHandlers();
  maybeInitializeResizeHandlers();
  return addHandler((!TYPE_14 && (TYPE_14 = new GwtEvent$Type) , TYPE_14), handler);
}

function alert_0(msg){
  $wnd.alert(msg);
}

function maybeInitializeCloseHandlers(){
  if (!closeHandlersInitialized) {
    $initWindowCloseHandler();
    closeHandlersInitialized = true;
  }
}

function maybeInitializeResizeHandlers(){
  if (!resizeHandlersInitialized) {
    $initWindowResizeHandler();
    resizeHandlersInitialized = true;
  }
}

function onClosing(){
  var event_0;
  if (closeHandlersInitialized) {
    event_0 = new Window$ClosingEvent;
    !!handlers_1 && $fireEvent(handlers_1, event_0);
    return null;
  }
  return null;
}

function onResize_0(){
  var height, width_0;
  if (resizeHandlersInitialized) {
    width_0 = $getClientWidth($doc);
    height = $getClientHeight($doc);
    if (lastResizeWidth != width_0 || lastResizeHeight != height) {
      lastResizeWidth = width_0;
      lastResizeHeight = height;
      fire_2((!handlers_1 && (handlers_1 = new Window$WindowHandlers) , handlers_1), width_0);
    }
  }
}

var closeHandlersInitialized = false, handlers_1, lastResizeHeight = 0, lastResizeWidth = 0, resizeHandlersInitialized = false;
function $clinit_Window$ClosingEvent(){
  $clinit_Window$ClosingEvent = emptyMethod;
  TYPE_17 = new GwtEvent$Type;
}

function Window$ClosingEvent(){
  $clinit_Window$ClosingEvent();
}

defineClass(192, 504, {}, Window$ClosingEvent);
_.dispatch = function dispatch_17(handler){
  throwClassCastExceptionUnlessNull(handler);
  null.$_nullMethod();
}
;
_.getAssociatedType_0 = function getAssociatedType_52(){
  return TYPE_17;
}
;
_.getAssociatedType = function getAssociatedType_51(){
  return TYPE_17;
}
;
var TYPE_17;
var Lcom_google_gwt_user_client_Window$ClosingEvent_2_classLit = createForClass('com.google.gwt.user.client', 'Window/ClosingEvent', 192);
function buildListParamMap(queryString){
  var entry, entry$iterator, key, kv, kvPair, kvPair$array, kvPair$index, kvPair$max, out, qs, val, values, regexp;
  out = new HashMap;
  if (queryString != null && queryString.length > 1) {
    qs = (checkCriticalStringElementIndex(1, queryString.length + 1) , queryString.substr(1));
    for (kvPair$array = $split(qs, '&', 0) , kvPair$index = 0 , kvPair$max = kvPair$array.length; kvPair$index < kvPair$max; ++kvPair$index) {
      kvPair = kvPair$array[kvPair$index];
      kv = $split(kvPair, '=', 2);
      key = kv[0];
      if (key.length == 0) {
        continue;
      }
      val = kv.length > 1?kv[1]:'';
      try {
        val = (throwIfNull('encodedURLComponent', val) , regexp = /\+/g , decodeURIComponent(val.replace(regexp, '%20')));
      }
       catch ($e0) {
        $e0 = toJava($e0);
        if (!instanceOf($e0, 48))
          throw toJs($e0);
      }
      values = castTo(out.get_0(key), 37);
      if (!values) {
        values = new ArrayList;
        out.put(key, values);
      }
      values.add_0(val);
    }
  }
  for (entry$iterator = out.entrySet_0().iterator(); entry$iterator.hasNext_0();) {
    entry = castTo(entry$iterator.next_1(), 23);
    entry.setValue(unmodifiableList(castTo(entry.getValue(), 37)));
  }
  out = ($clinit_Collections() , new Collections$UnmodifiableMap(out));
  return out;
}

function ensureListParameterMap(){
  var currentQueryString;
  currentQueryString = $wnd.location.search;
  if (!listParamMap || !$equals_1(cachedQueryString, currentQueryString)) {
    listParamMap = buildListParamMap(currentQueryString);
    cachedQueryString = currentQueryString;
  }
}

var cachedQueryString = '', listParamMap;
function Window$WindowHandlers(){
  HandlerManager.call(this, null);
}

defineClass(116, 78, {10:1}, Window$WindowHandlers);
var Lcom_google_gwt_user_client_Window$WindowHandlers_2_classLit = createForClass('com.google.gwt.user.client', 'Window/WindowHandlers', 116);
function $eventGetTypeInt(eventType){
  switch (eventType) {
    case 'blur':
      return 4096;
    case 'change':
      return 1024;
    case 'click':
      return 1;
    case 'dblclick':
      return 2;
    case 'focus':
      return 2048;
    case 'keydown':
      return 128;
    case 'keypress':
      return 256;
    case 'keyup':
      return 512;
    case 'load':
      return 32768;
    case 'losecapture':
      return 8192;
    case 'mousedown':
      return 4;
    case 'mousemove':
      return 64;
    case 'mouseout':
      return 32;
    case 'mouseover':
      return 16;
    case 'mouseup':
      return 8;
    case 'scroll':
      return 16384;
    case 'error':
      return $intern_21;
    case 'DOMMouseScroll':
    case 'mousewheel':
      return 131072;
    case 'contextmenu':
      return 262144;
    case 'paste':
      return $intern_14;
    case 'touchstart':
      return $intern_22;
    case 'touchmove':
      return 2097152;
    case 'touchend':
      return $intern_15;
    case 'touchcancel':
      return 8388608;
    case 'gesturestart':
      return $intern_23;
    case 'gesturechange':
      return $intern_24;
    case 'gestureend':
      return $intern_25;
    default:return -1;
  }
}

function $maybeInitializeEventSystem(){
  if (!eventSystemIsInitialized) {
    $initEventSystem();
    eventSystemIsInitialized = true;
  }
}

function getEventListener(elem){
  var maybeListener = elem.__listener;
  return !instanceOfJso(maybeListener) && instanceOf(maybeListener, 13)?maybeListener:null;
}

function setEventListener(elem, listener){
  elem.__listener = listener;
}

var eventSystemIsInitialized = false;
function $clinit_DOMImplStandard(){
  $clinit_DOMImplStandard = emptyMethod;
  bitlessEventDispatchers = {_default_:dispatchEvent_3, dragenter:dispatchDragEvent, dragover:dispatchDragEvent};
  captureEventDispatchers = {click:dispatchCapturedMouseEvent, dblclick:dispatchCapturedMouseEvent, mousedown:dispatchCapturedMouseEvent, mouseup:dispatchCapturedMouseEvent, mousemove:dispatchCapturedMouseEvent, mouseover:dispatchCapturedMouseEvent, mouseout:dispatchCapturedMouseEvent, mousewheel:dispatchCapturedMouseEvent, keydown:dispatchCapturedEvent, keyup:dispatchCapturedEvent, keypress:dispatchCapturedEvent, touchstart:dispatchCapturedMouseEvent, touchend:dispatchCapturedMouseEvent, touchmove:dispatchCapturedMouseEvent, touchcancel:dispatchCapturedMouseEvent, gesturestart:dispatchCapturedMouseEvent, gestureend:dispatchCapturedMouseEvent, gesturechange:dispatchCapturedMouseEvent};
}

function $getChild_0(elem, index_0){
  var count = 0, child = elem.firstChild;
  while (child) {
    if (child.nodeType == 1) {
      if (index_0 == count)
        return child;
      ++count;
    }
    child = child.nextSibling;
  }
  return null;
}

function $initEventSystem(){
  dispatchEvent_2 = $entry(dispatchEvent_3);
  dispatchUnhandledEvent = $entry(dispatchUnhandledEvent_0);
  var foreach = foreach_0;
  var bitlessEvents = bitlessEventDispatchers;
  foreach(bitlessEvents, function(e, fn){
    bitlessEvents[e] = $entry(fn);
  }
  );
  var captureEvents_0 = captureEventDispatchers;
  foreach(captureEvents_0, function(e, fn){
    captureEvents_0[e] = $entry(fn);
  }
  );
  foreach(captureEvents_0, function(e, fn){
    $wnd.addEventListener(e, fn, true);
  }
  );
}

function $insertChild(parent_0, toAdd, index_0){
  var count = 0, child = parent_0.firstChild, before = null;
  while (child) {
    if (child.nodeType == 1) {
      if (count == index_0) {
        before = child;
        break;
      }
      ++count;
    }
    child = child.nextSibling;
  }
  parent_0.insertBefore(toAdd, before);
}

function $sinkEventsImpl(elem, bits){
  var chMask = (elem.__eventBits || 0) ^ bits;
  elem.__eventBits = bits;
  if (!chMask)
    return;
  chMask & 1 && (elem.onclick = bits & 1?dispatchEvent_2:null);
  chMask & 2 && (elem.ondblclick = bits & 2?dispatchEvent_2:null);
  chMask & 4 && (elem.onmousedown = bits & 4?dispatchEvent_2:null);
  chMask & 8 && (elem.onmouseup = bits & 8?dispatchEvent_2:null);
  chMask & 16 && (elem.onmouseover = bits & 16?dispatchEvent_2:null);
  chMask & 32 && (elem.onmouseout = bits & 32?dispatchEvent_2:null);
  chMask & 64 && (elem.onmousemove = bits & 64?dispatchEvent_2:null);
  chMask & 128 && (elem.onkeydown = bits & 128?dispatchEvent_2:null);
  chMask & 256 && (elem.onkeypress = bits & 256?dispatchEvent_2:null);
  chMask & 512 && (elem.onkeyup = bits & 512?dispatchEvent_2:null);
  chMask & 1024 && (elem.onchange = bits & 1024?dispatchEvent_2:null);
  chMask & 2048 && (elem.onfocus = bits & 2048?dispatchEvent_2:null);
  chMask & 4096 && (elem.onblur = bits & 4096?dispatchEvent_2:null);
  chMask & 8192 && (elem.onlosecapture = bits & 8192?dispatchEvent_2:null);
  chMask & 16384 && (elem.onscroll = bits & 16384?dispatchEvent_2:null);
  chMask & 32768 && (elem.onload = bits & 32768?dispatchUnhandledEvent:null);
  chMask & $intern_21 && (elem.onerror = bits & $intern_21?dispatchEvent_2:null);
  chMask & 131072 && (elem.onmousewheel = bits & 131072?dispatchEvent_2:null);
  chMask & 262144 && (elem.oncontextmenu = bits & 262144?dispatchEvent_2:null);
  chMask & $intern_14 && (elem.onpaste = bits & $intern_14?dispatchEvent_2:null);
  chMask & $intern_22 && (elem.ontouchstart = bits & $intern_22?dispatchEvent_2:null);
  chMask & 2097152 && (elem.ontouchmove = bits & 2097152?dispatchEvent_2:null);
  chMask & $intern_15 && (elem.ontouchend = bits & $intern_15?dispatchEvent_2:null);
  chMask & 8388608 && (elem.ontouchcancel = bits & 8388608?dispatchEvent_2:null);
  chMask & $intern_23 && (elem.ongesturestart = bits & $intern_23?dispatchEvent_2:null);
  chMask & $intern_24 && (elem.ongesturechange = bits & $intern_24?dispatchEvent_2:null);
  chMask & $intern_25 && (elem.ongestureend = bits & $intern_25?dispatchEvent_2:null);
}

function dispatchCapturedEvent(evt){
  previewEvent(evt);
}

function dispatchCapturedMouseEvent(evt){
  var cancelled;
  cancelled = !previewEvent(evt);
  if (cancelled || !captureElem) {
    return;
  }
  dispatchEvent_0(evt, captureElem) && (evt.stopPropagation() , undefined);
}

function dispatchDragEvent(evt){
  evt.preventDefault();
  dispatchEvent_3(evt);
}

function dispatchEvent_3(evt){
  var element;
  element = getFirstAncestorWithListener(evt);
  if (!element) {
    return;
  }
  dispatchEvent_1(evt, element.nodeType != 1?null:element, getEventListener(element));
}

function dispatchUnhandledEvent_0(evt){
  var element;
  element = evt.currentTarget || $wnd;
  element['__gwtLastUnhandledEvent'] = evt.type;
  dispatchEvent_3(evt);
}

function getFirstAncestorWithListener(evt){
  var curElem;
  curElem = evt.currentTarget || $wnd;
  while (!!curElem && !getEventListener(curElem)) {
    curElem = curElem.parentNode;
  }
  return curElem;
}

var bitlessEventDispatchers, captureElem, captureEventDispatchers, dispatchEvent_2, dispatchUnhandledEvent;
function $get_1(this$static, elem){
  var index_0;
  index_0 = getIndex(elem);
  if (index_0 < 0) {
    return null;
  }
  return castTo($get_3(this$static.uiObjectList, index_0), 9);
}

function $put_0(this$static, uiObject){
  var index_0;
  if (!this$static.freeList) {
    index_0 = this$static.uiObjectList.array.length;
    $add_6(this$static.uiObjectList, uiObject);
  }
   else {
    index_0 = this$static.freeList.index_0;
    $set_1(this$static.uiObjectList, index_0, uiObject);
    this$static.freeList = this$static.freeList.next_0;
  }
  ($clinit_DOM() , uiObject.element)['__uiObjectID'] = index_0;
}

function $removeByElement(this$static, elem){
  var index_0;
  index_0 = getIndex(elem);
  elem['__uiObjectID'] = null;
  $set_1(this$static.uiObjectList, index_0, null);
  this$static.freeList = new ElementMapperImpl$FreeNode(index_0, this$static.freeList);
}

function ElementMapperImpl(){
  this.uiObjectList = new ArrayList;
}

function getIndex(elem){
  var index_0 = elem['__uiObjectID'];
  return index_0 == null?-1:index_0;
}

defineClass(336, 1, {}, ElementMapperImpl);
_.freeList = null;
var Lcom_google_gwt_user_client_impl_ElementMapperImpl_2_classLit = createForClass('com.google.gwt.user.client.impl', 'ElementMapperImpl', 336);
function ElementMapperImpl$FreeNode(index_0, next){
  this.index_0 = index_0;
  this.next_0 = next;
}

defineClass(337, 1, {}, ElementMapperImpl$FreeNode);
_.index_0 = 0;
var Lcom_google_gwt_user_client_impl_ElementMapperImpl$FreeNode_2_classLit = createForClass('com.google.gwt.user.client.impl', 'ElementMapperImpl/FreeNode', 337);
function foreach_0(map_0, fn){
  for (var e in map_0) {
    map_0.hasOwnProperty(e) && fn(e, map_0[e]);
  }
}

function $initWindowCloseHandler(){
  var oldOnBeforeUnload = $wnd.onbeforeunload;
  var oldOnUnload = $wnd.onunload;
  $wnd.onbeforeunload = function(evt){
    var ret, oldRet;
    try {
      ret = $entry(onClosing)();
    }
     finally {
      oldRet = oldOnBeforeUnload && oldOnBeforeUnload(evt);
    }
    if (ret != null) {
      return ret;
    }
    if (oldRet != null) {
      return oldRet;
    }
  }
  ;
  $wnd.onunload = $entry(function(evt){
    try {
      closeHandlersInitialized && fire_1((!handlers_1 && (handlers_1 = new Window$WindowHandlers) , handlers_1), false);
    }
     finally {
      oldOnUnload && oldOnUnload(evt);
      $wnd.onresize = null;
      $wnd.onscroll = null;
      $wnd.onbeforeunload = null;
      $wnd.onunload = null;
    }
  }
  );
}

function $initWindowResizeHandler(){
  var oldOnResize = $wnd.onresize;
  $wnd.onresize = $entry(function(evt){
    try {
      onResize_0();
    }
     finally {
      oldOnResize && oldOnResize(evt);
    }
  }
  );
}

function $addStyleName(this$static, style){
  setStyleName(this$static.getStyleElement(), style, true);
}

function $getElement(this$static){
  return $clinit_DOM() , this$static.element;
}

function $removeStyleName(this$static, style){
  setStyleName(($clinit_DOM() , this$static.element), style, false);
}

function $replaceNode(node, newNode){
  var p = node.parentNode;
  if (!p) {
    return;
  }
  p.insertBefore(newNode, node);
  p.removeChild(node);
}

function $setElement(this$static, elem){
  $setElement_0(this$static, ($clinit_DOM() , elem));
}

function $setElement_0(this$static, elem){
  this$static.element = elem;
}

function $setStyleName(this$static){
  ($clinit_DOM() , this$static.element).className = '';
}

function $setStyleName_0(this$static, style, add_0){
  setStyleName(this$static.getStyleElement(), style, add_0);
}

function $setStylePrimaryName(this$static){
  setStylePrimaryName(($clinit_DOM() , this$static.element), 'pentaho-button');
}

function $setTitle_0(this$static, title_0){
  title_0 == null || title_0.length == 0?(($clinit_DOM() , this$static.element).removeAttribute('title') , undefined):$setAttribute(($clinit_DOM() , this$static.element), 'title', title_0);
}

function $setVisible(this$static){
  setVisible(($clinit_DOM() , this$static.element), false);
}

function $setWidth(this$static, width_0){
  ($clinit_DOM() , this$static.element).style['width'] = width_0;
}

function $sinkBitlessEvent(this$static, eventTypeName){
  sinkBitlessEvent(($clinit_DOM() , this$static.element), eventTypeName);
}

function getStylePrimaryName(elem){
  var fullClassName, spaceIdx;
  fullClassName = elem.className || '';
  spaceIdx = $indexOf_0(fullClassName, fromCodePoint(32));
  if (spaceIdx >= 0) {
    return checkCriticalStringBounds(0, spaceIdx, fullClassName.length) , fullClassName.substr(0, spaceIdx);
  }
  return fullClassName;
}

function setStyleName(elem, style, add_0){
  if (!elem) {
    throw toJs(new RuntimeException_0('Null widget handle. If you are creating a composite, ensure that initWidget() has been called.'));
  }
  style = $trim(style);
  if (style.length == 0) {
    throw toJs(new IllegalArgumentException_0('Style names cannot be empty'));
  }
  add_0?$addClassName(elem, style):$removeClassName(elem, style);
}

function setStylePrimaryName(elem, style){
  if (!elem) {
    throw toJs(new RuntimeException_0('Null widget handle. If you are creating a composite, ensure that initWidget() has been called.'));
  }
  style = $trim(style);
  if (style.length == 0) {
    throw toJs(new IllegalArgumentException_0('Style names cannot be empty'));
  }
  updatePrimaryAndDependentStyleNames(elem, style);
}

function setVisible(elem, visible){
  elem.style.display = visible?'':'none';
  visible?elem.removeAttribute('aria-hidden'):elem.setAttribute('aria-hidden', 'true');
}

function updatePrimaryAndDependentStyleNames(elem, newPrimaryStyle){
  var classes = (elem.className || '').split(/\s+/);
  if (!classes) {
    return;
  }
  var oldPrimaryStyle = classes[0];
  var oldPrimaryStyleLen = oldPrimaryStyle.length;
  classes[0] = newPrimaryStyle;
  for (var i = 1, n = classes.length; i < n; i++) {
    var name_0 = classes[i];
    name_0.length > oldPrimaryStyleLen && name_0.charAt(oldPrimaryStyleLen) == '-' && name_0.indexOf(oldPrimaryStyle) == 0 && (classes[i] = newPrimaryStyle + name_0.substring(oldPrimaryStyleLen));
  }
  elem.className = classes.join(' ');
}

defineClass(9, 1, {11:1, 9:1});
_.getStyleElement = function getStyleElement(){
  return $clinit_DOM() , this.element;
}
;
_.setHeight = function setHeight(height){
  ($clinit_DOM() , this.element).style['height'] = height;
}
;
_.setWidth = function setWidth(width_0){
  $setWidth(this, width_0);
}
;
_.toString_0 = function toString_18(){
  if (!this.element) {
    return '(null handle)';
  }
  return ($clinit_DOM() , this.element).outerHTML;
}
;
var Lcom_google_gwt_user_client_ui_UIObject_2_classLit = createForClass('com.google.gwt.user.client.ui', 'UIObject', 9);
function $addDomHandler(this$static, handler, type_0){
  var typeInt;
  typeInt = getTypeInt(type_0.name_0);
  typeInt == -1?$sinkBitlessEvent(this$static, type_0.name_0):this$static.eventsToSink == -1?sinkEvents(($clinit_DOM() , this$static.element), typeInt | (this$static.element.__eventBits || 0)):(this$static.eventsToSink |= typeInt);
  return $addHandler(!this$static.handlerManager?(this$static.handlerManager = new HandlerManager(this$static)):this$static.handlerManager, type_0, handler);
}

function $addHandler_0(this$static, handler, type_0){
  return $addHandler(!this$static.handlerManager?(this$static.handlerManager = new HandlerManager(this$static)):this$static.handlerManager, type_0, handler);
}

function $fireEvent_0(this$static, event_0){
  !!this$static.handlerManager && $fireEvent(this$static.handlerManager, event_0);
}

function $onAttach(this$static){
  var bitsToAdd;
  if (this$static.attached) {
    throw toJs(new IllegalStateException_0("Should only call onAttach when the widget is detached from the browser's document"));
  }
  this$static.attached = true;
  $clinit_DOM();
  setEventListener(this$static.element, this$static);
  bitsToAdd = this$static.eventsToSink;
  this$static.eventsToSink = -1;
  bitsToAdd > 0 && (this$static.eventsToSink == -1?sinkEvents(this$static.element, bitsToAdd | (this$static.element.__eventBits || 0)):(this$static.eventsToSink |= bitsToAdd));
  this$static.doAttachChildren();
  this$static.onLoad();
  fire_0(this$static, true);
}

function $onBrowserEvent(this$static, event_0){
  var related;
  switch ($clinit_DOM() , $eventGetTypeInt(event_0.type)) {
    case 16:
    case 32:
      related = event_0.relatedTarget;
      if (!!related && $isOrHasChild(this$static.element, related)) {
        return;
      }

  }
  fireNativeEvent(event_0, this$static, this$static.element);
}

function $onDetach(this$static){
  if (!this$static.attached) {
    throw toJs(new IllegalStateException_0("Should only call onDetach when the widget is attached to the browser's document"));
  }
  try {
    this$static.onUnload();
    fire_0(this$static, false);
  }
   finally {
    try {
      this$static.doDetachChildren();
    }
     finally {
      $clinit_DOM();
      this$static.element.__listener = null;
      this$static.attached = false;
    }
  }
}

function $removeFromParent(this$static){
  if (!this$static.parent_0) {
    $clinit_RootPanel();
    $contains_0(widgetsToDetach, this$static) && detachNow(this$static);
  }
   else if (this$static.parent_0) {
    this$static.parent_0.remove(this$static);
  }
   else if (this$static.parent_0) {
    throw toJs(new IllegalStateException_0("This widget's parent does not implement HasWidgets"));
  }
}

function $replaceElement(this$static, elem){
  this$static.attached && ($clinit_DOM() , this$static.element.__listener = null , undefined);
  !!this$static.element && $replaceNode(this$static.element, elem);
  this$static.element = elem;
  this$static.attached && ($clinit_DOM() , setEventListener(this$static.element, this$static));
}

function $setParent(this$static, parent_0){
  var oldParent;
  oldParent = this$static.parent_0;
  if (!parent_0) {
    try {
      !!oldParent && oldParent.attached && this$static.onDetach();
    }
     finally {
      this$static.parent_0 = null;
    }
  }
   else {
    if (oldParent) {
      throw toJs(new IllegalStateException_0('Cannot set a new parent without first clearing the old parent'));
    }
    this$static.parent_0 = parent_0;
    parent_0.attached && this$static.onAttach();
  }
}

defineClass(6, 9, $intern_26);
_.doAttachChildren = function doAttachChildren(){
}
;
_.doDetachChildren = function doDetachChildren(){
}
;
_.fireEvent = function fireEvent_1(event_0){
  $fireEvent_0(this, event_0);
}
;
_.onAttach = function onAttach(){
  $onAttach(this);
}
;
_.onBrowserEvent = function onBrowserEvent(event_0){
  $onBrowserEvent(this, event_0);
}
;
_.onDetach = function onDetach(){
  $onDetach(this);
}
;
_.onLoad = function onLoad(){
}
;
_.onUnload = function onUnload(){
}
;
_.attached = false;
_.eventsToSink = 0;
var Lcom_google_gwt_user_client_ui_Widget_2_classLit = createForClass('com.google.gwt.user.client.ui', 'Widget', 6);
function $adopt(this$static, child){
  $setParent(child, this$static);
}

function $clear(this$static){
  var it;
  it = new WidgetCollection$WidgetIterator(this$static.children);
  while (it.index_0 < it.this$01.size_0) {
    $next_1(it);
    $remove_7(it);
  }
}

defineClass(512, 6, $intern_26);
_.doAttachChildren = function doAttachChildren_0(){
  tryCommand(this, ($clinit_AttachDetachException() , attachCommand));
}
;
_.doDetachChildren = function doDetachChildren_0(){
  tryCommand(this, ($clinit_AttachDetachException() , detachCommand));
}
;
var Lcom_google_gwt_user_client_ui_Panel_2_classLit = createForClass('com.google.gwt.user.client.ui', 'Panel', 512);
function $add(this$static, child, container){
  $removeFromParent(child);
  $add_4(this$static.children, child);
  $clinit_DOM();
  $appendChild(container, resolve(child.element));
  $setParent(child, this$static);
}

function $adjustIndex(this$static, child, beforeIndex){
  var idx;
  $checkIndexBoundsForInsertion(this$static, beforeIndex);
  if (child.parent_0 == this$static) {
    idx = $indexOf(this$static.children, child);
    idx < beforeIndex && --beforeIndex;
  }
  return beforeIndex;
}

function $checkIndexBoundsForInsertion(this$static, index_0){
  if (index_0 < 0 || index_0 > this$static.children.size_0) {
    throw toJs(new IndexOutOfBoundsException);
  }
}

function $insert(this$static, child, container, beforeIndex){
  beforeIndex = $adjustIndex(this$static, child, beforeIndex);
  $removeFromParent(child);
  $insert_0(this$static.children, child, beforeIndex);
  insertChild(container, ($clinit_DOM() , child.element), beforeIndex);
  $setParent(child, this$static);
}

function $remove_0(this$static, w){
  var elem;
  if (w.parent_0 != this$static) {
    return false;
  }
  try {
    $setParent(w, null);
  }
   finally {
    elem = ($clinit_DOM() , w.element);
    $removeChild((null , $getParentElement(elem)), elem);
    $remove_6(this$static.children, w);
  }
  return true;
}

function ComplexPanel(){
  this.children = new WidgetCollection(this);
}

defineClass(154, 512, $intern_26);
_.iterator = function iterator(){
  return new WidgetCollection$WidgetIterator(this.children);
}
;
_.remove = function remove_0(w){
  return $remove_0(this, w);
}
;
var Lcom_google_gwt_user_client_ui_ComplexPanel_2_classLit = createForClass('com.google.gwt.user.client.ui', 'ComplexPanel', 154);
function $add_0(this$static, w){
  $add(this$static, w, ($clinit_DOM() , this$static.element));
}

function $add_1(this$static, w){
  var beforeIndex;
  $removeFromParent(w);
  beforeIndex = this$static.children.size_0;
  this$static.setWidgetPositionImpl(w, 0, 0);
  $insert(this$static, w, ($clinit_DOM() , this$static.element), beforeIndex);
}

function $remove_1(this$static, w){
  var removed;
  removed = $remove_0(this$static, w);
  removed && changeToStaticPositioning(($clinit_DOM() , w.element));
  return removed;
}

function $setWidgetPositionImpl(w, left, top_0){
  var h;
  h = ($clinit_DOM() , w.element);
  if (left == -1 && top_0 == -1) {
    changeToStaticPositioning(h);
  }
   else {
    h.style['position'] = 'absolute';
    h.style['left'] = left + 'px';
    h.style['top'] = top_0 + 'px';
  }
}

function AbsolutePanel(){
  AbsolutePanel_0.call(this, ($clinit_DOM() , $doc.createElement('div')));
  this.element.style['position'] = 'relative';
  this.element.style['overflow'] = 'hidden';
}

function AbsolutePanel_0(elem){
  ComplexPanel.call(this);
  $setElement_0(this, ($clinit_DOM() , elem));
}

function changeToStaticPositioning(elem){
  elem.style['left'] = '';
  elem.style['top'] = '';
  elem.style['position'] = '';
}

defineClass(123, 154, $intern_26, AbsolutePanel);
_.remove = function remove_1(w){
  return $remove_1(this, w);
}
;
_.setWidgetPositionImpl = function setWidgetPositionImpl(w, left, top_0){
  $setWidgetPositionImpl(w, left, top_0);
}
;
var Lcom_google_gwt_user_client_ui_AbsolutePanel_2_classLit = createForClass('com.google.gwt.user.client.ui', 'AbsolutePanel', 123);
function create_1(resource){
  return new ClippedImagePrototype(resource.url_0, resource.left_0, resource.top_0, resource.width_0, resource.height_0);
}

defineClass(522, 1, {});
var Lcom_google_gwt_user_client_ui_AbstractImagePrototype_2_classLit = createForClass('com.google.gwt.user.client.ui', 'AbstractImagePrototype', 522);
function $clinit_AttachDetachException(){
  $clinit_AttachDetachException = emptyMethod;
  attachCommand = new AttachDetachException$1;
  detachCommand = new AttachDetachException$2;
}

function AttachDetachException(causes){
  UmbrellaException_0.call(this, causes);
}

function tryCommand(hasWidgets, c){
  $clinit_AttachDetachException();
  var caught, e, w, w$iterator;
  caught = null;
  for (w$iterator = hasWidgets.iterator(); w$iterator.hasNext_0();) {
    w = castTo(w$iterator.next_1(), 6);
    try {
      c.execute_2(w);
    }
     catch ($e0) {
      $e0 = toJava($e0);
      if (instanceOf($e0, 8)) {
        e = $e0;
        !caught && (caught = new HashSet);
        $put_1(caught.map_0, e, caught);
      }
       else 
        throw toJs($e0);
    }
  }
  if (caught) {
    throw toJs(new AttachDetachException(caught));
  }
}

defineClass(304, 156, $intern_9, AttachDetachException);
var attachCommand, detachCommand;
var Lcom_google_gwt_user_client_ui_AttachDetachException_2_classLit = createForClass('com.google.gwt.user.client.ui', 'AttachDetachException', 304);
function AttachDetachException$1(){
}

defineClass(305, 1, {}, AttachDetachException$1);
_.execute_2 = function execute_6(w){
  w.onAttach();
}
;
var Lcom_google_gwt_user_client_ui_AttachDetachException$1_2_classLit = createForClass('com.google.gwt.user.client.ui', 'AttachDetachException/1', 305);
function AttachDetachException$2(){
}

defineClass(306, 1, {}, AttachDetachException$2);
_.execute_2 = function execute_7(w){
  w.onDetach();
}
;
var Lcom_google_gwt_user_client_ui_AttachDetachException$2_2_classLit = createForClass('com.google.gwt.user.client.ui', 'AttachDetachException/2', 306);
function $clinit_FocusWidget(){
  $clinit_FocusWidget = emptyMethod;
  impl_0 = ($clinit_FocusImpl() , $clinit_FocusImpl() , implWidget);
}

function $addClickListener(this$static, listener){
  var rtn;
  rtn = new ListenerWrapper$WrappedClickListener(listener);
  $addDomHandler(this$static, rtn, ($clinit_ClickEvent() , $clinit_ClickEvent() , TYPE_0));
}

function $setFocus(this$static){
  impl_0.focus_0(($clinit_DOM() , this$static.element));
}

function FocusWidget(elem){
  $setElement_0(this, ($clinit_DOM() , elem));
}

defineClass(44, 6, $intern_27);
_.onAttach = function onAttach_0(){
  var tabIndex;
  $onAttach(this);
  tabIndex = $getTabIndex(($clinit_DOM() , this.element));
  -1 == tabIndex && (this.element.tabIndex = 0 , undefined);
}
;
var impl_0;
var Lcom_google_gwt_user_client_ui_FocusWidget_2_classLit = createForClass('com.google.gwt.user.client.ui', 'FocusWidget', 44);
function ButtonBase(elem){
  FocusWidget.call(this, elem);
}

defineClass(409, 44, $intern_27);
var Lcom_google_gwt_user_client_ui_ButtonBase_2_classLit = createForClass('com.google.gwt.user.client.ui', 'ButtonBase', 409);
function Button(html){
  var e;
  $clinit_FocusWidget();
  ButtonBase.call(this, (e = $doc.createElement('BUTTON') , e.setAttribute('type', 'button') , e));
  ($clinit_DOM() , this.element).className = 'gwt-Button';
  $setInnerHTML(this.element, html);
}

defineClass(125, 409, $intern_27, Button);
var Lcom_google_gwt_user_client_ui_Button_2_classLit = createForClass('com.google.gwt.user.client.ui', 'Button', 125);
function $getWidgetTd(this$static, w){
  if (w.parent_0 != this$static) {
    return null;
  }
  return $clinit_DOM() , $getParentElement(w.element);
}

function $setCellHorizontalAlignment(td, align_0){
  ($clinit_DOM() , td)['align'] = align_0.textAlignString;
}

function $setCellVerticalAlignment(td, align_0){
  $setCellVerticalAlignment_0(($clinit_DOM() , td), align_0);
}

function $setCellVerticalAlignment_0(td, align_0){
  td.style['verticalAlign'] = align_0.verticalAlignString;
}

function CellPanel(){
  ComplexPanel.call(this);
  this.table = ($clinit_DOM() , $doc.createElement('table'));
  this.body_0 = $doc.createElement('tbody');
  $appendChild(this.table, resolve(this.body_0));
  $setElement(this, this.table);
}

defineClass(155, 154, $intern_26);
var Lcom_google_gwt_user_client_ui_CellPanel_2_classLit = createForClass('com.google.gwt.user.client.ui', 'CellPanel', 155);
function $remove_2(this$static, w){
  if (this$static.widget != w) {
    return false;
  }
  try {
    $setParent(w, null);
  }
   finally {
    $removeChild(this$static.getContainerElement(), ($clinit_DOM() , w.element));
    this$static.widget = null;
  }
  return true;
}

function $setWidget(this$static, w){
  if (w == this$static.widget) {
    return;
  }
  !!w && $removeFromParent(w);
  !!this$static.widget && this$static.remove(this$static.widget);
  this$static.widget = w;
  if (w) {
    $clinit_DOM();
    $appendChild(this$static.getContainerElement(), resolve($getElement(this$static.widget)));
    $setParent(w, this$static);
  }
}

function SimplePanel(){
  SimplePanel_0.call(this, ($clinit_DOM() , $doc.createElement('div')));
}

function SimplePanel_0(elem){
  $setElement_0(this, ($clinit_DOM() , elem));
}

defineClass(88, 512, $intern_26);
_.getContainerElement = function getContainerElement(){
  return $clinit_DOM() , this.element;
}
;
_.iterator = function iterator_0(){
  return new SimplePanel$1(this);
}
;
_.remove = function remove_2(w){
  return $remove_2(this, w);
}
;
var Lcom_google_gwt_user_client_ui_SimplePanel_2_classLit = createForClass('com.google.gwt.user.client.ui', 'SimplePanel', 88);
function $center(this$static){
  var elem, initiallyAnimated, initiallyShowing, left, top_0;
  initiallyShowing = this$static.showing;
  initiallyAnimated = this$static.isAnimationEnabled;
  if (!initiallyShowing) {
    ($clinit_DOM() , this$static.element).style['visibility'] = 'hidden';
    this$static.isAnimationEnabled = false;
    $show_0(this$static);
  }
  elem = ($clinit_DOM() , this$static.element);
  elem.style['left'] = ($clinit_Style$Unit() , '0.0px');
  elem.style['top'] = '0.0px';
  left = $getClientWidth($doc) - $getPropertyInt(this$static.element, 'offsetWidth') >> 1;
  top_0 = $getClientHeight($doc) - $getPropertyInt(this$static.element, 'offsetHeight') >> 1;
  $setPopupPosition(this$static, $wnd.Math.max($getScrollLeft_1($doc) + left, 0), $wnd.Math.max($getScrollTop_0($doc) + top_0, 0));
  if (!initiallyShowing) {
    this$static.isAnimationEnabled = initiallyAnimated;
    if (initiallyAnimated) {
      this$static.element.style['clip'] = 'rect(0px, 0px, 0px, 0px)';
      this$static.element.style['visibility'] = 'visible';
      $run(this$static.resizeAnimation, Date.now());
    }
     else {
      this$static.element.style['visibility'] = 'visible';
    }
  }
}

function $eventTargetsPopup(this$static, event_0){
  var target;
  target = $eventGetTarget(event_0);
  if (is_0(target)) {
    return $isOrHasChild(($clinit_DOM() , this$static.element), target);
  }
  return false;
}

function $getOffsetHeight(this$static){
  return $getPropertyInt(($clinit_DOM() , this$static.element), 'offsetHeight');
}

function $getOffsetWidth(this$static){
  return $getPropertyInt(($clinit_DOM() , this$static.element), 'offsetWidth');
}

function $hide(this$static, autoClosed){
  if (!this$static.showing) {
    return;
  }
  $setState(this$static.resizeAnimation, false, false);
  fire_1(this$static, autoClosed);
}

function $maybeUpdateSize(this$static){
  var w;
  w = this$static.widget;
  if (w) {
    this$static.desiredHeight != null && w.setHeight(this$static.desiredHeight);
    this$static.desiredWidth != null && w.setWidth(this$static.desiredWidth);
  }
}

function $previewNativeEvent(this$static, event_0){
  var eventTargetsPopupOrPartner, nativeEvent, target, type_0;
  if (event_0.isCanceled || !this$static.previewAllNativeEvents && event_0.isConsumed) {
    this$static.modal && (event_0.isCanceled = true);
    return;
  }
  this$static.onPreviewNativeEvent(event_0);
  if (event_0.isCanceled) {
    return;
  }
  nativeEvent = event_0.nativeEvent;
  eventTargetsPopupOrPartner = $eventTargetsPopup(this$static, nativeEvent);
  eventTargetsPopupOrPartner && (event_0.isConsumed = true);
  this$static.modal && (event_0.isCanceled = true);
  type_0 = ($clinit_DOM() , $eventGetTypeInt(nativeEvent.type));
  switch (type_0) {
    case 128:
      {
        this$static.onKeyDownPreview((nativeEvent.keyCode | 0) & $intern_11, (nativeEvent.shiftKey?1:0) | (nativeEvent.metaKey?8:0) | (nativeEvent.ctrlKey?2:0) | (nativeEvent.altKey?4:0)) || (event_0.isCanceled = true);
        return;
      }

    case 256:
    case 512:
      {
        return;
      }

    case 4:
    case $intern_22:
      {
        if (sCaptureElem) {
          event_0.isConsumed = true;
          return;
        }
      }

      if (!eventTargetsPopupOrPartner && this$static.autoHide) {
        this$static.hide(true);
        return;
      }

      break;
    case 8:
    case 64:
    case 1:
    case 2:
    case $intern_15:
      {
        if (sCaptureElem) {
          event_0.isConsumed = true;
          return;
        }
        break;
      }

    case 2048:
      {
        target = $eventGetTarget(nativeEvent);
        if (this$static.modal && !eventTargetsPopupOrPartner && !!target) {
          target.blur && target != $doc.body && target.blur();
          event_0.isCanceled = true;
          return;
        }
        break;
      }

  }
}

function $setPopupPosition(this$static, left, top_0){
  var elem;
  this$static.leftPosition = left;
  this$static.topPosition = top_0;
  left -= 0;
  top_0 -= 0;
  elem = ($clinit_DOM() , this$static.element);
  elem.style['left'] = left + ($clinit_Style$Unit() , 'px');
  elem.style['top'] = top_0 + 'px';
}

function $setWidget_0(this$static, w){
  $setWidget(this$static, w);
  $maybeUpdateSize(this$static);
}

function $show(this$static){
  if (this$static.showing) {
    return;
  }
   else 
    this$static.attached && $removeFromParent(this$static);
  $setState(this$static.resizeAnimation, true, false);
}

function $updateHandlers(this$static){
  if (this$static.nativePreviewHandlerRegistration) {
    $removeHandler(this$static.nativePreviewHandlerRegistration.real);
    this$static.nativePreviewHandlerRegistration = null;
  }
  if (this$static.historyHandlerRegistration) {
    $removeHandler(this$static.historyHandlerRegistration.real);
    this$static.historyHandlerRegistration = null;
  }
  if (this$static.showing) {
    this$static.nativePreviewHandlerRegistration = addNativePreviewHandler(new PopupPanel$3(this$static));
    this$static.historyHandlerRegistration = addValueChangeHandler(new PopupPanel$4(this$static));
  }
}

defineClass(47, 88, $intern_28);
_.eventTargetsPartner = function eventTargetsPartner(event_0){
  return false;
}
;
_.eventTargetsPopup = function eventTargetsPopup(event_0){
  return $eventTargetsPopup(this, event_0);
}
;
_.getContainerElement = function getContainerElement_0(){
  return $clinit_DOM() , $getFirstChildElement(this.element);
}
;
_.getStyleElement = function getStyleElement_0(){
  return $getParentElement(($clinit_DOM() , $clinit_DOM() , $getFirstChildElement(this.element)));
}
;
_.hide = function hide(autoClosed){
  $hide(this, autoClosed);
}
;
_.onKeyDownPreview = function onKeyDownPreview(key, modifiers){
  return true;
}
;
_.onPreviewNativeEvent = function onPreviewNativeEvent_0(event_0){
  event_0.isFirstHandler && false && (event_0.isCanceled = true);
}
;
_.onUnload = function onUnload_0(){
  this.showing && $setState(this.resizeAnimation, false, true);
}
;
_.setHeight = function setHeight_0(height){
  this.desiredHeight = height;
  $maybeUpdateSize(this);
  height.length == 0 && (this.desiredHeight = null);
}
;
_.setWidth = function setWidth_0(width_0){
  this.desiredWidth = width_0;
  $maybeUpdateSize(this);
  width_0.length == 0 && (this.desiredWidth = null);
}
;
_.autoHide = false;
_.autoHideOnHistoryEvents = false;
_.isAnimationEnabled = false;
_.isGlassEnabled = false;
_.leftPosition = 0;
_.modal = false;
_.previewAllNativeEvents = false;
_.showing = false;
_.topPosition = 0;
var Lcom_google_gwt_user_client_ui_PopupPanel_2_classLit = createForClass('com.google.gwt.user.client.ui', 'PopupPanel', 47);
function $setWidget_1(this$static, w){
  $setWidget(this$static.decPanel, w);
  $maybeUpdateSize(this$static);
}

defineClass(265, 47, $intern_28);
_.doAttachChildren = function doAttachChildren_1(){
  $onAttach(this.decPanel);
}
;
_.doDetachChildren = function doDetachChildren_1(){
  $onDetach(this.decPanel);
}
;
_.iterator = function iterator_1(){
  return new SimplePanel$1(this.decPanel);
}
;
_.remove = function remove_3(w){
  return $remove_2(this.decPanel, w);
}
;
var Lcom_google_gwt_user_client_ui_DecoratedPopupPanel_2_classLit = createForClass('com.google.gwt.user.client.ui', 'DecoratedPopupPanel', 265);
function $getCellElement(this$static){
  var td, tr;
  tr = ($clinit_DOM() , $getChild_0(this$static.tbody, 0));
  td = (null , $getChild_0(tr, 1));
  return null , $getFirstChildElement(td);
}

function $getContainerElement(this$static){
  return $clinit_DOM() , this$static.containerElem;
}

function DecoratorPanel(rowStyles){
  var i, row, table, trElem;
  SimplePanel_0.call(this, ($clinit_DOM() , $doc.createElement('table')));
  table = this.element;
  this.tbody = $doc.createElement('tbody');
  $appendChild(table, resolve(this.tbody));
  table['cellSpacing'] = 0;
  table['cellPadding'] = 0;
  for (i = 0; i < rowStyles.length; i++) {
    row = (trElem = $doc.createElement('tr') , trElem.className = rowStyles[i] || '' , undefined , $clinit_LocaleInfo() , $appendChild(trElem, resolve(createTD(rowStyles[i] + 'Left'))) , $appendChild(trElem, resolve(createTD(rowStyles[i] + 'Center'))) , $appendChild(trElem, resolve(createTD(rowStyles[i] + 'Right'))) , trElem);
    $appendChild(this.tbody, resolve(row));
    i == 1 && (this.containerElem = $getFirstChildElement($getChild_0(row, 1)));
  }
  this.element.className = 'gwt-DecoratorPanel';
}

function createTD(styleName){
  var inner, tdElem;
  tdElem = ($clinit_DOM() , $doc.createElement('td'));
  inner = $doc.createElement('div');
  $appendChild(tdElem, resolve(inner));
  tdElem.className = styleName || '';
  inner.className = styleName + 'Inner' || '';
  return tdElem;
}

defineClass(310, 88, $intern_26, DecoratorPanel);
_.getContainerElement = function getContainerElement_1(){
  return $getContainerElement(this);
}
;
var Lcom_google_gwt_user_client_ui_DecoratorPanel_2_classLit = createForClass('com.google.gwt.user.client.ui', 'DecoratorPanel', 310);
function $beginDragging(this$static, event_0){
  $onMouseDown(this$static, $getX(event_0), $getY(event_0));
}

function $continueDragging(this$static, event_0){
  $onMouseMove(this$static, $getX(event_0), $getY(event_0));
}

function $endDragging(this$static, event_0){
  var lastArg;
  $onMouseUp((lastArg = this$static , $getX(event_0) , $getY(event_0) , lastArg));
}

function $hide_0(this$static, autoClosed){
  if (this$static.resizeHandlerRegistration) {
    $removeHandler(this$static.resizeHandlerRegistration.real);
    this$static.resizeHandlerRegistration = null;
  }
  $hide(this$static, autoClosed);
}

function $isCaptionEvent(this$static, event_0){
  var target;
  target = $eventGetTarget(event_0);
  if (is_0(target)) {
    return $isOrHasChild($getParentElement(($clinit_DOM() , $getCellElement(this$static.decPanel))), target);
  }
  return false;
}

function $onMouseDown(this$static, x_0, y_0){
  $clinit_DOM();
  if (!sCaptureElem) {
    this$static.dragging = true;
    setCapture(this$static.element);
    this$static.dragStartX = x_0;
    this$static.dragStartY = y_0;
  }
}

function $onMouseMove(this$static, x_0, y_0){
  var absX, absY;
  if (this$static.dragging) {
    absX = x_0 + $getAbsoluteLeft(($clinit_DOM() , this$static.element));
    absY = y_0 + $getAbsoluteTop(this$static.element);
    if (absX < this$static.clientLeft || absX >= this$static.windowWidth || absY < this$static.clientTop) {
      return;
    }
    $setPopupPosition(this$static, absX - this$static.dragStartX, absY - this$static.dragStartY);
  }
}

function $onMouseUp(this$static){
  this$static.dragging = false;
  releaseCapture(($clinit_DOM() , this$static.element));
}

function $onPreviewNativeEvent(this$static, event_0){
  var nativeEvent;
  nativeEvent = event_0.nativeEvent;
  !event_0.isCanceled && $getTypeInt(event_0.nativeEvent) == 4 && $isCaptionEvent(this$static, nativeEvent) && (nativeEvent.preventDefault() , undefined);
  event_0.isFirstHandler && false && (event_0.isCanceled = true);
}

function DialogBox(captionWidget){
  var mouseHandler, td, rowStyles;
  SimplePanel.call(this);
  this.glassResizer = new PopupPanel$1;
  this.isAnimationEnabled = false;
  this.leftPosition = -1;
  this.resizeAnimation = new PopupPanel$ResizeAnimation(this);
  this.topPosition = -1;
  $appendChild(($clinit_DOM() , this.element), $doc.createElement('div'));
  $setPopupPosition(this, 0, 0);
  $getParentElement((null , $getFirstChildElement(this.element))).className = 'gwt-PopupPanel';
  $getFirstChildElement(this.element).className = 'popupContent';
  this.autoHide = false;
  this.autoHideOnHistoryEvents = false;
  this.modal = true;
  rowStyles = stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['dialogTop', 'dialogMiddle', 'dialogBottom']);
  this.decPanel = new DecoratorPanel(rowStyles);
  $setStyleName(this.decPanel);
  setStylePrimaryName($getParentElement((null , $getFirstChildElement(this.element))), 'gwt-DecoratedPopupPanel');
  $setWidget_0(this, this.decPanel);
  setStyleName($getFirstChildElement(this.element), 'popupContent', false);
  setStyleName($getContainerElement(this.decPanel), 'dialogContent', true);
  $removeFromParent(captionWidget);
  this.caption = captionWidget;
  td = $getCellElement(this.decPanel);
  $appendChild(td, resolve($getElement(this.caption)));
  $adopt(this, this.caption);
  $getParentElement((null , $getFirstChildElement(this.element))).className = 'gwt-DialogBox';
  this.windowWidth = $getClientWidth($doc);
  this.clientLeft = 0;
  this.clientTop = 0;
  mouseHandler = new DialogBox$MouseHandler(this);
  $addDomHandler(this, mouseHandler, ($clinit_MouseDownEvent() , $clinit_MouseDownEvent() , TYPE_3));
  $addDomHandler(this, mouseHandler, ($clinit_MouseUpEvent() , $clinit_MouseUpEvent() , TYPE_7));
  $addDomHandler(this, mouseHandler, ($clinit_MouseMoveEvent() , $clinit_MouseMoveEvent() , TYPE_4));
  $addDomHandler(this, mouseHandler, ($clinit_MouseOverEvent() , $clinit_MouseOverEvent() , TYPE_6));
  $addDomHandler(this, mouseHandler, ($clinit_MouseOutEvent() , $clinit_MouseOutEvent() , TYPE_5));
}

defineClass(152, 265, {14:1, 10:1, 13:1, 11:1, 15:1, 60:1, 47:1, 9:1, 6:1});
_.doAttachChildren = function doAttachChildren_2(){
  try {
    $onAttach(this.decPanel);
  }
   finally {
    $onAttach(this.caption);
  }
}
;
_.doDetachChildren = function doDetachChildren_2(){
  try {
    $onDetach(this.decPanel);
  }
   finally {
    $onDetach(this.caption);
  }
}
;
_.hide = function hide_0(autoClosed){
  $hide_0(this, autoClosed);
}
;
_.onBrowserEvent = function onBrowserEvent_0(event_0){
  switch ($clinit_DOM() , $eventGetTypeInt(event_0.type)) {
    case 4:
    case 8:
    case 64:
    case 16:
    case 32:
      if (!this.dragging && !$isCaptionEvent(this, event_0)) {
        return;
      }

  }
  $onBrowserEvent(this, event_0);
}
;
_.onMouseDown_0 = function onMouseDown(sender, x_0, y_0){
  $onMouseDown(this, x_0, y_0);
}
;
_.onMouseEnter = function onMouseEnter(sender){
}
;
_.onMouseLeave = function onMouseLeave(sender){
}
;
_.onMouseMove_0 = function onMouseMove(sender, x_0, y_0){
  $onMouseMove(this, x_0, y_0);
}
;
_.onMouseUp_0 = function onMouseUp(sender, x_0, y_0){
  $onMouseUp(this);
}
;
_.onPreviewNativeEvent = function onPreviewNativeEvent_1(event_0){
  $onPreviewNativeEvent(this, event_0);
}
;
_.clientLeft = 0;
_.clientTop = 0;
_.dragStartX = 0;
_.dragStartY = 0;
_.dragging = false;
_.windowWidth = 0;
var Lcom_google_gwt_user_client_ui_DialogBox_2_classLit = createForClass('com.google.gwt.user.client.ui', 'DialogBox', 152);
function DialogBox$1(this$0){
  this.this$01 = this$0;
}

defineClass(283, 1, $intern_20, DialogBox$1);
_.onResize = function onResize_1(event_0){
  this.this$01.windowWidth = event_0.width_0;
}
;
var Lcom_google_gwt_user_client_ui_DialogBox$1_2_classLit = createForClass('com.google.gwt.user.client.ui', 'DialogBox/1', 283);
function $clinit_HasHorizontalAlignment(){
  $clinit_HasHorizontalAlignment = emptyMethod;
  ALIGN_CENTER = new HasHorizontalAlignment$HorizontalAlignmentConstant(($clinit_Style$TextAlign() , 'center'));
  new HasHorizontalAlignment$HorizontalAlignmentConstant('justify');
  ALIGN_LEFT = new HasHorizontalAlignment$HorizontalAlignmentConstant('left');
  ALIGN_RIGHT = new HasHorizontalAlignment$HorizontalAlignmentConstant('right');
  ALIGN_LOCALE_START = ($clinit_LocaleInfo() , ALIGN_LEFT);
  ALIGN_DEFAULT = ALIGN_LOCALE_START;
}

var ALIGN_CENTER, ALIGN_DEFAULT, ALIGN_LEFT, ALIGN_LOCALE_START, ALIGN_RIGHT;
function LabelBase(element){
  $setElement_0(this, ($clinit_DOM() , element));
  this.directionalTextHelper = new DirectionalTextHelper(this.element);
}

defineClass(98, 6, $intern_26);
var Lcom_google_gwt_user_client_ui_LabelBase_2_classLit = createForClass('com.google.gwt.user.client.ui', 'LabelBase', 98);
function $setText(this$static, text_0){
  $setTextOrHtml(this$static.directionalTextHelper, text_0, false);
}

function Label(element){
  var lastArg;
  LabelBase.call(this, (lastArg = element , $equalsIgnoreCase('span', element.tagName) , lastArg));
}

function Label_0(text_0){
  LabelBase.call(this, $doc.createElement('div'));
  ($clinit_DOM() , this.element).className = 'gwt-Label';
  $setTextOrHtml(this.directionalTextHelper, text_0, false);
}

function Label_1(text_0){
  Label_0.call(this, text_0);
  ($clinit_DOM() , this.element).style['whiteSpace'] = ($clinit_Style$WhiteSpace() , 'nowrap');
}

defineClass(42, 98, $intern_26, Label_0, Label_1);
var Lcom_google_gwt_user_client_ui_Label_2_classLit = createForClass('com.google.gwt.user.client.ui', 'Label', 42);
function $setHTML(this$static, html){
  $setTextOrHtml(this$static.directionalTextHelper, html, true);
}

function HTML(){
  Label.call(this, $doc.createElement('div'));
  ($clinit_DOM() , this.element).className = 'gwt-HTML';
}

defineClass(142, 42, $intern_26, HTML);
var Lcom_google_gwt_user_client_ui_HTML_2_classLit = createForClass('com.google.gwt.user.client.ui', 'HTML', 142);
function DialogBox$CaptionImpl(){
  HTML.call(this);
  ($clinit_DOM() , this.element).className = 'Caption';
}

defineClass(281, 142, $intern_26, DialogBox$CaptionImpl);
var Lcom_google_gwt_user_client_ui_DialogBox$CaptionImpl_2_classLit = createForClass('com.google.gwt.user.client.ui', 'DialogBox/CaptionImpl', 281);
function DialogBox$MouseHandler(this$0){
  this.this$01 = this$0;
}

defineClass(282, 1, $intern_29, DialogBox$MouseHandler);
_.onMouseDown = function onMouseDown_0(event_0){
  $beginDragging(this.this$01, event_0);
}
;
_.onMouseMove = function onMouseMove_0(event_0){
  $continueDragging(this.this$01, event_0);
}
;
_.onMouseOut = function onMouseOut(event_0){
}
;
_.onMouseOver = function onMouseOver(event_0){
}
;
_.onMouseUp = function onMouseUp_0(event_0){
  $endDragging(this.this$01, event_0);
}
;
var Lcom_google_gwt_user_client_ui_DialogBox$MouseHandler_2_classLit = createForClass('com.google.gwt.user.client.ui', 'DialogBox/MouseHandler', 282);
function $getTextOrHtml(this$static, isHtml){
  var elem;
  elem = this$static.isSpanWrapped?$getFirstChildElement(this$static.element):this$static.element;
  return isHtml?elem.innerHTML:elem.textContent;
}

function $setTextOrHtml(this$static, content_0, isHtml){
  this$static.isSpanWrapped = false;
  isHtml?$setInnerHTML(this$static.element, content_0):$setInnerText(this$static.element, content_0);
  if (this$static.textDir != this$static.initialElementDir) {
    this$static.textDir = this$static.initialElementDir;
    setDirectionOnElement(this$static.element, this$static.initialElementDir);
  }
}

function DirectionalTextHelper(element){
  this.element = element;
  this.isSpanWrapped = false;
  this.initialElementDir = getDirectionOnElement(element);
  this.textDir = this.initialElementDir;
}

defineClass(264, 1, {}, DirectionalTextHelper);
_.isSpanWrapped = false;
var Lcom_google_gwt_user_client_ui_DirectionalTextHelper_2_classLit = createForClass('com.google.gwt.user.client.ui', 'DirectionalTextHelper', 264);
function $addCells(tbody, row, num){
  var i, rowElem, tdElement;
  rowElem = tbody.rows[row];
  for (i = 0; i < num; i++) {
    tdElement = $doc.createElement('td');
    rowElem.appendChild(tdElement);
  }
}

function $checkCellBounds(this$static, row){
  var cellSize;
  $checkRowBounds(this$static, row);
  cellSize = ($checkRowBounds(this$static, row) , $getDOMCellCount(($clinit_DOM() , this$static.bodyElem), row));
  if (cellSize <= 0) {
    throw toJs(new IndexOutOfBoundsException_0(($checkRowBounds(this$static, row) , 'Column index: 0, Column size: ' + $getDOMCellCount(this$static.bodyElem, row))));
  }
}

function $checkRowBounds(this$static, row){
  var rowSize;
  rowSize = $getDOMRowCount(this$static.bodyElem);
  if (row >= rowSize || row < 0) {
    throw toJs(new IndexOutOfBoundsException_0('Row index: ' + row + ', Row size: ' + rowSize));
  }
}

function $getDOMCellCount(tableBody, row){
  var rowElement;
  rowElement = tableBody.rows[row];
  return rowElement.cells.length;
}

function $getDOMRowCount(tbody){
  return ($clinit_DOM() , tbody).rows.length;
}

function $getWidget(this$static, row){
  var e, child;
  $checkCellBounds(this$static, row);
  return e = $getRawElement(this$static.cellFormatter, row, 0) , child = ($clinit_DOM() , $getFirstChildElement(e)) , !child?null:castTo($get_1(this$static.widgetMap, child), 6);
}

function $internalClearCell(this$static, td){
  var maybeChild, widget;
  maybeChild = ($clinit_DOM() , $getFirstChildElement(td));
  widget = null;
  !!maybeChild && (widget = castTo($get_1(this$static.widgetMap, maybeChild), 6));
  if (widget) {
    $remove_3(this$static, widget);
    return true;
  }
   else {
    td.innerHTML = '';
    return false;
  }
}

function $prepareColumn(column){
  if (column < 0) {
    throw toJs(new IndexOutOfBoundsException_0('Cannot access a column with a negative index: ' + column));
  }
}

function $remove_3(this$static, widget){
  var elem;
  if (widget.parent_0 != this$static) {
    return false;
  }
  try {
    $setParent(widget, null);
  }
   finally {
    elem = ($clinit_DOM() , widget.element);
    $removeChild((null , $getParentElement(elem)), elem);
    $removeByElement(this$static.widgetMap, elem);
  }
  return true;
}

function $setCellFormatter(this$static, cellFormatter){
  this$static.cellFormatter = cellFormatter;
}

function $setColumnFormatter(this$static, formatter){
  !!this$static.columnFormatter && (formatter.columnGroup = this$static.columnFormatter.columnGroup);
  this$static.columnFormatter = formatter;
  $prepareColumnGroup(this$static.columnFormatter);
}

function $setWidget_2(this$static, row, column, widget){
  var td, td_0;
  $prepareCell(this$static, row, column);
  td = (td_0 = $getRawElement(this$static.cellFormatter, row, column) , $internalClearCell(this$static, ($clinit_DOM() , td_0)) , td_0);
  if (widget) {
    $removeFromParent(widget);
    $put_0(this$static.widgetMap, widget);
    $appendChild(td, resolve(widget.element));
    $setParent(widget, this$static);
  }
}

defineClass(316, 512, $intern_26);
_.iterator = function iterator_2(){
  return new HTMLTable$1(this);
}
;
_.remove = function remove_4(widget){
  return $remove_3(this, widget);
}
;
var Lcom_google_gwt_user_client_ui_HTMLTable_2_classLit = createForClass('com.google.gwt.user.client.ui', 'HTMLTable', 316);
function $prepareCell(this$static, row, column){
  var cellCount, required;
  $prepareRow(this$static, row);
  if (column < 0) {
    throw toJs(new IndexOutOfBoundsException_0('Cannot create a column with a negative index: ' + column));
  }
  cellCount = ($checkRowBounds(this$static, row) , $getDOMCellCount(($clinit_DOM() , this$static.bodyElem), row));
  required = column + 1 - cellCount;
  required > 0 && $addCells(this$static.bodyElem, row, required);
}

function $prepareRow(this$static, row){
  var i, rowCount, tr;
  if (row < 0) {
    throw toJs(new IndexOutOfBoundsException_0('Cannot create a row with a negative index: ' + row));
  }
  rowCount = $getDOMRowCount(this$static.bodyElem);
  for (i = rowCount; i <= row; i++) {
    i != $getDOMRowCount(this$static.bodyElem) && $checkRowBounds(this$static, i);
    tr = ($clinit_DOM() , $doc.createElement('tr'));
    insertChild(this$static.bodyElem, tr, i);
  }
}

function FlexTable(){
  this.widgetMap = new ElementMapperImpl;
  this.tableElem = ($clinit_DOM() , $doc.createElement('table'));
  this.bodyElem = $doc.createElement('tbody');
  $appendChild(this.tableElem, resolve(this.bodyElem));
  $setElement(this, this.tableElem);
  $setCellFormatter(this, new FlexTable$FlexCellFormatter(this));
  $setColumnFormatter(this, new HTMLTable$ColumnFormatter(this));
}

defineClass(159, 316, $intern_26, FlexTable);
var Lcom_google_gwt_user_client_ui_FlexTable_2_classLit = createForClass('com.google.gwt.user.client.ui', 'FlexTable', 159);
function $getCellElement_0(tbody, row, col){
  return tbody.rows[row].cells[col];
}

function $getElement_0(this$static){
  $checkCellBounds(this$static.this$01, 0);
  return $clinit_DOM() , $getCellElement_0(this$static.this$01.bodyElem, 0, 0);
}

function $getRawElement(this$static, row, column){
  return $getCellElement_0(this$static.this$01.bodyElem, row, column);
}

function $setHorizontalAlignment(this$static, align_0){
  var elem;
  $prepareCell(this$static.this$01, 0, 0);
  elem = this$static.this$01.bodyElem.rows[0].cells[0];
  elem['align'] = align_0.textAlignString;
}

function $setStyleName_1(this$static){
  $prepareCell(this$static.this$01, 0, 0);
  this$static.this$01.bodyElem.rows[0].cells[0].className = 'dialog-content';
}

function $setVerticalAlignment(this$static, row, align_0){
  $prepareCell(this$static.this$01, row, 0);
  $getCellElement_0(this$static.this$01.bodyElem, row, 0).style['verticalAlign'] = align_0.verticalAlignString;
}

function $setWidth_0(this$static){
  $prepareCell(this$static.this$01, 0, 0);
  this$static.this$01.bodyElem.rows[0].cells[0]['width'] = '100%';
}

defineClass(313, 1, {});
var Lcom_google_gwt_user_client_ui_HTMLTable$CellFormatter_2_classLit = createForClass('com.google.gwt.user.client.ui', 'HTMLTable/CellFormatter', 313);
function FlexTable$FlexCellFormatter(this$0){
  this.this$01 = this$0;
}

defineClass(317, 313, {}, FlexTable$FlexCellFormatter);
var Lcom_google_gwt_user_client_ui_FlexTable$FlexCellFormatter_2_classLit = createForClass('com.google.gwt.user.client.ui', 'FlexTable/FlexCellFormatter', 317);
function $clinit_FocusPanel(){
  $clinit_FocusPanel = emptyMethod;
  impl_1 = ($clinit_FocusImpl() , $clinit_FocusImpl() , implPanel);
}

function $addClickListener_0(this$static, listener){
  var rtn;
  rtn = new ListenerWrapper$WrappedClickListener(listener);
  $addDomHandler(this$static, rtn, ($clinit_ClickEvent() , $clinit_ClickEvent() , TYPE_0));
}

defineClass(276, 88, $intern_30);
var impl_1;
var Lcom_google_gwt_user_client_ui_FocusPanel_2_classLit = createForClass('com.google.gwt.user.client.ui', 'FocusPanel', 276);
function Frame_0(element){
  $setElement_0(this, ($clinit_DOM() , element));
}

defineClass(111, 6, {14:1, 10:1, 13:1, 111:1, 11:1, 15:1, 9:1, 6:1}, Frame_0);
var Lcom_google_gwt_user_client_ui_Frame_2_classLit = createForClass('com.google.gwt.user.client.ui', 'Frame', 111);
function $forEachRemaining(this$static, consumer){
  checkCriticalNotNull(consumer);
  while (this$static.i < this$static.this$01.array.length) {
    $accept_0(consumer, $next_4(this$static));
  }
}

function $findNext(this$static){
  while (++this$static.nextIndex < this$static.widgetList.array.length) {
    if ($get_3(this$static.widgetList, this$static.nextIndex) != null) {
      return;
    }
  }
}

function $next(this$static){
  var result;
  if (this$static.nextIndex >= this$static.widgetList.array.length) {
    throw toJs(new NoSuchElementException);
  }
  result = castTo($get_3(this$static.widgetList, this$static.nextIndex), 6);
  this$static.lastIndex = this$static.nextIndex;
  $findNext(this$static);
  return result;
}

function HTMLTable$1(this$0){
  this.this$01 = this$0;
  this.widgetList = this.this$01.widgetMap.uiObjectList;
  $findNext(this);
}

defineClass(315, 1, {}, HTMLTable$1);
_.next_1 = function next_0(){
  return $next(this);
}
;
_.hasNext_0 = function hasNext(){
  return this.nextIndex < this.widgetList.array.length;
}
;
_.remove_0 = function remove_5(){
  var w;
  if (this.lastIndex < 0) {
    throw toJs(new IllegalStateException);
  }
  w = castTo($get_3(this.widgetList, this.lastIndex), 6);
  $removeFromParent(w);
  this.lastIndex = -1;
}
;
_.lastIndex = -1;
_.nextIndex = -1;
var Lcom_google_gwt_user_client_ui_HTMLTable$1_2_classLit = createForClass('com.google.gwt.user.client.ui', 'HTMLTable/1', 315);
function $addStyleName_0(this$static, col, styleName){
  setStyleName(($prepareColumn(col) , $prepareColumnGroup(this$static) , $resizeColumnGroup(this$static, col + 1, true) , $getChild(this$static.columnGroup, col)), styleName, true);
}

function $prepareColumnGroup(this$static){
  if (!this$static.columnGroup) {
    this$static.columnGroup = ($clinit_DOM() , $doc.createElement('colgroup'));
    insertChild(this$static.this$01.tableElem, this$static.columnGroup, 0);
    $appendChild(this$static.columnGroup, resolve($doc.createElement('col')));
  }
}

function $resizeColumnGroup(this$static, columns, growOnly){
  var i, num;
  columns = $wnd.Math.max(columns, 1);
  num = this$static.columnGroup.childNodes.length;
  if (num < columns) {
    for (i = num; i < columns; i++) {
      $appendChild(this$static.columnGroup, $doc.createElement('col'));
    }
  }
   else if (!growOnly && num > columns) {
    for (i = num; i > columns; i--) {
      $removeChild(this$static.columnGroup, this$static.columnGroup.lastChild);
    }
  }
}

function HTMLTable$ColumnFormatter(this$0){
  this.this$01 = this$0;
}

defineClass(314, 1, {}, HTMLTable$ColumnFormatter);
var Lcom_google_gwt_user_client_ui_HTMLTable$ColumnFormatter_2_classLit = createForClass('com.google.gwt.user.client.ui', 'HTMLTable/ColumnFormatter', 314);
function $clinit_HasVerticalAlignment(){
  $clinit_HasVerticalAlignment = emptyMethod;
  ALIGN_BOTTOM = new HasVerticalAlignment$VerticalAlignmentConstant('bottom');
  ALIGN_MIDDLE = new HasVerticalAlignment$VerticalAlignmentConstant('middle');
  ALIGN_TOP = new HasVerticalAlignment$VerticalAlignmentConstant('top');
}

var ALIGN_BOTTOM, ALIGN_MIDDLE, ALIGN_TOP;
defineClass(509, 1, {});
var Lcom_google_gwt_user_client_ui_HasHorizontalAlignment$AutoHorizontalAlignmentConstant_2_classLit = createForClass('com.google.gwt.user.client.ui', 'HasHorizontalAlignment/AutoHorizontalAlignmentConstant', 509);
function HasHorizontalAlignment$HorizontalAlignmentConstant(textAlignString){
  this.textAlignString = textAlignString;
}

defineClass(99, 509, {}, HasHorizontalAlignment$HorizontalAlignmentConstant);
var Lcom_google_gwt_user_client_ui_HasHorizontalAlignment$HorizontalAlignmentConstant_2_classLit = createForClass('com.google.gwt.user.client.ui', 'HasHorizontalAlignment/HorizontalAlignmentConstant', 99);
function HasVerticalAlignment$VerticalAlignmentConstant(verticalAlignString){
  this.verticalAlignString = verticalAlignString;
}

defineClass(121, 1, {}, HasVerticalAlignment$VerticalAlignmentConstant);
var Lcom_google_gwt_user_client_ui_HasVerticalAlignment$VerticalAlignmentConstant_2_classLit = createForClass('com.google.gwt.user.client.ui', 'HasVerticalAlignment/VerticalAlignmentConstant', 121);
function $add_2(this$static, w){
  var td, td_0;
  td = (td_0 = ($clinit_DOM() , $doc.createElement('td')) , $setCellHorizontalAlignment(td_0, this$static.horzAlign) , $setCellVerticalAlignment(td_0, this$static.vertAlign) , td_0);
  $appendChild(this$static.tableRow, resolve(td));
  $add(this$static, w, td);
}

function $setHorizontalAlignment_0(this$static, align_0){
  this$static.horzAlign = align_0;
}

defineClass(301, 155, $intern_26);
_.remove = function remove_6(w){
  var removed, td;
  td = ($clinit_DOM() , $getParentElement(w.element));
  removed = $remove_0(this, w);
  removed && $removeChild(this.tableRow, td);
  return removed;
}
;
var Lcom_google_gwt_user_client_ui_HorizontalPanel_2_classLit = createForClass('com.google.gwt.user.client.ui', 'HorizontalPanel', 301);
function $clinit_Image(){
  $clinit_Image = emptyMethod;
  new HashMap;
}

function $addClickListener_1(this$static, listener){
  var rtn;
  rtn = new ListenerWrapper$WrappedClickListener(listener);
  $addHandler_0(this$static, rtn, ($clinit_ClickEvent() , $clinit_ClickEvent() , TYPE_0));
}

function $changeState(this$static, newState){
  this$static.state = newState;
}

function $setUrl(this$static, url_0){
  this$static.state.setUrl(this$static, url_0);
}

function $setUrl_0(this$static, url_0){
  $setUrl(this$static, ($clinit_UriUtils() , new SafeUriString(url_0)));
}

function Image_0(url_0){
  $changeState(this, new Image$UnclippedState_0(this, url_0));
  ($clinit_DOM() , this.element).className = 'gwt-Image';
}

function Image_1(url_0, left, top_0, width_0, height){
  $clinit_Image();
  $changeState(this, new Image$ClippedState(this, url_0, left, top_0, width_0, height));
  ($clinit_DOM() , this.element).className = 'gwt-Image';
}

function Image_2(url_0){
  $clinit_Image();
  Image_0.call(this, ($clinit_UriUtils() , new SafeUriString(url_0)));
}

defineClass(104, 6, $intern_26, Image_1);
_.onBrowserEvent = function onBrowserEvent_1(event_0){
  $clinit_DOM();
  if ($eventGetTypeInt(event_0.type) == 32768) {
    !!this.state && (this.state.getImageElement(this)['__gwtLastUnhandledEvent'] = '' , undefined);
    this.state.onLoadEvent(this);
  }
  $onBrowserEvent(this, event_0);
}
;
_.onLoad = function onLoad_0(){
  $onLoad(this.state, this);
}
;
var Lcom_google_gwt_user_client_ui_Image_2_classLit = createForClass('com.google.gwt.user.client.ui', 'Image', 104);
function $onLoad(this$static, image){
  var unhandledEvent;
  unhandledEvent = $getPropertyString(this$static.getImageElement(image), '__gwtLastUnhandledEvent');
  $equals_1('load', unhandledEvent) && (this$static.syntheticEventCommand = new Image$State$1(this$static, image) , $scheduleDeferred(($clinit_SchedulerImpl() , INSTANCE), this$static.syntheticEventCommand));
}

defineClass(157, 1, {});
_.onLoadEvent = function onLoadEvent(image){
}
;
_.syntheticEventCommand = null;
var Lcom_google_gwt_user_client_ui_Image$State_2_classLit = createForClass('com.google.gwt.user.client.ui', 'Image/State', 157);
function $clinit_Image$ClippedState(){
  $clinit_Image$ClippedState = emptyMethod;
  $clinit_ClippedImageImpl();
}

function Image$ClippedState(image, url_0, left, top_0, width_0, height){
  $clinit_Image$ClippedState();
  this.width_0 = width_0;
  $replaceElement(image, $createStructure(url_0, left, top_0, width_0, height));
  image.eventsToSink == -1?sinkEvents(($clinit_DOM() , image.element), 133333119 | (image.element.__eventBits || 0)):(image.eventsToSink |= 133333119);
}

defineClass(307, 157, {}, Image$ClippedState);
_.getImageElement = function getImageElement(image){
  return $clinit_DOM() , image.element;
}
;
_.getWidth = function getWidth(image){
  return this.width_0;
}
;
_.onLoadEvent = function onLoadEvent_0(image){
}
;
_.setUrl = function setUrl(image, url_0){
  $changeState(image, new Image$UnclippedState_0(image, url_0));
}
;
_.width_0 = 0;
var Lcom_google_gwt_user_client_ui_Image$ClippedState_2_classLit = createForClass('com.google.gwt.user.client.ui', 'Image/ClippedState', 307);
function Image$State$1(this$1, val$image){
  this.this$11 = this$1;
  this.val$image2 = val$image;
}

defineClass(308, 1, {}, Image$State$1);
_.execute_1 = function execute_8(){
  var evt, evt_0;
  if (this.val$image2.state != this.this$11 || this != this.this$11.syntheticEventCommand) {
    return;
  }
  this.this$11.syntheticEventCommand = null;
  if (!this.val$image2.attached) {
    this.this$11.getImageElement(this.val$image2)['__gwtLastUnhandledEvent'] = 'load';
    return;
  }
  evt = (evt_0 = $doc.createEvent('HTMLEvents') , evt_0.initEvent('load', false, false) , evt_0);
  $dispatchEvent(this.this$11.getImageElement(this.val$image2), evt);
}
;
var Lcom_google_gwt_user_client_ui_Image$State$1_2_classLit = createForClass('com.google.gwt.user.client.ui', 'Image/State/1', 308);
function Image$UnclippedState(image){
  $replaceElement(image, $doc.createElement('img'));
  sinkEvents_0(($clinit_DOM() , image.element));
  image.eventsToSink == -1?sinkEvents(image.element, 133398655 | (image.element.__eventBits || 0)):(image.eventsToSink |= 133398655);
}

function Image$UnclippedState_0(image, url_0){
  Image$UnclippedState.call(this, image);
  !!image.state && (image.state.getImageElement(image)['__gwtLastUnhandledEvent'] = '' , undefined);
  $setSrc(($clinit_DOM() , image.element), url_0.uri_0);
}

defineClass(105, 157, {}, Image$UnclippedState, Image$UnclippedState_0);
_.getImageElement = function getImageElement_0(image){
  return $clinit_DOM() , image.element;
}
;
_.getWidth = function getWidth_0(image){
  return ($clinit_DOM() , image.element).width;
}
;
_.setUrl = function setUrl_0(image, url_0){
  !!image.state && (image.state.getImageElement(image)['__gwtLastUnhandledEvent'] = '' , undefined);
  $setSrc(($clinit_DOM() , image.element), url_0.uri_0);
}
;
var Lcom_google_gwt_user_client_ui_Image$UnclippedState_2_classLit = createForClass('com.google.gwt.user.client.ui', 'Image/UnclippedState', 105);
function $addChangeListener(this$static, listener){
  var rtn;
  rtn = new ListenerWrapper$WrappedChangeListener(listener);
  $addDomHandler(this$static, rtn, ($clinit_ChangeEvent() , $clinit_ChangeEvent() , TYPE));
}

function $checkIndex(this$static, index_0){
  if (index_0 < 0 || index_0 >= ($clinit_DOM() , this$static.element).options.length) {
    throw toJs(new IndexOutOfBoundsException);
  }
}

function $getValue(this$static, index_0){
  $checkIndex(this$static, index_0);
  return ($clinit_DOM() , this$static.element).options[index_0].value;
}

function $insertItem(this$static, item_0, value_0, index_0){
  var before, itemCount, option, select;
  select = ($clinit_DOM() , this$static.element);
  option = $doc.createElement('option');
  option.text = item_0;
  option.removeAttribute('bidiwrapped');
  option.value = value_0;
  itemCount = select.options.length;
  (index_0 < 0 || index_0 > itemCount) && (index_0 = itemCount);
  if (index_0 == itemCount) {
    select.add(option, null);
  }
   else {
    before = select.options[index_0];
    select.add(option, before);
  }
}

function $setSelectedIndex_0(this$static, index_0){
  $setSelectedIndex(($clinit_DOM() , this$static.element), index_0);
}

function ListBox(){
  $clinit_FocusWidget();
  FocusWidget.call(this, $doc.createElement('select'));
  ($clinit_DOM() , this.element).className = 'gwt-ListBox';
}

defineClass(328, 44, $intern_27, ListBox);
var Lcom_google_gwt_user_client_ui_ListBox_2_classLit = createForClass('com.google.gwt.user.client.ui', 'ListBox', 328);
function ListenerWrapper(listener){
  this.listener = listener;
}

defineClass(108, 402, {21:1});
var Lcom_google_gwt_user_client_ui_ListenerWrapper_2_classLit = createForClass('com.google.gwt.user.client.ui', 'ListenerWrapper', 108);
function ListenerWrapper$WrappedChangeListener(listener){
  ListenerWrapper.call(this, listener);
}

defineClass(403, 108, $intern_31, ListenerWrapper$WrappedChangeListener);
_.onChange = function onChange(event_0){
  var lastArg;
  $onChange((lastArg = castTo(this.listener, 527) , castTo(event_0.source, 6) , lastArg));
}
;
var Lcom_google_gwt_user_client_ui_ListenerWrapper$WrappedChangeListener_2_classLit = createForClass('com.google.gwt.user.client.ui', 'ListenerWrapper/WrappedChangeListener', 403);
function ListenerWrapper$WrappedClickListener(listener){
  ListenerWrapper.call(this, listener);
}

defineClass(124, 108, $intern_32, ListenerWrapper$WrappedClickListener);
_.onClick = function onClick(event_0){
  castTo(this.listener, 138).onClick_0(castTo(event_0.source, 6));
}
;
var Lcom_google_gwt_user_client_ui_ListenerWrapper$WrappedClickListener_2_classLit = createForClass('com.google.gwt.user.client.ui', 'ListenerWrapper/WrappedClickListener', 124);
function ListenerWrapper$WrappedMouseListener(listener){
  ListenerWrapper.call(this, listener);
}

function add_3(source, listener){
  var handlers;
  handlers = new ListenerWrapper$WrappedMouseListener(listener);
  $addDomHandler(source, handlers, ($clinit_MouseDownEvent() , $clinit_MouseDownEvent() , TYPE_3));
  $addDomHandler(source, handlers, ($clinit_MouseUpEvent() , $clinit_MouseUpEvent() , TYPE_7));
  $addDomHandler(source, handlers, ($clinit_MouseOutEvent() , $clinit_MouseOutEvent() , TYPE_5));
  $addDomHandler(source, handlers, ($clinit_MouseOverEvent() , $clinit_MouseOverEvent() , TYPE_6));
  $addDomHandler(source, handlers, ($clinit_MouseMoveEvent() , $clinit_MouseMoveEvent() , TYPE_4));
  return handlers;
}

defineClass(404, 108, $intern_29, ListenerWrapper$WrappedMouseListener);
_.onMouseDown = function onMouseDown_1(event_0){
  var source;
  source = castTo(event_0.source, 6);
  castTo(this.listener, 60).onMouseDown_0(source, $getX(event_0), $getY(event_0));
}
;
_.onMouseMove = function onMouseMove_1(event_0){
  var source;
  source = castTo(event_0.source, 6);
  castTo(this.listener, 60).onMouseMove_0(source, $getX(event_0), $getY(event_0));
}
;
_.onMouseOut = function onMouseOut_0(event_0){
  castTo(this.listener, 60).onMouseLeave(castTo(event_0.source, 6));
}
;
_.onMouseOver = function onMouseOver_0(event_0){
  castTo(this.listener, 60).onMouseEnter(castTo(event_0.source, 6));
}
;
_.onMouseUp = function onMouseUp_1(event_0){
  var source;
  source = castTo(event_0.source, 6);
  castTo(this.listener, 60).onMouseUp_0(source, $getX(event_0), $getY(event_0));
}
;
var Lcom_google_gwt_user_client_ui_ListenerWrapper$WrappedMouseListener_2_classLit = createForClass('com.google.gwt.user.client.ui', 'ListenerWrapper/WrappedMouseListener', 404);
function ListenerWrapper$WrappedPopupListener(listener){
  ListenerWrapper.call(this, listener);
}

defineClass(405, 108, $intern_33, ListenerWrapper$WrappedPopupListener);
_.onClose = function onClose(event_0){
  castTo(this.listener, 137).onPopupClosed(castTo(event_0.source, 47), event_0.autoClosed);
}
;
var Lcom_google_gwt_user_client_ui_ListenerWrapper$WrappedPopupListener_2_classLit = createForClass('com.google.gwt.user.client.ui', 'ListenerWrapper/WrappedPopupListener', 405);
function $onResize(){
  var height, width_0, winHeight, winWidth;
  null.$_nullMethod();
  winWidth = $getClientWidth($doc);
  winHeight = $getClientHeight($doc);
  null.$_nullMethod(($clinit_Style$Display() , 'none'));
  null.$_nullMethod(($clinit_Style$Unit() , '0.0px'));
  null.$_nullMethod('0.0px');
  width_0 = $getScrollWidth($doc);
  height = $getScrollHeight($doc);
  null.$_nullMethod($wnd.Math.max(width_0, winWidth) + 'px');
  null.$_nullMethod($wnd.Math.max(height, winHeight) + 'px');
  null.$_nullMethod('block');
}

function PopupPanel$1(){
}

defineClass(286, 1, $intern_20, PopupPanel$1);
_.onResize = function onResize_2(event_0){
  $onResize();
}
;
var Lcom_google_gwt_user_client_ui_PopupPanel$1_2_classLit = createForClass('com.google.gwt.user.client.ui', 'PopupPanel/1', 286);
function PopupPanel$3(this$0){
  this.this$01 = this$0;
}

defineClass(287, 1, $intern_19, PopupPanel$3);
_.onPreviewNativeEvent = function onPreviewNativeEvent_2(event_0){
  $previewNativeEvent(this.this$01, event_0);
}
;
var Lcom_google_gwt_user_client_ui_PopupPanel$3_2_classLit = createForClass('com.google.gwt.user.client.ui', 'PopupPanel/3', 287);
function PopupPanel$4(this$0){
  this.this$01 = this$0;
}

defineClass(288, 1, $intern_34, PopupPanel$4);
_.onValueChange = function onValueChange(event_0){
  this.this$01.autoHideOnHistoryEvents && this.this$01.hide(false);
}
;
var Lcom_google_gwt_user_client_ui_PopupPanel$4_2_classLit = createForClass('com.google.gwt.user.client.ui', 'PopupPanel/4', 288);
function $maybeShowGlass(this$static){
  if (this$static.showing) {
    if (this$static.curPanel.isGlassEnabled) {
      $appendChild($doc.body, this$static.curPanel.glass);
      this$static.resizeRegistration = addResizeHandler(this$static.curPanel.glassResizer);
      $onResize();
      this$static.glassShowing = true;
    }
  }
   else if (this$static.glassShowing) {
    $removeChild($doc.body, this$static.curPanel.glass);
    $removeHandler(this$static.resizeRegistration.real);
    this$static.resizeRegistration = null;
    this$static.glassShowing = false;
  }
}

function $onComplete(this$static){
  if (!this$static.showing) {
    $maybeShowGlass(this$static);
    this$static.isUnloading || $remove_1(($clinit_RootPanel() , get_0()), this$static.curPanel);
  }
  $getElement(this$static.curPanel).style['clip'] = 'rect(auto, auto, auto, auto)';
  $getElement(this$static.curPanel).style['overflow'] = 'visible';
}

function $onInstantaneousRun(this$static){
  $maybeShowGlass(this$static);
  if (this$static.showing) {
    $getElement(this$static.curPanel).style['position'] = 'absolute';
    this$static.curPanel.topPosition != -1 && $setPopupPosition(this$static.curPanel, this$static.curPanel.leftPosition, this$static.curPanel.topPosition);
    $add_0(($clinit_RootPanel() , get_0()), this$static.curPanel);
  }
   else {
    this$static.isUnloading || $remove_1(($clinit_RootPanel() , get_0()), this$static.curPanel);
  }
  $getElement(this$static.curPanel).style['overflow'] = 'visible';
}

function $onUpdate(this$static, progress){
  var bottom, height, left, right, top_0, width_0;
  this$static.showing || (progress = 1 - progress);
  top_0 = 0;
  left = 0;
  right = 0;
  bottom = 0;
  height = round_int(progress * this$static.offsetHeight_0);
  width_0 = round_int(progress * this$static.offsetWidth_0);
  switch (0) {
    case 0:
      top_0 = this$static.offsetHeight_0 - height >> 1;
      left = this$static.offsetWidth_0 - width_0 >> 1;
      right = left + width_0;
      bottom = top_0 + height;
  }
  $setClip($getElement(this$static.curPanel), 'rect(' + top_0 + 'px, ' + right + 'px, ' + bottom + 'px, ' + left + 'px)');
}

function $setState(this$static, showing, isUnloading){
  var animate;
  this$static.isUnloading = isUnloading;
  $cancel(this$static);
  if (this$static.showTimer) {
    $cancel_0(this$static.showTimer);
    this$static.showTimer = null;
    $onComplete(this$static);
  }
  this$static.curPanel.showing = showing;
  $updateHandlers(this$static.curPanel);
  animate = !isUnloading && this$static.curPanel.isAnimationEnabled;
  this$static.showing = showing;
  if (animate) {
    if (showing) {
      $maybeShowGlass(this$static);
      $getElement(this$static.curPanel).style['position'] = 'absolute';
      this$static.curPanel.topPosition != -1 && $setPopupPosition(this$static.curPanel, this$static.curPanel.leftPosition, this$static.curPanel.topPosition);
      $getElement(this$static.curPanel).style['clip'] = 'rect(0px, 0px, 0px, 0px)';
      $add_0(($clinit_RootPanel() , get_0()), this$static.curPanel);
      this$static.showTimer = new PopupPanel$ResizeAnimation$1(this$static);
      $schedule(this$static.showTimer, 1);
    }
     else {
      $run(this$static, Date.now());
    }
  }
   else {
    $onInstantaneousRun(this$static);
  }
}

function PopupPanel$ResizeAnimation(panel){
  Animation_0.call(this);
  this.curPanel = panel;
}

defineClass(284, 119, {}, PopupPanel$ResizeAnimation);
_.onComplete = function onComplete_0(){
  $onComplete(this);
}
;
_.onStart = function onStart_0(){
  this.offsetHeight_0 = $getOffsetHeight(this.curPanel);
  this.offsetWidth_0 = $getOffsetWidth(this.curPanel);
  $getElement(this.curPanel).style['overflow'] = 'hidden';
  $onUpdate(this, (1 + $wnd.Math.cos($intern_0)) / 2);
}
;
_.onUpdate = function onUpdate(progress){
  $onUpdate(this, progress);
}
;
_.curPanel = null;
_.glassShowing = false;
_.isUnloading = false;
_.offsetHeight_0 = 0;
_.offsetWidth_0 = -1;
_.showing = false;
var Lcom_google_gwt_user_client_ui_PopupPanel$ResizeAnimation_2_classLit = createForClass('com.google.gwt.user.client.ui', 'PopupPanel/ResizeAnimation', 284);
function PopupPanel$ResizeAnimation$1(this$1){
  this.this$11 = this$1;
  Timer.call(this);
}

defineClass(285, 100, {}, PopupPanel$ResizeAnimation$1);
_.run = function run_1(){
  this.this$11.showTimer = null;
  $run(this.this$11, Date.now());
}
;
var Lcom_google_gwt_user_client_ui_PopupPanel$ResizeAnimation$1_2_classLit = createForClass('com.google.gwt.user.client.ui', 'PopupPanel/ResizeAnimation/1', 285);
function $clinit_RootPanel(){
  $clinit_RootPanel = emptyMethod;
  maybeDetachCommand = new RootPanel$1;
  rootPanels = new HashMap;
  widgetsToDetach = new HashSet;
}

function RootPanel(elem){
  AbsolutePanel_0.call(this, elem);
  $onAttach(this);
}

function detachNow(widget){
  $clinit_RootPanel();
  try {
    widget.onDetach();
  }
   finally {
    $remove_15(widgetsToDetach, widget);
  }
}

function detachWidgets(){
  $clinit_RootPanel();
  try {
    tryCommand(widgetsToDetach, maybeDetachCommand);
  }
   finally {
    $reset(widgetsToDetach.map_0);
    $reset(rootPanels);
  }
}

function get_0(){
  $clinit_RootPanel();
  var rp;
  rp = castTo($get_2(rootPanels, null), 107);
  if (rp) {
    return rp;
  }
  if ($size(rootPanels) == 0) {
    addCloseHandler(new RootPanel$2);
    $clinit_LocaleInfo();
  }
  rp = new RootPanel$DefaultRootPanel;
  $put_1(rootPanels, null, rp);
  $add_7(widgetsToDetach, rp);
  return rp;
}

defineClass(107, 123, $intern_35);
var maybeDetachCommand, rootPanels, widgetsToDetach;
var Lcom_google_gwt_user_client_ui_RootPanel_2_classLit = createForClass('com.google.gwt.user.client.ui', 'RootPanel', 107);
function RootPanel$1(){
}

defineClass(400, 1, {}, RootPanel$1);
_.execute_2 = function execute_9(w){
  w.attached && w.onDetach();
}
;
var Lcom_google_gwt_user_client_ui_RootPanel$1_2_classLit = createForClass('com.google.gwt.user.client.ui', 'RootPanel/1', 400);
function RootPanel$2(){
}

defineClass(401, 1, $intern_33, RootPanel$2);
_.onClose = function onClose_0(closeEvent){
  detachWidgets();
}
;
var Lcom_google_gwt_user_client_ui_RootPanel$2_2_classLit = createForClass('com.google.gwt.user.client.ui', 'RootPanel/2', 401);
function RootPanel$DefaultRootPanel(){
  RootPanel.call(this, $doc.body);
}

defineClass(399, 107, $intern_35, RootPanel$DefaultRootPanel);
_.setWidgetPositionImpl = function setWidgetPositionImpl_0(w, left, top_0){
  left -= 0;
  top_0 -= 0;
  $setWidgetPositionImpl(w, left, top_0);
}
;
var Lcom_google_gwt_user_client_ui_RootPanel$DefaultRootPanel_2_classLit = createForClass('com.google.gwt.user.client.ui', 'RootPanel/DefaultRootPanel', 399);
function $getMaximumHorizontalScrollPosition(scrollable){
  return $isRtl(scrollable)?0:((scrollable.scrollWidth || 0) | 0) - (scrollable.clientWidth | 0);
}

function $getMinimumHorizontalScrollPosition(scrollable){
  return $isRtl(scrollable)?(scrollable.clientWidth | 0) - ((scrollable.scrollWidth || 0) | 0):0;
}

function $isRtl(scrollable){
  var computedStyle = $doc.defaultView.getComputedStyle(scrollable, null);
  return computedStyle.getPropertyValue('direction') == 'rtl';
}

function ScrollImpl(){
}

defineClass(127, 1, {}, ScrollImpl);
var impl_2;
var Lcom_google_gwt_user_client_ui_ScrollImpl_2_classLit = createForClass('com.google.gwt.user.client.ui', 'ScrollImpl', 127);
function $ensureVisible(this$static, item_0){
  var element, scroll_0;
  scroll_0 = ($clinit_DOM() , this$static.scrollableElem);
  element = item_0.element;
  $ensureVisibleImpl(scroll_0, element);
}

function $ensureVisibleImpl(scroll_0, e){
  if (!e)
    return;
  var item_0 = e;
  var realOffset = 0;
  while (item_0 && item_0 != scroll_0) {
    realOffset += item_0.offsetTop;
    item_0 = item_0.offsetParent;
  }
  scroll_0.scrollTop = realOffset - scroll_0.offsetHeight / 2;
}

function $getHorizontalScrollPosition(this$static){
  return $getScrollLeft_0(($clinit_DOM() , this$static.scrollableElem));
}

function $getMaximumHorizontalScrollPosition_0(this$static){
  return $getMaximumHorizontalScrollPosition((!impl_2 && (impl_2 = new ScrollImpl) , $clinit_DOM() , this$static.scrollableElem));
}

function $getMaximumVerticalScrollPosition(this$static){
  return ((($clinit_DOM() , this$static.scrollableElem).scrollHeight || 0) | 0) - (this$static.scrollableElem.clientHeight | 0);
}

function $getMinimumHorizontalScrollPosition_0(this$static){
  return $getMinimumHorizontalScrollPosition((!impl_2 && (impl_2 = new ScrollImpl) , $clinit_DOM() , this$static.scrollableElem));
}

function $getVerticalScrollPosition(this$static){
  return (($clinit_DOM() , this$static.scrollableElem).scrollTop || 0) | 0;
}

function $setHorizontalScrollPosition(this$static, position){
  $setScrollLeft(($clinit_DOM() , this$static.scrollableElem), position);
}

function $setTouchScrollingDisabled(this$static){
  var scroller, ua;
  if (this$static.touchScroller) {
    return false;
  }
  this$static.touchScroller = (scroller = (isSupported == null && (isSupported = ($clinit_Boolean() , !impl && (impl = new TouchEvent$TouchSupportDetector) , impl.isSupported && !(ua = navigator.userAgent.toLowerCase() , /android ([3-9]+)\.([0-9]+)/.exec(ua) != null)?true:false)) , $booleanValue(isSupported)?new TouchScroller:null) , !!scroller && $setTargetWidget(scroller, this$static) , scroller);
  return !this$static.touchScroller;
}

function $setVerticalScrollPosition(this$static, position){
  $setScrollTop(($clinit_DOM() , this$static.scrollableElem), position);
}

defineClass(406, 88, $intern_26);
_.getContainerElement = function getContainerElement_2(){
  return $clinit_DOM() , this.containerElem;
}
;
_.onAttach = function onAttach_1(){
  $onAttach(this);
  $clinit_DOM();
  this.scrollableElem.__listener = this;
}
;
_.onDetach = function onDetach_0(){
  $clinit_DOM();
  this.scrollableElem.__listener = null;
  $onDetach(this);
}
;
_.setHeight = function setHeight_1(height){
  ($clinit_DOM() , this.element).style['height'] = height;
}
;
_.setWidth = function setWidth_1(width_0){
  ($clinit_DOM() , this.element).style['width'] = width_0;
}
;
var Lcom_google_gwt_user_client_ui_ScrollPanel_2_classLit = createForClass('com.google.gwt.user.client.ui', 'ScrollPanel', 406);
function $next_0(this$static){
  if (!this$static.hasElement || !this$static.this$01.widget) {
    throw toJs(new NoSuchElementException);
  }
  this$static.hasElement = false;
  return this$static.returned = this$static.this$01.widget;
}

function SimplePanel$1(this$0){
  this.this$01 = this$0;
  this.hasElement = !!this.this$01.widget;
}

defineClass(153, 1, {}, SimplePanel$1);
_.next_1 = function next_1(){
  return $next_0(this);
}
;
_.hasNext_0 = function hasNext_0(){
  return this.hasElement;
}
;
_.remove_0 = function remove_7(){
  !!this.returned && this.this$01.remove(this.returned);
}
;
_.hasElement = false;
_.returned = null;
var Lcom_google_gwt_user_client_ui_SimplePanel$1_2_classLit = createForClass('com.google.gwt.user.client.ui', 'SimplePanel/1', 153);
function $addValueChangeHandler_0(this$static, handler){
  if (!this$static.valueChangeHandlerInitialized) {
    this$static.valueChangeHandlerInitialized = true;
    $addDomHandler(this$static, new ValueBoxBase$1(this$static), ($clinit_ChangeEvent() , $clinit_ChangeEvent() , TYPE));
  }
  return $addHandler_0(this$static, handler, (!TYPE_15 && (TYPE_15 = new GwtEvent$Type) , TYPE_15));
}

function $getText(this$static){
  return $getPropertyString(($clinit_DOM() , this$static.element), 'value');
}

function $getValueOrThrow(this$static){
  var parseResult, text_0;
  text_0 = $getPropertyString(($clinit_DOM() , this$static.element), 'value');
  parseResult = (checkCriticalNotNull(text_0) , text_0);
  if ($equals_1('', text_0)) {
    return null;
  }
  return parseResult;
}

function $setReadOnly(this$static){
  ($clinit_DOM() , this$static.element)['readOnly'] = true;
  $setStyleName_0(this$static, getStylePrimaryName(this$static.element) + '-' + 'readonly', true);
}

function $setText_0(this$static, text_0){
  ($clinit_DOM() , this$static.element)['value'] = text_0 != null?text_0:'';
}

function ValueBoxBase(elem){
  $clinit_FocusWidget();
  FocusWidget.call(this, elem);
  $clinit_LocaleInfo();
}

defineClass(321, 44, $intern_27);
_.onBrowserEvent = function onBrowserEvent_2(event_0){
  var type_0;
  type_0 = ($clinit_DOM() , $eventGetTypeInt(event_0.type));
  (type_0 & 896) != 0?$onBrowserEvent(this, event_0):$onBrowserEvent(this, event_0);
}
;
_.onLoad = function onLoad_1(){
}
;
_.valueChangeHandlerInitialized = false;
var Lcom_google_gwt_user_client_ui_ValueBoxBase_2_classLit = createForClass('com.google.gwt.user.client.ui', 'ValueBoxBase', 321);
function $clinit_TextBoxBase(){
  $clinit_TextBoxBase = emptyMethod;
  $clinit_FocusWidget();
  $clinit_ValueBoxBase$TextAlignment();
}

defineClass(327, 321, $intern_27);
var Lcom_google_gwt_user_client_ui_TextBoxBase_2_classLit = createForClass('com.google.gwt.user.client.ui', 'TextBoxBase', 327);
function TextBox(){
  var e;
  $clinit_TextBoxBase();
  TextBox_0.call(this, (e = $doc.createElement('INPUT') , e.type = 'text' , e));
}

function TextBox_0(element){
  var lastArg;
  ValueBoxBase.call(this, (lastArg = element , !INSTANCE_1 && (INSTANCE_1 = new PassthroughRenderer) , !INSTANCE_0 && (INSTANCE_0 = new PassthroughParser) , lastArg));
  ($clinit_DOM() , this.element).className = 'gwt-TextBox';
}

defineClass(161, 327, $intern_27, TextBox);
var Lcom_google_gwt_user_client_ui_TextBox_2_classLit = createForClass('com.google.gwt.user.client.ui', 'TextBox', 161);
function $collectElementChain(this$static, chain, hRoot, hElem){
  if (!hElem || hElem == hRoot) {
    return;
  }
  $collectElementChain(this$static, chain, hRoot, ($clinit_DOM() , $clinit_DOM() , $getParentElement(hElem)));
  push_1(chain.array, hElem);
}

function $elementClicked(this$static, hElem){
  var chain, item_0;
  chain = new ArrayList;
  $collectElementChain(this$static, chain, ($clinit_DOM() , this$static.element), hElem);
  item_0 = $findItemByChain(this$static, chain, 0, this$static.root);
  if (!!item_0 && item_0 != this$static.root) {
    if ($getChildCount(item_0) > 0 && $isOrHasChild($getFirstChildElement((!!item_0.imageHolder || $convertToFullNode(item_0) , item_0.imageHolder)), hElem)) {
      $setState_0(item_0, !item_0.open_0);
      return true;
    }
     else if ($isOrHasChild(item_0.element, hElem)) {
      $onSelection(this$static, item_0, !shouldTreeDelegateFocusToElement(hElem));
      return true;
    }
  }
  return false;
}

function $findDeepestOpenChild(this$static, item_0){
  if (!item_0.open_0) {
    return item_0;
  }
  return $findDeepestOpenChild(this$static, $getChild_1(item_0, $getChildCount(item_0) - 1));
}

function $findItemByChain(this$static, chain, idx, root){
  var child, hCurElem, i, n, retItem;
  if (idx == chain.array.length) {
    return root;
  }
  hCurElem = (checkCriticalElementIndex(idx, chain.array.length) , castToJso(chain.array[idx]));
  for (i = 0 , n = $getChildCount(root); i < n; ++i) {
    child = $getChild_1(root, i);
    $clinit_DOM();
    if (child.element == hCurElem) {
      retItem = $findItemByChain(this$static, chain, idx + 1, $getChild_1(root, i));
      if (!retItem) {
        return child;
      }
      return retItem;
    }
  }
  return $findItemByChain(this$static, chain, idx + 1, root);
}

function $fireStateChanged(this$static, open_0){
  open_0?undefined:fire_1(this$static, false);
}

function $getTopClosedParent(this$static, item_0){
  var parent_0, topClosedParent;
  topClosedParent = null;
  parent_0 = item_0.parent_0;
  while (!!parent_0 && parent_0 != this$static.root) {
    parent_0.open_0 || (topClosedParent = parent_0);
    parent_0 = parent_0.parent_0;
  }
  return topClosedParent;
}

function $init_0(this$static, images){
  $setImages(this$static, images, false);
  $setElement_0(this$static, ($clinit_DOM() , $doc.createElement('div')));
  this$static.element.style['position'] = 'relative';
  this$static.element.style['zoom'] = '1';
  this$static.focusable_0 = ($clinit_FocusPanel() , createFocusable0(($clinit_FocusImpl() , focusHandler_0)?focusHandler_0:(focusHandler_0 = $createFocusHandler())));
  this$static.focusable_0.style['fontSize'] = '0';
  this$static.focusable_0.style['position'] = 'absolute';
  this$static.focusable_0.style['outline'] = '0px';
  this$static.focusable_0.setAttribute('hideFocus', 'true');
  setIntStyleAttribute(this$static.focusable_0, 'zIndex', -1);
  $appendChild(this$static.element, resolve(this$static.focusable_0));
  this$static.eventsToSink == -1?sinkEvents(this$static.element, 901 | (this$static.element.__eventBits || 0)):(this$static.eventsToSink |= 901);
  sinkEvents(this$static.focusable_0, 6144);
  this$static.root = new TreeItem_0(true);
  $setTree(this$static.root, this$static);
  this$static.element.className = 'gwt-Tree';
  $clinit_Roles();
  $set(TREE, this$static.focusable_0);
}

function $keyboardNavigation(this$static, event_0){
  var code_0, topClosedParent;
  code_0 = event_0.keyCode | 0;
  switch (maybeSwapArrowKeysForRtl(code_0, ($clinit_LocaleInfo() , false))) {
    case 38:
      {
        $moveSelectionUp(this$static, this$static.curSelection);
        break;
      }

    case 40:
      {
        $moveSelectionDown(this$static, this$static.curSelection, true);
        break;
      }

    case 37:
      {
        $maybeCollapseTreeItem(this$static);
        break;
      }

    case 39:
      {
        topClosedParent = $getTopClosedParent(this$static, this$static.curSelection);
        topClosedParent?$setSelectedItem(this$static, topClosedParent):this$static.curSelection.open_0?$getChildCount(this$static.curSelection) > 0 && $setSelectedItem(this$static, $getChild_1(this$static.curSelection, 0)):$setState_0(this$static.curSelection, true);
        break;
      }

    default:{
        return;
      }

  }
}

function $maybeCollapseTreeItem(this$static){
  var parent_0, topClosedParent;
  topClosedParent = $getTopClosedParent(this$static, this$static.curSelection);
  if (topClosedParent) {
    $setSelectedItem(this$static, topClosedParent);
  }
   else if (this$static.curSelection.open_0) {
    $setState_0(this$static.curSelection, false);
  }
   else {
    parent_0 = this$static.curSelection.parent_0;
    !!parent_0 && $setSelectedItem(this$static, parent_0);
  }
}

function $maybeUpdateSelection(this$static, itemThatChangedState, isItemOpening){
  var tempItem;
  if (!isItemOpening) {
    tempItem = this$static.curSelection;
    while (tempItem) {
      if (tempItem == itemThatChangedState) {
        $setSelectedItem(this$static, itemThatChangedState);
        return;
      }
      tempItem = tempItem.parent_0;
    }
  }
}

function $moveFocus(this$static){
  var containerLeft, containerTop, height, left, selectedElem, top_0, width_0;
  if (this$static.scrollOnSelectEnabled) {
    selectedElem = this$static.curSelection.contentElem;
    containerLeft = $getAbsoluteLeft(($clinit_DOM() , this$static.element));
    containerTop = $getAbsoluteTop(this$static.element);
    left = $getAbsoluteLeft(selectedElem) - containerLeft;
    top_0 = $getAbsoluteTop(selectedElem) - containerTop;
    width_0 = parseInt(selectedElem['offsetWidth']) | 0;
    height = parseInt(selectedElem['offsetHeight']) | 0;
    if (width_0 == 0 || height == 0) {
      setIntStyleAttribute(this$static.focusable_0, 'left', 0);
      setIntStyleAttribute(this$static.focusable_0, 'top', 0);
      return;
    }
    this$static.focusable_0.style['left'] = left + 'px';
    this$static.focusable_0.style['top'] = top_0 + 'px';
    this$static.focusable_0.style['width'] = width_0 + 'px';
    this$static.focusable_0.style['height'] = height + 'px';
    $scrollIntoView(this$static.focusable_0);
  }
  $updateAriaAttributes(this$static);
  $focus(($clinit_FocusPanel() , impl_1 , this$static.focusable_0));
}

function $moveSelectionDown(this$static, sel, dig){
  var idx, parent_0, topClosedParent;
  if (sel == this$static.root) {
    return;
  }
  topClosedParent = $getTopClosedParent(this$static, sel);
  if (topClosedParent) {
    $moveSelectionDown(this$static, topClosedParent, false);
    return;
  }
  parent_0 = sel.parent_0;
  !parent_0 && (parent_0 = this$static.root);
  idx = $getChildIndex(parent_0, sel);
  !dig || !sel.open_0?idx < $getChildCount(parent_0) - 1?$onSelection(this$static, $getChild_1(parent_0, idx + 1), true):$moveSelectionDown(this$static, parent_0, false):$getChildCount(sel) > 0 && $onSelection(this$static, $getChild_1(sel, 0), true);
}

function $moveSelectionUp(this$static, sel){
  var idx, parent_0, sibling, topClosedParent;
  topClosedParent = $getTopClosedParent(this$static, sel);
  if (topClosedParent) {
    $onSelection(this$static, topClosedParent, true);
    return;
  }
  parent_0 = sel.parent_0;
  !parent_0 && (parent_0 = this$static.root);
  idx = $getChildIndex(parent_0, sel);
  if (idx > 0) {
    sibling = $getChild_1(parent_0, idx - 1);
    $onSelection(this$static, $findDeepestOpenChild(this$static, sibling), true);
  }
   else {
    $onSelection(this$static, parent_0, true);
  }
}

function $onSelection(this$static, item_0, moveFocus){
  if (item_0 == this$static.root) {
    return;
  }
  !!this$static.curSelection && $setSelected(this$static.curSelection, false);
  this$static.curSelection = item_0;
  if (this$static.curSelection) {
    moveFocus && $moveFocus(this$static);
    $setSelected(this$static.curSelection, true);
  }
}

function $remove_4(this$static, w){
  var item_0;
  item_0 = castTo($get_2(this$static.childWidgets, w), 30);
  if (!item_0) {
    return false;
  }
  item_0.contentElem.innerHTML = '';
  return true;
}

function $removeItem(this$static, item_0){
  $removeItem_0(this$static.root, item_0);
}

function $setImages(this$static, images, useLeafImages){
  var image, size_0;
  this$static.images = images;
  this$static.useLeafImages = useLeafImages;
  if (!useLeafImages) {
    image = $createImage(images.treeLeaf);
    ($clinit_DOM() , image.element).style['visibility'] = 'hidden';
    $add_0(($clinit_RootPanel() , get_0()), image);
    size_0 = image.state.getWidth(image) + 7;
    $removeFromParent(image);
    this$static.indentValue = size_0 + 'px';
  }
}

function $setSelectedItem(this$static, item_0){
  if (!item_0) {
    if (!this$static.curSelection) {
      return;
    }
    $setSelected(this$static.curSelection, false);
    this$static.curSelection = null;
    return;
  }
  $onSelection(this$static, item_0, true);
}

function $showClosedImage(this$static, treeItem){
  $showImage(treeItem, this$static.images.treeClosed);
}

function $showImage(treeItem, proto){
  var child, holder;
  holder = (!!treeItem.imageHolder || $convertToFullNode(treeItem) , treeItem.imageHolder);
  child = ($clinit_DOM() , $getFirstChildElement(holder));
  !child?$appendChild(holder, resolve($createStructure(proto.url_0, proto.left_0, proto.top_0, proto.width_0, proto.height_0))):($adjust(child, proto.url_0, proto.left_0, proto.top_0, proto.width_0, proto.height_0) , undefined);
}

function $showLeafImage(this$static, treeItem){
  this$static.useLeafImages || !!treeItem.imageHolder?$showImage(treeItem, this$static.images.treeLeaf):($clinit_LocaleInfo() , ($clinit_DOM() , treeItem.element).style['paddingLeft'] = this$static.indentValue , undefined);
}

function $showOpenImage(this$static, treeItem){
  $showImage(treeItem, this$static.images.treeOpen);
}

function $updateAriaAttributes(this$static){
  var curSelectionContentElem, curSelectionIndex, curSelectionLevel, curSelectionParent, tempItem;
  curSelectionContentElem = this$static.curSelection.contentElem;
  curSelectionLevel = -1;
  tempItem = this$static.curSelection;
  while (tempItem) {
    tempItem = tempItem.parent_0;
    ++curSelectionLevel;
  }
  $clinit_Roles();
  $set_0(($clinit_Property() , LEVEL), curSelectionContentElem, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_Integer_2_classLit, 1), $intern_1, 40, 0, [valueOf_0(curSelectionLevel + 1)]));
  curSelectionParent = this$static.curSelection.parent_0;
  !curSelectionParent && (curSelectionParent = this$static.root);
  $setAriaSetsizeProperty(curSelectionContentElem, $getChildCount(curSelectionParent));
  curSelectionIndex = $getChildIndex(curSelectionParent, this$static.curSelection);
  $set_0(POSINSET, curSelectionContentElem, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_Integer_2_classLit, 1), $intern_1, 40, 0, [valueOf_0(curSelectionIndex + 1)]));
  $getChildCount(this$static.curSelection) == 0?$remove(($clinit_State() , EXPANDED), curSelectionContentElem):$setAriaExpandedState(curSelectionContentElem, ($clinit_ExpandedValue() , this$static.curSelection.open_0?TRUE:FALSE));
  $setAriaSelectedState(curSelectionContentElem, ($clinit_SelectedValue() , $clinit_SelectedValue() , TRUE_0));
  $setAriaActivedescendantProperty(this$static.focusable_0, new Id(curSelectionContentElem));
}

function Tree(){
  this.childWidgets = new HashMap;
  $init_0(this, new Tree$ImageAdapter);
}

function shouldTreeDelegateFocusToElement(elem){
  var name_0 = elem.nodeName;
  return name_0 == 'SELECT' || name_0 == 'INPUT' || name_0 == 'TEXTAREA' || name_0 == 'OPTION' || name_0 == 'BUTTON' || name_0 == 'LABEL';
}

defineClass(311, 6, $intern_30, Tree);
_.doAttachChildren = function doAttachChildren_3(){
  try {
    tryCommand(this, ($clinit_AttachDetachException() , attachCommand));
  }
   finally {
    $clinit_DOM();
    this.focusable_0.__listener = this;
  }
}
;
_.doDetachChildren = function doDetachChildren_3(){
  try {
    tryCommand(this, ($clinit_AttachDetachException() , detachCommand));
  }
   finally {
    $clinit_DOM();
    this.focusable_0.__listener = null;
  }
}
;
_.iterator = function iterator_3(){
  var widgets;
  widgets = initUnidimensionalArray(Lcom_google_gwt_user_client_ui_Widget_2_classLit, $intern_1, 6, $size(this.childWidgets), 0, 1);
  $toArray_0(new AbstractMap$1(this.childWidgets), widgets);
  return new WidgetIterators$1(widgets, this);
}
;
_.onBrowserEvent = function onBrowserEvent_3(event_0){
  var chain, e, eventType, item_0;
  eventType = ($clinit_DOM() , $eventGetTypeInt(event_0.type));
  switch (eventType) {
    case 128:
      {
        if (!this.curSelection) {
          $getChildCount(this.root) > 0 && $onSelection(this, $getChild_1(this.root, 0), true);
          $onBrowserEvent(this, event_0);
          return;
        }
      }

    case 256:
    case 512:
      if (!!event_0.altKey || !!event_0.metaKey) {
        $onBrowserEvent(this, event_0);
        return;
      }

  }
  switch (eventType) {
    case 1:
      {
        e = $eventGetTarget(event_0);
        if (shouldTreeDelegateFocusToElement(e))
        ;
        else 
          !!this.curSelection && $isOrHasChild(this.curSelection.contentElem, e) && $focus(($clinit_FocusPanel() , impl_1 , this.focusable_0));
        break;
      }

    case 4:
      {
        (event_0.currentTarget || $wnd) == this.element && $eventGetButton(event_0) == 1 && $elementClicked(this, $eventGetTarget(event_0));
        break;
      }

    case 128:
      {
        $keyboardNavigation(this, event_0);
        this.lastWasKeyDown = true;
        break;
      }

    case 256:
      {
        this.lastWasKeyDown || $keyboardNavigation(this, event_0);
        this.lastWasKeyDown = false;
        break;
      }

    case 512:
      {
        if ((event_0.keyCode | 0) == 9) {
          chain = new ArrayList;
          $collectElementChain(this, chain, this.element, $eventGetTarget(event_0));
          item_0 = $findItemByChain(this, chain, 0, this.root);
          item_0 != this.curSelection && $setSelectedItem(this, item_0);
        }
        this.lastWasKeyDown = false;
        break;
      }

  }
  switch (eventType) {
    case 128:
    case 512:
      {
        if (isArrowKey(event_0.keyCode | 0)) {
          event_0.stopPropagation();
          event_0.preventDefault();
          return;
        }
      }

  }
  $onBrowserEvent(this, event_0);
}
;
_.onLoad = function onLoad_2(){
  $updateStateRecursive(this.root);
}
;
_.lastWasKeyDown = false;
_.scrollOnSelectEnabled = true;
_.useLeafImages = false;
var Lcom_google_gwt_user_client_ui_Tree_2_classLit = createForClass('com.google.gwt.user.client.ui', 'Tree', 311);
function Tree$ImageAdapter(){
  this.treeClosed = create_1(($clinit_Tree_Resources_default_InlineClientBundleGenerator$treeClosedInitializer() , treeClosed));
  this.treeLeaf = create_1(($clinit_Tree_Resources_default_InlineClientBundleGenerator$treeLeafInitializer() , treeLeaf));
  this.treeOpen = create_1(($clinit_Tree_Resources_default_InlineClientBundleGenerator$treeOpenInitializer() , treeOpen));
}

defineClass(158, 1, {}, Tree$ImageAdapter);
var Lcom_google_gwt_user_client_ui_Tree$ImageAdapter_2_classLit = createForClass('com.google.gwt.user.client.ui', 'Tree/ImageAdapter', 158);
function $clinit_TreeItem(){
  $clinit_TreeItem = emptyMethod;
  itemAnimation = new TreeItem$TreeItemAnimation;
  new TreeItem$TreeItemImpl;
}

function $addItem(this$static, item_0){
  (!!item_0.parent_0 || !!item_0.tree) && (item_0.parent_0?$removeItem_0(item_0.parent_0, item_0):!!item_0.tree && $removeItem(item_0.tree, item_0));
  $insertItem_0(this$static, $getChildCount(this$static), item_0);
}

function $getChild_1(this$static, index_0){
  if (index_0 < 0 || index_0 >= $getChildCount(this$static)) {
    return null;
  }
  return castTo($get_3(this$static.children, index_0), 30);
}

function $getChildCount(this$static){
  if (!this$static.children) {
    return 0;
  }
  return this$static.children.array.length;
}

function $getChildIndex(this$static, child){
  if (!this$static.children) {
    return -1;
  }
  return $indexOf_1(this$static.children, child, 0);
}

function $initChildren(this$static){
  $convertToFullNode(this$static);
  this$static.childSpanElem = ($clinit_DOM() , $doc.createElement('div'));
  $appendChild(this$static.element, resolve(this$static.childSpanElem));
  this$static.childSpanElem.style['whiteSpace'] = 'nowrap';
  this$static.children = new ArrayList;
}

function $insertItem_0(this$static, beforeIndex, item_0){
  var beforeElem, childContainer, childCount, margin;
  (!!item_0.parent_0 || !!item_0.tree) && (item_0.parent_0?$removeItem_0(item_0.parent_0, item_0):!!item_0.tree && $removeItem(item_0.tree, item_0));
  childCount = $getChildCount(this$static);
  if (beforeIndex < 0 || beforeIndex > childCount) {
    throw toJs(new IndexOutOfBoundsException);
  }
  !this$static.children && $initChildren(this$static);
  margin = this$static.isRoot?0:16;
  $clinit_LocaleInfo();
  ($clinit_DOM() , item_0.element).style['marginLeft'] = margin + ($clinit_Style$Unit() , 'px');
  childContainer = this$static.isRoot?$getElement(this$static.tree):this$static.childSpanElem;
  if (beforeIndex == childCount) {
    $appendChild(childContainer, item_0.element);
  }
   else {
    beforeElem = $getElement($getChild_1(this$static, beforeIndex));
    $insertBefore(childContainer, item_0.element, beforeElem);
  }
  $setParentItem(item_0, this$static.isRoot?null:this$static);
  $add_5(this$static.children, beforeIndex, item_0);
  $setTree(item_0, this$static.tree);
  !this$static.isRoot && this$static.children.array.length == 1 && $updateState_0(this$static, false, false);
}

function $removeItem_0(this$static, item_0){
  var oldTree;
  if (!this$static.children || $indexOf_1(this$static.children, item_0, 0) == -1) {
    return;
  }
  oldTree = this$static.tree;
  $setTree(item_0, null);
  this$static.isRoot?$removeChild(($clinit_DOM() , oldTree.element), item_0.element):$removeChild(this$static.childSpanElem, ($clinit_DOM() , item_0.element));
  item_0.parent_0 = null;
  $remove_12(this$static.children, item_0);
  !this$static.isRoot && this$static.children.array.length == 0 && $updateState_0(this$static, false, false);
}

function $setParentItem(this$static, parent_0){
  this$static.parent_0 = parent_0;
}

function $setSelected(this$static, selected){
  if (this$static.selected == selected) {
    return;
  }
  this$static.selected = selected;
  setStyleName(this$static.contentElem, 'gwt-TreeItem-selected', selected);
}

function $setState_0(this$static, open_0){
  if (open_0 && $getChildCount(this$static) == 0) {
    return;
  }
  if (this$static.open_0 != open_0) {
    this$static.open_0 = open_0;
    $updateState_0(this$static, true, true);
    !!this$static.tree && $fireStateChanged(this$static.tree, open_0);
  }
}

function $setText_1(this$static, text_0){
  this$static.contentElem.innerHTML = '';
  $setInnerText(this$static.contentElem, text_0);
}

function $setTree(this$static, newTree){
  var i, n;
  if (this$static.tree == newTree) {
    return;
  }
  !!this$static.tree && this$static.tree.curSelection == this$static && $setSelectedItem(this$static.tree, null);
  this$static.tree = newTree;
  for (i = 0 , n = $getChildCount(this$static); i < n; ++i) {
    $setTree(castTo($get_3(this$static.children, i), 30), newTree);
  }
  $updateState_0(this$static, false, true);
}

function $updateState_0(this$static, animate, updateTreeSelection){
  if (!this$static.tree || !this$static.tree.attached) {
    return;
  }
  if ($getChildCount(this$static) == 0) {
    !!this$static.childSpanElem && setVisible(this$static.childSpanElem, false);
    $showLeafImage(this$static.tree, this$static);
    return;
  }
  animate && !!this$static.tree && this$static.tree.attached?$setItemState(itemAnimation, this$static):$setItemState(itemAnimation, this$static);
  this$static.open_0?$showOpenImage(this$static.tree, this$static):$showClosedImage(this$static.tree, this$static);
  updateTreeSelection && $maybeUpdateSelection(this$static.tree, this$static, this$static.open_0);
}

function $updateStateRecursive(this$static){
  $updateStateRecursiveHelper(this$static);
  $maybeUpdateSelection(this$static.tree, this$static, this$static.open_0);
}

function $updateStateRecursiveHelper(this$static){
  var i, n;
  $updateState_0(this$static, false, false);
  for (i = 0 , n = $getChildCount(this$static); i < n; ++i) {
    $updateStateRecursiveHelper(castTo($get_3(this$static.children, i), 30));
  }
}

function TreeItem(){
  $clinit_TreeItem();
  TreeItem_0.call(this, false);
}

function TreeItem_0(isRoot){
  $clinit_TreeItem();
  var elem;
  this.isRoot = isRoot;
  elem = ($clinit_DOM() , BASE_BARE_ELEM.cloneNode(true));
  $setElement_0(this, elem);
  this.contentElem = $getFirstChildElement(elem);
  $setAttribute(this.contentElem, 'id', $createUniqueId($doc));
  isRoot && $initChildren(this);
}

defineClass(30, 9, {11:1, 30:1, 9:1}, TreeItem, TreeItem_0);
_.isRoot = false;
_.open_0 = false;
_.selected = false;
var BASE_BARE_ELEM, BASE_INTERNAL_ELEM, itemAnimation;
var Lcom_google_gwt_user_client_ui_TreeItem_2_classLit = createForClass('com.google.gwt.user.client.ui', 'TreeItem', 30);
function $onUpdate_0(this$static, progress){
  var height, scrollWidth;
  height = round_int(progress * this$static.scrollHeight_0);
  this$static.opening || (height = this$static.scrollHeight_0 - height);
  height = $wnd.Math.max(height, 1);
  this$static.curItem.childSpanElem.style['height'] = height + 'px';
  scrollWidth = $getPropertyInt(this$static.curItem.childSpanElem, 'scrollWidth');
  this$static.curItem.childSpanElem.style['width'] = scrollWidth + 'px';
}

function $setItemState(this$static, item_0){
  $cancel(this$static);
  setVisible(item_0.childSpanElem, item_0.open_0);
}

function TreeItem$TreeItemAnimation(){
  Animation_0.call(this);
}

defineClass(319, 119, {}, TreeItem$TreeItemAnimation);
_.onComplete = function onComplete_1(){
  if (this.curItem) {
    if (this.opening) {
      setVisible(this.curItem.childSpanElem, true);
      $onUpdate_0(this, 1);
      this.curItem.childSpanElem.style['height'] = 'auto';
    }
     else {
      setVisible(this.curItem.childSpanElem, false);
    }
    this.curItem.childSpanElem.style['overflow'] = 'visible';
    this.curItem.childSpanElem.style['width'] = 'auto';
    this.curItem = null;
  }
}
;
_.onStart = function onStart_1(){
  this.scrollHeight_0 = 0;
  this.opening || (this.scrollHeight_0 = (this.curItem.childSpanElem.scrollHeight || 0) | 0);
  this.curItem.childSpanElem.style['overflow'] = 'hidden';
  $onUpdate_0(this, (1 + $wnd.Math.cos($intern_0)) / 2);
  if (this.opening) {
    setVisible(this.curItem.childSpanElem, true);
    this.scrollHeight_0 = (this.curItem.childSpanElem.scrollHeight || 0) | 0;
  }
}
;
_.onUpdate = function onUpdate_0(progress){
  $onUpdate_0(this, progress);
}
;
_.curItem = null;
_.opening = true;
_.scrollHeight_0 = 0;
var Lcom_google_gwt_user_client_ui_TreeItem$TreeItemAnimation_2_classLit = createForClass('com.google.gwt.user.client.ui', 'TreeItem/TreeItemAnimation', 319);
function $convertToFullNode(item_0){
  var itemTable, tdContent, tdImg, tr;
  if (!item_0.imageHolder) {
    itemTable = ($clinit_DOM() , ($clinit_TreeItem() , BASE_INTERNAL_ELEM).cloneNode(true));
    $appendChild(item_0.element, resolve(itemTable));
    tr = $getFirstChildElement($getFirstChildElement(itemTable));
    tdImg = $getFirstChildElement(tr);
    tdContent = tdImg.nextSibling;
    item_0.element.style['padding'] = '0px';
    $appendChild(tdContent, resolve(item_0.contentElem));
    item_0.imageHolder = tdImg;
  }
}

function $initializeClonableElements(){
  var contentElem, tbody, tdContent, tdImg, tr;
  $clinit_TreeItem();
  BASE_INTERNAL_ELEM = ($clinit_DOM() , $doc.createElement('table'));
  contentElem = $doc.createElement('div');
  tbody = $doc.createElement('tbody');
  tr = $doc.createElement('tr');
  tdImg = $doc.createElement('td');
  tdContent = $doc.createElement('td');
  $appendChild(BASE_INTERNAL_ELEM, resolve(tbody));
  $appendChild(tbody, resolve(tr));
  $appendChild(tr, resolve(tdImg));
  $appendChild(tr, resolve(tdContent));
  tdImg.style['verticalAlign'] = 'middle';
  tdContent.style['verticalAlign'] = 'middle';
  $appendChild(tdContent, resolve(contentElem));
  contentElem.style['display'] = 'inline';
  contentElem.className = 'gwt-TreeItem';
  BASE_INTERNAL_ELEM.style['whiteSpace'] = 'nowrap';
  BASE_BARE_ELEM = $doc.createElement('div');
  BASE_BARE_ELEM.style['padding'] = '3px';
  $appendChild(BASE_BARE_ELEM, resolve(contentElem));
  $clinit_Roles();
  $set(TREEITEM, contentElem);
}

function TreeItem$TreeItemImpl(){
  $initializeClonableElements();
}

defineClass(318, 1, {}, TreeItem$TreeItemImpl);
var Lcom_google_gwt_user_client_ui_TreeItem$TreeItemImpl_2_classLit = createForClass('com.google.gwt.user.client.ui', 'TreeItem/TreeItemImpl', 318);
var treeClosed, treeLeaf, treeOpen;
function $clinit_Tree_Resources_default_InlineClientBundleGenerator$treeClosedInitializer(){
  $clinit_Tree_Resources_default_InlineClientBundleGenerator$treeClosedInitializer = emptyMethod;
  treeClosed = new ImageResourcePrototype(($clinit_UriUtils() , new SafeUriString('data:image/gif;base64,R0lGODlhEAAQAIQaAFhorldnrquz1mFxsvz9/vr6/M3Q2ZGbw5mixvb3+Gp5t2Nys77F4GRzs9ze4mt6uGV1s8/R2VZnrl5usFdortPV2/P09+3u8eXm6lZnrf///wAAzP///////////////yH5BAEAAB8ALAAAAAAQABAAAAVE4CeOZGmeaKquo5K974MuTKHdhDCcgOVvvoTkRLkYN8bL0ETBbJ5PTIaIqW6q0lPAYcVOTRNEpEI2HCYoCOzVYLnf7hAAOw==')));
}

function $clinit_Tree_Resources_default_InlineClientBundleGenerator$treeLeafInitializer(){
  $clinit_Tree_Resources_default_InlineClientBundleGenerator$treeLeafInitializer = emptyMethod;
  treeLeaf = new ImageResourcePrototype(($clinit_UriUtils() , new SafeUriString('data:image/gif;base64,R0lGODlhEAAQAJEAAP///wAAAP///wAAACH5BAEAAAIALAAAAAAQABAAAAIOlI+py+0Po5y02ouzPgUAOw==')));
}

function $clinit_Tree_Resources_default_InlineClientBundleGenerator$treeOpenInitializer(){
  $clinit_Tree_Resources_default_InlineClientBundleGenerator$treeOpenInitializer = emptyMethod;
  treeOpen = new ImageResourcePrototype(($clinit_UriUtils() , new SafeUriString('data:image/gif;base64,R0lGODlhEAAQAIQaAFhorldnrquz1mFxsvz9/vr6/M3Q2ZGbw5mixvb3+Gp5t2Nys77F4GRzs9ze4mt6uGV1s8/R2VZnrl5usFdortPV2/P09+3u8eXm6lZnrf///wAAzP///////////////yH5BAEAAB8ALAAAAAAQABAAAAVD4CeOZGmeaKquo5K974MuTKHdhDCcgOVfvoTkRLkYj5ehiYLZOJ2YDBFDvVCjp4CjepWaJohIZWw4TFAQ2KvBarvbIQA7')));
}

function ValueBoxBase$1(this$0){
  this.this$01 = this$0;
}

defineClass(326, 1, $intern_31, ValueBoxBase$1);
_.onChange = function onChange_0(event_0){
  var lastArg;
  fire_3((lastArg = this.this$01 , $getValueOrThrow(this.this$01) , lastArg));
}
;
var Lcom_google_gwt_user_client_ui_ValueBoxBase$1_2_classLit = createForClass('com.google.gwt.user.client.ui', 'ValueBoxBase/1', 326);
function $clinit_ValueBoxBase$TextAlignment(){
  $clinit_ValueBoxBase$TextAlignment = emptyMethod;
  CENTER_0 = new ValueBoxBase$TextAlignment$1;
  JUSTIFY_0 = new ValueBoxBase$TextAlignment$2;
  LEFT_0 = new ValueBoxBase$TextAlignment$3;
  RIGHT_0 = new ValueBoxBase$TextAlignment$4;
}

function ValueBoxBase$TextAlignment(enum$name, enum$ordinal){
  Enum.call(this, enum$name, enum$ordinal);
}

function values_10(){
  $clinit_ValueBoxBase$TextAlignment();
  return stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_user_client_ui_ValueBoxBase$TextAlignment_2_classLit, 1), $intern_1, 53, 0, [CENTER_0, JUSTIFY_0, LEFT_0, RIGHT_0]);
}

defineClass(53, 4, $intern_36);
var CENTER_0, JUSTIFY_0, LEFT_0, RIGHT_0;
var Lcom_google_gwt_user_client_ui_ValueBoxBase$TextAlignment_2_classLit = createForEnum('com.google.gwt.user.client.ui', 'ValueBoxBase/TextAlignment', 53, values_10);
function ValueBoxBase$TextAlignment$1(){
  ValueBoxBase$TextAlignment.call(this, 'CENTER', 0);
}

defineClass(322, 53, $intern_36, ValueBoxBase$TextAlignment$1);
var Lcom_google_gwt_user_client_ui_ValueBoxBase$TextAlignment$1_2_classLit = createForEnum('com.google.gwt.user.client.ui', 'ValueBoxBase/TextAlignment/1', 322, null);
function ValueBoxBase$TextAlignment$2(){
  ValueBoxBase$TextAlignment.call(this, 'JUSTIFY', 1);
}

defineClass(323, 53, $intern_36, ValueBoxBase$TextAlignment$2);
var Lcom_google_gwt_user_client_ui_ValueBoxBase$TextAlignment$2_2_classLit = createForEnum('com.google.gwt.user.client.ui', 'ValueBoxBase/TextAlignment/2', 323, null);
function ValueBoxBase$TextAlignment$3(){
  ValueBoxBase$TextAlignment.call(this, 'LEFT', 2);
}

defineClass(324, 53, $intern_36, ValueBoxBase$TextAlignment$3);
var Lcom_google_gwt_user_client_ui_ValueBoxBase$TextAlignment$3_2_classLit = createForEnum('com.google.gwt.user.client.ui', 'ValueBoxBase/TextAlignment/3', 324, null);
function ValueBoxBase$TextAlignment$4(){
  ValueBoxBase$TextAlignment.call(this, 'RIGHT', 3);
}

defineClass(325, 53, $intern_36, ValueBoxBase$TextAlignment$4);
var Lcom_google_gwt_user_client_ui_ValueBoxBase$TextAlignment$4_2_classLit = createForEnum('com.google.gwt.user.client.ui', 'ValueBoxBase/TextAlignment/4', 325, null);
function $add_3(this$static, w){
  var td, tr, td_0;
  tr = ($clinit_DOM() , $doc.createElement('tr'));
  td = (td_0 = $doc.createElement('td') , $setCellHorizontalAlignment(td_0, this$static.horzAlign) , $setCellVerticalAlignment(td_0, this$static.vertAlign) , td_0);
  $appendChild(tr, resolve(td));
  $appendChild(this$static.body_0, resolve(tr));
  $add(this$static, w, td);
}

defineClass(291, 155, $intern_26);
_.remove = function remove_8(w){
  var removed, td;
  td = ($clinit_DOM() , $getParentElement(w.element));
  removed = $remove_0(this, w);
  removed && $removeChild(this.body_0, $getParentElement(td));
  return removed;
}
;
var Lcom_google_gwt_user_client_ui_VerticalPanel_2_classLit = createForClass('com.google.gwt.user.client.ui', 'VerticalPanel', 291);
function $add_4(this$static, w){
  $insert_0(this$static, w, this$static.size_0);
}

function $indexOf(this$static, w){
  var i;
  for (i = 0; i < this$static.size_0; ++i) {
    if (this$static.array[i] == w) {
      return i;
    }
  }
  return -1;
}

function $insert_0(this$static, w, beforeIndex){
  var i, i0, newArray;
  if (beforeIndex < 0 || beforeIndex > this$static.size_0) {
    throw toJs(new IndexOutOfBoundsException);
  }
  if (this$static.size_0 == this$static.array.length) {
    newArray = initUnidimensionalArray(Lcom_google_gwt_user_client_ui_Widget_2_classLit, $intern_1, 6, this$static.array.length * 2, 0, 1);
    for (i0 = 0; i0 < this$static.array.length; ++i0) {
      newArray[i0] = this$static.array[i0];
    }
    this$static.array = newArray;
  }
  ++this$static.size_0;
  for (i = this$static.size_0 - 1; i > beforeIndex; --i) {
    this$static.array[i] = this$static.array[i - 1];
  }
  this$static.array[beforeIndex] = w;
}

function $remove_5(this$static, index_0){
  var i;
  if (index_0 < 0 || index_0 >= this$static.size_0) {
    throw toJs(new IndexOutOfBoundsException);
  }
  --this$static.size_0;
  for (i = index_0; i < this$static.size_0; ++i) {
    this$static.array[i] = this$static.array[i + 1];
  }
  this$static.array[this$static.size_0] = null;
}

function $remove_6(this$static, w){
  var index_0;
  index_0 = $indexOf(this$static, w);
  if (index_0 == -1) {
    throw toJs(new NoSuchElementException);
  }
  $remove_5(this$static, index_0);
}

function WidgetCollection(parent_0){
  this.parent_0 = parent_0;
  this.array = initUnidimensionalArray(Lcom_google_gwt_user_client_ui_Widget_2_classLit, $intern_1, 6, 4, 0, 1);
}

defineClass(335, 1, {}, WidgetCollection);
_.iterator = function iterator_4(){
  return new WidgetCollection$WidgetIterator(this);
}
;
_.size_0 = 0;
var Lcom_google_gwt_user_client_ui_WidgetCollection_2_classLit = createForClass('com.google.gwt.user.client.ui', 'WidgetCollection', 335);
function $next_1(this$static){
  if (this$static.index_0 >= this$static.this$01.size_0) {
    throw toJs(new NoSuchElementException);
  }
  this$static.currentWidget = this$static.this$01.array[this$static.index_0];
  ++this$static.index_0;
  return this$static.currentWidget;
}

function $remove_7(this$static){
  if (!this$static.currentWidget) {
    throw toJs(new IllegalStateException);
  }
  this$static.this$01.parent_0.remove(this$static.currentWidget);
  --this$static.index_0;
  this$static.currentWidget = null;
}

function WidgetCollection$WidgetIterator(this$0){
  this.this$01 = this$0;
}

defineClass(122, 1, {}, WidgetCollection$WidgetIterator);
_.next_1 = function next_2(){
  return $next_1(this);
}
;
_.hasNext_0 = function hasNext_1(){
  return this.index_0 < this.this$01.size_0;
}
;
_.remove_0 = function remove_9(){
  $remove_7(this);
}
;
_.index_0 = 0;
var Lcom_google_gwt_user_client_ui_WidgetCollection$WidgetIterator_2_classLit = createForClass('com.google.gwt.user.client.ui', 'WidgetCollection/WidgetIterator', 122);
function copyWidgetArray(widgets){
  var clone, i;
  clone = initUnidimensionalArray(Lcom_google_gwt_user_client_ui_Widget_2_classLit, $intern_1, 6, widgets.length, 0, 1);
  for (i = 0; i < widgets.length; i++) {
    clone[i] = widgets[i];
  }
  return clone;
}

function $gotoNextIndex(this$static){
  ++this$static.index_0;
  while (this$static.index_0 < this$static.val$contained1.length) {
    if (this$static.val$contained1[this$static.index_0]) {
      return;
    }
    ++this$static.index_0;
  }
}

function $next_2(this$static){
  var w;
  if (this$static.index_0 >= this$static.val$contained1.length) {
    throw toJs(new NoSuchElementException);
  }
  this$static.last = this$static.index_0;
  w = this$static.val$contained1[this$static.index_0];
  $gotoNextIndex(this$static);
  return w;
}

function WidgetIterators$1(val$contained, val$container){
  this.val$contained1 = val$contained;
  this.val$container2 = val$container;
  this.widgets = this.val$contained1;
  $gotoNextIndex(this);
}

defineClass(416, 1, {}, WidgetIterators$1);
_.next_1 = function next_3(){
  return $next_2(this);
}
;
_.hasNext_0 = function hasNext_2(){
  return this.index_0 < this.val$contained1.length;
}
;
_.remove_0 = function remove_10(){
  if (this.last < 0) {
    throw toJs(new IllegalStateException);
  }
  if (!this.widgetsWasCopied) {
    this.widgets = copyWidgetArray(this.widgets);
    this.widgetsWasCopied = true;
  }
  $remove_4(this.val$container2, this.val$contained1[this.last]);
  this.last = -1;
}
;
_.index_0 = -1;
_.last = -1;
_.widgetsWasCopied = false;
var Lcom_google_gwt_user_client_ui_WidgetIterators$1_2_classLit = createForClass('com.google.gwt.user.client.ui', 'WidgetIterators/1', 416);
function $clinit_ClippedImageImpl(){
  $clinit_ClippedImageImpl = emptyMethod;
  clearImage = ($clinit_UriUtils() , new SafeUriString(getModuleBaseURL() + 'clear.cache.gif'));
}

function $adjust(img, url_0, left, top_0, width_0, height){
  var style;
  style = 'url("' + url_0.uri_0 + '") no-repeat ' + (-left + 'px ') + (-top_0 + 'px');
  img.style['background'] = style;
  img.style['width'] = width_0 + ($clinit_Style$Unit() , 'px');
  img.style['height'] = height + 'px';
}

function $createStructure(url_0, left, top_0, width_0, height){
  var elem, tmp, builder;
  tmp = $doc.createElement('span');
  $setInnerHTML(tmp, (builder = new SafeStylesBuilder , $append($append($append(builder, new SafeStylesString('width:' + width_0 + ($clinit_Style$Unit() , 'px') + ';')), new SafeStylesString('height:' + height + 'px' + ';')), new SafeStylesString('background:' + ('url(' + url_0.uri_0 + ') ' + 'no-repeat ' + (-left + 'px ') + (-top_0 + 'px')) + ';')) , !template && (template = new ClippedImageImpl_TemplateImpl) , $image(clearImage, new SafeStylesString((new SafeStylesString(builder.sb.string)).css))).html);
  elem = $getFirstChildElement(tmp);
  elem['onload'] = createOnLoadHandlerFunction();
  return elem;
}

function createOnLoadHandlerFunction(){
  return function(){
    this.__gwtLastUnhandledEvent = 'load';
  }
  ;
}

var clearImage, template;
function $image(arg0, arg1){
  var sb;
  sb = new StringBuilder;
  sb.string += "<img src='";
  $append_2(sb, htmlEscape(arg0.uri_0));
  sb.string += "' style='";
  $append_2(sb, htmlEscape(arg1.css));
  sb.string += "' border='0'>";
  return new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.string);
}

function ClippedImageImpl_TemplateImpl(){
}

defineClass(477, 1, {}, ClippedImageImpl_TemplateImpl);
var Lcom_google_gwt_user_client_ui_impl_ClippedImageImpl_1TemplateImpl_2_classLit = createForClass('com.google.gwt.user.client.ui.impl', 'ClippedImageImpl_TemplateImpl', 477);
function $clinit_ClippedImagePrototype(){
  $clinit_ClippedImagePrototype = emptyMethod;
  $clinit_ClippedImageImpl();
}

function $createImage(this$static){
  return new Image_1(this$static.url_0, this$static.left_0, this$static.top_0, this$static.width_0, this$static.height_0);
}

function ClippedImagePrototype(url_0, left, top_0, width_0, height){
  $clinit_ClippedImagePrototype();
  this.url_0 = url_0;
  this.left_0 = left;
  this.top_0 = top_0;
  this.width_0 = width_0;
  this.height_0 = height;
}

defineClass(432, 522, {}, ClippedImagePrototype);
_.height_0 = 0;
_.left_0 = 0;
_.top_0 = 0;
_.url_0 = null;
_.width_0 = 0;
var Lcom_google_gwt_user_client_ui_impl_ClippedImagePrototype_2_classLit = createForClass('com.google.gwt.user.client.ui.impl', 'ClippedImagePrototype', 432);
function $clinit_FocusImpl(){
  $clinit_FocusImpl = emptyMethod;
  implPanel = new FocusImplSafari;
  implWidget = implPanel?new FocusImpl:implPanel;
}

function FocusImpl(){
}

defineClass(415, 1, {}, FocusImpl);
_.focus_0 = function focus_0(elem){
  elem.focus();
}
;
var implPanel, implWidget;
var Lcom_google_gwt_user_client_ui_impl_FocusImpl_2_classLit = createForClass('com.google.gwt.user.client.ui.impl', 'FocusImpl', 415);
function $createFocusHandler(){
  return function(evt){
    var div = this.parentNode;
    div.onfocus && $wnd.setTimeout(function(){
      div.focus();
    }
    , 0);
  }
  ;
}

function createFocusable0(focusHandler){
  $clinit_FocusImpl();
  var div = $doc.createElement('div');
  div.tabIndex = 0;
  var input_0 = $doc.createElement('input');
  input_0.type = 'text';
  input_0.tabIndex = -1;
  input_0.setAttribute('aria-hidden', 'true');
  var style = input_0.style;
  style.opacity = 0;
  style.height = '1px';
  style.width = '1px';
  style.zIndex = -1;
  style.overflow = 'hidden';
  style.position = 'absolute';
  input_0.addEventListener('focus', focusHandler, false);
  div.appendChild(input_0);
  return div;
}

defineClass(518, 415, {});
var focusHandler_0;
var Lcom_google_gwt_user_client_ui_impl_FocusImplStandard_2_classLit = createForClass('com.google.gwt.user.client.ui.impl', 'FocusImplStandard', 518);
function $focus(elem){
  $wnd.setTimeout(function(){
    elem.focus();
  }
  , 0);
}

function FocusImplSafari(){
}

defineClass(419, 518, {}, FocusImplSafari);
_.focus_0 = function focus_1(elem){
  $focus(elem);
}
;
var Lcom_google_gwt_user_client_ui_impl_FocusImplSafari_2_classLit = createForClass('com.google.gwt.user.client.ui.impl', 'FocusImplSafari', 419);
function $setClip(popup, rect){
  popup.style['clip'] = rect;
}

function assertCompileTimeUserAgent(){
  var runtimeValue;
  runtimeValue = $getRuntimeValue();
  if (!$equals_1('safari', runtimeValue)) {
    throw toJs(new UserAgentAsserter$UserAgentAssertionError(runtimeValue));
  }
}

function Error_0(message, cause){
  Throwable.call(this, message, cause);
}

defineClass(62, 8, $intern_37);
var Ljava_lang_Error_2_classLit = createForClass('java.lang', 'Error', 62);
defineClass(29, 62, $intern_37);
var Ljava_lang_AssertionError_2_classLit = createForClass('java.lang', 'AssertionError', 29);
function UserAgentAsserter$UserAgentAssertionError(runtimeValue){
  Error_0.call(this, 'Possible problem with your *.gwt.xml module file.\nThe compile time user.agent value (safari) does not match the runtime user.agent value (' + runtimeValue + ').\n' + 'Expect more errors.' == null?'null':toString_14('Possible problem with your *.gwt.xml module file.\nThe compile time user.agent value (safari) does not match the runtime user.agent value (' + runtimeValue + ').\n' + 'Expect more errors.'), instanceOf('Possible problem with your *.gwt.xml module file.\nThe compile time user.agent value (safari) does not match the runtime user.agent value (' + runtimeValue + ').\n' + 'Expect more errors.', 8)?castTo('Possible problem with your *.gwt.xml module file.\nThe compile time user.agent value (safari) does not match the runtime user.agent value (' + runtimeValue + ').\n' + 'Expect more errors.', 8):null);
}

defineClass(175, 29, $intern_37, UserAgentAsserter$UserAgentAssertionError);
var Lcom_google_gwt_useragent_client_UserAgentAsserter$UserAgentAssertionError_2_classLit = createForClass('com.google.gwt.useragent.client', 'UserAgentAsserter/UserAgentAssertionError', 175);
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

function $clearOnReadyStateChange(this$static){
  this$static.onreadystatechange = function(){
  }
  ;
}

function $open(this$static, httpMethod, url_0){
  this$static.open(httpMethod, url_0, true);
}

function $setOnReadyStateChange(this$static, handler){
  var _this = this$static;
  this$static.onreadystatechange = $entry(function(){
    handler.onReadyStateChange(_this);
  }
  );
}

function $setRequestHeader(this$static, header, value_0){
  this$static.setRequestHeader(header, value_0);
}

function $removeHandler(this$static){
  $doRemove(this$static.this$01, this$static.val$type2, this$static.val$source3, this$static.val$handler4);
}

function SimpleEventBus$1(this$0, val$type, val$handler){
  this.this$01 = this$0;
  this.val$type2 = val$type;
  this.val$source3 = null;
  this.val$handler4 = val$handler;
}

defineClass(196, 1, {}, SimpleEventBus$1);
var Lcom_google_web_bindery_event_shared_SimpleEventBus$1_2_classLit = createForClass('com.google.web.bindery.event.shared', 'SimpleEventBus/1', 196);
function SimpleEventBus$2(this$0, val$type, val$handler){
  this.this$01 = this$0;
  this.val$type2 = val$type;
  this.val$source3 = null;
  this.val$handler4 = val$handler;
}

defineClass(197, 1, {481:1}, SimpleEventBus$2);
_.execute_1 = function execute_10(){
  $doAddNow(this.this$01, this.val$type2, this.val$source3, this.val$handler4);
}
;
var Lcom_google_web_bindery_event_shared_SimpleEventBus$2_2_classLit = createForClass('com.google.web.bindery.event.shared', 'SimpleEventBus/2', 197);
function SimpleEventBus$3(this$0, val$type, val$source, val$handler){
  this.this$01 = this$0;
  this.val$type2 = val$type;
  this.val$source3 = val$source;
  this.val$handler4 = val$handler;
}

defineClass(198, 1, {481:1}, SimpleEventBus$3);
_.execute_1 = function execute_11(){
  $doRemoveNow(this.this$01, this.val$type2, this.val$source3, this.val$handler4);
}
;
var Lcom_google_web_bindery_event_shared_SimpleEventBus$3_2_classLit = createForClass('com.google.web.bindery.event.shared', 'SimpleEventBus/3', 198);
function AbstractStringBuilder(string){
  this.string = string;
}

defineClass(114, 1, {176:1});
_.toString_0 = function toString_19(){
  return this.string;
}
;
var Ljava_lang_AbstractStringBuilder_2_classLit = createForClass('java.lang', 'AbstractStringBuilder', 114);
function ArithmeticException(){
  RuntimeException_0.call(this, 'divide by zero');
}

defineClass(191, 12, $intern_2, ArithmeticException);
var Ljava_lang_ArithmeticException_2_classLit = createForClass('java.lang', 'ArithmeticException', 191);
function IndexOutOfBoundsException(){
  RuntimeException.call(this);
}

function IndexOutOfBoundsException_0(message){
  RuntimeException_0.call(this, message);
}

defineClass(34, 12, $intern_2, IndexOutOfBoundsException, IndexOutOfBoundsException_0);
var Ljava_lang_IndexOutOfBoundsException_2_classLit = createForClass('java.lang', 'IndexOutOfBoundsException', 34);
function ArrayIndexOutOfBoundsException(msg){
  IndexOutOfBoundsException_0.call(this, msg);
}

defineClass(450, 34, $intern_2, ArrayIndexOutOfBoundsException);
var Ljava_lang_ArrayIndexOutOfBoundsException_2_classLit = createForClass('java.lang', 'ArrayIndexOutOfBoundsException', 450);
function ArrayStoreException(){
  RuntimeException.call(this);
}

defineClass(190, 12, $intern_2, ArrayStoreException);
var Ljava_lang_ArrayStoreException_2_classLit = createForClass('java.lang', 'ArrayStoreException', 190);
function $clinit_Boolean(){
  $clinit_Boolean = emptyMethod;
}

function $booleanValue(this$static){
  return checkCriticalNotNull(this$static) , this$static;
}

function $compareTo_0(this$static, b){
  return compare_1((checkCriticalNotNull(this$static) , this$static), (checkCriticalNotNull(b) , b));
}

function compare_1(x_0, y_0){
  $clinit_Boolean();
  return x_0 == y_0?0:x_0?1:-1;
}

function compareTo_Ljava_lang_Object__I__devirtual$(this$static, other){
  $clinit_Boolean();
  return instanceOfString(this$static)?$compareTo_5(this$static, castToString(other)):instanceOfDouble(this$static)?$compareTo_2(this$static, (checkCriticalType(other == null || instanceOfDouble(other)) , other)):instanceOfBoolean(this$static)?$compareTo_0(this$static, (checkCriticalType(other == null || instanceOfBoolean(other)) , other)):this$static.compareTo(other);
}

booleanCastMap = {3:1, 178:1, 5:1};
var Ljava_lang_Boolean_2_classLit = createForClass('java.lang', 'Boolean', 178);
function $compareTo_1(this$static, c){
  return this$static.value_0 - c.value_0;
}

function Character(value_0){
  this.value_0 = value_0;
}

function codePointAt(cs, index_0, limit){
  var hiSurrogate, loSurrogate;
  hiSurrogate = $charAt(cs, index_0++);
  if (hiSurrogate >= 55296 && hiSurrogate <= 56319 && index_0 < limit && isLowSurrogate(loSurrogate = (checkCriticalStringElementIndex(index_0, cs.length) , cs.charCodeAt(index_0)))) {
    return $intern_21 + ((hiSurrogate & 1023) << 10) + (loSurrogate & 1023);
  }
  return hiSurrogate;
}

function digit(c){
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

function isLowSurrogate(ch_0){
  return ch_0 >= 56320 && ch_0 <= 57343;
}

function valueOf(c){
  var result;
  if (c < 128) {
    return $clinit_Character$BoxedValues() , result = boxedValues[c] , !result && (result = boxedValues[c] = new Character(c)) , result;
  }
  return new Character(c);
}

defineClass(71, 1, {3:1, 71:1, 5:1}, Character);
_.compareTo = function compareTo_0(c){
  return $compareTo_1(this, castTo(c, 71));
}
;
_.equals_0 = function equals_10(o){
  return instanceOf(o, 71) && castTo(o, 71).value_0 == this.value_0;
}
;
_.hashCode_0 = function hashCode_12(){
  return this.value_0;
}
;
_.toString_0 = function toString_20(){
  return String.fromCharCode(this.value_0);
}
;
_.value_0 = 0;
var Ljava_lang_Character_2_classLit = createForClass('java.lang', 'Character', 71);
function $clinit_Character$BoxedValues(){
  $clinit_Character$BoxedValues = emptyMethod;
  boxedValues = initUnidimensionalArray(Ljava_lang_Character_2_classLit, $intern_1, 71, 128, 0, 1);
}

var boxedValues;
function ClassCastException(){
  RuntimeException_0.call(this, null);
}

defineClass(113, 12, {3:1, 113:1, 19:1, 12:1, 8:1}, ClassCastException);
var Ljava_lang_ClassCastException_2_classLit = createForClass('java.lang', 'ClassCastException', 113);
function __parseAndValidateInt(s){
  var i, isTooLow, length_0, startIndex, toReturn;
  if (s == null) {
    throw toJs(new NumberFormatException('null'));
  }
  length_0 = s.length;
  startIndex = length_0 > 0 && (checkCriticalStringElementIndex(0, s.length) , s.charCodeAt(0) == 45 || (checkCriticalStringElementIndex(0, s.length) , s.charCodeAt(0) == 43))?1:0;
  for (i = startIndex; i < length_0; i++) {
    if (digit((checkCriticalStringElementIndex(i, s.length) , s.charCodeAt(i))) == -1) {
      throw toJs(new NumberFormatException('For input string: "' + s + '"'));
    }
  }
  toReturn = parseInt(s, 10);
  isTooLow = toReturn < -2147483648;
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
    if (digit((checkCriticalStringElementIndex(i, s.length) , s.charCodeAt(i))) == -1) {
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

defineClass(95, 1, {3:1, 95:1});
var Ljava_lang_Number_2_classLit = createForClass('java.lang', 'Number', 95);
function $compareTo_2(this$static, b){
  return compare_2((checkCriticalNotNull(this$static) , this$static), (checkCriticalNotNull(b) , b));
}

function $hashCode_0(this$static){
  return round_int((checkCriticalNotNull(this$static) , this$static));
}

function compare_2(x_0, y_0){
  if (x_0 < y_0) {
    return -1;
  }
  if (x_0 > y_0) {
    return 1;
  }
  if (x_0 == y_0) {
    return x_0 == 0?compare_2(1 / x_0, 1 / y_0):0;
  }
  return isNaN(x_0)?isNaN(y_0)?0:1:-1;
}

doubleCastMap = {3:1, 5:1, 179:1, 95:1};
var Ljava_lang_Double_2_classLit = createForClass('java.lang', 'Double', 179);
function IllegalArgumentException(){
  RuntimeException.call(this);
}

function IllegalArgumentException_0(message){
  RuntimeException_0.call(this, message);
}

defineClass(33, 12, $intern_2, IllegalArgumentException, IllegalArgumentException_0);
var Ljava_lang_IllegalArgumentException_2_classLit = createForClass('java.lang', 'IllegalArgumentException', 33);
function IllegalStateException(){
  RuntimeException.call(this);
}

function IllegalStateException_0(s){
  RuntimeException_0.call(this, s);
}

defineClass(41, 12, $intern_2, IllegalStateException, IllegalStateException_0);
var Ljava_lang_IllegalStateException_2_classLit = createForClass('java.lang', 'IllegalStateException', 41);
function $compareTo_3(this$static, b){
  return compare_3(this$static.value_0, b.value_0);
}

function Integer(value_0){
  this.value_0 = value_0;
}

function compare_3(x_0, y_0){
  return x_0 < y_0?-1:x_0 > y_0?1:0;
}

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

function valueOf_0(i){
  var rebase, result;
  if (i > -129 && i < 128) {
    return $clinit_Integer$BoxedValues() , rebase = i + 128 , result = boxedValues_0[rebase] , !result && (result = boxedValues_0[rebase] = new Integer(i)) , result;
  }
  return new Integer(i);
}

defineClass(40, 95, {3:1, 5:1, 40:1, 95:1}, Integer);
_.compareTo = function compareTo_1(b){
  return $compareTo_3(this, castTo(b, 40));
}
;
_.equals_0 = function equals_11(o){
  return instanceOf(o, 40) && castTo(o, 40).value_0 == this.value_0;
}
;
_.hashCode_0 = function hashCode_13(){
  return this.value_0;
}
;
_.toString_0 = function toString_22(){
  return '' + this.value_0;
}
;
_.value_0 = 0;
var Ljava_lang_Integer_2_classLit = createForClass('java.lang', 'Integer', 40);
function $clinit_Integer$BoxedValues(){
  $clinit_Integer$BoxedValues = emptyMethod;
  boxedValues_0 = initUnidimensionalArray(Ljava_lang_Integer_2_classLit, $intern_1, 40, 256, 0, 1);
}

var boxedValues_0;
function $compareTo_4(this$static, b){
  return compare_4(this$static.value_0, b.value_0);
}

function Long(value_0){
  this.value_0 = value_0;
}

function compare_4(x_0, y_0){
  return compare_0(x_0, y_0) < 0?-1:compare_0(x_0, y_0) > 0?1:0;
}

function hashCode_15(l){
  return toInt_0(shru_0(l, 32)) ^ toInt_0(l);
}

function valueOf_1(l){
  var rebase, result;
  if (compare_0(l, -129) > 0 && compare_0(l, 128) < 0) {
    return $clinit_Long$BoxedValues() , rebase = toInt_0(l) + 128 , result = boxedValues_1[rebase] , !result && (result = boxedValues_1[rebase] = new Long(l)) , result;
  }
  return new Long(l);
}

defineClass(72, 95, {3:1, 5:1, 72:1, 95:1}, Long);
_.compareTo = function compareTo_2(b){
  return $compareTo_4(this, castTo(b, 72));
}
;
_.equals_0 = function equals_12(o){
  return instanceOf(o, 72) && eq(castTo(o, 72).value_0, this.value_0);
}
;
_.hashCode_0 = function hashCode_14(){
  return hashCode_15(this.value_0);
}
;
_.toString_0 = function toString_23(){
  return '' + toString_13(this.value_0);
}
;
_.value_0 = 0;
var Ljava_lang_Long_2_classLit = createForClass('java.lang', 'Long', 72);
function $clinit_Long$BoxedValues(){
  $clinit_Long$BoxedValues = emptyMethod;
  boxedValues_1 = initUnidimensionalArray(Ljava_lang_Long_2_classLit, $intern_1, 72, 256, 0, 1);
}

var boxedValues_1;
defineClass(567, 1, {});
function NullPointerException(){
  RuntimeException.call(this);
}

function NullPointerException_0(message){
  RuntimeException_0.call(this, message);
}

defineClass(35, 115, $intern_2, NullPointerException, NullPointerException_0);
_.createError = function createError_0(msg){
  return new TypeError(msg);
}
;
var Ljava_lang_NullPointerException_2_classLit = createForClass('java.lang', 'NullPointerException', 35);
function $clinit_Number$__ParseLong(){
  $clinit_Number$__ParseLong = emptyMethod;
  var i;
  maxDigitsForRadix = stampJavaTypeInfo(getClassLiteralForArray(I_classLit, 1), $intern_1, 32, 15, [-1, -1, 30, 19, 15, 13, 11, 11, 10, 9, 9, 8, 8, 8, 8, 7, 7, 7, 7, 7, 7, 7, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 5]);
  maxDigitsRadixPower = initUnidimensionalArray(I_classLit, $intern_1, 32, 37, 15, 1);
  maxLengthForRadix = stampJavaTypeInfo(getClassLiteralForArray(I_classLit, 1), $intern_1, 32, 15, [-1, -1, 63, 40, 32, 28, 25, 23, 21, 20, 19, 19, 18, 18, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 14, 14, 14, 13, 13, 13, 13, 13, 13, 13, 13]);
  maxValueForRadix = initUnidimensionalArray(J_classLit, $intern_1, 32, 37, 14, 1);
  for (i = 2; i <= 36; i++) {
    maxDigitsRadixPower[i] = round_int($wnd.Math.pow(i, maxDigitsForRadix[i]));
    maxValueForRadix[i] = div_0({l:$intern_12, m:$intern_12, h:524287}, maxDigitsRadixPower[i]);
  }
}

var maxDigitsForRadix, maxDigitsRadixPower, maxLengthForRadix, maxValueForRadix;
function NumberFormatException(message){
  IllegalArgumentException_0.call(this, message);
}

defineClass(45, 33, $intern_2, NumberFormatException);
var Ljava_lang_NumberFormatException_2_classLit = createForClass('java.lang', 'NumberFormatException', 45);
function $charAt(this$static, index_0){
  checkCriticalStringElementIndex(index_0, this$static.length);
  return this$static.charCodeAt(index_0);
}

function $compareTo_5(this$static, other){
  var a, b;
  a = (checkCriticalNotNull(this$static) , this$static);
  b = (checkCriticalNotNull(other) , other);
  return a == b?0:a < b?-1:1;
}

function $concat(str){
  return checkCriticalNotNull('fileChooser_') , checkCriticalNotNull(str) , 'fileChooser_' + str;
}

function $equals_1(this$static, other){
  return checkCriticalNotNull(this$static) , maskUndefined(this$static) === maskUndefined(other);
}

function $equalsIgnoreCase(this$static, other){
  checkCriticalNotNull(this$static);
  if (other == null) {
    return false;
  }
  if ($equals_1(this$static, other)) {
    return true;
  }
  return this$static.length == other.length && $equals_1(this$static.toLowerCase(), other.toLowerCase());
}

function $getChars0(this$static, srcBegin, srcEnd, dst, dstBegin){
  while (srcBegin < srcEnd) {
    dst[dstBegin++] = $charAt(this$static, srcBegin++);
  }
}

function $hashCode_1(this$static){
  var h, i;
  h = 0;
  for (i = 0; i < this$static.length; i++) {
    h = (h << 5) - h + (checkCriticalStringElementIndex(i, this$static.length) , this$static.charCodeAt(i)) | 0;
  }
  return h;
}

function $indexOf_0(this$static, str){
  return this$static.indexOf(str);
}

function $replace_0(this$static, from, to){
  var regex, replacement;
  regex = $replaceAll(from, '([/\\\\\\.\\*\\+\\?\\|\\(\\)\\[\\]\\{\\}$^])', '\\\\$1');
  replacement = $replaceAll($replaceAll((checkCriticalNotNull(to) , to), '\\\\', '\\\\\\\\'), '\\$', '\\\\$');
  return $replaceAll(this$static, regex, replacement);
}

function $replaceAll(this$static, regex, replace){
  replace = translateReplaceString(replace);
  return this$static.replace(new RegExp(regex, 'g'), replace);
}

function $split(this$static, regex, maxMatch){
  var compiled, count, lastNonEmpty, lastTrail, matchIndex, matchObj, out, trail;
  compiled = new RegExp(regex, 'g');
  out = initUnidimensionalArray(Ljava_lang_String_2_classLit, $intern_1, 2, 0, 6, 1);
  count = 0;
  trail = this$static;
  lastTrail = null;
  while (true) {
    matchObj = compiled.exec(trail);
    if (matchObj == null || trail == '' || count == maxMatch - 1 && maxMatch > 0) {
      out[count] = trail;
      break;
    }
     else {
      matchIndex = matchObj.index;
      out[count] = (checkCriticalStringBounds(0, matchIndex, trail.length) , trail.substr(0, matchIndex));
      trail = $substring_0(trail, matchIndex + matchObj[0].length, trail.length);
      compiled.lastIndex = 0;
      if (lastTrail == trail) {
        out[count] = (checkCriticalStringBounds(0, 1, trail.length) , trail.substr(0, 1));
        trail = (checkCriticalStringElementIndex(1, trail.length + 1) , trail.substr(1));
      }
      lastTrail = trail;
      ++count;
    }
  }
  if (maxMatch == 0 && this$static.length > 0) {
    lastNonEmpty = out.length;
    while (lastNonEmpty > 0 && out[lastNonEmpty - 1] == '') {
      --lastNonEmpty;
    }
    lastNonEmpty < out.length && (out.length = lastNonEmpty);
  }
  return out;
}

function $substring(this$static, beginIndex){
  checkCriticalStringElementIndex(beginIndex, this$static.length + 1);
  return this$static.substr(beginIndex);
}

function $substring_0(this$static, beginIndex, endIndex){
  checkCriticalStringBounds(beginIndex, endIndex, this$static.length);
  return this$static.substr(beginIndex, endIndex - beginIndex);
}

function $toCharArray(this$static){
  var charArr, n;
  n = this$static.length;
  charArr = initUnidimensionalArray(C_classLit, $intern_1, 32, n, 15, 1);
  $getChars0(this$static, 0, n, charArr, 0);
  return charArr;
}

function $trim(this$static){
  var end, length_0, start_0;
  length_0 = this$static.length;
  start_0 = 0;
  while (start_0 < length_0 && (checkCriticalStringElementIndex(start_0, this$static.length) , this$static.charCodeAt(start_0) <= 32)) {
    ++start_0;
  }
  end = length_0;
  while (end > start_0 && (checkCriticalStringElementIndex(end - 1, this$static.length) , this$static.charCodeAt(end - 1) <= 32)) {
    --end;
  }
  return start_0 > 0 || end < length_0?(checkCriticalStringBounds(start_0, end, this$static.length) , this$static.substr(start_0, end - start_0)):this$static;
}

function fromCharCode(array){
  return String.fromCharCode.apply(null, array);
}

function fromCodePoint(codePoint){
  var hiSurrogate, loSurrogate;
  if (codePoint >= $intern_21) {
    hiSurrogate = 55296 + (codePoint - $intern_21 >> 10 & 1023) & $intern_11;
    loSurrogate = 56320 + (codePoint - $intern_21 & 1023) & $intern_11;
    return String.fromCharCode(hiSurrogate) + ('' + String.fromCharCode(loSurrogate));
  }
   else {
    return String.fromCharCode(codePoint & $intern_11);
  }
}

function translateReplaceString(replaceStr){
  var pos;
  pos = 0;
  while (0 <= (pos = replaceStr.indexOf('\\', pos))) {
    checkCriticalStringElementIndex(pos + 1, replaceStr.length);
    replaceStr.charCodeAt(pos + 1) == 36?(replaceStr = (checkCriticalStringBounds(0, pos, replaceStr.length) , replaceStr.substr(0, pos) + '$' + $substring(replaceStr, ++pos))):(replaceStr = (checkCriticalStringBounds(0, pos, replaceStr.length) , replaceStr.substr(0, pos) + ('' + $substring(replaceStr, ++pos))));
  }
  return replaceStr;
}

function valueOf_2(x_0){
  return valueOf_3(x_0, x_0.length);
}

function valueOf_3(x_0, count){
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

stringCastMap = {3:1, 176:1, 5:1, 2:1};
var Ljava_lang_String_2_classLit = createForClass('java.lang', 'String', 2);
function $append_0(this$static, x_0){
  this$static.string += '' + x_0;
  return this$static;
}

function $append_1(this$static, x_0){
  this$static.string += '' + x_0;
  return this$static;
}

function $append_2(this$static, x_0){
  this$static.string += '' + x_0;
  return this$static;
}

function $append_3(this$static, x_0){
  this$static.string += valueOf_3(x_0, x_0.length);
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

defineClass(46, 114, {176:1}, StringBuilder, StringBuilder_0, StringBuilder_1);
var Ljava_lang_StringBuilder_2_classLit = createForClass('java.lang', 'StringBuilder', 46);
function StringIndexOutOfBoundsException(message){
  IndexOutOfBoundsException_0.call(this, message);
}

defineClass(141, 34, $intern_2, StringIndexOutOfBoundsException);
var Ljava_lang_StringIndexOutOfBoundsException_2_classLit = createForClass('java.lang', 'StringIndexOutOfBoundsException', 141);
defineClass(572, 1, {});
function UnsupportedOperationException(){
  RuntimeException.call(this);
}

function UnsupportedOperationException_0(message){
  RuntimeException_0.call(this, message);
}

defineClass(39, 12, $intern_2, UnsupportedOperationException, UnsupportedOperationException_0);
var Ljava_lang_UnsupportedOperationException_2_classLit = createForClass('java.lang', 'UnsupportedOperationException', 39);
function $advanceToFind(this$static, o, remove){
  var e, iter;
  for (iter = this$static.iterator(); iter.hasNext_0();) {
    e = iter.next_1();
    if (maskUndefined(o) === maskUndefined(e) || o != null && equals_Ljava_lang_Object__Z__devirtual$(o, e)) {
      remove && iter.remove_0();
      return true;
    }
  }
  return false;
}

function $containsAll(this$static, c){
  var e, e$iterator;
  checkCriticalNotNull(c);
  for (e$iterator = c.iterator(); e$iterator.hasNext_0();) {
    e = e$iterator.next_1();
    if (!this$static.contains_0(e)) {
      return false;
    }
  }
  return true;
}

function $toArray(this$static){
  return $toArray_0(this$static, initUnidimensionalArray(Ljava_lang_Object_2_classLit, $intern_1, 1, this$static.this$01.size_1(), 5, 1));
}

function $toArray_0(this$static, a){
  var i, it, result, size_0;
  size_0 = this$static.size_1();
  a.length < size_0 && (a = stampJavaTypeInfo_0(new Array(size_0), a));
  result = a;
  it = this$static.iterator();
  for (i = 0; i < size_0; ++i) {
    setCheck(result, i, it.next_1());
  }
  a.length > size_0 && setCheck(a, size_0, null);
  return a;
}

defineClass(507, 1, {38:1});
_.add_0 = function add_4(o){
  throw toJs(new UnsupportedOperationException_0('Add not supported on this collection'));
}
;
_.contains_0 = function contains(o){
  return $advanceToFind(this, o, false);
}
;
_.isEmpty = function isEmpty(){
  return this.size_1() == 0;
}
;
_.remove_1 = function remove_11(o){
  return $advanceToFind(this, o, true);
}
;
_.toArray = function toArray(a){
  return $toArray_0(this, a);
}
;
_.toString_0 = function toString_24(){
  var e, e$iterator, joiner;
  joiner = new StringJoiner('[', ']');
  for (e$iterator = this.iterator(); e$iterator.hasNext_0();) {
    e = e$iterator.next_1();
    $add_8(joiner, e === this?'(this Collection)':e == null?'null':toString_14(e));
  }
  return !joiner.builder?joiner.emptyValue:joiner.suffix.length == 0?joiner.builder.string:joiner.builder.string + ('' + joiner.suffix);
}
;
var Ljava_util_AbstractCollection_2_classLit = createForClass('java.util', 'AbstractCollection', 507);
function $containsEntry(this$static, entry){
  var key, ourValue, value_0;
  key = entry.getKey();
  value_0 = entry.getValue();
  ourValue = this$static.get_0(key);
  if (!(maskUndefined(value_0) === maskUndefined(ourValue) || value_0 != null && equals_Ljava_lang_Object__Z__devirtual$(value_0, ourValue))) {
    return false;
  }
  if (ourValue == null && !this$static.containsKey(key)) {
    return false;
  }
  return true;
}

function $implFindEntry(this$static, key, remove){
  var entry, iter, k;
  for (iter = this$static.entrySet_0().iterator(); iter.hasNext_0();) {
    entry = castTo(iter.next_1(), 23);
    k = entry.getKey();
    if (maskUndefined(key) === maskUndefined(k) || key != null && equals_Ljava_lang_Object__Z__devirtual$(key, k)) {
      if (remove) {
        entry = new AbstractMap$SimpleEntry(entry.getKey(), entry.getValue());
        iter.remove_0();
      }
      return entry;
    }
  }
  return null;
}

function $putAll(this$static, map_0){
  var e, e$iterator;
  checkCriticalNotNull(map_0);
  for (e$iterator = new AbstractHashMap$EntrySetIterator((new AbstractHashMap$EntrySet(map_0)).this$01); e$iterator.hasNext;) {
    e = $next_3(e$iterator);
    $put_1(this$static, e.getKey(), e.getValue());
  }
}

function $toString_1(this$static, o){
  return o === this$static?'(this Map)':o == null?'null':toString_14(o);
}

function getEntryValueOrNull(entry){
  return !entry?null:entry.getValue();
}

defineClass(506, 1, {70:1});
_.containsKey = function containsKey(key){
  return !!$implFindEntry(this, key, false);
}
;
_.equals_0 = function equals_13(obj){
  var entry, entry$iterator, otherMap;
  if (obj === this) {
    return true;
  }
  if (!instanceOf(obj, 70)) {
    return false;
  }
  otherMap = castTo(obj, 70);
  if (this.size_1() != otherMap.size_1()) {
    return false;
  }
  for (entry$iterator = otherMap.entrySet_0().iterator(); entry$iterator.hasNext_0();) {
    entry = castTo(entry$iterator.next_1(), 23);
    if (!$containsEntry(this, entry)) {
      return false;
    }
  }
  return true;
}
;
_.get_0 = function get_1(key){
  return getEntryValueOrNull($implFindEntry(this, key, false));
}
;
_.hashCode_0 = function hashCode_16(){
  return hashCode_21(this.entrySet_0());
}
;
_.isEmpty = function isEmpty_0(){
  return this.size_1() == 0;
}
;
_.put = function put(key, value_0){
  throw toJs(new UnsupportedOperationException_0('Put not supported on this map'));
}
;
_.remove_2 = function remove_12(key){
  return getEntryValueOrNull($implFindEntry(this, key, true));
}
;
_.size_1 = function size_1(){
  return this.entrySet_0().size_1();
}
;
_.toString_0 = function toString_25(){
  var entry, entry$iterator, joiner;
  joiner = new StringJoiner('{', '}');
  for (entry$iterator = this.entrySet_0().iterator(); entry$iterator.hasNext_0();) {
    entry = castTo(entry$iterator.next_1(), 23);
    $add_8(joiner, $toString_1(this, entry.getKey()) + '=' + $toString_1(this, entry.getValue()));
  }
  return !joiner.builder?joiner.emptyValue:joiner.suffix.length == 0?joiner.builder.string:joiner.builder.string + ('' + joiner.suffix);
}
;
var Ljava_util_AbstractMap_2_classLit = createForClass('java.util', 'AbstractMap', 506);
function $containsKey(this$static, key){
  return instanceOfString(key)?$hasStringValue(this$static, key):!!$getEntry(this$static.hashCodeMap, key);
}

function $get_2(this$static, key){
  return instanceOfString(key)?$getStringValue(this$static, key):getEntryValueOrNull($getEntry(this$static.hashCodeMap, key));
}

function $getStringValue(this$static, key){
  return key == null?getEntryValueOrNull($getEntry(this$static.hashCodeMap, null)):$get_4(this$static.stringMap, key);
}

function $hasStringValue(this$static, key){
  return key == null?!!$getEntry(this$static.hashCodeMap, null):$contains_1(this$static.stringMap, key);
}

function $put_1(this$static, key, value_0){
  return instanceOfString(key)?$putStringValue(this$static, key, value_0):$put_2(this$static.hashCodeMap, key, value_0);
}

function $putStringValue(this$static, key, value_0){
  return key == null?$put_2(this$static.hashCodeMap, null, value_0):$put_3(this$static.stringMap, key, value_0);
}

function $remove_8(this$static, key){
  return instanceOfString(key)?key == null?$remove_16(this$static.hashCodeMap, null):$remove_17(this$static.stringMap, key):$remove_16(this$static.hashCodeMap, key);
}

function $reset(this$static){
  this$static.hashCodeMap = new InternalHashCodeMap(this$static);
  this$static.stringMap = new InternalStringMap(this$static);
  ++this$static.modCount;
}

function $size(this$static){
  return this$static.hashCodeMap.size_0 + this$static.stringMap.size_0;
}

defineClass(202, 506, {70:1});
_.containsKey = function containsKey_0(key){
  return $containsKey(this, key);
}
;
_.entrySet_0 = function entrySet(){
  return new AbstractHashMap$EntrySet(this);
}
;
_.get_0 = function get_2(key){
  return $get_2(this, key);
}
;
_.put = function put_0(key, value_0){
  return $putStringValue(this, key, value_0);
}
;
_.remove_2 = function remove_13(key){
  return $remove_8(this, key);
}
;
_.size_1 = function size_2(){
  return $size(this);
}
;
_.modCount = 0;
var Ljava_util_AbstractHashMap_2_classLit = createForClass('java.util', 'AbstractHashMap', 202);
defineClass(508, 507, $intern_38);
_.equals_0 = function equals_14(o){
  var other;
  if (o === this) {
    return true;
  }
  if (!instanceOf(o, 77)) {
    return false;
  }
  other = castTo(o, 77);
  if (other.size_1() != this.size_1()) {
    return false;
  }
  return $containsAll(this, other);
}
;
_.hashCode_0 = function hashCode_17(){
  return hashCode_21(this);
}
;
var Ljava_util_AbstractSet_2_classLit = createForClass('java.util', 'AbstractSet', 508);
function $contains(this$static, o){
  if (instanceOf(o, 23)) {
    return $containsEntry(this$static.this$01, castTo(o, 23));
  }
  return false;
}

function AbstractHashMap$EntrySet(this$0){
  this.this$01 = this$0;
}

defineClass(57, 508, $intern_38, AbstractHashMap$EntrySet);
_.contains_0 = function contains_0(o){
  return $contains(this, o);
}
;
_.iterator = function iterator_5(){
  return new AbstractHashMap$EntrySetIterator(this.this$01);
}
;
_.remove_1 = function remove_14(entry){
  var key;
  if ($contains(this, entry)) {
    key = castTo(entry, 23).getKey();
    this.this$01.remove_2(key);
    return true;
  }
  return false;
}
;
_.size_1 = function size_3(){
  return this.this$01.size_1();
}
;
var Ljava_util_AbstractHashMap$EntrySet_2_classLit = createForClass('java.util', 'AbstractHashMap/EntrySet', 57);
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

function $next_3(this$static){
  var rv;
  checkCriticalConcurrentModification(this$static.this$01.modCount, this$static.lastModCount);
  checkCriticalElement(this$static.hasNext);
  this$static.last = this$static.current;
  rv = castTo(this$static.current.next_1(), 23);
  this$static.hasNext = $computeHasNext(this$static);
  return rv;
}

function $remove_9(this$static){
  checkCriticalState(!!this$static.last);
  checkCriticalConcurrentModification(this$static.this$01.modCount, this$static.lastModCount);
  this$static.last.remove_0();
  this$static.last = null;
  this$static.hasNext = $computeHasNext(this$static);
  this$static.lastModCount = this$static.this$01.modCount;
}

function AbstractHashMap$EntrySetIterator(this$0){
  this.this$01 = this$0;
  this.stringMapEntries = new InternalStringMap$1(this.this$01.stringMap);
  this.current = this.stringMapEntries;
  this.hasNext = $computeHasNext(this);
  this.lastModCount = this.this$01.modCount;
}

defineClass(64, 1, {}, AbstractHashMap$EntrySetIterator);
_.next_1 = function next_4(){
  return $next_3(this);
}
;
_.hasNext_0 = function hasNext_3(){
  return this.hasNext;
}
;
_.remove_0 = function remove_15(){
  $remove_9(this);
}
;
_.hasNext = false;
_.lastModCount = 0;
var Ljava_util_AbstractHashMap$EntrySetIterator_2_classLit = createForClass('java.util', 'AbstractHashMap/EntrySetIterator', 64);
defineClass(510, 507, $intern_39);
_.add_1 = function add_5(index_0, element){
  throw toJs(new UnsupportedOperationException_0('Add not supported on this list'));
}
;
_.add_0 = function add_6(obj){
  this.add_1(this.size_1(), obj);
  return true;
}
;
_.equals_0 = function equals_15(o){
  var elem, elem$iterator, elemOther, iterOther, other;
  if (o === this) {
    return true;
  }
  if (!instanceOf(o, 37)) {
    return false;
  }
  other = castTo(o, 37);
  if (this.size_1() != other.size_1()) {
    return false;
  }
  iterOther = other.iterator();
  for (elem$iterator = this.iterator(); elem$iterator.hasNext_0();) {
    elem = elem$iterator.next_1();
    elemOther = iterOther.next_1();
    if (!(maskUndefined(elem) === maskUndefined(elemOther) || elem != null && equals_Ljava_lang_Object__Z__devirtual$(elem, elemOther))) {
      return false;
    }
  }
  return true;
}
;
_.hashCode_0 = function hashCode_18(){
  return hashCode_22(this);
}
;
_.iterator = function iterator_6(){
  return new AbstractList$IteratorImpl(this);
}
;
_.listIterator = function listIterator(){
  return new AbstractList$ListIteratorImpl(this, 0);
}
;
_.listIterator_0 = function listIterator_0(from){
  return new AbstractList$ListIteratorImpl(this, from);
}
;
_.remove_3 = function remove_16(index_0){
  throw toJs(new UnsupportedOperationException_0('Remove not supported on this list'));
}
;
var Ljava_util_AbstractList_2_classLit = createForClass('java.util', 'AbstractList', 510);
function $remove_10(this$static){
  checkCriticalState(this$static.last != -1);
  this$static.this$01_0.remove_3(this$static.last);
  this$static.i = this$static.last;
  this$static.last = -1;
}

function AbstractList$IteratorImpl(this$0){
  this.this$01_0 = this$0;
}

defineClass(148, 1, {}, AbstractList$IteratorImpl);
_.hasNext_0 = function hasNext_4(){
  return this.i < this.this$01_0.size_1();
}
;
_.next_1 = function next_5(){
  checkCriticalElement(this.i < this.this$01_0.size_1());
  return this.this$01_0.get_1(this.last = this.i++);
}
;
_.remove_0 = function remove_17(){
  $remove_10(this);
}
;
_.i = 0;
_.last = -1;
var Ljava_util_AbstractList$IteratorImpl_2_classLit = createForClass('java.util', 'AbstractList/IteratorImpl', 148);
function AbstractList$ListIteratorImpl(this$0, start_0){
  this.this$01 = this$0;
  AbstractList$IteratorImpl.call(this, this$0);
  checkCriticalPositionIndex(start_0, this$0.size_1());
  this.i = start_0;
}

defineClass(149, 148, {}, AbstractList$ListIteratorImpl);
_.remove_0 = function remove_18(){
  $remove_10(this);
}
;
_.hasPrevious = function hasPrevious(){
  return this.i > 0;
}
;
_.previous = function previous_0(){
  checkCriticalElement(this.i > 0);
  return this.this$01.get_1(this.last = --this.i);
}
;
var Ljava_util_AbstractList$ListIteratorImpl_2_classLit = createForClass('java.util', 'AbstractList/ListIteratorImpl', 149);
function AbstractMap$1(this$0){
  this.this$01 = this$0;
}

defineClass(96, 508, $intern_38, AbstractMap$1);
_.contains_0 = function contains_1(key){
  return $containsKey(this.this$01, key);
}
;
_.iterator = function iterator_7(){
  var outerIter;
  return outerIter = new AbstractHashMap$EntrySetIterator((new AbstractHashMap$EntrySet(this.this$01)).this$01) , new AbstractMap$1$1(outerIter);
}
;
_.remove_1 = function remove_19(key){
  if ($containsKey(this.this$01, key)) {
    $remove_8(this.this$01, key);
    return true;
  }
  return false;
}
;
_.size_1 = function size_4(){
  return $size(this.this$01);
}
;
var Ljava_util_AbstractMap$1_2_classLit = createForClass('java.util', 'AbstractMap/1', 96);
function AbstractMap$1$1(val$outerIter){
  this.val$outerIter2 = val$outerIter;
}

defineClass(97, 1, {}, AbstractMap$1$1);
_.hasNext_0 = function hasNext_5(){
  return this.val$outerIter2.hasNext;
}
;
_.next_1 = function next_6(){
  var entry;
  return entry = $next_3(this.val$outerIter2) , entry.getKey();
}
;
_.remove_0 = function remove_20(){
  $remove_9(this.val$outerIter2);
}
;
var Ljava_util_AbstractMap$1$1_2_classLit = createForClass('java.util', 'AbstractMap/1/1', 97);
function $setValue(this$static, value_0){
  var oldValue;
  oldValue = this$static.value_0;
  this$static.value_0 = value_0;
  return oldValue;
}

defineClass(203, 1, $intern_40);
_.equals_0 = function equals_16(other){
  var entry;
  if (!instanceOf(other, 23)) {
    return false;
  }
  entry = castTo(other, 23);
  return equals_25(this.key, entry.getKey()) && equals_25(this.value_0, entry.getValue());
}
;
_.getKey = function getKey(){
  return this.key;
}
;
_.getValue = function getValue(){
  return this.value_0;
}
;
_.hashCode_0 = function hashCode_19(){
  return hashCode_28(this.key) ^ hashCode_28(this.value_0);
}
;
_.setValue = function setValue(value_0){
  return $setValue(this, value_0);
}
;
_.toString_0 = function toString_26(){
  return this.key + '=' + this.value_0;
}
;
var Ljava_util_AbstractMap$AbstractEntry_2_classLit = createForClass('java.util', 'AbstractMap/AbstractEntry', 203);
function AbstractMap$SimpleEntry(key, value_0){
  this.key = key;
  this.value_0 = value_0;
}

defineClass(117, 203, $intern_40, AbstractMap$SimpleEntry);
var Ljava_util_AbstractMap$SimpleEntry_2_classLit = createForClass('java.util', 'AbstractMap/SimpleEntry', 117);
defineClass(511, 1, $intern_40);
_.equals_0 = function equals_17(other){
  var entry;
  if (!instanceOf(other, 23)) {
    return false;
  }
  entry = castTo(other, 23);
  return equals_25(this.val$entry2.value[0], entry.getKey()) && equals_25($getValue_0(this), entry.getValue());
}
;
_.hashCode_0 = function hashCode_20(){
  return hashCode_28(this.val$entry2.value[0]) ^ hashCode_28($getValue_0(this));
}
;
_.toString_0 = function toString_27(){
  return this.val$entry2.value[0] + '=' + $getValue_0(this);
}
;
var Ljava_util_AbstractMapEntry_2_classLit = createForClass('java.util', 'AbstractMapEntry', 511);
function $add_5(this$static, index_0, o){
  checkCriticalPositionIndex(index_0, this$static.array.length);
  insertTo(this$static.array, index_0, o);
}

function $add_6(this$static, o){
  push_1(this$static.array, o);
  return true;
}

function $get_3(this$static, index_0){
  checkCriticalElementIndex(index_0, this$static.array.length);
  return this$static.array[index_0];
}

function $indexOf_1(this$static, o, index_0){
  for (; index_0 < this$static.array.length; ++index_0) {
    if (equals_25(o, this$static.array[index_0])) {
      return index_0;
    }
  }
  return -1;
}

function $remove_11(this$static, index_0){
  var previous;
  previous = (checkCriticalElementIndex(index_0, this$static.array.length) , this$static.array[index_0]);
  removeFrom(this$static.array, index_0);
  return previous;
}

function $remove_12(this$static, o){
  var i;
  i = $indexOf_1(this$static, o, 0);
  if (i == -1) {
    return false;
  }
  checkCriticalElementIndex(i, this$static.array.length);
  removeFrom(this$static.array, i);
  return true;
}

function $set_1(this$static, index_0, o){
  var previous;
  previous = (checkCriticalElementIndex(index_0, this$static.array.length) , this$static.array[index_0]);
  this$static.array[index_0] = o;
  return previous;
}

function $sort(this$static, c){
  sort_0(this$static.array, this$static.array.length, c);
}

function $toArray_1(this$static, out){
  var i, size_0;
  size_0 = this$static.array.length;
  out.length < size_0 && (out = stampJavaTypeInfo_0(new Array(size_0), out));
  for (i = 0; i < size_0; ++i) {
    setCheck(out, i, this$static.array[i]);
  }
  out.length > size_0 && setCheck(out, size_0, null);
  return out;
}

function ArrayList(){
  this.array = initUnidimensionalArray(Ljava_lang_Object_2_classLit, $intern_1, 1, 0, 5, 1);
}

defineClass(20, 510, $intern_41, ArrayList);
_.add_1 = function add_7(index_0, o){
  $add_5(this, index_0, o);
}
;
_.add_0 = function add_8(o){
  return $add_6(this, o);
}
;
_.contains_0 = function contains_2(o){
  return $indexOf_1(this, o, 0) != -1;
}
;
_.get_1 = function get_3(index_0){
  return $get_3(this, index_0);
}
;
_.isEmpty = function isEmpty_1(){
  return this.array.length == 0;
}
;
_.iterator = function iterator_8(){
  return new ArrayList$1(this);
}
;
_.remove_3 = function remove_21(index_0){
  return $remove_11(this, index_0);
}
;
_.remove_1 = function remove_22(o){
  return $remove_12(this, o);
}
;
_.size_1 = function size_5(){
  return this.array.length;
}
;
_.toArray = function toArray_0(out){
  return $toArray_1(this, out);
}
;
var Ljava_util_ArrayList_2_classLit = createForClass('java.util', 'ArrayList', 20);
function $hasNext(this$static){
  return this$static.i < this$static.this$01.array.length;
}

function $next_4(this$static){
  checkCriticalElement(this$static.i < this$static.this$01.array.length);
  this$static.last = this$static.i++;
  return this$static.this$01.array[this$static.last];
}

function $remove_13(this$static){
  checkCriticalState(this$static.last != -1);
  $remove_11(this$static.this$01, this$static.i = this$static.last);
  this$static.last = -1;
}

function ArrayList$1(this$0){
  this.this$01 = this$0;
}

defineClass(22, 1, {}, ArrayList$1);
_.hasNext_0 = function hasNext_6(){
  return $hasNext(this);
}
;
_.next_1 = function next_7(){
  return $next_4(this);
}
;
_.remove_0 = function remove_23(){
  $remove_13(this);
}
;
_.i = 0;
_.last = -1;
var Ljava_util_ArrayList$1_2_classLit = createForClass('java.util', 'ArrayList/1', 22);
function fill(a){
  fill0(a, a.length);
}

function fill_0(a, val){
  fill0_0(a, a.length, val);
}

function fill0(a, toIndex){
  var i;
  for (i = 0; i < toIndex; ++i) {
    a[i] = 3;
  }
}

function fill0_0(a, toIndex, val){
  var i;
  for (i = 0; i < toIndex; ++i) {
    a[i] = val;
  }
}

function insertionSort(array, low, high, comp){
  var i, j, t;
  for (i = low + 1; i < high; ++i) {
    for (j = i; j > low && comp.compare(array[j - 1], array[j]) > 0; --j) {
      t = array[j];
      setCheck(array, j, array[j - 1]);
      setCheck(array, j - 1, t);
    }
  }
}

function merge(src_0, srcLow, srcMid, srcHigh, dest, destLow, destHigh, comp){
  var topIdx;
  topIdx = srcMid;
  while (destLow < destHigh) {
    topIdx >= srcHigh || srcLow < srcMid && comp.compare(src_0[srcLow], src_0[topIdx]) <= 0?setCheck(dest, destLow++, src_0[srcLow++]):setCheck(dest, destLow++, src_0[topIdx++]);
  }
}

function mergeSort(x_0, fromIndex, toIndex, comp){
  var temp;
  comp = ($clinit_Comparators() , !comp?INTERNAL_NATURAL_ORDER:comp);
  temp = x_0.slice(fromIndex, toIndex);
  mergeSort_0(temp, x_0, fromIndex, toIndex, -fromIndex, comp);
}

function mergeSort_0(temp, array, low, high, ofs, comp){
  var length_0, tempHigh, tempLow, tempMid;
  length_0 = high - low;
  if (length_0 < 7) {
    insertionSort(array, low, high, comp);
    return;
  }
  tempLow = low + ofs;
  tempHigh = high + ofs;
  tempMid = tempLow + (tempHigh - tempLow >> 1);
  mergeSort_0(array, temp, tempLow, tempMid, -ofs, comp);
  mergeSort_0(array, temp, tempMid, tempHigh, -ofs, comp);
  if (comp.compare(temp[tempMid - 1], temp[tempMid]) <= 0) {
    while (low < high) {
      setCheck(array, low++, temp[tempLow++]);
    }
    return;
  }
  merge(temp, tempLow, tempMid, tempHigh, array, low, high, comp);
}

function sort_0(x_0, toIndex, c){
  checkCriticalArrayBounds(toIndex, x_0.length);
  mergeSort(x_0, 0, toIndex, c);
}

function $clinit_Collections(){
  $clinit_Collections = emptyMethod;
  EMPTY_LIST = new Collections$EmptyList;
}

function hashCode_21(collection){
  $clinit_Collections();
  var e, e$iterator, hashCode;
  hashCode = 0;
  for (e$iterator = collection.iterator(); e$iterator.hasNext_0();) {
    e = e$iterator.next_1();
    hashCode = hashCode + (e != null?hashCode__I__devirtual$(e):0);
    hashCode = hashCode | 0;
  }
  return hashCode;
}

function hashCode_22(list){
  $clinit_Collections();
  var e, e$iterator, hashCode;
  hashCode = 1;
  for (e$iterator = list.iterator(); e$iterator.hasNext_0();) {
    e = e$iterator.next_1();
    hashCode = 31 * hashCode + (e != null?hashCode__I__devirtual$(e):0);
    hashCode = hashCode | 0;
  }
  return hashCode;
}

function reverse(l){
  var t;
  $clinit_Collections();
  var iBack, iFront;
  for (iFront = 0 , iBack = l.array.length - 1; iFront < iBack; ++iFront , --iBack) {
    t = (checkCriticalElementIndex(iFront, l.array.length) , l.array[iFront]);
    $set_1(l, iFront, (checkCriticalElementIndex(iBack, l.array.length) , l.array[iBack]));
    checkCriticalElementIndex(iBack, l.array.length);
    l.array[iBack] = t;
  }
}

function unmodifiableList(list){
  $clinit_Collections();
  return instanceOf(list, 167)?new Collections$UnmodifiableRandomAccessList(list):new Collections$UnmodifiableList(list);
}

var EMPTY_LIST;
function Collections$EmptyList(){
}

defineClass(207, 510, $intern_41, Collections$EmptyList);
_.contains_0 = function contains_3(object){
  return false;
}
;
_.get_1 = function get_4(location_0){
  checkCriticalElementIndex(location_0, 0);
  return null;
}
;
_.iterator = function iterator_9(){
  return $clinit_Collections() , $clinit_Collections$EmptyListIterator() , INSTANCE_2;
}
;
_.listIterator = function listIterator_1(){
  return $clinit_Collections() , $clinit_Collections$EmptyListIterator() , INSTANCE_2;
}
;
_.size_1 = function size_6(){
  return 0;
}
;
var Ljava_util_Collections$EmptyList_2_classLit = createForClass('java.util', 'Collections/EmptyList', 207);
function $clinit_Collections$EmptyListIterator(){
  $clinit_Collections$EmptyListIterator = emptyMethod;
  INSTANCE_2 = new Collections$EmptyListIterator;
}

function Collections$EmptyListIterator(){
}

defineClass(208, 1, {}, Collections$EmptyListIterator);
_.hasNext_0 = function hasNext_7(){
  return false;
}
;
_.hasPrevious = function hasPrevious_0(){
  return false;
}
;
_.next_1 = function next_8(){
  throw toJs(new NoSuchElementException);
}
;
_.previous = function previous_1(){
  throw toJs(new NoSuchElementException);
}
;
_.remove_0 = function remove_24(){
  throw toJs(new IllegalStateException);
}
;
var INSTANCE_2;
var Ljava_util_Collections$EmptyListIterator_2_classLit = createForClass('java.util', 'Collections/EmptyListIterator', 208);
defineClass(143, 1, {38:1});
_.add_0 = function add_9(o){
  throw toJs(new UnsupportedOperationException);
}
;
_.isEmpty = function isEmpty_2(){
  return this.coll.isEmpty();
}
;
_.iterator = function iterator_10(){
  return new Collections$UnmodifiableCollectionIterator(this.coll.iterator());
}
;
_.remove_1 = function remove_25(o){
  throw toJs(new UnsupportedOperationException);
}
;
_.size_1 = function size_7(){
  return this.coll.size_1();
}
;
_.toArray = function toArray_1(a){
  return this.coll.toArray(a);
}
;
_.toString_0 = function toString_28(){
  return toString_14(this.coll);
}
;
var Ljava_util_Collections$UnmodifiableCollection_2_classLit = createForClass('java.util', 'Collections/UnmodifiableCollection', 143);
function $remove_14(){
  throw toJs(new UnsupportedOperationException);
}

function Collections$UnmodifiableCollectionIterator(it){
  this.it = it;
}

defineClass(146, 1, {}, Collections$UnmodifiableCollectionIterator);
_.hasNext_0 = function hasNext_8(){
  return this.it.hasNext_0();
}
;
_.next_1 = function next_9(){
  return this.it.next_1();
}
;
_.remove_0 = function remove_26(){
  $remove_14();
}
;
var Ljava_util_Collections$UnmodifiableCollectionIterator_2_classLit = createForClass('java.util', 'Collections/UnmodifiableCollectionIterator', 146);
function Collections$UnmodifiableList(list){
  this.coll = list;
  this.list = list;
}

defineClass(144, 143, $intern_39, Collections$UnmodifiableList);
_.equals_0 = function equals_18(o){
  return equals_Ljava_lang_Object__Z__devirtual$(this.list, o);
}
;
_.get_1 = function get_5(index_0){
  return this.list.get_1(index_0);
}
;
_.hashCode_0 = function hashCode_23(){
  return hashCode__I__devirtual$(this.list);
}
;
_.isEmpty = function isEmpty_3(){
  return this.list.isEmpty();
}
;
_.listIterator = function listIterator_2(){
  return new Collections$UnmodifiableListIterator(this.list.listIterator_0(0));
}
;
_.listIterator_0 = function listIterator_3(from){
  return new Collections$UnmodifiableListIterator(this.list.listIterator_0(from));
}
;
var Ljava_util_Collections$UnmodifiableList_2_classLit = createForClass('java.util', 'Collections/UnmodifiableList', 144);
function Collections$UnmodifiableListIterator(lit){
  Collections$UnmodifiableCollectionIterator.call(this, lit);
  this.lit = lit;
}

defineClass(147, 146, {}, Collections$UnmodifiableListIterator);
_.remove_0 = function remove_27(){
  $remove_14();
}
;
_.hasPrevious = function hasPrevious_1(){
  return this.lit.hasPrevious();
}
;
_.previous = function previous_2(){
  return this.lit.previous();
}
;
var Ljava_util_Collections$UnmodifiableListIterator_2_classLit = createForClass('java.util', 'Collections/UnmodifiableListIterator', 147);
function Collections$UnmodifiableMap(map_0){
  this.map_0 = map_0;
}

defineClass(209, 1, {70:1}, Collections$UnmodifiableMap);
_.entrySet_0 = function entrySet_0(){
  !this.entrySet && (this.entrySet = new Collections$UnmodifiableMap$UnmodifiableEntrySet(this.map_0.entrySet_0()));
  return this.entrySet;
}
;
_.equals_0 = function equals_19(o){
  return equals_Ljava_lang_Object__Z__devirtual$(this.map_0, o);
}
;
_.get_0 = function get_6(key){
  return this.map_0.get_0(key);
}
;
_.hashCode_0 = function hashCode_24(){
  return hashCode__I__devirtual$(this.map_0);
}
;
_.isEmpty = function isEmpty_4(){
  return this.map_0.isEmpty();
}
;
_.put = function put_1(key, value_0){
  throw toJs(new UnsupportedOperationException);
}
;
_.remove_2 = function remove_28(key){
  throw toJs(new UnsupportedOperationException);
}
;
_.size_1 = function size_8(){
  return this.map_0.size_1();
}
;
_.toString_0 = function toString_29(){
  return toString_14(this.map_0);
}
;
var Ljava_util_Collections$UnmodifiableMap_2_classLit = createForClass('java.util', 'Collections/UnmodifiableMap', 209);
defineClass(210, 143, $intern_38);
_.equals_0 = function equals_20(o){
  return equals_Ljava_lang_Object__Z__devirtual$(this.coll, o);
}
;
_.hashCode_0 = function hashCode_25(){
  return hashCode__I__devirtual$(this.coll);
}
;
var Ljava_util_Collections$UnmodifiableSet_2_classLit = createForClass('java.util', 'Collections/UnmodifiableSet', 210);
function $wrap(array, size_0){
  var i;
  for (i = 0; i < size_0; ++i) {
    setCheck(array, i, new Collections$UnmodifiableMap$UnmodifiableEntrySet$UnmodifiableEntry(castTo(array[i], 23)));
  }
}

function Collections$UnmodifiableMap$UnmodifiableEntrySet(s){
  this.coll = s;
}

defineClass(211, 210, $intern_38, Collections$UnmodifiableMap$UnmodifiableEntrySet);
_.iterator = function iterator_11(){
  var it;
  it = this.coll.iterator();
  return new Collections$UnmodifiableMap$UnmodifiableEntrySet$1(it);
}
;
_.toArray = function toArray_2(a){
  var result;
  result = this.coll.toArray(a);
  $wrap(result, this.coll.size_1());
  return result;
}
;
var Ljava_util_Collections$UnmodifiableMap$UnmodifiableEntrySet_2_classLit = createForClass('java.util', 'Collections/UnmodifiableMap/UnmodifiableEntrySet', 211);
function Collections$UnmodifiableMap$UnmodifiableEntrySet$1(val$it){
  this.val$it2 = val$it;
}

defineClass(213, 1, {}, Collections$UnmodifiableMap$UnmodifiableEntrySet$1);
_.next_1 = function next_10(){
  return new Collections$UnmodifiableMap$UnmodifiableEntrySet$UnmodifiableEntry(castTo(this.val$it2.next_1(), 23));
}
;
_.hasNext_0 = function hasNext_9(){
  return this.val$it2.hasNext_0();
}
;
_.remove_0 = function remove_29(){
  throw toJs(new UnsupportedOperationException);
}
;
var Ljava_util_Collections$UnmodifiableMap$UnmodifiableEntrySet$1_2_classLit = createForClass('java.util', 'Collections/UnmodifiableMap/UnmodifiableEntrySet/1', 213);
function Collections$UnmodifiableMap$UnmodifiableEntrySet$UnmodifiableEntry(entry){
  this.entry = entry;
}

defineClass(145, 1, $intern_40, Collections$UnmodifiableMap$UnmodifiableEntrySet$UnmodifiableEntry);
_.equals_0 = function equals_21(o){
  return this.entry.equals_0(o);
}
;
_.getKey = function getKey_0(){
  return this.entry.getKey();
}
;
_.getValue = function getValue_0(){
  return this.entry.getValue();
}
;
_.hashCode_0 = function hashCode_26(){
  return this.entry.hashCode_0();
}
;
_.setValue = function setValue_0(value_0){
  throw toJs(new UnsupportedOperationException);
}
;
_.toString_0 = function toString_30(){
  return toString_14(this.entry);
}
;
var Ljava_util_Collections$UnmodifiableMap$UnmodifiableEntrySet$UnmodifiableEntry_2_classLit = createForClass('java.util', 'Collections/UnmodifiableMap/UnmodifiableEntrySet/UnmodifiableEntry', 145);
function Collections$UnmodifiableRandomAccessList(list){
  Collections$UnmodifiableList.call(this, list);
}

defineClass(212, 144, {38:1, 37:1, 167:1}, Collections$UnmodifiableRandomAccessList);
var Ljava_util_Collections$UnmodifiableRandomAccessList_2_classLit = createForClass('java.util', 'Collections/UnmodifiableRandomAccessList', 212);
function $clinit_Comparators(){
  $clinit_Comparators = emptyMethod;
  INTERNAL_NATURAL_ORDER = new Comparators$NaturalOrderComparator;
}

var INTERNAL_NATURAL_ORDER;
function $compare(a, b){
  return checkCriticalNotNull(a) , compareTo_Ljava_lang_Object__I__devirtual$(a, (checkCriticalNotNull(b) , b));
}

function Comparators$NaturalOrderComparator(){
}

defineClass(451, 1, $intern_1, Comparators$NaturalOrderComparator);
_.compare = function compare_5(a, b){
  return $compare(castTo(a, 5), castTo(b, 5));
}
;
_.equals_0 = function equals_22(other){
  return this === other;
}
;
var Ljava_util_Comparators$NaturalOrderComparator_2_classLit = createForClass('java.util', 'Comparators/NaturalOrderComparator', 451);
function ConcurrentModificationException(){
  RuntimeException.call(this);
}

defineClass(430, 12, $intern_2, ConcurrentModificationException);
var Ljava_util_ConcurrentModificationException_2_classLit = createForClass('java.util', 'ConcurrentModificationException', 430);
function $compareTo_6(this$static, other){
  return compare_4(fromDouble_0(this$static.jsdate.getTime()), fromDouble_0(other.jsdate.getTime()));
}

function Date_0(date){
  this.jsdate = new $wnd.Date(toDouble_0(date));
}

function padTwo(number){
  return number < 10?'0' + number:'' + number;
}

defineClass(74, 1, {3:1, 5:1, 74:1}, Date_0);
_.compareTo = function compareTo_3(other){
  return $compareTo_6(this, castTo(other, 74));
}
;
_.equals_0 = function equals_23(obj){
  return instanceOf(obj, 74) && eq(fromDouble_0(this.jsdate.getTime()), fromDouble_0(castTo(obj, 74).jsdate.getTime()));
}
;
_.hashCode_0 = function hashCode_27(){
  var time;
  time = fromDouble_0(this.jsdate.getTime());
  return toInt_0(xor_0(time, shru_0(time, 32)));
}
;
_.toString_0 = function toString_31(){
  var hourOffset, minuteOffset, offset;
  offset = -this.jsdate.getTimezoneOffset();
  hourOffset = (offset >= 0?'+':'') + (offset / 60 | 0);
  minuteOffset = padTwo($wnd.Math.abs(offset) % 60);
  return ($clinit_Date$StringData() , DAYS)[this.jsdate.getDay()] + ' ' + MONTHS[this.jsdate.getMonth()] + ' ' + padTwo(this.jsdate.getDate()) + ' ' + padTwo(this.jsdate.getHours()) + ':' + padTwo(this.jsdate.getMinutes()) + ':' + padTwo(this.jsdate.getSeconds()) + ' GMT' + hourOffset + minuteOffset + ' ' + this.jsdate.getFullYear();
}
;
var Ljava_util_Date_2_classLit = createForClass('java.util', 'Date', 74);
function $clinit_Date$StringData(){
  $clinit_Date$StringData = emptyMethod;
  DAYS = stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']);
  MONTHS = stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']);
}

var DAYS, MONTHS;
function HashMap(){
  $reset(this);
}

defineClass(26, 202, {3:1, 70:1}, HashMap);
_.equals_1 = function equals_24(value1, value2){
  return maskUndefined(value1) === maskUndefined(value2) || value1 != null && equals_Ljava_lang_Object__Z__devirtual$(value1, value2);
}
;
_.getHashCode = function getHashCode(key){
  var hashCode;
  if (key == null) {
    return 0;
  }
  hashCode = hashCode__I__devirtual$(key);
  return hashCode | 0;
}
;
var Ljava_util_HashMap_2_classLit = createForClass('java.util', 'HashMap', 26);
function $add_7(this$static, o){
  var old;
  old = $put_1(this$static.map_0, o, this$static);
  return old == null;
}

function $contains_0(this$static, o){
  return $containsKey(this$static.map_0, o);
}

function $remove_15(this$static, o){
  return $remove_8(this$static.map_0, o) != null;
}

function HashSet(){
  this.map_0 = new HashMap;
}

defineClass(92, 508, {3:1, 38:1, 77:1}, HashSet);
_.add_0 = function add_10(o){
  return $add_7(this, o);
}
;
_.contains_0 = function contains_4(o){
  return $contains_0(this, o);
}
;
_.isEmpty = function isEmpty_5(){
  return $size(this.map_0) == 0;
}
;
_.iterator = function iterator_12(){
  var outerIter;
  return outerIter = new AbstractHashMap$EntrySetIterator((new AbstractHashMap$EntrySet((new AbstractMap$1(this.map_0)).this$01)).this$01) , new AbstractMap$1$1(outerIter);
}
;
_.remove_1 = function remove_30(o){
  return $remove_15(this, o);
}
;
_.size_1 = function size_9(){
  return $size(this.map_0);
}
;
var Ljava_util_HashSet_2_classLit = createForClass('java.util', 'HashSet', 92);
function $findEntryInChain(this$static, key, chain){
  var entry, entry$array, entry$index, entry$max;
  for (entry$array = chain , entry$index = 0 , entry$max = entry$array.length; entry$index < entry$max; ++entry$index) {
    entry = entry$array[entry$index];
    if (this$static.host_0.equals_1(key, entry.getKey())) {
      return entry;
    }
  }
  return null;
}

function $getChainOrEmpty(this$static, hashCode){
  var chain;
  chain = this$static.backingMap.get(hashCode);
  return chain == null?initUnidimensionalArray(Ljava_lang_Object_2_classLit, $intern_1, 1, 0, 5, 1):chain;
}

function $getEntry(this$static, key){
  return $findEntryInChain(this$static, key, $getChainOrEmpty(this$static, this$static.host_0.getHashCode(key)));
}

function $put_2(this$static, key, value_0){
  var chain, chain0, entry, hashCode;
  hashCode = this$static.host_0.getHashCode(key);
  chain0 = (chain = this$static.backingMap.get(hashCode) , chain == null?initUnidimensionalArray(Ljava_lang_Object_2_classLit, $intern_1, 1, 0, 5, 1):chain);
  if (chain0.length == 0) {
    this$static.backingMap.set(hashCode, chain0);
  }
   else {
    entry = $findEntryInChain(this$static, key, chain0);
    if (entry) {
      return entry.setValue(value_0);
    }
  }
  setCheck(chain0, chain0.length, new AbstractMap$SimpleEntry(key, value_0));
  ++this$static.size_0;
  ++this$static.host_0.modCount;
  return null;
}

function $remove_16(this$static, key){
  var chain, chain0, entry, hashCode, i;
  hashCode = this$static.host_0.getHashCode(key);
  chain0 = (chain = this$static.backingMap.get(hashCode) , chain == null?initUnidimensionalArray(Ljava_lang_Object_2_classLit, $intern_1, 1, 0, 5, 1):chain);
  for (i = 0; i < chain0.length; i++) {
    entry = chain0[i];
    if (this$static.host_0.equals_1(key, entry.getKey())) {
      if (chain0.length == 1) {
        chain0.length = 0;
        $delete(this$static.backingMap, hashCode);
      }
       else {
        chain0.splice(i, 1);
      }
      --this$static.size_0;
      ++this$static.host_0.modCount;
      return entry.getValue();
    }
  }
  return null;
}

function InternalHashCodeMap(host){
  this.backingMap = newJsMap();
  this.host_0 = host;
}

defineClass(217, 1, {}, InternalHashCodeMap);
_.iterator = function iterator_13(){
  return new InternalHashCodeMap$1(this);
}
;
_.size_0 = 0;
var Ljava_util_InternalHashCodeMap_2_classLit = createForClass('java.util', 'InternalHashCodeMap', 217);
function InternalHashCodeMap$1(this$0){
  this.this$01 = this$0;
  this.chains = this.this$01.backingMap.entries();
  this.chain = initUnidimensionalArray(Ljava_lang_Object_2_classLit, $intern_1, 1, 0, 5, 1);
}

defineClass(151, 1, {}, InternalHashCodeMap$1);
_.next_1 = function next_11(){
  return this.lastEntry = this.chain[this.itemIndex++] , this.lastEntry;
}
;
_.hasNext_0 = function hasNext_10(){
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
_.remove_0 = function remove_31(){
  $remove_16(this.this$01, this.lastEntry.getKey());
  this.itemIndex != 0 && --this.itemIndex;
}
;
_.itemIndex = 0;
_.lastEntry = null;
var Ljava_util_InternalHashCodeMap$1_2_classLit = createForClass('java.util', 'InternalHashCodeMap/1', 151);
function $delete(this$static, key){
  var fn;
  fn = this$static['delete'];
  fn.call(this$static, key);
}

function $delete_0(this$static, key){
  var fn;
  fn = this$static['delete'];
  fn.call(this$static, key);
}

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
function $contains_1(this$static, key){
  return !(this$static.backingMap.get(key) === undefined);
}

function $get_4(this$static, key){
  return this$static.backingMap.get(key);
}

function $put_3(this$static, key, value_0){
  var oldValue;
  oldValue = this$static.backingMap.get(key);
  this$static.backingMap.set(key, value_0 === undefined?null:value_0);
  if (oldValue === undefined) {
    ++this$static.size_0;
    ++this$static.host_0.modCount;
  }
   else {
    ++this$static.valueMod;
  }
  return oldValue;
}

function $remove_17(this$static, key){
  var value_0;
  value_0 = this$static.backingMap.get(key);
  if (value_0 === undefined) {
    ++this$static.valueMod;
  }
   else {
    $delete_0(this$static.backingMap, key);
    --this$static.size_0;
    ++this$static.host_0.modCount;
  }
  return value_0;
}

function InternalStringMap(host){
  this.backingMap = newJsMap();
  this.host_0 = host;
}

defineClass(215, 1, {}, InternalStringMap);
_.iterator = function iterator_14(){
  return new InternalStringMap$1(this);
}
;
_.size_0 = 0;
_.valueMod = 0;
var Ljava_util_InternalStringMap_2_classLit = createForClass('java.util', 'InternalStringMap', 215);
function InternalStringMap$1(this$0){
  this.this$01 = this$0;
  this.entries_0 = this.this$01.backingMap.entries();
  this.current = this.entries_0.next();
}

defineClass(150, 1, {}, InternalStringMap$1);
_.next_1 = function next_12(){
  return this.last = this.current , this.current = this.entries_0.next() , new InternalStringMap$2(this.this$01, this.last, this.this$01.valueMod);
}
;
_.hasNext_0 = function hasNext_11(){
  return !this.current.done;
}
;
_.remove_0 = function remove_32(){
  $remove_17(this.this$01, this.last.value[0]);
}
;
var Ljava_util_InternalStringMap$1_2_classLit = createForClass('java.util', 'InternalStringMap/1', 150);
function $getValue_0(this$static){
  if (this$static.this$01.valueMod != this$static.val$lastValueMod3) {
    return $get_4(this$static.this$01, this$static.val$entry2.value[0]);
  }
  return this$static.val$entry2.value[1];
}

function InternalStringMap$2(this$0, val$entry, val$lastValueMod){
  this.this$01 = this$0;
  this.val$entry2 = val$entry;
  this.val$lastValueMod3 = val$lastValueMod;
}

defineClass(216, 511, $intern_40, InternalStringMap$2);
_.getKey = function getKey_1(){
  return this.val$entry2.value[0];
}
;
_.getValue = function getValue_1(){
  return $getValue_0(this);
}
;
_.setValue = function setValue_1(object){
  return $put_3(this.this$01, this.val$entry2.value[0], object);
}
;
_.val$lastValueMod3 = 0;
var Ljava_util_InternalStringMap$2_2_classLit = createForClass('java.util', 'InternalStringMap/2', 216);
function $recordAccess(this$static, entry){
  if (this$static.accessOrder) {
    $remove_19(entry);
    $addToEnd(entry);
  }
}

function $remove_18(this$static, key){
  var entry;
  entry = castTo($remove_8(this$static.map_0, key), 76);
  if (entry) {
    $remove_19(entry);
    return entry.value_0;
  }
  return null;
}

function LinkedHashMap(){
  $reset(this);
  this.head = new LinkedHashMap$ChainEntry(this);
  this.map_0 = new HashMap;
  this.head.prev = this.head;
  this.head.next_0 = this.head;
}

defineClass(478, 26, {3:1, 70:1}, LinkedHashMap);
_.containsKey = function containsKey_1(key){
  return $containsKey(this.map_0, key);
}
;
_.entrySet_0 = function entrySet_1(){
  return new LinkedHashMap$EntrySet(this);
}
;
_.get_0 = function get_7(key){
  var entry;
  entry = castTo($get_2(this.map_0, key), 76);
  if (entry) {
    $recordAccess(this, entry);
    return entry.value_0;
  }
  return null;
}
;
_.put = function put_2(key, value_0){
  var newEntry, old, oldValue;
  old = castTo($getStringValue(this.map_0, key), 76);
  if (!old) {
    newEntry = new LinkedHashMap$ChainEntry_0(this, key, value_0);
    $putStringValue(this.map_0, key, newEntry);
    $addToEnd(newEntry);
    return null;
  }
   else {
    oldValue = $setValue(old, value_0);
    $recordAccess(this, old);
    return oldValue;
  }
}
;
_.remove_2 = function remove_33(key){
  return $remove_18(this, key);
}
;
_.size_1 = function size_10(){
  return $size(this.map_0);
}
;
_.accessOrder = false;
var Ljava_util_LinkedHashMap_2_classLit = createForClass('java.util', 'LinkedHashMap', 478);
function $addToEnd(this$static){
  var tail;
  tail = this$static.this$01.head.prev;
  this$static.prev = tail;
  this$static.next_0 = this$static.this$01.head;
  tail.next_0 = this$static.this$01.head.prev = this$static;
}

function $remove_19(this$static){
  this$static.next_0.prev = this$static.prev;
  this$static.prev.next_0 = this$static.next_0;
  this$static.next_0 = this$static.prev = null;
}

function LinkedHashMap$ChainEntry(this$0){
  LinkedHashMap$ChainEntry_0.call(this, this$0, null, null);
}

function LinkedHashMap$ChainEntry_0(this$0, key, value_0){
  this.this$01 = this$0;
  AbstractMap$SimpleEntry.call(this, key, value_0);
}

defineClass(76, 117, {76:1, 23:1}, LinkedHashMap$ChainEntry, LinkedHashMap$ChainEntry_0);
var Ljava_util_LinkedHashMap$ChainEntry_2_classLit = createForClass('java.util', 'LinkedHashMap/ChainEntry', 76);
function $contains_2(this$static, o){
  if (instanceOf(o, 23)) {
    return $containsEntry(this$static.this$01, castTo(o, 23));
  }
  return false;
}

function LinkedHashMap$EntrySet(this$0){
  this.this$01 = this$0;
}

defineClass(133, 508, $intern_38, LinkedHashMap$EntrySet);
_.contains_0 = function contains_5(o){
  return $contains_2(this, o);
}
;
_.iterator = function iterator_15(){
  return new LinkedHashMap$EntrySet$EntryIterator(this);
}
;
_.remove_1 = function remove_34(entry){
  var key;
  if ($contains_2(this, entry)) {
    key = castTo(entry, 23).getKey();
    $remove_18(this.this$01, key);
    return true;
  }
  return false;
}
;
_.size_1 = function size_11(){
  return $size(this.this$01.map_0);
}
;
var Ljava_util_LinkedHashMap$EntrySet_2_classLit = createForClass('java.util', 'LinkedHashMap/EntrySet', 133);
function $next_5(this$static){
  checkCriticalConcurrentModification(this$static.this$11.this$01.map_0.modCount, this$static.lastModCount);
  checkCriticalElement(this$static.next_0 != this$static.this$11.this$01.head);
  this$static.last = this$static.next_0;
  this$static.next_0 = this$static.next_0.next_0;
  return this$static.last;
}

function LinkedHashMap$EntrySet$EntryIterator(this$1){
  this.this$11 = this$1;
  this.next_0 = this$1.this$01.head.next_0;
  this.lastModCount = this$1.this$01.map_0.modCount;
}

defineClass(134, 1, {}, LinkedHashMap$EntrySet$EntryIterator);
_.next_1 = function next_13(){
  return $next_5(this);
}
;
_.hasNext_0 = function hasNext_12(){
  return this.next_0 != this.this$11.this$01.head;
}
;
_.remove_0 = function remove_35(){
  checkCriticalState(!!this.last);
  checkCriticalConcurrentModification(this.this$11.this$01.map_0.modCount, this.lastModCount);
  $remove_19(this.last);
  $remove_8(this.this$11.this$01.map_0, this.last.key);
  this.lastModCount = this.this$11.this$01.map_0.modCount;
  this.last = null;
}
;
_.lastModCount = 0;
var Ljava_util_LinkedHashMap$EntrySet$EntryIterator_2_classLit = createForClass('java.util', 'LinkedHashMap/EntrySet/EntryIterator', 134);
function NoSuchElementException(){
  RuntimeException.call(this);
}

defineClass(65, 12, $intern_2, NoSuchElementException);
var Ljava_util_NoSuchElementException_2_classLit = createForClass('java.util', 'NoSuchElementException', 65);
function equals_25(a, b){
  return maskUndefined(a) === maskUndefined(b) || a != null && equals_Ljava_lang_Object__Z__devirtual$(a, b);
}

function hashCode_28(o){
  return o != null?hashCode__I__devirtual$(o):0;
}

function $forEachRemaining_0(this$static, consumer){
  while (this$static.tryAdvance(consumer))
  ;
}

defineClass(454, 1, {});
_.forEachRemaining = function forEachRemaining(consumer){
  $forEachRemaining_0(this, consumer);
}
;
_.characteristics_0 = function characteristics_0(){
  return this.characteristics;
}
;
_.estimateSize_0 = function estimateSize(){
  return this.sizeEstimate;
}
;
_.characteristics = 0;
_.sizeEstimate = 0;
var Ljava_util_Spliterators$BaseSpliterator_2_classLit = createForClass('java.util', 'Spliterators/BaseSpliterator', 454);
function Spliterators$AbstractSpliterator(size_0, characteristics){
  this.sizeEstimate = size_0;
  this.characteristics = (characteristics & 64) != 0?characteristics | 16384:characteristics;
}

defineClass(455, 454, {});
var Ljava_util_Spliterators$AbstractSpliterator_2_classLit = createForClass('java.util', 'Spliterators/AbstractSpliterator', 455);
function $initIterator(this$static){
  if (!this$static.it) {
    this$static.it = new ArrayList$1(this$static.collection);
    this$static.estimateSize = this$static.collection.array.length;
  }
}

function Spliterators$IteratorSpliterator(collection){
  this.collection = (checkCriticalNotNull(collection) , collection);
  this.characteristics = 16464;
}

defineClass(214, 1, {}, Spliterators$IteratorSpliterator);
_.characteristics_0 = function characteristics_1(){
  return this.characteristics;
}
;
_.estimateSize_0 = function estimateSize_0(){
  $initIterator(this);
  return this.estimateSize;
}
;
_.forEachRemaining = function forEachRemaining_0(consumer){
  $initIterator(this);
  $forEachRemaining(this.it, consumer);
}
;
_.tryAdvance = function tryAdvance(consumer){
  checkCriticalNotNull(consumer);
  $initIterator(this);
  if ($hasNext(this.it)) {
    consumer.accept($next_4(this.it));
    return true;
  }
  return false;
}
;
_.characteristics = 0;
_.estimateSize = 0;
var Ljava_util_Spliterators$IteratorSpliterator_2_classLit = createForClass('java.util', 'Spliterators/IteratorSpliterator', 214);
function $add_8(this$static, newElement){
  !this$static.builder?(this$static.builder = new StringBuilder_1(this$static.prefix)):$append_2(this$static.builder, this$static.delimiter);
  $append_0(this$static.builder, newElement);
  return this$static;
}

function StringJoiner(prefix, suffix){
  this.delimiter = ', ';
  this.prefix = prefix;
  this.suffix = suffix;
  this.emptyValue = this.prefix + ('' + this.suffix);
}

defineClass(140, 1, {}, StringJoiner);
_.toString_0 = function toString_32(){
  return !this.builder?this.emptyValue:this.suffix.length == 0?this.builder.string:this.builder.string + ('' + this.suffix);
}
;
var Ljava_util_StringJoiner_2_classLit = createForClass('java.util', 'StringJoiner', 140);
function of(supplier, accumulator, combiner, characteristics){
  checkCriticalNotNull(supplier);
  checkCriticalNotNull(accumulator);
  checkCriticalNotNull(combiner);
  checkCriticalNotNull(characteristics);
  return new CollectorImpl;
}

function $clinit_Collector$Characteristics(){
  $clinit_Collector$Characteristics = emptyMethod;
  CONCURRENT = new Collector$Characteristics('CONCURRENT', 0);
  IDENTITY_FINISH = new Collector$Characteristics('IDENTITY_FINISH', 1);
  UNORDERED = new Collector$Characteristics('UNORDERED', 2);
}

function Collector$Characteristics(enum$name, enum$ordinal){
  Enum.call(this, enum$name, enum$ordinal);
}

function values_11(){
  $clinit_Collector$Characteristics();
  return stampJavaTypeInfo(getClassLiteralForArray(Ljava_util_stream_Collector$Characteristics_2_classLit, 1), $intern_1, 85, 0, [CONCURRENT, IDENTITY_FINISH, UNORDERED]);
}

defineClass(85, 4, {3:1, 5:1, 4:1, 85:1}, Collector$Characteristics);
var CONCURRENT, IDENTITY_FINISH, UNORDERED;
var Ljava_util_stream_Collector$Characteristics_2_classLit = createForEnum('java.util.stream', 'Collector/Characteristics', 85, values_11);
function CollectorImpl(){
  $clinit_Collections();
}

defineClass(479, 1, {}, CollectorImpl);
var Ljava_util_stream_CollectorImpl_2_classLit = createForClass('java.util.stream', 'CollectorImpl', 479);
function Collectors$20methodref$add$Type(){
}

defineClass(471, 1, {}, Collectors$20methodref$add$Type);
var Ljava_util_stream_Collectors$20methodref$add$Type_2_classLit = createForClass('java.util.stream', 'Collectors/20methodref$add$Type', 471);
function Collectors$21methodref$ctor$Type(){
}

defineClass(473, 1, {}, Collectors$21methodref$ctor$Type);
var Ljava_util_stream_Collectors$21methodref$ctor$Type_2_classLit = createForClass('java.util.stream', 'Collectors/21methodref$ctor$Type', 473);
function Collectors$lambda$42$Type(){
}

defineClass(472, 1, {}, Collectors$lambda$42$Type);
var Ljava_util_stream_Collectors$lambda$42$Type_2_classLit = createForClass('java.util.stream', 'Collectors/lambda$42$Type', 472);
function $terminate(this$static){
  if (!this$static.root) {
    $throwIfTerminated(this$static);
    this$static.terminated = true;
  }
   else {
    $terminate(this$static.root);
  }
}

function $throwIfTerminated(this$static){
  if (this$static.root) {
    $throwIfTerminated(this$static.root);
  }
   else if (this$static.terminated) {
    throw toJs(new IllegalStateException_0("Stream already terminated, can't be modified or used"));
  }
}

function TerminatableStream(previous){
  if (!previous) {
    this.root = null;
    new ArrayList;
  }
   else {
    this.root = previous;
  }
}

defineClass(453, 1, {});
_.terminated = false;
var Ljava_util_stream_TerminatableStream_2_classLit = createForClass('java.util.stream', 'TerminatableStream', 453);
function $map(this$static, mapper){
  $throwIfTerminated(this$static);
  return new StreamImpl(this$static, new StreamImpl$MapToObjSpliterator(mapper, this$static.spliterator));
}

function $reduce(this$static, identity){
  var consumer;
  $terminate(this$static);
  consumer = new StreamImpl$ValueConsumer;
  consumer.value_0 = identity;
  this$static.spliterator.forEachRemaining(new StreamImpl$lambda$5$Type(consumer));
  return consumer.value_0;
}

function StreamImpl(prev, spliterator){
  TerminatableStream.call(this, prev);
  this.spliterator = spliterator;
}

function lambda$4(a_1, t_2){
  castTo(a_1, 38).add_0(t_2);
  return a_1;
}

function lambda$5(consumer_0, item_2){
  $accept(consumer_0, lambda$4(consumer_0.value_0, item_2));
}

defineClass(109, 453, {109:1}, StreamImpl);
var Ljava_util_stream_StreamImpl_2_classLit = createForClass('java.util.stream', 'StreamImpl', 109);
function StreamImpl$MapToObjSpliterator(map_0, original){
  Spliterators$AbstractSpliterator.call(this, original.estimateSize_0(), original.characteristics_0() & -6);
  checkCriticalNotNull(map_0);
  this.original = original;
}

defineClass(456, 455, {}, StreamImpl$MapToObjSpliterator);
_.tryAdvance = function tryAdvance_0(action){
  return this.original.tryAdvance(new StreamImpl$MapToObjSpliterator$lambda$0$Type(action));
}
;
var Ljava_util_stream_StreamImpl$MapToObjSpliterator_2_classLit = createForClass('java.util.stream', 'StreamImpl/MapToObjSpliterator', 456);
function StreamImpl$MapToObjSpliterator$lambda$0$Type(action_1){
  this.action_1 = action_1;
}

defineClass(458, 1, {}, StreamImpl$MapToObjSpliterator$lambda$0$Type);
_.accept = function accept(arg0){
  this.action_1.accept(getElementOf(castTo(arg0, 61)));
}
;
var Ljava_util_stream_StreamImpl$MapToObjSpliterator$lambda$0$Type_2_classLit = createForClass('java.util.stream', 'StreamImpl/MapToObjSpliterator/lambda$0$Type', 458);
function $accept(this$static, value_0){
  this$static.value_0 = value_0;
}

function StreamImpl$ValueConsumer(){
}

defineClass(457, 1, {}, StreamImpl$ValueConsumer);
_.accept = function accept_0(value_0){
  $accept(this, value_0);
}
;
var Ljava_util_stream_StreamImpl$ValueConsumer_2_classLit = createForClass('java.util.stream', 'StreamImpl/ValueConsumer', 457);
function $accept_0(this$static, arg0){
  lambda$5(this$static.consumer_0, arg0);
}

function StreamImpl$lambda$5$Type(consumer_0){
  this.consumer_0 = consumer_0;
}

defineClass(459, 1, {}, StreamImpl$lambda$5$Type);
_.accept = function accept_1(arg0){
  $accept_0(this, arg0);
}
;
var Ljava_util_stream_StreamImpl$lambda$5$Type_2_classLit = createForClass('java.util.stream', 'StreamImpl/lambda$5$Type', 459);
function insertTo(array, index_0, value_0){
  array.splice(index_0, 0, value_0);
}

function push_1(array, o){
  array.push(o);
}

function removeFrom(array, index_0){
  array.splice(index_0, 1);
}

defineClass(569, 1, {});
function stampJavaTypeInfo_0(array, referenceType){
  return getElementTypeCategory(referenceType) != 10 && stampJavaTypeInfo(getClass__Ljava_lang_Class___devirtual$(referenceType), referenceType.castableTypeMap, referenceType.__elementTypeId$, getElementTypeCategory(referenceType), array) , array;
}

function getObjectIdentityHashCode(o){
  return o.$H || (o.$H = ++nextHash);
}

var nextHash = 0;
function checkCriticalArgument(expression, errorMessage){
  if (!expression) {
    throw toJs(new IllegalArgumentException_0(errorMessage));
  }
}

function checkCriticalArrayBounds(end, length_0){
  if (0 > end) {
    throw toJs(new IllegalArgumentException_0('fromIndex: 0 > toIndex: ' + end));
  }
  if (end > length_0) {
    throw toJs(new ArrayIndexOutOfBoundsException('fromIndex: 0, toIndex: ' + end + ', length: ' + length_0));
  }
}

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
    throw toJs(new IndexOutOfBoundsException_0('Index: ' + index_0 + ', Size: ' + size_0));
  }
}

function checkCriticalNotNull(reference){
  if (reference == null) {
    throw toJs(new NullPointerException);
  }
  return reference;
}

function checkCriticalNotNull_0(reference){
  if (!reference) {
    throw toJs(new NullPointerException_0('Cannot suppress a null exception.'));
  }
}

function checkCriticalPositionIndex(index_0, size_0){
  if (index_0 < 0 || index_0 > size_0) {
    throw toJs(new IndexOutOfBoundsException_0('Index: ' + index_0 + ', Size: ' + size_0));
  }
}

function checkCriticalState(expression){
  if (!expression) {
    throw toJs(new IllegalStateException);
  }
}

function checkCriticalState_0(expression){
  if (!expression) {
    throw toJs(new IllegalStateException_0("Can't overwrite cause"));
  }
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

defineClass(561, 1, {});
function $onModuleLoad_0(this$static){
  var messages;
  messages = new ResourceBundle;
  messageBundle = messages;
  $loadBundle(messages, ($clinit_Impl() , $moduleBase) + 'messages/', 'WidgetsMessages', true, this$static);
}

function WidgetModule(){
}

defineClass(173, 1, {}, WidgetModule);
_.bundleLoaded = function bundleLoaded(bundleName){
}
;
var Lorg_pentaho_gwt_widgets_client_WidgetModule_2_classLit = createForClass('org.pentaho.gwt.widgets.client', 'WidgetModule', 173);
function $clinit_ThemeableImageButton(){
  $clinit_ThemeableImageButton = emptyMethod;
  $clinit_Image();
  BLANK_IMAGE = getFullyQualifiedURL() + 'content/common-ui/resources/themes/images/spacer.gif';
}

function $addDisabledStyle(this$static, style){
  var s, s$array, s$index, s$max;
  for (s$array = style , s$index = 0 , s$max = s$array.length; s$index < s$max; ++s$index) {
    s = s$array[s$index];
    $add_7(this$static.disabledStyles, s);
  }
}

function $addEnabledStyle(this$static, style){
  var s, s$array, s$index, s$max;
  for (s$array = style , s$index = 0 , s$max = s$array.length; s$index < s$max; ++s$index) {
    s = s$array[s$index];
    $add_7(this$static.enabledStyles, s);
  }
}

function $disable(this$static){
  var entry, outerIter, style, style$iterator;
  ($clinit_DOM() , this$static.element).className = '';
  for (style$iterator = (outerIter = new AbstractHashMap$EntrySetIterator((new AbstractHashMap$EntrySet((new AbstractMap$1(this$static.disabledStyles.map_0)).this$01)).this$01) , new AbstractMap$1$1(outerIter)); style$iterator.val$outerIter2.hasNext;) {
    style = (entry = $next_3(style$iterator.val$outerIter2) , castToString(entry.getKey()));
    setStyleName(this$static.element, style, true);
  }
}

function $enable(this$static){
  var entry, outerIter, style, style$iterator;
  ($clinit_DOM() , this$static.element).className = '';
  for (style$iterator = (outerIter = new AbstractHashMap$EntrySetIterator((new AbstractHashMap$EntrySet((new AbstractMap$1(this$static.enabledStyles.map_0)).this$01)).this$01) , new AbstractMap$1$1(outerIter)); style$iterator.val$outerIter2.hasNext;) {
    style = (entry = $next_3(style$iterator.val$outerIter2) , castToString(entry.getKey()));
    setStyleName(this$static.element, style, true);
  }
}

function $updateStyles(this$static){
  this$static.isEnabled?$enable(this$static):$disable(this$static);
}

function ThemeableImageButton(tooltip){
  $clinit_ThemeableImageButton();
  ThemeableImageButton_0.call(this, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, ['pentaho-filechooseupbutton']), stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, [null]), tooltip);
}

function ThemeableImageButton_0(enabledStyles, disabledStyles, tooltip){
  Image_2.call(this, BLANK_IMAGE);
  this.isEnabled = true;
  this.enabledStyles = new HashSet;
  this.disabledStyles = new HashSet;
  $reset(this.enabledStyles.map_0);
  $reset(this.disabledStyles.map_0);
  $add_7(this.enabledStyles, 'image-button');
  $add_7(this.disabledStyles, 'disabled-image-button');
  $clinit_Roles();
  $set(BUTTON, ($clinit_DOM() , this.element));
  this.element.tabIndex = 0;
  enabledStyles.length > 0 && $addEnabledStyle(this, enabledStyles);
  enabledStyles.length > 0 && $addDisabledStyle(this, disabledStyles);
  tooltip != null && tooltip.length > 0 && (tooltip == null || tooltip.length == 0?(this.element.removeAttribute('title') , undefined):$setAttribute(this.element, 'title', tooltip));
  $enable(this);
  $addDomHandler(this, new ThemeableImageButton$1(this), ($clinit_MouseDownEvent() , $clinit_MouseDownEvent() , TYPE_3));
  $addDomHandler(this, new ThemeableImageButton$2(this), ($clinit_MouseUpEvent() , $clinit_MouseUpEvent() , TYPE_7));
  $addDomHandler(this, new ThemeableImageButton$3(this), ($clinit_MouseOverEvent() , $clinit_MouseOverEvent() , TYPE_6));
  $addDomHandler(this, new ThemeableImageButton$4(this), ($clinit_KeyDownEvent() , $clinit_KeyDownEvent() , TYPE_1));
  $addDomHandler(this, new ThemeableImageButton$5(this), ($clinit_KeyUpEvent() , $clinit_KeyUpEvent() , TYPE_2));
  $addDomHandler(this, new ThemeableImageButton$6(this), ($clinit_MouseOutEvent() , $clinit_MouseOutEvent() , TYPE_5));
}

defineClass(162, 104, $intern_26, ThemeableImageButton);
_.isEnabled = false;
var BLANK_IMAGE;
var Lorg_pentaho_gwt_widgets_client_buttons_ThemeableImageButton_2_classLit = createForClass('org.pentaho.gwt.widgets.client.buttons', 'ThemeableImageButton', 162);
function ThemeableImageButton$1(this$0){
  this.this$01 = this$0;
}

defineClass(329, 1, {168:1, 21:1}, ThemeableImageButton$1);
_.onMouseDown = function onMouseDown_2(event_0){
  if (this.this$01.isEnabled) {
    $removeStyleName(this.this$01, 'disabled-image-button-pressed');
    $addStyleName(this.this$01, 'image-button-pressed');
  }
   else {
    $removeStyleName(this.this$01, 'image-button-pressed');
    $addStyleName(this.this$01, 'disabled-image-button-pressed');
  }
  !!event_0.nativeEvent && (event_0.nativeEvent.preventDefault() , undefined);
}
;
var Lorg_pentaho_gwt_widgets_client_buttons_ThemeableImageButton$1_2_classLit = createForClass('org.pentaho.gwt.widgets.client.buttons', 'ThemeableImageButton/1', 329);
function ThemeableImageButton$2(this$0){
  this.this$01 = this$0;
}

defineClass(330, 1, {169:1, 21:1}, ThemeableImageButton$2);
_.onMouseUp = function onMouseUp_2(event_0){
  $updateStyles(this.this$01);
  !!event_0.nativeEvent && (event_0.nativeEvent.preventDefault() , undefined);
}
;
var Lorg_pentaho_gwt_widgets_client_buttons_ThemeableImageButton$2_2_classLit = createForClass('org.pentaho.gwt.widgets.client.buttons', 'ThemeableImageButton/2', 330);
function ThemeableImageButton$3(this$0){
  this.this$01 = this$0;
}

defineClass(331, 1, {171:1, 21:1}, ThemeableImageButton$3);
_.onMouseOver = function onMouseOver_1(event_0){
  if (this.this$01.isEnabled) {
    $removeStyleName(this.this$01, 'disabled-image-button-over');
    $addStyleName(this.this$01, 'image-button-over');
  }
   else {
    $removeStyleName(this.this$01, 'image-button-over');
    $addStyleName(this.this$01, 'disabled-image-button-over');
  }
  !!event_0.nativeEvent && (event_0.nativeEvent.preventDefault() , undefined);
}
;
var Lorg_pentaho_gwt_widgets_client_buttons_ThemeableImageButton$3_2_classLit = createForClass('org.pentaho.gwt.widgets.client.buttons', 'ThemeableImageButton/3', 331);
function ThemeableImageButton$4(this$0){
  this.this$01 = this$0;
}

defineClass(332, 1, $intern_42, ThemeableImageButton$4);
_.onKeyDown = function onKeyDown(keyDownEvent){
  switch (keyDownEvent.nativeEvent.keyCode | 0) {
    case 32:
      !!keyDownEvent.nativeEvent && (keyDownEvent.nativeEvent.preventDefault() , undefined);
      break;
    case 13:
      !!keyDownEvent.nativeEvent && (keyDownEvent.nativeEvent.preventDefault() , undefined);
      click_0($getElement(this.this$01));
  }
}
;
var Lorg_pentaho_gwt_widgets_client_buttons_ThemeableImageButton$4_2_classLit = createForClass('org.pentaho.gwt.widgets.client.buttons', 'ThemeableImageButton/4', 332);
function ThemeableImageButton$5(this$0){
  this.this$01 = this$0;
}

defineClass(333, 1, {528:1, 21:1}, ThemeableImageButton$5);
_.onKeyUp = function onKeyUp(keyUpEvent){
  if (32 == (keyUpEvent.nativeEvent.keyCode | 0)) {
    !!keyUpEvent.nativeEvent && (keyUpEvent.nativeEvent.preventDefault() , undefined);
    click_0($getElement(this.this$01));
  }
}
;
var Lorg_pentaho_gwt_widgets_client_buttons_ThemeableImageButton$5_2_classLit = createForClass('org.pentaho.gwt.widgets.client.buttons', 'ThemeableImageButton/5', 333);
function ThemeableImageButton$6(this$0){
  this.this$01 = this$0;
}

defineClass(334, 1, {170:1, 21:1}, ThemeableImageButton$6);
_.onMouseOut = function onMouseOut_1(event_0){
  $updateStyles(this.this$01);
}
;
var Lorg_pentaho_gwt_widgets_client_buttons_ThemeableImageButton$6_2_classLit = createForClass('org.pentaho.gwt.widgets.client.buttons', 'ThemeableImageButton/6', 334);
function $center_0(this$static){
  $center(this$static);
  this$static.showing && !$equals_1('hidden', ($clinit_DOM() , this$static.element).style['visibility']) && isOpen(($clinit_DOM() , this$static.element)) && autoFocus(($clinit_DOM() , this$static.element));
}

function $eventTargetIsFocusable(event_0){
  var element, target;
  target = $eventGetTarget(event_0);
  if (!is_0(target)) {
    return false;
  }
  element = target;
  if ($equalsIgnoreCase(element.tagName, 'option')) {
    return !!$getParentElement(element) && isFocusable($getParentElement(element));
  }
  return isFocusable(element);
}

function $hide_1(this$static, autoClosed){
  $unregisterResizeHandler(this$static);
  isOpen(($clinit_DOM() , this$static.element)) && close_0(this$static.element);
  $hide_0(this$static, autoClosed);
}

function $initializePageBackground(){
  if (!pageBackground) {
    pageBackground = new DialogBox$1_0;
    $add_1(($clinit_RootPanel() , get_0()), pageBackground);
  }
}

function $onResize_0(this$static){
  $center(this$static);
  this$static.showing && !$equals_1('hidden', ($clinit_DOM() , this$static.element).style['visibility']) && isOpen(($clinit_DOM() , this$static.element)) && autoFocus(($clinit_DOM() , this$static.element));
}

function $replaceDomStyleName(this$static, newStyleName, oldStyleName){
  oldStyleName != null && setStyleName($getParentElement(($clinit_DOM() , $clinit_DOM() , $getFirstChildElement(this$static.element))), oldStyleName, false);
  newStyleName != null && setStyleName($getParentElement(($clinit_DOM() , $clinit_DOM() , $getFirstChildElement(this$static.element))), newStyleName, true);
}

function $setAriaDescribedBy(this$static, describedById){
  null == describedById || $equals_1('', $trim(describedById))?($clinit_Roles() , $removeAriaDescribedbyProperty(($clinit_DOM() , this$static.element))):($clinit_Roles() , $setAriaDescribedbyProperty(($clinit_DOM() , this$static.element), stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_aria_client_Id_2_classLit, 1), $intern_1, 58, 0, [new Id_0(describedById)])));
}

function $setAriaRole(this$static, ariaRole){
  !ariaRole && (ariaRole = ($clinit_Roles() , $clinit_Roles() , DIALOG));
  $set(ariaRole, ($clinit_DOM() , this$static.element));
}

function $setDomModal(this$static, modal){
  modal?setStyleName($getParentElement(($clinit_DOM() , $clinit_DOM() , $getFirstChildElement(this$static.element))), 'modal', true):setStyleName($getParentElement(($clinit_DOM() , $clinit_DOM() , $getFirstChildElement(this$static.element))), 'modal', false);
  $setAttribute(($clinit_DOM() , this$static.element), 'aria-modal', ($clinit_Boolean() , '' + modal));
}

function $setFocusButtons(this$static, focusButtons){
  this$static.focusButtons = focusButtons;
  isOpen(($clinit_DOM() , this$static.element)) && setButtons(this$static.element, getElementsOf(this$static.focusButtons));
  this$static.showing && !$equals_1('hidden', this$static.element.style['visibility']) && isOpen(this$static.element) && autoFocus(this$static.element);
}

function $setFocusWidget(this$static, widget){
  !!this$static.focusWidget && setAutoFocus($getElement(this$static.focusWidget), false);
  this$static.focusWidget = widget;
  if (this$static.focusWidget) {
    setAutoFocus($getElement(this$static.focusWidget), true);
    this$static.showing && !$equals_1('hidden', ($clinit_DOM() , this$static.element).style['visibility']) && isOpen(($clinit_DOM() , this$static.element)) && autoFocus(($clinit_DOM() , this$static.element));
  }
}

function $setMinimumHeightCategory(this$static, minimumHeightCategory){
  if (!minimumHeightCategory) {
    throw toJs(new IllegalArgumentException_0("Argument 'minimumHeightCategory' cannot be null."));
  }
  if (this$static.minimumHeightCategory != minimumHeightCategory) {
    $updateMinimumHeightCategory(this$static, minimumHeightCategory, this$static.minimumHeightCategory);
    this$static.minimumHeightCategory = minimumHeightCategory;
  }
}

function $setResponsive(this$static){
  if (!this$static.responsive) {
    this$static.responsive = true;
    setStyleName($getParentElement(($clinit_DOM() , $clinit_DOM() , $getFirstChildElement(this$static.element))), 'responsive', true);
  }
}

function $setSizingMode(this$static, sizingMode){
  if (!sizingMode) {
    throw toJs(new IllegalArgumentException_0("Argument 'sizingMode' cannot be null."));
  }
  if (sizingMode != this$static.sizingMode) {
    $updateDomSizingMode(this$static, sizingMode, this$static.sizingMode);
    this$static.sizingMode = sizingMode;
  }
}

function $setWidthCategory(this$static, widthCategory){
  if (!widthCategory) {
    throw toJs(new IllegalArgumentException_0("Argument 'widthCategory' cannot be null."));
  }
  if (this$static.widthCategory != widthCategory) {
    $updateDomWidthCategory(this$static, widthCategory, this$static.widthCategory);
    this$static.widthCategory = widthCategory;
  }
}

function $show_0(this$static){
  var trapFocus, pageBgPanel;
  if (this$static.showing) {
    return;
  }
  !this$static.resizeRegistration && (this$static.resizeRegistration = addResizeHandler(new DialogBox$0methodref$onResize$Type(this$static)));
  !this$static.resizeHandlerRegistration && (this$static.resizeHandlerRegistration = addResizeHandler(new DialogBox$1(this$static)));
  $show(this$static);
  if (this$static.modal) {
    $initializePageBackground();
    pageBgPanel = pageBackground;
    ($clinit_DOM() , pageBgPanel.element).style['width'] = '100%';
    pageBgPanel.element.style['height'] = '100%';
    setVisible(pageBgPanel.element, true);
    pageBgPanel.element.style['display'] = ($clinit_Style$Display() , 'block');
    ++dialogDepthCount;
  }
  toggleEmbedVisibility_0(false);
  $show_1(($clinit_GlassPane() , $clinit_GlassPane() , instance_2));
  trapFocus = this$static.modal;
  open_1(($clinit_DOM() , this$static.element), getElementsOf(this$static.focusButtons), trapFocus, true, null);
}

function $unregisterResizeHandler(this$static){
  if (this$static.resizeRegistration) {
    $removeHandler(this$static.resizeRegistration.real);
    this$static.resizeRegistration = null;
  }
}

function $updateDomSizingMode(this$static, newSizingMode, oldSizingMode){
  $replaceDomStyleName(this$static, newSizingMode.styleName, oldSizingMode?oldSizingMode.styleName:null);
}

function $updateDomWidthCategory(this$static, newWidthCategory, oldWidthCategory){
  $replaceDomStyleName(this$static, newWidthCategory?newWidthCategory.styleName:null, oldWidthCategory?oldWidthCategory.styleName:null);
}

function $updateMinimumHeightCategory(this$static, newMinimumHeightCategory, oldMinimumHeightCategory){
  $replaceDomStyleName(this$static, newMinimumHeightCategory?newMinimumHeightCategory.styleName:null, oldMinimumHeightCategory?oldMinimumHeightCategory.styleName:null);
}

function DialogBox_0(){
  var labelWidget;
  DialogBox.call(this, new DialogBox$CaptionImpl);
  this.focusWidget = null;
  this.focusButtons = null;
  this.sizingMode = ($clinit_DialogBox$DialogSizingMode() , SIZE_TO_CONTENT);
  this.widthCategory = ($clinit_DialogBox$DialogWidthCategory() , MAXIMUM);
  this.minimumHeightCategory = ($clinit_DialogBox$DialogMinimumHeightCategory() , MINIMUM);
  $addHandler_0(this, new ListenerWrapper$WrappedPopupListener(this), TYPE_13?TYPE_13:(TYPE_13 = new GwtEvent$Type));
  setStylePrimaryName($getParentElement(($clinit_DOM() , $clinit_DOM() , $getFirstChildElement(this.element))), 'pentaho-dialog');
  setStyleName($getParentElement((null , $getFirstChildElement(this.element))), 'pentaho-gwt', true);
  $updateDomSizingMode(this, this.sizingMode, null);
  $updateDomWidthCategory(this, this.widthCategory, null);
  $updateMinimumHeightCategory(this, this.minimumHeightCategory, null);
  $setAriaRole(this, null);
  $setDomModal(this, this.modal);
  labelWidget = this.caption;
  $clinit_Roles();
  $set(HEADING, labelWidget.element);
  $setAriaLevelProperty(labelWidget.element);
  $setAriaLabelledbyProperty(this.element, stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_aria_client_Id_2_classLit, 1), $intern_1, 58, 0, [new Id_0(ensureId(labelWidget))]));
  $set(PRESENTATION, $getFirstChildElement($getFirstChildElement(this.element)));
}

function getElementOf(focusable){
  return focusable?$getElement(castTo(focusable, 6)):null;
}

function getElementsOf(focusables){
  var collected, lastArg, lastArg0;
  return focusables?(collected = castTo($reduce((lastArg0 = $map(new StreamImpl(null, new Spliterators$IteratorSpliterator(focusables)), new DialogBox$1methodref$getElementOf$Type) , of(new Collectors$21methodref$ctor$Type, new Collectors$20methodref$add$Type, new Collectors$lambda$42$Type, stampJavaTypeInfo(getClassLiteralForArray(Ljava_util_stream_Collector$Characteristics_2_classLit, 1), $intern_1, 85, 0, [($clinit_Collector$Characteristics() , IDENTITY_FINISH)])) , lastArg0), (lastArg = new ArrayList , lastArg)), 37) , castToJsoArray(collected.toArray(initUnidimensionalArray(Lcom_google_gwt_core_client_JavaScriptObject_2_classLit, $intern_43, 0, collected.size_1(), 2, 1)), 135)):null;
}

function setAutoFocus(element, isAutoFocus){
  isAutoFocus?(element.setAttribute('autofocus', '') , undefined):(element.removeAttribute('autofocus') , undefined);
}

defineClass(266, 152, $intern_44);
_.hide = function hide_1(autoClosed){
  $hide_1(this, autoClosed);
}
;
_.onPopupClosed = function onPopupClosed(sender, autoClosed){
  if (this.modal) {
    --dialogDepthCount;
    if (dialogDepthCount <= 0) {
      $setVisible(pageBackground);
      !$equals_1('hidden', ($clinit_DOM() , this.element).style['visibility']) && toggleEmbedVisibility_0(true);
      dialogDepthCount = 0;
    }
  }
  $hide_2(($clinit_GlassPane() , $clinit_GlassPane() , instance_2));
}
;
_.onPreviewNativeEvent = function onPreviewNativeEvent_3(event_0){
  var nativeEvent;
  switch ($getTypeInt(event_0.nativeEvent)) {
    case 128:
      {
        switch (event_0.nativeEvent.keyCode | 0) {
          case 27:
            event_0.isCanceled = true;
            $hide_1(this, false);
        }
        break;
      }

    case 4:
    case $intern_22:
      {
        nativeEvent = event_0.nativeEvent;
        !event_0.isCanceled && (this.eventTargetsPopup(nativeEvent) || this.eventTargetsPartner(nativeEvent)) && !$eventTargetIsFocusable(nativeEvent) && (nativeEvent.preventDefault() , undefined);
        break;
      }

  }
  $onPreviewNativeEvent(this, event_0);
}
;
_.responsive = false;
var dialogDepthCount = 0, pageBackground = null;
var Lorg_pentaho_gwt_widgets_client_dialogs_DialogBox_2_classLit = createForClass('org.pentaho.gwt.widgets.client.dialogs', 'DialogBox', 266);
function DialogBox$0methodref$onResize$Type($$outer_0){
  this.$$outer_0 = $$outer_0;
}

defineClass(279, 1, $intern_20, DialogBox$0methodref$onResize$Type);
_.onResize = function onResize_3(arg0){
  $onResize_0(this.$$outer_0);
}
;
var Lorg_pentaho_gwt_widgets_client_dialogs_DialogBox$0methodref$onResize$Type_2_classLit = createForClass('org.pentaho.gwt.widgets.client.dialogs', 'DialogBox/0methodref$onResize$Type', 279);
function $lambda$0(this$static){
  ++this$static.clickCount;
  if (this$static.clickCount > 2) {
    this$static.clickCount = 0;
    setVisible(($clinit_DOM() , this$static.element), false);
  }
}

function DialogBox$1_0(){
  $clinit_FocusPanel();
  SimplePanel_0.call(this, createFocusable0(($clinit_FocusImpl() , focusHandler_0)?focusHandler_0:(focusHandler_0 = $createFocusHandler())));
  this.clickCount = 0;
  ($clinit_DOM() , this.element).className = 'glasspane';
  $addClickListener_0(this, new DialogBox$1$lambda$0$Type(this));
}

defineClass(277, 276, $intern_30, DialogBox$1_0);
_.clickCount = 0;
var Lorg_pentaho_gwt_widgets_client_dialogs_DialogBox$1_2_classLit = createForClass('org.pentaho.gwt.widgets.client.dialogs', 'DialogBox/1', 277);
function DialogBox$1$lambda$0$Type($$outer_0){
  this.$$outer_0 = $$outer_0;
}

defineClass(278, 1, $intern_45, DialogBox$1$lambda$0$Type);
_.onClick_0 = function onClick_0(arg0){
  $lambda$0(this.$$outer_0);
}
;
var Lorg_pentaho_gwt_widgets_client_dialogs_DialogBox$1$lambda$0$Type_2_classLit = createForClass('org.pentaho.gwt.widgets.client.dialogs', 'DialogBox/1/lambda$0$Type', 278);
function DialogBox$1methodref$getElementOf$Type(){
}

defineClass(280, 1, {}, DialogBox$1methodref$getElementOf$Type);
var Lorg_pentaho_gwt_widgets_client_dialogs_DialogBox$1methodref$getElementOf$Type_2_classLit = createForClass('org.pentaho.gwt.widgets.client.dialogs', 'DialogBox/1methodref$getElementOf$Type', 280);
function $clinit_DialogBox$DialogMinimumHeightCategory(){
  $clinit_DialogBox$DialogMinimumHeightCategory = emptyMethod;
  CONTENT = new DialogBox$DialogMinimumHeightCategory('CONTENT', 0, 'dmh-content');
  MINIMUM = new DialogBox$DialogMinimumHeightCategory('MINIMUM', 1, null);
}

function DialogBox$DialogMinimumHeightCategory(enum$name, enum$ordinal, styleName){
  Enum.call(this, enum$name, enum$ordinal);
  this.styleName = styleName;
}

function values_12(){
  $clinit_DialogBox$DialogMinimumHeightCategory();
  return stampJavaTypeInfo(getClassLiteralForArray(Lorg_pentaho_gwt_widgets_client_dialogs_DialogBox$DialogMinimumHeightCategory_2_classLit, 1), $intern_1, 101, 0, [CONTENT, MINIMUM]);
}

defineClass(101, 4, {3:1, 5:1, 4:1, 101:1}, DialogBox$DialogMinimumHeightCategory);
var CONTENT, MINIMUM;
var Lorg_pentaho_gwt_widgets_client_dialogs_DialogBox$DialogMinimumHeightCategory_2_classLit = createForEnum('org.pentaho.gwt.widgets.client.dialogs', 'DialogBox/DialogMinimumHeightCategory', 101, values_12);
function $clinit_DialogBox$DialogSizingMode(){
  $clinit_DialogBox$DialogSizingMode = emptyMethod;
  SIZE_TO_CONTENT = new DialogBox$DialogSizingMode('SIZE_TO_CONTENT', 0, null);
  FILL_VIEWPORT_WIDTH = new DialogBox$DialogSizingMode('FILL_VIEWPORT_WIDTH', 1, 'ds-fill-viewport-width');
  FILL_VIEWPORT = new DialogBox$DialogSizingMode('FILL_VIEWPORT', 2, 'ds-fill-viewport');
  FULL_VIEWPORT = new DialogBox$DialogSizingMode('FULL_VIEWPORT', 3, 'ds-full-viewport');
}

function DialogBox$DialogSizingMode(enum$name, enum$ordinal, styleName){
  Enum.call(this, enum$name, enum$ordinal);
  this.styleName = styleName;
}

function values_13(){
  $clinit_DialogBox$DialogSizingMode();
  return stampJavaTypeInfo(getClassLiteralForArray(Lorg_pentaho_gwt_widgets_client_dialogs_DialogBox$DialogSizingMode_2_classLit, 1), $intern_1, 80, 0, [SIZE_TO_CONTENT, FILL_VIEWPORT_WIDTH, FILL_VIEWPORT, FULL_VIEWPORT]);
}

defineClass(80, 4, {3:1, 5:1, 4:1, 80:1}, DialogBox$DialogSizingMode);
var FILL_VIEWPORT, FILL_VIEWPORT_WIDTH, FULL_VIEWPORT, SIZE_TO_CONTENT;
var Lorg_pentaho_gwt_widgets_client_dialogs_DialogBox$DialogSizingMode_2_classLit = createForEnum('org.pentaho.gwt.widgets.client.dialogs', 'DialogBox/DialogSizingMode', 80, values_13);
function $clinit_DialogBox$DialogWidthCategory(){
  $clinit_DialogBox$DialogWidthCategory = emptyMethod;
  MINIMUM_0 = new DialogBox$DialogWidthCategory('MINIMUM', 0, 'dw-min');
  TEXT = new DialogBox$DialogWidthCategory('TEXT', 1, 'dw-text');
  EXTRA_SMALL = new DialogBox$DialogWidthCategory('EXTRA_SMALL', 2, 'dw-xs');
  SMALL = new DialogBox$DialogWidthCategory('SMALL', 3, 'dw-sm');
  MEDIUM = new DialogBox$DialogWidthCategory('MEDIUM', 4, 'dw-md');
  LARGE = new DialogBox$DialogWidthCategory('LARGE', 5, 'dw-lg');
  EXTRA_LARGE = new DialogBox$DialogWidthCategory('EXTRA_LARGE', 6, 'dw-xl');
  MAXIMUM = new DialogBox$DialogWidthCategory('MAXIMUM', 7, null);
}

function DialogBox$DialogWidthCategory(enum$name, enum$ordinal, styleName){
  Enum.call(this, enum$name, enum$ordinal);
  this.styleName = styleName;
}

function values_14(){
  $clinit_DialogBox$DialogWidthCategory();
  return stampJavaTypeInfo(getClassLiteralForArray(Lorg_pentaho_gwt_widgets_client_dialogs_DialogBox$DialogWidthCategory_2_classLit, 1), $intern_1, 52, 0, [MINIMUM_0, TEXT, EXTRA_SMALL, SMALL, MEDIUM, LARGE, EXTRA_LARGE, MAXIMUM]);
}

defineClass(52, 4, {3:1, 5:1, 4:1, 52:1}, DialogBox$DialogWidthCategory);
var EXTRA_LARGE, EXTRA_SMALL, LARGE, MAXIMUM, MEDIUM, MINIMUM_0, SMALL, TEXT;
var Lorg_pentaho_gwt_widgets_client_dialogs_DialogBox$DialogWidthCategory_2_classLit = createForEnum('org.pentaho.gwt.widgets.client.dialogs', 'DialogBox/DialogWidthCategory', 52, values_14);
function autoFocus(dialog){
  $wnd.pho.util._dialog.getOpen(dialog).autoFocus();
}

function close_0(dialog){
  $wnd.pho.util._dialog.getOpen(dialog).close();
}

function isOpen(dialog){
  return $wnd.pho.util._dialog.getOpen(dialog) != null;
}

function open_1(dialog, buttonElems, trapFocus, restoreFocus, restoreFocusElem){
  $wnd.pho.util._dialog.create(dialog).setButtons(buttonElems).setAutoFocus(true).setTrapFocus(trapFocus).setRestoreFocus(restoreFocus?restoreFocusElem || true:false).open();
}

function setButtons(dialog, buttonElems){
  $wnd.pho.util._dialog.getOpen(dialog).setButtons(buttonElems);
}

function $clinit_GlassPane(){
  $clinit_GlassPane = emptyMethod;
  instance_2 = new GlassPane;
}

function $hide_2(this$static){
  var listener, listener$iterator, listenersToRemove;
  --this$static.dialogCount;
  this$static.dialogCount < 0 && (this$static.dialogCount = 0);
  if (this$static.shown && this$static.dialogCount == 0) {
    this$static.shown = false;
    listenersToRemove = new ArrayList;
    for (listener$iterator = new LinkedHashMap$EntrySet$EntryIterator(new LinkedHashMap$EntrySet(this$static.listeners)); listener$iterator.next_0 != listener$iterator.this$11.this$01.head;) {
      listener = $next_5(listener$iterator);
      try {
        throwClassCastExceptionUnlessNull(listener.value_0).$_nullMethod();
      }
       catch ($e0) {
        $e0 = toJava($e0);
        if (instanceOf($e0, 19)) {
          $add_6(listenersToRemove, castToString(listener.key));
        }
         else 
          throw toJs($e0);
      }
    }
    $removeBadListeners(this$static, listenersToRemove);
  }
}

function $removeBadListeners(this$static, removeThese){
  var key, key$iterator;
  for (key$iterator = new ArrayList$1(removeThese); key$iterator.i < key$iterator.this$01.array.length;) {
    key = castToString($next_4(key$iterator));
    $remove_18(this$static.listeners, key);
  }
}

function $show_1(this$static){
  var listener, listener$iterator, listenersToRemove;
  ++this$static.dialogCount;
  if (!this$static.shown) {
    this$static.shown = true;
    listenersToRemove = new ArrayList;
    for (listener$iterator = new LinkedHashMap$EntrySet$EntryIterator(new LinkedHashMap$EntrySet(this$static.listeners)); listener$iterator.next_0 != listener$iterator.this$11.this$01.head;) {
      listener = $next_5(listener$iterator);
      try {
        throwClassCastExceptionUnlessNull(listener.value_0).$_nullMethod();
      }
       catch ($e0) {
        $e0 = toJava($e0);
        if (instanceOf($e0, 19)) {
          $add_6(listenersToRemove, castToString(listener.key));
        }
         else 
          throw toJs($e0);
      }
    }
    $removeBadListeners(this$static, listenersToRemove);
  }
}

function GlassPane(){
  this.listeners = new LinkedHashMap;
}

defineClass(461, 1, {}, GlassPane);
_.dialogCount = 0;
_.shown = false;
var instance_2;
var Lorg_pentaho_gwt_widgets_client_dialogs_GlassPane_2_classLit = createForClass('org.pentaho.gwt.widgets.client.dialogs', 'GlassPane', 461);
function $createButtonPanelWrapper(this$static, okText, cancelText){
  var dialogButtonPanel, dialogButtonPanelWrapper;
  dialogButtonPanel = new HorizontalFlexPanel;
  setStyleName(($clinit_DOM() , dialogButtonPanel.element), 'inner-button-wrapper', true);
  this$static.okButton = new Button(okText);
  $setTitle_0(this$static.okButton, okText);
  $setStylePrimaryName(this$static.okButton);
  $getElement(this$static.okButton).setAttribute('id', 'okButton');
  $addClickListener(this$static.okButton, new PromptDialogBox$1(this$static));
  $add_2(dialogButtonPanel, this$static.okButton);
  if (cancelText != null) {
    this$static.cancelButton = new Button(cancelText);
    $setTitle_0(this$static.cancelButton, cancelText);
    $setStylePrimaryName(this$static.cancelButton);
    $getElement(this$static.cancelButton).setAttribute('id', 'cancelButton');
    $addClickListener(this$static.cancelButton, new PromptDialogBox$3(this$static));
    $add_2(dialogButtonPanel, this$static.cancelButton);
  }
  dialogButtonPanelWrapper = new HorizontalFlexPanel;
  okText != null && cancelText != null?$setHorizontalAlignment_0(dialogButtonPanelWrapper, ($clinit_HasHorizontalAlignment() , ALIGN_RIGHT)):$setHorizontalAlignment_0(dialogButtonPanelWrapper, ($clinit_HasHorizontalAlignment() , ALIGN_CENTER));
  setStyleName(dialogButtonPanelWrapper.element, 'button-panel', true);
  dialogButtonPanelWrapper.element.style['width'] = '100%';
  $add_2(dialogButtonPanelWrapper, dialogButtonPanel);
  return dialogButtonPanelWrapper;
}

function $onCancel(this$static){
  try {
    !!this$static.callback && this$static.callback.cancelPressed();
  }
   catch ($e0) {
    $e0 = toJava($e0);
    if (!instanceOf($e0, 8))
      throw toJs($e0);
  }
  $hide_1(this$static, false);
}

function $onOk(this$static){
  if (!this$static.validatorCallback || this$static.validatorCallback.validate()) {
    $onOkValid(this$static);
    $hide_1(this$static, false);
  }
}

function $onOkValid(this$static){
  try {
    !!this$static.callback && this$static.callback.okPressed();
  }
   catch ($e0) {
    $e0 = toJava($e0);
    if (!instanceOf($e0, 8))
      throw toJs($e0);
  }
}

function $setContent(this$static, content_0){
  this$static.content_0 = content_0;
  if (content_0) {
    content_0.setHeight('100%');
    content_0.setWidth('100%');
  }
  $setWidget_2(this$static.dialogContent, 0, 0, content_0);
  instanceOf(content_0, 44) && $setFocusWidget(this$static, castTo(content_0, 44));
}

function $setValidatorCallback(this$static, validatorCallback){
  this$static.validatorCallback = validatorCallback;
}

function PromptDialogBox(title_0, okText, cancelText){
  var dialogButtonPanelWrapper, focusButtons;
  DialogBox_0.call(this);
  this.dialogContent = new FlexTable;
  this.cancelButton = null;
  $setText(this.caption, title_0);
  dialogButtonPanelWrapper = $createButtonPanelWrapper(this, okText, cancelText);
  $clinit_Roles();
  $set(PRESENTATION, $getElement(this.dialogContent));
  this.dialogContent.tableElem['cellPadding'] = 0;
  this.dialogContent.tableElem['cellSpacing'] = 0;
  $setWidget_2(this.dialogContent, 1, 0, dialogButtonPanelWrapper);
  $setStyleName_1(this.dialogContent.cellFormatter);
  $setVerticalAlignment(this.dialogContent.cellFormatter, 0, ($clinit_HasVerticalAlignment() , ALIGN_MIDDLE));
  $setHorizontalAlignment(this.dialogContent.cellFormatter, ($clinit_HasHorizontalAlignment() , ALIGN_CENTER));
  setStyleAttribute($getElement_0(this.dialogContent.cellFormatter), 'padding', '5px 10px 10px 10px');
  $setVerticalAlignment(this.dialogContent.cellFormatter, 1, ALIGN_BOTTOM);
  $setWidth(this.dialogContent, '100%');
  $setWidget_1(this, this.dialogContent);
  $setFocusButtons(this, (focusButtons = new ArrayList , !!this.cancelButton && $add_6(focusButtons, this.cancelButton) , $add_6(focusButtons, this.okButton) , focusButtons));
}

function PromptDialogBox_0(title_0, okText, cancelText){
  PromptDialogBox.call(this, title_0, okText, cancelText);
}

defineClass(89, 266, $intern_44);
_.onKeyDownPreview = function onKeyDownPreview_0(key, modifiers){
  key == 27 && $onCancel(this);
  return true;
}
;
var Lorg_pentaho_gwt_widgets_client_dialogs_PromptDialogBox_2_classLit = createForClass('org.pentaho.gwt.widgets.client.dialogs', 'PromptDialogBox', 89);
function MessageDialogBox(title_0, messageContent, okText){
  PromptDialogBox.call(this, title_0, okText, null);
  $setContent(this, messageContent);
  $setResponsive(this);
  $setSizingMode(this, ($clinit_DialogBox$DialogSizingMode() , SIZE_TO_CONTENT));
  $setWidthCategory(this, ($clinit_DialogBox$DialogWidthCategory() , TEXT));
  $setMinimumHeightCategory(this, ($clinit_DialogBox$DialogMinimumHeightCategory() , CONTENT));
  $setAriaRole(this, ($clinit_Roles() , $clinit_Roles() , ALERTDIALOG));
  $setAriaDescribedBy(this, ensureId(this.content_0));
}

function MessageDialogBox_0(title_0, message){
  MessageDialogBox_1.call(this, title_0, message, getString());
}

function MessageDialogBox_1(title_0, message, okText){
  MessageDialogBox.call(this, title_0, new Label_0(message), okText);
}

defineClass(84, 89, $intern_44, MessageDialogBox_0);
var Lorg_pentaho_gwt_widgets_client_dialogs_MessageDialogBox_2_classLit = createForClass('org.pentaho.gwt.widgets.client.dialogs', 'MessageDialogBox', 84);
function PromptDialogBox$1(this$0){
  this.this$01 = this$0;
}

defineClass(274, 1, $intern_45, PromptDialogBox$1);
_.onClick_0 = function onClick_1(sender){
  $onOk(this.this$01);
}
;
var Lorg_pentaho_gwt_widgets_client_dialogs_PromptDialogBox$1_2_classLit = createForClass('org.pentaho.gwt.widgets.client.dialogs', 'PromptDialogBox/1', 274);
function PromptDialogBox$3(this$0){
  this.this$01 = this$0;
}

defineClass(275, 1, $intern_45, PromptDialogBox$3);
_.onClick_0 = function onClick_2(sender){
  $onCancel(this.this$01);
}
;
var Lorg_pentaho_gwt_widgets_client_dialogs_PromptDialogBox$3_2_classLit = createForClass('org.pentaho.gwt.widgets.client.dialogs', 'PromptDialogBox/3', 275);
function VerticalFlexPanel(){
  CellPanel.call(this);
  this.horzAlign = ($clinit_HasHorizontalAlignment() , ALIGN_DEFAULT);
  this.vertAlign = ($clinit_HasVerticalAlignment() , ALIGN_TOP);
  ($clinit_DOM() , this.table)['cellSpacing'] = '0';
  this.table['cellPadding'] = '0';
  setStyleName(this.element, 'flex-column gwt-h-v-panel gwt-v-panel', true);
  $clinit_Roles();
  $set(PRESENTATION, this.element);
}

defineClass(120, 291, $intern_26, VerticalFlexPanel);
var Lorg_pentaho_gwt_widgets_client_panel_VerticalFlexPanel_2_classLit = createForClass('org.pentaho.gwt.widgets.client.panel', 'VerticalFlexPanel', 120);
function $addFileChooserListener(this$static, listener){
  $add_6(this$static.listeners, listener);
}

function $addFileToList(this$static, repositoryFileTree, item_0, filesListTable, row, size_0, fileScroller){
  var extension, extensionIndex, file, fileImage, fileName, fileNamePanel, finalFileName, isDir, lastModDate, lastModifiedDateText, myDateLabel, myNameLabel, suffixlength, suffixlength0, suffixlength1, suffixlength2, suffixlength3, suffixlength4, suffixlength5, typeLabel;
  myDateLabel = null;
  file = repositoryFileTree.file;
  lastModDate = file.lastModifiedDate;
  fileName = file.name_0;
  isDir = ($clinit_Boolean() , file.folder?true:false);
  if (lastModDate) {
    lastModifiedDateText = $format(this$static.dateFormat, lastModDate, null);
    myDateLabel = new Label_1(lastModifiedDateText);
    lastModifiedDateText == null || lastModifiedDateText.length == 0?(($clinit_DOM() , myDateLabel.element).removeAttribute('title') , undefined):$setAttribute(($clinit_DOM() , myDateLabel.element), 'title', lastModifiedDateText);
  }
  this$static.showLocalizedFileNames?(finalFileName = file.title_0):(finalFileName = fileName);
  myNameLabel = new FileChooser$9(this$static, finalFileName, item_0, isDir);
  $setAttribute(($clinit_DOM() , myNameLabel.element), 'id', $concat(file.id_0));
  myNameLabel.eventsToSink == -1?sinkEvents(myNameLabel.element, 3 | (myNameLabel.element.__eventBits || 0)):(myNameLabel.eventsToSink |= 3);
  myNameLabel.eventsToSink == -1?sinkEvents(myNameLabel.element, 48 | (myNameLabel.element.__eventBits || 0)):(myNameLabel.eventsToSink |= 48);
  $setTitle_0(myNameLabel, file.title_0);
  myNameLabel.element.className = 'fileChooserCellLabel';
  fileNamePanel = new FileChooser$10(this$static, item_0, isDir, row, size_0, filesListTable, fileScroller);
  fileNamePanel.eventsToSink == -1?sinkEvents(fileNamePanel.element, 128 | (fileNamePanel.element.__eventBits || 0)):(fileNamePanel.eventsToSink |= 128);
  $clinit_Roles();
  $set(OPTION, fileNamePanel.element);
  row == 0 && $setTabindexExtraAttribute(fileNamePanel.element);
  fileImage = new FileChooser$11(this$static, item_0, isDir, myNameLabel);
  $setUrl_0(fileImage, getModuleBaseURL() + 'images/spacer.gif');
  setStyleName(fileImage.element, 'icon-small', true);
  setStyleName(fileImage.element, 'clickable', true);
  fileImage.eventsToSink == -1?sinkEvents(fileImage.element, 3 | (fileImage.element.__eventBits || 0)):(fileImage.eventsToSink |= 3);
  if (checkCriticalNotNull(isDir) , isDir) {
    setStyleName(fileImage.element, 'icon-folder', true);
    $setTitle_0(fileImage, $getString(messages_0, 'folder'));
  }
   else {
    $setTitle_0(fileImage, $getString(messages_0, 'file'));
    suffixlength0 = 'waqr.xaction'.length;
    if ($equals_1(fileName.substr(fileName.length - suffixlength0, suffixlength0), 'waqr.xaction')) {
      setStyleName(fileImage.element, 'icon-waqr-report', true);
    }
     else {
      suffixlength1 = 'analysisview.xaction'.length;
      if ($equals_1(fileName.substr(fileName.length - suffixlength1, suffixlength1), 'analysisview.xaction')) {
        setStyleName(fileImage.element, 'icon-analysis', true);
      }
       else {
        suffixlength2 = '.url'.length;
        if ($equals_1(fileName.substr(fileName.length - suffixlength2, suffixlength2), '.url')) {
          setStyleName(fileImage.element, 'icon-url', true);
        }
         else {
          suffixlength3 = 'xanalyzer'.length;
          if ($equals_1(fileName.substr(fileName.length - suffixlength3, suffixlength3), 'xanalyzer')) {
            setStyleName(fileImage.element, 'icon-analyzer', true);
          }
           else {
            suffixlength4 = 'prpti'.length;
            if ($equals_1(fileName.substr(fileName.length - suffixlength4, suffixlength4), 'prpti')) {
              setStyleName(fileImage.element, 'icon-pir-report', true);
            }
             else {
              suffixlength5 = 'prpt'.length;
              if ($equals_1(fileName.substr(fileName.length - suffixlength5, suffixlength5), 'prpt')) {
                setStyleName(fileImage.element, 'icon-prpt-report', true);
              }
               else {
                suffixlength = 'xdash'.length;
                if ($equals_1(fileName.substr(fileName.length - suffixlength, suffixlength), 'xdash')) {
                  setStyleName(fileImage.element, 'icon-dashboard', true);
                }
                 else {
                  setStyleName(fileImage.element, 'icon-xaction', true);
                  extensionIndex = valueOf_0(fileName.lastIndexOf('.'));
                  if (extensionIndex.value_0 >= 0) {
                    extension = $substring(fileName, extensionIndex.value_0 + 1);
                    if (extension.length > 0 && !$equalsIgnoreCase(extension, 'xaction')) {
                      setStyleName(fileImage.element, 'icon-unknown', true);
                      $addStyleName(fileImage, ($clinit_CssUtils() , 'icon-' + escape_1(extension)));
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  $add_2(fileNamePanel, fileImage);
  $add_2(fileNamePanel, myNameLabel);
  setStyleAttribute(myNameLabel.element, 'cursor', 'default');
  typeLabel = new Label_1((checkCriticalNotNull(isDir) , isDir)?$getString(messages_0, 'folder'):$getString(messages_0, 'file'));
  preventTextSelection(myNameLabel.element);
  preventTextSelection(typeLabel.element);
  !!myDateLabel && preventTextSelection(myDateLabel.element);
  setStyleName(fileNamePanel.element, 'fileChooserCell', true);
  setStyleName(fileNamePanel.element, 'fileChooserCellFileName', true);
  typeLabel.element.className = 'fileChooserCell';
  setStyleName(typeLabel.element, 'fileChooserCellFileOrFolder', true);
  if (myDateLabel) {
    myDateLabel.element.className = 'fileChooserCell';
    setStyleName(myDateLabel.element, 'fileChooserCellFileDateModified', true);
  }
  $setWidget_2(filesListTable, row + 1, 0, fileNamePanel);
  $setWidget_2(filesListTable, row + 1, 1, typeLabel);
  !!myDateLabel && $setWidget_2(filesListTable, row + 1, 2, myDateLabel);
}

function $buildFilesList(this$static, parentTreeItem){
  var childItem, childItem$iterator, childItem$iterator0, dateLabel, filesListPanel, filesListTable, filesScroller, i, nameLabel, repositoryFile, repositoryFileTree, row, treeItems, typeLabel;
  filesListPanel = new VerticalFlexPanel;
  setStyleName(($clinit_DOM() , filesListPanel.element), 'fileChooserFilesListContainer', true);
  filesListPanel.element.style['width'] = '100%';
  filesScroller = new ScrollFlexPanel;
  $clinit_Roles();
  $set(LISTBOX, filesScroller.element);
  $setTabindexExtraAttribute(filesScroller.element);
  setStyleName(filesScroller.element, 'fileChooser-scrollPanel', true);
  filesListTable = new FlexTable;
  setStyleName(filesListTable.element, 'fileChooserFilesList', true);
  filesListTable.element.style['width'] = '100%';
  filesListTable.tableElem['cellSpacing'] = 0;
  nameLabel = new Label_1($getString(messages_0, 'name'));
  $setTitle_0(nameLabel, $getTextOrHtml(nameLabel.directionalTextHelper, false));
  nameLabel.element.className = 'fileChooserHeader';
  typeLabel = new Label_1($getString(messages_0, 'type'));
  typeLabel.element.className = 'fileChooserHeader';
  dateLabel = new Label_1($getString(messages_0, 'dateModified'));
  $setTitle_0(dateLabel, $getTextOrHtml(dateLabel.directionalTextHelper, false));
  dateLabel.element.className = 'fileChooserHeader';
  preventTextSelection(nameLabel.element);
  preventTextSelection(typeLabel.element);
  preventTextSelection(dateLabel.element);
  $addStyleName_0(filesListTable.columnFormatter, 0, 'fileNameColumn');
  $addStyleName_0(filesListTable.columnFormatter, 1, 'fileOrFolderColumn');
  $addStyleName_0(filesListTable.columnFormatter, 2, 'fileDateModifiedColumn');
  $setWidget_2(filesListTable, 0, 0, nameLabel);
  $setWidth_0(filesListTable.cellFormatter);
  $setWidget_2(filesListTable, 0, 1, typeLabel);
  $setWidget_2(filesListTable, 0, 2, dateLabel);
  treeItems = new ArrayList;
  for (i = 0; i < $getChildCount(parentTreeItem); i++) {
    $add_6(treeItems, $getChild_1(parentTreeItem, i));
  }
  $clinit_Collections();
  $sort(treeItems, new TreeItemComparator);
  row = 0;
  for (childItem$iterator0 = new ArrayList$1(treeItems); childItem$iterator0.i < childItem$iterator0.this$01.array.length;) {
    childItem = castTo($next_4(childItem$iterator0), 30);
    repositoryFileTree = childItem.userObject;
    repositoryFile = repositoryFileTree.file;
    repositoryFile.folder && !(repositoryFile.name_0 != null && $equals_1(repositoryFile.name_0, 'etc')) && $addFileToList(this$static, repositoryFileTree, childItem, filesListTable, row++, treeItems.array.length, filesScroller);
  }
  for (childItem$iterator = new ArrayList$1(treeItems); childItem$iterator.i < childItem$iterator.this$01.array.length;) {
    childItem = castTo($next_4(childItem$iterator), 30);
    repositoryFileTree = childItem.userObject;
    repositoryFile = repositoryFileTree.file;
    repositoryFile.folder || $addFileToList(this$static, repositoryFileTree, childItem, filesListTable, row++, treeItems.array.length, filesScroller);
  }
  filesListTable.element.style['width'] = '100%';
  $setWidget(filesScroller, filesListTable);
  filesListTable.element.style['width'] = '100%';
  $add_3(filesListPanel, filesScroller);
  return filesListPanel;
}

function $buildTree(this$static, loadedTree, cache){
  var loadedFilePath;
  loadedFilePath = loadedTree.file.path;
  cache && $cache(this$static.lazyTreeLoader, loadedFilePath, loadedTree);
  !this$static.fileTree || $equals_1(loadedFilePath, '/')?(this$static.fileTree = loadedTree):$insertTree(this$static.lazyTreeLoader, this$static.fileTree, loadedTree);
  this$static.repositoryTree = buildSolutionTree_0(this$static.fileTree, this$static.showHiddenFiles, this$static.showLocalizedFileNames, this$static.fileFilter);
  this$static.selectedTreeItem = $getChild_1(this$static.repositoryTree.root, 0);
  $initUI(this$static);
  $fireFileSelectionChanged(this$static);
  !!this$static.treeListener && this$static.treeListener.loaded();
}

function $changeToPath(this$static, path){
  this$static.selectedPath = path;
  if (this$static.isLazy) {
    $loadDirectory(this$static, path);
  }
   else {
    $initUI(this$static);
    $fireFileSelectionChanged(this$static);
    !!this$static.treeListener && this$static.treeListener.loaded();
  }
}

function $fetchRepository(this$static, completedCallback){
  var builder, callback, url_0;
  url_0 = $getRepositoryRequestUrl(this$static, ':', -1, '*');
  builder = new RequestBuilder(($clinit_RequestBuilder() , GET), url_0);
  $setHeader(builder, 'accept', 'application/json');
  callback = new FileChooser$5(this$static, completedCallback);
  throwIfNull('callback', callback);
  $doSend(builder, callback);
}

function $fetchRepositoryDirectory(this$static, folder){
  var builder, callback, url_0;
  url_0 = $getRepositoryRequestUrl(this$static, folder, 1, null) + '&ts=' + toString_13(fromDouble_0(Date.now()));
  builder = new RequestBuilder(($clinit_RequestBuilder() , GET), url_0);
  $setHeader(builder, 'accept', 'application/json');
  callback = new FileChooser$4(this$static);
  throwIfNull('callback', callback);
  $doSend(builder, callback);
}

function $fireFileSelected(this$static){
  var file, listener, listener$iterator, tree;
  for (listener$iterator = new ArrayList$1(this$static.listeners); listener$iterator.i < listener$iterator.this$01.array.length;) {
    listener = castTo($next_4(listener$iterator), 63);
    tree = this$static.selectedTreeItem.userObject;
    file = tree.file;
    listener.fileSelected_1(file, file.path, !!this$static.mode && this$static.mode == ($clinit_FileChooser$FileChooserMode() , SAVE)?this$static.actualFileName:file.name_0, file.title_0);
  }
}

function $fireFileSelected_0(this$static, file){
  var dialogBox, listener, listener$iterator;
  if (!file) {
    dialogBox = new MessageDialogBox_0($getString(messages_0, 'error'), $getString(messages_0, 'noFilenameEntered'));
    $center(dialogBox);
    dialogBox.showing && !$equals_1('hidden', ($clinit_DOM() , dialogBox.element).style['visibility']) && isOpen(($clinit_DOM() , dialogBox.element)) && autoFocus(($clinit_DOM() , dialogBox.element));
    return;
  }
  for (listener$iterator = new ArrayList$1(this$static.listeners); listener$iterator.i < listener$iterator.this$01.array.length;) {
    listener = castTo($next_4(listener$iterator), 63);
    listener.fileSelected_1(file, file.path, !!this$static.mode && this$static.mode == ($clinit_FileChooser$FileChooserMode() , SAVE)?this$static.actualFileName:file.name_0, file.title_0);
  }
}

function $fireFileSelectionChanged(this$static){
  var file, listener, listener$iterator, tree;
  for (listener$iterator = new ArrayList$1(this$static.listeners); listener$iterator.i < listener$iterator.this$01.array.length;) {
    listener = castTo($next_4(listener$iterator), 63);
    tree = this$static.selectedTreeItem.userObject;
    file = tree.file;
    listener.fileSelectionChanged(file, file.path, !!this$static.mode && this$static.mode == ($clinit_FileChooser$FileChooserMode() , SAVE)?this$static.actualFileName:file.name_0, file.title_0);
  }
}

function $getChildTreeItem(itemName, parentItem){
  var i, item_0, tree;
  for (i = 0; i < $getChildCount(parentItem); i++) {
    item_0 = $getChild_1(parentItem, i);
    tree = item_0.userObject;
    if ($equals_1(itemName, tree.file.name_0)) {
      return item_0;
    }
  }
  return null;
}

function $getRepositoryRequestUrl(this$static, folder, depth, filter){
  var encodedFolder;
  encodedFolder = URLEncode(folder == null?':':$replace_0(folder, '/', ':'));
  filter == null && (filter = '*');
  return getFullyQualifiedURL() + 'api/repo/files/' + encodedFolder + '/tree?' + 'showHidden=' + this$static.showHiddenFiles + '&depth=' + depth + '&filter=' + filter;
}

function $getSolution(this$static){
  return this$static.selectedPath.indexOf('/', 1) == -1?$substring(this$static.selectedPath, 1):$substring_0(this$static.selectedPath, 1, this$static.selectedPath.indexOf('/', 1));
}

function $handleFileClicked(this$static, item_0, isDir, event_0, sourceElement){
  var eventWeCareAbout, file, i, myPath, parentRow, parentRow0, parentSegments, segment, tmpItem, tree;
  eventWeCareAbout = false;
  $clinit_DOM();
  (($eventGetTypeInt(event_0.type) & 2) == 2 || ($eventGetTypeInt(event_0.type) & 1) == 1 || (event_0.keyCode | 0) == 13) && (eventWeCareAbout = true);
  if (eventWeCareAbout) {
    this$static.fileSelected_0 = true;
    this$static.selectedTreeItem = tmpItem = item_0;
    parentSegments = new ArrayList;
    while (tmpItem) {
      tree = tmpItem.userObject;
      file = tree.file;
      !!file && file.name_0 != null && $add_6(parentSegments, file.name_0);
      tmpItem = tmpItem.parent_0;
    }
    reverse(parentSegments);
    myPath = '';
    for (i = 0; isDir?i < parentSegments.array.length:i < parentSegments.array.length - 1; i++) {
      segment = (checkCriticalElementIndex(i, parentSegments.array.length) , castToString(parentSegments.array[i]));
      segment != null && segment.length > 0 && (myPath += '/' + segment);
    }
    this$static.selectedPath = myPath;
    if (!isDir) {
      tree = this$static.selectedTreeItem.userObject;
      if (tree.file) {
        $setText_0(this$static.fileNameTextBox, tree.file.title_0);
        this$static.actualFileName = tree.file.name_0;
      }
    }
  }
  if (($eventGetTypeInt(event_0.type) & 2) == 2 || (event_0.keyCode | 0) == 13) {
    isDir?$changeToPath(this$static, this$static.selectedPath):$fireFileSelected(this$static);
  }
   else {
    if (($eventGetTypeInt(event_0.type) & 1) == 1) {
      $fireFileSelectionChanged(this$static);
      if (this$static.lastSelectedFileElement) {
        parentRow0 = findElementAboveByTagName(this$static.lastSelectedFileElement);
        $removeClassName(parentRow0, 'pentaho-file-chooser-selection');
      }
      parentRow = findElementAboveByTagName(sourceElement);
      $addClassName(parentRow, 'pentaho-file-chooser-selection');
      this$static.lastSelectedFileElement = sourceElement;
    }
  }
}

function $initUI(this$static){
  var actualFullPath, actualPathSegments, actualSegmentPath, childItem, filenameLabel, i, index_0, j, localizedFullPath, localizedPathSegments, localizedSegmentPath, locationBar, locationLabel, navigationBar, oldIndex, path, segment, td, upDirImage;
  this$static.mode == ($clinit_FileChooser$FileChooserMode() , OPEN_READ_ONLY) && $setReadOnly(this$static.fileNameTextBox);
  this$static.fileSelected_0 = false;
  path = this$static.selectedPath;
  this$static.selectedTreeItem = $getChild_1(this$static.repositoryTree.root, 0);
  actualPathSegments = new ArrayList;
  localizedPathSegments = new ArrayList;
  if (path != null) {
    index_0 = path.indexOf('/', 0);
    while (index_0 >= 0) {
      oldIndex = index_0;
      index_0 = path.indexOf('/', oldIndex + 1);
      index_0 >= 0?(segment = (checkCriticalStringBounds(oldIndex + 1, index_0, path.length) , path.substr(oldIndex + 1, index_0 - (oldIndex + 1)))):(segment = (checkCriticalStringElementIndex(oldIndex + 1, path.length + 1) , path.substr(oldIndex + 1)));
      childItem = $getChildTreeItem(segment, this$static.selectedTreeItem);
      if (childItem) {
        push_1(actualPathSegments.array, segment);
        $add_6(localizedPathSegments, childItem.contentElem.title);
        this$static.selectedTreeItem = childItem;
      }
       else {
        break;
      }
    }
  }
  locationBar = new VerticalFlexPanel;
  setStyleName(($clinit_DOM() , locationBar.element), 'locationFieldGroup', true);
  locationLabel = new Label_0($getString(messages_0, 'location'));
  this$static.navigationListBox = new ListBox;
  $getElement(this$static.navigationListBox).id = 'navigationListBox';
  $addStyleName(this$static.navigationListBox, 'navigationListBox');
  $addStyleName(this$static.navigationListBox, 'height-auto');
  $setWidth(this$static.navigationListBox, '350px');
  $clinit_Roles();
  $set(LISTBOX, $getElement(this$static.navigationListBox));
  setAriaLabelledBy(this$static.navigationListBox, locationLabel);
  $insertItem(this$static.navigationListBox, '/', '/', -1);
  for (i = 0; i < actualPathSegments.array.length; i++) {
    actualFullPath = '';
    localizedFullPath = '';
    for (j = 0; j <= i; j++) {
      actualSegmentPath = (checkCriticalElementIndex(j, actualPathSegments.array.length) , castToString(actualPathSegments.array[j]));
      localizedSegmentPath = (checkCriticalElementIndex(j, localizedPathSegments.array.length) , castToString(localizedPathSegments.array[j]));
      if (actualSegmentPath != null && localizedSegmentPath != null && actualSegmentPath.length > 0 && localizedSegmentPath.length > 0) {
        actualFullPath += '/' + actualSegmentPath;
        localizedFullPath += '/' + localizedSegmentPath;
      }
    }
    !$equals_1(actualFullPath, '/') && !$equals_1(localizedFullPath, '/') && $insertItem(this$static.navigationListBox, localizedFullPath, actualFullPath, -1);
  }
  $setSelectedIndex_0(this$static.navigationListBox, $getElement(this$static.navigationListBox).options.length - 1);
  $addChangeListener(this$static.navigationListBox, new FileChooser$6(this$static));
  $clear(this$static);
  $add_3(locationBar, locationLabel);
  navigationBar = new HorizontalFlexPanel;
  setStyleName(navigationBar.element, 'locationFieldAndUpDirGroup', true);
  upDirImage = new ThemeableImageButton($getString(messages_0, 'upOneLevel'));
  add_3(upDirImage, new FileChooser$7);
  $addClickListener_1(upDirImage, new FileChooser$8(this$static));
  $setHorizontalAlignment_0(navigationBar, ($clinit_HasHorizontalAlignment() , ALIGN_LEFT));
  $add_2(navigationBar, this$static.navigationListBox);
  $setHorizontalAlignment_0(navigationBar, ALIGN_LEFT);
  $add_2(navigationBar, upDirImage);
  td = $getWidgetTd(navigationBar, upDirImage);
  !!td && (td['width'] = '100%' , undefined);
  setStyleAttribute(upDirImage.element, 'marginLeft', '4px');
  navigationBar.element.style['width'] = '100%';
  $add_3(locationBar, navigationBar);
  locationBar.element.style['width'] = '100%';
  filenameLabel = new Label_0($getString(messages_0, 'filename'));
  setAriaLabelledBy(this$static.fileNameTextBox, filenameLabel);
  filenameLabel.element.style['width'] = '550px';
  $add_3(this$static, filenameLabel);
  $setWidth(this$static.fileNameTextBox, '300px');
  $add_3(this$static, this$static.fileNameTextBox);
  $add_3(this$static, locationBar);
  $add_3(this$static, $buildFilesList(this$static, this$static.selectedTreeItem));
}

function $loadDirectory(this$static, path){
  var e, loadedTree;
  if ($isCached(this$static.lazyTreeLoader, path)) {
    loadedTree = $getCached(this$static.lazyTreeLoader, path);
    $buildTree(this$static, loadedTree, false);
  }
   else {
    try {
      $fetchRepositoryDirectory(this$static, path);
    }
     catch ($e0) {
      $e0 = toJava($e0);
      if (instanceOf($e0, 36)) {
        e = $e0;
        alert_0($toString(e, e.detailMessage));
      }
       else 
        throw toJs($e0);
    }
  }
}

function $search(this$static, tree, actualFileName){
  var file, treeItem, treeItem$iterator;
  try {
    file = tree.file;
    if (!!file && !file.folder && $equals_1(file.path, actualFileName)) {
      return file;
    }
    if (file) {
      for (treeItem$iterator = new ArrayList$1(tree.children); treeItem$iterator.i < treeItem$iterator.this$01.array.length;) {
        treeItem = castTo($next_4(treeItem$iterator), 59);
        file = $search(this$static, treeItem, actualFileName);
        if (file) {
          return file;
        }
      }
    }
  }
   catch ($e0) {
    $e0 = toJava($e0);
    if (!instanceOf($e0, 19))
      throw toJs($e0);
  }
  return null;
}

function $setFileFilter(this$static, fileFilter){
  this$static.fileFilter = fileFilter;
  this$static.repositoryTree = buildSolutionTree_0(this$static.fileTree, this$static.showHiddenFiles, this$static.showLocalizedFileNames, fileFilter);
  $initUI(this$static);
}

function $setMode(this$static, mode){
  this$static.mode = mode;
}

function $setSelectedPath(this$static, selectedPath){
  this$static.selectedPath = selectedPath;
}

function $setTreeListener(this$static, treeListener){
  this$static.treeListener = treeListener;
}

function FileChooser(){
  VerticalFlexPanel.call(this);
  this.mode = ($clinit_FileChooser$FileChooserMode() , OPEN);
  this.isLazy = false;
  this.lazyTreeLoader = new LazyTreeLoader;
  this.showHiddenFiles = false;
  this.showLocalizedFileNames = true;
  this.fileNameTextBox = new TextBox;
  this.dateFormat = ($clinit_DateTimeFormat_0() , getFormat(($clinit_DateTimeFormat$PredefinedFormat() , DATE_TIME_MEDIUM)));
  this.listeners = new ArrayList;
  this.fileSelected_0 = false;
  this.submitOnEnter = true;
  setStyleName(($clinit_DOM() , this.element), 'fileChooser', true);
  setStyleName(this.element, 'with-scroll-child', true);
  $getElement(this.fileNameTextBox).id = 'fileNameTextBox';
  $addStyleName(this.fileNameTextBox, 'fileNameTextBox');
  $addDomHandler(this.fileNameTextBox, new FileChooser$1(this), ($clinit_ClickEvent() , $clinit_ClickEvent() , TYPE_0));
  $addDomHandler(this.fileNameTextBox, new FileChooser$2(this), ($clinit_KeyDownEvent() , $clinit_KeyDownEvent() , TYPE_1));
  $addValueChangeHandler_0(this.fileNameTextBox, new FileChooser$3(this));
  this.table['cellSpacing'] = 3;
}

function FileChooser_0(mode, selectedPath, callback){
  var e;
  FileChooser.call(this);
  this.mode = mode;
  this.selectedPath = selectedPath;
  try {
    $fetchRepository(this, callback);
  }
   catch ($e0) {
    $e0 = toJava($e0);
    if (instanceOf($e0, 36)) {
      e = $e0;
      alert_0($toString(e, e.detailMessage));
    }
     else 
      throw toJs($e0);
  }
}

function FileChooser_1(){
  FileChooser.call(this);
  this.showHiddenFiles = false;
}

defineClass(102, 120, $intern_26, FileChooser_0, FileChooser_1);
_.fileSelected_0 = false;
_.isLazy = false;
_.showHiddenFiles = false;
_.showLocalizedFileNames = false;
_.submitOnEnter = false;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooser_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooser', 102);
function FileChooser$1(this$0){
  this.this$01 = this$0;
}

defineClass(292, 1, $intern_32, FileChooser$1);
_.onClick = function onClick_3(event_0){
  $setFocus(this.this$01.fileNameTextBox);
}
;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooser$1_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooser/1', 292);
function HorizontalFlexPanel(){
  CellPanel.call(this);
  this.horzAlign = ($clinit_HasHorizontalAlignment() , ALIGN_DEFAULT);
  this.vertAlign = ($clinit_HasVerticalAlignment() , ALIGN_TOP);
  this.tableRow = ($clinit_DOM() , $doc.createElement('tr'));
  $appendChild(this.body_0, resolve(this.tableRow));
  this.table['cellSpacing'] = '0';
  this.table['cellPadding'] = '0';
  setStyleName(this.element, 'flex-row gwt-h-v-panel gwt-h-panel', true);
  $clinit_Roles();
  $set(PRESENTATION, this.element);
}

defineClass(103, 301, $intern_26, HorizontalFlexPanel);
var Lorg_pentaho_gwt_widgets_client_panel_HorizontalFlexPanel_2_classLit = createForClass('org.pentaho.gwt.widgets.client.panel', 'HorizontalFlexPanel', 103);
function FileChooser$10(this$0, val$item, val$isDir, val$row, val$size, val$filesListTable, val$fileScroller){
  this.this$01 = this$0;
  this.val$item2 = val$item;
  this.val$isDir3 = val$isDir;
  this.val$row4 = val$row;
  this.val$size5 = val$size;
  this.val$filesListTable6 = val$filesListTable;
  this.val$fileScroller7 = val$fileScroller;
  HorizontalFlexPanel.call(this);
}

defineClass(302, 103, $intern_26, FileChooser$10);
_.onBrowserEvent = function onBrowserEvent_4(event_0){
  var firstFileNamePanel, lastFileNamePanel, nextFileNamePanel, previousFileNamePanel;
  switch (event_0.keyCode | 0) {
    case 13:
      $handleFileClicked(this.this$01, this.val$item2, $booleanValue(this.val$isDir3), event_0, ($clinit_DOM() , this.element));
      event_0.preventDefault();
      break;
    case 38:
      if (this.val$row4 > 0 && this.val$row4 <= this.val$size5 - 1) {
        ($clinit_DOM() , this.element).removeAttribute('tabindex');
        previousFileNamePanel = $getWidget(this.val$filesListTable6, this.val$row4);
        previousFileNamePanel.element.tabIndex = 0;
        previousFileNamePanel.element.focus();
        event_0.preventDefault();
        $ensureVisible(this.val$fileScroller7, previousFileNamePanel);
      }

      break;
    case 40:
      if (this.val$row4 >= 0 && this.val$row4 < this.val$size5 - 1) {
        ($clinit_DOM() , this.element).removeAttribute('tabindex');
        nextFileNamePanel = $getWidget(this.val$filesListTable6, this.val$row4 + 2);
        nextFileNamePanel.element.tabIndex = 0;
        nextFileNamePanel.element.focus();
        event_0.preventDefault();
        $ensureVisible(this.val$fileScroller7, nextFileNamePanel);
      }

      break;
    case 36:
      ($clinit_DOM() , this.element).removeAttribute('tabindex');
      firstFileNamePanel = $getWidget(this.val$filesListTable6, 1);
      firstFileNamePanel.element.tabIndex = 0;
      firstFileNamePanel.element.focus();
      event_0.preventDefault();
      $ensureVisible(this.val$fileScroller7, firstFileNamePanel);
      break;
    case 35:
      ($clinit_DOM() , this.element).removeAttribute('tabindex');
      lastFileNamePanel = $getWidget(this.val$filesListTable6, this.val$size5);
      lastFileNamePanel.element.tabIndex = 0;
      lastFileNamePanel.element.focus();
      event_0.preventDefault();
      $ensureVisible(this.val$fileScroller7, lastFileNamePanel);
  }
}
;
_.val$row4 = 0;
_.val$size5 = 0;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooser$10_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooser/10', 302);
function FileChooser$11(this$0, val$item, val$isDir, val$myNameLabel){
  $clinit_Image();
  this.this$01 = this$0;
  this.val$item2 = val$item;
  this.val$isDir3 = val$isDir;
  this.val$myNameLabel4 = val$myNameLabel;
  $changeState(this, new Image$UnclippedState(this));
  ($clinit_DOM() , this.element).className = 'gwt-Image';
}

defineClass(303, 104, $intern_26, FileChooser$11);
_.onBrowserEvent = function onBrowserEvent_5(event_0){
  $handleFileClicked(this.this$01, this.val$item2, $booleanValue(this.val$isDir3), event_0, $getElement(this.val$myNameLabel4));
}
;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooser$11_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooser/11', 303);
function FileChooser$2(this$0){
  this.this$01 = this$0;
}

defineClass(293, 1, $intern_42, FileChooser$2);
_.onKeyDown = function onKeyDown_0(event_0){
  this.this$01.actualFileName = $getText(this.this$01.fileNameTextBox);
  if ((event_0.nativeEvent.keyCode | 0) == 13 && this.this$01.submitOnEnter) {
    this.this$01.mode != ($clinit_FileChooser$FileChooserMode() , SAVE)?$fireFileSelected_0(this.this$01, $search(this.this$01, this.this$01.fileTree, this.this$01.actualFileName)):$fireFileSelected(this.this$01);
    !!event_0.nativeEvent && (event_0.nativeEvent.preventDefault() , undefined);
  }
}
;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooser$2_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooser/2', 293);
function FileChooser$3(this$0){
  this.this$01 = this$0;
}

defineClass(294, 1, $intern_34, FileChooser$3);
_.onValueChange = function onValueChange_0(valueChangeEvent){
  this.this$01.actualFileName = $getText(this.this$01.fileNameTextBox);
}
;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooser$3_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooser/3', 294);
function FileChooser$4(this$0){
  this.this$01 = this$0;
}

defineClass(295, 1, {}, FileChooser$4);
_.onError = function onError(request, exception){
  alert_0($toString(exception, exception.detailMessage));
}
;
_.onResponseReceived = function onResponseReceived(request, response){
  var converter, jsonData;
  if (response.xmlHttpRequest.status == 200) {
    jsonData = response.xmlHttpRequest.responseText;
    !this.this$01.fileTree && (jsonData = $buildTree_0(jsonData));
    converter = new JsonToRepositoryFileTreeConverter(jsonData);
    $buildTree(this.this$01, $getTree(converter), !!this.this$01.fileTree);
  }
   else {
    $wnd.alert('Unable to find or access contents within the selected folder');
  }
}
;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooser$4_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooser/4', 295);
function FileChooser$5(this$0, val$completedCallback){
  this.this$01 = this$0;
  this.val$completedCallback2 = val$completedCallback;
}

defineClass(296, 1, {}, FileChooser$5);
_.onError = function onError_0(request, exception){
  alert_0($toString(exception, exception.detailMessage));
}
;
_.onResponseReceived = function onResponseReceived_0(request, response){
  var converter, jsonData;
  if (response.xmlHttpRequest.status == 200) {
    jsonData = response.xmlHttpRequest.responseText;
    converter = new JsonToRepositoryFileTreeConverter(jsonData);
    this.this$01.repositoryTree = buildSolutionTree_0($getTree(converter), this.this$01.showHiddenFiles, this.this$01.showLocalizedFileNames, this.this$01.fileFilter);
    this.this$01.selectedTreeItem = $getChild_1(this.this$01.repositoryTree.root, 0);
    $initUI(this.this$01);
    !!this.val$completedCallback2 && $center_0(this.val$completedCallback2.this$01);
  }
   else {
    $wnd.alert('Unable to find or access contents within the selected folder');
  }
}
;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooser$5_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooser/5', 296);
function $onChange(this$static){
  $changeToPath(this$static.this$01, $getValue(this$static.this$01.navigationListBox, $getElement(this$static.this$01.navigationListBox).selectedIndex));
}

function FileChooser$6(this$0){
  this.this$01 = this$0;
}

defineClass(297, 1, {527:1}, FileChooser$6);
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooser$6_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooser/6', 297);
function FileChooser$7(){
}

defineClass(298, 1, {60:1}, FileChooser$7);
_.onMouseDown_0 = function onMouseDown_3(sender, x_0, y_0){
}
;
_.onMouseEnter = function onMouseEnter_0(sender){
}
;
_.onMouseLeave = function onMouseLeave_0(sender){
}
;
_.onMouseMove_0 = function onMouseMove_2(sender, x_0, y_0){
}
;
_.onMouseUp_0 = function onMouseUp_3(sender, x_0, y_0){
}
;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooser$7_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooser/7', 298);
function FileChooser$8(this$0){
  this.this$01 = this$0;
}

defineClass(299, 1, $intern_45, FileChooser$8);
_.onClick_0 = function onClick_4(sender){
  var i, loopCount, myPath, parentSegments, pathSegment, tmpItem, tree;
  tmpItem = this.this$01.selectedTreeItem;
  parentSegments = new ArrayList;
  while (tmpItem) {
    tree = tmpItem.userObject;
    !!tree.file && tree.file.name_0 != null && $add_6(parentSegments, tree.file.name_0);
    tmpItem = tmpItem.parent_0;
  }
  reverse(parentSegments);
  myPath = '';
  loopCount = this.this$01.fileSelected_0?parentSegments.array.length - 2:parentSegments.array.length - 1;
  for (i = 0; i < loopCount; i++) {
    pathSegment = (checkCriticalElementIndex(i, parentSegments.array.length) , castToString(parentSegments.array[i]));
    pathSegment != null && pathSegment.length > 0 && (myPath += '/' + pathSegment);
  }
  $equals_1(myPath, '') && (myPath = '/');
  this.this$01.selectedTreeItem = this.this$01.selectedTreeItem.parent_0;
  !this.this$01.selectedTreeItem && (this.this$01.selectedTreeItem = $getChild_1(this.this$01.repositoryTree.root, 0));
  $changeToPath(this.this$01, myPath);
}
;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooser$8_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooser/8', 299);
function FileChooser$9(this$0, $anonymous0, val$item, val$isDir){
  this.this$01 = this$0;
  this.val$item4 = val$item;
  this.val$isDir5 = val$isDir;
  Label_1.call(this, $anonymous0);
}

defineClass(300, 42, $intern_26, FileChooser$9);
_.onBrowserEvent = function onBrowserEvent_6(event_0){
  switch ($clinit_DOM() , $eventGetTypeInt(event_0.type)) {
    case 1:
    case 2:
      $handleFileClicked(this.this$01, this.val$item4, $booleanValue(this.val$isDir5), event_0, this.element);
      break;
    case 16:
      $setStyleName_0(this, getStylePrimaryName(this.element) + '-' + 'over', true);
      break;
    case 32:
      $setStyleName_0(this, getStylePrimaryName(this.element) + '-' + 'over', false);
  }
}
;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooser$9_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooser/9', 300);
function $clinit_FileChooser$FileChooserMode(){
  $clinit_FileChooser$FileChooserMode = emptyMethod;
  OPEN = new FileChooser$FileChooserMode('OPEN', 0);
  OPEN_READ_ONLY = new FileChooser$FileChooserMode('OPEN_READ_ONLY', 1);
  SAVE = new FileChooser$FileChooserMode('SAVE', 2);
}

function FileChooser$FileChooserMode(enum$name, enum$ordinal){
  Enum.call(this, enum$name, enum$ordinal);
}

function values_15(){
  $clinit_FileChooser$FileChooserMode();
  return stampJavaTypeInfo(getClassLiteralForArray(Lorg_pentaho_gwt_widgets_client_filechooser_FileChooser$FileChooserMode_2_classLit, 1), $intern_1, 90, 0, [OPEN, OPEN_READ_ONLY, SAVE]);
}

defineClass(90, 4, {3:1, 5:1, 4:1, 90:1}, FileChooser$FileChooserMode);
var OPEN, OPEN_READ_ONLY, SAVE;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooser$FileChooserMode_2_classLit = createForEnum('org.pentaho.gwt.widgets.client.filechooser', 'FileChooser/FileChooserMode', 90, values_15);
function $clinit_FileChooserDialog(){
  $clinit_FileChooserDialog = emptyMethod;
  OPEN_0 = $getString(messages_0, 'Open');
  SAVE_0 = $getString(messages_0, 'Save');
}

function $$init(this$static){
  this$static.listeners = new ArrayList;
}

function $addFileChooserListener_0(this$static, listener){
  $add_6(this$static.listeners, listener);
}

function $doesFolderExist(this$static, tree, folderPath){
  var file, treeItem, treeItem$iterator;
  try {
    file = tree.file;
    if (!!file && $equals_1(file.path, folderPath)) {
      return file;
    }
    if (file) {
      for (treeItem$iterator = new ArrayList$1(tree.children); treeItem$iterator.i < treeItem$iterator.this$01.array.length;) {
        treeItem = castTo($next_4(treeItem$iterator), 59);
        file = $doesFolderExist(this$static, treeItem, folderPath);
        if (file) {
          return file;
        }
      }
    }
  }
   catch ($e0) {
    $e0 = toJava($e0);
    if (!instanceOf($e0, 19))
      throw toJs($e0);
  }
  return null;
}

function $getActualFileName(this$static){
  var actualFileName;
  actualFileName = this$static.fileChooser.actualFileName;
  if (actualFileName != null && !$equals_1('', actualFileName)) {
    return actualFileName;
  }
  return '';
}

function $isFileNameValid(this$static){
  var dialogBox, fileName, solution;
  solution = $getSolution(this$static.fileChooser);
  if (this$static.fileChooser.mode == ($clinit_FileChooser$FileChooserMode() , SAVE) && (solution == null || $trim(solution).length == 0)) {
    dialogBox = new MessageDialogBox_0($getString(messages_0, 'error'), $getString(messages_0, 'noSolutionSelected'));
    $center(dialogBox);
    dialogBox.showing && !$equals_1('hidden', ($clinit_DOM() , dialogBox.element).style['visibility']) && isOpen(($clinit_DOM() , dialogBox.element)) && autoFocus(($clinit_DOM() , dialogBox.element));
    return false;
  }
  fileName = $getActualFileName(this$static);
  if (null == fileName || $equals_1('', $trim(fileName))) {
    dialogBox = new MessageDialogBox_0($getString(messages_0, 'error'), $getString(messages_0, 'noFilenameEntered'));
    $center(dialogBox);
    dialogBox.showing && !$equals_1('hidden', ($clinit_DOM() , dialogBox.element).style['visibility']) && isOpen(($clinit_DOM() , dialogBox.element)) && autoFocus(($clinit_DOM() , dialogBox.element));
    return false;
  }
   else if (!isValidFileName(fileName)) {
    dialogBox = new MessageDialogBox_0($getString(messages_0, 'error'), $getString_0(messages_0, stampJavaTypeInfo(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_1, 2, 6, [($clinit_NameUtils() , $clinit_NameUtils() , $wnd.RESERVED_CHARS_DISPLAY)])));
    $center(dialogBox);
    dialogBox.showing && !$equals_1('hidden', ($clinit_DOM() , dialogBox.element).style['visibility']) && isOpen(($clinit_DOM() , dialogBox.element)) && autoFocus(($clinit_DOM() , dialogBox.element));
    return false;
  }
  return true;
}

function $lambda$0_0(this$static){
  $center(this$static);
  this$static.showing && !$equals_1('hidden', ($clinit_DOM() , this$static.element).style['visibility']) && isOpen(($clinit_DOM() , this$static.element)) && autoFocus(($clinit_DOM() , this$static.element));
}

function $setFileFilter_0(this$static, filter){
  $setFileFilter(this$static.fileChooser, filter);
}

function FileChooserDialog(mode, selectedPath){
  $clinit_FileChooserDialog();
  FileChooserDialog_0.call(this, mode, selectedPath, mode == ($clinit_FileChooser$FileChooserMode() , OPEN)?OPEN_0:SAVE_0, mode == OPEN?OPEN_0:SAVE_0);
}

function FileChooserDialog_0(mode, selectedPath, title_0, okText){
  $clinit_FileChooserDialog();
  FileChooserDialog_1.call(this, mode, selectedPath, title_0, okText);
}

function FileChooserDialog_1(mode, selectedPath, title_0, okText){
  var callback, path;
  PromptDialogBox_0.call(this, title_0, okText, $getString(messages_0, 'Cancel'));
  $$init(this);
  setStyleName($getParentElement(($clinit_DOM() , $clinit_DOM() , $getFirstChildElement(this.element))), 'fileChooserDialog', true);
  $setResponsive(this);
  $setSizingMode(this, ($clinit_DialogBox$DialogSizingMode() , FILL_VIEWPORT_WIDTH));
  $setWidthCategory(this, ($clinit_DialogBox$DialogWidthCategory() , SMALL));
  this.fileChooser = new FileChooser_1;
  $setContent(this, this.fileChooser);
  $setMode(this.fileChooser, mode);
  this.fileChooser.isLazy = true;
  setupNativeHooks();
  if (mode == ($clinit_FileChooser$FileChooserMode() , OPEN)) {
    if (lastOpenLocation == null) {
      $setSelectedPath(this.fileChooser, $wnd.top.DEFAULT_FOLDER);
    }
     else {
      $setSelectedPath(this.fileChooser, lastOpenLocation);
      !$doesFolderExist(this, null, this.fileChooser.selectedPath) && $setSelectedPath(this.fileChooser, $wnd.top.DEFAULT_FOLDER);
    }
  }
  if (mode == SAVE) {
    path = null == selectedPath || $equals_1('', $trim(selectedPath))?$wnd.top.DEFAULT_FOLDER:selectedPath;
    $setSelectedPath(this.fileChooser, path);
  }
  $setValidatorCallback(this, new FileChooserDialog$4(this));
  callback = new FileChooserDialog$5(this);
  this.callback = callback;
  $addFileChooserListener(this.fileChooser, this);
  $setTreeListener(this.fileChooser, new FileChooserDialog$6(this));
  try {
    $fetchRepositoryDirectory(this.fileChooser, this.fileChooser.selectedPath);
  }
   catch ($e0) {
    $e0 = toJava($e0);
    if (instanceOf($e0, 36)) {
      alert_0('Unabled to load ' + this.fileChooser.selectedPath);
    }
     else 
      throw toJs($e0);
  }
}

function FileChooserDialog_2(mode, selectedPath){
  $clinit_FileChooserDialog();
  FileChooserDialog_3.call(this, mode, selectedPath, mode == ($clinit_FileChooser$FileChooserMode() , OPEN)?OPEN_0:SAVE_0, mode == OPEN?OPEN_0:SAVE_0);
}

function FileChooserDialog_3(mode, selectedPath, title_0, okText){
  $clinit_FileChooserDialog();
  var callback;
  PromptDialogBox_0.call(this, title_0, okText, $getString(messages_0, 'Cancel'));
  $$init(this);
  setStyleName($getParentElement(($clinit_DOM() , $clinit_DOM() , $getFirstChildElement(this.element))), 'fileChooserDialog', true);
  $setResponsive(this);
  $setSizingMode(this, ($clinit_DialogBox$DialogSizingMode() , FILL_VIEWPORT_WIDTH));
  $setWidthCategory(this, ($clinit_DialogBox$DialogWidthCategory() , SMALL));
  setupNativeHooks();
  this.fileChooser = new FileChooser_0(mode, selectedPath, new FileChooserDialog$1(this));
  $setContent(this, this.fileChooser);
  $setWidth(this.fileChooser, '100%');
  $setValidatorCallback(this, new FileChooserDialog$2(this));
  callback = new FileChooserDialog$3(this);
  this.callback = callback;
  $addFileChooserListener(this.fileChooser, this);
  $setTreeListener(this.fileChooser, new FileChooserDialog$lambda$0$Type(this));
}

function setLastOpenLocation(path){
  lastOpenLocation = path;
}

function setupNativeHooks(){
  $wnd.mantle_setIsRepoDirty = function(isDirty){
    isDirty_0 = isDirty;
  }
  ;
  $wnd.mantle_getIsRepoDirty = function(){
    return isDirty_0;
  }
  ;
}

defineClass(55, 89, {14:1, 10:1, 13:1, 11:1, 15:1, 60:1, 137:1, 47:1, 9:1, 6:1, 63:1}, FileChooserDialog, FileChooserDialog_0, FileChooserDialog_2, FileChooserDialog_3);
_.dialogCanceled_0 = function dialogCanceled(){
  var listener, listener$iterator;
  for (listener$iterator = new ArrayList$1(this.listeners); listener$iterator.i < listener$iterator.this$01.array.length;) {
    listener = castTo($next_4(listener$iterator), 63);
    listener.dialogCanceled_0();
  }
}
;
_.fileSelected_1 = function fileSelected(file, filePath, fileName, title_0){
  var listener, listener$iterator;
  if ($isFileNameValid(this)) {
    for (listener$iterator = new ArrayList$1(this.listeners); listener$iterator.i < listener$iterator.this$01.array.length;) {
      listener = castTo($next_4(listener$iterator), 63);
      listener.fileSelected_1(file, filePath, fileName, title_0);
      this.fileChooser.mode == ($clinit_FileChooser$FileChooserMode() , OPEN) && setLastOpenLocation(this.fileChooser.selectedPath);
    }
    $hide_1(this, false);
  }
}
;
_.fileSelectionChanged = function fileSelectionChanged(file, filePath, fileName, title_0){
  var listener, listener$iterator;
  for (listener$iterator = new ArrayList$1(this.listeners); listener$iterator.i < listener$iterator.this$01.array.length;) {
    listener = castTo($next_4(listener$iterator), 63);
    listener.fileSelectionChanged(file, filePath, fileName, title_0);
  }
}
;
_.onKeyDownPreview = function onKeyDownPreview_1(key, modifiers){
  key == 27 && $onCancel(this);
  return true;
}
;
var OPEN_0, SAVE_0, isDirty_0 = false, lastOpenLocation = '';
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooserDialog_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooserDialog', 55);
function FileChooserDialog$1(this$0){
  this.this$01 = this$0;
}

defineClass(267, 1, {}, FileChooserDialog$1);
_.cancelPressed = function cancelPressed(){
}
;
_.okPressed = function okPressed(){
  $center_0(this.this$01);
}
;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooserDialog$1_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooserDialog/1', 267);
function FileChooserDialog$2(this$0){
  this.this$01 = this$0;
}

defineClass(268, 1, {}, FileChooserDialog$2);
_.validate = function validate(){
  return $isFileNameValid(this.this$01);
}
;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooserDialog$2_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooserDialog/2', 268);
function FileChooserDialog$3(this$0){
  this.this$01 = this$0;
}

defineClass(269, 1, {}, FileChooserDialog$3);
_.cancelPressed = function cancelPressed_0(){
  var listener, listener$iterator;
  for (listener$iterator = new ArrayList$1(this.this$01.listeners); listener$iterator.i < listener$iterator.this$01.array.length;) {
    listener = castTo($next_4(listener$iterator), 63);
    listener.dialogCanceled_0();
  }
}
;
_.okPressed = function okPressed_0(){
  $fireFileSelected(this.this$01.fileChooser);
}
;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooserDialog$3_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooserDialog/3', 269);
function FileChooserDialog$4(this$0){
  this.this$01 = this$0;
}

defineClass(271, 1, {}, FileChooserDialog$4);
_.validate = function validate_0(){
  return $isFileNameValid(this.this$01);
}
;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooserDialog$4_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooserDialog/4', 271);
function FileChooserDialog$5(this$0){
  this.this$01 = this$0;
}

defineClass(272, 1, {}, FileChooserDialog$5);
_.cancelPressed = function cancelPressed_1(){
  var listener, listener$iterator;
  for (listener$iterator = new ArrayList$1(this.this$01.listeners); listener$iterator.i < listener$iterator.this$01.array.length;) {
    listener = castTo($next_4(listener$iterator), 63);
    listener.dialogCanceled_0();
  }
}
;
_.okPressed = function okPressed_1(){
  $fireFileSelected(this.this$01.fileChooser);
}
;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooserDialog$5_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooserDialog/5', 272);
function FileChooserDialog$6(this$0){
  this.this$01 = this$0;
}

defineClass(273, 1, {}, FileChooserDialog$6);
_.loaded = function loaded(){
  $center_0(this.this$01);
}
;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooserDialog$6_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooserDialog/6', 273);
function FileChooserDialog$lambda$0$Type($$outer_0){
  this.$$outer_0 = $$outer_0;
}

defineClass(270, 1, {}, FileChooserDialog$lambda$0$Type);
_.loaded = function loaded_0(){
  $lambda$0_0(this.$$outer_0);
}
;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooserDialog$lambda$0$Type_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooserDialog/lambda$0$Type', 270);
function $notifyCallback(callback, file, filePath, fileName, title_0){
  try {
    callback.fileSelected(file, filePath, fileName, title_0);
  }
   catch (ex) {
  }
}

function $notifyCallbackCanceled(callback){
  try {
    callback.dialogCanceled();
  }
   catch (ex) {
    alert(ex);
  }
}

function $onModuleLoad_1(this$static){
  var localeName;
  if (!messages_0) {
    localeName = typeof $wnd.SESSION_LOCALE === 'undefined' || $wnd.SESSION_LOCALE === null?'':$wnd.SESSION_LOCALE;
    null == localeName || $equals_1('', $trim(localeName))?(messages_0 = new ResourceBundle):(messages_0 = new ResourceBundle_0(localeName));
  }
  $loadBundle(messages_0, getModuleBaseURL() + 'messages/', 'filechooser_messages', true, this$static);
}

function $setupNativeHooks(fileChooserEntryPoint){
  $wnd.openFileChooserDialog = function(callback, selectedPath){
    fileChooserEntryPoint.openFileChooserDialog_0(callback, selectedPath);
  }
  ;
  $wnd.openFolderChooserDialog = function(callback, selectedPath){
    fileChooserEntryPoint.openFolderChooserDialog_0(callback, selectedPath);
  }
  ;
  $wnd.saveFileChooserDialog = function(callback, selectedPath){
    fileChooserEntryPoint.saveFileChooserDialog_0(callback, selectedPath);
  }
  ;
  $wnd.saveAsFileChooserDialog = function(callback, selectedPath){
    fileChooserEntryPoint.saveAsFileChooserDialog_0(callback, selectedPath);
  }
  ;
}

function FileChooserEntryPoint(){
}

defineClass(174, 1, {}, FileChooserEntryPoint);
_.bundleLoaded = function bundleLoaded_0(bundleName){
  $setupNativeHooks(this);
}
;
_.openFileChooserDialog_0 = function openFileChooserDialog(callback, selectedPath){
  var dialog;
  dialog = new FileChooserDialog_2(($clinit_FileChooser$FileChooserMode() , OPEN), selectedPath);
  $addFileChooserListener_0(dialog, new FileChooserEntryPoint$2(callback));
}
;
_.openFolderChooserDialog_0 = function openFolderChooserDialog(callback, selectedPath){
  var dialog;
  dialog = new FileChooserDialog_2(($clinit_FileChooser$FileChooserMode() , OPEN), selectedPath);
  $addFileChooserListener_0(dialog, new FileChooserEntryPoint$2(callback));
  $setFileFilter_0(dialog, new FileChooserEntryPoint$1);
}
;
_.saveAsFileChooserDialog_0 = function saveAsFileChooserDialog(callback, selectedPath){
  var dialog;
  dialog = null;
  selectedPath == null?(dialog = new FileChooserDialog_3(($clinit_FileChooser$FileChooserMode() , SAVE), selectedPath, $getString(messages_0, 'SaveAs'), $getString(messages_0, 'Save'))):(dialog = new FileChooserDialog_0(($clinit_FileChooser$FileChooserMode() , SAVE), selectedPath, $getString(messages_0, 'SaveAs'), $getString(messages_0, 'Save')));
  $addFileChooserListener_0(dialog, new FileChooserEntryPoint$2(callback));
}
;
_.saveFileChooserDialog_0 = function saveFileChooserDialog(callback, selectedPath){
  var dialog;
  dialog = null;
  selectedPath == null?(dialog = new FileChooserDialog_2(($clinit_FileChooser$FileChooserMode() , SAVE), selectedPath)):(dialog = new FileChooserDialog(($clinit_FileChooser$FileChooserMode() , SAVE), selectedPath));
  $addFileChooserListener_0(dialog, new FileChooserEntryPoint$2(callback));
}
;
var messages_0 = null;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooserEntryPoint_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooserEntryPoint', 174);
function FileChooserEntryPoint$1(){
}

defineClass(177, 1, {}, FileChooserEntryPoint$1);
_.accept_0 = function accept_2(name_0, isDirectory, isVisible){
  return isDirectory;
}
;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooserEntryPoint$1_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooserEntryPoint/1', 177);
function FileChooserEntryPoint$2(val$callback){
  this.val$callback2 = val$callback;
}

defineClass(94, 1, {63:1}, FileChooserEntryPoint$2);
_.dialogCanceled_0 = function dialogCanceled_0(){
  $notifyCallbackCanceled(this.val$callback2);
}
;
_.fileSelected_1 = function fileSelected_0(file, filePath, fileName, title_0){
  $notifyCallback(this.val$callback2, file, filePath, fileName, title_0);
}
;
_.fileSelectionChanged = function fileSelectionChanged_0(file, filePath, fileName, title_0){
}
;
var Lorg_pentaho_gwt_widgets_client_filechooser_FileChooserEntryPoint$2_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'FileChooserEntryPoint/2', 94);
function $getTree(this$static){
  var serviceCallObj, value_0, fileTree, rf;
  serviceCallObj = ($clinit_JSONParser() , parse_0(this$static.jsonText)).isObject();
  value_0 = (fileTree = new RepositoryFileTree , rf = new RepositoryFile($get_0(serviceCallObj, 'file').isObject()) , fileTree.file = rf , processChildren(fileTree, serviceCallObj) , fileTree);
  return value_0;
}

function JsonToRepositoryFileTreeConverter(jsonText){
  this.jsonText = jsonText;
}

function processChildren(parent_0, jsoFolderContents){
  var child, childChildren, childValue, children, i, jsaChildren, jsvChildren, repositoryFile, repositoryFileTree;
  jsvChildren = $get_0(jsoFolderContents, 'children');
  children = new ArrayList;
  if (jsvChildren) {
    jsaChildren = jsvChildren.isArray_0();
    for (i = 0; i < jsaChildren.jsArray.length; i++) {
      repositoryFileTree = new RepositoryFileTree;
      child = $get(jsaChildren, i).isObject();
      childValue = $get_0(child, 'file');
      repositoryFile = new RepositoryFile(childValue.isObject());
      repositoryFileTree.file = repositoryFile;
      if (repositoryFile.folder) {
        childValue = $get_0(child, 'children');
        if (childValue) {
          childChildren = processChildren(repositoryFileTree, child);
          push_1(children.array, childChildren);
        }
         else {
          $setChildren(repositoryFileTree, new ArrayList);
          push_1(children.array, repositoryFileTree);
        }
      }
       else {
        push_1(children.array, repositoryFileTree);
      }
    }
  }
  parent_0.children = children;
  return parent_0;
}

defineClass(164, 1, {}, JsonToRepositoryFileTreeConverter);
var Lorg_pentaho_gwt_widgets_client_filechooser_JsonToRepositoryFileTreeConverter_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'JsonToRepositoryFileTreeConverter', 164);
function $buildPath(path, title_0){
  var file, parent_0;
  file = new JSONObject;
  $put(file, 'folder', new JSONString('true'));
  $put(file, 'title', new JSONString(title_0));
  $put(file, 'name', new JSONString(title_0));
  $put(file, 'path', new JSONString(path));
  parent_0 = new JSONObject;
  $get_0(parent_0, 'file');
  $put0(parent_0, 'file', file);
  $put(parent_0, 'children', new JSONArray);
  return parent_0;
}

function $buildTree_0(json){
  var child, children, children0, currentParent, currentPath, file, i, jsonObject, parts, path, root;
  jsonObject = ($clinit_JSONParser() , parse_0(json)).isObject();
  file = castTo($get_0(jsonObject, 'file'), 66);
  path = castTo($get_0(file, 'path'), 54).value_0;
  parts = $split(path, '/', 0);
  root = $buildPath('/', '');
  currentParent = root;
  currentPath = '';
  for (i = 1; i < parts.length - 1; i++) {
    currentPath = currentPath + '/' + parts[i];
    child = $findChildByPath(currentParent, currentPath);
    !child?(children0 = castTo($get_0(currentParent, 'children'), 67)):(children0 = castTo($get_0(child, 'children'), 67));
    currentParent = $buildPath(currentPath, parts[i]);
    $get(children0, 0);
    $set0(children0, 0, currentParent);
  }
  children = castTo($get_0(currentParent, 'children'), 67);
  $get(children, 0);
  $set0(children, 0, jsonObject);
  return $toString_0(root);
}

function $cache(this$static, path, fileTree){
  $putStringValue(this$static.cache, path, fileTree);
}

function $findChildByPath(parent_0, path){
  var child, childPath, children, i;
  children = castTo($get_0(parent_0, 'children'), 67);
  for (i = 0; i < children.jsArray.length; i++) {
    child = castTo($get(children, 0), 66);
    childPath = castTo($get_0(child, 'path'), 54);
    if ($equals_1(childPath.value_0, path)) {
      return child;
    }
  }
  return null;
}

function $findParentByPath(this$static, tree, path){
  var child, child$iterator, repositoryFileTree;
  if ($equals_1(tree.file.path, path)) {
    return tree;
  }
  for (child$iterator = new ArrayList$1(tree.children); child$iterator.i < child$iterator.this$01.array.length;) {
    child = castTo($next_4(child$iterator), 59);
    if (child.file.folder && $equals_1(child.file.path, path)) {
      return child;
    }
    if (child.file.folder && child.children.array.length != 0) {
      repositoryFileTree = $findParentByPath(this$static, child, path);
      if (repositoryFileTree) {
        return repositoryFileTree;
      }
    }
  }
  return null;
}

function $getCached(this$static, path){
  return castTo($getStringValue(this$static.cache, path), 59);
}

function $insertTree(this$static, rootTree, fileTree){
  var childIndex, childTree, i, parentPath, parentTree, path;
  path = fileTree.file.path;
  parentPath = $substring_0(path, 0, path.lastIndexOf('/'));
  parentPath = $equals_1(parentPath, '')?'/':parentPath;
  parentTree = $findParentByPath(this$static, rootTree, parentPath);
  if (parentTree) {
    childIndex = -1;
    for (i = 0; i < parentTree.children.array.length; i++) {
      childTree = castTo($get_3(parentTree.children, i), 59);
      $equals_1(childTree.file.path, fileTree.file.path) && (childIndex = i);
    }
    childIndex != -1 && $set_1(parentTree.children, childIndex, fileTree);
  }
}

function $isCached(this$static, path){
  return $hasStringValue(this$static.cache, path);
}

function LazyTreeLoader(){
  this.cache = new HashMap;
}

defineClass(410, 1, {}, LazyTreeLoader);
var Lorg_pentaho_gwt_widgets_client_filechooser_LazyTreeLoader_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'LazyTreeLoader', 410);
function JSONValueToBoolean(jso, fieldName){
  var temp;
  temp = $get_0(jso, fieldName);
  if (temp) {
    return $booleanValue(($clinit_Boolean() , $equalsIgnoreCase('true', temp.isString().value_0)?true:false));
  }
  return false;
}

function JSONValueToDate(jso, fieldName){
  var temp;
  temp = $get_0(jso, fieldName);
  if (temp) {
    return parseDateTime(temp.isString().value_0);
  }
  return null;
}

function JSONValueToInt(jso){
  var temp;
  temp = $get_0(jso, 'ownerType');
  if (temp) {
    return valueOf_0(__parseAndValidateInt(temp.isString().value_0)).value_0;
  }
  return 0;
}

function JSONValueToLong(jso){
  var temp;
  temp = $get_0(jso, 'fileSize');
  if (temp) {
    return valueOf_1(__parseAndValidateLong(temp.isString().value_0)).value_0;
  }
  return 0;
}

function JSONValueToString(jso, fieldName){
  var temp;
  temp = $get_0(jso, fieldName);
  if (temp) {
    return temp.isString().value_0;
  }
  return null;
}

function RepositoryFile(jso){
  var repositoryFileJSON, rftdo;
  rftdo = jso;
  repositoryFileJSON = $get_0(rftdo, 'repositoryFileDto')?$get_0(rftdo, 'repositoryFileDto').isObject():jso;
  this.folder = JSONValueToBoolean(repositoryFileJSON, 'folder');
  JSONValueToString(repositoryFileJSON, 'creatorId');
  JSONValueToDate(repositoryFileJSON, 'createdDate');
  JSONValueToLong(repositoryFileJSON);
  this.hidden = JSONValueToBoolean(repositoryFileJSON, 'hidden');
  this.id_0 = JSONValueToString(repositoryFileJSON, 'id');
  JSONValueToString(repositoryFileJSON, 'locale');
  JSONValueToBoolean(repositoryFileJSON, 'locked');
  this.name_0 = JSONValueToString(repositoryFileJSON, 'name');
  JSONValueToInt(repositoryFileJSON);
  this.path = JSONValueToString(repositoryFileJSON, 'path');
  this.title_0 = JSONValueToString(repositoryFileJSON, 'title');
  JSONValueToString(repositoryFileJSON, 'versionId');
  JSONValueToString(repositoryFileJSON, 'description');
  if (!this.folder) {
    JSONValueToDate(repositoryFileJSON, 'deletedDate');
    this.lastModifiedDate = JSONValueToDate(repositoryFileJSON, 'lastModifiedDate');
    JSONValueToDate(repositoryFileJSON, 'lockDate');
    JSONValueToString(repositoryFileJSON, 'lockMessage');
    JSONValueToString(repositoryFileJSON, 'lockOwner');
    JSONValueToString(repositoryFileJSON, 'originalParentFolderId');
    JSONValueToString(repositoryFileJSON, 'originalParentFolderPath');
    JSONValueToString(repositoryFileJSON, 'owner');
    JSONValueToBoolean(repositoryFileJSON, 'versioned');
  }
}

function parseDateTime(dateTimeString){
  var date, timeInMillis;
  date = null;
  try {
    timeInMillis = valueOf_1(__parseAndValidateLong(dateTimeString));
    date = new Date_0(timeInMillis.value_0);
  }
   catch ($e0) {
    $e0 = toJava($e0);
    if (instanceOf($e0, 19)) {
      return null;
    }
     else 
      throw toJs($e0);
  }
  return date;
}

defineClass(160, 1, $intern_1, RepositoryFile);
_.folder = false;
_.hidden = false;
var Lorg_pentaho_gwt_widgets_client_filechooser_RepositoryFile_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'RepositoryFile', 160);
function $setChildren(this$static, children){
  this$static.children = children;
}

function RepositoryFileTree(){
}

defineClass(59, 1, {3:1, 59:1}, RepositoryFileTree);
var Lorg_pentaho_gwt_widgets_client_filechooser_RepositoryFileTree_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'RepositoryFileTree', 59);
function buildSolutionTree(parentTreeItem, fileTree, showHiddenFiles, showLocalizedFileNames, filter){
  var childTreeItem, file, fileName, fileTitle, inserted, isDirectory, isVisible, j, kid, removedItem, removedItem$iterator, removedItem$iterator0, removedItems, repositoryFileTree, repositoryFileTree$iterator, x_0;
  for (repositoryFileTree$iterator = new ArrayList$1(fileTree.children); repositoryFileTree$iterator.i < repositoryFileTree$iterator.this$01.array.length;) {
    repositoryFileTree = castTo($next_4(repositoryFileTree$iterator), 59);
    file = repositoryFileTree.file;
    isVisible = !file.hidden;
    isDirectory = file.folder;
    if (isVisible || showHiddenFiles) {
      fileTitle = file.title_0;
      fileName = file.name_0;
      if (!filter.accept_0(fileName, isDirectory, isVisible || showHiddenFiles)) {
        continue;
      }
      childTreeItem = new TreeItem;
      if (showLocalizedFileNames) {
        childTreeItem.contentElem.innerHTML = '';
        $setInnerText(childTreeItem.contentElem, fileTitle);
        $setTitle(childTreeItem.contentElem, fileTitle);
      }
       else {
        childTreeItem.contentElem.innerHTML = '';
        $setInnerText(childTreeItem.contentElem, fileTitle);
        $setTitle(childTreeItem.contentElem, fileTitle);
      }
      childTreeItem.userObject = repositoryFileTree;
      if ($getChildCount(parentTreeItem) == 0) {
        (!!childTreeItem.parent_0 || !!childTreeItem.tree) && (childTreeItem.parent_0?$removeItem_0(childTreeItem.parent_0, childTreeItem):!!childTreeItem.tree && $removeItem(childTreeItem.tree, childTreeItem));
        $insertItem_0(parentTreeItem, $getChildCount(parentTreeItem), childTreeItem);
      }
       else {
        inserted = false;
        for (j = 0; j < $getChildCount(parentTreeItem); j++) {
          kid = $getChild_1(parentTreeItem, j);
          if (showLocalizedFileNames) {
            if ($compareTo_5(childTreeItem.contentElem.textContent, kid.contentElem.textContent) <= 0) {
              removedItems = new ArrayList;
              for (x_0 = j; x_0 < $getChildCount(parentTreeItem); x_0++) {
                removedItem = $getChild_1(parentTreeItem, x_0);
                push_1(removedItems.array, removedItem);
              }
              for (removedItem$iterator0 = new ArrayList$1(removedItems); removedItem$iterator0.i < removedItem$iterator0.this$01.array.length;) {
                removedItem = castTo($next_4(removedItem$iterator0), 30);
                $removeItem_0(parentTreeItem, removedItem);
              }
              (!!childTreeItem.parent_0 || !!childTreeItem.tree) && (childTreeItem.parent_0?$removeItem_0(childTreeItem.parent_0, childTreeItem):!!childTreeItem.tree && $removeItem(childTreeItem.tree, childTreeItem));
              $insertItem_0(parentTreeItem, $getChildCount(parentTreeItem), childTreeItem);
              inserted = true;
              for (removedItem$iterator = new ArrayList$1(removedItems); removedItem$iterator.i < removedItem$iterator.this$01.array.length;) {
                removedItem = castTo($next_4(removedItem$iterator), 30);
                (!!removedItem.parent_0 || !!removedItem.tree) && (removedItem.parent_0?$removeItem_0(removedItem.parent_0, removedItem):!!removedItem.tree && $removeItem(removedItem.tree, removedItem));
                $insertItem_0(parentTreeItem, $getChildCount(parentTreeItem), removedItem);
              }
              break;
            }
          }
           else {
            (!!childTreeItem.parent_0 || !!childTreeItem.tree) && (childTreeItem.parent_0?$removeItem_0(childTreeItem.parent_0, childTreeItem):!!childTreeItem.tree && $removeItem(childTreeItem.tree, childTreeItem));
            $insertItem_0(parentTreeItem, $getChildCount(parentTreeItem), childTreeItem);
          }
        }
        inserted || ((!!childTreeItem.parent_0 || !!childTreeItem.tree) && (childTreeItem.parent_0?$removeItem_0(childTreeItem.parent_0, childTreeItem):!!childTreeItem.tree && $removeItem(childTreeItem.tree, childTreeItem)) , $insertItem_0(parentTreeItem, $getChildCount(parentTreeItem), childTreeItem));
      }
      isDirectory && buildSolutionTree(childTreeItem, repositoryFileTree, showHiddenFiles, showLocalizedFileNames, filter);
    }
  }
}

function buildSolutionTree_0(fileTree, showHiddenFiles, showLocalizedFileNames, filter){
  var repositoryTree, rootFile, rootItem;
  repositoryTree = new Tree;
  rootFile = fileTree.file;
  rootItem = new TreeItem;
  $setText_1(rootItem, rootFile.path);
  rootItem.userObject = fileTree;
  $addItem(repositoryTree.root, rootItem);
  !filter && (filter = new TreeBuilder$DefaultFileFilter);
  buildSolutionTree(rootItem, fileTree, showHiddenFiles, showLocalizedFileNames, filter);
  return repositoryTree;
}

function TreeBuilder$DefaultFileFilter(){
}

defineClass(312, 1, {}, TreeBuilder$DefaultFileFilter);
_.accept_0 = function accept_3(name_0, isDirectory, isVisible){
  return true;
}
;
var Lorg_pentaho_gwt_widgets_client_filechooser_TreeBuilder$DefaultFileFilter_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'TreeBuilder/DefaultFileFilter', 312);
function $compare_0(this$static, treeItem1, treeItem2){
  var repositoryFile1, repositoryFile2, repositoryFileTree1, repositoryFileTree2;
  repositoryFileTree1 = treeItem1.userObject;
  repositoryFile1 = repositoryFileTree1.file;
  repositoryFileTree2 = treeItem2.userObject;
  repositoryFile2 = repositoryFileTree2.file;
  return $compare_1(repositoryFile1.title_0, repositoryFile2.title_0);
}

function $compare_1(a, b){
  var aTitle = a.toLowerCase();
  var bTitle = b.toLowerCase();
  if (aTitle.localeCompare(bTitle) == 0) {
    aTitle = a;
    bTitle = b;
    return aTitle < bTitle?-1:aTitle > bTitle?1:0;
  }
   else {
    return aTitle.localeCompare(bTitle);
  }
}

function TreeItemComparator(){
  setupNativeHooks_0(this);
}

function setupNativeHooks_0(comparator){
  $wnd.localeCompare = function(title1, title2){
    return comparator.compare_0(title1, title2);
  }
  ;
}

defineClass(408, 1, {}, TreeItemComparator);
_.compare = function compare_6(treeItem1, treeItem2){
  return $compare_0(this, castTo(treeItem1, 30), castTo(treeItem2, 30));
}
;
_.equals_0 = function equals_26(other){
  return this === other;
}
;
_.compare_0 = function compare_7(a, b){
  return $compare_1(a, b);
}
;
var Lorg_pentaho_gwt_widgets_client_filechooser_TreeItemComparator_2_classLit = createForClass('org.pentaho.gwt.widgets.client.filechooser', 'TreeItemComparator', 408);
function getString(){
  if (!messageBundle) {
    return 'dialog.button.ok';
  }
  return $getString(messageBundle, 'dialog.button.ok');
}

var messageBundle;
function ScrollFlexPanel(){
  var localContainerElem;
  SimplePanel.call(this);
  this.scrollableElem = ($clinit_DOM() , this.element);
  this.containerElem = $doc.createElement('div');
  $appendChild(this.scrollableElem, this.containerElem);
  this.scrollableElem.style['overflow'] = ($clinit_Style$Overflow() , 'auto');
  this.scrollableElem.style['position'] = ($clinit_Style$Position() , 'relative');
  this.containerElem.style['position'] = 'relative';
  this.scrollableElem.style['zoom'] = '1';
  this.containerElem.style['zoom'] = '1';
  $setTouchScrollingDisabled(this);
  !impl_2 && (impl_2 = new ScrollImpl);
  setStyleName(this.element, 'pentaho-gwt-ScrollFlexPanel', true);
  setStyleName(this.element, 'flex-column', true);
  setStyleName(this.element, 'with-scroll-child', true);
  localContainerElem = $getFirstChildElement(this.element);
  $addClassName(localContainerElem, 'flex-column');
  $addClassName(localContainerElem, 'with-scroll-child');
}

defineClass(407, 406, $intern_26, ScrollFlexPanel);
var Lorg_pentaho_gwt_widgets_client_panel_ScrollFlexPanel_2_classLit = createForClass('org.pentaho.gwt.widgets.client.panel', 'ScrollFlexPanel', 407);
function $clinit_ElementUtils(){
  $clinit_ElementUtils = emptyMethod;
  sandbox = new AbsolutePanel;
  $getElement(sandbox).style['position'] = 'absolute';
  $getElement(sandbox).style['overflow'] = 'hidden';
  $getElement(sandbox).style['width'] = '0px';
  $getElement(sandbox).style['height'] = '0px';
  $add_0(($clinit_RootPanel() , get_0()), sandbox);
}

function click_0(e){
  $clinit_ElementUtils();
  e.click && e.click();
}

function ensureId(widget){
  $clinit_ElementUtils();
  var element, id_0;
  element = ($clinit_DOM() , widget.element);
  id_0 = element.id;
  if (null == id_0 || $equals_1('', $trim(id_0))) {
    id_0 = $createUniqueId($doc);
    element.id = id_0;
  }
  return id_0;
}

function findElementAboveByTagName(base){
  $clinit_ElementUtils();
  var curEle, parent_0;
  curEle = base;
  while (parent_0 = $getParentElement(curEle)) {
    if ($equalsIgnoreCase(parent_0.tagName, 'table')) {
      return parent_0;
    }
    curEle = parent_0;
  }
  return null;
}

function isFocusable(elem){
  $clinit_ElementUtils();
  return $wnd.pho.util._focus.isTabbable(elem, {focusable:true});
}

function preventTextSelection(ele){
  $clinit_ElementUtils();
  if (ele.getAttribute('style') != null) {
    var isWebkit = 'webkitRequestAnimationFrame' in $wnd;
    document.all?(ele.onselectstart = function(){
      return false;
    }
    ):isWebkit?(ele.style.webkitUserSelect = 'none'):(ele.style.MozUserSelect = 'none');
  }
}

function setAriaLabelledBy(widget, label_0){
  $clinit_ElementUtils();
  $set_0(($clinit_Property() , LABELLEDBY), ($clinit_DOM() , widget.element), stampJavaTypeInfo(getClassLiteralForArray(Lcom_google_gwt_aria_client_Id_2_classLit, 1), $intern_1, 58, 0, [new Id_0(ensureId(label_0))]));
}

var sandbox;
function $clinit_FrameUtils(){
  $clinit_FrameUtils = emptyMethod;
  timers = new HashMap;
}

function setEmbedVisibility(frame_0, visible){
  var t;
  if ($containsKey(timers, frame_0)) {
    t = castTo($get_2(timers, frame_0), 131);
    if (t.visible == visible) {
      return;
    }
     else {
      $cancel_0(t);
      t.visible = visible;
      $schedule(t, 200);
    }
  }
   else {
    t = new FrameUtils$FrameTimer(frame_0, visible);
    $put_1(timers, frame_0, t);
    $schedule(t, 200);
  }
}

function toggleEmbedVisibility(frame_0, visible){
  $clinit_FrameUtils();
  if (!window.globalStorage) {
    return;
  }
  try {
    var doc = frame_0.contentWindow.document || frame_0.contentDocument;
    if (doc == null) {
      return;
    }
    var embeds = doc.getElementsByTagName('embed');
    if (embeds.length > 0) {
      var containsPdf = false;
      for (var i = 0; i < embeds.length; i++) {
        if (embeds[i].type && embeds[i].type == 'application/pdf') {
          containsPdf = true;
          break;
        }
      }
      if (containsPdf) {
        if (visible) {
          if (frame_0.style.display == 'none') {
            frame_0.style.display = '';
            if (frame_0.style.height == '100%') {
              frame_0.style.height = '99%';
              frame_0.style.height = '100%';
            }
          }
        }
         else {
          frame_0.style.display = 'none';
        }
      }
    }
    var iframes = doc.getElementsByTagName('iframe');
    if (iframes.length > 0) {
      for (var i = 0; i < iframes.length; i++) {
        toggleEmbedVisibility(iframes[i], visible);
      }
    }
  }
   catch (e) {
  }
}

function toggleEmbedVisibility_0(visible){
  var frame_0;
  $clinit_FrameUtils();
  var ele, ele$array, ele$index, ele$max, f, frames_0, i, t, tmap;
  frames_0 = initUnidimensionalArray(Lcom_google_gwt_core_client_JavaScriptObject_2_classLit, $intern_43, 0, 0, 2, 1);
  try {
    frames_0 = ($clinit_ElementUtils() , $doc.getElementsByTagName('iframe'));
  }
   catch ($e0) {
    $e0 = toJava($e0);
    if (!instanceOf($e0, 113))
      throw toJs($e0);
  }
  for (ele$array = frames_0 , ele$index = 0 , ele$max = ele$array.length; ele$index < ele$max; ++ele$index) {
    ele = ele$array[ele$index];
    f = null;
    tmap = $toArray(new AbstractHashMap$EntrySet(timers));
    for (i = 0; i < tmap.length; i++) {
      t = castTo(tmap[i], 23);
      $getElement(castTo(t.getKey(), 111)) == ele && (f = castTo(t.getKey(), 111));
    }
    !f && (f = (frame_0 = new Frame_0(ele) , $onAttach(frame_0) , $clinit_RootPanel() , $add_7(widgetsToDetach, frame_0) , frame_0));
    setEmbedVisibility(f, visible);
  }
}

var timers;
function FrameUtils$FrameTimer(frame_0, visible){
  Timer.call(this);
  this.frame_0 = frame_0;
  this.visible = visible;
}

defineClass(131, 100, {131:1}, FrameUtils$FrameTimer);
_.run = function run_2(){
  toggleEmbedVisibility($getElement(this.frame_0), this.visible);
  $remove_8(($clinit_FrameUtils() , timers), this.frame_0);
}
;
_.visible = false;
var Lorg_pentaho_gwt_widgets_client_utils_FrameUtils$FrameTimer_2_classLit = createForClass('org.pentaho.gwt.widgets.client.utils', 'FrameUtils/FrameTimer', 131);
function $clinit_NameUtils(){
  $clinit_NameUtils = emptyMethod;
  containsReservedCharsPattern = makeReservedCharsPattern();
  containsControlCharactersPattern = new RegExp('[\\x00-\\x1F\\x7F]');
}

function URLEncode(value_0){
  $clinit_NameUtils();
  return $wnd.pho.Encoder.encode('{0}', value_0);
}

function isValidFileName(name_0){
  $clinit_NameUtils();
  if (null == name_0 || $equals_1('', $trim(name_0)) || !$equals_1($trim(name_0), name_0) || $test(containsReservedCharsPattern, name_0) || $test(containsControlCharactersPattern, name_0)) {
    return false;
  }
  return true;
}

function makeReservedCharsPattern(){
  var buf, ch_0, ch$array, ch$index, ch$max;
  buf = new StringBuilder;
  buf.string += '.*[';
  for (ch$array = $toCharArray($wnd.RESERVED_CHARS) , ch$index = 0 , ch$max = ch$array.length; ch$index < ch$max; ++ch$index) {
    ch_0 = valueOf(ch$array[ch$index]);
    $append_1((buf.string += '\\' , buf), ch_0);
  }
  buf.string += ']+.*';
  return compile(buf.string);
}

var containsControlCharactersPattern, containsReservedCharsPattern;
function buildProperties(text_0, defaultProperties){
  var i, key, line, lineTokenizer, settings, value_0;
  settings = new HashMap;
  $putAll(settings, defaultProperties);
  if (null == text_0 || $equals_1('', $trim(text_0))) {
    return settings;
  }
  lineTokenizer = new StringTokenizer(text_0, 10);
  for (i = 0; i < lineTokenizer.tokens.array.length; i++) {
    line = castToString($get_3(lineTokenizer.tokens, i));
    if ($indexOf_0(line, fromCodePoint(61)) != -1) {
      key = $trim($substring_0(line, 0, $indexOf_0(line, fromCodePoint(61))));
      value_0 = $trim($substring(line, $indexOf_0(line, fromCodePoint(61)) + 1));
      key == null?$put_2(settings.hashCodeMap, null, value_0):$put_3(settings.stringMap, key, value_0);
    }
  }
  return settings;
}

function $clinit_ResourceBundle(){
  $clinit_ResourceBundle = emptyMethod;
  bundleCache = new HashMap;
  entityDecoder = new HTML;
}

function $$init_0(this$static){
  this$static.bundle = new HashMap;
}

function $decodeMapValues(map_0){
  var entry, entry$iterator;
  for (entry$iterator = new AbstractHashMap$EntrySetIterator((new AbstractHashMap$EntrySet(map_0)).this$01); entry$iterator.hasNext;) {
    entry = $next_3(entry$iterator);
    entry.setValue($decodeUTF8(castToString(entry.getValue())));
  }
}

function $decodeUTF8(str){
  var hex, index_0;
  if (str == null) {
    return str;
  }
  while (str.indexOf('\\u') != -1) {
    index_0 = str.indexOf('\\u');
    hex = (checkCriticalStringBounds(index_0 + 2, index_0 + 6, str.length) , str.substr(index_0 + 2, index_0 + 6 - (index_0 + 2)));
    str = (checkCriticalStringBounds(0, index_0, str.length) , str.substr(0, index_0) + '&#x' + hex + ';' + (checkCriticalStringElementIndex(index_0 + 6, str.length + 1) , str.substr(index_0 + 6)));
    $setHTML(entityDecoder, str);
    str = $getTextOrHtml(entityDecoder.directionalTextHelper, true);
  }
  return str;
}

function $fireBundleLoadCallback(this$static){
  !!this$static.bundleLoadCallback && this$static.bundleLoadCallback.bundleLoaded(this$static.bundleName);
}

function $getString(this$static, key){
  var resource;
  resource = castToString($getStringValue(this$static.bundle, key));
  if (resource == null) {
    return key;
  }
  return $decodeUTF8(resource);
}

function $getString_0(this$static, parameters){
  var i, resource;
  resource = castToString($getStringValue(this$static.bundle, 'invalidFilename'));
  if (resource == null) {
    return 'Invalid Filename';
  }
  for (i = 0; i < parameters.length; i++) {
    resource = $replace_0(resource, '{' + i + '}', parameters[i]);
  }
  return $decodeUTF8(resource);
}

function $getUrlExtras(){
  return document.all?'?rand=' + Math.random() * 10000:'';
}

function $isSupportedLanguage(this$static, languageCode){
  var returnValue_0;
  if (!this$static.supportedLanguages) {
    return true;
  }
  returnValue_0 = $hasStringValue(this$static.supportedLanguages, languageCode);
  return returnValue_0;
}

function $loadBundle(this$static, path, bundleName, attemptLocalizedFetches, bundleLoadCallback){
  var suffixlength, supportedLangCallback, supportedLanguagesBundle;
  this$static.bundleName = bundleName;
  this$static.bundleLoadCallback = bundleLoadCallback;
  this$static.attemptLocalizedFetches = attemptLocalizedFetches;
  !(null == path || $equals_1('', $trim(path))) && (suffixlength = '/'.length , !$equals_1(path.substr(path.length - suffixlength, suffixlength), '/')) && (path = path + '/');
  this$static.path = path;
  this$static.baseCallback = new ResourceBundle$2(this$static);
  this$static.langCallback = new ResourceBundle$3(this$static);
  this$static.langCountryCallback = new ResourceBundle$4(this$static);
  supportedLanguagesBundle = new ResourceBundle;
  supportedLangCallback = new ResourceBundle$1(this$static, supportedLanguagesBundle, bundleName);
  attemptLocalizedFetches && !this$static.supportedLanguages?$loadBundle(supportedLanguagesBundle, path, bundleName + '_supported_languages', false, supportedLangCallback):$bundleLoaded(supportedLangCallback);
}

function ResourceBundle(){
  var paramsForName;
  $clinit_ResourceBundle();
  $$init_0(this);
  this.localeName = defaultIfEmpty((ensureListParameterMap() , paramsForName = castTo(listParamMap.get_0('locale'), 37) , !paramsForName?null:castToString(paramsForName.get_1(paramsForName.size_1() - 1))), getLanguagePreference());
}

function ResourceBundle_0(localeName){
  $clinit_ResourceBundle();
  $$init_0(this);
  this.localeName = defaultIfEmpty(localeName, getLanguagePreference());
}

function getLanguagePreference(){
  var m = $doc.getElementsByTagName('meta');
  for (var i in m) {
    if (m[i].name == 'gwt:property' && m[i].content.indexOf('locale=') != -1) {
      return m[i].content.substring(m[i].content.indexOf('=') + 1);
    }
  }
  return 'default';
}

defineClass(93, 1, {}, ResourceBundle, ResourceBundle_0);
_.attemptLocalizedFetches = true;
_.baseCallback = null;
_.bundleLoadCallback = null;
_.bundleName = null;
_.currentAttemptUrl = null;
_.langCallback = null;
_.langCountryCallback = null;
_.localeName = 'default';
_.path = null;
_.supportedLanguages = null;
var bundleCache, entityDecoder;
var Lorg_pentaho_gwt_widgets_client_utils_i18n_ResourceBundle_2_classLit = createForClass('org.pentaho.gwt.widgets.client.utils.i18n', 'ResourceBundle', 93);
function $bundleLoaded(this$static){
  var e, requestBuilder;
  if (!this$static.this$01.supportedLanguages) {
    this$static.this$01.supportedLanguages = this$static.val$supportedLanguagesBundle2.bundle;
    $decodeMapValues(this$static.this$01.supportedLanguages);
  }
  this$static.this$01.currentAttemptUrl = this$static.this$01.path + ('' + this$static.val$bundleName3) + '.properties' + $getUrlExtras();
  if ($hasStringValue(($clinit_ResourceBundle() , bundleCache), this$static.this$01.currentAttemptUrl)) {
    $scheduleDeferred(($clinit_SchedulerImpl() , INSTANCE), new ResourceBundle$1$1(this$static));
  }
   else {
    requestBuilder = new RequestBuilder(($clinit_RequestBuilder() , GET), this$static.this$01.currentAttemptUrl);
    try {
      $sendRequest(requestBuilder, this$static.this$01.baseCallback);
    }
     catch ($e0) {
      $e0 = toJava($e0);
      if (instanceOf($e0, 36)) {
        e = $e0;
        alert_0('base load: ' + e.detailMessage);
        $fireBundleLoadCallback(this$static.this$01);
      }
       else 
        throw toJs($e0);
    }
  }
}

function ResourceBundle$1(this$0, val$supportedLanguagesBundle, val$bundleName){
  this.this$01 = this$0;
  this.val$supportedLanguagesBundle2 = val$supportedLanguagesBundle;
  this.val$bundleName3 = val$bundleName;
}

defineClass(185, 1, {}, ResourceBundle$1);
_.bundleLoaded = function bundleLoaded_1(ignore){
  $bundleLoaded(this);
}
;
var Lorg_pentaho_gwt_widgets_client_utils_i18n_ResourceBundle$1_2_classLit = createForClass('org.pentaho.gwt.widgets.client.utils.i18n', 'ResourceBundle/1', 185);
function ResourceBundle$1$1(this$1){
  this.this$11 = this$1;
}

defineClass(186, 1, {}, ResourceBundle$1$1);
_.execute_1 = function execute_12(){
  $onResponseReceived(this.this$11.this$01.baseCallback, new ResourceBundle$FakeResponse(castToString($getStringValue(($clinit_ResourceBundle() , bundleCache), this.this$11.this$01.currentAttemptUrl))));
}
;
var Lorg_pentaho_gwt_widgets_client_utils_i18n_ResourceBundle$1$1_2_classLit = createForClass('org.pentaho.gwt.widgets.client.utils.i18n', 'ResourceBundle/1/1', 186);
function $onResponseReceived(this$static, response){
  var e, lang_0, propertiesFileText, requestBuilder, st;
  propertiesFileText = response.getText();
  if (response.getStatusCode() == 200) {
    this$static.this$01.bundle = buildProperties(propertiesFileText, this$static.this$01.bundle);
    instanceOf(response, 73) || $putStringValue(($clinit_ResourceBundle() , bundleCache), this$static.this$01.currentAttemptUrl, propertiesFileText);
  }
   else {
    $putStringValue(($clinit_ResourceBundle() , bundleCache), this$static.this$01.currentAttemptUrl, '');
  }
  if (!this$static.this$01.attemptLocalizedFetches) {
    $fireBundleLoadCallback(this$static.this$01);
    return;
  }
  if ($equalsIgnoreCase(this$static.this$01.localeName, 'default')) {
    $fireBundleLoadCallback(this$static.this$01);
    return;
  }
   else {
    st = new StringTokenizer(this$static.this$01.localeName, 95);
    if (st.tokens.array.length > 0) {
      lang_0 = castToString($get_3(st.tokens, 0));
      this$static.this$01.currentAttemptUrl = this$static.this$01.path + ('' + this$static.this$01.bundleName) + '_' + lang_0 + '.properties' + $getUrlExtras();
      if (!$isSupportedLanguage(this$static.this$01, lang_0) || $hasStringValue(($clinit_ResourceBundle() , bundleCache), this$static.this$01.currentAttemptUrl)) {
        $onResponseReceived_0(this$static.this$01.langCallback, new ResourceBundle$FakeResponse(castToString($getStringValue(($clinit_ResourceBundle() , bundleCache), this$static.this$01.currentAttemptUrl))));
      }
       else {
        requestBuilder = new RequestBuilder(($clinit_RequestBuilder() , GET), this$static.this$01.currentAttemptUrl);
        $setHeader(requestBuilder, 'Cache-Control', 'no-cache');
        try {
          $sendRequest(requestBuilder, this$static.this$01.langCallback);
        }
         catch ($e0) {
          $e0 = toJava($e0);
          if (instanceOf($e0, 36)) {
            e = $e0;
            alert_0('lang: ' + e.detailMessage);
            $fireBundleLoadCallback(this$static.this$01);
          }
           else 
            throw toJs($e0);
        }
      }
    }
     else if (st.tokens.array.length == 0) {
      $fireBundleLoadCallback(this$static.this$01);
      return;
    }
  }
}

function ResourceBundle$2(this$0){
  this.this$01 = this$0;
}

defineClass(187, 1, {}, ResourceBundle$2);
_.onError = function onError_1(request, exception){
  alert_0('baseCallback: ' + exception.detailMessage);
  $fireBundleLoadCallback(this.this$01);
}
;
_.onResponseReceived = function onResponseReceived_1(request, response){
  $onResponseReceived(this, response);
}
;
var Lorg_pentaho_gwt_widgets_client_utils_i18n_ResourceBundle$2_2_classLit = createForClass('org.pentaho.gwt.widgets.client.utils.i18n', 'ResourceBundle/2', 187);
function $onResponseReceived_0(this$static, response){
  var e, propertiesFileText, requestBuilder, st;
  propertiesFileText = response.getText();
  if (response.getStatusCode() == 200) {
    this$static.this$01.bundle = buildProperties(propertiesFileText, this$static.this$01.bundle);
    instanceOf(response, 73) || $putStringValue(($clinit_ResourceBundle() , bundleCache), this$static.this$01.currentAttemptUrl, propertiesFileText);
  }
   else {
    $putStringValue(($clinit_ResourceBundle() , bundleCache), this$static.this$01.currentAttemptUrl, '');
  }
  st = new StringTokenizer(this$static.this$01.localeName, 95);
  if (st.tokens.array.length == 2) {
    $isSupportedLanguage(this$static.this$01, this$static.this$01.localeName) || $isSupportedLanguage(this$static.this$01, castToString($get_3(st.tokens, 0)) + '_' + castToString($get_3(st.tokens, 1)).toUpperCase()) && (this$static.this$01.localeName = castToString($get_3(st.tokens, 0)) + '_' + castToString($get_3(st.tokens, 1)).toUpperCase());
    this$static.this$01.currentAttemptUrl = this$static.this$01.path + ('' + this$static.this$01.bundleName) + '_' + this$static.this$01.localeName + '.properties' + $getUrlExtras();
    if (!$isSupportedLanguage(this$static.this$01, this$static.this$01.localeName) || $hasStringValue(($clinit_ResourceBundle() , bundleCache), this$static.this$01.currentAttemptUrl)) {
      $onResponseReceived_1(this$static.this$01.langCountryCallback, new ResourceBundle$FakeResponse(castToString($getStringValue(($clinit_ResourceBundle() , bundleCache), this$static.this$01.currentAttemptUrl))));
    }
     else {
      requestBuilder = new RequestBuilder(($clinit_RequestBuilder() , GET), this$static.this$01.currentAttemptUrl);
      try {
        $sendRequest(requestBuilder, this$static.this$01.langCountryCallback);
      }
       catch ($e0) {
        $e0 = toJava($e0);
        if (instanceOf($e0, 36)) {
          e = $e0;
          alert_0('langCountry: ' + e.detailMessage);
          $fireBundleLoadCallback(this$static.this$01);
        }
         else 
          throw toJs($e0);
      }
    }
  }
   else {
    $fireBundleLoadCallback(this$static.this$01);
    return;
  }
}

function ResourceBundle$3(this$0){
  this.this$01 = this$0;
}

defineClass(188, 1, {}, ResourceBundle$3);
_.onError = function onError_2(request, exception){
  alert_0('langCallback: ' + exception.detailMessage);
  $fireBundleLoadCallback(this.this$01);
}
;
_.onResponseReceived = function onResponseReceived_2(request, response){
  $onResponseReceived_0(this, response);
}
;
var Lorg_pentaho_gwt_widgets_client_utils_i18n_ResourceBundle$3_2_classLit = createForClass('org.pentaho.gwt.widgets.client.utils.i18n', 'ResourceBundle/3', 188);
function $onResponseReceived_1(this$static, response){
  var propertiesFileText;
  propertiesFileText = response.getText();
  if (response.getStatusCode() == 200) {
    this$static.this$01.bundle = buildProperties(propertiesFileText, this$static.this$01.bundle);
    instanceOf(response, 73) || $putStringValue(($clinit_ResourceBundle() , bundleCache), this$static.this$01.currentAttemptUrl, propertiesFileText);
  }
   else {
    $putStringValue(($clinit_ResourceBundle() , bundleCache), this$static.this$01.currentAttemptUrl, '');
  }
  $fireBundleLoadCallback(this$static.this$01);
}

function ResourceBundle$4(this$0){
  this.this$01 = this$0;
}

defineClass(189, 1, {}, ResourceBundle$4);
_.onError = function onError_3(request, exception){
  alert_0('langCountryCallback: ' + exception.detailMessage);
  $fireBundleLoadCallback(this.this$01);
}
;
_.onResponseReceived = function onResponseReceived_3(request, response){
  $onResponseReceived_1(this, response);
}
;
var Lorg_pentaho_gwt_widgets_client_utils_i18n_ResourceBundle$4_2_classLit = createForClass('org.pentaho.gwt.widgets.client.utils.i18n', 'ResourceBundle/4', 189);
function ResourceBundle$FakeResponse(text_0){
  this.text_0 = text_0;
}

defineClass(73, 502, {73:1}, ResourceBundle$FakeResponse);
_.getStatusCode = function getStatusCode_0(){
  return 200;
}
;
_.getText = function getText_0(){
  return this.text_0;
}
;
var Lorg_pentaho_gwt_widgets_client_utils_i18n_ResourceBundle$FakeResponse_2_classLit = createForClass('org.pentaho.gwt.widgets.client.utils.i18n', 'ResourceBundle/FakeResponse', 73);
function $clinit_CssUtils(){
  $clinit_CssUtils = emptyMethod;
  var c, c0, c1, c2, c3, c4;
  HEXA_CHARS_UPPER = $toCharArray('0123456789ABCDEF');
  BACKSLASH_CHARS = initUnidimensionalArray(C_classLit, $intern_1, 32, 127, 15, 1);
  fill_0(BACKSLASH_CHARS, BACKSLASH_CHARS_NO_ESCAPE);
  BACKSLASH_CHARS[32] = 32;
  BACKSLASH_CHARS[33] = 33;
  BACKSLASH_CHARS[34] = 34;
  BACKSLASH_CHARS[35] = 35;
  BACKSLASH_CHARS[36] = 36;
  BACKSLASH_CHARS[37] = 37;
  BACKSLASH_CHARS[38] = 38;
  BACKSLASH_CHARS[39] = 39;
  BACKSLASH_CHARS[40] = 40;
  BACKSLASH_CHARS[41] = 41;
  BACKSLASH_CHARS[42] = 42;
  BACKSLASH_CHARS[43] = 43;
  BACKSLASH_CHARS[44] = 44;
  BACKSLASH_CHARS[45] = 45;
  BACKSLASH_CHARS[46] = 46;
  BACKSLASH_CHARS[47] = 47;
  BACKSLASH_CHARS[59] = 59;
  BACKSLASH_CHARS[60] = 60;
  BACKSLASH_CHARS[61] = 61;
  BACKSLASH_CHARS[62] = 62;
  BACKSLASH_CHARS[63] = 63;
  BACKSLASH_CHARS[64] = 64;
  BACKSLASH_CHARS[91] = 91;
  BACKSLASH_CHARS[92] = 92;
  BACKSLASH_CHARS[93] = 93;
  BACKSLASH_CHARS[94] = 94;
  BACKSLASH_CHARS[95] = 95;
  BACKSLASH_CHARS[96] = 96;
  BACKSLASH_CHARS[123] = 123;
  BACKSLASH_CHARS[124] = 124;
  BACKSLASH_CHARS[125] = 125;
  BACKSLASH_CHARS[126] = 126;
  ESCAPE_LEVELS = initUnidimensionalArray(B_classLit, $intern_1, 32, 161, 15, 1);
  fill(ESCAPE_LEVELS);
  for (c0 = 128; c0 < 161; c0++) {
    ESCAPE_LEVELS[c0] = 2;
  }
  for (c1 = 65; c1 <= 90; c1++) {
    ESCAPE_LEVELS[c1] = 4;
  }
  for (c2 = 97; c2 <= 122; c2++) {
    ESCAPE_LEVELS[c2] = 4;
  }
  for (c3 = 48; c3 <= 57; c3++) {
    ESCAPE_LEVELS[c3] = 4;
  }
  ESCAPE_LEVELS[32] = 1;
  ESCAPE_LEVELS[33] = 1;
  ESCAPE_LEVELS[34] = 1;
  ESCAPE_LEVELS[35] = 1;
  ESCAPE_LEVELS[36] = 1;
  ESCAPE_LEVELS[37] = 1;
  ESCAPE_LEVELS[38] = 1;
  ESCAPE_LEVELS[39] = 1;
  ESCAPE_LEVELS[40] = 1;
  ESCAPE_LEVELS[41] = 1;
  ESCAPE_LEVELS[42] = 1;
  ESCAPE_LEVELS[43] = 1;
  ESCAPE_LEVELS[44] = 1;
  ESCAPE_LEVELS[45] = 1;
  ESCAPE_LEVELS[46] = 1;
  ESCAPE_LEVELS[47] = 1;
  ESCAPE_LEVELS[58] = 1;
  ESCAPE_LEVELS[59] = 1;
  ESCAPE_LEVELS[60] = 1;
  ESCAPE_LEVELS[61] = 1;
  ESCAPE_LEVELS[62] = 1;
  ESCAPE_LEVELS[63] = 1;
  ESCAPE_LEVELS[64] = 1;
  ESCAPE_LEVELS[91] = 1;
  ESCAPE_LEVELS[92] = 1;
  ESCAPE_LEVELS[93] = 1;
  ESCAPE_LEVELS[94] = 1;
  ESCAPE_LEVELS[95] = 1;
  ESCAPE_LEVELS[96] = 1;
  ESCAPE_LEVELS[123] = 1;
  ESCAPE_LEVELS[124] = 1;
  ESCAPE_LEVELS[125] = 1;
  ESCAPE_LEVELS[126] = 1;
  for (c4 = 0; c4 <= 31; c4++) {
    ESCAPE_LEVELS[c4] = 1;
  }
  for (c = 127; c <= 159; c++) {
    ESCAPE_LEVELS[c] = 1;
  }
}

function escape_1(text_0){
  $clinit_CssUtils();
  var codepoint, escape_0, i, max_0, next, readOffset, strBuilder;
  if (text_0 == null) {
    return null;
  }
  strBuilder = null;
  max_0 = text_0.length;
  readOffset = 0;
  for (i = 0; i < max_0; i++) {
    codepoint = codePointAt(text_0, i, text_0.length);
    if (codepoint <= 159 && 3 < ESCAPE_LEVELS[codepoint] && (i > 0 || codepoint < 48 || codepoint > 57)) {
      continue;
    }
    if (codepoint > 159 && 3 < ESCAPE_LEVELS[160]) {
      (codepoint >= $intern_21?2:1) > 1 && ++i;
      continue;
    }
    !strBuilder && (strBuilder = new StringBuilder_0);
    i - readOffset > 0 && (strBuilder.string += '' + (checkCriticalStringBounds(readOffset, i, (text_0 == null?'null':text_0).length) , (text_0 == null?'null':text_0).substr(readOffset, i - readOffset)) , strBuilder);
    (codepoint >= $intern_21?2:1) > 1 && ++i;
    readOffset = i + 1;
    if (codepoint < 127) {
      escape_0 = BACKSLASH_CHARS[codepoint];
      if (escape_0 != BACKSLASH_CHARS_NO_ESCAPE) {
        strBuilder.string += '\\';
        strBuilder.string += String.fromCharCode(escape_0);
        continue;
      }
    }
    next = i + 1 < max_0?(checkCriticalStringElementIndex(i + 1, text_0.length) , text_0.charCodeAt(i + 1)):0;
    strBuilder.string += '\\';
    $append_3(strBuilder, toCompactHexa(codepoint, next));
  }
  if (!strBuilder) {
    return text_0;
  }
  max_0 - readOffset > 0 && (strBuilder.string += '' + (checkCriticalStringBounds(readOffset, max_0, (text_0 == null?'null':text_0).length) , (text_0 == null?'null':text_0).substr(readOffset, max_0 - readOffset)) , strBuilder);
  return strBuilder.string;
}

function toCompactHexa(codepoint, next){
  var div, i, needTrailingSpace, result;
  needTrailingSpace = next >= 48 && next <= 57 || next >= 65 && next <= 70 || next >= 97 && next <= 102;
  if (codepoint == 0) {
    return needTrailingSpace?stampJavaTypeInfo(getClassLiteralForArray(C_classLit, 1), $intern_1, 32, 15, [48, 32]):stampJavaTypeInfo(getClassLiteralForArray(C_classLit, 1), $intern_1, 32, 15, [48]);
  }
  div = 20;
  result = null;
  while (result == null && div >= 0) {
    (codepoint >>> div) % 16 > 0 && (result = initUnidimensionalArray(C_classLit, $intern_1, 32, (div / 4 | 0) + (needTrailingSpace?2:1), 15, 1));
    div -= 4;
  }
  div = 0;
  for (i = needTrailingSpace?result.length - 2:result.length - 1; i >= 0; i--) {
    result[i] = HEXA_CHARS_UPPER[(codepoint >>> div) % 16];
    div += 4;
  }
  needTrailingSpace && (result[result.length - 1] = 32);
  return result;
}

var BACKSLASH_CHARS, BACKSLASH_CHARS_NO_ESCAPE = 0, ESCAPE_LEVELS, HEXA_CHARS_UPPER;
function StringTokenizer(text_0, delimiter){
  StringTokenizer_0.call(this, text_0, valueOf_2(stampJavaTypeInfo(getClassLiteralForArray(C_classLit, 1), $intern_1, 32, 15, [delimiter])));
}

function StringTokenizer_0(text_0, delimiters){
  var chars, delim, delim$array, delim$index, delim$max, delimiterArray, delimiterList, i, sindex;
  this.tokens = new ArrayList;
  if (text_0 == null || $equals_1('', text_0)) {
    return;
  }
  delimiterArray = $toCharArray(delimiters);
  delimiterList = new ArrayList;
  for (delim$array = delimiterArray , delim$index = 0 , delim$max = delim$array.length; delim$index < delim$max; ++delim$index) {
    delim = delim$array[delim$index];
    $add_6(delimiterList, valueOf(delim));
  }
  chars = $toCharArray(text_0);
  sindex = 0;
  for (i = 0; i < chars.length; i++) {
    if ($indexOf_1(delimiterList, valueOf(chars[i]), 0) != -1) {
      $add_6(this.tokens, (checkCriticalStringBounds(sindex, i, text_0.length) , text_0.substr(sindex, i - sindex)));
      sindex = i + 1;
    }
  }
  sindex < i && $add_6(this.tokens, (checkCriticalStringElementIndex(sindex, text_0.length + 1) , text_0.substr(sindex)));
}

defineClass(106, 1, {}, StringTokenizer);
var Lorg_pentaho_gwt_widgets_client_utils_string_StringTokenizer_2_classLit = createForClass('org.pentaho.gwt.widgets.client.utils.string', 'StringTokenizer', 106);
function defaultIfEmpty(str, xdefault){
  return null == str || $equals_1('', $trim(str))?xdefault:str;
}

function getFullyQualifiedURL(){
  return $wnd.location.protocol + '//' + $wnd.location.host + $wnd.CONTEXT_PATH;
}

var C_classLit = createForPrimitive('char', 'C');
var I_classLit = createForPrimitive('int', 'I');
var J_classLit = createForPrimitive('long', 'J');
var B_classLit = createForPrimitive('byte', 'B');
var $entry = ($clinit_Impl() , entry_0);
var gwtOnLoad = gwtOnLoad = gwtOnLoad_0;
addInitFunctions(init);
setGwtProperty('permProps', [[['locale', 'default'], ['user.agent', 'safari']]]);
$sendStats('moduleStartup', 'moduleEvalEnd');
gwtOnLoad(__gwtModuleFunction.__errFn, __gwtModuleFunction.__moduleName, __gwtModuleFunction.__moduleBase, __gwtModuleFunction.__softPermutationId,__gwtModuleFunction.__computePropValue);
$sendStats('moduleStartup', 'end');
$gwt && $gwt.permProps && __gwtModuleFunction.__moduleStartupDone($gwt.permProps);
//# sourceURL=org.pentaho.gwt.widgets.Widgets-0.js

