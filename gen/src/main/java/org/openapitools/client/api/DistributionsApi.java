package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Distribution;
import org.openapitools.client.model.ModelApiResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:21.806739296Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DistributionsApi {
    private ApiClient apiClient;

    public DistributionsApi() {
        this(new ApiClient());
    }

    public DistributionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete user
     * 
     * <p><b>400</b> - Invalid Request
     * <p><b>404</b> - Distribution not found
     * @param id ID of the distribution to be deleted (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteDistribution(String id) throws RestClientException {
        deleteDistributionWithHttpInfo(id);
    }

    /**
     * Delete user
     * 
     * <p><b>400</b> - Invalid Request
     * <p><b>404</b> - Distribution not found
     * @param id ID of the distribution to be deleted (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteDistributionWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteDistribution");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/distributions/{id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Distribution by Id
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid Request
     * <p><b>404</b> - Distribution not found
     * @param channelId Unique Numerical ID of the distribution (required)
     * @param assetId Unique Numerical ID of the distribution (required)
     * @return Distribution
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Distribution findChannelDistributionByAssetId(Integer channelId, Integer assetId) throws RestClientException {
        return findChannelDistributionByAssetIdWithHttpInfo(channelId, assetId).getBody();
    }

    /**
     * Get Distribution by Id
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid Request
     * <p><b>404</b> - Distribution not found
     * @param channelId Unique Numerical ID of the distribution (required)
     * @param assetId Unique Numerical ID of the distribution (required)
     * @return ResponseEntity&lt;Distribution&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Distribution> findChannelDistributionByAssetIdWithHttpInfo(Integer channelId, Integer assetId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling findChannelDistributionByAssetId");
        }
        
        // verify the required parameter 'assetId' is set
        if (assetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assetId' when calling findChannelDistributionByAssetId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channelId", channelId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "assetId", assetId));
        

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Distribution> localReturnType = new ParameterizedTypeReference<Distribution>() {};
        return apiClient.invokeAPI("/distributions/channels/{channelId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Distribution by Id
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid Request
     * <p><b>404</b> - Distribution not found
     * @param scheduleId Unique Numerical ID of the distribution (required)
     * @param assetId Unique Numerical ID of the distribution (required)
     * @return Distribution
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Distribution findScheduleDistributionByAssetId(Integer scheduleId, Integer assetId) throws RestClientException {
        return findScheduleDistributionByAssetIdWithHttpInfo(scheduleId, assetId).getBody();
    }

    /**
     * Get Distribution by Id
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid Request
     * <p><b>404</b> - Distribution not found
     * @param scheduleId Unique Numerical ID of the distribution (required)
     * @param assetId Unique Numerical ID of the distribution (required)
     * @return ResponseEntity&lt;Distribution&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Distribution> findScheduleDistributionByAssetIdWithHttpInfo(Integer scheduleId, Integer assetId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'scheduleId' is set
        if (scheduleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'scheduleId' when calling findScheduleDistributionByAssetId");
        }
        
        // verify the required parameter 'assetId' is set
        if (assetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assetId' when calling findScheduleDistributionByAssetId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("scheduleId", scheduleId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "assetId", assetId));
        

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Distribution> localReturnType = new ParameterizedTypeReference<Distribution>() {};
        return apiClient.invokeAPI("/distributions/schedules/{scheduleId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Distribution by Id
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid Request
     * <p><b>404</b> - Distribution not found
     * @param id Unique Numerical ID of the distribution (required)
     * @return Distribution
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Distribution getDistributionById(Integer id) throws RestClientException {
        return getDistributionByIdWithHttpInfo(id).getBody();
    }

    /**
     * Get Distribution by Id
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid Request
     * <p><b>404</b> - Distribution not found
     * @param id Unique Numerical ID of the distribution (required)
     * @return ResponseEntity&lt;Distribution&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Distribution> getDistributionByIdWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDistributionById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Distribution> localReturnType = new ParameterizedTypeReference<Distribution>() {};
        return apiClient.invokeAPI("/distributions/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
