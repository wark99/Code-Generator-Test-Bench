# openapi-java-client

RCS Biz Center API 규격

- API version: 1.1.12-oas3.1

- Build date: 2024-05-13T19:19:20.016497294Z[Etc/UTC]

- Generator version: 7.4.0

# **RCS Biz Center API Version 1.1.12** 

본 문서는 기업과 대행사에 제공되는 RCS Biz Center Open API의 규격을 기술합니다.

Open API의 사용을 위해서는 사전에 RCS Biz Center에 기업/대행사 등록이 필요합니다.

추가적인 보안을 위해 API를 연동하는 Client의 IP 를 RCS Biz Center에 사전 등록하여야 합니다.  RCS Biz Center 홈페이지 \\\"내 계정관리\\\"에서 등록하실 수 있습니다.

Open API를 연동하고자 하는 경우 사전 개발 단계에서는 검수(STG) 환경에 별도 가입 및 승인 후 이용할 수 있습니다.  
검수(STG) 환경에서 개발이 완료된 이후 상용(PRD) 연동을 하는 것을 권고합니다.      

1. 검수(STG) - https://api-qa.rcsbizcenter.com/api/1.1
2. 상용(PRD) - https://api.rcsbizcenter.com/api/1.1  

RCS Biz Center Open API는 이통 3사가 정의한 정책에 의거하여 정보를 제공합니다. 따라서 일부 정보 제공상의 제약이 있을 수 있습니다.  

**Open API 문의처 : tech@rcsbizcenter.com**

`참고문서`  
  + **[버튼 Action 목록 Link (2023.12.14)](https://file.rcsbizcenter.com/231214143124234/TS-231214143124234-fVDQnA_1.xlsx)**
  + **[RCS A2P(단방향) 포맷 리스트 (24.02.07 공유버전)](https://file-qa.rcsbizcenter.com/240319170900114/TS-240319170900114-segSiw_1.xlsx)**   
  + **[RCS 양방향 포맷 리스트 (22.10.28 공유 버전)](https://file-qa.rcsbizcenter.com/221027084901492/TS-221027084901492-mIfP_1.xlsx)**  


`수정 이력`  
**1.1.12 주요 변경사항**  

+ RBC 기본 아이콘 및 브랜드 로고 신규 API 추가 [신규로고 API](#/logo)
  - 브랜드 로고는 승인 후 사용 가능
  - GET /logo/common : RBC 제공 기본 아이콘 조회
  - GET /brand/{brandId}/logo : 브랜드 로고 조회
  - POST /brand/{brandId}/logo : 브랜드 로고 등록
  - GET /brand/{brandId}/logo/{fileId} : 브랜드 로고 단건 조회
  - PUT /brand/{brandId}/logo/{fileId} : 브랜드 로고 수정
  - DELETE /brand/{brandId}/logo/{fileId} : 브랜드 로고 단건 삭제
  - PUT /brand/{brandId}/logo/{fileId}/cancel : 브랜드 로고 승인요청 취소
+ 템플릿 또는 메시지 발송 시, 변수 mTitleMedia, itemMedia 에 사용할 이미지는 브랜드 로고(logo) 등록 후 발급된 fileId를 지정해야 합니다.  
+ 브랜드 로고 추가에 따른 Webhook Noti 추가
  - notiType logo 추가 [스키마](#/NotiLogo)
  
    
**1.1.11 주요 변경사항**  

+ 고객반응 메시지/대화방메뉴 통계 제공 필드 추가
  - GET /statQuery/message/{brandId} 응답 결과 내 messagebaseId 필드 추가 > 관련 스키마 [MessageStatData](#/MessageStatData)
  - GET /statQuery/messageButton/{brandId} 응답 결과 내 reactionType, cardNum, buttonNum 필드 추가 > 관련 스키마 [MessageButtonStatData](#/MessageButtonStatData)
  - GET /statQuery/persistentMenu/{brandId} 응답 결과 내 자동응답메시지인 경우, messagebaseId, reactionType, cardNum, buttonNum 필드 추가 > 관련 스키마 [PersistentMenuStatData.menuList.subList](#/MenuStatData)
  - 동영상 스트리밍 actionType 구분 iframeplayB 추가
  
  
**1.1.10 주요 변경사항**  

+ 계정, 권한 구분 용어 변경
  - 기업관리자 : 마스터
  - 기업담당자 : 매니저
  - 브랜드 관리자 : 대표운영자
  - 브랜드 부관리자 : 운영자
  - 브랜드 대행사 : 운영자
+ 브랜드 생성 권한 확대 : 마스터, 매니저 계정
+ 브랜드 수정 권한 확대 : 브랜드 대표운영자(마스터), 브랜드 운영자(마스터, 매니저, 대행사)
+ 브랜드 영업정보, 브랜드 컬러 등 추가 설정 사항  
+ 대화방 안심마크 표시 여부 설정
+ 양방향 대화방 전환, 양방향 대행사 설정 없는 botId 대화방 등록
+ 양방향 대행사 설정 없는 대화방메뉴 등록/수정
+ 텍스트 템플릿 타이틀 선택형의 아이콘 이미지 변경  
  - 아이콘 이미지 변경으로 formattedString 상의 fileId 변경  
+ 자동응답메시지 간 연결(버튼, 칩리스트)
+ 자동응답메시지, 대화방메뉴 브랜드 소식 연결
+ 대행사 대상 레이아웃 기능
+ 신규 템플릿 상품 지원(규격 변경 사항 없음)
+ 신규 또는 기능 추가/변경된 API
  - POST /corp/brand
  - PUT /corp/brand/{brandId}
  - PUT /corp/{personId}/brand/{brandId}
  - GET /corp/{personId}/brand/{brandId}
  - DELETE /corp/{personId}/brand/{brandId}
  - DELETE /corp/{personId}/brand/{brandId}/privilege  
  - POST /brand/{brandId}/chatbot 
  - GET /brand/{brandId}/chatbot
  - PUT /brand/{brandId}/chatbot/{chatbotId}
  - GET /brand/{brandId}/chatbot/{chatbotId}
  - GET /brand/{brandId}/bidirectional/chatbot 
  - POST /brand/{brandId}/bidirectional/chatbot 
  - PUT /brand/{brandId}/bidirectional/chatbot/{chatbotId} 
  - GET /brand/{brandId}/bidirectional/chatbot/{chatbotId}
  - DELETE /brand/{brandId}/bidirectional/chatbot/{chatbotId}  
  - POST /brand/{brandId}/autoreplymsg        
  - PUT /brand/{brandId}/autoreplymsg/{autoReplyMsgId}        
  - POST /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu
  - PUT /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu
  - (신규) PUT /corp/brand/{brandId}/cancel
  - (신규) PUT /corp/{personId}/brand/{brandId}/cancel
  - (신규) PUT /agency/{agencyId}/brand/{brandId}
  - (신규) GET /messagebase/messagebaseform/{messagebaseformId}/logo
  - (신규) GET /baselayout/component        
  - (신규) GET /baselayout/sample        
  - (신규) GET /baselayout/sample/{sampleLayoutId}        
  - (신규) GET /baselayout/product/rule        
  - (신규) GET /brand/{brandId}/layout        
  - (신규) POST /brand/{brandId}/layout    
  - (신규) GET /brand/{brandId}/layout/{layoutId}        
  - (신규) PUT /brand/{brandId}/layout/{layoutId}        
  - (신규) DELETE /brand/{brandId}/layout/{layoutId}  


**1.1.9 추가 변경사항(2023.03.16 변경 사항)**
+ 대화방 승인 취소 API 추가
  - PUT /brand/{brandId}/chatbot/{chatbotId}/cancel
+ 대화방명 변경 시 운영자 검수 승인 필요
  - POST /brand/{brandId}/bidirectional/chatbot/{chatbotId} 발신번호 양방향 대화방 전환 시 대화방명 수정된 경우
  - POST /brand/{brandId}/bidirectional/chatbot/{chatbotId} 대화방ID  양방향 대화방의 대화방명
  - PUT /brand/{brandId}/chatbot/{chatbotId} 발신번호 대화방명 수정 시
  - PUT /brand/{brandId}/bidirectional/chatbot/{chatbotId} 양방향 대화방 대화방명 수정 시
+ 브랜드 채널 노출/검색 허용에 따른 대화방(chatbot) API display value 허용값 변경
  - '11' : 브랜드채널 노출,브랜드검색 허용,브랜드홈 전시
  - '10' : 브랜드채널 노출,브랜드검색 허용,브랜드홈 비전시
  - '01' : 브랜드채널 노출,브랜드검색 불허,브랜드홈 전시
  - '00' : 브랜드채널 노출,브랜드검색 불허,브랜드홈 비전시


**1.1.9 추가 변경사항**
+ 메시지 보안성 강화 agencyKey API 추가
  - GET /agency/{agencyId}/agencyKey
  - RBC 홈페이지에서 agencyKey 재발급시 Webhook noti 전송(notiType agencyKey)
+ 양방향 대화방 ID 정책변경에 따라 service 구분이 'CHAT'인 대화방ID(chatbotId)의 포맷 규칙이 변경
  - POST /brand/{brandId}/bidirectional/chatbot
  - GET /usableQuery/chatbotId/{chatbotId}
+ 브랜드 등록 시 브랜드 홈 기본 탭 선택 항목 추가
  - POST /corp/brand
  - properties 추가: initTab, initFeedItem 
  - 추가 항목은 별도 지정하지 않더라도 기본값으로 처리됨

**1.1.8 추가 변경사항(2022.12.08 상용 배포)**
+ 대화방ID 등록 가능여부 조회 API 추가
  - GET /usableQuery/chatbotId/{chatbotId}
  - 대화방ID 등록 전 등록 가능여부 조회
  

**1.1.8 변경사항**
+ 이미지 템플릿 추가에 따른 신규 템플릿 등록 API 추가
  - 이미지 템플릿 및 모든 템플릿 등록 시 사용 가능 ( api/1.1 지원, api/1.0 미지원 )
  - 이미지 템플릿용 파일 등록 POST /brand/{brandId}/v2/messagebase/file
  - 이미지 템플릿용 파일 상세 조회 GET /brand/{brandId}/v2/messagebase/file/{fileId}
  - 템플릿 등록(v2) POST /brand/{brandId}/v2/messagebase
  - 템플릿 수정(v2) POST /brand/{brandId}/v2/messagebase/{messagebaseId}
+ 타이틀 자유형(구 테마 강조형A) Description 우측 타이틀 허용
  - 타이틀 자유형의 타이틀 영역 중 우측 타이틀 영역에 Cell 템플릿과 마찬가지로 본문과 버튼에 설정한 변수부 중 1개를 설정할 수 있도록 변경

**1.1.7 변경사항**
+ 타이틀 자유형(구 테마 강조형A) 템플릿 messagebaseform 조회 지원
  - 타이틀 자유형(구 테마 강조형A) Description, Cell
+ 타이틀 자유형(구 테마 강조형A) 템플릿 messagebase 조회/등록/수정/삭제 지원
  - 타이틀 자유형(구 테마 강조형A) 등록 JSON 예시 추가(POST /brand/{brandId}/messagebase)
  - 타이틀 자유형(구 테마 강조형A) 조회 시 버튼 정보 표시 방식 변경(신규 openrichcard 규격)
+ 대행사용 API 추가
  - RBC 등록된 사업자 확인 GET /agency/{agencyId}/corp/{corpRegNum}
  - RBC 에 등록된 발신번호 확인 GET /agency/{agencyId}/corp/{corpRegNum}/chatbot/{chatbotId}
+ 고객반응통계 조회 API 수정
  - 대화방 메뉴 자동응답메시지 설정 정책 변경에 따른 Data Object 구조 변경
  - 대상 API GET /statQuery/persistentMenu/{brandId}
+ 양방향 대화방 메뉴 설정 정책 변경 반영
  - 하위 메뉴 자동응답메시지 설정 허용
  - 액션 버튼 설정 dialerAction 만 가능(지정 불가 액션 버튼 - urlAction, mapAction, calendarAction, clipboardAction, composeAction, localBrowserAction)

**1.1.6 변경사항**
+ 고객반응통계 조회 API 추가
  - 캠페인 발송/읽음확인 통계 GET /statQuery/message/{brandId}
  - 캠페인 메시지 버튼 클릭 통계 GET /statQuery/messageButton/{brandId}
  - 대화방 메뉴 클릭 통계 GET /statQuery/persistentMenu/{brandId}
+ 신규 공통템플릿 정보 추가
  - 규격 상의 변경점은 없으며 추가된 공통템플릿 정보 데이터 제공되도록 변경함
  - GET /messagebase/common
  - GET /messagebase/common/{messagebaseId}

**1.1.5 변경사항**
+ [주의] 신규 추가된 API는 /api/1.1 만 지원됨
+ Brand 정보 내 브랜드 소식 URL 정보 추가 
  - botFeedUrl (브랜드 소식 등록 시 자동 추가)
+ 양방향 대화방 API 추가
  - POST, GET /brand/{brandId}/bidirectional/chatbot
  - PUT, DELETE, GET /brand/{brandId}/bidirectional/chatbot/{chatbotId}
  - POST, PUT, DELETE /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu
  - POST, GET /brand/{brandId}/autoreplymsg
  - PUT, DELETE, GET /brand/{brandId}/autoreplymsg/{autoReplyMsgId}
  - POST /brand/{brandId}/autoreplymsg/file
  - GET /brand/{brandId}/autoreplymsg/file/{fileId}
+ 양방향 대화방 중계사 연동 Webhook 추가
  - POST /{webhookUrl}/bidirectional
  - PUT /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu/pause
+ 대행사 Noti webhook NotiType 추가
  - 자동응답메시지(notiType: autoreplymsg)


**1.1.4 추가 변경사항**
+ 템플릿 승인 후 수정 허용
  - 기승인 템플릿의 내용 수정 허용(수정 시 재승인 필요)
  - 수정 허용에 따른 approvalResult 제공 값 변경
+ 템플릿 승인요청 취소 API 추가
  - PUT /brand/{brandId}/messagebase/{messagebaseId}/cancel
  - approvalResult가 승인대기, 승인대기(수정) 인 경우만 취소 가능
+ 템플릿 승인상태 구분 추가 : 검수시작, 검수시작(수정), 승인대기(수정), 반려(수정), 검수완료(수정) 
+ 대화방 승인상태 구분 추가 : 검수시작 
+ 브랜드 승인상태 구분 추가 : 검수시작, 검수시작(수정) 
+ 스타일(Cell) 템플릿 formattedString 구성 시 textStyle 허용값 중 italic 제외(예, bold|italic 설정 시 bold 로 처리됨)

**1.1.3 추가 변경사항**
+ 브랜드 상세조회 제공 항목 추가(2021/02/25)
  - fileName - 업로드 된 파일의 이름
  - approvalReason - 검수 시 반려 사유
+ 브랜드 상세조회/수정/삭제 API 추가
  - PUT /corp/brand/{brand}
  - GET /corp/{personId}/brand/{brandId}
  - PUT /corp/{personId}/brand/{brandId}
  - DELETE /corp/{personId}/brand/{brandId}
  - POST /corp/{personId}/brand/{brandId}/privilege
  - PUT /corp/{personId}/brand/{brandId}/privilege
  - GET /corp/{personId}/brand/{brandId}/privilege
  - DELETE /corp/{personId}/brand/{brandId}/privilege/{id}
+ 기업/대행사/규격서 버전별 API 분류(TAG) 
+ 템플릿 API 등 설명 내용 보완
+ **2020년 12월 3일 기준 브랜드 등록 항목 menus 중 app 은 이통사 정책에 의거 한시적으로 등록이 불가하며 app 등록 시 error 리턴됩니다.**
+ 브랜드 상태 구분 추가 : 승인대기(수정), 반려(수정), 검수완료(수정)

**1.1.2 변경사항**
+ 브랜드 등록 API 추가
  - 기업관리자 계정으로만 등록 가능
  - 브랜드 등록 시 입력되는 카테고리1, 2 정보 조회 API 추가 
  - GET /corp/brand/categories
  - POST /corp/brand

**1.1.1 변경사항**
+ GuideInfo 내 리치카드용 세부 정보 추가
  - GET /messagebase/common/{messagebaseId} 조회 상세 정보 중 guideInfo.detailInfo 추가
  - 리치카드를 이용하여 발송된 RCS 메시지가 단말에서 표시될 경우 잘림 없이 표시 가능한 조건 정보 제공을 위하여 추가

**1.1.0 변경사항**
+ API 1.0, 1.1 버전 병행 지원 - 이후 일부 개선 사항은 API 1.0에 제공이 불가 할 수 있으므로 1.1 버전 사용 권장
+ ContractInfo.regDate, ContractInfo.modDate Key Name 변경 \\
-> ContractInfo.registerDate, ContractInfo.updateDate
+ 각 API별 Response Body의 result key의 type을 array로 통일하였으며 변경된 API는 다음과 같음
  - GET /agency/{agencyId}/brand/{brandId}
  - GET /messagebase/common
  - GET /messagebase/common/{messagebaseId}
  - GET /messagebase/messagebaseform/{messagebaseformId}
  - POST /brand/{brandId}/messagebase
  - GET /brand/{brandId}/messagebase
  - GET /brand/{brandId}/messagebase/{messagebaseId}
  - PUT /brand/{brandId}/messagebase/{messagebaseId}
  - DELETE /brand/{brandId}/messagebase/{messagebaseId}
  - POST /brand/{brandId}/chatbot
  - GET /brand/{brandId}/chatbot
  - GET /brand/{brandId}/chatbot/{chatbotId}
  - PUT /brand/{brandId}/chatbot/{chatbotId}
  - DELETE /brand/{brandId}/chatbot/{chatbotId}

**2020.07.07 수정사항**
+ BrandInfo 내 제공 정보 추가
  - brandKey : API를 이용하여 브랜드Key 확인 가능
  - chatbotDate : 브랜드 하위 대화방 데이터 최종 변경 일시 정보
  - messagebaseDate : 브랜드 하위 템플릿 최종 변경 일시 정보
+ Get List API Pagination 기능 추가
  - Query 파라미터를 이용하여 전체를 페이징하여 조회하도록 제공
  - offset : 조회 기준 ROW (default = 0)
  - limit : offset 으로부터 조회되는 건수 제한(default = 100, max = 1000)
  - Response body 내 pagination, links 제공
+ messagebaseform 조회시 bizCondition 정보가 코드로 표시되는 문제 수정

**2020.05.19 수정사항**
+ 대행사-브랜드 계약 정보인 ContractInfo 내에 key 추가
  - GET /agency/{agencyId}/contract 
  - GET /agency/{agencyId}/corp/{corpRegNum}/brand
  - 추가 Key : brandDate, chatbotDate, messagebaseDate
  - 브랜드, 해당 브랜드 하위 대화방/템플릿 데이터의 최종 변경 일시 정보를 제공하여
  상세 조회 이전에 변경사항 여부를 판단할 수 있도록 개선
  
**2020.03.12 수정사항**
+ date-time 예시 추가

**2020.02.19 수정사항**
+ ParamInfo 내 isMandatory 추가

**2020.02.11 수정사항**
+ GET /brand/{brandId}/chatbot Chatbots 를 chatbots로 수정

**2020.02.07 수정사항**
+ Widget, WidgetPolicy 설명 추가
+ API 문의처 정보 추가
+ POST /brand/{brandId}/chatbot 시 rcsReply 필수 입력 추가(2/13 상용 적용)

**2020.01.06 수정사항**
+ API 서버 구분 추가

**2019.12.17 수정사항**
+ X-RCS-Brandkey의 format 변경 (uuid -> random key)

**2019.11.25 수정사항**
+ 템플릿, 발신번호(대화방) UPDATE, DELETE Method 처리가능 상태 설명 추가
+ 전체 200 OK 응답 형식 수정
+ chatbot UPDATE시 profileImage 삭제
+ chatbot UPDATE시 통신서비스이용증명원 업로드 추가

**2019.11.19 수정사항**
+ messagebaseform의 bizService 오타 수정
+ BrandInfo.mediaUrl 추가
+ ChabotDetail.mediaUrl 추가

**2019.11.05 수정사항**
+ RegChatbotInfo.smsMo 삭제
+ ChatbotDetail 수정
  - smsMo 삭제, rcsReply 추가
  - rcsReply default 1(RCS Postback 수신)

**2019.10.29 수정사항**
+ {webhookUrl} NotiTemplate.brandId 추가
+ chatbot Attributes 설명 수정

**2019.10.23 수정사항**
+ {webhookUrl} 설명 내용 수정
  - Brand Key 제공 내용 삭제
  - nType을 notiType으로 명칭 변경
+ webhook notification에 대한 대행사 return code 추가
+ messagebase, messagebaseform 의 formattedString type
  string에서 object로 변경
+ messagebaseform의 bizCondition type을 string 에서 array로 변경
+ messagebaseform 상세 조회시 양식 유형 이미지 링크 제공
  - MessagebaseFormInfo.mediaUrl 추가
  
**2019.10.02 RCS Biz Center API 1.0.1 배포**



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.1.12-oas3.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:1.1.12-oas3.1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/openapi-java-client-1.1.12-oas3.1.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.*;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AgencyApi;

public class AgencyApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String agencyId = "agencyId_example"; // String | RCS Biz Center에 등록된 대행사 ID 입니다.
        try {
            AgencyAgencyIdAgencyKeyGet200Response result = apiInstance.agencyAgencyIdAgencyKeyGet(agencyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#agencyAgencyIdAgencyKeyGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api-qa.rcsbizcenter.com/api/1.1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AgencyApi* | [**agencyAgencyIdAgencyKeyGet**](docs/AgencyApi.md#agencyAgencyIdAgencyKeyGet) | **GET** /agency/{agencyId}/agencyKey | RBC에서 발급된 최종 대행사 키를 조회합니다. 
*AgencyApi* | [**agencyAgencyIdBrandBrandIdGet**](docs/AgencyApi.md#agencyAgencyIdBrandBrandIdGet) | **GET** /agency/{agencyId}/brand/{brandId} | 계약된 브랜드 정보를 개별 조회 합니다. 
*AgencyApi* | [**agencyAgencyIdBrandBrandIdPut**](docs/AgencyApi.md#agencyAgencyIdBrandBrandIdPut) | **PUT** /agency/{agencyId}/brand/{brandId} | 대행사가 운영 중인 브랜드 정보를 수정 합니다. 브랜드명, 프로필 이미지가 수정되면 다시 승인을 받아야 합니다. 
*AgencyApi* | [**agencyAgencyIdContractGet**](docs/AgencyApi.md#agencyAgencyIdContractGet) | **GET** /agency/{agencyId}/contract | 대행사가 계약된 브랜드 리스트를 제공합니다. 
*AgencyApi* | [**agencyAgencyIdCorpCorpRegNumBrandGet**](docs/AgencyApi.md#agencyAgencyIdCorpCorpRegNumBrandGet) | **GET** /agency/{agencyId}/corp/{corpRegNum}/brand | 대행사가 계약된 브랜드를 기업 단위로 조회합니다. 
*AgencyApi* | [**agencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet**](docs/AgencyApi.md#agencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet) | **GET** /agency/{agencyId}/corp/{corpRegNum}/chatbot/{chatbotId} | 발신번호가 RBC에 대상 사업자의 발신번호로 등록되어 있는지 확인할 수 있습니다. 
*AgencyApi* | [**agencyAgencyIdCorpCorpRegNumGet**](docs/AgencyApi.md#agencyAgencyIdCorpCorpRegNumGet) | **GET** /agency/{agencyId}/corp/{corpRegNum} | 사업자등록번호로 RBC 가입 여부와 브랜드 대행사 지정 상태를 확인할 수 있습니다. 
*AgencyApi* | [**baselayoutComponentGet**](docs/AgencyApi.md#baselayoutComponentGet) | **GET** /baselayout/component | 레이아웃 등록/수정 시 사용 가능한 컴포넌트 목록을 조회 합니다. 
*AgencyApi* | [**baselayoutProductRuleGet**](docs/AgencyApi.md#baselayoutProductRuleGet) | **GET** /baselayout/product/rule | 메시지 상품별 레이아웃 구성 규칙을 조회합니다. 
*AgencyApi* | [**baselayoutSampleGet**](docs/AgencyApi.md#baselayoutSampleGet) | **GET** /baselayout/sample | 레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 목록 입니다. 
*AgencyApi* | [**baselayoutSampleSampleLayoutIdGet**](docs/AgencyApi.md#baselayoutSampleSampleLayoutIdGet) | **GET** /baselayout/sample/{sampleLayoutId} | 레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 상세 정보를 조회합니다. 
*AgencyApi* | [**brandBrandIdAutoreplymsgAutoReplyMsgIdDelete**](docs/AgencyApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdDelete) | **DELETE** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지를 삭제합니다. 
*AgencyApi* | [**brandBrandIdAutoreplymsgAutoReplyMsgIdGet**](docs/AgencyApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdGet) | **GET** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지의 상세 정보를 조회합니다. 
*AgencyApi* | [**brandBrandIdAutoreplymsgAutoReplyMsgIdPut**](docs/AgencyApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdPut) | **PUT** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지의 정보를 업데이트합니다. 
*AgencyApi* | [**brandBrandIdAutoreplymsgFileFileIdGet**](docs/AgencyApi.md#brandBrandIdAutoreplymsgFileFileIdGet) | **GET** /brand/{brandId}/autoreplymsg/file/{fileId} | 자동응답메시지에서 사용할 이미지 파일 상세 정보를 조회합니다. 
*AgencyApi* | [**brandBrandIdAutoreplymsgFilePost**](docs/AgencyApi.md#brandBrandIdAutoreplymsgFilePost) | **POST** /brand/{brandId}/autoreplymsg/file | 자동응답메시지에서 사용할 이미지 파일을 등록합니다. 
*AgencyApi* | [**brandBrandIdAutoreplymsgGet**](docs/AgencyApi.md#brandBrandIdAutoreplymsgGet) | **GET** /brand/{brandId}/autoreplymsg | 브랜드 내에 등록된 자동응답메시지 목록을 조회합니다. 
*AgencyApi* | [**brandBrandIdAutoreplymsgPost**](docs/AgencyApi.md#brandBrandIdAutoreplymsgPost) | **POST** /brand/{brandId}/autoreplymsg | 브랜드에 자동응답메시지를 등록합니다. 
*AgencyApi* | [**brandBrandIdBidirectionalChatbotChatbotIdDelete**](docs/AgencyApi.md#brandBrandIdBidirectionalChatbotChatbotIdDelete) | **DELETE** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향)을 삭제합니다. 
*AgencyApi* | [**brandBrandIdBidirectionalChatbotChatbotIdGet**](docs/AgencyApi.md#brandBrandIdBidirectionalChatbotChatbotIdGet) | **GET** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향)의 상세 정보를 조회합니다. 
*AgencyApi* | [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete**](docs/AgencyApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete) | **DELETE** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방의 대화방메뉴를 삭제합니다. 
*AgencyApi* | [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut**](docs/AgencyApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut) | **PUT** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu/pause | 중계사만 사용이 가능하며, 양방향 대화방의 대화방메뉴 사용을 중지 또는 재개합니다. 
*AgencyApi* | [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost**](docs/AgencyApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost) | **POST** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방에 대화방메뉴를 등록합니다. 
*AgencyApi* | [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut**](docs/AgencyApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut) | **PUT** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방의 대화방메뉴를 수정합니다. 
*AgencyApi* | [**brandBrandIdBidirectionalChatbotChatbotIdPut**](docs/AgencyApi.md#brandBrandIdBidirectionalChatbotChatbotIdPut) | **PUT** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향) 정보를 수정 합니다. 
*AgencyApi* | [**brandBrandIdBidirectionalChatbotGet**](docs/AgencyApi.md#brandBrandIdBidirectionalChatbotGet) | **GET** /brand/{brandId}/bidirectional/chatbot | 브랜드에 등록된 대화방(양방향) 목록을 조회합니다. 
*AgencyApi* | [**brandBrandIdBidirectionalChatbotPost**](docs/AgencyApi.md#brandBrandIdBidirectionalChatbotPost) | **POST** /brand/{brandId}/bidirectional/chatbot | 대화방(양방향)을 등록합니다. 
*AgencyApi* | [**brandBrandIdChatbotChatbotIdCancelPut**](docs/AgencyApi.md#brandBrandIdChatbotChatbotIdCancelPut) | **PUT** /brand/{brandId}/chatbot/{chatbotId}/cancel | 지정된 대화방(발신번호, 양방향ID)의 승인요청을 취소합니다. 
*AgencyApi* | [**brandBrandIdChatbotChatbotIdDelete**](docs/AgencyApi.md#brandBrandIdChatbotChatbotIdDelete) | **DELETE** /brand/{brandId}/chatbot/{chatbotId} | 대화방(발신번호)을 삭제합니다. 
*AgencyApi* | [**brandBrandIdChatbotChatbotIdGet**](docs/AgencyApi.md#brandBrandIdChatbotChatbotIdGet) | **GET** /brand/{brandId}/chatbot/{chatbotId} | 지정된 대화방(발신번호)의 상세 정보를 조회합니다. 
*AgencyApi* | [**brandBrandIdChatbotChatbotIdPut**](docs/AgencyApi.md#brandBrandIdChatbotChatbotIdPut) | **PUT** /brand/{brandId}/chatbot/{chatbotId} | 지정된 대화방(발신번호)의 정보를 업데이트합니다. 
*AgencyApi* | [**brandBrandIdChatbotGet**](docs/AgencyApi.md#brandBrandIdChatbotGet) | **GET** /brand/{brandId}/chatbot | 브랜드 내에 등록된 대화방 목록을 조회합니다. 
*AgencyApi* | [**brandBrandIdChatbotPost**](docs/AgencyApi.md#brandBrandIdChatbotPost) | **POST** /brand/{brandId}/chatbot | 지정된 브랜드에 대화방(발신번호)을 등록합니다. 
*AgencyApi* | [**brandBrandIdLayoutGet**](docs/AgencyApi.md#brandBrandIdLayoutGet) | **GET** /brand/{brandId}/layout | 브랜드 별 등록된 레이아웃 목록을 조회합니다. 
*AgencyApi* | [**brandBrandIdLayoutLayoutIdDelete**](docs/AgencyApi.md#brandBrandIdLayoutLayoutIdDelete) | **DELETE** /brand/{brandId}/layout/{layoutId} | 브랜드 별 등록된 레이아웃을 삭제합니다. 
*AgencyApi* | [**brandBrandIdLayoutLayoutIdGet**](docs/AgencyApi.md#brandBrandIdLayoutLayoutIdGet) | **GET** /brand/{brandId}/layout/{layoutId} | 브랜드 별 등록된 레이아웃 목록을 조회합니다. 
*AgencyApi* | [**brandBrandIdLayoutLayoutIdPut**](docs/AgencyApi.md#brandBrandIdLayoutLayoutIdPut) | **PUT** /brand/{brandId}/layout/{layoutId} | 브랜드 내 레이아웃을 수정 합니다.   
*AgencyApi* | [**brandBrandIdLayoutPost**](docs/AgencyApi.md#brandBrandIdLayoutPost) | **POST** /brand/{brandId}/layout | 브랜드 내에서 사용할 수 있는 레이아웃을 등록 합니다.   
*AgencyApi* | [**brandBrandIdLogoFileIdCancelPut**](docs/AgencyApi.md#brandBrandIdLogoFileIdCancelPut) | **PUT** /brand/{brandId}/logo/{fileId}/cancel | 로고의 승인요청을 취소합니다. 
*AgencyApi* | [**brandBrandIdLogoFileIdDelete**](docs/AgencyApi.md#brandBrandIdLogoFileIdDelete) | **DELETE** /brand/{brandId}/logo/{fileId} | 브랜드에 등록된 승인 이전 상태의 로고를 삭제 합니다. 
*AgencyApi* | [**brandBrandIdLogoFileIdGet**](docs/AgencyApi.md#brandBrandIdLogoFileIdGet) | **GET** /brand/{brandId}/logo/{fileId} | 브랜드에 등록된 로고를 단건 상세 조회합니다. 
*AgencyApi* | [**brandBrandIdLogoFileIdPut**](docs/AgencyApi.md#brandBrandIdLogoFileIdPut) | **PUT** /brand/{brandId}/logo/{fileId} | 브랜드에 등록된 로고를 수정 승인요청 합니다. 
*AgencyApi* | [**brandBrandIdLogoGet**](docs/AgencyApi.md#brandBrandIdLogoGet) | **GET** /brand/{brandId}/logo | 브랜드 별 등록된 로고 목록을 조회합니다. 
*AgencyApi* | [**brandBrandIdLogoPost**](docs/AgencyApi.md#brandBrandIdLogoPost) | **POST** /brand/{brandId}/logo | 브랜드 내에서 사용할 수 있는 로고를 등록 합니다.   
*AgencyApi* | [**brandBrandIdMessagebaseGet**](docs/AgencyApi.md#brandBrandIdMessagebaseGet) | **GET** /brand/{brandId}/messagebase | 브랜드에 등록된 템플릿을 조회합니다. 
*AgencyApi* | [**brandBrandIdMessagebaseMessagebaseIdCancelPut**](docs/AgencyApi.md#brandBrandIdMessagebaseMessagebaseIdCancelPut) | **PUT** /brand/{brandId}/messagebase/{messagebaseId}/cancel | 지정된 템플릿의 승인요청을 취소합니다. 
*AgencyApi* | [**brandBrandIdMessagebaseMessagebaseIdDelete**](docs/AgencyApi.md#brandBrandIdMessagebaseMessagebaseIdDelete) | **DELETE** /brand/{brandId}/messagebase/{messagebaseId} | 브랜드 내 지정된 템플릿을 삭제합니다. 
*AgencyApi* | [**brandBrandIdMessagebaseMessagebaseIdGet**](docs/AgencyApi.md#brandBrandIdMessagebaseMessagebaseIdGet) | **GET** /brand/{brandId}/messagebase/{messagebaseId} | 브랜드에 등록된 지정 템플릿 상세 내역을 조회합니다. 
*AgencyApi* | [**brandBrandIdMessagebaseMessagebaseIdPut**](docs/AgencyApi.md#brandBrandIdMessagebaseMessagebaseIdPut) | **PUT** /brand/{brandId}/messagebase/{messagebaseId} | 지정 템플릿을 업데이트 합니다. 
*AgencyApi* | [**brandBrandIdMessagebasePost**](docs/AgencyApi.md#brandBrandIdMessagebasePost) | **POST** /brand/{brandId}/messagebase | 브랜드 내에서 사용할 구형 텍스트 템플릿을 등록합니다. 추가된 신규 템플릿 유형은 POST /brand/{brandId}/v2/messagebase 을 이용해야 합니다. 
*AgencyApi* | [**brandBrandIdV2MessagebaseFileFileIdGet**](docs/AgencyApi.md#brandBrandIdV2MessagebaseFileFileIdGet) | **GET** /brand/{brandId}/v2/messagebase/file/{fileId} | 이미지 템플릿 용으로 등록한 이미지 파일 정보를 조회 합니다. 
*AgencyApi* | [**brandBrandIdV2MessagebaseFilePost**](docs/AgencyApi.md#brandBrandIdV2MessagebaseFilePost) | **POST** /brand/{brandId}/v2/messagebase/file | 이미지 템플릿에서 사용할 이미지 파일을 등록합니다. 
*AgencyApi* | [**brandBrandIdV2MessagebaseMessagebaseIdPut**](docs/AgencyApi.md#brandBrandIdV2MessagebaseMessagebaseIdPut) | **PUT** /brand/{brandId}/v2/messagebase/{messagebaseId} | 이미 등록된 템플릿의 내용을 수정합니다. 
*AgencyApi* | [**brandBrandIdV2MessagebasePost**](docs/AgencyApi.md#brandBrandIdV2MessagebasePost) | **POST** /brand/{brandId}/v2/messagebase | 브랜드 내에서 사용할 템플릿을 등록합니다.   Openrichcard 규격의 모든 템플릿 등록이 가능합니다. 
*AgencyApi* | [**logoCommonGet**](docs/AgencyApi.md#logoCommonGet) | **GET** /logo/common | RBC에서 제공되는 기본 아이콘 이미지 정보를 조회합니다. 
*AgencyApi* | [**messagebaseCommonGet**](docs/AgencyApi.md#messagebaseCommonGet) | **GET** /messagebase/common | 이통사가 기본 제공하는 공통템플릿을 조회합니다. 
*AgencyApi* | [**messagebaseCommonMessagebaseIdGet**](docs/AgencyApi.md#messagebaseCommonMessagebaseIdGet) | **GET** /messagebase/common/{messagebaseId} | 이통사가 기본 제공하는 공통템플릿 별 상세 내용을 조회합니다. 
*AgencyApi* | [**messagebaseMessagebaseformGet**](docs/AgencyApi.md#messagebaseMessagebaseformGet) | **GET** /messagebase/messagebaseform | 템플릿 양식 목록을 조회합니다. 
*AgencyApi* | [**messagebaseMessagebaseformMessagebaseformIdGet**](docs/AgencyApi.md#messagebaseMessagebaseformMessagebaseformIdGet) | **GET** /messagebase/messagebaseform/{messagebaseformId} | 템플릿 유형의 상세 내용을 조회합니다. 
*AgencyApi* | [**messagebaseMessagebaseformMessagebaseformIdLogoGet**](docs/AgencyApi.md#messagebaseMessagebaseformMessagebaseformIdLogoGet) | **GET** /messagebase/messagebaseform/{messagebaseformId}/logo | RBC에서 템플릿용으로 제공되는 기본 로고 이미지 정보를 조회합니다. 
*AgencyApi* | [**statQueryBrandprofileBrandIdGet**](docs/AgencyApi.md#statQueryBrandprofileBrandIdGet) | **GET** /statQuery/brandprofile/{brandId} | (준비중) 브랜드프로필 노출 통계를 조회합니다. 
*AgencyApi* | [**statQueryMessageBrandIdGet**](docs/AgencyApi.md#statQueryMessageBrandIdGet) | **GET** /statQuery/message/{brandId} | 고객반응 통계 - 캠페인 메시지 발송/읽음확인 통계를 조회합니다. 
*AgencyApi* | [**statQueryMessageButtonBrandIdGet**](docs/AgencyApi.md#statQueryMessageButtonBrandIdGet) | **GET** /statQuery/messageButton/{brandId} | 고객반응 통계 - 캠페인 메시지 버튼 클릭 통계를 조회합니다. 
*AgencyApi* | [**statQueryPersistentMenuBrandIdGet**](docs/AgencyApi.md#statQueryPersistentMenuBrandIdGet) | **GET** /statQuery/persistentMenu/{brandId} | 고객반응 통계 - 대화방 메뉴 클릭 통계를 조회합니다. 
*AgencyApi* | [**usableQueryChatbotIdChatbotIdGet**](docs/AgencyApi.md#usableQueryChatbotIdChatbotIdGet) | **GET** /usableQuery/chatbotId/{chatbotId} | 대화방ID 등록 가능 여부를 조회 합니다. 
*AgencyApi* | [**webhookUrlBidirectionalPost**](docs/AgencyApi.md#webhookUrlBidirectionalPost) | **POST** /{webhookUrl}/bidirectional | 양방향 서비스 제공 중계사에서 구현해야 하는 Webhook URI 입니다. 
*AgencyApi* | [**webhookUrlPost**](docs/AgencyApi.md#webhookUrlPost) | **POST** /{webhookUrl} | 대행사에서 등록한 수신서버 URL을 통해 RBC에서 발생하는 데이터의 등록/수정/삭제 이벤트 정보를 전달합니다. 
*AutoreplymsgApi* | [**brandBrandIdAutoreplymsgAutoReplyMsgIdDelete**](docs/AutoreplymsgApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdDelete) | **DELETE** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지를 삭제합니다. 
*AutoreplymsgApi* | [**brandBrandIdAutoreplymsgAutoReplyMsgIdGet**](docs/AutoreplymsgApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdGet) | **GET** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지의 상세 정보를 조회합니다. 
*AutoreplymsgApi* | [**brandBrandIdAutoreplymsgAutoReplyMsgIdPut**](docs/AutoreplymsgApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdPut) | **PUT** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지의 정보를 업데이트합니다. 
*AutoreplymsgApi* | [**brandBrandIdAutoreplymsgFileFileIdGet**](docs/AutoreplymsgApi.md#brandBrandIdAutoreplymsgFileFileIdGet) | **GET** /brand/{brandId}/autoreplymsg/file/{fileId} | 자동응답메시지에서 사용할 이미지 파일 상세 정보를 조회합니다. 
*AutoreplymsgApi* | [**brandBrandIdAutoreplymsgFilePost**](docs/AutoreplymsgApi.md#brandBrandIdAutoreplymsgFilePost) | **POST** /brand/{brandId}/autoreplymsg/file | 자동응답메시지에서 사용할 이미지 파일을 등록합니다. 
*AutoreplymsgApi* | [**brandBrandIdAutoreplymsgGet**](docs/AutoreplymsgApi.md#brandBrandIdAutoreplymsgGet) | **GET** /brand/{brandId}/autoreplymsg | 브랜드 내에 등록된 자동응답메시지 목록을 조회합니다. 
*AutoreplymsgApi* | [**brandBrandIdAutoreplymsgPost**](docs/AutoreplymsgApi.md#brandBrandIdAutoreplymsgPost) | **POST** /brand/{brandId}/autoreplymsg | 브랜드에 자동응답메시지를 등록합니다. 
*BidirectionalApi* | [**brandBrandIdAutoreplymsgAutoReplyMsgIdDelete**](docs/BidirectionalApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdDelete) | **DELETE** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지를 삭제합니다. 
*BidirectionalApi* | [**brandBrandIdAutoreplymsgAutoReplyMsgIdGet**](docs/BidirectionalApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdGet) | **GET** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지의 상세 정보를 조회합니다. 
*BidirectionalApi* | [**brandBrandIdAutoreplymsgAutoReplyMsgIdPut**](docs/BidirectionalApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdPut) | **PUT** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지의 정보를 업데이트합니다. 
*BidirectionalApi* | [**brandBrandIdAutoreplymsgFileFileIdGet**](docs/BidirectionalApi.md#brandBrandIdAutoreplymsgFileFileIdGet) | **GET** /brand/{brandId}/autoreplymsg/file/{fileId} | 자동응답메시지에서 사용할 이미지 파일 상세 정보를 조회합니다. 
*BidirectionalApi* | [**brandBrandIdAutoreplymsgFilePost**](docs/BidirectionalApi.md#brandBrandIdAutoreplymsgFilePost) | **POST** /brand/{brandId}/autoreplymsg/file | 자동응답메시지에서 사용할 이미지 파일을 등록합니다. 
*BidirectionalApi* | [**brandBrandIdAutoreplymsgGet**](docs/BidirectionalApi.md#brandBrandIdAutoreplymsgGet) | **GET** /brand/{brandId}/autoreplymsg | 브랜드 내에 등록된 자동응답메시지 목록을 조회합니다. 
*BidirectionalApi* | [**brandBrandIdAutoreplymsgPost**](docs/BidirectionalApi.md#brandBrandIdAutoreplymsgPost) | **POST** /brand/{brandId}/autoreplymsg | 브랜드에 자동응답메시지를 등록합니다. 
*BidirectionalApi* | [**brandBrandIdBidirectionalChatbotChatbotIdDelete**](docs/BidirectionalApi.md#brandBrandIdBidirectionalChatbotChatbotIdDelete) | **DELETE** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향)을 삭제합니다. 
*BidirectionalApi* | [**brandBrandIdBidirectionalChatbotChatbotIdGet**](docs/BidirectionalApi.md#brandBrandIdBidirectionalChatbotChatbotIdGet) | **GET** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향)의 상세 정보를 조회합니다. 
*BidirectionalApi* | [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete**](docs/BidirectionalApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete) | **DELETE** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방의 대화방메뉴를 삭제합니다. 
*BidirectionalApi* | [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost**](docs/BidirectionalApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost) | **POST** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방에 대화방메뉴를 등록합니다. 
*BidirectionalApi* | [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut**](docs/BidirectionalApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut) | **PUT** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방의 대화방메뉴를 수정합니다. 
*BidirectionalApi* | [**brandBrandIdBidirectionalChatbotChatbotIdPut**](docs/BidirectionalApi.md#brandBrandIdBidirectionalChatbotChatbotIdPut) | **PUT** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향) 정보를 수정 합니다. 
*BidirectionalApi* | [**brandBrandIdBidirectionalChatbotGet**](docs/BidirectionalApi.md#brandBrandIdBidirectionalChatbotGet) | **GET** /brand/{brandId}/bidirectional/chatbot | 브랜드에 등록된 대화방(양방향) 목록을 조회합니다. 
*BidirectionalApi* | [**brandBrandIdBidirectionalChatbotPost**](docs/BidirectionalApi.md#brandBrandIdBidirectionalChatbotPost) | **POST** /brand/{brandId}/bidirectional/chatbot | 대화방(양방향)을 등록합니다. 
*BidirectionalApi* | [**brandBrandIdChatbotChatbotIdCancelPut**](docs/BidirectionalApi.md#brandBrandIdChatbotChatbotIdCancelPut) | **PUT** /brand/{brandId}/chatbot/{chatbotId}/cancel | 지정된 대화방(발신번호, 양방향ID)의 승인요청을 취소합니다. 
*BidirectionalApi* | [**webhookUrlBidirectionalPost**](docs/BidirectionalApi.md#webhookUrlBidirectionalPost) | **POST** /{webhookUrl}/bidirectional | 양방향 서비스 제공 중계사에서 구현해야 하는 Webhook URI 입니다. 
*ChatbotApi* | [**brandBrandIdAutoreplymsgAutoReplyMsgIdDelete**](docs/ChatbotApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdDelete) | **DELETE** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지를 삭제합니다. 
*ChatbotApi* | [**brandBrandIdAutoreplymsgAutoReplyMsgIdGet**](docs/ChatbotApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdGet) | **GET** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지의 상세 정보를 조회합니다. 
*ChatbotApi* | [**brandBrandIdAutoreplymsgAutoReplyMsgIdPut**](docs/ChatbotApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdPut) | **PUT** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지의 정보를 업데이트합니다. 
*ChatbotApi* | [**brandBrandIdAutoreplymsgFileFileIdGet**](docs/ChatbotApi.md#brandBrandIdAutoreplymsgFileFileIdGet) | **GET** /brand/{brandId}/autoreplymsg/file/{fileId} | 자동응답메시지에서 사용할 이미지 파일 상세 정보를 조회합니다. 
*ChatbotApi* | [**brandBrandIdAutoreplymsgFilePost**](docs/ChatbotApi.md#brandBrandIdAutoreplymsgFilePost) | **POST** /brand/{brandId}/autoreplymsg/file | 자동응답메시지에서 사용할 이미지 파일을 등록합니다. 
*ChatbotApi* | [**brandBrandIdAutoreplymsgGet**](docs/ChatbotApi.md#brandBrandIdAutoreplymsgGet) | **GET** /brand/{brandId}/autoreplymsg | 브랜드 내에 등록된 자동응답메시지 목록을 조회합니다. 
*ChatbotApi* | [**brandBrandIdAutoreplymsgPost**](docs/ChatbotApi.md#brandBrandIdAutoreplymsgPost) | **POST** /brand/{brandId}/autoreplymsg | 브랜드에 자동응답메시지를 등록합니다. 
*ChatbotApi* | [**brandBrandIdBidirectionalChatbotChatbotIdDelete**](docs/ChatbotApi.md#brandBrandIdBidirectionalChatbotChatbotIdDelete) | **DELETE** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향)을 삭제합니다. 
*ChatbotApi* | [**brandBrandIdBidirectionalChatbotChatbotIdGet**](docs/ChatbotApi.md#brandBrandIdBidirectionalChatbotChatbotIdGet) | **GET** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향)의 상세 정보를 조회합니다. 
*ChatbotApi* | [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete**](docs/ChatbotApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete) | **DELETE** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방의 대화방메뉴를 삭제합니다. 
*ChatbotApi* | [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost**](docs/ChatbotApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost) | **POST** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방에 대화방메뉴를 등록합니다. 
*ChatbotApi* | [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut**](docs/ChatbotApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut) | **PUT** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방의 대화방메뉴를 수정합니다. 
*ChatbotApi* | [**brandBrandIdBidirectionalChatbotChatbotIdPut**](docs/ChatbotApi.md#brandBrandIdBidirectionalChatbotChatbotIdPut) | **PUT** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향) 정보를 수정 합니다. 
*ChatbotApi* | [**brandBrandIdBidirectionalChatbotGet**](docs/ChatbotApi.md#brandBrandIdBidirectionalChatbotGet) | **GET** /brand/{brandId}/bidirectional/chatbot | 브랜드에 등록된 대화방(양방향) 목록을 조회합니다. 
*ChatbotApi* | [**brandBrandIdBidirectionalChatbotPost**](docs/ChatbotApi.md#brandBrandIdBidirectionalChatbotPost) | **POST** /brand/{brandId}/bidirectional/chatbot | 대화방(양방향)을 등록합니다. 
*ChatbotApi* | [**brandBrandIdChatbotChatbotIdCancelPut**](docs/ChatbotApi.md#brandBrandIdChatbotChatbotIdCancelPut) | **PUT** /brand/{brandId}/chatbot/{chatbotId}/cancel | 지정된 대화방(발신번호, 양방향ID)의 승인요청을 취소합니다. 
*ChatbotApi* | [**brandBrandIdChatbotChatbotIdDelete**](docs/ChatbotApi.md#brandBrandIdChatbotChatbotIdDelete) | **DELETE** /brand/{brandId}/chatbot/{chatbotId} | 대화방(발신번호)을 삭제합니다. 
*ChatbotApi* | [**brandBrandIdChatbotChatbotIdGet**](docs/ChatbotApi.md#brandBrandIdChatbotChatbotIdGet) | **GET** /brand/{brandId}/chatbot/{chatbotId} | 지정된 대화방(발신번호)의 상세 정보를 조회합니다. 
*ChatbotApi* | [**brandBrandIdChatbotChatbotIdPut**](docs/ChatbotApi.md#brandBrandIdChatbotChatbotIdPut) | **PUT** /brand/{brandId}/chatbot/{chatbotId} | 지정된 대화방(발신번호)의 정보를 업데이트합니다. 
*ChatbotApi* | [**brandBrandIdChatbotGet**](docs/ChatbotApi.md#brandBrandIdChatbotGet) | **GET** /brand/{brandId}/chatbot | 브랜드 내에 등록된 대화방 목록을 조회합니다. 
*ChatbotApi* | [**brandBrandIdChatbotPost**](docs/ChatbotApi.md#brandBrandIdChatbotPost) | **POST** /brand/{brandId}/chatbot | 지정된 브랜드에 대화방(발신번호)을 등록합니다. 
*CorporationApi* | [**brandBrandIdAutoreplymsgAutoReplyMsgIdDelete**](docs/CorporationApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdDelete) | **DELETE** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지를 삭제합니다. 
*CorporationApi* | [**brandBrandIdAutoreplymsgAutoReplyMsgIdGet**](docs/CorporationApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdGet) | **GET** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지의 상세 정보를 조회합니다. 
*CorporationApi* | [**brandBrandIdAutoreplymsgAutoReplyMsgIdPut**](docs/CorporationApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdPut) | **PUT** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지의 정보를 업데이트합니다. 
*CorporationApi* | [**brandBrandIdAutoreplymsgFileFileIdGet**](docs/CorporationApi.md#brandBrandIdAutoreplymsgFileFileIdGet) | **GET** /brand/{brandId}/autoreplymsg/file/{fileId} | 자동응답메시지에서 사용할 이미지 파일 상세 정보를 조회합니다. 
*CorporationApi* | [**brandBrandIdAutoreplymsgFilePost**](docs/CorporationApi.md#brandBrandIdAutoreplymsgFilePost) | **POST** /brand/{brandId}/autoreplymsg/file | 자동응답메시지에서 사용할 이미지 파일을 등록합니다. 
*CorporationApi* | [**brandBrandIdAutoreplymsgGet**](docs/CorporationApi.md#brandBrandIdAutoreplymsgGet) | **GET** /brand/{brandId}/autoreplymsg | 브랜드 내에 등록된 자동응답메시지 목록을 조회합니다. 
*CorporationApi* | [**brandBrandIdAutoreplymsgPost**](docs/CorporationApi.md#brandBrandIdAutoreplymsgPost) | **POST** /brand/{brandId}/autoreplymsg | 브랜드에 자동응답메시지를 등록합니다. 
*CorporationApi* | [**brandBrandIdBidirectionalChatbotChatbotIdDelete**](docs/CorporationApi.md#brandBrandIdBidirectionalChatbotChatbotIdDelete) | **DELETE** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향)을 삭제합니다. 
*CorporationApi* | [**brandBrandIdBidirectionalChatbotChatbotIdGet**](docs/CorporationApi.md#brandBrandIdBidirectionalChatbotChatbotIdGet) | **GET** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향)의 상세 정보를 조회합니다. 
*CorporationApi* | [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete**](docs/CorporationApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete) | **DELETE** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방의 대화방메뉴를 삭제합니다. 
*CorporationApi* | [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost**](docs/CorporationApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost) | **POST** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방에 대화방메뉴를 등록합니다. 
*CorporationApi* | [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut**](docs/CorporationApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut) | **PUT** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방의 대화방메뉴를 수정합니다. 
*CorporationApi* | [**brandBrandIdBidirectionalChatbotChatbotIdPut**](docs/CorporationApi.md#brandBrandIdBidirectionalChatbotChatbotIdPut) | **PUT** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향) 정보를 수정 합니다. 
*CorporationApi* | [**brandBrandIdBidirectionalChatbotGet**](docs/CorporationApi.md#brandBrandIdBidirectionalChatbotGet) | **GET** /brand/{brandId}/bidirectional/chatbot | 브랜드에 등록된 대화방(양방향) 목록을 조회합니다. 
*CorporationApi* | [**brandBrandIdBidirectionalChatbotPost**](docs/CorporationApi.md#brandBrandIdBidirectionalChatbotPost) | **POST** /brand/{brandId}/bidirectional/chatbot | 대화방(양방향)을 등록합니다. 
*CorporationApi* | [**brandBrandIdChatbotChatbotIdCancelPut**](docs/CorporationApi.md#brandBrandIdChatbotChatbotIdCancelPut) | **PUT** /brand/{brandId}/chatbot/{chatbotId}/cancel | 지정된 대화방(발신번호, 양방향ID)의 승인요청을 취소합니다. 
*CorporationApi* | [**brandBrandIdChatbotChatbotIdDelete**](docs/CorporationApi.md#brandBrandIdChatbotChatbotIdDelete) | **DELETE** /brand/{brandId}/chatbot/{chatbotId} | 대화방(발신번호)을 삭제합니다. 
*CorporationApi* | [**brandBrandIdChatbotChatbotIdGet**](docs/CorporationApi.md#brandBrandIdChatbotChatbotIdGet) | **GET** /brand/{brandId}/chatbot/{chatbotId} | 지정된 대화방(발신번호)의 상세 정보를 조회합니다. 
*CorporationApi* | [**brandBrandIdChatbotChatbotIdPut**](docs/CorporationApi.md#brandBrandIdChatbotChatbotIdPut) | **PUT** /brand/{brandId}/chatbot/{chatbotId} | 지정된 대화방(발신번호)의 정보를 업데이트합니다. 
*CorporationApi* | [**brandBrandIdChatbotGet**](docs/CorporationApi.md#brandBrandIdChatbotGet) | **GET** /brand/{brandId}/chatbot | 브랜드 내에 등록된 대화방 목록을 조회합니다. 
*CorporationApi* | [**brandBrandIdChatbotPost**](docs/CorporationApi.md#brandBrandIdChatbotPost) | **POST** /brand/{brandId}/chatbot | 지정된 브랜드에 대화방(발신번호)을 등록합니다. 
*CorporationApi* | [**brandBrandIdLogoFileIdCancelPut**](docs/CorporationApi.md#brandBrandIdLogoFileIdCancelPut) | **PUT** /brand/{brandId}/logo/{fileId}/cancel | 로고의 승인요청을 취소합니다. 
*CorporationApi* | [**brandBrandIdLogoFileIdDelete**](docs/CorporationApi.md#brandBrandIdLogoFileIdDelete) | **DELETE** /brand/{brandId}/logo/{fileId} | 브랜드에 등록된 승인 이전 상태의 로고를 삭제 합니다. 
*CorporationApi* | [**brandBrandIdLogoFileIdGet**](docs/CorporationApi.md#brandBrandIdLogoFileIdGet) | **GET** /brand/{brandId}/logo/{fileId} | 브랜드에 등록된 로고를 단건 상세 조회합니다. 
*CorporationApi* | [**brandBrandIdLogoFileIdPut**](docs/CorporationApi.md#brandBrandIdLogoFileIdPut) | **PUT** /brand/{brandId}/logo/{fileId} | 브랜드에 등록된 로고를 수정 승인요청 합니다. 
*CorporationApi* | [**brandBrandIdLogoGet**](docs/CorporationApi.md#brandBrandIdLogoGet) | **GET** /brand/{brandId}/logo | 브랜드 별 등록된 로고 목록을 조회합니다. 
*CorporationApi* | [**brandBrandIdLogoPost**](docs/CorporationApi.md#brandBrandIdLogoPost) | **POST** /brand/{brandId}/logo | 브랜드 내에서 사용할 수 있는 로고를 등록 합니다.   
*CorporationApi* | [**brandBrandIdMessagebaseGet**](docs/CorporationApi.md#brandBrandIdMessagebaseGet) | **GET** /brand/{brandId}/messagebase | 브랜드에 등록된 템플릿을 조회합니다. 
*CorporationApi* | [**brandBrandIdMessagebaseMessagebaseIdCancelPut**](docs/CorporationApi.md#brandBrandIdMessagebaseMessagebaseIdCancelPut) | **PUT** /brand/{brandId}/messagebase/{messagebaseId}/cancel | 지정된 템플릿의 승인요청을 취소합니다. 
*CorporationApi* | [**brandBrandIdMessagebaseMessagebaseIdDelete**](docs/CorporationApi.md#brandBrandIdMessagebaseMessagebaseIdDelete) | **DELETE** /brand/{brandId}/messagebase/{messagebaseId} | 브랜드 내 지정된 템플릿을 삭제합니다. 
*CorporationApi* | [**brandBrandIdMessagebaseMessagebaseIdGet**](docs/CorporationApi.md#brandBrandIdMessagebaseMessagebaseIdGet) | **GET** /brand/{brandId}/messagebase/{messagebaseId} | 브랜드에 등록된 지정 템플릿 상세 내역을 조회합니다. 
*CorporationApi* | [**brandBrandIdMessagebaseMessagebaseIdPut**](docs/CorporationApi.md#brandBrandIdMessagebaseMessagebaseIdPut) | **PUT** /brand/{brandId}/messagebase/{messagebaseId} | 지정 템플릿을 업데이트 합니다. 
*CorporationApi* | [**brandBrandIdMessagebasePost**](docs/CorporationApi.md#brandBrandIdMessagebasePost) | **POST** /brand/{brandId}/messagebase | 브랜드 내에서 사용할 구형 텍스트 템플릿을 등록합니다. 추가된 신규 템플릿 유형은 POST /brand/{brandId}/v2/messagebase 을 이용해야 합니다. 
*CorporationApi* | [**brandBrandIdV2MessagebaseFileFileIdGet**](docs/CorporationApi.md#brandBrandIdV2MessagebaseFileFileIdGet) | **GET** /brand/{brandId}/v2/messagebase/file/{fileId} | 이미지 템플릿 용으로 등록한 이미지 파일 정보를 조회 합니다. 
*CorporationApi* | [**brandBrandIdV2MessagebaseFilePost**](docs/CorporationApi.md#brandBrandIdV2MessagebaseFilePost) | **POST** /brand/{brandId}/v2/messagebase/file | 이미지 템플릿에서 사용할 이미지 파일을 등록합니다. 
*CorporationApi* | [**brandBrandIdV2MessagebaseMessagebaseIdPut**](docs/CorporationApi.md#brandBrandIdV2MessagebaseMessagebaseIdPut) | **PUT** /brand/{brandId}/v2/messagebase/{messagebaseId} | 이미 등록된 템플릿의 내용을 수정합니다. 
*CorporationApi* | [**brandBrandIdV2MessagebasePost**](docs/CorporationApi.md#brandBrandIdV2MessagebasePost) | **POST** /brand/{brandId}/v2/messagebase | 브랜드 내에서 사용할 템플릿을 등록합니다.   Openrichcard 규격의 모든 템플릿 등록이 가능합니다. 
*CorporationApi* | [**corpBrandBrandIdCancelPut**](docs/CorporationApi.md#corpBrandBrandIdCancelPut) | **PUT** /corp/brand/{brandId}/cancel | 신규 개설한 승인대기 중인 브랜드의 승인요청을 취소합니다.   
*CorporationApi* | [**corpBrandBrandIdDelete**](docs/CorporationApi.md#corpBrandBrandIdDelete) | **DELETE** /corp/brand/{brandId} | 마스터 계정을 이용하여 승인 이력이 없는 신규 개설 브랜드 삭제를 요청합니다. 
*CorporationApi* | [**corpBrandBrandIdPut**](docs/CorporationApi.md#corpBrandBrandIdPut) | **PUT** /corp/brand/{brandId} | RBC 웹에서 임시저장으로 등록한 브랜드 또는 신규 브랜드 등록 검수 시 반려된 경우 브랜드 수정 후 승인요청 시 사용합니다. 
*CorporationApi* | [**corpBrandCategoriesGet**](docs/CorporationApi.md#corpBrandCategoriesGet) | **GET** /corp/brand/categories | 브랜드 등록 시 사용 가능한 카테고리 목록을 조회합니다.  
*CorporationApi* | [**corpBrandPost**](docs/CorporationApi.md#corpBrandPost) | **POST** /corp/brand | 마스터, 매니저 계정을 이용하여 신규 브랜드 등록 승인을 요청합니다. 
*CorporationApi* | [**corpPersonIdBrandBrandIdCancelPut**](docs/CorporationApi.md#corpPersonIdBrandBrandIdCancelPut) | **PUT** /corp/{personId}/brand/{brandId}/cancel | 승인대기 중인 브랜드의 승인요청을 취소합니다.   
*CorporationApi* | [**corpPersonIdBrandBrandIdDelete**](docs/CorporationApi.md#corpPersonIdBrandBrandIdDelete) | **DELETE** /corp/{personId}/brand/{brandId} | 브랜드를 삭제합니다. 
*CorporationApi* | [**corpPersonIdBrandBrandIdGet**](docs/CorporationApi.md#corpPersonIdBrandBrandIdGet) | **GET** /corp/{personId}/brand/{brandId} | 브랜드 상세 정보를 조회합니다. 
*CorporationApi* | [**corpPersonIdBrandBrandIdPrivilegeGet**](docs/CorporationApi.md#corpPersonIdBrandBrandIdPrivilegeGet) | **GET** /corp/{personId}/brand/{brandId}/privilege | 브랜드에 등록된 운영 권한 정보를 조회합니다. 
*CorporationApi* | [**corpPersonIdBrandBrandIdPrivilegeIdDelete**](docs/CorporationApi.md#corpPersonIdBrandBrandIdPrivilegeIdDelete) | **DELETE** /corp/{personId}/brand/{brandId}/privilege/{id} | 브랜드 운영자 권한 중 지정한 대상을 삭제합니다. 
*CorporationApi* | [**corpPersonIdBrandBrandIdPrivilegePost**](docs/CorporationApi.md#corpPersonIdBrandBrandIdPrivilegePost) | **POST** /corp/{personId}/brand/{brandId}/privilege | 브랜드 대표운영자가 브랜드 내 운영자(기업의 마스터/매니저, 대행사) 권한을 부여 합니다. 
*CorporationApi* | [**corpPersonIdBrandBrandIdPrivilegePut**](docs/CorporationApi.md#corpPersonIdBrandBrandIdPrivilegePut) | **PUT** /corp/{personId}/brand/{brandId}/privilege | 브랜드 대표운영자 권한을 위임합니다. 
*CorporationApi* | [**corpPersonIdBrandBrandIdPut**](docs/CorporationApi.md#corpPersonIdBrandBrandIdPut) | **PUT** /corp/{personId}/brand/{brandId} | 현재 운영 중인 브랜드 정보를 수정 합니다. 브랜드명, 프로필 이미지가 수정되면 다시 승인을 받아야 합니다. 
*CorporationApi* | [**corpPersonIdBrandGet**](docs/CorporationApi.md#corpPersonIdBrandGet) | **GET** /corp/{personId}/brand | 마스터 또는 매니저 계정으로 운영 권한이 있는 브랜드 목록을 조회합니다. 
*CorporationApi* | [**logoCommonGet**](docs/CorporationApi.md#logoCommonGet) | **GET** /logo/common | RBC에서 제공되는 기본 아이콘 이미지 정보를 조회합니다. 
*CorporationApi* | [**messagebaseCommonGet**](docs/CorporationApi.md#messagebaseCommonGet) | **GET** /messagebase/common | 이통사가 기본 제공하는 공통템플릿을 조회합니다. 
*CorporationApi* | [**messagebaseCommonMessagebaseIdGet**](docs/CorporationApi.md#messagebaseCommonMessagebaseIdGet) | **GET** /messagebase/common/{messagebaseId} | 이통사가 기본 제공하는 공통템플릿 별 상세 내용을 조회합니다. 
*CorporationApi* | [**messagebaseMessagebaseformGet**](docs/CorporationApi.md#messagebaseMessagebaseformGet) | **GET** /messagebase/messagebaseform | 템플릿 양식 목록을 조회합니다. 
*CorporationApi* | [**messagebaseMessagebaseformMessagebaseformIdGet**](docs/CorporationApi.md#messagebaseMessagebaseformMessagebaseformIdGet) | **GET** /messagebase/messagebaseform/{messagebaseformId} | 템플릿 유형의 상세 내용을 조회합니다. 
*CorporationApi* | [**messagebaseMessagebaseformMessagebaseformIdLogoGet**](docs/CorporationApi.md#messagebaseMessagebaseformMessagebaseformIdLogoGet) | **GET** /messagebase/messagebaseform/{messagebaseformId}/logo | RBC에서 템플릿용으로 제공되는 기본 로고 이미지 정보를 조회합니다. 
*CorporationApi* | [**statQueryBrandprofileBrandIdGet**](docs/CorporationApi.md#statQueryBrandprofileBrandIdGet) | **GET** /statQuery/brandprofile/{brandId} | (준비중) 브랜드프로필 노출 통계를 조회합니다. 
*CorporationApi* | [**statQueryMessageBrandIdGet**](docs/CorporationApi.md#statQueryMessageBrandIdGet) | **GET** /statQuery/message/{brandId} | 고객반응 통계 - 캠페인 메시지 발송/읽음확인 통계를 조회합니다. 
*CorporationApi* | [**statQueryMessageButtonBrandIdGet**](docs/CorporationApi.md#statQueryMessageButtonBrandIdGet) | **GET** /statQuery/messageButton/{brandId} | 고객반응 통계 - 캠페인 메시지 버튼 클릭 통계를 조회합니다. 
*CorporationApi* | [**statQueryPersistentMenuBrandIdGet**](docs/CorporationApi.md#statQueryPersistentMenuBrandIdGet) | **GET** /statQuery/persistentMenu/{brandId} | 고객반응 통계 - 대화방 메뉴 클릭 통계를 조회합니다. 
*CorporationApi* | [**usableQueryChatbotIdChatbotIdGet**](docs/CorporationApi.md#usableQueryChatbotIdChatbotIdGet) | **GET** /usableQuery/chatbotId/{chatbotId} | 대화방ID 등록 가능 여부를 조회 합니다. 
*LayoutApi* | [**baselayoutComponentGet**](docs/LayoutApi.md#baselayoutComponentGet) | **GET** /baselayout/component | 레이아웃 등록/수정 시 사용 가능한 컴포넌트 목록을 조회 합니다. 
*LayoutApi* | [**baselayoutProductRuleGet**](docs/LayoutApi.md#baselayoutProductRuleGet) | **GET** /baselayout/product/rule | 메시지 상품별 레이아웃 구성 규칙을 조회합니다. 
*LayoutApi* | [**baselayoutSampleGet**](docs/LayoutApi.md#baselayoutSampleGet) | **GET** /baselayout/sample | 레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 목록 입니다. 
*LayoutApi* | [**baselayoutSampleSampleLayoutIdGet**](docs/LayoutApi.md#baselayoutSampleSampleLayoutIdGet) | **GET** /baselayout/sample/{sampleLayoutId} | 레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 상세 정보를 조회합니다. 
*LayoutApi* | [**brandBrandIdLayoutGet**](docs/LayoutApi.md#brandBrandIdLayoutGet) | **GET** /brand/{brandId}/layout | 브랜드 별 등록된 레이아웃 목록을 조회합니다. 
*LayoutApi* | [**brandBrandIdLayoutLayoutIdDelete**](docs/LayoutApi.md#brandBrandIdLayoutLayoutIdDelete) | **DELETE** /brand/{brandId}/layout/{layoutId} | 브랜드 별 등록된 레이아웃을 삭제합니다. 
*LayoutApi* | [**brandBrandIdLayoutLayoutIdGet**](docs/LayoutApi.md#brandBrandIdLayoutLayoutIdGet) | **GET** /brand/{brandId}/layout/{layoutId} | 브랜드 별 등록된 레이아웃 목록을 조회합니다. 
*LayoutApi* | [**brandBrandIdLayoutLayoutIdPut**](docs/LayoutApi.md#brandBrandIdLayoutLayoutIdPut) | **PUT** /brand/{brandId}/layout/{layoutId} | 브랜드 내 레이아웃을 수정 합니다.   
*LayoutApi* | [**brandBrandIdLayoutPost**](docs/LayoutApi.md#brandBrandIdLayoutPost) | **POST** /brand/{brandId}/layout | 브랜드 내에서 사용할 수 있는 레이아웃을 등록 합니다.   
*LogoApi* | [**brandBrandIdLogoFileIdCancelPut**](docs/LogoApi.md#brandBrandIdLogoFileIdCancelPut) | **PUT** /brand/{brandId}/logo/{fileId}/cancel | 로고의 승인요청을 취소합니다. 
*LogoApi* | [**brandBrandIdLogoFileIdDelete**](docs/LogoApi.md#brandBrandIdLogoFileIdDelete) | **DELETE** /brand/{brandId}/logo/{fileId} | 브랜드에 등록된 승인 이전 상태의 로고를 삭제 합니다. 
*LogoApi* | [**brandBrandIdLogoFileIdGet**](docs/LogoApi.md#brandBrandIdLogoFileIdGet) | **GET** /brand/{brandId}/logo/{fileId} | 브랜드에 등록된 로고를 단건 상세 조회합니다. 
*LogoApi* | [**brandBrandIdLogoFileIdPut**](docs/LogoApi.md#brandBrandIdLogoFileIdPut) | **PUT** /brand/{brandId}/logo/{fileId} | 브랜드에 등록된 로고를 수정 승인요청 합니다. 
*LogoApi* | [**brandBrandIdLogoGet**](docs/LogoApi.md#brandBrandIdLogoGet) | **GET** /brand/{brandId}/logo | 브랜드 별 등록된 로고 목록을 조회합니다. 
*LogoApi* | [**brandBrandIdLogoPost**](docs/LogoApi.md#brandBrandIdLogoPost) | **POST** /brand/{brandId}/logo | 브랜드 내에서 사용할 수 있는 로고를 등록 합니다.   
*LogoApi* | [**logoCommonGet**](docs/LogoApi.md#logoCommonGet) | **GET** /logo/common | RBC에서 제공되는 기본 아이콘 이미지 정보를 조회합니다. 
*MessagebaseApi* | [**brandBrandIdMessagebaseGet**](docs/MessagebaseApi.md#brandBrandIdMessagebaseGet) | **GET** /brand/{brandId}/messagebase | 브랜드에 등록된 템플릿을 조회합니다. 
*MessagebaseApi* | [**brandBrandIdMessagebaseMessagebaseIdCancelPut**](docs/MessagebaseApi.md#brandBrandIdMessagebaseMessagebaseIdCancelPut) | **PUT** /brand/{brandId}/messagebase/{messagebaseId}/cancel | 지정된 템플릿의 승인요청을 취소합니다. 
*MessagebaseApi* | [**brandBrandIdMessagebaseMessagebaseIdDelete**](docs/MessagebaseApi.md#brandBrandIdMessagebaseMessagebaseIdDelete) | **DELETE** /brand/{brandId}/messagebase/{messagebaseId} | 브랜드 내 지정된 템플릿을 삭제합니다. 
*MessagebaseApi* | [**brandBrandIdMessagebaseMessagebaseIdGet**](docs/MessagebaseApi.md#brandBrandIdMessagebaseMessagebaseIdGet) | **GET** /brand/{brandId}/messagebase/{messagebaseId} | 브랜드에 등록된 지정 템플릿 상세 내역을 조회합니다. 
*MessagebaseApi* | [**brandBrandIdMessagebaseMessagebaseIdPut**](docs/MessagebaseApi.md#brandBrandIdMessagebaseMessagebaseIdPut) | **PUT** /brand/{brandId}/messagebase/{messagebaseId} | 지정 템플릿을 업데이트 합니다. 
*MessagebaseApi* | [**brandBrandIdMessagebasePost**](docs/MessagebaseApi.md#brandBrandIdMessagebasePost) | **POST** /brand/{brandId}/messagebase | 브랜드 내에서 사용할 구형 텍스트 템플릿을 등록합니다. 추가된 신규 템플릿 유형은 POST /brand/{brandId}/v2/messagebase 을 이용해야 합니다. 
*MessagebaseApi* | [**brandBrandIdV2MessagebaseFileFileIdGet**](docs/MessagebaseApi.md#brandBrandIdV2MessagebaseFileFileIdGet) | **GET** /brand/{brandId}/v2/messagebase/file/{fileId} | 이미지 템플릿 용으로 등록한 이미지 파일 정보를 조회 합니다. 
*MessagebaseApi* | [**brandBrandIdV2MessagebaseFilePost**](docs/MessagebaseApi.md#brandBrandIdV2MessagebaseFilePost) | **POST** /brand/{brandId}/v2/messagebase/file | 이미지 템플릿에서 사용할 이미지 파일을 등록합니다. 
*MessagebaseApi* | [**brandBrandIdV2MessagebaseMessagebaseIdPut**](docs/MessagebaseApi.md#brandBrandIdV2MessagebaseMessagebaseIdPut) | **PUT** /brand/{brandId}/v2/messagebase/{messagebaseId} | 이미 등록된 템플릿의 내용을 수정합니다. 
*MessagebaseApi* | [**brandBrandIdV2MessagebasePost**](docs/MessagebaseApi.md#brandBrandIdV2MessagebasePost) | **POST** /brand/{brandId}/v2/messagebase | 브랜드 내에서 사용할 템플릿을 등록합니다.   Openrichcard 규격의 모든 템플릿 등록이 가능합니다. 
*MessagebaseApi* | [**messagebaseCommonGet**](docs/MessagebaseApi.md#messagebaseCommonGet) | **GET** /messagebase/common | 이통사가 기본 제공하는 공통템플릿을 조회합니다. 
*MessagebaseApi* | [**messagebaseCommonMessagebaseIdGet**](docs/MessagebaseApi.md#messagebaseCommonMessagebaseIdGet) | **GET** /messagebase/common/{messagebaseId} | 이통사가 기본 제공하는 공통템플릿 별 상세 내용을 조회합니다. 
*MessagebaseApi* | [**messagebaseMessagebaseformGet**](docs/MessagebaseApi.md#messagebaseMessagebaseformGet) | **GET** /messagebase/messagebaseform | 템플릿 양식 목록을 조회합니다. 
*MessagebaseApi* | [**messagebaseMessagebaseformMessagebaseformIdGet**](docs/MessagebaseApi.md#messagebaseMessagebaseformMessagebaseformIdGet) | **GET** /messagebase/messagebaseform/{messagebaseformId} | 템플릿 유형의 상세 내용을 조회합니다. 
*MessagebaseApi* | [**messagebaseMessagebaseformMessagebaseformIdLogoGet**](docs/MessagebaseApi.md#messagebaseMessagebaseformMessagebaseformIdLogoGet) | **GET** /messagebase/messagebaseform/{messagebaseformId}/logo | RBC에서 템플릿용으로 제공되는 기본 로고 이미지 정보를 조회합니다. 
*SinceV10Api* | [**agencyAgencyIdBrandBrandIdGet**](docs/SinceV10Api.md#agencyAgencyIdBrandBrandIdGet) | **GET** /agency/{agencyId}/brand/{brandId} | 계약된 브랜드 정보를 개별 조회 합니다. 
*SinceV10Api* | [**agencyAgencyIdContractGet**](docs/SinceV10Api.md#agencyAgencyIdContractGet) | **GET** /agency/{agencyId}/contract | 대행사가 계약된 브랜드 리스트를 제공합니다. 
*SinceV10Api* | [**agencyAgencyIdCorpCorpRegNumBrandGet**](docs/SinceV10Api.md#agencyAgencyIdCorpCorpRegNumBrandGet) | **GET** /agency/{agencyId}/corp/{corpRegNum}/brand | 대행사가 계약된 브랜드를 기업 단위로 조회합니다. 
*SinceV10Api* | [**brandBrandIdAutoreplymsgGet**](docs/SinceV10Api.md#brandBrandIdAutoreplymsgGet) | **GET** /brand/{brandId}/autoreplymsg | 브랜드 내에 등록된 자동응답메시지 목록을 조회합니다. 
*SinceV10Api* | [**brandBrandIdChatbotChatbotIdDelete**](docs/SinceV10Api.md#brandBrandIdChatbotChatbotIdDelete) | **DELETE** /brand/{brandId}/chatbot/{chatbotId} | 대화방(발신번호)을 삭제합니다. 
*SinceV10Api* | [**brandBrandIdChatbotChatbotIdGet**](docs/SinceV10Api.md#brandBrandIdChatbotChatbotIdGet) | **GET** /brand/{brandId}/chatbot/{chatbotId} | 지정된 대화방(발신번호)의 상세 정보를 조회합니다. 
*SinceV10Api* | [**brandBrandIdChatbotChatbotIdPut**](docs/SinceV10Api.md#brandBrandIdChatbotChatbotIdPut) | **PUT** /brand/{brandId}/chatbot/{chatbotId} | 지정된 대화방(발신번호)의 정보를 업데이트합니다. 
*SinceV10Api* | [**brandBrandIdChatbotGet**](docs/SinceV10Api.md#brandBrandIdChatbotGet) | **GET** /brand/{brandId}/chatbot | 브랜드 내에 등록된 대화방 목록을 조회합니다. 
*SinceV10Api* | [**brandBrandIdChatbotPost**](docs/SinceV10Api.md#brandBrandIdChatbotPost) | **POST** /brand/{brandId}/chatbot | 지정된 브랜드에 대화방(발신번호)을 등록합니다. 
*SinceV10Api* | [**brandBrandIdMessagebaseGet**](docs/SinceV10Api.md#brandBrandIdMessagebaseGet) | **GET** /brand/{brandId}/messagebase | 브랜드에 등록된 템플릿을 조회합니다. 
*SinceV10Api* | [**brandBrandIdMessagebaseMessagebaseIdDelete**](docs/SinceV10Api.md#brandBrandIdMessagebaseMessagebaseIdDelete) | **DELETE** /brand/{brandId}/messagebase/{messagebaseId} | 브랜드 내 지정된 템플릿을 삭제합니다. 
*SinceV10Api* | [**brandBrandIdMessagebaseMessagebaseIdGet**](docs/SinceV10Api.md#brandBrandIdMessagebaseMessagebaseIdGet) | **GET** /brand/{brandId}/messagebase/{messagebaseId} | 브랜드에 등록된 지정 템플릿 상세 내역을 조회합니다. 
*SinceV10Api* | [**brandBrandIdMessagebaseMessagebaseIdPut**](docs/SinceV10Api.md#brandBrandIdMessagebaseMessagebaseIdPut) | **PUT** /brand/{brandId}/messagebase/{messagebaseId} | 지정 템플릿을 업데이트 합니다. 
*SinceV10Api* | [**brandBrandIdMessagebasePost**](docs/SinceV10Api.md#brandBrandIdMessagebasePost) | **POST** /brand/{brandId}/messagebase | 브랜드 내에서 사용할 구형 텍스트 템플릿을 등록합니다. 추가된 신규 템플릿 유형은 POST /brand/{brandId}/v2/messagebase 을 이용해야 합니다. 
*SinceV10Api* | [**corpPersonIdBrandGet**](docs/SinceV10Api.md#corpPersonIdBrandGet) | **GET** /corp/{personId}/brand | 마스터 또는 매니저 계정으로 운영 권한이 있는 브랜드 목록을 조회합니다. 
*SinceV10Api* | [**messagebaseCommonGet**](docs/SinceV10Api.md#messagebaseCommonGet) | **GET** /messagebase/common | 이통사가 기본 제공하는 공통템플릿을 조회합니다. 
*SinceV10Api* | [**messagebaseCommonMessagebaseIdGet**](docs/SinceV10Api.md#messagebaseCommonMessagebaseIdGet) | **GET** /messagebase/common/{messagebaseId} | 이통사가 기본 제공하는 공통템플릿 별 상세 내용을 조회합니다. 
*SinceV10Api* | [**messagebaseMessagebaseformGet**](docs/SinceV10Api.md#messagebaseMessagebaseformGet) | **GET** /messagebase/messagebaseform | 템플릿 양식 목록을 조회합니다. 
*SinceV10Api* | [**messagebaseMessagebaseformMessagebaseformIdGet**](docs/SinceV10Api.md#messagebaseMessagebaseformMessagebaseformIdGet) | **GET** /messagebase/messagebaseform/{messagebaseformId} | 템플릿 유형의 상세 내용을 조회합니다. 
*SinceV10Api* | [**tokenPost**](docs/SinceV10Api.md#tokenPost) | **POST** /token | Access 토큰을 발급 요청합니다. 
*SinceV10Api* | [**webhookUrlPost**](docs/SinceV10Api.md#webhookUrlPost) | **POST** /{webhookUrl} | 대행사에서 등록한 수신서버 URL을 통해 RBC에서 발생하는 데이터의 등록/수정/삭제 이벤트 정보를 전달합니다. 
*SinceV1110Api* | [**agencyAgencyIdBrandBrandIdPut**](docs/SinceV1110Api.md#agencyAgencyIdBrandBrandIdPut) | **PUT** /agency/{agencyId}/brand/{brandId} | 대행사가 운영 중인 브랜드 정보를 수정 합니다. 브랜드명, 프로필 이미지가 수정되면 다시 승인을 받아야 합니다. 
*SinceV1110Api* | [**baselayoutComponentGet**](docs/SinceV1110Api.md#baselayoutComponentGet) | **GET** /baselayout/component | 레이아웃 등록/수정 시 사용 가능한 컴포넌트 목록을 조회 합니다. 
*SinceV1110Api* | [**baselayoutProductRuleGet**](docs/SinceV1110Api.md#baselayoutProductRuleGet) | **GET** /baselayout/product/rule | 메시지 상품별 레이아웃 구성 규칙을 조회합니다. 
*SinceV1110Api* | [**baselayoutSampleGet**](docs/SinceV1110Api.md#baselayoutSampleGet) | **GET** /baselayout/sample | 레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 목록 입니다. 
*SinceV1110Api* | [**baselayoutSampleSampleLayoutIdGet**](docs/SinceV1110Api.md#baselayoutSampleSampleLayoutIdGet) | **GET** /baselayout/sample/{sampleLayoutId} | 레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 상세 정보를 조회합니다. 
*SinceV1110Api* | [**brandBrandIdLayoutGet**](docs/SinceV1110Api.md#brandBrandIdLayoutGet) | **GET** /brand/{brandId}/layout | 브랜드 별 등록된 레이아웃 목록을 조회합니다. 
*SinceV1110Api* | [**brandBrandIdLayoutLayoutIdDelete**](docs/SinceV1110Api.md#brandBrandIdLayoutLayoutIdDelete) | **DELETE** /brand/{brandId}/layout/{layoutId} | 브랜드 별 등록된 레이아웃을 삭제합니다. 
*SinceV1110Api* | [**brandBrandIdLayoutLayoutIdGet**](docs/SinceV1110Api.md#brandBrandIdLayoutLayoutIdGet) | **GET** /brand/{brandId}/layout/{layoutId} | 브랜드 별 등록된 레이아웃 목록을 조회합니다. 
*SinceV1110Api* | [**brandBrandIdLayoutLayoutIdPut**](docs/SinceV1110Api.md#brandBrandIdLayoutLayoutIdPut) | **PUT** /brand/{brandId}/layout/{layoutId} | 브랜드 내 레이아웃을 수정 합니다.   
*SinceV1110Api* | [**brandBrandIdLayoutPost**](docs/SinceV1110Api.md#brandBrandIdLayoutPost) | **POST** /brand/{brandId}/layout | 브랜드 내에서 사용할 수 있는 레이아웃을 등록 합니다.   
*SinceV1110Api* | [**corpBrandBrandIdCancelPut**](docs/SinceV1110Api.md#corpBrandBrandIdCancelPut) | **PUT** /corp/brand/{brandId}/cancel | 신규 개설한 승인대기 중인 브랜드의 승인요청을 취소합니다.   
*SinceV1110Api* | [**corpPersonIdBrandBrandIdCancelPut**](docs/SinceV1110Api.md#corpPersonIdBrandBrandIdCancelPut) | **PUT** /corp/{personId}/brand/{brandId}/cancel | 승인대기 중인 브랜드의 승인요청을 취소합니다.   
*SinceV1110Api* | [**messagebaseMessagebaseformMessagebaseformIdLogoGet**](docs/SinceV1110Api.md#messagebaseMessagebaseformMessagebaseformIdLogoGet) | **GET** /messagebase/messagebaseform/{messagebaseformId}/logo | RBC에서 템플릿용으로 제공되는 기본 로고 이미지 정보를 조회합니다. 
*SinceV1110Api* | [**statQueryBrandprofileBrandIdGet**](docs/SinceV1110Api.md#statQueryBrandprofileBrandIdGet) | **GET** /statQuery/brandprofile/{brandId} | (준비중) 브랜드프로필 노출 통계를 조회합니다. 
*SinceV1112Api* | [**brandBrandIdLogoFileIdCancelPut**](docs/SinceV1112Api.md#brandBrandIdLogoFileIdCancelPut) | **PUT** /brand/{brandId}/logo/{fileId}/cancel | 로고의 승인요청을 취소합니다. 
*SinceV1112Api* | [**brandBrandIdLogoFileIdDelete**](docs/SinceV1112Api.md#brandBrandIdLogoFileIdDelete) | **DELETE** /brand/{brandId}/logo/{fileId} | 브랜드에 등록된 승인 이전 상태의 로고를 삭제 합니다. 
*SinceV1112Api* | [**brandBrandIdLogoFileIdGet**](docs/SinceV1112Api.md#brandBrandIdLogoFileIdGet) | **GET** /brand/{brandId}/logo/{fileId} | 브랜드에 등록된 로고를 단건 상세 조회합니다. 
*SinceV1112Api* | [**brandBrandIdLogoFileIdPut**](docs/SinceV1112Api.md#brandBrandIdLogoFileIdPut) | **PUT** /brand/{brandId}/logo/{fileId} | 브랜드에 등록된 로고를 수정 승인요청 합니다. 
*SinceV1112Api* | [**brandBrandIdLogoGet**](docs/SinceV1112Api.md#brandBrandIdLogoGet) | **GET** /brand/{brandId}/logo | 브랜드 별 등록된 로고 목록을 조회합니다. 
*SinceV1112Api* | [**brandBrandIdLogoPost**](docs/SinceV1112Api.md#brandBrandIdLogoPost) | **POST** /brand/{brandId}/logo | 브랜드 내에서 사용할 수 있는 로고를 등록 합니다.   
*SinceV1112Api* | [**logoCommonGet**](docs/SinceV1112Api.md#logoCommonGet) | **GET** /logo/common | RBC에서 제공되는 기본 아이콘 이미지 정보를 조회합니다. 
*SinceV112Api* | [**corpBrandCategoriesGet**](docs/SinceV112Api.md#corpBrandCategoriesGet) | **GET** /corp/brand/categories | 브랜드 등록 시 사용 가능한 카테고리 목록을 조회합니다.  
*SinceV112Api* | [**corpBrandPost**](docs/SinceV112Api.md#corpBrandPost) | **POST** /corp/brand | 마스터, 매니저 계정을 이용하여 신규 브랜드 등록 승인을 요청합니다. 
*SinceV113Api* | [**corpBrandBrandIdDelete**](docs/SinceV113Api.md#corpBrandBrandIdDelete) | **DELETE** /corp/brand/{brandId} | 마스터 계정을 이용하여 승인 이력이 없는 신규 개설 브랜드 삭제를 요청합니다. 
*SinceV113Api* | [**corpBrandBrandIdPut**](docs/SinceV113Api.md#corpBrandBrandIdPut) | **PUT** /corp/brand/{brandId} | RBC 웹에서 임시저장으로 등록한 브랜드 또는 신규 브랜드 등록 검수 시 반려된 경우 브랜드 수정 후 승인요청 시 사용합니다. 
*SinceV113Api* | [**corpPersonIdBrandBrandIdDelete**](docs/SinceV113Api.md#corpPersonIdBrandBrandIdDelete) | **DELETE** /corp/{personId}/brand/{brandId} | 브랜드를 삭제합니다. 
*SinceV113Api* | [**corpPersonIdBrandBrandIdGet**](docs/SinceV113Api.md#corpPersonIdBrandBrandIdGet) | **GET** /corp/{personId}/brand/{brandId} | 브랜드 상세 정보를 조회합니다. 
*SinceV113Api* | [**corpPersonIdBrandBrandIdPrivilegeGet**](docs/SinceV113Api.md#corpPersonIdBrandBrandIdPrivilegeGet) | **GET** /corp/{personId}/brand/{brandId}/privilege | 브랜드에 등록된 운영 권한 정보를 조회합니다. 
*SinceV113Api* | [**corpPersonIdBrandBrandIdPrivilegeIdDelete**](docs/SinceV113Api.md#corpPersonIdBrandBrandIdPrivilegeIdDelete) | **DELETE** /corp/{personId}/brand/{brandId}/privilege/{id} | 브랜드 운영자 권한 중 지정한 대상을 삭제합니다. 
*SinceV113Api* | [**corpPersonIdBrandBrandIdPrivilegePost**](docs/SinceV113Api.md#corpPersonIdBrandBrandIdPrivilegePost) | **POST** /corp/{personId}/brand/{brandId}/privilege | 브랜드 대표운영자가 브랜드 내 운영자(기업의 마스터/매니저, 대행사) 권한을 부여 합니다. 
*SinceV113Api* | [**corpPersonIdBrandBrandIdPrivilegePut**](docs/SinceV113Api.md#corpPersonIdBrandBrandIdPrivilegePut) | **PUT** /corp/{personId}/brand/{brandId}/privilege | 브랜드 대표운영자 권한을 위임합니다. 
*SinceV113Api* | [**corpPersonIdBrandBrandIdPut**](docs/SinceV113Api.md#corpPersonIdBrandBrandIdPut) | **PUT** /corp/{personId}/brand/{brandId} | 현재 운영 중인 브랜드 정보를 수정 합니다. 브랜드명, 프로필 이미지가 수정되면 다시 승인을 받아야 합니다. 
*SinceV114Api* | [**brandBrandIdMessagebaseMessagebaseIdCancelPut**](docs/SinceV114Api.md#brandBrandIdMessagebaseMessagebaseIdCancelPut) | **PUT** /brand/{brandId}/messagebase/{messagebaseId}/cancel | 지정된 템플릿의 승인요청을 취소합니다. 
*SinceV115Api* | [**brandBrandIdAutoreplymsgAutoReplyMsgIdDelete**](docs/SinceV115Api.md#brandBrandIdAutoreplymsgAutoReplyMsgIdDelete) | **DELETE** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지를 삭제합니다. 
*SinceV115Api* | [**brandBrandIdAutoreplymsgAutoReplyMsgIdGet**](docs/SinceV115Api.md#brandBrandIdAutoreplymsgAutoReplyMsgIdGet) | **GET** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지의 상세 정보를 조회합니다. 
*SinceV115Api* | [**brandBrandIdAutoreplymsgAutoReplyMsgIdPut**](docs/SinceV115Api.md#brandBrandIdAutoreplymsgAutoReplyMsgIdPut) | **PUT** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지의 정보를 업데이트합니다. 
*SinceV115Api* | [**brandBrandIdAutoreplymsgFileFileIdGet**](docs/SinceV115Api.md#brandBrandIdAutoreplymsgFileFileIdGet) | **GET** /brand/{brandId}/autoreplymsg/file/{fileId} | 자동응답메시지에서 사용할 이미지 파일 상세 정보를 조회합니다. 
*SinceV115Api* | [**brandBrandIdAutoreplymsgFilePost**](docs/SinceV115Api.md#brandBrandIdAutoreplymsgFilePost) | **POST** /brand/{brandId}/autoreplymsg/file | 자동응답메시지에서 사용할 이미지 파일을 등록합니다. 
*SinceV115Api* | [**brandBrandIdAutoreplymsgPost**](docs/SinceV115Api.md#brandBrandIdAutoreplymsgPost) | **POST** /brand/{brandId}/autoreplymsg | 브랜드에 자동응답메시지를 등록합니다. 
*SinceV115Api* | [**brandBrandIdBidirectionalChatbotChatbotIdDelete**](docs/SinceV115Api.md#brandBrandIdBidirectionalChatbotChatbotIdDelete) | **DELETE** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향)을 삭제합니다. 
*SinceV115Api* | [**brandBrandIdBidirectionalChatbotChatbotIdGet**](docs/SinceV115Api.md#brandBrandIdBidirectionalChatbotChatbotIdGet) | **GET** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향)의 상세 정보를 조회합니다. 
*SinceV115Api* | [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete**](docs/SinceV115Api.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete) | **DELETE** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방의 대화방메뉴를 삭제합니다. 
*SinceV115Api* | [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut**](docs/SinceV115Api.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut) | **PUT** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu/pause | 중계사만 사용이 가능하며, 양방향 대화방의 대화방메뉴 사용을 중지 또는 재개합니다. 
*SinceV115Api* | [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost**](docs/SinceV115Api.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost) | **POST** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방에 대화방메뉴를 등록합니다. 
*SinceV115Api* | [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut**](docs/SinceV115Api.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut) | **PUT** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방의 대화방메뉴를 수정합니다. 
*SinceV115Api* | [**brandBrandIdBidirectionalChatbotChatbotIdPut**](docs/SinceV115Api.md#brandBrandIdBidirectionalChatbotChatbotIdPut) | **PUT** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향) 정보를 수정 합니다. 
*SinceV115Api* | [**brandBrandIdBidirectionalChatbotGet**](docs/SinceV115Api.md#brandBrandIdBidirectionalChatbotGet) | **GET** /brand/{brandId}/bidirectional/chatbot | 브랜드에 등록된 대화방(양방향) 목록을 조회합니다. 
*SinceV115Api* | [**brandBrandIdBidirectionalChatbotPost**](docs/SinceV115Api.md#brandBrandIdBidirectionalChatbotPost) | **POST** /brand/{brandId}/bidirectional/chatbot | 대화방(양방향)을 등록합니다. 
*SinceV115Api* | [**webhookUrlBidirectionalPost**](docs/SinceV115Api.md#webhookUrlBidirectionalPost) | **POST** /{webhookUrl}/bidirectional | 양방향 서비스 제공 중계사에서 구현해야 하는 Webhook URI 입니다. 
*SinceV116Api* | [**statQueryMessageBrandIdGet**](docs/SinceV116Api.md#statQueryMessageBrandIdGet) | **GET** /statQuery/message/{brandId} | 고객반응 통계 - 캠페인 메시지 발송/읽음확인 통계를 조회합니다. 
*SinceV116Api* | [**statQueryMessageButtonBrandIdGet**](docs/SinceV116Api.md#statQueryMessageButtonBrandIdGet) | **GET** /statQuery/messageButton/{brandId} | 고객반응 통계 - 캠페인 메시지 버튼 클릭 통계를 조회합니다. 
*SinceV116Api* | [**statQueryPersistentMenuBrandIdGet**](docs/SinceV116Api.md#statQueryPersistentMenuBrandIdGet) | **GET** /statQuery/persistentMenu/{brandId} | 고객반응 통계 - 대화방 메뉴 클릭 통계를 조회합니다. 
*SinceV117Api* | [**agencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet**](docs/SinceV117Api.md#agencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet) | **GET** /agency/{agencyId}/corp/{corpRegNum}/chatbot/{chatbotId} | 발신번호가 RBC에 대상 사업자의 발신번호로 등록되어 있는지 확인할 수 있습니다. 
*SinceV117Api* | [**agencyAgencyIdCorpCorpRegNumGet**](docs/SinceV117Api.md#agencyAgencyIdCorpCorpRegNumGet) | **GET** /agency/{agencyId}/corp/{corpRegNum} | 사업자등록번호로 RBC 가입 여부와 브랜드 대행사 지정 상태를 확인할 수 있습니다. 
*SinceV118Api* | [**brandBrandIdV2MessagebaseFileFileIdGet**](docs/SinceV118Api.md#brandBrandIdV2MessagebaseFileFileIdGet) | **GET** /brand/{brandId}/v2/messagebase/file/{fileId} | 이미지 템플릿 용으로 등록한 이미지 파일 정보를 조회 합니다. 
*SinceV118Api* | [**brandBrandIdV2MessagebaseFilePost**](docs/SinceV118Api.md#brandBrandIdV2MessagebaseFilePost) | **POST** /brand/{brandId}/v2/messagebase/file | 이미지 템플릿에서 사용할 이미지 파일을 등록합니다. 
*SinceV118Api* | [**brandBrandIdV2MessagebaseMessagebaseIdPut**](docs/SinceV118Api.md#brandBrandIdV2MessagebaseMessagebaseIdPut) | **PUT** /brand/{brandId}/v2/messagebase/{messagebaseId} | 이미 등록된 템플릿의 내용을 수정합니다. 
*SinceV118Api* | [**brandBrandIdV2MessagebasePost**](docs/SinceV118Api.md#brandBrandIdV2MessagebasePost) | **POST** /brand/{brandId}/v2/messagebase | 브랜드 내에서 사용할 템플릿을 등록합니다.   Openrichcard 규격의 모든 템플릿 등록이 가능합니다. 
*SinceV118Api* | [**usableQueryChatbotIdChatbotIdGet**](docs/SinceV118Api.md#usableQueryChatbotIdChatbotIdGet) | **GET** /usableQuery/chatbotId/{chatbotId} | 대화방ID 등록 가능 여부를 조회 합니다. 
*SinceV119Api* | [**agencyAgencyIdAgencyKeyGet**](docs/SinceV119Api.md#agencyAgencyIdAgencyKeyGet) | **GET** /agency/{agencyId}/agencyKey | RBC에서 발급된 최종 대행사 키를 조회합니다. 
*SinceV119Api* | [**brandBrandIdChatbotChatbotIdCancelPut**](docs/SinceV119Api.md#brandBrandIdChatbotChatbotIdCancelPut) | **PUT** /brand/{brandId}/chatbot/{chatbotId}/cancel | 지정된 대화방(발신번호, 양방향ID)의 승인요청을 취소합니다. 
*StatApi* | [**statQueryBrandprofileBrandIdGet**](docs/StatApi.md#statQueryBrandprofileBrandIdGet) | **GET** /statQuery/brandprofile/{brandId} | (준비중) 브랜드프로필 노출 통계를 조회합니다. 
*StatApi* | [**statQueryMessageBrandIdGet**](docs/StatApi.md#statQueryMessageBrandIdGet) | **GET** /statQuery/message/{brandId} | 고객반응 통계 - 캠페인 메시지 발송/읽음확인 통계를 조회합니다. 
*StatApi* | [**statQueryMessageButtonBrandIdGet**](docs/StatApi.md#statQueryMessageButtonBrandIdGet) | **GET** /statQuery/messageButton/{brandId} | 고객반응 통계 - 캠페인 메시지 버튼 클릭 통계를 조회합니다. 
*StatApi* | [**statQueryPersistentMenuBrandIdGet**](docs/StatApi.md#statQueryPersistentMenuBrandIdGet) | **GET** /statQuery/persistentMenu/{brandId} | 고객반응 통계 - 대화방 메뉴 클릭 통계를 조회합니다. 
*TokenApi* | [**tokenPost**](docs/TokenApi.md#tokenPost) | **POST** /token | Access 토큰을 발급 요청합니다. 
*UsableApi* | [**usableQueryChatbotIdChatbotIdGet**](docs/UsableApi.md#usableQueryChatbotIdChatbotIdGet) | **GET** /usableQuery/chatbotId/{chatbotId} | 대화방ID 등록 가능 여부를 조회 합니다. 


## Documentation for Models

 - [Action](docs/Action.md)
 - [ActionAction](docs/ActionAction.md)
 - [AgencyAgencyIdAgencyKeyGet200Response](docs/AgencyAgencyIdAgencyKeyGet200Response.md)
 - [AgencyAgencyIdContractGet200Response](docs/AgencyAgencyIdContractGet200Response.md)
 - [AgencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet200Response](docs/AgencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet200Response.md)
 - [AgencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet200ResponseResultInner](docs/AgencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet200ResponseResultInner.md)
 - [AgencyAgencyIdCorpCorpRegNumGet200Response](docs/AgencyAgencyIdCorpCorpRegNumGet200Response.md)
 - [AgencyAgencyIdCorpCorpRegNumGet200ResponseResultInner](docs/AgencyAgencyIdCorpCorpRegNumGet200ResponseResultInner.md)
 - [AgencyKeyInfo](docs/AgencyKeyInfo.md)
 - [AppLinkItemInfo](docs/AppLinkItemInfo.md)
 - [AutoReplyMsg](docs/AutoReplyMsg.md)
 - [AutoReplyMsgActions](docs/AutoReplyMsgActions.md)
 - [AutoReplyMsgFileInfo](docs/AutoReplyMsgFileInfo.md)
 - [AutoReplyMsgInfo](docs/AutoReplyMsgInfo.md)
 - [BaselayoutComponentGet200Response](docs/BaselayoutComponentGet200Response.md)
 - [BaselayoutProductRuleGet200Response](docs/BaselayoutProductRuleGet200Response.md)
 - [BaselayoutSampleGet200Response](docs/BaselayoutSampleGet200Response.md)
 - [BaselayoutSampleSampleLayoutIdGet200Response](docs/BaselayoutSampleSampleLayoutIdGet200Response.md)
 - [BiChatbot](docs/BiChatbot.md)
 - [BiChatbotDetail](docs/BiChatbotDetail.md)
 - [BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response](docs/BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response.md)
 - [BrandBrandIdAutoreplymsgFilePost200Response](docs/BrandBrandIdAutoreplymsgFilePost200Response.md)
 - [BrandBrandIdAutoreplymsgGet200Response](docs/BrandBrandIdAutoreplymsgGet200Response.md)
 - [BrandBrandIdAutoreplymsgPost200Response](docs/BrandBrandIdAutoreplymsgPost200Response.md)
 - [BrandBrandIdAutoreplymsgPost200ResponseResultInner](docs/BrandBrandIdAutoreplymsgPost200ResponseResultInner.md)
 - [BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response](docs/BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response.md)
 - [BrandBrandIdBidirectionalChatbotChatbotIdDelete200ResponseResultInner](docs/BrandBrandIdBidirectionalChatbotChatbotIdDelete200ResponseResultInner.md)
 - [BrandBrandIdBidirectionalChatbotChatbotIdGet200Response](docs/BrandBrandIdBidirectionalChatbotChatbotIdGet200Response.md)
 - [BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut200Response](docs/BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut200Response.md)
 - [BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut200ResponseResultInner](docs/BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut200ResponseResultInner.md)
 - [BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest](docs/BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest.md)
 - [BrandBrandIdBidirectionalChatbotChatbotIdPutRequest](docs/BrandBrandIdBidirectionalChatbotChatbotIdPutRequest.md)
 - [BrandBrandIdBidirectionalChatbotGet200Response](docs/BrandBrandIdBidirectionalChatbotGet200Response.md)
 - [BrandBrandIdBidirectionalChatbotPost200Response](docs/BrandBrandIdBidirectionalChatbotPost200Response.md)
 - [BrandBrandIdBidirectionalChatbotPostRequest](docs/BrandBrandIdBidirectionalChatbotPostRequest.md)
 - [BrandBrandIdChatbotChatbotIdCancelPut200Response](docs/BrandBrandIdChatbotChatbotIdCancelPut200Response.md)
 - [BrandBrandIdChatbotChatbotIdDelete200Response](docs/BrandBrandIdChatbotChatbotIdDelete200Response.md)
 - [BrandBrandIdChatbotChatbotIdDelete200ResponseResultInner](docs/BrandBrandIdChatbotChatbotIdDelete200ResponseResultInner.md)
 - [BrandBrandIdChatbotChatbotIdDelete200ResponseResultInnerReleatedChatbotsInner](docs/BrandBrandIdChatbotChatbotIdDelete200ResponseResultInnerReleatedChatbotsInner.md)
 - [BrandBrandIdChatbotChatbotIdGet200Response](docs/BrandBrandIdChatbotChatbotIdGet200Response.md)
 - [BrandBrandIdChatbotGet200Response](docs/BrandBrandIdChatbotGet200Response.md)
 - [BrandBrandIdChatbotPost200Response](docs/BrandBrandIdChatbotPost200Response.md)
 - [BrandBrandIdLayoutGet200Response](docs/BrandBrandIdLayoutGet200Response.md)
 - [BrandBrandIdLayoutLayoutIdDelete200Response](docs/BrandBrandIdLayoutLayoutIdDelete200Response.md)
 - [BrandBrandIdLayoutLayoutIdDelete200ResponseResultInner](docs/BrandBrandIdLayoutLayoutIdDelete200ResponseResultInner.md)
 - [BrandBrandIdLayoutLayoutIdGet200Response](docs/BrandBrandIdLayoutLayoutIdGet200Response.md)
 - [BrandBrandIdLayoutLayoutIdPut200Response](docs/BrandBrandIdLayoutLayoutIdPut200Response.md)
 - [BrandBrandIdLayoutLayoutIdPut200ResponseResultInner](docs/BrandBrandIdLayoutLayoutIdPut200ResponseResultInner.md)
 - [BrandBrandIdLayoutPost200Response](docs/BrandBrandIdLayoutPost200Response.md)
 - [BrandBrandIdLayoutPost200ResponseResultInner](docs/BrandBrandIdLayoutPost200ResponseResultInner.md)
 - [BrandBrandIdLogoFileIdDelete200Response](docs/BrandBrandIdLogoFileIdDelete200Response.md)
 - [BrandBrandIdLogoFileIdDelete200ResponseResultInner](docs/BrandBrandIdLogoFileIdDelete200ResponseResultInner.md)
 - [BrandBrandIdLogoFileIdGet200Response](docs/BrandBrandIdLogoFileIdGet200Response.md)
 - [BrandBrandIdLogoFileIdPut200Response](docs/BrandBrandIdLogoFileIdPut200Response.md)
 - [BrandBrandIdLogoFileIdPut200ResponseResultInner](docs/BrandBrandIdLogoFileIdPut200ResponseResultInner.md)
 - [BrandBrandIdLogoGet200Response](docs/BrandBrandIdLogoGet200Response.md)
 - [BrandBrandIdLogoPost200Response](docs/BrandBrandIdLogoPost200Response.md)
 - [BrandBrandIdLogoPost200ResponseResultInner](docs/BrandBrandIdLogoPost200ResponseResultInner.md)
 - [BrandBrandIdMessagebaseMessagebaseIdGet200Response](docs/BrandBrandIdMessagebaseMessagebaseIdGet200Response.md)
 - [BrandBrandIdMessagebaseMessagebaseIdPut200Response](docs/BrandBrandIdMessagebaseMessagebaseIdPut200Response.md)
 - [BrandBrandIdMessagebaseMessagebaseIdPut200ResponseResultInner](docs/BrandBrandIdMessagebaseMessagebaseIdPut200ResponseResultInner.md)
 - [BrandBrandIdMessagebasePost200Response](docs/BrandBrandIdMessagebasePost200Response.md)
 - [BrandBrandIdMessagebasePost200ResponseResultInner](docs/BrandBrandIdMessagebasePost200ResponseResultInner.md)
 - [BrandBrandIdMessagebasePostRequest](docs/BrandBrandIdMessagebasePostRequest.md)
 - [BrandBrandIdV2MessagebaseFilePost200Response](docs/BrandBrandIdV2MessagebaseFilePost200Response.md)
 - [BrandDetail](docs/BrandDetail.md)
 - [BrandInfo](docs/BrandInfo.md)
 - [BrandLayout](docs/BrandLayout.md)
 - [BrandLayoutDetail](docs/BrandLayoutDetail.md)
 - [BrandLogo](docs/BrandLogo.md)
 - [BrandProfileStatData](docs/BrandProfileStatData.md)
 - [ButtonOption](docs/ButtonOption.md)
 - [ButtonStatData](docs/ButtonStatData.md)
 - [CalendarAction](docs/CalendarAction.md)
 - [CalendarActionCalendarAction](docs/CalendarActionCalendarAction.md)
 - [CalendarActionCalendarActionOneOf](docs/CalendarActionCalendarActionOneOf.md)
 - [CalendarActionCalendarActionOneOfCreateCalendarEvent](docs/CalendarActionCalendarActionOneOfCreateCalendarEvent.md)
 - [CardMedia](docs/CardMedia.md)
 - [Category](docs/Category.md)
 - [CategorySubCategoriesInner](docs/CategorySubCategoriesInner.md)
 - [Chatbot](docs/Chatbot.md)
 - [ChatbotDetail](docs/ChatbotDetail.md)
 - [ClipboardAction](docs/ClipboardAction.md)
 - [ClipboardActionClipboardAction](docs/ClipboardActionClipboardAction.md)
 - [ClipboardActionClipboardActionOneOf](docs/ClipboardActionClipboardActionOneOf.md)
 - [ClipboardActionClipboardActionOneOfCopyToClipboard](docs/ClipboardActionClipboardActionOneOfCopyToClipboard.md)
 - [CommonLogo](docs/CommonLogo.md)
 - [ComponentInfo](docs/ComponentInfo.md)
 - [ComponentInfoOptions](docs/ComponentInfoOptions.md)
 - [ComposeAction](docs/ComposeAction.md)
 - [ComposeActionComposeAction](docs/ComposeActionComposeAction.md)
 - [ComposeActionComposeActionOneOf](docs/ComposeActionComposeActionOneOf.md)
 - [ComposeActionComposeActionOneOf1](docs/ComposeActionComposeActionOneOf1.md)
 - [ComposeActionComposeActionOneOf1ComposeRecordingMessage](docs/ComposeActionComposeActionOneOf1ComposeRecordingMessage.md)
 - [ComposeActionComposeActionOneOfComposeTextMessage](docs/ComposeActionComposeActionOneOfComposeTextMessage.md)
 - [ContractInfo](docs/ContractInfo.md)
 - [CorpBrandCategoriesGet200Response](docs/CorpBrandCategoriesGet200Response.md)
 - [CorpBrandPost200Response](docs/CorpBrandPost200Response.md)
 - [CorpBrandPost200ResponseResultInner](docs/CorpBrandPost200ResponseResultInner.md)
 - [CorpBrandPostRequestChatbots](docs/CorpBrandPostRequestChatbots.md)
 - [CorpPersonIdBrandBrandIdCancelPut200Response](docs/CorpPersonIdBrandBrandIdCancelPut200Response.md)
 - [CorpPersonIdBrandBrandIdCancelPut200ResponseResultInner](docs/CorpPersonIdBrandBrandIdCancelPut200ResponseResultInner.md)
 - [CorpPersonIdBrandBrandIdDelete200Response](docs/CorpPersonIdBrandBrandIdDelete200Response.md)
 - [CorpPersonIdBrandBrandIdDelete200ResponseResultInner](docs/CorpPersonIdBrandBrandIdDelete200ResponseResultInner.md)
 - [CorpPersonIdBrandBrandIdGet200Response](docs/CorpPersonIdBrandBrandIdGet200Response.md)
 - [CorpPersonIdBrandBrandIdPrivilegeGet200Response](docs/CorpPersonIdBrandBrandIdPrivilegeGet200Response.md)
 - [CorpPersonIdBrandBrandIdPrivilegePostRequest](docs/CorpPersonIdBrandBrandIdPrivilegePostRequest.md)
 - [CorpPersonIdBrandBrandIdPrivilegePutRequest](docs/CorpPersonIdBrandBrandIdPrivilegePutRequest.md)
 - [CorpPersonIdBrandBrandIdPut200Response](docs/CorpPersonIdBrandBrandIdPut200Response.md)
 - [CorpPersonIdBrandGet200Response](docs/CorpPersonIdBrandGet200Response.md)
 - [CustomReply](docs/CustomReply.md)
 - [CustomReplyReply](docs/CustomReplyReply.md)
 - [CustomReplyReplyPostback](docs/CustomReplyReplyPostback.md)
 - [DetailInfo](docs/DetailInfo.md)
 - [DetailInfoCharactersPerLine](docs/DetailInfoCharactersPerLine.md)
 - [DetailInfoCombinationsInner](docs/DetailInfoCombinationsInner.md)
 - [DetailInfoCombinationsInnerCondition](docs/DetailInfoCombinationsInnerCondition.md)
 - [DeviceAction](docs/DeviceAction.md)
 - [DeviceActionDeviceAction](docs/DeviceActionDeviceAction.md)
 - [DeviceActionDeviceActionOneOf](docs/DeviceActionDeviceActionOneOf.md)
 - [DialerAction](docs/DialerAction.md)
 - [DialerActionDialerAction](docs/DialerActionDialerAction.md)
 - [DialerActionDialerActionOneOf](docs/DialerActionDialerActionOneOf.md)
 - [DialerActionDialerActionOneOfDialPhoneNumber](docs/DialerActionDialerActionOneOfDialPhoneNumber.md)
 - [FileObject](docs/FileObject.md)
 - [GeneralPurposeCardCarouselMessage](docs/GeneralPurposeCardCarouselMessage.md)
 - [GeneralPurposeCardCarouselMessageGeneralPurposeCardCarousel](docs/GeneralPurposeCardCarouselMessageGeneralPurposeCardCarousel.md)
 - [GeneralPurposeCardCarouselMessageGeneralPurposeCardCarouselLayout](docs/GeneralPurposeCardCarouselMessageGeneralPurposeCardCarouselLayout.md)
 - [GeneralPurposeCardMessage](docs/GeneralPurposeCardMessage.md)
 - [GeneralPurposeCardMessageGeneralPurposeCard](docs/GeneralPurposeCardMessageGeneralPurposeCard.md)
 - [GeneralPurposeCardMessageGeneralPurposeCardContent](docs/GeneralPurposeCardMessageGeneralPurposeCardContent.md)
 - [GeneralPurposeCardMessageGeneralPurposeCardLayout](docs/GeneralPurposeCardMessageGeneralPurposeCardLayout.md)
 - [GeneralPurposeCardMessageGeneralPurposeCardLayoutOneOf](docs/GeneralPurposeCardMessageGeneralPurposeCardLayoutOneOf.md)
 - [GeneralPurposeCardMessageGeneralPurposeCardLayoutOneOf1](docs/GeneralPurposeCardMessageGeneralPurposeCardLayoutOneOf1.md)
 - [GuideInfo](docs/GuideInfo.md)
 - [ImageView](docs/ImageView.md)
 - [LayoutComponent](docs/LayoutComponent.md)
 - [LayoutRule](docs/LayoutRule.md)
 - [LayoutRuleComponentLimit](docs/LayoutRuleComponentLimit.md)
 - [LineDecoration](docs/LineDecoration.md)
 - [LineObject](docs/LineObject.md)
 - [LinearLayout](docs/LinearLayout.md)
 - [LinearLayoutAllOfChildren](docs/LinearLayoutAllOfChildren.md)
 - [LinearLayoutL1](docs/LinearLayoutL1.md)
 - [LinearLayoutL1AllOfChildren](docs/LinearLayoutL1AllOfChildren.md)
 - [LinearLayoutL2](docs/LinearLayoutL2.md)
 - [LinearLayoutL2AllOfChildren](docs/LinearLayoutL2AllOfChildren.md)
 - [Links](docs/Links.md)
 - [LocalBrowserAction](docs/LocalBrowserAction.md)
 - [LocalBrowserActionLocalBrowserAction](docs/LocalBrowserActionLocalBrowserAction.md)
 - [LocalBrowserActionLocalBrowserActionOneOf](docs/LocalBrowserActionLocalBrowserActionOneOf.md)
 - [LocalBrowserActionLocalBrowserActionOneOfOpenUrl](docs/LocalBrowserActionLocalBrowserActionOneOfOpenUrl.md)
 - [LogoCommonGet200Response](docs/LogoCommonGet200Response.md)
 - [MapAction](docs/MapAction.md)
 - [MapActionMapAction](docs/MapActionMapAction.md)
 - [MapActionMapActionOneOf](docs/MapActionMapActionOneOf.md)
 - [MapActionMapActionOneOf1](docs/MapActionMapActionOneOf1.md)
 - [MapActionMapActionOneOf1RequestLocationPush](docs/MapActionMapActionOneOf1RequestLocationPush.md)
 - [MapActionMapActionOneOfShowLocation](docs/MapActionMapActionOneOfShowLocation.md)
 - [MapActionMapActionOneOfShowLocationLocation](docs/MapActionMapActionOneOfShowLocationLocation.md)
 - [MediaUrlInner](docs/MediaUrlInner.md)
 - [MenuItemInfo](docs/MenuItemInfo.md)
 - [MenuStatData](docs/MenuStatData.md)
 - [MessageButtonStatData](docs/MessageButtonStatData.md)
 - [MessageStatData](docs/MessageStatData.md)
 - [Messagebase](docs/Messagebase.md)
 - [MessagebaseCommonGet200Response](docs/MessagebaseCommonGet200Response.md)
 - [MessagebaseCommonMessagebaseIdGet200Response](docs/MessagebaseCommonMessagebaseIdGet200Response.md)
 - [MessagebaseForm](docs/MessagebaseForm.md)
 - [MessagebaseFormInfo](docs/MessagebaseFormInfo.md)
 - [MessagebaseInfo](docs/MessagebaseInfo.md)
 - [MessagebaseMessagebaseformGet200Response](docs/MessagebaseMessagebaseformGet200Response.md)
 - [MessagebaseMessagebaseformMessagebaseformIdGet200Response](docs/MessagebaseMessagebaseformMessagebaseformIdGet200Response.md)
 - [MessagebaseMessagebaseformMessagebaseformIdLogoGet200Response](docs/MessagebaseMessagebaseformMessagebaseformIdLogoGet200Response.md)
 - [MessagebaseformLogo](docs/MessagebaseformLogo.md)
 - [ModBiChatbot](docs/ModBiChatbot.md)
 - [ModTemplateInfo](docs/ModTemplateInfo.md)
 - [Model204ErrorInfo](docs/Model204ErrorInfo.md)
 - [Model204ErrorInfoError](docs/Model204ErrorInfoError.md)
 - [Model400ErrorInfo](docs/Model400ErrorInfo.md)
 - [Model400ErrorInfoError](docs/Model400ErrorInfoError.md)
 - [Model401ErrorInfo](docs/Model401ErrorInfo.md)
 - [Model401ErrorInfoError](docs/Model401ErrorInfoError.md)
 - [Model403ErrorInfo](docs/Model403ErrorInfo.md)
 - [Model403ErrorInfoError](docs/Model403ErrorInfoError.md)
 - [NotiAgencyKey](docs/NotiAgencyKey.md)
 - [NotiAutoReplyMsg](docs/NotiAutoReplyMsg.md)
 - [NotiBidirectional](docs/NotiBidirectional.md)
 - [NotiBidirectionalValue](docs/NotiBidirectionalValue.md)
 - [NotiBrand](docs/NotiBrand.md)
 - [NotiChatbot](docs/NotiChatbot.md)
 - [NotiContract](docs/NotiContract.md)
 - [NotiFormat](docs/NotiFormat.md)
 - [NotiFormatBr](docs/NotiFormatBr.md)
 - [NotiLogo](docs/NotiLogo.md)
 - [NotiMessagebaseForm](docs/NotiMessagebaseForm.md)
 - [NotiTemplate](docs/NotiTemplate.md)
 - [OpenrichcardMessage](docs/OpenrichcardMessage.md)
 - [OpenrichcardMessageOpenrichcardMessage](docs/OpenrichcardMessageOpenrichcardMessage.md)
 - [OpenrichcardMessageOpenrichcardMessageLayout](docs/OpenrichcardMessageOpenrichcardMessageLayout.md)
 - [OpenrichcardMessageOpenrichcardMessageSuggestionsInner](docs/OpenrichcardMessageOpenrichcardMessageSuggestionsInner.md)
 - [Pagination](docs/Pagination.md)
 - [ParamInfo](docs/ParamInfo.md)
 - [PausePersistentMenu](docs/PausePersistentMenu.md)
 - [PersistentMenu](docs/PersistentMenu.md)
 - [PersistentMenuStatData](docs/PersistentMenuStatData.md)
 - [PolicyInfo](docs/PolicyInfo.md)
 - [PrivilegeInfo](docs/PrivilegeInfo.md)
 - [RCSMessage](docs/RCSMessage.md)
 - [RCSMessageRCSMessage](docs/RCSMessageRCSMessage.md)
 - [RegAutoReplyMsgInfo](docs/RegAutoReplyMsgInfo.md)
 - [RegAutoReplyMsgInfoButtonsInner](docs/RegAutoReplyMsgInfoButtonsInner.md)
 - [RegBiChatbot](docs/RegBiChatbot.md)
 - [RegBrandInfo](docs/RegBrandInfo.md)
 - [RegBrandInfoRegBrand](docs/RegBrandInfoRegBrand.md)
 - [RegBrandLayout](docs/RegBrandLayout.md)
 - [RegChatbotInfo](docs/RegChatbotInfo.md)
 - [RegMessagebaseInfo](docs/RegMessagebaseInfo.md)
 - [RegPersistentMenu](docs/RegPersistentMenu.md)
 - [RegPersistentMenuL0](docs/RegPersistentMenuL0.md)
 - [RegPersistentMenuL0Action](docs/RegPersistentMenuL0Action.md)
 - [RegPersistentMenuL1](docs/RegPersistentMenuL1.md)
 - [RegPersistentMenuL1Action](docs/RegPersistentMenuL1Action.md)
 - [RegPrivilegeInfo](docs/RegPrivilegeInfo.md)
 - [RegRCSMessage](docs/RegRCSMessage.md)
 - [RegRCSMessageRCSMessage](docs/RegRCSMessageRCSMessage.md)
 - [RegTemplateInfo](docs/RegTemplateInfo.md)
 - [RegTemplateInfoBodyInner](docs/RegTemplateInfoBodyInner.md)
 - [RegTemplateInfoButtonsInner](docs/RegTemplateInfoButtonsInner.md)
 - [Reply](docs/Reply.md)
 - [RichcardMessage](docs/RichcardMessage.md)
 - [RichcardMessageRichcardMessage](docs/RichcardMessageRichcardMessage.md)
 - [RichcardMessageRichcardMessageMessage](docs/RichcardMessageRichcardMessageMessage.md)
 - [SampleLayout](docs/SampleLayout.md)
 - [SampleLayoutDetail](docs/SampleLayoutDetail.md)
 - [SettingsAction](docs/SettingsAction.md)
 - [SettingsActionSettingsAction](docs/SettingsActionSettingsAction.md)
 - [SettingsActionSettingsActionOneOf](docs/SettingsActionSettingsActionOneOf.md)
 - [SettingsActionSettingsActionOneOf1](docs/SettingsActionSettingsActionOneOf1.md)
 - [ShareAction](docs/ShareAction.md)
 - [ShareActionShareAction](docs/ShareActionShareAction.md)
 - [ShareActionShareActionOneOf](docs/ShareActionShareActionOneOf.md)
 - [StatQueryBrandprofileBrandIdGet200Response](docs/StatQueryBrandprofileBrandIdGet200Response.md)
 - [StatQueryMessageBrandIdGet200Response](docs/StatQueryMessageBrandIdGet200Response.md)
 - [StatQueryMessageButtonBrandIdGet200Response](docs/StatQueryMessageButtonBrandIdGet200Response.md)
 - [StatQueryPersistentMenuBrandIdGet200Response](docs/StatQueryPersistentMenuBrandIdGet200Response.md)
 - [StringObject](docs/StringObject.md)
 - [SubActionData](docs/SubActionData.md)
 - [SubStatData](docs/SubStatData.md)
 - [Suggestion](docs/Suggestion.md)
 - [TableOption](docs/TableOption.md)
 - [TemplateFileInfo](docs/TemplateFileInfo.md)
 - [TextDecoration](docs/TextDecoration.md)
 - [TextView](docs/TextView.md)
 - [TokenInfo](docs/TokenInfo.md)
 - [TokenPostRequest](docs/TokenPostRequest.md)
 - [UrlAction](docs/UrlAction.md)
 - [UrlActionUrlAction](docs/UrlActionUrlAction.md)
 - [UrlActionUrlActionOneOf](docs/UrlActionUrlActionOneOf.md)
 - [UrlActionUrlActionOneOfOpenUrl](docs/UrlActionUrlActionOneOfOpenUrl.md)
 - [UsableQueryChatbotIdChatbotIdGet200Response](docs/UsableQueryChatbotIdChatbotIdGet200Response.md)
 - [View](docs/View.md)
 - [Views](docs/Views.md)
 - [ViewsClick](docs/ViewsClick.md)
 - [Visibility](docs/Visibility.md)
 - [WebhookErrorInfo](docs/WebhookErrorInfo.md)
 - [WebhookErrorInfoError](docs/WebhookErrorInfoError.md)
 - [WebhookUrlPostRequest](docs/WebhookUrlPostRequest.md)
 - [WidgetPolicy](docs/WidgetPolicy.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="jwtAuth"></a>
### jwtAuth


- **Type**: HTTP Bearer Token authentication (JWT)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



