# RecordsFilesApi

All URIs are relative to *https://adapter.sandbox.local*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**uploadFileRevision**](RecordsFilesApi.md#uploadFileRevision) | **PUT** /v1/records/files/replace |  |
| [**uploadNewFile**](RecordsFilesApi.md#uploadNewFile) | **POST** /v1/records/files/create |  |
| [**viewRecordFiles**](RecordsFilesApi.md#viewRecordFiles) | **GET** /v1/records/files/view |  |



## uploadFileRevision

> ResponseSuccessArrayObjects uploadFileRevision(_file, oldNuid, profileId, sha1Check)



Upload new version of a file

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecordsFilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://adapter.sandbox.local");
        
        // Configure HTTP bearer authorization: internal-JWT
        HttpBearerAuth internal-JWT = (HttpBearerAuth) defaultClient.getAuthentication("internal-JWT");
        internal-JWT.setBearerToken("BEARER TOKEN");

        RecordsFilesApi apiInstance = new RecordsFilesApi(defaultClient);
        Object _file = null; // Object | 
        Object oldNuid = null; // Object | 
        Object profileId = null; // Object | 
        Object sha1Check = null; // Object | 
        try {
            ResponseSuccessArrayObjects result = apiInstance.uploadFileRevision(_file, oldNuid, profileId, sha1Check);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecordsFilesApi#uploadFileRevision");
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
| **_file** | [**Object**](Object.md)|  | |
| **oldNuid** | [**Object**](Object.md)|  | |
| **profileId** | [**Object**](Object.md)|  | |
| **sha1Check** | [**Object**](Object.md)|  | |

### Return type

[**ResponseSuccessArrayObjects**](ResponseSuccessArrayObjects.md)

### Authorization

[internal-JWT](../README.md#internal-JWT)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Authentication failed |  -  |
| **403** | Unauthorized access |  -  |
| **406** | Not Acceptable (Validation errors) |  -  |
| **422** | Unprocessable Entity |  -  |


## uploadNewFile

> UploadNewFile201Response uploadNewFile(documentId, _file, profileId, sha1Check)



Upload new file

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecordsFilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://adapter.sandbox.local");
        
        // Configure HTTP bearer authorization: internal-JWT
        HttpBearerAuth internal-JWT = (HttpBearerAuth) defaultClient.getAuthentication("internal-JWT");
        internal-JWT.setBearerToken("BEARER TOKEN");

        RecordsFilesApi apiInstance = new RecordsFilesApi(defaultClient);
        String documentId = "documentId_example"; // String | 
        Object _file = null; // Object | 
        Object profileId = null; // Object | 
        Object sha1Check = null; // Object | 
        try {
            UploadNewFile201Response result = apiInstance.uploadNewFile(documentId, _file, profileId, sha1Check);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecordsFilesApi#uploadNewFile");
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
| **documentId** | **String**|  | |
| **_file** | [**Object**](Object.md)|  | |
| **profileId** | [**Object**](Object.md)|  | |
| **sha1Check** | [**Object**](Object.md)|  | |

### Return type

[**UploadNewFile201Response**](UploadNewFile201Response.md)

### Authorization

[internal-JWT](../README.md#internal-JWT)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **401** | Authentication failed |  -  |
| **403** | Unauthorized access |  -  |
| **404** | Not Found |  -  |
| **406** | Not Acceptable (Validation errors) |  -  |
| **422** | Unprocessable Entity |  -  |


## viewRecordFiles

> ResponseSuccessArrayObjects viewRecordFiles(profileId, documentIds)



Fetch file objects based on provided IDs

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RecordsFilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://adapter.sandbox.local");
        
        // Configure HTTP bearer authorization: internal-JWT
        HttpBearerAuth internal-JWT = (HttpBearerAuth) defaultClient.getAuthentication("internal-JWT");
        internal-JWT.setBearerToken("BEARER TOKEN");

        RecordsFilesApi apiInstance = new RecordsFilesApi(defaultClient);
        ParamProfileId profileId = new ParamProfileId(); // ParamProfileId | 
        List<String> documentIds = Arrays.asList(); // List<String> | Send multiple IDs by duplicating the parameter name for each ID: <br/>`document_ids[]=ID_1&document_ids[]=ID_2&...`
        try {
            ResponseSuccessArrayObjects result = apiInstance.viewRecordFiles(profileId, documentIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecordsFilesApi#viewRecordFiles");
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
| **profileId** | [**ParamProfileId**](.md)|  | |
| **documentIds** | [**List&lt;String&gt;**](String.md)| Send multiple IDs by duplicating the parameter name for each ID: &lt;br/&gt;&#x60;document_ids[]&#x3D;ID_1&amp;document_ids[]&#x3D;ID_2&amp;...&#x60; | |

### Return type

[**ResponseSuccessArrayObjects**](ResponseSuccessArrayObjects.md)

### Authorization

[internal-JWT](../README.md#internal-JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Unauthorized access |  -  |
| **406** | Not Acceptable (Validation errors) |  -  |

