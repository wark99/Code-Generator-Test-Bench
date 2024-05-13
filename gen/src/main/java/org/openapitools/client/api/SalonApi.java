package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Salon;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:22:25.486395919Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SalonApi {
    private ApiClient apiClient;

    public SalonApi() {
        this(new ApiClient());
    }

    public SalonApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Liste des salons avec identifiant suivant les années
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b>
     * @param year Année de référence pour les salons retournés. (required)
     * @return List&lt;Salon&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Salon> listSalonsByYear(String year) throws RestClientException {
        return listSalonsByYearWithHttpInfo(year).getBody();
    }

    /**
     * Liste des salons avec identifiant suivant les années
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b>
     * @param year Année de référence pour les salons retournés. (required)
     * @return ResponseEntity&lt;List&lt;Salon&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Salon>> listSalonsByYearWithHttpInfo(String year) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'year' is set
        if (year == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'year' when calling listSalonsByYear");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "year", year));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Salon>> localReturnType = new ParameterizedTypeReference<List<Salon>>() {};
        return apiClient.invokeAPI("/listSalonsByYear", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
