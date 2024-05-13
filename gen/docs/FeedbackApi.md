# FeedbackApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**importFeedbackProjectsProjectIdFeedbackPost**](FeedbackApi.md#importFeedbackProjectsProjectIdFeedbackPost) | **POST** /projects/{project_id}/feedback | Import Feedback |



## importFeedbackProjectsProjectIdFeedbackPost

> Object importFeedbackProjectsProjectIdFeedbackPost(projectId, feedbackSchema)

Import Feedback

Import feedback for the project.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FeedbackApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: HTTPBearer
        HttpBearerAuth HTTPBearer = (HttpBearerAuth) defaultClient.getAuthentication("HTTPBearer");
        HTTPBearer.setBearerToken("BEARER TOKEN");

        FeedbackApi apiInstance = new FeedbackApi(defaultClient);
        String projectId = "projectId_example"; // String | Id of the project to import feedback.
        List<FeedbackSchema> feedbackSchema = Arrays.asList(); // List<FeedbackSchema> | 
        try {
            Object result = apiInstance.importFeedbackProjectsProjectIdFeedbackPost(projectId, feedbackSchema);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FeedbackApi#importFeedbackProjectsProjectIdFeedbackPost");
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
| **projectId** | **String**| Id of the project to import feedback. | |
| **feedbackSchema** | [**List&lt;FeedbackSchema&gt;**](FeedbackSchema.md)|  | |

### Return type

**Object**

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **401** | Invalid or expired token. |  -  |

