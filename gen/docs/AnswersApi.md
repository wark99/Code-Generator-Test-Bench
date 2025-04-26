# AnswersApi

All URIs are relative to *http://localhost:5173/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAnswer**](AnswersApi.md#createAnswer) | **POST** /questions/{questionId}/answers | Create a new answer |
| [**deleteAnswer**](AnswersApi.md#deleteAnswer) | **DELETE** /answers/{answerId} | Delete an answer |
| [**downvoteAnswer**](AnswersApi.md#downvoteAnswer) | **POST** /answers/{answerId}/downvote | Downvote an answer |
| [**getQuestionAnswers**](AnswersApi.md#getQuestionAnswers) | **GET** /questions/{questionId}/answers | Get answers for a question |
| [**updateAnswer**](AnswersApi.md#updateAnswer) | **PUT** /answers/{answerId} | Update an answer |
| [**upvoteAnswer**](AnswersApi.md#upvoteAnswer) | **POST** /answers/{answerId}/upvote | Upvote an answer |



## createAnswer

> CreateAnswer201Response createAnswer(questionId, newAnswer)

Create a new answer

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnswersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AnswersApi apiInstance = new AnswersApi(defaultClient);
        Integer questionId = 56; // Integer | 
        NewAnswer newAnswer = new NewAnswer(); // NewAnswer | 
        try {
            CreateAnswer201Response result = apiInstance.createAnswer(questionId, newAnswer);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnswersApi#createAnswer");
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
| **questionId** | **Integer**|  | |
| **newAnswer** | [**NewAnswer**](NewAnswer.md)|  | |

### Return type

[**CreateAnswer201Response**](CreateAnswer201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Answer successfully created |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## deleteAnswer

> deleteAnswer(answerId)

Delete an answer

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnswersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AnswersApi apiInstance = new AnswersApi(defaultClient);
        Integer answerId = 56; // Integer | 
        try {
            apiInstance.deleteAnswer(answerId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnswersApi#deleteAnswer");
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
| **answerId** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Answer successfully deleted |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## downvoteAnswer

> downvoteAnswer(answerId)

Downvote an answer

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnswersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AnswersApi apiInstance = new AnswersApi(defaultClient);
        Integer answerId = 56; // Integer | 
        try {
            apiInstance.downvoteAnswer(answerId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnswersApi#downvoteAnswer");
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
| **answerId** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Answer successfully upvoted |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## getQuestionAnswers

> GetQuestionAnswers200Response getQuestionAnswers(questionId)

Get answers for a question

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnswersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5173/api/v1");

        AnswersApi apiInstance = new AnswersApi(defaultClient);
        Integer questionId = 56; // Integer | 
        try {
            GetQuestionAnswers200Response result = apiInstance.getQuestionAnswers(questionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnswersApi#getQuestionAnswers");
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
| **questionId** | **Integer**|  | |

### Return type

[**GetQuestionAnswers200Response**](GetQuestionAnswers200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** |  |  -  |


## updateAnswer

> CreateAnswer201Response updateAnswer(answerId, updateAnswer)

Update an answer

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnswersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AnswersApi apiInstance = new AnswersApi(defaultClient);
        Integer answerId = 56; // Integer | 
        UpdateAnswer updateAnswer = new UpdateAnswer(); // UpdateAnswer | 
        try {
            CreateAnswer201Response result = apiInstance.updateAnswer(answerId, updateAnswer);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnswersApi#updateAnswer");
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
| **answerId** | **Integer**|  | |
| **updateAnswer** | [**UpdateAnswer**](UpdateAnswer.md)|  | |

### Return type

[**CreateAnswer201Response**](CreateAnswer201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Answer successfully updated |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## upvoteAnswer

> upvoteAnswer(answerId)

Upvote an answer

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnswersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AnswersApi apiInstance = new AnswersApi(defaultClient);
        Integer answerId = 56; // Integer | 
        try {
            apiInstance.upvoteAnswer(answerId);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnswersApi#upvoteAnswer");
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
| **answerId** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Answer successfully upvoted |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |

