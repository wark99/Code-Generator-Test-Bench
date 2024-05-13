# MigrationApi

All URIs are relative to *https://cic-api.dev.nl*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**migrationSpecificNotifyPost**](MigrationApi.md#migrationSpecificNotifyPost) | **POST** /migration/specific/notify | Create a image record in classic CIC |
| [**migrationSpecificNotifyPost_0**](MigrationApi.md#migrationSpecificNotifyPost_0) | **POST** /migration/specific/notify | Create a image record in classic CIC |



## migrationSpecificNotifyPost

> List&lt;String&gt; migrationSpecificNotifyPost(migrationCreate)

Create a image record in classic CIC

Old images of the same image source will be hidden

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        MigrationApi apiInstance = new MigrationApi(defaultClient);
        MigrationCreate migrationCreate = new MigrationCreate(); // MigrationCreate | 
        try {
            List<String> result = apiInstance.migrationSpecificNotifyPost(migrationCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MigrationApi#migrationSpecificNotifyPost");
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
| **migrationCreate** | [**MigrationCreate**](MigrationCreate.md)|  | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **500** | Internal server error |  -  |


## migrationSpecificNotifyPost_0

> List&lt;String&gt; migrationSpecificNotifyPost_0(migrationCreate)

Create a image record in classic CIC

Old images of the same image source will be hidden

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MigrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        MigrationApi apiInstance = new MigrationApi(defaultClient);
        MigrationCreate migrationCreate = new MigrationCreate(); // MigrationCreate | 
        try {
            List<String> result = apiInstance.migrationSpecificNotifyPost_0(migrationCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MigrationApi#migrationSpecificNotifyPost_0");
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
| **migrationCreate** | [**MigrationCreate**](MigrationCreate.md)|  | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **500** | Internal server error |  -  |

