# CashFlowAnalyticsApi

All URIs are relative to *https://api.finicity.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateCashFlowAnalytics**](CashFlowAnalyticsApi.md#generateCashFlowAnalytics) | **POST** /analytics/cashflow/v1/customer/{customerId} | Generate Cash Flow Analytics |
| [**generateCashFlowAnalyticsFcra**](CashFlowAnalyticsApi.md#generateCashFlowAnalyticsFcra) | **POST** /analytics/cashflow/v1/customer/{customerId}/fcra | Generate Cash Flow Analytics - FCRA |
| [**generateCashflowAnalyticsReport**](CashFlowAnalyticsApi.md#generateCashflowAnalyticsReport) | **POST** /decisioning/v2/customers/{customerId}/reports/cashflow-analytics/userTypes/{userType} | Generate Cash Flow Analytics Report for the customer - Personal/Business |
| [**getObbAnalyticsReport**](CashFlowAnalyticsApi.md#getObbAnalyticsReport) | **GET** /analytics/data/v1/{obb_report_id} | Get OBB Analytics Report |
| [**getObbAnalyticsReportFcra**](CashFlowAnalyticsApi.md#getObbAnalyticsReportFcra) | **GET** /analytics/data/v1/{obb_report_id}/fcra | Get OBB Analytics Report - FCRA |



## generateCashFlowAnalytics

> ObbAnalyticsReportAck generateCashFlowAnalytics(customerId, balanceAndCashFlowAnalyticsReportConstraints, referenceNumber)

Generate Cash Flow Analytics

Cash Flow Analytics for Business analyzes cash flow over time to report metrics and identify behavior that may indicate risk.  Calculated metrics include: * Average transaction value by month over the requested time period * Net cash flow over the requested time period and broken down by month * Count and report of weeks in the requested time period where there   were zero transactions posted to the customer&#39;s accounts  * Minimum/maximum/average/sum/count of deposits by month * Minimum/maximum/average/sum/count of withdrawals by month * Estimated amount of deposits that can be classified as business   revenue  * Number of transactions posted incurring a non-sufficient funds (NSF)   fee, and net amount charged in NSF fees   This version of the API is intended for piloting and integration testing your application with the Cash Flow Analytics product. It does not adhere to FCRA requirements, and should not be used for production/lending purposes. See _Generate Cash Flow Analytics - FCRA_ for the FCRA compliant version of this API.  A successful call to this API will generate analytics and store a report within Finicity. The report can be retrieved via _Get Cash Flow Analytics Report_ (operation: _GetCashFlowAnalyticsReport_).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CashFlowAnalyticsApi;

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

        CashFlowAnalyticsApi apiInstance = new CashFlowAnalyticsApi(defaultClient);
        String customerId = "1005061234"; // String | A customer ID
        BalanceAndCashFlowAnalyticsReportConstraints balanceAndCashFlowAnalyticsReportConstraints = new BalanceAndCashFlowAnalyticsReportConstraints(); // BalanceAndCashFlowAnalyticsReportConstraints | 
        String referenceNumber = "abc123"; // String | Partner-provided reference number to correlate reports.
        try {
            ObbAnalyticsReportAck result = apiInstance.generateCashFlowAnalytics(customerId, balanceAndCashFlowAnalyticsReportConstraints, referenceNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CashFlowAnalyticsApi#generateCashFlowAnalytics");
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
| **200** | Response given when cash flow analytics were generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF. |  -  |
| **400** | A bad request was provided |  -  |
| **401** | Unauthorized request |  -  |
| **403** | Access forbidden |  -  |
| **404** | Resource not found |  -  |
| **409** | Resource conflict |  -  |


## generateCashFlowAnalyticsFcra

> ObbAnalyticsReportAck generateCashFlowAnalyticsFcra(customerId, balanceAndCashFlowAnalyticsReportConstraints, referenceNumber)

Generate Cash Flow Analytics - FCRA

Cash Flow Analytics for Business analyzes cash flow over time to report metrics and identify behavior that may indicate risk.  Calculated metrics include: * Average transaction value by month over the requested time period * Net cash flow over the requested time period and broken down by month * Count and report of weeks in the requested time period where there   were zero transactions posted to the customer&#39;s accounts  * Minimum/maximum/average/sum/count of deposits by month * Minimum/maximum/average/sum/count of withdrawals by month * Estimated amount of deposits that can be classified as business   revenue  * Number of transactions posted incurring a non-sufficient funds (NSF)   fee, and net amount charged in NSF fees   This version of the API is intended for production use. It maintains and enforces all compliance with FCRA rules and requirements.  *Note:* this is a premium service, billable per every successful API call for non-testing customers.  A successful call to this API will generate analytics and store a report within Finicity. The report can be retrieved via _Get Cash Flow Analytics Report - FCRA_ (operation: _GetCashFlowAnalyticsReportFCRA_).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CashFlowAnalyticsApi;

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

        CashFlowAnalyticsApi apiInstance = new CashFlowAnalyticsApi(defaultClient);
        String customerId = "1005061234"; // String | A customer ID
        BalanceAndCashFlowAnalyticsReportConstraints balanceAndCashFlowAnalyticsReportConstraints = new BalanceAndCashFlowAnalyticsReportConstraints(); // BalanceAndCashFlowAnalyticsReportConstraints | 
        String referenceNumber = "abc123"; // String | Partner-provided reference number to correlate reports.
        try {
            ObbAnalyticsReportAck result = apiInstance.generateCashFlowAnalyticsFcra(customerId, balanceAndCashFlowAnalyticsReportConstraints, referenceNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CashFlowAnalyticsApi#generateCashFlowAnalyticsFcra");
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
| **200** | Response given when cash flow analytics (FCRA) were generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF. |  -  |
| **400** | A bad request was provided |  -  |
| **401** | Unauthorized request |  -  |
| **403** | Access forbidden |  -  |
| **404** | Resource not found |  -  |
| **409** | Resource conflict |  -  |


## generateCashflowAnalyticsReport

> AnalyticsReportAck generateCashflowAnalyticsReport(customerId, userType, analyticsReportConstraints, callbackUrl)

Generate Cash Flow Analytics Report for the customer - Personal/Business

Generate a Cashflow Analytics Report for a given customer. This service retrieves up to two years of transaction history from connected accounts.  Cashflow Analytics analyzes transaction over time to report metrics and identify behavior that may indicate risk.  Before calling this API, a consumer or business may need to be created for the given customer ID based on the user type (see Consumer/Business APIs).  If no account type of checking or savings is found, the service will return HTTP 400 Bad Request.  This is a premium service, billable per every successful API call for non-testing customers. A successful call to this API will generate analytics report which can be retrieved via Get Report by Customer or Get Report by Consumer.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CashFlowAnalyticsApi;

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

        CashFlowAnalyticsApi apiInstance = new CashFlowAnalyticsApi(defaultClient);
        String customerId = "1005061234"; // String | A customer ID
        String userType = "personal"; // String | UserType indicates if the request is for a business or personal use case, Allowed values: business/personal.
        AnalyticsReportConstraints analyticsReportConstraints = new AnalyticsReportConstraints(); // AnalyticsReportConstraints | 
        String callbackUrl = "https://finicity-test/webhook"; // String | A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code.
        try {
            AnalyticsReportAck result = apiInstance.generateCashflowAnalyticsReport(customerId, userType, analyticsReportConstraints, callbackUrl);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CashFlowAnalyticsApi#generateCashflowAnalyticsReport");
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
import org.openapitools.client.api.CashFlowAnalyticsApi;

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

        CashFlowAnalyticsApi apiInstance = new CashFlowAnalyticsApi(defaultClient);
        String obbReportId = "bcab9592-e032-4e7b-b737-0380619a0573"; // String | Report ID generated and returned by OBB products
        try {
            ObbAnalyticsReport result = apiInstance.getObbAnalyticsReport(obbReportId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CashFlowAnalyticsApi#getObbAnalyticsReport");
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
import org.openapitools.client.api.CashFlowAnalyticsApi;

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

        CashFlowAnalyticsApi apiInstance = new CashFlowAnalyticsApi(defaultClient);
        String obbReportId = "bcab9592-e032-4e7b-b737-0380619a0573"; // String | Report ID generated and returned by OBB products
        String purpose = "3F"; // String | 2-digit code from [Permissible Purpose Codes](https://developer.mastercard.com/open-banking-us/documentation/products/lend/report-handling/permissible-purpose-codes/), specifying the reason for retrieving this report. Required for retrieving some reports.
        try {
            ObbAnalyticsReport result = apiInstance.getObbAnalyticsReportFcra(obbReportId, purpose);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CashFlowAnalyticsApi#getObbAnalyticsReportFcra");
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

