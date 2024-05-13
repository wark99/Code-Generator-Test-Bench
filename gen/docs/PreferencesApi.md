# PreferencesApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePreferences**](PreferencesApi.md#deletePreferences) | **POST** /users/{user_id}/preferences/delete | Delete user&#39;s preferences |
| [**getPreferences**](PreferencesApi.md#getPreferences) | **GET** /users/{user_id}/preferences | Get the user&#39;s preferences |
| [**getPreferencesByCategory**](PreferencesApi.md#getPreferencesByCategory) | **GET** /users/{user_id}/preferences/{category} | List a user&#39;s preferences by category |
| [**getPreferencesByCategoryByName**](PreferencesApi.md#getPreferencesByCategoryByName) | **GET** /users/{user_id}/preferences/{category}/name/{preference_name} | Get a specific user preference |
| [**updatePreferences**](PreferencesApi.md#updatePreferences) | **PUT** /users/{user_id}/preferences | Save the user&#39;s preferences |



## deletePreferences

> StatusOK deletePreferences(userId, preference)

Delete user&#39;s preferences

Delete a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PreferencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PreferencesApi apiInstance = new PreferencesApi(defaultClient);
        String userId = "userId_example"; // String | User GUID
        List<Preference> preference = Arrays.asList(); // List<Preference> | List of preference objects
        try {
            StatusOK result = apiInstance.deletePreferences(userId, preference);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PreferencesApi#deletePreferences");
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
| **preference** | [**List&lt;Preference&gt;**](Preference.md)| List of preference objects | |

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
| **200** | User preferences saved successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getPreferences

> List&lt;Preference&gt; getPreferences(userId)

Get the user&#39;s preferences

Get a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PreferencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PreferencesApi apiInstance = new PreferencesApi(defaultClient);
        String userId = "userId_example"; // String | User GUID
        try {
            List<Preference> result = apiInstance.getPreferences(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PreferencesApi#getPreferences");
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

[**List&lt;Preference&gt;**](Preference.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User preferences retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getPreferencesByCategory

> List&lt;Preference&gt; getPreferencesByCategory(userId, category)

List a user&#39;s preferences by category

Lists the current user&#39;s stored preferences in the given category. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PreferencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PreferencesApi apiInstance = new PreferencesApi(defaultClient);
        String userId = "userId_example"; // String | User GUID
        String category = "category_example"; // String | The category of a group of preferences
        try {
            List<Preference> result = apiInstance.getPreferencesByCategory(userId, category);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PreferencesApi#getPreferencesByCategory");
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
| **category** | **String**| The category of a group of preferences | |

### Return type

[**List&lt;Preference&gt;**](Preference.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of all of the current user&#39;s preferences in the given category |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getPreferencesByCategoryByName

> Preference getPreferencesByCategoryByName(userId, category, preferenceName)

Get a specific user preference

Gets a single preference for the current user with the given category and name. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PreferencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PreferencesApi apiInstance = new PreferencesApi(defaultClient);
        String userId = "userId_example"; // String | User GUID
        String category = "category_example"; // String | The category of a group of preferences
        String preferenceName = "preferenceName_example"; // String | The name of the preference
        try {
            Preference result = apiInstance.getPreferencesByCategoryByName(userId, category, preferenceName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PreferencesApi#getPreferencesByCategoryByName");
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
| **category** | **String**| The category of a group of preferences | |
| **preferenceName** | **String**| The name of the preference | |

### Return type

[**Preference**](Preference.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A single preference for the current user in the current categorylist of all of the current user&#39;s preferences in the given category.  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |


## updatePreferences

> StatusOK updatePreferences(userId, preference)

Save the user&#39;s preferences

Save a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PreferencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        PreferencesApi apiInstance = new PreferencesApi(defaultClient);
        String userId = "userId_example"; // String | User GUID
        List<Preference> preference = Arrays.asList(); // List<Preference> | List of preference objects
        try {
            StatusOK result = apiInstance.updatePreferences(userId, preference);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PreferencesApi#updatePreferences");
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
| **preference** | [**List&lt;Preference&gt;**](Preference.md)| List of preference objects | |

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
| **200** | User preferences saved successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |

