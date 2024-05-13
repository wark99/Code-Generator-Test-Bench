# StoryRoutesApi

All URIs are relative to *http://localhost:5001/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**storyAddReactionUserUseridStoryStoryidReactionReactionGet**](StoryRoutesApi.md#storyAddReactionUserUseridStoryStoryidReactionReactionGet) | **GET** /story/add-reaction/user/{userid}/story/{storyid}/reaction/{reaction} | add-reaction |
| [**storyAddViewUserUseridStoryStoryidGet**](StoryRoutesApi.md#storyAddViewUserUseridStoryStoryidGet) | **GET** /story/add-view/user/{userid}/story/{storyid} | add-view |
| [**storyCreateStoryUserUseridPost**](StoryRoutesApi.md#storyCreateStoryUserUseridPost) | **POST** /story/create-story/user/{userid} | create-story |
| [**storyDeleteReactionUserUseridStoryStoryidDelete**](StoryRoutesApi.md#storyDeleteReactionUserUseridStoryStoryidDelete) | **DELETE** /story/delete-reaction/user/{userid}/story/{storyid} | delete-reaction |
| [**storyDeleteStoryUserUseridStoryStoryidDelete**](StoryRoutesApi.md#storyDeleteStoryUserUseridStoryStoryidDelete) | **DELETE** /story/delete-story/user/{userid}/story/{storyid} | delete-story |
| [**storyGetAllCollegeStoryUserUseridGet**](StoryRoutesApi.md#storyGetAllCollegeStoryUserUseridGet) | **GET** /story/get-all-college-story/user/{userid} | get-all-college-stories |
| [**storyGetCollegeStoryUserUseridCollegeCollegeidGet**](StoryRoutesApi.md#storyGetCollegeStoryUserUseridCollegeCollegeidGet) | **GET** /story/get-college-story/user/{userid}/college/{collegeid} | get-college-stories |
| [**storyGetTagStoryUserUseridPost**](StoryRoutesApi.md#storyGetTagStoryUserUseridPost) | **POST** /story/get-tag-story/user/{userid} | get-tag-stories |
| [**storyGetUserStoryUserUseridGet**](StoryRoutesApi.md#storyGetUserStoryUserUseridGet) | **GET** /story/get-user-story/user/{userid} | get-user-story |



## storyAddReactionUserUseridStoryStoryidReactionReactionGet

> storyAddReactionUserUseridStoryStoryidReactionReactionGet(userid, storyid, reaction, authorization)

add-reaction

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoryRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        StoryRoutesApi apiInstance = new StoryRoutesApi(defaultClient);
        String userid = "userid_example"; // String | 
        String storyid = "storyid_example"; // String | 
        String reaction = "Like"; // String | 
        String authorization = "<Your Access Token>"; // String | 
        try {
            apiInstance.storyAddReactionUserUseridStoryStoryidReactionReactionGet(userid, storyid, reaction, authorization);
        } catch (ApiException e) {
            System.err.println("Exception when calling StoryRoutesApi#storyAddReactionUserUseridStoryStoryidReactionReactionGet");
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
| **userid** | **String**|  | |
| **storyid** | **String**|  | |
| **reaction** | **String**|  | |
| **authorization** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## storyAddViewUserUseridStoryStoryidGet

> storyAddViewUserUseridStoryStoryidGet(userid, storyid, authorization)

add-view

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoryRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        StoryRoutesApi apiInstance = new StoryRoutesApi(defaultClient);
        String userid = "userid_example"; // String | 
        String storyid = "storyid_example"; // String | 
        String authorization = "<Your Access Token>"; // String | 
        try {
            apiInstance.storyAddViewUserUseridStoryStoryidGet(userid, storyid, authorization);
        } catch (ApiException e) {
            System.err.println("Exception when calling StoryRoutesApi#storyAddViewUserUseridStoryStoryidGet");
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
| **userid** | **String**|  | |
| **storyid** | **String**|  | |
| **authorization** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## storyCreateStoryUserUseridPost

> storyCreateStoryUserUseridPost(userid, UNKNOWN_BASE_TYPE, authorization)

create-story

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoryRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        StoryRoutesApi apiInstance = new StoryRoutesApi(defaultClient);
        String userid = "userid_example"; // String | 
        UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE = new UNKNOWN_BASE_TYPE(); // UNKNOWN_BASE_TYPE | 
        String authorization = "<Your Access Token>"; // String | 
        try {
            apiInstance.storyCreateStoryUserUseridPost(userid, UNKNOWN_BASE_TYPE, authorization);
        } catch (ApiException e) {
            System.err.println("Exception when calling StoryRoutesApi#storyCreateStoryUserUseridPost");
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
| **userid** | **String**|  | |
| **UNKNOWN_BASE_TYPE** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | |
| **authorization** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## storyDeleteReactionUserUseridStoryStoryidDelete

> storyDeleteReactionUserUseridStoryStoryidDelete(userid, storyid, authorization)

delete-reaction

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoryRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        StoryRoutesApi apiInstance = new StoryRoutesApi(defaultClient);
        String userid = "userid_example"; // String | 
        String storyid = "storyid_example"; // String | 
        String authorization = "<Your Access Token>"; // String | 
        try {
            apiInstance.storyDeleteReactionUserUseridStoryStoryidDelete(userid, storyid, authorization);
        } catch (ApiException e) {
            System.err.println("Exception when calling StoryRoutesApi#storyDeleteReactionUserUseridStoryStoryidDelete");
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
| **userid** | **String**|  | |
| **storyid** | **String**|  | |
| **authorization** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## storyDeleteStoryUserUseridStoryStoryidDelete

> storyDeleteStoryUserUseridStoryStoryidDelete(userid, storyid, authorization)

delete-story

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoryRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        StoryRoutesApi apiInstance = new StoryRoutesApi(defaultClient);
        String userid = "userid_example"; // String | 
        String storyid = "storyid_example"; // String | 
        String authorization = "<Your Access Token>"; // String | 
        try {
            apiInstance.storyDeleteStoryUserUseridStoryStoryidDelete(userid, storyid, authorization);
        } catch (ApiException e) {
            System.err.println("Exception when calling StoryRoutesApi#storyDeleteStoryUserUseridStoryStoryidDelete");
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
| **userid** | **String**|  | |
| **storyid** | **String**|  | |
| **authorization** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## storyGetAllCollegeStoryUserUseridGet

> storyGetAllCollegeStoryUserUseridGet(userid, authorization, page, limit)

get-all-college-stories

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoryRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        StoryRoutesApi apiInstance = new StoryRoutesApi(defaultClient);
        String userid = "userid_example"; // String | 
        String authorization = "<Your Access Token>"; // String | 
        Integer page = 56; // Integer | 
        Integer limit = 56; // Integer | 
        try {
            apiInstance.storyGetAllCollegeStoryUserUseridGet(userid, authorization, page, limit);
        } catch (ApiException e) {
            System.err.println("Exception when calling StoryRoutesApi#storyGetAllCollegeStoryUserUseridGet");
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
| **userid** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## storyGetCollegeStoryUserUseridCollegeCollegeidGet

> storyGetCollegeStoryUserUseridCollegeCollegeidGet(userid, collegeid, authorization, page, limit)

get-college-stories

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoryRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        StoryRoutesApi apiInstance = new StoryRoutesApi(defaultClient);
        String userid = "userid_example"; // String | 
        String collegeid = "collegeid_example"; // String | 
        String authorization = "<Your Access Token>"; // String | 
        Integer page = 56; // Integer | 
        Integer limit = 56; // Integer | 
        try {
            apiInstance.storyGetCollegeStoryUserUseridCollegeCollegeidGet(userid, collegeid, authorization, page, limit);
        } catch (ApiException e) {
            System.err.println("Exception when calling StoryRoutesApi#storyGetCollegeStoryUserUseridCollegeCollegeidGet");
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
| **userid** | **String**|  | |
| **collegeid** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## storyGetTagStoryUserUseridPost

> storyGetTagStoryUserUseridPost(userid, authorization, page, limit, storyGetTagStoryUserUseridPostRequest)

get-tag-stories

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoryRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        StoryRoutesApi apiInstance = new StoryRoutesApi(defaultClient);
        String userid = "userid_example"; // String | 
        String authorization = "<Your Access Token>"; // String | 
        Integer page = 56; // Integer | 
        Integer limit = 56; // Integer | 
        StoryGetTagStoryUserUseridPostRequest storyGetTagStoryUserUseridPostRequest = new StoryGetTagStoryUserUseridPostRequest(); // StoryGetTagStoryUserUseridPostRequest | 
        try {
            apiInstance.storyGetTagStoryUserUseridPost(userid, authorization, page, limit, storyGetTagStoryUserUseridPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling StoryRoutesApi#storyGetTagStoryUserUseridPost");
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
| **userid** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **storyGetTagStoryUserUseridPostRequest** | [**StoryGetTagStoryUserUseridPostRequest**](StoryGetTagStoryUserUseridPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |


## storyGetUserStoryUserUseridGet

> storyGetUserStoryUserUseridGet(userid, authorization, page, limit)

get-user-story

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StoryRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        StoryRoutesApi apiInstance = new StoryRoutesApi(defaultClient);
        String userid = "userid_example"; // String | 
        String authorization = "<Your Access Token>"; // String | 
        Integer page = 56; // Integer | 
        Integer limit = 56; // Integer | 
        try {
            apiInstance.storyGetUserStoryUserUseridGet(userid, authorization, page, limit);
        } catch (ApiException e) {
            System.err.println("Exception when calling StoryRoutesApi#storyGetUserStoryUserUseridGet");
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
| **userid** | **String**|  | |
| **authorization** | **String**|  | [optional] |
| **page** | **Integer**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

