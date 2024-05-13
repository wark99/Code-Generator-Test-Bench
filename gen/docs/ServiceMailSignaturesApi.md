# ServiceMailSignaturesApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1mailHostingsMailHostingIdSignaturesGet**](ServiceMailSignaturesApi.md#call1mailHostingsMailHostingIdSignaturesGet) | **GET** /1/mail_hostings/{mail_hosting_id}/signatures | List signatures |
| [**call1mailHostingsMailHostingIdSignaturesPost**](ServiceMailSignaturesApi.md#call1mailHostingsMailHostingIdSignaturesPost) | **POST** /1/mail_hostings/{mail_hosting_id}/signatures | Create signature |
| [**call1mailHostingsMailHostingIdSignaturesSignatureIdDelete**](ServiceMailSignaturesApi.md#call1mailHostingsMailHostingIdSignaturesSignatureIdDelete) | **DELETE** /1/mail_hostings/{mail_hosting_id}/signatures/{signature_id} | Delete signature |
| [**call1mailHostingsMailHostingIdSignaturesSignatureIdGet**](ServiceMailSignaturesApi.md#call1mailHostingsMailHostingIdSignaturesSignatureIdGet) | **GET** /1/mail_hostings/{mail_hosting_id}/signatures/{signature_id} | Show a signature model |
| [**call1mailHostingsMailHostingIdSignaturesSignatureIdPatch**](ServiceMailSignaturesApi.md#call1mailHostingsMailHostingIdSignaturesSignatureIdPatch) | **PATCH** /1/mail_hostings/{mail_hosting_id}/signatures/{signature_id} | Update signature |
| [**call1mailHostingsMailHostingIdSignaturesUploadPost**](ServiceMailSignaturesApi.md#call1mailHostingsMailHostingIdSignaturesUploadPost) | **POST** /1/mail_hostings/{mail_hosting_id}/signatures/upload | Upload an image |



## call1mailHostingsMailHostingIdSignaturesGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdSignaturesGet(mailHostingId)

List signatures

Returns list of signature models for given service mail

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceMailSignaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ServiceMailSignaturesApi apiInstance = new ServiceMailSignaturesApi(defaultClient);
        Integer mailHostingId = 56; // Integer | ServiceMail identifier
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1mailHostingsMailHostingIdSignaturesGet(mailHostingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceMailSignaturesApi#call1mailHostingsMailHostingIdSignaturesGet");
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

[**Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response**](Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call1mailHostingsMailHostingIdSignaturesPost

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdSignaturesPost(mailHostingId, requestBody25)

Create signature

Create new signature model for given service mail

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceMailSignaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ServiceMailSignaturesApi apiInstance = new ServiceMailSignaturesApi(defaultClient);
        Integer mailHostingId = 56; // Integer | ServiceMail identifier
        RequestBody25 requestBody25 = new RequestBody25(); // RequestBody25 | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdSignaturesPost(mailHostingId, requestBody25);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceMailSignaturesApi#call1mailHostingsMailHostingIdSignaturesPost");
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
| **requestBody25** | [**RequestBody25**](RequestBody25.md)|  | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response**](Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response.md)

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


## call1mailHostingsMailHostingIdSignaturesSignatureIdDelete

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdSignaturesSignatureIdDelete(mailHostingId, signatureId, requestBody52)

Delete signature

Delete signature model

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceMailSignaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ServiceMailSignaturesApi apiInstance = new ServiceMailSignaturesApi(defaultClient);
        Integer mailHostingId = 56; // Integer | ServiceMail identifier
        Integer signatureId = 56; // Integer | Signature identifier
        RequestBody52 requestBody52 = new RequestBody52(); // RequestBody52 | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1mailHostingsMailHostingIdSignaturesSignatureIdDelete(mailHostingId, signatureId, requestBody52);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceMailSignaturesApi#call1mailHostingsMailHostingIdSignaturesSignatureIdDelete");
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
| **signatureId** | **Integer**| Signature identifier | |
| **requestBody52** | [**RequestBody52**](RequestBody52.md)|  | [optional] |

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


## call1mailHostingsMailHostingIdSignaturesSignatureIdGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdSignaturesSignatureIdGet(mailHostingId, signatureId)

Show a signature model

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceMailSignaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ServiceMailSignaturesApi apiInstance = new ServiceMailSignaturesApi(defaultClient);
        Integer mailHostingId = 56; // Integer | 
        String signatureId = "signatureId_example"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1mailHostingsMailHostingIdSignaturesSignatureIdGet(mailHostingId, signatureId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceMailSignaturesApi#call1mailHostingsMailHostingIdSignaturesSignatureIdGet");
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
| **mailHostingId** | **Integer**|  | |
| **signatureId** | **String**|  | |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response**](Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call1mailHostingsMailHostingIdSignaturesSignatureIdPatch

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdSignaturesSignatureIdPatch(mailHostingId, signatureId, requestBody53)

Update signature

Update signature model

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceMailSignaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ServiceMailSignaturesApi apiInstance = new ServiceMailSignaturesApi(defaultClient);
        Integer mailHostingId = 56; // Integer | ServiceMail identifier
        String signatureId = "signatureId_example"; // String | 
        RequestBody53 requestBody53 = new RequestBody53(); // RequestBody53 | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1mailHostingsMailHostingIdSignaturesSignatureIdPatch(mailHostingId, signatureId, requestBody53);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceMailSignaturesApi#call1mailHostingsMailHostingIdSignaturesSignatureIdPatch");
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
| **signatureId** | **String**|  | |
| **requestBody53** | [**RequestBody53**](RequestBody53.md)|  | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response**](Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response.md)

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


## call1mailHostingsMailHostingIdSignaturesUploadPost

> Model1MailHostingsMailHostingIdSignaturesUploadPost201Response call1mailHostingsMailHostingIdSignaturesUploadPost(mailHostingId, requestBody26)

Upload an image

Upload an image.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServiceMailSignaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ServiceMailSignaturesApi apiInstance = new ServiceMailSignaturesApi(defaultClient);
        Integer mailHostingId = 56; // Integer | The unique identifier (ID) of the mail hosting to request.
        RequestBody26 requestBody26 = new RequestBody26(); // RequestBody26 | 
        try {
            Model1MailHostingsMailHostingIdSignaturesUploadPost201Response result = apiInstance.call1mailHostingsMailHostingIdSignaturesUploadPost(mailHostingId, requestBody26);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceMailSignaturesApi#call1mailHostingsMailHostingIdSignaturesUploadPost");
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
| **mailHostingId** | **Integer**| The unique identifier (ID) of the mail hosting to request. | |
| **requestBody26** | [**RequestBody26**](RequestBody26.md)|  | [optional] |

### Return type

[**Model1MailHostingsMailHostingIdSignaturesUploadPost201Response**](Model1MailHostingsMailHostingIdSignaturesUploadPost201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

