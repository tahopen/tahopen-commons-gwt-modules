function formatter(){
  var $wnd_0 = window;
  var $doc_0 = document;
  sendStats('bootstrap', 'begin');
  function isHostedMode(){
    var query = $wnd_0.location.search;
    return query.indexOf('gwt.codesvr.formatter=') != -1 || query.indexOf('gwt.codesvr=') != -1;
  }

  function sendStats(evtGroupString, typeString){
    if ($wnd_0.__gwtStatsEvent) {
      $wnd_0.__gwtStatsEvent({moduleName:'formatter', sessionId:$wnd_0.__gwtStatsSessionId, subSystem:'startup', evtGroup:evtGroupString, millis:(new Date).getTime(), type:typeString});
    }
  }

  formatter.__sendStats = sendStats;
  formatter.__moduleName = 'formatter';
  formatter.__errFn = null;
  formatter.__moduleBase = 'DUMMY';
  formatter.__softPermutationId = 0;
  formatter.__computePropValue = null;
  formatter.__getPropMap = null;
  formatter.__installRunAsyncCode = function(){
  }
  ;
  formatter.__gwtStartLoadingFragment = function(){
    return null;
  }
  ;
  formatter.__gwt_isKnownPropertyValue = function(){
    return false;
  }
  ;
  formatter.__gwt_getMetaProperty = function(){
    return null;
  }
  ;
  var __propertyErrorFunction = null;
  var activeModules = $wnd_0.__gwt_activeModules = $wnd_0.__gwt_activeModules || {};
  activeModules['formatter'] = {moduleName:'formatter'};
  formatter.__moduleStartupDone = function(permProps){
    var oldBindings = activeModules['formatter'].bindings;
    activeModules['formatter'].bindings = function(){
      var props = oldBindings?oldBindings():{};
      var embeddedProps = permProps[formatter.__softPermutationId];
      for (var i = 0; i < embeddedProps.length; i++) {
        var pair = embeddedProps[i];
        props[pair[0]] = pair[1];
      }
      return props;
    }
    ;
  }
  ;
  var frameDoc;
  function getInstallLocationDoc(){
    setupInstallLocation();
    return frameDoc;
  }

  function setupInstallLocation(){
    if (frameDoc) {
      return;
    }
    var scriptFrame = $doc_0.createElement('iframe');
    scriptFrame.id = 'formatter';
    scriptFrame.style.cssText = 'position:absolute; width:0; height:0; border:none; left: -1000px;' + ' top: -1000px;';
    scriptFrame.tabIndex = -1;
    $doc_0.body.appendChild(scriptFrame);
    frameDoc = scriptFrame.contentWindow.document;
    frameDoc.open();
    var doctype = document.compatMode == 'CSS1Compat'?'<!doctype html>':'';
    frameDoc.write(doctype + '<html><head><\/head><body><\/body><\/html>');
    frameDoc.close();
  }

  function installScript(filename){
    function setupWaitForBodyLoad(callback){
      function isBodyLoaded(){
        if (typeof $doc_0.readyState == 'undefined') {
          return typeof $doc_0.body != 'undefined' && $doc_0.body != null;
        }
        return /loaded|complete/.test($doc_0.readyState);
      }

      var bodyDone = isBodyLoaded();
      if (bodyDone) {
        callback();
        return;
      }
      function checkBodyDone(){
        if (!bodyDone) {
          if (!isBodyLoaded()) {
            return;
          }
          bodyDone = true;
          callback();
          if ($doc_0.removeEventListener) {
            $doc_0.removeEventListener('readystatechange', checkBodyDone, false);
          }
          if (onBodyDoneTimerId) {
            clearInterval(onBodyDoneTimerId);
          }
        }
      }

      if ($doc_0.addEventListener) {
        $doc_0.addEventListener('readystatechange', checkBodyDone, false);
      }
      var onBodyDoneTimerId = setInterval(function(){
        checkBodyDone();
      }
      , 10);
    }

    function installCode(code_0){
      var doc = getInstallLocationDoc();
      var docbody = doc.body;
      var script = doc.createElement('script');
      script.language = 'javascript';
      script.crossOrigin = '';
      script.src = code_0;
      if (formatter.__errFn) {
        script.onerror = function(){
          formatter.__errFn('formatter', new Error('Failed to load ' + code_0));
        }
        ;
      }
      docbody.appendChild(script);
      sendStats('moduleStartup', 'scriptTagAdded');
    }

    sendStats('moduleStartup', 'moduleRequested');
    setupWaitForBodyLoad(function(){
      installCode(filename);
    }
    );
  }

  formatter.__startLoadingFragment = function(fragmentFile){
    return computeUrlForResource(fragmentFile);
  }
  ;
  formatter.__installRunAsyncCode = function(code_0){
    var doc = getInstallLocationDoc();
    var docbody = doc.body;
    var script = doc.createElement('script');
    script.language = 'javascript';
    script.text = code_0;
    docbody.appendChild(script);
  }
  ;
  function processMetas(){
    var metaProps = {};
    var propertyErrorFunc;
    var onLoadErrorFunc;
    var metas = $doc_0.getElementsByTagName('meta');
    for (var i = 0, n = metas.length; i < n; ++i) {
      var meta = metas[i], name_1 = meta.getAttribute('name'), content_0;
      if (name_1) {
        name_1 = name_1.replace('formatter::', '');
        if (name_1.indexOf('::') >= 0) {
          continue;
        }
        if (name_1 == 'gwt:property') {
          content_0 = meta.getAttribute('content');
          if (content_0) {
            var value_1, eq = content_0.indexOf('=');
            if (eq >= 0) {
              name_1 = content_0.substring(0, eq);
              value_1 = content_0.substring(eq + 1);
            }
             else {
              name_1 = content_0;
              value_1 = '';
            }
            metaProps[name_1] = value_1;
          }
        }
         else if (name_1 == 'gwt:onPropertyErrorFn') {
          content_0 = meta.getAttribute('content');
          if (content_0) {
            try {
              propertyErrorFunc = eval(content_0);
            }
             catch (e) {
              alert('Bad handler "' + content_0 + '" for "gwt:onPropertyErrorFn"');
            }
          }
        }
         else if (name_1 == 'gwt:onLoadErrorFn') {
          content_0 = meta.getAttribute('content');
          if (content_0) {
            try {
              onLoadErrorFunc = eval(content_0);
            }
             catch (e) {
              alert('Bad handler "' + content_0 + '" for "gwt:onLoadErrorFn"');
            }
          }
        }
      }
    }
    __gwt_getMetaProperty = function(name_0){
      var value_0 = metaProps[name_0];
      return value_0 == null?null:value_0;
    }
    ;
    __propertyErrorFunction = propertyErrorFunc;
    formatter.__errFn = onLoadErrorFunc;
  }

  function computeScriptBase(){
    function getDirectoryOfFile(path){
      var hashIndex = path.lastIndexOf('#');
      if (hashIndex == -1) {
        hashIndex = path.length;
      }
      var queryIndex = path.indexOf('?');
      if (queryIndex == -1) {
        queryIndex = path.length;
      }
      var slashIndex = path.lastIndexOf('/', Math.min(queryIndex, hashIndex));
      return slashIndex >= 0?path.substring(0, slashIndex + 1):'';
    }

    function ensureAbsoluteUrl(url_0){
      if (url_0.match(/^\w+:\/\//)) {
      }
       else {
        var img = $doc_0.createElement('img');
        img.src = url_0 + 'clear.cache.gif';
        url_0 = getDirectoryOfFile(img.src);
      }
      return url_0;
    }

    function tryMetaTag(){
      var metaVal = __gwt_getMetaProperty('baseUrl');
      if (metaVal != null) {
        return metaVal;
      }
      return '';
    }

    function tryNocacheJsTag(){
      var scriptTags = $doc_0.getElementsByTagName('script');
      for (var i = 0; i < scriptTags.length; ++i) {
        if (scriptTags[i].src.indexOf('formatter.nocache.js') != -1) {
          return getDirectoryOfFile(scriptTags[i].src);
        }
      }
      return '';
    }

    function tryBaseTag(){
      var baseElements = $doc_0.getElementsByTagName('base');
      if (baseElements.length > 0) {
        return baseElements[baseElements.length - 1].href;
      }
      return '';
    }

    function isLocationOk(){
      var loc = $doc_0.location;
      return loc.href == loc.protocol + '//' + loc.host + loc.pathname + loc.search + loc.hash;
    }

    var tempBase = tryMetaTag();
    if (tempBase == '') {
      tempBase = tryNocacheJsTag();
    }
    if (tempBase == '') {
      tempBase = tryBaseTag();
    }
    if (tempBase == '' && isLocationOk()) {
      tempBase = getDirectoryOfFile($doc_0.location.href);
    }
    tempBase = ensureAbsoluteUrl(tempBase);
    return tempBase;
  }

  function computeUrlForResource(resource){
    if (resource.match(/^\//)) {
      return resource;
    }
    if (resource.match(/^[a-zA-Z]+:\/\//)) {
      return resource;
    }
    return formatter.__moduleBase + resource;
  }

  function getCompiledCodeFilename(){
    var answers = [];
    var softPermutationId = 0;
    function unflattenKeylistIntoAnswers(propValArray, value_0){
      var answer = answers;
      for (var i = 0, n = propValArray.length - 1; i < n; ++i) {
        answer = answer[propValArray[i]] || (answer[propValArray[i]] = []);
      }
      answer[propValArray[n]] = value_0;
    }

    var values = [];
    var providers = [];
    function computePropValue(propName){
      var value_0 = providers[propName](), allowedValuesMap = values[propName];
      if (value_0 in allowedValuesMap) {
        return value_0;
      }
      var allowedValuesList = [];
      for (var k in allowedValuesMap) {
        allowedValuesList[allowedValuesMap[k]] = k;
      }
      if (__propertyErrorFunction) {
        __propertyErrorFunction(propName, allowedValuesList, value_0);
      }
      throw null;
    }

    providers['locale'] = function(){
      var locale = null;
      var rtlocale = 'default';
      try {
        if (!locale) {
          var queryParam = location.search;
          var qpStart = queryParam.indexOf('locale=');
          if (qpStart >= 0) {
            var value_0 = queryParam.substring(qpStart + 7);
            var end = queryParam.indexOf('&', qpStart);
            if (end < 0) {
              end = queryParam.length;
            }
            locale = queryParam.substring(qpStart + 7, end);
          }
        }
        if (!locale) {
          locale = __gwt_getMetaProperty('locale');
        }
        if (!locale) {
          locale = $wnd_0['__gwt_Locale'];
        }
        if (locale) {
          rtlocale = locale;
        }
        while (locale && !__gwt_isKnownPropertyValue('locale', locale)) {
          var lastIndex = locale.lastIndexOf('_');
          if (lastIndex < 0) {
            locale = null;
            break;
          }
          locale = locale.substring(0, lastIndex);
        }
      }
       catch (e) {
        alert('Unexpected exception in locale detection, using default: ' + e);
      }
      $wnd_0['__gwt_Locale'] = rtlocale;
      return locale || 'default';
    }
    ;
    values['locale'] = {'ar':0, 'de':1, 'default':2, 'en':3, 'en_GB':4, 'en_US':5, 'es':6, 'fi':7, 'fr':8, 'it':9, 'ja':10, 'ko':11, 'nl':12, 'no':13, 'pt':14, 'ru':15, 'sv':16, 'zh_CN':17, 'zh_TW':18};
    providers['user.agent'] = function(){
      var ua = navigator.userAgent.toLowerCase();
      var docMode = $doc_0.documentMode;
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
      return '';
    }
    ;
    values['user.agent'] = {'gecko1_8':0, 'safari':1};
    __gwt_isKnownPropertyValue = function(propName, propValue){
      return propValue in values[propName];
    }
    ;
    formatter.__getPropMap = function(){
      var result = {};
      for (var key in values) {
        if (values.hasOwnProperty(key)) {
          result[key] = computePropValue(key);
        }
      }
      return result;
    }
    ;
    formatter.__computePropValue = computePropValue;
    $wnd_0.__gwt_activeModules['formatter'].bindings = formatter.__getPropMap;
    sendStats('bootstrap', 'selectingPermutation');
    if (isHostedMode()) {
      return computeUrlForResource('formatter.devmode.js');
    }
    var strongName;
    try {
      unflattenKeylistIntoAnswers(['en', 'gecko1_8'], '0CD32015F827A5A781BDA5739E2D62E4');
      unflattenKeylistIntoAnswers(['default', 'gecko1_8'], '2C254019697A05043034DA9B2B854515');
      unflattenKeylistIntoAnswers(['en_US', 'safari'], '2D0B42B48E4E9AFE8D3F7478DAD42339');
      unflattenKeylistIntoAnswers(['ar', 'safari'], '2EE6E2AFDEE29DC6363F75D754056CC5');
      unflattenKeylistIntoAnswers(['fr', 'gecko1_8'], '301DDCE87A5AACCB0E8DF10C0441D04B');
      unflattenKeylistIntoAnswers(['nl', 'safari'], '33DDE79E907CC54A409393ED962B3428');
      unflattenKeylistIntoAnswers(['zh_CN', 'gecko1_8'], '35A0B6FB078CFE6E6D5AA8C0D207293A');
      unflattenKeylistIntoAnswers(['default', 'safari'], '38086B91AF71C9C2D2E89461D3716ACF');
      unflattenKeylistIntoAnswers(['en', 'safari'], '44F3CC5B4F1CE089632F12F108D2E2E7');
      unflattenKeylistIntoAnswers(['no', 'safari'], '46438288F900FA3FF10BCB055940BE85');
      unflattenKeylistIntoAnswers(['it', 'safari'], '4D35DAD3F04D26403EC1E99C9D2A7C59');
      unflattenKeylistIntoAnswers(['sv', 'gecko1_8'], '4EB44F66CE4E5F6F471DC7A7ABEC0910');
      unflattenKeylistIntoAnswers(['nl', 'gecko1_8'], '5133B0AF0A816ECDEF833E29785453FF');
      unflattenKeylistIntoAnswers(['ja', 'gecko1_8'], '5513B28C180ECE78AE0F1EC8F2086A51');
      unflattenKeylistIntoAnswers(['es', 'safari'], '6C0161DBCACE23272D3A8E63A6178E03');
      unflattenKeylistIntoAnswers(['en_GB', 'gecko1_8'], '6DEF51A69EF2401F987B7D73B636BF8D');
      unflattenKeylistIntoAnswers(['ru', 'safari'], '746284BFA5F33CA9061E3B80875B57EF');
      unflattenKeylistIntoAnswers(['de', 'safari'], '7554855D95CFF4BAC373BA514C5BAE19');
      unflattenKeylistIntoAnswers(['ja', 'safari'], '7C4E1FA0111C5146C00C58277F48230A');
      unflattenKeylistIntoAnswers(['ar', 'gecko1_8'], '872BCBF100ACCB22BE9A62D06D4E1E0D');
      unflattenKeylistIntoAnswers(['ru', 'gecko1_8'], '87EB28ACA601EED803647F67A28F3CF6');
      unflattenKeylistIntoAnswers(['pt', 'safari'], 'A10C2B91860688D89552B50556C9582C');
      unflattenKeylistIntoAnswers(['ko', 'gecko1_8'], 'A5164DADE49194073229D8C34F13E4E2');
      unflattenKeylistIntoAnswers(['zh_TW', 'safari'], 'C32BD10E518BD1EBD7204AE9D1437C85');
      unflattenKeylistIntoAnswers(['pt', 'gecko1_8'], 'C87414A7B06D3F7E229B3DCF164C24C6');
      unflattenKeylistIntoAnswers(['de', 'gecko1_8'], 'D51EEDEB77B9A923D8ED4333F8CC2CAB');
      unflattenKeylistIntoAnswers(['en_GB', 'safari'], 'D57540A483EDD6750F1AAB916689390A');
      unflattenKeylistIntoAnswers(['no', 'gecko1_8'], 'E4AEABC0764206595AC9A8CBB80F69B6');
      unflattenKeylistIntoAnswers(['zh_CN', 'safari'], 'EBB1BF9D85DE7F767C94DD6CE7E73A04');
      unflattenKeylistIntoAnswers(['ko', 'safari'], 'EC0149BDE2C58576E482349CD14FE2EF');
      unflattenKeylistIntoAnswers(['zh_TW', 'gecko1_8'], 'EC29D5C9CD09E924412F3DCF5C208DE5');
      unflattenKeylistIntoAnswers(['sv', 'safari'], 'EE7E7A9F9D7612D990FCE4AC6A3959D2');
      unflattenKeylistIntoAnswers(['fi', 'safari'], 'EE8F6ACF1708A04F3DBF7E813CBB45F0');
      unflattenKeylistIntoAnswers(['es', 'gecko1_8'], 'EFBC5A689A0181D8E033B42BE6DAD2B0');
      unflattenKeylistIntoAnswers(['fi', 'gecko1_8'], 'F29120CF0FA932163D63DA837C2DF366');
      unflattenKeylistIntoAnswers(['en_US', 'gecko1_8'], 'F66E6DA7700FCF7F49437E483362BB1D');
      unflattenKeylistIntoAnswers(['it', 'gecko1_8'], 'F6DFBBAF8609E7F4597FE3B36F5DE2DB');
      unflattenKeylistIntoAnswers(['fr', 'safari'], 'FA6A37C908D7FC5769ACF6777B6828E8');
      strongName = answers[computePropValue('locale')][computePropValue('user.agent')];
      var idx = strongName.indexOf(':');
      if (idx != -1) {
        softPermutationId = parseInt(strongName.substring(idx + 1), 10);
        strongName = strongName.substring(0, idx);
      }
    }
     catch (e) {
    }
    formatter.__softPermutationId = softPermutationId;
    return computeUrlForResource(strongName + '.cache.js');
  }

  function loadExternalStylesheets(){
    if (!$wnd_0.__gwt_stylesLoaded) {
      $wnd_0.__gwt_stylesLoaded = {};
    }
    sendStats('loadExternalRefs', 'begin');
    sendStats('loadExternalRefs', 'end');
  }

  processMetas();
  formatter.__moduleBase = computeScriptBase();
  activeModules['formatter'].moduleBase = formatter.__moduleBase;
  var filename_0 = getCompiledCodeFilename();
  if ($wnd_0) {
    var devModePermitted = !!($wnd_0.location.protocol == 'http:' || $wnd_0.location.protocol == 'file:');
    $wnd_0.__gwt_activeModules['formatter'].canRedirect = devModePermitted;
    function supportsSessionStorage(){
      var key = '_gwt_dummy_';
      try {
        $wnd_0.sessionStorage.setItem(key, key);
        $wnd_0.sessionStorage.removeItem(key);
        return true;
      }
       catch (e) {
        return false;
      }
    }

    if (devModePermitted && supportsSessionStorage()) {
      var devModeKey = '__gwtDevModeHook:formatter';
      var devModeUrl = $wnd_0.sessionStorage[devModeKey];
      if (!/^http:\/\/(localhost|127\.0\.0\.1)(:\d+)?\/.*$/.test(devModeUrl)) {
        if (devModeUrl && (window.console && console.log)) {
          console.log('Ignoring non-whitelisted Dev Mode URL: ' + devModeUrl);
        }
        devModeUrl = '';
      }
      if (devModeUrl && !$wnd_0[devModeKey]) {
        $wnd_0[devModeKey] = true;
        $wnd_0[devModeKey + ':moduleBase'] = computeScriptBase();
        var devModeScript = $doc_0.createElement('script');
        devModeScript.src = devModeUrl;
        var head = $doc_0.getElementsByTagName('head')[0];
        head.insertBefore(devModeScript, head.firstElementChild || head.children[0]);
        return false;
      }
    }
  }
  loadExternalStylesheets();
  sendStats('bootstrap', 'end');
  installScript(filename_0);
  return true;
}

formatter.succeeded = formatter();
