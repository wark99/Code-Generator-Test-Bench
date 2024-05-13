package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiError;
import org.openapitools.client.model.AppError;
import org.openapitools.client.model.NewTeamMembersList;
import org.openapitools.client.model.TopChannelList;
import org.openapitools.client.model.TopDMList;
import org.openapitools.client.model.TopReactionList;
import org.openapitools.client.model.TopThreadList;

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
public class InsightsApi {
    private ApiClient apiClient;

    public InsightsApi() {
        this(new ApiClient());
    }

    public InsightsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a list of new team members.
     * Get a list of all of the new team members that have joined the given team during the given time period. ##### Permissions Must have &#x60;view_team&#x60; permission for the team. 
     * <p><b>200</b> - New team members retrieved successfully.
     * <p><b>400</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @param timeRange Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: team members who joined during the current day. - &#x60;7_day&#x60;: team members who joined in the last 7 days. - &#x60;28_day&#x60;: team members who joined in the last 28 days.  (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of items per page. (optional, default to 60)
     * @return NewTeamMembersList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public NewTeamMembersList getNewTeamMembers(String teamId, String timeRange, Integer page, Integer perPage) throws RestClientException {
        return getNewTeamMembersWithHttpInfo(teamId, timeRange, page, perPage).getBody();
    }

    /**
     * Get a list of new team members.
     * Get a list of all of the new team members that have joined the given team during the given time period. ##### Permissions Must have &#x60;view_team&#x60; permission for the team. 
     * <p><b>200</b> - New team members retrieved successfully.
     * <p><b>400</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @param timeRange Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: team members who joined during the current day. - &#x60;7_day&#x60;: team members who joined in the last 7 days. - &#x60;28_day&#x60;: team members who joined in the last 28 days.  (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of items per page. (optional, default to 60)
     * @return ResponseEntity&lt;NewTeamMembersList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<NewTeamMembersList> getNewTeamMembersWithHttpInfo(String teamId, String timeRange, Integer page, Integer perPage) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getNewTeamMembers");
        }
        
        // verify the required parameter 'timeRange' is set
        if (timeRange == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'timeRange' when calling getNewTeamMembers");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "time_range", timeRange));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<NewTeamMembersList> localReturnType = new ParameterizedTypeReference<NewTeamMembersList>() {};
        return apiClient.invokeAPI("/teams/{team_id}/top/team_members", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of the top channels for a team.
     * Get a list of the top public and private channels (the user is a member of) for a given team. ##### Permissions Must have &#x60;view_team&#x60; permission for the team. 
     * <p><b>200</b> - Top channels retrieved successfully.
     * <p><b>400</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @param timeRange Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: channels with posts on the current day. - &#x60;7_day&#x60;: channels with posts in the last 7 days. - &#x60;28_day&#x60;: channels with posts in the last 28 days.  (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of items per page, up to a maximum of 200. (optional, default to 60)
     * @return TopChannelList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TopChannelList getTopChannelsForTeam(String teamId, String timeRange, Integer page, Integer perPage) throws RestClientException {
        return getTopChannelsForTeamWithHttpInfo(teamId, timeRange, page, perPage).getBody();
    }

    /**
     * Get a list of the top channels for a team.
     * Get a list of the top public and private channels (the user is a member of) for a given team. ##### Permissions Must have &#x60;view_team&#x60; permission for the team. 
     * <p><b>200</b> - Top channels retrieved successfully.
     * <p><b>400</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @param timeRange Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: channels with posts on the current day. - &#x60;7_day&#x60;: channels with posts in the last 7 days. - &#x60;28_day&#x60;: channels with posts in the last 28 days.  (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of items per page, up to a maximum of 200. (optional, default to 60)
     * @return ResponseEntity&lt;TopChannelList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TopChannelList> getTopChannelsForTeamWithHttpInfo(String teamId, String timeRange, Integer page, Integer perPage) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getTopChannelsForTeam");
        }
        
        // verify the required parameter 'timeRange' is set
        if (timeRange == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'timeRange' when calling getTopChannelsForTeam");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "time_range", timeRange));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<TopChannelList> localReturnType = new ParameterizedTypeReference<TopChannelList>() {};
        return apiClient.invokeAPI("/teams/{team_id}/top/channels", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of the top channels for a user.
     * Get a list of the top public and private channels (the user is a member of) for a given user. ##### Permissions Must be logged in as the user. 
     * <p><b>200</b> - Top channels retrieved successfully.
     * <p><b>400</b>
     * <p><b>403</b>
     * @param timeRange Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: channels with posts on the current day. - &#x60;7_day&#x60;: channels with posts in the last 7 days. - &#x60;28_day&#x60;: channels with posts in the last 28 days.  (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of items per page, up to a maximum of 200. (optional, default to 60)
     * @param teamId Team ID will scope the response to a given team. ##### Permissions Must have &#x60;view_team&#x60; permission for the team.  (optional)
     * @return TopChannelList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TopChannelList getTopChannelsForUser(String timeRange, Integer page, Integer perPage, String teamId) throws RestClientException {
        return getTopChannelsForUserWithHttpInfo(timeRange, page, perPage, teamId).getBody();
    }

    /**
     * Get a list of the top channels for a user.
     * Get a list of the top public and private channels (the user is a member of) for a given user. ##### Permissions Must be logged in as the user. 
     * <p><b>200</b> - Top channels retrieved successfully.
     * <p><b>400</b>
     * <p><b>403</b>
     * @param timeRange Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: channels with posts on the current day. - &#x60;7_day&#x60;: channels with posts in the last 7 days. - &#x60;28_day&#x60;: channels with posts in the last 28 days.  (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of items per page, up to a maximum of 200. (optional, default to 60)
     * @param teamId Team ID will scope the response to a given team. ##### Permissions Must have &#x60;view_team&#x60; permission for the team.  (optional)
     * @return ResponseEntity&lt;TopChannelList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TopChannelList> getTopChannelsForUserWithHttpInfo(String timeRange, Integer page, Integer perPage, String teamId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'timeRange' is set
        if (timeRange == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'timeRange' when calling getTopChannelsForUser");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "time_range", timeRange));
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

        ParameterizedTypeReference<TopChannelList> localReturnType = new ParameterizedTypeReference<TopChannelList>() {};
        return apiClient.invokeAPI("/users/me/top/channels", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of the top dms for a user.
     * Get a list of the top dms for a given user. ##### Permissions Must be logged in as the user. 
     * <p><b>200</b> - Top dms retrieved successfully.
     * <p><b>400</b>
     * <p><b>403</b>
     * @param timeRange Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: threads with activity on the current day. - &#x60;7_day&#x60;: threads with activity in the last 7 days. - &#x60;28_day&#x60;: threads with activity in the last 28 days.  (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of items per page, up to a maximum of 200. (optional, default to 60)
     * @return TopDMList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TopDMList getTopDMsForUser(String timeRange, Integer page, Integer perPage) throws RestClientException {
        return getTopDMsForUserWithHttpInfo(timeRange, page, perPage).getBody();
    }

    /**
     * Get a list of the top dms for a user.
     * Get a list of the top dms for a given user. ##### Permissions Must be logged in as the user. 
     * <p><b>200</b> - Top dms retrieved successfully.
     * <p><b>400</b>
     * <p><b>403</b>
     * @param timeRange Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: threads with activity on the current day. - &#x60;7_day&#x60;: threads with activity in the last 7 days. - &#x60;28_day&#x60;: threads with activity in the last 28 days.  (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of items per page, up to a maximum of 200. (optional, default to 60)
     * @return ResponseEntity&lt;TopDMList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TopDMList> getTopDMsForUserWithHttpInfo(String timeRange, Integer page, Integer perPage) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'timeRange' is set
        if (timeRange == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'timeRange' when calling getTopDMsForUser");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "time_range", timeRange));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<TopDMList> localReturnType = new ParameterizedTypeReference<TopDMList>() {};
        return apiClient.invokeAPI("/users/me/top/dms", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of the top reactions for a team.
     * Get a list of the top reactions across all public and private channels (the user is a member of) for a given team. ##### Permissions Must have &#x60;view_team&#x60; permission for the team. 
     * <p><b>200</b> - Top reactions retrieved successfully.
     * <p><b>400</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @param timeRange Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: reactions posted on the current day. - &#x60;7_day&#x60;: reactions posted in the last 7 days. - &#x60;28_day&#x60;: reactions posted in the last 28 days.  (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of items per page, up to a maximum of 200. (optional, default to 60)
     * @return TopReactionList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TopReactionList getTopReactionsForTeam(String teamId, String timeRange, Integer page, Integer perPage) throws RestClientException {
        return getTopReactionsForTeamWithHttpInfo(teamId, timeRange, page, perPage).getBody();
    }

    /**
     * Get a list of the top reactions for a team.
     * Get a list of the top reactions across all public and private channels (the user is a member of) for a given team. ##### Permissions Must have &#x60;view_team&#x60; permission for the team. 
     * <p><b>200</b> - Top reactions retrieved successfully.
     * <p><b>400</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @param timeRange Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: reactions posted on the current day. - &#x60;7_day&#x60;: reactions posted in the last 7 days. - &#x60;28_day&#x60;: reactions posted in the last 28 days.  (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of items per page, up to a maximum of 200. (optional, default to 60)
     * @return ResponseEntity&lt;TopReactionList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TopReactionList> getTopReactionsForTeamWithHttpInfo(String teamId, String timeRange, Integer page, Integer perPage) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getTopReactionsForTeam");
        }
        
        // verify the required parameter 'timeRange' is set
        if (timeRange == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'timeRange' when calling getTopReactionsForTeam");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "time_range", timeRange));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<TopReactionList> localReturnType = new ParameterizedTypeReference<TopReactionList>() {};
        return apiClient.invokeAPI("/teams/{team_id}/top/reactions", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of the top reactions for a user.
     * Get a list of the top reactions across all public and private channels (the user is a member of) for a given user. If no &#x60;team_id&#x60; is provided, this will also include reactions posted by the given user in direct and group messages. ##### Permissions Must be logged in as the user. 
     * <p><b>200</b> - Top reactions retrieved successfully.
     * <p><b>400</b>
     * <p><b>403</b>
     * @param timeRange Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: reactions posted on the current day. - &#x60;7_day&#x60;: reactions posted in the last 7 days. - &#x60;28_day&#x60;: reactions posted in the last 28 days.  (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of items per page, up to a maximum of 200. (optional, default to 60)
     * @param teamId Team ID will scope the response to a given team and exclude direct and group messages. ##### Permissions Must have &#x60;view_team&#x60; permission for the team.  (optional)
     * @return TopReactionList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TopReactionList getTopReactionsForUser(String timeRange, Integer page, Integer perPage, String teamId) throws RestClientException {
        return getTopReactionsForUserWithHttpInfo(timeRange, page, perPage, teamId).getBody();
    }

    /**
     * Get a list of the top reactions for a user.
     * Get a list of the top reactions across all public and private channels (the user is a member of) for a given user. If no &#x60;team_id&#x60; is provided, this will also include reactions posted by the given user in direct and group messages. ##### Permissions Must be logged in as the user. 
     * <p><b>200</b> - Top reactions retrieved successfully.
     * <p><b>400</b>
     * <p><b>403</b>
     * @param timeRange Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: reactions posted on the current day. - &#x60;7_day&#x60;: reactions posted in the last 7 days. - &#x60;28_day&#x60;: reactions posted in the last 28 days.  (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of items per page, up to a maximum of 200. (optional, default to 60)
     * @param teamId Team ID will scope the response to a given team and exclude direct and group messages. ##### Permissions Must have &#x60;view_team&#x60; permission for the team.  (optional)
     * @return ResponseEntity&lt;TopReactionList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TopReactionList> getTopReactionsForUserWithHttpInfo(String timeRange, Integer page, Integer perPage, String teamId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'timeRange' is set
        if (timeRange == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'timeRange' when calling getTopReactionsForUser");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "time_range", timeRange));
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

        ParameterizedTypeReference<TopReactionList> localReturnType = new ParameterizedTypeReference<TopReactionList>() {};
        return apiClient.invokeAPI("/users/me/top/reactions", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of the top threads for a team.
     * Get a list of the top threads from public and private channels (the user is a member of) for a given team. ##### Permissions Must have &#x60;view_team&#x60; permission for the team. 
     * <p><b>200</b> - Top threads retrieved successfully.
     * <p><b>400</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @param timeRange Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: threads with activity on the current day. - &#x60;7_day&#x60;: threads with activity in the last 7 days. - &#x60;28_day&#x60;: threads with activity in the last 28 days.  (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of items per page, up to a maximum of 200. (optional, default to 60)
     * @return TopThreadList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TopThreadList getTopThreadsForTeam(String teamId, String timeRange, Integer page, Integer perPage) throws RestClientException {
        return getTopThreadsForTeamWithHttpInfo(teamId, timeRange, page, perPage).getBody();
    }

    /**
     * Get a list of the top threads for a team.
     * Get a list of the top threads from public and private channels (the user is a member of) for a given team. ##### Permissions Must have &#x60;view_team&#x60; permission for the team. 
     * <p><b>200</b> - Top threads retrieved successfully.
     * <p><b>400</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @param timeRange Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: threads with activity on the current day. - &#x60;7_day&#x60;: threads with activity in the last 7 days. - &#x60;28_day&#x60;: threads with activity in the last 28 days.  (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of items per page, up to a maximum of 200. (optional, default to 60)
     * @return ResponseEntity&lt;TopThreadList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TopThreadList> getTopThreadsForTeamWithHttpInfo(String teamId, String timeRange, Integer page, Integer perPage) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getTopThreadsForTeam");
        }
        
        // verify the required parameter 'timeRange' is set
        if (timeRange == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'timeRange' when calling getTopThreadsForTeam");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "time_range", timeRange));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<TopThreadList> localReturnType = new ParameterizedTypeReference<TopThreadList>() {};
        return apiClient.invokeAPI("/teams/{team_id}/top/threads", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of the top threads for a user.
     * Get a list of the top threads from public and private channels (the user is a member of and participating in the thread) for a given user. ##### Permissions Must be logged in as the user. 
     * <p><b>200</b> - Top threads retrieved successfully.
     * <p><b>400</b>
     * <p><b>403</b>
     * @param timeRange Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: threads with activity on the current day. - &#x60;7_day&#x60;: threads with activity in the last 7 days. - &#x60;28_day&#x60;: threads with activity in the last 28 days.  (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of items per page, up to a maximum of 200. (optional, default to 60)
     * @param teamId Team ID will scope the response to a given team. ##### Permissions Must have &#x60;view_team&#x60; permission for the team.  (optional)
     * @return TopThreadList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TopThreadList getTopThreadsForUser(String timeRange, Integer page, Integer perPage, String teamId) throws RestClientException {
        return getTopThreadsForUserWithHttpInfo(timeRange, page, perPage, teamId).getBody();
    }

    /**
     * Get a list of the top threads for a user.
     * Get a list of the top threads from public and private channels (the user is a member of and participating in the thread) for a given user. ##### Permissions Must be logged in as the user. 
     * <p><b>200</b> - Top threads retrieved successfully.
     * <p><b>400</b>
     * <p><b>403</b>
     * @param timeRange Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: threads with activity on the current day. - &#x60;7_day&#x60;: threads with activity in the last 7 days. - &#x60;28_day&#x60;: threads with activity in the last 28 days.  (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of items per page, up to a maximum of 200. (optional, default to 60)
     * @param teamId Team ID will scope the response to a given team. ##### Permissions Must have &#x60;view_team&#x60; permission for the team.  (optional)
     * @return ResponseEntity&lt;TopThreadList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TopThreadList> getTopThreadsForUserWithHttpInfo(String timeRange, Integer page, Integer perPage, String teamId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'timeRange' is set
        if (timeRange == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'timeRange' when calling getTopThreadsForUser");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "time_range", timeRange));
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

        ParameterizedTypeReference<TopThreadList> localReturnType = new ParameterizedTypeReference<TopThreadList>() {};
        return apiClient.invokeAPI("/users/me/top/threads", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
