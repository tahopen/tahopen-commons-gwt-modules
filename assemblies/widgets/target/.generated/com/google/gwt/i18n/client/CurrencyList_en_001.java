package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_en_001 extends com.google.gwt.i18n.client.CurrencyList_en {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("USD", "US$", 2, "US$", "$");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "USD", "US$", 2, "US$", "$"];
  }-*/;
  
  @Override
  protected HashMap<String, CurrencyData> loadCurrencyMapJava() {
    HashMap<String, CurrencyData> result = super.loadCurrencyMapJava();
    // Belarusian New Rouble (1994–1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130, "BYB", "BYB"));
    // Belarusian Rouble
    result.put("BYN", new CurrencyDataImpl("BYN", "BYN", 2, "BYN", "BYN"));
    // Belarusian Rouble (2000–2016)
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 128, "BYR", "BYR"));
    // Japanese Yen
    result.put("JPY", new CurrencyDataImpl("JPY", "JP¥", 0, "JP¥", "¥"));
    // Latvian Rouble
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130, "LVR", "LVR"));
    // Russian Rouble
    result.put("RUB", new CurrencyDataImpl("RUB", "руб.", 2, "руб.", "руб."));
    // Russian Rouble (1991–1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130, "RUR", "RUR"));
    // Tajikistani Rouble
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130, "TJR", "TJR"));
    // US Dollar
    result.put("USD", new CurrencyDataImpl("USD", "US$", 2, "US$", "$"));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // Belarusian New Rouble (1994–1999)
      "BYB": [ "BYB", "BYB", 130, "BYB", "BYB"],
      // Belarusian Rouble
      "BYN": [ "BYN", "BYN", 2, "BYN", "BYN"],
      // Belarusian Rouble (2000–2016)
      "BYR": [ "BYR", "BYR", 128, "BYR", "BYR"],
      // Japanese Yen
      "JPY": [ "JPY", "JP¥", 0, "JP¥", "¥"],
      // Latvian Rouble
      "LVR": [ "LVR", "LVR", 130, "LVR", "LVR"],
      // Russian Rouble
      "RUB": [ "RUB", "руб.", 2, "руб.", "руб."],
      // Russian Rouble (1991–1998)
      "RUR": [ "RUR", "RUR", 130, "RUR", "RUR"],
      // Tajikistani Rouble
      "TJR": [ "TJR", "TJR", 130, "TJR", "TJR"],
      // US Dollar
      "USD": [ "USD", "US$", 2, "US$", "$"],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("BYB", "Belarusian New Rouble (1994–1999)");
    result.put("BYN", "Belarusian Rouble");
    result.put("BYR", "Belarusian Rouble (2000–2016)");
    result.put("JPY", "Japanese Yen");
    result.put("LVR", "Latvian Rouble");
    result.put("RUB", "Russian Rouble");
    result.put("RUR", "Russian Rouble (1991–1998)");
    result.put("TJR", "Tajikistani Rouble");
    result.put("USD", "US Dollar");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "BYB": "Belarusian New Rouble (1994–1999)",
      "BYN": "Belarusian Rouble",
      "BYR": "Belarusian Rouble (2000–2016)",
      "JPY": "Japanese Yen",
      "LVR": "Latvian Rouble",
      "RUB": "Russian Rouble",
      "RUR": "Russian Rouble (1991–1998)",
      "TJR": "Tajikistani Rouble",
      "USD": "US Dollar",
    };
  }-*/;
}
