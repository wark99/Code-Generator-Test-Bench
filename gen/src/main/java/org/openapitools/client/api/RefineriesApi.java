package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GetRefineriesAuditsOkResponse;
import org.openapitools.client.model.GetRefineriesCapacitiesOkResponse;
import org.openapitools.client.model.GetRefineriesMethodsOkResponse;
import org.openapitools.client.model.GetRefineriesYieldsOkResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:46.594754675Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RefineriesApi {
    private ApiClient apiClient;

    public RefineriesApi() {
        this(new ApiClient());
    }

    public RefineriesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve a list of all refinery audits submitted by Data Runners.
     * 
     * <p><b>200</b> - OK
     * @return GetRefineriesAuditsOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetRefineriesAuditsOkResponse getRefineriesAudits() throws RestClientException {
        return getRefineriesAuditsWithHttpInfo().getBody();
    }

    /**
     * Retrieve a list of all refinery audits submitted by Data Runners.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;GetRefineriesAuditsOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetRefineriesAuditsOkResponse> getRefineriesAuditsWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<GetRefineriesAuditsOkResponse> localReturnType = new ParameterizedTypeReference<GetRefineriesAuditsOkResponse>() {};
        return apiClient.invokeAPI("/refineries_audits/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of the estimated capacity percentages for all refineries.
     * 
     * <p><b>200</b> - OK
     * @return GetRefineriesCapacitiesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetRefineriesCapacitiesOkResponse getRefineriesCapacities() throws RestClientException {
        return getRefineriesCapacitiesWithHttpInfo().getBody();
    }

    /**
     * Retrieve a list of the estimated capacity percentages for all refineries.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;GetRefineriesCapacitiesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetRefineriesCapacitiesOkResponse> getRefineriesCapacitiesWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<GetRefineriesCapacitiesOkResponse> localReturnType = new ParameterizedTypeReference<GetRefineriesCapacitiesOkResponse>() {};
        return apiClient.invokeAPI("/refineries_capacities/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of the refining methods used by all in-game refineries
     * 
     * <p><b>200</b> - OK
     * @return GetRefineriesMethodsOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetRefineriesMethodsOkResponse getRefineriesMethods() throws RestClientException {
        return getRefineriesMethodsWithHttpInfo().getBody();
    }

    /**
     * Retrieve a list of the refining methods used by all in-game refineries
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;GetRefineriesMethodsOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetRefineriesMethodsOkResponse> getRefineriesMethodsWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<GetRefineriesMethodsOkResponse> localReturnType = new ParameterizedTypeReference<GetRefineriesMethodsOkResponse>() {};
        return apiClient.invokeAPI("/refineries_methods/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of all refineries yields bonuses per commodity
     * 
     * <p><b>200</b> - OK
     * @return GetRefineriesYieldsOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetRefineriesYieldsOkResponse getRefineriesYields() throws RestClientException {
        return getRefineriesYieldsWithHttpInfo().getBody();
    }

    /**
     * Retrieve a list of all refineries yields bonuses per commodity
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;GetRefineriesYieldsOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetRefineriesYieldsOkResponse> getRefineriesYieldsWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<GetRefineriesYieldsOkResponse> localReturnType = new ParameterizedTypeReference<GetRefineriesYieldsOkResponse>() {};
        return apiClient.invokeAPI("/refineries_yields/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
