# OrganisersApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOrganiser**](OrganisersApi.md#getOrganiser) | **GET** /organisers/{organiserId} | Get an organiser |
| [**getOrganisers**](OrganisersApi.md#getOrganisers) | **GET** /organisers | List organisers |



## getOrganiser

> GetOrganiser200Response getOrganiser(organiserId)

Get an organiser

Retrieve the organiser.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganisersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");

        OrganisersApi apiInstance = new OrganisersApi(defaultClient);
        String organiserId = "organiserId_example"; // String | 
        try {
            GetOrganiser200Response result = apiInstance.getOrganiser(organiserId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganisersApi#getOrganiser");
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
| **organiserId** | **String**|  | |

### Return type

[**GetOrganiser200Response**](GetOrganiser200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an Organiser object. |  -  |
| **404** | Organiser not found. |  -  |


## getOrganisers

> GetOrganisers200Response getOrganisers(filterUser)

List organisers

Retrieve a list of organisers.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganisersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");

        OrganisersApi apiInstance = new OrganisersApi(defaultClient);
        Integer filterUser = 56; // Integer | ID of the user
        try {
            GetOrganisers200Response result = apiInstance.getOrganisers(filterUser);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganisersApi#getOrganisers");
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
| **filterUser** | **Integer**| ID of the user | [optional] |

### Return type

[**GetOrganisers200Response**](GetOrganisers200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of Organiser objects.  When the user filter is provided, the list contains only organisers the user is linked too. |  -  |

