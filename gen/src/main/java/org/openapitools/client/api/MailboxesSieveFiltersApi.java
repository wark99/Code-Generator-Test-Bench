package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersDelete400Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersGet200Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersGet400Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersPost400Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersReorderPut400Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsDelete400Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsImportPut400Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsPost400Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersSetActivationPut400Response;
import org.openapitools.client.model.Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPost403Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut404Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut500Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdPut422Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response;
import org.openapitools.client.model.RequestBody34;
import org.openapitools.client.model.RequestBody35;
import org.openapitools.client.model.RequestBody36;
import org.openapitools.client.model.RequestBody37;
import org.openapitools.client.model.RequestBody38;
import org.openapitools.client.model.RequestBody39;
import org.openapitools.client.model.RequestBody40;
import org.openapitools.client.model.RequestBody41;
import org.openapitools.client.model.RequestBody42;
import org.openapitools.client.model.RequestBody43;

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
public class MailboxesSieveFiltersApi {
    private ApiClient apiClient;

    public MailboxesSieveFiltersApi() {
        this(new ApiClient());
    }

    public MailboxesSieveFiltersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete a filter
     * Delete a filter from the given mailbox linked to the current user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody37 Request body of the called URI (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersDelete(Integer mailHostingId, String mailboxName, RequestBody37 requestBody37) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersDeleteWithHttpInfo(mailHostingId, mailboxName, requestBody37).getBody();
    }

    /**
     * Delete a filter
     * Delete a filter from the given mailbox linked to the current user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody37 Request body of the called URI (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersDeleteWithHttpInfo(Integer mailHostingId, String mailboxName, RequestBody37 requestBody37) throws RestClientException {
        Object localVarPostBody = requestBody37;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersDelete");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersDelete");
        }
        
        // verify the required parameter 'requestBody37' is set
        if (requestBody37 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody37' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("mailbox_name", mailboxName);

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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auth/filters", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List filters
     * Retrieve the sieve filters of a given mailbox linked to the current user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid mailbox password
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @return Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersGet(Integer mailHostingId, String mailboxName) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersGetWithHttpInfo(mailHostingId, mailboxName).getBody();
    }

    /**
     * List filters
     * Retrieve the sieve filters of a given mailbox linked to the current user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Invalid mailbox password
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @return ResponseEntity&lt;Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersGet200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersGetWithHttpInfo(Integer mailHostingId, String mailboxName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersGet");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("mailbox_name", mailboxName);

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

        ParameterizedTypeReference<Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersGet200Response> localReturnType = new ParameterizedTypeReference<Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersGet200Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auth/filters", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a filter
     * Update the filter of a given mailbox linked to the current user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody38 Request body of the called URI (required)
     * @return Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersPatch(Integer mailHostingId, String mailboxName, RequestBody38 requestBody38) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersPatchWithHttpInfo(mailHostingId, mailboxName, requestBody38).getBody();
    }

    /**
     * Update a filter
     * Update the filter of a given mailbox linked to the current user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody38 Request body of the called URI (required)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersPatchWithHttpInfo(Integer mailHostingId, String mailboxName, RequestBody38 requestBody38) throws RestClientException {
        Object localVarPostBody = requestBody38;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersPatch");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersPatch");
        }
        
        // verify the required parameter 'requestBody38' is set
        if (requestBody38 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody38' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersPatch");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("mailbox_name", mailboxName);

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

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auth/filters", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add a filter
     * Add a filter to the given mailbox linked to the current user
     * <p><b>201</b> - Created
     * <p><b>400</b> - Sieve load error
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody36 Request body of the called URI (required)
     * @return Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersPost(Integer mailHostingId, String mailboxName, RequestBody36 requestBody36) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersPostWithHttpInfo(mailHostingId, mailboxName, requestBody36).getBody();
    }

    /**
     * Add a filter
     * Add a filter to the given mailbox linked to the current user
     * <p><b>201</b> - Created
     * <p><b>400</b> - Sieve load error
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody36 Request body of the called URI (required)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersPostWithHttpInfo(Integer mailHostingId, String mailboxName, RequestBody36 requestBody36) throws RestClientException {
        Object localVarPostBody = requestBody36;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersPost");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersPost");
        }
        
        // verify the required parameter 'requestBody36' is set
        if (requestBody36 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody36' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("mailbox_name", mailboxName);

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

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auth/filters", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Reorder filters
     * Reorder the filters of a given mailbox linked to the current user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody35 Request body of the called URI (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersReorderPut(Integer mailHostingId, String mailboxName, RequestBody35 requestBody35) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersReorderPutWithHttpInfo(mailHostingId, mailboxName, requestBody35).getBody();
    }

    /**
     * Reorder filters
     * Reorder the filters of a given mailbox linked to the current user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody35 Request body of the called URI (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersReorderPutWithHttpInfo(Integer mailHostingId, String mailboxName, RequestBody35 requestBody35) throws RestClientException {
        Object localVarPostBody = requestBody35;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersReorderPut");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersReorderPut");
        }
        
        // verify the required parameter 'requestBody35' is set
        if (requestBody35 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody35' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersReorderPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("mailbox_name", mailboxName);

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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auth/filters/reorder", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a script
     * Delete a sieve script from the given mailbox linked to the current user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody40 Request body of the called URI (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsDelete(Integer mailHostingId, String mailboxName, RequestBody40 requestBody40) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsDeleteWithHttpInfo(mailHostingId, mailboxName, requestBody40).getBody();
    }

    /**
     * Delete a script
     * Delete a sieve script from the given mailbox linked to the current user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody40 Request body of the called URI (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsDeleteWithHttpInfo(Integer mailHostingId, String mailboxName, RequestBody40 requestBody40) throws RestClientException {
        Object localVarPostBody = requestBody40;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsDelete");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsDelete");
        }
        
        // verify the required parameter 'requestBody40' is set
        if (requestBody40 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody40' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("mailbox_name", mailboxName);

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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auth/filters/scripts", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Import .siv file
     * Import .siv file in a given mailbox linked to the current user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody43 Request body of the called URI (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsImportPut(Integer mailHostingId, String mailboxName, RequestBody43 requestBody43) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsImportPutWithHttpInfo(mailHostingId, mailboxName, requestBody43).getBody();
    }

    /**
     * Import .siv file
     * Import .siv file in a given mailbox linked to the current user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody43 Request body of the called URI (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsImportPutWithHttpInfo(Integer mailHostingId, String mailboxName, RequestBody43 requestBody43) throws RestClientException {
        Object localVarPostBody = requestBody43;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsImportPut");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsImportPut");
        }
        
        // verify the required parameter 'requestBody43' is set
        if (requestBody43 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody43' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsImportPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("mailbox_name", mailboxName);

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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auth/filters/scripts/import", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a script
     * Update a sieve script for a given mailbox linked to the current user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody41 Request body of the called URI (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsPatch(Integer mailHostingId, String mailboxName, RequestBody41 requestBody41) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsPatchWithHttpInfo(mailHostingId, mailboxName, requestBody41).getBody();
    }

    /**
     * Update a script
     * Update a sieve script for a given mailbox linked to the current user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody41 Request body of the called URI (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsPatchWithHttpInfo(Integer mailHostingId, String mailboxName, RequestBody41 requestBody41) throws RestClientException {
        Object localVarPostBody = requestBody41;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsPatch");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsPatch");
        }
        
        // verify the required parameter 'requestBody41' is set
        if (requestBody41 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody41' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsPatch");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("mailbox_name", mailboxName);

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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auth/filters/scripts", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add a script
     * Add a sieve script to a given mailbox linked to the current user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody39 Request body of the called URI (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsPost(Integer mailHostingId, String mailboxName, RequestBody39 requestBody39) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsPostWithHttpInfo(mailHostingId, mailboxName, requestBody39).getBody();
    }

    /**
     * Add a script
     * Add a sieve script to a given mailbox linked to the current user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody39 Request body of the called URI (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsPostWithHttpInfo(Integer mailHostingId, String mailboxName, RequestBody39 requestBody39) throws RestClientException {
        Object localVarPostBody = requestBody39;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsPost");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsPost");
        }
        
        // verify the required parameter 'requestBody39' is set
        if (requestBody39 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody39' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("mailbox_name", mailboxName);

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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auth/filters/scripts", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Enable / disable script
     * Enable / disable a filter script for a given mailbox linked to the current user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody42 Request body of the called URI (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsSetActivationPut(Integer mailHostingId, String mailboxName, RequestBody42 requestBody42) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsSetActivationPutWithHttpInfo(mailHostingId, mailboxName, requestBody42).getBody();
    }

    /**
     * Enable / disable script
     * Enable / disable a filter script for a given mailbox linked to the current user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody42 Request body of the called URI (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsSetActivationPutWithHttpInfo(Integer mailHostingId, String mailboxName, RequestBody42 requestBody42) throws RestClientException {
        Object localVarPostBody = requestBody42;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsSetActivationPut");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsSetActivationPut");
        }
        
        // verify the required parameter 'requestBody42' is set
        if (requestBody42 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody42' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersScriptsSetActivationPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("mailbox_name", mailboxName);

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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auth/filters/scripts/set_activation", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Enable / disable filter
     * Enable or disable the filter of a given mailbox linked to the current user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody34 Request body of the called URI (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersSetActivationPut(Integer mailHostingId, String mailboxName, RequestBody34 requestBody34) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersSetActivationPutWithHttpInfo(mailHostingId, mailboxName, requestBody34).getBody();
    }

    /**
     * Enable / disable filter
     * Enable or disable the filter of a given mailbox linked to the current user
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody34 Request body of the called URI (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersSetActivationPutWithHttpInfo(Integer mailHostingId, String mailboxName, RequestBody34 requestBody34) throws RestClientException {
        Object localVarPostBody = requestBody34;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersSetActivationPut");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersSetActivationPut");
        }
        
        // verify the required parameter 'requestBody34' is set
        if (requestBody34 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody34' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersSetActivationPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("mailbox_name", mailboxName);

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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/auth/filters/set_activation", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
