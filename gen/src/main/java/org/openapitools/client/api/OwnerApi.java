package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Owner;
import org.openapitools.client.model.OwnerRequest;
import org.openapitools.client.model.OwnersGet200Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:15:56.819646984Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OwnerApi {
    private ApiClient apiClient;

    public OwnerApi() {
        this(new ApiClient());
    }

    public OwnerApi(ApiClient apiClient) {
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
     * List all owners by the given page number and page size. The page parameters such as &#x60;last&#x60; and &#x60;first&#x60; must be used to check the data set boundtries when paginating the owners list. Using invalid values such as out of boundary values will result in &#x60;400&#x60; errors. 
     * <p><b>200</b> - The current requested page of owners
     * <p><b>400</b> - If the page parameters are invalid, for example if the page number of out of boundary of maximum number of pages.
     * @param page The page number to fetch. (required)
     * @param size The page size to fetch. (required)
     * @return OwnersGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OwnersGet200Response ownersGet(Integer page, Integer size) throws RestClientException {
        return ownersGetWithHttpInfo(page, size).getBody();
    }

    /**
     * 
     * List all owners by the given page number and page size. The page parameters such as &#x60;last&#x60; and &#x60;first&#x60; must be used to check the data set boundtries when paginating the owners list. Using invalid values such as out of boundary values will result in &#x60;400&#x60; errors. 
     * <p><b>200</b> - The current requested page of owners
     * <p><b>400</b> - If the page parameters are invalid, for example if the page number of out of boundary of maximum number of pages.
     * @param page The page number to fetch. (required)
     * @param size The page size to fetch. (required)
     * @return ResponseEntity&lt;OwnersGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OwnersGet200Response> ownersGetWithHttpInfo(Integer page, Integer size) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'page' when calling ownersGet");
        }
        
        // verify the required parameter 'size' is set
        if (size == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'size' when calling ownersGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<OwnersGet200Response> localReturnType = new ParameterizedTypeReference<OwnersGet200Response>() {};
        return apiClient.invokeAPI("/owners", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Unregister a owner will remove the connection with the current pets this owner has. All connected pets will considered as ophant. 
     * <p><b>200</b> - Owner is successfully unregistered from the registry.
     * @param id The owner id in the system. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void ownersIdDelete(String id) throws RestClientException {
        ownersIdDeleteWithHttpInfo(id);
    }

    /**
     * 
     * Unregister a owner will remove the connection with the current pets this owner has. All connected pets will considered as ophant. 
     * <p><b>200</b> - Owner is successfully unregistered from the registry.
     * @param id The owner id in the system. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> ownersIdDeleteWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling ownersIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/owners/{id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Get information about a single owner identified by the system id
     * <p><b>200</b> - The owner for the given system id.
     * <p><b>404</b> - A owner could not be identified by the given system id.
     * @param id The owner id in the system. (required)
     * @return Owner
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Owner ownersIdGet(String id) throws RestClientException {
        return ownersIdGetWithHttpInfo(id).getBody();
    }

    /**
     * 
     * Get information about a single owner identified by the system id
     * <p><b>200</b> - The owner for the given system id.
     * <p><b>404</b> - A owner could not be identified by the given system id.
     * @param id The owner id in the system. (required)
     * @return ResponseEntity&lt;Owner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Owner> ownersIdGetWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling ownersIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        ParameterizedTypeReference<Owner> localReturnType = new ParameterizedTypeReference<Owner>() {};
        return apiClient.invokeAPI("/owners/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Register a new owner in the registry.
     * <p><b>200</b> - Successfully registered the owner.
     * @param ownerRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void ownersPost(OwnerRequest ownerRequest) throws RestClientException {
        ownersPostWithHttpInfo(ownerRequest);
    }

    /**
     * 
     * Register a new owner in the registry.
     * <p><b>200</b> - Successfully registered the owner.
     * @param ownerRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> ownersPostWithHttpInfo(OwnerRequest ownerRequest) throws RestClientException {
        Object localVarPostBody = ownerRequest;
        

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
        return apiClient.invokeAPI("/owners", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
