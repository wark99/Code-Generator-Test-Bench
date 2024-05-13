# TableApi

All URIs are relative to *https://api.rphaven.co.uk/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**showBranchTables**](TableApi.md#showBranchTables) | **GET** /branch/{branchId}/tables |  |
| [**showTableDetails**](TableApi.md#showTableDetails) | **GET** /table/{tableId} |  |
| [**showTableGames**](TableApi.md#showTableGames) | **GET** /table/{tableId}/games |  |
| [**showTableMeets**](TableApi.md#showTableMeets) | **GET** /table/{tableId}/meets |  |
| [**showTableParty**](TableApi.md#showTableParty) | **GET** /table/{tableId}/party |  |
| [**showTableRunners**](TableApi.md#showTableRunners) | **GET** /table/{tableId}/runners |  |
| [**showVenueTables**](TableApi.md#showVenueTables) | **GET** /venue/{venueId}/tables |  |



## showBranchTables

> BranchTables showBranchTables(branchId)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TableApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        TableApi apiInstance = new TableApi(defaultClient);
        UUID branchId = UUID.randomUUID(); // UUID | ID of the branch
        try {
            BranchTables result = apiInstance.showBranchTables(branchId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TableApi#showBranchTables");
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
| **branchId** | **UUID**| ID of the branch | |

### Return type

[**BranchTables**](BranchTables.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Show branch tables |  -  |


## showTableDetails

> TableDetails showTableDetails(tableId)



Show a table run by a branch

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TableApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        TableApi apiInstance = new TableApi(defaultClient);
        UUID tableId = UUID.randomUUID(); // UUID | ID of the table
        try {
            TableDetails result = apiInstance.showTableDetails(tableId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TableApi#showTableDetails");
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
| **tableId** | **UUID**| ID of the table | |

### Return type

[**TableDetails**](TableDetails.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | show table |  -  |


## showTableGames

> Object showTableGames(tableId)



Show games on a table

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TableApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        TableApi apiInstance = new TableApi(defaultClient);
        UUID tableId = UUID.randomUUID(); // UUID | ID of the table
        try {
            Object result = apiInstance.showTableGames(tableId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TableApi#showTableGames");
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
| **tableId** | **UUID**| ID of the table | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | show table games |  -  |


## showTableMeets

> Object showTableMeets(tableId)



Show games on a table

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TableApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        TableApi apiInstance = new TableApi(defaultClient);
        UUID tableId = UUID.randomUUID(); // UUID | ID of the table
        try {
            Object result = apiInstance.showTableMeets(tableId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TableApi#showTableMeets");
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
| **tableId** | **UUID**| ID of the table | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | show table games |  -  |


## showTableParty

> Object showTableParty(tableId)



Show table organisers

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TableApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        TableApi apiInstance = new TableApi(defaultClient);
        UUID tableId = UUID.randomUUID(); // UUID | ID of the table
        try {
            Object result = apiInstance.showTableParty(tableId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TableApi#showTableParty");
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
| **tableId** | **UUID**| ID of the table | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | show table party |  -  |


## showTableRunners

> Object showTableRunners(tableId)



Show table organisers

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TableApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        TableApi apiInstance = new TableApi(defaultClient);
        UUID tableId = UUID.randomUUID(); // UUID | ID of the table
        try {
            Object result = apiInstance.showTableRunners(tableId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TableApi#showTableRunners");
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
| **tableId** | **UUID**| ID of the table | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | show table runners |  -  |


## showVenueTables

> Object showVenueTables(venueId)



Show Tables at a Venue

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TableApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        TableApi apiInstance = new TableApi(defaultClient);
        UUID venueId = UUID.randomUUID(); // UUID | ID of the venue
        try {
            Object result = apiInstance.showVenueTables(venueId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TableApi#showVenueTables");
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
| **venueId** | **UUID**| ID of the venue | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | show venue tables |  -  |

