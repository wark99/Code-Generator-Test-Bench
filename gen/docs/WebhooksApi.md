# WebhooksApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createIncomingWebhook**](WebhooksApi.md#createIncomingWebhook) | **POST** /hooks/incoming | Create an incoming webhook |
| [**createOutgoingWebhook**](WebhooksApi.md#createOutgoingWebhook) | **POST** /hooks/outgoing | Create an outgoing webhook |
| [**deleteIncomingWebhook**](WebhooksApi.md#deleteIncomingWebhook) | **DELETE** /hooks/incoming/{hook_id} | Delete an incoming webhook |
| [**deleteOutgoingWebhook**](WebhooksApi.md#deleteOutgoingWebhook) | **DELETE** /hooks/outgoing/{hook_id} | Delete an outgoing webhook |
| [**getIncomingWebhook**](WebhooksApi.md#getIncomingWebhook) | **GET** /hooks/incoming/{hook_id} | Get an incoming webhook |
| [**getIncomingWebhooks**](WebhooksApi.md#getIncomingWebhooks) | **GET** /hooks/incoming | List incoming webhooks |
| [**getOutgoingWebhook**](WebhooksApi.md#getOutgoingWebhook) | **GET** /hooks/outgoing/{hook_id} | Get an outgoing webhook |
| [**getOutgoingWebhooks**](WebhooksApi.md#getOutgoingWebhooks) | **GET** /hooks/outgoing | List outgoing webhooks |
| [**regenOutgoingHookToken**](WebhooksApi.md#regenOutgoingHookToken) | **POST** /hooks/outgoing/{hook_id}/regen_token | Regenerate the token for the outgoing webhook. |
| [**updateIncomingWebhook**](WebhooksApi.md#updateIncomingWebhook) | **PUT** /hooks/incoming/{hook_id} | Update an incoming webhook |
| [**updateOutgoingWebhook**](WebhooksApi.md#updateOutgoingWebhook) | **PUT** /hooks/outgoing/{hook_id} | Update an outgoing webhook |



## createIncomingWebhook

> IncomingWebhook createIncomingWebhook(createIncomingWebhookRequest)

Create an incoming webhook

Create an incoming webhook for a channel. ##### Permissions &#x60;manage_webhooks&#x60; for the team the webhook is in.  &#x60;manage_others_incoming_webhooks&#x60; for the team the webhook is in if the user is different than the requester. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        CreateIncomingWebhookRequest createIncomingWebhookRequest = new CreateIncomingWebhookRequest(); // CreateIncomingWebhookRequest | Incoming webhook to be created
        try {
            IncomingWebhook result = apiInstance.createIncomingWebhook(createIncomingWebhookRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#createIncomingWebhook");
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
| **createIncomingWebhookRequest** | [**CreateIncomingWebhookRequest**](CreateIncomingWebhookRequest.md)| Incoming webhook to be created | |

### Return type

[**IncomingWebhook**](IncomingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Incoming webhook creation successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## createOutgoingWebhook

> OutgoingWebhook createOutgoingWebhook(createOutgoingWebhookRequest)

Create an outgoing webhook

Create an outgoing webhook for a team. ##### Permissions &#x60;manage_webhooks&#x60; for the team the webhook is in.  &#x60;manage_others_outgoing_webhooks&#x60; for the team the webhook is in if the user is different than the requester. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        CreateOutgoingWebhookRequest createOutgoingWebhookRequest = new CreateOutgoingWebhookRequest(); // CreateOutgoingWebhookRequest | Outgoing webhook to be created
        try {
            OutgoingWebhook result = apiInstance.createOutgoingWebhook(createOutgoingWebhookRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#createOutgoingWebhook");
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
| **createOutgoingWebhookRequest** | [**CreateOutgoingWebhookRequest**](CreateOutgoingWebhookRequest.md)| Outgoing webhook to be created | |

### Return type

[**OutgoingWebhook**](OutgoingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Outgoing webhook creation successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## deleteIncomingWebhook

> StatusOK deleteIncomingWebhook(hookId)

Delete an incoming webhook

Delete an incoming webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String hookId = "hookId_example"; // String | Incoming webhook GUID
        try {
            StatusOK result = apiInstance.deleteIncomingWebhook(hookId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#deleteIncomingWebhook");
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
| **hookId** | **String**| Incoming webhook GUID | |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook deletion successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## deleteOutgoingWebhook

> StatusOK deleteOutgoingWebhook(hookId)

Delete an outgoing webhook

Delete an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String hookId = "hookId_example"; // String | Outgoing webhook GUID
        try {
            StatusOK result = apiInstance.deleteOutgoingWebhook(hookId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#deleteOutgoingWebhook");
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
| **hookId** | **String**| Outgoing webhook GUID | |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook deletion successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getIncomingWebhook

> IncomingWebhook getIncomingWebhook(hookId)

Get an incoming webhook

Get an incoming webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String hookId = "hookId_example"; // String | Incoming Webhook GUID
        try {
            IncomingWebhook result = apiInstance.getIncomingWebhook(hookId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#getIncomingWebhook");
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
| **hookId** | **String**| Incoming Webhook GUID | |

### Return type

[**IncomingWebhook**](IncomingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getIncomingWebhooks

> List&lt;IncomingWebhook&gt; getIncomingWebhooks(page, perPage, teamId)

List incoming webhooks

Get a page of a list of incoming webhooks. Optionally filter for a specific team using query parameters. ##### Permissions &#x60;manage_webhooks&#x60; for the system or &#x60;manage_webhooks&#x60; for the specific team. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of hooks per page.
        String teamId = "teamId_example"; // String | The ID of the team to get hooks for.
        try {
            List<IncomingWebhook> result = apiInstance.getIncomingWebhooks(page, perPage, teamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#getIncomingWebhooks");
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
| **page** | **Integer**| The page to select. | [optional] [default to 0] |
| **perPage** | **Integer**| The number of hooks per page. | [optional] [default to 60] |
| **teamId** | **String**| The ID of the team to get hooks for. | [optional] |

### Return type

[**List&lt;IncomingWebhook&gt;**](IncomingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Incoming webhooks retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getOutgoingWebhook

> OutgoingWebhook getOutgoingWebhook(hookId)

Get an outgoing webhook

Get an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String hookId = "hookId_example"; // String | Outgoing webhook GUID
        try {
            OutgoingWebhook result = apiInstance.getOutgoingWebhook(hookId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#getOutgoingWebhook");
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
| **hookId** | **String**| Outgoing webhook GUID | |

### Return type

[**OutgoingWebhook**](OutgoingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Outgoing webhook retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getOutgoingWebhooks

> List&lt;OutgoingWebhook&gt; getOutgoingWebhooks(page, perPage, teamId, channelId)

List outgoing webhooks

Get a page of a list of outgoing webhooks. Optionally filter for a specific team or channel using query parameters. ##### Permissions &#x60;manage_webhooks&#x60; for the system or &#x60;manage_webhooks&#x60; for the specific team/channel. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of hooks per page.
        String teamId = "teamId_example"; // String | The ID of the team to get hooks for.
        String channelId = "channelId_example"; // String | The ID of the channel to get hooks for.
        try {
            List<OutgoingWebhook> result = apiInstance.getOutgoingWebhooks(page, perPage, teamId, channelId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#getOutgoingWebhooks");
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
| **page** | **Integer**| The page to select. | [optional] [default to 0] |
| **perPage** | **Integer**| The number of hooks per page. | [optional] [default to 60] |
| **teamId** | **String**| The ID of the team to get hooks for. | [optional] |
| **channelId** | **String**| The ID of the channel to get hooks for. | [optional] |

### Return type

[**List&lt;OutgoingWebhook&gt;**](OutgoingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Outgoing webhooks retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## regenOutgoingHookToken

> StatusOK regenOutgoingHookToken(hookId)

Regenerate the token for the outgoing webhook.

Regenerate the token for the outgoing webhook. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String hookId = "hookId_example"; // String | Outgoing webhook GUID
        try {
            StatusOK result = apiInstance.regenOutgoingHookToken(hookId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#regenOutgoingHookToken");
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
| **hookId** | **String**| Outgoing webhook GUID | |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook token regenerate successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## updateIncomingWebhook

> IncomingWebhook updateIncomingWebhook(hookId, updateIncomingWebhookRequest)

Update an incoming webhook

Update an incoming webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String hookId = "hookId_example"; // String | Incoming Webhook GUID
        UpdateIncomingWebhookRequest updateIncomingWebhookRequest = new UpdateIncomingWebhookRequest(); // UpdateIncomingWebhookRequest | Incoming webhook to be updated
        try {
            IncomingWebhook result = apiInstance.updateIncomingWebhook(hookId, updateIncomingWebhookRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#updateIncomingWebhook");
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
| **hookId** | **String**| Incoming Webhook GUID | |
| **updateIncomingWebhookRequest** | [**UpdateIncomingWebhookRequest**](UpdateIncomingWebhookRequest.md)| Incoming webhook to be updated | |

### Return type

[**IncomingWebhook**](IncomingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook update successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## updateOutgoingWebhook

> OutgoingWebhook updateOutgoingWebhook(hookId, updateOutgoingWebhookRequest)

Update an outgoing webhook

Update an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String hookId = "hookId_example"; // String | outgoing Webhook GUID
        UpdateOutgoingWebhookRequest updateOutgoingWebhookRequest = new UpdateOutgoingWebhookRequest(); // UpdateOutgoingWebhookRequest | Outgoing webhook to be updated
        try {
            OutgoingWebhook result = apiInstance.updateOutgoingWebhook(hookId, updateOutgoingWebhookRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#updateOutgoingWebhook");
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
| **hookId** | **String**| outgoing Webhook GUID | |
| **updateOutgoingWebhookRequest** | [**UpdateOutgoingWebhookRequest**](UpdateOutgoingWebhookRequest.md)| Outgoing webhook to be updated | |

### Return type

[**OutgoingWebhook**](OutgoingWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook update successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |

