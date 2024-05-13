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
 * Messagebase 기본 정보입니다.
 */
@JsonPropertyOrder({
  Messagebase.JSON_PROPERTY_GROUP_ID,
  Messagebase.JSON_PROPERTY_MESSAGEBASE_ID,
  Messagebase.JSON_PROPERTY_TMPLT_NAME,
  Messagebase.JSON_PROPERTY_MESSAGEBASEFORM_ID,
  Messagebase.JSON_PROPERTY_BRAND_ID,
  Messagebase.JSON_PROPERTY_STATUS,
  Messagebase.JSON_PROPERTY_APPROVAL_RESULT,
  Messagebase.JSON_PROPERTY_APPROVAL_REASON,
  Messagebase.JSON_PROPERTY_REGISTER_DATE,
  Messagebase.JSON_PROPERTY_APPROVAL_DATE,
  Messagebase.JSON_PROPERTY_UPDATE_DATE,
  Messagebase.JSON_PROPERTY_REGISTER_ID,
  Messagebase.JSON_PROPERTY_UPDATE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:19:20.016497294Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Messagebase {
  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  private String groupId;

  public static final String JSON_PROPERTY_MESSAGEBASE_ID = "messagebaseId";
  private String messagebaseId;

  public static final String JSON_PROPERTY_TMPLT_NAME = "tmpltName";
  private String tmpltName;

  public static final String JSON_PROPERTY_MESSAGEBASEFORM_ID = "messagebaseformId";
  private String messagebaseformId;

  /**
   * 템플릿이 등록되어 있는 브랜드 ID 입니다.&lt;br&gt; 공통으로 사용하는 템플릿인 경우 &#39;common&#39;으로 표시됩니다. 
   */
  public enum BrandIdEnum {
    COMMON("common");

    private String value;

    BrandIdEnum(String value) {
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
    public static BrandIdEnum fromValue(String value) {
      for (BrandIdEnum b : BrandIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BRAND_ID = "brandId";
  private BrandIdEnum brandId;

  /**
   * 템플릿의 상태를 표시합니다.&lt;br&gt; ready : 사용 &lt;br&gt; pause : 사용중지 
   */
  public enum StatusEnum {
    READY("ready"),
    
    PAUSE("pause");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  /**
   * 템플릿의 승인 상태입니다.  - 저장 : RCS Biz Center 홈페이지에서 템플릿 정보를 입력하고 승인요청 하지 않고 저장해 둔 상태입니다. 저장 상태의 템플릿은 승인요청을 해야 승인대기 상태로 변경됩니다.  - 승인대기 : 템플릿 등록 직후 검수 이전 상태입니다.  - 검수시작 : 템플릿 검수가 시작된 상태입니다.  - 승인 : 검수가 완료되어 이통3사에 정보 등록까지 최종 완료되어 RCS 메시지를 발송할 수 있는 상태입니다.  - 반려 : 검수 시 승인이 불가하여 반려된 상태입니다. 반려된 템플릿은 수정 후 다시 승인요청 할 수 있습니다.  - 검수완료 : RCS Biz Center에서 검수 승인 하였으나 이통사 3사 등록이 완료되지 않은 상태로 RCS 메시지를 발송할 수 없습니다.  - 승인대기(수정) : 승인된 템플릿 변경 승인요청 직후 검수 이전 상태입니다.       - 검수시작(수정) : 승인된 템플릿 변경으로 승인요청된 템플릿 검수가 시작된 상태입니다.  - 반려(수정) : 승인된 템플릿 변경 검수 처리 결과 반려된 상태입니다.  - 검수완료(수정) : 승인된 브랜드 변경 검수 승인은 되었으나 이통3사 정보 등록이 완료되지 않은 상태입니다.   현재 상태에서는 이통사에 따라 단말 브랜드 홈 정보가 다를 수 있습니다. 
   */
  public enum ApprovalResultEnum {
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

  public static final String JSON_PROPERTY_APPROVAL_REASON = "approvalReason";
  private String approvalReason;

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

  public Messagebase() {
  }

  public Messagebase groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * 템플릿이 대량등록된 경우 그룹ID 입니다.
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


  public Messagebase messagebaseId(String messagebaseId) {
    
    this.messagebaseId = messagebaseId;
    return this;
  }

   /**
   * 템플릿 ID
   * @return messagebaseId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGEBASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessagebaseId() {
    return messagebaseId;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGEBASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessagebaseId(String messagebaseId) {
    this.messagebaseId = messagebaseId;
  }


  public Messagebase tmpltName(String tmpltName) {
    
    this.tmpltName = tmpltName;
    return this;
  }

   /**
   * 템플릿 등록시 입력된 템플릿 명칭입니다.
   * @return tmpltName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TMPLT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTmpltName() {
    return tmpltName;
  }


  @JsonProperty(JSON_PROPERTY_TMPLT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTmpltName(String tmpltName) {
    this.tmpltName = tmpltName;
  }


  public Messagebase messagebaseformId(String messagebaseformId) {
    
    this.messagebaseformId = messagebaseformId;
    return this;
  }

   /**
   * 템플릿의 원형인 템플릿 양식 ID 입니다.
   * @return messagebaseformId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGEBASEFORM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessagebaseformId() {
    return messagebaseformId;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGEBASEFORM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessagebaseformId(String messagebaseformId) {
    this.messagebaseformId = messagebaseformId;
  }


  public Messagebase brandId(BrandIdEnum brandId) {
    
    this.brandId = brandId;
    return this;
  }

   /**
   * 템플릿이 등록되어 있는 브랜드 ID 입니다.&lt;br&gt; 공통으로 사용하는 템플릿인 경우 &#39;common&#39;으로 표시됩니다. 
   * @return brandId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BrandIdEnum getBrandId() {
    return brandId;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandId(BrandIdEnum brandId) {
    this.brandId = brandId;
  }


  public Messagebase status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * 템플릿의 상태를 표시합니다.&lt;br&gt; ready : 사용 &lt;br&gt; pause : 사용중지 
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Messagebase approvalResult(ApprovalResultEnum approvalResult) {
    
    this.approvalResult = approvalResult;
    return this;
  }

   /**
   * 템플릿의 승인 상태입니다.  - 저장 : RCS Biz Center 홈페이지에서 템플릿 정보를 입력하고 승인요청 하지 않고 저장해 둔 상태입니다. 저장 상태의 템플릿은 승인요청을 해야 승인대기 상태로 변경됩니다.  - 승인대기 : 템플릿 등록 직후 검수 이전 상태입니다.  - 검수시작 : 템플릿 검수가 시작된 상태입니다.  - 승인 : 검수가 완료되어 이통3사에 정보 등록까지 최종 완료되어 RCS 메시지를 발송할 수 있는 상태입니다.  - 반려 : 검수 시 승인이 불가하여 반려된 상태입니다. 반려된 템플릿은 수정 후 다시 승인요청 할 수 있습니다.  - 검수완료 : RCS Biz Center에서 검수 승인 하였으나 이통사 3사 등록이 완료되지 않은 상태로 RCS 메시지를 발송할 수 없습니다.  - 승인대기(수정) : 승인된 템플릿 변경 승인요청 직후 검수 이전 상태입니다.       - 검수시작(수정) : 승인된 템플릿 변경으로 승인요청된 템플릿 검수가 시작된 상태입니다.  - 반려(수정) : 승인된 템플릿 변경 검수 처리 결과 반려된 상태입니다.  - 검수완료(수정) : 승인된 브랜드 변경 검수 승인은 되었으나 이통3사 정보 등록이 완료되지 않은 상태입니다.   현재 상태에서는 이통사에 따라 단말 브랜드 홈 정보가 다를 수 있습니다. 
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


  public Messagebase approvalReason(String approvalReason) {
    
    this.approvalReason = approvalReason;
    return this;
  }

   /**
   * 승인 사유
   * @return approvalReason
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPROVAL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApprovalReason() {
    return approvalReason;
  }


  @JsonProperty(JSON_PROPERTY_APPROVAL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApprovalReason(String approvalReason) {
    this.approvalReason = approvalReason;
  }


  public Messagebase registerDate(OffsetDateTime registerDate) {
    
    this.registerDate = registerDate;
    return this;
  }

   /**
   * 템플릿 등록일시
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


  public Messagebase approvalDate(OffsetDateTime approvalDate) {
    
    this.approvalDate = approvalDate;
    return this;
  }

   /**
   * 템플릿 승인일시
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


  public Messagebase updateDate(OffsetDateTime updateDate) {
    
    this.updateDate = updateDate;
    return this;
  }

   /**
   * 템플릿 수정일시
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


  public Messagebase registerId(String registerId) {
    
    this.registerId = registerId;
    return this;
  }

   /**
   * 템플릿 등록 계정 ID
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


  public Messagebase updateId(String updateId) {
    
    this.updateId = updateId;
    return this;
  }

   /**
   * 템플릿 수정 계정 ID
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
    Messagebase messagebase = (Messagebase) o;
    return Objects.equals(this.groupId, messagebase.groupId) &&
        Objects.equals(this.messagebaseId, messagebase.messagebaseId) &&
        Objects.equals(this.tmpltName, messagebase.tmpltName) &&
        Objects.equals(this.messagebaseformId, messagebase.messagebaseformId) &&
        Objects.equals(this.brandId, messagebase.brandId) &&
        Objects.equals(this.status, messagebase.status) &&
        Objects.equals(this.approvalResult, messagebase.approvalResult) &&
        Objects.equals(this.approvalReason, messagebase.approvalReason) &&
        Objects.equals(this.registerDate, messagebase.registerDate) &&
        Objects.equals(this.approvalDate, messagebase.approvalDate) &&
        Objects.equals(this.updateDate, messagebase.updateDate) &&
        Objects.equals(this.registerId, messagebase.registerId) &&
        Objects.equals(this.updateId, messagebase.updateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, messagebaseId, tmpltName, messagebaseformId, brandId, status, approvalResult, approvalReason, registerDate, approvalDate, updateDate, registerId, updateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Messagebase {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    messagebaseId: ").append(toIndentedString(messagebaseId)).append("\n");
    sb.append("    tmpltName: ").append(toIndentedString(tmpltName)).append("\n");
    sb.append("    messagebaseformId: ").append(toIndentedString(messagebaseformId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    approvalResult: ").append(toIndentedString(approvalResult)).append("\n");
    sb.append("    approvalReason: ").append(toIndentedString(approvalReason)).append("\n");
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
