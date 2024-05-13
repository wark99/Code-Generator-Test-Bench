package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model2EventsEventIdGet200Response;
import org.openapitools.client.model.Model2EventsGet200Response;

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
public class EventsApi {
    private ApiClient apiClient;

    public EventsApi() {
        this(new ApiClient());
    }

    public EventsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Display an event
     * Returns a variety of information about a single Event specified by the requested unique identifier.
     * <p><b>200</b> - OK
     * @param eventId The unique identifier (ID) of the event to request. (required)
     * @return Model2EventsEventIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model2EventsEventIdGet200Response call2eventsEventIdGet(Integer eventId) throws RestClientException {
        return call2eventsEventIdGetWithHttpInfo(eventId).getBody();
    }

    /**
     * Display an event
     * Returns a variety of information about a single Event specified by the requested unique identifier.
     * <p><b>200</b> - OK
     * @param eventId The unique identifier (ID) of the event to request. (required)
     * @return ResponseEntity&lt;Model2EventsEventIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model2EventsEventIdGet200Response> call2eventsEventIdGetWithHttpInfo(Integer eventId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventId' when calling call2eventsEventIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("event_id", eventId);

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

        ParameterizedTypeReference<Model2EventsEventIdGet200Response> localReturnType = new ParameterizedTypeReference<Model2EventsEventIdGet200Response>() {};
        return apiClient.invokeAPI("/2/events/{event_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List events
     * This endpoint allows you to retrieve all the opened events.
     * <p><b>200</b> - OK
     * @param eventType  (optional)
     * @param locale  (optional)
     * @param showAuto  (optional)
     * @param status  (optional)
     * @param withTrashed  (optional)
     * @return Model2EventsGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model2EventsGet200Response call2eventsGet(String eventType, String locale, Boolean showAuto, String status, Boolean withTrashed) throws RestClientException {
        return call2eventsGetWithHttpInfo(eventType, locale, showAuto, status, withTrashed).getBody();
    }

    /**
     * List events
     * This endpoint allows you to retrieve all the opened events.
     * <p><b>200</b> - OK
     * @param eventType  (optional)
     * @param locale  (optional)
     * @param showAuto  (optional)
     * @param status  (optional)
     * @param withTrashed  (optional)
     * @return ResponseEntity&lt;Model2EventsGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model2EventsGet200Response> call2eventsGetWithHttpInfo(String eventType, String locale, Boolean showAuto, String status, Boolean withTrashed) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "event_type", eventType));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "locale", locale));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "show_auto", showAuto));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_trashed", withTrashed));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model2EventsGet200Response> localReturnType = new ParameterizedTypeReference<Model2EventsGet200Response>() {};
        return apiClient.invokeAPI("/2/events", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
