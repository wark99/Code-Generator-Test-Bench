package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1RadiosPlayersPlayerUuidConfigPost200Response;
import org.openapitools.client.model.Model1RadiosRadioProductIdPlayersGet200Response;
import org.openapitools.client.model.Model1RadiosRadioProductIdPlayersPlayerIdGet200Response;
import org.openapitools.client.model.Model1RadiosRadioProductIdPlayersPlayerIdThumbnailPost200Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut400Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut404Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut500Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdPut422Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response;
import org.openapitools.client.model.OneOfstringAnyType;
import org.openapitools.client.model.RequestBody13;
import org.openapitools.client.model.RequestBody14;
import org.openapitools.client.model.RequestBody15;
import org.openapitools.client.model.RequestBody16;
import org.openapitools.client.model.RequestBody23;
import org.openapitools.client.model.RequestBody4;
import org.openapitools.client.model.RequestBody5;

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
public class PlayersApi {
    private ApiClient apiClient;

    public PlayersApi() {
        this(new ApiClient());
    }

    public PlayersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Check ip access to mountpoint
     * This endpoint allows you to check ip access to mountpoint.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param requestBody4  (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosPlayersIpAccessPost(RequestBody4 requestBody4) throws RestClientException {
        return call1radiosPlayersIpAccessPostWithHttpInfo(requestBody4).getBody();
    }

    /**
     * Check ip access to mountpoint
     * This endpoint allows you to check ip access to mountpoint.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param requestBody4  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1radiosPlayersIpAccessPostWithHttpInfo(RequestBody4 requestBody4) throws RestClientException {
        Object localVarPostBody = requestBody4;
        

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

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response>() {};
        return apiClient.invokeAPI("/1/radios/players/ip-access", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get player config
     * This endpoint allows you to get the player config.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param playerUuid The universally unique identifier (UUID) of the player to request. (required)
     * @return Model1RadiosPlayersPlayerUuidConfigPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosPlayersPlayerUuidConfigPost200Response call1radiosPlayersPlayerUuidConfigPost(String playerUuid) throws RestClientException {
        return call1radiosPlayersPlayerUuidConfigPostWithHttpInfo(playerUuid).getBody();
    }

    /**
     * Get player config
     * This endpoint allows you to get the player config.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param playerUuid The universally unique identifier (UUID) of the player to request. (required)
     * @return ResponseEntity&lt;Model1RadiosPlayersPlayerUuidConfigPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosPlayersPlayerUuidConfigPost200Response> call1radiosPlayersPlayerUuidConfigPostWithHttpInfo(String playerUuid) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'playerUuid' is set
        if (playerUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'playerUuid' when calling call1radiosPlayersPlayerUuidConfigPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("player_uuid", playerUuid);

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

        ParameterizedTypeReference<Model1RadiosPlayersPlayerUuidConfigPost200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosPlayersPlayerUuidConfigPost200Response>() {};
        return apiClient.invokeAPI("/1/radios/players/{player_uuid}/config", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Check domain access for player
     * This endpoint allows you to check domain access for player.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param playerUuid The universally unique identifier (UUID) of the player to request. (required)
     * @param requestBody5  (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosPlayersPlayerUuidDomainAccessPost(String playerUuid, RequestBody5 requestBody5) throws RestClientException {
        return call1radiosPlayersPlayerUuidDomainAccessPostWithHttpInfo(playerUuid, requestBody5).getBody();
    }

    /**
     * Check domain access for player
     * This endpoint allows you to check domain access for player.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param playerUuid The universally unique identifier (UUID) of the player to request. (required)
     * @param requestBody5  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1radiosPlayersPlayerUuidDomainAccessPostWithHttpInfo(String playerUuid, RequestBody5 requestBody5) throws RestClientException {
        Object localVarPostBody = requestBody5;
        
        // verify the required parameter 'playerUuid' is set
        if (playerUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'playerUuid' when calling call1radiosPlayersPlayerUuidDomainAccessPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("player_uuid", playerUuid);

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

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response>() {};
        return apiClient.invokeAPI("/1/radios/players/{player_uuid}/domain-access", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List product players
     * This endpoint allows you to retrieve all the players in a product.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @param _return *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  (optional)
     * @param limit *Optional parameter* that define the number of items to return&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  (optional)
     * @param skip *Optional parameter* that define the index of the first item to return (0 &#x3D; first item)&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  (optional)
     * @param page *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param perPage *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param orderBy *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @param order *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional, default to asc)
     * @param orderFor *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @return Model1RadiosRadioProductIdPlayersGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdPlayersGet200Response call1radiosRadioProductIdPlayersGet(Integer radioProductId, String with, String _return, Integer limit, Integer skip, Integer page, Integer perPage, OneOfstringAnyType orderBy, String order, Object orderFor) throws RestClientException {
        return call1radiosRadioProductIdPlayersGetWithHttpInfo(radioProductId, with, _return, limit, skip, page, perPage, orderBy, order, orderFor).getBody();
    }

    /**
     * List product players
     * This endpoint allows you to retrieve all the players in a product.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @param _return *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  (optional)
     * @param limit *Optional parameter* that define the number of items to return&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  (optional)
     * @param skip *Optional parameter* that define the index of the first item to return (0 &#x3D; first item)&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  (optional)
     * @param page *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param perPage *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param orderBy *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @param order *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional, default to asc)
     * @param orderFor *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdPlayersGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdPlayersGet200Response> call1radiosRadioProductIdPlayersGetWithHttpInfo(Integer radioProductId, String with, String _return, Integer limit, Integer skip, Integer page, Integer perPage, OneOfstringAnyType orderBy, String order, Object orderFor) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdPlayersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
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

        ParameterizedTypeReference<Model1RadiosRadioProductIdPlayersGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdPlayersGet200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/players", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete player
     * This endpoint allows you to delete a player.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param playerId The unique identifier (ID) of the player to request. (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdPlayersPlayerIdDelete(Integer radioProductId, Integer playerId) throws RestClientException {
        return call1radiosRadioProductIdPlayersPlayerIdDeleteWithHttpInfo(radioProductId, playerId).getBody();
    }

    /**
     * Delete player
     * This endpoint allows you to delete a player.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param playerId The unique identifier (ID) of the player to request. (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1radiosRadioProductIdPlayersPlayerIdDeleteWithHttpInfo(Integer radioProductId, Integer playerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdPlayersPlayerIdDelete");
        }
        
        // verify the required parameter 'playerId' is set
        if (playerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'playerId' when calling call1radiosRadioProductIdPlayersPlayerIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("player_id", playerId);

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

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/players/{player_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Duplicate player
     * This endpoint allows you to duplicate a player.
     * <p><b>201</b> - Created
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param playerId The unique identifier (ID) of the player to request. (required)
     * @param requestBody14  (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdPlayersPlayerIdDuplicatePost(Integer radioProductId, Integer playerId, RequestBody14 requestBody14) throws RestClientException {
        return call1radiosRadioProductIdPlayersPlayerIdDuplicatePostWithHttpInfo(radioProductId, playerId, requestBody14).getBody();
    }

    /**
     * Duplicate player
     * This endpoint allows you to duplicate a player.
     * <p><b>201</b> - Created
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param playerId The unique identifier (ID) of the player to request. (required)
     * @param requestBody14  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1radiosRadioProductIdPlayersPlayerIdDuplicatePostWithHttpInfo(Integer radioProductId, Integer playerId, RequestBody14 requestBody14) throws RestClientException {
        Object localVarPostBody = requestBody14;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdPlayersPlayerIdDuplicatePost");
        }
        
        // verify the required parameter 'playerId' is set
        if (playerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'playerId' when calling call1radiosRadioProductIdPlayersPlayerIdDuplicatePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("player_id", playerId);

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
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/players/{player_id}/duplicate", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get player
     * This endpoint allows you to retrieve a player.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param playerId The unique identifier (ID) of the player to request. (required)
     * @return Model1RadiosRadioProductIdPlayersPlayerIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdPlayersPlayerIdGet200Response call1radiosRadioProductIdPlayersPlayerIdGet(Integer radioProductId, Integer playerId) throws RestClientException {
        return call1radiosRadioProductIdPlayersPlayerIdGetWithHttpInfo(radioProductId, playerId).getBody();
    }

    /**
     * Get player
     * This endpoint allows you to retrieve a player.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param playerId The unique identifier (ID) of the player to request. (required)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdPlayersPlayerIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdPlayersPlayerIdGet200Response> call1radiosRadioProductIdPlayersPlayerIdGetWithHttpInfo(Integer radioProductId, Integer playerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdPlayersPlayerIdGet");
        }
        
        // verify the required parameter 'playerId' is set
        if (playerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'playerId' when calling call1radiosRadioProductIdPlayersPlayerIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("player_id", playerId);

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

        ParameterizedTypeReference<Model1RadiosRadioProductIdPlayersPlayerIdGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdPlayersPlayerIdGet200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/players/{player_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Integrate
     * This endpoint allows you to integrate a player iframe.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param playerId The unique identifier (ID) of the player to request. (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdPlayersPlayerIdIntegrateGet(Integer radioProductId, Integer playerId) throws RestClientException {
        return call1radiosRadioProductIdPlayersPlayerIdIntegrateGetWithHttpInfo(radioProductId, playerId).getBody();
    }

    /**
     * Integrate
     * This endpoint allows you to integrate a player iframe.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param playerId The unique identifier (ID) of the player to request. (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1radiosRadioProductIdPlayersPlayerIdIntegrateGetWithHttpInfo(Integer radioProductId, Integer playerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdPlayersPlayerIdIntegrateGet");
        }
        
        // verify the required parameter 'playerId' is set
        if (playerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'playerId' when calling call1radiosRadioProductIdPlayersPlayerIdIntegrateGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("player_id", playerId);

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

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/players/{player_id}/integrate", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update player
     * This endpoint allows you to update a player.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param playerId The unique identifier (ID) of the player to request. (required)
     * @param requestBody23  (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdPlayersPlayerIdPut(Integer radioProductId, Integer playerId, RequestBody23 requestBody23) throws RestClientException {
        return call1radiosRadioProductIdPlayersPlayerIdPutWithHttpInfo(radioProductId, playerId, requestBody23).getBody();
    }

    /**
     * Update player
     * This endpoint allows you to update a player.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param playerId The unique identifier (ID) of the player to request. (required)
     * @param requestBody23  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1radiosRadioProductIdPlayersPlayerIdPutWithHttpInfo(Integer radioProductId, Integer playerId, RequestBody23 requestBody23) throws RestClientException {
        Object localVarPostBody = requestBody23;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdPlayersPlayerIdPut");
        }
        
        // verify the required parameter 'playerId' is set
        if (playerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'playerId' when calling call1radiosRadioProductIdPlayersPlayerIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("player_id", playerId);

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
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/players/{player_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Reset player
     * This endpoint allows you to reset a player.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param playerId The unique identifier (ID) of the player to request. (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdPlayersPlayerIdResetPost(Integer radioProductId, Integer playerId) throws RestClientException {
        return call1radiosRadioProductIdPlayersPlayerIdResetPostWithHttpInfo(radioProductId, playerId).getBody();
    }

    /**
     * Reset player
     * This endpoint allows you to reset a player.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param playerId The unique identifier (ID) of the player to request. (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1radiosRadioProductIdPlayersPlayerIdResetPostWithHttpInfo(Integer radioProductId, Integer playerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdPlayersPlayerIdResetPost");
        }
        
        // verify the required parameter 'playerId' is set
        if (playerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'playerId' when calling call1radiosRadioProductIdPlayersPlayerIdResetPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("player_id", playerId);

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

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/players/{player_id}/reset", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete thumbnail
     * This endpoint allows you to delete a thumbnail.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param playerId The unique identifier (ID) of the player to request. (required)
     * @param requestBody16  (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdPlayersPlayerIdThumbnailDelete(Integer radioProductId, Integer playerId, RequestBody16 requestBody16) throws RestClientException {
        return call1radiosRadioProductIdPlayersPlayerIdThumbnailDeleteWithHttpInfo(radioProductId, playerId, requestBody16).getBody();
    }

    /**
     * Delete thumbnail
     * This endpoint allows you to delete a thumbnail.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param playerId The unique identifier (ID) of the player to request. (required)
     * @param requestBody16  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1radiosRadioProductIdPlayersPlayerIdThumbnailDeleteWithHttpInfo(Integer radioProductId, Integer playerId, RequestBody16 requestBody16) throws RestClientException {
        Object localVarPostBody = requestBody16;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdPlayersPlayerIdThumbnailDelete");
        }
        
        // verify the required parameter 'playerId' is set
        if (playerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'playerId' when calling call1radiosRadioProductIdPlayersPlayerIdThumbnailDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("player_id", playerId);

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
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/players/{player_id}/thumbnail", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update thumbnail
     * This endpoint allows you to update a thumbnail.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param playerId The unique identifier (ID) of the player to request. (required)
     * @param requestBody15  (optional)
     * @return Model1RadiosRadioProductIdPlayersPlayerIdThumbnailPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdPlayersPlayerIdThumbnailPost200Response call1radiosRadioProductIdPlayersPlayerIdThumbnailPost(Integer radioProductId, Integer playerId, RequestBody15 requestBody15) throws RestClientException {
        return call1radiosRadioProductIdPlayersPlayerIdThumbnailPostWithHttpInfo(radioProductId, playerId, requestBody15).getBody();
    }

    /**
     * Update thumbnail
     * This endpoint allows you to update a thumbnail.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param playerId The unique identifier (ID) of the player to request. (required)
     * @param requestBody15  (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdPlayersPlayerIdThumbnailPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdPlayersPlayerIdThumbnailPost200Response> call1radiosRadioProductIdPlayersPlayerIdThumbnailPostWithHttpInfo(Integer radioProductId, Integer playerId, RequestBody15 requestBody15) throws RestClientException {
        Object localVarPostBody = requestBody15;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdPlayersPlayerIdThumbnailPost");
        }
        
        // verify the required parameter 'playerId' is set
        if (playerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'playerId' when calling call1radiosRadioProductIdPlayersPlayerIdThumbnailPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("player_id", playerId);

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

        ParameterizedTypeReference<Model1RadiosRadioProductIdPlayersPlayerIdThumbnailPost200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdPlayersPlayerIdThumbnailPost200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/players/{player_id}/thumbnail", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Store player
     * This endpoint allows you to store a player.
     * <p><b>201</b> - Created
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param requestBody13  (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdPlayersPost(Integer radioProductId, RequestBody13 requestBody13) throws RestClientException {
        return call1radiosRadioProductIdPlayersPostWithHttpInfo(radioProductId, requestBody13).getBody();
    }

    /**
     * Store player
     * This endpoint allows you to store a player.
     * <p><b>201</b> - Created
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param requestBody13  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1radiosRadioProductIdPlayersPostWithHttpInfo(Integer radioProductId, RequestBody13 requestBody13) throws RestClientException {
        Object localVarPostBody = requestBody13;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdPlayersPost");
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
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/players", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List station players
     * This endpoint allows you to retrieve all the players in a station.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param _return *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  (optional)
     * @param limit *Optional parameter* that define the number of items to return&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  (optional)
     * @param skip *Optional parameter* that define the index of the first item to return (0 &#x3D; first item)&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  (optional)
     * @param page *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param perPage *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param orderBy *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @param order *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional, default to asc)
     * @param orderFor *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @return Model1RadiosRadioProductIdPlayersGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdPlayersGet200Response call1radiosRadioProductIdStationsStationIdPlayersGet(Integer radioProductId, Integer stationId, String _return, Integer limit, Integer skip, Integer page, Integer perPage, OneOfstringAnyType orderBy, String order, Object orderFor) throws RestClientException {
        return call1radiosRadioProductIdStationsStationIdPlayersGetWithHttpInfo(radioProductId, stationId, _return, limit, skip, page, perPage, orderBy, order, orderFor).getBody();
    }

    /**
     * List station players
     * This endpoint allows you to retrieve all the players in a station.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param _return *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  (optional)
     * @param limit *Optional parameter* that define the number of items to return&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  (optional)
     * @param skip *Optional parameter* that define the index of the first item to return (0 &#x3D; first item)&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  (optional)
     * @param page *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param perPage *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param orderBy *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @param order *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional, default to asc)
     * @param orderFor *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdPlayersGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdPlayersGet200Response> call1radiosRadioProductIdStationsStationIdPlayersGetWithHttpInfo(Integer radioProductId, Integer stationId, String _return, Integer limit, Integer skip, Integer page, Integer perPage, OneOfstringAnyType orderBy, String order, Object orderFor) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdStationsStationIdPlayersGet");
        }
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling call1radiosRadioProductIdStationsStationIdPlayersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("station_id", stationId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<Model1RadiosRadioProductIdPlayersGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdPlayersGet200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/stations/{station_id}/players", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Lists all players
     * This endpoint allows you to retrieve all players.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
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
     * @return Model1RadiosRadioProductIdPlayersGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdPlayersGet200Response call1videosChannelPlayersGet(Integer channel, Integer accountId, String with, String _return, Integer limit, Integer skip, Integer page, Integer perPage, OneOfstringAnyType orderBy, String order, Object orderFor) throws RestClientException {
        return call1videosChannelPlayersGetWithHttpInfo(channel, accountId, with, _return, limit, skip, page, perPage, orderBy, order, orderFor).getBody();
    }

    /**
     * Lists all players
     * This endpoint allows you to retrieve all players.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
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
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdPlayersGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdPlayersGet200Response> call1videosChannelPlayersGetWithHttpInfo(Integer channel, Integer accountId, String with, String _return, Integer limit, Integer skip, Integer page, Integer perPage, OneOfstringAnyType orderBy, String order, Object orderFor) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelPlayersGet");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling call1videosChannelPlayersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

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

        ParameterizedTypeReference<Model1RadiosRadioProductIdPlayersGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdPlayersGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/players", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a player
     * This endpoint allows you to delete a player.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param player The unique identifier (ID) of the player to request. (required)
     * @param accountId The account identifier (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1videosChannelPlayersPlayerDelete(Integer channel, Integer player, Integer accountId, String with) throws RestClientException {
        return call1videosChannelPlayersPlayerDeleteWithHttpInfo(channel, player, accountId, with).getBody();
    }

    /**
     * Delete a player
     * This endpoint allows you to delete a player.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param player The unique identifier (ID) of the player to request. (required)
     * @param accountId The account identifier (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1videosChannelPlayersPlayerDeleteWithHttpInfo(Integer channel, Integer player, Integer accountId, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelPlayersPlayerDelete");
        }
        
        // verify the required parameter 'player' is set
        if (player == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'player' when calling call1videosChannelPlayersPlayerDelete");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling call1videosChannelPlayersPlayerDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("player", player);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "account_id", accountId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/players/{player}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Return a player
     * This endpoint allows you to retrieve a player.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param player The unique identifier (ID) of the player to request. (required)
     * @param accountId The account identifier (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1RadiosRadioProductIdPlayersPlayerIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdPlayersPlayerIdGet200Response call1videosChannelPlayersPlayerGet(Integer channel, Integer player, Integer accountId, String with) throws RestClientException {
        return call1videosChannelPlayersPlayerGetWithHttpInfo(channel, player, accountId, with).getBody();
    }

    /**
     * Return a player
     * This endpoint allows you to retrieve a player.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param player The unique identifier (ID) of the player to request. (required)
     * @param accountId The account identifier (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdPlayersPlayerIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdPlayersPlayerIdGet200Response> call1videosChannelPlayersPlayerGetWithHttpInfo(Integer channel, Integer player, Integer accountId, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelPlayersPlayerGet");
        }
        
        // verify the required parameter 'player' is set
        if (player == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'player' when calling call1videosChannelPlayersPlayerGet");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling call1videosChannelPlayersPlayerGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("player", player);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "account_id", accountId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1RadiosRadioProductIdPlayersPlayerIdGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdPlayersPlayerIdGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/players/{player}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Copy a player
     * This endpoint allows you to copy a player.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param player The unique identifier (ID) of the player to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1RadiosRadioProductIdPlayersPlayerIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdPlayersPlayerIdGet200Response call1videosChannelPlayersPlayerPost(Integer channel, Integer player, String with) throws RestClientException {
        return call1videosChannelPlayersPlayerPostWithHttpInfo(channel, player, with).getBody();
    }

    /**
     * Copy a player
     * This endpoint allows you to copy a player.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param player The unique identifier (ID) of the player to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdPlayersPlayerIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdPlayersPlayerIdGet200Response> call1videosChannelPlayersPlayerPostWithHttpInfo(Integer channel, Integer player, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelPlayersPlayerPost");
        }
        
        // verify the required parameter 'player' is set
        if (player == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'player' when calling call1videosChannelPlayersPlayerPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("player", player);

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

        ParameterizedTypeReference<Model1RadiosRadioProductIdPlayersPlayerIdGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdPlayersPlayerIdGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/players/{player}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a player
     * This endpoint allows you to update a player.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param player The unique identifier (ID) of the player to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1RadiosRadioProductIdPlayersPlayerIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdPlayersPlayerIdGet200Response call1videosChannelPlayersPlayerPut(Integer channel, Integer player, String with) throws RestClientException {
        return call1videosChannelPlayersPlayerPutWithHttpInfo(channel, player, with).getBody();
    }

    /**
     * Update a player
     * This endpoint allows you to update a player.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param player The unique identifier (ID) of the player to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdPlayersPlayerIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdPlayersPlayerIdGet200Response> call1videosChannelPlayersPlayerPutWithHttpInfo(Integer channel, Integer player, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelPlayersPlayerPut");
        }
        
        // verify the required parameter 'player' is set
        if (player == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'player' when calling call1videosChannelPlayersPlayerPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("player", player);

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

        ParameterizedTypeReference<Model1RadiosRadioProductIdPlayersPlayerIdGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdPlayersPlayerIdGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/players/{player}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a player
     * This endpoint allows you to create a new player.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1RadiosRadioProductIdPlayersPlayerIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdPlayersPlayerIdGet200Response call1videosChannelPlayersPost(Integer channel, String with) throws RestClientException {
        return call1videosChannelPlayersPostWithHttpInfo(channel, with).getBody();
    }

    /**
     * Create a player
     * This endpoint allows you to create a new player.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdPlayersPlayerIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdPlayersPlayerIdGet200Response> call1videosChannelPlayersPostWithHttpInfo(Integer channel, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelPlayersPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

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

        ParameterizedTypeReference<Model1RadiosRadioProductIdPlayersPlayerIdGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdPlayersPlayerIdGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/players", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
