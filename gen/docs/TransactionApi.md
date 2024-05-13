# TransactionApi

All URIs are relative to *http://localhost:8000*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**transactionsGet**](TransactionApi.md#transactionsGet) | **GET** /transactions | Retrieve all transactions |
| [**transactionsIdDelete**](TransactionApi.md#transactionsIdDelete) | **DELETE** /transactions/{id} | Delete a specific transaction |
| [**transactionsIdGet**](TransactionApi.md#transactionsIdGet) | **GET** /transactions/{id} | Retrieve a specific transaction |
| [**transactionsIdPatch**](TransactionApi.md#transactionsIdPatch) | **PATCH** /transactions/{id} | Partially update a specific transaction by ID |
| [**transactionsIdPut**](TransactionApi.md#transactionsIdPut) | **PUT** /transactions/{id} | Update a specific transaction by ID |
| [**transactionsPost**](TransactionApi.md#transactionsPost) | **POST** /transactions | Create a new transaction |



## transactionsGet

> transactionsGet()

Retrieve all transactions

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        try {
            apiInstance.transactionsGet();
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionsGet");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |


## transactionsIdDelete

> transactionsIdDelete(id)

Delete a specific transaction

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        Integer id = 2; // Integer | ID of the transaction to delete
        try {
            apiInstance.transactionsIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionsIdDelete");
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
| **id** | **Integer**| ID of the transaction to delete | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The transaction was successfully deleted. |  -  |
| **404** | The requested transaction could not be found. |  -  |


## transactionsIdGet

> transactionsIdGet(id)

Retrieve a specific transaction

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        Integer id = 2; // Integer | ID of the transaction to retrieve
        try {
            apiInstance.transactionsIdGet(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionsIdGet");
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
| **id** | **Integer**| ID of the transaction to retrieve | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **404** | The requested transaction could not be found. |  -  |


## transactionsIdPatch

> transactionsIdPatch(id, transactionsIdPatchRequest)

Partially update a specific transaction by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        Integer id = 2; // Integer | ID of the transaction to update
        TransactionsIdPatchRequest transactionsIdPatchRequest = new TransactionsIdPatchRequest(); // TransactionsIdPatchRequest | 
        try {
            apiInstance.transactionsIdPatch(id, transactionsIdPatchRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionsIdPatch");
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
| **id** | **Integer**| ID of the transaction to update | |
| **transactionsIdPatchRequest** | [**TransactionsIdPatchRequest**](TransactionsIdPatchRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **400** | The request body is missing or contains invalid parameters. |  -  |
| **404** | The requested transaction could not be found. |  -  |


## transactionsIdPut

> transactionsIdPut(id, transactionsPostRequest)

Update a specific transaction by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        Integer id = 2; // Integer | ID of the transaction to update
        TransactionsPostRequest transactionsPostRequest = new TransactionsPostRequest(); // TransactionsPostRequest | 
        try {
            apiInstance.transactionsIdPut(id, transactionsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionsIdPut");
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
| **id** | **Integer**| ID of the transaction to update | |
| **transactionsPostRequest** | [**TransactionsPostRequest**](TransactionsPostRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **400** | The request body is missing or contains invalid parameters. |  -  |
| **404** | The requested transaction could not be found. |  -  |


## transactionsPost

> transactionsPost(transactionsPostRequest)

Create a new transaction

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        TransactionsPostRequest transactionsPostRequest = new TransactionsPostRequest(); // TransactionsPostRequest | 
        try {
            apiInstance.transactionsPost(transactionsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionsPost");
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
| **transactionsPostRequest** | [**TransactionsPostRequest**](TransactionsPostRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The transaction was successfully created. |  -  |
| **400** | The request body is missing or contains invalid parameters. |  -  |

