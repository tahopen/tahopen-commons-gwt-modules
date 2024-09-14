package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_en_US extends com.google.gwt.i18n.client.CurrencyList_en_001 {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("USD", "$", 2, "US$", "$");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "USD", "$", 2, "US$", "$"];
  }-*/;
  
  @Override
  protected HashMap<String, CurrencyData> loadCurrencyMapJava() {
    HashMap<String, CurrencyData> result = super.loadCurrencyMapJava();
    // Belarusian Ruble (1994–1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130, "BYB", "BYB"));
    // Belarusian Ruble
    result.put("BYN", new CurrencyDataImpl("BYN", "BYN", 2, "BYN", "BYN"));
    // Belarusian Ruble (2000–2016)
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 128, "BYR", "BYR"));
    // Japanese Yen
    result.put("JPY", new CurrencyDataImpl("JPY", "¥", 0, "JP¥", "¥"));
    // Latvian Ruble
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130, "LVR", "LVR"));
    // Russian Ruble
    result.put("RUB", new CurrencyDataImpl("RUB", "руб.", 2, "руб.", "руб."));
    // Russian Ruble (1991–1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130, "RUR", "RUR"));
    // Tajikistani Ruble
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130, "TJR", "TJR"));
    // US Dollar
    result.put("USD", new CurrencyDataImpl("USD", "$", 2, "US$", "$"));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // Belarusian Ruble (1994–1999)
      "BYB": [ "BYB", "BYB", 130, "BYB", "BYB"],
      // Belarusian Ruble
      "BYN": [ "BYN", "BYN", 2, "BYN", "BYN"],
      // Belarusian Ruble (2000–2016)
      "BYR": [ "BYR", "BYR", 128, "BYR", "BYR"],
      // Japanese Yen
      "JPY": [ "JPY", "¥", 0, "JP¥", "¥"],
      // Latvian Ruble
      "LVR": [ "LVR", "LVR", 130, "LVR", "LVR"],
      // Russian Ruble
      "RUB": [ "RUB", "руб.", 2, "руб.", "руб."],
      // Russian Ruble (1991–1998)
      "RUR": [ "RUR", "RUR", 130, "RUR", "RUR"],
      // Tajikistani Ruble
      "TJR": [ "TJR", "TJR", 130, "TJR", "TJR"],
      // US Dollar
      "USD": [ "USD", "$", 2, "US$", "$"],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("BYB", "Belarusian Ruble (1994–1999)");
    result.put("BYN", "Belarusian Ruble");
    result.put("BYR", "Belarusian Ruble (2000–2016)");
    result.put("JPY", "Japanese Yen");
    result.put("LVR", "Latvian Ruble");
    result.put("RUB", "Russian Ruble");
    result.put("RUR", "Russian Ruble (1991–1998)");
    result.put("TJR", "Tajikistani Ruble");
    result.put("USD", "US Dollar");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "BYB": "Belarusian Ruble (1994–1999)",
      "BYN": "Belarusian Ruble",
      "BYR": "Belarusian Ruble (2000–2016)",
      "JPY": "Japanese Yen",
      "LVR": "Latvian Ruble",
      "RUB": "Russian Ruble",
      "RUR": "Russian Ruble (1991–1998)",
      "TJR": "Tajikistani Ruble",
      "USD": "US Dollar",
    };
  }-*/;
}
