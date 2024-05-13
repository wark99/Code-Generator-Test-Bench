package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ItemsIdPatchRequest;
import org.openapitools.client.model.ItemsPostRequest;

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
public class ItemApi {
    private ApiClient apiClient;

    public ItemApi() {
        this(new ApiClient());
    }

    public ItemApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve all items
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>400</b> - The request parameters are invalid.
     * <p><b>403</b> - The user is not authorized to perform the operation.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void itemsGet() throws RestClientException {
        itemsGetWithHttpInfo();
    }

    /**
     * Retrieve all items
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>400</b> - The request parameters are invalid.
     * <p><b>403</b> - The user is not authorized to perform the operation.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> itemsGetWithHttpInfo() throws RestClientException {
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
        return apiClient.invokeAPI("/items", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete an item by ID
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>403</b> - The user is not authorized.
     * <p><b>404</b> - The requested item could not be found.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @param id ID of the item to delete (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void itemsIdDelete(Integer id) throws RestClientException {
        itemsIdDeleteWithHttpInfo(id);
    }

    /**
     * Delete an item by ID
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>403</b> - The user is not authorized.
     * <p><b>404</b> - The requested item could not be found.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @param id ID of the item to delete (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> itemsIdDeleteWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling itemsIdDelete");
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
        return apiClient.invokeAPI("/items/{id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a specific item by ID
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>404</b> - The requested item could not be found.
     * @param id ID of the item to retrieve (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void itemsIdGet(Integer id) throws RestClientException {
        itemsIdGetWithHttpInfo(id);
    }

    /**
     * Retrieve a specific item by ID
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>404</b> - The requested item could not be found.
     * @param id ID of the item to retrieve (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> itemsIdGetWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling itemsIdGet");
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
        return apiClient.invokeAPI("/items/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Partially update an item by ID
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>400</b> - The request body is missing or contains invalid parameters.
     * <p><b>403</b> - The user is not authorized.
     * <p><b>404</b> - The requested item could not be found.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @param id ID of the item to update (required)
     * @param itemsIdPatchRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void itemsIdPatch(Integer id, ItemsIdPatchRequest itemsIdPatchRequest) throws RestClientException {
        itemsIdPatchWithHttpInfo(id, itemsIdPatchRequest);
    }

    /**
     * Partially update an item by ID
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>400</b> - The request body is missing or contains invalid parameters.
     * <p><b>403</b> - The user is not authorized.
     * <p><b>404</b> - The requested item could not be found.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @param id ID of the item to update (required)
     * @param itemsIdPatchRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> itemsIdPatchWithHttpInfo(Integer id, ItemsIdPatchRequest itemsIdPatchRequest) throws RestClientException {
        Object localVarPostBody = itemsIdPatchRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling itemsIdPatch");
        }
        
        // verify the required parameter 'itemsIdPatchRequest' is set
        if (itemsIdPatchRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'itemsIdPatchRequest' when calling itemsIdPatch");
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
        return apiClient.invokeAPI("/items/{id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update an item by ID
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>400</b> - The request body is missing or contains invalid parameters.
     * <p><b>403</b> - The user is not authorized.
     * <p><b>404</b> - The requested item could not be found.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @param id ID of the item to update (required)
     * @param itemsPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void itemsIdPut(Integer id, ItemsPostRequest itemsPostRequest) throws RestClientException {
        itemsIdPutWithHttpInfo(id, itemsPostRequest);
    }

    /**
     * Update an item by ID
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>400</b> - The request body is missing or contains invalid parameters.
     * <p><b>403</b> - The user is not authorized.
     * <p><b>404</b> - The requested item could not be found.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @param id ID of the item to update (required)
     * @param itemsPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> itemsIdPutWithHttpInfo(Integer id, ItemsPostRequest itemsPostRequest) throws RestClientException {
        Object localVarPostBody = itemsPostRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling itemsIdPut");
        }
        
        // verify the required parameter 'itemsPostRequest' is set
        if (itemsPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'itemsPostRequest' when calling itemsIdPut");
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
        return apiClient.invokeAPI("/items/{id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create an item
     * 
     * <p><b>201</b> - The item was successfully created.
     * <p><b>400</b> - The request body is missing or contains invalid parameters.
     * <p><b>403</b> - The user is not authorized to perform the operation.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @param itemsPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void itemsPost(ItemsPostRequest itemsPostRequest) throws RestClientException {
        itemsPostWithHttpInfo(itemsPostRequest);
    }

    /**
     * Create an item
     * 
     * <p><b>201</b> - The item was successfully created.
     * <p><b>400</b> - The request body is missing or contains invalid parameters.
     * <p><b>403</b> - The user is not authorized to perform the operation.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @param itemsPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> itemsPostWithHttpInfo(ItemsPostRequest itemsPostRequest) throws RestClientException {
        Object localVarPostBody = itemsPostRequest;
        
        // verify the required parameter 'itemsPostRequest' is set
        if (itemsPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'itemsPostRequest' when calling itemsPost");
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
        return apiClient.invokeAPI("/items", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
