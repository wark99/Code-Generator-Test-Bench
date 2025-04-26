# CodeExecutionApi

All URIs are relative to *http://localhost:5173/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**executeCode**](CodeExecutionApi.md#executeCode) | **POST** /execute-code | Execute a code snippet |



## executeCode

> ExecuteCode200Response executeCode(codeExecution)

Execute a code snippet

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CodeExecutionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CodeExecutionApi apiInstance = new CodeExecutionApi(defaultClient);
        CodeExecution codeExecution = new CodeExecution(); // CodeExecution | 
        try {
            ExecuteCode200Response result = apiInstance.executeCode(codeExecution);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CodeExecutionApi#executeCode");
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
| **codeExecution** | [**CodeExecution**](CodeExecution.md)|  | |

### Return type

[**ExecuteCode200Response**](ExecuteCode200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Code successfully executed |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **429** |  |  -  |

