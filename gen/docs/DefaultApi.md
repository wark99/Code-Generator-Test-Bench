# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dataPost**](DefaultApi.md#dataPost) | **POST** /data | Handles incoming data and process them. |
| [**hostnameCriticalsGet**](DefaultApi.md#hostnameCriticalsGet) | **GET** /{hostname}/criticals | Get the report of critical components. |
| [**hostnameFansGet**](DefaultApi.md#hostnameFansGet) | **GET** /{hostname}/fans | Get the fan report. |
| [**hostnameFirmwaresGet**](DefaultApi.md#hostnameFirmwaresGet) | **GET** /{hostname}/firmwares | Get the firmware report. |
| [**hostnameFullreportGet**](DefaultApi.md#hostnameFullreportGet) | **GET** /{hostname}/fullreport | Get the full report. |
| [**hostnameLedGet**](DefaultApi.md#hostnameLedGet) | **GET** /{hostname}/led | Get the current state of enclosure LED for the specified hostname. |
| [**hostnameLedPatch**](DefaultApi.md#hostnameLedPatch) | **PATCH** /{hostname}/led | Set enclosure LED status for the specified hostname. |
| [**hostnameMemoryGet**](DefaultApi.md#hostnameMemoryGet) | **GET** /{hostname}/memory | Get the memory report. |
| [**hostnameNetworkGet**](DefaultApi.md#hostnameNetworkGet) | **GET** /{hostname}/network | Get the report for network hardware. |
| [**hostnamePowerGet**](DefaultApi.md#hostnamePowerGet) | **GET** /{hostname}/power | Get the power supply report. |
| [**hostnameProcessorsGet**](DefaultApi.md#hostnameProcessorsGet) | **GET** /{hostname}/processors | Get the cpu report. |
| [**hostnameStorageGet**](DefaultApi.md#hostnameStorageGet) | **GET** /{hostname}/storage | Get the storage disks report for. |
| [**hostnameSummaryGet**](DefaultApi.md#hostnameSummaryGet) | **GET** /{hostname}/summary | Get the a brief summary of hardware status. |
| [**idracPost**](DefaultApi.md#idracPost) | **POST** /idrac | Get the iDrac details for a given host. |



## dataPost

> dataPost(dataPostRequest)

Handles incoming data and process them.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        DataPostRequest dataPostRequest = new DataPostRequest(); // DataPostRequest | 
        try {
            apiInstance.dataPost(dataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#dataPost");
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
| **dataPostRequest** | [**DataPostRequest**](DataPostRequest.md)|  | |

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
| **200** | Success, data processed. |  -  |
| **400** | Some fields are missing in the provided data. |  -  |
| **403** | Invalid keyring provided. |  -  |


## hostnameCriticalsGet

> hostnameCriticalsGet(hostname)

Get the report of critical components.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String hostname = "hostname_example"; // String | 
        try {
            apiInstance.hostnameCriticalsGet(hostname);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#hostnameCriticalsGet");
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
| **hostname** | **String**|  | |

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
| **200** | Success, critical report returned. |  -  |
| **404** | The passed hostname was not found. |  -  |


## hostnameFansGet

> hostnameFansGet(hostname)

Get the fan report.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String hostname = "hostname_example"; // String | 
        try {
            apiInstance.hostnameFansGet(hostname);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#hostnameFansGet");
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
| **hostname** | **String**|  | |

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
| **200** | Success, fan report returned. |  -  |
| **404** | The passed hostname was not found. |  -  |


## hostnameFirmwaresGet

> hostnameFirmwaresGet(hostname)

Get the firmware report.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String hostname = "hostname_example"; // String | 
        try {
            apiInstance.hostnameFirmwaresGet(hostname);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#hostnameFirmwaresGet");
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
| **hostname** | **String**|  | |

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
| **200** | Success, firmware report returned. |  -  |
| **404** | The passed hostname was not found. |  -  |


## hostnameFullreportGet

> hostnameFullreportGet(hostname)

Get the full report.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String hostname = "hostname_example"; // String | 
        try {
            apiInstance.hostnameFullreportGet(hostname);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#hostnameFullreportGet");
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
| **hostname** | **String**|  | |

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
| **200** | Success, full report returned. |  -  |
| **404** | The passed hostname was not found. |  -  |


## hostnameLedGet

> hostnameLedGet(hostname)

Get the current state of enclosure LED for the specified hostname.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String hostname = "hostname_example"; // String | 
        try {
            apiInstance.hostnameLedGet(hostname);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#hostnameLedGet");
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
| **hostname** | **String**|  | |

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
| **200** | Success, led current status returned. |  -  |


## hostnameLedPatch

> hostnameLedPatch(hostname, hostnameLedPatchRequest)

Set enclosure LED status for the specified hostname.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String hostname = "hostname_example"; // String | 
        HostnameLedPatchRequest hostnameLedPatchRequest = new HostnameLedPatchRequest(); // HostnameLedPatchRequest | 
        try {
            apiInstance.hostnameLedPatch(hostname, hostnameLedPatchRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#hostnameLedPatch");
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
| **hostname** | **String**|  | |
| **hostnameLedPatchRequest** | [**HostnameLedPatchRequest**](HostnameLedPatchRequest.md)|  | |

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
| **200** | Success, led state changed. |  -  |
| **400** | Some fields are missing in the provided data. |  -  |
| **403** | Invalid keyring provided. |  -  |
| **501** | No hostname has been passed. (Not implemented) |  -  |
| **502** | The endpoint is unreachable. |  -  |


## hostnameMemoryGet

> hostnameMemoryGet(hostname)

Get the memory report.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String hostname = "hostname_example"; // String | 
        try {
            apiInstance.hostnameMemoryGet(hostname);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#hostnameMemoryGet");
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
| **hostname** | **String**|  | |

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
| **200** | Success, memory report returned. |  -  |
| **404** | The passed hostname was not found. |  -  |


## hostnameNetworkGet

> hostnameNetworkGet(hostname)

Get the report for network hardware.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String hostname = "hostname_example"; // String | 
        try {
            apiInstance.hostnameNetworkGet(hostname);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#hostnameNetworkGet");
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
| **hostname** | **String**|  | |

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
| **200** | Success, report for network hardware returned. |  -  |
| **404** | The passed hostname was not found. |  -  |


## hostnamePowerGet

> hostnamePowerGet(hostname)

Get the power supply report.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String hostname = "hostname_example"; // String | 
        try {
            apiInstance.hostnamePowerGet(hostname);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#hostnamePowerGet");
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
| **hostname** | **String**|  | |

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
| **200** | Success, power supply hardware report returned. |  -  |
| **404** | The passed hostname was not found. |  -  |


## hostnameProcessorsGet

> hostnameProcessorsGet(hostname)

Get the cpu report.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String hostname = "hostname_example"; // String | 
        try {
            apiInstance.hostnameProcessorsGet(hostname);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#hostnameProcessorsGet");
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
| **hostname** | **String**|  | |

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
| **200** | Success, cpu report returned. |  -  |
| **404** | The passed hostname was not found. |  -  |


## hostnameStorageGet

> hostnameStorageGet(hostname)

Get the storage disks report for.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String hostname = "hostname_example"; // String | 
        try {
            apiInstance.hostnameStorageGet(hostname);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#hostnameStorageGet");
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
| **hostname** | **String**|  | |

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
| **200** | Success, storage disks report returned. |  -  |
| **404** | The passed hostname was not found. |  -  |


## hostnameSummaryGet

> hostnameSummaryGet(hostname)

Get the a brief summary of hardware status.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String hostname = "hostname_example"; // String | 
        try {
            apiInstance.hostnameSummaryGet(hostname);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#hostnameSummaryGet");
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
| **hostname** | **String**|  | |

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
| **200** | Success, summary report returned. |  -  |
| **404** | The passed hostname was not found. |  -  |


## idracPost

> idracPost(idracPostRequest)

Get the iDrac details for a given host.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        IdracPostRequest idracPostRequest = new IdracPostRequest(); // IdracPostRequest | 
        try {
            apiInstance.idracPost(idracPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#idracPost");
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
| **idracPostRequest** | [**IdracPostRequest**](IdracPostRequest.md)|  | |

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
| **200** | Success, return idrac details. |  -  |
| **400** | Some fields are missing in the provided data. |  -  |
| **403** | Invalid keyring provided. |  -  |
| **502** | The cephadm agent isn&#39;t running on the node. |  -  |

