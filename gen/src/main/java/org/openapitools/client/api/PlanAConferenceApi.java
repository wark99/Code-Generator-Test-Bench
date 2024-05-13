package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1KmeetRoomsPost200Response;
import org.openapitools.client.model.PlannedConference;

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
public class PlanAConferenceApi {
    private ApiClient apiClient;

    public PlanAConferenceApi() {
        this(new ApiClient());
    }

    public PlanAConferenceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Plan a conference
     * This endpoint allows you to plan a conference with predefined settings. It will add an event on your Infomaniak Calendar with the meeting url.  If you just want to create a room you don&#39;t need any API calls, you can build a conference URL by adding an unique identifier to your kMeet instance url (eg: kmeet.infomaniak.com/${MY_VERY_SECRET_CONFERENCE_ID})
     * <p><b>200</b> - Default Response
     * <p><b>422</b> - Unprocessable Entity
     * @param plannedConference  (optional)
     * @return Model1KmeetRoomsPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1KmeetRoomsPost200Response call1kmeetRoomsPost(PlannedConference plannedConference) throws RestClientException {
        return call1kmeetRoomsPostWithHttpInfo(plannedConference).getBody();
    }

    /**
     * Plan a conference
     * This endpoint allows you to plan a conference with predefined settings. It will add an event on your Infomaniak Calendar with the meeting url.  If you just want to create a room you don&#39;t need any API calls, you can build a conference URL by adding an unique identifier to your kMeet instance url (eg: kmeet.infomaniak.com/${MY_VERY_SECRET_CONFERENCE_ID})
     * <p><b>200</b> - Default Response
     * <p><b>422</b> - Unprocessable Entity
     * @param plannedConference  (optional)
     * @return ResponseEntity&lt;Model1KmeetRoomsPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1KmeetRoomsPost200Response> call1kmeetRoomsPostWithHttpInfo(PlannedConference plannedConference) throws RestClientException {
        Object localVarPostBody = plannedConference;
        

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

        ParameterizedTypeReference<Model1KmeetRoomsPost200Response> localReturnType = new ParameterizedTypeReference<Model1KmeetRoomsPost200Response>() {};
        return apiClient.invokeAPI("/1/kmeet/rooms", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
