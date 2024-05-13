# MessagebaseApi

All URIs are relative to *https://api-qa.rcsbizcenter.com/api/1.1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**brandBrandIdMessagebaseGet**](MessagebaseApi.md#brandBrandIdMessagebaseGet) | **GET** /brand/{brandId}/messagebase | 브랜드에 등록된 템플릿을 조회합니다.  |
| [**brandBrandIdMessagebaseMessagebaseIdCancelPut**](MessagebaseApi.md#brandBrandIdMessagebaseMessagebaseIdCancelPut) | **PUT** /brand/{brandId}/messagebase/{messagebaseId}/cancel | 지정된 템플릿의 승인요청을 취소합니다.  |
| [**brandBrandIdMessagebaseMessagebaseIdDelete**](MessagebaseApi.md#brandBrandIdMessagebaseMessagebaseIdDelete) | **DELETE** /brand/{brandId}/messagebase/{messagebaseId} | 브랜드 내 지정된 템플릿을 삭제합니다.  |
| [**brandBrandIdMessagebaseMessagebaseIdGet**](MessagebaseApi.md#brandBrandIdMessagebaseMessagebaseIdGet) | **GET** /brand/{brandId}/messagebase/{messagebaseId} | 브랜드에 등록된 지정 템플릿 상세 내역을 조회합니다.  |
| [**brandBrandIdMessagebaseMessagebaseIdPut**](MessagebaseApi.md#brandBrandIdMessagebaseMessagebaseIdPut) | **PUT** /brand/{brandId}/messagebase/{messagebaseId} | 지정 템플릿을 업데이트 합니다.  |
| [**brandBrandIdMessagebasePost**](MessagebaseApi.md#brandBrandIdMessagebasePost) | **POST** /brand/{brandId}/messagebase | 브랜드 내에서 사용할 구형 텍스트 템플릿을 등록합니다. 추가된 신규 템플릿 유형은 POST /brand/{brandId}/v2/messagebase 을 이용해야 합니다.  |
| [**brandBrandIdV2MessagebaseFileFileIdGet**](MessagebaseApi.md#brandBrandIdV2MessagebaseFileFileIdGet) | **GET** /brand/{brandId}/v2/messagebase/file/{fileId} | 이미지 템플릿 용으로 등록한 이미지 파일 정보를 조회 합니다.  |
| [**brandBrandIdV2MessagebaseFilePost**](MessagebaseApi.md#brandBrandIdV2MessagebaseFilePost) | **POST** /brand/{brandId}/v2/messagebase/file | 이미지 템플릿에서 사용할 이미지 파일을 등록합니다.  |
| [**brandBrandIdV2MessagebaseMessagebaseIdPut**](MessagebaseApi.md#brandBrandIdV2MessagebaseMessagebaseIdPut) | **PUT** /brand/{brandId}/v2/messagebase/{messagebaseId} | 이미 등록된 템플릿의 내용을 수정합니다.  |
| [**brandBrandIdV2MessagebasePost**](MessagebaseApi.md#brandBrandIdV2MessagebasePost) | **POST** /brand/{brandId}/v2/messagebase | 브랜드 내에서 사용할 템플릿을 등록합니다.   Openrichcard 규격의 모든 템플릿 등록이 가능합니다.  |
| [**messagebaseCommonGet**](MessagebaseApi.md#messagebaseCommonGet) | **GET** /messagebase/common | 이통사가 기본 제공하는 공통템플릿을 조회합니다.  |
| [**messagebaseCommonMessagebaseIdGet**](MessagebaseApi.md#messagebaseCommonMessagebaseIdGet) | **GET** /messagebase/common/{messagebaseId} | 이통사가 기본 제공하는 공통템플릿 별 상세 내용을 조회합니다.  |
| [**messagebaseMessagebaseformGet**](MessagebaseApi.md#messagebaseMessagebaseformGet) | **GET** /messagebase/messagebaseform | 템플릿 양식 목록을 조회합니다.  |
| [**messagebaseMessagebaseformMessagebaseformIdGet**](MessagebaseApi.md#messagebaseMessagebaseformMessagebaseformIdGet) | **GET** /messagebase/messagebaseform/{messagebaseformId} | 템플릿 유형의 상세 내용을 조회합니다.  |
| [**messagebaseMessagebaseformMessagebaseformIdLogoGet**](MessagebaseApi.md#messagebaseMessagebaseformMessagebaseformIdLogoGet) | **GET** /messagebase/messagebaseform/{messagebaseformId}/logo | RBC에서 템플릿용으로 제공되는 기본 로고 이미지 정보를 조회합니다.  |



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
import org.openapitools.client.api.MessagebaseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        MessagebaseApi apiInstance = new MessagebaseApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            MessagebaseCommonGet200Response result = apiInstance.brandBrandIdMessagebaseGet(brandId, xRCSBrandkey, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagebaseApi#brandBrandIdMessagebaseGet");
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
import org.openapitools.client.api.MessagebaseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        MessagebaseApi apiInstance = new MessagebaseApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String messagebaseId = "messagebaseId_example"; // String | 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdMessagebaseMessagebaseIdPut200Response result = apiInstance.brandBrandIdMessagebaseMessagebaseIdCancelPut(brandId, messagebaseId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagebaseApi#brandBrandIdMessagebaseMessagebaseIdCancelPut");
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
import org.openapitools.client.api.MessagebaseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        MessagebaseApi apiInstance = new MessagebaseApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String messagebaseId = "messagebaseId_example"; // String | 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdMessagebaseMessagebaseIdPut200Response result = apiInstance.brandBrandIdMessagebaseMessagebaseIdDelete(brandId, messagebaseId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagebaseApi#brandBrandIdMessagebaseMessagebaseIdDelete");
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
import org.openapitools.client.api.MessagebaseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        MessagebaseApi apiInstance = new MessagebaseApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String messagebaseId = "messagebaseId_example"; // String | 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdMessagebaseMessagebaseIdGet200Response result = apiInstance.brandBrandIdMessagebaseMessagebaseIdGet(brandId, messagebaseId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagebaseApi#brandBrandIdMessagebaseMessagebaseIdGet");
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
import org.openapitools.client.api.MessagebaseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        MessagebaseApi apiInstance = new MessagebaseApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String messagebaseId = "messagebaseId_example"; // String | 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        RegMessagebaseInfo regMessagebaseInfo = new RegMessagebaseInfo(); // RegMessagebaseInfo | 
        try {
            BrandBrandIdMessagebaseMessagebaseIdPut200Response result = apiInstance.brandBrandIdMessagebaseMessagebaseIdPut(brandId, messagebaseId, xRCSBrandkey, regMessagebaseInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagebaseApi#brandBrandIdMessagebaseMessagebaseIdPut");
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
import org.openapitools.client.api.MessagebaseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        MessagebaseApi apiInstance = new MessagebaseApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        BrandBrandIdMessagebasePostRequest brandBrandIdMessagebasePostRequest = new BrandBrandIdMessagebasePostRequest(); // BrandBrandIdMessagebasePostRequest | 
        try {
            BrandBrandIdMessagebasePost200Response result = apiInstance.brandBrandIdMessagebasePost(brandId, xRCSBrandkey, brandBrandIdMessagebasePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagebaseApi#brandBrandIdMessagebasePost");
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
import org.openapitools.client.api.MessagebaseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        MessagebaseApi apiInstance = new MessagebaseApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String fileId = "fileId_example"; // String | 파일ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdV2MessagebaseFilePost200Response result = apiInstance.brandBrandIdV2MessagebaseFileFileIdGet(brandId, fileId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagebaseApi#brandBrandIdV2MessagebaseFileFileIdGet");
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
import org.openapitools.client.api.MessagebaseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        MessagebaseApi apiInstance = new MessagebaseApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        Object _file = null; // Object | 이미지 템플릿에 사용할 이미지 파일입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdV2MessagebaseFilePost200Response result = apiInstance.brandBrandIdV2MessagebaseFilePost(brandId, _file, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagebaseApi#brandBrandIdV2MessagebaseFilePost");
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
import org.openapitools.client.api.MessagebaseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        MessagebaseApi apiInstance = new MessagebaseApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String messagebaseId = "messagebaseId_example"; // String | 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        ModTemplateInfo modTemplateInfo = new ModTemplateInfo(); // ModTemplateInfo | 
        try {
            BrandBrandIdMessagebasePost200Response result = apiInstance.brandBrandIdV2MessagebaseMessagebaseIdPut(brandId, messagebaseId, xRCSBrandkey, modTemplateInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagebaseApi#brandBrandIdV2MessagebaseMessagebaseIdPut");
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
import org.openapitools.client.api.MessagebaseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        MessagebaseApi apiInstance = new MessagebaseApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.            
        RegTemplateInfo regTemplateInfo = new RegTemplateInfo(); // RegTemplateInfo | 
        try {
            BrandBrandIdMessagebasePost200Response result = apiInstance.brandBrandIdV2MessagebasePost(brandId, xRCSBrandkey, regTemplateInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagebaseApi#brandBrandIdV2MessagebasePost");
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
import org.openapitools.client.api.MessagebaseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        MessagebaseApi apiInstance = new MessagebaseApi(defaultClient);
        String productCode = "sms"; // String | 리치카드 메시지 유형 구분값 입니다.
        String cardType = "standalone"; // String | MMS에서 제공되는 메시지 카드 형태 구분값 입니다.
        String bizService = "승인"; // String | 현재 공통템플릿은 유형별 제공되는 항목이 없으므로 본 파라미터는 사용되지 않습니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            MessagebaseCommonGet200Response result = apiInstance.messagebaseCommonGet(productCode, cardType, bizService, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagebaseApi#messagebaseCommonGet");
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
import org.openapitools.client.api.MessagebaseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        MessagebaseApi apiInstance = new MessagebaseApi(defaultClient);
        String messagebaseId = "messagebaseId_example"; // String | 
        try {
            MessagebaseCommonMessagebaseIdGet200Response result = apiInstance.messagebaseCommonMessagebaseIdGet(messagebaseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagebaseApi#messagebaseCommonMessagebaseIdGet");
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
import org.openapitools.client.api.MessagebaseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        MessagebaseApi apiInstance = new MessagebaseApi(defaultClient);
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
            System.err.println("Exception when calling MessagebaseApi#messagebaseMessagebaseformGet");
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
import org.openapitools.client.api.MessagebaseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        MessagebaseApi apiInstance = new MessagebaseApi(defaultClient);
        String messagebaseformId = "messagebaseformId_example"; // String | 
        try {
            MessagebaseMessagebaseformMessagebaseformIdGet200Response result = apiInstance.messagebaseMessagebaseformMessagebaseformIdGet(messagebaseformId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagebaseApi#messagebaseMessagebaseformMessagebaseformIdGet");
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
import org.openapitools.client.api.MessagebaseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        MessagebaseApi apiInstance = new MessagebaseApi(defaultClient);
        String messagebaseformId = "messagebaseformId_example"; // String | 
        try {
            MessagebaseMessagebaseformMessagebaseformIdLogoGet200Response result = apiInstance.messagebaseMessagebaseformMessagebaseformIdLogoGet(messagebaseformId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagebaseApi#messagebaseMessagebaseformMessagebaseformIdLogoGet");
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

