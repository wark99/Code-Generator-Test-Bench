# CompaniesApi

All URIs are relative to *http://geo-api.air-bit.ru:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCompany**](CompaniesApi.md#createCompany) | **POST** /companies/ | Add company |
| [**deleteCompany**](CompaniesApi.md#deleteCompany) | **DELETE** /companies/{id}/ | Delete company by id |
| [**getCompanies**](CompaniesApi.md#getCompanies) | **GET** /companies/ | Get a list of companies available to the user |
| [**getCompany**](CompaniesApi.md#getCompany) | **GET** /companies/{id}/ | Get company by id |
| [**updateCompany**](CompaniesApi.md#updateCompany) | **PUT** /companies/{id}/ | Update company by id |



## createCompany

> CompanyScheme createCompany(createCompanyScheme)

Add company

Add company

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CompaniesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        CompaniesApi apiInstance = new CompaniesApi(defaultClient);
        CreateCompanyScheme createCompanyScheme = new CreateCompanyScheme(); // CreateCompanyScheme | 
        try {
            CompanyScheme result = apiInstance.createCompany(createCompanyScheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompaniesApi#createCompany");
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
| **createCompanyScheme** | [**CreateCompanyScheme**](CreateCompanyScheme.md)|  | |

### Return type

[**CompanyScheme**](CompanyScheme.md)

### Authorization

[AWSAuthenticator](../README.md#AWSAuthenticator)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Validation Error |  -  |


## deleteCompany

> deleteCompany(id)

Delete company by id

Delete company by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CompaniesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        CompaniesApi apiInstance = new CompaniesApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            apiInstance.deleteCompany(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompaniesApi#deleteCompany");
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
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[AWSAuthenticator](../README.md#AWSAuthenticator)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful Response |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Validation Error |  -  |


## getCompanies

> PageCompanyScheme getCompanies(status, text, perPage, page)

Get a list of companies available to the user

Get a list of companies available to the user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CompaniesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        CompaniesApi apiInstance = new CompaniesApi(defaultClient);
        StatusUser status = StatusUser.fromValue("1"); // StatusUser | Status user:   * 1 - Inactive     * 2 - New     * 3 - Active   
        String text = "text_example"; // String | text value for search by name
        Integer perPage = 1000; // Integer | 
        Integer page = 1; // Integer | 
        try {
            PageCompanyScheme result = apiInstance.getCompanies(status, text, perPage, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompaniesApi#getCompanies");
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
| **status** | [**StatusUser**](.md)| Status user:   * 1 - Inactive     * 2 - New     * 3 - Active    | [optional] [enum: 1, 2, 3] |
| **text** | **String**| text value for search by name | [optional] |
| **perPage** | **Integer**|  | [optional] [default to 1000] |
| **page** | **Integer**|  | [optional] [default to 1] |

### Return type

[**PageCompanyScheme**](PageCompanyScheme.md)

### Authorization

[AWSAuthenticator](../README.md#AWSAuthenticator)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Forbidden |  -  |
| **422** | Validation Error |  -  |


## getCompany

> CompanyScheme getCompany(id)

Get company by id

Get company by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CompaniesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        CompaniesApi apiInstance = new CompaniesApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            CompanyScheme result = apiInstance.getCompany(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompaniesApi#getCompany");
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
| **id** | **Integer**|  | |

### Return type

[**CompanyScheme**](CompanyScheme.md)

### Authorization

[AWSAuthenticator](../README.md#AWSAuthenticator)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Validation Error |  -  |


## updateCompany

> CompanyScheme updateCompany(id, createCompanyScheme)

Update company by id

Update company by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CompaniesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        CompaniesApi apiInstance = new CompaniesApi(defaultClient);
        Integer id = 56; // Integer | 
        CreateCompanyScheme createCompanyScheme = new CreateCompanyScheme(); // CreateCompanyScheme | 
        try {
            CompanyScheme result = apiInstance.updateCompany(id, createCompanyScheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompaniesApi#updateCompany");
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
| **id** | **Integer**|  | |
| **createCompanyScheme** | [**CreateCompanyScheme**](CreateCompanyScheme.md)|  | |

### Return type

[**CompanyScheme**](CompanyScheme.md)

### Authorization

[AWSAuthenticator](../README.md#AWSAuthenticator)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Validation Error |  -  |

