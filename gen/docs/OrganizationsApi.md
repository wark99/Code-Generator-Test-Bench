# OrganizationsApi

All URIs are relative to *https://ptu.uexcorp.space/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOrganizationsByOrganization**](OrganizationsApi.md#getOrganizationsByOrganization) | **GET** /organizations/id_organization/{id_organization}/ | Retrieve a list of all organizations added to the UEX website |
| [**getOrganizationsBySlug**](OrganizationsApi.md#getOrganizationsBySlug) | **GET** /organizations/slug/{slug}/ | Retrieve a list of all organizations added to the UEX website |



## getOrganizationsByOrganization

> GetOrganizationsOkResponse getOrganizationsByOrganization(idOrganization)

Retrieve a list of all organizations added to the UEX website

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String idOrganization = "idOrganization_example"; // String | 
        try {
            GetOrganizationsOkResponse result = apiInstance.getOrganizationsByOrganization(idOrganization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#getOrganizationsByOrganization");
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
| **idOrganization** | **String**|  | |

### Return type

[**GetOrganizationsOkResponse**](GetOrganizationsOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getOrganizationsBySlug

> GetOrganizationsOkResponse getOrganizationsBySlug(slug)

Retrieve a list of all organizations added to the UEX website

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        OrganizationsApi apiInstance = new OrganizationsApi(defaultClient);
        String slug = "slug_example"; // String | 
        try {
            GetOrganizationsOkResponse result = apiInstance.getOrganizationsBySlug(slug);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrganizationsApi#getOrganizationsBySlug");
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
| **slug** | **String**|  | |

### Return type

[**GetOrganizationsOkResponse**](GetOrganizationsOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

