package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPost403Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut400Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut404Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut500Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response;

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
public class PasswordsApi {
    private ApiClient apiClient;

    public PasswordsApi() {
        this(new ApiClient());
    }

    public PasswordsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Request administrator password
     * Get a new token or send an email, to change the Acronis administrator password
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param swissBackupId Unique identifier of the Swiss Backup to request. (required)
     * @return Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response call1swissBackupsSwissBackupIdAdminRequestPasswordPost(Integer swissBackupId) throws RestClientException {
        return call1swissBackupsSwissBackupIdAdminRequestPasswordPostWithHttpInfo(swissBackupId).getBody();
    }

    /**
     * Request administrator password
     * Get a new token or send an email, to change the Acronis administrator password
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param swissBackupId Unique identifier of the Swiss Backup to request. (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response> call1swissBackupsSwissBackupIdAdminRequestPasswordPostWithHttpInfo(Integer swissBackupId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'swissBackupId' is set
        if (swissBackupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'swissBackupId' when calling call1swissBackupsSwissBackupIdAdminRequestPasswordPost");
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

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response>() {};
        return apiClient.invokeAPI("/1/swiss_backups/{swiss_backup_id}/admin/request_password", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Request slot password
     * Get a new token or send the email, to change the password for a slot
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param swissBackupId Unique identifier of the Swiss Backup to request. (required)
     * @param slotId Unique identifier of the Slot to request. (required)
     * @return Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response call1swissBackupsSwissBackupIdSlotsSlotIdRequestPasswordPost(Integer swissBackupId, Integer slotId) throws RestClientException {
        return call1swissBackupsSwissBackupIdSlotsSlotIdRequestPasswordPostWithHttpInfo(swissBackupId, slotId).getBody();
    }

    /**
     * Request slot password
     * Get a new token or send the email, to change the password for a slot
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param swissBackupId Unique identifier of the Swiss Backup to request. (required)
     * @param slotId Unique identifier of the Slot to request. (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response> call1swissBackupsSwissBackupIdSlotsSlotIdRequestPasswordPostWithHttpInfo(Integer swissBackupId, Integer slotId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'swissBackupId' is set
        if (swissBackupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'swissBackupId' when calling call1swissBackupsSwissBackupIdSlotsSlotIdRequestPasswordPost");
        }
        
        // verify the required parameter 'slotId' is set
        if (slotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'slotId' when calling call1swissBackupsSwissBackupIdSlotsSlotIdRequestPasswordPost");
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

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdAdminRequestPasswordPost200Response>() {};
        return apiClient.invokeAPI("/1/swiss_backups/{swiss_backup_id}/slots/{slot_id}/request_password", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
