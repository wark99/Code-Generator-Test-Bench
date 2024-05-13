# SalonApi

All URIs are relative to *https://europe-west1-mndirci.cloudfunctions.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listSalonsByYear**](SalonApi.md#listSalonsByYear) | **POST** /listSalonsByYear | Liste des salons avec identifiant suivant les années |



## listSalonsByYear

> List&lt;Salon&gt; listSalonsByYear(year)

Liste des salons avec identifiant suivant les années

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SalonApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://europe-west1-mndirci.cloudfunctions.net");

        SalonApi apiInstance = new SalonApi(defaultClient);
        String year = "year_example"; // String | Année de référence pour les salons retournés.
        try {
            List<Salon> result = apiInstance.listSalonsByYear(year);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SalonApi#listSalonsByYear");
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
| **year** | **String**| Année de référence pour les salons retournés. | |

### Return type

[**List&lt;Salon&gt;**](Salon.md)

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

