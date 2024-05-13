package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut200Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut500Response;
import org.openapitools.client.model.Model1VideosStatsViewersGet200Response;
import org.openapitools.client.model.Model1VideosStatsViewersHistogramGet200Response;
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
public class StatsGlobalsViewersApi {
    private ApiClient apiClient;

    public StatsGlobalsViewersApi() {
        this(new ApiClient());
    }

    public StatsGlobalsViewersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Viewers per channel histogram
     * This endpoint allows you to retrieve Global viewers histogram per channel.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param from Specify the starting date to get Consumption (required)
     * @param to Specify the ending date to get Consumption (required)
     * @param per Specify the ending date to get Consumption (required)
     * @param accountId The account identifier (required)
     * @param requestBody69  (optional)
     * @return Model1SwissBackupsSwissBackupIdAdminPut200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdAdminPut200Response call1videosStatsViewersChannelsHistogramGet(String from, String to, String per, Integer accountId, RequestBody69 requestBody69) throws RestClientException {
        return call1videosStatsViewersChannelsHistogramGetWithHttpInfo(from, to, per, accountId, requestBody69).getBody();
    }

    /**
     * Viewers per channel histogram
     * This endpoint allows you to retrieve Global viewers histogram per channel.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param from Specify the starting date to get Consumption (required)
     * @param to Specify the ending date to get Consumption (required)
     * @param per Specify the ending date to get Consumption (required)
     * @param accountId The account identifier (required)
     * @param requestBody69  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdAdminPut200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdAdminPut200Response> call1videosStatsViewersChannelsHistogramGetWithHttpInfo(String from, String to, String per, Integer accountId, RequestBody69 requestBody69) throws RestClientException {
        Object localVarPostBody = requestBody69;
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1videosStatsViewersChannelsHistogramGet");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling call1videosStatsViewersChannelsHistogramGet");
        }
        
        // verify the required parameter 'per' is set
        if (per == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'per' when calling call1videosStatsViewersChannelsHistogramGet");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling call1videosStatsViewersChannelsHistogramGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per", per));
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

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdAdminPut200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdAdminPut200Response>() {};
        return apiClient.invokeAPI("/1/videos/stats/viewers/channels/histogram", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Viewers per channel share
     * This endpoint allows you to retrieve Global viewers histogram share per channel.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param from Specify the starting date to get Consumption (required)
     * @param accountId The account identifier (required)
     * @param requestBody69  (optional)
     * @return Model1SwissBackupsSwissBackupIdAdminPut200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdAdminPut200Response call1videosStatsViewersChannelsSharesGet(String from, Integer accountId, RequestBody69 requestBody69) throws RestClientException {
        return call1videosStatsViewersChannelsSharesGetWithHttpInfo(from, accountId, requestBody69).getBody();
    }

    /**
     * Viewers per channel share
     * This endpoint allows you to retrieve Global viewers histogram share per channel.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param from Specify the starting date to get Consumption (required)
     * @param accountId The account identifier (required)
     * @param requestBody69  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdAdminPut200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdAdminPut200Response> call1videosStatsViewersChannelsSharesGetWithHttpInfo(String from, Integer accountId, RequestBody69 requestBody69) throws RestClientException {
        Object localVarPostBody = requestBody69;
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1videosStatsViewersChannelsSharesGet");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling call1videosStatsViewersChannelsSharesGet");
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

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdAdminPut200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdAdminPut200Response>() {};
        return apiClient.invokeAPI("/1/videos/stats/viewers/channels/shares", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Viewers
     * This endpoint allows you to retrieve Global viewers on the pack order.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param from Specify the starting date to get Consumption (required)
     * @param to Specify the ending date to get Consumption (required)
     * @param per Specify the ending date to get Consumption (required)
     * @param accountId The account identifier (required)
     * @param requestBody69  (optional)
     * @return Model1VideosStatsViewersGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosStatsViewersGet200Response call1videosStatsViewersGet(String from, String to, String per, Integer accountId, RequestBody69 requestBody69) throws RestClientException {
        return call1videosStatsViewersGetWithHttpInfo(from, to, per, accountId, requestBody69).getBody();
    }

    /**
     * Viewers
     * This endpoint allows you to retrieve Global viewers on the pack order.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param from Specify the starting date to get Consumption (required)
     * @param to Specify the ending date to get Consumption (required)
     * @param per Specify the ending date to get Consumption (required)
     * @param accountId The account identifier (required)
     * @param requestBody69  (optional)
     * @return ResponseEntity&lt;Model1VideosStatsViewersGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosStatsViewersGet200Response> call1videosStatsViewersGetWithHttpInfo(String from, String to, String per, Integer accountId, RequestBody69 requestBody69) throws RestClientException {
        Object localVarPostBody = requestBody69;
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1videosStatsViewersGet");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling call1videosStatsViewersGet");
        }
        
        // verify the required parameter 'per' is set
        if (per == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'per' when calling call1videosStatsViewersGet");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling call1videosStatsViewersGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per", per));
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

        ParameterizedTypeReference<Model1VideosStatsViewersGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosStatsViewersGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/stats/viewers", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Viewers Histogram
     * This endpoint allows you to retrieve Global unique viewers histogram on the pack order.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param from Specify the starting date to get Consumption (required)
     * @param to Specify the ending date to get Consumption (required)
     * @param per Specify the ending date to get Consumption (required)
     * @return Model1VideosStatsViewersHistogramGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosStatsViewersHistogramGet200Response call1videosStatsViewersHistogramGet(String from, String to, String per) throws RestClientException {
        return call1videosStatsViewersHistogramGetWithHttpInfo(from, to, per).getBody();
    }

    /**
     * Viewers Histogram
     * This endpoint allows you to retrieve Global unique viewers histogram on the pack order.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param from Specify the starting date to get Consumption (required)
     * @param to Specify the ending date to get Consumption (required)
     * @param per Specify the ending date to get Consumption (required)
     * @return ResponseEntity&lt;Model1VideosStatsViewersHistogramGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosStatsViewersHistogramGet200Response> call1videosStatsViewersHistogramGetWithHttpInfo(String from, String to, String per) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1videosStatsViewersHistogramGet");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling call1videosStatsViewersHistogramGet");
        }
        
        // verify the required parameter 'per' is set
        if (per == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'per' when calling call1videosStatsViewersHistogramGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per", per));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1VideosStatsViewersHistogramGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosStatsViewersHistogramGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/stats/viewers/histogram", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Unique Viewers
     * This endpoint allows you to retrieve Global unique viewers on the pack order.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param from Specify the starting date to get Consumption (required)
     * @param to Specify the ending date to get Consumption (required)
     * @param per Specify the ending date to get Consumption (required)
     * @param accountId The account identifier (required)
     * @param requestBody69  (optional)
     * @return Model1VideosStatsViewersGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosStatsViewersGet200Response call1videosStatsViewersUniquesGet(String from, String to, String per, Integer accountId, RequestBody69 requestBody69) throws RestClientException {
        return call1videosStatsViewersUniquesGetWithHttpInfo(from, to, per, accountId, requestBody69).getBody();
    }

    /**
     * Unique Viewers
     * This endpoint allows you to retrieve Global unique viewers on the pack order.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param from Specify the starting date to get Consumption (required)
     * @param to Specify the ending date to get Consumption (required)
     * @param per Specify the ending date to get Consumption (required)
     * @param accountId The account identifier (required)
     * @param requestBody69  (optional)
     * @return ResponseEntity&lt;Model1VideosStatsViewersGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosStatsViewersGet200Response> call1videosStatsViewersUniquesGetWithHttpInfo(String from, String to, String per, Integer accountId, RequestBody69 requestBody69) throws RestClientException {
        Object localVarPostBody = requestBody69;
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1videosStatsViewersUniquesGet");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling call1videosStatsViewersUniquesGet");
        }
        
        // verify the required parameter 'per' is set
        if (per == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'per' when calling call1videosStatsViewersUniquesGet");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling call1videosStatsViewersUniquesGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per", per));
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

        ParameterizedTypeReference<Model1VideosStatsViewersGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosStatsViewersGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/stats/viewers/uniques", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}