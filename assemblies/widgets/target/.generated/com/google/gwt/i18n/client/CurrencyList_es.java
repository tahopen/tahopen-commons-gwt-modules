package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_es extends com.google.gwt.i18n.client.CurrencyList_ {
  
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
    // dírham de los Emiratos Árabes Unidos
    result.put("AED", new CurrencyDataImpl("AED", "DH", 2, "DH", "dh"));
    // afgani (1927–2002)
    result.put("AFA", new CurrencyDataImpl("AFA", "AFA", 130, "AFA", "AFA"));
    // afgani
    result.put("AFN", new CurrencyDataImpl("AFN", "AFN", 0, "AFN", "Af."));
    // lek
    result.put("ALL", new CurrencyDataImpl("ALL", "ALL", 0, "ALL", "Lek"));
    // dram
    result.put("AMD", new CurrencyDataImpl("AMD", "AMD", 2, "AMD", "Dram"));
    // florín de las Antillas Neerlandesas
    result.put("ANG", new CurrencyDataImpl("ANG", "ANG", 2, "ANG", "ANG"));
    // kuanza
    result.put("AOA", new CurrencyDataImpl("AOA", "AOA", 2, "AOA", "Kz"));
    // kwanza angoleño (1977–1990)
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130, "AOK", "AOK"));
    // nuevo kwanza angoleño (1990–2000)
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130, "AON", "AON"));
    // kwanza reajustado angoleño (1995–1999)
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130, "AOR", "AOR"));
    // austral argentino
    result.put("ARA", new CurrencyDataImpl("ARA", "ARA", 130, "ARA", "ARA"));
    // peso argentino (1983–1985)
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130, "ARP", "ARP"));
    // peso argentino
    result.put("ARS", new CurrencyDataImpl("ARS", "AR$", 2, "AR$", "$"));
    // chelín austriaco
    result.put("ATS", new CurrencyDataImpl("ATS", "ATS", 130, "ATS", "ATS"));
    // dólar australiano
    result.put("AUD", new CurrencyDataImpl("AUD", "AU$", 2, "AU$", "$"));
    // florín arubeño
    result.put("AWG", new CurrencyDataImpl("AWG", "AWG", 2, "AWG", "Afl."));
    // manat azerí (1993–2006)
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130, "AZM", "AZM"));
    // manat azerbaiyano
    result.put("AZN", new CurrencyDataImpl("AZN", "AZN", 2, "AZN", "man."));
    // dinar bosnio
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130, "BAD", "BAD"));
    // marco convertible de Bosnia y Herzegovina
    result.put("BAM", new CurrencyDataImpl("BAM", "BAM", 2, "BAM", "KM"));
    // dólar barbadense
    result.put("BBD", new CurrencyDataImpl("BBD", "BBD", 2, "BBD", "$"));
    // taka
    result.put("BDT", new CurrencyDataImpl("BDT", "Tk", 2, "Tk", "৳"));
    // franco belga (convertible)
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 130, "BEC", "BEC"));
    // franco belga
    result.put("BEF", new CurrencyDataImpl("BEF", "BEF", 130, "BEF", "BEF"));
    // franco belga (financiero)
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 130, "BEL", "BEL"));
    // lev fuerte búlgaro
    result.put("BGL", new CurrencyDataImpl("BGL", "BGL", 130, "BGL", "BGL"));
    // lev búlgaro
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2, "BGN", "lev"));
    // dinar bahreiní
    result.put("BHD", new CurrencyDataImpl("BHD", "BHD", 3, "BHD", "din"));
    // franco burundés
    result.put("BIF", new CurrencyDataImpl("BIF", "BIF", 0, "BIF", "FBu"));
    // dólar de Bermudas
    result.put("BMD", new CurrencyDataImpl("BMD", "BMD", 2, "BMD", "$"));
    // dólar bruneano
    result.put("BND", new CurrencyDataImpl("BND", "BND", 2, "BND", "$"));
    // boliviano
    result.put("BOB", new CurrencyDataImpl("BOB", "BOB", 2, "BOB", "Bs"));
    // peso boliviano
    result.put("BOP", new CurrencyDataImpl("BOP", "BOP", 130, "BOP", "BOP"));
    // MVDOL boliviano
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 130, "BOV", "BOV"));
    // nuevo cruceiro brasileño (1967–1986)
    result.put("BRB", new CurrencyDataImpl("BRB", "BRB", 130, "BRB", "BRB"));
    // cruzado brasileño
    result.put("BRC", new CurrencyDataImpl("BRC", "BRC", 130, "BRC", "BRC"));
    // cruceiro brasileño (1990–1993)
    result.put("BRE", new CurrencyDataImpl("BRE", "BRE", 130, "BRE", "BRE"));
    // real brasileño
    result.put("BRL", new CurrencyDataImpl("BRL", "R$", 2, "R$", "R$"));
    // nuevo cruzado brasileño
    result.put("BRN", new CurrencyDataImpl("BRN", "BRN", 130, "BRN", "BRN"));
    // cruceiro brasileño
    result.put("BRR", new CurrencyDataImpl("BRR", "BRR", 130, "BRR", "BRR"));
    // dólar bahameño
    result.put("BSD", new CurrencyDataImpl("BSD", "BSD", 2, "BSD", "$"));
    // gultrum
    result.put("BTN", new CurrencyDataImpl("BTN", "BTN", 2, "BTN", "Nu."));
    // kyat birmano
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130, "BUK", "BUK"));
    // pula
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2, "BWP", "P"));
    // nuevo rublo bielorruso (1994–1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130, "BYB", "BYB"));
    // rublo bielorruso
    result.put("BYN", new CurrencyDataImpl("BYN", "BYN", 2, "BYN", "BYN"));
    // rublo bielorruso (2000–2016)
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 128, "BYR", "BYR"));
    // dólar beliceño
    result.put("BZD", new CurrencyDataImpl("BZD", "BZD", 2, "BZD", "$"));
    // dólar canadiense
    result.put("CAD", new CurrencyDataImpl("CAD", "CA$", 2, "C$", "$"));
    // franco congoleño
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2, "CDF", "FrCD"));
    // euro WIR
    result.put("CHE", new CurrencyDataImpl("CHE", "CHE", 130, "CHE", "CHE"));
    // franco suizo
    result.put("CHF", new CurrencyDataImpl("CHF", "CHF", 2, "CHF", "CHF"));
    // franco WIR
    result.put("CHW", new CurrencyDataImpl("CHW", "CHW", 130, "CHW", "CHW"));
    // unidad de fomento chilena
    result.put("CLF", new CurrencyDataImpl("CLF", "CLF", 132, "CLF", "CLF"));
    // peso chileno
    result.put("CLP", new CurrencyDataImpl("CLP", "CL$", 0, "CL$", "$"));
    // yuan chino (extracontinental)
    result.put("CNH", new CurrencyDataImpl("CNH", "CNH", 130, "CNH", "CNH"));
    // yuan
    result.put("CNY", new CurrencyDataImpl("CNY", "RMB¥", 2, "RMB¥", "¥"));
    // peso colombiano
    result.put("COP", new CurrencyDataImpl("COP", "COL$", 2, "COL$", "$"));
    // unidad de valor real colombiana
    result.put("COU", new CurrencyDataImpl("COU", "COU", 130, "COU", "COU"));
    // colón costarricense
    result.put("CRC", new CurrencyDataImpl("CRC", "CR₡", 2, "CR₡", "₡"));
    // antiguo dinar serbio
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130, "CSD", "CSD"));
    // corona fuerte checoslovaca
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130, "CSK", "CSK"));
    // peso cubano convertible
    result.put("CUC", new CurrencyDataImpl("CUC", "CUC", 2, "CUC", "$"));
    // peso cubano
    result.put("CUP", new CurrencyDataImpl("CUP", "$MN", 2, "$MN", "$"));
    // escudo de Cabo Verde
    result.put("CVE", new CurrencyDataImpl("CVE", "CVE", 2, "CVE", "CVE"));
    // libra chipriota
    result.put("CYP", new CurrencyDataImpl("CYP", "CYP", 130, "CYP", "CYP"));
    // corona checa
    result.put("CZK", new CurrencyDataImpl("CZK", "Kč", 2, "Kč", "Kč"));
    // ostmark de Alemania del Este
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130, "DDM", "DDM"));
    // marco alemán
    result.put("DEM", new CurrencyDataImpl("DEM", "DEM", 130, "DEM", "DEM"));
    // franco yibutiano
    result.put("DJF", new CurrencyDataImpl("DJF", "Fdj", 0, "Fdj", "Fdj"));
    // corona danesa
    result.put("DKK", new CurrencyDataImpl("DKK", "kr", 2, "kr", "kr"));
    // peso dominicano
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$", "$"));
    // dinar argelino
    result.put("DZD", new CurrencyDataImpl("DZD", "DZD", 2, "DZD", "din"));
    // sucre ecuatoriano
    result.put("ECS", new CurrencyDataImpl("ECS", "ECS", 130, "ECS", "ECS"));
    // unidad de valor constante (UVC) ecuatoriana
    result.put("ECV", new CurrencyDataImpl("ECV", "ECV", 130, "ECV", "ECV"));
    // corona estonia
    result.put("EEK", new CurrencyDataImpl("EEK", "EEK", 130, "EEK", "EEK"));
    // libra egipcia
    result.put("EGP", new CurrencyDataImpl("EGP", "LE", 2, "LE", "E£"));
    // nakfa
    result.put("ERN", new CurrencyDataImpl("ERN", "ERN", 2, "ERN", "Nfk"));
    // peseta española (cuenta A)
    result.put("ESA", new CurrencyDataImpl("ESA", "ESA", 130, "ESA", "ESA"));
    // peseta española (cuenta convertible)
    result.put("ESB", new CurrencyDataImpl("ESB", "ESB", 130, "ESB", "ESB"));
    // peseta española
    result.put("ESP", new CurrencyDataImpl("ESP", "₧", 128, "₧", "₧"));
    // bir
    result.put("ETB", new CurrencyDataImpl("ETB", "ETB", 2, "ETB", "Birr"));
    // euro
    result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€", "€"));
    // marco finlandés
    result.put("FIM", new CurrencyDataImpl("FIM", "FIM", 130, "FIM", "FIM"));
    // dólar fiyiano
    result.put("FJD", new CurrencyDataImpl("FJD", "FJD", 2, "FJD", "$"));
    // libra malvinense
    result.put("FKP", new CurrencyDataImpl("FKP", "FKP", 2, "FKP", "£"));
    // franco francés
    result.put("FRF", new CurrencyDataImpl("FRF", "FRF", 130, "FRF", "FRF"));
    // libra esterlina
    result.put("GBP", new CurrencyDataImpl("GBP", "GB£", 2, "GB£", "£"));
    // kupon larit georgiano
    result.put("GEK", new CurrencyDataImpl("GEK", "GEK", 130, "GEK", "GEK"));
    // lari
    result.put("GEL", new CurrencyDataImpl("GEL", "₾", 2, "₾", "GEL"));
    // cedi ghanés (1979–2007)
    result.put("GHC", new CurrencyDataImpl("GHC", "GHC", 130, "GHC", "GHC"));
    // cedi
    result.put("GHS", new CurrencyDataImpl("GHS", "GHS", 2, "GHS", "GHS"));
    // libra gibraltareña
    result.put("GIP", new CurrencyDataImpl("GIP", "GIP", 2, "GIP", "£"));
    // dalasi
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2, "GMD", "GMD"));
    // franco guineano
    result.put("GNF", new CurrencyDataImpl("GNF", "GNF", 0, "GNF", "FG"));
    // syli guineano
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130, "GNS", "GNS"));
    // ekuele de Guinea Ecuatorial
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130, "GQE", "GQE"));
    // dracma griego
    result.put("GRD", new CurrencyDataImpl("GRD", "GRD", 130, "GRD", "GRD"));
    // quetzal guatemalteco
    result.put("GTQ", new CurrencyDataImpl("GTQ", "GTQ", 2, "GTQ", "Q"));
    // escudo de Guinea Portuguesa
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130, "GWE", "GWE"));
    // peso de Guinea-Bissáu
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 130, "GWP", "GWP"));
    // dólar guyanés
    result.put("GYD", new CurrencyDataImpl("GYD", "GYD", 2, "GYD", "$"));
    // dólar hongkonés
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$", "$"));
    // lempira hondureño
    result.put("HNL", new CurrencyDataImpl("HNL", "L", 2, "L", "L"));
    // dinar croata
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130, "HRD", "HRD"));
    // kuna
    result.put("HRK", new CurrencyDataImpl("HRK", "HRK", 2, "HRK", "kn"));
    // gourde haitiano
    result.put("HTG", new CurrencyDataImpl("HTG", "HTG", 2, "HTG", "HTG"));
    // forinto húngaro
    result.put("HUF", new CurrencyDataImpl("HUF", "HUF", 2, "HUF", "Ft"));
    // rupia indonesia
    result.put("IDR", new CurrencyDataImpl("IDR", "IDR", 2, "IDR", "Rp"));
    // libra irlandesa
    result.put("IEP", new CurrencyDataImpl("IEP", "IEP", 130, "IEP", "IEP"));
    // libra israelí
    result.put("ILP", new CurrencyDataImpl("ILP", "ILP", 130, "ILP", "ILP"));
    // nuevo séquel israelí
    result.put("ILS", new CurrencyDataImpl("ILS", "IL₪", 2, "IL₪", "₪"));
    // rupia india
    result.put("INR", new CurrencyDataImpl("INR", "Rs", 2, "Rs", "₹"));
    // dinar iraquí
    result.put("IQD", new CurrencyDataImpl("IQD", "IQD", 0, "IQD", "din"));
    // rial iraní
    result.put("IRR", new CurrencyDataImpl("IRR", "IRR", 0, "IRR", "Rial"));
    // corona islandesa
    result.put("ISK", new CurrencyDataImpl("ISK", "kr", 0, "kr", "kr"));
    // lira italiana
    result.put("ITL", new CurrencyDataImpl("ITL", "ITL", 128, "ITL", "ITL"));
    // dólar jamaicano
    result.put("JMD", new CurrencyDataImpl("JMD", "JA$", 2, "JA$", "$"));
    // dinar jordano
    result.put("JOD", new CurrencyDataImpl("JOD", "JOD", 3, "JOD", "din"));
    // yen
    result.put("JPY", new CurrencyDataImpl("JPY", "JP¥", 0, "JP¥", "¥"));
    // chelín keniano
    result.put("KES", new CurrencyDataImpl("KES", "Ksh", 2, "Ksh", "Ksh"));
    // som
    result.put("KGS", new CurrencyDataImpl("KGS", "KGS", 2, "KGS", "KGS"));
    // riel
    result.put("KHR", new CurrencyDataImpl("KHR", "KHR", 2, "KHR", "Riel"));
    // franco comorense
    result.put("KMF", new CurrencyDataImpl("KMF", "KMF", 0, "KMF", "CF"));
    // won norcoreano
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 0, "KPW", "₩"));
    // won surcoreano
    result.put("KRW", new CurrencyDataImpl("KRW", "KR₩", 0, "KR₩", "₩"));
    // dinar kuwaití
    result.put("KWD", new CurrencyDataImpl("KWD", "KWD", 3, "KWD", "din"));
    // dólar de las Islas Caimán
    result.put("KYD", new CurrencyDataImpl("KYD", "KYD", 2, "KYD", "$"));
    // tenge kazako
    result.put("KZT", new CurrencyDataImpl("KZT", "KZT", 2, "KZT", "₸"));
    // kip
    result.put("LAK", new CurrencyDataImpl("LAK", "LAK", 0, "LAK", "₭"));
    // libra libanesa
    result.put("LBP", new CurrencyDataImpl("LBP", "LBP", 0, "LBP", "L£"));
    // rupia esrilanquesa
    result.put("LKR", new CurrencyDataImpl("LKR", "SLRs", 2, "SLRs", "Rs"));
    // dólar liberiano
    result.put("LRD", new CurrencyDataImpl("LRD", "LRD", 2, "LRD", "$"));
    // loti lesothense
    result.put("LSL", new CurrencyDataImpl("LSL", "LSL", 2, "LSL", "LSL"));
    // litas lituano
    result.put("LTL", new CurrencyDataImpl("LTL", "LTL", 130, "LTL", "Lt"));
    // talonas lituano
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130, "LTT", "LTT"));
    // franco convertible luxemburgués
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 130, "LUC", "LUC"));
    // franco luxemburgués
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128, "LUF", "LUF"));
    // franco financiero luxemburgués
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 130, "LUL", "LUL"));
    // lats letón
    result.put("LVL", new CurrencyDataImpl("LVL", "LVL", 130, "LVL", "Ls"));
    // rublo letón
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130, "LVR", "LVR"));
    // dinar libio
    result.put("LYD", new CurrencyDataImpl("LYD", "LYD", 3, "LYD", "din"));
    // dírham marroquí
    result.put("MAD", new CurrencyDataImpl("MAD", "MAD", 2, "MAD", "MAD"));
    // franco marroquí
    result.put("MAF", new CurrencyDataImpl("MAF", "MAF", 130, "MAF", "MAF"));
    // leu moldavo
    result.put("MDL", new CurrencyDataImpl("MDL", "MDL", 2, "MDL", "MDL"));
    // ariari
    result.put("MGA", new CurrencyDataImpl("MGA", "MGA", 0, "MGA", "Ar"));
    // franco malgache
    result.put("MGF", new CurrencyDataImpl("MGF", "MGF", 128, "MGF", "MGF"));
    // dinar macedonio
    result.put("MKD", new CurrencyDataImpl("MKD", "MKD", 2, "MKD", "din"));
    // franco malí
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130, "MLF", "MLF"));
    // kiat
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 0, "MMK", "K"));
    // tugrik
    result.put("MNT", new CurrencyDataImpl("MNT", "MN₮", 2, "MN₮", "₮"));
    // pataca de Macao
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP", 2, "MOP", "MOP"));
    // uguiya (1973–2017)
    result.put("MRO", new CurrencyDataImpl("MRO", "MRO", 128, "MRO", "MRO"));
    // uguiya
    result.put("MRU", new CurrencyDataImpl("MRU", "MRU", 2, "MRU", "MRU"));
    // lira maltesa
    result.put("MTL", new CurrencyDataImpl("MTL", "MTL", 130, "MTL", "MTL"));
    // libra maltesa
    result.put("MTP", new CurrencyDataImpl("MTP", "MTP", 130, "MTP", "MTP"));
    // rupia mauriciana
    result.put("MUR", new CurrencyDataImpl("MUR", "MUR", 2, "MUR", "Rs"));
    // rufiya
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2, "MVR", "MVR"));
    // kwacha malauí
    result.put("MWK", new CurrencyDataImpl("MWK", "MWK", 2, "MWK", "MWK"));
    // peso mexicano
    result.put("MXN", new CurrencyDataImpl("MXN", "Mex$", 2, "Mex$", "$"));
    // peso de plata mexicano (1861–1992)
    result.put("MXP", new CurrencyDataImpl("MXP", "MXP", 130, "MXP", "MXP"));
    // unidad de inversión (UDI) mexicana
    result.put("MXV", new CurrencyDataImpl("MXV", "MXV", 130, "MXV", "MXV"));
    // ringit
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM", "RM"));
    // escudo mozambiqueño
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130, "MZE", "MZE"));
    // antiguo metical mozambiqueño
    result.put("MZM", new CurrencyDataImpl("MZM", "MZM", 130, "MZM", "MZM"));
    // metical
    result.put("MZN", new CurrencyDataImpl("MZN", "MZN", 2, "MZN", "MTn"));
    // dólar namibio
    result.put("NAD", new CurrencyDataImpl("NAD", "NAD", 2, "NAD", "$"));
    // naira
    result.put("NGN", new CurrencyDataImpl("NGN", "NGN", 2, "NGN", "₦"));
    // córdoba nicaragüense (1988–1991)
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130, "NIC", "NIC"));
    // córdoba nicaragüense
    result.put("NIO", new CurrencyDataImpl("NIO", "NIO", 2, "NIO", "C$"));
    // florín neerlandés
    result.put("NLG", new CurrencyDataImpl("NLG", "NLG", 130, "NLG", "NLG"));
    // corona noruega
    result.put("NOK", new CurrencyDataImpl("NOK", "NOkr", 2, "NOkr", "kr"));
    // rupia nepalí
    result.put("NPR", new CurrencyDataImpl("NPR", "NPR", 2, "NPR", "Rs"));
    // dólar neozelandés
    result.put("NZD", new CurrencyDataImpl("NZD", "NZD", 2, "NZD", "$"));
    // rial omaní
    result.put("OMR", new CurrencyDataImpl("OMR", "OMR", 3, "OMR", "Rial"));
    // balboa panameño
    result.put("PAB", new CurrencyDataImpl("PAB", "B/.", 2, "B/.", "B/."));
    // inti peruano
    result.put("PEI", new CurrencyDataImpl("PEI", "PEI", 130, "PEI", "PEI"));
    // sol peruano
    result.put("PEN", new CurrencyDataImpl("PEN", "S/.", 2, "S/.", "S/."));
    // sol peruano (1863–1965)
    result.put("PES", new CurrencyDataImpl("PES", "PES", 130, "PES", "PES"));
    // kina
    result.put("PGK", new CurrencyDataImpl("PGK", "PGK", 2, "PGK", "PGK"));
    // peso filipino
    result.put("PHP", new CurrencyDataImpl("PHP", "PHP", 2, "PHP", "₱"));
    // rupia pakistaní
    result.put("PKR", new CurrencyDataImpl("PKR", "PKRs.", 2, "PKRs.", "Rs"));
    // esloti
    result.put("PLN", new CurrencyDataImpl("PLN", "PLN", 2, "PLN", "zł"));
    // zloty polaco (1950–1995)
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130, "PLZ", "PLZ"));
    // escudo portugués
    result.put("PTE", new CurrencyDataImpl("PTE", "PTE", 130, "PTE", "PTE"));
    // guaraní paraguayo
    result.put("PYG", new CurrencyDataImpl("PYG", "PYG", 0, "PYG", "Gs"));
    // rial catarí
    result.put("QAR", new CurrencyDataImpl("QAR", "QAR", 2, "QAR", "Rial"));
    // dólar rodesiano
    result.put("RHD", new CurrencyDataImpl("RHD", "RHD", 130, "RHD", "RHD"));
    // antiguo leu rumano
    result.put("ROL", new CurrencyDataImpl("ROL", "ROL", 130, "ROL", "ROL"));
    // leu rumano
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2, "RON", "RON"));
    // dinar serbio
    result.put("RSD", new CurrencyDataImpl("RSD", "RSD", 0, "RSD", "din"));
    // rublo ruso
    result.put("RUB", new CurrencyDataImpl("RUB", "руб.", 2, "руб.", "руб."));
    // rublo ruso (1991–1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130, "RUR", "RUR"));
    // franco ruandés
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0, "RWF", "RF"));
    // rial saudí
    result.put("SAR", new CurrencyDataImpl("SAR", "SR", 2, "SR", "Rial"));
    // dólar salomonense
    result.put("SBD", new CurrencyDataImpl("SBD", "SBD", 2, "SBD", "$"));
    // rupia seychellense
    result.put("SCR", new CurrencyDataImpl("SCR", "SCR", 2, "SCR", "SCR"));
    // dinar sudanés
    result.put("SDD", new CurrencyDataImpl("SDD", "SDD", 130, "SDD", "SDD"));
    // libra sudanesa
    result.put("SDG", new CurrencyDataImpl("SDG", "SDG", 2, "SDG", "SDG"));
    // libra sudanesa antigua
    result.put("SDP", new CurrencyDataImpl("SDP", "SDP", 130, "SDP", "SDP"));
    // corona sueca
    result.put("SEK", new CurrencyDataImpl("SEK", "kr", 2, "kr", "kr"));
    // dólar singapurense
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$", "$"));
    // libra de Santa Elena
    result.put("SHP", new CurrencyDataImpl("SHP", "SHP", 2, "SHP", "£"));
    // tólar esloveno
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130, "SIT", "SIT"));
    // corona eslovaca
    result.put("SKK", new CurrencyDataImpl("SKK", "SKK", 130, "SKK", "SKK"));
    // leona
    result.put("SLL", new CurrencyDataImpl("SLL", "SLL", 0, "SLL", "SLL"));
    // chelín somalí
    result.put("SOS", new CurrencyDataImpl("SOS", "SOS", 0, "SOS", "SOS"));
    // dólar surinamés
    result.put("SRD", new CurrencyDataImpl("SRD", "SRD", 2, "SRD", "$"));
    // florín surinamés
    result.put("SRG", new CurrencyDataImpl("SRG", "SRG", 130, "SRG", "SRG"));
    // libra sursudanesa
    result.put("SSP", new CurrencyDataImpl("SSP", "SSP", 2, "SSP", "SSP"));
    // dobra (1977–2017)
    result.put("STD", new CurrencyDataImpl("STD", "STD", 128, "STD", "Db"));
    // dobra
    result.put("STN", new CurrencyDataImpl("STN", "STN", 2, "STN", "STN"));
    // rublo soviético
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130, "SUR", "SUR"));
    // colón salvadoreño
    result.put("SVC", new CurrencyDataImpl("SVC", "SVC", 130, "SVC", "SVC"));
    // libra siria
    result.put("SYP", new CurrencyDataImpl("SYP", "SYP", 0, "SYP", "£"));
    // lilangeni
    result.put("SZL", new CurrencyDataImpl("SZL", "SZL", 2, "SZL", "SZL"));
    // bat
    result.put("THB", new CurrencyDataImpl("THB", "฿", 2, "THB", "฿"));
    // rublo tayiko
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130, "TJR", "TJR"));
    // somoni tayiko
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2, "TJS", "Som"));
    // manat turcomano (1993–2009)
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 128, "TMM", "TMM"));
    // manat turcomano
    result.put("TMT", new CurrencyDataImpl("TMT", "TMT", 2, "TMT", "TMT"));
    // dinar tunecino
    result.put("TND", new CurrencyDataImpl("TND", "TND", 3, "TND", "din"));
    // paanga
    result.put("TOP", new CurrencyDataImpl("TOP", "TOP", 2, "TOP", "T$"));
    // escudo timorense
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130, "TPE", "TPE"));
    // lira turca (1922–2005)
    result.put("TRL", new CurrencyDataImpl("TRL", "TRL", 128, "TRL", "TRL"));
    // lira turca
    result.put("TRY", new CurrencyDataImpl("TRY", "TL", 2, "YTL", "TL"));
    // dólar de Trinidad y Tobago
    result.put("TTD", new CurrencyDataImpl("TTD", "TTD", 2, "TTD", "$"));
    // nuevo dólar taiwanés
    result.put("TWD", new CurrencyDataImpl("TWD", "NT$", 2, "NT$", "NT$"));
    // chelín tanzano
    result.put("TZS", new CurrencyDataImpl("TZS", "TZS", 2, "TZS", "TSh"));
    // grivna
    result.put("UAH", new CurrencyDataImpl("UAH", "UAH", 2, "UAH", "₴"));
    // karbovanet ucraniano
    result.put("UAK", new CurrencyDataImpl("UAK", "UAK", 130, "UAK", "UAK"));
    // chelín ugandés (1966–1987)
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130, "UGS", "UGS"));
    // chelín ugandés
    result.put("UGX", new CurrencyDataImpl("UGX", "UGX", 0, "UGX", "UGX"));
    // dólar estadounidense
    result.put("USD", new CurrencyDataImpl("USD", "US$", 2, "US$", "$"));
    // dólar estadounidense (día siguiente)
    result.put("USN", new CurrencyDataImpl("USN", "USN", 130, "USN", "USN"));
    // dólar estadounidense (mismo día)
    result.put("USS", new CurrencyDataImpl("USS", "USS", 130, "USS", "USS"));
    // peso uruguayo en unidades indexadas
    result.put("UYI", new CurrencyDataImpl("UYI", "UYI", 128, "UYI", "UYI"));
    // peso uruguayo (1975–1993)
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130, "UYP", "UYP"));
    // peso uruguayo
    result.put("UYU", new CurrencyDataImpl("UYU", "UY$", 2, "UY$", "$"));
    // unidad previsional uruguayo
    result.put("UYW", new CurrencyDataImpl("UYW", "UYW", 132, "UYW", "UYW"));
    // sum
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 2, "UZS", "soʼm"));
    // bolívar venezolano (1871–2008)
    result.put("VEB", new CurrencyDataImpl("VEB", "VEB", 130, "VEB", "VEB"));
    // bolívar venezolano (2008–2018)
    result.put("VEF", new CurrencyDataImpl("VEF", "VEF", 130, "VEF", "Bs"));
    // bolívar venezolano
    result.put("VES", new CurrencyDataImpl("VES", "VES", 2, "VES", "VES"));
    // dong
    result.put("VND", new CurrencyDataImpl("VND", "₫", 24, "₫", "₫"));
    // vatu
    result.put("VUV", new CurrencyDataImpl("VUV", "VUV", 0, "VUV", "VUV"));
    // tala
    result.put("WST", new CurrencyDataImpl("WST", "WST", 2, "WST", "WST"));
    // franco CFA de África Central
    result.put("XAF", new CurrencyDataImpl("XAF", "XAF", 0, "XAF", "FCFA"));
    // plata
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 130, "XAG", "XAG"));
    // oro
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 130, "XAU", "XAU"));
    // unidad compuesta europea
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 130, "XBA", "XBA"));
    // unidad monetaria europea
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 130, "XBB", "XBB"));
    // unidad de cuenta europea (XBC)
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 130, "XBC", "XBC"));
    // unidad de cuenta europea (XBD)
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 130, "XBD", "XBD"));
    // dólar del Caribe Oriental
    result.put("XCD", new CurrencyDataImpl("XCD", "XCD", 2, "XCD", "$"));
    // derechos especiales de giro
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 130, "XDR", "XDR"));
    // unidad de moneda europea
    result.put("XEU", new CurrencyDataImpl("XEU", "XEU", 130, "XEU", "XEU"));
    // franco oro francés
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 130, "XFO", "XFO"));
    // franco UIC francés
    result.put("XFU", new CurrencyDataImpl("XFU", "XFU", 130, "XFU", "XFU"));
    // franco CFA de África Occidental
    result.put("XOF", new CurrencyDataImpl("XOF", "XOF", 0, "XOF", "CFA"));
    // paladio
    result.put("XPD", new CurrencyDataImpl("XPD", "XPD", 130, "XPD", "XPD"));
    // franco CFP
    result.put("XPF", new CurrencyDataImpl("XPF", "CFPF", 0, "CFPF", "FCFP"));
    // platino
    result.put("XPT", new CurrencyDataImpl("XPT", "XPT", 130, "XPT", "XPT"));
    // fondos RINET
    result.put("XRE", new CurrencyDataImpl("XRE", "XRE", 130, "XRE", "XRE"));
    // código reservado para pruebas
    result.put("XTS", new CurrencyDataImpl("XTS", "XTS", 130, "XTS", "XTS"));
    // moneda desconocida
    result.put("XXX", new CurrencyDataImpl("XXX", "¤", 130, "¤", "¤"));
    // dinar yemení
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130, "YDD", "YDD"));
    // rial yemení
    result.put("YER", new CurrencyDataImpl("YER", "YER", 0, "YER", "Rial"));
    // dinar fuerte yugoslavo
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130, "YUD", "YUD"));
    // super dinar yugoslavo
    result.put("YUM", new CurrencyDataImpl("YUM", "YUM", 130, "YUM", "YUM"));
    // dinar convertible yugoslavo
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130, "YUN", "YUN"));
    // rand sudafricano (financiero)
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 130, "ZAL", "ZAL"));
    // rand
    result.put("ZAR", new CurrencyDataImpl("ZAR", "ZAR", 2, "ZAR", "R"));
    // kwacha zambiano (1968–2012)
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZMK", 128, "ZMK", "ZWK"));
    // kwacha zambiano
    result.put("ZMW", new CurrencyDataImpl("ZMW", "ZMW", 2, "ZMW", "ZMW"));
    // nuevo zaire zaireño
    result.put("ZRN", new CurrencyDataImpl("ZRN", "ZRN", 130, "ZRN", "ZRN"));
    // zaire zaireño
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"));
    // dólar de Zimbabue
    result.put("ZWD", new CurrencyDataImpl("ZWD", "ZWD", 128, "ZWD", "ZWD"));
    // dólar zimbabuense
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
      // dírham de los Emiratos Árabes Unidos
      "AED": [ "AED", "DH", 2, "DH", "dh"],
      // afgani (1927–2002)
      "AFA": [ "AFA", "AFA", 130, "AFA", "AFA"],
      // afgani
      "AFN": [ "AFN", "AFN", 0, "AFN", "Af."],
      // lek
      "ALL": [ "ALL", "ALL", 0, "ALL", "Lek"],
      // dram
      "AMD": [ "AMD", "AMD", 2, "AMD", "Dram"],
      // florín de las Antillas Neerlandesas
      "ANG": [ "ANG", "ANG", 2, "ANG", "ANG"],
      // kuanza
      "AOA": [ "AOA", "AOA", 2, "AOA", "Kz"],
      // kwanza angoleño (1977–1990)
      "AOK": [ "AOK", "AOK", 130, "AOK", "AOK"],
      // nuevo kwanza angoleño (1990–2000)
      "AON": [ "AON", "AON", 130, "AON", "AON"],
      // kwanza reajustado angoleño (1995–1999)
      "AOR": [ "AOR", "AOR", 130, "AOR", "AOR"],
      // austral argentino
      "ARA": [ "ARA", "ARA", 130, "ARA", "ARA"],
      // peso argentino (1983–1985)
      "ARP": [ "ARP", "ARP", 130, "ARP", "ARP"],
      // peso argentino
      "ARS": [ "ARS", "AR$", 2, "AR$", "$"],
      // chelín austriaco
      "ATS": [ "ATS", "ATS", 130, "ATS", "ATS"],
      // dólar australiano
      "AUD": [ "AUD", "AU$", 2, "AU$", "$"],
      // florín arubeño
      "AWG": [ "AWG", "AWG", 2, "AWG", "Afl."],
      // manat azerí (1993–2006)
      "AZM": [ "AZM", "AZM", 130, "AZM", "AZM"],
      // manat azerbaiyano
      "AZN": [ "AZN", "AZN", 2, "AZN", "man."],
      // dinar bosnio
      "BAD": [ "BAD", "BAD", 130, "BAD", "BAD"],
      // marco convertible de Bosnia y Herzegovina
      "BAM": [ "BAM", "BAM", 2, "BAM", "KM"],
      // dólar barbadense
      "BBD": [ "BBD", "BBD", 2, "BBD", "$"],
      // taka
      "BDT": [ "BDT", "Tk", 2, "Tk", "৳"],
      // franco belga (convertible)
      "BEC": [ "BEC", "BEC", 130, "BEC", "BEC"],
      // franco belga
      "BEF": [ "BEF", "BEF", 130, "BEF", "BEF"],
      // franco belga (financiero)
      "BEL": [ "BEL", "BEL", 130, "BEL", "BEL"],
      // lev fuerte búlgaro
      "BGL": [ "BGL", "BGL", 130, "BGL", "BGL"],
      // lev búlgaro
      "BGN": [ "BGN", "BGN", 2, "BGN", "lev"],
      // dinar bahreiní
      "BHD": [ "BHD", "BHD", 3, "BHD", "din"],
      // franco burundés
      "BIF": [ "BIF", "BIF", 0, "BIF", "FBu"],
      // dólar de Bermudas
      "BMD": [ "BMD", "BMD", 2, "BMD", "$"],
      // dólar bruneano
      "BND": [ "BND", "BND", 2, "BND", "$"],
      // boliviano
      "BOB": [ "BOB", "BOB", 2, "BOB", "Bs"],
      // peso boliviano
      "BOP": [ "BOP", "BOP", 130, "BOP", "BOP"],
      // MVDOL boliviano
      "BOV": [ "BOV", "BOV", 130, "BOV", "BOV"],
      // nuevo cruceiro brasileño (1967–1986)
      "BRB": [ "BRB", "BRB", 130, "BRB", "BRB"],
      // cruzado brasileño
      "BRC": [ "BRC", "BRC", 130, "BRC", "BRC"],
      // cruceiro brasileño (1990–1993)
      "BRE": [ "BRE", "BRE", 130, "BRE", "BRE"],
      // real brasileño
      "BRL": [ "BRL", "R$", 2, "R$", "R$"],
      // nuevo cruzado brasileño
      "BRN": [ "BRN", "BRN", 130, "BRN", "BRN"],
      // cruceiro brasileño
      "BRR": [ "BRR", "BRR", 130, "BRR", "BRR"],
      // dólar bahameño
      "BSD": [ "BSD", "BSD", 2, "BSD", "$"],
      // gultrum
      "BTN": [ "BTN", "BTN", 2, "BTN", "Nu."],
      // kyat birmano
      "BUK": [ "BUK", "BUK", 130, "BUK", "BUK"],
      // pula
      "BWP": [ "BWP", "BWP", 2, "BWP", "P"],
      // nuevo rublo bielorruso (1994–1999)
      "BYB": [ "BYB", "BYB", 130, "BYB", "BYB"],
      // rublo bielorruso
      "BYN": [ "BYN", "BYN", 2, "BYN", "BYN"],
      // rublo bielorruso (2000–2016)
      "BYR": [ "BYR", "BYR", 128, "BYR", "BYR"],
      // dólar beliceño
      "BZD": [ "BZD", "BZD", 2, "BZD", "$"],
      // dólar canadiense
      "CAD": [ "CAD", "CA$", 2, "C$", "$"],
      // franco congoleño
      "CDF": [ "CDF", "CDF", 2, "CDF", "FrCD"],
      // euro WIR
      "CHE": [ "CHE", "CHE", 130, "CHE", "CHE"],
      // franco suizo
      "CHF": [ "CHF", "CHF", 2, "CHF", "CHF"],
      // franco WIR
      "CHW": [ "CHW", "CHW", 130, "CHW", "CHW"],
      // unidad de fomento chilena
      "CLF": [ "CLF", "CLF", 132, "CLF", "CLF"],
      // peso chileno
      "CLP": [ "CLP", "CL$", 0, "CL$", "$"],
      // yuan chino (extracontinental)
      "CNH": [ "CNH", "CNH", 130, "CNH", "CNH"],
      // yuan
      "CNY": [ "CNY", "RMB¥", 2, "RMB¥", "¥"],
      // peso colombiano
      "COP": [ "COP", "COL$", 2, "COL$", "$"],
      // unidad de valor real colombiana
      "COU": [ "COU", "COU", 130, "COU", "COU"],
      // colón costarricense
      "CRC": [ "CRC", "CR₡", 2, "CR₡", "₡"],
      // antiguo dinar serbio
      "CSD": [ "CSD", "CSD", 130, "CSD", "CSD"],
      // corona fuerte checoslovaca
      "CSK": [ "CSK", "CSK", 130, "CSK", "CSK"],
      // peso cubano convertible
      "CUC": [ "CUC", "CUC", 2, "CUC", "$"],
      // peso cubano
      "CUP": [ "CUP", "$MN", 2, "$MN", "$"],
      // escudo de Cabo Verde
      "CVE": [ "CVE", "CVE", 2, "CVE", "CVE"],
      // libra chipriota
      "CYP": [ "CYP", "CYP", 130, "CYP", "CYP"],
      // corona checa
      "CZK": [ "CZK", "Kč", 2, "Kč", "Kč"],
      // ostmark de Alemania del Este
      "DDM": [ "DDM", "DDM", 130, "DDM", "DDM"],
      // marco alemán
      "DEM": [ "DEM", "DEM", 130, "DEM", "DEM"],
      // franco yibutiano
      "DJF": [ "DJF", "Fdj", 0, "Fdj", "Fdj"],
      // corona danesa
      "DKK": [ "DKK", "kr", 2, "kr", "kr"],
      // peso dominicano
      "DOP": [ "DOP", "RD$", 2, "RD$", "$"],
      // dinar argelino
      "DZD": [ "DZD", "DZD", 2, "DZD", "din"],
      // sucre ecuatoriano
      "ECS": [ "ECS", "ECS", 130, "ECS", "ECS"],
      // unidad de valor constante (UVC) ecuatoriana
      "ECV": [ "ECV", "ECV", 130, "ECV", "ECV"],
      // corona estonia
      "EEK": [ "EEK", "EEK", 130, "EEK", "EEK"],
      // libra egipcia
      "EGP": [ "EGP", "LE", 2, "LE", "E£"],
      // nakfa
      "ERN": [ "ERN", "ERN", 2, "ERN", "Nfk"],
      // peseta española (cuenta A)
      "ESA": [ "ESA", "ESA", 130, "ESA", "ESA"],
      // peseta española (cuenta convertible)
      "ESB": [ "ESB", "ESB", 130, "ESB", "ESB"],
      // peseta española
      "ESP": [ "ESP", "₧", 128, "₧", "₧"],
      // bir
      "ETB": [ "ETB", "ETB", 2, "ETB", "Birr"],
      // euro
      "EUR": [ "EUR", "€", 2, "€", "€"],
      // marco finlandés
      "FIM": [ "FIM", "FIM", 130, "FIM", "FIM"],
      // dólar fiyiano
      "FJD": [ "FJD", "FJD", 2, "FJD", "$"],
      // libra malvinense
      "FKP": [ "FKP", "FKP", 2, "FKP", "£"],
      // franco francés
      "FRF": [ "FRF", "FRF", 130, "FRF", "FRF"],
      // libra esterlina
      "GBP": [ "GBP", "GB£", 2, "GB£", "£"],
      // kupon larit georgiano
      "GEK": [ "GEK", "GEK", 130, "GEK", "GEK"],
      // lari
      "GEL": [ "GEL", "₾", 2, "₾", "GEL"],
      // cedi ghanés (1979–2007)
      "GHC": [ "GHC", "GHC", 130, "GHC", "GHC"],
      // cedi
      "GHS": [ "GHS", "GHS", 2, "GHS", "GHS"],
      // libra gibraltareña
      "GIP": [ "GIP", "GIP", 2, "GIP", "£"],
      // dalasi
      "GMD": [ "GMD", "GMD", 2, "GMD", "GMD"],
      // franco guineano
      "GNF": [ "GNF", "GNF", 0, "GNF", "FG"],
      // syli guineano
      "GNS": [ "GNS", "GNS", 130, "GNS", "GNS"],
      // ekuele de Guinea Ecuatorial
      "GQE": [ "GQE", "GQE", 130, "GQE", "GQE"],
      // dracma griego
      "GRD": [ "GRD", "GRD", 130, "GRD", "GRD"],
      // quetzal guatemalteco
      "GTQ": [ "GTQ", "GTQ", 2, "GTQ", "Q"],
      // escudo de Guinea Portuguesa
      "GWE": [ "GWE", "GWE", 130, "GWE", "GWE"],
      // peso de Guinea-Bissáu
      "GWP": [ "GWP", "GWP", 130, "GWP", "GWP"],
      // dólar guyanés
      "GYD": [ "GYD", "GYD", 2, "GYD", "$"],
      // dólar hongkonés
      "HKD": [ "HKD", "HK$", 2, "HK$", "$"],
      // lempira hondureño
      "HNL": [ "HNL", "L", 2, "L", "L"],
      // dinar croata
      "HRD": [ "HRD", "HRD", 130, "HRD", "HRD"],
      // kuna
      "HRK": [ "HRK", "HRK", 2, "HRK", "kn"],
      // gourde haitiano
      "HTG": [ "HTG", "HTG", 2, "HTG", "HTG"],
      // forinto húngaro
      "HUF": [ "HUF", "HUF", 2, "HUF", "Ft"],
      // rupia indonesia
      "IDR": [ "IDR", "IDR", 2, "IDR", "Rp"],
      // libra irlandesa
      "IEP": [ "IEP", "IEP", 130, "IEP", "IEP"],
      // libra israelí
      "ILP": [ "ILP", "ILP", 130, "ILP", "ILP"],
      // nuevo séquel israelí
      "ILS": [ "ILS", "IL₪", 2, "IL₪", "₪"],
      // rupia india
      "INR": [ "INR", "Rs", 2, "Rs", "₹"],
      // dinar iraquí
      "IQD": [ "IQD", "IQD", 0, "IQD", "din"],
      // rial iraní
      "IRR": [ "IRR", "IRR", 0, "IRR", "Rial"],
      // corona islandesa
      "ISK": [ "ISK", "kr", 0, "kr", "kr"],
      // lira italiana
      "ITL": [ "ITL", "ITL", 128, "ITL", "ITL"],
      // dólar jamaicano
      "JMD": [ "JMD", "JA$", 2, "JA$", "$"],
      // dinar jordano
      "JOD": [ "JOD", "JOD", 3, "JOD", "din"],
      // yen
      "JPY": [ "JPY", "JP¥", 0, "JP¥", "¥"],
      // chelín keniano
      "KES": [ "KES", "Ksh", 2, "Ksh", "Ksh"],
      // som
      "KGS": [ "KGS", "KGS", 2, "KGS", "KGS"],
      // riel
      "KHR": [ "KHR", "KHR", 2, "KHR", "Riel"],
      // franco comorense
      "KMF": [ "KMF", "KMF", 0, "KMF", "CF"],
      // won norcoreano
      "KPW": [ "KPW", "KPW", 0, "KPW", "₩"],
      // won surcoreano
      "KRW": [ "KRW", "KR₩", 0, "KR₩", "₩"],
      // dinar kuwaití
      "KWD": [ "KWD", "KWD", 3, "KWD", "din"],
      // dólar de las Islas Caimán
      "KYD": [ "KYD", "KYD", 2, "KYD", "$"],
      // tenge kazako
      "KZT": [ "KZT", "KZT", 2, "KZT", "₸"],
      // kip
      "LAK": [ "LAK", "LAK", 0, "LAK", "₭"],
      // libra libanesa
      "LBP": [ "LBP", "LBP", 0, "LBP", "L£"],
      // rupia esrilanquesa
      "LKR": [ "LKR", "SLRs", 2, "SLRs", "Rs"],
      // dólar liberiano
      "LRD": [ "LRD", "LRD", 2, "LRD", "$"],
      // loti lesothense
      "LSL": [ "LSL", "LSL", 2, "LSL", "LSL"],
      // litas lituano
      "LTL": [ "LTL", "LTL", 130, "LTL", "Lt"],
      // talonas lituano
      "LTT": [ "LTT", "LTT", 130, "LTT", "LTT"],
      // franco convertible luxemburgués
      "LUC": [ "LUC", "LUC", 130, "LUC", "LUC"],
      // franco luxemburgués
      "LUF": [ "LUF", "LUF", 128, "LUF", "LUF"],
      // franco financiero luxemburgués
      "LUL": [ "LUL", "LUL", 130, "LUL", "LUL"],
      // lats letón
      "LVL": [ "LVL", "LVL", 130, "LVL", "Ls"],
      // rublo letón
      "LVR": [ "LVR", "LVR", 130, "LVR", "LVR"],
      // dinar libio
      "LYD": [ "LYD", "LYD", 3, "LYD", "din"],
      // dírham marroquí
      "MAD": [ "MAD", "MAD", 2, "MAD", "MAD"],
      // franco marroquí
      "MAF": [ "MAF", "MAF", 130, "MAF", "MAF"],
      // leu moldavo
      "MDL": [ "MDL", "MDL", 2, "MDL", "MDL"],
      // ariari
      "MGA": [ "MGA", "MGA", 0, "MGA", "Ar"],
      // franco malgache
      "MGF": [ "MGF", "MGF", 128, "MGF", "MGF"],
      // dinar macedonio
      "MKD": [ "MKD", "MKD", 2, "MKD", "din"],
      // franco malí
      "MLF": [ "MLF", "MLF", 130, "MLF", "MLF"],
      // kiat
      "MMK": [ "MMK", "MMK", 0, "MMK", "K"],
      // tugrik
      "MNT": [ "MNT", "MN₮", 2, "MN₮", "₮"],
      // pataca de Macao
      "MOP": [ "MOP", "MOP", 2, "MOP", "MOP"],
      // uguiya (1973–2017)
      "MRO": [ "MRO", "MRO", 128, "MRO", "MRO"],
      // uguiya
      "MRU": [ "MRU", "MRU", 2, "MRU", "MRU"],
      // lira maltesa
      "MTL": [ "MTL", "MTL", 130, "MTL", "MTL"],
      // libra maltesa
      "MTP": [ "MTP", "MTP", 130, "MTP", "MTP"],
      // rupia mauriciana
      "MUR": [ "MUR", "MUR", 2, "MUR", "Rs"],
      // rufiya
      "MVR": [ "MVR", "MVR", 2, "MVR", "MVR"],
      // kwacha malauí
      "MWK": [ "MWK", "MWK", 2, "MWK", "MWK"],
      // peso mexicano
      "MXN": [ "MXN", "Mex$", 2, "Mex$", "$"],
      // peso de plata mexicano (1861–1992)
      "MXP": [ "MXP", "MXP", 130, "MXP", "MXP"],
      // unidad de inversión (UDI) mexicana
      "MXV": [ "MXV", "MXV", 130, "MXV", "MXV"],
      // ringit
      "MYR": [ "MYR", "RM", 2, "RM", "RM"],
      // escudo mozambiqueño
      "MZE": [ "MZE", "MZE", 130, "MZE", "MZE"],
      // antiguo metical mozambiqueño
      "MZM": [ "MZM", "MZM", 130, "MZM", "MZM"],
      // metical
      "MZN": [ "MZN", "MZN", 2, "MZN", "MTn"],
      // dólar namibio
      "NAD": [ "NAD", "NAD", 2, "NAD", "$"],
      // naira
      "NGN": [ "NGN", "NGN", 2, "NGN", "₦"],
      // córdoba nicaragüense (1988–1991)
      "NIC": [ "NIC", "NIC", 130, "NIC", "NIC"],
      // córdoba nicaragüense
      "NIO": [ "NIO", "NIO", 2, "NIO", "C$"],
      // florín neerlandés
      "NLG": [ "NLG", "NLG", 130, "NLG", "NLG"],
      // corona noruega
      "NOK": [ "NOK", "NOkr", 2, "NOkr", "kr"],
      // rupia nepalí
      "NPR": [ "NPR", "NPR", 2, "NPR", "Rs"],
      // dólar neozelandés
      "NZD": [ "NZD", "NZD", 2, "NZD", "$"],
      // rial omaní
      "OMR": [ "OMR", "OMR", 3, "OMR", "Rial"],
      // balboa panameño
      "PAB": [ "PAB", "B/.", 2, "B/.", "B/."],
      // inti peruano
      "PEI": [ "PEI", "PEI", 130, "PEI", "PEI"],
      // sol peruano
      "PEN": [ "PEN", "S/.", 2, "S/.", "S/."],
      // sol peruano (1863–1965)
      "PES": [ "PES", "PES", 130, "PES", "PES"],
      // kina
      "PGK": [ "PGK", "PGK", 2, "PGK", "PGK"],
      // peso filipino
      "PHP": [ "PHP", "PHP", 2, "PHP", "₱"],
      // rupia pakistaní
      "PKR": [ "PKR", "PKRs.", 2, "PKRs.", "Rs"],
      // esloti
      "PLN": [ "PLN", "PLN", 2, "PLN", "zł"],
      // zloty polaco (1950–1995)
      "PLZ": [ "PLZ", "PLZ", 130, "PLZ", "PLZ"],
      // escudo portugués
      "PTE": [ "PTE", "PTE", 130, "PTE", "PTE"],
      // guaraní paraguayo
      "PYG": [ "PYG", "PYG", 0, "PYG", "Gs"],
      // rial catarí
      "QAR": [ "QAR", "QAR", 2, "QAR", "Rial"],
      // dólar rodesiano
      "RHD": [ "RHD", "RHD", 130, "RHD", "RHD"],
      // antiguo leu rumano
      "ROL": [ "ROL", "ROL", 130, "ROL", "ROL"],
      // leu rumano
      "RON": [ "RON", "RON", 2, "RON", "RON"],
      // dinar serbio
      "RSD": [ "RSD", "RSD", 0, "RSD", "din"],
      // rublo ruso
      "RUB": [ "RUB", "руб.", 2, "руб.", "руб."],
      // rublo ruso (1991–1998)
      "RUR": [ "RUR", "RUR", 130, "RUR", "RUR"],
      // franco ruandés
      "RWF": [ "RWF", "RWF", 0, "RWF", "RF"],
      // rial saudí
      "SAR": [ "SAR", "SR", 2, "SR", "Rial"],
      // dólar salomonense
      "SBD": [ "SBD", "SBD", 2, "SBD", "$"],
      // rupia seychellense
      "SCR": [ "SCR", "SCR", 2, "SCR", "SCR"],
      // dinar sudanés
      "SDD": [ "SDD", "SDD", 130, "SDD", "SDD"],
      // libra sudanesa
      "SDG": [ "SDG", "SDG", 2, "SDG", "SDG"],
      // libra sudanesa antigua
      "SDP": [ "SDP", "SDP", 130, "SDP", "SDP"],
      // corona sueca
      "SEK": [ "SEK", "kr", 2, "kr", "kr"],
      // dólar singapurense
      "SGD": [ "SGD", "S$", 2, "S$", "$"],
      // libra de Santa Elena
      "SHP": [ "SHP", "SHP", 2, "SHP", "£"],
      // tólar esloveno
      "SIT": [ "SIT", "SIT", 130, "SIT", "SIT"],
      // corona eslovaca
      "SKK": [ "SKK", "SKK", 130, "SKK", "SKK"],
      // leona
      "SLL": [ "SLL", "SLL", 0, "SLL", "SLL"],
      // chelín somalí
      "SOS": [ "SOS", "SOS", 0, "SOS", "SOS"],
      // dólar surinamés
      "SRD": [ "SRD", "SRD", 2, "SRD", "$"],
      // florín surinamés
      "SRG": [ "SRG", "SRG", 130, "SRG", "SRG"],
      // libra sursudanesa
      "SSP": [ "SSP", "SSP", 2, "SSP", "SSP"],
      // dobra (1977–2017)
      "STD": [ "STD", "STD", 128, "STD", "Db"],
      // dobra
      "STN": [ "STN", "STN", 2, "STN", "STN"],
      // rublo soviético
      "SUR": [ "SUR", "SUR", 130, "SUR", "SUR"],
      // colón salvadoreño
      "SVC": [ "SVC", "SVC", 130, "SVC", "SVC"],
      // libra siria
      "SYP": [ "SYP", "SYP", 0, "SYP", "£"],
      // lilangeni
      "SZL": [ "SZL", "SZL", 2, "SZL", "SZL"],
      // bat
      "THB": [ "THB", "฿", 2, "THB", "฿"],
      // rublo tayiko
      "TJR": [ "TJR", "TJR", 130, "TJR", "TJR"],
      // somoni tayiko
      "TJS": [ "TJS", "TJS", 2, "TJS", "Som"],
      // manat turcomano (1993–2009)
      "TMM": [ "TMM", "TMM", 128, "TMM", "TMM"],
      // manat turcomano
      "TMT": [ "TMT", "TMT", 2, "TMT", "TMT"],
      // dinar tunecino
      "TND": [ "TND", "TND", 3, "TND", "din"],
      // paanga
      "TOP": [ "TOP", "TOP", 2, "TOP", "T$"],
      // escudo timorense
      "TPE": [ "TPE", "TPE", 130, "TPE", "TPE"],
      // lira turca (1922–2005)
      "TRL": [ "TRL", "TRL", 128, "TRL", "TRL"],
      // lira turca
      "TRY": [ "TRY", "TL", 2, "YTL", "TL"],
      // dólar de Trinidad y Tobago
      "TTD": [ "TTD", "TTD", 2, "TTD", "$"],
      // nuevo dólar taiwanés
      "TWD": [ "TWD", "NT$", 2, "NT$", "NT$"],
      // chelín tanzano
      "TZS": [ "TZS", "TZS", 2, "TZS", "TSh"],
      // grivna
      "UAH": [ "UAH", "UAH", 2, "UAH", "₴"],
      // karbovanet ucraniano
      "UAK": [ "UAK", "UAK", 130, "UAK", "UAK"],
      // chelín ugandés (1966–1987)
      "UGS": [ "UGS", "UGS", 130, "UGS", "UGS"],
      // chelín ugandés
      "UGX": [ "UGX", "UGX", 0, "UGX", "UGX"],
      // dólar estadounidense
      "USD": [ "USD", "US$", 2, "US$", "$"],
      // dólar estadounidense (día siguiente)
      "USN": [ "USN", "USN", 130, "USN", "USN"],
      // dólar estadounidense (mismo día)
      "USS": [ "USS", "USS", 130, "USS", "USS"],
      // peso uruguayo en unidades indexadas
      "UYI": [ "UYI", "UYI", 128, "UYI", "UYI"],
      // peso uruguayo (1975–1993)
      "UYP": [ "UYP", "UYP", 130, "UYP", "UYP"],
      // peso uruguayo
      "UYU": [ "UYU", "UY$", 2, "UY$", "$"],
      // unidad previsional uruguayo
      "UYW": [ "UYW", "UYW", 132, "UYW", "UYW"],
      // sum
      "UZS": [ "UZS", "UZS", 2, "UZS", "soʼm"],
      // bolívar venezolano (1871–2008)
      "VEB": [ "VEB", "VEB", 130, "VEB", "VEB"],
      // bolívar venezolano (2008–2018)
      "VEF": [ "VEF", "VEF", 130, "VEF", "Bs"],
      // bolívar venezolano
      "VES": [ "VES", "VES", 2, "VES", "VES"],
      // dong
      "VND": [ "VND", "₫", 24, "₫", "₫"],
      // vatu
      "VUV": [ "VUV", "VUV", 0, "VUV", "VUV"],
      // tala
      "WST": [ "WST", "WST", 2, "WST", "WST"],
      // franco CFA de África Central
      "XAF": [ "XAF", "XAF", 0, "XAF", "FCFA"],
      // plata
      "XAG": [ "XAG", "XAG", 130, "XAG", "XAG"],
      // oro
      "XAU": [ "XAU", "XAU", 130, "XAU", "XAU"],
      // unidad compuesta europea
      "XBA": [ "XBA", "XBA", 130, "XBA", "XBA"],
      // unidad monetaria europea
      "XBB": [ "XBB", "XBB", 130, "XBB", "XBB"],
      // unidad de cuenta europea (XBC)
      "XBC": [ "XBC", "XBC", 130, "XBC", "XBC"],
      // unidad de cuenta europea (XBD)
      "XBD": [ "XBD", "XBD", 130, "XBD", "XBD"],
      // dólar del Caribe Oriental
      "XCD": [ "XCD", "XCD", 2, "XCD", "$"],
      // derechos especiales de giro
      "XDR": [ "XDR", "XDR", 130, "XDR", "XDR"],
      // unidad de moneda europea
      "XEU": [ "XEU", "XEU", 130, "XEU", "XEU"],
      // franco oro francés
      "XFO": [ "XFO", "XFO", 130, "XFO", "XFO"],
      // franco UIC francés
      "XFU": [ "XFU", "XFU", 130, "XFU", "XFU"],
      // franco CFA de África Occidental
      "XOF": [ "XOF", "XOF", 0, "XOF", "CFA"],
      // paladio
      "XPD": [ "XPD", "XPD", 130, "XPD", "XPD"],
      // franco CFP
      "XPF": [ "XPF", "CFPF", 0, "CFPF", "FCFP"],
      // platino
      "XPT": [ "XPT", "XPT", 130, "XPT", "XPT"],
      // fondos RINET
      "XRE": [ "XRE", "XRE", 130, "XRE", "XRE"],
      // código reservado para pruebas
      "XTS": [ "XTS", "XTS", 130, "XTS", "XTS"],
      // moneda desconocida
      "XXX": [ "XXX", "¤", 130, "¤", "¤"],
      // dinar yemení
      "YDD": [ "YDD", "YDD", 130, "YDD", "YDD"],
      // rial yemení
      "YER": [ "YER", "YER", 0, "YER", "Rial"],
      // dinar fuerte yugoslavo
      "YUD": [ "YUD", "YUD", 130, "YUD", "YUD"],
      // super dinar yugoslavo
      "YUM": [ "YUM", "YUM", 130, "YUM", "YUM"],
      // dinar convertible yugoslavo
      "YUN": [ "YUN", "YUN", 130, "YUN", "YUN"],
      // rand sudafricano (financiero)
      "ZAL": [ "ZAL", "ZAL", 130, "ZAL", "ZAL"],
      // rand
      "ZAR": [ "ZAR", "ZAR", 2, "ZAR", "R"],
      // kwacha zambiano (1968–2012)
      "ZMK": [ "ZMK", "ZMK", 128, "ZMK", "ZWK"],
      // kwacha zambiano
      "ZMW": [ "ZMW", "ZMW", 2, "ZMW", "ZMW"],
      // nuevo zaire zaireño
      "ZRN": [ "ZRN", "ZRN", 130, "ZRN", "ZRN"],
      // zaire zaireño
      "ZRZ": [ "ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"],
      // dólar de Zimbabue
      "ZWD": [ "ZWD", "ZWD", 128, "ZWD", "ZWD"],
      // dólar zimbabuense
      "ZWL": [ "ZWL", "ZWL", 130, "ZWL", "ZWL"],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("ADP", "peseta andorrana");
    result.put("AED", "dírham de los Emiratos Árabes Unidos");
    result.put("AFA", "afgani (1927–2002)");
    result.put("AFN", "afgani");
    result.put("ALL", "lek");
    result.put("AMD", "dram");
    result.put("ANG", "florín de las Antillas Neerlandesas");
    result.put("AOA", "kuanza");
    result.put("AOK", "kwanza angoleño (1977–1990)");
    result.put("AON", "nuevo kwanza angoleño (1990–2000)");
    result.put("AOR", "kwanza reajustado angoleño (1995–1999)");
    result.put("ARA", "austral argentino");
    result.put("ARP", "peso argentino (1983–1985)");
    result.put("ARS", "peso argentino");
    result.put("ATS", "chelín austriaco");
    result.put("AUD", "dólar australiano");
    result.put("AWG", "florín arubeño");
    result.put("AZM", "manat azerí (1993–2006)");
    result.put("AZN", "manat azerbaiyano");
    result.put("BAD", "dinar bosnio");
    result.put("BAM", "marco convertible de Bosnia y Herzegovina");
    result.put("BBD", "dólar barbadense");
    result.put("BDT", "taka");
    result.put("BEC", "franco belga (convertible)");
    result.put("BEF", "franco belga");
    result.put("BEL", "franco belga (financiero)");
    result.put("BGL", "lev fuerte búlgaro");
    result.put("BGN", "lev búlgaro");
    result.put("BHD", "dinar bahreiní");
    result.put("BIF", "franco burundés");
    result.put("BMD", "dólar de Bermudas");
    result.put("BND", "dólar bruneano");
    result.put("BOB", "boliviano");
    result.put("BOP", "peso boliviano");
    result.put("BOV", "MVDOL boliviano");
    result.put("BRB", "nuevo cruceiro brasileño (1967–1986)");
    result.put("BRC", "cruzado brasileño");
    result.put("BRE", "cruceiro brasileño (1990–1993)");
    result.put("BRL", "real brasileño");
    result.put("BRN", "nuevo cruzado brasileño");
    result.put("BRR", "cruceiro brasileño");
    result.put("BSD", "dólar bahameño");
    result.put("BTN", "gultrum");
    result.put("BUK", "kyat birmano");
    result.put("BWP", "pula");
    result.put("BYB", "nuevo rublo bielorruso (1994–1999)");
    result.put("BYN", "rublo bielorruso");
    result.put("BYR", "rublo bielorruso (2000–2016)");
    result.put("BZD", "dólar beliceño");
    result.put("CAD", "dólar canadiense");
    result.put("CDF", "franco congoleño");
    result.put("CHE", "euro WIR");
    result.put("CHF", "franco suizo");
    result.put("CHW", "franco WIR");
    result.put("CLF", "unidad de fomento chilena");
    result.put("CLP", "peso chileno");
    result.put("CNH", "yuan chino (extracontinental)");
    result.put("CNY", "yuan");
    result.put("COP", "peso colombiano");
    result.put("COU", "unidad de valor real colombiana");
    result.put("CRC", "colón costarricense");
    result.put("CSD", "antiguo dinar serbio");
    result.put("CSK", "corona fuerte checoslovaca");
    result.put("CUC", "peso cubano convertible");
    result.put("CUP", "peso cubano");
    result.put("CVE", "escudo de Cabo Verde");
    result.put("CYP", "libra chipriota");
    result.put("CZK", "corona checa");
    result.put("DDM", "ostmark de Alemania del Este");
    result.put("DEM", "marco alemán");
    result.put("DJF", "franco yibutiano");
    result.put("DKK", "corona danesa");
    result.put("DOP", "peso dominicano");
    result.put("DZD", "dinar argelino");
    result.put("ECS", "sucre ecuatoriano");
    result.put("ECV", "unidad de valor constante (UVC) ecuatoriana");
    result.put("EEK", "corona estonia");
    result.put("EGP", "libra egipcia");
    result.put("ERN", "nakfa");
    result.put("ESA", "peseta española (cuenta A)");
    result.put("ESB", "peseta española (cuenta convertible)");
    result.put("ESP", "peseta española");
    result.put("ETB", "bir");
    result.put("EUR", "euro");
    result.put("FIM", "marco finlandés");
    result.put("FJD", "dólar fiyiano");
    result.put("FKP", "libra malvinense");
    result.put("FRF", "franco francés");
    result.put("GBP", "libra esterlina");
    result.put("GEK", "kupon larit georgiano");
    result.put("GEL", "lari");
    result.put("GHC", "cedi ghanés (1979–2007)");
    result.put("GHS", "cedi");
    result.put("GIP", "libra gibraltareña");
    result.put("GMD", "dalasi");
    result.put("GNF", "franco guineano");
    result.put("GNS", "syli guineano");
    result.put("GQE", "ekuele de Guinea Ecuatorial");
    result.put("GRD", "dracma griego");
    result.put("GTQ", "quetzal guatemalteco");
    result.put("GWE", "escudo de Guinea Portuguesa");
    result.put("GWP", "peso de Guinea-Bissáu");
    result.put("GYD", "dólar guyanés");
    result.put("HKD", "dólar hongkonés");
    result.put("HNL", "lempira hondureño");
    result.put("HRD", "dinar croata");
    result.put("HRK", "kuna");
    result.put("HTG", "gourde haitiano");
    result.put("HUF", "forinto húngaro");
    result.put("IDR", "rupia indonesia");
    result.put("IEP", "libra irlandesa");
    result.put("ILP", "libra israelí");
    result.put("ILS", "nuevo séquel israelí");
    result.put("INR", "rupia india");
    result.put("IQD", "dinar iraquí");
    result.put("IRR", "rial iraní");
    result.put("ISK", "corona islandesa");
    result.put("ITL", "lira italiana");
    result.put("JMD", "dólar jamaicano");
    result.put("JOD", "dinar jordano");
    result.put("JPY", "yen");
    result.put("KES", "chelín keniano");
    result.put("KGS", "som");
    result.put("KHR", "riel");
    result.put("KMF", "franco comorense");
    result.put("KPW", "won norcoreano");
    result.put("KRW", "won surcoreano");
    result.put("KWD", "dinar kuwaití");
    result.put("KYD", "dólar de las Islas Caimán");
    result.put("KZT", "tenge kazako");
    result.put("LAK", "kip");
    result.put("LBP", "libra libanesa");
    result.put("LKR", "rupia esrilanquesa");
    result.put("LRD", "dólar liberiano");
    result.put("LSL", "loti lesothense");
    result.put("LTL", "litas lituano");
    result.put("LTT", "talonas lituano");
    result.put("LUC", "franco convertible luxemburgués");
    result.put("LUF", "franco luxemburgués");
    result.put("LUL", "franco financiero luxemburgués");
    result.put("LVL", "lats letón");
    result.put("LVR", "rublo letón");
    result.put("LYD", "dinar libio");
    result.put("MAD", "dírham marroquí");
    result.put("MAF", "franco marroquí");
    result.put("MDL", "leu moldavo");
    result.put("MGA", "ariari");
    result.put("MGF", "franco malgache");
    result.put("MKD", "dinar macedonio");
    result.put("MLF", "franco malí");
    result.put("MMK", "kiat");
    result.put("MNT", "tugrik");
    result.put("MOP", "pataca de Macao");
    result.put("MRO", "uguiya (1973–2017)");
    result.put("MRU", "uguiya");
    result.put("MTL", "lira maltesa");
    result.put("MTP", "libra maltesa");
    result.put("MUR", "rupia mauriciana");
    result.put("MVR", "rufiya");
    result.put("MWK", "kwacha malauí");
    result.put("MXN", "peso mexicano");
    result.put("MXP", "peso de plata mexicano (1861–1992)");
    result.put("MXV", "unidad de inversión (UDI) mexicana");
    result.put("MYR", "ringit");
    result.put("MZE", "escudo mozambiqueño");
    result.put("MZM", "antiguo metical mozambiqueño");
    result.put("MZN", "metical");
    result.put("NAD", "dólar namibio");
    result.put("NGN", "naira");
    result.put("NIC", "córdoba nicaragüense (1988–1991)");
    result.put("NIO", "córdoba nicaragüense");
    result.put("NLG", "florín neerlandés");
    result.put("NOK", "corona noruega");
    result.put("NPR", "rupia nepalí");
    result.put("NZD", "dólar neozelandés");
    result.put("OMR", "rial omaní");
    result.put("PAB", "balboa panameño");
    result.put("PEI", "inti peruano");
    result.put("PEN", "sol peruano");
    result.put("PES", "sol peruano (1863–1965)");
    result.put("PGK", "kina");
    result.put("PHP", "peso filipino");
    result.put("PKR", "rupia pakistaní");
    result.put("PLN", "esloti");
    result.put("PLZ", "zloty polaco (1950–1995)");
    result.put("PTE", "escudo portugués");
    result.put("PYG", "guaraní paraguayo");
    result.put("QAR", "rial catarí");
    result.put("RHD", "dólar rodesiano");
    result.put("ROL", "antiguo leu rumano");
    result.put("RON", "leu rumano");
    result.put("RSD", "dinar serbio");
    result.put("RUB", "rublo ruso");
    result.put("RUR", "rublo ruso (1991–1998)");
    result.put("RWF", "franco ruandés");
    result.put("SAR", "rial saudí");
    result.put("SBD", "dólar salomonense");
    result.put("SCR", "rupia seychellense");
    result.put("SDD", "dinar sudanés");
    result.put("SDG", "libra sudanesa");
    result.put("SDP", "libra sudanesa antigua");
    result.put("SEK", "corona sueca");
    result.put("SGD", "dólar singapurense");
    result.put("SHP", "libra de Santa Elena");
    result.put("SIT", "tólar esloveno");
    result.put("SKK", "corona eslovaca");
    result.put("SLL", "leona");
    result.put("SOS", "chelín somalí");
    result.put("SRD", "dólar surinamés");
    result.put("SRG", "florín surinamés");
    result.put("SSP", "libra sursudanesa");
    result.put("STD", "dobra (1977–2017)");
    result.put("STN", "dobra");
    result.put("SUR", "rublo soviético");
    result.put("SVC", "colón salvadoreño");
    result.put("SYP", "libra siria");
    result.put("SZL", "lilangeni");
    result.put("THB", "bat");
    result.put("TJR", "rublo tayiko");
    result.put("TJS", "somoni tayiko");
    result.put("TMM", "manat turcomano (1993–2009)");
    result.put("TMT", "manat turcomano");
    result.put("TND", "dinar tunecino");
    result.put("TOP", "paanga");
    result.put("TPE", "escudo timorense");
    result.put("TRL", "lira turca (1922–2005)");
    result.put("TRY", "lira turca");
    result.put("TTD", "dólar de Trinidad y Tobago");
    result.put("TWD", "nuevo dólar taiwanés");
    result.put("TZS", "chelín tanzano");
    result.put("UAH", "grivna");
    result.put("UAK", "karbovanet ucraniano");
    result.put("UGS", "chelín ugandés (1966–1987)");
    result.put("UGX", "chelín ugandés");
    result.put("USD", "dólar estadounidense");
    result.put("USN", "dólar estadounidense (día siguiente)");
    result.put("USS", "dólar estadounidense (mismo día)");
    result.put("UYI", "peso uruguayo en unidades indexadas");
    result.put("UYP", "peso uruguayo (1975–1993)");
    result.put("UYU", "peso uruguayo");
    result.put("UYW", "unidad previsional uruguayo");
    result.put("UZS", "sum");
    result.put("VEB", "bolívar venezolano (1871–2008)");
    result.put("VEF", "bolívar venezolano (2008–2018)");
    result.put("VES", "bolívar venezolano");
    result.put("VND", "dong");
    result.put("VUV", "vatu");
    result.put("WST", "tala");
    result.put("XAF", "franco CFA de África Central");
    result.put("XAG", "plata");
    result.put("XAU", "oro");
    result.put("XBA", "unidad compuesta europea");
    result.put("XBB", "unidad monetaria europea");
    result.put("XBC", "unidad de cuenta europea (XBC)");
    result.put("XBD", "unidad de cuenta europea (XBD)");
    result.put("XCD", "dólar del Caribe Oriental");
    result.put("XDR", "derechos especiales de giro");
    result.put("XEU", "unidad de moneda europea");
    result.put("XFO", "franco oro francés");
    result.put("XFU", "franco UIC francés");
    result.put("XOF", "franco CFA de África Occidental");
    result.put("XPD", "paladio");
    result.put("XPF", "franco CFP");
    result.put("XPT", "platino");
    result.put("XRE", "fondos RINET");
    result.put("XTS", "código reservado para pruebas");
    result.put("XXX", "moneda desconocida");
    result.put("YDD", "dinar yemení");
    result.put("YER", "rial yemení");
    result.put("YUD", "dinar fuerte yugoslavo");
    result.put("YUM", "super dinar yugoslavo");
    result.put("YUN", "dinar convertible yugoslavo");
    result.put("ZAL", "rand sudafricano (financiero)");
    result.put("ZAR", "rand");
    result.put("ZMK", "kwacha zambiano (1968–2012)");
    result.put("ZMW", "kwacha zambiano");
    result.put("ZRN", "nuevo zaire zaireño");
    result.put("ZRZ", "zaire zaireño");
    result.put("ZWD", "dólar de Zimbabue");
    result.put("ZWL", "dólar zimbabuense");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "ADP": "peseta andorrana",
      "AED": "dírham de los Emiratos Árabes Unidos",
      "AFA": "afgani (1927–2002)",
      "AFN": "afgani",
      "ALL": "lek",
      "AMD": "dram",
      "ANG": "florín de las Antillas Neerlandesas",
      "AOA": "kuanza",
      "AOK": "kwanza angoleño (1977–1990)",
      "AON": "nuevo kwanza angoleño (1990–2000)",
      "AOR": "kwanza reajustado angoleño (1995–1999)",
      "ARA": "austral argentino",
      "ARP": "peso argentino (1983–1985)",
      "ARS": "peso argentino",
      "ATS": "chelín austriaco",
      "AUD": "dólar australiano",
      "AWG": "florín arubeño",
      "AZM": "manat azerí (1993–2006)",
      "AZN": "manat azerbaiyano",
      "BAD": "dinar bosnio",
      "BAM": "marco convertible de Bosnia y Herzegovina",
      "BBD": "dólar barbadense",
      "BDT": "taka",
      "BEC": "franco belga (convertible)",
      "BEF": "franco belga",
      "BEL": "franco belga (financiero)",
      "BGL": "lev fuerte búlgaro",
      "BGN": "lev búlgaro",
      "BHD": "dinar bahreiní",
      "BIF": "franco burundés",
      "BMD": "dólar de Bermudas",
      "BND": "dólar bruneano",
      "BOB": "boliviano",
      "BOP": "peso boliviano",
      "BOV": "MVDOL boliviano",
      "BRB": "nuevo cruceiro brasileño (1967–1986)",
      "BRC": "cruzado brasileño",
      "BRE": "cruceiro brasileño (1990–1993)",
      "BRL": "real brasileño",
      "BRN": "nuevo cruzado brasileño",
      "BRR": "cruceiro brasileño",
      "BSD": "dólar bahameño",
      "BTN": "gultrum",
      "BUK": "kyat birmano",
      "BWP": "pula",
      "BYB": "nuevo rublo bielorruso (1994–1999)",
      "BYN": "rublo bielorruso",
      "BYR": "rublo bielorruso (2000–2016)",
      "BZD": "dólar beliceño",
      "CAD": "dólar canadiense",
      "CDF": "franco congoleño",
      "CHE": "euro WIR",
      "CHF": "franco suizo",
      "CHW": "franco WIR",
      "CLF": "unidad de fomento chilena",
      "CLP": "peso chileno",
      "CNH": "yuan chino (extracontinental)",
      "CNY": "yuan",
      "COP": "peso colombiano",
      "COU": "unidad de valor real colombiana",
      "CRC": "colón costarricense",
      "CSD": "antiguo dinar serbio",
      "CSK": "corona fuerte checoslovaca",
      "CUC": "peso cubano convertible",
      "CUP": "peso cubano",
      "CVE": "escudo de Cabo Verde",
      "CYP": "libra chipriota",
      "CZK": "corona checa",
      "DDM": "ostmark de Alemania del Este",
      "DEM": "marco alemán",
      "DJF": "franco yibutiano",
      "DKK": "corona danesa",
      "DOP": "peso dominicano",
      "DZD": "dinar argelino",
      "ECS": "sucre ecuatoriano",
      "ECV": "unidad de valor constante (UVC) ecuatoriana",
      "EEK": "corona estonia",
      "EGP": "libra egipcia",
      "ERN": "nakfa",
      "ESA": "peseta española (cuenta A)",
      "ESB": "peseta española (cuenta convertible)",
      "ESP": "peseta española",
      "ETB": "bir",
      "EUR": "euro",
      "FIM": "marco finlandés",
      "FJD": "dólar fiyiano",
      "FKP": "libra malvinense",
      "FRF": "franco francés",
      "GBP": "libra esterlina",
      "GEK": "kupon larit georgiano",
      "GEL": "lari",
      "GHC": "cedi ghanés (1979–2007)",
      "GHS": "cedi",
      "GIP": "libra gibraltareña",
      "GMD": "dalasi",
      "GNF": "franco guineano",
      "GNS": "syli guineano",
      "GQE": "ekuele de Guinea Ecuatorial",
      "GRD": "dracma griego",
      "GTQ": "quetzal guatemalteco",
      "GWE": "escudo de Guinea Portuguesa",
      "GWP": "peso de Guinea-Bissáu",
      "GYD": "dólar guyanés",
      "HKD": "dólar hongkonés",
      "HNL": "lempira hondureño",
      "HRD": "dinar croata",
      "HRK": "kuna",
      "HTG": "gourde haitiano",
      "HUF": "forinto húngaro",
      "IDR": "rupia indonesia",
      "IEP": "libra irlandesa",
      "ILP": "libra israelí",
      "ILS": "nuevo séquel israelí",
      "INR": "rupia india",
      "IQD": "dinar iraquí",
      "IRR": "rial iraní",
      "ISK": "corona islandesa",
      "ITL": "lira italiana",
      "JMD": "dólar jamaicano",
      "JOD": "dinar jordano",
      "JPY": "yen",
      "KES": "chelín keniano",
      "KGS": "som",
      "KHR": "riel",
      "KMF": "franco comorense",
      "KPW": "won norcoreano",
      "KRW": "won surcoreano",
      "KWD": "dinar kuwaití",
      "KYD": "dólar de las Islas Caimán",
      "KZT": "tenge kazako",
      "LAK": "kip",
      "LBP": "libra libanesa",
      "LKR": "rupia esrilanquesa",
      "LRD": "dólar liberiano",
      "LSL": "loti lesothense",
      "LTL": "litas lituano",
      "LTT": "talonas lituano",
      "LUC": "franco convertible luxemburgués",
      "LUF": "franco luxemburgués",
      "LUL": "franco financiero luxemburgués",
      "LVL": "lats letón",
      "LVR": "rublo letón",
      "LYD": "dinar libio",
      "MAD": "dírham marroquí",
      "MAF": "franco marroquí",
      "MDL": "leu moldavo",
      "MGA": "ariari",
      "MGF": "franco malgache",
      "MKD": "dinar macedonio",
      "MLF": "franco malí",
      "MMK": "kiat",
      "MNT": "tugrik",
      "MOP": "pataca de Macao",
      "MRO": "uguiya (1973–2017)",
      "MRU": "uguiya",
      "MTL": "lira maltesa",
      "MTP": "libra maltesa",
      "MUR": "rupia mauriciana",
      "MVR": "rufiya",
      "MWK": "kwacha malauí",
      "MXN": "peso mexicano",
      "MXP": "peso de plata mexicano (1861–1992)",
      "MXV": "unidad de inversión (UDI) mexicana",
      "MYR": "ringit",
      "MZE": "escudo mozambiqueño",
      "MZM": "antiguo metical mozambiqueño",
      "MZN": "metical",
      "NAD": "dólar namibio",
      "NGN": "naira",
      "NIC": "córdoba nicaragüense (1988–1991)",
      "NIO": "córdoba nicaragüense",
      "NLG": "florín neerlandés",
      "NOK": "corona noruega",
      "NPR": "rupia nepalí",
      "NZD": "dólar neozelandés",
      "OMR": "rial omaní",
      "PAB": "balboa panameño",
      "PEI": "inti peruano",
      "PEN": "sol peruano",
      "PES": "sol peruano (1863–1965)",
      "PGK": "kina",
      "PHP": "peso filipino",
      "PKR": "rupia pakistaní",
      "PLN": "esloti",
      "PLZ": "zloty polaco (1950–1995)",
      "PTE": "escudo portugués",
      "PYG": "guaraní paraguayo",
      "QAR": "rial catarí",
      "RHD": "dólar rodesiano",
      "ROL": "antiguo leu rumano",
      "RON": "leu rumano",
      "RSD": "dinar serbio",
      "RUB": "rublo ruso",
      "RUR": "rublo ruso (1991–1998)",
      "RWF": "franco ruandés",
      "SAR": "rial saudí",
      "SBD": "dólar salomonense",
      "SCR": "rupia seychellense",
      "SDD": "dinar sudanés",
      "SDG": "libra sudanesa",
      "SDP": "libra sudanesa antigua",
      "SEK": "corona sueca",
      "SGD": "dólar singapurense",
      "SHP": "libra de Santa Elena",
      "SIT": "tólar esloveno",
      "SKK": "corona eslovaca",
      "SLL": "leona",
      "SOS": "chelín somalí",
      "SRD": "dólar surinamés",
      "SRG": "florín surinamés",
      "SSP": "libra sursudanesa",
      "STD": "dobra (1977–2017)",
      "STN": "dobra",
      "SUR": "rublo soviético",
      "SVC": "colón salvadoreño",
      "SYP": "libra siria",
      "SZL": "lilangeni",
      "THB": "bat",
      "TJR": "rublo tayiko",
      "TJS": "somoni tayiko",
      "TMM": "manat turcomano (1993–2009)",
      "TMT": "manat turcomano",
      "TND": "dinar tunecino",
      "TOP": "paanga",
      "TPE": "escudo timorense",
      "TRL": "lira turca (1922–2005)",
      "TRY": "lira turca",
      "TTD": "dólar de Trinidad y Tobago",
      "TWD": "nuevo dólar taiwanés",
      "TZS": "chelín tanzano",
      "UAH": "grivna",
      "UAK": "karbovanet ucraniano",
      "UGS": "chelín ugandés (1966–1987)",
      "UGX": "chelín ugandés",
      "USD": "dólar estadounidense",
      "USN": "dólar estadounidense (día siguiente)",
      "USS": "dólar estadounidense (mismo día)",
      "UYI": "peso uruguayo en unidades indexadas",
      "UYP": "peso uruguayo (1975–1993)",
      "UYU": "peso uruguayo",
      "UYW": "unidad previsional uruguayo",
      "UZS": "sum",
      "VEB": "bolívar venezolano (1871–2008)",
      "VEF": "bolívar venezolano (2008–2018)",
      "VES": "bolívar venezolano",
      "VND": "dong",
      "VUV": "vatu",
      "WST": "tala",
      "XAF": "franco CFA de África Central",
      "XAG": "plata",
      "XAU": "oro",
      "XBA": "unidad compuesta europea",
      "XBB": "unidad monetaria europea",
      "XBC": "unidad de cuenta europea (XBC)",
      "XBD": "unidad de cuenta europea (XBD)",
      "XCD": "dólar del Caribe Oriental",
      "XDR": "derechos especiales de giro",
      "XEU": "unidad de moneda europea",
      "XFO": "franco oro francés",
      "XFU": "franco UIC francés",
      "XOF": "franco CFA de África Occidental",
      "XPD": "paladio",
      "XPF": "franco CFP",
      "XPT": "platino",
      "XRE": "fondos RINET",
      "XTS": "código reservado para pruebas",
      "XXX": "moneda desconocida",
      "YDD": "dinar yemení",
      "YER": "rial yemení",
      "YUD": "dinar fuerte yugoslavo",
      "YUM": "super dinar yugoslavo",
      "YUN": "dinar convertible yugoslavo",
      "ZAL": "rand sudafricano (financiero)",
      "ZAR": "rand",
      "ZMK": "kwacha zambiano (1968–2012)",
      "ZMW": "kwacha zambiano",
      "ZRN": "nuevo zaire zaireño",
      "ZRZ": "zaire zaireño",
      "ZWD": "dólar de Zimbabue",
      "ZWL": "dólar zimbabuense",
    };
  }-*/;
}
