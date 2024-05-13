# ProviderApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**providerAddproviderPost**](ProviderApi.md#providerAddproviderPost) | **POST** /provider/addprovider | Add a new provider |
| [**providerDeleteproviderProviderIDDelete**](ProviderApi.md#providerDeleteproviderProviderIDDelete) | **DELETE** /provider/deleteprovider/{providerID} | Delete provider by ID |
| [**providerGetprovidersGet**](ProviderApi.md#providerGetprovidersGet) | **GET** /provider/getproviders | Get all providers |
| [**providerProviderIDGet**](ProviderApi.md#providerProviderIDGet) | **GET** /provider/{providerID} | Get provider by ID |
| [**providerUpdateproviderProviderIDPut**](ProviderApi.md#providerUpdateproviderProviderIDPut) | **PUT** /provider/updateprovider/{providerID} | Update provider by ID |



## providerAddproviderPost

> providerAddproviderPost(provider)

Add a new provider

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProviderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ProviderApi apiInstance = new ProviderApi(defaultClient);
        Provider provider = new Provider(); // Provider | 
        try {
            apiInstance.providerAddproviderPost(provider);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProviderApi#providerAddproviderPost");
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
| **provider** | [**Provider**](Provider.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |


## providerDeleteproviderProviderIDDelete

> providerDeleteproviderProviderIDDelete(providerID)

Delete provider by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProviderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ProviderApi apiInstance = new ProviderApi(defaultClient);
        Integer providerID = 56; // Integer | ID of the provider to delete
        try {
            apiInstance.providerDeleteproviderProviderIDDelete(providerID);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProviderApi#providerDeleteproviderProviderIDDelete");
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
| **providerID** | **Integer**| ID of the provider to delete | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |


## providerGetprovidersGet

> List&lt;Provider&gt; providerGetprovidersGet()

Get all providers

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProviderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ProviderApi apiInstance = new ProviderApi(defaultClient);
        try {
            List<Provider> result = apiInstance.providerGetprovidersGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProviderApi#providerGetprovidersGet");
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

[**List&lt;Provider&gt;**](Provider.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |


## providerProviderIDGet

> Provider providerProviderIDGet(providerID)

Get provider by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProviderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ProviderApi apiInstance = new ProviderApi(defaultClient);
        Integer providerID = 56; // Integer | ID of the provider to get
        try {
            Provider result = apiInstance.providerProviderIDGet(providerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProviderApi#providerProviderIDGet");
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
| **providerID** | **Integer**| ID of the provider to get | |

### Return type

[**Provider**](Provider.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |


## providerUpdateproviderProviderIDPut

> providerUpdateproviderProviderIDPut(providerID, provider)

Update provider by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProviderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ProviderApi apiInstance = new ProviderApi(defaultClient);
        Integer providerID = 56; // Integer | ID of the provider to update
        Provider provider = new Provider(); // Provider | 
        try {
            apiInstance.providerUpdateproviderProviderIDPut(providerID, provider);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProviderApi#providerUpdateproviderProviderIDPut");
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
| **providerID** | **Integer**| ID of the provider to update | |
| **provider** | [**Provider**](Provider.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

