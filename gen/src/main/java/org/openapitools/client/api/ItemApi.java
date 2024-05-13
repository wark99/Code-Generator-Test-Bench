package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AddNewItem200ResponseInner;
import org.openapitools.client.model.Iteminput;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:22:43.478746035Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * 
     * 
     * <p><b>200</b> - Response
     * <p><b>201</b> - Successfully created a new item
     * <p><b>405</b> - the requested method is not allowed for this resource
     * <p><b>409</b> - item with the same id already exists
     * @return List&lt;AddNewItem200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AddNewItem200ResponseInner> addNewItem() throws RestClientException {
        return addNewItemWithHttpInfo().getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Response
     * <p><b>201</b> - Successfully created a new item
     * <p><b>405</b> - the requested method is not allowed for this resource
     * <p><b>409</b> - item with the same id already exists
     * @return ResponseEntity&lt;List&lt;AddNewItem200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AddNewItem200ResponseInner>> addNewItemWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<List<AddNewItem200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<AddNewItem200ResponseInner>>() {};
        return apiClient.invokeAPI("/item", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Deletes an item
     * Delete an item by ID
     * <p><b>200</b> - Item Deleted
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>403</b> - the server understood the delete request but refuses to authorize it
     * <p><b>404</b> - Item not found
     * @param productId ID of the item to delete (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteItem(Integer productId) throws RestClientException {
        deleteItemWithHttpInfo(productId);
    }

    /**
     * Deletes an item
     * Delete an item by ID
     * <p><b>200</b> - Item Deleted
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>403</b> - the server understood the delete request but refuses to authorize it
     * <p><b>404</b> - Item not found
     * @param productId ID of the item to delete (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteItemWithHttpInfo(Integer productId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling deleteItem");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "product_id", productId));
        

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/item/{product_id}", HttpMethod.DELETE, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Returns all registered items
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - invalid request format
     * <p><b>404</b> - No items found
     * @return List&lt;Iteminput&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Iteminput> getAllItems() throws RestClientException {
        return getAllItemsWithHttpInfo().getBody();
    }

    /**
     * 
     * Returns all registered items
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - invalid request format
     * <p><b>404</b> - No items found
     * @return ResponseEntity&lt;List&lt;Iteminput&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Iteminput>> getAllItemsWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<List<Iteminput>> localReturnType = new ParameterizedTypeReference<List<Iteminput>>() {};
        return apiClient.invokeAPI("/item", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get item by ID
     * Returns a single item based on the provided ID.
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Item not found
     * <p><b>422</b> - Validation exception
     * @param productId ID of the item to retrieve (required)
     * @return Iteminput
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Iteminput getItemById(Integer productId) throws RestClientException {
        return getItemByIdWithHttpInfo(productId).getBody();
    }

    /**
     * Get item by ID
     * Returns a single item based on the provided ID.
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Item not found
     * <p><b>422</b> - Validation exception
     * @param productId ID of the item to retrieve (required)
     * @return ResponseEntity&lt;Iteminput&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Iteminput> getItemByIdWithHttpInfo(Integer productId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling getItemById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("product_id", productId);

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

        ParameterizedTypeReference<Iteminput> localReturnType = new ParameterizedTypeReference<Iteminput>() {};
        return apiClient.invokeAPI("/item/{product_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Update an existing item
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid ID
     * <p><b>404</b> - Item not found
     * <p><b>409</b> - conflict
     * @param productId ID (optional)
     * @param name Product name (optional)
     * @param price Price of product (optional)
     * @param iteminput Update an existent item (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object updateItem(Integer productId, String name, Integer price, Iteminput iteminput) throws RestClientException {
        return updateItemWithHttpInfo(productId, name, price, iteminput).getBody();
    }

    /**
     * 
     * Update an existing item
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid ID
     * <p><b>404</b> - Item not found
     * <p><b>409</b> - conflict
     * @param productId ID (optional)
     * @param name Product name (optional)
     * @param price Price of product (optional)
     * @param iteminput Update an existent item (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> updateItemWithHttpInfo(Integer productId, String name, Integer price, Iteminput iteminput) throws RestClientException {
        Object localVarPostBody = iteminput;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "product_id", productId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "Name", name));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "Price", price));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/item/{product_id}", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update an existing item
     * Update an existing item by ID using PATCH method
     * <p><b>200</b> - Item updated successfully
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Item not found
     * @param productId ID of the item to update (required)
     * @param iteminput Updated item information (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateItemPatch(Integer productId, Iteminput iteminput) throws RestClientException {
        updateItemPatchWithHttpInfo(productId, iteminput);
    }

    /**
     * Update an existing item
     * Update an existing item by ID using PATCH method
     * <p><b>200</b> - Item updated successfully
     * <p><b>204</b> - No Content
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Item not found
     * @param productId ID of the item to update (required)
     * @param iteminput Updated item information (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateItemPatchWithHttpInfo(Integer productId, Iteminput iteminput) throws RestClientException {
        Object localVarPostBody = iteminput;
        
        // verify the required parameter 'productId' is set
        if (productId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productId' when calling updateItemPatch");
        }
        
        // verify the required parameter 'iteminput' is set
        if (iteminput == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'iteminput' when calling updateItemPatch");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "product_id", productId));
        

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/item/{product_id}", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
