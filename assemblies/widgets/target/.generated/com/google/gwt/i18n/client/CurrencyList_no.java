package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_no extends com.google.gwt.i18n.client.CurrencyList_nb {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("NOK", "kr", 2, "NOkr", "kr");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "NOK", "kr", 2, "NOkr", "kr"];
  }-*/;
}
