# BalanceAnalyticsApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateBalanceAnalytics**](BalanceAnalyticsApi.md#generateBalanceAnalytics) | **POST** /analytics/balance/v1/customer/{customerId} | Generate Balance Analytics |
| [**generateBalanceAnalyticsFcra**](BalanceAnalyticsApi.md#generateBalanceAnalyticsFcra) | **POST** /analytics/balance/v1/customer/{customerId}/fcra | Generate Balance Analytics - FCRA |
| [**generateBalanceAnalyticsReport**](BalanceAnalyticsApi.md#generateBalanceAnalyticsReport) | **POST** /decisioning/v2/customers/{customerId}/reports/balance-analytics/userTypes/{userType} | Generate Balance Analytics Report for the customer - Personal/Business |
| [**getObbAnalyticsReport**](BalanceAnalyticsApi.md#getObbAnalyticsReport) | **GET** /analytics/data/v1/{obb_report_id} | Get OBB Analytics Report |
| [**getObbAnalyticsReportFcra**](BalanceAnalyticsApi.md#getObbAnalyticsReportFcra) | **GET** /analytics/data/v1/{obb_report_id}/fcra | Get OBB Analytics Report - FCRA |



## generateBalanceAnalytics

> ObbAnalyticsReportAck generateBalanceAnalytics(customerId, balanceAndCashFlowAnalyticsReportConstraints, referenceNumber)

Generate Balance Analytics

Balance Analytics for Business analyzes bank balances over time to report metrics and identify behavior that may indicate risk.  Calculated metrics include: * Current/available account balances * Minimum/maximum/average account balances over the requested time   period and broken down by month  * Daily ending balance of accounts for each day in the requested time   period  * Propensity of the customer&#39;s account balances to increase week over   week  * Number of days in the requested time period ending with a negative   balance   This version of the API is intended for piloting and integration testing your application with the Balance Analytics product. It does not adhere to FCRA requirements, and should not be used for production/lending purposes. See _Generate Balance Analytics - FCRA_ for the FCRA compliant version of this API.  A successful call to this API will generate analytics and store a report within Finicity. The report can be retrieved via _Get Balance Analytics Report_ (operation: _GetObbAnalyticsReport_).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BalanceAnalyticsApi;

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

        BalanceAnalyticsApi apiInstance = new BalanceAnalyticsApi(defaultClient);
        String customerId = "1005061234"; // String | A customer ID
        BalanceAndCashFlowAnalyticsReportConstraints balanceAndCashFlowAnalyticsReportConstraints = new BalanceAndCashFlowAnalyticsReportConstraints(); // BalanceAndCashFlowAnalyticsReportConstraints | 
        String referenceNumber = "abc123"; // String | Partner-provided reference number to correlate reports.
        try {
            ObbAnalyticsReportAck result = apiInstance.generateBalanceAnalytics(customerId, balanceAndCashFlowAnalyticsReportConstraints, referenceNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceAnalyticsApi#generateBalanceAnalytics");
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
| **balanceAndCashFlowAnalyticsReportConstraints** | [**BalanceAndCashFlowAnalyticsReportConstraints**](BalanceAndCashFlowAnalyticsReportConstraints.md)|  | |
| **referenceNumber** | **String**| Partner-provided reference number to correlate reports. | [optional] |

### Return type

[**ObbAnalyticsReportAck**](ObbAnalyticsReportAck.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response given when balance analytics were generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF. |  -  |
| **400** | A bad request was provided |  -  |
| **401** | Unauthorized request |  -  |
| **403** | Access forbidden |  -  |
| **404** | Resource not found |  -  |
| **409** | Resource conflict |  -  |


## generateBalanceAnalyticsFcra

> ObbAnalyticsReportAck generateBalanceAnalyticsFcra(customerId, balanceAndCashFlowAnalyticsReportConstraints, referenceNumber)

Generate Balance Analytics - FCRA

Balance Analytics for Business analyzes bank balances over time to report metrics and identify behavior that may indicate risk.  Calculated metrics include: * Current/available account balances * Minimum/maximum/average account balances over the requested time   period and broken down by month  * Daily ending balance of accounts for each day in the requested time   period  * Propensity of the customer&#39;s account balances to increase week over   week  * Number of days in the requested time period ending with a negative   balance   This version of the API is intended for production use. It maintains and enforces all compliance with FCRA rules and requirements.  *Note:* this is a premium service, billable per every successful API call for non-testing customers.  A successful call to this API will generate analytics and store a report within Finicity. The report can be retrieved via _Get Balance Analytics Report - FCRA_ (operation: _GetObbAnalyticsReportFCRA_).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BalanceAnalyticsApi;

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

        BalanceAnalyticsApi apiInstance = new BalanceAnalyticsApi(defaultClient);
        String customerId = "1005061234"; // String | A customer ID
        BalanceAndCashFlowAnalyticsReportConstraints balanceAndCashFlowAnalyticsReportConstraints = new BalanceAndCashFlowAnalyticsReportConstraints(); // BalanceAndCashFlowAnalyticsReportConstraints | 
        String referenceNumber = "abc123"; // String | Partner-provided reference number to correlate reports.
        try {
            ObbAnalyticsReportAck result = apiInstance.generateBalanceAnalyticsFcra(customerId, balanceAndCashFlowAnalyticsReportConstraints, referenceNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceAnalyticsApi#generateBalanceAnalyticsFcra");
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
| **balanceAndCashFlowAnalyticsReportConstraints** | [**BalanceAndCashFlowAnalyticsReportConstraints**](BalanceAndCashFlowAnalyticsReportConstraints.md)|  | |
| **referenceNumber** | **String**| Partner-provided reference number to correlate reports. | [optional] |

### Return type

[**ObbAnalyticsReportAck**](ObbAnalyticsReportAck.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response given when balance analytics (FCRA) were generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF. |  -  |
| **400** | A bad request was provided |  -  |
| **401** | Unauthorized request |  -  |
| **403** | Access forbidden |  -  |
| **404** | Resource not found |  -  |
| **409** | Resource conflict |  -  |


## generateBalanceAnalyticsReport

> AnalyticsReportAck generateBalanceAnalyticsReport(customerId, userType, analyticsReportConstraints, callbackUrl)

Generate Balance Analytics Report for the customer - Personal/Business

Generate a Balance Analytics Report for a given customer. This service retrieves up to two years of transaction history from connected accounts.  Balance  Analytics analyzes bank balances over time to report metrics and identify behavior that may indicate risk.  Before calling this API, a consumer or business may need to be created for the given customer ID based on the user type (see Consumer/Business APIs).  If no account type of checking or savings is found, the service will return HTTP 400 Bad Request.  This is a premium service, billable per every successful API call for non-testing customers. A successful call to this API will generate analytics report which can be retrieved via Get Report by Customer or Get Report by Consumer.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BalanceAnalyticsApi;

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

        BalanceAnalyticsApi apiInstance = new BalanceAnalyticsApi(defaultClient);
        String customerId = "1005061234"; // String | A customer ID
        String userType = "personal"; // String | UserType indicates if the request is for a business or personal use case, Allowed values: business/personal.
        AnalyticsReportConstraints analyticsReportConstraints = new AnalyticsReportConstraints(); // AnalyticsReportConstraints | 
        String callbackUrl = "https://finicity-test/webhook"; // String | A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code.
        try {
            AnalyticsReportAck result = apiInstance.generateBalanceAnalyticsReport(customerId, userType, analyticsReportConstraints, callbackUrl);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceAnalyticsApi#generateBalanceAnalyticsReport");
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
| **userType** | **String**| UserType indicates if the request is for a business or personal use case, Allowed values: business/personal. | |
| **analyticsReportConstraints** | [**AnalyticsReportConstraints**](AnalyticsReportConstraints.md)|  | |
| **callbackUrl** | **String**| A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. | [optional] |

### Return type

[**AnalyticsReportAck**](AnalyticsReportAck.md)

### Authorization

[FinicityAppToken](../README.md#FinicityAppToken), [FinicityAppKey](../README.md#FinicityAppKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status. |  * Location - Please Check the Report status at URL /decisioning/v4/consumers/{consumer_id}/reports/{report_id} /decisioning/v4/customers/{customer_id}/reports/{report_id} <br>  |
| **400** | The request was rejected |  -  |
| **401** | The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;. |  -  |
| **403** | The active security freeze for this consumer exists. |  -  |
| **404** | The resource doesn&#39;t exist |  -  |


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
import org.openapitools.client.api.BalanceAnalyticsApi;

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

        BalanceAnalyticsApi apiInstance = new BalanceAnalyticsApi(defaultClient);
        String obbReportId = "bcab9592-e032-4e7b-b737-0380619a0573"; // String | Report ID generated and returned by OBB products
        try {
            ObbAnalyticsReport result = apiInstance.getObbAnalyticsReport(obbReportId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceAnalyticsApi#getObbAnalyticsReport");
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
import org.openapitools.client.api.BalanceAnalyticsApi;

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

        BalanceAnalyticsApi apiInstance = new BalanceAnalyticsApi(defaultClient);
        String obbReportId = "bcab9592-e032-4e7b-b737-0380619a0573"; // String | Report ID generated and returned by OBB products
        String purpose = "3F"; // String | 2-digit code from [Permissible Purpose Codes](https://developer.mastercard.com/open-banking-us/documentation/products/lend/report-handling/permissible-purpose-codes/), specifying the reason for retrieving this report. Required for retrieving some reports.
        try {
            ObbAnalyticsReport result = apiInstance.getObbAnalyticsReportFcra(obbReportId, purpose);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BalanceAnalyticsApi#getObbAnalyticsReportFcra");
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

