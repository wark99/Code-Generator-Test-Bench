# FilesApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFile**](FilesApi.md#getFile) | **GET** /files/{file_id} | Get a file |
| [**getFileInfo**](FilesApi.md#getFileInfo) | **GET** /files/{file_id}/info | Get metadata for a file |
| [**getFilePreview**](FilesApi.md#getFilePreview) | **GET** /files/{file_id}/preview | Get a file&#39;s preview |
| [**getFileThumbnail**](FilesApi.md#getFileThumbnail) | **GET** /files/{file_id}/thumbnail | Get a file&#39;s thumbnail |
| [**searchFiles**](FilesApi.md#searchFiles) | **POST** /teams/{team_id}/files/search | Search files in a team |
| [**uploadFile**](FilesApi.md#uploadFile) | **POST** /files | Upload a file |



## getFile

> getFile(fileId)

Get a file

Gets a file that has been uploaded previously. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        FilesApi apiInstance = new FilesApi(defaultClient);
        String fileId = "fileId_example"; // String | The ID of the file to get
        try {
            apiInstance.getFile(fileId);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#getFile");
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
| **fileId** | **String**| The ID of the file to get | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** |  |  -  |
| **401** |  |  -  |
| **403** | Do not have appropriate permissions |  * First-Inaccessible-File-Time - This header is included with the value \&quot;1\&quot; if the file is past the cloud&#39;s plan limit. <br>  |
| **404** |  |  -  |
| **501** |  |  -  |


## getFileInfo

> FileInfo getFileInfo(fileId)

Get metadata for a file

Gets a file&#39;s info. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        FilesApi apiInstance = new FilesApi(defaultClient);
        String fileId = "fileId_example"; // String | The ID of the file info to get
        try {
            FileInfo result = apiInstance.getFileInfo(fileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#getFileInfo");
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
| **fileId** | **String**| The ID of the file info to get | |

### Return type

[**FileInfo**](FileInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The stored metadata for the given file |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** | Do not have appropriate permissions |  * First-Inaccessible-File-Time - This header is included with the value \&quot;1\&quot; if the file is past the cloud&#39;s plan limit. <br>  |
| **404** |  |  -  |
| **501** |  |  -  |


## getFilePreview

> getFilePreview(fileId)

Get a file&#39;s preview

Gets a file&#39;s preview. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        FilesApi apiInstance = new FilesApi(defaultClient);
        String fileId = "fileId_example"; // String | The ID of the file to get
        try {
            apiInstance.getFilePreview(fileId);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#getFilePreview");
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
| **fileId** | **String**| The ID of the file to get | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** |  |  -  |
| **401** |  |  -  |
| **403** | Do not have appropriate permissions |  * First-Inaccessible-File-Time - This header is included with the value \&quot;1\&quot; if the file is past the cloud&#39;s plan limit. <br>  |
| **404** |  |  -  |
| **501** |  |  -  |


## getFileThumbnail

> getFileThumbnail(fileId)

Get a file&#39;s thumbnail

Gets a file&#39;s thumbnail. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        FilesApi apiInstance = new FilesApi(defaultClient);
        String fileId = "fileId_example"; // String | The ID of the file to get
        try {
            apiInstance.getFileThumbnail(fileId);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#getFileThumbnail");
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
| **fileId** | **String**| The ID of the file to get | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** |  |  -  |
| **401** |  |  -  |
| **403** | Do not have appropriate permissions |  * First-Inaccessible-File-Time - This header is included with the value \&quot;1\&quot; if the file is past the cloud&#39;s plan limit. <br>  |
| **404** |  |  -  |
| **501** |  |  -  |


## searchFiles

> FileInfoList searchFiles(teamId, searchFilesRequest)

Search files in a team

Search for files in a team based on file name, extention and file content (if file content extraction is enabled and supported for the files). ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        FilesApi apiInstance = new FilesApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        SearchFilesRequest searchFilesRequest = new SearchFilesRequest(); // SearchFilesRequest | The search terms and logic to use in the search.
        try {
            FileInfoList result = apiInstance.searchFiles(teamId, searchFilesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#searchFiles");
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
| **teamId** | **String**| Team GUID | |
| **searchFilesRequest** | [**SearchFilesRequest**](SearchFilesRequest.md)| The search terms and logic to use in the search. | |

### Return type

[**FileInfoList**](FileInfoList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Files list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## uploadFile

> UploadFile201Response uploadFile(channelId, filename)

Upload a file

Uploads a file that can later be attached to a post.  This request can either be a multipart/form-data request with a channel_id, files and optional client_ids defined in the FormData, or it can be a request with the channel_id and filename defined as query parameters with the contents of a single file in the body of the request.  ##### Permissions Must have &#x60;upload_file&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        FilesApi apiInstance = new FilesApi(defaultClient);
        String channelId = "channelId_example"; // String | The ID of the channel that this file will be uploaded to
        String filename = "filename_example"; // String | The name of the file to be uploaded
        try {
            UploadFile201Response result = apiInstance.uploadFile(channelId, filename);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#uploadFile");
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
| **channelId** | **String**| The ID of the channel that this file will be uploaded to | [optional] |
| **filename** | **String**| The name of the file to be uploaded | [optional] |

### Return type

[**UploadFile201Response**](UploadFile201Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Corresponding lists of the provided client_ids and the metadata that has been stored in the database for each one |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **413** |  |  -  |
| **501** |  |  -  |

