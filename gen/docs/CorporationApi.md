# CorporationApi

All URIs are relative to *https://api-qa.rcsbizcenter.com/api/1.1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**brandBrandIdAutoreplymsgAutoReplyMsgIdDelete**](CorporationApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdDelete) | **DELETE** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지를 삭제합니다.  |
| [**brandBrandIdAutoreplymsgAutoReplyMsgIdGet**](CorporationApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdGet) | **GET** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지의 상세 정보를 조회합니다.  |
| [**brandBrandIdAutoreplymsgAutoReplyMsgIdPut**](CorporationApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdPut) | **PUT** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지의 정보를 업데이트합니다.  |
| [**brandBrandIdAutoreplymsgFileFileIdGet**](CorporationApi.md#brandBrandIdAutoreplymsgFileFileIdGet) | **GET** /brand/{brandId}/autoreplymsg/file/{fileId} | 자동응답메시지에서 사용할 이미지 파일 상세 정보를 조회합니다.  |
| [**brandBrandIdAutoreplymsgFilePost**](CorporationApi.md#brandBrandIdAutoreplymsgFilePost) | **POST** /brand/{brandId}/autoreplymsg/file | 자동응답메시지에서 사용할 이미지 파일을 등록합니다.  |
| [**brandBrandIdAutoreplymsgGet**](CorporationApi.md#brandBrandIdAutoreplymsgGet) | **GET** /brand/{brandId}/autoreplymsg | 브랜드 내에 등록된 자동응답메시지 목록을 조회합니다.  |
| [**brandBrandIdAutoreplymsgPost**](CorporationApi.md#brandBrandIdAutoreplymsgPost) | **POST** /brand/{brandId}/autoreplymsg | 브랜드에 자동응답메시지를 등록합니다.  |
| [**brandBrandIdBidirectionalChatbotChatbotIdDelete**](CorporationApi.md#brandBrandIdBidirectionalChatbotChatbotIdDelete) | **DELETE** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향)을 삭제합니다.  |
| [**brandBrandIdBidirectionalChatbotChatbotIdGet**](CorporationApi.md#brandBrandIdBidirectionalChatbotChatbotIdGet) | **GET** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향)의 상세 정보를 조회합니다.  |
| [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete**](CorporationApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete) | **DELETE** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방의 대화방메뉴를 삭제합니다.  |
| [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost**](CorporationApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost) | **POST** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방에 대화방메뉴를 등록합니다.  |
| [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut**](CorporationApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut) | **PUT** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방의 대화방메뉴를 수정합니다.  |
| [**brandBrandIdBidirectionalChatbotChatbotIdPut**](CorporationApi.md#brandBrandIdBidirectionalChatbotChatbotIdPut) | **PUT** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향) 정보를 수정 합니다.  |
| [**brandBrandIdBidirectionalChatbotGet**](CorporationApi.md#brandBrandIdBidirectionalChatbotGet) | **GET** /brand/{brandId}/bidirectional/chatbot | 브랜드에 등록된 대화방(양방향) 목록을 조회합니다.  |
| [**brandBrandIdBidirectionalChatbotPost**](CorporationApi.md#brandBrandIdBidirectionalChatbotPost) | **POST** /brand/{brandId}/bidirectional/chatbot | 대화방(양방향)을 등록합니다.  |
| [**brandBrandIdChatbotChatbotIdCancelPut**](CorporationApi.md#brandBrandIdChatbotChatbotIdCancelPut) | **PUT** /brand/{brandId}/chatbot/{chatbotId}/cancel | 지정된 대화방(발신번호, 양방향ID)의 승인요청을 취소합니다.  |
| [**brandBrandIdChatbotChatbotIdDelete**](CorporationApi.md#brandBrandIdChatbotChatbotIdDelete) | **DELETE** /brand/{brandId}/chatbot/{chatbotId} | 대화방(발신번호)을 삭제합니다.  |
| [**brandBrandIdChatbotChatbotIdGet**](CorporationApi.md#brandBrandIdChatbotChatbotIdGet) | **GET** /brand/{brandId}/chatbot/{chatbotId} | 지정된 대화방(발신번호)의 상세 정보를 조회합니다.  |
| [**brandBrandIdChatbotChatbotIdPut**](CorporationApi.md#brandBrandIdChatbotChatbotIdPut) | **PUT** /brand/{brandId}/chatbot/{chatbotId} | 지정된 대화방(발신번호)의 정보를 업데이트합니다.  |
| [**brandBrandIdChatbotGet**](CorporationApi.md#brandBrandIdChatbotGet) | **GET** /brand/{brandId}/chatbot | 브랜드 내에 등록된 대화방 목록을 조회합니다.  |
| [**brandBrandIdChatbotPost**](CorporationApi.md#brandBrandIdChatbotPost) | **POST** /brand/{brandId}/chatbot | 지정된 브랜드에 대화방(발신번호)을 등록합니다.  |
| [**brandBrandIdLogoFileIdCancelPut**](CorporationApi.md#brandBrandIdLogoFileIdCancelPut) | **PUT** /brand/{brandId}/logo/{fileId}/cancel | 로고의 승인요청을 취소합니다.  |
| [**brandBrandIdLogoFileIdDelete**](CorporationApi.md#brandBrandIdLogoFileIdDelete) | **DELETE** /brand/{brandId}/logo/{fileId} | 브랜드에 등록된 승인 이전 상태의 로고를 삭제 합니다.  |
| [**brandBrandIdLogoFileIdGet**](CorporationApi.md#brandBrandIdLogoFileIdGet) | **GET** /brand/{brandId}/logo/{fileId} | 브랜드에 등록된 로고를 단건 상세 조회합니다.  |
| [**brandBrandIdLogoFileIdPut**](CorporationApi.md#brandBrandIdLogoFileIdPut) | **PUT** /brand/{brandId}/logo/{fileId} | 브랜드에 등록된 로고를 수정 승인요청 합니다.  |
| [**brandBrandIdLogoGet**](CorporationApi.md#brandBrandIdLogoGet) | **GET** /brand/{brandId}/logo | 브랜드 별 등록된 로고 목록을 조회합니다.  |
| [**brandBrandIdLogoPost**](CorporationApi.md#brandBrandIdLogoPost) | **POST** /brand/{brandId}/logo | 브랜드 내에서 사용할 수 있는 로고를 등록 합니다.    |
| [**brandBrandIdMessagebaseGet**](CorporationApi.md#brandBrandIdMessagebaseGet) | **GET** /brand/{brandId}/messagebase | 브랜드에 등록된 템플릿을 조회합니다.  |
| [**brandBrandIdMessagebaseMessagebaseIdCancelPut**](CorporationApi.md#brandBrandIdMessagebaseMessagebaseIdCancelPut) | **PUT** /brand/{brandId}/messagebase/{messagebaseId}/cancel | 지정된 템플릿의 승인요청을 취소합니다.  |
| [**brandBrandIdMessagebaseMessagebaseIdDelete**](CorporationApi.md#brandBrandIdMessagebaseMessagebaseIdDelete) | **DELETE** /brand/{brandId}/messagebase/{messagebaseId} | 브랜드 내 지정된 템플릿을 삭제합니다.  |
| [**brandBrandIdMessagebaseMessagebaseIdGet**](CorporationApi.md#brandBrandIdMessagebaseMessagebaseIdGet) | **GET** /brand/{brandId}/messagebase/{messagebaseId} | 브랜드에 등록된 지정 템플릿 상세 내역을 조회합니다.  |
| [**brandBrandIdMessagebaseMessagebaseIdPut**](CorporationApi.md#brandBrandIdMessagebaseMessagebaseIdPut) | **PUT** /brand/{brandId}/messagebase/{messagebaseId} | 지정 템플릿을 업데이트 합니다.  |
| [**brandBrandIdMessagebasePost**](CorporationApi.md#brandBrandIdMessagebasePost) | **POST** /brand/{brandId}/messagebase | 브랜드 내에서 사용할 구형 텍스트 템플릿을 등록합니다. 추가된 신규 템플릿 유형은 POST /brand/{brandId}/v2/messagebase 을 이용해야 합니다.  |
| [**brandBrandIdV2MessagebaseFileFileIdGet**](CorporationApi.md#brandBrandIdV2MessagebaseFileFileIdGet) | **GET** /brand/{brandId}/v2/messagebase/file/{fileId} | 이미지 템플릿 용으로 등록한 이미지 파일 정보를 조회 합니다.  |
| [**brandBrandIdV2MessagebaseFilePost**](CorporationApi.md#brandBrandIdV2MessagebaseFilePost) | **POST** /brand/{brandId}/v2/messagebase/file | 이미지 템플릿에서 사용할 이미지 파일을 등록합니다.  |
| [**brandBrandIdV2MessagebaseMessagebaseIdPut**](CorporationApi.md#brandBrandIdV2MessagebaseMessagebaseIdPut) | **PUT** /brand/{brandId}/v2/messagebase/{messagebaseId} | 이미 등록된 템플릿의 내용을 수정합니다.  |
| [**brandBrandIdV2MessagebasePost**](CorporationApi.md#brandBrandIdV2MessagebasePost) | **POST** /brand/{brandId}/v2/messagebase | 브랜드 내에서 사용할 템플릿을 등록합니다.   Openrichcard 규격의 모든 템플릿 등록이 가능합니다.  |
| [**corpBrandBrandIdCancelPut**](CorporationApi.md#corpBrandBrandIdCancelPut) | **PUT** /corp/brand/{brandId}/cancel | 신규 개설한 승인대기 중인 브랜드의 승인요청을 취소합니다.    |
| [**corpBrandBrandIdDelete**](CorporationApi.md#corpBrandBrandIdDelete) | **DELETE** /corp/brand/{brandId} | 마스터 계정을 이용하여 승인 이력이 없는 신규 개설 브랜드 삭제를 요청합니다.  |
| [**corpBrandBrandIdPut**](CorporationApi.md#corpBrandBrandIdPut) | **PUT** /corp/brand/{brandId} | RBC 웹에서 임시저장으로 등록한 브랜드 또는 신규 브랜드 등록 검수 시 반려된 경우 브랜드 수정 후 승인요청 시 사용합니다.  |
| [**corpBrandCategoriesGet**](CorporationApi.md#corpBrandCategoriesGet) | **GET** /corp/brand/categories | 브랜드 등록 시 사용 가능한 카테고리 목록을 조회합니다.   |
| [**corpBrandPost**](CorporationApi.md#corpBrandPost) | **POST** /corp/brand | 마스터, 매니저 계정을 이용하여 신규 브랜드 등록 승인을 요청합니다.  |
| [**corpPersonIdBrandBrandIdCancelPut**](CorporationApi.md#corpPersonIdBrandBrandIdCancelPut) | **PUT** /corp/{personId}/brand/{brandId}/cancel | 승인대기 중인 브랜드의 승인요청을 취소합니다.    |
| [**corpPersonIdBrandBrandIdDelete**](CorporationApi.md#corpPersonIdBrandBrandIdDelete) | **DELETE** /corp/{personId}/brand/{brandId} | 브랜드를 삭제합니다.  |
| [**corpPersonIdBrandBrandIdGet**](CorporationApi.md#corpPersonIdBrandBrandIdGet) | **GET** /corp/{personId}/brand/{brandId} | 브랜드 상세 정보를 조회합니다.  |
| [**corpPersonIdBrandBrandIdPrivilegeGet**](CorporationApi.md#corpPersonIdBrandBrandIdPrivilegeGet) | **GET** /corp/{personId}/brand/{brandId}/privilege | 브랜드에 등록된 운영 권한 정보를 조회합니다.  |
| [**corpPersonIdBrandBrandIdPrivilegeIdDelete**](CorporationApi.md#corpPersonIdBrandBrandIdPrivilegeIdDelete) | **DELETE** /corp/{personId}/brand/{brandId}/privilege/{id} | 브랜드 운영자 권한 중 지정한 대상을 삭제합니다.  |
| [**corpPersonIdBrandBrandIdPrivilegePost**](CorporationApi.md#corpPersonIdBrandBrandIdPrivilegePost) | **POST** /corp/{personId}/brand/{brandId}/privilege | 브랜드 대표운영자가 브랜드 내 운영자(기업의 마스터/매니저, 대행사) 권한을 부여 합니다.  |
| [**corpPersonIdBrandBrandIdPrivilegePut**](CorporationApi.md#corpPersonIdBrandBrandIdPrivilegePut) | **PUT** /corp/{personId}/brand/{brandId}/privilege | 브랜드 대표운영자 권한을 위임합니다.  |
| [**corpPersonIdBrandBrandIdPut**](CorporationApi.md#corpPersonIdBrandBrandIdPut) | **PUT** /corp/{personId}/brand/{brandId} | 현재 운영 중인 브랜드 정보를 수정 합니다. 브랜드명, 프로필 이미지가 수정되면 다시 승인을 받아야 합니다.  |
| [**corpPersonIdBrandGet**](CorporationApi.md#corpPersonIdBrandGet) | **GET** /corp/{personId}/brand | 마스터 또는 매니저 계정으로 운영 권한이 있는 브랜드 목록을 조회합니다.  |
| [**logoCommonGet**](CorporationApi.md#logoCommonGet) | **GET** /logo/common | RBC에서 제공되는 기본 아이콘 이미지 정보를 조회합니다.  |
| [**messagebaseCommonGet**](CorporationApi.md#messagebaseCommonGet) | **GET** /messagebase/common | 이통사가 기본 제공하는 공통템플릿을 조회합니다.  |
| [**messagebaseCommonMessagebaseIdGet**](CorporationApi.md#messagebaseCommonMessagebaseIdGet) | **GET** /messagebase/common/{messagebaseId} | 이통사가 기본 제공하는 공통템플릿 별 상세 내용을 조회합니다.  |
| [**messagebaseMessagebaseformGet**](CorporationApi.md#messagebaseMessagebaseformGet) | **GET** /messagebase/messagebaseform | 템플릿 양식 목록을 조회합니다.  |
| [**messagebaseMessagebaseformMessagebaseformIdGet**](CorporationApi.md#messagebaseMessagebaseformMessagebaseformIdGet) | **GET** /messagebase/messagebaseform/{messagebaseformId} | 템플릿 유형의 상세 내용을 조회합니다.  |
| [**messagebaseMessagebaseformMessagebaseformIdLogoGet**](CorporationApi.md#messagebaseMessagebaseformMessagebaseformIdLogoGet) | **GET** /messagebase/messagebaseform/{messagebaseformId}/logo | RBC에서 템플릿용으로 제공되는 기본 로고 이미지 정보를 조회합니다.  |
| [**statQueryBrandprofileBrandIdGet**](CorporationApi.md#statQueryBrandprofileBrandIdGet) | **GET** /statQuery/brandprofile/{brandId} | (준비중) 브랜드프로필 노출 통계를 조회합니다.  |
| [**statQueryMessageBrandIdGet**](CorporationApi.md#statQueryMessageBrandIdGet) | **GET** /statQuery/message/{brandId} | 고객반응 통계 - 캠페인 메시지 발송/읽음확인 통계를 조회합니다.  |
| [**statQueryMessageButtonBrandIdGet**](CorporationApi.md#statQueryMessageButtonBrandIdGet) | **GET** /statQuery/messageButton/{brandId} | 고객반응 통계 - 캠페인 메시지 버튼 클릭 통계를 조회합니다.  |
| [**statQueryPersistentMenuBrandIdGet**](CorporationApi.md#statQueryPersistentMenuBrandIdGet) | **GET** /statQuery/persistentMenu/{brandId} | 고객반응 통계 - 대화방 메뉴 클릭 통계를 조회합니다.  |
| [**usableQueryChatbotIdChatbotIdGet**](CorporationApi.md#usableQueryChatbotIdChatbotIdGet) | **GET** /usableQuery/chatbotId/{chatbotId} | 대화방ID 등록 가능 여부를 조회 합니다.  |



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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String autoReplyMsgId = "autoReplyMsgId_example"; // String | 브랜드 내 자동응답메시지 정보 접근시 사용되는 자동응답메시지ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdAutoreplymsgPost200Response result = apiInstance.brandBrandIdAutoreplymsgAutoReplyMsgIdDelete(brandId, autoReplyMsgId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdAutoreplymsgAutoReplyMsgIdDelete");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String autoReplyMsgId = "autoReplyMsgId_example"; // String | 브랜드 내 자동응답메시지 정보 접근시 사용되는 자동응답메시지ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response result = apiInstance.brandBrandIdAutoreplymsgAutoReplyMsgIdGet(brandId, autoReplyMsgId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdAutoreplymsgAutoReplyMsgIdGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String autoReplyMsgId = "autoReplyMsgId_example"; // String | 브랜드 내 자동응답메시지 정보 접근시 사용되는 자동응답메시지ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        RegAutoReplyMsgInfo regAutoReplyMsgInfo = new RegAutoReplyMsgInfo(); // RegAutoReplyMsgInfo | 
        try {
            BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response result = apiInstance.brandBrandIdAutoreplymsgAutoReplyMsgIdPut(brandId, autoReplyMsgId, xRCSBrandkey, regAutoReplyMsgInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdAutoreplymsgAutoReplyMsgIdPut");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String fileId = "fileId_example"; // String | 파일ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdAutoreplymsgFilePost200Response result = apiInstance.brandBrandIdAutoreplymsgFileFileIdGet(brandId, fileId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdAutoreplymsgFileFileIdGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Object _file = null; // Object | 자동응답메시지에 사용할 이미지 파일입니다. 
        try {
            BrandBrandIdAutoreplymsgFilePost200Response result = apiInstance.brandBrandIdAutoreplymsgFilePost(brandId, xRCSBrandkey, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdAutoreplymsgFilePost");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BrandBrandIdAutoreplymsgGet200Response result = apiInstance.brandBrandIdAutoreplymsgGet(brandId, xRCSBrandkey, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdAutoreplymsgGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        RegAutoReplyMsgInfo regAutoReplyMsgInfo = new RegAutoReplyMsgInfo(); // RegAutoReplyMsgInfo | 자동응답메시지 등록 정보를 전송합니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdAutoreplymsgPost200Response result = apiInstance.brandBrandIdAutoreplymsgPost(brandId, regAutoReplyMsgInfo, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdAutoreplymsgPost");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response result = apiInstance.brandBrandIdBidirectionalChatbotChatbotIdDelete(brandId, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdBidirectionalChatbotChatbotIdDelete");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdBidirectionalChatbotChatbotIdGet200Response result = apiInstance.brandBrandIdBidirectionalChatbotChatbotIdGet(brandId, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdBidirectionalChatbotChatbotIdGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response result = apiInstance.brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete(brandId, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest = new BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest(); // BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest | 
        try {
            BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response result = apiInstance.brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost(brandId, chatbotId, xRCSBrandkey, brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest = new BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest(); // BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest | 
        try {
            BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response result = apiInstance.brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut(brandId, chatbotId, xRCSBrandkey, brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        BrandBrandIdBidirectionalChatbotChatbotIdPutRequest brandBrandIdBidirectionalChatbotChatbotIdPutRequest = new BrandBrandIdBidirectionalChatbotChatbotIdPutRequest(); // BrandBrandIdBidirectionalChatbotChatbotIdPutRequest | 
        try {
            BrandBrandIdBidirectionalChatbotPost200Response result = apiInstance.brandBrandIdBidirectionalChatbotChatbotIdPut(brandId, chatbotId, xRCSBrandkey, brandBrandIdBidirectionalChatbotChatbotIdPutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdBidirectionalChatbotChatbotIdPut");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BrandBrandIdBidirectionalChatbotGet200Response result = apiInstance.brandBrandIdBidirectionalChatbotGet(brandId, xRCSBrandkey, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdBidirectionalChatbotGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        BrandBrandIdBidirectionalChatbotPostRequest brandBrandIdBidirectionalChatbotPostRequest = new BrandBrandIdBidirectionalChatbotPostRequest(); // BrandBrandIdBidirectionalChatbotPostRequest | 
        try {
            BrandBrandIdBidirectionalChatbotPost200Response result = apiInstance.brandBrandIdBidirectionalChatbotPost(brandId, xRCSBrandkey, brandBrandIdBidirectionalChatbotPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdBidirectionalChatbotPost");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdChatbotChatbotIdCancelPut200Response result = apiInstance.brandBrandIdChatbotChatbotIdCancelPut(brandId, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdChatbotChatbotIdCancelPut");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdChatbotChatbotIdDelete200Response result = apiInstance.brandBrandIdChatbotChatbotIdDelete(brandId, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdChatbotChatbotIdDelete");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdChatbotChatbotIdGet200Response result = apiInstance.brandBrandIdChatbotChatbotIdGet(brandId, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdChatbotChatbotIdGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Object subNumCertificate = null; // Object | 통신서비스 가입증명원 입니다.   입력한 발신번호와 통신서비스 가입증명원의 전화번호가 일치해야 발신번호 등록이 가능하며 최근 1개월 이내 발급된 서류로 제출해야 합니다.   **파일형식 : jpg, png, pdf, tiff, zip (최대20MB)** 
        RegChatbotInfo chatbot = new RegChatbotInfo(); // RegChatbotInfo | 
        try {
            BrandBrandIdChatbotChatbotIdGet200Response result = apiInstance.brandBrandIdChatbotChatbotIdPut(brandId, chatbotId, xRCSBrandkey, subNumCertificate, chatbot);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdChatbotChatbotIdPut");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BrandBrandIdChatbotGet200Response result = apiInstance.brandBrandIdChatbotGet(brandId, xRCSBrandkey, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdChatbotGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Object subNumCertificate = null; // Object | 통신서비스 가입증명원 입니다.   입력한 발신번호와 통신서비스 가입증명원의 전화번호가 일치해야 발신번호 등록이 가능하며 최근 1개월 이내 발급된 서류로 제출해야 합니다.   **파일형식 : jpg, png, pdf, tiff, zip (최대20MB)** 
        CorpBrandPostRequestChatbots chatbots = new CorpBrandPostRequestChatbots(); // CorpBrandPostRequestChatbots | 
        try {
            BrandBrandIdChatbotPost200Response result = apiInstance.brandBrandIdChatbotPost(brandId, xRCSBrandkey, subNumCertificate, chatbots);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdChatbotPost");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String fileId = "fileId_example"; // String | 로고 이미지 파일 ID 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdLogoPost200Response result = apiInstance.brandBrandIdLogoFileIdCancelPut(brandId, fileId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdLogoFileIdCancelPut");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String fileId = "fileId_example"; // String | 로고 ID 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdLogoFileIdDelete200Response result = apiInstance.brandBrandIdLogoFileIdDelete(brandId, fileId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdLogoFileIdDelete");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String fileId = "fileId_example"; // String | 로고 이미지 파일 ID 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdLogoFileIdGet200Response result = apiInstance.brandBrandIdLogoFileIdGet(brandId, fileId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdLogoFileIdGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
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
            System.err.println("Exception when calling CorporationApi#brandBrandIdLogoFileIdPut");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BrandBrandIdLogoGet200Response result = apiInstance.brandBrandIdLogoGet(brandId, xRCSBrandkey, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdLogoGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String name = "name_example"; // String | 로고명 입니다.
        Object _file = null; // Object | 업로드 로고 이미지 파일을 지칭합니다.            **파일형식 : gif, png, jpeg, jpg, bmp (최대 1MB)** 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        String description = "description_example"; // String | 100자 이내의 로고 설명 입니다.
        try {
            BrandBrandIdLogoPost200Response result = apiInstance.brandBrandIdLogoPost(brandId, name, _file, xRCSBrandkey, description);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdLogoPost");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            MessagebaseCommonGet200Response result = apiInstance.brandBrandIdMessagebaseGet(brandId, xRCSBrandkey, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdMessagebaseGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String messagebaseId = "messagebaseId_example"; // String | 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdMessagebaseMessagebaseIdPut200Response result = apiInstance.brandBrandIdMessagebaseMessagebaseIdCancelPut(brandId, messagebaseId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdMessagebaseMessagebaseIdCancelPut");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String messagebaseId = "messagebaseId_example"; // String | 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdMessagebaseMessagebaseIdPut200Response result = apiInstance.brandBrandIdMessagebaseMessagebaseIdDelete(brandId, messagebaseId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdMessagebaseMessagebaseIdDelete");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String messagebaseId = "messagebaseId_example"; // String | 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdMessagebaseMessagebaseIdGet200Response result = apiInstance.brandBrandIdMessagebaseMessagebaseIdGet(brandId, messagebaseId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdMessagebaseMessagebaseIdGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String messagebaseId = "messagebaseId_example"; // String | 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        RegMessagebaseInfo regMessagebaseInfo = new RegMessagebaseInfo(); // RegMessagebaseInfo | 
        try {
            BrandBrandIdMessagebaseMessagebaseIdPut200Response result = apiInstance.brandBrandIdMessagebaseMessagebaseIdPut(brandId, messagebaseId, xRCSBrandkey, regMessagebaseInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdMessagebaseMessagebaseIdPut");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        BrandBrandIdMessagebasePostRequest brandBrandIdMessagebasePostRequest = new BrandBrandIdMessagebasePostRequest(); // BrandBrandIdMessagebasePostRequest | 
        try {
            BrandBrandIdMessagebasePost200Response result = apiInstance.brandBrandIdMessagebasePost(brandId, xRCSBrandkey, brandBrandIdMessagebasePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdMessagebasePost");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String fileId = "fileId_example"; // String | 파일ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdV2MessagebaseFilePost200Response result = apiInstance.brandBrandIdV2MessagebaseFileFileIdGet(brandId, fileId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdV2MessagebaseFileFileIdGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        Object _file = null; // Object | 이미지 템플릿에 사용할 이미지 파일입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdV2MessagebaseFilePost200Response result = apiInstance.brandBrandIdV2MessagebaseFilePost(brandId, _file, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdV2MessagebaseFilePost");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String messagebaseId = "messagebaseId_example"; // String | 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        ModTemplateInfo modTemplateInfo = new ModTemplateInfo(); // ModTemplateInfo | 
        try {
            BrandBrandIdMessagebasePost200Response result = apiInstance.brandBrandIdV2MessagebaseMessagebaseIdPut(brandId, messagebaseId, xRCSBrandkey, modTemplateInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdV2MessagebaseMessagebaseIdPut");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.            
        RegTemplateInfo regTemplateInfo = new RegTemplateInfo(); // RegTemplateInfo | 
        try {
            BrandBrandIdMessagebasePost200Response result = apiInstance.brandBrandIdV2MessagebasePost(brandId, xRCSBrandkey, regTemplateInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#brandBrandIdV2MessagebasePost");
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


## corpBrandBrandIdCancelPut

> CorpPersonIdBrandBrandIdCancelPut200Response corpBrandBrandIdCancelPut(brandId)

신규 개설한 승인대기 중인 브랜드의 승인요청을 취소합니다.   

신규 개설한 승인대기 중인 브랜드의 승인요청을 취소합니다.    검수가 시작된 브랜드는 승인취소가 불가 합니다.      + **계정 권한 : 마스터, 매니저**     + **가능 상태 : 승인대기**   

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        try {
            CorpPersonIdBrandBrandIdCancelPut200Response result = apiInstance.corpBrandBrandIdCancelPut(brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#corpBrandBrandIdCancelPut");
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

### Return type

[**CorpPersonIdBrandBrandIdCancelPut200Response**](CorpPersonIdBrandBrandIdCancelPut200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** |  |  -  |


## corpBrandBrandIdDelete

> CorpPersonIdBrandBrandIdDelete200Response corpBrandBrandIdDelete(brandId)

마스터 계정을 이용하여 승인 이력이 없는 신규 개설 브랜드 삭제를 요청합니다. 

마스터 계정을 이용하여 승인 이력이 없는 해당 계정이 신규 개설한 브랜드 삭제를 요청합니다. 정상적으로 승인요청된 브랜드는 **승인대기** 상태가 되므로 삭제가 불가합니다.\\ **- 사용 권한 계정 : 마스터**\\ **- 삭제 가능 상태 : 저장, 반려** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        try {
            CorpPersonIdBrandBrandIdDelete200Response result = apiInstance.corpBrandBrandIdDelete(brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#corpBrandBrandIdDelete");
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

### Return type

[**CorpPersonIdBrandBrandIdDelete200Response**](CorpPersonIdBrandBrandIdDelete200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 정상적으로 처리된 경우 응답됩니다. |  -  |
| **0** |  |  -  |


## corpBrandBrandIdPut

> CorpBrandPost200Response corpBrandBrandIdPut(brandId, regBrand, brandProfile, brandBackground, mainMdn, chatbots, subNumCertificate)

RBC 웹에서 임시저장으로 등록한 브랜드 또는 신규 브랜드 등록 검수 시 반려된 경우 브랜드 수정 후 승인요청 시 사용합니다. 

RBC 웹에서 임시저장으로 등록한 브랜드 또는 신규 브랜드 등록 검수 시 반려된 경우 브랜드 수정 후 승인요청 시 사용합니다.   브랜드 등록 POST API를 통해 **승인** 요청하였으나 검수 시 **반려**되어 재승인 요청 또는   **RBC 홈페이지**에서 **임시저장**한 브랜드 정보를 수정하여 승인 요청하는 경우 사용합니다.      + **계정 권한 : 마스터, 매니저**   + **브랜드 권한 : 브랜드 대표운영자(브랜드를 등록한 마스터 또는 매니저)**     + **수정 대상 브랜드 상태 : 반려, 저장** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        RegBrandInfo regBrand = new RegBrandInfo(); // RegBrandInfo | 
        Object brandProfile = null; // Object | 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : png (최대1MB)** 
        Object brandBackground = null; // Object | 브랜드 백그라운드 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : jpg, png (최대1MB)** 
        String mainMdn = "mainMdn_example"; // String | 대표발신번호 개념 제거되어 더 이상 유효하지 않습니다.
        CorpBrandPostRequestChatbots chatbots = new CorpBrandPostRequestChatbots(); // CorpBrandPostRequestChatbots | 
        Object subNumCertificate = null; // Object | 통신서비스이용증명원을 업로드합니다.   대화방(발신번호) 등록을 위해 chatbots 지정한 경우 필수로 함께 업로드해야 합니다.   **허용되는 파일형식 : jpg, png, pdf, tiff, zip (최대20MB)**   
        try {
            CorpBrandPost200Response result = apiInstance.corpBrandBrandIdPut(brandId, regBrand, brandProfile, brandBackground, mainMdn, chatbots, subNumCertificate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#corpBrandBrandIdPut");
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
| **regBrand** | [**RegBrandInfo**](RegBrandInfo.md)|  | |
| **brandProfile** | [**Object**](Object.md)| 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : png (최대1MB)**  | |
| **brandBackground** | [**Object**](Object.md)| 브랜드 백그라운드 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : jpg, png (최대1MB)**  | [optional] |
| **mainMdn** | **String**| 대표발신번호 개념 제거되어 더 이상 유효하지 않습니다. | [optional] |
| **chatbots** | [**CorpBrandPostRequestChatbots**](CorpBrandPostRequestChatbots.md)|  | [optional] |
| **subNumCertificate** | [**Object**](Object.md)| 통신서비스이용증명원을 업로드합니다.   대화방(발신번호) 등록을 위해 chatbots 지정한 경우 필수로 함께 업로드해야 합니다.   **허용되는 파일형식 : jpg, png, pdf, tiff, zip (최대20MB)**    | [optional] |

### Return type

[**CorpBrandPost200Response**](CorpBrandPost200Response.md)

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


## corpBrandCategoriesGet

> CorpBrandCategoriesGet200Response corpBrandCategoriesGet()

브랜드 등록 시 사용 가능한 카테고리 목록을 조회합니다.  

RCS Biz Center에서 브랜드를 등록할 때 필수 요구되는 카테고리(categoryId, categoryName), 하위 카테고리(subCategoryId, subCategoryName)에 해당하는 카테고리 목록을 조회합니다.   조회된 카테고리, 하위 카테고리 를 이용하여 브랜드 등록 시 지정합니다.      + **계정 권한 : 마스터, 매니저**   + **브랜드 권한 : 브랜드 대표운영자**    

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        try {
            CorpBrandCategoriesGet200Response result = apiInstance.corpBrandCategoriesGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#corpBrandCategoriesGet");
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

[**CorpBrandCategoriesGet200Response**](CorpBrandCategoriesGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** |  |  -  |


## corpBrandPost

> CorpBrandPost200Response corpBrandPost(regBrand, brandProfile, brandBackground, mainMdn, chatbots, subNumCertificate)

마스터, 매니저 계정을 이용하여 신규 브랜드 등록 승인을 요청합니다. 

마스터, 매니저 계정을 이용하여 신규 브랜드 등록 승인을 요청합니다.(매니저 계정도 브랜드 등록이 가능하도록 권한이 변경되었습니다.)   또한 필수 항목이었던 발신번호는 옵션으로 변경되었습니다.   따라서 발신번호를 함께 등록하는 경우에만 발신번호에 대한 &#39;통신서비스 가입증명원&#39;을 함께 등록하면 됩니다.     브랜드를 등록한 계정은 브랜드의 대표운영자로 설정되며, 매니저 권한으로 등록한 브랜드는 마스터 권한 승급을 받아야 승인을 받을 수 있습니다.        + **계정 권한 : 마스터, 매니저**   

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        RegBrandInfo regBrand = new RegBrandInfo(); // RegBrandInfo | 
        Object brandProfile = null; // Object | 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : png (최대1MB)** 
        Object brandBackground = null; // Object | 브랜드 백그라운드 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : jpg, png (최대1MB)** 
        String mainMdn = "mainMdn_example"; // String | 대표발신번호 개념 제거되어 더 이상 유효하지 않습니다.
        CorpBrandPostRequestChatbots chatbots = new CorpBrandPostRequestChatbots(); // CorpBrandPostRequestChatbots | 
        Object subNumCertificate = null; // Object | 통신서비스이용증명원을 업로드합니다.   대화방(발신번호) 등록을 위해 chatbots 지정한 경우 필수로 함께 업로드해야 합니다.   **허용되는 파일형식 : jpg, png, pdf, tiff, zip (최대20MB)**   
        try {
            CorpBrandPost200Response result = apiInstance.corpBrandPost(regBrand, brandProfile, brandBackground, mainMdn, chatbots, subNumCertificate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#corpBrandPost");
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
| **regBrand** | [**RegBrandInfo**](RegBrandInfo.md)|  | |
| **brandProfile** | [**Object**](Object.md)| 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : png (최대1MB)**  | |
| **brandBackground** | [**Object**](Object.md)| 브랜드 백그라운드 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : jpg, png (최대1MB)**  | [optional] |
| **mainMdn** | **String**| 대표발신번호 개념 제거되어 더 이상 유효하지 않습니다. | [optional] |
| **chatbots** | [**CorpBrandPostRequestChatbots**](CorpBrandPostRequestChatbots.md)|  | [optional] |
| **subNumCertificate** | [**Object**](Object.md)| 통신서비스이용증명원을 업로드합니다.   대화방(발신번호) 등록을 위해 chatbots 지정한 경우 필수로 함께 업로드해야 합니다.   **허용되는 파일형식 : jpg, png, pdf, tiff, zip (최대20MB)**    | [optional] |

### Return type

[**CorpBrandPost200Response**](CorpBrandPost200Response.md)

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


## corpPersonIdBrandBrandIdCancelPut

> CorpPersonIdBrandBrandIdCancelPut200Response corpPersonIdBrandBrandIdCancelPut(personId, brandId)

승인대기 중인 브랜드의 승인요청을 취소합니다.   

승인대기 중인 브랜드의 승인요청을 취소합니다.   브랜드 대표운영자 또는 운영자 권한이 있어야 승인요청 취소가 가능합니다.   검수가 시작된 브랜드는 승인취소가 불가 합니다.      + **계정 권한 : 마스터, 매니저**     + **브랜드 권한 : 대표운영자, 운영자**     + **가능 상태 : 승인대기**   

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String personId = "personId_example"; // String | 브랜드 대표운영자 또는 운영자의 ID 입니다.
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        try {
            CorpPersonIdBrandBrandIdCancelPut200Response result = apiInstance.corpPersonIdBrandBrandIdCancelPut(personId, brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#corpPersonIdBrandBrandIdCancelPut");
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
| **personId** | **String**| 브랜드 대표운영자 또는 운영자의 ID 입니다. | |
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |

### Return type

[**CorpPersonIdBrandBrandIdCancelPut200Response**](CorpPersonIdBrandBrandIdCancelPut200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** |  |  -  |


## corpPersonIdBrandBrandIdDelete

> CorpPersonIdBrandBrandIdDelete200Response corpPersonIdBrandBrandIdDelete(personId, brandId)

브랜드를 삭제합니다. 

브랜드를 삭제합니다.   브랜드 삭제를 위해서는 토큰 발급계정과 personId가 동일해야 하며 brandId에 대한 브랜드 대표운영자 권한이 있어야 합니다.   승인을 받지 않은 &#39;반려&#39;, &#39;저장&#39; 상태의 브랜드는 즉시 삭제 가능합니다.   **승인된 브랜드의 경우 등록된 발신번호, 템플릿을 먼저 삭제한 후 브랜드를 삭제해야 처리됩니다.**      + **계정 권한 : 마스터**     + **브랜드 권한 : 대표운영자**     + **삭제 가능 상태 : 승인, 반려, 저장** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String personId = "personId_example"; // String | 브랜드 대표운영자 ID 입니다.
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        try {
            CorpPersonIdBrandBrandIdDelete200Response result = apiInstance.corpPersonIdBrandBrandIdDelete(personId, brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#corpPersonIdBrandBrandIdDelete");
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
| **personId** | **String**| 브랜드 대표운영자 ID 입니다. | |
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |

### Return type

[**CorpPersonIdBrandBrandIdDelete200Response**](CorpPersonIdBrandBrandIdDelete200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** |  |  -  |


## corpPersonIdBrandBrandIdGet

> CorpPersonIdBrandBrandIdGet200Response corpPersonIdBrandBrandIdGet(personId, brandId)

브랜드 상세 정보를 조회합니다. 

관리 중인 브랜드의 상세 정보를 조회합니다.      + **계정 권한 : 마스터, 매니저**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String personId = "personId_example"; // String | 브랜드 대표운영자 또는 운영자의 ID 입니다.
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        try {
            CorpPersonIdBrandBrandIdGet200Response result = apiInstance.corpPersonIdBrandBrandIdGet(personId, brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#corpPersonIdBrandBrandIdGet");
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
| **personId** | **String**| 브랜드 대표운영자 또는 운영자의 ID 입니다. | |
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
| **200** | 정상적으로 처리된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## corpPersonIdBrandBrandIdPrivilegeGet

> CorpPersonIdBrandBrandIdPrivilegeGet200Response corpPersonIdBrandBrandIdPrivilegeGet(personId, brandId)

브랜드에 등록된 운영 권한 정보를 조회합니다. 

브랜드에 등록된 운영 권한 정보를 조회합니다. 브랜드에 등록된 브랜드 대표운영자, 운영자, 권한 지정 대행사 정보를 제공합니다.      + **계정 권한: 마스터, 매니저**   + **브랜드 권한: 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String personId = "personId_example"; // String | 브랜드 대표운영자 또는 운영자 ID 입니다.
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        try {
            CorpPersonIdBrandBrandIdPrivilegeGet200Response result = apiInstance.corpPersonIdBrandBrandIdPrivilegeGet(personId, brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#corpPersonIdBrandBrandIdPrivilegeGet");
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
| **personId** | **String**| 브랜드 대표운영자 또는 운영자 ID 입니다. | |
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |

### Return type

[**CorpPersonIdBrandBrandIdPrivilegeGet200Response**](CorpPersonIdBrandBrandIdPrivilegeGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** |  |  -  |


## corpPersonIdBrandBrandIdPrivilegeIdDelete

> CorpPersonIdBrandBrandIdPrivilegeGet200Response corpPersonIdBrandBrandIdPrivilegeIdDelete(personId, brandId, id)

브랜드 운영자 권한 중 지정한 대상을 삭제합니다. 

브랜드 운영자(마스터, 매니저), 운영자(대행사) 권한 중 지정한 대상을 삭제합니다.   대행사가 양방향 대행사인 경우, 권한 삭제 시 대행사가 연결된 양방향 대화방의 연결을 해지합니다.   브랜드 대표운영자는 삭제할 수 없으며 브랜드 대표운영자를 변경하고자 할 경우 PUT 메서드를 사용하여야 합니다.    + **계정 권한 : 마스터**   + **브랜드 권한: 브랜드 대표운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String personId = "personId_example"; // String | 브랜드 대표운영자 ID 입니다.
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String id = "id_example"; // String | 브랜드 운영자(마스터, 매니저) 또는 운영자(대행사) ID 입니다.
        try {
            CorpPersonIdBrandBrandIdPrivilegeGet200Response result = apiInstance.corpPersonIdBrandBrandIdPrivilegeIdDelete(personId, brandId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#corpPersonIdBrandBrandIdPrivilegeIdDelete");
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
| **personId** | **String**| 브랜드 대표운영자 ID 입니다. | |
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **id** | **String**| 브랜드 운영자(마스터, 매니저) 또는 운영자(대행사) ID 입니다. | |

### Return type

[**CorpPersonIdBrandBrandIdPrivilegeGet200Response**](CorpPersonIdBrandBrandIdPrivilegeGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** |  |  -  |


## corpPersonIdBrandBrandIdPrivilegePost

> CorpPersonIdBrandBrandIdPrivilegeGet200Response corpPersonIdBrandBrandIdPrivilegePost(personId, brandId, corpPersonIdBrandBrandIdPrivilegePostRequest)

브랜드 대표운영자가 브랜드 내 운영자(기업의 마스터/매니저, 대행사) 권한을 부여 합니다. 

브랜드 대표운영자가 브랜드 내 운영자(기업의 마스터/매니저, 대행사) 권한을 부여 합니다.      + **계정 권한 : 마스터**   + **브랜드 권한 : 브랜드 대표운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String personId = "personId_example"; // String | 브랜드 대표운영자의 계정 ID 입니다.
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        CorpPersonIdBrandBrandIdPrivilegePostRequest corpPersonIdBrandBrandIdPrivilegePostRequest = new CorpPersonIdBrandBrandIdPrivilegePostRequest(); // CorpPersonIdBrandBrandIdPrivilegePostRequest | + privilegeType이 SubManager 인 경우, 소속된 기업 내 다른 마스터, 매니저 계정을 운영자로 지정할 수 있습니다.   + privilegeType이 Agency 인 경우, 별도의 RCS 발송 계약을 맺은 대행사를 운영자로 지정합니다.   
        try {
            CorpPersonIdBrandBrandIdPrivilegeGet200Response result = apiInstance.corpPersonIdBrandBrandIdPrivilegePost(personId, brandId, corpPersonIdBrandBrandIdPrivilegePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#corpPersonIdBrandBrandIdPrivilegePost");
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
| **personId** | **String**| 브랜드 대표운영자의 계정 ID 입니다. | |
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **corpPersonIdBrandBrandIdPrivilegePostRequest** | [**CorpPersonIdBrandBrandIdPrivilegePostRequest**](CorpPersonIdBrandBrandIdPrivilegePostRequest.md)| + privilegeType이 SubManager 인 경우, 소속된 기업 내 다른 마스터, 매니저 계정을 운영자로 지정할 수 있습니다.   + privilegeType이 Agency 인 경우, 별도의 RCS 발송 계약을 맺은 대행사를 운영자로 지정합니다.    | [optional] |

### Return type

[**CorpPersonIdBrandBrandIdPrivilegeGet200Response**](CorpPersonIdBrandBrandIdPrivilegeGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** |  |  -  |


## corpPersonIdBrandBrandIdPrivilegePut

> CorpPersonIdBrandBrandIdPrivilegeGet200Response corpPersonIdBrandBrandIdPrivilegePut(personId, brandId, corpPersonIdBrandBrandIdPrivilegePutRequest)

브랜드 대표운영자 권한을 위임합니다. 

브랜드 대표운영자 권한을 지정된 마스터에게 위임합니다.   브랜드 대표운영자 변경 시 위임전 대표운영자는 운영자로 변경됩니다.      + **계정 권한 : 마스터**     + **브랜드 권한 : 브랜드 대표운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String personId = "personId_example"; // String | 브랜드 대표운영자 ID 입니다.
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        CorpPersonIdBrandBrandIdPrivilegePutRequest corpPersonIdBrandBrandIdPrivilegePutRequest = new CorpPersonIdBrandBrandIdPrivilegePutRequest(); // CorpPersonIdBrandBrandIdPrivilegePutRequest | - privilegeType이 Manager 만 허용되며 지정한 마스터 ID를 대표운영자로 설정합니다.  
        try {
            CorpPersonIdBrandBrandIdPrivilegeGet200Response result = apiInstance.corpPersonIdBrandBrandIdPrivilegePut(personId, brandId, corpPersonIdBrandBrandIdPrivilegePutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#corpPersonIdBrandBrandIdPrivilegePut");
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
| **personId** | **String**| 브랜드 대표운영자 ID 입니다. | |
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **corpPersonIdBrandBrandIdPrivilegePutRequest** | [**CorpPersonIdBrandBrandIdPrivilegePutRequest**](CorpPersonIdBrandBrandIdPrivilegePutRequest.md)| - privilegeType이 Manager 만 허용되며 지정한 마스터 ID를 대표운영자로 설정합니다.   | [optional] |

### Return type

[**CorpPersonIdBrandBrandIdPrivilegeGet200Response**](CorpPersonIdBrandBrandIdPrivilegeGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** |  |  -  |


## corpPersonIdBrandBrandIdPut

> CorpPersonIdBrandBrandIdPut200Response corpPersonIdBrandBrandIdPut(personId, brandId, regBrand, brandProfile, brandBackground, mainMdn)

현재 운영 중인 브랜드 정보를 수정 합니다. 브랜드명, 프로필 이미지가 수정되면 다시 승인을 받아야 합니다. 

현재 운영 중인 브랜드 정보를 수정 합니다.    브랜드 대표운영자 또는 운영자 권한이 있어야 수정이 가능합니다.   **브랜드명** 또는 **프로필 이미지**가 수정되면 다시 승인을 받아야 합니다.   이외 정보 수정은 별도의 승인 과정 없이 업데이트 됩니다.   수정된 데이터가 이통 3사로 전송되는 과정에서 전송이 지연되거나 장애로 인해 이통 3사 모두 전송이 완료되지 못한 경우,   브랜드 정보 조회 데이터와 단말에서 표시되는 브랜드 홈 정보가 상이할 수 있습니다.      + **계정 권한 : 마스터, 매니저**     + **브랜드 권한 : 대표운영자, 운영자**     + **수정 가능 상태 : 승인, 반려(수정승인)**   

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String personId = "personId_example"; // String | 브랜드 대표운영자 또는 운영자의 ID 입니다.
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        RegBrandInfo regBrand = new RegBrandInfo(); // RegBrandInfo | 
        File brandProfile = new File("/path/to/file"); // File | 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 권장 / 파일형식 : png (최대1MB)** 
        File brandBackground = new File("/path/to/file"); // File | 브랜드 백그라운드 이미지를 업로드합니다.   등록되어 있는 브랜드 백그라운드 이미지를 제거하기 위해서는 파일 없이 brandBackground form key만 전송하면 됩니다.\\\\ **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 권장 / 파일형식 : jpg, png (최대1MB)** 
        String mainMdn = "mainMdn_example"; // String | 대표발신번호 개념 제거되어 더 이상 유효하지 않습니다.
        try {
            CorpPersonIdBrandBrandIdPut200Response result = apiInstance.corpPersonIdBrandBrandIdPut(personId, brandId, regBrand, brandProfile, brandBackground, mainMdn);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#corpPersonIdBrandBrandIdPut");
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
| **personId** | **String**| 브랜드 대표운영자 또는 운영자의 ID 입니다. | |
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **regBrand** | [**RegBrandInfo**](RegBrandInfo.md)|  | [optional] |
| **brandProfile** | **File**| 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 권장 / 파일형식 : png (최대1MB)**  | [optional] |
| **brandBackground** | **File**| 브랜드 백그라운드 이미지를 업로드합니다.   등록되어 있는 브랜드 백그라운드 이미지를 제거하기 위해서는 파일 없이 brandBackground form key만 전송하면 됩니다.\\\\ **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 권장 / 파일형식 : jpg, png (최대1MB)**  | [optional] |
| **mainMdn** | **String**| 대표발신번호 개념 제거되어 더 이상 유효하지 않습니다. | [optional] |

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
| **200** |  |  -  |
| **0** |  |  -  |


## corpPersonIdBrandGet

> CorpPersonIdBrandGet200Response corpPersonIdBrandGet(personId, offset, limit)

마스터 또는 매니저 계정으로 운영 권한이 있는 브랜드 목록을 조회합니다. 

마스터 또는 매니저 계정으로 운영 권한이 있는 브랜드 목록을 조회합니다.      + **계정 권한 : 마스터, 매니저**   + **브랜드 권한 : 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String personId = "personId_example"; // String | 브랜드 대표운영자 또는 운영자의 계정(마스터, 매니저) ID 입니다.
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            CorpPersonIdBrandGet200Response result = apiInstance.corpPersonIdBrandGet(personId, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#corpPersonIdBrandGet");
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
| **personId** | **String**| 브랜드 대표운영자 또는 운영자의 계정(마스터, 매니저) ID 입니다. | |
| **offset** | **Integer**| 시작 offset 번호(default: 0) 입니다. | [optional] |
| **limit** | **Integer**| 조회 최대 건수(default: 100, maximum: 1000) 입니다. | [optional] |

### Return type

[**CorpPersonIdBrandGet200Response**](CorpPersonIdBrandGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        try {
            LogoCommonGet200Response result = apiInstance.logoCommonGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#logoCommonGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String productCode = "sms"; // String | 리치카드 메시지 유형 구분값 입니다.
        String cardType = "standalone"; // String | MMS에서 제공되는 메시지 카드 형태 구분값 입니다.
        String bizService = "승인"; // String | 현재 공통템플릿은 유형별 제공되는 항목이 없으므로 본 파라미터는 사용되지 않습니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            MessagebaseCommonGet200Response result = apiInstance.messagebaseCommonGet(productCode, cardType, bizService, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#messagebaseCommonGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String messagebaseId = "messagebaseId_example"; // String | 
        try {
            MessagebaseCommonMessagebaseIdGet200Response result = apiInstance.messagebaseCommonMessagebaseIdGet(messagebaseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#messagebaseCommonMessagebaseIdGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
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
            System.err.println("Exception when calling CorporationApi#messagebaseMessagebaseformGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String messagebaseformId = "messagebaseformId_example"; // String | 
        try {
            MessagebaseMessagebaseformMessagebaseformIdGet200Response result = apiInstance.messagebaseMessagebaseformMessagebaseformIdGet(messagebaseformId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#messagebaseMessagebaseformMessagebaseformIdGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String messagebaseformId = "messagebaseformId_example"; // String | 
        try {
            MessagebaseMessagebaseformMessagebaseformIdLogoGet200Response result = apiInstance.messagebaseMessagebaseformMessagebaseformIdLogoGet(messagebaseformId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#messagebaseMessagebaseformMessagebaseformIdLogoGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String startDate = "startDate_example"; // String | 통계 조회 기간 시작일자(yyyymmdd) 입니다.
        String endDate = "endDate_example"; // String | 통계 조회 기간 종료일자(yyyymmdd) 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            StatQueryBrandprofileBrandIdGet200Response result = apiInstance.statQueryBrandprofileBrandIdGet(brandId, startDate, endDate, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#statQueryBrandprofileBrandIdGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
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
            System.err.println("Exception when calling CorporationApi#statQueryMessageBrandIdGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
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
            System.err.println("Exception when calling CorporationApi#statQueryMessageButtonBrandIdGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String startDate = "startDate_example"; // String | 통계 조회 기간 시작일자(yyyymmdd) 입니다.
        String endDate = "endDate_example"; // String | 통계 조회 기간 종료일자(yyyymmdd) 입니다.
        String chatbotId = "chatbotId_example"; // String | 대화방ID 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            StatQueryPersistentMenuBrandIdGet200Response result = apiInstance.statQueryPersistentMenuBrandIdGet(brandId, startDate, endDate, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#statQueryPersistentMenuBrandIdGet");
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
import org.openapitools.client.api.CorporationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        CorporationApi apiInstance = new CorporationApi(defaultClient);
        String chatbotId = "chatbotId_example"; // String | 확인하고자 하는 대화방ID 입니다.
        try {
            UsableQueryChatbotIdChatbotIdGet200Response result = apiInstance.usableQueryChatbotIdChatbotIdGet(chatbotId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorporationApi#usableQueryChatbotIdChatbotIdGet");
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

