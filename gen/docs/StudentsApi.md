# StudentsApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getStudent**](StudentsApi.md#getStudent) | **GET** /students/{studentId} | Get a student |
| [**getStudentStages**](StudentsApi.md#getStudentStages) | **GET** /students/{studentId}/stages | List student stages |
| [**getStudents**](StudentsApi.md#getStudents) | **GET** /students | List students |
| [**patchStudent**](StudentsApi.md#patchStudent) | **PATCH** /students/{studentId} | Update a student |
| [**postStudent**](StudentsApi.md#postStudent) | **POST** /students | Create a student |



## getStudent

> PostStudent201Response getStudent(studentId)

Get a student

Retrieve the family member.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        StudentsApi apiInstance = new StudentsApi(defaultClient);
        String studentId = "studentId_example"; // String | 
        try {
            PostStudent201Response result = apiInstance.getStudent(studentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentsApi#getStudent");
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
| **studentId** | **String**|  | |

### Return type

[**PostStudent201Response**](PostStudent201Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a Student object. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Student not found. |  -  |


## getStudentStages

> GetStudentStages200Response getStudentStages(studentId)

List student stages

Retrieve a list of the family members stages.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        StudentsApi apiInstance = new StudentsApi(defaultClient);
        String studentId = "studentId_example"; // String | 
        try {
            GetStudentStages200Response result = apiInstance.getStudentStages(studentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentsApi#getStudentStages");
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
| **studentId** | **String**|  | |

### Return type

[**GetStudentStages200Response**](GetStudentStages200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Return a list of StudentStage objects. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Student not found. |  -  |


## getStudents

> GetStudents200Response getStudents(filterClass)

List students

Retrieve a list of family members.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        StudentsApi apiInstance = new StudentsApi(defaultClient);
        Integer filterClass = 56; // Integer | ID of the class
        try {
            GetStudents200Response result = apiInstance.getStudents(filterClass);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentsApi#getStudents");
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
| **filterClass** | **Integer**| ID of the class | [optional] |

### Return type

[**GetStudents200Response**](GetStudents200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of Student objects.  When the class filter is provided, the list contains only students who qualify the class based on age. |  -  |


## patchStudent

> PostStudent201Response patchStudent(studentId, patchStudentRequest)

Update a student

Update the family member.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        StudentsApi apiInstance = new StudentsApi(defaultClient);
        String studentId = "studentId_example"; // String | 
        PatchStudentRequest patchStudentRequest = new PatchStudentRequest(); // PatchStudentRequest | Updates the family member.
        try {
            PostStudent201Response result = apiInstance.patchStudent(studentId, patchStudentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentsApi#patchStudent");
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
| **studentId** | **String**|  | |
| **patchStudentRequest** | [**PatchStudentRequest**](PatchStudentRequest.md)| Updates the family member. | [optional] |

### Return type

[**PostStudent201Response**](PostStudent201Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a Student object. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Student not found. |  -  |


## postStudent

> PostStudent201Response postStudent(postStudentRequest)

Create a student

Create a new family member.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StudentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        StudentsApi apiInstance = new StudentsApi(defaultClient);
        PostStudentRequest postStudentRequest = new PostStudentRequest(); // PostStudentRequest | Creates a new family member.
        try {
            PostStudent201Response result = apiInstance.postStudent(postStudentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StudentsApi#postStudent");
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
| **postStudentRequest** | [**PostStudentRequest**](PostStudentRequest.md)| Creates a new family member. | [optional] |

### Return type

[**PostStudent201Response**](PostStudent201Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Student created. |  -  |

