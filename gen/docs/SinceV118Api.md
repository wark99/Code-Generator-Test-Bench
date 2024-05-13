# SinceV118Api

All URIs are relative to *https://api-qa.rcsbizcenter.com/api/1.1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**brandBrandIdV2MessagebaseFileFileIdGet**](SinceV118Api.md#brandBrandIdV2MessagebaseFileFileIdGet) | **GET** /brand/{brandId}/v2/messagebase/file/{fileId} | 이미지 템플릿 용으로 등록한 이미지 파일 정보를 조회 합니다.  |
| [**brandBrandIdV2MessagebaseFilePost**](SinceV118Api.md#brandBrandIdV2MessagebaseFilePost) | **POST** /brand/{brandId}/v2/messagebase/file | 이미지 템플릿에서 사용할 이미지 파일을 등록합니다.  |
| [**brandBrandIdV2MessagebaseMessagebaseIdPut**](SinceV118Api.md#brandBrandIdV2MessagebaseMessagebaseIdPut) | **PUT** /brand/{brandId}/v2/messagebase/{messagebaseId} | 이미 등록된 템플릿의 내용을 수정합니다.  |
| [**brandBrandIdV2MessagebasePost**](SinceV118Api.md#brandBrandIdV2MessagebasePost) | **POST** /brand/{brandId}/v2/messagebase | 브랜드 내에서 사용할 템플릿을 등록합니다.   Openrichcard 규격의 모든 템플릿 등록이 가능합니다.  |
| [**usableQueryChatbotIdChatbotIdGet**](SinceV118Api.md#usableQueryChatbotIdChatbotIdGet) | **GET** /usableQuery/chatbotId/{chatbotId} | 대화방ID 등록 가능 여부를 조회 합니다.  |



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
import org.openapitools.client.api.SinceV118Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV118Api apiInstance = new SinceV118Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String fileId = "fileId_example"; // String | 파일ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdV2MessagebaseFilePost200Response result = apiInstance.brandBrandIdV2MessagebaseFileFileIdGet(brandId, fileId, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV118Api#brandBrandIdV2MessagebaseFileFileIdGet");
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
import org.openapitools.client.api.SinceV118Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV118Api apiInstance = new SinceV118Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        Object _file = null; // Object | 이미지 템플릿에 사용할 이미지 파일입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        try {
            BrandBrandIdV2MessagebaseFilePost200Response result = apiInstance.brandBrandIdV2MessagebaseFilePost(brandId, _file, xRCSBrandkey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV118Api#brandBrandIdV2MessagebaseFilePost");
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
import org.openapitools.client.api.SinceV118Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV118Api apiInstance = new SinceV118Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String messagebaseId = "messagebaseId_example"; // String | 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다. 
        ModTemplateInfo modTemplateInfo = new ModTemplateInfo(); // ModTemplateInfo | 
        try {
            BrandBrandIdMessagebasePost200Response result = apiInstance.brandBrandIdV2MessagebaseMessagebaseIdPut(brandId, messagebaseId, xRCSBrandkey, modTemplateInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV118Api#brandBrandIdV2MessagebaseMessagebaseIdPut");
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
import org.openapitools.client.api.SinceV118Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV118Api apiInstance = new SinceV118Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String xRCSBrandkey = "xRCSBrandkey_example"; // String | RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.<br>    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.<br>     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.            
        RegTemplateInfo regTemplateInfo = new RegTemplateInfo(); // RegTemplateInfo | 
        try {
            BrandBrandIdMessagebasePost200Response result = apiInstance.brandBrandIdV2MessagebasePost(brandId, xRCSBrandkey, regTemplateInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV118Api#brandBrandIdV2MessagebasePost");
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
import org.openapitools.client.api.SinceV118Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV118Api apiInstance = new SinceV118Api(defaultClient);
        String chatbotId = "chatbotId_example"; // String | 확인하고자 하는 대화방ID 입니다.
        try {
            UsableQueryChatbotIdChatbotIdGet200Response result = apiInstance.usableQueryChatbotIdChatbotIdGet(chatbotId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV118Api#usableQueryChatbotIdChatbotIdGet");
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

