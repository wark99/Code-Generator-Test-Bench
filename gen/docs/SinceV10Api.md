# SinceV10Api

All URIs are relative to *https://api-qa.rcsbizcenter.com/api/1.1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**agencyAgencyIdBrandBrandIdGet**](SinceV10Api.md#agencyAgencyIdBrandBrandIdGet) | **GET** /agency/{agencyId}/brand/{brandId} | 계약된 브랜드 정보를 개별 조회 합니다.  |
| [**agencyAgencyIdContractGet**](SinceV10Api.md#agencyAgencyIdContractGet) | **GET** /agency/{agencyId}/contract | 대행사가 계약된 브랜드 리스트를 제공합니다.  |
| [**agencyAgencyIdCorpCorpRegNumBrandGet**](SinceV10Api.md#agencyAgencyIdCorpCorpRegNumBrandGet) | **GET** /agency/{agencyId}/corp/{corpRegNum}/brand | 대행사가 계약된 브랜드를 기업 단위로 조회합니다.  |
| [**brandBrandIdAutoreplymsgGet**](SinceV10Api.md#brandBrandIdAutoreplymsgGet) | **GET** /brand/{brandId}/autoreplymsg | 브랜드 내에 등록된 자동응답메시지 목록을 조회합니다.  |
| [**brandBrandIdChatbotChatbotIdDelete**](SinceV10Api.md#brandBrandIdChatbotChatbotIdDelete) | **DELETE** /brand/{brandId}/chatbot/{chatbotId} | 대화방(발신번호)을 삭제합니다.  |
| [**brandBrandIdChatbotChatbotIdGet**](SinceV10Api.md#brandBrandIdChatbotChatbotIdGet) | **GET** /brand/{brandId}/chatbot/{chatbotId} | 지정된 대화방(발신번호)의 상세 정보를 조회합니다.  |
| [**brandBrandIdChatbotChatbotIdPut**](SinceV10Api.md#brandBrandIdChatbotChatbotIdPut) | **PUT** /brand/{brandId}/chatbot/{chatbotId} | 지정된 대화방(발신번호)의 정보를 업데이트합니다.  |
| [**brandBrandIdChatbotGet**](SinceV10Api.md#brandBrandIdChatbotGet) | **GET** /brand/{brandId}/chatbot | 브랜드 내에 등록된 대화방 목록을 조회합니다.  |
| [**brandBrandIdChatbotPost**](SinceV10Api.md#brandBrandIdChatbotPost) | **POST** /brand/{brandId}/chatbot | 지정된 브랜드에 대화방(발신번호)을 등록합니다.  |
| [**brandBrandIdMessagebaseGet**](SinceV10Api.md#brandBrandIdMessagebaseGet) | **GET** /brand/{brandId}/messagebase | 브랜드에 등록된 템플릿을 조회합니다.  |
| [**brandBrandIdMessagebaseMessagebaseIdDelete**](SinceV10Api.md#brandBrandIdMessagebaseMessagebaseIdDelete) | **DELETE** /brand/{brandId}/messagebase/{messagebaseId} | 브랜드 내 지정된 템플릿을 삭제합니다.  |
| [**brandBrandIdMessagebaseMessagebaseIdGet**](SinceV10Api.md#brandBrandIdMessagebaseMessagebaseIdGet) | **GET** /brand/{brandId}/messagebase/{messagebaseId} | 브랜드에 등록된 지정 템플릿 상세 내역을 조회합니다.  |
| [**brandBrandIdMessagebaseMessagebaseIdPut**](SinceV10Api.md#brandBrandIdMessagebaseMessagebaseIdPut) | **PUT** /brand/{brandId}/messagebase/{messagebaseId} | 지정 템플릿을 업데이트 합니다.  |
| [**brandBrandIdMessagebasePost**](SinceV10Api.md#brandBrandIdMessagebasePost) | **POST** /brand/{brandId}/messagebase | 브랜드 내에서 사용할 구형 텍스트 템플릿을 등록합니다. 추가된 신규 템플릿 유형은 POST /brand/{brandId}/v2/messagebase 을 이용해야 합니다.  |
| [**corpPersonIdBrandGet**](SinceV10Api.md#corpPersonIdBrandGet) | **GET** /corp/{personId}/brand | 마스터 또는 매니저 계정으로 운영 권한이 있는 브랜드 목록을 조회합니다.  |
| [**messagebaseCommonGet**](SinceV10Api.md#messagebaseCommonGet) | **GET** /messagebase/common | 이통사가 기본 제공하는 공통템플릿을 조회합니다.  |
| [**messagebaseCommonMessagebaseIdGet**](SinceV10Api.md#messagebaseCommonMessagebaseIdGet) | **GET** /messagebase/common/{messagebaseId} | 이통사가 기본 제공하는 공통템플릿 별 상세 내용을 조회합니다.  |
| [**messagebaseMessagebaseformGet**](SinceV10Api.md#messagebaseMessagebaseformGet) | **GET** /messagebase/messagebaseform | 템플릿 양식 목록을 조회합니다.  |
| [**messagebaseMessagebaseformMessagebaseformIdGet**](SinceV10Api.md#messagebaseMessagebaseformMessagebaseformIdGet) | **GET** /messagebase/messagebaseform/{messagebaseformId} | 템플릿 유형의 상세 내용을 조회합니다.  |
| [**tokenPost**](SinceV10Api.md#tokenPost) | **POST** /token | Access 토큰을 발급 요청합니다.  |
| [**webhookUrlPost**](SinceV10Api.md#webhookUrlPost) | **POST** /{webhookUrl} | 대행사에서 등록한 수신서버 URL을 통해 RBC에서 발생하는 데이터의 등록/수정/삭제 이벤트 정보를 전달합니다.  |



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
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
        String agencyId = "agencyId_example"; // String | RCS Biz Center에 등록된 대행사 ID 입니다.
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        try {
            CorpPersonIdBrandBrandIdGet200Response result = apiInstance.agencyAgencyIdBrandBrandIdGet(agencyId, brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV10Api#agencyAgencyIdBrandBrandIdGet");
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
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
        String agencyId = "agencyId_example"; // String | RCS Biz Center에 등록된 대행사 ID 입니다.
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            AgencyAgencyIdContractGet200Response result = apiInstance.agencyAgencyIdContractGet(agencyId, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV10Api#agencyAgencyIdContractGet");
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
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
        String agencyId = "agencyId_example"; // String | RCS Biz Center에 등록된 대행사 ID 입니다.
        String corpRegNum = "corpRegNum_example"; // String | 대상 기업의 사업자등록번호(10자리) 입니다.
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            AgencyAgencyIdContractGet200Response result = apiInstance.agencyAgencyIdCorpCorpRegNumBrandGet(agencyId, corpRegNum, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV10Api#agencyAgencyIdCorpCorpRegNumBrandGet");
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
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BrandBrandIdAutoreplymsgGet200Response result = apiInstance.brandBrandIdAutoreplymsgGet(brandId, xRCSBrandkey, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV10Api#brandBrandIdAutoreplymsgGet");
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
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdChatbotChatbotIdDelete200Response result = apiInstance.brandBrandIdChatbotChatbotIdDelete(brandId, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV10Api#brandBrandIdChatbotChatbotIdDelete");
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
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdChatbotChatbotIdGet200Response result = apiInstance.brandBrandIdChatbotChatbotIdGet(brandId, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV10Api#brandBrandIdChatbotChatbotIdGet");
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
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String chatbotId = "chatbotId_example"; // String | 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Object subNumCertificate = null; // Object | 통신서비스 가입증명원 입니다.   입력한 발신번호와 통신서비스 가입증명원의 전화번호가 일치해야 발신번호 등록이 가능하며 최근 1개월 이내 발급된 서류로 제출해야 합니다.   **파일형식 : jpg, png, pdf, tiff, zip (최대20MB)** 
        RegChatbotInfo chatbot = new RegChatbotInfo(); // RegChatbotInfo | 
        try {
            BrandBrandIdChatbotChatbotIdGet200Response result = apiInstance.brandBrandIdChatbotChatbotIdPut(brandId, chatbotId, xRCSBrandkey, subNumCertificate, chatbot);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV10Api#brandBrandIdChatbotChatbotIdPut");
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
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BrandBrandIdChatbotGet200Response result = apiInstance.brandBrandIdChatbotGet(brandId, xRCSBrandkey, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV10Api#brandBrandIdChatbotGet");
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
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Object subNumCertificate = null; // Object | 통신서비스 가입증명원 입니다.   입력한 발신번호와 통신서비스 가입증명원의 전화번호가 일치해야 발신번호 등록이 가능하며 최근 1개월 이내 발급된 서류로 제출해야 합니다.   **파일형식 : jpg, png, pdf, tiff, zip (최대20MB)** 
        CorpBrandPostRequestChatbots chatbots = new CorpBrandPostRequestChatbots(); // CorpBrandPostRequestChatbots | 
        try {
            BrandBrandIdChatbotPost200Response result = apiInstance.brandBrandIdChatbotPost(brandId, xRCSBrandkey, subNumCertificate, chatbots);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV10Api#brandBrandIdChatbotPost");
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
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            MessagebaseCommonGet200Response result = apiInstance.brandBrandIdMessagebaseGet(brandId, xRCSBrandkey, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV10Api#brandBrandIdMessagebaseGet");
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
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String messagebaseId = "messagebaseId_example"; // String | 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdMessagebaseMessagebaseIdPut200Response result = apiInstance.brandBrandIdMessagebaseMessagebaseIdDelete(brandId, messagebaseId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV10Api#brandBrandIdMessagebaseMessagebaseIdDelete");
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
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String messagebaseId = "messagebaseId_example"; // String | 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdMessagebaseMessagebaseIdGet200Response result = apiInstance.brandBrandIdMessagebaseMessagebaseIdGet(brandId, messagebaseId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV10Api#brandBrandIdMessagebaseMessagebaseIdGet");
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
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String messagebaseId = "messagebaseId_example"; // String | 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        RegMessagebaseInfo regMessagebaseInfo = new RegMessagebaseInfo(); // RegMessagebaseInfo | 
        try {
            BrandBrandIdMessagebaseMessagebaseIdPut200Response result = apiInstance.brandBrandIdMessagebaseMessagebaseIdPut(brandId, messagebaseId, xRCSBrandkey, regMessagebaseInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV10Api#brandBrandIdMessagebaseMessagebaseIdPut");
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
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        BrandBrandIdMessagebasePostRequest brandBrandIdMessagebasePostRequest = new BrandBrandIdMessagebasePostRequest(); // BrandBrandIdMessagebasePostRequest | 
        try {
            BrandBrandIdMessagebasePost200Response result = apiInstance.brandBrandIdMessagebasePost(brandId, xRCSBrandkey, brandBrandIdMessagebasePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV10Api#brandBrandIdMessagebasePost");
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
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
        String personId = "personId_example"; // String | 브랜드 대표운영자 또는 운영자의 계정(마스터, 매니저) ID 입니다.
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            CorpPersonIdBrandGet200Response result = apiInstance.corpPersonIdBrandGet(personId, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV10Api#corpPersonIdBrandGet");
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
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
        String productCode = "sms"; // String | 리치카드 메시지 유형 구분값 입니다.
        String cardType = "standalone"; // String | MMS에서 제공되는 메시지 카드 형태 구분값 입니다.
        String bizService = "승인"; // String | 현재 공통템플릿은 유형별 제공되는 항목이 없으므로 본 파라미터는 사용되지 않습니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            MessagebaseCommonGet200Response result = apiInstance.messagebaseCommonGet(productCode, cardType, bizService, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV10Api#messagebaseCommonGet");
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
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
        String messagebaseId = "messagebaseId_example"; // String | 
        try {
            MessagebaseCommonMessagebaseIdGet200Response result = apiInstance.messagebaseCommonMessagebaseIdGet(messagebaseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV10Api#messagebaseCommonMessagebaseIdGet");
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
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
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
            System.err.println("Exception when calling SinceV10Api#messagebaseMessagebaseformGet");
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
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
        String messagebaseformId = "messagebaseformId_example"; // String | 
        try {
            MessagebaseMessagebaseformMessagebaseformIdGet200Response result = apiInstance.messagebaseMessagebaseformMessagebaseformIdGet(messagebaseformId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV10Api#messagebaseMessagebaseformMessagebaseformIdGet");
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


## tokenPost

> TokenInfo tokenPost(tokenPostRequest)

Access 토큰을 발급 요청합니다. 

Access 토큰을 발급 요청합니다.   RCS Biz Center 웹에서 가입 시 등록한 ID(마스터 또는 매니저, 대행사)와 계정 가입 시 자동 생성되는 API Key(RCS Biz Center 내 계정관리에서 확인)를 이용하여 토큰 발급을 요청합니다.   response로 전달되는 expiresIn 시간이 초과하면 토큰을 새로 발급 받아야 합니다.              + **API 사용 Client의 IP는 RCS Biz Center에서 등록하여야 합니다.       Client IP 등록은 내 계정관리에서 ID별 최대 10개까지 등록할 수 있습니다.**             + **계정 권한 : 마스터, 매니저, 대행사** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
        TokenPostRequest tokenPostRequest = new TokenPostRequest(); // TokenPostRequest | required: true 
        try {
            TokenInfo result = apiInstance.tokenPost(tokenPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV10Api#tokenPost");
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
| **tokenPostRequest** | [**TokenPostRequest**](TokenPostRequest.md)| required: true  | [optional] |

### Return type

[**TokenInfo**](TokenInfo.md)

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
import org.openapitools.client.api.SinceV10Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV10Api apiInstance = new SinceV10Api(defaultClient);
        String webhookUrl = "webhookUrl_example"; // String | 대행사에서 등록한 Webhook URL 정보 
        WebhookUrlPostRequest webhookUrlPostRequest = new WebhookUrlPostRequest(); // WebhookUrlPostRequest | notiType에 설정된 다음의 대상 정보를 구분하여 Object를 제공합니다.    - contract: 브랜드 계약                 - chatbot: 대화방                 - messagebaseform: 템플릿 양식                 - template: 템플릿                 - format: 포멧(이통 제공 공통템플릿)                 - brand: 브랜드                 - autoreplymsg: 자동응답메시지                 - agencykey: 대행사 키   - formatbr: 브랜드에 등록된 레이아웃으로 만든 포멧     - logo: 브랜드 로고 
        try {
            apiInstance.webhookUrlPost(webhookUrl, webhookUrlPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV10Api#webhookUrlPost");
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

