# ReactionsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteReaction**](ReactionsApi.md#deleteReaction) | **DELETE** /users/{user_id}/posts/{post_id}/reactions/{emoji_name} | Remove a reaction from a post |
| [**getReactions**](ReactionsApi.md#getReactions) | **GET** /posts/{post_id}/reactions | Get a list of reactions to a post |
| [**saveReaction**](ReactionsApi.md#saveReaction) | **POST** /reactions | Create a reaction |



## deleteReaction

> StatusOK deleteReaction(userId, postId, emojiName)

Remove a reaction from a post

Deletes a reaction made by a user from the given post. ##### Permissions Must be user or have &#x60;manage_system&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReactionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ReactionsApi apiInstance = new ReactionsApi(defaultClient);
        String userId = "userId_example"; // String | ID of the user
        String postId = "postId_example"; // String | ID of the post
        String emojiName = "emojiName_example"; // String | emoji name
        try {
            StatusOK result = apiInstance.deleteReaction(userId, postId, emojiName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReactionsApi#deleteReaction");
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
| **userId** | **String**| ID of the user | |
| **postId** | **String**| ID of the post | |
| **emojiName** | **String**| emoji name | |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Reaction deletion successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getReactions

> List&lt;Reaction&gt; getReactions(postId)

Get a list of reactions to a post

Get a list of reactions made by all users to a given post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReactionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ReactionsApi apiInstance = new ReactionsApi(defaultClient);
        String postId = "postId_example"; // String | ID of a post
        try {
            List<Reaction> result = apiInstance.getReactions(postId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReactionsApi#getReactions");
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
| **postId** | **String**| ID of a post | |

### Return type

[**List&lt;Reaction&gt;**](Reaction.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List reactions retrieve successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## saveReaction

> Reaction saveReaction(reaction)

Create a reaction

Create a reaction. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReactionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ReactionsApi apiInstance = new ReactionsApi(defaultClient);
        Reaction reaction = new Reaction(); // Reaction | The user's reaction with its post_id, user_id, and emoji_name fields set
        try {
            Reaction result = apiInstance.saveReaction(reaction);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReactionsApi#saveReaction");
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
| **reaction** | [**Reaction**](Reaction.md)| The user&#39;s reaction with its post_id, user_id, and emoji_name fields set | |

### Return type

[**Reaction**](Reaction.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Reaction creation successful |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

