# BotsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBot**](BotsApi.md#createBot) | **POST** /bots | Create a bot |
| [**disableBot**](BotsApi.md#disableBot) | **POST** /bots/{bot_user_id}/disable | Disable a bot |
| [**enableBot**](BotsApi.md#enableBot) | **POST** /bots/{bot_user_id}/enable | Enable a bot |
| [**getBot**](BotsApi.md#getBot) | **GET** /bots/{bot_user_id} | Get a bot |
| [**getBots**](BotsApi.md#getBots) | **GET** /bots | Get bots |
| [**patchBot**](BotsApi.md#patchBot) | **PUT** /bots/{bot_user_id} | Patch a bot |



## createBot

> Bot createBot(createBotRequest)

Create a bot

Create a new bot account on the system. Username is required. ##### Permissions Must have &#x60;create_bot&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        BotsApi apiInstance = new BotsApi(defaultClient);
        CreateBotRequest createBotRequest = new CreateBotRequest(); // CreateBotRequest | Bot to be created
        try {
            Bot result = apiInstance.createBot(createBotRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotsApi#createBot");
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
| **createBotRequest** | [**CreateBotRequest**](CreateBotRequest.md)| Bot to be created | |

### Return type

[**Bot**](Bot.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Bot creation successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## disableBot

> Bot disableBot(botUserId)

Disable a bot

Disable a bot. ##### Permissions Must have &#x60;manage_bots&#x60; permission.  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        BotsApi apiInstance = new BotsApi(defaultClient);
        String botUserId = "botUserId_example"; // String | Bot user ID
        try {
            Bot result = apiInstance.disableBot(botUserId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotsApi#disableBot");
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
| **botUserId** | **String**| Bot user ID | |

### Return type

[**Bot**](Bot.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bot successfully disabled. |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## enableBot

> Bot enableBot(botUserId)

Enable a bot

Enable a bot. ##### Permissions Must have &#x60;manage_bots&#x60; permission.  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        BotsApi apiInstance = new BotsApi(defaultClient);
        String botUserId = "botUserId_example"; // String | Bot user ID
        try {
            Bot result = apiInstance.enableBot(botUserId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotsApi#enableBot");
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
| **botUserId** | **String**| Bot user ID | |

### Return type

[**Bot**](Bot.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bot successfully enabled. |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getBot

> Bot getBot(botUserId, includeDeleted)

Get a bot

Get a bot specified by its bot id. ##### Permissions Must have &#x60;read_bots&#x60; permission for bots you are managing, and &#x60;read_others_bots&#x60; permission for bots others are managing. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        BotsApi apiInstance = new BotsApi(defaultClient);
        String botUserId = "botUserId_example"; // String | Bot user ID
        Boolean includeDeleted = true; // Boolean | If deleted bots should be returned.
        try {
            Bot result = apiInstance.getBot(botUserId, includeDeleted);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotsApi#getBot");
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
| **botUserId** | **String**| Bot user ID | |
| **includeDeleted** | **Boolean**| If deleted bots should be returned. | [optional] |

### Return type

[**Bot**](Bot.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bot successfully retrieved. |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getBots

> List&lt;Bot&gt; getBots(page, perPage, includeDeleted, onlyOrphaned)

Get bots

Get a page of a list of bots. ##### Permissions Must have &#x60;read_bots&#x60; permission for bots you are managing, and &#x60;read_others_bots&#x60; permission for bots others are managing. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        BotsApi apiInstance = new BotsApi(defaultClient);
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of users per page. There is a maximum limit of 200 users per page.
        Boolean includeDeleted = true; // Boolean | If deleted bots should be returned.
        Boolean onlyOrphaned = true; // Boolean | When true, only orphaned bots will be returned. A bot is consitered orphaned if it's owner has been deactivated.
        try {
            List<Bot> result = apiInstance.getBots(page, perPage, includeDeleted, onlyOrphaned);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotsApi#getBots");
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
| **page** | **Integer**| The page to select. | [optional] [default to 0] |
| **perPage** | **Integer**| The number of users per page. There is a maximum limit of 200 users per page. | [optional] [default to 60] |
| **includeDeleted** | **Boolean**| If deleted bots should be returned. | [optional] |
| **onlyOrphaned** | **Boolean**| When true, only orphaned bots will be returned. A bot is consitered orphaned if it&#39;s owner has been deactivated. | [optional] |

### Return type

[**List&lt;Bot&gt;**](Bot.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bot page retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## patchBot

> Bot patchBot(botUserId, createBotRequest)

Patch a bot

Partially update a bot by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must have &#x60;manage_bots&#x60; permission.  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        BotsApi apiInstance = new BotsApi(defaultClient);
        String botUserId = "botUserId_example"; // String | Bot user ID
        CreateBotRequest createBotRequest = new CreateBotRequest(); // CreateBotRequest | Bot to be created
        try {
            Bot result = apiInstance.patchBot(botUserId, createBotRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotsApi#patchBot");
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
| **botUserId** | **String**| Bot user ID | |
| **createBotRequest** | [**CreateBotRequest**](CreateBotRequest.md)| Bot to be created | |

### Return type

[**Bot**](Bot.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bot patch successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |

