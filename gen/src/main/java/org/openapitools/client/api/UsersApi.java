package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiError;
import org.openapitools.client.model.AppError;
import java.math.BigDecimal;
import org.openapitools.client.model.ChannelMemberWithTeamData;
import java.io.File;
import org.openapitools.client.model.GetUsersByGroupChannelIds200Response;
import org.openapitools.client.model.PatchUserRequest;
import org.openapitools.client.model.SearchUsersRequest;
import org.openapitools.client.model.StatusOK;
import org.openapitools.client.model.UpdateUserRolesRequest;
import org.openapitools.client.model.User;
import org.openapitools.client.model.UserAutocomplete;

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
public class UsersApi {
    private ApiClient apiClient;

    public UsersApi() {
        this(new ApiClient());
    }

    public UsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Autocomplete users
     * Get a list of users for the purpose of autocompleting based on the provided search term. Specify a combination of &#x60;team_id&#x60; and &#x60;channel_id&#x60; to filter results further. ##### Permissions Requires an active session and &#x60;view_team&#x60; and &#x60;read_channel&#x60; on any teams or channels used to filter the results further. 
     * <p><b>200</b> - User autocomplete successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param name Username, nickname first name or last name (required)
     * @param teamId Team ID (optional)
     * @param channelId Channel ID (optional)
     * @param limit The maximum number of users to return in each subresult  __Defaults to &#x60;100&#x60; if not provided.__  (optional, default to 100)
     * @return UserAutocomplete
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserAutocomplete autocompleteUsers(String name, String teamId, String channelId, Integer limit) throws RestClientException {
        return autocompleteUsersWithHttpInfo(name, teamId, channelId, limit).getBody();
    }

    /**
     * Autocomplete users
     * Get a list of users for the purpose of autocompleting based on the provided search term. Specify a combination of &#x60;team_id&#x60; and &#x60;channel_id&#x60; to filter results further. ##### Permissions Requires an active session and &#x60;view_team&#x60; and &#x60;read_channel&#x60; on any teams or channels used to filter the results further. 
     * <p><b>200</b> - User autocomplete successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param name Username, nickname first name or last name (required)
     * @param teamId Team ID (optional)
     * @param channelId Channel ID (optional)
     * @param limit The maximum number of users to return in each subresult  __Defaults to &#x60;100&#x60; if not provided.__  (optional, default to 100)
     * @return ResponseEntity&lt;UserAutocomplete&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserAutocomplete> autocompleteUsersWithHttpInfo(String name, String teamId, String channelId, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling autocompleteUsers");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "team_id", teamId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "channel_id", channelId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<UserAutocomplete> localReturnType = new ParameterizedTypeReference<UserAutocomplete>() {};
        return apiClient.invokeAPI("/users/autocomplete", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all channel members for a user
     * Get all channel members for a user.  ##### Permissions Logged in as the user, or have &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - User&#39;s uploads retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId The ID of the user. This can also be \&quot;me\&quot; which will point to the current user. (required)
     * @param page Page specifies which part of the results to return, by PageSize. (optional)
     * @param pageSize PageSize specifies the size of the returned chunk of results. (optional)
     * @return List&lt;ChannelMemberWithTeamData&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ChannelMemberWithTeamData> getChannelMembersWithTeamDataForUser(String userId, Integer page, Integer pageSize) throws RestClientException {
        return getChannelMembersWithTeamDataForUserWithHttpInfo(userId, page, pageSize).getBody();
    }

    /**
     * Get all channel members for a user
     * Get all channel members for a user.  ##### Permissions Logged in as the user, or have &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - User&#39;s uploads retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId The ID of the user. This can also be \&quot;me\&quot; which will point to the current user. (required)
     * @param page Page specifies which part of the results to return, by PageSize. (optional)
     * @param pageSize PageSize specifies the size of the returned chunk of results. (optional)
     * @return ResponseEntity&lt;List&lt;ChannelMemberWithTeamData&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ChannelMemberWithTeamData>> getChannelMembersWithTeamDataForUserWithHttpInfo(String userId, Integer page, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getChannelMembersWithTeamDataForUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<ChannelMemberWithTeamData>> localReturnType = new ParameterizedTypeReference<List<ChannelMemberWithTeamData>>() {};
        return apiClient.invokeAPI("/users/{user_id}/channel_members", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Return user&#39;s default (generated) profile image
     * Returns the default (generated) user profile image based on user_id string parameter. ##### Permissions Must be logged in. 
     * <p><b>200</b> - Default profile image
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>501</b>
     * @param userId User GUID (required)
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File getDefaultProfileImage(String userId) throws RestClientException {
        return getDefaultProfileImageWithHttpInfo(userId).getBody();
    }

    /**
     * Return user&#39;s default (generated) profile image
     * Returns the default (generated) user profile image based on user_id string parameter. ##### Permissions Must be logged in. 
     * <p><b>200</b> - Default profile image
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>501</b>
     * @param userId User GUID (required)
     * @return ResponseEntity&lt;File&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<File> getDefaultProfileImageWithHttpInfo(String userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getDefaultProfileImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "image/png", "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<File> localReturnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI("/users/{user_id}/image/default", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get user&#39;s profile image
     * Get a user&#39;s profile image based on user_id string parameter. ##### Permissions Must be logged in. 
     * <p><b>200</b> - User&#39;s profile image
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>501</b>
     * @param userId User GUID (required)
     * @param u Not used by the server. Clients can pass in the last picture update time of the user to potentially take advantage of caching (optional)
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File getProfileImage(String userId, BigDecimal u) throws RestClientException {
        return getProfileImageWithHttpInfo(userId, u).getBody();
    }

    /**
     * Get user&#39;s profile image
     * Get a user&#39;s profile image based on user_id string parameter. ##### Permissions Must be logged in. 
     * <p><b>200</b> - User&#39;s profile image
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>501</b>
     * @param userId User GUID (required)
     * @param u Not used by the server. Clients can pass in the last picture update time of the user to potentially take advantage of caching (optional)
     * @return ResponseEntity&lt;File&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<File> getProfileImageWithHttpInfo(String userId, BigDecimal u) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getProfileImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "_", u));
        

        final String[] localVarAccepts = { 
            "image/png", "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<File> localReturnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI("/users/{user_id}/image", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a user
     * Get a user a object. Sensitive information will be sanitized out. ##### Permissions Requires an active session but no other permissions. 
     * <p><b>200</b> - User retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId User GUID. This can also be \&quot;me\&quot; which will point to the current user. (required)
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User getUser(String userId) throws RestClientException {
        return getUserWithHttpInfo(userId).getBody();
    }

    /**
     * Get a user
     * Get a user a object. Sensitive information will be sanitized out. ##### Permissions Requires an active session but no other permissions. 
     * <p><b>200</b> - User retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId User GUID. This can also be \&quot;me\&quot; which will point to the current user. (required)
     * @return ResponseEntity&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<User> getUserWithHttpInfo(String userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);

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

        ParameterizedTypeReference<User> localReturnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI("/users/{user_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a user by email
     * Get a user object by providing a user email. Sensitive information will be sanitized out. ##### Permissions Requires an active session and for the current session to be able to view another user&#39;s email based on the server&#39;s privacy settings. 
     * <p><b>200</b> - User retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param email User Email (required)
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User getUserByEmail(String email) throws RestClientException {
        return getUserByEmailWithHttpInfo(email).getBody();
    }

    /**
     * Get a user by email
     * Get a user object by providing a user email. Sensitive information will be sanitized out. ##### Permissions Requires an active session and for the current session to be able to view another user&#39;s email based on the server&#39;s privacy settings. 
     * <p><b>200</b> - User retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param email User Email (required)
     * @return ResponseEntity&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<User> getUserByEmailWithHttpInfo(String email) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'email' when calling getUserByEmail");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("email", email);

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

        ParameterizedTypeReference<User> localReturnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI("/users/email/{email}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a user by username
     * Get a user object by providing a username. Sensitive information will be sanitized out. ##### Permissions Requires an active session but no other permissions. 
     * <p><b>200</b> - User retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param username Username (required)
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User getUserByUsername(String username) throws RestClientException {
        return getUserByUsernameWithHttpInfo(username).getBody();
    }

    /**
     * Get a user by username
     * Get a user object by providing a username. Sensitive information will be sanitized out. ##### Permissions Requires an active session but no other permissions. 
     * <p><b>200</b> - User retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param username Username (required)
     * @return ResponseEntity&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<User> getUserByUsernameWithHttpInfo(String username) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getUserByUsername");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);

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

        ParameterizedTypeReference<User> localReturnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI("/users/username/{username}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get users
     * Get a page of a list of users. Based on query string parameters, select users from a team, channel, or select users not in a specific channel.  Some basic sorting is available using the &#x60;sort&#x60; query parameter. Sorting is currently only supported when selecting users on a team. ##### Permissions Requires an active session and (if specified) membership to the channel or team being selected from. 
     * <p><b>200</b> - User page retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of users per page. There is a maximum limit of 200 users per page. (optional, default to 60)
     * @param inTeam The ID of the team to get users for. (optional)
     * @param notInTeam The ID of the team to exclude users for. Must not be used with \&quot;in_team\&quot; query parameter. (optional)
     * @param inChannel The ID of the channel to get users for. (optional)
     * @param notInChannel The ID of the channel to exclude users for. Must be used with \&quot;in_channel\&quot; query parameter. (optional)
     * @param inGroup The ID of the group to get users for. Must have &#x60;manage_system&#x60; permission. (optional)
     * @param groupConstrained When used with &#x60;not_in_channel&#x60; or &#x60;not_in_team&#x60;, returns only the users that are allowed to join the channel or team based on its group constrains. (optional)
     * @param withoutTeam Whether or not to list users that are not on any team. This option takes precendence over &#x60;in_team&#x60;, &#x60;in_channel&#x60;, and &#x60;not_in_channel&#x60;. (optional)
     * @param active Whether or not to list only users that are active. This option cannot be used along with the &#x60;inactive&#x60; option. (optional)
     * @param inactive Whether or not to list only users that are deactivated. This option cannot be used along with the &#x60;active&#x60; option. (optional)
     * @param role Returns users that have this role. (optional)
     * @param sort Sort is only available in conjunction with certain options below. The paging parameter is also always available.  ##### &#x60;in_team&#x60; Can be \&quot;\&quot;, \&quot;last_activity_at\&quot; or \&quot;create_at\&quot;. When left blank, sorting is done by username. ##### &#x60;in_channel&#x60; Can be \&quot;\&quot;, \&quot;status\&quot;. When left blank, sorting is done by username. &#x60;status&#x60; will sort by User&#39;s current status (Online, Away, DND, Offline), then by Username.  (optional)
     * @param roles Comma separated string used to filter users based on any of the specified system roles  Example: &#x60;?roles&#x3D;system_admin,system_user&#x60; will return users that are either system admins or system users   (optional)
     * @param channelRoles Comma separated string used to filter users based on any of the specified channel roles, can only be used in conjunction with &#x60;in_channel&#x60;  Example: &#x60;?in_channel&#x3D;4eb6axxw7fg3je5iyasnfudc5y&amp;channel_roles&#x3D;channel_user&#x60; will return users that are only channel users and not admins or guests   (optional)
     * @param teamRoles Comma separated string used to filter users based on any of the specified team roles, can only be used in conjunction with &#x60;in_team&#x60;  Example: &#x60;?in_team&#x3D;4eb6axxw7fg3je5iyasnfudc5y&amp;team_roles&#x3D;team_user&#x60; will return users that are only team users and not admins or guests   (optional)
     * @return List&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<User> getUsers(Integer page, Integer perPage, String inTeam, String notInTeam, String inChannel, String notInChannel, String inGroup, Boolean groupConstrained, Boolean withoutTeam, Boolean active, Boolean inactive, String role, String sort, String roles, String channelRoles, String teamRoles) throws RestClientException {
        return getUsersWithHttpInfo(page, perPage, inTeam, notInTeam, inChannel, notInChannel, inGroup, groupConstrained, withoutTeam, active, inactive, role, sort, roles, channelRoles, teamRoles).getBody();
    }

    /**
     * Get users
     * Get a page of a list of users. Based on query string parameters, select users from a team, channel, or select users not in a specific channel.  Some basic sorting is available using the &#x60;sort&#x60; query parameter. Sorting is currently only supported when selecting users on a team. ##### Permissions Requires an active session and (if specified) membership to the channel or team being selected from. 
     * <p><b>200</b> - User page retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of users per page. There is a maximum limit of 200 users per page. (optional, default to 60)
     * @param inTeam The ID of the team to get users for. (optional)
     * @param notInTeam The ID of the team to exclude users for. Must not be used with \&quot;in_team\&quot; query parameter. (optional)
     * @param inChannel The ID of the channel to get users for. (optional)
     * @param notInChannel The ID of the channel to exclude users for. Must be used with \&quot;in_channel\&quot; query parameter. (optional)
     * @param inGroup The ID of the group to get users for. Must have &#x60;manage_system&#x60; permission. (optional)
     * @param groupConstrained When used with &#x60;not_in_channel&#x60; or &#x60;not_in_team&#x60;, returns only the users that are allowed to join the channel or team based on its group constrains. (optional)
     * @param withoutTeam Whether or not to list users that are not on any team. This option takes precendence over &#x60;in_team&#x60;, &#x60;in_channel&#x60;, and &#x60;not_in_channel&#x60;. (optional)
     * @param active Whether or not to list only users that are active. This option cannot be used along with the &#x60;inactive&#x60; option. (optional)
     * @param inactive Whether or not to list only users that are deactivated. This option cannot be used along with the &#x60;active&#x60; option. (optional)
     * @param role Returns users that have this role. (optional)
     * @param sort Sort is only available in conjunction with certain options below. The paging parameter is also always available.  ##### &#x60;in_team&#x60; Can be \&quot;\&quot;, \&quot;last_activity_at\&quot; or \&quot;create_at\&quot;. When left blank, sorting is done by username. ##### &#x60;in_channel&#x60; Can be \&quot;\&quot;, \&quot;status\&quot;. When left blank, sorting is done by username. &#x60;status&#x60; will sort by User&#39;s current status (Online, Away, DND, Offline), then by Username.  (optional)
     * @param roles Comma separated string used to filter users based on any of the specified system roles  Example: &#x60;?roles&#x3D;system_admin,system_user&#x60; will return users that are either system admins or system users   (optional)
     * @param channelRoles Comma separated string used to filter users based on any of the specified channel roles, can only be used in conjunction with &#x60;in_channel&#x60;  Example: &#x60;?in_channel&#x3D;4eb6axxw7fg3je5iyasnfudc5y&amp;channel_roles&#x3D;channel_user&#x60; will return users that are only channel users and not admins or guests   (optional)
     * @param teamRoles Comma separated string used to filter users based on any of the specified team roles, can only be used in conjunction with &#x60;in_team&#x60;  Example: &#x60;?in_team&#x3D;4eb6axxw7fg3je5iyasnfudc5y&amp;team_roles&#x3D;team_user&#x60; will return users that are only team users and not admins or guests   (optional)
     * @return ResponseEntity&lt;List&lt;User&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<User>> getUsersWithHttpInfo(Integer page, Integer perPage, String inTeam, String notInTeam, String inChannel, String notInChannel, String inGroup, Boolean groupConstrained, Boolean withoutTeam, Boolean active, Boolean inactive, String role, String sort, String roles, String channelRoles, String teamRoles) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "in_team", inTeam));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "not_in_team", notInTeam));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "in_channel", inChannel));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "not_in_channel", notInChannel));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "in_group", inGroup));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "group_constrained", groupConstrained));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "without_team", withoutTeam));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "active", active));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "inactive", inactive));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "role", role));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "roles", roles));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "channel_roles", channelRoles));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "team_roles", teamRoles));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<User>> localReturnType = new ParameterizedTypeReference<List<User>>() {};
        return apiClient.invokeAPI("/users", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get users by group channels ids
     * Get an object containing a key per group channel id in the query and its value as a list of users members of that group channel.  The user must be a member of the group ids in the query, or they will be omitted from the response. ##### Permissions Requires an active session but no other permissions.  
     * <p><b>200</b> - User list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param requestBody List of group channel ids (required)
     * @return GetUsersByGroupChannelIds200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetUsersByGroupChannelIds200Response getUsersByGroupChannelIds(List<String> requestBody) throws RestClientException {
        return getUsersByGroupChannelIdsWithHttpInfo(requestBody).getBody();
    }

    /**
     * Get users by group channels ids
     * Get an object containing a key per group channel id in the query and its value as a list of users members of that group channel.  The user must be a member of the group ids in the query, or they will be omitted from the response. ##### Permissions Requires an active session but no other permissions.  
     * <p><b>200</b> - User list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param requestBody List of group channel ids (required)
     * @return ResponseEntity&lt;GetUsersByGroupChannelIds200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetUsersByGroupChannelIds200Response> getUsersByGroupChannelIdsWithHttpInfo(List<String> requestBody) throws RestClientException {
        Object localVarPostBody = requestBody;
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody' when calling getUsersByGroupChannelIds");
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

        ParameterizedTypeReference<GetUsersByGroupChannelIds200Response> localReturnType = new ParameterizedTypeReference<GetUsersByGroupChannelIds200Response>() {};
        return apiClient.invokeAPI("/users/group_channels", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get users by ids
     * Get a list of users based on a provided list of user ids. ##### Permissions Requires an active session but no other permissions. 
     * <p><b>200</b> - User list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param requestBody List of user ids (required)
     * @param since Only return users that have been modified since the given Unix timestamp (in milliseconds).   (optional)
     * @return List&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<User> getUsersByIds(List<String> requestBody, Integer since) throws RestClientException {
        return getUsersByIdsWithHttpInfo(requestBody, since).getBody();
    }

    /**
     * Get users by ids
     * Get a list of users based on a provided list of user ids. ##### Permissions Requires an active session but no other permissions. 
     * <p><b>200</b> - User list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param requestBody List of user ids (required)
     * @param since Only return users that have been modified since the given Unix timestamp (in milliseconds).   (optional)
     * @return ResponseEntity&lt;List&lt;User&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<User>> getUsersByIdsWithHttpInfo(List<String> requestBody, Integer since) throws RestClientException {
        Object localVarPostBody = requestBody;
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody' when calling getUsersByIds");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "since", since));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<User>> localReturnType = new ParameterizedTypeReference<List<User>>() {};
        return apiClient.invokeAPI("/users/ids", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get users by usernames
     * Get a list of users based on a provided list of usernames. ##### Permissions Requires an active session but no other permissions. 
     * <p><b>200</b> - User list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param requestBody List of usernames (required)
     * @return List&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<User> getUsersByUsernames(List<String> requestBody) throws RestClientException {
        return getUsersByUsernamesWithHttpInfo(requestBody).getBody();
    }

    /**
     * Get users by usernames
     * Get a list of users based on a provided list of usernames. ##### Permissions Requires an active session but no other permissions. 
     * <p><b>200</b> - User list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param requestBody List of usernames (required)
     * @return ResponseEntity&lt;List&lt;User&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<User>> getUsersByUsernamesWithHttpInfo(List<String> requestBody) throws RestClientException {
        Object localVarPostBody = requestBody;
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody' when calling getUsersByUsernames");
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

        ParameterizedTypeReference<List<User>> localReturnType = new ParameterizedTypeReference<List<User>>() {};
        return apiClient.invokeAPI("/users/usernames", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Patch a user
     * Partially update a user by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - User patch successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId User GUID (required)
     * @param patchUserRequest User object that is to be updated (required)
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User patchUser(String userId, PatchUserRequest patchUserRequest) throws RestClientException {
        return patchUserWithHttpInfo(userId, patchUserRequest).getBody();
    }

    /**
     * Patch a user
     * Partially update a user by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - User patch successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId User GUID (required)
     * @param patchUserRequest User object that is to be updated (required)
     * @return ResponseEntity&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<User> patchUserWithHttpInfo(String userId, PatchUserRequest patchUserRequest) throws RestClientException {
        Object localVarPostBody = patchUserRequest;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling patchUser");
        }
        
        // verify the required parameter 'patchUserRequest' is set
        if (patchUserRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'patchUserRequest' when calling patchUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);

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

        ParameterizedTypeReference<User> localReturnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI("/users/{user_id}/patch", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search users
     * Get a list of users based on search criteria provided in the request body. Searches are typically done against username, full name, nickname and email unless otherwise configured by the server. ##### Permissions Requires an active session and &#x60;read_channel&#x60; and/or &#x60;view_team&#x60; permissions for any channels or teams specified in the request body. 
     * <p><b>200</b> - User list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param searchUsersRequest Search criteria (required)
     * @return List&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<User> searchUsers(SearchUsersRequest searchUsersRequest) throws RestClientException {
        return searchUsersWithHttpInfo(searchUsersRequest).getBody();
    }

    /**
     * Search users
     * Get a list of users based on search criteria provided in the request body. Searches are typically done against username, full name, nickname and email unless otherwise configured by the server. ##### Permissions Requires an active session and &#x60;read_channel&#x60; and/or &#x60;view_team&#x60; permissions for any channels or teams specified in the request body. 
     * <p><b>200</b> - User list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param searchUsersRequest Search criteria (required)
     * @return ResponseEntity&lt;List&lt;User&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<User>> searchUsersWithHttpInfo(SearchUsersRequest searchUsersRequest) throws RestClientException {
        Object localVarPostBody = searchUsersRequest;
        
        // verify the required parameter 'searchUsersRequest' is set
        if (searchUsersRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'searchUsersRequest' when calling searchUsers");
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

        ParameterizedTypeReference<List<User>> localReturnType = new ParameterizedTypeReference<List<User>>() {};
        return apiClient.invokeAPI("/users/search", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a user&#39;s roles
     * Update a user&#39;s system-level roles. Valid user roles are \&quot;system_user\&quot;, \&quot;system_admin\&quot; or both of them. Overwrites any previously assigned system-level roles. ##### Permissions Must have the &#x60;manage_roles&#x60; permission. 
     * <p><b>200</b> - User roles update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId User GUID (required)
     * @param updateUserRolesRequest Space-delimited system roles to assign to the user (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK updateUserRoles(String userId, UpdateUserRolesRequest updateUserRolesRequest) throws RestClientException {
        return updateUserRolesWithHttpInfo(userId, updateUserRolesRequest).getBody();
    }

    /**
     * Update a user&#39;s roles
     * Update a user&#39;s system-level roles. Valid user roles are \&quot;system_user\&quot;, \&quot;system_admin\&quot; or both of them. Overwrites any previously assigned system-level roles. ##### Permissions Must have the &#x60;manage_roles&#x60; permission. 
     * <p><b>200</b> - User roles update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId User GUID (required)
     * @param updateUserRolesRequest Space-delimited system roles to assign to the user (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> updateUserRolesWithHttpInfo(String userId, UpdateUserRolesRequest updateUserRolesRequest) throws RestClientException {
        Object localVarPostBody = updateUserRolesRequest;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling updateUserRoles");
        }
        
        // verify the required parameter 'updateUserRolesRequest' is set
        if (updateUserRolesRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateUserRolesRequest' when calling updateUserRoles");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);

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
        return apiClient.invokeAPI("/users/{user_id}/roles", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
