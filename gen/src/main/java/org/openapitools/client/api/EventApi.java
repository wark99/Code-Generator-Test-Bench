package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response;
import org.openapitools.client.model.Model1VideosChannelEventsGet200Response;
import org.openapitools.client.model.Model1VideosChannelEventsPost201Response;
import org.openapitools.client.model.OneOfstringAnyType;
import org.openapitools.client.model.RequestBody66;

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
public class EventApi {
    private ApiClient apiClient;

    public EventApi() {
        this(new ApiClient());
    }

    public EventApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List all events
     * This endpoint allows you to retrieve all Event.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @param _return *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  (optional)
     * @param page *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param perPage *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param orderBy *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @param order *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional, default to asc)
     * @param orderFor *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @return Model1VideosChannelEventsGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelEventsGet200Response call1videosChannelEventsGet(Integer channel, String with, String _return, Integer page, Integer perPage, OneOfstringAnyType orderBy, String order, Object orderFor) throws RestClientException {
        return call1videosChannelEventsGetWithHttpInfo(channel, with, _return, page, perPage, orderBy, order, orderFor).getBody();
    }

    /**
     * List all events
     * This endpoint allows you to retrieve all Event.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @param _return *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  (optional)
     * @param page *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param perPage *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param orderBy *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @param order *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional, default to asc)
     * @param orderFor *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @return ResponseEntity&lt;Model1VideosChannelEventsGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelEventsGet200Response> call1videosChannelEventsGetWithHttpInfo(Integer channel, String with, String _return, Integer page, Integer perPage, OneOfstringAnyType orderBy, String order, Object orderFor) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelEventsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
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

        ParameterizedTypeReference<Model1VideosChannelEventsGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelEventsGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/events", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create an event
     * This endpoint allows you to create an Event.
     * <p><b>201</b> - Created
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param accountId The account identifier (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @param requestBody66  (optional)
     * @return Model1VideosChannelEventsPost201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelEventsPost201Response call1videosChannelEventsPost(Integer channel, Integer accountId, String with, RequestBody66 requestBody66) throws RestClientException {
        return call1videosChannelEventsPostWithHttpInfo(channel, accountId, with, requestBody66).getBody();
    }

    /**
     * Create an event
     * This endpoint allows you to create an Event.
     * <p><b>201</b> - Created
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param accountId The account identifier (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @param requestBody66  (optional)
     * @return ResponseEntity&lt;Model1VideosChannelEventsPost201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelEventsPost201Response> call1videosChannelEventsPostWithHttpInfo(Integer channel, Integer accountId, String with, RequestBody66 requestBody66) throws RestClientException {
        Object localVarPostBody = requestBody66;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelEventsPost");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling call1videosChannelEventsPost");
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
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1VideosChannelEventsPost201Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelEventsPost201Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/events", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete an event
     * This endpoint allows you to delete an Event.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param repeatablePlannedEvent The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1videosChannelEventsRepeatablePlannedEventDelete(Integer channel, Integer repeatablePlannedEvent, String with) throws RestClientException {
        return call1videosChannelEventsRepeatablePlannedEventDeleteWithHttpInfo(channel, repeatablePlannedEvent, with).getBody();
    }

    /**
     * Delete an event
     * This endpoint allows you to delete an Event.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param repeatablePlannedEvent The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1videosChannelEventsRepeatablePlannedEventDeleteWithHttpInfo(Integer channel, Integer repeatablePlannedEvent, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelEventsRepeatablePlannedEventDelete");
        }
        
        // verify the required parameter 'repeatablePlannedEvent' is set
        if (repeatablePlannedEvent == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repeatablePlannedEvent' when calling call1videosChannelEventsRepeatablePlannedEventDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("repeatable_planned_event", repeatablePlannedEvent);

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
        return apiClient.invokeAPI("/1/videos/{channel}/events/{repeatable_planned_event}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Return an event
     * This endpoint allows you to retrieve an Event.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param repeatablePlannedEvent The unique identifier (ID) of the event to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1VideosChannelEventsPost201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelEventsPost201Response call1videosChannelEventsRepeatablePlannedEventGet(Integer channel, Integer repeatablePlannedEvent, String with) throws RestClientException {
        return call1videosChannelEventsRepeatablePlannedEventGetWithHttpInfo(channel, repeatablePlannedEvent, with).getBody();
    }

    /**
     * Return an event
     * This endpoint allows you to retrieve an Event.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param repeatablePlannedEvent The unique identifier (ID) of the event to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1VideosChannelEventsPost201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelEventsPost201Response> call1videosChannelEventsRepeatablePlannedEventGetWithHttpInfo(Integer channel, Integer repeatablePlannedEvent, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelEventsRepeatablePlannedEventGet");
        }
        
        // verify the required parameter 'repeatablePlannedEvent' is set
        if (repeatablePlannedEvent == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repeatablePlannedEvent' when calling call1videosChannelEventsRepeatablePlannedEventGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("repeatable_planned_event", repeatablePlannedEvent);

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

        ParameterizedTypeReference<Model1VideosChannelEventsPost201Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelEventsPost201Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/events/{repeatable_planned_event}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update an event
     * This endpoint allows you to update an Event.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param repeatablePlannedEvent The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1VideosChannelEventsPost201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelEventsPost201Response call1videosChannelEventsRepeatablePlannedEventPut(Integer channel, Integer repeatablePlannedEvent, String with) throws RestClientException {
        return call1videosChannelEventsRepeatablePlannedEventPutWithHttpInfo(channel, repeatablePlannedEvent, with).getBody();
    }

    /**
     * Update an event
     * This endpoint allows you to update an Event.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param repeatablePlannedEvent The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1VideosChannelEventsPost201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelEventsPost201Response> call1videosChannelEventsRepeatablePlannedEventPutWithHttpInfo(Integer channel, Integer repeatablePlannedEvent, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelEventsRepeatablePlannedEventPut");
        }
        
        // verify the required parameter 'repeatablePlannedEvent' is set
        if (repeatablePlannedEvent == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'repeatablePlannedEvent' when calling call1videosChannelEventsRepeatablePlannedEventPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("repeatable_planned_event", repeatablePlannedEvent);

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

        ParameterizedTypeReference<Model1VideosChannelEventsPost201Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelEventsPost201Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/events/{repeatable_planned_event}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
