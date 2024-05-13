package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GetBookingCalculation200Response;
import org.openapitools.client.model.GetBookings200Response;
import org.openapitools.client.model.PostBooking201Response;
import org.openapitools.client.model.PostBookingRequest;
import org.openapitools.client.model.PostPayBookingRequest;

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
public class BookingsApi {
    private ApiClient apiClient;

    public BookingsApi() {
        this(new ApiClient());
    }

    public BookingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a booking
     * Retrieve the booking.
     * <p><b>200</b> - Returns the Booking object.
     * <p><b>404</b> - Booking not found.
     * @param bookingRef  (required)
     * @return PostBooking201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostBooking201Response getBooking(String bookingRef) throws RestClientException {
        return getBookingWithHttpInfo(bookingRef).getBody();
    }

    /**
     * Get a booking
     * Retrieve the booking.
     * <p><b>200</b> - Returns the Booking object.
     * <p><b>404</b> - Booking not found.
     * @param bookingRef  (required)
     * @return ResponseEntity&lt;PostBooking201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostBooking201Response> getBookingWithHttpInfo(String bookingRef) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'bookingRef' is set
        if (bookingRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bookingRef' when calling getBooking");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bookingRef", bookingRef);

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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<PostBooking201Response> localReturnType = new ParameterizedTypeReference<PostBooking201Response>() {};
        return apiClient.invokeAPI("/bookings/{bookingRef}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Calculate booking costs
     * Retrieve the Booking costs.
     * <p><b>200</b> - Returns the calculated booking costs.
     * @param filterClass ID of the class (required)
     * @param filterSessions IDs of the sessions (required)
     * @param filterStudents IDs of the students (required)
     * @param filterPrice ID of the price (required)
     * @param filterPlan ID of the plan (optional)
     * @param filterDiscount ID of the discount (optional)
     * @param filterVoucher ID of the voucher (optional)
     * @return GetBookingCalculation200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetBookingCalculation200Response getBookingCalculation(Integer filterClass, List<String> filterSessions, List<String> filterStudents, Integer filterPrice, Integer filterPlan, Integer filterDiscount, Integer filterVoucher) throws RestClientException {
        return getBookingCalculationWithHttpInfo(filterClass, filterSessions, filterStudents, filterPrice, filterPlan, filterDiscount, filterVoucher).getBody();
    }

    /**
     * Calculate booking costs
     * Retrieve the Booking costs.
     * <p><b>200</b> - Returns the calculated booking costs.
     * @param filterClass ID of the class (required)
     * @param filterSessions IDs of the sessions (required)
     * @param filterStudents IDs of the students (required)
     * @param filterPrice ID of the price (required)
     * @param filterPlan ID of the plan (optional)
     * @param filterDiscount ID of the discount (optional)
     * @param filterVoucher ID of the voucher (optional)
     * @return ResponseEntity&lt;GetBookingCalculation200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetBookingCalculation200Response> getBookingCalculationWithHttpInfo(Integer filterClass, List<String> filterSessions, List<String> filterStudents, Integer filterPrice, Integer filterPlan, Integer filterDiscount, Integer filterVoucher) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'filterClass' is set
        if (filterClass == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterClass' when calling getBookingCalculation");
        }
        
        // verify the required parameter 'filterSessions' is set
        if (filterSessions == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterSessions' when calling getBookingCalculation");
        }
        
        // verify the required parameter 'filterStudents' is set
        if (filterStudents == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterStudents' when calling getBookingCalculation");
        }
        
        // verify the required parameter 'filterPrice' is set
        if (filterPrice == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterPrice' when calling getBookingCalculation");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[class]", filterClass));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "filter[sessions][]", filterSessions));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "filter[students][]", filterStudents));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[price]", filterPrice));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[plan]", filterPlan));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[discount]", filterDiscount));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[voucher]", filterVoucher));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<GetBookingCalculation200Response> localReturnType = new ParameterizedTypeReference<GetBookingCalculation200Response>() {};
        return apiClient.invokeAPI("/bookings/calculate", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List bookings
     * Retrieve a list of bookings.
     * <p><b>200</b> - Booking created.
     * @param filterOrganiser ID of the organiser (optional)
     * @param filterStudent ID of the student (optional)
     * @param filterEnded Whether the booking has ended (optional)
     * @param include Related resources to include (optional)
     * @return GetBookings200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetBookings200Response getBookings(Integer filterOrganiser, Integer filterStudent, Boolean filterEnded, String include) throws RestClientException {
        return getBookingsWithHttpInfo(filterOrganiser, filterStudent, filterEnded, include).getBody();
    }

    /**
     * List bookings
     * Retrieve a list of bookings.
     * <p><b>200</b> - Booking created.
     * @param filterOrganiser ID of the organiser (optional)
     * @param filterStudent ID of the student (optional)
     * @param filterEnded Whether the booking has ended (optional)
     * @param include Related resources to include (optional)
     * @return ResponseEntity&lt;GetBookings200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetBookings200Response> getBookingsWithHttpInfo(Integer filterOrganiser, Integer filterStudent, Boolean filterEnded, String include) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[organiser]", filterOrganiser));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[student]", filterStudent));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[ended]", filterEnded));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include", include));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<GetBookings200Response> localReturnType = new ParameterizedTypeReference<GetBookings200Response>() {};
        return apiClient.invokeAPI("/bookings", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a booking
     * Create a new booking.
     * <p><b>201</b> - Booking created.
     * @param postBookingRequest Creates a new booking. (optional)
     * @return PostBooking201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostBooking201Response postBooking(PostBookingRequest postBookingRequest) throws RestClientException {
        return postBookingWithHttpInfo(postBookingRequest).getBody();
    }

    /**
     * Create a booking
     * Create a new booking.
     * <p><b>201</b> - Booking created.
     * @param postBookingRequest Creates a new booking. (optional)
     * @return ResponseEntity&lt;PostBooking201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostBooking201Response> postBookingWithHttpInfo(PostBookingRequest postBookingRequest) throws RestClientException {
        Object localVarPostBody = postBookingRequest;
        

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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<PostBooking201Response> localReturnType = new ParameterizedTypeReference<PostBooking201Response>() {};
        return apiClient.invokeAPI("/bookings", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Pay booking
     * Pay a booking.
     * <p><b>204</b> - No content.
     * @param bookingRef  (required)
     * @param postPayBookingRequest Pays for a booking. (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postPayBooking(String bookingRef, PostPayBookingRequest postPayBookingRequest) throws RestClientException {
        postPayBookingWithHttpInfo(bookingRef, postPayBookingRequest);
    }

    /**
     * Pay booking
     * Pay a booking.
     * <p><b>204</b> - No content.
     * @param bookingRef  (required)
     * @param postPayBookingRequest Pays for a booking. (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postPayBookingWithHttpInfo(String bookingRef, PostPayBookingRequest postPayBookingRequest) throws RestClientException {
        Object localVarPostBody = postPayBookingRequest;
        
        // verify the required parameter 'bookingRef' is set
        if (bookingRef == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bookingRef' when calling postPayBooking");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bookingRef", bookingRef);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/bookings/{bookingRef}/pay", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
