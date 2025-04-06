# InstitutionsApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCertifiedInstitutions**](InstitutionsApi.md#getCertifiedInstitutions) | **GET** /institution/v2/certifiedInstitutions | Get Certified Institutions |
| [**getCertifiedInstitutionsWithRSSD**](InstitutionsApi.md#getCertifiedInstitutionsWithRSSD) | **GET** /institution/v2/certifiedInstitutions/rssd | Get Certified Institutions With RSSD |
| [**getInstitution**](InstitutionsApi.md#getInstitution) | **GET** /institution/v2/institutions/{institutionId} | Get Institution by ID |
| [**getInstitutionBranding**](InstitutionsApi.md#getInstitutionBranding) | **GET** /institution/v2/institutions/{institutionId}/branding | Get Institution Branding by ID |
| [**getInstitutions**](InstitutionsApi.md#getInstitutions) | **GET** /institution/v2/institutions | Get Institutions |



## getCertifiedInstitutions

> CertifiedInstitutions getCertifiedInstitutions(search, start, limit, type, supportedCountries)

Get Certified Institutions

Search for financial institutions by certified product.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstitutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.finicity.com");
        
        // Configure API key authorization: FinicityAppToken
        ApiKeyAuth FinicityAppToken = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppToken");
        FinicityAppToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //FinicityAppToken.setApiKeyPrefix("Token");

        // Configure API key authorization: FinicityAppKey
        ApiKeyAuth FinicityAppKey = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppKey");
        FinicityAppKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //FinicityAppKey.setApiKeyPrefix("Token");

        InstitutionsApi apiInstance = new InstitutionsApi(defaultClient);
        String search = "finbank"; // String | Search term (financial institution `name` field). Leave empty for all FIs.
        Integer start = 1; // Integer | Index of the page of results to return
        Integer limit = 25; // Integer | Maximum number of results per page
        String type = "voa"; // String | A product type: \"transAgg\", \"ach\", \"stateAgg\", \"voi\", \"voa\", \"aha\", \"availBalance\", \"accountOwner\"
        List<String> supportedCountries = Arrays.asList(); // List<String> | A list of country codes, '*' for all countries.
        try {
            CertifiedInstitutions result = apiInstance.getCertifiedInstitutions(search, start, limit, type, supportedCountries);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstitutionsApi#getCertifiedInstitutions");
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
| **search** | **String**| Search term (financial institution &#x60;name&#x60; field). Leave empty for all FIs. | [optional] |
| **start** | **Integer**| Index of the page of results to return | [optional] [default to 1] |
| **limit** | **Integer**| Maximum number of results per page | [optional] [default to 25] |
| **type** | **String**| A product type: \&quot;transAgg\&quot;, \&quot;ach\&quot;, \&quot;stateAgg\&quot;, \&quot;voi\&quot;, \&quot;voa\&quot;, \&quot;aha\&quot;, \&quot;availBalance\&quot;, \&quot;accountOwner\&quot; | [optional] |
| **supportedCountries** | [**List&lt;String&gt;**](String.md)| A list of country codes, &#39;*&#39; for all countries. | [optional] |

### Return type

[**CertifiedInstitutions**](CertifiedInstitutions.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Institutions were successfully retrieved |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |


## getCertifiedInstitutionsWithRSSD

> CertifiedInstitutions getCertifiedInstitutionsWithRSSD(search, start, limit, type, supportedCountries)

Get Certified Institutions With RSSD

Search for certified financial institutions w/RSSD.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstitutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.finicity.com");
        
        // Configure API key authorization: FinicityAppToken
        ApiKeyAuth FinicityAppToken = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppToken");
        FinicityAppToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //FinicityAppToken.setApiKeyPrefix("Token");

        // Configure API key authorization: FinicityAppKey
        ApiKeyAuth FinicityAppKey = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppKey");
        FinicityAppKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //FinicityAppKey.setApiKeyPrefix("Token");

        InstitutionsApi apiInstance = new InstitutionsApi(defaultClient);
        String search = "finbank"; // String | Search term (financial institution `name` field). Leave empty for all FIs.
        Integer start = 1; // Integer | Index of the page of results to return
        Integer limit = 25; // Integer | Maximum number of results per page
        String type = "voa"; // String | A product type: \"transAgg\", \"ach\", \"stateAgg\", \"voi\", \"voa\", \"aha\", \"availBalance\", \"accountOwner\"
        List<String> supportedCountries = Arrays.asList(); // List<String> | A list of country codes, '*' for all countries.
        try {
            CertifiedInstitutions result = apiInstance.getCertifiedInstitutionsWithRSSD(search, start, limit, type, supportedCountries);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstitutionsApi#getCertifiedInstitutionsWithRSSD");
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
| **search** | **String**| Search term (financial institution &#x60;name&#x60; field). Leave empty for all FIs. | [optional] |
| **start** | **Integer**| Index of the page of results to return | [optional] [default to 1] |
| **limit** | **Integer**| Maximum number of results per page | [optional] [default to 25] |
| **type** | **String**| A product type: \&quot;transAgg\&quot;, \&quot;ach\&quot;, \&quot;stateAgg\&quot;, \&quot;voi\&quot;, \&quot;voa\&quot;, \&quot;aha\&quot;, \&quot;availBalance\&quot;, \&quot;accountOwner\&quot; | [optional] |
| **supportedCountries** | [**List&lt;String&gt;**](String.md)| A list of country codes, &#39;*&#39; for all countries. | [optional] |

### Return type

[**CertifiedInstitutions**](CertifiedInstitutions.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Institutions were successfully retrieved |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |


## getInstitution

> InstitutionWrapper getInstitution(institutionId)

Get Institution by ID

Get financial institution details by ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstitutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.finicity.com");
        
        // Configure API key authorization: FinicityAppToken
        ApiKeyAuth FinicityAppToken = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppToken");
        FinicityAppToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //FinicityAppToken.setApiKeyPrefix("Token");

        // Configure API key authorization: FinicityAppKey
        ApiKeyAuth FinicityAppKey = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppKey");
        FinicityAppKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //FinicityAppKey.setApiKeyPrefix("Token");

        InstitutionsApi apiInstance = new InstitutionsApi(defaultClient);
        Long institutionId = 4222L; // Long | The institution ID
        try {
            InstitutionWrapper result = apiInstance.getInstitution(institutionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstitutionsApi#getInstitution");
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
| **institutionId** | **Long**| The institution ID | |

### Return type

[**InstitutionWrapper**](InstitutionWrapper.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Institution was successfully retrieved |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |


## getInstitutionBranding

> BrandingWrapper getInstitutionBranding(institutionId)

Get Institution Branding by ID

Return the branding information for a financial institution.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstitutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.finicity.com");
        
        // Configure API key authorization: FinicityAppToken
        ApiKeyAuth FinicityAppToken = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppToken");
        FinicityAppToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //FinicityAppToken.setApiKeyPrefix("Token");

        // Configure API key authorization: FinicityAppKey
        ApiKeyAuth FinicityAppKey = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppKey");
        FinicityAppKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //FinicityAppKey.setApiKeyPrefix("Token");

        InstitutionsApi apiInstance = new InstitutionsApi(defaultClient);
        Long institutionId = 4222L; // Long | The institution ID
        try {
            BrandingWrapper result = apiInstance.getInstitutionBranding(institutionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstitutionsApi#getInstitutionBranding");
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
| **institutionId** | **Long**| The institution ID | |

### Return type

[**BrandingWrapper**](BrandingWrapper.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Institution branding was successfully retrieved |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |


## getInstitutions

> Institutions getInstitutions(search, start, limit, type, supportedCountries)

Get Institutions

Search for financial institutions.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstitutionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.finicity.com");
        
        // Configure API key authorization: FinicityAppToken
        ApiKeyAuth FinicityAppToken = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppToken");
        FinicityAppToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //FinicityAppToken.setApiKeyPrefix("Token");

        // Configure API key authorization: FinicityAppKey
        ApiKeyAuth FinicityAppKey = (ApiKeyAuth) defaultClient.getAuthentication("FinicityAppKey");
        FinicityAppKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //FinicityAppKey.setApiKeyPrefix("Token");

        InstitutionsApi apiInstance = new InstitutionsApi(defaultClient);
        String search = "finbank"; // String | Search term (financial institution `name` field). Leave empty for all FIs.
        Integer start = 1; // Integer | Index of the page of results to return
        Integer limit = 25; // Integer | Maximum number of results per page
        String type = "voa"; // String | A product type: \"transAgg\", \"ach\", \"stateAgg\", \"voi\", \"voa\", \"aha\", \"availBalance\", \"accountOwner\"
        List<String> supportedCountries = Arrays.asList(); // List<String> | A list of country codes, '*' for all countries.
        try {
            Institutions result = apiInstance.getInstitutions(search, start, limit, type, supportedCountries);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstitutionsApi#getInstitutions");
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
| **search** | **String**| Search term (financial institution &#x60;name&#x60; field). Leave empty for all FIs. | [optional] |
| **start** | **Integer**| Index of the page of results to return | [optional] [default to 1] |
| **limit** | **Integer**| Maximum number of results per page | [optional] [default to 25] |
| **type** | **String**| A product type: \&quot;transAgg\&quot;, \&quot;ach\&quot;, \&quot;stateAgg\&quot;, \&quot;voi\&quot;, \&quot;voa\&quot;, \&quot;aha\&quot;, \&quot;availBalance\&quot;, \&quot;accountOwner\&quot; | [optional] |
| **supportedCountries** | [**List&lt;String&gt;**](String.md)| A list of country codes, &#39;*&#39; for all countries. | [optional] |

### Return type

[**Institutions**](Institutions.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Institutions were successfully retrieved |  -  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |

