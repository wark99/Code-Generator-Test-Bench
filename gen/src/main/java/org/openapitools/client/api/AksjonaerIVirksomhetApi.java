package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Aksjeselskap;
import org.openapitools.client.model.Feil;
import java.util.UUID;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:10.681580159Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AksjonaerIVirksomhetApi {
    private ApiClient apiClient;

    public AksjonaerIVirksomhetApi() {
        this(new ApiClient());
    }

    public AksjonaerIVirksomhetApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Hent aksjonærer i en virksomhet
     * Informasjon om en virksomhets aksjonærer pr. 31.12 sist kalenderår
     * <p><b>200</b> - Gyldig respons
     * <p><b>0</b> - Diverse feilmeldinger, se egen dokumentasjon
     * @param rettighetspakke Datakonsumenter plasseres i en rettighetspakke (per datasett) basert på en juridisk vurdering. Rettighetspakken styrer skjermingsregler, filtrering og detaljering som benyttes når det gis innsyn i data i datasett. (required)
     * @param organisasjonsnummer Organisasjonsnummer for virksomhet (required)
     * @param kalenderaar Kalenderåret det skal hentes opplysninger fra. Returnerer siste tilgjengelige dersom ikke oppgitt. (optional)
     * @param korrelasjonsid Korrelasjonsid, unik identifikator for den tekniske forespørselen. Må være på UUID-format (optional)
     * @return Aksjeselskap
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Aksjeselskap hentAksjonaerIVirksomhet(String rettighetspakke, String organisasjonsnummer, String kalenderaar, UUID korrelasjonsid) throws RestClientException {
        return hentAksjonaerIVirksomhetWithHttpInfo(rettighetspakke, organisasjonsnummer, kalenderaar, korrelasjonsid).getBody();
    }

    /**
     * Hent aksjonærer i en virksomhet
     * Informasjon om en virksomhets aksjonærer pr. 31.12 sist kalenderår
     * <p><b>200</b> - Gyldig respons
     * <p><b>0</b> - Diverse feilmeldinger, se egen dokumentasjon
     * @param rettighetspakke Datakonsumenter plasseres i en rettighetspakke (per datasett) basert på en juridisk vurdering. Rettighetspakken styrer skjermingsregler, filtrering og detaljering som benyttes når det gis innsyn i data i datasett. (required)
     * @param organisasjonsnummer Organisasjonsnummer for virksomhet (required)
     * @param kalenderaar Kalenderåret det skal hentes opplysninger fra. Returnerer siste tilgjengelige dersom ikke oppgitt. (optional)
     * @param korrelasjonsid Korrelasjonsid, unik identifikator for den tekniske forespørselen. Må være på UUID-format (optional)
     * @return ResponseEntity&lt;Aksjeselskap&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Aksjeselskap> hentAksjonaerIVirksomhetWithHttpInfo(String rettighetspakke, String organisasjonsnummer, String kalenderaar, UUID korrelasjonsid) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'rettighetspakke' is set
        if (rettighetspakke == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'rettighetspakke' when calling hentAksjonaerIVirksomhet");
        }
        
        // verify the required parameter 'organisasjonsnummer' is set
        if (organisasjonsnummer == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organisasjonsnummer' when calling hentAksjonaerIVirksomhet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("rettighetspakke", rettighetspakke);
        uriVariables.put("organisasjonsnummer", organisasjonsnummer);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "kalenderaar", kalenderaar));
        

        if (korrelasjonsid != null)
        localVarHeaderParams.add("Korrelasjonsid", apiClient.parameterToString(korrelasjonsid));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Aksjeselskap> localReturnType = new ParameterizedTypeReference<Aksjeselskap>() {};
        return apiClient.invokeAPI("/{rettighetspakke}/aksjonaerer/{organisasjonsnummer}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
