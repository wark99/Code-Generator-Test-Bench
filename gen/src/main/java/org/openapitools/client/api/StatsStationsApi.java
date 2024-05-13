package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1RadiosRadioProductIdStationsStationIdStatsConsumptionGet200Response;
import org.openapitools.client.model.Model1RadiosRadioProductIdStationsStationIdStatsCountriesContinentGet200Response;
import org.openapitools.client.model.Model1RadiosRadioProductIdStationsStationIdStatsLinksGet200Response;
import org.openapitools.client.model.Model1RadiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet200Response;
import org.openapitools.client.model.Model1RadiosRadioProductIdStationsStationIdStatsStreamConsumptionGet200Response;
import org.openapitools.client.model.Model1RadiosRadioProductIdStationsStationIdStatsStreamListenersGet200Response;
import org.openapitools.client.model.Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response;
import org.openapitools.client.model.Model1RadiosRadioProductIdStationsStationIdStatsTotalPlayersGet200Response;
import org.openapitools.client.model.Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut200Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut404Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdPut422Response;

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
public class StatsStationsApi {
    private ApiClient apiClient;

    public StatsStationsApi() {
        this(new ApiClient());
    }

    public StatsStationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get consumption
     * This endpoint allows you to retrieve station consumption stats.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @param withHlsStats  (optional)
     * @return Model1RadiosRadioProductIdStationsStationIdStatsConsumptionGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStatsConsumptionGet200Response call1radiosRadioProductIdStationsStationIdStatsConsumptionGet(Integer radioProductId, Integer stationId, String from, String to, String streamIds, Boolean withHlsStats) throws RestClientException {
        return call1radiosRadioProductIdStationsStationIdStatsConsumptionGetWithHttpInfo(radioProductId, stationId, from, to, streamIds, withHlsStats).getBody();
    }

    /**
     * Get consumption
     * This endpoint allows you to retrieve station consumption stats.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @param withHlsStats  (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStatsConsumptionGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStatsConsumptionGet200Response> call1radiosRadioProductIdStationsStationIdStatsConsumptionGetWithHttpInfo(Integer radioProductId, Integer stationId, String from, String to, String streamIds, Boolean withHlsStats) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdStationsStationIdStatsConsumptionGet");
        }
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling call1radiosRadioProductIdStationsStationIdStatsConsumptionGet");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1radiosRadioProductIdStationsStationIdStatsConsumptionGet");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling call1radiosRadioProductIdStationsStationIdStatsConsumptionGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("station_id", stationId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "stream_ids", streamIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_hls_stats", withHlsStats));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStatsConsumptionGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStatsConsumptionGet200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/stations/{station_id}/stats/consumption", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get countries by continent
     * This endpoint allows you to retrieve station total countries stats by continent.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @param withHlsStats  (optional)
     * @return Model1RadiosRadioProductIdStationsStationIdStatsCountriesContinentGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStatsCountriesContinentGet200Response call1radiosRadioProductIdStationsStationIdStatsCountriesContinentGet(Integer radioProductId, Integer stationId, String from, String to, String streamIds, Boolean withHlsStats) throws RestClientException {
        return call1radiosRadioProductIdStationsStationIdStatsCountriesContinentGetWithHttpInfo(radioProductId, stationId, from, to, streamIds, withHlsStats).getBody();
    }

    /**
     * Get countries by continent
     * This endpoint allows you to retrieve station total countries stats by continent.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @param withHlsStats  (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStatsCountriesContinentGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStatsCountriesContinentGet200Response> call1radiosRadioProductIdStationsStationIdStatsCountriesContinentGetWithHttpInfo(Integer radioProductId, Integer stationId, String from, String to, String streamIds, Boolean withHlsStats) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdStationsStationIdStatsCountriesContinentGet");
        }
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling call1radiosRadioProductIdStationsStationIdStatsCountriesContinentGet");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1radiosRadioProductIdStationsStationIdStatsCountriesContinentGet");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling call1radiosRadioProductIdStationsStationIdStatsCountriesContinentGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("station_id", stationId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "stream_ids", streamIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_hls_stats", withHlsStats));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStatsCountriesContinentGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStatsCountriesContinentGet200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/stations/{station_id}/stats/countries_continent", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get countries
     * This endpoint allows you to retrieve station countries stats.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @param withHlsStats  (optional)
     * @return Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1radiosRadioProductIdStationsStationIdStatsCountriesGet(Integer radioProductId, Integer stationId, String from, String to, String streamIds, Boolean withHlsStats) throws RestClientException {
        return call1radiosRadioProductIdStationsStationIdStatsCountriesGetWithHttpInfo(radioProductId, stationId, from, to, streamIds, withHlsStats).getBody();
    }

    /**
     * Get countries
     * This endpoint allows you to retrieve station countries stats.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @param withHlsStats  (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> call1radiosRadioProductIdStationsStationIdStatsCountriesGetWithHttpInfo(Integer radioProductId, Integer stationId, String from, String to, String streamIds, Boolean withHlsStats) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdStationsStationIdStatsCountriesGet");
        }
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling call1radiosRadioProductIdStationsStationIdStatsCountriesGet");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1radiosRadioProductIdStationsStationIdStatsCountriesGet");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling call1radiosRadioProductIdStationsStationIdStatsCountriesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("station_id", stationId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "stream_ids", streamIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_hls_stats", withHlsStats));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/stations/{station_id}/stats/countries", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Export stats
     * This endpoint allows you to export station stats.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param datatype  (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @param withHlsStats  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object call1radiosRadioProductIdStationsStationIdStatsExportCsvGet(Integer radioProductId, Integer stationId, String datatype, String from, String to, String streamIds, Boolean withHlsStats) throws RestClientException {
        return call1radiosRadioProductIdStationsStationIdStatsExportCsvGetWithHttpInfo(radioProductId, stationId, datatype, from, to, streamIds, withHlsStats).getBody();
    }

    /**
     * Export stats
     * This endpoint allows you to export station stats.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param datatype  (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @param withHlsStats  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> call1radiosRadioProductIdStationsStationIdStatsExportCsvGetWithHttpInfo(Integer radioProductId, Integer stationId, String datatype, String from, String to, String streamIds, Boolean withHlsStats) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdStationsStationIdStatsExportCsvGet");
        }
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling call1radiosRadioProductIdStationsStationIdStatsExportCsvGet");
        }
        
        // verify the required parameter 'datatype' is set
        if (datatype == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'datatype' when calling call1radiosRadioProductIdStationsStationIdStatsExportCsvGet");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1radiosRadioProductIdStationsStationIdStatsExportCsvGet");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling call1radiosRadioProductIdStationsStationIdStatsExportCsvGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("station_id", stationId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "datatype", datatype));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "stream_ids", streamIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_hls_stats", withHlsStats));
        

        final String[] localVarAccepts = { 
            "application/octet-stream", "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/stations/{station_id}/stats/export_csv", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List stats links
     * This endpoint allows you to get all stats links.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @return Model1RadiosRadioProductIdStationsStationIdStatsLinksGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStatsLinksGet200Response call1radiosRadioProductIdStationsStationIdStatsLinksGet(Integer radioProductId, Integer stationId) throws RestClientException {
        return call1radiosRadioProductIdStationsStationIdStatsLinksGetWithHttpInfo(radioProductId, stationId).getBody();
    }

    /**
     * List stats links
     * This endpoint allows you to get all stats links.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStatsLinksGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStatsLinksGet200Response> call1radiosRadioProductIdStationsStationIdStatsLinksGetWithHttpInfo(Integer radioProductId, Integer stationId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdStationsStationIdStatsLinksGet");
        }
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling call1radiosRadioProductIdStationsStationIdStatsLinksGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("station_id", stationId);

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStatsLinksGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStatsLinksGet200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/stations/{station_id}/stats/links", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get listeners
     * This endpoint allows you to retrieve station listeners stats.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @param withHlsStats  (optional)
     * @return Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1radiosRadioProductIdStationsStationIdStatsListenersGet(Integer radioProductId, Integer stationId, String from, String to, String streamIds, Boolean withHlsStats) throws RestClientException {
        return call1radiosRadioProductIdStationsStationIdStatsListenersGetWithHttpInfo(radioProductId, stationId, from, to, streamIds, withHlsStats).getBody();
    }

    /**
     * Get listeners
     * This endpoint allows you to retrieve station listeners stats.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @param withHlsStats  (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> call1radiosRadioProductIdStationsStationIdStatsListenersGetWithHttpInfo(Integer radioProductId, Integer stationId, String from, String to, String streamIds, Boolean withHlsStats) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdStationsStationIdStatsListenersGet");
        }
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling call1radiosRadioProductIdStationsStationIdStatsListenersGet");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1radiosRadioProductIdStationsStationIdStatsListenersGet");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling call1radiosRadioProductIdStationsStationIdStatsListenersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("station_id", stationId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "stream_ids", streamIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_hls_stats", withHlsStats));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/stations/{station_id}/stats/listeners", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get listeners per minute
     * This endpoint allows you to retrieve station listeners stats per minute on last 24h.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param from  (required)
     * @param to  (required)
     * @param stationIds  (optional)
     * @return Model1RadiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet200Response call1radiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet(Integer radioProductId, Integer stationId, String from, String to, String stationIds) throws RestClientException {
        return call1radiosRadioProductIdStationsStationIdStatsListenersPerMinuteGetWithHttpInfo(radioProductId, stationId, from, to, stationIds).getBody();
    }

    /**
     * Get listeners per minute
     * This endpoint allows you to retrieve station listeners stats per minute on last 24h.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param from  (required)
     * @param to  (required)
     * @param stationIds  (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet200Response> call1radiosRadioProductIdStationsStationIdStatsListenersPerMinuteGetWithHttpInfo(Integer radioProductId, Integer stationId, String from, String to, String stationIds) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet");
        }
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling call1radiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1radiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling call1radiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("station_id", stationId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "station_ids", stationIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/stations/{station_id}/stats/listeners_per_minute", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get players
     * This endpoint allows you to retrieve players stats.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @param withHlsStats  (optional)
     * @return Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1radiosRadioProductIdStationsStationIdStatsPlayersGet(Integer radioProductId, Integer stationId, String from, String to, String streamIds, Boolean withHlsStats) throws RestClientException {
        return call1radiosRadioProductIdStationsStationIdStatsPlayersGetWithHttpInfo(radioProductId, stationId, from, to, streamIds, withHlsStats).getBody();
    }

    /**
     * Get players
     * This endpoint allows you to retrieve players stats.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @param withHlsStats  (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> call1radiosRadioProductIdStationsStationIdStatsPlayersGetWithHttpInfo(Integer radioProductId, Integer stationId, String from, String to, String streamIds, Boolean withHlsStats) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdStationsStationIdStatsPlayersGet");
        }
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling call1radiosRadioProductIdStationsStationIdStatsPlayersGet");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1radiosRadioProductIdStationsStationIdStatsPlayersGet");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling call1radiosRadioProductIdStationsStationIdStatsPlayersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("station_id", stationId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "stream_ids", streamIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_hls_stats", withHlsStats));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/stations/{station_id}/stats/players", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get stats by streams
     * This endpoint allows you to retrieve stats group by streams.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId  (required)
     * @param datatype  (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @return Model1SwissBackupsSwissBackupIdAdminPut200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdAdminPut200Response call1radiosRadioProductIdStationsStationIdStatsStatsByStreamGet(Integer radioProductId, String stationId, String datatype, String from, String to, String streamIds) throws RestClientException {
        return call1radiosRadioProductIdStationsStationIdStatsStatsByStreamGetWithHttpInfo(radioProductId, stationId, datatype, from, to, streamIds).getBody();
    }

    /**
     * Get stats by streams
     * This endpoint allows you to retrieve stats group by streams.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId  (required)
     * @param datatype  (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdAdminPut200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdAdminPut200Response> call1radiosRadioProductIdStationsStationIdStatsStatsByStreamGetWithHttpInfo(Integer radioProductId, String stationId, String datatype, String from, String to, String streamIds) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdStationsStationIdStatsStatsByStreamGet");
        }
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling call1radiosRadioProductIdStationsStationIdStatsStatsByStreamGet");
        }
        
        // verify the required parameter 'datatype' is set
        if (datatype == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'datatype' when calling call1radiosRadioProductIdStationsStationIdStatsStatsByStreamGet");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1radiosRadioProductIdStationsStationIdStatsStatsByStreamGet");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling call1radiosRadioProductIdStationsStationIdStatsStatsByStreamGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("station_id", stationId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "datatype", datatype));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "stream_ids", streamIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdAdminPut200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdAdminPut200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/stations/{station_id}/stats/stats_by_stream", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get consumption by stream
     * This endpoint allows you to retrieve station consumption stats by stream.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @param withHlsStats  (optional)
     * @return Model1RadiosRadioProductIdStationsStationIdStatsStreamConsumptionGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStatsStreamConsumptionGet200Response call1radiosRadioProductIdStationsStationIdStatsStreamConsumptionGet(Integer radioProductId, Integer stationId, String from, String to, String streamIds, Boolean withHlsStats) throws RestClientException {
        return call1radiosRadioProductIdStationsStationIdStatsStreamConsumptionGetWithHttpInfo(radioProductId, stationId, from, to, streamIds, withHlsStats).getBody();
    }

    /**
     * Get consumption by stream
     * This endpoint allows you to retrieve station consumption stats by stream.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @param withHlsStats  (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStatsStreamConsumptionGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStatsStreamConsumptionGet200Response> call1radiosRadioProductIdStationsStationIdStatsStreamConsumptionGetWithHttpInfo(Integer radioProductId, Integer stationId, String from, String to, String streamIds, Boolean withHlsStats) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdStationsStationIdStatsStreamConsumptionGet");
        }
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling call1radiosRadioProductIdStationsStationIdStatsStreamConsumptionGet");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1radiosRadioProductIdStationsStationIdStatsStreamConsumptionGet");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling call1radiosRadioProductIdStationsStationIdStatsStreamConsumptionGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("station_id", stationId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "stream_ids", streamIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_hls_stats", withHlsStats));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStatsStreamConsumptionGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStatsStreamConsumptionGet200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/stations/{station_id}/stats/stream_consumption", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get listeners by stream
     * This endpoint allows you to retrieve station listeners stats by stream.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @param withEmpty  (optional)
     * @param withHlsStats  (optional)
     * @return Model1RadiosRadioProductIdStationsStationIdStatsStreamListenersGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStatsStreamListenersGet200Response call1radiosRadioProductIdStationsStationIdStatsStreamListenersGet(Integer radioProductId, Integer stationId, String from, String to, String streamIds, Boolean withEmpty, Boolean withHlsStats) throws RestClientException {
        return call1radiosRadioProductIdStationsStationIdStatsStreamListenersGetWithHttpInfo(radioProductId, stationId, from, to, streamIds, withEmpty, withHlsStats).getBody();
    }

    /**
     * Get listeners by stream
     * This endpoint allows you to retrieve station listeners stats by stream.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @param withEmpty  (optional)
     * @param withHlsStats  (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStatsStreamListenersGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStatsStreamListenersGet200Response> call1radiosRadioProductIdStationsStationIdStatsStreamListenersGetWithHttpInfo(Integer radioProductId, Integer stationId, String from, String to, String streamIds, Boolean withEmpty, Boolean withHlsStats) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdStationsStationIdStatsStreamListenersGet");
        }
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling call1radiosRadioProductIdStationsStationIdStatsStreamListenersGet");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1radiosRadioProductIdStationsStationIdStatsStreamListenersGet");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling call1radiosRadioProductIdStationsStationIdStatsStreamListenersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("station_id", stationId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "stream_ids", streamIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_empty", withEmpty));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_hls_stats", withHlsStats));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStatsStreamListenersGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStatsStreamListenersGet200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/stations/{station_id}/stats/stream_listeners", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get total consumption
     * This endpoint allows you to retrieve station total consumption stats.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @param withHlsStats  (optional)
     * @return Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response call1radiosRadioProductIdStationsStationIdStatsTotalConsumptionGet(Integer radioProductId, Integer stationId, String from, String to, String streamIds, Boolean withHlsStats) throws RestClientException {
        return call1radiosRadioProductIdStationsStationIdStatsTotalConsumptionGetWithHttpInfo(radioProductId, stationId, from, to, streamIds, withHlsStats).getBody();
    }

    /**
     * Get total consumption
     * This endpoint allows you to retrieve station total consumption stats.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @param withHlsStats  (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response> call1radiosRadioProductIdStationsStationIdStatsTotalConsumptionGetWithHttpInfo(Integer radioProductId, Integer stationId, String from, String to, String streamIds, Boolean withHlsStats) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdStationsStationIdStatsTotalConsumptionGet");
        }
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling call1radiosRadioProductIdStationsStationIdStatsTotalConsumptionGet");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1radiosRadioProductIdStationsStationIdStatsTotalConsumptionGet");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling call1radiosRadioProductIdStationsStationIdStatsTotalConsumptionGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("station_id", stationId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "stream_ids", streamIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_hls_stats", withHlsStats));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/stations/{station_id}/stats/total_consumption", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get total players
     * This endpoint allows you to retrieve players total stats.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @param withHlsStats  (optional)
     * @return Model1RadiosRadioProductIdStationsStationIdStatsTotalPlayersGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStatsTotalPlayersGet200Response call1radiosRadioProductIdStationsStationIdStatsTotalPlayersGet(Integer radioProductId, Integer stationId, String from, String to, String streamIds, Boolean withHlsStats) throws RestClientException {
        return call1radiosRadioProductIdStationsStationIdStatsTotalPlayersGetWithHttpInfo(radioProductId, stationId, from, to, streamIds, withHlsStats).getBody();
    }

    /**
     * Get total players
     * This endpoint allows you to retrieve players total stats.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param from  (required)
     * @param to  (required)
     * @param streamIds  (optional)
     * @param withHlsStats  (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStatsTotalPlayersGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStatsTotalPlayersGet200Response> call1radiosRadioProductIdStationsStationIdStatsTotalPlayersGetWithHttpInfo(Integer radioProductId, Integer stationId, String from, String to, String streamIds, Boolean withHlsStats) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdStationsStationIdStatsTotalPlayersGet");
        }
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling call1radiosRadioProductIdStationsStationIdStatsTotalPlayersGet");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling call1radiosRadioProductIdStationsStationIdStatsTotalPlayersGet");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling call1radiosRadioProductIdStationsStationIdStatsTotalPlayersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);
        uriVariables.put("station_id", stationId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "stream_ids", streamIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_hls_stats", withHlsStats));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStatsTotalPlayersGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStatsTotalPlayersGet200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/stations/{station_id}/stats/total_players", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
