# LayoutApi

All URIs are relative to *https://api-qa.rcsbizcenter.com/api/1.1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**baselayoutComponentGet**](LayoutApi.md#baselayoutComponentGet) | **GET** /baselayout/component | 레이아웃 등록/수정 시 사용 가능한 컴포넌트 목록을 조회 합니다.  |
| [**baselayoutProductRuleGet**](LayoutApi.md#baselayoutProductRuleGet) | **GET** /baselayout/product/rule | 메시지 상품별 레이아웃 구성 규칙을 조회합니다.  |
| [**baselayoutSampleGet**](LayoutApi.md#baselayoutSampleGet) | **GET** /baselayout/sample | 레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 목록 입니다.  |
| [**baselayoutSampleSampleLayoutIdGet**](LayoutApi.md#baselayoutSampleSampleLayoutIdGet) | **GET** /baselayout/sample/{sampleLayoutId} | 레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 상세 정보를 조회합니다.  |
| [**brandBrandIdLayoutGet**](LayoutApi.md#brandBrandIdLayoutGet) | **GET** /brand/{brandId}/layout | 브랜드 별 등록된 레이아웃 목록을 조회합니다.  |
| [**brandBrandIdLayoutLayoutIdDelete**](LayoutApi.md#brandBrandIdLayoutLayoutIdDelete) | **DELETE** /brand/{brandId}/layout/{layoutId} | 브랜드 별 등록된 레이아웃을 삭제합니다.  |
| [**brandBrandIdLayoutLayoutIdGet**](LayoutApi.md#brandBrandIdLayoutLayoutIdGet) | **GET** /brand/{brandId}/layout/{layoutId} | 브랜드 별 등록된 레이아웃 목록을 조회합니다.  |
| [**brandBrandIdLayoutLayoutIdPut**](LayoutApi.md#brandBrandIdLayoutLayoutIdPut) | **PUT** /brand/{brandId}/layout/{layoutId} | 브랜드 내 레이아웃을 수정 합니다.    |
| [**brandBrandIdLayoutPost**](LayoutApi.md#brandBrandIdLayoutPost) | **POST** /brand/{brandId}/layout | 브랜드 내에서 사용할 수 있는 레이아웃을 등록 합니다.    |



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
import org.openapitools.client.api.LayoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        LayoutApi apiInstance = new LayoutApi(defaultClient);
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BaselayoutComponentGet200Response result = apiInstance.baselayoutComponentGet(offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LayoutApi#baselayoutComponentGet");
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
import org.openapitools.client.api.LayoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        LayoutApi apiInstance = new LayoutApi(defaultClient);
        try {
            BaselayoutProductRuleGet200Response result = apiInstance.baselayoutProductRuleGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LayoutApi#baselayoutProductRuleGet");
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
import org.openapitools.client.api.LayoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        LayoutApi apiInstance = new LayoutApi(defaultClient);
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BaselayoutSampleGet200Response result = apiInstance.baselayoutSampleGet(offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LayoutApi#baselayoutSampleGet");
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
import org.openapitools.client.api.LayoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        LayoutApi apiInstance = new LayoutApi(defaultClient);
        String sampleLayoutId = "sampleLayoutId_example"; // String | 샘플레이아웃 ID 입니다.
        try {
            BaselayoutSampleSampleLayoutIdGet200Response result = apiInstance.baselayoutSampleSampleLayoutIdGet(sampleLayoutId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LayoutApi#baselayoutSampleSampleLayoutIdGet");
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
import org.openapitools.client.api.LayoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        LayoutApi apiInstance = new LayoutApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        Integer offset = 56; // Integer | 시작 offset 번호(default: 0) 입니다.
        Integer limit = 56; // Integer | 조회 최대 건수(default: 100, maximum: 1000) 입니다.
        try {
            BrandBrandIdLayoutGet200Response result = apiInstance.brandBrandIdLayoutGet(brandId, xRCSBrandkey, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LayoutApi#brandBrandIdLayoutGet");
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
import org.openapitools.client.api.LayoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        LayoutApi apiInstance = new LayoutApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String layoutId = "layoutId_example"; // String | 레이아웃ID 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdLayoutLayoutIdDelete200Response result = apiInstance.brandBrandIdLayoutLayoutIdDelete(brandId, layoutId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LayoutApi#brandBrandIdLayoutLayoutIdDelete");
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
import org.openapitools.client.api.LayoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        LayoutApi apiInstance = new LayoutApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String layoutId = "layoutId_example"; // String | 레이아웃ID 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdLayoutLayoutIdGet200Response result = apiInstance.brandBrandIdLayoutLayoutIdGet(brandId, layoutId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LayoutApi#brandBrandIdLayoutLayoutIdGet");
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
import org.openapitools.client.api.LayoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        LayoutApi apiInstance = new LayoutApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String layoutId = "layoutId_example"; // String | 레이아웃ID 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        RegBrandLayout regBrandLayout = new RegBrandLayout(); // RegBrandLayout | 
        try {
            BrandBrandIdLayoutLayoutIdPut200Response result = apiInstance.brandBrandIdLayoutLayoutIdPut(brandId, layoutId, xRCSBrandkey, regBrandLayout);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LayoutApi#brandBrandIdLayoutLayoutIdPut");
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
import org.openapitools.client.api.LayoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        LayoutApi apiInstance = new LayoutApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        RegBrandLayout regBrandLayout = new RegBrandLayout(); // RegBrandLayout | 
        try {
            BrandBrandIdLayoutPost200Response result = apiInstance.brandBrandIdLayoutPost(brandId, xRCSBrandkey, regBrandLayout);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LayoutApi#brandBrandIdLayoutPost");
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

