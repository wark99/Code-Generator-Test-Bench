package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPost403Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut400Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut404Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut500Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response;
import org.openapitools.client.model.Model2ProfileEmailsEmailTypeEmailIdGet200Response;
import org.openapitools.client.model.Model2ProfileEmailsGet200Response;

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
public class EmailsApi {
    private ApiClient apiClient;

    public EmailsApi() {
        this(new ApiClient());
    }

    public EmailsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete an email
     * Delete an email address of the current user&#39;s profile.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param emailType The email type (email|email_request) to request. (required)
     * @param emailId The unique identifier (ID) of the email to request. (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call2profileEmailsEmailTypeEmailIdDelete(String emailType, Integer emailId) throws RestClientException {
        return call2profileEmailsEmailTypeEmailIdDeleteWithHttpInfo(emailType, emailId).getBody();
    }

    /**
     * Delete an email
     * Delete an email address of the current user&#39;s profile.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param emailType The email type (email|email_request) to request. (required)
     * @param emailId The unique identifier (ID) of the email to request. (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call2profileEmailsEmailTypeEmailIdDeleteWithHttpInfo(String emailType, Integer emailId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'emailType' is set
        if (emailType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emailType' when calling call2profileEmailsEmailTypeEmailIdDelete");
        }
        
        // verify the required parameter 'emailId' is set
        if (emailId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emailId' when calling call2profileEmailsEmailTypeEmailIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("email_type", emailType);
        uriVariables.put("email_id", emailId);

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
        return apiClient.invokeAPI("/2/profile/emails/{email_type}/{email_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Display an email
     * Get details of a specific email address of the current user&#39;s profile.
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param emailType The email type (email|email_request) to request. (required)
     * @param emailId The unique identifier (ID) of the email to request. (required)
     * @return Model2ProfileEmailsEmailTypeEmailIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model2ProfileEmailsEmailTypeEmailIdGet200Response call2profileEmailsEmailTypeEmailIdGet(String emailType, Integer emailId) throws RestClientException {
        return call2profileEmailsEmailTypeEmailIdGetWithHttpInfo(emailType, emailId).getBody();
    }

    /**
     * Display an email
     * Get details of a specific email address of the current user&#39;s profile.
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param emailType The email type (email|email_request) to request. (required)
     * @param emailId The unique identifier (ID) of the email to request. (required)
     * @return ResponseEntity&lt;Model2ProfileEmailsEmailTypeEmailIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model2ProfileEmailsEmailTypeEmailIdGet200Response> call2profileEmailsEmailTypeEmailIdGetWithHttpInfo(String emailType, Integer emailId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'emailType' is set
        if (emailType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emailType' when calling call2profileEmailsEmailTypeEmailIdGet");
        }
        
        // verify the required parameter 'emailId' is set
        if (emailId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emailId' when calling call2profileEmailsEmailTypeEmailIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("email_type", emailType);
        uriVariables.put("email_id", emailId);

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

        ParameterizedTypeReference<Model2ProfileEmailsEmailTypeEmailIdGet200Response> localReturnType = new ParameterizedTypeReference<Model2ProfileEmailsEmailTypeEmailIdGet200Response>() {};
        return apiClient.invokeAPI("/2/profile/emails/{email_type}/{email_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List emails
     * Retrieve list of all email addresses of the current user&#39;s profile.
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return Model2ProfileEmailsGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model2ProfileEmailsGet200Response call2profileEmailsGet() throws RestClientException {
        return call2profileEmailsGetWithHttpInfo().getBody();
    }

    /**
     * List emails
     * Retrieve list of all email addresses of the current user&#39;s profile.
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return ResponseEntity&lt;Model2ProfileEmailsGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model2ProfileEmailsGet200Response> call2profileEmailsGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<Model2ProfileEmailsGet200Response> localReturnType = new ParameterizedTypeReference<Model2ProfileEmailsGet200Response>() {};
        return apiClient.invokeAPI("/2/profile/emails", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
