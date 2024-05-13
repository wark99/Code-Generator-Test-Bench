# EmojiApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**autocompleteEmoji**](EmojiApi.md#autocompleteEmoji) | **GET** /emoji/autocomplete | Autocomplete custom emoji |
| [**createEmoji**](EmojiApi.md#createEmoji) | **POST** /emoji | Create a custom emoji |
| [**deleteEmoji**](EmojiApi.md#deleteEmoji) | **DELETE** /emoji/{emoji_id} | Delete a custom emoji |
| [**getEmoji**](EmojiApi.md#getEmoji) | **GET** /emoji/{emoji_id} | Get a custom emoji |
| [**getEmojiByName**](EmojiApi.md#getEmojiByName) | **GET** /emoji/name/{emoji_name} | Get a custom emoji by name |
| [**getEmojiImage**](EmojiApi.md#getEmojiImage) | **GET** /emoji/{emoji_id}/image | Get custom emoji image |
| [**getEmojiList**](EmojiApi.md#getEmojiList) | **GET** /emoji | Get a list of custom emoji |
| [**searchEmoji**](EmojiApi.md#searchEmoji) | **POST** /emoji/search | Search custom emoji |



## autocompleteEmoji

> Emoji autocompleteEmoji(name)

Autocomplete custom emoji

Get a list of custom emoji with names starting with or matching the provided name. Returns a maximum of 100 results. ##### Permissions Must be authenticated.  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmojiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        EmojiApi apiInstance = new EmojiApi(defaultClient);
        String name = "name_example"; // String | The emoji name to search.
        try {
            Emoji result = apiInstance.autocompleteEmoji(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmojiApi#autocompleteEmoji");
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
| **name** | **String**| The emoji name to search. | |

### Return type

[**Emoji**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Emoji list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **501** |  |  -  |


## createEmoji

> Emoji createEmoji(createEmojiRequest)

Create a custom emoji

Create a custom emoji for the team. ##### Permissions Must be authenticated. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmojiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        EmojiApi apiInstance = new EmojiApi(defaultClient);
        CreateEmojiRequest createEmojiRequest = new CreateEmojiRequest(); // CreateEmojiRequest | 
        try {
            Emoji result = apiInstance.createEmoji(createEmojiRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmojiApi#createEmoji");
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
| **createEmojiRequest** | [**CreateEmojiRequest**](CreateEmojiRequest.md)|  | [optional] |

### Return type

[**Emoji**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Emoji creation successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **413** |  |  -  |
| **501** |  |  -  |


## deleteEmoji

> Emoji deleteEmoji(emojiId)

Delete a custom emoji

Delete a custom emoji. ##### Permissions Must have the &#x60;manage_team&#x60; or &#x60;manage_system&#x60; permissions or be the user who created the emoji. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmojiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        EmojiApi apiInstance = new EmojiApi(defaultClient);
        String emojiId = "emojiId_example"; // String | Emoji GUID
        try {
            Emoji result = apiInstance.deleteEmoji(emojiId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmojiApi#deleteEmoji");
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
| **emojiId** | **String**| Emoji GUID | |

### Return type

[**Emoji**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Emoji delete successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **501** |  |  -  |


## getEmoji

> Emoji getEmoji(emojiId)

Get a custom emoji

Get some metadata for a custom emoji. ##### Permissions Must be authenticated. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmojiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        EmojiApi apiInstance = new EmojiApi(defaultClient);
        String emojiId = "emojiId_example"; // String | Emoji GUID
        try {
            Emoji result = apiInstance.getEmoji(emojiId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmojiApi#getEmoji");
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
| **emojiId** | **String**| Emoji GUID | |

### Return type

[**Emoji**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Emoji retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |
| **501** |  |  -  |


## getEmojiByName

> Emoji getEmojiByName(emojiName)

Get a custom emoji by name

Get some metadata for a custom emoji using its name. ##### Permissions Must be authenticated.  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmojiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        EmojiApi apiInstance = new EmojiApi(defaultClient);
        String emojiName = "emojiName_example"; // String | Emoji name
        try {
            Emoji result = apiInstance.getEmojiByName(emojiName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmojiApi#getEmojiByName");
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
| **emojiName** | **String**| Emoji name | |

### Return type

[**Emoji**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Emoji retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |
| **501** |  |  -  |


## getEmojiImage

> File getEmojiImage(emojiId)

Get custom emoji image

Get the image for a custom emoji. ##### Permissions Must be authenticated. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmojiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        EmojiApi apiInstance = new EmojiApi(defaultClient);
        String emojiId = "emojiId_example"; // String | Emoji GUID
        try {
            File result = apiInstance.getEmojiImage(emojiId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmojiApi#getEmojiImage");
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
| **emojiId** | **String**| Emoji GUID | |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/png, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Emoji image retrieval successful |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **500** |  |  -  |
| **501** |  |  -  |


## getEmojiList

> Emoji getEmojiList(page, perPage, sort)

Get a list of custom emoji

Get a page of metadata for custom emoji on the system.##### Permissions Must be authenticated. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmojiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        EmojiApi apiInstance = new EmojiApi(defaultClient);
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of emojis per page.
        String sort = ""; // String | Either blank for no sorting or \"name\" to sort by emoji names.
        try {
            Emoji result = apiInstance.getEmojiList(page, perPage, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmojiApi#getEmojiList");
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
| **perPage** | **Integer**| The number of emojis per page. | [optional] [default to 60] |
| **sort** | **String**| Either blank for no sorting or \&quot;name\&quot; to sort by emoji names. | [optional] [default to ] |

### Return type

[**Emoji**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Emoji list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **501** |  |  -  |


## searchEmoji

> List&lt;Emoji&gt; searchEmoji(searchEmojiRequest)

Search custom emoji

Search for custom emoji by name based on search criteria provided in the request body. A maximum of 200 results are returned. ##### Permissions Must be authenticated.  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmojiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        EmojiApi apiInstance = new EmojiApi(defaultClient);
        SearchEmojiRequest searchEmojiRequest = new SearchEmojiRequest(); // SearchEmojiRequest | Search criteria
        try {
            List<Emoji> result = apiInstance.searchEmoji(searchEmojiRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmojiApi#searchEmoji");
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
| **searchEmojiRequest** | [**SearchEmojiRequest**](SearchEmojiRequest.md)| Search criteria | |

### Return type

[**List&lt;Emoji&gt;**](Emoji.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Emoji list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **501** |  |  -  |

