# WsbApi

All URIs are relative to *https://websitebuilder.one.com/api/pub/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ssoDomainNamePost**](WsbApi.md#ssoDomainNamePost) | **POST** /sso/{domainName} | Generate WSB SSO for a domain |



## ssoDomainNamePost

> SsoDomainNamePost200Response ssoDomainNamePost(domainName)

Generate WSB SSO for a domain

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WsbApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://websitebuilder.one.com/api/pub/v1");

        WsbApi apiInstance = new WsbApi(defaultClient);
        String domainName = "domainName_example"; // String | 
        try {
            SsoDomainNamePost200Response result = apiInstance.ssoDomainNamePost(domainName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WsbApi#ssoDomainNamePost");
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
| **domainName** | **String**|  | |

### Return type

[**SsoDomainNamePost200Response**](SsoDomainNamePost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

