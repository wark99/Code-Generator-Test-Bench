/*
 * RCS Biz Center API 규격
 * # **RCS Biz Center API Version 1.1.12**   본 문서는 기업과 대행사에 제공되는 RCS Biz Center Open API의 규격을 기술합니다.  Open API의 사용을 위해서는 사전에 RCS Biz Center에 기업/대행사 등록이 필요합니다.  추가적인 보안을 위해 API를 연동하는 Client의 IP 를 RCS Biz Center에 사전 등록하여야 합니다.  RCS Biz Center 홈페이지 \\\"내 계정관리\\\"에서 등록하실 수 있습니다.  Open API를 연동하고자 하는 경우 사전 개발 단계에서는 검수(STG) 환경에 별도 가입 및 승인 후 이용할 수 있습니다.   검수(STG) 환경에서 개발이 완료된 이후 상용(PRD) 연동을 하는 것을 권고합니다.        1. 검수(STG) - https://api-qa.rcsbizcenter.com/api/1.1 2. 상용(PRD) - https://api.rcsbizcenter.com/api/1.1    RCS Biz Center Open API는 이통 3사가 정의한 정책에 의거하여 정보를 제공합니다. 따라서 일부 정보 제공상의 제약이 있을 수 있습니다.    **Open API 문의처 : tech@rcsbizcenter.com**  `참고문서`     + **[버튼 Action 목록 Link (2023.12.14)](https://file.rcsbizcenter.com/231214143124234/TS-231214143124234-fVDQnA_1.xlsx)**   + **[RCS A2P(단방향) 포맷 리스트 (24.02.07 공유버전)](https://file-qa.rcsbizcenter.com/240319170900114/TS-240319170900114-segSiw_1.xlsx)**      + **[RCS 양방향 포맷 리스트 (22.10.28 공유 버전)](https://file-qa.rcsbizcenter.com/221027084901492/TS-221027084901492-mIfP_1.xlsx)**     `수정 이력`   **1.1.12 주요 변경사항**    + RBC 기본 아이콘 및 브랜드 로고 신규 API 추가 [신규로고 API](#/logo)   - 브랜드 로고는 승인 후 사용 가능   - GET /logo/common : RBC 제공 기본 아이콘 조회   - GET /brand/{brandId}/logo : 브랜드 로고 조회   - POST /brand/{brandId}/logo : 브랜드 로고 등록   - GET /brand/{brandId}/logo/{fileId} : 브랜드 로고 단건 조회   - PUT /brand/{brandId}/logo/{fileId} : 브랜드 로고 수정   - DELETE /brand/{brandId}/logo/{fileId} : 브랜드 로고 단건 삭제   - PUT /brand/{brandId}/logo/{fileId}/cancel : 브랜드 로고 승인요청 취소 + 템플릿 또는 메시지 발송 시, 변수 mTitleMedia, itemMedia 에 사용할 이미지는 브랜드 로고(logo) 등록 후 발급된 fileId를 지정해야 합니다.   + 브랜드 로고 추가에 따른 Webhook Noti 추가   - notiType logo 추가 [스키마](#/NotiLogo)         **1.1.11 주요 변경사항**    + 고객반응 메시지/대화방메뉴 통계 제공 필드 추가   - GET /statQuery/message/{brandId} 응답 결과 내 messagebaseId 필드 추가 > 관련 스키마 [MessageStatData](#/MessageStatData)   - GET /statQuery/messageButton/{brandId} 응답 결과 내 reactionType, cardNum, buttonNum 필드 추가 > 관련 스키마 [MessageButtonStatData](#/MessageButtonStatData)   - GET /statQuery/persistentMenu/{brandId} 응답 결과 내 자동응답메시지인 경우, messagebaseId, reactionType, cardNum, buttonNum 필드 추가 > 관련 스키마 [PersistentMenuStatData.menuList.subList](#/MenuStatData)   - 동영상 스트리밍 actionType 구분 iframeplayB 추가       **1.1.10 주요 변경사항**    + 계정, 권한 구분 용어 변경   - 기업관리자 : 마스터   - 기업담당자 : 매니저   - 브랜드 관리자 : 대표운영자   - 브랜드 부관리자 : 운영자   - 브랜드 대행사 : 운영자 + 브랜드 생성 권한 확대 : 마스터, 매니저 계정 + 브랜드 수정 권한 확대 : 브랜드 대표운영자(마스터), 브랜드 운영자(마스터, 매니저, 대행사) + 브랜드 영업정보, 브랜드 컬러 등 추가 설정 사항   + 대화방 안심마크 표시 여부 설정 + 양방향 대화방 전환, 양방향 대행사 설정 없는 botId 대화방 등록 + 양방향 대행사 설정 없는 대화방메뉴 등록/수정 + 텍스트 템플릿 타이틀 선택형의 아이콘 이미지 변경     - 아이콘 이미지 변경으로 formattedString 상의 fileId 변경   + 자동응답메시지 간 연결(버튼, 칩리스트) + 자동응답메시지, 대화방메뉴 브랜드 소식 연결 + 대행사 대상 레이아웃 기능 + 신규 템플릿 상품 지원(규격 변경 사항 없음) + 신규 또는 기능 추가/변경된 API   - POST /corp/brand   - PUT /corp/brand/{brandId}   - PUT /corp/{personId}/brand/{brandId}   - GET /corp/{personId}/brand/{brandId}   - DELETE /corp/{personId}/brand/{brandId}   - DELETE /corp/{personId}/brand/{brandId}/privilege     - POST /brand/{brandId}/chatbot    - GET /brand/{brandId}/chatbot   - PUT /brand/{brandId}/chatbot/{chatbotId}   - GET /brand/{brandId}/chatbot/{chatbotId}   - GET /brand/{brandId}/bidirectional/chatbot    - POST /brand/{brandId}/bidirectional/chatbot    - PUT /brand/{brandId}/bidirectional/chatbot/{chatbotId}    - GET /brand/{brandId}/bidirectional/chatbot/{chatbotId}   - DELETE /brand/{brandId}/bidirectional/chatbot/{chatbotId}     - POST /brand/{brandId}/autoreplymsg           - PUT /brand/{brandId}/autoreplymsg/{autoReplyMsgId}           - POST /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu   - PUT /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu   - (신규) PUT /corp/brand/{brandId}/cancel   - (신규) PUT /corp/{personId}/brand/{brandId}/cancel   - (신규) PUT /agency/{agencyId}/brand/{brandId}   - (신규) GET /messagebase/messagebaseform/{messagebaseformId}/logo   - (신규) GET /baselayout/component           - (신규) GET /baselayout/sample           - (신규) GET /baselayout/sample/{sampleLayoutId}           - (신규) GET /baselayout/product/rule           - (신규) GET /brand/{brandId}/layout           - (신규) POST /brand/{brandId}/layout       - (신규) GET /brand/{brandId}/layout/{layoutId}           - (신규) PUT /brand/{brandId}/layout/{layoutId}           - (신규) DELETE /brand/{brandId}/layout/{layoutId}     **1.1.9 추가 변경사항(2023.03.16 변경 사항)** + 대화방 승인 취소 API 추가   - PUT /brand/{brandId}/chatbot/{chatbotId}/cancel + 대화방명 변경 시 운영자 검수 승인 필요   - POST /brand/{brandId}/bidirectional/chatbot/{chatbotId} 발신번호 양방향 대화방 전환 시 대화방명 수정된 경우   - POST /brand/{brandId}/bidirectional/chatbot/{chatbotId} 대화방ID  양방향 대화방의 대화방명   - PUT /brand/{brandId}/chatbot/{chatbotId} 발신번호 대화방명 수정 시   - PUT /brand/{brandId}/bidirectional/chatbot/{chatbotId} 양방향 대화방 대화방명 수정 시 + 브랜드 채널 노출/검색 허용에 따른 대화방(chatbot) API display value 허용값 변경   - '11' : 브랜드채널 노출,브랜드검색 허용,브랜드홈 전시   - '10' : 브랜드채널 노출,브랜드검색 허용,브랜드홈 비전시   - '01' : 브랜드채널 노출,브랜드검색 불허,브랜드홈 전시   - '00' : 브랜드채널 노출,브랜드검색 불허,브랜드홈 비전시   **1.1.9 추가 변경사항** + 메시지 보안성 강화 agencyKey API 추가   - GET /agency/{agencyId}/agencyKey   - RBC 홈페이지에서 agencyKey 재발급시 Webhook noti 전송(notiType agencyKey) + 양방향 대화방 ID 정책변경에 따라 service 구분이 'CHAT'인 대화방ID(chatbotId)의 포맷 규칙이 변경   - POST /brand/{brandId}/bidirectional/chatbot   - GET /usableQuery/chatbotId/{chatbotId} + 브랜드 등록 시 브랜드 홈 기본 탭 선택 항목 추가   - POST /corp/brand   - properties 추가: initTab, initFeedItem    - 추가 항목은 별도 지정하지 않더라도 기본값으로 처리됨  **1.1.8 추가 변경사항(2022.12.08 상용 배포)** + 대화방ID 등록 가능여부 조회 API 추가   - GET /usableQuery/chatbotId/{chatbotId}   - 대화방ID 등록 전 등록 가능여부 조회     **1.1.8 변경사항** + 이미지 템플릿 추가에 따른 신규 템플릿 등록 API 추가   - 이미지 템플릿 및 모든 템플릿 등록 시 사용 가능 ( api/1.1 지원, api/1.0 미지원 )   - 이미지 템플릿용 파일 등록 POST /brand/{brandId}/v2/messagebase/file   - 이미지 템플릿용 파일 상세 조회 GET /brand/{brandId}/v2/messagebase/file/{fileId}   - 템플릿 등록(v2) POST /brand/{brandId}/v2/messagebase   - 템플릿 수정(v2) POST /brand/{brandId}/v2/messagebase/{messagebaseId} + 타이틀 자유형(구 테마 강조형A) Description 우측 타이틀 허용   - 타이틀 자유형의 타이틀 영역 중 우측 타이틀 영역에 Cell 템플릿과 마찬가지로 본문과 버튼에 설정한 변수부 중 1개를 설정할 수 있도록 변경  **1.1.7 변경사항** + 타이틀 자유형(구 테마 강조형A) 템플릿 messagebaseform 조회 지원   - 타이틀 자유형(구 테마 강조형A) Description, Cell + 타이틀 자유형(구 테마 강조형A) 템플릿 messagebase 조회/등록/수정/삭제 지원   - 타이틀 자유형(구 테마 강조형A) 등록 JSON 예시 추가(POST /brand/{brandId}/messagebase)   - 타이틀 자유형(구 테마 강조형A) 조회 시 버튼 정보 표시 방식 변경(신규 openrichcard 규격) + 대행사용 API 추가   - RBC 등록된 사업자 확인 GET /agency/{agencyId}/corp/{corpRegNum}   - RBC 에 등록된 발신번호 확인 GET /agency/{agencyId}/corp/{corpRegNum}/chatbot/{chatbotId} + 고객반응통계 조회 API 수정   - 대화방 메뉴 자동응답메시지 설정 정책 변경에 따른 Data Object 구조 변경   - 대상 API GET /statQuery/persistentMenu/{brandId} + 양방향 대화방 메뉴 설정 정책 변경 반영   - 하위 메뉴 자동응답메시지 설정 허용   - 액션 버튼 설정 dialerAction 만 가능(지정 불가 액션 버튼 - urlAction, mapAction, calendarAction, clipboardAction, composeAction, localBrowserAction)  **1.1.6 변경사항** + 고객반응통계 조회 API 추가   - 캠페인 발송/읽음확인 통계 GET /statQuery/message/{brandId}   - 캠페인 메시지 버튼 클릭 통계 GET /statQuery/messageButton/{brandId}   - 대화방 메뉴 클릭 통계 GET /statQuery/persistentMenu/{brandId} + 신규 공통템플릿 정보 추가   - 규격 상의 변경점은 없으며 추가된 공통템플릿 정보 데이터 제공되도록 변경함   - GET /messagebase/common   - GET /messagebase/common/{messagebaseId}  **1.1.5 변경사항** + [주의] 신규 추가된 API는 /api/1.1 만 지원됨 + Brand 정보 내 브랜드 소식 URL 정보 추가    - botFeedUrl (브랜드 소식 등록 시 자동 추가) + 양방향 대화방 API 추가   - POST, GET /brand/{brandId}/bidirectional/chatbot   - PUT, DELETE, GET /brand/{brandId}/bidirectional/chatbot/{chatbotId}   - POST, PUT, DELETE /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu   - POST, GET /brand/{brandId}/autoreplymsg   - PUT, DELETE, GET /brand/{brandId}/autoreplymsg/{autoReplyMsgId}   - POST /brand/{brandId}/autoreplymsg/file   - GET /brand/{brandId}/autoreplymsg/file/{fileId} + 양방향 대화방 중계사 연동 Webhook 추가   - POST /{webhookUrl}/bidirectional   - PUT /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu/pause + 대행사 Noti webhook NotiType 추가   - 자동응답메시지(notiType: autoreplymsg)   **1.1.4 추가 변경사항** + 템플릿 승인 후 수정 허용   - 기승인 템플릿의 내용 수정 허용(수정 시 재승인 필요)   - 수정 허용에 따른 approvalResult 제공 값 변경 + 템플릿 승인요청 취소 API 추가   - PUT /brand/{brandId}/messagebase/{messagebaseId}/cancel   - approvalResult가 승인대기, 승인대기(수정) 인 경우만 취소 가능 + 템플릿 승인상태 구분 추가 : 검수시작, 검수시작(수정), 승인대기(수정), 반려(수정), 검수완료(수정)  + 대화방 승인상태 구분 추가 : 검수시작  + 브랜드 승인상태 구분 추가 : 검수시작, 검수시작(수정)  + 스타일(Cell) 템플릿 formattedString 구성 시 textStyle 허용값 중 italic 제외(예, bold|italic 설정 시 bold 로 처리됨)  **1.1.3 추가 변경사항** + 브랜드 상세조회 제공 항목 추가(2021/02/25)   - fileName - 업로드 된 파일의 이름   - approvalReason - 검수 시 반려 사유 + 브랜드 상세조회/수정/삭제 API 추가   - PUT /corp/brand/{brand}   - GET /corp/{personId}/brand/{brandId}   - PUT /corp/{personId}/brand/{brandId}   - DELETE /corp/{personId}/brand/{brandId}   - POST /corp/{personId}/brand/{brandId}/privilege   - PUT /corp/{personId}/brand/{brandId}/privilege   - GET /corp/{personId}/brand/{brandId}/privilege   - DELETE /corp/{personId}/brand/{brandId}/privilege/{id} + 기업/대행사/규격서 버전별 API 분류(TAG)  + 템플릿 API 등 설명 내용 보완 + **2020년 12월 3일 기준 브랜드 등록 항목 menus 중 app 은 이통사 정책에 의거 한시적으로 등록이 불가하며 app 등록 시 error 리턴됩니다.** + 브랜드 상태 구분 추가 : 승인대기(수정), 반려(수정), 검수완료(수정)  **1.1.2 변경사항** + 브랜드 등록 API 추가   - 기업관리자 계정으로만 등록 가능   - 브랜드 등록 시 입력되는 카테고리1, 2 정보 조회 API 추가    - GET /corp/brand/categories   - POST /corp/brand  **1.1.1 변경사항** + GuideInfo 내 리치카드용 세부 정보 추가   - GET /messagebase/common/{messagebaseId} 조회 상세 정보 중 guideInfo.detailInfo 추가   - 리치카드를 이용하여 발송된 RCS 메시지가 단말에서 표시될 경우 잘림 없이 표시 가능한 조건 정보 제공을 위하여 추가  **1.1.0 변경사항** + API 1.0, 1.1 버전 병행 지원 - 이후 일부 개선 사항은 API 1.0에 제공이 불가 할 수 있으므로 1.1 버전 사용 권장 + ContractInfo.regDate, ContractInfo.modDate Key Name 변경 \\ -> ContractInfo.registerDate, ContractInfo.updateDate + 각 API별 Response Body의 result key의 type을 array로 통일하였으며 변경된 API는 다음과 같음   - GET /agency/{agencyId}/brand/{brandId}   - GET /messagebase/common   - GET /messagebase/common/{messagebaseId}   - GET /messagebase/messagebaseform/{messagebaseformId}   - POST /brand/{brandId}/messagebase   - GET /brand/{brandId}/messagebase   - GET /brand/{brandId}/messagebase/{messagebaseId}   - PUT /brand/{brandId}/messagebase/{messagebaseId}   - DELETE /brand/{brandId}/messagebase/{messagebaseId}   - POST /brand/{brandId}/chatbot   - GET /brand/{brandId}/chatbot   - GET /brand/{brandId}/chatbot/{chatbotId}   - PUT /brand/{brandId}/chatbot/{chatbotId}   - DELETE /brand/{brandId}/chatbot/{chatbotId}  **2020.07.07 수정사항** + BrandInfo 내 제공 정보 추가   - brandKey : API를 이용하여 브랜드Key 확인 가능   - chatbotDate : 브랜드 하위 대화방 데이터 최종 변경 일시 정보   - messagebaseDate : 브랜드 하위 템플릿 최종 변경 일시 정보 + Get List API Pagination 기능 추가   - Query 파라미터를 이용하여 전체를 페이징하여 조회하도록 제공   - offset : 조회 기준 ROW (default = 0)   - limit : offset 으로부터 조회되는 건수 제한(default = 100, max = 1000)   - Response body 내 pagination, links 제공 + messagebaseform 조회시 bizCondition 정보가 코드로 표시되는 문제 수정  **2020.05.19 수정사항** + 대행사-브랜드 계약 정보인 ContractInfo 내에 key 추가   - GET /agency/{agencyId}/contract    - GET /agency/{agencyId}/corp/{corpRegNum}/brand   - 추가 Key : brandDate, chatbotDate, messagebaseDate   - 브랜드, 해당 브랜드 하위 대화방/템플릿 데이터의 최종 변경 일시 정보를 제공하여   상세 조회 이전에 변경사항 여부를 판단할 수 있도록 개선    **2020.03.12 수정사항** + date-time 예시 추가  **2020.02.19 수정사항** + ParamInfo 내 isMandatory 추가  **2020.02.11 수정사항** + GET /brand/{brandId}/chatbot Chatbots 를 chatbots로 수정  **2020.02.07 수정사항** + Widget, WidgetPolicy 설명 추가 + API 문의처 정보 추가 + POST /brand/{brandId}/chatbot 시 rcsReply 필수 입력 추가(2/13 상용 적용)  **2020.01.06 수정사항** + API 서버 구분 추가  **2019.12.17 수정사항** + X-RCS-Brandkey의 format 변경 (uuid -> random key)  **2019.11.25 수정사항** + 템플릿, 발신번호(대화방) UPDATE, DELETE Method 처리가능 상태 설명 추가 + 전체 200 OK 응답 형식 수정 + chatbot UPDATE시 profileImage 삭제 + chatbot UPDATE시 통신서비스이용증명원 업로드 추가  **2019.11.19 수정사항** + messagebaseform의 bizService 오타 수정 + BrandInfo.mediaUrl 추가 + ChabotDetail.mediaUrl 추가  **2019.11.05 수정사항** + RegChatbotInfo.smsMo 삭제 + ChatbotDetail 수정   - smsMo 삭제, rcsReply 추가   - rcsReply default 1(RCS Postback 수신)  **2019.10.29 수정사항** + {webhookUrl} NotiTemplate.brandId 추가 + chatbot Attributes 설명 수정  **2019.10.23 수정사항** + {webhookUrl} 설명 내용 수정   - Brand Key 제공 내용 삭제   - nType을 notiType으로 명칭 변경 + webhook notification에 대한 대행사 return code 추가 + messagebase, messagebaseform 의 formattedString type   string에서 object로 변경 + messagebaseform의 bizCondition type을 string 에서 array로 변경 + messagebaseform 상세 조회시 양식 유형 이미지 링크 제공   - MessagebaseFormInfo.mediaUrl 추가    **2019.10.02 RCS Biz Center API 1.0.1 배포** 
 *
 * The version of the OpenAPI document: 1.1.12-oas3.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.client.model.ViewsClick;
import org.openapitools.client.model.Visibility;
import org.openapitools.client.model.WidgetPolicy;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * View
 */
@JsonPropertyOrder({
  View.JSON_PROPERTY_WEIGHT,
  View.JSON_PROPERTY_VISIBILITY,
  View.JSON_PROPERTY_BACKGROUND,
  View.JSON_PROPERTY_CORNER_RADIUS,
  View.JSON_PROPERTY_PADDING,
  View.JSON_PROPERTY_PADDING_TOP,
  View.JSON_PROPERTY_PADDING_LEFT,
  View.JSON_PROPERTY_PADDING_RIGHT,
  View.JSON_PROPERTY_PADDING_BOTTOM,
  View.JSON_PROPERTY_MARGIN,
  View.JSON_PROPERTY_MARGIN_TOP,
  View.JSON_PROPERTY_MARGIN_BOTTOM,
  View.JSON_PROPERTY_MARGIN_LEFT,
  View.JSON_PROPERTY_MARGIN_RIGHT,
  View.JSON_PROPERTY_CLICK,
  View.JSON_PROPERTY_WIDGET,
  View.JSON_PROPERTY_WIDTH,
  View.JSON_PROPERTY_HEIGHT,
  View.JSON_PROPERTY_WIDGET_POLICY
})
@JsonTypeName("view")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:19:20.016497294Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class View {
  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private JsonNullable<Object> weight = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_VISIBILITY = "visibility";
  private Visibility visibility;

  public static final String JSON_PROPERTY_BACKGROUND = "background";
  private String background;

  public static final String JSON_PROPERTY_CORNER_RADIUS = "corner_radius";
  private String cornerRadius;

  public static final String JSON_PROPERTY_PADDING = "padding";
  private String padding;

  public static final String JSON_PROPERTY_PADDING_TOP = "paddingTop";
  private String paddingTop;

  public static final String JSON_PROPERTY_PADDING_LEFT = "paddingLeft";
  private String paddingLeft;

  public static final String JSON_PROPERTY_PADDING_RIGHT = "paddingRight";
  private String paddingRight;

  public static final String JSON_PROPERTY_PADDING_BOTTOM = "paddingBottom";
  private String paddingBottom;

  public static final String JSON_PROPERTY_MARGIN = "margin";
  private String margin;

  public static final String JSON_PROPERTY_MARGIN_TOP = "marginTop";
  private String marginTop;

  public static final String JSON_PROPERTY_MARGIN_BOTTOM = "marginBottom";
  private String marginBottom;

  public static final String JSON_PROPERTY_MARGIN_LEFT = "marginLeft";
  private String marginLeft;

  public static final String JSON_PROPERTY_MARGIN_RIGHT = "marginRight";
  private String marginRight;

  public static final String JSON_PROPERTY_CLICK = "click";
  private ViewsClick click;

  /**
   * Gets or Sets widget
   */
  public enum WidgetEnum {
    VIEW("View");

    private String value;

    WidgetEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WidgetEnum fromValue(String value) {
      for (WidgetEnum b : WidgetEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_WIDGET = "widget";
  private WidgetEnum widget;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private String width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private String height;

  public static final String JSON_PROPERTY_WIDGET_POLICY = "widgetPolicy";
  private WidgetPolicy widgetPolicy;

  public View() {
  }

  public View weight(Object weight) {
    this.weight = JsonNullable.<Object>of(weight);
    
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getWeight() {
        return weight.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getWeight_JsonNullable() {
    return weight;
  }
  
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  public void setWeight_JsonNullable(JsonNullable<Object> weight) {
    this.weight = weight;
  }

  public void setWeight(Object weight) {
    this.weight = JsonNullable.<Object>of(weight);
  }


  public View visibility(Visibility visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Visibility getVisibility() {
    return visibility;
  }


  @JsonProperty(JSON_PROPERTY_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibility(Visibility visibility) {
    this.visibility = visibility;
  }


  public View background(String background) {
    
    this.background = background;
    return this;
  }

   /**
   * Get background
   * @return background
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACKGROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBackground() {
    return background;
  }


  @JsonProperty(JSON_PROPERTY_BACKGROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackground(String background) {
    this.background = background;
  }


  public View cornerRadius(String cornerRadius) {
    
    this.cornerRadius = cornerRadius;
    return this;
  }

   /**
   * Get cornerRadius
   * @return cornerRadius
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CORNER_RADIUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCornerRadius() {
    return cornerRadius;
  }


  @JsonProperty(JSON_PROPERTY_CORNER_RADIUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCornerRadius(String cornerRadius) {
    this.cornerRadius = cornerRadius;
  }


  public View padding(String padding) {
    
    this.padding = padding;
    return this;
  }

   /**
   * Get padding
   * @return padding
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PADDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPadding() {
    return padding;
  }


  @JsonProperty(JSON_PROPERTY_PADDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPadding(String padding) {
    this.padding = padding;
  }


  public View paddingTop(String paddingTop) {
    
    this.paddingTop = paddingTop;
    return this;
  }

   /**
   * Get paddingTop
   * @return paddingTop
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PADDING_TOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaddingTop() {
    return paddingTop;
  }


  @JsonProperty(JSON_PROPERTY_PADDING_TOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaddingTop(String paddingTop) {
    this.paddingTop = paddingTop;
  }


  public View paddingLeft(String paddingLeft) {
    
    this.paddingLeft = paddingLeft;
    return this;
  }

   /**
   * Get paddingLeft
   * @return paddingLeft
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PADDING_LEFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaddingLeft() {
    return paddingLeft;
  }


  @JsonProperty(JSON_PROPERTY_PADDING_LEFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaddingLeft(String paddingLeft) {
    this.paddingLeft = paddingLeft;
  }


  public View paddingRight(String paddingRight) {
    
    this.paddingRight = paddingRight;
    return this;
  }

   /**
   * Get paddingRight
   * @return paddingRight
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PADDING_RIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaddingRight() {
    return paddingRight;
  }


  @JsonProperty(JSON_PROPERTY_PADDING_RIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaddingRight(String paddingRight) {
    this.paddingRight = paddingRight;
  }


  public View paddingBottom(String paddingBottom) {
    
    this.paddingBottom = paddingBottom;
    return this;
  }

   /**
   * Get paddingBottom
   * @return paddingBottom
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PADDING_BOTTOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaddingBottom() {
    return paddingBottom;
  }


  @JsonProperty(JSON_PROPERTY_PADDING_BOTTOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaddingBottom(String paddingBottom) {
    this.paddingBottom = paddingBottom;
  }


  public View margin(String margin) {
    
    this.margin = margin;
    return this;
  }

   /**
   * Get margin
   * @return margin
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMargin() {
    return margin;
  }


  @JsonProperty(JSON_PROPERTY_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMargin(String margin) {
    this.margin = margin;
  }


  public View marginTop(String marginTop) {
    
    this.marginTop = marginTop;
    return this;
  }

   /**
   * Get marginTop
   * @return marginTop
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARGIN_TOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMarginTop() {
    return marginTop;
  }


  @JsonProperty(JSON_PROPERTY_MARGIN_TOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarginTop(String marginTop) {
    this.marginTop = marginTop;
  }


  public View marginBottom(String marginBottom) {
    
    this.marginBottom = marginBottom;
    return this;
  }

   /**
   * Get marginBottom
   * @return marginBottom
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARGIN_BOTTOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMarginBottom() {
    return marginBottom;
  }


  @JsonProperty(JSON_PROPERTY_MARGIN_BOTTOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarginBottom(String marginBottom) {
    this.marginBottom = marginBottom;
  }


  public View marginLeft(String marginLeft) {
    
    this.marginLeft = marginLeft;
    return this;
  }

   /**
   * Get marginLeft
   * @return marginLeft
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARGIN_LEFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMarginLeft() {
    return marginLeft;
  }


  @JsonProperty(JSON_PROPERTY_MARGIN_LEFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarginLeft(String marginLeft) {
    this.marginLeft = marginLeft;
  }


  public View marginRight(String marginRight) {
    
    this.marginRight = marginRight;
    return this;
  }

   /**
   * Get marginRight
   * @return marginRight
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARGIN_RIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMarginRight() {
    return marginRight;
  }


  @JsonProperty(JSON_PROPERTY_MARGIN_RIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarginRight(String marginRight) {
    this.marginRight = marginRight;
  }


  public View click(ViewsClick click) {
    
    this.click = click;
    return this;
  }

   /**
   * Get click
   * @return click
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ViewsClick getClick() {
    return click;
  }


  @JsonProperty(JSON_PROPERTY_CLICK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClick(ViewsClick click) {
    this.click = click;
  }


  public View widget(WidgetEnum widget) {
    
    this.widget = widget;
    return this;
  }

   /**
   * Get widget
   * @return widget
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WIDGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WidgetEnum getWidget() {
    return widget;
  }


  @JsonProperty(JSON_PROPERTY_WIDGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWidget(WidgetEnum widget) {
    this.widget = widget;
  }


  public View width(String width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWidth(String width) {
    this.width = width;
  }


  public View height(String height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHeight(String height) {
    this.height = height;
  }


  public View widgetPolicy(WidgetPolicy widgetPolicy) {
    
    this.widgetPolicy = widgetPolicy;
    return this;
  }

   /**
   * Get widgetPolicy
   * @return widgetPolicy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDGET_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetPolicy getWidgetPolicy() {
    return widgetPolicy;
  }


  @JsonProperty(JSON_PROPERTY_WIDGET_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidgetPolicy(WidgetPolicy widgetPolicy) {
    this.widgetPolicy = widgetPolicy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    View view = (View) o;
    return equalsNullable(this.weight, view.weight) &&
        Objects.equals(this.visibility, view.visibility) &&
        Objects.equals(this.background, view.background) &&
        Objects.equals(this.cornerRadius, view.cornerRadius) &&
        Objects.equals(this.padding, view.padding) &&
        Objects.equals(this.paddingTop, view.paddingTop) &&
        Objects.equals(this.paddingLeft, view.paddingLeft) &&
        Objects.equals(this.paddingRight, view.paddingRight) &&
        Objects.equals(this.paddingBottom, view.paddingBottom) &&
        Objects.equals(this.margin, view.margin) &&
        Objects.equals(this.marginTop, view.marginTop) &&
        Objects.equals(this.marginBottom, view.marginBottom) &&
        Objects.equals(this.marginLeft, view.marginLeft) &&
        Objects.equals(this.marginRight, view.marginRight) &&
        Objects.equals(this.click, view.click) &&
        Objects.equals(this.widget, view.widget) &&
        Objects.equals(this.width, view.width) &&
        Objects.equals(this.height, view.height) &&
        Objects.equals(this.widgetPolicy, view.widgetPolicy);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(weight), visibility, background, cornerRadius, padding, paddingTop, paddingLeft, paddingRight, paddingBottom, margin, marginTop, marginBottom, marginLeft, marginRight, click, widget, width, height, widgetPolicy);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class View {\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    background: ").append(toIndentedString(background)).append("\n");
    sb.append("    cornerRadius: ").append(toIndentedString(cornerRadius)).append("\n");
    sb.append("    padding: ").append(toIndentedString(padding)).append("\n");
    sb.append("    paddingTop: ").append(toIndentedString(paddingTop)).append("\n");
    sb.append("    paddingLeft: ").append(toIndentedString(paddingLeft)).append("\n");
    sb.append("    paddingRight: ").append(toIndentedString(paddingRight)).append("\n");
    sb.append("    paddingBottom: ").append(toIndentedString(paddingBottom)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    marginTop: ").append(toIndentedString(marginTop)).append("\n");
    sb.append("    marginBottom: ").append(toIndentedString(marginBottom)).append("\n");
    sb.append("    marginLeft: ").append(toIndentedString(marginLeft)).append("\n");
    sb.append("    marginRight: ").append(toIndentedString(marginRight)).append("\n");
    sb.append("    click: ").append(toIndentedString(click)).append("\n");
    sb.append("    widget: ").append(toIndentedString(widget)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    widgetPolicy: ").append(toIndentedString(widgetPolicy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

