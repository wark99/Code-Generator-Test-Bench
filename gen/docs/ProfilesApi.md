# ProfilesApi

All URIs are relative to *https://adapter.sandbox.local*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**describeProfileFields**](ProfilesApi.md#describeProfileFields) | **GET** /v1/profiles/describe |  |



## describeProfileFields

> DescribeProfileFields200Response describeProfileFields(profileId)



Describe Record fields in a Profile

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://adapter.sandbox.local");
        
        // Configure HTTP bearer authorization: internal-JWT
        HttpBearerAuth internal-JWT = (HttpBearerAuth) defaultClient.getAuthentication("internal-JWT");
        internal-JWT.setBearerToken("BEARER TOKEN");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        ParamProfileId profileId = new ParamProfileId(); // ParamProfileId | 
        try {
            DescribeProfileFields200Response result = apiInstance.describeProfileFields(profileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#describeProfileFields");
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
| **profileId** | [**ParamProfileId**](.md)|  | |

### Return type

[**DescribeProfileFields200Response**](DescribeProfileFields200Response.md)

### Authorization

[internal-JWT](../README.md#internal-JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **406** | Not Acceptable (Validation errors) |  -  |

