# DataApiApi

All URIs are relative to *https://vs4plus-api.vantagescore.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountDetails**](DataApiApi.md#accountDetails) | **GET** /account-details/{aggregator_id} | Account Data Elements |
| [**accountOwner**](DataApiApi.md#accountOwner) | **GET** /account-owner/{aggregator_id} | Account Owner Personal Information |
| [**accounts**](DataApiApi.md#accounts) | **GET** /accounts | List Consumer Accounts |
| [**bankLink**](DataApiApi.md#bankLink) | **POST** /bank-link | Generate Bank Link |
| [**transactions**](DataApiApi.md#transactions) | **GET** /transactions/{aggregator_id} | Transactions Data Elements |
| [**v40**](DataApiApi.md#v40) | **POST** /scorev4/{bureau_id} | View V4.0 for a consumer |
| [**v40hardreport**](DataApiApi.md#v40hardreport) | **POST** /reports-vs4/hard-inquiry/{bureau_id} | View V4.0 hard inquiry report for a consumer |
| [**v40report**](DataApiApi.md#v40report) | **POST** /reports-vs4/{bureau_id} | View V4.0 report for a consumer |



## accountDetails

> AccountDetails200Response accountDetails(consumerId, accountId, aggregatorId)

Account Data Elements

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://vs4plus-api.vantagescore.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DataApiApi apiInstance = new DataApiApi(defaultClient);
        String consumerId = "consumerId_example"; // String | 
        Long accountId = 56L; // Long | 
        String aggregatorId = "finicity"; // String | 
        try {
            AccountDetails200Response result = apiInstance.accountDetails(consumerId, accountId, aggregatorId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApiApi#accountDetails");
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
| **consumerId** | **String**|  | |
| **accountId** | **Long**|  | |
| **aggregatorId** | **String**|  | [optional] [enum: finicity, mx, yodlee, akoya] |

### Return type

[**AccountDetails200Response**](AccountDetails200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |


## accountOwner

> AccountOwner200Response accountOwner(accountId, aggregatorId)

Account Owner Personal Information

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://vs4plus-api.vantagescore.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DataApiApi apiInstance = new DataApiApi(defaultClient);
        Long accountId = 56L; // Long | 
        String aggregatorId = "finicity"; // String | 
        try {
            AccountOwner200Response result = apiInstance.accountOwner(accountId, aggregatorId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApiApi#accountOwner");
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
| **accountId** | **Long**|  | |
| **aggregatorId** | **String**|  | [optional] [enum: finicity, mx, yodlee, akoya] |

### Return type

[**AccountOwner200Response**](AccountOwner200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **424** | Data source error |  -  |


## accounts

> AccountsResp accounts(consumerId)

List Consumer Accounts

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://vs4plus-api.vantagescore.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DataApiApi apiInstance = new DataApiApi(defaultClient);
        String consumerId = "consumerId_example"; // String | 
        try {
            AccountsResp result = apiInstance.accounts(consumerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApiApi#accounts");
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
| **consumerId** | **String**|  | |

### Return type

[**AccountsResp**](AccountsResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## bankLink

> BankLinkResp bankLink(bankLinkReqInner)

Generate Bank Link

Generate secure URL to link bank accounts

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://vs4plus-api.vantagescore.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DataApiApi apiInstance = new DataApiApi(defaultClient);
        List<BankLinkReqInner> bankLinkReqInner = Arrays.asList(); // List<BankLinkReqInner> | 
        try {
            BankLinkResp result = apiInstance.bankLink(bankLinkReqInner);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApiApi#bankLink");
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
| **bankLinkReqInner** | [**List&lt;BankLinkReqInner&gt;**](BankLinkReqInner.md)|  | [optional] |

### Return type

[**BankLinkResp**](BankLinkResp.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Incorrect input |  -  |


## transactions

> Transactions200Response transactions(filters, aggregatorId)

Transactions Data Elements

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://vs4plus-api.vantagescore.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DataApiApi apiInstance = new DataApiApi(defaultClient);
        TransactionsFiltersParameter filters = new TransactionsFiltersParameter(); // TransactionsFiltersParameter | 
        String aggregatorId = "finicity"; // String | 
        try {
            Transactions200Response result = apiInstance.transactions(filters, aggregatorId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApiApi#transactions");
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
| **filters** | [**TransactionsFiltersParameter**](.md)|  | |
| **aggregatorId** | **String**|  | [enum: finicity, mx, yodlee, akoya] |

### Return type

[**Transactions200Response**](Transactions200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |


## v40

> V40200Response v40(bureauId, v40Request)

View V4.0 for a consumer

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://vs4plus-api.vantagescore.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DataApiApi apiInstance = new DataApiApi(defaultClient);
        String bureauId = "tu"; // String | 
        V40Request v40Request = new V40Request(); // V40Request | 
        try {
            V40200Response result = apiInstance.v40(bureauId, v40Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApiApi#v40");
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
| **bureauId** | **String**|  | [optional] [enum: tu, efx, exp] |
| **v40Request** | [**V40Request**](V40Request.md)|  | [optional] |

### Return type

[**V40200Response**](V40200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Incorrect input |  -  |


## v40hardreport

> V40report200Response v40hardreport(bureauId, v40reportRequest)

View V4.0 hard inquiry report for a consumer

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://vs4plus-api.vantagescore.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DataApiApi apiInstance = new DataApiApi(defaultClient);
        String bureauId = "tu"; // String | 
        V40reportRequest v40reportRequest = new V40reportRequest(); // V40reportRequest | 
        try {
            V40report200Response result = apiInstance.v40hardreport(bureauId, v40reportRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApiApi#v40hardreport");
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
| **bureauId** | **String**|  | [optional] [enum: tu, efx, exp] |
| **v40reportRequest** | [**V40reportRequest**](V40reportRequest.md)|  | [optional] |

### Return type

[**V40report200Response**](V40report200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Incorrect input |  -  |


## v40report

> V40report200Response v40report(bureauId, v40reportRequest)

View V4.0 report for a consumer

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://vs4plus-api.vantagescore.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DataApiApi apiInstance = new DataApiApi(defaultClient);
        String bureauId = "tu"; // String | 
        V40reportRequest v40reportRequest = new V40reportRequest(); // V40reportRequest | 
        try {
            V40report200Response result = apiInstance.v40report(bureauId, v40reportRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApiApi#v40report");
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
| **bureauId** | **String**|  | [optional] [enum: tu, efx, exp] |
| **v40reportRequest** | [**V40reportRequest**](V40reportRequest.md)|  | [optional] |

### Return type

[**V40report200Response**](V40report200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Incorrect input |  -  |

