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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.MenuItemInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RegBrandInfoRegBrand
 */
@JsonPropertyOrder({
  RegBrandInfoRegBrand.JSON_PROPERTY_NAME,
  RegBrandInfoRegBrand.JSON_PROPERTY_DESCRIPTION,
  RegBrandInfoRegBrand.JSON_PROPERTY_TEL,
  RegBrandInfoRegBrand.JSON_PROPERTY_MENUS,
  RegBrandInfoRegBrand.JSON_PROPERTY_CATEGORY_ID,
  RegBrandInfoRegBrand.JSON_PROPERTY_SUB_CATEGORY_ID,
  RegBrandInfoRegBrand.JSON_PROPERTY_CATEGORY_OPT,
  RegBrandInfoRegBrand.JSON_PROPERTY_ZIP_CODE,
  RegBrandInfoRegBrand.JSON_PROPERTY_ROAD_ADDRESS,
  RegBrandInfoRegBrand.JSON_PROPERTY_DETAIL_ADDRESS,
  RegBrandInfoRegBrand.JSON_PROPERTY_EMAIL,
  RegBrandInfoRegBrand.JSON_PROPERTY_WEB_SITE_URL,
  RegBrandInfoRegBrand.JSON_PROPERTY_INIT_TAB,
  RegBrandInfoRegBrand.JSON_PROPERTY_INIT_FEED_ITEM,
  RegBrandInfoRegBrand.JSON_PROPERTY_INIT_FEED_ITEMS,
  RegBrandInfoRegBrand.JSON_PROPERTY_TEMPLATE_COLOR,
  RegBrandInfoRegBrand.JSON_PROPERTY_BIZ_INFO_YN,
  RegBrandInfoRegBrand.JSON_PROPERTY_BIZ_INFO_TITLE,
  RegBrandInfoRegBrand.JSON_PROPERTY_BIZ_INFO_CONTENT
})
@JsonTypeName("RegBrandInfo_regBrand")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:19:20.016497294Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RegBrandInfoRegBrand {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TEL = "tel";
  private String tel;

  public static final String JSON_PROPERTY_MENUS = "menus";
  private List<MenuItemInfo> menus;

  public static final String JSON_PROPERTY_CATEGORY_ID = "categoryId";
  private String categoryId;

  public static final String JSON_PROPERTY_SUB_CATEGORY_ID = "subCategoryId";
  private String subCategoryId;

  public static final String JSON_PROPERTY_CATEGORY_OPT = "categoryOpt";
  private String categoryOpt;

  public static final String JSON_PROPERTY_ZIP_CODE = "zipCode";
  private String zipCode;

  public static final String JSON_PROPERTY_ROAD_ADDRESS = "roadAddress";
  private String roadAddress;

  public static final String JSON_PROPERTY_DETAIL_ADDRESS = "detailAddress";
  private String detailAddress;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_WEB_SITE_URL = "webSiteUrl";
  private String webSiteUrl;

  /**
   * 단말에 표시되는 브랜드 홈의 기본 탭을 지정하는 항목입니다.   미지정 시 기본값은 FEED 입니다.   + FEED: 소식탭을 기본 탭으로 지정합니다.   + INFO: 정보탭을 기본 탭으로 지정합니다.   
   */
  public enum InitTabEnum {
    FEED("FEED"),
    
    INFO("INFO");

    private String value;

    InitTabEnum(String value) {
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
    public static InitTabEnum fromValue(String value) {
      for (InitTabEnum b : InitTabEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INIT_TAB = "initTab";
  private InitTabEnum initTab = InitTabEnum.FEED;

  /**
   * 하위 호환성을 위해 필드는 유지되지만, 동일한 용도의 initFeedItems 사용을 권고합니다.    + TEL: 소식탭에 전화걸기(&#x3D; 퀵버튼 call) 버튼이 표시됩니다.   + HOME: 소식탭에 Web 연결(&#x3D; 퀵버튼 web) 버튼이 표시됩니다.   + SEARCH: 소식탭에 포털검색(&#x3D; portalsearch) 버튼이 표시되며, 소식탭 전용 퀵버튼입니다.   
   */
  public enum InitFeedItemEnum {
    TEL("TEL"),
    
    HOME("HOME"),
    
    SEARCH("SEARCH");

    private String value;

    InitFeedItemEnum(String value) {
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
    public static InitFeedItemEnum fromValue(String value) {
      for (InitFeedItemEnum b : InitFeedItemEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INIT_FEED_ITEM = "initFeedItem";
  private InitFeedItemEnum initFeedItem;

  /**
   * Gets or Sets initFeedItems
   */
  public enum InitFeedItemsEnum {
    CALL("call"),
    
    WEB("web"),
    
    STORE("store"),
    
    ORDER("order"),
    
    BUY("buy"),
    
    TICKETS("tickets"),
    
    MOREINFO("moreinfo"),
    
    PORTALSEARCH("portalsearch");

    private String value;

    InitFeedItemsEnum(String value) {
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
    public static InitFeedItemsEnum fromValue(String value) {
      for (InitFeedItemsEnum b : InitFeedItemsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INIT_FEED_ITEMS = "initFeedItems";
  private List<InitFeedItemsEnum> initFeedItems;

  public static final String JSON_PROPERTY_TEMPLATE_COLOR = "templateColor";
  private String templateColor;

  /**
   * 브랜드 소식탭에 운영정보 사용 여부를 설정합니다.   
   */
  public enum BizInfoYnEnum {
    Y("Y"),
    
    N("N");

    private String value;

    BizInfoYnEnum(String value) {
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
    public static BizInfoYnEnum fromValue(String value) {
      for (BizInfoYnEnum b : BizInfoYnEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BIZ_INFO_YN = "bizInfoYn";
  private BizInfoYnEnum bizInfoYn = BizInfoYnEnum.N;

  public static final String JSON_PROPERTY_BIZ_INFO_TITLE = "bizInfoTitle";
  private String bizInfoTitle;

  public static final String JSON_PROPERTY_BIZ_INFO_CONTENT = "bizInfoContent";
  private String bizInfoContent;

  public RegBrandInfoRegBrand() {
  }

  public RegBrandInfoRegBrand name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 브랜드 홈에 표시되는 브랜드 이름 입니다니다.
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public RegBrandInfoRegBrand description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 브랜드 홈에 표시되는 브랜드 설명 입니다.
   * @return description
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public RegBrandInfoRegBrand tel(String tel) {
    
    this.tel = tel;
    return this;
  }

   /**
   * 브랜드 홈에 노출될 전화번호(대표발신번호와 별개) 입니다. 
   * @return tel
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTel() {
    return tel;
  }


  @JsonProperty(JSON_PROPERTY_TEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTel(String tel) {
    this.tel = tel;
  }


  public RegBrandInfoRegBrand menus(List<MenuItemInfo> menus) {
    
    this.menus = menus;
    return this;
  }

  public RegBrandInfoRegBrand addMenusItem(MenuItemInfo menusItem) {
    if (this.menus == null) {
      this.menus = new ArrayList<>();
    }
    this.menus.add(menusItem);
    return this;
  }

   /**
   * 브랜드 홈에는 최대 4개까지 표시됩니다.   chat은 기본 등록 되므로 지정할 수 있는 최대 menu는 3개이며, 등록 시 call을 포함하지 않고 2개 이하 지정할 경우 call을 기본 추가합니다.      + **2020년 12월 3일 기준 브랜드 menus 중 app 은 이통사 정책에 의거 한시적으로 등록이 불가하며 app 등록 시 error 리턴됩니다.** 
   * @return menus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MENUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MenuItemInfo> getMenus() {
    return menus;
  }


  @JsonProperty(JSON_PROPERTY_MENUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMenus(List<MenuItemInfo> menus) {
    this.menus = menus;
  }


  public RegBrandInfoRegBrand categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * 브랜드 카테고리 ID 입니다.
   * @return categoryId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCategoryId() {
    return categoryId;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public RegBrandInfoRegBrand subCategoryId(String subCategoryId) {
    
    this.subCategoryId = subCategoryId;
    return this;
  }

   /**
   * 브랜드 하위 카테고리 ID 입니다.
   * @return subCategoryId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUB_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubCategoryId() {
    return subCategoryId;
  }


  @JsonProperty(JSON_PROPERTY_SUB_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubCategoryId(String subCategoryId) {
    this.subCategoryId = subCategoryId;
  }


  public RegBrandInfoRegBrand categoryOpt(String categoryOpt) {
    
    this.categoryOpt = categoryOpt;
    return this;
  }

   /**
   * 검색용 키워드 임의 등록 할 수 있습니다.
   * @return categoryOpt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY_OPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCategoryOpt() {
    return categoryOpt;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_OPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryOpt(String categoryOpt) {
    this.categoryOpt = categoryOpt;
  }


  public RegBrandInfoRegBrand zipCode(String zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * 브랜드 홈에 표시될 우편번호(5자리) 입니다.
   * @return zipCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ZIP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZipCode() {
    return zipCode;
  }


  @JsonProperty(JSON_PROPERTY_ZIP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public RegBrandInfoRegBrand roadAddress(String roadAddress) {
    
    this.roadAddress = roadAddress;
    return this;
  }

   /**
   * 브랜드 홈에 표시되는 도로명주소 입니다.
   * @return roadAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROAD_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRoadAddress() {
    return roadAddress;
  }


  @JsonProperty(JSON_PROPERTY_ROAD_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoadAddress(String roadAddress) {
    this.roadAddress = roadAddress;
  }


  public RegBrandInfoRegBrand detailAddress(String detailAddress) {
    
    this.detailAddress = detailAddress;
    return this;
  }

   /**
   * 브랜드 홈에 표시되는 상세주소 입니다.
   * @return detailAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDetailAddress() {
    return detailAddress;
  }


  @JsonProperty(JSON_PROPERTY_DETAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
  }


  public RegBrandInfoRegBrand email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 브랜드 홈에 표시되는 이메일주소 입니다.
   * @return email
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public RegBrandInfoRegBrand webSiteUrl(String webSiteUrl) {
    
    this.webSiteUrl = webSiteUrl;
    return this;
  }

   /**
   * 브랜드 홈에 표시되는 홈페이지 주소 입니다.
   * @return webSiteUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEB_SITE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebSiteUrl() {
    return webSiteUrl;
  }


  @JsonProperty(JSON_PROPERTY_WEB_SITE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebSiteUrl(String webSiteUrl) {
    this.webSiteUrl = webSiteUrl;
  }


  public RegBrandInfoRegBrand initTab(InitTabEnum initTab) {
    
    this.initTab = initTab;
    return this;
  }

   /**
   * 단말에 표시되는 브랜드 홈의 기본 탭을 지정하는 항목입니다.   미지정 시 기본값은 FEED 입니다.   + FEED: 소식탭을 기본 탭으로 지정합니다.   + INFO: 정보탭을 기본 탭으로 지정합니다.   
   * @return initTab
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INIT_TAB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InitTabEnum getInitTab() {
    return initTab;
  }


  @JsonProperty(JSON_PROPERTY_INIT_TAB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitTab(InitTabEnum initTab) {
    this.initTab = initTab;
  }


  public RegBrandInfoRegBrand initFeedItem(InitFeedItemEnum initFeedItem) {
    
    this.initFeedItem = initFeedItem;
    return this;
  }

   /**
   * 하위 호환성을 위해 필드는 유지되지만, 동일한 용도의 initFeedItems 사용을 권고합니다.    + TEL: 소식탭에 전화걸기(&#x3D; 퀵버튼 call) 버튼이 표시됩니다.   + HOME: 소식탭에 Web 연결(&#x3D; 퀵버튼 web) 버튼이 표시됩니다.   + SEARCH: 소식탭에 포털검색(&#x3D; portalsearch) 버튼이 표시되며, 소식탭 전용 퀵버튼입니다.   
   * @return initFeedItem
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INIT_FEED_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InitFeedItemEnum getInitFeedItem() {
    return initFeedItem;
  }


  @JsonProperty(JSON_PROPERTY_INIT_FEED_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitFeedItem(InitFeedItemEnum initFeedItem) {
    this.initFeedItem = initFeedItem;
  }


  public RegBrandInfoRegBrand initFeedItems(List<InitFeedItemsEnum> initFeedItems) {
    
    this.initFeedItems = initFeedItems;
    return this;
  }

  public RegBrandInfoRegBrand addInitFeedItemsItem(InitFeedItemsEnum initFeedItemsItem) {
    if (this.initFeedItems == null) {
      this.initFeedItems = new ArrayList<>();
    }
    this.initFeedItems.add(initFeedItemsItem);
    return this;
  }

   /**
   * initTab FEED인 경우, 소식탭에 표시할 메뉴를 지정합니다.   menus에서 설정한 항목 중 소식탭에 표시할 항목을 지정합니다. 즉, menus에 지정되지 않은 항목을 설정하면 error 처리 됩니다.   menus는 최대 3개까지 지정할 수 있으며, menus에 설정한 3개항목과 소식탭에만 표시가능한 portalsearch를 추가로 등록할 경우 최대 4개가 등록됩니다.   
   * @return initFeedItems
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INIT_FEED_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InitFeedItemsEnum> getInitFeedItems() {
    return initFeedItems;
  }


  @JsonProperty(JSON_PROPERTY_INIT_FEED_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitFeedItems(List<InitFeedItemsEnum> initFeedItems) {
    this.initFeedItems = initFeedItems;
  }


  public RegBrandInfoRegBrand templateColor(String templateColor) {
    
    this.templateColor = templateColor;
    return this;
  }

   /**
   * 브랜드 내 등록되는 템플릿의 버튼 컬러 값을 지정합니다.   컬러값은 Hex code 형식만 유효합니다. 
   * @return templateColor
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTemplateColor() {
    return templateColor;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateColor(String templateColor) {
    this.templateColor = templateColor;
  }


  public RegBrandInfoRegBrand bizInfoYn(BizInfoYnEnum bizInfoYn) {
    
    this.bizInfoYn = bizInfoYn;
    return this;
  }

   /**
   * 브랜드 소식탭에 운영정보 사용 여부를 설정합니다.   
   * @return bizInfoYn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIZ_INFO_YN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BizInfoYnEnum getBizInfoYn() {
    return bizInfoYn;
  }


  @JsonProperty(JSON_PROPERTY_BIZ_INFO_YN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBizInfoYn(BizInfoYnEnum bizInfoYn) {
    this.bizInfoYn = bizInfoYn;
  }


  public RegBrandInfoRegBrand bizInfoTitle(String bizInfoTitle) {
    
    this.bizInfoTitle = bizInfoTitle;
    return this;
  }

   /**
   * bizInfoYn &#x3D; &#39;Y&#39;인 경우, 운영정보 제목을 지정합니다.   
   * @return bizInfoTitle
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIZ_INFO_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBizInfoTitle() {
    return bizInfoTitle;
  }


  @JsonProperty(JSON_PROPERTY_BIZ_INFO_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBizInfoTitle(String bizInfoTitle) {
    this.bizInfoTitle = bizInfoTitle;
  }


  public RegBrandInfoRegBrand bizInfoContent(String bizInfoContent) {
    
    this.bizInfoContent = bizInfoContent;
    return this;
  }

   /**
   * bizInfoYn &#x3D; &#39;Y&#39;인 경우, 운영정보 내용을 지정합니다. 
   * @return bizInfoContent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIZ_INFO_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBizInfoContent() {
    return bizInfoContent;
  }


  @JsonProperty(JSON_PROPERTY_BIZ_INFO_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBizInfoContent(String bizInfoContent) {
    this.bizInfoContent = bizInfoContent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegBrandInfoRegBrand regBrandInfoRegBrand = (RegBrandInfoRegBrand) o;
    return Objects.equals(this.name, regBrandInfoRegBrand.name) &&
        Objects.equals(this.description, regBrandInfoRegBrand.description) &&
        Objects.equals(this.tel, regBrandInfoRegBrand.tel) &&
        Objects.equals(this.menus, regBrandInfoRegBrand.menus) &&
        Objects.equals(this.categoryId, regBrandInfoRegBrand.categoryId) &&
        Objects.equals(this.subCategoryId, regBrandInfoRegBrand.subCategoryId) &&
        Objects.equals(this.categoryOpt, regBrandInfoRegBrand.categoryOpt) &&
        Objects.equals(this.zipCode, regBrandInfoRegBrand.zipCode) &&
        Objects.equals(this.roadAddress, regBrandInfoRegBrand.roadAddress) &&
        Objects.equals(this.detailAddress, regBrandInfoRegBrand.detailAddress) &&
        Objects.equals(this.email, regBrandInfoRegBrand.email) &&
        Objects.equals(this.webSiteUrl, regBrandInfoRegBrand.webSiteUrl) &&
        Objects.equals(this.initTab, regBrandInfoRegBrand.initTab) &&
        Objects.equals(this.initFeedItem, regBrandInfoRegBrand.initFeedItem) &&
        Objects.equals(this.initFeedItems, regBrandInfoRegBrand.initFeedItems) &&
        Objects.equals(this.templateColor, regBrandInfoRegBrand.templateColor) &&
        Objects.equals(this.bizInfoYn, regBrandInfoRegBrand.bizInfoYn) &&
        Objects.equals(this.bizInfoTitle, regBrandInfoRegBrand.bizInfoTitle) &&
        Objects.equals(this.bizInfoContent, regBrandInfoRegBrand.bizInfoContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, tel, menus, categoryId, subCategoryId, categoryOpt, zipCode, roadAddress, detailAddress, email, webSiteUrl, initTab, initFeedItem, initFeedItems, templateColor, bizInfoYn, bizInfoTitle, bizInfoContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegBrandInfoRegBrand {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tel: ").append(toIndentedString(tel)).append("\n");
    sb.append("    menus: ").append(toIndentedString(menus)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    subCategoryId: ").append(toIndentedString(subCategoryId)).append("\n");
    sb.append("    categoryOpt: ").append(toIndentedString(categoryOpt)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    roadAddress: ").append(toIndentedString(roadAddress)).append("\n");
    sb.append("    detailAddress: ").append(toIndentedString(detailAddress)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    webSiteUrl: ").append(toIndentedString(webSiteUrl)).append("\n");
    sb.append("    initTab: ").append(toIndentedString(initTab)).append("\n");
    sb.append("    initFeedItem: ").append(toIndentedString(initFeedItem)).append("\n");
    sb.append("    initFeedItems: ").append(toIndentedString(initFeedItems)).append("\n");
    sb.append("    templateColor: ").append(toIndentedString(templateColor)).append("\n");
    sb.append("    bizInfoYn: ").append(toIndentedString(bizInfoYn)).append("\n");
    sb.append("    bizInfoTitle: ").append(toIndentedString(bizInfoTitle)).append("\n");
    sb.append("    bizInfoContent: ").append(toIndentedString(bizInfoContent)).append("\n");
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

