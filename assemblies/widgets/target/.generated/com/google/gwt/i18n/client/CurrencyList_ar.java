package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_ar extends com.google.gwt.i18n.client.CurrencyList_ {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("EGP", "ج.م.‏", 2, "LE", "E£");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "EGP", "ج.م.‏", 2, "LE", "E£"];
  }-*/;
  
  @Override
  protected HashMap<String, CurrencyData> loadCurrencyMapJava() {
    HashMap<String, CurrencyData> result = super.loadCurrencyMapJava();
    // بيستا أندوري
    result.put("ADP", new CurrencyDataImpl("ADP", "ADP", 128, "ADP", "ADP"));
    // درهم إماراتي
    result.put("AED", new CurrencyDataImpl("AED", "د.إ.‏", 2, "DH", "dh"));
    // أفغاني - 1927-2002
    result.put("AFA", new CurrencyDataImpl("AFA", "AFA", 130, "AFA", "AFA"));
    // أفغاني
    result.put("AFN", new CurrencyDataImpl("AFN", "AFN", 0, "AFN", "Af."));
    // ليك ألباني
    result.put("ALL", new CurrencyDataImpl("ALL", "ALL", 0, "ALL", "Lek"));
    // درام أرميني
    result.put("AMD", new CurrencyDataImpl("AMD", "AMD", 2, "AMD", "Dram"));
    // غيلدر أنتيلي هولندي
    result.put("ANG", new CurrencyDataImpl("ANG", "ANG", 2, "ANG", "ANG"));
    // كوانزا أنغولي
    result.put("AOA", new CurrencyDataImpl("AOA", "AOA", 2, "AOA", "Kz"));
    // كوانزا أنجولي - 1977-1990
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130, "AOK", "AOK"));
    // كوانزا أنجولي جديدة - 1990-2000
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130, "AON", "AON"));
    // كوانزا أنجولي معدلة - 1995 - 1999
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130, "AOR", "AOR"));
    // استرال أرجنتيني
    result.put("ARA", new CurrencyDataImpl("ARA", "ARA", 130, "ARA", "ARA"));
    // بيزو أرجنتيني - 1983-1985
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130, "ARP", "ARP"));
    // بيزو أرجنتيني
    result.put("ARS", new CurrencyDataImpl("ARS", "AR$", 2, "AR$", "$"));
    // شلن نمساوي
    result.put("ATS", new CurrencyDataImpl("ATS", "ATS", 130, "ATS", "ATS"));
    // دولار أسترالي
    result.put("AUD", new CurrencyDataImpl("AUD", "AU$", 2, "AU$", "$"));
    // فلورن أروبي
    result.put("AWG", new CurrencyDataImpl("AWG", "AWG", 2, "AWG", "Afl."));
    // مانات أذريبجاني
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130, "AZM", "AZM"));
    // مانات أذربيجان
    result.put("AZN", new CurrencyDataImpl("AZN", "AZN", 2, "AZN", "man."));
    // دينار البوسنة والهرسك
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130, "BAD", "BAD"));
    // مارك البوسنة والهرسك قابل للتحويل
    result.put("BAM", new CurrencyDataImpl("BAM", "BAM", 2, "BAM", "KM"));
    // دولار بربادوسي
    result.put("BBD", new CurrencyDataImpl("BBD", "BBD", 2, "BBD", "$"));
    // تاكا بنغلاديشي
    result.put("BDT", new CurrencyDataImpl("BDT", "Tk", 2, "Tk", "৳"));
    // فرنك بلجيكي قابل للتحويل
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 130, "BEC", "BEC"));
    // فرنك بلجيكي
    result.put("BEF", new CurrencyDataImpl("BEF", "BEF", 130, "BEF", "BEF"));
    // فرنك بلجيكي مالي
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 130, "BEL", "BEL"));
    // ليف بلغاري
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2, "BGN", "lev"));
    // دينار بحريني
    result.put("BHD", new CurrencyDataImpl("BHD", "د.ب.‏", 3, "د.ب.‏", "din"));
    // فرنك بروندي
    result.put("BIF", new CurrencyDataImpl("BIF", "BIF", 0, "BIF", "FBu"));
    // دولار برمودي
    result.put("BMD", new CurrencyDataImpl("BMD", "BMD", 2, "BMD", "$"));
    // دولار بروناي
    result.put("BND", new CurrencyDataImpl("BND", "BND", 2, "BND", "$"));
    // بوليفيانو بوليفي
    result.put("BOB", new CurrencyDataImpl("BOB", "BOB", 2, "BOB", "Bs"));
    // بيزو بوليفي
    result.put("BOP", new CurrencyDataImpl("BOP", "BOP", 130, "BOP", "BOP"));
    // مفدول بوليفي
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 130, "BOV", "BOV"));
    // نوفو كروزايرو برازيلي - 1967-1986
    result.put("BRB", new CurrencyDataImpl("BRB", "BRB", 130, "BRB", "BRB"));
    // كروزادو برازيلي
    result.put("BRC", new CurrencyDataImpl("BRC", "BRC", 130, "BRC", "BRC"));
    // كروزايرو برازيلي - 1990-1993
    result.put("BRE", new CurrencyDataImpl("BRE", "BRE", 130, "BRE", "BRE"));
    // ريال برازيلي
    result.put("BRL", new CurrencyDataImpl("BRL", "R$", 2, "R$", "R$"));
    // دولار باهامي
    result.put("BSD", new CurrencyDataImpl("BSD", "BSD", 2, "BSD", "$"));
    // نولتوم بوتاني
    result.put("BTN", new CurrencyDataImpl("BTN", "BTN", 2, "BTN", "Nu."));
    // كيات بورمي
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130, "BUK", "BUK"));
    // بولا بتسواني
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2, "BWP", "P"));
    // روبل بيلاروسي جديد - 1994-1999
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130, "BYB", "BYB"));
    // روبل بيلاروسي
    result.put("BYN", new CurrencyDataImpl("BYN", "BYN", 2, "BYN", "BYN"));
    // روبل بيلاروسي (٢٠٠٠–٢٠١٦)
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 128, "BYR", "BYR"));
    // دولار بليزي
    result.put("BZD", new CurrencyDataImpl("BZD", "BZD", 2, "BZD", "$"));
    // دولار كندي
    result.put("CAD", new CurrencyDataImpl("CAD", "CA$", 2, "C$", "$"));
    // فرنك كونغولي
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2, "CDF", "FrCD"));
    // فرنك سويسري
    result.put("CHF", new CurrencyDataImpl("CHF", "CHF", 2, "CHF", "CHF"));
    // بيزو تشيلي
    result.put("CLP", new CurrencyDataImpl("CLP", "CL$", 0, "CL$", "$"));
    // يوان صيني (في الخارج)
    result.put("CNH", new CurrencyDataImpl("CNH", "CNH", 130, "CNH", "CNH"));
    // يوان صيني
    result.put("CNY", new CurrencyDataImpl("CNY", "CN¥", 2, "RMB¥", "¥"));
    // بيزو كولومبي
    result.put("COP", new CurrencyDataImpl("COP", "COL$", 2, "COL$", "$"));
    // كولن كوستاريكي
    result.put("CRC", new CurrencyDataImpl("CRC", "CR₡", 2, "CR₡", "₡"));
    // دينار صربي قديم
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130, "CSD", "CSD"));
    // كرونة تشيكوسلوفاكيا
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130, "CSK", "CSK"));
    // بيزو كوبي قابل للتحويل
    result.put("CUC", new CurrencyDataImpl("CUC", "CUC", 2, "CUC", "$"));
    // بيزو كوبي
    result.put("CUP", new CurrencyDataImpl("CUP", "$MN", 2, "$MN", "$"));
    // اسكودو الرأس الأخضر
    result.put("CVE", new CurrencyDataImpl("CVE", "CVE", 2, "CVE", "CVE"));
    // جنيه قبرصي
    result.put("CYP", new CurrencyDataImpl("CYP", "CYP", 130, "CYP", "CYP"));
    // كرونة تشيكية
    result.put("CZK", new CurrencyDataImpl("CZK", "Kč", 2, "Kč", "Kč"));
    // أوستمارك ألماني شرقي
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130, "DDM", "DDM"));
    // مارك ألماني
    result.put("DEM", new CurrencyDataImpl("DEM", "DEM", 130, "DEM", "DEM"));
    // فرنك جيبوتي
    result.put("DJF", new CurrencyDataImpl("DJF", "Fdj", 0, "Fdj", "Fdj"));
    // كرونة دنماركية
    result.put("DKK", new CurrencyDataImpl("DKK", "kr", 2, "kr", "kr"));
    // بيزو الدومنيكان
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$", "$"));
    // دينار جزائري
    result.put("DZD", new CurrencyDataImpl("DZD", "د.ج.‏", 2, "د.ج.‏", "din"));
    // كرونة استونية
    result.put("EEK", new CurrencyDataImpl("EEK", "EEK", 130, "EEK", "EEK"));
    // جنيه مصري
    result.put("EGP", new CurrencyDataImpl("EGP", "ج.م.‏", 2, "LE", "E£"));
    // ناكفا أريتري
    result.put("ERN", new CurrencyDataImpl("ERN", "ERN", 2, "ERN", "Nfk"));
    // بيزيتا إسباني
    result.put("ESP", new CurrencyDataImpl("ESP", "ESP", 128, "ESP", "ESP"));
    // بير أثيوبي
    result.put("ETB", new CurrencyDataImpl("ETB", "ETB", 2, "ETB", "Birr"));
    // يورو
    result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€", "€"));
    // ماركا فنلندي
    result.put("FIM", new CurrencyDataImpl("FIM", "FIM", 130, "FIM", "FIM"));
    // دولار فيجي
    result.put("FJD", new CurrencyDataImpl("FJD", "FJD", 2, "FJD", "$"));
    // جنيه جزر فوكلاند
    result.put("FKP", new CurrencyDataImpl("FKP", "FKP", 2, "FKP", "£"));
    // فرنك فرنسي
    result.put("FRF", new CurrencyDataImpl("FRF", "FRF", 130, "FRF", "FRF"));
    // جنيه إسترليني
    result.put("GBP", new CurrencyDataImpl("GBP", "£", 2, "GB£", "£"));
    // لارى جورجي
    result.put("GEL", new CurrencyDataImpl("GEL", "₾", 2, "₾", "GEL"));
    // سيدي غاني
    result.put("GHC", new CurrencyDataImpl("GHC", "GHC", 130, "GHC", "GHC"));
    // سيدي غانا
    result.put("GHS", new CurrencyDataImpl("GHS", "GHS", 2, "GHS", "GHS"));
    // جنيه جبل طارق
    result.put("GIP", new CurrencyDataImpl("GIP", "GIP", 2, "GIP", "£"));
    // دلاسي غامبي
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2, "GMD", "GMD"));
    // فرنك غينيا
    result.put("GNF", new CurrencyDataImpl("GNF", "GNF", 0, "GNF", "FG"));
    // سيلي غينيا
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130, "GNS", "GNS"));
    // اكويل جونينا غينيا الاستوائيّة
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130, "GQE", "GQE"));
    // دراخما يوناني
    result.put("GRD", new CurrencyDataImpl("GRD", "GRD", 130, "GRD", "GRD"));
    // كوتزال غواتيمالا
    result.put("GTQ", new CurrencyDataImpl("GTQ", "GTQ", 2, "GTQ", "Q"));
    // اسكود برتغالي غينيا
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130, "GWE", "GWE"));
    // بيزو غينيا بيساو
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 130, "GWP", "GWP"));
    // دولار غيانا
    result.put("GYD", new CurrencyDataImpl("GYD", "GYD", 2, "GYD", "$"));
    // دولار هونغ كونغ
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$", "$"));
    // ليمبيرا هنداروس
    result.put("HNL", new CurrencyDataImpl("HNL", "L", 2, "L", "L"));
    // دينار كرواتي
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130, "HRD", "HRD"));
    // كونا كرواتي
    result.put("HRK", new CurrencyDataImpl("HRK", "HRK", 2, "HRK", "kn"));
    // جوردى هايتي
    result.put("HTG", new CurrencyDataImpl("HTG", "HTG", 2, "HTG", "HTG"));
    // فورينت هنغاري
    result.put("HUF", new CurrencyDataImpl("HUF", "HUF", 2, "HUF", "Ft"));
    // روبية إندونيسية
    result.put("IDR", new CurrencyDataImpl("IDR", "IDR", 2, "IDR", "Rp"));
    // جنيه إيرلندي
    result.put("IEP", new CurrencyDataImpl("IEP", "IEP", 130, "IEP", "IEP"));
    // جنيه إسرائيلي
    result.put("ILP", new CurrencyDataImpl("ILP", "ILP", 130, "ILP", "ILP"));
    // شيكل إسرائيلي جديد
    result.put("ILS", new CurrencyDataImpl("ILS", "₪", 2, "IL₪", "₪"));
    // روبية هندي
    result.put("INR", new CurrencyDataImpl("INR", "₹", 2, "Rs", "₹"));
    // دينار عراقي
    result.put("IQD", new CurrencyDataImpl("IQD", "د.ع.‏", 0, "د.ع.‏", "din"));
    // ريال إيراني
    result.put("IRR", new CurrencyDataImpl("IRR", "ر.إ.", 0, "ر.إ.", "Rial"));
    // كرونة أيسلندية
    result.put("ISK", new CurrencyDataImpl("ISK", "kr", 0, "kr", "kr"));
    // ليرة إيطالية
    result.put("ITL", new CurrencyDataImpl("ITL", "ITL", 128, "ITL", "ITL"));
    // دولار جامايكي
    result.put("JMD", new CurrencyDataImpl("JMD", "JA$", 2, "JA$", "$"));
    // دينار أردني
    result.put("JOD", new CurrencyDataImpl("JOD", "د.أ.‏", 3, "د.أ.‏", "din"));
    // ين ياباني
    result.put("JPY", new CurrencyDataImpl("JPY", "JP¥", 0, "JP¥", "¥"));
    // شلن كينيي
    result.put("KES", new CurrencyDataImpl("KES", "Ksh", 2, "Ksh", "Ksh"));
    // سوم قيرغستاني
    result.put("KGS", new CurrencyDataImpl("KGS", "KGS", 2, "KGS", "KGS"));
    // رييال كمبودي
    result.put("KHR", new CurrencyDataImpl("KHR", "KHR", 2, "KHR", "Riel"));
    // فرنك جزر القمر
    result.put("KMF", new CurrencyDataImpl("KMF", "KMF", 0, "KMF", "CF"));
    // وون كوريا الشمالية
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 0, "KPW", "₩"));
    // وون كوريا الجنوبية
    result.put("KRW", new CurrencyDataImpl("KRW", "₩", 0, "KR₩", "₩"));
    // دينار كويتي
    result.put("KWD", new CurrencyDataImpl("KWD", "د.ك.‏", 3, "د.ك.‏", "din"));
    // دولار جزر كيمن
    result.put("KYD", new CurrencyDataImpl("KYD", "KYD", 2, "KYD", "$"));
    // تينغ كازاخستاني
    result.put("KZT", new CurrencyDataImpl("KZT", "KZT", 2, "KZT", "₸"));
    // كيب لاوسي
    result.put("LAK", new CurrencyDataImpl("LAK", "LAK", 0, "LAK", "₭"));
    // جنيه لبناني
    result.put("LBP", new CurrencyDataImpl("LBP", "ل.ل.‏", 0, "ل.ل.‏", "L£"));
    // روبية سريلانكية
    result.put("LKR", new CurrencyDataImpl("LKR", "SLRs", 2, "SLRs", "Rs"));
    // دولار ليبيري
    result.put("LRD", new CurrencyDataImpl("LRD", "LRD", 2, "LRD", "$"));
    // لوتي ليسوتو
    result.put("LSL", new CurrencyDataImpl("LSL", "LSL", 2, "LSL", "LSL"));
    // ليتا ليتوانية
    result.put("LTL", new CurrencyDataImpl("LTL", "LTL", 130, "LTL", "Lt"));
    // تالوناس ليتواني
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130, "LTT", "LTT"));
    // فرنك لوكسمبرج قابل للتحويل
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 130, "LUC", "LUC"));
    // فرنك لوكسمبرج
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128, "LUF", "LUF"));
    // فرنك لوكسمبرج المالي
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 130, "LUL", "LUL"));
    // لاتس لاتفيا
    result.put("LVL", new CurrencyDataImpl("LVL", "LVL", 130, "LVL", "Ls"));
    // روبل لاتفيا
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130, "LVR", "LVR"));
    // دينار ليبي
    result.put("LYD", new CurrencyDataImpl("LYD", "د.ل.‏", 3, "د.ل.‏", "din"));
    // درهم مغربي
    result.put("MAD", new CurrencyDataImpl("MAD", "د.م.‏", 2, "د.م.‏", "د.م.‏"));
    // فرنك مغربي
    result.put("MAF", new CurrencyDataImpl("MAF", "MAF", 130, "MAF", "MAF"));
    // ليو مولدوفي
    result.put("MDL", new CurrencyDataImpl("MDL", "MDL", 2, "MDL", "MDL"));
    // أرياري مدغشقر
    result.put("MGA", new CurrencyDataImpl("MGA", "MGA", 0, "MGA", "Ar"));
    // فرنك مدغشقر
    result.put("MGF", new CurrencyDataImpl("MGF", "MGF", 128, "MGF", "MGF"));
    // دينار مقدوني
    result.put("MKD", new CurrencyDataImpl("MKD", "MKD", 2, "MKD", "din"));
    // فرنك مالي
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130, "MLF", "MLF"));
    // كيات ميانمار
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 0, "MMK", "K"));
    // توغروغ منغولي
    result.put("MNT", new CurrencyDataImpl("MNT", "MN₮", 2, "MN₮", "₮"));
    // باتاكا ماكاوي
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP", 2, "MOP", "MOP"));
    // أوقية موريتانية - 1973-2017
    result.put("MRO", new CurrencyDataImpl("MRO", "MRO", 128, "MRO", "MRO"));
    // أوقية موريتانية
    result.put("MRU", new CurrencyDataImpl("MRU", "أ.م.", 2, "أ.م.", "أ.م."));
    // ليرة مالطية
    result.put("MTL", new CurrencyDataImpl("MTL", "MTL", 130, "MTL", "MTL"));
    // جنيه مالطي
    result.put("MTP", new CurrencyDataImpl("MTP", "MTP", 130, "MTP", "MTP"));
    // روبية موريشيوسية
    result.put("MUR", new CurrencyDataImpl("MUR", "MUR", 2, "MUR", "Rs"));
    // روفيه جزر المالديف
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2, "MVR", "MVR"));
    // كواشا مالاوي
    result.put("MWK", new CurrencyDataImpl("MWK", "MWK", 2, "MWK", "MWK"));
    // بيزو مكسيكي
    result.put("MXN", new CurrencyDataImpl("MXN", "MX$", 2, "Mex$", "$"));
    // بيزو فضي مكسيكي - 1861-1992
    result.put("MXP", new CurrencyDataImpl("MXP", "MXP", 130, "MXP", "MXP"));
    // رينغيت ماليزي
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM", "RM"));
    // اسكود موزمبيقي
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130, "MZE", "MZE"));
    // متكال موزمبيقي
    result.put("MZN", new CurrencyDataImpl("MZN", "MZN", 2, "MZN", "MTn"));
    // دولار ناميبي
    result.put("NAD", new CurrencyDataImpl("NAD", "NAD", 2, "NAD", "$"));
    // نايرا نيجيري
    result.put("NGN", new CurrencyDataImpl("NGN", "NGN", 2, "NGN", "₦"));
    // كوردوبة نيكاراجوا
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130, "NIC", "NIC"));
    // قرطبة نيكاراغوا
    result.put("NIO", new CurrencyDataImpl("NIO", "NIO", 2, "NIO", "C$"));
    // جلدر هولندي
    result.put("NLG", new CurrencyDataImpl("NLG", "NLG", 130, "NLG", "NLG"));
    // كرونة نرويجية
    result.put("NOK", new CurrencyDataImpl("NOK", "NOkr", 2, "NOkr", "kr"));
    // روبية نيبالي
    result.put("NPR", new CurrencyDataImpl("NPR", "NPR", 2, "NPR", "Rs"));
    // دولار نيوزيلندي
    result.put("NZD", new CurrencyDataImpl("NZD", "NZ$", 2, "NZ$", "$"));
    // ريال عماني
    result.put("OMR", new CurrencyDataImpl("OMR", "ر.ع.‏", 3, "ر.ع.‏", "Rial"));
    // بالبوا بنمي
    result.put("PAB", new CurrencyDataImpl("PAB", "B/.", 2, "B/.", "B/."));
    // سول بيروفي
    result.put("PEN", new CurrencyDataImpl("PEN", "S/.", 2, "S/.", "S/."));
    // كينا بابوا غينيا الجديدة
    result.put("PGK", new CurrencyDataImpl("PGK", "PGK", 2, "PGK", "PGK"));
    // بيزو فلبيني
    result.put("PHP", new CurrencyDataImpl("PHP", "PHP", 2, "PHP", "₱"));
    // روبية باكستاني
    result.put("PKR", new CurrencyDataImpl("PKR", "PKRs.", 2, "PKRs.", "Rs"));
    // زلوتي بولندي
    result.put("PLN", new CurrencyDataImpl("PLN", "PLN", 2, "PLN", "zł"));
    // زلوتي بولندي - 1950-1995
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130, "PLZ", "PLZ"));
    // اسكود برتغالي
    result.put("PTE", new CurrencyDataImpl("PTE", "PTE", 130, "PTE", "PTE"));
    // غواراني باراغواي
    result.put("PYG", new CurrencyDataImpl("PYG", "PYG", 0, "PYG", "Gs"));
    // ريال قطري
    result.put("QAR", new CurrencyDataImpl("QAR", "ر.ق.‏", 2, "ر.ق.‏", "Rial"));
    // دولار روديسي
    result.put("RHD", new CurrencyDataImpl("RHD", "RHD", 130, "RHD", "RHD"));
    // ليو روماني قديم
    result.put("ROL", new CurrencyDataImpl("ROL", "ROL", 130, "ROL", "ROL"));
    // ليو روماني
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2, "RON", "RON"));
    // دينار صربي
    result.put("RSD", new CurrencyDataImpl("RSD", "RSD", 0, "RSD", "din"));
    // روبل روسي
    result.put("RUB", new CurrencyDataImpl("RUB", "руб.", 2, "руб.", "руб."));
    // روبل روسي - 1991-1998
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130, "RUR", "RUR"));
    // فرنك رواندي
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0, "RWF", "RF"));
    // ريال سعودي
    result.put("SAR", new CurrencyDataImpl("SAR", "ر.س.‏", 2, "SR", "Rial"));
    // دولار جزر سليمان
    result.put("SBD", new CurrencyDataImpl("SBD", "SBD", 2, "SBD", "$"));
    // روبية سيشيلية
    result.put("SCR", new CurrencyDataImpl("SCR", "SCR", 2, "SCR", "SCR"));
    // دينار سوداني
    result.put("SDD", new CurrencyDataImpl("SDD", "د.س.‏", 130, "د.س.‏", "د.س.‏"));
    // جنيه سوداني
    result.put("SDG", new CurrencyDataImpl("SDG", "ج.س.", 2, "ج.س.", "SDG"));
    // جنيه سوداني قديم
    result.put("SDP", new CurrencyDataImpl("SDP", "SDP", 130, "SDP", "SDP"));
    // كرونة سويدية
    result.put("SEK", new CurrencyDataImpl("SEK", "kr", 2, "kr", "kr"));
    // دولار سنغافوري
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$", "$"));
    // جنيه سانت هيلين
    result.put("SHP", new CurrencyDataImpl("SHP", "SHP", 2, "SHP", "£"));
    // تولار سلوفيني
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130, "SIT", "SIT"));
    // كرونة سلوفاكية
    result.put("SKK", new CurrencyDataImpl("SKK", "SKK", 130, "SKK", "SKK"));
    // ليون سيراليوني
    result.put("SLL", new CurrencyDataImpl("SLL", "SLL", 0, "SLL", "SLL"));
    // شلن صومالي
    result.put("SOS", new CurrencyDataImpl("SOS", "SOS", 0, "SOS", "SOS"));
    // دولار سورينامي
    result.put("SRD", new CurrencyDataImpl("SRD", "SRD", 2, "SRD", "$"));
    // جلدر سورينامي
    result.put("SRG", new CurrencyDataImpl("SRG", "SRG", 130, "SRG", "SRG"));
    // جنيه جنوب السودان
    result.put("SSP", new CurrencyDataImpl("SSP", "SSP", 2, "SSP", "SSP"));
    // دوبرا ساو تومي وبرينسيبي - 1977-2017
    result.put("STD", new CurrencyDataImpl("STD", "STD", 128, "STD", "Db"));
    // دوبرا ساو تومي وبرينسيبي
    result.put("STN", new CurrencyDataImpl("STN", "STN", 2, "STN", "STN"));
    // روبل سوفيتي
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130, "SUR", "SUR"));
    // كولون سلفادوري
    result.put("SVC", new CurrencyDataImpl("SVC", "SVC", 130, "SVC", "SVC"));
    // ليرة سورية
    result.put("SYP", new CurrencyDataImpl("SYP", "ل.س.‏", 0, "ل.س.‏", "£"));
    // ليلانجيني سوازيلندي
    result.put("SZL", new CurrencyDataImpl("SZL", "SZL", 2, "SZL", "SZL"));
    // باخت تايلاندي
    result.put("THB", new CurrencyDataImpl("THB", "฿", 2, "THB", "฿"));
    // روبل طاجيكستاني
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130, "TJR", "TJR"));
    // سوموني طاجيكستاني
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2, "TJS", "Som"));
    // مانات تركمنستاني
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 128, "TMM", "TMM"));
    // مانات تركمانستان
    result.put("TMT", new CurrencyDataImpl("TMT", "TMT", 2, "TMT", "TMT"));
    // دينار تونسي
    result.put("TND", new CurrencyDataImpl("TND", "د.ت.‏", 3, "د.ت.‏", "din"));
    // بانغا تونغا
    result.put("TOP", new CurrencyDataImpl("TOP", "TOP", 2, "TOP", "T$"));
    // اسكود تيموري
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130, "TPE", "TPE"));
    // ليرة تركي
    result.put("TRL", new CurrencyDataImpl("TRL", "TRL", 128, "TRL", "TRL"));
    // ليرة تركية
    result.put("TRY", new CurrencyDataImpl("TRY", "TL", 2, "YTL", "TL"));
    // دولار ترينداد وتوباغو
    result.put("TTD", new CurrencyDataImpl("TTD", "TTD", 2, "TTD", "$"));
    // دولار تايواني
    result.put("TWD", new CurrencyDataImpl("TWD", "NT$", 2, "NT$", "NT$"));
    // شلن تنزاني
    result.put("TZS", new CurrencyDataImpl("TZS", "TZS", 2, "TZS", "TSh"));
    // هريفنيا أوكراني
    result.put("UAH", new CurrencyDataImpl("UAH", "UAH", 2, "UAH", "₴"));
    // شلن أوغندي - 1966-1987
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130, "UGS", "UGS"));
    // شلن أوغندي
    result.put("UGX", new CurrencyDataImpl("UGX", "UGX", 0, "UGX", "UGX"));
    // دولار أمريكي
    result.put("USD", new CurrencyDataImpl("USD", "US$", 2, "US$", "$"));
    // دولار أمريكي (اليوم التالي)‏
    result.put("USN", new CurrencyDataImpl("USN", "USN", 130, "USN", "USN"));
    // دولار أمريكي (نفس اليوم)‏
    result.put("USS", new CurrencyDataImpl("USS", "USS", 130, "USS", "USS"));
    // بيزو أوروجواي - 1975-1993
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130, "UYP", "UYP"));
    // بيزو اوروغواي
    result.put("UYU", new CurrencyDataImpl("UYU", "UY$", 2, "UY$", "$"));
    // سوم أوزبكستاني
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 2, "UZS", "soʼm"));
    // بوليفار فنزويلي - 1871-2008
    result.put("VEB", new CurrencyDataImpl("VEB", "VEB", 130, "VEB", "VEB"));
    // بوليفار فنزويلي - 2008–2018
    result.put("VEF", new CurrencyDataImpl("VEF", "VEF", 130, "VEF", "Bs"));
    // بوليفار فنزويلي
    result.put("VES", new CurrencyDataImpl("VES", "VES", 2, "VES", "VES"));
    // دونج فيتنامي
    result.put("VND", new CurrencyDataImpl("VND", "₫", 24, "₫", "₫"));
    // فاتو فانواتو
    result.put("VUV", new CurrencyDataImpl("VUV", "VUV", 0, "VUV", "VUV"));
    // تالا ساموا
    result.put("WST", new CurrencyDataImpl("WST", "WST", 2, "WST", "WST"));
    // فرنك وسط أفريقي
    result.put("XAF", new CurrencyDataImpl("XAF", "FCFA", 0, "FCFA", "FCFA"));
    // فضة
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 130, "XAG", "XAG"));
    // ذهب
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 130, "XAU", "XAU"));
    // الوحدة الأوروبية المركبة
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 130, "XBA", "XBA"));
    // الوحدة المالية الأوروبية
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 130, "XBB", "XBB"));
    // الوحدة الحسابية الأوروبية
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 130, "XBC", "XBC"));
    // (XBD)وحدة الحساب الأوروبية
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 130, "XBD", "XBD"));
    // دولار شرق الكاريبي
    result.put("XCD", new CurrencyDataImpl("XCD", "EC$", 2, "EC$", "$"));
    // حقوق السحب الخاصة
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 130, "XDR", "XDR"));
    // وحدة النقد الأوروبية
    result.put("XEU", new CurrencyDataImpl("XEU", "XEU", 130, "XEU", "XEU"));
    // فرنك فرنسي ذهبي
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 130, "XFO", "XFO"));
    // (UIC)فرنك فرنسي
    result.put("XFU", new CurrencyDataImpl("XFU", "XFU", 130, "XFU", "XFU"));
    // فرنك غرب أفريقي
    result.put("XOF", new CurrencyDataImpl("XOF", "CFA", 0, "CFA", "CFA"));
    // بالاديوم
    result.put("XPD", new CurrencyDataImpl("XPD", "XPD", 130, "XPD", "XPD"));
    // فرنك سي إف بي
    result.put("XPF", new CurrencyDataImpl("XPF", "CFPF", 0, "CFPF", "FCFP"));
    // البلاتين
    result.put("XPT", new CurrencyDataImpl("XPT", "XPT", 130, "XPT", "XPT"));
    // كود اختبار العملة
    result.put("XTS", new CurrencyDataImpl("XTS", "XTS", 130, "XTS", "XTS"));
    // عملة غير معروفة
    result.put("XXX", new CurrencyDataImpl("XXX", "***", 130, "***", "***"));
    // دينار يمني
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130, "YDD", "YDD"));
    // ريال يمني
    result.put("YER", new CurrencyDataImpl("YER", "ر.ي.‏", 0, "YER", "Rial"));
    // دينار يوغسلافي
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130, "YUD", "YUD"));
    // دينار يوغسلافي قابل للتحويل
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130, "YUN", "YUN"));
    // راند جنوب أفريقيا -مالي
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 130, "ZAL", "ZAL"));
    // راند جنوب أفريقيا
    result.put("ZAR", new CurrencyDataImpl("ZAR", "ZAR", 2, "ZAR", "R"));
    // كواشا زامبي - 1968-2012
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZMK", 128, "ZMK", "ZWK"));
    // كواشا زامبي
    result.put("ZMW", new CurrencyDataImpl("ZMW", "ZMW", 2, "ZMW", "ZMW"));
    // زائير زائيري جديد
    result.put("ZRN", new CurrencyDataImpl("ZRN", "ZRN", 130, "ZRN", "ZRN"));
    // زائير زائيري
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"));
    // دولار زمبابوي
    result.put("ZWD", new CurrencyDataImpl("ZWD", "ZWD", 128, "ZWD", "ZWD"));
    // دولار زمبابوي 2009
    result.put("ZWL", new CurrencyDataImpl("ZWL", "ZWL", 130, "ZWL", "ZWL"));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // بيستا أندوري
      "ADP": [ "ADP", "ADP", 128, "ADP", "ADP"],
      // درهم إماراتي
      "AED": [ "AED", "د.إ.‏", 2, "DH", "dh"],
      // أفغاني - 1927-2002
      "AFA": [ "AFA", "AFA", 130, "AFA", "AFA"],
      // أفغاني
      "AFN": [ "AFN", "AFN", 0, "AFN", "Af."],
      // ليك ألباني
      "ALL": [ "ALL", "ALL", 0, "ALL", "Lek"],
      // درام أرميني
      "AMD": [ "AMD", "AMD", 2, "AMD", "Dram"],
      // غيلدر أنتيلي هولندي
      "ANG": [ "ANG", "ANG", 2, "ANG", "ANG"],
      // كوانزا أنغولي
      "AOA": [ "AOA", "AOA", 2, "AOA", "Kz"],
      // كوانزا أنجولي - 1977-1990
      "AOK": [ "AOK", "AOK", 130, "AOK", "AOK"],
      // كوانزا أنجولي جديدة - 1990-2000
      "AON": [ "AON", "AON", 130, "AON", "AON"],
      // كوانزا أنجولي معدلة - 1995 - 1999
      "AOR": [ "AOR", "AOR", 130, "AOR", "AOR"],
      // استرال أرجنتيني
      "ARA": [ "ARA", "ARA", 130, "ARA", "ARA"],
      // بيزو أرجنتيني - 1983-1985
      "ARP": [ "ARP", "ARP", 130, "ARP", "ARP"],
      // بيزو أرجنتيني
      "ARS": [ "ARS", "AR$", 2, "AR$", "$"],
      // شلن نمساوي
      "ATS": [ "ATS", "ATS", 130, "ATS", "ATS"],
      // دولار أسترالي
      "AUD": [ "AUD", "AU$", 2, "AU$", "$"],
      // فلورن أروبي
      "AWG": [ "AWG", "AWG", 2, "AWG", "Afl."],
      // مانات أذريبجاني
      "AZM": [ "AZM", "AZM", 130, "AZM", "AZM"],
      // مانات أذربيجان
      "AZN": [ "AZN", "AZN", 2, "AZN", "man."],
      // دينار البوسنة والهرسك
      "BAD": [ "BAD", "BAD", 130, "BAD", "BAD"],
      // مارك البوسنة والهرسك قابل للتحويل
      "BAM": [ "BAM", "BAM", 2, "BAM", "KM"],
      // دولار بربادوسي
      "BBD": [ "BBD", "BBD", 2, "BBD", "$"],
      // تاكا بنغلاديشي
      "BDT": [ "BDT", "Tk", 2, "Tk", "৳"],
      // فرنك بلجيكي قابل للتحويل
      "BEC": [ "BEC", "BEC", 130, "BEC", "BEC"],
      // فرنك بلجيكي
      "BEF": [ "BEF", "BEF", 130, "BEF", "BEF"],
      // فرنك بلجيكي مالي
      "BEL": [ "BEL", "BEL", 130, "BEL", "BEL"],
      // ليف بلغاري
      "BGN": [ "BGN", "BGN", 2, "BGN", "lev"],
      // دينار بحريني
      "BHD": [ "BHD", "د.ب.‏", 3, "د.ب.‏", "din"],
      // فرنك بروندي
      "BIF": [ "BIF", "BIF", 0, "BIF", "FBu"],
      // دولار برمودي
      "BMD": [ "BMD", "BMD", 2, "BMD", "$"],
      // دولار بروناي
      "BND": [ "BND", "BND", 2, "BND", "$"],
      // بوليفيانو بوليفي
      "BOB": [ "BOB", "BOB", 2, "BOB", "Bs"],
      // بيزو بوليفي
      "BOP": [ "BOP", "BOP", 130, "BOP", "BOP"],
      // مفدول بوليفي
      "BOV": [ "BOV", "BOV", 130, "BOV", "BOV"],
      // نوفو كروزايرو برازيلي - 1967-1986
      "BRB": [ "BRB", "BRB", 130, "BRB", "BRB"],
      // كروزادو برازيلي
      "BRC": [ "BRC", "BRC", 130, "BRC", "BRC"],
      // كروزايرو برازيلي - 1990-1993
      "BRE": [ "BRE", "BRE", 130, "BRE", "BRE"],
      // ريال برازيلي
      "BRL": [ "BRL", "R$", 2, "R$", "R$"],
      // دولار باهامي
      "BSD": [ "BSD", "BSD", 2, "BSD", "$"],
      // نولتوم بوتاني
      "BTN": [ "BTN", "BTN", 2, "BTN", "Nu."],
      // كيات بورمي
      "BUK": [ "BUK", "BUK", 130, "BUK", "BUK"],
      // بولا بتسواني
      "BWP": [ "BWP", "BWP", 2, "BWP", "P"],
      // روبل بيلاروسي جديد - 1994-1999
      "BYB": [ "BYB", "BYB", 130, "BYB", "BYB"],
      // روبل بيلاروسي
      "BYN": [ "BYN", "BYN", 2, "BYN", "BYN"],
      // روبل بيلاروسي (٢٠٠٠–٢٠١٦)
      "BYR": [ "BYR", "BYR", 128, "BYR", "BYR"],
      // دولار بليزي
      "BZD": [ "BZD", "BZD", 2, "BZD", "$"],
      // دولار كندي
      "CAD": [ "CAD", "CA$", 2, "C$", "$"],
      // فرنك كونغولي
      "CDF": [ "CDF", "CDF", 2, "CDF", "FrCD"],
      // فرنك سويسري
      "CHF": [ "CHF", "CHF", 2, "CHF", "CHF"],
      // بيزو تشيلي
      "CLP": [ "CLP", "CL$", 0, "CL$", "$"],
      // يوان صيني (في الخارج)
      "CNH": [ "CNH", "CNH", 130, "CNH", "CNH"],
      // يوان صيني
      "CNY": [ "CNY", "CN¥", 2, "RMB¥", "¥"],
      // بيزو كولومبي
      "COP": [ "COP", "COL$", 2, "COL$", "$"],
      // كولن كوستاريكي
      "CRC": [ "CRC", "CR₡", 2, "CR₡", "₡"],
      // دينار صربي قديم
      "CSD": [ "CSD", "CSD", 130, "CSD", "CSD"],
      // كرونة تشيكوسلوفاكيا
      "CSK": [ "CSK", "CSK", 130, "CSK", "CSK"],
      // بيزو كوبي قابل للتحويل
      "CUC": [ "CUC", "CUC", 2, "CUC", "$"],
      // بيزو كوبي
      "CUP": [ "CUP", "$MN", 2, "$MN", "$"],
      // اسكودو الرأس الأخضر
      "CVE": [ "CVE", "CVE", 2, "CVE", "CVE"],
      // جنيه قبرصي
      "CYP": [ "CYP", "CYP", 130, "CYP", "CYP"],
      // كرونة تشيكية
      "CZK": [ "CZK", "Kč", 2, "Kč", "Kč"],
      // أوستمارك ألماني شرقي
      "DDM": [ "DDM", "DDM", 130, "DDM", "DDM"],
      // مارك ألماني
      "DEM": [ "DEM", "DEM", 130, "DEM", "DEM"],
      // فرنك جيبوتي
      "DJF": [ "DJF", "Fdj", 0, "Fdj", "Fdj"],
      // كرونة دنماركية
      "DKK": [ "DKK", "kr", 2, "kr", "kr"],
      // بيزو الدومنيكان
      "DOP": [ "DOP", "RD$", 2, "RD$", "$"],
      // دينار جزائري
      "DZD": [ "DZD", "د.ج.‏", 2, "د.ج.‏", "din"],
      // كرونة استونية
      "EEK": [ "EEK", "EEK", 130, "EEK", "EEK"],
      // جنيه مصري
      "EGP": [ "EGP", "ج.م.‏", 2, "LE", "E£"],
      // ناكفا أريتري
      "ERN": [ "ERN", "ERN", 2, "ERN", "Nfk"],
      // بيزيتا إسباني
      "ESP": [ "ESP", "ESP", 128, "ESP", "ESP"],
      // بير أثيوبي
      "ETB": [ "ETB", "ETB", 2, "ETB", "Birr"],
      // يورو
      "EUR": [ "EUR", "€", 2, "€", "€"],
      // ماركا فنلندي
      "FIM": [ "FIM", "FIM", 130, "FIM", "FIM"],
      // دولار فيجي
      "FJD": [ "FJD", "FJD", 2, "FJD", "$"],
      // جنيه جزر فوكلاند
      "FKP": [ "FKP", "FKP", 2, "FKP", "£"],
      // فرنك فرنسي
      "FRF": [ "FRF", "FRF", 130, "FRF", "FRF"],
      // جنيه إسترليني
      "GBP": [ "GBP", "£", 2, "GB£", "£"],
      // لارى جورجي
      "GEL": [ "GEL", "₾", 2, "₾", "GEL"],
      // سيدي غاني
      "GHC": [ "GHC", "GHC", 130, "GHC", "GHC"],
      // سيدي غانا
      "GHS": [ "GHS", "GHS", 2, "GHS", "GHS"],
      // جنيه جبل طارق
      "GIP": [ "GIP", "GIP", 2, "GIP", "£"],
      // دلاسي غامبي
      "GMD": [ "GMD", "GMD", 2, "GMD", "GMD"],
      // فرنك غينيا
      "GNF": [ "GNF", "GNF", 0, "GNF", "FG"],
      // سيلي غينيا
      "GNS": [ "GNS", "GNS", 130, "GNS", "GNS"],
      // اكويل جونينا غينيا الاستوائيّة
      "GQE": [ "GQE", "GQE", 130, "GQE", "GQE"],
      // دراخما يوناني
      "GRD": [ "GRD", "GRD", 130, "GRD", "GRD"],
      // كوتزال غواتيمالا
      "GTQ": [ "GTQ", "GTQ", 2, "GTQ", "Q"],
      // اسكود برتغالي غينيا
      "GWE": [ "GWE", "GWE", 130, "GWE", "GWE"],
      // بيزو غينيا بيساو
      "GWP": [ "GWP", "GWP", 130, "GWP", "GWP"],
      // دولار غيانا
      "GYD": [ "GYD", "GYD", 2, "GYD", "$"],
      // دولار هونغ كونغ
      "HKD": [ "HKD", "HK$", 2, "HK$", "$"],
      // ليمبيرا هنداروس
      "HNL": [ "HNL", "L", 2, "L", "L"],
      // دينار كرواتي
      "HRD": [ "HRD", "HRD", 130, "HRD", "HRD"],
      // كونا كرواتي
      "HRK": [ "HRK", "HRK", 2, "HRK", "kn"],
      // جوردى هايتي
      "HTG": [ "HTG", "HTG", 2, "HTG", "HTG"],
      // فورينت هنغاري
      "HUF": [ "HUF", "HUF", 2, "HUF", "Ft"],
      // روبية إندونيسية
      "IDR": [ "IDR", "IDR", 2, "IDR", "Rp"],
      // جنيه إيرلندي
      "IEP": [ "IEP", "IEP", 130, "IEP", "IEP"],
      // جنيه إسرائيلي
      "ILP": [ "ILP", "ILP", 130, "ILP", "ILP"],
      // شيكل إسرائيلي جديد
      "ILS": [ "ILS", "₪", 2, "IL₪", "₪"],
      // روبية هندي
      "INR": [ "INR", "₹", 2, "Rs", "₹"],
      // دينار عراقي
      "IQD": [ "IQD", "د.ع.‏", 0, "د.ع.‏", "din"],
      // ريال إيراني
      "IRR": [ "IRR", "ر.إ.", 0, "ر.إ.", "Rial"],
      // كرونة أيسلندية
      "ISK": [ "ISK", "kr", 0, "kr", "kr"],
      // ليرة إيطالية
      "ITL": [ "ITL", "ITL", 128, "ITL", "ITL"],
      // دولار جامايكي
      "JMD": [ "JMD", "JA$", 2, "JA$", "$"],
      // دينار أردني
      "JOD": [ "JOD", "د.أ.‏", 3, "د.أ.‏", "din"],
      // ين ياباني
      "JPY": [ "JPY", "JP¥", 0, "JP¥", "¥"],
      // شلن كينيي
      "KES": [ "KES", "Ksh", 2, "Ksh", "Ksh"],
      // سوم قيرغستاني
      "KGS": [ "KGS", "KGS", 2, "KGS", "KGS"],
      // رييال كمبودي
      "KHR": [ "KHR", "KHR", 2, "KHR", "Riel"],
      // فرنك جزر القمر
      "KMF": [ "KMF", "KMF", 0, "KMF", "CF"],
      // وون كوريا الشمالية
      "KPW": [ "KPW", "KPW", 0, "KPW", "₩"],
      // وون كوريا الجنوبية
      "KRW": [ "KRW", "₩", 0, "KR₩", "₩"],
      // دينار كويتي
      "KWD": [ "KWD", "د.ك.‏", 3, "د.ك.‏", "din"],
      // دولار جزر كيمن
      "KYD": [ "KYD", "KYD", 2, "KYD", "$"],
      // تينغ كازاخستاني
      "KZT": [ "KZT", "KZT", 2, "KZT", "₸"],
      // كيب لاوسي
      "LAK": [ "LAK", "LAK", 0, "LAK", "₭"],
      // جنيه لبناني
      "LBP": [ "LBP", "ل.ل.‏", 0, "ل.ل.‏", "L£"],
      // روبية سريلانكية
      "LKR": [ "LKR", "SLRs", 2, "SLRs", "Rs"],
      // دولار ليبيري
      "LRD": [ "LRD", "LRD", 2, "LRD", "$"],
      // لوتي ليسوتو
      "LSL": [ "LSL", "LSL", 2, "LSL", "LSL"],
      // ليتا ليتوانية
      "LTL": [ "LTL", "LTL", 130, "LTL", "Lt"],
      // تالوناس ليتواني
      "LTT": [ "LTT", "LTT", 130, "LTT", "LTT"],
      // فرنك لوكسمبرج قابل للتحويل
      "LUC": [ "LUC", "LUC", 130, "LUC", "LUC"],
      // فرنك لوكسمبرج
      "LUF": [ "LUF", "LUF", 128, "LUF", "LUF"],
      // فرنك لوكسمبرج المالي
      "LUL": [ "LUL", "LUL", 130, "LUL", "LUL"],
      // لاتس لاتفيا
      "LVL": [ "LVL", "LVL", 130, "LVL", "Ls"],
      // روبل لاتفيا
      "LVR": [ "LVR", "LVR", 130, "LVR", "LVR"],
      // دينار ليبي
      "LYD": [ "LYD", "د.ل.‏", 3, "د.ل.‏", "din"],
      // درهم مغربي
      "MAD": [ "MAD", "د.م.‏", 2, "د.م.‏", "د.م.‏"],
      // فرنك مغربي
      "MAF": [ "MAF", "MAF", 130, "MAF", "MAF"],
      // ليو مولدوفي
      "MDL": [ "MDL", "MDL", 2, "MDL", "MDL"],
      // أرياري مدغشقر
      "MGA": [ "MGA", "MGA", 0, "MGA", "Ar"],
      // فرنك مدغشقر
      "MGF": [ "MGF", "MGF", 128, "MGF", "MGF"],
      // دينار مقدوني
      "MKD": [ "MKD", "MKD", 2, "MKD", "din"],
      // فرنك مالي
      "MLF": [ "MLF", "MLF", 130, "MLF", "MLF"],
      // كيات ميانمار
      "MMK": [ "MMK", "MMK", 0, "MMK", "K"],
      // توغروغ منغولي
      "MNT": [ "MNT", "MN₮", 2, "MN₮", "₮"],
      // باتاكا ماكاوي
      "MOP": [ "MOP", "MOP", 2, "MOP", "MOP"],
      // أوقية موريتانية - 1973-2017
      "MRO": [ "MRO", "MRO", 128, "MRO", "MRO"],
      // أوقية موريتانية
      "MRU": [ "MRU", "أ.م.", 2, "أ.م.", "أ.م."],
      // ليرة مالطية
      "MTL": [ "MTL", "MTL", 130, "MTL", "MTL"],
      // جنيه مالطي
      "MTP": [ "MTP", "MTP", 130, "MTP", "MTP"],
      // روبية موريشيوسية
      "MUR": [ "MUR", "MUR", 2, "MUR", "Rs"],
      // روفيه جزر المالديف
      "MVR": [ "MVR", "MVR", 2, "MVR", "MVR"],
      // كواشا مالاوي
      "MWK": [ "MWK", "MWK", 2, "MWK", "MWK"],
      // بيزو مكسيكي
      "MXN": [ "MXN", "MX$", 2, "Mex$", "$"],
      // بيزو فضي مكسيكي - 1861-1992
      "MXP": [ "MXP", "MXP", 130, "MXP", "MXP"],
      // رينغيت ماليزي
      "MYR": [ "MYR", "RM", 2, "RM", "RM"],
      // اسكود موزمبيقي
      "MZE": [ "MZE", "MZE", 130, "MZE", "MZE"],
      // متكال موزمبيقي
      "MZN": [ "MZN", "MZN", 2, "MZN", "MTn"],
      // دولار ناميبي
      "NAD": [ "NAD", "NAD", 2, "NAD", "$"],
      // نايرا نيجيري
      "NGN": [ "NGN", "NGN", 2, "NGN", "₦"],
      // كوردوبة نيكاراجوا
      "NIC": [ "NIC", "NIC", 130, "NIC", "NIC"],
      // قرطبة نيكاراغوا
      "NIO": [ "NIO", "NIO", 2, "NIO", "C$"],
      // جلدر هولندي
      "NLG": [ "NLG", "NLG", 130, "NLG", "NLG"],
      // كرونة نرويجية
      "NOK": [ "NOK", "NOkr", 2, "NOkr", "kr"],
      // روبية نيبالي
      "NPR": [ "NPR", "NPR", 2, "NPR", "Rs"],
      // دولار نيوزيلندي
      "NZD": [ "NZD", "NZ$", 2, "NZ$", "$"],
      // ريال عماني
      "OMR": [ "OMR", "ر.ع.‏", 3, "ر.ع.‏", "Rial"],
      // بالبوا بنمي
      "PAB": [ "PAB", "B/.", 2, "B/.", "B/."],
      // سول بيروفي
      "PEN": [ "PEN", "S/.", 2, "S/.", "S/."],
      // كينا بابوا غينيا الجديدة
      "PGK": [ "PGK", "PGK", 2, "PGK", "PGK"],
      // بيزو فلبيني
      "PHP": [ "PHP", "PHP", 2, "PHP", "₱"],
      // روبية باكستاني
      "PKR": [ "PKR", "PKRs.", 2, "PKRs.", "Rs"],
      // زلوتي بولندي
      "PLN": [ "PLN", "PLN", 2, "PLN", "zł"],
      // زلوتي بولندي - 1950-1995
      "PLZ": [ "PLZ", "PLZ", 130, "PLZ", "PLZ"],
      // اسكود برتغالي
      "PTE": [ "PTE", "PTE", 130, "PTE", "PTE"],
      // غواراني باراغواي
      "PYG": [ "PYG", "PYG", 0, "PYG", "Gs"],
      // ريال قطري
      "QAR": [ "QAR", "ر.ق.‏", 2, "ر.ق.‏", "Rial"],
      // دولار روديسي
      "RHD": [ "RHD", "RHD", 130, "RHD", "RHD"],
      // ليو روماني قديم
      "ROL": [ "ROL", "ROL", 130, "ROL", "ROL"],
      // ليو روماني
      "RON": [ "RON", "RON", 2, "RON", "RON"],
      // دينار صربي
      "RSD": [ "RSD", "RSD", 0, "RSD", "din"],
      // روبل روسي
      "RUB": [ "RUB", "руб.", 2, "руб.", "руб."],
      // روبل روسي - 1991-1998
      "RUR": [ "RUR", "RUR", 130, "RUR", "RUR"],
      // فرنك رواندي
      "RWF": [ "RWF", "RWF", 0, "RWF", "RF"],
      // ريال سعودي
      "SAR": [ "SAR", "ر.س.‏", 2, "SR", "Rial"],
      // دولار جزر سليمان
      "SBD": [ "SBD", "SBD", 2, "SBD", "$"],
      // روبية سيشيلية
      "SCR": [ "SCR", "SCR", 2, "SCR", "SCR"],
      // دينار سوداني
      "SDD": [ "SDD", "د.س.‏", 130, "د.س.‏", "د.س.‏"],
      // جنيه سوداني
      "SDG": [ "SDG", "ج.س.", 2, "ج.س.", "SDG"],
      // جنيه سوداني قديم
      "SDP": [ "SDP", "SDP", 130, "SDP", "SDP"],
      // كرونة سويدية
      "SEK": [ "SEK", "kr", 2, "kr", "kr"],
      // دولار سنغافوري
      "SGD": [ "SGD", "S$", 2, "S$", "$"],
      // جنيه سانت هيلين
      "SHP": [ "SHP", "SHP", 2, "SHP", "£"],
      // تولار سلوفيني
      "SIT": [ "SIT", "SIT", 130, "SIT", "SIT"],
      // كرونة سلوفاكية
      "SKK": [ "SKK", "SKK", 130, "SKK", "SKK"],
      // ليون سيراليوني
      "SLL": [ "SLL", "SLL", 0, "SLL", "SLL"],
      // شلن صومالي
      "SOS": [ "SOS", "SOS", 0, "SOS", "SOS"],
      // دولار سورينامي
      "SRD": [ "SRD", "SRD", 2, "SRD", "$"],
      // جلدر سورينامي
      "SRG": [ "SRG", "SRG", 130, "SRG", "SRG"],
      // جنيه جنوب السودان
      "SSP": [ "SSP", "SSP", 2, "SSP", "SSP"],
      // دوبرا ساو تومي وبرينسيبي - 1977-2017
      "STD": [ "STD", "STD", 128, "STD", "Db"],
      // دوبرا ساو تومي وبرينسيبي
      "STN": [ "STN", "STN", 2, "STN", "STN"],
      // روبل سوفيتي
      "SUR": [ "SUR", "SUR", 130, "SUR", "SUR"],
      // كولون سلفادوري
      "SVC": [ "SVC", "SVC", 130, "SVC", "SVC"],
      // ليرة سورية
      "SYP": [ "SYP", "ل.س.‏", 0, "ل.س.‏", "£"],
      // ليلانجيني سوازيلندي
      "SZL": [ "SZL", "SZL", 2, "SZL", "SZL"],
      // باخت تايلاندي
      "THB": [ "THB", "฿", 2, "THB", "฿"],
      // روبل طاجيكستاني
      "TJR": [ "TJR", "TJR", 130, "TJR", "TJR"],
      // سوموني طاجيكستاني
      "TJS": [ "TJS", "TJS", 2, "TJS", "Som"],
      // مانات تركمنستاني
      "TMM": [ "TMM", "TMM", 128, "TMM", "TMM"],
      // مانات تركمانستان
      "TMT": [ "TMT", "TMT", 2, "TMT", "TMT"],
      // دينار تونسي
      "TND": [ "TND", "د.ت.‏", 3, "د.ت.‏", "din"],
      // بانغا تونغا
      "TOP": [ "TOP", "TOP", 2, "TOP", "T$"],
      // اسكود تيموري
      "TPE": [ "TPE", "TPE", 130, "TPE", "TPE"],
      // ليرة تركي
      "TRL": [ "TRL", "TRL", 128, "TRL", "TRL"],
      // ليرة تركية
      "TRY": [ "TRY", "TL", 2, "YTL", "TL"],
      // دولار ترينداد وتوباغو
      "TTD": [ "TTD", "TTD", 2, "TTD", "$"],
      // دولار تايواني
      "TWD": [ "TWD", "NT$", 2, "NT$", "NT$"],
      // شلن تنزاني
      "TZS": [ "TZS", "TZS", 2, "TZS", "TSh"],
      // هريفنيا أوكراني
      "UAH": [ "UAH", "UAH", 2, "UAH", "₴"],
      // شلن أوغندي - 1966-1987
      "UGS": [ "UGS", "UGS", 130, "UGS", "UGS"],
      // شلن أوغندي
      "UGX": [ "UGX", "UGX", 0, "UGX", "UGX"],
      // دولار أمريكي
      "USD": [ "USD", "US$", 2, "US$", "$"],
      // دولار أمريكي (اليوم التالي)‏
      "USN": [ "USN", "USN", 130, "USN", "USN"],
      // دولار أمريكي (نفس اليوم)‏
      "USS": [ "USS", "USS", 130, "USS", "USS"],
      // بيزو أوروجواي - 1975-1993
      "UYP": [ "UYP", "UYP", 130, "UYP", "UYP"],
      // بيزو اوروغواي
      "UYU": [ "UYU", "UY$", 2, "UY$", "$"],
      // سوم أوزبكستاني
      "UZS": [ "UZS", "UZS", 2, "UZS", "soʼm"],
      // بوليفار فنزويلي - 1871-2008
      "VEB": [ "VEB", "VEB", 130, "VEB", "VEB"],
      // بوليفار فنزويلي - 2008–2018
      "VEF": [ "VEF", "VEF", 130, "VEF", "Bs"],
      // بوليفار فنزويلي
      "VES": [ "VES", "VES", 2, "VES", "VES"],
      // دونج فيتنامي
      "VND": [ "VND", "₫", 24, "₫", "₫"],
      // فاتو فانواتو
      "VUV": [ "VUV", "VUV", 0, "VUV", "VUV"],
      // تالا ساموا
      "WST": [ "WST", "WST", 2, "WST", "WST"],
      // فرنك وسط أفريقي
      "XAF": [ "XAF", "FCFA", 0, "FCFA", "FCFA"],
      // فضة
      "XAG": [ "XAG", "XAG", 130, "XAG", "XAG"],
      // ذهب
      "XAU": [ "XAU", "XAU", 130, "XAU", "XAU"],
      // الوحدة الأوروبية المركبة
      "XBA": [ "XBA", "XBA", 130, "XBA", "XBA"],
      // الوحدة المالية الأوروبية
      "XBB": [ "XBB", "XBB", 130, "XBB", "XBB"],
      // الوحدة الحسابية الأوروبية
      "XBC": [ "XBC", "XBC", 130, "XBC", "XBC"],
      // (XBD)وحدة الحساب الأوروبية
      "XBD": [ "XBD", "XBD", 130, "XBD", "XBD"],
      // دولار شرق الكاريبي
      "XCD": [ "XCD", "EC$", 2, "EC$", "$"],
      // حقوق السحب الخاصة
      "XDR": [ "XDR", "XDR", 130, "XDR", "XDR"],
      // وحدة النقد الأوروبية
      "XEU": [ "XEU", "XEU", 130, "XEU", "XEU"],
      // فرنك فرنسي ذهبي
      "XFO": [ "XFO", "XFO", 130, "XFO", "XFO"],
      // (UIC)فرنك فرنسي
      "XFU": [ "XFU", "XFU", 130, "XFU", "XFU"],
      // فرنك غرب أفريقي
      "XOF": [ "XOF", "CFA", 0, "CFA", "CFA"],
      // بالاديوم
      "XPD": [ "XPD", "XPD", 130, "XPD", "XPD"],
      // فرنك سي إف بي
      "XPF": [ "XPF", "CFPF", 0, "CFPF", "FCFP"],
      // البلاتين
      "XPT": [ "XPT", "XPT", 130, "XPT", "XPT"],
      // كود اختبار العملة
      "XTS": [ "XTS", "XTS", 130, "XTS", "XTS"],
      // عملة غير معروفة
      "XXX": [ "XXX", "***", 130, "***", "***"],
      // دينار يمني
      "YDD": [ "YDD", "YDD", 130, "YDD", "YDD"],
      // ريال يمني
      "YER": [ "YER", "ر.ي.‏", 0, "YER", "Rial"],
      // دينار يوغسلافي
      "YUD": [ "YUD", "YUD", 130, "YUD", "YUD"],
      // دينار يوغسلافي قابل للتحويل
      "YUN": [ "YUN", "YUN", 130, "YUN", "YUN"],
      // راند جنوب أفريقيا -مالي
      "ZAL": [ "ZAL", "ZAL", 130, "ZAL", "ZAL"],
      // راند جنوب أفريقيا
      "ZAR": [ "ZAR", "ZAR", 2, "ZAR", "R"],
      // كواشا زامبي - 1968-2012
      "ZMK": [ "ZMK", "ZMK", 128, "ZMK", "ZWK"],
      // كواشا زامبي
      "ZMW": [ "ZMW", "ZMW", 2, "ZMW", "ZMW"],
      // زائير زائيري جديد
      "ZRN": [ "ZRN", "ZRN", 130, "ZRN", "ZRN"],
      // زائير زائيري
      "ZRZ": [ "ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"],
      // دولار زمبابوي
      "ZWD": [ "ZWD", "ZWD", 128, "ZWD", "ZWD"],
      // دولار زمبابوي 2009
      "ZWL": [ "ZWL", "ZWL", 130, "ZWL", "ZWL"],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("ADP", "بيستا أندوري");
    result.put("AED", "درهم إماراتي");
    result.put("AFA", "أفغاني - 1927-2002");
    result.put("AFN", "أفغاني");
    result.put("ALL", "ليك ألباني");
    result.put("AMD", "درام أرميني");
    result.put("ANG", "غيلدر أنتيلي هولندي");
    result.put("AOA", "كوانزا أنغولي");
    result.put("AOK", "كوانزا أنجولي - 1977-1990");
    result.put("AON", "كوانزا أنجولي جديدة - 1990-2000");
    result.put("AOR", "كوانزا أنجولي معدلة - 1995 - 1999");
    result.put("ARA", "استرال أرجنتيني");
    result.put("ARP", "بيزو أرجنتيني - 1983-1985");
    result.put("ARS", "بيزو أرجنتيني");
    result.put("ATS", "شلن نمساوي");
    result.put("AUD", "دولار أسترالي");
    result.put("AWG", "فلورن أروبي");
    result.put("AZM", "مانات أذريبجاني");
    result.put("AZN", "مانات أذربيجان");
    result.put("BAD", "دينار البوسنة والهرسك");
    result.put("BAM", "مارك البوسنة والهرسك قابل للتحويل");
    result.put("BBD", "دولار بربادوسي");
    result.put("BDT", "تاكا بنغلاديشي");
    result.put("BEC", "فرنك بلجيكي قابل للتحويل");
    result.put("BEF", "فرنك بلجيكي");
    result.put("BEL", "فرنك بلجيكي مالي");
    result.put("BGN", "ليف بلغاري");
    result.put("BHD", "دينار بحريني");
    result.put("BIF", "فرنك بروندي");
    result.put("BMD", "دولار برمودي");
    result.put("BND", "دولار بروناي");
    result.put("BOB", "بوليفيانو بوليفي");
    result.put("BOP", "بيزو بوليفي");
    result.put("BOV", "مفدول بوليفي");
    result.put("BRB", "نوفو كروزايرو برازيلي - 1967-1986");
    result.put("BRC", "كروزادو برازيلي");
    result.put("BRE", "كروزايرو برازيلي - 1990-1993");
    result.put("BRL", "ريال برازيلي");
    result.put("BSD", "دولار باهامي");
    result.put("BTN", "نولتوم بوتاني");
    result.put("BUK", "كيات بورمي");
    result.put("BWP", "بولا بتسواني");
    result.put("BYB", "روبل بيلاروسي جديد - 1994-1999");
    result.put("BYN", "روبل بيلاروسي");
    result.put("BYR", "روبل بيلاروسي (٢٠٠٠–٢٠١٦)");
    result.put("BZD", "دولار بليزي");
    result.put("CAD", "دولار كندي");
    result.put("CDF", "فرنك كونغولي");
    result.put("CHF", "فرنك سويسري");
    result.put("CLP", "بيزو تشيلي");
    result.put("CNH", "يوان صيني (في الخارج)");
    result.put("CNY", "يوان صيني");
    result.put("COP", "بيزو كولومبي");
    result.put("CRC", "كولن كوستاريكي");
    result.put("CSD", "دينار صربي قديم");
    result.put("CSK", "كرونة تشيكوسلوفاكيا");
    result.put("CUC", "بيزو كوبي قابل للتحويل");
    result.put("CUP", "بيزو كوبي");
    result.put("CVE", "اسكودو الرأس الأخضر");
    result.put("CYP", "جنيه قبرصي");
    result.put("CZK", "كرونة تشيكية");
    result.put("DDM", "أوستمارك ألماني شرقي");
    result.put("DEM", "مارك ألماني");
    result.put("DJF", "فرنك جيبوتي");
    result.put("DKK", "كرونة دنماركية");
    result.put("DOP", "بيزو الدومنيكان");
    result.put("DZD", "دينار جزائري");
    result.put("EEK", "كرونة استونية");
    result.put("EGP", "جنيه مصري");
    result.put("ERN", "ناكفا أريتري");
    result.put("ESP", "بيزيتا إسباني");
    result.put("ETB", "بير أثيوبي");
    result.put("EUR", "يورو");
    result.put("FIM", "ماركا فنلندي");
    result.put("FJD", "دولار فيجي");
    result.put("FKP", "جنيه جزر فوكلاند");
    result.put("FRF", "فرنك فرنسي");
    result.put("GBP", "جنيه إسترليني");
    result.put("GEL", "لارى جورجي");
    result.put("GHC", "سيدي غاني");
    result.put("GHS", "سيدي غانا");
    result.put("GIP", "جنيه جبل طارق");
    result.put("GMD", "دلاسي غامبي");
    result.put("GNF", "فرنك غينيا");
    result.put("GNS", "سيلي غينيا");
    result.put("GQE", "اكويل جونينا غينيا الاستوائيّة");
    result.put("GRD", "دراخما يوناني");
    result.put("GTQ", "كوتزال غواتيمالا");
    result.put("GWE", "اسكود برتغالي غينيا");
    result.put("GWP", "بيزو غينيا بيساو");
    result.put("GYD", "دولار غيانا");
    result.put("HKD", "دولار هونغ كونغ");
    result.put("HNL", "ليمبيرا هنداروس");
    result.put("HRD", "دينار كرواتي");
    result.put("HRK", "كونا كرواتي");
    result.put("HTG", "جوردى هايتي");
    result.put("HUF", "فورينت هنغاري");
    result.put("IDR", "روبية إندونيسية");
    result.put("IEP", "جنيه إيرلندي");
    result.put("ILP", "جنيه إسرائيلي");
    result.put("ILS", "شيكل إسرائيلي جديد");
    result.put("INR", "روبية هندي");
    result.put("IQD", "دينار عراقي");
    result.put("IRR", "ريال إيراني");
    result.put("ISK", "كرونة أيسلندية");
    result.put("ITL", "ليرة إيطالية");
    result.put("JMD", "دولار جامايكي");
    result.put("JOD", "دينار أردني");
    result.put("JPY", "ين ياباني");
    result.put("KES", "شلن كينيي");
    result.put("KGS", "سوم قيرغستاني");
    result.put("KHR", "رييال كمبودي");
    result.put("KMF", "فرنك جزر القمر");
    result.put("KPW", "وون كوريا الشمالية");
    result.put("KRW", "وون كوريا الجنوبية");
    result.put("KWD", "دينار كويتي");
    result.put("KYD", "دولار جزر كيمن");
    result.put("KZT", "تينغ كازاخستاني");
    result.put("LAK", "كيب لاوسي");
    result.put("LBP", "جنيه لبناني");
    result.put("LKR", "روبية سريلانكية");
    result.put("LRD", "دولار ليبيري");
    result.put("LSL", "لوتي ليسوتو");
    result.put("LTL", "ليتا ليتوانية");
    result.put("LTT", "تالوناس ليتواني");
    result.put("LUC", "فرنك لوكسمبرج قابل للتحويل");
    result.put("LUF", "فرنك لوكسمبرج");
    result.put("LUL", "فرنك لوكسمبرج المالي");
    result.put("LVL", "لاتس لاتفيا");
    result.put("LVR", "روبل لاتفيا");
    result.put("LYD", "دينار ليبي");
    result.put("MAD", "درهم مغربي");
    result.put("MAF", "فرنك مغربي");
    result.put("MDL", "ليو مولدوفي");
    result.put("MGA", "أرياري مدغشقر");
    result.put("MGF", "فرنك مدغشقر");
    result.put("MKD", "دينار مقدوني");
    result.put("MLF", "فرنك مالي");
    result.put("MMK", "كيات ميانمار");
    result.put("MNT", "توغروغ منغولي");
    result.put("MOP", "باتاكا ماكاوي");
    result.put("MRO", "أوقية موريتانية - 1973-2017");
    result.put("MRU", "أوقية موريتانية");
    result.put("MTL", "ليرة مالطية");
    result.put("MTP", "جنيه مالطي");
    result.put("MUR", "روبية موريشيوسية");
    result.put("MVR", "روفيه جزر المالديف");
    result.put("MWK", "كواشا مالاوي");
    result.put("MXN", "بيزو مكسيكي");
    result.put("MXP", "بيزو فضي مكسيكي - 1861-1992");
    result.put("MYR", "رينغيت ماليزي");
    result.put("MZE", "اسكود موزمبيقي");
    result.put("MZN", "متكال موزمبيقي");
    result.put("NAD", "دولار ناميبي");
    result.put("NGN", "نايرا نيجيري");
    result.put("NIC", "كوردوبة نيكاراجوا");
    result.put("NIO", "قرطبة نيكاراغوا");
    result.put("NLG", "جلدر هولندي");
    result.put("NOK", "كرونة نرويجية");
    result.put("NPR", "روبية نيبالي");
    result.put("NZD", "دولار نيوزيلندي");
    result.put("OMR", "ريال عماني");
    result.put("PAB", "بالبوا بنمي");
    result.put("PEN", "سول بيروفي");
    result.put("PGK", "كينا بابوا غينيا الجديدة");
    result.put("PHP", "بيزو فلبيني");
    result.put("PKR", "روبية باكستاني");
    result.put("PLN", "زلوتي بولندي");
    result.put("PLZ", "زلوتي بولندي - 1950-1995");
    result.put("PTE", "اسكود برتغالي");
    result.put("PYG", "غواراني باراغواي");
    result.put("QAR", "ريال قطري");
    result.put("RHD", "دولار روديسي");
    result.put("ROL", "ليو روماني قديم");
    result.put("RON", "ليو روماني");
    result.put("RSD", "دينار صربي");
    result.put("RUB", "روبل روسي");
    result.put("RUR", "روبل روسي - 1991-1998");
    result.put("RWF", "فرنك رواندي");
    result.put("SAR", "ريال سعودي");
    result.put("SBD", "دولار جزر سليمان");
    result.put("SCR", "روبية سيشيلية");
    result.put("SDD", "دينار سوداني");
    result.put("SDG", "جنيه سوداني");
    result.put("SDP", "جنيه سوداني قديم");
    result.put("SEK", "كرونة سويدية");
    result.put("SGD", "دولار سنغافوري");
    result.put("SHP", "جنيه سانت هيلين");
    result.put("SIT", "تولار سلوفيني");
    result.put("SKK", "كرونة سلوفاكية");
    result.put("SLL", "ليون سيراليوني");
    result.put("SOS", "شلن صومالي");
    result.put("SRD", "دولار سورينامي");
    result.put("SRG", "جلدر سورينامي");
    result.put("SSP", "جنيه جنوب السودان");
    result.put("STD", "دوبرا ساو تومي وبرينسيبي - 1977-2017");
    result.put("STN", "دوبرا ساو تومي وبرينسيبي");
    result.put("SUR", "روبل سوفيتي");
    result.put("SVC", "كولون سلفادوري");
    result.put("SYP", "ليرة سورية");
    result.put("SZL", "ليلانجيني سوازيلندي");
    result.put("THB", "باخت تايلاندي");
    result.put("TJR", "روبل طاجيكستاني");
    result.put("TJS", "سوموني طاجيكستاني");
    result.put("TMM", "مانات تركمنستاني");
    result.put("TMT", "مانات تركمانستان");
    result.put("TND", "دينار تونسي");
    result.put("TOP", "بانغا تونغا");
    result.put("TPE", "اسكود تيموري");
    result.put("TRL", "ليرة تركي");
    result.put("TRY", "ليرة تركية");
    result.put("TTD", "دولار ترينداد وتوباغو");
    result.put("TWD", "دولار تايواني");
    result.put("TZS", "شلن تنزاني");
    result.put("UAH", "هريفنيا أوكراني");
    result.put("UGS", "شلن أوغندي - 1966-1987");
    result.put("UGX", "شلن أوغندي");
    result.put("USD", "دولار أمريكي");
    result.put("USN", "دولار أمريكي (اليوم التالي)‏");
    result.put("USS", "دولار أمريكي (نفس اليوم)‏");
    result.put("UYP", "بيزو أوروجواي - 1975-1993");
    result.put("UYU", "بيزو اوروغواي");
    result.put("UZS", "سوم أوزبكستاني");
    result.put("VEB", "بوليفار فنزويلي - 1871-2008");
    result.put("VEF", "بوليفار فنزويلي - 2008–2018");
    result.put("VES", "بوليفار فنزويلي");
    result.put("VND", "دونج فيتنامي");
    result.put("VUV", "فاتو فانواتو");
    result.put("WST", "تالا ساموا");
    result.put("XAF", "فرنك وسط أفريقي");
    result.put("XAG", "فضة");
    result.put("XAU", "ذهب");
    result.put("XBA", "الوحدة الأوروبية المركبة");
    result.put("XBB", "الوحدة المالية الأوروبية");
    result.put("XBC", "الوحدة الحسابية الأوروبية");
    result.put("XBD", "(XBD)وحدة الحساب الأوروبية");
    result.put("XCD", "دولار شرق الكاريبي");
    result.put("XDR", "حقوق السحب الخاصة");
    result.put("XEU", "وحدة النقد الأوروبية");
    result.put("XFO", "فرنك فرنسي ذهبي");
    result.put("XFU", "(UIC)فرنك فرنسي");
    result.put("XOF", "فرنك غرب أفريقي");
    result.put("XPD", "بالاديوم");
    result.put("XPF", "فرنك سي إف بي");
    result.put("XPT", "البلاتين");
    result.put("XTS", "كود اختبار العملة");
    result.put("XXX", "عملة غير معروفة");
    result.put("YDD", "دينار يمني");
    result.put("YER", "ريال يمني");
    result.put("YUD", "دينار يوغسلافي");
    result.put("YUN", "دينار يوغسلافي قابل للتحويل");
    result.put("ZAL", "راند جنوب أفريقيا -مالي");
    result.put("ZAR", "راند جنوب أفريقيا");
    result.put("ZMK", "كواشا زامبي - 1968-2012");
    result.put("ZMW", "كواشا زامبي");
    result.put("ZRN", "زائير زائيري جديد");
    result.put("ZRZ", "زائير زائيري");
    result.put("ZWD", "دولار زمبابوي");
    result.put("ZWL", "دولار زمبابوي 2009");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "ADP": "بيستا أندوري",
      "AED": "درهم إماراتي",
      "AFA": "أفغاني - 1927-2002",
      "AFN": "أفغاني",
      "ALL": "ليك ألباني",
      "AMD": "درام أرميني",
      "ANG": "غيلدر أنتيلي هولندي",
      "AOA": "كوانزا أنغولي",
      "AOK": "كوانزا أنجولي - 1977-1990",
      "AON": "كوانزا أنجولي جديدة - 1990-2000",
      "AOR": "كوانزا أنجولي معدلة - 1995 - 1999",
      "ARA": "استرال أرجنتيني",
      "ARP": "بيزو أرجنتيني - 1983-1985",
      "ARS": "بيزو أرجنتيني",
      "ATS": "شلن نمساوي",
      "AUD": "دولار أسترالي",
      "AWG": "فلورن أروبي",
      "AZM": "مانات أذريبجاني",
      "AZN": "مانات أذربيجان",
      "BAD": "دينار البوسنة والهرسك",
      "BAM": "مارك البوسنة والهرسك قابل للتحويل",
      "BBD": "دولار بربادوسي",
      "BDT": "تاكا بنغلاديشي",
      "BEC": "فرنك بلجيكي قابل للتحويل",
      "BEF": "فرنك بلجيكي",
      "BEL": "فرنك بلجيكي مالي",
      "BGN": "ليف بلغاري",
      "BHD": "دينار بحريني",
      "BIF": "فرنك بروندي",
      "BMD": "دولار برمودي",
      "BND": "دولار بروناي",
      "BOB": "بوليفيانو بوليفي",
      "BOP": "بيزو بوليفي",
      "BOV": "مفدول بوليفي",
      "BRB": "نوفو كروزايرو برازيلي - 1967-1986",
      "BRC": "كروزادو برازيلي",
      "BRE": "كروزايرو برازيلي - 1990-1993",
      "BRL": "ريال برازيلي",
      "BSD": "دولار باهامي",
      "BTN": "نولتوم بوتاني",
      "BUK": "كيات بورمي",
      "BWP": "بولا بتسواني",
      "BYB": "روبل بيلاروسي جديد - 1994-1999",
      "BYN": "روبل بيلاروسي",
      "BYR": "روبل بيلاروسي (٢٠٠٠–٢٠١٦)",
      "BZD": "دولار بليزي",
      "CAD": "دولار كندي",
      "CDF": "فرنك كونغولي",
      "CHF": "فرنك سويسري",
      "CLP": "بيزو تشيلي",
      "CNH": "يوان صيني (في الخارج)",
      "CNY": "يوان صيني",
      "COP": "بيزو كولومبي",
      "CRC": "كولن كوستاريكي",
      "CSD": "دينار صربي قديم",
      "CSK": "كرونة تشيكوسلوفاكيا",
      "CUC": "بيزو كوبي قابل للتحويل",
      "CUP": "بيزو كوبي",
      "CVE": "اسكودو الرأس الأخضر",
      "CYP": "جنيه قبرصي",
      "CZK": "كرونة تشيكية",
      "DDM": "أوستمارك ألماني شرقي",
      "DEM": "مارك ألماني",
      "DJF": "فرنك جيبوتي",
      "DKK": "كرونة دنماركية",
      "DOP": "بيزو الدومنيكان",
      "DZD": "دينار جزائري",
      "EEK": "كرونة استونية",
      "EGP": "جنيه مصري",
      "ERN": "ناكفا أريتري",
      "ESP": "بيزيتا إسباني",
      "ETB": "بير أثيوبي",
      "EUR": "يورو",
      "FIM": "ماركا فنلندي",
      "FJD": "دولار فيجي",
      "FKP": "جنيه جزر فوكلاند",
      "FRF": "فرنك فرنسي",
      "GBP": "جنيه إسترليني",
      "GEL": "لارى جورجي",
      "GHC": "سيدي غاني",
      "GHS": "سيدي غانا",
      "GIP": "جنيه جبل طارق",
      "GMD": "دلاسي غامبي",
      "GNF": "فرنك غينيا",
      "GNS": "سيلي غينيا",
      "GQE": "اكويل جونينا غينيا الاستوائيّة",
      "GRD": "دراخما يوناني",
      "GTQ": "كوتزال غواتيمالا",
      "GWE": "اسكود برتغالي غينيا",
      "GWP": "بيزو غينيا بيساو",
      "GYD": "دولار غيانا",
      "HKD": "دولار هونغ كونغ",
      "HNL": "ليمبيرا هنداروس",
      "HRD": "دينار كرواتي",
      "HRK": "كونا كرواتي",
      "HTG": "جوردى هايتي",
      "HUF": "فورينت هنغاري",
      "IDR": "روبية إندونيسية",
      "IEP": "جنيه إيرلندي",
      "ILP": "جنيه إسرائيلي",
      "ILS": "شيكل إسرائيلي جديد",
      "INR": "روبية هندي",
      "IQD": "دينار عراقي",
      "IRR": "ريال إيراني",
      "ISK": "كرونة أيسلندية",
      "ITL": "ليرة إيطالية",
      "JMD": "دولار جامايكي",
      "JOD": "دينار أردني",
      "JPY": "ين ياباني",
      "KES": "شلن كينيي",
      "KGS": "سوم قيرغستاني",
      "KHR": "رييال كمبودي",
      "KMF": "فرنك جزر القمر",
      "KPW": "وون كوريا الشمالية",
      "KRW": "وون كوريا الجنوبية",
      "KWD": "دينار كويتي",
      "KYD": "دولار جزر كيمن",
      "KZT": "تينغ كازاخستاني",
      "LAK": "كيب لاوسي",
      "LBP": "جنيه لبناني",
      "LKR": "روبية سريلانكية",
      "LRD": "دولار ليبيري",
      "LSL": "لوتي ليسوتو",
      "LTL": "ليتا ليتوانية",
      "LTT": "تالوناس ليتواني",
      "LUC": "فرنك لوكسمبرج قابل للتحويل",
      "LUF": "فرنك لوكسمبرج",
      "LUL": "فرنك لوكسمبرج المالي",
      "LVL": "لاتس لاتفيا",
      "LVR": "روبل لاتفيا",
      "LYD": "دينار ليبي",
      "MAD": "درهم مغربي",
      "MAF": "فرنك مغربي",
      "MDL": "ليو مولدوفي",
      "MGA": "أرياري مدغشقر",
      "MGF": "فرنك مدغشقر",
      "MKD": "دينار مقدوني",
      "MLF": "فرنك مالي",
      "MMK": "كيات ميانمار",
      "MNT": "توغروغ منغولي",
      "MOP": "باتاكا ماكاوي",
      "MRO": "أوقية موريتانية - 1973-2017",
      "MRU": "أوقية موريتانية",
      "MTL": "ليرة مالطية",
      "MTP": "جنيه مالطي",
      "MUR": "روبية موريشيوسية",
      "MVR": "روفيه جزر المالديف",
      "MWK": "كواشا مالاوي",
      "MXN": "بيزو مكسيكي",
      "MXP": "بيزو فضي مكسيكي - 1861-1992",
      "MYR": "رينغيت ماليزي",
      "MZE": "اسكود موزمبيقي",
      "MZN": "متكال موزمبيقي",
      "NAD": "دولار ناميبي",
      "NGN": "نايرا نيجيري",
      "NIC": "كوردوبة نيكاراجوا",
      "NIO": "قرطبة نيكاراغوا",
      "NLG": "جلدر هولندي",
      "NOK": "كرونة نرويجية",
      "NPR": "روبية نيبالي",
      "NZD": "دولار نيوزيلندي",
      "OMR": "ريال عماني",
      "PAB": "بالبوا بنمي",
      "PEN": "سول بيروفي",
      "PGK": "كينا بابوا غينيا الجديدة",
      "PHP": "بيزو فلبيني",
      "PKR": "روبية باكستاني",
      "PLN": "زلوتي بولندي",
      "PLZ": "زلوتي بولندي - 1950-1995",
      "PTE": "اسكود برتغالي",
      "PYG": "غواراني باراغواي",
      "QAR": "ريال قطري",
      "RHD": "دولار روديسي",
      "ROL": "ليو روماني قديم",
      "RON": "ليو روماني",
      "RSD": "دينار صربي",
      "RUB": "روبل روسي",
      "RUR": "روبل روسي - 1991-1998",
      "RWF": "فرنك رواندي",
      "SAR": "ريال سعودي",
      "SBD": "دولار جزر سليمان",
      "SCR": "روبية سيشيلية",
      "SDD": "دينار سوداني",
      "SDG": "جنيه سوداني",
      "SDP": "جنيه سوداني قديم",
      "SEK": "كرونة سويدية",
      "SGD": "دولار سنغافوري",
      "SHP": "جنيه سانت هيلين",
      "SIT": "تولار سلوفيني",
      "SKK": "كرونة سلوفاكية",
      "SLL": "ليون سيراليوني",
      "SOS": "شلن صومالي",
      "SRD": "دولار سورينامي",
      "SRG": "جلدر سورينامي",
      "SSP": "جنيه جنوب السودان",
      "STD": "دوبرا ساو تومي وبرينسيبي - 1977-2017",
      "STN": "دوبرا ساو تومي وبرينسيبي",
      "SUR": "روبل سوفيتي",
      "SVC": "كولون سلفادوري",
      "SYP": "ليرة سورية",
      "SZL": "ليلانجيني سوازيلندي",
      "THB": "باخت تايلاندي",
      "TJR": "روبل طاجيكستاني",
      "TJS": "سوموني طاجيكستاني",
      "TMM": "مانات تركمنستاني",
      "TMT": "مانات تركمانستان",
      "TND": "دينار تونسي",
      "TOP": "بانغا تونغا",
      "TPE": "اسكود تيموري",
      "TRL": "ليرة تركي",
      "TRY": "ليرة تركية",
      "TTD": "دولار ترينداد وتوباغو",
      "TWD": "دولار تايواني",
      "TZS": "شلن تنزاني",
      "UAH": "هريفنيا أوكراني",
      "UGS": "شلن أوغندي - 1966-1987",
      "UGX": "شلن أوغندي",
      "USD": "دولار أمريكي",
      "USN": "دولار أمريكي (اليوم التالي)‏",
      "USS": "دولار أمريكي (نفس اليوم)‏",
      "UYP": "بيزو أوروجواي - 1975-1993",
      "UYU": "بيزو اوروغواي",
      "UZS": "سوم أوزبكستاني",
      "VEB": "بوليفار فنزويلي - 1871-2008",
      "VEF": "بوليفار فنزويلي - 2008–2018",
      "VES": "بوليفار فنزويلي",
      "VND": "دونج فيتنامي",
      "VUV": "فاتو فانواتو",
      "WST": "تالا ساموا",
      "XAF": "فرنك وسط أفريقي",
      "XAG": "فضة",
      "XAU": "ذهب",
      "XBA": "الوحدة الأوروبية المركبة",
      "XBB": "الوحدة المالية الأوروبية",
      "XBC": "الوحدة الحسابية الأوروبية",
      "XBD": "(XBD)وحدة الحساب الأوروبية",
      "XCD": "دولار شرق الكاريبي",
      "XDR": "حقوق السحب الخاصة",
      "XEU": "وحدة النقد الأوروبية",
      "XFO": "فرنك فرنسي ذهبي",
      "XFU": "(UIC)فرنك فرنسي",
      "XOF": "فرنك غرب أفريقي",
      "XPD": "بالاديوم",
      "XPF": "فرنك سي إف بي",
      "XPT": "البلاتين",
      "XTS": "كود اختبار العملة",
      "XXX": "عملة غير معروفة",
      "YDD": "دينار يمني",
      "YER": "ريال يمني",
      "YUD": "دينار يوغسلافي",
      "YUN": "دينار يوغسلافي قابل للتحويل",
      "ZAL": "راند جنوب أفريقيا -مالي",
      "ZAR": "راند جنوب أفريقيا",
      "ZMK": "كواشا زامبي - 1968-2012",
      "ZMW": "كواشا زامبي",
      "ZRN": "زائير زائيري جديد",
      "ZRZ": "زائير زائيري",
      "ZWD": "دولار زمبابوي",
      "ZWL": "دولار زمبابوي 2009",
    };
  }-*/;
}
