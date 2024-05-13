package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GetOrganizationsOkResponse;

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
public class OrganizationsApi {
    private ApiClient apiClient;

    public OrganizationsApi() {
        this(new ApiClient());
    }

    public OrganizationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve a list of all organizations added to the UEX website
     * 
     * <p><b>200</b> - OK
     * @param idOrganization  (required)
     * @return GetOrganizationsOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetOrganizationsOkResponse getOrganizationsByOrganization(String idOrganization) throws RestClientException {
        return getOrganizationsByOrganizationWithHttpInfo(idOrganization).getBody();
    }

    /**
     * Retrieve a list of all organizations added to the UEX website
     * 
     * <p><b>200</b> - OK
     * @param idOrganization  (required)
     * @return ResponseEntity&lt;GetOrganizationsOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetOrganizationsOkResponse> getOrganizationsByOrganizationWithHttpInfo(String idOrganization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idOrganization' is set
        if (idOrganization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idOrganization' when calling getOrganizationsByOrganization");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id_organization", idOrganization);

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

        ParameterizedTypeReference<GetOrganizationsOkResponse> localReturnType = new ParameterizedTypeReference<GetOrganizationsOkResponse>() {};
        return apiClient.invokeAPI("/organizations/id_organization/{id_organization}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of all organizations added to the UEX website
     * 
     * <p><b>200</b> - OK
     * @param slug  (required)
     * @return GetOrganizationsOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetOrganizationsOkResponse getOrganizationsBySlug(String slug) throws RestClientException {
        return getOrganizationsBySlugWithHttpInfo(slug).getBody();
    }

    /**
     * Retrieve a list of all organizations added to the UEX website
     * 
     * <p><b>200</b> - OK
     * @param slug  (required)
     * @return ResponseEntity&lt;GetOrganizationsOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetOrganizationsOkResponse> getOrganizationsBySlugWithHttpInfo(String slug) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'slug' is set
        if (slug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'slug' when calling getOrganizationsBySlug");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("slug", slug);

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

        ParameterizedTypeReference<GetOrganizationsOkResponse> localReturnType = new ParameterizedTypeReference<GetOrganizationsOkResponse>() {};
        return apiClient.invokeAPI("/organizations/slug/{slug}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
