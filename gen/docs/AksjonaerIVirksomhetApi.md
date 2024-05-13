# AksjonaerIVirksomhetApi

All URIs are relative to *https://aksjonaerivirksomhet.api.skatteetaten-test.no/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**hentAksjonaerIVirksomhet**](AksjonaerIVirksomhetApi.md#hentAksjonaerIVirksomhet) | **GET** /{rettighetspakke}/aksjonaerer/{organisasjonsnummer} | Hent aksjonærer i en virksomhet |



## hentAksjonaerIVirksomhet

> Aksjeselskap hentAksjonaerIVirksomhet(rettighetspakke, organisasjonsnummer, kalenderaar, korrelasjonsid)

Hent aksjonærer i en virksomhet

Informasjon om en virksomhets aksjonærer pr. 31.12 sist kalenderår

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AksjonaerIVirksomhetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://aksjonaerivirksomhet.api.skatteetaten-test.no/v1");

        AksjonaerIVirksomhetApi apiInstance = new AksjonaerIVirksomhetApi(defaultClient);
        String rettighetspakke = "rettighetspakke_example"; // String | Datakonsumenter plasseres i en rettighetspakke (per datasett) basert på en juridisk vurdering. Rettighetspakken styrer skjermingsregler, filtrering og detaljering som benyttes når det gis innsyn i data i datasett.
        String organisasjonsnummer = "organisasjonsnummer_example"; // String | Organisasjonsnummer for virksomhet
        String kalenderaar = "kalenderaar_example"; // String | Kalenderåret det skal hentes opplysninger fra. Returnerer siste tilgjengelige dersom ikke oppgitt.
        UUID korrelasjonsid = UUID.randomUUID(); // UUID | Korrelasjonsid, unik identifikator for den tekniske forespørselen. Må være på UUID-format
        try {
            Aksjeselskap result = apiInstance.hentAksjonaerIVirksomhet(rettighetspakke, organisasjonsnummer, kalenderaar, korrelasjonsid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AksjonaerIVirksomhetApi#hentAksjonaerIVirksomhet");
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
| **organisasjonsnummer** | **String**| Organisasjonsnummer for virksomhet | |
| **kalenderaar** | **String**| Kalenderåret det skal hentes opplysninger fra. Returnerer siste tilgjengelige dersom ikke oppgitt. | [optional] |
| **korrelasjonsid** | **UUID**| Korrelasjonsid, unik identifikator for den tekniske forespørselen. Må være på UUID-format | [optional] |

### Return type

[**Aksjeselskap**](Aksjeselskap.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gyldig respons |  -  |
| **0** | Diverse feilmeldinger, se egen dokumentasjon |  -  |

