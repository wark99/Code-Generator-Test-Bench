# StandardRequestsApi

All URIs are relative to *https://api.vikey.it/api/v3/external*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**buroIstatDelete**](StandardRequestsApi.md#buroIstatDelete) | **DELETE** /buro/istat | Delete the comunications of a given list of ids for the istat service that support the delete method |
| [**buroIstatPost**](StandardRequestsApi.md#buroIstatPost) | **POST** /buro/istat | Post a reservations to any istat service |
| [**buroPaPost**](StandardRequestsApi.md#buroPaPost) | **POST** /buro/pa | Post a reservations to Portale Alloggiati |
| [**istatRegionsGet**](StandardRequestsApi.md#istatRegionsGet) | **GET** /istat/regions | Get all the regions avaiable for Istat service and the relative Host_data node to use in the endpoint buro/istat |



## buroIstatDelete

> BuroPaPost200Response buroIstatDelete(deleteIstat)

Delete the comunications of a given list of ids for the istat service that support the delete method

# Delete the comunications of a given list of ids for the istat service that support the delete method &lt;br/&gt;&lt;br/&gt;To successfully resolve this endpoint **you must first query the istat/regions endpoint**. Once you have retrieved the region of your interest and its relative host data schema you can use them to run this endpoint    

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StandardRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.vikey.it/api/v3/external");
        
        // Configure API key authorization: apiToken
        ApiKeyAuth apiToken = (ApiKeyAuth) defaultClient.getAuthentication("apiToken");
        apiToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiToken.setApiKeyPrefix("Token");

        StandardRequestsApi apiInstance = new StandardRequestsApi(defaultClient);
        DeleteIstat deleteIstat = new DeleteIstat(); // DeleteIstat | 
        try {
            BuroPaPost200Response result = apiInstance.buroIstatDelete(deleteIstat);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StandardRequestsApi#buroIstatDelete");
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
| **deleteIstat** | [**DeleteIstat**](DeleteIstat.md)|  | [optional] |

### Return type

[**BuroPaPost200Response**](BuroPaPost200Response.md)

### Authorization

[apiToken](../README.md#apiToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ok |  -  |
| **400** | Client error |  -  |


## buroIstatPost

> BuroPaPost200Response buroIstatPost(postIstat)

Post a reservations to any istat service

# Sends all reservations for the day to the ISTAT of the specified region &lt;br/&gt;&lt;br/&gt;To successfully resolve this endpoint **you must first query the istat/regions endpoint**. Once you have retrieved the region of your interest and its relative host data schema you can use them to run this endpoint    

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StandardRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.vikey.it/api/v3/external");
        
        // Configure API key authorization: apiToken
        ApiKeyAuth apiToken = (ApiKeyAuth) defaultClient.getAuthentication("apiToken");
        apiToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiToken.setApiKeyPrefix("Token");

        StandardRequestsApi apiInstance = new StandardRequestsApi(defaultClient);
        PostIstat postIstat = new PostIstat(); // PostIstat | 
        try {
            BuroPaPost200Response result = apiInstance.buroIstatPost(postIstat);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StandardRequestsApi#buroIstatPost");
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
| **postIstat** | [**PostIstat**](PostIstat.md)|  | [optional] |

### Return type

[**BuroPaPost200Response**](BuroPaPost200Response.md)

### Authorization

[apiToken](../README.md#apiToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ok |  -  |
| **400** | Client error |  -  |


## buroPaPost

> BuroPaPost200Response buroPaPost(postPa)

Post a reservations to Portale Alloggiati

# Post a single reservation in a certain day to Portale Alloggiati   **Obtain web service key** (wskey) --&gt; &lt;a href&#x3D;\&quot;https://support.vikey.it/it/articles/7991406-come-recuperare-la-chiave-web-service-dal-portale-alloggiati\&quot;&gt;Link&lt;/a&gt;  **Obtain apt_id** --&gt; By accessing your Alloggiati Web Portal user, the list of apartments registered on Alloggiati Web will appear in the Apartments &gt; List of apartments section: If the List of apartments section is not present, and there is only one apartment on the Accommodation Portal, the ID is 0. If there is no apartment, the lack can be corrected by manually adding the structure by clicking on the +. After taking note of the ID of each apartment in the left column, send it together with the relevant reservations  **Obtain is_multi_apt** --&gt; If in the Apartments &gt; List of apartments section there is more than one apartament is True, else False                                            

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StandardRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.vikey.it/api/v3/external");
        
        // Configure API key authorization: apiToken
        ApiKeyAuth apiToken = (ApiKeyAuth) defaultClient.getAuthentication("apiToken");
        apiToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiToken.setApiKeyPrefix("Token");

        StandardRequestsApi apiInstance = new StandardRequestsApi(defaultClient);
        PostPa postPa = new PostPa(); // PostPa | 
        try {
            BuroPaPost200Response result = apiInstance.buroPaPost(postPa);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StandardRequestsApi#buroPaPost");
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
| **postPa** | [**PostPa**](PostPa.md)|  | [optional] |

### Return type

[**BuroPaPost200Response**](BuroPaPost200Response.md)

### Authorization

[apiToken](../README.md#apiToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ok |  -  |
| **400** | Client error |  -  |


## istatRegionsGet

> IstatRegionsGet200Response istatRegionsGet()

Get all the regions avaiable for Istat service and the relative Host_data node to use in the endpoint buro/istat

# Get all the regions avaiable for Istat service and the relative Host_data node to use in the endpoint buro/istat

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StandardRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.vikey.it/api/v3/external");
        
        // Configure API key authorization: apiToken
        ApiKeyAuth apiToken = (ApiKeyAuth) defaultClient.getAuthentication("apiToken");
        apiToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiToken.setApiKeyPrefix("Token");

        StandardRequestsApi apiInstance = new StandardRequestsApi(defaultClient);
        try {
            IstatRegionsGet200Response result = apiInstance.istatRegionsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StandardRequestsApi#istatRegionsGet");
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

[**IstatRegionsGet200Response**](IstatRegionsGet200Response.md)

### Authorization

[apiToken](../README.md#apiToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ok |  -  |
| **400** | Client error |  -  |

