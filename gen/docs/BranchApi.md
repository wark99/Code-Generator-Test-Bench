# BranchApi

All URIs are relative to *https://api.rphaven.co.uk/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addBranch**](BranchApi.md#addBranch) | **POST** /branch | Create a new branch |
| [**showBranch**](BranchApi.md#showBranch) | **GET** /branch/{branchId} | Show branch information |
| [**showBranchGames**](BranchApi.md#showBranchGames) | **GET** /branch/{branchId}/games | Returns all the games for a branch |
| [**showBranchMeets**](BranchApi.md#showBranchMeets) | **GET** /branch/{branchId}/meets | Show all planned game meets for a branch |
| [**showBranchTables**](BranchApi.md#showBranchTables) | **GET** /branch/{branchId}/tables |  |
| [**showBranchVenues**](BranchApi.md#showBranchVenues) | **GET** /branch/{branchId}/venues |  |
| [**showBranches**](BranchApi.md#showBranches) | **GET** /branch | Show all branches |
| [**updateBranch**](BranchApi.md#updateBranch) | **PUT** /branch/{branchId} | Update an existing branch |



## addBranch

> addBranch(branchResource)

Create a new branch

Update an existing branch by Id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BranchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        BranchApi apiInstance = new BranchApi(defaultClient);
        BranchResource branchResource = new BranchResource(); // BranchResource | Update an existent branch in the store
        try {
            apiInstance.addBranch(branchResource);
        } catch (ApiException e) {
            System.err.println("Exception when calling BranchApi#addBranch");
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
| **branchResource** | [**BranchResource**](BranchResource.md)| Update an existent branch in the store | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/hal+json
- **Accept**: Not defined



## showBranch

> BranchDetails showBranch(branchId)

Show branch information

Show an existing branch by Id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BranchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        BranchApi apiInstance = new BranchApi(defaultClient);
        UUID branchId = UUID.randomUUID(); // UUID | ID of the branch
        try {
            BranchDetails result = apiInstance.showBranch(branchId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BranchApi#showBranch");
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

[**BranchDetails**](BranchDetails.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Show the branch |  -  |


## showBranchGames

> List&lt;BranchGames&gt; showBranchGames(branchId)

Returns all the games for a branch

Show all the games for a branch

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BranchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        BranchApi apiInstance = new BranchApi(defaultClient);
        UUID branchId = UUID.randomUUID(); // UUID | ID of the branch
        try {
            List<BranchGames> result = apiInstance.showBranchGames(branchId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BranchApi#showBranchGames");
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

[**List&lt;BranchGames&gt;**](BranchGames.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Show all the games for a branch |  -  |


## showBranchMeets

> List&lt;BranchMeets&gt; showBranchMeets(branchId)

Show all planned game meets for a branch

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BranchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        BranchApi apiInstance = new BranchApi(defaultClient);
        UUID branchId = UUID.randomUUID(); // UUID | ID of the branch
        try {
            List<BranchMeets> result = apiInstance.showBranchMeets(branchId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BranchApi#showBranchMeets");
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

[**List&lt;BranchMeets&gt;**](BranchMeets.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | show Meets |  -  |


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
import org.openapitools.client.api.BranchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        BranchApi apiInstance = new BranchApi(defaultClient);
        UUID branchId = UUID.randomUUID(); // UUID | ID of the branch
        try {
            BranchTables result = apiInstance.showBranchTables(branchId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BranchApi#showBranchTables");
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


## showBranchVenues

> BranchVenues showBranchVenues(branchId)



Show Venues for a Branch

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BranchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        BranchApi apiInstance = new BranchApi(defaultClient);
        UUID branchId = UUID.randomUUID(); // UUID | ID of the Branch
        try {
            BranchVenues result = apiInstance.showBranchVenues(branchId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BranchApi#showBranchVenues");
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
| **branchId** | **UUID**| ID of the Branch | |

### Return type

[**BranchVenues**](BranchVenues.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Show Venues for a Branch |  -  |


## showBranches

> showBranches(body)

Show all branches

Show all branches

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BranchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");
        
        // Configure OAuth2 access token for authorization: rphaven_auth
        OAuth rphaven_auth = (OAuth) defaultClient.getAuthentication("rphaven_auth");
        rphaven_auth.setAccessToken("YOUR ACCESS TOKEN");

        BranchApi apiInstance = new BranchApi(defaultClient);
        Object body = null; // Object | Update an existent branch in the store
        try {
            apiInstance.showBranches(body);
        } catch (ApiException e) {
            System.err.println("Exception when calling BranchApi#showBranches");
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
| **body** | **Object**| Update an existent branch in the store | [optional] |

### Return type

null (empty response body)

### Authorization

[rphaven_auth](../README.md#rphaven_auth)

### HTTP request headers

- **Content-Type**: application/hal+json
- **Accept**: Not defined



## updateBranch

> BranchResource updateBranch(branchId, branchResource)

Update an existing branch

Update an existing branch by Id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BranchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");
        
        // Configure OAuth2 access token for authorization: rphaven_auth
        OAuth rphaven_auth = (OAuth) defaultClient.getAuthentication("rphaven_auth");
        rphaven_auth.setAccessToken("YOUR ACCESS TOKEN");

        BranchApi apiInstance = new BranchApi(defaultClient);
        UUID branchId = UUID.randomUUID(); // UUID | ID of the branch
        BranchResource branchResource = new BranchResource(); // BranchResource | Update an existent branch in the store
        try {
            BranchResource result = apiInstance.updateBranch(branchId, branchResource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BranchApi#updateBranch");
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
| **branchResource** | [**BranchResource**](BranchResource.md)| Update an existent branch in the store | |

### Return type

[**BranchResource**](BranchResource.md)

### Authorization

[rphaven_auth](../README.md#rphaven_auth)

### HTTP request headers

- **Content-Type**: application/hal+json
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Branch not found |  -  |
| **405** | Validation exception |  -  |

