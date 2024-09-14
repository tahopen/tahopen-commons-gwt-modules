package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_ko extends com.google.gwt.i18n.client.CurrencyList_ {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("KRW", "₩", 0, "KR₩", "₩");
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "KRW", "₩", 0, "KR₩", "₩"];
  }-*/;
  
  @Override
  protected HashMap<String, CurrencyData> loadCurrencyMapJava() {
    HashMap<String, CurrencyData> result = super.loadCurrencyMapJava();
    // 안도라 페세타
    result.put("ADP", new CurrencyDataImpl("ADP", "ADP", 128, "ADP", "ADP"));
    // 아랍에미리트 디르함
    result.put("AED", new CurrencyDataImpl("AED", "DH", 2, "DH", "dh"));
    // 아프가니 (1927–2002)
    result.put("AFA", new CurrencyDataImpl("AFA", "AFA", 130, "AFA", "AFA"));
    // 아프가니스탄 아프가니
    result.put("AFN", new CurrencyDataImpl("AFN", "AFN", 0, "AFN", "Af."));
    // 알바니아 레크
    result.put("ALL", new CurrencyDataImpl("ALL", "ALL", 0, "ALL", "Lek"));
    // 아르메니아 드람
    result.put("AMD", new CurrencyDataImpl("AMD", "AMD", 2, "AMD", "Dram"));
    // 네덜란드령 안틸레스 길더
    result.put("ANG", new CurrencyDataImpl("ANG", "ANG", 2, "ANG", "ANG"));
    // 앙골라 콴자
    result.put("AOA", new CurrencyDataImpl("AOA", "AOA", 2, "AOA", "Kz"));
    // 앙골라 콴자 (1977–1990)
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130, "AOK", "AOK"));
    // 앙골라 신콴자 (1990–2000)
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130, "AON", "AON"));
    // 앙골라 재조정 콴자 (1995–1999)
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130, "AOR", "AOR"));
    // 아르헨티나 오스트랄
    result.put("ARA", new CurrencyDataImpl("ARA", "ARA", 130, "ARA", "ARA"));
    // 아르헨티나 페소 레이 (1970–1983)
    result.put("ARL", new CurrencyDataImpl("ARL", "ARL", 130, "ARL", "ARL"));
    // 아르헨티나 페소 (18810–1970)
    result.put("ARM", new CurrencyDataImpl("ARM", "ARM", 130, "ARM", "ARM"));
    // 아르헨티나 페소 (1983–1985)
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130, "ARP", "ARP"));
    // 아르헨티나 페소
    result.put("ARS", new CurrencyDataImpl("ARS", "AR$", 2, "AR$", "$"));
    // 호주 실링
    result.put("ATS", new CurrencyDataImpl("ATS", "ATS", 130, "ATS", "ATS"));
    // 호주 달러
    result.put("AUD", new CurrencyDataImpl("AUD", "AU$", 2, "AU$", "$"));
    // 아루바 플로린
    result.put("AWG", new CurrencyDataImpl("AWG", "AWG", 2, "AWG", "Afl."));
    // 아제르바이젠 마나트(1993–2006)
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130, "AZM", "AZM"));
    // 아제르바이잔 마나트
    result.put("AZN", new CurrencyDataImpl("AZN", "AZN", 2, "AZN", "man."));
    // 보스니아-헤르체고비나 디나르
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130, "BAD", "BAD"));
    // 보스니아-헤르체고비나 태환 마르크
    result.put("BAM", new CurrencyDataImpl("BAM", "BAM", 2, "BAM", "KM"));
    // 보스니아-헤르체고비나 신디나르 (1994–1997)
    result.put("BAN", new CurrencyDataImpl("BAN", "BAN", 130, "BAN", "BAN"));
    // 바베이도스 달러
    result.put("BBD", new CurrencyDataImpl("BBD", "BBD", 2, "BBD", "$"));
    // 방글라데시 타카
    result.put("BDT", new CurrencyDataImpl("BDT", "Tk", 2, "Tk", "৳"));
    // 벨기에 프랑 (태환)
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 130, "BEC", "BEC"));
    // 벨기에 프랑
    result.put("BEF", new CurrencyDataImpl("BEF", "BEF", 130, "BEF", "BEF"));
    // 벨기에 프랑 (금융)
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 130, "BEL", "BEL"));
    // 불가리아 동전 렛
    result.put("BGL", new CurrencyDataImpl("BGL", "BGL", 130, "BGL", "BGL"));
    // 불가리아 사회주의자 렛
    result.put("BGM", new CurrencyDataImpl("BGM", "BGM", 130, "BGM", "BGM"));
    // 불가리아 레프
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2, "BGN", "lev"));
    // 불가리아 렛 (1879–1952)
    result.put("BGO", new CurrencyDataImpl("BGO", "BGO", 130, "BGO", "BGO"));
    // 바레인 디나르
    result.put("BHD", new CurrencyDataImpl("BHD", "BHD", 3, "BHD", "din"));
    // 부룬디 프랑
    result.put("BIF", new CurrencyDataImpl("BIF", "BIF", 0, "BIF", "FBu"));
    // 버뮤다 달러
    result.put("BMD", new CurrencyDataImpl("BMD", "BMD", 2, "BMD", "$"));
    // 부루나이 달러
    result.put("BND", new CurrencyDataImpl("BND", "BND", 2, "BND", "$"));
    // 볼리비아노
    result.put("BOB", new CurrencyDataImpl("BOB", "BOB", 2, "BOB", "Bs"));
    // 볼리비아 볼리비아노 (1863–1963)
    result.put("BOL", new CurrencyDataImpl("BOL", "BOL", 130, "BOL", "BOL"));
    // 볼리비아노 페소
    result.put("BOP", new CurrencyDataImpl("BOP", "BOP", 130, "BOP", "BOP"));
    // 볼리비아노 Mvdol(기금)
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 130, "BOV", "BOV"));
    // 볼리비아노 크루제이루 노보 (1967–1986)
    result.put("BRB", new CurrencyDataImpl("BRB", "BRB", 130, "BRB", "BRB"));
    // 브라질 크루자두
    result.put("BRC", new CurrencyDataImpl("BRC", "BRC", 130, "BRC", "BRC"));
    // 브라질 크루제이루 (1990–1993)
    result.put("BRE", new CurrencyDataImpl("BRE", "BRE", 130, "BRE", "BRE"));
    // 브라질 레알
    result.put("BRL", new CurrencyDataImpl("BRL", "R$", 2, "R$", "R$"));
    // 브라질 크루자두 노보
    result.put("BRN", new CurrencyDataImpl("BRN", "BRN", 130, "BRN", "BRN"));
    // 브라질 크루제이루
    result.put("BRR", new CurrencyDataImpl("BRR", "BRR", 130, "BRR", "BRR"));
    // 브라질 크루제이루 (1942–1967)
    result.put("BRZ", new CurrencyDataImpl("BRZ", "BRZ", 130, "BRZ", "BRZ"));
    // 바하마 달러
    result.put("BSD", new CurrencyDataImpl("BSD", "BSD", 2, "BSD", "$"));
    // 부탄 눌투눔
    result.put("BTN", new CurrencyDataImpl("BTN", "BTN", 2, "BTN", "Nu."));
    // 버마 차트
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130, "BUK", "BUK"));
    // 보츠와나 폴라
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2, "BWP", "P"));
    // 벨라루스 신권 루블 (1994–1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130, "BYB", "BYB"));
    // 벨라루스 루블
    result.put("BYN", new CurrencyDataImpl("BYN", "BYN", 2, "BYN", "BYN"));
    // 벨라루스 루블 (2000–2016)
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 128, "BYR", "BYR"));
    // 벨리즈 달러
    result.put("BZD", new CurrencyDataImpl("BZD", "BZD", 2, "BZD", "$"));
    // 캐나다 달러
    result.put("CAD", new CurrencyDataImpl("CAD", "CA$", 2, "C$", "$"));
    // 콩고 프랑 콩골라스
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2, "CDF", "FrCD"));
    // 유로 (WIR)
    result.put("CHE", new CurrencyDataImpl("CHE", "CHE", 130, "CHE", "CHE"));
    // 스위스 프랑
    result.put("CHF", new CurrencyDataImpl("CHF", "CHF", 2, "CHF", "CHF"));
    // 프랑 (WIR)
    result.put("CHW", new CurrencyDataImpl("CHW", "CHW", 130, "CHW", "CHW"));
    // 칠레 에스쿠도
    result.put("CLE", new CurrencyDataImpl("CLE", "CLE", 130, "CLE", "CLE"));
    // 칠레 (UF)
    result.put("CLF", new CurrencyDataImpl("CLF", "CLF", 132, "CLF", "CLF"));
    // 칠레 페소
    result.put("CLP", new CurrencyDataImpl("CLP", "CL$", 0, "CL$", "$"));
    // 중국 위안화(역외)
    result.put("CNH", new CurrencyDataImpl("CNH", "CNH", 130, "CNH", "CNH"));
    // 중국 위안화
    result.put("CNY", new CurrencyDataImpl("CNY", "CN¥", 2, "RMB¥", "¥"));
    // 콜롬비아 페소
    result.put("COP", new CurrencyDataImpl("COP", "COL$", 2, "COL$", "$"));
    // 콜롬비아 실가 단위
    result.put("COU", new CurrencyDataImpl("COU", "COU", 130, "COU", "COU"));
    // 코스타리카 콜론
    result.put("CRC", new CurrencyDataImpl("CRC", "CR₡", 2, "CR₡", "₡"));
    // 고 세르비아 디나르
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130, "CSD", "CSD"));
    // 체코슬로바키아 동전 코루나
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130, "CSK", "CSK"));
    // 쿠바 태환 페소
    result.put("CUC", new CurrencyDataImpl("CUC", "CUC", 2, "CUC", "$"));
    // 쿠바 페소
    result.put("CUP", new CurrencyDataImpl("CUP", "$MN", 2, "$MN", "$"));
    // 카보베르데 에스쿠도
    result.put("CVE", new CurrencyDataImpl("CVE", "CVE", 2, "CVE", "CVE"));
    // 싸이프러스 파운드
    result.put("CYP", new CurrencyDataImpl("CYP", "CYP", 130, "CYP", "CYP"));
    // 체코 공화국 코루나
    result.put("CZK", new CurrencyDataImpl("CZK", "Kč", 2, "Kč", "Kč"));
    // 동독 오스트마르크
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130, "DDM", "DDM"));
    // 독일 마르크
    result.put("DEM", new CurrencyDataImpl("DEM", "DEM", 130, "DEM", "DEM"));
    // 지부티 프랑
    result.put("DJF", new CurrencyDataImpl("DJF", "Fdj", 0, "Fdj", "Fdj"));
    // 덴마크 크로네
    result.put("DKK", new CurrencyDataImpl("DKK", "kr", 2, "kr", "kr"));
    // 도미니카 페소
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$", "$"));
    // 알제리 디나르
    result.put("DZD", new CurrencyDataImpl("DZD", "DZD", 2, "DZD", "din"));
    // 에쿠아도르 수크레
    result.put("ECS", new CurrencyDataImpl("ECS", "ECS", 130, "ECS", "ECS"));
    // 에콰도르 (UVC)
    result.put("ECV", new CurrencyDataImpl("ECV", "ECV", 130, "ECV", "ECV"));
    // 에스토니아 크룬
    result.put("EEK", new CurrencyDataImpl("EEK", "EEK", 130, "EEK", "EEK"));
    // 이집트 파운드
    result.put("EGP", new CurrencyDataImpl("EGP", "LE", 2, "LE", "E£"));
    // 에리트리아 나크파
    result.put("ERN", new CurrencyDataImpl("ERN", "ERN", 2, "ERN", "Nfk"));
    // 스페인 페세타(예금)
    result.put("ESA", new CurrencyDataImpl("ESA", "ESA", 130, "ESA", "ESA"));
    // 스페인 페세타(변환 예금)
    result.put("ESB", new CurrencyDataImpl("ESB", "ESB", 130, "ESB", "ESB"));
    // 스페인 페세타
    result.put("ESP", new CurrencyDataImpl("ESP", "ESP", 128, "ESP", "ESP"));
    // 에티오피아 비르
    result.put("ETB", new CurrencyDataImpl("ETB", "ETB", 2, "ETB", "Birr"));
    // 유로
    result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€", "€"));
    // 핀란드 마르카
    result.put("FIM", new CurrencyDataImpl("FIM", "FIM", 130, "FIM", "FIM"));
    // 피지 달러
    result.put("FJD", new CurrencyDataImpl("FJD", "FJD", 2, "FJD", "$"));
    // 포클랜드제도 파운드
    result.put("FKP", new CurrencyDataImpl("FKP", "FKP", 2, "FKP", "£"));
    // 프랑스 프랑
    result.put("FRF", new CurrencyDataImpl("FRF", "FRF", 130, "FRF", "FRF"));
    // 파운드
    result.put("GBP", new CurrencyDataImpl("GBP", "£", 2, "GB£", "£"));
    // 그루지야 지폐 라리트
    result.put("GEK", new CurrencyDataImpl("GEK", "GEK", 130, "GEK", "GEK"));
    // 조지아 라리
    result.put("GEL", new CurrencyDataImpl("GEL", "₾", 2, "₾", "GEL"));
    // 가나 시디 (1979–2007)
    result.put("GHC", new CurrencyDataImpl("GHC", "GHC", 130, "GHC", "GHC"));
    // 가나 시디
    result.put("GHS", new CurrencyDataImpl("GHS", "GHS", 2, "GHS", "GHS"));
    // 지브롤터 파운드
    result.put("GIP", new CurrencyDataImpl("GIP", "GIP", 2, "GIP", "£"));
    // 감비아 달라시
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2, "GMD", "GMD"));
    // 기니 프랑
    result.put("GNF", new CurrencyDataImpl("GNF", "GNF", 0, "GNF", "FG"));
    // 기니 시리
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130, "GNS", "GNS"));
    // 적도 기니 에쿨 (Ekwele)
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130, "GQE", "GQE"));
    // 그리스 드라크마
    result.put("GRD", new CurrencyDataImpl("GRD", "GRD", 130, "GRD", "GRD"));
    // 과테말라 케트살
    result.put("GTQ", new CurrencyDataImpl("GTQ", "GTQ", 2, "GTQ", "Q"));
    // 포르투갈령 기니 에스쿠도
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130, "GWE", "GWE"));
    // 기네비쏘 페소
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 130, "GWP", "GWP"));
    // 가이아나 달러
    result.put("GYD", new CurrencyDataImpl("GYD", "GYD", 2, "GYD", "$"));
    // 홍콩 달러
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$", "$"));
    // 온두라스 렘피라
    result.put("HNL", new CurrencyDataImpl("HNL", "L", 2, "L", "L"));
    // 크로아티아 디나르
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130, "HRD", "HRD"));
    // 크로아티아 쿠나
    result.put("HRK", new CurrencyDataImpl("HRK", "HRK", 2, "HRK", "kn"));
    // 하이티 구르드
    result.put("HTG", new CurrencyDataImpl("HTG", "HTG", 2, "HTG", "HTG"));
    // 헝가리 포린트
    result.put("HUF", new CurrencyDataImpl("HUF", "HUF", 2, "HUF", "Ft"));
    // 인도네시아 루피아
    result.put("IDR", new CurrencyDataImpl("IDR", "IDR", 2, "IDR", "Rp"));
    // 아일랜드 파운드
    result.put("IEP", new CurrencyDataImpl("IEP", "IEP", 130, "IEP", "IEP"));
    // 이스라엘 파운드
    result.put("ILP", new CurrencyDataImpl("ILP", "ILP", 130, "ILP", "ILP"));
    // 이스라엘 신권 세켈
    result.put("ILS", new CurrencyDataImpl("ILS", "₪", 2, "IL₪", "₪"));
    // 인도 루피
    result.put("INR", new CurrencyDataImpl("INR", "₹", 2, "Rs", "₹"));
    // 이라크 디나르
    result.put("IQD", new CurrencyDataImpl("IQD", "IQD", 0, "IQD", "din"));
    // 이란 리얄
    result.put("IRR", new CurrencyDataImpl("IRR", "IRR", 0, "IRR", "Rial"));
    // 아이슬란드 크로나
    result.put("ISK", new CurrencyDataImpl("ISK", "kr", 0, "kr", "kr"));
    // 이탈리아 리라
    result.put("ITL", new CurrencyDataImpl("ITL", "ITL", 128, "ITL", "ITL"));
    // 자메이카 달러
    result.put("JMD", new CurrencyDataImpl("JMD", "JA$", 2, "JA$", "$"));
    // 요르단 디나르
    result.put("JOD", new CurrencyDataImpl("JOD", "JOD", 3, "JOD", "din"));
    // 일본 엔화
    result.put("JPY", new CurrencyDataImpl("JPY", "JP¥", 0, "JP¥", "¥"));
    // 케냐 실링
    result.put("KES", new CurrencyDataImpl("KES", "Ksh", 2, "Ksh", "Ksh"));
    // 키르기스스탄 솜
    result.put("KGS", new CurrencyDataImpl("KGS", "KGS", 2, "KGS", "KGS"));
    // 캄보디아 리얄
    result.put("KHR", new CurrencyDataImpl("KHR", "KHR", 2, "KHR", "Riel"));
    // 코모르 프랑
    result.put("KMF", new CurrencyDataImpl("KMF", "KMF", 0, "KMF", "CF"));
    // 조선 민주주의 인민 공화국 원
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 0, "KPW", "₩"));
    // 대한민국 환 (1953–1962)
    result.put("KRH", new CurrencyDataImpl("KRH", "KRH", 130, "KRH", "KRH"));
    // 대한민국 원
    result.put("KRW", new CurrencyDataImpl("KRW", "₩", 0, "KR₩", "₩"));
    // 쿠웨이트 디나르
    result.put("KWD", new CurrencyDataImpl("KWD", "KWD", 3, "KWD", "din"));
    // 케이맨 제도 달러
    result.put("KYD", new CurrencyDataImpl("KYD", "KYD", 2, "KYD", "$"));
    // 카자흐스탄 텐게
    result.put("KZT", new CurrencyDataImpl("KZT", "KZT", 2, "KZT", "₸"));
    // 라오스 키프
    result.put("LAK", new CurrencyDataImpl("LAK", "LAK", 0, "LAK", "₭"));
    // 레바논 파운드
    result.put("LBP", new CurrencyDataImpl("LBP", "LBP", 0, "LBP", "L£"));
    // 스리랑카 루피
    result.put("LKR", new CurrencyDataImpl("LKR", "SLRs", 2, "SLRs", "Rs"));
    // 라이베리아 달러
    result.put("LRD", new CurrencyDataImpl("LRD", "LRD", 2, "LRD", "$"));
    // 레소토 로티
    result.put("LSL", new CurrencyDataImpl("LSL", "LSL", 2, "LSL", "LSL"));
    // 리투아니아 리타
    result.put("LTL", new CurrencyDataImpl("LTL", "LTL", 130, "LTL", "Lt"));
    // 룩셈부르크 타로나
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130, "LTT", "LTT"));
    // 룩셈부르크 변환 프랑
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 130, "LUC", "LUC"));
    // 룩셈부르크 프랑
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128, "LUF", "LUF"));
    // 룩셈부르크 재정 프랑
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 130, "LUL", "LUL"));
    // 라트비아 라트
    result.put("LVL", new CurrencyDataImpl("LVL", "LVL", 130, "LVL", "Ls"));
    // 라트비아 루블
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130, "LVR", "LVR"));
    // 리비아 디나르
    result.put("LYD", new CurrencyDataImpl("LYD", "LYD", 3, "LYD", "din"));
    // 모로코 디렘
    result.put("MAD", new CurrencyDataImpl("MAD", "MAD", 2, "MAD", "MAD"));
    // 모로코 프랑
    result.put("MAF", new CurrencyDataImpl("MAF", "MAF", 130, "MAF", "MAF"));
    // 모나코 프랑
    result.put("MCF", new CurrencyDataImpl("MCF", "MCF", 130, "MCF", "MCF"));
    // 몰도바 쿠폰
    result.put("MDC", new CurrencyDataImpl("MDC", "MDC", 130, "MDC", "MDC"));
    // 몰도바 레이
    result.put("MDL", new CurrencyDataImpl("MDL", "MDL", 2, "MDL", "MDL"));
    // 마다가스카르 아리아리
    result.put("MGA", new CurrencyDataImpl("MGA", "MGA", 0, "MGA", "Ar"));
    // 마다가스카르 프랑
    result.put("MGF", new CurrencyDataImpl("MGF", "MGF", 128, "MGF", "MGF"));
    // 마케도니아 디나르
    result.put("MKD", new CurrencyDataImpl("MKD", "MKD", 2, "MKD", "din"));
    // 말리 프랑
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130, "MLF", "MLF"));
    // 미얀마 키얏
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 0, "MMK", "K"));
    // 몽골 투그릭
    result.put("MNT", new CurrencyDataImpl("MNT", "MN₮", 2, "MN₮", "₮"));
    // 마카오 파타카
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP", 2, "MOP", "MOP"));
    // 모리타니 우기야 (1973–2017)
    result.put("MRO", new CurrencyDataImpl("MRO", "MRO", 128, "MRO", "MRO"));
    // 모리타니 우기야
    result.put("MRU", new CurrencyDataImpl("MRU", "MRU", 2, "MRU", "MRU"));
    // 몰타 리라
    result.put("MTL", new CurrencyDataImpl("MTL", "MTL", 130, "MTL", "MTL"));
    // 몰타 파운드
    result.put("MTP", new CurrencyDataImpl("MTP", "MTP", 130, "MTP", "MTP"));
    // 모리셔스 루피
    result.put("MUR", new CurrencyDataImpl("MUR", "MUR", 2, "MUR", "Rs"));
    // 몰디브 제도 루피아
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2, "MVR", "MVR"));
    // 말라위 콰쳐
    result.put("MWK", new CurrencyDataImpl("MWK", "MWK", 2, "MWK", "MWK"));
    // 멕시코 페소
    result.put("MXN", new CurrencyDataImpl("MXN", "MX$", 2, "Mex$", "$"));
    // 멕시코 실버 페소 (1861–1992)
    result.put("MXP", new CurrencyDataImpl("MXP", "MXP", 130, "MXP", "MXP"));
    // 멕시코 (UDI)
    result.put("MXV", new CurrencyDataImpl("MXV", "MXV", 130, "MXV", "MXV"));
    // 말레이시아 링깃
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM", "RM"));
    // 모잠비크 에스쿠도
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130, "MZE", "MZE"));
    // 고 모잠비크 메티칼
    result.put("MZM", new CurrencyDataImpl("MZM", "MZM", 130, "MZM", "MZM"));
    // 모잠비크 메티칼
    result.put("MZN", new CurrencyDataImpl("MZN", "MZN", 2, "MZN", "MTn"));
    // 나미비아 달러
    result.put("NAD", new CurrencyDataImpl("NAD", "NAD", 2, "NAD", "$"));
    // 니제르 나이라
    result.put("NGN", new CurrencyDataImpl("NGN", "NGN", 2, "NGN", "₦"));
    // 니카라과 코르도바
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130, "NIC", "NIC"));
    // 니카라과 코르도바 오로
    result.put("NIO", new CurrencyDataImpl("NIO", "NIO", 2, "NIO", "C$"));
    // 네델란드 길더
    result.put("NLG", new CurrencyDataImpl("NLG", "NLG", 130, "NLG", "NLG"));
    // 노르웨이 크로네
    result.put("NOK", new CurrencyDataImpl("NOK", "NOkr", 2, "NOkr", "kr"));
    // 네팔 루피
    result.put("NPR", new CurrencyDataImpl("NPR", "NPR", 2, "NPR", "Rs"));
    // 뉴질랜드 달러
    result.put("NZD", new CurrencyDataImpl("NZD", "NZ$", 2, "NZ$", "$"));
    // 오만 리얄
    result.put("OMR", new CurrencyDataImpl("OMR", "OMR", 3, "OMR", "Rial"));
    // 파나마 발보아
    result.put("PAB", new CurrencyDataImpl("PAB", "B/.", 2, "B/.", "B/."));
    // 페루 인티
    result.put("PEI", new CurrencyDataImpl("PEI", "PEI", 130, "PEI", "PEI"));
    // 페루 솔
    result.put("PEN", new CurrencyDataImpl("PEN", "S/.", 2, "S/.", "S/."));
    // 페루 솔 (1863–1965)
    result.put("PES", new CurrencyDataImpl("PES", "PES", 130, "PES", "PES"));
    // 파푸아뉴기니 키나
    result.put("PGK", new CurrencyDataImpl("PGK", "PGK", 2, "PGK", "PGK"));
    // 필리핀 페소
    result.put("PHP", new CurrencyDataImpl("PHP", "PHP", 2, "PHP", "₱"));
    // 파키스탄 루피
    result.put("PKR", new CurrencyDataImpl("PKR", "PKRs.", 2, "PKRs.", "Rs"));
    // 폴란드 즐로티
    result.put("PLN", new CurrencyDataImpl("PLN", "PLN", 2, "PLN", "zł"));
    // 폴란드 즐로티 (1950–1995)
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130, "PLZ", "PLZ"));
    // 포르투갈 에스쿠도
    result.put("PTE", new CurrencyDataImpl("PTE", "PTE", 130, "PTE", "PTE"));
    // 파라과이 과라니
    result.put("PYG", new CurrencyDataImpl("PYG", "PYG", 0, "PYG", "Gs"));
    // 카타르 리얄
    result.put("QAR", new CurrencyDataImpl("QAR", "QAR", 2, "QAR", "Rial"));
    // 로디지아 달러
    result.put("RHD", new CurrencyDataImpl("RHD", "RHD", 130, "RHD", "RHD"));
    // 루마니아 레이
    result.put("ROL", new CurrencyDataImpl("ROL", "ROL", 130, "ROL", "ROL"));
    // 루마니아 레우
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2, "RON", "RON"));
    // 세르비아 디나르
    result.put("RSD", new CurrencyDataImpl("RSD", "RSD", 0, "RSD", "din"));
    // 러시아 루블
    result.put("RUB", new CurrencyDataImpl("RUB", "руб.", 2, "руб.", "руб."));
    // 러시아 루블 (1991–1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130, "RUR", "RUR"));
    // 르완다 프랑
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0, "RWF", "RF"));
    // 사우디아라비아 리얄
    result.put("SAR", new CurrencyDataImpl("SAR", "SR", 2, "SR", "Rial"));
    // 솔로몬 제도 달러
    result.put("SBD", new CurrencyDataImpl("SBD", "SBD", 2, "SBD", "$"));
    // 세이셸 루피
    result.put("SCR", new CurrencyDataImpl("SCR", "SCR", 2, "SCR", "SCR"));
    // 수단 디나르
    result.put("SDD", new CurrencyDataImpl("SDD", "SDD", 130, "SDD", "SDD"));
    // 수단 파운드
    result.put("SDG", new CurrencyDataImpl("SDG", "SDG", 2, "SDG", "SDG"));
    // 고 수단 파운드
    result.put("SDP", new CurrencyDataImpl("SDP", "SDP", 130, "SDP", "SDP"));
    // 스웨덴 크로나
    result.put("SEK", new CurrencyDataImpl("SEK", "kr", 2, "kr", "kr"));
    // 싱가폴 달러
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$", "$"));
    // 세인트헬레나 파운드
    result.put("SHP", new CurrencyDataImpl("SHP", "SHP", 2, "SHP", "£"));
    // 슬로베니아 톨라르
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130, "SIT", "SIT"));
    // 슬로바키아 코루나
    result.put("SKK", new CurrencyDataImpl("SKK", "SKK", 130, "SKK", "SKK"));
    // 시에라리온 리온
    result.put("SLL", new CurrencyDataImpl("SLL", "SLL", 0, "SLL", "SLL"));
    // 소말리아 실링
    result.put("SOS", new CurrencyDataImpl("SOS", "SOS", 0, "SOS", "SOS"));
    // 수리남 달러
    result.put("SRD", new CurrencyDataImpl("SRD", "SRD", 2, "SRD", "$"));
    // 수리남 길더
    result.put("SRG", new CurrencyDataImpl("SRG", "SRG", 130, "SRG", "SRG"));
    // 남수단 파운드
    result.put("SSP", new CurrencyDataImpl("SSP", "SSP", 2, "SSP", "SSP"));
    // 상투메 프린시페 도브라 (1977–2017)
    result.put("STD", new CurrencyDataImpl("STD", "STD", 128, "STD", "Db"));
    // 상투메 프린시페 도브라
    result.put("STN", new CurrencyDataImpl("STN", "STN", 2, "STN", "STN"));
    // 소련 루블
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130, "SUR", "SUR"));
    // 엘살바도르 콜론
    result.put("SVC", new CurrencyDataImpl("SVC", "SVC", 130, "SVC", "SVC"));
    // 시리아 파운드
    result.put("SYP", new CurrencyDataImpl("SYP", "SYP", 0, "SYP", "£"));
    // 스와질란드 릴랑게니
    result.put("SZL", new CurrencyDataImpl("SZL", "SZL", 2, "SZL", "SZL"));
    // 태국 바트
    result.put("THB", new CurrencyDataImpl("THB", "THB", 2, "THB", "฿"));
    // 타지키스탄 루블
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130, "TJR", "TJR"));
    // 타지키스탄 소모니
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2, "TJS", "Som"));
    // 투르크메니스탄 마나트 (1993–2009)
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 128, "TMM", "TMM"));
    // 투르크메니스탄 마나트
    result.put("TMT", new CurrencyDataImpl("TMT", "TMT", 2, "TMT", "TMT"));
    // 튀니지 디나르
    result.put("TND", new CurrencyDataImpl("TND", "TND", 3, "TND", "din"));
    // 통가 파앙가
    result.put("TOP", new CurrencyDataImpl("TOP", "TOP", 2, "TOP", "T$"));
    // 티모르 에스쿠도
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130, "TPE", "TPE"));
    // 터키 리라
    result.put("TRL", new CurrencyDataImpl("TRL", "TRL", 128, "TRL", "TRL"));
    // 신 터키 리라
    result.put("TRY", new CurrencyDataImpl("TRY", "TL", 2, "YTL", "TL"));
    // 트리니다드 토바고 달러
    result.put("TTD", new CurrencyDataImpl("TTD", "TTD", 2, "TTD", "$"));
    // 신 타이완 달러
    result.put("TWD", new CurrencyDataImpl("TWD", "NT$", 2, "NT$", "NT$"));
    // 탄자니아 실링
    result.put("TZS", new CurrencyDataImpl("TZS", "TZS", 2, "TZS", "TSh"));
    // 우크라이나 그리브나
    result.put("UAH", new CurrencyDataImpl("UAH", "UAH", 2, "UAH", "₴"));
    // 우크라이나 카보바네츠
    result.put("UAK", new CurrencyDataImpl("UAK", "UAK", 130, "UAK", "UAK"));
    // 우간다 실링 (1966–1987)
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130, "UGS", "UGS"));
    // 우간다 실링
    result.put("UGX", new CurrencyDataImpl("UGX", "UGX", 0, "UGX", "UGX"));
    // 미국 달러
    result.put("USD", new CurrencyDataImpl("USD", "US$", 2, "US$", "$"));
    // 미국 달러(다음날)
    result.put("USN", new CurrencyDataImpl("USN", "USN", 130, "USN", "USN"));
    // 미국 달러(당일)
    result.put("USS", new CurrencyDataImpl("USS", "USS", 130, "USS", "USS"));
    // 우루과이 페소 (UI)
    result.put("UYI", new CurrencyDataImpl("UYI", "UYI", 128, "UYI", "UYI"));
    // 우루과이 페소 (1975–1993)
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130, "UYP", "UYP"));
    // 우루과이 페소 우루과요
    result.put("UYU", new CurrencyDataImpl("UYU", "UY$", 2, "UY$", "$"));
    // 우즈베키스탄 숨
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 2, "UZS", "soʼm"));
    // 베네주엘라 볼리바르 (1871–2008)
    result.put("VEB", new CurrencyDataImpl("VEB", "VEB", 130, "VEB", "VEB"));
    // 베네수엘라 볼리바르 (2008–2018)
    result.put("VEF", new CurrencyDataImpl("VEF", "VEF", 130, "VEF", "Bs"));
    // 베네수엘라 볼리바르
    result.put("VES", new CurrencyDataImpl("VES", "VES", 2, "VES", "VES"));
    // 베트남 동
    result.put("VND", new CurrencyDataImpl("VND", "₫", 24, "₫", "₫"));
    // 베트남 동 (1978–1985)
    result.put("VNN", new CurrencyDataImpl("VNN", "VNN", 130, "VNN", "VNN"));
    // 바누아투 바투
    result.put("VUV", new CurrencyDataImpl("VUV", "VUV", 0, "VUV", "VUV"));
    // 서 사모아 탈라
    result.put("WST", new CurrencyDataImpl("WST", "WST", 2, "WST", "WST"));
    // 중앙아프리카 CFA 프랑
    result.put("XAF", new CurrencyDataImpl("XAF", "FCFA", 0, "FCFA", "FCFA"));
    // 은화
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 130, "XAG", "XAG"));
    // 금
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 130, "XAU", "XAU"));
    // 유르코 (유럽 회계 단위)
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 130, "XBA", "XBA"));
    // 유럽 통화 동맹
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 130, "XBB", "XBB"));
    // 유럽 계산 단위 (XBC)
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 130, "XBC", "XBC"));
    // 유럽 계산 단위 (XBD)
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 130, "XBD", "XBD"));
    // 동카리브 달러
    result.put("XCD", new CurrencyDataImpl("XCD", "EC$", 2, "EC$", "$"));
    // 특별인출권
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 130, "XDR", "XDR"));
    // 유럽 환율 단위
    result.put("XEU", new CurrencyDataImpl("XEU", "XEU", 130, "XEU", "XEU"));
    // 프랑스 프랑 (Gold)
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 130, "XFO", "XFO"));
    // 프랑스 프랑 (UIC)
    result.put("XFU", new CurrencyDataImpl("XFU", "XFU", 130, "XFU", "XFU"));
    // 서아프리카 CFA 프랑
    result.put("XOF", new CurrencyDataImpl("XOF", "CFA", 0, "CFA", "CFA"));
    // 팔라듐
    result.put("XPD", new CurrencyDataImpl("XPD", "XPD", 130, "XPD", "XPD"));
    // CFP 프랑
    result.put("XPF", new CurrencyDataImpl("XPF", "CFPF", 0, "CFPF", "FCFP"));
    // 백금
    result.put("XPT", new CurrencyDataImpl("XPT", "XPT", 130, "XPT", "XPT"));
    // RINET 기금
    result.put("XRE", new CurrencyDataImpl("XRE", "XRE", 130, "XRE", "XRE"));
    // 테스트 통화 코드
    result.put("XTS", new CurrencyDataImpl("XTS", "XTS", 130, "XTS", "XTS"));
    // 알 수 없는 통화 단위
    result.put("XXX", new CurrencyDataImpl("XXX", "¤", 130, "¤", "¤"));
    // 예멘 디나르
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130, "YDD", "YDD"));
    // 예멘 리알
    result.put("YER", new CurrencyDataImpl("YER", "YER", 0, "YER", "Rial"));
    // 유고슬라비아 동전 디나르
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130, "YUD", "YUD"));
    // 유고슬라비아 노비 디나르
    result.put("YUM", new CurrencyDataImpl("YUM", "YUM", 130, "YUM", "YUM"));
    // 유고슬라비아 전환 디나르
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130, "YUN", "YUN"));
    // 남아프리카 랜드 (금융)
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 130, "ZAL", "ZAL"));
    // 남아프리카 랜드
    result.put("ZAR", new CurrencyDataImpl("ZAR", "ZAR", 2, "ZAR", "R"));
    // 쟘비아 콰쳐 (1968–2012)
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZMK", 128, "ZMK", "ZWK"));
    // 잠비아 콰쳐
    result.put("ZMW", new CurrencyDataImpl("ZMW", "ZMW", 2, "ZMW", "ZMW"));
    // 자이르 신권 자이르
    result.put("ZRN", new CurrencyDataImpl("ZRN", "ZRN", 130, "ZRN", "ZRN"));
    // 자이르 자이르
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"));
    // 짐바브웨 달러
    result.put("ZWD", new CurrencyDataImpl("ZWD", "ZWD", 128, "ZWD", "ZWD"));
    // 짐바브웨 달러 (2009)
    result.put("ZWL", new CurrencyDataImpl("ZWL", "ZWL", 130, "ZWL", "ZWL"));
    // 짐바브웨 달러 (2008)
    result.put("ZWR", new CurrencyDataImpl("ZWR", "ZWR", 130, "ZWR", "ZWR"));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // 안도라 페세타
      "ADP": [ "ADP", "ADP", 128, "ADP", "ADP"],
      // 아랍에미리트 디르함
      "AED": [ "AED", "DH", 2, "DH", "dh"],
      // 아프가니 (1927–2002)
      "AFA": [ "AFA", "AFA", 130, "AFA", "AFA"],
      // 아프가니스탄 아프가니
      "AFN": [ "AFN", "AFN", 0, "AFN", "Af."],
      // 알바니아 레크
      "ALL": [ "ALL", "ALL", 0, "ALL", "Lek"],
      // 아르메니아 드람
      "AMD": [ "AMD", "AMD", 2, "AMD", "Dram"],
      // 네덜란드령 안틸레스 길더
      "ANG": [ "ANG", "ANG", 2, "ANG", "ANG"],
      // 앙골라 콴자
      "AOA": [ "AOA", "AOA", 2, "AOA", "Kz"],
      // 앙골라 콴자 (1977–1990)
      "AOK": [ "AOK", "AOK", 130, "AOK", "AOK"],
      // 앙골라 신콴자 (1990–2000)
      "AON": [ "AON", "AON", 130, "AON", "AON"],
      // 앙골라 재조정 콴자 (1995–1999)
      "AOR": [ "AOR", "AOR", 130, "AOR", "AOR"],
      // 아르헨티나 오스트랄
      "ARA": [ "ARA", "ARA", 130, "ARA", "ARA"],
      // 아르헨티나 페소 레이 (1970–1983)
      "ARL": [ "ARL", "ARL", 130, "ARL", "ARL"],
      // 아르헨티나 페소 (18810–1970)
      "ARM": [ "ARM", "ARM", 130, "ARM", "ARM"],
      // 아르헨티나 페소 (1983–1985)
      "ARP": [ "ARP", "ARP", 130, "ARP", "ARP"],
      // 아르헨티나 페소
      "ARS": [ "ARS", "AR$", 2, "AR$", "$"],
      // 호주 실링
      "ATS": [ "ATS", "ATS", 130, "ATS", "ATS"],
      // 호주 달러
      "AUD": [ "AUD", "AU$", 2, "AU$", "$"],
      // 아루바 플로린
      "AWG": [ "AWG", "AWG", 2, "AWG", "Afl."],
      // 아제르바이젠 마나트(1993–2006)
      "AZM": [ "AZM", "AZM", 130, "AZM", "AZM"],
      // 아제르바이잔 마나트
      "AZN": [ "AZN", "AZN", 2, "AZN", "man."],
      // 보스니아-헤르체고비나 디나르
      "BAD": [ "BAD", "BAD", 130, "BAD", "BAD"],
      // 보스니아-헤르체고비나 태환 마르크
      "BAM": [ "BAM", "BAM", 2, "BAM", "KM"],
      // 보스니아-헤르체고비나 신디나르 (1994–1997)
      "BAN": [ "BAN", "BAN", 130, "BAN", "BAN"],
      // 바베이도스 달러
      "BBD": [ "BBD", "BBD", 2, "BBD", "$"],
      // 방글라데시 타카
      "BDT": [ "BDT", "Tk", 2, "Tk", "৳"],
      // 벨기에 프랑 (태환)
      "BEC": [ "BEC", "BEC", 130, "BEC", "BEC"],
      // 벨기에 프랑
      "BEF": [ "BEF", "BEF", 130, "BEF", "BEF"],
      // 벨기에 프랑 (금융)
      "BEL": [ "BEL", "BEL", 130, "BEL", "BEL"],
      // 불가리아 동전 렛
      "BGL": [ "BGL", "BGL", 130, "BGL", "BGL"],
      // 불가리아 사회주의자 렛
      "BGM": [ "BGM", "BGM", 130, "BGM", "BGM"],
      // 불가리아 레프
      "BGN": [ "BGN", "BGN", 2, "BGN", "lev"],
      // 불가리아 렛 (1879–1952)
      "BGO": [ "BGO", "BGO", 130, "BGO", "BGO"],
      // 바레인 디나르
      "BHD": [ "BHD", "BHD", 3, "BHD", "din"],
      // 부룬디 프랑
      "BIF": [ "BIF", "BIF", 0, "BIF", "FBu"],
      // 버뮤다 달러
      "BMD": [ "BMD", "BMD", 2, "BMD", "$"],
      // 부루나이 달러
      "BND": [ "BND", "BND", 2, "BND", "$"],
      // 볼리비아노
      "BOB": [ "BOB", "BOB", 2, "BOB", "Bs"],
      // 볼리비아 볼리비아노 (1863–1963)
      "BOL": [ "BOL", "BOL", 130, "BOL", "BOL"],
      // 볼리비아노 페소
      "BOP": [ "BOP", "BOP", 130, "BOP", "BOP"],
      // 볼리비아노 Mvdol(기금)
      "BOV": [ "BOV", "BOV", 130, "BOV", "BOV"],
      // 볼리비아노 크루제이루 노보 (1967–1986)
      "BRB": [ "BRB", "BRB", 130, "BRB", "BRB"],
      // 브라질 크루자두
      "BRC": [ "BRC", "BRC", 130, "BRC", "BRC"],
      // 브라질 크루제이루 (1990–1993)
      "BRE": [ "BRE", "BRE", 130, "BRE", "BRE"],
      // 브라질 레알
      "BRL": [ "BRL", "R$", 2, "R$", "R$"],
      // 브라질 크루자두 노보
      "BRN": [ "BRN", "BRN", 130, "BRN", "BRN"],
      // 브라질 크루제이루
      "BRR": [ "BRR", "BRR", 130, "BRR", "BRR"],
      // 브라질 크루제이루 (1942–1967)
      "BRZ": [ "BRZ", "BRZ", 130, "BRZ", "BRZ"],
      // 바하마 달러
      "BSD": [ "BSD", "BSD", 2, "BSD", "$"],
      // 부탄 눌투눔
      "BTN": [ "BTN", "BTN", 2, "BTN", "Nu."],
      // 버마 차트
      "BUK": [ "BUK", "BUK", 130, "BUK", "BUK"],
      // 보츠와나 폴라
      "BWP": [ "BWP", "BWP", 2, "BWP", "P"],
      // 벨라루스 신권 루블 (1994–1999)
      "BYB": [ "BYB", "BYB", 130, "BYB", "BYB"],
      // 벨라루스 루블
      "BYN": [ "BYN", "BYN", 2, "BYN", "BYN"],
      // 벨라루스 루블 (2000–2016)
      "BYR": [ "BYR", "BYR", 128, "BYR", "BYR"],
      // 벨리즈 달러
      "BZD": [ "BZD", "BZD", 2, "BZD", "$"],
      // 캐나다 달러
      "CAD": [ "CAD", "CA$", 2, "C$", "$"],
      // 콩고 프랑 콩골라스
      "CDF": [ "CDF", "CDF", 2, "CDF", "FrCD"],
      // 유로 (WIR)
      "CHE": [ "CHE", "CHE", 130, "CHE", "CHE"],
      // 스위스 프랑
      "CHF": [ "CHF", "CHF", 2, "CHF", "CHF"],
      // 프랑 (WIR)
      "CHW": [ "CHW", "CHW", 130, "CHW", "CHW"],
      // 칠레 에스쿠도
      "CLE": [ "CLE", "CLE", 130, "CLE", "CLE"],
      // 칠레 (UF)
      "CLF": [ "CLF", "CLF", 132, "CLF", "CLF"],
      // 칠레 페소
      "CLP": [ "CLP", "CL$", 0, "CL$", "$"],
      // 중국 위안화(역외)
      "CNH": [ "CNH", "CNH", 130, "CNH", "CNH"],
      // 중국 위안화
      "CNY": [ "CNY", "CN¥", 2, "RMB¥", "¥"],
      // 콜롬비아 페소
      "COP": [ "COP", "COL$", 2, "COL$", "$"],
      // 콜롬비아 실가 단위
      "COU": [ "COU", "COU", 130, "COU", "COU"],
      // 코스타리카 콜론
      "CRC": [ "CRC", "CR₡", 2, "CR₡", "₡"],
      // 고 세르비아 디나르
      "CSD": [ "CSD", "CSD", 130, "CSD", "CSD"],
      // 체코슬로바키아 동전 코루나
      "CSK": [ "CSK", "CSK", 130, "CSK", "CSK"],
      // 쿠바 태환 페소
      "CUC": [ "CUC", "CUC", 2, "CUC", "$"],
      // 쿠바 페소
      "CUP": [ "CUP", "$MN", 2, "$MN", "$"],
      // 카보베르데 에스쿠도
      "CVE": [ "CVE", "CVE", 2, "CVE", "CVE"],
      // 싸이프러스 파운드
      "CYP": [ "CYP", "CYP", 130, "CYP", "CYP"],
      // 체코 공화국 코루나
      "CZK": [ "CZK", "Kč", 2, "Kč", "Kč"],
      // 동독 오스트마르크
      "DDM": [ "DDM", "DDM", 130, "DDM", "DDM"],
      // 독일 마르크
      "DEM": [ "DEM", "DEM", 130, "DEM", "DEM"],
      // 지부티 프랑
      "DJF": [ "DJF", "Fdj", 0, "Fdj", "Fdj"],
      // 덴마크 크로네
      "DKK": [ "DKK", "kr", 2, "kr", "kr"],
      // 도미니카 페소
      "DOP": [ "DOP", "RD$", 2, "RD$", "$"],
      // 알제리 디나르
      "DZD": [ "DZD", "DZD", 2, "DZD", "din"],
      // 에쿠아도르 수크레
      "ECS": [ "ECS", "ECS", 130, "ECS", "ECS"],
      // 에콰도르 (UVC)
      "ECV": [ "ECV", "ECV", 130, "ECV", "ECV"],
      // 에스토니아 크룬
      "EEK": [ "EEK", "EEK", 130, "EEK", "EEK"],
      // 이집트 파운드
      "EGP": [ "EGP", "LE", 2, "LE", "E£"],
      // 에리트리아 나크파
      "ERN": [ "ERN", "ERN", 2, "ERN", "Nfk"],
      // 스페인 페세타(예금)
      "ESA": [ "ESA", "ESA", 130, "ESA", "ESA"],
      // 스페인 페세타(변환 예금)
      "ESB": [ "ESB", "ESB", 130, "ESB", "ESB"],
      // 스페인 페세타
      "ESP": [ "ESP", "ESP", 128, "ESP", "ESP"],
      // 에티오피아 비르
      "ETB": [ "ETB", "ETB", 2, "ETB", "Birr"],
      // 유로
      "EUR": [ "EUR", "€", 2, "€", "€"],
      // 핀란드 마르카
      "FIM": [ "FIM", "FIM", 130, "FIM", "FIM"],
      // 피지 달러
      "FJD": [ "FJD", "FJD", 2, "FJD", "$"],
      // 포클랜드제도 파운드
      "FKP": [ "FKP", "FKP", 2, "FKP", "£"],
      // 프랑스 프랑
      "FRF": [ "FRF", "FRF", 130, "FRF", "FRF"],
      // 파운드
      "GBP": [ "GBP", "£", 2, "GB£", "£"],
      // 그루지야 지폐 라리트
      "GEK": [ "GEK", "GEK", 130, "GEK", "GEK"],
      // 조지아 라리
      "GEL": [ "GEL", "₾", 2, "₾", "GEL"],
      // 가나 시디 (1979–2007)
      "GHC": [ "GHC", "GHC", 130, "GHC", "GHC"],
      // 가나 시디
      "GHS": [ "GHS", "GHS", 2, "GHS", "GHS"],
      // 지브롤터 파운드
      "GIP": [ "GIP", "GIP", 2, "GIP", "£"],
      // 감비아 달라시
      "GMD": [ "GMD", "GMD", 2, "GMD", "GMD"],
      // 기니 프랑
      "GNF": [ "GNF", "GNF", 0, "GNF", "FG"],
      // 기니 시리
      "GNS": [ "GNS", "GNS", 130, "GNS", "GNS"],
      // 적도 기니 에쿨 (Ekwele)
      "GQE": [ "GQE", "GQE", 130, "GQE", "GQE"],
      // 그리스 드라크마
      "GRD": [ "GRD", "GRD", 130, "GRD", "GRD"],
      // 과테말라 케트살
      "GTQ": [ "GTQ", "GTQ", 2, "GTQ", "Q"],
      // 포르투갈령 기니 에스쿠도
      "GWE": [ "GWE", "GWE", 130, "GWE", "GWE"],
      // 기네비쏘 페소
      "GWP": [ "GWP", "GWP", 130, "GWP", "GWP"],
      // 가이아나 달러
      "GYD": [ "GYD", "GYD", 2, "GYD", "$"],
      // 홍콩 달러
      "HKD": [ "HKD", "HK$", 2, "HK$", "$"],
      // 온두라스 렘피라
      "HNL": [ "HNL", "L", 2, "L", "L"],
      // 크로아티아 디나르
      "HRD": [ "HRD", "HRD", 130, "HRD", "HRD"],
      // 크로아티아 쿠나
      "HRK": [ "HRK", "HRK", 2, "HRK", "kn"],
      // 하이티 구르드
      "HTG": [ "HTG", "HTG", 2, "HTG", "HTG"],
      // 헝가리 포린트
      "HUF": [ "HUF", "HUF", 2, "HUF", "Ft"],
      // 인도네시아 루피아
      "IDR": [ "IDR", "IDR", 2, "IDR", "Rp"],
      // 아일랜드 파운드
      "IEP": [ "IEP", "IEP", 130, "IEP", "IEP"],
      // 이스라엘 파운드
      "ILP": [ "ILP", "ILP", 130, "ILP", "ILP"],
      // 이스라엘 신권 세켈
      "ILS": [ "ILS", "₪", 2, "IL₪", "₪"],
      // 인도 루피
      "INR": [ "INR", "₹", 2, "Rs", "₹"],
      // 이라크 디나르
      "IQD": [ "IQD", "IQD", 0, "IQD", "din"],
      // 이란 리얄
      "IRR": [ "IRR", "IRR", 0, "IRR", "Rial"],
      // 아이슬란드 크로나
      "ISK": [ "ISK", "kr", 0, "kr", "kr"],
      // 이탈리아 리라
      "ITL": [ "ITL", "ITL", 128, "ITL", "ITL"],
      // 자메이카 달러
      "JMD": [ "JMD", "JA$", 2, "JA$", "$"],
      // 요르단 디나르
      "JOD": [ "JOD", "JOD", 3, "JOD", "din"],
      // 일본 엔화
      "JPY": [ "JPY", "JP¥", 0, "JP¥", "¥"],
      // 케냐 실링
      "KES": [ "KES", "Ksh", 2, "Ksh", "Ksh"],
      // 키르기스스탄 솜
      "KGS": [ "KGS", "KGS", 2, "KGS", "KGS"],
      // 캄보디아 리얄
      "KHR": [ "KHR", "KHR", 2, "KHR", "Riel"],
      // 코모르 프랑
      "KMF": [ "KMF", "KMF", 0, "KMF", "CF"],
      // 조선 민주주의 인민 공화국 원
      "KPW": [ "KPW", "KPW", 0, "KPW", "₩"],
      // 대한민국 환 (1953–1962)
      "KRH": [ "KRH", "KRH", 130, "KRH", "KRH"],
      // 대한민국 원
      "KRW": [ "KRW", "₩", 0, "KR₩", "₩"],
      // 쿠웨이트 디나르
      "KWD": [ "KWD", "KWD", 3, "KWD", "din"],
      // 케이맨 제도 달러
      "KYD": [ "KYD", "KYD", 2, "KYD", "$"],
      // 카자흐스탄 텐게
      "KZT": [ "KZT", "KZT", 2, "KZT", "₸"],
      // 라오스 키프
      "LAK": [ "LAK", "LAK", 0, "LAK", "₭"],
      // 레바논 파운드
      "LBP": [ "LBP", "LBP", 0, "LBP", "L£"],
      // 스리랑카 루피
      "LKR": [ "LKR", "SLRs", 2, "SLRs", "Rs"],
      // 라이베리아 달러
      "LRD": [ "LRD", "LRD", 2, "LRD", "$"],
      // 레소토 로티
      "LSL": [ "LSL", "LSL", 2, "LSL", "LSL"],
      // 리투아니아 리타
      "LTL": [ "LTL", "LTL", 130, "LTL", "Lt"],
      // 룩셈부르크 타로나
      "LTT": [ "LTT", "LTT", 130, "LTT", "LTT"],
      // 룩셈부르크 변환 프랑
      "LUC": [ "LUC", "LUC", 130, "LUC", "LUC"],
      // 룩셈부르크 프랑
      "LUF": [ "LUF", "LUF", 128, "LUF", "LUF"],
      // 룩셈부르크 재정 프랑
      "LUL": [ "LUL", "LUL", 130, "LUL", "LUL"],
      // 라트비아 라트
      "LVL": [ "LVL", "LVL", 130, "LVL", "Ls"],
      // 라트비아 루블
      "LVR": [ "LVR", "LVR", 130, "LVR", "LVR"],
      // 리비아 디나르
      "LYD": [ "LYD", "LYD", 3, "LYD", "din"],
      // 모로코 디렘
      "MAD": [ "MAD", "MAD", 2, "MAD", "MAD"],
      // 모로코 프랑
      "MAF": [ "MAF", "MAF", 130, "MAF", "MAF"],
      // 모나코 프랑
      "MCF": [ "MCF", "MCF", 130, "MCF", "MCF"],
      // 몰도바 쿠폰
      "MDC": [ "MDC", "MDC", 130, "MDC", "MDC"],
      // 몰도바 레이
      "MDL": [ "MDL", "MDL", 2, "MDL", "MDL"],
      // 마다가스카르 아리아리
      "MGA": [ "MGA", "MGA", 0, "MGA", "Ar"],
      // 마다가스카르 프랑
      "MGF": [ "MGF", "MGF", 128, "MGF", "MGF"],
      // 마케도니아 디나르
      "MKD": [ "MKD", "MKD", 2, "MKD", "din"],
      // 말리 프랑
      "MLF": [ "MLF", "MLF", 130, "MLF", "MLF"],
      // 미얀마 키얏
      "MMK": [ "MMK", "MMK", 0, "MMK", "K"],
      // 몽골 투그릭
      "MNT": [ "MNT", "MN₮", 2, "MN₮", "₮"],
      // 마카오 파타카
      "MOP": [ "MOP", "MOP", 2, "MOP", "MOP"],
      // 모리타니 우기야 (1973–2017)
      "MRO": [ "MRO", "MRO", 128, "MRO", "MRO"],
      // 모리타니 우기야
      "MRU": [ "MRU", "MRU", 2, "MRU", "MRU"],
      // 몰타 리라
      "MTL": [ "MTL", "MTL", 130, "MTL", "MTL"],
      // 몰타 파운드
      "MTP": [ "MTP", "MTP", 130, "MTP", "MTP"],
      // 모리셔스 루피
      "MUR": [ "MUR", "MUR", 2, "MUR", "Rs"],
      // 몰디브 제도 루피아
      "MVR": [ "MVR", "MVR", 2, "MVR", "MVR"],
      // 말라위 콰쳐
      "MWK": [ "MWK", "MWK", 2, "MWK", "MWK"],
      // 멕시코 페소
      "MXN": [ "MXN", "MX$", 2, "Mex$", "$"],
      // 멕시코 실버 페소 (1861–1992)
      "MXP": [ "MXP", "MXP", 130, "MXP", "MXP"],
      // 멕시코 (UDI)
      "MXV": [ "MXV", "MXV", 130, "MXV", "MXV"],
      // 말레이시아 링깃
      "MYR": [ "MYR", "RM", 2, "RM", "RM"],
      // 모잠비크 에스쿠도
      "MZE": [ "MZE", "MZE", 130, "MZE", "MZE"],
      // 고 모잠비크 메티칼
      "MZM": [ "MZM", "MZM", 130, "MZM", "MZM"],
      // 모잠비크 메티칼
      "MZN": [ "MZN", "MZN", 2, "MZN", "MTn"],
      // 나미비아 달러
      "NAD": [ "NAD", "NAD", 2, "NAD", "$"],
      // 니제르 나이라
      "NGN": [ "NGN", "NGN", 2, "NGN", "₦"],
      // 니카라과 코르도바
      "NIC": [ "NIC", "NIC", 130, "NIC", "NIC"],
      // 니카라과 코르도바 오로
      "NIO": [ "NIO", "NIO", 2, "NIO", "C$"],
      // 네델란드 길더
      "NLG": [ "NLG", "NLG", 130, "NLG", "NLG"],
      // 노르웨이 크로네
      "NOK": [ "NOK", "NOkr", 2, "NOkr", "kr"],
      // 네팔 루피
      "NPR": [ "NPR", "NPR", 2, "NPR", "Rs"],
      // 뉴질랜드 달러
      "NZD": [ "NZD", "NZ$", 2, "NZ$", "$"],
      // 오만 리얄
      "OMR": [ "OMR", "OMR", 3, "OMR", "Rial"],
      // 파나마 발보아
      "PAB": [ "PAB", "B/.", 2, "B/.", "B/."],
      // 페루 인티
      "PEI": [ "PEI", "PEI", 130, "PEI", "PEI"],
      // 페루 솔
      "PEN": [ "PEN", "S/.", 2, "S/.", "S/."],
      // 페루 솔 (1863–1965)
      "PES": [ "PES", "PES", 130, "PES", "PES"],
      // 파푸아뉴기니 키나
      "PGK": [ "PGK", "PGK", 2, "PGK", "PGK"],
      // 필리핀 페소
      "PHP": [ "PHP", "PHP", 2, "PHP", "₱"],
      // 파키스탄 루피
      "PKR": [ "PKR", "PKRs.", 2, "PKRs.", "Rs"],
      // 폴란드 즐로티
      "PLN": [ "PLN", "PLN", 2, "PLN", "zł"],
      // 폴란드 즐로티 (1950–1995)
      "PLZ": [ "PLZ", "PLZ", 130, "PLZ", "PLZ"],
      // 포르투갈 에스쿠도
      "PTE": [ "PTE", "PTE", 130, "PTE", "PTE"],
      // 파라과이 과라니
      "PYG": [ "PYG", "PYG", 0, "PYG", "Gs"],
      // 카타르 리얄
      "QAR": [ "QAR", "QAR", 2, "QAR", "Rial"],
      // 로디지아 달러
      "RHD": [ "RHD", "RHD", 130, "RHD", "RHD"],
      // 루마니아 레이
      "ROL": [ "ROL", "ROL", 130, "ROL", "ROL"],
      // 루마니아 레우
      "RON": [ "RON", "RON", 2, "RON", "RON"],
      // 세르비아 디나르
      "RSD": [ "RSD", "RSD", 0, "RSD", "din"],
      // 러시아 루블
      "RUB": [ "RUB", "руб.", 2, "руб.", "руб."],
      // 러시아 루블 (1991–1998)
      "RUR": [ "RUR", "RUR", 130, "RUR", "RUR"],
      // 르완다 프랑
      "RWF": [ "RWF", "RWF", 0, "RWF", "RF"],
      // 사우디아라비아 리얄
      "SAR": [ "SAR", "SR", 2, "SR", "Rial"],
      // 솔로몬 제도 달러
      "SBD": [ "SBD", "SBD", 2, "SBD", "$"],
      // 세이셸 루피
      "SCR": [ "SCR", "SCR", 2, "SCR", "SCR"],
      // 수단 디나르
      "SDD": [ "SDD", "SDD", 130, "SDD", "SDD"],
      // 수단 파운드
      "SDG": [ "SDG", "SDG", 2, "SDG", "SDG"],
      // 고 수단 파운드
      "SDP": [ "SDP", "SDP", 130, "SDP", "SDP"],
      // 스웨덴 크로나
      "SEK": [ "SEK", "kr", 2, "kr", "kr"],
      // 싱가폴 달러
      "SGD": [ "SGD", "S$", 2, "S$", "$"],
      // 세인트헬레나 파운드
      "SHP": [ "SHP", "SHP", 2, "SHP", "£"],
      // 슬로베니아 톨라르
      "SIT": [ "SIT", "SIT", 130, "SIT", "SIT"],
      // 슬로바키아 코루나
      "SKK": [ "SKK", "SKK", 130, "SKK", "SKK"],
      // 시에라리온 리온
      "SLL": [ "SLL", "SLL", 0, "SLL", "SLL"],
      // 소말리아 실링
      "SOS": [ "SOS", "SOS", 0, "SOS", "SOS"],
      // 수리남 달러
      "SRD": [ "SRD", "SRD", 2, "SRD", "$"],
      // 수리남 길더
      "SRG": [ "SRG", "SRG", 130, "SRG", "SRG"],
      // 남수단 파운드
      "SSP": [ "SSP", "SSP", 2, "SSP", "SSP"],
      // 상투메 프린시페 도브라 (1977–2017)
      "STD": [ "STD", "STD", 128, "STD", "Db"],
      // 상투메 프린시페 도브라
      "STN": [ "STN", "STN", 2, "STN", "STN"],
      // 소련 루블
      "SUR": [ "SUR", "SUR", 130, "SUR", "SUR"],
      // 엘살바도르 콜론
      "SVC": [ "SVC", "SVC", 130, "SVC", "SVC"],
      // 시리아 파운드
      "SYP": [ "SYP", "SYP", 0, "SYP", "£"],
      // 스와질란드 릴랑게니
      "SZL": [ "SZL", "SZL", 2, "SZL", "SZL"],
      // 태국 바트
      "THB": [ "THB", "THB", 2, "THB", "฿"],
      // 타지키스탄 루블
      "TJR": [ "TJR", "TJR", 130, "TJR", "TJR"],
      // 타지키스탄 소모니
      "TJS": [ "TJS", "TJS", 2, "TJS", "Som"],
      // 투르크메니스탄 마나트 (1993–2009)
      "TMM": [ "TMM", "TMM", 128, "TMM", "TMM"],
      // 투르크메니스탄 마나트
      "TMT": [ "TMT", "TMT", 2, "TMT", "TMT"],
      // 튀니지 디나르
      "TND": [ "TND", "TND", 3, "TND", "din"],
      // 통가 파앙가
      "TOP": [ "TOP", "TOP", 2, "TOP", "T$"],
      // 티모르 에스쿠도
      "TPE": [ "TPE", "TPE", 130, "TPE", "TPE"],
      // 터키 리라
      "TRL": [ "TRL", "TRL", 128, "TRL", "TRL"],
      // 신 터키 리라
      "TRY": [ "TRY", "TL", 2, "YTL", "TL"],
      // 트리니다드 토바고 달러
      "TTD": [ "TTD", "TTD", 2, "TTD", "$"],
      // 신 타이완 달러
      "TWD": [ "TWD", "NT$", 2, "NT$", "NT$"],
      // 탄자니아 실링
      "TZS": [ "TZS", "TZS", 2, "TZS", "TSh"],
      // 우크라이나 그리브나
      "UAH": [ "UAH", "UAH", 2, "UAH", "₴"],
      // 우크라이나 카보바네츠
      "UAK": [ "UAK", "UAK", 130, "UAK", "UAK"],
      // 우간다 실링 (1966–1987)
      "UGS": [ "UGS", "UGS", 130, "UGS", "UGS"],
      // 우간다 실링
      "UGX": [ "UGX", "UGX", 0, "UGX", "UGX"],
      // 미국 달러
      "USD": [ "USD", "US$", 2, "US$", "$"],
      // 미국 달러(다음날)
      "USN": [ "USN", "USN", 130, "USN", "USN"],
      // 미국 달러(당일)
      "USS": [ "USS", "USS", 130, "USS", "USS"],
      // 우루과이 페소 (UI)
      "UYI": [ "UYI", "UYI", 128, "UYI", "UYI"],
      // 우루과이 페소 (1975–1993)
      "UYP": [ "UYP", "UYP", 130, "UYP", "UYP"],
      // 우루과이 페소 우루과요
      "UYU": [ "UYU", "UY$", 2, "UY$", "$"],
      // 우즈베키스탄 숨
      "UZS": [ "UZS", "UZS", 2, "UZS", "soʼm"],
      // 베네주엘라 볼리바르 (1871–2008)
      "VEB": [ "VEB", "VEB", 130, "VEB", "VEB"],
      // 베네수엘라 볼리바르 (2008–2018)
      "VEF": [ "VEF", "VEF", 130, "VEF", "Bs"],
      // 베네수엘라 볼리바르
      "VES": [ "VES", "VES", 2, "VES", "VES"],
      // 베트남 동
      "VND": [ "VND", "₫", 24, "₫", "₫"],
      // 베트남 동 (1978–1985)
      "VNN": [ "VNN", "VNN", 130, "VNN", "VNN"],
      // 바누아투 바투
      "VUV": [ "VUV", "VUV", 0, "VUV", "VUV"],
      // 서 사모아 탈라
      "WST": [ "WST", "WST", 2, "WST", "WST"],
      // 중앙아프리카 CFA 프랑
      "XAF": [ "XAF", "FCFA", 0, "FCFA", "FCFA"],
      // 은화
      "XAG": [ "XAG", "XAG", 130, "XAG", "XAG"],
      // 금
      "XAU": [ "XAU", "XAU", 130, "XAU", "XAU"],
      // 유르코 (유럽 회계 단위)
      "XBA": [ "XBA", "XBA", 130, "XBA", "XBA"],
      // 유럽 통화 동맹
      "XBB": [ "XBB", "XBB", 130, "XBB", "XBB"],
      // 유럽 계산 단위 (XBC)
      "XBC": [ "XBC", "XBC", 130, "XBC", "XBC"],
      // 유럽 계산 단위 (XBD)
      "XBD": [ "XBD", "XBD", 130, "XBD", "XBD"],
      // 동카리브 달러
      "XCD": [ "XCD", "EC$", 2, "EC$", "$"],
      // 특별인출권
      "XDR": [ "XDR", "XDR", 130, "XDR", "XDR"],
      // 유럽 환율 단위
      "XEU": [ "XEU", "XEU", 130, "XEU", "XEU"],
      // 프랑스 프랑 (Gold)
      "XFO": [ "XFO", "XFO", 130, "XFO", "XFO"],
      // 프랑스 프랑 (UIC)
      "XFU": [ "XFU", "XFU", 130, "XFU", "XFU"],
      // 서아프리카 CFA 프랑
      "XOF": [ "XOF", "CFA", 0, "CFA", "CFA"],
      // 팔라듐
      "XPD": [ "XPD", "XPD", 130, "XPD", "XPD"],
      // CFP 프랑
      "XPF": [ "XPF", "CFPF", 0, "CFPF", "FCFP"],
      // 백금
      "XPT": [ "XPT", "XPT", 130, "XPT", "XPT"],
      // RINET 기금
      "XRE": [ "XRE", "XRE", 130, "XRE", "XRE"],
      // 테스트 통화 코드
      "XTS": [ "XTS", "XTS", 130, "XTS", "XTS"],
      // 알 수 없는 통화 단위
      "XXX": [ "XXX", "¤", 130, "¤", "¤"],
      // 예멘 디나르
      "YDD": [ "YDD", "YDD", 130, "YDD", "YDD"],
      // 예멘 리알
      "YER": [ "YER", "YER", 0, "YER", "Rial"],
      // 유고슬라비아 동전 디나르
      "YUD": [ "YUD", "YUD", 130, "YUD", "YUD"],
      // 유고슬라비아 노비 디나르
      "YUM": [ "YUM", "YUM", 130, "YUM", "YUM"],
      // 유고슬라비아 전환 디나르
      "YUN": [ "YUN", "YUN", 130, "YUN", "YUN"],
      // 남아프리카 랜드 (금융)
      "ZAL": [ "ZAL", "ZAL", 130, "ZAL", "ZAL"],
      // 남아프리카 랜드
      "ZAR": [ "ZAR", "ZAR", 2, "ZAR", "R"],
      // 쟘비아 콰쳐 (1968–2012)
      "ZMK": [ "ZMK", "ZMK", 128, "ZMK", "ZWK"],
      // 잠비아 콰쳐
      "ZMW": [ "ZMW", "ZMW", 2, "ZMW", "ZMW"],
      // 자이르 신권 자이르
      "ZRN": [ "ZRN", "ZRN", 130, "ZRN", "ZRN"],
      // 자이르 자이르
      "ZRZ": [ "ZRZ", "ZRZ", 130, "ZRZ", "ZRZ"],
      // 짐바브웨 달러
      "ZWD": [ "ZWD", "ZWD", 128, "ZWD", "ZWD"],
      // 짐바브웨 달러 (2009)
      "ZWL": [ "ZWL", "ZWL", 130, "ZWL", "ZWL"],
      // 짐바브웨 달러 (2008)
      "ZWR": [ "ZWR", "ZWR", 130, "ZWR", "ZWR"],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("ADP", "안도라 페세타");
    result.put("AED", "아랍에미리트 디르함");
    result.put("AFA", "아프가니 (1927–2002)");
    result.put("AFN", "아프가니스탄 아프가니");
    result.put("ALL", "알바니아 레크");
    result.put("AMD", "아르메니아 드람");
    result.put("ANG", "네덜란드령 안틸레스 길더");
    result.put("AOA", "앙골라 콴자");
    result.put("AOK", "앙골라 콴자 (1977–1990)");
    result.put("AON", "앙골라 신콴자 (1990–2000)");
    result.put("AOR", "앙골라 재조정 콴자 (1995–1999)");
    result.put("ARA", "아르헨티나 오스트랄");
    result.put("ARL", "아르헨티나 페소 레이 (1970–1983)");
    result.put("ARM", "아르헨티나 페소 (18810–1970)");
    result.put("ARP", "아르헨티나 페소 (1983–1985)");
    result.put("ARS", "아르헨티나 페소");
    result.put("ATS", "호주 실링");
    result.put("AUD", "호주 달러");
    result.put("AWG", "아루바 플로린");
    result.put("AZM", "아제르바이젠 마나트(1993–2006)");
    result.put("AZN", "아제르바이잔 마나트");
    result.put("BAD", "보스니아-헤르체고비나 디나르");
    result.put("BAM", "보스니아-헤르체고비나 태환 마르크");
    result.put("BAN", "보스니아-헤르체고비나 신디나르 (1994–1997)");
    result.put("BBD", "바베이도스 달러");
    result.put("BDT", "방글라데시 타카");
    result.put("BEC", "벨기에 프랑 (태환)");
    result.put("BEF", "벨기에 프랑");
    result.put("BEL", "벨기에 프랑 (금융)");
    result.put("BGL", "불가리아 동전 렛");
    result.put("BGM", "불가리아 사회주의자 렛");
    result.put("BGN", "불가리아 레프");
    result.put("BGO", "불가리아 렛 (1879–1952)");
    result.put("BHD", "바레인 디나르");
    result.put("BIF", "부룬디 프랑");
    result.put("BMD", "버뮤다 달러");
    result.put("BND", "부루나이 달러");
    result.put("BOB", "볼리비아노");
    result.put("BOL", "볼리비아 볼리비아노 (1863–1963)");
    result.put("BOP", "볼리비아노 페소");
    result.put("BOV", "볼리비아노 Mvdol(기금)");
    result.put("BRB", "볼리비아노 크루제이루 노보 (1967–1986)");
    result.put("BRC", "브라질 크루자두");
    result.put("BRE", "브라질 크루제이루 (1990–1993)");
    result.put("BRL", "브라질 레알");
    result.put("BRN", "브라질 크루자두 노보");
    result.put("BRR", "브라질 크루제이루");
    result.put("BRZ", "브라질 크루제이루 (1942–1967)");
    result.put("BSD", "바하마 달러");
    result.put("BTN", "부탄 눌투눔");
    result.put("BUK", "버마 차트");
    result.put("BWP", "보츠와나 폴라");
    result.put("BYB", "벨라루스 신권 루블 (1994–1999)");
    result.put("BYN", "벨라루스 루블");
    result.put("BYR", "벨라루스 루블 (2000–2016)");
    result.put("BZD", "벨리즈 달러");
    result.put("CAD", "캐나다 달러");
    result.put("CDF", "콩고 프랑 콩골라스");
    result.put("CHE", "유로 (WIR)");
    result.put("CHF", "스위스 프랑");
    result.put("CHW", "프랑 (WIR)");
    result.put("CLE", "칠레 에스쿠도");
    result.put("CLF", "칠레 (UF)");
    result.put("CLP", "칠레 페소");
    result.put("CNH", "중국 위안화(역외)");
    result.put("CNY", "중국 위안화");
    result.put("COP", "콜롬비아 페소");
    result.put("COU", "콜롬비아 실가 단위");
    result.put("CRC", "코스타리카 콜론");
    result.put("CSD", "고 세르비아 디나르");
    result.put("CSK", "체코슬로바키아 동전 코루나");
    result.put("CUC", "쿠바 태환 페소");
    result.put("CUP", "쿠바 페소");
    result.put("CVE", "카보베르데 에스쿠도");
    result.put("CYP", "싸이프러스 파운드");
    result.put("CZK", "체코 공화국 코루나");
    result.put("DDM", "동독 오스트마르크");
    result.put("DEM", "독일 마르크");
    result.put("DJF", "지부티 프랑");
    result.put("DKK", "덴마크 크로네");
    result.put("DOP", "도미니카 페소");
    result.put("DZD", "알제리 디나르");
    result.put("ECS", "에쿠아도르 수크레");
    result.put("ECV", "에콰도르 (UVC)");
    result.put("EEK", "에스토니아 크룬");
    result.put("EGP", "이집트 파운드");
    result.put("ERN", "에리트리아 나크파");
    result.put("ESA", "스페인 페세타(예금)");
    result.put("ESB", "스페인 페세타(변환 예금)");
    result.put("ESP", "스페인 페세타");
    result.put("ETB", "에티오피아 비르");
    result.put("EUR", "유로");
    result.put("FIM", "핀란드 마르카");
    result.put("FJD", "피지 달러");
    result.put("FKP", "포클랜드제도 파운드");
    result.put("FRF", "프랑스 프랑");
    result.put("GBP", "파운드");
    result.put("GEK", "그루지야 지폐 라리트");
    result.put("GEL", "조지아 라리");
    result.put("GHC", "가나 시디 (1979–2007)");
    result.put("GHS", "가나 시디");
    result.put("GIP", "지브롤터 파운드");
    result.put("GMD", "감비아 달라시");
    result.put("GNF", "기니 프랑");
    result.put("GNS", "기니 시리");
    result.put("GQE", "적도 기니 에쿨 (Ekwele)");
    result.put("GRD", "그리스 드라크마");
    result.put("GTQ", "과테말라 케트살");
    result.put("GWE", "포르투갈령 기니 에스쿠도");
    result.put("GWP", "기네비쏘 페소");
    result.put("GYD", "가이아나 달러");
    result.put("HKD", "홍콩 달러");
    result.put("HNL", "온두라스 렘피라");
    result.put("HRD", "크로아티아 디나르");
    result.put("HRK", "크로아티아 쿠나");
    result.put("HTG", "하이티 구르드");
    result.put("HUF", "헝가리 포린트");
    result.put("IDR", "인도네시아 루피아");
    result.put("IEP", "아일랜드 파운드");
    result.put("ILP", "이스라엘 파운드");
    result.put("ILS", "이스라엘 신권 세켈");
    result.put("INR", "인도 루피");
    result.put("IQD", "이라크 디나르");
    result.put("IRR", "이란 리얄");
    result.put("ISK", "아이슬란드 크로나");
    result.put("ITL", "이탈리아 리라");
    result.put("JMD", "자메이카 달러");
    result.put("JOD", "요르단 디나르");
    result.put("JPY", "일본 엔화");
    result.put("KES", "케냐 실링");
    result.put("KGS", "키르기스스탄 솜");
    result.put("KHR", "캄보디아 리얄");
    result.put("KMF", "코모르 프랑");
    result.put("KPW", "조선 민주주의 인민 공화국 원");
    result.put("KRH", "대한민국 환 (1953–1962)");
    result.put("KRW", "대한민국 원");
    result.put("KWD", "쿠웨이트 디나르");
    result.put("KYD", "케이맨 제도 달러");
    result.put("KZT", "카자흐스탄 텐게");
    result.put("LAK", "라오스 키프");
    result.put("LBP", "레바논 파운드");
    result.put("LKR", "스리랑카 루피");
    result.put("LRD", "라이베리아 달러");
    result.put("LSL", "레소토 로티");
    result.put("LTL", "리투아니아 리타");
    result.put("LTT", "룩셈부르크 타로나");
    result.put("LUC", "룩셈부르크 변환 프랑");
    result.put("LUF", "룩셈부르크 프랑");
    result.put("LUL", "룩셈부르크 재정 프랑");
    result.put("LVL", "라트비아 라트");
    result.put("LVR", "라트비아 루블");
    result.put("LYD", "리비아 디나르");
    result.put("MAD", "모로코 디렘");
    result.put("MAF", "모로코 프랑");
    result.put("MCF", "모나코 프랑");
    result.put("MDC", "몰도바 쿠폰");
    result.put("MDL", "몰도바 레이");
    result.put("MGA", "마다가스카르 아리아리");
    result.put("MGF", "마다가스카르 프랑");
    result.put("MKD", "마케도니아 디나르");
    result.put("MLF", "말리 프랑");
    result.put("MMK", "미얀마 키얏");
    result.put("MNT", "몽골 투그릭");
    result.put("MOP", "마카오 파타카");
    result.put("MRO", "모리타니 우기야 (1973–2017)");
    result.put("MRU", "모리타니 우기야");
    result.put("MTL", "몰타 리라");
    result.put("MTP", "몰타 파운드");
    result.put("MUR", "모리셔스 루피");
    result.put("MVR", "몰디브 제도 루피아");
    result.put("MWK", "말라위 콰쳐");
    result.put("MXN", "멕시코 페소");
    result.put("MXP", "멕시코 실버 페소 (1861–1992)");
    result.put("MXV", "멕시코 (UDI)");
    result.put("MYR", "말레이시아 링깃");
    result.put("MZE", "모잠비크 에스쿠도");
    result.put("MZM", "고 모잠비크 메티칼");
    result.put("MZN", "모잠비크 메티칼");
    result.put("NAD", "나미비아 달러");
    result.put("NGN", "니제르 나이라");
    result.put("NIC", "니카라과 코르도바");
    result.put("NIO", "니카라과 코르도바 오로");
    result.put("NLG", "네델란드 길더");
    result.put("NOK", "노르웨이 크로네");
    result.put("NPR", "네팔 루피");
    result.put("NZD", "뉴질랜드 달러");
    result.put("OMR", "오만 리얄");
    result.put("PAB", "파나마 발보아");
    result.put("PEI", "페루 인티");
    result.put("PEN", "페루 솔");
    result.put("PES", "페루 솔 (1863–1965)");
    result.put("PGK", "파푸아뉴기니 키나");
    result.put("PHP", "필리핀 페소");
    result.put("PKR", "파키스탄 루피");
    result.put("PLN", "폴란드 즐로티");
    result.put("PLZ", "폴란드 즐로티 (1950–1995)");
    result.put("PTE", "포르투갈 에스쿠도");
    result.put("PYG", "파라과이 과라니");
    result.put("QAR", "카타르 리얄");
    result.put("RHD", "로디지아 달러");
    result.put("ROL", "루마니아 레이");
    result.put("RON", "루마니아 레우");
    result.put("RSD", "세르비아 디나르");
    result.put("RUB", "러시아 루블");
    result.put("RUR", "러시아 루블 (1991–1998)");
    result.put("RWF", "르완다 프랑");
    result.put("SAR", "사우디아라비아 리얄");
    result.put("SBD", "솔로몬 제도 달러");
    result.put("SCR", "세이셸 루피");
    result.put("SDD", "수단 디나르");
    result.put("SDG", "수단 파운드");
    result.put("SDP", "고 수단 파운드");
    result.put("SEK", "스웨덴 크로나");
    result.put("SGD", "싱가폴 달러");
    result.put("SHP", "세인트헬레나 파운드");
    result.put("SIT", "슬로베니아 톨라르");
    result.put("SKK", "슬로바키아 코루나");
    result.put("SLL", "시에라리온 리온");
    result.put("SOS", "소말리아 실링");
    result.put("SRD", "수리남 달러");
    result.put("SRG", "수리남 길더");
    result.put("SSP", "남수단 파운드");
    result.put("STD", "상투메 프린시페 도브라 (1977–2017)");
    result.put("STN", "상투메 프린시페 도브라");
    result.put("SUR", "소련 루블");
    result.put("SVC", "엘살바도르 콜론");
    result.put("SYP", "시리아 파운드");
    result.put("SZL", "스와질란드 릴랑게니");
    result.put("THB", "태국 바트");
    result.put("TJR", "타지키스탄 루블");
    result.put("TJS", "타지키스탄 소모니");
    result.put("TMM", "투르크메니스탄 마나트 (1993–2009)");
    result.put("TMT", "투르크메니스탄 마나트");
    result.put("TND", "튀니지 디나르");
    result.put("TOP", "통가 파앙가");
    result.put("TPE", "티모르 에스쿠도");
    result.put("TRL", "터키 리라");
    result.put("TRY", "신 터키 리라");
    result.put("TTD", "트리니다드 토바고 달러");
    result.put("TWD", "신 타이완 달러");
    result.put("TZS", "탄자니아 실링");
    result.put("UAH", "우크라이나 그리브나");
    result.put("UAK", "우크라이나 카보바네츠");
    result.put("UGS", "우간다 실링 (1966–1987)");
    result.put("UGX", "우간다 실링");
    result.put("USD", "미국 달러");
    result.put("USN", "미국 달러(다음날)");
    result.put("USS", "미국 달러(당일)");
    result.put("UYI", "우루과이 페소 (UI)");
    result.put("UYP", "우루과이 페소 (1975–1993)");
    result.put("UYU", "우루과이 페소 우루과요");
    result.put("UZS", "우즈베키스탄 숨");
    result.put("VEB", "베네주엘라 볼리바르 (1871–2008)");
    result.put("VEF", "베네수엘라 볼리바르 (2008–2018)");
    result.put("VES", "베네수엘라 볼리바르");
    result.put("VND", "베트남 동");
    result.put("VNN", "베트남 동 (1978–1985)");
    result.put("VUV", "바누아투 바투");
    result.put("WST", "서 사모아 탈라");
    result.put("XAF", "중앙아프리카 CFA 프랑");
    result.put("XAG", "은화");
    result.put("XAU", "금");
    result.put("XBA", "유르코 (유럽 회계 단위)");
    result.put("XBB", "유럽 통화 동맹");
    result.put("XBC", "유럽 계산 단위 (XBC)");
    result.put("XBD", "유럽 계산 단위 (XBD)");
    result.put("XCD", "동카리브 달러");
    result.put("XDR", "특별인출권");
    result.put("XEU", "유럽 환율 단위");
    result.put("XFO", "프랑스 프랑 (Gold)");
    result.put("XFU", "프랑스 프랑 (UIC)");
    result.put("XOF", "서아프리카 CFA 프랑");
    result.put("XPD", "팔라듐");
    result.put("XPF", "CFP 프랑");
    result.put("XPT", "백금");
    result.put("XRE", "RINET 기금");
    result.put("XTS", "테스트 통화 코드");
    result.put("XXX", "알 수 없는 통화 단위");
    result.put("YDD", "예멘 디나르");
    result.put("YER", "예멘 리알");
    result.put("YUD", "유고슬라비아 동전 디나르");
    result.put("YUM", "유고슬라비아 노비 디나르");
    result.put("YUN", "유고슬라비아 전환 디나르");
    result.put("ZAL", "남아프리카 랜드 (금융)");
    result.put("ZAR", "남아프리카 랜드");
    result.put("ZMK", "쟘비아 콰쳐 (1968–2012)");
    result.put("ZMW", "잠비아 콰쳐");
    result.put("ZRN", "자이르 신권 자이르");
    result.put("ZRZ", "자이르 자이르");
    result.put("ZWD", "짐바브웨 달러");
    result.put("ZWL", "짐바브웨 달러 (2009)");
    result.put("ZWR", "짐바브웨 달러 (2008)");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "ADP": "안도라 페세타",
      "AED": "아랍에미리트 디르함",
      "AFA": "아프가니 (1927–2002)",
      "AFN": "아프가니스탄 아프가니",
      "ALL": "알바니아 레크",
      "AMD": "아르메니아 드람",
      "ANG": "네덜란드령 안틸레스 길더",
      "AOA": "앙골라 콴자",
      "AOK": "앙골라 콴자 (1977–1990)",
      "AON": "앙골라 신콴자 (1990–2000)",
      "AOR": "앙골라 재조정 콴자 (1995–1999)",
      "ARA": "아르헨티나 오스트랄",
      "ARL": "아르헨티나 페소 레이 (1970–1983)",
      "ARM": "아르헨티나 페소 (18810–1970)",
      "ARP": "아르헨티나 페소 (1983–1985)",
      "ARS": "아르헨티나 페소",
      "ATS": "호주 실링",
      "AUD": "호주 달러",
      "AWG": "아루바 플로린",
      "AZM": "아제르바이젠 마나트(1993–2006)",
      "AZN": "아제르바이잔 마나트",
      "BAD": "보스니아-헤르체고비나 디나르",
      "BAM": "보스니아-헤르체고비나 태환 마르크",
      "BAN": "보스니아-헤르체고비나 신디나르 (1994–1997)",
      "BBD": "바베이도스 달러",
      "BDT": "방글라데시 타카",
      "BEC": "벨기에 프랑 (태환)",
      "BEF": "벨기에 프랑",
      "BEL": "벨기에 프랑 (금융)",
      "BGL": "불가리아 동전 렛",
      "BGM": "불가리아 사회주의자 렛",
      "BGN": "불가리아 레프",
      "BGO": "불가리아 렛 (1879–1952)",
      "BHD": "바레인 디나르",
      "BIF": "부룬디 프랑",
      "BMD": "버뮤다 달러",
      "BND": "부루나이 달러",
      "BOB": "볼리비아노",
      "BOL": "볼리비아 볼리비아노 (1863–1963)",
      "BOP": "볼리비아노 페소",
      "BOV": "볼리비아노 Mvdol(기금)",
      "BRB": "볼리비아노 크루제이루 노보 (1967–1986)",
      "BRC": "브라질 크루자두",
      "BRE": "브라질 크루제이루 (1990–1993)",
      "BRL": "브라질 레알",
      "BRN": "브라질 크루자두 노보",
      "BRR": "브라질 크루제이루",
      "BRZ": "브라질 크루제이루 (1942–1967)",
      "BSD": "바하마 달러",
      "BTN": "부탄 눌투눔",
      "BUK": "버마 차트",
      "BWP": "보츠와나 폴라",
      "BYB": "벨라루스 신권 루블 (1994–1999)",
      "BYN": "벨라루스 루블",
      "BYR": "벨라루스 루블 (2000–2016)",
      "BZD": "벨리즈 달러",
      "CAD": "캐나다 달러",
      "CDF": "콩고 프랑 콩골라스",
      "CHE": "유로 (WIR)",
      "CHF": "스위스 프랑",
      "CHW": "프랑 (WIR)",
      "CLE": "칠레 에스쿠도",
      "CLF": "칠레 (UF)",
      "CLP": "칠레 페소",
      "CNH": "중국 위안화(역외)",
      "CNY": "중국 위안화",
      "COP": "콜롬비아 페소",
      "COU": "콜롬비아 실가 단위",
      "CRC": "코스타리카 콜론",
      "CSD": "고 세르비아 디나르",
      "CSK": "체코슬로바키아 동전 코루나",
      "CUC": "쿠바 태환 페소",
      "CUP": "쿠바 페소",
      "CVE": "카보베르데 에스쿠도",
      "CYP": "싸이프러스 파운드",
      "CZK": "체코 공화국 코루나",
      "DDM": "동독 오스트마르크",
      "DEM": "독일 마르크",
      "DJF": "지부티 프랑",
      "DKK": "덴마크 크로네",
      "DOP": "도미니카 페소",
      "DZD": "알제리 디나르",
      "ECS": "에쿠아도르 수크레",
      "ECV": "에콰도르 (UVC)",
      "EEK": "에스토니아 크룬",
      "EGP": "이집트 파운드",
      "ERN": "에리트리아 나크파",
      "ESA": "스페인 페세타(예금)",
      "ESB": "스페인 페세타(변환 예금)",
      "ESP": "스페인 페세타",
      "ETB": "에티오피아 비르",
      "EUR": "유로",
      "FIM": "핀란드 마르카",
      "FJD": "피지 달러",
      "FKP": "포클랜드제도 파운드",
      "FRF": "프랑스 프랑",
      "GBP": "파운드",
      "GEK": "그루지야 지폐 라리트",
      "GEL": "조지아 라리",
      "GHC": "가나 시디 (1979–2007)",
      "GHS": "가나 시디",
      "GIP": "지브롤터 파운드",
      "GMD": "감비아 달라시",
      "GNF": "기니 프랑",
      "GNS": "기니 시리",
      "GQE": "적도 기니 에쿨 (Ekwele)",
      "GRD": "그리스 드라크마",
      "GTQ": "과테말라 케트살",
      "GWE": "포르투갈령 기니 에스쿠도",
      "GWP": "기네비쏘 페소",
      "GYD": "가이아나 달러",
      "HKD": "홍콩 달러",
      "HNL": "온두라스 렘피라",
      "HRD": "크로아티아 디나르",
      "HRK": "크로아티아 쿠나",
      "HTG": "하이티 구르드",
      "HUF": "헝가리 포린트",
      "IDR": "인도네시아 루피아",
      "IEP": "아일랜드 파운드",
      "ILP": "이스라엘 파운드",
      "ILS": "이스라엘 신권 세켈",
      "INR": "인도 루피",
      "IQD": "이라크 디나르",
      "IRR": "이란 리얄",
      "ISK": "아이슬란드 크로나",
      "ITL": "이탈리아 리라",
      "JMD": "자메이카 달러",
      "JOD": "요르단 디나르",
      "JPY": "일본 엔화",
      "KES": "케냐 실링",
      "KGS": "키르기스스탄 솜",
      "KHR": "캄보디아 리얄",
      "KMF": "코모르 프랑",
      "KPW": "조선 민주주의 인민 공화국 원",
      "KRH": "대한민국 환 (1953–1962)",
      "KRW": "대한민국 원",
      "KWD": "쿠웨이트 디나르",
      "KYD": "케이맨 제도 달러",
      "KZT": "카자흐스탄 텐게",
      "LAK": "라오스 키프",
      "LBP": "레바논 파운드",
      "LKR": "스리랑카 루피",
      "LRD": "라이베리아 달러",
      "LSL": "레소토 로티",
      "LTL": "리투아니아 리타",
      "LTT": "룩셈부르크 타로나",
      "LUC": "룩셈부르크 변환 프랑",
      "LUF": "룩셈부르크 프랑",
      "LUL": "룩셈부르크 재정 프랑",
      "LVL": "라트비아 라트",
      "LVR": "라트비아 루블",
      "LYD": "리비아 디나르",
      "MAD": "모로코 디렘",
      "MAF": "모로코 프랑",
      "MCF": "모나코 프랑",
      "MDC": "몰도바 쿠폰",
      "MDL": "몰도바 레이",
      "MGA": "마다가스카르 아리아리",
      "MGF": "마다가스카르 프랑",
      "MKD": "마케도니아 디나르",
      "MLF": "말리 프랑",
      "MMK": "미얀마 키얏",
      "MNT": "몽골 투그릭",
      "MOP": "마카오 파타카",
      "MRO": "모리타니 우기야 (1973–2017)",
      "MRU": "모리타니 우기야",
      "MTL": "몰타 리라",
      "MTP": "몰타 파운드",
      "MUR": "모리셔스 루피",
      "MVR": "몰디브 제도 루피아",
      "MWK": "말라위 콰쳐",
      "MXN": "멕시코 페소",
      "MXP": "멕시코 실버 페소 (1861–1992)",
      "MXV": "멕시코 (UDI)",
      "MYR": "말레이시아 링깃",
      "MZE": "모잠비크 에스쿠도",
      "MZM": "고 모잠비크 메티칼",
      "MZN": "모잠비크 메티칼",
      "NAD": "나미비아 달러",
      "NGN": "니제르 나이라",
      "NIC": "니카라과 코르도바",
      "NIO": "니카라과 코르도바 오로",
      "NLG": "네델란드 길더",
      "NOK": "노르웨이 크로네",
      "NPR": "네팔 루피",
      "NZD": "뉴질랜드 달러",
      "OMR": "오만 리얄",
      "PAB": "파나마 발보아",
      "PEI": "페루 인티",
      "PEN": "페루 솔",
      "PES": "페루 솔 (1863–1965)",
      "PGK": "파푸아뉴기니 키나",
      "PHP": "필리핀 페소",
      "PKR": "파키스탄 루피",
      "PLN": "폴란드 즐로티",
      "PLZ": "폴란드 즐로티 (1950–1995)",
      "PTE": "포르투갈 에스쿠도",
      "PYG": "파라과이 과라니",
      "QAR": "카타르 리얄",
      "RHD": "로디지아 달러",
      "ROL": "루마니아 레이",
      "RON": "루마니아 레우",
      "RSD": "세르비아 디나르",
      "RUB": "러시아 루블",
      "RUR": "러시아 루블 (1991–1998)",
      "RWF": "르완다 프랑",
      "SAR": "사우디아라비아 리얄",
      "SBD": "솔로몬 제도 달러",
      "SCR": "세이셸 루피",
      "SDD": "수단 디나르",
      "SDG": "수단 파운드",
      "SDP": "고 수단 파운드",
      "SEK": "스웨덴 크로나",
      "SGD": "싱가폴 달러",
      "SHP": "세인트헬레나 파운드",
      "SIT": "슬로베니아 톨라르",
      "SKK": "슬로바키아 코루나",
      "SLL": "시에라리온 리온",
      "SOS": "소말리아 실링",
      "SRD": "수리남 달러",
      "SRG": "수리남 길더",
      "SSP": "남수단 파운드",
      "STD": "상투메 프린시페 도브라 (1977–2017)",
      "STN": "상투메 프린시페 도브라",
      "SUR": "소련 루블",
      "SVC": "엘살바도르 콜론",
      "SYP": "시리아 파운드",
      "SZL": "스와질란드 릴랑게니",
      "THB": "태국 바트",
      "TJR": "타지키스탄 루블",
      "TJS": "타지키스탄 소모니",
      "TMM": "투르크메니스탄 마나트 (1993–2009)",
      "TMT": "투르크메니스탄 마나트",
      "TND": "튀니지 디나르",
      "TOP": "통가 파앙가",
      "TPE": "티모르 에스쿠도",
      "TRL": "터키 리라",
      "TRY": "신 터키 리라",
      "TTD": "트리니다드 토바고 달러",
      "TWD": "신 타이완 달러",
      "TZS": "탄자니아 실링",
      "UAH": "우크라이나 그리브나",
      "UAK": "우크라이나 카보바네츠",
      "UGS": "우간다 실링 (1966–1987)",
      "UGX": "우간다 실링",
      "USD": "미국 달러",
      "USN": "미국 달러(다음날)",
      "USS": "미국 달러(당일)",
      "UYI": "우루과이 페소 (UI)",
      "UYP": "우루과이 페소 (1975–1993)",
      "UYU": "우루과이 페소 우루과요",
      "UZS": "우즈베키스탄 숨",
      "VEB": "베네주엘라 볼리바르 (1871–2008)",
      "VEF": "베네수엘라 볼리바르 (2008–2018)",
      "VES": "베네수엘라 볼리바르",
      "VND": "베트남 동",
      "VNN": "베트남 동 (1978–1985)",
      "VUV": "바누아투 바투",
      "WST": "서 사모아 탈라",
      "XAF": "중앙아프리카 CFA 프랑",
      "XAG": "은화",
      "XAU": "금",
      "XBA": "유르코 (유럽 회계 단위)",
      "XBB": "유럽 통화 동맹",
      "XBC": "유럽 계산 단위 (XBC)",
      "XBD": "유럽 계산 단위 (XBD)",
      "XCD": "동카리브 달러",
      "XDR": "특별인출권",
      "XEU": "유럽 환율 단위",
      "XFO": "프랑스 프랑 (Gold)",
      "XFU": "프랑스 프랑 (UIC)",
      "XOF": "서아프리카 CFA 프랑",
      "XPD": "팔라듐",
      "XPF": "CFP 프랑",
      "XPT": "백금",
      "XRE": "RINET 기금",
      "XTS": "테스트 통화 코드",
      "XXX": "알 수 없는 통화 단위",
      "YDD": "예멘 디나르",
      "YER": "예멘 리알",
      "YUD": "유고슬라비아 동전 디나르",
      "YUM": "유고슬라비아 노비 디나르",
      "YUN": "유고슬라비아 전환 디나르",
      "ZAL": "남아프리카 랜드 (금융)",
      "ZAR": "남아프리카 랜드",
      "ZMK": "쟘비아 콰쳐 (1968–2012)",
      "ZMW": "잠비아 콰쳐",
      "ZRN": "자이르 신권 자이르",
      "ZRZ": "자이르 자이르",
      "ZWD": "짐바브웨 달러",
      "ZWL": "짐바브웨 달러 (2009)",
      "ZWR": "짐바브웨 달러 (2008)",
    };
  }-*/;
}
