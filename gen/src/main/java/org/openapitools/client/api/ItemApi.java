package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Item;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:25.962969645Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * Add a new item
     * 
     * <p><b>200</b> - Successful operation
     * @param item  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void itemAdditemPost(Item item) throws RestClientException {
        itemAdditemPostWithHttpInfo(item);
    }

    /**
     * Add a new item
     * 
     * <p><b>200</b> - Successful operation
     * @param item  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> itemAdditemPostWithHttpInfo(Item item) throws RestClientException {
        Object localVarPostBody = item;
        
        // verify the required parameter 'item' is set
        if (item == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'item' when calling itemAdditemPost");
        }
        

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
        return apiClient.invokeAPI("/item/additem", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete item by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param itemID ID of the item to delete (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void itemDeleteitemItemIDDelete(Integer itemID) throws RestClientException {
        itemDeleteitemItemIDDeleteWithHttpInfo(itemID);
    }

    /**
     * Delete item by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param itemID ID of the item to delete (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> itemDeleteitemItemIDDeleteWithHttpInfo(Integer itemID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'itemID' is set
        if (itemID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'itemID' when calling itemDeleteitemItemIDDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("itemID", itemID);

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
        return apiClient.invokeAPI("/item/deleteitem/{itemID}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all items
     * 
     * <p><b>200</b> - Successful operation
     * @return List&lt;Item&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Item> itemGetitemsGet() throws RestClientException {
        return itemGetitemsGetWithHttpInfo().getBody();
    }

    /**
     * Get all items
     * 
     * <p><b>200</b> - Successful operation
     * @return ResponseEntity&lt;List&lt;Item&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Item>> itemGetitemsGetWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<List<Item>> localReturnType = new ParameterizedTypeReference<List<Item>>() {};
        return apiClient.invokeAPI("/item/getitems", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get item by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param itemID ID of the item to get (required)
     * @return Item
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Item itemItemIDGet(Integer itemID) throws RestClientException {
        return itemItemIDGetWithHttpInfo(itemID).getBody();
    }

    /**
     * Get item by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param itemID ID of the item to get (required)
     * @return ResponseEntity&lt;Item&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Item> itemItemIDGetWithHttpInfo(Integer itemID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'itemID' is set
        if (itemID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'itemID' when calling itemItemIDGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("itemID", itemID);

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

        ParameterizedTypeReference<Item> localReturnType = new ParameterizedTypeReference<Item>() {};
        return apiClient.invokeAPI("/item/{itemID}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update item by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param itemID ID of the item to update (required)
     * @param item  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void itemUpdateitemItemIDPut(Integer itemID, Item item) throws RestClientException {
        itemUpdateitemItemIDPutWithHttpInfo(itemID, item);
    }

    /**
     * Update item by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param itemID ID of the item to update (required)
     * @param item  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> itemUpdateitemItemIDPutWithHttpInfo(Integer itemID, Item item) throws RestClientException {
        Object localVarPostBody = item;
        
        // verify the required parameter 'itemID' is set
        if (itemID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'itemID' when calling itemUpdateitemItemIDPut");
        }
        
        // verify the required parameter 'item' is set
        if (item == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'item' when calling itemUpdateitemItemIDPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("itemID", itemID);

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
        return apiClient.invokeAPI("/item/updateitem/{itemID}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
