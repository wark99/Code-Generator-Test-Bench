# PaymentHistoryApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generatePaymentHistory**](PaymentHistoryApi.md#generatePaymentHistory) | **POST** /analytics/payment-history/v1/customer/{customerId} | Generate Payment History |
| [**generatePaymentHistoryFcra**](PaymentHistoryApi.md#generatePaymentHistoryFcra) | **POST** /analytics/payment-history/v1/customer/{customerId}/fcra | Generate Payment History - FCRA |
| [**getObbAnalyticsReport**](PaymentHistoryApi.md#getObbAnalyticsReport) | **GET** /analytics/data/v1/{obb_report_id} | Get OBB Analytics Report |
| [**getObbAnalyticsReportFcra**](PaymentHistoryApi.md#getObbAnalyticsReportFcra) | **GET** /analytics/data/v1/{obb_report_id}/fcra | Get OBB Analytics Report - FCRA |



## generatePaymentHistory

> ObbAnalyticsReportAck generatePaymentHistory(customerId, referenceNumber)

Generate Payment History

Payment history report analyzes up to 12-months of transactions and predicts the probability that a SMB will experience a payment risk event, such as NSF/Overdraft or missed recurring payments, in the near future when making a payment. The Risk Score provided in the report is a 2-digit ranking with four levels of risk going from low to high.  Some of the highlights of calculated risk present in the report include: * Risk Score representing the likelihood of a missed payment   based on analysis of permissioned open-banking data  * Monthly average balance for all accounts by month in the requested   time period  * Total deposit amount by month for all accounts in the requested time   period  * Total withdrawal amounts by month for all accounts in the requested   time period  * Number of NSF counts and aggregate amount per month in the requested   time period  * Recurring loan payment amounts per month in the requested time period * Insurance payment amount per month in the requested time period * Tax payment amounts per month in the requested time period  This version of the API is intended for piloting and integration testing your application with the Payment History product. It does not adhere to FCRA requirements, and should not be used for production/lending purposes. See _Generate Payment History - FCRA_ for the FCRA compliant version of this API.  *Note:* this is a premium service, billable per every successful API call for non-testing customers.  A successful call to this API will generate analytics and store a report within Finicity. The report can be retrieved via _Get OBB Analytics Report_ (operation: _GetObbAnalyticsReport_). *Note:* this is a premium service, billable per every successful API call for non-testing customers.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentHistoryApi;

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

        PaymentHistoryApi apiInstance = new PaymentHistoryApi(defaultClient);
        String customerId = "1005061234"; // String | A customer ID
        String referenceNumber = "abc123"; // String | Partner-provided reference number to correlate reports.
        try {
            ObbAnalyticsReportAck result = apiInstance.generatePaymentHistory(customerId, referenceNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentHistoryApi#generatePaymentHistory");
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
| **customerId** | **String**| A customer ID | |
| **referenceNumber** | **String**| Partner-provided reference number to correlate reports. | [optional] |

### Return type

[**ObbAnalyticsReportAck**](ObbAnalyticsReportAck.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response given when payment history was generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF. |  -  |
| **400** | A bad request was provided |  -  |
| **401** | Unauthorized request |  -  |
| **403** | Access forbidden |  -  |
| **404** | Resource not found |  -  |


## generatePaymentHistoryFcra

> ObbAnalyticsReportAck generatePaymentHistoryFcra(customerId, referenceNumber)

Generate Payment History - FCRA

Payment history report analyzes up to 12-months of transactions and predicts the probability that a SMB will experience a payment risk event, such as NSF/Overdraft or missed recurring payments, in the near future when making a payment. The Risk Score provided in the report is a 2-digit ranking with four levels of risk going from low to high.  Some of the highlights of calculated risk present in the report include: * Risk Score representing the likelihood of a missed payment   based on analysis of permissioned open-banking data  * Monthly average balance for all accounts by month in the requested   time period  * Total deposit amount by month for all accounts in the requested time   period  * Total withdrawal amounts by month for all accounts in the requested   time period  * Number of NSF counts and aggregate amount per month in the requested   time period  * Recurring loan payment amounts per month in the requested time period * Insurance payment amount per month in the requested time period * Tax payment amounts per month in the requested time period  This version of the API is intended for production use. It maintains and  enforces all compliance with FCRA rules and requirements.   *Note:* this is a premium service, billable per every successful API call for non-testing customers.  A successful call to this API will generate analytics and store a report within Finicity. The report can be retrieved via _Get OBB Analytics Report - FCRA_  (operation: _GetObbAnalyticsReportFcra_).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentHistoryApi;

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

        PaymentHistoryApi apiInstance = new PaymentHistoryApi(defaultClient);
        String customerId = "1005061234"; // String | A customer ID
        String referenceNumber = "abc123"; // String | Partner-provided reference number to correlate reports.
        try {
            ObbAnalyticsReportAck result = apiInstance.generatePaymentHistoryFcra(customerId, referenceNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentHistoryApi#generatePaymentHistoryFcra");
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
| **customerId** | **String**| A customer ID | |
| **referenceNumber** | **String**| Partner-provided reference number to correlate reports. | [optional] |

### Return type

[**ObbAnalyticsReportAck**](ObbAnalyticsReportAck.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response given when payment history (FCRA) was generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF. |  -  |
| **400** | A bad request was provided |  -  |
| **401** | Unauthorized request |  -  |
| **403** | Access forbidden |  -  |
| **404** | Resource not found |  -  |
| **409** | Resource conflict |  -  |


## getObbAnalyticsReport

> ObbAnalyticsReport getObbAnalyticsReport(obbReportId)

Get OBB Analytics Report

Retrieve the report saved by _Generate Balance Analytics_, _Generate Cash Flow Analytics_, or _Generate Payment History_. Requires the report ID generated by the previous call.  Report data can either be retrieved as a JSON document or a PDF file.  To specify the format required, set the _Accept request header_ to either **application/json** or **application/pdf**. If neither is set, the report format will be returned as a JSON document.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentHistoryApi;

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

        PaymentHistoryApi apiInstance = new PaymentHistoryApi(defaultClient);
        String obbReportId = "bcab9592-e032-4e7b-b737-0380619a0573"; // String | Report ID generated and returned by OBB products
        try {
            ObbAnalyticsReport result = apiInstance.getObbAnalyticsReport(obbReportId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentHistoryApi#getObbAnalyticsReport");
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
| **obbReportId** | **String**| Report ID generated and returned by OBB products | |

### Return type

[**ObbAnalyticsReport**](ObbAnalyticsReport.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/pdf


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OBB Analytics report data as JSON or PDF |  -  |
| **401** | Unauthorized request |  -  |
| **403** | Access forbidden |  -  |
| **404** | The resource doesn&#39;t exist |  -  |


## getObbAnalyticsReportFcra

> ObbAnalyticsReport getObbAnalyticsReportFcra(obbReportId, purpose)

Get OBB Analytics Report - FCRA

Retrieve the report saved by _Generate Balance Analytics - FCRA_, _Generate Cash Flow Analytics - FCRA_, or _Generate Payment History - FCRA_. Requires the report ID generated by the previous call.  Report data can either be retrieved as a JSON document or a PDF file.  To specify the format required, set the _Accept request header_ to either **application/json** or **application/pdf**. If neither is set, the report format will be returned as a JSON document.  *Note:* this is a premium service, billable per every successful API call for non-testing customers.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentHistoryApi;

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

        PaymentHistoryApi apiInstance = new PaymentHistoryApi(defaultClient);
        String obbReportId = "bcab9592-e032-4e7b-b737-0380619a0573"; // String | Report ID generated and returned by OBB products
        String purpose = "3F"; // String | 2-digit code from [Permissible Purpose Codes](https://developer.mastercard.com/open-banking-us/documentation/products/lend/report-handling/permissible-purpose-codes/), specifying the reason for retrieving this report. Required for retrieving some reports.
        try {
            ObbAnalyticsReport result = apiInstance.getObbAnalyticsReportFcra(obbReportId, purpose);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentHistoryApi#getObbAnalyticsReportFcra");
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
| **obbReportId** | **String**| Report ID generated and returned by OBB products | |
| **purpose** | **String**| 2-digit code from [Permissible Purpose Codes](https://developer.mastercard.com/open-banking-us/documentation/products/lend/report-handling/permissible-purpose-codes/), specifying the reason for retrieving this report. Required for retrieving some reports. | |

### Return type

[**ObbAnalyticsReport**](ObbAnalyticsReport.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/pdf


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OBB Analytics FCRA report data as JSON or PDF |  -  |
| **401** | Unauthorized request |  -  |
| **403** | Access forbidden |  -  |
| **404** | The resource doesn&#39;t exist |  -  |

