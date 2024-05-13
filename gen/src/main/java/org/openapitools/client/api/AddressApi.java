package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AddressesIdPatchRequest;
import org.openapitools.client.model.AddressesPostRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:19:45.736611184Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AddressApi {
    private ApiClient apiClient;

    public AddressApi() {
        this(new ApiClient());
    }

    public AddressApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve all addresses
     * 
     * <p><b>200</b> - The request was successful.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addressesGet() throws RestClientException {
        addressesGetWithHttpInfo();
    }

    /**
     * Retrieve all addresses
     * 
     * <p><b>200</b> - The request was successful.
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> addressesGetWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/addresses", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a specific address
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>404</b> - The requested address could not be found.
     * @param id ID of the address to delete (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addressesIdDelete(Integer id) throws RestClientException {
        addressesIdDeleteWithHttpInfo(id);
    }

    /**
     * Delete a specific address
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>404</b> - The requested address could not be found.
     * @param id ID of the address to delete (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> addressesIdDeleteWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling addressesIdDelete");
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
        return apiClient.invokeAPI("/addresses/{id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a specific address
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>404</b> - The requested address could not be found.
     * @param id ID of the address to retrieve (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addressesIdGet(Integer id) throws RestClientException {
        addressesIdGetWithHttpInfo(id);
    }

    /**
     * Retrieve a specific address
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>404</b> - The requested address could not be found.
     * @param id ID of the address to retrieve (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> addressesIdGetWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling addressesIdGet");
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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/addresses/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Partially update a specific address
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>400</b> - The request body is missing or contains invalid parameters.
     * <p><b>404</b> - The requested address could not be found.
     * @param id ID of the address to update (required)
     * @param addressesIdPatchRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addressesIdPatch(Integer id, AddressesIdPatchRequest addressesIdPatchRequest) throws RestClientException {
        addressesIdPatchWithHttpInfo(id, addressesIdPatchRequest);
    }

    /**
     * Partially update a specific address
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>400</b> - The request body is missing or contains invalid parameters.
     * <p><b>404</b> - The requested address could not be found.
     * @param id ID of the address to update (required)
     * @param addressesIdPatchRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> addressesIdPatchWithHttpInfo(Integer id, AddressesIdPatchRequest addressesIdPatchRequest) throws RestClientException {
        Object localVarPostBody = addressesIdPatchRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling addressesIdPatch");
        }
        
        // verify the required parameter 'addressesIdPatchRequest' is set
        if (addressesIdPatchRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addressesIdPatchRequest' when calling addressesIdPatch");
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
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/addresses/{id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a specific address by ID
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>400</b> - The request body is missing or contains invalid parameters.
     * <p><b>404</b> - The requested address could not be found.
     * @param id ID of the address to update (required)
     * @param addressesPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addressesIdPut(Integer id, AddressesPostRequest addressesPostRequest) throws RestClientException {
        addressesIdPutWithHttpInfo(id, addressesPostRequest);
    }

    /**
     * Update a specific address by ID
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>400</b> - The request body is missing or contains invalid parameters.
     * <p><b>404</b> - The requested address could not be found.
     * @param id ID of the address to update (required)
     * @param addressesPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> addressesIdPutWithHttpInfo(Integer id, AddressesPostRequest addressesPostRequest) throws RestClientException {
        Object localVarPostBody = addressesPostRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling addressesIdPut");
        }
        
        // verify the required parameter 'addressesPostRequest' is set
        if (addressesPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addressesPostRequest' when calling addressesIdPut");
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
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/addresses/{id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a new address
     * 
     * <p><b>201</b> - The address was successfully created.
     * <p><b>400</b> - The request body is missing or contains invalid parameters.
     * @param addressesPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addressesPost(AddressesPostRequest addressesPostRequest) throws RestClientException {
        addressesPostWithHttpInfo(addressesPostRequest);
    }

    /**
     * Create a new address
     * 
     * <p><b>201</b> - The address was successfully created.
     * <p><b>400</b> - The request body is missing or contains invalid parameters.
     * @param addressesPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> addressesPostWithHttpInfo(AddressesPostRequest addressesPostRequest) throws RestClientException {
        Object localVarPostBody = addressesPostRequest;
        
        // verify the required parameter 'addressesPostRequest' is set
        if (addressesPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addressesPostRequest' when calling addressesPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/addresses", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
