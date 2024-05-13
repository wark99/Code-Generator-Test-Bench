# SearchApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchFiles**](SearchApi.md#searchFiles) | **POST** /teams/{team_id}/files/search | Search files in a team |



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
import org.openapitools.client.api.SearchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        SearchApi apiInstance = new SearchApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        SearchFilesRequest searchFilesRequest = new SearchFilesRequest(); // SearchFilesRequest | The search terms and logic to use in the search.
        try {
            FileInfoList result = apiInstance.searchFiles(teamId, searchFilesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#searchFiles");
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

