# ScoringApiApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAttributes**](ScoringApiApi.md#getAttributes) | **POST** /attributes | Get VS4+ attributes |
| [**getSandboxScore**](ScoringApiApi.md#getSandboxScore) | **POST** /sandbox | Get a Dummy VS4+ Score |
| [**getScore**](ScoringApiApi.md#getScore) | **POST** /score | Get a VS4+ Score |



## getAttributes

> AttributesResponse getAttributes(getScoreRequest, consumerId, requestDate, uploadId)

Get VS4+ attributes

Returns all VS4+ attributes calculated for a consumer based on its accounts, transaction history and credit information, using VS4+&#39;s proprietary model.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScoringApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ScoringApiApi apiInstance = new ScoringApiApi(defaultClient);
        GetScoreRequest getScoreRequest = new GetScoreRequest(); // GetScoreRequest | Consumer file and credit report data.
        String consumerId = "consumerId_example"; // String | The pseudonimized consumer ID.
        LocalDate requestDate = LocalDate.now(); // LocalDate | The date to send the scoring request.
        String uploadId = "uploadId_example"; // String | ID of the upload session. Required when submitting consumer files by uploading them to S3.
        try {
            AttributesResponse result = apiInstance.getAttributes(getScoreRequest, consumerId, requestDate, uploadId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScoringApiApi#getAttributes");
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
| **getScoreRequest** | [**GetScoreRequest**](GetScoreRequest.md)| Consumer file and credit report data. | |
| **consumerId** | **String**| The pseudonimized consumer ID. | [optional] |
| **requestDate** | **LocalDate**| The date to send the scoring request. | [optional] |
| **uploadId** | **String**| ID of the upload session. Required when submitting consumer files by uploading them to S3. | [optional] |

### Return type

[**AttributesResponse**](AttributesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VS4+ attributes are calculated successfully. |  -  |
| **206** | Consumer profile is valid but does not qualify VS4+ attributes calculation. |  -  |
| **400** | Invalid request. |  -  |
| **415** | Invalid content type. |  -  |


## getSandboxScore

> ScoreResponse getSandboxScore(getScoreRequest, consumerId, requestDate, uploadId)

Get a Dummy VS4+ Score

Calculates a dummy credit score. Used in development for input validation.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScoringApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ScoringApiApi apiInstance = new ScoringApiApi(defaultClient);
        GetScoreRequest getScoreRequest = new GetScoreRequest(); // GetScoreRequest | Consumer file and credit report data.
        String consumerId = "consumerId_example"; // String | The pseudonimized consumer ID.
        LocalDate requestDate = LocalDate.now(); // LocalDate | The date to send the scoring request.
        String uploadId = "uploadId_example"; // String | ID of the upload session. Required when submitting consumer files by uploading them to S3.
        try {
            ScoreResponse result = apiInstance.getSandboxScore(getScoreRequest, consumerId, requestDate, uploadId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScoringApiApi#getSandboxScore");
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
| **getScoreRequest** | [**GetScoreRequest**](GetScoreRequest.md)| Consumer file and credit report data. | |
| **consumerId** | **String**| The pseudonimized consumer ID. | [optional] |
| **requestDate** | **LocalDate**| The date to send the scoring request. | [optional] |
| **uploadId** | **String**| ID of the upload session. Required when submitting consumer files by uploading them to S3. | [optional] |

### Return type

[**ScoreResponse**](ScoreResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VS4+ score is calculated successfully. |  -  |
| **206** | Consumer profile is valid but not qualified for VS4+ score calculation. |  -  |
| **400** | Invalid request. |  -  |
| **415** | Invalid content type. |  -  |


## getScore

> ScoreResponse getScore(getScoreRequest, consumerId, requestDate, uploadId)

Get a VS4+ Score

Calculates a weighted credit score for a consumer based on its accounts, transaction history and credit information, using VS4+&#39;s proprietary model.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScoringApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ScoringApiApi apiInstance = new ScoringApiApi(defaultClient);
        GetScoreRequest getScoreRequest = new GetScoreRequest(); // GetScoreRequest | Consumer file and credit report data.
        String consumerId = "consumerId_example"; // String | The pseudonimized consumer ID.
        LocalDate requestDate = LocalDate.now(); // LocalDate | The date to send the scoring request.
        String uploadId = "uploadId_example"; // String | ID of the upload session. Required when submitting consumer files by uploading them to S3.
        try {
            ScoreResponse result = apiInstance.getScore(getScoreRequest, consumerId, requestDate, uploadId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScoringApiApi#getScore");
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
| **getScoreRequest** | [**GetScoreRequest**](GetScoreRequest.md)| Consumer file and credit report data. | |
| **consumerId** | **String**| The pseudonimized consumer ID. | [optional] |
| **requestDate** | **LocalDate**| The date to send the scoring request. | [optional] |
| **uploadId** | **String**| ID of the upload session. Required when submitting consumer files by uploading them to S3. | [optional] |

### Return type

[**ScoreResponse**](ScoreResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | VS4+ score is calculated successfully. |  -  |
| **206** | Consumer profile is valid but not qualified for VS4+ score calculation. |  -  |
| **400** | Invalid request. |  -  |
| **415** | Invalid content type. |  -  |

