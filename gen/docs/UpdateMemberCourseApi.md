# UpdateMemberCourseApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**memberCourseUpdate**](UpdateMemberCourseApi.md#memberCourseUpdate) | **POST** /course/update/{memberId} | Endpoint to update a member with course completion |



## memberCourseUpdate

> MemberCourseUpdate200Response memberCourseUpdate(xApiKey, xClientId, memberId, memberCourseUpdateRequest)

Endpoint to update a member with course completion

Endpoint to update a member with course completion

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UpdateMemberCourseApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        UpdateMemberCourseApi apiInstance = new UpdateMemberCourseApi(defaultClient);
        String xApiKey = "xApiKey_example"; // String | API key for authorization
        String xClientId = "xClientId_example"; // String | API client ID
        String memberId = "memberId_example"; // String | Member ID to update
        MemberCourseUpdateRequest memberCourseUpdateRequest = new MemberCourseUpdateRequest(); // MemberCourseUpdateRequest | 
        try {
            MemberCourseUpdate200Response result = apiInstance.memberCourseUpdate(xApiKey, xClientId, memberId, memberCourseUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UpdateMemberCourseApi#memberCourseUpdate");
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
| **xApiKey** | **String**| API key for authorization | |
| **xClientId** | **String**| API client ID | |
| **memberId** | **String**| Member ID to update | |
| **memberCourseUpdateRequest** | [**MemberCourseUpdateRequest**](MemberCourseUpdateRequest.md)|  | |

### Return type

[**MemberCourseUpdate200Response**](MemberCourseUpdate200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request |  -  |

