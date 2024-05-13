package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Institute;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:16:34.786677241Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class KinderApi {
    private ApiClient apiClient;

    public KinderApi() {
        this(new ApiClient());
    }

    public KinderApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Liefert Kinddaten
     * Liefert Kinddaten einer Einrichtung anhand der kibigWebId in Gruppen gruppiert.
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - not Found
     * <p><b>4XX</b> - Sonstiger Client Fehler (4xx)
     * <p><b>5XX</b> - Server Fehler (5xx)
     * @param kibigWebId kibigWebId der Einrichtung für die Kinddaten abgerufen werden (required)
     * @return Institute
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Institute getGroupsWithKidsByKibigwebid(String kibigWebId) throws RestClientException {
        return getGroupsWithKidsByKibigwebidWithHttpInfo(kibigWebId).getBody();
    }

    /**
     * Liefert Kinddaten
     * Liefert Kinddaten einer Einrichtung anhand der kibigWebId in Gruppen gruppiert.
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - not Found
     * <p><b>4XX</b> - Sonstiger Client Fehler (4xx)
     * <p><b>5XX</b> - Server Fehler (5xx)
     * @param kibigWebId kibigWebId der Einrichtung für die Kinddaten abgerufen werden (required)
     * @return ResponseEntity&lt;Institute&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Institute> getGroupsWithKidsByKibigwebidWithHttpInfo(String kibigWebId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'kibigWebId' is set
        if (kibigWebId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'kibigWebId' when calling getGroupsWithKidsByKibigwebid");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("kibigWebId", kibigWebId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Institute> localReturnType = new ParameterizedTypeReference<Institute>() {};
        return apiClient.invokeAPI("/kitaApp/v1/einrichtungen/{kibigWebId}/mitGruppenUndKindern", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
