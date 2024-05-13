package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ErrorResponseInner;
import org.openapitools.client.model.EstimateObject;
import org.openapitools.client.model.EstimateProcessRequest;

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
public class EstimatesApi {
    private ApiClient apiClient;

    public EstimatesApi() {
        this(new ApiClient());
    }

    public EstimatesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get estimate by ID
     * 
     * <p><b>200</b> - Successful request.
     * <p><b>401</b> - Authentication error
     * <p><b>5XX</b> - Unexpected server error
     * @param estimateID  (required)
     * @return EstimateObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EstimateObject getEstiamteByID(Integer estimateID) throws RestClientException {
        return getEstiamteByIDWithHttpInfo(estimateID).getBody();
    }

    /**
     * Get estimate by ID
     * 
     * <p><b>200</b> - Successful request.
     * <p><b>401</b> - Authentication error
     * <p><b>5XX</b> - Unexpected server error
     * @param estimateID  (required)
     * @return ResponseEntity&lt;EstimateObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EstimateObject> getEstiamteByIDWithHttpInfo(Integer estimateID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'estimateID' is set
        if (estimateID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'estimateID' when calling getEstiamteByID");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "estimateID", estimateID));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<EstimateObject> localReturnType = new ParameterizedTypeReference<EstimateObject>() {};
        return apiClient.invokeAPI("/estimates/estimate.php", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get estimates list
     * 
     * <p><b>200</b> - Successful request.
     * <p><b>401</b> - Authentication error
     * <p><b>5XX</b> - Unexpected server error
     * @param status  (required)
     * @param page  (optional)
     * @param updateTimeUTC format: YYYY-MM-DD hh:mm:ss (optional)
     * @return List&lt;EstimateObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<EstimateObject> getEstiamtes(String status, Integer page, Integer updateTimeUTC) throws RestClientException {
        return getEstiamtesWithHttpInfo(status, page, updateTimeUTC).getBody();
    }

    /**
     * Get estimates list
     * 
     * <p><b>200</b> - Successful request.
     * <p><b>401</b> - Authentication error
     * <p><b>5XX</b> - Unexpected server error
     * @param status  (required)
     * @param page  (optional)
     * @param updateTimeUTC format: YYYY-MM-DD hh:mm:ss (optional)
     * @return ResponseEntity&lt;List&lt;EstimateObject&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<EstimateObject>> getEstiamtesWithHttpInfo(String status, Integer page, Integer updateTimeUTC) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'status' is set
        if (status == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'status' when calling getEstiamtes");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "updateTimeUTC", updateTimeUTC));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<List<EstimateObject>> localReturnType = new ParameterizedTypeReference<List<EstimateObject>>() {};
        return apiClient.invokeAPI("/estimates/estimates.php", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Process estimate
     * action values:      * approve   * partiallyApproved   * estDeclined   * rejectWithResubmit   * partsUnAvail   * estimateHold 
     * <p><b>200</b> - Successful request. 
     * <p><b>401</b> - Authentication error
     * <p><b>5XX</b> - Unexpected server error
     * @param estimateProcessRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void processEstimate(EstimateProcessRequest estimateProcessRequest) throws RestClientException {
        processEstimateWithHttpInfo(estimateProcessRequest);
    }

    /**
     * Process estimate
     * action values:      * approve   * partiallyApproved   * estDeclined   * rejectWithResubmit   * partsUnAvail   * estimateHold 
     * <p><b>200</b> - Successful request. 
     * <p><b>401</b> - Authentication error
     * <p><b>5XX</b> - Unexpected server error
     * @param estimateProcessRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> processEstimateWithHttpInfo(EstimateProcessRequest estimateProcessRequest) throws RestClientException {
        Object localVarPostBody = estimateProcessRequest;
        

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/estimates/process.php", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
