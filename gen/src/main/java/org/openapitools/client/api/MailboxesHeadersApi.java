package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesCheckVerifiedPost400Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationLinkPut400Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationPut400Response;
import org.openapitools.client.model.Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPost403Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut400Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut404Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut500Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdPut422Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response;
import org.openapitools.client.model.RequestBody60;
import org.openapitools.client.model.RequestBody61;

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
public class MailboxesHeadersApi {
    private ApiClient apiClient;

    public MailboxesHeadersApi() {
        this(new ApiClient());
    }

    public MailboxesHeadersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Check if email is already validated
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Email not validated
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId  (required)
     * @param mailboxName  (required)
     * @return Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesCheckVerifiedPost(Integer mailHostingId, String mailboxName) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesCheckVerifiedPostWithHttpInfo(mailHostingId, mailboxName).getBody();
    }

    /**
     * Check if email is already validated
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Email not validated
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId  (required)
     * @param mailboxName  (required)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesCheckVerifiedPostWithHttpInfo(Integer mailHostingId, String mailboxName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesCheckVerifiedPost");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesCheckVerifiedPost");
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

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/headers/addresses/check_verified", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List headers
     * Returns a variety of information about one or more headers of a given mailbox.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @return Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet(Integer mailHostingId, String mailboxName) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGetWithHttpInfo(mailHostingId, mailboxName).getBody();
    }

    /**
     * List headers
     * Returns a variety of information about one or more headers of a given mailbox.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @return ResponseEntity&lt;Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGetWithHttpInfo(Integer mailHostingId, String mailboxName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet");
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

        ParameterizedTypeReference<Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response> localReturnType = new ParameterizedTypeReference<Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/headers/addresses", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Send validation email with link
     * Send validation email with link when adding a new sender/reply address.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Sender reply address already validated
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody60 Request body of the called URI (required)
     * @return Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationLinkPut(Integer mailHostingId, String mailboxName, RequestBody60 requestBody60) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationLinkPutWithHttpInfo(mailHostingId, mailboxName, requestBody60).getBody();
    }

    /**
     * Send validation email with link
     * Send validation email with link when adding a new sender/reply address.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Sender reply address already validated
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody60 Request body of the called URI (required)
     * @return ResponseEntity&lt;Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationLinkPutWithHttpInfo(Integer mailHostingId, String mailboxName, RequestBody60 requestBody60) throws RestClientException {
        Object localVarPostBody = requestBody60;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationLinkPut");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationLinkPut");
        }
        
        // verify the required parameter 'requestBody60' is set
        if (requestBody60 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody60' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationLinkPut");
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

        ParameterizedTypeReference<Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response> localReturnType = new ParameterizedTypeReference<Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesGet200Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/headers/addresses/send_validation_link", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Send validation email with code
     * Send validation email with code when adding a new sender/reply address.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody60 Request body of the called URI (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationPut(Integer mailHostingId, String mailboxName, RequestBody60 requestBody60) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationPutWithHttpInfo(mailHostingId, mailboxName, requestBody60).getBody();
    }

    /**
     * Send validation email with code
     * Send validation email with code when adding a new sender/reply address.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody60 Request body of the called URI (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationPutWithHttpInfo(Integer mailHostingId, String mailboxName, RequestBody60 requestBody60) throws RestClientException {
        Object localVarPostBody = requestBody60;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationPut");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationPut");
        }
        
        // verify the required parameter 'requestBody60' is set
        if (requestBody60 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody60' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationPut");
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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/headers/addresses/send_validation", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Validate a sender
     * Validate a new sender/reply address.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody61 Request body of the called URI (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesValidatePut(Integer mailHostingId, String mailboxName, RequestBody61 requestBody61) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesValidatePutWithHttpInfo(mailHostingId, mailboxName, requestBody61).getBody();
    }

    /**
     * Validate a sender
     * Validate a new sender/reply address.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody61 Request body of the called URI (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesValidatePutWithHttpInfo(Integer mailHostingId, String mailboxName, RequestBody61 requestBody61) throws RestClientException {
        Object localVarPostBody = requestBody61;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesValidatePut");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesValidatePut");
        }
        
        // verify the required parameter 'requestBody61' is set
        if (requestBody61 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody61' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesValidatePut");
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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/headers/addresses/validate", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a sender
     * Delete a sender/reply address.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param verifiedEmailId sender/reply address to remove (verified_email identifier) (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesVerifiedEmailIdDelete(Integer mailHostingId, String mailboxName, Integer verifiedEmailId) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesVerifiedEmailIdDeleteWithHttpInfo(mailHostingId, mailboxName, verifiedEmailId).getBody();
    }

    /**
     * Delete a sender
     * Delete a sender/reply address.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param verifiedEmailId sender/reply address to remove (verified_email identifier) (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesVerifiedEmailIdDeleteWithHttpInfo(Integer mailHostingId, String mailboxName, Integer verifiedEmailId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesVerifiedEmailIdDelete");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesVerifiedEmailIdDelete");
        }
        
        // verify the required parameter 'verifiedEmailId' is set
        if (verifiedEmailId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'verifiedEmailId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesVerifiedEmailIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("mailbox_name", mailboxName);
        uriVariables.put("verified_email_id", verifiedEmailId);

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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/headers/addresses/{verified_email_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
