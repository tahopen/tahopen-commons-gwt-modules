package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_ru extends com.google.gwt.i18n.client.CurrencyList_ {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("RUB", "₽", 2, "руб.", "руб.");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "RUB", "₽", 2, "руб.", "руб."];
  }-*/;
  
  @Override
  protected HashMap<String, CurrencyData> loadCurrencyMapJava() {
    HashMap<String, CurrencyData> result = super.loadCurrencyMapJava();
    // Андоррская песета
    result.put("ADP", new CurrencyDataImpl("ADP", "ADP", 128, "ADP", "ADP"));
    // дирхам ОАЭ
    result.put("AED", new CurrencyDataImpl("AED", "DH", 2, "DH", "dh"));
    // Афгани (1927–2002)
    result.put("AFA", new CurrencyDataImpl("AFA", "AFA", 130, "AFA", "AFA"));
    // афгани
    result.put("AFN", new CurrencyDataImpl("AFN", "AFN", 0, "AFN", "Af."));
    // албанский лек
    result.put("ALL", new CurrencyDataImpl("ALL", "ALL", 0, "ALL", "Lek"));
    // армянский драм
    result.put("AMD", new CurrencyDataImpl("AMD", "AMD", 2, "AMD", "Dram"));
    // нидерландский антильский гульден
    result.put("ANG", new CurrencyDataImpl("ANG", "ANG", 2, "ANG", "ANG"));
    // ангольская кванза
    result.put("AOA", new CurrencyDataImpl("AOA", "AOA", 2, "AOA", "Kz"));
    // Ангольская кванза (1977–1990)
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130, "AOK", "AOK"));
    // Ангольская новая кванза (1990–2000)
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130, "AON", "AON"));
    // Ангольская кванза реюстадо (1995–1999)
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130, "AOR", "AOR"));
    // Аргентинский аустрал
    result.put("ARA", new CurrencyDataImpl("ARA", "ARA", 130, "ARA", "ARA"));
    // Аргентинское песо (1983–1985)
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130, "ARP", "ARP"));
    // аргентинский песо
    result.put("ARS", new CurrencyDataImpl("ARS", "AR$", 2, "AR$", "$"));
    // Австрийский шиллинг
    result.put("ATS", new CurrencyDataImpl("ATS", "ATS", 130, "ATS", "ATS"));
    // австралийский доллар
    result.put("AUD", new CurrencyDataImpl("AUD", "A$", 2, "AU$", "$"));
    // арубанский флорин
    result.put("AWG", new CurrencyDataImpl("AWG", "AWG", 2, "AWG", "Afl."));
    // Старый азербайджанский манат
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130, "AZM", "AZM"));
    // азербайджанский манат
    result.put("AZN", new CurrencyDataImpl("AZN", "AZN", 2, "AZN", "man."));
    // Динар Боснии и Герцеговины
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130, "BAD", "BAD"));
    // конвертируемая марка Боснии и Герцеговины
    result.put("BAM", new CurrencyDataImpl("BAM", "BAM", 2, "BAM", "KM"));
    // барбадосский доллар
    result.put("BBD", new CurrencyDataImpl("BBD", "BBD", 2, "BBD", "$"));
    // бангладешская така
    result.put("BDT", new CurrencyDataImpl("BDT", "Tk", 2, "Tk", "৳"));
    // Бельгийский франк (конвертируемый)
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 130, "BEC", "BEC"));
    // Бельгийский франк
    result.put("BEF", new CurrencyDataImpl("BEF", "BEF", 130, "BEF", "BEF"));
    // Бельгийский франк (финансовый)
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 130, "BEL", "BEL"));
    // Лев
    result.put("BGL", new CurrencyDataImpl("BGL", "BGL", 130, "BGL", "BGL"));
    // болгарский лев
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2, "BGN", "lev"));
    // бахрейнский динар
    result.put("BHD", new CurrencyDataImpl("BHD", "BHD", 3, "BHD", "din"));
    // бурундийский франк
    result.put("BIF", new CurrencyDataImpl("BIF", "BIF", 0, "BIF", "FBu"));
    // бермудский доллар
    result.put("BMD", new CurrencyDataImpl("BMD", "BMD", 2, "BMD", "$"));
    // брунейский доллар
    result.put("BND", new CurrencyDataImpl("BND", "BND", 2, "BND", "$"));
    // боливийский боливиано
    result.put("BOB", new CurrencyDataImpl("BOB", "BOB", 2, "BOB", "Bs"));
    // Боливийское песо
    result.put("BOP", new CurrencyDataImpl("BOP", "BOP", 130, "BOP", "BOP"));
    // Боливийский мвдол
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 130, "BOV", "BOV"));
    // Бразильский новый крузейро (1967–1986)
    result.put("BRB", new CurrencyDataImpl("BRB", "BRB", 130, "BRB", "BRB"));
    // Бразильское крузадо
    result.put("BRC", new CurrencyDataImpl("BRC", "BRC", 130, "BRC", "BRC"));
    // Бразильский крузейро (1990–1993)
    result.put("BRE", new CurrencyDataImpl("BRE", "BRE", 130, "BRE", "BRE"));
    // бразильский реал
    result.put("BRL", new CurrencyDataImpl("BRL", "R$", 2, "R$", "R$"));
    // Бразильское новое крузадо
    result.put("BRN", new CurrencyDataImpl("BRN", "BRN", 130, "BRN", "BRN"));
    // Бразильский крузейро
    result.put("BRR", new CurrencyDataImpl("BRR", "BRR", 130, "BRR", "BRR"));
    // багамский доллар
    result.put("BSD", new CurrencyDataImpl("BSD", "BSD", 2, "BSD", "$"));
    // бутанский нгултрум
    result.put("BTN", new CurrencyDataImpl("BTN", "BTN", 2, "BTN", "Nu."));
    // Джа
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130, "BUK", "BUK"));
    // ботсванская пула
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2, "BWP", "P"));
    // Белорусский рубль (1994–1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130, "BYB", "BYB"));
    // белорусский рубль
    result.put("BYN", new CurrencyDataImpl("BYN", "BYN", 2, "BYN", "BYN"));
    // Белорусский рубль (2000–2016)
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 128, "BYR", "BYR"));
    // белизский доллар
    result.put("BZD", new CurrencyDataImpl("BZD", "BZD", 2, "BZD", "$"));
    // канадский доллар
    result.put("CAD", new CurrencyDataImpl("CAD", "CA$", 2, "C$", "$"));
    // конголезский франк
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2, "CDF", "FrCD"));
    // WIR евро
    result.put("CHE", new CurrencyDataImpl("CHE", "CHE", 130, "CHE", "CHE"));
    // швейцарский франк
    result.put("CHF", new CurrencyDataImpl("CHF", "CHF", 2, "CHF", "CHF"));
    // WIR франк
    result.put("CHW", new CurrencyDataImpl("CHW", "CHW", 130, "CHW", "CHW"));
    // Условная расчетная единица Чили
    result.put("CLF", new CurrencyDataImpl("CLF", "CLF", 132, "CLF", "CLF"));
    // чилийский песо
    result.put("CLP", new CurrencyDataImpl("CLP", "CL$", 0, "CL$", "$"));
    // китайский офшорный юань
    result.put("CNH", new CurrencyDataImpl("CNH", "CNH", 130, "CNH", "CNH"));
    // китайский юань
    result.put("CNY", new CurrencyDataImpl("CNY", "CN¥", 2, "RMB¥", "¥"));
    // колумбийский песо
    result.put("COP", new CurrencyDataImpl("COP", "COL$", 2, "COL$", "$"));
    // Единица реальной стоимости Колумбии
    result.put("COU", new CurrencyDataImpl("COU", "COU", 130, "COU", "COU"));
    // костариканский колон
    result.put("CRC", new CurrencyDataImpl("CRC", "CR₡", 2, "CR₡", "₡"));
    // Старый Сербский динар
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130, "CSD", "CSD"));
    // Чехословацкая твердая крона
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130, "CSK", "CSK"));
    // кубинский конвертируемый песо
    result.put("CUC", new CurrencyDataImpl("CUC", "CUC", 2, "CUC", "$"));
    // кубинский песо
    result.put("CUP", new CurrencyDataImpl("CUP", "$MN", 2, "$MN", "$"));
    // эскудо Кабо-Верде
    result.put("CVE", new CurrencyDataImpl("CVE", "CVE", 2, "CVE", "CVE"));
    // Кипрский фунт
    result.put("CYP", new CurrencyDataImpl("CYP", "CYP", 130, "CYP", "CYP"));
    // чешская крона
    result.put("CZK", new CurrencyDataImpl("CZK", "Kč", 2, "Kč", "Kč"));
    // Восточногерманская марка
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130, "DDM", "DDM"));
    // Немецкая марка
    result.put("DEM", new CurrencyDataImpl("DEM", "DEM", 130, "DEM", "DEM"));
    // франк Джибути
    result.put("DJF", new CurrencyDataImpl("DJF", "Fdj", 0, "Fdj", "Fdj"));
    // датская крона
    result.put("DKK", new CurrencyDataImpl("DKK", "kr", 2, "kr", "kr"));
    // доминиканский песо
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$", "$"));
    // алжирский динар
    result.put("DZD", new CurrencyDataImpl("DZD", "DZD", 2, "DZD", "din"));
    // Эквадорский сукре
    result.put("ECS", new CurrencyDataImpl("ECS", "ECS", 130, "ECS", "ECS"));
    // Постоянная единица стоимости Эквадора
    result.put("ECV", new CurrencyDataImpl("ECV", "ECV", 130, "ECV", "ECV"));
    // Эстонская крона
    result.put("EEK", new CurrencyDataImpl("EEK", "EEK", 130, "EEK", "EEK"));
    // египетский фунт
    result.put("EGP", new CurrencyDataImpl("EGP", "LE", 2, "LE", "E£"));
    // эритрейская накфа
    result.put("ERN", new CurrencyDataImpl("ERN", "ERN", 2, "ERN", "Nfk"));
    // Испанская песета (А)
    result.put("ESA", new CurrencyDataImpl("ESA", "ESA", 130, "ESA", "ESA"));
    // Испанская песета (конвертируемая)
    result.put("ESB", new CurrencyDataImpl("ESB", "ESB", 130, "ESB", "ESB"));
    // Испанская песета
    result.put("ESP", new CurrencyDataImpl("ESP", "ESP", 128, "ESP", "ESP"));
    // эфиопский быр
    result.put("ETB", new CurrencyDataImpl("ETB", "ETB", 2, "ETB", "Birr"));
    // евро
    result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€", "€"));
    // Финская марка
    result.put("FIM", new CurrencyDataImpl("FIM", "FIM", 130, "FIM", "FIM"));
    // доллар Фиджи
    result.put("FJD", new CurrencyDataImpl("FJD", "FJD", 2, "FJD", "$"));
    // фунт Фолклендских островов
    result.put("FKP", new CurrencyDataImpl("FKP", "FKP", 2, "FKP", "£"));
    // Французский франк
    result.put("FRF", new CurrencyDataImpl("FRF", "FRF", 130, "FRF", "FRF"));
    // британский фунт стерлингов
    result.put("GBP", new CurrencyDataImpl("GBP", "£", 2, "GB£", "£"));
    // Грузинский купон
    result.put("GEK", new CurrencyDataImpl("GEK", "GEK", 130, "GEK", "GEK"));
    // грузинский лари
    result.put("GEL", new CurrencyDataImpl("GEL", "₾", 2, "₾", "GEL"));
    // Ганский седи (1979–2007)
    result.put("GHC", new CurrencyDataImpl("GHC", "GHC", 130, "GHC", "GHC"));
    // ганский седи
    result.put("GHS", new CurrencyDataImpl("GHS", "GHS", 2, "GHS", "GHS"));
    // гибралтарский фунт
    result.put("GIP", new CurrencyDataImpl("GIP", "GIP", 2, "GIP", "£"));
    // гамбийский даласи
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2, "GMD", "GMD"));
    // гвинейский франк
    result.put("GNF", new CurrencyDataImpl("GNF", "GNF", 0, "GNF", "FG"));
    // Гвинейская сили
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130, "GNS", "GNS"));
    // Эквеле экваториальной Гвинеи
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130, "GQE", "GQE"));
    // Греческая драхма
    result.put("GRD", new CurrencyDataImpl("GRD", "GRD", 130, "GRD", "GRD"));
    // гватемальский кетсаль
    result.put("GTQ", new CurrencyDataImpl("GTQ", "GTQ", 2, "GTQ", "Q"));
    // Эскудо Португальской Гвинеи
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130, "GWE", "GWE"));
    // Песо Гвинеи-Бисау
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 130, "GWP", "GWP"));
    // гайанский доллар
    result.put("GYD", new CurrencyDataImpl("GYD", "GYD", 2, "GYD", "$"));
    // гонконгский доллар
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$", "$"));
    // гондурасская лемпира
    result.put("HNL", new CurrencyDataImpl("HNL", "L", 2, "L", "L"));
    // Хорватский динар
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130, "HRD", "HRD"));
    // хорватская куна
    result.put("HRK", new CurrencyDataImpl("HRK", "HRK", 2, "HRK", "kn"));
    // гаитянский гурд
    result.put("HTG", new CurrencyDataImpl("HTG", "HTG", 2, "HTG", "HTG"));
    // венгерский форинт
    result.put("HUF", new CurrencyDataImpl("HUF", "HUF", 2, "HUF", "Ft"));
    // индонезийская рупия
    result.put("IDR", new CurrencyDataImpl("IDR", "IDR", 2, "IDR", "Rp"));
    // Ирландский фунт
    result.put("IEP", new CurrencyDataImpl("IEP", "IEP", 130, "IEP", "IEP"));
    // Израильский фунт
    result.put("ILP", new CurrencyDataImpl("ILP", "ILP", 130, "ILP", "ILP"));
    // новый израильский шекель
    result.put("ILS", new CurrencyDataImpl("ILS", "₪", 2, "IL₪", "₪"));
    // индийская рупия
    result.put("INR", new CurrencyDataImpl("INR", "₹", 2, "Rs", "₹"));
    // иракский динар
    result.put("IQD", new CurrencyDataImpl("IQD", "IQD", 0, "IQD", "din"));
    // иранский риал
    result.put("IRR", new CurrencyDataImpl("IRR", "IRR", 0, "IRR", "Rial"));
    // исландская крона
    result.put("ISK", new CurrencyDataImpl("ISK", "kr", 0, "kr", "kr"));
    // Итальянская лира
    result.put("ITL", new CurrencyDataImpl("ITL", "ITL", 128, "ITL", "ITL"));
    // ямайский доллар
    result.put("JMD", new CurrencyDataImpl("JMD", "JA$", 2, "JA$", "$"));
    // иорданский динар
    result.put("JOD", new CurrencyDataImpl("JOD", "JOD", 3, "JOD", "din"));
    // японская иена
    result.put("JPY", new CurrencyDataImpl("JPY", "¥", 0, "JP¥", "¥"));
    // кенийский шиллинг
    result.put("KES", new CurrencyDataImpl("KES", "Ksh", 2, "Ksh", "Ksh"));
    // киргизский сом
    result.put("KGS", new CurrencyDataImpl("KGS", "KGS", 2, "KGS", "KGS"));
    // камбоджийский риель
    result.put("KHR", new CurrencyDataImpl("KHR", "KHR", 2, "KHR", "Riel"));
    // коморский франк
    result.put("KMF", new CurrencyDataImpl("KMF", "KMF", 0, "KMF", "CF"));
    // северокорейская вона
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 0, "KPW", "₩"));
    // южнокорейская вона
    result.put("KRW", new CurrencyDataImpl("KRW", "₩", 0, "KR₩", "₩"));
    // кувейтский динар
    result.put("KWD", new CurrencyDataImpl("KWD", "KWD", 3, "KWD", "din"));
    // доллар Островов Кайман
    result.put("KYD", new CurrencyDataImpl("KYD", "KYD", 2, "KYD", "$"));
    // казахский тенге
    result.put("KZT", new CurrencyDataImpl("KZT", "KZT", 2, "KZT", "₸"));
    // лаосский кип
    result.put("LAK", new CurrencyDataImpl("LAK", "LAK", 0, "LAK", "₭"));
    // ливанский фунт
    result.put("LBP", new CurrencyDataImpl("LBP", "LBP", 0, "LBP", "L£"));
    // шри-ланкийская рупия
    result.put("LKR", new CurrencyDataImpl("LKR", "SLRs", 2, "SLRs", "Rs"));
    // либерийский доллар
    result.put("LRD", new CurrencyDataImpl("LRD", "LRD", 2, "LRD", "$"));
    // Лоти
    result.put("LSL", new CurrencyDataImpl("LSL", "LSL", 2, "LSL", "LSL"));
    // Литовский лит
    result.put("LTL", new CurrencyDataImpl("LTL", "LTL", 130, "LTL", "Lt"));
    // Литовский талон
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130, "LTT", "LTT"));
    // Конвертируемый франк Люксембурга
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 130, "LUC", "LUC"));
    // Люксембургский франк
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128, "LUF", "LUF"));
    // Финансовый франк Люксембурга
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 130, "LUL", "LUL"));
    // Латвийский лат
    result.put("LVL", new CurrencyDataImpl("LVL", "LVL", 130, "LVL", "Ls"));
    // Латвийский рубль
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130, "LVR", "LVR"));
    // ливийский динар
    result.put("LYD", new CurrencyDataImpl("LYD", "LYD", 3, "LYD", "din"));
    // марокканский дирхам
    result.put("MAD", new CurrencyDataImpl("MAD", "MAD", 2, "MAD", "MAD"));
    // Марокканский франк
    result.put("MAF", new CurrencyDataImpl("MAF", "MAF", 130, "MAF", "MAF"));
    // молдавский лей
    result.put("MDL", new CurrencyDataImpl("MDL", "MDL", 2, "MDL", "MDL"));
    // малагасийский ариари
    result.put("MGA", new CurrencyDataImpl("MGA", "MGA", 0, "MGA", "Ar"));
    // Малагасийский франк
    result.put("MGF", new CurrencyDataImpl("MGF", "MGF", 128, "MGF", "MGF"));
    // македонский денар
    result.put("MKD", new CurrencyDataImpl("MKD", "MKD", 2, "MKD", "din"));
    // Малийский франк
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130, "MLF", "MLF"));
    // мьянманский кьят
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 0, "MMK", "K"));
    // монгольский тугрик
    result.put("MNT", new CurrencyDataImpl("MNT", "MN₮", 2, "MN₮", "₮"));
    // патака Макао
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP", 2, "MOP", "MOP"));
    // мавританская угия (1973–2017)
    result.put("MRO", new CurrencyDataImpl("MRO", "MRO", 128, "MRO", "MRO"));
    // мавританская угия
    result.put("MRU", new CurrencyDataImpl("MRU", "MRU", 2, "MRU", "MRU"));
    // Мальтийская лира
    result.put("MTL", new CurrencyDataImpl("MTL", "MTL", 130, "MTL", "MTL"));
    // Мальтийский фунт
    result.put("MTP", new CurrencyDataImpl("MTP", "MTP", 130, "MTP", "MTP"));
    // маврикийская рупия
    result.put("MUR", new CurrencyDataImpl("MUR", "MUR", 2, "MUR", "Rs"));
    // мальдивская руфия
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2, "MVR", "MVR"));
    // малавийская квача
    result.put("MWK", new CurrencyDataImpl("MWK", "MWK", 2, "MWK", "MWK"));
    // мексиканский песо
    result.put("MXN", new CurrencyDataImpl("MXN", "MX$", 2, "Mex$", "$"));
    // Мексиканское серебряное песо (1861–1992)
    result.put("MXP", new CurrencyDataImpl("MXP", "MXP", 130, "MXP", "MXP"));
    // Мексиканская пересчетная единица (UDI)
    result.put("MXV", new CurrencyDataImpl("MXV", "MXV", 130, "MXV", "MXV"));
    // малайзийский ринггит
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM", "RM"));
    // Мозамбикское эскудо
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130, "MZE", "MZE"));
    // Старый мозамбикский метикал
    result.put("MZM", new CurrencyDataImpl("MZM", "MZM", 130, "MZM", "MZM"));
    // мозамбикский метикал
    result.put("MZN", new CurrencyDataImpl("MZN", "MZN", 2, "MZN", "MTn"));
    // доллар Намибии
    result.put("NAD", new CurrencyDataImpl("NAD", "NAD", 2, "NAD", "$"));
    // нигерийская найра
    result.put("NGN", new CurrencyDataImpl("NGN", "NGN", 2, "NGN", "₦"));
    // Никарагуанская кордоба (1988–1991)
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130, "NIC", "NIC"));
    // никарагуанская кордоба
    result.put("NIO", new CurrencyDataImpl("NIO", "NIO", 2, "NIO", "C$"));
    // Нидерландский гульден
    result.put("NLG", new CurrencyDataImpl("NLG", "NLG", 130, "NLG", "NLG"));
    // норвежская крона
    result.put("NOK", new CurrencyDataImpl("NOK", "NOkr", 2, "NOkr", "kr"));
    // непальская рупия
    result.put("NPR", new CurrencyDataImpl("NPR", "NPR", 2, "NPR", "Rs"));
    // новозеландский доллар
    result.put("NZD", new CurrencyDataImpl("NZD", "NZ$", 2, "NZ$", "$"));
    // оманский риал
    result.put("OMR", new CurrencyDataImpl("OMR", "OMR", 3, "OMR", "Rial"));
    // панамский бальбоа
    result.put("PAB", new CurrencyDataImpl("PAB", "B/.", 2, "B/.", "B/."));
    // Перуанское инти
    result.put("PEI", new CurrencyDataImpl("PEI", "PEI", 130, "PEI", "PEI"));
    // перуанский соль
    result.put("PEN", new CurrencyDataImpl("PEN", "S/.", 2, "S/.", "S/."));
    // Перуанский соль (1863–1965)
    result.put("PES", new CurrencyDataImpl("PES", "PES", 130, "PES", "PES"));
    // кина Папуа – Новой Гвинеи
    result.put("PGK", new CurrencyDataImpl("PGK", "PGK", 2, "PGK", "PGK"));
    // филиппинский песо
    result.put("PHP", new CurrencyDataImpl("PHP", "PHP", 2, "PHP", "₱"));
    // пакистанская рупия
    result.put("PKR", new CurrencyDataImpl("PKR", "PKRs.", 2, "PKRs.", "Rs"));
    // польский злотый
    result.put("PLN", new CurrencyDataImpl("PLN", "PLN", 2, "PLN", "zł"));
    // Злотый
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130, "PLZ", "PLZ"));
    // Португальское эскудо
    result.put("PTE", new CurrencyDataImpl("PTE", "PTE", 130, "PTE", "PTE"));
    // парагвайский гуарани
    result.put("PYG", new CurrencyDataImpl("PYG", "PYG", 0, "PYG", "Gs"));
    // катарский риал
    result.put("QAR", new CurrencyDataImpl("QAR", "QAR", 2, "QAR", "Rial"));
    // Родезийский доллар
    result.put("RHD", new CurrencyDataImpl("RHD", "RHD", 130, "RHD", "RHD"));
    // Старый Румынский лей
    result.put("ROL", new CurrencyDataImpl("ROL", "ROL", 130, "ROL", "ROL"));
    // румынский лей
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2, "RON", "RON"));
    // сербский динар
    result.put("RSD", new CurrencyDataImpl("RSD", "RSD", 0, "RSD", "din"));
    // российский рубль
    result.put("RUB", new CurrencyDataImpl("RUB", "₽", 2, "руб.", "руб."));
    // Российский рубль (1991–1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "р.", 130, "р.", "р."));
    // франк Руанды
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0, "RWF", "RF"));
    // саудовский риял
    result.put("SAR", new CurrencyDataImpl("SAR", "SR", 2, "SR", "Rial"));
    // доллар Соломоновых Островов
    result.put("SBD", new CurrencyDataImpl("SBD", "SBD", 2, "SBD", "$"));
    // сейшельская рупия
    result.put("SCR", new CurrencyDataImpl("SCR", "SCR", 2, "SCR", "SCR"));
    // Суданский динар
    result.put("SDD", new CurrencyDataImpl("SDD", "SDD", 130, "SDD", "SDD"));
    // суданский фунт
    result.put("SDG", new CurrencyDataImpl("SDG", "SDG", 2, "SDG", "SDG"));
    // Старый суданский фунт
    result.put("SDP", new CurrencyDataImpl("SDP", "SDP", 130, "SDP", "SDP"));
    // шведская крона
    result.put("SEK", new CurrencyDataImpl("SEK", "kr", 2, "kr", "kr"));
    // сингапурский доллар
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$", "$"));
    // фунт острова Святой Елены
    result.put("SHP", new CurrencyDataImpl("SHP", "SHP", 2, "SHP", "£"));
    // Словенский толар
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130, "SIT", "SIT"));
    // Словацкая крона
    result.put("SKK", new CurrencyDataImpl("SKK", "SKK", 130, "SKK", "SKK"));
    // леоне
    result.put("SLL", new CurrencyDataImpl("SLL", "SLL", 0, "SLL", "SLL"));
    // сомалийский шиллинг
    result.put("SOS", new CurrencyDataImpl("SOS", "SOS", 0, "SOS", "SOS"));
    // суринамский доллар
    result.put("SRD", new CurrencyDataImpl("SRD", "SRD", 2, "SRD", "$"));
    // Суринамский гульден
    result.put("SRG", new CurrencyDataImpl("SRG", "SRG", 130, "SRG", "SRG"));
    // южносуданский фунт
    result.put("SSP", new CurrencyDataImpl("SSP", "SSP", 2, "SSP", "SSP"));
    // добра Сан-Томе и Принсипи (1977–2017)
    result.put("STD", new CurrencyDataImpl("STD", "STD", 128, "STD", "Db"));
    // добра Сан-Томе и Принсипи
    result.put("STN", new CurrencyDataImpl("STN", "STN", 2, "STN", "STN"));
    // Рубль СССР
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130, "SUR", "SUR"));
    // Сальвадорский колон
    result.put("SVC", new CurrencyDataImpl("SVC", "SVC", 130, "SVC", "SVC"));
    // сирийский фунт
    result.put("SYP", new CurrencyDataImpl("SYP", "SYP", 0, "SYP", "£"));
    // свазилендский лилангени
    result.put("SZL", new CurrencyDataImpl("SZL", "SZL", 2, "SZL", "SZL"));
    // таиландский бат
    result.put("THB", new CurrencyDataImpl("THB", "฿", 2, "THB", "฿"));
    // Таджикский рубль
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130, "TJR", "TJR"));
    // таджикский сомони
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2, "TJS", "Som"));
    // Туркменский манат
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 128, "TMM", "TMM"));
    // новый туркменский манат
    result.put("TMT", new CurrencyDataImpl("TMT", "ТМТ", 2, "ТМТ", "ТМТ"));
    // тунисский динар
    result.put("TND", new CurrencyDataImpl("TND", "TND", 3, "TND", "din"));
    // тонганская паанга
    result.put("TOP", new CurrencyDataImpl("TOP", "TOP", 2, "TOP", "T$"));
    // Тиморское эскудо
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130, "TPE", "TPE"));
    // Турецкая лира (1922–2005)
    result.put("TRL", new CurrencyDataImpl("TRL", "TRL", 128, "TRL", "TRL"));
    // турецкая лира
    result.put("TRY", new CurrencyDataImpl("TRY", "TL", 2, "YTL", "TL"));
    // доллар Тринидада и Тобаго
    result.put("TTD", new CurrencyDataImpl("TTD", "TTD", 2, "TTD", "$"));
    // новый тайваньский доллар
    result.put("TWD", new CurrencyDataImpl("TWD", "NT$", 2, "NT$", "NT$"));
    // танзанийский шиллинг
    result.put("TZS", new CurrencyDataImpl("TZS", "TZS", 2, "TZS", "TSh"));
    // украинская гривна
    result.put("UAH", new CurrencyDataImpl("UAH", "грн.", 2, "грн.", "₴"));
    // Карбованец (украинский)
    result.put("UAK", new CurrencyDataImpl("UAK", "UAK", 130, "UAK", "UAK"));
    // Старый угандийский шиллинг
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130, "UGS", "UGS"));
    // угандийский шиллинг
    result.put("UGX", new CurrencyDataImpl("UGX", "UGX", 0, "UGX", "UGX"));
    // доллар США
    result.put("USD", new CurrencyDataImpl("USD", "$", 2, "US$", "$"));
    // Доллар США следующего дня
    result.put("USN", new CurrencyDataImpl("USN", "USN", 130, "USN", "USN"));
    // Доллар США текущего дня
    result.put("USS", new CurrencyDataImpl("USS", "USS", 130, "USS", "USS"));
    // Уругвайский песо (индекс инфляции)
    result.put("UYI", new CurrencyDataImpl("UYI", "UYI", 128, "UYI", "UYI"));
    // Уругвайское старое песо (1975–1993)
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130, "UYP", "UYP"));
    // уругвайский песо
    result.put("UYU", new CurrencyDataImpl("UYU", "UY$", 2, "UY$", "$"));
    // узбекский сум
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 2, "UZS", "soʼm"));
    // Венесуэльский боливар (1871–2008)
    result.put("VEB", new CurrencyDataImpl("VEB", "VEB", 130, "VEB", "VEB"));
    // венесуэльский боливар (2008–2018)
    result.put("VEF", new CurrencyDataImpl("VEF", "VEF", 130, "VEF", "Bs"));
    // венесуэльский боливар
    result.put("VES", new CurrencyDataImpl("VES", "VES", 2, "VES", "VES"));
    // вьетнамский донг
    result.put("VND", new CurrencyDataImpl("VND", "₫", 24, "₫", "₫"));
    // вату Вануату
    result.put("VUV", new CurrencyDataImpl("VUV", "VUV", 0, "VUV", "VUV"));
    // самоанская тала
    result.put("WST", new CurrencyDataImpl("WST", "WST", 2, "WST", "WST"));
    // франк КФА BEAC
    result.put("XAF", new CurrencyDataImpl("XAF", "FCFA", 0, "FCFA", "FCFA"));
    // Серебро
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 130, "XAG", "XAG"));
    // Золото
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 130, "XAU", "XAU"));
    // Европейская составная единица
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 130, "XBA", "XBA"));
    // Европейская денежная единица
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 130, "XBB", "XBB"));
    // расчетная единица европейского валютного соглашения (XBC)
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 130, "XBC", "XBC"));
    // расчетная единица европейского валютного соглашения (XBD)
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 130, "XBD", "XBD"));
    // восточно-карибский доллар
    result.put("XCD", new CurrencyDataImpl("XCD", "EC$", 2, "EC$", "$"));
    // СДР (специальные права заимствования)
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 130, "XDR", "XDR"));
    // ЭКЮ (единица европейской валюты)
    result.put("XEU", new CurrencyDataImpl("XEU", "XEU", 130, "XEU", "XEU"));
    // Французский золотой франк
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 130, "XFO", "XFO"));
    // Французский UIC-франк
    result.put("XFU", new CurrencyDataImpl("XFU", "XFU", 130, "XFU", "XFU"));
    // франк КФА ВСЕАО
    result.put("XOF", new CurrencyDataImpl("XOF", "CFA", 0, "CFA", "CFA"));
    // Палладий
    result.put("XPD", new CurrencyDataImpl("XPD", "XPD", 130, "XPD", "XPD"));
    // французский тихоокеанский франк
    result.put("XPF", new CurrencyDataImpl("XPF", "CFPF", 0, "CFPF", "FCFP"));
    // Платина
    result.put("XPT", new CurrencyDataImpl("XPT", "XPT", 130, "XPT", "XPT"));
    // единица RINET-фондов
    result.put("XRE", new CurrencyDataImpl("XRE", "XRE", 130, "XRE", "XRE"));
    // тестовый валютный код
    result.put("XTS", new CurrencyDataImpl("XTS", "XTS", 130, "XTS", "XTS"));
    // неизвестная валюта
    result.put("XXX", new CurrencyDataImpl("XXX", "XXXX", 130, "XXXX", "XXXX"));
    // Йеменский динар
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130, "YDD", "YDD"));
    // йеменский риал
    result.put("YER", new CurrencyDataImpl("YER", "YER", 0, "YER", "Rial"));
    // Югославский твердый динар
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130, "YUD", "YUD"));
    // Югославский новый динар
    result.put("YUM", new CurrencyDataImpl("YUM", "YUM", 130, "YUM", "YUM"));
    // Югославский динар
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130, "YUN", "YUN"));
    // Южноафриканский рэнд (финансовый)
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 130, "ZAL", "ZAL"));
    // южноафриканский рэнд
    result.put("ZAR", new CurrencyDataImpl("ZAR", "ZAR", 2, "ZAR", "R"));
    // Квача (замбийская) (1968–2012)
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZMK", 128, "ZMK", "ZWK"));
    // замбийская квача
    result.put("ZMW", new CurrencyDataImpl("ZMW", "ZMW", 2, "ZMW", "ZMW"));
    // Новый заир
    result.put("ZRN", new CurrencyDataImpl("ZRN", "ZRN", 130, "ZRN", "ZRN"));
    // Заир
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"));
    // Доллар Зимбабве
    result.put("ZWD", new CurrencyDataImpl("ZWD", "ZWD", 128, "ZWD", "ZWD"));
    // Доллар Зимбабве (2009)
    result.put("ZWL", new CurrencyDataImpl("ZWL", "ZWL", 130, "ZWL", "ZWL"));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // Андоррская песета
      "ADP": [ "ADP", "ADP", 128, "ADP", "ADP"],
      // дирхам ОАЭ
      "AED": [ "AED", "DH", 2, "DH", "dh"],
      // Афгани (1927–2002)
      "AFA": [ "AFA", "AFA", 130, "AFA", "AFA"],
      // афгани
      "AFN": [ "AFN", "AFN", 0, "AFN", "Af."],
      // албанский лек
      "ALL": [ "ALL", "ALL", 0, "ALL", "Lek"],
      // армянский драм
      "AMD": [ "AMD", "AMD", 2, "AMD", "Dram"],
      // нидерландский антильский гульден
      "ANG": [ "ANG", "ANG", 2, "ANG", "ANG"],
      // ангольская кванза
      "AOA": [ "AOA", "AOA", 2, "AOA", "Kz"],
      // Ангольская кванза (1977–1990)
      "AOK": [ "AOK", "AOK", 130, "AOK", "AOK"],
      // Ангольская новая кванза (1990–2000)
      "AON": [ "AON", "AON", 130, "AON", "AON"],
      // Ангольская кванза реюстадо (1995–1999)
      "AOR": [ "AOR", "AOR", 130, "AOR", "AOR"],
      // Аргентинский аустрал
      "ARA": [ "ARA", "ARA", 130, "ARA", "ARA"],
      // Аргентинское песо (1983–1985)
      "ARP": [ "ARP", "ARP", 130, "ARP", "ARP"],
      // аргентинский песо
      "ARS": [ "ARS", "AR$", 2, "AR$", "$"],
      // Австрийский шиллинг
      "ATS": [ "ATS", "ATS", 130, "ATS", "ATS"],
      // австралийский доллар
      "AUD": [ "AUD", "A$", 2, "AU$", "$"],
      // арубанский флорин
      "AWG": [ "AWG", "AWG", 2, "AWG", "Afl."],
      // Старый азербайджанский манат
      "AZM": [ "AZM", "AZM", 130, "AZM", "AZM"],
      // азербайджанский манат
      "AZN": [ "AZN", "AZN", 2, "AZN", "man."],
      // Динар Боснии и Герцеговины
      "BAD": [ "BAD", "BAD", 130, "BAD", "BAD"],
      // конвертируемая марка Боснии и Герцеговины
      "BAM": [ "BAM", "BAM", 2, "BAM", "KM"],
      // барбадосский доллар
      "BBD": [ "BBD", "BBD", 2, "BBD", "$"],
      // бангладешская така
      "BDT": [ "BDT", "Tk", 2, "Tk", "৳"],
      // Бельгийский франк (конвертируемый)
      "BEC": [ "BEC", "BEC", 130, "BEC", "BEC"],
      // Бельгийский франк
      "BEF": [ "BEF", "BEF", 130, "BEF", "BEF"],
      // Бельгийский франк (финансовый)
      "BEL": [ "BEL", "BEL", 130, "BEL", "BEL"],
      // Лев
      "BGL": [ "BGL", "BGL", 130, "BGL", "BGL"],
      // болгарский лев
      "BGN": [ "BGN", "BGN", 2, "BGN", "lev"],
      // бахрейнский динар
      "BHD": [ "BHD", "BHD", 3, "BHD", "din"],
      // бурундийский франк
      "BIF": [ "BIF", "BIF", 0, "BIF", "FBu"],
      // бермудский доллар
      "BMD": [ "BMD", "BMD", 2, "BMD", "$"],
      // брунейский доллар
      "BND": [ "BND", "BND", 2, "BND", "$"],
      // боливийский боливиано
      "BOB": [ "BOB", "BOB", 2, "BOB", "Bs"],
      // Боливийское песо
      "BOP": [ "BOP", "BOP", 130, "BOP", "BOP"],
      // Боливийский мвдол
      "BOV": [ "BOV", "BOV", 130, "BOV", "BOV"],
      // Бразильский новый крузейро (1967–1986)
      "BRB": [ "BRB", "BRB", 130, "BRB", "BRB"],
      // Бразильское крузадо
      "BRC": [ "BRC", "BRC", 130, "BRC", "BRC"],
      // Бразильский крузейро (1990–1993)
      "BRE": [ "BRE", "BRE", 130, "BRE", "BRE"],
      // бразильский реал
      "BRL": [ "BRL", "R$", 2, "R$", "R$"],
      // Бразильское новое крузадо
      "BRN": [ "BRN", "BRN", 130, "BRN", "BRN"],
      // Бразильский крузейро
      "BRR": [ "BRR", "BRR", 130, "BRR", "BRR"],
      // багамский доллар
      "BSD": [ "BSD", "BSD", 2, "BSD", "$"],
      // бутанский нгултрум
      "BTN": [ "BTN", "BTN", 2, "BTN", "Nu."],
      // Джа
      "BUK": [ "BUK", "BUK", 130, "BUK", "BUK"],
      // ботсванская пула
      "BWP": [ "BWP", "BWP", 2, "BWP", "P"],
      // Белорусский рубль (1994–1999)
      "BYB": [ "BYB", "BYB", 130, "BYB", "BYB"],
      // белорусский рубль
      "BYN": [ "BYN", "BYN", 2, "BYN", "BYN"],
      // Белорусский рубль (2000–2016)
      "BYR": [ "BYR", "BYR", 128, "BYR", "BYR"],
      // белизский доллар
      "BZD": [ "BZD", "BZD", 2, "BZD", "$"],
      // канадский доллар
      "CAD": [ "CAD", "CA$", 2, "C$", "$"],
      // конголезский франк
      "CDF": [ "CDF", "CDF", 2, "CDF", "FrCD"],
      // WIR евро
      "CHE": [ "CHE", "CHE", 130, "CHE", "CHE"],
      // швейцарский франк
      "CHF": [ "CHF", "CHF", 2, "CHF", "CHF"],
      // WIR франк
      "CHW": [ "CHW", "CHW", 130, "CHW", "CHW"],
      // Условная расчетная единица Чили
      "CLF": [ "CLF", "CLF", 132, "CLF", "CLF"],
      // чилийский песо
      "CLP": [ "CLP", "CL$", 0, "CL$", "$"],
      // китайский офшорный юань
      "CNH": [ "CNH", "CNH", 130, "CNH", "CNH"],
      // китайский юань
      "CNY": [ "CNY", "CN¥", 2, "RMB¥", "¥"],
      // колумбийский песо
      "COP": [ "COP", "COL$", 2, "COL$", "$"],
      // Единица реальной стоимости Колумбии
      "COU": [ "COU", "COU", 130, "COU", "COU"],
      // костариканский колон
      "CRC": [ "CRC", "CR₡", 2, "CR₡", "₡"],
      // Старый Сербский динар
      "CSD": [ "CSD", "CSD", 130, "CSD", "CSD"],
      // Чехословацкая твердая крона
      "CSK": [ "CSK", "CSK", 130, "CSK", "CSK"],
      // кубинский конвертируемый песо
      "CUC": [ "CUC", "CUC", 2, "CUC", "$"],
      // кубинский песо
      "CUP": [ "CUP", "$MN", 2, "$MN", "$"],
      // эскудо Кабо-Верде
      "CVE": [ "CVE", "CVE", 2, "CVE", "CVE"],
      // Кипрский фунт
      "CYP": [ "CYP", "CYP", 130, "CYP", "CYP"],
      // чешская крона
      "CZK": [ "CZK", "Kč", 2, "Kč", "Kč"],
      // Восточногерманская марка
      "DDM": [ "DDM", "DDM", 130, "DDM", "DDM"],
      // Немецкая марка
      "DEM": [ "DEM", "DEM", 130, "DEM", "DEM"],
      // франк Джибути
      "DJF": [ "DJF", "Fdj", 0, "Fdj", "Fdj"],
      // датская крона
      "DKK": [ "DKK", "kr", 2, "kr", "kr"],
      // доминиканский песо
      "DOP": [ "DOP", "RD$", 2, "RD$", "$"],
      // алжирский динар
      "DZD": [ "DZD", "DZD", 2, "DZD", "din"],
      // Эквадорский сукре
      "ECS": [ "ECS", "ECS", 130, "ECS", "ECS"],
      // Постоянная единица стоимости Эквадора
      "ECV": [ "ECV", "ECV", 130, "ECV", "ECV"],
      // Эстонская крона
      "EEK": [ "EEK", "EEK", 130, "EEK", "EEK"],
      // египетский фунт
      "EGP": [ "EGP", "LE", 2, "LE", "E£"],
      // эритрейская накфа
      "ERN": [ "ERN", "ERN", 2, "ERN", "Nfk"],
      // Испанская песета (А)
      "ESA": [ "ESA", "ESA", 130, "ESA", "ESA"],
      // Испанская песета (конвертируемая)
      "ESB": [ "ESB", "ESB", 130, "ESB", "ESB"],
      // Испанская песета
      "ESP": [ "ESP", "ESP", 128, "ESP", "ESP"],
      // эфиопский быр
      "ETB": [ "ETB", "ETB", 2, "ETB", "Birr"],
      // евро
      "EUR": [ "EUR", "€", 2, "€", "€"],
      // Финская марка
      "FIM": [ "FIM", "FIM", 130, "FIM", "FIM"],
      // доллар Фиджи
      "FJD": [ "FJD", "FJD", 2, "FJD", "$"],
      // фунт Фолклендских островов
      "FKP": [ "FKP", "FKP", 2, "FKP", "£"],
      // Французский франк
      "FRF": [ "FRF", "FRF", 130, "FRF", "FRF"],
      // британский фунт стерлингов
      "GBP": [ "GBP", "£", 2, "GB£", "£"],
      // Грузинский купон
      "GEK": [ "GEK", "GEK", 130, "GEK", "GEK"],
      // грузинский лари
      "GEL": [ "GEL", "₾", 2, "₾", "GEL"],
      // Ганский седи (1979–2007)
      "GHC": [ "GHC", "GHC", 130, "GHC", "GHC"],
      // ганский седи
      "GHS": [ "GHS", "GHS", 2, "GHS", "GHS"],
      // гибралтарский фунт
      "GIP": [ "GIP", "GIP", 2, "GIP", "£"],
      // гамбийский даласи
      "GMD": [ "GMD", "GMD", 2, "GMD", "GMD"],
      // гвинейский франк
      "GNF": [ "GNF", "GNF", 0, "GNF", "FG"],
      // Гвинейская сили
      "GNS": [ "GNS", "GNS", 130, "GNS", "GNS"],
      // Эквеле экваториальной Гвинеи
      "GQE": [ "GQE", "GQE", 130, "GQE", "GQE"],
      // Греческая драхма
      "GRD": [ "GRD", "GRD", 130, "GRD", "GRD"],
      // гватемальский кетсаль
      "GTQ": [ "GTQ", "GTQ", 2, "GTQ", "Q"],
      // Эскудо Португальской Гвинеи
      "GWE": [ "GWE", "GWE", 130, "GWE", "GWE"],
      // Песо Гвинеи-Бисау
      "GWP": [ "GWP", "GWP", 130, "GWP", "GWP"],
      // гайанский доллар
      "GYD": [ "GYD", "GYD", 2, "GYD", "$"],
      // гонконгский доллар
      "HKD": [ "HKD", "HK$", 2, "HK$", "$"],
      // гондурасская лемпира
      "HNL": [ "HNL", "L", 2, "L", "L"],
      // Хорватский динар
      "HRD": [ "HRD", "HRD", 130, "HRD", "HRD"],
      // хорватская куна
      "HRK": [ "HRK", "HRK", 2, "HRK", "kn"],
      // гаитянский гурд
      "HTG": [ "HTG", "HTG", 2, "HTG", "HTG"],
      // венгерский форинт
      "HUF": [ "HUF", "HUF", 2, "HUF", "Ft"],
      // индонезийская рупия
      "IDR": [ "IDR", "IDR", 2, "IDR", "Rp"],
      // Ирландский фунт
      "IEP": [ "IEP", "IEP", 130, "IEP", "IEP"],
      // Израильский фунт
      "ILP": [ "ILP", "ILP", 130, "ILP", "ILP"],
      // новый израильский шекель
      "ILS": [ "ILS", "₪", 2, "IL₪", "₪"],
      // индийская рупия
      "INR": [ "INR", "₹", 2, "Rs", "₹"],
      // иракский динар
      "IQD": [ "IQD", "IQD", 0, "IQD", "din"],
      // иранский риал
      "IRR": [ "IRR", "IRR", 0, "IRR", "Rial"],
      // исландская крона
      "ISK": [ "ISK", "kr", 0, "kr", "kr"],
      // Итальянская лира
      "ITL": [ "ITL", "ITL", 128, "ITL", "ITL"],
      // ямайский доллар
      "JMD": [ "JMD", "JA$", 2, "JA$", "$"],
      // иорданский динар
      "JOD": [ "JOD", "JOD", 3, "JOD", "din"],
      // японская иена
      "JPY": [ "JPY", "¥", 0, "JP¥", "¥"],
      // кенийский шиллинг
      "KES": [ "KES", "Ksh", 2, "Ksh", "Ksh"],
      // киргизский сом
      "KGS": [ "KGS", "KGS", 2, "KGS", "KGS"],
      // камбоджийский риель
      "KHR": [ "KHR", "KHR", 2, "KHR", "Riel"],
      // коморский франк
      "KMF": [ "KMF", "KMF", 0, "KMF", "CF"],
      // северокорейская вона
      "KPW": [ "KPW", "KPW", 0, "KPW", "₩"],
      // южнокорейская вона
      "KRW": [ "KRW", "₩", 0, "KR₩", "₩"],
      // кувейтский динар
      "KWD": [ "KWD", "KWD", 3, "KWD", "din"],
      // доллар Островов Кайман
      "KYD": [ "KYD", "KYD", 2, "KYD", "$"],
      // казахский тенге
      "KZT": [ "KZT", "KZT", 2, "KZT", "₸"],
      // лаосский кип
      "LAK": [ "LAK", "LAK", 0, "LAK", "₭"],
      // ливанский фунт
      "LBP": [ "LBP", "LBP", 0, "LBP", "L£"],
      // шри-ланкийская рупия
      "LKR": [ "LKR", "SLRs", 2, "SLRs", "Rs"],
      // либерийский доллар
      "LRD": [ "LRD", "LRD", 2, "LRD", "$"],
      // Лоти
      "LSL": [ "LSL", "LSL", 2, "LSL", "LSL"],
      // Литовский лит
      "LTL": [ "LTL", "LTL", 130, "LTL", "Lt"],
      // Литовский талон
      "LTT": [ "LTT", "LTT", 130, "LTT", "LTT"],
      // Конвертируемый франк Люксембурга
      "LUC": [ "LUC", "LUC", 130, "LUC", "LUC"],
      // Люксембургский франк
      "LUF": [ "LUF", "LUF", 128, "LUF", "LUF"],
      // Финансовый франк Люксембурга
      "LUL": [ "LUL", "LUL", 130, "LUL", "LUL"],
      // Латвийский лат
      "LVL": [ "LVL", "LVL", 130, "LVL", "Ls"],
      // Латвийский рубль
      "LVR": [ "LVR", "LVR", 130, "LVR", "LVR"],
      // ливийский динар
      "LYD": [ "LYD", "LYD", 3, "LYD", "din"],
      // марокканский дирхам
      "MAD": [ "MAD", "MAD", 2, "MAD", "MAD"],
      // Марокканский франк
      "MAF": [ "MAF", "MAF", 130, "MAF", "MAF"],
      // молдавский лей
      "MDL": [ "MDL", "MDL", 2, "MDL", "MDL"],
      // малагасийский ариари
      "MGA": [ "MGA", "MGA", 0, "MGA", "Ar"],
      // Малагасийский франк
      "MGF": [ "MGF", "MGF", 128, "MGF", "MGF"],
      // македонский денар
      "MKD": [ "MKD", "MKD", 2, "MKD", "din"],
      // Малийский франк
      "MLF": [ "MLF", "MLF", 130, "MLF", "MLF"],
      // мьянманский кьят
      "MMK": [ "MMK", "MMK", 0, "MMK", "K"],
      // монгольский тугрик
      "MNT": [ "MNT", "MN₮", 2, "MN₮", "₮"],
      // патака Макао
      "MOP": [ "MOP", "MOP", 2, "MOP", "MOP"],
      // мавританская угия (1973–2017)
      "MRO": [ "MRO", "MRO", 128, "MRO", "MRO"],
      // мавританская угия
      "MRU": [ "MRU", "MRU", 2, "MRU", "MRU"],
      // Мальтийская лира
      "MTL": [ "MTL", "MTL", 130, "MTL", "MTL"],
      // Мальтийский фунт
      "MTP": [ "MTP", "MTP", 130, "MTP", "MTP"],
      // маврикийская рупия
      "MUR": [ "MUR", "MUR", 2, "MUR", "Rs"],
      // мальдивская руфия
      "MVR": [ "MVR", "MVR", 2, "MVR", "MVR"],
      // малавийская квача
      "MWK": [ "MWK", "MWK", 2, "MWK", "MWK"],
      // мексиканский песо
      "MXN": [ "MXN", "MX$", 2, "Mex$", "$"],
      // Мексиканское серебряное песо (1861–1992)
      "MXP": [ "MXP", "MXP", 130, "MXP", "MXP"],
      // Мексиканская пересчетная единица (UDI)
      "MXV": [ "MXV", "MXV", 130, "MXV", "MXV"],
      // малайзийский ринггит
      "MYR": [ "MYR", "RM", 2, "RM", "RM"],
      // Мозамбикское эскудо
      "MZE": [ "MZE", "MZE", 130, "MZE", "MZE"],
      // Старый мозамбикский метикал
      "MZM": [ "MZM", "MZM", 130, "MZM", "MZM"],
      // мозамбикский метикал
      "MZN": [ "MZN", "MZN", 2, "MZN", "MTn"],
      // доллар Намибии
      "NAD": [ "NAD", "NAD", 2, "NAD", "$"],
      // нигерийская найра
      "NGN": [ "NGN", "NGN", 2, "NGN", "₦"],
      // Никарагуанская кордоба (1988–1991)
      "NIC": [ "NIC", "NIC", 130, "NIC", "NIC"],
      // никарагуанская кордоба
      "NIO": [ "NIO", "NIO", 2, "NIO", "C$"],
      // Нидерландский гульден
      "NLG": [ "NLG", "NLG", 130, "NLG", "NLG"],
      // норвежская крона
      "NOK": [ "NOK", "NOkr", 2, "NOkr", "kr"],
      // непальская рупия
      "NPR": [ "NPR", "NPR", 2, "NPR", "Rs"],
      // новозеландский доллар
      "NZD": [ "NZD", "NZ$", 2, "NZ$", "$"],
      // оманский риал
      "OMR": [ "OMR", "OMR", 3, "OMR", "Rial"],
      // панамский бальбоа
      "PAB": [ "PAB", "B/.", 2, "B/.", "B/."],
      // Перуанское инти
      "PEI": [ "PEI", "PEI", 130, "PEI", "PEI"],
      // перуанский соль
      "PEN": [ "PEN", "S/.", 2, "S/.", "S/."],
      // Перуанский соль (1863–1965)
      "PES": [ "PES", "PES", 130, "PES", "PES"],
      // кина Папуа – Новой Гвинеи
      "PGK": [ "PGK", "PGK", 2, "PGK", "PGK"],
      // филиппинский песо
      "PHP": [ "PHP", "PHP", 2, "PHP", "₱"],
      // пакистанская рупия
      "PKR": [ "PKR", "PKRs.", 2, "PKRs.", "Rs"],
      // польский злотый
      "PLN": [ "PLN", "PLN", 2, "PLN", "zł"],
      // Злотый
      "PLZ": [ "PLZ", "PLZ", 130, "PLZ", "PLZ"],
      // Португальское эскудо
      "PTE": [ "PTE", "PTE", 130, "PTE", "PTE"],
      // парагвайский гуарани
      "PYG": [ "PYG", "PYG", 0, "PYG", "Gs"],
      // катарский риал
      "QAR": [ "QAR", "QAR", 2, "QAR", "Rial"],
      // Родезийский доллар
      "RHD": [ "RHD", "RHD", 130, "RHD", "RHD"],
      // Старый Румынский лей
      "ROL": [ "ROL", "ROL", 130, "ROL", "ROL"],
      // румынский лей
      "RON": [ "RON", "RON", 2, "RON", "RON"],
      // сербский динар
      "RSD": [ "RSD", "RSD", 0, "RSD", "din"],
      // российский рубль
      "RUB": [ "RUB", "₽", 2, "руб.", "руб."],
      // Российский рубль (1991–1998)
      "RUR": [ "RUR", "р.", 130, "р.", "р."],
      // франк Руанды
      "RWF": [ "RWF", "RWF", 0, "RWF", "RF"],
      // саудовский риял
      "SAR": [ "SAR", "SR", 2, "SR", "Rial"],
      // доллар Соломоновых Островов
      "SBD": [ "SBD", "SBD", 2, "SBD", "$"],
      // сейшельская рупия
      "SCR": [ "SCR", "SCR", 2, "SCR", "SCR"],
      // Суданский динар
      "SDD": [ "SDD", "SDD", 130, "SDD", "SDD"],
      // суданский фунт
      "SDG": [ "SDG", "SDG", 2, "SDG", "SDG"],
      // Старый суданский фунт
      "SDP": [ "SDP", "SDP", 130, "SDP", "SDP"],
      // шведская крона
      "SEK": [ "SEK", "kr", 2, "kr", "kr"],
      // сингапурский доллар
      "SGD": [ "SGD", "S$", 2, "S$", "$"],
      // фунт острова Святой Елены
      "SHP": [ "SHP", "SHP", 2, "SHP", "£"],
      // Словенский толар
      "SIT": [ "SIT", "SIT", 130, "SIT", "SIT"],
      // Словацкая крона
      "SKK": [ "SKK", "SKK", 130, "SKK", "SKK"],
      // леоне
      "SLL": [ "SLL", "SLL", 0, "SLL", "SLL"],
      // сомалийский шиллинг
      "SOS": [ "SOS", "SOS", 0, "SOS", "SOS"],
      // суринамский доллар
      "SRD": [ "SRD", "SRD", 2, "SRD", "$"],
      // Суринамский гульден
      "SRG": [ "SRG", "SRG", 130, "SRG", "SRG"],
      // южносуданский фунт
      "SSP": [ "SSP", "SSP", 2, "SSP", "SSP"],
      // добра Сан-Томе и Принсипи (1977–2017)
      "STD": [ "STD", "STD", 128, "STD", "Db"],
      // добра Сан-Томе и Принсипи
      "STN": [ "STN", "STN", 2, "STN", "STN"],
      // Рубль СССР
      "SUR": [ "SUR", "SUR", 130, "SUR", "SUR"],
      // Сальвадорский колон
      "SVC": [ "SVC", "SVC", 130, "SVC", "SVC"],
      // сирийский фунт
      "SYP": [ "SYP", "SYP", 0, "SYP", "£"],
      // свазилендский лилангени
      "SZL": [ "SZL", "SZL", 2, "SZL", "SZL"],
      // таиландский бат
      "THB": [ "THB", "฿", 2, "THB", "฿"],
      // Таджикский рубль
      "TJR": [ "TJR", "TJR", 130, "TJR", "TJR"],
      // таджикский сомони
      "TJS": [ "TJS", "TJS", 2, "TJS", "Som"],
      // Туркменский манат
      "TMM": [ "TMM", "TMM", 128, "TMM", "TMM"],
      // новый туркменский манат
      "TMT": [ "TMT", "ТМТ", 2, "ТМТ", "ТМТ"],
      // тунисский динар
      "TND": [ "TND", "TND", 3, "TND", "din"],
      // тонганская паанга
      "TOP": [ "TOP", "TOP", 2, "TOP", "T$"],
      // Тиморское эскудо
      "TPE": [ "TPE", "TPE", 130, "TPE", "TPE"],
      // Турецкая лира (1922–2005)
      "TRL": [ "TRL", "TRL", 128, "TRL", "TRL"],
      // турецкая лира
      "TRY": [ "TRY", "TL", 2, "YTL", "TL"],
      // доллар Тринидада и Тобаго
      "TTD": [ "TTD", "TTD", 2, "TTD", "$"],
      // новый тайваньский доллар
      "TWD": [ "TWD", "NT$", 2, "NT$", "NT$"],
      // танзанийский шиллинг
      "TZS": [ "TZS", "TZS", 2, "TZS", "TSh"],
      // украинская гривна
      "UAH": [ "UAH", "грн.", 2, "грн.", "₴"],
      // Карбованец (украинский)
      "UAK": [ "UAK", "UAK", 130, "UAK", "UAK"],
      // Старый угандийский шиллинг
      "UGS": [ "UGS", "UGS", 130, "UGS", "UGS"],
      // угандийский шиллинг
      "UGX": [ "UGX", "UGX", 0, "UGX", "UGX"],
      // доллар США
      "USD": [ "USD", "$", 2, "US$", "$"],
      // Доллар США следующего дня
      "USN": [ "USN", "USN", 130, "USN", "USN"],
      // Доллар США текущего дня
      "USS": [ "USS", "USS", 130, "USS", "USS"],
      // Уругвайский песо (индекс инфляции)
      "UYI": [ "UYI", "UYI", 128, "UYI", "UYI"],
      // Уругвайское старое песо (1975–1993)
      "UYP": [ "UYP", "UYP", 130, "UYP", "UYP"],
      // уругвайский песо
      "UYU": [ "UYU", "UY$", 2, "UY$", "$"],
      // узбекский сум
      "UZS": [ "UZS", "UZS", 2, "UZS", "soʼm"],
      // Венесуэльский боливар (1871–2008)
      "VEB": [ "VEB", "VEB", 130, "VEB", "VEB"],
      // венесуэльский боливар (2008–2018)
      "VEF": [ "VEF", "VEF", 130, "VEF", "Bs"],
      // венесуэльский боливар
      "VES": [ "VES", "VES", 2, "VES", "VES"],
      // вьетнамский донг
      "VND": [ "VND", "₫", 24, "₫", "₫"],
      // вату Вануату
      "VUV": [ "VUV", "VUV", 0, "VUV", "VUV"],
      // самоанская тала
      "WST": [ "WST", "WST", 2, "WST", "WST"],
      // франк КФА BEAC
      "XAF": [ "XAF", "FCFA", 0, "FCFA", "FCFA"],
      // Серебро
      "XAG": [ "XAG", "XAG", 130, "XAG", "XAG"],
      // Золото
      "XAU": [ "XAU", "XAU", 130, "XAU", "XAU"],
      // Европейская составная единица
      "XBA": [ "XBA", "XBA", 130, "XBA", "XBA"],
      // Европейская денежная единица
      "XBB": [ "XBB", "XBB", 130, "XBB", "XBB"],
      // расчетная единица европейского валютного соглашения (XBC)
      "XBC": [ "XBC", "XBC", 130, "XBC", "XBC"],
      // расчетная единица европейского валютного соглашения (XBD)
      "XBD": [ "XBD", "XBD", 130, "XBD", "XBD"],
      // восточно-карибский доллар
      "XCD": [ "XCD", "EC$", 2, "EC$", "$"],
      // СДР (специальные права заимствования)
      "XDR": [ "XDR", "XDR", 130, "XDR", "XDR"],
      // ЭКЮ (единица европейской валюты)
      "XEU": [ "XEU", "XEU", 130, "XEU", "XEU"],
      // Французский золотой франк
      "XFO": [ "XFO", "XFO", 130, "XFO", "XFO"],
      // Французский UIC-франк
      "XFU": [ "XFU", "XFU", 130, "XFU", "XFU"],
      // франк КФА ВСЕАО
      "XOF": [ "XOF", "CFA", 0, "CFA", "CFA"],
      // Палладий
      "XPD": [ "XPD", "XPD", 130, "XPD", "XPD"],
      // французский тихоокеанский франк
      "XPF": [ "XPF", "CFPF", 0, "CFPF", "FCFP"],
      // Платина
      "XPT": [ "XPT", "XPT", 130, "XPT", "XPT"],
      // единица RINET-фондов
      "XRE": [ "XRE", "XRE", 130, "XRE", "XRE"],
      // тестовый валютный код
      "XTS": [ "XTS", "XTS", 130, "XTS", "XTS"],
      // неизвестная валюта
      "XXX": [ "XXX", "XXXX", 130, "XXXX", "XXXX"],
      // Йеменский динар
      "YDD": [ "YDD", "YDD", 130, "YDD", "YDD"],
      // йеменский риал
      "YER": [ "YER", "YER", 0, "YER", "Rial"],
      // Югославский твердый динар
      "YUD": [ "YUD", "YUD", 130, "YUD", "YUD"],
      // Югославский новый динар
      "YUM": [ "YUM", "YUM", 130, "YUM", "YUM"],
      // Югославский динар
      "YUN": [ "YUN", "YUN", 130, "YUN", "YUN"],
      // Южноафриканский рэнд (финансовый)
      "ZAL": [ "ZAL", "ZAL", 130, "ZAL", "ZAL"],
      // южноафриканский рэнд
      "ZAR": [ "ZAR", "ZAR", 2, "ZAR", "R"],
      // Квача (замбийская) (1968–2012)
      "ZMK": [ "ZMK", "ZMK", 128, "ZMK", "ZWK"],
      // замбийская квача
      "ZMW": [ "ZMW", "ZMW", 2, "ZMW", "ZMW"],
      // Новый заир
      "ZRN": [ "ZRN", "ZRN", 130, "ZRN", "ZRN"],
      // Заир
      "ZRZ": [ "ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"],
      // Доллар Зимбабве
      "ZWD": [ "ZWD", "ZWD", 128, "ZWD", "ZWD"],
      // Доллар Зимбабве (2009)
      "ZWL": [ "ZWL", "ZWL", 130, "ZWL", "ZWL"],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("ADP", "Андоррская песета");
    result.put("AED", "дирхам ОАЭ");
    result.put("AFA", "Афгани (1927–2002)");
    result.put("AFN", "афгани");
    result.put("ALL", "албанский лек");
    result.put("AMD", "армянский драм");
    result.put("ANG", "нидерландский антильский гульден");
    result.put("AOA", "ангольская кванза");
    result.put("AOK", "Ангольская кванза (1977–1990)");
    result.put("AON", "Ангольская новая кванза (1990–2000)");
    result.put("AOR", "Ангольская кванза реюстадо (1995–1999)");
    result.put("ARA", "Аргентинский аустрал");
    result.put("ARP", "Аргентинское песо (1983–1985)");
    result.put("ARS", "аргентинский песо");
    result.put("ATS", "Австрийский шиллинг");
    result.put("AUD", "австралийский доллар");
    result.put("AWG", "арубанский флорин");
    result.put("AZM", "Старый азербайджанский манат");
    result.put("AZN", "азербайджанский манат");
    result.put("BAD", "Динар Боснии и Герцеговины");
    result.put("BAM", "конвертируемая марка Боснии и Герцеговины");
    result.put("BBD", "барбадосский доллар");
    result.put("BDT", "бангладешская така");
    result.put("BEC", "Бельгийский франк (конвертируемый)");
    result.put("BEF", "Бельгийский франк");
    result.put("BEL", "Бельгийский франк (финансовый)");
    result.put("BGL", "Лев");
    result.put("BGN", "болгарский лев");
    result.put("BHD", "бахрейнский динар");
    result.put("BIF", "бурундийский франк");
    result.put("BMD", "бермудский доллар");
    result.put("BND", "брунейский доллар");
    result.put("BOB", "боливийский боливиано");
    result.put("BOP", "Боливийское песо");
    result.put("BOV", "Боливийский мвдол");
    result.put("BRB", "Бразильский новый крузейро (1967–1986)");
    result.put("BRC", "Бразильское крузадо");
    result.put("BRE", "Бразильский крузейро (1990–1993)");
    result.put("BRL", "бразильский реал");
    result.put("BRN", "Бразильское новое крузадо");
    result.put("BRR", "Бразильский крузейро");
    result.put("BSD", "багамский доллар");
    result.put("BTN", "бутанский нгултрум");
    result.put("BUK", "Джа");
    result.put("BWP", "ботсванская пула");
    result.put("BYB", "Белорусский рубль (1994–1999)");
    result.put("BYN", "белорусский рубль");
    result.put("BYR", "Белорусский рубль (2000–2016)");
    result.put("BZD", "белизский доллар");
    result.put("CAD", "канадский доллар");
    result.put("CDF", "конголезский франк");
    result.put("CHE", "WIR евро");
    result.put("CHF", "швейцарский франк");
    result.put("CHW", "WIR франк");
    result.put("CLF", "Условная расчетная единица Чили");
    result.put("CLP", "чилийский песо");
    result.put("CNH", "китайский офшорный юань");
    result.put("CNY", "китайский юань");
    result.put("COP", "колумбийский песо");
    result.put("COU", "Единица реальной стоимости Колумбии");
    result.put("CRC", "костариканский колон");
    result.put("CSD", "Старый Сербский динар");
    result.put("CSK", "Чехословацкая твердая крона");
    result.put("CUC", "кубинский конвертируемый песо");
    result.put("CUP", "кубинский песо");
    result.put("CVE", "эскудо Кабо-Верде");
    result.put("CYP", "Кипрский фунт");
    result.put("CZK", "чешская крона");
    result.put("DDM", "Восточногерманская марка");
    result.put("DEM", "Немецкая марка");
    result.put("DJF", "франк Джибути");
    result.put("DKK", "датская крона");
    result.put("DOP", "доминиканский песо");
    result.put("DZD", "алжирский динар");
    result.put("ECS", "Эквадорский сукре");
    result.put("ECV", "Постоянная единица стоимости Эквадора");
    result.put("EEK", "Эстонская крона");
    result.put("EGP", "египетский фунт");
    result.put("ERN", "эритрейская накфа");
    result.put("ESA", "Испанская песета (А)");
    result.put("ESB", "Испанская песета (конвертируемая)");
    result.put("ESP", "Испанская песета");
    result.put("ETB", "эфиопский быр");
    result.put("EUR", "евро");
    result.put("FIM", "Финская марка");
    result.put("FJD", "доллар Фиджи");
    result.put("FKP", "фунт Фолклендских островов");
    result.put("FRF", "Французский франк");
    result.put("GBP", "британский фунт стерлингов");
    result.put("GEK", "Грузинский купон");
    result.put("GEL", "грузинский лари");
    result.put("GHC", "Ганский седи (1979–2007)");
    result.put("GHS", "ганский седи");
    result.put("GIP", "гибралтарский фунт");
    result.put("GMD", "гамбийский даласи");
    result.put("GNF", "гвинейский франк");
    result.put("GNS", "Гвинейская сили");
    result.put("GQE", "Эквеле экваториальной Гвинеи");
    result.put("GRD", "Греческая драхма");
    result.put("GTQ", "гватемальский кетсаль");
    result.put("GWE", "Эскудо Португальской Гвинеи");
    result.put("GWP", "Песо Гвинеи-Бисау");
    result.put("GYD", "гайанский доллар");
    result.put("HKD", "гонконгский доллар");
    result.put("HNL", "гондурасская лемпира");
    result.put("HRD", "Хорватский динар");
    result.put("HRK", "хорватская куна");
    result.put("HTG", "гаитянский гурд");
    result.put("HUF", "венгерский форинт");
    result.put("IDR", "индонезийская рупия");
    result.put("IEP", "Ирландский фунт");
    result.put("ILP", "Израильский фунт");
    result.put("ILS", "новый израильский шекель");
    result.put("INR", "индийская рупия");
    result.put("IQD", "иракский динар");
    result.put("IRR", "иранский риал");
    result.put("ISK", "исландская крона");
    result.put("ITL", "Итальянская лира");
    result.put("JMD", "ямайский доллар");
    result.put("JOD", "иорданский динар");
    result.put("JPY", "японская иена");
    result.put("KES", "кенийский шиллинг");
    result.put("KGS", "киргизский сом");
    result.put("KHR", "камбоджийский риель");
    result.put("KMF", "коморский франк");
    result.put("KPW", "северокорейская вона");
    result.put("KRW", "южнокорейская вона");
    result.put("KWD", "кувейтский динар");
    result.put("KYD", "доллар Островов Кайман");
    result.put("KZT", "казахский тенге");
    result.put("LAK", "лаосский кип");
    result.put("LBP", "ливанский фунт");
    result.put("LKR", "шри-ланкийская рупия");
    result.put("LRD", "либерийский доллар");
    result.put("LSL", "Лоти");
    result.put("LTL", "Литовский лит");
    result.put("LTT", "Литовский талон");
    result.put("LUC", "Конвертируемый франк Люксембурга");
    result.put("LUF", "Люксембургский франк");
    result.put("LUL", "Финансовый франк Люксембурга");
    result.put("LVL", "Латвийский лат");
    result.put("LVR", "Латвийский рубль");
    result.put("LYD", "ливийский динар");
    result.put("MAD", "марокканский дирхам");
    result.put("MAF", "Марокканский франк");
    result.put("MDL", "молдавский лей");
    result.put("MGA", "малагасийский ариари");
    result.put("MGF", "Малагасийский франк");
    result.put("MKD", "македонский денар");
    result.put("MLF", "Малийский франк");
    result.put("MMK", "мьянманский кьят");
    result.put("MNT", "монгольский тугрик");
    result.put("MOP", "патака Макао");
    result.put("MRO", "мавританская угия (1973–2017)");
    result.put("MRU", "мавританская угия");
    result.put("MTL", "Мальтийская лира");
    result.put("MTP", "Мальтийский фунт");
    result.put("MUR", "маврикийская рупия");
    result.put("MVR", "мальдивская руфия");
    result.put("MWK", "малавийская квача");
    result.put("MXN", "мексиканский песо");
    result.put("MXP", "Мексиканское серебряное песо (1861–1992)");
    result.put("MXV", "Мексиканская пересчетная единица (UDI)");
    result.put("MYR", "малайзийский ринггит");
    result.put("MZE", "Мозамбикское эскудо");
    result.put("MZM", "Старый мозамбикский метикал");
    result.put("MZN", "мозамбикский метикал");
    result.put("NAD", "доллар Намибии");
    result.put("NGN", "нигерийская найра");
    result.put("NIC", "Никарагуанская кордоба (1988–1991)");
    result.put("NIO", "никарагуанская кордоба");
    result.put("NLG", "Нидерландский гульден");
    result.put("NOK", "норвежская крона");
    result.put("NPR", "непальская рупия");
    result.put("NZD", "новозеландский доллар");
    result.put("OMR", "оманский риал");
    result.put("PAB", "панамский бальбоа");
    result.put("PEI", "Перуанское инти");
    result.put("PEN", "перуанский соль");
    result.put("PES", "Перуанский соль (1863–1965)");
    result.put("PGK", "кина Папуа – Новой Гвинеи");
    result.put("PHP", "филиппинский песо");
    result.put("PKR", "пакистанская рупия");
    result.put("PLN", "польский злотый");
    result.put("PLZ", "Злотый");
    result.put("PTE", "Португальское эскудо");
    result.put("PYG", "парагвайский гуарани");
    result.put("QAR", "катарский риал");
    result.put("RHD", "Родезийский доллар");
    result.put("ROL", "Старый Румынский лей");
    result.put("RON", "румынский лей");
    result.put("RSD", "сербский динар");
    result.put("RUB", "российский рубль");
    result.put("RUR", "Российский рубль (1991–1998)");
    result.put("RWF", "франк Руанды");
    result.put("SAR", "саудовский риял");
    result.put("SBD", "доллар Соломоновых Островов");
    result.put("SCR", "сейшельская рупия");
    result.put("SDD", "Суданский динар");
    result.put("SDG", "суданский фунт");
    result.put("SDP", "Старый суданский фунт");
    result.put("SEK", "шведская крона");
    result.put("SGD", "сингапурский доллар");
    result.put("SHP", "фунт острова Святой Елены");
    result.put("SIT", "Словенский толар");
    result.put("SKK", "Словацкая крона");
    result.put("SLL", "леоне");
    result.put("SOS", "сомалийский шиллинг");
    result.put("SRD", "суринамский доллар");
    result.put("SRG", "Суринамский гульден");
    result.put("SSP", "южносуданский фунт");
    result.put("STD", "добра Сан-Томе и Принсипи (1977–2017)");
    result.put("STN", "добра Сан-Томе и Принсипи");
    result.put("SUR", "Рубль СССР");
    result.put("SVC", "Сальвадорский колон");
    result.put("SYP", "сирийский фунт");
    result.put("SZL", "свазилендский лилангени");
    result.put("THB", "таиландский бат");
    result.put("TJR", "Таджикский рубль");
    result.put("TJS", "таджикский сомони");
    result.put("TMM", "Туркменский манат");
    result.put("TMT", "новый туркменский манат");
    result.put("TND", "тунисский динар");
    result.put("TOP", "тонганская паанга");
    result.put("TPE", "Тиморское эскудо");
    result.put("TRL", "Турецкая лира (1922–2005)");
    result.put("TRY", "турецкая лира");
    result.put("TTD", "доллар Тринидада и Тобаго");
    result.put("TWD", "новый тайваньский доллар");
    result.put("TZS", "танзанийский шиллинг");
    result.put("UAH", "украинская гривна");
    result.put("UAK", "Карбованец (украинский)");
    result.put("UGS", "Старый угандийский шиллинг");
    result.put("UGX", "угандийский шиллинг");
    result.put("USD", "доллар США");
    result.put("USN", "Доллар США следующего дня");
    result.put("USS", "Доллар США текущего дня");
    result.put("UYI", "Уругвайский песо (индекс инфляции)");
    result.put("UYP", "Уругвайское старое песо (1975–1993)");
    result.put("UYU", "уругвайский песо");
    result.put("UZS", "узбекский сум");
    result.put("VEB", "Венесуэльский боливар (1871–2008)");
    result.put("VEF", "венесуэльский боливар (2008–2018)");
    result.put("VES", "венесуэльский боливар");
    result.put("VND", "вьетнамский донг");
    result.put("VUV", "вату Вануату");
    result.put("WST", "самоанская тала");
    result.put("XAF", "франк КФА BEAC");
    result.put("XAG", "Серебро");
    result.put("XAU", "Золото");
    result.put("XBA", "Европейская составная единица");
    result.put("XBB", "Европейская денежная единица");
    result.put("XBC", "расчетная единица европейского валютного соглашения (XBC)");
    result.put("XBD", "расчетная единица европейского валютного соглашения (XBD)");
    result.put("XCD", "восточно-карибский доллар");
    result.put("XDR", "СДР (специальные права заимствования)");
    result.put("XEU", "ЭКЮ (единица европейской валюты)");
    result.put("XFO", "Французский золотой франк");
    result.put("XFU", "Французский UIC-франк");
    result.put("XOF", "франк КФА ВСЕАО");
    result.put("XPD", "Палладий");
    result.put("XPF", "французский тихоокеанский франк");
    result.put("XPT", "Платина");
    result.put("XRE", "единица RINET-фондов");
    result.put("XTS", "тестовый валютный код");
    result.put("XXX", "неизвестная валюта");
    result.put("YDD", "Йеменский динар");
    result.put("YER", "йеменский риал");
    result.put("YUD", "Югославский твердый динар");
    result.put("YUM", "Югославский новый динар");
    result.put("YUN", "Югославский динар");
    result.put("ZAL", "Южноафриканский рэнд (финансовый)");
    result.put("ZAR", "южноафриканский рэнд");
    result.put("ZMK", "Квача (замбийская) (1968–2012)");
    result.put("ZMW", "замбийская квача");
    result.put("ZRN", "Новый заир");
    result.put("ZRZ", "Заир");
    result.put("ZWD", "Доллар Зимбабве");
    result.put("ZWL", "Доллар Зимбабве (2009)");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "ADP": "Андоррская песета",
      "AED": "дирхам ОАЭ",
      "AFA": "Афгани (1927–2002)",
      "AFN": "афгани",
      "ALL": "албанский лек",
      "AMD": "армянский драм",
      "ANG": "нидерландский антильский гульден",
      "AOA": "ангольская кванза",
      "AOK": "Ангольская кванза (1977–1990)",
      "AON": "Ангольская новая кванза (1990–2000)",
      "AOR": "Ангольская кванза реюстадо (1995–1999)",
      "ARA": "Аргентинский аустрал",
      "ARP": "Аргентинское песо (1983–1985)",
      "ARS": "аргентинский песо",
      "ATS": "Австрийский шиллинг",
      "AUD": "австралийский доллар",
      "AWG": "арубанский флорин",
      "AZM": "Старый азербайджанский манат",
      "AZN": "азербайджанский манат",
      "BAD": "Динар Боснии и Герцеговины",
      "BAM": "конвертируемая марка Боснии и Герцеговины",
      "BBD": "барбадосский доллар",
      "BDT": "бангладешская така",
      "BEC": "Бельгийский франк (конвертируемый)",
      "BEF": "Бельгийский франк",
      "BEL": "Бельгийский франк (финансовый)",
      "BGL": "Лев",
      "BGN": "болгарский лев",
      "BHD": "бахрейнский динар",
      "BIF": "бурундийский франк",
      "BMD": "бермудский доллар",
      "BND": "брунейский доллар",
      "BOB": "боливийский боливиано",
      "BOP": "Боливийское песо",
      "BOV": "Боливийский мвдол",
      "BRB": "Бразильский новый крузейро (1967–1986)",
      "BRC": "Бразильское крузадо",
      "BRE": "Бразильский крузейро (1990–1993)",
      "BRL": "бразильский реал",
      "BRN": "Бразильское новое крузадо",
      "BRR": "Бразильский крузейро",
      "BSD": "багамский доллар",
      "BTN": "бутанский нгултрум",
      "BUK": "Джа",
      "BWP": "ботсванская пула",
      "BYB": "Белорусский рубль (1994–1999)",
      "BYN": "белорусский рубль",
      "BYR": "Белорусский рубль (2000–2016)",
      "BZD": "белизский доллар",
      "CAD": "канадский доллар",
      "CDF": "конголезский франк",
      "CHE": "WIR евро",
      "CHF": "швейцарский франк",
      "CHW": "WIR франк",
      "CLF": "Условная расчетная единица Чили",
      "CLP": "чилийский песо",
      "CNH": "китайский офшорный юань",
      "CNY": "китайский юань",
      "COP": "колумбийский песо",
      "COU": "Единица реальной стоимости Колумбии",
      "CRC": "костариканский колон",
      "CSD": "Старый Сербский динар",
      "CSK": "Чехословацкая твердая крона",
      "CUC": "кубинский конвертируемый песо",
      "CUP": "кубинский песо",
      "CVE": "эскудо Кабо-Верде",
      "CYP": "Кипрский фунт",
      "CZK": "чешская крона",
      "DDM": "Восточногерманская марка",
      "DEM": "Немецкая марка",
      "DJF": "франк Джибути",
      "DKK": "датская крона",
      "DOP": "доминиканский песо",
      "DZD": "алжирский динар",
      "ECS": "Эквадорский сукре",
      "ECV": "Постоянная единица стоимости Эквадора",
      "EEK": "Эстонская крона",
      "EGP": "египетский фунт",
      "ERN": "эритрейская накфа",
      "ESA": "Испанская песета (А)",
      "ESB": "Испанская песета (конвертируемая)",
      "ESP": "Испанская песета",
      "ETB": "эфиопский быр",
      "EUR": "евро",
      "FIM": "Финская марка",
      "FJD": "доллар Фиджи",
      "FKP": "фунт Фолклендских островов",
      "FRF": "Французский франк",
      "GBP": "британский фунт стерлингов",
      "GEK": "Грузинский купон",
      "GEL": "грузинский лари",
      "GHC": "Ганский седи (1979–2007)",
      "GHS": "ганский седи",
      "GIP": "гибралтарский фунт",
      "GMD": "гамбийский даласи",
      "GNF": "гвинейский франк",
      "GNS": "Гвинейская сили",
      "GQE": "Эквеле экваториальной Гвинеи",
      "GRD": "Греческая драхма",
      "GTQ": "гватемальский кетсаль",
      "GWE": "Эскудо Португальской Гвинеи",
      "GWP": "Песо Гвинеи-Бисау",
      "GYD": "гайанский доллар",
      "HKD": "гонконгский доллар",
      "HNL": "гондурасская лемпира",
      "HRD": "Хорватский динар",
      "HRK": "хорватская куна",
      "HTG": "гаитянский гурд",
      "HUF": "венгерский форинт",
      "IDR": "индонезийская рупия",
      "IEP": "Ирландский фунт",
      "ILP": "Израильский фунт",
      "ILS": "новый израильский шекель",
      "INR": "индийская рупия",
      "IQD": "иракский динар",
      "IRR": "иранский риал",
      "ISK": "исландская крона",
      "ITL": "Итальянская лира",
      "JMD": "ямайский доллар",
      "JOD": "иорданский динар",
      "JPY": "японская иена",
      "KES": "кенийский шиллинг",
      "KGS": "киргизский сом",
      "KHR": "камбоджийский риель",
      "KMF": "коморский франк",
      "KPW": "северокорейская вона",
      "KRW": "южнокорейская вона",
      "KWD": "кувейтский динар",
      "KYD": "доллар Островов Кайман",
      "KZT": "казахский тенге",
      "LAK": "лаосский кип",
      "LBP": "ливанский фунт",
      "LKR": "шри-ланкийская рупия",
      "LRD": "либерийский доллар",
      "LSL": "Лоти",
      "LTL": "Литовский лит",
      "LTT": "Литовский талон",
      "LUC": "Конвертируемый франк Люксембурга",
      "LUF": "Люксембургский франк",
      "LUL": "Финансовый франк Люксембурга",
      "LVL": "Латвийский лат",
      "LVR": "Латвийский рубль",
      "LYD": "ливийский динар",
      "MAD": "марокканский дирхам",
      "MAF": "Марокканский франк",
      "MDL": "молдавский лей",
      "MGA": "малагасийский ариари",
      "MGF": "Малагасийский франк",
      "MKD": "македонский денар",
      "MLF": "Малийский франк",
      "MMK": "мьянманский кьят",
      "MNT": "монгольский тугрик",
      "MOP": "патака Макао",
      "MRO": "мавританская угия (1973–2017)",
      "MRU": "мавританская угия",
      "MTL": "Мальтийская лира",
      "MTP": "Мальтийский фунт",
      "MUR": "маврикийская рупия",
      "MVR": "мальдивская руфия",
      "MWK": "малавийская квача",
      "MXN": "мексиканский песо",
      "MXP": "Мексиканское серебряное песо (1861–1992)",
      "MXV": "Мексиканская пересчетная единица (UDI)",
      "MYR": "малайзийский ринггит",
      "MZE": "Мозамбикское эскудо",
      "MZM": "Старый мозамбикский метикал",
      "MZN": "мозамбикский метикал",
      "NAD": "доллар Намибии",
      "NGN": "нигерийская найра",
      "NIC": "Никарагуанская кордоба (1988–1991)",
      "NIO": "никарагуанская кордоба",
      "NLG": "Нидерландский гульден",
      "NOK": "норвежская крона",
      "NPR": "непальская рупия",
      "NZD": "новозеландский доллар",
      "OMR": "оманский риал",
      "PAB": "панамский бальбоа",
      "PEI": "Перуанское инти",
      "PEN": "перуанский соль",
      "PES": "Перуанский соль (1863–1965)",
      "PGK": "кина Папуа – Новой Гвинеи",
      "PHP": "филиппинский песо",
      "PKR": "пакистанская рупия",
      "PLN": "польский злотый",
      "PLZ": "Злотый",
      "PTE": "Португальское эскудо",
      "PYG": "парагвайский гуарани",
      "QAR": "катарский риал",
      "RHD": "Родезийский доллар",
      "ROL": "Старый Румынский лей",
      "RON": "румынский лей",
      "RSD": "сербский динар",
      "RUB": "российский рубль",
      "RUR": "Российский рубль (1991–1998)",
      "RWF": "франк Руанды",
      "SAR": "саудовский риял",
      "SBD": "доллар Соломоновых Островов",
      "SCR": "сейшельская рупия",
      "SDD": "Суданский динар",
      "SDG": "суданский фунт",
      "SDP": "Старый суданский фунт",
      "SEK": "шведская крона",
      "SGD": "сингапурский доллар",
      "SHP": "фунт острова Святой Елены",
      "SIT": "Словенский толар",
      "SKK": "Словацкая крона",
      "SLL": "леоне",
      "SOS": "сомалийский шиллинг",
      "SRD": "суринамский доллар",
      "SRG": "Суринамский гульден",
      "SSP": "южносуданский фунт",
      "STD": "добра Сан-Томе и Принсипи (1977–2017)",
      "STN": "добра Сан-Томе и Принсипи",
      "SUR": "Рубль СССР",
      "SVC": "Сальвадорский колон",
      "SYP": "сирийский фунт",
      "SZL": "свазилендский лилангени",
      "THB": "таиландский бат",
      "TJR": "Таджикский рубль",
      "TJS": "таджикский сомони",
      "TMM": "Туркменский манат",
      "TMT": "новый туркменский манат",
      "TND": "тунисский динар",
      "TOP": "тонганская паанга",
      "TPE": "Тиморское эскудо",
      "TRL": "Турецкая лира (1922–2005)",
      "TRY": "турецкая лира",
      "TTD": "доллар Тринидада и Тобаго",
      "TWD": "новый тайваньский доллар",
      "TZS": "танзанийский шиллинг",
      "UAH": "украинская гривна",
      "UAK": "Карбованец (украинский)",
      "UGS": "Старый угандийский шиллинг",
      "UGX": "угандийский шиллинг",
      "USD": "доллар США",
      "USN": "Доллар США следующего дня",
      "USS": "Доллар США текущего дня",
      "UYI": "Уругвайский песо (индекс инфляции)",
      "UYP": "Уругвайское старое песо (1975–1993)",
      "UYU": "уругвайский песо",
      "UZS": "узбекский сум",
      "VEB": "Венесуэльский боливар (1871–2008)",
      "VEF": "венесуэльский боливар (2008–2018)",
      "VES": "венесуэльский боливар",
      "VND": "вьетнамский донг",
      "VUV": "вату Вануату",
      "WST": "самоанская тала",
      "XAF": "франк КФА BEAC",
      "XAG": "Серебро",
      "XAU": "Золото",
      "XBA": "Европейская составная единица",
      "XBB": "Европейская денежная единица",
      "XBC": "расчетная единица европейского валютного соглашения (XBC)",
      "XBD": "расчетная единица европейского валютного соглашения (XBD)",
      "XCD": "восточно-карибский доллар",
      "XDR": "СДР (специальные права заимствования)",
      "XEU": "ЭКЮ (единица европейской валюты)",
      "XFO": "Французский золотой франк",
      "XFU": "Французский UIC-франк",
      "XOF": "франк КФА ВСЕАО",
      "XPD": "Палладий",
      "XPF": "французский тихоокеанский франк",
      "XPT": "Платина",
      "XRE": "единица RINET-фондов",
      "XTS": "тестовый валютный код",
      "XXX": "неизвестная валюта",
      "YDD": "Йеменский динар",
      "YER": "йеменский риал",
      "YUD": "Югославский твердый динар",
      "YUM": "Югославский новый динар",
      "YUN": "Югославский динар",
      "ZAL": "Южноафриканский рэнд (финансовый)",
      "ZAR": "южноафриканский рэнд",
      "ZMK": "Квача (замбийская) (1968–2012)",
      "ZMW": "замбийская квача",
      "ZRN": "Новый заир",
      "ZRZ": "Заир",
      "ZWD": "Доллар Зимбабве",
      "ZWL": "Доллар Зимбабве (2009)",
    };
  }-*/;
}
