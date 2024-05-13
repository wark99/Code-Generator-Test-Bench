package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPost403Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut200Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut400Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut404Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut500Response;
import org.openapitools.client.model.RequestBody;

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
public class AdministratorApi {
    private ApiClient apiClient;

    public AdministratorApi() {
        this(new ApiClient());
    }

    public AdministratorApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create administrator
     * Create an Acronis administrator
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * @param swissBackupId  (required)
     * @param requestBody  (optional)
     * @return Model1SwissBackupsSwissBackupIdAdminPut200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdAdminPut200Response call1swissBackupsSwissBackupIdAdminPost(Integer swissBackupId, RequestBody requestBody) throws RestClientException {
        return call1swissBackupsSwissBackupIdAdminPostWithHttpInfo(swissBackupId, requestBody).getBody();
    }

    /**
     * Create administrator
     * Create an Acronis administrator
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * @param swissBackupId  (required)
     * @param requestBody  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdAdminPut200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdAdminPut200Response> call1swissBackupsSwissBackupIdAdminPostWithHttpInfo(Integer swissBackupId, RequestBody requestBody) throws RestClientException {
        Object localVarPostBody = requestBody;
        
        // verify the required parameter 'swissBackupId' is set
        if (swissBackupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'swissBackupId' when calling call1swissBackupsSwissBackupIdAdminPost");
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

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdAdminPut200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdAdminPut200Response>() {};
        return apiClient.invokeAPI("/1/swiss_backups/{swiss_backup_id}/admin", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update administrator
     * Update the email address for the Acronis administrator user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param swissBackupId  (required)
     * @param requestBody  (optional)
     * @return Model1SwissBackupsSwissBackupIdAdminPut200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdAdminPut200Response call1swissBackupsSwissBackupIdAdminPut(Integer swissBackupId, RequestBody requestBody) throws RestClientException {
        return call1swissBackupsSwissBackupIdAdminPutWithHttpInfo(swissBackupId, requestBody).getBody();
    }

    /**
     * Update administrator
     * Update the email address for the Acronis administrator user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param swissBackupId  (required)
     * @param requestBody  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdAdminPut200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdAdminPut200Response> call1swissBackupsSwissBackupIdAdminPutWithHttpInfo(Integer swissBackupId, RequestBody requestBody) throws RestClientException {
        Object localVarPostBody = requestBody;
        
        // verify the required parameter 'swissBackupId' is set
        if (swissBackupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'swissBackupId' when calling call1swissBackupsSwissBackupIdAdminPut");
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

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdAdminPut200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdAdminPut200Response>() {};
        return apiClient.invokeAPI("/1/swiss_backups/{swiss_backup_id}/admin", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
