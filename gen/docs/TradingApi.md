# TradingApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**publicApiV1TradeAcceptTradeidPost**](TradingApi.md#publicApiV1TradeAcceptTradeidPost) | **POST** /public-api/v1/trade/accept/{tradeid} | Accept Trade |
| [**publicApiV1TradeCancelTradeidPost**](TradingApi.md#publicApiV1TradeCancelTradeidPost) | **POST** /public-api/v1/trade/cancel/{tradeid} | Accept Trade |
| [**publicApiV1TradeCreateRecipientUseridPost**](TradingApi.md#publicApiV1TradeCreateRecipientUseridPost) | **POST** /public-api/v1/trade/create/{recipient_userid} | Create Trade |
| [**publicApiV1TradeDeclineTradeidPost**](TradingApi.md#publicApiV1TradeDeclineTradeidPost) | **POST** /public-api/v1/trade/decline/{tradeid} | Accept Trade |
| [**publicApiV1TradeListGet**](TradingApi.md#publicApiV1TradeListGet) | **GET** /public-api/v1/trade/list | List Trades |
| [**publicApiV1TradeTradeidGet**](TradingApi.md#publicApiV1TradeTradeidGet) | **GET** /public-api/v1/trade/{tradeid} | Get Trade by ID |



## publicApiV1TradeAcceptTradeidPost

> PublicApiV1TradeAcceptTradeidPost200Response publicApiV1TradeAcceptTradeidPost(tradeid, publicApiV1TradeAcceptTradeidPostRequest)

Accept Trade

Accept a trade with the specified trade ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TradingApi apiInstance = new TradingApi(defaultClient);
        Integer tradeid = 56; // Integer | The ID of the trade.
        PublicApiV1TradeAcceptTradeidPostRequest publicApiV1TradeAcceptTradeidPostRequest = new PublicApiV1TradeAcceptTradeidPostRequest(); // PublicApiV1TradeAcceptTradeidPostRequest | 
        try {
            PublicApiV1TradeAcceptTradeidPost200Response result = apiInstance.publicApiV1TradeAcceptTradeidPost(tradeid, publicApiV1TradeAcceptTradeidPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingApi#publicApiV1TradeAcceptTradeidPost");
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
| **tradeid** | **Integer**| The ID of the trade. | |
| **publicApiV1TradeAcceptTradeidPostRequest** | [**PublicApiV1TradeAcceptTradeidPostRequest**](PublicApiV1TradeAcceptTradeidPostRequest.md)|  | |

### Return type

[**PublicApiV1TradeAcceptTradeidPost200Response**](PublicApiV1TradeAcceptTradeidPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Trade acceptance was successful |  -  |
| **400** | Bad request or error in trade acceptance |  -  |


## publicApiV1TradeCancelTradeidPost

> PublicApiV1TradeAcceptTradeidPost200Response publicApiV1TradeCancelTradeidPost(tradeid)

Accept Trade

Accept a trade with the specified trade ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TradingApi apiInstance = new TradingApi(defaultClient);
        Integer tradeid = 56; // Integer | The ID of the trade.
        try {
            PublicApiV1TradeAcceptTradeidPost200Response result = apiInstance.publicApiV1TradeCancelTradeidPost(tradeid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingApi#publicApiV1TradeCancelTradeidPost");
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
| **tradeid** | **Integer**| The ID of the trade. | |

### Return type

[**PublicApiV1TradeAcceptTradeidPost200Response**](PublicApiV1TradeAcceptTradeidPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Trade acceptance was successful |  -  |
| **400** | Bad request or error in trade acceptance |  -  |


## publicApiV1TradeCreateRecipientUseridPost

> PublicApiV1TradeCreateRecipientUseridPost200Response publicApiV1TradeCreateRecipientUseridPost(recipientUserid, publicApiV1TradeCreateRecipientUseridPostRequest)

Create Trade

Create a trade request with the specified recipient user.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TradingApi apiInstance = new TradingApi(defaultClient);
        Integer recipientUserid = 56; // Integer | The ID of the recipient user.
        PublicApiV1TradeCreateRecipientUseridPostRequest publicApiV1TradeCreateRecipientUseridPostRequest = new PublicApiV1TradeCreateRecipientUseridPostRequest(); // PublicApiV1TradeCreateRecipientUseridPostRequest | 
        try {
            PublicApiV1TradeCreateRecipientUseridPost200Response result = apiInstance.publicApiV1TradeCreateRecipientUseridPost(recipientUserid, publicApiV1TradeCreateRecipientUseridPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingApi#publicApiV1TradeCreateRecipientUseridPost");
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
| **recipientUserid** | **Integer**| The ID of the recipient user. | |
| **publicApiV1TradeCreateRecipientUseridPostRequest** | [**PublicApiV1TradeCreateRecipientUseridPostRequest**](PublicApiV1TradeCreateRecipientUseridPostRequest.md)|  | |

### Return type

[**PublicApiV1TradeCreateRecipientUseridPost200Response**](PublicApiV1TradeCreateRecipientUseridPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Trade request was successful |  -  |
| **400** | Bad request or error in trade creation |  -  |


## publicApiV1TradeDeclineTradeidPost

> PublicApiV1TradeAcceptTradeidPost200Response publicApiV1TradeDeclineTradeidPost(tradeid)

Accept Trade

Accept a trade with the specified trade ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TradingApi apiInstance = new TradingApi(defaultClient);
        Integer tradeid = 56; // Integer | The ID of the trade.
        try {
            PublicApiV1TradeAcceptTradeidPost200Response result = apiInstance.publicApiV1TradeDeclineTradeidPost(tradeid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingApi#publicApiV1TradeDeclineTradeidPost");
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
| **tradeid** | **Integer**| The ID of the trade. | |

### Return type

[**PublicApiV1TradeAcceptTradeidPost200Response**](PublicApiV1TradeAcceptTradeidPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Trade acceptance was successful |  -  |
| **400** | Bad request or error in trade acceptance |  -  |


## publicApiV1TradeListGet

> PublicApiV1TradeListGet200Response publicApiV1TradeListGet()

List Trades

List trades for the authenticated user.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TradingApi apiInstance = new TradingApi(defaultClient);
        try {
            PublicApiV1TradeListGet200Response result = apiInstance.publicApiV1TradeListGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingApi#publicApiV1TradeListGet");
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

[**PublicApiV1TradeListGet200Response**](PublicApiV1TradeListGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Not Logged In |  -  |


## publicApiV1TradeTradeidGet

> PublicApiV1TradeTradeidGet200Response publicApiV1TradeTradeidGet(tradeid)

Get Trade by ID

Retrieve trade information by trade ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TradingApi apiInstance = new TradingApi(defaultClient);
        Integer tradeid = 56; // Integer | The ID of the trade.
        try {
            PublicApiV1TradeTradeidGet200Response result = apiInstance.publicApiV1TradeTradeidGet(tradeid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingApi#publicApiV1TradeTradeidGet");
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
| **tradeid** | **Integer**| The ID of the trade. | |

### Return type

[**PublicApiV1TradeTradeidGet200Response**](PublicApiV1TradeTradeidGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

