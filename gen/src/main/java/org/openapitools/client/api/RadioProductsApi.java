package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1RadiosGet200Response;
import org.openapitools.client.model.Model1RadiosRadioProductIdGet200Response;
import org.openapitools.client.model.Model1RadiosRadioProductIdUsersGet200Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut400Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut404Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdPut422Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response;
import org.openapitools.client.model.OneOfstringAnyType;
import org.openapitools.client.model.RequestBody18;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RadioProductsApi {
    private ApiClient apiClient;

    public RadioProductsApi() {
        this(new ApiClient());
    }

    public RadioProductsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List products
     * This endpoint allows you to retrieve all the products.
     * <p><b>200</b> - OK
     * <p><b>422</b> - Unprocessable Entity
     * @param accountId The account identifier (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @param _return *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  (optional)
     * @param limit *Optional parameter* that define the number of items to return&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  (optional)
     * @param skip *Optional parameter* that define the index of the first item to return (0 &#x3D; first item)&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  (optional)
     * @param page *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param perPage *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param orderBy *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @param order *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional, default to asc)
     * @param orderFor *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @return Model1RadiosGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosGet200Response call1radiosGet(Integer accountId, String with, String _return, Integer limit, Integer skip, Integer page, Integer perPage, OneOfstringAnyType orderBy, String order, Object orderFor) throws RestClientException {
        return call1radiosGetWithHttpInfo(accountId, with, _return, limit, skip, page, perPage, orderBy, order, orderFor).getBody();
    }

    /**
     * List products
     * This endpoint allows you to retrieve all the products.
     * <p><b>200</b> - OK
     * <p><b>422</b> - Unprocessable Entity
     * @param accountId The account identifier (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @param _return *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  (optional)
     * @param limit *Optional parameter* that define the number of items to return&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  (optional)
     * @param skip *Optional parameter* that define the index of the first item to return (0 &#x3D; first item)&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  (optional)
     * @param page *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param perPage *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param orderBy *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @param order *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional, default to asc)
     * @param orderFor *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @return ResponseEntity&lt;Model1RadiosGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosGet200Response> call1radiosGetWithHttpInfo(Integer accountId, String with, String _return, Integer limit, Integer skip, Integer page, Integer perPage, OneOfstringAnyType orderBy, String order, Object orderFor) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling call1radiosGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "account_id", accountId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "return", _return));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "skip", skip));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "order_by", orderBy));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "order_for", orderFor));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1RadiosGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosGet200Response>() {};
        return apiClient.invokeAPI("/1/radios", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get product
     * This endpoint allows you to retrieve a product.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the station to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1RadiosRadioProductIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdGet200Response call1radiosRadioProductIdGet(Integer radioProductId, String with) throws RestClientException {
        return call1radiosRadioProductIdGetWithHttpInfo(radioProductId, with).getBody();
    }

    /**
     * Get product
     * This endpoint allows you to retrieve a product.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the station to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdGet200Response> call1radiosRadioProductIdGetWithHttpInfo(Integer radioProductId, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1RadiosRadioProductIdGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdGet200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update product
     * This endpoint allows you to update a product.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param requestBody18  (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdPut(Integer radioProductId, RequestBody18 requestBody18) throws RestClientException {
        return call1radiosRadioProductIdPutWithHttpInfo(radioProductId, requestBody18).getBody();
    }

    /**
     * Update product
     * This endpoint allows you to update a product.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param requestBody18  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1radiosRadioProductIdPutWithHttpInfo(Integer radioProductId, RequestBody18 requestBody18) throws RestClientException {
        Object localVarPostBody = requestBody18;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List users
     * This endpoint allows you to retrieve all users attach to the product.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the station to request. (required)
     * @return Model1RadiosRadioProductIdUsersGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdUsersGet200Response call1radiosRadioProductIdUsersGet(Integer radioProductId) throws RestClientException {
        return call1radiosRadioProductIdUsersGetWithHttpInfo(radioProductId).getBody();
    }

    /**
     * List users
     * This endpoint allows you to retrieve all users attach to the product.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the station to request. (required)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdUsersGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdUsersGet200Response> call1radiosRadioProductIdUsersGetWithHttpInfo(Integer radioProductId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdUsersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1RadiosRadioProductIdUsersGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdUsersGet200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/users", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
