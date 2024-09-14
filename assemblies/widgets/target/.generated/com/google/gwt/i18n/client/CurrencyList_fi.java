package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_fi extends com.google.gwt.i18n.client.CurrencyList_ {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("EUR", "€", 2, "€", "€");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "EUR", "€", 2, "€", "€"];
  }-*/;
  
  @Override
  protected HashMap<String, CurrencyData> loadCurrencyMapJava() {
    HashMap<String, CurrencyData> result = super.loadCurrencyMapJava();
    // Andorran peseta
    result.put("ADP", new CurrencyDataImpl("ADP", "ADP", 128, "ADP", "ADP"));
    // Arabiemiirikuntien dirhami
    result.put("AED", new CurrencyDataImpl("AED", "DH", 2, "DH", "dh"));
    // Afganistanin afgaani (1927–2002)
    result.put("AFA", new CurrencyDataImpl("AFA", "AFA", 130, "AFA", "AFA"));
    // Afganistanin afgaani
    result.put("AFN", new CurrencyDataImpl("AFN", "AFN", 0, "AFN", "Af."));
    // Albanian lek (1946–1965)
    result.put("ALK", new CurrencyDataImpl("ALK", "ALK", 130, "ALK", "ALK"));
    // Albanian lek
    result.put("ALL", new CurrencyDataImpl("ALL", "ALL", 0, "ALL", "Lek"));
    // Armenian dram
    result.put("AMD", new CurrencyDataImpl("AMD", "AMD", 2, "AMD", "Dram"));
    // Alankomaiden Antillien guldeni
    result.put("ANG", new CurrencyDataImpl("ANG", "ANG", 2, "ANG", "ANG"));
    // Angolan kwanza
    result.put("AOA", new CurrencyDataImpl("AOA", "AOA", 2, "AOA", "Kz"));
    // Angolan kwanza (1977–1991)
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130, "AOK", "AOK"));
    // Angolan uusi kwanza (1990–2000)
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130, "AON", "AON"));
    // Angolan kwanza reajustado (1995–1999)
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130, "AOR", "AOR"));
    // Argentiinan austral
    result.put("ARA", new CurrencyDataImpl("ARA", "ARA", 130, "ARA", "ARA"));
    // Argentiinan ley-peso (1970–1983)
    result.put("ARL", new CurrencyDataImpl("ARL", "ARL", 130, "ARL", "ARL"));
    // Argentiinan peso (1881–1970)
    result.put("ARM", new CurrencyDataImpl("ARM", "ARM", 130, "ARM", "ARM"));
    // Argentiinan peso (1983–1985)
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130, "ARP", "ARP"));
    // Argentiinan peso
    result.put("ARS", new CurrencyDataImpl("ARS", "AR$", 2, "AR$", "$"));
    // Itävallan šillinki
    result.put("ATS", new CurrencyDataImpl("ATS", "ATS", 130, "ATS", "ATS"));
    // Australian dollari
    result.put("AUD", new CurrencyDataImpl("AUD", "AU$", 2, "AU$", "$"));
    // Aruban floriini
    result.put("AWG", new CurrencyDataImpl("AWG", "AWG", 2, "AWG", "Afl."));
    // Azerbaidžanin manat (1993–2006)
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130, "AZM", "AZM"));
    // Azerbaidžanin manat
    result.put("AZN", new CurrencyDataImpl("AZN", "AZN", 2, "AZN", "man."));
    // Bosnia-Hertsegovinan dinaari (1992–1994)
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130, "BAD", "BAD"));
    // Bosnia-Hertsegovinan vaihdettava markka
    result.put("BAM", new CurrencyDataImpl("BAM", "BAM", 2, "BAM", "KM"));
    // Bosnia-Hertsegovinan uusi dinaari (1994–1997)
    result.put("BAN", new CurrencyDataImpl("BAN", "BAN", 130, "BAN", "BAN"));
    // Barbadosin dollari
    result.put("BBD", new CurrencyDataImpl("BBD", "BBD", 2, "BBD", "$"));
    // Bangladeshin taka
    result.put("BDT", new CurrencyDataImpl("BDT", "Tk", 2, "Tk", "৳"));
    // Belgian vaihdettava frangi
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 130, "BEC", "BEC"));
    // Belgian frangi
    result.put("BEF", new CurrencyDataImpl("BEF", "BEF", 130, "BEF", "BEF"));
    // Belgian rahoitusfrangi
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 130, "BEL", "BEL"));
    // Bulgarian kova lev
    result.put("BGL", new CurrencyDataImpl("BGL", "BGL", 130, "BGL", "BGL"));
    // Bulgarian sosialistinen lev
    result.put("BGM", new CurrencyDataImpl("BGM", "BGM", 130, "BGM", "BGM"));
    // Bulgarian lev
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2, "BGN", "lev"));
    // Bulgarian lev (1879–1952)
    result.put("BGO", new CurrencyDataImpl("BGO", "BGO", 130, "BGO", "BGO"));
    // Bahrainin dinaari
    result.put("BHD", new CurrencyDataImpl("BHD", "BHD", 3, "BHD", "din"));
    // Burundin frangi
    result.put("BIF", new CurrencyDataImpl("BIF", "BIF", 0, "BIF", "FBu"));
    // Bermudan dollari
    result.put("BMD", new CurrencyDataImpl("BMD", "BMD", 2, "BMD", "$"));
    // Brunein dollari
    result.put("BND", new CurrencyDataImpl("BND", "BND", 2, "BND", "$"));
    // Bolivian boliviano
    result.put("BOB", new CurrencyDataImpl("BOB", "BOB", 2, "BOB", "Bs"));
    // Bolivian boliviano (1863–1963)
    result.put("BOL", new CurrencyDataImpl("BOL", "BOL", 130, "BOL", "BOL"));
    // Bolivian peso
    result.put("BOP", new CurrencyDataImpl("BOP", "BOP", 130, "BOP", "BOP"));
    // Bolivian mvdol
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 130, "BOV", "BOV"));
    // Brasilian uusi cruzeiro (1967–1986)
    result.put("BRB", new CurrencyDataImpl("BRB", "BRB", 130, "BRB", "BRB"));
    // Brasilian cruzado (1986–1989)
    result.put("BRC", new CurrencyDataImpl("BRC", "BRC", 130, "BRC", "BRC"));
    // Brasilian cruzeiro (1990–1993)
    result.put("BRE", new CurrencyDataImpl("BRE", "BRE", 130, "BRE", "BRE"));
    // Brasilian real
    result.put("BRL", new CurrencyDataImpl("BRL", "R$", 2, "R$", "R$"));
    // Brasilian uusi cruzado (1989–1990)
    result.put("BRN", new CurrencyDataImpl("BRN", "BRN", 130, "BRN", "BRN"));
    // Brasilian cruzeiro (1993–1994)
    result.put("BRR", new CurrencyDataImpl("BRR", "BRR", 130, "BRR", "BRR"));
    // Brasilian cruzeiro (1942–1967)
    result.put("BRZ", new CurrencyDataImpl("BRZ", "BRZ", 130, "BRZ", "BRZ"));
    // Bahaman dollari
    result.put("BSD", new CurrencyDataImpl("BSD", "BSD", 2, "BSD", "$"));
    // Bhutanin ngultrum
    result.put("BTN", new CurrencyDataImpl("BTN", "BTN", 2, "BTN", "Nu."));
    // Burman kyat
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130, "BUK", "BUK"));
    // Botswanan pula
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2, "BWP", "P"));
    // Valko-Venäjän uusi rupla (1994–1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130, "BYB", "BYB"));
    // Valko-Venäjän rupla
    result.put("BYN", new CurrencyDataImpl("BYN", "BYN", 2, "BYN", "BYN"));
    // Valko-Venäjän rupla (2000–2016)
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 128, "BYR", "BYR"));
    // Belizen dollari
    result.put("BZD", new CurrencyDataImpl("BZD", "BZD", 2, "BZD", "$"));
    // Kanadan dollari
    result.put("CAD", new CurrencyDataImpl("CAD", "C$", 2, "C$", "$"));
    // Kongon frangi
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2, "CDF", "FrCD"));
    // Sveitsin WIR-euro
    result.put("CHE", new CurrencyDataImpl("CHE", "CHE", 130, "CHE", "CHE"));
    // Sveitsin frangi
    result.put("CHF", new CurrencyDataImpl("CHF", "CHF", 2, "CHF", "CHF"));
    // Sveitsin WIR-frangi
    result.put("CHW", new CurrencyDataImpl("CHW", "CHW", 130, "CHW", "CHW"));
    // Chilen escudo
    result.put("CLE", new CurrencyDataImpl("CLE", "CLE", 130, "CLE", "CLE"));
    // Chilen unidades de fomento
    result.put("CLF", new CurrencyDataImpl("CLF", "CLF", 132, "CLF", "CLF"));
    // Chilen peso
    result.put("CLP", new CurrencyDataImpl("CLP", "CL$", 0, "CL$", "$"));
    // Kiinan juan (offshore)
    result.put("CNH", new CurrencyDataImpl("CNH", "CNH", 130, "CNH", "CNH"));
    // Kiinan kansanpankin dollari
    result.put("CNX", new CurrencyDataImpl("CNX", "CNX", 130, "CNX", "CNX"));
    // Kiinan juan
    result.put("CNY", new CurrencyDataImpl("CNY", "RMB¥", 2, "RMB¥", "¥"));
    // Kolumbian peso
    result.put("COP", new CurrencyDataImpl("COP", "COL$", 2, "COL$", "$"));
    // Kolumbian unidad de valor real
    result.put("COU", new CurrencyDataImpl("COU", "COU", 130, "COU", "COU"));
    // Costa Rican colón
    result.put("CRC", new CurrencyDataImpl("CRC", "CR₡", 2, "CR₡", "₡"));
    // Serbian dinaari (2002–2006)
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130, "CSD", "CSD"));
    // Tšekkoslovakian kova koruna
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130, "CSK", "CSK"));
    // Kuuban vaihdettava peso
    result.put("CUC", new CurrencyDataImpl("CUC", "CUC", 2, "CUC", "$"));
    // Kuuban peso
    result.put("CUP", new CurrencyDataImpl("CUP", "$MN", 2, "$MN", "$"));
    // Kap Verden escudo
    result.put("CVE", new CurrencyDataImpl("CVE", "CVE", 2, "CVE", "CVE"));
    // Kyproksen punta
    result.put("CYP", new CurrencyDataImpl("CYP", "CYP", 130, "CYP", "CYP"));
    // Tšekin koruna
    result.put("CZK", new CurrencyDataImpl("CZK", "Kč", 2, "Kč", "Kč"));
    // Itä-Saksan markka
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130, "DDM", "DDM"));
    // Saksan markka
    result.put("DEM", new CurrencyDataImpl("DEM", "DEM", 130, "DEM", "DEM"));
    // Djiboutin frangi
    result.put("DJF", new CurrencyDataImpl("DJF", "Fdj", 0, "Fdj", "Fdj"));
    // Tanskan kruunu
    result.put("DKK", new CurrencyDataImpl("DKK", "kr", 2, "kr", "kr"));
    // Dominikaanisen tasavallan peso
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$", "$"));
    // Algerian dinaari
    result.put("DZD", new CurrencyDataImpl("DZD", "DZD", 2, "DZD", "din"));
    // Ecuadorin sucre
    result.put("ECS", new CurrencyDataImpl("ECS", "ECS", 130, "ECS", "ECS"));
    // Ecuadorin UVC
    result.put("ECV", new CurrencyDataImpl("ECV", "ECV", 130, "ECV", "ECV"));
    // Viron kruunu
    result.put("EEK", new CurrencyDataImpl("EEK", "EEK", 130, "EEK", "EEK"));
    // Egyptin punta
    result.put("EGP", new CurrencyDataImpl("EGP", "LE", 2, "LE", "E£"));
    // Eritrean nakfa
    result.put("ERN", new CurrencyDataImpl("ERN", "ERN", 2, "ERN", "Nfk"));
    // Espanjan peseta (A-tili)
    result.put("ESA", new CurrencyDataImpl("ESA", "ESA", 130, "ESA", "ESA"));
    // Espanjan peseta (vaihdettava tili)
    result.put("ESB", new CurrencyDataImpl("ESB", "ESB", 130, "ESB", "ESB"));
    // Espanjan peseta
    result.put("ESP", new CurrencyDataImpl("ESP", "ESP", 128, "ESP", "ESP"));
    // Etiopian birr
    result.put("ETB", new CurrencyDataImpl("ETB", "ETB", 2, "ETB", "Birr"));
    // euro
    result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€", "€"));
    // Suomen markka
    result.put("FIM", new CurrencyDataImpl("FIM", "mk", 130, "mk", "mk"));
    // Fidžin dollari
    result.put("FJD", new CurrencyDataImpl("FJD", "FJD", 2, "FJD", "$"));
    // Falklandinsaarten punta
    result.put("FKP", new CurrencyDataImpl("FKP", "FKP", 2, "FKP", "£"));
    // Ranskan frangi
    result.put("FRF", new CurrencyDataImpl("FRF", "FRF", 130, "FRF", "FRF"));
    // Englannin punta
    result.put("GBP", new CurrencyDataImpl("GBP", "£", 2, "GB£", "£"));
    // Georgian kuponkilari
    result.put("GEK", new CurrencyDataImpl("GEK", "GEK", 130, "GEK", "GEK"));
    // Georgian lari
    result.put("GEL", new CurrencyDataImpl("GEL", "GEL", 2, "GEL", "GEL"));
    // Ghanan cedi (1979–2007)
    result.put("GHC", new CurrencyDataImpl("GHC", "GHC", 130, "GHC", "GHC"));
    // Ghanan cedi
    result.put("GHS", new CurrencyDataImpl("GHS", "GHS", 2, "GHS", "GHS"));
    // Gibraltarin punta
    result.put("GIP", new CurrencyDataImpl("GIP", "GIP", 2, "GIP", "£"));
    // Gambian dalasi
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2, "GMD", "GMD"));
    // Guinean frangi
    result.put("GNF", new CurrencyDataImpl("GNF", "GNF", 0, "GNF", "FG"));
    // Guinean syli
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130, "GNS", "GNS"));
    // Päiväntasaajan Guinean ekwele
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130, "GQE", "GQE"));
    // Kreikan drakma
    result.put("GRD", new CurrencyDataImpl("GRD", "GRD", 130, "GRD", "GRD"));
    // Guatemalan quetzal
    result.put("GTQ", new CurrencyDataImpl("GTQ", "GTQ", 2, "GTQ", "Q"));
    // Portugalin Guinean escudo
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130, "GWE", "GWE"));
    // Guinea-Bissaun peso
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 130, "GWP", "GWP"));
    // Guyanan dollari
    result.put("GYD", new CurrencyDataImpl("GYD", "GYD", 2, "GYD", "$"));
    // Hongkongin dollari
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$", "$"));
    // Hondurasin lempira
    result.put("HNL", new CurrencyDataImpl("HNL", "L", 2, "L", "L"));
    // Kroatian dinaari
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130, "HRD", "HRD"));
    // Kroatian kuna
    result.put("HRK", new CurrencyDataImpl("HRK", "HRK", 2, "HRK", "kn"));
    // Haitin gourde
    result.put("HTG", new CurrencyDataImpl("HTG", "HTG", 2, "HTG", "HTG"));
    // Unkarin forintti
    result.put("HUF", new CurrencyDataImpl("HUF", "HUF", 2, "HUF", "Ft"));
    // Indonesian rupia
    result.put("IDR", new CurrencyDataImpl("IDR", "IDR", 2, "IDR", "Rp"));
    // Irlannin punta
    result.put("IEP", new CurrencyDataImpl("IEP", "IEP", 130, "IEP", "IEP"));
    // Israelin punta
    result.put("ILP", new CurrencyDataImpl("ILP", "ILP", 130, "ILP", "ILP"));
    // Israelin sekeli (1980–1985)
    result.put("ILR", new CurrencyDataImpl("ILR", "ILR", 130, "ILR", "ILR"));
    // Israelin uusi sekeli
    result.put("ILS", new CurrencyDataImpl("ILS", "IL₪", 2, "IL₪", "₪"));
    // Intian rupia
    result.put("INR", new CurrencyDataImpl("INR", "Rs", 2, "Rs", "₹"));
    // Irakin dinaari
    result.put("IQD", new CurrencyDataImpl("IQD", "IQD", 0, "IQD", "din"));
    // Iranin rial
    result.put("IRR", new CurrencyDataImpl("IRR", "IRR", 0, "IRR", "Rial"));
    // Islannin kruunu (1918–1981)
    result.put("ISJ", new CurrencyDataImpl("ISJ", "ISJ", 130, "ISJ", "ISJ"));
    // Islannin kruunu
    result.put("ISK", new CurrencyDataImpl("ISK", "kr", 0, "kr", "kr"));
    // Italian liira
    result.put("ITL", new CurrencyDataImpl("ITL", "ITL", 128, "ITL", "ITL"));
    // Jamaikan dollari
    result.put("JMD", new CurrencyDataImpl("JMD", "JA$", 2, "JA$", "$"));
    // Jordanian dinaari
    result.put("JOD", new CurrencyDataImpl("JOD", "JOD", 3, "JOD", "din"));
    // Japanin jeni
    result.put("JPY", new CurrencyDataImpl("JPY", "¥", 0, "JP¥", "¥"));
    // Kenian šillinki
    result.put("KES", new CurrencyDataImpl("KES", "Ksh", 2, "Ksh", "Ksh"));
    // Kirgisian som
    result.put("KGS", new CurrencyDataImpl("KGS", "KGS", 2, "KGS", "KGS"));
    // Kambodžan riel
    result.put("KHR", new CurrencyDataImpl("KHR", "KHR", 2, "KHR", "Riel"));
    // Komorien frangi
    result.put("KMF", new CurrencyDataImpl("KMF", "KMF", 0, "KMF", "CF"));
    // Pohjois-Korean won
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 0, "KPW", "₩"));
    // Etelä-Korean hwan (1953–1962)
    result.put("KRH", new CurrencyDataImpl("KRH", "KRH", 130, "KRH", "KRH"));
    // Etelä-Korean won (1945–1953)
    result.put("KRO", new CurrencyDataImpl("KRO", "KRO", 130, "KRO", "KRO"));
    // Etelä-Korean won
    result.put("KRW", new CurrencyDataImpl("KRW", "KR₩", 0, "KR₩", "₩"));
    // Kuwaitin dinaari
    result.put("KWD", new CurrencyDataImpl("KWD", "KWD", 3, "KWD", "din"));
    // Caymansaarten dollari
    result.put("KYD", new CurrencyDataImpl("KYD", "KYD", 2, "KYD", "$"));
    // Kazakstanin tenge
    result.put("KZT", new CurrencyDataImpl("KZT", "KZT", 2, "KZT", "₸"));
    // Laosin kip
    result.put("LAK", new CurrencyDataImpl("LAK", "LAK", 0, "LAK", "₭"));
    // Libanonin punta
    result.put("LBP", new CurrencyDataImpl("LBP", "LBP", 0, "LBP", "L£"));
    // Sri Lankan rupia
    result.put("LKR", new CurrencyDataImpl("LKR", "SLRs", 2, "SLRs", "Rs"));
    // Liberian dollari
    result.put("LRD", new CurrencyDataImpl("LRD", "LRD", 2, "LRD", "$"));
    // Lesothon loti
    result.put("LSL", new CurrencyDataImpl("LSL", "LSL", 2, "LSL", "LSL"));
    // Liettuan liti
    result.put("LTL", new CurrencyDataImpl("LTL", "LTL", 130, "LTL", "Lt"));
    // Liettuan talonas
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130, "LTT", "LTT"));
    // Luxemburgin vaihdettava frangi
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 130, "LUC", "LUC"));
    // Luxemburgin frangi
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128, "LUF", "LUF"));
    // Luxemburgin rahoitusfrangi
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 130, "LUL", "LUL"));
    // Latvian lati
    result.put("LVL", new CurrencyDataImpl("LVL", "LVL", 130, "LVL", "Ls"));
    // Latvian rupla
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130, "LVR", "LVR"));
    // Libyan dinaari
    result.put("LYD", new CurrencyDataImpl("LYD", "LYD", 3, "LYD", "din"));
    // Marokon dirhami
    result.put("MAD", new CurrencyDataImpl("MAD", "MAD", 2, "MAD", "MAD"));
    // Marokon frangi
    result.put("MAF", new CurrencyDataImpl("MAF", "MAF", 130, "MAF", "MAF"));
    // Monacon frangi
    result.put("MCF", new CurrencyDataImpl("MCF", "MCF", 130, "MCF", "MCF"));
    // Moldovan kuponkileu
    result.put("MDC", new CurrencyDataImpl("MDC", "MDC", 130, "MDC", "MDC"));
    // Moldovan leu
    result.put("MDL", new CurrencyDataImpl("MDL", "MDL", 2, "MDL", "MDL"));
    // Madagaskarin ariary
    result.put("MGA", new CurrencyDataImpl("MGA", "MGA", 0, "MGA", "Ar"));
    // Madagaskarin frangi
    result.put("MGF", new CurrencyDataImpl("MGF", "MGF", 128, "MGF", "MGF"));
    // Makedonian denaari
    result.put("MKD", new CurrencyDataImpl("MKD", "MKD", 2, "MKD", "din"));
    // Makedonian dinaari (1992–1993)
    result.put("MKN", new CurrencyDataImpl("MKN", "MKN", 130, "MKN", "MKN"));
    // Malin frangi
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130, "MLF", "MLF"));
    // Myanmarin kyat
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 0, "MMK", "K"));
    // Mongolian tugrik
    result.put("MNT", new CurrencyDataImpl("MNT", "MN₮", 2, "MN₮", "₮"));
    // Macaon pataca
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP", 2, "MOP", "MOP"));
    // Mauritanian ouguiya (1973–2017)
    result.put("MRO", new CurrencyDataImpl("MRO", "MRO", 128, "MRO", "MRO"));
    // Mauritanian ouguiya
    result.put("MRU", new CurrencyDataImpl("MRU", "MRU", 2, "MRU", "MRU"));
    // Maltan liira
    result.put("MTL", new CurrencyDataImpl("MTL", "MTL", 130, "MTL", "MTL"));
    // Maltan punta
    result.put("MTP", new CurrencyDataImpl("MTP", "MTP", 130, "MTP", "MTP"));
    // Mauritiuksen rupia
    result.put("MUR", new CurrencyDataImpl("MUR", "MUR", 2, "MUR", "Rs"));
    // Malediivien rupia (1947–1981)
    result.put("MVP", new CurrencyDataImpl("MVP", "MVP", 130, "MVP", "MVP"));
    // Malediivien rufiyaa
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2, "MVR", "MVR"));
    // Malawin kwacha
    result.put("MWK", new CurrencyDataImpl("MWK", "MWK", 2, "MWK", "MWK"));
    // Meksikon peso
    result.put("MXN", new CurrencyDataImpl("MXN", "Mex$", 2, "Mex$", "$"));
    // Meksikon hopeapeso (1861–1992)
    result.put("MXP", new CurrencyDataImpl("MXP", "MXP", 130, "MXP", "MXP"));
    // Meksikon UDI
    result.put("MXV", new CurrencyDataImpl("MXV", "MXV", 130, "MXV", "MXV"));
    // Malesian ringgit
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM", "RM"));
    // Mosambikin escudo
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130, "MZE", "MZE"));
    // Mosambikin metical (1980–2006)
    result.put("MZM", new CurrencyDataImpl("MZM", "MZM", 130, "MZM", "MZM"));
    // Mosambikin metical
    result.put("MZN", new CurrencyDataImpl("MZN", "MZN", 2, "MZN", "MTn"));
    // Namibian dollari
    result.put("NAD", new CurrencyDataImpl("NAD", "NAD", 2, "NAD", "$"));
    // Nigerian naira
    result.put("NGN", new CurrencyDataImpl("NGN", "NGN", 2, "NGN", "₦"));
    // Nicaraguan córdoba (1988–1991)
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130, "NIC", "NIC"));
    // Nicaraguan córdoba
    result.put("NIO", new CurrencyDataImpl("NIO", "NIO", 2, "NIO", "C$"));
    // Alankomaiden guldeni
    result.put("NLG", new CurrencyDataImpl("NLG", "NLG", 130, "NLG", "NLG"));
    // Norjan kruunu
    result.put("NOK", new CurrencyDataImpl("NOK", "NOkr", 2, "NOkr", "kr"));
    // Nepalin rupia
    result.put("NPR", new CurrencyDataImpl("NPR", "NPR", 2, "NPR", "Rs"));
    // Uuden-Seelannin dollari
    result.put("NZD", new CurrencyDataImpl("NZD", "NZD", 2, "NZD", "$"));
    // Omanin rial
    result.put("OMR", new CurrencyDataImpl("OMR", "OMR", 3, "OMR", "Rial"));
    // Panaman balboa
    result.put("PAB", new CurrencyDataImpl("PAB", "B/.", 2, "B/.", "B/."));
    // Perun inti
    result.put("PEI", new CurrencyDataImpl("PEI", "PEI", 130, "PEI", "PEI"));
    // Perun sol
    result.put("PEN", new CurrencyDataImpl("PEN", "S/.", 2, "S/.", "S/."));
    // Perun sol (1863–1965)
    result.put("PES", new CurrencyDataImpl("PES", "PES", 130, "PES", "PES"));
    // Papua-Uuden-Guinean kina
    result.put("PGK", new CurrencyDataImpl("PGK", "PGK", 2, "PGK", "PGK"));
    // Filippiinien peso
    result.put("PHP", new CurrencyDataImpl("PHP", "PHP", 2, "PHP", "₱"));
    // Pakistanin rupia
    result.put("PKR", new CurrencyDataImpl("PKR", "PKRs.", 2, "PKRs.", "Rs"));
    // Puolan złoty
    result.put("PLN", new CurrencyDataImpl("PLN", "PLN", 2, "PLN", "zł"));
    // Puolan złoty (1950–1995)
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130, "PLZ", "PLZ"));
    // Portugalin escudo
    result.put("PTE", new CurrencyDataImpl("PTE", "PTE", 130, "PTE", "PTE"));
    // Paraguayn guarani
    result.put("PYG", new CurrencyDataImpl("PYG", "PYG", 0, "PYG", "Gs"));
    // Qatarin rial
    result.put("QAR", new CurrencyDataImpl("QAR", "QAR", 2, "QAR", "Rial"));
    // Rhodesian dollari
    result.put("RHD", new CurrencyDataImpl("RHD", "RHD", 130, "RHD", "RHD"));
    // Romanian leu (1952–2006)
    result.put("ROL", new CurrencyDataImpl("ROL", "ROL", 130, "ROL", "ROL"));
    // Romanian leu
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2, "RON", "RON"));
    // Serbian dinaari
    result.put("RSD", new CurrencyDataImpl("RSD", "RSD", 0, "RSD", "din"));
    // Venäjän rupla
    result.put("RUB", new CurrencyDataImpl("RUB", "руб.", 2, "руб.", "руб."));
    // Venäjän rupla (1991–1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130, "RUR", "RUR"));
    // Ruandan frangi
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0, "RWF", "RF"));
    // Saudi-Arabian rial
    result.put("SAR", new CurrencyDataImpl("SAR", "SR", 2, "SR", "Rial"));
    // Salomonsaarten dollari
    result.put("SBD", new CurrencyDataImpl("SBD", "SBD", 2, "SBD", "$"));
    // Seychellien rupia
    result.put("SCR", new CurrencyDataImpl("SCR", "SCR", 2, "SCR", "SCR"));
    // Sudanin dinaari (1992–2007)
    result.put("SDD", new CurrencyDataImpl("SDD", "SDD", 130, "SDD", "SDD"));
    // Sudanin punta
    result.put("SDG", new CurrencyDataImpl("SDG", "SDG", 2, "SDG", "SDG"));
    // Sudanin punta (1957–1998)
    result.put("SDP", new CurrencyDataImpl("SDP", "SDP", 130, "SDP", "SDP"));
    // Ruotsin kruunu
    result.put("SEK", new CurrencyDataImpl("SEK", "kr", 2, "kr", "kr"));
    // Singaporen dollari
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$", "$"));
    // Saint Helenan punta
    result.put("SHP", new CurrencyDataImpl("SHP", "SHP", 2, "SHP", "£"));
    // Slovenian tolar
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130, "SIT", "SIT"));
    // Slovakian koruna
    result.put("SKK", new CurrencyDataImpl("SKK", "SKK", 130, "SKK", "SKK"));
    // Sierra Leonen leone
    result.put("SLL", new CurrencyDataImpl("SLL", "SLL", 0, "SLL", "SLL"));
    // Somalian šillinki
    result.put("SOS", new CurrencyDataImpl("SOS", "SOS", 0, "SOS", "SOS"));
    // Surinamen dollari
    result.put("SRD", new CurrencyDataImpl("SRD", "SRD", 2, "SRD", "$"));
    // Surinamen guldeni
    result.put("SRG", new CurrencyDataImpl("SRG", "SRG", 130, "SRG", "SRG"));
    // Etelä-Sudanin punta
    result.put("SSP", new CurrencyDataImpl("SSP", "SSP", 2, "SSP", "SSP"));
    // São Tomén ja Príncipen dobra (1977–2017)
    result.put("STD", new CurrencyDataImpl("STD", "STD", 128, "STD", "Db"));
    // São Tomén ja Príncipen dobra
    result.put("STN", new CurrencyDataImpl("STN", "STN", 2, "STN", "STN"));
    // Neuvostoliiton rupla
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130, "SUR", "SUR"));
    // El Salvadorin colón
    result.put("SVC", new CurrencyDataImpl("SVC", "SVC", 130, "SVC", "SVC"));
    // Syyrian punta
    result.put("SYP", new CurrencyDataImpl("SYP", "SYP", 0, "SYP", "£"));
    // Swazimaan lilangeni
    result.put("SZL", new CurrencyDataImpl("SZL", "SZL", 2, "SZL", "SZL"));
    // Thaimaan baht
    result.put("THB", new CurrencyDataImpl("THB", "THB", 2, "THB", "฿"));
    // Tadžikistanin rupla
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130, "TJR", "TJR"));
    // Tadžikistanin somoni
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2, "TJS", "Som"));
    // Turkmenistanin manat (1993–2009)
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 128, "TMM", "TMM"));
    // Turkmenistanin manat
    result.put("TMT", new CurrencyDataImpl("TMT", "TMT", 2, "TMT", "TMT"));
    // Tunisian dinaari
    result.put("TND", new CurrencyDataImpl("TND", "TND", 3, "TND", "din"));
    // Tongan pa’anga
    result.put("TOP", new CurrencyDataImpl("TOP", "TOP", 2, "TOP", "T$"));
    // Timorin escudo
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130, "TPE", "TPE"));
    // Turkin liira (1922–2005)
    result.put("TRL", new CurrencyDataImpl("TRL", "TRL", 128, "TRL", "TRL"));
    // Turkin liira
    result.put("TRY", new CurrencyDataImpl("TRY", "TL", 2, "YTL", "TL"));
    // Trinidadin ja Tobagon dollari
    result.put("TTD", new CurrencyDataImpl("TTD", "TTD", 2, "TTD", "$"));
    // Taiwanin uusi dollari
    result.put("TWD", new CurrencyDataImpl("TWD", "NT$", 2, "NT$", "NT$"));
    // Tansanian šillinki
    result.put("TZS", new CurrencyDataImpl("TZS", "TZS", 2, "TZS", "TSh"));
    // Ukrainan hryvnia
    result.put("UAH", new CurrencyDataImpl("UAH", "UAH", 2, "UAH", "₴"));
    // Ukrainan karbovanetz
    result.put("UAK", new CurrencyDataImpl("UAK", "UAK", 130, "UAK", "UAK"));
    // Ugandan šillinki (1966–1987)
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130, "UGS", "UGS"));
    // Ugandan šillinki
    result.put("UGX", new CurrencyDataImpl("UGX", "UGX", 0, "UGX", "UGX"));
    // Yhdysvaltain dollari
    result.put("USD", new CurrencyDataImpl("USD", "$", 2, "US$", "$"));
    // Yhdysvaltain dollari (seuraava päivä)
    result.put("USN", new CurrencyDataImpl("USN", "USN", 130, "USN", "USN"));
    // Yhdysvaltain dollari (sama päivä)
    result.put("USS", new CurrencyDataImpl("USS", "USS", 130, "USS", "USS"));
    // Uruguayn peso en unidades indexadas
    result.put("UYI", new CurrencyDataImpl("UYI", "UYI", 128, "UYI", "UYI"));
    // Uruguayn peso (1975–1993)
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130, "UYP", "UYP"));
    // Uruguayn peso
    result.put("UYU", new CurrencyDataImpl("UYU", "UY$", 2, "UY$", "$"));
    // Uzbekistanin som
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 2, "UZS", "soʼm"));
    // Venezuelan bolívar (1871–2008)
    result.put("VEB", new CurrencyDataImpl("VEB", "VEB", 130, "VEB", "VEB"));
    // Venezuelan bolívar (2008–2018)
    result.put("VEF", new CurrencyDataImpl("VEF", "VEF", 130, "VEF", "Bs"));
    // Venezuelan suvereeni bolívar
    result.put("VES", new CurrencyDataImpl("VES", "VES", 2, "VES", "VES"));
    // Vietnamin dong
    result.put("VND", new CurrencyDataImpl("VND", "₫", 24, "₫", "₫"));
    // Vietnamin dong (1978–1985)
    result.put("VNN", new CurrencyDataImpl("VNN", "VNN", 130, "VNN", "VNN"));
    // Vanuatun vatu
    result.put("VUV", new CurrencyDataImpl("VUV", "VUV", 0, "VUV", "VUV"));
    // Samoan tala
    result.put("WST", new CurrencyDataImpl("WST", "WST", 2, "WST", "WST"));
    // CFA-frangi BEAC
    result.put("XAF", new CurrencyDataImpl("XAF", "FCFA", 0, "FCFA", "FCFA"));
    // hopea
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 130, "XAG", "XAG"));
    // kulta
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 130, "XAU", "XAU"));
    // EURCO
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 130, "XBA", "XBA"));
    // Euroopan rahayksikkö (EMU)
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 130, "XBB", "XBB"));
    // EUA (XBC)
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 130, "XBC", "XBC"));
    // EUA (XBD)
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 130, "XBD", "XBD"));
    // Itä-Karibian dollari
    result.put("XCD", new CurrencyDataImpl("XCD", "XCD", 2, "XCD", "$"));
    // erityisnosto-oikeus (SDR)
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 130, "XDR", "XDR"));
    // Euroopan valuuttayksikkö (ECU)
    result.put("XEU", new CurrencyDataImpl("XEU", "XEU", 130, "XEU", "XEU"));
    // Ranskan kultafrangi
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 130, "XFO", "XFO"));
    // Ranskan UIC-frangi
    result.put("XFU", new CurrencyDataImpl("XFU", "XFU", 130, "XFU", "XFU"));
    // CFA-frangi BCEAO
    result.put("XOF", new CurrencyDataImpl("XOF", "CFA", 0, "CFA", "CFA"));
    // palladium
    result.put("XPD", new CurrencyDataImpl("XPD", "XPD", 130, "XPD", "XPD"));
    // CFP-frangi
    result.put("XPF", new CurrencyDataImpl("XPF", "XPF", 0, "XPF", "FCFP"));
    // platina
    result.put("XPT", new CurrencyDataImpl("XPT", "XPT", 130, "XPT", "XPT"));
    // RINET-rahastot
    result.put("XRE", new CurrencyDataImpl("XRE", "XRE", 130, "XRE", "XRE"));
    // etelä-amerikkalaisen ALBA:n laskentayksikkö sucre
    result.put("XSU", new CurrencyDataImpl("XSU", "XSU", 130, "XSU", "XSU"));
    // testaustarkoitukseen varattu valuuttakoodi
    result.put("XTS", new CurrencyDataImpl("XTS", "XTS", 130, "XTS", "XTS"));
    // afrikkalainen AfDB-laskentayksikkö
    result.put("XUA", new CurrencyDataImpl("XUA", "XUA", 130, "XUA", "XUA"));
    // tuntematon rahayksikkö
    result.put("XXX", new CurrencyDataImpl("XXX", "XXX", 130, "XXX", "XXX"));
    // Jemenin dinaari
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130, "YDD", "YDD"));
    // Jemenin rial
    result.put("YER", new CurrencyDataImpl("YER", "YER", 0, "YER", "Rial"));
    // Jugoslavian kova dinaari (1966–1990)
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130, "YUD", "YUD"));
    // Jugoslavian uusi dinaari (1994–2002)
    result.put("YUM", new CurrencyDataImpl("YUM", "YUM", 130, "YUM", "YUM"));
    // Jugoslavian vaihdettava dinaari (1990–1992)
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130, "YUN", "YUN"));
    // Jugoslavian uudistettu dinaari (1992–1993)
    result.put("YUR", new CurrencyDataImpl("YUR", "YUR", 130, "YUR", "YUR"));
    // Etelä-Afrikan rahoitusrandi
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 130, "ZAL", "ZAL"));
    // Etelä-Afrikan randi
    result.put("ZAR", new CurrencyDataImpl("ZAR", "ZAR", 2, "ZAR", "R"));
    // Sambian kwacha (1968–2012)
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZMK", 128, "ZMK", "ZWK"));
    // Sambian kwacha
    result.put("ZMW", new CurrencyDataImpl("ZMW", "ZMW", 2, "ZMW", "ZMW"));
    // Zairen uusi zaire (1993–1998)
    result.put("ZRN", new CurrencyDataImpl("ZRN", "ZRN", 130, "ZRN", "ZRN"));
    // Zairen zaire (1971–1993)
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"));
    // Zimbabwen dollari (1980–2008)
    result.put("ZWD", new CurrencyDataImpl("ZWD", "ZWD", 128, "ZWD", "ZWD"));
    // Zimbabwen dollari (2009)
    result.put("ZWL", new CurrencyDataImpl("ZWL", "ZWL", 130, "ZWL", "ZWL"));
    // Zimbabwen dollari (2008)
    result.put("ZWR", new CurrencyDataImpl("ZWR", "ZWR", 130, "ZWR", "ZWR"));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // Andorran peseta
      "ADP": [ "ADP", "ADP", 128, "ADP", "ADP"],
      // Arabiemiirikuntien dirhami
      "AED": [ "AED", "DH", 2, "DH", "dh"],
      // Afganistanin afgaani (1927–2002)
      "AFA": [ "AFA", "AFA", 130, "AFA", "AFA"],
      // Afganistanin afgaani
      "AFN": [ "AFN", "AFN", 0, "AFN", "Af."],
      // Albanian lek (1946–1965)
      "ALK": [ "ALK", "ALK", 130, "ALK", "ALK"],
      // Albanian lek
      "ALL": [ "ALL", "ALL", 0, "ALL", "Lek"],
      // Armenian dram
      "AMD": [ "AMD", "AMD", 2, "AMD", "Dram"],
      // Alankomaiden Antillien guldeni
      "ANG": [ "ANG", "ANG", 2, "ANG", "ANG"],
      // Angolan kwanza
      "AOA": [ "AOA", "AOA", 2, "AOA", "Kz"],
      // Angolan kwanza (1977–1991)
      "AOK": [ "AOK", "AOK", 130, "AOK", "AOK"],
      // Angolan uusi kwanza (1990–2000)
      "AON": [ "AON", "AON", 130, "AON", "AON"],
      // Angolan kwanza reajustado (1995–1999)
      "AOR": [ "AOR", "AOR", 130, "AOR", "AOR"],
      // Argentiinan austral
      "ARA": [ "ARA", "ARA", 130, "ARA", "ARA"],
      // Argentiinan ley-peso (1970–1983)
      "ARL": [ "ARL", "ARL", 130, "ARL", "ARL"],
      // Argentiinan peso (1881–1970)
      "ARM": [ "ARM", "ARM", 130, "ARM", "ARM"],
      // Argentiinan peso (1983–1985)
      "ARP": [ "ARP", "ARP", 130, "ARP", "ARP"],
      // Argentiinan peso
      "ARS": [ "ARS", "AR$", 2, "AR$", "$"],
      // Itävallan šillinki
      "ATS": [ "ATS", "ATS", 130, "ATS", "ATS"],
      // Australian dollari
      "AUD": [ "AUD", "AU$", 2, "AU$", "$"],
      // Aruban floriini
      "AWG": [ "AWG", "AWG", 2, "AWG", "Afl."],
      // Azerbaidžanin manat (1993–2006)
      "AZM": [ "AZM", "AZM", 130, "AZM", "AZM"],
      // Azerbaidžanin manat
      "AZN": [ "AZN", "AZN", 2, "AZN", "man."],
      // Bosnia-Hertsegovinan dinaari (1992–1994)
      "BAD": [ "BAD", "BAD", 130, "BAD", "BAD"],
      // Bosnia-Hertsegovinan vaihdettava markka
      "BAM": [ "BAM", "BAM", 2, "BAM", "KM"],
      // Bosnia-Hertsegovinan uusi dinaari (1994–1997)
      "BAN": [ "BAN", "BAN", 130, "BAN", "BAN"],
      // Barbadosin dollari
      "BBD": [ "BBD", "BBD", 2, "BBD", "$"],
      // Bangladeshin taka
      "BDT": [ "BDT", "Tk", 2, "Tk", "৳"],
      // Belgian vaihdettava frangi
      "BEC": [ "BEC", "BEC", 130, "BEC", "BEC"],
      // Belgian frangi
      "BEF": [ "BEF", "BEF", 130, "BEF", "BEF"],
      // Belgian rahoitusfrangi
      "BEL": [ "BEL", "BEL", 130, "BEL", "BEL"],
      // Bulgarian kova lev
      "BGL": [ "BGL", "BGL", 130, "BGL", "BGL"],
      // Bulgarian sosialistinen lev
      "BGM": [ "BGM", "BGM", 130, "BGM", "BGM"],
      // Bulgarian lev
      "BGN": [ "BGN", "BGN", 2, "BGN", "lev"],
      // Bulgarian lev (1879–1952)
      "BGO": [ "BGO", "BGO", 130, "BGO", "BGO"],
      // Bahrainin dinaari
      "BHD": [ "BHD", "BHD", 3, "BHD", "din"],
      // Burundin frangi
      "BIF": [ "BIF", "BIF", 0, "BIF", "FBu"],
      // Bermudan dollari
      "BMD": [ "BMD", "BMD", 2, "BMD", "$"],
      // Brunein dollari
      "BND": [ "BND", "BND", 2, "BND", "$"],
      // Bolivian boliviano
      "BOB": [ "BOB", "BOB", 2, "BOB", "Bs"],
      // Bolivian boliviano (1863–1963)
      "BOL": [ "BOL", "BOL", 130, "BOL", "BOL"],
      // Bolivian peso
      "BOP": [ "BOP", "BOP", 130, "BOP", "BOP"],
      // Bolivian mvdol
      "BOV": [ "BOV", "BOV", 130, "BOV", "BOV"],
      // Brasilian uusi cruzeiro (1967–1986)
      "BRB": [ "BRB", "BRB", 130, "BRB", "BRB"],
      // Brasilian cruzado (1986–1989)
      "BRC": [ "BRC", "BRC", 130, "BRC", "BRC"],
      // Brasilian cruzeiro (1990–1993)
      "BRE": [ "BRE", "BRE", 130, "BRE", "BRE"],
      // Brasilian real
      "BRL": [ "BRL", "R$", 2, "R$", "R$"],
      // Brasilian uusi cruzado (1989–1990)
      "BRN": [ "BRN", "BRN", 130, "BRN", "BRN"],
      // Brasilian cruzeiro (1993–1994)
      "BRR": [ "BRR", "BRR", 130, "BRR", "BRR"],
      // Brasilian cruzeiro (1942–1967)
      "BRZ": [ "BRZ", "BRZ", 130, "BRZ", "BRZ"],
      // Bahaman dollari
      "BSD": [ "BSD", "BSD", 2, "BSD", "$"],
      // Bhutanin ngultrum
      "BTN": [ "BTN", "BTN", 2, "BTN", "Nu."],
      // Burman kyat
      "BUK": [ "BUK", "BUK", 130, "BUK", "BUK"],
      // Botswanan pula
      "BWP": [ "BWP", "BWP", 2, "BWP", "P"],
      // Valko-Venäjän uusi rupla (1994–1999)
      "BYB": [ "BYB", "BYB", 130, "BYB", "BYB"],
      // Valko-Venäjän rupla
      "BYN": [ "BYN", "BYN", 2, "BYN", "BYN"],
      // Valko-Venäjän rupla (2000–2016)
      "BYR": [ "BYR", "BYR", 128, "BYR", "BYR"],
      // Belizen dollari
      "BZD": [ "BZD", "BZD", 2, "BZD", "$"],
      // Kanadan dollari
      "CAD": [ "CAD", "C$", 2, "C$", "$"],
      // Kongon frangi
      "CDF": [ "CDF", "CDF", 2, "CDF", "FrCD"],
      // Sveitsin WIR-euro
      "CHE": [ "CHE", "CHE", 130, "CHE", "CHE"],
      // Sveitsin frangi
      "CHF": [ "CHF", "CHF", 2, "CHF", "CHF"],
      // Sveitsin WIR-frangi
      "CHW": [ "CHW", "CHW", 130, "CHW", "CHW"],
      // Chilen escudo
      "CLE": [ "CLE", "CLE", 130, "CLE", "CLE"],
      // Chilen unidades de fomento
      "CLF": [ "CLF", "CLF", 132, "CLF", "CLF"],
      // Chilen peso
      "CLP": [ "CLP", "CL$", 0, "CL$", "$"],
      // Kiinan juan (offshore)
      "CNH": [ "CNH", "CNH", 130, "CNH", "CNH"],
      // Kiinan kansanpankin dollari
      "CNX": [ "CNX", "CNX", 130, "CNX", "CNX"],
      // Kiinan juan
      "CNY": [ "CNY", "RMB¥", 2, "RMB¥", "¥"],
      // Kolumbian peso
      "COP": [ "COP", "COL$", 2, "COL$", "$"],
      // Kolumbian unidad de valor real
      "COU": [ "COU", "COU", 130, "COU", "COU"],
      // Costa Rican colón
      "CRC": [ "CRC", "CR₡", 2, "CR₡", "₡"],
      // Serbian dinaari (2002–2006)
      "CSD": [ "CSD", "CSD", 130, "CSD", "CSD"],
      // Tšekkoslovakian kova koruna
      "CSK": [ "CSK", "CSK", 130, "CSK", "CSK"],
      // Kuuban vaihdettava peso
      "CUC": [ "CUC", "CUC", 2, "CUC", "$"],
      // Kuuban peso
      "CUP": [ "CUP", "$MN", 2, "$MN", "$"],
      // Kap Verden escudo
      "CVE": [ "CVE", "CVE", 2, "CVE", "CVE"],
      // Kyproksen punta
      "CYP": [ "CYP", "CYP", 130, "CYP", "CYP"],
      // Tšekin koruna
      "CZK": [ "CZK", "Kč", 2, "Kč", "Kč"],
      // Itä-Saksan markka
      "DDM": [ "DDM", "DDM", 130, "DDM", "DDM"],
      // Saksan markka
      "DEM": [ "DEM", "DEM", 130, "DEM", "DEM"],
      // Djiboutin frangi
      "DJF": [ "DJF", "Fdj", 0, "Fdj", "Fdj"],
      // Tanskan kruunu
      "DKK": [ "DKK", "kr", 2, "kr", "kr"],
      // Dominikaanisen tasavallan peso
      "DOP": [ "DOP", "RD$", 2, "RD$", "$"],
      // Algerian dinaari
      "DZD": [ "DZD", "DZD", 2, "DZD", "din"],
      // Ecuadorin sucre
      "ECS": [ "ECS", "ECS", 130, "ECS", "ECS"],
      // Ecuadorin UVC
      "ECV": [ "ECV", "ECV", 130, "ECV", "ECV"],
      // Viron kruunu
      "EEK": [ "EEK", "EEK", 130, "EEK", "EEK"],
      // Egyptin punta
      "EGP": [ "EGP", "LE", 2, "LE", "E£"],
      // Eritrean nakfa
      "ERN": [ "ERN", "ERN", 2, "ERN", "Nfk"],
      // Espanjan peseta (A-tili)
      "ESA": [ "ESA", "ESA", 130, "ESA", "ESA"],
      // Espanjan peseta (vaihdettava tili)
      "ESB": [ "ESB", "ESB", 130, "ESB", "ESB"],
      // Espanjan peseta
      "ESP": [ "ESP", "ESP", 128, "ESP", "ESP"],
      // Etiopian birr
      "ETB": [ "ETB", "ETB", 2, "ETB", "Birr"],
      // euro
      "EUR": [ "EUR", "€", 2, "€", "€"],
      // Suomen markka
      "FIM": [ "FIM", "mk", 130, "mk", "mk"],
      // Fidžin dollari
      "FJD": [ "FJD", "FJD", 2, "FJD", "$"],
      // Falklandinsaarten punta
      "FKP": [ "FKP", "FKP", 2, "FKP", "£"],
      // Ranskan frangi
      "FRF": [ "FRF", "FRF", 130, "FRF", "FRF"],
      // Englannin punta
      "GBP": [ "GBP", "£", 2, "GB£", "£"],
      // Georgian kuponkilari
      "GEK": [ "GEK", "GEK", 130, "GEK", "GEK"],
      // Georgian lari
      "GEL": [ "GEL", "GEL", 2, "GEL", "GEL"],
      // Ghanan cedi (1979–2007)
      "GHC": [ "GHC", "GHC", 130, "GHC", "GHC"],
      // Ghanan cedi
      "GHS": [ "GHS", "GHS", 2, "GHS", "GHS"],
      // Gibraltarin punta
      "GIP": [ "GIP", "GIP", 2, "GIP", "£"],
      // Gambian dalasi
      "GMD": [ "GMD", "GMD", 2, "GMD", "GMD"],
      // Guinean frangi
      "GNF": [ "GNF", "GNF", 0, "GNF", "FG"],
      // Guinean syli
      "GNS": [ "GNS", "GNS", 130, "GNS", "GNS"],
      // Päiväntasaajan Guinean ekwele
      "GQE": [ "GQE", "GQE", 130, "GQE", "GQE"],
      // Kreikan drakma
      "GRD": [ "GRD", "GRD", 130, "GRD", "GRD"],
      // Guatemalan quetzal
      "GTQ": [ "GTQ", "GTQ", 2, "GTQ", "Q"],
      // Portugalin Guinean escudo
      "GWE": [ "GWE", "GWE", 130, "GWE", "GWE"],
      // Guinea-Bissaun peso
      "GWP": [ "GWP", "GWP", 130, "GWP", "GWP"],
      // Guyanan dollari
      "GYD": [ "GYD", "GYD", 2, "GYD", "$"],
      // Hongkongin dollari
      "HKD": [ "HKD", "HK$", 2, "HK$", "$"],
      // Hondurasin lempira
      "HNL": [ "HNL", "L", 2, "L", "L"],
      // Kroatian dinaari
      "HRD": [ "HRD", "HRD", 130, "HRD", "HRD"],
      // Kroatian kuna
      "HRK": [ "HRK", "HRK", 2, "HRK", "kn"],
      // Haitin gourde
      "HTG": [ "HTG", "HTG", 2, "HTG", "HTG"],
      // Unkarin forintti
      "HUF": [ "HUF", "HUF", 2, "HUF", "Ft"],
      // Indonesian rupia
      "IDR": [ "IDR", "IDR", 2, "IDR", "Rp"],
      // Irlannin punta
      "IEP": [ "IEP", "IEP", 130, "IEP", "IEP"],
      // Israelin punta
      "ILP": [ "ILP", "ILP", 130, "ILP", "ILP"],
      // Israelin sekeli (1980–1985)
      "ILR": [ "ILR", "ILR", 130, "ILR", "ILR"],
      // Israelin uusi sekeli
      "ILS": [ "ILS", "IL₪", 2, "IL₪", "₪"],
      // Intian rupia
      "INR": [ "INR", "Rs", 2, "Rs", "₹"],
      // Irakin dinaari
      "IQD": [ "IQD", "IQD", 0, "IQD", "din"],
      // Iranin rial
      "IRR": [ "IRR", "IRR", 0, "IRR", "Rial"],
      // Islannin kruunu (1918–1981)
      "ISJ": [ "ISJ", "ISJ", 130, "ISJ", "ISJ"],
      // Islannin kruunu
      "ISK": [ "ISK", "kr", 0, "kr", "kr"],
      // Italian liira
      "ITL": [ "ITL", "ITL", 128, "ITL", "ITL"],
      // Jamaikan dollari
      "JMD": [ "JMD", "JA$", 2, "JA$", "$"],
      // Jordanian dinaari
      "JOD": [ "JOD", "JOD", 3, "JOD", "din"],
      // Japanin jeni
      "JPY": [ "JPY", "¥", 0, "JP¥", "¥"],
      // Kenian šillinki
      "KES": [ "KES", "Ksh", 2, "Ksh", "Ksh"],
      // Kirgisian som
      "KGS": [ "KGS", "KGS", 2, "KGS", "KGS"],
      // Kambodžan riel
      "KHR": [ "KHR", "KHR", 2, "KHR", "Riel"],
      // Komorien frangi
      "KMF": [ "KMF", "KMF", 0, "KMF", "CF"],
      // Pohjois-Korean won
      "KPW": [ "KPW", "KPW", 0, "KPW", "₩"],
      // Etelä-Korean hwan (1953–1962)
      "KRH": [ "KRH", "KRH", 130, "KRH", "KRH"],
      // Etelä-Korean won (1945–1953)
      "KRO": [ "KRO", "KRO", 130, "KRO", "KRO"],
      // Etelä-Korean won
      "KRW": [ "KRW", "KR₩", 0, "KR₩", "₩"],
      // Kuwaitin dinaari
      "KWD": [ "KWD", "KWD", 3, "KWD", "din"],
      // Caymansaarten dollari
      "KYD": [ "KYD", "KYD", 2, "KYD", "$"],
      // Kazakstanin tenge
      "KZT": [ "KZT", "KZT", 2, "KZT", "₸"],
      // Laosin kip
      "LAK": [ "LAK", "LAK", 0, "LAK", "₭"],
      // Libanonin punta
      "LBP": [ "LBP", "LBP", 0, "LBP", "L£"],
      // Sri Lankan rupia
      "LKR": [ "LKR", "SLRs", 2, "SLRs", "Rs"],
      // Liberian dollari
      "LRD": [ "LRD", "LRD", 2, "LRD", "$"],
      // Lesothon loti
      "LSL": [ "LSL", "LSL", 2, "LSL", "LSL"],
      // Liettuan liti
      "LTL": [ "LTL", "LTL", 130, "LTL", "Lt"],
      // Liettuan talonas
      "LTT": [ "LTT", "LTT", 130, "LTT", "LTT"],
      // Luxemburgin vaihdettava frangi
      "LUC": [ "LUC", "LUC", 130, "LUC", "LUC"],
      // Luxemburgin frangi
      "LUF": [ "LUF", "LUF", 128, "LUF", "LUF"],
      // Luxemburgin rahoitusfrangi
      "LUL": [ "LUL", "LUL", 130, "LUL", "LUL"],
      // Latvian lati
      "LVL": [ "LVL", "LVL", 130, "LVL", "Ls"],
      // Latvian rupla
      "LVR": [ "LVR", "LVR", 130, "LVR", "LVR"],
      // Libyan dinaari
      "LYD": [ "LYD", "LYD", 3, "LYD", "din"],
      // Marokon dirhami
      "MAD": [ "MAD", "MAD", 2, "MAD", "MAD"],
      // Marokon frangi
      "MAF": [ "MAF", "MAF", 130, "MAF", "MAF"],
      // Monacon frangi
      "MCF": [ "MCF", "MCF", 130, "MCF", "MCF"],
      // Moldovan kuponkileu
      "MDC": [ "MDC", "MDC", 130, "MDC", "MDC"],
      // Moldovan leu
      "MDL": [ "MDL", "MDL", 2, "MDL", "MDL"],
      // Madagaskarin ariary
      "MGA": [ "MGA", "MGA", 0, "MGA", "Ar"],
      // Madagaskarin frangi
      "MGF": [ "MGF", "MGF", 128, "MGF", "MGF"],
      // Makedonian denaari
      "MKD": [ "MKD", "MKD", 2, "MKD", "din"],
      // Makedonian dinaari (1992–1993)
      "MKN": [ "MKN", "MKN", 130, "MKN", "MKN"],
      // Malin frangi
      "MLF": [ "MLF", "MLF", 130, "MLF", "MLF"],
      // Myanmarin kyat
      "MMK": [ "MMK", "MMK", 0, "MMK", "K"],
      // Mongolian tugrik
      "MNT": [ "MNT", "MN₮", 2, "MN₮", "₮"],
      // Macaon pataca
      "MOP": [ "MOP", "MOP", 2, "MOP", "MOP"],
      // Mauritanian ouguiya (1973–2017)
      "MRO": [ "MRO", "MRO", 128, "MRO", "MRO"],
      // Mauritanian ouguiya
      "MRU": [ "MRU", "MRU", 2, "MRU", "MRU"],
      // Maltan liira
      "MTL": [ "MTL", "MTL", 130, "MTL", "MTL"],
      // Maltan punta
      "MTP": [ "MTP", "MTP", 130, "MTP", "MTP"],
      // Mauritiuksen rupia
      "MUR": [ "MUR", "MUR", 2, "MUR", "Rs"],
      // Malediivien rupia (1947–1981)
      "MVP": [ "MVP", "MVP", 130, "MVP", "MVP"],
      // Malediivien rufiyaa
      "MVR": [ "MVR", "MVR", 2, "MVR", "MVR"],
      // Malawin kwacha
      "MWK": [ "MWK", "MWK", 2, "MWK", "MWK"],
      // Meksikon peso
      "MXN": [ "MXN", "Mex$", 2, "Mex$", "$"],
      // Meksikon hopeapeso (1861–1992)
      "MXP": [ "MXP", "MXP", 130, "MXP", "MXP"],
      // Meksikon UDI
      "MXV": [ "MXV", "MXV", 130, "MXV", "MXV"],
      // Malesian ringgit
      "MYR": [ "MYR", "RM", 2, "RM", "RM"],
      // Mosambikin escudo
      "MZE": [ "MZE", "MZE", 130, "MZE", "MZE"],
      // Mosambikin metical (1980–2006)
      "MZM": [ "MZM", "MZM", 130, "MZM", "MZM"],
      // Mosambikin metical
      "MZN": [ "MZN", "MZN", 2, "MZN", "MTn"],
      // Namibian dollari
      "NAD": [ "NAD", "NAD", 2, "NAD", "$"],
      // Nigerian naira
      "NGN": [ "NGN", "NGN", 2, "NGN", "₦"],
      // Nicaraguan córdoba (1988–1991)
      "NIC": [ "NIC", "NIC", 130, "NIC", "NIC"],
      // Nicaraguan córdoba
      "NIO": [ "NIO", "NIO", 2, "NIO", "C$"],
      // Alankomaiden guldeni
      "NLG": [ "NLG", "NLG", 130, "NLG", "NLG"],
      // Norjan kruunu
      "NOK": [ "NOK", "NOkr", 2, "NOkr", "kr"],
      // Nepalin rupia
      "NPR": [ "NPR", "NPR", 2, "NPR", "Rs"],
      // Uuden-Seelannin dollari
      "NZD": [ "NZD", "NZD", 2, "NZD", "$"],
      // Omanin rial
      "OMR": [ "OMR", "OMR", 3, "OMR", "Rial"],
      // Panaman balboa
      "PAB": [ "PAB", "B/.", 2, "B/.", "B/."],
      // Perun inti
      "PEI": [ "PEI", "PEI", 130, "PEI", "PEI"],
      // Perun sol
      "PEN": [ "PEN", "S/.", 2, "S/.", "S/."],
      // Perun sol (1863–1965)
      "PES": [ "PES", "PES", 130, "PES", "PES"],
      // Papua-Uuden-Guinean kina
      "PGK": [ "PGK", "PGK", 2, "PGK", "PGK"],
      // Filippiinien peso
      "PHP": [ "PHP", "PHP", 2, "PHP", "₱"],
      // Pakistanin rupia
      "PKR": [ "PKR", "PKRs.", 2, "PKRs.", "Rs"],
      // Puolan złoty
      "PLN": [ "PLN", "PLN", 2, "PLN", "zł"],
      // Puolan złoty (1950–1995)
      "PLZ": [ "PLZ", "PLZ", 130, "PLZ", "PLZ"],
      // Portugalin escudo
      "PTE": [ "PTE", "PTE", 130, "PTE", "PTE"],
      // Paraguayn guarani
      "PYG": [ "PYG", "PYG", 0, "PYG", "Gs"],
      // Qatarin rial
      "QAR": [ "QAR", "QAR", 2, "QAR", "Rial"],
      // Rhodesian dollari
      "RHD": [ "RHD", "RHD", 130, "RHD", "RHD"],
      // Romanian leu (1952–2006)
      "ROL": [ "ROL", "ROL", 130, "ROL", "ROL"],
      // Romanian leu
      "RON": [ "RON", "RON", 2, "RON", "RON"],
      // Serbian dinaari
      "RSD": [ "RSD", "RSD", 0, "RSD", "din"],
      // Venäjän rupla
      "RUB": [ "RUB", "руб.", 2, "руб.", "руб."],
      // Venäjän rupla (1991–1998)
      "RUR": [ "RUR", "RUR", 130, "RUR", "RUR"],
      // Ruandan frangi
      "RWF": [ "RWF", "RWF", 0, "RWF", "RF"],
      // Saudi-Arabian rial
      "SAR": [ "SAR", "SR", 2, "SR", "Rial"],
      // Salomonsaarten dollari
      "SBD": [ "SBD", "SBD", 2, "SBD", "$"],
      // Seychellien rupia
      "SCR": [ "SCR", "SCR", 2, "SCR", "SCR"],
      // Sudanin dinaari (1992–2007)
      "SDD": [ "SDD", "SDD", 130, "SDD", "SDD"],
      // Sudanin punta
      "SDG": [ "SDG", "SDG", 2, "SDG", "SDG"],
      // Sudanin punta (1957–1998)
      "SDP": [ "SDP", "SDP", 130, "SDP", "SDP"],
      // Ruotsin kruunu
      "SEK": [ "SEK", "kr", 2, "kr", "kr"],
      // Singaporen dollari
      "SGD": [ "SGD", "S$", 2, "S$", "$"],
      // Saint Helenan punta
      "SHP": [ "SHP", "SHP", 2, "SHP", "£"],
      // Slovenian tolar
      "SIT": [ "SIT", "SIT", 130, "SIT", "SIT"],
      // Slovakian koruna
      "SKK": [ "SKK", "SKK", 130, "SKK", "SKK"],
      // Sierra Leonen leone
      "SLL": [ "SLL", "SLL", 0, "SLL", "SLL"],
      // Somalian šillinki
      "SOS": [ "SOS", "SOS", 0, "SOS", "SOS"],
      // Surinamen dollari
      "SRD": [ "SRD", "SRD", 2, "SRD", "$"],
      // Surinamen guldeni
      "SRG": [ "SRG", "SRG", 130, "SRG", "SRG"],
      // Etelä-Sudanin punta
      "SSP": [ "SSP", "SSP", 2, "SSP", "SSP"],
      // São Tomén ja Príncipen dobra (1977–2017)
      "STD": [ "STD", "STD", 128, "STD", "Db"],
      // São Tomén ja Príncipen dobra
      "STN": [ "STN", "STN", 2, "STN", "STN"],
      // Neuvostoliiton rupla
      "SUR": [ "SUR", "SUR", 130, "SUR", "SUR"],
      // El Salvadorin colón
      "SVC": [ "SVC", "SVC", 130, "SVC", "SVC"],
      // Syyrian punta
      "SYP": [ "SYP", "SYP", 0, "SYP", "£"],
      // Swazimaan lilangeni
      "SZL": [ "SZL", "SZL", 2, "SZL", "SZL"],
      // Thaimaan baht
      "THB": [ "THB", "THB", 2, "THB", "฿"],
      // Tadžikistanin rupla
      "TJR": [ "TJR", "TJR", 130, "TJR", "TJR"],
      // Tadžikistanin somoni
      "TJS": [ "TJS", "TJS", 2, "TJS", "Som"],
      // Turkmenistanin manat (1993–2009)
      "TMM": [ "TMM", "TMM", 128, "TMM", "TMM"],
      // Turkmenistanin manat
      "TMT": [ "TMT", "TMT", 2, "TMT", "TMT"],
      // Tunisian dinaari
      "TND": [ "TND", "TND", 3, "TND", "din"],
      // Tongan pa’anga
      "TOP": [ "TOP", "TOP", 2, "TOP", "T$"],
      // Timorin escudo
      "TPE": [ "TPE", "TPE", 130, "TPE", "TPE"],
      // Turkin liira (1922–2005)
      "TRL": [ "TRL", "TRL", 128, "TRL", "TRL"],
      // Turkin liira
      "TRY": [ "TRY", "TL", 2, "YTL", "TL"],
      // Trinidadin ja Tobagon dollari
      "TTD": [ "TTD", "TTD", 2, "TTD", "$"],
      // Taiwanin uusi dollari
      "TWD": [ "TWD", "NT$", 2, "NT$", "NT$"],
      // Tansanian šillinki
      "TZS": [ "TZS", "TZS", 2, "TZS", "TSh"],
      // Ukrainan hryvnia
      "UAH": [ "UAH", "UAH", 2, "UAH", "₴"],
      // Ukrainan karbovanetz
      "UAK": [ "UAK", "UAK", 130, "UAK", "UAK"],
      // Ugandan šillinki (1966–1987)
      "UGS": [ "UGS", "UGS", 130, "UGS", "UGS"],
      // Ugandan šillinki
      "UGX": [ "UGX", "UGX", 0, "UGX", "UGX"],
      // Yhdysvaltain dollari
      "USD": [ "USD", "$", 2, "US$", "$"],
      // Yhdysvaltain dollari (seuraava päivä)
      "USN": [ "USN", "USN", 130, "USN", "USN"],
      // Yhdysvaltain dollari (sama päivä)
      "USS": [ "USS", "USS", 130, "USS", "USS"],
      // Uruguayn peso en unidades indexadas
      "UYI": [ "UYI", "UYI", 128, "UYI", "UYI"],
      // Uruguayn peso (1975–1993)
      "UYP": [ "UYP", "UYP", 130, "UYP", "UYP"],
      // Uruguayn peso
      "UYU": [ "UYU", "UY$", 2, "UY$", "$"],
      // Uzbekistanin som
      "UZS": [ "UZS", "UZS", 2, "UZS", "soʼm"],
      // Venezuelan bolívar (1871–2008)
      "VEB": [ "VEB", "VEB", 130, "VEB", "VEB"],
      // Venezuelan bolívar (2008–2018)
      "VEF": [ "VEF", "VEF", 130, "VEF", "Bs"],
      // Venezuelan suvereeni bolívar
      "VES": [ "VES", "VES", 2, "VES", "VES"],
      // Vietnamin dong
      "VND": [ "VND", "₫", 24, "₫", "₫"],
      // Vietnamin dong (1978–1985)
      "VNN": [ "VNN", "VNN", 130, "VNN", "VNN"],
      // Vanuatun vatu
      "VUV": [ "VUV", "VUV", 0, "VUV", "VUV"],
      // Samoan tala
      "WST": [ "WST", "WST", 2, "WST", "WST"],
      // CFA-frangi BEAC
      "XAF": [ "XAF", "FCFA", 0, "FCFA", "FCFA"],
      // hopea
      "XAG": [ "XAG", "XAG", 130, "XAG", "XAG"],
      // kulta
      "XAU": [ "XAU", "XAU", 130, "XAU", "XAU"],
      // EURCO
      "XBA": [ "XBA", "XBA", 130, "XBA", "XBA"],
      // Euroopan rahayksikkö (EMU)
      "XBB": [ "XBB", "XBB", 130, "XBB", "XBB"],
      // EUA (XBC)
      "XBC": [ "XBC", "XBC", 130, "XBC", "XBC"],
      // EUA (XBD)
      "XBD": [ "XBD", "XBD", 130, "XBD", "XBD"],
      // Itä-Karibian dollari
      "XCD": [ "XCD", "XCD", 2, "XCD", "$"],
      // erityisnosto-oikeus (SDR)
      "XDR": [ "XDR", "XDR", 130, "XDR", "XDR"],
      // Euroopan valuuttayksikkö (ECU)
      "XEU": [ "XEU", "XEU", 130, "XEU", "XEU"],
      // Ranskan kultafrangi
      "XFO": [ "XFO", "XFO", 130, "XFO", "XFO"],
      // Ranskan UIC-frangi
      "XFU": [ "XFU", "XFU", 130, "XFU", "XFU"],
      // CFA-frangi BCEAO
      "XOF": [ "XOF", "CFA", 0, "CFA", "CFA"],
      // palladium
      "XPD": [ "XPD", "XPD", 130, "XPD", "XPD"],
      // CFP-frangi
      "XPF": [ "XPF", "XPF", 0, "XPF", "FCFP"],
      // platina
      "XPT": [ "XPT", "XPT", 130, "XPT", "XPT"],
      // RINET-rahastot
      "XRE": [ "XRE", "XRE", 130, "XRE", "XRE"],
      // etelä-amerikkalaisen ALBA:n laskentayksikkö sucre
      "XSU": [ "XSU", "XSU", 130, "XSU", "XSU"],
      // testaustarkoitukseen varattu valuuttakoodi
      "XTS": [ "XTS", "XTS", 130, "XTS", "XTS"],
      // afrikkalainen AfDB-laskentayksikkö
      "XUA": [ "XUA", "XUA", 130, "XUA", "XUA"],
      // tuntematon rahayksikkö
      "XXX": [ "XXX", "XXX", 130, "XXX", "XXX"],
      // Jemenin dinaari
      "YDD": [ "YDD", "YDD", 130, "YDD", "YDD"],
      // Jemenin rial
      "YER": [ "YER", "YER", 0, "YER", "Rial"],
      // Jugoslavian kova dinaari (1966–1990)
      "YUD": [ "YUD", "YUD", 130, "YUD", "YUD"],
      // Jugoslavian uusi dinaari (1994–2002)
      "YUM": [ "YUM", "YUM", 130, "YUM", "YUM"],
      // Jugoslavian vaihdettava dinaari (1990–1992)
      "YUN": [ "YUN", "YUN", 130, "YUN", "YUN"],
      // Jugoslavian uudistettu dinaari (1992–1993)
      "YUR": [ "YUR", "YUR", 130, "YUR", "YUR"],
      // Etelä-Afrikan rahoitusrandi
      "ZAL": [ "ZAL", "ZAL", 130, "ZAL", "ZAL"],
      // Etelä-Afrikan randi
      "ZAR": [ "ZAR", "ZAR", 2, "ZAR", "R"],
      // Sambian kwacha (1968–2012)
      "ZMK": [ "ZMK", "ZMK", 128, "ZMK", "ZWK"],
      // Sambian kwacha
      "ZMW": [ "ZMW", "ZMW", 2, "ZMW", "ZMW"],
      // Zairen uusi zaire (1993–1998)
      "ZRN": [ "ZRN", "ZRN", 130, "ZRN", "ZRN"],
      // Zairen zaire (1971–1993)
      "ZRZ": [ "ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"],
      // Zimbabwen dollari (1980–2008)
      "ZWD": [ "ZWD", "ZWD", 128, "ZWD", "ZWD"],
      // Zimbabwen dollari (2009)
      "ZWL": [ "ZWL", "ZWL", 130, "ZWL", "ZWL"],
      // Zimbabwen dollari (2008)
      "ZWR": [ "ZWR", "ZWR", 130, "ZWR", "ZWR"],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("ADP", "Andorran peseta");
    result.put("AED", "Arabiemiirikuntien dirhami");
    result.put("AFA", "Afganistanin afgaani (1927–2002)");
    result.put("AFN", "Afganistanin afgaani");
    result.put("ALK", "Albanian lek (1946–1965)");
    result.put("ALL", "Albanian lek");
    result.put("AMD", "Armenian dram");
    result.put("ANG", "Alankomaiden Antillien guldeni");
    result.put("AOA", "Angolan kwanza");
    result.put("AOK", "Angolan kwanza (1977–1991)");
    result.put("AON", "Angolan uusi kwanza (1990–2000)");
    result.put("AOR", "Angolan kwanza reajustado (1995–1999)");
    result.put("ARA", "Argentiinan austral");
    result.put("ARL", "Argentiinan ley-peso (1970–1983)");
    result.put("ARM", "Argentiinan peso (1881–1970)");
    result.put("ARP", "Argentiinan peso (1983–1985)");
    result.put("ARS", "Argentiinan peso");
    result.put("ATS", "Itävallan šillinki");
    result.put("AUD", "Australian dollari");
    result.put("AWG", "Aruban floriini");
    result.put("AZM", "Azerbaidžanin manat (1993–2006)");
    result.put("AZN", "Azerbaidžanin manat");
    result.put("BAD", "Bosnia-Hertsegovinan dinaari (1992–1994)");
    result.put("BAM", "Bosnia-Hertsegovinan vaihdettava markka");
    result.put("BAN", "Bosnia-Hertsegovinan uusi dinaari (1994–1997)");
    result.put("BBD", "Barbadosin dollari");
    result.put("BDT", "Bangladeshin taka");
    result.put("BEC", "Belgian vaihdettava frangi");
    result.put("BEF", "Belgian frangi");
    result.put("BEL", "Belgian rahoitusfrangi");
    result.put("BGL", "Bulgarian kova lev");
    result.put("BGM", "Bulgarian sosialistinen lev");
    result.put("BGN", "Bulgarian lev");
    result.put("BGO", "Bulgarian lev (1879–1952)");
    result.put("BHD", "Bahrainin dinaari");
    result.put("BIF", "Burundin frangi");
    result.put("BMD", "Bermudan dollari");
    result.put("BND", "Brunein dollari");
    result.put("BOB", "Bolivian boliviano");
    result.put("BOL", "Bolivian boliviano (1863–1963)");
    result.put("BOP", "Bolivian peso");
    result.put("BOV", "Bolivian mvdol");
    result.put("BRB", "Brasilian uusi cruzeiro (1967–1986)");
    result.put("BRC", "Brasilian cruzado (1986–1989)");
    result.put("BRE", "Brasilian cruzeiro (1990–1993)");
    result.put("BRL", "Brasilian real");
    result.put("BRN", "Brasilian uusi cruzado (1989–1990)");
    result.put("BRR", "Brasilian cruzeiro (1993–1994)");
    result.put("BRZ", "Brasilian cruzeiro (1942–1967)");
    result.put("BSD", "Bahaman dollari");
    result.put("BTN", "Bhutanin ngultrum");
    result.put("BUK", "Burman kyat");
    result.put("BWP", "Botswanan pula");
    result.put("BYB", "Valko-Venäjän uusi rupla (1994–1999)");
    result.put("BYN", "Valko-Venäjän rupla");
    result.put("BYR", "Valko-Venäjän rupla (2000–2016)");
    result.put("BZD", "Belizen dollari");
    result.put("CAD", "Kanadan dollari");
    result.put("CDF", "Kongon frangi");
    result.put("CHE", "Sveitsin WIR-euro");
    result.put("CHF", "Sveitsin frangi");
    result.put("CHW", "Sveitsin WIR-frangi");
    result.put("CLE", "Chilen escudo");
    result.put("CLF", "Chilen unidades de fomento");
    result.put("CLP", "Chilen peso");
    result.put("CNH", "Kiinan juan (offshore)");
    result.put("CNX", "Kiinan kansanpankin dollari");
    result.put("CNY", "Kiinan juan");
    result.put("COP", "Kolumbian peso");
    result.put("COU", "Kolumbian unidad de valor real");
    result.put("CRC", "Costa Rican colón");
    result.put("CSD", "Serbian dinaari (2002–2006)");
    result.put("CSK", "Tšekkoslovakian kova koruna");
    result.put("CUC", "Kuuban vaihdettava peso");
    result.put("CUP", "Kuuban peso");
    result.put("CVE", "Kap Verden escudo");
    result.put("CYP", "Kyproksen punta");
    result.put("CZK", "Tšekin koruna");
    result.put("DDM", "Itä-Saksan markka");
    result.put("DEM", "Saksan markka");
    result.put("DJF", "Djiboutin frangi");
    result.put("DKK", "Tanskan kruunu");
    result.put("DOP", "Dominikaanisen tasavallan peso");
    result.put("DZD", "Algerian dinaari");
    result.put("ECS", "Ecuadorin sucre");
    result.put("ECV", "Ecuadorin UVC");
    result.put("EEK", "Viron kruunu");
    result.put("EGP", "Egyptin punta");
    result.put("ERN", "Eritrean nakfa");
    result.put("ESA", "Espanjan peseta (A-tili)");
    result.put("ESB", "Espanjan peseta (vaihdettava tili)");
    result.put("ESP", "Espanjan peseta");
    result.put("ETB", "Etiopian birr");
    result.put("EUR", "euro");
    result.put("FIM", "Suomen markka");
    result.put("FJD", "Fidžin dollari");
    result.put("FKP", "Falklandinsaarten punta");
    result.put("FRF", "Ranskan frangi");
    result.put("GBP", "Englannin punta");
    result.put("GEK", "Georgian kuponkilari");
    result.put("GEL", "Georgian lari");
    result.put("GHC", "Ghanan cedi (1979–2007)");
    result.put("GHS", "Ghanan cedi");
    result.put("GIP", "Gibraltarin punta");
    result.put("GMD", "Gambian dalasi");
    result.put("GNF", "Guinean frangi");
    result.put("GNS", "Guinean syli");
    result.put("GQE", "Päiväntasaajan Guinean ekwele");
    result.put("GRD", "Kreikan drakma");
    result.put("GTQ", "Guatemalan quetzal");
    result.put("GWE", "Portugalin Guinean escudo");
    result.put("GWP", "Guinea-Bissaun peso");
    result.put("GYD", "Guyanan dollari");
    result.put("HKD", "Hongkongin dollari");
    result.put("HNL", "Hondurasin lempira");
    result.put("HRD", "Kroatian dinaari");
    result.put("HRK", "Kroatian kuna");
    result.put("HTG", "Haitin gourde");
    result.put("HUF", "Unkarin forintti");
    result.put("IDR", "Indonesian rupia");
    result.put("IEP", "Irlannin punta");
    result.put("ILP", "Israelin punta");
    result.put("ILR", "Israelin sekeli (1980–1985)");
    result.put("ILS", "Israelin uusi sekeli");
    result.put("INR", "Intian rupia");
    result.put("IQD", "Irakin dinaari");
    result.put("IRR", "Iranin rial");
    result.put("ISJ", "Islannin kruunu (1918–1981)");
    result.put("ISK", "Islannin kruunu");
    result.put("ITL", "Italian liira");
    result.put("JMD", "Jamaikan dollari");
    result.put("JOD", "Jordanian dinaari");
    result.put("JPY", "Japanin jeni");
    result.put("KES", "Kenian šillinki");
    result.put("KGS", "Kirgisian som");
    result.put("KHR", "Kambodžan riel");
    result.put("KMF", "Komorien frangi");
    result.put("KPW", "Pohjois-Korean won");
    result.put("KRH", "Etelä-Korean hwan (1953–1962)");
    result.put("KRO", "Etelä-Korean won (1945–1953)");
    result.put("KRW", "Etelä-Korean won");
    result.put("KWD", "Kuwaitin dinaari");
    result.put("KYD", "Caymansaarten dollari");
    result.put("KZT", "Kazakstanin tenge");
    result.put("LAK", "Laosin kip");
    result.put("LBP", "Libanonin punta");
    result.put("LKR", "Sri Lankan rupia");
    result.put("LRD", "Liberian dollari");
    result.put("LSL", "Lesothon loti");
    result.put("LTL", "Liettuan liti");
    result.put("LTT", "Liettuan talonas");
    result.put("LUC", "Luxemburgin vaihdettava frangi");
    result.put("LUF", "Luxemburgin frangi");
    result.put("LUL", "Luxemburgin rahoitusfrangi");
    result.put("LVL", "Latvian lati");
    result.put("LVR", "Latvian rupla");
    result.put("LYD", "Libyan dinaari");
    result.put("MAD", "Marokon dirhami");
    result.put("MAF", "Marokon frangi");
    result.put("MCF", "Monacon frangi");
    result.put("MDC", "Moldovan kuponkileu");
    result.put("MDL", "Moldovan leu");
    result.put("MGA", "Madagaskarin ariary");
    result.put("MGF", "Madagaskarin frangi");
    result.put("MKD", "Makedonian denaari");
    result.put("MKN", "Makedonian dinaari (1992–1993)");
    result.put("MLF", "Malin frangi");
    result.put("MMK", "Myanmarin kyat");
    result.put("MNT", "Mongolian tugrik");
    result.put("MOP", "Macaon pataca");
    result.put("MRO", "Mauritanian ouguiya (1973–2017)");
    result.put("MRU", "Mauritanian ouguiya");
    result.put("MTL", "Maltan liira");
    result.put("MTP", "Maltan punta");
    result.put("MUR", "Mauritiuksen rupia");
    result.put("MVP", "Malediivien rupia (1947–1981)");
    result.put("MVR", "Malediivien rufiyaa");
    result.put("MWK", "Malawin kwacha");
    result.put("MXN", "Meksikon peso");
    result.put("MXP", "Meksikon hopeapeso (1861–1992)");
    result.put("MXV", "Meksikon UDI");
    result.put("MYR", "Malesian ringgit");
    result.put("MZE", "Mosambikin escudo");
    result.put("MZM", "Mosambikin metical (1980–2006)");
    result.put("MZN", "Mosambikin metical");
    result.put("NAD", "Namibian dollari");
    result.put("NGN", "Nigerian naira");
    result.put("NIC", "Nicaraguan córdoba (1988–1991)");
    result.put("NIO", "Nicaraguan córdoba");
    result.put("NLG", "Alankomaiden guldeni");
    result.put("NOK", "Norjan kruunu");
    result.put("NPR", "Nepalin rupia");
    result.put("NZD", "Uuden-Seelannin dollari");
    result.put("OMR", "Omanin rial");
    result.put("PAB", "Panaman balboa");
    result.put("PEI", "Perun inti");
    result.put("PEN", "Perun sol");
    result.put("PES", "Perun sol (1863–1965)");
    result.put("PGK", "Papua-Uuden-Guinean kina");
    result.put("PHP", "Filippiinien peso");
    result.put("PKR", "Pakistanin rupia");
    result.put("PLN", "Puolan złoty");
    result.put("PLZ", "Puolan złoty (1950–1995)");
    result.put("PTE", "Portugalin escudo");
    result.put("PYG", "Paraguayn guarani");
    result.put("QAR", "Qatarin rial");
    result.put("RHD", "Rhodesian dollari");
    result.put("ROL", "Romanian leu (1952–2006)");
    result.put("RON", "Romanian leu");
    result.put("RSD", "Serbian dinaari");
    result.put("RUB", "Venäjän rupla");
    result.put("RUR", "Venäjän rupla (1991–1998)");
    result.put("RWF", "Ruandan frangi");
    result.put("SAR", "Saudi-Arabian rial");
    result.put("SBD", "Salomonsaarten dollari");
    result.put("SCR", "Seychellien rupia");
    result.put("SDD", "Sudanin dinaari (1992–2007)");
    result.put("SDG", "Sudanin punta");
    result.put("SDP", "Sudanin punta (1957–1998)");
    result.put("SEK", "Ruotsin kruunu");
    result.put("SGD", "Singaporen dollari");
    result.put("SHP", "Saint Helenan punta");
    result.put("SIT", "Slovenian tolar");
    result.put("SKK", "Slovakian koruna");
    result.put("SLL", "Sierra Leonen leone");
    result.put("SOS", "Somalian šillinki");
    result.put("SRD", "Surinamen dollari");
    result.put("SRG", "Surinamen guldeni");
    result.put("SSP", "Etelä-Sudanin punta");
    result.put("STD", "São Tomén ja Príncipen dobra (1977–2017)");
    result.put("STN", "São Tomén ja Príncipen dobra");
    result.put("SUR", "Neuvostoliiton rupla");
    result.put("SVC", "El Salvadorin colón");
    result.put("SYP", "Syyrian punta");
    result.put("SZL", "Swazimaan lilangeni");
    result.put("THB", "Thaimaan baht");
    result.put("TJR", "Tadžikistanin rupla");
    result.put("TJS", "Tadžikistanin somoni");
    result.put("TMM", "Turkmenistanin manat (1993–2009)");
    result.put("TMT", "Turkmenistanin manat");
    result.put("TND", "Tunisian dinaari");
    result.put("TOP", "Tongan pa’anga");
    result.put("TPE", "Timorin escudo");
    result.put("TRL", "Turkin liira (1922–2005)");
    result.put("TRY", "Turkin liira");
    result.put("TTD", "Trinidadin ja Tobagon dollari");
    result.put("TWD", "Taiwanin uusi dollari");
    result.put("TZS", "Tansanian šillinki");
    result.put("UAH", "Ukrainan hryvnia");
    result.put("UAK", "Ukrainan karbovanetz");
    result.put("UGS", "Ugandan šillinki (1966–1987)");
    result.put("UGX", "Ugandan šillinki");
    result.put("USD", "Yhdysvaltain dollari");
    result.put("USN", "Yhdysvaltain dollari (seuraava päivä)");
    result.put("USS", "Yhdysvaltain dollari (sama päivä)");
    result.put("UYI", "Uruguayn peso en unidades indexadas");
    result.put("UYP", "Uruguayn peso (1975–1993)");
    result.put("UYU", "Uruguayn peso");
    result.put("UZS", "Uzbekistanin som");
    result.put("VEB", "Venezuelan bolívar (1871–2008)");
    result.put("VEF", "Venezuelan bolívar (2008–2018)");
    result.put("VES", "Venezuelan suvereeni bolívar");
    result.put("VND", "Vietnamin dong");
    result.put("VNN", "Vietnamin dong (1978–1985)");
    result.put("VUV", "Vanuatun vatu");
    result.put("WST", "Samoan tala");
    result.put("XAF", "CFA-frangi BEAC");
    result.put("XAG", "hopea");
    result.put("XAU", "kulta");
    result.put("XBA", "EURCO");
    result.put("XBB", "Euroopan rahayksikkö (EMU)");
    result.put("XBC", "EUA (XBC)");
    result.put("XBD", "EUA (XBD)");
    result.put("XCD", "Itä-Karibian dollari");
    result.put("XDR", "erityisnosto-oikeus (SDR)");
    result.put("XEU", "Euroopan valuuttayksikkö (ECU)");
    result.put("XFO", "Ranskan kultafrangi");
    result.put("XFU", "Ranskan UIC-frangi");
    result.put("XOF", "CFA-frangi BCEAO");
    result.put("XPD", "palladium");
    result.put("XPF", "CFP-frangi");
    result.put("XPT", "platina");
    result.put("XRE", "RINET-rahastot");
    result.put("XSU", "etelä-amerikkalaisen ALBA:n laskentayksikkö sucre");
    result.put("XTS", "testaustarkoitukseen varattu valuuttakoodi");
    result.put("XUA", "afrikkalainen AfDB-laskentayksikkö");
    result.put("XXX", "tuntematon rahayksikkö");
    result.put("YDD", "Jemenin dinaari");
    result.put("YER", "Jemenin rial");
    result.put("YUD", "Jugoslavian kova dinaari (1966–1990)");
    result.put("YUM", "Jugoslavian uusi dinaari (1994–2002)");
    result.put("YUN", "Jugoslavian vaihdettava dinaari (1990–1992)");
    result.put("YUR", "Jugoslavian uudistettu dinaari (1992–1993)");
    result.put("ZAL", "Etelä-Afrikan rahoitusrandi");
    result.put("ZAR", "Etelä-Afrikan randi");
    result.put("ZMK", "Sambian kwacha (1968–2012)");
    result.put("ZMW", "Sambian kwacha");
    result.put("ZRN", "Zairen uusi zaire (1993–1998)");
    result.put("ZRZ", "Zairen zaire (1971–1993)");
    result.put("ZWD", "Zimbabwen dollari (1980–2008)");
    result.put("ZWL", "Zimbabwen dollari (2009)");
    result.put("ZWR", "Zimbabwen dollari (2008)");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "ADP": "Andorran peseta",
      "AED": "Arabiemiirikuntien dirhami",
      "AFA": "Afganistanin afgaani (1927–2002)",
      "AFN": "Afganistanin afgaani",
      "ALK": "Albanian lek (1946–1965)",
      "ALL": "Albanian lek",
      "AMD": "Armenian dram",
      "ANG": "Alankomaiden Antillien guldeni",
      "AOA": "Angolan kwanza",
      "AOK": "Angolan kwanza (1977–1991)",
      "AON": "Angolan uusi kwanza (1990–2000)",
      "AOR": "Angolan kwanza reajustado (1995–1999)",
      "ARA": "Argentiinan austral",
      "ARL": "Argentiinan ley-peso (1970–1983)",
      "ARM": "Argentiinan peso (1881–1970)",
      "ARP": "Argentiinan peso (1983–1985)",
      "ARS": "Argentiinan peso",
      "ATS": "Itävallan šillinki",
      "AUD": "Australian dollari",
      "AWG": "Aruban floriini",
      "AZM": "Azerbaidžanin manat (1993–2006)",
      "AZN": "Azerbaidžanin manat",
      "BAD": "Bosnia-Hertsegovinan dinaari (1992–1994)",
      "BAM": "Bosnia-Hertsegovinan vaihdettava markka",
      "BAN": "Bosnia-Hertsegovinan uusi dinaari (1994–1997)",
      "BBD": "Barbadosin dollari",
      "BDT": "Bangladeshin taka",
      "BEC": "Belgian vaihdettava frangi",
      "BEF": "Belgian frangi",
      "BEL": "Belgian rahoitusfrangi",
      "BGL": "Bulgarian kova lev",
      "BGM": "Bulgarian sosialistinen lev",
      "BGN": "Bulgarian lev",
      "BGO": "Bulgarian lev (1879–1952)",
      "BHD": "Bahrainin dinaari",
      "BIF": "Burundin frangi",
      "BMD": "Bermudan dollari",
      "BND": "Brunein dollari",
      "BOB": "Bolivian boliviano",
      "BOL": "Bolivian boliviano (1863–1963)",
      "BOP": "Bolivian peso",
      "BOV": "Bolivian mvdol",
      "BRB": "Brasilian uusi cruzeiro (1967–1986)",
      "BRC": "Brasilian cruzado (1986–1989)",
      "BRE": "Brasilian cruzeiro (1990–1993)",
      "BRL": "Brasilian real",
      "BRN": "Brasilian uusi cruzado (1989–1990)",
      "BRR": "Brasilian cruzeiro (1993–1994)",
      "BRZ": "Brasilian cruzeiro (1942–1967)",
      "BSD": "Bahaman dollari",
      "BTN": "Bhutanin ngultrum",
      "BUK": "Burman kyat",
      "BWP": "Botswanan pula",
      "BYB": "Valko-Venäjän uusi rupla (1994–1999)",
      "BYN": "Valko-Venäjän rupla",
      "BYR": "Valko-Venäjän rupla (2000–2016)",
      "BZD": "Belizen dollari",
      "CAD": "Kanadan dollari",
      "CDF": "Kongon frangi",
      "CHE": "Sveitsin WIR-euro",
      "CHF": "Sveitsin frangi",
      "CHW": "Sveitsin WIR-frangi",
      "CLE": "Chilen escudo",
      "CLF": "Chilen unidades de fomento",
      "CLP": "Chilen peso",
      "CNH": "Kiinan juan (offshore)",
      "CNX": "Kiinan kansanpankin dollari",
      "CNY": "Kiinan juan",
      "COP": "Kolumbian peso",
      "COU": "Kolumbian unidad de valor real",
      "CRC": "Costa Rican colón",
      "CSD": "Serbian dinaari (2002–2006)",
      "CSK": "Tšekkoslovakian kova koruna",
      "CUC": "Kuuban vaihdettava peso",
      "CUP": "Kuuban peso",
      "CVE": "Kap Verden escudo",
      "CYP": "Kyproksen punta",
      "CZK": "Tšekin koruna",
      "DDM": "Itä-Saksan markka",
      "DEM": "Saksan markka",
      "DJF": "Djiboutin frangi",
      "DKK": "Tanskan kruunu",
      "DOP": "Dominikaanisen tasavallan peso",
      "DZD": "Algerian dinaari",
      "ECS": "Ecuadorin sucre",
      "ECV": "Ecuadorin UVC",
      "EEK": "Viron kruunu",
      "EGP": "Egyptin punta",
      "ERN": "Eritrean nakfa",
      "ESA": "Espanjan peseta (A-tili)",
      "ESB": "Espanjan peseta (vaihdettava tili)",
      "ESP": "Espanjan peseta",
      "ETB": "Etiopian birr",
      "EUR": "euro",
      "FIM": "Suomen markka",
      "FJD": "Fidžin dollari",
      "FKP": "Falklandinsaarten punta",
      "FRF": "Ranskan frangi",
      "GBP": "Englannin punta",
      "GEK": "Georgian kuponkilari",
      "GEL": "Georgian lari",
      "GHC": "Ghanan cedi (1979–2007)",
      "GHS": "Ghanan cedi",
      "GIP": "Gibraltarin punta",
      "GMD": "Gambian dalasi",
      "GNF": "Guinean frangi",
      "GNS": "Guinean syli",
      "GQE": "Päiväntasaajan Guinean ekwele",
      "GRD": "Kreikan drakma",
      "GTQ": "Guatemalan quetzal",
      "GWE": "Portugalin Guinean escudo",
      "GWP": "Guinea-Bissaun peso",
      "GYD": "Guyanan dollari",
      "HKD": "Hongkongin dollari",
      "HNL": "Hondurasin lempira",
      "HRD": "Kroatian dinaari",
      "HRK": "Kroatian kuna",
      "HTG": "Haitin gourde",
      "HUF": "Unkarin forintti",
      "IDR": "Indonesian rupia",
      "IEP": "Irlannin punta",
      "ILP": "Israelin punta",
      "ILR": "Israelin sekeli (1980–1985)",
      "ILS": "Israelin uusi sekeli",
      "INR": "Intian rupia",
      "IQD": "Irakin dinaari",
      "IRR": "Iranin rial",
      "ISJ": "Islannin kruunu (1918–1981)",
      "ISK": "Islannin kruunu",
      "ITL": "Italian liira",
      "JMD": "Jamaikan dollari",
      "JOD": "Jordanian dinaari",
      "JPY": "Japanin jeni",
      "KES": "Kenian šillinki",
      "KGS": "Kirgisian som",
      "KHR": "Kambodžan riel",
      "KMF": "Komorien frangi",
      "KPW": "Pohjois-Korean won",
      "KRH": "Etelä-Korean hwan (1953–1962)",
      "KRO": "Etelä-Korean won (1945–1953)",
      "KRW": "Etelä-Korean won",
      "KWD": "Kuwaitin dinaari",
      "KYD": "Caymansaarten dollari",
      "KZT": "Kazakstanin tenge",
      "LAK": "Laosin kip",
      "LBP": "Libanonin punta",
      "LKR": "Sri Lankan rupia",
      "LRD": "Liberian dollari",
      "LSL": "Lesothon loti",
      "LTL": "Liettuan liti",
      "LTT": "Liettuan talonas",
      "LUC": "Luxemburgin vaihdettava frangi",
      "LUF": "Luxemburgin frangi",
      "LUL": "Luxemburgin rahoitusfrangi",
      "LVL": "Latvian lati",
      "LVR": "Latvian rupla",
      "LYD": "Libyan dinaari",
      "MAD": "Marokon dirhami",
      "MAF": "Marokon frangi",
      "MCF": "Monacon frangi",
      "MDC": "Moldovan kuponkileu",
      "MDL": "Moldovan leu",
      "MGA": "Madagaskarin ariary",
      "MGF": "Madagaskarin frangi",
      "MKD": "Makedonian denaari",
      "MKN": "Makedonian dinaari (1992–1993)",
      "MLF": "Malin frangi",
      "MMK": "Myanmarin kyat",
      "MNT": "Mongolian tugrik",
      "MOP": "Macaon pataca",
      "MRO": "Mauritanian ouguiya (1973–2017)",
      "MRU": "Mauritanian ouguiya",
      "MTL": "Maltan liira",
      "MTP": "Maltan punta",
      "MUR": "Mauritiuksen rupia",
      "MVP": "Malediivien rupia (1947–1981)",
      "MVR": "Malediivien rufiyaa",
      "MWK": "Malawin kwacha",
      "MXN": "Meksikon peso",
      "MXP": "Meksikon hopeapeso (1861–1992)",
      "MXV": "Meksikon UDI",
      "MYR": "Malesian ringgit",
      "MZE": "Mosambikin escudo",
      "MZM": "Mosambikin metical (1980–2006)",
      "MZN": "Mosambikin metical",
      "NAD": "Namibian dollari",
      "NGN": "Nigerian naira",
      "NIC": "Nicaraguan córdoba (1988–1991)",
      "NIO": "Nicaraguan córdoba",
      "NLG": "Alankomaiden guldeni",
      "NOK": "Norjan kruunu",
      "NPR": "Nepalin rupia",
      "NZD": "Uuden-Seelannin dollari",
      "OMR": "Omanin rial",
      "PAB": "Panaman balboa",
      "PEI": "Perun inti",
      "PEN": "Perun sol",
      "PES": "Perun sol (1863–1965)",
      "PGK": "Papua-Uuden-Guinean kina",
      "PHP": "Filippiinien peso",
      "PKR": "Pakistanin rupia",
      "PLN": "Puolan złoty",
      "PLZ": "Puolan złoty (1950–1995)",
      "PTE": "Portugalin escudo",
      "PYG": "Paraguayn guarani",
      "QAR": "Qatarin rial",
      "RHD": "Rhodesian dollari",
      "ROL": "Romanian leu (1952–2006)",
      "RON": "Romanian leu",
      "RSD": "Serbian dinaari",
      "RUB": "Venäjän rupla",
      "RUR": "Venäjän rupla (1991–1998)",
      "RWF": "Ruandan frangi",
      "SAR": "Saudi-Arabian rial",
      "SBD": "Salomonsaarten dollari",
      "SCR": "Seychellien rupia",
      "SDD": "Sudanin dinaari (1992–2007)",
      "SDG": "Sudanin punta",
      "SDP": "Sudanin punta (1957–1998)",
      "SEK": "Ruotsin kruunu",
      "SGD": "Singaporen dollari",
      "SHP": "Saint Helenan punta",
      "SIT": "Slovenian tolar",
      "SKK": "Slovakian koruna",
      "SLL": "Sierra Leonen leone",
      "SOS": "Somalian šillinki",
      "SRD": "Surinamen dollari",
      "SRG": "Surinamen guldeni",
      "SSP": "Etelä-Sudanin punta",
      "STD": "São Tomén ja Príncipen dobra (1977–2017)",
      "STN": "São Tomén ja Príncipen dobra",
      "SUR": "Neuvostoliiton rupla",
      "SVC": "El Salvadorin colón",
      "SYP": "Syyrian punta",
      "SZL": "Swazimaan lilangeni",
      "THB": "Thaimaan baht",
      "TJR": "Tadžikistanin rupla",
      "TJS": "Tadžikistanin somoni",
      "TMM": "Turkmenistanin manat (1993–2009)",
      "TMT": "Turkmenistanin manat",
      "TND": "Tunisian dinaari",
      "TOP": "Tongan pa’anga",
      "TPE": "Timorin escudo",
      "TRL": "Turkin liira (1922–2005)",
      "TRY": "Turkin liira",
      "TTD": "Trinidadin ja Tobagon dollari",
      "TWD": "Taiwanin uusi dollari",
      "TZS": "Tansanian šillinki",
      "UAH": "Ukrainan hryvnia",
      "UAK": "Ukrainan karbovanetz",
      "UGS": "Ugandan šillinki (1966–1987)",
      "UGX": "Ugandan šillinki",
      "USD": "Yhdysvaltain dollari",
      "USN": "Yhdysvaltain dollari (seuraava päivä)",
      "USS": "Yhdysvaltain dollari (sama päivä)",
      "UYI": "Uruguayn peso en unidades indexadas",
      "UYP": "Uruguayn peso (1975–1993)",
      "UYU": "Uruguayn peso",
      "UZS": "Uzbekistanin som",
      "VEB": "Venezuelan bolívar (1871–2008)",
      "VEF": "Venezuelan bolívar (2008–2018)",
      "VES": "Venezuelan suvereeni bolívar",
      "VND": "Vietnamin dong",
      "VNN": "Vietnamin dong (1978–1985)",
      "VUV": "Vanuatun vatu",
      "WST": "Samoan tala",
      "XAF": "CFA-frangi BEAC",
      "XAG": "hopea",
      "XAU": "kulta",
      "XBA": "EURCO",
      "XBB": "Euroopan rahayksikkö (EMU)",
      "XBC": "EUA (XBC)",
      "XBD": "EUA (XBD)",
      "XCD": "Itä-Karibian dollari",
      "XDR": "erityisnosto-oikeus (SDR)",
      "XEU": "Euroopan valuuttayksikkö (ECU)",
      "XFO": "Ranskan kultafrangi",
      "XFU": "Ranskan UIC-frangi",
      "XOF": "CFA-frangi BCEAO",
      "XPD": "palladium",
      "XPF": "CFP-frangi",
      "XPT": "platina",
      "XRE": "RINET-rahastot",
      "XSU": "etelä-amerikkalaisen ALBA:n laskentayksikkö sucre",
      "XTS": "testaustarkoitukseen varattu valuuttakoodi",
      "XUA": "afrikkalainen AfDB-laskentayksikkö",
      "XXX": "tuntematon rahayksikkö",
      "YDD": "Jemenin dinaari",
      "YER": "Jemenin rial",
      "YUD": "Jugoslavian kova dinaari (1966–1990)",
      "YUM": "Jugoslavian uusi dinaari (1994–2002)",
      "YUN": "Jugoslavian vaihdettava dinaari (1990–1992)",
      "YUR": "Jugoslavian uudistettu dinaari (1992–1993)",
      "ZAL": "Etelä-Afrikan rahoitusrandi",
      "ZAR": "Etelä-Afrikan randi",
      "ZMK": "Sambian kwacha (1968–2012)",
      "ZMW": "Sambian kwacha",
      "ZRN": "Zairen uusi zaire (1993–1998)",
      "ZRZ": "Zairen zaire (1971–1993)",
      "ZWD": "Zimbabwen dollari (1980–2008)",
      "ZWL": "Zimbabwen dollari (2009)",
      "ZWR": "Zimbabwen dollari (2008)",
    };
  }-*/;
}
