package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut500Response;
import org.openapitools.client.model.Model1VideosStatsConsumptionGet200Response;
import org.openapitools.client.model.RequestBody69;

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
public class StatsGlobalsConsumptionApi {
    private ApiClient apiClient;

    public StatsGlobalsConsumptionApi() {
        this(new ApiClient());
    }

    public StatsGlobalsConsumptionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Consumption per Channel histogram
     * This endpoint allows you to retrieve Global Histogram per channel on the pack order.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param from Specify the starting date to get Consumption (required)
     * @return Model1VideosStatsConsumptionGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosStatsConsumptionGet200Response call1videosStatsConsumptionChannelsHistogramGet(String from) throws RestClientException {
        return call1videosStatsConsumptionChannelsHistogramGetWithHttpInfo(from).getBody();
    }

    /**
     * Consumption per Channel histogram
     * This endpoint allows you to retrieve Global Histogram per channel on the pack order.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param from Specify the starting date to get Consumption (required)
     * @return ResponseEntity&lt;Model1VideosStatsConsumptionGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosStatsConsumptionGet200Response> call1videosStatsConsumptionChannelsHistogramGetWithHttpInfo(String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1videosStatsConsumptionChannelsHistogramGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1VideosStatsConsumptionGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosStatsConsumptionGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/stats/consumption/channels/histogram", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Consumption
     * This endpoint allows you to retrieve Global consumption all channel on the pack order.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param from Specify the starting date to get Consumption (required)
     * @param accountId The account identifier (required)
     * @param requestBody69  (optional)
     * @return Model1VideosStatsConsumptionGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosStatsConsumptionGet200Response call1videosStatsConsumptionGet(String from, Integer accountId, RequestBody69 requestBody69) throws RestClientException {
        return call1videosStatsConsumptionGetWithHttpInfo(from, accountId, requestBody69).getBody();
    }

    /**
     * Consumption
     * This endpoint allows you to retrieve Global consumption all channel on the pack order.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param from Specify the starting date to get Consumption (required)
     * @param accountId The account identifier (required)
     * @param requestBody69  (optional)
     * @return ResponseEntity&lt;Model1VideosStatsConsumptionGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosStatsConsumptionGet200Response> call1videosStatsConsumptionGetWithHttpInfo(String from, Integer accountId, RequestBody69 requestBody69) throws RestClientException {
        Object localVarPostBody = requestBody69;
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1videosStatsConsumptionGet");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling call1videosStatsConsumptionGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "account_id", accountId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1VideosStatsConsumptionGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosStatsConsumptionGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/stats/consumption", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
