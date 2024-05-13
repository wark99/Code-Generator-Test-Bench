package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.FluxState;
import org.openapitools.client.model.SensorState;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:19:53.299039697Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class HealthApi {
    private ApiClient apiClient;

    public HealthApi() {
        this(new ApiClient());
    }

    public HealthApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Receive the state of the SDANet Flux mesh network.
     * 
     * <p><b>200</b> - A successful state lookup.
     * <p><b>400</b> - A failed lookup, the site ID wasn&#39;t found.
     * @param siteID The ID of the site to retrieve Flux link status. (optional)
     * @return FluxState
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FluxState fluxStateGet(String siteID) throws RestClientException {
        return fluxStateGetWithHttpInfo(siteID).getBody();
    }

    /**
     * Receive the state of the SDANet Flux mesh network.
     * 
     * <p><b>200</b> - A successful state lookup.
     * <p><b>400</b> - A failed lookup, the site ID wasn&#39;t found.
     * @param siteID The ID of the site to retrieve Flux link status. (optional)
     * @return ResponseEntity&lt;FluxState&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FluxState> fluxStateGetWithHttpInfo(String siteID) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "siteID", siteID));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<FluxState> localReturnType = new ParameterizedTypeReference<FluxState>() {};
        return apiClient.invokeAPI("/flux-state", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Receive the state of a C2 or sensor site.
     * 
     * <p><b>200</b> - A successful state lookup.
     * <p><b>400</b> - A failed lookup, the site ID wasn&#39;t found.
     * @param siteID The ID of the site to retrieve health status (optional)
     * @return SensorState
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SensorState siteStateGet(String siteID) throws RestClientException {
        return siteStateGetWithHttpInfo(siteID).getBody();
    }

    /**
     * Receive the state of a C2 or sensor site.
     * 
     * <p><b>200</b> - A successful state lookup.
     * <p><b>400</b> - A failed lookup, the site ID wasn&#39;t found.
     * @param siteID The ID of the site to retrieve health status (optional)
     * @return ResponseEntity&lt;SensorState&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SensorState> siteStateGetWithHttpInfo(String siteID) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "siteID", siteID));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<SensorState> localReturnType = new ParameterizedTypeReference<SensorState>() {};
        return apiClient.invokeAPI("/site-state", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update the state of a C2 or sensor site.
     * 
     * @param sensorState The message content to send (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void siteStatePost(SensorState sensorState) throws RestClientException {
        siteStatePostWithHttpInfo(sensorState);
    }

    /**
     * Update the state of a C2 or sensor site.
     * 
     * @param sensorState The message content to send (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> siteStatePostWithHttpInfo(SensorState sensorState) throws RestClientException {
        Object localVarPostBody = sensorState;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/site-state", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
