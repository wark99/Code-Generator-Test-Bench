package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.math.BigDecimal;
import org.openapitools.client.model.GetItemsOkResponse;
import org.openapitools.client.model.GetItemsPricesAllOkResponse;
import org.openapitools.client.model.GetItemsPricesOkResponse;

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
public class ItemsApi {
    private ApiClient apiClient;

    public ItemsApi() {
        this(new ApiClient());
    }

    public ItemsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve a comprehensive list of Star Citizen items, including ship components, weapons, and more.
     * 
     * <p><b>200</b> - OK
     * @param idCategory  (optional)
     * @return GetItemsOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetItemsOkResponse getItems(BigDecimal idCategory) throws RestClientException {
        return getItemsWithHttpInfo(idCategory).getBody();
    }

    /**
     * Retrieve a comprehensive list of Star Citizen items, including ship components, weapons, and more.
     * 
     * <p><b>200</b> - OK
     * @param idCategory  (optional)
     * @return ResponseEntity&lt;GetItemsOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetItemsOkResponse> getItemsWithHttpInfo(BigDecimal idCategory) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "id_category", idCategory));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetItemsOkResponse> localReturnType = new ParameterizedTypeReference<GetItemsOkResponse>() {};
        return apiClient.invokeAPI("/items/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of prices for all items in all terminals, all at once
     * 
     * <p><b>200</b> - OK
     * @param idCategory  (required)
     * @return GetItemsPricesAllOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetItemsPricesAllOkResponse getItemsPricesAllByCategory(String idCategory) throws RestClientException {
        return getItemsPricesAllByCategoryWithHttpInfo(idCategory).getBody();
    }

    /**
     * Retrieve a list of prices for all items in all terminals, all at once
     * 
     * <p><b>200</b> - OK
     * @param idCategory  (required)
     * @return ResponseEntity&lt;GetItemsPricesAllOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetItemsPricesAllOkResponse> getItemsPricesAllByCategoryWithHttpInfo(String idCategory) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idCategory' is set
        if (idCategory == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idCategory' when calling getItemsPricesAllByCategory");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id_category", idCategory);

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

        ParameterizedTypeReference<GetItemsPricesAllOkResponse> localReturnType = new ParameterizedTypeReference<GetItemsPricesAllOkResponse>() {};
        return apiClient.invokeAPI("/items_prices_all/id_category/{id_category}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a comprehensive list of prices for all items, including armor, ship components, weapons, and more.
     * 
     * <p><b>200</b> - OK
     * @param idCategory  (required)
     * @return GetItemsPricesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetItemsPricesOkResponse getItemsPricesByCategory(String idCategory) throws RestClientException {
        return getItemsPricesByCategoryWithHttpInfo(idCategory).getBody();
    }

    /**
     * Retrieve a comprehensive list of prices for all items, including armor, ship components, weapons, and more.
     * 
     * <p><b>200</b> - OK
     * @param idCategory  (required)
     * @return ResponseEntity&lt;GetItemsPricesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetItemsPricesOkResponse> getItemsPricesByCategoryWithHttpInfo(String idCategory) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idCategory' is set
        if (idCategory == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idCategory' when calling getItemsPricesByCategory");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id_category", idCategory);

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

        ParameterizedTypeReference<GetItemsPricesOkResponse> localReturnType = new ParameterizedTypeReference<GetItemsPricesOkResponse>() {};
        return apiClient.invokeAPI("/items_prices/id_category/{id_category}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a comprehensive list of prices for all items, including armor, ship components, weapons, and more.
     * 
     * <p><b>200</b> - OK
     * @param idItem  (required)
     * @return GetItemsPricesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetItemsPricesOkResponse getItemsPricesByItem(String idItem) throws RestClientException {
        return getItemsPricesByItemWithHttpInfo(idItem).getBody();
    }

    /**
     * Retrieve a comprehensive list of prices for all items, including armor, ship components, weapons, and more.
     * 
     * <p><b>200</b> - OK
     * @param idItem  (required)
     * @return ResponseEntity&lt;GetItemsPricesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetItemsPricesOkResponse> getItemsPricesByItemWithHttpInfo(String idItem) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idItem' is set
        if (idItem == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idItem' when calling getItemsPricesByItem");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id_item", idItem);

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

        ParameterizedTypeReference<GetItemsPricesOkResponse> localReturnType = new ParameterizedTypeReference<GetItemsPricesOkResponse>() {};
        return apiClient.invokeAPI("/items_prices/id_item/{id_item}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a comprehensive list of prices for all items, including armor, ship components, weapons, and more.
     * 
     * <p><b>200</b> - OK
     * @param idTerminal  (required)
     * @return GetItemsPricesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetItemsPricesOkResponse getItemsPricesByTerminal(String idTerminal) throws RestClientException {
        return getItemsPricesByTerminalWithHttpInfo(idTerminal).getBody();
    }

    /**
     * Retrieve a comprehensive list of prices for all items, including armor, ship components, weapons, and more.
     * 
     * <p><b>200</b> - OK
     * @param idTerminal  (required)
     * @return ResponseEntity&lt;GetItemsPricesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetItemsPricesOkResponse> getItemsPricesByTerminalWithHttpInfo(String idTerminal) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idTerminal' is set
        if (idTerminal == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idTerminal' when calling getItemsPricesByTerminal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id_terminal", idTerminal);

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

        ParameterizedTypeReference<GetItemsPricesOkResponse> localReturnType = new ParameterizedTypeReference<GetItemsPricesOkResponse>() {};
        return apiClient.invokeAPI("/items_prices/id_terminal/{id_terminal}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
