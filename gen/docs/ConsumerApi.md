# ConsumerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**consumerAddNewConsumerPost**](ConsumerApi.md#consumerAddNewConsumerPost) | **POST** /consumer/addNewConsumer | Add a new consumer |
| [**consumerConsumerIDGet**](ConsumerApi.md#consumerConsumerIDGet) | **GET** /consumer/{consumerID} | Get consumer by ID |
| [**consumerDeleteConsumerConsumerIDDelete**](ConsumerApi.md#consumerDeleteConsumerConsumerIDDelete) | **DELETE** /consumer/deleteConsumer/{consumerID} | Delete consumer by ID |
| [**consumerGetconsumersGet**](ConsumerApi.md#consumerGetconsumersGet) | **GET** /consumer/getconsumers | Get all consumers |
| [**consumerUpdateConsumerConsumerIDPut**](ConsumerApi.md#consumerUpdateConsumerConsumerIDPut) | **PUT** /consumer/updateConsumer/{consumerID} | Update consumer by ID |



## consumerAddNewConsumerPost

> consumerAddNewConsumerPost(consumer)

Add a new consumer

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConsumerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ConsumerApi apiInstance = new ConsumerApi(defaultClient);
        Consumer consumer = new Consumer(); // Consumer | 
        try {
            apiInstance.consumerAddNewConsumerPost(consumer);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsumerApi#consumerAddNewConsumerPost");
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
| **consumer** | [**Consumer**](Consumer.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |


## consumerConsumerIDGet

> Consumer consumerConsumerIDGet(consumerID)

Get consumer by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConsumerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ConsumerApi apiInstance = new ConsumerApi(defaultClient);
        Integer consumerID = 56; // Integer | ID of the consumer to get
        try {
            Consumer result = apiInstance.consumerConsumerIDGet(consumerID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsumerApi#consumerConsumerIDGet");
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
| **consumerID** | **Integer**| ID of the consumer to get | |

### Return type

[**Consumer**](Consumer.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |


## consumerDeleteConsumerConsumerIDDelete

> consumerDeleteConsumerConsumerIDDelete(consumerID)

Delete consumer by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConsumerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ConsumerApi apiInstance = new ConsumerApi(defaultClient);
        Integer consumerID = 56; // Integer | ID of the consumer to delete
        try {
            apiInstance.consumerDeleteConsumerConsumerIDDelete(consumerID);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsumerApi#consumerDeleteConsumerConsumerIDDelete");
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
| **consumerID** | **Integer**| ID of the consumer to delete | |

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
| **200** | Successful operation |  -  |


## consumerGetconsumersGet

> List&lt;Consumer&gt; consumerGetconsumersGet()

Get all consumers

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConsumerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ConsumerApi apiInstance = new ConsumerApi(defaultClient);
        try {
            List<Consumer> result = apiInstance.consumerGetconsumersGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsumerApi#consumerGetconsumersGet");
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

[**List&lt;Consumer&gt;**](Consumer.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |


## consumerUpdateConsumerConsumerIDPut

> consumerUpdateConsumerConsumerIDPut(consumerID, consumer)

Update consumer by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConsumerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ConsumerApi apiInstance = new ConsumerApi(defaultClient);
        Integer consumerID = 56; // Integer | ID of the consumer to update
        Consumer consumer = new Consumer(); // Consumer | 
        try {
            apiInstance.consumerUpdateConsumerConsumerIDPut(consumerID, consumer);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConsumerApi#consumerUpdateConsumerConsumerIDPut");
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
| **consumerID** | **Integer**| ID of the consumer to update | |
| **consumer** | [**Consumer**](Consumer.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |

