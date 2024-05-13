# StatApi

All URIs are relative to *https://api-qa.rcsbizcenter.com/api/1.1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**statQueryBrandprofileBrandIdGet**](StatApi.md#statQueryBrandprofileBrandIdGet) | **GET** /statQuery/brandprofile/{brandId} | (준비중) 브랜드프로필 노출 통계를 조회합니다.  |
| [**statQueryMessageBrandIdGet**](StatApi.md#statQueryMessageBrandIdGet) | **GET** /statQuery/message/{brandId} | 고객반응 통계 - 캠페인 메시지 발송/읽음확인 통계를 조회합니다.  |
| [**statQueryMessageButtonBrandIdGet**](StatApi.md#statQueryMessageButtonBrandIdGet) | **GET** /statQuery/messageButton/{brandId} | 고객반응 통계 - 캠페인 메시지 버튼 클릭 통계를 조회합니다.  |
| [**statQueryPersistentMenuBrandIdGet**](StatApi.md#statQueryPersistentMenuBrandIdGet) | **GET** /statQuery/persistentMenu/{brandId} | 고객반응 통계 - 대화방 메뉴 클릭 통계를 조회합니다.  |



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
import org.openapitools.client.api.StatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        StatApi apiInstance = new StatApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String startDate = "startDate_example"; // String | 통계 조회 기간 시작일자(yyyymmdd) 입니다.
        String endDate = "endDate_example"; // String | 통계 조회 기간 종료일자(yyyymmdd) 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            StatQueryBrandprofileBrandIdGet200Response result = apiInstance.statQueryBrandprofileBrandIdGet(brandId, startDate, endDate, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatApi#statQueryBrandprofileBrandIdGet");
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
import org.openapitools.client.api.StatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        StatApi apiInstance = new StatApi(defaultClient);
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
            System.err.println("Exception when calling StatApi#statQueryMessageBrandIdGet");
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
import org.openapitools.client.api.StatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        StatApi apiInstance = new StatApi(defaultClient);
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
            System.err.println("Exception when calling StatApi#statQueryMessageButtonBrandIdGet");
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
import org.openapitools.client.api.StatApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        StatApi apiInstance = new StatApi(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String startDate = "startDate_example"; // String | 통계 조회 기간 시작일자(yyyymmdd) 입니다.
        String endDate = "endDate_example"; // String | 통계 조회 기간 종료일자(yyyymmdd) 입니다.
        String chatbotId = "chatbotId_example"; // String | 대화방ID 입니다.
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            StatQueryPersistentMenuBrandIdGet200Response result = apiInstance.statQueryPersistentMenuBrandIdGet(brandId, startDate, endDate, chatbotId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatApi#statQueryPersistentMenuBrandIdGet");
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

