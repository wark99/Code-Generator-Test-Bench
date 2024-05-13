package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1MailHostingsInvitationsGet200Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesGet200Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameDelete400Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesMailboxNameGet200Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdMailboxesPost201Response;
import org.openapitools.client.model.Model1MailHostingsMailHostingIdUsersGet201Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut400Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut404Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut500Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdPut422Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response;
import org.openapitools.client.model.OneOfstringAnyType;
import org.openapitools.client.model.RequestBody28;
import org.openapitools.client.model.RequestBody55;

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
public class MailboxManagementApi {
    private ApiClient apiClient;

    public MailboxManagementApi() {
        this(new ApiClient());
    }

    public MailboxManagementApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List user invitations
     * Returns a variety of information about one or more user invitations for a given mailbox.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1MailHostingsInvitationsGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1MailHostingsInvitationsGet200Response call1mailHostingsMailHostingIdInvitationsGet(Integer mailHostingId, String with) throws RestClientException {
        return call1mailHostingsMailHostingIdInvitationsGetWithHttpInfo(mailHostingId, with).getBody();
    }

    /**
     * List user invitations
     * Returns a variety of information about one or more user invitations for a given mailbox.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1MailHostingsInvitationsGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1MailHostingsInvitationsGet200Response> call1mailHostingsMailHostingIdInvitationsGetWithHttpInfo(Integer mailHostingId, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdInvitationsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);

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

        ParameterizedTypeReference<Model1MailHostingsInvitationsGet200Response> localReturnType = new ParameterizedTypeReference<Model1MailHostingsInvitationsGet200Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/invitations", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List mailboxes
     * This endpoint allows you to retrieve all the mailboxes for a given mail hosting.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param search  (optional)
     * @param filterBy  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @param _return *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  (optional)
     * @param limit *Optional parameter* that define the number of items to return&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  (optional)
     * @param skip *Optional parameter* that define the index of the first item to return (0 &#x3D; first item)&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  (optional)
     * @param page *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param perPage *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param orderBy *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @param order *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional, default to asc)
     * @param orderFor *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @return Model1MailHostingsMailHostingIdMailboxesGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1MailHostingsMailHostingIdMailboxesGet200Response call1mailHostingsMailHostingIdMailboxesGet(Integer mailHostingId, String search, String filterBy, String with, String _return, Integer limit, Integer skip, Integer page, Integer perPage, OneOfstringAnyType orderBy, String order, Object orderFor) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesGetWithHttpInfo(mailHostingId, search, filterBy, with, _return, limit, skip, page, perPage, orderBy, order, orderFor).getBody();
    }

    /**
     * List mailboxes
     * This endpoint allows you to retrieve all the mailboxes for a given mail hosting.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Unprocessable Entity
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param search  (optional)
     * @param filterBy  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @param _return *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  (optional)
     * @param limit *Optional parameter* that define the number of items to return&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  (optional)
     * @param skip *Optional parameter* that define the index of the first item to return (0 &#x3D; first item)&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  (optional)
     * @param page *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param perPage *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param orderBy *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @param order *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional, default to asc)
     * @param orderFor *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @return ResponseEntity&lt;Model1MailHostingsMailHostingIdMailboxesGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1MailHostingsMailHostingIdMailboxesGet200Response> call1mailHostingsMailHostingIdMailboxesGetWithHttpInfo(Integer mailHostingId, String search, String filterBy, String with, String _return, Integer limit, Integer skip, Integer page, Integer perPage, OneOfstringAnyType orderBy, String order, Object orderFor) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "search", search));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_by", filterBy));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "return", _return));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "skip", skip));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "order_by", orderBy));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "order_for", orderFor));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1MailHostingsMailHostingIdMailboxesGet200Response> localReturnType = new ParameterizedTypeReference<Model1MailHostingsMailHostingIdMailboxesGet200Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a mailbox
     * Deletes a given mailbox.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNameDelete(Integer mailHostingId, String mailboxName) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameDeleteWithHttpInfo(mailHostingId, mailboxName).getBody();
    }

    /**
     * Delete a mailbox
     * Deletes a given mailbox.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameDeleteWithHttpInfo(Integer mailHostingId, String mailboxName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameDelete");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameDelete");
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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Display a mailbox
     * Returns a variety of information about a single a Mailbox specified by the requested unique identifier.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1MailHostingsMailHostingIdMailboxesMailboxNameGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1MailHostingsMailHostingIdMailboxesMailboxNameGet200Response call1mailHostingsMailHostingIdMailboxesMailboxNameGet(Integer mailHostingId, String mailboxName, String with) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNameGetWithHttpInfo(mailHostingId, mailboxName, with).getBody();
    }

    /**
     * Display a mailbox
     * Returns a variety of information about a single a Mailbox specified by the requested unique identifier.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1MailHostingsMailHostingIdMailboxesMailboxNameGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1MailHostingsMailHostingIdMailboxesMailboxNameGet200Response> call1mailHostingsMailHostingIdMailboxesMailboxNameGetWithHttpInfo(Integer mailHostingId, String mailboxName, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameGet");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNameGet");
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

        ParameterizedTypeReference<Model1MailHostingsMailHostingIdMailboxesMailboxNameGet200Response> localReturnType = new ParameterizedTypeReference<Model1MailHostingsMailHostingIdMailboxesMailboxNameGet200Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a mailbox
     * Updates a given mailbox.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody55 Request body of the called URI (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdMailboxesMailboxNamePatch(Integer mailHostingId, String mailboxName, RequestBody55 requestBody55) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesMailboxNamePatchWithHttpInfo(mailHostingId, mailboxName, requestBody55).getBody();
    }

    /**
     * Update a mailbox
     * Updates a given mailbox.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param mailboxName The username (that is the part before the @) of the email address you want to request. (required)
     * @param requestBody55 Request body of the called URI (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdMailboxesMailboxNamePatchWithHttpInfo(Integer mailHostingId, String mailboxName, RequestBody55 requestBody55) throws RestClientException {
        Object localVarPostBody = requestBody55;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesMailboxNamePatch");
        }
        
        // verify the required parameter 'mailboxName' is set
        if (mailboxName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailboxName' when calling call1mailHostingsMailHostingIdMailboxesMailboxNamePatch");
        }
        
        // verify the required parameter 'requestBody55' is set
        if (requestBody55 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody55' when calling call1mailHostingsMailHostingIdMailboxesMailboxNamePatch");
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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes/{mailbox_name}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add a mailbox
     * Creates a new mailbox in the mail hosting.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param requestBody28 Request body of the called URI (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1MailHostingsMailHostingIdMailboxesPost201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1MailHostingsMailHostingIdMailboxesPost201Response call1mailHostingsMailHostingIdMailboxesPost(Integer mailHostingId, RequestBody28 requestBody28, String with) throws RestClientException {
        return call1mailHostingsMailHostingIdMailboxesPostWithHttpInfo(mailHostingId, requestBody28, with).getBody();
    }

    /**
     * Add a mailbox
     * Creates a new mailbox in the mail hosting.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @param requestBody28 Request body of the called URI (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1MailHostingsMailHostingIdMailboxesPost201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1MailHostingsMailHostingIdMailboxesPost201Response> call1mailHostingsMailHostingIdMailboxesPostWithHttpInfo(Integer mailHostingId, RequestBody28 requestBody28, String with) throws RestClientException {
        Object localVarPostBody = requestBody28;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdMailboxesPost");
        }
        
        // verify the required parameter 'requestBody28' is set
        if (requestBody28 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody28' when calling call1mailHostingsMailHostingIdMailboxesPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1MailHostingsMailHostingIdMailboxesPost201Response> localReturnType = new ParameterizedTypeReference<Model1MailHostingsMailHostingIdMailboxesPost201Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/mailboxes", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List users
     * Returns a variety of information about one or more users for a given mailbox.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @return Model1MailHostingsMailHostingIdUsersGet201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1MailHostingsMailHostingIdUsersGet201Response call1mailHostingsMailHostingIdUsersGet(Integer mailHostingId) throws RestClientException {
        return call1mailHostingsMailHostingIdUsersGetWithHttpInfo(mailHostingId).getBody();
    }

    /**
     * List users
     * Returns a variety of information about one or more users for a given mailbox.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param mailHostingId The unique identifier (ID) of the mail hosting to request. (required)
     * @return ResponseEntity&lt;Model1MailHostingsMailHostingIdUsersGet201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1MailHostingsMailHostingIdUsersGet201Response> call1mailHostingsMailHostingIdUsersGetWithHttpInfo(Integer mailHostingId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdUsersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);

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

        ParameterizedTypeReference<Model1MailHostingsMailHostingIdUsersGet201Response> localReturnType = new ParameterizedTypeReference<Model1MailHostingsMailHostingIdUsersGet201Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/users", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
