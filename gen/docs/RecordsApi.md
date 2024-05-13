# RecordsApi

All URIs are relative to *https://adapter.sandbox.local*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRecord**](RecordsApi.md#createRecord) | **POST** /v1/records/create |  |
| [**searchRecords**](RecordsApi.md#searchRecords) | **POST** /v1/records/search |  |



## createRecord

> ResponseSuccessObject createRecord(createRecordRequest)



Create file containers with metadata

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecordsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://adapter.sandbox.local");
        
        // Configure HTTP bearer authorization: internal-JWT
        HttpBearerAuth internal-JWT = (HttpBearerAuth) defaultClient.getAuthentication("internal-JWT");
        internal-JWT.setBearerToken("BEARER TOKEN");

        RecordsApi apiInstance = new RecordsApi(defaultClient);
        CreateRecordRequest createRecordRequest = new CreateRecordRequest(); // CreateRecordRequest | 
        try {
            ResponseSuccessObject result = apiInstance.createRecord(createRecordRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecordsApi#createRecord");
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
| **createRecordRequest** | [**CreateRecordRequest**](CreateRecordRequest.md)|  | |

### Return type

[**ResponseSuccessObject**](ResponseSuccessObject.md)

### Authorization

[internal-JWT](../README.md#internal-JWT)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **403** | Unauthorized access |  -  |
| **404** | Not Found |  -  |
| **406** | Not Acceptable (Validation errors) |  -  |
| **422** | Unprocessable Entity |  -  |


## searchRecords

> ResponseSuccessArrayObjects searchRecords(searchRecordsRequest)



Search files and metadata in a container

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecordsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://adapter.sandbox.local");
        
        // Configure HTTP bearer authorization: internal-JWT
        HttpBearerAuth internal-JWT = (HttpBearerAuth) defaultClient.getAuthentication("internal-JWT");
        internal-JWT.setBearerToken("BEARER TOKEN");

        RecordsApi apiInstance = new RecordsApi(defaultClient);
        SearchRecordsRequest searchRecordsRequest = new SearchRecordsRequest(); // SearchRecordsRequest | 
        try {
            ResponseSuccessArrayObjects result = apiInstance.searchRecords(searchRecordsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecordsApi#searchRecords");
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
| **searchRecordsRequest** | [**SearchRecordsRequest**](SearchRecordsRequest.md)|  | |

### Return type

[**ResponseSuccessArrayObjects**](ResponseSuccessArrayObjects.md)

### Authorization

[internal-JWT](../README.md#internal-JWT)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Unauthorized access |  -  |
| **404** | Not Found |  -  |
| **406** | Not Acceptable (Validation errors) |  -  |
| **422** | Not Acceptable (Validation errors) |  -  |

