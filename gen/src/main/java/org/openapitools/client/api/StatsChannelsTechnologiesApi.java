package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut500Response;
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
public class StatsChannelsTechnologiesApi {
    private ApiClient apiClient;

    public StatsChannelsTechnologiesApi() {
        this(new ApiClient());
    }

    public StatsChannelsTechnologiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Browsers share
     * This endpoint allows you to retrieve get browsers share.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the Pack order to request. (required)
     * @param from Specify the starting date to get Consumption (required)
     * @param to Specify the ending date to get Consumption (required)
     * @param per Specify the ending date to get Consumption (required)
     * @param accountId The account identifier (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @param requestBody69  (optional)
     * @return Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1videosChannelStatsTechnologiesBrowsersSharesGet(Integer channel, String from, String to, String per, Integer accountId, String with, RequestBody69 requestBody69) throws RestClientException {
        return call1videosChannelStatsTechnologiesBrowsersSharesGetWithHttpInfo(channel, from, to, per, accountId, with, requestBody69).getBody();
    }

    /**
     * Browsers share
     * This endpoint allows you to retrieve get browsers share.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the Pack order to request. (required)
     * @param from Specify the starting date to get Consumption (required)
     * @param to Specify the ending date to get Consumption (required)
     * @param per Specify the ending date to get Consumption (required)
     * @param accountId The account identifier (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @param requestBody69  (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> call1videosChannelStatsTechnologiesBrowsersSharesGetWithHttpInfo(Integer channel, String from, String to, String per, Integer accountId, String with, RequestBody69 requestBody69) throws RestClientException {
        Object localVarPostBody = requestBody69;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelStatsTechnologiesBrowsersSharesGet");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1videosChannelStatsTechnologiesBrowsersSharesGet");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling call1videosChannelStatsTechnologiesBrowsersSharesGet");
        }
        
        // verify the required parameter 'per' is set
        if (per == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'per' when calling call1videosChannelStatsTechnologiesBrowsersSharesGet");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling call1videosChannelStatsTechnologiesBrowsersSharesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per", per));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
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

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/stats/technologies/browsers/shares", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * OS share
     * This endpoint allows you to retrieve get OS share.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the Pack order to request. (required)
     * @param from Specify the starting date to get Consumption (required)
     * @param to Specify the ending date to get Consumption (required)
     * @param per Specify the ending date to get Consumption (required)
     * @param accountId The account identifier (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @param requestBody69  (optional)
     * @return Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1videosChannelStatsTechnologiesOsSharesGet(Integer channel, String from, String to, String per, Integer accountId, String with, RequestBody69 requestBody69) throws RestClientException {
        return call1videosChannelStatsTechnologiesOsSharesGetWithHttpInfo(channel, from, to, per, accountId, with, requestBody69).getBody();
    }

    /**
     * OS share
     * This endpoint allows you to retrieve get OS share.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the Pack order to request. (required)
     * @param from Specify the starting date to get Consumption (required)
     * @param to Specify the ending date to get Consumption (required)
     * @param per Specify the ending date to get Consumption (required)
     * @param accountId The account identifier (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @param requestBody69  (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> call1videosChannelStatsTechnologiesOsSharesGetWithHttpInfo(Integer channel, String from, String to, String per, Integer accountId, String with, RequestBody69 requestBody69) throws RestClientException {
        Object localVarPostBody = requestBody69;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelStatsTechnologiesOsSharesGet");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1videosChannelStatsTechnologiesOsSharesGet");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling call1videosChannelStatsTechnologiesOsSharesGet");
        }
        
        // verify the required parameter 'per' is set
        if (per == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'per' when calling call1videosChannelStatsTechnologiesOsSharesGet");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling call1videosChannelStatsTechnologiesOsSharesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per", per));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
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

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/stats/technologies/os/shares", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Player share
     * This endpoint allows you to retrieve get player share.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the Pack order to request. (required)
     * @param from Specify the starting date to get Consumption (required)
     * @param to Specify the ending date to get Consumption (required)
     * @param per Specify the ending date to get Consumption (required)
     * @param accountId The account identifier (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @param requestBody69  (optional)
     * @return Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1videosChannelStatsTechnologiesPlayersSharesGet(Integer channel, String from, String to, String per, Integer accountId, String with, RequestBody69 requestBody69) throws RestClientException {
        return call1videosChannelStatsTechnologiesPlayersSharesGetWithHttpInfo(channel, from, to, per, accountId, with, requestBody69).getBody();
    }

    /**
     * Player share
     * This endpoint allows you to retrieve get player share.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the Pack order to request. (required)
     * @param from Specify the starting date to get Consumption (required)
     * @param to Specify the ending date to get Consumption (required)
     * @param per Specify the ending date to get Consumption (required)
     * @param accountId The account identifier (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @param requestBody69  (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> call1videosChannelStatsTechnologiesPlayersSharesGetWithHttpInfo(Integer channel, String from, String to, String per, Integer accountId, String with, RequestBody69 requestBody69) throws RestClientException {
        Object localVarPostBody = requestBody69;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelStatsTechnologiesPlayersSharesGet");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1videosChannelStatsTechnologiesPlayersSharesGet");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling call1videosChannelStatsTechnologiesPlayersSharesGet");
        }
        
        // verify the required parameter 'per' is set
        if (per == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'per' when calling call1videosChannelStatsTechnologiesPlayersSharesGet");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling call1videosChannelStatsTechnologiesPlayersSharesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per", per));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
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

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/stats/technologies/players/shares", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
