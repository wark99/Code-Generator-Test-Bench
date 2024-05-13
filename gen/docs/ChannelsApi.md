# ChannelsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addChannelMember**](ChannelsApi.md#addChannelMember) | **POST** /channels/{channel_id}/members | Add user to channel |
| [**autocompleteChannelsForTeam**](ChannelsApi.md#autocompleteChannelsForTeam) | **GET** /teams/{team_id}/channels/autocomplete | Autocomplete channels |
| [**autocompleteChannelsForTeamForSearch**](ChannelsApi.md#autocompleteChannelsForTeamForSearch) | **GET** /teams/{team_id}/channels/search_autocomplete | Autocomplete channels for search |
| [**createChannel**](ChannelsApi.md#createChannel) | **POST** /channels | Create a channel |
| [**createDirectChannel**](ChannelsApi.md#createDirectChannel) | **POST** /channels/direct | Create a direct message channel |
| [**createGroupChannel**](ChannelsApi.md#createGroupChannel) | **POST** /channels/group | Create a group message channel |
| [**createSidebarCategoryForTeamForUser**](ChannelsApi.md#createSidebarCategoryForTeamForUser) | **POST** /users/{user_id}/teams/{team_id}/channels/categories | Create user&#39;s sidebar category |
| [**deleteChannel**](ChannelsApi.md#deleteChannel) | **DELETE** /channels/{channel_id} | Delete a channel |
| [**getAllChannels**](ChannelsApi.md#getAllChannels) | **GET** /channels | Get a list of all channels |
| [**getChannel**](ChannelsApi.md#getChannel) | **GET** /channels/{channel_id} | Get a channel |
| [**getChannelByName**](ChannelsApi.md#getChannelByName) | **GET** /teams/{team_id}/channels/name/{channel_name} | Get a channel by name |
| [**getChannelByNameForTeamName**](ChannelsApi.md#getChannelByNameForTeamName) | **GET** /teams/name/{team_name}/channels/name/{channel_name} | Get a channel by name and team name |
| [**getChannelMember**](ChannelsApi.md#getChannelMember) | **GET** /channels/{channel_id}/members/{user_id} | Get channel member |
| [**getChannelMembers**](ChannelsApi.md#getChannelMembers) | **GET** /channels/{channel_id}/members | Get channel members |
| [**getChannelMembersByIds**](ChannelsApi.md#getChannelMembersByIds) | **POST** /channels/{channel_id}/members/ids | Get channel members by ids |
| [**getChannelMembersForUser**](ChannelsApi.md#getChannelMembersForUser) | **GET** /users/{user_id}/teams/{team_id}/channels/members | Get channel memberships and roles for a user |
| [**getChannelModerations**](ChannelsApi.md#getChannelModerations) | **GET** /channels/{channel_id}/moderations | Get information about channel&#39;s moderation. |
| [**getChannelStats**](ChannelsApi.md#getChannelStats) | **GET** /channels/{channel_id}/stats | Get channel statistics |
| [**getChannelUnread**](ChannelsApi.md#getChannelUnread) | **GET** /users/{user_id}/channels/{channel_id}/unread | Get unread messages |
| [**getChannelsForTeamForUser**](ChannelsApi.md#getChannelsForTeamForUser) | **GET** /users/{user_id}/teams/{team_id}/channels | Get channels for user |
| [**getChannelsForUser**](ChannelsApi.md#getChannelsForUser) | **GET** /users/{user_id}/channels | Get all channels |
| [**getDeletedChannelsForTeam**](ChannelsApi.md#getDeletedChannelsForTeam) | **GET** /teams/{team_id}/channels/deleted | Get deleted channels |
| [**getPinnedPosts**](ChannelsApi.md#getPinnedPosts) | **GET** /channels/{channel_id}/pinned | Get a channel&#39;s pinned posts |
| [**getPrivateChannelsForTeam**](ChannelsApi.md#getPrivateChannelsForTeam) | **GET** /teams/{team_id}/channels/private | Get private channels |
| [**getPublicChannelsByIdsForTeam**](ChannelsApi.md#getPublicChannelsByIdsForTeam) | **POST** /teams/{team_id}/channels/ids | Get a list of channels by ids |
| [**getPublicChannelsForTeam**](ChannelsApi.md#getPublicChannelsForTeam) | **GET** /teams/{team_id}/channels | Get public channels |
| [**getSidebarCategoriesForTeamForUser**](ChannelsApi.md#getSidebarCategoriesForTeamForUser) | **GET** /users/{user_id}/teams/{team_id}/channels/categories | Get user&#39;s sidebar categories |
| [**getSidebarCategoryForTeamForUser**](ChannelsApi.md#getSidebarCategoryForTeamForUser) | **GET** /users/{user_id}/teams/{team_id}/channels/categories/{category_id} | Get sidebar category |
| [**getSidebarCategoryOrderForTeamForUser**](ChannelsApi.md#getSidebarCategoryOrderForTeamForUser) | **GET** /users/{user_id}/teams/{team_id}/channels/categories/order | Get user&#39;s sidebar category order |
| [**moveChannel**](ChannelsApi.md#moveChannel) | **POST** /channels/{channel_id}/move | Move a channel |
| [**patchChannel**](ChannelsApi.md#patchChannel) | **PUT** /channels/{channel_id}/patch | Patch a channel |
| [**patchChannelModerations**](ChannelsApi.md#patchChannelModerations) | **PUT** /channels/{channel_id}/moderations/patch | Update a channel&#39;s moderation settings. |
| [**removeSidebarCategoryForTeamForUser**](ChannelsApi.md#removeSidebarCategoryForTeamForUser) | **DELETE** /users/{user_id}/teams/{team_id}/channels/categories/{category_id} | Delete sidebar category |
| [**removeUserFromChannel**](ChannelsApi.md#removeUserFromChannel) | **DELETE** /channels/{channel_id}/members/{user_id} | Remove user from channel |
| [**restoreChannel**](ChannelsApi.md#restoreChannel) | **POST** /channels/{channel_id}/restore | Restore a channel |
| [**searchAllChannels**](ChannelsApi.md#searchAllChannels) | **POST** /channels/search | Search all private and open type channels |
| [**searchArchivedChannels**](ChannelsApi.md#searchArchivedChannels) | **POST** /teams/{team_id}/channels/search_archived | Search archived channels |
| [**searchChannels**](ChannelsApi.md#searchChannels) | **POST** /teams/{team_id}/channels/search | Search channels |
| [**searchGroupChannels**](ChannelsApi.md#searchGroupChannels) | **POST** /channels/group/search | Search Group Channels |
| [**updateChannel**](ChannelsApi.md#updateChannel) | **PUT** /channels/{channel_id} | Update a channel |
| [**updateChannelMemberSchemeRoles**](ChannelsApi.md#updateChannelMemberSchemeRoles) | **PUT** /channels/{channel_id}/members/{user_id}/schemeRoles | Update the scheme-derived roles of a channel member. |
| [**updateChannelNotifyProps**](ChannelsApi.md#updateChannelNotifyProps) | **PUT** /channels/{channel_id}/members/{user_id}/notify_props | Update channel notifications |
| [**updateChannelPrivacy**](ChannelsApi.md#updateChannelPrivacy) | **PUT** /channels/{channel_id}/privacy | Update channel&#39;s privacy |
| [**updateChannelRoles**](ChannelsApi.md#updateChannelRoles) | **PUT** /channels/{channel_id}/members/{user_id}/roles | Update channel roles |
| [**updateChannelScheme**](ChannelsApi.md#updateChannelScheme) | **PUT** /channels/{channel_id}/scheme | Set a channel&#39;s scheme |
| [**updateSidebarCategoriesForTeamForUser**](ChannelsApi.md#updateSidebarCategoriesForTeamForUser) | **PUT** /users/{user_id}/teams/{team_id}/channels/categories | Update user&#39;s sidebar categories |
| [**updateSidebarCategoryForTeamForUser**](ChannelsApi.md#updateSidebarCategoryForTeamForUser) | **PUT** /users/{user_id}/teams/{team_id}/channels/categories/{category_id} | Update sidebar category |
| [**updateSidebarCategoryOrderForTeamForUser**](ChannelsApi.md#updateSidebarCategoryOrderForTeamForUser) | **PUT** /users/{user_id}/teams/{team_id}/channels/categories/order | Update user&#39;s sidebar category order |
| [**viewChannel**](ChannelsApi.md#viewChannel) | **POST** /channels/members/{user_id}/view | View channel |



## addChannelMember

> ChannelMember addChannelMember(channelId, addChannelMemberRequest)

Add user to channel

Add a user to a channel by creating a channel member object.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | The channel ID
        AddChannelMemberRequest addChannelMemberRequest = new AddChannelMemberRequest(); // AddChannelMemberRequest | 
        try {
            ChannelMember result = apiInstance.addChannelMember(channelId, addChannelMemberRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#addChannelMember");
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
| **channelId** | **String**| The channel ID | |
| **addChannelMemberRequest** | [**AddChannelMemberRequest**](AddChannelMemberRequest.md)|  | |

### Return type

[**ChannelMember**](ChannelMember.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Channel member creation successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## autocompleteChannelsForTeam

> List&lt;Channel&gt; autocompleteChannelsForTeam(teamId, name)

Autocomplete channels

Autocomplete public channels on a team based on the search term provided in the request URL.  ##### Permissions Must have the &#x60;list_team_channels&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        String name = "name_example"; // String | Name or display name
        try {
            List<Channel> result = apiInstance.autocompleteChannelsForTeam(teamId, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#autocompleteChannelsForTeam");
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
| **name** | **String**| Name or display name | |

### Return type

[**List&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channels autocomplete successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## autocompleteChannelsForTeamForSearch

> List&lt;Channel&gt; autocompleteChannelsForTeamForSearch(teamId, name)

Autocomplete channels for search

Autocomplete your channels on a team based on the search term provided in the request URL.  ##### Permissions Must have the &#x60;list_team_channels&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        String name = "name_example"; // String | Name or display name
        try {
            List<Channel> result = apiInstance.autocompleteChannelsForTeamForSearch(teamId, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#autocompleteChannelsForTeamForSearch");
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
| **name** | **String**| Name or display name | |

### Return type

[**List&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channels autocomplete successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## createChannel

> Channel createChannel(createChannelRequest)

Create a channel

Create a new channel. ##### Permissions If creating a public channel, &#x60;create_public_channel&#x60; permission is required. If creating a private channel, &#x60;create_private_channel&#x60; permission is required. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        CreateChannelRequest createChannelRequest = new CreateChannelRequest(); // CreateChannelRequest | Channel object to be created
        try {
            Channel result = apiInstance.createChannel(createChannelRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#createChannel");
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
| **createChannelRequest** | [**CreateChannelRequest**](CreateChannelRequest.md)| Channel object to be created | |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Channel creation successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## createDirectChannel

> Channel createDirectChannel(requestBody)

Create a direct message channel

Create a new direct message channel between two users. ##### Permissions Must be one of the two users and have &#x60;create_direct_channel&#x60; permission. Having the &#x60;manage_system&#x60; permission voids the previous requirements. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        List<String> requestBody = Arrays.asList(); // List<String> | The two user ids to be in the direct message
        try {
            Channel result = apiInstance.createDirectChannel(requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#createDirectChannel");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| The two user ids to be in the direct message | |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Direct channel creation successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## createGroupChannel

> Channel createGroupChannel(requestBody)

Create a group message channel

Create a new group message channel to group of users. If the logged in user&#39;s id is not included in the list, it will be appended to the end. ##### Permissions Must have &#x60;create_group_channel&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        List<String> requestBody = Arrays.asList(); // List<String> | User ids to be in the group message channel
        try {
            Channel result = apiInstance.createGroupChannel(requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#createGroupChannel");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| User ids to be in the group message channel | |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Group channel creation successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## createSidebarCategoryForTeamForUser

> SidebarCategory createSidebarCategoryForTeamForUser(teamId, userId, sidebarCategory)

Create user&#39;s sidebar category

Create a custom sidebar category for the user on the given team. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        String userId = "userId_example"; // String | User GUID
        SidebarCategory sidebarCategory = new SidebarCategory(); // SidebarCategory | 
        try {
            SidebarCategory result = apiInstance.createSidebarCategoryForTeamForUser(teamId, userId, sidebarCategory);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#createSidebarCategoryForTeamForUser");
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
| **userId** | **String**| User GUID | |
| **sidebarCategory** | [**SidebarCategory**](SidebarCategory.md)|  | |

### Return type

[**SidebarCategory**](SidebarCategory.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Category creation successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## deleteChannel

> StatusOK deleteChannel(channelId)

Delete a channel

Archives a channel. This will set the &#x60;deleteAt&#x60; to the current timestamp in the database. Soft deleted channels may not be accessible in the user interface. They can be viewed and unarchived in the **System Console &gt; User Management &gt; Channels** based on your license. Direct and group message channels cannot be deleted.  ##### Permissions &#x60;delete_public_channel&#x60; permission if the channel is public, &#x60;delete_private_channel&#x60; permission if the channel is private, or have &#x60;manage_system&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | Channel GUID
        try {
            StatusOK result = apiInstance.deleteChannel(channelId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#deleteChannel");
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
| **channelId** | **String**| Channel GUID | |

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
| **200** | Channel deletion successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getAllChannels

> List&lt;ChannelWithTeamData&gt; getAllChannels(notAssociatedToGroup, page, perPage, excludeDefaultChannels, includeDeleted, includeTotalCount, excludePolicyConstrained)

Get a list of all channels

##### Permissions &#x60;manage_system&#x60; 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String notAssociatedToGroup = "notAssociatedToGroup_example"; // String | A group id to exclude channels that are associated with that group via GroupChannel records. This can also be left blank with `not_associated_to_group=`.
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 0; // Integer | The number of channels per page.
        Boolean excludeDefaultChannels = false; // Boolean | Whether to exclude default channels (ex Town Square, Off-Topic) from the results.
        Boolean includeDeleted = false; // Boolean | Include channels that have been archived. This correlates to the `DeleteAt` flag being set in the database.
        Boolean includeTotalCount = false; // Boolean | Appends a total count of returned channels inside the response object - ex: `{ \"channels\": [], \"total_count\" : 0 }`.      
        Boolean excludePolicyConstrained = false; // Boolean | If set to true, channels which are part of a data retention policy will be excluded. The `sysconsole_read_compliance` permission is required to use this parameter. 
        try {
            List<ChannelWithTeamData> result = apiInstance.getAllChannels(notAssociatedToGroup, page, perPage, excludeDefaultChannels, includeDeleted, includeTotalCount, excludePolicyConstrained);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getAllChannels");
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
| **notAssociatedToGroup** | **String**| A group id to exclude channels that are associated with that group via GroupChannel records. This can also be left blank with &#x60;not_associated_to_group&#x3D;&#x60;. | [optional] |
| **page** | **Integer**| The page to select. | [optional] [default to 0] |
| **perPage** | **Integer**| The number of channels per page. | [optional] [default to 0] |
| **excludeDefaultChannels** | **Boolean**| Whether to exclude default channels (ex Town Square, Off-Topic) from the results. | [optional] [default to false] |
| **includeDeleted** | **Boolean**| Include channels that have been archived. This correlates to the &#x60;DeleteAt&#x60; flag being set in the database. | [optional] [default to false] |
| **includeTotalCount** | **Boolean**| Appends a total count of returned channels inside the response object - ex: &#x60;{ \&quot;channels\&quot;: [], \&quot;total_count\&quot; : 0 }&#x60;.       | [optional] [default to false] |
| **excludePolicyConstrained** | **Boolean**| If set to true, channels which are part of a data retention policy will be excluded. The &#x60;sysconsole_read_compliance&#x60; permission is required to use this parameter.  | [optional] [default to false] |

### Return type

[**List&lt;ChannelWithTeamData&gt;**](ChannelWithTeamData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## getChannel

> Channel getChannel(channelId)

Get a channel

Get channel from the provided channel id string. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | Channel GUID
        try {
            Channel result = apiInstance.getChannel(channelId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getChannel");
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
| **channelId** | **String**| Channel GUID | |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel retrieval successful |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getChannelByName

> Channel getChannelByName(teamId, channelName, includeDeleted)

Get a channel by name

Gets channel from the provided team id and channel name strings. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        String channelName = "channelName_example"; // String | Channel Name
        Boolean includeDeleted = false; // Boolean | Defines if deleted channels should be returned or not (Mattermost Server 5.26.0+)
        try {
            Channel result = apiInstance.getChannelByName(teamId, channelName, includeDeleted);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getChannelByName");
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
| **channelName** | **String**| Channel Name | |
| **includeDeleted** | **Boolean**| Defines if deleted channels should be returned or not (Mattermost Server 5.26.0+) | [optional] [default to false] |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel retrieval successful |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getChannelByNameForTeamName

> Channel getChannelByNameForTeamName(teamName, channelName, includeDeleted)

Get a channel by name and team name

Gets a channel from the provided team name and channel name strings. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String teamName = "teamName_example"; // String | Team Name
        String channelName = "channelName_example"; // String | Channel Name
        Boolean includeDeleted = false; // Boolean | Defines if deleted channels should be returned or not (Mattermost Server 5.26.0+)
        try {
            Channel result = apiInstance.getChannelByNameForTeamName(teamName, channelName, includeDeleted);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getChannelByNameForTeamName");
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
| **teamName** | **String**| Team Name | |
| **channelName** | **String**| Channel Name | |
| **includeDeleted** | **Boolean**| Defines if deleted channels should be returned or not (Mattermost Server 5.26.0+) | [optional] [default to false] |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel retrieval successful |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getChannelMember

> ChannelMember getChannelMember(channelId, userId)

Get channel member

Get a channel member. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | Channel GUID
        String userId = "userId_example"; // String | User GUID
        try {
            ChannelMember result = apiInstance.getChannelMember(channelId, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getChannelMember");
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
| **channelId** | **String**| Channel GUID | |
| **userId** | **String**| User GUID | |

### Return type

[**ChannelMember**](ChannelMember.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel member retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getChannelMembers

> List&lt;ChannelMember&gt; getChannelMembers(channelId, page, perPage)

Get channel members

Get a page of members for a channel. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | Channel GUID
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of members per page. There is a maximum limit of 200 members.
        try {
            List<ChannelMember> result = apiInstance.getChannelMembers(channelId, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getChannelMembers");
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
| **channelId** | **String**| Channel GUID | |
| **page** | **Integer**| The page to select. | [optional] [default to 0] |
| **perPage** | **Integer**| The number of members per page. There is a maximum limit of 200 members. | [optional] [default to 60] |

### Return type

[**List&lt;ChannelMember&gt;**](ChannelMember.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel members retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getChannelMembersByIds

> List&lt;ChannelMember&gt; getChannelMembersByIds(channelId, requestBody)

Get channel members by ids

Get a list of channel members based on the provided user ids. ##### Permissions Must have the &#x60;read_channel&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | Channel GUID
        List<String> requestBody = Arrays.asList(); // List<String> | List of user ids
        try {
            List<ChannelMember> result = apiInstance.getChannelMembersByIds(channelId, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getChannelMembersByIds");
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
| **channelId** | **String**| Channel GUID | |
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of user ids | |

### Return type

[**List&lt;ChannelMember&gt;**](ChannelMember.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel member list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getChannelMembersForUser

> List&lt;ChannelMember&gt; getChannelMembersForUser(userId, teamId)

Get channel memberships and roles for a user

Get all channel memberships and associated membership roles (i.e. &#x60;channel_user&#x60;, &#x60;channel_admin&#x60;) for a user on a specific team. ##### Permissions Logged in as the user and &#x60;view_team&#x60; permission for the team. Having &#x60;manage_system&#x60; permission voids the previous requirements. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String userId = "userId_example"; // String | User GUID
        String teamId = "teamId_example"; // String | Team GUID
        try {
            List<ChannelMember> result = apiInstance.getChannelMembersForUser(userId, teamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getChannelMembersForUser");
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
| **teamId** | **String**| Team GUID | |

### Return type

[**List&lt;ChannelMember&gt;**](ChannelMember.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel members retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getChannelModerations

> List&lt;ChannelModeration&gt; getChannelModerations(channelId)

Get information about channel&#39;s moderation.

##### Permissions Must have &#x60;manage_system&#x60; permission.  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | Channel GUID
        try {
            List<ChannelModeration> result = apiInstance.getChannelModerations(channelId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getChannelModerations");
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
| **channelId** | **String**| Channel GUID | |

### Return type

[**List&lt;ChannelModeration&gt;**](ChannelModeration.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retreived successfully |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getChannelStats

> ChannelStats getChannelStats(channelId)

Get channel statistics

Get statistics for a channel. ##### Permissions Must have the &#x60;read_channel&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | Channel GUID
        try {
            ChannelStats result = apiInstance.getChannelStats(channelId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getChannelStats");
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
| **channelId** | **String**| Channel GUID | |

### Return type

[**ChannelStats**](ChannelStats.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel statistics retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getChannelUnread

> ChannelUnread getChannelUnread(userId, channelId)

Get unread messages

Get the total unread messages and mentions for a channel for a user. ##### Permissions Must be logged in as user and have the &#x60;read_channel&#x60; permission, or have &#x60;edit_other_usrs&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String userId = "userId_example"; // String | User GUID
        String channelId = "channelId_example"; // String | Channel GUID
        try {
            ChannelUnread result = apiInstance.getChannelUnread(userId, channelId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getChannelUnread");
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
| **channelId** | **String**| Channel GUID | |

### Return type

[**ChannelUnread**](ChannelUnread.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel unreads retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getChannelsForTeamForUser

> List&lt;Channel&gt; getChannelsForTeamForUser(userId, teamId, includeDeleted, lastDeleteAt)

Get channels for user

Get all the channels on a team for a user. ##### Permissions Logged in as the user, or have &#x60;edit_other_users&#x60; permission, and &#x60;view_team&#x60; permission for the team. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String userId = "userId_example"; // String | User GUID
        String teamId = "teamId_example"; // String | Team GUID
        Boolean includeDeleted = false; // Boolean | Defines if deleted channels should be returned or not
        Integer lastDeleteAt = 0; // Integer | Filters the deleted channels by this time in epoch format. Does not have any effect if include_deleted is set to false.
        try {
            List<Channel> result = apiInstance.getChannelsForTeamForUser(userId, teamId, includeDeleted, lastDeleteAt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getChannelsForTeamForUser");
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
| **teamId** | **String**| Team GUID | |
| **includeDeleted** | **Boolean**| Defines if deleted channels should be returned or not | [optional] [default to false] |
| **lastDeleteAt** | **Integer**| Filters the deleted channels by this time in epoch format. Does not have any effect if include_deleted is set to false. | [optional] [default to 0] |

### Return type

[**List&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channels retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getChannelsForUser

> List&lt;Channel&gt; getChannelsForUser(userId, lastDeleteAt, includeDeleted)

Get all channels

Get all channels that a user is a member of.  ##### Permissions  Logged in as the user, or have &#x60;edit_other_users&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user. This can also be \"me\" which will point to the current user.
        Integer lastDeleteAt = 0; // Integer | Filters the deleted channels by this time in epoch format. Does not have any effect if include_deleted is set to false.
        Boolean includeDeleted = false; // Boolean | Defines if deleted channels should be returned or not
        try {
            List<Channel> result = apiInstance.getChannelsForUser(userId, lastDeleteAt, includeDeleted);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getChannelsForUser");
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
| **userId** | **String**| The ID of the user. This can also be \&quot;me\&quot; which will point to the current user. | |
| **lastDeleteAt** | **Integer**| Filters the deleted channels by this time in epoch format. Does not have any effect if include_deleted is set to false. | [optional] [default to 0] |
| **includeDeleted** | **Boolean**| Defines if deleted channels should be returned or not | [optional] [default to false] |

### Return type

[**List&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channels retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getDeletedChannelsForTeam

> List&lt;Channel&gt; getDeletedChannelsForTeam(teamId, page, perPage)

Get deleted channels

Get a page of deleted channels on a team based on query string parameters - team_id, page and per_page.  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of public channels per page.
        try {
            List<Channel> result = apiInstance.getDeletedChannelsForTeam(teamId, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getDeletedChannelsForTeam");
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
| **page** | **Integer**| The page to select. | [optional] [default to 0] |
| **perPage** | **Integer**| The number of public channels per page. | [optional] [default to 60] |

### Return type

[**List&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channels retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getPinnedPosts

> PostList getPinnedPosts(channelId)

Get a channel&#39;s pinned posts

Get a list of pinned posts for channel.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | Channel GUID
        try {
            PostList result = apiInstance.getPinnedPosts(channelId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getPinnedPosts");
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
| **channelId** | **String**| Channel GUID | |

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
| **200** | The list of channel pinned posts |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getPrivateChannelsForTeam

> List&lt;Channel&gt; getPrivateChannelsForTeam(teamId, page, perPage)

Get private channels

Get a page of private channels on a team based on query string parameters - team_id, page and per_page.   ##### Permissions Must have &#x60;manage_system&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of private channels per page.
        try {
            List<Channel> result = apiInstance.getPrivateChannelsForTeam(teamId, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getPrivateChannelsForTeam");
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
| **page** | **Integer**| The page to select. | [optional] [default to 0] |
| **perPage** | **Integer**| The number of private channels per page. | [optional] [default to 60] |

### Return type

[**List&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channels retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getPublicChannelsByIdsForTeam

> List&lt;Channel&gt; getPublicChannelsByIdsForTeam(teamId, requestBody)

Get a list of channels by ids

Get a list of public channels on a team by id. ##### Permissions &#x60;view_team&#x60; for the team the channels are on. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        List<String> requestBody = Arrays.asList(); // List<String> | List of channel ids
        try {
            List<Channel> result = apiInstance.getPublicChannelsByIdsForTeam(teamId, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getPublicChannelsByIdsForTeam");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of channel ids | |

### Return type

[**List&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## getPublicChannelsForTeam

> List&lt;Channel&gt; getPublicChannelsForTeam(teamId, page, perPage)

Get public channels

Get a page of public channels on a team based on query string parameters - page and per_page. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of public channels per page.
        try {
            List<Channel> result = apiInstance.getPublicChannelsForTeam(teamId, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getPublicChannelsForTeam");
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
| **page** | **Integer**| The page to select. | [optional] [default to 0] |
| **perPage** | **Integer**| The number of public channels per page. | [optional] [default to 60] |

### Return type

[**List&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channels retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getSidebarCategoriesForTeamForUser

> List&lt;OrderedSidebarCategories&gt; getSidebarCategoriesForTeamForUser(teamId, userId)

Get user&#39;s sidebar categories

Get a list of sidebar categories that will appear in the user&#39;s sidebar on the given team, including a list of channel IDs in each category. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        String userId = "userId_example"; // String | User GUID
        try {
            List<OrderedSidebarCategories> result = apiInstance.getSidebarCategoriesForTeamForUser(teamId, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getSidebarCategoriesForTeamForUser");
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
| **userId** | **String**| User GUID | |

### Return type

[**List&lt;OrderedSidebarCategories&gt;**](OrderedSidebarCategories.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Category retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getSidebarCategoryForTeamForUser

> SidebarCategory getSidebarCategoryForTeamForUser(teamId, userId, categoryId)

Get sidebar category

Returns a single sidebar category for the user on the given team. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        String userId = "userId_example"; // String | User GUID
        String categoryId = "categoryId_example"; // String | Category GUID
        try {
            SidebarCategory result = apiInstance.getSidebarCategoryForTeamForUser(teamId, userId, categoryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getSidebarCategoryForTeamForUser");
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
| **userId** | **String**| User GUID | |
| **categoryId** | **String**| Category GUID | |

### Return type

[**SidebarCategory**](SidebarCategory.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Category retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getSidebarCategoryOrderForTeamForUser

> List&lt;String&gt; getSidebarCategoryOrderForTeamForUser(teamId, userId)

Get user&#39;s sidebar category order

Returns the order of the sidebar categories for a user on the given team as an array of IDs. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        String userId = "userId_example"; // String | User GUID
        try {
            List<String> result = apiInstance.getSidebarCategoryOrderForTeamForUser(teamId, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getSidebarCategoryOrderForTeamForUser");
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
| **userId** | **String**| User GUID | |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## moveChannel

> Channel moveChannel(channelId, moveChannelRequest)

Move a channel

Move a channel to another team.   ##### Permissions  Must have &#x60;manage_system&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | Channel GUID
        MoveChannelRequest moveChannelRequest = new MoveChannelRequest(); // MoveChannelRequest | 
        try {
            Channel result = apiInstance.moveChannel(channelId, moveChannelRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#moveChannel");
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
| **channelId** | **String**| Channel GUID | |
| **moveChannelRequest** | [**MoveChannelRequest**](MoveChannelRequest.md)|  | |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel move successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## patchChannel

> Channel patchChannel(channelId, patchChannelRequest)

Patch a channel

Partially update a channel by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions If updating a public channel, &#x60;manage_public_channel_members&#x60; permission is required. If updating a private channel, &#x60;manage_private_channel_members&#x60; permission is required. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | Channel GUID
        PatchChannelRequest patchChannelRequest = new PatchChannelRequest(); // PatchChannelRequest | Channel object to be updated
        try {
            Channel result = apiInstance.patchChannel(channelId, patchChannelRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#patchChannel");
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
| **channelId** | **String**| Channel GUID | |
| **patchChannelRequest** | [**PatchChannelRequest**](PatchChannelRequest.md)| Channel object to be updated | |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel patch successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## patchChannelModerations

> List&lt;ChannelModeration&gt; patchChannelModerations(channelId, channelModerationPatch)

Update a channel&#39;s moderation settings.

##### Permissions Must have &#x60;manage_system&#x60; permission.  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | Channel GUID
        ChannelModerationPatch channelModerationPatch = new ChannelModerationPatch(); // ChannelModerationPatch | 
        try {
            List<ChannelModeration> result = apiInstance.patchChannelModerations(channelId, channelModerationPatch);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#patchChannelModerations");
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
| **channelId** | **String**| Channel GUID | |
| **channelModerationPatch** | [**ChannelModerationPatch**](ChannelModerationPatch.md)|  | |

### Return type

[**List&lt;ChannelModeration&gt;**](ChannelModeration.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Patched successfully |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## removeSidebarCategoryForTeamForUser

> SidebarCategory removeSidebarCategoryForTeamForUser(teamId, userId, categoryId)

Delete sidebar category

Deletes a single sidebar category for the user on the given team. Only custom categories can be deleted. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        String userId = "userId_example"; // String | User GUID
        String categoryId = "categoryId_example"; // String | Category GUID
        try {
            SidebarCategory result = apiInstance.removeSidebarCategoryForTeamForUser(teamId, userId, categoryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#removeSidebarCategoryForTeamForUser");
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
| **userId** | **String**| User GUID | |
| **categoryId** | **String**| Category GUID | |

### Return type

[**SidebarCategory**](SidebarCategory.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Category delete successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## removeUserFromChannel

> StatusOK removeUserFromChannel(channelId, userId)

Remove user from channel

Delete a channel member, effectively removing them from a channel.  Channel members can only be deleted from public or private channels. ##### Permissions &#x60;manage_public_channel_members&#x60; permission if the channel is public. &#x60;manage_private_channel_members&#x60; permission if the channel is private. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | Channel GUID
        String userId = "userId_example"; // String | User GUID
        try {
            StatusOK result = apiInstance.removeUserFromChannel(channelId, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#removeUserFromChannel");
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
| **channelId** | **String**| Channel GUID | |
| **userId** | **String**| User GUID | |

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
| **200** | Channel member deletion successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## restoreChannel

> Channel restoreChannel(channelId)

Restore a channel

Restore channel from the provided channel id string.  ##### Permissions &#x60;manage_team&#x60; permission for the team of the channel. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | Channel GUID
        try {
            Channel result = apiInstance.restoreChannel(channelId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#restoreChannel");
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
| **channelId** | **String**| Channel GUID | |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel restore successful |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## searchAllChannels

> SearchAllChannels200Response searchAllChannels(searchAllChannelsRequest, systemConsole)

Search all private and open type channels

Returns all private and open type channels where &#39;term&#39; matches on the name, display name, or purpose of the channel.  Configured &#39;default&#39; channels (ex Town Square and Off-Topic) can be excluded from the results with the &#x60;exclude_default_channels&#x60; boolean parameter.  Channels that are associated (via GroupChannel records) to a given group can be excluded from the results with the &#x60;not_associated_to_group&#x60; parameter and a group id string. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        SearchAllChannelsRequest searchAllChannelsRequest = new SearchAllChannelsRequest(); // SearchAllChannelsRequest | The search terms and logic to use in the search.
        Boolean systemConsole = true; // Boolean | Is the request from system_console. If this is set to true, it filters channels by the logged in user. 
        try {
            SearchAllChannels200Response result = apiInstance.searchAllChannels(searchAllChannelsRequest, systemConsole);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#searchAllChannels");
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
| **searchAllChannelsRequest** | [**SearchAllChannelsRequest**](SearchAllChannelsRequest.md)| The search terms and logic to use in the search. | |
| **systemConsole** | **Boolean**| Is the request from system_console. If this is set to true, it filters channels by the logged in user.  | [optional] [default to true] |

### Return type

[**SearchAllChannels200Response**](SearchAllChannels200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated channel response. (Note that the non-paginated response—returned if the request body does not contain both &#x60;page&#x60; and &#x60;per_page&#x60; fields—is a simple array of channels.) |  -  |
| **400** |  |  -  |
| **401** |  |  -  |


## searchArchivedChannels

> List&lt;Channel&gt; searchArchivedChannels(teamId, searchArchivedChannelsRequest)

Search archived channels

Search archived channels on a team based on the search term provided in the request body.  ##### Permissions Must have the &#x60;list_team_channels&#x60; permission.  A user without the &#x60;list_team_channels&#x60; permission will be able to use this endpoint, with the search results limited to the channels that the user is a member of. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        SearchArchivedChannelsRequest searchArchivedChannelsRequest = new SearchArchivedChannelsRequest(); // SearchArchivedChannelsRequest | Search criteria
        try {
            List<Channel> result = apiInstance.searchArchivedChannels(teamId, searchArchivedChannelsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#searchArchivedChannels");
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
| **searchArchivedChannelsRequest** | [**SearchArchivedChannelsRequest**](SearchArchivedChannelsRequest.md)| Search criteria | |

### Return type

[**List&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Channels search successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## searchChannels

> List&lt;Channel&gt; searchChannels(teamId, searchChannelsRequest)

Search channels

Search public channels on a team based on the search term provided in the request body. ##### Permissions Must have the &#x60;list_team_channels&#x60; permission.  A user without the &#x60;list_team_channels&#x60; permission will be able to use this endpoint, with the search results limited to the channels that the user is a member of. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        SearchChannelsRequest searchChannelsRequest = new SearchChannelsRequest(); // SearchChannelsRequest | Search criteria
        try {
            List<Channel> result = apiInstance.searchChannels(teamId, searchChannelsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#searchChannels");
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
| **searchChannelsRequest** | [**SearchChannelsRequest**](SearchChannelsRequest.md)| Search criteria | |

### Return type

[**List&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Channels search successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## searchGroupChannels

> List&lt;Channel&gt; searchGroupChannels(searchGroupChannelsRequest)

Search Group Channels

Get a list of group channels for a user which members&#39; usernames match the search term.  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        SearchGroupChannelsRequest searchGroupChannelsRequest = new SearchGroupChannelsRequest(); // SearchGroupChannelsRequest | Search criteria
        try {
            List<Channel> result = apiInstance.searchGroupChannels(searchGroupChannelsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#searchGroupChannels");
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
| **searchGroupChannelsRequest** | [**SearchGroupChannelsRequest**](SearchGroupChannelsRequest.md)| Search criteria | |

### Return type

[**List&lt;Channel&gt;**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channels search successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |


## updateChannel

> Channel updateChannel(channelId, updateChannelRequest)

Update a channel

Update a channel. The fields that can be updated are listed as parameters. Omitted fields will be treated as blanks. ##### Permissions If updating a public channel, &#x60;manage_public_channel_members&#x60; permission is required. If updating a private channel, &#x60;manage_private_channel_members&#x60; permission is required. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | Channel GUID
        UpdateChannelRequest updateChannelRequest = new UpdateChannelRequest(); // UpdateChannelRequest | Channel object to be updated
        try {
            Channel result = apiInstance.updateChannel(channelId, updateChannelRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#updateChannel");
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
| **channelId** | **String**| Channel GUID | |
| **updateChannelRequest** | [**UpdateChannelRequest**](UpdateChannelRequest.md)| Channel object to be updated | |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel update successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## updateChannelMemberSchemeRoles

> StatusOK updateChannelMemberSchemeRoles(channelId, userId, updateChannelMemberSchemeRolesRequest)

Update the scheme-derived roles of a channel member.

Update a channel member&#39;s scheme_admin/scheme_user properties. Typically this should either be &#x60;scheme_admin&#x3D;false, scheme_user&#x3D;true&#x60; for ordinary channel member, or &#x60;scheme_admin&#x3D;true, scheme_user&#x3D;true&#x60; for a channel admin. ##### Permissions Must be authenticated and have the &#x60;manage_channel_roles&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | Channel GUID
        String userId = "userId_example"; // String | User GUID
        UpdateChannelMemberSchemeRolesRequest updateChannelMemberSchemeRolesRequest = new UpdateChannelMemberSchemeRolesRequest(); // UpdateChannelMemberSchemeRolesRequest | Scheme properties.
        try {
            StatusOK result = apiInstance.updateChannelMemberSchemeRoles(channelId, userId, updateChannelMemberSchemeRolesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#updateChannelMemberSchemeRoles");
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
| **channelId** | **String**| Channel GUID | |
| **userId** | **String**| User GUID | |
| **updateChannelMemberSchemeRolesRequest** | [**UpdateChannelMemberSchemeRolesRequest**](UpdateChannelMemberSchemeRolesRequest.md)| Scheme properties. | |

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
| **200** | Channel member&#39;s scheme-derived roles updated successfully. |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## updateChannelNotifyProps

> StatusOK updateChannelNotifyProps(channelId, userId, channelNotifyProps)

Update channel notifications

Update a user&#39;s notification properties for a channel. Only the provided fields are updated. ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | Channel GUID
        String userId = "userId_example"; // String | User GUID
        ChannelNotifyProps channelNotifyProps = new ChannelNotifyProps(); // ChannelNotifyProps | 
        try {
            StatusOK result = apiInstance.updateChannelNotifyProps(channelId, userId, channelNotifyProps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#updateChannelNotifyProps");
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
| **channelId** | **String**| Channel GUID | |
| **userId** | **String**| User GUID | |
| **channelNotifyProps** | [**ChannelNotifyProps**](ChannelNotifyProps.md)|  | |

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
| **200** | Channel notification properties update successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## updateChannelPrivacy

> Channel updateChannelPrivacy(channelId, updateChannelPrivacyRequest)

Update channel&#39;s privacy

Updates channel&#39;s privacy allowing changing a channel from Public to Private and back.  ##### Permissions &#x60;convert_public_channel_to_private&#x60; permission for the channel if updating privacy to &#39;P&#39;. &#x60;convert_private_channel_to_public&#x60; permission for the channel if updating privacy to &#39;O&#39;. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | Channel GUID
        UpdateChannelPrivacyRequest updateChannelPrivacyRequest = new UpdateChannelPrivacyRequest(); // UpdateChannelPrivacyRequest | 
        try {
            Channel result = apiInstance.updateChannelPrivacy(channelId, updateChannelPrivacyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#updateChannelPrivacy");
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
| **channelId** | **String**| Channel GUID | |
| **updateChannelPrivacyRequest** | [**UpdateChannelPrivacyRequest**](UpdateChannelPrivacyRequest.md)|  | |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel conversion successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## updateChannelRoles

> StatusOK updateChannelRoles(channelId, userId, updateUserRolesRequest)

Update channel roles

Update a user&#39;s roles for a channel. ##### Permissions Must have &#x60;manage_channel_roles&#x60; permission for the channel. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | Channel GUID
        String userId = "userId_example"; // String | User GUID
        UpdateUserRolesRequest updateUserRolesRequest = new UpdateUserRolesRequest(); // UpdateUserRolesRequest | Space-delimited channel roles to assign to the user
        try {
            StatusOK result = apiInstance.updateChannelRoles(channelId, userId, updateUserRolesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#updateChannelRoles");
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
| **channelId** | **String**| Channel GUID | |
| **userId** | **String**| User GUID | |
| **updateUserRolesRequest** | [**UpdateUserRolesRequest**](UpdateUserRolesRequest.md)| Space-delimited channel roles to assign to the user | |

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
| **200** | Channel roles update successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## updateChannelScheme

> StatusOK updateChannelScheme(channelId, updateChannelSchemeRequest)

Set a channel&#39;s scheme

Set a channel&#39;s scheme, more specifically sets the scheme_id value of a channel record.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | Channel GUID
        UpdateChannelSchemeRequest updateChannelSchemeRequest = new UpdateChannelSchemeRequest(); // UpdateChannelSchemeRequest | Scheme GUID
        try {
            StatusOK result = apiInstance.updateChannelScheme(channelId, updateChannelSchemeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#updateChannelScheme");
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
| **channelId** | **String**| Channel GUID | |
| **updateChannelSchemeRequest** | [**UpdateChannelSchemeRequest**](UpdateChannelSchemeRequest.md)| Scheme GUID | |

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
| **200** | Update channel scheme successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **501** |  |  -  |


## updateSidebarCategoriesForTeamForUser

> SidebarCategory updateSidebarCategoriesForTeamForUser(teamId, userId, sidebarCategory)

Update user&#39;s sidebar categories

Update any number of sidebar categories for the user on the given team. This can be used to reorder the channels in these categories. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        String userId = "userId_example"; // String | User GUID
        List<SidebarCategory> sidebarCategory = Arrays.asList(); // List<SidebarCategory> | 
        try {
            SidebarCategory result = apiInstance.updateSidebarCategoriesForTeamForUser(teamId, userId, sidebarCategory);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#updateSidebarCategoriesForTeamForUser");
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
| **userId** | **String**| User GUID | |
| **sidebarCategory** | [**List&lt;SidebarCategory&gt;**](SidebarCategory.md)|  | |

### Return type

[**SidebarCategory**](SidebarCategory.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Category update successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## updateSidebarCategoryForTeamForUser

> SidebarCategory updateSidebarCategoryForTeamForUser(teamId, userId, categoryId, sidebarCategory)

Update sidebar category

Updates a single sidebar category for the user on the given team. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        String userId = "userId_example"; // String | User GUID
        String categoryId = "categoryId_example"; // String | Category GUID
        SidebarCategory sidebarCategory = new SidebarCategory(); // SidebarCategory | 
        try {
            SidebarCategory result = apiInstance.updateSidebarCategoryForTeamForUser(teamId, userId, categoryId, sidebarCategory);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#updateSidebarCategoryForTeamForUser");
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
| **userId** | **String**| User GUID | |
| **categoryId** | **String**| Category GUID | |
| **sidebarCategory** | [**SidebarCategory**](SidebarCategory.md)|  | |

### Return type

[**SidebarCategory**](SidebarCategory.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Category update successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## updateSidebarCategoryOrderForTeamForUser

> List&lt;String&gt; updateSidebarCategoryOrderForTeamForUser(teamId, userId, requestBody)

Update user&#39;s sidebar category order

Updates the order of the sidebar categories for a user on the given team. The provided array must include the IDs of all categories on the team. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        String userId = "userId_example"; // String | User GUID
        List<String> requestBody = Arrays.asList(); // List<String> | 
        try {
            List<String> result = apiInstance.updateSidebarCategoryOrderForTeamForUser(teamId, userId, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#updateSidebarCategoryOrderForTeamForUser");
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
| **userId** | **String**| User GUID | |
| **requestBody** | [**List&lt;String&gt;**](String.md)|  | |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order update successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## viewChannel

> ViewChannel200Response viewChannel(userId, viewChannelRequest)

View channel

Perform all the actions involved in viewing a channel. This includes marking channels as read, clearing push notifications, and updating the active channel. ##### Permissions Must be logged in as user or have &#x60;edit_other_users&#x60; permission.  __Response only includes &#x60;last_viewed_at_times&#x60; in Mattermost server 4.3 and newer.__ 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String userId = "userId_example"; // String | User ID to perform the view action for
        ViewChannelRequest viewChannelRequest = new ViewChannelRequest(); // ViewChannelRequest | Paremeters affecting how and which channels to view
        try {
            ViewChannel200Response result = apiInstance.viewChannel(userId, viewChannelRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#viewChannel");
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
| **userId** | **String**| User ID to perform the view action for | |
| **viewChannelRequest** | [**ViewChannelRequest**](ViewChannelRequest.md)| Paremeters affecting how and which channels to view | |

### Return type

[**ViewChannel200Response**](ViewChannel200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Channel view successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |

