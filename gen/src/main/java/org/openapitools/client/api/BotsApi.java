package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiError;
import org.openapitools.client.model.AppError;
import org.openapitools.client.model.Bot;
import org.openapitools.client.model.CreateBotRequest;

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
public class BotsApi {
    private ApiClient apiClient;

    public BotsApi() {
        this(new ApiClient());
    }

    public BotsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a bot
     * Create a new bot account on the system. Username is required. ##### Permissions Must have &#x60;create_bot&#x60; permission. 
     * <p><b>201</b> - Bot creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param createBotRequest Bot to be created (required)
     * @return Bot
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Bot createBot(CreateBotRequest createBotRequest) throws RestClientException {
        return createBotWithHttpInfo(createBotRequest).getBody();
    }

    /**
     * Create a bot
     * Create a new bot account on the system. Username is required. ##### Permissions Must have &#x60;create_bot&#x60; permission. 
     * <p><b>201</b> - Bot creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param createBotRequest Bot to be created (required)
     * @return ResponseEntity&lt;Bot&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Bot> createBotWithHttpInfo(CreateBotRequest createBotRequest) throws RestClientException {
        Object localVarPostBody = createBotRequest;
        
        // verify the required parameter 'createBotRequest' is set
        if (createBotRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createBotRequest' when calling createBot");
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

        ParameterizedTypeReference<Bot> localReturnType = new ParameterizedTypeReference<Bot>() {};
        return apiClient.invokeAPI("/bots", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Disable a bot
     * Disable a bot. ##### Permissions Must have &#x60;manage_bots&#x60; permission.  
     * <p><b>200</b> - Bot successfully disabled.
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param botUserId Bot user ID (required)
     * @return Bot
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Bot disableBot(String botUserId) throws RestClientException {
        return disableBotWithHttpInfo(botUserId).getBody();
    }

    /**
     * Disable a bot
     * Disable a bot. ##### Permissions Must have &#x60;manage_bots&#x60; permission.  
     * <p><b>200</b> - Bot successfully disabled.
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param botUserId Bot user ID (required)
     * @return ResponseEntity&lt;Bot&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Bot> disableBotWithHttpInfo(String botUserId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'botUserId' is set
        if (botUserId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'botUserId' when calling disableBot");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bot_user_id", botUserId);

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

        ParameterizedTypeReference<Bot> localReturnType = new ParameterizedTypeReference<Bot>() {};
        return apiClient.invokeAPI("/bots/{bot_user_id}/disable", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Enable a bot
     * Enable a bot. ##### Permissions Must have &#x60;manage_bots&#x60; permission.  
     * <p><b>200</b> - Bot successfully enabled.
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param botUserId Bot user ID (required)
     * @return Bot
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Bot enableBot(String botUserId) throws RestClientException {
        return enableBotWithHttpInfo(botUserId).getBody();
    }

    /**
     * Enable a bot
     * Enable a bot. ##### Permissions Must have &#x60;manage_bots&#x60; permission.  
     * <p><b>200</b> - Bot successfully enabled.
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param botUserId Bot user ID (required)
     * @return ResponseEntity&lt;Bot&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Bot> enableBotWithHttpInfo(String botUserId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'botUserId' is set
        if (botUserId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'botUserId' when calling enableBot");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bot_user_id", botUserId);

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

        ParameterizedTypeReference<Bot> localReturnType = new ParameterizedTypeReference<Bot>() {};
        return apiClient.invokeAPI("/bots/{bot_user_id}/enable", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a bot
     * Get a bot specified by its bot id. ##### Permissions Must have &#x60;read_bots&#x60; permission for bots you are managing, and &#x60;read_others_bots&#x60; permission for bots others are managing. 
     * <p><b>200</b> - Bot successfully retrieved.
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param botUserId Bot user ID (required)
     * @param includeDeleted If deleted bots should be returned. (optional)
     * @return Bot
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Bot getBot(String botUserId, Boolean includeDeleted) throws RestClientException {
        return getBotWithHttpInfo(botUserId, includeDeleted).getBody();
    }

    /**
     * Get a bot
     * Get a bot specified by its bot id. ##### Permissions Must have &#x60;read_bots&#x60; permission for bots you are managing, and &#x60;read_others_bots&#x60; permission for bots others are managing. 
     * <p><b>200</b> - Bot successfully retrieved.
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param botUserId Bot user ID (required)
     * @param includeDeleted If deleted bots should be returned. (optional)
     * @return ResponseEntity&lt;Bot&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Bot> getBotWithHttpInfo(String botUserId, Boolean includeDeleted) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'botUserId' is set
        if (botUserId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'botUserId' when calling getBot");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bot_user_id", botUserId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_deleted", includeDeleted));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Bot> localReturnType = new ParameterizedTypeReference<Bot>() {};
        return apiClient.invokeAPI("/bots/{bot_user_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get bots
     * Get a page of a list of bots. ##### Permissions Must have &#x60;read_bots&#x60; permission for bots you are managing, and &#x60;read_others_bots&#x60; permission for bots others are managing. 
     * <p><b>200</b> - Bot page retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of users per page. There is a maximum limit of 200 users per page. (optional, default to 60)
     * @param includeDeleted If deleted bots should be returned. (optional)
     * @param onlyOrphaned When true, only orphaned bots will be returned. A bot is consitered orphaned if it&#39;s owner has been deactivated. (optional)
     * @return List&lt;Bot&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Bot> getBots(Integer page, Integer perPage, Boolean includeDeleted, Boolean onlyOrphaned) throws RestClientException {
        return getBotsWithHttpInfo(page, perPage, includeDeleted, onlyOrphaned).getBody();
    }

    /**
     * Get bots
     * Get a page of a list of bots. ##### Permissions Must have &#x60;read_bots&#x60; permission for bots you are managing, and &#x60;read_others_bots&#x60; permission for bots others are managing. 
     * <p><b>200</b> - Bot page retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of users per page. There is a maximum limit of 200 users per page. (optional, default to 60)
     * @param includeDeleted If deleted bots should be returned. (optional)
     * @param onlyOrphaned When true, only orphaned bots will be returned. A bot is consitered orphaned if it&#39;s owner has been deactivated. (optional)
     * @return ResponseEntity&lt;List&lt;Bot&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Bot>> getBotsWithHttpInfo(Integer page, Integer perPage, Boolean includeDeleted, Boolean onlyOrphaned) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_deleted", includeDeleted));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "only_orphaned", onlyOrphaned));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Bot>> localReturnType = new ParameterizedTypeReference<List<Bot>>() {};
        return apiClient.invokeAPI("/bots", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Patch a bot
     * Partially update a bot by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must have &#x60;manage_bots&#x60; permission.  
     * <p><b>200</b> - Bot patch successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param botUserId Bot user ID (required)
     * @param createBotRequest Bot to be created (required)
     * @return Bot
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Bot patchBot(String botUserId, CreateBotRequest createBotRequest) throws RestClientException {
        return patchBotWithHttpInfo(botUserId, createBotRequest).getBody();
    }

    /**
     * Patch a bot
     * Partially update a bot by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must have &#x60;manage_bots&#x60; permission.  
     * <p><b>200</b> - Bot patch successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param botUserId Bot user ID (required)
     * @param createBotRequest Bot to be created (required)
     * @return ResponseEntity&lt;Bot&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Bot> patchBotWithHttpInfo(String botUserId, CreateBotRequest createBotRequest) throws RestClientException {
        Object localVarPostBody = createBotRequest;
        
        // verify the required parameter 'botUserId' is set
        if (botUserId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'botUserId' when calling patchBot");
        }
        
        // verify the required parameter 'createBotRequest' is set
        if (createBotRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createBotRequest' when calling patchBot");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bot_user_id", botUserId);

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

        ParameterizedTypeReference<Bot> localReturnType = new ParameterizedTypeReference<Bot>() {};
        return apiClient.invokeAPI("/bots/{bot_user_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
