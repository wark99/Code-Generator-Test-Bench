package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CreateMeasurementEventRequest;
import org.openapitools.client.model.MeasurementEvent;
import org.openapitools.client.model.MeasurementEventType;
import java.time.OffsetDateTime;
import java.util.UUID;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:30.476705269Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MeasurementEventsApi {
    private ApiClient apiClient;

    public MeasurementEventsApi() {
        this(new ApiClient());
    }

    public MeasurementEventsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Query measurement events
     * 
     * <p><b>200</b> - Measurement events (if any)
     * @param since Include events that occurred or were modified after the specified date/time (inclusive). (optional)
     * @param until Include events that occurred or were modified before the specified date/time (inclusive). (optional)
     * @param types Filter by event type(s). (optional)
     * @param offset The number of events to skip. (optional)
     * @param limit The maximum number of events to return. (optional)
     * @return List&lt;MeasurementEvent&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MeasurementEvent> measurementEventsGet(OffsetDateTime since, OffsetDateTime until, List<MeasurementEventType> types, Integer offset, Integer limit) throws RestClientException {
        return measurementEventsGetWithHttpInfo(since, until, types, offset, limit).getBody();
    }

    /**
     * Query measurement events
     * 
     * <p><b>200</b> - Measurement events (if any)
     * @param since Include events that occurred or were modified after the specified date/time (inclusive). (optional)
     * @param until Include events that occurred or were modified before the specified date/time (inclusive). (optional)
     * @param types Filter by event type(s). (optional)
     * @param offset The number of events to skip. (optional)
     * @param limit The maximum number of events to return. (optional)
     * @return ResponseEntity&lt;List&lt;MeasurementEvent&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<MeasurementEvent>> measurementEventsGetWithHttpInfo(OffsetDateTime since, OffsetDateTime until, List<MeasurementEventType> types, Integer offset, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "since", since));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "until", until));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "types", types));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<MeasurementEvent>> localReturnType = new ParameterizedTypeReference<List<MeasurementEvent>>() {};
        return apiClient.invokeAPI("/measurement-events", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a single measurement event
     * 
     * <p><b>200</b> - Measurement event
     * @param id ID of the measurement event. (required)
     * @return MeasurementEvent
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MeasurementEvent measurementEventsIdGet(UUID id) throws RestClientException {
        return measurementEventsIdGetWithHttpInfo(id).getBody();
    }

    /**
     * Get a single measurement event
     * 
     * <p><b>200</b> - Measurement event
     * @param id ID of the measurement event. (required)
     * @return ResponseEntity&lt;MeasurementEvent&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MeasurementEvent> measurementEventsIdGetWithHttpInfo(UUID id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling measurementEventsIdGet");
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

        ParameterizedTypeReference<MeasurementEvent> localReturnType = new ParameterizedTypeReference<MeasurementEvent>() {};
        return apiClient.invokeAPI("/measurement-events/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a measurement event (for non-production testing only)
     * 
     * <p><b>201</b> - Measurement event created
     * @param createMeasurementEventRequest  (required)
     * @return MeasurementEvent
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MeasurementEvent measurementEventsPost(CreateMeasurementEventRequest createMeasurementEventRequest) throws RestClientException {
        return measurementEventsPostWithHttpInfo(createMeasurementEventRequest).getBody();
    }

    /**
     * Create a measurement event (for non-production testing only)
     * 
     * <p><b>201</b> - Measurement event created
     * @param createMeasurementEventRequest  (required)
     * @return ResponseEntity&lt;MeasurementEvent&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MeasurementEvent> measurementEventsPostWithHttpInfo(CreateMeasurementEventRequest createMeasurementEventRequest) throws RestClientException {
        Object localVarPostBody = createMeasurementEventRequest;
        
        // verify the required parameter 'createMeasurementEventRequest' is set
        if (createMeasurementEventRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createMeasurementEventRequest' when calling measurementEventsPost");
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

        ParameterizedTypeReference<MeasurementEvent> localReturnType = new ParameterizedTypeReference<MeasurementEvent>() {};
        return apiClient.invokeAPI("/measurement-events", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
