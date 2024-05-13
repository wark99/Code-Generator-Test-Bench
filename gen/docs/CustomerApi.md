# CustomerApi

All URIs are relative to *https://petstore3.swagger.io/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCustomer**](CustomerApi.md#addCustomer) | **POST** /Customer | Add a new Customer to the Inventory Management System |
| [**deleteCustomer**](CustomerApi.md#deleteCustomer) | **DELETE** /Customer/{CustomerId} | Deletes a Customer |
| [**findCustomersByName**](CustomerApi.md#findCustomersByName) | **GET** /Customer/findByUserName | Finds Customers by UserName |
| [**getCustomerById**](CustomerApi.md#getCustomerById) | **GET** /Customer/{CustomerId} | Find Customer by ID |
| [**updateCustomer**](CustomerApi.md#updateCustomer) | **PUT** /Customer | Update an existing Customer |
| [**updateCustomerById**](CustomerApi.md#updateCustomerById) | **PATCH** /Customer/{CustomerId} | Update Customer by ID |



## addCustomer

> List&lt;AddCustomerRequestInner&gt; addCustomer(addCustomerRequestInner)

Add a new Customer to the Inventory Management System

Add a new Customer to the Inventory Management System

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");
        
        // Configure OAuth2 access token for authorization: petstore_auth
        OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
        petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        List<AddCustomerRequestInner> addCustomerRequestInner = Arrays.asList(); // List<AddCustomerRequestInner> | Create a new Customer in the store
        try {
            List<AddCustomerRequestInner> result = apiInstance.addCustomer(addCustomerRequestInner);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#addCustomer");
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
| **addCustomerRequestInner** | [**List&lt;AddCustomerRequestInner&gt;**](AddCustomerRequestInner.md)| Create a new Customer in the store | |

### Return type

[**List&lt;AddCustomerRequestInner&gt;**](AddCustomerRequestInner.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **405** | Invalid input |  -  |
| **404** | the server cannot find the requested resource |  -  |
| **201** | the resources have been successfully created on the server |  -  |
| **304** | Not modified |  -  |
| **510** | extensions to the request are required for the server to fulfill it. |  -  |


## deleteCustomer

> deleteCustomer(apiKey)

Deletes a Customer

delete a Customer

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        String apiKey = "apiKey_example"; // String | 
        try {
            apiInstance.deleteCustomer(apiKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#deleteCustomer");
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
| **apiKey** | **String**|  | [optional] |

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
| **200** | Successfully updated Customer |  -  |
| **202** | the request has been received but not completed yet |  -  |
| **405** | Invalid operation |  -  |
| **400** | Invalid ID supplied |  -  |
| **300** | The request has more than one possible response |  -  |
| **510** | extensions to the request are required for the server to fulfill it |  -  |


## findCustomersByName

> List&lt;UpdateCustomerRequestInner&gt; findCustomersByName(userName)

Finds Customers by UserName

Multiple UserName values can be provided with comma separated strings

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");
        
        // Configure OAuth2 access token for authorization: petstore_auth
        OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
        petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        String userName = "userName_example"; // String | UserName values that need to be considered for filter
        try {
            List<UpdateCustomerRequestInner> result = apiInstance.findCustomersByName(userName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#findCustomersByName");
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
| **userName** | **String**| UserName values that need to be considered for filter | [optional] |

### Return type

[**List&lt;UpdateCustomerRequestInner&gt;**](UpdateCustomerRequestInner.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid UserName |  -  |
| **202** | the request has been accepted for processing |  -  |


## getCustomerById

> List&lt;UpdateCustomerRequestInner&gt; getCustomerById(customerId)

Find Customer by ID

Returns a single Customer

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");
        
        // Configure OAuth2 access token for authorization: petstore_auth
        OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
        petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        Long customerId = 56L; // Long | ID of Customer to return
        try {
            List<UpdateCustomerRequestInner> result = apiInstance.getCustomerById(customerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#getCustomerById");
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
| **customerId** | **Long**| ID of Customer to return | |

### Return type

[**List&lt;UpdateCustomerRequestInner&gt;**](UpdateCustomerRequestInner.md)

### Authorization

[petstore_auth](../README.md#petstore_auth), [api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Customer not found |  -  |
| **202** | the request has been accepted for processing |  -  |
| **302** | the request has been accepted for processing |  -  |
| **503** | The server is not ready to handle the request |  -  |


## updateCustomer

> List&lt;UpdateCustomerRequestInner&gt; updateCustomer(updateCustomerRequestInner)

Update an existing Customer

Update an existing Customer by Id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");
        
        // Configure OAuth2 access token for authorization: petstore_auth
        OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
        petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        List<UpdateCustomerRequestInner> updateCustomerRequestInner = Arrays.asList(); // List<UpdateCustomerRequestInner> | Update an existent Customer in Inventory Management System
        try {
            List<UpdateCustomerRequestInner> result = apiInstance.updateCustomer(updateCustomerRequestInner);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#updateCustomer");
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
| **updateCustomerRequestInner** | [**List&lt;UpdateCustomerRequestInner&gt;**](UpdateCustomerRequestInner.md)| Update an existent Customer in Inventory Management System | |

### Return type

[**List&lt;UpdateCustomerRequestInner&gt;**](UpdateCustomerRequestInner.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | customer not found |  -  |
| **405** | Validation exception |  -  |
| **201** | new resource has been created |  -  |
| **202** | the request has been accepted for processing |  -  |
| **304** | the response has not been modified |  -  |


## updateCustomerById

> UpdateCustomerById200Response updateCustomerById(updateCustomerByIdRequest)

Update Customer by ID

Updates specific fields of a Customer identified by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        CustomerApi apiInstance = new CustomerApi(defaultClient);
        UpdateCustomerByIdRequest updateCustomerByIdRequest = new UpdateCustomerByIdRequest(); // UpdateCustomerByIdRequest | 
        try {
            UpdateCustomerById200Response result = apiInstance.updateCustomerById(updateCustomerByIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#updateCustomerById");
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
| **updateCustomerByIdRequest** | [**UpdateCustomerByIdRequest**](UpdateCustomerByIdRequest.md)|  | |

### Return type

[**UpdateCustomerById200Response**](UpdateCustomerById200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated Customer |  -  |
| **404** | Customer not found |  -  |
| **202** | the request has been received but not completed yet |  -  |
| **204** | No Content |  -  |
| **302** | The URL of the requested resource has been changed temporarily |  -  |
| **503** | The server is not ready to handle the request |  -  |

