package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response;
import org.openapitools.client.model.Model1RadiosRadioProductIdStationsStationIdNotificationGetStationIdParameter;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut400Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut404Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdPut422Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response;
import org.openapitools.client.model.RequestBody20;

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
public class NotificationsApi {
    private ApiClient apiClient;

    public NotificationsApi() {
        this(new ApiClient());
    }

    public NotificationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get notification
     * This endpoint allows you to retrieve the notification bind to the radio_product or station if it&#39;s exist.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @return Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response call1radiosRadioProductIdNotificationGet(Integer radioProductId, Model1RadiosRadioProductIdStationsStationIdNotificationGetStationIdParameter stationId) throws RestClientException {
        return call1radiosRadioProductIdNotificationGetWithHttpInfo(radioProductId, stationId).getBody();
    }

    /**
     * Get notification
     * This endpoint allows you to retrieve the notification bind to the radio_product or station if it&#39;s exist.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response> call1radiosRadioProductIdNotificationGetWithHttpInfo(Integer radioProductId, Model1RadiosRadioProductIdStationsStationIdNotificationGetStationIdParameter stationId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdNotificationGet");
        }
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling call1radiosRadioProductIdNotificationGet");
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

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/notification", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update notification radio product
     * This endpoint allows you to update a notification for radio product.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param requestBody20  (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdNotificationPut(Integer radioProductId, RequestBody20 requestBody20) throws RestClientException {
        return call1radiosRadioProductIdNotificationPutWithHttpInfo(radioProductId, requestBody20).getBody();
    }

    /**
     * Update notification radio product
     * This endpoint allows you to update a notification for radio product.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param requestBody20  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1radiosRadioProductIdNotificationPutWithHttpInfo(Integer radioProductId, RequestBody20 requestBody20) throws RestClientException {
        Object localVarPostBody = requestBody20;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdNotificationPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/notification", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get notification
     * This endpoint allows you to retrieve the notification bind to the radio_product or station if it&#39;s exist.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @return Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response call1radiosRadioProductIdStationsStationIdNotificationGet(Integer radioProductId, Model1RadiosRadioProductIdStationsStationIdNotificationGetStationIdParameter stationId) throws RestClientException {
        return call1radiosRadioProductIdStationsStationIdNotificationGetWithHttpInfo(radioProductId, stationId).getBody();
    }

    /**
     * Get notification
     * This endpoint allows you to retrieve the notification bind to the radio_product or station if it&#39;s exist.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response> call1radiosRadioProductIdStationsStationIdNotificationGetWithHttpInfo(Integer radioProductId, Model1RadiosRadioProductIdStationsStationIdNotificationGetStationIdParameter stationId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdStationsStationIdNotificationGet");
        }
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling call1radiosRadioProductIdStationsStationIdNotificationGet");
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

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdNotificationGet200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/stations/{station_id}/notification", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update notification
     * This endpoint allows you to update a notification.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param requestBody20  (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdStationsStationIdNotificationPut(Integer radioProductId, Integer stationId, RequestBody20 requestBody20) throws RestClientException {
        return call1radiosRadioProductIdStationsStationIdNotificationPutWithHttpInfo(radioProductId, stationId, requestBody20).getBody();
    }

    /**
     * Update notification
     * This endpoint allows you to update a notification.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @param stationId The unique identifier (ID) of the station to request. (required)
     * @param requestBody20  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1radiosRadioProductIdStationsStationIdNotificationPutWithHttpInfo(Integer radioProductId, Integer stationId, RequestBody20 requestBody20) throws RestClientException {
        Object localVarPostBody = requestBody20;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdStationsStationIdNotificationPut");
        }
        
        // verify the required parameter 'stationId' is set
        if (stationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stationId' when calling call1radiosRadioProductIdStationsStationIdNotificationPut");
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
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/stations/{station_id}/notification", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
