# TagRoutesApi

All URIs are relative to *http://localhost:5001/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tagCreateUserUseridPost**](TagRoutesApi.md#tagCreateUserUseridPost) | **POST** /tag/create/user/{userid} | create |
| [**tagCustomUserUseridGet**](TagRoutesApi.md#tagCustomUserUseridGet) | **GET** /tag/custom/user/{userid} | custom |
| [**tagStandardUserUseridGet**](TagRoutesApi.md#tagStandardUserUseridGet) | **GET** /tag/standard/user/{userid} | standard |
| [**tagUserUseridSearchQueryGet**](TagRoutesApi.md#tagUserUseridSearchQueryGet) | **GET** /tag/user/{userid}/search/{query} | search |



## tagCreateUserUseridPost

> tagCreateUserUseridPost(userid, authorization, tagCreateUserUseridPostRequest)

create

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TagRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        TagRoutesApi apiInstance = new TagRoutesApi(defaultClient);
        String userid = "userid_example"; // String | 
        String authorization = "<Your Access Token>"; // String | 
        TagCreateUserUseridPostRequest tagCreateUserUseridPostRequest = new TagCreateUserUseridPostRequest(); // TagCreateUserUseridPostRequest | 
        try {
            apiInstance.tagCreateUserUseridPost(userid, authorization, tagCreateUserUseridPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagRoutesApi#tagCreateUserUseridPost");
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
| **tagCreateUserUseridPostRequest** | [**TagCreateUserUseridPostRequest**](TagCreateUserUseridPostRequest.md)|  | [optional] |

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


## tagCustomUserUseridGet

> tagCustomUserUseridGet(userid, authorization, page, limit)

custom

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TagRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        TagRoutesApi apiInstance = new TagRoutesApi(defaultClient);
        String userid = "userid_example"; // String | 
        String authorization = "<Your Access Token>"; // String | 
        Integer page = 1; // Integer | 
        Integer limit = 1; // Integer | 
        try {
            apiInstance.tagCustomUserUseridGet(userid, authorization, page, limit);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagRoutesApi#tagCustomUserUseridGet");
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


## tagStandardUserUseridGet

> tagStandardUserUseridGet(userid, authorization)

standard

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TagRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        TagRoutesApi apiInstance = new TagRoutesApi(defaultClient);
        String userid = "userid_example"; // String | 
        String authorization = "<Your Access Token>"; // String | 
        try {
            apiInstance.tagStandardUserUseridGet(userid, authorization);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagRoutesApi#tagStandardUserUseridGet");
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


## tagUserUseridSearchQueryGet

> tagUserUseridSearchQueryGet(query, userid, authorization)

search

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TagRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        TagRoutesApi apiInstance = new TagRoutesApi(defaultClient);
        String query = "query_example"; // String | 
        String userid = "userid_example"; // String | 
        String authorization = "<Your Access Token>"; // String | 
        try {
            apiInstance.tagUserUseridSearchQueryGet(query, userid, authorization);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagRoutesApi#tagUserUseridSearchQueryGet");
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
| **query** | **String**|  | |
| **userid** | **String**|  | |
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

