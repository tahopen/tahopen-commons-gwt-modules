package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_zh extends com.google.gwt.i18n.client.CurrencyList_ {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("CNY", "￥", 2, "RMB¥", "¥");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "CNY", "￥", 2, "RMB¥", "¥"];
  }-*/;
  
  @Override
  protected HashMap<String, CurrencyData> loadCurrencyMapJava() {
    HashMap<String, CurrencyData> result = super.loadCurrencyMapJava();
    // 安道尔比塞塔
    result.put("ADP", new CurrencyDataImpl("ADP", "ADP", 128, "ADP", "ADP"));
    // 阿联酋迪拉姆
    result.put("AED", new CurrencyDataImpl("AED", "DH", 2, "DH", "dh"));
    // 阿富汗尼 (1927–2002)
    result.put("AFA", new CurrencyDataImpl("AFA", "AFA", 130, "AFA", "AFA"));
    // 阿富汗尼
    result.put("AFN", new CurrencyDataImpl("AFN", "AFN", 0, "AFN", "Af."));
    // 阿尔巴尼亚列克(1946–1965)
    result.put("ALK", new CurrencyDataImpl("ALK", "ALK", 130, "ALK", "ALK"));
    // 阿尔巴尼亚列克
    result.put("ALL", new CurrencyDataImpl("ALL", "ALL", 0, "ALL", "Lek"));
    // 亚美尼亚德拉姆
    result.put("AMD", new CurrencyDataImpl("AMD", "AMD", 2, "AMD", "Dram"));
    // 荷属安的列斯盾
    result.put("ANG", new CurrencyDataImpl("ANG", "ANG", 2, "ANG", "ANG"));
    // 安哥拉宽扎
    result.put("AOA", new CurrencyDataImpl("AOA", "AOA", 2, "AOA", "Kz"));
    // 安哥拉宽扎 (1977–1990)
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130, "AOK", "AOK"));
    // 安哥拉新宽扎 (1990–2000)
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130, "AON", "AON"));
    // 安哥拉重新调整宽扎 (1995–1999)
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130, "AOR", "AOR"));
    // 阿根廷奥斯特拉尔
    result.put("ARA", new CurrencyDataImpl("ARA", "ARA", 130, "ARA", "ARA"));
    // 阿根廷法定比索 (1970–1983)
    result.put("ARL", new CurrencyDataImpl("ARL", "ARL", 130, "ARL", "ARL"));
    // 阿根廷比索 (1881–1970)
    result.put("ARM", new CurrencyDataImpl("ARM", "ARM", 130, "ARM", "ARM"));
    // 阿根廷比索 (1983–1985)
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130, "ARP", "ARP"));
    // 阿根廷比索
    result.put("ARS", new CurrencyDataImpl("ARS", "AR$", 2, "AR$", "$"));
    // 奥地利先令
    result.put("ATS", new CurrencyDataImpl("ATS", "ATS", 130, "ATS", "ATS"));
    // 澳大利亚元
    result.put("AUD", new CurrencyDataImpl("AUD", "AU$", 2, "AU$", "$"));
    // 阿鲁巴弗罗林
    result.put("AWG", new CurrencyDataImpl("AWG", "AWG", 2, "AWG", "Afl."));
    // 阿塞拜疆马纳特 (1993–2006)
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130, "AZM", "AZM"));
    // 阿塞拜疆马纳特
    result.put("AZN", new CurrencyDataImpl("AZN", "AZN", 2, "AZN", "man."));
    // 波士尼亚-赫塞哥维纳第纳尔 (1992–1994)
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130, "BAD", "BAD"));
    // 波斯尼亚-黑塞哥维那可兑换马克
    result.put("BAM", new CurrencyDataImpl("BAM", "BAM", 2, "BAM", "KM"));
    // 波士尼亚-赫塞哥维纳新第纳尔 (1994–1997)
    result.put("BAN", new CurrencyDataImpl("BAN", "BAN", 130, "BAN", "BAN"));
    // 巴巴多斯元
    result.put("BBD", new CurrencyDataImpl("BBD", "BBD", 2, "BBD", "$"));
    // 孟加拉塔卡
    result.put("BDT", new CurrencyDataImpl("BDT", "Tk", 2, "Tk", "৳"));
    // 比利时法郎（可兑换）
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 130, "BEC", "BEC"));
    // 比利时法郎
    result.put("BEF", new CurrencyDataImpl("BEF", "BEF", 130, "BEF", "BEF"));
    // 比利时法郎（金融）
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 130, "BEL", "BEL"));
    // 保加利亚硬列弗
    result.put("BGL", new CurrencyDataImpl("BGL", "BGL", 130, "BGL", "BGL"));
    // 保加利亚社会党列弗
    result.put("BGM", new CurrencyDataImpl("BGM", "BGM", 130, "BGM", "BGM"));
    // 保加利亚列弗
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2, "BGN", "lev"));
    // 保加利亚列弗 (1879–1952)
    result.put("BGO", new CurrencyDataImpl("BGO", "BGO", 130, "BGO", "BGO"));
    // 巴林第纳尔
    result.put("BHD", new CurrencyDataImpl("BHD", "BHD", 3, "BHD", "din"));
    // 布隆迪法郎
    result.put("BIF", new CurrencyDataImpl("BIF", "BIF", 0, "BIF", "FBu"));
    // 百慕大元
    result.put("BMD", new CurrencyDataImpl("BMD", "BMD", 2, "BMD", "$"));
    // 文莱元
    result.put("BND", new CurrencyDataImpl("BND", "BND", 2, "BND", "$"));
    // 玻利维亚诺
    result.put("BOB", new CurrencyDataImpl("BOB", "BOB", 2, "BOB", "Bs"));
    // 玻利维亚诺 (1863–1963)
    result.put("BOL", new CurrencyDataImpl("BOL", "BOL", 130, "BOL", "BOL"));
    // 玻利维亚比索
    result.put("BOP", new CurrencyDataImpl("BOP", "BOP", 130, "BOP", "BOP"));
    // 玻利维亚 Mvdol（资金）
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 130, "BOV", "BOV"));
    // 巴西新克鲁赛罗 (1967–1986)
    result.put("BRB", new CurrencyDataImpl("BRB", "BRB", 130, "BRB", "BRB"));
    // 巴西克鲁扎多 (1986–1989)
    result.put("BRC", new CurrencyDataImpl("BRC", "BRC", 130, "BRC", "BRC"));
    // 巴西克鲁塞罗 (1990–1993)
    result.put("BRE", new CurrencyDataImpl("BRE", "BRE", 130, "BRE", "BRE"));
    // 巴西雷亚尔
    result.put("BRL", new CurrencyDataImpl("BRL", "R$", 2, "R$", "R$"));
    // 巴西新克鲁扎多 (1989–1990)
    result.put("BRN", new CurrencyDataImpl("BRN", "BRN", 130, "BRN", "BRN"));
    // 巴西克鲁塞罗 (1993–1994)
    result.put("BRR", new CurrencyDataImpl("BRR", "BRR", 130, "BRR", "BRR"));
    // 巴西克鲁塞罗 (1942–1967)
    result.put("BRZ", new CurrencyDataImpl("BRZ", "BRZ", 130, "BRZ", "BRZ"));
    // 巴哈马元
    result.put("BSD", new CurrencyDataImpl("BSD", "BSD", 2, "BSD", "$"));
    // 不丹努尔特鲁姆
    result.put("BTN", new CurrencyDataImpl("BTN", "BTN", 2, "BTN", "Nu."));
    // 缅元
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130, "BUK", "BUK"));
    // 博茨瓦纳普拉
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2, "BWP", "P"));
    // 白俄罗斯新卢布 (1994–1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130, "BYB", "BYB"));
    // 白俄罗斯卢布
    result.put("BYN", new CurrencyDataImpl("BYN", "BYN", 2, "BYN", "BYN"));
    // 白俄罗斯卢布 (2000–2016)
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 128, "BYR", "BYR"));
    // 伯利兹元
    result.put("BZD", new CurrencyDataImpl("BZD", "BZD", 2, "BZD", "$"));
    // 加拿大元
    result.put("CAD", new CurrencyDataImpl("CAD", "CA$", 2, "C$", "$"));
    // 刚果法郎
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2, "CDF", "FrCD"));
    // 欧元 (WIR)
    result.put("CHE", new CurrencyDataImpl("CHE", "CHE", 130, "CHE", "CHE"));
    // 瑞士法郎
    result.put("CHF", new CurrencyDataImpl("CHF", "CHF", 2, "CHF", "CHF"));
    // 法郎 (WIR)
    result.put("CHW", new CurrencyDataImpl("CHW", "CHW", 130, "CHW", "CHW"));
    // 智利埃斯库多
    result.put("CLE", new CurrencyDataImpl("CLE", "CLE", 130, "CLE", "CLE"));
    // 智利（资金）
    result.put("CLF", new CurrencyDataImpl("CLF", "CLF", 132, "CLF", "CLF"));
    // 智利比索
    result.put("CLP", new CurrencyDataImpl("CLP", "CL$", 0, "CL$", "$"));
    // 人民币（离岸）
    result.put("CNH", new CurrencyDataImpl("CNH", "CNH", 130, "CNH", "CNH"));
    // 人民币
    result.put("CNY", new CurrencyDataImpl("CNY", "￥", 2, "RMB¥", "¥"));
    // 哥伦比亚比索
    result.put("COP", new CurrencyDataImpl("COP", "COL$", 2, "COL$", "$"));
    // 哥伦比亚币
    result.put("COU", new CurrencyDataImpl("COU", "COU", 130, "COU", "COU"));
    // 哥斯达黎加科朗
    result.put("CRC", new CurrencyDataImpl("CRC", "CR₡", 2, "CR₡", "₡"));
    // 旧塞尔维亚第纳尔
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130, "CSD", "CSD"));
    // 捷克硬克朗
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130, "CSK", "CSK"));
    // 古巴可兑换比索
    result.put("CUC", new CurrencyDataImpl("CUC", "CUC", 2, "CUC", "$"));
    // 古巴比索
    result.put("CUP", new CurrencyDataImpl("CUP", "$MN", 2, "$MN", "$"));
    // 佛得角埃斯库多
    result.put("CVE", new CurrencyDataImpl("CVE", "CVE", 2, "CVE", "CVE"));
    // 塞浦路斯镑
    result.put("CYP", new CurrencyDataImpl("CYP", "CYP", 130, "CYP", "CYP"));
    // 捷克克朗
    result.put("CZK", new CurrencyDataImpl("CZK", "Kč", 2, "Kč", "Kč"));
    // 东德奥斯特马克
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130, "DDM", "DDM"));
    // 德国马克
    result.put("DEM", new CurrencyDataImpl("DEM", "DEM", 130, "DEM", "DEM"));
    // 吉布提法郎
    result.put("DJF", new CurrencyDataImpl("DJF", "Fdj", 0, "Fdj", "Fdj"));
    // 丹麦克朗
    result.put("DKK", new CurrencyDataImpl("DKK", "kr", 2, "kr", "kr"));
    // 多米尼加比索
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$", "$"));
    // 阿尔及利亚第纳尔
    result.put("DZD", new CurrencyDataImpl("DZD", "DZD", 2, "DZD", "din"));
    // 厄瓜多尔苏克雷
    result.put("ECS", new CurrencyDataImpl("ECS", "ECS", 130, "ECS", "ECS"));
    // 厄瓜多尔 (UVC)
    result.put("ECV", new CurrencyDataImpl("ECV", "ECV", 130, "ECV", "ECV"));
    // 爱沙尼亚克朗
    result.put("EEK", new CurrencyDataImpl("EEK", "EEK", 130, "EEK", "EEK"));
    // 埃及镑
    result.put("EGP", new CurrencyDataImpl("EGP", "LE", 2, "LE", "E£"));
    // 厄立特里亚纳克法
    result.put("ERN", new CurrencyDataImpl("ERN", "ERN", 2, "ERN", "Nfk"));
    // 西班牙比塞塔（帐户 A）
    result.put("ESA", new CurrencyDataImpl("ESA", "ESA", 130, "ESA", "ESA"));
    // 西班牙比塞塔（兑换帐户）
    result.put("ESB", new CurrencyDataImpl("ESB", "ESB", 130, "ESB", "ESB"));
    // 西班牙比塞塔
    result.put("ESP", new CurrencyDataImpl("ESP", "ESP", 128, "ESP", "ESP"));
    // 埃塞俄比亚比尔
    result.put("ETB", new CurrencyDataImpl("ETB", "ETB", 2, "ETB", "Birr"));
    // 欧元
    result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€", "€"));
    // 芬兰马克
    result.put("FIM", new CurrencyDataImpl("FIM", "FIM", 130, "FIM", "FIM"));
    // 斐济元
    result.put("FJD", new CurrencyDataImpl("FJD", "FJD", 2, "FJD", "$"));
    // 福克兰群岛镑
    result.put("FKP", new CurrencyDataImpl("FKP", "FKP", 2, "FKP", "£"));
    // 法国法郎
    result.put("FRF", new CurrencyDataImpl("FRF", "FRF", 130, "FRF", "FRF"));
    // 英镑
    result.put("GBP", new CurrencyDataImpl("GBP", "£", 2, "GB£", "£"));
    // 乔治亚库蓬拉瑞特
    result.put("GEK", new CurrencyDataImpl("GEK", "GEK", 130, "GEK", "GEK"));
    // 格鲁吉亚拉里
    result.put("GEL", new CurrencyDataImpl("GEL", "₾", 2, "₾", "GEL"));
    // 加纳塞第
    result.put("GHC", new CurrencyDataImpl("GHC", "GHC", 130, "GHC", "GHC"));
    // 加纳塞地
    result.put("GHS", new CurrencyDataImpl("GHS", "GHS", 2, "GHS", "GHS"));
    // 直布罗陀镑
    result.put("GIP", new CurrencyDataImpl("GIP", "GIP", 2, "GIP", "£"));
    // 冈比亚达拉西
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2, "GMD", "GMD"));
    // 几内亚法郎
    result.put("GNF", new CurrencyDataImpl("GNF", "GNF", 0, "GNF", "FG"));
    // 几内亚西里
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130, "GNS", "GNS"));
    // 赤道几内亚埃奎勒
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130, "GQE", "GQE"));
    // 希腊德拉克马
    result.put("GRD", new CurrencyDataImpl("GRD", "GRD", 130, "GRD", "GRD"));
    // 危地马拉格查尔
    result.put("GTQ", new CurrencyDataImpl("GTQ", "GTQ", 2, "GTQ", "Q"));
    // 葡萄牙几内亚埃斯库多
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130, "GWE", "GWE"));
    // 几内亚比绍比索
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 130, "GWP", "GWP"));
    // 圭亚那元
    result.put("GYD", new CurrencyDataImpl("GYD", "GYD", 2, "GYD", "$"));
    // 港元
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$", "$"));
    // 洪都拉斯伦皮拉
    result.put("HNL", new CurrencyDataImpl("HNL", "L", 2, "L", "L"));
    // 克罗地亚第纳尔
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130, "HRD", "HRD"));
    // 克罗地亚库纳
    result.put("HRK", new CurrencyDataImpl("HRK", "HRK", 2, "HRK", "kn"));
    // 海地古德
    result.put("HTG", new CurrencyDataImpl("HTG", "HTG", 2, "HTG", "HTG"));
    // 匈牙利福林
    result.put("HUF", new CurrencyDataImpl("HUF", "HUF", 2, "HUF", "Ft"));
    // 印度尼西亚盾
    result.put("IDR", new CurrencyDataImpl("IDR", "IDR", 2, "IDR", "Rp"));
    // 爱尔兰镑
    result.put("IEP", new CurrencyDataImpl("IEP", "IEP", 130, "IEP", "IEP"));
    // 以色列镑
    result.put("ILP", new CurrencyDataImpl("ILP", "ILP", 130, "ILP", "ILP"));
    // 以色列谢克尔(1980–1985)
    result.put("ILR", new CurrencyDataImpl("ILR", "ILS", 130, "ILS", "ILS"));
    // 以色列新谢克尔
    result.put("ILS", new CurrencyDataImpl("ILS", "₪", 2, "IL₪", "₪"));
    // 印度卢比
    result.put("INR", new CurrencyDataImpl("INR", "₹", 2, "Rs", "₹"));
    // 伊拉克第纳尔
    result.put("IQD", new CurrencyDataImpl("IQD", "IQD", 0, "IQD", "din"));
    // 伊朗里亚尔
    result.put("IRR", new CurrencyDataImpl("IRR", "IRR", 0, "IRR", "Rial"));
    // 冰岛克朗(1918–1981)
    result.put("ISJ", new CurrencyDataImpl("ISJ", "ISJ", 130, "ISJ", "ISJ"));
    // 冰岛克朗
    result.put("ISK", new CurrencyDataImpl("ISK", "kr", 0, "kr", "kr"));
    // 意大利里拉
    result.put("ITL", new CurrencyDataImpl("ITL", "ITL", 128, "ITL", "ITL"));
    // 牙买加元
    result.put("JMD", new CurrencyDataImpl("JMD", "JA$", 2, "JA$", "$"));
    // 约旦第纳尔
    result.put("JOD", new CurrencyDataImpl("JOD", "JOD", 3, "JOD", "din"));
    // 日元
    result.put("JPY", new CurrencyDataImpl("JPY", "JP¥", 0, "JP¥", "¥"));
    // 肯尼亚先令
    result.put("KES", new CurrencyDataImpl("KES", "Ksh", 2, "Ksh", "Ksh"));
    // 吉尔吉斯斯坦索姆
    result.put("KGS", new CurrencyDataImpl("KGS", "KGS", 2, "KGS", "KGS"));
    // 柬埔寨瑞尔
    result.put("KHR", new CurrencyDataImpl("KHR", "KHR", 2, "KHR", "Riel"));
    // 科摩罗法郎
    result.put("KMF", new CurrencyDataImpl("KMF", "KMF", 0, "KMF", "CF"));
    // 朝鲜元
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 0, "KPW", "₩"));
    // 韩元 (1953–1962)
    result.put("KRH", new CurrencyDataImpl("KRH", "KRH", 130, "KRH", "KRH"));
    // 韩元 (1945–1953)
    result.put("KRO", new CurrencyDataImpl("KRO", "KRO", 130, "KRO", "KRO"));
    // 韩元
    result.put("KRW", new CurrencyDataImpl("KRW", "￦", 0, "KR₩", "₩"));
    // 科威特第纳尔
    result.put("KWD", new CurrencyDataImpl("KWD", "KWD", 3, "KWD", "din"));
    // 开曼元
    result.put("KYD", new CurrencyDataImpl("KYD", "KYD", 2, "KYD", "$"));
    // 哈萨克斯坦坚戈
    result.put("KZT", new CurrencyDataImpl("KZT", "KZT", 2, "KZT", "₸"));
    // 老挝基普
    result.put("LAK", new CurrencyDataImpl("LAK", "LAK", 0, "LAK", "₭"));
    // 黎巴嫩镑
    result.put("LBP", new CurrencyDataImpl("LBP", "LBP", 0, "LBP", "L£"));
    // 斯里兰卡卢比
    result.put("LKR", new CurrencyDataImpl("LKR", "SLRs", 2, "SLRs", "Rs"));
    // 利比里亚元
    result.put("LRD", new CurrencyDataImpl("LRD", "LRD", 2, "LRD", "$"));
    // 莱索托洛蒂
    result.put("LSL", new CurrencyDataImpl("LSL", "LSL", 2, "LSL", "LSL"));
    // 立陶宛立特
    result.put("LTL", new CurrencyDataImpl("LTL", "LTL", 130, "LTL", "Lt"));
    // 立陶宛塔咯呐司
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130, "LTT", "LTT"));
    // 卢森堡可兑换法郎
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 130, "LUC", "LUC"));
    // 卢森堡法郎
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128, "LUF", "LUF"));
    // 卢森堡金融法郎
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 130, "LUL", "LUL"));
    // 拉脱维亚拉特
    result.put("LVL", new CurrencyDataImpl("LVL", "LVL", 130, "LVL", "Ls"));
    // 拉脱维亚卢布
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130, "LVR", "LVR"));
    // 利比亚第纳尔
    result.put("LYD", new CurrencyDataImpl("LYD", "LYD", 3, "LYD", "din"));
    // 摩洛哥迪拉姆
    result.put("MAD", new CurrencyDataImpl("MAD", "MAD", 2, "MAD", "MAD"));
    // 摩洛哥法郎
    result.put("MAF", new CurrencyDataImpl("MAF", "MAF", 130, "MAF", "MAF"));
    // 摩纳哥法郎
    result.put("MCF", new CurrencyDataImpl("MCF", "MCF", 130, "MCF", "MCF"));
    // 摩尔多瓦库邦
    result.put("MDC", new CurrencyDataImpl("MDC", "MDC", 130, "MDC", "MDC"));
    // 摩尔多瓦列伊
    result.put("MDL", new CurrencyDataImpl("MDL", "MDL", 2, "MDL", "MDL"));
    // 马达加斯加阿里亚里
    result.put("MGA", new CurrencyDataImpl("MGA", "MGA", 0, "MGA", "Ar"));
    // 马达加斯加法郎
    result.put("MGF", new CurrencyDataImpl("MGF", "MGF", 128, "MGF", "MGF"));
    // 马其顿第纳尔
    result.put("MKD", new CurrencyDataImpl("MKD", "MKD", 2, "MKD", "din"));
    // 马其顿第纳尔 (1992–1993)
    result.put("MKN", new CurrencyDataImpl("MKN", "MKN", 130, "MKN", "MKN"));
    // 马里法郎
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130, "MLF", "MLF"));
    // 缅甸元
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 0, "MMK", "K"));
    // 蒙古图格里克
    result.put("MNT", new CurrencyDataImpl("MNT", "MN₮", 2, "MN₮", "₮"));
    // 澳门币
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP", 2, "MOP", "MOP"));
    // 毛里塔尼亚乌吉亚 (1973–2017)
    result.put("MRO", new CurrencyDataImpl("MRO", "MRO", 128, "MRO", "MRO"));
    // 毛里塔尼亚乌吉亚
    result.put("MRU", new CurrencyDataImpl("MRU", "MRU", 2, "MRU", "MRU"));
    // 马耳他里拉
    result.put("MTL", new CurrencyDataImpl("MTL", "MTL", 130, "MTL", "MTL"));
    // 马耳他镑
    result.put("MTP", new CurrencyDataImpl("MTP", "MTP", 130, "MTP", "MTP"));
    // 毛里求斯卢比
    result.put("MUR", new CurrencyDataImpl("MUR", "MUR", 2, "MUR", "Rs"));
    // 马尔代夫卢比(1947–1981)
    result.put("MVP", new CurrencyDataImpl("MVP", "MVP", 130, "MVP", "MVP"));
    // 马尔代夫卢菲亚
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2, "MVR", "MVR"));
    // 马拉维克瓦查
    result.put("MWK", new CurrencyDataImpl("MWK", "MWK", 2, "MWK", "MWK"));
    // 墨西哥比索
    result.put("MXN", new CurrencyDataImpl("MXN", "MX$", 2, "Mex$", "$"));
    // 墨西哥银比索 (1861–1992)
    result.put("MXP", new CurrencyDataImpl("MXP", "MXP", 130, "MXP", "MXP"));
    // 墨西哥（资金）
    result.put("MXV", new CurrencyDataImpl("MXV", "MXV", 130, "MXV", "MXV"));
    // 马来西亚林吉特
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM", "RM"));
    // 莫桑比克埃斯库多
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130, "MZE", "MZE"));
    // 旧莫桑比克美提卡
    result.put("MZM", new CurrencyDataImpl("MZM", "MZM", 130, "MZM", "MZM"));
    // 莫桑比克美提卡
    result.put("MZN", new CurrencyDataImpl("MZN", "MZN", 2, "MZN", "MTn"));
    // 纳米比亚元
    result.put("NAD", new CurrencyDataImpl("NAD", "NAD", 2, "NAD", "$"));
    // 尼日利亚奈拉
    result.put("NGN", new CurrencyDataImpl("NGN", "NGN", 2, "NGN", "₦"));
    // 尼加拉瓜科多巴 (1988–1991)
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130, "NIC", "NIC"));
    // 尼加拉瓜科多巴
    result.put("NIO", new CurrencyDataImpl("NIO", "NIO", 2, "NIO", "C$"));
    // 荷兰盾
    result.put("NLG", new CurrencyDataImpl("NLG", "NLG", 130, "NLG", "NLG"));
    // 挪威克朗
    result.put("NOK", new CurrencyDataImpl("NOK", "NOkr", 2, "NOkr", "kr"));
    // 尼泊尔卢比
    result.put("NPR", new CurrencyDataImpl("NPR", "NPR", 2, "NPR", "Rs"));
    // 新西兰元
    result.put("NZD", new CurrencyDataImpl("NZD", "NZ$", 2, "NZ$", "$"));
    // 阿曼里亚尔
    result.put("OMR", new CurrencyDataImpl("OMR", "OMR", 3, "OMR", "Rial"));
    // 巴拿马巴波亚
    result.put("PAB", new CurrencyDataImpl("PAB", "B/.", 2, "B/.", "B/."));
    // 秘鲁印第
    result.put("PEI", new CurrencyDataImpl("PEI", "PEI", 130, "PEI", "PEI"));
    // 秘鲁索尔
    result.put("PEN", new CurrencyDataImpl("PEN", "S/.", 2, "S/.", "S/."));
    // 秘鲁索尔 (1863–1965)
    result.put("PES", new CurrencyDataImpl("PES", "PES", 130, "PES", "PES"));
    // 巴布亚新几内亚基那
    result.put("PGK", new CurrencyDataImpl("PGK", "PGK", 2, "PGK", "PGK"));
    // 菲律宾比索
    result.put("PHP", new CurrencyDataImpl("PHP", "PHP", 2, "PHP", "₱"));
    // 巴基斯坦卢比
    result.put("PKR", new CurrencyDataImpl("PKR", "PKRs.", 2, "PKRs.", "Rs"));
    // 波兰兹罗提
    result.put("PLN", new CurrencyDataImpl("PLN", "PLN", 2, "PLN", "zł"));
    // 波兰兹罗提 (1950–1995)
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130, "PLZ", "PLZ"));
    // 葡萄牙埃斯库多
    result.put("PTE", new CurrencyDataImpl("PTE", "PTE", 130, "PTE", "PTE"));
    // 巴拉圭瓜拉尼
    result.put("PYG", new CurrencyDataImpl("PYG", "PYG", 0, "PYG", "Gs"));
    // 卡塔尔里亚尔
    result.put("QAR", new CurrencyDataImpl("QAR", "QAR", 2, "QAR", "Rial"));
    // 罗得西亚元
    result.put("RHD", new CurrencyDataImpl("RHD", "RHD", 130, "RHD", "RHD"));
    // 旧罗马尼亚列伊
    result.put("ROL", new CurrencyDataImpl("ROL", "ROL", 130, "ROL", "ROL"));
    // 罗马尼亚列伊
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2, "RON", "RON"));
    // 塞尔维亚第纳尔
    result.put("RSD", new CurrencyDataImpl("RSD", "RSD", 0, "RSD", "din"));
    // 俄罗斯卢布
    result.put("RUB", new CurrencyDataImpl("RUB", "руб.", 2, "руб.", "руб."));
    // 俄国卢布 (1991–1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130, "RUR", "RUR"));
    // 卢旺达法郎
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0, "RWF", "RF"));
    // 沙特里亚尔
    result.put("SAR", new CurrencyDataImpl("SAR", "SR", 2, "SR", "Rial"));
    // 所罗门群岛元
    result.put("SBD", new CurrencyDataImpl("SBD", "SBD", 2, "SBD", "$"));
    // 塞舌尔卢比
    result.put("SCR", new CurrencyDataImpl("SCR", "SCR", 2, "SCR", "SCR"));
    // 苏丹第纳尔 (1992–2007)
    result.put("SDD", new CurrencyDataImpl("SDD", "SDD", 130, "SDD", "SDD"));
    // 苏丹镑
    result.put("SDG", new CurrencyDataImpl("SDG", "SDG", 2, "SDG", "SDG"));
    // 旧苏丹镑
    result.put("SDP", new CurrencyDataImpl("SDP", "SDP", 130, "SDP", "SDP"));
    // 瑞典克朗
    result.put("SEK", new CurrencyDataImpl("SEK", "kr", 2, "kr", "kr"));
    // 新加坡元
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$", "$"));
    // 圣赫勒拿群岛磅
    result.put("SHP", new CurrencyDataImpl("SHP", "SHP", 2, "SHP", "£"));
    // 斯洛文尼亚托拉尔
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130, "SIT", "SIT"));
    // 斯洛伐克克朗
    result.put("SKK", new CurrencyDataImpl("SKK", "SKK", 130, "SKK", "SKK"));
    // 塞拉利昂利昂
    result.put("SLL", new CurrencyDataImpl("SLL", "SLL", 0, "SLL", "SLL"));
    // 索马里先令
    result.put("SOS", new CurrencyDataImpl("SOS", "SOS", 0, "SOS", "SOS"));
    // 苏里南元
    result.put("SRD", new CurrencyDataImpl("SRD", "SRD", 2, "SRD", "$"));
    // 苏里南盾
    result.put("SRG", new CurrencyDataImpl("SRG", "SRG", 130, "SRG", "SRG"));
    // 南苏丹镑
    result.put("SSP", new CurrencyDataImpl("SSP", "SSP", 2, "SSP", "SSP"));
    // 圣多美和普林西比多布拉 (1977–2017)
    result.put("STD", new CurrencyDataImpl("STD", "STD", 128, "STD", "Db"));
    // 圣多美和普林西比多布拉
    result.put("STN", new CurrencyDataImpl("STN", "STN", 2, "STN", "STN"));
    // 苏联卢布
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130, "SUR", "SUR"));
    // 萨尔瓦多科朗
    result.put("SVC", new CurrencyDataImpl("SVC", "SVC", 130, "SVC", "SVC"));
    // 叙利亚镑
    result.put("SYP", new CurrencyDataImpl("SYP", "SYP", 0, "SYP", "£"));
    // 斯威士兰里兰吉尼
    result.put("SZL", new CurrencyDataImpl("SZL", "SZL", 2, "SZL", "SZL"));
    // 泰铢
    result.put("THB", new CurrencyDataImpl("THB", "THB", 2, "THB", "฿"));
    // 塔吉克斯坦卢布
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130, "TJR", "TJR"));
    // 塔吉克斯坦索莫尼
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2, "TJS", "Som"));
    // 土库曼斯坦马纳特 (1993–2009)
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 128, "TMM", "TMM"));
    // 土库曼斯坦马纳特
    result.put("TMT", new CurrencyDataImpl("TMT", "TMT", 2, "TMT", "TMT"));
    // 突尼斯第纳尔
    result.put("TND", new CurrencyDataImpl("TND", "TND", 3, "TND", "din"));
    // 汤加潘加
    result.put("TOP", new CurrencyDataImpl("TOP", "TOP", 2, "TOP", "T$"));
    // 帝汶埃斯库多
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130, "TPE", "TPE"));
    // 土耳其里拉 (1922–2005)
    result.put("TRL", new CurrencyDataImpl("TRL", "TRL", 128, "TRL", "TRL"));
    // 土耳其里拉
    result.put("TRY", new CurrencyDataImpl("TRY", "TL", 2, "YTL", "TL"));
    // 特立尼达和多巴哥元
    result.put("TTD", new CurrencyDataImpl("TTD", "TTD", 2, "TTD", "$"));
    // 新台币
    result.put("TWD", new CurrencyDataImpl("TWD", "NT$", 2, "NT$", "NT$"));
    // 坦桑尼亚先令
    result.put("TZS", new CurrencyDataImpl("TZS", "TZS", 2, "TZS", "TSh"));
    // 乌克兰格里夫纳
    result.put("UAH", new CurrencyDataImpl("UAH", "UAH", 2, "UAH", "₴"));
    // 乌克兰币
    result.put("UAK", new CurrencyDataImpl("UAK", "UAK", 130, "UAK", "UAK"));
    // 乌干达先令 (1966–1987)
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130, "UGS", "UGS"));
    // 乌干达先令
    result.put("UGX", new CurrencyDataImpl("UGX", "UGX", 0, "UGX", "UGX"));
    // 美元
    result.put("USD", new CurrencyDataImpl("USD", "US$", 2, "US$", "$"));
    // 美元（次日）
    result.put("USN", new CurrencyDataImpl("USN", "USN", 130, "USN", "USN"));
    // 美元（当日）
    result.put("USS", new CurrencyDataImpl("USS", "USS", 130, "USS", "USS"));
    // 乌拉圭比索（索引单位）
    result.put("UYI", new CurrencyDataImpl("UYI", "UYI", 128, "UYI", "UYI"));
    // 乌拉圭比索 (1975–1993)
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130, "UYP", "UYP"));
    // 乌拉圭比索
    result.put("UYU", new CurrencyDataImpl("UYU", "UY$", 2, "UY$", "$"));
    // 乌兹别克斯坦苏姆
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 2, "UZS", "soʼm"));
    // 委内瑞拉玻利瓦尔 (1871–2008)
    result.put("VEB", new CurrencyDataImpl("VEB", "VEB", 130, "VEB", "VEB"));
    // 委内瑞拉玻利瓦尔 (2008–2018)
    result.put("VEF", new CurrencyDataImpl("VEF", "VEF", 130, "VEF", "Bs"));
    // 委内瑞拉玻利瓦尔
    result.put("VES", new CurrencyDataImpl("VES", "VES", 2, "VES", "VES"));
    // 越南盾
    result.put("VND", new CurrencyDataImpl("VND", "₫", 24, "₫", "₫"));
    // 越南盾 (1978–1985)
    result.put("VNN", new CurrencyDataImpl("VNN", "VNN", 130, "VNN", "VNN"));
    // 瓦努阿图瓦图
    result.put("VUV", new CurrencyDataImpl("VUV", "VUV", 0, "VUV", "VUV"));
    // 萨摩亚塔拉
    result.put("WST", new CurrencyDataImpl("WST", "WST", 2, "WST", "WST"));
    // 中非法郎
    result.put("XAF", new CurrencyDataImpl("XAF", "FCFA", 0, "FCFA", "FCFA"));
    // 银
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 130, "XAG", "XAG"));
    // 黄金
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 130, "XAU", "XAU"));
    // 欧洲复合单位
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 130, "XBA", "XBA"));
    // 欧洲货币联盟
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 130, "XBB", "XBB"));
    // 欧洲计算单位 (XBC)
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 130, "XBC", "XBC"));
    // 欧洲计算单位 (XBD)
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 130, "XBD", "XBD"));
    // 东加勒比元
    result.put("XCD", new CurrencyDataImpl("XCD", "EC$", 2, "EC$", "$"));
    // 特别提款权
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 130, "XDR", "XDR"));
    // 欧洲货币单位
    result.put("XEU", new CurrencyDataImpl("XEU", "XEU", 130, "XEU", "XEU"));
    // 法国金法郎
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 130, "XFO", "XFO"));
    // 法国法郎 (UIC)
    result.put("XFU", new CurrencyDataImpl("XFU", "XFU", 130, "XFU", "XFU"));
    // 西非法郎
    result.put("XOF", new CurrencyDataImpl("XOF", "CFA", 0, "CFA", "CFA"));
    // 钯
    result.put("XPD", new CurrencyDataImpl("XPD", "XPD", 130, "XPD", "XPD"));
    // 太平洋法郎
    result.put("XPF", new CurrencyDataImpl("XPF", "CFPF", 0, "CFPF", "FCFP"));
    // 铂
    result.put("XPT", new CurrencyDataImpl("XPT", "XPT", 130, "XPT", "XPT"));
    // RINET 基金
    result.put("XRE", new CurrencyDataImpl("XRE", "XRE", 130, "XRE", "XRE"));
    // 测试货币代码
    result.put("XTS", new CurrencyDataImpl("XTS", "XTS", 130, "XTS", "XTS"));
    // 未知货币
    result.put("XXX", new CurrencyDataImpl("XXX", "XXX", 130, "XXX", "XXX"));
    // 也门第纳尔
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130, "YDD", "YDD"));
    // 也门里亚尔
    result.put("YER", new CurrencyDataImpl("YER", "YER", 0, "YER", "Rial"));
    // 南斯拉夫硬第纳尔 (1966–1990)
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130, "YUD", "YUD"));
    // 南斯拉夫新第纳尔 (1994–2002)
    result.put("YUM", new CurrencyDataImpl("YUM", "YUM", 130, "YUM", "YUM"));
    // 南斯拉夫可兑换第纳尔 (1990–1992)
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130, "YUN", "YUN"));
    // 南斯拉夫改良第纳尔 (1992–1993)
    result.put("YUR", new CurrencyDataImpl("YUR", "YUR", 130, "YUR", "YUR"));
    // 南非兰特 (金融)
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 130, "ZAL", "ZAL"));
    // 南非兰特
    result.put("ZAR", new CurrencyDataImpl("ZAR", "ZAR", 2, "ZAR", "R"));
    // 赞比亚克瓦查 (1968–2012)
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZMK", 128, "ZMK", "ZWK"));
    // 赞比亚克瓦查
    result.put("ZMW", new CurrencyDataImpl("ZMW", "ZMW", 2, "ZMW", "ZMW"));
    // 新扎伊尔 (1993–1998)
    result.put("ZRN", new CurrencyDataImpl("ZRN", "ZRN", 130, "ZRN", "ZRN"));
    // 扎伊尔 (1971–1993)
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"));
    // 津巴布韦元 (1980–2008)
    result.put("ZWD", new CurrencyDataImpl("ZWD", "ZWD", 128, "ZWD", "ZWD"));
    // 津巴布韦元 (2009)
    result.put("ZWL", new CurrencyDataImpl("ZWL", "ZWL", 130, "ZWL", "ZWL"));
    // 津巴布韦元 (2008)
    result.put("ZWR", new CurrencyDataImpl("ZWR", "ZWR", 130, "ZWR", "ZWR"));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // 安道尔比塞塔
      "ADP": [ "ADP", "ADP", 128, "ADP", "ADP"],
      // 阿联酋迪拉姆
      "AED": [ "AED", "DH", 2, "DH", "dh"],
      // 阿富汗尼 (1927–2002)
      "AFA": [ "AFA", "AFA", 130, "AFA", "AFA"],
      // 阿富汗尼
      "AFN": [ "AFN", "AFN", 0, "AFN", "Af."],
      // 阿尔巴尼亚列克(1946–1965)
      "ALK": [ "ALK", "ALK", 130, "ALK", "ALK"],
      // 阿尔巴尼亚列克
      "ALL": [ "ALL", "ALL", 0, "ALL", "Lek"],
      // 亚美尼亚德拉姆
      "AMD": [ "AMD", "AMD", 2, "AMD", "Dram"],
      // 荷属安的列斯盾
      "ANG": [ "ANG", "ANG", 2, "ANG", "ANG"],
      // 安哥拉宽扎
      "AOA": [ "AOA", "AOA", 2, "AOA", "Kz"],
      // 安哥拉宽扎 (1977–1990)
      "AOK": [ "AOK", "AOK", 130, "AOK", "AOK"],
      // 安哥拉新宽扎 (1990–2000)
      "AON": [ "AON", "AON", 130, "AON", "AON"],
      // 安哥拉重新调整宽扎 (1995–1999)
      "AOR": [ "AOR", "AOR", 130, "AOR", "AOR"],
      // 阿根廷奥斯特拉尔
      "ARA": [ "ARA", "ARA", 130, "ARA", "ARA"],
      // 阿根廷法定比索 (1970–1983)
      "ARL": [ "ARL", "ARL", 130, "ARL", "ARL"],
      // 阿根廷比索 (1881–1970)
      "ARM": [ "ARM", "ARM", 130, "ARM", "ARM"],
      // 阿根廷比索 (1983–1985)
      "ARP": [ "ARP", "ARP", 130, "ARP", "ARP"],
      // 阿根廷比索
      "ARS": [ "ARS", "AR$", 2, "AR$", "$"],
      // 奥地利先令
      "ATS": [ "ATS", "ATS", 130, "ATS", "ATS"],
      // 澳大利亚元
      "AUD": [ "AUD", "AU$", 2, "AU$", "$"],
      // 阿鲁巴弗罗林
      "AWG": [ "AWG", "AWG", 2, "AWG", "Afl."],
      // 阿塞拜疆马纳特 (1993–2006)
      "AZM": [ "AZM", "AZM", 130, "AZM", "AZM"],
      // 阿塞拜疆马纳特
      "AZN": [ "AZN", "AZN", 2, "AZN", "man."],
      // 波士尼亚-赫塞哥维纳第纳尔 (1992–1994)
      "BAD": [ "BAD", "BAD", 130, "BAD", "BAD"],
      // 波斯尼亚-黑塞哥维那可兑换马克
      "BAM": [ "BAM", "BAM", 2, "BAM", "KM"],
      // 波士尼亚-赫塞哥维纳新第纳尔 (1994–1997)
      "BAN": [ "BAN", "BAN", 130, "BAN", "BAN"],
      // 巴巴多斯元
      "BBD": [ "BBD", "BBD", 2, "BBD", "$"],
      // 孟加拉塔卡
      "BDT": [ "BDT", "Tk", 2, "Tk", "৳"],
      // 比利时法郎（可兑换）
      "BEC": [ "BEC", "BEC", 130, "BEC", "BEC"],
      // 比利时法郎
      "BEF": [ "BEF", "BEF", 130, "BEF", "BEF"],
      // 比利时法郎（金融）
      "BEL": [ "BEL", "BEL", 130, "BEL", "BEL"],
      // 保加利亚硬列弗
      "BGL": [ "BGL", "BGL", 130, "BGL", "BGL"],
      // 保加利亚社会党列弗
      "BGM": [ "BGM", "BGM", 130, "BGM", "BGM"],
      // 保加利亚列弗
      "BGN": [ "BGN", "BGN", 2, "BGN", "lev"],
      // 保加利亚列弗 (1879–1952)
      "BGO": [ "BGO", "BGO", 130, "BGO", "BGO"],
      // 巴林第纳尔
      "BHD": [ "BHD", "BHD", 3, "BHD", "din"],
      // 布隆迪法郎
      "BIF": [ "BIF", "BIF", 0, "BIF", "FBu"],
      // 百慕大元
      "BMD": [ "BMD", "BMD", 2, "BMD", "$"],
      // 文莱元
      "BND": [ "BND", "BND", 2, "BND", "$"],
      // 玻利维亚诺
      "BOB": [ "BOB", "BOB", 2, "BOB", "Bs"],
      // 玻利维亚诺 (1863–1963)
      "BOL": [ "BOL", "BOL", 130, "BOL", "BOL"],
      // 玻利维亚比索
      "BOP": [ "BOP", "BOP", 130, "BOP", "BOP"],
      // 玻利维亚 Mvdol（资金）
      "BOV": [ "BOV", "BOV", 130, "BOV", "BOV"],
      // 巴西新克鲁赛罗 (1967–1986)
      "BRB": [ "BRB", "BRB", 130, "BRB", "BRB"],
      // 巴西克鲁扎多 (1986–1989)
      "BRC": [ "BRC", "BRC", 130, "BRC", "BRC"],
      // 巴西克鲁塞罗 (1990–1993)
      "BRE": [ "BRE", "BRE", 130, "BRE", "BRE"],
      // 巴西雷亚尔
      "BRL": [ "BRL", "R$", 2, "R$", "R$"],
      // 巴西新克鲁扎多 (1989–1990)
      "BRN": [ "BRN", "BRN", 130, "BRN", "BRN"],
      // 巴西克鲁塞罗 (1993–1994)
      "BRR": [ "BRR", "BRR", 130, "BRR", "BRR"],
      // 巴西克鲁塞罗 (1942–1967)
      "BRZ": [ "BRZ", "BRZ", 130, "BRZ", "BRZ"],
      // 巴哈马元
      "BSD": [ "BSD", "BSD", 2, "BSD", "$"],
      // 不丹努尔特鲁姆
      "BTN": [ "BTN", "BTN", 2, "BTN", "Nu."],
      // 缅元
      "BUK": [ "BUK", "BUK", 130, "BUK", "BUK"],
      // 博茨瓦纳普拉
      "BWP": [ "BWP", "BWP", 2, "BWP", "P"],
      // 白俄罗斯新卢布 (1994–1999)
      "BYB": [ "BYB", "BYB", 130, "BYB", "BYB"],
      // 白俄罗斯卢布
      "BYN": [ "BYN", "BYN", 2, "BYN", "BYN"],
      // 白俄罗斯卢布 (2000–2016)
      "BYR": [ "BYR", "BYR", 128, "BYR", "BYR"],
      // 伯利兹元
      "BZD": [ "BZD", "BZD", 2, "BZD", "$"],
      // 加拿大元
      "CAD": [ "CAD", "CA$", 2, "C$", "$"],
      // 刚果法郎
      "CDF": [ "CDF", "CDF", 2, "CDF", "FrCD"],
      // 欧元 (WIR)
      "CHE": [ "CHE", "CHE", 130, "CHE", "CHE"],
      // 瑞士法郎
      "CHF": [ "CHF", "CHF", 2, "CHF", "CHF"],
      // 法郎 (WIR)
      "CHW": [ "CHW", "CHW", 130, "CHW", "CHW"],
      // 智利埃斯库多
      "CLE": [ "CLE", "CLE", 130, "CLE", "CLE"],
      // 智利（资金）
      "CLF": [ "CLF", "CLF", 132, "CLF", "CLF"],
      // 智利比索
      "CLP": [ "CLP", "CL$", 0, "CL$", "$"],
      // 人民币（离岸）
      "CNH": [ "CNH", "CNH", 130, "CNH", "CNH"],
      // 人民币
      "CNY": [ "CNY", "￥", 2, "RMB¥", "¥"],
      // 哥伦比亚比索
      "COP": [ "COP", "COL$", 2, "COL$", "$"],
      // 哥伦比亚币
      "COU": [ "COU", "COU", 130, "COU", "COU"],
      // 哥斯达黎加科朗
      "CRC": [ "CRC", "CR₡", 2, "CR₡", "₡"],
      // 旧塞尔维亚第纳尔
      "CSD": [ "CSD", "CSD", 130, "CSD", "CSD"],
      // 捷克硬克朗
      "CSK": [ "CSK", "CSK", 130, "CSK", "CSK"],
      // 古巴可兑换比索
      "CUC": [ "CUC", "CUC", 2, "CUC", "$"],
      // 古巴比索
      "CUP": [ "CUP", "$MN", 2, "$MN", "$"],
      // 佛得角埃斯库多
      "CVE": [ "CVE", "CVE", 2, "CVE", "CVE"],
      // 塞浦路斯镑
      "CYP": [ "CYP", "CYP", 130, "CYP", "CYP"],
      // 捷克克朗
      "CZK": [ "CZK", "Kč", 2, "Kč", "Kč"],
      // 东德奥斯特马克
      "DDM": [ "DDM", "DDM", 130, "DDM", "DDM"],
      // 德国马克
      "DEM": [ "DEM", "DEM", 130, "DEM", "DEM"],
      // 吉布提法郎
      "DJF": [ "DJF", "Fdj", 0, "Fdj", "Fdj"],
      // 丹麦克朗
      "DKK": [ "DKK", "kr", 2, "kr", "kr"],
      // 多米尼加比索
      "DOP": [ "DOP", "RD$", 2, "RD$", "$"],
      // 阿尔及利亚第纳尔
      "DZD": [ "DZD", "DZD", 2, "DZD", "din"],
      // 厄瓜多尔苏克雷
      "ECS": [ "ECS", "ECS", 130, "ECS", "ECS"],
      // 厄瓜多尔 (UVC)
      "ECV": [ "ECV", "ECV", 130, "ECV", "ECV"],
      // 爱沙尼亚克朗
      "EEK": [ "EEK", "EEK", 130, "EEK", "EEK"],
      // 埃及镑
      "EGP": [ "EGP", "LE", 2, "LE", "E£"],
      // 厄立特里亚纳克法
      "ERN": [ "ERN", "ERN", 2, "ERN", "Nfk"],
      // 西班牙比塞塔（帐户 A）
      "ESA": [ "ESA", "ESA", 130, "ESA", "ESA"],
      // 西班牙比塞塔（兑换帐户）
      "ESB": [ "ESB", "ESB", 130, "ESB", "ESB"],
      // 西班牙比塞塔
      "ESP": [ "ESP", "ESP", 128, "ESP", "ESP"],
      // 埃塞俄比亚比尔
      "ETB": [ "ETB", "ETB", 2, "ETB", "Birr"],
      // 欧元
      "EUR": [ "EUR", "€", 2, "€", "€"],
      // 芬兰马克
      "FIM": [ "FIM", "FIM", 130, "FIM", "FIM"],
      // 斐济元
      "FJD": [ "FJD", "FJD", 2, "FJD", "$"],
      // 福克兰群岛镑
      "FKP": [ "FKP", "FKP", 2, "FKP", "£"],
      // 法国法郎
      "FRF": [ "FRF", "FRF", 130, "FRF", "FRF"],
      // 英镑
      "GBP": [ "GBP", "£", 2, "GB£", "£"],
      // 乔治亚库蓬拉瑞特
      "GEK": [ "GEK", "GEK", 130, "GEK", "GEK"],
      // 格鲁吉亚拉里
      "GEL": [ "GEL", "₾", 2, "₾", "GEL"],
      // 加纳塞第
      "GHC": [ "GHC", "GHC", 130, "GHC", "GHC"],
      // 加纳塞地
      "GHS": [ "GHS", "GHS", 2, "GHS", "GHS"],
      // 直布罗陀镑
      "GIP": [ "GIP", "GIP", 2, "GIP", "£"],
      // 冈比亚达拉西
      "GMD": [ "GMD", "GMD", 2, "GMD", "GMD"],
      // 几内亚法郎
      "GNF": [ "GNF", "GNF", 0, "GNF", "FG"],
      // 几内亚西里
      "GNS": [ "GNS", "GNS", 130, "GNS", "GNS"],
      // 赤道几内亚埃奎勒
      "GQE": [ "GQE", "GQE", 130, "GQE", "GQE"],
      // 希腊德拉克马
      "GRD": [ "GRD", "GRD", 130, "GRD", "GRD"],
      // 危地马拉格查尔
      "GTQ": [ "GTQ", "GTQ", 2, "GTQ", "Q"],
      // 葡萄牙几内亚埃斯库多
      "GWE": [ "GWE", "GWE", 130, "GWE", "GWE"],
      // 几内亚比绍比索
      "GWP": [ "GWP", "GWP", 130, "GWP", "GWP"],
      // 圭亚那元
      "GYD": [ "GYD", "GYD", 2, "GYD", "$"],
      // 港元
      "HKD": [ "HKD", "HK$", 2, "HK$", "$"],
      // 洪都拉斯伦皮拉
      "HNL": [ "HNL", "L", 2, "L", "L"],
      // 克罗地亚第纳尔
      "HRD": [ "HRD", "HRD", 130, "HRD", "HRD"],
      // 克罗地亚库纳
      "HRK": [ "HRK", "HRK", 2, "HRK", "kn"],
      // 海地古德
      "HTG": [ "HTG", "HTG", 2, "HTG", "HTG"],
      // 匈牙利福林
      "HUF": [ "HUF", "HUF", 2, "HUF", "Ft"],
      // 印度尼西亚盾
      "IDR": [ "IDR", "IDR", 2, "IDR", "Rp"],
      // 爱尔兰镑
      "IEP": [ "IEP", "IEP", 130, "IEP", "IEP"],
      // 以色列镑
      "ILP": [ "ILP", "ILP", 130, "ILP", "ILP"],
      // 以色列谢克尔(1980–1985)
      "ILR": [ "ILR", "ILS", 130, "ILS", "ILS"],
      // 以色列新谢克尔
      "ILS": [ "ILS", "₪", 2, "IL₪", "₪"],
      // 印度卢比
      "INR": [ "INR", "₹", 2, "Rs", "₹"],
      // 伊拉克第纳尔
      "IQD": [ "IQD", "IQD", 0, "IQD", "din"],
      // 伊朗里亚尔
      "IRR": [ "IRR", "IRR", 0, "IRR", "Rial"],
      // 冰岛克朗(1918–1981)
      "ISJ": [ "ISJ", "ISJ", 130, "ISJ", "ISJ"],
      // 冰岛克朗
      "ISK": [ "ISK", "kr", 0, "kr", "kr"],
      // 意大利里拉
      "ITL": [ "ITL", "ITL", 128, "ITL", "ITL"],
      // 牙买加元
      "JMD": [ "JMD", "JA$", 2, "JA$", "$"],
      // 约旦第纳尔
      "JOD": [ "JOD", "JOD", 3, "JOD", "din"],
      // 日元
      "JPY": [ "JPY", "JP¥", 0, "JP¥", "¥"],
      // 肯尼亚先令
      "KES": [ "KES", "Ksh", 2, "Ksh", "Ksh"],
      // 吉尔吉斯斯坦索姆
      "KGS": [ "KGS", "KGS", 2, "KGS", "KGS"],
      // 柬埔寨瑞尔
      "KHR": [ "KHR", "KHR", 2, "KHR", "Riel"],
      // 科摩罗法郎
      "KMF": [ "KMF", "KMF", 0, "KMF", "CF"],
      // 朝鲜元
      "KPW": [ "KPW", "KPW", 0, "KPW", "₩"],
      // 韩元 (1953–1962)
      "KRH": [ "KRH", "KRH", 130, "KRH", "KRH"],
      // 韩元 (1945–1953)
      "KRO": [ "KRO", "KRO", 130, "KRO", "KRO"],
      // 韩元
      "KRW": [ "KRW", "￦", 0, "KR₩", "₩"],
      // 科威特第纳尔
      "KWD": [ "KWD", "KWD", 3, "KWD", "din"],
      // 开曼元
      "KYD": [ "KYD", "KYD", 2, "KYD", "$"],
      // 哈萨克斯坦坚戈
      "KZT": [ "KZT", "KZT", 2, "KZT", "₸"],
      // 老挝基普
      "LAK": [ "LAK", "LAK", 0, "LAK", "₭"],
      // 黎巴嫩镑
      "LBP": [ "LBP", "LBP", 0, "LBP", "L£"],
      // 斯里兰卡卢比
      "LKR": [ "LKR", "SLRs", 2, "SLRs", "Rs"],
      // 利比里亚元
      "LRD": [ "LRD", "LRD", 2, "LRD", "$"],
      // 莱索托洛蒂
      "LSL": [ "LSL", "LSL", 2, "LSL", "LSL"],
      // 立陶宛立特
      "LTL": [ "LTL", "LTL", 130, "LTL", "Lt"],
      // 立陶宛塔咯呐司
      "LTT": [ "LTT", "LTT", 130, "LTT", "LTT"],
      // 卢森堡可兑换法郎
      "LUC": [ "LUC", "LUC", 130, "LUC", "LUC"],
      // 卢森堡法郎
      "LUF": [ "LUF", "LUF", 128, "LUF", "LUF"],
      // 卢森堡金融法郎
      "LUL": [ "LUL", "LUL", 130, "LUL", "LUL"],
      // 拉脱维亚拉特
      "LVL": [ "LVL", "LVL", 130, "LVL", "Ls"],
      // 拉脱维亚卢布
      "LVR": [ "LVR", "LVR", 130, "LVR", "LVR"],
      // 利比亚第纳尔
      "LYD": [ "LYD", "LYD", 3, "LYD", "din"],
      // 摩洛哥迪拉姆
      "MAD": [ "MAD", "MAD", 2, "MAD", "MAD"],
      // 摩洛哥法郎
      "MAF": [ "MAF", "MAF", 130, "MAF", "MAF"],
      // 摩纳哥法郎
      "MCF": [ "MCF", "MCF", 130, "MCF", "MCF"],
      // 摩尔多瓦库邦
      "MDC": [ "MDC", "MDC", 130, "MDC", "MDC"],
      // 摩尔多瓦列伊
      "MDL": [ "MDL", "MDL", 2, "MDL", "MDL"],
      // 马达加斯加阿里亚里
      "MGA": [ "MGA", "MGA", 0, "MGA", "Ar"],
      // 马达加斯加法郎
      "MGF": [ "MGF", "MGF", 128, "MGF", "MGF"],
      // 马其顿第纳尔
      "MKD": [ "MKD", "MKD", 2, "MKD", "din"],
      // 马其顿第纳尔 (1992–1993)
      "MKN": [ "MKN", "MKN", 130, "MKN", "MKN"],
      // 马里法郎
      "MLF": [ "MLF", "MLF", 130, "MLF", "MLF"],
      // 缅甸元
      "MMK": [ "MMK", "MMK", 0, "MMK", "K"],
      // 蒙古图格里克
      "MNT": [ "MNT", "MN₮", 2, "MN₮", "₮"],
      // 澳门币
      "MOP": [ "MOP", "MOP", 2, "MOP", "MOP"],
      // 毛里塔尼亚乌吉亚 (1973–2017)
      "MRO": [ "MRO", "MRO", 128, "MRO", "MRO"],
      // 毛里塔尼亚乌吉亚
      "MRU": [ "MRU", "MRU", 2, "MRU", "MRU"],
      // 马耳他里拉
      "MTL": [ "MTL", "MTL", 130, "MTL", "MTL"],
      // 马耳他镑
      "MTP": [ "MTP", "MTP", 130, "MTP", "MTP"],
      // 毛里求斯卢比
      "MUR": [ "MUR", "MUR", 2, "MUR", "Rs"],
      // 马尔代夫卢比(1947–1981)
      "MVP": [ "MVP", "MVP", 130, "MVP", "MVP"],
      // 马尔代夫卢菲亚
      "MVR": [ "MVR", "MVR", 2, "MVR", "MVR"],
      // 马拉维克瓦查
      "MWK": [ "MWK", "MWK", 2, "MWK", "MWK"],
      // 墨西哥比索
      "MXN": [ "MXN", "MX$", 2, "Mex$", "$"],
      // 墨西哥银比索 (1861–1992)
      "MXP": [ "MXP", "MXP", 130, "MXP", "MXP"],
      // 墨西哥（资金）
      "MXV": [ "MXV", "MXV", 130, "MXV", "MXV"],
      // 马来西亚林吉特
      "MYR": [ "MYR", "RM", 2, "RM", "RM"],
      // 莫桑比克埃斯库多
      "MZE": [ "MZE", "MZE", 130, "MZE", "MZE"],
      // 旧莫桑比克美提卡
      "MZM": [ "MZM", "MZM", 130, "MZM", "MZM"],
      // 莫桑比克美提卡
      "MZN": [ "MZN", "MZN", 2, "MZN", "MTn"],
      // 纳米比亚元
      "NAD": [ "NAD", "NAD", 2, "NAD", "$"],
      // 尼日利亚奈拉
      "NGN": [ "NGN", "NGN", 2, "NGN", "₦"],
      // 尼加拉瓜科多巴 (1988–1991)
      "NIC": [ "NIC", "NIC", 130, "NIC", "NIC"],
      // 尼加拉瓜科多巴
      "NIO": [ "NIO", "NIO", 2, "NIO", "C$"],
      // 荷兰盾
      "NLG": [ "NLG", "NLG", 130, "NLG", "NLG"],
      // 挪威克朗
      "NOK": [ "NOK", "NOkr", 2, "NOkr", "kr"],
      // 尼泊尔卢比
      "NPR": [ "NPR", "NPR", 2, "NPR", "Rs"],
      // 新西兰元
      "NZD": [ "NZD", "NZ$", 2, "NZ$", "$"],
      // 阿曼里亚尔
      "OMR": [ "OMR", "OMR", 3, "OMR", "Rial"],
      // 巴拿马巴波亚
      "PAB": [ "PAB", "B/.", 2, "B/.", "B/."],
      // 秘鲁印第
      "PEI": [ "PEI", "PEI", 130, "PEI", "PEI"],
      // 秘鲁索尔
      "PEN": [ "PEN", "S/.", 2, "S/.", "S/."],
      // 秘鲁索尔 (1863–1965)
      "PES": [ "PES", "PES", 130, "PES", "PES"],
      // 巴布亚新几内亚基那
      "PGK": [ "PGK", "PGK", 2, "PGK", "PGK"],
      // 菲律宾比索
      "PHP": [ "PHP", "PHP", 2, "PHP", "₱"],
      // 巴基斯坦卢比
      "PKR": [ "PKR", "PKRs.", 2, "PKRs.", "Rs"],
      // 波兰兹罗提
      "PLN": [ "PLN", "PLN", 2, "PLN", "zł"],
      // 波兰兹罗提 (1950–1995)
      "PLZ": [ "PLZ", "PLZ", 130, "PLZ", "PLZ"],
      // 葡萄牙埃斯库多
      "PTE": [ "PTE", "PTE", 130, "PTE", "PTE"],
      // 巴拉圭瓜拉尼
      "PYG": [ "PYG", "PYG", 0, "PYG", "Gs"],
      // 卡塔尔里亚尔
      "QAR": [ "QAR", "QAR", 2, "QAR", "Rial"],
      // 罗得西亚元
      "RHD": [ "RHD", "RHD", 130, "RHD", "RHD"],
      // 旧罗马尼亚列伊
      "ROL": [ "ROL", "ROL", 130, "ROL", "ROL"],
      // 罗马尼亚列伊
      "RON": [ "RON", "RON", 2, "RON", "RON"],
      // 塞尔维亚第纳尔
      "RSD": [ "RSD", "RSD", 0, "RSD", "din"],
      // 俄罗斯卢布
      "RUB": [ "RUB", "руб.", 2, "руб.", "руб."],
      // 俄国卢布 (1991–1998)
      "RUR": [ "RUR", "RUR", 130, "RUR", "RUR"],
      // 卢旺达法郎
      "RWF": [ "RWF", "RWF", 0, "RWF", "RF"],
      // 沙特里亚尔
      "SAR": [ "SAR", "SR", 2, "SR", "Rial"],
      // 所罗门群岛元
      "SBD": [ "SBD", "SBD", 2, "SBD", "$"],
      // 塞舌尔卢比
      "SCR": [ "SCR", "SCR", 2, "SCR", "SCR"],
      // 苏丹第纳尔 (1992–2007)
      "SDD": [ "SDD", "SDD", 130, "SDD", "SDD"],
      // 苏丹镑
      "SDG": [ "SDG", "SDG", 2, "SDG", "SDG"],
      // 旧苏丹镑
      "SDP": [ "SDP", "SDP", 130, "SDP", "SDP"],
      // 瑞典克朗
      "SEK": [ "SEK", "kr", 2, "kr", "kr"],
      // 新加坡元
      "SGD": [ "SGD", "S$", 2, "S$", "$"],
      // 圣赫勒拿群岛磅
      "SHP": [ "SHP", "SHP", 2, "SHP", "£"],
      // 斯洛文尼亚托拉尔
      "SIT": [ "SIT", "SIT", 130, "SIT", "SIT"],
      // 斯洛伐克克朗
      "SKK": [ "SKK", "SKK", 130, "SKK", "SKK"],
      // 塞拉利昂利昂
      "SLL": [ "SLL", "SLL", 0, "SLL", "SLL"],
      // 索马里先令
      "SOS": [ "SOS", "SOS", 0, "SOS", "SOS"],
      // 苏里南元
      "SRD": [ "SRD", "SRD", 2, "SRD", "$"],
      // 苏里南盾
      "SRG": [ "SRG", "SRG", 130, "SRG", "SRG"],
      // 南苏丹镑
      "SSP": [ "SSP", "SSP", 2, "SSP", "SSP"],
      // 圣多美和普林西比多布拉 (1977–2017)
      "STD": [ "STD", "STD", 128, "STD", "Db"],
      // 圣多美和普林西比多布拉
      "STN": [ "STN", "STN", 2, "STN", "STN"],
      // 苏联卢布
      "SUR": [ "SUR", "SUR", 130, "SUR", "SUR"],
      // 萨尔瓦多科朗
      "SVC": [ "SVC", "SVC", 130, "SVC", "SVC"],
      // 叙利亚镑
      "SYP": [ "SYP", "SYP", 0, "SYP", "£"],
      // 斯威士兰里兰吉尼
      "SZL": [ "SZL", "SZL", 2, "SZL", "SZL"],
      // 泰铢
      "THB": [ "THB", "THB", 2, "THB", "฿"],
      // 塔吉克斯坦卢布
      "TJR": [ "TJR", "TJR", 130, "TJR", "TJR"],
      // 塔吉克斯坦索莫尼
      "TJS": [ "TJS", "TJS", 2, "TJS", "Som"],
      // 土库曼斯坦马纳特 (1993–2009)
      "TMM": [ "TMM", "TMM", 128, "TMM", "TMM"],
      // 土库曼斯坦马纳特
      "TMT": [ "TMT", "TMT", 2, "TMT", "TMT"],
      // 突尼斯第纳尔
      "TND": [ "TND", "TND", 3, "TND", "din"],
      // 汤加潘加
      "TOP": [ "TOP", "TOP", 2, "TOP", "T$"],
      // 帝汶埃斯库多
      "TPE": [ "TPE", "TPE", 130, "TPE", "TPE"],
      // 土耳其里拉 (1922–2005)
      "TRL": [ "TRL", "TRL", 128, "TRL", "TRL"],
      // 土耳其里拉
      "TRY": [ "TRY", "TL", 2, "YTL", "TL"],
      // 特立尼达和多巴哥元
      "TTD": [ "TTD", "TTD", 2, "TTD", "$"],
      // 新台币
      "TWD": [ "TWD", "NT$", 2, "NT$", "NT$"],
      // 坦桑尼亚先令
      "TZS": [ "TZS", "TZS", 2, "TZS", "TSh"],
      // 乌克兰格里夫纳
      "UAH": [ "UAH", "UAH", 2, "UAH", "₴"],
      // 乌克兰币
      "UAK": [ "UAK", "UAK", 130, "UAK", "UAK"],
      // 乌干达先令 (1966–1987)
      "UGS": [ "UGS", "UGS", 130, "UGS", "UGS"],
      // 乌干达先令
      "UGX": [ "UGX", "UGX", 0, "UGX", "UGX"],
      // 美元
      "USD": [ "USD", "US$", 2, "US$", "$"],
      // 美元（次日）
      "USN": [ "USN", "USN", 130, "USN", "USN"],
      // 美元（当日）
      "USS": [ "USS", "USS", 130, "USS", "USS"],
      // 乌拉圭比索（索引单位）
      "UYI": [ "UYI", "UYI", 128, "UYI", "UYI"],
      // 乌拉圭比索 (1975–1993)
      "UYP": [ "UYP", "UYP", 130, "UYP", "UYP"],
      // 乌拉圭比索
      "UYU": [ "UYU", "UY$", 2, "UY$", "$"],
      // 乌兹别克斯坦苏姆
      "UZS": [ "UZS", "UZS", 2, "UZS", "soʼm"],
      // 委内瑞拉玻利瓦尔 (1871–2008)
      "VEB": [ "VEB", "VEB", 130, "VEB", "VEB"],
      // 委内瑞拉玻利瓦尔 (2008–2018)
      "VEF": [ "VEF", "VEF", 130, "VEF", "Bs"],
      // 委内瑞拉玻利瓦尔
      "VES": [ "VES", "VES", 2, "VES", "VES"],
      // 越南盾
      "VND": [ "VND", "₫", 24, "₫", "₫"],
      // 越南盾 (1978–1985)
      "VNN": [ "VNN", "VNN", 130, "VNN", "VNN"],
      // 瓦努阿图瓦图
      "VUV": [ "VUV", "VUV", 0, "VUV", "VUV"],
      // 萨摩亚塔拉
      "WST": [ "WST", "WST", 2, "WST", "WST"],
      // 中非法郎
      "XAF": [ "XAF", "FCFA", 0, "FCFA", "FCFA"],
      // 银
      "XAG": [ "XAG", "XAG", 130, "XAG", "XAG"],
      // 黄金
      "XAU": [ "XAU", "XAU", 130, "XAU", "XAU"],
      // 欧洲复合单位
      "XBA": [ "XBA", "XBA", 130, "XBA", "XBA"],
      // 欧洲货币联盟
      "XBB": [ "XBB", "XBB", 130, "XBB", "XBB"],
      // 欧洲计算单位 (XBC)
      "XBC": [ "XBC", "XBC", 130, "XBC", "XBC"],
      // 欧洲计算单位 (XBD)
      "XBD": [ "XBD", "XBD", 130, "XBD", "XBD"],
      // 东加勒比元
      "XCD": [ "XCD", "EC$", 2, "EC$", "$"],
      // 特别提款权
      "XDR": [ "XDR", "XDR", 130, "XDR", "XDR"],
      // 欧洲货币单位
      "XEU": [ "XEU", "XEU", 130, "XEU", "XEU"],
      // 法国金法郎
      "XFO": [ "XFO", "XFO", 130, "XFO", "XFO"],
      // 法国法郎 (UIC)
      "XFU": [ "XFU", "XFU", 130, "XFU", "XFU"],
      // 西非法郎
      "XOF": [ "XOF", "CFA", 0, "CFA", "CFA"],
      // 钯
      "XPD": [ "XPD", "XPD", 130, "XPD", "XPD"],
      // 太平洋法郎
      "XPF": [ "XPF", "CFPF", 0, "CFPF", "FCFP"],
      // 铂
      "XPT": [ "XPT", "XPT", 130, "XPT", "XPT"],
      // RINET 基金
      "XRE": [ "XRE", "XRE", 130, "XRE", "XRE"],
      // 测试货币代码
      "XTS": [ "XTS", "XTS", 130, "XTS", "XTS"],
      // 未知货币
      "XXX": [ "XXX", "XXX", 130, "XXX", "XXX"],
      // 也门第纳尔
      "YDD": [ "YDD", "YDD", 130, "YDD", "YDD"],
      // 也门里亚尔
      "YER": [ "YER", "YER", 0, "YER", "Rial"],
      // 南斯拉夫硬第纳尔 (1966–1990)
      "YUD": [ "YUD", "YUD", 130, "YUD", "YUD"],
      // 南斯拉夫新第纳尔 (1994–2002)
      "YUM": [ "YUM", "YUM", 130, "YUM", "YUM"],
      // 南斯拉夫可兑换第纳尔 (1990–1992)
      "YUN": [ "YUN", "YUN", 130, "YUN", "YUN"],
      // 南斯拉夫改良第纳尔 (1992–1993)
      "YUR": [ "YUR", "YUR", 130, "YUR", "YUR"],
      // 南非兰特 (金融)
      "ZAL": [ "ZAL", "ZAL", 130, "ZAL", "ZAL"],
      // 南非兰特
      "ZAR": [ "ZAR", "ZAR", 2, "ZAR", "R"],
      // 赞比亚克瓦查 (1968–2012)
      "ZMK": [ "ZMK", "ZMK", 128, "ZMK", "ZWK"],
      // 赞比亚克瓦查
      "ZMW": [ "ZMW", "ZMW", 2, "ZMW", "ZMW"],
      // 新扎伊尔 (1993–1998)
      "ZRN": [ "ZRN", "ZRN", 130, "ZRN", "ZRN"],
      // 扎伊尔 (1971–1993)
      "ZRZ": [ "ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"],
      // 津巴布韦元 (1980–2008)
      "ZWD": [ "ZWD", "ZWD", 128, "ZWD", "ZWD"],
      // 津巴布韦元 (2009)
      "ZWL": [ "ZWL", "ZWL", 130, "ZWL", "ZWL"],
      // 津巴布韦元 (2008)
      "ZWR": [ "ZWR", "ZWR", 130, "ZWR", "ZWR"],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("ADP", "安道尔比塞塔");
    result.put("AED", "阿联酋迪拉姆");
    result.put("AFA", "阿富汗尼 (1927–2002)");
    result.put("AFN", "阿富汗尼");
    result.put("ALK", "阿尔巴尼亚列克(1946–1965)");
    result.put("ALL", "阿尔巴尼亚列克");
    result.put("AMD", "亚美尼亚德拉姆");
    result.put("ANG", "荷属安的列斯盾");
    result.put("AOA", "安哥拉宽扎");
    result.put("AOK", "安哥拉宽扎 (1977–1990)");
    result.put("AON", "安哥拉新宽扎 (1990–2000)");
    result.put("AOR", "安哥拉重新调整宽扎 (1995–1999)");
    result.put("ARA", "阿根廷奥斯特拉尔");
    result.put("ARL", "阿根廷法定比索 (1970–1983)");
    result.put("ARM", "阿根廷比索 (1881–1970)");
    result.put("ARP", "阿根廷比索 (1983–1985)");
    result.put("ARS", "阿根廷比索");
    result.put("ATS", "奥地利先令");
    result.put("AUD", "澳大利亚元");
    result.put("AWG", "阿鲁巴弗罗林");
    result.put("AZM", "阿塞拜疆马纳特 (1993–2006)");
    result.put("AZN", "阿塞拜疆马纳特");
    result.put("BAD", "波士尼亚-赫塞哥维纳第纳尔 (1992–1994)");
    result.put("BAM", "波斯尼亚-黑塞哥维那可兑换马克");
    result.put("BAN", "波士尼亚-赫塞哥维纳新第纳尔 (1994–1997)");
    result.put("BBD", "巴巴多斯元");
    result.put("BDT", "孟加拉塔卡");
    result.put("BEC", "比利时法郎（可兑换）");
    result.put("BEF", "比利时法郎");
    result.put("BEL", "比利时法郎（金融）");
    result.put("BGL", "保加利亚硬列弗");
    result.put("BGM", "保加利亚社会党列弗");
    result.put("BGN", "保加利亚列弗");
    result.put("BGO", "保加利亚列弗 (1879–1952)");
    result.put("BHD", "巴林第纳尔");
    result.put("BIF", "布隆迪法郎");
    result.put("BMD", "百慕大元");
    result.put("BND", "文莱元");
    result.put("BOB", "玻利维亚诺");
    result.put("BOL", "玻利维亚诺 (1863–1963)");
    result.put("BOP", "玻利维亚比索");
    result.put("BOV", "玻利维亚 Mvdol（资金）");
    result.put("BRB", "巴西新克鲁赛罗 (1967–1986)");
    result.put("BRC", "巴西克鲁扎多 (1986–1989)");
    result.put("BRE", "巴西克鲁塞罗 (1990–1993)");
    result.put("BRL", "巴西雷亚尔");
    result.put("BRN", "巴西新克鲁扎多 (1989–1990)");
    result.put("BRR", "巴西克鲁塞罗 (1993–1994)");
    result.put("BRZ", "巴西克鲁塞罗 (1942–1967)");
    result.put("BSD", "巴哈马元");
    result.put("BTN", "不丹努尔特鲁姆");
    result.put("BUK", "缅元");
    result.put("BWP", "博茨瓦纳普拉");
    result.put("BYB", "白俄罗斯新卢布 (1994–1999)");
    result.put("BYN", "白俄罗斯卢布");
    result.put("BYR", "白俄罗斯卢布 (2000–2016)");
    result.put("BZD", "伯利兹元");
    result.put("CAD", "加拿大元");
    result.put("CDF", "刚果法郎");
    result.put("CHE", "欧元 (WIR)");
    result.put("CHF", "瑞士法郎");
    result.put("CHW", "法郎 (WIR)");
    result.put("CLE", "智利埃斯库多");
    result.put("CLF", "智利（资金）");
    result.put("CLP", "智利比索");
    result.put("CNH", "人民币（离岸）");
    result.put("CNY", "人民币");
    result.put("COP", "哥伦比亚比索");
    result.put("COU", "哥伦比亚币");
    result.put("CRC", "哥斯达黎加科朗");
    result.put("CSD", "旧塞尔维亚第纳尔");
    result.put("CSK", "捷克硬克朗");
    result.put("CUC", "古巴可兑换比索");
    result.put("CUP", "古巴比索");
    result.put("CVE", "佛得角埃斯库多");
    result.put("CYP", "塞浦路斯镑");
    result.put("CZK", "捷克克朗");
    result.put("DDM", "东德奥斯特马克");
    result.put("DEM", "德国马克");
    result.put("DJF", "吉布提法郎");
    result.put("DKK", "丹麦克朗");
    result.put("DOP", "多米尼加比索");
    result.put("DZD", "阿尔及利亚第纳尔");
    result.put("ECS", "厄瓜多尔苏克雷");
    result.put("ECV", "厄瓜多尔 (UVC)");
    result.put("EEK", "爱沙尼亚克朗");
    result.put("EGP", "埃及镑");
    result.put("ERN", "厄立特里亚纳克法");
    result.put("ESA", "西班牙比塞塔（帐户 A）");
    result.put("ESB", "西班牙比塞塔（兑换帐户）");
    result.put("ESP", "西班牙比塞塔");
    result.put("ETB", "埃塞俄比亚比尔");
    result.put("EUR", "欧元");
    result.put("FIM", "芬兰马克");
    result.put("FJD", "斐济元");
    result.put("FKP", "福克兰群岛镑");
    result.put("FRF", "法国法郎");
    result.put("GBP", "英镑");
    result.put("GEK", "乔治亚库蓬拉瑞特");
    result.put("GEL", "格鲁吉亚拉里");
    result.put("GHC", "加纳塞第");
    result.put("GHS", "加纳塞地");
    result.put("GIP", "直布罗陀镑");
    result.put("GMD", "冈比亚达拉西");
    result.put("GNF", "几内亚法郎");
    result.put("GNS", "几内亚西里");
    result.put("GQE", "赤道几内亚埃奎勒");
    result.put("GRD", "希腊德拉克马");
    result.put("GTQ", "危地马拉格查尔");
    result.put("GWE", "葡萄牙几内亚埃斯库多");
    result.put("GWP", "几内亚比绍比索");
    result.put("GYD", "圭亚那元");
    result.put("HKD", "港元");
    result.put("HNL", "洪都拉斯伦皮拉");
    result.put("HRD", "克罗地亚第纳尔");
    result.put("HRK", "克罗地亚库纳");
    result.put("HTG", "海地古德");
    result.put("HUF", "匈牙利福林");
    result.put("IDR", "印度尼西亚盾");
    result.put("IEP", "爱尔兰镑");
    result.put("ILP", "以色列镑");
    result.put("ILR", "以色列谢克尔(1980–1985)");
    result.put("ILS", "以色列新谢克尔");
    result.put("INR", "印度卢比");
    result.put("IQD", "伊拉克第纳尔");
    result.put("IRR", "伊朗里亚尔");
    result.put("ISJ", "冰岛克朗(1918–1981)");
    result.put("ISK", "冰岛克朗");
    result.put("ITL", "意大利里拉");
    result.put("JMD", "牙买加元");
    result.put("JOD", "约旦第纳尔");
    result.put("JPY", "日元");
    result.put("KES", "肯尼亚先令");
    result.put("KGS", "吉尔吉斯斯坦索姆");
    result.put("KHR", "柬埔寨瑞尔");
    result.put("KMF", "科摩罗法郎");
    result.put("KPW", "朝鲜元");
    result.put("KRH", "韩元 (1953–1962)");
    result.put("KRO", "韩元 (1945–1953)");
    result.put("KRW", "韩元");
    result.put("KWD", "科威特第纳尔");
    result.put("KYD", "开曼元");
    result.put("KZT", "哈萨克斯坦坚戈");
    result.put("LAK", "老挝基普");
    result.put("LBP", "黎巴嫩镑");
    result.put("LKR", "斯里兰卡卢比");
    result.put("LRD", "利比里亚元");
    result.put("LSL", "莱索托洛蒂");
    result.put("LTL", "立陶宛立特");
    result.put("LTT", "立陶宛塔咯呐司");
    result.put("LUC", "卢森堡可兑换法郎");
    result.put("LUF", "卢森堡法郎");
    result.put("LUL", "卢森堡金融法郎");
    result.put("LVL", "拉脱维亚拉特");
    result.put("LVR", "拉脱维亚卢布");
    result.put("LYD", "利比亚第纳尔");
    result.put("MAD", "摩洛哥迪拉姆");
    result.put("MAF", "摩洛哥法郎");
    result.put("MCF", "摩纳哥法郎");
    result.put("MDC", "摩尔多瓦库邦");
    result.put("MDL", "摩尔多瓦列伊");
    result.put("MGA", "马达加斯加阿里亚里");
    result.put("MGF", "马达加斯加法郎");
    result.put("MKD", "马其顿第纳尔");
    result.put("MKN", "马其顿第纳尔 (1992–1993)");
    result.put("MLF", "马里法郎");
    result.put("MMK", "缅甸元");
    result.put("MNT", "蒙古图格里克");
    result.put("MOP", "澳门币");
    result.put("MRO", "毛里塔尼亚乌吉亚 (1973–2017)");
    result.put("MRU", "毛里塔尼亚乌吉亚");
    result.put("MTL", "马耳他里拉");
    result.put("MTP", "马耳他镑");
    result.put("MUR", "毛里求斯卢比");
    result.put("MVP", "马尔代夫卢比(1947–1981)");
    result.put("MVR", "马尔代夫卢菲亚");
    result.put("MWK", "马拉维克瓦查");
    result.put("MXN", "墨西哥比索");
    result.put("MXP", "墨西哥银比索 (1861–1992)");
    result.put("MXV", "墨西哥（资金）");
    result.put("MYR", "马来西亚林吉特");
    result.put("MZE", "莫桑比克埃斯库多");
    result.put("MZM", "旧莫桑比克美提卡");
    result.put("MZN", "莫桑比克美提卡");
    result.put("NAD", "纳米比亚元");
    result.put("NGN", "尼日利亚奈拉");
    result.put("NIC", "尼加拉瓜科多巴 (1988–1991)");
    result.put("NIO", "尼加拉瓜科多巴");
    result.put("NLG", "荷兰盾");
    result.put("NOK", "挪威克朗");
    result.put("NPR", "尼泊尔卢比");
    result.put("NZD", "新西兰元");
    result.put("OMR", "阿曼里亚尔");
    result.put("PAB", "巴拿马巴波亚");
    result.put("PEI", "秘鲁印第");
    result.put("PEN", "秘鲁索尔");
    result.put("PES", "秘鲁索尔 (1863–1965)");
    result.put("PGK", "巴布亚新几内亚基那");
    result.put("PHP", "菲律宾比索");
    result.put("PKR", "巴基斯坦卢比");
    result.put("PLN", "波兰兹罗提");
    result.put("PLZ", "波兰兹罗提 (1950–1995)");
    result.put("PTE", "葡萄牙埃斯库多");
    result.put("PYG", "巴拉圭瓜拉尼");
    result.put("QAR", "卡塔尔里亚尔");
    result.put("RHD", "罗得西亚元");
    result.put("ROL", "旧罗马尼亚列伊");
    result.put("RON", "罗马尼亚列伊");
    result.put("RSD", "塞尔维亚第纳尔");
    result.put("RUB", "俄罗斯卢布");
    result.put("RUR", "俄国卢布 (1991–1998)");
    result.put("RWF", "卢旺达法郎");
    result.put("SAR", "沙特里亚尔");
    result.put("SBD", "所罗门群岛元");
    result.put("SCR", "塞舌尔卢比");
    result.put("SDD", "苏丹第纳尔 (1992–2007)");
    result.put("SDG", "苏丹镑");
    result.put("SDP", "旧苏丹镑");
    result.put("SEK", "瑞典克朗");
    result.put("SGD", "新加坡元");
    result.put("SHP", "圣赫勒拿群岛磅");
    result.put("SIT", "斯洛文尼亚托拉尔");
    result.put("SKK", "斯洛伐克克朗");
    result.put("SLL", "塞拉利昂利昂");
    result.put("SOS", "索马里先令");
    result.put("SRD", "苏里南元");
    result.put("SRG", "苏里南盾");
    result.put("SSP", "南苏丹镑");
    result.put("STD", "圣多美和普林西比多布拉 (1977–2017)");
    result.put("STN", "圣多美和普林西比多布拉");
    result.put("SUR", "苏联卢布");
    result.put("SVC", "萨尔瓦多科朗");
    result.put("SYP", "叙利亚镑");
    result.put("SZL", "斯威士兰里兰吉尼");
    result.put("THB", "泰铢");
    result.put("TJR", "塔吉克斯坦卢布");
    result.put("TJS", "塔吉克斯坦索莫尼");
    result.put("TMM", "土库曼斯坦马纳特 (1993–2009)");
    result.put("TMT", "土库曼斯坦马纳特");
    result.put("TND", "突尼斯第纳尔");
    result.put("TOP", "汤加潘加");
    result.put("TPE", "帝汶埃斯库多");
    result.put("TRL", "土耳其里拉 (1922–2005)");
    result.put("TRY", "土耳其里拉");
    result.put("TTD", "特立尼达和多巴哥元");
    result.put("TWD", "新台币");
    result.put("TZS", "坦桑尼亚先令");
    result.put("UAH", "乌克兰格里夫纳");
    result.put("UAK", "乌克兰币");
    result.put("UGS", "乌干达先令 (1966–1987)");
    result.put("UGX", "乌干达先令");
    result.put("USD", "美元");
    result.put("USN", "美元（次日）");
    result.put("USS", "美元（当日）");
    result.put("UYI", "乌拉圭比索（索引单位）");
    result.put("UYP", "乌拉圭比索 (1975–1993)");
    result.put("UYU", "乌拉圭比索");
    result.put("UZS", "乌兹别克斯坦苏姆");
    result.put("VEB", "委内瑞拉玻利瓦尔 (1871–2008)");
    result.put("VEF", "委内瑞拉玻利瓦尔 (2008–2018)");
    result.put("VES", "委内瑞拉玻利瓦尔");
    result.put("VND", "越南盾");
    result.put("VNN", "越南盾 (1978–1985)");
    result.put("VUV", "瓦努阿图瓦图");
    result.put("WST", "萨摩亚塔拉");
    result.put("XAF", "中非法郎");
    result.put("XAG", "银");
    result.put("XAU", "黄金");
    result.put("XBA", "欧洲复合单位");
    result.put("XBB", "欧洲货币联盟");
    result.put("XBC", "欧洲计算单位 (XBC)");
    result.put("XBD", "欧洲计算单位 (XBD)");
    result.put("XCD", "东加勒比元");
    result.put("XDR", "特别提款权");
    result.put("XEU", "欧洲货币单位");
    result.put("XFO", "法国金法郎");
    result.put("XFU", "法国法郎 (UIC)");
    result.put("XOF", "西非法郎");
    result.put("XPD", "钯");
    result.put("XPF", "太平洋法郎");
    result.put("XPT", "铂");
    result.put("XRE", "RINET 基金");
    result.put("XTS", "测试货币代码");
    result.put("XXX", "未知货币");
    result.put("YDD", "也门第纳尔");
    result.put("YER", "也门里亚尔");
    result.put("YUD", "南斯拉夫硬第纳尔 (1966–1990)");
    result.put("YUM", "南斯拉夫新第纳尔 (1994–2002)");
    result.put("YUN", "南斯拉夫可兑换第纳尔 (1990–1992)");
    result.put("YUR", "南斯拉夫改良第纳尔 (1992–1993)");
    result.put("ZAL", "南非兰特 (金融)");
    result.put("ZAR", "南非兰特");
    result.put("ZMK", "赞比亚克瓦查 (1968–2012)");
    result.put("ZMW", "赞比亚克瓦查");
    result.put("ZRN", "新扎伊尔 (1993–1998)");
    result.put("ZRZ", "扎伊尔 (1971–1993)");
    result.put("ZWD", "津巴布韦元 (1980–2008)");
    result.put("ZWL", "津巴布韦元 (2009)");
    result.put("ZWR", "津巴布韦元 (2008)");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "ADP": "安道尔比塞塔",
      "AED": "阿联酋迪拉姆",
      "AFA": "阿富汗尼 (1927–2002)",
      "AFN": "阿富汗尼",
      "ALK": "阿尔巴尼亚列克(1946–1965)",
      "ALL": "阿尔巴尼亚列克",
      "AMD": "亚美尼亚德拉姆",
      "ANG": "荷属安的列斯盾",
      "AOA": "安哥拉宽扎",
      "AOK": "安哥拉宽扎 (1977–1990)",
      "AON": "安哥拉新宽扎 (1990–2000)",
      "AOR": "安哥拉重新调整宽扎 (1995–1999)",
      "ARA": "阿根廷奥斯特拉尔",
      "ARL": "阿根廷法定比索 (1970–1983)",
      "ARM": "阿根廷比索 (1881–1970)",
      "ARP": "阿根廷比索 (1983–1985)",
      "ARS": "阿根廷比索",
      "ATS": "奥地利先令",
      "AUD": "澳大利亚元",
      "AWG": "阿鲁巴弗罗林",
      "AZM": "阿塞拜疆马纳特 (1993–2006)",
      "AZN": "阿塞拜疆马纳特",
      "BAD": "波士尼亚-赫塞哥维纳第纳尔 (1992–1994)",
      "BAM": "波斯尼亚-黑塞哥维那可兑换马克",
      "BAN": "波士尼亚-赫塞哥维纳新第纳尔 (1994–1997)",
      "BBD": "巴巴多斯元",
      "BDT": "孟加拉塔卡",
      "BEC": "比利时法郎（可兑换）",
      "BEF": "比利时法郎",
      "BEL": "比利时法郎（金融）",
      "BGL": "保加利亚硬列弗",
      "BGM": "保加利亚社会党列弗",
      "BGN": "保加利亚列弗",
      "BGO": "保加利亚列弗 (1879–1952)",
      "BHD": "巴林第纳尔",
      "BIF": "布隆迪法郎",
      "BMD": "百慕大元",
      "BND": "文莱元",
      "BOB": "玻利维亚诺",
      "BOL": "玻利维亚诺 (1863–1963)",
      "BOP": "玻利维亚比索",
      "BOV": "玻利维亚 Mvdol（资金）",
      "BRB": "巴西新克鲁赛罗 (1967–1986)",
      "BRC": "巴西克鲁扎多 (1986–1989)",
      "BRE": "巴西克鲁塞罗 (1990–1993)",
      "BRL": "巴西雷亚尔",
      "BRN": "巴西新克鲁扎多 (1989–1990)",
      "BRR": "巴西克鲁塞罗 (1993–1994)",
      "BRZ": "巴西克鲁塞罗 (1942–1967)",
      "BSD": "巴哈马元",
      "BTN": "不丹努尔特鲁姆",
      "BUK": "缅元",
      "BWP": "博茨瓦纳普拉",
      "BYB": "白俄罗斯新卢布 (1994–1999)",
      "BYN": "白俄罗斯卢布",
      "BYR": "白俄罗斯卢布 (2000–2016)",
      "BZD": "伯利兹元",
      "CAD": "加拿大元",
      "CDF": "刚果法郎",
      "CHE": "欧元 (WIR)",
      "CHF": "瑞士法郎",
      "CHW": "法郎 (WIR)",
      "CLE": "智利埃斯库多",
      "CLF": "智利（资金）",
      "CLP": "智利比索",
      "CNH": "人民币（离岸）",
      "CNY": "人民币",
      "COP": "哥伦比亚比索",
      "COU": "哥伦比亚币",
      "CRC": "哥斯达黎加科朗",
      "CSD": "旧塞尔维亚第纳尔",
      "CSK": "捷克硬克朗",
      "CUC": "古巴可兑换比索",
      "CUP": "古巴比索",
      "CVE": "佛得角埃斯库多",
      "CYP": "塞浦路斯镑",
      "CZK": "捷克克朗",
      "DDM": "东德奥斯特马克",
      "DEM": "德国马克",
      "DJF": "吉布提法郎",
      "DKK": "丹麦克朗",
      "DOP": "多米尼加比索",
      "DZD": "阿尔及利亚第纳尔",
      "ECS": "厄瓜多尔苏克雷",
      "ECV": "厄瓜多尔 (UVC)",
      "EEK": "爱沙尼亚克朗",
      "EGP": "埃及镑",
      "ERN": "厄立特里亚纳克法",
      "ESA": "西班牙比塞塔（帐户 A）",
      "ESB": "西班牙比塞塔（兑换帐户）",
      "ESP": "西班牙比塞塔",
      "ETB": "埃塞俄比亚比尔",
      "EUR": "欧元",
      "FIM": "芬兰马克",
      "FJD": "斐济元",
      "FKP": "福克兰群岛镑",
      "FRF": "法国法郎",
      "GBP": "英镑",
      "GEK": "乔治亚库蓬拉瑞特",
      "GEL": "格鲁吉亚拉里",
      "GHC": "加纳塞第",
      "GHS": "加纳塞地",
      "GIP": "直布罗陀镑",
      "GMD": "冈比亚达拉西",
      "GNF": "几内亚法郎",
      "GNS": "几内亚西里",
      "GQE": "赤道几内亚埃奎勒",
      "GRD": "希腊德拉克马",
      "GTQ": "危地马拉格查尔",
      "GWE": "葡萄牙几内亚埃斯库多",
      "GWP": "几内亚比绍比索",
      "GYD": "圭亚那元",
      "HKD": "港元",
      "HNL": "洪都拉斯伦皮拉",
      "HRD": "克罗地亚第纳尔",
      "HRK": "克罗地亚库纳",
      "HTG": "海地古德",
      "HUF": "匈牙利福林",
      "IDR": "印度尼西亚盾",
      "IEP": "爱尔兰镑",
      "ILP": "以色列镑",
      "ILR": "以色列谢克尔(1980–1985)",
      "ILS": "以色列新谢克尔",
      "INR": "印度卢比",
      "IQD": "伊拉克第纳尔",
      "IRR": "伊朗里亚尔",
      "ISJ": "冰岛克朗(1918–1981)",
      "ISK": "冰岛克朗",
      "ITL": "意大利里拉",
      "JMD": "牙买加元",
      "JOD": "约旦第纳尔",
      "JPY": "日元",
      "KES": "肯尼亚先令",
      "KGS": "吉尔吉斯斯坦索姆",
      "KHR": "柬埔寨瑞尔",
      "KMF": "科摩罗法郎",
      "KPW": "朝鲜元",
      "KRH": "韩元 (1953–1962)",
      "KRO": "韩元 (1945–1953)",
      "KRW": "韩元",
      "KWD": "科威特第纳尔",
      "KYD": "开曼元",
      "KZT": "哈萨克斯坦坚戈",
      "LAK": "老挝基普",
      "LBP": "黎巴嫩镑",
      "LKR": "斯里兰卡卢比",
      "LRD": "利比里亚元",
      "LSL": "莱索托洛蒂",
      "LTL": "立陶宛立特",
      "LTT": "立陶宛塔咯呐司",
      "LUC": "卢森堡可兑换法郎",
      "LUF": "卢森堡法郎",
      "LUL": "卢森堡金融法郎",
      "LVL": "拉脱维亚拉特",
      "LVR": "拉脱维亚卢布",
      "LYD": "利比亚第纳尔",
      "MAD": "摩洛哥迪拉姆",
      "MAF": "摩洛哥法郎",
      "MCF": "摩纳哥法郎",
      "MDC": "摩尔多瓦库邦",
      "MDL": "摩尔多瓦列伊",
      "MGA": "马达加斯加阿里亚里",
      "MGF": "马达加斯加法郎",
      "MKD": "马其顿第纳尔",
      "MKN": "马其顿第纳尔 (1992–1993)",
      "MLF": "马里法郎",
      "MMK": "缅甸元",
      "MNT": "蒙古图格里克",
      "MOP": "澳门币",
      "MRO": "毛里塔尼亚乌吉亚 (1973–2017)",
      "MRU": "毛里塔尼亚乌吉亚",
      "MTL": "马耳他里拉",
      "MTP": "马耳他镑",
      "MUR": "毛里求斯卢比",
      "MVP": "马尔代夫卢比(1947–1981)",
      "MVR": "马尔代夫卢菲亚",
      "MWK": "马拉维克瓦查",
      "MXN": "墨西哥比索",
      "MXP": "墨西哥银比索 (1861–1992)",
      "MXV": "墨西哥（资金）",
      "MYR": "马来西亚林吉特",
      "MZE": "莫桑比克埃斯库多",
      "MZM": "旧莫桑比克美提卡",
      "MZN": "莫桑比克美提卡",
      "NAD": "纳米比亚元",
      "NGN": "尼日利亚奈拉",
      "NIC": "尼加拉瓜科多巴 (1988–1991)",
      "NIO": "尼加拉瓜科多巴",
      "NLG": "荷兰盾",
      "NOK": "挪威克朗",
      "NPR": "尼泊尔卢比",
      "NZD": "新西兰元",
      "OMR": "阿曼里亚尔",
      "PAB": "巴拿马巴波亚",
      "PEI": "秘鲁印第",
      "PEN": "秘鲁索尔",
      "PES": "秘鲁索尔 (1863–1965)",
      "PGK": "巴布亚新几内亚基那",
      "PHP": "菲律宾比索",
      "PKR": "巴基斯坦卢比",
      "PLN": "波兰兹罗提",
      "PLZ": "波兰兹罗提 (1950–1995)",
      "PTE": "葡萄牙埃斯库多",
      "PYG": "巴拉圭瓜拉尼",
      "QAR": "卡塔尔里亚尔",
      "RHD": "罗得西亚元",
      "ROL": "旧罗马尼亚列伊",
      "RON": "罗马尼亚列伊",
      "RSD": "塞尔维亚第纳尔",
      "RUB": "俄罗斯卢布",
      "RUR": "俄国卢布 (1991–1998)",
      "RWF": "卢旺达法郎",
      "SAR": "沙特里亚尔",
      "SBD": "所罗门群岛元",
      "SCR": "塞舌尔卢比",
      "SDD": "苏丹第纳尔 (1992–2007)",
      "SDG": "苏丹镑",
      "SDP": "旧苏丹镑",
      "SEK": "瑞典克朗",
      "SGD": "新加坡元",
      "SHP": "圣赫勒拿群岛磅",
      "SIT": "斯洛文尼亚托拉尔",
      "SKK": "斯洛伐克克朗",
      "SLL": "塞拉利昂利昂",
      "SOS": "索马里先令",
      "SRD": "苏里南元",
      "SRG": "苏里南盾",
      "SSP": "南苏丹镑",
      "STD": "圣多美和普林西比多布拉 (1977–2017)",
      "STN": "圣多美和普林西比多布拉",
      "SUR": "苏联卢布",
      "SVC": "萨尔瓦多科朗",
      "SYP": "叙利亚镑",
      "SZL": "斯威士兰里兰吉尼",
      "THB": "泰铢",
      "TJR": "塔吉克斯坦卢布",
      "TJS": "塔吉克斯坦索莫尼",
      "TMM": "土库曼斯坦马纳特 (1993–2009)",
      "TMT": "土库曼斯坦马纳特",
      "TND": "突尼斯第纳尔",
      "TOP": "汤加潘加",
      "TPE": "帝汶埃斯库多",
      "TRL": "土耳其里拉 (1922–2005)",
      "TRY": "土耳其里拉",
      "TTD": "特立尼达和多巴哥元",
      "TWD": "新台币",
      "TZS": "坦桑尼亚先令",
      "UAH": "乌克兰格里夫纳",
      "UAK": "乌克兰币",
      "UGS": "乌干达先令 (1966–1987)",
      "UGX": "乌干达先令",
      "USD": "美元",
      "USN": "美元（次日）",
      "USS": "美元（当日）",
      "UYI": "乌拉圭比索（索引单位）",
      "UYP": "乌拉圭比索 (1975–1993)",
      "UYU": "乌拉圭比索",
      "UZS": "乌兹别克斯坦苏姆",
      "VEB": "委内瑞拉玻利瓦尔 (1871–2008)",
      "VEF": "委内瑞拉玻利瓦尔 (2008–2018)",
      "VES": "委内瑞拉玻利瓦尔",
      "VND": "越南盾",
      "VNN": "越南盾 (1978–1985)",
      "VUV": "瓦努阿图瓦图",
      "WST": "萨摩亚塔拉",
      "XAF": "中非法郎",
      "XAG": "银",
      "XAU": "黄金",
      "XBA": "欧洲复合单位",
      "XBB": "欧洲货币联盟",
      "XBC": "欧洲计算单位 (XBC)",
      "XBD": "欧洲计算单位 (XBD)",
      "XCD": "东加勒比元",
      "XDR": "特别提款权",
      "XEU": "欧洲货币单位",
      "XFO": "法国金法郎",
      "XFU": "法国法郎 (UIC)",
      "XOF": "西非法郎",
      "XPD": "钯",
      "XPF": "太平洋法郎",
      "XPT": "铂",
      "XRE": "RINET 基金",
      "XTS": "测试货币代码",
      "XXX": "未知货币",
      "YDD": "也门第纳尔",
      "YER": "也门里亚尔",
      "YUD": "南斯拉夫硬第纳尔 (1966–1990)",
      "YUM": "南斯拉夫新第纳尔 (1994–2002)",
      "YUN": "南斯拉夫可兑换第纳尔 (1990–1992)",
      "YUR": "南斯拉夫改良第纳尔 (1992–1993)",
      "ZAL": "南非兰特 (金融)",
      "ZAR": "南非兰特",
      "ZMK": "赞比亚克瓦查 (1968–2012)",
      "ZMW": "赞比亚克瓦查",
      "ZRN": "新扎伊尔 (1993–1998)",
      "ZRZ": "扎伊尔 (1971–1993)",
      "ZWD": "津巴布韦元 (1980–2008)",
      "ZWL": "津巴布韦元 (2009)",
      "ZWR": "津巴布韦元 (2008)",
    };
  }-*/;
}
