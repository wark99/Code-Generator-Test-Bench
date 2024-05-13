package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiError;
import org.openapitools.client.model.AppError;
import org.openapitools.client.model.ChannelUnreadAt;
import org.openapitools.client.model.CreatePostEphemeralRequest;
import org.openapitools.client.model.CreatePostRequest;
import org.openapitools.client.model.FileInfo;
import org.openapitools.client.model.PatchPostRequest;
import org.openapitools.client.model.Post;
import org.openapitools.client.model.PostList;
import org.openapitools.client.model.PostListWithSearchMatches;
import org.openapitools.client.model.SearchPostsRequest;
import org.openapitools.client.model.SetPostReminderRequest;
import org.openapitools.client.model.StatusOK;
import org.openapitools.client.model.UpdatePostRequest;

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
public class PostsApi {
    private ApiClient apiClient;

    public PostsApi() {
        this(new ApiClient());
    }

    public PostsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a post
     * Create a new post in a channel. To create the post as a comment on another post, provide &#x60;root_id&#x60;. ##### Permissions Must have &#x60;create_post&#x60; permission for the channel the post is being created in. 
     * <p><b>201</b> - Post creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param createPostRequest Post object to create (required)
     * @param setOnline Whether to set the user status as online or not. (optional)
     * @return Post
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Post createPost(CreatePostRequest createPostRequest, Boolean setOnline) throws RestClientException {
        return createPostWithHttpInfo(createPostRequest, setOnline).getBody();
    }

    /**
     * Create a post
     * Create a new post in a channel. To create the post as a comment on another post, provide &#x60;root_id&#x60;. ##### Permissions Must have &#x60;create_post&#x60; permission for the channel the post is being created in. 
     * <p><b>201</b> - Post creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param createPostRequest Post object to create (required)
     * @param setOnline Whether to set the user status as online or not. (optional)
     * @return ResponseEntity&lt;Post&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Post> createPostWithHttpInfo(CreatePostRequest createPostRequest, Boolean setOnline) throws RestClientException {
        Object localVarPostBody = createPostRequest;
        
        // verify the required parameter 'createPostRequest' is set
        if (createPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createPostRequest' when calling createPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "set_online", setOnline));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Post> localReturnType = new ParameterizedTypeReference<Post>() {};
        return apiClient.invokeAPI("/posts", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a ephemeral post
     * Create a new ephemeral post in a channel. ##### Permissions Must have &#x60;create_post_ephemeral&#x60; permission (currently only given to system admin) 
     * <p><b>201</b> - Post creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param createPostEphemeralRequest Ephemeral Post object to send (required)
     * @return Post
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Post createPostEphemeral(CreatePostEphemeralRequest createPostEphemeralRequest) throws RestClientException {
        return createPostEphemeralWithHttpInfo(createPostEphemeralRequest).getBody();
    }

    /**
     * Create a ephemeral post
     * Create a new ephemeral post in a channel. ##### Permissions Must have &#x60;create_post_ephemeral&#x60; permission (currently only given to system admin) 
     * <p><b>201</b> - Post creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param createPostEphemeralRequest Ephemeral Post object to send (required)
     * @return ResponseEntity&lt;Post&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Post> createPostEphemeralWithHttpInfo(CreatePostEphemeralRequest createPostEphemeralRequest) throws RestClientException {
        Object localVarPostBody = createPostEphemeralRequest;
        
        // verify the required parameter 'createPostEphemeralRequest' is set
        if (createPostEphemeralRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createPostEphemeralRequest' when calling createPostEphemeral");
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

        ParameterizedTypeReference<Post> localReturnType = new ParameterizedTypeReference<Post>() {};
        return apiClient.invokeAPI("/posts/ephemeral", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a post
     * Soft deletes a post, by marking the post as deleted in the database. Soft deleted posts will not be returned in post queries. ##### Permissions Must be logged in as the user or have &#x60;delete_others_posts&#x60; permission. 
     * <p><b>200</b> - Post deletion successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param postId ID of the post to delete (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK deletePost(String postId) throws RestClientException {
        return deletePostWithHttpInfo(postId).getBody();
    }

    /**
     * Delete a post
     * Soft deletes a post, by marking the post as deleted in the database. Soft deleted posts will not be returned in post queries. ##### Permissions Must be logged in as the user or have &#x60;delete_others_posts&#x60; permission. 
     * <p><b>200</b> - Post deletion successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param postId ID of the post to delete (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> deletePostWithHttpInfo(String postId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'postId' is set
        if (postId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postId' when calling deletePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
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

        ParameterizedTypeReference<StatusOK> localReturnType = new ParameterizedTypeReference<StatusOK>() {};
        return apiClient.invokeAPI("/posts/{post_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Perform a post action
     * Perform a post action, which allows users to interact with integrations through posts. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 
     * <p><b>200</b> - Post action successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param postId Post GUID (required)
     * @param actionId Action GUID (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK doPostAction(String postId, String actionId) throws RestClientException {
        return doPostActionWithHttpInfo(postId, actionId).getBody();
    }

    /**
     * Perform a post action
     * Perform a post action, which allows users to interact with integrations through posts. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 
     * <p><b>200</b> - Post action successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param postId Post GUID (required)
     * @param actionId Action GUID (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> doPostActionWithHttpInfo(String postId, String actionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'postId' is set
        if (postId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postId' when calling doPostAction");
        }
        
        // verify the required parameter 'actionId' is set
        if (actionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'actionId' when calling doPostAction");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("post_id", postId);
        uriVariables.put("action_id", actionId);

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
        return apiClient.invokeAPI("/posts/{post_id}/actions/{action_id}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get file info for post
     * Gets a list of file information objects for the files attached to a post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in. 
     * <p><b>200</b> - File info retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param postId ID of the post (required)
     * @param includeDeleted Defines if result should include deleted posts, must have &#39;manage_system&#39; (admin) permission. (optional, default to false)
     * @return List&lt;FileInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<FileInfo> getFileInfosForPost(String postId, Boolean includeDeleted) throws RestClientException {
        return getFileInfosForPostWithHttpInfo(postId, includeDeleted).getBody();
    }

    /**
     * Get file info for post
     * Gets a list of file information objects for the files attached to a post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in. 
     * <p><b>200</b> - File info retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param postId ID of the post (required)
     * @param includeDeleted Defines if result should include deleted posts, must have &#39;manage_system&#39; (admin) permission. (optional, default to false)
     * @return ResponseEntity&lt;List&lt;FileInfo&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<FileInfo>> getFileInfosForPostWithHttpInfo(String postId, Boolean includeDeleted) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'postId' is set
        if (postId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postId' when calling getFileInfosForPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("post_id", postId);

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

        ParameterizedTypeReference<List<FileInfo>> localReturnType = new ParameterizedTypeReference<List<FileInfo>>() {};
        return apiClient.invokeAPI("/posts/{post_id}/files/info", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of flagged posts
     * Get a page of flagged posts of a user provided user id string. Selects from a channel, team, or all flagged posts by a user. Will only return posts from channels in which the user is member. ##### Permissions Must be user or have &#x60;manage_system&#x60; permission. 
     * <p><b>200</b> - Post list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId ID of the user (required)
     * @param teamId Team ID (optional)
     * @param channelId Channel ID (optional)
     * @param page The page to select (optional, default to 0)
     * @param perPage The number of posts per page (optional, default to 60)
     * @return List&lt;PostList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostList> getFlaggedPostsForUser(String userId, String teamId, String channelId, Integer page, Integer perPage) throws RestClientException {
        return getFlaggedPostsForUserWithHttpInfo(userId, teamId, channelId, page, perPage).getBody();
    }

    /**
     * Get a list of flagged posts
     * Get a page of flagged posts of a user provided user id string. Selects from a channel, team, or all flagged posts by a user. Will only return posts from channels in which the user is member. ##### Permissions Must be user or have &#x60;manage_system&#x60; permission. 
     * <p><b>200</b> - Post list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId ID of the user (required)
     * @param teamId Team ID (optional)
     * @param channelId Channel ID (optional)
     * @param page The page to select (optional, default to 0)
     * @param perPage The number of posts per page (optional, default to 60)
     * @return ResponseEntity&lt;List&lt;PostList&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostList>> getFlaggedPostsForUserWithHttpInfo(String userId, String teamId, String channelId, Integer page, Integer perPage) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getFlaggedPostsForUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "team_id", teamId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "channel_id", channelId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<PostList>> localReturnType = new ParameterizedTypeReference<List<PostList>>() {};
        return apiClient.invokeAPI("/users/{user_id}/posts/flagged", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a post
     * Get a single post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team. 
     * <p><b>200</b> - Post retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param postId ID of the post to get (required)
     * @param includeDeleted Defines if result should include deleted posts, must have &#39;manage_system&#39; (admin) permission. (optional, default to false)
     * @return Post
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Post getPost(String postId, Boolean includeDeleted) throws RestClientException {
        return getPostWithHttpInfo(postId, includeDeleted).getBody();
    }

    /**
     * Get a post
     * Get a single post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team. 
     * <p><b>200</b> - Post retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param postId ID of the post to get (required)
     * @param includeDeleted Defines if result should include deleted posts, must have &#39;manage_system&#39; (admin) permission. (optional, default to false)
     * @return ResponseEntity&lt;Post&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Post> getPostWithHttpInfo(String postId, Boolean includeDeleted) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'postId' is set
        if (postId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postId' when calling getPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("post_id", postId);

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

        ParameterizedTypeReference<Post> localReturnType = new ParameterizedTypeReference<Post>() {};
        return apiClient.invokeAPI("/posts/{post_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a thread
     * Get a post and the rest of the posts in the same thread. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team. 
     * <p><b>200</b> - Post list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param postId ID of a post in the thread (required)
     * @param perPage The number of posts per page (optional, default to 0)
     * @param fromPost The post_id to return the next page of posts from (optional, default to )
     * @param fromCreateAt The create_at timestamp to return the next page of posts from (optional, default to 0)
     * @param direction The direction to return the posts. Either up or down. (optional, default to )
     * @param skipFetchThreads Whether to skip fetching threads or not (optional, default to false)
     * @param collapsedThreads Whether the client uses CRT or not (optional, default to false)
     * @param collapsedThreadsExtended Whether to return the associated users as part of the response or not (optional, default to false)
     * @return PostList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostList getPostThread(String postId, Integer perPage, String fromPost, Integer fromCreateAt, String direction, Boolean skipFetchThreads, Boolean collapsedThreads, Boolean collapsedThreadsExtended) throws RestClientException {
        return getPostThreadWithHttpInfo(postId, perPage, fromPost, fromCreateAt, direction, skipFetchThreads, collapsedThreads, collapsedThreadsExtended).getBody();
    }

    /**
     * Get a thread
     * Get a post and the rest of the posts in the same thread. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team. 
     * <p><b>200</b> - Post list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param postId ID of a post in the thread (required)
     * @param perPage The number of posts per page (optional, default to 0)
     * @param fromPost The post_id to return the next page of posts from (optional, default to )
     * @param fromCreateAt The create_at timestamp to return the next page of posts from (optional, default to 0)
     * @param direction The direction to return the posts. Either up or down. (optional, default to )
     * @param skipFetchThreads Whether to skip fetching threads or not (optional, default to false)
     * @param collapsedThreads Whether the client uses CRT or not (optional, default to false)
     * @param collapsedThreadsExtended Whether to return the associated users as part of the response or not (optional, default to false)
     * @return ResponseEntity&lt;PostList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostList> getPostThreadWithHttpInfo(String postId, Integer perPage, String fromPost, Integer fromCreateAt, String direction, Boolean skipFetchThreads, Boolean collapsedThreads, Boolean collapsedThreadsExtended) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'postId' is set
        if (postId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postId' when calling getPostThread");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("post_id", postId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "perPage", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fromPost", fromPost));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fromCreateAt", fromCreateAt));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "direction", direction));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipFetchThreads", skipFetchThreads));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "collapsedThreads", collapsedThreads));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "collapsedThreadsExtended", collapsedThreadsExtended));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PostList> localReturnType = new ParameterizedTypeReference<PostList>() {};
        return apiClient.invokeAPI("/posts/{post_id}/thread", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get posts around oldest unread
     * Get the oldest unread post in the channel for the given user as well as the posts around it. The returned list is sorted in descending order (most recent post first). ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission, and must have &#x60;read_channel&#x60; permission for the channel. 
     * <p><b>200</b> - Post list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId ID of the user (required)
     * @param channelId The channel ID to get the posts for (required)
     * @param limitBefore Number of posts before the oldest unread posts. Maximum is 200 posts if limit is set greater than that. (optional, default to 60)
     * @param limitAfter Number of posts after and including the oldest unread post. Maximum is 200 posts if limit is set greater than that. (optional, default to 60)
     * @param skipFetchThreads Whether to skip fetching threads or not (optional, default to false)
     * @param collapsedThreads Whether the client uses CRT or not (optional, default to false)
     * @param collapsedThreadsExtended Whether to return the associated users as part of the response or not (optional, default to false)
     * @return PostList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostList getPostsAroundLastUnread(String userId, String channelId, Integer limitBefore, Integer limitAfter, Boolean skipFetchThreads, Boolean collapsedThreads, Boolean collapsedThreadsExtended) throws RestClientException {
        return getPostsAroundLastUnreadWithHttpInfo(userId, channelId, limitBefore, limitAfter, skipFetchThreads, collapsedThreads, collapsedThreadsExtended).getBody();
    }

    /**
     * Get posts around oldest unread
     * Get the oldest unread post in the channel for the given user as well as the posts around it. The returned list is sorted in descending order (most recent post first). ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission, and must have &#x60;read_channel&#x60; permission for the channel. 
     * <p><b>200</b> - Post list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId ID of the user (required)
     * @param channelId The channel ID to get the posts for (required)
     * @param limitBefore Number of posts before the oldest unread posts. Maximum is 200 posts if limit is set greater than that. (optional, default to 60)
     * @param limitAfter Number of posts after and including the oldest unread post. Maximum is 200 posts if limit is set greater than that. (optional, default to 60)
     * @param skipFetchThreads Whether to skip fetching threads or not (optional, default to false)
     * @param collapsedThreads Whether the client uses CRT or not (optional, default to false)
     * @param collapsedThreadsExtended Whether to return the associated users as part of the response or not (optional, default to false)
     * @return ResponseEntity&lt;PostList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostList> getPostsAroundLastUnreadWithHttpInfo(String userId, String channelId, Integer limitBefore, Integer limitAfter, Boolean skipFetchThreads, Boolean collapsedThreads, Boolean collapsedThreadsExtended) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getPostsAroundLastUnread");
        }
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling getPostsAroundLastUnread");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("channel_id", channelId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit_before", limitBefore));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit_after", limitAfter));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "skipFetchThreads", skipFetchThreads));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "collapsedThreads", collapsedThreads));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "collapsedThreadsExtended", collapsedThreadsExtended));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PostList> localReturnType = new ParameterizedTypeReference<PostList>() {};
        return apiClient.invokeAPI("/users/{user_id}/channels/{channel_id}/posts/unread", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get posts by a list of ids
     * Fetch a list of posts based on the provided postIDs ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team. 
     * <p><b>200</b> - Post list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param requestBody List of post ids (required)
     * @return List&lt;Post&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Post> getPostsByIds(List<String> requestBody) throws RestClientException {
        return getPostsByIdsWithHttpInfo(requestBody).getBody();
    }

    /**
     * Get posts by a list of ids
     * Fetch a list of posts based on the provided postIDs ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team. 
     * <p><b>200</b> - Post list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param requestBody List of post ids (required)
     * @return ResponseEntity&lt;List&lt;Post&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Post>> getPostsByIdsWithHttpInfo(List<String> requestBody) throws RestClientException {
        Object localVarPostBody = requestBody;
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody' when calling getPostsByIds");
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

        ParameterizedTypeReference<List<Post>> localReturnType = new ParameterizedTypeReference<List<Post>>() {};
        return apiClient.invokeAPI("/posts/ids", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get posts for a channel
     * Get a page of posts in a channel. Use the query parameters to modify the behaviour of this endpoint. The parameter &#x60;since&#x60; must not be used with any of &#x60;before&#x60;, &#x60;after&#x60;, &#x60;page&#x60;, and &#x60;per_page&#x60; parameters. If &#x60;since&#x60; is used, it will always return all posts modified since that time, ordered by their create time limited till 1000. A caveat with this parameter is that there is no guarantee that the returned posts will be consecutive. It is left to the clients to maintain state and fill any missing holes in the post order. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel. 
     * <p><b>200</b> - Post list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId The channel ID to get the posts for (required)
     * @param page The page to select (optional, default to 0)
     * @param perPage The number of posts per page (optional, default to 60)
     * @param since Provide a non-zero value in Unix time milliseconds to select posts modified after that time (optional)
     * @param before A post id to select the posts that came before this one (optional)
     * @param after A post id to select the posts that came after this one (optional)
     * @param includeDeleted Whether to include deleted posts or not. Must have system admin permissions. (optional, default to false)
     * @return PostList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostList getPostsForChannel(String channelId, Integer page, Integer perPage, Integer since, String before, String after, Boolean includeDeleted) throws RestClientException {
        return getPostsForChannelWithHttpInfo(channelId, page, perPage, since, before, after, includeDeleted).getBody();
    }

    /**
     * Get posts for a channel
     * Get a page of posts in a channel. Use the query parameters to modify the behaviour of this endpoint. The parameter &#x60;since&#x60; must not be used with any of &#x60;before&#x60;, &#x60;after&#x60;, &#x60;page&#x60;, and &#x60;per_page&#x60; parameters. If &#x60;since&#x60; is used, it will always return all posts modified since that time, ordered by their create time limited till 1000. A caveat with this parameter is that there is no guarantee that the returned posts will be consecutive. It is left to the clients to maintain state and fill any missing holes in the post order. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel. 
     * <p><b>200</b> - Post list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId The channel ID to get the posts for (required)
     * @param page The page to select (optional, default to 0)
     * @param perPage The number of posts per page (optional, default to 60)
     * @param since Provide a non-zero value in Unix time milliseconds to select posts modified after that time (optional)
     * @param before A post id to select the posts that came before this one (optional)
     * @param after A post id to select the posts that came after this one (optional)
     * @param includeDeleted Whether to include deleted posts or not. Must have system admin permissions. (optional, default to false)
     * @return ResponseEntity&lt;PostList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostList> getPostsForChannelWithHttpInfo(String channelId, Integer page, Integer perPage, Integer since, String before, String after, Boolean includeDeleted) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling getPostsForChannel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel_id", channelId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "since", since));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "before", before));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "after", after));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_deleted", includeDeleted));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PostList> localReturnType = new ParameterizedTypeReference<PostList>() {};
        return apiClient.invokeAPI("/channels/{channel_id}/posts", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Patch a post
     * Partially update a post by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must have the &#x60;edit_post&#x60; permission. 
     * <p><b>200</b> - Post patch successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param postId Post GUID (required)
     * @param patchPostRequest Post object that is to be updated (required)
     * @return Post
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Post patchPost(String postId, PatchPostRequest patchPostRequest) throws RestClientException {
        return patchPostWithHttpInfo(postId, patchPostRequest).getBody();
    }

    /**
     * Patch a post
     * Partially update a post by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must have the &#x60;edit_post&#x60; permission. 
     * <p><b>200</b> - Post patch successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param postId Post GUID (required)
     * @param patchPostRequest Post object that is to be updated (required)
     * @return ResponseEntity&lt;Post&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Post> patchPostWithHttpInfo(String postId, PatchPostRequest patchPostRequest) throws RestClientException {
        Object localVarPostBody = patchPostRequest;
        
        // verify the required parameter 'postId' is set
        if (postId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postId' when calling patchPost");
        }
        
        // verify the required parameter 'patchPostRequest' is set
        if (patchPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'patchPostRequest' when calling patchPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("post_id", postId);

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

        ParameterizedTypeReference<Post> localReturnType = new ParameterizedTypeReference<Post>() {};
        return apiClient.invokeAPI("/posts/{post_id}/patch", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Pin a post to the channel
     * Pin a post to a channel it is in based from the provided post id string. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 
     * <p><b>200</b> - Pinned post successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param postId Post GUID (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK pinPost(String postId) throws RestClientException {
        return pinPostWithHttpInfo(postId).getBody();
    }

    /**
     * Pin a post to the channel
     * Pin a post to a channel it is in based from the provided post id string. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 
     * <p><b>200</b> - Pinned post successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param postId Post GUID (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> pinPostWithHttpInfo(String postId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'postId' is set
        if (postId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postId' when calling pinPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
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

        ParameterizedTypeReference<StatusOK> localReturnType = new ParameterizedTypeReference<StatusOK>() {};
        return apiClient.invokeAPI("/posts/{post_id}/pin", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search for team posts
     * Search posts in the team and from the provided terms string. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     * <p><b>200</b> - Post list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @param searchPostsRequest The search terms and logic to use in the search. (required)
     * @return PostListWithSearchMatches
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostListWithSearchMatches searchPosts(String teamId, SearchPostsRequest searchPostsRequest) throws RestClientException {
        return searchPostsWithHttpInfo(teamId, searchPostsRequest).getBody();
    }

    /**
     * Search for team posts
     * Search posts in the team and from the provided terms string. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     * <p><b>200</b> - Post list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @param searchPostsRequest The search terms and logic to use in the search. (required)
     * @return ResponseEntity&lt;PostListWithSearchMatches&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostListWithSearchMatches> searchPostsWithHttpInfo(String teamId, SearchPostsRequest searchPostsRequest) throws RestClientException {
        Object localVarPostBody = searchPostsRequest;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling searchPosts");
        }
        
        // verify the required parameter 'searchPostsRequest' is set
        if (searchPostsRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'searchPostsRequest' when calling searchPosts");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);

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

        ParameterizedTypeReference<PostListWithSearchMatches> localReturnType = new ParameterizedTypeReference<PostListWithSearchMatches>() {};
        return apiClient.invokeAPI("/teams/{team_id}/posts/search", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Set a post reminder
     * Set a reminder for the user for the post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in.  
     * <p><b>200</b> - Reminder set successfully
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param userId User GUID (required)
     * @param postId Post GUID (required)
     * @param setPostReminderRequest Target time for the reminder (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK setPostReminder(String userId, String postId, SetPostReminderRequest setPostReminderRequest) throws RestClientException {
        return setPostReminderWithHttpInfo(userId, postId, setPostReminderRequest).getBody();
    }

    /**
     * Set a post reminder
     * Set a reminder for the user for the post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in.  
     * <p><b>200</b> - Reminder set successfully
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param userId User GUID (required)
     * @param postId Post GUID (required)
     * @param setPostReminderRequest Target time for the reminder (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> setPostReminderWithHttpInfo(String userId, String postId, SetPostReminderRequest setPostReminderRequest) throws RestClientException {
        Object localVarPostBody = setPostReminderRequest;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling setPostReminder");
        }
        
        // verify the required parameter 'postId' is set
        if (postId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postId' when calling setPostReminder");
        }
        
        // verify the required parameter 'setPostReminderRequest' is set
        if (setPostReminderRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'setPostReminderRequest' when calling setPostReminder");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("post_id", postId);

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

        ParameterizedTypeReference<StatusOK> localReturnType = new ParameterizedTypeReference<StatusOK>() {};
        return apiClient.invokeAPI("/users/{user_id}/posts/{post_id}/reminder", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Mark as unread from a post.
     * Mark a channel as being unread from a given post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team. Must have &#x60;edit_other_users&#x60; permission if the user is not the one marking the post for himself.  
     * <p><b>200</b> - Post marked as unread successfully
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param userId User GUID (required)
     * @param postId Post GUID (required)
     * @return ChannelUnreadAt
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ChannelUnreadAt setPostUnread(String userId, String postId) throws RestClientException {
        return setPostUnreadWithHttpInfo(userId, postId).getBody();
    }

    /**
     * Mark as unread from a post.
     * Mark a channel as being unread from a given post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team. Must have &#x60;edit_other_users&#x60; permission if the user is not the one marking the post for himself.  
     * <p><b>200</b> - Post marked as unread successfully
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param userId User GUID (required)
     * @param postId Post GUID (required)
     * @return ResponseEntity&lt;ChannelUnreadAt&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ChannelUnreadAt> setPostUnreadWithHttpInfo(String userId, String postId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling setPostUnread");
        }
        
        // verify the required parameter 'postId' is set
        if (postId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postId' when calling setPostUnread");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
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

        ParameterizedTypeReference<ChannelUnreadAt> localReturnType = new ParameterizedTypeReference<ChannelUnreadAt>() {};
        return apiClient.invokeAPI("/users/{user_id}/posts/{post_id}/set_unread", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Unpin a post to the channel
     * Unpin a post to a channel it is in based from the provided post id string. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 
     * <p><b>200</b> - Unpinned post successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param postId Post GUID (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK unpinPost(String postId) throws RestClientException {
        return unpinPostWithHttpInfo(postId).getBody();
    }

    /**
     * Unpin a post to the channel
     * Unpin a post to a channel it is in based from the provided post id string. ##### Permissions Must be authenticated and have the &#x60;read_channel&#x60; permission to the channel the post is in. 
     * <p><b>200</b> - Unpinned post successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param postId Post GUID (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> unpinPostWithHttpInfo(String postId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'postId' is set
        if (postId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postId' when calling unpinPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
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

        ParameterizedTypeReference<StatusOK> localReturnType = new ParameterizedTypeReference<StatusOK>() {};
        return apiClient.invokeAPI("/posts/{post_id}/unpin", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a post
     * Update a post. Only the fields listed below are updatable, omitted fields will be treated as blank. ##### Permissions Must have &#x60;edit_post&#x60; permission for the channel the post is in. 
     * <p><b>200</b> - Post update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param postId ID of the post to update (required)
     * @param updatePostRequest Post object that is to be updated (required)
     * @return Post
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Post updatePost(String postId, UpdatePostRequest updatePostRequest) throws RestClientException {
        return updatePostWithHttpInfo(postId, updatePostRequest).getBody();
    }

    /**
     * Update a post
     * Update a post. Only the fields listed below are updatable, omitted fields will be treated as blank. ##### Permissions Must have &#x60;edit_post&#x60; permission for the channel the post is in. 
     * <p><b>200</b> - Post update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param postId ID of the post to update (required)
     * @param updatePostRequest Post object that is to be updated (required)
     * @return ResponseEntity&lt;Post&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Post> updatePostWithHttpInfo(String postId, UpdatePostRequest updatePostRequest) throws RestClientException {
        Object localVarPostBody = updatePostRequest;
        
        // verify the required parameter 'postId' is set
        if (postId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postId' when calling updatePost");
        }
        
        // verify the required parameter 'updatePostRequest' is set
        if (updatePostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updatePostRequest' when calling updatePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("post_id", postId);

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

        ParameterizedTypeReference<Post> localReturnType = new ParameterizedTypeReference<Post>() {};
        return apiClient.invokeAPI("/posts/{post_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
