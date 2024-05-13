# PostsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPost**](PostsApi.md#createPost) | **POST** /posts | Create a post |
| [**createPostEphemeral**](PostsApi.md#createPostEphemeral) | **POST** /posts/ephemeral | Create a ephemeral post |
| [**deletePost**](PostsApi.md#deletePost) | **DELETE** /posts/{post_id} | Delete a post |
| [**doPostAction**](PostsApi.md#doPostAction) | **POST** /posts/{post_id}/actions/{action_id} | Perform a post action |
| [**getFileInfosForPost**](PostsApi.md#getFileInfosForPost) | **GET** /posts/{post_id}/files/info | Get file info for post |
| [**getFlaggedPostsForUser**](PostsApi.md#getFlaggedPostsForUser) | **GET** /users/{user_id}/posts/flagged | Get a list of flagged posts |
| [**getPost**](PostsApi.md#getPost) | **GET** /posts/{post_id} | Get a post |
| [**getPostThread**](PostsApi.md#getPostThread) | **GET** /posts/{post_id}/thread | Get a thread |
| [**getPostsAroundLastUnread**](PostsApi.md#getPostsAroundLastUnread) | **GET** /users/{user_id}/channels/{channel_id}/posts/unread | Get posts around oldest unread |
| [**getPostsByIds**](PostsApi.md#getPostsByIds) | **POST** /posts/ids | Get posts by a list of ids |
| [**getPostsForChannel**](PostsApi.md#getPostsForChannel) | **GET** /channels/{channel_id}/posts | Get posts for a channel |
| [**patchPost**](PostsApi.md#patchPost) | **PUT** /posts/{post_id}/patch | Patch a post |
| [**pinPost**](PostsApi.md#pinPost) | **POST** /posts/{post_id}/pin | Pin a post to the channel |
| [**searchPosts**](PostsApi.md#searchPosts) | **POST** /teams/{team_id}/posts/search | Search for team posts |
| [**setPostReminder**](PostsApi.md#setPostReminder) | **POST** /users/{user_id}/posts/{post_id}/reminder | Set a post reminder |
| [**setPostUnread**](PostsApi.md#setPostUnread) | **POST** /users/{user_id}/posts/{post_id}/set_unread | Mark as unread from a post. |
| [**unpinPost**](PostsApi.md#unpinPost) | **POST** /posts/{post_id}/unpin | Unpin a post to the channel |
| [**updatePost**](PostsApi.md#updatePost) | **PUT** /posts/{post_id} | Update a post |



## createPost

> Post createPost(createPostRequest, setOnline)

Create a post

Create a new post in a channel. To create the post as a comment on another post, provide &#x60;root_id&#x60;. ##### Permissions Must have &#x60;create_post&#x60; permission for the channel the post is being created in. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PostsApi apiInstance = new PostsApi(defaultClient);
        CreatePostRequest createPostRequest = new CreatePostRequest(); // CreatePostRequest | Post object to create
        Boolean setOnline = true; // Boolean | Whether to set the user status as online or not.
        try {
            Post result = apiInstance.createPost(createPostRequest, setOnline);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostsApi#createPost");
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
| **createPostRequest** | [**CreatePostRequest**](CreatePostRequest.md)| Post object to create | |
| **setOnline** | **Boolean**| Whether to set the user status as online or not. | [optional] |

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Post creation successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## createPostEphemeral

> Post createPostEphemeral(createPostEphemeralRequest)

Create a ephemeral post

Create a new ephemeral post in a channel. ##### Permissions Must have &#x60;create_post_ephemeral&#x60; permission (currently only given to system admin) 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PostsApi apiInstance = new PostsApi(defaultClient);
        CreatePostEphemeralRequest createPostEphemeralRequest = new CreatePostEphemeralRequest(); // CreatePostEphemeralRequest | Ephemeral Post object to send
        try {
            Post result = apiInstance.createPostEphemeral(createPostEphemeralRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostsApi#createPostEphemeral");
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
| **createPostEphemeralRequest** | [**CreatePostEphemeralRequest**](CreatePostEphemeralRequest.md)| Ephemeral Post object to send | |

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Post creation successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## deletePost

> StatusOK deletePost(postId)

Delete a post

Soft deletes a post, by marking the post as deleted in the database. Soft deleted posts will not be returned in post queries. ##### Permissions Must be logged in as the user or have &#x60;delete_others_posts&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PostsApi apiInstance = new PostsApi(defaultClient);
        String postId = "postId_example"; // String | ID of the post to delete
        try {
            StatusOK result = apiInstance.deletePost(postId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostsApi#deletePost");
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
| **postId** | **String**| ID of the post to delete | |

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
| **200** | Post deletion successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## doPostAction

> StatusOK doPostAction(postId, actionId)

Perform a post action

Perform a post action, which allows users to interact with integrations through posts. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PostsApi apiInstance = new PostsApi(defaultClient);
        String postId = "postId_example"; // String | Post GUID
        String actionId = "actionId_example"; // String | Action GUID
        try {
            StatusOK result = apiInstance.doPostAction(postId, actionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostsApi#doPostAction");
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
| **postId** | **String**| Post GUID | |
| **actionId** | **String**| Action GUID | |

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
| **200** | Post action successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getFileInfosForPost

> List&lt;FileInfo&gt; getFileInfosForPost(postId, includeDeleted)

Get file info for post

Gets a list of file information objects for the files attached to a post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PostsApi apiInstance = new PostsApi(defaultClient);
        String postId = "postId_example"; // String | ID of the post
        Boolean includeDeleted = false; // Boolean | Defines if result should include deleted posts, must have 'manage_system' (admin) permission.
        try {
            List<FileInfo> result = apiInstance.getFileInfosForPost(postId, includeDeleted);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostsApi#getFileInfosForPost");
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
| **postId** | **String**| ID of the post | |
| **includeDeleted** | **Boolean**| Defines if result should include deleted posts, must have &#39;manage_system&#39; (admin) permission. | [optional] [default to false] |

### Return type

[**List&lt;FileInfo&gt;**](FileInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | File info retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getFlaggedPostsForUser

> List&lt;PostList&gt; getFlaggedPostsForUser(userId, teamId, channelId, page, perPage)

Get a list of flagged posts

Get a page of flagged posts of a user provided user id string. Selects from a channel, team, or all flagged posts by a user. Will only return posts from channels in which the user is member. ##### Permissions Must be user or have &#x60;manage_system&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PostsApi apiInstance = new PostsApi(defaultClient);
        String userId = "userId_example"; // String | ID of the user
        String teamId = "teamId_example"; // String | Team ID
        String channelId = "channelId_example"; // String | Channel ID
        Integer page = 0; // Integer | The page to select
        Integer perPage = 60; // Integer | The number of posts per page
        try {
            List<PostList> result = apiInstance.getFlaggedPostsForUser(userId, teamId, channelId, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostsApi#getFlaggedPostsForUser");
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
| **teamId** | **String**| Team ID | [optional] |
| **channelId** | **String**| Channel ID | [optional] |
| **page** | **Integer**| The page to select | [optional] [default to 0] |
| **perPage** | **Integer**| The number of posts per page | [optional] [default to 60] |

### Return type

[**List&lt;PostList&gt;**](PostList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Post list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getPost

> Post getPost(postId, includeDeleted)

Get a post

Get a single post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PostsApi apiInstance = new PostsApi(defaultClient);
        String postId = "postId_example"; // String | ID of the post to get
        Boolean includeDeleted = false; // Boolean | Defines if result should include deleted posts, must have 'manage_system' (admin) permission.
        try {
            Post result = apiInstance.getPost(postId, includeDeleted);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostsApi#getPost");
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
| **postId** | **String**| ID of the post to get | |
| **includeDeleted** | **Boolean**| Defines if result should include deleted posts, must have &#39;manage_system&#39; (admin) permission. | [optional] [default to false] |

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Post retrieval successful |  * Has-Inaccessible-Posts - Indicates whether the posts have been truncated as per the cloud&#39;s plan limit. <br>  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getPostThread

> PostList getPostThread(postId, perPage, fromPost, fromCreateAt, direction, skipFetchThreads, collapsedThreads, collapsedThreadsExtended)

Get a thread

Get a post and the rest of the posts in the same thread. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PostsApi apiInstance = new PostsApi(defaultClient);
        String postId = "postId_example"; // String | ID of a post in the thread
        Integer perPage = 0; // Integer | The number of posts per page
        String fromPost = ""; // String | The post_id to return the next page of posts from
        Integer fromCreateAt = 0; // Integer | The create_at timestamp to return the next page of posts from
        String direction = ""; // String | The direction to return the posts. Either up or down.
        Boolean skipFetchThreads = false; // Boolean | Whether to skip fetching threads or not
        Boolean collapsedThreads = false; // Boolean | Whether the client uses CRT or not
        Boolean collapsedThreadsExtended = false; // Boolean | Whether to return the associated users as part of the response or not
        try {
            PostList result = apiInstance.getPostThread(postId, perPage, fromPost, fromCreateAt, direction, skipFetchThreads, collapsedThreads, collapsedThreadsExtended);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostsApi#getPostThread");
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
| **postId** | **String**| ID of a post in the thread | |
| **perPage** | **Integer**| The number of posts per page | [optional] [default to 0] |
| **fromPost** | **String**| The post_id to return the next page of posts from | [optional] [default to ] |
| **fromCreateAt** | **Integer**| The create_at timestamp to return the next page of posts from | [optional] [default to 0] |
| **direction** | **String**| The direction to return the posts. Either up or down. | [optional] [default to ] |
| **skipFetchThreads** | **Boolean**| Whether to skip fetching threads or not | [optional] [default to false] |
| **collapsedThreads** | **Boolean**| Whether the client uses CRT or not | [optional] [default to false] |
| **collapsedThreadsExtended** | **Boolean**| Whether to return the associated users as part of the response or not | [optional] [default to false] |

### Return type

[**PostList**](PostList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Post list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getPostsAroundLastUnread

> PostList getPostsAroundLastUnread(userId, channelId, limitBefore, limitAfter, skipFetchThreads, collapsedThreads, collapsedThreadsExtended)

Get posts around oldest unread

Get the oldest unread post in the channel for the given user as well as the posts around it. The returned list is sorted in descending order (most recent post first). ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission, and must have &#x60;read_channel&#x60; permission for the channel. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PostsApi apiInstance = new PostsApi(defaultClient);
        String userId = "userId_example"; // String | ID of the user
        String channelId = "channelId_example"; // String | The channel ID to get the posts for
        Integer limitBefore = 60; // Integer | Number of posts before the oldest unread posts. Maximum is 200 posts if limit is set greater than that.
        Integer limitAfter = 60; // Integer | Number of posts after and including the oldest unread post. Maximum is 200 posts if limit is set greater than that.
        Boolean skipFetchThreads = false; // Boolean | Whether to skip fetching threads or not
        Boolean collapsedThreads = false; // Boolean | Whether the client uses CRT or not
        Boolean collapsedThreadsExtended = false; // Boolean | Whether to return the associated users as part of the response or not
        try {
            PostList result = apiInstance.getPostsAroundLastUnread(userId, channelId, limitBefore, limitAfter, skipFetchThreads, collapsedThreads, collapsedThreadsExtended);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostsApi#getPostsAroundLastUnread");
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
| **channelId** | **String**| The channel ID to get the posts for | |
| **limitBefore** | **Integer**| Number of posts before the oldest unread posts. Maximum is 200 posts if limit is set greater than that. | [optional] [default to 60] |
| **limitAfter** | **Integer**| Number of posts after and including the oldest unread post. Maximum is 200 posts if limit is set greater than that. | [optional] [default to 60] |
| **skipFetchThreads** | **Boolean**| Whether to skip fetching threads or not | [optional] [default to false] |
| **collapsedThreads** | **Boolean**| Whether the client uses CRT or not | [optional] [default to false] |
| **collapsedThreadsExtended** | **Boolean**| Whether to return the associated users as part of the response or not | [optional] [default to false] |

### Return type

[**PostList**](PostList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Post list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getPostsByIds

> List&lt;Post&gt; getPostsByIds(requestBody)

Get posts by a list of ids

Fetch a list of posts based on the provided postIDs ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PostsApi apiInstance = new PostsApi(defaultClient);
        List<String> requestBody = Arrays.asList(); // List<String> | List of post ids
        try {
            List<Post> result = apiInstance.getPostsByIds(requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostsApi#getPostsByIds");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of post ids | |

### Return type

[**List&lt;Post&gt;**](Post.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Post list retrieval successful |  * Has-Inaccessible-Posts - Indicates whether the posts have been truncated as per the cloud&#39;s plan limit. <br>  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getPostsForChannel

> PostList getPostsForChannel(channelId, page, perPage, since, before, after, includeDeleted)

Get posts for a channel

Get a page of posts in a channel. Use the query parameters to modify the behaviour of this endpoint. The parameter &#x60;since&#x60; must not be used with any of &#x60;before&#x60;, &#x60;after&#x60;, &#x60;page&#x60;, and &#x60;per_page&#x60; parameters. If &#x60;since&#x60; is used, it will always return all posts modified since that time, ordered by their create time limited till 1000. A caveat with this parameter is that there is no guarantee that the returned posts will be consecutive. It is left to the clients to maintain state and fill any missing holes in the post order. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PostsApi apiInstance = new PostsApi(defaultClient);
        String channelId = "channelId_example"; // String | The channel ID to get the posts for
        Integer page = 0; // Integer | The page to select
        Integer perPage = 60; // Integer | The number of posts per page
        Integer since = 56; // Integer | Provide a non-zero value in Unix time milliseconds to select posts modified after that time
        String before = "before_example"; // String | A post id to select the posts that came before this one
        String after = "after_example"; // String | A post id to select the posts that came after this one
        Boolean includeDeleted = false; // Boolean | Whether to include deleted posts or not. Must have system admin permissions.
        try {
            PostList result = apiInstance.getPostsForChannel(channelId, page, perPage, since, before, after, includeDeleted);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostsApi#getPostsForChannel");
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
| **channelId** | **String**| The channel ID to get the posts for | |
| **page** | **Integer**| The page to select | [optional] [default to 0] |
| **perPage** | **Integer**| The number of posts per page | [optional] [default to 60] |
| **since** | **Integer**| Provide a non-zero value in Unix time milliseconds to select posts modified after that time | [optional] |
| **before** | **String**| A post id to select the posts that came before this one | [optional] |
| **after** | **String**| A post id to select the posts that came after this one | [optional] |
| **includeDeleted** | **Boolean**| Whether to include deleted posts or not. Must have system admin permissions. | [optional] [default to false] |

### Return type

[**PostList**](PostList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Post list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## patchPost

> Post patchPost(postId, patchPostRequest)

Patch a post

Partially update a post by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must have the &#x60;edit_post&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PostsApi apiInstance = new PostsApi(defaultClient);
        String postId = "postId_example"; // String | Post GUID
        PatchPostRequest patchPostRequest = new PatchPostRequest(); // PatchPostRequest | Post object that is to be updated
        try {
            Post result = apiInstance.patchPost(postId, patchPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostsApi#patchPost");
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
| **postId** | **String**| Post GUID | |
| **patchPostRequest** | [**PatchPostRequest**](PatchPostRequest.md)| Post object that is to be updated | |

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Post patch successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## pinPost

> StatusOK pinPost(postId)

Pin a post to the channel

Pin a post to a channel it is in based from the provided post id string. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PostsApi apiInstance = new PostsApi(defaultClient);
        String postId = "postId_example"; // String | Post GUID
        try {
            StatusOK result = apiInstance.pinPost(postId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostsApi#pinPost");
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
| **postId** | **String**| Post GUID | |

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
| **200** | Pinned post successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## searchPosts

> PostListWithSearchMatches searchPosts(teamId, searchPostsRequest)

Search for team posts

Search posts in the team and from the provided terms string. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PostsApi apiInstance = new PostsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        SearchPostsRequest searchPostsRequest = new SearchPostsRequest(); // SearchPostsRequest | The search terms and logic to use in the search.
        try {
            PostListWithSearchMatches result = apiInstance.searchPosts(teamId, searchPostsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostsApi#searchPosts");
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
| **teamId** | **String**| Team GUID | |
| **searchPostsRequest** | [**SearchPostsRequest**](SearchPostsRequest.md)| The search terms and logic to use in the search. | |

### Return type

[**PostListWithSearchMatches**](PostListWithSearchMatches.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Post list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## setPostReminder

> StatusOK setPostReminder(userId, postId, setPostReminderRequest)

Set a post reminder

Set a reminder for the user for the post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in.  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PostsApi apiInstance = new PostsApi(defaultClient);
        String userId = "userId_example"; // String | User GUID
        String postId = "postId_example"; // String | Post GUID
        SetPostReminderRequest setPostReminderRequest = new SetPostReminderRequest(); // SetPostReminderRequest | Target time for the reminder
        try {
            StatusOK result = apiInstance.setPostReminder(userId, postId, setPostReminderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostsApi#setPostReminder");
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
| **userId** | **String**| User GUID | |
| **postId** | **String**| Post GUID | |
| **setPostReminderRequest** | [**SetPostReminderRequest**](SetPostReminderRequest.md)| Target time for the reminder | |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Reminder set successfully |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## setPostUnread

> ChannelUnreadAt setPostUnread(userId, postId)

Mark as unread from a post.

Mark a channel as being unread from a given post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team. Must have &#x60;edit_other_users&#x60; permission if the user is not the one marking the post for himself.  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PostsApi apiInstance = new PostsApi(defaultClient);
        String userId = "userId_example"; // String | User GUID
        String postId = "postId_example"; // String | Post GUID
        try {
            ChannelUnreadAt result = apiInstance.setPostUnread(userId, postId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostsApi#setPostUnread");
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
| **userId** | **String**| User GUID | |
| **postId** | **String**| Post GUID | |

### Return type

[**ChannelUnreadAt**](ChannelUnreadAt.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Post marked as unread successfully |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## unpinPost

> StatusOK unpinPost(postId)

Unpin a post to the channel

Unpin a post to a channel it is in based from the provided post id string. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PostsApi apiInstance = new PostsApi(defaultClient);
        String postId = "postId_example"; // String | Post GUID
        try {
            StatusOK result = apiInstance.unpinPost(postId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostsApi#unpinPost");
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
| **postId** | **String**| Post GUID | |

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
| **200** | Unpinned post successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## updatePost

> Post updatePost(postId, updatePostRequest)

Update a post

Update a post. Only the fields listed below are updatable, omitted fields will be treated as blank. ##### Permissions Must have &#x60;edit_post&#x60; permission for the channel the post is in. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PostsApi apiInstance = new PostsApi(defaultClient);
        String postId = "postId_example"; // String | ID of the post to update
        UpdatePostRequest updatePostRequest = new UpdatePostRequest(); // UpdatePostRequest | Post object that is to be updated
        try {
            Post result = apiInstance.updatePost(postId, updatePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PostsApi#updatePost");
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
| **postId** | **String**| ID of the post to update | |
| **updatePostRequest** | [**UpdatePostRequest**](UpdatePostRequest.md)| Post object that is to be updated | |

### Return type

[**Post**](Post.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Post update successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |

