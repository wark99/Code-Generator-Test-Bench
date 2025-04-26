# QuestionsApi

All URIs are relative to *http://localhost:5173/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bookmarkQuestion**](QuestionsApi.md#bookmarkQuestion) | **POST** /questions/{questionId}/bookmarks | Bookmark a question |
| [**createQuestion**](QuestionsApi.md#createQuestion) | **POST** /questions | Create a new question |
| [**deleteQuestion**](QuestionsApi.md#deleteQuestion) | **DELETE** /questions/{questionId} | Delete a question |
| [**downvoteQuestion**](QuestionsApi.md#downvoteQuestion) | **POST** /questions/{questionId}/downvote | Downvote a question |
| [**getBookmarkedQuestions**](QuestionsApi.md#getBookmarkedQuestions) | **GET** /questions/bookmarked | Get bookmarked questions |
| [**getQuestionDetails**](QuestionsApi.md#getQuestionDetails) | **GET** /questions/{questionId} | Get question details |
| [**rateQuestion**](QuestionsApi.md#rateQuestion) | **POST** /questions/{id}/vote-difficulty | Rate a question&#39;s level of difficulty. |
| [**removeQuestionBookmark**](QuestionsApi.md#removeQuestionBookmark) | **DELETE** /questions/{questionId}/bookmarks | Remove bookmark from a question |
| [**updateQuestion**](QuestionsApi.md#updateQuestion) | **PUT** /questions/{questionId} | Update a question |
| [**upvoteQuestion**](QuestionsApi.md#upvoteQuestion) | **POST** /questions/{questionId}/upvote | Upvote a question |



## bookmarkQuestion

> bookmarkQuestion(questionId)

Bookmark a question

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuestionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        QuestionsApi apiInstance = new QuestionsApi(defaultClient);
        Integer questionId = 56; // Integer | 
        try {
            apiInstance.bookmarkQuestion(questionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuestionsApi#bookmarkQuestion");
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

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Question successfully bookmarked |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## createQuestion

> CreateQuestion201Response createQuestion(newQuestion)

Create a new question

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuestionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        QuestionsApi apiInstance = new QuestionsApi(defaultClient);
        NewQuestion newQuestion = new NewQuestion(); // NewQuestion | 
        try {
            CreateQuestion201Response result = apiInstance.createQuestion(newQuestion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuestionsApi#createQuestion");
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
| **newQuestion** | [**NewQuestion**](NewQuestion.md)|  | |

### Return type

[**CreateQuestion201Response**](CreateQuestion201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Question successfully created |  -  |
| **400** |  |  -  |
| **401** |  |  -  |


## deleteQuestion

> deleteQuestion(questionId)

Delete a question

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuestionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        QuestionsApi apiInstance = new QuestionsApi(defaultClient);
        Integer questionId = 56; // Integer | 
        try {
            apiInstance.deleteQuestion(questionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuestionsApi#deleteQuestion");
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

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Question successfully deleted |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## downvoteQuestion

> downvoteQuestion(questionId)

Downvote a question

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuestionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        QuestionsApi apiInstance = new QuestionsApi(defaultClient);
        Integer questionId = 56; // Integer | 
        try {
            apiInstance.downvoteQuestion(questionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuestionsApi#downvoteQuestion");
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

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Question successfully downvoted |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## getBookmarkedQuestions

> GetBookmarkedQuestions200Response getBookmarkedQuestions()

Get bookmarked questions

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuestionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        QuestionsApi apiInstance = new QuestionsApi(defaultClient);
        try {
            GetBookmarkedQuestions200Response result = apiInstance.getBookmarkedQuestions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuestionsApi#getBookmarkedQuestions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetBookmarkedQuestions200Response**](GetBookmarkedQuestions200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bookmarked questions retrieved successfully |  -  |
| **401** |  |  -  |


## getQuestionDetails

> CreateQuestion201Response getQuestionDetails(questionId)

Get question details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuestionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5173/api/v1");

        QuestionsApi apiInstance = new QuestionsApi(defaultClient);
        Integer questionId = 56; // Integer | 
        try {
            CreateQuestion201Response result = apiInstance.getQuestionDetails(questionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuestionsApi#getQuestionDetails");
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

[**CreateQuestion201Response**](CreateQuestion201Response.md)

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


## rateQuestion

> RateQuestion200Response rateQuestion(id, difficultyLevelRequestDto)

Rate a question&#39;s level of difficulty.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuestionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5173/api/v1");

        QuestionsApi apiInstance = new QuestionsApi(defaultClient);
        Long id = 56L; // Long | 
        DifficultyLevelRequestDto difficultyLevelRequestDto = new DifficultyLevelRequestDto(); // DifficultyLevelRequestDto | 
        try {
            RateQuestion200Response result = apiInstance.rateQuestion(id, difficultyLevelRequestDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuestionsApi#rateQuestion");
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
| **id** | **Long**|  | |
| **difficultyLevelRequestDto** | [**DifficultyLevelRequestDto**](DifficultyLevelRequestDto.md)|  | |

### Return type

[**RateQuestion200Response**](RateQuestion200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## removeQuestionBookmark

> removeQuestionBookmark(questionId)

Remove bookmark from a question

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuestionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        QuestionsApi apiInstance = new QuestionsApi(defaultClient);
        Integer questionId = 56; // Integer | 
        try {
            apiInstance.removeQuestionBookmark(questionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuestionsApi#removeQuestionBookmark");
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

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bookmark successfully removed |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## updateQuestion

> CreateQuestion201Response updateQuestion(questionId, updateQuestion)

Update a question

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuestionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        QuestionsApi apiInstance = new QuestionsApi(defaultClient);
        Integer questionId = 56; // Integer | 
        UpdateQuestion updateQuestion = new UpdateQuestion(); // UpdateQuestion | 
        try {
            CreateQuestion201Response result = apiInstance.updateQuestion(questionId, updateQuestion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuestionsApi#updateQuestion");
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
| **updateQuestion** | [**UpdateQuestion**](UpdateQuestion.md)|  | |

### Return type

[**CreateQuestion201Response**](CreateQuestion201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Question successfully updated |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## upvoteQuestion

> upvoteQuestion(questionId)

Upvote a question

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuestionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5173/api/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        QuestionsApi apiInstance = new QuestionsApi(defaultClient);
        Integer questionId = 56; // Integer | 
        try {
            apiInstance.upvoteQuestion(questionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling QuestionsApi#upvoteQuestion");
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

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Question successfully rated |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |

