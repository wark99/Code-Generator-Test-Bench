# SinceV1110Api

All URIs are relative to *https://api-qa.rcsbizcenter.com/api/1.1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**agencyAgencyIdBrandBrandIdPut**](SinceV1110Api.md#agencyAgencyIdBrandBrandIdPut) | **PUT** /agency/{agencyId}/brand/{brandId} | 대행사가 운영 중인 브랜드 정보를 수정 합니다. 브랜드명, 프로필 이미지가 수정되면 다시 승인을 받아야 합니다.  |
| [**baselayoutComponentGet**](SinceV1110Api.md#baselayoutComponentGet) | **GET** /baselayout/component | 레이아웃 등록/수정 시 사용 가능한 컴포넌트 목록을 조회 합니다.  |
| [**baselayoutProductRuleGet**](SinceV1110Api.md#baselayoutProductRuleGet) | **GET** /baselayout/product/rule | 메시지 상품별 레이아웃 구성 규칙을 조회합니다.  |
| [**baselayoutSampleGet**](SinceV1110Api.md#baselayoutSampleGet) | **GET** /baselayout/sample | 레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 목록 입니다.  |
| [**baselayoutSampleSampleLayoutIdGet**](SinceV1110Api.md#baselayoutSampleSampleLayoutIdGet) | **GET** /baselayout/sample/{sampleLayoutId} | 레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 상세 정보를 조회합니다.  |
| [**brandBrandIdLayoutGet**](SinceV1110Api.md#brandBrandIdLayoutGet) | **GET** /brand/{brandId}/layout | 브랜드 별 등록된 레이아웃 목록을 조회합니다.  |
| [**brandBrandIdLayoutLayoutIdDelete**](SinceV1110Api.md#brandBrandIdLayoutLayoutIdDelete) | **DELETE** /brand/{brandId}/layout/{layoutId} | 브랜드 별 등록된 레이아웃을 삭제합니다.  |
| [**brandBrandIdLayoutLayoutIdGet**](SinceV1110Api.md#brandBrandIdLayoutLayoutIdGet) | **GET** /brand/{brandId}/layout/{layoutId} | 브랜드 별 등록된 레이아웃 목록을 조회합니다.  |
| [**brandBrandIdLayoutLayoutIdPut**](SinceV1110Api.md#brandBrandIdLayoutLayoutIdPut) | **PUT** /brand/{brandId}/layout/{layoutId} | 브랜드 내 레이아웃을 수정 합니다.    |
| [**brandBrandIdLayoutPost**](SinceV1110Api.md#brandBrandIdLayoutPost) | **POST** /brand/{brandId}/layout | 브랜드 내에서 사용할 수 있는 레이아웃을 등록 합니다.    |
| [**corpBrandBrandIdCancelPut**](SinceV1110Api.md#corpBrandBrandIdCancelPut) | **PUT** /corp/brand/{brandId}/cancel | 신규 개설한 승인대기 중인 브랜드의 승인요청을 취소합니다.    |
| [**corpPersonIdBrandBrandIdCancelPut**](SinceV1110Api.md#corpPersonIdBrandBrandIdCancelPut) | **PUT** /corp/{personId}/brand/{brandId}/cancel | 승인대기 중인 브랜드의 승인요청을 취소합니다.    |
| [**messagebaseMessagebaseformMessagebaseformIdLogoGet**](SinceV1110Api.md#messagebaseMessagebaseformMessagebaseformIdLogoGet) | **GET** /messagebase/messagebaseform/{messagebaseformId}/logo | RBC에서 템플릿용으로 제공되는 기본 로고 이미지 정보를 조회합니다.  |
| [**statQueryBrandprofileBrandIdGet**](SinceV1110Api.md#statQueryBrandprofileBrandIdGet) | **GET** /statQuery/brandprofile/{brandId} | (준비중) 브랜드프로필 노출 통계를 조회합니다.  |



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
import org.openapitools.client.api.SinceV1110Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV1110Api apiInstance = new SinceV1110Api(defaultClient);
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
            System.err.println("Exception when calling SinceV1110Api#agencyAgencyIdBrandBrandIdPut");
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
import org.openapitools.client.api.SinceV1110Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV1110Api apiInstance = new SinceV1110Api(defaultClient);
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BaselayoutComponentGet200Response result = apiInstance.baselayoutComponentGet(offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV1110Api#baselayoutComponentGet");
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
import org.openapitools.client.api.SinceV1110Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV1110Api apiInstance = new SinceV1110Api(defaultClient);
        try {
            BaselayoutProductRuleGet200Response result = apiInstance.baselayoutProductRuleGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV1110Api#baselayoutProductRuleGet");
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
import org.openapitools.client.api.SinceV1110Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV1110Api apiInstance = new SinceV1110Api(defaultClient);
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BaselayoutSampleGet200Response result = apiInstance.baselayoutSampleGet(offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV1110Api#baselayoutSampleGet");
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
import org.openapitools.client.api.SinceV1110Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV1110Api apiInstance = new SinceV1110Api(defaultClient);
        String sampleLayoutId = "sampleLayoutId_example"; // String | 샘플레이아웃 ID 입니다.
        try {
            BaselayoutSampleSampleLayoutIdGet200Response result = apiInstance.baselayoutSampleSampleLayoutIdGet(sampleLayoutId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV1110Api#baselayoutSampleSampleLayoutIdGet");
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
import org.openapitools.client.api.SinceV1110Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV1110Api apiInstance = new SinceV1110Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BrandBrandIdLayoutGet200Response result = apiInstance.brandBrandIdLayoutGet(brandId, xRCSBrandkey, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV1110Api#brandBrandIdLayoutGet");
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
import org.openapitools.client.api.SinceV1110Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV1110Api apiInstance = new SinceV1110Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String layoutId = "layoutId_example"; // String | 레이아웃ID 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdLayoutLayoutIdDelete200Response result = apiInstance.brandBrandIdLayoutLayoutIdDelete(brandId, layoutId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV1110Api#brandBrandIdLayoutLayoutIdDelete");
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
import org.openapitools.client.api.SinceV1110Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV1110Api apiInstance = new SinceV1110Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String layoutId = "layoutId_example"; // String | 레이아웃ID 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdLayoutLayoutIdGet200Response result = apiInstance.brandBrandIdLayoutLayoutIdGet(brandId, layoutId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV1110Api#brandBrandIdLayoutLayoutIdGet");
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
import org.openapitools.client.api.SinceV1110Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV1110Api apiInstance = new SinceV1110Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String layoutId = "layoutId_example"; // String | 레이아웃ID 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        RegBrandLayout regBrandLayout = new RegBrandLayout(); // RegBrandLayout | 
        try {
            BrandBrandIdLayoutLayoutIdPut200Response result = apiInstance.brandBrandIdLayoutLayoutIdPut(brandId, layoutId, xRCSBrandkey, regBrandLayout);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV1110Api#brandBrandIdLayoutLayoutIdPut");
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
import org.openapitools.client.api.SinceV1110Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV1110Api apiInstance = new SinceV1110Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        RegBrandLayout regBrandLayout = new RegBrandLayout(); // RegBrandLayout | 
        try {
            BrandBrandIdLayoutPost200Response result = apiInstance.brandBrandIdLayoutPost(brandId, xRCSBrandkey, regBrandLayout);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV1110Api#brandBrandIdLayoutPost");
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
import org.openapitools.client.api.SinceV1110Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV1110Api apiInstance = new SinceV1110Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        try {
            CorpPersonIdBrandBrandIdCancelPut200Response result = apiInstance.corpBrandBrandIdCancelPut(brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV1110Api#corpBrandBrandIdCancelPut");
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
import org.openapitools.client.api.SinceV1110Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV1110Api apiInstance = new SinceV1110Api(defaultClient);
        String personId = "personId_example"; // String | 브랜드 대표운영자 또는 운영자의 ID 입니다.
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        try {
            CorpPersonIdBrandBrandIdCancelPut200Response result = apiInstance.corpPersonIdBrandBrandIdCancelPut(personId, brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV1110Api#corpPersonIdBrandBrandIdCancelPut");
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
import org.openapitools.client.api.SinceV1110Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV1110Api apiInstance = new SinceV1110Api(defaultClient);
        String messagebaseformId = "messagebaseformId_example"; // String | 
        try {
            MessagebaseMessagebaseformMessagebaseformIdLogoGet200Response result = apiInstance.messagebaseMessagebaseformMessagebaseformIdLogoGet(messagebaseformId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV1110Api#messagebaseMessagebaseformMessagebaseformIdLogoGet");
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
import org.openapitools.client.api.SinceV1110Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV1110Api apiInstance = new SinceV1110Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String startDate = "startDate_example"; // String | 통계 조회 기간 시작일자(yyyymmdd) 입니다.
        String endDate = "endDate_example"; // String | 통계 조회 기간 종료일자(yyyymmdd) 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            StatQueryBrandprofileBrandIdGet200Response result = apiInstance.statQueryBrandprofileBrandIdGet(brandId, startDate, endDate, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV1110Api#statQueryBrandprofileBrandIdGet");
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

