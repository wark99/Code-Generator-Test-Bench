package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiError;
import org.openapitools.client.model.StatusOK;
import org.openapitools.client.model.UserThread;
import org.openapitools.client.model.UserThreads;

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
public class ThreadsApi {
    private ApiClient apiClient;

    public ThreadsApi() {
        this(new ApiClient());
    }

    public ThreadsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a thread followed by the user
     * Get a thread   ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - Get was successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId The ID of the user. This can also be \&quot;me\&quot; which will point to the current user. (required)
     * @param teamId The ID of the team in which the thread is. (required)
     * @param threadId The ID of the thread to follow (required)
     * @return UserThread
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserThread getUserThread(String userId, String teamId, String threadId) throws RestClientException {
        return getUserThreadWithHttpInfo(userId, teamId, threadId).getBody();
    }

    /**
     * Get a thread followed by the user
     * Get a thread   ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - Get was successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId The ID of the user. This can also be \&quot;me\&quot; which will point to the current user. (required)
     * @param teamId The ID of the team in which the thread is. (required)
     * @param threadId The ID of the thread to follow (required)
     * @return ResponseEntity&lt;UserThread&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserThread> getUserThreadWithHttpInfo(String userId, String teamId, String threadId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getUserThread");
        }
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getUserThread");
        }
        
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling getUserThread");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("team_id", teamId);
        uriVariables.put("thread_id", threadId);

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

        ParameterizedTypeReference<UserThread> localReturnType = new ParameterizedTypeReference<UserThread>() {};
        return apiClient.invokeAPI("/users/{user_id}/teams/{team_id}/threads/{thread_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all threads that user is following
     * Get all threads that user is following   ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - User&#39;s thread retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId The ID of the user. This can also be \&quot;me\&quot; which will point to the current user. (required)
     * @param teamId The ID of the team in which the thread is. (required)
     * @param since Since filters the threads based on their LastUpdateAt timestamp. (optional)
     * @param deleted Deleted will specify that even deleted threads should be returned (For mobile sync). (optional, default to false)
     * @param extended Extended will enrich the response with participant details. (optional, default to false)
     * @param page Page specifies which part of the results to return, by PageSize. (optional, default to 0)
     * @param pageSize PageSize specifies the size of the returned chunk of results. (optional, default to 30)
     * @param totalsOnly Setting this to true will only return the total counts. (optional, default to false)
     * @param threadsOnly Setting this to true will only return threads. (optional, default to false)
     * @return UserThreads
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserThreads getUserThreads(String userId, String teamId, Integer since, Boolean deleted, Boolean extended, Integer page, Integer pageSize, Boolean totalsOnly, Boolean threadsOnly) throws RestClientException {
        return getUserThreadsWithHttpInfo(userId, teamId, since, deleted, extended, page, pageSize, totalsOnly, threadsOnly).getBody();
    }

    /**
     * Get all threads that user is following
     * Get all threads that user is following   ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - User&#39;s thread retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId The ID of the user. This can also be \&quot;me\&quot; which will point to the current user. (required)
     * @param teamId The ID of the team in which the thread is. (required)
     * @param since Since filters the threads based on their LastUpdateAt timestamp. (optional)
     * @param deleted Deleted will specify that even deleted threads should be returned (For mobile sync). (optional, default to false)
     * @param extended Extended will enrich the response with participant details. (optional, default to false)
     * @param page Page specifies which part of the results to return, by PageSize. (optional, default to 0)
     * @param pageSize PageSize specifies the size of the returned chunk of results. (optional, default to 30)
     * @param totalsOnly Setting this to true will only return the total counts. (optional, default to false)
     * @param threadsOnly Setting this to true will only return threads. (optional, default to false)
     * @return ResponseEntity&lt;UserThreads&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserThreads> getUserThreadsWithHttpInfo(String userId, String teamId, Integer since, Boolean deleted, Boolean extended, Integer page, Integer pageSize, Boolean totalsOnly, Boolean threadsOnly) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getUserThreads");
        }
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getUserThreads");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("team_id", teamId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "since", since));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "deleted", deleted));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "extended", extended));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "totalsOnly", totalsOnly));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "threadsOnly", threadsOnly));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<UserThreads> localReturnType = new ParameterizedTypeReference<UserThreads>() {};
        return apiClient.invokeAPI("/users/{user_id}/teams/{team_id}/threads", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Mark a thread that user is following as unread based on a post id
     * Mark a thread that user is following as unread  ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the thread is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team.  Must have &#x60;edit_other_users&#x60; permission if the user is not the one marking the thread for himself. 
     * <p><b>200</b> - User&#39;s thread update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId The ID of the user. This can also be \&quot;me\&quot; which will point to the current user. (required)
     * @param teamId The ID of the team in which the thread is. (required)
     * @param threadId The ID of the thread to update (required)
     * @param postId The ID of a post belonging to the thread to mark as unread. (required)
     * @return UserThread
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserThread setThreadUnreadByPostId(String userId, String teamId, String threadId, String postId) throws RestClientException {
        return setThreadUnreadByPostIdWithHttpInfo(userId, teamId, threadId, postId).getBody();
    }

    /**
     * Mark a thread that user is following as unread based on a post id
     * Mark a thread that user is following as unread  ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the thread is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team.  Must have &#x60;edit_other_users&#x60; permission if the user is not the one marking the thread for himself. 
     * <p><b>200</b> - User&#39;s thread update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId The ID of the user. This can also be \&quot;me\&quot; which will point to the current user. (required)
     * @param teamId The ID of the team in which the thread is. (required)
     * @param threadId The ID of the thread to update (required)
     * @param postId The ID of a post belonging to the thread to mark as unread. (required)
     * @return ResponseEntity&lt;UserThread&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserThread> setThreadUnreadByPostIdWithHttpInfo(String userId, String teamId, String threadId, String postId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling setThreadUnreadByPostId");
        }
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling setThreadUnreadByPostId");
        }
        
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling setThreadUnreadByPostId");
        }
        
        // verify the required parameter 'postId' is set
        if (postId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postId' when calling setThreadUnreadByPostId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("team_id", teamId);
        uriVariables.put("thread_id", threadId);
        uriVariables.put("post_id", postId);

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

        ParameterizedTypeReference<UserThread> localReturnType = new ParameterizedTypeReference<UserThread>() {};
        return apiClient.invokeAPI("/users/{user_id}/teams/{team_id}/threads/{thread_id}/set_unread/{post_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Start following a thread
     * Start following a thread   ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - User&#39;s thread update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId The ID of the user. This can also be \&quot;me\&quot; which will point to the current user. (required)
     * @param teamId The ID of the team in which the thread is. (required)
     * @param threadId The ID of the thread to follow (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK startFollowingThread(String userId, String teamId, String threadId) throws RestClientException {
        return startFollowingThreadWithHttpInfo(userId, teamId, threadId).getBody();
    }

    /**
     * Start following a thread
     * Start following a thread   ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - User&#39;s thread update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId The ID of the user. This can also be \&quot;me\&quot; which will point to the current user. (required)
     * @param teamId The ID of the team in which the thread is. (required)
     * @param threadId The ID of the thread to follow (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> startFollowingThreadWithHttpInfo(String userId, String teamId, String threadId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling startFollowingThread");
        }
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling startFollowingThread");
        }
        
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling startFollowingThread");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("team_id", teamId);
        uriVariables.put("thread_id", threadId);

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
        return apiClient.invokeAPI("/users/{user_id}/teams/{team_id}/threads/{thread_id}/following", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Stop following a thread
     * Stop following a thread   ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - User&#39;s thread update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId The ID of the user. This can also be \&quot;me\&quot; which will point to the current user. (required)
     * @param teamId The ID of the team in which the thread is. (required)
     * @param threadId The ID of the thread to update (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK stopFollowingThread(String userId, String teamId, String threadId) throws RestClientException {
        return stopFollowingThreadWithHttpInfo(userId, teamId, threadId).getBody();
    }

    /**
     * Stop following a thread
     * Stop following a thread   ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - User&#39;s thread update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId The ID of the user. This can also be \&quot;me\&quot; which will point to the current user. (required)
     * @param teamId The ID of the team in which the thread is. (required)
     * @param threadId The ID of the thread to update (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> stopFollowingThreadWithHttpInfo(String userId, String teamId, String threadId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling stopFollowingThread");
        }
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling stopFollowingThread");
        }
        
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling stopFollowingThread");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("team_id", teamId);
        uriVariables.put("thread_id", threadId);

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
        return apiClient.invokeAPI("/users/{user_id}/teams/{team_id}/threads/{thread_id}/following", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Mark a thread that user is following read state to the timestamp
     * Mark a thread that user is following as read   ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - User&#39;s thread update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId The ID of the user. This can also be \&quot;me\&quot; which will point to the current user. (required)
     * @param teamId The ID of the team in which the thread is. (required)
     * @param threadId The ID of the thread to update (required)
     * @param timestamp The timestamp to which the thread&#39;s \&quot;last read\&quot; state will be reset. (required)
     * @return UserThread
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserThread updateThreadReadForUser(String userId, String teamId, String threadId, String timestamp) throws RestClientException {
        return updateThreadReadForUserWithHttpInfo(userId, teamId, threadId, timestamp).getBody();
    }

    /**
     * Mark a thread that user is following read state to the timestamp
     * Mark a thread that user is following as read   ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - User&#39;s thread update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId The ID of the user. This can also be \&quot;me\&quot; which will point to the current user. (required)
     * @param teamId The ID of the team in which the thread is. (required)
     * @param threadId The ID of the thread to update (required)
     * @param timestamp The timestamp to which the thread&#39;s \&quot;last read\&quot; state will be reset. (required)
     * @return ResponseEntity&lt;UserThread&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserThread> updateThreadReadForUserWithHttpInfo(String userId, String teamId, String threadId, String timestamp) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling updateThreadReadForUser");
        }
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling updateThreadReadForUser");
        }
        
        // verify the required parameter 'threadId' is set
        if (threadId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'threadId' when calling updateThreadReadForUser");
        }
        
        // verify the required parameter 'timestamp' is set
        if (timestamp == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'timestamp' when calling updateThreadReadForUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("team_id", teamId);
        uriVariables.put("thread_id", threadId);
        uriVariables.put("timestamp", timestamp);

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

        ParameterizedTypeReference<UserThread> localReturnType = new ParameterizedTypeReference<UserThread>() {};
        return apiClient.invokeAPI("/users/{user_id}/teams/{team_id}/threads/{thread_id}/read/{timestamp}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Mark all threads that user is following as read
     * Mark all threads that user is following as read   ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - User&#39;s thread update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId The ID of the user. This can also be \&quot;me\&quot; which will point to the current user. (required)
     * @param teamId The ID of the team in which the thread is. (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK updateThreadsReadForUser(String userId, String teamId) throws RestClientException {
        return updateThreadsReadForUserWithHttpInfo(userId, teamId).getBody();
    }

    /**
     * Mark all threads that user is following as read
     * Mark all threads that user is following as read   ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - User&#39;s thread update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId The ID of the user. This can also be \&quot;me\&quot; which will point to the current user. (required)
     * @param teamId The ID of the team in which the thread is. (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> updateThreadsReadForUserWithHttpInfo(String userId, String teamId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling updateThreadsReadForUser");
        }
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling updateThreadsReadForUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("team_id", teamId);

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
        return apiClient.invokeAPI("/users/{user_id}/teams/{team_id}/threads/read", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
