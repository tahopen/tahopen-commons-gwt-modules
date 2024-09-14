package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_ja extends com.google.gwt.i18n.client.CurrencyList_ {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("JPY", "￥", 0, "JP¥", "¥");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "JPY", "￥", 0, "JP¥", "¥"];
  }-*/;
  
  @Override
  protected HashMap<String, CurrencyData> loadCurrencyMapJava() {
    HashMap<String, CurrencyData> result = super.loadCurrencyMapJava();
    // アンドラ ペセタ
    result.put("ADP", new CurrencyDataImpl("ADP", "ADP", 128, "ADP", "ADP"));
    // アラブ首長国連邦ディルハム
    result.put("AED", new CurrencyDataImpl("AED", "DH", 2, "DH", "dh"));
    // アフガニスタン アフガニー (1927–2002)
    result.put("AFA", new CurrencyDataImpl("AFA", "AFA", 130, "AFA", "AFA"));
    // アフガニスタン アフガニー
    result.put("AFN", new CurrencyDataImpl("AFN", "AFN", 0, "AFN", "Af."));
    // アルバニア レク (1946–1965)
    result.put("ALK", new CurrencyDataImpl("ALK", "ALK", 130, "ALK", "ALK"));
    // アルバニア レク
    result.put("ALL", new CurrencyDataImpl("ALL", "ALL", 0, "ALL", "Lek"));
    // アルメニア ドラム
    result.put("AMD", new CurrencyDataImpl("AMD", "AMD", 2, "AMD", "Dram"));
    // オランダ領アンティル ギルダー
    result.put("ANG", new CurrencyDataImpl("ANG", "ANG", 2, "ANG", "ANG"));
    // アンゴラ クワンザ
    result.put("AOA", new CurrencyDataImpl("AOA", "AOA", 2, "AOA", "Kz"));
    // アンゴラ クワンザ (1977–1991)
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130, "AOK", "AOK"));
    // アンゴラ 新クワンザ (1990–2000)
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130, "AON", "AON"));
    // アンゴラ 旧クワンザ (1995–1999)
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130, "AOR", "AOR"));
    // アルゼンチン アゥストラール
    result.put("ARA", new CurrencyDataImpl("ARA", "ARA", 130, "ARA", "ARA"));
    // アルゼンチン・ペソ・レイ（1970–1983）
    result.put("ARL", new CurrencyDataImpl("ARL", "ARL", 130, "ARL", "ARL"));
    // アルゼンチン・ペソ（1881–1970）
    result.put("ARM", new CurrencyDataImpl("ARM", "ARM", 130, "ARM", "ARM"));
    // アルゼンチン ペソ (1983–1985)
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130, "ARP", "ARP"));
    // アルゼンチン ペソ
    result.put("ARS", new CurrencyDataImpl("ARS", "AR$", 2, "AR$", "$"));
    // オーストリア シリング
    result.put("ATS", new CurrencyDataImpl("ATS", "ATS", 130, "ATS", "ATS"));
    // オーストラリア ドル
    result.put("AUD", new CurrencyDataImpl("AUD", "A$", 2, "AU$", "$"));
    // アルバ ギルダー
    result.put("AWG", new CurrencyDataImpl("AWG", "AWG", 2, "AWG", "Afl."));
    // アゼルバイジャン マナト (1993–2006)
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130, "AZM", "AZM"));
    // アゼルバイジャン マナト
    result.put("AZN", new CurrencyDataImpl("AZN", "AZN", 2, "AZN", "man."));
    // ボスニア・ヘルツェゴビナ ディナール (1992–1994)
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130, "BAD", "BAD"));
    // ボスニア・ヘルツェゴビナ 兌換マルク (BAM)
    result.put("BAM", new CurrencyDataImpl("BAM", "BAM", 2, "BAM", "KM"));
    // ボスニア・ヘルツェゴビナ 新ディナール（1994–1997）
    result.put("BAN", new CurrencyDataImpl("BAN", "BAN", 130, "BAN", "BAN"));
    // バルバドス ドル
    result.put("BBD", new CurrencyDataImpl("BBD", "BBD", 2, "BBD", "$"));
    // バングラデシュ タカ
    result.put("BDT", new CurrencyDataImpl("BDT", "Tk", 2, "Tk", "৳"));
    // ベルギー フラン (BEC)
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 130, "BEC", "BEC"));
    // ベルギー フラン
    result.put("BEF", new CurrencyDataImpl("BEF", "BEF", 130, "BEF", "BEF"));
    // ベルギー フラン (BEL)
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 130, "BEL", "BEL"));
    // ブルガリア レフ
    result.put("BGL", new CurrencyDataImpl("BGL", "BGL", 130, "BGL", "BGL"));
    // ブルガリア社会主義 レフ
    result.put("BGM", new CurrencyDataImpl("BGM", "BGM", 130, "BGM", "BGM"));
    // ブルガリア 新レフ
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2, "BGN", "lev"));
    // ブルガリア レフ（1879–1952）
    result.put("BGO", new CurrencyDataImpl("BGO", "BGO", 130, "BGO", "BGO"));
    // バーレーン ディナール
    result.put("BHD", new CurrencyDataImpl("BHD", "BHD", 3, "BHD", "din"));
    // ブルンジ フラン
    result.put("BIF", new CurrencyDataImpl("BIF", "BIF", 0, "BIF", "FBu"));
    // バミューダ ドル
    result.put("BMD", new CurrencyDataImpl("BMD", "BMD", 2, "BMD", "$"));
    // ブルネイ ドル
    result.put("BND", new CurrencyDataImpl("BND", "BND", 2, "BND", "$"));
    // ボリビア ボリビアーノ
    result.put("BOB", new CurrencyDataImpl("BOB", "BOB", 2, "BOB", "Bs"));
    // ボリビア ボリビアーノ (1863–1963)
    result.put("BOL", new CurrencyDataImpl("BOL", "BOL", 130, "BOL", "BOL"));
    // ボリビア ペソ
    result.put("BOP", new CurrencyDataImpl("BOP", "BOP", 130, "BOP", "BOP"));
    // ボリビア (Mvdol)
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 130, "BOV", "BOV"));
    // ブラジル 新クルゼイロ (1967–1986)
    result.put("BRB", new CurrencyDataImpl("BRB", "BRB", 130, "BRB", "BRB"));
    // ブラジル クルザード (1986–1989)
    result.put("BRC", new CurrencyDataImpl("BRC", "BRC", 130, "BRC", "BRC"));
    // ブラジル クルゼイロ (1990–1993)
    result.put("BRE", new CurrencyDataImpl("BRE", "BRE", 130, "BRE", "BRE"));
    // ブラジル レアル
    result.put("BRL", new CurrencyDataImpl("BRL", "R$", 2, "R$", "R$"));
    // ブラジル 新クルザード (1989–1990)
    result.put("BRN", new CurrencyDataImpl("BRN", "BRN", 130, "BRN", "BRN"));
    // ブラジル クルゼイロ (1993–1994)
    result.put("BRR", new CurrencyDataImpl("BRR", "BRR", 130, "BRR", "BRR"));
    // ブラジル クルゼイロ（1942–1967）
    result.put("BRZ", new CurrencyDataImpl("BRZ", "BRZ", 130, "BRZ", "BRZ"));
    // バハマ ドル
    result.put("BSD", new CurrencyDataImpl("BSD", "BSD", 2, "BSD", "$"));
    // ブータン ニュルタム
    result.put("BTN", new CurrencyDataImpl("BTN", "BTN", 2, "BTN", "Nu."));
    // ビルマ チャット
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130, "BUK", "BUK"));
    // ボツワナ プラ
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2, "BWP", "P"));
    // ベラルーシ 新ルーブル (1994–1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130, "BYB", "BYB"));
    // ベラルーシ ルーブル
    result.put("BYN", new CurrencyDataImpl("BYN", "BYN", 2, "BYN", "BYN"));
    // ベラルーシ ルーブル (2000–2016)
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 128, "BYR", "BYR"));
    // ベリーズ ドル
    result.put("BZD", new CurrencyDataImpl("BZD", "BZD", 2, "BZD", "$"));
    // カナダ ドル
    result.put("CAD", new CurrencyDataImpl("CAD", "CA$", 2, "C$", "$"));
    // コンゴ フラン
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2, "CDF", "FrCD"));
    // ユーロ (WIR)
    result.put("CHE", new CurrencyDataImpl("CHE", "CHE", 130, "CHE", "CHE"));
    // スイス フラン
    result.put("CHF", new CurrencyDataImpl("CHF", "CHF", 2, "CHF", "CHF"));
    // フラン (WIR)
    result.put("CHW", new CurrencyDataImpl("CHW", "CHW", 130, "CHW", "CHW"));
    // チリ エスクード
    result.put("CLE", new CurrencyDataImpl("CLE", "CLE", 130, "CLE", "CLE"));
    // チリ ウニダ・デ・フォメント (UF)
    result.put("CLF", new CurrencyDataImpl("CLF", "CLF", 132, "CLF", "CLF"));
    // チリ ペソ
    result.put("CLP", new CurrencyDataImpl("CLP", "CL$", 0, "CL$", "$"));
    // 中国人民元(オフショア)
    result.put("CNH", new CurrencyDataImpl("CNH", "CNH", 130, "CNH", "CNH"));
    // 中国人民銀行ドル
    result.put("CNX", new CurrencyDataImpl("CNX", "CNX", 130, "CNX", "CNX"));
    // 中国人民元
    result.put("CNY", new CurrencyDataImpl("CNY", "元", 2, "RMB¥", "¥"));
    // コロンビア ペソ
    result.put("COP", new CurrencyDataImpl("COP", "COL$", 2, "COL$", "$"));
    // コロンビア レアル （UVR)
    result.put("COU", new CurrencyDataImpl("COU", "COU", 130, "COU", "COU"));
    // コスタリカ コロン
    result.put("CRC", new CurrencyDataImpl("CRC", "CR₡", 2, "CR₡", "₡"));
    // セルビア ディナール (2002–2006)
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130, "CSD", "CSD"));
    // チェコスロバキア コルナ
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130, "CSK", "CSK"));
    // キューバ 兌換ペソ
    result.put("CUC", new CurrencyDataImpl("CUC", "CUC", 2, "CUC", "$"));
    // キューバ ペソ
    result.put("CUP", new CurrencyDataImpl("CUP", "$MN", 2, "$MN", "$"));
    // カーボベルデ エスクード
    result.put("CVE", new CurrencyDataImpl("CVE", "CVE", 2, "CVE", "CVE"));
    // キプロス ポンド
    result.put("CYP", new CurrencyDataImpl("CYP", "CYP", 130, "CYP", "CYP"));
    // チェコ コルナ
    result.put("CZK", new CurrencyDataImpl("CZK", "Kč", 2, "Kč", "Kč"));
    // 東ドイツ マルク
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130, "DDM", "DDM"));
    // ドイツ マルク
    result.put("DEM", new CurrencyDataImpl("DEM", "DEM", 130, "DEM", "DEM"));
    // ジブチ フラン
    result.put("DJF", new CurrencyDataImpl("DJF", "Fdj", 0, "Fdj", "Fdj"));
    // デンマーク クローネ
    result.put("DKK", new CurrencyDataImpl("DKK", "kr", 2, "kr", "kr"));
    // ドミニカ ペソ
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$", "$"));
    // アルジェリア ディナール
    result.put("DZD", new CurrencyDataImpl("DZD", "DZD", 2, "DZD", "din"));
    // エクアドル スクレ
    result.put("ECS", new CurrencyDataImpl("ECS", "ECS", 130, "ECS", "ECS"));
    // エクアドル (UVC)
    result.put("ECV", new CurrencyDataImpl("ECV", "ECV", 130, "ECV", "ECV"));
    // エストニア クルーン
    result.put("EEK", new CurrencyDataImpl("EEK", "EEK", 130, "EEK", "EEK"));
    // エジプト ポンド
    result.put("EGP", new CurrencyDataImpl("EGP", "LE", 2, "LE", "E£"));
    // エリトリア ナクファ
    result.put("ERN", new CurrencyDataImpl("ERN", "ERN", 2, "ERN", "Nfk"));
    // スペインペセタ（勘定A）
    result.put("ESA", new CurrencyDataImpl("ESA", "ESA", 130, "ESA", "ESA"));
    // スペイン 兌換ペセタ
    result.put("ESB", new CurrencyDataImpl("ESB", "ESB", 130, "ESB", "ESB"));
    // スペイン ペセタ
    result.put("ESP", new CurrencyDataImpl("ESP", "ESP", 128, "ESP", "ESP"));
    // エチオピア ブル
    result.put("ETB", new CurrencyDataImpl("ETB", "ETB", 2, "ETB", "Birr"));
    // ユーロ
    result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€", "€"));
    // フィンランド マルカ
    result.put("FIM", new CurrencyDataImpl("FIM", "FIM", 130, "FIM", "FIM"));
    // フィジー ドル
    result.put("FJD", new CurrencyDataImpl("FJD", "FJD", 2, "FJD", "$"));
    // フォークランド（マルビナス）諸島 ポンド
    result.put("FKP", new CurrencyDataImpl("FKP", "FKP", 2, "FKP", "£"));
    // フランス フラン
    result.put("FRF", new CurrencyDataImpl("FRF", "FRF", 130, "FRF", "FRF"));
    // 英国ポンド
    result.put("GBP", new CurrencyDataImpl("GBP", "£", 2, "GB£", "£"));
    // ジョージア クーポン ラリ
    result.put("GEK", new CurrencyDataImpl("GEK", "GEK", 130, "GEK", "GEK"));
    // ジョージア ラリ
    result.put("GEL", new CurrencyDataImpl("GEL", "₾", 2, "₾", "GEL"));
    // ガーナ セディ (1979–2007)
    result.put("GHC", new CurrencyDataImpl("GHC", "GHC", 130, "GHC", "GHC"));
    // ガーナ セディ
    result.put("GHS", new CurrencyDataImpl("GHS", "GHS", 2, "GHS", "GHS"));
    // ジブラルタル ポンド
    result.put("GIP", new CurrencyDataImpl("GIP", "GIP", 2, "GIP", "£"));
    // ガンビア ダラシ
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2, "GMD", "GMD"));
    // ギニア フラン
    result.put("GNF", new CurrencyDataImpl("GNF", "GNF", 0, "GNF", "FG"));
    // ギニア シリー
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130, "GNS", "GNS"));
    // 赤道ギニア エクウェレ
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130, "GQE", "GQE"));
    // ギリシャ ドラクマ
    result.put("GRD", new CurrencyDataImpl("GRD", "GRD", 130, "GRD", "GRD"));
    // グアテマラ ケツァル
    result.put("GTQ", new CurrencyDataImpl("GTQ", "GTQ", 2, "GTQ", "Q"));
    // ポルトガル領ギニア エスクード
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130, "GWE", "GWE"));
    // ギニアビサウ ペソ
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 130, "GWP", "GWP"));
    // ガイアナ ドル
    result.put("GYD", new CurrencyDataImpl("GYD", "GYD", 2, "GYD", "$"));
    // 香港ドル
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$", "$"));
    // ホンジュラス レンピラ
    result.put("HNL", new CurrencyDataImpl("HNL", "L", 2, "L", "L"));
    // クロアチア ディナール
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130, "HRD", "HRD"));
    // クロアチア クーナ
    result.put("HRK", new CurrencyDataImpl("HRK", "HRK", 2, "HRK", "kn"));
    // ハイチ グールド
    result.put("HTG", new CurrencyDataImpl("HTG", "HTG", 2, "HTG", "HTG"));
    // ハンガリー フォリント
    result.put("HUF", new CurrencyDataImpl("HUF", "HUF", 2, "HUF", "Ft"));
    // インドネシア ルピア
    result.put("IDR", new CurrencyDataImpl("IDR", "IDR", 2, "IDR", "Rp"));
    // アイリッシュ ポンド
    result.put("IEP", new CurrencyDataImpl("IEP", "IEP", 130, "IEP", "IEP"));
    // イスラエル ポンド
    result.put("ILP", new CurrencyDataImpl("ILP", "ILP", 130, "ILP", "ILP"));
    // イスラエル シェケル (1980–1985)
    result.put("ILR", new CurrencyDataImpl("ILR", "ILR", 130, "ILR", "ILR"));
    // イスラエル新シェケル
    result.put("ILS", new CurrencyDataImpl("ILS", "₪", 2, "IL₪", "₪"));
    // インド ルピー
    result.put("INR", new CurrencyDataImpl("INR", "₹", 2, "Rs", "₹"));
    // イラク ディナール
    result.put("IQD", new CurrencyDataImpl("IQD", "IQD", 0, "IQD", "din"));
    // イラン リアル
    result.put("IRR", new CurrencyDataImpl("IRR", "IRR", 0, "IRR", "Rial"));
    // アイスランド クローナ (1918–1981)
    result.put("ISJ", new CurrencyDataImpl("ISJ", "ISJ", 130, "ISJ", "ISJ"));
    // アイスランド クローナ
    result.put("ISK", new CurrencyDataImpl("ISK", "kr", 0, "kr", "kr"));
    // イタリア リラ
    result.put("ITL", new CurrencyDataImpl("ITL", "ITL", 128, "ITL", "ITL"));
    // ジャマイカ ドル
    result.put("JMD", new CurrencyDataImpl("JMD", "JA$", 2, "JA$", "$"));
    // ヨルダン ディナール
    result.put("JOD", new CurrencyDataImpl("JOD", "JOD", 3, "JOD", "din"));
    // 日本円
    result.put("JPY", new CurrencyDataImpl("JPY", "￥", 0, "JP¥", "¥"));
    // ケニア シリング
    result.put("KES", new CurrencyDataImpl("KES", "Ksh", 2, "Ksh", "Ksh"));
    // キルギス ソム
    result.put("KGS", new CurrencyDataImpl("KGS", "KGS", 2, "KGS", "KGS"));
    // カンボジア リエル
    result.put("KHR", new CurrencyDataImpl("KHR", "KHR", 2, "KHR", "Riel"));
    // コモロ フラン
    result.put("KMF", new CurrencyDataImpl("KMF", "KMF", 0, "KMF", "CF"));
    // 北朝鮮ウォン
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 0, "KPW", "₩"));
    // 韓国 ファン（1953–1962）
    result.put("KRH", new CurrencyDataImpl("KRH", "KRH", 130, "KRH", "KRH"));
    // 韓国 ウォン（1945–1953）
    result.put("KRO", new CurrencyDataImpl("KRO", "KRO", 130, "KRO", "KRO"));
    // 韓国ウォン
    result.put("KRW", new CurrencyDataImpl("KRW", "₩", 0, "KR₩", "₩"));
    // クウェート ディナール
    result.put("KWD", new CurrencyDataImpl("KWD", "KWD", 3, "KWD", "din"));
    // ケイマン諸島 ドル
    result.put("KYD", new CurrencyDataImpl("KYD", "KYD", 2, "KYD", "$"));
    // カザフスタン テンゲ
    result.put("KZT", new CurrencyDataImpl("KZT", "KZT", 2, "KZT", "₸"));
    // ラオス キープ
    result.put("LAK", new CurrencyDataImpl("LAK", "LAK", 0, "LAK", "₭"));
    // レバノン ポンド
    result.put("LBP", new CurrencyDataImpl("LBP", "LBP", 0, "LBP", "L£"));
    // スリランカ ルピー
    result.put("LKR", new CurrencyDataImpl("LKR", "SLRs", 2, "SLRs", "Rs"));
    // リベリア ドル
    result.put("LRD", new CurrencyDataImpl("LRD", "LRD", 2, "LRD", "$"));
    // レソト ロティ
    result.put("LSL", new CurrencyDataImpl("LSL", "LSL", 2, "LSL", "LSL"));
    // リトアニア リタス
    result.put("LTL", new CurrencyDataImpl("LTL", "LTL", 130, "LTL", "Lt"));
    // リトアニア タロナ
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130, "LTT", "LTT"));
    // ルクセンブルク 兌換フラン
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 130, "LUC", "LUC"));
    // ルクセンブルグ フラン
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128, "LUF", "LUF"));
    // ルクセンブルク 金融フラン
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 130, "LUL", "LUL"));
    // ラトビア ラッツ
    result.put("LVL", new CurrencyDataImpl("LVL", "LVL", 130, "LVL", "Ls"));
    // ラトビア ルーブル
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130, "LVR", "LVR"));
    // リビア ディナール
    result.put("LYD", new CurrencyDataImpl("LYD", "LYD", 3, "LYD", "din"));
    // モロッコ ディルハム
    result.put("MAD", new CurrencyDataImpl("MAD", "MAD", 2, "MAD", "MAD"));
    // モロッコ フラン
    result.put("MAF", new CurrencyDataImpl("MAF", "MAF", 130, "MAF", "MAF"));
    // モネガスク フラン
    result.put("MCF", new CurrencyDataImpl("MCF", "MCF", 130, "MCF", "MCF"));
    // モルドバ クーポン
    result.put("MDC", new CurrencyDataImpl("MDC", "MDC", 130, "MDC", "MDC"));
    // モルドバ レイ
    result.put("MDL", new CurrencyDataImpl("MDL", "MDL", 2, "MDL", "MDL"));
    // マダガスカル アリアリ
    result.put("MGA", new CurrencyDataImpl("MGA", "MGA", 0, "MGA", "Ar"));
    // マラガシ フラン
    result.put("MGF", new CurrencyDataImpl("MGF", "MGF", 128, "MGF", "MGF"));
    // マケドニア デナル
    result.put("MKD", new CurrencyDataImpl("MKD", "MKD", 2, "MKD", "din"));
    // マケドニア ディナール（1992–1993）
    result.put("MKN", new CurrencyDataImpl("MKN", "MKN", 130, "MKN", "MKN"));
    // マリ フラン
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130, "MLF", "MLF"));
    // ミャンマー チャット
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 0, "MMK", "K"));
    // モンゴル トグログ
    result.put("MNT", new CurrencyDataImpl("MNT", "MN₮", 2, "MN₮", "₮"));
    // マカオ パタカ
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP", 2, "MOP", "MOP"));
    // モーリタニア ウギア (1973–2017)
    result.put("MRO", new CurrencyDataImpl("MRO", "MRO", 128, "MRO", "MRO"));
    // モーリタニア ウギア
    result.put("MRU", new CurrencyDataImpl("MRU", "MRU", 2, "MRU", "MRU"));
    // マルタ リラ
    result.put("MTL", new CurrencyDataImpl("MTL", "MTL", 130, "MTL", "MTL"));
    // マルタ ポンド
    result.put("MTP", new CurrencyDataImpl("MTP", "MTP", 130, "MTP", "MTP"));
    // モーリシャス ルピー
    result.put("MUR", new CurrencyDataImpl("MUR", "MUR", 2, "MUR", "Rs"));
    // モルディブ諸島 ルピー
    result.put("MVP", new CurrencyDataImpl("MVP", "MVP", 130, "MVP", "MVP"));
    // モルディブ ルフィア
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2, "MVR", "MVR"));
    // マラウィ クワチャ
    result.put("MWK", new CurrencyDataImpl("MWK", "MWK", 2, "MWK", "MWK"));
    // メキシコ ペソ
    result.put("MXN", new CurrencyDataImpl("MXN", "MX$", 2, "Mex$", "$"));
    // メキシコ ペソ (1861–1992)
    result.put("MXP", new CurrencyDataImpl("MXP", "MXP", 130, "MXP", "MXP"));
    // メキシコ (UDI)
    result.put("MXV", new CurrencyDataImpl("MXV", "MXV", 130, "MXV", "MXV"));
    // マレーシア リンギット
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM", "RM"));
    // モザンピーク エスクード
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130, "MZE", "MZE"));
    // モザンビーク メティカル (1980–2006)
    result.put("MZM", new CurrencyDataImpl("MZM", "MZM", 130, "MZM", "MZM"));
    // モザンビーク メティカル
    result.put("MZN", new CurrencyDataImpl("MZN", "MZN", 2, "MZN", "MTn"));
    // ナミビア ドル
    result.put("NAD", new CurrencyDataImpl("NAD", "NAD", 2, "NAD", "$"));
    // ナイジェリア ナイラ
    result.put("NGN", new CurrencyDataImpl("NGN", "NGN", 2, "NGN", "₦"));
    // ニカラグア コルドバ (1988–1991)
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130, "NIC", "NIC"));
    // ニカラグア コルドバ オロ
    result.put("NIO", new CurrencyDataImpl("NIO", "NIO", 2, "NIO", "C$"));
    // オランダ ギルダー
    result.put("NLG", new CurrencyDataImpl("NLG", "NLG", 130, "NLG", "NLG"));
    // ノルウェー クローネ
    result.put("NOK", new CurrencyDataImpl("NOK", "NOkr", 2, "NOkr", "kr"));
    // ネパール ルピー
    result.put("NPR", new CurrencyDataImpl("NPR", "NPR", 2, "NPR", "Rs"));
    // ニュージーランド ドル
    result.put("NZD", new CurrencyDataImpl("NZD", "NZ$", 2, "NZ$", "$"));
    // オマーン リアル
    result.put("OMR", new CurrencyDataImpl("OMR", "OMR", 3, "OMR", "Rial"));
    // パナマ バルボア
    result.put("PAB", new CurrencyDataImpl("PAB", "B/.", 2, "B/.", "B/."));
    // ペルー インティ
    result.put("PEI", new CurrencyDataImpl("PEI", "PEI", 130, "PEI", "PEI"));
    // ペルー ソル
    result.put("PEN", new CurrencyDataImpl("PEN", "S/.", 2, "S/.", "S/."));
    // ペルー ソル (1863–1965)
    result.put("PES", new CurrencyDataImpl("PES", "PES", 130, "PES", "PES"));
    // パプアニューギニア キナ
    result.put("PGK", new CurrencyDataImpl("PGK", "PGK", 2, "PGK", "PGK"));
    // フィリピン ペソ
    result.put("PHP", new CurrencyDataImpl("PHP", "PHP", 2, "PHP", "₱"));
    // パキスタン ルピー
    result.put("PKR", new CurrencyDataImpl("PKR", "PKRs.", 2, "PKRs.", "Rs"));
    // ポーランド ズウォティ
    result.put("PLN", new CurrencyDataImpl("PLN", "PLN", 2, "PLN", "zł"));
    // ポーランド ズウォティ (1950–1995)
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130, "PLZ", "PLZ"));
    // ポルトガル エスクード
    result.put("PTE", new CurrencyDataImpl("PTE", "PTE", 130, "PTE", "PTE"));
    // パラグアイ グアラニ
    result.put("PYG", new CurrencyDataImpl("PYG", "PYG", 0, "PYG", "Gs"));
    // カタール リアル
    result.put("QAR", new CurrencyDataImpl("QAR", "QAR", 2, "QAR", "Rial"));
    // ローデシア ドル
    result.put("RHD", new CurrencyDataImpl("RHD", "RHD", 130, "RHD", "RHD"));
    // ルーマニア レイ (1952–2006)
    result.put("ROL", new CurrencyDataImpl("ROL", "ROL", 130, "ROL", "ROL"));
    // ルーマニア レイ
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2, "RON", "RON"));
    // ディナール (セルビア)
    result.put("RSD", new CurrencyDataImpl("RSD", "RSD", 0, "RSD", "din"));
    // ロシア ルーブル
    result.put("RUB", new CurrencyDataImpl("RUB", "руб.", 2, "руб.", "руб."));
    // ロシア ルーブル (1991–1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130, "RUR", "RUR"));
    // ルワンダ フラン
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0, "RWF", "RF"));
    // サウジ リヤル
    result.put("SAR", new CurrencyDataImpl("SAR", "SR", 2, "SR", "Rial"));
    // ソロモン諸島 ドル
    result.put("SBD", new CurrencyDataImpl("SBD", "SBD", 2, "SBD", "$"));
    // セーシェル ルピー
    result.put("SCR", new CurrencyDataImpl("SCR", "SCR", 2, "SCR", "SCR"));
    // スーダン ディナール (1992–2007)
    result.put("SDD", new CurrencyDataImpl("SDD", "SDD", 130, "SDD", "SDD"));
    // スーダン ポンド
    result.put("SDG", new CurrencyDataImpl("SDG", "SDG", 2, "SDG", "SDG"));
    // スーダン ポンド (1957–1998)
    result.put("SDP", new CurrencyDataImpl("SDP", "SDP", 130, "SDP", "SDP"));
    // スウェーデン クローナ
    result.put("SEK", new CurrencyDataImpl("SEK", "kr", 2, "kr", "kr"));
    // シンガポール ドル
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$", "$"));
    // セントヘレナ ポンド
    result.put("SHP", new CurrencyDataImpl("SHP", "SHP", 2, "SHP", "£"));
    // スロベニア トラール
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130, "SIT", "SIT"));
    // スロバキア コルナ
    result.put("SKK", new CurrencyDataImpl("SKK", "SKK", 130, "SKK", "SKK"));
    // シエラレオネ レオン
    result.put("SLL", new CurrencyDataImpl("SLL", "SLL", 0, "SLL", "SLL"));
    // ソマリア シリング
    result.put("SOS", new CurrencyDataImpl("SOS", "SOS", 0, "SOS", "SOS"));
    // スリナム ドル
    result.put("SRD", new CurrencyDataImpl("SRD", "SRD", 2, "SRD", "$"));
    // スリナム ギルダー
    result.put("SRG", new CurrencyDataImpl("SRG", "SRG", 130, "SRG", "SRG"));
    // 南スーダン ポンド
    result.put("SSP", new CurrencyDataImpl("SSP", "SSP", 2, "SSP", "SSP"));
    // サントメ・プリンシペ ドブラ (1977–2017)
    result.put("STD", new CurrencyDataImpl("STD", "STD", 128, "STD", "Db"));
    // サントメ・プリンシペ ドブラ
    result.put("STN", new CurrencyDataImpl("STN", "STN", 2, "STN", "STN"));
    // ソ連 ルーブル
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130, "SUR", "SUR"));
    // エルサルバドル コロン
    result.put("SVC", new CurrencyDataImpl("SVC", "SVC", 130, "SVC", "SVC"));
    // シリア ポンド
    result.put("SYP", new CurrencyDataImpl("SYP", "SYP", 0, "SYP", "£"));
    // スワジランド リランゲニ
    result.put("SZL", new CurrencyDataImpl("SZL", "SZL", 2, "SZL", "SZL"));
    // タイ バーツ
    result.put("THB", new CurrencyDataImpl("THB", "THB", 2, "THB", "฿"));
    // タジキスタン ルーブル
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130, "TJR", "TJR"));
    // タジキスタン ソモニ
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2, "TJS", "Som"));
    // トルクメニスタン マナト (1993–2009)
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 128, "TMM", "TMM"));
    // トルクメニスタン マナト
    result.put("TMT", new CurrencyDataImpl("TMT", "TMT", 2, "TMT", "TMT"));
    // チュニジア ディナール
    result.put("TND", new CurrencyDataImpl("TND", "TND", 3, "TND", "din"));
    // トンガ パ・アンガ
    result.put("TOP", new CurrencyDataImpl("TOP", "TOP", 2, "TOP", "T$"));
    // ティモール エスクード
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130, "TPE", "TPE"));
    // トルコ リラ (1922–2005)
    result.put("TRL", new CurrencyDataImpl("TRL", "TRL", 128, "TRL", "TRL"));
    // 新トルコリラ
    result.put("TRY", new CurrencyDataImpl("TRY", "TL", 2, "YTL", "TL"));
    // トリニダード・トバゴ ドル
    result.put("TTD", new CurrencyDataImpl("TTD", "TTD", 2, "TTD", "$"));
    // 新台湾ドル
    result.put("TWD", new CurrencyDataImpl("TWD", "NT$", 2, "NT$", "NT$"));
    // タンザニア シリング
    result.put("TZS", new CurrencyDataImpl("TZS", "TZS", 2, "TZS", "TSh"));
    // ウクライナ グリブナ
    result.put("UAH", new CurrencyDataImpl("UAH", "UAH", 2, "UAH", "₴"));
    // ウクライナ カルボバネツ
    result.put("UAK", new CurrencyDataImpl("UAK", "UAK", 130, "UAK", "UAK"));
    // ウガンダ シリング (1966–1987)
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130, "UGS", "UGS"));
    // ウガンダ シリング
    result.put("UGX", new CurrencyDataImpl("UGX", "UGX", 0, "UGX", "UGX"));
    // 米ドル
    result.put("USD", new CurrencyDataImpl("USD", "$", 2, "US$", "$"));
    // 米ドル (翌日)
    result.put("USN", new CurrencyDataImpl("USN", "USN", 130, "USN", "USN"));
    // 米ドル (当日)
    result.put("USS", new CurrencyDataImpl("USS", "USS", 130, "USS", "USS"));
    // ウルグアイ ペソエン
    result.put("UYI", new CurrencyDataImpl("UYI", "UYI", 128, "UYI", "UYI"));
    // ウルグアイ ペソ (1975–1993)
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130, "UYP", "UYP"));
    // ウルグアイ ペソ
    result.put("UYU", new CurrencyDataImpl("UYU", "UY$", 2, "UY$", "$"));
    // ウズベキスタン スム
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 2, "UZS", "soʼm"));
    // ベネズエラ ボリバル (1871–2008)
    result.put("VEB", new CurrencyDataImpl("VEB", "VEB", 130, "VEB", "VEB"));
    // ベネズエラ ボリバル (2008–2018)
    result.put("VEF", new CurrencyDataImpl("VEF", "VEF", 130, "VEF", "Bs"));
    // ベネズエラ ボリバル
    result.put("VES", new CurrencyDataImpl("VES", "VES", 2, "VES", "VES"));
    // ベトナム ドン
    result.put("VND", new CurrencyDataImpl("VND", "₫", 24, "₫", "₫"));
    // ベトナム ドン（1978–1985）
    result.put("VNN", new CurrencyDataImpl("VNN", "VNN", 130, "VNN", "VNN"));
    // バヌアツ バツ
    result.put("VUV", new CurrencyDataImpl("VUV", "VUV", 0, "VUV", "VUV"));
    // サモア タラ
    result.put("WST", new CurrencyDataImpl("WST", "WST", 2, "WST", "WST"));
    // 中央アフリカ CFA フラン
    result.put("XAF", new CurrencyDataImpl("XAF", "FCFA", 0, "FCFA", "FCFA"));
    // 銀
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 130, "XAG", "XAG"));
    // 金
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 130, "XAU", "XAU"));
    // ヨーロッパ混合単位 (EURCO)
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 130, "XBA", "XBA"));
    // ヨーロッパ通貨単位 (EMU–6)
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 130, "XBB", "XBB"));
    // ヨーロッパ勘定単位 (EUA–9)
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 130, "XBC", "XBC"));
    // ヨーロッパ勘定単位 (EUA–17)
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 130, "XBD", "XBD"));
    // 東カリブ ドル
    result.put("XCD", new CurrencyDataImpl("XCD", "EC$", 2, "EC$", "$"));
    // 特別引き出し権
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 130, "XDR", "XDR"));
    // ヨーロッパ通貨単位
    result.put("XEU", new CurrencyDataImpl("XEU", "XEU", 130, "XEU", "XEU"));
    // フランス金フラン
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 130, "XFO", "XFO"));
    // フランス フラン (UIC)
    result.put("XFU", new CurrencyDataImpl("XFU", "XFU", 130, "XFU", "XFU"));
    // 西アフリカ CFA フラン
    result.put("XOF", new CurrencyDataImpl("XOF", "CFA", 0, "CFA", "CFA"));
    // パラジウム
    result.put("XPD", new CurrencyDataImpl("XPD", "XPD", 130, "XPD", "XPD"));
    // CFP フラン
    result.put("XPF", new CurrencyDataImpl("XPF", "CFPF", 0, "CFPF", "FCFP"));
    // プラチナ
    result.put("XPT", new CurrencyDataImpl("XPT", "XPT", 130, "XPT", "XPT"));
    // RINET基金
    result.put("XRE", new CurrencyDataImpl("XRE", "XRE", 130, "XRE", "XRE"));
    // スクレ
    result.put("XSU", new CurrencyDataImpl("XSU", "XSU", 130, "XSU", "XSU"));
    // テスト用通貨コード
    result.put("XTS", new CurrencyDataImpl("XTS", "XTS", 130, "XTS", "XTS"));
    // UA (アフリカ開発銀行)
    result.put("XUA", new CurrencyDataImpl("XUA", "XUA", 130, "XUA", "XUA"));
    // 不明または無効な通貨
    result.put("XXX", new CurrencyDataImpl("XXX", "XXX", 130, "XXX", "XXX"));
    // イエメン ディナール
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130, "YDD", "YDD"));
    // イエメン リアル
    result.put("YER", new CurrencyDataImpl("YER", "YER", 0, "YER", "Rial"));
    // ユーゴスラビア ハード・ディナール (1966–1990)
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130, "YUD", "YUD"));
    // ユーゴスラビア ノビ・ディナール (1994–2002)
    result.put("YUM", new CurrencyDataImpl("YUM", "YUM", 130, "YUM", "YUM"));
    // ユーゴスラビア 兌換ディナール (1990–1992)
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130, "YUN", "YUN"));
    // ユーゴスラビア 改革ディナール（1992–1993）
    result.put("YUR", new CurrencyDataImpl("YUR", "YUR", 130, "YUR", "YUR"));
    // 南アフリカ ランド (ZAL)
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 130, "ZAL", "ZAL"));
    // 南アフリカ ランド
    result.put("ZAR", new CurrencyDataImpl("ZAR", "ZAR", 2, "ZAR", "R"));
    // ザンビア クワチャ (1968–2012)
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZMK", 128, "ZMK", "ZWK"));
    // ザンビア クワチャ
    result.put("ZMW", new CurrencyDataImpl("ZMW", "ZMW", 2, "ZMW", "ZMW"));
    // ザイール 新ザイール (1993–1998)
    result.put("ZRN", new CurrencyDataImpl("ZRN", "ZRN", 130, "ZRN", "ZRN"));
    // ザイール ザイール (1971–1993)
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"));
    // ジンバブエ ドル (1980–2008)
    result.put("ZWD", new CurrencyDataImpl("ZWD", "ZWD", 128, "ZWD", "ZWD"));
    // ジンバブエ ドル (2009)
    result.put("ZWL", new CurrencyDataImpl("ZWL", "ZWL", 130, "ZWL", "ZWL"));
    // シンバブエ ドル（2008）
    result.put("ZWR", new CurrencyDataImpl("ZWR", "ZWR", 130, "ZWR", "ZWR"));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // アンドラ ペセタ
      "ADP": [ "ADP", "ADP", 128, "ADP", "ADP"],
      // アラブ首長国連邦ディルハム
      "AED": [ "AED", "DH", 2, "DH", "dh"],
      // アフガニスタン アフガニー (1927–2002)
      "AFA": [ "AFA", "AFA", 130, "AFA", "AFA"],
      // アフガニスタン アフガニー
      "AFN": [ "AFN", "AFN", 0, "AFN", "Af."],
      // アルバニア レク (1946–1965)
      "ALK": [ "ALK", "ALK", 130, "ALK", "ALK"],
      // アルバニア レク
      "ALL": [ "ALL", "ALL", 0, "ALL", "Lek"],
      // アルメニア ドラム
      "AMD": [ "AMD", "AMD", 2, "AMD", "Dram"],
      // オランダ領アンティル ギルダー
      "ANG": [ "ANG", "ANG", 2, "ANG", "ANG"],
      // アンゴラ クワンザ
      "AOA": [ "AOA", "AOA", 2, "AOA", "Kz"],
      // アンゴラ クワンザ (1977–1991)
      "AOK": [ "AOK", "AOK", 130, "AOK", "AOK"],
      // アンゴラ 新クワンザ (1990–2000)
      "AON": [ "AON", "AON", 130, "AON", "AON"],
      // アンゴラ 旧クワンザ (1995–1999)
      "AOR": [ "AOR", "AOR", 130, "AOR", "AOR"],
      // アルゼンチン アゥストラール
      "ARA": [ "ARA", "ARA", 130, "ARA", "ARA"],
      // アルゼンチン・ペソ・レイ（1970–1983）
      "ARL": [ "ARL", "ARL", 130, "ARL", "ARL"],
      // アルゼンチン・ペソ（1881–1970）
      "ARM": [ "ARM", "ARM", 130, "ARM", "ARM"],
      // アルゼンチン ペソ (1983–1985)
      "ARP": [ "ARP", "ARP", 130, "ARP", "ARP"],
      // アルゼンチン ペソ
      "ARS": [ "ARS", "AR$", 2, "AR$", "$"],
      // オーストリア シリング
      "ATS": [ "ATS", "ATS", 130, "ATS", "ATS"],
      // オーストラリア ドル
      "AUD": [ "AUD", "A$", 2, "AU$", "$"],
      // アルバ ギルダー
      "AWG": [ "AWG", "AWG", 2, "AWG", "Afl."],
      // アゼルバイジャン マナト (1993–2006)
      "AZM": [ "AZM", "AZM", 130, "AZM", "AZM"],
      // アゼルバイジャン マナト
      "AZN": [ "AZN", "AZN", 2, "AZN", "man."],
      // ボスニア・ヘルツェゴビナ ディナール (1992–1994)
      "BAD": [ "BAD", "BAD", 130, "BAD", "BAD"],
      // ボスニア・ヘルツェゴビナ 兌換マルク (BAM)
      "BAM": [ "BAM", "BAM", 2, "BAM", "KM"],
      // ボスニア・ヘルツェゴビナ 新ディナール（1994–1997）
      "BAN": [ "BAN", "BAN", 130, "BAN", "BAN"],
      // バルバドス ドル
      "BBD": [ "BBD", "BBD", 2, "BBD", "$"],
      // バングラデシュ タカ
      "BDT": [ "BDT", "Tk", 2, "Tk", "৳"],
      // ベルギー フラン (BEC)
      "BEC": [ "BEC", "BEC", 130, "BEC", "BEC"],
      // ベルギー フラン
      "BEF": [ "BEF", "BEF", 130, "BEF", "BEF"],
      // ベルギー フラン (BEL)
      "BEL": [ "BEL", "BEL", 130, "BEL", "BEL"],
      // ブルガリア レフ
      "BGL": [ "BGL", "BGL", 130, "BGL", "BGL"],
      // ブルガリア社会主義 レフ
      "BGM": [ "BGM", "BGM", 130, "BGM", "BGM"],
      // ブルガリア 新レフ
      "BGN": [ "BGN", "BGN", 2, "BGN", "lev"],
      // ブルガリア レフ（1879–1952）
      "BGO": [ "BGO", "BGO", 130, "BGO", "BGO"],
      // バーレーン ディナール
      "BHD": [ "BHD", "BHD", 3, "BHD", "din"],
      // ブルンジ フラン
      "BIF": [ "BIF", "BIF", 0, "BIF", "FBu"],
      // バミューダ ドル
      "BMD": [ "BMD", "BMD", 2, "BMD", "$"],
      // ブルネイ ドル
      "BND": [ "BND", "BND", 2, "BND", "$"],
      // ボリビア ボリビアーノ
      "BOB": [ "BOB", "BOB", 2, "BOB", "Bs"],
      // ボリビア ボリビアーノ (1863–1963)
      "BOL": [ "BOL", "BOL", 130, "BOL", "BOL"],
      // ボリビア ペソ
      "BOP": [ "BOP", "BOP", 130, "BOP", "BOP"],
      // ボリビア (Mvdol)
      "BOV": [ "BOV", "BOV", 130, "BOV", "BOV"],
      // ブラジル 新クルゼイロ (1967–1986)
      "BRB": [ "BRB", "BRB", 130, "BRB", "BRB"],
      // ブラジル クルザード (1986–1989)
      "BRC": [ "BRC", "BRC", 130, "BRC", "BRC"],
      // ブラジル クルゼイロ (1990–1993)
      "BRE": [ "BRE", "BRE", 130, "BRE", "BRE"],
      // ブラジル レアル
      "BRL": [ "BRL", "R$", 2, "R$", "R$"],
      // ブラジル 新クルザード (1989–1990)
      "BRN": [ "BRN", "BRN", 130, "BRN", "BRN"],
      // ブラジル クルゼイロ (1993–1994)
      "BRR": [ "BRR", "BRR", 130, "BRR", "BRR"],
      // ブラジル クルゼイロ（1942–1967）
      "BRZ": [ "BRZ", "BRZ", 130, "BRZ", "BRZ"],
      // バハマ ドル
      "BSD": [ "BSD", "BSD", 2, "BSD", "$"],
      // ブータン ニュルタム
      "BTN": [ "BTN", "BTN", 2, "BTN", "Nu."],
      // ビルマ チャット
      "BUK": [ "BUK", "BUK", 130, "BUK", "BUK"],
      // ボツワナ プラ
      "BWP": [ "BWP", "BWP", 2, "BWP", "P"],
      // ベラルーシ 新ルーブル (1994–1999)
      "BYB": [ "BYB", "BYB", 130, "BYB", "BYB"],
      // ベラルーシ ルーブル
      "BYN": [ "BYN", "BYN", 2, "BYN", "BYN"],
      // ベラルーシ ルーブル (2000–2016)
      "BYR": [ "BYR", "BYR", 128, "BYR", "BYR"],
      // ベリーズ ドル
      "BZD": [ "BZD", "BZD", 2, "BZD", "$"],
      // カナダ ドル
      "CAD": [ "CAD", "CA$", 2, "C$", "$"],
      // コンゴ フラン
      "CDF": [ "CDF", "CDF", 2, "CDF", "FrCD"],
      // ユーロ (WIR)
      "CHE": [ "CHE", "CHE", 130, "CHE", "CHE"],
      // スイス フラン
      "CHF": [ "CHF", "CHF", 2, "CHF", "CHF"],
      // フラン (WIR)
      "CHW": [ "CHW", "CHW", 130, "CHW", "CHW"],
      // チリ エスクード
      "CLE": [ "CLE", "CLE", 130, "CLE", "CLE"],
      // チリ ウニダ・デ・フォメント (UF)
      "CLF": [ "CLF", "CLF", 132, "CLF", "CLF"],
      // チリ ペソ
      "CLP": [ "CLP", "CL$", 0, "CL$", "$"],
      // 中国人民元(オフショア)
      "CNH": [ "CNH", "CNH", 130, "CNH", "CNH"],
      // 中国人民銀行ドル
      "CNX": [ "CNX", "CNX", 130, "CNX", "CNX"],
      // 中国人民元
      "CNY": [ "CNY", "元", 2, "RMB¥", "¥"],
      // コロンビア ペソ
      "COP": [ "COP", "COL$", 2, "COL$", "$"],
      // コロンビア レアル （UVR)
      "COU": [ "COU", "COU", 130, "COU", "COU"],
      // コスタリカ コロン
      "CRC": [ "CRC", "CR₡", 2, "CR₡", "₡"],
      // セルビア ディナール (2002–2006)
      "CSD": [ "CSD", "CSD", 130, "CSD", "CSD"],
      // チェコスロバキア コルナ
      "CSK": [ "CSK", "CSK", 130, "CSK", "CSK"],
      // キューバ 兌換ペソ
      "CUC": [ "CUC", "CUC", 2, "CUC", "$"],
      // キューバ ペソ
      "CUP": [ "CUP", "$MN", 2, "$MN", "$"],
      // カーボベルデ エスクード
      "CVE": [ "CVE", "CVE", 2, "CVE", "CVE"],
      // キプロス ポンド
      "CYP": [ "CYP", "CYP", 130, "CYP", "CYP"],
      // チェコ コルナ
      "CZK": [ "CZK", "Kč", 2, "Kč", "Kč"],
      // 東ドイツ マルク
      "DDM": [ "DDM", "DDM", 130, "DDM", "DDM"],
      // ドイツ マルク
      "DEM": [ "DEM", "DEM", 130, "DEM", "DEM"],
      // ジブチ フラン
      "DJF": [ "DJF", "Fdj", 0, "Fdj", "Fdj"],
      // デンマーク クローネ
      "DKK": [ "DKK", "kr", 2, "kr", "kr"],
      // ドミニカ ペソ
      "DOP": [ "DOP", "RD$", 2, "RD$", "$"],
      // アルジェリア ディナール
      "DZD": [ "DZD", "DZD", 2, "DZD", "din"],
      // エクアドル スクレ
      "ECS": [ "ECS", "ECS", 130, "ECS", "ECS"],
      // エクアドル (UVC)
      "ECV": [ "ECV", "ECV", 130, "ECV", "ECV"],
      // エストニア クルーン
      "EEK": [ "EEK", "EEK", 130, "EEK", "EEK"],
      // エジプト ポンド
      "EGP": [ "EGP", "LE", 2, "LE", "E£"],
      // エリトリア ナクファ
      "ERN": [ "ERN", "ERN", 2, "ERN", "Nfk"],
      // スペインペセタ（勘定A）
      "ESA": [ "ESA", "ESA", 130, "ESA", "ESA"],
      // スペイン 兌換ペセタ
      "ESB": [ "ESB", "ESB", 130, "ESB", "ESB"],
      // スペイン ペセタ
      "ESP": [ "ESP", "ESP", 128, "ESP", "ESP"],
      // エチオピア ブル
      "ETB": [ "ETB", "ETB", 2, "ETB", "Birr"],
      // ユーロ
      "EUR": [ "EUR", "€", 2, "€", "€"],
      // フィンランド マルカ
      "FIM": [ "FIM", "FIM", 130, "FIM", "FIM"],
      // フィジー ドル
      "FJD": [ "FJD", "FJD", 2, "FJD", "$"],
      // フォークランド（マルビナス）諸島 ポンド
      "FKP": [ "FKP", "FKP", 2, "FKP", "£"],
      // フランス フラン
      "FRF": [ "FRF", "FRF", 130, "FRF", "FRF"],
      // 英国ポンド
      "GBP": [ "GBP", "£", 2, "GB£", "£"],
      // ジョージア クーポン ラリ
      "GEK": [ "GEK", "GEK", 130, "GEK", "GEK"],
      // ジョージア ラリ
      "GEL": [ "GEL", "₾", 2, "₾", "GEL"],
      // ガーナ セディ (1979–2007)
      "GHC": [ "GHC", "GHC", 130, "GHC", "GHC"],
      // ガーナ セディ
      "GHS": [ "GHS", "GHS", 2, "GHS", "GHS"],
      // ジブラルタル ポンド
      "GIP": [ "GIP", "GIP", 2, "GIP", "£"],
      // ガンビア ダラシ
      "GMD": [ "GMD", "GMD", 2, "GMD", "GMD"],
      // ギニア フラン
      "GNF": [ "GNF", "GNF", 0, "GNF", "FG"],
      // ギニア シリー
      "GNS": [ "GNS", "GNS", 130, "GNS", "GNS"],
      // 赤道ギニア エクウェレ
      "GQE": [ "GQE", "GQE", 130, "GQE", "GQE"],
      // ギリシャ ドラクマ
      "GRD": [ "GRD", "GRD", 130, "GRD", "GRD"],
      // グアテマラ ケツァル
      "GTQ": [ "GTQ", "GTQ", 2, "GTQ", "Q"],
      // ポルトガル領ギニア エスクード
      "GWE": [ "GWE", "GWE", 130, "GWE", "GWE"],
      // ギニアビサウ ペソ
      "GWP": [ "GWP", "GWP", 130, "GWP", "GWP"],
      // ガイアナ ドル
      "GYD": [ "GYD", "GYD", 2, "GYD", "$"],
      // 香港ドル
      "HKD": [ "HKD", "HK$", 2, "HK$", "$"],
      // ホンジュラス レンピラ
      "HNL": [ "HNL", "L", 2, "L", "L"],
      // クロアチア ディナール
      "HRD": [ "HRD", "HRD", 130, "HRD", "HRD"],
      // クロアチア クーナ
      "HRK": [ "HRK", "HRK", 2, "HRK", "kn"],
      // ハイチ グールド
      "HTG": [ "HTG", "HTG", 2, "HTG", "HTG"],
      // ハンガリー フォリント
      "HUF": [ "HUF", "HUF", 2, "HUF", "Ft"],
      // インドネシア ルピア
      "IDR": [ "IDR", "IDR", 2, "IDR", "Rp"],
      // アイリッシュ ポンド
      "IEP": [ "IEP", "IEP", 130, "IEP", "IEP"],
      // イスラエル ポンド
      "ILP": [ "ILP", "ILP", 130, "ILP", "ILP"],
      // イスラエル シェケル (1980–1985)
      "ILR": [ "ILR", "ILR", 130, "ILR", "ILR"],
      // イスラエル新シェケル
      "ILS": [ "ILS", "₪", 2, "IL₪", "₪"],
      // インド ルピー
      "INR": [ "INR", "₹", 2, "Rs", "₹"],
      // イラク ディナール
      "IQD": [ "IQD", "IQD", 0, "IQD", "din"],
      // イラン リアル
      "IRR": [ "IRR", "IRR", 0, "IRR", "Rial"],
      // アイスランド クローナ (1918–1981)
      "ISJ": [ "ISJ", "ISJ", 130, "ISJ", "ISJ"],
      // アイスランド クローナ
      "ISK": [ "ISK", "kr", 0, "kr", "kr"],
      // イタリア リラ
      "ITL": [ "ITL", "ITL", 128, "ITL", "ITL"],
      // ジャマイカ ドル
      "JMD": [ "JMD", "JA$", 2, "JA$", "$"],
      // ヨルダン ディナール
      "JOD": [ "JOD", "JOD", 3, "JOD", "din"],
      // 日本円
      "JPY": [ "JPY", "￥", 0, "JP¥", "¥"],
      // ケニア シリング
      "KES": [ "KES", "Ksh", 2, "Ksh", "Ksh"],
      // キルギス ソム
      "KGS": [ "KGS", "KGS", 2, "KGS", "KGS"],
      // カンボジア リエル
      "KHR": [ "KHR", "KHR", 2, "KHR", "Riel"],
      // コモロ フラン
      "KMF": [ "KMF", "KMF", 0, "KMF", "CF"],
      // 北朝鮮ウォン
      "KPW": [ "KPW", "KPW", 0, "KPW", "₩"],
      // 韓国 ファン（1953–1962）
      "KRH": [ "KRH", "KRH", 130, "KRH", "KRH"],
      // 韓国 ウォン（1945–1953）
      "KRO": [ "KRO", "KRO", 130, "KRO", "KRO"],
      // 韓国ウォン
      "KRW": [ "KRW", "₩", 0, "KR₩", "₩"],
      // クウェート ディナール
      "KWD": [ "KWD", "KWD", 3, "KWD", "din"],
      // ケイマン諸島 ドル
      "KYD": [ "KYD", "KYD", 2, "KYD", "$"],
      // カザフスタン テンゲ
      "KZT": [ "KZT", "KZT", 2, "KZT", "₸"],
      // ラオス キープ
      "LAK": [ "LAK", "LAK", 0, "LAK", "₭"],
      // レバノン ポンド
      "LBP": [ "LBP", "LBP", 0, "LBP", "L£"],
      // スリランカ ルピー
      "LKR": [ "LKR", "SLRs", 2, "SLRs", "Rs"],
      // リベリア ドル
      "LRD": [ "LRD", "LRD", 2, "LRD", "$"],
      // レソト ロティ
      "LSL": [ "LSL", "LSL", 2, "LSL", "LSL"],
      // リトアニア リタス
      "LTL": [ "LTL", "LTL", 130, "LTL", "Lt"],
      // リトアニア タロナ
      "LTT": [ "LTT", "LTT", 130, "LTT", "LTT"],
      // ルクセンブルク 兌換フラン
      "LUC": [ "LUC", "LUC", 130, "LUC", "LUC"],
      // ルクセンブルグ フラン
      "LUF": [ "LUF", "LUF", 128, "LUF", "LUF"],
      // ルクセンブルク 金融フラン
      "LUL": [ "LUL", "LUL", 130, "LUL", "LUL"],
      // ラトビア ラッツ
      "LVL": [ "LVL", "LVL", 130, "LVL", "Ls"],
      // ラトビア ルーブル
      "LVR": [ "LVR", "LVR", 130, "LVR", "LVR"],
      // リビア ディナール
      "LYD": [ "LYD", "LYD", 3, "LYD", "din"],
      // モロッコ ディルハム
      "MAD": [ "MAD", "MAD", 2, "MAD", "MAD"],
      // モロッコ フラン
      "MAF": [ "MAF", "MAF", 130, "MAF", "MAF"],
      // モネガスク フラン
      "MCF": [ "MCF", "MCF", 130, "MCF", "MCF"],
      // モルドバ クーポン
      "MDC": [ "MDC", "MDC", 130, "MDC", "MDC"],
      // モルドバ レイ
      "MDL": [ "MDL", "MDL", 2, "MDL", "MDL"],
      // マダガスカル アリアリ
      "MGA": [ "MGA", "MGA", 0, "MGA", "Ar"],
      // マラガシ フラン
      "MGF": [ "MGF", "MGF", 128, "MGF", "MGF"],
      // マケドニア デナル
      "MKD": [ "MKD", "MKD", 2, "MKD", "din"],
      // マケドニア ディナール（1992–1993）
      "MKN": [ "MKN", "MKN", 130, "MKN", "MKN"],
      // マリ フラン
      "MLF": [ "MLF", "MLF", 130, "MLF", "MLF"],
      // ミャンマー チャット
      "MMK": [ "MMK", "MMK", 0, "MMK", "K"],
      // モンゴル トグログ
      "MNT": [ "MNT", "MN₮", 2, "MN₮", "₮"],
      // マカオ パタカ
      "MOP": [ "MOP", "MOP", 2, "MOP", "MOP"],
      // モーリタニア ウギア (1973–2017)
      "MRO": [ "MRO", "MRO", 128, "MRO", "MRO"],
      // モーリタニア ウギア
      "MRU": [ "MRU", "MRU", 2, "MRU", "MRU"],
      // マルタ リラ
      "MTL": [ "MTL", "MTL", 130, "MTL", "MTL"],
      // マルタ ポンド
      "MTP": [ "MTP", "MTP", 130, "MTP", "MTP"],
      // モーリシャス ルピー
      "MUR": [ "MUR", "MUR", 2, "MUR", "Rs"],
      // モルディブ諸島 ルピー
      "MVP": [ "MVP", "MVP", 130, "MVP", "MVP"],
      // モルディブ ルフィア
      "MVR": [ "MVR", "MVR", 2, "MVR", "MVR"],
      // マラウィ クワチャ
      "MWK": [ "MWK", "MWK", 2, "MWK", "MWK"],
      // メキシコ ペソ
      "MXN": [ "MXN", "MX$", 2, "Mex$", "$"],
      // メキシコ ペソ (1861–1992)
      "MXP": [ "MXP", "MXP", 130, "MXP", "MXP"],
      // メキシコ (UDI)
      "MXV": [ "MXV", "MXV", 130, "MXV", "MXV"],
      // マレーシア リンギット
      "MYR": [ "MYR", "RM", 2, "RM", "RM"],
      // モザンピーク エスクード
      "MZE": [ "MZE", "MZE", 130, "MZE", "MZE"],
      // モザンビーク メティカル (1980–2006)
      "MZM": [ "MZM", "MZM", 130, "MZM", "MZM"],
      // モザンビーク メティカル
      "MZN": [ "MZN", "MZN", 2, "MZN", "MTn"],
      // ナミビア ドル
      "NAD": [ "NAD", "NAD", 2, "NAD", "$"],
      // ナイジェリア ナイラ
      "NGN": [ "NGN", "NGN", 2, "NGN", "₦"],
      // ニカラグア コルドバ (1988–1991)
      "NIC": [ "NIC", "NIC", 130, "NIC", "NIC"],
      // ニカラグア コルドバ オロ
      "NIO": [ "NIO", "NIO", 2, "NIO", "C$"],
      // オランダ ギルダー
      "NLG": [ "NLG", "NLG", 130, "NLG", "NLG"],
      // ノルウェー クローネ
      "NOK": [ "NOK", "NOkr", 2, "NOkr", "kr"],
      // ネパール ルピー
      "NPR": [ "NPR", "NPR", 2, "NPR", "Rs"],
      // ニュージーランド ドル
      "NZD": [ "NZD", "NZ$", 2, "NZ$", "$"],
      // オマーン リアル
      "OMR": [ "OMR", "OMR", 3, "OMR", "Rial"],
      // パナマ バルボア
      "PAB": [ "PAB", "B/.", 2, "B/.", "B/."],
      // ペルー インティ
      "PEI": [ "PEI", "PEI", 130, "PEI", "PEI"],
      // ペルー ソル
      "PEN": [ "PEN", "S/.", 2, "S/.", "S/."],
      // ペルー ソル (1863–1965)
      "PES": [ "PES", "PES", 130, "PES", "PES"],
      // パプアニューギニア キナ
      "PGK": [ "PGK", "PGK", 2, "PGK", "PGK"],
      // フィリピン ペソ
      "PHP": [ "PHP", "PHP", 2, "PHP", "₱"],
      // パキスタン ルピー
      "PKR": [ "PKR", "PKRs.", 2, "PKRs.", "Rs"],
      // ポーランド ズウォティ
      "PLN": [ "PLN", "PLN", 2, "PLN", "zł"],
      // ポーランド ズウォティ (1950–1995)
      "PLZ": [ "PLZ", "PLZ", 130, "PLZ", "PLZ"],
      // ポルトガル エスクード
      "PTE": [ "PTE", "PTE", 130, "PTE", "PTE"],
      // パラグアイ グアラニ
      "PYG": [ "PYG", "PYG", 0, "PYG", "Gs"],
      // カタール リアル
      "QAR": [ "QAR", "QAR", 2, "QAR", "Rial"],
      // ローデシア ドル
      "RHD": [ "RHD", "RHD", 130, "RHD", "RHD"],
      // ルーマニア レイ (1952–2006)
      "ROL": [ "ROL", "ROL", 130, "ROL", "ROL"],
      // ルーマニア レイ
      "RON": [ "RON", "RON", 2, "RON", "RON"],
      // ディナール (セルビア)
      "RSD": [ "RSD", "RSD", 0, "RSD", "din"],
      // ロシア ルーブル
      "RUB": [ "RUB", "руб.", 2, "руб.", "руб."],
      // ロシア ルーブル (1991–1998)
      "RUR": [ "RUR", "RUR", 130, "RUR", "RUR"],
      // ルワンダ フラン
      "RWF": [ "RWF", "RWF", 0, "RWF", "RF"],
      // サウジ リヤル
      "SAR": [ "SAR", "SR", 2, "SR", "Rial"],
      // ソロモン諸島 ドル
      "SBD": [ "SBD", "SBD", 2, "SBD", "$"],
      // セーシェル ルピー
      "SCR": [ "SCR", "SCR", 2, "SCR", "SCR"],
      // スーダン ディナール (1992–2007)
      "SDD": [ "SDD", "SDD", 130, "SDD", "SDD"],
      // スーダン ポンド
      "SDG": [ "SDG", "SDG", 2, "SDG", "SDG"],
      // スーダン ポンド (1957–1998)
      "SDP": [ "SDP", "SDP", 130, "SDP", "SDP"],
      // スウェーデン クローナ
      "SEK": [ "SEK", "kr", 2, "kr", "kr"],
      // シンガポール ドル
      "SGD": [ "SGD", "S$", 2, "S$", "$"],
      // セントヘレナ ポンド
      "SHP": [ "SHP", "SHP", 2, "SHP", "£"],
      // スロベニア トラール
      "SIT": [ "SIT", "SIT", 130, "SIT", "SIT"],
      // スロバキア コルナ
      "SKK": [ "SKK", "SKK", 130, "SKK", "SKK"],
      // シエラレオネ レオン
      "SLL": [ "SLL", "SLL", 0, "SLL", "SLL"],
      // ソマリア シリング
      "SOS": [ "SOS", "SOS", 0, "SOS", "SOS"],
      // スリナム ドル
      "SRD": [ "SRD", "SRD", 2, "SRD", "$"],
      // スリナム ギルダー
      "SRG": [ "SRG", "SRG", 130, "SRG", "SRG"],
      // 南スーダン ポンド
      "SSP": [ "SSP", "SSP", 2, "SSP", "SSP"],
      // サントメ・プリンシペ ドブラ (1977–2017)
      "STD": [ "STD", "STD", 128, "STD", "Db"],
      // サントメ・プリンシペ ドブラ
      "STN": [ "STN", "STN", 2, "STN", "STN"],
      // ソ連 ルーブル
      "SUR": [ "SUR", "SUR", 130, "SUR", "SUR"],
      // エルサルバドル コロン
      "SVC": [ "SVC", "SVC", 130, "SVC", "SVC"],
      // シリア ポンド
      "SYP": [ "SYP", "SYP", 0, "SYP", "£"],
      // スワジランド リランゲニ
      "SZL": [ "SZL", "SZL", 2, "SZL", "SZL"],
      // タイ バーツ
      "THB": [ "THB", "THB", 2, "THB", "฿"],
      // タジキスタン ルーブル
      "TJR": [ "TJR", "TJR", 130, "TJR", "TJR"],
      // タジキスタン ソモニ
      "TJS": [ "TJS", "TJS", 2, "TJS", "Som"],
      // トルクメニスタン マナト (1993–2009)
      "TMM": [ "TMM", "TMM", 128, "TMM", "TMM"],
      // トルクメニスタン マナト
      "TMT": [ "TMT", "TMT", 2, "TMT", "TMT"],
      // チュニジア ディナール
      "TND": [ "TND", "TND", 3, "TND", "din"],
      // トンガ パ・アンガ
      "TOP": [ "TOP", "TOP", 2, "TOP", "T$"],
      // ティモール エスクード
      "TPE": [ "TPE", "TPE", 130, "TPE", "TPE"],
      // トルコ リラ (1922–2005)
      "TRL": [ "TRL", "TRL", 128, "TRL", "TRL"],
      // 新トルコリラ
      "TRY": [ "TRY", "TL", 2, "YTL", "TL"],
      // トリニダード・トバゴ ドル
      "TTD": [ "TTD", "TTD", 2, "TTD", "$"],
      // 新台湾ドル
      "TWD": [ "TWD", "NT$", 2, "NT$", "NT$"],
      // タンザニア シリング
      "TZS": [ "TZS", "TZS", 2, "TZS", "TSh"],
      // ウクライナ グリブナ
      "UAH": [ "UAH", "UAH", 2, "UAH", "₴"],
      // ウクライナ カルボバネツ
      "UAK": [ "UAK", "UAK", 130, "UAK", "UAK"],
      // ウガンダ シリング (1966–1987)
      "UGS": [ "UGS", "UGS", 130, "UGS", "UGS"],
      // ウガンダ シリング
      "UGX": [ "UGX", "UGX", 0, "UGX", "UGX"],
      // 米ドル
      "USD": [ "USD", "$", 2, "US$", "$"],
      // 米ドル (翌日)
      "USN": [ "USN", "USN", 130, "USN", "USN"],
      // 米ドル (当日)
      "USS": [ "USS", "USS", 130, "USS", "USS"],
      // ウルグアイ ペソエン
      "UYI": [ "UYI", "UYI", 128, "UYI", "UYI"],
      // ウルグアイ ペソ (1975–1993)
      "UYP": [ "UYP", "UYP", 130, "UYP", "UYP"],
      // ウルグアイ ペソ
      "UYU": [ "UYU", "UY$", 2, "UY$", "$"],
      // ウズベキスタン スム
      "UZS": [ "UZS", "UZS", 2, "UZS", "soʼm"],
      // ベネズエラ ボリバル (1871–2008)
      "VEB": [ "VEB", "VEB", 130, "VEB", "VEB"],
      // ベネズエラ ボリバル (2008–2018)
      "VEF": [ "VEF", "VEF", 130, "VEF", "Bs"],
      // ベネズエラ ボリバル
      "VES": [ "VES", "VES", 2, "VES", "VES"],
      // ベトナム ドン
      "VND": [ "VND", "₫", 24, "₫", "₫"],
      // ベトナム ドン（1978–1985）
      "VNN": [ "VNN", "VNN", 130, "VNN", "VNN"],
      // バヌアツ バツ
      "VUV": [ "VUV", "VUV", 0, "VUV", "VUV"],
      // サモア タラ
      "WST": [ "WST", "WST", 2, "WST", "WST"],
      // 中央アフリカ CFA フラン
      "XAF": [ "XAF", "FCFA", 0, "FCFA", "FCFA"],
      // 銀
      "XAG": [ "XAG", "XAG", 130, "XAG", "XAG"],
      // 金
      "XAU": [ "XAU", "XAU", 130, "XAU", "XAU"],
      // ヨーロッパ混合単位 (EURCO)
      "XBA": [ "XBA", "XBA", 130, "XBA", "XBA"],
      // ヨーロッパ通貨単位 (EMU–6)
      "XBB": [ "XBB", "XBB", 130, "XBB", "XBB"],
      // ヨーロッパ勘定単位 (EUA–9)
      "XBC": [ "XBC", "XBC", 130, "XBC", "XBC"],
      // ヨーロッパ勘定単位 (EUA–17)
      "XBD": [ "XBD", "XBD", 130, "XBD", "XBD"],
      // 東カリブ ドル
      "XCD": [ "XCD", "EC$", 2, "EC$", "$"],
      // 特別引き出し権
      "XDR": [ "XDR", "XDR", 130, "XDR", "XDR"],
      // ヨーロッパ通貨単位
      "XEU": [ "XEU", "XEU", 130, "XEU", "XEU"],
      // フランス金フラン
      "XFO": [ "XFO", "XFO", 130, "XFO", "XFO"],
      // フランス フラン (UIC)
      "XFU": [ "XFU", "XFU", 130, "XFU", "XFU"],
      // 西アフリカ CFA フラン
      "XOF": [ "XOF", "CFA", 0, "CFA", "CFA"],
      // パラジウム
      "XPD": [ "XPD", "XPD", 130, "XPD", "XPD"],
      // CFP フラン
      "XPF": [ "XPF", "CFPF", 0, "CFPF", "FCFP"],
      // プラチナ
      "XPT": [ "XPT", "XPT", 130, "XPT", "XPT"],
      // RINET基金
      "XRE": [ "XRE", "XRE", 130, "XRE", "XRE"],
      // スクレ
      "XSU": [ "XSU", "XSU", 130, "XSU", "XSU"],
      // テスト用通貨コード
      "XTS": [ "XTS", "XTS", 130, "XTS", "XTS"],
      // UA (アフリカ開発銀行)
      "XUA": [ "XUA", "XUA", 130, "XUA", "XUA"],
      // 不明または無効な通貨
      "XXX": [ "XXX", "XXX", 130, "XXX", "XXX"],
      // イエメン ディナール
      "YDD": [ "YDD", "YDD", 130, "YDD", "YDD"],
      // イエメン リアル
      "YER": [ "YER", "YER", 0, "YER", "Rial"],
      // ユーゴスラビア ハード・ディナール (1966–1990)
      "YUD": [ "YUD", "YUD", 130, "YUD", "YUD"],
      // ユーゴスラビア ノビ・ディナール (1994–2002)
      "YUM": [ "YUM", "YUM", 130, "YUM", "YUM"],
      // ユーゴスラビア 兌換ディナール (1990–1992)
      "YUN": [ "YUN", "YUN", 130, "YUN", "YUN"],
      // ユーゴスラビア 改革ディナール（1992–1993）
      "YUR": [ "YUR", "YUR", 130, "YUR", "YUR"],
      // 南アフリカ ランド (ZAL)
      "ZAL": [ "ZAL", "ZAL", 130, "ZAL", "ZAL"],
      // 南アフリカ ランド
      "ZAR": [ "ZAR", "ZAR", 2, "ZAR", "R"],
      // ザンビア クワチャ (1968–2012)
      "ZMK": [ "ZMK", "ZMK", 128, "ZMK", "ZWK"],
      // ザンビア クワチャ
      "ZMW": [ "ZMW", "ZMW", 2, "ZMW", "ZMW"],
      // ザイール 新ザイール (1993–1998)
      "ZRN": [ "ZRN", "ZRN", 130, "ZRN", "ZRN"],
      // ザイール ザイール (1971–1993)
      "ZRZ": [ "ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"],
      // ジンバブエ ドル (1980–2008)
      "ZWD": [ "ZWD", "ZWD", 128, "ZWD", "ZWD"],
      // ジンバブエ ドル (2009)
      "ZWL": [ "ZWL", "ZWL", 130, "ZWL", "ZWL"],
      // シンバブエ ドル（2008）
      "ZWR": [ "ZWR", "ZWR", 130, "ZWR", "ZWR"],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("ADP", "アンドラ ペセタ");
    result.put("AED", "アラブ首長国連邦ディルハム");
    result.put("AFA", "アフガニスタン アフガニー (1927–2002)");
    result.put("AFN", "アフガニスタン アフガニー");
    result.put("ALK", "アルバニア レク (1946–1965)");
    result.put("ALL", "アルバニア レク");
    result.put("AMD", "アルメニア ドラム");
    result.put("ANG", "オランダ領アンティル ギルダー");
    result.put("AOA", "アンゴラ クワンザ");
    result.put("AOK", "アンゴラ クワンザ (1977–1991)");
    result.put("AON", "アンゴラ 新クワンザ (1990–2000)");
    result.put("AOR", "アンゴラ 旧クワンザ (1995–1999)");
    result.put("ARA", "アルゼンチン アゥストラール");
    result.put("ARL", "アルゼンチン・ペソ・レイ（1970–1983）");
    result.put("ARM", "アルゼンチン・ペソ（1881–1970）");
    result.put("ARP", "アルゼンチン ペソ (1983–1985)");
    result.put("ARS", "アルゼンチン ペソ");
    result.put("ATS", "オーストリア シリング");
    result.put("AUD", "オーストラリア ドル");
    result.put("AWG", "アルバ ギルダー");
    result.put("AZM", "アゼルバイジャン マナト (1993–2006)");
    result.put("AZN", "アゼルバイジャン マナト");
    result.put("BAD", "ボスニア・ヘルツェゴビナ ディナール (1992–1994)");
    result.put("BAM", "ボスニア・ヘルツェゴビナ 兌換マルク (BAM)");
    result.put("BAN", "ボスニア・ヘルツェゴビナ 新ディナール（1994–1997）");
    result.put("BBD", "バルバドス ドル");
    result.put("BDT", "バングラデシュ タカ");
    result.put("BEC", "ベルギー フラン (BEC)");
    result.put("BEF", "ベルギー フラン");
    result.put("BEL", "ベルギー フラン (BEL)");
    result.put("BGL", "ブルガリア レフ");
    result.put("BGM", "ブルガリア社会主義 レフ");
    result.put("BGN", "ブルガリア 新レフ");
    result.put("BGO", "ブルガリア レフ（1879–1952）");
    result.put("BHD", "バーレーン ディナール");
    result.put("BIF", "ブルンジ フラン");
    result.put("BMD", "バミューダ ドル");
    result.put("BND", "ブルネイ ドル");
    result.put("BOB", "ボリビア ボリビアーノ");
    result.put("BOL", "ボリビア ボリビアーノ (1863–1963)");
    result.put("BOP", "ボリビア ペソ");
    result.put("BOV", "ボリビア (Mvdol)");
    result.put("BRB", "ブラジル 新クルゼイロ (1967–1986)");
    result.put("BRC", "ブラジル クルザード (1986–1989)");
    result.put("BRE", "ブラジル クルゼイロ (1990–1993)");
    result.put("BRL", "ブラジル レアル");
    result.put("BRN", "ブラジル 新クルザード (1989–1990)");
    result.put("BRR", "ブラジル クルゼイロ (1993–1994)");
    result.put("BRZ", "ブラジル クルゼイロ（1942–1967）");
    result.put("BSD", "バハマ ドル");
    result.put("BTN", "ブータン ニュルタム");
    result.put("BUK", "ビルマ チャット");
    result.put("BWP", "ボツワナ プラ");
    result.put("BYB", "ベラルーシ 新ルーブル (1994–1999)");
    result.put("BYN", "ベラルーシ ルーブル");
    result.put("BYR", "ベラルーシ ルーブル (2000–2016)");
    result.put("BZD", "ベリーズ ドル");
    result.put("CAD", "カナダ ドル");
    result.put("CDF", "コンゴ フラン");
    result.put("CHE", "ユーロ (WIR)");
    result.put("CHF", "スイス フラン");
    result.put("CHW", "フラン (WIR)");
    result.put("CLE", "チリ エスクード");
    result.put("CLF", "チリ ウニダ・デ・フォメント (UF)");
    result.put("CLP", "チリ ペソ");
    result.put("CNH", "中国人民元(オフショア)");
    result.put("CNX", "中国人民銀行ドル");
    result.put("CNY", "中国人民元");
    result.put("COP", "コロンビア ペソ");
    result.put("COU", "コロンビア レアル （UVR)");
    result.put("CRC", "コスタリカ コロン");
    result.put("CSD", "セルビア ディナール (2002–2006)");
    result.put("CSK", "チェコスロバキア コルナ");
    result.put("CUC", "キューバ 兌換ペソ");
    result.put("CUP", "キューバ ペソ");
    result.put("CVE", "カーボベルデ エスクード");
    result.put("CYP", "キプロス ポンド");
    result.put("CZK", "チェコ コルナ");
    result.put("DDM", "東ドイツ マルク");
    result.put("DEM", "ドイツ マルク");
    result.put("DJF", "ジブチ フラン");
    result.put("DKK", "デンマーク クローネ");
    result.put("DOP", "ドミニカ ペソ");
    result.put("DZD", "アルジェリア ディナール");
    result.put("ECS", "エクアドル スクレ");
    result.put("ECV", "エクアドル (UVC)");
    result.put("EEK", "エストニア クルーン");
    result.put("EGP", "エジプト ポンド");
    result.put("ERN", "エリトリア ナクファ");
    result.put("ESA", "スペインペセタ（勘定A）");
    result.put("ESB", "スペイン 兌換ペセタ");
    result.put("ESP", "スペイン ペセタ");
    result.put("ETB", "エチオピア ブル");
    result.put("EUR", "ユーロ");
    result.put("FIM", "フィンランド マルカ");
    result.put("FJD", "フィジー ドル");
    result.put("FKP", "フォークランド（マルビナス）諸島 ポンド");
    result.put("FRF", "フランス フラン");
    result.put("GBP", "英国ポンド");
    result.put("GEK", "ジョージア クーポン ラリ");
    result.put("GEL", "ジョージア ラリ");
    result.put("GHC", "ガーナ セディ (1979–2007)");
    result.put("GHS", "ガーナ セディ");
    result.put("GIP", "ジブラルタル ポンド");
    result.put("GMD", "ガンビア ダラシ");
    result.put("GNF", "ギニア フラン");
    result.put("GNS", "ギニア シリー");
    result.put("GQE", "赤道ギニア エクウェレ");
    result.put("GRD", "ギリシャ ドラクマ");
    result.put("GTQ", "グアテマラ ケツァル");
    result.put("GWE", "ポルトガル領ギニア エスクード");
    result.put("GWP", "ギニアビサウ ペソ");
    result.put("GYD", "ガイアナ ドル");
    result.put("HKD", "香港ドル");
    result.put("HNL", "ホンジュラス レンピラ");
    result.put("HRD", "クロアチア ディナール");
    result.put("HRK", "クロアチア クーナ");
    result.put("HTG", "ハイチ グールド");
    result.put("HUF", "ハンガリー フォリント");
    result.put("IDR", "インドネシア ルピア");
    result.put("IEP", "アイリッシュ ポンド");
    result.put("ILP", "イスラエル ポンド");
    result.put("ILR", "イスラエル シェケル (1980–1985)");
    result.put("ILS", "イスラエル新シェケル");
    result.put("INR", "インド ルピー");
    result.put("IQD", "イラク ディナール");
    result.put("IRR", "イラン リアル");
    result.put("ISJ", "アイスランド クローナ (1918–1981)");
    result.put("ISK", "アイスランド クローナ");
    result.put("ITL", "イタリア リラ");
    result.put("JMD", "ジャマイカ ドル");
    result.put("JOD", "ヨルダン ディナール");
    result.put("JPY", "日本円");
    result.put("KES", "ケニア シリング");
    result.put("KGS", "キルギス ソム");
    result.put("KHR", "カンボジア リエル");
    result.put("KMF", "コモロ フラン");
    result.put("KPW", "北朝鮮ウォン");
    result.put("KRH", "韓国 ファン（1953–1962）");
    result.put("KRO", "韓国 ウォン（1945–1953）");
    result.put("KRW", "韓国ウォン");
    result.put("KWD", "クウェート ディナール");
    result.put("KYD", "ケイマン諸島 ドル");
    result.put("KZT", "カザフスタン テンゲ");
    result.put("LAK", "ラオス キープ");
    result.put("LBP", "レバノン ポンド");
    result.put("LKR", "スリランカ ルピー");
    result.put("LRD", "リベリア ドル");
    result.put("LSL", "レソト ロティ");
    result.put("LTL", "リトアニア リタス");
    result.put("LTT", "リトアニア タロナ");
    result.put("LUC", "ルクセンブルク 兌換フラン");
    result.put("LUF", "ルクセンブルグ フラン");
    result.put("LUL", "ルクセンブルク 金融フラン");
    result.put("LVL", "ラトビア ラッツ");
    result.put("LVR", "ラトビア ルーブル");
    result.put("LYD", "リビア ディナール");
    result.put("MAD", "モロッコ ディルハム");
    result.put("MAF", "モロッコ フラン");
    result.put("MCF", "モネガスク フラン");
    result.put("MDC", "モルドバ クーポン");
    result.put("MDL", "モルドバ レイ");
    result.put("MGA", "マダガスカル アリアリ");
    result.put("MGF", "マラガシ フラン");
    result.put("MKD", "マケドニア デナル");
    result.put("MKN", "マケドニア ディナール（1992–1993）");
    result.put("MLF", "マリ フラン");
    result.put("MMK", "ミャンマー チャット");
    result.put("MNT", "モンゴル トグログ");
    result.put("MOP", "マカオ パタカ");
    result.put("MRO", "モーリタニア ウギア (1973–2017)");
    result.put("MRU", "モーリタニア ウギア");
    result.put("MTL", "マルタ リラ");
    result.put("MTP", "マルタ ポンド");
    result.put("MUR", "モーリシャス ルピー");
    result.put("MVP", "モルディブ諸島 ルピー");
    result.put("MVR", "モルディブ ルフィア");
    result.put("MWK", "マラウィ クワチャ");
    result.put("MXN", "メキシコ ペソ");
    result.put("MXP", "メキシコ ペソ (1861–1992)");
    result.put("MXV", "メキシコ (UDI)");
    result.put("MYR", "マレーシア リンギット");
    result.put("MZE", "モザンピーク エスクード");
    result.put("MZM", "モザンビーク メティカル (1980–2006)");
    result.put("MZN", "モザンビーク メティカル");
    result.put("NAD", "ナミビア ドル");
    result.put("NGN", "ナイジェリア ナイラ");
    result.put("NIC", "ニカラグア コルドバ (1988–1991)");
    result.put("NIO", "ニカラグア コルドバ オロ");
    result.put("NLG", "オランダ ギルダー");
    result.put("NOK", "ノルウェー クローネ");
    result.put("NPR", "ネパール ルピー");
    result.put("NZD", "ニュージーランド ドル");
    result.put("OMR", "オマーン リアル");
    result.put("PAB", "パナマ バルボア");
    result.put("PEI", "ペルー インティ");
    result.put("PEN", "ペルー ソル");
    result.put("PES", "ペルー ソル (1863–1965)");
    result.put("PGK", "パプアニューギニア キナ");
    result.put("PHP", "フィリピン ペソ");
    result.put("PKR", "パキスタン ルピー");
    result.put("PLN", "ポーランド ズウォティ");
    result.put("PLZ", "ポーランド ズウォティ (1950–1995)");
    result.put("PTE", "ポルトガル エスクード");
    result.put("PYG", "パラグアイ グアラニ");
    result.put("QAR", "カタール リアル");
    result.put("RHD", "ローデシア ドル");
    result.put("ROL", "ルーマニア レイ (1952–2006)");
    result.put("RON", "ルーマニア レイ");
    result.put("RSD", "ディナール (セルビア)");
    result.put("RUB", "ロシア ルーブル");
    result.put("RUR", "ロシア ルーブル (1991–1998)");
    result.put("RWF", "ルワンダ フラン");
    result.put("SAR", "サウジ リヤル");
    result.put("SBD", "ソロモン諸島 ドル");
    result.put("SCR", "セーシェル ルピー");
    result.put("SDD", "スーダン ディナール (1992–2007)");
    result.put("SDG", "スーダン ポンド");
    result.put("SDP", "スーダン ポンド (1957–1998)");
    result.put("SEK", "スウェーデン クローナ");
    result.put("SGD", "シンガポール ドル");
    result.put("SHP", "セントヘレナ ポンド");
    result.put("SIT", "スロベニア トラール");
    result.put("SKK", "スロバキア コルナ");
    result.put("SLL", "シエラレオネ レオン");
    result.put("SOS", "ソマリア シリング");
    result.put("SRD", "スリナム ドル");
    result.put("SRG", "スリナム ギルダー");
    result.put("SSP", "南スーダン ポンド");
    result.put("STD", "サントメ・プリンシペ ドブラ (1977–2017)");
    result.put("STN", "サントメ・プリンシペ ドブラ");
    result.put("SUR", "ソ連 ルーブル");
    result.put("SVC", "エルサルバドル コロン");
    result.put("SYP", "シリア ポンド");
    result.put("SZL", "スワジランド リランゲニ");
    result.put("THB", "タイ バーツ");
    result.put("TJR", "タジキスタン ルーブル");
    result.put("TJS", "タジキスタン ソモニ");
    result.put("TMM", "トルクメニスタン マナト (1993–2009)");
    result.put("TMT", "トルクメニスタン マナト");
    result.put("TND", "チュニジア ディナール");
    result.put("TOP", "トンガ パ・アンガ");
    result.put("TPE", "ティモール エスクード");
    result.put("TRL", "トルコ リラ (1922–2005)");
    result.put("TRY", "新トルコリラ");
    result.put("TTD", "トリニダード・トバゴ ドル");
    result.put("TWD", "新台湾ドル");
    result.put("TZS", "タンザニア シリング");
    result.put("UAH", "ウクライナ グリブナ");
    result.put("UAK", "ウクライナ カルボバネツ");
    result.put("UGS", "ウガンダ シリング (1966–1987)");
    result.put("UGX", "ウガンダ シリング");
    result.put("USD", "米ドル");
    result.put("USN", "米ドル (翌日)");
    result.put("USS", "米ドル (当日)");
    result.put("UYI", "ウルグアイ ペソエン");
    result.put("UYP", "ウルグアイ ペソ (1975–1993)");
    result.put("UYU", "ウルグアイ ペソ");
    result.put("UZS", "ウズベキスタン スム");
    result.put("VEB", "ベネズエラ ボリバル (1871–2008)");
    result.put("VEF", "ベネズエラ ボリバル (2008–2018)");
    result.put("VES", "ベネズエラ ボリバル");
    result.put("VND", "ベトナム ドン");
    result.put("VNN", "ベトナム ドン（1978–1985）");
    result.put("VUV", "バヌアツ バツ");
    result.put("WST", "サモア タラ");
    result.put("XAF", "中央アフリカ CFA フラン");
    result.put("XAG", "銀");
    result.put("XAU", "金");
    result.put("XBA", "ヨーロッパ混合単位 (EURCO)");
    result.put("XBB", "ヨーロッパ通貨単位 (EMU–6)");
    result.put("XBC", "ヨーロッパ勘定単位 (EUA–9)");
    result.put("XBD", "ヨーロッパ勘定単位 (EUA–17)");
    result.put("XCD", "東カリブ ドル");
    result.put("XDR", "特別引き出し権");
    result.put("XEU", "ヨーロッパ通貨単位");
    result.put("XFO", "フランス金フラン");
    result.put("XFU", "フランス フラン (UIC)");
    result.put("XOF", "西アフリカ CFA フラン");
    result.put("XPD", "パラジウム");
    result.put("XPF", "CFP フラン");
    result.put("XPT", "プラチナ");
    result.put("XRE", "RINET基金");
    result.put("XSU", "スクレ");
    result.put("XTS", "テスト用通貨コード");
    result.put("XUA", "UA (アフリカ開発銀行)");
    result.put("XXX", "不明または無効な通貨");
    result.put("YDD", "イエメン ディナール");
    result.put("YER", "イエメン リアル");
    result.put("YUD", "ユーゴスラビア ハード・ディナール (1966–1990)");
    result.put("YUM", "ユーゴスラビア ノビ・ディナール (1994–2002)");
    result.put("YUN", "ユーゴスラビア 兌換ディナール (1990–1992)");
    result.put("YUR", "ユーゴスラビア 改革ディナール（1992–1993）");
    result.put("ZAL", "南アフリカ ランド (ZAL)");
    result.put("ZAR", "南アフリカ ランド");
    result.put("ZMK", "ザンビア クワチャ (1968–2012)");
    result.put("ZMW", "ザンビア クワチャ");
    result.put("ZRN", "ザイール 新ザイール (1993–1998)");
    result.put("ZRZ", "ザイール ザイール (1971–1993)");
    result.put("ZWD", "ジンバブエ ドル (1980–2008)");
    result.put("ZWL", "ジンバブエ ドル (2009)");
    result.put("ZWR", "シンバブエ ドル（2008）");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "ADP": "アンドラ ペセタ",
      "AED": "アラブ首長国連邦ディルハム",
      "AFA": "アフガニスタン アフガニー (1927–2002)",
      "AFN": "アフガニスタン アフガニー",
      "ALK": "アルバニア レク (1946–1965)",
      "ALL": "アルバニア レク",
      "AMD": "アルメニア ドラム",
      "ANG": "オランダ領アンティル ギルダー",
      "AOA": "アンゴラ クワンザ",
      "AOK": "アンゴラ クワンザ (1977–1991)",
      "AON": "アンゴラ 新クワンザ (1990–2000)",
      "AOR": "アンゴラ 旧クワンザ (1995–1999)",
      "ARA": "アルゼンチン アゥストラール",
      "ARL": "アルゼンチン・ペソ・レイ（1970–1983）",
      "ARM": "アルゼンチン・ペソ（1881–1970）",
      "ARP": "アルゼンチン ペソ (1983–1985)",
      "ARS": "アルゼンチン ペソ",
      "ATS": "オーストリア シリング",
      "AUD": "オーストラリア ドル",
      "AWG": "アルバ ギルダー",
      "AZM": "アゼルバイジャン マナト (1993–2006)",
      "AZN": "アゼルバイジャン マナト",
      "BAD": "ボスニア・ヘルツェゴビナ ディナール (1992–1994)",
      "BAM": "ボスニア・ヘルツェゴビナ 兌換マルク (BAM)",
      "BAN": "ボスニア・ヘルツェゴビナ 新ディナール（1994–1997）",
      "BBD": "バルバドス ドル",
      "BDT": "バングラデシュ タカ",
      "BEC": "ベルギー フラン (BEC)",
      "BEF": "ベルギー フラン",
      "BEL": "ベルギー フラン (BEL)",
      "BGL": "ブルガリア レフ",
      "BGM": "ブルガリア社会主義 レフ",
      "BGN": "ブルガリア 新レフ",
      "BGO": "ブルガリア レフ（1879–1952）",
      "BHD": "バーレーン ディナール",
      "BIF": "ブルンジ フラン",
      "BMD": "バミューダ ドル",
      "BND": "ブルネイ ドル",
      "BOB": "ボリビア ボリビアーノ",
      "BOL": "ボリビア ボリビアーノ (1863–1963)",
      "BOP": "ボリビア ペソ",
      "BOV": "ボリビア (Mvdol)",
      "BRB": "ブラジル 新クルゼイロ (1967–1986)",
      "BRC": "ブラジル クルザード (1986–1989)",
      "BRE": "ブラジル クルゼイロ (1990–1993)",
      "BRL": "ブラジル レアル",
      "BRN": "ブラジル 新クルザード (1989–1990)",
      "BRR": "ブラジル クルゼイロ (1993–1994)",
      "BRZ": "ブラジル クルゼイロ（1942–1967）",
      "BSD": "バハマ ドル",
      "BTN": "ブータン ニュルタム",
      "BUK": "ビルマ チャット",
      "BWP": "ボツワナ プラ",
      "BYB": "ベラルーシ 新ルーブル (1994–1999)",
      "BYN": "ベラルーシ ルーブル",
      "BYR": "ベラルーシ ルーブル (2000–2016)",
      "BZD": "ベリーズ ドル",
      "CAD": "カナダ ドル",
      "CDF": "コンゴ フラン",
      "CHE": "ユーロ (WIR)",
      "CHF": "スイス フラン",
      "CHW": "フラン (WIR)",
      "CLE": "チリ エスクード",
      "CLF": "チリ ウニダ・デ・フォメント (UF)",
      "CLP": "チリ ペソ",
      "CNH": "中国人民元(オフショア)",
      "CNX": "中国人民銀行ドル",
      "CNY": "中国人民元",
      "COP": "コロンビア ペソ",
      "COU": "コロンビア レアル （UVR)",
      "CRC": "コスタリカ コロン",
      "CSD": "セルビア ディナール (2002–2006)",
      "CSK": "チェコスロバキア コルナ",
      "CUC": "キューバ 兌換ペソ",
      "CUP": "キューバ ペソ",
      "CVE": "カーボベルデ エスクード",
      "CYP": "キプロス ポンド",
      "CZK": "チェコ コルナ",
      "DDM": "東ドイツ マルク",
      "DEM": "ドイツ マルク",
      "DJF": "ジブチ フラン",
      "DKK": "デンマーク クローネ",
      "DOP": "ドミニカ ペソ",
      "DZD": "アルジェリア ディナール",
      "ECS": "エクアドル スクレ",
      "ECV": "エクアドル (UVC)",
      "EEK": "エストニア クルーン",
      "EGP": "エジプト ポンド",
      "ERN": "エリトリア ナクファ",
      "ESA": "スペインペセタ（勘定A）",
      "ESB": "スペイン 兌換ペセタ",
      "ESP": "スペイン ペセタ",
      "ETB": "エチオピア ブル",
      "EUR": "ユーロ",
      "FIM": "フィンランド マルカ",
      "FJD": "フィジー ドル",
      "FKP": "フォークランド（マルビナス）諸島 ポンド",
      "FRF": "フランス フラン",
      "GBP": "英国ポンド",
      "GEK": "ジョージア クーポン ラリ",
      "GEL": "ジョージア ラリ",
      "GHC": "ガーナ セディ (1979–2007)",
      "GHS": "ガーナ セディ",
      "GIP": "ジブラルタル ポンド",
      "GMD": "ガンビア ダラシ",
      "GNF": "ギニア フラン",
      "GNS": "ギニア シリー",
      "GQE": "赤道ギニア エクウェレ",
      "GRD": "ギリシャ ドラクマ",
      "GTQ": "グアテマラ ケツァル",
      "GWE": "ポルトガル領ギニア エスクード",
      "GWP": "ギニアビサウ ペソ",
      "GYD": "ガイアナ ドル",
      "HKD": "香港ドル",
      "HNL": "ホンジュラス レンピラ",
      "HRD": "クロアチア ディナール",
      "HRK": "クロアチア クーナ",
      "HTG": "ハイチ グールド",
      "HUF": "ハンガリー フォリント",
      "IDR": "インドネシア ルピア",
      "IEP": "アイリッシュ ポンド",
      "ILP": "イスラエル ポンド",
      "ILR": "イスラエル シェケル (1980–1985)",
      "ILS": "イスラエル新シェケル",
      "INR": "インド ルピー",
      "IQD": "イラク ディナール",
      "IRR": "イラン リアル",
      "ISJ": "アイスランド クローナ (1918–1981)",
      "ISK": "アイスランド クローナ",
      "ITL": "イタリア リラ",
      "JMD": "ジャマイカ ドル",
      "JOD": "ヨルダン ディナール",
      "JPY": "日本円",
      "KES": "ケニア シリング",
      "KGS": "キルギス ソム",
      "KHR": "カンボジア リエル",
      "KMF": "コモロ フラン",
      "KPW": "北朝鮮ウォン",
      "KRH": "韓国 ファン（1953–1962）",
      "KRO": "韓国 ウォン（1945–1953）",
      "KRW": "韓国ウォン",
      "KWD": "クウェート ディナール",
      "KYD": "ケイマン諸島 ドル",
      "KZT": "カザフスタン テンゲ",
      "LAK": "ラオス キープ",
      "LBP": "レバノン ポンド",
      "LKR": "スリランカ ルピー",
      "LRD": "リベリア ドル",
      "LSL": "レソト ロティ",
      "LTL": "リトアニア リタス",
      "LTT": "リトアニア タロナ",
      "LUC": "ルクセンブルク 兌換フラン",
      "LUF": "ルクセンブルグ フラン",
      "LUL": "ルクセンブルク 金融フラン",
      "LVL": "ラトビア ラッツ",
      "LVR": "ラトビア ルーブル",
      "LYD": "リビア ディナール",
      "MAD": "モロッコ ディルハム",
      "MAF": "モロッコ フラン",
      "MCF": "モネガスク フラン",
      "MDC": "モルドバ クーポン",
      "MDL": "モルドバ レイ",
      "MGA": "マダガスカル アリアリ",
      "MGF": "マラガシ フラン",
      "MKD": "マケドニア デナル",
      "MKN": "マケドニア ディナール（1992–1993）",
      "MLF": "マリ フラン",
      "MMK": "ミャンマー チャット",
      "MNT": "モンゴル トグログ",
      "MOP": "マカオ パタカ",
      "MRO": "モーリタニア ウギア (1973–2017)",
      "MRU": "モーリタニア ウギア",
      "MTL": "マルタ リラ",
      "MTP": "マルタ ポンド",
      "MUR": "モーリシャス ルピー",
      "MVP": "モルディブ諸島 ルピー",
      "MVR": "モルディブ ルフィア",
      "MWK": "マラウィ クワチャ",
      "MXN": "メキシコ ペソ",
      "MXP": "メキシコ ペソ (1861–1992)",
      "MXV": "メキシコ (UDI)",
      "MYR": "マレーシア リンギット",
      "MZE": "モザンピーク エスクード",
      "MZM": "モザンビーク メティカル (1980–2006)",
      "MZN": "モザンビーク メティカル",
      "NAD": "ナミビア ドル",
      "NGN": "ナイジェリア ナイラ",
      "NIC": "ニカラグア コルドバ (1988–1991)",
      "NIO": "ニカラグア コルドバ オロ",
      "NLG": "オランダ ギルダー",
      "NOK": "ノルウェー クローネ",
      "NPR": "ネパール ルピー",
      "NZD": "ニュージーランド ドル",
      "OMR": "オマーン リアル",
      "PAB": "パナマ バルボア",
      "PEI": "ペルー インティ",
      "PEN": "ペルー ソル",
      "PES": "ペルー ソル (1863–1965)",
      "PGK": "パプアニューギニア キナ",
      "PHP": "フィリピン ペソ",
      "PKR": "パキスタン ルピー",
      "PLN": "ポーランド ズウォティ",
      "PLZ": "ポーランド ズウォティ (1950–1995)",
      "PTE": "ポルトガル エスクード",
      "PYG": "パラグアイ グアラニ",
      "QAR": "カタール リアル",
      "RHD": "ローデシア ドル",
      "ROL": "ルーマニア レイ (1952–2006)",
      "RON": "ルーマニア レイ",
      "RSD": "ディナール (セルビア)",
      "RUB": "ロシア ルーブル",
      "RUR": "ロシア ルーブル (1991–1998)",
      "RWF": "ルワンダ フラン",
      "SAR": "サウジ リヤル",
      "SBD": "ソロモン諸島 ドル",
      "SCR": "セーシェル ルピー",
      "SDD": "スーダン ディナール (1992–2007)",
      "SDG": "スーダン ポンド",
      "SDP": "スーダン ポンド (1957–1998)",
      "SEK": "スウェーデン クローナ",
      "SGD": "シンガポール ドル",
      "SHP": "セントヘレナ ポンド",
      "SIT": "スロベニア トラール",
      "SKK": "スロバキア コルナ",
      "SLL": "シエラレオネ レオン",
      "SOS": "ソマリア シリング",
      "SRD": "スリナム ドル",
      "SRG": "スリナム ギルダー",
      "SSP": "南スーダン ポンド",
      "STD": "サントメ・プリンシペ ドブラ (1977–2017)",
      "STN": "サントメ・プリンシペ ドブラ",
      "SUR": "ソ連 ルーブル",
      "SVC": "エルサルバドル コロン",
      "SYP": "シリア ポンド",
      "SZL": "スワジランド リランゲニ",
      "THB": "タイ バーツ",
      "TJR": "タジキスタン ルーブル",
      "TJS": "タジキスタン ソモニ",
      "TMM": "トルクメニスタン マナト (1993–2009)",
      "TMT": "トルクメニスタン マナト",
      "TND": "チュニジア ディナール",
      "TOP": "トンガ パ・アンガ",
      "TPE": "ティモール エスクード",
      "TRL": "トルコ リラ (1922–2005)",
      "TRY": "新トルコリラ",
      "TTD": "トリニダード・トバゴ ドル",
      "TWD": "新台湾ドル",
      "TZS": "タンザニア シリング",
      "UAH": "ウクライナ グリブナ",
      "UAK": "ウクライナ カルボバネツ",
      "UGS": "ウガンダ シリング (1966–1987)",
      "UGX": "ウガンダ シリング",
      "USD": "米ドル",
      "USN": "米ドル (翌日)",
      "USS": "米ドル (当日)",
      "UYI": "ウルグアイ ペソエン",
      "UYP": "ウルグアイ ペソ (1975–1993)",
      "UYU": "ウルグアイ ペソ",
      "UZS": "ウズベキスタン スム",
      "VEB": "ベネズエラ ボリバル (1871–2008)",
      "VEF": "ベネズエラ ボリバル (2008–2018)",
      "VES": "ベネズエラ ボリバル",
      "VND": "ベトナム ドン",
      "VNN": "ベトナム ドン（1978–1985）",
      "VUV": "バヌアツ バツ",
      "WST": "サモア タラ",
      "XAF": "中央アフリカ CFA フラン",
      "XAG": "銀",
      "XAU": "金",
      "XBA": "ヨーロッパ混合単位 (EURCO)",
      "XBB": "ヨーロッパ通貨単位 (EMU–6)",
      "XBC": "ヨーロッパ勘定単位 (EUA–9)",
      "XBD": "ヨーロッパ勘定単位 (EUA–17)",
      "XCD": "東カリブ ドル",
      "XDR": "特別引き出し権",
      "XEU": "ヨーロッパ通貨単位",
      "XFO": "フランス金フラン",
      "XFU": "フランス フラン (UIC)",
      "XOF": "西アフリカ CFA フラン",
      "XPD": "パラジウム",
      "XPF": "CFP フラン",
      "XPT": "プラチナ",
      "XRE": "RINET基金",
      "XSU": "スクレ",
      "XTS": "テスト用通貨コード",
      "XUA": "UA (アフリカ開発銀行)",
      "XXX": "不明または無効な通貨",
      "YDD": "イエメン ディナール",
      "YER": "イエメン リアル",
      "YUD": "ユーゴスラビア ハード・ディナール (1966–1990)",
      "YUM": "ユーゴスラビア ノビ・ディナール (1994–2002)",
      "YUN": "ユーゴスラビア 兌換ディナール (1990–1992)",
      "YUR": "ユーゴスラビア 改革ディナール（1992–1993）",
      "ZAL": "南アフリカ ランド (ZAL)",
      "ZAR": "南アフリカ ランド",
      "ZMK": "ザンビア クワチャ (1968–2012)",
      "ZMW": "ザンビア クワチャ",
      "ZRN": "ザイール 新ザイール (1993–1998)",
      "ZRZ": "ザイール ザイール (1971–1993)",
      "ZWD": "ジンバブエ ドル (1980–2008)",
      "ZWL": "ジンバブエ ドル (2009)",
      "ZWR": "シンバブエ ドル（2008）",
    };
  }-*/;
}
