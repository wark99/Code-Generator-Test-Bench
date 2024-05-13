# FeedbackApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodFeedbackSendFeedbackForFeaturePost**](FeedbackApi.md#indexPhpmethodFeedbackSendFeedbackForFeaturePost) | **POST** /index.php?method&#x3D;Feedback.sendFeedbackForFeature |  |
| [**indexPhpmethodFeedbackSendFeedbackForSurveyPost**](FeedbackApi.md#indexPhpmethodFeedbackSendFeedbackForSurveyPost) | **POST** /index.php?method&#x3D;Feedback.sendFeedbackForSurvey |  |
| [**indexPhpmethodFeedbackUpdateFeedbackReminderDatePost**](FeedbackApi.md#indexPhpmethodFeedbackUpdateFeedbackReminderDatePost) | **POST** /index.php?method&#x3D;Feedback.updateFeedbackReminderDate |  |



## indexPhpmethodFeedbackSendFeedbackForFeaturePost

> indexPhpmethodFeedbackSendFeedbackForFeaturePost(indexPhpMethodFeedbackSendFeedbackForFeaturePostRequest)



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
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FeedbackApi apiInstance = new FeedbackApi(defaultClient);
        IndexPhpMethodFeedbackSendFeedbackForFeaturePostRequest indexPhpMethodFeedbackSendFeedbackForFeaturePostRequest = new IndexPhpMethodFeedbackSendFeedbackForFeaturePostRequest(); // IndexPhpMethodFeedbackSendFeedbackForFeaturePostRequest | 
        try {
            apiInstance.indexPhpmethodFeedbackSendFeedbackForFeaturePost(indexPhpMethodFeedbackSendFeedbackForFeaturePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FeedbackApi#indexPhpmethodFeedbackSendFeedbackForFeaturePost");
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
| **indexPhpMethodFeedbackSendFeedbackForFeaturePostRequest** | [**IndexPhpMethodFeedbackSendFeedbackForFeaturePostRequest**](IndexPhpMethodFeedbackSendFeedbackForFeaturePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFeedbackSendFeedbackForSurveyPost

> indexPhpmethodFeedbackSendFeedbackForSurveyPost(indexPhpMethodFeedbackSendFeedbackForSurveyPostRequest)



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
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FeedbackApi apiInstance = new FeedbackApi(defaultClient);
        IndexPhpMethodFeedbackSendFeedbackForSurveyPostRequest indexPhpMethodFeedbackSendFeedbackForSurveyPostRequest = new IndexPhpMethodFeedbackSendFeedbackForSurveyPostRequest(); // IndexPhpMethodFeedbackSendFeedbackForSurveyPostRequest | 
        try {
            apiInstance.indexPhpmethodFeedbackSendFeedbackForSurveyPost(indexPhpMethodFeedbackSendFeedbackForSurveyPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FeedbackApi#indexPhpmethodFeedbackSendFeedbackForSurveyPost");
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
| **indexPhpMethodFeedbackSendFeedbackForSurveyPostRequest** | [**IndexPhpMethodFeedbackSendFeedbackForSurveyPostRequest**](IndexPhpMethodFeedbackSendFeedbackForSurveyPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFeedbackUpdateFeedbackReminderDatePost

> indexPhpmethodFeedbackUpdateFeedbackReminderDatePost(indexPhpMethodAPIGetMatomoVersionPostRequest)



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
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FeedbackApi apiInstance = new FeedbackApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodFeedbackUpdateFeedbackReminderDatePost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FeedbackApi#indexPhpmethodFeedbackUpdateFeedbackReminderDatePost");
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
| **indexPhpMethodAPIGetMatomoVersionPostRequest** | [**IndexPhpMethodAPIGetMatomoVersionPostRequest**](IndexPhpMethodAPIGetMatomoVersionPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


