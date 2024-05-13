package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AddChannelMemberRequest;
import org.openapitools.client.model.ApiError;
import org.openapitools.client.model.AppError;
import org.openapitools.client.model.Channel;
import org.openapitools.client.model.ChannelMember;
import org.openapitools.client.model.ChannelModeration;
import org.openapitools.client.model.ChannelModerationPatch;
import org.openapitools.client.model.ChannelNotifyProps;
import org.openapitools.client.model.ChannelStats;
import org.openapitools.client.model.ChannelUnread;
import org.openapitools.client.model.ChannelWithTeamData;
import org.openapitools.client.model.CreateChannelRequest;
import org.openapitools.client.model.MoveChannelRequest;
import org.openapitools.client.model.OrderedSidebarCategories;
import org.openapitools.client.model.PatchChannelRequest;
import org.openapitools.client.model.PostList;
import org.openapitools.client.model.SearchAllChannels200Response;
import org.openapitools.client.model.SearchAllChannelsRequest;
import org.openapitools.client.model.SearchArchivedChannelsRequest;
import org.openapitools.client.model.SearchChannelsRequest;
import org.openapitools.client.model.SearchGroupChannelsRequest;
import org.openapitools.client.model.SidebarCategory;
import org.openapitools.client.model.StatusOK;
import org.openapitools.client.model.UpdateChannelMemberSchemeRolesRequest;
import org.openapitools.client.model.UpdateChannelPrivacyRequest;
import org.openapitools.client.model.UpdateChannelRequest;
import org.openapitools.client.model.UpdateChannelSchemeRequest;
import org.openapitools.client.model.UpdateUserRolesRequest;
import org.openapitools.client.model.ViewChannel200Response;
import org.openapitools.client.model.ViewChannelRequest;

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
public class ChannelsApi {
    private ApiClient apiClient;

    public ChannelsApi() {
        this(new ApiClient());
    }

    public ChannelsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add user to channel
     * Add a user to a channel by creating a channel member object.
     * <p><b>201</b> - Channel member creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId The channel ID (required)
     * @param addChannelMemberRequest  (required)
     * @return ChannelMember
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ChannelMember addChannelMember(String channelId, AddChannelMemberRequest addChannelMemberRequest) throws RestClientException {
        return addChannelMemberWithHttpInfo(channelId, addChannelMemberRequest).getBody();
    }

    /**
     * Add user to channel
     * Add a user to a channel by creating a channel member object.
     * <p><b>201</b> - Channel member creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId The channel ID (required)
     * @param addChannelMemberRequest  (required)
     * @return ResponseEntity&lt;ChannelMember&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ChannelMember> addChannelMemberWithHttpInfo(String channelId, AddChannelMemberRequest addChannelMemberRequest) throws RestClientException {
        Object localVarPostBody = addChannelMemberRequest;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling addChannelMember");
        }
        
        // verify the required parameter 'addChannelMemberRequest' is set
        if (addChannelMemberRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addChannelMemberRequest' when calling addChannelMember");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel_id", channelId);

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

        ParameterizedTypeReference<ChannelMember> localReturnType = new ParameterizedTypeReference<ChannelMember>() {};
        return apiClient.invokeAPI("/channels/{channel_id}/members", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Autocomplete channels
     * Autocomplete public channels on a team based on the search term provided in the request URL.  ##### Permissions Must have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Channels autocomplete successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param name Name or display name (required)
     * @return List&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Channel> autocompleteChannelsForTeam(String teamId, String name) throws RestClientException {
        return autocompleteChannelsForTeamWithHttpInfo(teamId, name).getBody();
    }

    /**
     * Autocomplete channels
     * Autocomplete public channels on a team based on the search term provided in the request URL.  ##### Permissions Must have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Channels autocomplete successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param name Name or display name (required)
     * @return ResponseEntity&lt;List&lt;Channel&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Channel>> autocompleteChannelsForTeamWithHttpInfo(String teamId, String name) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling autocompleteChannelsForTeam");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling autocompleteChannelsForTeam");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Channel>> localReturnType = new ParameterizedTypeReference<List<Channel>>() {};
        return apiClient.invokeAPI("/teams/{team_id}/channels/autocomplete", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Autocomplete channels for search
     * Autocomplete your channels on a team based on the search term provided in the request URL.  ##### Permissions Must have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Channels autocomplete successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param name Name or display name (required)
     * @return List&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Channel> autocompleteChannelsForTeamForSearch(String teamId, String name) throws RestClientException {
        return autocompleteChannelsForTeamForSearchWithHttpInfo(teamId, name).getBody();
    }

    /**
     * Autocomplete channels for search
     * Autocomplete your channels on a team based on the search term provided in the request URL.  ##### Permissions Must have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Channels autocomplete successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param name Name or display name (required)
     * @return ResponseEntity&lt;List&lt;Channel&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Channel>> autocompleteChannelsForTeamForSearchWithHttpInfo(String teamId, String name) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling autocompleteChannelsForTeamForSearch");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling autocompleteChannelsForTeamForSearch");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Channel>> localReturnType = new ParameterizedTypeReference<List<Channel>>() {};
        return apiClient.invokeAPI("/teams/{team_id}/channels/search_autocomplete", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a channel
     * Create a new channel. ##### Permissions If creating a public channel, &#x60;create_public_channel&#x60; permission is required. If creating a private channel, &#x60;create_private_channel&#x60; permission is required. 
     * <p><b>201</b> - Channel creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param createChannelRequest Channel object to be created (required)
     * @return Channel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Channel createChannel(CreateChannelRequest createChannelRequest) throws RestClientException {
        return createChannelWithHttpInfo(createChannelRequest).getBody();
    }

    /**
     * Create a channel
     * Create a new channel. ##### Permissions If creating a public channel, &#x60;create_public_channel&#x60; permission is required. If creating a private channel, &#x60;create_private_channel&#x60; permission is required. 
     * <p><b>201</b> - Channel creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param createChannelRequest Channel object to be created (required)
     * @return ResponseEntity&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Channel> createChannelWithHttpInfo(CreateChannelRequest createChannelRequest) throws RestClientException {
        Object localVarPostBody = createChannelRequest;
        
        // verify the required parameter 'createChannelRequest' is set
        if (createChannelRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createChannelRequest' when calling createChannel");
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

        ParameterizedTypeReference<Channel> localReturnType = new ParameterizedTypeReference<Channel>() {};
        return apiClient.invokeAPI("/channels", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a direct message channel
     * Create a new direct message channel between two users. ##### Permissions Must be one of the two users and have &#x60;create_direct_channel&#x60; permission. Having the &#x60;manage_system&#x60; permission voids the previous requirements. 
     * <p><b>201</b> - Direct channel creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param requestBody The two user ids to be in the direct message (required)
     * @return Channel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Channel createDirectChannel(List<String> requestBody) throws RestClientException {
        return createDirectChannelWithHttpInfo(requestBody).getBody();
    }

    /**
     * Create a direct message channel
     * Create a new direct message channel between two users. ##### Permissions Must be one of the two users and have &#x60;create_direct_channel&#x60; permission. Having the &#x60;manage_system&#x60; permission voids the previous requirements. 
     * <p><b>201</b> - Direct channel creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param requestBody The two user ids to be in the direct message (required)
     * @return ResponseEntity&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Channel> createDirectChannelWithHttpInfo(List<String> requestBody) throws RestClientException {
        Object localVarPostBody = requestBody;
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody' when calling createDirectChannel");
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

        ParameterizedTypeReference<Channel> localReturnType = new ParameterizedTypeReference<Channel>() {};
        return apiClient.invokeAPI("/channels/direct", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a group message channel
     * Create a new group message channel to group of users. If the logged in user&#39;s id is not included in the list, it will be appended to the end. ##### Permissions Must have &#x60;create_group_channel&#x60; permission. 
     * <p><b>201</b> - Group channel creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param requestBody User ids to be in the group message channel (required)
     * @return Channel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Channel createGroupChannel(List<String> requestBody) throws RestClientException {
        return createGroupChannelWithHttpInfo(requestBody).getBody();
    }

    /**
     * Create a group message channel
     * Create a new group message channel to group of users. If the logged in user&#39;s id is not included in the list, it will be appended to the end. ##### Permissions Must have &#x60;create_group_channel&#x60; permission. 
     * <p><b>201</b> - Group channel creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param requestBody User ids to be in the group message channel (required)
     * @return ResponseEntity&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Channel> createGroupChannelWithHttpInfo(List<String> requestBody) throws RestClientException {
        Object localVarPostBody = requestBody;
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody' when calling createGroupChannel");
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

        ParameterizedTypeReference<Channel> localReturnType = new ParameterizedTypeReference<Channel>() {};
        return apiClient.invokeAPI("/channels/group", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create user&#39;s sidebar category
     * Create a custom sidebar category for the user on the given team. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Category creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param userId User GUID (required)
     * @param sidebarCategory  (required)
     * @return SidebarCategory
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SidebarCategory createSidebarCategoryForTeamForUser(String teamId, String userId, SidebarCategory sidebarCategory) throws RestClientException {
        return createSidebarCategoryForTeamForUserWithHttpInfo(teamId, userId, sidebarCategory).getBody();
    }

    /**
     * Create user&#39;s sidebar category
     * Create a custom sidebar category for the user on the given team. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Category creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param userId User GUID (required)
     * @param sidebarCategory  (required)
     * @return ResponseEntity&lt;SidebarCategory&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SidebarCategory> createSidebarCategoryForTeamForUserWithHttpInfo(String teamId, String userId, SidebarCategory sidebarCategory) throws RestClientException {
        Object localVarPostBody = sidebarCategory;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling createSidebarCategoryForTeamForUser");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling createSidebarCategoryForTeamForUser");
        }
        
        // verify the required parameter 'sidebarCategory' is set
        if (sidebarCategory == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sidebarCategory' when calling createSidebarCategoryForTeamForUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);
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

        ParameterizedTypeReference<SidebarCategory> localReturnType = new ParameterizedTypeReference<SidebarCategory>() {};
        return apiClient.invokeAPI("/users/{user_id}/teams/{team_id}/channels/categories", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a channel
     * Archives a channel. This will set the &#x60;deleteAt&#x60; to the current timestamp in the database. Soft deleted channels may not be accessible in the user interface. They can be viewed and unarchived in the **System Console &gt; User Management &gt; Channels** based on your license. Direct and group message channels cannot be deleted.  ##### Permissions &#x60;delete_public_channel&#x60; permission if the channel is public, &#x60;delete_private_channel&#x60; permission if the channel is private, or have &#x60;manage_system&#x60; permission. 
     * <p><b>200</b> - Channel deletion successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId Channel GUID (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK deleteChannel(String channelId) throws RestClientException {
        return deleteChannelWithHttpInfo(channelId).getBody();
    }

    /**
     * Delete a channel
     * Archives a channel. This will set the &#x60;deleteAt&#x60; to the current timestamp in the database. Soft deleted channels may not be accessible in the user interface. They can be viewed and unarchived in the **System Console &gt; User Management &gt; Channels** based on your license. Direct and group message channels cannot be deleted.  ##### Permissions &#x60;delete_public_channel&#x60; permission if the channel is public, &#x60;delete_private_channel&#x60; permission if the channel is private, or have &#x60;manage_system&#x60; permission. 
     * <p><b>200</b> - Channel deletion successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId Channel GUID (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> deleteChannelWithHttpInfo(String channelId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling deleteChannel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel_id", channelId);

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
        return apiClient.invokeAPI("/channels/{channel_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of all channels
     * ##### Permissions &#x60;manage_system&#x60; 
     * <p><b>200</b> - Channel list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param notAssociatedToGroup A group id to exclude channels that are associated with that group via GroupChannel records. This can also be left blank with &#x60;not_associated_to_group&#x3D;&#x60;. (optional)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of channels per page. (optional, default to 0)
     * @param excludeDefaultChannels Whether to exclude default channels (ex Town Square, Off-Topic) from the results. (optional, default to false)
     * @param includeDeleted Include channels that have been archived. This correlates to the &#x60;DeleteAt&#x60; flag being set in the database. (optional, default to false)
     * @param includeTotalCount Appends a total count of returned channels inside the response object - ex: &#x60;{ \&quot;channels\&quot;: [], \&quot;total_count\&quot; : 0 }&#x60;.       (optional, default to false)
     * @param excludePolicyConstrained If set to true, channels which are part of a data retention policy will be excluded. The &#x60;sysconsole_read_compliance&#x60; permission is required to use this parameter.  (optional, default to false)
     * @return List&lt;ChannelWithTeamData&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ChannelWithTeamData> getAllChannels(String notAssociatedToGroup, Integer page, Integer perPage, Boolean excludeDefaultChannels, Boolean includeDeleted, Boolean includeTotalCount, Boolean excludePolicyConstrained) throws RestClientException {
        return getAllChannelsWithHttpInfo(notAssociatedToGroup, page, perPage, excludeDefaultChannels, includeDeleted, includeTotalCount, excludePolicyConstrained).getBody();
    }

    /**
     * Get a list of all channels
     * ##### Permissions &#x60;manage_system&#x60; 
     * <p><b>200</b> - Channel list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param notAssociatedToGroup A group id to exclude channels that are associated with that group via GroupChannel records. This can also be left blank with &#x60;not_associated_to_group&#x3D;&#x60;. (optional)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of channels per page. (optional, default to 0)
     * @param excludeDefaultChannels Whether to exclude default channels (ex Town Square, Off-Topic) from the results. (optional, default to false)
     * @param includeDeleted Include channels that have been archived. This correlates to the &#x60;DeleteAt&#x60; flag being set in the database. (optional, default to false)
     * @param includeTotalCount Appends a total count of returned channels inside the response object - ex: &#x60;{ \&quot;channels\&quot;: [], \&quot;total_count\&quot; : 0 }&#x60;.       (optional, default to false)
     * @param excludePolicyConstrained If set to true, channels which are part of a data retention policy will be excluded. The &#x60;sysconsole_read_compliance&#x60; permission is required to use this parameter.  (optional, default to false)
     * @return ResponseEntity&lt;List&lt;ChannelWithTeamData&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ChannelWithTeamData>> getAllChannelsWithHttpInfo(String notAssociatedToGroup, Integer page, Integer perPage, Boolean excludeDefaultChannels, Boolean includeDeleted, Boolean includeTotalCount, Boolean excludePolicyConstrained) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "not_associated_to_group", notAssociatedToGroup));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "exclude_default_channels", excludeDefaultChannels));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_deleted", includeDeleted));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_total_count", includeTotalCount));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "exclude_policy_constrained", excludePolicyConstrained));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<ChannelWithTeamData>> localReturnType = new ParameterizedTypeReference<List<ChannelWithTeamData>>() {};
        return apiClient.invokeAPI("/channels", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a channel
     * Get channel from the provided channel id string. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 
     * <p><b>200</b> - Channel retrieval successful
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param channelId Channel GUID (required)
     * @return Channel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Channel getChannel(String channelId) throws RestClientException {
        return getChannelWithHttpInfo(channelId).getBody();
    }

    /**
     * Get a channel
     * Get channel from the provided channel id string. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 
     * <p><b>200</b> - Channel retrieval successful
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param channelId Channel GUID (required)
     * @return ResponseEntity&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Channel> getChannelWithHttpInfo(String channelId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling getChannel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel_id", channelId);

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

        ParameterizedTypeReference<Channel> localReturnType = new ParameterizedTypeReference<Channel>() {};
        return apiClient.invokeAPI("/channels/{channel_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a channel by name
     * Gets channel from the provided team id and channel name strings. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 
     * <p><b>200</b> - Channel retrieval successful
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param channelName Channel Name (required)
     * @param includeDeleted Defines if deleted channels should be returned or not (Mattermost Server 5.26.0+) (optional, default to false)
     * @return Channel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Channel getChannelByName(String teamId, String channelName, Boolean includeDeleted) throws RestClientException {
        return getChannelByNameWithHttpInfo(teamId, channelName, includeDeleted).getBody();
    }

    /**
     * Get a channel by name
     * Gets channel from the provided team id and channel name strings. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 
     * <p><b>200</b> - Channel retrieval successful
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param channelName Channel Name (required)
     * @param includeDeleted Defines if deleted channels should be returned or not (Mattermost Server 5.26.0+) (optional, default to false)
     * @return ResponseEntity&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Channel> getChannelByNameWithHttpInfo(String teamId, String channelName, Boolean includeDeleted) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getChannelByName");
        }
        
        // verify the required parameter 'channelName' is set
        if (channelName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelName' when calling getChannelByName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);
        uriVariables.put("channel_name", channelName);

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

        ParameterizedTypeReference<Channel> localReturnType = new ParameterizedTypeReference<Channel>() {};
        return apiClient.invokeAPI("/teams/{team_id}/channels/name/{channel_name}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a channel by name and team name
     * Gets a channel from the provided team name and channel name strings. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 
     * <p><b>200</b> - Channel retrieval successful
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamName Team Name (required)
     * @param channelName Channel Name (required)
     * @param includeDeleted Defines if deleted channels should be returned or not (Mattermost Server 5.26.0+) (optional, default to false)
     * @return Channel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Channel getChannelByNameForTeamName(String teamName, String channelName, Boolean includeDeleted) throws RestClientException {
        return getChannelByNameForTeamNameWithHttpInfo(teamName, channelName, includeDeleted).getBody();
    }

    /**
     * Get a channel by name and team name
     * Gets a channel from the provided team name and channel name strings. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 
     * <p><b>200</b> - Channel retrieval successful
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamName Team Name (required)
     * @param channelName Channel Name (required)
     * @param includeDeleted Defines if deleted channels should be returned or not (Mattermost Server 5.26.0+) (optional, default to false)
     * @return ResponseEntity&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Channel> getChannelByNameForTeamNameWithHttpInfo(String teamName, String channelName, Boolean includeDeleted) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamName' is set
        if (teamName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamName' when calling getChannelByNameForTeamName");
        }
        
        // verify the required parameter 'channelName' is set
        if (channelName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelName' when calling getChannelByNameForTeamName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_name", teamName);
        uriVariables.put("channel_name", channelName);

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

        ParameterizedTypeReference<Channel> localReturnType = new ParameterizedTypeReference<Channel>() {};
        return apiClient.invokeAPI("/teams/name/{team_name}/channels/name/{channel_name}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get channel member
     * Get a channel member. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 
     * <p><b>200</b> - Channel member retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId Channel GUID (required)
     * @param userId User GUID (required)
     * @return ChannelMember
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ChannelMember getChannelMember(String channelId, String userId) throws RestClientException {
        return getChannelMemberWithHttpInfo(channelId, userId).getBody();
    }

    /**
     * Get channel member
     * Get a channel member. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 
     * <p><b>200</b> - Channel member retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId Channel GUID (required)
     * @param userId User GUID (required)
     * @return ResponseEntity&lt;ChannelMember&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ChannelMember> getChannelMemberWithHttpInfo(String channelId, String userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling getChannelMember");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getChannelMember");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel_id", channelId);
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

        ParameterizedTypeReference<ChannelMember> localReturnType = new ParameterizedTypeReference<ChannelMember>() {};
        return apiClient.invokeAPI("/channels/{channel_id}/members/{user_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get channel members
     * Get a page of members for a channel. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 
     * <p><b>200</b> - Channel members retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId Channel GUID (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of members per page. There is a maximum limit of 200 members. (optional, default to 60)
     * @return List&lt;ChannelMember&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ChannelMember> getChannelMembers(String channelId, Integer page, Integer perPage) throws RestClientException {
        return getChannelMembersWithHttpInfo(channelId, page, perPage).getBody();
    }

    /**
     * Get channel members
     * Get a page of members for a channel. ##### Permissions &#x60;read_channel&#x60; permission for the channel. 
     * <p><b>200</b> - Channel members retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId Channel GUID (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of members per page. There is a maximum limit of 200 members. (optional, default to 60)
     * @return ResponseEntity&lt;List&lt;ChannelMember&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ChannelMember>> getChannelMembersWithHttpInfo(String channelId, Integer page, Integer perPage) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling getChannelMembers");
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
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<ChannelMember>> localReturnType = new ParameterizedTypeReference<List<ChannelMember>>() {};
        return apiClient.invokeAPI("/channels/{channel_id}/members", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get channel members by ids
     * Get a list of channel members based on the provided user ids. ##### Permissions Must have the &#x60;read_channel&#x60; permission. 
     * <p><b>200</b> - Channel member list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param channelId Channel GUID (required)
     * @param requestBody List of user ids (required)
     * @return List&lt;ChannelMember&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ChannelMember> getChannelMembersByIds(String channelId, List<String> requestBody) throws RestClientException {
        return getChannelMembersByIdsWithHttpInfo(channelId, requestBody).getBody();
    }

    /**
     * Get channel members by ids
     * Get a list of channel members based on the provided user ids. ##### Permissions Must have the &#x60;read_channel&#x60; permission. 
     * <p><b>200</b> - Channel member list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param channelId Channel GUID (required)
     * @param requestBody List of user ids (required)
     * @return ResponseEntity&lt;List&lt;ChannelMember&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ChannelMember>> getChannelMembersByIdsWithHttpInfo(String channelId, List<String> requestBody) throws RestClientException {
        Object localVarPostBody = requestBody;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling getChannelMembersByIds");
        }
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody' when calling getChannelMembersByIds");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel_id", channelId);

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

        ParameterizedTypeReference<List<ChannelMember>> localReturnType = new ParameterizedTypeReference<List<ChannelMember>>() {};
        return apiClient.invokeAPI("/channels/{channel_id}/members/ids", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get channel memberships and roles for a user
     * Get all channel memberships and associated membership roles (i.e. &#x60;channel_user&#x60;, &#x60;channel_admin&#x60;) for a user on a specific team. ##### Permissions Logged in as the user and &#x60;view_team&#x60; permission for the team. Having &#x60;manage_system&#x60; permission voids the previous requirements. 
     * <p><b>200</b> - Channel members retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId User GUID (required)
     * @param teamId Team GUID (required)
     * @return List&lt;ChannelMember&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ChannelMember> getChannelMembersForUser(String userId, String teamId) throws RestClientException {
        return getChannelMembersForUserWithHttpInfo(userId, teamId).getBody();
    }

    /**
     * Get channel memberships and roles for a user
     * Get all channel memberships and associated membership roles (i.e. &#x60;channel_user&#x60;, &#x60;channel_admin&#x60;) for a user on a specific team. ##### Permissions Logged in as the user and &#x60;view_team&#x60; permission for the team. Having &#x60;manage_system&#x60; permission voids the previous requirements. 
     * <p><b>200</b> - Channel members retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId User GUID (required)
     * @param teamId Team GUID (required)
     * @return ResponseEntity&lt;List&lt;ChannelMember&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ChannelMember>> getChannelMembersForUserWithHttpInfo(String userId, String teamId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getChannelMembersForUser");
        }
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getChannelMembersForUser");
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

        ParameterizedTypeReference<List<ChannelMember>> localReturnType = new ParameterizedTypeReference<List<ChannelMember>>() {};
        return apiClient.invokeAPI("/users/{user_id}/teams/{team_id}/channels/members", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get information about channel&#39;s moderation.
     * ##### Permissions Must have &#x60;manage_system&#x60; permission.  
     * <p><b>200</b> - Retreived successfully
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId Channel GUID (required)
     * @return List&lt;ChannelModeration&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ChannelModeration> getChannelModerations(String channelId) throws RestClientException {
        return getChannelModerationsWithHttpInfo(channelId).getBody();
    }

    /**
     * Get information about channel&#39;s moderation.
     * ##### Permissions Must have &#x60;manage_system&#x60; permission.  
     * <p><b>200</b> - Retreived successfully
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId Channel GUID (required)
     * @return ResponseEntity&lt;List&lt;ChannelModeration&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ChannelModeration>> getChannelModerationsWithHttpInfo(String channelId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling getChannelModerations");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel_id", channelId);

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

        ParameterizedTypeReference<List<ChannelModeration>> localReturnType = new ParameterizedTypeReference<List<ChannelModeration>>() {};
        return apiClient.invokeAPI("/channels/{channel_id}/moderations", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get channel statistics
     * Get statistics for a channel. ##### Permissions Must have the &#x60;read_channel&#x60; permission. 
     * <p><b>200</b> - Channel statistics retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId Channel GUID (required)
     * @return ChannelStats
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ChannelStats getChannelStats(String channelId) throws RestClientException {
        return getChannelStatsWithHttpInfo(channelId).getBody();
    }

    /**
     * Get channel statistics
     * Get statistics for a channel. ##### Permissions Must have the &#x60;read_channel&#x60; permission. 
     * <p><b>200</b> - Channel statistics retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId Channel GUID (required)
     * @return ResponseEntity&lt;ChannelStats&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ChannelStats> getChannelStatsWithHttpInfo(String channelId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling getChannelStats");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel_id", channelId);

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

        ParameterizedTypeReference<ChannelStats> localReturnType = new ParameterizedTypeReference<ChannelStats>() {};
        return apiClient.invokeAPI("/channels/{channel_id}/stats", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get unread messages
     * Get the total unread messages and mentions for a channel for a user. ##### Permissions Must be logged in as user and have the &#x60;read_channel&#x60; permission, or have &#x60;edit_other_usrs&#x60; permission. 
     * <p><b>200</b> - Channel unreads retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param userId User GUID (required)
     * @param channelId Channel GUID (required)
     * @return ChannelUnread
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ChannelUnread getChannelUnread(String userId, String channelId) throws RestClientException {
        return getChannelUnreadWithHttpInfo(userId, channelId).getBody();
    }

    /**
     * Get unread messages
     * Get the total unread messages and mentions for a channel for a user. ##### Permissions Must be logged in as user and have the &#x60;read_channel&#x60; permission, or have &#x60;edit_other_usrs&#x60; permission. 
     * <p><b>200</b> - Channel unreads retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param userId User GUID (required)
     * @param channelId Channel GUID (required)
     * @return ResponseEntity&lt;ChannelUnread&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ChannelUnread> getChannelUnreadWithHttpInfo(String userId, String channelId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getChannelUnread");
        }
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling getChannelUnread");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("channel_id", channelId);

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

        ParameterizedTypeReference<ChannelUnread> localReturnType = new ParameterizedTypeReference<ChannelUnread>() {};
        return apiClient.invokeAPI("/users/{user_id}/channels/{channel_id}/unread", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get channels for user
     * Get all the channels on a team for a user. ##### Permissions Logged in as the user, or have &#x60;edit_other_users&#x60; permission, and &#x60;view_team&#x60; permission for the team. 
     * <p><b>200</b> - Channels retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param userId User GUID (required)
     * @param teamId Team GUID (required)
     * @param includeDeleted Defines if deleted channels should be returned or not (optional, default to false)
     * @param lastDeleteAt Filters the deleted channels by this time in epoch format. Does not have any effect if include_deleted is set to false. (optional, default to 0)
     * @return List&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Channel> getChannelsForTeamForUser(String userId, String teamId, Boolean includeDeleted, Integer lastDeleteAt) throws RestClientException {
        return getChannelsForTeamForUserWithHttpInfo(userId, teamId, includeDeleted, lastDeleteAt).getBody();
    }

    /**
     * Get channels for user
     * Get all the channels on a team for a user. ##### Permissions Logged in as the user, or have &#x60;edit_other_users&#x60; permission, and &#x60;view_team&#x60; permission for the team. 
     * <p><b>200</b> - Channels retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param userId User GUID (required)
     * @param teamId Team GUID (required)
     * @param includeDeleted Defines if deleted channels should be returned or not (optional, default to false)
     * @param lastDeleteAt Filters the deleted channels by this time in epoch format. Does not have any effect if include_deleted is set to false. (optional, default to 0)
     * @return ResponseEntity&lt;List&lt;Channel&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Channel>> getChannelsForTeamForUserWithHttpInfo(String userId, String teamId, Boolean includeDeleted, Integer lastDeleteAt) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getChannelsForTeamForUser");
        }
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getChannelsForTeamForUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("team_id", teamId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_deleted", includeDeleted));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_delete_at", lastDeleteAt));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Channel>> localReturnType = new ParameterizedTypeReference<List<Channel>>() {};
        return apiClient.invokeAPI("/users/{user_id}/teams/{team_id}/channels", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all channels
     * Get all channels that a user is a member of.  ##### Permissions  Logged in as the user, or have &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - Channels retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param userId The ID of the user. This can also be \&quot;me\&quot; which will point to the current user. (required)
     * @param lastDeleteAt Filters the deleted channels by this time in epoch format. Does not have any effect if include_deleted is set to false. (optional, default to 0)
     * @param includeDeleted Defines if deleted channels should be returned or not (optional, default to false)
     * @return List&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Channel> getChannelsForUser(String userId, Integer lastDeleteAt, Boolean includeDeleted) throws RestClientException {
        return getChannelsForUserWithHttpInfo(userId, lastDeleteAt, includeDeleted).getBody();
    }

    /**
     * Get all channels
     * Get all channels that a user is a member of.  ##### Permissions  Logged in as the user, or have &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - Channels retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param userId The ID of the user. This can also be \&quot;me\&quot; which will point to the current user. (required)
     * @param lastDeleteAt Filters the deleted channels by this time in epoch format. Does not have any effect if include_deleted is set to false. (optional, default to 0)
     * @param includeDeleted Defines if deleted channels should be returned or not (optional, default to false)
     * @return ResponseEntity&lt;List&lt;Channel&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Channel>> getChannelsForUserWithHttpInfo(String userId, Integer lastDeleteAt, Boolean includeDeleted) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getChannelsForUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "last_delete_at", lastDeleteAt));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_deleted", includeDeleted));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Channel>> localReturnType = new ParameterizedTypeReference<List<Channel>>() {};
        return apiClient.invokeAPI("/users/{user_id}/channels", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get deleted channels
     * Get a page of deleted channels on a team based on query string parameters - team_id, page and per_page.  
     * <p><b>200</b> - Channels retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of public channels per page. (optional, default to 60)
     * @return List&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Channel> getDeletedChannelsForTeam(String teamId, Integer page, Integer perPage) throws RestClientException {
        return getDeletedChannelsForTeamWithHttpInfo(teamId, page, perPage).getBody();
    }

    /**
     * Get deleted channels
     * Get a page of deleted channels on a team based on query string parameters - team_id, page and per_page.  
     * <p><b>200</b> - Channels retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of public channels per page. (optional, default to 60)
     * @return ResponseEntity&lt;List&lt;Channel&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Channel>> getDeletedChannelsForTeamWithHttpInfo(String teamId, Integer page, Integer perPage) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getDeletedChannelsForTeam");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Channel>> localReturnType = new ParameterizedTypeReference<List<Channel>>() {};
        return apiClient.invokeAPI("/teams/{team_id}/channels/deleted", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a channel&#39;s pinned posts
     * Get a list of pinned posts for channel.
     * <p><b>200</b> - The list of channel pinned posts
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId Channel GUID (required)
     * @return PostList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostList getPinnedPosts(String channelId) throws RestClientException {
        return getPinnedPostsWithHttpInfo(channelId).getBody();
    }

    /**
     * Get a channel&#39;s pinned posts
     * Get a list of pinned posts for channel.
     * <p><b>200</b> - The list of channel pinned posts
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId Channel GUID (required)
     * @return ResponseEntity&lt;PostList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostList> getPinnedPostsWithHttpInfo(String channelId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling getPinnedPosts");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel_id", channelId);

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

        ParameterizedTypeReference<PostList> localReturnType = new ParameterizedTypeReference<PostList>() {};
        return apiClient.invokeAPI("/channels/{channel_id}/pinned", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get private channels
     * Get a page of private channels on a team based on query string parameters - team_id, page and per_page.   ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     * <p><b>200</b> - Channels retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of private channels per page. (optional, default to 60)
     * @return List&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Channel> getPrivateChannelsForTeam(String teamId, Integer page, Integer perPage) throws RestClientException {
        return getPrivateChannelsForTeamWithHttpInfo(teamId, page, perPage).getBody();
    }

    /**
     * Get private channels
     * Get a page of private channels on a team based on query string parameters - team_id, page and per_page.   ##### Permissions Must have &#x60;manage_system&#x60; permission. 
     * <p><b>200</b> - Channels retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of private channels per page. (optional, default to 60)
     * @return ResponseEntity&lt;List&lt;Channel&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Channel>> getPrivateChannelsForTeamWithHttpInfo(String teamId, Integer page, Integer perPage) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getPrivateChannelsForTeam");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Channel>> localReturnType = new ParameterizedTypeReference<List<Channel>>() {};
        return apiClient.invokeAPI("/teams/{team_id}/channels/private", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of channels by ids
     * Get a list of public channels on a team by id. ##### Permissions &#x60;view_team&#x60; for the team the channels are on. 
     * <p><b>200</b> - Channel list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param requestBody List of channel ids (required)
     * @return List&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Channel> getPublicChannelsByIdsForTeam(String teamId, List<String> requestBody) throws RestClientException {
        return getPublicChannelsByIdsForTeamWithHttpInfo(teamId, requestBody).getBody();
    }

    /**
     * Get a list of channels by ids
     * Get a list of public channels on a team by id. ##### Permissions &#x60;view_team&#x60; for the team the channels are on. 
     * <p><b>200</b> - Channel list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param requestBody List of channel ids (required)
     * @return ResponseEntity&lt;List&lt;Channel&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Channel>> getPublicChannelsByIdsForTeamWithHttpInfo(String teamId, List<String> requestBody) throws RestClientException {
        Object localVarPostBody = requestBody;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getPublicChannelsByIdsForTeam");
        }
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody' when calling getPublicChannelsByIdsForTeam");
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

        ParameterizedTypeReference<List<Channel>> localReturnType = new ParameterizedTypeReference<List<Channel>>() {};
        return apiClient.invokeAPI("/teams/{team_id}/channels/ids", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get public channels
     * Get a page of public channels on a team based on query string parameters - page and per_page. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Channels retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of public channels per page. (optional, default to 60)
     * @return List&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Channel> getPublicChannelsForTeam(String teamId, Integer page, Integer perPage) throws RestClientException {
        return getPublicChannelsForTeamWithHttpInfo(teamId, page, perPage).getBody();
    }

    /**
     * Get public channels
     * Get a page of public channels on a team based on query string parameters - page and per_page. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Channels retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of public channels per page. (optional, default to 60)
     * @return ResponseEntity&lt;List&lt;Channel&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Channel>> getPublicChannelsForTeamWithHttpInfo(String teamId, Integer page, Integer perPage) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getPublicChannelsForTeam");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Channel>> localReturnType = new ParameterizedTypeReference<List<Channel>>() {};
        return apiClient.invokeAPI("/teams/{team_id}/channels", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get user&#39;s sidebar categories
     * Get a list of sidebar categories that will appear in the user&#39;s sidebar on the given team, including a list of channel IDs in each category. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Category retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param userId User GUID (required)
     * @return List&lt;OrderedSidebarCategories&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<OrderedSidebarCategories> getSidebarCategoriesForTeamForUser(String teamId, String userId) throws RestClientException {
        return getSidebarCategoriesForTeamForUserWithHttpInfo(teamId, userId).getBody();
    }

    /**
     * Get user&#39;s sidebar categories
     * Get a list of sidebar categories that will appear in the user&#39;s sidebar on the given team, including a list of channel IDs in each category. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Category retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param userId User GUID (required)
     * @return ResponseEntity&lt;List&lt;OrderedSidebarCategories&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<OrderedSidebarCategories>> getSidebarCategoriesForTeamForUserWithHttpInfo(String teamId, String userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getSidebarCategoriesForTeamForUser");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getSidebarCategoriesForTeamForUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);
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

        ParameterizedTypeReference<List<OrderedSidebarCategories>> localReturnType = new ParameterizedTypeReference<List<OrderedSidebarCategories>>() {};
        return apiClient.invokeAPI("/users/{user_id}/teams/{team_id}/channels/categories", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get sidebar category
     * Returns a single sidebar category for the user on the given team. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Category retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param userId User GUID (required)
     * @param categoryId Category GUID (required)
     * @return SidebarCategory
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SidebarCategory getSidebarCategoryForTeamForUser(String teamId, String userId, String categoryId) throws RestClientException {
        return getSidebarCategoryForTeamForUserWithHttpInfo(teamId, userId, categoryId).getBody();
    }

    /**
     * Get sidebar category
     * Returns a single sidebar category for the user on the given team. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Category retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param userId User GUID (required)
     * @param categoryId Category GUID (required)
     * @return ResponseEntity&lt;SidebarCategory&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SidebarCategory> getSidebarCategoryForTeamForUserWithHttpInfo(String teamId, String userId, String categoryId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getSidebarCategoryForTeamForUser");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getSidebarCategoryForTeamForUser");
        }
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'categoryId' when calling getSidebarCategoryForTeamForUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);
        uriVariables.put("user_id", userId);
        uriVariables.put("category_id", categoryId);

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

        ParameterizedTypeReference<SidebarCategory> localReturnType = new ParameterizedTypeReference<SidebarCategory>() {};
        return apiClient.invokeAPI("/users/{user_id}/teams/{team_id}/channels/categories/{category_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get user&#39;s sidebar category order
     * Returns the order of the sidebar categories for a user on the given team as an array of IDs. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Order retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param userId User GUID (required)
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> getSidebarCategoryOrderForTeamForUser(String teamId, String userId) throws RestClientException {
        return getSidebarCategoryOrderForTeamForUserWithHttpInfo(teamId, userId).getBody();
    }

    /**
     * Get user&#39;s sidebar category order
     * Returns the order of the sidebar categories for a user on the given team as an array of IDs. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Order retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param userId User GUID (required)
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> getSidebarCategoryOrderForTeamForUserWithHttpInfo(String teamId, String userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getSidebarCategoryOrderForTeamForUser");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getSidebarCategoryOrderForTeamForUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);
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

        ParameterizedTypeReference<List<String>> localReturnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI("/users/{user_id}/teams/{team_id}/channels/categories/order", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Move a channel
     * Move a channel to another team.   ##### Permissions  Must have &#x60;manage_system&#x60; permission. 
     * <p><b>200</b> - Channel move successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param channelId Channel GUID (required)
     * @param moveChannelRequest  (required)
     * @return Channel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Channel moveChannel(String channelId, MoveChannelRequest moveChannelRequest) throws RestClientException {
        return moveChannelWithHttpInfo(channelId, moveChannelRequest).getBody();
    }

    /**
     * Move a channel
     * Move a channel to another team.   ##### Permissions  Must have &#x60;manage_system&#x60; permission. 
     * <p><b>200</b> - Channel move successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param channelId Channel GUID (required)
     * @param moveChannelRequest  (required)
     * @return ResponseEntity&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Channel> moveChannelWithHttpInfo(String channelId, MoveChannelRequest moveChannelRequest) throws RestClientException {
        Object localVarPostBody = moveChannelRequest;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling moveChannel");
        }
        
        // verify the required parameter 'moveChannelRequest' is set
        if (moveChannelRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'moveChannelRequest' when calling moveChannel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel_id", channelId);

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

        ParameterizedTypeReference<Channel> localReturnType = new ParameterizedTypeReference<Channel>() {};
        return apiClient.invokeAPI("/channels/{channel_id}/move", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Patch a channel
     * Partially update a channel by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions If updating a public channel, &#x60;manage_public_channel_members&#x60; permission is required. If updating a private channel, &#x60;manage_private_channel_members&#x60; permission is required. 
     * <p><b>200</b> - Channel patch successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param channelId Channel GUID (required)
     * @param patchChannelRequest Channel object to be updated (required)
     * @return Channel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Channel patchChannel(String channelId, PatchChannelRequest patchChannelRequest) throws RestClientException {
        return patchChannelWithHttpInfo(channelId, patchChannelRequest).getBody();
    }

    /**
     * Patch a channel
     * Partially update a channel by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions If updating a public channel, &#x60;manage_public_channel_members&#x60; permission is required. If updating a private channel, &#x60;manage_private_channel_members&#x60; permission is required. 
     * <p><b>200</b> - Channel patch successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param channelId Channel GUID (required)
     * @param patchChannelRequest Channel object to be updated (required)
     * @return ResponseEntity&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Channel> patchChannelWithHttpInfo(String channelId, PatchChannelRequest patchChannelRequest) throws RestClientException {
        Object localVarPostBody = patchChannelRequest;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling patchChannel");
        }
        
        // verify the required parameter 'patchChannelRequest' is set
        if (patchChannelRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'patchChannelRequest' when calling patchChannel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel_id", channelId);

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

        ParameterizedTypeReference<Channel> localReturnType = new ParameterizedTypeReference<Channel>() {};
        return apiClient.invokeAPI("/channels/{channel_id}/patch", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a channel&#39;s moderation settings.
     * ##### Permissions Must have &#x60;manage_system&#x60; permission.  
     * <p><b>200</b> - Patched successfully
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId Channel GUID (required)
     * @param channelModerationPatch  (required)
     * @return List&lt;ChannelModeration&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ChannelModeration> patchChannelModerations(String channelId, ChannelModerationPatch channelModerationPatch) throws RestClientException {
        return patchChannelModerationsWithHttpInfo(channelId, channelModerationPatch).getBody();
    }

    /**
     * Update a channel&#39;s moderation settings.
     * ##### Permissions Must have &#x60;manage_system&#x60; permission.  
     * <p><b>200</b> - Patched successfully
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId Channel GUID (required)
     * @param channelModerationPatch  (required)
     * @return ResponseEntity&lt;List&lt;ChannelModeration&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ChannelModeration>> patchChannelModerationsWithHttpInfo(String channelId, ChannelModerationPatch channelModerationPatch) throws RestClientException {
        Object localVarPostBody = channelModerationPatch;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling patchChannelModerations");
        }
        
        // verify the required parameter 'channelModerationPatch' is set
        if (channelModerationPatch == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelModerationPatch' when calling patchChannelModerations");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel_id", channelId);

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

        ParameterizedTypeReference<List<ChannelModeration>> localReturnType = new ParameterizedTypeReference<List<ChannelModeration>>() {};
        return apiClient.invokeAPI("/channels/{channel_id}/moderations/patch", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete sidebar category
     * Deletes a single sidebar category for the user on the given team. Only custom categories can be deleted. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Category delete successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param userId User GUID (required)
     * @param categoryId Category GUID (required)
     * @return SidebarCategory
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SidebarCategory removeSidebarCategoryForTeamForUser(String teamId, String userId, String categoryId) throws RestClientException {
        return removeSidebarCategoryForTeamForUserWithHttpInfo(teamId, userId, categoryId).getBody();
    }

    /**
     * Delete sidebar category
     * Deletes a single sidebar category for the user on the given team. Only custom categories can be deleted. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Category delete successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param userId User GUID (required)
     * @param categoryId Category GUID (required)
     * @return ResponseEntity&lt;SidebarCategory&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SidebarCategory> removeSidebarCategoryForTeamForUserWithHttpInfo(String teamId, String userId, String categoryId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling removeSidebarCategoryForTeamForUser");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling removeSidebarCategoryForTeamForUser");
        }
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'categoryId' when calling removeSidebarCategoryForTeamForUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);
        uriVariables.put("user_id", userId);
        uriVariables.put("category_id", categoryId);

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

        ParameterizedTypeReference<SidebarCategory> localReturnType = new ParameterizedTypeReference<SidebarCategory>() {};
        return apiClient.invokeAPI("/users/{user_id}/teams/{team_id}/channels/categories/{category_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Remove user from channel
     * Delete a channel member, effectively removing them from a channel.  Channel members can only be deleted from public or private channels. ##### Permissions &#x60;manage_public_channel_members&#x60; permission if the channel is public. &#x60;manage_private_channel_members&#x60; permission if the channel is private. 
     * <p><b>200</b> - Channel member deletion successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId Channel GUID (required)
     * @param userId User GUID (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK removeUserFromChannel(String channelId, String userId) throws RestClientException {
        return removeUserFromChannelWithHttpInfo(channelId, userId).getBody();
    }

    /**
     * Remove user from channel
     * Delete a channel member, effectively removing them from a channel.  Channel members can only be deleted from public or private channels. ##### Permissions &#x60;manage_public_channel_members&#x60; permission if the channel is public. &#x60;manage_private_channel_members&#x60; permission if the channel is private. 
     * <p><b>200</b> - Channel member deletion successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId Channel GUID (required)
     * @param userId User GUID (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> removeUserFromChannelWithHttpInfo(String channelId, String userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling removeUserFromChannel");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling removeUserFromChannel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel_id", channelId);
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

        ParameterizedTypeReference<StatusOK> localReturnType = new ParameterizedTypeReference<StatusOK>() {};
        return apiClient.invokeAPI("/channels/{channel_id}/members/{user_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Restore a channel
     * Restore channel from the provided channel id string.  ##### Permissions &#x60;manage_team&#x60; permission for the team of the channel. 
     * <p><b>200</b> - Channel restore successful
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param channelId Channel GUID (required)
     * @return Channel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Channel restoreChannel(String channelId) throws RestClientException {
        return restoreChannelWithHttpInfo(channelId).getBody();
    }

    /**
     * Restore a channel
     * Restore channel from the provided channel id string.  ##### Permissions &#x60;manage_team&#x60; permission for the team of the channel. 
     * <p><b>200</b> - Channel restore successful
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param channelId Channel GUID (required)
     * @return ResponseEntity&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Channel> restoreChannelWithHttpInfo(String channelId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling restoreChannel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel_id", channelId);

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

        ParameterizedTypeReference<Channel> localReturnType = new ParameterizedTypeReference<Channel>() {};
        return apiClient.invokeAPI("/channels/{channel_id}/restore", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search all private and open type channels
     * Returns all private and open type channels where &#39;term&#39; matches on the name, display name, or purpose of the channel.  Configured &#39;default&#39; channels (ex Town Square and Off-Topic) can be excluded from the results with the &#x60;exclude_default_channels&#x60; boolean parameter.  Channels that are associated (via GroupChannel records) to a given group can be excluded from the results with the &#x60;not_associated_to_group&#x60; parameter and a group id string. 
     * <p><b>200</b> - Paginated channel response. (Note that the non-paginated response—returned if the request body does not contain both &#x60;page&#x60; and &#x60;per_page&#x60; fields—is a simple array of channels.)
     * <p><b>400</b>
     * <p><b>401</b>
     * @param searchAllChannelsRequest The search terms and logic to use in the search. (required)
     * @param systemConsole Is the request from system_console. If this is set to true, it filters channels by the logged in user.  (optional, default to true)
     * @return SearchAllChannels200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SearchAllChannels200Response searchAllChannels(SearchAllChannelsRequest searchAllChannelsRequest, Boolean systemConsole) throws RestClientException {
        return searchAllChannelsWithHttpInfo(searchAllChannelsRequest, systemConsole).getBody();
    }

    /**
     * Search all private and open type channels
     * Returns all private and open type channels where &#39;term&#39; matches on the name, display name, or purpose of the channel.  Configured &#39;default&#39; channels (ex Town Square and Off-Topic) can be excluded from the results with the &#x60;exclude_default_channels&#x60; boolean parameter.  Channels that are associated (via GroupChannel records) to a given group can be excluded from the results with the &#x60;not_associated_to_group&#x60; parameter and a group id string. 
     * <p><b>200</b> - Paginated channel response. (Note that the non-paginated response—returned if the request body does not contain both &#x60;page&#x60; and &#x60;per_page&#x60; fields—is a simple array of channels.)
     * <p><b>400</b>
     * <p><b>401</b>
     * @param searchAllChannelsRequest The search terms and logic to use in the search. (required)
     * @param systemConsole Is the request from system_console. If this is set to true, it filters channels by the logged in user.  (optional, default to true)
     * @return ResponseEntity&lt;SearchAllChannels200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SearchAllChannels200Response> searchAllChannelsWithHttpInfo(SearchAllChannelsRequest searchAllChannelsRequest, Boolean systemConsole) throws RestClientException {
        Object localVarPostBody = searchAllChannelsRequest;
        
        // verify the required parameter 'searchAllChannelsRequest' is set
        if (searchAllChannelsRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'searchAllChannelsRequest' when calling searchAllChannels");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "system_console", systemConsole));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<SearchAllChannels200Response> localReturnType = new ParameterizedTypeReference<SearchAllChannels200Response>() {};
        return apiClient.invokeAPI("/channels/search", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search archived channels
     * Search archived channels on a team based on the search term provided in the request body.  ##### Permissions Must have the &#x60;list_team_channels&#x60; permission.  A user without the &#x60;list_team_channels&#x60; permission will be able to use this endpoint, with the search results limited to the channels that the user is a member of. 
     * <p><b>201</b> - Channels search successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param searchArchivedChannelsRequest Search criteria (required)
     * @return List&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Channel> searchArchivedChannels(String teamId, SearchArchivedChannelsRequest searchArchivedChannelsRequest) throws RestClientException {
        return searchArchivedChannelsWithHttpInfo(teamId, searchArchivedChannelsRequest).getBody();
    }

    /**
     * Search archived channels
     * Search archived channels on a team based on the search term provided in the request body.  ##### Permissions Must have the &#x60;list_team_channels&#x60; permission.  A user without the &#x60;list_team_channels&#x60; permission will be able to use this endpoint, with the search results limited to the channels that the user is a member of. 
     * <p><b>201</b> - Channels search successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param searchArchivedChannelsRequest Search criteria (required)
     * @return ResponseEntity&lt;List&lt;Channel&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Channel>> searchArchivedChannelsWithHttpInfo(String teamId, SearchArchivedChannelsRequest searchArchivedChannelsRequest) throws RestClientException {
        Object localVarPostBody = searchArchivedChannelsRequest;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling searchArchivedChannels");
        }
        
        // verify the required parameter 'searchArchivedChannelsRequest' is set
        if (searchArchivedChannelsRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'searchArchivedChannelsRequest' when calling searchArchivedChannels");
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

        ParameterizedTypeReference<List<Channel>> localReturnType = new ParameterizedTypeReference<List<Channel>>() {};
        return apiClient.invokeAPI("/teams/{team_id}/channels/search_archived", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search channels
     * Search public channels on a team based on the search term provided in the request body. ##### Permissions Must have the &#x60;list_team_channels&#x60; permission.  A user without the &#x60;list_team_channels&#x60; permission will be able to use this endpoint, with the search results limited to the channels that the user is a member of. 
     * <p><b>201</b> - Channels search successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param searchChannelsRequest Search criteria (required)
     * @return List&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Channel> searchChannels(String teamId, SearchChannelsRequest searchChannelsRequest) throws RestClientException {
        return searchChannelsWithHttpInfo(teamId, searchChannelsRequest).getBody();
    }

    /**
     * Search channels
     * Search public channels on a team based on the search term provided in the request body. ##### Permissions Must have the &#x60;list_team_channels&#x60; permission.  A user without the &#x60;list_team_channels&#x60; permission will be able to use this endpoint, with the search results limited to the channels that the user is a member of. 
     * <p><b>201</b> - Channels search successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param searchChannelsRequest Search criteria (required)
     * @return ResponseEntity&lt;List&lt;Channel&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Channel>> searchChannelsWithHttpInfo(String teamId, SearchChannelsRequest searchChannelsRequest) throws RestClientException {
        Object localVarPostBody = searchChannelsRequest;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling searchChannels");
        }
        
        // verify the required parameter 'searchChannelsRequest' is set
        if (searchChannelsRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'searchChannelsRequest' when calling searchChannels");
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

        ParameterizedTypeReference<List<Channel>> localReturnType = new ParameterizedTypeReference<List<Channel>>() {};
        return apiClient.invokeAPI("/teams/{team_id}/channels/search", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search Group Channels
     * Get a list of group channels for a user which members&#39; usernames match the search term.  
     * <p><b>200</b> - Channels search successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param searchGroupChannelsRequest Search criteria (required)
     * @return List&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Channel> searchGroupChannels(SearchGroupChannelsRequest searchGroupChannelsRequest) throws RestClientException {
        return searchGroupChannelsWithHttpInfo(searchGroupChannelsRequest).getBody();
    }

    /**
     * Search Group Channels
     * Get a list of group channels for a user which members&#39; usernames match the search term.  
     * <p><b>200</b> - Channels search successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param searchGroupChannelsRequest Search criteria (required)
     * @return ResponseEntity&lt;List&lt;Channel&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Channel>> searchGroupChannelsWithHttpInfo(SearchGroupChannelsRequest searchGroupChannelsRequest) throws RestClientException {
        Object localVarPostBody = searchGroupChannelsRequest;
        
        // verify the required parameter 'searchGroupChannelsRequest' is set
        if (searchGroupChannelsRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'searchGroupChannelsRequest' when calling searchGroupChannels");
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

        ParameterizedTypeReference<List<Channel>> localReturnType = new ParameterizedTypeReference<List<Channel>>() {};
        return apiClient.invokeAPI("/channels/group/search", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a channel
     * Update a channel. The fields that can be updated are listed as parameters. Omitted fields will be treated as blanks. ##### Permissions If updating a public channel, &#x60;manage_public_channel_members&#x60; permission is required. If updating a private channel, &#x60;manage_private_channel_members&#x60; permission is required. 
     * <p><b>200</b> - Channel update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param channelId Channel GUID (required)
     * @param updateChannelRequest Channel object to be updated (required)
     * @return Channel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Channel updateChannel(String channelId, UpdateChannelRequest updateChannelRequest) throws RestClientException {
        return updateChannelWithHttpInfo(channelId, updateChannelRequest).getBody();
    }

    /**
     * Update a channel
     * Update a channel. The fields that can be updated are listed as parameters. Omitted fields will be treated as blanks. ##### Permissions If updating a public channel, &#x60;manage_public_channel_members&#x60; permission is required. If updating a private channel, &#x60;manage_private_channel_members&#x60; permission is required. 
     * <p><b>200</b> - Channel update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param channelId Channel GUID (required)
     * @param updateChannelRequest Channel object to be updated (required)
     * @return ResponseEntity&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Channel> updateChannelWithHttpInfo(String channelId, UpdateChannelRequest updateChannelRequest) throws RestClientException {
        Object localVarPostBody = updateChannelRequest;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling updateChannel");
        }
        
        // verify the required parameter 'updateChannelRequest' is set
        if (updateChannelRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateChannelRequest' when calling updateChannel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel_id", channelId);

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

        ParameterizedTypeReference<Channel> localReturnType = new ParameterizedTypeReference<Channel>() {};
        return apiClient.invokeAPI("/channels/{channel_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update the scheme-derived roles of a channel member.
     * Update a channel member&#39;s scheme_admin/scheme_user properties. Typically this should either be &#x60;scheme_admin&#x3D;false, scheme_user&#x3D;true&#x60; for ordinary channel member, or &#x60;scheme_admin&#x3D;true, scheme_user&#x3D;true&#x60; for a channel admin. ##### Permissions Must be authenticated and have the &#x60;manage_channel_roles&#x60; permission. 
     * <p><b>200</b> - Channel member&#39;s scheme-derived roles updated successfully.
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param channelId Channel GUID (required)
     * @param userId User GUID (required)
     * @param updateChannelMemberSchemeRolesRequest Scheme properties. (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK updateChannelMemberSchemeRoles(String channelId, String userId, UpdateChannelMemberSchemeRolesRequest updateChannelMemberSchemeRolesRequest) throws RestClientException {
        return updateChannelMemberSchemeRolesWithHttpInfo(channelId, userId, updateChannelMemberSchemeRolesRequest).getBody();
    }

    /**
     * Update the scheme-derived roles of a channel member.
     * Update a channel member&#39;s scheme_admin/scheme_user properties. Typically this should either be &#x60;scheme_admin&#x3D;false, scheme_user&#x3D;true&#x60; for ordinary channel member, or &#x60;scheme_admin&#x3D;true, scheme_user&#x3D;true&#x60; for a channel admin. ##### Permissions Must be authenticated and have the &#x60;manage_channel_roles&#x60; permission. 
     * <p><b>200</b> - Channel member&#39;s scheme-derived roles updated successfully.
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param channelId Channel GUID (required)
     * @param userId User GUID (required)
     * @param updateChannelMemberSchemeRolesRequest Scheme properties. (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> updateChannelMemberSchemeRolesWithHttpInfo(String channelId, String userId, UpdateChannelMemberSchemeRolesRequest updateChannelMemberSchemeRolesRequest) throws RestClientException {
        Object localVarPostBody = updateChannelMemberSchemeRolesRequest;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling updateChannelMemberSchemeRoles");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling updateChannelMemberSchemeRoles");
        }
        
        // verify the required parameter 'updateChannelMemberSchemeRolesRequest' is set
        if (updateChannelMemberSchemeRolesRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateChannelMemberSchemeRolesRequest' when calling updateChannelMemberSchemeRoles");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel_id", channelId);
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
        return apiClient.invokeAPI("/channels/{channel_id}/members/{user_id}/schemeRoles", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update channel notifications
     * Update a user&#39;s notification properties for a channel. Only the provided fields are updated. ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - Channel notification properties update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param channelId Channel GUID (required)
     * @param userId User GUID (required)
     * @param channelNotifyProps  (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK updateChannelNotifyProps(String channelId, String userId, ChannelNotifyProps channelNotifyProps) throws RestClientException {
        return updateChannelNotifyPropsWithHttpInfo(channelId, userId, channelNotifyProps).getBody();
    }

    /**
     * Update channel notifications
     * Update a user&#39;s notification properties for a channel. Only the provided fields are updated. ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - Channel notification properties update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param channelId Channel GUID (required)
     * @param userId User GUID (required)
     * @param channelNotifyProps  (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> updateChannelNotifyPropsWithHttpInfo(String channelId, String userId, ChannelNotifyProps channelNotifyProps) throws RestClientException {
        Object localVarPostBody = channelNotifyProps;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling updateChannelNotifyProps");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling updateChannelNotifyProps");
        }
        
        // verify the required parameter 'channelNotifyProps' is set
        if (channelNotifyProps == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelNotifyProps' when calling updateChannelNotifyProps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel_id", channelId);
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
        return apiClient.invokeAPI("/channels/{channel_id}/members/{user_id}/notify_props", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update channel&#39;s privacy
     * Updates channel&#39;s privacy allowing changing a channel from Public to Private and back.  ##### Permissions &#x60;convert_public_channel_to_private&#x60; permission for the channel if updating privacy to &#39;P&#39;. &#x60;convert_private_channel_to_public&#x60; permission for the channel if updating privacy to &#39;O&#39;. 
     * <p><b>200</b> - Channel conversion successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param channelId Channel GUID (required)
     * @param updateChannelPrivacyRequest  (required)
     * @return Channel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Channel updateChannelPrivacy(String channelId, UpdateChannelPrivacyRequest updateChannelPrivacyRequest) throws RestClientException {
        return updateChannelPrivacyWithHttpInfo(channelId, updateChannelPrivacyRequest).getBody();
    }

    /**
     * Update channel&#39;s privacy
     * Updates channel&#39;s privacy allowing changing a channel from Public to Private and back.  ##### Permissions &#x60;convert_public_channel_to_private&#x60; permission for the channel if updating privacy to &#39;P&#39;. &#x60;convert_private_channel_to_public&#x60; permission for the channel if updating privacy to &#39;O&#39;. 
     * <p><b>200</b> - Channel conversion successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param channelId Channel GUID (required)
     * @param updateChannelPrivacyRequest  (required)
     * @return ResponseEntity&lt;Channel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Channel> updateChannelPrivacyWithHttpInfo(String channelId, UpdateChannelPrivacyRequest updateChannelPrivacyRequest) throws RestClientException {
        Object localVarPostBody = updateChannelPrivacyRequest;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling updateChannelPrivacy");
        }
        
        // verify the required parameter 'updateChannelPrivacyRequest' is set
        if (updateChannelPrivacyRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateChannelPrivacyRequest' when calling updateChannelPrivacy");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel_id", channelId);

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

        ParameterizedTypeReference<Channel> localReturnType = new ParameterizedTypeReference<Channel>() {};
        return apiClient.invokeAPI("/channels/{channel_id}/privacy", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update channel roles
     * Update a user&#39;s roles for a channel. ##### Permissions Must have &#x60;manage_channel_roles&#x60; permission for the channel. 
     * <p><b>200</b> - Channel roles update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId Channel GUID (required)
     * @param userId User GUID (required)
     * @param updateUserRolesRequest Space-delimited channel roles to assign to the user (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK updateChannelRoles(String channelId, String userId, UpdateUserRolesRequest updateUserRolesRequest) throws RestClientException {
        return updateChannelRolesWithHttpInfo(channelId, userId, updateUserRolesRequest).getBody();
    }

    /**
     * Update channel roles
     * Update a user&#39;s roles for a channel. ##### Permissions Must have &#x60;manage_channel_roles&#x60; permission for the channel. 
     * <p><b>200</b> - Channel roles update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param channelId Channel GUID (required)
     * @param userId User GUID (required)
     * @param updateUserRolesRequest Space-delimited channel roles to assign to the user (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> updateChannelRolesWithHttpInfo(String channelId, String userId, UpdateUserRolesRequest updateUserRolesRequest) throws RestClientException {
        Object localVarPostBody = updateUserRolesRequest;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling updateChannelRoles");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling updateChannelRoles");
        }
        
        // verify the required parameter 'updateUserRolesRequest' is set
        if (updateUserRolesRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateUserRolesRequest' when calling updateChannelRoles");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel_id", channelId);
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
        return apiClient.invokeAPI("/channels/{channel_id}/members/{user_id}/roles", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Set a channel&#39;s scheme
     * Set a channel&#39;s scheme, more specifically sets the scheme_id value of a channel record.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  
     * <p><b>200</b> - Update channel scheme successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>501</b>
     * @param channelId Channel GUID (required)
     * @param updateChannelSchemeRequest Scheme GUID (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK updateChannelScheme(String channelId, UpdateChannelSchemeRequest updateChannelSchemeRequest) throws RestClientException {
        return updateChannelSchemeWithHttpInfo(channelId, updateChannelSchemeRequest).getBody();
    }

    /**
     * Set a channel&#39;s scheme
     * Set a channel&#39;s scheme, more specifically sets the scheme_id value of a channel record.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  
     * <p><b>200</b> - Update channel scheme successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>501</b>
     * @param channelId Channel GUID (required)
     * @param updateChannelSchemeRequest Scheme GUID (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> updateChannelSchemeWithHttpInfo(String channelId, UpdateChannelSchemeRequest updateChannelSchemeRequest) throws RestClientException {
        Object localVarPostBody = updateChannelSchemeRequest;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling updateChannelScheme");
        }
        
        // verify the required parameter 'updateChannelSchemeRequest' is set
        if (updateChannelSchemeRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateChannelSchemeRequest' when calling updateChannelScheme");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel_id", channelId);

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
        return apiClient.invokeAPI("/channels/{channel_id}/scheme", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update user&#39;s sidebar categories
     * Update any number of sidebar categories for the user on the given team. This can be used to reorder the channels in these categories. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Category update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param userId User GUID (required)
     * @param sidebarCategory  (required)
     * @return SidebarCategory
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SidebarCategory updateSidebarCategoriesForTeamForUser(String teamId, String userId, List<SidebarCategory> sidebarCategory) throws RestClientException {
        return updateSidebarCategoriesForTeamForUserWithHttpInfo(teamId, userId, sidebarCategory).getBody();
    }

    /**
     * Update user&#39;s sidebar categories
     * Update any number of sidebar categories for the user on the given team. This can be used to reorder the channels in these categories. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Category update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param userId User GUID (required)
     * @param sidebarCategory  (required)
     * @return ResponseEntity&lt;SidebarCategory&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SidebarCategory> updateSidebarCategoriesForTeamForUserWithHttpInfo(String teamId, String userId, List<SidebarCategory> sidebarCategory) throws RestClientException {
        Object localVarPostBody = sidebarCategory;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling updateSidebarCategoriesForTeamForUser");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling updateSidebarCategoriesForTeamForUser");
        }
        
        // verify the required parameter 'sidebarCategory' is set
        if (sidebarCategory == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sidebarCategory' when calling updateSidebarCategoriesForTeamForUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);
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

        ParameterizedTypeReference<SidebarCategory> localReturnType = new ParameterizedTypeReference<SidebarCategory>() {};
        return apiClient.invokeAPI("/users/{user_id}/teams/{team_id}/channels/categories", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update sidebar category
     * Updates a single sidebar category for the user on the given team. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Category update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param userId User GUID (required)
     * @param categoryId Category GUID (required)
     * @param sidebarCategory  (required)
     * @return SidebarCategory
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SidebarCategory updateSidebarCategoryForTeamForUser(String teamId, String userId, String categoryId, SidebarCategory sidebarCategory) throws RestClientException {
        return updateSidebarCategoryForTeamForUserWithHttpInfo(teamId, userId, categoryId, sidebarCategory).getBody();
    }

    /**
     * Update sidebar category
     * Updates a single sidebar category for the user on the given team. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Category update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param userId User GUID (required)
     * @param categoryId Category GUID (required)
     * @param sidebarCategory  (required)
     * @return ResponseEntity&lt;SidebarCategory&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SidebarCategory> updateSidebarCategoryForTeamForUserWithHttpInfo(String teamId, String userId, String categoryId, SidebarCategory sidebarCategory) throws RestClientException {
        Object localVarPostBody = sidebarCategory;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling updateSidebarCategoryForTeamForUser");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling updateSidebarCategoryForTeamForUser");
        }
        
        // verify the required parameter 'categoryId' is set
        if (categoryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'categoryId' when calling updateSidebarCategoryForTeamForUser");
        }
        
        // verify the required parameter 'sidebarCategory' is set
        if (sidebarCategory == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sidebarCategory' when calling updateSidebarCategoryForTeamForUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);
        uriVariables.put("user_id", userId);
        uriVariables.put("category_id", categoryId);

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

        ParameterizedTypeReference<SidebarCategory> localReturnType = new ParameterizedTypeReference<SidebarCategory>() {};
        return apiClient.invokeAPI("/users/{user_id}/teams/{team_id}/channels/categories/{category_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update user&#39;s sidebar category order
     * Updates the order of the sidebar categories for a user on the given team. The provided array must include the IDs of all categories on the team. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Order update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param userId User GUID (required)
     * @param requestBody  (required)
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> updateSidebarCategoryOrderForTeamForUser(String teamId, String userId, List<String> requestBody) throws RestClientException {
        return updateSidebarCategoryOrderForTeamForUserWithHttpInfo(teamId, userId, requestBody).getBody();
    }

    /**
     * Update user&#39;s sidebar category order
     * Updates the order of the sidebar categories for a user on the given team. The provided array must include the IDs of all categories on the team. ##### Permissions Must be authenticated and have the &#x60;list_team_channels&#x60; permission. 
     * <p><b>200</b> - Order update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param userId User GUID (required)
     * @param requestBody  (required)
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> updateSidebarCategoryOrderForTeamForUserWithHttpInfo(String teamId, String userId, List<String> requestBody) throws RestClientException {
        Object localVarPostBody = requestBody;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling updateSidebarCategoryOrderForTeamForUser");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling updateSidebarCategoryOrderForTeamForUser");
        }
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody' when calling updateSidebarCategoryOrderForTeamForUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);
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

        ParameterizedTypeReference<List<String>> localReturnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI("/users/{user_id}/teams/{team_id}/channels/categories/order", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * View channel
     * Perform all the actions involved in viewing a channel. This includes marking channels as read, clearing push notifications, and updating the active channel. ##### Permissions Must be logged in as user or have &#x60;edit_other_users&#x60; permission.  __Response only includes &#x60;last_viewed_at_times&#x60; in Mattermost server 4.3 and newer.__ 
     * <p><b>200</b> - Channel view successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId User ID to perform the view action for (required)
     * @param viewChannelRequest Paremeters affecting how and which channels to view (required)
     * @return ViewChannel200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ViewChannel200Response viewChannel(String userId, ViewChannelRequest viewChannelRequest) throws RestClientException {
        return viewChannelWithHttpInfo(userId, viewChannelRequest).getBody();
    }

    /**
     * View channel
     * Perform all the actions involved in viewing a channel. This includes marking channels as read, clearing push notifications, and updating the active channel. ##### Permissions Must be logged in as user or have &#x60;edit_other_users&#x60; permission.  __Response only includes &#x60;last_viewed_at_times&#x60; in Mattermost server 4.3 and newer.__ 
     * <p><b>200</b> - Channel view successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId User ID to perform the view action for (required)
     * @param viewChannelRequest Paremeters affecting how and which channels to view (required)
     * @return ResponseEntity&lt;ViewChannel200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ViewChannel200Response> viewChannelWithHttpInfo(String userId, ViewChannelRequest viewChannelRequest) throws RestClientException {
        Object localVarPostBody = viewChannelRequest;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling viewChannel");
        }
        
        // verify the required parameter 'viewChannelRequest' is set
        if (viewChannelRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'viewChannelRequest' when calling viewChannel");
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

        ParameterizedTypeReference<ViewChannel200Response> localReturnType = new ParameterizedTypeReference<ViewChannel200Response>() {};
        return apiClient.invokeAPI("/channels/members/{user_id}/view", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
