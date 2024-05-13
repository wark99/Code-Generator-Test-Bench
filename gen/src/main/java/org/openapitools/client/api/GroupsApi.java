package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiError;
import org.openapitools.client.model.AppError;
import org.openapitools.client.model.Group;

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
public class GroupsApi {
    private ApiClient apiClient;

    public GroupsApi() {
        this(new ApiClient());
    }

    public GroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get groups
     * Retrieve a list of all groups not associated to a particular channel or team.  &#x60;not_associated_to_team&#x60; **OR** &#x60;not_associated_to_channel&#x60; is required.  If you use &#x60;not_associated_to_team&#x60;, you must be a team admin for that particular team (permission to manage that team).  If you use &#x60;not_associated_to_channel&#x60;, you must be a channel admin for that particular channel (permission to manage that channel).  n
     * <p><b>200</b> - Group list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>501</b>
     * @param notAssociatedToTeam Team GUID which is used to return all the groups not associated to this team (required)
     * @param notAssociatedToChannel Group GUID which is used to return all the groups not associated to this channel (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of groups per page. (optional, default to 60)
     * @param q String to pattern match the &#x60;name&#x60; and &#x60;display_name&#x60; field. Will return all groups whose &#x60;name&#x60; and &#x60;display_name&#x60; field match any of the text. (optional)
     * @param includeMemberCount Boolean which adds the &#x60;member_count&#x60; attribute to each group JSON object (optional)
     * @param since Only return groups that have been modified since the given Unix timestamp (in milliseconds). All modified groups, including deleted and created groups, will be returned. n (optional)
     * @param filterAllowReference Boolean which filters the group entries with the &#x60;allow_reference&#x60; attribute set. (optional, default to false)
     * @return List&lt;Group&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Group> getGroups(String notAssociatedToTeam, String notAssociatedToChannel, Integer page, Integer perPage, String q, Boolean includeMemberCount, Integer since, Boolean filterAllowReference) throws RestClientException {
        return getGroupsWithHttpInfo(notAssociatedToTeam, notAssociatedToChannel, page, perPage, q, includeMemberCount, since, filterAllowReference).getBody();
    }

    /**
     * Get groups
     * Retrieve a list of all groups not associated to a particular channel or team.  &#x60;not_associated_to_team&#x60; **OR** &#x60;not_associated_to_channel&#x60; is required.  If you use &#x60;not_associated_to_team&#x60;, you must be a team admin for that particular team (permission to manage that team).  If you use &#x60;not_associated_to_channel&#x60;, you must be a channel admin for that particular channel (permission to manage that channel).  n
     * <p><b>200</b> - Group list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>501</b>
     * @param notAssociatedToTeam Team GUID which is used to return all the groups not associated to this team (required)
     * @param notAssociatedToChannel Group GUID which is used to return all the groups not associated to this channel (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of groups per page. (optional, default to 60)
     * @param q String to pattern match the &#x60;name&#x60; and &#x60;display_name&#x60; field. Will return all groups whose &#x60;name&#x60; and &#x60;display_name&#x60; field match any of the text. (optional)
     * @param includeMemberCount Boolean which adds the &#x60;member_count&#x60; attribute to each group JSON object (optional)
     * @param since Only return groups that have been modified since the given Unix timestamp (in milliseconds). All modified groups, including deleted and created groups, will be returned. n (optional)
     * @param filterAllowReference Boolean which filters the group entries with the &#x60;allow_reference&#x60; attribute set. (optional, default to false)
     * @return ResponseEntity&lt;List&lt;Group&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Group>> getGroupsWithHttpInfo(String notAssociatedToTeam, String notAssociatedToChannel, Integer page, Integer perPage, String q, Boolean includeMemberCount, Integer since, Boolean filterAllowReference) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'notAssociatedToTeam' is set
        if (notAssociatedToTeam == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'notAssociatedToTeam' when calling getGroups");
        }
        
        // verify the required parameter 'notAssociatedToChannel' is set
        if (notAssociatedToChannel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'notAssociatedToChannel' when calling getGroups");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_member_count", includeMemberCount));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "not_associated_to_team", notAssociatedToTeam));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "not_associated_to_channel", notAssociatedToChannel));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "since", since));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_allow_reference", filterAllowReference));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Group>> localReturnType = new ParameterizedTypeReference<List<Group>>() {};
        return apiClient.invokeAPI("/groups", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get team groups by channels
     * Retrieve the set of groups associated with the channels in the given team grouped by channel.  ##### Permissions Must have &#x60;manage_system&#x60; permission or can access only for current user  
     * <p><b>200</b> - Group list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>500</b>
     * <p><b>501</b>
     * @param teamId Team GUID (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of groups per page. (optional, default to 60)
     * @param filterAllowReference Boolean which filters in the group entries with the &#x60;allow_reference&#x60; attribute set. (optional, default to false)
     * @param paginate Boolean to determine whether the pagination should be applied or not (optional, default to false)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object getGroupsAssociatedToChannelsByTeam(String teamId, Integer page, Integer perPage, Boolean filterAllowReference, Boolean paginate) throws RestClientException {
        return getGroupsAssociatedToChannelsByTeamWithHttpInfo(teamId, page, perPage, filterAllowReference, paginate).getBody();
    }

    /**
     * Get team groups by channels
     * Retrieve the set of groups associated with the channels in the given team grouped by channel.  ##### Permissions Must have &#x60;manage_system&#x60; permission or can access only for current user  
     * <p><b>200</b> - Group list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>500</b>
     * <p><b>501</b>
     * @param teamId Team GUID (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of groups per page. (optional, default to 60)
     * @param filterAllowReference Boolean which filters in the group entries with the &#x60;allow_reference&#x60; attribute set. (optional, default to false)
     * @param paginate Boolean to determine whether the pagination should be applied or not (optional, default to false)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getGroupsAssociatedToChannelsByTeamWithHttpInfo(String teamId, Integer page, Integer perPage, Boolean filterAllowReference, Boolean paginate) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getGroupsAssociatedToChannelsByTeam");
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
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_allow_reference", filterAllowReference));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginate", paginate));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/teams/{team_id}/groups_by_channels", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get channel groups
     * Retrieve the list of groups associated with a given channel.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  
     * <p><b>200</b> - Group list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>500</b>
     * <p><b>501</b>
     * @param channelId Channel GUID (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of groups per page. (optional, default to 60)
     * @param filterAllowReference Boolean which filters the group entries with the &#x60;allow_reference&#x60; attribute set. (optional, default to false)
     * @return List&lt;Group&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Group> getGroupsByChannel(String channelId, Integer page, Integer perPage, Boolean filterAllowReference) throws RestClientException {
        return getGroupsByChannelWithHttpInfo(channelId, page, perPage, filterAllowReference).getBody();
    }

    /**
     * Get channel groups
     * Retrieve the list of groups associated with a given channel.  ##### Permissions Must have &#x60;manage_system&#x60; permission.  
     * <p><b>200</b> - Group list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>500</b>
     * <p><b>501</b>
     * @param channelId Channel GUID (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of groups per page. (optional, default to 60)
     * @param filterAllowReference Boolean which filters the group entries with the &#x60;allow_reference&#x60; attribute set. (optional, default to false)
     * @return ResponseEntity&lt;List&lt;Group&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Group>> getGroupsByChannelWithHttpInfo(String channelId, Integer page, Integer perPage, Boolean filterAllowReference) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling getGroupsByChannel");
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
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_allow_reference", filterAllowReference));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Group>> localReturnType = new ParameterizedTypeReference<List<Group>>() {};
        return apiClient.invokeAPI("/channels/{channel_id}/groups", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get team groups
     * Retrieve the list of groups associated with a given team.  
     * <p><b>200</b> - Group list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>500</b>
     * <p><b>501</b>
     * @param teamId Team GUID (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of groups per page. (optional, default to 60)
     * @param filterAllowReference Boolean which filters in the group entries with the &#x60;allow_reference&#x60; attribute set. (optional, default to false)
     * @return List&lt;Group&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Group> getGroupsByTeam(String teamId, Integer page, Integer perPage, Boolean filterAllowReference) throws RestClientException {
        return getGroupsByTeamWithHttpInfo(teamId, page, perPage, filterAllowReference).getBody();
    }

    /**
     * Get team groups
     * Retrieve the list of groups associated with a given team.  
     * <p><b>200</b> - Group list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>500</b>
     * <p><b>501</b>
     * @param teamId Team GUID (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of groups per page. (optional, default to 60)
     * @param filterAllowReference Boolean which filters in the group entries with the &#x60;allow_reference&#x60; attribute set. (optional, default to false)
     * @return ResponseEntity&lt;List&lt;Group&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Group>> getGroupsByTeamWithHttpInfo(String teamId, Integer page, Integer perPage, Boolean filterAllowReference) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getGroupsByTeam");
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
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter_allow_reference", filterAllowReference));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Group>> localReturnType = new ParameterizedTypeReference<List<Group>>() {};
        return apiClient.invokeAPI("/teams/{team_id}/groups", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get groups for a userId
     * Retrieve the list of groups associated to the user  
     * <p><b>200</b> - Group list retrieval successful
     * <p><b>400</b>
     * <p><b>501</b>
     * @param userId User GUID (required)
     * @return List&lt;Group&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Group> getGroupsByUserId(String userId) throws RestClientException {
        return getGroupsByUserIdWithHttpInfo(userId).getBody();
    }

    /**
     * Get groups for a userId
     * Retrieve the list of groups associated to the user  
     * <p><b>200</b> - Group list retrieval successful
     * <p><b>400</b>
     * <p><b>501</b>
     * @param userId User GUID (required)
     * @return ResponseEntity&lt;List&lt;Group&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Group>> getGroupsByUserIdWithHttpInfo(String userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getGroupsByUserId");
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

        ParameterizedTypeReference<List<Group>> localReturnType = new ParameterizedTypeReference<List<Group>>() {};
        return apiClient.invokeAPI("/users/{user_id}/groups", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
