# SupplierApi

All URIs are relative to *https://petstore3.swagger.io/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSupplier**](SupplierApi.md#createSupplier) | **POST** /Supplier | Create Supplier |
| [**createSuppliersWithListInput**](SupplierApi.md#createSuppliersWithListInput) | **POST** /Supplier/createWithList | Creates list of Suppliers with given input array |
| [**deleteUser**](SupplierApi.md#deleteUser) | **DELETE** /Suppliers/{username} | Delete Supplier |
| [**getUserByName**](SupplierApi.md#getUserByName) | **GET** /Suppliers/{username} | Get Supplier by Supplier name |
| [**loginUser**](SupplierApi.md#loginUser) | **GET** /Supplier/login | Logs Supplier into the system |
| [**logoutSupplier**](SupplierApi.md#logoutSupplier) | **GET** /Suppliers/logout | Logs out current logged in Supplier session |
| [**updateUser**](SupplierApi.md#updateUser) | **PUT** /Suppliers/{username} | Update Supplier |



## createSupplier

> Suppliers createSupplier(suppliers)

Create Supplier

This can only be done by the logged in Supplier

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupplierApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        SupplierApi apiInstance = new SupplierApi(defaultClient);
        Suppliers suppliers = new Suppliers(); // Suppliers | Created Supplier object
        try {
            Suppliers result = apiInstance.createSupplier(suppliers);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SupplierApi#createSupplier");
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
| **suppliers** | [**Suppliers**](Suppliers.md)| Created Supplier object | [optional] |

### Return type

[**Suppliers**](Suppliers.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |


## createSuppliersWithListInput

> Suppliers createSuppliersWithListInput(suppliers)

Creates list of Suppliers with given input array

Creates list of Suppliers with given input array

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupplierApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        SupplierApi apiInstance = new SupplierApi(defaultClient);
        List<Suppliers> suppliers = Arrays.asList(); // List<Suppliers> | 
        try {
            Suppliers result = apiInstance.createSuppliersWithListInput(suppliers);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SupplierApi#createSuppliersWithListInput");
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
| **suppliers** | [**List&lt;Suppliers&gt;**](Suppliers.md)|  | [optional] |

### Return type

[**Suppliers**](Suppliers.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **0** | successful operation |  -  |


## deleteUser

> deleteUser(username)

Delete Supplier

This can only be done by the logged in user.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupplierApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        SupplierApi apiInstance = new SupplierApi(defaultClient);
        String username = "username_example"; // String | The name that needs to be deleted
        try {
            apiInstance.deleteUser(username);
        } catch (ApiException e) {
            System.err.println("Exception when calling SupplierApi#deleteUser");
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
| **username** | **String**| The name that needs to be deleted | |

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
| **400** | Invalid username supplied |  -  |
| **404** | User not found |  -  |


## getUserByName

> Suppliers getUserByName(username)

Get Supplier by Supplier name



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupplierApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        SupplierApi apiInstance = new SupplierApi(defaultClient);
        String username = "username_example"; // String | The name that needs to be fetched. Use user1 for testing. 
        try {
            Suppliers result = apiInstance.getUserByName(username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SupplierApi#getUserByName");
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
| **username** | **String**| The name that needs to be fetched. Use user1 for testing.  | |

### Return type

[**Suppliers**](Suppliers.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid username supplied |  -  |
| **404** | User not found |  -  |


## loginUser

> String loginUser(username, password)

Logs Supplier into the system



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupplierApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        SupplierApi apiInstance = new SupplierApi(defaultClient);
        String username = "username_example"; // String | The Supplier name for login
        String password = "password_example"; // String | The password for login in clear text
        try {
            String result = apiInstance.loginUser(username, password);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SupplierApi#loginUser");
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
| **username** | **String**| The Supplier name for login | [optional] |
| **password** | **String**| The password for login in clear text | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  * X-Rate-Limit - calls per hour allowed by the user <br>  * X-Expires-After - date in UTC when token expires <br>  |
| **400** | Invalid username/password supplied |  -  |


## logoutSupplier

> logoutSupplier()

Logs out current logged in Supplier session



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupplierApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        SupplierApi apiInstance = new SupplierApi(defaultClient);
        try {
            apiInstance.logoutSupplier();
        } catch (ApiException e) {
            System.err.println("Exception when calling SupplierApi#logoutSupplier");
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
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |


## updateUser

> updateUser(username, suppliers)

Update Supplier

This can only be done by the logged in user.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupplierApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        SupplierApi apiInstance = new SupplierApi(defaultClient);
        String username = "username_example"; // String | name that need to be deleted
        Suppliers suppliers = new Suppliers(); // Suppliers | Update an existent user in the store
        try {
            apiInstance.updateUser(username, suppliers);
        } catch (ApiException e) {
            System.err.println("Exception when calling SupplierApi#updateUser");
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
| **username** | **String**| name that need to be deleted | |
| **suppliers** | [**Suppliers**](Suppliers.md)| Update an existent user in the store | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |

