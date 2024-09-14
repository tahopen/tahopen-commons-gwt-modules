package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_zh_TW extends com.google.gwt.i18n.client.CurrencyList_zh_Hant {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("TWD", "$", 2, "NT$", "NT$");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "TWD", "$", 2, "NT$", "NT$"];
  }-*/;
}
