package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GetReservationDetails200Response;
import org.openapitools.client.model.GetReservations200ResponseInner;
import org.openapitools.client.model.Guest;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:57.602746427Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ReservationApi {
    private ApiClient apiClient;

    public ReservationApi() {
        this(new ApiClient());
    }

    public ReservationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a guest
     * Add a new guest to the reservation
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Downstream system unavailable
     * @param hotelId Hudini Hotel Identifier (required)
     * @param reservationId Reservation ID (required)
     * @param guest  (optional)
     * @return Guest
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Guest addReservationGuest(UUID hotelId, String reservationId, Guest guest) throws RestClientException {
        return addReservationGuestWithHttpInfo(hotelId, reservationId, guest).getBody();
    }

    /**
     * Add a guest
     * Add a new guest to the reservation
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Downstream system unavailable
     * @param hotelId Hudini Hotel Identifier (required)
     * @param reservationId Reservation ID (required)
     * @param guest  (optional)
     * @return ResponseEntity&lt;Guest&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Guest> addReservationGuestWithHttpInfo(UUID hotelId, String reservationId, Guest guest) throws RestClientException {
        Object localVarPostBody = guest;
        
        // verify the required parameter 'hotelId' is set
        if (hotelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hotelId' when calling addReservationGuest");
        }
        
        // verify the required parameter 'reservationId' is set
        if (reservationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reservationId' when calling addReservationGuest");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hotelId", hotelId);
        uriVariables.put("reservationId", reservationId);

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

        String[] localVarAuthNames = new String[] { "api_key", "hudini_auth" };

        ParameterizedTypeReference<Guest> localReturnType = new ParameterizedTypeReference<Guest>() {};
        return apiClient.invokeAPI("/{hotelId}/reservations/{reservationId}/guests", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Find Reservation Details
     * Returns details about a reservation
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Downstream system unavailable
     * @param hotelId Hudini Hotel Identifier (required)
     * @param reservationId Reservation ID (required)
     * @return GetReservationDetails200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetReservationDetails200Response getReservationDetails(UUID hotelId, String reservationId) throws RestClientException {
        return getReservationDetailsWithHttpInfo(hotelId, reservationId).getBody();
    }

    /**
     * Find Reservation Details
     * Returns details about a reservation
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Downstream system unavailable
     * @param hotelId Hudini Hotel Identifier (required)
     * @param reservationId Reservation ID (required)
     * @return ResponseEntity&lt;GetReservationDetails200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetReservationDetails200Response> getReservationDetailsWithHttpInfo(UUID hotelId, String reservationId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'hotelId' is set
        if (hotelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hotelId' when calling getReservationDetails");
        }
        
        // verify the required parameter 'reservationId' is set
        if (reservationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reservationId' when calling getReservationDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hotelId", hotelId);
        uriVariables.put("reservationId", reservationId);

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

        String[] localVarAuthNames = new String[] { "api_key", "hudini_auth" };

        ParameterizedTypeReference<GetReservationDetails200Response> localReturnType = new ParameterizedTypeReference<GetReservationDetails200Response>() {};
        return apiClient.invokeAPI("/{hotelId}/reservations/{reservationId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Find Guests Details on a reservation
     * Returns details about a guest on reservation
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Downstream system unavailable
     * @param hotelId Hudini Hotel Identifier (required)
     * @param reservationId Reservation ID (required)
     * @param guestId Guest ID (required)
     * @return Guest
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Guest getReservationGuestDetails(UUID hotelId, String reservationId, String guestId) throws RestClientException {
        return getReservationGuestDetailsWithHttpInfo(hotelId, reservationId, guestId).getBody();
    }

    /**
     * Find Guests Details on a reservation
     * Returns details about a guest on reservation
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Downstream system unavailable
     * @param hotelId Hudini Hotel Identifier (required)
     * @param reservationId Reservation ID (required)
     * @param guestId Guest ID (required)
     * @return ResponseEntity&lt;Guest&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Guest> getReservationGuestDetailsWithHttpInfo(UUID hotelId, String reservationId, String guestId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'hotelId' is set
        if (hotelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hotelId' when calling getReservationGuestDetails");
        }
        
        // verify the required parameter 'reservationId' is set
        if (reservationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reservationId' when calling getReservationGuestDetails");
        }
        
        // verify the required parameter 'guestId' is set
        if (guestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'guestId' when calling getReservationGuestDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hotelId", hotelId);
        uriVariables.put("reservationId", reservationId);
        uriVariables.put("guestId", guestId);

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

        String[] localVarAuthNames = new String[] { "api_key", "hudini_auth" };

        ParameterizedTypeReference<Guest> localReturnType = new ParameterizedTypeReference<Guest>() {};
        return apiClient.invokeAPI("/{hotelId}/reservations/{reservationId}/guests/{guestId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Find Guests on a reservation
     * Returns details about all guests on reservation
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Downstream system unavailable
     * @param hotelId Hudini Hotel Identifier (required)
     * @param reservationId Reservation ID (required)
     * @return List&lt;Guest&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Guest> getReservationGuests(UUID hotelId, String reservationId) throws RestClientException {
        return getReservationGuestsWithHttpInfo(hotelId, reservationId).getBody();
    }

    /**
     * Find Guests on a reservation
     * Returns details about all guests on reservation
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Downstream system unavailable
     * @param hotelId Hudini Hotel Identifier (required)
     * @param reservationId Reservation ID (required)
     * @return ResponseEntity&lt;List&lt;Guest&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Guest>> getReservationGuestsWithHttpInfo(UUID hotelId, String reservationId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'hotelId' is set
        if (hotelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hotelId' when calling getReservationGuests");
        }
        
        // verify the required parameter 'reservationId' is set
        if (reservationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reservationId' when calling getReservationGuests");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hotelId", hotelId);
        uriVariables.put("reservationId", reservationId);

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

        String[] localVarAuthNames = new String[] { "api_key", "hudini_auth" };

        ParameterizedTypeReference<List<Guest>> localReturnType = new ParameterizedTypeReference<List<Guest>>() {};
        return apiClient.invokeAPI("/{hotelId}/reservations/{reservationId}/guests", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Find Reservations
     * Returns a collection of reservations
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Downstream system unavailable
     * @param hotelId Hudini Hotel Identifier (required)
     * @param fromDate Start of range for check in dates (optional)
     * @param toDate End of range for check in dates (optional)
     * @param firstName First name of guest (optional)
     * @param lastName Last name of guest (optional)
     * @return List&lt;GetReservations200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GetReservations200ResponseInner> getReservations(UUID hotelId, OffsetDateTime fromDate, OffsetDateTime toDate, String firstName, String lastName) throws RestClientException {
        return getReservationsWithHttpInfo(hotelId, fromDate, toDate, firstName, lastName).getBody();
    }

    /**
     * Find Reservations
     * Returns a collection of reservations
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Downstream system unavailable
     * @param hotelId Hudini Hotel Identifier (required)
     * @param fromDate Start of range for check in dates (optional)
     * @param toDate End of range for check in dates (optional)
     * @param firstName First name of guest (optional)
     * @param lastName Last name of guest (optional)
     * @return ResponseEntity&lt;List&lt;GetReservations200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<GetReservations200ResponseInner>> getReservationsWithHttpInfo(UUID hotelId, OffsetDateTime fromDate, OffsetDateTime toDate, String firstName, String lastName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'hotelId' is set
        if (hotelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hotelId' when calling getReservations");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hotelId", hotelId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fromDate", fromDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "toDate", toDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "firstName", firstName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastName", lastName));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key", "hudini_auth" };

        ParameterizedTypeReference<List<GetReservations200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<GetReservations200ResponseInner>>() {};
        return apiClient.invokeAPI("/{hotelId}/reservations", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add a guest
     * Add a new guest to the reservation
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Downstream system unavailable
     * @param hotelId Hudini Hotel Identifier (required)
     * @param reservationId Reservation ID (required)
     * @param guestId Guest ID (required)
     * @param guest  (optional)
     * @return Guest
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Guest updateReservationGuest(UUID hotelId, String reservationId, String guestId, Guest guest) throws RestClientException {
        return updateReservationGuestWithHttpInfo(hotelId, reservationId, guestId, guest).getBody();
    }

    /**
     * Add a guest
     * Add a new guest to the reservation
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Downstream system unavailable
     * @param hotelId Hudini Hotel Identifier (required)
     * @param reservationId Reservation ID (required)
     * @param guestId Guest ID (required)
     * @param guest  (optional)
     * @return ResponseEntity&lt;Guest&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Guest> updateReservationGuestWithHttpInfo(UUID hotelId, String reservationId, String guestId, Guest guest) throws RestClientException {
        Object localVarPostBody = guest;
        
        // verify the required parameter 'hotelId' is set
        if (hotelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hotelId' when calling updateReservationGuest");
        }
        
        // verify the required parameter 'reservationId' is set
        if (reservationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reservationId' when calling updateReservationGuest");
        }
        
        // verify the required parameter 'guestId' is set
        if (guestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'guestId' when calling updateReservationGuest");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hotelId", hotelId);
        uriVariables.put("reservationId", reservationId);
        uriVariables.put("guestId", guestId);

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

        String[] localVarAuthNames = new String[] { "api_key", "hudini_auth" };

        ParameterizedTypeReference<Guest> localReturnType = new ParameterizedTypeReference<Guest>() {};
        return apiClient.invokeAPI("/{hotelId}/reservations/{reservationId}/guests/{guestId}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
