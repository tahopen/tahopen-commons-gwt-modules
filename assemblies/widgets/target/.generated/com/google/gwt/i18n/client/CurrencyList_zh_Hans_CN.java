package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_zh_Hans_CN extends com.google.gwt.i18n.client.CurrencyList_zh_Hans {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("CNY", "￥", 2, "RMB¥", "¥");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "CNY", "￥", 2, "RMB¥", "¥"];
  }-*/;
}
