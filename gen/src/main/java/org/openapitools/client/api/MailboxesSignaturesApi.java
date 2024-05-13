package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesGet200Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDelete400Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet200Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet400Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdPatch400Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdSignaturesUploadPost201Response;
import org.openapitools.client.model.Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPost403Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut400Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut404Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut500Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdPut422Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response;
import org.openapitools.client.model.RequestBody45;
import org.openapitools.client.model.RequestBody46;
import org.openapitools.client.model.RequestBody56;

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
public class MailboxesSignaturesApi {
    private ApiClient apiClient;

    public MailboxesSignaturesApi() {
        this(new ApiClient());
    }

    public MailboxesSignaturesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List signatures
     * Get a list of selected Mailbox Signatures.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesGet(Integer mailHostingId, String mailboxName, String with) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesGetWithHttpInfo(mailHostingId, mailboxName, with).getBody();
    }

    /**
     * List signatures
     * Get a list of selected Mailbox Signatures.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesGet200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesGetWithHttpInfo(Integer mailHostingId, String mailboxName, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesGet");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("mailbox_name", mailboxName);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesGet200Response> localReturnType = new ParameterizedTypeReference<Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesGet200Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/signatures", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List signatures
     * Returns list of signature models for given service mail
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param mailHostingId ServiceMail identifier (required)
     * @param mailboxName  (required)
     * @return Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesModelsGet(Integer mailHostingId, String mailboxName) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesModelsGetWithHttpInfo(mailHostingId, mailboxName).getBody();
    }

    /**
     * List signatures
     * Returns list of signature models for given service mail
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param mailHostingId ServiceMail identifier (required)
     * @param mailboxName  (required)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesModelsGetWithHttpInfo(Integer mailHostingId, String mailboxName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesModelsGet");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesModelsGet");
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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/signatures/models", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add a signature
     * Create a new signature for the given mailbox.
     * <p><b>201</b> - Created
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody46 Request body of the called URI (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesPost(Integer mailHostingId, String mailboxName, RequestBody46 requestBody46) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesPostWithHttpInfo(mailHostingId, mailboxName, requestBody46).getBody();
    }

    /**
     * Add a signature
     * Create a new signature for the given mailbox.
     * <p><b>201</b> - Created
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody46 Request body of the called URI (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesPostWithHttpInfo(Integer mailHostingId, String mailboxName, RequestBody46 requestBody46) throws RestClientException {
        Object localVarPostBody = requestBody46;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesPost");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesPost");
        }
        
        // verify the required parameter 'requestBody46' is set
        if (requestBody46 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody46' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesPost");
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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/signatures", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Set a signature as default
     * Sets the given signature as the default one.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param signatureId The unique identifier (ID) of the signature to request. (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDefaultPut(Integer mailHostingId, String mailboxName, Integer signatureId) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDefaultPutWithHttpInfo(mailHostingId, mailboxName, signatureId).getBody();
    }

    /**
     * Set a signature as default
     * Sets the given signature as the default one.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param signatureId The unique identifier (ID) of the signature to request. (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDefaultPutWithHttpInfo(Integer mailHostingId, String mailboxName, Integer signatureId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDefaultPut");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDefaultPut");
        }
        
        // verify the required parameter 'signatureId' is set
        if (signatureId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'signatureId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDefaultPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("mailbox_name", mailboxName);
        uriVariables.put("signature_id", signatureId);

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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/signatures/{signature_id}/default", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a signature
     * Deletes the given mailbox signature.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param signatureId The unique identifier (ID) of the signature to request. (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDelete(Integer mailHostingId, String mailboxName, Integer signatureId) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDeleteWithHttpInfo(mailHostingId, mailboxName, signatureId).getBody();
    }

    /**
     * Delete a signature
     * Deletes the given mailbox signature.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param signatureId The unique identifier (ID) of the signature to request. (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDeleteWithHttpInfo(Integer mailHostingId, String mailboxName, Integer signatureId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDelete");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDelete");
        }
        
        // verify the required parameter 'signatureId' is set
        if (signatureId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'signatureId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("mailbox_name", mailboxName);
        uriVariables.put("signature_id", signatureId);

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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/signatures/{signature_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Display a signature
     * Retrieves information about a given signature
     * <p><b>200</b> - OK
     * <p><b>400</b> - Signature does not exist
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param signatureId The unique identifier (ID) of the signature to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet(Integer mailHostingId, String mailboxName, Integer signatureId, String with) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGetWithHttpInfo(mailHostingId, mailboxName, signatureId, with).getBody();
    }

    /**
     * Display a signature
     * Retrieves information about a given signature
     * <p><b>200</b> - OK
     * <p><b>400</b> - Signature does not exist
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param signatureId The unique identifier (ID) of the signature to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGetWithHttpInfo(Integer mailHostingId, String mailboxName, Integer signatureId, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet");
        }
        
        // verify the required parameter 'signatureId' is set
        if (signatureId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'signatureId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("mailbox_name", mailboxName);
        uriVariables.put("signature_id", signatureId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet200Response> localReturnType = new ParameterizedTypeReference<Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdGet200Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/signatures/{signature_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a signature
     * Updates a given mailbox signature.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param signatureId The unique identifier (ID) of the signature to request. (required)
     * @param requestBody56 Request body of the called URI (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdPatch(Integer mailHostingId, String mailboxName, Integer signatureId, RequestBody56 requestBody56) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdPatchWithHttpInfo(mailHostingId, mailboxName, signatureId, requestBody56).getBody();
    }

    /**
     * Update a signature
     * Updates a given mailbox signature.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param signatureId The unique identifier (ID) of the signature to request. (required)
     * @param requestBody56 Request body of the called URI (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdPatchWithHttpInfo(Integer mailHostingId, String mailboxName, Integer signatureId, RequestBody56 requestBody56) throws RestClientException {
        Object localVarPostBody = requestBody56;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdPatch");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdPatch");
        }
        
        // verify the required parameter 'signatureId' is set
        if (signatureId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'signatureId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdPatch");
        }
        
        // verify the required parameter 'requestBody56' is set
        if (requestBody56 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody56' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdPatch");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("mailbox_name", mailboxName);
        uriVariables.put("signature_id", signatureId);

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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/signatures/{signature_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Upload an image
     * Upload an image.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody45 Request body of the called URI (required)
     * @return Model1MailHostingsMailHostingIdSignaturesUploadPost201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1MailHostingsMailHostingIdSignaturesUploadPost201Response call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesUploadPost(Integer mailHostingId, String mailboxName, RequestBody45 requestBody45) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesUploadPostWithHttpInfo(mailHostingId, mailboxName, requestBody45).getBody();
    }

    /**
     * Upload an image
     * Upload an image.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody45 Request body of the called URI (required)
     * @return ResponseEntity&lt;Model1MailHostingsMailHostingIdSignaturesUploadPost201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1MailHostingsMailHostingIdSignaturesUploadPost201Response> call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesUploadPostWithHttpInfo(Integer mailHostingId, String mailboxName, RequestBody45 requestBody45) throws RestClientException {
        Object localVarPostBody = requestBody45;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesUploadPost");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesUploadPost");
        }
        
        // verify the required parameter 'requestBody45' is set
        if (requestBody45 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody45' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameSignaturesUploadPost");
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

        ParameterizedTypeReference<Model1MailHostingsMailHostingIdSignaturesUploadPost201Response> localReturnType = new ParameterizedTypeReference<Model1MailHostingsMailHostingIdSignaturesUploadPost201Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/signatures/upload", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
