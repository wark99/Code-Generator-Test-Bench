# BillingApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1swissBackupsCalculateGet**](BillingApi.md#call1swissBackupsCalculateGet) | **GET** /1/swiss_backups/calculate | Calculate the price |
| [**call1swissBackupsPricingGet**](BillingApi.md#call1swissBackupsPricingGet) | **GET** /1/swiss_backups/pricing | List prices and discounts |



## call1swissBackupsCalculateGet

> Model1SwissBackupsCalculateGet200Response call1swissBackupsCalculateGet(size, currencyId, dueAt, isDemo, slot, slotMobile, slotServer, slotVirtual, slotWorkstation)

Calculate the price

Calculate the price for a specific configuration

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BillingApi apiInstance = new BillingApi(defaultClient);
        Integer size = 200000000000; // Integer | 
        Integer currencyId = 56; // Integer | 
        String dueAt = "dueAt_example"; // String | 
        Boolean isDemo = true; // Boolean | 
        Integer slot = 56; // Integer | 
        Integer slotMobile = 56; // Integer | 
        Integer slotServer = 56; // Integer | 
        Integer slotVirtual = 56; // Integer | 
        Integer slotWorkstation = 56; // Integer | 
        try {
            Model1SwissBackupsCalculateGet200Response result = apiInstance.call1swissBackupsCalculateGet(size, currencyId, dueAt, isDemo, slot, slotMobile, slotServer, slotVirtual, slotWorkstation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BillingApi#call1swissBackupsCalculateGet");
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
| **size** | **Integer**|  | |
| **currencyId** | **Integer**|  | [optional] |
| **dueAt** | **String**|  | [optional] |
| **isDemo** | **Boolean**|  | [optional] |
| **slot** | **Integer**|  | [optional] |
| **slotMobile** | **Integer**|  | [optional] |
| **slotServer** | **Integer**|  | [optional] |
| **slotVirtual** | **Integer**|  | [optional] |
| **slotWorkstation** | **Integer**|  | [optional] |

### Return type

[**Model1SwissBackupsCalculateGet200Response**](Model1SwissBackupsCalculateGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call1swissBackupsPricingGet

> Model1SwissBackupsPricingGet200Response call1swissBackupsPricingGet(accountId, currencyId, swissBackupId, withRenewal)

List prices and discounts

List all prices and discounts for Swiss Backup products

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BillingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BillingApi apiInstance = new BillingApi(defaultClient);
        Integer accountId = 56; // Integer | The account identifier
        Integer currencyId = 56; // Integer | 
        Integer swissBackupId = 56; // Integer | 
        Boolean withRenewal = true; // Boolean | 
        try {
            Model1SwissBackupsPricingGet200Response result = apiInstance.call1swissBackupsPricingGet(accountId, currencyId, swissBackupId, withRenewal);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BillingApi#call1swissBackupsPricingGet");
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
| **accountId** | **Integer**| The account identifier | [optional] |
| **currencyId** | **Integer**|  | [optional] |
| **swissBackupId** | **Integer**|  | [optional] |
| **withRenewal** | **Boolean**|  | [optional] |

### Return type

[**Model1SwissBackupsPricingGet200Response**](Model1SwissBackupsPricingGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

