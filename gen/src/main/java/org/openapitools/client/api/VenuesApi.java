package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GetVenue200Response;
import org.openapitools.client.model.GetVenues200Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:35.686627593Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class VenuesApi {
    private ApiClient apiClient;

    public VenuesApi() {
        this(new ApiClient());
    }

    public VenuesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a venue
     * Retrieve the venue.
     * <p><b>200</b> - Returns a Venue object.
     * <p><b>404</b> - Venue not found.
     * @param venueId  (required)
     * @return GetVenue200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetVenue200Response getVenue(String venueId) throws RestClientException {
        return getVenueWithHttpInfo(venueId).getBody();
    }

    /**
     * Get a venue
     * Retrieve the venue.
     * <p><b>200</b> - Returns a Venue object.
     * <p><b>404</b> - Venue not found.
     * @param venueId  (required)
     * @return ResponseEntity&lt;GetVenue200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetVenue200Response> getVenueWithHttpInfo(String venueId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'venueId' is set
        if (venueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'venueId' when calling getVenue");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("venueId", venueId);

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

        ParameterizedTypeReference<GetVenue200Response> localReturnType = new ParameterizedTypeReference<GetVenue200Response>() {};
        return apiClient.invokeAPI("/venues/{venueId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List venues
     * Retrieve a list of venues.
     * <p><b>200</b> - Returns a list of Venue objects.
     * @return GetVenues200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetVenues200Response getVenues() throws RestClientException {
        return getVenuesWithHttpInfo().getBody();
    }

    /**
     * List venues
     * Retrieve a list of venues.
     * <p><b>200</b> - Returns a list of Venue objects.
     * @return ResponseEntity&lt;GetVenues200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetVenues200Response> getVenuesWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<GetVenues200Response> localReturnType = new ParameterizedTypeReference<GetVenues200Response>() {};
        return apiClient.invokeAPI("/venues", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
