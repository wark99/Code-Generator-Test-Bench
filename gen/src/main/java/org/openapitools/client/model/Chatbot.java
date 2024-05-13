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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * 대화방(발신번호) 기본 정보입니다. 
 */
@JsonPropertyOrder({
  Chatbot.JSON_PROPERTY_GROUP_ID,
  Chatbot.JSON_PROPERTY_CHATBOT_ID,
  Chatbot.JSON_PROPERTY_BRAND_ID,
  Chatbot.JSON_PROPERTY_SUB_NUM,
  Chatbot.JSON_PROPERTY_IS_MAIN_NUM,
  Chatbot.JSON_PROPERTY_SUB_TITLE,
  Chatbot.JSON_PROPERTY_SERVICE,
  Chatbot.JSON_PROPERTY_DISPLAY,
  Chatbot.JSON_PROPERTY_INPUT_FIELD,
  Chatbot.JSON_PROPERTY_SUB_DESCR,
  Chatbot.JSON_PROPERTY_BOT_AGENCY_ID,
  Chatbot.JSON_PROPERTY_SAFTY_STATUS_YN,
  Chatbot.JSON_PROPERTY_PS_MENU_USE,
  Chatbot.JSON_PROPERTY_APPROVAL_RESULT,
  Chatbot.JSON_PROPERTY_REGISTER_DATE,
  Chatbot.JSON_PROPERTY_APPROVAL_DATE,
  Chatbot.JSON_PROPERTY_UPDATE_DATE,
  Chatbot.JSON_PROPERTY_REGISTER_ID,
  Chatbot.JSON_PROPERTY_UPDATE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:19:20.016497294Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Chatbot {
  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  private String groupId;

  public static final String JSON_PROPERTY_CHATBOT_ID = "chatbotId";
  private String chatbotId;

  public static final String JSON_PROPERTY_BRAND_ID = "brandId";
  private String brandId;

  public static final String JSON_PROPERTY_SUB_NUM = "subNum";
  private String subNum;

  public static final String JSON_PROPERTY_IS_MAIN_NUM = "isMainNum";
  private Boolean isMainNum;

  public static final String JSON_PROPERTY_SUB_TITLE = "subTitle";
  private String subTitle;

  /**
   * 대화방 유형입니다.      + a2p : 발신번호를 이용한 대화방   + chat : 양방향ID를 이용한 대화방 
   */
  public enum ServiceEnum {
    A2P("a2p"),
    
    CHAT("chat");

    private String value;

    ServiceEnum(String value) {
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
    public static ServiceEnum fromValue(String value) {
      for (ServiceEnum b : ServiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SERVICE = "service";
  private ServiceEnum service = ServiceEnum.A2P;

  /**
   * 단말에서 대화방의 검색 및 RCS대화방 노출 여부를 설정합니다.   브랜드홈 전시로 설정되면 대화방은 RCS메시지 수신이 가능하게 되며, 반대로 브랜드홈 비전시 설정 시에는 RCS메시지 수신이 불가능합니다.      + &#39;11&#39; : 브랜드채널 노출 및 브랜드검색 허용 &amp; 브랜드홈 전시     + &#39;10&#39; : 브랜드채널 노출 및 브랜드검색 허용 &amp; 브랜드홈 비전시     + &#39;01&#39; : 브랜드채널 노출 및 브랜드검색 불허 &amp; 브랜드홈 전시     + &#39;00&#39; : 브랜드채널 노출 및 브랜드검색 불허 &amp; 브랜드홈 비전시   
   */
  public enum DisplayEnum {
    _11("11"),
    
    _10("10"),
    
    _01("01"),
    
    _00("00");

    private String value;

    DisplayEnum(String value) {
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
    public static DisplayEnum fromValue(String value) {
      for (DisplayEnum b : DisplayEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private DisplayEnum display;

  /**
   * 단말 대화방에서 사용자 입력창을 활성화 또는 비활성화 합니다.      + 0 : 비활성화     + 1 : 활성화 
   */
  public enum InputFieldEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    InputFieldEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InputFieldEnum fromValue(Integer value) {
      for (InputFieldEnum b : InputFieldEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INPUT_FIELD = "inputField";
  private InputFieldEnum inputField = InputFieldEnum.NUMBER_1;

  public static final String JSON_PROPERTY_SUB_DESCR = "subDescr";
  private String subDescr;

  public static final String JSON_PROPERTY_BOT_AGENCY_ID = "botAgencyId";
  private String botAgencyId;

  /**
   * 안심마크 지정된 기업에 한하여, 대화방의 안심마크 표시 여부를 지정합니다.      + Y : 안심마크 표시   + N : 안심마크 미표시 
   */
  public enum SaftyStatusYnEnum {
    Y("Y"),
    
    N("N");

    private String value;

    SaftyStatusYnEnum(String value) {
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
    public static SaftyStatusYnEnum fromValue(String value) {
      for (SaftyStatusYnEnum b : SaftyStatusYnEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SAFTY_STATUS_YN = "saftyStatusYn";
  private SaftyStatusYnEnum saftyStatusYn = SaftyStatusYnEnum.Y;

  public static final String JSON_PROPERTY_PS_MENU_USE = "psMenuUse";
  private Boolean psMenuUse = false;

  /**
   * 대화방의 승인 상태입니다.      + 저장 : RCS Biz Center 홈페이지에서 대화방 정보를 입력하고 승인요청 하지 않고 저장해 둔 상태입니다. 저장 상태의 브랜드는 승인요청을 해야 승인대기 상태로 변경됩니다.     + 승인대기 : 대화방 등록 직후 검수 이전 상태입니다.     + 검수시작 : 대화방 검수가 시작된 상태입니다.     + 승인 : 검수가 완료되어 이통3사에 대화방 정보 등록까지 최종 완료되어 RCS 메시지를 발송할 수 있는 상태입니다.     + 반려 : 검수 시 승인이 불가하여 반려된 상태입니다. 반려된 대화방은 수정 후 다시 승인요청 할 수 있습니다.     + 검수완료 : RCS Biz Center에서 검수 승인 하였으나 이통사 3사 등록이 완료되지 않은 상태로 RCS 메시지를 발송할 수 없습니다.     + 검수완료(수정) : 승인된 대화방의 이름을 변경하였으나 이통3사 정보 등록이 완료되지 않은 상태입니다.       현재 상태에서는 이통사에 따라 단말 표시 대화방 이름이 다를 수 있습니다.    
   */
  public enum ApprovalResultEnum {
    _("승인대기"),
    
    _2("검수시작"),
    
    _3("승인"),
    
    _4("반려"),
    
    _5("검수완료"),
    
    _6("검수완료(수정)"),
    
    _7("저장");

    private String value;

    ApprovalResultEnum(String value) {
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
    public static ApprovalResultEnum fromValue(String value) {
      for (ApprovalResultEnum b : ApprovalResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_APPROVAL_RESULT = "approvalResult";
  private ApprovalResultEnum approvalResult;

  public static final String JSON_PROPERTY_REGISTER_DATE = "registerDate";
  private OffsetDateTime registerDate;

  public static final String JSON_PROPERTY_APPROVAL_DATE = "approvalDate";
  private OffsetDateTime approvalDate;

  public static final String JSON_PROPERTY_UPDATE_DATE = "updateDate";
  private OffsetDateTime updateDate;

  public static final String JSON_PROPERTY_REGISTER_ID = "registerId";
  private String registerId;

  public static final String JSON_PROPERTY_UPDATE_ID = "updateId";
  private String updateId;

  public Chatbot() {
  }

  public Chatbot groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 대화방이 대량등록된 경우 그룹ID 입니다. 
   * @return groupId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public Chatbot chatbotId(String chatbotId) {
    
    this.chatbotId = chatbotId;
    return this;
  }

   /**
   * 대화방(발신번호)ID, A2P의 경우 발신번호(mdn)과 동일합니다. 
   * @return chatbotId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHATBOT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getChatbotId() {
    return chatbotId;
  }


  @JsonProperty(JSON_PROPERTY_CHATBOT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChatbotId(String chatbotId) {
    this.chatbotId = chatbotId;
  }


  public Chatbot brandId(String brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * 브랜드ID
   * @return brandId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BRAND_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBrandId() {
    return brandId;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }


  public Chatbot subNum(String subNum) {
    
    this.subNum = subNum;
    return this;
  }

   /**
   * 회신번호 A2P의 경우 발신번호, 즉 chatbotId와 동일합니다. 
   * @return subNum
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubNum() {
    return subNum;
  }


  @JsonProperty(JSON_PROPERTY_SUB_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubNum(String subNum) {
    this.subNum = subNum;
  }


  public Chatbot isMainNum(Boolean isMainNum) {
    
    this.isMainNum = isMainNum;
    return this;
  }

   /**
   * 대표번호 개념은 더 이상 유효하지 않습니다.   브랜드에 등록된 대화방 중 유효한 첫번째 대화방이 표시됩니다. 
   * @return isMainNum
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_MAIN_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsMainNum() {
    return isMainNum;
  }


  @JsonProperty(JSON_PROPERTY_IS_MAIN_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsMainNum(Boolean isMainNum) {
    this.isMainNum = isMainNum;
  }


  public Chatbot subTitle(String subTitle) {
    
    this.subTitle = subTitle;
    return this;
  }

   /**
   * 대화방명입니다.
   * @return subTitle
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubTitle() {
    return subTitle;
  }


  @JsonProperty(JSON_PROPERTY_SUB_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }


  public Chatbot service(ServiceEnum service) {
    
    this.service = service;
    return this;
  }

   /**
   * 대화방 유형입니다.      + a2p : 발신번호를 이용한 대화방   + chat : 양방향ID를 이용한 대화방 
   * @return service
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServiceEnum getService() {
    return service;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setService(ServiceEnum service) {
    this.service = service;
  }


  public Chatbot display(DisplayEnum display) {
    
    this.display = display;
    return this;
  }

   /**
   * 단말에서 대화방의 검색 및 RCS대화방 노출 여부를 설정합니다.   브랜드홈 전시로 설정되면 대화방은 RCS메시지 수신이 가능하게 되며, 반대로 브랜드홈 비전시 설정 시에는 RCS메시지 수신이 불가능합니다.      + &#39;11&#39; : 브랜드채널 노출 및 브랜드검색 허용 &amp; 브랜드홈 전시     + &#39;10&#39; : 브랜드채널 노출 및 브랜드검색 허용 &amp; 브랜드홈 비전시     + &#39;01&#39; : 브랜드채널 노출 및 브랜드검색 불허 &amp; 브랜드홈 전시     + &#39;00&#39; : 브랜드채널 노출 및 브랜드검색 불허 &amp; 브랜드홈 비전시   
   * @return display
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DisplayEnum getDisplay() {
    return display;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplay(DisplayEnum display) {
    this.display = display;
  }


  public Chatbot inputField(InputFieldEnum inputField) {
    
    this.inputField = inputField;
    return this;
  }

   /**
   * 단말 대화방에서 사용자 입력창을 활성화 또는 비활성화 합니다.      + 0 : 비활성화     + 1 : 활성화 
   * @return inputField
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InputFieldEnum getInputField() {
    return inputField;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputField(InputFieldEnum inputField) {
    this.inputField = inputField;
  }


  public Chatbot subDescr(String subDescr) {
    
    this.subDescr = subDescr;
    return this;
  }

   /**
   * 대화방 검색 시 노출되는 소개글을 입력할 수 있습니다.   
   * @return subDescr
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_DESCR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubDescr() {
    return subDescr;
  }


  @JsonProperty(JSON_PROPERTY_SUB_DESCR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubDescr(String subDescr) {
    this.subDescr = subDescr;
  }


  public Chatbot botAgencyId(String botAgencyId) {
    
    this.botAgencyId = botAgencyId;
    return this;
  }

   /**
   * 양방향 대화방 서비스 계약 관계에 있는 대행사ID로 자동응답메시지 과금 및 챗봇 연동에 사용됩니다.     예를들어 양방향ID 대화방을 생성하는 경우 대행사ID를 지정하지 않아도 생성이 가능합니다.   대화방(발신번호)를 전환하는 경우에는 반드시 대행사ID를 지정해야 합니다.      + 기업에서 양방향 대화방 등록 시: 브랜드 대행사 중 양방향 서비스가 가능한 대행사ID 지정     + 양방향 서비스 대행사에서 양방향 대화방 등록 시: 연계된 중계사의 RBC 등록ID 지정(RBC 등록 ID는 해당 중계사에 직접 확인) 
   * @return botAgencyId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BOT_AGENCY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBotAgencyId() {
    return botAgencyId;
  }


  @JsonProperty(JSON_PROPERTY_BOT_AGENCY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBotAgencyId(String botAgencyId) {
    this.botAgencyId = botAgencyId;
  }


  public Chatbot saftyStatusYn(SaftyStatusYnEnum saftyStatusYn) {
    
    this.saftyStatusYn = saftyStatusYn;
    return this;
  }

   /**
   * 안심마크 지정된 기업에 한하여, 대화방의 안심마크 표시 여부를 지정합니다.      + Y : 안심마크 표시   + N : 안심마크 미표시 
   * @return saftyStatusYn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAFTY_STATUS_YN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SaftyStatusYnEnum getSaftyStatusYn() {
    return saftyStatusYn;
  }


  @JsonProperty(JSON_PROPERTY_SAFTY_STATUS_YN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaftyStatusYn(SaftyStatusYnEnum saftyStatusYn) {
    this.saftyStatusYn = saftyStatusYn;
  }


  public Chatbot psMenuUse(Boolean psMenuUse) {
    
    this.psMenuUse = psMenuUse;
    return this;
  }

   /**
   * 대화방메뉴 사용 여부입니다.      + true : 사용     + false : 미사용 
   * @return psMenuUse
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PS_MENU_USE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPsMenuUse() {
    return psMenuUse;
  }


  @JsonProperty(JSON_PROPERTY_PS_MENU_USE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPsMenuUse(Boolean psMenuUse) {
    this.psMenuUse = psMenuUse;
  }


  public Chatbot approvalResult(ApprovalResultEnum approvalResult) {
    
    this.approvalResult = approvalResult;
    return this;
  }

   /**
   * 대화방의 승인 상태입니다.      + 저장 : RCS Biz Center 홈페이지에서 대화방 정보를 입력하고 승인요청 하지 않고 저장해 둔 상태입니다. 저장 상태의 브랜드는 승인요청을 해야 승인대기 상태로 변경됩니다.     + 승인대기 : 대화방 등록 직후 검수 이전 상태입니다.     + 검수시작 : 대화방 검수가 시작된 상태입니다.     + 승인 : 검수가 완료되어 이통3사에 대화방 정보 등록까지 최종 완료되어 RCS 메시지를 발송할 수 있는 상태입니다.     + 반려 : 검수 시 승인이 불가하여 반려된 상태입니다. 반려된 대화방은 수정 후 다시 승인요청 할 수 있습니다.     + 검수완료 : RCS Biz Center에서 검수 승인 하였으나 이통사 3사 등록이 완료되지 않은 상태로 RCS 메시지를 발송할 수 없습니다.     + 검수완료(수정) : 승인된 대화방의 이름을 변경하였으나 이통3사 정보 등록이 완료되지 않은 상태입니다.       현재 상태에서는 이통사에 따라 단말 표시 대화방 이름이 다를 수 있습니다.    
   * @return approvalResult
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPROVAL_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApprovalResultEnum getApprovalResult() {
    return approvalResult;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovalResult(ApprovalResultEnum approvalResult) {
    this.approvalResult = approvalResult;
  }


  public Chatbot registerDate(OffsetDateTime registerDate) {
    
    this.registerDate = registerDate;
    return this;
  }

   /**
   * 대화방 등록일시
   * @return registerDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGISTER_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getRegisterDate() {
    return registerDate;
  }


  @JsonProperty(JSON_PROPERTY_REGISTER_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegisterDate(OffsetDateTime registerDate) {
    this.registerDate = registerDate;
  }


  public Chatbot approvalDate(OffsetDateTime approvalDate) {
    
    this.approvalDate = approvalDate;
    return this;
  }

   /**
   * 대화방 승인일시
   * @return approvalDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPROVAL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getApprovalDate() {
    return approvalDate;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovalDate(OffsetDateTime approvalDate) {
    this.approvalDate = approvalDate;
  }


  public Chatbot updateDate(OffsetDateTime updateDate) {
    
    this.updateDate = updateDate;
    return this;
  }

   /**
   * 대화방 수정일시
   * @return updateDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }


  public Chatbot registerId(String registerId) {
    
    this.registerId = registerId;
    return this;
  }

   /**
   * 대화방 등록 계정 ID
   * @return registerId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGISTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegisterId() {
    return registerId;
  }


  @JsonProperty(JSON_PROPERTY_REGISTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegisterId(String registerId) {
    this.registerId = registerId;
  }


  public Chatbot updateId(String updateId) {
    
    this.updateId = updateId;
    return this;
  }

   /**
   * 대화방 수정 계정 ID
   * @return updateId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdateId() {
    return updateId;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateId(String updateId) {
    this.updateId = updateId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Chatbot chatbot = (Chatbot) o;
    return Objects.equals(this.groupId, chatbot.groupId) &&
        Objects.equals(this.chatbotId, chatbot.chatbotId) &&
        Objects.equals(this.brandId, chatbot.brandId) &&
        Objects.equals(this.subNum, chatbot.subNum) &&
        Objects.equals(this.isMainNum, chatbot.isMainNum) &&
        Objects.equals(this.subTitle, chatbot.subTitle) &&
        Objects.equals(this.service, chatbot.service) &&
        Objects.equals(this.display, chatbot.display) &&
        Objects.equals(this.inputField, chatbot.inputField) &&
        Objects.equals(this.subDescr, chatbot.subDescr) &&
        Objects.equals(this.botAgencyId, chatbot.botAgencyId) &&
        Objects.equals(this.saftyStatusYn, chatbot.saftyStatusYn) &&
        Objects.equals(this.psMenuUse, chatbot.psMenuUse) &&
        Objects.equals(this.approvalResult, chatbot.approvalResult) &&
        Objects.equals(this.registerDate, chatbot.registerDate) &&
        Objects.equals(this.approvalDate, chatbot.approvalDate) &&
        Objects.equals(this.updateDate, chatbot.updateDate) &&
        Objects.equals(this.registerId, chatbot.registerId) &&
        Objects.equals(this.updateId, chatbot.updateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, chatbotId, brandId, subNum, isMainNum, subTitle, service, display, inputField, subDescr, botAgencyId, saftyStatusYn, psMenuUse, approvalResult, registerDate, approvalDate, updateDate, registerId, updateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chatbot {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    chatbotId: ").append(toIndentedString(chatbotId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    subNum: ").append(toIndentedString(subNum)).append("\n");
    sb.append("    isMainNum: ").append(toIndentedString(isMainNum)).append("\n");
    sb.append("    subTitle: ").append(toIndentedString(subTitle)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    inputField: ").append(toIndentedString(inputField)).append("\n");
    sb.append("    subDescr: ").append(toIndentedString(subDescr)).append("\n");
    sb.append("    botAgencyId: ").append(toIndentedString(botAgencyId)).append("\n");
    sb.append("    saftyStatusYn: ").append(toIndentedString(saftyStatusYn)).append("\n");
    sb.append("    psMenuUse: ").append(toIndentedString(psMenuUse)).append("\n");
    sb.append("    approvalResult: ").append(toIndentedString(approvalResult)).append("\n");
    sb.append("    registerDate: ").append(toIndentedString(registerDate)).append("\n");
    sb.append("    approvalDate: ").append(toIndentedString(approvalDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    registerId: ").append(toIndentedString(registerId)).append("\n");
    sb.append("    updateId: ").append(toIndentedString(updateId)).append("\n");
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

