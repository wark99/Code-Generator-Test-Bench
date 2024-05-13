# MiscellaneousApi

All URIs are relative to *https://ncp-iam.easygov.co.in/api-gateway/be*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApplicationVersion**](MiscellaneousApi.md#getApplicationVersion) | **GET** /version | Get Application Version |
| [**getNotifications**](MiscellaneousApi.md#getNotifications) | **GET** /api/v1/notifications | Get Notifications |



## getApplicationVersion

> GetApplicationVersion201Response getApplicationVersion()

Get Application Version

Retrieve the version of the application.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MiscellaneousApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        MiscellaneousApi apiInstance = new MiscellaneousApi(defaultClient);
        try {
            GetApplicationVersion201Response result = apiInstance.getApplicationVersion();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MiscellaneousApi#getApplicationVersion");
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

[**GetApplicationVersion201Response**](GetApplicationVersion201Response.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Application version retrieved successfully. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |


## getNotifications

> List&lt;NotificationList&gt; getNotifications(page, limit, sortBy, sortOrder)

Get Notifications

Retrieve a list of notifications with optional filtering and pagination.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MiscellaneousApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        MiscellaneousApi apiInstance = new MiscellaneousApi(defaultClient);
        Integer page = 56; // Integer | The page number for pagination. Default is 0.
        Integer limit = 56; // Integer | The maximum number of notifications to return. Default is 10.
        String sortBy = "createdOn"; // String | The field to sort notifications by. Default is \"createdOn\".
        String sortOrder = "asc"; // String | The sorting order. Default is \"desc\".
        try {
            List<NotificationList> result = apiInstance.getNotifications(page, limit, sortBy, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MiscellaneousApi#getNotifications");
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
| **page** | **Integer**| The page number for pagination. Default is 0. | [optional] |
| **limit** | **Integer**| The maximum number of notifications to return. Default is 10. | [optional] |
| **sortBy** | **String**| The field to sort notifications by. Default is \&quot;createdOn\&quot;. | [optional] [enum: createdOn] |
| **sortOrder** | **String**| The sorting order. Default is \&quot;desc\&quot;. | [optional] [enum: asc, desc] |

### Return type

[**List&lt;NotificationList&gt;**](NotificationList.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Notifications retrieved successfully. |  -  |
| **400** | Bad Request. Invalid input or validation error. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |

