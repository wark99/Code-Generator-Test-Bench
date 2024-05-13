package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiError;
import org.openapitools.client.model.AppError;
import org.openapitools.client.model.CreateIncomingWebhookRequest;
import org.openapitools.client.model.CreateOutgoingWebhookRequest;
import org.openapitools.client.model.IncomingWebhook;
import org.openapitools.client.model.OutgoingWebhook;
import org.openapitools.client.model.StatusOK;
import org.openapitools.client.model.UpdateIncomingWebhookRequest;
import org.openapitools.client.model.UpdateOutgoingWebhookRequest;

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
public class WebhooksApi {
    private ApiClient apiClient;

    public WebhooksApi() {
        this(new ApiClient());
    }

    public WebhooksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create an incoming webhook
     * Create an incoming webhook for a channel. ##### Permissions &#x60;manage_webhooks&#x60; for the team the webhook is in.  &#x60;manage_others_incoming_webhooks&#x60; for the team the webhook is in if the user is different than the requester. 
     * <p><b>201</b> - Incoming webhook creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param createIncomingWebhookRequest Incoming webhook to be created (required)
     * @return IncomingWebhook
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IncomingWebhook createIncomingWebhook(CreateIncomingWebhookRequest createIncomingWebhookRequest) throws RestClientException {
        return createIncomingWebhookWithHttpInfo(createIncomingWebhookRequest).getBody();
    }

    /**
     * Create an incoming webhook
     * Create an incoming webhook for a channel. ##### Permissions &#x60;manage_webhooks&#x60; for the team the webhook is in.  &#x60;manage_others_incoming_webhooks&#x60; for the team the webhook is in if the user is different than the requester. 
     * <p><b>201</b> - Incoming webhook creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param createIncomingWebhookRequest Incoming webhook to be created (required)
     * @return ResponseEntity&lt;IncomingWebhook&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IncomingWebhook> createIncomingWebhookWithHttpInfo(CreateIncomingWebhookRequest createIncomingWebhookRequest) throws RestClientException {
        Object localVarPostBody = createIncomingWebhookRequest;
        
        // verify the required parameter 'createIncomingWebhookRequest' is set
        if (createIncomingWebhookRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createIncomingWebhookRequest' when calling createIncomingWebhook");
        }
        

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<IncomingWebhook> localReturnType = new ParameterizedTypeReference<IncomingWebhook>() {};
        return apiClient.invokeAPI("/hooks/incoming", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create an outgoing webhook
     * Create an outgoing webhook for a team. ##### Permissions &#x60;manage_webhooks&#x60; for the team the webhook is in.  &#x60;manage_others_outgoing_webhooks&#x60; for the team the webhook is in if the user is different than the requester. 
     * <p><b>201</b> - Outgoing webhook creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param createOutgoingWebhookRequest Outgoing webhook to be created (required)
     * @return OutgoingWebhook
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OutgoingWebhook createOutgoingWebhook(CreateOutgoingWebhookRequest createOutgoingWebhookRequest) throws RestClientException {
        return createOutgoingWebhookWithHttpInfo(createOutgoingWebhookRequest).getBody();
    }

    /**
     * Create an outgoing webhook
     * Create an outgoing webhook for a team. ##### Permissions &#x60;manage_webhooks&#x60; for the team the webhook is in.  &#x60;manage_others_outgoing_webhooks&#x60; for the team the webhook is in if the user is different than the requester. 
     * <p><b>201</b> - Outgoing webhook creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param createOutgoingWebhookRequest Outgoing webhook to be created (required)
     * @return ResponseEntity&lt;OutgoingWebhook&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OutgoingWebhook> createOutgoingWebhookWithHttpInfo(CreateOutgoingWebhookRequest createOutgoingWebhookRequest) throws RestClientException {
        Object localVarPostBody = createOutgoingWebhookRequest;
        
        // verify the required parameter 'createOutgoingWebhookRequest' is set
        if (createOutgoingWebhookRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createOutgoingWebhookRequest' when calling createOutgoingWebhook");
        }
        

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<OutgoingWebhook> localReturnType = new ParameterizedTypeReference<OutgoingWebhook>() {};
        return apiClient.invokeAPI("/hooks/outgoing", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete an incoming webhook
     * Delete an incoming webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
     * <p><b>200</b> - Webhook deletion successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param hookId Incoming webhook GUID (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK deleteIncomingWebhook(String hookId) throws RestClientException {
        return deleteIncomingWebhookWithHttpInfo(hookId).getBody();
    }

    /**
     * Delete an incoming webhook
     * Delete an incoming webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
     * <p><b>200</b> - Webhook deletion successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param hookId Incoming webhook GUID (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> deleteIncomingWebhookWithHttpInfo(String hookId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'hookId' is set
        if (hookId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hookId' when calling deleteIncomingWebhook");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hook_id", hookId);

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<StatusOK> localReturnType = new ParameterizedTypeReference<StatusOK>() {};
        return apiClient.invokeAPI("/hooks/incoming/{hook_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete an outgoing webhook
     * Delete an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
     * <p><b>200</b> - Webhook deletion successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param hookId Outgoing webhook GUID (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK deleteOutgoingWebhook(String hookId) throws RestClientException {
        return deleteOutgoingWebhookWithHttpInfo(hookId).getBody();
    }

    /**
     * Delete an outgoing webhook
     * Delete an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
     * <p><b>200</b> - Webhook deletion successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param hookId Outgoing webhook GUID (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> deleteOutgoingWebhookWithHttpInfo(String hookId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'hookId' is set
        if (hookId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hookId' when calling deleteOutgoingWebhook");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hook_id", hookId);

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<StatusOK> localReturnType = new ParameterizedTypeReference<StatusOK>() {};
        return apiClient.invokeAPI("/hooks/outgoing/{hook_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get an incoming webhook
     * Get an incoming webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
     * <p><b>200</b> - Webhook retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param hookId Incoming Webhook GUID (required)
     * @return IncomingWebhook
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IncomingWebhook getIncomingWebhook(String hookId) throws RestClientException {
        return getIncomingWebhookWithHttpInfo(hookId).getBody();
    }

    /**
     * Get an incoming webhook
     * Get an incoming webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
     * <p><b>200</b> - Webhook retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param hookId Incoming Webhook GUID (required)
     * @return ResponseEntity&lt;IncomingWebhook&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IncomingWebhook> getIncomingWebhookWithHttpInfo(String hookId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'hookId' is set
        if (hookId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hookId' when calling getIncomingWebhook");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hook_id", hookId);

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<IncomingWebhook> localReturnType = new ParameterizedTypeReference<IncomingWebhook>() {};
        return apiClient.invokeAPI("/hooks/incoming/{hook_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List incoming webhooks
     * Get a page of a list of incoming webhooks. Optionally filter for a specific team using query parameters. ##### Permissions &#x60;manage_webhooks&#x60; for the system or &#x60;manage_webhooks&#x60; for the specific team. 
     * <p><b>200</b> - Incoming webhooks retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of hooks per page. (optional, default to 60)
     * @param teamId The ID of the team to get hooks for. (optional)
     * @return List&lt;IncomingWebhook&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<IncomingWebhook> getIncomingWebhooks(Integer page, Integer perPage, String teamId) throws RestClientException {
        return getIncomingWebhooksWithHttpInfo(page, perPage, teamId).getBody();
    }

    /**
     * List incoming webhooks
     * Get a page of a list of incoming webhooks. Optionally filter for a specific team using query parameters. ##### Permissions &#x60;manage_webhooks&#x60; for the system or &#x60;manage_webhooks&#x60; for the specific team. 
     * <p><b>200</b> - Incoming webhooks retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of hooks per page. (optional, default to 60)
     * @param teamId The ID of the team to get hooks for. (optional)
     * @return ResponseEntity&lt;List&lt;IncomingWebhook&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<IncomingWebhook>> getIncomingWebhooksWithHttpInfo(Integer page, Integer perPage, String teamId) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "team_id", teamId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<IncomingWebhook>> localReturnType = new ParameterizedTypeReference<List<IncomingWebhook>>() {};
        return apiClient.invokeAPI("/hooks/incoming", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get an outgoing webhook
     * Get an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
     * <p><b>200</b> - Outgoing webhook retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param hookId Outgoing webhook GUID (required)
     * @return OutgoingWebhook
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OutgoingWebhook getOutgoingWebhook(String hookId) throws RestClientException {
        return getOutgoingWebhookWithHttpInfo(hookId).getBody();
    }

    /**
     * Get an outgoing webhook
     * Get an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
     * <p><b>200</b> - Outgoing webhook retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param hookId Outgoing webhook GUID (required)
     * @return ResponseEntity&lt;OutgoingWebhook&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OutgoingWebhook> getOutgoingWebhookWithHttpInfo(String hookId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'hookId' is set
        if (hookId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hookId' when calling getOutgoingWebhook");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hook_id", hookId);

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<OutgoingWebhook> localReturnType = new ParameterizedTypeReference<OutgoingWebhook>() {};
        return apiClient.invokeAPI("/hooks/outgoing/{hook_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List outgoing webhooks
     * Get a page of a list of outgoing webhooks. Optionally filter for a specific team or channel using query parameters. ##### Permissions &#x60;manage_webhooks&#x60; for the system or &#x60;manage_webhooks&#x60; for the specific team/channel. 
     * <p><b>200</b> - Outgoing webhooks retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of hooks per page. (optional, default to 60)
     * @param teamId The ID of the team to get hooks for. (optional)
     * @param channelId The ID of the channel to get hooks for. (optional)
     * @return List&lt;OutgoingWebhook&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<OutgoingWebhook> getOutgoingWebhooks(Integer page, Integer perPage, String teamId, String channelId) throws RestClientException {
        return getOutgoingWebhooksWithHttpInfo(page, perPage, teamId, channelId).getBody();
    }

    /**
     * List outgoing webhooks
     * Get a page of a list of outgoing webhooks. Optionally filter for a specific team or channel using query parameters. ##### Permissions &#x60;manage_webhooks&#x60; for the system or &#x60;manage_webhooks&#x60; for the specific team/channel. 
     * <p><b>200</b> - Outgoing webhooks retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of hooks per page. (optional, default to 60)
     * @param teamId The ID of the team to get hooks for. (optional)
     * @param channelId The ID of the channel to get hooks for. (optional)
     * @return ResponseEntity&lt;List&lt;OutgoingWebhook&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<OutgoingWebhook>> getOutgoingWebhooksWithHttpInfo(Integer page, Integer perPage, String teamId, String channelId) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "team_id", teamId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "channel_id", channelId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<OutgoingWebhook>> localReturnType = new ParameterizedTypeReference<List<OutgoingWebhook>>() {};
        return apiClient.invokeAPI("/hooks/outgoing", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Regenerate the token for the outgoing webhook.
     * Regenerate the token for the outgoing webhook. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
     * <p><b>200</b> - Webhook token regenerate successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param hookId Outgoing webhook GUID (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK regenOutgoingHookToken(String hookId) throws RestClientException {
        return regenOutgoingHookTokenWithHttpInfo(hookId).getBody();
    }

    /**
     * Regenerate the token for the outgoing webhook.
     * Regenerate the token for the outgoing webhook. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
     * <p><b>200</b> - Webhook token regenerate successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param hookId Outgoing webhook GUID (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> regenOutgoingHookTokenWithHttpInfo(String hookId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'hookId' is set
        if (hookId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hookId' when calling regenOutgoingHookToken");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hook_id", hookId);

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<StatusOK> localReturnType = new ParameterizedTypeReference<StatusOK>() {};
        return apiClient.invokeAPI("/hooks/outgoing/{hook_id}/regen_token", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update an incoming webhook
     * Update an incoming webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
     * <p><b>200</b> - Webhook update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param hookId Incoming Webhook GUID (required)
     * @param updateIncomingWebhookRequest Incoming webhook to be updated (required)
     * @return IncomingWebhook
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IncomingWebhook updateIncomingWebhook(String hookId, UpdateIncomingWebhookRequest updateIncomingWebhookRequest) throws RestClientException {
        return updateIncomingWebhookWithHttpInfo(hookId, updateIncomingWebhookRequest).getBody();
    }

    /**
     * Update an incoming webhook
     * Update an incoming webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
     * <p><b>200</b> - Webhook update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param hookId Incoming Webhook GUID (required)
     * @param updateIncomingWebhookRequest Incoming webhook to be updated (required)
     * @return ResponseEntity&lt;IncomingWebhook&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IncomingWebhook> updateIncomingWebhookWithHttpInfo(String hookId, UpdateIncomingWebhookRequest updateIncomingWebhookRequest) throws RestClientException {
        Object localVarPostBody = updateIncomingWebhookRequest;
        
        // verify the required parameter 'hookId' is set
        if (hookId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hookId' when calling updateIncomingWebhook");
        }
        
        // verify the required parameter 'updateIncomingWebhookRequest' is set
        if (updateIncomingWebhookRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateIncomingWebhookRequest' when calling updateIncomingWebhook");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hook_id", hookId);

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<IncomingWebhook> localReturnType = new ParameterizedTypeReference<IncomingWebhook>() {};
        return apiClient.invokeAPI("/hooks/incoming/{hook_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update an outgoing webhook
     * Update an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
     * <p><b>200</b> - Webhook update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param hookId outgoing Webhook GUID (required)
     * @param updateOutgoingWebhookRequest Outgoing webhook to be updated (required)
     * @return OutgoingWebhook
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OutgoingWebhook updateOutgoingWebhook(String hookId, UpdateOutgoingWebhookRequest updateOutgoingWebhookRequest) throws RestClientException {
        return updateOutgoingWebhookWithHttpInfo(hookId, updateOutgoingWebhookRequest).getBody();
    }

    /**
     * Update an outgoing webhook
     * Update an outgoing webhook given the hook id. ##### Permissions &#x60;manage_webhooks&#x60; for system or &#x60;manage_webhooks&#x60; for the specific team or &#x60;manage_webhooks&#x60; for the channel. 
     * <p><b>200</b> - Webhook update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param hookId outgoing Webhook GUID (required)
     * @param updateOutgoingWebhookRequest Outgoing webhook to be updated (required)
     * @return ResponseEntity&lt;OutgoingWebhook&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OutgoingWebhook> updateOutgoingWebhookWithHttpInfo(String hookId, UpdateOutgoingWebhookRequest updateOutgoingWebhookRequest) throws RestClientException {
        Object localVarPostBody = updateOutgoingWebhookRequest;
        
        // verify the required parameter 'hookId' is set
        if (hookId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hookId' when calling updateOutgoingWebhook");
        }
        
        // verify the required parameter 'updateOutgoingWebhookRequest' is set
        if (updateOutgoingWebhookRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateOutgoingWebhookRequest' when calling updateOutgoingWebhook");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hook_id", hookId);

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<OutgoingWebhook> localReturnType = new ParameterizedTypeReference<OutgoingWebhook>() {};
        return apiClient.invokeAPI("/hooks/outgoing/{hook_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
