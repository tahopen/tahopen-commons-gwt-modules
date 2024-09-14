package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_zh_Hant extends com.google.gwt.i18n.client.CurrencyList_zh {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("TWD", "$", 2, "NT$", "NT$");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "TWD", "$", 2, "NT$", "NT$"];
  }-*/;
  
  @Override
  protected HashMap<String, CurrencyData> loadCurrencyMapJava() {
    HashMap<String, CurrencyData> result = super.loadCurrencyMapJava();
    // 安道爾陪士特
    result.put("ADP", new CurrencyDataImpl("ADP", "ADP", 128, "ADP", "ADP"));
    // 阿拉伯聯合大公國迪爾汗
    result.put("AED", new CurrencyDataImpl("AED", "DH", 2, "DH", "dh"));
    // 阿爾巴尼亞列克 (1946–1965)
    result.put("ALK", new CurrencyDataImpl("ALK", "ALK", 130, "ALK", "ALK"));
    // 阿爾巴尼亞列克
    result.put("ALL", new CurrencyDataImpl("ALL", "ALL", 0, "ALL", "Lek"));
    // 亞美尼亞德拉姆
    result.put("AMD", new CurrencyDataImpl("AMD", "AMD", 2, "AMD", "Dram"));
    // 荷屬安地列斯盾
    result.put("ANG", new CurrencyDataImpl("ANG", "ANG", 2, "ANG", "ANG"));
    // 安哥拉寬扎
    result.put("AOA", new CurrencyDataImpl("AOA", "AOA", 2, "AOA", "Kz"));
    // 安哥拉寬扎 (1977–1990)
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130, "AOK", "AOK"));
    // 安哥拉新寬扎 (1990–2000)
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130, "AON", "AON"));
    // 安哥拉新調寬扎 (1995–1999)
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130, "AOR", "AOR"));
    // 阿根廷奧斯特納爾
    result.put("ARA", new CurrencyDataImpl("ARA", "ARA", 130, "ARA", "ARA"));
    // 阿根廷披索 (1970–1983)
    result.put("ARL", new CurrencyDataImpl("ARL", "ARL", 130, "ARL", "ARL"));
    // 阿根廷披索 (1881–1970)
    result.put("ARM", new CurrencyDataImpl("ARM", "ARM", 130, "ARM", "ARM"));
    // 阿根廷披索 (1983–1985)
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130, "ARP", "ARP"));
    // 阿根廷披索
    result.put("ARS", new CurrencyDataImpl("ARS", "AR$", 2, "AR$", "$"));
    // 奧地利先令
    result.put("ATS", new CurrencyDataImpl("ATS", "ATS", 130, "ATS", "ATS"));
    // 澳幣
    result.put("AUD", new CurrencyDataImpl("AUD", "AU$", 2, "AU$", "$"));
    // 阿路巴盾
    result.put("AWG", new CurrencyDataImpl("AWG", "AWG", 2, "AWG", "Afl."));
    // 亞塞拜然馬納特 (1993–2006)
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130, "AZM", "AZM"));
    // 亞塞拜然馬納特
    result.put("AZN", new CurrencyDataImpl("AZN", "AZN", 2, "AZN", "man."));
    // 波士尼亞-赫塞哥維納第納爾
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130, "BAD", "BAD"));
    // 波士尼亞-赫塞哥維納可轉換馬克
    result.put("BAM", new CurrencyDataImpl("BAM", "BAM", 2, "BAM", "KM"));
    // 波士尼亞-赫塞哥維納新第納爾
    result.put("BAN", new CurrencyDataImpl("BAN", "BAN", 130, "BAN", "BAN"));
    // 巴貝多元
    result.put("BBD", new CurrencyDataImpl("BBD", "BBD", 2, "BBD", "$"));
    // 比利時法郎（可轉換）
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 130, "BEC", "BEC"));
    // 比利時法郎
    result.put("BEF", new CurrencyDataImpl("BEF", "BEF", 130, "BEF", "BEF"));
    // 比利時法郎（金融）
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 130, "BEL", "BEL"));
    // 保加利亞硬列弗
    result.put("BGL", new CurrencyDataImpl("BGL", "BGL", 130, "BGL", "BGL"));
    // 保加利亞社會黨列弗
    result.put("BGM", new CurrencyDataImpl("BGM", "BGM", 130, "BGM", "BGM"));
    // 保加利亞新列弗
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2, "BGN", "lev"));
    // 保加利亞列弗 (1879–1952)
    result.put("BGO", new CurrencyDataImpl("BGO", "BGO", 130, "BGO", "BGO"));
    // 巴林第納爾
    result.put("BHD", new CurrencyDataImpl("BHD", "BHD", 3, "BHD", "din"));
    // 蒲隆地法郎
    result.put("BIF", new CurrencyDataImpl("BIF", "BIF", 0, "BIF", "FBu"));
    // 百慕達幣
    result.put("BMD", new CurrencyDataImpl("BMD", "BMD", 2, "BMD", "$"));
    // 汶萊元
    result.put("BND", new CurrencyDataImpl("BND", "BND", 2, "BND", "$"));
    // 玻利維亞諾
    result.put("BOB", new CurrencyDataImpl("BOB", "BOB", 2, "BOB", "Bs"));
    // 玻利維亞玻利維亞諾 (1863–1963)
    result.put("BOL", new CurrencyDataImpl("BOL", "BOL", 130, "BOL", "BOL"));
    // 玻利維亞披索
    result.put("BOP", new CurrencyDataImpl("BOP", "BOP", 130, "BOP", "BOP"));
    // 玻利維亞幕多
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 130, "BOV", "BOV"));
    // 巴西克魯薩多農瓦 (1967–1986)
    result.put("BRB", new CurrencyDataImpl("BRB", "BRB", 130, "BRB", "BRB"));
    // 巴西克魯賽羅 (1986–1989)
    result.put("BRC", new CurrencyDataImpl("BRC", "BRC", 130, "BRC", "BRC"));
    // 巴西克魯賽羅 (1990–1993)
    result.put("BRE", new CurrencyDataImpl("BRE", "BRE", 130, "BRE", "BRE"));
    // 巴西里拉
    result.put("BRL", new CurrencyDataImpl("BRL", "R$", 2, "R$", "R$"));
    // 巴西克如爾達農瓦
    result.put("BRN", new CurrencyDataImpl("BRN", "BRN", 130, "BRN", "BRN"));
    // 巴西克魯賽羅 (1993–1994)
    result.put("BRR", new CurrencyDataImpl("BRR", "BRR", 130, "BRR", "BRR"));
    // 巴西克魯賽羅 (1942 –1967)
    result.put("BRZ", new CurrencyDataImpl("BRZ", "BRZ", 130, "BRZ", "BRZ"));
    // 巴哈馬元
    result.put("BSD", new CurrencyDataImpl("BSD", "BSD", 2, "BSD", "$"));
    // 不丹那特倫
    result.put("BTN", new CurrencyDataImpl("BTN", "BTN", 2, "BTN", "Nu."));
    // 緬甸基雅特
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130, "BUK", "BUK"));
    // 波札那普拉
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2, "BWP", "P"));
    // 白俄羅斯新盧布 (1994–1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130, "BYB", "BYB"));
    // 白俄羅斯盧布
    result.put("BYN", new CurrencyDataImpl("BYN", "BYN", 2, "BYN", "BYN"));
    // 白俄羅斯盧布 (2000–2016)
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 128, "BYR", "BYR"));
    // 貝里斯元
    result.put("BZD", new CurrencyDataImpl("BZD", "BZD", 2, "BZD", "$"));
    // 加幣
    result.put("CAD", new CurrencyDataImpl("CAD", "CA$", 2, "C$", "$"));
    // 剛果法郎
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2, "CDF", "FrCD"));
    // 歐元 (WIR)
    result.put("CHE", new CurrencyDataImpl("CHE", "CHE", 130, "CHE", "CHE"));
    // 智利埃斯庫多
    result.put("CLE", new CurrencyDataImpl("CLE", "CLE", 130, "CLE", "CLE"));
    // 卡林油達佛曼跎
    result.put("CLF", new CurrencyDataImpl("CLF", "CLF", 132, "CLF", "CLF"));
    // 智利披索
    result.put("CLP", new CurrencyDataImpl("CLP", "CL$", 0, "CL$", "$"));
    // 人民幣（離岸）
    result.put("CNH", new CurrencyDataImpl("CNH", "CNH", 130, "CNH", "CNH"));
    // 人民幣
    result.put("CNY", new CurrencyDataImpl("CNY", "CN¥", 2, "RMB¥", "¥"));
    // 哥倫比亞披索
    result.put("COP", new CurrencyDataImpl("COP", "COL$", 2, "COL$", "$"));
    // 哥倫比亞幣 (COU)
    result.put("COU", new CurrencyDataImpl("COU", "COU", 130, "COU", "COU"));
    // 哥斯大黎加科朗
    result.put("CRC", new CurrencyDataImpl("CRC", "CR₡", 2, "CR₡", "₡"));
    // 舊塞爾維亞第納爾
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130, "CSD", "CSD"));
    // 捷克斯洛伐克硬克朗
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130, "CSK", "CSK"));
    // 古巴可轉換披索
    result.put("CUC", new CurrencyDataImpl("CUC", "CUC", 2, "CUC", "$"));
    // 古巴披索
    result.put("CUP", new CurrencyDataImpl("CUP", "$MN", 2, "$MN", "$"));
    // 維德角埃斯庫多
    result.put("CVE", new CurrencyDataImpl("CVE", "CVE", 2, "CVE", "CVE"));
    // 賽普勒斯鎊
    result.put("CYP", new CurrencyDataImpl("CYP", "CYP", 130, "CYP", "CYP"));
    // 東德奧斯特馬克
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130, "DDM", "DDM"));
    // 德國馬克
    result.put("DEM", new CurrencyDataImpl("DEM", "DEM", 130, "DEM", "DEM"));
    // 吉布地法郎
    result.put("DJF", new CurrencyDataImpl("DJF", "Fdj", 0, "Fdj", "Fdj"));
    // 丹麥克朗
    result.put("DKK", new CurrencyDataImpl("DKK", "kr", 2, "kr", "kr"));
    // 多明尼加披索
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$", "$"));
    // 阿爾及利亞第納爾
    result.put("DZD", new CurrencyDataImpl("DZD", "DZD", 2, "DZD", "din"));
    // 厄瓜多蘇克雷
    result.put("ECS", new CurrencyDataImpl("ECS", "ECS", 130, "ECS", "ECS"));
    // 厄瓜多爾由里達瓦康斯坦 (UVC)
    result.put("ECV", new CurrencyDataImpl("ECV", "ECV", 130, "ECV", "ECV"));
    // 愛沙尼亞克朗
    result.put("EEK", new CurrencyDataImpl("EEK", "EEK", 130, "EEK", "EEK"));
    // 埃及鎊
    result.put("EGP", new CurrencyDataImpl("EGP", "LE", 2, "LE", "E£"));
    // 厄立特里亞納克法
    result.put("ERN", new CurrencyDataImpl("ERN", "ERN", 2, "ERN", "Nfk"));
    // 西班牙比塞塔（會計單位）
    result.put("ESA", new CurrencyDataImpl("ESA", "ESA", 130, "ESA", "ESA"));
    // 西班牙比塞塔（可轉換會計單位）
    result.put("ESB", new CurrencyDataImpl("ESB", "ESB", 130, "ESB", "ESB"));
    // 西班牙陪士特
    result.put("ESP", new CurrencyDataImpl("ESP", "ESP", 128, "ESP", "ESP"));
    // 衣索比亞比爾
    result.put("ETB", new CurrencyDataImpl("ETB", "ETB", 2, "ETB", "Birr"));
    // 歐元
    result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€", "€"));
    // 芬蘭馬克
    result.put("FIM", new CurrencyDataImpl("FIM", "FIM", 130, "FIM", "FIM"));
    // 斐濟元
    result.put("FJD", new CurrencyDataImpl("FJD", "FJD", 2, "FJD", "$"));
    // 福克蘭群島鎊
    result.put("FKP", new CurrencyDataImpl("FKP", "FKP", 2, "FKP", "£"));
    // 法國法郎
    result.put("FRF", new CurrencyDataImpl("FRF", "FRF", 130, "FRF", "FRF"));
    // 英鎊
    result.put("GBP", new CurrencyDataImpl("GBP", "£", 2, "GB£", "£"));
    // 喬治亞庫旁拉里
    result.put("GEK", new CurrencyDataImpl("GEK", "GEK", 130, "GEK", "GEK"));
    // 喬治亞拉里
    result.put("GEL", new CurrencyDataImpl("GEL", "₾", 2, "₾", "GEL"));
    // 迦納賽地 (1979–2007)
    result.put("GHC", new CurrencyDataImpl("GHC", "GHC", 130, "GHC", "GHC"));
    // 迦納塞地
    result.put("GHS", new CurrencyDataImpl("GHS", "GHS", 2, "GHS", "GHS"));
    // 直布羅陀鎊
    result.put("GIP", new CurrencyDataImpl("GIP", "GIP", 2, "GIP", "£"));
    // 甘比亞達拉西
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2, "GMD", "GMD"));
    // 幾內亞法郎
    result.put("GNF", new CurrencyDataImpl("GNF", "GNF", 0, "GNF", "FG"));
    // 幾內亞西里
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130, "GNS", "GNS"));
    // 赤道幾內亞埃奎勒
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130, "GQE", "GQE"));
    // 希臘德拉克馬
    result.put("GRD", new CurrencyDataImpl("GRD", "GRD", 130, "GRD", "GRD"));
    // 瓜地馬拉格查爾
    result.put("GTQ", new CurrencyDataImpl("GTQ", "GTQ", 2, "GTQ", "Q"));
    // 葡屬幾內亞埃斯庫多
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130, "GWE", "GWE"));
    // 幾內亞比索披索
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 130, "GWP", "GWP"));
    // 圭亞那元
    result.put("GYD", new CurrencyDataImpl("GYD", "GYD", 2, "GYD", "$"));
    // 港幣
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$", "$"));
    // 洪都拉斯倫皮拉
    result.put("HNL", new CurrencyDataImpl("HNL", "L", 2, "L", "L"));
    // 克羅埃西亞第納爾
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130, "HRD", "HRD"));
    // 克羅埃西亞庫納
    result.put("HRK", new CurrencyDataImpl("HRK", "HRK", 2, "HRK", "kn"));
    // 印尼盾
    result.put("IDR", new CurrencyDataImpl("IDR", "IDR", 2, "IDR", "Rp"));
    // 愛爾蘭鎊
    result.put("IEP", new CurrencyDataImpl("IEP", "IEP", 130, "IEP", "IEP"));
    // 以色列鎊
    result.put("ILP", new CurrencyDataImpl("ILP", "ILP", 130, "ILP", "ILP"));
    // 以色列謝克爾 (1980–1985)
    result.put("ILR", new CurrencyDataImpl("ILR", "ILR", 130, "ILR", "ILR"));
    // 以色列新謝克爾
    result.put("ILS", new CurrencyDataImpl("ILS", "₪", 2, "IL₪", "₪"));
    // 印度盧比
    result.put("INR", new CurrencyDataImpl("INR", "₹", 2, "Rs", "₹"));
    // 伊拉克第納爾
    result.put("IQD", new CurrencyDataImpl("IQD", "IQD", 0, "IQD", "din"));
    // 伊朗里亞爾
    result.put("IRR", new CurrencyDataImpl("IRR", "IRR", 0, "IRR", "Rial"));
    // 冰島克朗 (1918–1981)
    result.put("ISJ", new CurrencyDataImpl("ISJ", "ISJ", 130, "ISJ", "ISJ"));
    // 冰島克朗
    result.put("ISK", new CurrencyDataImpl("ISK", "kr", 0, "kr", "kr"));
    // 義大利里拉
    result.put("ITL", new CurrencyDataImpl("ITL", "ITL", 128, "ITL", "ITL"));
    // 牙買加元
    result.put("JMD", new CurrencyDataImpl("JMD", "JA$", 2, "JA$", "$"));
    // 約旦第納爾
    result.put("JOD", new CurrencyDataImpl("JOD", "JOD", 3, "JOD", "din"));
    // 日圓
    result.put("JPY", new CurrencyDataImpl("JPY", "¥", 0, "JP¥", "¥"));
    // 肯尼亞先令
    result.put("KES", new CurrencyDataImpl("KES", "Ksh", 2, "Ksh", "Ksh"));
    // 吉爾吉斯索姆
    result.put("KGS", new CurrencyDataImpl("KGS", "KGS", 2, "KGS", "KGS"));
    // 柬埔寨瑞爾
    result.put("KHR", new CurrencyDataImpl("KHR", "KHR", 2, "KHR", "Riel"));
    // 科摩羅法郎
    result.put("KMF", new CurrencyDataImpl("KMF", "KMF", 0, "KMF", "CF"));
    // 北韓元
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 0, "KPW", "₩"));
    // 南韓圜
    result.put("KRH", new CurrencyDataImpl("KRH", "KRH", 130, "KRH", "KRH"));
    // 南韓圓
    result.put("KRO", new CurrencyDataImpl("KRO", "KRO", 130, "KRO", "KRO"));
    // 韓元
    result.put("KRW", new CurrencyDataImpl("KRW", "￦", 0, "KR₩", "₩"));
    // 科威特第納爾
    result.put("KWD", new CurrencyDataImpl("KWD", "KWD", 3, "KWD", "din"));
    // 開曼群島元
    result.put("KYD", new CurrencyDataImpl("KYD", "KYD", 2, "KYD", "$"));
    // 哈薩克堅戈
    result.put("KZT", new CurrencyDataImpl("KZT", "KZT", 2, "KZT", "₸"));
    // 寮國基普
    result.put("LAK", new CurrencyDataImpl("LAK", "LAK", 0, "LAK", "₭"));
    // 黎巴嫩鎊
    result.put("LBP", new CurrencyDataImpl("LBP", "LBP", 0, "LBP", "L£"));
    // 斯里蘭卡盧比
    result.put("LKR", new CurrencyDataImpl("LKR", "SLRs", 2, "SLRs", "Rs"));
    // 賴比瑞亞元
    result.put("LRD", new CurrencyDataImpl("LRD", "LRD", 2, "LRD", "$"));
    // 賴索托洛蒂
    result.put("LSL", new CurrencyDataImpl("LSL", "LSL", 2, "LSL", "LSL"));
    // 立陶宛特羅
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130, "LTT", "LTT"));
    // 盧森堡可兌換法郎
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 130, "LUC", "LUC"));
    // 盧森堡法郎
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128, "LUF", "LUF"));
    // 盧森堡金融法郎
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 130, "LUL", "LUL"));
    // 拉脫維亞拉特銀幣
    result.put("LVL", new CurrencyDataImpl("LVL", "LVL", 130, "LVL", "Ls"));
    // 拉脫維亞盧布
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130, "LVR", "LVR"));
    // 利比亞第納爾
    result.put("LYD", new CurrencyDataImpl("LYD", "LYD", 3, "LYD", "din"));
    // 摩納哥法郎
    result.put("MCF", new CurrencyDataImpl("MCF", "MCF", 130, "MCF", "MCF"));
    // 摩爾多瓦券
    result.put("MDC", new CurrencyDataImpl("MDC", "MDC", 130, "MDC", "MDC"));
    // 摩杜雲列伊
    result.put("MDL", new CurrencyDataImpl("MDL", "MDL", 2, "MDL", "MDL"));
    // 馬達加斯加阿里亞里
    result.put("MGA", new CurrencyDataImpl("MGA", "MGA", 0, "MGA", "Ar"));
    // 馬達加斯加法郎
    result.put("MGF", new CurrencyDataImpl("MGF", "MGF", 128, "MGF", "MGF"));
    // 馬其頓第納爾
    result.put("MKD", new CurrencyDataImpl("MKD", "MKD", 2, "MKD", "din"));
    // 馬其頓第納爾 (1992–1993)
    result.put("MKN", new CurrencyDataImpl("MKN", "MKN", 130, "MKN", "MKN"));
    // 馬里法郎
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130, "MLF", "MLF"));
    // 緬甸元
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 0, "MMK", "K"));
    // 蒙古圖格里克
    result.put("MNT", new CurrencyDataImpl("MNT", "MN₮", 2, "MN₮", "₮"));
    // 澳門元
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP", 2, "MOP", "MOP"));
    // 茅利塔尼亞烏吉亞 (1973–2017)
    result.put("MRO", new CurrencyDataImpl("MRO", "MRO", 128, "MRO", "MRO"));
    // 茅利塔尼亞烏吉亞
    result.put("MRU", new CurrencyDataImpl("MRU", "MRU", 2, "MRU", "MRU"));
    // 馬爾他里拉
    result.put("MTL", new CurrencyDataImpl("MTL", "MTL", 130, "MTL", "MTL"));
    // 馬爾他鎊
    result.put("MTP", new CurrencyDataImpl("MTP", "MTP", 130, "MTP", "MTP"));
    // 模里西斯盧比
    result.put("MUR", new CurrencyDataImpl("MUR", "MUR", 2, "MUR", "Rs"));
    // 馬爾地夫盧比
    result.put("MVP", new CurrencyDataImpl("MVP", "MVP", 130, "MVP", "MVP"));
    // 馬爾地夫盧非亞
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2, "MVR", "MVR"));
    // 馬拉維克瓦查
    result.put("MWK", new CurrencyDataImpl("MWK", "MWK", 2, "MWK", "MWK"));
    // 墨西哥披索
    result.put("MXN", new CurrencyDataImpl("MXN", "MX$", 2, "Mex$", "$"));
    // 墨西哥銀披索 (1861–1992)
    result.put("MXP", new CurrencyDataImpl("MXP", "MXP", 130, "MXP", "MXP"));
    // 墨西哥轉換單位 (UDI)
    result.put("MXV", new CurrencyDataImpl("MXV", "MXV", 130, "MXV", "MXV"));
    // 馬來西亞令吉
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM", "RM"));
    // 莫三比克埃斯庫多
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130, "MZE", "MZE"));
    // 莫三比克梅蒂卡爾 (1980–2006)
    result.put("MZM", new CurrencyDataImpl("MZM", "MZM", 130, "MZM", "MZM"));
    // 莫三比克梅蒂卡爾
    result.put("MZN", new CurrencyDataImpl("MZN", "MZN", 2, "MZN", "MTn"));
    // 納米比亞元
    result.put("NAD", new CurrencyDataImpl("NAD", "NAD", 2, "NAD", "$"));
    // 奈及利亞奈拉
    result.put("NGN", new CurrencyDataImpl("NGN", "NGN", 2, "NGN", "₦"));
    // 尼加拉瓜科多巴
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130, "NIC", "NIC"));
    // 尼加拉瓜金科多巴
    result.put("NIO", new CurrencyDataImpl("NIO", "NIO", 2, "NIO", "C$"));
    // 荷蘭盾
    result.put("NLG", new CurrencyDataImpl("NLG", "NLG", 130, "NLG", "NLG"));
    // 尼泊爾盧比
    result.put("NPR", new CurrencyDataImpl("NPR", "NPR", 2, "NPR", "Rs"));
    // 紐西蘭幣
    result.put("NZD", new CurrencyDataImpl("NZD", "NZ$", 2, "NZ$", "$"));
    // 阿曼里亞爾
    result.put("OMR", new CurrencyDataImpl("OMR", "OMR", 3, "OMR", "Rial"));
    // 巴拿馬巴波亞
    result.put("PAB", new CurrencyDataImpl("PAB", "B/.", 2, "B/.", "B/."));
    // 祕魯因蒂
    result.put("PEI", new CurrencyDataImpl("PEI", "PEI", 130, "PEI", "PEI"));
    // 秘魯太陽幣
    result.put("PEN", new CurrencyDataImpl("PEN", "S/.", 2, "S/.", "S/."));
    // 秘魯太陽幣 (1863–1965)
    result.put("PES", new CurrencyDataImpl("PES", "PES", 130, "PES", "PES"));
    // 巴布亞紐幾內亞基那
    result.put("PGK", new CurrencyDataImpl("PGK", "PGK", 2, "PGK", "PGK"));
    // 菲律賓披索
    result.put("PHP", new CurrencyDataImpl("PHP", "PHP", 2, "PHP", "₱"));
    // 巴基斯坦盧比
    result.put("PKR", new CurrencyDataImpl("PKR", "PKRs.", 2, "PKRs.", "Rs"));
    // 波蘭茲羅提
    result.put("PLN", new CurrencyDataImpl("PLN", "PLN", 2, "PLN", "zł"));
    // 波蘭茲羅提 (1950–1995)
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130, "PLZ", "PLZ"));
    // 葡萄牙埃斯庫多
    result.put("PTE", new CurrencyDataImpl("PTE", "PTE", 130, "PTE", "PTE"));
    // 卡達里亞爾
    result.put("QAR", new CurrencyDataImpl("QAR", "QAR", 2, "QAR", "Rial"));
    // 羅德西亞元
    result.put("RHD", new CurrencyDataImpl("RHD", "RHD", 130, "RHD", "RHD"));
    // 舊羅馬尼亞列伊
    result.put("ROL", new CurrencyDataImpl("ROL", "ROL", 130, "ROL", "ROL"));
    // 羅馬尼亞列伊
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2, "RON", "RON"));
    // 塞爾維亞戴納
    result.put("RSD", new CurrencyDataImpl("RSD", "RSD", 0, "RSD", "din"));
    // 俄羅斯盧布
    result.put("RUB", new CurrencyDataImpl("RUB", "руб.", 2, "руб.", "руб."));
    // 俄羅斯盧布 (1991–1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130, "RUR", "RUR"));
    // 盧安達法郎
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0, "RWF", "RF"));
    // 沙烏地里亞爾
    result.put("SAR", new CurrencyDataImpl("SAR", "SR", 2, "SR", "Rial"));
    // 索羅門群島元
    result.put("SBD", new CurrencyDataImpl("SBD", "SBD", 2, "SBD", "$"));
    // 塞席爾盧比
    result.put("SCR", new CurrencyDataImpl("SCR", "SCR", 2, "SCR", "SCR"));
    // 蘇丹第納爾
    result.put("SDD", new CurrencyDataImpl("SDD", "SDD", 130, "SDD", "SDD"));
    // 蘇丹鎊
    result.put("SDG", new CurrencyDataImpl("SDG", "SDG", 2, "SDG", "SDG"));
    // 舊蘇丹鎊
    result.put("SDP", new CurrencyDataImpl("SDP", "SDP", 130, "SDP", "SDP"));
    // 新加坡幣
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$", "$"));
    // 聖赫勒拿鎊
    result.put("SHP", new CurrencyDataImpl("SHP", "SHP", 2, "SHP", "£"));
    // 斯洛維尼亞托勒
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130, "SIT", "SIT"));
    // 獅子山利昂
    result.put("SLL", new CurrencyDataImpl("SLL", "SLL", 0, "SLL", "SLL"));
    // 索馬利亞先令
    result.put("SOS", new CurrencyDataImpl("SOS", "SOS", 0, "SOS", "SOS"));
    // 蘇利南元
    result.put("SRD", new CurrencyDataImpl("SRD", "SRD", 2, "SRD", "$"));
    // 蘇利南基爾
    result.put("SRG", new CurrencyDataImpl("SRG", "SRG", 130, "SRG", "SRG"));
    // 南蘇丹鎊
    result.put("SSP", new CurrencyDataImpl("SSP", "SSP", 2, "SSP", "SSP"));
    // 聖多美島和普林西比島多布拉 (1977–2017)
    result.put("STD", new CurrencyDataImpl("STD", "STD", 128, "STD", "Db"));
    // 聖多美島和普林西比島多布拉
    result.put("STN", new CurrencyDataImpl("STN", "STN", 2, "STN", "STN"));
    // 蘇聯盧布
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130, "SUR", "SUR"));
    // 薩爾瓦多科郎
    result.put("SVC", new CurrencyDataImpl("SVC", "SVC", 130, "SVC", "SVC"));
    // 敘利亞鎊
    result.put("SYP", new CurrencyDataImpl("SYP", "SYP", 0, "SYP", "£"));
    // 史瓦濟蘭里朗吉尼
    result.put("SZL", new CurrencyDataImpl("SZL", "SZL", 2, "SZL", "SZL"));
    // 泰銖
    result.put("THB", new CurrencyDataImpl("THB", "THB", 2, "THB", "฿"));
    // 塔吉克盧布
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130, "TJR", "TJR"));
    // 塔吉克索莫尼
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2, "TJS", "Som"));
    // 土庫曼馬納特 (1993–2009)
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 128, "TMM", "TMM"));
    // 土庫曼馬納特
    result.put("TMT", new CurrencyDataImpl("TMT", "TMT", 2, "TMT", "TMT"));
    // 突尼西亞第納爾
    result.put("TND", new CurrencyDataImpl("TND", "TND", 3, "TND", "din"));
    // 東加潘加
    result.put("TOP", new CurrencyDataImpl("TOP", "TOP", 2, "TOP", "T$"));
    // 帝汶埃斯庫多
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130, "TPE", "TPE"));
    // 土耳其里拉
    result.put("TRL", new CurrencyDataImpl("TRL", "TRL", 128, "TRL", "TRL"));
    // 新土耳其里拉
    result.put("TRY", new CurrencyDataImpl("TRY", "TL", 2, "YTL", "TL"));
    // 千里達及托巴哥元
    result.put("TTD", new CurrencyDataImpl("TTD", "TTD", 2, "TTD", "$"));
    // 新台幣
    result.put("TWD", new CurrencyDataImpl("TWD", "$", 2, "NT$", "NT$"));
    // 坦尚尼亞先令
    result.put("TZS", new CurrencyDataImpl("TZS", "TZS", 2, "TZS", "TSh"));
    // 烏克蘭格里夫納
    result.put("UAH", new CurrencyDataImpl("UAH", "UAH", 2, "UAH", "₴"));
    // 烏克蘭卡本瓦那茲
    result.put("UAK", new CurrencyDataImpl("UAK", "UAK", 130, "UAK", "UAK"));
    // 烏干達先令 (1966–1987)
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130, "UGS", "UGS"));
    // 烏干達先令
    result.put("UGX", new CurrencyDataImpl("UGX", "UGX", 0, "UGX", "UGX"));
    // 美元（當日）
    result.put("USS", new CurrencyDataImpl("USS", "USS", 130, "USS", "USS"));
    // 烏拉圭披索（指數單位）
    result.put("UYI", new CurrencyDataImpl("UYI", "UYI", 128, "UYI", "UYI"));
    // 烏拉圭披索 (1975–1993)
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130, "UYP", "UYP"));
    // 烏拉圭披索
    result.put("UYU", new CurrencyDataImpl("UYU", "UY$", 2, "UY$", "$"));
    // 烏茲別克索姆
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 2, "UZS", "soʼm"));
    // 委內瑞拉玻利瓦 (1871–2008)
    result.put("VEB", new CurrencyDataImpl("VEB", "VEB", 130, "VEB", "VEB"));
    // 委內瑞拉玻利瓦 (2008–2018)
    result.put("VEF", new CurrencyDataImpl("VEF", "VEF", 130, "VEF", "Bs"));
    // 委內瑞拉玻利瓦
    result.put("VES", new CurrencyDataImpl("VES", "VES", 2, "VES", "VES"));
    // 萬那杜瓦圖
    result.put("VUV", new CurrencyDataImpl("VUV", "VUV", 0, "VUV", "VUV"));
    // 西薩摩亞塔拉
    result.put("WST", new CurrencyDataImpl("WST", "WST", 2, "WST", "WST"));
    // 法郎 (CFA–BEAC)
    result.put("XAF", new CurrencyDataImpl("XAF", "FCFA", 0, "FCFA", "FCFA"));
    // 白銀
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 130, "XAG", "XAG"));
    // 黃金
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 130, "XAU", "XAU"));
    // 歐洲綜合單位
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 130, "XBA", "XBA"));
    // 歐洲貨幣單位 (XBB)
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 130, "XBB", "XBB"));
    // 歐洲會計單位 (XBC)
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 130, "XBC", "XBC"));
    // 歐洲會計單位 (XBD)
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 130, "XBD", "XBD"));
    // 格瑞那達元
    result.put("XCD", new CurrencyDataImpl("XCD", "EC$", 2, "EC$", "$"));
    // 特殊提款權
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 130, "XDR", "XDR"));
    // 歐洲貨幣單位 (XEU)
    result.put("XEU", new CurrencyDataImpl("XEU", "XEU", 130, "XEU", "XEU"));
    // 法國金法郎
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 130, "XFO", "XFO"));
    // 法國法郎 (UIC)
    result.put("XFU", new CurrencyDataImpl("XFU", "XFU", 130, "XFU", "XFU"));
    // 法郎 (CFA–BCEAO)
    result.put("XOF", new CurrencyDataImpl("XOF", "CFA", 0, "CFA", "CFA"));
    // 帕拉狄昂
    result.put("XPD", new CurrencyDataImpl("XPD", "XPD", 130, "XPD", "XPD"));
    // 法郎 (CFP)
    result.put("XPF", new CurrencyDataImpl("XPF", "CFPF", 0, "CFPF", "FCFP"));
    // 白金
    result.put("XPT", new CurrencyDataImpl("XPT", "XPT", 130, "XPT", "XPT"));
    // 蘇克雷貨幣
    result.put("XSU", new CurrencyDataImpl("XSU", "XSU", 130, "XSU", "XSU"));
    // 測試用貨幣代碼
    result.put("XTS", new CurrencyDataImpl("XTS", "XTS", 130, "XTS", "XTS"));
    // 亞洲開發銀行計價單位
    result.put("XUA", new CurrencyDataImpl("XUA", "XUA", 130, "XUA", "XUA"));
    // 未知貨幣
    result.put("XXX", new CurrencyDataImpl("XXX", "XXX", 130, "XXX", "XXX"));
    // 葉門第納爾
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130, "YDD", "YDD"));
    // 葉門里亞爾
    result.put("YER", new CurrencyDataImpl("YER", "YER", 0, "YER", "Rial"));
    // 南斯拉夫第納爾硬幣
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130, "YUD", "YUD"));
    // 南斯拉夫挪威亞第納爾
    result.put("YUM", new CurrencyDataImpl("YUM", "YUM", 130, "YUM", "YUM"));
    // 南斯拉夫可轉換第納爾
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130, "YUN", "YUN"));
    // 南斯拉夫改革第納爾 (1992–1993)
    result.put("YUR", new CurrencyDataImpl("YUR", "YUR", 130, "YUR", "YUR"));
    // 南非蘭特（金融）
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 130, "ZAL", "ZAL"));
    // 南非蘭特
    result.put("ZAR", new CurrencyDataImpl("ZAR", "ZAR", 2, "ZAR", "R"));
    // 尚比亞克瓦查 (1968–2012)
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZMK", 128, "ZMK", "ZWK"));
    // 尚比亞克瓦查
    result.put("ZMW", new CurrencyDataImpl("ZMW", "ZMW", 2, "ZMW", "ZMW"));
    // 薩伊新扎伊爾
    result.put("ZRN", new CurrencyDataImpl("ZRN", "ZRN", 130, "ZRN", "ZRN"));
    // 薩伊扎伊爾
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"));
    // 辛巴威元 (1980–2008)
    result.put("ZWD", new CurrencyDataImpl("ZWD", "ZWD", 128, "ZWD", "ZWD"));
    // 辛巴威元 (2009)
    result.put("ZWL", new CurrencyDataImpl("ZWL", "ZWL", 130, "ZWL", "ZWL"));
    // 辛巴威元 (2008)
    result.put("ZWR", new CurrencyDataImpl("ZWR", "ZWR", 130, "ZWR", "ZWR"));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // 安道爾陪士特
      "ADP": [ "ADP", "ADP", 128, "ADP", "ADP"],
      // 阿拉伯聯合大公國迪爾汗
      "AED": [ "AED", "DH", 2, "DH", "dh"],
      // 阿爾巴尼亞列克 (1946–1965)
      "ALK": [ "ALK", "ALK", 130, "ALK", "ALK"],
      // 阿爾巴尼亞列克
      "ALL": [ "ALL", "ALL", 0, "ALL", "Lek"],
      // 亞美尼亞德拉姆
      "AMD": [ "AMD", "AMD", 2, "AMD", "Dram"],
      // 荷屬安地列斯盾
      "ANG": [ "ANG", "ANG", 2, "ANG", "ANG"],
      // 安哥拉寬扎
      "AOA": [ "AOA", "AOA", 2, "AOA", "Kz"],
      // 安哥拉寬扎 (1977–1990)
      "AOK": [ "AOK", "AOK", 130, "AOK", "AOK"],
      // 安哥拉新寬扎 (1990–2000)
      "AON": [ "AON", "AON", 130, "AON", "AON"],
      // 安哥拉新調寬扎 (1995–1999)
      "AOR": [ "AOR", "AOR", 130, "AOR", "AOR"],
      // 阿根廷奧斯特納爾
      "ARA": [ "ARA", "ARA", 130, "ARA", "ARA"],
      // 阿根廷披索 (1970–1983)
      "ARL": [ "ARL", "ARL", 130, "ARL", "ARL"],
      // 阿根廷披索 (1881–1970)
      "ARM": [ "ARM", "ARM", 130, "ARM", "ARM"],
      // 阿根廷披索 (1983–1985)
      "ARP": [ "ARP", "ARP", 130, "ARP", "ARP"],
      // 阿根廷披索
      "ARS": [ "ARS", "AR$", 2, "AR$", "$"],
      // 奧地利先令
      "ATS": [ "ATS", "ATS", 130, "ATS", "ATS"],
      // 澳幣
      "AUD": [ "AUD", "AU$", 2, "AU$", "$"],
      // 阿路巴盾
      "AWG": [ "AWG", "AWG", 2, "AWG", "Afl."],
      // 亞塞拜然馬納特 (1993–2006)
      "AZM": [ "AZM", "AZM", 130, "AZM", "AZM"],
      // 亞塞拜然馬納特
      "AZN": [ "AZN", "AZN", 2, "AZN", "man."],
      // 波士尼亞-赫塞哥維納第納爾
      "BAD": [ "BAD", "BAD", 130, "BAD", "BAD"],
      // 波士尼亞-赫塞哥維納可轉換馬克
      "BAM": [ "BAM", "BAM", 2, "BAM", "KM"],
      // 波士尼亞-赫塞哥維納新第納爾
      "BAN": [ "BAN", "BAN", 130, "BAN", "BAN"],
      // 巴貝多元
      "BBD": [ "BBD", "BBD", 2, "BBD", "$"],
      // 比利時法郎（可轉換）
      "BEC": [ "BEC", "BEC", 130, "BEC", "BEC"],
      // 比利時法郎
      "BEF": [ "BEF", "BEF", 130, "BEF", "BEF"],
      // 比利時法郎（金融）
      "BEL": [ "BEL", "BEL", 130, "BEL", "BEL"],
      // 保加利亞硬列弗
      "BGL": [ "BGL", "BGL", 130, "BGL", "BGL"],
      // 保加利亞社會黨列弗
      "BGM": [ "BGM", "BGM", 130, "BGM", "BGM"],
      // 保加利亞新列弗
      "BGN": [ "BGN", "BGN", 2, "BGN", "lev"],
      // 保加利亞列弗 (1879–1952)
      "BGO": [ "BGO", "BGO", 130, "BGO", "BGO"],
      // 巴林第納爾
      "BHD": [ "BHD", "BHD", 3, "BHD", "din"],
      // 蒲隆地法郎
      "BIF": [ "BIF", "BIF", 0, "BIF", "FBu"],
      // 百慕達幣
      "BMD": [ "BMD", "BMD", 2, "BMD", "$"],
      // 汶萊元
      "BND": [ "BND", "BND", 2, "BND", "$"],
      // 玻利維亞諾
      "BOB": [ "BOB", "BOB", 2, "BOB", "Bs"],
      // 玻利維亞玻利維亞諾 (1863–1963)
      "BOL": [ "BOL", "BOL", 130, "BOL", "BOL"],
      // 玻利維亞披索
      "BOP": [ "BOP", "BOP", 130, "BOP", "BOP"],
      // 玻利維亞幕多
      "BOV": [ "BOV", "BOV", 130, "BOV", "BOV"],
      // 巴西克魯薩多農瓦 (1967–1986)
      "BRB": [ "BRB", "BRB", 130, "BRB", "BRB"],
      // 巴西克魯賽羅 (1986–1989)
      "BRC": [ "BRC", "BRC", 130, "BRC", "BRC"],
      // 巴西克魯賽羅 (1990–1993)
      "BRE": [ "BRE", "BRE", 130, "BRE", "BRE"],
      // 巴西里拉
      "BRL": [ "BRL", "R$", 2, "R$", "R$"],
      // 巴西克如爾達農瓦
      "BRN": [ "BRN", "BRN", 130, "BRN", "BRN"],
      // 巴西克魯賽羅 (1993–1994)
      "BRR": [ "BRR", "BRR", 130, "BRR", "BRR"],
      // 巴西克魯賽羅 (1942 –1967)
      "BRZ": [ "BRZ", "BRZ", 130, "BRZ", "BRZ"],
      // 巴哈馬元
      "BSD": [ "BSD", "BSD", 2, "BSD", "$"],
      // 不丹那特倫
      "BTN": [ "BTN", "BTN", 2, "BTN", "Nu."],
      // 緬甸基雅特
      "BUK": [ "BUK", "BUK", 130, "BUK", "BUK"],
      // 波札那普拉
      "BWP": [ "BWP", "BWP", 2, "BWP", "P"],
      // 白俄羅斯新盧布 (1994–1999)
      "BYB": [ "BYB", "BYB", 130, "BYB", "BYB"],
      // 白俄羅斯盧布
      "BYN": [ "BYN", "BYN", 2, "BYN", "BYN"],
      // 白俄羅斯盧布 (2000–2016)
      "BYR": [ "BYR", "BYR", 128, "BYR", "BYR"],
      // 貝里斯元
      "BZD": [ "BZD", "BZD", 2, "BZD", "$"],
      // 加幣
      "CAD": [ "CAD", "CA$", 2, "C$", "$"],
      // 剛果法郎
      "CDF": [ "CDF", "CDF", 2, "CDF", "FrCD"],
      // 歐元 (WIR)
      "CHE": [ "CHE", "CHE", 130, "CHE", "CHE"],
      // 智利埃斯庫多
      "CLE": [ "CLE", "CLE", 130, "CLE", "CLE"],
      // 卡林油達佛曼跎
      "CLF": [ "CLF", "CLF", 132, "CLF", "CLF"],
      // 智利披索
      "CLP": [ "CLP", "CL$", 0, "CL$", "$"],
      // 人民幣（離岸）
      "CNH": [ "CNH", "CNH", 130, "CNH", "CNH"],
      // 人民幣
      "CNY": [ "CNY", "CN¥", 2, "RMB¥", "¥"],
      // 哥倫比亞披索
      "COP": [ "COP", "COL$", 2, "COL$", "$"],
      // 哥倫比亞幣 (COU)
      "COU": [ "COU", "COU", 130, "COU", "COU"],
      // 哥斯大黎加科朗
      "CRC": [ "CRC", "CR₡", 2, "CR₡", "₡"],
      // 舊塞爾維亞第納爾
      "CSD": [ "CSD", "CSD", 130, "CSD", "CSD"],
      // 捷克斯洛伐克硬克朗
      "CSK": [ "CSK", "CSK", 130, "CSK", "CSK"],
      // 古巴可轉換披索
      "CUC": [ "CUC", "CUC", 2, "CUC", "$"],
      // 古巴披索
      "CUP": [ "CUP", "$MN", 2, "$MN", "$"],
      // 維德角埃斯庫多
      "CVE": [ "CVE", "CVE", 2, "CVE", "CVE"],
      // 賽普勒斯鎊
      "CYP": [ "CYP", "CYP", 130, "CYP", "CYP"],
      // 東德奧斯特馬克
      "DDM": [ "DDM", "DDM", 130, "DDM", "DDM"],
      // 德國馬克
      "DEM": [ "DEM", "DEM", 130, "DEM", "DEM"],
      // 吉布地法郎
      "DJF": [ "DJF", "Fdj", 0, "Fdj", "Fdj"],
      // 丹麥克朗
      "DKK": [ "DKK", "kr", 2, "kr", "kr"],
      // 多明尼加披索
      "DOP": [ "DOP", "RD$", 2, "RD$", "$"],
      // 阿爾及利亞第納爾
      "DZD": [ "DZD", "DZD", 2, "DZD", "din"],
      // 厄瓜多蘇克雷
      "ECS": [ "ECS", "ECS", 130, "ECS", "ECS"],
      // 厄瓜多爾由里達瓦康斯坦 (UVC)
      "ECV": [ "ECV", "ECV", 130, "ECV", "ECV"],
      // 愛沙尼亞克朗
      "EEK": [ "EEK", "EEK", 130, "EEK", "EEK"],
      // 埃及鎊
      "EGP": [ "EGP", "LE", 2, "LE", "E£"],
      // 厄立特里亞納克法
      "ERN": [ "ERN", "ERN", 2, "ERN", "Nfk"],
      // 西班牙比塞塔（會計單位）
      "ESA": [ "ESA", "ESA", 130, "ESA", "ESA"],
      // 西班牙比塞塔（可轉換會計單位）
      "ESB": [ "ESB", "ESB", 130, "ESB", "ESB"],
      // 西班牙陪士特
      "ESP": [ "ESP", "ESP", 128, "ESP", "ESP"],
      // 衣索比亞比爾
      "ETB": [ "ETB", "ETB", 2, "ETB", "Birr"],
      // 歐元
      "EUR": [ "EUR", "€", 2, "€", "€"],
      // 芬蘭馬克
      "FIM": [ "FIM", "FIM", 130, "FIM", "FIM"],
      // 斐濟元
      "FJD": [ "FJD", "FJD", 2, "FJD", "$"],
      // 福克蘭群島鎊
      "FKP": [ "FKP", "FKP", 2, "FKP", "£"],
      // 法國法郎
      "FRF": [ "FRF", "FRF", 130, "FRF", "FRF"],
      // 英鎊
      "GBP": [ "GBP", "£", 2, "GB£", "£"],
      // 喬治亞庫旁拉里
      "GEK": [ "GEK", "GEK", 130, "GEK", "GEK"],
      // 喬治亞拉里
      "GEL": [ "GEL", "₾", 2, "₾", "GEL"],
      // 迦納賽地 (1979–2007)
      "GHC": [ "GHC", "GHC", 130, "GHC", "GHC"],
      // 迦納塞地
      "GHS": [ "GHS", "GHS", 2, "GHS", "GHS"],
      // 直布羅陀鎊
      "GIP": [ "GIP", "GIP", 2, "GIP", "£"],
      // 甘比亞達拉西
      "GMD": [ "GMD", "GMD", 2, "GMD", "GMD"],
      // 幾內亞法郎
      "GNF": [ "GNF", "GNF", 0, "GNF", "FG"],
      // 幾內亞西里
      "GNS": [ "GNS", "GNS", 130, "GNS", "GNS"],
      // 赤道幾內亞埃奎勒
      "GQE": [ "GQE", "GQE", 130, "GQE", "GQE"],
      // 希臘德拉克馬
      "GRD": [ "GRD", "GRD", 130, "GRD", "GRD"],
      // 瓜地馬拉格查爾
      "GTQ": [ "GTQ", "GTQ", 2, "GTQ", "Q"],
      // 葡屬幾內亞埃斯庫多
      "GWE": [ "GWE", "GWE", 130, "GWE", "GWE"],
      // 幾內亞比索披索
      "GWP": [ "GWP", "GWP", 130, "GWP", "GWP"],
      // 圭亞那元
      "GYD": [ "GYD", "GYD", 2, "GYD", "$"],
      // 港幣
      "HKD": [ "HKD", "HK$", 2, "HK$", "$"],
      // 洪都拉斯倫皮拉
      "HNL": [ "HNL", "L", 2, "L", "L"],
      // 克羅埃西亞第納爾
      "HRD": [ "HRD", "HRD", 130, "HRD", "HRD"],
      // 克羅埃西亞庫納
      "HRK": [ "HRK", "HRK", 2, "HRK", "kn"],
      // 印尼盾
      "IDR": [ "IDR", "IDR", 2, "IDR", "Rp"],
      // 愛爾蘭鎊
      "IEP": [ "IEP", "IEP", 130, "IEP", "IEP"],
      // 以色列鎊
      "ILP": [ "ILP", "ILP", 130, "ILP", "ILP"],
      // 以色列謝克爾 (1980–1985)
      "ILR": [ "ILR", "ILR", 130, "ILR", "ILR"],
      // 以色列新謝克爾
      "ILS": [ "ILS", "₪", 2, "IL₪", "₪"],
      // 印度盧比
      "INR": [ "INR", "₹", 2, "Rs", "₹"],
      // 伊拉克第納爾
      "IQD": [ "IQD", "IQD", 0, "IQD", "din"],
      // 伊朗里亞爾
      "IRR": [ "IRR", "IRR", 0, "IRR", "Rial"],
      // 冰島克朗 (1918–1981)
      "ISJ": [ "ISJ", "ISJ", 130, "ISJ", "ISJ"],
      // 冰島克朗
      "ISK": [ "ISK", "kr", 0, "kr", "kr"],
      // 義大利里拉
      "ITL": [ "ITL", "ITL", 128, "ITL", "ITL"],
      // 牙買加元
      "JMD": [ "JMD", "JA$", 2, "JA$", "$"],
      // 約旦第納爾
      "JOD": [ "JOD", "JOD", 3, "JOD", "din"],
      // 日圓
      "JPY": [ "JPY", "¥", 0, "JP¥", "¥"],
      // 肯尼亞先令
      "KES": [ "KES", "Ksh", 2, "Ksh", "Ksh"],
      // 吉爾吉斯索姆
      "KGS": [ "KGS", "KGS", 2, "KGS", "KGS"],
      // 柬埔寨瑞爾
      "KHR": [ "KHR", "KHR", 2, "KHR", "Riel"],
      // 科摩羅法郎
      "KMF": [ "KMF", "KMF", 0, "KMF", "CF"],
      // 北韓元
      "KPW": [ "KPW", "KPW", 0, "KPW", "₩"],
      // 南韓圜
      "KRH": [ "KRH", "KRH", 130, "KRH", "KRH"],
      // 南韓圓
      "KRO": [ "KRO", "KRO", 130, "KRO", "KRO"],
      // 韓元
      "KRW": [ "KRW", "￦", 0, "KR₩", "₩"],
      // 科威特第納爾
      "KWD": [ "KWD", "KWD", 3, "KWD", "din"],
      // 開曼群島元
      "KYD": [ "KYD", "KYD", 2, "KYD", "$"],
      // 哈薩克堅戈
      "KZT": [ "KZT", "KZT", 2, "KZT", "₸"],
      // 寮國基普
      "LAK": [ "LAK", "LAK", 0, "LAK", "₭"],
      // 黎巴嫩鎊
      "LBP": [ "LBP", "LBP", 0, "LBP", "L£"],
      // 斯里蘭卡盧比
      "LKR": [ "LKR", "SLRs", 2, "SLRs", "Rs"],
      // 賴比瑞亞元
      "LRD": [ "LRD", "LRD", 2, "LRD", "$"],
      // 賴索托洛蒂
      "LSL": [ "LSL", "LSL", 2, "LSL", "LSL"],
      // 立陶宛特羅
      "LTT": [ "LTT", "LTT", 130, "LTT", "LTT"],
      // 盧森堡可兌換法郎
      "LUC": [ "LUC", "LUC", 130, "LUC", "LUC"],
      // 盧森堡法郎
      "LUF": [ "LUF", "LUF", 128, "LUF", "LUF"],
      // 盧森堡金融法郎
      "LUL": [ "LUL", "LUL", 130, "LUL", "LUL"],
      // 拉脫維亞拉特銀幣
      "LVL": [ "LVL", "LVL", 130, "LVL", "Ls"],
      // 拉脫維亞盧布
      "LVR": [ "LVR", "LVR", 130, "LVR", "LVR"],
      // 利比亞第納爾
      "LYD": [ "LYD", "LYD", 3, "LYD", "din"],
      // 摩納哥法郎
      "MCF": [ "MCF", "MCF", 130, "MCF", "MCF"],
      // 摩爾多瓦券
      "MDC": [ "MDC", "MDC", 130, "MDC", "MDC"],
      // 摩杜雲列伊
      "MDL": [ "MDL", "MDL", 2, "MDL", "MDL"],
      // 馬達加斯加阿里亞里
      "MGA": [ "MGA", "MGA", 0, "MGA", "Ar"],
      // 馬達加斯加法郎
      "MGF": [ "MGF", "MGF", 128, "MGF", "MGF"],
      // 馬其頓第納爾
      "MKD": [ "MKD", "MKD", 2, "MKD", "din"],
      // 馬其頓第納爾 (1992–1993)
      "MKN": [ "MKN", "MKN", 130, "MKN", "MKN"],
      // 馬里法郎
      "MLF": [ "MLF", "MLF", 130, "MLF", "MLF"],
      // 緬甸元
      "MMK": [ "MMK", "MMK", 0, "MMK", "K"],
      // 蒙古圖格里克
      "MNT": [ "MNT", "MN₮", 2, "MN₮", "₮"],
      // 澳門元
      "MOP": [ "MOP", "MOP", 2, "MOP", "MOP"],
      // 茅利塔尼亞烏吉亞 (1973–2017)
      "MRO": [ "MRO", "MRO", 128, "MRO", "MRO"],
      // 茅利塔尼亞烏吉亞
      "MRU": [ "MRU", "MRU", 2, "MRU", "MRU"],
      // 馬爾他里拉
      "MTL": [ "MTL", "MTL", 130, "MTL", "MTL"],
      // 馬爾他鎊
      "MTP": [ "MTP", "MTP", 130, "MTP", "MTP"],
      // 模里西斯盧比
      "MUR": [ "MUR", "MUR", 2, "MUR", "Rs"],
      // 馬爾地夫盧比
      "MVP": [ "MVP", "MVP", 130, "MVP", "MVP"],
      // 馬爾地夫盧非亞
      "MVR": [ "MVR", "MVR", 2, "MVR", "MVR"],
      // 馬拉維克瓦查
      "MWK": [ "MWK", "MWK", 2, "MWK", "MWK"],
      // 墨西哥披索
      "MXN": [ "MXN", "MX$", 2, "Mex$", "$"],
      // 墨西哥銀披索 (1861–1992)
      "MXP": [ "MXP", "MXP", 130, "MXP", "MXP"],
      // 墨西哥轉換單位 (UDI)
      "MXV": [ "MXV", "MXV", 130, "MXV", "MXV"],
      // 馬來西亞令吉
      "MYR": [ "MYR", "RM", 2, "RM", "RM"],
      // 莫三比克埃斯庫多
      "MZE": [ "MZE", "MZE", 130, "MZE", "MZE"],
      // 莫三比克梅蒂卡爾 (1980–2006)
      "MZM": [ "MZM", "MZM", 130, "MZM", "MZM"],
      // 莫三比克梅蒂卡爾
      "MZN": [ "MZN", "MZN", 2, "MZN", "MTn"],
      // 納米比亞元
      "NAD": [ "NAD", "NAD", 2, "NAD", "$"],
      // 奈及利亞奈拉
      "NGN": [ "NGN", "NGN", 2, "NGN", "₦"],
      // 尼加拉瓜科多巴
      "NIC": [ "NIC", "NIC", 130, "NIC", "NIC"],
      // 尼加拉瓜金科多巴
      "NIO": [ "NIO", "NIO", 2, "NIO", "C$"],
      // 荷蘭盾
      "NLG": [ "NLG", "NLG", 130, "NLG", "NLG"],
      // 尼泊爾盧比
      "NPR": [ "NPR", "NPR", 2, "NPR", "Rs"],
      // 紐西蘭幣
      "NZD": [ "NZD", "NZ$", 2, "NZ$", "$"],
      // 阿曼里亞爾
      "OMR": [ "OMR", "OMR", 3, "OMR", "Rial"],
      // 巴拿馬巴波亞
      "PAB": [ "PAB", "B/.", 2, "B/.", "B/."],
      // 祕魯因蒂
      "PEI": [ "PEI", "PEI", 130, "PEI", "PEI"],
      // 秘魯太陽幣
      "PEN": [ "PEN", "S/.", 2, "S/.", "S/."],
      // 秘魯太陽幣 (1863–1965)
      "PES": [ "PES", "PES", 130, "PES", "PES"],
      // 巴布亞紐幾內亞基那
      "PGK": [ "PGK", "PGK", 2, "PGK", "PGK"],
      // 菲律賓披索
      "PHP": [ "PHP", "PHP", 2, "PHP", "₱"],
      // 巴基斯坦盧比
      "PKR": [ "PKR", "PKRs.", 2, "PKRs.", "Rs"],
      // 波蘭茲羅提
      "PLN": [ "PLN", "PLN", 2, "PLN", "zł"],
      // 波蘭茲羅提 (1950–1995)
      "PLZ": [ "PLZ", "PLZ", 130, "PLZ", "PLZ"],
      // 葡萄牙埃斯庫多
      "PTE": [ "PTE", "PTE", 130, "PTE", "PTE"],
      // 卡達里亞爾
      "QAR": [ "QAR", "QAR", 2, "QAR", "Rial"],
      // 羅德西亞元
      "RHD": [ "RHD", "RHD", 130, "RHD", "RHD"],
      // 舊羅馬尼亞列伊
      "ROL": [ "ROL", "ROL", 130, "ROL", "ROL"],
      // 羅馬尼亞列伊
      "RON": [ "RON", "RON", 2, "RON", "RON"],
      // 塞爾維亞戴納
      "RSD": [ "RSD", "RSD", 0, "RSD", "din"],
      // 俄羅斯盧布
      "RUB": [ "RUB", "руб.", 2, "руб.", "руб."],
      // 俄羅斯盧布 (1991–1998)
      "RUR": [ "RUR", "RUR", 130, "RUR", "RUR"],
      // 盧安達法郎
      "RWF": [ "RWF", "RWF", 0, "RWF", "RF"],
      // 沙烏地里亞爾
      "SAR": [ "SAR", "SR", 2, "SR", "Rial"],
      // 索羅門群島元
      "SBD": [ "SBD", "SBD", 2, "SBD", "$"],
      // 塞席爾盧比
      "SCR": [ "SCR", "SCR", 2, "SCR", "SCR"],
      // 蘇丹第納爾
      "SDD": [ "SDD", "SDD", 130, "SDD", "SDD"],
      // 蘇丹鎊
      "SDG": [ "SDG", "SDG", 2, "SDG", "SDG"],
      // 舊蘇丹鎊
      "SDP": [ "SDP", "SDP", 130, "SDP", "SDP"],
      // 新加坡幣
      "SGD": [ "SGD", "S$", 2, "S$", "$"],
      // 聖赫勒拿鎊
      "SHP": [ "SHP", "SHP", 2, "SHP", "£"],
      // 斯洛維尼亞托勒
      "SIT": [ "SIT", "SIT", 130, "SIT", "SIT"],
      // 獅子山利昂
      "SLL": [ "SLL", "SLL", 0, "SLL", "SLL"],
      // 索馬利亞先令
      "SOS": [ "SOS", "SOS", 0, "SOS", "SOS"],
      // 蘇利南元
      "SRD": [ "SRD", "SRD", 2, "SRD", "$"],
      // 蘇利南基爾
      "SRG": [ "SRG", "SRG", 130, "SRG", "SRG"],
      // 南蘇丹鎊
      "SSP": [ "SSP", "SSP", 2, "SSP", "SSP"],
      // 聖多美島和普林西比島多布拉 (1977–2017)
      "STD": [ "STD", "STD", 128, "STD", "Db"],
      // 聖多美島和普林西比島多布拉
      "STN": [ "STN", "STN", 2, "STN", "STN"],
      // 蘇聯盧布
      "SUR": [ "SUR", "SUR", 130, "SUR", "SUR"],
      // 薩爾瓦多科郎
      "SVC": [ "SVC", "SVC", 130, "SVC", "SVC"],
      // 敘利亞鎊
      "SYP": [ "SYP", "SYP", 0, "SYP", "£"],
      // 史瓦濟蘭里朗吉尼
      "SZL": [ "SZL", "SZL", 2, "SZL", "SZL"],
      // 泰銖
      "THB": [ "THB", "THB", 2, "THB", "฿"],
      // 塔吉克盧布
      "TJR": [ "TJR", "TJR", 130, "TJR", "TJR"],
      // 塔吉克索莫尼
      "TJS": [ "TJS", "TJS", 2, "TJS", "Som"],
      // 土庫曼馬納特 (1993–2009)
      "TMM": [ "TMM", "TMM", 128, "TMM", "TMM"],
      // 土庫曼馬納特
      "TMT": [ "TMT", "TMT", 2, "TMT", "TMT"],
      // 突尼西亞第納爾
      "TND": [ "TND", "TND", 3, "TND", "din"],
      // 東加潘加
      "TOP": [ "TOP", "TOP", 2, "TOP", "T$"],
      // 帝汶埃斯庫多
      "TPE": [ "TPE", "TPE", 130, "TPE", "TPE"],
      // 土耳其里拉
      "TRL": [ "TRL", "TRL", 128, "TRL", "TRL"],
      // 新土耳其里拉
      "TRY": [ "TRY", "TL", 2, "YTL", "TL"],
      // 千里達及托巴哥元
      "TTD": [ "TTD", "TTD", 2, "TTD", "$"],
      // 新台幣
      "TWD": [ "TWD", "$", 2, "NT$", "NT$"],
      // 坦尚尼亞先令
      "TZS": [ "TZS", "TZS", 2, "TZS", "TSh"],
      // 烏克蘭格里夫納
      "UAH": [ "UAH", "UAH", 2, "UAH", "₴"],
      // 烏克蘭卡本瓦那茲
      "UAK": [ "UAK", "UAK", 130, "UAK", "UAK"],
      // 烏干達先令 (1966–1987)
      "UGS": [ "UGS", "UGS", 130, "UGS", "UGS"],
      // 烏干達先令
      "UGX": [ "UGX", "UGX", 0, "UGX", "UGX"],
      // 美元（當日）
      "USS": [ "USS", "USS", 130, "USS", "USS"],
      // 烏拉圭披索（指數單位）
      "UYI": [ "UYI", "UYI", 128, "UYI", "UYI"],
      // 烏拉圭披索 (1975–1993)
      "UYP": [ "UYP", "UYP", 130, "UYP", "UYP"],
      // 烏拉圭披索
      "UYU": [ "UYU", "UY$", 2, "UY$", "$"],
      // 烏茲別克索姆
      "UZS": [ "UZS", "UZS", 2, "UZS", "soʼm"],
      // 委內瑞拉玻利瓦 (1871–2008)
      "VEB": [ "VEB", "VEB", 130, "VEB", "VEB"],
      // 委內瑞拉玻利瓦 (2008–2018)
      "VEF": [ "VEF", "VEF", 130, "VEF", "Bs"],
      // 委內瑞拉玻利瓦
      "VES": [ "VES", "VES", 2, "VES", "VES"],
      // 萬那杜瓦圖
      "VUV": [ "VUV", "VUV", 0, "VUV", "VUV"],
      // 西薩摩亞塔拉
      "WST": [ "WST", "WST", 2, "WST", "WST"],
      // 法郎 (CFA–BEAC)
      "XAF": [ "XAF", "FCFA", 0, "FCFA", "FCFA"],
      // 白銀
      "XAG": [ "XAG", "XAG", 130, "XAG", "XAG"],
      // 黃金
      "XAU": [ "XAU", "XAU", 130, "XAU", "XAU"],
      // 歐洲綜合單位
      "XBA": [ "XBA", "XBA", 130, "XBA", "XBA"],
      // 歐洲貨幣單位 (XBB)
      "XBB": [ "XBB", "XBB", 130, "XBB", "XBB"],
      // 歐洲會計單位 (XBC)
      "XBC": [ "XBC", "XBC", 130, "XBC", "XBC"],
      // 歐洲會計單位 (XBD)
      "XBD": [ "XBD", "XBD", 130, "XBD", "XBD"],
      // 格瑞那達元
      "XCD": [ "XCD", "EC$", 2, "EC$", "$"],
      // 特殊提款權
      "XDR": [ "XDR", "XDR", 130, "XDR", "XDR"],
      // 歐洲貨幣單位 (XEU)
      "XEU": [ "XEU", "XEU", 130, "XEU", "XEU"],
      // 法國金法郎
      "XFO": [ "XFO", "XFO", 130, "XFO", "XFO"],
      // 法國法郎 (UIC)
      "XFU": [ "XFU", "XFU", 130, "XFU", "XFU"],
      // 法郎 (CFA–BCEAO)
      "XOF": [ "XOF", "CFA", 0, "CFA", "CFA"],
      // 帕拉狄昂
      "XPD": [ "XPD", "XPD", 130, "XPD", "XPD"],
      // 法郎 (CFP)
      "XPF": [ "XPF", "CFPF", 0, "CFPF", "FCFP"],
      // 白金
      "XPT": [ "XPT", "XPT", 130, "XPT", "XPT"],
      // 蘇克雷貨幣
      "XSU": [ "XSU", "XSU", 130, "XSU", "XSU"],
      // 測試用貨幣代碼
      "XTS": [ "XTS", "XTS", 130, "XTS", "XTS"],
      // 亞洲開發銀行計價單位
      "XUA": [ "XUA", "XUA", 130, "XUA", "XUA"],
      // 未知貨幣
      "XXX": [ "XXX", "XXX", 130, "XXX", "XXX"],
      // 葉門第納爾
      "YDD": [ "YDD", "YDD", 130, "YDD", "YDD"],
      // 葉門里亞爾
      "YER": [ "YER", "YER", 0, "YER", "Rial"],
      // 南斯拉夫第納爾硬幣
      "YUD": [ "YUD", "YUD", 130, "YUD", "YUD"],
      // 南斯拉夫挪威亞第納爾
      "YUM": [ "YUM", "YUM", 130, "YUM", "YUM"],
      // 南斯拉夫可轉換第納爾
      "YUN": [ "YUN", "YUN", 130, "YUN", "YUN"],
      // 南斯拉夫改革第納爾 (1992–1993)
      "YUR": [ "YUR", "YUR", 130, "YUR", "YUR"],
      // 南非蘭特（金融）
      "ZAL": [ "ZAL", "ZAL", 130, "ZAL", "ZAL"],
      // 南非蘭特
      "ZAR": [ "ZAR", "ZAR", 2, "ZAR", "R"],
      // 尚比亞克瓦查 (1968–2012)
      "ZMK": [ "ZMK", "ZMK", 128, "ZMK", "ZWK"],
      // 尚比亞克瓦查
      "ZMW": [ "ZMW", "ZMW", 2, "ZMW", "ZMW"],
      // 薩伊新扎伊爾
      "ZRN": [ "ZRN", "ZRN", 130, "ZRN", "ZRN"],
      // 薩伊扎伊爾
      "ZRZ": [ "ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"],
      // 辛巴威元 (1980–2008)
      "ZWD": [ "ZWD", "ZWD", 128, "ZWD", "ZWD"],
      // 辛巴威元 (2009)
      "ZWL": [ "ZWL", "ZWL", 130, "ZWL", "ZWL"],
      // 辛巴威元 (2008)
      "ZWR": [ "ZWR", "ZWR", 130, "ZWR", "ZWR"],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("ADP", "安道爾陪士特");
    result.put("AED", "阿拉伯聯合大公國迪爾汗");
    result.put("ALK", "阿爾巴尼亞列克 (1946–1965)");
    result.put("ALL", "阿爾巴尼亞列克");
    result.put("AMD", "亞美尼亞德拉姆");
    result.put("ANG", "荷屬安地列斯盾");
    result.put("AOA", "安哥拉寬扎");
    result.put("AOK", "安哥拉寬扎 (1977–1990)");
    result.put("AON", "安哥拉新寬扎 (1990–2000)");
    result.put("AOR", "安哥拉新調寬扎 (1995–1999)");
    result.put("ARA", "阿根廷奧斯特納爾");
    result.put("ARL", "阿根廷披索 (1970–1983)");
    result.put("ARM", "阿根廷披索 (1881–1970)");
    result.put("ARP", "阿根廷披索 (1983–1985)");
    result.put("ARS", "阿根廷披索");
    result.put("ATS", "奧地利先令");
    result.put("AUD", "澳幣");
    result.put("AWG", "阿路巴盾");
    result.put("AZM", "亞塞拜然馬納特 (1993–2006)");
    result.put("AZN", "亞塞拜然馬納特");
    result.put("BAD", "波士尼亞-赫塞哥維納第納爾");
    result.put("BAM", "波士尼亞-赫塞哥維納可轉換馬克");
    result.put("BAN", "波士尼亞-赫塞哥維納新第納爾");
    result.put("BBD", "巴貝多元");
    result.put("BEC", "比利時法郎（可轉換）");
    result.put("BEF", "比利時法郎");
    result.put("BEL", "比利時法郎（金融）");
    result.put("BGL", "保加利亞硬列弗");
    result.put("BGM", "保加利亞社會黨列弗");
    result.put("BGN", "保加利亞新列弗");
    result.put("BGO", "保加利亞列弗 (1879–1952)");
    result.put("BHD", "巴林第納爾");
    result.put("BIF", "蒲隆地法郎");
    result.put("BMD", "百慕達幣");
    result.put("BND", "汶萊元");
    result.put("BOB", "玻利維亞諾");
    result.put("BOL", "玻利維亞玻利維亞諾 (1863–1963)");
    result.put("BOP", "玻利維亞披索");
    result.put("BOV", "玻利維亞幕多");
    result.put("BRB", "巴西克魯薩多農瓦 (1967–1986)");
    result.put("BRC", "巴西克魯賽羅 (1986–1989)");
    result.put("BRE", "巴西克魯賽羅 (1990–1993)");
    result.put("BRL", "巴西里拉");
    result.put("BRN", "巴西克如爾達農瓦");
    result.put("BRR", "巴西克魯賽羅 (1993–1994)");
    result.put("BRZ", "巴西克魯賽羅 (1942 –1967)");
    result.put("BSD", "巴哈馬元");
    result.put("BTN", "不丹那特倫");
    result.put("BUK", "緬甸基雅特");
    result.put("BWP", "波札那普拉");
    result.put("BYB", "白俄羅斯新盧布 (1994–1999)");
    result.put("BYN", "白俄羅斯盧布");
    result.put("BYR", "白俄羅斯盧布 (2000–2016)");
    result.put("BZD", "貝里斯元");
    result.put("CAD", "加幣");
    result.put("CDF", "剛果法郎");
    result.put("CHE", "歐元 (WIR)");
    result.put("CLE", "智利埃斯庫多");
    result.put("CLF", "卡林油達佛曼跎");
    result.put("CLP", "智利披索");
    result.put("CNH", "人民幣（離岸）");
    result.put("CNY", "人民幣");
    result.put("COP", "哥倫比亞披索");
    result.put("COU", "哥倫比亞幣 (COU)");
    result.put("CRC", "哥斯大黎加科朗");
    result.put("CSD", "舊塞爾維亞第納爾");
    result.put("CSK", "捷克斯洛伐克硬克朗");
    result.put("CUC", "古巴可轉換披索");
    result.put("CUP", "古巴披索");
    result.put("CVE", "維德角埃斯庫多");
    result.put("CYP", "賽普勒斯鎊");
    result.put("DDM", "東德奧斯特馬克");
    result.put("DEM", "德國馬克");
    result.put("DJF", "吉布地法郎");
    result.put("DKK", "丹麥克朗");
    result.put("DOP", "多明尼加披索");
    result.put("DZD", "阿爾及利亞第納爾");
    result.put("ECS", "厄瓜多蘇克雷");
    result.put("ECV", "厄瓜多爾由里達瓦康斯坦 (UVC)");
    result.put("EEK", "愛沙尼亞克朗");
    result.put("EGP", "埃及鎊");
    result.put("ERN", "厄立特里亞納克法");
    result.put("ESA", "西班牙比塞塔（會計單位）");
    result.put("ESB", "西班牙比塞塔（可轉換會計單位）");
    result.put("ESP", "西班牙陪士特");
    result.put("ETB", "衣索比亞比爾");
    result.put("EUR", "歐元");
    result.put("FIM", "芬蘭馬克");
    result.put("FJD", "斐濟元");
    result.put("FKP", "福克蘭群島鎊");
    result.put("FRF", "法國法郎");
    result.put("GBP", "英鎊");
    result.put("GEK", "喬治亞庫旁拉里");
    result.put("GEL", "喬治亞拉里");
    result.put("GHC", "迦納賽地 (1979–2007)");
    result.put("GHS", "迦納塞地");
    result.put("GIP", "直布羅陀鎊");
    result.put("GMD", "甘比亞達拉西");
    result.put("GNF", "幾內亞法郎");
    result.put("GNS", "幾內亞西里");
    result.put("GQE", "赤道幾內亞埃奎勒");
    result.put("GRD", "希臘德拉克馬");
    result.put("GTQ", "瓜地馬拉格查爾");
    result.put("GWE", "葡屬幾內亞埃斯庫多");
    result.put("GWP", "幾內亞比索披索");
    result.put("GYD", "圭亞那元");
    result.put("HKD", "港幣");
    result.put("HNL", "洪都拉斯倫皮拉");
    result.put("HRD", "克羅埃西亞第納爾");
    result.put("HRK", "克羅埃西亞庫納");
    result.put("IDR", "印尼盾");
    result.put("IEP", "愛爾蘭鎊");
    result.put("ILP", "以色列鎊");
    result.put("ILR", "以色列謝克爾 (1980–1985)");
    result.put("ILS", "以色列新謝克爾");
    result.put("INR", "印度盧比");
    result.put("IQD", "伊拉克第納爾");
    result.put("IRR", "伊朗里亞爾");
    result.put("ISJ", "冰島克朗 (1918–1981)");
    result.put("ISK", "冰島克朗");
    result.put("ITL", "義大利里拉");
    result.put("JMD", "牙買加元");
    result.put("JOD", "約旦第納爾");
    result.put("JPY", "日圓");
    result.put("KES", "肯尼亞先令");
    result.put("KGS", "吉爾吉斯索姆");
    result.put("KHR", "柬埔寨瑞爾");
    result.put("KMF", "科摩羅法郎");
    result.put("KPW", "北韓元");
    result.put("KRH", "南韓圜");
    result.put("KRO", "南韓圓");
    result.put("KRW", "韓元");
    result.put("KWD", "科威特第納爾");
    result.put("KYD", "開曼群島元");
    result.put("KZT", "哈薩克堅戈");
    result.put("LAK", "寮國基普");
    result.put("LBP", "黎巴嫩鎊");
    result.put("LKR", "斯里蘭卡盧比");
    result.put("LRD", "賴比瑞亞元");
    result.put("LSL", "賴索托洛蒂");
    result.put("LTT", "立陶宛特羅");
    result.put("LUC", "盧森堡可兌換法郎");
    result.put("LUF", "盧森堡法郎");
    result.put("LUL", "盧森堡金融法郎");
    result.put("LVL", "拉脫維亞拉特銀幣");
    result.put("LVR", "拉脫維亞盧布");
    result.put("LYD", "利比亞第納爾");
    result.put("MCF", "摩納哥法郎");
    result.put("MDC", "摩爾多瓦券");
    result.put("MDL", "摩杜雲列伊");
    result.put("MGA", "馬達加斯加阿里亞里");
    result.put("MGF", "馬達加斯加法郎");
    result.put("MKD", "馬其頓第納爾");
    result.put("MKN", "馬其頓第納爾 (1992–1993)");
    result.put("MLF", "馬里法郎");
    result.put("MMK", "緬甸元");
    result.put("MNT", "蒙古圖格里克");
    result.put("MOP", "澳門元");
    result.put("MRO", "茅利塔尼亞烏吉亞 (1973–2017)");
    result.put("MRU", "茅利塔尼亞烏吉亞");
    result.put("MTL", "馬爾他里拉");
    result.put("MTP", "馬爾他鎊");
    result.put("MUR", "模里西斯盧比");
    result.put("MVP", "馬爾地夫盧比");
    result.put("MVR", "馬爾地夫盧非亞");
    result.put("MWK", "馬拉維克瓦查");
    result.put("MXN", "墨西哥披索");
    result.put("MXP", "墨西哥銀披索 (1861–1992)");
    result.put("MXV", "墨西哥轉換單位 (UDI)");
    result.put("MYR", "馬來西亞令吉");
    result.put("MZE", "莫三比克埃斯庫多");
    result.put("MZM", "莫三比克梅蒂卡爾 (1980–2006)");
    result.put("MZN", "莫三比克梅蒂卡爾");
    result.put("NAD", "納米比亞元");
    result.put("NGN", "奈及利亞奈拉");
    result.put("NIC", "尼加拉瓜科多巴");
    result.put("NIO", "尼加拉瓜金科多巴");
    result.put("NLG", "荷蘭盾");
    result.put("NPR", "尼泊爾盧比");
    result.put("NZD", "紐西蘭幣");
    result.put("OMR", "阿曼里亞爾");
    result.put("PAB", "巴拿馬巴波亞");
    result.put("PEI", "祕魯因蒂");
    result.put("PEN", "秘魯太陽幣");
    result.put("PES", "秘魯太陽幣 (1863–1965)");
    result.put("PGK", "巴布亞紐幾內亞基那");
    result.put("PHP", "菲律賓披索");
    result.put("PKR", "巴基斯坦盧比");
    result.put("PLN", "波蘭茲羅提");
    result.put("PLZ", "波蘭茲羅提 (1950–1995)");
    result.put("PTE", "葡萄牙埃斯庫多");
    result.put("QAR", "卡達里亞爾");
    result.put("RHD", "羅德西亞元");
    result.put("ROL", "舊羅馬尼亞列伊");
    result.put("RON", "羅馬尼亞列伊");
    result.put("RSD", "塞爾維亞戴納");
    result.put("RUB", "俄羅斯盧布");
    result.put("RUR", "俄羅斯盧布 (1991–1998)");
    result.put("RWF", "盧安達法郎");
    result.put("SAR", "沙烏地里亞爾");
    result.put("SBD", "索羅門群島元");
    result.put("SCR", "塞席爾盧比");
    result.put("SDD", "蘇丹第納爾");
    result.put("SDG", "蘇丹鎊");
    result.put("SDP", "舊蘇丹鎊");
    result.put("SGD", "新加坡幣");
    result.put("SHP", "聖赫勒拿鎊");
    result.put("SIT", "斯洛維尼亞托勒");
    result.put("SLL", "獅子山利昂");
    result.put("SOS", "索馬利亞先令");
    result.put("SRD", "蘇利南元");
    result.put("SRG", "蘇利南基爾");
    result.put("SSP", "南蘇丹鎊");
    result.put("STD", "聖多美島和普林西比島多布拉 (1977–2017)");
    result.put("STN", "聖多美島和普林西比島多布拉");
    result.put("SUR", "蘇聯盧布");
    result.put("SVC", "薩爾瓦多科郎");
    result.put("SYP", "敘利亞鎊");
    result.put("SZL", "史瓦濟蘭里朗吉尼");
    result.put("THB", "泰銖");
    result.put("TJR", "塔吉克盧布");
    result.put("TJS", "塔吉克索莫尼");
    result.put("TMM", "土庫曼馬納特 (1993–2009)");
    result.put("TMT", "土庫曼馬納特");
    result.put("TND", "突尼西亞第納爾");
    result.put("TOP", "東加潘加");
    result.put("TPE", "帝汶埃斯庫多");
    result.put("TRL", "土耳其里拉");
    result.put("TRY", "新土耳其里拉");
    result.put("TTD", "千里達及托巴哥元");
    result.put("TWD", "新台幣");
    result.put("TZS", "坦尚尼亞先令");
    result.put("UAH", "烏克蘭格里夫納");
    result.put("UAK", "烏克蘭卡本瓦那茲");
    result.put("UGS", "烏干達先令 (1966–1987)");
    result.put("UGX", "烏干達先令");
    result.put("USS", "美元（當日）");
    result.put("UYI", "烏拉圭披索（指數單位）");
    result.put("UYP", "烏拉圭披索 (1975–1993)");
    result.put("UYU", "烏拉圭披索");
    result.put("UZS", "烏茲別克索姆");
    result.put("VEB", "委內瑞拉玻利瓦 (1871–2008)");
    result.put("VEF", "委內瑞拉玻利瓦 (2008–2018)");
    result.put("VES", "委內瑞拉玻利瓦");
    result.put("VUV", "萬那杜瓦圖");
    result.put("WST", "西薩摩亞塔拉");
    result.put("XAF", "法郎 (CFA–BEAC)");
    result.put("XAG", "白銀");
    result.put("XAU", "黃金");
    result.put("XBA", "歐洲綜合單位");
    result.put("XBB", "歐洲貨幣單位 (XBB)");
    result.put("XBC", "歐洲會計單位 (XBC)");
    result.put("XBD", "歐洲會計單位 (XBD)");
    result.put("XCD", "格瑞那達元");
    result.put("XDR", "特殊提款權");
    result.put("XEU", "歐洲貨幣單位 (XEU)");
    result.put("XFO", "法國金法郎");
    result.put("XFU", "法國法郎 (UIC)");
    result.put("XOF", "法郎 (CFA–BCEAO)");
    result.put("XPD", "帕拉狄昂");
    result.put("XPF", "法郎 (CFP)");
    result.put("XPT", "白金");
    result.put("XSU", "蘇克雷貨幣");
    result.put("XTS", "測試用貨幣代碼");
    result.put("XUA", "亞洲開發銀行計價單位");
    result.put("XXX", "未知貨幣");
    result.put("YDD", "葉門第納爾");
    result.put("YER", "葉門里亞爾");
    result.put("YUD", "南斯拉夫第納爾硬幣");
    result.put("YUM", "南斯拉夫挪威亞第納爾");
    result.put("YUN", "南斯拉夫可轉換第納爾");
    result.put("YUR", "南斯拉夫改革第納爾 (1992–1993)");
    result.put("ZAL", "南非蘭特（金融）");
    result.put("ZAR", "南非蘭特");
    result.put("ZMK", "尚比亞克瓦查 (1968–2012)");
    result.put("ZMW", "尚比亞克瓦查");
    result.put("ZRN", "薩伊新扎伊爾");
    result.put("ZRZ", "薩伊扎伊爾");
    result.put("ZWD", "辛巴威元 (1980–2008)");
    result.put("ZWL", "辛巴威元 (2009)");
    result.put("ZWR", "辛巴威元 (2008)");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "ADP": "安道爾陪士特",
      "AED": "阿拉伯聯合大公國迪爾汗",
      "ALK": "阿爾巴尼亞列克 (1946–1965)",
      "ALL": "阿爾巴尼亞列克",
      "AMD": "亞美尼亞德拉姆",
      "ANG": "荷屬安地列斯盾",
      "AOA": "安哥拉寬扎",
      "AOK": "安哥拉寬扎 (1977–1990)",
      "AON": "安哥拉新寬扎 (1990–2000)",
      "AOR": "安哥拉新調寬扎 (1995–1999)",
      "ARA": "阿根廷奧斯特納爾",
      "ARL": "阿根廷披索 (1970–1983)",
      "ARM": "阿根廷披索 (1881–1970)",
      "ARP": "阿根廷披索 (1983–1985)",
      "ARS": "阿根廷披索",
      "ATS": "奧地利先令",
      "AUD": "澳幣",
      "AWG": "阿路巴盾",
      "AZM": "亞塞拜然馬納特 (1993–2006)",
      "AZN": "亞塞拜然馬納特",
      "BAD": "波士尼亞-赫塞哥維納第納爾",
      "BAM": "波士尼亞-赫塞哥維納可轉換馬克",
      "BAN": "波士尼亞-赫塞哥維納新第納爾",
      "BBD": "巴貝多元",
      "BEC": "比利時法郎（可轉換）",
      "BEF": "比利時法郎",
      "BEL": "比利時法郎（金融）",
      "BGL": "保加利亞硬列弗",
      "BGM": "保加利亞社會黨列弗",
      "BGN": "保加利亞新列弗",
      "BGO": "保加利亞列弗 (1879–1952)",
      "BHD": "巴林第納爾",
      "BIF": "蒲隆地法郎",
      "BMD": "百慕達幣",
      "BND": "汶萊元",
      "BOB": "玻利維亞諾",
      "BOL": "玻利維亞玻利維亞諾 (1863–1963)",
      "BOP": "玻利維亞披索",
      "BOV": "玻利維亞幕多",
      "BRB": "巴西克魯薩多農瓦 (1967–1986)",
      "BRC": "巴西克魯賽羅 (1986–1989)",
      "BRE": "巴西克魯賽羅 (1990–1993)",
      "BRL": "巴西里拉",
      "BRN": "巴西克如爾達農瓦",
      "BRR": "巴西克魯賽羅 (1993–1994)",
      "BRZ": "巴西克魯賽羅 (1942 –1967)",
      "BSD": "巴哈馬元",
      "BTN": "不丹那特倫",
      "BUK": "緬甸基雅特",
      "BWP": "波札那普拉",
      "BYB": "白俄羅斯新盧布 (1994–1999)",
      "BYN": "白俄羅斯盧布",
      "BYR": "白俄羅斯盧布 (2000–2016)",
      "BZD": "貝里斯元",
      "CAD": "加幣",
      "CDF": "剛果法郎",
      "CHE": "歐元 (WIR)",
      "CLE": "智利埃斯庫多",
      "CLF": "卡林油達佛曼跎",
      "CLP": "智利披索",
      "CNH": "人民幣（離岸）",
      "CNY": "人民幣",
      "COP": "哥倫比亞披索",
      "COU": "哥倫比亞幣 (COU)",
      "CRC": "哥斯大黎加科朗",
      "CSD": "舊塞爾維亞第納爾",
      "CSK": "捷克斯洛伐克硬克朗",
      "CUC": "古巴可轉換披索",
      "CUP": "古巴披索",
      "CVE": "維德角埃斯庫多",
      "CYP": "賽普勒斯鎊",
      "DDM": "東德奧斯特馬克",
      "DEM": "德國馬克",
      "DJF": "吉布地法郎",
      "DKK": "丹麥克朗",
      "DOP": "多明尼加披索",
      "DZD": "阿爾及利亞第納爾",
      "ECS": "厄瓜多蘇克雷",
      "ECV": "厄瓜多爾由里達瓦康斯坦 (UVC)",
      "EEK": "愛沙尼亞克朗",
      "EGP": "埃及鎊",
      "ERN": "厄立特里亞納克法",
      "ESA": "西班牙比塞塔（會計單位）",
      "ESB": "西班牙比塞塔（可轉換會計單位）",
      "ESP": "西班牙陪士特",
      "ETB": "衣索比亞比爾",
      "EUR": "歐元",
      "FIM": "芬蘭馬克",
      "FJD": "斐濟元",
      "FKP": "福克蘭群島鎊",
      "FRF": "法國法郎",
      "GBP": "英鎊",
      "GEK": "喬治亞庫旁拉里",
      "GEL": "喬治亞拉里",
      "GHC": "迦納賽地 (1979–2007)",
      "GHS": "迦納塞地",
      "GIP": "直布羅陀鎊",
      "GMD": "甘比亞達拉西",
      "GNF": "幾內亞法郎",
      "GNS": "幾內亞西里",
      "GQE": "赤道幾內亞埃奎勒",
      "GRD": "希臘德拉克馬",
      "GTQ": "瓜地馬拉格查爾",
      "GWE": "葡屬幾內亞埃斯庫多",
      "GWP": "幾內亞比索披索",
      "GYD": "圭亞那元",
      "HKD": "港幣",
      "HNL": "洪都拉斯倫皮拉",
      "HRD": "克羅埃西亞第納爾",
      "HRK": "克羅埃西亞庫納",
      "IDR": "印尼盾",
      "IEP": "愛爾蘭鎊",
      "ILP": "以色列鎊",
      "ILR": "以色列謝克爾 (1980–1985)",
      "ILS": "以色列新謝克爾",
      "INR": "印度盧比",
      "IQD": "伊拉克第納爾",
      "IRR": "伊朗里亞爾",
      "ISJ": "冰島克朗 (1918–1981)",
      "ISK": "冰島克朗",
      "ITL": "義大利里拉",
      "JMD": "牙買加元",
      "JOD": "約旦第納爾",
      "JPY": "日圓",
      "KES": "肯尼亞先令",
      "KGS": "吉爾吉斯索姆",
      "KHR": "柬埔寨瑞爾",
      "KMF": "科摩羅法郎",
      "KPW": "北韓元",
      "KRH": "南韓圜",
      "KRO": "南韓圓",
      "KRW": "韓元",
      "KWD": "科威特第納爾",
      "KYD": "開曼群島元",
      "KZT": "哈薩克堅戈",
      "LAK": "寮國基普",
      "LBP": "黎巴嫩鎊",
      "LKR": "斯里蘭卡盧比",
      "LRD": "賴比瑞亞元",
      "LSL": "賴索托洛蒂",
      "LTT": "立陶宛特羅",
      "LUC": "盧森堡可兌換法郎",
      "LUF": "盧森堡法郎",
      "LUL": "盧森堡金融法郎",
      "LVL": "拉脫維亞拉特銀幣",
      "LVR": "拉脫維亞盧布",
      "LYD": "利比亞第納爾",
      "MCF": "摩納哥法郎",
      "MDC": "摩爾多瓦券",
      "MDL": "摩杜雲列伊",
      "MGA": "馬達加斯加阿里亞里",
      "MGF": "馬達加斯加法郎",
      "MKD": "馬其頓第納爾",
      "MKN": "馬其頓第納爾 (1992–1993)",
      "MLF": "馬里法郎",
      "MMK": "緬甸元",
      "MNT": "蒙古圖格里克",
      "MOP": "澳門元",
      "MRO": "茅利塔尼亞烏吉亞 (1973–2017)",
      "MRU": "茅利塔尼亞烏吉亞",
      "MTL": "馬爾他里拉",
      "MTP": "馬爾他鎊",
      "MUR": "模里西斯盧比",
      "MVP": "馬爾地夫盧比",
      "MVR": "馬爾地夫盧非亞",
      "MWK": "馬拉維克瓦查",
      "MXN": "墨西哥披索",
      "MXP": "墨西哥銀披索 (1861–1992)",
      "MXV": "墨西哥轉換單位 (UDI)",
      "MYR": "馬來西亞令吉",
      "MZE": "莫三比克埃斯庫多",
      "MZM": "莫三比克梅蒂卡爾 (1980–2006)",
      "MZN": "莫三比克梅蒂卡爾",
      "NAD": "納米比亞元",
      "NGN": "奈及利亞奈拉",
      "NIC": "尼加拉瓜科多巴",
      "NIO": "尼加拉瓜金科多巴",
      "NLG": "荷蘭盾",
      "NPR": "尼泊爾盧比",
      "NZD": "紐西蘭幣",
      "OMR": "阿曼里亞爾",
      "PAB": "巴拿馬巴波亞",
      "PEI": "祕魯因蒂",
      "PEN": "秘魯太陽幣",
      "PES": "秘魯太陽幣 (1863–1965)",
      "PGK": "巴布亞紐幾內亞基那",
      "PHP": "菲律賓披索",
      "PKR": "巴基斯坦盧比",
      "PLN": "波蘭茲羅提",
      "PLZ": "波蘭茲羅提 (1950–1995)",
      "PTE": "葡萄牙埃斯庫多",
      "QAR": "卡達里亞爾",
      "RHD": "羅德西亞元",
      "ROL": "舊羅馬尼亞列伊",
      "RON": "羅馬尼亞列伊",
      "RSD": "塞爾維亞戴納",
      "RUB": "俄羅斯盧布",
      "RUR": "俄羅斯盧布 (1991–1998)",
      "RWF": "盧安達法郎",
      "SAR": "沙烏地里亞爾",
      "SBD": "索羅門群島元",
      "SCR": "塞席爾盧比",
      "SDD": "蘇丹第納爾",
      "SDG": "蘇丹鎊",
      "SDP": "舊蘇丹鎊",
      "SGD": "新加坡幣",
      "SHP": "聖赫勒拿鎊",
      "SIT": "斯洛維尼亞托勒",
      "SLL": "獅子山利昂",
      "SOS": "索馬利亞先令",
      "SRD": "蘇利南元",
      "SRG": "蘇利南基爾",
      "SSP": "南蘇丹鎊",
      "STD": "聖多美島和普林西比島多布拉 (1977–2017)",
      "STN": "聖多美島和普林西比島多布拉",
      "SUR": "蘇聯盧布",
      "SVC": "薩爾瓦多科郎",
      "SYP": "敘利亞鎊",
      "SZL": "史瓦濟蘭里朗吉尼",
      "THB": "泰銖",
      "TJR": "塔吉克盧布",
      "TJS": "塔吉克索莫尼",
      "TMM": "土庫曼馬納特 (1993–2009)",
      "TMT": "土庫曼馬納特",
      "TND": "突尼西亞第納爾",
      "TOP": "東加潘加",
      "TPE": "帝汶埃斯庫多",
      "TRL": "土耳其里拉",
      "TRY": "新土耳其里拉",
      "TTD": "千里達及托巴哥元",
      "TWD": "新台幣",
      "TZS": "坦尚尼亞先令",
      "UAH": "烏克蘭格里夫納",
      "UAK": "烏克蘭卡本瓦那茲",
      "UGS": "烏干達先令 (1966–1987)",
      "UGX": "烏干達先令",
      "USS": "美元（當日）",
      "UYI": "烏拉圭披索（指數單位）",
      "UYP": "烏拉圭披索 (1975–1993)",
      "UYU": "烏拉圭披索",
      "UZS": "烏茲別克索姆",
      "VEB": "委內瑞拉玻利瓦 (1871–2008)",
      "VEF": "委內瑞拉玻利瓦 (2008–2018)",
      "VES": "委內瑞拉玻利瓦",
      "VUV": "萬那杜瓦圖",
      "WST": "西薩摩亞塔拉",
      "XAF": "法郎 (CFA–BEAC)",
      "XAG": "白銀",
      "XAU": "黃金",
      "XBA": "歐洲綜合單位",
      "XBB": "歐洲貨幣單位 (XBB)",
      "XBC": "歐洲會計單位 (XBC)",
      "XBD": "歐洲會計單位 (XBD)",
      "XCD": "格瑞那達元",
      "XDR": "特殊提款權",
      "XEU": "歐洲貨幣單位 (XEU)",
      "XFO": "法國金法郎",
      "XFU": "法國法郎 (UIC)",
      "XOF": "法郎 (CFA–BCEAO)",
      "XPD": "帕拉狄昂",
      "XPF": "法郎 (CFP)",
      "XPT": "白金",
      "XSU": "蘇克雷貨幣",
      "XTS": "測試用貨幣代碼",
      "XUA": "亞洲開發銀行計價單位",
      "XXX": "未知貨幣",
      "YDD": "葉門第納爾",
      "YER": "葉門里亞爾",
      "YUD": "南斯拉夫第納爾硬幣",
      "YUM": "南斯拉夫挪威亞第納爾",
      "YUN": "南斯拉夫可轉換第納爾",
      "YUR": "南斯拉夫改革第納爾 (1992–1993)",
      "ZAL": "南非蘭特（金融）",
      "ZAR": "南非蘭特",
      "ZMK": "尚比亞克瓦查 (1968–2012)",
      "ZMW": "尚比亞克瓦查",
      "ZRN": "薩伊新扎伊爾",
      "ZRZ": "薩伊扎伊爾",
      "ZWD": "辛巴威元 (1980–2008)",
      "ZWL": "辛巴威元 (2009)",
      "ZWR": "辛巴威元 (2008)",
    };
  }-*/;
}
