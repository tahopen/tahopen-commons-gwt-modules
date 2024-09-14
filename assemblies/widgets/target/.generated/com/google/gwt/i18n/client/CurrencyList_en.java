package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_en extends com.google.gwt.i18n.client.CurrencyList_ {
  
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
    // Andorran Peseta
    result.put("ADP", new CurrencyDataImpl("ADP", "ADP", 128, "ADP", "ADP"));
    // United Arab Emirates Dirham
    result.put("AED", new CurrencyDataImpl("AED", "DH", 2, "DH", "dh"));
    // Afghan Afghani (1927–2002)
    result.put("AFA", new CurrencyDataImpl("AFA", "AFA", 130, "AFA", "AFA"));
    // Afghan Afghani
    result.put("AFN", new CurrencyDataImpl("AFN", "AFN", 0, "AFN", "Af."));
    // Albanian Lek (1946–1965)
    result.put("ALK", new CurrencyDataImpl("ALK", "ALK", 130, "ALK", "ALK"));
    // Albanian Lek
    result.put("ALL", new CurrencyDataImpl("ALL", "ALL", 0, "ALL", "Lek"));
    // Armenian Dram
    result.put("AMD", new CurrencyDataImpl("AMD", "AMD", 2, "AMD", "Dram"));
    // Netherlands Antillean Guilder
    result.put("ANG", new CurrencyDataImpl("ANG", "ANG", 2, "ANG", "ANG"));
    // Angolan Kwanza
    result.put("AOA", new CurrencyDataImpl("AOA", "AOA", 2, "AOA", "Kz"));
    // Angolan Kwanza (1977–1991)
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130, "AOK", "AOK"));
    // Angolan New Kwanza (1990–2000)
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130, "AON", "AON"));
    // Angolan Readjusted Kwanza (1995–1999)
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130, "AOR", "AOR"));
    // Argentine Austral
    result.put("ARA", new CurrencyDataImpl("ARA", "ARA", 130, "ARA", "ARA"));
    // Argentine Peso Ley (1970–1983)
    result.put("ARL", new CurrencyDataImpl("ARL", "ARL", 130, "ARL", "ARL"));
    // Argentine Peso (1881–1970)
    result.put("ARM", new CurrencyDataImpl("ARM", "ARM", 130, "ARM", "ARM"));
    // Argentine Peso (1983–1985)
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130, "ARP", "ARP"));
    // Argentine Peso
    result.put("ARS", new CurrencyDataImpl("ARS", "AR$", 2, "AR$", "$"));
    // Austrian Schilling
    result.put("ATS", new CurrencyDataImpl("ATS", "ATS", 130, "ATS", "ATS"));
    // Australian Dollar
    result.put("AUD", new CurrencyDataImpl("AUD", "A$", 2, "AU$", "$"));
    // Aruban Florin
    result.put("AWG", new CurrencyDataImpl("AWG", "AWG", 2, "AWG", "Afl."));
    // Azerbaijani Manat (1993–2006)
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130, "AZM", "AZM"));
    // Azerbaijani Manat
    result.put("AZN", new CurrencyDataImpl("AZN", "AZN", 2, "AZN", "man."));
    // Bosnia-Herzegovina Dinar (1992–1994)
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130, "BAD", "BAD"));
    // Bosnia-Herzegovina Convertible Mark
    result.put("BAM", new CurrencyDataImpl("BAM", "BAM", 2, "BAM", "KM"));
    // Bosnia-Herzegovina New Dinar (1994–1997)
    result.put("BAN", new CurrencyDataImpl("BAN", "BAN", 130, "BAN", "BAN"));
    // Barbadian Dollar
    result.put("BBD", new CurrencyDataImpl("BBD", "BBD", 2, "BBD", "$"));
    // Bangladeshi Taka
    result.put("BDT", new CurrencyDataImpl("BDT", "Tk", 2, "Tk", "৳"));
    // Belgian Franc (convertible)
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 130, "BEC", "BEC"));
    // Belgian Franc
    result.put("BEF", new CurrencyDataImpl("BEF", "BEF", 130, "BEF", "BEF"));
    // Belgian Franc (financial)
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 130, "BEL", "BEL"));
    // Bulgarian Hard Lev
    result.put("BGL", new CurrencyDataImpl("BGL", "BGL", 130, "BGL", "BGL"));
    // Bulgarian Socialist Lev
    result.put("BGM", new CurrencyDataImpl("BGM", "BGM", 130, "BGM", "BGM"));
    // Bulgarian Lev
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2, "BGN", "lev"));
    // Bulgarian Lev (1879–1952)
    result.put("BGO", new CurrencyDataImpl("BGO", "BGO", 130, "BGO", "BGO"));
    // Bahraini Dinar
    result.put("BHD", new CurrencyDataImpl("BHD", "BHD", 3, "BHD", "din"));
    // Burundian Franc
    result.put("BIF", new CurrencyDataImpl("BIF", "BIF", 0, "BIF", "FBu"));
    // Bermudan Dollar
    result.put("BMD", new CurrencyDataImpl("BMD", "BMD", 2, "BMD", "$"));
    // Brunei Dollar
    result.put("BND", new CurrencyDataImpl("BND", "BND", 2, "BND", "$"));
    // Bolivian Boliviano
    result.put("BOB", new CurrencyDataImpl("BOB", "BOB", 2, "BOB", "Bs"));
    // Bolivian Boliviano (1863–1963)
    result.put("BOL", new CurrencyDataImpl("BOL", "BOL", 130, "BOL", "BOL"));
    // Bolivian Peso
    result.put("BOP", new CurrencyDataImpl("BOP", "BOP", 130, "BOP", "BOP"));
    // Bolivian Mvdol
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 130, "BOV", "BOV"));
    // Brazilian New Cruzeiro (1967–1986)
    result.put("BRB", new CurrencyDataImpl("BRB", "BRB", 130, "BRB", "BRB"));
    // Brazilian Cruzado (1986–1989)
    result.put("BRC", new CurrencyDataImpl("BRC", "BRC", 130, "BRC", "BRC"));
    // Brazilian Cruzeiro (1990–1993)
    result.put("BRE", new CurrencyDataImpl("BRE", "BRE", 130, "BRE", "BRE"));
    // Brazilian Real
    result.put("BRL", new CurrencyDataImpl("BRL", "R$", 2, "R$", "R$"));
    // Brazilian New Cruzado (1989–1990)
    result.put("BRN", new CurrencyDataImpl("BRN", "BRN", 130, "BRN", "BRN"));
    // Brazilian Cruzeiro (1993–1994)
    result.put("BRR", new CurrencyDataImpl("BRR", "BRR", 130, "BRR", "BRR"));
    // Brazilian Cruzeiro (1942–1967)
    result.put("BRZ", new CurrencyDataImpl("BRZ", "BRZ", 130, "BRZ", "BRZ"));
    // Bahamian Dollar
    result.put("BSD", new CurrencyDataImpl("BSD", "BSD", 2, "BSD", "$"));
    // Bhutanese Ngultrum
    result.put("BTN", new CurrencyDataImpl("BTN", "BTN", 2, "BTN", "Nu."));
    // Burmese Kyat
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130, "BUK", "BUK"));
    // Botswanan Pula
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2, "BWP", "P"));
    // Belarusian Ruble (1994–1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130, "BYB", "BYB"));
    // Belarusian Ruble
    result.put("BYN", new CurrencyDataImpl("BYN", "BYN", 2, "BYN", "BYN"));
    // Belarusian Ruble (2000–2016)
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 128, "BYR", "BYR"));
    // Belize Dollar
    result.put("BZD", new CurrencyDataImpl("BZD", "BZD", 2, "BZD", "$"));
    // Canadian Dollar
    result.put("CAD", new CurrencyDataImpl("CAD", "CA$", 2, "C$", "$"));
    // Congolese Franc
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2, "CDF", "FrCD"));
    // WIR Euro
    result.put("CHE", new CurrencyDataImpl("CHE", "CHE", 130, "CHE", "CHE"));
    // Swiss Franc
    result.put("CHF", new CurrencyDataImpl("CHF", "CHF", 2, "CHF", "CHF"));
    // WIR Franc
    result.put("CHW", new CurrencyDataImpl("CHW", "CHW", 130, "CHW", "CHW"));
    // Chilean Escudo
    result.put("CLE", new CurrencyDataImpl("CLE", "CLE", 130, "CLE", "CLE"));
    // Chilean Unit of Account (UF)
    result.put("CLF", new CurrencyDataImpl("CLF", "CLF", 132, "CLF", "CLF"));
    // Chilean Peso
    result.put("CLP", new CurrencyDataImpl("CLP", "CL$", 0, "CL$", "$"));
    // Chinese Yuan (offshore)
    result.put("CNH", new CurrencyDataImpl("CNH", "CNH", 130, "CNH", "CNH"));
    // Chinese People’s Bank Dollar
    result.put("CNX", new CurrencyDataImpl("CNX", "CNX", 130, "CNX", "CNX"));
    // Chinese Yuan
    result.put("CNY", new CurrencyDataImpl("CNY", "CN¥", 2, "RMB¥", "¥"));
    // Colombian Peso
    result.put("COP", new CurrencyDataImpl("COP", "COL$", 2, "COL$", "$"));
    // Colombian Real Value Unit
    result.put("COU", new CurrencyDataImpl("COU", "COU", 130, "COU", "COU"));
    // Costa Rican Colón
    result.put("CRC", new CurrencyDataImpl("CRC", "CR₡", 2, "CR₡", "₡"));
    // Serbian Dinar (2002–2006)
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130, "CSD", "CSD"));
    // Czechoslovak Hard Koruna
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130, "CSK", "CSK"));
    // Cuban Convertible Peso
    result.put("CUC", new CurrencyDataImpl("CUC", "CUC", 2, "CUC", "$"));
    // Cuban Peso
    result.put("CUP", new CurrencyDataImpl("CUP", "$MN", 2, "$MN", "$"));
    // Cape Verdean Escudo
    result.put("CVE", new CurrencyDataImpl("CVE", "CVE", 2, "CVE", "CVE"));
    // Cypriot Pound
    result.put("CYP", new CurrencyDataImpl("CYP", "CYP", 130, "CYP", "CYP"));
    // Czech Koruna
    result.put("CZK", new CurrencyDataImpl("CZK", "Kč", 2, "Kč", "Kč"));
    // East German Mark
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130, "DDM", "DDM"));
    // German Mark
    result.put("DEM", new CurrencyDataImpl("DEM", "DEM", 130, "DEM", "DEM"));
    // Djiboutian Franc
    result.put("DJF", new CurrencyDataImpl("DJF", "Fdj", 0, "Fdj", "Fdj"));
    // Danish Krone
    result.put("DKK", new CurrencyDataImpl("DKK", "kr", 2, "kr", "kr"));
    // Dominican Peso
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$", "$"));
    // Algerian Dinar
    result.put("DZD", new CurrencyDataImpl("DZD", "DZD", 2, "DZD", "din"));
    // Ecuadorian Sucre
    result.put("ECS", new CurrencyDataImpl("ECS", "ECS", 130, "ECS", "ECS"));
    // Ecuadorian Unit of Constant Value
    result.put("ECV", new CurrencyDataImpl("ECV", "ECV", 130, "ECV", "ECV"));
    // Estonian Kroon
    result.put("EEK", new CurrencyDataImpl("EEK", "EEK", 130, "EEK", "EEK"));
    // Egyptian Pound
    result.put("EGP", new CurrencyDataImpl("EGP", "LE", 2, "LE", "E£"));
    // Eritrean Nakfa
    result.put("ERN", new CurrencyDataImpl("ERN", "ERN", 2, "ERN", "Nfk"));
    // Spanish Peseta (A account)
    result.put("ESA", new CurrencyDataImpl("ESA", "ESA", 130, "ESA", "ESA"));
    // Spanish Peseta (convertible account)
    result.put("ESB", new CurrencyDataImpl("ESB", "ESB", 130, "ESB", "ESB"));
    // Spanish Peseta
    result.put("ESP", new CurrencyDataImpl("ESP", "ESP", 128, "ESP", "ESP"));
    // Ethiopian Birr
    result.put("ETB", new CurrencyDataImpl("ETB", "ETB", 2, "ETB", "Birr"));
    // Euro
    result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€", "€"));
    // Finnish Markka
    result.put("FIM", new CurrencyDataImpl("FIM", "FIM", 130, "FIM", "FIM"));
    // Fijian Dollar
    result.put("FJD", new CurrencyDataImpl("FJD", "FJD", 2, "FJD", "$"));
    // Falkland Islands Pound
    result.put("FKP", new CurrencyDataImpl("FKP", "FKP", 2, "FKP", "£"));
    // French Franc
    result.put("FRF", new CurrencyDataImpl("FRF", "FRF", 130, "FRF", "FRF"));
    // British Pound
    result.put("GBP", new CurrencyDataImpl("GBP", "£", 2, "GB£", "£"));
    // Georgian Kupon Larit
    result.put("GEK", new CurrencyDataImpl("GEK", "GEK", 130, "GEK", "GEK"));
    // Georgian Lari
    result.put("GEL", new CurrencyDataImpl("GEL", "GEL", 2, "GEL", "GEL"));
    // Ghanaian Cedi (1979–2007)
    result.put("GHC", new CurrencyDataImpl("GHC", "GHC", 130, "GHC", "GHC"));
    // Ghanaian Cedi
    result.put("GHS", new CurrencyDataImpl("GHS", "GHS", 2, "GHS", "GHS"));
    // Gibraltar Pound
    result.put("GIP", new CurrencyDataImpl("GIP", "GIP", 2, "GIP", "£"));
    // Gambian Dalasi
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2, "GMD", "GMD"));
    // Guinean Franc
    result.put("GNF", new CurrencyDataImpl("GNF", "GNF", 0, "GNF", "FG"));
    // Guinean Syli
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130, "GNS", "GNS"));
    // Equatorial Guinean Ekwele
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130, "GQE", "GQE"));
    // Greek Drachma
    result.put("GRD", new CurrencyDataImpl("GRD", "GRD", 130, "GRD", "GRD"));
    // Guatemalan Quetzal
    result.put("GTQ", new CurrencyDataImpl("GTQ", "GTQ", 2, "GTQ", "Q"));
    // Portuguese Guinea Escudo
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130, "GWE", "GWE"));
    // Guinea-Bissau Peso
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 130, "GWP", "GWP"));
    // Guyanaese Dollar
    result.put("GYD", new CurrencyDataImpl("GYD", "GYD", 2, "GYD", "$"));
    // Hong Kong Dollar
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$", "$"));
    // Honduran Lempira
    result.put("HNL", new CurrencyDataImpl("HNL", "L", 2, "L", "L"));
    // Croatian Dinar
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130, "HRD", "HRD"));
    // Croatian Kuna
    result.put("HRK", new CurrencyDataImpl("HRK", "HRK", 2, "HRK", "kn"));
    // Haitian Gourde
    result.put("HTG", new CurrencyDataImpl("HTG", "HTG", 2, "HTG", "HTG"));
    // Hungarian Forint
    result.put("HUF", new CurrencyDataImpl("HUF", "HUF", 2, "HUF", "Ft"));
    // Indonesian Rupiah
    result.put("IDR", new CurrencyDataImpl("IDR", "IDR", 2, "IDR", "Rp"));
    // Irish Pound
    result.put("IEP", new CurrencyDataImpl("IEP", "IEP", 130, "IEP", "IEP"));
    // Israeli Pound
    result.put("ILP", new CurrencyDataImpl("ILP", "ILP", 130, "ILP", "ILP"));
    // Israeli Shekel (1980–1985)
    result.put("ILR", new CurrencyDataImpl("ILR", "ILR", 130, "ILR", "ILR"));
    // Israeli New Shekel
    result.put("ILS", new CurrencyDataImpl("ILS", "₪", 2, "IL₪", "₪"));
    // Indian Rupee
    result.put("INR", new CurrencyDataImpl("INR", "₹", 2, "Rs", "₹"));
    // Iraqi Dinar
    result.put("IQD", new CurrencyDataImpl("IQD", "IQD", 0, "IQD", "din"));
    // Iranian Rial
    result.put("IRR", new CurrencyDataImpl("IRR", "IRR", 0, "IRR", "Rial"));
    // Icelandic Króna (1918–1981)
    result.put("ISJ", new CurrencyDataImpl("ISJ", "ISJ", 130, "ISJ", "ISJ"));
    // Icelandic Króna
    result.put("ISK", new CurrencyDataImpl("ISK", "kr", 0, "kr", "kr"));
    // Italian Lira
    result.put("ITL", new CurrencyDataImpl("ITL", "ITL", 128, "ITL", "ITL"));
    // Jamaican Dollar
    result.put("JMD", new CurrencyDataImpl("JMD", "JA$", 2, "JA$", "$"));
    // Jordanian Dinar
    result.put("JOD", new CurrencyDataImpl("JOD", "JOD", 3, "JOD", "din"));
    // Japanese Yen
    result.put("JPY", new CurrencyDataImpl("JPY", "¥", 0, "JP¥", "¥"));
    // Kenyan Shilling
    result.put("KES", new CurrencyDataImpl("KES", "Ksh", 2, "Ksh", "Ksh"));
    // Kyrgystani Som
    result.put("KGS", new CurrencyDataImpl("KGS", "KGS", 2, "KGS", "KGS"));
    // Cambodian Riel
    result.put("KHR", new CurrencyDataImpl("KHR", "KHR", 2, "KHR", "Riel"));
    // Comorian Franc
    result.put("KMF", new CurrencyDataImpl("KMF", "KMF", 0, "KMF", "CF"));
    // North Korean Won
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 0, "KPW", "₩"));
    // South Korean Hwan (1953–1962)
    result.put("KRH", new CurrencyDataImpl("KRH", "KRH", 130, "KRH", "KRH"));
    // South Korean Won (1945–1953)
    result.put("KRO", new CurrencyDataImpl("KRO", "KRO", 130, "KRO", "KRO"));
    // South Korean Won
    result.put("KRW", new CurrencyDataImpl("KRW", "₩", 0, "KR₩", "₩"));
    // Kuwaiti Dinar
    result.put("KWD", new CurrencyDataImpl("KWD", "KWD", 3, "KWD", "din"));
    // Cayman Islands Dollar
    result.put("KYD", new CurrencyDataImpl("KYD", "KYD", 2, "KYD", "$"));
    // Kazakhstani Tenge
    result.put("KZT", new CurrencyDataImpl("KZT", "KZT", 2, "KZT", "₸"));
    // Laotian Kip
    result.put("LAK", new CurrencyDataImpl("LAK", "LAK", 0, "LAK", "₭"));
    // Lebanese Pound
    result.put("LBP", new CurrencyDataImpl("LBP", "LBP", 0, "LBP", "L£"));
    // Sri Lankan Rupee
    result.put("LKR", new CurrencyDataImpl("LKR", "SLRs", 2, "SLRs", "Rs"));
    // Liberian Dollar
    result.put("LRD", new CurrencyDataImpl("LRD", "LRD", 2, "LRD", "$"));
    // Lesotho Loti
    result.put("LSL", new CurrencyDataImpl("LSL", "LSL", 2, "LSL", "LSL"));
    // Lithuanian Litas
    result.put("LTL", new CurrencyDataImpl("LTL", "LTL", 130, "LTL", "Lt"));
    // Lithuanian Talonas
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130, "LTT", "LTT"));
    // Luxembourgian Convertible Franc
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 130, "LUC", "LUC"));
    // Luxembourgian Franc
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128, "LUF", "LUF"));
    // Luxembourg Financial Franc
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 130, "LUL", "LUL"));
    // Latvian Lats
    result.put("LVL", new CurrencyDataImpl("LVL", "LVL", 130, "LVL", "Ls"));
    // Latvian Ruble
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130, "LVR", "LVR"));
    // Libyan Dinar
    result.put("LYD", new CurrencyDataImpl("LYD", "LYD", 3, "LYD", "din"));
    // Moroccan Dirham
    result.put("MAD", new CurrencyDataImpl("MAD", "MAD", 2, "MAD", "MAD"));
    // Moroccan Franc
    result.put("MAF", new CurrencyDataImpl("MAF", "MAF", 130, "MAF", "MAF"));
    // Monegasque Franc
    result.put("MCF", new CurrencyDataImpl("MCF", "MCF", 130, "MCF", "MCF"));
    // Moldovan Cupon
    result.put("MDC", new CurrencyDataImpl("MDC", "MDC", 130, "MDC", "MDC"));
    // Moldovan Leu
    result.put("MDL", new CurrencyDataImpl("MDL", "MDL", 2, "MDL", "MDL"));
    // Malagasy Ariary
    result.put("MGA", new CurrencyDataImpl("MGA", "MGA", 0, "MGA", "Ar"));
    // Malagasy Franc
    result.put("MGF", new CurrencyDataImpl("MGF", "MGF", 128, "MGF", "MGF"));
    // Macedonian Denar
    result.put("MKD", new CurrencyDataImpl("MKD", "MKD", 2, "MKD", "din"));
    // Macedonian Denar (1992–1993)
    result.put("MKN", new CurrencyDataImpl("MKN", "MKN", 130, "MKN", "MKN"));
    // Malian Franc
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130, "MLF", "MLF"));
    // Myanmar Kyat
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 0, "MMK", "K"));
    // Mongolian Tugrik
    result.put("MNT", new CurrencyDataImpl("MNT", "MN₮", 2, "MN₮", "₮"));
    // Macanese Pataca
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP", 2, "MOP", "MOP"));
    // Mauritanian Ouguiya (1973–2017)
    result.put("MRO", new CurrencyDataImpl("MRO", "MRO", 128, "MRO", "MRO"));
    // Mauritanian Ouguiya
    result.put("MRU", new CurrencyDataImpl("MRU", "MRU", 2, "MRU", "MRU"));
    // Maltese Lira
    result.put("MTL", new CurrencyDataImpl("MTL", "MTL", 130, "MTL", "MTL"));
    // Maltese Pound
    result.put("MTP", new CurrencyDataImpl("MTP", "MTP", 130, "MTP", "MTP"));
    // Mauritian Rupee
    result.put("MUR", new CurrencyDataImpl("MUR", "MUR", 2, "MUR", "Rs"));
    // Maldivian Rupee (1947–1981)
    result.put("MVP", new CurrencyDataImpl("MVP", "MVP", 130, "MVP", "MVP"));
    // Maldivian Rufiyaa
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2, "MVR", "MVR"));
    // Malawian Kwacha
    result.put("MWK", new CurrencyDataImpl("MWK", "MWK", 2, "MWK", "MWK"));
    // Mexican Peso
    result.put("MXN", new CurrencyDataImpl("MXN", "MX$", 2, "Mex$", "$"));
    // Mexican Silver Peso (1861–1992)
    result.put("MXP", new CurrencyDataImpl("MXP", "MXP", 130, "MXP", "MXP"));
    // Mexican Investment Unit
    result.put("MXV", new CurrencyDataImpl("MXV", "MXV", 130, "MXV", "MXV"));
    // Malaysian Ringgit
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM", "RM"));
    // Mozambican Escudo
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130, "MZE", "MZE"));
    // Mozambican Metical (1980–2006)
    result.put("MZM", new CurrencyDataImpl("MZM", "MZM", 130, "MZM", "MZM"));
    // Mozambican Metical
    result.put("MZN", new CurrencyDataImpl("MZN", "MZN", 2, "MZN", "MTn"));
    // Namibian Dollar
    result.put("NAD", new CurrencyDataImpl("NAD", "NAD", 2, "NAD", "$"));
    // Nigerian Naira
    result.put("NGN", new CurrencyDataImpl("NGN", "NGN", 2, "NGN", "₦"));
    // Nicaraguan Córdoba (1988–1991)
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130, "NIC", "NIC"));
    // Nicaraguan Córdoba
    result.put("NIO", new CurrencyDataImpl("NIO", "NIO", 2, "NIO", "C$"));
    // Dutch Guilder
    result.put("NLG", new CurrencyDataImpl("NLG", "NLG", 130, "NLG", "NLG"));
    // Norwegian Krone
    result.put("NOK", new CurrencyDataImpl("NOK", "NOkr", 2, "NOkr", "kr"));
    // Nepalese Rupee
    result.put("NPR", new CurrencyDataImpl("NPR", "NPR", 2, "NPR", "Rs"));
    // New Zealand Dollar
    result.put("NZD", new CurrencyDataImpl("NZD", "NZ$", 2, "NZ$", "$"));
    // Omani Rial
    result.put("OMR", new CurrencyDataImpl("OMR", "OMR", 3, "OMR", "Rial"));
    // Panamanian Balboa
    result.put("PAB", new CurrencyDataImpl("PAB", "B/.", 2, "B/.", "B/."));
    // Peruvian Inti
    result.put("PEI", new CurrencyDataImpl("PEI", "PEI", 130, "PEI", "PEI"));
    // Peruvian Sol
    result.put("PEN", new CurrencyDataImpl("PEN", "S/.", 2, "S/.", "S/."));
    // Peruvian Sol (1863–1965)
    result.put("PES", new CurrencyDataImpl("PES", "PES", 130, "PES", "PES"));
    // Papua New Guinean Kina
    result.put("PGK", new CurrencyDataImpl("PGK", "PGK", 2, "PGK", "PGK"));
    // Philippine Piso
    result.put("PHP", new CurrencyDataImpl("PHP", "PHP", 2, "PHP", "₱"));
    // Pakistani Rupee
    result.put("PKR", new CurrencyDataImpl("PKR", "PKRs.", 2, "PKRs.", "Rs"));
    // Polish Zloty
    result.put("PLN", new CurrencyDataImpl("PLN", "PLN", 2, "PLN", "zł"));
    // Polish Zloty (1950–1995)
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130, "PLZ", "PLZ"));
    // Portuguese Escudo
    result.put("PTE", new CurrencyDataImpl("PTE", "PTE", 130, "PTE", "PTE"));
    // Paraguayan Guarani
    result.put("PYG", new CurrencyDataImpl("PYG", "PYG", 0, "PYG", "Gs"));
    // Qatari Rial
    result.put("QAR", new CurrencyDataImpl("QAR", "QAR", 2, "QAR", "Rial"));
    // Rhodesian Dollar
    result.put("RHD", new CurrencyDataImpl("RHD", "RHD", 130, "RHD", "RHD"));
    // Romanian Leu (1952–2006)
    result.put("ROL", new CurrencyDataImpl("ROL", "ROL", 130, "ROL", "ROL"));
    // Romanian Leu
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2, "RON", "RON"));
    // Serbian Dinar
    result.put("RSD", new CurrencyDataImpl("RSD", "RSD", 0, "RSD", "din"));
    // Russian Ruble
    result.put("RUB", new CurrencyDataImpl("RUB", "руб.", 2, "руб.", "руб."));
    // Russian Ruble (1991–1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130, "RUR", "RUR"));
    // Rwandan Franc
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0, "RWF", "RF"));
    // Saudi Riyal
    result.put("SAR", new CurrencyDataImpl("SAR", "SR", 2, "SR", "Rial"));
    // Solomon Islands Dollar
    result.put("SBD", new CurrencyDataImpl("SBD", "SBD", 2, "SBD", "$"));
    // Seychellois Rupee
    result.put("SCR", new CurrencyDataImpl("SCR", "SCR", 2, "SCR", "SCR"));
    // Sudanese Dinar (1992–2007)
    result.put("SDD", new CurrencyDataImpl("SDD", "SDD", 130, "SDD", "SDD"));
    // Sudanese Pound
    result.put("SDG", new CurrencyDataImpl("SDG", "SDG", 2, "SDG", "SDG"));
    // Sudanese Pound (1957–1998)
    result.put("SDP", new CurrencyDataImpl("SDP", "SDP", 130, "SDP", "SDP"));
    // Swedish Krona
    result.put("SEK", new CurrencyDataImpl("SEK", "kr", 2, "kr", "kr"));
    // Singapore Dollar
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$", "$"));
    // St. Helena Pound
    result.put("SHP", new CurrencyDataImpl("SHP", "SHP", 2, "SHP", "£"));
    // Slovenian Tolar
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130, "SIT", "SIT"));
    // Slovak Koruna
    result.put("SKK", new CurrencyDataImpl("SKK", "SKK", 130, "SKK", "SKK"));
    // Sierra Leonean Leone
    result.put("SLL", new CurrencyDataImpl("SLL", "SLL", 0, "SLL", "SLL"));
    // Somali Shilling
    result.put("SOS", new CurrencyDataImpl("SOS", "SOS", 0, "SOS", "SOS"));
    // Surinamese Dollar
    result.put("SRD", new CurrencyDataImpl("SRD", "SRD", 2, "SRD", "$"));
    // Surinamese Guilder
    result.put("SRG", new CurrencyDataImpl("SRG", "SRG", 130, "SRG", "SRG"));
    // South Sudanese Pound
    result.put("SSP", new CurrencyDataImpl("SSP", "SSP", 2, "SSP", "SSP"));
    // São Tomé & Príncipe Dobra (1977–2017)
    result.put("STD", new CurrencyDataImpl("STD", "STD", 128, "STD", "Db"));
    // São Tomé & Príncipe Dobra
    result.put("STN", new CurrencyDataImpl("STN", "STN", 2, "STN", "STN"));
    // Soviet Rouble
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130, "SUR", "SUR"));
    // Salvadoran Colón
    result.put("SVC", new CurrencyDataImpl("SVC", "SVC", 130, "SVC", "SVC"));
    // Syrian Pound
    result.put("SYP", new CurrencyDataImpl("SYP", "SYP", 0, "SYP", "£"));
    // Swazi Lilangeni
    result.put("SZL", new CurrencyDataImpl("SZL", "SZL", 2, "SZL", "SZL"));
    // Thai Baht
    result.put("THB", new CurrencyDataImpl("THB", "THB", 2, "THB", "฿"));
    // Tajikistani Ruble
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130, "TJR", "TJR"));
    // Tajikistani Somoni
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2, "TJS", "Som"));
    // Turkmenistani Manat (1993–2009)
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 128, "TMM", "TMM"));
    // Turkmenistani Manat
    result.put("TMT", new CurrencyDataImpl("TMT", "TMT", 2, "TMT", "TMT"));
    // Tunisian Dinar
    result.put("TND", new CurrencyDataImpl("TND", "TND", 3, "TND", "din"));
    // Tongan Paʻanga
    result.put("TOP", new CurrencyDataImpl("TOP", "TOP", 2, "TOP", "T$"));
    // Timorese Escudo
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130, "TPE", "TPE"));
    // Turkish Lira (1922–2005)
    result.put("TRL", new CurrencyDataImpl("TRL", "TRL", 128, "TRL", "TRL"));
    // Turkish Lira
    result.put("TRY", new CurrencyDataImpl("TRY", "TL", 2, "YTL", "TL"));
    // Trinidad & Tobago Dollar
    result.put("TTD", new CurrencyDataImpl("TTD", "TTD", 2, "TTD", "$"));
    // New Taiwan Dollar
    result.put("TWD", new CurrencyDataImpl("TWD", "NT$", 2, "NT$", "NT$"));
    // Tanzanian Shilling
    result.put("TZS", new CurrencyDataImpl("TZS", "TZS", 2, "TZS", "TSh"));
    // Ukrainian Hryvnia
    result.put("UAH", new CurrencyDataImpl("UAH", "UAH", 2, "UAH", "₴"));
    // Ukrainian Karbovanets
    result.put("UAK", new CurrencyDataImpl("UAK", "UAK", 130, "UAK", "UAK"));
    // Ugandan Shilling (1966–1987)
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130, "UGS", "UGS"));
    // Ugandan Shilling
    result.put("UGX", new CurrencyDataImpl("UGX", "UGX", 0, "UGX", "UGX"));
    // US Dollar
    result.put("USD", new CurrencyDataImpl("USD", "$", 2, "US$", "$"));
    // US Dollar (Next day)
    result.put("USN", new CurrencyDataImpl("USN", "USN", 130, "USN", "USN"));
    // US Dollar (Same day)
    result.put("USS", new CurrencyDataImpl("USS", "USS", 130, "USS", "USS"));
    // Uruguayan Peso (Indexed Units)
    result.put("UYI", new CurrencyDataImpl("UYI", "UYI", 128, "UYI", "UYI"));
    // Uruguayan Peso (1975–1993)
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130, "UYP", "UYP"));
    // Uruguayan Peso
    result.put("UYU", new CurrencyDataImpl("UYU", "UY$", 2, "UY$", "$"));
    // Uruguayan Nominal Wage Index Unit
    result.put("UYW", new CurrencyDataImpl("UYW", "UYW", 132, "UYW", "UYW"));
    // Uzbekistani Som
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 2, "UZS", "soʼm"));
    // Venezuelan Bolívar (1871–2008)
    result.put("VEB", new CurrencyDataImpl("VEB", "VEB", 130, "VEB", "VEB"));
    // Venezuelan Bolívar (2008–2018)
    result.put("VEF", new CurrencyDataImpl("VEF", "VEF", 130, "VEF", "Bs"));
    // Venezuelan Bolívar
    result.put("VES", new CurrencyDataImpl("VES", "VES", 2, "VES", "VES"));
    // Vietnamese Dong
    result.put("VND", new CurrencyDataImpl("VND", "₫", 24, "₫", "₫"));
    // Vietnamese Dong (1978–1985)
    result.put("VNN", new CurrencyDataImpl("VNN", "VNN", 130, "VNN", "VNN"));
    // Vanuatu Vatu
    result.put("VUV", new CurrencyDataImpl("VUV", "VUV", 0, "VUV", "VUV"));
    // Samoan Tala
    result.put("WST", new CurrencyDataImpl("WST", "WST", 2, "WST", "WST"));
    // Central African CFA Franc
    result.put("XAF", new CurrencyDataImpl("XAF", "FCFA", 0, "FCFA", "FCFA"));
    // Silver
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 130, "XAG", "XAG"));
    // Gold
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 130, "XAU", "XAU"));
    // European Composite Unit
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 130, "XBA", "XBA"));
    // European Monetary Unit
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 130, "XBB", "XBB"));
    // European Unit of Account (XBC)
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 130, "XBC", "XBC"));
    // European Unit of Account (XBD)
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 130, "XBD", "XBD"));
    // East Caribbean Dollar
    result.put("XCD", new CurrencyDataImpl("XCD", "EC$", 2, "EC$", "$"));
    // Special Drawing Rights
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 130, "XDR", "XDR"));
    // European Currency Unit
    result.put("XEU", new CurrencyDataImpl("XEU", "XEU", 130, "XEU", "XEU"));
    // French Gold Franc
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 130, "XFO", "XFO"));
    // French UIC-Franc
    result.put("XFU", new CurrencyDataImpl("XFU", "XFU", 130, "XFU", "XFU"));
    // West African CFA Franc
    result.put("XOF", new CurrencyDataImpl("XOF", "CFA", 0, "CFA", "CFA"));
    // Palladium
    result.put("XPD", new CurrencyDataImpl("XPD", "XPD", 130, "XPD", "XPD"));
    // CFP Franc
    result.put("XPF", new CurrencyDataImpl("XPF", "CFPF", 0, "CFPF", "FCFP"));
    // Platinum
    result.put("XPT", new CurrencyDataImpl("XPT", "XPT", 130, "XPT", "XPT"));
    // RINET Funds
    result.put("XRE", new CurrencyDataImpl("XRE", "XRE", 130, "XRE", "XRE"));
    // Sucre
    result.put("XSU", new CurrencyDataImpl("XSU", "XSU", 130, "XSU", "XSU"));
    // Testing Currency Code
    result.put("XTS", new CurrencyDataImpl("XTS", "XTS", 130, "XTS", "XTS"));
    // ADB Unit of Account
    result.put("XUA", new CurrencyDataImpl("XUA", "XUA", 130, "XUA", "XUA"));
    // Unknown Currency
    result.put("XXX", new CurrencyDataImpl("XXX", "¤", 130, "¤", "¤"));
    // Yemeni Dinar
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130, "YDD", "YDD"));
    // Yemeni Rial
    result.put("YER", new CurrencyDataImpl("YER", "YER", 0, "YER", "Rial"));
    // Yugoslavian Hard Dinar (1966–1990)
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130, "YUD", "YUD"));
    // Yugoslavian New Dinar (1994–2002)
    result.put("YUM", new CurrencyDataImpl("YUM", "YUM", 130, "YUM", "YUM"));
    // Yugoslavian Convertible Dinar (1990–1992)
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130, "YUN", "YUN"));
    // Yugoslavian Reformed Dinar (1992–1993)
    result.put("YUR", new CurrencyDataImpl("YUR", "YUR", 130, "YUR", "YUR"));
    // South African Rand (financial)
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 130, "ZAL", "ZAL"));
    // South African Rand
    result.put("ZAR", new CurrencyDataImpl("ZAR", "ZAR", 2, "ZAR", "R"));
    // Zambian Kwacha (1968–2012)
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZMK", 128, "ZMK", "ZWK"));
    // Zambian Kwacha
    result.put("ZMW", new CurrencyDataImpl("ZMW", "ZMW", 2, "ZMW", "ZMW"));
    // Zairean New Zaire (1993–1998)
    result.put("ZRN", new CurrencyDataImpl("ZRN", "ZRN", 130, "ZRN", "ZRN"));
    // Zairean Zaire (1971–1993)
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"));
    // Zimbabwean Dollar (1980–2008)
    result.put("ZWD", new CurrencyDataImpl("ZWD", "ZWD", 128, "ZWD", "ZWD"));
    // Zimbabwean Dollar (2009)
    result.put("ZWL", new CurrencyDataImpl("ZWL", "ZWL", 130, "ZWL", "ZWL"));
    // Zimbabwean Dollar (2008)
    result.put("ZWR", new CurrencyDataImpl("ZWR", "ZWR", 130, "ZWR", "ZWR"));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // Andorran Peseta
      "ADP": [ "ADP", "ADP", 128, "ADP", "ADP"],
      // United Arab Emirates Dirham
      "AED": [ "AED", "DH", 2, "DH", "dh"],
      // Afghan Afghani (1927–2002)
      "AFA": [ "AFA", "AFA", 130, "AFA", "AFA"],
      // Afghan Afghani
      "AFN": [ "AFN", "AFN", 0, "AFN", "Af."],
      // Albanian Lek (1946–1965)
      "ALK": [ "ALK", "ALK", 130, "ALK", "ALK"],
      // Albanian Lek
      "ALL": [ "ALL", "ALL", 0, "ALL", "Lek"],
      // Armenian Dram
      "AMD": [ "AMD", "AMD", 2, "AMD", "Dram"],
      // Netherlands Antillean Guilder
      "ANG": [ "ANG", "ANG", 2, "ANG", "ANG"],
      // Angolan Kwanza
      "AOA": [ "AOA", "AOA", 2, "AOA", "Kz"],
      // Angolan Kwanza (1977–1991)
      "AOK": [ "AOK", "AOK", 130, "AOK", "AOK"],
      // Angolan New Kwanza (1990–2000)
      "AON": [ "AON", "AON", 130, "AON", "AON"],
      // Angolan Readjusted Kwanza (1995–1999)
      "AOR": [ "AOR", "AOR", 130, "AOR", "AOR"],
      // Argentine Austral
      "ARA": [ "ARA", "ARA", 130, "ARA", "ARA"],
      // Argentine Peso Ley (1970–1983)
      "ARL": [ "ARL", "ARL", 130, "ARL", "ARL"],
      // Argentine Peso (1881–1970)
      "ARM": [ "ARM", "ARM", 130, "ARM", "ARM"],
      // Argentine Peso (1983–1985)
      "ARP": [ "ARP", "ARP", 130, "ARP", "ARP"],
      // Argentine Peso
      "ARS": [ "ARS", "AR$", 2, "AR$", "$"],
      // Austrian Schilling
      "ATS": [ "ATS", "ATS", 130, "ATS", "ATS"],
      // Australian Dollar
      "AUD": [ "AUD", "A$", 2, "AU$", "$"],
      // Aruban Florin
      "AWG": [ "AWG", "AWG", 2, "AWG", "Afl."],
      // Azerbaijani Manat (1993–2006)
      "AZM": [ "AZM", "AZM", 130, "AZM", "AZM"],
      // Azerbaijani Manat
      "AZN": [ "AZN", "AZN", 2, "AZN", "man."],
      // Bosnia-Herzegovina Dinar (1992–1994)
      "BAD": [ "BAD", "BAD", 130, "BAD", "BAD"],
      // Bosnia-Herzegovina Convertible Mark
      "BAM": [ "BAM", "BAM", 2, "BAM", "KM"],
      // Bosnia-Herzegovina New Dinar (1994–1997)
      "BAN": [ "BAN", "BAN", 130, "BAN", "BAN"],
      // Barbadian Dollar
      "BBD": [ "BBD", "BBD", 2, "BBD", "$"],
      // Bangladeshi Taka
      "BDT": [ "BDT", "Tk", 2, "Tk", "৳"],
      // Belgian Franc (convertible)
      "BEC": [ "BEC", "BEC", 130, "BEC", "BEC"],
      // Belgian Franc
      "BEF": [ "BEF", "BEF", 130, "BEF", "BEF"],
      // Belgian Franc (financial)
      "BEL": [ "BEL", "BEL", 130, "BEL", "BEL"],
      // Bulgarian Hard Lev
      "BGL": [ "BGL", "BGL", 130, "BGL", "BGL"],
      // Bulgarian Socialist Lev
      "BGM": [ "BGM", "BGM", 130, "BGM", "BGM"],
      // Bulgarian Lev
      "BGN": [ "BGN", "BGN", 2, "BGN", "lev"],
      // Bulgarian Lev (1879–1952)
      "BGO": [ "BGO", "BGO", 130, "BGO", "BGO"],
      // Bahraini Dinar
      "BHD": [ "BHD", "BHD", 3, "BHD", "din"],
      // Burundian Franc
      "BIF": [ "BIF", "BIF", 0, "BIF", "FBu"],
      // Bermudan Dollar
      "BMD": [ "BMD", "BMD", 2, "BMD", "$"],
      // Brunei Dollar
      "BND": [ "BND", "BND", 2, "BND", "$"],
      // Bolivian Boliviano
      "BOB": [ "BOB", "BOB", 2, "BOB", "Bs"],
      // Bolivian Boliviano (1863–1963)
      "BOL": [ "BOL", "BOL", 130, "BOL", "BOL"],
      // Bolivian Peso
      "BOP": [ "BOP", "BOP", 130, "BOP", "BOP"],
      // Bolivian Mvdol
      "BOV": [ "BOV", "BOV", 130, "BOV", "BOV"],
      // Brazilian New Cruzeiro (1967–1986)
      "BRB": [ "BRB", "BRB", 130, "BRB", "BRB"],
      // Brazilian Cruzado (1986–1989)
      "BRC": [ "BRC", "BRC", 130, "BRC", "BRC"],
      // Brazilian Cruzeiro (1990–1993)
      "BRE": [ "BRE", "BRE", 130, "BRE", "BRE"],
      // Brazilian Real
      "BRL": [ "BRL", "R$", 2, "R$", "R$"],
      // Brazilian New Cruzado (1989–1990)
      "BRN": [ "BRN", "BRN", 130, "BRN", "BRN"],
      // Brazilian Cruzeiro (1993–1994)
      "BRR": [ "BRR", "BRR", 130, "BRR", "BRR"],
      // Brazilian Cruzeiro (1942–1967)
      "BRZ": [ "BRZ", "BRZ", 130, "BRZ", "BRZ"],
      // Bahamian Dollar
      "BSD": [ "BSD", "BSD", 2, "BSD", "$"],
      // Bhutanese Ngultrum
      "BTN": [ "BTN", "BTN", 2, "BTN", "Nu."],
      // Burmese Kyat
      "BUK": [ "BUK", "BUK", 130, "BUK", "BUK"],
      // Botswanan Pula
      "BWP": [ "BWP", "BWP", 2, "BWP", "P"],
      // Belarusian Ruble (1994–1999)
      "BYB": [ "BYB", "BYB", 130, "BYB", "BYB"],
      // Belarusian Ruble
      "BYN": [ "BYN", "BYN", 2, "BYN", "BYN"],
      // Belarusian Ruble (2000–2016)
      "BYR": [ "BYR", "BYR", 128, "BYR", "BYR"],
      // Belize Dollar
      "BZD": [ "BZD", "BZD", 2, "BZD", "$"],
      // Canadian Dollar
      "CAD": [ "CAD", "CA$", 2, "C$", "$"],
      // Congolese Franc
      "CDF": [ "CDF", "CDF", 2, "CDF", "FrCD"],
      // WIR Euro
      "CHE": [ "CHE", "CHE", 130, "CHE", "CHE"],
      // Swiss Franc
      "CHF": [ "CHF", "CHF", 2, "CHF", "CHF"],
      // WIR Franc
      "CHW": [ "CHW", "CHW", 130, "CHW", "CHW"],
      // Chilean Escudo
      "CLE": [ "CLE", "CLE", 130, "CLE", "CLE"],
      // Chilean Unit of Account (UF)
      "CLF": [ "CLF", "CLF", 132, "CLF", "CLF"],
      // Chilean Peso
      "CLP": [ "CLP", "CL$", 0, "CL$", "$"],
      // Chinese Yuan (offshore)
      "CNH": [ "CNH", "CNH", 130, "CNH", "CNH"],
      // Chinese People’s Bank Dollar
      "CNX": [ "CNX", "CNX", 130, "CNX", "CNX"],
      // Chinese Yuan
      "CNY": [ "CNY", "CN¥", 2, "RMB¥", "¥"],
      // Colombian Peso
      "COP": [ "COP", "COL$", 2, "COL$", "$"],
      // Colombian Real Value Unit
      "COU": [ "COU", "COU", 130, "COU", "COU"],
      // Costa Rican Colón
      "CRC": [ "CRC", "CR₡", 2, "CR₡", "₡"],
      // Serbian Dinar (2002–2006)
      "CSD": [ "CSD", "CSD", 130, "CSD", "CSD"],
      // Czechoslovak Hard Koruna
      "CSK": [ "CSK", "CSK", 130, "CSK", "CSK"],
      // Cuban Convertible Peso
      "CUC": [ "CUC", "CUC", 2, "CUC", "$"],
      // Cuban Peso
      "CUP": [ "CUP", "$MN", 2, "$MN", "$"],
      // Cape Verdean Escudo
      "CVE": [ "CVE", "CVE", 2, "CVE", "CVE"],
      // Cypriot Pound
      "CYP": [ "CYP", "CYP", 130, "CYP", "CYP"],
      // Czech Koruna
      "CZK": [ "CZK", "Kč", 2, "Kč", "Kč"],
      // East German Mark
      "DDM": [ "DDM", "DDM", 130, "DDM", "DDM"],
      // German Mark
      "DEM": [ "DEM", "DEM", 130, "DEM", "DEM"],
      // Djiboutian Franc
      "DJF": [ "DJF", "Fdj", 0, "Fdj", "Fdj"],
      // Danish Krone
      "DKK": [ "DKK", "kr", 2, "kr", "kr"],
      // Dominican Peso
      "DOP": [ "DOP", "RD$", 2, "RD$", "$"],
      // Algerian Dinar
      "DZD": [ "DZD", "DZD", 2, "DZD", "din"],
      // Ecuadorian Sucre
      "ECS": [ "ECS", "ECS", 130, "ECS", "ECS"],
      // Ecuadorian Unit of Constant Value
      "ECV": [ "ECV", "ECV", 130, "ECV", "ECV"],
      // Estonian Kroon
      "EEK": [ "EEK", "EEK", 130, "EEK", "EEK"],
      // Egyptian Pound
      "EGP": [ "EGP", "LE", 2, "LE", "E£"],
      // Eritrean Nakfa
      "ERN": [ "ERN", "ERN", 2, "ERN", "Nfk"],
      // Spanish Peseta (A account)
      "ESA": [ "ESA", "ESA", 130, "ESA", "ESA"],
      // Spanish Peseta (convertible account)
      "ESB": [ "ESB", "ESB", 130, "ESB", "ESB"],
      // Spanish Peseta
      "ESP": [ "ESP", "ESP", 128, "ESP", "ESP"],
      // Ethiopian Birr
      "ETB": [ "ETB", "ETB", 2, "ETB", "Birr"],
      // Euro
      "EUR": [ "EUR", "€", 2, "€", "€"],
      // Finnish Markka
      "FIM": [ "FIM", "FIM", 130, "FIM", "FIM"],
      // Fijian Dollar
      "FJD": [ "FJD", "FJD", 2, "FJD", "$"],
      // Falkland Islands Pound
      "FKP": [ "FKP", "FKP", 2, "FKP", "£"],
      // French Franc
      "FRF": [ "FRF", "FRF", 130, "FRF", "FRF"],
      // British Pound
      "GBP": [ "GBP", "£", 2, "GB£", "£"],
      // Georgian Kupon Larit
      "GEK": [ "GEK", "GEK", 130, "GEK", "GEK"],
      // Georgian Lari
      "GEL": [ "GEL", "GEL", 2, "GEL", "GEL"],
      // Ghanaian Cedi (1979–2007)
      "GHC": [ "GHC", "GHC", 130, "GHC", "GHC"],
      // Ghanaian Cedi
      "GHS": [ "GHS", "GHS", 2, "GHS", "GHS"],
      // Gibraltar Pound
      "GIP": [ "GIP", "GIP", 2, "GIP", "£"],
      // Gambian Dalasi
      "GMD": [ "GMD", "GMD", 2, "GMD", "GMD"],
      // Guinean Franc
      "GNF": [ "GNF", "GNF", 0, "GNF", "FG"],
      // Guinean Syli
      "GNS": [ "GNS", "GNS", 130, "GNS", "GNS"],
      // Equatorial Guinean Ekwele
      "GQE": [ "GQE", "GQE", 130, "GQE", "GQE"],
      // Greek Drachma
      "GRD": [ "GRD", "GRD", 130, "GRD", "GRD"],
      // Guatemalan Quetzal
      "GTQ": [ "GTQ", "GTQ", 2, "GTQ", "Q"],
      // Portuguese Guinea Escudo
      "GWE": [ "GWE", "GWE", 130, "GWE", "GWE"],
      // Guinea-Bissau Peso
      "GWP": [ "GWP", "GWP", 130, "GWP", "GWP"],
      // Guyanaese Dollar
      "GYD": [ "GYD", "GYD", 2, "GYD", "$"],
      // Hong Kong Dollar
      "HKD": [ "HKD", "HK$", 2, "HK$", "$"],
      // Honduran Lempira
      "HNL": [ "HNL", "L", 2, "L", "L"],
      // Croatian Dinar
      "HRD": [ "HRD", "HRD", 130, "HRD", "HRD"],
      // Croatian Kuna
      "HRK": [ "HRK", "HRK", 2, "HRK", "kn"],
      // Haitian Gourde
      "HTG": [ "HTG", "HTG", 2, "HTG", "HTG"],
      // Hungarian Forint
      "HUF": [ "HUF", "HUF", 2, "HUF", "Ft"],
      // Indonesian Rupiah
      "IDR": [ "IDR", "IDR", 2, "IDR", "Rp"],
      // Irish Pound
      "IEP": [ "IEP", "IEP", 130, "IEP", "IEP"],
      // Israeli Pound
      "ILP": [ "ILP", "ILP", 130, "ILP", "ILP"],
      // Israeli Shekel (1980–1985)
      "ILR": [ "ILR", "ILR", 130, "ILR", "ILR"],
      // Israeli New Shekel
      "ILS": [ "ILS", "₪", 2, "IL₪", "₪"],
      // Indian Rupee
      "INR": [ "INR", "₹", 2, "Rs", "₹"],
      // Iraqi Dinar
      "IQD": [ "IQD", "IQD", 0, "IQD", "din"],
      // Iranian Rial
      "IRR": [ "IRR", "IRR", 0, "IRR", "Rial"],
      // Icelandic Króna (1918–1981)
      "ISJ": [ "ISJ", "ISJ", 130, "ISJ", "ISJ"],
      // Icelandic Króna
      "ISK": [ "ISK", "kr", 0, "kr", "kr"],
      // Italian Lira
      "ITL": [ "ITL", "ITL", 128, "ITL", "ITL"],
      // Jamaican Dollar
      "JMD": [ "JMD", "JA$", 2, "JA$", "$"],
      // Jordanian Dinar
      "JOD": [ "JOD", "JOD", 3, "JOD", "din"],
      // Japanese Yen
      "JPY": [ "JPY", "¥", 0, "JP¥", "¥"],
      // Kenyan Shilling
      "KES": [ "KES", "Ksh", 2, "Ksh", "Ksh"],
      // Kyrgystani Som
      "KGS": [ "KGS", "KGS", 2, "KGS", "KGS"],
      // Cambodian Riel
      "KHR": [ "KHR", "KHR", 2, "KHR", "Riel"],
      // Comorian Franc
      "KMF": [ "KMF", "KMF", 0, "KMF", "CF"],
      // North Korean Won
      "KPW": [ "KPW", "KPW", 0, "KPW", "₩"],
      // South Korean Hwan (1953–1962)
      "KRH": [ "KRH", "KRH", 130, "KRH", "KRH"],
      // South Korean Won (1945–1953)
      "KRO": [ "KRO", "KRO", 130, "KRO", "KRO"],
      // South Korean Won
      "KRW": [ "KRW", "₩", 0, "KR₩", "₩"],
      // Kuwaiti Dinar
      "KWD": [ "KWD", "KWD", 3, "KWD", "din"],
      // Cayman Islands Dollar
      "KYD": [ "KYD", "KYD", 2, "KYD", "$"],
      // Kazakhstani Tenge
      "KZT": [ "KZT", "KZT", 2, "KZT", "₸"],
      // Laotian Kip
      "LAK": [ "LAK", "LAK", 0, "LAK", "₭"],
      // Lebanese Pound
      "LBP": [ "LBP", "LBP", 0, "LBP", "L£"],
      // Sri Lankan Rupee
      "LKR": [ "LKR", "SLRs", 2, "SLRs", "Rs"],
      // Liberian Dollar
      "LRD": [ "LRD", "LRD", 2, "LRD", "$"],
      // Lesotho Loti
      "LSL": [ "LSL", "LSL", 2, "LSL", "LSL"],
      // Lithuanian Litas
      "LTL": [ "LTL", "LTL", 130, "LTL", "Lt"],
      // Lithuanian Talonas
      "LTT": [ "LTT", "LTT", 130, "LTT", "LTT"],
      // Luxembourgian Convertible Franc
      "LUC": [ "LUC", "LUC", 130, "LUC", "LUC"],
      // Luxembourgian Franc
      "LUF": [ "LUF", "LUF", 128, "LUF", "LUF"],
      // Luxembourg Financial Franc
      "LUL": [ "LUL", "LUL", 130, "LUL", "LUL"],
      // Latvian Lats
      "LVL": [ "LVL", "LVL", 130, "LVL", "Ls"],
      // Latvian Ruble
      "LVR": [ "LVR", "LVR", 130, "LVR", "LVR"],
      // Libyan Dinar
      "LYD": [ "LYD", "LYD", 3, "LYD", "din"],
      // Moroccan Dirham
      "MAD": [ "MAD", "MAD", 2, "MAD", "MAD"],
      // Moroccan Franc
      "MAF": [ "MAF", "MAF", 130, "MAF", "MAF"],
      // Monegasque Franc
      "MCF": [ "MCF", "MCF", 130, "MCF", "MCF"],
      // Moldovan Cupon
      "MDC": [ "MDC", "MDC", 130, "MDC", "MDC"],
      // Moldovan Leu
      "MDL": [ "MDL", "MDL", 2, "MDL", "MDL"],
      // Malagasy Ariary
      "MGA": [ "MGA", "MGA", 0, "MGA", "Ar"],
      // Malagasy Franc
      "MGF": [ "MGF", "MGF", 128, "MGF", "MGF"],
      // Macedonian Denar
      "MKD": [ "MKD", "MKD", 2, "MKD", "din"],
      // Macedonian Denar (1992–1993)
      "MKN": [ "MKN", "MKN", 130, "MKN", "MKN"],
      // Malian Franc
      "MLF": [ "MLF", "MLF", 130, "MLF", "MLF"],
      // Myanmar Kyat
      "MMK": [ "MMK", "MMK", 0, "MMK", "K"],
      // Mongolian Tugrik
      "MNT": [ "MNT", "MN₮", 2, "MN₮", "₮"],
      // Macanese Pataca
      "MOP": [ "MOP", "MOP", 2, "MOP", "MOP"],
      // Mauritanian Ouguiya (1973–2017)
      "MRO": [ "MRO", "MRO", 128, "MRO", "MRO"],
      // Mauritanian Ouguiya
      "MRU": [ "MRU", "MRU", 2, "MRU", "MRU"],
      // Maltese Lira
      "MTL": [ "MTL", "MTL", 130, "MTL", "MTL"],
      // Maltese Pound
      "MTP": [ "MTP", "MTP", 130, "MTP", "MTP"],
      // Mauritian Rupee
      "MUR": [ "MUR", "MUR", 2, "MUR", "Rs"],
      // Maldivian Rupee (1947–1981)
      "MVP": [ "MVP", "MVP", 130, "MVP", "MVP"],
      // Maldivian Rufiyaa
      "MVR": [ "MVR", "MVR", 2, "MVR", "MVR"],
      // Malawian Kwacha
      "MWK": [ "MWK", "MWK", 2, "MWK", "MWK"],
      // Mexican Peso
      "MXN": [ "MXN", "MX$", 2, "Mex$", "$"],
      // Mexican Silver Peso (1861–1992)
      "MXP": [ "MXP", "MXP", 130, "MXP", "MXP"],
      // Mexican Investment Unit
      "MXV": [ "MXV", "MXV", 130, "MXV", "MXV"],
      // Malaysian Ringgit
      "MYR": [ "MYR", "RM", 2, "RM", "RM"],
      // Mozambican Escudo
      "MZE": [ "MZE", "MZE", 130, "MZE", "MZE"],
      // Mozambican Metical (1980–2006)
      "MZM": [ "MZM", "MZM", 130, "MZM", "MZM"],
      // Mozambican Metical
      "MZN": [ "MZN", "MZN", 2, "MZN", "MTn"],
      // Namibian Dollar
      "NAD": [ "NAD", "NAD", 2, "NAD", "$"],
      // Nigerian Naira
      "NGN": [ "NGN", "NGN", 2, "NGN", "₦"],
      // Nicaraguan Córdoba (1988–1991)
      "NIC": [ "NIC", "NIC", 130, "NIC", "NIC"],
      // Nicaraguan Córdoba
      "NIO": [ "NIO", "NIO", 2, "NIO", "C$"],
      // Dutch Guilder
      "NLG": [ "NLG", "NLG", 130, "NLG", "NLG"],
      // Norwegian Krone
      "NOK": [ "NOK", "NOkr", 2, "NOkr", "kr"],
      // Nepalese Rupee
      "NPR": [ "NPR", "NPR", 2, "NPR", "Rs"],
      // New Zealand Dollar
      "NZD": [ "NZD", "NZ$", 2, "NZ$", "$"],
      // Omani Rial
      "OMR": [ "OMR", "OMR", 3, "OMR", "Rial"],
      // Panamanian Balboa
      "PAB": [ "PAB", "B/.", 2, "B/.", "B/."],
      // Peruvian Inti
      "PEI": [ "PEI", "PEI", 130, "PEI", "PEI"],
      // Peruvian Sol
      "PEN": [ "PEN", "S/.", 2, "S/.", "S/."],
      // Peruvian Sol (1863–1965)
      "PES": [ "PES", "PES", 130, "PES", "PES"],
      // Papua New Guinean Kina
      "PGK": [ "PGK", "PGK", 2, "PGK", "PGK"],
      // Philippine Piso
      "PHP": [ "PHP", "PHP", 2, "PHP", "₱"],
      // Pakistani Rupee
      "PKR": [ "PKR", "PKRs.", 2, "PKRs.", "Rs"],
      // Polish Zloty
      "PLN": [ "PLN", "PLN", 2, "PLN", "zł"],
      // Polish Zloty (1950–1995)
      "PLZ": [ "PLZ", "PLZ", 130, "PLZ", "PLZ"],
      // Portuguese Escudo
      "PTE": [ "PTE", "PTE", 130, "PTE", "PTE"],
      // Paraguayan Guarani
      "PYG": [ "PYG", "PYG", 0, "PYG", "Gs"],
      // Qatari Rial
      "QAR": [ "QAR", "QAR", 2, "QAR", "Rial"],
      // Rhodesian Dollar
      "RHD": [ "RHD", "RHD", 130, "RHD", "RHD"],
      // Romanian Leu (1952–2006)
      "ROL": [ "ROL", "ROL", 130, "ROL", "ROL"],
      // Romanian Leu
      "RON": [ "RON", "RON", 2, "RON", "RON"],
      // Serbian Dinar
      "RSD": [ "RSD", "RSD", 0, "RSD", "din"],
      // Russian Ruble
      "RUB": [ "RUB", "руб.", 2, "руб.", "руб."],
      // Russian Ruble (1991–1998)
      "RUR": [ "RUR", "RUR", 130, "RUR", "RUR"],
      // Rwandan Franc
      "RWF": [ "RWF", "RWF", 0, "RWF", "RF"],
      // Saudi Riyal
      "SAR": [ "SAR", "SR", 2, "SR", "Rial"],
      // Solomon Islands Dollar
      "SBD": [ "SBD", "SBD", 2, "SBD", "$"],
      // Seychellois Rupee
      "SCR": [ "SCR", "SCR", 2, "SCR", "SCR"],
      // Sudanese Dinar (1992–2007)
      "SDD": [ "SDD", "SDD", 130, "SDD", "SDD"],
      // Sudanese Pound
      "SDG": [ "SDG", "SDG", 2, "SDG", "SDG"],
      // Sudanese Pound (1957–1998)
      "SDP": [ "SDP", "SDP", 130, "SDP", "SDP"],
      // Swedish Krona
      "SEK": [ "SEK", "kr", 2, "kr", "kr"],
      // Singapore Dollar
      "SGD": [ "SGD", "S$", 2, "S$", "$"],
      // St. Helena Pound
      "SHP": [ "SHP", "SHP", 2, "SHP", "£"],
      // Slovenian Tolar
      "SIT": [ "SIT", "SIT", 130, "SIT", "SIT"],
      // Slovak Koruna
      "SKK": [ "SKK", "SKK", 130, "SKK", "SKK"],
      // Sierra Leonean Leone
      "SLL": [ "SLL", "SLL", 0, "SLL", "SLL"],
      // Somali Shilling
      "SOS": [ "SOS", "SOS", 0, "SOS", "SOS"],
      // Surinamese Dollar
      "SRD": [ "SRD", "SRD", 2, "SRD", "$"],
      // Surinamese Guilder
      "SRG": [ "SRG", "SRG", 130, "SRG", "SRG"],
      // South Sudanese Pound
      "SSP": [ "SSP", "SSP", 2, "SSP", "SSP"],
      // São Tomé & Príncipe Dobra (1977–2017)
      "STD": [ "STD", "STD", 128, "STD", "Db"],
      // São Tomé & Príncipe Dobra
      "STN": [ "STN", "STN", 2, "STN", "STN"],
      // Soviet Rouble
      "SUR": [ "SUR", "SUR", 130, "SUR", "SUR"],
      // Salvadoran Colón
      "SVC": [ "SVC", "SVC", 130, "SVC", "SVC"],
      // Syrian Pound
      "SYP": [ "SYP", "SYP", 0, "SYP", "£"],
      // Swazi Lilangeni
      "SZL": [ "SZL", "SZL", 2, "SZL", "SZL"],
      // Thai Baht
      "THB": [ "THB", "THB", 2, "THB", "฿"],
      // Tajikistani Ruble
      "TJR": [ "TJR", "TJR", 130, "TJR", "TJR"],
      // Tajikistani Somoni
      "TJS": [ "TJS", "TJS", 2, "TJS", "Som"],
      // Turkmenistani Manat (1993–2009)
      "TMM": [ "TMM", "TMM", 128, "TMM", "TMM"],
      // Turkmenistani Manat
      "TMT": [ "TMT", "TMT", 2, "TMT", "TMT"],
      // Tunisian Dinar
      "TND": [ "TND", "TND", 3, "TND", "din"],
      // Tongan Paʻanga
      "TOP": [ "TOP", "TOP", 2, "TOP", "T$"],
      // Timorese Escudo
      "TPE": [ "TPE", "TPE", 130, "TPE", "TPE"],
      // Turkish Lira (1922–2005)
      "TRL": [ "TRL", "TRL", 128, "TRL", "TRL"],
      // Turkish Lira
      "TRY": [ "TRY", "TL", 2, "YTL", "TL"],
      // Trinidad & Tobago Dollar
      "TTD": [ "TTD", "TTD", 2, "TTD", "$"],
      // New Taiwan Dollar
      "TWD": [ "TWD", "NT$", 2, "NT$", "NT$"],
      // Tanzanian Shilling
      "TZS": [ "TZS", "TZS", 2, "TZS", "TSh"],
      // Ukrainian Hryvnia
      "UAH": [ "UAH", "UAH", 2, "UAH", "₴"],
      // Ukrainian Karbovanets
      "UAK": [ "UAK", "UAK", 130, "UAK", "UAK"],
      // Ugandan Shilling (1966–1987)
      "UGS": [ "UGS", "UGS", 130, "UGS", "UGS"],
      // Ugandan Shilling
      "UGX": [ "UGX", "UGX", 0, "UGX", "UGX"],
      // US Dollar
      "USD": [ "USD", "$", 2, "US$", "$"],
      // US Dollar (Next day)
      "USN": [ "USN", "USN", 130, "USN", "USN"],
      // US Dollar (Same day)
      "USS": [ "USS", "USS", 130, "USS", "USS"],
      // Uruguayan Peso (Indexed Units)
      "UYI": [ "UYI", "UYI", 128, "UYI", "UYI"],
      // Uruguayan Peso (1975–1993)
      "UYP": [ "UYP", "UYP", 130, "UYP", "UYP"],
      // Uruguayan Peso
      "UYU": [ "UYU", "UY$", 2, "UY$", "$"],
      // Uruguayan Nominal Wage Index Unit
      "UYW": [ "UYW", "UYW", 132, "UYW", "UYW"],
      // Uzbekistani Som
      "UZS": [ "UZS", "UZS", 2, "UZS", "soʼm"],
      // Venezuelan Bolívar (1871–2008)
      "VEB": [ "VEB", "VEB", 130, "VEB", "VEB"],
      // Venezuelan Bolívar (2008–2018)
      "VEF": [ "VEF", "VEF", 130, "VEF", "Bs"],
      // Venezuelan Bolívar
      "VES": [ "VES", "VES", 2, "VES", "VES"],
      // Vietnamese Dong
      "VND": [ "VND", "₫", 24, "₫", "₫"],
      // Vietnamese Dong (1978–1985)
      "VNN": [ "VNN", "VNN", 130, "VNN", "VNN"],
      // Vanuatu Vatu
      "VUV": [ "VUV", "VUV", 0, "VUV", "VUV"],
      // Samoan Tala
      "WST": [ "WST", "WST", 2, "WST", "WST"],
      // Central African CFA Franc
      "XAF": [ "XAF", "FCFA", 0, "FCFA", "FCFA"],
      // Silver
      "XAG": [ "XAG", "XAG", 130, "XAG", "XAG"],
      // Gold
      "XAU": [ "XAU", "XAU", 130, "XAU", "XAU"],
      // European Composite Unit
      "XBA": [ "XBA", "XBA", 130, "XBA", "XBA"],
      // European Monetary Unit
      "XBB": [ "XBB", "XBB", 130, "XBB", "XBB"],
      // European Unit of Account (XBC)
      "XBC": [ "XBC", "XBC", 130, "XBC", "XBC"],
      // European Unit of Account (XBD)
      "XBD": [ "XBD", "XBD", 130, "XBD", "XBD"],
      // East Caribbean Dollar
      "XCD": [ "XCD", "EC$", 2, "EC$", "$"],
      // Special Drawing Rights
      "XDR": [ "XDR", "XDR", 130, "XDR", "XDR"],
      // European Currency Unit
      "XEU": [ "XEU", "XEU", 130, "XEU", "XEU"],
      // French Gold Franc
      "XFO": [ "XFO", "XFO", 130, "XFO", "XFO"],
      // French UIC-Franc
      "XFU": [ "XFU", "XFU", 130, "XFU", "XFU"],
      // West African CFA Franc
      "XOF": [ "XOF", "CFA", 0, "CFA", "CFA"],
      // Palladium
      "XPD": [ "XPD", "XPD", 130, "XPD", "XPD"],
      // CFP Franc
      "XPF": [ "XPF", "CFPF", 0, "CFPF", "FCFP"],
      // Platinum
      "XPT": [ "XPT", "XPT", 130, "XPT", "XPT"],
      // RINET Funds
      "XRE": [ "XRE", "XRE", 130, "XRE", "XRE"],
      // Sucre
      "XSU": [ "XSU", "XSU", 130, "XSU", "XSU"],
      // Testing Currency Code
      "XTS": [ "XTS", "XTS", 130, "XTS", "XTS"],
      // ADB Unit of Account
      "XUA": [ "XUA", "XUA", 130, "XUA", "XUA"],
      // Unknown Currency
      "XXX": [ "XXX", "¤", 130, "¤", "¤"],
      // Yemeni Dinar
      "YDD": [ "YDD", "YDD", 130, "YDD", "YDD"],
      // Yemeni Rial
      "YER": [ "YER", "YER", 0, "YER", "Rial"],
      // Yugoslavian Hard Dinar (1966–1990)
      "YUD": [ "YUD", "YUD", 130, "YUD", "YUD"],
      // Yugoslavian New Dinar (1994–2002)
      "YUM": [ "YUM", "YUM", 130, "YUM", "YUM"],
      // Yugoslavian Convertible Dinar (1990–1992)
      "YUN": [ "YUN", "YUN", 130, "YUN", "YUN"],
      // Yugoslavian Reformed Dinar (1992–1993)
      "YUR": [ "YUR", "YUR", 130, "YUR", "YUR"],
      // South African Rand (financial)
      "ZAL": [ "ZAL", "ZAL", 130, "ZAL", "ZAL"],
      // South African Rand
      "ZAR": [ "ZAR", "ZAR", 2, "ZAR", "R"],
      // Zambian Kwacha (1968–2012)
      "ZMK": [ "ZMK", "ZMK", 128, "ZMK", "ZWK"],
      // Zambian Kwacha
      "ZMW": [ "ZMW", "ZMW", 2, "ZMW", "ZMW"],
      // Zairean New Zaire (1993–1998)
      "ZRN": [ "ZRN", "ZRN", 130, "ZRN", "ZRN"],
      // Zairean Zaire (1971–1993)
      "ZRZ": [ "ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"],
      // Zimbabwean Dollar (1980–2008)
      "ZWD": [ "ZWD", "ZWD", 128, "ZWD", "ZWD"],
      // Zimbabwean Dollar (2009)
      "ZWL": [ "ZWL", "ZWL", 130, "ZWL", "ZWL"],
      // Zimbabwean Dollar (2008)
      "ZWR": [ "ZWR", "ZWR", 130, "ZWR", "ZWR"],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("ADP", "Andorran Peseta");
    result.put("AED", "United Arab Emirates Dirham");
    result.put("AFA", "Afghan Afghani (1927–2002)");
    result.put("AFN", "Afghan Afghani");
    result.put("ALK", "Albanian Lek (1946–1965)");
    result.put("ALL", "Albanian Lek");
    result.put("AMD", "Armenian Dram");
    result.put("ANG", "Netherlands Antillean Guilder");
    result.put("AOA", "Angolan Kwanza");
    result.put("AOK", "Angolan Kwanza (1977–1991)");
    result.put("AON", "Angolan New Kwanza (1990–2000)");
    result.put("AOR", "Angolan Readjusted Kwanza (1995–1999)");
    result.put("ARA", "Argentine Austral");
    result.put("ARL", "Argentine Peso Ley (1970–1983)");
    result.put("ARM", "Argentine Peso (1881–1970)");
    result.put("ARP", "Argentine Peso (1983–1985)");
    result.put("ARS", "Argentine Peso");
    result.put("ATS", "Austrian Schilling");
    result.put("AUD", "Australian Dollar");
    result.put("AWG", "Aruban Florin");
    result.put("AZM", "Azerbaijani Manat (1993–2006)");
    result.put("AZN", "Azerbaijani Manat");
    result.put("BAD", "Bosnia-Herzegovina Dinar (1992–1994)");
    result.put("BAM", "Bosnia-Herzegovina Convertible Mark");
    result.put("BAN", "Bosnia-Herzegovina New Dinar (1994–1997)");
    result.put("BBD", "Barbadian Dollar");
    result.put("BDT", "Bangladeshi Taka");
    result.put("BEC", "Belgian Franc (convertible)");
    result.put("BEF", "Belgian Franc");
    result.put("BEL", "Belgian Franc (financial)");
    result.put("BGL", "Bulgarian Hard Lev");
    result.put("BGM", "Bulgarian Socialist Lev");
    result.put("BGN", "Bulgarian Lev");
    result.put("BGO", "Bulgarian Lev (1879–1952)");
    result.put("BHD", "Bahraini Dinar");
    result.put("BIF", "Burundian Franc");
    result.put("BMD", "Bermudan Dollar");
    result.put("BND", "Brunei Dollar");
    result.put("BOB", "Bolivian Boliviano");
    result.put("BOL", "Bolivian Boliviano (1863–1963)");
    result.put("BOP", "Bolivian Peso");
    result.put("BOV", "Bolivian Mvdol");
    result.put("BRB", "Brazilian New Cruzeiro (1967–1986)");
    result.put("BRC", "Brazilian Cruzado (1986–1989)");
    result.put("BRE", "Brazilian Cruzeiro (1990–1993)");
    result.put("BRL", "Brazilian Real");
    result.put("BRN", "Brazilian New Cruzado (1989–1990)");
    result.put("BRR", "Brazilian Cruzeiro (1993–1994)");
    result.put("BRZ", "Brazilian Cruzeiro (1942–1967)");
    result.put("BSD", "Bahamian Dollar");
    result.put("BTN", "Bhutanese Ngultrum");
    result.put("BUK", "Burmese Kyat");
    result.put("BWP", "Botswanan Pula");
    result.put("BYB", "Belarusian Ruble (1994–1999)");
    result.put("BYN", "Belarusian Ruble");
    result.put("BYR", "Belarusian Ruble (2000–2016)");
    result.put("BZD", "Belize Dollar");
    result.put("CAD", "Canadian Dollar");
    result.put("CDF", "Congolese Franc");
    result.put("CHE", "WIR Euro");
    result.put("CHF", "Swiss Franc");
    result.put("CHW", "WIR Franc");
    result.put("CLE", "Chilean Escudo");
    result.put("CLF", "Chilean Unit of Account (UF)");
    result.put("CLP", "Chilean Peso");
    result.put("CNH", "Chinese Yuan (offshore)");
    result.put("CNX", "Chinese People’s Bank Dollar");
    result.put("CNY", "Chinese Yuan");
    result.put("COP", "Colombian Peso");
    result.put("COU", "Colombian Real Value Unit");
    result.put("CRC", "Costa Rican Colón");
    result.put("CSD", "Serbian Dinar (2002–2006)");
    result.put("CSK", "Czechoslovak Hard Koruna");
    result.put("CUC", "Cuban Convertible Peso");
    result.put("CUP", "Cuban Peso");
    result.put("CVE", "Cape Verdean Escudo");
    result.put("CYP", "Cypriot Pound");
    result.put("CZK", "Czech Koruna");
    result.put("DDM", "East German Mark");
    result.put("DEM", "German Mark");
    result.put("DJF", "Djiboutian Franc");
    result.put("DKK", "Danish Krone");
    result.put("DOP", "Dominican Peso");
    result.put("DZD", "Algerian Dinar");
    result.put("ECS", "Ecuadorian Sucre");
    result.put("ECV", "Ecuadorian Unit of Constant Value");
    result.put("EEK", "Estonian Kroon");
    result.put("EGP", "Egyptian Pound");
    result.put("ERN", "Eritrean Nakfa");
    result.put("ESA", "Spanish Peseta (A account)");
    result.put("ESB", "Spanish Peseta (convertible account)");
    result.put("ESP", "Spanish Peseta");
    result.put("ETB", "Ethiopian Birr");
    result.put("EUR", "Euro");
    result.put("FIM", "Finnish Markka");
    result.put("FJD", "Fijian Dollar");
    result.put("FKP", "Falkland Islands Pound");
    result.put("FRF", "French Franc");
    result.put("GBP", "British Pound");
    result.put("GEK", "Georgian Kupon Larit");
    result.put("GEL", "Georgian Lari");
    result.put("GHC", "Ghanaian Cedi (1979–2007)");
    result.put("GHS", "Ghanaian Cedi");
    result.put("GIP", "Gibraltar Pound");
    result.put("GMD", "Gambian Dalasi");
    result.put("GNF", "Guinean Franc");
    result.put("GNS", "Guinean Syli");
    result.put("GQE", "Equatorial Guinean Ekwele");
    result.put("GRD", "Greek Drachma");
    result.put("GTQ", "Guatemalan Quetzal");
    result.put("GWE", "Portuguese Guinea Escudo");
    result.put("GWP", "Guinea-Bissau Peso");
    result.put("GYD", "Guyanaese Dollar");
    result.put("HKD", "Hong Kong Dollar");
    result.put("HNL", "Honduran Lempira");
    result.put("HRD", "Croatian Dinar");
    result.put("HRK", "Croatian Kuna");
    result.put("HTG", "Haitian Gourde");
    result.put("HUF", "Hungarian Forint");
    result.put("IDR", "Indonesian Rupiah");
    result.put("IEP", "Irish Pound");
    result.put("ILP", "Israeli Pound");
    result.put("ILR", "Israeli Shekel (1980–1985)");
    result.put("ILS", "Israeli New Shekel");
    result.put("INR", "Indian Rupee");
    result.put("IQD", "Iraqi Dinar");
    result.put("IRR", "Iranian Rial");
    result.put("ISJ", "Icelandic Króna (1918–1981)");
    result.put("ISK", "Icelandic Króna");
    result.put("ITL", "Italian Lira");
    result.put("JMD", "Jamaican Dollar");
    result.put("JOD", "Jordanian Dinar");
    result.put("JPY", "Japanese Yen");
    result.put("KES", "Kenyan Shilling");
    result.put("KGS", "Kyrgystani Som");
    result.put("KHR", "Cambodian Riel");
    result.put("KMF", "Comorian Franc");
    result.put("KPW", "North Korean Won");
    result.put("KRH", "South Korean Hwan (1953–1962)");
    result.put("KRO", "South Korean Won (1945–1953)");
    result.put("KRW", "South Korean Won");
    result.put("KWD", "Kuwaiti Dinar");
    result.put("KYD", "Cayman Islands Dollar");
    result.put("KZT", "Kazakhstani Tenge");
    result.put("LAK", "Laotian Kip");
    result.put("LBP", "Lebanese Pound");
    result.put("LKR", "Sri Lankan Rupee");
    result.put("LRD", "Liberian Dollar");
    result.put("LSL", "Lesotho Loti");
    result.put("LTL", "Lithuanian Litas");
    result.put("LTT", "Lithuanian Talonas");
    result.put("LUC", "Luxembourgian Convertible Franc");
    result.put("LUF", "Luxembourgian Franc");
    result.put("LUL", "Luxembourg Financial Franc");
    result.put("LVL", "Latvian Lats");
    result.put("LVR", "Latvian Ruble");
    result.put("LYD", "Libyan Dinar");
    result.put("MAD", "Moroccan Dirham");
    result.put("MAF", "Moroccan Franc");
    result.put("MCF", "Monegasque Franc");
    result.put("MDC", "Moldovan Cupon");
    result.put("MDL", "Moldovan Leu");
    result.put("MGA", "Malagasy Ariary");
    result.put("MGF", "Malagasy Franc");
    result.put("MKD", "Macedonian Denar");
    result.put("MKN", "Macedonian Denar (1992–1993)");
    result.put("MLF", "Malian Franc");
    result.put("MMK", "Myanmar Kyat");
    result.put("MNT", "Mongolian Tugrik");
    result.put("MOP", "Macanese Pataca");
    result.put("MRO", "Mauritanian Ouguiya (1973–2017)");
    result.put("MRU", "Mauritanian Ouguiya");
    result.put("MTL", "Maltese Lira");
    result.put("MTP", "Maltese Pound");
    result.put("MUR", "Mauritian Rupee");
    result.put("MVP", "Maldivian Rupee (1947–1981)");
    result.put("MVR", "Maldivian Rufiyaa");
    result.put("MWK", "Malawian Kwacha");
    result.put("MXN", "Mexican Peso");
    result.put("MXP", "Mexican Silver Peso (1861–1992)");
    result.put("MXV", "Mexican Investment Unit");
    result.put("MYR", "Malaysian Ringgit");
    result.put("MZE", "Mozambican Escudo");
    result.put("MZM", "Mozambican Metical (1980–2006)");
    result.put("MZN", "Mozambican Metical");
    result.put("NAD", "Namibian Dollar");
    result.put("NGN", "Nigerian Naira");
    result.put("NIC", "Nicaraguan Córdoba (1988–1991)");
    result.put("NIO", "Nicaraguan Córdoba");
    result.put("NLG", "Dutch Guilder");
    result.put("NOK", "Norwegian Krone");
    result.put("NPR", "Nepalese Rupee");
    result.put("NZD", "New Zealand Dollar");
    result.put("OMR", "Omani Rial");
    result.put("PAB", "Panamanian Balboa");
    result.put("PEI", "Peruvian Inti");
    result.put("PEN", "Peruvian Sol");
    result.put("PES", "Peruvian Sol (1863–1965)");
    result.put("PGK", "Papua New Guinean Kina");
    result.put("PHP", "Philippine Piso");
    result.put("PKR", "Pakistani Rupee");
    result.put("PLN", "Polish Zloty");
    result.put("PLZ", "Polish Zloty (1950–1995)");
    result.put("PTE", "Portuguese Escudo");
    result.put("PYG", "Paraguayan Guarani");
    result.put("QAR", "Qatari Rial");
    result.put("RHD", "Rhodesian Dollar");
    result.put("ROL", "Romanian Leu (1952–2006)");
    result.put("RON", "Romanian Leu");
    result.put("RSD", "Serbian Dinar");
    result.put("RUB", "Russian Ruble");
    result.put("RUR", "Russian Ruble (1991–1998)");
    result.put("RWF", "Rwandan Franc");
    result.put("SAR", "Saudi Riyal");
    result.put("SBD", "Solomon Islands Dollar");
    result.put("SCR", "Seychellois Rupee");
    result.put("SDD", "Sudanese Dinar (1992–2007)");
    result.put("SDG", "Sudanese Pound");
    result.put("SDP", "Sudanese Pound (1957–1998)");
    result.put("SEK", "Swedish Krona");
    result.put("SGD", "Singapore Dollar");
    result.put("SHP", "St. Helena Pound");
    result.put("SIT", "Slovenian Tolar");
    result.put("SKK", "Slovak Koruna");
    result.put("SLL", "Sierra Leonean Leone");
    result.put("SOS", "Somali Shilling");
    result.put("SRD", "Surinamese Dollar");
    result.put("SRG", "Surinamese Guilder");
    result.put("SSP", "South Sudanese Pound");
    result.put("STD", "São Tomé & Príncipe Dobra (1977–2017)");
    result.put("STN", "São Tomé & Príncipe Dobra");
    result.put("SUR", "Soviet Rouble");
    result.put("SVC", "Salvadoran Colón");
    result.put("SYP", "Syrian Pound");
    result.put("SZL", "Swazi Lilangeni");
    result.put("THB", "Thai Baht");
    result.put("TJR", "Tajikistani Ruble");
    result.put("TJS", "Tajikistani Somoni");
    result.put("TMM", "Turkmenistani Manat (1993–2009)");
    result.put("TMT", "Turkmenistani Manat");
    result.put("TND", "Tunisian Dinar");
    result.put("TOP", "Tongan Paʻanga");
    result.put("TPE", "Timorese Escudo");
    result.put("TRL", "Turkish Lira (1922–2005)");
    result.put("TRY", "Turkish Lira");
    result.put("TTD", "Trinidad & Tobago Dollar");
    result.put("TWD", "New Taiwan Dollar");
    result.put("TZS", "Tanzanian Shilling");
    result.put("UAH", "Ukrainian Hryvnia");
    result.put("UAK", "Ukrainian Karbovanets");
    result.put("UGS", "Ugandan Shilling (1966–1987)");
    result.put("UGX", "Ugandan Shilling");
    result.put("USD", "US Dollar");
    result.put("USN", "US Dollar (Next day)");
    result.put("USS", "US Dollar (Same day)");
    result.put("UYI", "Uruguayan Peso (Indexed Units)");
    result.put("UYP", "Uruguayan Peso (1975–1993)");
    result.put("UYU", "Uruguayan Peso");
    result.put("UYW", "Uruguayan Nominal Wage Index Unit");
    result.put("UZS", "Uzbekistani Som");
    result.put("VEB", "Venezuelan Bolívar (1871–2008)");
    result.put("VEF", "Venezuelan Bolívar (2008–2018)");
    result.put("VES", "Venezuelan Bolívar");
    result.put("VND", "Vietnamese Dong");
    result.put("VNN", "Vietnamese Dong (1978–1985)");
    result.put("VUV", "Vanuatu Vatu");
    result.put("WST", "Samoan Tala");
    result.put("XAF", "Central African CFA Franc");
    result.put("XAG", "Silver");
    result.put("XAU", "Gold");
    result.put("XBA", "European Composite Unit");
    result.put("XBB", "European Monetary Unit");
    result.put("XBC", "European Unit of Account (XBC)");
    result.put("XBD", "European Unit of Account (XBD)");
    result.put("XCD", "East Caribbean Dollar");
    result.put("XDR", "Special Drawing Rights");
    result.put("XEU", "European Currency Unit");
    result.put("XFO", "French Gold Franc");
    result.put("XFU", "French UIC-Franc");
    result.put("XOF", "West African CFA Franc");
    result.put("XPD", "Palladium");
    result.put("XPF", "CFP Franc");
    result.put("XPT", "Platinum");
    result.put("XRE", "RINET Funds");
    result.put("XSU", "Sucre");
    result.put("XTS", "Testing Currency Code");
    result.put("XUA", "ADB Unit of Account");
    result.put("XXX", "Unknown Currency");
    result.put("YDD", "Yemeni Dinar");
    result.put("YER", "Yemeni Rial");
    result.put("YUD", "Yugoslavian Hard Dinar (1966–1990)");
    result.put("YUM", "Yugoslavian New Dinar (1994–2002)");
    result.put("YUN", "Yugoslavian Convertible Dinar (1990–1992)");
    result.put("YUR", "Yugoslavian Reformed Dinar (1992–1993)");
    result.put("ZAL", "South African Rand (financial)");
    result.put("ZAR", "South African Rand");
    result.put("ZMK", "Zambian Kwacha (1968–2012)");
    result.put("ZMW", "Zambian Kwacha");
    result.put("ZRN", "Zairean New Zaire (1993–1998)");
    result.put("ZRZ", "Zairean Zaire (1971–1993)");
    result.put("ZWD", "Zimbabwean Dollar (1980–2008)");
    result.put("ZWL", "Zimbabwean Dollar (2009)");
    result.put("ZWR", "Zimbabwean Dollar (2008)");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "ADP": "Andorran Peseta",
      "AED": "United Arab Emirates Dirham",
      "AFA": "Afghan Afghani (1927–2002)",
      "AFN": "Afghan Afghani",
      "ALK": "Albanian Lek (1946–1965)",
      "ALL": "Albanian Lek",
      "AMD": "Armenian Dram",
      "ANG": "Netherlands Antillean Guilder",
      "AOA": "Angolan Kwanza",
      "AOK": "Angolan Kwanza (1977–1991)",
      "AON": "Angolan New Kwanza (1990–2000)",
      "AOR": "Angolan Readjusted Kwanza (1995–1999)",
      "ARA": "Argentine Austral",
      "ARL": "Argentine Peso Ley (1970–1983)",
      "ARM": "Argentine Peso (1881–1970)",
      "ARP": "Argentine Peso (1983–1985)",
      "ARS": "Argentine Peso",
      "ATS": "Austrian Schilling",
      "AUD": "Australian Dollar",
      "AWG": "Aruban Florin",
      "AZM": "Azerbaijani Manat (1993–2006)",
      "AZN": "Azerbaijani Manat",
      "BAD": "Bosnia-Herzegovina Dinar (1992–1994)",
      "BAM": "Bosnia-Herzegovina Convertible Mark",
      "BAN": "Bosnia-Herzegovina New Dinar (1994–1997)",
      "BBD": "Barbadian Dollar",
      "BDT": "Bangladeshi Taka",
      "BEC": "Belgian Franc (convertible)",
      "BEF": "Belgian Franc",
      "BEL": "Belgian Franc (financial)",
      "BGL": "Bulgarian Hard Lev",
      "BGM": "Bulgarian Socialist Lev",
      "BGN": "Bulgarian Lev",
      "BGO": "Bulgarian Lev (1879–1952)",
      "BHD": "Bahraini Dinar",
      "BIF": "Burundian Franc",
      "BMD": "Bermudan Dollar",
      "BND": "Brunei Dollar",
      "BOB": "Bolivian Boliviano",
      "BOL": "Bolivian Boliviano (1863–1963)",
      "BOP": "Bolivian Peso",
      "BOV": "Bolivian Mvdol",
      "BRB": "Brazilian New Cruzeiro (1967–1986)",
      "BRC": "Brazilian Cruzado (1986–1989)",
      "BRE": "Brazilian Cruzeiro (1990–1993)",
      "BRL": "Brazilian Real",
      "BRN": "Brazilian New Cruzado (1989–1990)",
      "BRR": "Brazilian Cruzeiro (1993–1994)",
      "BRZ": "Brazilian Cruzeiro (1942–1967)",
      "BSD": "Bahamian Dollar",
      "BTN": "Bhutanese Ngultrum",
      "BUK": "Burmese Kyat",
      "BWP": "Botswanan Pula",
      "BYB": "Belarusian Ruble (1994–1999)",
      "BYN": "Belarusian Ruble",
      "BYR": "Belarusian Ruble (2000–2016)",
      "BZD": "Belize Dollar",
      "CAD": "Canadian Dollar",
      "CDF": "Congolese Franc",
      "CHE": "WIR Euro",
      "CHF": "Swiss Franc",
      "CHW": "WIR Franc",
      "CLE": "Chilean Escudo",
      "CLF": "Chilean Unit of Account (UF)",
      "CLP": "Chilean Peso",
      "CNH": "Chinese Yuan (offshore)",
      "CNX": "Chinese People’s Bank Dollar",
      "CNY": "Chinese Yuan",
      "COP": "Colombian Peso",
      "COU": "Colombian Real Value Unit",
      "CRC": "Costa Rican Colón",
      "CSD": "Serbian Dinar (2002–2006)",
      "CSK": "Czechoslovak Hard Koruna",
      "CUC": "Cuban Convertible Peso",
      "CUP": "Cuban Peso",
      "CVE": "Cape Verdean Escudo",
      "CYP": "Cypriot Pound",
      "CZK": "Czech Koruna",
      "DDM": "East German Mark",
      "DEM": "German Mark",
      "DJF": "Djiboutian Franc",
      "DKK": "Danish Krone",
      "DOP": "Dominican Peso",
      "DZD": "Algerian Dinar",
      "ECS": "Ecuadorian Sucre",
      "ECV": "Ecuadorian Unit of Constant Value",
      "EEK": "Estonian Kroon",
      "EGP": "Egyptian Pound",
      "ERN": "Eritrean Nakfa",
      "ESA": "Spanish Peseta (A account)",
      "ESB": "Spanish Peseta (convertible account)",
      "ESP": "Spanish Peseta",
      "ETB": "Ethiopian Birr",
      "EUR": "Euro",
      "FIM": "Finnish Markka",
      "FJD": "Fijian Dollar",
      "FKP": "Falkland Islands Pound",
      "FRF": "French Franc",
      "GBP": "British Pound",
      "GEK": "Georgian Kupon Larit",
      "GEL": "Georgian Lari",
      "GHC": "Ghanaian Cedi (1979–2007)",
      "GHS": "Ghanaian Cedi",
      "GIP": "Gibraltar Pound",
      "GMD": "Gambian Dalasi",
      "GNF": "Guinean Franc",
      "GNS": "Guinean Syli",
      "GQE": "Equatorial Guinean Ekwele",
      "GRD": "Greek Drachma",
      "GTQ": "Guatemalan Quetzal",
      "GWE": "Portuguese Guinea Escudo",
      "GWP": "Guinea-Bissau Peso",
      "GYD": "Guyanaese Dollar",
      "HKD": "Hong Kong Dollar",
      "HNL": "Honduran Lempira",
      "HRD": "Croatian Dinar",
      "HRK": "Croatian Kuna",
      "HTG": "Haitian Gourde",
      "HUF": "Hungarian Forint",
      "IDR": "Indonesian Rupiah",
      "IEP": "Irish Pound",
      "ILP": "Israeli Pound",
      "ILR": "Israeli Shekel (1980–1985)",
      "ILS": "Israeli New Shekel",
      "INR": "Indian Rupee",
      "IQD": "Iraqi Dinar",
      "IRR": "Iranian Rial",
      "ISJ": "Icelandic Króna (1918–1981)",
      "ISK": "Icelandic Króna",
      "ITL": "Italian Lira",
      "JMD": "Jamaican Dollar",
      "JOD": "Jordanian Dinar",
      "JPY": "Japanese Yen",
      "KES": "Kenyan Shilling",
      "KGS": "Kyrgystani Som",
      "KHR": "Cambodian Riel",
      "KMF": "Comorian Franc",
      "KPW": "North Korean Won",
      "KRH": "South Korean Hwan (1953–1962)",
      "KRO": "South Korean Won (1945–1953)",
      "KRW": "South Korean Won",
      "KWD": "Kuwaiti Dinar",
      "KYD": "Cayman Islands Dollar",
      "KZT": "Kazakhstani Tenge",
      "LAK": "Laotian Kip",
      "LBP": "Lebanese Pound",
      "LKR": "Sri Lankan Rupee",
      "LRD": "Liberian Dollar",
      "LSL": "Lesotho Loti",
      "LTL": "Lithuanian Litas",
      "LTT": "Lithuanian Talonas",
      "LUC": "Luxembourgian Convertible Franc",
      "LUF": "Luxembourgian Franc",
      "LUL": "Luxembourg Financial Franc",
      "LVL": "Latvian Lats",
      "LVR": "Latvian Ruble",
      "LYD": "Libyan Dinar",
      "MAD": "Moroccan Dirham",
      "MAF": "Moroccan Franc",
      "MCF": "Monegasque Franc",
      "MDC": "Moldovan Cupon",
      "MDL": "Moldovan Leu",
      "MGA": "Malagasy Ariary",
      "MGF": "Malagasy Franc",
      "MKD": "Macedonian Denar",
      "MKN": "Macedonian Denar (1992–1993)",
      "MLF": "Malian Franc",
      "MMK": "Myanmar Kyat",
      "MNT": "Mongolian Tugrik",
      "MOP": "Macanese Pataca",
      "MRO": "Mauritanian Ouguiya (1973–2017)",
      "MRU": "Mauritanian Ouguiya",
      "MTL": "Maltese Lira",
      "MTP": "Maltese Pound",
      "MUR": "Mauritian Rupee",
      "MVP": "Maldivian Rupee (1947–1981)",
      "MVR": "Maldivian Rufiyaa",
      "MWK": "Malawian Kwacha",
      "MXN": "Mexican Peso",
      "MXP": "Mexican Silver Peso (1861–1992)",
      "MXV": "Mexican Investment Unit",
      "MYR": "Malaysian Ringgit",
      "MZE": "Mozambican Escudo",
      "MZM": "Mozambican Metical (1980–2006)",
      "MZN": "Mozambican Metical",
      "NAD": "Namibian Dollar",
      "NGN": "Nigerian Naira",
      "NIC": "Nicaraguan Córdoba (1988–1991)",
      "NIO": "Nicaraguan Córdoba",
      "NLG": "Dutch Guilder",
      "NOK": "Norwegian Krone",
      "NPR": "Nepalese Rupee",
      "NZD": "New Zealand Dollar",
      "OMR": "Omani Rial",
      "PAB": "Panamanian Balboa",
      "PEI": "Peruvian Inti",
      "PEN": "Peruvian Sol",
      "PES": "Peruvian Sol (1863–1965)",
      "PGK": "Papua New Guinean Kina",
      "PHP": "Philippine Piso",
      "PKR": "Pakistani Rupee",
      "PLN": "Polish Zloty",
      "PLZ": "Polish Zloty (1950–1995)",
      "PTE": "Portuguese Escudo",
      "PYG": "Paraguayan Guarani",
      "QAR": "Qatari Rial",
      "RHD": "Rhodesian Dollar",
      "ROL": "Romanian Leu (1952–2006)",
      "RON": "Romanian Leu",
      "RSD": "Serbian Dinar",
      "RUB": "Russian Ruble",
      "RUR": "Russian Ruble (1991–1998)",
      "RWF": "Rwandan Franc",
      "SAR": "Saudi Riyal",
      "SBD": "Solomon Islands Dollar",
      "SCR": "Seychellois Rupee",
      "SDD": "Sudanese Dinar (1992–2007)",
      "SDG": "Sudanese Pound",
      "SDP": "Sudanese Pound (1957–1998)",
      "SEK": "Swedish Krona",
      "SGD": "Singapore Dollar",
      "SHP": "St. Helena Pound",
      "SIT": "Slovenian Tolar",
      "SKK": "Slovak Koruna",
      "SLL": "Sierra Leonean Leone",
      "SOS": "Somali Shilling",
      "SRD": "Surinamese Dollar",
      "SRG": "Surinamese Guilder",
      "SSP": "South Sudanese Pound",
      "STD": "São Tomé & Príncipe Dobra (1977–2017)",
      "STN": "São Tomé & Príncipe Dobra",
      "SUR": "Soviet Rouble",
      "SVC": "Salvadoran Colón",
      "SYP": "Syrian Pound",
      "SZL": "Swazi Lilangeni",
      "THB": "Thai Baht",
      "TJR": "Tajikistani Ruble",
      "TJS": "Tajikistani Somoni",
      "TMM": "Turkmenistani Manat (1993–2009)",
      "TMT": "Turkmenistani Manat",
      "TND": "Tunisian Dinar",
      "TOP": "Tongan Paʻanga",
      "TPE": "Timorese Escudo",
      "TRL": "Turkish Lira (1922–2005)",
      "TRY": "Turkish Lira",
      "TTD": "Trinidad & Tobago Dollar",
      "TWD": "New Taiwan Dollar",
      "TZS": "Tanzanian Shilling",
      "UAH": "Ukrainian Hryvnia",
      "UAK": "Ukrainian Karbovanets",
      "UGS": "Ugandan Shilling (1966–1987)",
      "UGX": "Ugandan Shilling",
      "USD": "US Dollar",
      "USN": "US Dollar (Next day)",
      "USS": "US Dollar (Same day)",
      "UYI": "Uruguayan Peso (Indexed Units)",
      "UYP": "Uruguayan Peso (1975–1993)",
      "UYU": "Uruguayan Peso",
      "UYW": "Uruguayan Nominal Wage Index Unit",
      "UZS": "Uzbekistani Som",
      "VEB": "Venezuelan Bolívar (1871–2008)",
      "VEF": "Venezuelan Bolívar (2008–2018)",
      "VES": "Venezuelan Bolívar",
      "VND": "Vietnamese Dong",
      "VNN": "Vietnamese Dong (1978–1985)",
      "VUV": "Vanuatu Vatu",
      "WST": "Samoan Tala",
      "XAF": "Central African CFA Franc",
      "XAG": "Silver",
      "XAU": "Gold",
      "XBA": "European Composite Unit",
      "XBB": "European Monetary Unit",
      "XBC": "European Unit of Account (XBC)",
      "XBD": "European Unit of Account (XBD)",
      "XCD": "East Caribbean Dollar",
      "XDR": "Special Drawing Rights",
      "XEU": "European Currency Unit",
      "XFO": "French Gold Franc",
      "XFU": "French UIC-Franc",
      "XOF": "West African CFA Franc",
      "XPD": "Palladium",
      "XPF": "CFP Franc",
      "XPT": "Platinum",
      "XRE": "RINET Funds",
      "XSU": "Sucre",
      "XTS": "Testing Currency Code",
      "XUA": "ADB Unit of Account",
      "XXX": "Unknown Currency",
      "YDD": "Yemeni Dinar",
      "YER": "Yemeni Rial",
      "YUD": "Yugoslavian Hard Dinar (1966–1990)",
      "YUM": "Yugoslavian New Dinar (1994–2002)",
      "YUN": "Yugoslavian Convertible Dinar (1990–1992)",
      "YUR": "Yugoslavian Reformed Dinar (1992–1993)",
      "ZAL": "South African Rand (financial)",
      "ZAR": "South African Rand",
      "ZMK": "Zambian Kwacha (1968–2012)",
      "ZMW": "Zambian Kwacha",
      "ZRN": "Zairean New Zaire (1993–1998)",
      "ZRZ": "Zairean Zaire (1971–1993)",
      "ZWD": "Zimbabwean Dollar (1980–2008)",
      "ZWL": "Zimbabwean Dollar (2009)",
      "ZWR": "Zimbabwean Dollar (2008)",
    };
  }-*/;
}
