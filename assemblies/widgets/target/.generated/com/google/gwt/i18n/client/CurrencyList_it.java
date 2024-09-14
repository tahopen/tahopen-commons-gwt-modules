package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_it extends com.google.gwt.i18n.client.CurrencyList_ {
  
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
    // peseta andorrana
    result.put("ADP", new CurrencyDataImpl("ADP", "ADP", 128, "ADP", "ADP"));
    // dirham degli Emirati Arabi Uniti
    result.put("AED", new CurrencyDataImpl("AED", "DH", 2, "DH", "dh"));
    // afgani (1927–2002)
    result.put("AFA", new CurrencyDataImpl("AFA", "AFA", 130, "AFA", "AFA"));
    // afghani
    result.put("AFN", new CurrencyDataImpl("AFN", "AFN", 0, "AFN", "Af."));
    // lek albanese
    result.put("ALL", new CurrencyDataImpl("ALL", "ALL", 0, "ALL", "Lek"));
    // dram armeno
    result.put("AMD", new CurrencyDataImpl("AMD", "AMD", 2, "AMD", "Dram"));
    // fiorino delle Antille olandesi
    result.put("ANG", new CurrencyDataImpl("ANG", "ANG", 2, "ANG", "ANG"));
    // kwanza angolano
    result.put("AOA", new CurrencyDataImpl("AOA", "AOA", 2, "AOA", "Kz"));
    // kwanza angolano (1977–1990)
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130, "AOK", "AOK"));
    // nuovo kwanza angolano (1990–2000)
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130, "AON", "AON"));
    // kwanza reajustado angolano (1995–1999)
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130, "AOR", "AOR"));
    // austral argentino
    result.put("ARA", new CurrencyDataImpl("ARA", "ARA", 130, "ARA", "ARA"));
    // peso argentino (vecchio Cod.)
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130, "ARP", "ARP"));
    // peso argentino
    result.put("ARS", new CurrencyDataImpl("ARS", "AR$", 2, "AR$", "$"));
    // scellino austriaco
    result.put("ATS", new CurrencyDataImpl("ATS", "ATS", 130, "ATS", "ATS"));
    // dollaro australiano
    result.put("AUD", new CurrencyDataImpl("AUD", "A$", 2, "AU$", "$"));
    // fiorino di Aruba
    result.put("AWG", new CurrencyDataImpl("AWG", "AWG", 2, "AWG", "Afl."));
    // manat azero (1993–2006)
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130, "AZM", "AZM"));
    // manat azero
    result.put("AZN", new CurrencyDataImpl("AZN", "AZN", 2, "AZN", "man."));
    // dinar Bosnia-Herzegovina
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130, "BAD", "BAD"));
    // marco convertibile della Bosnia-Herzegovina
    result.put("BAM", new CurrencyDataImpl("BAM", "BAM", 2, "BAM", "KM"));
    // dollaro di Barbados
    result.put("BBD", new CurrencyDataImpl("BBD", "BBD", 2, "BBD", "$"));
    // taka bangladese
    result.put("BDT", new CurrencyDataImpl("BDT", "Tk", 2, "Tk", "৳"));
    // franco belga (convertibile)
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 130, "BEC", "BEC"));
    // franco belga
    result.put("BEF", new CurrencyDataImpl("BEF", "BEF", 130, "BEF", "BEF"));
    // franco belga (finanziario)
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 130, "BEL", "BEL"));
    // lev bulgaro (1962–1999)
    result.put("BGL", new CurrencyDataImpl("BGL", "BGL", 130, "BGL", "BGL"));
    // lev bulgaro
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2, "BGN", "lev"));
    // dinaro del Bahrein
    result.put("BHD", new CurrencyDataImpl("BHD", "BHD", 3, "BHD", "din"));
    // franco del Burundi
    result.put("BIF", new CurrencyDataImpl("BIF", "BIF", 0, "BIF", "FBu"));
    // dollaro delle Bermuda
    result.put("BMD", new CurrencyDataImpl("BMD", "BMD", 2, "BMD", "$"));
    // dollaro del Brunei
    result.put("BND", new CurrencyDataImpl("BND", "BND", 2, "BND", "$"));
    // boliviano
    result.put("BOB", new CurrencyDataImpl("BOB", "BOB", 2, "BOB", "Bs"));
    // peso boliviano
    result.put("BOP", new CurrencyDataImpl("BOP", "BOP", 130, "BOP", "BOP"));
    // mvdol boliviano
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 130, "BOV", "BOV"));
    // cruzeiro novo brasiliano (1967–1986)
    result.put("BRB", new CurrencyDataImpl("BRB", "BRB", 130, "BRB", "BRB"));
    // cruzado brasiliano
    result.put("BRC", new CurrencyDataImpl("BRC", "BRC", 130, "BRC", "BRC"));
    // cruzeiro brasiliano (1990–1993)
    result.put("BRE", new CurrencyDataImpl("BRE", "BRE", 130, "BRE", "BRE"));
    // real brasiliano
    result.put("BRL", new CurrencyDataImpl("BRL", "R$", 2, "R$", "R$"));
    // cruzado novo brasiliano
    result.put("BRN", new CurrencyDataImpl("BRN", "BRN", 130, "BRN", "BRN"));
    // cruzeiro brasiliano
    result.put("BRR", new CurrencyDataImpl("BRR", "BRR", 130, "BRR", "BRR"));
    // dollaro delle Bahamas
    result.put("BSD", new CurrencyDataImpl("BSD", "BSD", 2, "BSD", "$"));
    // ngultrum bhutanese
    result.put("BTN", new CurrencyDataImpl("BTN", "BTN", 2, "BTN", "Nu."));
    // kyat birmano
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130, "BUK", "BUK"));
    // pula del Botswana
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2, "BWP", "P"));
    // nuovo rublo bielorusso (1994–1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130, "BYB", "BYB"));
    // rublo bielorusso
    result.put("BYN", new CurrencyDataImpl("BYN", "BYN", 2, "BYN", "BYN"));
    // rublo bielorusso (2000–2016)
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 128, "BYR", "BYR"));
    // dollaro del Belize
    result.put("BZD", new CurrencyDataImpl("BZD", "BZD", 2, "BZD", "$"));
    // dollaro canadese
    result.put("CAD", new CurrencyDataImpl("CAD", "CA$", 2, "C$", "$"));
    // franco congolese
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2, "CDF", "FrCD"));
    // franco svizzero
    result.put("CHF", new CurrencyDataImpl("CHF", "CHF", 2, "CHF", "CHF"));
    // unidades de fomento chilene
    result.put("CLF", new CurrencyDataImpl("CLF", "CLF", 132, "CLF", "CLF"));
    // peso cileno
    result.put("CLP", new CurrencyDataImpl("CLP", "CL$", 0, "CL$", "$"));
    // renminbi cinese
    result.put("CNY", new CurrencyDataImpl("CNY", "CN¥", 2, "RMB¥", "¥"));
    // peso colombiano
    result.put("COP", new CurrencyDataImpl("COP", "COL$", 2, "COL$", "$"));
    // colón costaricano
    result.put("CRC", new CurrencyDataImpl("CRC", "CR₡", 2, "CR₡", "₡"));
    // antico dinaro serbo
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130, "CSD", "CSD"));
    // corona forte cecoslovacca
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130, "CSK", "CSK"));
    // peso cubano convertibile
    result.put("CUC", new CurrencyDataImpl("CUC", "CUC", 2, "CUC", "$"));
    // peso cubano
    result.put("CUP", new CurrencyDataImpl("CUP", "$MN", 2, "$MN", "$"));
    // escudo capoverdiano
    result.put("CVE", new CurrencyDataImpl("CVE", "CVE", 2, "CVE", "CVE"));
    // sterlina cipriota
    result.put("CYP", new CurrencyDataImpl("CYP", "CYP", 130, "CYP", "CYP"));
    // corona ceca
    result.put("CZK", new CurrencyDataImpl("CZK", "Kč", 2, "Kč", "Kč"));
    // ostmark della Germania Orientale
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130, "DDM", "DDM"));
    // marco tedesco
    result.put("DEM", new CurrencyDataImpl("DEM", "DEM", 130, "DEM", "DEM"));
    // franco di Gibuti
    result.put("DJF", new CurrencyDataImpl("DJF", "Fdj", 0, "Fdj", "Fdj"));
    // corona danese
    result.put("DKK", new CurrencyDataImpl("DKK", "kr", 2, "kr", "kr"));
    // peso dominicano
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$", "$"));
    // dinaro algerino
    result.put("DZD", new CurrencyDataImpl("DZD", "DZD", 2, "DZD", "din"));
    // sucre dell’Ecuador
    result.put("ECS", new CurrencyDataImpl("ECS", "ECS", 130, "ECS", "ECS"));
    // unidad de valor constante (UVC) dell’Ecuador
    result.put("ECV", new CurrencyDataImpl("ECV", "ECV", 130, "ECV", "ECV"));
    // corona dell’Estonia
    result.put("EEK", new CurrencyDataImpl("EEK", "EEK", 130, "EEK", "EEK"));
    // sterlina egiziana
    result.put("EGP", new CurrencyDataImpl("EGP", "LE", 2, "LE", "E£"));
    // nakfa eritreo
    result.put("ERN", new CurrencyDataImpl("ERN", "ERN", 2, "ERN", "Nfk"));
    // peseta spagnola account
    result.put("ESA", new CurrencyDataImpl("ESA", "ESA", 130, "ESA", "ESA"));
    // peseta spagnola account convertibile
    result.put("ESB", new CurrencyDataImpl("ESB", "ESB", 130, "ESB", "ESB"));
    // peseta spagnola
    result.put("ESP", new CurrencyDataImpl("ESP", "ESP", 128, "ESP", "ESP"));
    // birr etiope
    result.put("ETB", new CurrencyDataImpl("ETB", "ETB", 2, "ETB", "Birr"));
    // euro
    result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€", "€"));
    // markka finlandese
    result.put("FIM", new CurrencyDataImpl("FIM", "FIM", 130, "FIM", "FIM"));
    // dollaro delle Figi
    result.put("FJD", new CurrencyDataImpl("FJD", "FJD", 2, "FJD", "$"));
    // sterlina delle Falkland
    result.put("FKP", new CurrencyDataImpl("FKP", "FKP", 2, "FKP", "£"));
    // franco francese
    result.put("FRF", new CurrencyDataImpl("FRF", "FRF", 130, "FRF", "FRF"));
    // sterlina britannica
    result.put("GBP", new CurrencyDataImpl("GBP", "£", 2, "GB£", "£"));
    // kupon larit georgiano
    result.put("GEK", new CurrencyDataImpl("GEK", "GEK", 130, "GEK", "GEK"));
    // lari georgiano
    result.put("GEL", new CurrencyDataImpl("GEL", "ლ", 2, "ლ", "GEL"));
    // cedi del Ghana
    result.put("GHC", new CurrencyDataImpl("GHC", "GHC", 130, "GHC", "GHC"));
    // cedi ghanese
    result.put("GHS", new CurrencyDataImpl("GHS", "GHS", 2, "GHS", "GHS"));
    // sterlina di Gibilterra
    result.put("GIP", new CurrencyDataImpl("GIP", "GIP", 2, "GIP", "£"));
    // dalasi gambiano
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2, "GMD", "GMD"));
    // franco della Guinea
    result.put("GNF", new CurrencyDataImpl("GNF", "GNF", 0, "GNF", "FG"));
    // syli della Guinea
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130, "GNS", "GNS"));
    // ekwele della Guinea Equatoriale
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130, "GQE", "GQE"));
    // dracma greca
    result.put("GRD", new CurrencyDataImpl("GRD", "GRD", 130, "GRD", "GRD"));
    // quetzal guatemalteco
    result.put("GTQ", new CurrencyDataImpl("GTQ", "GTQ", 2, "GTQ", "Q"));
    // escudo della Guinea portoghese
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130, "GWE", "GWE"));
    // peso della Guinea-Bissau
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 130, "GWP", "GWP"));
    // dollaro della Guyana
    result.put("GYD", new CurrencyDataImpl("GYD", "GYD", 2, "GYD", "$"));
    // dollaro di Hong Kong
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$", "$"));
    // lempira honduregna
    result.put("HNL", new CurrencyDataImpl("HNL", "L", 2, "L", "L"));
    // dinaro croato
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130, "HRD", "HRD"));
    // kuna croata
    result.put("HRK", new CurrencyDataImpl("HRK", "HRK", 2, "HRK", "kn"));
    // gourde haitiano
    result.put("HTG", new CurrencyDataImpl("HTG", "HTG", 2, "HTG", "HTG"));
    // fiorino ungherese
    result.put("HUF", new CurrencyDataImpl("HUF", "HUF", 2, "HUF", "Ft"));
    // rupia indonesiana
    result.put("IDR", new CurrencyDataImpl("IDR", "IDR", 2, "IDR", "Rp"));
    // sterlina irlandese
    result.put("IEP", new CurrencyDataImpl("IEP", "IEP", 130, "IEP", "IEP"));
    // sterlina israeliana
    result.put("ILP", new CurrencyDataImpl("ILP", "ILP", 130, "ILP", "ILP"));
    // nuovo siclo israeliano
    result.put("ILS", new CurrencyDataImpl("ILS", "₪", 2, "IL₪", "₪"));
    // rupia indiana
    result.put("INR", new CurrencyDataImpl("INR", "₹", 2, "Rs", "₹"));
    // dinaro iracheno
    result.put("IQD", new CurrencyDataImpl("IQD", "IQD", 0, "IQD", "din"));
    // rial iraniano
    result.put("IRR", new CurrencyDataImpl("IRR", "IRR", 0, "IRR", "Rial"));
    // corona islandese
    result.put("ISK", new CurrencyDataImpl("ISK", "kr", 0, "kr", "kr"));
    // lira italiana
    result.put("ITL", new CurrencyDataImpl("ITL", "ITL", 128, "ITL", "ITL"));
    // dollaro giamaicano
    result.put("JMD", new CurrencyDataImpl("JMD", "JA$", 2, "JA$", "$"));
    // dinaro giordano
    result.put("JOD", new CurrencyDataImpl("JOD", "JOD", 3, "JOD", "din"));
    // yen giapponese
    result.put("JPY", new CurrencyDataImpl("JPY", "JP¥", 0, "JP¥", "¥"));
    // scellino keniota
    result.put("KES", new CurrencyDataImpl("KES", "Ksh", 2, "Ksh", "Ksh"));
    // som kirghiso
    result.put("KGS", new CurrencyDataImpl("KGS", "KGS", 2, "KGS", "KGS"));
    // riel cambogiano
    result.put("KHR", new CurrencyDataImpl("KHR", "KHR", 2, "KHR", "Riel"));
    // franco comoriano
    result.put("KMF", new CurrencyDataImpl("KMF", "KMF", 0, "KMF", "CF"));
    // won nordcoreano
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 0, "KPW", "₩"));
    // won sudcoreano
    result.put("KRW", new CurrencyDataImpl("KRW", "KR₩", 0, "KR₩", "₩"));
    // dinaro kuwaitiano
    result.put("KWD", new CurrencyDataImpl("KWD", "KWD", 3, "KWD", "din"));
    // dollaro delle Isole Cayman
    result.put("KYD", new CurrencyDataImpl("KYD", "KYD", 2, "KYD", "$"));
    // tenge kazako
    result.put("KZT", new CurrencyDataImpl("KZT", "KZT", 2, "KZT", "₸"));
    // kip laotiano
    result.put("LAK", new CurrencyDataImpl("LAK", "LAK", 0, "LAK", "₭"));
    // lira libanese
    result.put("LBP", new CurrencyDataImpl("LBP", "LBP", 0, "LBP", "L£"));
    // rupia di Sri Lanka
    result.put("LKR", new CurrencyDataImpl("LKR", "SLRs", 2, "SLRs", "Rs"));
    // dollaro liberiano
    result.put("LRD", new CurrencyDataImpl("LRD", "LRD", 2, "LRD", "$"));
    // loti del Lesotho
    result.put("LSL", new CurrencyDataImpl("LSL", "LSL", 2, "LSL", "LSL"));
    // litas lituano
    result.put("LTL", new CurrencyDataImpl("LTL", "LTL", 130, "LTL", "Lt"));
    // talonas lituani
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130, "LTT", "LTT"));
    // franco convertibile del Lussemburgo
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 130, "LUC", "LUC"));
    // franco del Lussemburgo
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128, "LUF", "LUF"));
    // franco finanziario del Lussemburgo
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 130, "LUL", "LUL"));
    // lats lettone
    result.put("LVL", new CurrencyDataImpl("LVL", "LVL", 130, "LVL", "Ls"));
    // rublo lettone
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130, "LVR", "LVR"));
    // dinaro libico
    result.put("LYD", new CurrencyDataImpl("LYD", "LYD", 3, "LYD", "din"));
    // dirham marocchino
    result.put("MAD", new CurrencyDataImpl("MAD", "MAD", 2, "MAD", "MAD"));
    // franco marocchino
    result.put("MAF", new CurrencyDataImpl("MAF", "MAF", 130, "MAF", "MAF"));
    // leu moldavo
    result.put("MDL", new CurrencyDataImpl("MDL", "MDL", 2, "MDL", "MDL"));
    // ariary malgascio
    result.put("MGA", new CurrencyDataImpl("MGA", "MGA", 0, "MGA", "Ar"));
    // franco malgascio
    result.put("MGF", new CurrencyDataImpl("MGF", "MGF", 128, "MGF", "MGF"));
    // denar macedone
    result.put("MKD", new CurrencyDataImpl("MKD", "MKD", 2, "MKD", "din"));
    // franco di Mali
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130, "MLF", "MLF"));
    // kyat di Myanmar
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 0, "MMK", "K"));
    // tugrik mongolo
    result.put("MNT", new CurrencyDataImpl("MNT", "MN₮", 2, "MN₮", "₮"));
    // pataca di Macao
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP", 2, "MOP", "MOP"));
    // ouguiya della Mauritania (1973–2017)
    result.put("MRO", new CurrencyDataImpl("MRO", "MRO", 128, "MRO", "MRO"));
    // ouguiya della Mauritania
    result.put("MRU", new CurrencyDataImpl("MRU", "MRU", 2, "MRU", "MRU"));
    // lira maltese
    result.put("MTL", new CurrencyDataImpl("MTL", "MTL", 130, "MTL", "MTL"));
    // sterlina maltese
    result.put("MTP", new CurrencyDataImpl("MTP", "MTP", 130, "MTP", "MTP"));
    // rupia mauriziana
    result.put("MUR", new CurrencyDataImpl("MUR", "MUR", 2, "MUR", "Rs"));
    // rufiyaa delle Maldive
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2, "MVR", "MVR"));
    // kwacha malawiano
    result.put("MWK", new CurrencyDataImpl("MWK", "MWK", 2, "MWK", "MWK"));
    // peso messicano
    result.put("MXN", new CurrencyDataImpl("MXN", "Mex$", 2, "Mex$", "$"));
    // peso messicano d’argento (1861–1992)
    result.put("MXP", new CurrencyDataImpl("MXP", "MXP", 130, "MXP", "MXP"));
    // unidad de inversion (UDI) messicana
    result.put("MXV", new CurrencyDataImpl("MXV", "MXV", 130, "MXV", "MXV"));
    // ringgit malese
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM", "RM"));
    // escudo del Mozambico
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130, "MZE", "MZE"));
    // metical mozambicano
    result.put("MZN", new CurrencyDataImpl("MZN", "MZN", 2, "MZN", "MTn"));
    // dollaro namibiano
    result.put("NAD", new CurrencyDataImpl("NAD", "NAD", 2, "NAD", "$"));
    // naira nigeriana
    result.put("NGN", new CurrencyDataImpl("NGN", "NGN", 2, "NGN", "₦"));
    // cordoba nicaraguense
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130, "NIC", "NIC"));
    // córdoba nicaraguense
    result.put("NIO", new CurrencyDataImpl("NIO", "NIO", 2, "NIO", "C$"));
    // fiorino olandese
    result.put("NLG", new CurrencyDataImpl("NLG", "NLG", 130, "NLG", "NLG"));
    // corona norvegese
    result.put("NOK", new CurrencyDataImpl("NOK", "NOkr", 2, "NOkr", "kr"));
    // rupia nepalese
    result.put("NPR", new CurrencyDataImpl("NPR", "NPR", 2, "NPR", "Rs"));
    // dollaro neozelandese
    result.put("NZD", new CurrencyDataImpl("NZD", "NZ$", 2, "NZ$", "$"));
    // rial omanita
    result.put("OMR", new CurrencyDataImpl("OMR", "OMR", 3, "OMR", "Rial"));
    // balboa panamense
    result.put("PAB", new CurrencyDataImpl("PAB", "B/.", 2, "B/.", "B/."));
    // inti peruviano
    result.put("PEI", new CurrencyDataImpl("PEI", "PEI", 130, "PEI", "PEI"));
    // sol peruviano
    result.put("PEN", new CurrencyDataImpl("PEN", "S/.", 2, "S/.", "S/."));
    // sol peruviano (1863–1965)
    result.put("PES", new CurrencyDataImpl("PES", "PES", 130, "PES", "PES"));
    // kina papuana
    result.put("PGK", new CurrencyDataImpl("PGK", "PGK", 2, "PGK", "PGK"));
    // peso filippino
    result.put("PHP", new CurrencyDataImpl("PHP", "PHP", 2, "PHP", "₱"));
    // rupia pakistana
    result.put("PKR", new CurrencyDataImpl("PKR", "PKRs.", 2, "PKRs.", "Rs"));
    // złoty polacco
    result.put("PLN", new CurrencyDataImpl("PLN", "PLN", 2, "PLN", "zł"));
    // złoty Polacco (1950–1995)
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130, "PLZ", "PLZ"));
    // escudo portoghese
    result.put("PTE", new CurrencyDataImpl("PTE", "PTE", 130, "PTE", "PTE"));
    // guaraní paraguayano
    result.put("PYG", new CurrencyDataImpl("PYG", "PYG", 0, "PYG", "Gs"));
    // rial qatariano
    result.put("QAR", new CurrencyDataImpl("QAR", "QAR", 2, "QAR", "Rial"));
    // dollaro della Rhodesia
    result.put("RHD", new CurrencyDataImpl("RHD", "RHD", 130, "RHD", "RHD"));
    // leu della Romania
    result.put("ROL", new CurrencyDataImpl("ROL", "ROL", 130, "ROL", "ROL"));
    // leu rumeno
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2, "RON", "RON"));
    // dinaro serbo
    result.put("RSD", new CurrencyDataImpl("RSD", "RSD", 0, "RSD", "din"));
    // rublo russo
    result.put("RUB", new CurrencyDataImpl("RUB", "руб.", 2, "руб.", "руб."));
    // rublo della CSI
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130, "RUR", "RUR"));
    // franco ruandese
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0, "RWF", "RF"));
    // riyal saudita
    result.put("SAR", new CurrencyDataImpl("SAR", "SR", 2, "SR", "Rial"));
    // dollaro delle Isole Salomone
    result.put("SBD", new CurrencyDataImpl("SBD", "SBD", 2, "SBD", "$"));
    // rupia delle Seychelles
    result.put("SCR", new CurrencyDataImpl("SCR", "SCR", 2, "SCR", "SCR"));
    // dinaro sudanese
    result.put("SDD", new CurrencyDataImpl("SDD", "SDD", 130, "SDD", "SDD"));
    // sterlina sudanese
    result.put("SDG", new CurrencyDataImpl("SDG", "SDG", 2, "SDG", "SDG"));
    // corona svedese
    result.put("SEK", new CurrencyDataImpl("SEK", "kr", 2, "kr", "kr"));
    // dollaro di Singapore
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$", "$"));
    // sterlina di Sant’Elena
    result.put("SHP", new CurrencyDataImpl("SHP", "SHP", 2, "SHP", "£"));
    // tallero sloveno
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130, "SIT", "SIT"));
    // corona slovacca
    result.put("SKK", new CurrencyDataImpl("SKK", "SKK", 130, "SKK", "SKK"));
    // leone della Sierra Leone
    result.put("SLL", new CurrencyDataImpl("SLL", "SLL", 0, "SLL", "SLL"));
    // scellino somalo
    result.put("SOS", new CurrencyDataImpl("SOS", "SOS", 0, "SOS", "SOS"));
    // dollaro del Suriname
    result.put("SRD", new CurrencyDataImpl("SRD", "SRD", 2, "SRD", "$"));
    // fiorino del Suriname
    result.put("SRG", new CurrencyDataImpl("SRG", "SRG", 130, "SRG", "SRG"));
    // sterlina sud-sudanese
    result.put("SSP", new CurrencyDataImpl("SSP", "SSP", 2, "SSP", "SSP"));
    // dobra di Sao Tomé e Principe (1977–2017)
    result.put("STD", new CurrencyDataImpl("STD", "STD", 128, "STD", "Db"));
    // dobra di Sao Tomé e Príncipe
    result.put("STN", new CurrencyDataImpl("STN", "STN", 2, "STN", "STN"));
    // rublo sovietico
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130, "SUR", "SUR"));
    // colón salvadoregno
    result.put("SVC", new CurrencyDataImpl("SVC", "SVC", 130, "SVC", "SVC"));
    // lira siriana
    result.put("SYP", new CurrencyDataImpl("SYP", "SYP", 0, "SYP", "£"));
    // lilangeni dello Swaziland
    result.put("SZL", new CurrencyDataImpl("SZL", "SZL", 2, "SZL", "SZL"));
    // baht thailandese
    result.put("THB", new CurrencyDataImpl("THB", "฿", 2, "THB", "฿"));
    // rublo del Tajikistan
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130, "TJR", "TJR"));
    // somoni tagiko
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2, "TJS", "Som"));
    // manat turkmeno (1993–2009)
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 128, "TMM", "TMM"));
    // manat turkmeno
    result.put("TMT", new CurrencyDataImpl("TMT", "TMT", 2, "TMT", "TMT"));
    // dinaro tunisino
    result.put("TND", new CurrencyDataImpl("TND", "TND", 3, "TND", "din"));
    // paʻanga tongano
    result.put("TOP", new CurrencyDataImpl("TOP", "TOP", 2, "TOP", "T$"));
    // escudo di Timor
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130, "TPE", "TPE"));
    // lira turca (1922–2005)
    result.put("TRL", new CurrencyDataImpl("TRL", "TRL", 128, "TRL", "TRL"));
    // lira turca
    result.put("TRY", new CurrencyDataImpl("TRY", "TL", 2, "YTL", "TL"));
    // dollaro di Trinidad e Tobago
    result.put("TTD", new CurrencyDataImpl("TTD", "TTD", 2, "TTD", "$"));
    // nuovo dollaro taiwanese
    result.put("TWD", new CurrencyDataImpl("TWD", "NT$", 2, "NT$", "NT$"));
    // scellino della Tanzania
    result.put("TZS", new CurrencyDataImpl("TZS", "TZS", 2, "TZS", "TSh"));
    // grivnia ucraina
    result.put("UAH", new CurrencyDataImpl("UAH", "UAH", 2, "UAH", "₴"));
    // karbovanetz ucraino
    result.put("UAK", new CurrencyDataImpl("UAK", "UAK", 130, "UAK", "UAK"));
    // scellino ugandese (1966–1987)
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130, "UGS", "UGS"));
    // scellino ugandese
    result.put("UGX", new CurrencyDataImpl("UGX", "UGX", 0, "UGX", "UGX"));
    // dollaro statunitense
    result.put("USD", new CurrencyDataImpl("USD", "US$", 2, "US$", "$"));
    // dollaro statunitense (next day)
    result.put("USN", new CurrencyDataImpl("USN", "USN", 130, "USN", "USN"));
    // dollaro statunitense (same day)
    result.put("USS", new CurrencyDataImpl("USS", "USS", 130, "USS", "USS"));
    // peso uruguaiano in unità indicizzate
    result.put("UYI", new CurrencyDataImpl("UYI", "UYI", 128, "UYI", "UYI"));
    // peso uruguaiano (1975–1993)
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130, "UYP", "UYP"));
    // peso uruguayano
    result.put("UYU", new CurrencyDataImpl("UYU", "UY$", 2, "UY$", "$"));
    // sum uzbeco
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 2, "UZS", "soʼm"));
    // bolivar venezuelano (1871–2008)
    result.put("VEB", new CurrencyDataImpl("VEB", "VEB", 130, "VEB", "VEB"));
    // bolívar venezuelano (2008–2018)
    result.put("VEF", new CurrencyDataImpl("VEF", "VEF", 130, "VEF", "Bs"));
    // bolívar venezuelano
    result.put("VES", new CurrencyDataImpl("VES", "VES", 2, "VES", "VES"));
    // dong vietnamita
    result.put("VND", new CurrencyDataImpl("VND", "₫", 24, "₫", "₫"));
    // vatu di Vanuatu
    result.put("VUV", new CurrencyDataImpl("VUV", "VUV", 0, "VUV", "VUV"));
    // tala samoano
    result.put("WST", new CurrencyDataImpl("WST", "WST", 2, "WST", "WST"));
    // franco CFA BEAC
    result.put("XAF", new CurrencyDataImpl("XAF", "FCFA", 0, "FCFA", "FCFA"));
    // argento
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 130, "XAG", "XAG"));
    // oro
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 130, "XAU", "XAU"));
    // unità composita europea
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 130, "XBA", "XBA"));
    // unità monetaria europea
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 130, "XBB", "XBB"));
    // unità di acconto europea (XBC)
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 130, "XBC", "XBC"));
    // unità di acconto europea (XBD)
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 130, "XBD", "XBD"));
    // dollaro dei Caraibi orientali
    result.put("XCD", new CurrencyDataImpl("XCD", "EC$", 2, "EC$", "$"));
    // diritti speciali di incasso
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 130, "XDR", "XDR"));
    // franco oro francese
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 130, "XFO", "XFO"));
    // franco UIC francese
    result.put("XFU", new CurrencyDataImpl("XFU", "XFU", 130, "XFU", "XFU"));
    // franco CFA BCEAO
    result.put("XOF", new CurrencyDataImpl("XOF", "CFA", 0, "CFA", "CFA"));
    // palladio
    result.put("XPD", new CurrencyDataImpl("XPD", "XPD", 130, "XPD", "XPD"));
    // franco CFP
    result.put("XPF", new CurrencyDataImpl("XPF", "CFPF", 0, "CFPF", "FCFP"));
    // platino
    result.put("XPT", new CurrencyDataImpl("XPT", "XPT", 130, "XPT", "XPT"));
    // fondi RINET
    result.put("XRE", new CurrencyDataImpl("XRE", "XRE", 130, "XRE", "XRE"));
    // codice di verifica della valuta
    result.put("XTS", new CurrencyDataImpl("XTS", "XTS", 130, "XTS", "XTS"));
    // valuta sconosciuta
    result.put("XXX", new CurrencyDataImpl("XXX", "¤", 130, "¤", "¤"));
    // dinaro dello Yemen
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130, "YDD", "YDD"));
    // riyal yemenita
    result.put("YER", new CurrencyDataImpl("YER", "YER", 0, "YER", "Rial"));
    // dinaro forte yugoslavo
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130, "YUD", "YUD"));
    // dinaro noviy yugoslavo
    result.put("YUM", new CurrencyDataImpl("YUM", "YUM", 130, "YUM", "YUM"));
    // dinaro convertibile yugoslavo
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130, "YUN", "YUN"));
    // rand sudafricano (finanziario)
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 130, "ZAL", "ZAL"));
    // rand sudafricano
    result.put("ZAR", new CurrencyDataImpl("ZAR", "ZAR", 2, "ZAR", "R"));
    // kwacha dello Zambia (1968–2012)
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZMK", 128, "ZMK", "ZWK"));
    // kwacha dello Zambia
    result.put("ZMW", new CurrencyDataImpl("ZMW", "ZMW", 2, "ZMW", "ZMW"));
    // nuovo zaire dello Zaire
    result.put("ZRN", new CurrencyDataImpl("ZRN", "ZRN", 130, "ZRN", "ZRN"));
    // zaire dello Zaire
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"));
    // dollaro dello Zimbabwe
    result.put("ZWD", new CurrencyDataImpl("ZWD", "ZWD", 128, "ZWD", "ZWD"));
    // dollaro zimbabwiano (2009)
    result.put("ZWL", new CurrencyDataImpl("ZWL", "ZWL", 130, "ZWL", "ZWL"));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // peseta andorrana
      "ADP": [ "ADP", "ADP", 128, "ADP", "ADP"],
      // dirham degli Emirati Arabi Uniti
      "AED": [ "AED", "DH", 2, "DH", "dh"],
      // afgani (1927–2002)
      "AFA": [ "AFA", "AFA", 130, "AFA", "AFA"],
      // afghani
      "AFN": [ "AFN", "AFN", 0, "AFN", "Af."],
      // lek albanese
      "ALL": [ "ALL", "ALL", 0, "ALL", "Lek"],
      // dram armeno
      "AMD": [ "AMD", "AMD", 2, "AMD", "Dram"],
      // fiorino delle Antille olandesi
      "ANG": [ "ANG", "ANG", 2, "ANG", "ANG"],
      // kwanza angolano
      "AOA": [ "AOA", "AOA", 2, "AOA", "Kz"],
      // kwanza angolano (1977–1990)
      "AOK": [ "AOK", "AOK", 130, "AOK", "AOK"],
      // nuovo kwanza angolano (1990–2000)
      "AON": [ "AON", "AON", 130, "AON", "AON"],
      // kwanza reajustado angolano (1995–1999)
      "AOR": [ "AOR", "AOR", 130, "AOR", "AOR"],
      // austral argentino
      "ARA": [ "ARA", "ARA", 130, "ARA", "ARA"],
      // peso argentino (vecchio Cod.)
      "ARP": [ "ARP", "ARP", 130, "ARP", "ARP"],
      // peso argentino
      "ARS": [ "ARS", "AR$", 2, "AR$", "$"],
      // scellino austriaco
      "ATS": [ "ATS", "ATS", 130, "ATS", "ATS"],
      // dollaro australiano
      "AUD": [ "AUD", "A$", 2, "AU$", "$"],
      // fiorino di Aruba
      "AWG": [ "AWG", "AWG", 2, "AWG", "Afl."],
      // manat azero (1993–2006)
      "AZM": [ "AZM", "AZM", 130, "AZM", "AZM"],
      // manat azero
      "AZN": [ "AZN", "AZN", 2, "AZN", "man."],
      // dinar Bosnia-Herzegovina
      "BAD": [ "BAD", "BAD", 130, "BAD", "BAD"],
      // marco convertibile della Bosnia-Herzegovina
      "BAM": [ "BAM", "BAM", 2, "BAM", "KM"],
      // dollaro di Barbados
      "BBD": [ "BBD", "BBD", 2, "BBD", "$"],
      // taka bangladese
      "BDT": [ "BDT", "Tk", 2, "Tk", "৳"],
      // franco belga (convertibile)
      "BEC": [ "BEC", "BEC", 130, "BEC", "BEC"],
      // franco belga
      "BEF": [ "BEF", "BEF", 130, "BEF", "BEF"],
      // franco belga (finanziario)
      "BEL": [ "BEL", "BEL", 130, "BEL", "BEL"],
      // lev bulgaro (1962–1999)
      "BGL": [ "BGL", "BGL", 130, "BGL", "BGL"],
      // lev bulgaro
      "BGN": [ "BGN", "BGN", 2, "BGN", "lev"],
      // dinaro del Bahrein
      "BHD": [ "BHD", "BHD", 3, "BHD", "din"],
      // franco del Burundi
      "BIF": [ "BIF", "BIF", 0, "BIF", "FBu"],
      // dollaro delle Bermuda
      "BMD": [ "BMD", "BMD", 2, "BMD", "$"],
      // dollaro del Brunei
      "BND": [ "BND", "BND", 2, "BND", "$"],
      // boliviano
      "BOB": [ "BOB", "BOB", 2, "BOB", "Bs"],
      // peso boliviano
      "BOP": [ "BOP", "BOP", 130, "BOP", "BOP"],
      // mvdol boliviano
      "BOV": [ "BOV", "BOV", 130, "BOV", "BOV"],
      // cruzeiro novo brasiliano (1967–1986)
      "BRB": [ "BRB", "BRB", 130, "BRB", "BRB"],
      // cruzado brasiliano
      "BRC": [ "BRC", "BRC", 130, "BRC", "BRC"],
      // cruzeiro brasiliano (1990–1993)
      "BRE": [ "BRE", "BRE", 130, "BRE", "BRE"],
      // real brasiliano
      "BRL": [ "BRL", "R$", 2, "R$", "R$"],
      // cruzado novo brasiliano
      "BRN": [ "BRN", "BRN", 130, "BRN", "BRN"],
      // cruzeiro brasiliano
      "BRR": [ "BRR", "BRR", 130, "BRR", "BRR"],
      // dollaro delle Bahamas
      "BSD": [ "BSD", "BSD", 2, "BSD", "$"],
      // ngultrum bhutanese
      "BTN": [ "BTN", "BTN", 2, "BTN", "Nu."],
      // kyat birmano
      "BUK": [ "BUK", "BUK", 130, "BUK", "BUK"],
      // pula del Botswana
      "BWP": [ "BWP", "BWP", 2, "BWP", "P"],
      // nuovo rublo bielorusso (1994–1999)
      "BYB": [ "BYB", "BYB", 130, "BYB", "BYB"],
      // rublo bielorusso
      "BYN": [ "BYN", "BYN", 2, "BYN", "BYN"],
      // rublo bielorusso (2000–2016)
      "BYR": [ "BYR", "BYR", 128, "BYR", "BYR"],
      // dollaro del Belize
      "BZD": [ "BZD", "BZD", 2, "BZD", "$"],
      // dollaro canadese
      "CAD": [ "CAD", "CA$", 2, "C$", "$"],
      // franco congolese
      "CDF": [ "CDF", "CDF", 2, "CDF", "FrCD"],
      // franco svizzero
      "CHF": [ "CHF", "CHF", 2, "CHF", "CHF"],
      // unidades de fomento chilene
      "CLF": [ "CLF", "CLF", 132, "CLF", "CLF"],
      // peso cileno
      "CLP": [ "CLP", "CL$", 0, "CL$", "$"],
      // renminbi cinese
      "CNY": [ "CNY", "CN¥", 2, "RMB¥", "¥"],
      // peso colombiano
      "COP": [ "COP", "COL$", 2, "COL$", "$"],
      // colón costaricano
      "CRC": [ "CRC", "CR₡", 2, "CR₡", "₡"],
      // antico dinaro serbo
      "CSD": [ "CSD", "CSD", 130, "CSD", "CSD"],
      // corona forte cecoslovacca
      "CSK": [ "CSK", "CSK", 130, "CSK", "CSK"],
      // peso cubano convertibile
      "CUC": [ "CUC", "CUC", 2, "CUC", "$"],
      // peso cubano
      "CUP": [ "CUP", "$MN", 2, "$MN", "$"],
      // escudo capoverdiano
      "CVE": [ "CVE", "CVE", 2, "CVE", "CVE"],
      // sterlina cipriota
      "CYP": [ "CYP", "CYP", 130, "CYP", "CYP"],
      // corona ceca
      "CZK": [ "CZK", "Kč", 2, "Kč", "Kč"],
      // ostmark della Germania Orientale
      "DDM": [ "DDM", "DDM", 130, "DDM", "DDM"],
      // marco tedesco
      "DEM": [ "DEM", "DEM", 130, "DEM", "DEM"],
      // franco di Gibuti
      "DJF": [ "DJF", "Fdj", 0, "Fdj", "Fdj"],
      // corona danese
      "DKK": [ "DKK", "kr", 2, "kr", "kr"],
      // peso dominicano
      "DOP": [ "DOP", "RD$", 2, "RD$", "$"],
      // dinaro algerino
      "DZD": [ "DZD", "DZD", 2, "DZD", "din"],
      // sucre dell’Ecuador
      "ECS": [ "ECS", "ECS", 130, "ECS", "ECS"],
      // unidad de valor constante (UVC) dell’Ecuador
      "ECV": [ "ECV", "ECV", 130, "ECV", "ECV"],
      // corona dell’Estonia
      "EEK": [ "EEK", "EEK", 130, "EEK", "EEK"],
      // sterlina egiziana
      "EGP": [ "EGP", "LE", 2, "LE", "E£"],
      // nakfa eritreo
      "ERN": [ "ERN", "ERN", 2, "ERN", "Nfk"],
      // peseta spagnola account
      "ESA": [ "ESA", "ESA", 130, "ESA", "ESA"],
      // peseta spagnola account convertibile
      "ESB": [ "ESB", "ESB", 130, "ESB", "ESB"],
      // peseta spagnola
      "ESP": [ "ESP", "ESP", 128, "ESP", "ESP"],
      // birr etiope
      "ETB": [ "ETB", "ETB", 2, "ETB", "Birr"],
      // euro
      "EUR": [ "EUR", "€", 2, "€", "€"],
      // markka finlandese
      "FIM": [ "FIM", "FIM", 130, "FIM", "FIM"],
      // dollaro delle Figi
      "FJD": [ "FJD", "FJD", 2, "FJD", "$"],
      // sterlina delle Falkland
      "FKP": [ "FKP", "FKP", 2, "FKP", "£"],
      // franco francese
      "FRF": [ "FRF", "FRF", 130, "FRF", "FRF"],
      // sterlina britannica
      "GBP": [ "GBP", "£", 2, "GB£", "£"],
      // kupon larit georgiano
      "GEK": [ "GEK", "GEK", 130, "GEK", "GEK"],
      // lari georgiano
      "GEL": [ "GEL", "ლ", 2, "ლ", "GEL"],
      // cedi del Ghana
      "GHC": [ "GHC", "GHC", 130, "GHC", "GHC"],
      // cedi ghanese
      "GHS": [ "GHS", "GHS", 2, "GHS", "GHS"],
      // sterlina di Gibilterra
      "GIP": [ "GIP", "GIP", 2, "GIP", "£"],
      // dalasi gambiano
      "GMD": [ "GMD", "GMD", 2, "GMD", "GMD"],
      // franco della Guinea
      "GNF": [ "GNF", "GNF", 0, "GNF", "FG"],
      // syli della Guinea
      "GNS": [ "GNS", "GNS", 130, "GNS", "GNS"],
      // ekwele della Guinea Equatoriale
      "GQE": [ "GQE", "GQE", 130, "GQE", "GQE"],
      // dracma greca
      "GRD": [ "GRD", "GRD", 130, "GRD", "GRD"],
      // quetzal guatemalteco
      "GTQ": [ "GTQ", "GTQ", 2, "GTQ", "Q"],
      // escudo della Guinea portoghese
      "GWE": [ "GWE", "GWE", 130, "GWE", "GWE"],
      // peso della Guinea-Bissau
      "GWP": [ "GWP", "GWP", 130, "GWP", "GWP"],
      // dollaro della Guyana
      "GYD": [ "GYD", "GYD", 2, "GYD", "$"],
      // dollaro di Hong Kong
      "HKD": [ "HKD", "HK$", 2, "HK$", "$"],
      // lempira honduregna
      "HNL": [ "HNL", "L", 2, "L", "L"],
      // dinaro croato
      "HRD": [ "HRD", "HRD", 130, "HRD", "HRD"],
      // kuna croata
      "HRK": [ "HRK", "HRK", 2, "HRK", "kn"],
      // gourde haitiano
      "HTG": [ "HTG", "HTG", 2, "HTG", "HTG"],
      // fiorino ungherese
      "HUF": [ "HUF", "HUF", 2, "HUF", "Ft"],
      // rupia indonesiana
      "IDR": [ "IDR", "IDR", 2, "IDR", "Rp"],
      // sterlina irlandese
      "IEP": [ "IEP", "IEP", 130, "IEP", "IEP"],
      // sterlina israeliana
      "ILP": [ "ILP", "ILP", 130, "ILP", "ILP"],
      // nuovo siclo israeliano
      "ILS": [ "ILS", "₪", 2, "IL₪", "₪"],
      // rupia indiana
      "INR": [ "INR", "₹", 2, "Rs", "₹"],
      // dinaro iracheno
      "IQD": [ "IQD", "IQD", 0, "IQD", "din"],
      // rial iraniano
      "IRR": [ "IRR", "IRR", 0, "IRR", "Rial"],
      // corona islandese
      "ISK": [ "ISK", "kr", 0, "kr", "kr"],
      // lira italiana
      "ITL": [ "ITL", "ITL", 128, "ITL", "ITL"],
      // dollaro giamaicano
      "JMD": [ "JMD", "JA$", 2, "JA$", "$"],
      // dinaro giordano
      "JOD": [ "JOD", "JOD", 3, "JOD", "din"],
      // yen giapponese
      "JPY": [ "JPY", "JP¥", 0, "JP¥", "¥"],
      // scellino keniota
      "KES": [ "KES", "Ksh", 2, "Ksh", "Ksh"],
      // som kirghiso
      "KGS": [ "KGS", "KGS", 2, "KGS", "KGS"],
      // riel cambogiano
      "KHR": [ "KHR", "KHR", 2, "KHR", "Riel"],
      // franco comoriano
      "KMF": [ "KMF", "KMF", 0, "KMF", "CF"],
      // won nordcoreano
      "KPW": [ "KPW", "KPW", 0, "KPW", "₩"],
      // won sudcoreano
      "KRW": [ "KRW", "KR₩", 0, "KR₩", "₩"],
      // dinaro kuwaitiano
      "KWD": [ "KWD", "KWD", 3, "KWD", "din"],
      // dollaro delle Isole Cayman
      "KYD": [ "KYD", "KYD", 2, "KYD", "$"],
      // tenge kazako
      "KZT": [ "KZT", "KZT", 2, "KZT", "₸"],
      // kip laotiano
      "LAK": [ "LAK", "LAK", 0, "LAK", "₭"],
      // lira libanese
      "LBP": [ "LBP", "LBP", 0, "LBP", "L£"],
      // rupia di Sri Lanka
      "LKR": [ "LKR", "SLRs", 2, "SLRs", "Rs"],
      // dollaro liberiano
      "LRD": [ "LRD", "LRD", 2, "LRD", "$"],
      // loti del Lesotho
      "LSL": [ "LSL", "LSL", 2, "LSL", "LSL"],
      // litas lituano
      "LTL": [ "LTL", "LTL", 130, "LTL", "Lt"],
      // talonas lituani
      "LTT": [ "LTT", "LTT", 130, "LTT", "LTT"],
      // franco convertibile del Lussemburgo
      "LUC": [ "LUC", "LUC", 130, "LUC", "LUC"],
      // franco del Lussemburgo
      "LUF": [ "LUF", "LUF", 128, "LUF", "LUF"],
      // franco finanziario del Lussemburgo
      "LUL": [ "LUL", "LUL", 130, "LUL", "LUL"],
      // lats lettone
      "LVL": [ "LVL", "LVL", 130, "LVL", "Ls"],
      // rublo lettone
      "LVR": [ "LVR", "LVR", 130, "LVR", "LVR"],
      // dinaro libico
      "LYD": [ "LYD", "LYD", 3, "LYD", "din"],
      // dirham marocchino
      "MAD": [ "MAD", "MAD", 2, "MAD", "MAD"],
      // franco marocchino
      "MAF": [ "MAF", "MAF", 130, "MAF", "MAF"],
      // leu moldavo
      "MDL": [ "MDL", "MDL", 2, "MDL", "MDL"],
      // ariary malgascio
      "MGA": [ "MGA", "MGA", 0, "MGA", "Ar"],
      // franco malgascio
      "MGF": [ "MGF", "MGF", 128, "MGF", "MGF"],
      // denar macedone
      "MKD": [ "MKD", "MKD", 2, "MKD", "din"],
      // franco di Mali
      "MLF": [ "MLF", "MLF", 130, "MLF", "MLF"],
      // kyat di Myanmar
      "MMK": [ "MMK", "MMK", 0, "MMK", "K"],
      // tugrik mongolo
      "MNT": [ "MNT", "MN₮", 2, "MN₮", "₮"],
      // pataca di Macao
      "MOP": [ "MOP", "MOP", 2, "MOP", "MOP"],
      // ouguiya della Mauritania (1973–2017)
      "MRO": [ "MRO", "MRO", 128, "MRO", "MRO"],
      // ouguiya della Mauritania
      "MRU": [ "MRU", "MRU", 2, "MRU", "MRU"],
      // lira maltese
      "MTL": [ "MTL", "MTL", 130, "MTL", "MTL"],
      // sterlina maltese
      "MTP": [ "MTP", "MTP", 130, "MTP", "MTP"],
      // rupia mauriziana
      "MUR": [ "MUR", "MUR", 2, "MUR", "Rs"],
      // rufiyaa delle Maldive
      "MVR": [ "MVR", "MVR", 2, "MVR", "MVR"],
      // kwacha malawiano
      "MWK": [ "MWK", "MWK", 2, "MWK", "MWK"],
      // peso messicano
      "MXN": [ "MXN", "Mex$", 2, "Mex$", "$"],
      // peso messicano d’argento (1861–1992)
      "MXP": [ "MXP", "MXP", 130, "MXP", "MXP"],
      // unidad de inversion (UDI) messicana
      "MXV": [ "MXV", "MXV", 130, "MXV", "MXV"],
      // ringgit malese
      "MYR": [ "MYR", "RM", 2, "RM", "RM"],
      // escudo del Mozambico
      "MZE": [ "MZE", "MZE", 130, "MZE", "MZE"],
      // metical mozambicano
      "MZN": [ "MZN", "MZN", 2, "MZN", "MTn"],
      // dollaro namibiano
      "NAD": [ "NAD", "NAD", 2, "NAD", "$"],
      // naira nigeriana
      "NGN": [ "NGN", "NGN", 2, "NGN", "₦"],
      // cordoba nicaraguense
      "NIC": [ "NIC", "NIC", 130, "NIC", "NIC"],
      // córdoba nicaraguense
      "NIO": [ "NIO", "NIO", 2, "NIO", "C$"],
      // fiorino olandese
      "NLG": [ "NLG", "NLG", 130, "NLG", "NLG"],
      // corona norvegese
      "NOK": [ "NOK", "NOkr", 2, "NOkr", "kr"],
      // rupia nepalese
      "NPR": [ "NPR", "NPR", 2, "NPR", "Rs"],
      // dollaro neozelandese
      "NZD": [ "NZD", "NZ$", 2, "NZ$", "$"],
      // rial omanita
      "OMR": [ "OMR", "OMR", 3, "OMR", "Rial"],
      // balboa panamense
      "PAB": [ "PAB", "B/.", 2, "B/.", "B/."],
      // inti peruviano
      "PEI": [ "PEI", "PEI", 130, "PEI", "PEI"],
      // sol peruviano
      "PEN": [ "PEN", "S/.", 2, "S/.", "S/."],
      // sol peruviano (1863–1965)
      "PES": [ "PES", "PES", 130, "PES", "PES"],
      // kina papuana
      "PGK": [ "PGK", "PGK", 2, "PGK", "PGK"],
      // peso filippino
      "PHP": [ "PHP", "PHP", 2, "PHP", "₱"],
      // rupia pakistana
      "PKR": [ "PKR", "PKRs.", 2, "PKRs.", "Rs"],
      // złoty polacco
      "PLN": [ "PLN", "PLN", 2, "PLN", "zł"],
      // złoty Polacco (1950–1995)
      "PLZ": [ "PLZ", "PLZ", 130, "PLZ", "PLZ"],
      // escudo portoghese
      "PTE": [ "PTE", "PTE", 130, "PTE", "PTE"],
      // guaraní paraguayano
      "PYG": [ "PYG", "PYG", 0, "PYG", "Gs"],
      // rial qatariano
      "QAR": [ "QAR", "QAR", 2, "QAR", "Rial"],
      // dollaro della Rhodesia
      "RHD": [ "RHD", "RHD", 130, "RHD", "RHD"],
      // leu della Romania
      "ROL": [ "ROL", "ROL", 130, "ROL", "ROL"],
      // leu rumeno
      "RON": [ "RON", "RON", 2, "RON", "RON"],
      // dinaro serbo
      "RSD": [ "RSD", "RSD", 0, "RSD", "din"],
      // rublo russo
      "RUB": [ "RUB", "руб.", 2, "руб.", "руб."],
      // rublo della CSI
      "RUR": [ "RUR", "RUR", 130, "RUR", "RUR"],
      // franco ruandese
      "RWF": [ "RWF", "RWF", 0, "RWF", "RF"],
      // riyal saudita
      "SAR": [ "SAR", "SR", 2, "SR", "Rial"],
      // dollaro delle Isole Salomone
      "SBD": [ "SBD", "SBD", 2, "SBD", "$"],
      // rupia delle Seychelles
      "SCR": [ "SCR", "SCR", 2, "SCR", "SCR"],
      // dinaro sudanese
      "SDD": [ "SDD", "SDD", 130, "SDD", "SDD"],
      // sterlina sudanese
      "SDG": [ "SDG", "SDG", 2, "SDG", "SDG"],
      // corona svedese
      "SEK": [ "SEK", "kr", 2, "kr", "kr"],
      // dollaro di Singapore
      "SGD": [ "SGD", "S$", 2, "S$", "$"],
      // sterlina di Sant’Elena
      "SHP": [ "SHP", "SHP", 2, "SHP", "£"],
      // tallero sloveno
      "SIT": [ "SIT", "SIT", 130, "SIT", "SIT"],
      // corona slovacca
      "SKK": [ "SKK", "SKK", 130, "SKK", "SKK"],
      // leone della Sierra Leone
      "SLL": [ "SLL", "SLL", 0, "SLL", "SLL"],
      // scellino somalo
      "SOS": [ "SOS", "SOS", 0, "SOS", "SOS"],
      // dollaro del Suriname
      "SRD": [ "SRD", "SRD", 2, "SRD", "$"],
      // fiorino del Suriname
      "SRG": [ "SRG", "SRG", 130, "SRG", "SRG"],
      // sterlina sud-sudanese
      "SSP": [ "SSP", "SSP", 2, "SSP", "SSP"],
      // dobra di Sao Tomé e Principe (1977–2017)
      "STD": [ "STD", "STD", 128, "STD", "Db"],
      // dobra di Sao Tomé e Príncipe
      "STN": [ "STN", "STN", 2, "STN", "STN"],
      // rublo sovietico
      "SUR": [ "SUR", "SUR", 130, "SUR", "SUR"],
      // colón salvadoregno
      "SVC": [ "SVC", "SVC", 130, "SVC", "SVC"],
      // lira siriana
      "SYP": [ "SYP", "SYP", 0, "SYP", "£"],
      // lilangeni dello Swaziland
      "SZL": [ "SZL", "SZL", 2, "SZL", "SZL"],
      // baht thailandese
      "THB": [ "THB", "฿", 2, "THB", "฿"],
      // rublo del Tajikistan
      "TJR": [ "TJR", "TJR", 130, "TJR", "TJR"],
      // somoni tagiko
      "TJS": [ "TJS", "TJS", 2, "TJS", "Som"],
      // manat turkmeno (1993–2009)
      "TMM": [ "TMM", "TMM", 128, "TMM", "TMM"],
      // manat turkmeno
      "TMT": [ "TMT", "TMT", 2, "TMT", "TMT"],
      // dinaro tunisino
      "TND": [ "TND", "TND", 3, "TND", "din"],
      // paʻanga tongano
      "TOP": [ "TOP", "TOP", 2, "TOP", "T$"],
      // escudo di Timor
      "TPE": [ "TPE", "TPE", 130, "TPE", "TPE"],
      // lira turca (1922–2005)
      "TRL": [ "TRL", "TRL", 128, "TRL", "TRL"],
      // lira turca
      "TRY": [ "TRY", "TL", 2, "YTL", "TL"],
      // dollaro di Trinidad e Tobago
      "TTD": [ "TTD", "TTD", 2, "TTD", "$"],
      // nuovo dollaro taiwanese
      "TWD": [ "TWD", "NT$", 2, "NT$", "NT$"],
      // scellino della Tanzania
      "TZS": [ "TZS", "TZS", 2, "TZS", "TSh"],
      // grivnia ucraina
      "UAH": [ "UAH", "UAH", 2, "UAH", "₴"],
      // karbovanetz ucraino
      "UAK": [ "UAK", "UAK", 130, "UAK", "UAK"],
      // scellino ugandese (1966–1987)
      "UGS": [ "UGS", "UGS", 130, "UGS", "UGS"],
      // scellino ugandese
      "UGX": [ "UGX", "UGX", 0, "UGX", "UGX"],
      // dollaro statunitense
      "USD": [ "USD", "US$", 2, "US$", "$"],
      // dollaro statunitense (next day)
      "USN": [ "USN", "USN", 130, "USN", "USN"],
      // dollaro statunitense (same day)
      "USS": [ "USS", "USS", 130, "USS", "USS"],
      // peso uruguaiano in unità indicizzate
      "UYI": [ "UYI", "UYI", 128, "UYI", "UYI"],
      // peso uruguaiano (1975–1993)
      "UYP": [ "UYP", "UYP", 130, "UYP", "UYP"],
      // peso uruguayano
      "UYU": [ "UYU", "UY$", 2, "UY$", "$"],
      // sum uzbeco
      "UZS": [ "UZS", "UZS", 2, "UZS", "soʼm"],
      // bolivar venezuelano (1871–2008)
      "VEB": [ "VEB", "VEB", 130, "VEB", "VEB"],
      // bolívar venezuelano (2008–2018)
      "VEF": [ "VEF", "VEF", 130, "VEF", "Bs"],
      // bolívar venezuelano
      "VES": [ "VES", "VES", 2, "VES", "VES"],
      // dong vietnamita
      "VND": [ "VND", "₫", 24, "₫", "₫"],
      // vatu di Vanuatu
      "VUV": [ "VUV", "VUV", 0, "VUV", "VUV"],
      // tala samoano
      "WST": [ "WST", "WST", 2, "WST", "WST"],
      // franco CFA BEAC
      "XAF": [ "XAF", "FCFA", 0, "FCFA", "FCFA"],
      // argento
      "XAG": [ "XAG", "XAG", 130, "XAG", "XAG"],
      // oro
      "XAU": [ "XAU", "XAU", 130, "XAU", "XAU"],
      // unità composita europea
      "XBA": [ "XBA", "XBA", 130, "XBA", "XBA"],
      // unità monetaria europea
      "XBB": [ "XBB", "XBB", 130, "XBB", "XBB"],
      // unità di acconto europea (XBC)
      "XBC": [ "XBC", "XBC", 130, "XBC", "XBC"],
      // unità di acconto europea (XBD)
      "XBD": [ "XBD", "XBD", 130, "XBD", "XBD"],
      // dollaro dei Caraibi orientali
      "XCD": [ "XCD", "EC$", 2, "EC$", "$"],
      // diritti speciali di incasso
      "XDR": [ "XDR", "XDR", 130, "XDR", "XDR"],
      // franco oro francese
      "XFO": [ "XFO", "XFO", 130, "XFO", "XFO"],
      // franco UIC francese
      "XFU": [ "XFU", "XFU", 130, "XFU", "XFU"],
      // franco CFA BCEAO
      "XOF": [ "XOF", "CFA", 0, "CFA", "CFA"],
      // palladio
      "XPD": [ "XPD", "XPD", 130, "XPD", "XPD"],
      // franco CFP
      "XPF": [ "XPF", "CFPF", 0, "CFPF", "FCFP"],
      // platino
      "XPT": [ "XPT", "XPT", 130, "XPT", "XPT"],
      // fondi RINET
      "XRE": [ "XRE", "XRE", 130, "XRE", "XRE"],
      // codice di verifica della valuta
      "XTS": [ "XTS", "XTS", 130, "XTS", "XTS"],
      // valuta sconosciuta
      "XXX": [ "XXX", "¤", 130, "¤", "¤"],
      // dinaro dello Yemen
      "YDD": [ "YDD", "YDD", 130, "YDD", "YDD"],
      // riyal yemenita
      "YER": [ "YER", "YER", 0, "YER", "Rial"],
      // dinaro forte yugoslavo
      "YUD": [ "YUD", "YUD", 130, "YUD", "YUD"],
      // dinaro noviy yugoslavo
      "YUM": [ "YUM", "YUM", 130, "YUM", "YUM"],
      // dinaro convertibile yugoslavo
      "YUN": [ "YUN", "YUN", 130, "YUN", "YUN"],
      // rand sudafricano (finanziario)
      "ZAL": [ "ZAL", "ZAL", 130, "ZAL", "ZAL"],
      // rand sudafricano
      "ZAR": [ "ZAR", "ZAR", 2, "ZAR", "R"],
      // kwacha dello Zambia (1968–2012)
      "ZMK": [ "ZMK", "ZMK", 128, "ZMK", "ZWK"],
      // kwacha dello Zambia
      "ZMW": [ "ZMW", "ZMW", 2, "ZMW", "ZMW"],
      // nuovo zaire dello Zaire
      "ZRN": [ "ZRN", "ZRN", 130, "ZRN", "ZRN"],
      // zaire dello Zaire
      "ZRZ": [ "ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"],
      // dollaro dello Zimbabwe
      "ZWD": [ "ZWD", "ZWD", 128, "ZWD", "ZWD"],
      // dollaro zimbabwiano (2009)
      "ZWL": [ "ZWL", "ZWL", 130, "ZWL", "ZWL"],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("ADP", "peseta andorrana");
    result.put("AED", "dirham degli Emirati Arabi Uniti");
    result.put("AFA", "afgani (1927–2002)");
    result.put("AFN", "afghani");
    result.put("ALL", "lek albanese");
    result.put("AMD", "dram armeno");
    result.put("ANG", "fiorino delle Antille olandesi");
    result.put("AOA", "kwanza angolano");
    result.put("AOK", "kwanza angolano (1977–1990)");
    result.put("AON", "nuovo kwanza angolano (1990–2000)");
    result.put("AOR", "kwanza reajustado angolano (1995–1999)");
    result.put("ARA", "austral argentino");
    result.put("ARP", "peso argentino (vecchio Cod.)");
    result.put("ARS", "peso argentino");
    result.put("ATS", "scellino austriaco");
    result.put("AUD", "dollaro australiano");
    result.put("AWG", "fiorino di Aruba");
    result.put("AZM", "manat azero (1993–2006)");
    result.put("AZN", "manat azero");
    result.put("BAD", "dinar Bosnia-Herzegovina");
    result.put("BAM", "marco convertibile della Bosnia-Herzegovina");
    result.put("BBD", "dollaro di Barbados");
    result.put("BDT", "taka bangladese");
    result.put("BEC", "franco belga (convertibile)");
    result.put("BEF", "franco belga");
    result.put("BEL", "franco belga (finanziario)");
    result.put("BGL", "lev bulgaro (1962–1999)");
    result.put("BGN", "lev bulgaro");
    result.put("BHD", "dinaro del Bahrein");
    result.put("BIF", "franco del Burundi");
    result.put("BMD", "dollaro delle Bermuda");
    result.put("BND", "dollaro del Brunei");
    result.put("BOB", "boliviano");
    result.put("BOP", "peso boliviano");
    result.put("BOV", "mvdol boliviano");
    result.put("BRB", "cruzeiro novo brasiliano (1967–1986)");
    result.put("BRC", "cruzado brasiliano");
    result.put("BRE", "cruzeiro brasiliano (1990–1993)");
    result.put("BRL", "real brasiliano");
    result.put("BRN", "cruzado novo brasiliano");
    result.put("BRR", "cruzeiro brasiliano");
    result.put("BSD", "dollaro delle Bahamas");
    result.put("BTN", "ngultrum bhutanese");
    result.put("BUK", "kyat birmano");
    result.put("BWP", "pula del Botswana");
    result.put("BYB", "nuovo rublo bielorusso (1994–1999)");
    result.put("BYN", "rublo bielorusso");
    result.put("BYR", "rublo bielorusso (2000–2016)");
    result.put("BZD", "dollaro del Belize");
    result.put("CAD", "dollaro canadese");
    result.put("CDF", "franco congolese");
    result.put("CHF", "franco svizzero");
    result.put("CLF", "unidades de fomento chilene");
    result.put("CLP", "peso cileno");
    result.put("CNY", "renminbi cinese");
    result.put("COP", "peso colombiano");
    result.put("CRC", "colón costaricano");
    result.put("CSD", "antico dinaro serbo");
    result.put("CSK", "corona forte cecoslovacca");
    result.put("CUC", "peso cubano convertibile");
    result.put("CUP", "peso cubano");
    result.put("CVE", "escudo capoverdiano");
    result.put("CYP", "sterlina cipriota");
    result.put("CZK", "corona ceca");
    result.put("DDM", "ostmark della Germania Orientale");
    result.put("DEM", "marco tedesco");
    result.put("DJF", "franco di Gibuti");
    result.put("DKK", "corona danese");
    result.put("DOP", "peso dominicano");
    result.put("DZD", "dinaro algerino");
    result.put("ECS", "sucre dell’Ecuador");
    result.put("ECV", "unidad de valor constante (UVC) dell’Ecuador");
    result.put("EEK", "corona dell’Estonia");
    result.put("EGP", "sterlina egiziana");
    result.put("ERN", "nakfa eritreo");
    result.put("ESA", "peseta spagnola account");
    result.put("ESB", "peseta spagnola account convertibile");
    result.put("ESP", "peseta spagnola");
    result.put("ETB", "birr etiope");
    result.put("EUR", "euro");
    result.put("FIM", "markka finlandese");
    result.put("FJD", "dollaro delle Figi");
    result.put("FKP", "sterlina delle Falkland");
    result.put("FRF", "franco francese");
    result.put("GBP", "sterlina britannica");
    result.put("GEK", "kupon larit georgiano");
    result.put("GEL", "lari georgiano");
    result.put("GHC", "cedi del Ghana");
    result.put("GHS", "cedi ghanese");
    result.put("GIP", "sterlina di Gibilterra");
    result.put("GMD", "dalasi gambiano");
    result.put("GNF", "franco della Guinea");
    result.put("GNS", "syli della Guinea");
    result.put("GQE", "ekwele della Guinea Equatoriale");
    result.put("GRD", "dracma greca");
    result.put("GTQ", "quetzal guatemalteco");
    result.put("GWE", "escudo della Guinea portoghese");
    result.put("GWP", "peso della Guinea-Bissau");
    result.put("GYD", "dollaro della Guyana");
    result.put("HKD", "dollaro di Hong Kong");
    result.put("HNL", "lempira honduregna");
    result.put("HRD", "dinaro croato");
    result.put("HRK", "kuna croata");
    result.put("HTG", "gourde haitiano");
    result.put("HUF", "fiorino ungherese");
    result.put("IDR", "rupia indonesiana");
    result.put("IEP", "sterlina irlandese");
    result.put("ILP", "sterlina israeliana");
    result.put("ILS", "nuovo siclo israeliano");
    result.put("INR", "rupia indiana");
    result.put("IQD", "dinaro iracheno");
    result.put("IRR", "rial iraniano");
    result.put("ISK", "corona islandese");
    result.put("ITL", "lira italiana");
    result.put("JMD", "dollaro giamaicano");
    result.put("JOD", "dinaro giordano");
    result.put("JPY", "yen giapponese");
    result.put("KES", "scellino keniota");
    result.put("KGS", "som kirghiso");
    result.put("KHR", "riel cambogiano");
    result.put("KMF", "franco comoriano");
    result.put("KPW", "won nordcoreano");
    result.put("KRW", "won sudcoreano");
    result.put("KWD", "dinaro kuwaitiano");
    result.put("KYD", "dollaro delle Isole Cayman");
    result.put("KZT", "tenge kazako");
    result.put("LAK", "kip laotiano");
    result.put("LBP", "lira libanese");
    result.put("LKR", "rupia di Sri Lanka");
    result.put("LRD", "dollaro liberiano");
    result.put("LSL", "loti del Lesotho");
    result.put("LTL", "litas lituano");
    result.put("LTT", "talonas lituani");
    result.put("LUC", "franco convertibile del Lussemburgo");
    result.put("LUF", "franco del Lussemburgo");
    result.put("LUL", "franco finanziario del Lussemburgo");
    result.put("LVL", "lats lettone");
    result.put("LVR", "rublo lettone");
    result.put("LYD", "dinaro libico");
    result.put("MAD", "dirham marocchino");
    result.put("MAF", "franco marocchino");
    result.put("MDL", "leu moldavo");
    result.put("MGA", "ariary malgascio");
    result.put("MGF", "franco malgascio");
    result.put("MKD", "denar macedone");
    result.put("MLF", "franco di Mali");
    result.put("MMK", "kyat di Myanmar");
    result.put("MNT", "tugrik mongolo");
    result.put("MOP", "pataca di Macao");
    result.put("MRO", "ouguiya della Mauritania (1973–2017)");
    result.put("MRU", "ouguiya della Mauritania");
    result.put("MTL", "lira maltese");
    result.put("MTP", "sterlina maltese");
    result.put("MUR", "rupia mauriziana");
    result.put("MVR", "rufiyaa delle Maldive");
    result.put("MWK", "kwacha malawiano");
    result.put("MXN", "peso messicano");
    result.put("MXP", "peso messicano d’argento (1861–1992)");
    result.put("MXV", "unidad de inversion (UDI) messicana");
    result.put("MYR", "ringgit malese");
    result.put("MZE", "escudo del Mozambico");
    result.put("MZN", "metical mozambicano");
    result.put("NAD", "dollaro namibiano");
    result.put("NGN", "naira nigeriana");
    result.put("NIC", "cordoba nicaraguense");
    result.put("NIO", "córdoba nicaraguense");
    result.put("NLG", "fiorino olandese");
    result.put("NOK", "corona norvegese");
    result.put("NPR", "rupia nepalese");
    result.put("NZD", "dollaro neozelandese");
    result.put("OMR", "rial omanita");
    result.put("PAB", "balboa panamense");
    result.put("PEI", "inti peruviano");
    result.put("PEN", "sol peruviano");
    result.put("PES", "sol peruviano (1863–1965)");
    result.put("PGK", "kina papuana");
    result.put("PHP", "peso filippino");
    result.put("PKR", "rupia pakistana");
    result.put("PLN", "złoty polacco");
    result.put("PLZ", "złoty Polacco (1950–1995)");
    result.put("PTE", "escudo portoghese");
    result.put("PYG", "guaraní paraguayano");
    result.put("QAR", "rial qatariano");
    result.put("RHD", "dollaro della Rhodesia");
    result.put("ROL", "leu della Romania");
    result.put("RON", "leu rumeno");
    result.put("RSD", "dinaro serbo");
    result.put("RUB", "rublo russo");
    result.put("RUR", "rublo della CSI");
    result.put("RWF", "franco ruandese");
    result.put("SAR", "riyal saudita");
    result.put("SBD", "dollaro delle Isole Salomone");
    result.put("SCR", "rupia delle Seychelles");
    result.put("SDD", "dinaro sudanese");
    result.put("SDG", "sterlina sudanese");
    result.put("SEK", "corona svedese");
    result.put("SGD", "dollaro di Singapore");
    result.put("SHP", "sterlina di Sant’Elena");
    result.put("SIT", "tallero sloveno");
    result.put("SKK", "corona slovacca");
    result.put("SLL", "leone della Sierra Leone");
    result.put("SOS", "scellino somalo");
    result.put("SRD", "dollaro del Suriname");
    result.put("SRG", "fiorino del Suriname");
    result.put("SSP", "sterlina sud-sudanese");
    result.put("STD", "dobra di Sao Tomé e Principe (1977–2017)");
    result.put("STN", "dobra di Sao Tomé e Príncipe");
    result.put("SUR", "rublo sovietico");
    result.put("SVC", "colón salvadoregno");
    result.put("SYP", "lira siriana");
    result.put("SZL", "lilangeni dello Swaziland");
    result.put("THB", "baht thailandese");
    result.put("TJR", "rublo del Tajikistan");
    result.put("TJS", "somoni tagiko");
    result.put("TMM", "manat turkmeno (1993–2009)");
    result.put("TMT", "manat turkmeno");
    result.put("TND", "dinaro tunisino");
    result.put("TOP", "paʻanga tongano");
    result.put("TPE", "escudo di Timor");
    result.put("TRL", "lira turca (1922–2005)");
    result.put("TRY", "lira turca");
    result.put("TTD", "dollaro di Trinidad e Tobago");
    result.put("TWD", "nuovo dollaro taiwanese");
    result.put("TZS", "scellino della Tanzania");
    result.put("UAH", "grivnia ucraina");
    result.put("UAK", "karbovanetz ucraino");
    result.put("UGS", "scellino ugandese (1966–1987)");
    result.put("UGX", "scellino ugandese");
    result.put("USD", "dollaro statunitense");
    result.put("USN", "dollaro statunitense (next day)");
    result.put("USS", "dollaro statunitense (same day)");
    result.put("UYI", "peso uruguaiano in unità indicizzate");
    result.put("UYP", "peso uruguaiano (1975–1993)");
    result.put("UYU", "peso uruguayano");
    result.put("UZS", "sum uzbeco");
    result.put("VEB", "bolivar venezuelano (1871–2008)");
    result.put("VEF", "bolívar venezuelano (2008–2018)");
    result.put("VES", "bolívar venezuelano");
    result.put("VND", "dong vietnamita");
    result.put("VUV", "vatu di Vanuatu");
    result.put("WST", "tala samoano");
    result.put("XAF", "franco CFA BEAC");
    result.put("XAG", "argento");
    result.put("XAU", "oro");
    result.put("XBA", "unità composita europea");
    result.put("XBB", "unità monetaria europea");
    result.put("XBC", "unità di acconto europea (XBC)");
    result.put("XBD", "unità di acconto europea (XBD)");
    result.put("XCD", "dollaro dei Caraibi orientali");
    result.put("XDR", "diritti speciali di incasso");
    result.put("XFO", "franco oro francese");
    result.put("XFU", "franco UIC francese");
    result.put("XOF", "franco CFA BCEAO");
    result.put("XPD", "palladio");
    result.put("XPF", "franco CFP");
    result.put("XPT", "platino");
    result.put("XRE", "fondi RINET");
    result.put("XTS", "codice di verifica della valuta");
    result.put("XXX", "valuta sconosciuta");
    result.put("YDD", "dinaro dello Yemen");
    result.put("YER", "riyal yemenita");
    result.put("YUD", "dinaro forte yugoslavo");
    result.put("YUM", "dinaro noviy yugoslavo");
    result.put("YUN", "dinaro convertibile yugoslavo");
    result.put("ZAL", "rand sudafricano (finanziario)");
    result.put("ZAR", "rand sudafricano");
    result.put("ZMK", "kwacha dello Zambia (1968–2012)");
    result.put("ZMW", "kwacha dello Zambia");
    result.put("ZRN", "nuovo zaire dello Zaire");
    result.put("ZRZ", "zaire dello Zaire");
    result.put("ZWD", "dollaro dello Zimbabwe");
    result.put("ZWL", "dollaro zimbabwiano (2009)");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "ADP": "peseta andorrana",
      "AED": "dirham degli Emirati Arabi Uniti",
      "AFA": "afgani (1927–2002)",
      "AFN": "afghani",
      "ALL": "lek albanese",
      "AMD": "dram armeno",
      "ANG": "fiorino delle Antille olandesi",
      "AOA": "kwanza angolano",
      "AOK": "kwanza angolano (1977–1990)",
      "AON": "nuovo kwanza angolano (1990–2000)",
      "AOR": "kwanza reajustado angolano (1995–1999)",
      "ARA": "austral argentino",
      "ARP": "peso argentino (vecchio Cod.)",
      "ARS": "peso argentino",
      "ATS": "scellino austriaco",
      "AUD": "dollaro australiano",
      "AWG": "fiorino di Aruba",
      "AZM": "manat azero (1993–2006)",
      "AZN": "manat azero",
      "BAD": "dinar Bosnia-Herzegovina",
      "BAM": "marco convertibile della Bosnia-Herzegovina",
      "BBD": "dollaro di Barbados",
      "BDT": "taka bangladese",
      "BEC": "franco belga (convertibile)",
      "BEF": "franco belga",
      "BEL": "franco belga (finanziario)",
      "BGL": "lev bulgaro (1962–1999)",
      "BGN": "lev bulgaro",
      "BHD": "dinaro del Bahrein",
      "BIF": "franco del Burundi",
      "BMD": "dollaro delle Bermuda",
      "BND": "dollaro del Brunei",
      "BOB": "boliviano",
      "BOP": "peso boliviano",
      "BOV": "mvdol boliviano",
      "BRB": "cruzeiro novo brasiliano (1967–1986)",
      "BRC": "cruzado brasiliano",
      "BRE": "cruzeiro brasiliano (1990–1993)",
      "BRL": "real brasiliano",
      "BRN": "cruzado novo brasiliano",
      "BRR": "cruzeiro brasiliano",
      "BSD": "dollaro delle Bahamas",
      "BTN": "ngultrum bhutanese",
      "BUK": "kyat birmano",
      "BWP": "pula del Botswana",
      "BYB": "nuovo rublo bielorusso (1994–1999)",
      "BYN": "rublo bielorusso",
      "BYR": "rublo bielorusso (2000–2016)",
      "BZD": "dollaro del Belize",
      "CAD": "dollaro canadese",
      "CDF": "franco congolese",
      "CHF": "franco svizzero",
      "CLF": "unidades de fomento chilene",
      "CLP": "peso cileno",
      "CNY": "renminbi cinese",
      "COP": "peso colombiano",
      "CRC": "colón costaricano",
      "CSD": "antico dinaro serbo",
      "CSK": "corona forte cecoslovacca",
      "CUC": "peso cubano convertibile",
      "CUP": "peso cubano",
      "CVE": "escudo capoverdiano",
      "CYP": "sterlina cipriota",
      "CZK": "corona ceca",
      "DDM": "ostmark della Germania Orientale",
      "DEM": "marco tedesco",
      "DJF": "franco di Gibuti",
      "DKK": "corona danese",
      "DOP": "peso dominicano",
      "DZD": "dinaro algerino",
      "ECS": "sucre dell’Ecuador",
      "ECV": "unidad de valor constante (UVC) dell’Ecuador",
      "EEK": "corona dell’Estonia",
      "EGP": "sterlina egiziana",
      "ERN": "nakfa eritreo",
      "ESA": "peseta spagnola account",
      "ESB": "peseta spagnola account convertibile",
      "ESP": "peseta spagnola",
      "ETB": "birr etiope",
      "EUR": "euro",
      "FIM": "markka finlandese",
      "FJD": "dollaro delle Figi",
      "FKP": "sterlina delle Falkland",
      "FRF": "franco francese",
      "GBP": "sterlina britannica",
      "GEK": "kupon larit georgiano",
      "GEL": "lari georgiano",
      "GHC": "cedi del Ghana",
      "GHS": "cedi ghanese",
      "GIP": "sterlina di Gibilterra",
      "GMD": "dalasi gambiano",
      "GNF": "franco della Guinea",
      "GNS": "syli della Guinea",
      "GQE": "ekwele della Guinea Equatoriale",
      "GRD": "dracma greca",
      "GTQ": "quetzal guatemalteco",
      "GWE": "escudo della Guinea portoghese",
      "GWP": "peso della Guinea-Bissau",
      "GYD": "dollaro della Guyana",
      "HKD": "dollaro di Hong Kong",
      "HNL": "lempira honduregna",
      "HRD": "dinaro croato",
      "HRK": "kuna croata",
      "HTG": "gourde haitiano",
      "HUF": "fiorino ungherese",
      "IDR": "rupia indonesiana",
      "IEP": "sterlina irlandese",
      "ILP": "sterlina israeliana",
      "ILS": "nuovo siclo israeliano",
      "INR": "rupia indiana",
      "IQD": "dinaro iracheno",
      "IRR": "rial iraniano",
      "ISK": "corona islandese",
      "ITL": "lira italiana",
      "JMD": "dollaro giamaicano",
      "JOD": "dinaro giordano",
      "JPY": "yen giapponese",
      "KES": "scellino keniota",
      "KGS": "som kirghiso",
      "KHR": "riel cambogiano",
      "KMF": "franco comoriano",
      "KPW": "won nordcoreano",
      "KRW": "won sudcoreano",
      "KWD": "dinaro kuwaitiano",
      "KYD": "dollaro delle Isole Cayman",
      "KZT": "tenge kazako",
      "LAK": "kip laotiano",
      "LBP": "lira libanese",
      "LKR": "rupia di Sri Lanka",
      "LRD": "dollaro liberiano",
      "LSL": "loti del Lesotho",
      "LTL": "litas lituano",
      "LTT": "talonas lituani",
      "LUC": "franco convertibile del Lussemburgo",
      "LUF": "franco del Lussemburgo",
      "LUL": "franco finanziario del Lussemburgo",
      "LVL": "lats lettone",
      "LVR": "rublo lettone",
      "LYD": "dinaro libico",
      "MAD": "dirham marocchino",
      "MAF": "franco marocchino",
      "MDL": "leu moldavo",
      "MGA": "ariary malgascio",
      "MGF": "franco malgascio",
      "MKD": "denar macedone",
      "MLF": "franco di Mali",
      "MMK": "kyat di Myanmar",
      "MNT": "tugrik mongolo",
      "MOP": "pataca di Macao",
      "MRO": "ouguiya della Mauritania (1973–2017)",
      "MRU": "ouguiya della Mauritania",
      "MTL": "lira maltese",
      "MTP": "sterlina maltese",
      "MUR": "rupia mauriziana",
      "MVR": "rufiyaa delle Maldive",
      "MWK": "kwacha malawiano",
      "MXN": "peso messicano",
      "MXP": "peso messicano d’argento (1861–1992)",
      "MXV": "unidad de inversion (UDI) messicana",
      "MYR": "ringgit malese",
      "MZE": "escudo del Mozambico",
      "MZN": "metical mozambicano",
      "NAD": "dollaro namibiano",
      "NGN": "naira nigeriana",
      "NIC": "cordoba nicaraguense",
      "NIO": "córdoba nicaraguense",
      "NLG": "fiorino olandese",
      "NOK": "corona norvegese",
      "NPR": "rupia nepalese",
      "NZD": "dollaro neozelandese",
      "OMR": "rial omanita",
      "PAB": "balboa panamense",
      "PEI": "inti peruviano",
      "PEN": "sol peruviano",
      "PES": "sol peruviano (1863–1965)",
      "PGK": "kina papuana",
      "PHP": "peso filippino",
      "PKR": "rupia pakistana",
      "PLN": "złoty polacco",
      "PLZ": "złoty Polacco (1950–1995)",
      "PTE": "escudo portoghese",
      "PYG": "guaraní paraguayano",
      "QAR": "rial qatariano",
      "RHD": "dollaro della Rhodesia",
      "ROL": "leu della Romania",
      "RON": "leu rumeno",
      "RSD": "dinaro serbo",
      "RUB": "rublo russo",
      "RUR": "rublo della CSI",
      "RWF": "franco ruandese",
      "SAR": "riyal saudita",
      "SBD": "dollaro delle Isole Salomone",
      "SCR": "rupia delle Seychelles",
      "SDD": "dinaro sudanese",
      "SDG": "sterlina sudanese",
      "SEK": "corona svedese",
      "SGD": "dollaro di Singapore",
      "SHP": "sterlina di Sant’Elena",
      "SIT": "tallero sloveno",
      "SKK": "corona slovacca",
      "SLL": "leone della Sierra Leone",
      "SOS": "scellino somalo",
      "SRD": "dollaro del Suriname",
      "SRG": "fiorino del Suriname",
      "SSP": "sterlina sud-sudanese",
      "STD": "dobra di Sao Tomé e Principe (1977–2017)",
      "STN": "dobra di Sao Tomé e Príncipe",
      "SUR": "rublo sovietico",
      "SVC": "colón salvadoregno",
      "SYP": "lira siriana",
      "SZL": "lilangeni dello Swaziland",
      "THB": "baht thailandese",
      "TJR": "rublo del Tajikistan",
      "TJS": "somoni tagiko",
      "TMM": "manat turkmeno (1993–2009)",
      "TMT": "manat turkmeno",
      "TND": "dinaro tunisino",
      "TOP": "paʻanga tongano",
      "TPE": "escudo di Timor",
      "TRL": "lira turca (1922–2005)",
      "TRY": "lira turca",
      "TTD": "dollaro di Trinidad e Tobago",
      "TWD": "nuovo dollaro taiwanese",
      "TZS": "scellino della Tanzania",
      "UAH": "grivnia ucraina",
      "UAK": "karbovanetz ucraino",
      "UGS": "scellino ugandese (1966–1987)",
      "UGX": "scellino ugandese",
      "USD": "dollaro statunitense",
      "USN": "dollaro statunitense (next day)",
      "USS": "dollaro statunitense (same day)",
      "UYI": "peso uruguaiano in unità indicizzate",
      "UYP": "peso uruguaiano (1975–1993)",
      "UYU": "peso uruguayano",
      "UZS": "sum uzbeco",
      "VEB": "bolivar venezuelano (1871–2008)",
      "VEF": "bolívar venezuelano (2008–2018)",
      "VES": "bolívar venezuelano",
      "VND": "dong vietnamita",
      "VUV": "vatu di Vanuatu",
      "WST": "tala samoano",
      "XAF": "franco CFA BEAC",
      "XAG": "argento",
      "XAU": "oro",
      "XBA": "unità composita europea",
      "XBB": "unità monetaria europea",
      "XBC": "unità di acconto europea (XBC)",
      "XBD": "unità di acconto europea (XBD)",
      "XCD": "dollaro dei Caraibi orientali",
      "XDR": "diritti speciali di incasso",
      "XFO": "franco oro francese",
      "XFU": "franco UIC francese",
      "XOF": "franco CFA BCEAO",
      "XPD": "palladio",
      "XPF": "franco CFP",
      "XPT": "platino",
      "XRE": "fondi RINET",
      "XTS": "codice di verifica della valuta",
      "XXX": "valuta sconosciuta",
      "YDD": "dinaro dello Yemen",
      "YER": "riyal yemenita",
      "YUD": "dinaro forte yugoslavo",
      "YUM": "dinaro noviy yugoslavo",
      "YUN": "dinaro convertibile yugoslavo",
      "ZAL": "rand sudafricano (finanziario)",
      "ZAR": "rand sudafricano",
      "ZMK": "kwacha dello Zambia (1968–2012)",
      "ZMW": "kwacha dello Zambia",
      "ZRN": "nuovo zaire dello Zaire",
      "ZRZ": "zaire dello Zaire",
      "ZWD": "dollaro dello Zimbabwe",
      "ZWL": "dollaro zimbabwiano (2009)",
    };
  }-*/;
}
