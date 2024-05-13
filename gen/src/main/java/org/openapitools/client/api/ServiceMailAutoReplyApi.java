package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut400Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut404Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response;
import org.openapitools.client.model.RequestBody27;
import org.openapitools.client.model.RequestBody54;

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
public class ServiceMailAutoReplyApi {
    private ApiClient apiClient;

    public ServiceMailAutoReplyApi() {
        this(new ApiClient());
    }

    public ServiceMailAutoReplyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete auto reply
     * Delete auto reply
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param mailHostingId ServiceMail identifier (required)
     * @param autoReplyId  (required)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdDelete(Integer mailHostingId, Integer autoReplyId) throws RestClientException {
        return call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdDeleteWithHttpInfo(mailHostingId, autoReplyId).getBody();
    }

    /**
     * Delete auto reply
     * Delete auto reply
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param mailHostingId ServiceMail identifier (required)
     * @param autoReplyId  (required)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdDeleteWithHttpInfo(Integer mailHostingId, Integer autoReplyId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdDelete");
        }
        
        // verify the required parameter 'autoReplyId' is set
        if (autoReplyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'autoReplyId' when calling call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("auto_reply_id", autoReplyId);

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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/auto_replies/{auto_reply_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Show a specific auto reply
     * Show a specific auto reply model
     * <p><b>200</b> - OK
     * @param mailHostingId  (required)
     * @param autoReplyId  (required)
     * @return Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdGet(Integer mailHostingId, Integer autoReplyId) throws RestClientException {
        return call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdGetWithHttpInfo(mailHostingId, autoReplyId).getBody();
    }

    /**
     * Show a specific auto reply
     * Show a specific auto reply model
     * <p><b>200</b> - OK
     * @param mailHostingId  (required)
     * @param autoReplyId  (required)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdGetWithHttpInfo(Integer mailHostingId, Integer autoReplyId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdGet");
        }
        
        // verify the required parameter 'autoReplyId' is set
        if (autoReplyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'autoReplyId' when calling call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("auto_reply_id", autoReplyId);

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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/auto_replies/{auto_reply_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update auto reply
     * Update auto reply
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param mailHostingId ServiceMail identifier (required)
     * @param autoReplyId ServiceMailAutoReply identifier (required)
     * @param requestBody54  (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdPatch(Integer mailHostingId, Integer autoReplyId, RequestBody54 requestBody54) throws RestClientException {
        return call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdPatchWithHttpInfo(mailHostingId, autoReplyId, requestBody54).getBody();
    }

    /**
     * Update auto reply
     * Update auto reply
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param mailHostingId ServiceMail identifier (required)
     * @param autoReplyId ServiceMailAutoReply identifier (required)
     * @param requestBody54  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdPatchWithHttpInfo(Integer mailHostingId, Integer autoReplyId, RequestBody54 requestBody54) throws RestClientException {
        Object localVarPostBody = requestBody54;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdPatch");
        }
        
        // verify the required parameter 'autoReplyId' is set
        if (autoReplyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'autoReplyId' when calling call1mailHostingsMailHostingIdAutoRepliesAutoReplyIdPatch");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);
        uriVariables.put("auto_reply_id", autoReplyId);

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
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/auto_replies/{auto_reply_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List auto replies
     * Returns list of auto replies models for given service mail
     * <p><b>200</b> - OK
     * @param mailHostingId ServiceMail identifier (required)
     * @return Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdAutoRepliesGet(Integer mailHostingId) throws RestClientException {
        return call1mailHostingsMailHostingIdAutoRepliesGetWithHttpInfo(mailHostingId).getBody();
    }

    /**
     * List auto replies
     * Returns list of auto replies models for given service mail
     * <p><b>200</b> - OK
     * @param mailHostingId ServiceMail identifier (required)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> call1mailHostingsMailHostingIdAutoRepliesGetWithHttpInfo(Integer mailHostingId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdAutoRepliesGet");
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

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/auto_replies", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create auto reply
     * Create new auto reply for given service mail
     * <p><b>201</b> - Created
     * <p><b>404</b> - Not Found
     * @param mailHostingId ServiceMail identifier (required)
     * @param requestBody27  (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1mailHostingsMailHostingIdAutoRepliesPost(Integer mailHostingId, RequestBody27 requestBody27) throws RestClientException {
        return call1mailHostingsMailHostingIdAutoRepliesPostWithHttpInfo(mailHostingId, requestBody27).getBody();
    }

    /**
     * Create auto reply
     * Create new auto reply for given service mail
     * <p><b>201</b> - Created
     * <p><b>404</b> - Not Found
     * @param mailHostingId ServiceMail identifier (required)
     * @param requestBody27  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1mailHostingsMailHostingIdAutoRepliesPostWithHttpInfo(Integer mailHostingId, RequestBody27 requestBody27) throws RestClientException {
        Object localVarPostBody = requestBody27;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdAutoRepliesPost");
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
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/auto_replies", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
