package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_en_150 extends com.google.gwt.i18n.client.CurrencyList_en_001 {
  
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
    // Australian Dollar
    result.put("AUD", new CurrencyDataImpl("AUD", "AU$", 2, "AU$", "$"));
    // Belarusian New Rouble (1994–1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130, "BYB", "BYB"));
    // Belarusian Rouble
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 0, "BYR", "BYR"));
    // British Pound
    result.put("GBP", new CurrencyDataImpl("GBP", "£", 2, "GB£", "£"));
    // Israeli Shekel (1980–1985)
    result.put("ILR", new CurrencyDataImpl("ILR", "ILR", 130, "ILR", "ILR"));
    // Israeli New Shekel
    result.put("ILS", new CurrencyDataImpl("ILS", "₪", 2, "IL₪", "₪"));
    // Indian Rupee
    result.put("INR", new CurrencyDataImpl("INR", "₹", 2, "Rs", "₹"));
    // Latvian Rouble
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130, "LVR", "LVR"));
    // Russian Rouble
    result.put("RUB", new CurrencyDataImpl("RUB", "руб.", 2, "руб.", "руб."));
    // Russian Rouble (1991–1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130, "RUR", "RUR"));
    // Seychelles Rupee
    result.put("SCR", new CurrencyDataImpl("SCR", "SCR", 2, "SCR", "SCR"));
    // Tajikistani Rouble
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130, "TJR", "TJR"));
    // US Dollar
    result.put("USD", new CurrencyDataImpl("USD", "$", 2, "US$", "$"));
    // Uzbekistani Som
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 0, "UZS", "soʼm"));
    // Central African CFA Franc
    result.put("XAF", new CurrencyDataImpl("XAF", "FCFA", 0, "FCFA", "FCFA"));
    // West African CFA Franc
    result.put("XOF", new CurrencyDataImpl("XOF", "CFA", 0, "CFA", "CFA"));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // Australian Dollar
      "AUD": [ "AUD", "AU$", 2, "AU$", "$"],
      // Belarusian New Rouble (1994–1999)
      "BYB": [ "BYB", "BYB", 130, "BYB", "BYB"],
      // Belarusian Rouble
      "BYR": [ "BYR", "BYR", 0, "BYR", "BYR"],
      // British Pound
      "GBP": [ "GBP", "£", 2, "GB£", "£"],
      // Israeli Shekel (1980–1985)
      "ILR": [ "ILR", "ILR", 130, "ILR", "ILR"],
      // Israeli New Shekel
      "ILS": [ "ILS", "₪", 2, "IL₪", "₪"],
      // Indian Rupee
      "INR": [ "INR", "₹", 2, "Rs", "₹"],
      // Latvian Rouble
      "LVR": [ "LVR", "LVR", 130, "LVR", "LVR"],
      // Russian Rouble
      "RUB": [ "RUB", "руб.", 2, "руб.", "руб."],
      // Russian Rouble (1991–1998)
      "RUR": [ "RUR", "RUR", 130, "RUR", "RUR"],
      // Seychelles Rupee
      "SCR": [ "SCR", "SCR", 2, "SCR", "SCR"],
      // Tajikistani Rouble
      "TJR": [ "TJR", "TJR", 130, "TJR", "TJR"],
      // US Dollar
      "USD": [ "USD", "$", 2, "US$", "$"],
      // Uzbekistani Som
      "UZS": [ "UZS", "UZS", 0, "UZS", "soʼm"],
      // Central African CFA Franc
      "XAF": [ "XAF", "FCFA", 0, "FCFA", "FCFA"],
      // West African CFA Franc
      "XOF": [ "XOF", "CFA", 0, "CFA", "CFA"],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("AUD", "Australian Dollar");
    result.put("BYB", "Belarusian New Rouble (1994–1999)");
    result.put("BYR", "Belarusian Rouble");
    result.put("GBP", "British Pound");
    result.put("ILR", "Israeli Shekel (1980–1985)");
    result.put("ILS", "Israeli New Shekel");
    result.put("INR", "Indian Rupee");
    result.put("LVR", "Latvian Rouble");
    result.put("RUB", "Russian Rouble");
    result.put("RUR", "Russian Rouble (1991–1998)");
    result.put("SCR", "Seychelles Rupee");
    result.put("TJR", "Tajikistani Rouble");
    result.put("USD", "US Dollar");
    result.put("UZS", "Uzbekistani Som");
    result.put("XAF", "Central African CFA Franc");
    result.put("XOF", "West African CFA Franc");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "AUD": "Australian Dollar",
      "BYB": "Belarusian New Rouble (1994–1999)",
      "BYR": "Belarusian Rouble",
      "GBP": "British Pound",
      "ILR": "Israeli Shekel (1980–1985)",
      "ILS": "Israeli New Shekel",
      "INR": "Indian Rupee",
      "LVR": "Latvian Rouble",
      "RUB": "Russian Rouble",
      "RUR": "Russian Rouble (1991–1998)",
      "SCR": "Seychelles Rupee",
      "TJR": "Tajikistani Rouble",
      "USD": "US Dollar",
      "UZS": "Uzbekistani Som",
      "XAF": "Central African CFA Franc",
      "XOF": "West African CFA Franc",
    };
  }-*/;
}
