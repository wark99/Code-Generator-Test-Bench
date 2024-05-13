# SinceV117Api

All URIs are relative to *https://api-qa.rcsbizcenter.com/api/1.1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**agencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet**](SinceV117Api.md#agencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet) | **GET** /agency/{agencyId}/corp/{corpRegNum}/chatbot/{chatbotId} | 발신번호가 RBC에 대상 사업자의 발신번호로 등록되어 있는지 확인할 수 있습니다.  |
| [**agencyAgencyIdCorpCorpRegNumGet**](SinceV117Api.md#agencyAgencyIdCorpCorpRegNumGet) | **GET** /agency/{agencyId}/corp/{corpRegNum} | 사업자등록번호로 RBC 가입 여부와 브랜드 대행사 지정 상태를 확인할 수 있습니다.  |



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
import org.openapitools.client.api.SinceV117Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV117Api apiInstance = new SinceV117Api(defaultClient);
        String agencyId = "agencyId_example"; // String | RCS Biz Center에 등록된 대행사 ID 입니다.
        String corpRegNum = "corpRegNum_example"; // String | 조회 대상 사업자등록번호(10자리) 입니다.
        String chatbotId = "chatbotId_example"; // String | 확인하고자 하는 발신번호 입니다.
        try {
            AgencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet200Response result = apiInstance.agencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet(agencyId, corpRegNum, chatbotId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV117Api#agencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet");
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
import org.openapitools.client.api.SinceV117Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV117Api apiInstance = new SinceV117Api(defaultClient);
        String agencyId = "agencyId_example"; // String | RCS Biz Center에 등록된 대행사 ID 입니다.
        String corpRegNum = "corpRegNum_example"; // String | 조회 대상 사업자등록번호(10자리) 입니다.
        try {
            AgencyAgencyIdCorpCorpRegNumGet200Response result = apiInstance.agencyAgencyIdCorpCorpRegNumGet(agencyId, corpRegNum);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV117Api#agencyAgencyIdCorpCorpRegNumGet");
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

