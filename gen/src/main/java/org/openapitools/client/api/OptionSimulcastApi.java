package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut400Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut500Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response;
import org.openapitools.client.model.Model1VideosChannelOptionsSimulcastGet200Response;
import org.openapitools.client.model.Model1VideosChannelOptionsSimulcastVideoSimulcastConfigGet200Response;
import org.openapitools.client.model.OneOfstringAnyType;

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
public class OptionSimulcastApi {
    private ApiClient apiClient;

    public OptionSimulcastApi() {
        this(new ApiClient());
    }

    public OptionSimulcastApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Lists all simulcast config
     * This endpoint allows you to retrieve to get the simulcast.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param accountId The account identifier (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @param _return *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  (optional)
     * @param page *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param perPage *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param orderBy *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @param order *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional, default to asc)
     * @param orderFor *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @return Model1VideosChannelOptionsSimulcastGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelOptionsSimulcastGet200Response call1videosChannelOptionsSimulcastGet(Integer channel, Integer accountId, String with, String _return, Integer page, Integer perPage, OneOfstringAnyType orderBy, String order, Object orderFor) throws RestClientException {
        return call1videosChannelOptionsSimulcastGetWithHttpInfo(channel, accountId, with, _return, page, perPage, orderBy, order, orderFor).getBody();
    }

    /**
     * Lists all simulcast config
     * This endpoint allows you to retrieve to get the simulcast.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param accountId The account identifier (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @param _return *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  (optional)
     * @param page *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param perPage *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param orderBy *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @param order *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional, default to asc)
     * @param orderFor *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @return ResponseEntity&lt;Model1VideosChannelOptionsSimulcastGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelOptionsSimulcastGet200Response> call1videosChannelOptionsSimulcastGetWithHttpInfo(Integer channel, Integer accountId, String with, String _return, Integer page, Integer perPage, OneOfstringAnyType orderBy, String order, Object orderFor) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsSimulcastGet");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling call1videosChannelOptionsSimulcastGet");
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

        ParameterizedTypeReference<Model1VideosChannelOptionsSimulcastGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelOptionsSimulcastGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options/simulcast", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a player
     * This endpoint allows you to retrieve to delete the player.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param videoSimulcastConfig  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1videosChannelOptionsSimulcastVideoSimulcastConfigDelete(Integer channel, String videoSimulcastConfig, String with) throws RestClientException {
        return call1videosChannelOptionsSimulcastVideoSimulcastConfigDeleteWithHttpInfo(channel, videoSimulcastConfig, with).getBody();
    }

    /**
     * Delete a player
     * This endpoint allows you to retrieve to delete the player.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param videoSimulcastConfig  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1videosChannelOptionsSimulcastVideoSimulcastConfigDeleteWithHttpInfo(Integer channel, String videoSimulcastConfig, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsSimulcastVideoSimulcastConfigDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("video_simulcast_config", videoSimulcastConfig);

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

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options/simulcast/{video_simulcast_config}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Disable simulcast
     * This endpoint allows you to retrieve to disable the simulcast.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param videoSimulcastConfig  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1videosChannelOptionsSimulcastVideoSimulcastConfigDisablePut(Integer channel, String videoSimulcastConfig, String with) throws RestClientException {
        return call1videosChannelOptionsSimulcastVideoSimulcastConfigDisablePutWithHttpInfo(channel, videoSimulcastConfig, with).getBody();
    }

    /**
     * Disable simulcast
     * This endpoint allows you to retrieve to disable the simulcast.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param videoSimulcastConfig  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> call1videosChannelOptionsSimulcastVideoSimulcastConfigDisablePutWithHttpInfo(Integer channel, String videoSimulcastConfig, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsSimulcastVideoSimulcastConfigDisablePut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("video_simulcast_config", videoSimulcastConfig);

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

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options/simulcast/{video_simulcast_config}/disable", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Disable simulcast
     * This endpoint allows you to retrieve to enable the simulcast.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param videoSimulcastConfig  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1videosChannelOptionsSimulcastVideoSimulcastConfigEnablePut(Integer channel, String videoSimulcastConfig, String with) throws RestClientException {
        return call1videosChannelOptionsSimulcastVideoSimulcastConfigEnablePutWithHttpInfo(channel, videoSimulcastConfig, with).getBody();
    }

    /**
     * Disable simulcast
     * This endpoint allows you to retrieve to enable the simulcast.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param videoSimulcastConfig  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> call1videosChannelOptionsSimulcastVideoSimulcastConfigEnablePutWithHttpInfo(Integer channel, String videoSimulcastConfig, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsSimulcastVideoSimulcastConfigEnablePut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("video_simulcast_config", videoSimulcastConfig);

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

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options/simulcast/{video_simulcast_config}/enable", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Return simulcast
     * This endpoint allows you to retrieve to get the simulcast.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param accountId The account identifier (required)
     * @param videoSimulcastConfig  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1VideosChannelOptionsSimulcastVideoSimulcastConfigGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelOptionsSimulcastVideoSimulcastConfigGet200Response call1videosChannelOptionsSimulcastVideoSimulcastConfigGet(Integer channel, Integer accountId, String videoSimulcastConfig, String with) throws RestClientException {
        return call1videosChannelOptionsSimulcastVideoSimulcastConfigGetWithHttpInfo(channel, accountId, videoSimulcastConfig, with).getBody();
    }

    /**
     * Return simulcast
     * This endpoint allows you to retrieve to get the simulcast.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param accountId The account identifier (required)
     * @param videoSimulcastConfig  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1VideosChannelOptionsSimulcastVideoSimulcastConfigGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelOptionsSimulcastVideoSimulcastConfigGet200Response> call1videosChannelOptionsSimulcastVideoSimulcastConfigGetWithHttpInfo(Integer channel, Integer accountId, String videoSimulcastConfig, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsSimulcastVideoSimulcastConfigGet");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling call1videosChannelOptionsSimulcastVideoSimulcastConfigGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("video_simulcast_config", videoSimulcastConfig);

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

        ParameterizedTypeReference<Model1VideosChannelOptionsSimulcastVideoSimulcastConfigGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelOptionsSimulcastVideoSimulcastConfigGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options/simulcast/{video_simulcast_config}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
