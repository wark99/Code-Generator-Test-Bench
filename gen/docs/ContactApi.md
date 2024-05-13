# ContactApi

All URIs are relative to *https://europe-west1-mndirci.cloudfunctions.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listContactsBySalonId**](ContactApi.md#listContactsBySalonId) | **POST** /listContactsBySalonId | Liste des fiches contacts pour le salon demandé. |



## listContactsBySalonId

> Contact listContactsBySalonId(salonId)

Liste des fiches contacts pour le salon demandé.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://europe-west1-mndirci.cloudfunctions.net");

        ContactApi apiInstance = new ContactApi(defaultClient);
        String salonId = "salonId_example"; // String | Identifiant de salon de référence pour récupérer les fiches contact associées.
        try {
            Contact result = apiInstance.listContactsBySalonId(salonId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactApi#listContactsBySalonId");
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
| **salonId** | **String**| Identifiant de salon de référence pour récupérer les fiches contact associées. | |

### Return type

[**Contact**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **401** |  |  -  |
| **404** | Compte exposant introuvable |  -  |

