package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_en_GB extends com.google.gwt.i18n.client.CurrencyList_en_150 {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("GBP", "£", 2, "GB£", "£");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "GBP", "£", 2, "GB£", "£"];
  }-*/;
  
  @Override
  protected HashMap<String, CurrencyData> loadCurrencyMapJava() {
    HashMap<String, CurrencyData> result = super.loadCurrencyMapJava();
    // St Helena Pound
    result.put("SHP", new CurrencyDataImpl("SHP", "SHP", 2, "SHP", "£"));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // St Helena Pound
      "SHP": [ "SHP", "SHP", 2, "SHP", "£"],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("SHP", "St Helena Pound");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "SHP": "St Helena Pound",
    };
  }-*/;
}
