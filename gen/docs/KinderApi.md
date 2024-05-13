# KinderApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGroupsWithKidsByKibigwebid**](KinderApi.md#getGroupsWithKidsByKibigwebid) | **GET** /kitaApp/v1/einrichtungen/{kibigWebId}/mitGruppenUndKindern | Liefert Kinddaten |



## getGroupsWithKidsByKibigwebid

> Institute getGroupsWithKidsByKibigwebid(kibigWebId)

Liefert Kinddaten

Liefert Kinddaten einer Einrichtung anhand der kibigWebId in Gruppen gruppiert.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KinderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        KinderApi apiInstance = new KinderApi(defaultClient);
        String kibigWebId = "1620018207"; // String | kibigWebId der Einrichtung für die Kinddaten abgerufen werden
        try {
            Institute result = apiInstance.getGroupsWithKidsByKibigwebid(kibigWebId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KinderApi#getGroupsWithKidsByKibigwebid");
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
| **kibigWebId** | **String**| kibigWebId der Einrichtung für die Kinddaten abgerufen werden | |

### Return type

[**Institute**](Institute.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | not Found |  -  |
| **4XX** | Sonstiger Client Fehler (4xx) |  -  |
| **5XX** | Server Fehler (5xx) |  -  |

