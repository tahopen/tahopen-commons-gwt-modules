package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_de extends com.google.gwt.i18n.client.CurrencyList_ {
  
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
    // Andorranische Pesete
    result.put("ADP", new CurrencyDataImpl("ADP", "ADP", 128, "ADP", "ADP"));
    // VAE-Dirham
    result.put("AED", new CurrencyDataImpl("AED", "DH", 2, "DH", "dh"));
    // Afghanische Afghani (1927–2002)
    result.put("AFA", new CurrencyDataImpl("AFA", "AFA", 130, "AFA", "AFA"));
    // Afghanischer Afghani
    result.put("AFN", new CurrencyDataImpl("AFN", "AFN", 0, "AFN", "Af."));
    // Albanischer Lek (1946–1965)
    result.put("ALK", new CurrencyDataImpl("ALK", "ALK", 130, "ALK", "ALK"));
    // Albanischer Lek
    result.put("ALL", new CurrencyDataImpl("ALL", "ALL", 0, "ALL", "Lek"));
    // Armenischer Dram
    result.put("AMD", new CurrencyDataImpl("AMD", "AMD", 2, "AMD", "Dram"));
    // Niederländische-Antillen-Gulden
    result.put("ANG", new CurrencyDataImpl("ANG", "ANG", 2, "ANG", "ANG"));
    // Angolanischer Kwanza
    result.put("AOA", new CurrencyDataImpl("AOA", "AOA", 2, "AOA", "Kz"));
    // Angolanischer Kwanza (1977–1990)
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130, "AOK", "AOK"));
    // Angolanischer Neuer Kwanza (1990–2000)
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130, "AON", "AON"));
    // Angolanischer Kwanza Reajustado (1995–1999)
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130, "AOR", "AOR"));
    // Argentinischer Austral
    result.put("ARA", new CurrencyDataImpl("ARA", "ARA", 130, "ARA", "ARA"));
    // Argentinischer Peso Ley (1970–1983)
    result.put("ARL", new CurrencyDataImpl("ARL", "ARL", 130, "ARL", "ARL"));
    // Argentinischer Peso (1881–1970)
    result.put("ARM", new CurrencyDataImpl("ARM", "ARM", 130, "ARM", "ARM"));
    // Argentinischer Peso (1983–1985)
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130, "ARP", "ARP"));
    // Argentinischer Peso
    result.put("ARS", new CurrencyDataImpl("ARS", "AR$", 2, "AR$", "$"));
    // Österreichischer Schilling
    result.put("ATS", new CurrencyDataImpl("ATS", "öS", 130, "öS", "öS"));
    // Australischer Dollar
    result.put("AUD", new CurrencyDataImpl("AUD", "AU$", 2, "AU$", "$"));
    // Aruba-Florin
    result.put("AWG", new CurrencyDataImpl("AWG", "AWG", 2, "AWG", "Afl."));
    // Aserbaidschan-Manat (1993–2006)
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130, "AZM", "AZM"));
    // Aserbaidschan-Manat
    result.put("AZN", new CurrencyDataImpl("AZN", "AZN", 2, "AZN", "man."));
    // Bosnien und Herzegowina Dinar (1992–1994)
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130, "BAD", "BAD"));
    // Bosnien und Herzegowina Konvertierbare Mark
    result.put("BAM", new CurrencyDataImpl("BAM", "BAM", 2, "BAM", "KM"));
    // Bosnien und Herzegowina Neuer Dinar (1994–1997)
    result.put("BAN", new CurrencyDataImpl("BAN", "BAN", 130, "BAN", "BAN"));
    // Barbados-Dollar
    result.put("BBD", new CurrencyDataImpl("BBD", "BBD", 2, "BBD", "$"));
    // Bangladesch-Taka
    result.put("BDT", new CurrencyDataImpl("BDT", "Tk", 2, "Tk", "৳"));
    // Belgischer Franc (konvertibel)
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 130, "BEC", "BEC"));
    // Belgischer Franc
    result.put("BEF", new CurrencyDataImpl("BEF", "BEF", 130, "BEF", "BEF"));
    // Belgischer Finanz-Franc
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 130, "BEL", "BEL"));
    // Bulgarische Lew (1962–1999)
    result.put("BGL", new CurrencyDataImpl("BGL", "BGL", 130, "BGL", "BGL"));
    // Bulgarischer Lew (1952–1962)
    result.put("BGM", new CurrencyDataImpl("BGM", "BGK", 130, "BGK", "BGK"));
    // Bulgarischer Lew
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2, "BGN", "lev"));
    // Bulgarischer Lew (1879–1952)
    result.put("BGO", new CurrencyDataImpl("BGO", "BGJ", 130, "BGJ", "BGJ"));
    // Bahrain-Dinar
    result.put("BHD", new CurrencyDataImpl("BHD", "BHD", 3, "BHD", "din"));
    // Burundi-Franc
    result.put("BIF", new CurrencyDataImpl("BIF", "BIF", 0, "BIF", "FBu"));
    // Bermuda-Dollar
    result.put("BMD", new CurrencyDataImpl("BMD", "BMD", 2, "BMD", "$"));
    // Brunei-Dollar
    result.put("BND", new CurrencyDataImpl("BND", "BND", 2, "BND", "$"));
    // Bolivianischer Boliviano
    result.put("BOB", new CurrencyDataImpl("BOB", "BOB", 2, "BOB", "Bs"));
    // Bolivianischer Boliviano (1863–1963)
    result.put("BOL", new CurrencyDataImpl("BOL", "BOL", 130, "BOL", "BOL"));
    // Bolivianischer Peso
    result.put("BOP", new CurrencyDataImpl("BOP", "BOP", 130, "BOP", "BOP"));
    // Boliviansiche Mvdol
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 130, "BOV", "BOV"));
    // Brasilianischer Cruzeiro Novo (1967–1986)
    result.put("BRB", new CurrencyDataImpl("BRB", "BRB", 130, "BRB", "BRB"));
    // Brasilianischer Cruzado (1986–1989)
    result.put("BRC", new CurrencyDataImpl("BRC", "BRC", 130, "BRC", "BRC"));
    // Brasilianischer Cruzeiro (1990–1993)
    result.put("BRE", new CurrencyDataImpl("BRE", "BRE", 130, "BRE", "BRE"));
    // Brasilianischer Real
    result.put("BRL", new CurrencyDataImpl("BRL", "R$", 2, "R$", "R$"));
    // Brasilianischer Cruzado Novo (1989–1990)
    result.put("BRN", new CurrencyDataImpl("BRN", "BRN", 130, "BRN", "BRN"));
    // Brasilianischer Cruzeiro (1993–1994)
    result.put("BRR", new CurrencyDataImpl("BRR", "BRR", 130, "BRR", "BRR"));
    // Brasilianischer Cruzeiro (1942–1967)
    result.put("BRZ", new CurrencyDataImpl("BRZ", "BRZ", 130, "BRZ", "BRZ"));
    // Bahamas-Dollar
    result.put("BSD", new CurrencyDataImpl("BSD", "BSD", 2, "BSD", "$"));
    // Bhutan-Ngultrum
    result.put("BTN", new CurrencyDataImpl("BTN", "BTN", 2, "BTN", "Nu."));
    // Birmanischer Kyat
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130, "BUK", "BUK"));
    // Botswanischer Pula
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2, "BWP", "P"));
    // Belarus-Rubel (1994–1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130, "BYB", "BYB"));
    // Weißrussischer Rubel
    result.put("BYN", new CurrencyDataImpl("BYN", "BYN", 2, "BYN", "BYN"));
    // Weißrussischer Rubel (2000–2016)
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 128, "BYR", "BYR"));
    // Belize-Dollar
    result.put("BZD", new CurrencyDataImpl("BZD", "BZD", 2, "BZD", "$"));
    // Kanadischer Dollar
    result.put("CAD", new CurrencyDataImpl("CAD", "CA$", 2, "C$", "$"));
    // Kongo-Franc
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2, "CDF", "FrCD"));
    // WIR-Euro
    result.put("CHE", new CurrencyDataImpl("CHE", "CHE", 130, "CHE", "CHE"));
    // Schweizer Franken
    result.put("CHF", new CurrencyDataImpl("CHF", "CHF", 2, "CHF", "CHF"));
    // WIR Franken
    result.put("CHW", new CurrencyDataImpl("CHW", "CHW", 130, "CHW", "CHW"));
    // Chilenischer Escudo
    result.put("CLE", new CurrencyDataImpl("CLE", "CLE", 130, "CLE", "CLE"));
    // Chilenische Unidades de Fomento
    result.put("CLF", new CurrencyDataImpl("CLF", "CLF", 132, "CLF", "CLF"));
    // Chilenischer Peso
    result.put("CLP", new CurrencyDataImpl("CLP", "CL$", 0, "CL$", "$"));
    // Renminbi Yuan (Off–Shore)
    result.put("CNH", new CurrencyDataImpl("CNH", "CNH", 130, "CNH", "CNH"));
    // Dollar der Chinesischen Volksbank
    result.put("CNX", new CurrencyDataImpl("CNX", "CNX", 130, "CNX", "CNX"));
    // Renminbi Yuan
    result.put("CNY", new CurrencyDataImpl("CNY", "CN¥", 2, "RMB¥", "¥"));
    // Kolumbianischer Peso
    result.put("COP", new CurrencyDataImpl("COP", "COL$", 2, "COL$", "$"));
    // Kolumbianische Unidades de valor real
    result.put("COU", new CurrencyDataImpl("COU", "COU", 130, "COU", "COU"));
    // Costa-Rica-Colón
    result.put("CRC", new CurrencyDataImpl("CRC", "CR₡", 2, "CR₡", "₡"));
    // Serbischer Dinar (2002–2006)
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130, "CSD", "CSD"));
    // Tschechoslowakische Krone
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130, "CSK", "CSK"));
    // Kubanischer Peso (konvertibel)
    result.put("CUC", new CurrencyDataImpl("CUC", "CUC", 2, "CUC", "$"));
    // Kubanischer Peso
    result.put("CUP", new CurrencyDataImpl("CUP", "$MN", 2, "$MN", "$"));
    // Cabo-Verde-Escudo
    result.put("CVE", new CurrencyDataImpl("CVE", "CVE", 2, "CVE", "CVE"));
    // Zypern-Pfund
    result.put("CYP", new CurrencyDataImpl("CYP", "CYP", 130, "CYP", "CYP"));
    // Tschechische Krone
    result.put("CZK", new CurrencyDataImpl("CZK", "Kč", 2, "Kč", "Kč"));
    // Mark der DDR
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130, "DDM", "DDM"));
    // Deutsche Mark
    result.put("DEM", new CurrencyDataImpl("DEM", "DM", 130, "DM", "DM"));
    // Dschibuti-Franc
    result.put("DJF", new CurrencyDataImpl("DJF", "Fdj", 0, "Fdj", "Fdj"));
    // Dänische Krone
    result.put("DKK", new CurrencyDataImpl("DKK", "kr", 2, "kr", "kr"));
    // Dominikanischer Peso
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$", "$"));
    // Algerischer Dinar
    result.put("DZD", new CurrencyDataImpl("DZD", "DZD", 2, "DZD", "din"));
    // Ecuadorianischer Sucre
    result.put("ECS", new CurrencyDataImpl("ECS", "ECS", 130, "ECS", "ECS"));
    // Verrechnungseinheit für Ecuador
    result.put("ECV", new CurrencyDataImpl("ECV", "ECV", 130, "ECV", "ECV"));
    // Estnische Krone
    result.put("EEK", new CurrencyDataImpl("EEK", "EEK", 130, "EEK", "EEK"));
    // Ägyptisches Pfund
    result.put("EGP", new CurrencyDataImpl("EGP", "LE", 2, "LE", "E£"));
    // Eritreischer Nakfa
    result.put("ERN", new CurrencyDataImpl("ERN", "ERN", 2, "ERN", "Nfk"));
    // Spanische Peseta (A–Konten)
    result.put("ESA", new CurrencyDataImpl("ESA", "ESA", 130, "ESA", "ESA"));
    // Spanische Peseta (konvertibel)
    result.put("ESB", new CurrencyDataImpl("ESB", "ESB", 130, "ESB", "ESB"));
    // Spanische Peseta
    result.put("ESP", new CurrencyDataImpl("ESP", "ESP", 128, "ESP", "ESP"));
    // Äthiopischer Birr
    result.put("ETB", new CurrencyDataImpl("ETB", "ETB", 2, "ETB", "Birr"));
    // Euro
    result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€", "€"));
    // Finnische Mark
    result.put("FIM", new CurrencyDataImpl("FIM", "FIM", 130, "FIM", "FIM"));
    // Fidschi-Dollar
    result.put("FJD", new CurrencyDataImpl("FJD", "FJD", 2, "FJD", "$"));
    // Falkland-Pfund
    result.put("FKP", new CurrencyDataImpl("FKP", "FKP", 2, "FKP", "£"));
    // Französischer Franc
    result.put("FRF", new CurrencyDataImpl("FRF", "FRF", 130, "FRF", "FRF"));
    // Britisches Pfund
    result.put("GBP", new CurrencyDataImpl("GBP", "£", 2, "GB£", "£"));
    // Georgischer Kupon Larit
    result.put("GEK", new CurrencyDataImpl("GEK", "GEK", 130, "GEK", "GEK"));
    // Georgischer Lari
    result.put("GEL", new CurrencyDataImpl("GEL", "₾", 2, "₾", "GEL"));
    // Ghanaischer Cedi (1979–2007)
    result.put("GHC", new CurrencyDataImpl("GHC", "GHC", 130, "GHC", "GHC"));
    // Ghanaischer Cedi
    result.put("GHS", new CurrencyDataImpl("GHS", "GHS", 2, "GHS", "GHS"));
    // Gibraltar-Pfund
    result.put("GIP", new CurrencyDataImpl("GIP", "GIP", 2, "GIP", "£"));
    // Gambia-Dalasi
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2, "GMD", "GMD"));
    // Guinea-Franc
    result.put("GNF", new CurrencyDataImpl("GNF", "GNF", 0, "GNF", "FG"));
    // Guineischer Syli
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130, "GNS", "GNS"));
    // Äquatorialguinea-Ekwele
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130, "GQE", "GQE"));
    // Griechische Drachme
    result.put("GRD", new CurrencyDataImpl("GRD", "GRD", 130, "GRD", "GRD"));
    // Guatemaltekischer Quetzal
    result.put("GTQ", new CurrencyDataImpl("GTQ", "GTQ", 2, "GTQ", "Q"));
    // Portugiesisch Guinea Escudo
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130, "GWE", "GWE"));
    // Guinea-Bissau Peso
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 130, "GWP", "GWP"));
    // Guyana-Dollar
    result.put("GYD", new CurrencyDataImpl("GYD", "GYD", 2, "GYD", "$"));
    // Hongkong-Dollar
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$", "$"));
    // Honduras-Lempira
    result.put("HNL", new CurrencyDataImpl("HNL", "L", 2, "L", "L"));
    // Kroatischer Dinar
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130, "HRD", "HRD"));
    // Kroatischer Kuna
    result.put("HRK", new CurrencyDataImpl("HRK", "HRK", 2, "HRK", "kn"));
    // Haitianische Gourde
    result.put("HTG", new CurrencyDataImpl("HTG", "HTG", 2, "HTG", "HTG"));
    // Ungarischer Forint
    result.put("HUF", new CurrencyDataImpl("HUF", "HUF", 2, "HUF", "Ft"));
    // Indonesische Rupiah
    result.put("IDR", new CurrencyDataImpl("IDR", "IDR", 2, "IDR", "Rp"));
    // Irisches Pfund
    result.put("IEP", new CurrencyDataImpl("IEP", "IEP", 130, "IEP", "IEP"));
    // Israelisches Pfund
    result.put("ILP", new CurrencyDataImpl("ILP", "ILP", 130, "ILP", "ILP"));
    // Israelischer Schekel (1980–1985)
    result.put("ILR", new CurrencyDataImpl("ILR", "ILR", 130, "ILR", "ILR"));
    // Israelischer Neuer Schekel
    result.put("ILS", new CurrencyDataImpl("ILS", "₪", 2, "IL₪", "₪"));
    // Indische Rupie
    result.put("INR", new CurrencyDataImpl("INR", "₹", 2, "Rs", "₹"));
    // Irakischer Dinar
    result.put("IQD", new CurrencyDataImpl("IQD", "IQD", 0, "IQD", "din"));
    // Iranischer Rial
    result.put("IRR", new CurrencyDataImpl("IRR", "IRR", 0, "IRR", "Rial"));
    // Isländische Krone (1918–1981)
    result.put("ISJ", new CurrencyDataImpl("ISJ", "ISJ", 130, "ISJ", "ISJ"));
    // Isländische Krone
    result.put("ISK", new CurrencyDataImpl("ISK", "kr", 0, "kr", "kr"));
    // Italienische Lira
    result.put("ITL", new CurrencyDataImpl("ITL", "ITL", 128, "ITL", "ITL"));
    // Jamaika-Dollar
    result.put("JMD", new CurrencyDataImpl("JMD", "JA$", 2, "JA$", "$"));
    // Jordanischer Dinar
    result.put("JOD", new CurrencyDataImpl("JOD", "JOD", 3, "JOD", "din"));
    // Japanischer Yen
    result.put("JPY", new CurrencyDataImpl("JPY", "¥", 0, "JP¥", "¥"));
    // Kenia-Schilling
    result.put("KES", new CurrencyDataImpl("KES", "Ksh", 2, "Ksh", "Ksh"));
    // Kirgisischer Som
    result.put("KGS", new CurrencyDataImpl("KGS", "KGS", 2, "KGS", "KGS"));
    // Kambodschanischer Riel
    result.put("KHR", new CurrencyDataImpl("KHR", "KHR", 2, "KHR", "Riel"));
    // Komoren-Franc
    result.put("KMF", new CurrencyDataImpl("KMF", "KMF", 0, "KMF", "CF"));
    // Nordkoreanischer Won
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 0, "KPW", "₩"));
    // Südkoreanischer Hwan (1953–1962)
    result.put("KRH", new CurrencyDataImpl("KRH", "KRH", 130, "KRH", "KRH"));
    // Südkoreanischer Won (1945–1953)
    result.put("KRO", new CurrencyDataImpl("KRO", "KRO", 130, "KRO", "KRO"));
    // Südkoreanischer Won
    result.put("KRW", new CurrencyDataImpl("KRW", "₩", 0, "KR₩", "₩"));
    // Kuwait-Dinar
    result.put("KWD", new CurrencyDataImpl("KWD", "KWD", 3, "KWD", "din"));
    // Kaiman-Dollar
    result.put("KYD", new CurrencyDataImpl("KYD", "KYD", 2, "KYD", "$"));
    // Kasachischer Tenge
    result.put("KZT", new CurrencyDataImpl("KZT", "KZT", 2, "KZT", "₸"));
    // Laotischer Kip
    result.put("LAK", new CurrencyDataImpl("LAK", "LAK", 0, "LAK", "₭"));
    // Libanesisches Pfund
    result.put("LBP", new CurrencyDataImpl("LBP", "LBP", 0, "LBP", "L£"));
    // Sri-Lanka-Rupie
    result.put("LKR", new CurrencyDataImpl("LKR", "SLRs", 2, "SLRs", "Rs"));
    // Liberianischer Dollar
    result.put("LRD", new CurrencyDataImpl("LRD", "LRD", 2, "LRD", "$"));
    // Loti
    result.put("LSL", new CurrencyDataImpl("LSL", "LSL", 2, "LSL", "LSL"));
    // Litauischer Litas
    result.put("LTL", new CurrencyDataImpl("LTL", "LTL", 130, "LTL", "Lt"));
    // Litauischer Talonas
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130, "LTT", "LTT"));
    // Luxemburgischer Franc (konvertibel)
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 130, "LUC", "LUC"));
    // Luxemburgischer Franc
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128, "LUF", "LUF"));
    // Luxemburgischer Finanz-Franc
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 130, "LUL", "LUL"));
    // Lettischer Lats
    result.put("LVL", new CurrencyDataImpl("LVL", "LVL", 130, "LVL", "Ls"));
    // Lettischer Rubel
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130, "LVR", "LVR"));
    // Libyscher Dinar
    result.put("LYD", new CurrencyDataImpl("LYD", "LYD", 3, "LYD", "din"));
    // Marokkanischer Dirham
    result.put("MAD", new CurrencyDataImpl("MAD", "MAD", 2, "MAD", "MAD"));
    // Marokkanischer Franc
    result.put("MAF", new CurrencyDataImpl("MAF", "MAF", 130, "MAF", "MAF"));
    // Monegassischer Franc
    result.put("MCF", new CurrencyDataImpl("MCF", "MCF", 130, "MCF", "MCF"));
    // Moldau-Cupon
    result.put("MDC", new CurrencyDataImpl("MDC", "MDC", 130, "MDC", "MDC"));
    // Moldau-Leu
    result.put("MDL", new CurrencyDataImpl("MDL", "MDL", 2, "MDL", "MDL"));
    // Madagaskar-Ariary
    result.put("MGA", new CurrencyDataImpl("MGA", "MGA", 0, "MGA", "Ar"));
    // Madagaskar-Franc
    result.put("MGF", new CurrencyDataImpl("MGF", "MGF", 128, "MGF", "MGF"));
    // Mazedonischer Denar
    result.put("MKD", new CurrencyDataImpl("MKD", "MKD", 2, "MKD", "din"));
    // Mazedonischer Denar (1992–1993)
    result.put("MKN", new CurrencyDataImpl("MKN", "MKN", 130, "MKN", "MKN"));
    // Malischer Franc
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130, "MLF", "MLF"));
    // Myanmarischer Kyat
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 0, "MMK", "K"));
    // Mongolischer Tögrög
    result.put("MNT", new CurrencyDataImpl("MNT", "MN₮", 2, "MN₮", "₮"));
    // Macao-Pataca
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP", 2, "MOP", "MOP"));
    // Mauretanischer Ouguiya (1973–2017)
    result.put("MRO", new CurrencyDataImpl("MRO", "MRO", 128, "MRO", "MRO"));
    // Mauretanischer Ouguiya
    result.put("MRU", new CurrencyDataImpl("MRU", "MRU", 2, "MRU", "MRU"));
    // Maltesische Lira
    result.put("MTL", new CurrencyDataImpl("MTL", "MTL", 130, "MTL", "MTL"));
    // Maltesisches Pfund
    result.put("MTP", new CurrencyDataImpl("MTP", "MTP", 130, "MTP", "MTP"));
    // Mauritius-Rupie
    result.put("MUR", new CurrencyDataImpl("MUR", "MUR", 2, "MUR", "Rs"));
    // Malediven-Rupie (alt)
    result.put("MVP", new CurrencyDataImpl("MVP", "MVP", 130, "MVP", "MVP"));
    // Malediven-Rufiyaa
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2, "MVR", "MVR"));
    // Malawi-Kwacha
    result.put("MWK", new CurrencyDataImpl("MWK", "MWK", 2, "MWK", "MWK"));
    // Mexikanischer Peso
    result.put("MXN", new CurrencyDataImpl("MXN", "MX$", 2, "Mex$", "$"));
    // Mexikanischer Silber-Peso (1861–1992)
    result.put("MXP", new CurrencyDataImpl("MXP", "MXP", 130, "MXP", "MXP"));
    // Mexicanischer Unidad de Inversion (UDI)
    result.put("MXV", new CurrencyDataImpl("MXV", "MXV", 130, "MXV", "MXV"));
    // Malaysischer Ringgit
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM", "RM"));
    // Mosambikanischer Escudo
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130, "MZE", "MZE"));
    // Mosambikanischer Metical (1980–2006)
    result.put("MZM", new CurrencyDataImpl("MZM", "MZM", 130, "MZM", "MZM"));
    // Mosambikanischer Metical
    result.put("MZN", new CurrencyDataImpl("MZN", "MZN", 2, "MZN", "MTn"));
    // Namibia-Dollar
    result.put("NAD", new CurrencyDataImpl("NAD", "NAD", 2, "NAD", "$"));
    // Nigerianischer Naira
    result.put("NGN", new CurrencyDataImpl("NGN", "NGN", 2, "NGN", "₦"));
    // Nicaraguanischer Córdoba (1988–1991)
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130, "NIC", "NIC"));
    // Nicaragua-Córdoba
    result.put("NIO", new CurrencyDataImpl("NIO", "NIO", 2, "NIO", "C$"));
    // Niederländischer Gulden
    result.put("NLG", new CurrencyDataImpl("NLG", "NLG", 130, "NLG", "NLG"));
    // Norwegische Krone
    result.put("NOK", new CurrencyDataImpl("NOK", "NOkr", 2, "NOkr", "kr"));
    // Nepalesische Rupie
    result.put("NPR", new CurrencyDataImpl("NPR", "NPR", 2, "NPR", "Rs"));
    // Neuseeland-Dollar
    result.put("NZD", new CurrencyDataImpl("NZD", "NZ$", 2, "NZ$", "$"));
    // Omanischer Rial
    result.put("OMR", new CurrencyDataImpl("OMR", "OMR", 3, "OMR", "Rial"));
    // Panamaischer Balboa
    result.put("PAB", new CurrencyDataImpl("PAB", "B/.", 2, "B/.", "B/."));
    // Peruanischer Inti
    result.put("PEI", new CurrencyDataImpl("PEI", "PEI", 130, "PEI", "PEI"));
    // Peruanischer Sol
    result.put("PEN", new CurrencyDataImpl("PEN", "S/.", 2, "S/.", "S/."));
    // Peruanischer Sol (1863–1965)
    result.put("PES", new CurrencyDataImpl("PES", "PES", 130, "PES", "PES"));
    // Papua-Neuguineischer Kina
    result.put("PGK", new CurrencyDataImpl("PGK", "PGK", 2, "PGK", "PGK"));
    // Philippinischer Peso
    result.put("PHP", new CurrencyDataImpl("PHP", "PHP", 2, "PHP", "₱"));
    // Pakistanische Rupie
    result.put("PKR", new CurrencyDataImpl("PKR", "PKRs.", 2, "PKRs.", "Rs"));
    // Polnischer Złoty
    result.put("PLN", new CurrencyDataImpl("PLN", "PLN", 2, "PLN", "zł"));
    // Polnischer Zloty (1950–1995)
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130, "PLZ", "PLZ"));
    // Portugiesischer Escudo
    result.put("PTE", new CurrencyDataImpl("PTE", "PTE", 130, "PTE", "PTE"));
    // Paraguayischer Guaraní
    result.put("PYG", new CurrencyDataImpl("PYG", "PYG", 0, "PYG", "Gs"));
    // Katar-Riyal
    result.put("QAR", new CurrencyDataImpl("QAR", "QAR", 2, "QAR", "Rial"));
    // Rhodesischer Dollar
    result.put("RHD", new CurrencyDataImpl("RHD", "RHD", 130, "RHD", "RHD"));
    // Rumänischer Leu (1952–2006)
    result.put("ROL", new CurrencyDataImpl("ROL", "ROL", 130, "ROL", "ROL"));
    // Rumänischer Leu
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2, "RON", "RON"));
    // Serbischer Dinar
    result.put("RSD", new CurrencyDataImpl("RSD", "RSD", 0, "RSD", "din"));
    // Russischer Rubel
    result.put("RUB", new CurrencyDataImpl("RUB", "руб.", 2, "руб.", "руб."));
    // Russischer Rubel (1991–1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130, "RUR", "RUR"));
    // Ruanda-Franc
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0, "RWF", "RF"));
    // Saudi-Rial
    result.put("SAR", new CurrencyDataImpl("SAR", "SR", 2, "SR", "Rial"));
    // Salomonen-Dollar
    result.put("SBD", new CurrencyDataImpl("SBD", "SBD", 2, "SBD", "$"));
    // Seychellen-Rupie
    result.put("SCR", new CurrencyDataImpl("SCR", "SCR", 2, "SCR", "SCR"));
    // Sudanesischer Dinar (1992–2007)
    result.put("SDD", new CurrencyDataImpl("SDD", "SDD", 130, "SDD", "SDD"));
    // Sudanesisches Pfund
    result.put("SDG", new CurrencyDataImpl("SDG", "SDG", 2, "SDG", "SDG"));
    // Sudanesisches Pfund (1957–1998)
    result.put("SDP", new CurrencyDataImpl("SDP", "SDP", 130, "SDP", "SDP"));
    // Schwedische Krone
    result.put("SEK", new CurrencyDataImpl("SEK", "kr", 2, "kr", "kr"));
    // Singapur-Dollar
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$", "$"));
    // St. Helena-Pfund
    result.put("SHP", new CurrencyDataImpl("SHP", "SHP", 2, "SHP", "£"));
    // Slowenischer Tolar
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130, "SIT", "SIT"));
    // Slowakische Krone
    result.put("SKK", new CurrencyDataImpl("SKK", "SKK", 130, "SKK", "SKK"));
    // Sierra-leonischer Leone
    result.put("SLL", new CurrencyDataImpl("SLL", "SLL", 0, "SLL", "SLL"));
    // Somalia-Schilling
    result.put("SOS", new CurrencyDataImpl("SOS", "SOS", 0, "SOS", "SOS"));
    // Suriname-Dollar
    result.put("SRD", new CurrencyDataImpl("SRD", "SRD", 2, "SRD", "$"));
    // Suriname Gulden
    result.put("SRG", new CurrencyDataImpl("SRG", "SRG", 130, "SRG", "SRG"));
    // Südsudanesisches Pfund
    result.put("SSP", new CurrencyDataImpl("SSP", "SSP", 2, "SSP", "SSP"));
    // São-toméischer Dobra (1977–2017)
    result.put("STD", new CurrencyDataImpl("STD", "STD", 128, "STD", "Db"));
    // São-toméischer Dobra
    result.put("STN", new CurrencyDataImpl("STN", "STN", 2, "STN", "STN"));
    // Sowjetischer Rubel
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130, "SUR", "SUR"));
    // El Salvador Colon
    result.put("SVC", new CurrencyDataImpl("SVC", "SVC", 130, "SVC", "SVC"));
    // Syrisches Pfund
    result.put("SYP", new CurrencyDataImpl("SYP", "SYP", 0, "SYP", "£"));
    // Swasiländischer Lilangeni
    result.put("SZL", new CurrencyDataImpl("SZL", "SZL", 2, "SZL", "SZL"));
    // Thailändischer Baht
    result.put("THB", new CurrencyDataImpl("THB", "฿", 2, "THB", "฿"));
    // Tadschikistan Rubel
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130, "TJR", "TJR"));
    // Tadschikistan-Somoni
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2, "TJS", "Som"));
    // Turkmenistan-Manat (1993–2009)
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 128, "TMM", "TMM"));
    // Turkmenistan-Manat
    result.put("TMT", new CurrencyDataImpl("TMT", "TMT", 2, "TMT", "TMT"));
    // Tunesischer Dinar
    result.put("TND", new CurrencyDataImpl("TND", "TND", 3, "TND", "din"));
    // Tongaischer Paʻanga
    result.put("TOP", new CurrencyDataImpl("TOP", "TOP", 2, "TOP", "T$"));
    // Timor-Escudo
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130, "TPE", "TPE"));
    // Türkische Lira (1922–2005)
    result.put("TRL", new CurrencyDataImpl("TRL", "TRL", 128, "TRL", "TRL"));
    // Türkische Lira
    result.put("TRY", new CurrencyDataImpl("TRY", "TL", 2, "YTL", "TL"));
    // Trinidad und Tobago-Dollar
    result.put("TTD", new CurrencyDataImpl("TTD", "TTD", 2, "TTD", "$"));
    // Neuer Taiwan-Dollar
    result.put("TWD", new CurrencyDataImpl("TWD", "NT$", 2, "NT$", "NT$"));
    // Tansania-Schilling
    result.put("TZS", new CurrencyDataImpl("TZS", "TZS", 2, "TZS", "TSh"));
    // Ukrainische Hrywnja
    result.put("UAH", new CurrencyDataImpl("UAH", "UAH", 2, "UAH", "₴"));
    // Ukrainischer Karbovanetz
    result.put("UAK", new CurrencyDataImpl("UAK", "UAK", 130, "UAK", "UAK"));
    // Uganda-Schilling (1966–1987)
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130, "UGS", "UGS"));
    // Uganda-Schilling
    result.put("UGX", new CurrencyDataImpl("UGX", "UGX", 0, "UGX", "UGX"));
    // US-Dollar
    result.put("USD", new CurrencyDataImpl("USD", "$", 2, "US$", "$"));
    // US Dollar (Nächster Tag)
    result.put("USN", new CurrencyDataImpl("USN", "USN", 130, "USN", "USN"));
    // US Dollar (Gleicher Tag)
    result.put("USS", new CurrencyDataImpl("USS", "USS", 130, "USS", "USS"));
    // Uruguayischer Peso (Indexierte Rechnungseinheiten)
    result.put("UYI", new CurrencyDataImpl("UYI", "UYI", 128, "UYI", "UYI"));
    // Uruguayischer Peso (1975–1993)
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130, "UYP", "UYP"));
    // Uruguayischer Peso
    result.put("UYU", new CurrencyDataImpl("UYU", "UY$", 2, "UY$", "$"));
    // Usbekistan-Sum
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 2, "UZS", "soʼm"));
    // Venezolanischer Bolívar (1871–2008)
    result.put("VEB", new CurrencyDataImpl("VEB", "VEB", 130, "VEB", "VEB"));
    // Venezolanischer Bolívar (2008–2018)
    result.put("VEF", new CurrencyDataImpl("VEF", "VEF", 130, "VEF", "Bs"));
    // Venezolanischer Bolívar
    result.put("VES", new CurrencyDataImpl("VES", "VES", 2, "VES", "VES"));
    // Vietnamesischer Dong
    result.put("VND", new CurrencyDataImpl("VND", "₫", 24, "₫", "₫"));
    // Vietnamesischer Dong(1978–1985)
    result.put("VNN", new CurrencyDataImpl("VNN", "VNN", 130, "VNN", "VNN"));
    // Vanuatu-Vatu
    result.put("VUV", new CurrencyDataImpl("VUV", "VUV", 0, "VUV", "VUV"));
    // Samoanischer Tala
    result.put("WST", new CurrencyDataImpl("WST", "WST", 2, "WST", "WST"));
    // CFA-Franc (BEAC)
    result.put("XAF", new CurrencyDataImpl("XAF", "FCFA", 0, "FCFA", "FCFA"));
    // Unze Silber
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 130, "XAG", "XAG"));
    // Unze Gold
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 130, "XAU", "XAU"));
    // Europäische Rechnungseinheit
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 130, "XBA", "XBA"));
    // Europäische Währungseinheit (XBB)
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 130, "XBB", "XBB"));
    // Europäische Rechnungseinheit (XBC)
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 130, "XBC", "XBC"));
    // Europäische Rechnungseinheit (XBD)
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 130, "XBD", "XBD"));
    // Ostkaribischer Dollar
    result.put("XCD", new CurrencyDataImpl("XCD", "EC$", 2, "EC$", "$"));
    // Sonderziehungsrechte
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 130, "XDR", "XDR"));
    // Europäische Währungseinheit (XEU)
    result.put("XEU", new CurrencyDataImpl("XEU", "XEU", 130, "XEU", "XEU"));
    // Französischer Gold-Franc
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 130, "XFO", "XFO"));
    // Französischer UIC-Franc
    result.put("XFU", new CurrencyDataImpl("XFU", "XFU", 130, "XFU", "XFU"));
    // CFA-Franc (BCEAO)
    result.put("XOF", new CurrencyDataImpl("XOF", "CFA", 0, "CFA", "CFA"));
    // Unze Palladium
    result.put("XPD", new CurrencyDataImpl("XPD", "XPD", 130, "XPD", "XPD"));
    // CFP-Franc
    result.put("XPF", new CurrencyDataImpl("XPF", "CFPF", 0, "CFPF", "FCFP"));
    // Unze Platin
    result.put("XPT", new CurrencyDataImpl("XPT", "XPT", 130, "XPT", "XPT"));
    // RINET Funds
    result.put("XRE", new CurrencyDataImpl("XRE", "XRE", 130, "XRE", "XRE"));
    // SUCRE
    result.put("XSU", new CurrencyDataImpl("XSU", "XSU", 130, "XSU", "XSU"));
    // Testwährung
    result.put("XTS", new CurrencyDataImpl("XTS", "XTS", 130, "XTS", "XTS"));
    // Rechnungseinheit der AfEB
    result.put("XUA", new CurrencyDataImpl("XUA", "XUA", 130, "XUA", "XUA"));
    // Unbekannte Währung
    result.put("XXX", new CurrencyDataImpl("XXX", "XXX", 130, "XXX", "XXX"));
    // Jemen-Dinar
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130, "YDD", "YDD"));
    // Jemen-Rial
    result.put("YER", new CurrencyDataImpl("YER", "YER", 0, "YER", "Rial"));
    // Jugoslawischer Dinar (1966–1990)
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130, "YUD", "YUD"));
    // Jugoslawischer Neuer Dinar (1994–2002)
    result.put("YUM", new CurrencyDataImpl("YUM", "YUM", 130, "YUM", "YUM"));
    // Jugoslawischer Dinar (konvertibel)
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130, "YUN", "YUN"));
    // Jugoslawischer reformierter Dinar (1992–1993)
    result.put("YUR", new CurrencyDataImpl("YUR", "YUR", 130, "YUR", "YUR"));
    // Südafrikanischer Rand (Finanz)
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 130, "ZAL", "ZAL"));
    // Südafrikanischer Rand
    result.put("ZAR", new CurrencyDataImpl("ZAR", "ZAR", 2, "ZAR", "R"));
    // Kwacha (1968–2012)
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZMK", 128, "ZMK", "ZWK"));
    // Kwacha
    result.put("ZMW", new CurrencyDataImpl("ZMW", "ZMW", 2, "ZMW", "ZMW"));
    // Zaire-Neuer Zaïre (1993–1998)
    result.put("ZRN", new CurrencyDataImpl("ZRN", "ZRN", 130, "ZRN", "ZRN"));
    // Zaire-Zaïre (1971–1993)
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"));
    // Simbabwe-Dollar (1980–2008)
    result.put("ZWD", new CurrencyDataImpl("ZWD", "ZWD", 128, "ZWD", "ZWD"));
    // Simbabwe-Dollar (2009)
    result.put("ZWL", new CurrencyDataImpl("ZWL", "ZWL", 130, "ZWL", "ZWL"));
    // Simbabwe-Dollar (2008)
    result.put("ZWR", new CurrencyDataImpl("ZWR", "ZWR", 130, "ZWR", "ZWR"));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // Andorranische Pesete
      "ADP": [ "ADP", "ADP", 128, "ADP", "ADP"],
      // VAE-Dirham
      "AED": [ "AED", "DH", 2, "DH", "dh"],
      // Afghanische Afghani (1927–2002)
      "AFA": [ "AFA", "AFA", 130, "AFA", "AFA"],
      // Afghanischer Afghani
      "AFN": [ "AFN", "AFN", 0, "AFN", "Af."],
      // Albanischer Lek (1946–1965)
      "ALK": [ "ALK", "ALK", 130, "ALK", "ALK"],
      // Albanischer Lek
      "ALL": [ "ALL", "ALL", 0, "ALL", "Lek"],
      // Armenischer Dram
      "AMD": [ "AMD", "AMD", 2, "AMD", "Dram"],
      // Niederländische-Antillen-Gulden
      "ANG": [ "ANG", "ANG", 2, "ANG", "ANG"],
      // Angolanischer Kwanza
      "AOA": [ "AOA", "AOA", 2, "AOA", "Kz"],
      // Angolanischer Kwanza (1977–1990)
      "AOK": [ "AOK", "AOK", 130, "AOK", "AOK"],
      // Angolanischer Neuer Kwanza (1990–2000)
      "AON": [ "AON", "AON", 130, "AON", "AON"],
      // Angolanischer Kwanza Reajustado (1995–1999)
      "AOR": [ "AOR", "AOR", 130, "AOR", "AOR"],
      // Argentinischer Austral
      "ARA": [ "ARA", "ARA", 130, "ARA", "ARA"],
      // Argentinischer Peso Ley (1970–1983)
      "ARL": [ "ARL", "ARL", 130, "ARL", "ARL"],
      // Argentinischer Peso (1881–1970)
      "ARM": [ "ARM", "ARM", 130, "ARM", "ARM"],
      // Argentinischer Peso (1983–1985)
      "ARP": [ "ARP", "ARP", 130, "ARP", "ARP"],
      // Argentinischer Peso
      "ARS": [ "ARS", "AR$", 2, "AR$", "$"],
      // Österreichischer Schilling
      "ATS": [ "ATS", "öS", 130, "öS", "öS"],
      // Australischer Dollar
      "AUD": [ "AUD", "AU$", 2, "AU$", "$"],
      // Aruba-Florin
      "AWG": [ "AWG", "AWG", 2, "AWG", "Afl."],
      // Aserbaidschan-Manat (1993–2006)
      "AZM": [ "AZM", "AZM", 130, "AZM", "AZM"],
      // Aserbaidschan-Manat
      "AZN": [ "AZN", "AZN", 2, "AZN", "man."],
      // Bosnien und Herzegowina Dinar (1992–1994)
      "BAD": [ "BAD", "BAD", 130, "BAD", "BAD"],
      // Bosnien und Herzegowina Konvertierbare Mark
      "BAM": [ "BAM", "BAM", 2, "BAM", "KM"],
      // Bosnien und Herzegowina Neuer Dinar (1994–1997)
      "BAN": [ "BAN", "BAN", 130, "BAN", "BAN"],
      // Barbados-Dollar
      "BBD": [ "BBD", "BBD", 2, "BBD", "$"],
      // Bangladesch-Taka
      "BDT": [ "BDT", "Tk", 2, "Tk", "৳"],
      // Belgischer Franc (konvertibel)
      "BEC": [ "BEC", "BEC", 130, "BEC", "BEC"],
      // Belgischer Franc
      "BEF": [ "BEF", "BEF", 130, "BEF", "BEF"],
      // Belgischer Finanz-Franc
      "BEL": [ "BEL", "BEL", 130, "BEL", "BEL"],
      // Bulgarische Lew (1962–1999)
      "BGL": [ "BGL", "BGL", 130, "BGL", "BGL"],
      // Bulgarischer Lew (1952–1962)
      "BGM": [ "BGM", "BGK", 130, "BGK", "BGK"],
      // Bulgarischer Lew
      "BGN": [ "BGN", "BGN", 2, "BGN", "lev"],
      // Bulgarischer Lew (1879–1952)
      "BGO": [ "BGO", "BGJ", 130, "BGJ", "BGJ"],
      // Bahrain-Dinar
      "BHD": [ "BHD", "BHD", 3, "BHD", "din"],
      // Burundi-Franc
      "BIF": [ "BIF", "BIF", 0, "BIF", "FBu"],
      // Bermuda-Dollar
      "BMD": [ "BMD", "BMD", 2, "BMD", "$"],
      // Brunei-Dollar
      "BND": [ "BND", "BND", 2, "BND", "$"],
      // Bolivianischer Boliviano
      "BOB": [ "BOB", "BOB", 2, "BOB", "Bs"],
      // Bolivianischer Boliviano (1863–1963)
      "BOL": [ "BOL", "BOL", 130, "BOL", "BOL"],
      // Bolivianischer Peso
      "BOP": [ "BOP", "BOP", 130, "BOP", "BOP"],
      // Boliviansiche Mvdol
      "BOV": [ "BOV", "BOV", 130, "BOV", "BOV"],
      // Brasilianischer Cruzeiro Novo (1967–1986)
      "BRB": [ "BRB", "BRB", 130, "BRB", "BRB"],
      // Brasilianischer Cruzado (1986–1989)
      "BRC": [ "BRC", "BRC", 130, "BRC", "BRC"],
      // Brasilianischer Cruzeiro (1990–1993)
      "BRE": [ "BRE", "BRE", 130, "BRE", "BRE"],
      // Brasilianischer Real
      "BRL": [ "BRL", "R$", 2, "R$", "R$"],
      // Brasilianischer Cruzado Novo (1989–1990)
      "BRN": [ "BRN", "BRN", 130, "BRN", "BRN"],
      // Brasilianischer Cruzeiro (1993–1994)
      "BRR": [ "BRR", "BRR", 130, "BRR", "BRR"],
      // Brasilianischer Cruzeiro (1942–1967)
      "BRZ": [ "BRZ", "BRZ", 130, "BRZ", "BRZ"],
      // Bahamas-Dollar
      "BSD": [ "BSD", "BSD", 2, "BSD", "$"],
      // Bhutan-Ngultrum
      "BTN": [ "BTN", "BTN", 2, "BTN", "Nu."],
      // Birmanischer Kyat
      "BUK": [ "BUK", "BUK", 130, "BUK", "BUK"],
      // Botswanischer Pula
      "BWP": [ "BWP", "BWP", 2, "BWP", "P"],
      // Belarus-Rubel (1994–1999)
      "BYB": [ "BYB", "BYB", 130, "BYB", "BYB"],
      // Weißrussischer Rubel
      "BYN": [ "BYN", "BYN", 2, "BYN", "BYN"],
      // Weißrussischer Rubel (2000–2016)
      "BYR": [ "BYR", "BYR", 128, "BYR", "BYR"],
      // Belize-Dollar
      "BZD": [ "BZD", "BZD", 2, "BZD", "$"],
      // Kanadischer Dollar
      "CAD": [ "CAD", "CA$", 2, "C$", "$"],
      // Kongo-Franc
      "CDF": [ "CDF", "CDF", 2, "CDF", "FrCD"],
      // WIR-Euro
      "CHE": [ "CHE", "CHE", 130, "CHE", "CHE"],
      // Schweizer Franken
      "CHF": [ "CHF", "CHF", 2, "CHF", "CHF"],
      // WIR Franken
      "CHW": [ "CHW", "CHW", 130, "CHW", "CHW"],
      // Chilenischer Escudo
      "CLE": [ "CLE", "CLE", 130, "CLE", "CLE"],
      // Chilenische Unidades de Fomento
      "CLF": [ "CLF", "CLF", 132, "CLF", "CLF"],
      // Chilenischer Peso
      "CLP": [ "CLP", "CL$", 0, "CL$", "$"],
      // Renminbi Yuan (Off–Shore)
      "CNH": [ "CNH", "CNH", 130, "CNH", "CNH"],
      // Dollar der Chinesischen Volksbank
      "CNX": [ "CNX", "CNX", 130, "CNX", "CNX"],
      // Renminbi Yuan
      "CNY": [ "CNY", "CN¥", 2, "RMB¥", "¥"],
      // Kolumbianischer Peso
      "COP": [ "COP", "COL$", 2, "COL$", "$"],
      // Kolumbianische Unidades de valor real
      "COU": [ "COU", "COU", 130, "COU", "COU"],
      // Costa-Rica-Colón
      "CRC": [ "CRC", "CR₡", 2, "CR₡", "₡"],
      // Serbischer Dinar (2002–2006)
      "CSD": [ "CSD", "CSD", 130, "CSD", "CSD"],
      // Tschechoslowakische Krone
      "CSK": [ "CSK", "CSK", 130, "CSK", "CSK"],
      // Kubanischer Peso (konvertibel)
      "CUC": [ "CUC", "CUC", 2, "CUC", "$"],
      // Kubanischer Peso
      "CUP": [ "CUP", "$MN", 2, "$MN", "$"],
      // Cabo-Verde-Escudo
      "CVE": [ "CVE", "CVE", 2, "CVE", "CVE"],
      // Zypern-Pfund
      "CYP": [ "CYP", "CYP", 130, "CYP", "CYP"],
      // Tschechische Krone
      "CZK": [ "CZK", "Kč", 2, "Kč", "Kč"],
      // Mark der DDR
      "DDM": [ "DDM", "DDM", 130, "DDM", "DDM"],
      // Deutsche Mark
      "DEM": [ "DEM", "DM", 130, "DM", "DM"],
      // Dschibuti-Franc
      "DJF": [ "DJF", "Fdj", 0, "Fdj", "Fdj"],
      // Dänische Krone
      "DKK": [ "DKK", "kr", 2, "kr", "kr"],
      // Dominikanischer Peso
      "DOP": [ "DOP", "RD$", 2, "RD$", "$"],
      // Algerischer Dinar
      "DZD": [ "DZD", "DZD", 2, "DZD", "din"],
      // Ecuadorianischer Sucre
      "ECS": [ "ECS", "ECS", 130, "ECS", "ECS"],
      // Verrechnungseinheit für Ecuador
      "ECV": [ "ECV", "ECV", 130, "ECV", "ECV"],
      // Estnische Krone
      "EEK": [ "EEK", "EEK", 130, "EEK", "EEK"],
      // Ägyptisches Pfund
      "EGP": [ "EGP", "LE", 2, "LE", "E£"],
      // Eritreischer Nakfa
      "ERN": [ "ERN", "ERN", 2, "ERN", "Nfk"],
      // Spanische Peseta (A–Konten)
      "ESA": [ "ESA", "ESA", 130, "ESA", "ESA"],
      // Spanische Peseta (konvertibel)
      "ESB": [ "ESB", "ESB", 130, "ESB", "ESB"],
      // Spanische Peseta
      "ESP": [ "ESP", "ESP", 128, "ESP", "ESP"],
      // Äthiopischer Birr
      "ETB": [ "ETB", "ETB", 2, "ETB", "Birr"],
      // Euro
      "EUR": [ "EUR", "€", 2, "€", "€"],
      // Finnische Mark
      "FIM": [ "FIM", "FIM", 130, "FIM", "FIM"],
      // Fidschi-Dollar
      "FJD": [ "FJD", "FJD", 2, "FJD", "$"],
      // Falkland-Pfund
      "FKP": [ "FKP", "FKP", 2, "FKP", "£"],
      // Französischer Franc
      "FRF": [ "FRF", "FRF", 130, "FRF", "FRF"],
      // Britisches Pfund
      "GBP": [ "GBP", "£", 2, "GB£", "£"],
      // Georgischer Kupon Larit
      "GEK": [ "GEK", "GEK", 130, "GEK", "GEK"],
      // Georgischer Lari
      "GEL": [ "GEL", "₾", 2, "₾", "GEL"],
      // Ghanaischer Cedi (1979–2007)
      "GHC": [ "GHC", "GHC", 130, "GHC", "GHC"],
      // Ghanaischer Cedi
      "GHS": [ "GHS", "GHS", 2, "GHS", "GHS"],
      // Gibraltar-Pfund
      "GIP": [ "GIP", "GIP", 2, "GIP", "£"],
      // Gambia-Dalasi
      "GMD": [ "GMD", "GMD", 2, "GMD", "GMD"],
      // Guinea-Franc
      "GNF": [ "GNF", "GNF", 0, "GNF", "FG"],
      // Guineischer Syli
      "GNS": [ "GNS", "GNS", 130, "GNS", "GNS"],
      // Äquatorialguinea-Ekwele
      "GQE": [ "GQE", "GQE", 130, "GQE", "GQE"],
      // Griechische Drachme
      "GRD": [ "GRD", "GRD", 130, "GRD", "GRD"],
      // Guatemaltekischer Quetzal
      "GTQ": [ "GTQ", "GTQ", 2, "GTQ", "Q"],
      // Portugiesisch Guinea Escudo
      "GWE": [ "GWE", "GWE", 130, "GWE", "GWE"],
      // Guinea-Bissau Peso
      "GWP": [ "GWP", "GWP", 130, "GWP", "GWP"],
      // Guyana-Dollar
      "GYD": [ "GYD", "GYD", 2, "GYD", "$"],
      // Hongkong-Dollar
      "HKD": [ "HKD", "HK$", 2, "HK$", "$"],
      // Honduras-Lempira
      "HNL": [ "HNL", "L", 2, "L", "L"],
      // Kroatischer Dinar
      "HRD": [ "HRD", "HRD", 130, "HRD", "HRD"],
      // Kroatischer Kuna
      "HRK": [ "HRK", "HRK", 2, "HRK", "kn"],
      // Haitianische Gourde
      "HTG": [ "HTG", "HTG", 2, "HTG", "HTG"],
      // Ungarischer Forint
      "HUF": [ "HUF", "HUF", 2, "HUF", "Ft"],
      // Indonesische Rupiah
      "IDR": [ "IDR", "IDR", 2, "IDR", "Rp"],
      // Irisches Pfund
      "IEP": [ "IEP", "IEP", 130, "IEP", "IEP"],
      // Israelisches Pfund
      "ILP": [ "ILP", "ILP", 130, "ILP", "ILP"],
      // Israelischer Schekel (1980–1985)
      "ILR": [ "ILR", "ILR", 130, "ILR", "ILR"],
      // Israelischer Neuer Schekel
      "ILS": [ "ILS", "₪", 2, "IL₪", "₪"],
      // Indische Rupie
      "INR": [ "INR", "₹", 2, "Rs", "₹"],
      // Irakischer Dinar
      "IQD": [ "IQD", "IQD", 0, "IQD", "din"],
      // Iranischer Rial
      "IRR": [ "IRR", "IRR", 0, "IRR", "Rial"],
      // Isländische Krone (1918–1981)
      "ISJ": [ "ISJ", "ISJ", 130, "ISJ", "ISJ"],
      // Isländische Krone
      "ISK": [ "ISK", "kr", 0, "kr", "kr"],
      // Italienische Lira
      "ITL": [ "ITL", "ITL", 128, "ITL", "ITL"],
      // Jamaika-Dollar
      "JMD": [ "JMD", "JA$", 2, "JA$", "$"],
      // Jordanischer Dinar
      "JOD": [ "JOD", "JOD", 3, "JOD", "din"],
      // Japanischer Yen
      "JPY": [ "JPY", "¥", 0, "JP¥", "¥"],
      // Kenia-Schilling
      "KES": [ "KES", "Ksh", 2, "Ksh", "Ksh"],
      // Kirgisischer Som
      "KGS": [ "KGS", "KGS", 2, "KGS", "KGS"],
      // Kambodschanischer Riel
      "KHR": [ "KHR", "KHR", 2, "KHR", "Riel"],
      // Komoren-Franc
      "KMF": [ "KMF", "KMF", 0, "KMF", "CF"],
      // Nordkoreanischer Won
      "KPW": [ "KPW", "KPW", 0, "KPW", "₩"],
      // Südkoreanischer Hwan (1953–1962)
      "KRH": [ "KRH", "KRH", 130, "KRH", "KRH"],
      // Südkoreanischer Won (1945–1953)
      "KRO": [ "KRO", "KRO", 130, "KRO", "KRO"],
      // Südkoreanischer Won
      "KRW": [ "KRW", "₩", 0, "KR₩", "₩"],
      // Kuwait-Dinar
      "KWD": [ "KWD", "KWD", 3, "KWD", "din"],
      // Kaiman-Dollar
      "KYD": [ "KYD", "KYD", 2, "KYD", "$"],
      // Kasachischer Tenge
      "KZT": [ "KZT", "KZT", 2, "KZT", "₸"],
      // Laotischer Kip
      "LAK": [ "LAK", "LAK", 0, "LAK", "₭"],
      // Libanesisches Pfund
      "LBP": [ "LBP", "LBP", 0, "LBP", "L£"],
      // Sri-Lanka-Rupie
      "LKR": [ "LKR", "SLRs", 2, "SLRs", "Rs"],
      // Liberianischer Dollar
      "LRD": [ "LRD", "LRD", 2, "LRD", "$"],
      // Loti
      "LSL": [ "LSL", "LSL", 2, "LSL", "LSL"],
      // Litauischer Litas
      "LTL": [ "LTL", "LTL", 130, "LTL", "Lt"],
      // Litauischer Talonas
      "LTT": [ "LTT", "LTT", 130, "LTT", "LTT"],
      // Luxemburgischer Franc (konvertibel)
      "LUC": [ "LUC", "LUC", 130, "LUC", "LUC"],
      // Luxemburgischer Franc
      "LUF": [ "LUF", "LUF", 128, "LUF", "LUF"],
      // Luxemburgischer Finanz-Franc
      "LUL": [ "LUL", "LUL", 130, "LUL", "LUL"],
      // Lettischer Lats
      "LVL": [ "LVL", "LVL", 130, "LVL", "Ls"],
      // Lettischer Rubel
      "LVR": [ "LVR", "LVR", 130, "LVR", "LVR"],
      // Libyscher Dinar
      "LYD": [ "LYD", "LYD", 3, "LYD", "din"],
      // Marokkanischer Dirham
      "MAD": [ "MAD", "MAD", 2, "MAD", "MAD"],
      // Marokkanischer Franc
      "MAF": [ "MAF", "MAF", 130, "MAF", "MAF"],
      // Monegassischer Franc
      "MCF": [ "MCF", "MCF", 130, "MCF", "MCF"],
      // Moldau-Cupon
      "MDC": [ "MDC", "MDC", 130, "MDC", "MDC"],
      // Moldau-Leu
      "MDL": [ "MDL", "MDL", 2, "MDL", "MDL"],
      // Madagaskar-Ariary
      "MGA": [ "MGA", "MGA", 0, "MGA", "Ar"],
      // Madagaskar-Franc
      "MGF": [ "MGF", "MGF", 128, "MGF", "MGF"],
      // Mazedonischer Denar
      "MKD": [ "MKD", "MKD", 2, "MKD", "din"],
      // Mazedonischer Denar (1992–1993)
      "MKN": [ "MKN", "MKN", 130, "MKN", "MKN"],
      // Malischer Franc
      "MLF": [ "MLF", "MLF", 130, "MLF", "MLF"],
      // Myanmarischer Kyat
      "MMK": [ "MMK", "MMK", 0, "MMK", "K"],
      // Mongolischer Tögrög
      "MNT": [ "MNT", "MN₮", 2, "MN₮", "₮"],
      // Macao-Pataca
      "MOP": [ "MOP", "MOP", 2, "MOP", "MOP"],
      // Mauretanischer Ouguiya (1973–2017)
      "MRO": [ "MRO", "MRO", 128, "MRO", "MRO"],
      // Mauretanischer Ouguiya
      "MRU": [ "MRU", "MRU", 2, "MRU", "MRU"],
      // Maltesische Lira
      "MTL": [ "MTL", "MTL", 130, "MTL", "MTL"],
      // Maltesisches Pfund
      "MTP": [ "MTP", "MTP", 130, "MTP", "MTP"],
      // Mauritius-Rupie
      "MUR": [ "MUR", "MUR", 2, "MUR", "Rs"],
      // Malediven-Rupie (alt)
      "MVP": [ "MVP", "MVP", 130, "MVP", "MVP"],
      // Malediven-Rufiyaa
      "MVR": [ "MVR", "MVR", 2, "MVR", "MVR"],
      // Malawi-Kwacha
      "MWK": [ "MWK", "MWK", 2, "MWK", "MWK"],
      // Mexikanischer Peso
      "MXN": [ "MXN", "MX$", 2, "Mex$", "$"],
      // Mexikanischer Silber-Peso (1861–1992)
      "MXP": [ "MXP", "MXP", 130, "MXP", "MXP"],
      // Mexicanischer Unidad de Inversion (UDI)
      "MXV": [ "MXV", "MXV", 130, "MXV", "MXV"],
      // Malaysischer Ringgit
      "MYR": [ "MYR", "RM", 2, "RM", "RM"],
      // Mosambikanischer Escudo
      "MZE": [ "MZE", "MZE", 130, "MZE", "MZE"],
      // Mosambikanischer Metical (1980–2006)
      "MZM": [ "MZM", "MZM", 130, "MZM", "MZM"],
      // Mosambikanischer Metical
      "MZN": [ "MZN", "MZN", 2, "MZN", "MTn"],
      // Namibia-Dollar
      "NAD": [ "NAD", "NAD", 2, "NAD", "$"],
      // Nigerianischer Naira
      "NGN": [ "NGN", "NGN", 2, "NGN", "₦"],
      // Nicaraguanischer Córdoba (1988–1991)
      "NIC": [ "NIC", "NIC", 130, "NIC", "NIC"],
      // Nicaragua-Córdoba
      "NIO": [ "NIO", "NIO", 2, "NIO", "C$"],
      // Niederländischer Gulden
      "NLG": [ "NLG", "NLG", 130, "NLG", "NLG"],
      // Norwegische Krone
      "NOK": [ "NOK", "NOkr", 2, "NOkr", "kr"],
      // Nepalesische Rupie
      "NPR": [ "NPR", "NPR", 2, "NPR", "Rs"],
      // Neuseeland-Dollar
      "NZD": [ "NZD", "NZ$", 2, "NZ$", "$"],
      // Omanischer Rial
      "OMR": [ "OMR", "OMR", 3, "OMR", "Rial"],
      // Panamaischer Balboa
      "PAB": [ "PAB", "B/.", 2, "B/.", "B/."],
      // Peruanischer Inti
      "PEI": [ "PEI", "PEI", 130, "PEI", "PEI"],
      // Peruanischer Sol
      "PEN": [ "PEN", "S/.", 2, "S/.", "S/."],
      // Peruanischer Sol (1863–1965)
      "PES": [ "PES", "PES", 130, "PES", "PES"],
      // Papua-Neuguineischer Kina
      "PGK": [ "PGK", "PGK", 2, "PGK", "PGK"],
      // Philippinischer Peso
      "PHP": [ "PHP", "PHP", 2, "PHP", "₱"],
      // Pakistanische Rupie
      "PKR": [ "PKR", "PKRs.", 2, "PKRs.", "Rs"],
      // Polnischer Złoty
      "PLN": [ "PLN", "PLN", 2, "PLN", "zł"],
      // Polnischer Zloty (1950–1995)
      "PLZ": [ "PLZ", "PLZ", 130, "PLZ", "PLZ"],
      // Portugiesischer Escudo
      "PTE": [ "PTE", "PTE", 130, "PTE", "PTE"],
      // Paraguayischer Guaraní
      "PYG": [ "PYG", "PYG", 0, "PYG", "Gs"],
      // Katar-Riyal
      "QAR": [ "QAR", "QAR", 2, "QAR", "Rial"],
      // Rhodesischer Dollar
      "RHD": [ "RHD", "RHD", 130, "RHD", "RHD"],
      // Rumänischer Leu (1952–2006)
      "ROL": [ "ROL", "ROL", 130, "ROL", "ROL"],
      // Rumänischer Leu
      "RON": [ "RON", "RON", 2, "RON", "RON"],
      // Serbischer Dinar
      "RSD": [ "RSD", "RSD", 0, "RSD", "din"],
      // Russischer Rubel
      "RUB": [ "RUB", "руб.", 2, "руб.", "руб."],
      // Russischer Rubel (1991–1998)
      "RUR": [ "RUR", "RUR", 130, "RUR", "RUR"],
      // Ruanda-Franc
      "RWF": [ "RWF", "RWF", 0, "RWF", "RF"],
      // Saudi-Rial
      "SAR": [ "SAR", "SR", 2, "SR", "Rial"],
      // Salomonen-Dollar
      "SBD": [ "SBD", "SBD", 2, "SBD", "$"],
      // Seychellen-Rupie
      "SCR": [ "SCR", "SCR", 2, "SCR", "SCR"],
      // Sudanesischer Dinar (1992–2007)
      "SDD": [ "SDD", "SDD", 130, "SDD", "SDD"],
      // Sudanesisches Pfund
      "SDG": [ "SDG", "SDG", 2, "SDG", "SDG"],
      // Sudanesisches Pfund (1957–1998)
      "SDP": [ "SDP", "SDP", 130, "SDP", "SDP"],
      // Schwedische Krone
      "SEK": [ "SEK", "kr", 2, "kr", "kr"],
      // Singapur-Dollar
      "SGD": [ "SGD", "S$", 2, "S$", "$"],
      // St. Helena-Pfund
      "SHP": [ "SHP", "SHP", 2, "SHP", "£"],
      // Slowenischer Tolar
      "SIT": [ "SIT", "SIT", 130, "SIT", "SIT"],
      // Slowakische Krone
      "SKK": [ "SKK", "SKK", 130, "SKK", "SKK"],
      // Sierra-leonischer Leone
      "SLL": [ "SLL", "SLL", 0, "SLL", "SLL"],
      // Somalia-Schilling
      "SOS": [ "SOS", "SOS", 0, "SOS", "SOS"],
      // Suriname-Dollar
      "SRD": [ "SRD", "SRD", 2, "SRD", "$"],
      // Suriname Gulden
      "SRG": [ "SRG", "SRG", 130, "SRG", "SRG"],
      // Südsudanesisches Pfund
      "SSP": [ "SSP", "SSP", 2, "SSP", "SSP"],
      // São-toméischer Dobra (1977–2017)
      "STD": [ "STD", "STD", 128, "STD", "Db"],
      // São-toméischer Dobra
      "STN": [ "STN", "STN", 2, "STN", "STN"],
      // Sowjetischer Rubel
      "SUR": [ "SUR", "SUR", 130, "SUR", "SUR"],
      // El Salvador Colon
      "SVC": [ "SVC", "SVC", 130, "SVC", "SVC"],
      // Syrisches Pfund
      "SYP": [ "SYP", "SYP", 0, "SYP", "£"],
      // Swasiländischer Lilangeni
      "SZL": [ "SZL", "SZL", 2, "SZL", "SZL"],
      // Thailändischer Baht
      "THB": [ "THB", "฿", 2, "THB", "฿"],
      // Tadschikistan Rubel
      "TJR": [ "TJR", "TJR", 130, "TJR", "TJR"],
      // Tadschikistan-Somoni
      "TJS": [ "TJS", "TJS", 2, "TJS", "Som"],
      // Turkmenistan-Manat (1993–2009)
      "TMM": [ "TMM", "TMM", 128, "TMM", "TMM"],
      // Turkmenistan-Manat
      "TMT": [ "TMT", "TMT", 2, "TMT", "TMT"],
      // Tunesischer Dinar
      "TND": [ "TND", "TND", 3, "TND", "din"],
      // Tongaischer Paʻanga
      "TOP": [ "TOP", "TOP", 2, "TOP", "T$"],
      // Timor-Escudo
      "TPE": [ "TPE", "TPE", 130, "TPE", "TPE"],
      // Türkische Lira (1922–2005)
      "TRL": [ "TRL", "TRL", 128, "TRL", "TRL"],
      // Türkische Lira
      "TRY": [ "TRY", "TL", 2, "YTL", "TL"],
      // Trinidad und Tobago-Dollar
      "TTD": [ "TTD", "TTD", 2, "TTD", "$"],
      // Neuer Taiwan-Dollar
      "TWD": [ "TWD", "NT$", 2, "NT$", "NT$"],
      // Tansania-Schilling
      "TZS": [ "TZS", "TZS", 2, "TZS", "TSh"],
      // Ukrainische Hrywnja
      "UAH": [ "UAH", "UAH", 2, "UAH", "₴"],
      // Ukrainischer Karbovanetz
      "UAK": [ "UAK", "UAK", 130, "UAK", "UAK"],
      // Uganda-Schilling (1966–1987)
      "UGS": [ "UGS", "UGS", 130, "UGS", "UGS"],
      // Uganda-Schilling
      "UGX": [ "UGX", "UGX", 0, "UGX", "UGX"],
      // US-Dollar
      "USD": [ "USD", "$", 2, "US$", "$"],
      // US Dollar (Nächster Tag)
      "USN": [ "USN", "USN", 130, "USN", "USN"],
      // US Dollar (Gleicher Tag)
      "USS": [ "USS", "USS", 130, "USS", "USS"],
      // Uruguayischer Peso (Indexierte Rechnungseinheiten)
      "UYI": [ "UYI", "UYI", 128, "UYI", "UYI"],
      // Uruguayischer Peso (1975–1993)
      "UYP": [ "UYP", "UYP", 130, "UYP", "UYP"],
      // Uruguayischer Peso
      "UYU": [ "UYU", "UY$", 2, "UY$", "$"],
      // Usbekistan-Sum
      "UZS": [ "UZS", "UZS", 2, "UZS", "soʼm"],
      // Venezolanischer Bolívar (1871–2008)
      "VEB": [ "VEB", "VEB", 130, "VEB", "VEB"],
      // Venezolanischer Bolívar (2008–2018)
      "VEF": [ "VEF", "VEF", 130, "VEF", "Bs"],
      // Venezolanischer Bolívar
      "VES": [ "VES", "VES", 2, "VES", "VES"],
      // Vietnamesischer Dong
      "VND": [ "VND", "₫", 24, "₫", "₫"],
      // Vietnamesischer Dong(1978–1985)
      "VNN": [ "VNN", "VNN", 130, "VNN", "VNN"],
      // Vanuatu-Vatu
      "VUV": [ "VUV", "VUV", 0, "VUV", "VUV"],
      // Samoanischer Tala
      "WST": [ "WST", "WST", 2, "WST", "WST"],
      // CFA-Franc (BEAC)
      "XAF": [ "XAF", "FCFA", 0, "FCFA", "FCFA"],
      // Unze Silber
      "XAG": [ "XAG", "XAG", 130, "XAG", "XAG"],
      // Unze Gold
      "XAU": [ "XAU", "XAU", 130, "XAU", "XAU"],
      // Europäische Rechnungseinheit
      "XBA": [ "XBA", "XBA", 130, "XBA", "XBA"],
      // Europäische Währungseinheit (XBB)
      "XBB": [ "XBB", "XBB", 130, "XBB", "XBB"],
      // Europäische Rechnungseinheit (XBC)
      "XBC": [ "XBC", "XBC", 130, "XBC", "XBC"],
      // Europäische Rechnungseinheit (XBD)
      "XBD": [ "XBD", "XBD", 130, "XBD", "XBD"],
      // Ostkaribischer Dollar
      "XCD": [ "XCD", "EC$", 2, "EC$", "$"],
      // Sonderziehungsrechte
      "XDR": [ "XDR", "XDR", 130, "XDR", "XDR"],
      // Europäische Währungseinheit (XEU)
      "XEU": [ "XEU", "XEU", 130, "XEU", "XEU"],
      // Französischer Gold-Franc
      "XFO": [ "XFO", "XFO", 130, "XFO", "XFO"],
      // Französischer UIC-Franc
      "XFU": [ "XFU", "XFU", 130, "XFU", "XFU"],
      // CFA-Franc (BCEAO)
      "XOF": [ "XOF", "CFA", 0, "CFA", "CFA"],
      // Unze Palladium
      "XPD": [ "XPD", "XPD", 130, "XPD", "XPD"],
      // CFP-Franc
      "XPF": [ "XPF", "CFPF", 0, "CFPF", "FCFP"],
      // Unze Platin
      "XPT": [ "XPT", "XPT", 130, "XPT", "XPT"],
      // RINET Funds
      "XRE": [ "XRE", "XRE", 130, "XRE", "XRE"],
      // SUCRE
      "XSU": [ "XSU", "XSU", 130, "XSU", "XSU"],
      // Testwährung
      "XTS": [ "XTS", "XTS", 130, "XTS", "XTS"],
      // Rechnungseinheit der AfEB
      "XUA": [ "XUA", "XUA", 130, "XUA", "XUA"],
      // Unbekannte Währung
      "XXX": [ "XXX", "XXX", 130, "XXX", "XXX"],
      // Jemen-Dinar
      "YDD": [ "YDD", "YDD", 130, "YDD", "YDD"],
      // Jemen-Rial
      "YER": [ "YER", "YER", 0, "YER", "Rial"],
      // Jugoslawischer Dinar (1966–1990)
      "YUD": [ "YUD", "YUD", 130, "YUD", "YUD"],
      // Jugoslawischer Neuer Dinar (1994–2002)
      "YUM": [ "YUM", "YUM", 130, "YUM", "YUM"],
      // Jugoslawischer Dinar (konvertibel)
      "YUN": [ "YUN", "YUN", 130, "YUN", "YUN"],
      // Jugoslawischer reformierter Dinar (1992–1993)
      "YUR": [ "YUR", "YUR", 130, "YUR", "YUR"],
      // Südafrikanischer Rand (Finanz)
      "ZAL": [ "ZAL", "ZAL", 130, "ZAL", "ZAL"],
      // Südafrikanischer Rand
      "ZAR": [ "ZAR", "ZAR", 2, "ZAR", "R"],
      // Kwacha (1968–2012)
      "ZMK": [ "ZMK", "ZMK", 128, "ZMK", "ZWK"],
      // Kwacha
      "ZMW": [ "ZMW", "ZMW", 2, "ZMW", "ZMW"],
      // Zaire-Neuer Zaïre (1993–1998)
      "ZRN": [ "ZRN", "ZRN", 130, "ZRN", "ZRN"],
      // Zaire-Zaïre (1971–1993)
      "ZRZ": [ "ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"],
      // Simbabwe-Dollar (1980–2008)
      "ZWD": [ "ZWD", "ZWD", 128, "ZWD", "ZWD"],
      // Simbabwe-Dollar (2009)
      "ZWL": [ "ZWL", "ZWL", 130, "ZWL", "ZWL"],
      // Simbabwe-Dollar (2008)
      "ZWR": [ "ZWR", "ZWR", 130, "ZWR", "ZWR"],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("ADP", "Andorranische Pesete");
    result.put("AED", "VAE-Dirham");
    result.put("AFA", "Afghanische Afghani (1927–2002)");
    result.put("AFN", "Afghanischer Afghani");
    result.put("ALK", "Albanischer Lek (1946–1965)");
    result.put("ALL", "Albanischer Lek");
    result.put("AMD", "Armenischer Dram");
    result.put("ANG", "Niederländische-Antillen-Gulden");
    result.put("AOA", "Angolanischer Kwanza");
    result.put("AOK", "Angolanischer Kwanza (1977–1990)");
    result.put("AON", "Angolanischer Neuer Kwanza (1990–2000)");
    result.put("AOR", "Angolanischer Kwanza Reajustado (1995–1999)");
    result.put("ARA", "Argentinischer Austral");
    result.put("ARL", "Argentinischer Peso Ley (1970–1983)");
    result.put("ARM", "Argentinischer Peso (1881–1970)");
    result.put("ARP", "Argentinischer Peso (1983–1985)");
    result.put("ARS", "Argentinischer Peso");
    result.put("ATS", "Österreichischer Schilling");
    result.put("AUD", "Australischer Dollar");
    result.put("AWG", "Aruba-Florin");
    result.put("AZM", "Aserbaidschan-Manat (1993–2006)");
    result.put("AZN", "Aserbaidschan-Manat");
    result.put("BAD", "Bosnien und Herzegowina Dinar (1992–1994)");
    result.put("BAM", "Bosnien und Herzegowina Konvertierbare Mark");
    result.put("BAN", "Bosnien und Herzegowina Neuer Dinar (1994–1997)");
    result.put("BBD", "Barbados-Dollar");
    result.put("BDT", "Bangladesch-Taka");
    result.put("BEC", "Belgischer Franc (konvertibel)");
    result.put("BEF", "Belgischer Franc");
    result.put("BEL", "Belgischer Finanz-Franc");
    result.put("BGL", "Bulgarische Lew (1962–1999)");
    result.put("BGM", "Bulgarischer Lew (1952–1962)");
    result.put("BGN", "Bulgarischer Lew");
    result.put("BGO", "Bulgarischer Lew (1879–1952)");
    result.put("BHD", "Bahrain-Dinar");
    result.put("BIF", "Burundi-Franc");
    result.put("BMD", "Bermuda-Dollar");
    result.put("BND", "Brunei-Dollar");
    result.put("BOB", "Bolivianischer Boliviano");
    result.put("BOL", "Bolivianischer Boliviano (1863–1963)");
    result.put("BOP", "Bolivianischer Peso");
    result.put("BOV", "Boliviansiche Mvdol");
    result.put("BRB", "Brasilianischer Cruzeiro Novo (1967–1986)");
    result.put("BRC", "Brasilianischer Cruzado (1986–1989)");
    result.put("BRE", "Brasilianischer Cruzeiro (1990–1993)");
    result.put("BRL", "Brasilianischer Real");
    result.put("BRN", "Brasilianischer Cruzado Novo (1989–1990)");
    result.put("BRR", "Brasilianischer Cruzeiro (1993–1994)");
    result.put("BRZ", "Brasilianischer Cruzeiro (1942–1967)");
    result.put("BSD", "Bahamas-Dollar");
    result.put("BTN", "Bhutan-Ngultrum");
    result.put("BUK", "Birmanischer Kyat");
    result.put("BWP", "Botswanischer Pula");
    result.put("BYB", "Belarus-Rubel (1994–1999)");
    result.put("BYN", "Weißrussischer Rubel");
    result.put("BYR", "Weißrussischer Rubel (2000–2016)");
    result.put("BZD", "Belize-Dollar");
    result.put("CAD", "Kanadischer Dollar");
    result.put("CDF", "Kongo-Franc");
    result.put("CHE", "WIR-Euro");
    result.put("CHF", "Schweizer Franken");
    result.put("CHW", "WIR Franken");
    result.put("CLE", "Chilenischer Escudo");
    result.put("CLF", "Chilenische Unidades de Fomento");
    result.put("CLP", "Chilenischer Peso");
    result.put("CNH", "Renminbi Yuan (Off–Shore)");
    result.put("CNX", "Dollar der Chinesischen Volksbank");
    result.put("CNY", "Renminbi Yuan");
    result.put("COP", "Kolumbianischer Peso");
    result.put("COU", "Kolumbianische Unidades de valor real");
    result.put("CRC", "Costa-Rica-Colón");
    result.put("CSD", "Serbischer Dinar (2002–2006)");
    result.put("CSK", "Tschechoslowakische Krone");
    result.put("CUC", "Kubanischer Peso (konvertibel)");
    result.put("CUP", "Kubanischer Peso");
    result.put("CVE", "Cabo-Verde-Escudo");
    result.put("CYP", "Zypern-Pfund");
    result.put("CZK", "Tschechische Krone");
    result.put("DDM", "Mark der DDR");
    result.put("DEM", "Deutsche Mark");
    result.put("DJF", "Dschibuti-Franc");
    result.put("DKK", "Dänische Krone");
    result.put("DOP", "Dominikanischer Peso");
    result.put("DZD", "Algerischer Dinar");
    result.put("ECS", "Ecuadorianischer Sucre");
    result.put("ECV", "Verrechnungseinheit für Ecuador");
    result.put("EEK", "Estnische Krone");
    result.put("EGP", "Ägyptisches Pfund");
    result.put("ERN", "Eritreischer Nakfa");
    result.put("ESA", "Spanische Peseta (A–Konten)");
    result.put("ESB", "Spanische Peseta (konvertibel)");
    result.put("ESP", "Spanische Peseta");
    result.put("ETB", "Äthiopischer Birr");
    result.put("EUR", "Euro");
    result.put("FIM", "Finnische Mark");
    result.put("FJD", "Fidschi-Dollar");
    result.put("FKP", "Falkland-Pfund");
    result.put("FRF", "Französischer Franc");
    result.put("GBP", "Britisches Pfund");
    result.put("GEK", "Georgischer Kupon Larit");
    result.put("GEL", "Georgischer Lari");
    result.put("GHC", "Ghanaischer Cedi (1979–2007)");
    result.put("GHS", "Ghanaischer Cedi");
    result.put("GIP", "Gibraltar-Pfund");
    result.put("GMD", "Gambia-Dalasi");
    result.put("GNF", "Guinea-Franc");
    result.put("GNS", "Guineischer Syli");
    result.put("GQE", "Äquatorialguinea-Ekwele");
    result.put("GRD", "Griechische Drachme");
    result.put("GTQ", "Guatemaltekischer Quetzal");
    result.put("GWE", "Portugiesisch Guinea Escudo");
    result.put("GWP", "Guinea-Bissau Peso");
    result.put("GYD", "Guyana-Dollar");
    result.put("HKD", "Hongkong-Dollar");
    result.put("HNL", "Honduras-Lempira");
    result.put("HRD", "Kroatischer Dinar");
    result.put("HRK", "Kroatischer Kuna");
    result.put("HTG", "Haitianische Gourde");
    result.put("HUF", "Ungarischer Forint");
    result.put("IDR", "Indonesische Rupiah");
    result.put("IEP", "Irisches Pfund");
    result.put("ILP", "Israelisches Pfund");
    result.put("ILR", "Israelischer Schekel (1980–1985)");
    result.put("ILS", "Israelischer Neuer Schekel");
    result.put("INR", "Indische Rupie");
    result.put("IQD", "Irakischer Dinar");
    result.put("IRR", "Iranischer Rial");
    result.put("ISJ", "Isländische Krone (1918–1981)");
    result.put("ISK", "Isländische Krone");
    result.put("ITL", "Italienische Lira");
    result.put("JMD", "Jamaika-Dollar");
    result.put("JOD", "Jordanischer Dinar");
    result.put("JPY", "Japanischer Yen");
    result.put("KES", "Kenia-Schilling");
    result.put("KGS", "Kirgisischer Som");
    result.put("KHR", "Kambodschanischer Riel");
    result.put("KMF", "Komoren-Franc");
    result.put("KPW", "Nordkoreanischer Won");
    result.put("KRH", "Südkoreanischer Hwan (1953–1962)");
    result.put("KRO", "Südkoreanischer Won (1945–1953)");
    result.put("KRW", "Südkoreanischer Won");
    result.put("KWD", "Kuwait-Dinar");
    result.put("KYD", "Kaiman-Dollar");
    result.put("KZT", "Kasachischer Tenge");
    result.put("LAK", "Laotischer Kip");
    result.put("LBP", "Libanesisches Pfund");
    result.put("LKR", "Sri-Lanka-Rupie");
    result.put("LRD", "Liberianischer Dollar");
    result.put("LSL", "Loti");
    result.put("LTL", "Litauischer Litas");
    result.put("LTT", "Litauischer Talonas");
    result.put("LUC", "Luxemburgischer Franc (konvertibel)");
    result.put("LUF", "Luxemburgischer Franc");
    result.put("LUL", "Luxemburgischer Finanz-Franc");
    result.put("LVL", "Lettischer Lats");
    result.put("LVR", "Lettischer Rubel");
    result.put("LYD", "Libyscher Dinar");
    result.put("MAD", "Marokkanischer Dirham");
    result.put("MAF", "Marokkanischer Franc");
    result.put("MCF", "Monegassischer Franc");
    result.put("MDC", "Moldau-Cupon");
    result.put("MDL", "Moldau-Leu");
    result.put("MGA", "Madagaskar-Ariary");
    result.put("MGF", "Madagaskar-Franc");
    result.put("MKD", "Mazedonischer Denar");
    result.put("MKN", "Mazedonischer Denar (1992–1993)");
    result.put("MLF", "Malischer Franc");
    result.put("MMK", "Myanmarischer Kyat");
    result.put("MNT", "Mongolischer Tögrög");
    result.put("MOP", "Macao-Pataca");
    result.put("MRO", "Mauretanischer Ouguiya (1973–2017)");
    result.put("MRU", "Mauretanischer Ouguiya");
    result.put("MTL", "Maltesische Lira");
    result.put("MTP", "Maltesisches Pfund");
    result.put("MUR", "Mauritius-Rupie");
    result.put("MVP", "Malediven-Rupie (alt)");
    result.put("MVR", "Malediven-Rufiyaa");
    result.put("MWK", "Malawi-Kwacha");
    result.put("MXN", "Mexikanischer Peso");
    result.put("MXP", "Mexikanischer Silber-Peso (1861–1992)");
    result.put("MXV", "Mexicanischer Unidad de Inversion (UDI)");
    result.put("MYR", "Malaysischer Ringgit");
    result.put("MZE", "Mosambikanischer Escudo");
    result.put("MZM", "Mosambikanischer Metical (1980–2006)");
    result.put("MZN", "Mosambikanischer Metical");
    result.put("NAD", "Namibia-Dollar");
    result.put("NGN", "Nigerianischer Naira");
    result.put("NIC", "Nicaraguanischer Córdoba (1988–1991)");
    result.put("NIO", "Nicaragua-Córdoba");
    result.put("NLG", "Niederländischer Gulden");
    result.put("NOK", "Norwegische Krone");
    result.put("NPR", "Nepalesische Rupie");
    result.put("NZD", "Neuseeland-Dollar");
    result.put("OMR", "Omanischer Rial");
    result.put("PAB", "Panamaischer Balboa");
    result.put("PEI", "Peruanischer Inti");
    result.put("PEN", "Peruanischer Sol");
    result.put("PES", "Peruanischer Sol (1863–1965)");
    result.put("PGK", "Papua-Neuguineischer Kina");
    result.put("PHP", "Philippinischer Peso");
    result.put("PKR", "Pakistanische Rupie");
    result.put("PLN", "Polnischer Złoty");
    result.put("PLZ", "Polnischer Zloty (1950–1995)");
    result.put("PTE", "Portugiesischer Escudo");
    result.put("PYG", "Paraguayischer Guaraní");
    result.put("QAR", "Katar-Riyal");
    result.put("RHD", "Rhodesischer Dollar");
    result.put("ROL", "Rumänischer Leu (1952–2006)");
    result.put("RON", "Rumänischer Leu");
    result.put("RSD", "Serbischer Dinar");
    result.put("RUB", "Russischer Rubel");
    result.put("RUR", "Russischer Rubel (1991–1998)");
    result.put("RWF", "Ruanda-Franc");
    result.put("SAR", "Saudi-Rial");
    result.put("SBD", "Salomonen-Dollar");
    result.put("SCR", "Seychellen-Rupie");
    result.put("SDD", "Sudanesischer Dinar (1992–2007)");
    result.put("SDG", "Sudanesisches Pfund");
    result.put("SDP", "Sudanesisches Pfund (1957–1998)");
    result.put("SEK", "Schwedische Krone");
    result.put("SGD", "Singapur-Dollar");
    result.put("SHP", "St. Helena-Pfund");
    result.put("SIT", "Slowenischer Tolar");
    result.put("SKK", "Slowakische Krone");
    result.put("SLL", "Sierra-leonischer Leone");
    result.put("SOS", "Somalia-Schilling");
    result.put("SRD", "Suriname-Dollar");
    result.put("SRG", "Suriname Gulden");
    result.put("SSP", "Südsudanesisches Pfund");
    result.put("STD", "São-toméischer Dobra (1977–2017)");
    result.put("STN", "São-toméischer Dobra");
    result.put("SUR", "Sowjetischer Rubel");
    result.put("SVC", "El Salvador Colon");
    result.put("SYP", "Syrisches Pfund");
    result.put("SZL", "Swasiländischer Lilangeni");
    result.put("THB", "Thailändischer Baht");
    result.put("TJR", "Tadschikistan Rubel");
    result.put("TJS", "Tadschikistan-Somoni");
    result.put("TMM", "Turkmenistan-Manat (1993–2009)");
    result.put("TMT", "Turkmenistan-Manat");
    result.put("TND", "Tunesischer Dinar");
    result.put("TOP", "Tongaischer Paʻanga");
    result.put("TPE", "Timor-Escudo");
    result.put("TRL", "Türkische Lira (1922–2005)");
    result.put("TRY", "Türkische Lira");
    result.put("TTD", "Trinidad und Tobago-Dollar");
    result.put("TWD", "Neuer Taiwan-Dollar");
    result.put("TZS", "Tansania-Schilling");
    result.put("UAH", "Ukrainische Hrywnja");
    result.put("UAK", "Ukrainischer Karbovanetz");
    result.put("UGS", "Uganda-Schilling (1966–1987)");
    result.put("UGX", "Uganda-Schilling");
    result.put("USD", "US-Dollar");
    result.put("USN", "US Dollar (Nächster Tag)");
    result.put("USS", "US Dollar (Gleicher Tag)");
    result.put("UYI", "Uruguayischer Peso (Indexierte Rechnungseinheiten)");
    result.put("UYP", "Uruguayischer Peso (1975–1993)");
    result.put("UYU", "Uruguayischer Peso");
    result.put("UZS", "Usbekistan-Sum");
    result.put("VEB", "Venezolanischer Bolívar (1871–2008)");
    result.put("VEF", "Venezolanischer Bolívar (2008–2018)");
    result.put("VES", "Venezolanischer Bolívar");
    result.put("VND", "Vietnamesischer Dong");
    result.put("VNN", "Vietnamesischer Dong(1978–1985)");
    result.put("VUV", "Vanuatu-Vatu");
    result.put("WST", "Samoanischer Tala");
    result.put("XAF", "CFA-Franc (BEAC)");
    result.put("XAG", "Unze Silber");
    result.put("XAU", "Unze Gold");
    result.put("XBA", "Europäische Rechnungseinheit");
    result.put("XBB", "Europäische Währungseinheit (XBB)");
    result.put("XBC", "Europäische Rechnungseinheit (XBC)");
    result.put("XBD", "Europäische Rechnungseinheit (XBD)");
    result.put("XCD", "Ostkaribischer Dollar");
    result.put("XDR", "Sonderziehungsrechte");
    result.put("XEU", "Europäische Währungseinheit (XEU)");
    result.put("XFO", "Französischer Gold-Franc");
    result.put("XFU", "Französischer UIC-Franc");
    result.put("XOF", "CFA-Franc (BCEAO)");
    result.put("XPD", "Unze Palladium");
    result.put("XPF", "CFP-Franc");
    result.put("XPT", "Unze Platin");
    result.put("XRE", "RINET Funds");
    result.put("XSU", "SUCRE");
    result.put("XTS", "Testwährung");
    result.put("XUA", "Rechnungseinheit der AfEB");
    result.put("XXX", "Unbekannte Währung");
    result.put("YDD", "Jemen-Dinar");
    result.put("YER", "Jemen-Rial");
    result.put("YUD", "Jugoslawischer Dinar (1966–1990)");
    result.put("YUM", "Jugoslawischer Neuer Dinar (1994–2002)");
    result.put("YUN", "Jugoslawischer Dinar (konvertibel)");
    result.put("YUR", "Jugoslawischer reformierter Dinar (1992–1993)");
    result.put("ZAL", "Südafrikanischer Rand (Finanz)");
    result.put("ZAR", "Südafrikanischer Rand");
    result.put("ZMK", "Kwacha (1968–2012)");
    result.put("ZMW", "Kwacha");
    result.put("ZRN", "Zaire-Neuer Zaïre (1993–1998)");
    result.put("ZRZ", "Zaire-Zaïre (1971–1993)");
    result.put("ZWD", "Simbabwe-Dollar (1980–2008)");
    result.put("ZWL", "Simbabwe-Dollar (2009)");
    result.put("ZWR", "Simbabwe-Dollar (2008)");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "ADP": "Andorranische Pesete",
      "AED": "VAE-Dirham",
      "AFA": "Afghanische Afghani (1927–2002)",
      "AFN": "Afghanischer Afghani",
      "ALK": "Albanischer Lek (1946–1965)",
      "ALL": "Albanischer Lek",
      "AMD": "Armenischer Dram",
      "ANG": "Niederländische-Antillen-Gulden",
      "AOA": "Angolanischer Kwanza",
      "AOK": "Angolanischer Kwanza (1977–1990)",
      "AON": "Angolanischer Neuer Kwanza (1990–2000)",
      "AOR": "Angolanischer Kwanza Reajustado (1995–1999)",
      "ARA": "Argentinischer Austral",
      "ARL": "Argentinischer Peso Ley (1970–1983)",
      "ARM": "Argentinischer Peso (1881–1970)",
      "ARP": "Argentinischer Peso (1983–1985)",
      "ARS": "Argentinischer Peso",
      "ATS": "Österreichischer Schilling",
      "AUD": "Australischer Dollar",
      "AWG": "Aruba-Florin",
      "AZM": "Aserbaidschan-Manat (1993–2006)",
      "AZN": "Aserbaidschan-Manat",
      "BAD": "Bosnien und Herzegowina Dinar (1992–1994)",
      "BAM": "Bosnien und Herzegowina Konvertierbare Mark",
      "BAN": "Bosnien und Herzegowina Neuer Dinar (1994–1997)",
      "BBD": "Barbados-Dollar",
      "BDT": "Bangladesch-Taka",
      "BEC": "Belgischer Franc (konvertibel)",
      "BEF": "Belgischer Franc",
      "BEL": "Belgischer Finanz-Franc",
      "BGL": "Bulgarische Lew (1962–1999)",
      "BGM": "Bulgarischer Lew (1952–1962)",
      "BGN": "Bulgarischer Lew",
      "BGO": "Bulgarischer Lew (1879–1952)",
      "BHD": "Bahrain-Dinar",
      "BIF": "Burundi-Franc",
      "BMD": "Bermuda-Dollar",
      "BND": "Brunei-Dollar",
      "BOB": "Bolivianischer Boliviano",
      "BOL": "Bolivianischer Boliviano (1863–1963)",
      "BOP": "Bolivianischer Peso",
      "BOV": "Boliviansiche Mvdol",
      "BRB": "Brasilianischer Cruzeiro Novo (1967–1986)",
      "BRC": "Brasilianischer Cruzado (1986–1989)",
      "BRE": "Brasilianischer Cruzeiro (1990–1993)",
      "BRL": "Brasilianischer Real",
      "BRN": "Brasilianischer Cruzado Novo (1989–1990)",
      "BRR": "Brasilianischer Cruzeiro (1993–1994)",
      "BRZ": "Brasilianischer Cruzeiro (1942–1967)",
      "BSD": "Bahamas-Dollar",
      "BTN": "Bhutan-Ngultrum",
      "BUK": "Birmanischer Kyat",
      "BWP": "Botswanischer Pula",
      "BYB": "Belarus-Rubel (1994–1999)",
      "BYN": "Weißrussischer Rubel",
      "BYR": "Weißrussischer Rubel (2000–2016)",
      "BZD": "Belize-Dollar",
      "CAD": "Kanadischer Dollar",
      "CDF": "Kongo-Franc",
      "CHE": "WIR-Euro",
      "CHF": "Schweizer Franken",
      "CHW": "WIR Franken",
      "CLE": "Chilenischer Escudo",
      "CLF": "Chilenische Unidades de Fomento",
      "CLP": "Chilenischer Peso",
      "CNH": "Renminbi Yuan (Off–Shore)",
      "CNX": "Dollar der Chinesischen Volksbank",
      "CNY": "Renminbi Yuan",
      "COP": "Kolumbianischer Peso",
      "COU": "Kolumbianische Unidades de valor real",
      "CRC": "Costa-Rica-Colón",
      "CSD": "Serbischer Dinar (2002–2006)",
      "CSK": "Tschechoslowakische Krone",
      "CUC": "Kubanischer Peso (konvertibel)",
      "CUP": "Kubanischer Peso",
      "CVE": "Cabo-Verde-Escudo",
      "CYP": "Zypern-Pfund",
      "CZK": "Tschechische Krone",
      "DDM": "Mark der DDR",
      "DEM": "Deutsche Mark",
      "DJF": "Dschibuti-Franc",
      "DKK": "Dänische Krone",
      "DOP": "Dominikanischer Peso",
      "DZD": "Algerischer Dinar",
      "ECS": "Ecuadorianischer Sucre",
      "ECV": "Verrechnungseinheit für Ecuador",
      "EEK": "Estnische Krone",
      "EGP": "Ägyptisches Pfund",
      "ERN": "Eritreischer Nakfa",
      "ESA": "Spanische Peseta (A–Konten)",
      "ESB": "Spanische Peseta (konvertibel)",
      "ESP": "Spanische Peseta",
      "ETB": "Äthiopischer Birr",
      "EUR": "Euro",
      "FIM": "Finnische Mark",
      "FJD": "Fidschi-Dollar",
      "FKP": "Falkland-Pfund",
      "FRF": "Französischer Franc",
      "GBP": "Britisches Pfund",
      "GEK": "Georgischer Kupon Larit",
      "GEL": "Georgischer Lari",
      "GHC": "Ghanaischer Cedi (1979–2007)",
      "GHS": "Ghanaischer Cedi",
      "GIP": "Gibraltar-Pfund",
      "GMD": "Gambia-Dalasi",
      "GNF": "Guinea-Franc",
      "GNS": "Guineischer Syli",
      "GQE": "Äquatorialguinea-Ekwele",
      "GRD": "Griechische Drachme",
      "GTQ": "Guatemaltekischer Quetzal",
      "GWE": "Portugiesisch Guinea Escudo",
      "GWP": "Guinea-Bissau Peso",
      "GYD": "Guyana-Dollar",
      "HKD": "Hongkong-Dollar",
      "HNL": "Honduras-Lempira",
      "HRD": "Kroatischer Dinar",
      "HRK": "Kroatischer Kuna",
      "HTG": "Haitianische Gourde",
      "HUF": "Ungarischer Forint",
      "IDR": "Indonesische Rupiah",
      "IEP": "Irisches Pfund",
      "ILP": "Israelisches Pfund",
      "ILR": "Israelischer Schekel (1980–1985)",
      "ILS": "Israelischer Neuer Schekel",
      "INR": "Indische Rupie",
      "IQD": "Irakischer Dinar",
      "IRR": "Iranischer Rial",
      "ISJ": "Isländische Krone (1918–1981)",
      "ISK": "Isländische Krone",
      "ITL": "Italienische Lira",
      "JMD": "Jamaika-Dollar",
      "JOD": "Jordanischer Dinar",
      "JPY": "Japanischer Yen",
      "KES": "Kenia-Schilling",
      "KGS": "Kirgisischer Som",
      "KHR": "Kambodschanischer Riel",
      "KMF": "Komoren-Franc",
      "KPW": "Nordkoreanischer Won",
      "KRH": "Südkoreanischer Hwan (1953–1962)",
      "KRO": "Südkoreanischer Won (1945–1953)",
      "KRW": "Südkoreanischer Won",
      "KWD": "Kuwait-Dinar",
      "KYD": "Kaiman-Dollar",
      "KZT": "Kasachischer Tenge",
      "LAK": "Laotischer Kip",
      "LBP": "Libanesisches Pfund",
      "LKR": "Sri-Lanka-Rupie",
      "LRD": "Liberianischer Dollar",
      "LSL": "Loti",
      "LTL": "Litauischer Litas",
      "LTT": "Litauischer Talonas",
      "LUC": "Luxemburgischer Franc (konvertibel)",
      "LUF": "Luxemburgischer Franc",
      "LUL": "Luxemburgischer Finanz-Franc",
      "LVL": "Lettischer Lats",
      "LVR": "Lettischer Rubel",
      "LYD": "Libyscher Dinar",
      "MAD": "Marokkanischer Dirham",
      "MAF": "Marokkanischer Franc",
      "MCF": "Monegassischer Franc",
      "MDC": "Moldau-Cupon",
      "MDL": "Moldau-Leu",
      "MGA": "Madagaskar-Ariary",
      "MGF": "Madagaskar-Franc",
      "MKD": "Mazedonischer Denar",
      "MKN": "Mazedonischer Denar (1992–1993)",
      "MLF": "Malischer Franc",
      "MMK": "Myanmarischer Kyat",
      "MNT": "Mongolischer Tögrög",
      "MOP": "Macao-Pataca",
      "MRO": "Mauretanischer Ouguiya (1973–2017)",
      "MRU": "Mauretanischer Ouguiya",
      "MTL": "Maltesische Lira",
      "MTP": "Maltesisches Pfund",
      "MUR": "Mauritius-Rupie",
      "MVP": "Malediven-Rupie (alt)",
      "MVR": "Malediven-Rufiyaa",
      "MWK": "Malawi-Kwacha",
      "MXN": "Mexikanischer Peso",
      "MXP": "Mexikanischer Silber-Peso (1861–1992)",
      "MXV": "Mexicanischer Unidad de Inversion (UDI)",
      "MYR": "Malaysischer Ringgit",
      "MZE": "Mosambikanischer Escudo",
      "MZM": "Mosambikanischer Metical (1980–2006)",
      "MZN": "Mosambikanischer Metical",
      "NAD": "Namibia-Dollar",
      "NGN": "Nigerianischer Naira",
      "NIC": "Nicaraguanischer Córdoba (1988–1991)",
      "NIO": "Nicaragua-Córdoba",
      "NLG": "Niederländischer Gulden",
      "NOK": "Norwegische Krone",
      "NPR": "Nepalesische Rupie",
      "NZD": "Neuseeland-Dollar",
      "OMR": "Omanischer Rial",
      "PAB": "Panamaischer Balboa",
      "PEI": "Peruanischer Inti",
      "PEN": "Peruanischer Sol",
      "PES": "Peruanischer Sol (1863–1965)",
      "PGK": "Papua-Neuguineischer Kina",
      "PHP": "Philippinischer Peso",
      "PKR": "Pakistanische Rupie",
      "PLN": "Polnischer Złoty",
      "PLZ": "Polnischer Zloty (1950–1995)",
      "PTE": "Portugiesischer Escudo",
      "PYG": "Paraguayischer Guaraní",
      "QAR": "Katar-Riyal",
      "RHD": "Rhodesischer Dollar",
      "ROL": "Rumänischer Leu (1952–2006)",
      "RON": "Rumänischer Leu",
      "RSD": "Serbischer Dinar",
      "RUB": "Russischer Rubel",
      "RUR": "Russischer Rubel (1991–1998)",
      "RWF": "Ruanda-Franc",
      "SAR": "Saudi-Rial",
      "SBD": "Salomonen-Dollar",
      "SCR": "Seychellen-Rupie",
      "SDD": "Sudanesischer Dinar (1992–2007)",
      "SDG": "Sudanesisches Pfund",
      "SDP": "Sudanesisches Pfund (1957–1998)",
      "SEK": "Schwedische Krone",
      "SGD": "Singapur-Dollar",
      "SHP": "St. Helena-Pfund",
      "SIT": "Slowenischer Tolar",
      "SKK": "Slowakische Krone",
      "SLL": "Sierra-leonischer Leone",
      "SOS": "Somalia-Schilling",
      "SRD": "Suriname-Dollar",
      "SRG": "Suriname Gulden",
      "SSP": "Südsudanesisches Pfund",
      "STD": "São-toméischer Dobra (1977–2017)",
      "STN": "São-toméischer Dobra",
      "SUR": "Sowjetischer Rubel",
      "SVC": "El Salvador Colon",
      "SYP": "Syrisches Pfund",
      "SZL": "Swasiländischer Lilangeni",
      "THB": "Thailändischer Baht",
      "TJR": "Tadschikistan Rubel",
      "TJS": "Tadschikistan-Somoni",
      "TMM": "Turkmenistan-Manat (1993–2009)",
      "TMT": "Turkmenistan-Manat",
      "TND": "Tunesischer Dinar",
      "TOP": "Tongaischer Paʻanga",
      "TPE": "Timor-Escudo",
      "TRL": "Türkische Lira (1922–2005)",
      "TRY": "Türkische Lira",
      "TTD": "Trinidad und Tobago-Dollar",
      "TWD": "Neuer Taiwan-Dollar",
      "TZS": "Tansania-Schilling",
      "UAH": "Ukrainische Hrywnja",
      "UAK": "Ukrainischer Karbovanetz",
      "UGS": "Uganda-Schilling (1966–1987)",
      "UGX": "Uganda-Schilling",
      "USD": "US-Dollar",
      "USN": "US Dollar (Nächster Tag)",
      "USS": "US Dollar (Gleicher Tag)",
      "UYI": "Uruguayischer Peso (Indexierte Rechnungseinheiten)",
      "UYP": "Uruguayischer Peso (1975–1993)",
      "UYU": "Uruguayischer Peso",
      "UZS": "Usbekistan-Sum",
      "VEB": "Venezolanischer Bolívar (1871–2008)",
      "VEF": "Venezolanischer Bolívar (2008–2018)",
      "VES": "Venezolanischer Bolívar",
      "VND": "Vietnamesischer Dong",
      "VNN": "Vietnamesischer Dong(1978–1985)",
      "VUV": "Vanuatu-Vatu",
      "WST": "Samoanischer Tala",
      "XAF": "CFA-Franc (BEAC)",
      "XAG": "Unze Silber",
      "XAU": "Unze Gold",
      "XBA": "Europäische Rechnungseinheit",
      "XBB": "Europäische Währungseinheit (XBB)",
      "XBC": "Europäische Rechnungseinheit (XBC)",
      "XBD": "Europäische Rechnungseinheit (XBD)",
      "XCD": "Ostkaribischer Dollar",
      "XDR": "Sonderziehungsrechte",
      "XEU": "Europäische Währungseinheit (XEU)",
      "XFO": "Französischer Gold-Franc",
      "XFU": "Französischer UIC-Franc",
      "XOF": "CFA-Franc (BCEAO)",
      "XPD": "Unze Palladium",
      "XPF": "CFP-Franc",
      "XPT": "Unze Platin",
      "XRE": "RINET Funds",
      "XSU": "SUCRE",
      "XTS": "Testwährung",
      "XUA": "Rechnungseinheit der AfEB",
      "XXX": "Unbekannte Währung",
      "YDD": "Jemen-Dinar",
      "YER": "Jemen-Rial",
      "YUD": "Jugoslawischer Dinar (1966–1990)",
      "YUM": "Jugoslawischer Neuer Dinar (1994–2002)",
      "YUN": "Jugoslawischer Dinar (konvertibel)",
      "YUR": "Jugoslawischer reformierter Dinar (1992–1993)",
      "ZAL": "Südafrikanischer Rand (Finanz)",
      "ZAR": "Südafrikanischer Rand",
      "ZMK": "Kwacha (1968–2012)",
      "ZMW": "Kwacha",
      "ZRN": "Zaire-Neuer Zaïre (1993–1998)",
      "ZRZ": "Zaire-Zaïre (1971–1993)",
      "ZWD": "Simbabwe-Dollar (1980–2008)",
      "ZWL": "Simbabwe-Dollar (2009)",
      "ZWR": "Simbabwe-Dollar (2008)",
    };
  }-*/;
}
