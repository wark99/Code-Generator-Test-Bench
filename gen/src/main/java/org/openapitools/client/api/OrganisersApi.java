package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GetOrganiser200Response;
import org.openapitools.client.model.GetOrganisers200Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:35.686627593Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OrganisersApi {
    private ApiClient apiClient;

    public OrganisersApi() {
        this(new ApiClient());
    }

    public OrganisersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get an organiser
     * Retrieve the organiser.
     * <p><b>200</b> - Returns an Organiser object.
     * <p><b>404</b> - Organiser not found.
     * @param organiserId  (required)
     * @return GetOrganiser200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetOrganiser200Response getOrganiser(String organiserId) throws RestClientException {
        return getOrganiserWithHttpInfo(organiserId).getBody();
    }

    /**
     * Get an organiser
     * Retrieve the organiser.
     * <p><b>200</b> - Returns an Organiser object.
     * <p><b>404</b> - Organiser not found.
     * @param organiserId  (required)
     * @return ResponseEntity&lt;GetOrganiser200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetOrganiser200Response> getOrganiserWithHttpInfo(String organiserId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organiserId' is set
        if (organiserId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organiserId' when calling getOrganiser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organiserId", organiserId);

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

        ParameterizedTypeReference<GetOrganiser200Response> localReturnType = new ParameterizedTypeReference<GetOrganiser200Response>() {};
        return apiClient.invokeAPI("/organisers/{organiserId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List organisers
     * Retrieve a list of organisers.
     * <p><b>200</b> - Returns a list of Organiser objects.  When the user filter is provided, the list contains only organisers the user is linked too.
     * @param filterUser ID of the user (optional)
     * @return GetOrganisers200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetOrganisers200Response getOrganisers(Integer filterUser) throws RestClientException {
        return getOrganisersWithHttpInfo(filterUser).getBody();
    }

    /**
     * List organisers
     * Retrieve a list of organisers.
     * <p><b>200</b> - Returns a list of Organiser objects.  When the user filter is provided, the list contains only organisers the user is linked too.
     * @param filterUser ID of the user (optional)
     * @return ResponseEntity&lt;GetOrganisers200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetOrganisers200Response> getOrganisersWithHttpInfo(Integer filterUser) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[user]", filterUser));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetOrganisers200Response> localReturnType = new ParameterizedTypeReference<GetOrganisers200Response>() {};
        return apiClient.invokeAPI("/organisers", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
