package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AvailabilityRequest;
import org.openapitools.client.model.AvailabilityVirtualTechRequest;
import org.openapitools.client.model.AvailabilityVirutalTechResponseInner;
import org.openapitools.client.model.AvailabilityWithCODCostResponse;
import org.openapitools.client.model.ErrorResponseInner;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:53.009381485Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AvailabilityApi {
    private ApiClient apiClient;

    public AvailabilityApi() {
        this(new ApiClient());
    }

    public AvailabilityApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Provides availability by NSA based on provided parameters
     * 
     * <p><b>200</b> - Successful request. You will get one of two responses: 1) an array of dates with availability 2) an empty array signifiying that there is no availability 
     * <p><b>400</b> - User request error
     * <p><b>401</b> - Authentication error
     * <p><b>5XX</b> - Unexpected server error
     * @param availabilityRequest  (optional)
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> getAvailability(AvailabilityRequest availabilityRequest) throws RestClientException {
        return getAvailabilityWithHttpInfo(availabilityRequest).getBody();
    }

    /**
     * Provides availability by NSA based on provided parameters
     * 
     * <p><b>200</b> - Successful request. You will get one of two responses: 1) an array of dates with availability 2) an empty array signifiying that there is no availability 
     * <p><b>400</b> - User request error
     * <p><b>401</b> - Authentication error
     * <p><b>5XX</b> - Unexpected server error
     * @param availabilityRequest  (optional)
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> getAvailabilityWithHttpInfo(AvailabilityRequest availabilityRequest) throws RestClientException {
        Object localVarPostBody = availabilityRequest;
        

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

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<List<String>> localReturnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI("/availability/availability.php", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Provides availability by NSA&#39;s virtual technicians
     * 
     * <p><b>200</b> - Successful request. You will get one of two responses: 1) an array of dates with availability 2) an empty array signifiying that there is no availability 
     * <p><b>400</b> - User request error
     * <p><b>401</b> - Authentication error
     * <p><b>5XX</b> - Unexpected server error
     * @param availabilityVirtualTechRequest  (optional)
     * @return List&lt;AvailabilityVirutalTechResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AvailabilityVirutalTechResponseInner> getAvailabilityVirtualTech(AvailabilityVirtualTechRequest availabilityVirtualTechRequest) throws RestClientException {
        return getAvailabilityVirtualTechWithHttpInfo(availabilityVirtualTechRequest).getBody();
    }

    /**
     * Provides availability by NSA&#39;s virtual technicians
     * 
     * <p><b>200</b> - Successful request. You will get one of two responses: 1) an array of dates with availability 2) an empty array signifiying that there is no availability 
     * <p><b>400</b> - User request error
     * <p><b>401</b> - Authentication error
     * <p><b>5XX</b> - Unexpected server error
     * @param availabilityVirtualTechRequest  (optional)
     * @return ResponseEntity&lt;List&lt;AvailabilityVirutalTechResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AvailabilityVirutalTechResponseInner>> getAvailabilityVirtualTechWithHttpInfo(AvailabilityVirtualTechRequest availabilityVirtualTechRequest) throws RestClientException {
        Object localVarPostBody = availabilityVirtualTechRequest;
        

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

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<List<AvailabilityVirutalTechResponseInner>> localReturnType = new ParameterizedTypeReference<List<AvailabilityVirutalTechResponseInner>>() {};
        return apiClient.invokeAPI("/availability/availabilityVirtualTech.php", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Provides availability by NSA based on provided parameters and associated COD Cost
     * 
     * <p><b>200</b> - Successful request. You will get one of two responses: 1) an array of dates with availability 2) an empty array signifiying that there is no availability 
     * <p><b>400</b> - User request error
     * <p><b>401</b> - Authentication error
     * <p><b>5XX</b> - Unexpected server error
     * @param availabilityRequest  (optional)
     * @return AvailabilityWithCODCostResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AvailabilityWithCODCostResponse getAvailabilityWithCODCost(AvailabilityRequest availabilityRequest) throws RestClientException {
        return getAvailabilityWithCODCostWithHttpInfo(availabilityRequest).getBody();
    }

    /**
     * Provides availability by NSA based on provided parameters and associated COD Cost
     * 
     * <p><b>200</b> - Successful request. You will get one of two responses: 1) an array of dates with availability 2) an empty array signifiying that there is no availability 
     * <p><b>400</b> - User request error
     * <p><b>401</b> - Authentication error
     * <p><b>5XX</b> - Unexpected server error
     * @param availabilityRequest  (optional)
     * @return ResponseEntity&lt;AvailabilityWithCODCostResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AvailabilityWithCODCostResponse> getAvailabilityWithCODCostWithHttpInfo(AvailabilityRequest availabilityRequest) throws RestClientException {
        Object localVarPostBody = availabilityRequest;
        

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

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<AvailabilityWithCODCostResponse> localReturnType = new ParameterizedTypeReference<AvailabilityWithCODCostResponse>() {};
        return apiClient.invokeAPI("/availability/availabilityWithCODCost.php", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
