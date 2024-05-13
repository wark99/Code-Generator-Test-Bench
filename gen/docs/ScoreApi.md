# ScoreApi

All URIs are relative to *https://api-eseg.mindlogix.it*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**calculateScore**](ScoreApi.md#calculateScore) | **POST** /score |  |



## calculateScore

> ScoreResponseModel calculateScore(scoreBodyModel)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScoreApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-eseg.mindlogix.it");

        ScoreApi apiInstance = new ScoreApi(defaultClient);
        ScoreBodyModel scoreBodyModel = new ScoreBodyModel(); // ScoreBodyModel | 
        try {
            ScoreResponseModel result = apiInstance.calculateScore(scoreBodyModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScoreApi#calculateScore");
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
| **scoreBodyModel** | [**ScoreBodyModel**](ScoreBodyModel.md)|  | [optional] |

### Return type

[**ScoreResponseModel**](ScoreResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | all areas available |  -  |

