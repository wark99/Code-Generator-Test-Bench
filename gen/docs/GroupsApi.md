# GroupsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGroups**](GroupsApi.md#getGroups) | **GET** /groups | Get groups |
| [**getGroupsAssociatedToChannelsByTeam**](GroupsApi.md#getGroupsAssociatedToChannelsByTeam) | **GET** /teams/{team_id}/groups_by_channels | Get team groups by channels |
| [**getGroupsByChannel**](GroupsApi.md#getGroupsByChannel) | **GET** /channels/{channel_id}/groups | Get channel groups |
| [**getGroupsByTeam**](GroupsApi.md#getGroupsByTeam) | **GET** /teams/{team_id}/groups | Get team groups |
| [**getGroupsByUserId**](GroupsApi.md#getGroupsByUserId) | **GET** /users/{user_id}/groups | Get groups for a userId |



## getGroups

> List&lt;Group&gt; getGroups(notAssociatedToTeam, notAssociatedToChannel, page, perPage, q, includeMemberCount, since, filterAllowReference)

Get groups

Retrieve a list of all groups not associated to a particular channel or team.  &#x60;not_associated_to_team&#x60; **OR** &#x60;not_associated_to_channel&#x60; is required.  If you use &#x60;not_associated_to_team&#x60;, you must be a team admin for that particular team (permission to manage that team).  If you use &#x60;not_associated_to_channel&#x60;, you must be a channel admin for that particular channel (permission to manage that channel).  n

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        String notAssociatedToTeam = "notAssociatedToTeam_example"; // String | Team GUID which is used to return all the groups not associated to this team
        String notAssociatedToChannel = "notAssociatedToChannel_example"; // String | Group GUID which is used to return all the groups not associated to this channel
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of groups per page.
        String q = "q_example"; // String | String to pattern match the `name` and `display_name` field. Will return all groups whose `name` and `display_name` field match any of the text.
        Boolean includeMemberCount = true; // Boolean | Boolean which adds the `member_count` attribute to each group JSON object
        Integer since = 56; // Integer | Only return groups that have been modified since the given Unix timestamp (in milliseconds). All modified groups, including deleted and created groups, will be returned. n
        Boolean filterAllowReference = false; // Boolean | Boolean which filters the group entries with the `allow_reference` attribute set.
        try {
            List<Group> result = apiInstance.getGroups(notAssociatedToTeam, notAssociatedToChannel, page, perPage, q, includeMemberCount, since, filterAllowReference);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#getGroups");
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
| **notAssociatedToTeam** | **String**| Team GUID which is used to return all the groups not associated to this team | |
| **notAssociatedToChannel** | **String**| Group GUID which is used to return all the groups not associated to this channel | |
| **page** | **Integer**| The page to select. | [optional] [default to 0] |
| **perPage** | **Integer**| The number of groups per page. | [optional] [default to 60] |
| **q** | **String**| String to pattern match the &#x60;name&#x60; and &#x60;display_name&#x60; field. Will return all groups whose &#x60;name&#x60; and &#x60;display_name&#x60; field match any of the text. | [optional] |
| **includeMemberCount** | **Boolean**| Boolean which adds the &#x60;member_count&#x60; attribute to each group JSON object | [optional] |
| **since** | **Integer**| Only return groups that have been modified since the given Unix timestamp (in milliseconds). All modified groups, including deleted and created groups, will be returned. n | [optional] |
| **filterAllowReference** | **Boolean**| Boolean which filters the group entries with the &#x60;allow_reference&#x60; attribute set. | [optional] [default to false] |

### Return type

[**List&lt;Group&gt;**](Group.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Group list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **501** |  |  -  |


## getGroupsAssociatedToChannelsByTeam

> Object getGroupsAssociatedToChannelsByTeam(teamId, page, perPage, filterAllowReference, paginate)

Get team groups by channels

Retrieve the set of groups associated with the channels in the given team grouped by channel.  ##### Permissions Must have &#x60;manage_system&#x60; permission or can access only for current user  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of groups per page.
        Boolean filterAllowReference = false; // Boolean | Boolean which filters in the group entries with the `allow_reference` attribute set.
        Boolean paginate = false; // Boolean | Boolean to determine whether the pagination should be applied or not
        try {
            Object result = apiInstance.getGroupsAssociatedToChannelsByTeam(teamId, page, perPage, filterAllowReference, paginate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#getGroupsAssociatedToChannelsByTeam");
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
| **perPage** | **Integer**| The number of groups per page. | [optional] [default to 60] |
| **filterAllowReference** | **Boolean**| Boolean which filters in the group entries with the &#x60;allow_reference&#x60; attribute set. | [optional] [default to false] |
| **paginate** | **Boolean**| Boolean to determine whether the pagination should be applied or not | [optional] [default to false] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Group list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **500** |  |  -  |
| **501** |  |  -  |


## getGroupsByChannel

> List&lt;Group&gt; getGroupsByChannel(channelId, page, perPage, filterAllowReference)

Get channel groups

Retrieve the list of groups associated with a given channel.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        String channelId = "channelId_example"; // String | Channel GUID
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of groups per page.
        Boolean filterAllowReference = false; // Boolean | Boolean which filters the group entries with the `allow_reference` attribute set.
        try {
            List<Group> result = apiInstance.getGroupsByChannel(channelId, page, perPage, filterAllowReference);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#getGroupsByChannel");
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
| **perPage** | **Integer**| The number of groups per page. | [optional] [default to 60] |
| **filterAllowReference** | **Boolean**| Boolean which filters the group entries with the &#x60;allow_reference&#x60; attribute set. | [optional] [default to false] |

### Return type

[**List&lt;Group&gt;**](Group.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Group list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **500** |  |  -  |
| **501** |  |  -  |


## getGroupsByTeam

> List&lt;Group&gt; getGroupsByTeam(teamId, page, perPage, filterAllowReference)

Get team groups

Retrieve the list of groups associated with a given team.  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of groups per page.
        Boolean filterAllowReference = false; // Boolean | Boolean which filters in the group entries with the `allow_reference` attribute set.
        try {
            List<Group> result = apiInstance.getGroupsByTeam(teamId, page, perPage, filterAllowReference);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#getGroupsByTeam");
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
| **perPage** | **Integer**| The number of groups per page. | [optional] [default to 60] |
| **filterAllowReference** | **Boolean**| Boolean which filters in the group entries with the &#x60;allow_reference&#x60; attribute set. | [optional] [default to false] |

### Return type

[**List&lt;Group&gt;**](Group.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Group list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **500** |  |  -  |
| **501** |  |  -  |


## getGroupsByUserId

> List&lt;Group&gt; getGroupsByUserId(userId)

Get groups for a userId

Retrieve the list of groups associated to the user  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        String userId = "userId_example"; // String | User GUID
        try {
            List<Group> result = apiInstance.getGroupsByUserId(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#getGroupsByUserId");
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

### Return type

[**List&lt;Group&gt;**](Group.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Group list retrieval successful |  -  |
| **400** |  |  -  |
| **501** |  |  -  |

