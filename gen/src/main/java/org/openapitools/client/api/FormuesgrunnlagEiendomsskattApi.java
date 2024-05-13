package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Feil;
import org.openapitools.client.model.FormuesgrunnlagForEiendomsskatt;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:17.794277948Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FormuesgrunnlagEiendomsskattApi {
    private ApiClient apiClient;

    public FormuesgrunnlagEiendomsskattApi() {
        this(new ApiClient());
    }

    public FormuesgrunnlagEiendomsskattApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Hent formuesgrunnlageiendomsskatt for en identifikator
     * Hent formuesgrunnlageiendomsskatt for en identifikator.
     * <p><b>200</b> - Gyldig respons
     * <p><b>0</b> - Alle feil fra applikasjonen kommer på følgende format
     * @param rettighetspakke Datakonsumenter plasseres i en rettighetspakke (per datasett) basert på en juridisk vurdering. Rettighetspakken styrer skjermingsregler, filtrering og detaljering som benyttes når det gis innsyn i data i datasett. (required)
     * @param gjelderPeriode Perioden (required)
     * @param kommunenummer Kommunenummer (required)
     * @param eksternidentifikator Ekstern identifikator (required)
     * @param korrelasjonsid Korrelasjonsid, unik identifikator for den tekniske forespørselen. Må være på UUID-format (optional)
     * @return FormuesgrunnlagForEiendomsskatt
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FormuesgrunnlagForEiendomsskatt hentFormuesgrunnlagEiendomsskatt(String rettighetspakke, String gjelderPeriode, String kommunenummer, String eksternidentifikator, UUID korrelasjonsid) throws RestClientException {
        return hentFormuesgrunnlagEiendomsskattWithHttpInfo(rettighetspakke, gjelderPeriode, kommunenummer, eksternidentifikator, korrelasjonsid).getBody();
    }

    /**
     * Hent formuesgrunnlageiendomsskatt for en identifikator
     * Hent formuesgrunnlageiendomsskatt for en identifikator.
     * <p><b>200</b> - Gyldig respons
     * <p><b>0</b> - Alle feil fra applikasjonen kommer på følgende format
     * @param rettighetspakke Datakonsumenter plasseres i en rettighetspakke (per datasett) basert på en juridisk vurdering. Rettighetspakken styrer skjermingsregler, filtrering og detaljering som benyttes når det gis innsyn i data i datasett. (required)
     * @param gjelderPeriode Perioden (required)
     * @param kommunenummer Kommunenummer (required)
     * @param eksternidentifikator Ekstern identifikator (required)
     * @param korrelasjonsid Korrelasjonsid, unik identifikator for den tekniske forespørselen. Må være på UUID-format (optional)
     * @return ResponseEntity&lt;FormuesgrunnlagForEiendomsskatt&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FormuesgrunnlagForEiendomsskatt> hentFormuesgrunnlagEiendomsskattWithHttpInfo(String rettighetspakke, String gjelderPeriode, String kommunenummer, String eksternidentifikator, UUID korrelasjonsid) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'rettighetspakke' is set
        if (rettighetspakke == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'rettighetspakke' when calling hentFormuesgrunnlagEiendomsskatt");
        }
        
        // verify the required parameter 'gjelderPeriode' is set
        if (gjelderPeriode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gjelderPeriode' when calling hentFormuesgrunnlagEiendomsskatt");
        }
        
        // verify the required parameter 'kommunenummer' is set
        if (kommunenummer == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'kommunenummer' when calling hentFormuesgrunnlagEiendomsskatt");
        }
        
        // verify the required parameter 'eksternidentifikator' is set
        if (eksternidentifikator == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eksternidentifikator' when calling hentFormuesgrunnlagEiendomsskatt");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("rettighetspakke", rettighetspakke);
        uriVariables.put("gjelderPeriode", gjelderPeriode);
        uriVariables.put("kommunenummer", kommunenummer);
        uriVariables.put("eksternidentifikator", eksternidentifikator);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (korrelasjonsid != null)
        localVarHeaderParams.add("Korrelasjonsid", apiClient.parameterToString(korrelasjonsid));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<FormuesgrunnlagForEiendomsskatt> localReturnType = new ParameterizedTypeReference<FormuesgrunnlagForEiendomsskatt>() {};
        return apiClient.invokeAPI("/{rettighetspakke}/{gjelderPeriode}/{kommunenummer}/{eksternidentifikator}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
