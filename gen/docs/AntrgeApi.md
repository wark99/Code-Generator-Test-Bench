# AntrgeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiKitafinderAntraegeErmaessigungmitbelegenPost**](AntrgeApi.md#apiKitafinderAntraegeErmaessigungmitbelegenPost) | **POST** /api/kitafinder/antraege/ermaessigungmitbelegen | Neuen Antrag auf Ermäßigung mit Belegen erstellen (E4) |
| [**apiKitafinderAntraegeErmaessigungselbsteinschaetzungPost**](AntrgeApi.md#apiKitafinderAntraegeErmaessigungselbsteinschaetzungPost) | **POST** /api/kitafinder/antraege/ermaessigungselbsteinschaetzung | Neuen Antrag auf Ermäßigung mit Selbsteinschätzung erstellen (E3) |
| [**apiKitafinderAntraegeFristablaufPost**](AntrgeApi.md#apiKitafinderAntraegeFristablaufPost) | **POST** /api/kitafinder/antraege/fristablauf | Fristablauf (E1) |
| [**apiKitafinderAntraegeRegelsatzPost**](AntrgeApi.md#apiKitafinderAntraegeRegelsatzPost) | **POST** /api/kitafinder/antraege/regelsatz | Neuen Antrag auf Regelsatz erstellen (E2) |
| [**apiKitafinderAntraegeUnterlageneingangPost**](AntrgeApi.md#apiKitafinderAntraegeUnterlageneingangPost) | **POST** /api/kitafinder/antraege/unterlageneingang | Unterlageneingang (E5) |
| [**apiKitafinderAntraegeUnterlagenfristgesetztPost**](AntrgeApi.md#apiKitafinderAntraegeUnterlagenfristgesetztPost) | **POST** /api/kitafinder/antraege/unterlagenfristgesetzt | Frist für Unterlagen wurde gesetzt (E6) |



## apiKitafinderAntraegeErmaessigungmitbelegenPost

> apiKitafinderAntraegeErmaessigungmitbelegenPost(apiKitafinderAntraegeErmaessigungmitbelegenPostRequest)

Neuen Antrag auf Ermäßigung mit Belegen erstellen (E4)

Neuen Antrag auf Ermäßigung mit Belegen erstellen (E4)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AntrgeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        AntrgeApi apiInstance = new AntrgeApi(defaultClient);
        ApiKitafinderAntraegeErmaessigungmitbelegenPostRequest apiKitafinderAntraegeErmaessigungmitbelegenPostRequest = new ApiKitafinderAntraegeErmaessigungmitbelegenPostRequest(); // ApiKitafinderAntraegeErmaessigungmitbelegenPostRequest | 
        try {
            apiInstance.apiKitafinderAntraegeErmaessigungmitbelegenPost(apiKitafinderAntraegeErmaessigungmitbelegenPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AntrgeApi#apiKitafinderAntraegeErmaessigungmitbelegenPost");
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
| **apiKitafinderAntraegeErmaessigungmitbelegenPostRequest** | [**ApiKitafinderAntraegeErmaessigungmitbelegenPostRequest**](ApiKitafinderAntraegeErmaessigungmitbelegenPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create (E4) Antrag auf Ermäßigung mit Belegen |  -  |
| **401** | API key nicht angegeben oder ungültig |  * WWW_Authenticate -  <br>  |
| **4XX** | Sonstiger Client Fehler (4xx) |  -  |
| **5XX** | Server Fehler (5xx) |  -  |


## apiKitafinderAntraegeErmaessigungselbsteinschaetzungPost

> apiKitafinderAntraegeErmaessigungselbsteinschaetzungPost(apiKitafinderAntraegeErmaessigungselbsteinschaetzungPostRequest)

Neuen Antrag auf Ermäßigung mit Selbsteinschätzung erstellen (E3)

Neuen Antrag auf Ermäßigung mit Selbsteinschätzung erstellen (E3)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AntrgeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        AntrgeApi apiInstance = new AntrgeApi(defaultClient);
        ApiKitafinderAntraegeErmaessigungselbsteinschaetzungPostRequest apiKitafinderAntraegeErmaessigungselbsteinschaetzungPostRequest = new ApiKitafinderAntraegeErmaessigungselbsteinschaetzungPostRequest(); // ApiKitafinderAntraegeErmaessigungselbsteinschaetzungPostRequest | 
        try {
            apiInstance.apiKitafinderAntraegeErmaessigungselbsteinschaetzungPost(apiKitafinderAntraegeErmaessigungselbsteinschaetzungPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AntrgeApi#apiKitafinderAntraegeErmaessigungselbsteinschaetzungPost");
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
| **apiKitafinderAntraegeErmaessigungselbsteinschaetzungPostRequest** | [**ApiKitafinderAntraegeErmaessigungselbsteinschaetzungPostRequest**](ApiKitafinderAntraegeErmaessigungselbsteinschaetzungPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create (E3) Antrag auf Ermäßigung mit Selbsteinschätzung |  -  |
| **401** | API key nicht angegeben oder ungültig |  * WWW_Authenticate -  <br>  |
| **4XX** | Sonstiger Client Fehler (4xx) |  -  |
| **5XX** | Server Fehler (5xx) |  -  |


## apiKitafinderAntraegeFristablaufPost

> apiKitafinderAntraegeFristablaufPost(apiKitafinderAntraegeFristablaufPostRequest)

Fristablauf (E1)

Fristablauf (E1) Nur für Neuverträge wenn 4 Wochen nach Neuvertrag kein Antrag gestellt wurde

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AntrgeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        AntrgeApi apiInstance = new AntrgeApi(defaultClient);
        ApiKitafinderAntraegeFristablaufPostRequest apiKitafinderAntraegeFristablaufPostRequest = new ApiKitafinderAntraegeFristablaufPostRequest(); // ApiKitafinderAntraegeFristablaufPostRequest | 
        try {
            apiInstance.apiKitafinderAntraegeFristablaufPost(apiKitafinderAntraegeFristablaufPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AntrgeApi#apiKitafinderAntraegeFristablaufPost");
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
| **apiKitafinderAntraegeFristablaufPostRequest** | [**ApiKitafinderAntraegeFristablaufPostRequest**](ApiKitafinderAntraegeFristablaufPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fristablauf übertragen |  -  |
| **401** | API key nicht angegeben oder ungültig |  * WWW_Authenticate -  <br>  |
| **4XX** | Sonstiger Client Fehler (4xx) |  -  |
| **5XX** | Server Fehler (5xx) |  -  |


## apiKitafinderAntraegeRegelsatzPost

> apiKitafinderAntraegeRegelsatzPost(apiKitafinderAntraegeRegelsatzPostRequest)

Neuen Antrag auf Regelsatz erstellen (E2)

Neuen Antrag auf Regelsatz erstellen (E2)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AntrgeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        AntrgeApi apiInstance = new AntrgeApi(defaultClient);
        ApiKitafinderAntraegeRegelsatzPostRequest apiKitafinderAntraegeRegelsatzPostRequest = new ApiKitafinderAntraegeRegelsatzPostRequest(); // ApiKitafinderAntraegeRegelsatzPostRequest | 
        try {
            apiInstance.apiKitafinderAntraegeRegelsatzPost(apiKitafinderAntraegeRegelsatzPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AntrgeApi#apiKitafinderAntraegeRegelsatzPost");
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
| **apiKitafinderAntraegeRegelsatzPostRequest** | [**ApiKitafinderAntraegeRegelsatzPostRequest**](ApiKitafinderAntraegeRegelsatzPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create (E2) Antrag auf Regelsatz |  -  |
| **401** | API key nicht angegeben oder ungültig |  * WWW_Authenticate -  <br>  |
| **4XX** | Sonstiger Client Fehler (4xx) |  -  |
| **5XX** | Server Fehler (5xx) |  -  |


## apiKitafinderAntraegeUnterlageneingangPost

> apiKitafinderAntraegeUnterlageneingangPost(apiKitafinderAntraegeUnterlageneingangPostRequest)

Unterlageneingang (E5)

Unterlageneingang (E5)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AntrgeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        AntrgeApi apiInstance = new AntrgeApi(defaultClient);
        ApiKitafinderAntraegeUnterlageneingangPostRequest apiKitafinderAntraegeUnterlageneingangPostRequest = new ApiKitafinderAntraegeUnterlageneingangPostRequest(); // ApiKitafinderAntraegeUnterlageneingangPostRequest | 
        try {
            apiInstance.apiKitafinderAntraegeUnterlageneingangPost(apiKitafinderAntraegeUnterlageneingangPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AntrgeApi#apiKitafinderAntraegeUnterlageneingangPost");
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
| **apiKitafinderAntraegeUnterlageneingangPostRequest** | [**ApiKitafinderAntraegeUnterlageneingangPostRequest**](ApiKitafinderAntraegeUnterlageneingangPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update (E5) Unterlageneingang |  -  |
| **401** | API key nicht angegeben oder ungültig |  * WWW_Authenticate -  <br>  |
| **4XX** | Sonstiger Client Fehler (4xx) |  -  |
| **5XX** | Server Fehler (5xx) |  -  |


## apiKitafinderAntraegeUnterlagenfristgesetztPost

> apiKitafinderAntraegeUnterlagenfristgesetztPost(apiKitafinderAntraegeUnterlagenfristgesetztPostRequest)

Frist für Unterlagen wurde gesetzt (E6)

Frist für Unterlagen wurde gesetzt (E6)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AntrgeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        AntrgeApi apiInstance = new AntrgeApi(defaultClient);
        ApiKitafinderAntraegeUnterlagenfristgesetztPostRequest apiKitafinderAntraegeUnterlagenfristgesetztPostRequest = new ApiKitafinderAntraegeUnterlagenfristgesetztPostRequest(); // ApiKitafinderAntraegeUnterlagenfristgesetztPostRequest | 
        try {
            apiInstance.apiKitafinderAntraegeUnterlagenfristgesetztPost(apiKitafinderAntraegeUnterlagenfristgesetztPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AntrgeApi#apiKitafinderAntraegeUnterlagenfristgesetztPost");
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
| **apiKitafinderAntraegeUnterlagenfristgesetztPostRequest** | [**ApiKitafinderAntraegeUnterlagenfristgesetztPostRequest**](ApiKitafinderAntraegeUnterlagenfristgesetztPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update (E6) Frist für Unterlagen wurde gesetzt |  -  |
| **401** | API key nicht angegeben oder ungültig |  * WWW_Authenticate -  <br>  |
| **4XX** | Sonstiger Client Fehler (4xx) |  -  |
| **5XX** | Server Fehler (5xx) |  -  |

