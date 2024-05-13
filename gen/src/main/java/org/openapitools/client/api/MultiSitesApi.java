package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IndexPhpMethodMultiSitesGetAllPostRequest;
import org.openapitools.client.model.IndexPhpMethodMultiSitesGetAllWithGroupsPostRequest;
import org.openapitools.client.model.IndexPhpMethodMultiSitesGetOnePostRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MultiSitesApi {
    private ApiClient apiClient;

    public MultiSitesApi() {
        this(new ApiClient());
    }

    public MultiSitesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * @param indexPhpMethodMultiSitesGetAllPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMultiSitesGetAllPost(IndexPhpMethodMultiSitesGetAllPostRequest indexPhpMethodMultiSitesGetAllPostRequest) throws RestClientException {
        indexPhpmethodMultiSitesGetAllPostWithHttpInfo(indexPhpMethodMultiSitesGetAllPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodMultiSitesGetAllPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMultiSitesGetAllPostWithHttpInfo(IndexPhpMethodMultiSitesGetAllPostRequest indexPhpMethodMultiSitesGetAllPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodMultiSitesGetAllPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=MultiSites.getAll", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodMultiSitesGetAllWithGroupsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMultiSitesGetAllWithGroupsPost(IndexPhpMethodMultiSitesGetAllWithGroupsPostRequest indexPhpMethodMultiSitesGetAllWithGroupsPostRequest) throws RestClientException {
        indexPhpmethodMultiSitesGetAllWithGroupsPostWithHttpInfo(indexPhpMethodMultiSitesGetAllWithGroupsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodMultiSitesGetAllWithGroupsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMultiSitesGetAllWithGroupsPostWithHttpInfo(IndexPhpMethodMultiSitesGetAllWithGroupsPostRequest indexPhpMethodMultiSitesGetAllWithGroupsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodMultiSitesGetAllWithGroupsPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=MultiSites.getAllWithGroups", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodMultiSitesGetOnePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMultiSitesGetOnePost(IndexPhpMethodMultiSitesGetOnePostRequest indexPhpMethodMultiSitesGetOnePostRequest) throws RestClientException {
        indexPhpmethodMultiSitesGetOnePostWithHttpInfo(indexPhpMethodMultiSitesGetOnePostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodMultiSitesGetOnePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMultiSitesGetOnePostWithHttpInfo(IndexPhpMethodMultiSitesGetOnePostRequest indexPhpMethodMultiSitesGetOnePostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodMultiSitesGetOnePostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=MultiSites.getOne", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
