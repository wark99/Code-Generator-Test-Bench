# ServiceMailPreferencesApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1mailHostingsMailHostingIdPreferencesGet**](ServiceMailPreferencesApi.md#call1mailHostingsMailHostingIdPreferencesGet) | **GET** /1/mail_hostings/{mail_hosting_id}/preferences | List preferences |
| [**call1mailHostingsMailHostingIdPreferencesPatch**](ServiceMailPreferencesApi.md#call1mailHostingsMailHostingIdPreferencesPatch) | **PATCH** /1/mail_hostings/{mail_hosting_id}/preferences | Update preferences |



## call1mailHostingsMailHostingIdPreferencesGet

> Model1MailHostingsMailHostingIdPreferencesGet200Response call1mailHostingsMailHostingIdPreferencesGet(mailHostingId)

List preferences

Returns preferences for given Service Mail

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceMailPreferencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ServiceMailPreferencesApi apiInstance = new ServiceMailPreferencesApi(defaultClient);
        Integer mailHostingId = 56; // Integer | ServiceMail identifier
        try {
            Model1MailHostingsMailHostingIdPreferencesGet200Response result = apiInstance.call1mailHostingsMailHostingIdPreferencesGet(mailHostingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceMailPreferencesApi#call1mailHostingsMailHostingIdPreferencesGet");
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
| **mailHostingId** | **Integer**| ServiceMail identifier | |

### Return type

[**Model1MailHostingsMailHostingIdPreferencesGet200Response**](Model1MailHostingsMailHostingIdPreferencesGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call1mailHostingsMailHostingIdPreferencesPatch

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdPreferencesPatch(mailHostingId, requestBody51)

Update preferences

Update preferences for given service Mail

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceMailPreferencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ServiceMailPreferencesApi apiInstance = new ServiceMailPreferencesApi(defaultClient);
        String mailHostingId = "mailHostingId_example"; // String | 
        RequestBody51 requestBody51 = new RequestBody51(); // RequestBody51 | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1mailHostingsMailHostingIdPreferencesPatch(mailHostingId, requestBody51);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceMailPreferencesApi#call1mailHostingsMailHostingIdPreferencesPatch");
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
| **mailHostingId** | **String**|  | [optional] |
| **requestBody51** | [**RequestBody51**](RequestBody51.md)|  | [optional] |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response**](Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

