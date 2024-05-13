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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * 브랜드 상세 정보 객체입니다.
 */
@JsonPropertyOrder({
  BrandDetail.JSON_PROPERTY_DESCRIPTION,
  BrandDetail.JSON_PROPERTY_TEL,
  BrandDetail.JSON_PROPERTY_MENUS,
  BrandDetail.JSON_PROPERTY_CATEGORY_ID,
  BrandDetail.JSON_PROPERTY_CATEGORY_NAME,
  BrandDetail.JSON_PROPERTY_SUB_CATEGORY_ID,
  BrandDetail.JSON_PROPERTY_SUB_CATEGORY_NAME,
  BrandDetail.JSON_PROPERTY_CATEGORY_OPT,
  BrandDetail.JSON_PROPERTY_ZIP_CODE,
  BrandDetail.JSON_PROPERTY_ROAD_ADDRESS,
  BrandDetail.JSON_PROPERTY_DETAIL_ADDRESS,
  BrandDetail.JSON_PROPERTY_EMAIL,
  BrandDetail.JSON_PROPERTY_WEB_SITE_URL,
  BrandDetail.JSON_PROPERTY_APPROVAL_REASON,
  BrandDetail.JSON_PROPERTY_BRAND_FEED_URL,
  BrandDetail.JSON_PROPERTY_INIT_TAB,
  BrandDetail.JSON_PROPERTY_INIT_FEED_ITEM,
  BrandDetail.JSON_PROPERTY_INIT_FEED_ITEMS,
  BrandDetail.JSON_PROPERTY_TEMPLATE_COLOR,
  BrandDetail.JSON_PROPERTY_BIZ_INFO_YN,
  BrandDetail.JSON_PROPERTY_BIZ_INFO_TITLE,
  BrandDetail.JSON_PROPERTY_BIZ_INFO_CONTENT,
  BrandDetail.JSON_PROPERTY_BRAND_ID,
  BrandDetail.JSON_PROPERTY_NAME,
  BrandDetail.JSON_PROPERTY_BRAND_KEY,
  BrandDetail.JSON_PROPERTY_REGISTER_DATE,
  BrandDetail.JSON_PROPERTY_APPROVAL_DATE,
  BrandDetail.JSON_PROPERTY_UPDATE_DATE,
  BrandDetail.JSON_PROPERTY_STATUS,
  BrandDetail.JSON_PROPERTY_MEDIA_URL,
  BrandDetail.JSON_PROPERTY_CHATBOT_DATE,
  BrandDetail.JSON_PROPERTY_MESSAGEBASE_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:19:20.016497294Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BrandDetail {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<Object> description = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TEL = "tel";
  private JsonNullable<Object> tel = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MENUS = "menus";
  private JsonNullable<Object> menus = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CATEGORY_ID = "categoryId";
  private JsonNullable<Object> categoryId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CATEGORY_NAME = "categoryName";
  private JsonNullable<Object> categoryName = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SUB_CATEGORY_ID = "subCategoryId";
  private JsonNullable<Object> subCategoryId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_SUB_CATEGORY_NAME = "subCategoryName";
  private JsonNullable<Object> subCategoryName = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CATEGORY_OPT = "categoryOpt";
  private JsonNullable<Object> categoryOpt = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ZIP_CODE = "zipCode";
  private JsonNullable<Object> zipCode = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ROAD_ADDRESS = "roadAddress";
  private JsonNullable<Object> roadAddress = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DETAIL_ADDRESS = "detailAddress";
  private JsonNullable<Object> detailAddress = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_EMAIL = "email";
  private JsonNullable<Object> email = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_WEB_SITE_URL = "webSiteUrl";
  private JsonNullable<Object> webSiteUrl = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_APPROVAL_REASON = "approvalReason";
  private JsonNullable<Object> approvalReason = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_BRAND_FEED_URL = "brandFeedUrl";
  private JsonNullable<Object> brandFeedUrl = JsonNullable.<Object>of(null);

  /**
   * 단말에 표시되는 브랜드 홈의 기본 탭을 지정하는 항목입니다. 미지정 시 기본값은 FEED 입니다. + FEED: 소식탭을 기본 탭으로 지정합니다. + INFO: 정보탭을 기본 탭으로 지정합니다. 브랜드 최초 승인 시에만 선택이 가능하며 승인 이후에는 수정이 불가합니다. 
   */
  public enum InitTabEnum {
    FEED("FEED"),
    
    INFO("INFO");

    private Object value;

    InitTabEnum(Object value) {
      this.value = value;
    }

    @JsonValue
    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InitTabEnum fromValue(Object value) {
      for (InitTabEnum b : InitTabEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_INIT_TAB = "initTab";
  private JsonNullable<InitTabEnum> initTab = JsonNullable.<InitTabEnum>of(FEED);

  /**
   * 하위 호환성을 위해 필드는 유지되지만, 동일한 용도의 initFeedItems 사용을 권고합니다.    + TEL: 소식탭에 전화걸기(&#x3D;퀵버튼 call) 버튼이 표시됩니다.   + HOME: 소식탭에 Web 연결(&#x3D;퀵버튼 web) 버튼이 표시됩니다.   + SEARCH: 소식탭에 포털검색 버튼이 표시되며, 소식탭 전용 퀵버튼입니다.   
   */
  public enum InitFeedItemEnum {
    TEL("TEL"),
    
    HOME("HOME"),
    
    SEARCH("SEARCH");

    private Object value;

    InitFeedItemEnum(Object value) {
      this.value = value;
    }

    @JsonValue
    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InitFeedItemEnum fromValue(Object value) {
      for (InitFeedItemEnum b : InitFeedItemEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_INIT_FEED_ITEM = "initFeedItem";
  private JsonNullable<InitFeedItemEnum> initFeedItem = JsonNullable.<InitFeedItemEnum>of(null);

  public static final String JSON_PROPERTY_INIT_FEED_ITEMS = "initFeedItems";
  private JsonNullable<Object> initFeedItems = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TEMPLATE_COLOR = "templateColor";
  private JsonNullable<Object> templateColor = JsonNullable.<Object>of(null);

  /**
   * 브랜드 소식탭에 운영정보 사용 여부를 설정합니다.   
   */
  public enum BizInfoYnEnum {
    Y("Y"),
    
    N("N");

    private Object value;

    BizInfoYnEnum(Object value) {
      this.value = value;
    }

    @JsonValue
    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BizInfoYnEnum fromValue(Object value) {
      for (BizInfoYnEnum b : BizInfoYnEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_BIZ_INFO_YN = "bizInfoYn";
  private JsonNullable<BizInfoYnEnum> bizInfoYn = JsonNullable.<BizInfoYnEnum>of(N);

  public static final String JSON_PROPERTY_BIZ_INFO_TITLE = "bizInfoTitle";
  private JsonNullable<Object> bizInfoTitle = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_BIZ_INFO_CONTENT = "bizInfoContent";
  private JsonNullable<Object> bizInfoContent = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_BRAND_ID = "brandId";
  private Object brandId = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private Object name = null;

  public static final String JSON_PROPERTY_BRAND_KEY = "brandKey";
  private JsonNullable<Object> brandKey = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_REGISTER_DATE = "registerDate";
  private JsonNullable<Object> registerDate = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_APPROVAL_DATE = "approvalDate";
  private JsonNullable<Object> approvalDate = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_UPDATE_DATE = "updateDate";
  private JsonNullable<Object> updateDate = JsonNullable.<Object>of(null);

  /**
   * 브랜드의 상태 입니다.      + 저장 : RCS Biz Center 홈페이지에서 브랜드 정보를 입력하고 승인요청 하지 않고 저장해 둔 상태입니다. 저장 상태의 브랜드는 승인요청을 해야 승인대기 상태로 변경됩니다.     + 승인대기 : 브랜드 등록 직후 검수 이전 상태입니다.     + 검수시작 : 브랜드 검수가 시작된 상태입니다.     + 승인 : 검수가 완료되어 이통3사에 브랜드 정보 등록까지 최종 완료되어 RCS 메시지를 발송할 수 있는 상태입니다.     + 반려 : 검수 시 승인이 불가하여 반려된 상태입니다. 반려된 브랜드는 수정 후 다시 승인요청 할 수 있습니다.     + 검수완료 : RCS Biz Center에서 검수 승인 하였으나 이통사 3사 등록이 완료되지 않은 상태로 RCS 메시지를 발송할 수 없습니다.     + 승인대기(수정) : 승인된 브랜드 변경 시 검수 대상으로 판단되어 검수 요청된 상태입니다.     + 검수시작(수정) : 승인된 브랜드 변경으로 승인요청된 브랜드 검수가 시작된 상태입니다.     + 반려(수정) : 승인된 브랜드 변경 검수 처리 결과 반려된 상태입니다.     + 검수완료(수정) : 승인된 브랜드 변경 검수 승인은 되었으나 이통3사 정보 등록이 완료되지 않은 상태입니다.       현재 상태에서는 이통사에 따라 단말 브랜드 홈 정보가 다를 수 있습니다.       브랜드 조회 API 호출 시 수정 이전 브랜드 정보가 제공됩니다.   
   */
  public enum StatusEnum {
    _("승인대기"),
    
    _2("검수시작"),
    
    _3("승인"),
    
    _4("반려"),
    
    _5("검수완료"),
    
    _6("저장"),
    
    _7("승인대기(수정)"),
    
    _8("검수시작(수정)"),
    
    _9("반려(수정)"),
    
    _10("검수완료(수정)");

    private Object value;

    StatusEnum(Object value) {
      this.value = value;
    }

    @JsonValue
    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(Object value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private JsonNullable<StatusEnum> status = JsonNullable.<StatusEnum>of(null);

  public static final String JSON_PROPERTY_MEDIA_URL = "mediaUrl";
  private JsonNullable<Object> mediaUrl = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CHATBOT_DATE = "chatbotDate";
  private JsonNullable<Object> chatbotDate = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MESSAGEBASE_DATE = "messagebaseDate";
  private JsonNullable<Object> messagebaseDate = JsonNullable.<Object>of(null);

  public BrandDetail() {
  }

  public BrandDetail description(Object description) {
    this.description = JsonNullable.<Object>of(description);
    
    return this;
  }

   /**
   * 브랜드 설명에 등록된 내용입니다.
   * maximum: 150
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<Object> description) {
    this.description = description;
  }

  public void setDescription(Object description) {
    this.description = JsonNullable.<Object>of(description);
  }


  public BrandDetail tel(Object tel) {
    this.tel = JsonNullable.<Object>of(tel);
    
    return this;
  }

   /**
   * 브랜드홈에 노출될 전화번호(대표발신번호와 별개) 입니다. 
   * maximum: 12
   * @return tel
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getTel() {
        return tel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTel_JsonNullable() {
    return tel;
  }
  
  @JsonProperty(JSON_PROPERTY_TEL)
  public void setTel_JsonNullable(JsonNullable<Object> tel) {
    this.tel = tel;
  }

  public void setTel(Object tel) {
    this.tel = JsonNullable.<Object>of(tel);
  }


  public BrandDetail menus(Object menus) {
    this.menus = JsonNullable.<Object>of(menus);
    
    return this;
  }

   /**
   * 브랜드 홈에는 최대 4개까지 표시됩니다. chat은 기본 등록 되므로 지정할 수 있는 최대 menu는 3개이며, 등록 시 call을 포함하지 않고 2개 이하 지정할 경우 call을 기본 추가합니다.
   * maximum: 3
   * @return menus
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMenus() {
        return menus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MENUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMenus_JsonNullable() {
    return menus;
  }
  
  @JsonProperty(JSON_PROPERTY_MENUS)
  public void setMenus_JsonNullable(JsonNullable<Object> menus) {
    this.menus = menus;
  }

  public void setMenus(Object menus) {
    this.menus = JsonNullable.<Object>of(menus);
  }


  public BrandDetail categoryId(Object categoryId) {
    this.categoryId = JsonNullable.<Object>of(categoryId);
    
    return this;
  }

   /**
   * 브랜드 카테고리 ID 입니다.
   * maximum: 64
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCategoryId() {
        return categoryId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCategoryId_JsonNullable() {
    return categoryId;
  }
  
  @JsonProperty(JSON_PROPERTY_CATEGORY_ID)
  public void setCategoryId_JsonNullable(JsonNullable<Object> categoryId) {
    this.categoryId = categoryId;
  }

  public void setCategoryId(Object categoryId) {
    this.categoryId = JsonNullable.<Object>of(categoryId);
  }


  public BrandDetail categoryName(Object categoryName) {
    this.categoryName = JsonNullable.<Object>of(categoryName);
    
    return this;
  }

   /**
   * 브랜드 카테고리 명 입니다.
   * maximum: 64
   * @return categoryName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCategoryName() {
        return categoryName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CATEGORY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCategoryName_JsonNullable() {
    return categoryName;
  }
  
  @JsonProperty(JSON_PROPERTY_CATEGORY_NAME)
  public void setCategoryName_JsonNullable(JsonNullable<Object> categoryName) {
    this.categoryName = categoryName;
  }

  public void setCategoryName(Object categoryName) {
    this.categoryName = JsonNullable.<Object>of(categoryName);
  }


  public BrandDetail subCategoryId(Object subCategoryId) {
    this.subCategoryId = JsonNullable.<Object>of(subCategoryId);
    
    return this;
  }

   /**
   * 브랜드 하위 카테고리 ID 입니다.
   * maximum: 64
   * @return subCategoryId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSubCategoryId() {
        return subCategoryId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUB_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSubCategoryId_JsonNullable() {
    return subCategoryId;
  }
  
  @JsonProperty(JSON_PROPERTY_SUB_CATEGORY_ID)
  public void setSubCategoryId_JsonNullable(JsonNullable<Object> subCategoryId) {
    this.subCategoryId = subCategoryId;
  }

  public void setSubCategoryId(Object subCategoryId) {
    this.subCategoryId = JsonNullable.<Object>of(subCategoryId);
  }


  public BrandDetail subCategoryName(Object subCategoryName) {
    this.subCategoryName = JsonNullable.<Object>of(subCategoryName);
    
    return this;
  }

   /**
   * 브랜드 하위 카테고리 명 입니다.
   * maximum: 64
   * @return subCategoryName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getSubCategoryName() {
        return subCategoryName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUB_CATEGORY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getSubCategoryName_JsonNullable() {
    return subCategoryName;
  }
  
  @JsonProperty(JSON_PROPERTY_SUB_CATEGORY_NAME)
  public void setSubCategoryName_JsonNullable(JsonNullable<Object> subCategoryName) {
    this.subCategoryName = subCategoryName;
  }

  public void setSubCategoryName(Object subCategoryName) {
    this.subCategoryName = JsonNullable.<Object>of(subCategoryName);
  }


  public BrandDetail categoryOpt(Object categoryOpt) {
    this.categoryOpt = JsonNullable.<Object>of(categoryOpt);
    
    return this;
  }

   /**
   * 검색용 키워드 임의 등록 할 수 있습니다.
   * maximum: 20
   * @return categoryOpt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getCategoryOpt() {
        return categoryOpt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CATEGORY_OPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCategoryOpt_JsonNullable() {
    return categoryOpt;
  }
  
  @JsonProperty(JSON_PROPERTY_CATEGORY_OPT)
  public void setCategoryOpt_JsonNullable(JsonNullable<Object> categoryOpt) {
    this.categoryOpt = categoryOpt;
  }

  public void setCategoryOpt(Object categoryOpt) {
    this.categoryOpt = JsonNullable.<Object>of(categoryOpt);
  }


  public BrandDetail zipCode(Object zipCode) {
    this.zipCode = JsonNullable.<Object>of(zipCode);
    
    return this;
  }

   /**
   * 브랜드 홈에 표시될 우편번호(5자리) 입니다.
   * maximum: 5
   * @return zipCode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getZipCode() {
        return zipCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ZIP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getZipCode_JsonNullable() {
    return zipCode;
  }
  
  @JsonProperty(JSON_PROPERTY_ZIP_CODE)
  public void setZipCode_JsonNullable(JsonNullable<Object> zipCode) {
    this.zipCode = zipCode;
  }

  public void setZipCode(Object zipCode) {
    this.zipCode = JsonNullable.<Object>of(zipCode);
  }


  public BrandDetail roadAddress(Object roadAddress) {
    this.roadAddress = JsonNullable.<Object>of(roadAddress);
    
    return this;
  }

   /**
   * 브랜드 홈에 표시되는 도로명주소 입니다.
   * maximum: 200
   * @return roadAddress
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRoadAddress() {
        return roadAddress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROAD_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRoadAddress_JsonNullable() {
    return roadAddress;
  }
  
  @JsonProperty(JSON_PROPERTY_ROAD_ADDRESS)
  public void setRoadAddress_JsonNullable(JsonNullable<Object> roadAddress) {
    this.roadAddress = roadAddress;
  }

  public void setRoadAddress(Object roadAddress) {
    this.roadAddress = JsonNullable.<Object>of(roadAddress);
  }


  public BrandDetail detailAddress(Object detailAddress) {
    this.detailAddress = JsonNullable.<Object>of(detailAddress);
    
    return this;
  }

   /**
   * 브랜드 홈에 표시되는 상세주소 입니다.
   * maximum: 200
   * @return detailAddress
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDetailAddress() {
        return detailAddress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DETAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDetailAddress_JsonNullable() {
    return detailAddress;
  }
  
  @JsonProperty(JSON_PROPERTY_DETAIL_ADDRESS)
  public void setDetailAddress_JsonNullable(JsonNullable<Object> detailAddress) {
    this.detailAddress = detailAddress;
  }

  public void setDetailAddress(Object detailAddress) {
    this.detailAddress = JsonNullable.<Object>of(detailAddress);
  }


  public BrandDetail email(Object email) {
    this.email = JsonNullable.<Object>of(email);
    
    return this;
  }

   /**
   * 브랜드 홈에 표시되는 이메일주소 입니다.
   * maximum: 30
   * @return email
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getEmail() {
        return email.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getEmail_JsonNullable() {
    return email;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL)
  public void setEmail_JsonNullable(JsonNullable<Object> email) {
    this.email = email;
  }

  public void setEmail(Object email) {
    this.email = JsonNullable.<Object>of(email);
  }


  public BrandDetail webSiteUrl(Object webSiteUrl) {
    this.webSiteUrl = JsonNullable.<Object>of(webSiteUrl);
    
    return this;
  }

   /**
   * 브랜드 홈에 표시되는 홈페이지 주소 입니다.
   * maximum: 128
   * @return webSiteUrl
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getWebSiteUrl() {
        return webSiteUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEB_SITE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getWebSiteUrl_JsonNullable() {
    return webSiteUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_WEB_SITE_URL)
  public void setWebSiteUrl_JsonNullable(JsonNullable<Object> webSiteUrl) {
    this.webSiteUrl = webSiteUrl;
  }

  public void setWebSiteUrl(Object webSiteUrl) {
    this.webSiteUrl = JsonNullable.<Object>of(webSiteUrl);
  }


  public BrandDetail approvalReason(Object approvalReason) {
    this.approvalReason = JsonNullable.<Object>of(approvalReason);
    
    return this;
  }

   /**
   * 검수 시 반려 사유가 제공됩니다.
   * @return approvalReason
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getApprovalReason() {
        return approvalReason.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APPROVAL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getApprovalReason_JsonNullable() {
    return approvalReason;
  }
  
  @JsonProperty(JSON_PROPERTY_APPROVAL_REASON)
  public void setApprovalReason_JsonNullable(JsonNullable<Object> approvalReason) {
    this.approvalReason = approvalReason;
  }

  public void setApprovalReason(Object approvalReason) {
    this.approvalReason = JsonNullable.<Object>of(approvalReason);
  }


  public BrandDetail brandFeedUrl(Object brandFeedUrl) {
    this.brandFeedUrl = JsonNullable.<Object>of(brandFeedUrl);
    
    return this;
  }

   /**
   * 브랜드 소식 URL 입니다. 브랜드 소식을 최초 등록하거나 브랜드 홈 기본 탭을 소식탭(FEED)로 설정하면 자동 생성됩니다. 
   * @return brandFeedUrl
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getBrandFeedUrl() {
        return brandFeedUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BRAND_FEED_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getBrandFeedUrl_JsonNullable() {
    return brandFeedUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_BRAND_FEED_URL)
  public void setBrandFeedUrl_JsonNullable(JsonNullable<Object> brandFeedUrl) {
    this.brandFeedUrl = brandFeedUrl;
  }

  public void setBrandFeedUrl(Object brandFeedUrl) {
    this.brandFeedUrl = JsonNullable.<Object>of(brandFeedUrl);
  }


  public BrandDetail initTab(InitTabEnum initTab) {
    this.initTab = JsonNullable.<InitTabEnum>of(initTab);
    
    return this;
  }

   /**
   * 단말에 표시되는 브랜드 홈의 기본 탭을 지정하는 항목입니다. 미지정 시 기본값은 FEED 입니다. + FEED: 소식탭을 기본 탭으로 지정합니다. + INFO: 정보탭을 기본 탭으로 지정합니다. 브랜드 최초 승인 시에만 선택이 가능하며 승인 이후에는 수정이 불가합니다. 
   * maximum: 5
   * @return initTab
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public InitTabEnum getInitTab() {
        return initTab.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INIT_TAB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<InitTabEnum> getInitTab_JsonNullable() {
    return initTab;
  }
  
  @JsonProperty(JSON_PROPERTY_INIT_TAB)
  public void setInitTab_JsonNullable(JsonNullable<InitTabEnum> initTab) {
    this.initTab = initTab;
  }

  public void setInitTab(InitTabEnum initTab) {
    this.initTab = JsonNullable.<InitTabEnum>of(initTab);
  }


  public BrandDetail initFeedItem(InitFeedItemEnum initFeedItem) {
    this.initFeedItem = JsonNullable.<InitFeedItemEnum>of(initFeedItem);
    
    return this;
  }

   /**
   * 하위 호환성을 위해 필드는 유지되지만, 동일한 용도의 initFeedItems 사용을 권고합니다.    + TEL: 소식탭에 전화걸기(&#x3D;퀵버튼 call) 버튼이 표시됩니다.   + HOME: 소식탭에 Web 연결(&#x3D;퀵버튼 web) 버튼이 표시됩니다.   + SEARCH: 소식탭에 포털검색 버튼이 표시되며, 소식탭 전용 퀵버튼입니다.   
   * maximum: 6
   * @return initFeedItem
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @JsonIgnore

  public InitFeedItemEnum getInitFeedItem() {
        return initFeedItem.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INIT_FEED_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<InitFeedItemEnum> getInitFeedItem_JsonNullable() {
    return initFeedItem;
  }
  
  @JsonProperty(JSON_PROPERTY_INIT_FEED_ITEM)
  public void setInitFeedItem_JsonNullable(JsonNullable<InitFeedItemEnum> initFeedItem) {
    this.initFeedItem = initFeedItem;
  }

  public void setInitFeedItem(InitFeedItemEnum initFeedItem) {
    this.initFeedItem = JsonNullable.<InitFeedItemEnum>of(initFeedItem);
  }


  public BrandDetail initFeedItems(Object initFeedItems) {
    this.initFeedItems = JsonNullable.<Object>of(initFeedItems);
    
    return this;
  }

   /**
   * initTab FEED인 경우, 소식탭에 표시할 메뉴를 지정합니다.   menus에서 설정한 항목 중 소식탭에 표시할 항목을 지정합니다. 즉, menus에 지정되지 않은 항목을 설정하면 error 처리 됩니다.   menus는 최대 3개까지 지정할 수 있으며, menus에 설정한 3개항목과 소식탭에만 표시가능한 portalsearch를 추가로 등록할 경우 최대 4개가 등록됩니다.   
   * @return initFeedItems
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getInitFeedItems() {
        return initFeedItems.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INIT_FEED_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getInitFeedItems_JsonNullable() {
    return initFeedItems;
  }
  
  @JsonProperty(JSON_PROPERTY_INIT_FEED_ITEMS)
  public void setInitFeedItems_JsonNullable(JsonNullable<Object> initFeedItems) {
    this.initFeedItems = initFeedItems;
  }

  public void setInitFeedItems(Object initFeedItems) {
    this.initFeedItems = JsonNullable.<Object>of(initFeedItems);
  }


  public BrandDetail templateColor(Object templateColor) {
    this.templateColor = JsonNullable.<Object>of(templateColor);
    
    return this;
  }

   /**
   * 브랜드 내 등록되는 템플릿의 버튼 컬러 값을 지정합니다.   컬러값은 Hex code 형식만 유효합니다. 
   * maximum: 10
   * @return templateColor
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getTemplateColor() {
        return templateColor.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEMPLATE_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTemplateColor_JsonNullable() {
    return templateColor;
  }
  
  @JsonProperty(JSON_PROPERTY_TEMPLATE_COLOR)
  public void setTemplateColor_JsonNullable(JsonNullable<Object> templateColor) {
    this.templateColor = templateColor;
  }

  public void setTemplateColor(Object templateColor) {
    this.templateColor = JsonNullable.<Object>of(templateColor);
  }


  public BrandDetail bizInfoYn(BizInfoYnEnum bizInfoYn) {
    this.bizInfoYn = JsonNullable.<BizInfoYnEnum>of(bizInfoYn);
    
    return this;
  }

   /**
   * 브랜드 소식탭에 운영정보 사용 여부를 설정합니다.   
   * @return bizInfoYn
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public BizInfoYnEnum getBizInfoYn() {
        return bizInfoYn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BIZ_INFO_YN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BizInfoYnEnum> getBizInfoYn_JsonNullable() {
    return bizInfoYn;
  }
  
  @JsonProperty(JSON_PROPERTY_BIZ_INFO_YN)
  public void setBizInfoYn_JsonNullable(JsonNullable<BizInfoYnEnum> bizInfoYn) {
    this.bizInfoYn = bizInfoYn;
  }

  public void setBizInfoYn(BizInfoYnEnum bizInfoYn) {
    this.bizInfoYn = JsonNullable.<BizInfoYnEnum>of(bizInfoYn);
  }


  public BrandDetail bizInfoTitle(Object bizInfoTitle) {
    this.bizInfoTitle = JsonNullable.<Object>of(bizInfoTitle);
    
    return this;
  }

   /**
   * bizInfoYn &#x3D; &#39;Y&#39;인 경우, 운영정보 제목을 지정합니다.   
   * maximum: 20
   * @return bizInfoTitle
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getBizInfoTitle() {
        return bizInfoTitle.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BIZ_INFO_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getBizInfoTitle_JsonNullable() {
    return bizInfoTitle;
  }
  
  @JsonProperty(JSON_PROPERTY_BIZ_INFO_TITLE)
  public void setBizInfoTitle_JsonNullable(JsonNullable<Object> bizInfoTitle) {
    this.bizInfoTitle = bizInfoTitle;
  }

  public void setBizInfoTitle(Object bizInfoTitle) {
    this.bizInfoTitle = JsonNullable.<Object>of(bizInfoTitle);
  }


  public BrandDetail bizInfoContent(Object bizInfoContent) {
    this.bizInfoContent = JsonNullable.<Object>of(bizInfoContent);
    
    return this;
  }

   /**
   * bizInfoYn &#x3D; &#39;Y&#39;인 경우, 운영정보 내용을 지정합니다. 
   * maximum: 200
   * @return bizInfoContent
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getBizInfoContent() {
        return bizInfoContent.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BIZ_INFO_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getBizInfoContent_JsonNullable() {
    return bizInfoContent;
  }
  
  @JsonProperty(JSON_PROPERTY_BIZ_INFO_CONTENT)
  public void setBizInfoContent_JsonNullable(JsonNullable<Object> bizInfoContent) {
    this.bizInfoContent = bizInfoContent;
  }

  public void setBizInfoContent(Object bizInfoContent) {
    this.bizInfoContent = JsonNullable.<Object>of(bizInfoContent);
  }


  public BrandDetail brandId(Object brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * 브랜드ID - 브랜드 등록 시 자동 생성됩니다.
   * maximum: 13
   * @return brandId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRAND_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getBrandId() {
    return brandId;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBrandId(Object brandId) {
    this.brandId = brandId;
  }


  public BrandDetail name(Object name) {
    
    this.name = name;
    return this;
  }

   /**
   * 브랜드 이름 - 브랜드 등록 시 지정합니다.
   * maximum: 20
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(Object name) {
    this.name = name;
  }


  public BrandDetail brandKey(Object brandKey) {
    this.brandKey = JsonNullable.<Object>of(brandKey);
    
    return this;
  }

   /**
   * 브랜드 Key - 브랜드 등록 시 자동 생성됩니다.
   * maximum: 18
   * @return brandKey
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getBrandKey() {
        return brandKey.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BRAND_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getBrandKey_JsonNullable() {
    return brandKey;
  }
  
  @JsonProperty(JSON_PROPERTY_BRAND_KEY)
  public void setBrandKey_JsonNullable(JsonNullable<Object> brandKey) {
    this.brandKey = brandKey;
  }

  public void setBrandKey(Object brandKey) {
    this.brandKey = JsonNullable.<Object>of(brandKey);
  }


  public BrandDetail registerDate(Object registerDate) {
    this.registerDate = JsonNullable.<Object>of(registerDate);
    
    return this;
  }

   /**
   * 등록일시 - 브랜드 등록 일시입니다.
   * @return registerDate
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRegisterDate() {
        return registerDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REGISTER_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRegisterDate_JsonNullable() {
    return registerDate;
  }
  
  @JsonProperty(JSON_PROPERTY_REGISTER_DATE)
  public void setRegisterDate_JsonNullable(JsonNullable<Object> registerDate) {
    this.registerDate = registerDate;
  }

  public void setRegisterDate(Object registerDate) {
    this.registerDate = JsonNullable.<Object>of(registerDate);
  }


  public BrandDetail approvalDate(Object approvalDate) {
    this.approvalDate = JsonNullable.<Object>of(approvalDate);
    
    return this;
  }

   /**
   * 승인일시 - 브랜드가 검수에서 승인된 일시입니다.
   * @return approvalDate
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getApprovalDate() {
        return approvalDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APPROVAL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getApprovalDate_JsonNullable() {
    return approvalDate;
  }
  
  @JsonProperty(JSON_PROPERTY_APPROVAL_DATE)
  public void setApprovalDate_JsonNullable(JsonNullable<Object> approvalDate) {
    this.approvalDate = approvalDate;
  }

  public void setApprovalDate(Object approvalDate) {
    this.approvalDate = JsonNullable.<Object>of(approvalDate);
  }


  public BrandDetail updateDate(Object updateDate) {
    this.updateDate = JsonNullable.<Object>of(updateDate);
    
    return this;
  }

   /**
   * 수정일시 - 브랜드의 정보가 수정된 일시입니다.
   * @return updateDate
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getUpdateDate() {
        return updateDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UPDATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getUpdateDate_JsonNullable() {
    return updateDate;
  }
  
  @JsonProperty(JSON_PROPERTY_UPDATE_DATE)
  public void setUpdateDate_JsonNullable(JsonNullable<Object> updateDate) {
    this.updateDate = updateDate;
  }

  public void setUpdateDate(Object updateDate) {
    this.updateDate = JsonNullable.<Object>of(updateDate);
  }


  public BrandDetail status(StatusEnum status) {
    this.status = JsonNullable.<StatusEnum>of(status);
    
    return this;
  }

   /**
   * 브랜드의 상태 입니다.      + 저장 : RCS Biz Center 홈페이지에서 브랜드 정보를 입력하고 승인요청 하지 않고 저장해 둔 상태입니다. 저장 상태의 브랜드는 승인요청을 해야 승인대기 상태로 변경됩니다.     + 승인대기 : 브랜드 등록 직후 검수 이전 상태입니다.     + 검수시작 : 브랜드 검수가 시작된 상태입니다.     + 승인 : 검수가 완료되어 이통3사에 브랜드 정보 등록까지 최종 완료되어 RCS 메시지를 발송할 수 있는 상태입니다.     + 반려 : 검수 시 승인이 불가하여 반려된 상태입니다. 반려된 브랜드는 수정 후 다시 승인요청 할 수 있습니다.     + 검수완료 : RCS Biz Center에서 검수 승인 하였으나 이통사 3사 등록이 완료되지 않은 상태로 RCS 메시지를 발송할 수 없습니다.     + 승인대기(수정) : 승인된 브랜드 변경 시 검수 대상으로 판단되어 검수 요청된 상태입니다.     + 검수시작(수정) : 승인된 브랜드 변경으로 승인요청된 브랜드 검수가 시작된 상태입니다.     + 반려(수정) : 승인된 브랜드 변경 검수 처리 결과 반려된 상태입니다.     + 검수완료(수정) : 승인된 브랜드 변경 검수 승인은 되었으나 이통3사 정보 등록이 완료되지 않은 상태입니다.       현재 상태에서는 이통사에 따라 단말 브랜드 홈 정보가 다를 수 있습니다.       브랜드 조회 API 호출 시 수정 이전 브랜드 정보가 제공됩니다.   
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public StatusEnum getStatus() {
        return status.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<StatusEnum> getStatus_JsonNullable() {
    return status;
  }
  
  @JsonProperty(JSON_PROPERTY_STATUS)
  public void setStatus_JsonNullable(JsonNullable<StatusEnum> status) {
    this.status = status;
  }

  public void setStatus(StatusEnum status) {
    this.status = JsonNullable.<StatusEnum>of(status);
  }


  public BrandDetail mediaUrl(Object mediaUrl) {
    this.mediaUrl = JsonNullable.<Object>of(mediaUrl);
    
    return this;
  }

   /**
   * 이미지 파일ID와 URL 및 사용 유형 정보를 제공합니다. 
   * @return mediaUrl
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMediaUrl() {
        return mediaUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEDIA_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMediaUrl_JsonNullable() {
    return mediaUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_MEDIA_URL)
  public void setMediaUrl_JsonNullable(JsonNullable<Object> mediaUrl) {
    this.mediaUrl = mediaUrl;
  }

  public void setMediaUrl(Object mediaUrl) {
    this.mediaUrl = JsonNullable.<Object>of(mediaUrl);
  }


  public BrandDetail chatbotDate(Object chatbotDate) {
    this.chatbotDate = JsonNullable.<Object>of(chatbotDate);
    
    return this;
  }

   /**
   * 브랜드 내 등록된 대화방 중 가장 최근에 변경된 대화방의 일시 정보 입니다. 
   * @return chatbotDate
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getChatbotDate() {
        return chatbotDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CHATBOT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getChatbotDate_JsonNullable() {
    return chatbotDate;
  }
  
  @JsonProperty(JSON_PROPERTY_CHATBOT_DATE)
  public void setChatbotDate_JsonNullable(JsonNullable<Object> chatbotDate) {
    this.chatbotDate = chatbotDate;
  }

  public void setChatbotDate(Object chatbotDate) {
    this.chatbotDate = JsonNullable.<Object>of(chatbotDate);
  }


  public BrandDetail messagebaseDate(Object messagebaseDate) {
    this.messagebaseDate = JsonNullable.<Object>of(messagebaseDate);
    
    return this;
  }

   /**
   * 브랜드 내 등록된 템플릿 중 가장 최근에 변경된 템플릿의 일시 정보 입니다. 
   * @return messagebaseDate
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMessagebaseDate() {
        return messagebaseDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MESSAGEBASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMessagebaseDate_JsonNullable() {
    return messagebaseDate;
  }
  
  @JsonProperty(JSON_PROPERTY_MESSAGEBASE_DATE)
  public void setMessagebaseDate_JsonNullable(JsonNullable<Object> messagebaseDate) {
    this.messagebaseDate = messagebaseDate;
  }

  public void setMessagebaseDate(Object messagebaseDate) {
    this.messagebaseDate = JsonNullable.<Object>of(messagebaseDate);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandDetail brandDetail = (BrandDetail) o;
    return equalsNullable(this.description, brandDetail.description) &&
        equalsNullable(this.tel, brandDetail.tel) &&
        equalsNullable(this.menus, brandDetail.menus) &&
        equalsNullable(this.categoryId, brandDetail.categoryId) &&
        equalsNullable(this.categoryName, brandDetail.categoryName) &&
        equalsNullable(this.subCategoryId, brandDetail.subCategoryId) &&
        equalsNullable(this.subCategoryName, brandDetail.subCategoryName) &&
        equalsNullable(this.categoryOpt, brandDetail.categoryOpt) &&
        equalsNullable(this.zipCode, brandDetail.zipCode) &&
        equalsNullable(this.roadAddress, brandDetail.roadAddress) &&
        equalsNullable(this.detailAddress, brandDetail.detailAddress) &&
        equalsNullable(this.email, brandDetail.email) &&
        equalsNullable(this.webSiteUrl, brandDetail.webSiteUrl) &&
        equalsNullable(this.approvalReason, brandDetail.approvalReason) &&
        equalsNullable(this.brandFeedUrl, brandDetail.brandFeedUrl) &&
        equalsNullable(this.initTab, brandDetail.initTab) &&
        equalsNullable(this.initFeedItem, brandDetail.initFeedItem) &&
        equalsNullable(this.initFeedItems, brandDetail.initFeedItems) &&
        equalsNullable(this.templateColor, brandDetail.templateColor) &&
        equalsNullable(this.bizInfoYn, brandDetail.bizInfoYn) &&
        equalsNullable(this.bizInfoTitle, brandDetail.bizInfoTitle) &&
        equalsNullable(this.bizInfoContent, brandDetail.bizInfoContent) &&
        Objects.equals(this.brandId, brandDetail.brandId) &&
        Objects.equals(this.name, brandDetail.name) &&
        equalsNullable(this.brandKey, brandDetail.brandKey) &&
        equalsNullable(this.registerDate, brandDetail.registerDate) &&
        equalsNullable(this.approvalDate, brandDetail.approvalDate) &&
        equalsNullable(this.updateDate, brandDetail.updateDate) &&
        equalsNullable(this.status, brandDetail.status) &&
        equalsNullable(this.mediaUrl, brandDetail.mediaUrl) &&
        equalsNullable(this.chatbotDate, brandDetail.chatbotDate) &&
        equalsNullable(this.messagebaseDate, brandDetail.messagebaseDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(description), hashCodeNullable(tel), hashCodeNullable(menus), hashCodeNullable(categoryId), hashCodeNullable(categoryName), hashCodeNullable(subCategoryId), hashCodeNullable(subCategoryName), hashCodeNullable(categoryOpt), hashCodeNullable(zipCode), hashCodeNullable(roadAddress), hashCodeNullable(detailAddress), hashCodeNullable(email), hashCodeNullable(webSiteUrl), hashCodeNullable(approvalReason), hashCodeNullable(brandFeedUrl), hashCodeNullable(initTab), hashCodeNullable(initFeedItem), hashCodeNullable(initFeedItems), hashCodeNullable(templateColor), hashCodeNullable(bizInfoYn), hashCodeNullable(bizInfoTitle), hashCodeNullable(bizInfoContent), brandId, name, hashCodeNullable(brandKey), hashCodeNullable(registerDate), hashCodeNullable(approvalDate), hashCodeNullable(updateDate), hashCodeNullable(status), hashCodeNullable(mediaUrl), hashCodeNullable(chatbotDate), hashCodeNullable(messagebaseDate));
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
    sb.append("class BrandDetail {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tel: ").append(toIndentedString(tel)).append("\n");
    sb.append("    menus: ").append(toIndentedString(menus)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    subCategoryId: ").append(toIndentedString(subCategoryId)).append("\n");
    sb.append("    subCategoryName: ").append(toIndentedString(subCategoryName)).append("\n");
    sb.append("    categoryOpt: ").append(toIndentedString(categoryOpt)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    roadAddress: ").append(toIndentedString(roadAddress)).append("\n");
    sb.append("    detailAddress: ").append(toIndentedString(detailAddress)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    webSiteUrl: ").append(toIndentedString(webSiteUrl)).append("\n");
    sb.append("    approvalReason: ").append(toIndentedString(approvalReason)).append("\n");
    sb.append("    brandFeedUrl: ").append(toIndentedString(brandFeedUrl)).append("\n");
    sb.append("    initTab: ").append(toIndentedString(initTab)).append("\n");
    sb.append("    initFeedItem: ").append(toIndentedString(initFeedItem)).append("\n");
    sb.append("    initFeedItems: ").append(toIndentedString(initFeedItems)).append("\n");
    sb.append("    templateColor: ").append(toIndentedString(templateColor)).append("\n");
    sb.append("    bizInfoYn: ").append(toIndentedString(bizInfoYn)).append("\n");
    sb.append("    bizInfoTitle: ").append(toIndentedString(bizInfoTitle)).append("\n");
    sb.append("    bizInfoContent: ").append(toIndentedString(bizInfoContent)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    brandKey: ").append(toIndentedString(brandKey)).append("\n");
    sb.append("    registerDate: ").append(toIndentedString(registerDate)).append("\n");
    sb.append("    approvalDate: ").append(toIndentedString(approvalDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    chatbotDate: ").append(toIndentedString(chatbotDate)).append("\n");
    sb.append("    messagebaseDate: ").append(toIndentedString(messagebaseDate)).append("\n");
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

