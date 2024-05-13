# FormuesgrunnlagEiendomsskattApi

All URIs are relative to *https://formuesgrunnlageiendomsskatt.api.skatteetaten-test.no/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**hentFormuesgrunnlagEiendomsskatt**](FormuesgrunnlagEiendomsskattApi.md#hentFormuesgrunnlagEiendomsskatt) | **GET** /{rettighetspakke}/{gjelderPeriode}/{kommunenummer}/{eksternidentifikator} | Hent formuesgrunnlageiendomsskatt for en identifikator |



## hentFormuesgrunnlagEiendomsskatt

> FormuesgrunnlagForEiendomsskatt hentFormuesgrunnlagEiendomsskatt(rettighetspakke, gjelderPeriode, kommunenummer, eksternidentifikator, korrelasjonsid)

Hent formuesgrunnlageiendomsskatt for en identifikator

Hent formuesgrunnlageiendomsskatt for en identifikator.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormuesgrunnlagEiendomsskattApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://formuesgrunnlageiendomsskatt.api.skatteetaten-test.no/v1");

        FormuesgrunnlagEiendomsskattApi apiInstance = new FormuesgrunnlagEiendomsskattApi(defaultClient);
        String rettighetspakke = "rettighetspakke_example"; // String | Datakonsumenter plasseres i en rettighetspakke (per datasett) basert på en juridisk vurdering. Rettighetspakken styrer skjermingsregler, filtrering og detaljering som benyttes når det gis innsyn i data i datasett.
        String gjelderPeriode = "2022"; // String | Perioden
        String kommunenummer = "0301"; // String | Kommunenummer
        String eksternidentifikator = "000000000000000"; // String | Ekstern identifikator
        UUID korrelasjonsid = UUID.fromString("123e4567-e89b-12d3-a456-426655440000"); // UUID | Korrelasjonsid, unik identifikator for den tekniske forespørselen. Må være på UUID-format
        try {
            FormuesgrunnlagForEiendomsskatt result = apiInstance.hentFormuesgrunnlagEiendomsskatt(rettighetspakke, gjelderPeriode, kommunenummer, eksternidentifikator, korrelasjonsid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormuesgrunnlagEiendomsskattApi#hentFormuesgrunnlagEiendomsskatt");
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
| **rettighetspakke** | **String**| Datakonsumenter plasseres i en rettighetspakke (per datasett) basert på en juridisk vurdering. Rettighetspakken styrer skjermingsregler, filtrering og detaljering som benyttes når det gis innsyn i data i datasett. | |
| **gjelderPeriode** | **String**| Perioden | |
| **kommunenummer** | **String**| Kommunenummer | |
| **eksternidentifikator** | **String**| Ekstern identifikator | |
| **korrelasjonsid** | **UUID**| Korrelasjonsid, unik identifikator for den tekniske forespørselen. Må være på UUID-format | [optional] |

### Return type

[**FormuesgrunnlagForEiendomsskatt**](FormuesgrunnlagForEiendomsskatt.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gyldig respons |  -  |
| **0** | Alle feil fra applikasjonen kommer på følgende format |  -  |

