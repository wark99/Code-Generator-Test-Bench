package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGet200Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPatch400Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost201Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost400Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesRedirectAddressesDelete400Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut400Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut404Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut500Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdPut422Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response;
import org.openapitools.client.model.RequestBody47;
import org.openapitools.client.model.RequestBody48;

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
public class MailboxesForwardingApi {
    private ApiClient apiClient;

    public MailboxesForwardingApi() {
        this(new ApiClient());
    }

    public MailboxesForwardingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete all forwardings
     * Deletes all configured forwarding addresses of the given mailbox.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesDelete(Integer mailHostingId, String mailboxName) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesDeleteWithHttpInfo(mailHostingId, mailboxName).getBody();
    }

    /**
     * Delete all forwardings
     * Deletes all configured forwarding addresses of the given mailbox.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesDeleteWithHttpInfo(Integer mailHostingId, String mailboxName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesDelete");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesDelete");
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

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/forwarding_addresses", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List forwarding
     * Retrieves information about the forwarding configuration of a given mailbox.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @return Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGet(Integer mailHostingId, String mailboxName) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGetWithHttpInfo(mailHostingId, mailboxName).getBody();
    }

    /**
     * List forwarding
     * Retrieves information about the forwarding configuration of a given mailbox.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @return ResponseEntity&lt;Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGet200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGetWithHttpInfo(Integer mailHostingId, String mailboxName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGet");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGet");
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

        ParameterizedTypeReference<Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGet200Response> localReturnType = new ParameterizedTypeReference<Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesGet200Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/forwarding_addresses", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a forwarding
     * Update a given mailbox forwarding.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody48 Request body of the called URI (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPatch(Integer mailHostingId, String mailboxName, RequestBody48 requestBody48) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPatchWithHttpInfo(mailHostingId, mailboxName, requestBody48).getBody();
    }

    /**
     * Update a forwarding
     * Update a given mailbox forwarding.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody48 Request body of the called URI (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPatchWithHttpInfo(Integer mailHostingId, String mailboxName, RequestBody48 requestBody48) throws RestClientException {
        Object localVarPostBody = requestBody48;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPatch");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPatch");
        }
        
        // verify the required parameter 'requestBody48' is set
        if (requestBody48 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody48' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPatch");
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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/forwarding_addresses", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add a forwarding
     * Adds a new forwarding address to the given mailbox
     * <p><b>201</b> - Created
     * <p><b>400</b> - Too much redirections
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody47 Request body of the called URI (required)
     * @return Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost201Response call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost(Integer mailHostingId, String mailboxName, RequestBody47 requestBody47) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPostWithHttpInfo(mailHostingId, mailboxName, requestBody47).getBody();
    }

    /**
     * Add a forwarding
     * Adds a new forwarding address to the given mailbox
     * <p><b>201</b> - Created
     * <p><b>400</b> - Too much redirections
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody47 Request body of the called URI (required)
     * @return ResponseEntity&lt;Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost201Response> call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPostWithHttpInfo(Integer mailHostingId, String mailboxName, RequestBody47 requestBody47) throws RestClientException {
        Object localVarPostBody = requestBody47;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost");
        }
        
        // verify the required parameter 'requestBody47' is set
        if (requestBody47 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody47' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost");
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

        ParameterizedTypeReference<Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost201Response> localReturnType = new ParameterizedTypeReference<Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost201Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/forwarding_addresses", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a forwarding
     * Deletes the given forwarding address from the given mailbox.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param redirectAddresses  (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesRedirectAddressesDelete(Integer mailHostingId, String mailboxName, String redirectAddresses) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesRedirectAddressesDeleteWithHttpInfo(mailHostingId, mailboxName, redirectAddresses).getBody();
    }

    /**
     * Delete a forwarding
     * Deletes the given forwarding address from the given mailbox.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param redirectAddresses  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesRedirectAddressesDeleteWithHttpInfo(Integer mailHostingId, String mailboxName, String redirectAddresses) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesRedirectAddressesDelete");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesRedirectAddressesDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("mailbox_name", mailboxName);
        uriVariables.put("redirect_addresses", redirectAddresses);

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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}/forwarding_addresses/{redirect_addresses}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
