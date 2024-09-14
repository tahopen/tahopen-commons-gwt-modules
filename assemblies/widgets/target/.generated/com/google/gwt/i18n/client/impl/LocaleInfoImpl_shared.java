package com.google.gwt.i18n.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class LocaleInfoImpl_shared extends com.google.gwt.i18n.client.impl.LocaleInfoImpl {
  private static native String getLocaleNativeDisplayName(
      JavaScriptObject nativeDisplayNamesNative,String localeName) /*-{
    return nativeDisplayNamesNative[localeName];
  }-*/;
  
  HashMap<String,String> nativeDisplayNamesJava;
  private JavaScriptObject nativeDisplayNamesNative;
  
  @Override
  public String[] getAvailableLocaleNames() {
    return new String[] {
      "default",
      "ar",
      "de",
      "en",
      "en_GB",
      "en_US",
      "es",
      "fi",
      "fr",
      "it",
      "ja",
      "ko",
      "nl",
      "no",
      "pt",
      "ru",
      "sv",
      "zh_CN",
      "zh_TW",
    };
  }
  
  @Override
  public String getLocaleNativeDisplayName(String localeName) {
    if (GWT.isScript()) {
      if (nativeDisplayNamesNative == null) {
        nativeDisplayNamesNative = loadNativeDisplayNamesNative();
      }
      return getLocaleNativeDisplayName(nativeDisplayNamesNative, localeName);
    } else {
      if (nativeDisplayNamesJava == null) {
        nativeDisplayNamesJava = new HashMap<String, String>();
        nativeDisplayNamesJava.put("ar", "العربية");
        nativeDisplayNamesJava.put("de", "Deutsch");
        nativeDisplayNamesJava.put("en", "English");
        nativeDisplayNamesJava.put("en_GB", "British English");
        nativeDisplayNamesJava.put("en_US", "U.S. English");
        nativeDisplayNamesJava.put("es", "español");
        nativeDisplayNamesJava.put("fi", "suomi");
        nativeDisplayNamesJava.put("fr", "français");
        nativeDisplayNamesJava.put("it", "italiano");
        nativeDisplayNamesJava.put("ja", "日本語");
        nativeDisplayNamesJava.put("ko", "한국어");
        nativeDisplayNamesJava.put("nl", "Nederlands");
        nativeDisplayNamesJava.put("no", "norsk bokmål");
        nativeDisplayNamesJava.put("pt", "português");
        nativeDisplayNamesJava.put("ru", "русский");
        nativeDisplayNamesJava.put("sv", "svenska");
        nativeDisplayNamesJava.put("zh_CN", "中文（简体） - 中国");
        nativeDisplayNamesJava.put("zh_TW", "中文（繁体） - 台湾");
      }
      return nativeDisplayNamesJava.get(localeName);
    }
  }
  
  @Override
  public boolean hasAnyRTL() {
    return true;
  }
  
  private native JavaScriptObject loadNativeDisplayNamesNative() /*-{
    return {
      "ar": "العربية",
      "de": "Deutsch",
      "en": "English",
      "en_GB": "British English",
      "en_US": "U.S. English",
      "es": "español",
      "fi": "suomi",
      "fr": "français",
      "it": "italiano",
      "ja": "日本語",
      "ko": "한국어",
      "nl": "Nederlands",
      "no": "norsk bokmål",
      "pt": "português",
      "ru": "русский",
      "sv": "svenska",
      "zh_CN": "中文（简体） - 中国",
      "zh_TW": "中文（繁体） - 台湾"
    };
  }-*/;
}
