package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_pt extends com.google.gwt.i18n.client.CurrencyList_ {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("BRL", "R$", 2, "R$", "R$");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "BRL", "R$", 2, "R$", "R$"];
  }-*/;
  
  @Override
  protected HashMap<String, CurrencyData> loadCurrencyMapJava() {
    HashMap<String, CurrencyData> result = super.loadCurrencyMapJava();
    // Peseta de Andorra
    result.put("ADP", new CurrencyDataImpl("ADP", "ADP", 128, "ADP", "ADP"));
    // Dirham dos Emirados Árabes Unidos
    result.put("AED", new CurrencyDataImpl("AED", "DH", 2, "DH", "dh"));
    // Afegane (1927–2002)
    result.put("AFA", new CurrencyDataImpl("AFA", "AFA", 130, "AFA", "AFA"));
    // Afegane afegão
    result.put("AFN", new CurrencyDataImpl("AFN", "AFN", 0, "AFN", "Af."));
    // Lek Albanês (1946–1965)
    result.put("ALK", new CurrencyDataImpl("ALK", "ALK", 130, "ALK", "ALK"));
    // Lek albanês
    result.put("ALL", new CurrencyDataImpl("ALL", "ALL", 0, "ALL", "Lek"));
    // Dram armênio
    result.put("AMD", new CurrencyDataImpl("AMD", "AMD", 2, "AMD", "Dram"));
    // Florim das Antilhas Holandesas
    result.put("ANG", new CurrencyDataImpl("ANG", "ANG", 2, "ANG", "ANG"));
    // Kwanza angolano
    result.put("AOA", new CurrencyDataImpl("AOA", "AOA", 2, "AOA", "Kz"));
    // Cuanza angolano (1977–1990)
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130, "AOK", "AOK"));
    // Novo cuanza angolano (1990–2000)
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130, "AON", "AON"));
    // Cuanza angolano reajustado (1995–1999)
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130, "AOR", "AOR"));
    // Austral argentino
    result.put("ARA", new CurrencyDataImpl("ARA", "ARA", 130, "ARA", "ARA"));
    // Peso lei argentino (1970–1983)
    result.put("ARL", new CurrencyDataImpl("ARL", "ARL", 130, "ARL", "ARL"));
    // Peso argentino (1881–1970)
    result.put("ARM", new CurrencyDataImpl("ARM", "ARM", 130, "ARM", "ARM"));
    // Peso argentino (1983–1985)
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130, "ARP", "ARP"));
    // Peso argentino
    result.put("ARS", new CurrencyDataImpl("ARS", "AR$", 2, "AR$", "$"));
    // Xelim austríaco
    result.put("ATS", new CurrencyDataImpl("ATS", "ATS", 130, "ATS", "ATS"));
    // Dólar australiano
    result.put("AUD", new CurrencyDataImpl("AUD", "AU$", 2, "AU$", "$"));
    // Florim arubano
    result.put("AWG", new CurrencyDataImpl("AWG", "AWG", 2, "AWG", "Afl."));
    // Manat azerbaijano (1993–2006)
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130, "AZM", "AZM"));
    // Manat azeri
    result.put("AZN", new CurrencyDataImpl("AZN", "AZN", 2, "AZN", "man."));
    // Dinar da Bósnia-Herzegovina (1992–1994)
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130, "BAD", "BAD"));
    // Marco conversível da Bósnia e Herzegovina
    result.put("BAM", new CurrencyDataImpl("BAM", "BAM", 2, "BAM", "KM"));
    // Novo dinar da Bósnia-Herzegovina (1994–1997)
    result.put("BAN", new CurrencyDataImpl("BAN", "BAN", 130, "BAN", "BAN"));
    // Dólar barbadense
    result.put("BBD", new CurrencyDataImpl("BBD", "BBD", 2, "BBD", "$"));
    // Taka bengali
    result.put("BDT", new CurrencyDataImpl("BDT", "Tk", 2, "Tk", "৳"));
    // Franco belga (conversível)
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 130, "BEC", "BEC"));
    // Franco belga
    result.put("BEF", new CurrencyDataImpl("BEF", "BEF", 130, "BEF", "BEF"));
    // Franco belga (financeiro)
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 130, "BEL", "BEL"));
    // Lev forte búlgaro
    result.put("BGL", new CurrencyDataImpl("BGL", "BGL", 130, "BGL", "BGL"));
    // Lev socialista búlgaro
    result.put("BGM", new CurrencyDataImpl("BGM", "BGM", 130, "BGM", "BGM"));
    // Lev búlgaro
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2, "BGN", "lev"));
    // Lev búlgaro (1879–1952)
    result.put("BGO", new CurrencyDataImpl("BGO", "BGO", 130, "BGO", "BGO"));
    // Dinar bareinita
    result.put("BHD", new CurrencyDataImpl("BHD", "BHD", 3, "BHD", "din"));
    // Franco burundiano
    result.put("BIF", new CurrencyDataImpl("BIF", "BIF", 0, "BIF", "FBu"));
    // Dólar bermudense
    result.put("BMD", new CurrencyDataImpl("BMD", "BMD", 2, "BMD", "$"));
    // Dólar bruneano
    result.put("BND", new CurrencyDataImpl("BND", "BND", 2, "BND", "$"));
    // Boliviano da Bolívia
    result.put("BOB", new CurrencyDataImpl("BOB", "BOB", 2, "BOB", "Bs"));
    // Boliviano (1863–1963)
    result.put("BOL", new CurrencyDataImpl("BOL", "BOL", 130, "BOL", "BOL"));
    // Peso boliviano
    result.put("BOP", new CurrencyDataImpl("BOP", "BOP", 130, "BOP", "BOP"));
    // Mvdol boliviano
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 130, "BOV", "BOV"));
    // Cruzeiro novo brasileiro (1967–1986)
    result.put("BRB", new CurrencyDataImpl("BRB", "BRB", 130, "BRB", "BRB"));
    // Cruzado brasileiro (1986–1989)
    result.put("BRC", new CurrencyDataImpl("BRC", "BRC", 130, "BRC", "BRC"));
    // Cruzeiro brasileiro (1990–1993)
    result.put("BRE", new CurrencyDataImpl("BRE", "BRE", 130, "BRE", "BRE"));
    // Real brasileiro
    result.put("BRL", new CurrencyDataImpl("BRL", "R$", 2, "R$", "R$"));
    // Cruzado novo brasileiro (1989–1990)
    result.put("BRN", new CurrencyDataImpl("BRN", "BRN", 130, "BRN", "BRN"));
    // Cruzeiro brasileiro (1993–1994)
    result.put("BRR", new CurrencyDataImpl("BRR", "BRR", 130, "BRR", "BRR"));
    // Cruzeiro brasileiro (1942–1967)
    result.put("BRZ", new CurrencyDataImpl("BRZ", "BRZ", 130, "BRZ", "BRZ"));
    // Dólar bahamense
    result.put("BSD", new CurrencyDataImpl("BSD", "BSD", 2, "BSD", "$"));
    // Ngultrum butanês
    result.put("BTN", new CurrencyDataImpl("BTN", "BTN", 2, "BTN", "Nu."));
    // Kyat birmanês
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130, "BUK", "BUK"));
    // Pula botsuanesa
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2, "BWP", "P"));
    // Rublo novo bielo-russo (1994–1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130, "BYB", "BYB"));
    // Rublo bielorrusso
    result.put("BYN", new CurrencyDataImpl("BYN", "BYN", 2, "BYN", "BYN"));
    // Rublo bielorrusso (2000–2016)
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 128, "BYR", "BYR"));
    // Dólar belizenho
    result.put("BZD", new CurrencyDataImpl("BZD", "BZD", 2, "BZD", "$"));
    // Dólar canadense
    result.put("CAD", new CurrencyDataImpl("CAD", "CA$", 2, "C$", "$"));
    // Franco congolês
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2, "CDF", "FrCD"));
    // Euro WIR
    result.put("CHE", new CurrencyDataImpl("CHE", "CHE", 130, "CHE", "CHE"));
    // Franco suíço
    result.put("CHF", new CurrencyDataImpl("CHF", "CHF", 2, "CHF", "CHF"));
    // Franco WIR
    result.put("CHW", new CurrencyDataImpl("CHW", "CHW", 130, "CHW", "CHW"));
    // Escudo chileno
    result.put("CLE", new CurrencyDataImpl("CLE", "CLE", 130, "CLE", "CLE"));
    // Unidades de Fomento chilenas
    result.put("CLF", new CurrencyDataImpl("CLF", "CLF", 132, "CLF", "CLF"));
    // Peso chileno
    result.put("CLP", new CurrencyDataImpl("CLP", "CL$", 0, "CL$", "$"));
    // Renminbi chinês (offshore)
    result.put("CNH", new CurrencyDataImpl("CNH", "CNH", 130, "CNH", "CNH"));
    // Dólar do Banco Popular da China
    result.put("CNX", new CurrencyDataImpl("CNX", "CNX", 130, "CNX", "CNX"));
    // Renminbi chinês
    result.put("CNY", new CurrencyDataImpl("CNY", "CN¥", 2, "RMB¥", "¥"));
    // Peso colombiano
    result.put("COP", new CurrencyDataImpl("COP", "COL$", 2, "COL$", "$"));
    // Unidade de Valor Real
    result.put("COU", new CurrencyDataImpl("COU", "COU", 130, "COU", "COU"));
    // Colón costarriquenho
    result.put("CRC", new CurrencyDataImpl("CRC", "CR₡", 2, "CR₡", "₡"));
    // Dinar sérvio (2002–2006)
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130, "CSD", "CSD"));
    // Coroa Forte checoslovaca
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130, "CSK", "CSK"));
    // Peso cubano conversível
    result.put("CUC", new CurrencyDataImpl("CUC", "CUC", 2, "CUC", "$"));
    // Peso cubano
    result.put("CUP", new CurrencyDataImpl("CUP", "$MN", 2, "$MN", "$"));
    // Escudo cabo-verdiano
    result.put("CVE", new CurrencyDataImpl("CVE", "CVE", 2, "CVE", "CVE"));
    // Libra cipriota
    result.put("CYP", new CurrencyDataImpl("CYP", "CYP", 130, "CYP", "CYP"));
    // Coroa tcheca
    result.put("CZK", new CurrencyDataImpl("CZK", "Kč", 2, "Kč", "Kč"));
    // Ostmark da Alemanha Oriental
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130, "DDM", "DDM"));
    // Marco alemão
    result.put("DEM", new CurrencyDataImpl("DEM", "DEM", 130, "DEM", "DEM"));
    // Franco djiboutiano
    result.put("DJF", new CurrencyDataImpl("DJF", "Fdj", 0, "Fdj", "Fdj"));
    // Coroa dinamarquesa
    result.put("DKK", new CurrencyDataImpl("DKK", "kr", 2, "kr", "kr"));
    // Peso dominicano
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$", "$"));
    // Dinar argelino
    result.put("DZD", new CurrencyDataImpl("DZD", "DZD", 2, "DZD", "din"));
    // Sucre equatoriano
    result.put("ECS", new CurrencyDataImpl("ECS", "ECS", 130, "ECS", "ECS"));
    // Unidade de Valor Constante (UVC) do Equador
    result.put("ECV", new CurrencyDataImpl("ECV", "ECV", 130, "ECV", "ECV"));
    // Coroa estoniana
    result.put("EEK", new CurrencyDataImpl("EEK", "EEK", 130, "EEK", "EEK"));
    // Libra egípcia
    result.put("EGP", new CurrencyDataImpl("EGP", "LE", 2, "LE", "E£"));
    // Nakfa da Eritreia
    result.put("ERN", new CurrencyDataImpl("ERN", "ERN", 2, "ERN", "Nfk"));
    // Peseta espanhola (conta A)
    result.put("ESA", new CurrencyDataImpl("ESA", "ESA", 130, "ESA", "ESA"));
    // Peseta espanhola (conta conversível)
    result.put("ESB", new CurrencyDataImpl("ESB", "ESB", 130, "ESB", "ESB"));
    // Peseta espanhola
    result.put("ESP", new CurrencyDataImpl("ESP", "ESP", 128, "ESP", "ESP"));
    // Birr etíope
    result.put("ETB", new CurrencyDataImpl("ETB", "ETB", 2, "ETB", "Birr"));
    // Euro
    result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€", "€"));
    // Marca finlandesa
    result.put("FIM", new CurrencyDataImpl("FIM", "FIM", 130, "FIM", "FIM"));
    // Dólar fijiano
    result.put("FJD", new CurrencyDataImpl("FJD", "FJD", 2, "FJD", "$"));
    // Libra malvinense
    result.put("FKP", new CurrencyDataImpl("FKP", "FKP", 2, "FKP", "£"));
    // Franco francês
    result.put("FRF", new CurrencyDataImpl("FRF", "FRF", 130, "FRF", "FRF"));
    // Libra esterlina
    result.put("GBP", new CurrencyDataImpl("GBP", "£", 2, "GB£", "£"));
    // Cupom Lari georgiano
    result.put("GEK", new CurrencyDataImpl("GEK", "GEK", 130, "GEK", "GEK"));
    // Lari georgiano
    result.put("GEL", new CurrencyDataImpl("GEL", "₾", 2, "₾", "GEL"));
    // Cedi de Gana (1979–2007)
    result.put("GHC", new CurrencyDataImpl("GHC", "GHC", 130, "GHC", "GHC"));
    // Cedi ganês
    result.put("GHS", new CurrencyDataImpl("GHS", "GHS", 2, "GHS", "GHS"));
    // Libra de Gibraltar
    result.put("GIP", new CurrencyDataImpl("GIP", "GIP", 2, "GIP", "£"));
    // Dalasi gambiano
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2, "GMD", "GMD"));
    // Franco guineano
    result.put("GNF", new CurrencyDataImpl("GNF", "GNF", 0, "GNF", "FG"));
    // Syli da Guiné
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130, "GNS", "GNS"));
    // Ekwele da Guiné Equatorial
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130, "GQE", "GQE"));
    // Dracma grego
    result.put("GRD", new CurrencyDataImpl("GRD", "GRD", 130, "GRD", "GRD"));
    // Quetzal guatemalteco
    result.put("GTQ", new CurrencyDataImpl("GTQ", "GTQ", 2, "GTQ", "Q"));
    // Escudo da Guiné Portuguesa
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130, "GWE", "GWE"));
    // Peso da Guiné-Bissau
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 130, "GWP", "GWP"));
    // Dólar guianense
    result.put("GYD", new CurrencyDataImpl("GYD", "GYD", 2, "GYD", "$"));
    // Dólar de Hong Kong
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$", "$"));
    // Lempira hondurenha
    result.put("HNL", new CurrencyDataImpl("HNL", "L", 2, "L", "L"));
    // Dinar croata
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130, "HRD", "HRD"));
    // Kuna croata
    result.put("HRK", new CurrencyDataImpl("HRK", "HRK", 2, "HRK", "kn"));
    // Gourde haitiano
    result.put("HTG", new CurrencyDataImpl("HTG", "HTG", 2, "HTG", "HTG"));
    // Florim húngaro
    result.put("HUF", new CurrencyDataImpl("HUF", "HUF", 2, "HUF", "Ft"));
    // Rupia indonésia
    result.put("IDR", new CurrencyDataImpl("IDR", "IDR", 2, "IDR", "Rp"));
    // Libra irlandesa
    result.put("IEP", new CurrencyDataImpl("IEP", "IEP", 130, "IEP", "IEP"));
    // Libra israelita
    result.put("ILP", new CurrencyDataImpl("ILP", "ILP", 130, "ILP", "ILP"));
    // Sheqel antigo israelita
    result.put("ILR", new CurrencyDataImpl("ILR", "ILR", 130, "ILR", "ILR"));
    // Novo shekel israelense
    result.put("ILS", new CurrencyDataImpl("ILS", "₪", 2, "IL₪", "₪"));
    // Rupia indiana
    result.put("INR", new CurrencyDataImpl("INR", "₹", 2, "Rs", "₹"));
    // Dinar iraquiano
    result.put("IQD", new CurrencyDataImpl("IQD", "IQD", 0, "IQD", "din"));
    // Rial iraniano
    result.put("IRR", new CurrencyDataImpl("IRR", "IRR", 0, "IRR", "Rial"));
    // Coroa antiga islandesa
    result.put("ISJ", new CurrencyDataImpl("ISJ", "ISJ", 130, "ISJ", "ISJ"));
    // Coroa islandesa
    result.put("ISK", new CurrencyDataImpl("ISK", "kr", 0, "kr", "kr"));
    // Lira italiana
    result.put("ITL", new CurrencyDataImpl("ITL", "ITL", 128, "ITL", "ITL"));
    // Dólar jamaicano
    result.put("JMD", new CurrencyDataImpl("JMD", "JA$", 2, "JA$", "$"));
    // Dinar jordaniano
    result.put("JOD", new CurrencyDataImpl("JOD", "JOD", 3, "JOD", "din"));
    // Iene japonês
    result.put("JPY", new CurrencyDataImpl("JPY", "JP¥", 0, "JP¥", "¥"));
    // Xelim queniano
    result.put("KES", new CurrencyDataImpl("KES", "Ksh", 2, "Ksh", "Ksh"));
    // Som quirguiz
    result.put("KGS", new CurrencyDataImpl("KGS", "KGS", 2, "KGS", "KGS"));
    // Riel cambojano
    result.put("KHR", new CurrencyDataImpl("KHR", "KHR", 2, "KHR", "Riel"));
    // Franco comoriano
    result.put("KMF", new CurrencyDataImpl("KMF", "KMF", 0, "KMF", "CF"));
    // Won norte-coreano
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 0, "KPW", "₩"));
    // Hwan da Coreia do Sul (1953–1962)
    result.put("KRH", new CurrencyDataImpl("KRH", "KRH", 130, "KRH", "KRH"));
    // Won da Coreia do Sul (1945–1953)
    result.put("KRO", new CurrencyDataImpl("KRO", "KRO", 130, "KRO", "KRO"));
    // Won sul-coreano
    result.put("KRW", new CurrencyDataImpl("KRW", "₩", 0, "KR₩", "₩"));
    // Dinar kuwaitiano
    result.put("KWD", new CurrencyDataImpl("KWD", "KWD", 3, "KWD", "din"));
    // Dólar das Ilhas Cayman
    result.put("KYD", new CurrencyDataImpl("KYD", "KYD", 2, "KYD", "$"));
    // Tenge cazaque
    result.put("KZT", new CurrencyDataImpl("KZT", "KZT", 2, "KZT", "₸"));
    // Kip laosiano
    result.put("LAK", new CurrencyDataImpl("LAK", "LAK", 0, "LAK", "₭"));
    // Libra libanesa
    result.put("LBP", new CurrencyDataImpl("LBP", "LBP", 0, "LBP", "L£"));
    // Rupia do Sri Lanka
    result.put("LKR", new CurrencyDataImpl("LKR", "SLRs", 2, "SLRs", "Rs"));
    // Dólar liberiano
    result.put("LRD", new CurrencyDataImpl("LRD", "LRD", 2, "LRD", "$"));
    // Loti do Lesoto
    result.put("LSL", new CurrencyDataImpl("LSL", "LSL", 2, "LSL", "LSL"));
    // Litas lituano
    result.put("LTL", new CurrencyDataImpl("LTL", "LTL", 130, "LTL", "Lt"));
    // Talonas lituano
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130, "LTT", "LTT"));
    // Franco conversível de Luxemburgo
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 130, "LUC", "LUC"));
    // Franco luxemburguês
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128, "LUF", "LUF"));
    // Franco financeiro de Luxemburgo
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 130, "LUL", "LUL"));
    // Lats letão
    result.put("LVL", new CurrencyDataImpl("LVL", "LVL", 130, "LVL", "Ls"));
    // Rublo letão
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130, "LVR", "LVR"));
    // Dinar líbio
    result.put("LYD", new CurrencyDataImpl("LYD", "LYD", 3, "LYD", "din"));
    // Dirham marroquino
    result.put("MAD", new CurrencyDataImpl("MAD", "MAD", 2, "MAD", "MAD"));
    // Franco marroquino
    result.put("MAF", new CurrencyDataImpl("MAF", "MAF", 130, "MAF", "MAF"));
    // Franco monegasco
    result.put("MCF", new CurrencyDataImpl("MCF", "MCF", 130, "MCF", "MCF"));
    // Cupon moldávio
    result.put("MDC", new CurrencyDataImpl("MDC", "MDC", 130, "MDC", "MDC"));
    // Leu moldávio
    result.put("MDL", new CurrencyDataImpl("MDL", "MDL", 2, "MDL", "MDL"));
    // Ariary malgaxe
    result.put("MGA", new CurrencyDataImpl("MGA", "MGA", 0, "MGA", "Ar"));
    // Franco de Madagascar
    result.put("MGF", new CurrencyDataImpl("MGF", "MGF", 128, "MGF", "MGF"));
    // Dinar macedônio
    result.put("MKD", new CurrencyDataImpl("MKD", "MKD", 2, "MKD", "din"));
    // Dinar macedônio (1992–1993)
    result.put("MKN", new CurrencyDataImpl("MKN", "MKN", 130, "MKN", "MKN"));
    // Franco de Mali
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130, "MLF", "MLF"));
    // Quiat de Myanmar
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 0, "MMK", "K"));
    // Tugrik mongol
    result.put("MNT", new CurrencyDataImpl("MNT", "MN₮", 2, "MN₮", "₮"));
    // Pataca de Macau
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP", 2, "MOP", "MOP"));
    // Ouguiya mauritana (1973–2017)
    result.put("MRO", new CurrencyDataImpl("MRO", "MRO", 128, "MRO", "MRO"));
    // Ouguiya mauritana
    result.put("MRU", new CurrencyDataImpl("MRU", "MRU", 2, "MRU", "MRU"));
    // Lira maltesa
    result.put("MTL", new CurrencyDataImpl("MTL", "MTL", 130, "MTL", "MTL"));
    // Libra maltesa
    result.put("MTP", new CurrencyDataImpl("MTP", "MTP", 130, "MTP", "MTP"));
    // Rupia mauriciana
    result.put("MUR", new CurrencyDataImpl("MUR", "MUR", 2, "MUR", "Rs"));
    // Rupia maldivana
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2, "MVR", "MVR"));
    // Kwacha malauiana
    result.put("MWK", new CurrencyDataImpl("MWK", "MWK", 2, "MWK", "MWK"));
    // Peso mexicano
    result.put("MXN", new CurrencyDataImpl("MXN", "MX$", 2, "Mex$", "$"));
    // Peso Prata mexicano (1861–1992)
    result.put("MXP", new CurrencyDataImpl("MXP", "MXP", 130, "MXP", "MXP"));
    // Unidade Mexicana de Investimento (UDI)
    result.put("MXV", new CurrencyDataImpl("MXV", "MXV", 130, "MXV", "MXV"));
    // Ringgit malaio
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM", "RM"));
    // Escudo de Moçambique
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130, "MZE", "MZE"));
    // Metical de Moçambique (1980–2006)
    result.put("MZM", new CurrencyDataImpl("MZM", "MZM", 130, "MZM", "MZM"));
    // Metical moçambicano
    result.put("MZN", new CurrencyDataImpl("MZN", "MZN", 2, "MZN", "MTn"));
    // Dólar namibiano
    result.put("NAD", new CurrencyDataImpl("NAD", "NAD", 2, "NAD", "$"));
    // Naira nigeriana
    result.put("NGN", new CurrencyDataImpl("NGN", "NGN", 2, "NGN", "₦"));
    // Córdoba nicaraguense (1988–1991)
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130, "NIC", "NIC"));
    // Córdoba nicaraguense
    result.put("NIO", new CurrencyDataImpl("NIO", "NIO", 2, "NIO", "C$"));
    // Florim holandês
    result.put("NLG", new CurrencyDataImpl("NLG", "NLG", 130, "NLG", "NLG"));
    // Coroa norueguesa
    result.put("NOK", new CurrencyDataImpl("NOK", "NOkr", 2, "NOkr", "kr"));
    // Rupia nepalesa
    result.put("NPR", new CurrencyDataImpl("NPR", "NPR", 2, "NPR", "Rs"));
    // Dólar neozelandês
    result.put("NZD", new CurrencyDataImpl("NZD", "NZ$", 2, "NZ$", "$"));
    // Rial omanense
    result.put("OMR", new CurrencyDataImpl("OMR", "OMR", 3, "OMR", "Rial"));
    // Balboa panamenho
    result.put("PAB", new CurrencyDataImpl("PAB", "B/.", 2, "B/.", "B/."));
    // Inti peruano
    result.put("PEI", new CurrencyDataImpl("PEI", "PEI", 130, "PEI", "PEI"));
    // Novo sol peruano
    result.put("PEN", new CurrencyDataImpl("PEN", "S/.", 2, "S/.", "S/."));
    // Sol peruano (1863–1965)
    result.put("PES", new CurrencyDataImpl("PES", "PES", 130, "PES", "PES"));
    // Kina papuásia
    result.put("PGK", new CurrencyDataImpl("PGK", "PGK", 2, "PGK", "PGK"));
    // Peso filipino
    result.put("PHP", new CurrencyDataImpl("PHP", "PHP", 2, "PHP", "₱"));
    // Rupia paquistanesa
    result.put("PKR", new CurrencyDataImpl("PKR", "PKRs.", 2, "PKRs.", "Rs"));
    // Zloty polonês
    result.put("PLN", new CurrencyDataImpl("PLN", "PLN", 2, "PLN", "zł"));
    // Zloti polonês (1950–1995)
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130, "PLZ", "PLZ"));
    // Escudo português
    result.put("PTE", new CurrencyDataImpl("PTE", "Esc.", 130, "Esc.", "Esc."));
    // Guarani paraguaio
    result.put("PYG", new CurrencyDataImpl("PYG", "PYG", 0, "PYG", "Gs"));
    // Rial catariano
    result.put("QAR", new CurrencyDataImpl("QAR", "QAR", 2, "QAR", "Rial"));
    // Dólar rodesiano
    result.put("RHD", new CurrencyDataImpl("RHD", "RHD", 130, "RHD", "RHD"));
    // Leu romeno (1952–2006)
    result.put("ROL", new CurrencyDataImpl("ROL", "ROL", 130, "ROL", "ROL"));
    // Leu romeno
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2, "RON", "RON"));
    // Dinar sérvio
    result.put("RSD", new CurrencyDataImpl("RSD", "RSD", 0, "RSD", "din"));
    // Rublo russo
    result.put("RUB", new CurrencyDataImpl("RUB", "руб.", 2, "руб.", "руб."));
    // Rublo russo (1991–1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130, "RUR", "RUR"));
    // Franco ruandês
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0, "RWF", "RF"));
    // Riyal saudita
    result.put("SAR", new CurrencyDataImpl("SAR", "SR", 2, "SR", "Rial"));
    // Dólar das Ilhas Salomão
    result.put("SBD", new CurrencyDataImpl("SBD", "SBD", 2, "SBD", "$"));
    // Rupia seichelense
    result.put("SCR", new CurrencyDataImpl("SCR", "SCR", 2, "SCR", "SCR"));
    // Dinar sudanês (1992–2007)
    result.put("SDD", new CurrencyDataImpl("SDD", "SDD", 130, "SDD", "SDD"));
    // Libra sudanesa
    result.put("SDG", new CurrencyDataImpl("SDG", "SDG", 2, "SDG", "SDG"));
    // Libra sudanesa (1957–1998)
    result.put("SDP", new CurrencyDataImpl("SDP", "SDP", 130, "SDP", "SDP"));
    // Coroa sueca
    result.put("SEK", new CurrencyDataImpl("SEK", "kr", 2, "kr", "kr"));
    // Dólar singapuriano
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$", "$"));
    // Libra de Santa Helena
    result.put("SHP", new CurrencyDataImpl("SHP", "SHP", 2, "SHP", "£"));
    // Tolar Bons esloveno
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130, "SIT", "SIT"));
    // Coroa eslovaca
    result.put("SKK", new CurrencyDataImpl("SKK", "SKK", 130, "SKK", "SKK"));
    // Leone de Serra Leoa
    result.put("SLL", new CurrencyDataImpl("SLL", "SLL", 0, "SLL", "SLL"));
    // Xelim somali
    result.put("SOS", new CurrencyDataImpl("SOS", "SOS", 0, "SOS", "SOS"));
    // Dólar surinamês
    result.put("SRD", new CurrencyDataImpl("SRD", "SRD", 2, "SRD", "$"));
    // Florim do Suriname
    result.put("SRG", new CurrencyDataImpl("SRG", "SRG", 130, "SRG", "SRG"));
    // Libra sul-sudanesa
    result.put("SSP", new CurrencyDataImpl("SSP", "SSP", 2, "SSP", "SSP"));
    // Dobra de São Tomé e Príncipe (1977–2017)
    result.put("STD", new CurrencyDataImpl("STD", "STD", 128, "STD", "Db"));
    // Dobra de São Tomé e Príncipe
    result.put("STN", new CurrencyDataImpl("STN", "STN", 2, "STN", "STN"));
    // Rublo soviético
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130, "SUR", "SUR"));
    // Colom salvadorenho
    result.put("SVC", new CurrencyDataImpl("SVC", "SVC", 130, "SVC", "SVC"));
    // Libra síria
    result.put("SYP", new CurrencyDataImpl("SYP", "SYP", 0, "SYP", "£"));
    // Lilangeni suazi
    result.put("SZL", new CurrencyDataImpl("SZL", "SZL", 2, "SZL", "SZL"));
    // Baht tailandês
    result.put("THB", new CurrencyDataImpl("THB", "฿", 2, "THB", "฿"));
    // Rublo do Tadjiquistão
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130, "TJR", "TJR"));
    // Somoni tadjique
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2, "TJS", "Som"));
    // Manat do Turcomenistão (1993–2009)
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 128, "TMM", "TMM"));
    // Manat turcomeno
    result.put("TMT", new CurrencyDataImpl("TMT", "TMT", 2, "TMT", "TMT"));
    // Dinar tunisiano
    result.put("TND", new CurrencyDataImpl("TND", "TND", 3, "TND", "din"));
    // Paʻanga tonganesa
    result.put("TOP", new CurrencyDataImpl("TOP", "TOP", 2, "TOP", "T$"));
    // Escudo timorense
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130, "TPE", "TPE"));
    // Lira turca (1922–2005)
    result.put("TRL", new CurrencyDataImpl("TRL", "TRL", 128, "TRL", "TRL"));
    // Lira turca
    result.put("TRY", new CurrencyDataImpl("TRY", "TL", 2, "YTL", "TL"));
    // Dólar de Trinidad e Tobago
    result.put("TTD", new CurrencyDataImpl("TTD", "TTD", 2, "TTD", "$"));
    // Novo dólar taiwanês
    result.put("TWD", new CurrencyDataImpl("TWD", "NT$", 2, "NT$", "NT$"));
    // Xelim tanzaniano
    result.put("TZS", new CurrencyDataImpl("TZS", "TZS", 2, "TZS", "TSh"));
    // Hryvnia ucraniano
    result.put("UAH", new CurrencyDataImpl("UAH", "UAH", 2, "UAH", "₴"));
    // Karbovanetz ucraniano
    result.put("UAK", new CurrencyDataImpl("UAK", "UAK", 130, "UAK", "UAK"));
    // Xelim ugandense (1966–1987)
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130, "UGS", "UGS"));
    // Xelim ugandense
    result.put("UGX", new CurrencyDataImpl("UGX", "UGX", 0, "UGX", "UGX"));
    // Dólar americano
    result.put("USD", new CurrencyDataImpl("USD", "US$", 2, "US$", "$"));
    // Dólar norte-americano (Dia seguinte)
    result.put("USN", new CurrencyDataImpl("USN", "USN", 130, "USN", "USN"));
    // Dólar norte-americano (Mesmo dia)
    result.put("USS", new CurrencyDataImpl("USS", "USS", 130, "USS", "USS"));
    // Peso uruguaio en unidades indexadas
    result.put("UYI", new CurrencyDataImpl("UYI", "UYI", 128, "UYI", "UYI"));
    // Peso uruguaio (1975–1993)
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130, "UYP", "UYP"));
    // Peso uruguaio
    result.put("UYU", new CurrencyDataImpl("UYU", "UY$", 2, "UY$", "$"));
    // Som uzbeque
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 2, "UZS", "soʼm"));
    // Bolívar venezuelano (1871–2008)
    result.put("VEB", new CurrencyDataImpl("VEB", "VEB", 130, "VEB", "VEB"));
    // Bolívar venezuelano (2008–2018)
    result.put("VEF", new CurrencyDataImpl("VEF", "VEF", 130, "VEF", "Bs"));
    // Bolívar venezuelano
    result.put("VES", new CurrencyDataImpl("VES", "VES", 2, "VES", "VES"));
    // Dong vietnamita
    result.put("VND", new CurrencyDataImpl("VND", "₫", 24, "₫", "₫"));
    // Dong vietnamita (1978–1985)
    result.put("VNN", new CurrencyDataImpl("VNN", "VNN", 130, "VNN", "VNN"));
    // Vatu de Vanuatu
    result.put("VUV", new CurrencyDataImpl("VUV", "VUV", 0, "VUV", "VUV"));
    // Tala samoano
    result.put("WST", new CurrencyDataImpl("WST", "WST", 2, "WST", "WST"));
    // Franco CFA de BEAC
    result.put("XAF", new CurrencyDataImpl("XAF", "FCFA", 0, "FCFA", "FCFA"));
    // Prata
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 130, "XAG", "XAG"));
    // Ouro
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 130, "XAU", "XAU"));
    // Unidade Composta Europeia
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 130, "XBA", "XBA"));
    // Unidade Monetária Europeia
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 130, "XBB", "XBB"));
    // Unidade de Conta Europeia (XBC)
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 130, "XBC", "XBC"));
    // Unidade de Conta Europeia (XBD)
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 130, "XBD", "XBD"));
    // Dólar do Caribe Oriental
    result.put("XCD", new CurrencyDataImpl("XCD", "EC$", 2, "EC$", "$"));
    // Direitos Especiais de Giro
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 130, "XDR", "XDR"));
    // Unidade de Moeda Europeia
    result.put("XEU", new CurrencyDataImpl("XEU", "XEU", 130, "XEU", "XEU"));
    // Franco-ouro francês
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 130, "XFO", "XFO"));
    // Franco UIC francês
    result.put("XFU", new CurrencyDataImpl("XFU", "XFU", 130, "XFU", "XFU"));
    // Franco CFA de BCEAO
    result.put("XOF", new CurrencyDataImpl("XOF", "CFA", 0, "CFA", "CFA"));
    // Paládio
    result.put("XPD", new CurrencyDataImpl("XPD", "XPD", 130, "XPD", "XPD"));
    // Franco CFP
    result.put("XPF", new CurrencyDataImpl("XPF", "CFPF", 0, "CFPF", "FCFP"));
    // Platina
    result.put("XPT", new CurrencyDataImpl("XPT", "XPT", 130, "XPT", "XPT"));
    // Fundos RINET
    result.put("XRE", new CurrencyDataImpl("XRE", "XRE", 130, "XRE", "XRE"));
    // Código de Moeda de Teste
    result.put("XTS", new CurrencyDataImpl("XTS", "XTS", 130, "XTS", "XTS"));
    // Moeda desconhecida
    result.put("XXX", new CurrencyDataImpl("XXX", "¤", 130, "¤", "¤"));
    // Dinar iemenita
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130, "YDD", "YDD"));
    // Rial iemenita
    result.put("YER", new CurrencyDataImpl("YER", "YER", 0, "YER", "Rial"));
    // Dinar forte iugoslavo (1966–1990)
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130, "YUD", "YUD"));
    // Dinar noviy iugoslavo (1994–2002)
    result.put("YUM", new CurrencyDataImpl("YUM", "YUM", 130, "YUM", "YUM"));
    // Dinar conversível iugoslavo (1990–1992)
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130, "YUN", "YUN"));
    // Dinar reformado iugoslavo (1992–1993)
    result.put("YUR", new CurrencyDataImpl("YUR", "YUR", 130, "YUR", "YUR"));
    // Rand sul-africano (financeiro)
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 130, "ZAL", "ZAL"));
    // Rand sul-africano
    result.put("ZAR", new CurrencyDataImpl("ZAR", "ZAR", 2, "ZAR", "R"));
    // Cuacha zambiano (1968–2012)
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZMK", 128, "ZMK", "ZWK"));
    // Kwacha zambiano
    result.put("ZMW", new CurrencyDataImpl("ZMW", "ZMW", 2, "ZMW", "ZMW"));
    // Zaire Novo zairense (1993–1998)
    result.put("ZRN", new CurrencyDataImpl("ZRN", "ZRN", 130, "ZRN", "ZRN"));
    // Zaire zairense (1971–1993)
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"));
    // Dólar do Zimbábue (1980–2008)
    result.put("ZWD", new CurrencyDataImpl("ZWD", "ZWD", 128, "ZWD", "ZWD"));
    // Dólar do Zimbábue (2009)
    result.put("ZWL", new CurrencyDataImpl("ZWL", "ZWL", 130, "ZWL", "ZWL"));
    // Dólar do Zimbábue (2008)
    result.put("ZWR", new CurrencyDataImpl("ZWR", "ZWR", 130, "ZWR", "ZWR"));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // Peseta de Andorra
      "ADP": [ "ADP", "ADP", 128, "ADP", "ADP"],
      // Dirham dos Emirados Árabes Unidos
      "AED": [ "AED", "DH", 2, "DH", "dh"],
      // Afegane (1927–2002)
      "AFA": [ "AFA", "AFA", 130, "AFA", "AFA"],
      // Afegane afegão
      "AFN": [ "AFN", "AFN", 0, "AFN", "Af."],
      // Lek Albanês (1946–1965)
      "ALK": [ "ALK", "ALK", 130, "ALK", "ALK"],
      // Lek albanês
      "ALL": [ "ALL", "ALL", 0, "ALL", "Lek"],
      // Dram armênio
      "AMD": [ "AMD", "AMD", 2, "AMD", "Dram"],
      // Florim das Antilhas Holandesas
      "ANG": [ "ANG", "ANG", 2, "ANG", "ANG"],
      // Kwanza angolano
      "AOA": [ "AOA", "AOA", 2, "AOA", "Kz"],
      // Cuanza angolano (1977–1990)
      "AOK": [ "AOK", "AOK", 130, "AOK", "AOK"],
      // Novo cuanza angolano (1990–2000)
      "AON": [ "AON", "AON", 130, "AON", "AON"],
      // Cuanza angolano reajustado (1995–1999)
      "AOR": [ "AOR", "AOR", 130, "AOR", "AOR"],
      // Austral argentino
      "ARA": [ "ARA", "ARA", 130, "ARA", "ARA"],
      // Peso lei argentino (1970–1983)
      "ARL": [ "ARL", "ARL", 130, "ARL", "ARL"],
      // Peso argentino (1881–1970)
      "ARM": [ "ARM", "ARM", 130, "ARM", "ARM"],
      // Peso argentino (1983–1985)
      "ARP": [ "ARP", "ARP", 130, "ARP", "ARP"],
      // Peso argentino
      "ARS": [ "ARS", "AR$", 2, "AR$", "$"],
      // Xelim austríaco
      "ATS": [ "ATS", "ATS", 130, "ATS", "ATS"],
      // Dólar australiano
      "AUD": [ "AUD", "AU$", 2, "AU$", "$"],
      // Florim arubano
      "AWG": [ "AWG", "AWG", 2, "AWG", "Afl."],
      // Manat azerbaijano (1993–2006)
      "AZM": [ "AZM", "AZM", 130, "AZM", "AZM"],
      // Manat azeri
      "AZN": [ "AZN", "AZN", 2, "AZN", "man."],
      // Dinar da Bósnia-Herzegovina (1992–1994)
      "BAD": [ "BAD", "BAD", 130, "BAD", "BAD"],
      // Marco conversível da Bósnia e Herzegovina
      "BAM": [ "BAM", "BAM", 2, "BAM", "KM"],
      // Novo dinar da Bósnia-Herzegovina (1994–1997)
      "BAN": [ "BAN", "BAN", 130, "BAN", "BAN"],
      // Dólar barbadense
      "BBD": [ "BBD", "BBD", 2, "BBD", "$"],
      // Taka bengali
      "BDT": [ "BDT", "Tk", 2, "Tk", "৳"],
      // Franco belga (conversível)
      "BEC": [ "BEC", "BEC", 130, "BEC", "BEC"],
      // Franco belga
      "BEF": [ "BEF", "BEF", 130, "BEF", "BEF"],
      // Franco belga (financeiro)
      "BEL": [ "BEL", "BEL", 130, "BEL", "BEL"],
      // Lev forte búlgaro
      "BGL": [ "BGL", "BGL", 130, "BGL", "BGL"],
      // Lev socialista búlgaro
      "BGM": [ "BGM", "BGM", 130, "BGM", "BGM"],
      // Lev búlgaro
      "BGN": [ "BGN", "BGN", 2, "BGN", "lev"],
      // Lev búlgaro (1879–1952)
      "BGO": [ "BGO", "BGO", 130, "BGO", "BGO"],
      // Dinar bareinita
      "BHD": [ "BHD", "BHD", 3, "BHD", "din"],
      // Franco burundiano
      "BIF": [ "BIF", "BIF", 0, "BIF", "FBu"],
      // Dólar bermudense
      "BMD": [ "BMD", "BMD", 2, "BMD", "$"],
      // Dólar bruneano
      "BND": [ "BND", "BND", 2, "BND", "$"],
      // Boliviano da Bolívia
      "BOB": [ "BOB", "BOB", 2, "BOB", "Bs"],
      // Boliviano (1863–1963)
      "BOL": [ "BOL", "BOL", 130, "BOL", "BOL"],
      // Peso boliviano
      "BOP": [ "BOP", "BOP", 130, "BOP", "BOP"],
      // Mvdol boliviano
      "BOV": [ "BOV", "BOV", 130, "BOV", "BOV"],
      // Cruzeiro novo brasileiro (1967–1986)
      "BRB": [ "BRB", "BRB", 130, "BRB", "BRB"],
      // Cruzado brasileiro (1986–1989)
      "BRC": [ "BRC", "BRC", 130, "BRC", "BRC"],
      // Cruzeiro brasileiro (1990–1993)
      "BRE": [ "BRE", "BRE", 130, "BRE", "BRE"],
      // Real brasileiro
      "BRL": [ "BRL", "R$", 2, "R$", "R$"],
      // Cruzado novo brasileiro (1989–1990)
      "BRN": [ "BRN", "BRN", 130, "BRN", "BRN"],
      // Cruzeiro brasileiro (1993–1994)
      "BRR": [ "BRR", "BRR", 130, "BRR", "BRR"],
      // Cruzeiro brasileiro (1942–1967)
      "BRZ": [ "BRZ", "BRZ", 130, "BRZ", "BRZ"],
      // Dólar bahamense
      "BSD": [ "BSD", "BSD", 2, "BSD", "$"],
      // Ngultrum butanês
      "BTN": [ "BTN", "BTN", 2, "BTN", "Nu."],
      // Kyat birmanês
      "BUK": [ "BUK", "BUK", 130, "BUK", "BUK"],
      // Pula botsuanesa
      "BWP": [ "BWP", "BWP", 2, "BWP", "P"],
      // Rublo novo bielo-russo (1994–1999)
      "BYB": [ "BYB", "BYB", 130, "BYB", "BYB"],
      // Rublo bielorrusso
      "BYN": [ "BYN", "BYN", 2, "BYN", "BYN"],
      // Rublo bielorrusso (2000–2016)
      "BYR": [ "BYR", "BYR", 128, "BYR", "BYR"],
      // Dólar belizenho
      "BZD": [ "BZD", "BZD", 2, "BZD", "$"],
      // Dólar canadense
      "CAD": [ "CAD", "CA$", 2, "C$", "$"],
      // Franco congolês
      "CDF": [ "CDF", "CDF", 2, "CDF", "FrCD"],
      // Euro WIR
      "CHE": [ "CHE", "CHE", 130, "CHE", "CHE"],
      // Franco suíço
      "CHF": [ "CHF", "CHF", 2, "CHF", "CHF"],
      // Franco WIR
      "CHW": [ "CHW", "CHW", 130, "CHW", "CHW"],
      // Escudo chileno
      "CLE": [ "CLE", "CLE", 130, "CLE", "CLE"],
      // Unidades de Fomento chilenas
      "CLF": [ "CLF", "CLF", 132, "CLF", "CLF"],
      // Peso chileno
      "CLP": [ "CLP", "CL$", 0, "CL$", "$"],
      // Renminbi chinês (offshore)
      "CNH": [ "CNH", "CNH", 130, "CNH", "CNH"],
      // Dólar do Banco Popular da China
      "CNX": [ "CNX", "CNX", 130, "CNX", "CNX"],
      // Renminbi chinês
      "CNY": [ "CNY", "CN¥", 2, "RMB¥", "¥"],
      // Peso colombiano
      "COP": [ "COP", "COL$", 2, "COL$", "$"],
      // Unidade de Valor Real
      "COU": [ "COU", "COU", 130, "COU", "COU"],
      // Colón costarriquenho
      "CRC": [ "CRC", "CR₡", 2, "CR₡", "₡"],
      // Dinar sérvio (2002–2006)
      "CSD": [ "CSD", "CSD", 130, "CSD", "CSD"],
      // Coroa Forte checoslovaca
      "CSK": [ "CSK", "CSK", 130, "CSK", "CSK"],
      // Peso cubano conversível
      "CUC": [ "CUC", "CUC", 2, "CUC", "$"],
      // Peso cubano
      "CUP": [ "CUP", "$MN", 2, "$MN", "$"],
      // Escudo cabo-verdiano
      "CVE": [ "CVE", "CVE", 2, "CVE", "CVE"],
      // Libra cipriota
      "CYP": [ "CYP", "CYP", 130, "CYP", "CYP"],
      // Coroa tcheca
      "CZK": [ "CZK", "Kč", 2, "Kč", "Kč"],
      // Ostmark da Alemanha Oriental
      "DDM": [ "DDM", "DDM", 130, "DDM", "DDM"],
      // Marco alemão
      "DEM": [ "DEM", "DEM", 130, "DEM", "DEM"],
      // Franco djiboutiano
      "DJF": [ "DJF", "Fdj", 0, "Fdj", "Fdj"],
      // Coroa dinamarquesa
      "DKK": [ "DKK", "kr", 2, "kr", "kr"],
      // Peso dominicano
      "DOP": [ "DOP", "RD$", 2, "RD$", "$"],
      // Dinar argelino
      "DZD": [ "DZD", "DZD", 2, "DZD", "din"],
      // Sucre equatoriano
      "ECS": [ "ECS", "ECS", 130, "ECS", "ECS"],
      // Unidade de Valor Constante (UVC) do Equador
      "ECV": [ "ECV", "ECV", 130, "ECV", "ECV"],
      // Coroa estoniana
      "EEK": [ "EEK", "EEK", 130, "EEK", "EEK"],
      // Libra egípcia
      "EGP": [ "EGP", "LE", 2, "LE", "E£"],
      // Nakfa da Eritreia
      "ERN": [ "ERN", "ERN", 2, "ERN", "Nfk"],
      // Peseta espanhola (conta A)
      "ESA": [ "ESA", "ESA", 130, "ESA", "ESA"],
      // Peseta espanhola (conta conversível)
      "ESB": [ "ESB", "ESB", 130, "ESB", "ESB"],
      // Peseta espanhola
      "ESP": [ "ESP", "ESP", 128, "ESP", "ESP"],
      // Birr etíope
      "ETB": [ "ETB", "ETB", 2, "ETB", "Birr"],
      // Euro
      "EUR": [ "EUR", "€", 2, "€", "€"],
      // Marca finlandesa
      "FIM": [ "FIM", "FIM", 130, "FIM", "FIM"],
      // Dólar fijiano
      "FJD": [ "FJD", "FJD", 2, "FJD", "$"],
      // Libra malvinense
      "FKP": [ "FKP", "FKP", 2, "FKP", "£"],
      // Franco francês
      "FRF": [ "FRF", "FRF", 130, "FRF", "FRF"],
      // Libra esterlina
      "GBP": [ "GBP", "£", 2, "GB£", "£"],
      // Cupom Lari georgiano
      "GEK": [ "GEK", "GEK", 130, "GEK", "GEK"],
      // Lari georgiano
      "GEL": [ "GEL", "₾", 2, "₾", "GEL"],
      // Cedi de Gana (1979–2007)
      "GHC": [ "GHC", "GHC", 130, "GHC", "GHC"],
      // Cedi ganês
      "GHS": [ "GHS", "GHS", 2, "GHS", "GHS"],
      // Libra de Gibraltar
      "GIP": [ "GIP", "GIP", 2, "GIP", "£"],
      // Dalasi gambiano
      "GMD": [ "GMD", "GMD", 2, "GMD", "GMD"],
      // Franco guineano
      "GNF": [ "GNF", "GNF", 0, "GNF", "FG"],
      // Syli da Guiné
      "GNS": [ "GNS", "GNS", 130, "GNS", "GNS"],
      // Ekwele da Guiné Equatorial
      "GQE": [ "GQE", "GQE", 130, "GQE", "GQE"],
      // Dracma grego
      "GRD": [ "GRD", "GRD", 130, "GRD", "GRD"],
      // Quetzal guatemalteco
      "GTQ": [ "GTQ", "GTQ", 2, "GTQ", "Q"],
      // Escudo da Guiné Portuguesa
      "GWE": [ "GWE", "GWE", 130, "GWE", "GWE"],
      // Peso da Guiné-Bissau
      "GWP": [ "GWP", "GWP", 130, "GWP", "GWP"],
      // Dólar guianense
      "GYD": [ "GYD", "GYD", 2, "GYD", "$"],
      // Dólar de Hong Kong
      "HKD": [ "HKD", "HK$", 2, "HK$", "$"],
      // Lempira hondurenha
      "HNL": [ "HNL", "L", 2, "L", "L"],
      // Dinar croata
      "HRD": [ "HRD", "HRD", 130, "HRD", "HRD"],
      // Kuna croata
      "HRK": [ "HRK", "HRK", 2, "HRK", "kn"],
      // Gourde haitiano
      "HTG": [ "HTG", "HTG", 2, "HTG", "HTG"],
      // Florim húngaro
      "HUF": [ "HUF", "HUF", 2, "HUF", "Ft"],
      // Rupia indonésia
      "IDR": [ "IDR", "IDR", 2, "IDR", "Rp"],
      // Libra irlandesa
      "IEP": [ "IEP", "IEP", 130, "IEP", "IEP"],
      // Libra israelita
      "ILP": [ "ILP", "ILP", 130, "ILP", "ILP"],
      // Sheqel antigo israelita
      "ILR": [ "ILR", "ILR", 130, "ILR", "ILR"],
      // Novo shekel israelense
      "ILS": [ "ILS", "₪", 2, "IL₪", "₪"],
      // Rupia indiana
      "INR": [ "INR", "₹", 2, "Rs", "₹"],
      // Dinar iraquiano
      "IQD": [ "IQD", "IQD", 0, "IQD", "din"],
      // Rial iraniano
      "IRR": [ "IRR", "IRR", 0, "IRR", "Rial"],
      // Coroa antiga islandesa
      "ISJ": [ "ISJ", "ISJ", 130, "ISJ", "ISJ"],
      // Coroa islandesa
      "ISK": [ "ISK", "kr", 0, "kr", "kr"],
      // Lira italiana
      "ITL": [ "ITL", "ITL", 128, "ITL", "ITL"],
      // Dólar jamaicano
      "JMD": [ "JMD", "JA$", 2, "JA$", "$"],
      // Dinar jordaniano
      "JOD": [ "JOD", "JOD", 3, "JOD", "din"],
      // Iene japonês
      "JPY": [ "JPY", "JP¥", 0, "JP¥", "¥"],
      // Xelim queniano
      "KES": [ "KES", "Ksh", 2, "Ksh", "Ksh"],
      // Som quirguiz
      "KGS": [ "KGS", "KGS", 2, "KGS", "KGS"],
      // Riel cambojano
      "KHR": [ "KHR", "KHR", 2, "KHR", "Riel"],
      // Franco comoriano
      "KMF": [ "KMF", "KMF", 0, "KMF", "CF"],
      // Won norte-coreano
      "KPW": [ "KPW", "KPW", 0, "KPW", "₩"],
      // Hwan da Coreia do Sul (1953–1962)
      "KRH": [ "KRH", "KRH", 130, "KRH", "KRH"],
      // Won da Coreia do Sul (1945–1953)
      "KRO": [ "KRO", "KRO", 130, "KRO", "KRO"],
      // Won sul-coreano
      "KRW": [ "KRW", "₩", 0, "KR₩", "₩"],
      // Dinar kuwaitiano
      "KWD": [ "KWD", "KWD", 3, "KWD", "din"],
      // Dólar das Ilhas Cayman
      "KYD": [ "KYD", "KYD", 2, "KYD", "$"],
      // Tenge cazaque
      "KZT": [ "KZT", "KZT", 2, "KZT", "₸"],
      // Kip laosiano
      "LAK": [ "LAK", "LAK", 0, "LAK", "₭"],
      // Libra libanesa
      "LBP": [ "LBP", "LBP", 0, "LBP", "L£"],
      // Rupia do Sri Lanka
      "LKR": [ "LKR", "SLRs", 2, "SLRs", "Rs"],
      // Dólar liberiano
      "LRD": [ "LRD", "LRD", 2, "LRD", "$"],
      // Loti do Lesoto
      "LSL": [ "LSL", "LSL", 2, "LSL", "LSL"],
      // Litas lituano
      "LTL": [ "LTL", "LTL", 130, "LTL", "Lt"],
      // Talonas lituano
      "LTT": [ "LTT", "LTT", 130, "LTT", "LTT"],
      // Franco conversível de Luxemburgo
      "LUC": [ "LUC", "LUC", 130, "LUC", "LUC"],
      // Franco luxemburguês
      "LUF": [ "LUF", "LUF", 128, "LUF", "LUF"],
      // Franco financeiro de Luxemburgo
      "LUL": [ "LUL", "LUL", 130, "LUL", "LUL"],
      // Lats letão
      "LVL": [ "LVL", "LVL", 130, "LVL", "Ls"],
      // Rublo letão
      "LVR": [ "LVR", "LVR", 130, "LVR", "LVR"],
      // Dinar líbio
      "LYD": [ "LYD", "LYD", 3, "LYD", "din"],
      // Dirham marroquino
      "MAD": [ "MAD", "MAD", 2, "MAD", "MAD"],
      // Franco marroquino
      "MAF": [ "MAF", "MAF", 130, "MAF", "MAF"],
      // Franco monegasco
      "MCF": [ "MCF", "MCF", 130, "MCF", "MCF"],
      // Cupon moldávio
      "MDC": [ "MDC", "MDC", 130, "MDC", "MDC"],
      // Leu moldávio
      "MDL": [ "MDL", "MDL", 2, "MDL", "MDL"],
      // Ariary malgaxe
      "MGA": [ "MGA", "MGA", 0, "MGA", "Ar"],
      // Franco de Madagascar
      "MGF": [ "MGF", "MGF", 128, "MGF", "MGF"],
      // Dinar macedônio
      "MKD": [ "MKD", "MKD", 2, "MKD", "din"],
      // Dinar macedônio (1992–1993)
      "MKN": [ "MKN", "MKN", 130, "MKN", "MKN"],
      // Franco de Mali
      "MLF": [ "MLF", "MLF", 130, "MLF", "MLF"],
      // Quiat de Myanmar
      "MMK": [ "MMK", "MMK", 0, "MMK", "K"],
      // Tugrik mongol
      "MNT": [ "MNT", "MN₮", 2, "MN₮", "₮"],
      // Pataca de Macau
      "MOP": [ "MOP", "MOP", 2, "MOP", "MOP"],
      // Ouguiya mauritana (1973–2017)
      "MRO": [ "MRO", "MRO", 128, "MRO", "MRO"],
      // Ouguiya mauritana
      "MRU": [ "MRU", "MRU", 2, "MRU", "MRU"],
      // Lira maltesa
      "MTL": [ "MTL", "MTL", 130, "MTL", "MTL"],
      // Libra maltesa
      "MTP": [ "MTP", "MTP", 130, "MTP", "MTP"],
      // Rupia mauriciana
      "MUR": [ "MUR", "MUR", 2, "MUR", "Rs"],
      // Rupia maldivana
      "MVR": [ "MVR", "MVR", 2, "MVR", "MVR"],
      // Kwacha malauiana
      "MWK": [ "MWK", "MWK", 2, "MWK", "MWK"],
      // Peso mexicano
      "MXN": [ "MXN", "MX$", 2, "Mex$", "$"],
      // Peso Prata mexicano (1861–1992)
      "MXP": [ "MXP", "MXP", 130, "MXP", "MXP"],
      // Unidade Mexicana de Investimento (UDI)
      "MXV": [ "MXV", "MXV", 130, "MXV", "MXV"],
      // Ringgit malaio
      "MYR": [ "MYR", "RM", 2, "RM", "RM"],
      // Escudo de Moçambique
      "MZE": [ "MZE", "MZE", 130, "MZE", "MZE"],
      // Metical de Moçambique (1980–2006)
      "MZM": [ "MZM", "MZM", 130, "MZM", "MZM"],
      // Metical moçambicano
      "MZN": [ "MZN", "MZN", 2, "MZN", "MTn"],
      // Dólar namibiano
      "NAD": [ "NAD", "NAD", 2, "NAD", "$"],
      // Naira nigeriana
      "NGN": [ "NGN", "NGN", 2, "NGN", "₦"],
      // Córdoba nicaraguense (1988–1991)
      "NIC": [ "NIC", "NIC", 130, "NIC", "NIC"],
      // Córdoba nicaraguense
      "NIO": [ "NIO", "NIO", 2, "NIO", "C$"],
      // Florim holandês
      "NLG": [ "NLG", "NLG", 130, "NLG", "NLG"],
      // Coroa norueguesa
      "NOK": [ "NOK", "NOkr", 2, "NOkr", "kr"],
      // Rupia nepalesa
      "NPR": [ "NPR", "NPR", 2, "NPR", "Rs"],
      // Dólar neozelandês
      "NZD": [ "NZD", "NZ$", 2, "NZ$", "$"],
      // Rial omanense
      "OMR": [ "OMR", "OMR", 3, "OMR", "Rial"],
      // Balboa panamenho
      "PAB": [ "PAB", "B/.", 2, "B/.", "B/."],
      // Inti peruano
      "PEI": [ "PEI", "PEI", 130, "PEI", "PEI"],
      // Novo sol peruano
      "PEN": [ "PEN", "S/.", 2, "S/.", "S/."],
      // Sol peruano (1863–1965)
      "PES": [ "PES", "PES", 130, "PES", "PES"],
      // Kina papuásia
      "PGK": [ "PGK", "PGK", 2, "PGK", "PGK"],
      // Peso filipino
      "PHP": [ "PHP", "PHP", 2, "PHP", "₱"],
      // Rupia paquistanesa
      "PKR": [ "PKR", "PKRs.", 2, "PKRs.", "Rs"],
      // Zloty polonês
      "PLN": [ "PLN", "PLN", 2, "PLN", "zł"],
      // Zloti polonês (1950–1995)
      "PLZ": [ "PLZ", "PLZ", 130, "PLZ", "PLZ"],
      // Escudo português
      "PTE": [ "PTE", "Esc.", 130, "Esc.", "Esc."],
      // Guarani paraguaio
      "PYG": [ "PYG", "PYG", 0, "PYG", "Gs"],
      // Rial catariano
      "QAR": [ "QAR", "QAR", 2, "QAR", "Rial"],
      // Dólar rodesiano
      "RHD": [ "RHD", "RHD", 130, "RHD", "RHD"],
      // Leu romeno (1952–2006)
      "ROL": [ "ROL", "ROL", 130, "ROL", "ROL"],
      // Leu romeno
      "RON": [ "RON", "RON", 2, "RON", "RON"],
      // Dinar sérvio
      "RSD": [ "RSD", "RSD", 0, "RSD", "din"],
      // Rublo russo
      "RUB": [ "RUB", "руб.", 2, "руб.", "руб."],
      // Rublo russo (1991–1998)
      "RUR": [ "RUR", "RUR", 130, "RUR", "RUR"],
      // Franco ruandês
      "RWF": [ "RWF", "RWF", 0, "RWF", "RF"],
      // Riyal saudita
      "SAR": [ "SAR", "SR", 2, "SR", "Rial"],
      // Dólar das Ilhas Salomão
      "SBD": [ "SBD", "SBD", 2, "SBD", "$"],
      // Rupia seichelense
      "SCR": [ "SCR", "SCR", 2, "SCR", "SCR"],
      // Dinar sudanês (1992–2007)
      "SDD": [ "SDD", "SDD", 130, "SDD", "SDD"],
      // Libra sudanesa
      "SDG": [ "SDG", "SDG", 2, "SDG", "SDG"],
      // Libra sudanesa (1957–1998)
      "SDP": [ "SDP", "SDP", 130, "SDP", "SDP"],
      // Coroa sueca
      "SEK": [ "SEK", "kr", 2, "kr", "kr"],
      // Dólar singapuriano
      "SGD": [ "SGD", "S$", 2, "S$", "$"],
      // Libra de Santa Helena
      "SHP": [ "SHP", "SHP", 2, "SHP", "£"],
      // Tolar Bons esloveno
      "SIT": [ "SIT", "SIT", 130, "SIT", "SIT"],
      // Coroa eslovaca
      "SKK": [ "SKK", "SKK", 130, "SKK", "SKK"],
      // Leone de Serra Leoa
      "SLL": [ "SLL", "SLL", 0, "SLL", "SLL"],
      // Xelim somali
      "SOS": [ "SOS", "SOS", 0, "SOS", "SOS"],
      // Dólar surinamês
      "SRD": [ "SRD", "SRD", 2, "SRD", "$"],
      // Florim do Suriname
      "SRG": [ "SRG", "SRG", 130, "SRG", "SRG"],
      // Libra sul-sudanesa
      "SSP": [ "SSP", "SSP", 2, "SSP", "SSP"],
      // Dobra de São Tomé e Príncipe (1977–2017)
      "STD": [ "STD", "STD", 128, "STD", "Db"],
      // Dobra de São Tomé e Príncipe
      "STN": [ "STN", "STN", 2, "STN", "STN"],
      // Rublo soviético
      "SUR": [ "SUR", "SUR", 130, "SUR", "SUR"],
      // Colom salvadorenho
      "SVC": [ "SVC", "SVC", 130, "SVC", "SVC"],
      // Libra síria
      "SYP": [ "SYP", "SYP", 0, "SYP", "£"],
      // Lilangeni suazi
      "SZL": [ "SZL", "SZL", 2, "SZL", "SZL"],
      // Baht tailandês
      "THB": [ "THB", "฿", 2, "THB", "฿"],
      // Rublo do Tadjiquistão
      "TJR": [ "TJR", "TJR", 130, "TJR", "TJR"],
      // Somoni tadjique
      "TJS": [ "TJS", "TJS", 2, "TJS", "Som"],
      // Manat do Turcomenistão (1993–2009)
      "TMM": [ "TMM", "TMM", 128, "TMM", "TMM"],
      // Manat turcomeno
      "TMT": [ "TMT", "TMT", 2, "TMT", "TMT"],
      // Dinar tunisiano
      "TND": [ "TND", "TND", 3, "TND", "din"],
      // Paʻanga tonganesa
      "TOP": [ "TOP", "TOP", 2, "TOP", "T$"],
      // Escudo timorense
      "TPE": [ "TPE", "TPE", 130, "TPE", "TPE"],
      // Lira turca (1922–2005)
      "TRL": [ "TRL", "TRL", 128, "TRL", "TRL"],
      // Lira turca
      "TRY": [ "TRY", "TL", 2, "YTL", "TL"],
      // Dólar de Trinidad e Tobago
      "TTD": [ "TTD", "TTD", 2, "TTD", "$"],
      // Novo dólar taiwanês
      "TWD": [ "TWD", "NT$", 2, "NT$", "NT$"],
      // Xelim tanzaniano
      "TZS": [ "TZS", "TZS", 2, "TZS", "TSh"],
      // Hryvnia ucraniano
      "UAH": [ "UAH", "UAH", 2, "UAH", "₴"],
      // Karbovanetz ucraniano
      "UAK": [ "UAK", "UAK", 130, "UAK", "UAK"],
      // Xelim ugandense (1966–1987)
      "UGS": [ "UGS", "UGS", 130, "UGS", "UGS"],
      // Xelim ugandense
      "UGX": [ "UGX", "UGX", 0, "UGX", "UGX"],
      // Dólar americano
      "USD": [ "USD", "US$", 2, "US$", "$"],
      // Dólar norte-americano (Dia seguinte)
      "USN": [ "USN", "USN", 130, "USN", "USN"],
      // Dólar norte-americano (Mesmo dia)
      "USS": [ "USS", "USS", 130, "USS", "USS"],
      // Peso uruguaio en unidades indexadas
      "UYI": [ "UYI", "UYI", 128, "UYI", "UYI"],
      // Peso uruguaio (1975–1993)
      "UYP": [ "UYP", "UYP", 130, "UYP", "UYP"],
      // Peso uruguaio
      "UYU": [ "UYU", "UY$", 2, "UY$", "$"],
      // Som uzbeque
      "UZS": [ "UZS", "UZS", 2, "UZS", "soʼm"],
      // Bolívar venezuelano (1871–2008)
      "VEB": [ "VEB", "VEB", 130, "VEB", "VEB"],
      // Bolívar venezuelano (2008–2018)
      "VEF": [ "VEF", "VEF", 130, "VEF", "Bs"],
      // Bolívar venezuelano
      "VES": [ "VES", "VES", 2, "VES", "VES"],
      // Dong vietnamita
      "VND": [ "VND", "₫", 24, "₫", "₫"],
      // Dong vietnamita (1978–1985)
      "VNN": [ "VNN", "VNN", 130, "VNN", "VNN"],
      // Vatu de Vanuatu
      "VUV": [ "VUV", "VUV", 0, "VUV", "VUV"],
      // Tala samoano
      "WST": [ "WST", "WST", 2, "WST", "WST"],
      // Franco CFA de BEAC
      "XAF": [ "XAF", "FCFA", 0, "FCFA", "FCFA"],
      // Prata
      "XAG": [ "XAG", "XAG", 130, "XAG", "XAG"],
      // Ouro
      "XAU": [ "XAU", "XAU", 130, "XAU", "XAU"],
      // Unidade Composta Europeia
      "XBA": [ "XBA", "XBA", 130, "XBA", "XBA"],
      // Unidade Monetária Europeia
      "XBB": [ "XBB", "XBB", 130, "XBB", "XBB"],
      // Unidade de Conta Europeia (XBC)
      "XBC": [ "XBC", "XBC", 130, "XBC", "XBC"],
      // Unidade de Conta Europeia (XBD)
      "XBD": [ "XBD", "XBD", 130, "XBD", "XBD"],
      // Dólar do Caribe Oriental
      "XCD": [ "XCD", "EC$", 2, "EC$", "$"],
      // Direitos Especiais de Giro
      "XDR": [ "XDR", "XDR", 130, "XDR", "XDR"],
      // Unidade de Moeda Europeia
      "XEU": [ "XEU", "XEU", 130, "XEU", "XEU"],
      // Franco-ouro francês
      "XFO": [ "XFO", "XFO", 130, "XFO", "XFO"],
      // Franco UIC francês
      "XFU": [ "XFU", "XFU", 130, "XFU", "XFU"],
      // Franco CFA de BCEAO
      "XOF": [ "XOF", "CFA", 0, "CFA", "CFA"],
      // Paládio
      "XPD": [ "XPD", "XPD", 130, "XPD", "XPD"],
      // Franco CFP
      "XPF": [ "XPF", "CFPF", 0, "CFPF", "FCFP"],
      // Platina
      "XPT": [ "XPT", "XPT", 130, "XPT", "XPT"],
      // Fundos RINET
      "XRE": [ "XRE", "XRE", 130, "XRE", "XRE"],
      // Código de Moeda de Teste
      "XTS": [ "XTS", "XTS", 130, "XTS", "XTS"],
      // Moeda desconhecida
      "XXX": [ "XXX", "¤", 130, "¤", "¤"],
      // Dinar iemenita
      "YDD": [ "YDD", "YDD", 130, "YDD", "YDD"],
      // Rial iemenita
      "YER": [ "YER", "YER", 0, "YER", "Rial"],
      // Dinar forte iugoslavo (1966–1990)
      "YUD": [ "YUD", "YUD", 130, "YUD", "YUD"],
      // Dinar noviy iugoslavo (1994–2002)
      "YUM": [ "YUM", "YUM", 130, "YUM", "YUM"],
      // Dinar conversível iugoslavo (1990–1992)
      "YUN": [ "YUN", "YUN", 130, "YUN", "YUN"],
      // Dinar reformado iugoslavo (1992–1993)
      "YUR": [ "YUR", "YUR", 130, "YUR", "YUR"],
      // Rand sul-africano (financeiro)
      "ZAL": [ "ZAL", "ZAL", 130, "ZAL", "ZAL"],
      // Rand sul-africano
      "ZAR": [ "ZAR", "ZAR", 2, "ZAR", "R"],
      // Cuacha zambiano (1968–2012)
      "ZMK": [ "ZMK", "ZMK", 128, "ZMK", "ZWK"],
      // Kwacha zambiano
      "ZMW": [ "ZMW", "ZMW", 2, "ZMW", "ZMW"],
      // Zaire Novo zairense (1993–1998)
      "ZRN": [ "ZRN", "ZRN", 130, "ZRN", "ZRN"],
      // Zaire zairense (1971–1993)
      "ZRZ": [ "ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"],
      // Dólar do Zimbábue (1980–2008)
      "ZWD": [ "ZWD", "ZWD", 128, "ZWD", "ZWD"],
      // Dólar do Zimbábue (2009)
      "ZWL": [ "ZWL", "ZWL", 130, "ZWL", "ZWL"],
      // Dólar do Zimbábue (2008)
      "ZWR": [ "ZWR", "ZWR", 130, "ZWR", "ZWR"],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("ADP", "Peseta de Andorra");
    result.put("AED", "Dirham dos Emirados Árabes Unidos");
    result.put("AFA", "Afegane (1927–2002)");
    result.put("AFN", "Afegane afegão");
    result.put("ALK", "Lek Albanês (1946–1965)");
    result.put("ALL", "Lek albanês");
    result.put("AMD", "Dram armênio");
    result.put("ANG", "Florim das Antilhas Holandesas");
    result.put("AOA", "Kwanza angolano");
    result.put("AOK", "Cuanza angolano (1977–1990)");
    result.put("AON", "Novo cuanza angolano (1990–2000)");
    result.put("AOR", "Cuanza angolano reajustado (1995–1999)");
    result.put("ARA", "Austral argentino");
    result.put("ARL", "Peso lei argentino (1970–1983)");
    result.put("ARM", "Peso argentino (1881–1970)");
    result.put("ARP", "Peso argentino (1983–1985)");
    result.put("ARS", "Peso argentino");
    result.put("ATS", "Xelim austríaco");
    result.put("AUD", "Dólar australiano");
    result.put("AWG", "Florim arubano");
    result.put("AZM", "Manat azerbaijano (1993–2006)");
    result.put("AZN", "Manat azeri");
    result.put("BAD", "Dinar da Bósnia-Herzegovina (1992–1994)");
    result.put("BAM", "Marco conversível da Bósnia e Herzegovina");
    result.put("BAN", "Novo dinar da Bósnia-Herzegovina (1994–1997)");
    result.put("BBD", "Dólar barbadense");
    result.put("BDT", "Taka bengali");
    result.put("BEC", "Franco belga (conversível)");
    result.put("BEF", "Franco belga");
    result.put("BEL", "Franco belga (financeiro)");
    result.put("BGL", "Lev forte búlgaro");
    result.put("BGM", "Lev socialista búlgaro");
    result.put("BGN", "Lev búlgaro");
    result.put("BGO", "Lev búlgaro (1879–1952)");
    result.put("BHD", "Dinar bareinita");
    result.put("BIF", "Franco burundiano");
    result.put("BMD", "Dólar bermudense");
    result.put("BND", "Dólar bruneano");
    result.put("BOB", "Boliviano da Bolívia");
    result.put("BOL", "Boliviano (1863–1963)");
    result.put("BOP", "Peso boliviano");
    result.put("BOV", "Mvdol boliviano");
    result.put("BRB", "Cruzeiro novo brasileiro (1967–1986)");
    result.put("BRC", "Cruzado brasileiro (1986–1989)");
    result.put("BRE", "Cruzeiro brasileiro (1990–1993)");
    result.put("BRL", "Real brasileiro");
    result.put("BRN", "Cruzado novo brasileiro (1989–1990)");
    result.put("BRR", "Cruzeiro brasileiro (1993–1994)");
    result.put("BRZ", "Cruzeiro brasileiro (1942–1967)");
    result.put("BSD", "Dólar bahamense");
    result.put("BTN", "Ngultrum butanês");
    result.put("BUK", "Kyat birmanês");
    result.put("BWP", "Pula botsuanesa");
    result.put("BYB", "Rublo novo bielo-russo (1994–1999)");
    result.put("BYN", "Rublo bielorrusso");
    result.put("BYR", "Rublo bielorrusso (2000–2016)");
    result.put("BZD", "Dólar belizenho");
    result.put("CAD", "Dólar canadense");
    result.put("CDF", "Franco congolês");
    result.put("CHE", "Euro WIR");
    result.put("CHF", "Franco suíço");
    result.put("CHW", "Franco WIR");
    result.put("CLE", "Escudo chileno");
    result.put("CLF", "Unidades de Fomento chilenas");
    result.put("CLP", "Peso chileno");
    result.put("CNH", "Renminbi chinês (offshore)");
    result.put("CNX", "Dólar do Banco Popular da China");
    result.put("CNY", "Renminbi chinês");
    result.put("COP", "Peso colombiano");
    result.put("COU", "Unidade de Valor Real");
    result.put("CRC", "Colón costarriquenho");
    result.put("CSD", "Dinar sérvio (2002–2006)");
    result.put("CSK", "Coroa Forte checoslovaca");
    result.put("CUC", "Peso cubano conversível");
    result.put("CUP", "Peso cubano");
    result.put("CVE", "Escudo cabo-verdiano");
    result.put("CYP", "Libra cipriota");
    result.put("CZK", "Coroa tcheca");
    result.put("DDM", "Ostmark da Alemanha Oriental");
    result.put("DEM", "Marco alemão");
    result.put("DJF", "Franco djiboutiano");
    result.put("DKK", "Coroa dinamarquesa");
    result.put("DOP", "Peso dominicano");
    result.put("DZD", "Dinar argelino");
    result.put("ECS", "Sucre equatoriano");
    result.put("ECV", "Unidade de Valor Constante (UVC) do Equador");
    result.put("EEK", "Coroa estoniana");
    result.put("EGP", "Libra egípcia");
    result.put("ERN", "Nakfa da Eritreia");
    result.put("ESA", "Peseta espanhola (conta A)");
    result.put("ESB", "Peseta espanhola (conta conversível)");
    result.put("ESP", "Peseta espanhola");
    result.put("ETB", "Birr etíope");
    result.put("EUR", "Euro");
    result.put("FIM", "Marca finlandesa");
    result.put("FJD", "Dólar fijiano");
    result.put("FKP", "Libra malvinense");
    result.put("FRF", "Franco francês");
    result.put("GBP", "Libra esterlina");
    result.put("GEK", "Cupom Lari georgiano");
    result.put("GEL", "Lari georgiano");
    result.put("GHC", "Cedi de Gana (1979–2007)");
    result.put("GHS", "Cedi ganês");
    result.put("GIP", "Libra de Gibraltar");
    result.put("GMD", "Dalasi gambiano");
    result.put("GNF", "Franco guineano");
    result.put("GNS", "Syli da Guiné");
    result.put("GQE", "Ekwele da Guiné Equatorial");
    result.put("GRD", "Dracma grego");
    result.put("GTQ", "Quetzal guatemalteco");
    result.put("GWE", "Escudo da Guiné Portuguesa");
    result.put("GWP", "Peso da Guiné-Bissau");
    result.put("GYD", "Dólar guianense");
    result.put("HKD", "Dólar de Hong Kong");
    result.put("HNL", "Lempira hondurenha");
    result.put("HRD", "Dinar croata");
    result.put("HRK", "Kuna croata");
    result.put("HTG", "Gourde haitiano");
    result.put("HUF", "Florim húngaro");
    result.put("IDR", "Rupia indonésia");
    result.put("IEP", "Libra irlandesa");
    result.put("ILP", "Libra israelita");
    result.put("ILR", "Sheqel antigo israelita");
    result.put("ILS", "Novo shekel israelense");
    result.put("INR", "Rupia indiana");
    result.put("IQD", "Dinar iraquiano");
    result.put("IRR", "Rial iraniano");
    result.put("ISJ", "Coroa antiga islandesa");
    result.put("ISK", "Coroa islandesa");
    result.put("ITL", "Lira italiana");
    result.put("JMD", "Dólar jamaicano");
    result.put("JOD", "Dinar jordaniano");
    result.put("JPY", "Iene japonês");
    result.put("KES", "Xelim queniano");
    result.put("KGS", "Som quirguiz");
    result.put("KHR", "Riel cambojano");
    result.put("KMF", "Franco comoriano");
    result.put("KPW", "Won norte-coreano");
    result.put("KRH", "Hwan da Coreia do Sul (1953–1962)");
    result.put("KRO", "Won da Coreia do Sul (1945–1953)");
    result.put("KRW", "Won sul-coreano");
    result.put("KWD", "Dinar kuwaitiano");
    result.put("KYD", "Dólar das Ilhas Cayman");
    result.put("KZT", "Tenge cazaque");
    result.put("LAK", "Kip laosiano");
    result.put("LBP", "Libra libanesa");
    result.put("LKR", "Rupia do Sri Lanka");
    result.put("LRD", "Dólar liberiano");
    result.put("LSL", "Loti do Lesoto");
    result.put("LTL", "Litas lituano");
    result.put("LTT", "Talonas lituano");
    result.put("LUC", "Franco conversível de Luxemburgo");
    result.put("LUF", "Franco luxemburguês");
    result.put("LUL", "Franco financeiro de Luxemburgo");
    result.put("LVL", "Lats letão");
    result.put("LVR", "Rublo letão");
    result.put("LYD", "Dinar líbio");
    result.put("MAD", "Dirham marroquino");
    result.put("MAF", "Franco marroquino");
    result.put("MCF", "Franco monegasco");
    result.put("MDC", "Cupon moldávio");
    result.put("MDL", "Leu moldávio");
    result.put("MGA", "Ariary malgaxe");
    result.put("MGF", "Franco de Madagascar");
    result.put("MKD", "Dinar macedônio");
    result.put("MKN", "Dinar macedônio (1992–1993)");
    result.put("MLF", "Franco de Mali");
    result.put("MMK", "Quiat de Myanmar");
    result.put("MNT", "Tugrik mongol");
    result.put("MOP", "Pataca de Macau");
    result.put("MRO", "Ouguiya mauritana (1973–2017)");
    result.put("MRU", "Ouguiya mauritana");
    result.put("MTL", "Lira maltesa");
    result.put("MTP", "Libra maltesa");
    result.put("MUR", "Rupia mauriciana");
    result.put("MVR", "Rupia maldivana");
    result.put("MWK", "Kwacha malauiana");
    result.put("MXN", "Peso mexicano");
    result.put("MXP", "Peso Prata mexicano (1861–1992)");
    result.put("MXV", "Unidade Mexicana de Investimento (UDI)");
    result.put("MYR", "Ringgit malaio");
    result.put("MZE", "Escudo de Moçambique");
    result.put("MZM", "Metical de Moçambique (1980–2006)");
    result.put("MZN", "Metical moçambicano");
    result.put("NAD", "Dólar namibiano");
    result.put("NGN", "Naira nigeriana");
    result.put("NIC", "Córdoba nicaraguense (1988–1991)");
    result.put("NIO", "Córdoba nicaraguense");
    result.put("NLG", "Florim holandês");
    result.put("NOK", "Coroa norueguesa");
    result.put("NPR", "Rupia nepalesa");
    result.put("NZD", "Dólar neozelandês");
    result.put("OMR", "Rial omanense");
    result.put("PAB", "Balboa panamenho");
    result.put("PEI", "Inti peruano");
    result.put("PEN", "Novo sol peruano");
    result.put("PES", "Sol peruano (1863–1965)");
    result.put("PGK", "Kina papuásia");
    result.put("PHP", "Peso filipino");
    result.put("PKR", "Rupia paquistanesa");
    result.put("PLN", "Zloty polonês");
    result.put("PLZ", "Zloti polonês (1950–1995)");
    result.put("PTE", "Escudo português");
    result.put("PYG", "Guarani paraguaio");
    result.put("QAR", "Rial catariano");
    result.put("RHD", "Dólar rodesiano");
    result.put("ROL", "Leu romeno (1952–2006)");
    result.put("RON", "Leu romeno");
    result.put("RSD", "Dinar sérvio");
    result.put("RUB", "Rublo russo");
    result.put("RUR", "Rublo russo (1991–1998)");
    result.put("RWF", "Franco ruandês");
    result.put("SAR", "Riyal saudita");
    result.put("SBD", "Dólar das Ilhas Salomão");
    result.put("SCR", "Rupia seichelense");
    result.put("SDD", "Dinar sudanês (1992–2007)");
    result.put("SDG", "Libra sudanesa");
    result.put("SDP", "Libra sudanesa (1957–1998)");
    result.put("SEK", "Coroa sueca");
    result.put("SGD", "Dólar singapuriano");
    result.put("SHP", "Libra de Santa Helena");
    result.put("SIT", "Tolar Bons esloveno");
    result.put("SKK", "Coroa eslovaca");
    result.put("SLL", "Leone de Serra Leoa");
    result.put("SOS", "Xelim somali");
    result.put("SRD", "Dólar surinamês");
    result.put("SRG", "Florim do Suriname");
    result.put("SSP", "Libra sul-sudanesa");
    result.put("STD", "Dobra de São Tomé e Príncipe (1977–2017)");
    result.put("STN", "Dobra de São Tomé e Príncipe");
    result.put("SUR", "Rublo soviético");
    result.put("SVC", "Colom salvadorenho");
    result.put("SYP", "Libra síria");
    result.put("SZL", "Lilangeni suazi");
    result.put("THB", "Baht tailandês");
    result.put("TJR", "Rublo do Tadjiquistão");
    result.put("TJS", "Somoni tadjique");
    result.put("TMM", "Manat do Turcomenistão (1993–2009)");
    result.put("TMT", "Manat turcomeno");
    result.put("TND", "Dinar tunisiano");
    result.put("TOP", "Paʻanga tonganesa");
    result.put("TPE", "Escudo timorense");
    result.put("TRL", "Lira turca (1922–2005)");
    result.put("TRY", "Lira turca");
    result.put("TTD", "Dólar de Trinidad e Tobago");
    result.put("TWD", "Novo dólar taiwanês");
    result.put("TZS", "Xelim tanzaniano");
    result.put("UAH", "Hryvnia ucraniano");
    result.put("UAK", "Karbovanetz ucraniano");
    result.put("UGS", "Xelim ugandense (1966–1987)");
    result.put("UGX", "Xelim ugandense");
    result.put("USD", "Dólar americano");
    result.put("USN", "Dólar norte-americano (Dia seguinte)");
    result.put("USS", "Dólar norte-americano (Mesmo dia)");
    result.put("UYI", "Peso uruguaio en unidades indexadas");
    result.put("UYP", "Peso uruguaio (1975–1993)");
    result.put("UYU", "Peso uruguaio");
    result.put("UZS", "Som uzbeque");
    result.put("VEB", "Bolívar venezuelano (1871–2008)");
    result.put("VEF", "Bolívar venezuelano (2008–2018)");
    result.put("VES", "Bolívar venezuelano");
    result.put("VND", "Dong vietnamita");
    result.put("VNN", "Dong vietnamita (1978–1985)");
    result.put("VUV", "Vatu de Vanuatu");
    result.put("WST", "Tala samoano");
    result.put("XAF", "Franco CFA de BEAC");
    result.put("XAG", "Prata");
    result.put("XAU", "Ouro");
    result.put("XBA", "Unidade Composta Europeia");
    result.put("XBB", "Unidade Monetária Europeia");
    result.put("XBC", "Unidade de Conta Europeia (XBC)");
    result.put("XBD", "Unidade de Conta Europeia (XBD)");
    result.put("XCD", "Dólar do Caribe Oriental");
    result.put("XDR", "Direitos Especiais de Giro");
    result.put("XEU", "Unidade de Moeda Europeia");
    result.put("XFO", "Franco-ouro francês");
    result.put("XFU", "Franco UIC francês");
    result.put("XOF", "Franco CFA de BCEAO");
    result.put("XPD", "Paládio");
    result.put("XPF", "Franco CFP");
    result.put("XPT", "Platina");
    result.put("XRE", "Fundos RINET");
    result.put("XTS", "Código de Moeda de Teste");
    result.put("XXX", "Moeda desconhecida");
    result.put("YDD", "Dinar iemenita");
    result.put("YER", "Rial iemenita");
    result.put("YUD", "Dinar forte iugoslavo (1966–1990)");
    result.put("YUM", "Dinar noviy iugoslavo (1994–2002)");
    result.put("YUN", "Dinar conversível iugoslavo (1990–1992)");
    result.put("YUR", "Dinar reformado iugoslavo (1992–1993)");
    result.put("ZAL", "Rand sul-africano (financeiro)");
    result.put("ZAR", "Rand sul-africano");
    result.put("ZMK", "Cuacha zambiano (1968–2012)");
    result.put("ZMW", "Kwacha zambiano");
    result.put("ZRN", "Zaire Novo zairense (1993–1998)");
    result.put("ZRZ", "Zaire zairense (1971–1993)");
    result.put("ZWD", "Dólar do Zimbábue (1980–2008)");
    result.put("ZWL", "Dólar do Zimbábue (2009)");
    result.put("ZWR", "Dólar do Zimbábue (2008)");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "ADP": "Peseta de Andorra",
      "AED": "Dirham dos Emirados Árabes Unidos",
      "AFA": "Afegane (1927–2002)",
      "AFN": "Afegane afegão",
      "ALK": "Lek Albanês (1946–1965)",
      "ALL": "Lek albanês",
      "AMD": "Dram armênio",
      "ANG": "Florim das Antilhas Holandesas",
      "AOA": "Kwanza angolano",
      "AOK": "Cuanza angolano (1977–1990)",
      "AON": "Novo cuanza angolano (1990–2000)",
      "AOR": "Cuanza angolano reajustado (1995–1999)",
      "ARA": "Austral argentino",
      "ARL": "Peso lei argentino (1970–1983)",
      "ARM": "Peso argentino (1881–1970)",
      "ARP": "Peso argentino (1983–1985)",
      "ARS": "Peso argentino",
      "ATS": "Xelim austríaco",
      "AUD": "Dólar australiano",
      "AWG": "Florim arubano",
      "AZM": "Manat azerbaijano (1993–2006)",
      "AZN": "Manat azeri",
      "BAD": "Dinar da Bósnia-Herzegovina (1992–1994)",
      "BAM": "Marco conversível da Bósnia e Herzegovina",
      "BAN": "Novo dinar da Bósnia-Herzegovina (1994–1997)",
      "BBD": "Dólar barbadense",
      "BDT": "Taka bengali",
      "BEC": "Franco belga (conversível)",
      "BEF": "Franco belga",
      "BEL": "Franco belga (financeiro)",
      "BGL": "Lev forte búlgaro",
      "BGM": "Lev socialista búlgaro",
      "BGN": "Lev búlgaro",
      "BGO": "Lev búlgaro (1879–1952)",
      "BHD": "Dinar bareinita",
      "BIF": "Franco burundiano",
      "BMD": "Dólar bermudense",
      "BND": "Dólar bruneano",
      "BOB": "Boliviano da Bolívia",
      "BOL": "Boliviano (1863–1963)",
      "BOP": "Peso boliviano",
      "BOV": "Mvdol boliviano",
      "BRB": "Cruzeiro novo brasileiro (1967–1986)",
      "BRC": "Cruzado brasileiro (1986–1989)",
      "BRE": "Cruzeiro brasileiro (1990–1993)",
      "BRL": "Real brasileiro",
      "BRN": "Cruzado novo brasileiro (1989–1990)",
      "BRR": "Cruzeiro brasileiro (1993–1994)",
      "BRZ": "Cruzeiro brasileiro (1942–1967)",
      "BSD": "Dólar bahamense",
      "BTN": "Ngultrum butanês",
      "BUK": "Kyat birmanês",
      "BWP": "Pula botsuanesa",
      "BYB": "Rublo novo bielo-russo (1994–1999)",
      "BYN": "Rublo bielorrusso",
      "BYR": "Rublo bielorrusso (2000–2016)",
      "BZD": "Dólar belizenho",
      "CAD": "Dólar canadense",
      "CDF": "Franco congolês",
      "CHE": "Euro WIR",
      "CHF": "Franco suíço",
      "CHW": "Franco WIR",
      "CLE": "Escudo chileno",
      "CLF": "Unidades de Fomento chilenas",
      "CLP": "Peso chileno",
      "CNH": "Renminbi chinês (offshore)",
      "CNX": "Dólar do Banco Popular da China",
      "CNY": "Renminbi chinês",
      "COP": "Peso colombiano",
      "COU": "Unidade de Valor Real",
      "CRC": "Colón costarriquenho",
      "CSD": "Dinar sérvio (2002–2006)",
      "CSK": "Coroa Forte checoslovaca",
      "CUC": "Peso cubano conversível",
      "CUP": "Peso cubano",
      "CVE": "Escudo cabo-verdiano",
      "CYP": "Libra cipriota",
      "CZK": "Coroa tcheca",
      "DDM": "Ostmark da Alemanha Oriental",
      "DEM": "Marco alemão",
      "DJF": "Franco djiboutiano",
      "DKK": "Coroa dinamarquesa",
      "DOP": "Peso dominicano",
      "DZD": "Dinar argelino",
      "ECS": "Sucre equatoriano",
      "ECV": "Unidade de Valor Constante (UVC) do Equador",
      "EEK": "Coroa estoniana",
      "EGP": "Libra egípcia",
      "ERN": "Nakfa da Eritreia",
      "ESA": "Peseta espanhola (conta A)",
      "ESB": "Peseta espanhola (conta conversível)",
      "ESP": "Peseta espanhola",
      "ETB": "Birr etíope",
      "EUR": "Euro",
      "FIM": "Marca finlandesa",
      "FJD": "Dólar fijiano",
      "FKP": "Libra malvinense",
      "FRF": "Franco francês",
      "GBP": "Libra esterlina",
      "GEK": "Cupom Lari georgiano",
      "GEL": "Lari georgiano",
      "GHC": "Cedi de Gana (1979–2007)",
      "GHS": "Cedi ganês",
      "GIP": "Libra de Gibraltar",
      "GMD": "Dalasi gambiano",
      "GNF": "Franco guineano",
      "GNS": "Syli da Guiné",
      "GQE": "Ekwele da Guiné Equatorial",
      "GRD": "Dracma grego",
      "GTQ": "Quetzal guatemalteco",
      "GWE": "Escudo da Guiné Portuguesa",
      "GWP": "Peso da Guiné-Bissau",
      "GYD": "Dólar guianense",
      "HKD": "Dólar de Hong Kong",
      "HNL": "Lempira hondurenha",
      "HRD": "Dinar croata",
      "HRK": "Kuna croata",
      "HTG": "Gourde haitiano",
      "HUF": "Florim húngaro",
      "IDR": "Rupia indonésia",
      "IEP": "Libra irlandesa",
      "ILP": "Libra israelita",
      "ILR": "Sheqel antigo israelita",
      "ILS": "Novo shekel israelense",
      "INR": "Rupia indiana",
      "IQD": "Dinar iraquiano",
      "IRR": "Rial iraniano",
      "ISJ": "Coroa antiga islandesa",
      "ISK": "Coroa islandesa",
      "ITL": "Lira italiana",
      "JMD": "Dólar jamaicano",
      "JOD": "Dinar jordaniano",
      "JPY": "Iene japonês",
      "KES": "Xelim queniano",
      "KGS": "Som quirguiz",
      "KHR": "Riel cambojano",
      "KMF": "Franco comoriano",
      "KPW": "Won norte-coreano",
      "KRH": "Hwan da Coreia do Sul (1953–1962)",
      "KRO": "Won da Coreia do Sul (1945–1953)",
      "KRW": "Won sul-coreano",
      "KWD": "Dinar kuwaitiano",
      "KYD": "Dólar das Ilhas Cayman",
      "KZT": "Tenge cazaque",
      "LAK": "Kip laosiano",
      "LBP": "Libra libanesa",
      "LKR": "Rupia do Sri Lanka",
      "LRD": "Dólar liberiano",
      "LSL": "Loti do Lesoto",
      "LTL": "Litas lituano",
      "LTT": "Talonas lituano",
      "LUC": "Franco conversível de Luxemburgo",
      "LUF": "Franco luxemburguês",
      "LUL": "Franco financeiro de Luxemburgo",
      "LVL": "Lats letão",
      "LVR": "Rublo letão",
      "LYD": "Dinar líbio",
      "MAD": "Dirham marroquino",
      "MAF": "Franco marroquino",
      "MCF": "Franco monegasco",
      "MDC": "Cupon moldávio",
      "MDL": "Leu moldávio",
      "MGA": "Ariary malgaxe",
      "MGF": "Franco de Madagascar",
      "MKD": "Dinar macedônio",
      "MKN": "Dinar macedônio (1992–1993)",
      "MLF": "Franco de Mali",
      "MMK": "Quiat de Myanmar",
      "MNT": "Tugrik mongol",
      "MOP": "Pataca de Macau",
      "MRO": "Ouguiya mauritana (1973–2017)",
      "MRU": "Ouguiya mauritana",
      "MTL": "Lira maltesa",
      "MTP": "Libra maltesa",
      "MUR": "Rupia mauriciana",
      "MVR": "Rupia maldivana",
      "MWK": "Kwacha malauiana",
      "MXN": "Peso mexicano",
      "MXP": "Peso Prata mexicano (1861–1992)",
      "MXV": "Unidade Mexicana de Investimento (UDI)",
      "MYR": "Ringgit malaio",
      "MZE": "Escudo de Moçambique",
      "MZM": "Metical de Moçambique (1980–2006)",
      "MZN": "Metical moçambicano",
      "NAD": "Dólar namibiano",
      "NGN": "Naira nigeriana",
      "NIC": "Córdoba nicaraguense (1988–1991)",
      "NIO": "Córdoba nicaraguense",
      "NLG": "Florim holandês",
      "NOK": "Coroa norueguesa",
      "NPR": "Rupia nepalesa",
      "NZD": "Dólar neozelandês",
      "OMR": "Rial omanense",
      "PAB": "Balboa panamenho",
      "PEI": "Inti peruano",
      "PEN": "Novo sol peruano",
      "PES": "Sol peruano (1863–1965)",
      "PGK": "Kina papuásia",
      "PHP": "Peso filipino",
      "PKR": "Rupia paquistanesa",
      "PLN": "Zloty polonês",
      "PLZ": "Zloti polonês (1950–1995)",
      "PTE": "Escudo português",
      "PYG": "Guarani paraguaio",
      "QAR": "Rial catariano",
      "RHD": "Dólar rodesiano",
      "ROL": "Leu romeno (1952–2006)",
      "RON": "Leu romeno",
      "RSD": "Dinar sérvio",
      "RUB": "Rublo russo",
      "RUR": "Rublo russo (1991–1998)",
      "RWF": "Franco ruandês",
      "SAR": "Riyal saudita",
      "SBD": "Dólar das Ilhas Salomão",
      "SCR": "Rupia seichelense",
      "SDD": "Dinar sudanês (1992–2007)",
      "SDG": "Libra sudanesa",
      "SDP": "Libra sudanesa (1957–1998)",
      "SEK": "Coroa sueca",
      "SGD": "Dólar singapuriano",
      "SHP": "Libra de Santa Helena",
      "SIT": "Tolar Bons esloveno",
      "SKK": "Coroa eslovaca",
      "SLL": "Leone de Serra Leoa",
      "SOS": "Xelim somali",
      "SRD": "Dólar surinamês",
      "SRG": "Florim do Suriname",
      "SSP": "Libra sul-sudanesa",
      "STD": "Dobra de São Tomé e Príncipe (1977–2017)",
      "STN": "Dobra de São Tomé e Príncipe",
      "SUR": "Rublo soviético",
      "SVC": "Colom salvadorenho",
      "SYP": "Libra síria",
      "SZL": "Lilangeni suazi",
      "THB": "Baht tailandês",
      "TJR": "Rublo do Tadjiquistão",
      "TJS": "Somoni tadjique",
      "TMM": "Manat do Turcomenistão (1993–2009)",
      "TMT": "Manat turcomeno",
      "TND": "Dinar tunisiano",
      "TOP": "Paʻanga tonganesa",
      "TPE": "Escudo timorense",
      "TRL": "Lira turca (1922–2005)",
      "TRY": "Lira turca",
      "TTD": "Dólar de Trinidad e Tobago",
      "TWD": "Novo dólar taiwanês",
      "TZS": "Xelim tanzaniano",
      "UAH": "Hryvnia ucraniano",
      "UAK": "Karbovanetz ucraniano",
      "UGS": "Xelim ugandense (1966–1987)",
      "UGX": "Xelim ugandense",
      "USD": "Dólar americano",
      "USN": "Dólar norte-americano (Dia seguinte)",
      "USS": "Dólar norte-americano (Mesmo dia)",
      "UYI": "Peso uruguaio en unidades indexadas",
      "UYP": "Peso uruguaio (1975–1993)",
      "UYU": "Peso uruguaio",
      "UZS": "Som uzbeque",
      "VEB": "Bolívar venezuelano (1871–2008)",
      "VEF": "Bolívar venezuelano (2008–2018)",
      "VES": "Bolívar venezuelano",
      "VND": "Dong vietnamita",
      "VNN": "Dong vietnamita (1978–1985)",
      "VUV": "Vatu de Vanuatu",
      "WST": "Tala samoano",
      "XAF": "Franco CFA de BEAC",
      "XAG": "Prata",
      "XAU": "Ouro",
      "XBA": "Unidade Composta Europeia",
      "XBB": "Unidade Monetária Europeia",
      "XBC": "Unidade de Conta Europeia (XBC)",
      "XBD": "Unidade de Conta Europeia (XBD)",
      "XCD": "Dólar do Caribe Oriental",
      "XDR": "Direitos Especiais de Giro",
      "XEU": "Unidade de Moeda Europeia",
      "XFO": "Franco-ouro francês",
      "XFU": "Franco UIC francês",
      "XOF": "Franco CFA de BCEAO",
      "XPD": "Paládio",
      "XPF": "Franco CFP",
      "XPT": "Platina",
      "XRE": "Fundos RINET",
      "XTS": "Código de Moeda de Teste",
      "XXX": "Moeda desconhecida",
      "YDD": "Dinar iemenita",
      "YER": "Rial iemenita",
      "YUD": "Dinar forte iugoslavo (1966–1990)",
      "YUM": "Dinar noviy iugoslavo (1994–2002)",
      "YUN": "Dinar conversível iugoslavo (1990–1992)",
      "YUR": "Dinar reformado iugoslavo (1992–1993)",
      "ZAL": "Rand sul-africano (financeiro)",
      "ZAR": "Rand sul-africano",
      "ZMK": "Cuacha zambiano (1968–2012)",
      "ZMW": "Kwacha zambiano",
      "ZRN": "Zaire Novo zairense (1993–1998)",
      "ZRZ": "Zaire zairense (1971–1993)",
      "ZWD": "Dólar do Zimbábue (1980–2008)",
      "ZWL": "Dólar do Zimbábue (2009)",
      "ZWR": "Dólar do Zimbábue (2008)",
    };
  }-*/;
}
