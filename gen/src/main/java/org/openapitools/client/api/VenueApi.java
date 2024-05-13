package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BranchVenues;
import java.util.UUID;
import org.openapitools.client.model.VenueDetails;
import org.openapitools.client.model.VenueMeets;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:40.667796194Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class VenueApi {
    private ApiClient apiClient;

    public VenueApi() {
        this(new ApiClient());
    }

    public VenueApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Show Venues for a Branch
     * <p><b>200</b> - Show Venues for a Branch
     * @param branchId ID of the Branch (required)
     * @return BranchVenues
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BranchVenues showBranchVenues(UUID branchId) throws RestClientException {
        return showBranchVenuesWithHttpInfo(branchId).getBody();
    }

    /**
     * 
     * Show Venues for a Branch
     * <p><b>200</b> - Show Venues for a Branch
     * @param branchId ID of the Branch (required)
     * @return ResponseEntity&lt;BranchVenues&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BranchVenues> showBranchVenuesWithHttpInfo(UUID branchId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'branchId' is set
        if (branchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'branchId' when calling showBranchVenues");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("branchId", branchId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/hal+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<BranchVenues> localReturnType = new ParameterizedTypeReference<BranchVenues>() {};
        return apiClient.invokeAPI("/branch/{branchId}/venues", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Show a Venue
     * <p><b>200</b> - show venue details
     * @param venueId ID of the venue (required)
     * @return VenueDetails
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VenueDetails showVenueDetails(UUID venueId) throws RestClientException {
        return showVenueDetailsWithHttpInfo(venueId).getBody();
    }

    /**
     * 
     * Show a Venue
     * <p><b>200</b> - show venue details
     * @param venueId ID of the venue (required)
     * @return ResponseEntity&lt;VenueDetails&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VenueDetails> showVenueDetailsWithHttpInfo(UUID venueId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'venueId' is set
        if (venueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'venueId' when calling showVenueDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("venueId", venueId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/hal+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<VenueDetails> localReturnType = new ParameterizedTypeReference<VenueDetails>() {};
        return apiClient.invokeAPI("/venue/{venueId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Show Meets at a Venue
     * <p><b>200</b> - show venue meets
     * @param venueId ID of the venue (required)
     * @return VenueMeets
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VenueMeets showVenueMeets(UUID venueId) throws RestClientException {
        return showVenueMeetsWithHttpInfo(venueId).getBody();
    }

    /**
     * 
     * Show Meets at a Venue
     * <p><b>200</b> - show venue meets
     * @param venueId ID of the venue (required)
     * @return ResponseEntity&lt;VenueMeets&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VenueMeets> showVenueMeetsWithHttpInfo(UUID venueId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'venueId' is set
        if (venueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'venueId' when calling showVenueMeets");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("venueId", venueId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/hal+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<VenueMeets> localReturnType = new ParameterizedTypeReference<VenueMeets>() {};
        return apiClient.invokeAPI("/venue/{venueId}/meets", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Show Tables at a Venue
     * <p><b>200</b> - show venue tables
     * @param venueId ID of the venue (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object showVenueTables(UUID venueId) throws RestClientException {
        return showVenueTablesWithHttpInfo(venueId).getBody();
    }

    /**
     * 
     * Show Tables at a Venue
     * <p><b>200</b> - show venue tables
     * @param venueId ID of the venue (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> showVenueTablesWithHttpInfo(UUID venueId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'venueId' is set
        if (venueId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'venueId' when calling showVenueTables");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("venueId", venueId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/hal+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/venue/{venueId}/tables", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
