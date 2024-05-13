# EmployeeApi

All URIs are relative to *https://petstore3.swagger.io/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addEmployee**](EmployeeApi.md#addEmployee) | **POST** /Employee | Add a new Employee to the Inventory Management System |
| [**deleteEmployee**](EmployeeApi.md#deleteEmployee) | **DELETE** /Employee/{EmployeeId} | Deletes a Employee |
| [**findEmployeeByName**](EmployeeApi.md#findEmployeeByName) | **GET** /Employee/findByName | Finds Employee  by Name |
| [**getEmployeeById**](EmployeeApi.md#getEmployeeById) | **GET** /Employee/{EmployeeId} | Find Employee by ID |
| [**updateEmployeeById**](EmployeeApi.md#updateEmployeeById) | **PATCH** /Employee/{EmployeeId} | Update Employee by ID |
| [**updateEmployees**](EmployeeApi.md#updateEmployees) | **PUT** /Employee | Update an existing Employee |



## addEmployee

> List&lt;AddEmployeeRequestInner&gt; addEmployee(addEmployeeRequestInner)

Add a new Employee to the Inventory Management System

Add a new Employee to the Inventory Management System

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        EmployeeApi apiInstance = new EmployeeApi(defaultClient);
        List<AddEmployeeRequestInner> addEmployeeRequestInner = Arrays.asList(); // List<AddEmployeeRequestInner> | Create a new Employee
        try {
            List<AddEmployeeRequestInner> result = apiInstance.addEmployee(addEmployeeRequestInner);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmployeeApi#addEmployee");
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
| **addEmployeeRequestInner** | [**List&lt;AddEmployeeRequestInner&gt;**](AddEmployeeRequestInner.md)| Create a new Employee | |

### Return type

[**List&lt;AddEmployeeRequestInner&gt;**](AddEmployeeRequestInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/xml
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **405** | Invalid input |  -  |


## deleteEmployee

> deleteEmployee(apiKey)

Deletes a Employee

delete a Employee

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        EmployeeApi apiInstance = new EmployeeApi(defaultClient);
        String apiKey = "apiKey_example"; // String | 
        try {
            apiInstance.deleteEmployee(apiKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmployeeApi#deleteEmployee");
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
| **400** | Invalid ID supplied |  -  |
| **404** | Employee not found |  -  |


## findEmployeeByName

> List&lt;FindEmployeeByName200ResponseInner&gt; findEmployeeByName(name)

Finds Employee  by Name

Multiple Name values can be provided with comma separated strings

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        EmployeeApi apiInstance = new EmployeeApi(defaultClient);
        String name = "name_example"; // String | Names values that need to be considered for filter
        try {
            List<FindEmployeeByName200ResponseInner> result = apiInstance.findEmployeeByName(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmployeeApi#findEmployeeByName");
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
| **name** | **String**| Names values that need to be considered for filter | [optional] |

### Return type

[**List&lt;FindEmployeeByName200ResponseInner&gt;**](FindEmployeeByName200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid Name value |  -  |


## getEmployeeById

> List&lt;AddEmployeeRequestInner&gt; getEmployeeById(employeeId)

Find Employee by ID

Returns a single Employee

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        EmployeeApi apiInstance = new EmployeeApi(defaultClient);
        Long employeeId = 56L; // Long | ID of Employee to return
        try {
            List<AddEmployeeRequestInner> result = apiInstance.getEmployeeById(employeeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmployeeApi#getEmployeeById");
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
| **employeeId** | **Long**| ID of Employee to return | |

### Return type

[**List&lt;AddEmployeeRequestInner&gt;**](AddEmployeeRequestInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Employee not found |  -  |


## updateEmployeeById

> UpdateEmployeeById200Response updateEmployeeById(updateEmployeeByIdRequest)

Update Employee by ID

Updates specific fields of a Employee identified by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        EmployeeApi apiInstance = new EmployeeApi(defaultClient);
        UpdateEmployeeByIdRequest updateEmployeeByIdRequest = new UpdateEmployeeByIdRequest(); // UpdateEmployeeByIdRequest | 
        try {
            UpdateEmployeeById200Response result = apiInstance.updateEmployeeById(updateEmployeeByIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmployeeApi#updateEmployeeById");
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
| **updateEmployeeByIdRequest** | [**UpdateEmployeeByIdRequest**](UpdateEmployeeByIdRequest.md)|  | |

### Return type

[**UpdateEmployeeById200Response**](UpdateEmployeeById200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated Employee |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Employee not found |  -  |


## updateEmployees

> List&lt;UpdateEmployeesRequestInner&gt; updateEmployees(updateEmployeesRequestInner)

Update an existing Employee

Update an existing Employee by Id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");
        
        // Configure OAuth2 access token for authorization: petstore_auth
        OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
        petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

        EmployeeApi apiInstance = new EmployeeApi(defaultClient);
        List<UpdateEmployeesRequestInner> updateEmployeesRequestInner = Arrays.asList(); // List<UpdateEmployeesRequestInner> | Update an existent Employee in Inventory Management System
        try {
            List<UpdateEmployeesRequestInner> result = apiInstance.updateEmployees(updateEmployeesRequestInner);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmployeeApi#updateEmployees");
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
| **updateEmployeesRequestInner** | [**List&lt;UpdateEmployeesRequestInner&gt;**](UpdateEmployeesRequestInner.md)| Update an existent Employee in Inventory Management System | |

### Return type

[**List&lt;UpdateEmployeesRequestInner&gt;**](UpdateEmployeesRequestInner.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | customer not found |  -  |
| **405** | Validation exception |  -  |

