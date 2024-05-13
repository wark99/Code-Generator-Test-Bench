# BidirectionalApi

All URIs are relative to *https://api-qa.rcsbizcenter.com/api/1.1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**brandBrandIdAutoreplymsgAutoReplyMsgIdDelete**](BidirectionalApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdDelete) | **DELETE** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지를 삭제합니다.  |
| [**brandBrandIdAutoreplymsgAutoReplyMsgIdGet**](BidirectionalApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdGet) | **GET** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지의 상세 정보를 조회합니다.  |
| [**brandBrandIdAutoreplymsgAutoReplyMsgIdPut**](BidirectionalApi.md#brandBrandIdAutoreplymsgAutoReplyMsgIdPut) | **PUT** /brand/{brandId}/autoreplymsg/{autoReplyMsgId} | 자동응답메시지의 정보를 업데이트합니다.  |
| [**brandBrandIdAutoreplymsgFileFileIdGet**](BidirectionalApi.md#brandBrandIdAutoreplymsgFileFileIdGet) | **GET** /brand/{brandId}/autoreplymsg/file/{fileId} | 자동응답메시지에서 사용할 이미지 파일 상세 정보를 조회합니다.  |
| [**brandBrandIdAutoreplymsgFilePost**](BidirectionalApi.md#brandBrandIdAutoreplymsgFilePost) | **POST** /brand/{brandId}/autoreplymsg/file | 자동응답메시지에서 사용할 이미지 파일을 등록합니다.  |
| [**brandBrandIdAutoreplymsgGet**](BidirectionalApi.md#brandBrandIdAutoreplymsgGet) | **GET** /brand/{brandId}/autoreplymsg | 브랜드 내에 등록된 자동응답메시지 목록을 조회합니다.  |
| [**brandBrandIdAutoreplymsgPost**](BidirectionalApi.md#brandBrandIdAutoreplymsgPost) | **POST** /brand/{brandId}/autoreplymsg | 브랜드에 자동응답메시지를 등록합니다.  |
| [**brandBrandIdBidirectionalChatbotChatbotIdDelete**](BidirectionalApi.md#brandBrandIdBidirectionalChatbotChatbotIdDelete) | **DELETE** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향)을 삭제합니다.  |
| [**brandBrandIdBidirectionalChatbotChatbotIdGet**](BidirectionalApi.md#brandBrandIdBidirectionalChatbotChatbotIdGet) | **GET** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향)의 상세 정보를 조회합니다.  |
| [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete**](BidirectionalApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete) | **DELETE** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방의 대화방메뉴를 삭제합니다.  |
| [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost**](BidirectionalApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost) | **POST** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방에 대화방메뉴를 등록합니다.  |
| [**brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut**](BidirectionalApi.md#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut) | **PUT** /brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu | 대화방의 대화방메뉴를 수정합니다.  |
| [**brandBrandIdBidirectionalChatbotChatbotIdPut**](BidirectionalApi.md#brandBrandIdBidirectionalChatbotChatbotIdPut) | **PUT** /brand/{brandId}/bidirectional/chatbot/{chatbotId} | 대화방(양방향) 정보를 수정 합니다.  |
| [**brandBrandIdBidirectionalChatbotGet**](BidirectionalApi.md#brandBrandIdBidirectionalChatbotGet) | **GET** /brand/{brandId}/bidirectional/chatbot | 브랜드에 등록된 대화방(양방향) 목록을 조회합니다.  |
| [**brandBrandIdBidirectionalChatbotPost**](BidirectionalApi.md#brandBrandIdBidirectionalChatbotPost) | **POST** /brand/{brandId}/bidirectional/chatbot | 대화방(양방향)을 등록합니다.  |
| [**brandBrandIdChatbotChatbotIdCancelPut**](BidirectionalApi.md#brandBrandIdChatbotChatbotIdCancelPut) | **PUT** /brand/{brandId}/chatbot/{chatbotId}/cancel | 지정된 대화방(발신번호, 양방향ID)의 승인요청을 취소합니다.  |
| [**webhookUrlBidirectionalPost**](BidirectionalApi.md#webhookUrlBidirectionalPost) | **POST** /{webhookUrl}/bidirectional | 양방향 서비스 제공 중계사에서 구현해야 하는 Webhook URI 입니다.  |



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
import org.openapitools.client.api.BidirectionalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        BidirectionalApi apiInstance = new BidirectionalApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String autoReplyMsgId = "autoReplyMsgId_example"; // String | 브랜드 내 자동응답메시지 정보 접근시 사용되는 자동응답메시지ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdAutoreplymsgPost200Response result = apiInstance.brandBrandIdAutoreplymsgAutoReplyMsgIdDelete(brandId, autoReplyMsgId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BidirectionalApi#brandBrandIdAutoreplymsgAutoReplyMsgIdDelete");
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
import org.openapitools.client.api.BidirectionalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        BidirectionalApi apiInstance = new BidirectionalApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String autoReplyMsgId = "autoReplyMsgId_example"; // String | 브랜드 내 자동응답메시지 정보 접근시 사용되는 자동응답메시지ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response result = apiInstance.brandBrandIdAutoreplymsgAutoReplyMsgIdGet(brandId, autoReplyMsgId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BidirectionalApi#brandBrandIdAutoreplymsgAutoReplyMsgIdGet");
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
import org.openapitools.client.api.BidirectionalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        BidirectionalApi apiInstance = new BidirectionalApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String autoReplyMsgId = "autoReplyMsgId_example"; // String | 브랜드 내 자동응답메시지 정보 접근시 사용되는 자동응답메시지ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        RegAutoReplyMsgInfo regAutoReplyMsgInfo = new RegAutoReplyMsgInfo(); // RegAutoReplyMsgInfo | 
        try {
            BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response result = apiInstance.brandBrandIdAutoreplymsgAutoReplyMsgIdPut(brandId, autoReplyMsgId, xRCSBrandkey, regAutoReplyMsgInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BidirectionalApi#brandBrandIdAutoreplymsgAutoReplyMsgIdPut");
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
import org.openapitools.client.api.BidirectionalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        BidirectionalApi apiInstance = new BidirectionalApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String fileId = "fileId_example"; // String | 파일ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdAutoreplymsgFilePost200Response result = apiInstance.brandBrandIdAutoreplymsgFileFileIdGet(brandId, fileId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BidirectionalApi#brandBrandIdAutoreplymsgFileFileIdGet");
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
import org.openapitools.client.api.BidirectionalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        BidirectionalApi apiInstance = new BidirectionalApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Object _file = null; // Object | 자동응답메시지에 사용할 이미지 파일입니다. 
        try {
            BrandBrandIdAutoreplymsgFilePost200Response result = apiInstance.brandBrandIdAutoreplymsgFilePost(brandId, xRCSBrandkey, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BidirectionalApi#brandBrandIdAutoreplymsgFilePost");
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
import org.openapitools.client.api.BidirectionalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        BidirectionalApi apiInstance = new BidirectionalApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BrandBrandIdAutoreplymsgGet200Response result = apiInstance.brandBrandIdAutoreplymsgGet(brandId, xRCSBrandkey, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BidirectionalApi#brandBrandIdAutoreplymsgGet");
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
import org.openapitools.client.api.BidirectionalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        BidirectionalApi apiInstance = new BidirectionalApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        RegAutoReplyMsgInfo regAutoReplyMsgInfo = new RegAutoReplyMsgInfo(); // RegAutoReplyMsgInfo | 자동응답메시지 등록 정보를 전송합니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdAutoreplymsgPost200Response result = apiInstance.brandBrandIdAutoreplymsgPost(brandId, regAutoReplyMsgInfo, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BidirectionalApi#brandBrandIdAutoreplymsgPost");
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
import org.openapitools.client.api.BidirectionalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        BidirectionalApi apiInstance = new BidirectionalApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response result = apiInstance.brandBrandIdBidirectionalChatbotChatbotIdDelete(brandId, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BidirectionalApi#brandBrandIdBidirectionalChatbotChatbotIdDelete");
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
import org.openapitools.client.api.BidirectionalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        BidirectionalApi apiInstance = new BidirectionalApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdBidirectionalChatbotChatbotIdGet200Response result = apiInstance.brandBrandIdBidirectionalChatbotChatbotIdGet(brandId, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BidirectionalApi#brandBrandIdBidirectionalChatbotChatbotIdGet");
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
import org.openapitools.client.api.BidirectionalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        BidirectionalApi apiInstance = new BidirectionalApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response result = apiInstance.brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete(brandId, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BidirectionalApi#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete");
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
import org.openapitools.client.api.BidirectionalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        BidirectionalApi apiInstance = new BidirectionalApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest = new BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest(); // BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest | 
        try {
            BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response result = apiInstance.brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost(brandId, chatbotId, xRCSBrandkey, brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BidirectionalApi#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost");
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
import org.openapitools.client.api.BidirectionalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        BidirectionalApi apiInstance = new BidirectionalApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest = new BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest(); // BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest | 
        try {
            BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response result = apiInstance.brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut(brandId, chatbotId, xRCSBrandkey, brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BidirectionalApi#brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut");
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
import org.openapitools.client.api.BidirectionalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        BidirectionalApi apiInstance = new BidirectionalApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        BrandBrandIdBidirectionalChatbotChatbotIdPutRequest brandBrandIdBidirectionalChatbotChatbotIdPutRequest = new BrandBrandIdBidirectionalChatbotChatbotIdPutRequest(); // BrandBrandIdBidirectionalChatbotChatbotIdPutRequest | 
        try {
            BrandBrandIdBidirectionalChatbotPost200Response result = apiInstance.brandBrandIdBidirectionalChatbotChatbotIdPut(brandId, chatbotId, xRCSBrandkey, brandBrandIdBidirectionalChatbotChatbotIdPutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BidirectionalApi#brandBrandIdBidirectionalChatbotChatbotIdPut");
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
import org.openapitools.client.api.BidirectionalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        BidirectionalApi apiInstance = new BidirectionalApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BrandBrandIdBidirectionalChatbotGet200Response result = apiInstance.brandBrandIdBidirectionalChatbotGet(brandId, xRCSBrandkey, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BidirectionalApi#brandBrandIdBidirectionalChatbotGet");
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
import org.openapitools.client.api.BidirectionalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        BidirectionalApi apiInstance = new BidirectionalApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        BrandBrandIdBidirectionalChatbotPostRequest brandBrandIdBidirectionalChatbotPostRequest = new BrandBrandIdBidirectionalChatbotPostRequest(); // BrandBrandIdBidirectionalChatbotPostRequest | 
        try {
            BrandBrandIdBidirectionalChatbotPost200Response result = apiInstance.brandBrandIdBidirectionalChatbotPost(brandId, xRCSBrandkey, brandBrandIdBidirectionalChatbotPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BidirectionalApi#brandBrandIdBidirectionalChatbotPost");
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
import org.openapitools.client.api.BidirectionalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        BidirectionalApi apiInstance = new BidirectionalApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdChatbotChatbotIdCancelPut200Response result = apiInstance.brandBrandIdChatbotChatbotIdCancelPut(brandId, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BidirectionalApi#brandBrandIdChatbotChatbotIdCancelPut");
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
import org.openapitools.client.api.BidirectionalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        BidirectionalApi apiInstance = new BidirectionalApi(defaultClient);
        String webhookUrl = "webhookUrl_example"; // String | 양방향 중계사에서 등록한 수신서버(Webhook) URL 정보 입니다. 
        NotiBidirectional notiBidirectional = new NotiBidirectional(); // NotiBidirectional | notiType에 설정된 다음의 대상 정보를 구분하여 Object를 제공합니다.   persistentmenu는 registration의 의미를 포함하고 있습니다.   예를 들어, A중계사로 지정되어 있던 대화방메뉴를 갖는 양방향 대화방의 중계사를 B중계사로 변경한 경우, B중계사는 registration 수신 없이 persistentmenu를 수신하게 됩니다.      - 'appointment': 일반 대행사가 양방향 서비스 중계사로 지정 알림   + 중계사는 대행사 지정에 대한 판단 후 성공(200) 또는 실패(404) 응답을 리턴하여야 함      **[예시]**     {     \"notiType\": \"appointment\",     \"value\": {       \"agencyCorpRegNum\": \"1148196221\"     }   }    - 'registration': 양방향 대화방 등록 알림 (agencyId는 RBC에 등록된 대행사 ID 이며, noti를 받은 중계사를 지정한 대행사의 ID 또는 중계사의 ID)    + 양방향 대화방 생성 후 단순 통지, 중계사는 수신시 성공(200) 응답을 리턴하여야 함     **[예시]**     {     \"notiType\": \"registration\",     \"value\": {       \"agencyId\": \"noagency\",       \"brandId\": \"BR.Q63creSjku\",       \"brandKey\": \"BK.SD8X63r9uJaApN9\",       \"chatbotId\": \"bd_chatbot_v1\",       \"corpRegNum\": \"1148196221\"     }   }  - 'subscription': 대화방메뉴 자동응답메시지 사용 청약 확인을 RBC가 중계사로 요청함     + 중계사는 corpRegNum으로 대화방메뉴 자동응답메시지 사용 청약 여부를 확인 후 성공(200) 또는 실패(404) 응답을 리턴하여야 함      **[예시]**     {     \"notiType\": \"subscription\",     \"value\": {       \"agencyId\": \"noagency\",       \"brandId\": \"BR.Q63creSjku\",       \"brandKey\": \"BK.SD8X63r9uJaApN9\",       \"chatbotId\": \"bd_chatbot_v1\",       \"corpRegNum\": \"1148196221\"     }   }  - 'persistentmenu': 대화방메뉴 등록 알림 (agencyId는 RBC에 등록된 대행사 ID 이며, noti를 받은 중계사를 지정한 대행사의 ID 또는 중계사의 ID)   + 양방향 대화방 대화방메뉴 등록 후 단순 통지, 중계사는 수신시 성공(200) 응답을 리턴하여야 함    **[예시]**     {     \"notiType\": \"persistentmenu\",     \"value\": {       \"agencyId\": \"noagency\",       \"brandId\": \"BR.Q63creSjku\",       \"brandKey\": \"BK.SD8X63r9uJaApN9\",       \"chatbotId\": \"bd_chatbot_v1\",       \"corpRegNum\": \"1148196221\"     }   } 
        try {
            apiInstance.webhookUrlBidirectionalPost(webhookUrl, notiBidirectional);
        } catch (ApiException e) {
            System.err.println("Exception when calling BidirectionalApi#webhookUrlBidirectionalPost");
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

