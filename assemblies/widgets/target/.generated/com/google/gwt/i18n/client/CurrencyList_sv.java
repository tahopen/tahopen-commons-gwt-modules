package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_sv extends com.google.gwt.i18n.client.CurrencyList_ {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("SEK", "kr", 2, "kr", "kr");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "SEK", "kr", 2, "kr", "kr"];
  }-*/;
  
  @Override
  protected HashMap<String, CurrencyData> loadCurrencyMapJava() {
    HashMap<String, CurrencyData> result = super.loadCurrencyMapJava();
    // andorransk peseta
    result.put("ADP", new CurrencyDataImpl("ADP", "ADP", 128, "ADP", "ADP"));
    // Förenade Arabemiratens dirham
    result.put("AED", new CurrencyDataImpl("AED", "DH", 2, "DH", "dh"));
    // afghani (1927–2002)
    result.put("AFA", new CurrencyDataImpl("AFA", "AFA", 130, "AFA", "AFA"));
    // afghansk afghani
    result.put("AFN", new CurrencyDataImpl("AFN", "AFN", 0, "AFN", "Af."));
    // albansk lek (1946–1965)
    result.put("ALK", new CurrencyDataImpl("ALK", "ALK", 130, "ALK", "ALK"));
    // albansk lek
    result.put("ALL", new CurrencyDataImpl("ALL", "ALL", 0, "ALL", "Lek"));
    // armenisk dram
    result.put("AMD", new CurrencyDataImpl("AMD", "AMD", 2, "AMD", "Dram"));
    // Nederländska Antillernas gulden
    result.put("ANG", new CurrencyDataImpl("ANG", "ANG", 2, "ANG", "ANG"));
    // angolansk kwanza
    result.put("AOA", new CurrencyDataImpl("AOA", "AOA", 2, "AOA", "Kz"));
    // angolansk kwanza (1977–1990)
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130, "AOK", "AOK"));
    // angolansk ny kwanza (1990–2000)
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130, "AON", "AON"));
    // angolansk kwanza reajustado (1995–1999)
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130, "AOR", "AOR"));
    // argentinsk austral
    result.put("ARA", new CurrencyDataImpl("ARA", "ARA", 130, "ARA", "ARA"));
    // argentisk peso (1970–1983)
    result.put("ARL", new CurrencyDataImpl("ARL", "ARL", 130, "ARL", "ARL"));
    // argentisk peso (1881–1969)
    result.put("ARM", new CurrencyDataImpl("ARM", "ARM", 130, "ARM", "ARM"));
    // argentinsk peso (1983–1985)
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130, "ARP", "ARP"));
    // argentinsk peso
    result.put("ARS", new CurrencyDataImpl("ARS", "AR$", 2, "AR$", "$"));
    // österrikisk schilling
    result.put("ATS", new CurrencyDataImpl("ATS", "ATS", 130, "ATS", "ATS"));
    // australisk dollar
    result.put("AUD", new CurrencyDataImpl("AUD", "AU$", 2, "AU$", "$"));
    // arubansk florin
    result.put("AWG", new CurrencyDataImpl("AWG", "AWG", 2, "AWG", "Afl."));
    // azerbajdzjansk manat (1993–2006)
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130, "AZM", "AZM"));
    // azerbajdzjansk manat
    result.put("AZN", new CurrencyDataImpl("AZN", "AZN", 2, "AZN", "man."));
    // bosnisk-hercegovinsk dinar (1992–1994)
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130, "BAD", "BAD"));
    // bosnisk-hercegovinsk mark (konvertibel)
    result.put("BAM", new CurrencyDataImpl("BAM", "BAM", 2, "BAM", "KM"));
    // bosnisk-hercegovinsk dinar (1994–1998)
    result.put("BAN", new CurrencyDataImpl("BAN", "BAN", 130, "BAN", "BAN"));
    // Barbados-dollar
    result.put("BBD", new CurrencyDataImpl("BBD", "Bds$", 2, "Bds$", "$"));
    // bangladeshisk taka
    result.put("BDT", new CurrencyDataImpl("BDT", "Tk", 2, "Tk", "৳"));
    // belgisk franc (konvertibel)
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 130, "BEC", "BEC"));
    // belgisk franc
    result.put("BEF", new CurrencyDataImpl("BEF", "BEF", 130, "BEF", "BEF"));
    // belgisk franc (finansiell)
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 130, "BEL", "BEL"));
    // bulgarisk hård lev (1962–1999)
    result.put("BGL", new CurrencyDataImpl("BGL", "BGL", 130, "BGL", "BGL"));
    // bulgarisk lev (1952–1962)
    result.put("BGM", new CurrencyDataImpl("BGM", "BGM", 130, "BGM", "BGM"));
    // bulgarisk lev
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2, "BGN", "lev"));
    // bulgarisk lev (1881–1952)
    result.put("BGO", new CurrencyDataImpl("BGO", "BGO", 130, "BGO", "BGO"));
    // bahrainsk dinar
    result.put("BHD", new CurrencyDataImpl("BHD", "BHD", 3, "BHD", "din"));
    // burundisk franc
    result.put("BIF", new CurrencyDataImpl("BIF", "BIF", 0, "BIF", "FBu"));
    // Bermuda-dollar
    result.put("BMD", new CurrencyDataImpl("BMD", "BM$", 2, "BM$", "$"));
    // bruneisk dollar
    result.put("BND", new CurrencyDataImpl("BND", "BND", 2, "BND", "$"));
    // boliviansk boliviano
    result.put("BOB", new CurrencyDataImpl("BOB", "BOB", 2, "BOB", "Bs"));
    // boliviansk boliviano (1864–1963)
    result.put("BOL", new CurrencyDataImpl("BOL", "BOL", 130, "BOL", "BOL"));
    // boliviansk peso
    result.put("BOP", new CurrencyDataImpl("BOP", "BOP", 130, "BOP", "BOP"));
    // boliviansk mvdol
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 130, "BOV", "BOV"));
    // brasiliansk cruzeiro novo (1967–1986)
    result.put("BRB", new CurrencyDataImpl("BRB", "BRB", 130, "BRB", "BRB"));
    // brasiliansk cruzado
    result.put("BRC", new CurrencyDataImpl("BRC", "BRC", 130, "BRC", "BRC"));
    // brasiliansk cruzeiro (1990–1993)
    result.put("BRE", new CurrencyDataImpl("BRE", "BRE", 130, "BRE", "BRE"));
    // brasiliansk real
    result.put("BRL", new CurrencyDataImpl("BRL", "BR$", 2, "R$", "R$"));
    // brasiliansk cruzado novo
    result.put("BRN", new CurrencyDataImpl("BRN", "BRN", 130, "BRN", "BRN"));
    // brasiliansk cruzeiro
    result.put("BRR", new CurrencyDataImpl("BRR", "BRR", 130, "BRR", "BRR"));
    // brasiliansk cruzeiro (1942–1967)
    result.put("BRZ", new CurrencyDataImpl("BRZ", "BRZ", 130, "BRZ", "BRZ"));
    // bahamansk dollar
    result.put("BSD", new CurrencyDataImpl("BSD", "BS$", 2, "BS$", "$"));
    // bhutanesisk ngultrum
    result.put("BTN", new CurrencyDataImpl("BTN", "BTN", 2, "BTN", "Nu."));
    // burmesisk kyat
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130, "BUK", "BUK"));
    // botswansk pula
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2, "BWP", "P"));
    // vitrysk ny rubel (1994–1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130, "BYB", "BYB"));
    // vitrysk rubel
    result.put("BYN", new CurrencyDataImpl("BYN", "BYN", 2, "BYN", "BYN"));
    // vitrysk rubel (2000–2016)
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 128, "BYR", "BYR"));
    // belizisk dollar
    result.put("BZD", new CurrencyDataImpl("BZD", "BZ$", 2, "BZ$", "$"));
    // kanadensisk dollar
    result.put("CAD", new CurrencyDataImpl("CAD", "CA$", 2, "C$", "$"));
    // kongolesisk franc
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2, "CDF", "FrCD"));
    // euro (konvertibelt konto, WIR Bank, Schweiz)
    result.put("CHE", new CurrencyDataImpl("CHE", "CHE", 130, "CHE", "CHE"));
    // schweizisk franc
    result.put("CHF", new CurrencyDataImpl("CHF", "CHF", 2, "CHF", "CHF"));
    // franc (konvertibelt konto, WIR Bank, Schweiz)
    result.put("CHW", new CurrencyDataImpl("CHW", "CHW", 130, "CHW", "CHW"));
    // chilensk escudo (1960–1975)
    result.put("CLE", new CurrencyDataImpl("CLE", "CLE", 130, "CLE", "CLE"));
    // chilensk unidad de fomento
    result.put("CLF", new CurrencyDataImpl("CLF", "CLF", 132, "CLF", "CLF"));
    // chilensk peso
    result.put("CLP", new CurrencyDataImpl("CLP", "CL$", 0, "CL$", "$"));
    // kinesisk dollar
    result.put("CNX", new CurrencyDataImpl("CNX", "CNX", 130, "CNX", "CNX"));
    // kinesisk yuan
    result.put("CNY", new CurrencyDataImpl("CNY", "RMB¥", 2, "RMB¥", "¥"));
    // colombiansk peso
    result.put("COP", new CurrencyDataImpl("COP", "COL$", 2, "COL$", "$"));
    // colombiansk unidad de valor real
    result.put("COU", new CurrencyDataImpl("COU", "COU", 130, "COU", "COU"));
    // costarikansk colón
    result.put("CRC", new CurrencyDataImpl("CRC", "CR₡", 2, "CR₡", "₡"));
    // serbisk dinar (2002–2006)
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130, "CSD", "CSD"));
    // tjeckoslovakisk krona (–1993)
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130, "CSK", "CSK"));
    // kubansk peso (konvertibel)
    result.put("CUC", new CurrencyDataImpl("CUC", "CUC", 2, "CUC", "$"));
    // kubansk peso
    result.put("CUP", new CurrencyDataImpl("CUP", "$MN", 2, "$MN", "$"));
    // kapverdisk escudo
    result.put("CVE", new CurrencyDataImpl("CVE", "CVE", 2, "CVE", "CVE"));
    // cypriotiskt pund
    result.put("CYP", new CurrencyDataImpl("CYP", "CYP", 130, "CYP", "CYP"));
    // tjeckisk koruna
    result.put("CZK", new CurrencyDataImpl("CZK", "Kč", 2, "Kč", "Kč"));
    // östtysk mark
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130, "DDM", "DDM"));
    // tysk mark
    result.put("DEM", new CurrencyDataImpl("DEM", "DEM", 130, "DEM", "DEM"));
    // djiboutisk franc
    result.put("DJF", new CurrencyDataImpl("DJF", "Fdj", 0, "Fdj", "Fdj"));
    // dansk krona
    result.put("DKK", new CurrencyDataImpl("DKK", "Dkr", 2, "kr", "kr"));
    // dominikansk peso
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$", "$"));
    // algerisk dinar
    result.put("DZD", new CurrencyDataImpl("DZD", "DZD", 2, "DZD", "din"));
    // ecuadoriansk sucre
    result.put("ECS", new CurrencyDataImpl("ECS", "ECS", 130, "ECS", "ECS"));
    // ecuadoriansk unidad de valor constante
    result.put("ECV", new CurrencyDataImpl("ECV", "ECV", 130, "ECV", "ECV"));
    // estnisk krona
    result.put("EEK", new CurrencyDataImpl("EEK", "Ekr", 130, "Ekr", "Ekr"));
    // egyptiskt pund
    result.put("EGP", new CurrencyDataImpl("EGP", "EG£", 2, "LE", "E£"));
    // eritreansk nakfa
    result.put("ERN", new CurrencyDataImpl("ERN", "ERN", 2, "ERN", "Nfk"));
    // spansk peseta (konto)
    result.put("ESA", new CurrencyDataImpl("ESA", "ESA", 130, "ESA", "ESA"));
    // spansk peseta (konvertibelt konto)
    result.put("ESB", new CurrencyDataImpl("ESB", "ESB", 130, "ESB", "ESB"));
    // spansk peseta
    result.put("ESP", new CurrencyDataImpl("ESP", "ESP", 128, "ESP", "ESP"));
    // etiopisk birr
    result.put("ETB", new CurrencyDataImpl("ETB", "ETB", 2, "ETB", "Birr"));
    // euro
    result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€", "€"));
    // finsk mark
    result.put("FIM", new CurrencyDataImpl("FIM", "FIM", 130, "FIM", "FIM"));
    // Fijidollar
    result.put("FJD", new CurrencyDataImpl("FJD", "FJD", 2, "FJD", "$"));
    // Falklandspund
    result.put("FKP", new CurrencyDataImpl("FKP", "FKP", 2, "FKP", "£"));
    // fransk franc
    result.put("FRF", new CurrencyDataImpl("FRF", "FRF", 130, "FRF", "FRF"));
    // brittiskt pund
    result.put("GBP", new CurrencyDataImpl("GBP", "GB£", 2, "GB£", "£"));
    // georgisk kupon larit
    result.put("GEK", new CurrencyDataImpl("GEK", "GEK", 130, "GEK", "GEK"));
    // georgisk lari
    result.put("GEL", new CurrencyDataImpl("GEL", "₾", 2, "₾", "GEL"));
    // ghanansk cedi (1979–2007)
    result.put("GHC", new CurrencyDataImpl("GHC", "GHC", 130, "GHC", "GHC"));
    // ghanansk cedi
    result.put("GHS", new CurrencyDataImpl("GHS", "GHS", 2, "GHS", "GHS"));
    // gibraltiskt pund
    result.put("GIP", new CurrencyDataImpl("GIP", "GIP", 2, "GIP", "£"));
    // gambisk dalasi
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2, "GMD", "GMD"));
    // guineansk franc
    result.put("GNF", new CurrencyDataImpl("GNF", "GNF", 0, "GNF", "FG"));
    // guineansk syli
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130, "GNS", "GNS"));
    // ekvatorialguineansk ekwele
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130, "GQE", "GQE"));
    // grekisk drachma
    result.put("GRD", new CurrencyDataImpl("GRD", "GRD", 130, "GRD", "GRD"));
    // guatemalansk quetzal
    result.put("GTQ", new CurrencyDataImpl("GTQ", "GTQ", 2, "GTQ", "Q"));
    // Portugisiska Guinea-escudo
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130, "GWE", "GWE"));
    // Guinea-Bissau-peso
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 130, "GWP", "GWP"));
    // Guyanadollar
    result.put("GYD", new CurrencyDataImpl("GYD", "GYD", 2, "GYD", "$"));
    // Hongkongdollar
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$", "$"));
    // honduransk lempira
    result.put("HNL", new CurrencyDataImpl("HNL", "L", 2, "L", "L"));
    // kroatisk dinar
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130, "HRD", "HRD"));
    // kroatisk kuna
    result.put("HRK", new CurrencyDataImpl("HRK", "HRK", 2, "HRK", "kn"));
    // haitisk gourde
    result.put("HTG", new CurrencyDataImpl("HTG", "HTG", 2, "HTG", "HTG"));
    // ungersk forint
    result.put("HUF", new CurrencyDataImpl("HUF", "HUF", 2, "HUF", "Ft"));
    // indonesisk rupie
    result.put("IDR", new CurrencyDataImpl("IDR", "IDR", 2, "IDR", "Rp"));
    // irländskt pund
    result.put("IEP", new CurrencyDataImpl("IEP", "IE£", 130, "IE£", "IE£"));
    // israeliskt pund
    result.put("ILP", new CurrencyDataImpl("ILP", "ILP", 130, "ILP", "ILP"));
    // israelisk shekel (1980–1985)
    result.put("ILR", new CurrencyDataImpl("ILR", "ILR", 130, "ILR", "ILR"));
    // israelisk ny shekel
    result.put("ILS", new CurrencyDataImpl("ILS", "₪", 2, "IL₪", "₪"));
    // indisk rupie
    result.put("INR", new CurrencyDataImpl("INR", "Rs", 2, "Rs", "₹"));
    // irakisk dinar
    result.put("IQD", new CurrencyDataImpl("IQD", "IQD", 0, "IQD", "din"));
    // iransk rial
    result.put("IRR", new CurrencyDataImpl("IRR", "IRR", 0, "IRR", "Rial"));
    // isländsk gammal krona
    result.put("ISJ", new CurrencyDataImpl("ISJ", "ISJ", 130, "ISJ", "ISJ"));
    // isländsk krona
    result.put("ISK", new CurrencyDataImpl("ISK", "Ikr", 0, "kr", "kr"));
    // italiensk lire
    result.put("ITL", new CurrencyDataImpl("ITL", "ITL", 128, "ITL", "ITL"));
    // Jamaica-dollar
    result.put("JMD", new CurrencyDataImpl("JMD", "JM$", 2, "JA$", "$"));
    // jordansk dinar
    result.put("JOD", new CurrencyDataImpl("JOD", "JOD", 3, "JOD", "din"));
    // japansk yen
    result.put("JPY", new CurrencyDataImpl("JPY", "JP¥", 0, "JP¥", "¥"));
    // kenyansk shilling
    result.put("KES", new CurrencyDataImpl("KES", "Ksh", 2, "Ksh", "Ksh"));
    // kirgizisk som
    result.put("KGS", new CurrencyDataImpl("KGS", "KGS", 2, "KGS", "KGS"));
    // kambodjansk riel
    result.put("KHR", new CurrencyDataImpl("KHR", "KHR", 2, "KHR", "Riel"));
    // komorisk franc
    result.put("KMF", new CurrencyDataImpl("KMF", "KMF", 0, "KMF", "CF"));
    // nordkoreansk won
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 0, "KPW", "₩"));
    // sydkoreansk hwan (1953–1962)
    result.put("KRH", new CurrencyDataImpl("KRH", "KRH", 130, "KRH", "KRH"));
    // sydkoreansk won (1945–1953)
    result.put("KRO", new CurrencyDataImpl("KRO", "KRO", 130, "KRO", "KRO"));
    // sydkoreansk won
    result.put("KRW", new CurrencyDataImpl("KRW", "KR₩", 0, "KR₩", "₩"));
    // kuwaitisk dinar
    result.put("KWD", new CurrencyDataImpl("KWD", "KWD", 3, "KWD", "din"));
    // Cayman-dollar
    result.put("KYD", new CurrencyDataImpl("KYD", "KYD", 2, "KYD", "$"));
    // kazakisk tenge
    result.put("KZT", new CurrencyDataImpl("KZT", "KZT", 2, "KZT", "₸"));
    // laotisk kip
    result.put("LAK", new CurrencyDataImpl("LAK", "LAK", 0, "LAK", "₭"));
    // libanesiskt pund
    result.put("LBP", new CurrencyDataImpl("LBP", "LBP", 0, "LBP", "L£"));
    // srilankesisk rupie
    result.put("LKR", new CurrencyDataImpl("LKR", "SLRs", 2, "SLRs", "Rs"));
    // liberiansk dollar
    result.put("LRD", new CurrencyDataImpl("LRD", "LRD", 2, "LRD", "$"));
    // lesothisk loti
    result.put("LSL", new CurrencyDataImpl("LSL", "LSL", 2, "LSL", "LSL"));
    // litauisk litas
    result.put("LTL", new CurrencyDataImpl("LTL", "LTL", 130, "LTL", "Lt"));
    // litauisk talonas
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130, "LTT", "LTT"));
    // luxemburgsk franc (konvertibel)
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 130, "LUC", "LUC"));
    // luxemburgsk franc
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128, "LUF", "LUF"));
    // luxemburgsk franc (finansiell)
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 130, "LUL", "LUL"));
    // lettisk lats
    result.put("LVL", new CurrencyDataImpl("LVL", "LVL", 130, "LVL", "Ls"));
    // lettisk rubel
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130, "LVR", "LVR"));
    // libysk dinar
    result.put("LYD", new CurrencyDataImpl("LYD", "LYD", 3, "LYD", "din"));
    // marockansk dirham
    result.put("MAD", new CurrencyDataImpl("MAD", "MAD", 2, "MAD", "MAD"));
    // marockansk franc
    result.put("MAF", new CurrencyDataImpl("MAF", "MAF", 130, "MAF", "MAF"));
    // monegaskisk franc (–2001)
    result.put("MCF", new CurrencyDataImpl("MCF", "MCF", 130, "MCF", "MCF"));
    // moldavisk cupon (1992–1993)
    result.put("MDC", new CurrencyDataImpl("MDC", "MDC", 130, "MDC", "MDC"));
    // moldavisk leu
    result.put("MDL", new CurrencyDataImpl("MDL", "MDL", 2, "MDL", "MDL"));
    // madagaskisk ariary
    result.put("MGA", new CurrencyDataImpl("MGA", "MGA", 0, "MGA", "Ar"));
    // madagaskisk franc
    result.put("MGF", new CurrencyDataImpl("MGF", "MGF", 128, "MGF", "MGF"));
    // makedonisk denar
    result.put("MKD", new CurrencyDataImpl("MKD", "MKD", 2, "MKD", "din"));
    // makedonisk denar (1992–1993)
    result.put("MKN", new CurrencyDataImpl("MKN", "MKN", 130, "MKN", "MKN"));
    // malisk franc
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130, "MLF", "MLF"));
    // myanmarisk kyat
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 0, "MMK", "K"));
    // mongolisk tögrög
    result.put("MNT", new CurrencyDataImpl("MNT", "MN₮", 2, "MN₮", "₮"));
    // makanesisk pataca
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP", 2, "MOP", "MOP"));
    // mauretansk ouguiya (1973–2017)
    result.put("MRO", new CurrencyDataImpl("MRO", "MRO", 128, "MRO", "MRO"));
    // mauretansk ouguiya
    result.put("MRU", new CurrencyDataImpl("MRU", "MRU", 2, "MRU", "MRU"));
    // maltesisk lire
    result.put("MTL", new CurrencyDataImpl("MTL", "MTL", 130, "MTL", "MTL"));
    // maltesiskt pund
    result.put("MTP", new CurrencyDataImpl("MTP", "MTP", 130, "MTP", "MTP"));
    // mauritisk rupie
    result.put("MUR", new CurrencyDataImpl("MUR", "MUR", 2, "MUR", "Rs"));
    // maldivisk rupie
    result.put("MVP", new CurrencyDataImpl("MVP", "MVP", 130, "MVP", "MVP"));
    // maldivisk rufiyaa
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2, "MVR", "MVR"));
    // malawisk kwacha
    result.put("MWK", new CurrencyDataImpl("MWK", "MWK", 2, "MWK", "MWK"));
    // mexikansk peso
    result.put("MXN", new CurrencyDataImpl("MXN", "MX$", 2, "Mex$", "$"));
    // mexikansk silverpeso (1861–1992)
    result.put("MXP", new CurrencyDataImpl("MXP", "MXP", 130, "MXP", "MXP"));
    // mexikansk unidad de inversion
    result.put("MXV", new CurrencyDataImpl("MXV", "MXV", 130, "MXV", "MXV"));
    // malaysisk ringgit
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM", "RM"));
    // moçambikisk escudo
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130, "MZE", "MZE"));
    // gammal moçambikisk metical
    result.put("MZM", new CurrencyDataImpl("MZM", "MZM", 130, "MZM", "MZM"));
    // moçambikisk metical
    result.put("MZN", new CurrencyDataImpl("MZN", "MZN", 2, "MZN", "MTn"));
    // namibisk dollar
    result.put("NAD", new CurrencyDataImpl("NAD", "NAD", 2, "NAD", "$"));
    // nigeriansk naira
    result.put("NGN", new CurrencyDataImpl("NGN", "NGN", 2, "NGN", "₦"));
    // nicaraguansk córdoba (1998–1991)
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130, "NIC", "NIC"));
    // nicaraguansk córdoba
    result.put("NIO", new CurrencyDataImpl("NIO", "NIO", 2, "NIO", "C$"));
    // nederländsk gulden
    result.put("NLG", new CurrencyDataImpl("NLG", "NLG", 130, "NLG", "NLG"));
    // norsk krona
    result.put("NOK", new CurrencyDataImpl("NOK", "Nkr", 2, "NOkr", "kr"));
    // nepalesisk rupie
    result.put("NPR", new CurrencyDataImpl("NPR", "NPR", 2, "NPR", "Rs"));
    // nyzeeländsk dollar
    result.put("NZD", new CurrencyDataImpl("NZD", "NZD", 2, "NZD", "$"));
    // omansk rial
    result.put("OMR", new CurrencyDataImpl("OMR", "OMR", 3, "OMR", "Rial"));
    // panamansk balboa
    result.put("PAB", new CurrencyDataImpl("PAB", "B/.", 2, "B/.", "B/."));
    // peruansk inti
    result.put("PEI", new CurrencyDataImpl("PEI", "PEI", 130, "PEI", "PEI"));
    // peruansk sol
    result.put("PEN", new CurrencyDataImpl("PEN", "S/.", 2, "S/.", "S/."));
    // peruansk sol (1863–1965)
    result.put("PES", new CurrencyDataImpl("PES", "PES", 130, "PES", "PES"));
    // papuansk kina
    result.put("PGK", new CurrencyDataImpl("PGK", "PGK", 2, "PGK", "PGK"));
    // filippinsk peso
    result.put("PHP", new CurrencyDataImpl("PHP", "PHP", 2, "PHP", "₱"));
    // pakistansk rupie
    result.put("PKR", new CurrencyDataImpl("PKR", "PKRs.", 2, "PKRs.", "Rs"));
    // polsk zloty
    result.put("PLN", new CurrencyDataImpl("PLN", "PLN", 2, "PLN", "zł"));
    // polsk zloty (1950–1995)
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130, "PLZ", "PLZ"));
    // portugisisk escudo
    result.put("PTE", new CurrencyDataImpl("PTE", "PTE", 130, "PTE", "PTE"));
    // paraguayansk guarani
    result.put("PYG", new CurrencyDataImpl("PYG", "PYG", 0, "PYG", "Gs"));
    // qatarisk rial
    result.put("QAR", new CurrencyDataImpl("QAR", "QAR", 2, "QAR", "Rial"));
    // rhodesisk dollar
    result.put("RHD", new CurrencyDataImpl("RHD", "RHD", 130, "RHD", "RHD"));
    // rumänsk leu (1952–2005)
    result.put("ROL", new CurrencyDataImpl("ROL", "ROL", 130, "ROL", "ROL"));
    // rumänsk leu
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2, "RON", "RON"));
    // serbisk dinar
    result.put("RSD", new CurrencyDataImpl("RSD", "RSD", 0, "RSD", "din"));
    // rysk rubel
    result.put("RUB", new CurrencyDataImpl("RUB", "руб.", 2, "руб.", "руб."));
    // rysk rubel (1991–1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130, "RUR", "RUR"));
    // rwandisk franc
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0, "RWF", "RF"));
    // saudisk riyal
    result.put("SAR", new CurrencyDataImpl("SAR", "SR", 2, "SR", "Rial"));
    // Salomondollar
    result.put("SBD", new CurrencyDataImpl("SBD", "SBD", 2, "SBD", "$"));
    // seychellisk rupie
    result.put("SCR", new CurrencyDataImpl("SCR", "SCR", 2, "SCR", "SCR"));
    // sudansk dinar (1992–2007)
    result.put("SDD", new CurrencyDataImpl("SDD", "SDD", 130, "SDD", "SDD"));
    // sudanesiskt pund
    result.put("SDG", new CurrencyDataImpl("SDG", "SDG", 2, "SDG", "SDG"));
    // sudanskt pund (1916–1992)
    result.put("SDP", new CurrencyDataImpl("SDP", "SDP", 130, "SDP", "SDP"));
    // svensk krona
    result.put("SEK", new CurrencyDataImpl("SEK", "kr", 2, "kr", "kr"));
    // singaporiansk dollar
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$", "$"));
    // S:t Helena-pund
    result.put("SHP", new CurrencyDataImpl("SHP", "SHP", 2, "SHP", "£"));
    // slovensk tolar
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130, "SIT", "SIT"));
    // slovakisk koruna
    result.put("SKK", new CurrencyDataImpl("SKK", "SKK", 130, "SKK", "SKK"));
    // sierraleonsk leone
    result.put("SLL", new CurrencyDataImpl("SLL", "SLL", 0, "SLL", "SLL"));
    // somalisk shilling
    result.put("SOS", new CurrencyDataImpl("SOS", "SOS", 0, "SOS", "SOS"));
    // surinamesisk dollar
    result.put("SRD", new CurrencyDataImpl("SRD", "SRD", 2, "SRD", "$"));
    // surinamesisk gulden
    result.put("SRG", new CurrencyDataImpl("SRG", "SRG", 130, "SRG", "SRG"));
    // sydsudanesiskt pund
    result.put("SSP", new CurrencyDataImpl("SSP", "SSP", 2, "SSP", "SSP"));
    // saotomeansk dobra (1977–2017)
    result.put("STD", new CurrencyDataImpl("STD", "STD", 128, "STD", "Db"));
    // saotomeansk dobra
    result.put("STN", new CurrencyDataImpl("STN", "STN", 2, "STN", "STN"));
    // sovjetisk rubel
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130, "SUR", "SUR"));
    // salvadoransk colón
    result.put("SVC", new CurrencyDataImpl("SVC", "SVC", 130, "SVC", "SVC"));
    // syriskt pund
    result.put("SYP", new CurrencyDataImpl("SYP", "SYP", 0, "SYP", "£"));
    // swaziländsk lilangeni
    result.put("SZL", new CurrencyDataImpl("SZL", "SZL", 2, "SZL", "SZL"));
    // thailändsk baht
    result.put("THB", new CurrencyDataImpl("THB", "THB", 2, "THB", "฿"));
    // tadzjikisk rubel
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130, "TJR", "TJR"));
    // tadzjikisk somoni
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2, "TJS", "Som"));
    // turkmenistansk manat (1993–2009)
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 128, "TMM", "TMM"));
    // turkmenistansk manat
    result.put("TMT", new CurrencyDataImpl("TMT", "TMT", 2, "TMT", "TMT"));
    // tunisisk dinar
    result.put("TND", new CurrencyDataImpl("TND", "TND", 3, "TND", "din"));
    // tongansk paʻanga
    result.put("TOP", new CurrencyDataImpl("TOP", "TOP", 2, "TOP", "T$"));
    // timoriansk escudo
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130, "TPE", "TPE"));
    // turkisk lire (1922–2005)
    result.put("TRL", new CurrencyDataImpl("TRL", "TRL", 128, "TRL", "TRL"));
    // turkisk lira
    result.put("TRY", new CurrencyDataImpl("TRY", "TL", 2, "YTL", "TL"));
    // Trinidad och Tobago-dollar
    result.put("TTD", new CurrencyDataImpl("TTD", "TTD", 2, "TTD", "$"));
    // Taiwandollar
    result.put("TWD", new CurrencyDataImpl("TWD", "NT$", 2, "NT$", "NT$"));
    // tanzanisk shilling
    result.put("TZS", new CurrencyDataImpl("TZS", "TZS", 2, "TZS", "TSh"));
    // ukrainsk hryvnia
    result.put("UAH", new CurrencyDataImpl("UAH", "UAH", 2, "UAH", "₴"));
    // ukrainsk karbovanetz
    result.put("UAK", new CurrencyDataImpl("UAK", "UAK", 130, "UAK", "UAK"));
    // ugandisk shilling (1966–1987)
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130, "UGS", "UGS"));
    // ugandisk shilling
    result.put("UGX", new CurrencyDataImpl("UGX", "UGX", 0, "UGX", "UGX"));
    // US-dollar
    result.put("USD", new CurrencyDataImpl("USD", "US$", 2, "US$", "$"));
    // US-dollar (nästa dag)
    result.put("USN", new CurrencyDataImpl("USN", "USN", 130, "USN", "USN"));
    // US-dollar (samma dag)
    result.put("USS", new CurrencyDataImpl("USS", "USS", 130, "USS", "USS"));
    // uruguayansk peso en unidades indexadas
    result.put("UYI", new CurrencyDataImpl("UYI", "UYI", 128, "UYI", "UYI"));
    // uruguayansk peso (1975–1993)
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130, "UYP", "UYP"));
    // uruguayansk peso
    result.put("UYU", new CurrencyDataImpl("UYU", "UY$", 2, "UY$", "$"));
    // uzbekisk sum
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 2, "UZS", "soʼm"));
    // venezuelansk bolivar (1871–2008)
    result.put("VEB", new CurrencyDataImpl("VEB", "VEB", 130, "VEB", "VEB"));
    // venezuelansk bolívar (2008–2018)
    result.put("VEF", new CurrencyDataImpl("VEF", "VEF", 130, "VEF", "Bs"));
    // venezuelansk bolívar
    result.put("VES", new CurrencyDataImpl("VES", "VES", 2, "VES", "VES"));
    // vietnamesisk dong
    result.put("VND", new CurrencyDataImpl("VND", "₫", 24, "₫", "₫"));
    // vietnamesisk dong (1978–1985)
    result.put("VNN", new CurrencyDataImpl("VNN", "VNN", 130, "VNN", "VNN"));
    // vanuatisk vatu
    result.put("VUV", new CurrencyDataImpl("VUV", "VUV", 0, "VUV", "VUV"));
    // västsamoansk tala
    result.put("WST", new CurrencyDataImpl("WST", "WST", 2, "WST", "WST"));
    // centralafrikansk franc
    result.put("XAF", new CurrencyDataImpl("XAF", "FCFA", 0, "FCFA", "FCFA"));
    // silver
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 130, "XAG", "XAG"));
    // guld
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 130, "XAU", "XAU"));
    // europeisk kompositenhet
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 130, "XBA", "XBA"));
    // europeisk monetär enhet
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 130, "XBB", "XBB"));
    // europeisk kontoenhet (XBC)
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 130, "XBC", "XBC"));
    // europeisk kontoenhet (XBD)
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 130, "XBD", "XBD"));
    // östkaribisk dollar
    result.put("XCD", new CurrencyDataImpl("XCD", "EC$", 2, "EC$", "$"));
    // IMF särskild dragningsrätt
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 130, "XDR", "XDR"));
    // europeisk valutaenhet
    result.put("XEU", new CurrencyDataImpl("XEU", "XEU", 130, "XEU", "XEU"));
    // fransk guldfranc
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 130, "XFO", "XFO"));
    // internationella järnvägsunionens franc
    result.put("XFU", new CurrencyDataImpl("XFU", "XFU", 130, "XFU", "XFU"));
    // västafrikansk franc
    result.put("XOF", new CurrencyDataImpl("XOF", "CFA", 0, "CFA", "CFA"));
    // palladium
    result.put("XPD", new CurrencyDataImpl("XPD", "XPD", 130, "XPD", "XPD"));
    // CFP-franc
    result.put("XPF", new CurrencyDataImpl("XPF", "CFPF", 0, "CFPF", "FCFP"));
    // platina
    result.put("XPT", new CurrencyDataImpl("XPT", "XPT", 130, "XPT", "XPT"));
    // RINET-fond
    result.put("XRE", new CurrencyDataImpl("XRE", "XRE", 130, "XRE", "XRE"));
    // latinamerikansk sucre
    result.put("XSU", new CurrencyDataImpl("XSU", "XSU", 130, "XSU", "XSU"));
    // test-valutakod
    result.put("XTS", new CurrencyDataImpl("XTS", "XTS", 130, "XTS", "XTS"));
    // afrikansk kontoenhet
    result.put("XUA", new CurrencyDataImpl("XUA", "XUA", 130, "XUA", "XUA"));
    // okänd valuta
    result.put("XXX", new CurrencyDataImpl("XXX", "¤", 130, "¤", "¤"));
    // jemenitisk dinar
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130, "YDD", "YDD"));
    // jemenitisk rial
    result.put("YER", new CurrencyDataImpl("YER", "YER", 0, "YER", "Rial"));
    // jugoslavisk dinar (1966–1990)
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130, "YUD", "YUD"));
    // jugoslavisk dinar (1994–2002)
    result.put("YUM", new CurrencyDataImpl("YUM", "YUM", 130, "YUM", "YUM"));
    // jugoslavisk dinar (1990–1992)
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130, "YUN", "YUN"));
    // jugoslavisk dinar (1992–1993)
    result.put("YUR", new CurrencyDataImpl("YUR", "YUR", 130, "YUR", "YUR"));
    // sydafrikansk rand (finansiell)
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 130, "ZAL", "ZAL"));
    // sydafrikansk rand
    result.put("ZAR", new CurrencyDataImpl("ZAR", "ZAR", 2, "ZAR", "R"));
    // zambisk kwacha (1968–2012)
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZMK", 128, "ZMK", "ZWK"));
    // zambisk kwacha
    result.put("ZMW", new CurrencyDataImpl("ZMW", "ZMW", 2, "ZMW", "ZMW"));
    // zairisk ny zaire
    result.put("ZRN", new CurrencyDataImpl("ZRN", "ZRN", 130, "ZRN", "ZRN"));
    // zairisk zaire
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"));
    // Zimbabwe-dollar
    result.put("ZWD", new CurrencyDataImpl("ZWD", "ZWD", 128, "ZWD", "ZWD"));
    // Zimbabwe-dollar (2009)
    result.put("ZWL", new CurrencyDataImpl("ZWL", "ZWL", 130, "ZWL", "ZWL"));
    // Zimbabwe-dollar (2008)
    result.put("ZWR", new CurrencyDataImpl("ZWR", "ZWR", 130, "ZWR", "ZWR"));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // andorransk peseta
      "ADP": [ "ADP", "ADP", 128, "ADP", "ADP"],
      // Förenade Arabemiratens dirham
      "AED": [ "AED", "DH", 2, "DH", "dh"],
      // afghani (1927–2002)
      "AFA": [ "AFA", "AFA", 130, "AFA", "AFA"],
      // afghansk afghani
      "AFN": [ "AFN", "AFN", 0, "AFN", "Af."],
      // albansk lek (1946–1965)
      "ALK": [ "ALK", "ALK", 130, "ALK", "ALK"],
      // albansk lek
      "ALL": [ "ALL", "ALL", 0, "ALL", "Lek"],
      // armenisk dram
      "AMD": [ "AMD", "AMD", 2, "AMD", "Dram"],
      // Nederländska Antillernas gulden
      "ANG": [ "ANG", "ANG", 2, "ANG", "ANG"],
      // angolansk kwanza
      "AOA": [ "AOA", "AOA", 2, "AOA", "Kz"],
      // angolansk kwanza (1977–1990)
      "AOK": [ "AOK", "AOK", 130, "AOK", "AOK"],
      // angolansk ny kwanza (1990–2000)
      "AON": [ "AON", "AON", 130, "AON", "AON"],
      // angolansk kwanza reajustado (1995–1999)
      "AOR": [ "AOR", "AOR", 130, "AOR", "AOR"],
      // argentinsk austral
      "ARA": [ "ARA", "ARA", 130, "ARA", "ARA"],
      // argentisk peso (1970–1983)
      "ARL": [ "ARL", "ARL", 130, "ARL", "ARL"],
      // argentisk peso (1881–1969)
      "ARM": [ "ARM", "ARM", 130, "ARM", "ARM"],
      // argentinsk peso (1983–1985)
      "ARP": [ "ARP", "ARP", 130, "ARP", "ARP"],
      // argentinsk peso
      "ARS": [ "ARS", "AR$", 2, "AR$", "$"],
      // österrikisk schilling
      "ATS": [ "ATS", "ATS", 130, "ATS", "ATS"],
      // australisk dollar
      "AUD": [ "AUD", "AU$", 2, "AU$", "$"],
      // arubansk florin
      "AWG": [ "AWG", "AWG", 2, "AWG", "Afl."],
      // azerbajdzjansk manat (1993–2006)
      "AZM": [ "AZM", "AZM", 130, "AZM", "AZM"],
      // azerbajdzjansk manat
      "AZN": [ "AZN", "AZN", 2, "AZN", "man."],
      // bosnisk-hercegovinsk dinar (1992–1994)
      "BAD": [ "BAD", "BAD", 130, "BAD", "BAD"],
      // bosnisk-hercegovinsk mark (konvertibel)
      "BAM": [ "BAM", "BAM", 2, "BAM", "KM"],
      // bosnisk-hercegovinsk dinar (1994–1998)
      "BAN": [ "BAN", "BAN", 130, "BAN", "BAN"],
      // Barbados-dollar
      "BBD": [ "BBD", "Bds$", 2, "Bds$", "$"],
      // bangladeshisk taka
      "BDT": [ "BDT", "Tk", 2, "Tk", "৳"],
      // belgisk franc (konvertibel)
      "BEC": [ "BEC", "BEC", 130, "BEC", "BEC"],
      // belgisk franc
      "BEF": [ "BEF", "BEF", 130, "BEF", "BEF"],
      // belgisk franc (finansiell)
      "BEL": [ "BEL", "BEL", 130, "BEL", "BEL"],
      // bulgarisk hård lev (1962–1999)
      "BGL": [ "BGL", "BGL", 130, "BGL", "BGL"],
      // bulgarisk lev (1952–1962)
      "BGM": [ "BGM", "BGM", 130, "BGM", "BGM"],
      // bulgarisk lev
      "BGN": [ "BGN", "BGN", 2, "BGN", "lev"],
      // bulgarisk lev (1881–1952)
      "BGO": [ "BGO", "BGO", 130, "BGO", "BGO"],
      // bahrainsk dinar
      "BHD": [ "BHD", "BHD", 3, "BHD", "din"],
      // burundisk franc
      "BIF": [ "BIF", "BIF", 0, "BIF", "FBu"],
      // Bermuda-dollar
      "BMD": [ "BMD", "BM$", 2, "BM$", "$"],
      // bruneisk dollar
      "BND": [ "BND", "BND", 2, "BND", "$"],
      // boliviansk boliviano
      "BOB": [ "BOB", "BOB", 2, "BOB", "Bs"],
      // boliviansk boliviano (1864–1963)
      "BOL": [ "BOL", "BOL", 130, "BOL", "BOL"],
      // boliviansk peso
      "BOP": [ "BOP", "BOP", 130, "BOP", "BOP"],
      // boliviansk mvdol
      "BOV": [ "BOV", "BOV", 130, "BOV", "BOV"],
      // brasiliansk cruzeiro novo (1967–1986)
      "BRB": [ "BRB", "BRB", 130, "BRB", "BRB"],
      // brasiliansk cruzado
      "BRC": [ "BRC", "BRC", 130, "BRC", "BRC"],
      // brasiliansk cruzeiro (1990–1993)
      "BRE": [ "BRE", "BRE", 130, "BRE", "BRE"],
      // brasiliansk real
      "BRL": [ "BRL", "BR$", 2, "R$", "R$"],
      // brasiliansk cruzado novo
      "BRN": [ "BRN", "BRN", 130, "BRN", "BRN"],
      // brasiliansk cruzeiro
      "BRR": [ "BRR", "BRR", 130, "BRR", "BRR"],
      // brasiliansk cruzeiro (1942–1967)
      "BRZ": [ "BRZ", "BRZ", 130, "BRZ", "BRZ"],
      // bahamansk dollar
      "BSD": [ "BSD", "BS$", 2, "BS$", "$"],
      // bhutanesisk ngultrum
      "BTN": [ "BTN", "BTN", 2, "BTN", "Nu."],
      // burmesisk kyat
      "BUK": [ "BUK", "BUK", 130, "BUK", "BUK"],
      // botswansk pula
      "BWP": [ "BWP", "BWP", 2, "BWP", "P"],
      // vitrysk ny rubel (1994–1999)
      "BYB": [ "BYB", "BYB", 130, "BYB", "BYB"],
      // vitrysk rubel
      "BYN": [ "BYN", "BYN", 2, "BYN", "BYN"],
      // vitrysk rubel (2000–2016)
      "BYR": [ "BYR", "BYR", 128, "BYR", "BYR"],
      // belizisk dollar
      "BZD": [ "BZD", "BZ$", 2, "BZ$", "$"],
      // kanadensisk dollar
      "CAD": [ "CAD", "CA$", 2, "C$", "$"],
      // kongolesisk franc
      "CDF": [ "CDF", "CDF", 2, "CDF", "FrCD"],
      // euro (konvertibelt konto, WIR Bank, Schweiz)
      "CHE": [ "CHE", "CHE", 130, "CHE", "CHE"],
      // schweizisk franc
      "CHF": [ "CHF", "CHF", 2, "CHF", "CHF"],
      // franc (konvertibelt konto, WIR Bank, Schweiz)
      "CHW": [ "CHW", "CHW", 130, "CHW", "CHW"],
      // chilensk escudo (1960–1975)
      "CLE": [ "CLE", "CLE", 130, "CLE", "CLE"],
      // chilensk unidad de fomento
      "CLF": [ "CLF", "CLF", 132, "CLF", "CLF"],
      // chilensk peso
      "CLP": [ "CLP", "CL$", 0, "CL$", "$"],
      // kinesisk dollar
      "CNX": [ "CNX", "CNX", 130, "CNX", "CNX"],
      // kinesisk yuan
      "CNY": [ "CNY", "RMB¥", 2, "RMB¥", "¥"],
      // colombiansk peso
      "COP": [ "COP", "COL$", 2, "COL$", "$"],
      // colombiansk unidad de valor real
      "COU": [ "COU", "COU", 130, "COU", "COU"],
      // costarikansk colón
      "CRC": [ "CRC", "CR₡", 2, "CR₡", "₡"],
      // serbisk dinar (2002–2006)
      "CSD": [ "CSD", "CSD", 130, "CSD", "CSD"],
      // tjeckoslovakisk krona (–1993)
      "CSK": [ "CSK", "CSK", 130, "CSK", "CSK"],
      // kubansk peso (konvertibel)
      "CUC": [ "CUC", "CUC", 2, "CUC", "$"],
      // kubansk peso
      "CUP": [ "CUP", "$MN", 2, "$MN", "$"],
      // kapverdisk escudo
      "CVE": [ "CVE", "CVE", 2, "CVE", "CVE"],
      // cypriotiskt pund
      "CYP": [ "CYP", "CYP", 130, "CYP", "CYP"],
      // tjeckisk koruna
      "CZK": [ "CZK", "Kč", 2, "Kč", "Kč"],
      // östtysk mark
      "DDM": [ "DDM", "DDM", 130, "DDM", "DDM"],
      // tysk mark
      "DEM": [ "DEM", "DEM", 130, "DEM", "DEM"],
      // djiboutisk franc
      "DJF": [ "DJF", "Fdj", 0, "Fdj", "Fdj"],
      // dansk krona
      "DKK": [ "DKK", "Dkr", 2, "kr", "kr"],
      // dominikansk peso
      "DOP": [ "DOP", "RD$", 2, "RD$", "$"],
      // algerisk dinar
      "DZD": [ "DZD", "DZD", 2, "DZD", "din"],
      // ecuadoriansk sucre
      "ECS": [ "ECS", "ECS", 130, "ECS", "ECS"],
      // ecuadoriansk unidad de valor constante
      "ECV": [ "ECV", "ECV", 130, "ECV", "ECV"],
      // estnisk krona
      "EEK": [ "EEK", "Ekr", 130, "Ekr", "Ekr"],
      // egyptiskt pund
      "EGP": [ "EGP", "EG£", 2, "LE", "E£"],
      // eritreansk nakfa
      "ERN": [ "ERN", "ERN", 2, "ERN", "Nfk"],
      // spansk peseta (konto)
      "ESA": [ "ESA", "ESA", 130, "ESA", "ESA"],
      // spansk peseta (konvertibelt konto)
      "ESB": [ "ESB", "ESB", 130, "ESB", "ESB"],
      // spansk peseta
      "ESP": [ "ESP", "ESP", 128, "ESP", "ESP"],
      // etiopisk birr
      "ETB": [ "ETB", "ETB", 2, "ETB", "Birr"],
      // euro
      "EUR": [ "EUR", "€", 2, "€", "€"],
      // finsk mark
      "FIM": [ "FIM", "FIM", 130, "FIM", "FIM"],
      // Fijidollar
      "FJD": [ "FJD", "FJD", 2, "FJD", "$"],
      // Falklandspund
      "FKP": [ "FKP", "FKP", 2, "FKP", "£"],
      // fransk franc
      "FRF": [ "FRF", "FRF", 130, "FRF", "FRF"],
      // brittiskt pund
      "GBP": [ "GBP", "GB£", 2, "GB£", "£"],
      // georgisk kupon larit
      "GEK": [ "GEK", "GEK", 130, "GEK", "GEK"],
      // georgisk lari
      "GEL": [ "GEL", "₾", 2, "₾", "GEL"],
      // ghanansk cedi (1979–2007)
      "GHC": [ "GHC", "GHC", 130, "GHC", "GHC"],
      // ghanansk cedi
      "GHS": [ "GHS", "GHS", 2, "GHS", "GHS"],
      // gibraltiskt pund
      "GIP": [ "GIP", "GIP", 2, "GIP", "£"],
      // gambisk dalasi
      "GMD": [ "GMD", "GMD", 2, "GMD", "GMD"],
      // guineansk franc
      "GNF": [ "GNF", "GNF", 0, "GNF", "FG"],
      // guineansk syli
      "GNS": [ "GNS", "GNS", 130, "GNS", "GNS"],
      // ekvatorialguineansk ekwele
      "GQE": [ "GQE", "GQE", 130, "GQE", "GQE"],
      // grekisk drachma
      "GRD": [ "GRD", "GRD", 130, "GRD", "GRD"],
      // guatemalansk quetzal
      "GTQ": [ "GTQ", "GTQ", 2, "GTQ", "Q"],
      // Portugisiska Guinea-escudo
      "GWE": [ "GWE", "GWE", 130, "GWE", "GWE"],
      // Guinea-Bissau-peso
      "GWP": [ "GWP", "GWP", 130, "GWP", "GWP"],
      // Guyanadollar
      "GYD": [ "GYD", "GYD", 2, "GYD", "$"],
      // Hongkongdollar
      "HKD": [ "HKD", "HK$", 2, "HK$", "$"],
      // honduransk lempira
      "HNL": [ "HNL", "L", 2, "L", "L"],
      // kroatisk dinar
      "HRD": [ "HRD", "HRD", 130, "HRD", "HRD"],
      // kroatisk kuna
      "HRK": [ "HRK", "HRK", 2, "HRK", "kn"],
      // haitisk gourde
      "HTG": [ "HTG", "HTG", 2, "HTG", "HTG"],
      // ungersk forint
      "HUF": [ "HUF", "HUF", 2, "HUF", "Ft"],
      // indonesisk rupie
      "IDR": [ "IDR", "IDR", 2, "IDR", "Rp"],
      // irländskt pund
      "IEP": [ "IEP", "IE£", 130, "IE£", "IE£"],
      // israeliskt pund
      "ILP": [ "ILP", "ILP", 130, "ILP", "ILP"],
      // israelisk shekel (1980–1985)
      "ILR": [ "ILR", "ILR", 130, "ILR", "ILR"],
      // israelisk ny shekel
      "ILS": [ "ILS", "₪", 2, "IL₪", "₪"],
      // indisk rupie
      "INR": [ "INR", "Rs", 2, "Rs", "₹"],
      // irakisk dinar
      "IQD": [ "IQD", "IQD", 0, "IQD", "din"],
      // iransk rial
      "IRR": [ "IRR", "IRR", 0, "IRR", "Rial"],
      // isländsk gammal krona
      "ISJ": [ "ISJ", "ISJ", 130, "ISJ", "ISJ"],
      // isländsk krona
      "ISK": [ "ISK", "Ikr", 0, "kr", "kr"],
      // italiensk lire
      "ITL": [ "ITL", "ITL", 128, "ITL", "ITL"],
      // Jamaica-dollar
      "JMD": [ "JMD", "JM$", 2, "JA$", "$"],
      // jordansk dinar
      "JOD": [ "JOD", "JOD", 3, "JOD", "din"],
      // japansk yen
      "JPY": [ "JPY", "JP¥", 0, "JP¥", "¥"],
      // kenyansk shilling
      "KES": [ "KES", "Ksh", 2, "Ksh", "Ksh"],
      // kirgizisk som
      "KGS": [ "KGS", "KGS", 2, "KGS", "KGS"],
      // kambodjansk riel
      "KHR": [ "KHR", "KHR", 2, "KHR", "Riel"],
      // komorisk franc
      "KMF": [ "KMF", "KMF", 0, "KMF", "CF"],
      // nordkoreansk won
      "KPW": [ "KPW", "KPW", 0, "KPW", "₩"],
      // sydkoreansk hwan (1953–1962)
      "KRH": [ "KRH", "KRH", 130, "KRH", "KRH"],
      // sydkoreansk won (1945–1953)
      "KRO": [ "KRO", "KRO", 130, "KRO", "KRO"],
      // sydkoreansk won
      "KRW": [ "KRW", "KR₩", 0, "KR₩", "₩"],
      // kuwaitisk dinar
      "KWD": [ "KWD", "KWD", 3, "KWD", "din"],
      // Cayman-dollar
      "KYD": [ "KYD", "KYD", 2, "KYD", "$"],
      // kazakisk tenge
      "KZT": [ "KZT", "KZT", 2, "KZT", "₸"],
      // laotisk kip
      "LAK": [ "LAK", "LAK", 0, "LAK", "₭"],
      // libanesiskt pund
      "LBP": [ "LBP", "LBP", 0, "LBP", "L£"],
      // srilankesisk rupie
      "LKR": [ "LKR", "SLRs", 2, "SLRs", "Rs"],
      // liberiansk dollar
      "LRD": [ "LRD", "LRD", 2, "LRD", "$"],
      // lesothisk loti
      "LSL": [ "LSL", "LSL", 2, "LSL", "LSL"],
      // litauisk litas
      "LTL": [ "LTL", "LTL", 130, "LTL", "Lt"],
      // litauisk talonas
      "LTT": [ "LTT", "LTT", 130, "LTT", "LTT"],
      // luxemburgsk franc (konvertibel)
      "LUC": [ "LUC", "LUC", 130, "LUC", "LUC"],
      // luxemburgsk franc
      "LUF": [ "LUF", "LUF", 128, "LUF", "LUF"],
      // luxemburgsk franc (finansiell)
      "LUL": [ "LUL", "LUL", 130, "LUL", "LUL"],
      // lettisk lats
      "LVL": [ "LVL", "LVL", 130, "LVL", "Ls"],
      // lettisk rubel
      "LVR": [ "LVR", "LVR", 130, "LVR", "LVR"],
      // libysk dinar
      "LYD": [ "LYD", "LYD", 3, "LYD", "din"],
      // marockansk dirham
      "MAD": [ "MAD", "MAD", 2, "MAD", "MAD"],
      // marockansk franc
      "MAF": [ "MAF", "MAF", 130, "MAF", "MAF"],
      // monegaskisk franc (–2001)
      "MCF": [ "MCF", "MCF", 130, "MCF", "MCF"],
      // moldavisk cupon (1992–1993)
      "MDC": [ "MDC", "MDC", 130, "MDC", "MDC"],
      // moldavisk leu
      "MDL": [ "MDL", "MDL", 2, "MDL", "MDL"],
      // madagaskisk ariary
      "MGA": [ "MGA", "MGA", 0, "MGA", "Ar"],
      // madagaskisk franc
      "MGF": [ "MGF", "MGF", 128, "MGF", "MGF"],
      // makedonisk denar
      "MKD": [ "MKD", "MKD", 2, "MKD", "din"],
      // makedonisk denar (1992–1993)
      "MKN": [ "MKN", "MKN", 130, "MKN", "MKN"],
      // malisk franc
      "MLF": [ "MLF", "MLF", 130, "MLF", "MLF"],
      // myanmarisk kyat
      "MMK": [ "MMK", "MMK", 0, "MMK", "K"],
      // mongolisk tögrög
      "MNT": [ "MNT", "MN₮", 2, "MN₮", "₮"],
      // makanesisk pataca
      "MOP": [ "MOP", "MOP", 2, "MOP", "MOP"],
      // mauretansk ouguiya (1973–2017)
      "MRO": [ "MRO", "MRO", 128, "MRO", "MRO"],
      // mauretansk ouguiya
      "MRU": [ "MRU", "MRU", 2, "MRU", "MRU"],
      // maltesisk lire
      "MTL": [ "MTL", "MTL", 130, "MTL", "MTL"],
      // maltesiskt pund
      "MTP": [ "MTP", "MTP", 130, "MTP", "MTP"],
      // mauritisk rupie
      "MUR": [ "MUR", "MUR", 2, "MUR", "Rs"],
      // maldivisk rupie
      "MVP": [ "MVP", "MVP", 130, "MVP", "MVP"],
      // maldivisk rufiyaa
      "MVR": [ "MVR", "MVR", 2, "MVR", "MVR"],
      // malawisk kwacha
      "MWK": [ "MWK", "MWK", 2, "MWK", "MWK"],
      // mexikansk peso
      "MXN": [ "MXN", "MX$", 2, "Mex$", "$"],
      // mexikansk silverpeso (1861–1992)
      "MXP": [ "MXP", "MXP", 130, "MXP", "MXP"],
      // mexikansk unidad de inversion
      "MXV": [ "MXV", "MXV", 130, "MXV", "MXV"],
      // malaysisk ringgit
      "MYR": [ "MYR", "RM", 2, "RM", "RM"],
      // moçambikisk escudo
      "MZE": [ "MZE", "MZE", 130, "MZE", "MZE"],
      // gammal moçambikisk metical
      "MZM": [ "MZM", "MZM", 130, "MZM", "MZM"],
      // moçambikisk metical
      "MZN": [ "MZN", "MZN", 2, "MZN", "MTn"],
      // namibisk dollar
      "NAD": [ "NAD", "NAD", 2, "NAD", "$"],
      // nigeriansk naira
      "NGN": [ "NGN", "NGN", 2, "NGN", "₦"],
      // nicaraguansk córdoba (1998–1991)
      "NIC": [ "NIC", "NIC", 130, "NIC", "NIC"],
      // nicaraguansk córdoba
      "NIO": [ "NIO", "NIO", 2, "NIO", "C$"],
      // nederländsk gulden
      "NLG": [ "NLG", "NLG", 130, "NLG", "NLG"],
      // norsk krona
      "NOK": [ "NOK", "Nkr", 2, "NOkr", "kr"],
      // nepalesisk rupie
      "NPR": [ "NPR", "NPR", 2, "NPR", "Rs"],
      // nyzeeländsk dollar
      "NZD": [ "NZD", "NZD", 2, "NZD", "$"],
      // omansk rial
      "OMR": [ "OMR", "OMR", 3, "OMR", "Rial"],
      // panamansk balboa
      "PAB": [ "PAB", "B/.", 2, "B/.", "B/."],
      // peruansk inti
      "PEI": [ "PEI", "PEI", 130, "PEI", "PEI"],
      // peruansk sol
      "PEN": [ "PEN", "S/.", 2, "S/.", "S/."],
      // peruansk sol (1863–1965)
      "PES": [ "PES", "PES", 130, "PES", "PES"],
      // papuansk kina
      "PGK": [ "PGK", "PGK", 2, "PGK", "PGK"],
      // filippinsk peso
      "PHP": [ "PHP", "PHP", 2, "PHP", "₱"],
      // pakistansk rupie
      "PKR": [ "PKR", "PKRs.", 2, "PKRs.", "Rs"],
      // polsk zloty
      "PLN": [ "PLN", "PLN", 2, "PLN", "zł"],
      // polsk zloty (1950–1995)
      "PLZ": [ "PLZ", "PLZ", 130, "PLZ", "PLZ"],
      // portugisisk escudo
      "PTE": [ "PTE", "PTE", 130, "PTE", "PTE"],
      // paraguayansk guarani
      "PYG": [ "PYG", "PYG", 0, "PYG", "Gs"],
      // qatarisk rial
      "QAR": [ "QAR", "QAR", 2, "QAR", "Rial"],
      // rhodesisk dollar
      "RHD": [ "RHD", "RHD", 130, "RHD", "RHD"],
      // rumänsk leu (1952–2005)
      "ROL": [ "ROL", "ROL", 130, "ROL", "ROL"],
      // rumänsk leu
      "RON": [ "RON", "RON", 2, "RON", "RON"],
      // serbisk dinar
      "RSD": [ "RSD", "RSD", 0, "RSD", "din"],
      // rysk rubel
      "RUB": [ "RUB", "руб.", 2, "руб.", "руб."],
      // rysk rubel (1991–1998)
      "RUR": [ "RUR", "RUR", 130, "RUR", "RUR"],
      // rwandisk franc
      "RWF": [ "RWF", "RWF", 0, "RWF", "RF"],
      // saudisk riyal
      "SAR": [ "SAR", "SR", 2, "SR", "Rial"],
      // Salomondollar
      "SBD": [ "SBD", "SBD", 2, "SBD", "$"],
      // seychellisk rupie
      "SCR": [ "SCR", "SCR", 2, "SCR", "SCR"],
      // sudansk dinar (1992–2007)
      "SDD": [ "SDD", "SDD", 130, "SDD", "SDD"],
      // sudanesiskt pund
      "SDG": [ "SDG", "SDG", 2, "SDG", "SDG"],
      // sudanskt pund (1916–1992)
      "SDP": [ "SDP", "SDP", 130, "SDP", "SDP"],
      // svensk krona
      "SEK": [ "SEK", "kr", 2, "kr", "kr"],
      // singaporiansk dollar
      "SGD": [ "SGD", "S$", 2, "S$", "$"],
      // S:t Helena-pund
      "SHP": [ "SHP", "SHP", 2, "SHP", "£"],
      // slovensk tolar
      "SIT": [ "SIT", "SIT", 130, "SIT", "SIT"],
      // slovakisk koruna
      "SKK": [ "SKK", "SKK", 130, "SKK", "SKK"],
      // sierraleonsk leone
      "SLL": [ "SLL", "SLL", 0, "SLL", "SLL"],
      // somalisk shilling
      "SOS": [ "SOS", "SOS", 0, "SOS", "SOS"],
      // surinamesisk dollar
      "SRD": [ "SRD", "SRD", 2, "SRD", "$"],
      // surinamesisk gulden
      "SRG": [ "SRG", "SRG", 130, "SRG", "SRG"],
      // sydsudanesiskt pund
      "SSP": [ "SSP", "SSP", 2, "SSP", "SSP"],
      // saotomeansk dobra (1977–2017)
      "STD": [ "STD", "STD", 128, "STD", "Db"],
      // saotomeansk dobra
      "STN": [ "STN", "STN", 2, "STN", "STN"],
      // sovjetisk rubel
      "SUR": [ "SUR", "SUR", 130, "SUR", "SUR"],
      // salvadoransk colón
      "SVC": [ "SVC", "SVC", 130, "SVC", "SVC"],
      // syriskt pund
      "SYP": [ "SYP", "SYP", 0, "SYP", "£"],
      // swaziländsk lilangeni
      "SZL": [ "SZL", "SZL", 2, "SZL", "SZL"],
      // thailändsk baht
      "THB": [ "THB", "THB", 2, "THB", "฿"],
      // tadzjikisk rubel
      "TJR": [ "TJR", "TJR", 130, "TJR", "TJR"],
      // tadzjikisk somoni
      "TJS": [ "TJS", "TJS", 2, "TJS", "Som"],
      // turkmenistansk manat (1993–2009)
      "TMM": [ "TMM", "TMM", 128, "TMM", "TMM"],
      // turkmenistansk manat
      "TMT": [ "TMT", "TMT", 2, "TMT", "TMT"],
      // tunisisk dinar
      "TND": [ "TND", "TND", 3, "TND", "din"],
      // tongansk paʻanga
      "TOP": [ "TOP", "TOP", 2, "TOP", "T$"],
      // timoriansk escudo
      "TPE": [ "TPE", "TPE", 130, "TPE", "TPE"],
      // turkisk lire (1922–2005)
      "TRL": [ "TRL", "TRL", 128, "TRL", "TRL"],
      // turkisk lira
      "TRY": [ "TRY", "TL", 2, "YTL", "TL"],
      // Trinidad och Tobago-dollar
      "TTD": [ "TTD", "TTD", 2, "TTD", "$"],
      // Taiwandollar
      "TWD": [ "TWD", "NT$", 2, "NT$", "NT$"],
      // tanzanisk shilling
      "TZS": [ "TZS", "TZS", 2, "TZS", "TSh"],
      // ukrainsk hryvnia
      "UAH": [ "UAH", "UAH", 2, "UAH", "₴"],
      // ukrainsk karbovanetz
      "UAK": [ "UAK", "UAK", 130, "UAK", "UAK"],
      // ugandisk shilling (1966–1987)
      "UGS": [ "UGS", "UGS", 130, "UGS", "UGS"],
      // ugandisk shilling
      "UGX": [ "UGX", "UGX", 0, "UGX", "UGX"],
      // US-dollar
      "USD": [ "USD", "US$", 2, "US$", "$"],
      // US-dollar (nästa dag)
      "USN": [ "USN", "USN", 130, "USN", "USN"],
      // US-dollar (samma dag)
      "USS": [ "USS", "USS", 130, "USS", "USS"],
      // uruguayansk peso en unidades indexadas
      "UYI": [ "UYI", "UYI", 128, "UYI", "UYI"],
      // uruguayansk peso (1975–1993)
      "UYP": [ "UYP", "UYP", 130, "UYP", "UYP"],
      // uruguayansk peso
      "UYU": [ "UYU", "UY$", 2, "UY$", "$"],
      // uzbekisk sum
      "UZS": [ "UZS", "UZS", 2, "UZS", "soʼm"],
      // venezuelansk bolivar (1871–2008)
      "VEB": [ "VEB", "VEB", 130, "VEB", "VEB"],
      // venezuelansk bolívar (2008–2018)
      "VEF": [ "VEF", "VEF", 130, "VEF", "Bs"],
      // venezuelansk bolívar
      "VES": [ "VES", "VES", 2, "VES", "VES"],
      // vietnamesisk dong
      "VND": [ "VND", "₫", 24, "₫", "₫"],
      // vietnamesisk dong (1978–1985)
      "VNN": [ "VNN", "VNN", 130, "VNN", "VNN"],
      // vanuatisk vatu
      "VUV": [ "VUV", "VUV", 0, "VUV", "VUV"],
      // västsamoansk tala
      "WST": [ "WST", "WST", 2, "WST", "WST"],
      // centralafrikansk franc
      "XAF": [ "XAF", "FCFA", 0, "FCFA", "FCFA"],
      // silver
      "XAG": [ "XAG", "XAG", 130, "XAG", "XAG"],
      // guld
      "XAU": [ "XAU", "XAU", 130, "XAU", "XAU"],
      // europeisk kompositenhet
      "XBA": [ "XBA", "XBA", 130, "XBA", "XBA"],
      // europeisk monetär enhet
      "XBB": [ "XBB", "XBB", 130, "XBB", "XBB"],
      // europeisk kontoenhet (XBC)
      "XBC": [ "XBC", "XBC", 130, "XBC", "XBC"],
      // europeisk kontoenhet (XBD)
      "XBD": [ "XBD", "XBD", 130, "XBD", "XBD"],
      // östkaribisk dollar
      "XCD": [ "XCD", "EC$", 2, "EC$", "$"],
      // IMF särskild dragningsrätt
      "XDR": [ "XDR", "XDR", 130, "XDR", "XDR"],
      // europeisk valutaenhet
      "XEU": [ "XEU", "XEU", 130, "XEU", "XEU"],
      // fransk guldfranc
      "XFO": [ "XFO", "XFO", 130, "XFO", "XFO"],
      // internationella järnvägsunionens franc
      "XFU": [ "XFU", "XFU", 130, "XFU", "XFU"],
      // västafrikansk franc
      "XOF": [ "XOF", "CFA", 0, "CFA", "CFA"],
      // palladium
      "XPD": [ "XPD", "XPD", 130, "XPD", "XPD"],
      // CFP-franc
      "XPF": [ "XPF", "CFPF", 0, "CFPF", "FCFP"],
      // platina
      "XPT": [ "XPT", "XPT", 130, "XPT", "XPT"],
      // RINET-fond
      "XRE": [ "XRE", "XRE", 130, "XRE", "XRE"],
      // latinamerikansk sucre
      "XSU": [ "XSU", "XSU", 130, "XSU", "XSU"],
      // test-valutakod
      "XTS": [ "XTS", "XTS", 130, "XTS", "XTS"],
      // afrikansk kontoenhet
      "XUA": [ "XUA", "XUA", 130, "XUA", "XUA"],
      // okänd valuta
      "XXX": [ "XXX", "¤", 130, "¤", "¤"],
      // jemenitisk dinar
      "YDD": [ "YDD", "YDD", 130, "YDD", "YDD"],
      // jemenitisk rial
      "YER": [ "YER", "YER", 0, "YER", "Rial"],
      // jugoslavisk dinar (1966–1990)
      "YUD": [ "YUD", "YUD", 130, "YUD", "YUD"],
      // jugoslavisk dinar (1994–2002)
      "YUM": [ "YUM", "YUM", 130, "YUM", "YUM"],
      // jugoslavisk dinar (1990–1992)
      "YUN": [ "YUN", "YUN", 130, "YUN", "YUN"],
      // jugoslavisk dinar (1992–1993)
      "YUR": [ "YUR", "YUR", 130, "YUR", "YUR"],
      // sydafrikansk rand (finansiell)
      "ZAL": [ "ZAL", "ZAL", 130, "ZAL", "ZAL"],
      // sydafrikansk rand
      "ZAR": [ "ZAR", "ZAR", 2, "ZAR", "R"],
      // zambisk kwacha (1968–2012)
      "ZMK": [ "ZMK", "ZMK", 128, "ZMK", "ZWK"],
      // zambisk kwacha
      "ZMW": [ "ZMW", "ZMW", 2, "ZMW", "ZMW"],
      // zairisk ny zaire
      "ZRN": [ "ZRN", "ZRN", 130, "ZRN", "ZRN"],
      // zairisk zaire
      "ZRZ": [ "ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"],
      // Zimbabwe-dollar
      "ZWD": [ "ZWD", "ZWD", 128, "ZWD", "ZWD"],
      // Zimbabwe-dollar (2009)
      "ZWL": [ "ZWL", "ZWL", 130, "ZWL", "ZWL"],
      // Zimbabwe-dollar (2008)
      "ZWR": [ "ZWR", "ZWR", 130, "ZWR", "ZWR"],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("ADP", "andorransk peseta");
    result.put("AED", "Förenade Arabemiratens dirham");
    result.put("AFA", "afghani (1927–2002)");
    result.put("AFN", "afghansk afghani");
    result.put("ALK", "albansk lek (1946–1965)");
    result.put("ALL", "albansk lek");
    result.put("AMD", "armenisk dram");
    result.put("ANG", "Nederländska Antillernas gulden");
    result.put("AOA", "angolansk kwanza");
    result.put("AOK", "angolansk kwanza (1977–1990)");
    result.put("AON", "angolansk ny kwanza (1990–2000)");
    result.put("AOR", "angolansk kwanza reajustado (1995–1999)");
    result.put("ARA", "argentinsk austral");
    result.put("ARL", "argentisk peso (1970–1983)");
    result.put("ARM", "argentisk peso (1881–1969)");
    result.put("ARP", "argentinsk peso (1983–1985)");
    result.put("ARS", "argentinsk peso");
    result.put("ATS", "österrikisk schilling");
    result.put("AUD", "australisk dollar");
    result.put("AWG", "arubansk florin");
    result.put("AZM", "azerbajdzjansk manat (1993–2006)");
    result.put("AZN", "azerbajdzjansk manat");
    result.put("BAD", "bosnisk-hercegovinsk dinar (1992–1994)");
    result.put("BAM", "bosnisk-hercegovinsk mark (konvertibel)");
    result.put("BAN", "bosnisk-hercegovinsk dinar (1994–1998)");
    result.put("BBD", "Barbados-dollar");
    result.put("BDT", "bangladeshisk taka");
    result.put("BEC", "belgisk franc (konvertibel)");
    result.put("BEF", "belgisk franc");
    result.put("BEL", "belgisk franc (finansiell)");
    result.put("BGL", "bulgarisk hård lev (1962–1999)");
    result.put("BGM", "bulgarisk lev (1952–1962)");
    result.put("BGN", "bulgarisk lev");
    result.put("BGO", "bulgarisk lev (1881–1952)");
    result.put("BHD", "bahrainsk dinar");
    result.put("BIF", "burundisk franc");
    result.put("BMD", "Bermuda-dollar");
    result.put("BND", "bruneisk dollar");
    result.put("BOB", "boliviansk boliviano");
    result.put("BOL", "boliviansk boliviano (1864–1963)");
    result.put("BOP", "boliviansk peso");
    result.put("BOV", "boliviansk mvdol");
    result.put("BRB", "brasiliansk cruzeiro novo (1967–1986)");
    result.put("BRC", "brasiliansk cruzado");
    result.put("BRE", "brasiliansk cruzeiro (1990–1993)");
    result.put("BRL", "brasiliansk real");
    result.put("BRN", "brasiliansk cruzado novo");
    result.put("BRR", "brasiliansk cruzeiro");
    result.put("BRZ", "brasiliansk cruzeiro (1942–1967)");
    result.put("BSD", "bahamansk dollar");
    result.put("BTN", "bhutanesisk ngultrum");
    result.put("BUK", "burmesisk kyat");
    result.put("BWP", "botswansk pula");
    result.put("BYB", "vitrysk ny rubel (1994–1999)");
    result.put("BYN", "vitrysk rubel");
    result.put("BYR", "vitrysk rubel (2000–2016)");
    result.put("BZD", "belizisk dollar");
    result.put("CAD", "kanadensisk dollar");
    result.put("CDF", "kongolesisk franc");
    result.put("CHE", "euro (konvertibelt konto, WIR Bank, Schweiz)");
    result.put("CHF", "schweizisk franc");
    result.put("CHW", "franc (konvertibelt konto, WIR Bank, Schweiz)");
    result.put("CLE", "chilensk escudo (1960–1975)");
    result.put("CLF", "chilensk unidad de fomento");
    result.put("CLP", "chilensk peso");
    result.put("CNX", "kinesisk dollar");
    result.put("CNY", "kinesisk yuan");
    result.put("COP", "colombiansk peso");
    result.put("COU", "colombiansk unidad de valor real");
    result.put("CRC", "costarikansk colón");
    result.put("CSD", "serbisk dinar (2002–2006)");
    result.put("CSK", "tjeckoslovakisk krona (–1993)");
    result.put("CUC", "kubansk peso (konvertibel)");
    result.put("CUP", "kubansk peso");
    result.put("CVE", "kapverdisk escudo");
    result.put("CYP", "cypriotiskt pund");
    result.put("CZK", "tjeckisk koruna");
    result.put("DDM", "östtysk mark");
    result.put("DEM", "tysk mark");
    result.put("DJF", "djiboutisk franc");
    result.put("DKK", "dansk krona");
    result.put("DOP", "dominikansk peso");
    result.put("DZD", "algerisk dinar");
    result.put("ECS", "ecuadoriansk sucre");
    result.put("ECV", "ecuadoriansk unidad de valor constante");
    result.put("EEK", "estnisk krona");
    result.put("EGP", "egyptiskt pund");
    result.put("ERN", "eritreansk nakfa");
    result.put("ESA", "spansk peseta (konto)");
    result.put("ESB", "spansk peseta (konvertibelt konto)");
    result.put("ESP", "spansk peseta");
    result.put("ETB", "etiopisk birr");
    result.put("EUR", "euro");
    result.put("FIM", "finsk mark");
    result.put("FJD", "Fijidollar");
    result.put("FKP", "Falklandspund");
    result.put("FRF", "fransk franc");
    result.put("GBP", "brittiskt pund");
    result.put("GEK", "georgisk kupon larit");
    result.put("GEL", "georgisk lari");
    result.put("GHC", "ghanansk cedi (1979–2007)");
    result.put("GHS", "ghanansk cedi");
    result.put("GIP", "gibraltiskt pund");
    result.put("GMD", "gambisk dalasi");
    result.put("GNF", "guineansk franc");
    result.put("GNS", "guineansk syli");
    result.put("GQE", "ekvatorialguineansk ekwele");
    result.put("GRD", "grekisk drachma");
    result.put("GTQ", "guatemalansk quetzal");
    result.put("GWE", "Portugisiska Guinea-escudo");
    result.put("GWP", "Guinea-Bissau-peso");
    result.put("GYD", "Guyanadollar");
    result.put("HKD", "Hongkongdollar");
    result.put("HNL", "honduransk lempira");
    result.put("HRD", "kroatisk dinar");
    result.put("HRK", "kroatisk kuna");
    result.put("HTG", "haitisk gourde");
    result.put("HUF", "ungersk forint");
    result.put("IDR", "indonesisk rupie");
    result.put("IEP", "irländskt pund");
    result.put("ILP", "israeliskt pund");
    result.put("ILR", "israelisk shekel (1980–1985)");
    result.put("ILS", "israelisk ny shekel");
    result.put("INR", "indisk rupie");
    result.put("IQD", "irakisk dinar");
    result.put("IRR", "iransk rial");
    result.put("ISJ", "isländsk gammal krona");
    result.put("ISK", "isländsk krona");
    result.put("ITL", "italiensk lire");
    result.put("JMD", "Jamaica-dollar");
    result.put("JOD", "jordansk dinar");
    result.put("JPY", "japansk yen");
    result.put("KES", "kenyansk shilling");
    result.put("KGS", "kirgizisk som");
    result.put("KHR", "kambodjansk riel");
    result.put("KMF", "komorisk franc");
    result.put("KPW", "nordkoreansk won");
    result.put("KRH", "sydkoreansk hwan (1953–1962)");
    result.put("KRO", "sydkoreansk won (1945–1953)");
    result.put("KRW", "sydkoreansk won");
    result.put("KWD", "kuwaitisk dinar");
    result.put("KYD", "Cayman-dollar");
    result.put("KZT", "kazakisk tenge");
    result.put("LAK", "laotisk kip");
    result.put("LBP", "libanesiskt pund");
    result.put("LKR", "srilankesisk rupie");
    result.put("LRD", "liberiansk dollar");
    result.put("LSL", "lesothisk loti");
    result.put("LTL", "litauisk litas");
    result.put("LTT", "litauisk talonas");
    result.put("LUC", "luxemburgsk franc (konvertibel)");
    result.put("LUF", "luxemburgsk franc");
    result.put("LUL", "luxemburgsk franc (finansiell)");
    result.put("LVL", "lettisk lats");
    result.put("LVR", "lettisk rubel");
    result.put("LYD", "libysk dinar");
    result.put("MAD", "marockansk dirham");
    result.put("MAF", "marockansk franc");
    result.put("MCF", "monegaskisk franc (–2001)");
    result.put("MDC", "moldavisk cupon (1992–1993)");
    result.put("MDL", "moldavisk leu");
    result.put("MGA", "madagaskisk ariary");
    result.put("MGF", "madagaskisk franc");
    result.put("MKD", "makedonisk denar");
    result.put("MKN", "makedonisk denar (1992–1993)");
    result.put("MLF", "malisk franc");
    result.put("MMK", "myanmarisk kyat");
    result.put("MNT", "mongolisk tögrög");
    result.put("MOP", "makanesisk pataca");
    result.put("MRO", "mauretansk ouguiya (1973–2017)");
    result.put("MRU", "mauretansk ouguiya");
    result.put("MTL", "maltesisk lire");
    result.put("MTP", "maltesiskt pund");
    result.put("MUR", "mauritisk rupie");
    result.put("MVP", "maldivisk rupie");
    result.put("MVR", "maldivisk rufiyaa");
    result.put("MWK", "malawisk kwacha");
    result.put("MXN", "mexikansk peso");
    result.put("MXP", "mexikansk silverpeso (1861–1992)");
    result.put("MXV", "mexikansk unidad de inversion");
    result.put("MYR", "malaysisk ringgit");
    result.put("MZE", "moçambikisk escudo");
    result.put("MZM", "gammal moçambikisk metical");
    result.put("MZN", "moçambikisk metical");
    result.put("NAD", "namibisk dollar");
    result.put("NGN", "nigeriansk naira");
    result.put("NIC", "nicaraguansk córdoba (1998–1991)");
    result.put("NIO", "nicaraguansk córdoba");
    result.put("NLG", "nederländsk gulden");
    result.put("NOK", "norsk krona");
    result.put("NPR", "nepalesisk rupie");
    result.put("NZD", "nyzeeländsk dollar");
    result.put("OMR", "omansk rial");
    result.put("PAB", "panamansk balboa");
    result.put("PEI", "peruansk inti");
    result.put("PEN", "peruansk sol");
    result.put("PES", "peruansk sol (1863–1965)");
    result.put("PGK", "papuansk kina");
    result.put("PHP", "filippinsk peso");
    result.put("PKR", "pakistansk rupie");
    result.put("PLN", "polsk zloty");
    result.put("PLZ", "polsk zloty (1950–1995)");
    result.put("PTE", "portugisisk escudo");
    result.put("PYG", "paraguayansk guarani");
    result.put("QAR", "qatarisk rial");
    result.put("RHD", "rhodesisk dollar");
    result.put("ROL", "rumänsk leu (1952–2005)");
    result.put("RON", "rumänsk leu");
    result.put("RSD", "serbisk dinar");
    result.put("RUB", "rysk rubel");
    result.put("RUR", "rysk rubel (1991–1998)");
    result.put("RWF", "rwandisk franc");
    result.put("SAR", "saudisk riyal");
    result.put("SBD", "Salomondollar");
    result.put("SCR", "seychellisk rupie");
    result.put("SDD", "sudansk dinar (1992–2007)");
    result.put("SDG", "sudanesiskt pund");
    result.put("SDP", "sudanskt pund (1916–1992)");
    result.put("SEK", "svensk krona");
    result.put("SGD", "singaporiansk dollar");
    result.put("SHP", "S:t Helena-pund");
    result.put("SIT", "slovensk tolar");
    result.put("SKK", "slovakisk koruna");
    result.put("SLL", "sierraleonsk leone");
    result.put("SOS", "somalisk shilling");
    result.put("SRD", "surinamesisk dollar");
    result.put("SRG", "surinamesisk gulden");
    result.put("SSP", "sydsudanesiskt pund");
    result.put("STD", "saotomeansk dobra (1977–2017)");
    result.put("STN", "saotomeansk dobra");
    result.put("SUR", "sovjetisk rubel");
    result.put("SVC", "salvadoransk colón");
    result.put("SYP", "syriskt pund");
    result.put("SZL", "swaziländsk lilangeni");
    result.put("THB", "thailändsk baht");
    result.put("TJR", "tadzjikisk rubel");
    result.put("TJS", "tadzjikisk somoni");
    result.put("TMM", "turkmenistansk manat (1993–2009)");
    result.put("TMT", "turkmenistansk manat");
    result.put("TND", "tunisisk dinar");
    result.put("TOP", "tongansk paʻanga");
    result.put("TPE", "timoriansk escudo");
    result.put("TRL", "turkisk lire (1922–2005)");
    result.put("TRY", "turkisk lira");
    result.put("TTD", "Trinidad och Tobago-dollar");
    result.put("TWD", "Taiwandollar");
    result.put("TZS", "tanzanisk shilling");
    result.put("UAH", "ukrainsk hryvnia");
    result.put("UAK", "ukrainsk karbovanetz");
    result.put("UGS", "ugandisk shilling (1966–1987)");
    result.put("UGX", "ugandisk shilling");
    result.put("USD", "US-dollar");
    result.put("USN", "US-dollar (nästa dag)");
    result.put("USS", "US-dollar (samma dag)");
    result.put("UYI", "uruguayansk peso en unidades indexadas");
    result.put("UYP", "uruguayansk peso (1975–1993)");
    result.put("UYU", "uruguayansk peso");
    result.put("UZS", "uzbekisk sum");
    result.put("VEB", "venezuelansk bolivar (1871–2008)");
    result.put("VEF", "venezuelansk bolívar (2008–2018)");
    result.put("VES", "venezuelansk bolívar");
    result.put("VND", "vietnamesisk dong");
    result.put("VNN", "vietnamesisk dong (1978–1985)");
    result.put("VUV", "vanuatisk vatu");
    result.put("WST", "västsamoansk tala");
    result.put("XAF", "centralafrikansk franc");
    result.put("XAG", "silver");
    result.put("XAU", "guld");
    result.put("XBA", "europeisk kompositenhet");
    result.put("XBB", "europeisk monetär enhet");
    result.put("XBC", "europeisk kontoenhet (XBC)");
    result.put("XBD", "europeisk kontoenhet (XBD)");
    result.put("XCD", "östkaribisk dollar");
    result.put("XDR", "IMF särskild dragningsrätt");
    result.put("XEU", "europeisk valutaenhet");
    result.put("XFO", "fransk guldfranc");
    result.put("XFU", "internationella järnvägsunionens franc");
    result.put("XOF", "västafrikansk franc");
    result.put("XPD", "palladium");
    result.put("XPF", "CFP-franc");
    result.put("XPT", "platina");
    result.put("XRE", "RINET-fond");
    result.put("XSU", "latinamerikansk sucre");
    result.put("XTS", "test-valutakod");
    result.put("XUA", "afrikansk kontoenhet");
    result.put("XXX", "okänd valuta");
    result.put("YDD", "jemenitisk dinar");
    result.put("YER", "jemenitisk rial");
    result.put("YUD", "jugoslavisk dinar (1966–1990)");
    result.put("YUM", "jugoslavisk dinar (1994–2002)");
    result.put("YUN", "jugoslavisk dinar (1990–1992)");
    result.put("YUR", "jugoslavisk dinar (1992–1993)");
    result.put("ZAL", "sydafrikansk rand (finansiell)");
    result.put("ZAR", "sydafrikansk rand");
    result.put("ZMK", "zambisk kwacha (1968–2012)");
    result.put("ZMW", "zambisk kwacha");
    result.put("ZRN", "zairisk ny zaire");
    result.put("ZRZ", "zairisk zaire");
    result.put("ZWD", "Zimbabwe-dollar");
    result.put("ZWL", "Zimbabwe-dollar (2009)");
    result.put("ZWR", "Zimbabwe-dollar (2008)");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "ADP": "andorransk peseta",
      "AED": "Förenade Arabemiratens dirham",
      "AFA": "afghani (1927–2002)",
      "AFN": "afghansk afghani",
      "ALK": "albansk lek (1946–1965)",
      "ALL": "albansk lek",
      "AMD": "armenisk dram",
      "ANG": "Nederländska Antillernas gulden",
      "AOA": "angolansk kwanza",
      "AOK": "angolansk kwanza (1977–1990)",
      "AON": "angolansk ny kwanza (1990–2000)",
      "AOR": "angolansk kwanza reajustado (1995–1999)",
      "ARA": "argentinsk austral",
      "ARL": "argentisk peso (1970–1983)",
      "ARM": "argentisk peso (1881–1969)",
      "ARP": "argentinsk peso (1983–1985)",
      "ARS": "argentinsk peso",
      "ATS": "österrikisk schilling",
      "AUD": "australisk dollar",
      "AWG": "arubansk florin",
      "AZM": "azerbajdzjansk manat (1993–2006)",
      "AZN": "azerbajdzjansk manat",
      "BAD": "bosnisk-hercegovinsk dinar (1992–1994)",
      "BAM": "bosnisk-hercegovinsk mark (konvertibel)",
      "BAN": "bosnisk-hercegovinsk dinar (1994–1998)",
      "BBD": "Barbados-dollar",
      "BDT": "bangladeshisk taka",
      "BEC": "belgisk franc (konvertibel)",
      "BEF": "belgisk franc",
      "BEL": "belgisk franc (finansiell)",
      "BGL": "bulgarisk hård lev (1962–1999)",
      "BGM": "bulgarisk lev (1952–1962)",
      "BGN": "bulgarisk lev",
      "BGO": "bulgarisk lev (1881–1952)",
      "BHD": "bahrainsk dinar",
      "BIF": "burundisk franc",
      "BMD": "Bermuda-dollar",
      "BND": "bruneisk dollar",
      "BOB": "boliviansk boliviano",
      "BOL": "boliviansk boliviano (1864–1963)",
      "BOP": "boliviansk peso",
      "BOV": "boliviansk mvdol",
      "BRB": "brasiliansk cruzeiro novo (1967–1986)",
      "BRC": "brasiliansk cruzado",
      "BRE": "brasiliansk cruzeiro (1990–1993)",
      "BRL": "brasiliansk real",
      "BRN": "brasiliansk cruzado novo",
      "BRR": "brasiliansk cruzeiro",
      "BRZ": "brasiliansk cruzeiro (1942–1967)",
      "BSD": "bahamansk dollar",
      "BTN": "bhutanesisk ngultrum",
      "BUK": "burmesisk kyat",
      "BWP": "botswansk pula",
      "BYB": "vitrysk ny rubel (1994–1999)",
      "BYN": "vitrysk rubel",
      "BYR": "vitrysk rubel (2000–2016)",
      "BZD": "belizisk dollar",
      "CAD": "kanadensisk dollar",
      "CDF": "kongolesisk franc",
      "CHE": "euro (konvertibelt konto, WIR Bank, Schweiz)",
      "CHF": "schweizisk franc",
      "CHW": "franc (konvertibelt konto, WIR Bank, Schweiz)",
      "CLE": "chilensk escudo (1960–1975)",
      "CLF": "chilensk unidad de fomento",
      "CLP": "chilensk peso",
      "CNX": "kinesisk dollar",
      "CNY": "kinesisk yuan",
      "COP": "colombiansk peso",
      "COU": "colombiansk unidad de valor real",
      "CRC": "costarikansk colón",
      "CSD": "serbisk dinar (2002–2006)",
      "CSK": "tjeckoslovakisk krona (–1993)",
      "CUC": "kubansk peso (konvertibel)",
      "CUP": "kubansk peso",
      "CVE": "kapverdisk escudo",
      "CYP": "cypriotiskt pund",
      "CZK": "tjeckisk koruna",
      "DDM": "östtysk mark",
      "DEM": "tysk mark",
      "DJF": "djiboutisk franc",
      "DKK": "dansk krona",
      "DOP": "dominikansk peso",
      "DZD": "algerisk dinar",
      "ECS": "ecuadoriansk sucre",
      "ECV": "ecuadoriansk unidad de valor constante",
      "EEK": "estnisk krona",
      "EGP": "egyptiskt pund",
      "ERN": "eritreansk nakfa",
      "ESA": "spansk peseta (konto)",
      "ESB": "spansk peseta (konvertibelt konto)",
      "ESP": "spansk peseta",
      "ETB": "etiopisk birr",
      "EUR": "euro",
      "FIM": "finsk mark",
      "FJD": "Fijidollar",
      "FKP": "Falklandspund",
      "FRF": "fransk franc",
      "GBP": "brittiskt pund",
      "GEK": "georgisk kupon larit",
      "GEL": "georgisk lari",
      "GHC": "ghanansk cedi (1979–2007)",
      "GHS": "ghanansk cedi",
      "GIP": "gibraltiskt pund",
      "GMD": "gambisk dalasi",
      "GNF": "guineansk franc",
      "GNS": "guineansk syli",
      "GQE": "ekvatorialguineansk ekwele",
      "GRD": "grekisk drachma",
      "GTQ": "guatemalansk quetzal",
      "GWE": "Portugisiska Guinea-escudo",
      "GWP": "Guinea-Bissau-peso",
      "GYD": "Guyanadollar",
      "HKD": "Hongkongdollar",
      "HNL": "honduransk lempira",
      "HRD": "kroatisk dinar",
      "HRK": "kroatisk kuna",
      "HTG": "haitisk gourde",
      "HUF": "ungersk forint",
      "IDR": "indonesisk rupie",
      "IEP": "irländskt pund",
      "ILP": "israeliskt pund",
      "ILR": "israelisk shekel (1980–1985)",
      "ILS": "israelisk ny shekel",
      "INR": "indisk rupie",
      "IQD": "irakisk dinar",
      "IRR": "iransk rial",
      "ISJ": "isländsk gammal krona",
      "ISK": "isländsk krona",
      "ITL": "italiensk lire",
      "JMD": "Jamaica-dollar",
      "JOD": "jordansk dinar",
      "JPY": "japansk yen",
      "KES": "kenyansk shilling",
      "KGS": "kirgizisk som",
      "KHR": "kambodjansk riel",
      "KMF": "komorisk franc",
      "KPW": "nordkoreansk won",
      "KRH": "sydkoreansk hwan (1953–1962)",
      "KRO": "sydkoreansk won (1945–1953)",
      "KRW": "sydkoreansk won",
      "KWD": "kuwaitisk dinar",
      "KYD": "Cayman-dollar",
      "KZT": "kazakisk tenge",
      "LAK": "laotisk kip",
      "LBP": "libanesiskt pund",
      "LKR": "srilankesisk rupie",
      "LRD": "liberiansk dollar",
      "LSL": "lesothisk loti",
      "LTL": "litauisk litas",
      "LTT": "litauisk talonas",
      "LUC": "luxemburgsk franc (konvertibel)",
      "LUF": "luxemburgsk franc",
      "LUL": "luxemburgsk franc (finansiell)",
      "LVL": "lettisk lats",
      "LVR": "lettisk rubel",
      "LYD": "libysk dinar",
      "MAD": "marockansk dirham",
      "MAF": "marockansk franc",
      "MCF": "monegaskisk franc (–2001)",
      "MDC": "moldavisk cupon (1992–1993)",
      "MDL": "moldavisk leu",
      "MGA": "madagaskisk ariary",
      "MGF": "madagaskisk franc",
      "MKD": "makedonisk denar",
      "MKN": "makedonisk denar (1992–1993)",
      "MLF": "malisk franc",
      "MMK": "myanmarisk kyat",
      "MNT": "mongolisk tögrög",
      "MOP": "makanesisk pataca",
      "MRO": "mauretansk ouguiya (1973–2017)",
      "MRU": "mauretansk ouguiya",
      "MTL": "maltesisk lire",
      "MTP": "maltesiskt pund",
      "MUR": "mauritisk rupie",
      "MVP": "maldivisk rupie",
      "MVR": "maldivisk rufiyaa",
      "MWK": "malawisk kwacha",
      "MXN": "mexikansk peso",
      "MXP": "mexikansk silverpeso (1861–1992)",
      "MXV": "mexikansk unidad de inversion",
      "MYR": "malaysisk ringgit",
      "MZE": "moçambikisk escudo",
      "MZM": "gammal moçambikisk metical",
      "MZN": "moçambikisk metical",
      "NAD": "namibisk dollar",
      "NGN": "nigeriansk naira",
      "NIC": "nicaraguansk córdoba (1998–1991)",
      "NIO": "nicaraguansk córdoba",
      "NLG": "nederländsk gulden",
      "NOK": "norsk krona",
      "NPR": "nepalesisk rupie",
      "NZD": "nyzeeländsk dollar",
      "OMR": "omansk rial",
      "PAB": "panamansk balboa",
      "PEI": "peruansk inti",
      "PEN": "peruansk sol",
      "PES": "peruansk sol (1863–1965)",
      "PGK": "papuansk kina",
      "PHP": "filippinsk peso",
      "PKR": "pakistansk rupie",
      "PLN": "polsk zloty",
      "PLZ": "polsk zloty (1950–1995)",
      "PTE": "portugisisk escudo",
      "PYG": "paraguayansk guarani",
      "QAR": "qatarisk rial",
      "RHD": "rhodesisk dollar",
      "ROL": "rumänsk leu (1952–2005)",
      "RON": "rumänsk leu",
      "RSD": "serbisk dinar",
      "RUB": "rysk rubel",
      "RUR": "rysk rubel (1991–1998)",
      "RWF": "rwandisk franc",
      "SAR": "saudisk riyal",
      "SBD": "Salomondollar",
      "SCR": "seychellisk rupie",
      "SDD": "sudansk dinar (1992–2007)",
      "SDG": "sudanesiskt pund",
      "SDP": "sudanskt pund (1916–1992)",
      "SEK": "svensk krona",
      "SGD": "singaporiansk dollar",
      "SHP": "S:t Helena-pund",
      "SIT": "slovensk tolar",
      "SKK": "slovakisk koruna",
      "SLL": "sierraleonsk leone",
      "SOS": "somalisk shilling",
      "SRD": "surinamesisk dollar",
      "SRG": "surinamesisk gulden",
      "SSP": "sydsudanesiskt pund",
      "STD": "saotomeansk dobra (1977–2017)",
      "STN": "saotomeansk dobra",
      "SUR": "sovjetisk rubel",
      "SVC": "salvadoransk colón",
      "SYP": "syriskt pund",
      "SZL": "swaziländsk lilangeni",
      "THB": "thailändsk baht",
      "TJR": "tadzjikisk rubel",
      "TJS": "tadzjikisk somoni",
      "TMM": "turkmenistansk manat (1993–2009)",
      "TMT": "turkmenistansk manat",
      "TND": "tunisisk dinar",
      "TOP": "tongansk paʻanga",
      "TPE": "timoriansk escudo",
      "TRL": "turkisk lire (1922–2005)",
      "TRY": "turkisk lira",
      "TTD": "Trinidad och Tobago-dollar",
      "TWD": "Taiwandollar",
      "TZS": "tanzanisk shilling",
      "UAH": "ukrainsk hryvnia",
      "UAK": "ukrainsk karbovanetz",
      "UGS": "ugandisk shilling (1966–1987)",
      "UGX": "ugandisk shilling",
      "USD": "US-dollar",
      "USN": "US-dollar (nästa dag)",
      "USS": "US-dollar (samma dag)",
      "UYI": "uruguayansk peso en unidades indexadas",
      "UYP": "uruguayansk peso (1975–1993)",
      "UYU": "uruguayansk peso",
      "UZS": "uzbekisk sum",
      "VEB": "venezuelansk bolivar (1871–2008)",
      "VEF": "venezuelansk bolívar (2008–2018)",
      "VES": "venezuelansk bolívar",
      "VND": "vietnamesisk dong",
      "VNN": "vietnamesisk dong (1978–1985)",
      "VUV": "vanuatisk vatu",
      "WST": "västsamoansk tala",
      "XAF": "centralafrikansk franc",
      "XAG": "silver",
      "XAU": "guld",
      "XBA": "europeisk kompositenhet",
      "XBB": "europeisk monetär enhet",
      "XBC": "europeisk kontoenhet (XBC)",
      "XBD": "europeisk kontoenhet (XBD)",
      "XCD": "östkaribisk dollar",
      "XDR": "IMF särskild dragningsrätt",
      "XEU": "europeisk valutaenhet",
      "XFO": "fransk guldfranc",
      "XFU": "internationella järnvägsunionens franc",
      "XOF": "västafrikansk franc",
      "XPD": "palladium",
      "XPF": "CFP-franc",
      "XPT": "platina",
      "XRE": "RINET-fond",
      "XSU": "latinamerikansk sucre",
      "XTS": "test-valutakod",
      "XUA": "afrikansk kontoenhet",
      "XXX": "okänd valuta",
      "YDD": "jemenitisk dinar",
      "YER": "jemenitisk rial",
      "YUD": "jugoslavisk dinar (1966–1990)",
      "YUM": "jugoslavisk dinar (1994–2002)",
      "YUN": "jugoslavisk dinar (1990–1992)",
      "YUR": "jugoslavisk dinar (1992–1993)",
      "ZAL": "sydafrikansk rand (finansiell)",
      "ZAR": "sydafrikansk rand",
      "ZMK": "zambisk kwacha (1968–2012)",
      "ZMW": "zambisk kwacha",
      "ZRN": "zairisk ny zaire",
      "ZRZ": "zairisk zaire",
      "ZWD": "Zimbabwe-dollar",
      "ZWL": "Zimbabwe-dollar (2009)",
      "ZWR": "Zimbabwe-dollar (2008)",
    };
  }-*/;
}
