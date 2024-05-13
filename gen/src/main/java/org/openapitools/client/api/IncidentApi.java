package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Incident;
import org.openapitools.client.model.Tag;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:14:49.334490151Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IncidentApi {
    private ApiClient apiClient;

    public IncidentApi() {
        this(new ApiClient());
    }

    public IncidentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Finds Incidents
     * Finds all incidents after applying filters. Returns results in reverse chronological order.
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid parameter value
     * <p><b>403</b> - Missing or invalid authentication token
     * @param tags Tag values that need to be considered for filter (optional)
     * @param startTimestamp Restrict incidents to those containing an alert after startTimestamp, which is a UNIX timestamp (seconds since the January 1, 1970). (optional)
     * @param endTimestamp Restrict incidents to those containing an alert before endTimestamp, which is a UNIX timestamp (seconds since the January 1, 1970). (optional)
     * @return List&lt;Incident&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Incident> incidentsGet(List<Tag> tags, Integer startTimestamp, Integer endTimestamp) throws RestClientException {
        return incidentsGetWithHttpInfo(tags, startTimestamp, endTimestamp).getBody();
    }

    /**
     * Finds Incidents
     * Finds all incidents after applying filters. Returns results in reverse chronological order.
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid parameter value
     * <p><b>403</b> - Missing or invalid authentication token
     * @param tags Tag values that need to be considered for filter (optional)
     * @param startTimestamp Restrict incidents to those containing an alert after startTimestamp, which is a UNIX timestamp (seconds since the January 1, 1970). (optional)
     * @param endTimestamp Restrict incidents to those containing an alert before endTimestamp, which is a UNIX timestamp (seconds since the January 1, 1970). (optional)
     * @return ResponseEntity&lt;List&lt;Incident&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Incident>> incidentsGetWithHttpInfo(List<Tag> tags, Integer startTimestamp, Integer endTimestamp) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "tags", tags));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "startTimestamp", startTimestamp));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "endTimestamp", endTimestamp));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<List<Incident>> localReturnType = new ParameterizedTypeReference<List<Incident>>() {};
        return apiClient.invokeAPI("/incidents", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
