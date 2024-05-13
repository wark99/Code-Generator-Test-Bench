# CrewApi

All URIs are relative to *https://ptu.uexcorp.space/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCrewBySpecialization**](CrewApi.md#getCrewBySpecialization) | **GET** /crew/specialization/{specialization}/ | Search for users listed in the Crew Directory |



## getCrewBySpecialization

> GetCrewOkResponse getCrewBySpecialization(specialization)

Search for users listed in the Crew Directory

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CrewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        CrewApi apiInstance = new CrewApi(defaultClient);
        String specialization = "specialization_example"; // String | 
        try {
            GetCrewOkResponse result = apiInstance.getCrewBySpecialization(specialization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CrewApi#getCrewBySpecialization");
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
| **specialization** | **String**|  | |

### Return type

[**GetCrewOkResponse**](GetCrewOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

