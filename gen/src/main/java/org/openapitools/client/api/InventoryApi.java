package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Inventory;

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
public class InventoryApi {
    private ApiClient apiClient;

    public InventoryApi() {
        this(new ApiClient());
    }

    public InventoryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a new inventory
     * 
     * <p><b>200</b> - Successful operation
     * @param inventory  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void inventoryAddnewinventoryPost(Inventory inventory) throws RestClientException {
        inventoryAddnewinventoryPostWithHttpInfo(inventory);
    }

    /**
     * Add a new inventory
     * 
     * <p><b>200</b> - Successful operation
     * @param inventory  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> inventoryAddnewinventoryPostWithHttpInfo(Inventory inventory) throws RestClientException {
        Object localVarPostBody = inventory;
        
        // verify the required parameter 'inventory' is set
        if (inventory == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventory' when calling inventoryAddnewinventoryPost");
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
        return apiClient.invokeAPI("/inventory/addnewinventory", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete inventory by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param inventoryID ID of the inventory to delete (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void inventoryDeleteInventoryInventoryIDDelete(Integer inventoryID) throws RestClientException {
        inventoryDeleteInventoryInventoryIDDeleteWithHttpInfo(inventoryID);
    }

    /**
     * Delete inventory by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param inventoryID ID of the inventory to delete (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> inventoryDeleteInventoryInventoryIDDeleteWithHttpInfo(Integer inventoryID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inventoryID' is set
        if (inventoryID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventoryID' when calling inventoryDeleteInventoryInventoryIDDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("inventoryID", inventoryID);

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
        return apiClient.invokeAPI("/inventory/deleteInventory/{inventoryID}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all inventories
     * 
     * <p><b>200</b> - Successful operation
     * @return List&lt;Inventory&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Inventory> inventoryGetinventoriesGet() throws RestClientException {
        return inventoryGetinventoriesGetWithHttpInfo().getBody();
    }

    /**
     * Get all inventories
     * 
     * <p><b>200</b> - Successful operation
     * @return ResponseEntity&lt;List&lt;Inventory&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Inventory>> inventoryGetinventoriesGetWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<List<Inventory>> localReturnType = new ParameterizedTypeReference<List<Inventory>>() {};
        return apiClient.invokeAPI("/inventory/getinventories", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get inventory by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param inventoryID ID of the inventory to get (required)
     * @return Inventory
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Inventory inventoryInventoryIDGet(Integer inventoryID) throws RestClientException {
        return inventoryInventoryIDGetWithHttpInfo(inventoryID).getBody();
    }

    /**
     * Get inventory by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param inventoryID ID of the inventory to get (required)
     * @return ResponseEntity&lt;Inventory&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Inventory> inventoryInventoryIDGetWithHttpInfo(Integer inventoryID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inventoryID' is set
        if (inventoryID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventoryID' when calling inventoryInventoryIDGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("inventoryID", inventoryID);

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

        ParameterizedTypeReference<Inventory> localReturnType = new ParameterizedTypeReference<Inventory>() {};
        return apiClient.invokeAPI("/inventory/{inventoryID}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update inventory by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param inventoryID ID of the inventory to update (required)
     * @param inventory  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void inventoryUpdateInventoryInventoryIDPut(Integer inventoryID, Inventory inventory) throws RestClientException {
        inventoryUpdateInventoryInventoryIDPutWithHttpInfo(inventoryID, inventory);
    }

    /**
     * Update inventory by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param inventoryID ID of the inventory to update (required)
     * @param inventory  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> inventoryUpdateInventoryInventoryIDPutWithHttpInfo(Integer inventoryID, Inventory inventory) throws RestClientException {
        Object localVarPostBody = inventory;
        
        // verify the required parameter 'inventoryID' is set
        if (inventoryID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventoryID' when calling inventoryUpdateInventoryInventoryIDPut");
        }
        
        // verify the required parameter 'inventory' is set
        if (inventory == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inventory' when calling inventoryUpdateInventoryInventoryIDPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("inventoryID", inventoryID);

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
        return apiClient.invokeAPI("/inventory/updateInventory/{inventoryID}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
