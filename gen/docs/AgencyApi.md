# AgencyApi

All URIs are relative to *https://api-qa.rcsbizcenter.com/api/1.1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**agencyAgencyIdAgencyKeyGet**](AgencyApi.md#agencyAgencyIdAgencyKeyGet) | **GET** /agency/{agencyId}/agencyKey | RBC에서 발급된 최종 대행사 키를 조회합니다.  |
| [**agencyAgencyIdBrandBrandIdGet**](AgencyApi.md#agencyAgencyIdBrandBrandIdGet) | **GET** /agency/{agencyId}/brand/{brandId} | 계약된 브랜드 정보를 개별 조회 합니다.  |
| [**agencyAgencyIdBrandBrandIdPut**](AgencyApi.md#agencyAgencyIdBrandBrandIdPut) | **PUT** /agency/{agencyId}/brand/{brandId} | 대행사가 운영 중인 브랜드 정보를 수정 합니다. 브랜드명, 프로필 이미지가 수정되면 다시 승인을 받아야 합니다.  |
| [**agencyAgencyIdContractGet**](AgencyApi.md#agencyAgencyIdContractGet) | **GET** /agency/{agencyId}/contract | 대행사가 계약된 브랜드 리스트를 제공합니다.  |
| [**agencyAgencyIdCorpCorpRegNumBrandGet**](AgencyApi.md#agencyAgencyIdCorpCorpRegNumBrandGet) | **GET** /agency/{agencyId}/corp/{corpRegNum}/brand | 대행사가 계약된 브랜드를 기업 단위로 조회합니다.  |
| [**agencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet**](AgencyApi.md#agencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet) | **GET** /agency/{agencyId}/corp/{corpRegNum}/chatbot/{chatbotId} | 발신번호가 RBC에 대상 사업자의 발신번호로 등록되어 있는지 확인할 수 있습니다.  |
| [**agencyAgencyIdCorpCorpRegNumGet**](AgencyApi.md#agencyAgencyIdCorpCorpRegNumGet) | **GET** /agency/{agencyId}/corp/{corpRegNum} | 사업자등록번호로 RBC 가입 여부와 브랜드 대행사 지정 상태를 확인할 수 있습니다.  |
| [**baselayoutComponentGet**](AgencyApi.md#baselayoutComponentGet) | **GET** /baselayout/component | 레이아웃 등록/수정 시 사용 가능한 컴포넌트 목록을 조회 합니다.  |
| [**baselayoutProductRuleGet**](AgencyApi.md#baselayoutProductRuleGet) | **GET** /baselayout/product/rule | 메시지 상품별 레이아웃 구성 규칙을 조회합니다.  |
| [**baselayoutSampleGet**](AgencyApi.md#baselayoutSampleGet) | **GET** /baselayout/sample | 레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 목록 입니다.  |
| [**baselayoutSampleSampleLayoutIdGet**](AgencyApi.md#baselayoutSampleSampleLayoutIdGet) | **GET** /baselayout/sample/{sampleLayoutId} | 레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 상세 정보를 조회합니다.  |
| [**brandBrandIdAutoreplymsgAutoReplyMsgIdDelete**](AgencyApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdDelete) | **DELETE** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지를 삭제합니다.  |
| [**brandBrandIdAutoreplymsgAutoReplyMsgIdGet**](AgencyApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdGet) | **GET** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지의 상세 정보를 조회합니다.  |
| [**brandBrandIdAutoreplymsgAutoReplyMsgIdPut**](AgencyApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdPut) | **PUT** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지의 정보를 업데이트합니다.  |
| [**brandBrandIdAutoreplymsgFileFileIdGet**](AgencyApi.md#brandBrandIdAutoreplymsgFileFileIdGet) | **GET** /brand/{brandId}/autoreplymsg/file/{fileId} | 자동응답메시지에서 사용할 이미지 파일 상세 정보를 조회합니다.  |
| [**brandBrandIdAutoreplymsgFilePost**](AgencyApi.md#brandBrandIdAutoreplymsgFilePost) | **POST** /brand/{brandId}/autoreplymsg/file | 자동응답메시지에서 사용할 이미지 파일을 등록합니다.  |
| [**brandBrandIdAutoreplymsgGet**](AgencyApi.md#brandBrandIdAutoreplymsgGet) | **GET** /brand/{brandId}/autoreplymsg | 브랜드 내에 등록된 자동응답메시지 목록을 조회합니다.  |
| [**brandBrandIdAutoreplymsgPost**](AgencyApi.md#brandBrandIdAutoreplymsgPost) | **POST** /brand/{brandId}/autoreplymsg | 브랜드에 자동응답메시지를 등록합니다.  |
| [**brandBrandIdBidirectionalChatbotChatbotIdDelete**](AgencyApi.md#brandBrandIdBidirectionalChatbotChatbotIdDelete) | **DELETE** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향)을 삭제합니다.  |
| [**brandBrandIdBidirectionalChatbotChatbotIdGet**](AgencyApi.md#brandBrandIdBidirectionalChatbotChatbotIdGet) | **GET** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향)의 상세 정보를 조회합니다.  |
| [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete**](AgencyApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete) | **DELETE** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방의 대화방메뉴를 삭제합니다.  |
| [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut**](AgencyApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut) | **PUT** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu/pause | 중계사만 사용이 가능하며, 양방향 대화방의 대화방메뉴 사용을 중지 또는 재개합니다.  |
| [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost**](AgencyApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost) | **POST** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방에 대화방메뉴를 등록합니다.  |
| [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut**](AgencyApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut) | **PUT** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방의 대화방메뉴를 수정합니다.  |
| [**brandBrandIdBidirectionalChatbotChatbotIdPut**](AgencyApi.md#brandBrandIdBidirectionalChatbotChatbotIdPut) | **PUT** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향) 정보를 수정 합니다.  |
| [**brandBrandIdBidirectionalChatbotGet**](AgencyApi.md#brandBrandIdBidirectionalChatbotGet) | **GET** /brand/{brandId}/bidirectional/chatbot | 브랜드에 등록된 대화방(양방향) 목록을 조회합니다.  |
| [**brandBrandIdBidirectionalChatbotPost**](AgencyApi.md#brandBrandIdBidirectionalChatbotPost) | **POST** /brand/{brandId}/bidirectional/chatbot | 대화방(양방향)을 등록합니다.  |
| [**brandBrandIdChatbotChatbotIdCancelPut**](AgencyApi.md#brandBrandIdChatbotChatbotIdCancelPut) | **PUT** /brand/{brandId}/chatbot/{chatbotId}/cancel | 지정된 대화방(발신번호, 양방향ID)의 승인요청을 취소합니다.  |
| [**brandBrandIdChatbotChatbotIdDelete**](AgencyApi.md#brandBrandIdChatbotChatbotIdDelete) | **DELETE** /brand/{brandId}/chatbot/{chatbotId} | 대화방(발신번호)을 삭제합니다.  |
| [**brandBrandIdChatbotChatbotIdGet**](AgencyApi.md#brandBrandIdChatbotChatbotIdGet) | **GET** /brand/{brandId}/chatbot/{chatbotId} | 지정된 대화방(발신번호)의 상세 정보를 조회합니다.  |
| [**brandBrandIdChatbotChatbotIdPut**](AgencyApi.md#brandBrandIdChatbotChatbotIdPut) | **PUT** /brand/{brandId}/chatbot/{chatbotId} | 지정된 대화방(발신번호)의 정보를 업데이트합니다.  |
| [**brandBrandIdChatbotGet**](AgencyApi.md#brandBrandIdChatbotGet) | **GET** /brand/{brandId}/chatbot | 브랜드 내에 등록된 대화방 목록을 조회합니다.  |
| [**brandBrandIdChatbotPost**](AgencyApi.md#brandBrandIdChatbotPost) | **POST** /brand/{brandId}/chatbot | 지정된 브랜드에 대화방(발신번호)을 등록합니다.  |
| [**brandBrandIdLayoutGet**](AgencyApi.md#brandBrandIdLayoutGet) | **GET** /brand/{brandId}/layout | 브랜드 별 등록된 레이아웃 목록을 조회합니다.  |
| [**brandBrandIdLayoutLayoutIdDelete**](AgencyApi.md#brandBrandIdLayoutLayoutIdDelete) | **DELETE** /brand/{brandId}/layout/{layoutId} | 브랜드 별 등록된 레이아웃을 삭제합니다.  |
| [**brandBrandIdLayoutLayoutIdGet**](AgencyApi.md#brandBrandIdLayoutLayoutIdGet) | **GET** /brand/{brandId}/layout/{layoutId} | 브랜드 별 등록된 레이아웃 목록을 조회합니다.  |
| [**brandBrandIdLayoutLayoutIdPut**](AgencyApi.md#brandBrandIdLayoutLayoutIdPut) | **PUT** /brand/{brandId}/layout/{layoutId} | 브랜드 내 레이아웃을 수정 합니다.    |
| [**brandBrandIdLayoutPost**](AgencyApi.md#brandBrandIdLayoutPost) | **POST** /brand/{brandId}/layout | 브랜드 내에서 사용할 수 있는 레이아웃을 등록 합니다.    |
| [**brandBrandIdLogoFileIdCancelPut**](AgencyApi.md#brandBrandIdLogoFileIdCancelPut) | **PUT** /brand/{brandId}/logo/{fileId}/cancel | 로고의 승인요청을 취소합니다.  |
| [**brandBrandIdLogoFileIdDelete**](AgencyApi.md#brandBrandIdLogoFileIdDelete) | **DELETE** /brand/{brandId}/logo/{fileId} | 브랜드에 등록된 승인 이전 상태의 로고를 삭제 합니다.  |
| [**brandBrandIdLogoFileIdGet**](AgencyApi.md#brandBrandIdLogoFileIdGet) | **GET** /brand/{brandId}/logo/{fileId} | 브랜드에 등록된 로고를 단건 상세 조회합니다.  |
| [**brandBrandIdLogoFileIdPut**](AgencyApi.md#brandBrandIdLogoFileIdPut) | **PUT** /brand/{brandId}/logo/{fileId} | 브랜드에 등록된 로고를 수정 승인요청 합니다.  |
| [**brandBrandIdLogoGet**](AgencyApi.md#brandBrandIdLogoGet) | **GET** /brand/{brandId}/logo | 브랜드 별 등록된 로고 목록을 조회합니다.  |
| [**brandBrandIdLogoPost**](AgencyApi.md#brandBrandIdLogoPost) | **POST** /brand/{brandId}/logo | 브랜드 내에서 사용할 수 있는 로고를 등록 합니다.    |
| [**brandBrandIdMessagebaseGet**](AgencyApi.md#brandBrandIdMessagebaseGet) | **GET** /brand/{brandId}/messagebase | 브랜드에 등록된 템플릿을 조회합니다.  |
| [**brandBrandIdMessagebaseMessagebaseIdCancelPut**](AgencyApi.md#brandBrandIdMessagebaseMessagebaseIdCancelPut) | **PUT** /brand/{brandId}/messagebase/{messagebaseId}/cancel | 지정된 템플릿의 승인요청을 취소합니다.  |
| [**brandBrandIdMessagebaseMessagebaseIdDelete**](AgencyApi.md#brandBrandIdMessagebaseMessagebaseIdDelete) | **DELETE** /brand/{brandId}/messagebase/{messagebaseId} | 브랜드 내 지정된 템플릿을 삭제합니다.  |
| [**brandBrandIdMessagebaseMessagebaseIdGet**](AgencyApi.md#brandBrandIdMessagebaseMessagebaseIdGet) | **GET** /brand/{brandId}/messagebase/{messagebaseId} | 브랜드에 등록된 지정 템플릿 상세 내역을 조회합니다.  |
| [**brandBrandIdMessagebaseMessagebaseIdPut**](AgencyApi.md#brandBrandIdMessagebaseMessagebaseIdPut) | **PUT** /brand/{brandId}/messagebase/{messagebaseId} | 지정 템플릿을 업데이트 합니다.  |
| [**brandBrandIdMessagebasePost**](AgencyApi.md#brandBrandIdMessagebasePost) | **POST** /brand/{brandId}/messagebase | 브랜드 내에서 사용할 구형 텍스트 템플릿을 등록합니다. 추가된 신규 템플릿 유형은 POST /brand/{brandId}/v2/messagebase 을 이용해야 합니다.  |
| [**brandBrandIdV2MessagebaseFileFileIdGet**](AgencyApi.md#brandBrandIdV2MessagebaseFileFileIdGet) | **GET** /brand/{brandId}/v2/messagebase/file/{fileId} | 이미지 템플릿 용으로 등록한 이미지 파일 정보를 조회 합니다.  |
| [**brandBrandIdV2MessagebaseFilePost**](AgencyApi.md#brandBrandIdV2MessagebaseFilePost) | **POST** /brand/{brandId}/v2/messagebase/file | 이미지 템플릿에서 사용할 이미지 파일을 등록합니다.  |
| [**brandBrandIdV2MessagebaseMessagebaseIdPut**](AgencyApi.md#brandBrandIdV2MessagebaseMessagebaseIdPut) | **PUT** /brand/{brandId}/v2/messagebase/{messagebaseId} | 이미 등록된 템플릿의 내용을 수정합니다.  |
| [**brandBrandIdV2MessagebasePost**](AgencyApi.md#brandBrandIdV2MessagebasePost) | **POST** /brand/{brandId}/v2/messagebase | 브랜드 내에서 사용할 템플릿을 등록합니다.   Openrichcard 규격의 모든 템플릿 등록이 가능합니다.  |
| [**logoCommonGet**](AgencyApi.md#logoCommonGet) | **GET** /logo/common | RBC에서 제공되는 기본 아이콘 이미지 정보를 조회합니다.  |
| [**messagebaseCommonGet**](AgencyApi.md#messagebaseCommonGet) | **GET** /messagebase/common | 이통사가 기본 제공하는 공통템플릿을 조회합니다.  |
| [**messagebaseCommonMessagebaseIdGet**](AgencyApi.md#messagebaseCommonMessagebaseIdGet) | **GET** /messagebase/common/{messagebaseId} | 이통사가 기본 제공하는 공통템플릿 별 상세 내용을 조회합니다.  |
| [**messagebaseMessagebaseformGet**](AgencyApi.md#messagebaseMessagebaseformGet) | **GET** /messagebase/messagebaseform | 템플릿 양식 목록을 조회합니다.  |
| [**messagebaseMessagebaseformMessagebaseformIdGet**](AgencyApi.md#messagebaseMessagebaseformMessagebaseformIdGet) | **GET** /messagebase/messagebaseform/{messagebaseformId} | 템플릿 유형의 상세 내용을 조회합니다.  |
| [**messagebaseMessagebaseformMessagebaseformIdLogoGet**](AgencyApi.md#messagebaseMessagebaseformMessagebaseformIdLogoGet) | **GET** /messagebase/messagebaseform/{messagebaseformId}/logo | RBC에서 템플릿용으로 제공되는 기본 로고 이미지 정보를 조회합니다.  |
| [**statQueryBrandprofileBrandIdGet**](AgencyApi.md#statQueryBrandprofileBrandIdGet) | **GET** /statQuery/brandprofile/{brandId} | (준비중) 브랜드프로필 노출 통계를 조회합니다.  |
| [**statQueryMessageBrandIdGet**](AgencyApi.md#statQueryMessageBrandIdGet) | **GET** /statQuery/message/{brandId} | 고객반응 통계 - 캠페인 메시지 발송/읽음확인 통계를 조회합니다.  |
| [**statQueryMessageButtonBrandIdGet**](AgencyApi.md#statQueryMessageButtonBrandIdGet) | **GET** /statQuery/messageButton/{brandId} | 고객반응 통계 - 캠페인 메시지 버튼 클릭 통계를 조회합니다.  |
| [**statQueryPersistentMenuBrandIdGet**](AgencyApi.md#statQueryPersistentMenuBrandIdGet) | **GET** /statQuery/persistentMenu/{brandId} | 고객반응 통계 - 대화방 메뉴 클릭 통계를 조회합니다.  |
| [**usableQueryChatbotIdChatbotIdGet**](AgencyApi.md#usableQueryChatbotIdChatbotIdGet) | **GET** /usableQuery/chatbotId/{chatbotId} | 대화방ID 등록 가능 여부를 조회 합니다.  |
| [**webhookUrlBidirectionalPost**](AgencyApi.md#webhookUrlBidirectionalPost) | **POST** /{webhookUrl}/bidirectional | 양방향 서비스 제공 중계사에서 구현해야 하는 Webhook URI 입니다.  |
| [**webhookUrlPost**](AgencyApi.md#webhookUrlPost) | **POST** /{webhookUrl} | 대행사에서 등록한 수신서버 URL을 통해 RBC에서 발생하는 데이터의 등록/수정/삭제 이벤트 정보를 전달합니다.  |



## agencyAgencyIdAgencyKeyGet

> AgencyAgencyIdAgencyKeyGet200Response agencyAgencyIdAgencyKeyGet(agencyId)

RBC에서 발급된 최종 대행사 키를 조회합니다. 

RBC 에서 발급된 최종 대행사 키를 조회합니다.      + **계정 권한: 대행사**    대행사 키의 재발급, 삭제는 RBC 홈페이지에서만 가능합니다.   대행사 키 재발급 시,      + 이전 대행사 키는 재발급 후 24시간 동안 유효하며, 24시간 경과 후 자동 삭제됩니다.      + 대행사키의 유출이 우려되어 즉시 삭제를 원할 경우, RBC 웹사이트를 통해 직전 대행사키를 수동 삭제할 수 있습니다.       이 경우 신규 대행사키로만 메시지 전송이 성공되며, 직전 대행사키로 메시지 전송 시 실패됩니다.       ( 경로 : RBC대행사 계정 로그인 &gt; 내 계정관리 &gt; Agency Key ) 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
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

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agencyId** | **String**| RCS Biz Center에 등록된 대행사 ID 입니다. | |

### Return type

[**AgencyAgencyIdAgencyKeyGet200Response**](AgencyAgencyIdAgencyKeyGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 현재 대행사 키 정보를 응답합니다.  |  -  |
| **0** |  |  -  |


## agencyAgencyIdBrandBrandIdGet

> CorpPersonIdBrandBrandIdGet200Response agencyAgencyIdBrandBrandIdGet(agencyId, brandId)

계약된 브랜드 정보를 개별 조회 합니다. 

계약된 브랜드 정보를 개별 조회 합니다.   승인된 브랜드만 조회가 가능합니다.     + **계정 권한: 대행사**     + **브랜드 권한: 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String agencyId = "agencyId_example"; // String | RCS Biz Center에 등록된 대행사 ID 입니다.
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        try {
            CorpPersonIdBrandBrandIdGet200Response result = apiInstance.agencyAgencyIdBrandBrandIdGet(agencyId, brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#agencyAgencyIdBrandBrandIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agencyId** | **String**| RCS Biz Center에 등록된 대행사 ID 입니다. | |
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |

### Return type

[**CorpPersonIdBrandBrandIdGet200Response**](CorpPersonIdBrandBrandIdGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 조회된 브랜드 정보를 응답합니다.  |  -  |
| **0** |  |  -  |


## agencyAgencyIdBrandBrandIdPut

> CorpPersonIdBrandBrandIdPut200Response agencyAgencyIdBrandBrandIdPut(agencyId, brandId, xRCSBrandkey, regBrand, brandProfile, brandBackground)

대행사가 운영 중인 브랜드 정보를 수정 합니다. 브랜드명, 프로필 이미지가 수정되면 다시 승인을 받아야 합니다. 

대행사 계정으로 현재 운영 중인 브랜드 정보를 수정 합니다.    브랜드 권한(Contract)이 있어야 수정이 가능하며 Header에 브랜드 Key를 삽입하여야 합니다.   **브랜드명** 또는 **프로필 이미지**가 수정되면 다시 승인을 받아야 합니다. 상태가 **승인대기**로 변경 됩니다.   이외 정보 수정은 별도의 승인 과정 없이 업데이트 됩니다.   수정된 데이터가 이통 3사로 전송되는 과정에서 전송이 지연되거나 장애로 인해 이통 3사 모두 전송이 완료되지 못한 경우,   브랜드 정보 조회 데이터와 단말에서 표시되는 브랜드 홈 정보가 상이할 수 있습니다.      + **계정 권한 : 대행사**     + **브랜드 권한 : 운영자**     + **수정 가능 상태 : 승인, 반려(수정승인)**     + **수정 승인 요청 시 상태 : 승인대기(수정승인)** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String agencyId = "agencyId_example"; // String | 브랜드의 운영 권한이 있는 대행사 ID 입니다.
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        RegBrandInfo regBrand = new RegBrandInfo(); // RegBrandInfo | 
        File brandProfile = new File("/path/to/file"); // File | 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 권장 / 파일형식 : png (최대1MB)** 
        File brandBackground = new File("/path/to/file"); // File | 브랜드 백그라운드 이미지를 업로드합니다.   등록되어 있는 브랜드 백그라운드 이미지를 제거하기 위해서는 파일 없이 brandBackground form key만 전송하면 됩니다.\\\\ **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 권장 / 파일형식 : jpg, png (최대1MB)** 
        try {
            CorpPersonIdBrandBrandIdPut200Response result = apiInstance.agencyAgencyIdBrandBrandIdPut(agencyId, brandId, xRCSBrandkey, regBrand, brandProfile, brandBackground);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#agencyAgencyIdBrandBrandIdPut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agencyId** | **String**| 브랜드의 운영 권한이 있는 대행사 ID 입니다. | |
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **regBrand** | [**RegBrandInfo**](RegBrandInfo.md)|  | [optional] |
| **brandProfile** | **File**| 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 권장 / 파일형식 : png (최대1MB)**  | [optional] |
| **brandBackground** | **File**| 브랜드 백그라운드 이미지를 업로드합니다.   등록되어 있는 브랜드 백그라운드 이미지를 제거하기 위해서는 파일 없이 brandBackground form key만 전송하면 됩니다.\\\\ **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 권장 / 파일형식 : jpg, png (최대1MB)**  | [optional] |

### Return type

[**CorpPersonIdBrandBrandIdPut200Response**](CorpPersonIdBrandBrandIdPut200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 정상적으로 처리된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## agencyAgencyIdContractGet

> AgencyAgencyIdContractGet200Response agencyAgencyIdContractGet(agencyId, offset, limit)

대행사가 계약된 브랜드 리스트를 제공합니다. 

대행사가 계약된 브랜드 리스트를 제공합니다.   브랜드별 기업의 사업자등록번호를 함께 전달 하여 대행사에 등록된 기업 정보와 맵핑할 수 있습니다.      + **계정 권한: 대행사**   

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String agencyId = "agencyId_example"; // String | RCS Biz Center에 등록된 대행사 ID 입니다.
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            AgencyAgencyIdContractGet200Response result = apiInstance.agencyAgencyIdContractGet(agencyId, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#agencyAgencyIdContractGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agencyId** | **String**| RCS Biz Center에 등록된 대행사 ID 입니다. | |
| **offset** | **Integer**| 시작 offset 번호(default: 0) 입니다. | [optional] |
| **limit** | **Integer**| 조회 최대 건수(default: 100, maximum: 1000) 입니다. | [optional] |

### Return type

[**AgencyAgencyIdContractGet200Response**](AgencyAgencyIdContractGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 정상적으로 처리된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## agencyAgencyIdCorpCorpRegNumBrandGet

> AgencyAgencyIdContractGet200Response agencyAgencyIdCorpCorpRegNumBrandGet(agencyId, corpRegNum, offset, limit)

대행사가 계약된 브랜드를 기업 단위로 조회합니다. 

대행사가 계약된 브랜드를 기업 단위로 조회합니다.   기업 단위 조회 시 사업자등록번호를 이용합니다.      + **계정 권한: 대행사**   

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String agencyId = "agencyId_example"; // String | RCS Biz Center에 등록된 대행사 ID 입니다.
        String corpRegNum = "corpRegNum_example"; // String | 대상 기업의 사업자등록번호(10자리) 입니다.
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            AgencyAgencyIdContractGet200Response result = apiInstance.agencyAgencyIdCorpCorpRegNumBrandGet(agencyId, corpRegNum, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#agencyAgencyIdCorpCorpRegNumBrandGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agencyId** | **String**| RCS Biz Center에 등록된 대행사 ID 입니다. | |
| **corpRegNum** | **String**| 대상 기업의 사업자등록번호(10자리) 입니다. | |
| **offset** | **Integer**| 시작 offset 번호(default: 0) 입니다. | [optional] |
| **limit** | **Integer**| 조회 최대 건수(default: 100, maximum: 1000) 입니다. | [optional] |

### Return type

[**AgencyAgencyIdContractGet200Response**](AgencyAgencyIdContractGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 계약된 브랜드 목록이 응답됩니다.  |  -  |
| **0** |  |  -  |


## agencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet

> AgencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet200Response agencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet(agencyId, corpRegNum, chatbotId)

발신번호가 RBC에 대상 사업자의 발신번호로 등록되어 있는지 확인할 수 있습니다. 

발신번호가 RBC에 대상 사업자의 발신번호로 등록되어 있는지 확인할 수 있습니다.    + **계정 권한: 대행사**   

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String agencyId = "agencyId_example"; // String | RCS Biz Center에 등록된 대행사 ID 입니다.
        String corpRegNum = "corpRegNum_example"; // String | 조회 대상 사업자등록번호(10자리) 입니다.
        String chatbotId = "chatbotId_example"; // String | 확인하고자 하는 발신번호 입니다.
        try {
            AgencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet200Response result = apiInstance.agencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet(agencyId, corpRegNum, chatbotId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#agencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agencyId** | **String**| RCS Biz Center에 등록된 대행사 ID 입니다. | |
| **corpRegNum** | **String**| 조회 대상 사업자등록번호(10자리) 입니다. | |
| **chatbotId** | **String**| 확인하고자 하는 발신번호 입니다. | |

### Return type

[**AgencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet200Response**](AgencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 등록 여부 확인 결과를 제공합니다.    |  -  |
| **0** |  |  -  |


## agencyAgencyIdCorpCorpRegNumGet

> AgencyAgencyIdCorpCorpRegNumGet200Response agencyAgencyIdCorpCorpRegNumGet(agencyId, corpRegNum)

사업자등록번호로 RBC 가입 여부와 브랜드 대행사 지정 상태를 확인할 수 있습니다. 

사업자등록번호로 RBC 가입 여부와 브랜드 대행사 지정 상태를 확인할 수 있습니다.      + **계정 권한: 대행사**   

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String agencyId = "agencyId_example"; // String | RCS Biz Center에 등록된 대행사 ID 입니다.
        String corpRegNum = "corpRegNum_example"; // String | 조회 대상 사업자등록번호(10자리) 입니다.
        try {
            AgencyAgencyIdCorpCorpRegNumGet200Response result = apiInstance.agencyAgencyIdCorpCorpRegNumGet(agencyId, corpRegNum);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#agencyAgencyIdCorpCorpRegNumGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **agencyId** | **String**| RCS Biz Center에 등록된 대행사 ID 입니다. | |
| **corpRegNum** | **String**| 조회 대상 사업자등록번호(10자리) 입니다. | |

### Return type

[**AgencyAgencyIdCorpCorpRegNumGet200Response**](AgencyAgencyIdCorpCorpRegNumGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 가입 여부, 대행사 지정 상태를 응답합니다.    |  -  |
| **0** |  |  -  |


## baselayoutComponentGet

> BaselayoutComponentGet200Response baselayoutComponentGet(offset, limit)

레이아웃 등록/수정 시 사용 가능한 컴포넌트 목록을 조회 합니다. 

레이아웃 등록/수정 시 사용 가능한 컴포넌트 목록을 조회 합니다.   컴포넌트 별 상세 내역이 제공되므로 별도의 컴포넌트별 상세 조회 API는 제공하지 않습니다.      + **계정 권한: 대행사** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BaselayoutComponentGet200Response result = apiInstance.baselayoutComponentGet(offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#baselayoutComponentGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **offset** | **Integer**| 시작 offset 번호(default: 0) 입니다. | [optional] |
| **limit** | **Integer**| 조회 최대 건수(default: 100, maximum: 1000) 입니다. | [optional] |

### Return type

[**BaselayoutComponentGet200Response**](BaselayoutComponentGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 컴포넌트 리스트를 제공합니다.  |  -  |
| **0** |  |  -  |


## baselayoutProductRuleGet

> BaselayoutProductRuleGet200Response baselayoutProductRuleGet()

메시지 상품별 레이아웃 구성 규칙을 조회합니다. 

메시지 상품별 레이아웃 구성 규칙을 조회합니다.   본 규칙에 부합해야만 레이아웃 등록/수정이 가능합니다.      + **계정 권한: 대행사** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        try {
            BaselayoutProductRuleGet200Response result = apiInstance.baselayoutProductRuleGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#baselayoutProductRuleGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**BaselayoutProductRuleGet200Response**](BaselayoutProductRuleGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 상품별 레이아웃 구성 규칙 정보를 응답합니다.  |  -  |
| **0** |  |  -  |


## baselayoutSampleGet

> BaselayoutSampleGet200Response baselayoutSampleGet(offset, limit)

레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 목록 입니다. 

레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 목록 입니다.      + **계정 권한: 대행사** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BaselayoutSampleGet200Response result = apiInstance.baselayoutSampleGet(offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#baselayoutSampleGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **offset** | **Integer**| 시작 offset 번호(default: 0) 입니다. | [optional] |
| **limit** | **Integer**| 조회 최대 건수(default: 100, maximum: 1000) 입니다. | [optional] |

### Return type

[**BaselayoutSampleGet200Response**](BaselayoutSampleGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 샘플 레이아웃 목록을 제공합니다.  |  -  |
| **0** |  |  -  |


## baselayoutSampleSampleLayoutIdGet

> BaselayoutSampleSampleLayoutIdGet200Response baselayoutSampleSampleLayoutIdGet(sampleLayoutId)

레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 상세 정보를 조회합니다. 

레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 상세 정보를 조회합니다.      + **계정 권한: 대행사** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String sampleLayoutId = "sampleLayoutId_example"; // String | 샘플레이아웃 ID 입니다.
        try {
            BaselayoutSampleSampleLayoutIdGet200Response result = apiInstance.baselayoutSampleSampleLayoutIdGet(sampleLayoutId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#baselayoutSampleSampleLayoutIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sampleLayoutId** | **String**| 샘플레이아웃 ID 입니다. | |

### Return type

[**BaselayoutSampleSampleLayoutIdGet200Response**](BaselayoutSampleSampleLayoutIdGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 샘플 레이아웃 상세 조회 결과를 응답합니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdAutoreplymsgAutoReplyMsgIdDelete

> BrandBrandIdAutoreplymsgPost200Response brandBrandIdAutoreplymsgAutoReplyMsgIdDelete(brandId, autoReplyMsgId, xRCSBrandkey)

자동응답메시지를 삭제합니다. 

자동응답메시지를 삭제합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String autoReplyMsgId = "autoReplyMsgId_example"; // String | 브랜드 내 자동응답메시지 정보 접근시 사용되는 자동응답메시지ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdAutoreplymsgPost200Response result = apiInstance.brandBrandIdAutoreplymsgAutoReplyMsgIdDelete(brandId, autoReplyMsgId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdAutoreplymsgAutoReplyMsgIdDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **autoReplyMsgId** | **String**| 브랜드 내 자동응답메시지 정보 접근시 사용되는 자동응답메시지ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**BrandBrandIdAutoreplymsgPost200Response**](BrandBrandIdAutoreplymsgPost200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 성공적으로 삭제되었을 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdAutoreplymsgAutoReplyMsgIdGet

> BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response brandBrandIdAutoreplymsgAutoReplyMsgIdGet(brandId, autoReplyMsgId, xRCSBrandkey)

자동응답메시지의 상세 정보를 조회합니다. 

자동응답메시지의 상세 정보를 조회합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String autoReplyMsgId = "autoReplyMsgId_example"; // String | 브랜드 내 자동응답메시지 정보 접근시 사용되는 자동응답메시지ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response result = apiInstance.brandBrandIdAutoreplymsgAutoReplyMsgIdGet(brandId, autoReplyMsgId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdAutoreplymsgAutoReplyMsgIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **autoReplyMsgId** | **String**| 브랜드 내 자동응답메시지 정보 접근시 사용되는 자동응답메시지ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response**](BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 상세 내역이 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdAutoreplymsgAutoReplyMsgIdPut

> BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response brandBrandIdAutoreplymsgAutoReplyMsgIdPut(brandId, autoReplyMsgId, xRCSBrandkey, regAutoReplyMsgInfo)

자동응답메시지의 정보를 업데이트합니다. 

자동응답메시지의 정보를 업데이트합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**   자동응답메시지에 등록 가능한 액션이 추가 되었습니다.      + 전화걸기   + 웹사이트(내부브라우져)   + 웹사이트(외부브라우져)   + 대화방연결(메시지작성)   + 캘린더(일정)   + 지도(좌표)   + 지도(키워드)   + 지도(현재위치)   + &lt;신규&gt;자동응답메시지연결   + &lt;신규&gt;챗봇연결    제공되는 productcode &#x3D; chat 해당 messagebaseId를 지정하여 사용하며 다음과 같이 처리 됩니다.          + 기본 말풍선(SCS00000), 텍스트 카드(SCL00000)는 기본 말풍선(SCS00000)으로 처리     + 세로형_Meduim(SCwThM00), 세로형_Tall(SCwThT00)은 세로형_Meduim(SCwThM00)으로 처리   + 슬라이드형_Medium, 슬라이드형_Small은 슬라이드형_Medium으로 처리       - 슬라이드형 Medium ID: CCwMhM0200 ~ CCwMhM0600        **따라서 지정된 messagebaseId에만 존재하는 필드가 전환되는 messagebaseId에 존재하지 않는 경우 무시됩니다.**    예를 들어, 텍스트 카드로 등록 시 title을 입력하더라도 기본 말풍선은 title을 지원하지 않으므로 title이 적용되지 않습니다. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String autoReplyMsgId = "autoReplyMsgId_example"; // String | 브랜드 내 자동응답메시지 정보 접근시 사용되는 자동응답메시지ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        RegAutoReplyMsgInfo regAutoReplyMsgInfo = new RegAutoReplyMsgInfo(); // RegAutoReplyMsgInfo | 
        try {
            BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response result = apiInstance.brandBrandIdAutoreplymsgAutoReplyMsgIdPut(brandId, autoReplyMsgId, xRCSBrandkey, regAutoReplyMsgInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdAutoreplymsgAutoReplyMsgIdPut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **autoReplyMsgId** | **String**| 브랜드 내 자동응답메시지 정보 접근시 사용되는 자동응답메시지ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **regAutoReplyMsgInfo** | [**RegAutoReplyMsgInfo**](RegAutoReplyMsgInfo.md)|  | [optional] |

### Return type

[**BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response**](BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 상세 내역이 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdAutoreplymsgFileFileIdGet

> BrandBrandIdAutoreplymsgFilePost200Response brandBrandIdAutoreplymsgFileFileIdGet(brandId, fileId, xRCSBrandkey)

자동응답메시지에서 사용할 이미지 파일 상세 정보를 조회합니다. 

자동응답메시지에서 사용할 이미지 파일 상세 정보를 조회합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String fileId = "fileId_example"; // String | 파일ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdAutoreplymsgFilePost200Response result = apiInstance.brandBrandIdAutoreplymsgFileFileIdGet(brandId, fileId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdAutoreplymsgFileFileIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **fileId** | **String**| 파일ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**BrandBrandIdAutoreplymsgFilePost200Response**](BrandBrandIdAutoreplymsgFilePost200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 등록된 파일 정보를 응답합니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdAutoreplymsgFilePost

> BrandBrandIdAutoreplymsgFilePost200Response brandBrandIdAutoreplymsgFilePost(brandId, xRCSBrandkey, _file)

자동응답메시지에서 사용할 이미지 파일을 등록합니다. 

자동응답메시지에서 사용할 이미지 파일을 등록합니다. 파일을 먼저 등록해야 자동응답메시지를 등록할 때 fileId를 메시지 내 지정할 수 있습니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Object _file = null; // Object | 자동응답메시지에 사용할 이미지 파일입니다. 
        try {
            BrandBrandIdAutoreplymsgFilePost200Response result = apiInstance.brandBrandIdAutoreplymsgFilePost(brandId, xRCSBrandkey, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdAutoreplymsgFilePost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **_file** | [**Object**](Object.md)| 자동응답메시지에 사용할 이미지 파일입니다.  | [optional] |

### Return type

[**BrandBrandIdAutoreplymsgFilePost200Response**](BrandBrandIdAutoreplymsgFilePost200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 성공적으로 등록되었을 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdAutoreplymsgGet

> BrandBrandIdAutoreplymsgGet200Response brandBrandIdAutoreplymsgGet(brandId, xRCSBrandkey, offset, limit)

브랜드 내에 등록된 자동응답메시지 목록을 조회합니다. 

브랜드 내에 등록된 자동응답메시지 목록을 조회합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BrandBrandIdAutoreplymsgGet200Response result = apiInstance.brandBrandIdAutoreplymsgGet(brandId, xRCSBrandkey, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdAutoreplymsgGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **offset** | **Integer**| 시작 offset 번호(default: 0) 입니다. | [optional] |
| **limit** | **Integer**| 조회 최대 건수(default: 100, maximum: 1000) 입니다. | [optional] |

### Return type

[**BrandBrandIdAutoreplymsgGet200Response**](BrandBrandIdAutoreplymsgGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 브랜드에 등록된 자동응답 목록이 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdAutoreplymsgPost

> BrandBrandIdAutoreplymsgPost200Response brandBrandIdAutoreplymsgPost(brandId, regAutoReplyMsgInfo, xRCSBrandkey)

브랜드에 자동응답메시지를 등록합니다. 

브랜드에 자동응답메시지를 등록합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**    자동응답메시지에 등록 가능한 액션이 추가 되었습니다.      + 전화걸기   + 웹사이트(내부브라우져)   + 웹사이트(외부브라우져)   + 대화방연결(메시지작성)   + 캘린더(일정)   + 지도(좌표)   + 지도(키워드)   + 지도(현재위치)   + &lt;신규&gt;자동응답메시지연결   + &lt;신규&gt;챗봇연결  제공되는 productcode &#x3D; chat 해당 messagebaseId를 지정하여 사용하며 다음과 같이 처리 됩니다.          + 기본 말풍선(SCS00000), 텍스트 카드(SCL00000)는 기본 말풍선(SCS00000)으로 처리     + 세로형_Meduim(SCwThM00), 세로형_Tall(SCwThT00)은 세로형_Meduim(SCwThM00)으로 처리   + 슬라이드형_Medium, 슬라이드형_Small은 슬라이드형_Medium으로 처리       - 슬라이드형 Medium ID: CCwMhM0200 ~ CCwMhM0600        **따라서 지정된 messagebaseId에만 존재하는 필드가 전환되는 messagebaseId에 존재하지 않는 경우 무시됩니다.**    예를 들어, 텍스트 카드로 등록 시 title을 입력하더라도 기본 말풍선은 title을 지원하지 않으므로 title이 적용되지 않습니다. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        RegAutoReplyMsgInfo regAutoReplyMsgInfo = new RegAutoReplyMsgInfo(); // RegAutoReplyMsgInfo | 자동응답메시지 등록 정보를 전송합니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdAutoreplymsgPost200Response result = apiInstance.brandBrandIdAutoreplymsgPost(brandId, regAutoReplyMsgInfo, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdAutoreplymsgPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **regAutoReplyMsgInfo** | [**RegAutoReplyMsgInfo**](RegAutoReplyMsgInfo.md)| 자동응답메시지 등록 정보를 전송합니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**BrandBrandIdAutoreplymsgPost200Response**](BrandBrandIdAutoreplymsgPost200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 자동응답메시지 등록 결과가 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdBidirectionalChatbotChatbotIdDelete

> BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response brandBrandIdBidirectionalChatbotChatbotIdDelete(brandId, chatbotId, xRCSBrandkey)

대화방(양방향)을 삭제합니다. 

양방향ID 대화방 삭제 또는 양방향 대행사가 연결된 발신번호 대화방에서 양방향 대행사 정보를 제거합니다.      + 양방향ID 대화방 삭제     + 발신번호 대화방에 연결된 양방향 대행사 정보 제거(양방향 서비스 속성 제거)      + 양방향 대행사 정보가 없는 발신번호 대화방 삭제(DELETE /brand/{brandId}/chatbot/{chatbotId} 동일)     - **계정 권한 : 마스터, 매니저, 대행사**     - **브랜드 권한 : 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response result = apiInstance.brandBrandIdBidirectionalChatbotChatbotIdDelete(brandId, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdBidirectionalChatbotChatbotIdDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **chatbotId** | **String**| 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response**](BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 성공적으로 삭제되었을 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdBidirectionalChatbotChatbotIdGet

> BrandBrandIdBidirectionalChatbotChatbotIdGet200Response brandBrandIdBidirectionalChatbotChatbotIdGet(brandId, chatbotId, xRCSBrandkey)

대화방(양방향)의 상세 정보를 조회합니다. 

대화방(양방향)의 상세 정보를 조회합니다.   양방향ID 또는 대화방메뉴, 양방향 대행사가 연결된 대화방의 상세 정보를 조회합니다.      + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdBidirectionalChatbotChatbotIdGet200Response result = apiInstance.brandBrandIdBidirectionalChatbotChatbotIdGet(brandId, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdBidirectionalChatbotChatbotIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **chatbotId** | **String**| 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**BrandBrandIdBidirectionalChatbotChatbotIdGet200Response**](BrandBrandIdBidirectionalChatbotChatbotIdGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 대화방(양방향)의 상세 내역이 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete

> BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete(brandId, chatbotId, xRCSBrandkey)

대화방의 대화방메뉴를 삭제합니다. 

대화방의 대화방메뉴를 삭제합니다.    삭제 요청한 대화방의 대화방메뉴만 삭제되며 대화방은 삭제되지 않습니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**   

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response result = apiInstance.brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete(brandId, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **chatbotId** | **String**| 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response**](BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 성공적으로 삭제된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut

> BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut200Response brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut(brandId, chatbotId, xRCSBrandkey, pausePersistentMenu)

중계사만 사용이 가능하며, 양방향 대화방의 대화방메뉴 사용을 중지 또는 재개합니다. 

양방향 대화방에 대화방메뉴 사용을 중지 또는 재개합니다.   양방향 대화방에 등록된 중계사만 사용이 가능합니다.   과금 미납 발생 등 특이사항이 발생한 경우 사용하며 대화방메뉴 중지에 대한 정보가 사용자에게 RBC 홈페이지에서 표시됩니다.   

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        PausePersistentMenu pausePersistentMenu = new PausePersistentMenu(); // PausePersistentMenu | 
        try {
            BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut200Response result = apiInstance.brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut(brandId, chatbotId, xRCSBrandkey, pausePersistentMenu);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **chatbotId** | **String**| 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **pausePersistentMenu** | [**PausePersistentMenu**](PausePersistentMenu.md)|  | [optional] |

### Return type

[**BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut200Response**](BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 성공적으로 처리된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost

> BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost(brandId, chatbotId, xRCSBrandkey, brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest)

대화방에 대화방메뉴를 등록합니다. 

대화방에 대화방메뉴를 등록합니다. 대화방 메뉴 개편으로 상위 메뉴, 하위 메뉴 구분 없이 최대 5개까지 메뉴를 지정할 수 있습니다.      ※  대표번호 문자서비스가 설정된 대화방에는 대화방메뉴를 등록할 수 없습니다. 즉, rcsReply 값이 1인 대화방에만 대화방메뉴를 설정할 수 있습니다.    + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest = new BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest(); // BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest | 
        try {
            BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response result = apiInstance.brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost(brandId, chatbotId, xRCSBrandkey, brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **chatbotId** | **String**| 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest** | [**BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest**](BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest.md)|  | [optional] |

### Return type

[**BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response**](BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 성공적으로 등록된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut

> BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut(brandId, chatbotId, xRCSBrandkey, brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest)

대화방의 대화방메뉴를 수정합니다. 

대화방의 대화방메뉴를 수정합니다. 대화방 메뉴 개편으로 상위 메뉴, 하위 메뉴 구분 없이 최대 5개까지 메뉴를 지정할 수 있습니다.      ※  대표번호 문자서비스가 설정된 대화방에는 대화방메뉴를 등록할 수 없습니다. 즉, rcsReply 값이 1인 대화방에만 대화방메뉴를 설정할 수 있습니다.    + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest = new BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest(); // BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest | 
        try {
            BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response result = apiInstance.brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut(brandId, chatbotId, xRCSBrandkey, brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **chatbotId** | **String**| 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest** | [**BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest**](BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest.md)|  | [optional] |

### Return type

[**BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response**](BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 성공적으로 수정된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdBidirectionalChatbotChatbotIdPut

> BrandBrandIdBidirectionalChatbotPost200Response brandBrandIdBidirectionalChatbotChatbotIdPut(brandId, chatbotId, xRCSBrandkey, brandBrandIdBidirectionalChatbotChatbotIdPutRequest)

대화방(양방향) 정보를 수정 합니다. 

대화방(양방향) 정보를 수정 합니다.   양방향ID를 이용한 대화방을 수정하거나 대화방에 다음과 같은 사항을 연결을 하고자 하는 경우 사용합니다.        + 양방향ID 대화방 수정     + 발신번호 또는 양방향ID 대화방에 대화방 메뉴 등록     + 발신번호 또는 양방향ID 대화방에 양방향 서비스 대행사 연결/해제(자동응답메시지, 챗봇 사용)    대화방명 등록/변경 시 RBC 운영자 검수 승인 후 등록됩니다.      + 발신번호를 이용한 양방향 대화방 전환 등록 시 대화방명이 변경된 경우     + 사용자 입력 양방향ID를 이용한 신규 양방향 대화방 등록 시       - **계정 권한 : 마스터, 매니저, 대행사**     - **브랜드 권한 : 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        BrandBrandIdBidirectionalChatbotChatbotIdPutRequest brandBrandIdBidirectionalChatbotChatbotIdPutRequest = new BrandBrandIdBidirectionalChatbotChatbotIdPutRequest(); // BrandBrandIdBidirectionalChatbotChatbotIdPutRequest | 
        try {
            BrandBrandIdBidirectionalChatbotPost200Response result = apiInstance.brandBrandIdBidirectionalChatbotChatbotIdPut(brandId, chatbotId, xRCSBrandkey, brandBrandIdBidirectionalChatbotChatbotIdPutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdBidirectionalChatbotChatbotIdPut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **chatbotId** | **String**| 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **brandBrandIdBidirectionalChatbotChatbotIdPutRequest** | [**BrandBrandIdBidirectionalChatbotChatbotIdPutRequest**](BrandBrandIdBidirectionalChatbotChatbotIdPutRequest.md)|  | [optional] |

### Return type

[**BrandBrandIdBidirectionalChatbotPost200Response**](BrandBrandIdBidirectionalChatbotPost200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 상세 내역이 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdBidirectionalChatbotGet

> BrandBrandIdBidirectionalChatbotGet200Response brandBrandIdBidirectionalChatbotGet(brandId, xRCSBrandkey, offset, limit)

브랜드에 등록된 대화방(양방향) 목록을 조회합니다. 

브랜드에 등록된 양방향ID 또는 대화방메뉴, 양방향 대행사가 연결된 대화방 목록을 조회합니다.      + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BrandBrandIdBidirectionalChatbotGet200Response result = apiInstance.brandBrandIdBidirectionalChatbotGet(brandId, xRCSBrandkey, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdBidirectionalChatbotGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **offset** | **Integer**| 시작 offset 번호(default: 0) 입니다. | [optional] |
| **limit** | **Integer**| 조회 최대 건수(default: 100, maximum: 1000) 입니다. | [optional] |

### Return type

[**BrandBrandIdBidirectionalChatbotGet200Response**](BrandBrandIdBidirectionalChatbotGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 브랜드에 등록된 대화방(양방향) 목록이 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdBidirectionalChatbotPost

> BrandBrandIdBidirectionalChatbotPost200Response brandBrandIdBidirectionalChatbotPost(brandId, xRCSBrandkey, brandBrandIdBidirectionalChatbotPostRequest)

대화방(양방향)을 등록합니다. 

양방향ID를 이용한 대화방을 등록하거나 대화방에 다음과 같은 사항을 연결을 하고자 하는 경우 사용합니다.        + 양방향ID 대화방 등록     + 발신번호 또는 양방향ID 대화방에 대화방 메뉴 등록     + 발신번호 또는 양방향ID 대화방에 양방향 서비스 대행사 연결(자동응답메시지, 챗봇 사용)    대화방명 등록/변경 시 RBC 운영자 검수 승인 후 등록됩니다.        + 발신번호를 이용한 양방향 대화방 전환 등록 시 대화방명이 변경된 경우     + 사용자 입력 양방향ID를 이용한 신규 양방향 대화방 등록 시      - **계정 권한 : 마스터, 매니저, 대행사**     - **브랜드 권한 : 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        BrandBrandIdBidirectionalChatbotPostRequest brandBrandIdBidirectionalChatbotPostRequest = new BrandBrandIdBidirectionalChatbotPostRequest(); // BrandBrandIdBidirectionalChatbotPostRequest | 
        try {
            BrandBrandIdBidirectionalChatbotPost200Response result = apiInstance.brandBrandIdBidirectionalChatbotPost(brandId, xRCSBrandkey, brandBrandIdBidirectionalChatbotPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdBidirectionalChatbotPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **brandBrandIdBidirectionalChatbotPostRequest** | [**BrandBrandIdBidirectionalChatbotPostRequest**](BrandBrandIdBidirectionalChatbotPostRequest.md)|  | [optional] |

### Return type

[**BrandBrandIdBidirectionalChatbotPost200Response**](BrandBrandIdBidirectionalChatbotPost200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 등록 내역이 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdChatbotChatbotIdCancelPut

> BrandBrandIdChatbotChatbotIdCancelPut200Response brandBrandIdChatbotChatbotIdCancelPut(brandId, chatbotId, xRCSBrandkey)

지정된 대화방(발신번호, 양방향ID)의 승인요청을 취소합니다. 

지정된 대화방(발신번호, 양방향ID)의 승인요청을 취소합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**    각 상태별 취소 요청 동작은 다음과 같습니다.            + **승인대기 : 저장 상태로 변경**             + **승인대기(수정) : 직전 승인 상태 및 데이터로 롤백**           + **반려(수정) : 직전 승인 상태 및 데이터로 롤백**     + **이외의 경우 에러 리턴** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdChatbotChatbotIdCancelPut200Response result = apiInstance.brandBrandIdChatbotChatbotIdCancelPut(brandId, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdChatbotChatbotIdCancelPut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **chatbotId** | **String**| 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**BrandBrandIdChatbotChatbotIdCancelPut200Response**](BrandBrandIdChatbotChatbotIdCancelPut200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 대화방 승인요청이 정상적으로 취소된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdChatbotChatbotIdDelete

> BrandBrandIdChatbotChatbotIdDelete200Response brandBrandIdChatbotChatbotIdDelete(brandId, chatbotId, xRCSBrandkey)

대화방(발신번호)을 삭제합니다. 

대화방(발신번호)을 삭제합니다. 양방향 대화방의 회신번호로 등록된 발신번호 삭제 시, 대상 양방향 대화방도 함께 삭제 처리 됩니다.      + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자**   + **삭제 가능 상태 : 저장, 반려, 승인** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdChatbotChatbotIdDelete200Response result = apiInstance.brandBrandIdChatbotChatbotIdDelete(brandId, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdChatbotChatbotIdDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **chatbotId** | **String**| 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**BrandBrandIdChatbotChatbotIdDelete200Response**](BrandBrandIdChatbotChatbotIdDelete200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 성공적으로 삭제되었을 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdChatbotChatbotIdGet

> BrandBrandIdChatbotChatbotIdGet200Response brandBrandIdChatbotChatbotIdGet(brandId, chatbotId, xRCSBrandkey)

지정된 대화방(발신번호)의 상세 정보를 조회합니다. 

지정된 대화방(발신번호)의 상세 정보를 조회합니다.      + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdChatbotChatbotIdGet200Response result = apiInstance.brandBrandIdChatbotChatbotIdGet(brandId, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdChatbotChatbotIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **chatbotId** | **String**| 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**BrandBrandIdChatbotChatbotIdGet200Response**](BrandBrandIdChatbotChatbotIdGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 해당 대화방의 상세 내역이 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdChatbotChatbotIdPut

> BrandBrandIdChatbotChatbotIdGet200Response brandBrandIdChatbotChatbotIdPut(brandId, chatbotId, xRCSBrandkey, subNumCertificate, chatbot)

지정된 대화방(발신번호)의 정보를 업데이트합니다. 

지정된 대화방(발신번호)의 정보를 업데이트합니다.   저장, 반려, 승인 상태의 대화방(발신번호)만 수정이 가능하며, 대화방명이 변경되면 RBC 운영자의 검수를 받아야 합니다.        + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자**   + **수정 가능 상태 : 저장, 반려, 승인** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Object subNumCertificate = null; // Object | 통신서비스 가입증명원 입니다.   입력한 발신번호와 통신서비스 가입증명원의 전화번호가 일치해야 발신번호 등록이 가능하며 최근 1개월 이내 발급된 서류로 제출해야 합니다.   **파일형식 : jpg, png, pdf, tiff, zip (최대20MB)** 
        RegChatbotInfo chatbot = new RegChatbotInfo(); // RegChatbotInfo | 
        try {
            BrandBrandIdChatbotChatbotIdGet200Response result = apiInstance.brandBrandIdChatbotChatbotIdPut(brandId, chatbotId, xRCSBrandkey, subNumCertificate, chatbot);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdChatbotChatbotIdPut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **chatbotId** | **String**| 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **subNumCertificate** | [**Object**](Object.md)| 통신서비스 가입증명원 입니다.   입력한 발신번호와 통신서비스 가입증명원의 전화번호가 일치해야 발신번호 등록이 가능하며 최근 1개월 이내 발급된 서류로 제출해야 합니다.   **파일형식 : jpg, png, pdf, tiff, zip (최대20MB)**  | [optional] |
| **chatbot** | [**RegChatbotInfo**](RegChatbotInfo.md)|  | [optional] |

### Return type

[**BrandBrandIdChatbotChatbotIdGet200Response**](BrandBrandIdChatbotChatbotIdGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 상세 내역이 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdChatbotGet

> BrandBrandIdChatbotGet200Response brandBrandIdChatbotGet(brandId, xRCSBrandkey, offset, limit)

브랜드 내에 등록된 대화방 목록을 조회합니다. 

브랜드 내에 등록된 대화방(발신번호) 목록을 조회합니다.      + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BrandBrandIdChatbotGet200Response result = apiInstance.brandBrandIdChatbotGet(brandId, xRCSBrandkey, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdChatbotGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **offset** | **Integer**| 시작 offset 번호(default: 0) 입니다. | [optional] |
| **limit** | **Integer**| 조회 최대 건수(default: 100, maximum: 1000) 입니다. | [optional] |

### Return type

[**BrandBrandIdChatbotGet200Response**](BrandBrandIdChatbotGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 브랜드에 등록된 대화방 목록이 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdChatbotPost

> BrandBrandIdChatbotPost200Response brandBrandIdChatbotPost(brandId, xRCSBrandkey, subNumCertificate, chatbots)

지정된 브랜드에 대화방(발신번호)을 등록합니다. 

지정된 브랜드에 대화방(발신번호)을 등록합니다.   대화방 등록 시 RBC 운영자 검수 승인 후 사용이 가능합니다.      + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Object subNumCertificate = null; // Object | 통신서비스 가입증명원 입니다.   입력한 발신번호와 통신서비스 가입증명원의 전화번호가 일치해야 발신번호 등록이 가능하며 최근 1개월 이내 발급된 서류로 제출해야 합니다.   **파일형식 : jpg, png, pdf, tiff, zip (최대20MB)** 
        CorpBrandPostRequestChatbots chatbots = new CorpBrandPostRequestChatbots(); // CorpBrandPostRequestChatbots | 
        try {
            BrandBrandIdChatbotPost200Response result = apiInstance.brandBrandIdChatbotPost(brandId, xRCSBrandkey, subNumCertificate, chatbots);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdChatbotPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **subNumCertificate** | [**Object**](Object.md)| 통신서비스 가입증명원 입니다.   입력한 발신번호와 통신서비스 가입증명원의 전화번호가 일치해야 발신번호 등록이 가능하며 최근 1개월 이내 발급된 서류로 제출해야 합니다.   **파일형식 : jpg, png, pdf, tiff, zip (최대20MB)**  | [optional] |
| **chatbots** | [**CorpBrandPostRequestChatbots**](CorpBrandPostRequestChatbots.md)|  | [optional] |

### Return type

[**BrandBrandIdChatbotPost200Response**](BrandBrandIdChatbotPost200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 대화방 등록 상태가 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdLayoutGet

> BrandBrandIdLayoutGet200Response brandBrandIdLayoutGet(brandId, xRCSBrandkey, offset, limit)

브랜드 별 등록된 레이아웃 목록을 조회합니다. 

브랜드 별 등록된 레이아웃 목록을 조회합니다.      + **계정 권한: 대행사**     + **브랜드 권한: 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BrandBrandIdLayoutGet200Response result = apiInstance.brandBrandIdLayoutGet(brandId, xRCSBrandkey, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdLayoutGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **offset** | **Integer**| 시작 offset 번호(default: 0) 입니다. | [optional] |
| **limit** | **Integer**| 조회 최대 건수(default: 100, maximum: 1000) 입니다. | [optional] |

### Return type

[**BrandBrandIdLayoutGet200Response**](BrandBrandIdLayoutGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 브랜드 내 등록된 레이아웃 목록을 응답합니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdLayoutLayoutIdDelete

> BrandBrandIdLayoutLayoutIdDelete200Response brandBrandIdLayoutLayoutIdDelete(brandId, layoutId, xRCSBrandkey)

브랜드 별 등록된 레이아웃을 삭제합니다. 

브랜드 별 등록된 레이아웃을 삭제합니다.      + **계정 권한: 대행사**     + **브랜드 권한: 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String layoutId = "layoutId_example"; // String | 레이아웃ID 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdLayoutLayoutIdDelete200Response result = apiInstance.brandBrandIdLayoutLayoutIdDelete(brandId, layoutId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdLayoutLayoutIdDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **layoutId** | **String**| 레이아웃ID 입니다. | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**BrandBrandIdLayoutLayoutIdDelete200Response**](BrandBrandIdLayoutLayoutIdDelete200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 브랜드 내 레이아웃 정상 삭제 시 응답합니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdLayoutLayoutIdGet

> BrandBrandIdLayoutLayoutIdGet200Response brandBrandIdLayoutLayoutIdGet(brandId, layoutId, xRCSBrandkey)

브랜드 별 등록된 레이아웃 목록을 조회합니다. 

브랜드 별 등록된 레이아웃 목록을 조회합니다.      + **계정 권한: 대행사**     + **브랜드 권한: 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String layoutId = "layoutId_example"; // String | 레이아웃ID 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdLayoutLayoutIdGet200Response result = apiInstance.brandBrandIdLayoutLayoutIdGet(brandId, layoutId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdLayoutLayoutIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **layoutId** | **String**| 레이아웃ID 입니다. | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**BrandBrandIdLayoutLayoutIdGet200Response**](BrandBrandIdLayoutLayoutIdGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 브랜드 내 등록된 레이아웃 상세 정보를 응답합니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdLayoutLayoutIdPut

> BrandBrandIdLayoutLayoutIdPut200Response brandBrandIdLayoutLayoutIdPut(brandId, layoutId, xRCSBrandkey, regBrandLayout)

브랜드 내 레이아웃을 수정 합니다.   

브랜드 내 레이아웃을 수정 합니다.      + **계정 권한: 대행사**     + **브랜드 권한: 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String layoutId = "layoutId_example"; // String | 레이아웃ID 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        RegBrandLayout regBrandLayout = new RegBrandLayout(); // RegBrandLayout | 
        try {
            BrandBrandIdLayoutLayoutIdPut200Response result = apiInstance.brandBrandIdLayoutLayoutIdPut(brandId, layoutId, xRCSBrandkey, regBrandLayout);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdLayoutLayoutIdPut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **layoutId** | **String**| 레이아웃ID 입니다. | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **regBrandLayout** | [**RegBrandLayout**](RegBrandLayout.md)|  | [optional] |

### Return type

[**BrandBrandIdLayoutLayoutIdPut200Response**](BrandBrandIdLayoutLayoutIdPut200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 레이아웃이 정상적으로 수정된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdLayoutPost

> BrandBrandIdLayoutPost200Response brandBrandIdLayoutPost(brandId, xRCSBrandkey, regBrandLayout)

브랜드 내에서 사용할 수 있는 레이아웃을 등록 합니다.   

브랜드 내에서 사용할 수 있는 레이아웃을 등록 합니다.      + **계정 권한: 대행사**     + **브랜드 권한: 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        RegBrandLayout regBrandLayout = new RegBrandLayout(); // RegBrandLayout | 
        try {
            BrandBrandIdLayoutPost200Response result = apiInstance.brandBrandIdLayoutPost(brandId, xRCSBrandkey, regBrandLayout);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdLayoutPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **regBrandLayout** | [**RegBrandLayout**](RegBrandLayout.md)|  | [optional] |

### Return type

[**BrandBrandIdLayoutPost200Response**](BrandBrandIdLayoutPost200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 레이아웃이 정상적으로 등록된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdLogoFileIdCancelPut

> BrandBrandIdLogoPost200Response brandBrandIdLogoFileIdCancelPut(brandId, fileId, xRCSBrandkey)

로고의 승인요청을 취소합니다. 

로고의 승인요청을 취소합니다.     + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**          각 상태별 취소 요청 동작은 다음과 같습니다.     + **승인대기 : 저장 상태로 변경**             + **승인대기(수정) : 직전 승인 상태 및 데이터로 롤백**   + **반려(수정) : 직전 승인 상태 및 데이터로 롤백**   + **이외의 경우 에러 리턴** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String fileId = "fileId_example"; // String | 로고 이미지 파일 ID 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdLogoPost200Response result = apiInstance.brandBrandIdLogoFileIdCancelPut(brandId, fileId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdLogoFileIdCancelPut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **fileId** | **String**| 로고 이미지 파일 ID 입니다. | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**BrandBrandIdLogoPost200Response**](BrandBrandIdLogoPost200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 정상적으로 등록된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdLogoFileIdDelete

> BrandBrandIdLogoFileIdDelete200Response brandBrandIdLogoFileIdDelete(brandId, fileId, xRCSBrandkey)

브랜드에 등록된 승인 이전 상태의 로고를 삭제 합니다. 

브랜드에 등록된 승인 이전 상태의 로고를 삭제 합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **삭제 가능 상태 : 저장, 반려** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String fileId = "fileId_example"; // String | 로고 ID 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdLogoFileIdDelete200Response result = apiInstance.brandBrandIdLogoFileIdDelete(brandId, fileId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdLogoFileIdDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **fileId** | **String**| 로고 ID 입니다. | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**BrandBrandIdLogoFileIdDelete200Response**](BrandBrandIdLogoFileIdDelete200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 성공적으로 삭제된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdLogoFileIdGet

> BrandBrandIdLogoFileIdGet200Response brandBrandIdLogoFileIdGet(brandId, fileId, xRCSBrandkey)

브랜드에 등록된 로고를 단건 상세 조회합니다. 

브랜드에 등록된 로고를 단건 상세 조회합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String fileId = "fileId_example"; // String | 로고 이미지 파일 ID 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdLogoFileIdGet200Response result = apiInstance.brandBrandIdLogoFileIdGet(brandId, fileId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdLogoFileIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **fileId** | **String**| 로고 이미지 파일 ID 입니다. | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**BrandBrandIdLogoFileIdGet200Response**](BrandBrandIdLogoFileIdGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 조회 요청한 로고 상세 정보입니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdLogoFileIdPut

> BrandBrandIdLogoFileIdPut200Response brandBrandIdLogoFileIdPut(brandId, fileId, name, _file, xRCSBrandkey, description)

브랜드에 등록된 로고를 수정 승인요청 합니다. 

브랜드에 등록된 로고를 수정 승인요청 합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **수정 가능 상태 : 저장, 반려, 반려(수정), 승인** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String fileId = "fileId_example"; // String | 로고 ID 입니다.
        String name = "name_example"; // String | 로고명 입니다.
        Object _file = null; // Object | 업로드 로고 이미지 파일을 지칭합니다.            **파일형식 : gif, png, jpeg, jpg, bmp (최대 1MB)** 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        String description = "description_example"; // String | 100자 이내의 로고 설명 입니다.
        try {
            BrandBrandIdLogoFileIdPut200Response result = apiInstance.brandBrandIdLogoFileIdPut(brandId, fileId, name, _file, xRCSBrandkey, description);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdLogoFileIdPut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **fileId** | **String**| 로고 ID 입니다. | |
| **name** | **String**| 로고명 입니다. | |
| **_file** | [**Object**](Object.md)| 업로드 로고 이미지 파일을 지칭합니다.            **파일형식 : gif, png, jpeg, jpg, bmp (최대 1MB)**  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **description** | **String**| 100자 이내의 로고 설명 입니다. | [optional] |

### Return type

[**BrandBrandIdLogoFileIdPut200Response**](BrandBrandIdLogoFileIdPut200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 정상적으로 등록된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdLogoGet

> BrandBrandIdLogoGet200Response brandBrandIdLogoGet(brandId, xRCSBrandkey, offset, limit)

브랜드 별 등록된 로고 목록을 조회합니다. 

브랜드 별 등록된 로고 목록을 조회합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BrandBrandIdLogoGet200Response result = apiInstance.brandBrandIdLogoGet(brandId, xRCSBrandkey, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdLogoGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **offset** | **Integer**| 시작 offset 번호(default: 0) 입니다. | [optional] |
| **limit** | **Integer**| 조회 최대 건수(default: 100, maximum: 1000) 입니다. | [optional] |

### Return type

[**BrandBrandIdLogoGet200Response**](BrandBrandIdLogoGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 브랜드 내 등록된 로고 목록을 응답합니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdLogoPost

> BrandBrandIdLogoPost200Response brandBrandIdLogoPost(brandId, name, _file, xRCSBrandkey, description)

브랜드 내에서 사용할 수 있는 로고를 등록 합니다.   

브랜드 내에서 사용할 수 있는 로고를 등록 합니다.    등록한 로고는 영구적으로 사용 가능합니다.    + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String name = "name_example"; // String | 로고명 입니다.
        Object _file = null; // Object | 업로드 로고 이미지 파일을 지칭합니다.            **파일형식 : gif, png, jpeg, jpg, bmp (최대 1MB)** 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        String description = "description_example"; // String | 100자 이내의 로고 설명 입니다.
        try {
            BrandBrandIdLogoPost200Response result = apiInstance.brandBrandIdLogoPost(brandId, name, _file, xRCSBrandkey, description);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdLogoPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **name** | **String**| 로고명 입니다. | |
| **_file** | [**Object**](Object.md)| 업로드 로고 이미지 파일을 지칭합니다.            **파일형식 : gif, png, jpeg, jpg, bmp (최대 1MB)**  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **description** | **String**| 100자 이내의 로고 설명 입니다. | [optional] |

### Return type

[**BrandBrandIdLogoPost200Response**](BrandBrandIdLogoPost200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 정상적으로 등록된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdMessagebaseGet

> MessagebaseCommonGet200Response brandBrandIdMessagebaseGet(brandId, xRCSBrandkey, offset, limit)

브랜드에 등록된 템플릿을 조회합니다. 

브랜드에 등록된 템플릿을 조회합니다.   템플릿 별 승인 상태를 확인할 수 있습니다.      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형), 이미지 템플릿, LMS 템플릿** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            MessagebaseCommonGet200Response result = apiInstance.brandBrandIdMessagebaseGet(brandId, xRCSBrandkey, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdMessagebaseGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **offset** | **Integer**| 시작 offset 번호(default: 0) 입니다. | [optional] |
| **limit** | **Integer**| 조회 최대 건수(default: 100, maximum: 1000) 입니다. | [optional] |

### Return type

[**MessagebaseCommonGet200Response**](MessagebaseCommonGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 브랜드에 등록된 템플릿 ID 목록이 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdMessagebaseMessagebaseIdCancelPut

> BrandBrandIdMessagebaseMessagebaseIdPut200Response brandBrandIdMessagebaseMessagebaseIdCancelPut(brandId, messagebaseId, xRCSBrandkey)

지정된 템플릿의 승인요청을 취소합니다. 

지정된 템플릿의 승인요청을 취소합니다.      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형), 이미지 템플릿, LMS 템플릿**  각 상태별 취소 요청 동작은 다음과 같습니다.      + **승인대기 : 저장 상태로 변경**             + **승인대기(수정) : 직전 승인 상태 및 데이터로 롤백**   + **반려(수정) : 직전 승인 상태 및 데이터로 롤백**   + **이외의 경우 에러 리턴** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String messagebaseId = "messagebaseId_example"; // String | 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdMessagebaseMessagebaseIdPut200Response result = apiInstance.brandBrandIdMessagebaseMessagebaseIdCancelPut(brandId, messagebaseId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdMessagebaseMessagebaseIdCancelPut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **messagebaseId** | **String**| 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**BrandBrandIdMessagebaseMessagebaseIdPut200Response**](BrandBrandIdMessagebaseMessagebaseIdPut200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 템플릿 승인요청이 정상적으로 취소된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdMessagebaseMessagebaseIdDelete

> BrandBrandIdMessagebaseMessagebaseIdPut200Response brandBrandIdMessagebaseMessagebaseIdDelete(brandId, messagebaseId, xRCSBrandkey)

브랜드 내 지정된 템플릿을 삭제합니다. 

브랜드 내 지정된 템플릿을 삭제합니다.   템플릿의 삭제는 상태에 따라 처리 여부가 결정됩니다.   한번 삭제된 템플릿은 복원이 불가능하며 동일한 ID로 생성할 수 없습니다.    + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형), 이미지 템플릿, LMS 템플릿**   + **삭제 가능 상태 : 저장, 반려, 반려(수정), 승인** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String messagebaseId = "messagebaseId_example"; // String | 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdMessagebaseMessagebaseIdPut200Response result = apiInstance.brandBrandIdMessagebaseMessagebaseIdDelete(brandId, messagebaseId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdMessagebaseMessagebaseIdDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **messagebaseId** | **String**| 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**BrandBrandIdMessagebaseMessagebaseIdPut200Response**](BrandBrandIdMessagebaseMessagebaseIdPut200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 템플릿이 성공적으로 삭제되었을 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdMessagebaseMessagebaseIdGet

> BrandBrandIdMessagebaseMessagebaseIdGet200Response brandBrandIdMessagebaseMessagebaseIdGet(brandId, messagebaseId, xRCSBrandkey)

브랜드에 등록된 지정 템플릿 상세 내역을 조회합니다. 

브랜드에 등록된 지정 템플릿 상세 내역을 조회합니다.      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형), 이미지 템플릿, LMS 템플릿** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String messagebaseId = "messagebaseId_example"; // String | 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdMessagebaseMessagebaseIdGet200Response result = apiInstance.brandBrandIdMessagebaseMessagebaseIdGet(brandId, messagebaseId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdMessagebaseMessagebaseIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **messagebaseId** | **String**| 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**BrandBrandIdMessagebaseMessagebaseIdGet200Response**](BrandBrandIdMessagebaseMessagebaseIdGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 해당 템플릿의 상세 내역이 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdMessagebaseMessagebaseIdPut

> BrandBrandIdMessagebaseMessagebaseIdPut200Response brandBrandIdMessagebaseMessagebaseIdPut(brandId, messagebaseId, xRCSBrandkey, regMessagebaseInfo)

지정 템플릿을 업데이트 합니다. 

지정 템플릿을 업데이트 합니다.   템플릿의 업데이트는 승인상태에 따라 처리 여부가 결정됩니다.      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형)**   + **수정 가능 상태 : 저장, 반려, 반려(수정), 승인** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String messagebaseId = "messagebaseId_example"; // String | 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        RegMessagebaseInfo regMessagebaseInfo = new RegMessagebaseInfo(); // RegMessagebaseInfo | 
        try {
            BrandBrandIdMessagebaseMessagebaseIdPut200Response result = apiInstance.brandBrandIdMessagebaseMessagebaseIdPut(brandId, messagebaseId, xRCSBrandkey, regMessagebaseInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdMessagebaseMessagebaseIdPut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **messagebaseId** | **String**| 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **regMessagebaseInfo** | [**RegMessagebaseInfo**](RegMessagebaseInfo.md)|  | [optional] |

### Return type

[**BrandBrandIdMessagebaseMessagebaseIdPut200Response**](BrandBrandIdMessagebaseMessagebaseIdPut200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 템플릿이 정상적으로 등록된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdMessagebasePost

> BrandBrandIdMessagebasePost200Response brandBrandIdMessagebasePost(brandId, xRCSBrandkey, brandBrandIdMessagebasePostRequest)

브랜드 내에서 사용할 구형 텍스트 템플릿을 등록합니다. 추가된 신규 템플릿 유형은 POST /brand/{brandId}/v2/messagebase 을 이용해야 합니다. 

브랜드 내에서 사용할 텍스트 템플릿을 등록합니다.   등록된 템플릿은 RCS Biz Center 운영자의 승인 후 사용 가능합니다.   템플릿 등록 시 사용되는 messagebaseformId의 formattedString을 이용하여 템플릿의 formattedString을 등록해야 합니다. 추가된 신규 템플릿 유형은 POST /brand/{brandId}/v2/messagebase 을 이용해야 합니다.   **[템플릿 등록을 위한 formattedString 처리 방법]**      1. messagebaseform 리스트 조회      2. 템플릿 생성 시 사용하고자 하는 messagebaseformId 상세 조회를 통해 formattedString 확인(messagebaseform의 formattedString은 수시 업데이트 될 수 있음)        3. Messagebaseform formattedString 의 각 widget Object 의 widgetPolicy.allowedAttributes 에 지정된 key의 value만 수정할 수 있음(이외 수정 시 오류)        4. Cell의 경우, ROOT.regMessagebases[0].formattedString.RCSMessage.openrichcardMessage.layout.children[1].children 내 object 단위 제거 할 수 있음       단, 1개 이상의 Object(LinearLayout)는 존재해야 함        5. Cell의 경우, ROOT.regMessagebases[0].formattedString.RCSMessage.openrichcardMessage.layout.children[1].children[n].children 내 Object(TextView) 2개 중 1개는 삭제 가능함         6. 타이틀 자유형(구 테마 강조형A) 제목 좌측 영역은 고정문자열 8자까지 허용(변수 사용 불가)        7. 타이틀 자유형(구 테마 강조형A) 제목 우측 영역에 해당하는 ROOT.formattedString.RCSMessage.openrichcardMessage.layout.children[0].children[0].children[1] 삭제 가능        8. 타이틀 자유형(구 테마 강조형A) 제목 우측 영역에 해당하는 ROOT.formattedString.RCSMessage.openrichcardMessage.layout.children[0].children[0].children[1].text 값(value)은 템플릿 내 정의된 변수만 입력 가능(예시 참조)      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형)** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        BrandBrandIdMessagebasePostRequest brandBrandIdMessagebasePostRequest = new BrandBrandIdMessagebasePostRequest(); // BrandBrandIdMessagebasePostRequest | 
        try {
            BrandBrandIdMessagebasePost200Response result = apiInstance.brandBrandIdMessagebasePost(brandId, xRCSBrandkey, brandBrandIdMessagebasePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdMessagebasePost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **brandBrandIdMessagebasePostRequest** | [**BrandBrandIdMessagebasePostRequest**](BrandBrandIdMessagebasePostRequest.md)|  | [optional] |

### Return type

[**BrandBrandIdMessagebasePost200Response**](BrandBrandIdMessagebasePost200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 템플릿이 정상적으로 등록된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdV2MessagebaseFileFileIdGet

> BrandBrandIdV2MessagebaseFilePost200Response brandBrandIdV2MessagebaseFileFileIdGet(brandId, fileId, xRCSBrandkey)

이미지 템플릿 용으로 등록한 이미지 파일 정보를 조회 합니다. 

이미지 템플릿 용으로 등록한 이미지 파일 정보를 조회 합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**     + **지원 범위: 이미지 템플릿, LMS 템플릿**   

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String fileId = "fileId_example"; // String | 파일ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdV2MessagebaseFilePost200Response result = apiInstance.brandBrandIdV2MessagebaseFileFileIdGet(brandId, fileId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdV2MessagebaseFileFileIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **fileId** | **String**| 파일ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**BrandBrandIdV2MessagebaseFilePost200Response**](BrandBrandIdV2MessagebaseFilePost200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 조회 결과가 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdV2MessagebaseFilePost

> BrandBrandIdV2MessagebaseFilePost200Response brandBrandIdV2MessagebaseFilePost(brandId, _file, xRCSBrandkey)

이미지 템플릿에서 사용할 이미지 파일을 등록합니다. 

이미지 템플릿에서 사용할 이미지 파일을 등록합니다.   파일을 먼저 등록해야 이미지 템플릿 등록 시 file Id를 템플릿 내 지정할 수 있습니다.    + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**     + **지원 범위: 이미지 템플릿, LMS 템플릿**   

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        Object _file = null; // Object | 이미지 템플릿에 사용할 이미지 파일입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdV2MessagebaseFilePost200Response result = apiInstance.brandBrandIdV2MessagebaseFilePost(brandId, _file, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdV2MessagebaseFilePost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **_file** | [**Object**](Object.md)| 이미지 템플릿에 사용할 이미지 파일입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**BrandBrandIdV2MessagebaseFilePost200Response**](BrandBrandIdV2MessagebaseFilePost200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 성공적으로 등록되었을 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdV2MessagebaseMessagebaseIdPut

> BrandBrandIdMessagebasePost200Response brandBrandIdV2MessagebaseMessagebaseIdPut(brandId, messagebaseId, xRCSBrandkey, modTemplateInfo)

이미 등록된 템플릿의 내용을 수정합니다. 

이미 등록된 템플릿의 내용을 수정합니다. messagebase의 ID를 유지하면서 내용을 변경하고자 하는 경우 사용이 가능합니다. 수정 등록된 템플릿은 RCS Biz Center 운영자의 승인이 필요합니다.      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형), 이미지 템플릿, LMS 템플릿** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String messagebaseId = "messagebaseId_example"; // String | 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        ModTemplateInfo modTemplateInfo = new ModTemplateInfo(); // ModTemplateInfo | 
        try {
            BrandBrandIdMessagebasePost200Response result = apiInstance.brandBrandIdV2MessagebaseMessagebaseIdPut(brandId, messagebaseId, xRCSBrandkey, modTemplateInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdV2MessagebaseMessagebaseIdPut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **messagebaseId** | **String**| 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **modTemplateInfo** | [**ModTemplateInfo**](ModTemplateInfo.md)|  | [optional] |

### Return type

[**BrandBrandIdMessagebasePost200Response**](BrandBrandIdMessagebasePost200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 템플릿이 정상적으로 수정된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## brandBrandIdV2MessagebasePost

> BrandBrandIdMessagebasePost200Response brandBrandIdV2MessagebasePost(brandId, xRCSBrandkey, regTemplateInfo)

브랜드 내에서 사용할 템플릿을 등록합니다.   Openrichcard 규격의 모든 템플릿 등록이 가능합니다. 

브랜드 내에서 사용할 템플릿을 등록합니다.   모든 템플릿 등록이 가능하며,   템플릿 등록 시 사용되는 messagebaseformId의 params의 각 항목 중 템플릿에 표시될 내용을 입력하여 원하는 템플릿을 등록할 수 있습니다. 등록된 템플릿은 RCS Biz Center 운영자의 승인이 필요합니다.      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형), 이미지 템플릿, LMS 템플릿** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.            
        RegTemplateInfo regTemplateInfo = new RegTemplateInfo(); // RegTemplateInfo | 
        try {
            BrandBrandIdMessagebasePost200Response result = apiInstance.brandBrandIdV2MessagebasePost(brandId, xRCSBrandkey, regTemplateInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#brandBrandIdV2MessagebasePost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.             | [optional] |
| **regTemplateInfo** | [**RegTemplateInfo**](RegTemplateInfo.md)|  | [optional] |

### Return type

[**BrandBrandIdMessagebasePost200Response**](BrandBrandIdMessagebasePost200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 템플릿이 정상적으로 등록된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## logoCommonGet

> LogoCommonGet200Response logoCommonGet()

RBC에서 제공되는 기본 아이콘 이미지 정보를 조회합니다. 

RBC에서 제공되는 기본 아이콘 이미지 정보를 조회합니다.   조회된 파일 ID를 메시지 발송 시 또는 템플릿 등록 시 사용할 수 있습니다.      + **계정 권한 : 마스터, 매니저, 대행사** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        try {
            LogoCommonGet200Response result = apiInstance.logoCommonGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#logoCommonGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**LogoCommonGet200Response**](LogoCommonGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 기본 아이콘 이미지 리스트를 응답합니다.  |  -  |
| **0** |  |  -  |


## messagebaseCommonGet

> MessagebaseCommonGet200Response messagebaseCommonGet(productCode, cardType, bizService, offset, limit)

이통사가 기본 제공하는 공통템플릿을 조회합니다. 

이통사가 기본 제공하는 공통템플릿을 조회합니다.   공통템플릿은 SMS, LMS, MMS와 양방향 대화방용 CHAT 상품으로 구성되어 있습니다.      + **계정 권한 : 마스터, 매니저, 대행사** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String productCode = "sms"; // String | 리치카드 메시지 유형 구분값 입니다.
        String cardType = "standalone"; // String | MMS에서 제공되는 메시지 카드 형태 구분값 입니다.
        String bizService = "승인"; // String | 현재 공통템플릿은 유형별 제공되는 항목이 없으므로 본 파라미터는 사용되지 않습니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            MessagebaseCommonGet200Response result = apiInstance.messagebaseCommonGet(productCode, cardType, bizService, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#messagebaseCommonGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productCode** | **String**| 리치카드 메시지 유형 구분값 입니다. | [optional] [enum: sms, lms, mms, chat] |
| **cardType** | **String**| MMS에서 제공되는 메시지 카드 형태 구분값 입니다. | [optional] [enum: standalone, standalone media top, standalone horizontal, carousel medium, carousel small, Highlighted Image n Title, Highlighted Image, Thumbnail, SNS, format] |
| **bizService** | **String**| 현재 공통템플릿은 유형별 제공되는 항목이 없으므로 본 파라미터는 사용되지 않습니다.  | [optional] [enum: 승인, 입금, 출금, 출고, 주문, 배송, 예약, 회원가입, 인증] |
| **offset** | **Integer**| 시작 offset 번호(default: 0) 입니다. | [optional] |
| **limit** | **Integer**| 조회 최대 건수(default: 100, maximum: 1000) 입니다. | [optional] |

### Return type

[**MessagebaseCommonGet200Response**](MessagebaseCommonGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 공통템플릿 목록을 응답합니다.  |  -  |
| **0** |  |  -  |


## messagebaseCommonMessagebaseIdGet

> MessagebaseCommonMessagebaseIdGet200Response messagebaseCommonMessagebaseIdGet(messagebaseId)

이통사가 기본 제공하는 공통템플릿 별 상세 내용을 조회합니다. 

이통사가 기본 제공하는 공통템플릿 별 상세 내용을 조회합니다.   상품별 SMS, LMS, MMS, CHAT용 세부 정보를 조회할 수 있습니다.      + **계정 권한: 마스터, 매니저, 대행사** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String messagebaseId = "messagebaseId_example"; // String | 
        try {
            MessagebaseCommonMessagebaseIdGet200Response result = apiInstance.messagebaseCommonMessagebaseIdGet(messagebaseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#messagebaseCommonMessagebaseIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **messagebaseId** | **String**|  | |

### Return type

[**MessagebaseCommonMessagebaseIdGet200Response**](MessagebaseCommonMessagebaseIdGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 공통템플릿 상세 내용을 응답합니다.  |  -  |
| **0** |  |  -  |


## messagebaseMessagebaseformGet

> MessagebaseMessagebaseformGet200Response messagebaseMessagebaseformGet(cardType, bizCondition, bizCategory, bizService, offset, limit)

템플릿 양식 목록을 조회합니다. 

템플릿 양식 목록을 조회합니다.   템플릿 작성이 필요한 경우 조회된 템플릿 양식 ID를 이용하여 템플릿 양식 세부정보를 조회합니다.      + **계정 권한 : 마스터, 매니저, 대행사** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String cardType = "Cell"; // String | 
        String bizCondition = "all"; // String | 
        String bizCategory = "금융"; // String | 
        String bizService = "입금"; // String | 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0)
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000)
        try {
            MessagebaseMessagebaseformGet200Response result = apiInstance.messagebaseMessagebaseformGet(cardType, bizCondition, bizCategory, bizService, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#messagebaseMessagebaseformGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cardType** | **String**|  | [optional] [enum: Cell, Description, Highlighted Image n Title, Highlighted Image, Thumbnail, SNS, descriptionNew, cellNew] |
| **bizCondition** | **String**|  | [optional] |
| **bizCategory** | **String**|  | [optional] |
| **bizService** | **String**|  | [optional] |
| **offset** | **Integer**| 시작 offset 번호(default: 0) | [optional] |
| **limit** | **Integer**| 조회 최대 건수(default: 100, maximum: 1000) | [optional] |

### Return type

[**MessagebaseMessagebaseformGet200Response**](MessagebaseMessagebaseformGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 템플릿 양식 목록을 응답합니다.  |  -  |
| **0** |  |  -  |


## messagebaseMessagebaseformMessagebaseformIdGet

> MessagebaseMessagebaseformMessagebaseformIdGet200Response messagebaseMessagebaseformMessagebaseformIdGet(messagebaseformId)

템플릿 유형의 상세 내용을 조회합니다. 

템플릿 유형의 상세 내용을 조회합니다.   formattedString을 이용하여 원하는 브랜드용 템플릿을 작성할 수 있습니다.   + **계정 권한 : 마스터, 매니저, 대행사** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String messagebaseformId = "messagebaseformId_example"; // String | 
        try {
            MessagebaseMessagebaseformMessagebaseformIdGet200Response result = apiInstance.messagebaseMessagebaseformMessagebaseformIdGet(messagebaseformId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#messagebaseMessagebaseformMessagebaseformIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **messagebaseformId** | **String**|  | |

### Return type

[**MessagebaseMessagebaseformMessagebaseformIdGet200Response**](MessagebaseMessagebaseformMessagebaseformIdGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 템플릿 유형 상세 내용을 응답합니다.  |  -  |
| **0** |  |  -  |


## messagebaseMessagebaseformMessagebaseformIdLogoGet

> MessagebaseMessagebaseformMessagebaseformIdLogoGet200Response messagebaseMessagebaseformMessagebaseformIdLogoGet(messagebaseformId)

RBC에서 템플릿용으로 제공되는 기본 로고 이미지 정보를 조회합니다. 

RBC에서 템플릿용으로 제공되는 기본 로고 이미지 정보를 조회합니다.   조회된 이미지 파일 ID를 템플릿 등록 시 사용할 수 있습니다.      + **계정 권한 : 마스터, 매니저, 대행사** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String messagebaseformId = "messagebaseformId_example"; // String | 
        try {
            MessagebaseMessagebaseformMessagebaseformIdLogoGet200Response result = apiInstance.messagebaseMessagebaseformMessagebaseformIdLogoGet(messagebaseformId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#messagebaseMessagebaseformMessagebaseformIdLogoGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **messagebaseformId** | **String**|  | |

### Return type

[**MessagebaseMessagebaseformMessagebaseformIdLogoGet200Response**](MessagebaseMessagebaseformMessagebaseformIdLogoGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 템플릿 유형 별 제공되는 기본 로고 이미지 리스트를 응답합니다.  |  -  |
| **0** |  |  -  |


## statQueryBrandprofileBrandIdGet

> StatQueryBrandprofileBrandIdGet200Response statQueryBrandprofileBrandIdGet(brandId, startDate, endDate, xRCSBrandkey)

(준비중) 브랜드프로필 노출 통계를 조회합니다. 

(준비중)    브랜드프로필 노출 통계를 조회합니다.    - 브랜드 프로필 이미지가 단말에 표시되면 일자별로 집계됩니다.    - 단말에서 브랜드 프로필은 대화방별로 노출되므로 통계 데이터는 브랜드에 등록된 대화방별 건수로 제공됩니다.   - 통계 조회 기간은 데이터 존재 시 최근 1년 6개월 이내 기간 중 최대 31일까지 검색 가능합니다.    + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String startDate = "startDate_example"; // String | 통계 조회 기간 시작일자(yyyymmdd) 입니다.
        String endDate = "endDate_example"; // String | 통계 조회 기간 종료일자(yyyymmdd) 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            StatQueryBrandprofileBrandIdGet200Response result = apiInstance.statQueryBrandprofileBrandIdGet(brandId, startDate, endDate, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#statQueryBrandprofileBrandIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **startDate** | **String**| 통계 조회 기간 시작일자(yyyymmdd) 입니다. | |
| **endDate** | **String**| 통계 조회 기간 종료일자(yyyymmdd) 입니다. | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**StatQueryBrandprofileBrandIdGet200Response**](StatQueryBrandprofileBrandIdGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 성공적으로 처리된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## statQueryMessageBrandIdGet

> StatQueryMessageBrandIdGet200Response statQueryMessageBrandIdGet(brandId, startDate, endDate, groupId, xRCSBrandkey, chatbotId)

고객반응 통계 - 캠페인 메시지 발송/읽음확인 통계를 조회합니다. 

고객반응 통계 - 캠페인 메시지 발송/읽음확인 통계를 조회합니다.    - 동일 Group ID에 발송일 기준 3일간 (D+3) 집계됩니다. 단, 이통사별 발송 성공건수 100건 이상인 경우에 한해 집계됩니다.     - 통계 조회 기간은 데이터 존재 시 최근 1년 6개월 이내 기간 중 최대 31일까지 검색 가능합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String startDate = "startDate_example"; // String | 통계 조회 기간 시작일자(yyyymmdd) 입니다.
        String endDate = "endDate_example"; // String | 통계 조회 기간 종료일자(yyyymmdd) 입니다.
        String groupId = "groupId_example"; // String | 발송 캠페인 구분 ID 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        String chatbotId = "chatbotId_example"; // String | 대화방ID 입니다.
        try {
            StatQueryMessageBrandIdGet200Response result = apiInstance.statQueryMessageBrandIdGet(brandId, startDate, endDate, groupId, xRCSBrandkey, chatbotId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#statQueryMessageBrandIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **startDate** | **String**| 통계 조회 기간 시작일자(yyyymmdd) 입니다. | |
| **endDate** | **String**| 통계 조회 기간 종료일자(yyyymmdd) 입니다. | |
| **groupId** | **String**| 발송 캠페인 구분 ID 입니다. | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **chatbotId** | **String**| 대화방ID 입니다. | [optional] |

### Return type

[**StatQueryMessageBrandIdGet200Response**](StatQueryMessageBrandIdGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 성공적으로 처리된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## statQueryMessageButtonBrandIdGet

> StatQueryMessageButtonBrandIdGet200Response statQueryMessageButtonBrandIdGet(brandId, startDate, endDate, groupId, xRCSBrandkey, chatbotId)

고객반응 통계 - 캠페인 메시지 버튼 클릭 통계를 조회합니다. 

고객반응 통계 - 캠페인 메시지 버튼 클릭 통계를 조회합니다.    - 동일 Group ID에 발송일 기준 4일간(D+3) 집계됩니다. 단, 이통사별 발송 성공건수 100건 이상인 경우에 한해 집계됩니다.     - 통계 조회 기간은 데이터 존재 시 최근 1년 6개월 이내 기간 중 최대 31일까지 검색 가능합니다.    + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String startDate = "startDate_example"; // String | 통계 조회 기간 시작일자(yyyymmdd) 입니다.
        String endDate = "endDate_example"; // String | 통계 조회 기간 종료일자(yyyymmdd) 입니다.
        String groupId = "groupId_example"; // String | 발송 캠페인 구분 ID 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        String chatbotId = "chatbotId_example"; // String | 대화방ID 입니다.
        try {
            StatQueryMessageButtonBrandIdGet200Response result = apiInstance.statQueryMessageButtonBrandIdGet(brandId, startDate, endDate, groupId, xRCSBrandkey, chatbotId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#statQueryMessageButtonBrandIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **startDate** | **String**| 통계 조회 기간 시작일자(yyyymmdd) 입니다. | |
| **endDate** | **String**| 통계 조회 기간 종료일자(yyyymmdd) 입니다. | |
| **groupId** | **String**| 발송 캠페인 구분 ID 입니다. | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |
| **chatbotId** | **String**| 대화방ID 입니다. | [optional] |

### Return type

[**StatQueryMessageButtonBrandIdGet200Response**](StatQueryMessageButtonBrandIdGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 성공적으로 처리된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## statQueryPersistentMenuBrandIdGet

> StatQueryPersistentMenuBrandIdGet200Response statQueryPersistentMenuBrandIdGet(brandId, startDate, endDate, chatbotId, xRCSBrandkey)

고객반응 통계 - 대화방 메뉴 클릭 통계를 조회합니다. 

고객반응 통계 - 대화방 메뉴 클릭 통계를 조회합니다.    - 대화방별 1건 이상 사용자선택이 일어난 경우에 대해 집계됩니다.     - 통계 조회 기간은 데이터 존재 시 최근 1년 6개월 이내 기간 중 최대 31일까지 검색 가능합니다.    + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String startDate = "startDate_example"; // String | 통계 조회 기간 시작일자(yyyymmdd) 입니다.
        String endDate = "endDate_example"; // String | 통계 조회 기간 종료일자(yyyymmdd) 입니다.
        String chatbotId = "chatbotId_example"; // String | 대화방ID 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            StatQueryPersistentMenuBrandIdGet200Response result = apiInstance.statQueryPersistentMenuBrandIdGet(brandId, startDate, endDate, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#statQueryPersistentMenuBrandIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **startDate** | **String**| 통계 조회 기간 시작일자(yyyymmdd) 입니다. | |
| **endDate** | **String**| 통계 조회 기간 종료일자(yyyymmdd) 입니다. | |
| **chatbotId** | **String**| 대화방ID 입니다. | |
| **xRCSBrandkey** | **String**| RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  | [optional] |

### Return type

[**StatQueryPersistentMenuBrandIdGet200Response**](StatQueryPersistentMenuBrandIdGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 성공적으로 처리된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## usableQueryChatbotIdChatbotIdGet

> UsableQueryChatbotIdChatbotIdGet200Response usableQueryChatbotIdChatbotIdGet(chatbotId)

대화방ID 등록 가능 여부를 조회 합니다. 

대화방ID 등록 가능 여부를 조회 합니다. 등록 가능한 경우 200 OK 응답으로 리턴되며, 대화방ID 형식 부적합, 이미 등록된 대화방ID 등  등록이 불가능한 경우 400 Error 리턴됩니다.    + 발신번호 조회 시에는 숫자만 입력해야 합니다.       - 발신번호 조회 시 숫자 이외 &#39;-&#39;을 삽입할 경우 양방향 대화방ID로 인식될 수 있으므로 주의해 주세요.     + 양방향 대화방ID 조회 시에는 영문, 숫자, &#39;-&#39;, &#39;_&#39; 사용이 가능합니다.       - 양방향 대화방ID 영문 대문자는 소문자로 변환됩니다.      + **계정 권한: 대행사**   

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String chatbotId = "chatbotId_example"; // String | 확인하고자 하는 대화방ID 입니다.
        try {
            UsableQueryChatbotIdChatbotIdGet200Response result = apiInstance.usableQueryChatbotIdChatbotIdGet(chatbotId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#usableQueryChatbotIdChatbotIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatbotId** | **String**| 확인하고자 하는 대화방ID 입니다. | |

### Return type

[**UsableQueryChatbotIdChatbotIdGet200Response**](UsableQueryChatbotIdChatbotIdGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 대화방ID 등록이 가능할 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## webhookUrlBidirectionalPost

> webhookUrlBidirectionalPost(webhookUrl, notiBidirectional)

양방향 서비스 제공 중계사에서 구현해야 하는 Webhook URI 입니다. 

양방향 서비스 제공 중계사에서 구현해야 하는 Webhook URI 입니다. RBC 대행사 정보의 수신서버 URL하위에 bidirctional 경로를 구현 제공해야 합니다.   양방향 서비스 제공 중계사는 RBC에 등록되는 대행사의 양방향 메시지 중계사 지정, 양방향 대화방 등록, 대화방 메뉴 사용 시 청약 여부와 같이 양방향 서비스 제공을 위해 필수 정보 연동이 필요합니다.   

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String webhookUrl = "webhookUrl_example"; // String | 양방향 중계사에서 등록한 수신서버(Webhook) URL 정보 입니다. 
        NotiBidirectional notiBidirectional = new NotiBidirectional(); // NotiBidirectional | notiType에 설정된 다음의 대상 정보를 구분하여 Object를 제공합니다.   persistentmenu는 registration의 의미를 포함하고 있습니다.   예를 들어, A중계사로 지정되어 있던 대화방메뉴를 갖는 양방향 대화방의 중계사를 B중계사로 변경한 경우, B중계사는 registration 수신 없이 persistentmenu를 수신하게 됩니다.      - 'appointment': 일반 대행사가 양방향 서비스 중계사로 지정 알림   + 중계사는 대행사 지정에 대한 판단 후 성공(200) 또는 실패(404) 응답을 리턴하여야 함      **[예시]**     {     \"notiType\": \"appointment\",     \"value\": {       \"agencyCorpRegNum\": \"1148196221\"     }   }    - 'registration': 양방향 대화방 등록 알림 (agencyId는 RBC에 등록된 대행사 ID 이며, noti를 받은 중계사를 지정한 대행사의 ID 또는 중계사의 ID)    + 양방향 대화방 생성 후 단순 통지, 중계사는 수신시 성공(200) 응답을 리턴하여야 함     **[예시]**     {     \"notiType\": \"registration\",     \"value\": {       \"agencyId\": \"noagency\",       \"brandId\": \"BR.Q63creSjku\",       \"brandKey\": \"BK.SD8X63r9uJaApN9\",       \"chatbotId\": \"bd_chatbot_v1\",       \"corpRegNum\": \"1148196221\"     }   }  - 'subscription': 대화방메뉴 자동응답메시지 사용 청약 확인을 RBC가 중계사로 요청함     + 중계사는 corpRegNum으로 대화방메뉴 자동응답메시지 사용 청약 여부를 확인 후 성공(200) 또는 실패(404) 응답을 리턴하여야 함      **[예시]**     {     \"notiType\": \"subscription\",     \"value\": {       \"agencyId\": \"noagency\",       \"brandId\": \"BR.Q63creSjku\",       \"brandKey\": \"BK.SD8X63r9uJaApN9\",       \"chatbotId\": \"bd_chatbot_v1\",       \"corpRegNum\": \"1148196221\"     }   }  - 'persistentmenu': 대화방메뉴 등록 알림 (agencyId는 RBC에 등록된 대행사 ID 이며, noti를 받은 중계사를 지정한 대행사의 ID 또는 중계사의 ID)   + 양방향 대화방 대화방메뉴 등록 후 단순 통지, 중계사는 수신시 성공(200) 응답을 리턴하여야 함    **[예시]**     {     \"notiType\": \"persistentmenu\",     \"value\": {       \"agencyId\": \"noagency\",       \"brandId\": \"BR.Q63creSjku\",       \"brandKey\": \"BK.SD8X63r9uJaApN9\",       \"chatbotId\": \"bd_chatbot_v1\",       \"corpRegNum\": \"1148196221\"     }   } 
        try {
            apiInstance.webhookUrlBidirectionalPost(webhookUrl, notiBidirectional);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#webhookUrlBidirectionalPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookUrl** | **String**| 양방향 중계사에서 등록한 수신서버(Webhook) URL 정보 입니다.  | |
| **notiBidirectional** | [**NotiBidirectional**](NotiBidirectional.md)| notiType에 설정된 다음의 대상 정보를 구분하여 Object를 제공합니다.   persistentmenu는 registration의 의미를 포함하고 있습니다.   예를 들어, A중계사로 지정되어 있던 대화방메뉴를 갖는 양방향 대화방의 중계사를 B중계사로 변경한 경우, B중계사는 registration 수신 없이 persistentmenu를 수신하게 됩니다.      - &#39;appointment&#39;: 일반 대행사가 양방향 서비스 중계사로 지정 알림   + 중계사는 대행사 지정에 대한 판단 후 성공(200) 또는 실패(404) 응답을 리턴하여야 함      **[예시]**     {     \&quot;notiType\&quot;: \&quot;appointment\&quot;,     \&quot;value\&quot;: {       \&quot;agencyCorpRegNum\&quot;: \&quot;1148196221\&quot;     }   }    - &#39;registration&#39;: 양방향 대화방 등록 알림 (agencyId는 RBC에 등록된 대행사 ID 이며, noti를 받은 중계사를 지정한 대행사의 ID 또는 중계사의 ID)    + 양방향 대화방 생성 후 단순 통지, 중계사는 수신시 성공(200) 응답을 리턴하여야 함     **[예시]**     {     \&quot;notiType\&quot;: \&quot;registration\&quot;,     \&quot;value\&quot;: {       \&quot;agencyId\&quot;: \&quot;noagency\&quot;,       \&quot;brandId\&quot;: \&quot;BR.Q63creSjku\&quot;,       \&quot;brandKey\&quot;: \&quot;BK.SD8X63r9uJaApN9\&quot;,       \&quot;chatbotId\&quot;: \&quot;bd_chatbot_v1\&quot;,       \&quot;corpRegNum\&quot;: \&quot;1148196221\&quot;     }   }  - &#39;subscription&#39;: 대화방메뉴 자동응답메시지 사용 청약 확인을 RBC가 중계사로 요청함     + 중계사는 corpRegNum으로 대화방메뉴 자동응답메시지 사용 청약 여부를 확인 후 성공(200) 또는 실패(404) 응답을 리턴하여야 함      **[예시]**     {     \&quot;notiType\&quot;: \&quot;subscription\&quot;,     \&quot;value\&quot;: {       \&quot;agencyId\&quot;: \&quot;noagency\&quot;,       \&quot;brandId\&quot;: \&quot;BR.Q63creSjku\&quot;,       \&quot;brandKey\&quot;: \&quot;BK.SD8X63r9uJaApN9\&quot;,       \&quot;chatbotId\&quot;: \&quot;bd_chatbot_v1\&quot;,       \&quot;corpRegNum\&quot;: \&quot;1148196221\&quot;     }   }  - &#39;persistentmenu&#39;: 대화방메뉴 등록 알림 (agencyId는 RBC에 등록된 대행사 ID 이며, noti를 받은 중계사를 지정한 대행사의 ID 또는 중계사의 ID)   + 양방향 대화방 대화방메뉴 등록 후 단순 통지, 중계사는 수신시 성공(200) 응답을 리턴하여야 함    **[예시]**     {     \&quot;notiType\&quot;: \&quot;persistentmenu\&quot;,     \&quot;value\&quot;: {       \&quot;agencyId\&quot;: \&quot;noagency\&quot;,       \&quot;brandId\&quot;: \&quot;BR.Q63creSjku\&quot;,       \&quot;brandKey\&quot;: \&quot;BK.SD8X63r9uJaApN9\&quot;,       \&quot;chatbotId\&quot;: \&quot;bd_chatbot_v1\&quot;,       \&quot;corpRegNum\&quot;: \&quot;1148196221\&quot;     }   }  | [optional] |

### Return type

null (empty response body)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 전송된 정보가 정상 처리된 경우 응답합니다.  |  -  |
| **404** | appointment, subscription 수신 시 판단 결과 실패에 해당하는 경우 리턴 합니다.  |  -  |


## webhookUrlPost

> webhookUrlPost(webhookUrl, webhookUrlPostRequest)

대행사에서 등록한 수신서버 URL을 통해 RBC에서 발생하는 데이터의 등록/수정/삭제 이벤트 정보를 전달합니다. 

대행사에서 등록한 수신서버 URL을 통해 RBC에서 발생하는 데이터의 등록/수정/삭제 이벤트 정보를 전달합니다.   등록/수정/삭제 알림 대상은 다음과 같습니다.     + 브랜드 계약(권한) 등록     + 브랜드 수정/반려     + 대화방 승인/수정/반려/삭제     + 템플릿 승인/수정/반려/삭제     + 자동응답메시지 등록/수정/삭제     + 신규 포멧/템플릿 상품 등록     + 대행사 키 재발급   + 레아아웃 등록/수정/삭제   + 로고 승인/수정/반려/삭제 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        AgencyApi apiInstance = new AgencyApi(defaultClient);
        String webhookUrl = "webhookUrl_example"; // String | 대행사에서 등록한 Webhook URL 정보 
        WebhookUrlPostRequest webhookUrlPostRequest = new WebhookUrlPostRequest(); // WebhookUrlPostRequest | notiType에 설정된 다음의 대상 정보를 구분하여 Object를 제공합니다.    - contract: 브랜드 계약                 - chatbot: 대화방                 - messagebaseform: 템플릿 양식                 - template: 템플릿                 - format: 포멧(이통 제공 공통템플릿)                 - brand: 브랜드                 - autoreplymsg: 자동응답메시지                 - agencykey: 대행사 키   - formatbr: 브랜드에 등록된 레이아웃으로 만든 포멧     - logo: 브랜드 로고 
        try {
            apiInstance.webhookUrlPost(webhookUrl, webhookUrlPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgencyApi#webhookUrlPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookUrl** | **String**| 대행사에서 등록한 Webhook URL 정보  | |
| **webhookUrlPostRequest** | [**WebhookUrlPostRequest**](WebhookUrlPostRequest.md)| notiType에 설정된 다음의 대상 정보를 구분하여 Object를 제공합니다.    - contract: 브랜드 계약                 - chatbot: 대화방                 - messagebaseform: 템플릿 양식                 - template: 템플릿                 - format: 포멧(이통 제공 공통템플릿)                 - brand: 브랜드                 - autoreplymsg: 자동응답메시지                 - agencykey: 대행사 키   - formatbr: 브랜드에 등록된 레이아웃으로 만든 포멧     - logo: 브랜드 로고  | [optional] |

### Return type

null (empty response body)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 성공적으로 알림을 수신하였을 경우 응답합니다.  |  -  |
| **400** | 대행사 측 청약이 우선 처리되지 않은 상태에서 &#39;contract&#39;가 전달된 경우 필히 응답되어야 합니다.  |  -  |

