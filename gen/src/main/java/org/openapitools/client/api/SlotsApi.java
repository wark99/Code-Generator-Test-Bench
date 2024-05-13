package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPost403Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut400Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut404Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut500Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdSlotsGet200Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdSlotsPost201Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdSlotsSlotIdDelete200Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response;
import org.openapitools.client.model.RequestBody1;
import org.openapitools.client.model.RequestBody3;

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
public class SlotsApi {
    private ApiClient apiClient;

    public SlotsApi() {
        this(new ApiClient());
    }

    public SlotsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List all slots
     * Get all slots for the given Swiss Backup product
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param swissBackupId Unique identifier of the Swiss Backup to request. (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsGet200Response call1swissBackupsSwissBackupIdSlotsGet(Integer swissBackupId) throws RestClientException {
        return call1swissBackupsSwissBackupIdSlotsGetWithHttpInfo(swissBackupId).getBody();
    }

    /**
     * List all slots
     * Get all slots for the given Swiss Backup product
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param swissBackupId Unique identifier of the Swiss Backup to request. (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsGet200Response> call1swissBackupsSwissBackupIdSlotsGetWithHttpInfo(Integer swissBackupId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'swissBackupId' is set
        if (swissBackupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'swissBackupId' when calling call1swissBackupsSwissBackupIdSlotsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("swiss_backup_id", swissBackupId);

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

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsGet200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsGet200Response>() {};
        return apiClient.invokeAPI("/1/swiss_backups/{swiss_backup_id}/slots", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create
     * Create a new slot via a job, for the given Swiss Backup
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param swissBackupId Unique identifier of the Swiss Backup to request. (required)
     * @param requestBody1  (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsPost201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsPost201Response call1swissBackupsSwissBackupIdSlotsPost(Integer swissBackupId, RequestBody1 requestBody1) throws RestClientException {
        return call1swissBackupsSwissBackupIdSlotsPostWithHttpInfo(swissBackupId, requestBody1).getBody();
    }

    /**
     * Create
     * Create a new slot via a job, for the given Swiss Backup
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param swissBackupId Unique identifier of the Swiss Backup to request. (required)
     * @param requestBody1  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsPost201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsPost201Response> call1swissBackupsSwissBackupIdSlotsPostWithHttpInfo(Integer swissBackupId, RequestBody1 requestBody1) throws RestClientException {
        Object localVarPostBody = requestBody1;
        
        // verify the required parameter 'swissBackupId' is set
        if (swissBackupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'swissBackupId' when calling call1swissBackupsSwissBackupIdSlotsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("swiss_backup_id", swissBackupId);

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

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsPost201Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsPost201Response>() {};
        return apiClient.invokeAPI("/1/swiss_backups/{swiss_backup_id}/slots", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete
     * Delete a slot for the given Swiss Backup
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param swissBackupId Unique identifier of the Swiss Backup to request. (required)
     * @param slotId Unique identifier of the Slot to request. (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDelete200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDelete200Response call1swissBackupsSwissBackupIdSlotsSlotIdDelete(Integer swissBackupId, Integer slotId) throws RestClientException {
        return call1swissBackupsSwissBackupIdSlotsSlotIdDeleteWithHttpInfo(swissBackupId, slotId).getBody();
    }

    /**
     * Delete
     * Delete a slot for the given Swiss Backup
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param swissBackupId Unique identifier of the Swiss Backup to request. (required)
     * @param slotId Unique identifier of the Slot to request. (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDelete200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDelete200Response> call1swissBackupsSwissBackupIdSlotsSlotIdDeleteWithHttpInfo(Integer swissBackupId, Integer slotId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'swissBackupId' is set
        if (swissBackupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'swissBackupId' when calling call1swissBackupsSwissBackupIdSlotsSlotIdDelete");
        }
        
        // verify the required parameter 'slotId' is set
        if (slotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'slotId' when calling call1swissBackupsSwissBackupIdSlotsSlotIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("swiss_backup_id", swissBackupId);
        uriVariables.put("slot_id", slotId);

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

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDelete200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDelete200Response>() {};
        return apiClient.invokeAPI("/1/swiss_backups/{swiss_backup_id}/slots/{slot_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Disable
     * Disable a slot via a job, for the given Swiss Backup
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param swissBackupId Unique identifier of the Swiss Backup to request. (required)
     * @param slotId Unique identifier of the Slot to request. (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1swissBackupsSwissBackupIdSlotsSlotIdDisablePost(Integer swissBackupId, Integer slotId) throws RestClientException {
        return call1swissBackupsSwissBackupIdSlotsSlotIdDisablePostWithHttpInfo(swissBackupId, slotId).getBody();
    }

    /**
     * Disable
     * Disable a slot via a job, for the given Swiss Backup
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param swissBackupId Unique identifier of the Swiss Backup to request. (required)
     * @param slotId Unique identifier of the Slot to request. (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1swissBackupsSwissBackupIdSlotsSlotIdDisablePostWithHttpInfo(Integer swissBackupId, Integer slotId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'swissBackupId' is set
        if (swissBackupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'swissBackupId' when calling call1swissBackupsSwissBackupIdSlotsSlotIdDisablePost");
        }
        
        // verify the required parameter 'slotId' is set
        if (slotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'slotId' when calling call1swissBackupsSwissBackupIdSlotsSlotIdDisablePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("swiss_backup_id", swissBackupId);
        uriVariables.put("slot_id", slotId);

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

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response>() {};
        return apiClient.invokeAPI("/1/swiss_backups/{swiss_backup_id}/slots/{slot_id}/disable", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Enable
     * Enable a slot via a job, for the given Swiss Backup
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param swissBackupId Unique identifier of the Swiss Backup to request. (required)
     * @param slotId Unique identifier of the Slot to request. (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1swissBackupsSwissBackupIdSlotsSlotIdEnablePost(Integer swissBackupId, Integer slotId) throws RestClientException {
        return call1swissBackupsSwissBackupIdSlotsSlotIdEnablePostWithHttpInfo(swissBackupId, slotId).getBody();
    }

    /**
     * Enable
     * Enable a slot via a job, for the given Swiss Backup
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param swissBackupId Unique identifier of the Swiss Backup to request. (required)
     * @param slotId Unique identifier of the Slot to request. (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1swissBackupsSwissBackupIdSlotsSlotIdEnablePostWithHttpInfo(Integer swissBackupId, Integer slotId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'swissBackupId' is set
        if (swissBackupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'swissBackupId' when calling call1swissBackupsSwissBackupIdSlotsSlotIdEnablePost");
        }
        
        // verify the required parameter 'slotId' is set
        if (slotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'slotId' when calling call1swissBackupsSwissBackupIdSlotsSlotIdEnablePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("swiss_backup_id", swissBackupId);
        uriVariables.put("slot_id", slotId);

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

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response>() {};
        return apiClient.invokeAPI("/1/swiss_backups/{swiss_backup_id}/slots/{slot_id}/enable", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Slot information
     * Get more details about the given slot
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param swissBackupId Unique identifier of the Swiss Backup to request. (required)
     * @param slotId Unique identifier of the Slot to request. (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsPost201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsPost201Response call1swissBackupsSwissBackupIdSlotsSlotIdGet(Integer swissBackupId, Integer slotId) throws RestClientException {
        return call1swissBackupsSwissBackupIdSlotsSlotIdGetWithHttpInfo(swissBackupId, slotId).getBody();
    }

    /**
     * Slot information
     * Get more details about the given slot
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param swissBackupId Unique identifier of the Swiss Backup to request. (required)
     * @param slotId Unique identifier of the Slot to request. (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsPost201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsPost201Response> call1swissBackupsSwissBackupIdSlotsSlotIdGetWithHttpInfo(Integer swissBackupId, Integer slotId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'swissBackupId' is set
        if (swissBackupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'swissBackupId' when calling call1swissBackupsSwissBackupIdSlotsSlotIdGet");
        }
        
        // verify the required parameter 'slotId' is set
        if (slotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'slotId' when calling call1swissBackupsSwissBackupIdSlotsSlotIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("swiss_backup_id", swissBackupId);
        uriVariables.put("slot_id", slotId);

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

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsPost201Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsPost201Response>() {};
        return apiClient.invokeAPI("/1/swiss_backups/{swiss_backup_id}/slots/{slot_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update
     * Update a slot via a job, for the given Swiss Backup
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param swissBackupId Unique identifier of the Swiss Backup to request. (required)
     * @param slotId Unique identifier of the Slot to request. (required)
     * @param requestBody3  (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsPost201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsPost201Response call1swissBackupsSwissBackupIdSlotsSlotIdPut(Integer swissBackupId, Integer slotId, RequestBody3 requestBody3) throws RestClientException {
        return call1swissBackupsSwissBackupIdSlotsSlotIdPutWithHttpInfo(swissBackupId, slotId, requestBody3).getBody();
    }

    /**
     * Update
     * Update a slot via a job, for the given Swiss Backup
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param swissBackupId Unique identifier of the Swiss Backup to request. (required)
     * @param slotId Unique identifier of the Slot to request. (required)
     * @param requestBody3  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsPost201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsPost201Response> call1swissBackupsSwissBackupIdSlotsSlotIdPutWithHttpInfo(Integer swissBackupId, Integer slotId, RequestBody3 requestBody3) throws RestClientException {
        Object localVarPostBody = requestBody3;
        
        // verify the required parameter 'swissBackupId' is set
        if (swissBackupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'swissBackupId' when calling call1swissBackupsSwissBackupIdSlotsSlotIdPut");
        }
        
        // verify the required parameter 'slotId' is set
        if (slotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'slotId' when calling call1swissBackupsSwissBackupIdSlotsSlotIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("swiss_backup_id", swissBackupId);
        uriVariables.put("slot_id", slotId);

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

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsPost201Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsPost201Response>() {};
        return apiClient.invokeAPI("/1/swiss_backups/{swiss_backup_id}/slots/{slot_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * RClone details
     * Get RClone details about the given slot
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param swissBackupId Unique identifier of the Swiss Backup to request. (required)
     * @param slotId Unique identifier of the Slot to request. (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object call1swissBackupsSwissBackupIdSlotsSlotIdRcloneGet(Integer swissBackupId, Integer slotId) throws RestClientException {
        return call1swissBackupsSwissBackupIdSlotsSlotIdRcloneGetWithHttpInfo(swissBackupId, slotId).getBody();
    }

    /**
     * RClone details
     * Get RClone details about the given slot
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param swissBackupId Unique identifier of the Swiss Backup to request. (required)
     * @param slotId Unique identifier of the Slot to request. (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> call1swissBackupsSwissBackupIdSlotsSlotIdRcloneGetWithHttpInfo(Integer swissBackupId, Integer slotId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'swissBackupId' is set
        if (swissBackupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'swissBackupId' when calling call1swissBackupsSwissBackupIdSlotsSlotIdRcloneGet");
        }
        
        // verify the required parameter 'slotId' is set
        if (slotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'slotId' when calling call1swissBackupsSwissBackupIdSlotsSlotIdRcloneGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("swiss_backup_id", swissBackupId);
        uriVariables.put("slot_id", slotId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/plain", "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/1/swiss_backups/{swiss_backup_id}/slots/{slot_id}/rclone", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
