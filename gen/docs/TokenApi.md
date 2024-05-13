# TokenApi

All URIs are relative to *https://api-qa.rcsbizcenter.com/api/1.1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tokenPost**](TokenApi.md#tokenPost) | **POST** /token | Access 토큰을 발급 요청합니다.  |



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
import org.openapitools.client.api.TokenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        TokenApi apiInstance = new TokenApi(defaultClient);
        TokenPostRequest tokenPostRequest = new TokenPostRequest(); // TokenPostRequest | required: true 
        try {
            TokenInfo result = apiInstance.tokenPost(tokenPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenApi#tokenPost");
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

