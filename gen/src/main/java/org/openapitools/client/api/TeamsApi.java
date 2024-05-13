package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiError;
import org.openapitools.client.model.AppError;
import org.openapitools.client.model.FileInfoList;
import org.openapitools.client.model.InviteGuestsToTeamRequest;
import org.openapitools.client.model.SearchFilesRequest;
import org.openapitools.client.model.StatusOK;
import org.openapitools.client.model.Team;
import org.openapitools.client.model.TeamMember;
import org.openapitools.client.model.TeamStats;
import org.openapitools.client.model.TeamUnread;
import org.openapitools.client.model.UpdateUserRolesRequest;

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
public class TeamsApi {
    private ApiClient apiClient;

    public TeamsApi() {
        this(new ApiClient());
    }

    public TeamsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get teams
     * For regular users only returns open teams. Users with the \&quot;manage_system\&quot; permission will return teams regardless of type. The result is based on query string parameters - page and per_page. ##### Permissions Must be authenticated. 
     * <p><b>200</b> - Team list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of teams per page. (optional, default to 60)
     * @param includeTotalCount Appends a total count of returned teams inside the response object - ex: &#x60;{ \&quot;teams\&quot;: [], \&quot;total_count\&quot; : 0 }&#x60;.       (optional, default to false)
     * @param excludePolicyConstrained If set to true, teams which are part of a data retention policy will be excluded. The &#x60;sysconsole_read_compliance&#x60; permission is required to use this parameter.  (optional, default to false)
     * @return List&lt;Team&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Team> getAllTeams(Integer page, Integer perPage, Boolean includeTotalCount, Boolean excludePolicyConstrained) throws RestClientException {
        return getAllTeamsWithHttpInfo(page, perPage, includeTotalCount, excludePolicyConstrained).getBody();
    }

    /**
     * Get teams
     * For regular users only returns open teams. Users with the \&quot;manage_system\&quot; permission will return teams regardless of type. The result is based on query string parameters - page and per_page. ##### Permissions Must be authenticated. 
     * <p><b>200</b> - Team list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of teams per page. (optional, default to 60)
     * @param includeTotalCount Appends a total count of returned teams inside the response object - ex: &#x60;{ \&quot;teams\&quot;: [], \&quot;total_count\&quot; : 0 }&#x60;.       (optional, default to false)
     * @param excludePolicyConstrained If set to true, teams which are part of a data retention policy will be excluded. The &#x60;sysconsole_read_compliance&#x60; permission is required to use this parameter.  (optional, default to false)
     * @return ResponseEntity&lt;List&lt;Team&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Team>> getAllTeamsWithHttpInfo(Integer page, Integer perPage, Boolean includeTotalCount, Boolean excludePolicyConstrained) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_total_count", includeTotalCount));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "exclude_policy_constrained", excludePolicyConstrained));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Team>> localReturnType = new ParameterizedTypeReference<List<Team>>() {};
        return apiClient.invokeAPI("/teams", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a team
     * Get a team on the system. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     * <p><b>200</b> - Team retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @return Team
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Team getTeam(String teamId) throws RestClientException {
        return getTeamWithHttpInfo(teamId).getBody();
    }

    /**
     * Get a team
     * Get a team on the system. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     * <p><b>200</b> - Team retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @return ResponseEntity&lt;Team&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Team> getTeamWithHttpInfo(String teamId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getTeam");
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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Team> localReturnType = new ParameterizedTypeReference<Team>() {};
        return apiClient.invokeAPI("/teams/{team_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a team by name
     * Get a team based on provided name string ##### Permissions Must be authenticated, team type is open and have the &#x60;view_team&#x60; permission. 
     * <p><b>200</b> - Team retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param name Team Name (required)
     * @return Team
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Team getTeamByName(String name) throws RestClientException {
        return getTeamByNameWithHttpInfo(name).getBody();
    }

    /**
     * Get a team by name
     * Get a team based on provided name string ##### Permissions Must be authenticated, team type is open and have the &#x60;view_team&#x60; permission. 
     * <p><b>200</b> - Team retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param name Team Name (required)
     * @return ResponseEntity&lt;Team&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Team> getTeamByNameWithHttpInfo(String name) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getTeamByName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);

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

        ParameterizedTypeReference<Team> localReturnType = new ParameterizedTypeReference<Team>() {};
        return apiClient.invokeAPI("/teams/name/{name}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a team member
     * Get a team member on the system. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     * <p><b>200</b> - Team member retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param userId User GUID (required)
     * @return TeamMember
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TeamMember getTeamMember(String teamId, String userId) throws RestClientException {
        return getTeamMemberWithHttpInfo(teamId, userId).getBody();
    }

    /**
     * Get a team member
     * Get a team member on the system. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     * <p><b>200</b> - Team member retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param userId User GUID (required)
     * @return ResponseEntity&lt;TeamMember&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TeamMember> getTeamMemberWithHttpInfo(String teamId, String userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getTeamMember");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getTeamMember");
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

        ParameterizedTypeReference<TeamMember> localReturnType = new ParameterizedTypeReference<TeamMember>() {};
        return apiClient.invokeAPI("/teams/{team_id}/members/{user_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get team members
     * Get a page team members list based on query string parameters - team id, page and per page. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     * <p><b>200</b> - Team members retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of users per page. (optional, default to 60)
     * @return List&lt;TeamMember&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TeamMember> getTeamMembers(String teamId, Integer page, Integer perPage) throws RestClientException {
        return getTeamMembersWithHttpInfo(teamId, page, perPage).getBody();
    }

    /**
     * Get team members
     * Get a page team members list based on query string parameters - team id, page and per page. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     * <p><b>200</b> - Team members retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of users per page. (optional, default to 60)
     * @return ResponseEntity&lt;List&lt;TeamMember&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TeamMember>> getTeamMembersWithHttpInfo(String teamId, Integer page, Integer perPage) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getTeamMembers");
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

        ParameterizedTypeReference<List<TeamMember>> localReturnType = new ParameterizedTypeReference<List<TeamMember>>() {};
        return apiClient.invokeAPI("/teams/{team_id}/members", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get team members by ids
     * Get a list of team members based on a provided array of user ids. ##### Permissions Must have &#x60;view_team&#x60; permission for the team. 
     * <p><b>200</b> - Team members retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @param requestBody List of user ids (required)
     * @return List&lt;TeamMember&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TeamMember> getTeamMembersByIds(String teamId, List<String> requestBody) throws RestClientException {
        return getTeamMembersByIdsWithHttpInfo(teamId, requestBody).getBody();
    }

    /**
     * Get team members by ids
     * Get a list of team members based on a provided array of user ids. ##### Permissions Must have &#x60;view_team&#x60; permission for the team. 
     * <p><b>200</b> - Team members retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @param requestBody List of user ids (required)
     * @return ResponseEntity&lt;List&lt;TeamMember&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TeamMember>> getTeamMembersByIdsWithHttpInfo(String teamId, List<String> requestBody) throws RestClientException {
        Object localVarPostBody = requestBody;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getTeamMembersByIds");
        }
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody' when calling getTeamMembersByIds");
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

        ParameterizedTypeReference<List<TeamMember>> localReturnType = new ParameterizedTypeReference<List<TeamMember>>() {};
        return apiClient.invokeAPI("/teams/{team_id}/members/ids", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get team members for a user
     * Get a list of team members for a user. Useful for getting the ids of teams the user is on and the roles they have in those teams. ##### Permissions Must be logged in as the user or have the &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - Team members retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param userId User GUID (required)
     * @return List&lt;TeamMember&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TeamMember> getTeamMembersForUser(String userId) throws RestClientException {
        return getTeamMembersForUserWithHttpInfo(userId).getBody();
    }

    /**
     * Get team members for a user
     * Get a list of team members for a user. Useful for getting the ids of teams the user is on and the roles they have in those teams. ##### Permissions Must be logged in as the user or have the &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - Team members retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param userId User GUID (required)
     * @return ResponseEntity&lt;List&lt;TeamMember&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TeamMember>> getTeamMembersForUserWithHttpInfo(String userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getTeamMembersForUser");
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

        ParameterizedTypeReference<List<TeamMember>> localReturnType = new ParameterizedTypeReference<List<TeamMember>>() {};
        return apiClient.invokeAPI("/users/{user_id}/teams/members", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a team stats
     * Get a team stats on the system. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     * <p><b>200</b> - Team stats retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @return TeamStats
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TeamStats getTeamStats(String teamId) throws RestClientException {
        return getTeamStatsWithHttpInfo(teamId).getBody();
    }

    /**
     * Get a team stats
     * Get a team stats on the system. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     * <p><b>200</b> - Team stats retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @return ResponseEntity&lt;TeamStats&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TeamStats> getTeamStatsWithHttpInfo(String teamId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getTeamStats");
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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<TeamStats> localReturnType = new ParameterizedTypeReference<TeamStats>() {};
        return apiClient.invokeAPI("/teams/{team_id}/stats", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get unreads for a team
     * Get the unread mention and message counts for a team for the specified user. ##### Permissions Must be the user or have &#x60;edit_other_users&#x60; permission and have &#x60;view_team&#x60; permission for the team. 
     * <p><b>200</b> - Team unread count retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param userId User GUID (required)
     * @param teamId Team GUID (required)
     * @return TeamUnread
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TeamUnread getTeamUnread(String userId, String teamId) throws RestClientException {
        return getTeamUnreadWithHttpInfo(userId, teamId).getBody();
    }

    /**
     * Get unreads for a team
     * Get the unread mention and message counts for a team for the specified user. ##### Permissions Must be the user or have &#x60;edit_other_users&#x60; permission and have &#x60;view_team&#x60; permission for the team. 
     * <p><b>200</b> - Team unread count retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param userId User GUID (required)
     * @param teamId Team GUID (required)
     * @return ResponseEntity&lt;TeamUnread&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TeamUnread> getTeamUnreadWithHttpInfo(String userId, String teamId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getTeamUnread");
        }
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling getTeamUnread");
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

        ParameterizedTypeReference<TeamUnread> localReturnType = new ParameterizedTypeReference<TeamUnread>() {};
        return apiClient.invokeAPI("/users/{user_id}/teams/{team_id}/unread", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a user&#39;s teams
     * Get a list of teams that a user is on. ##### Permissions Must be authenticated as the user or have the &#x60;manage_system&#x60; permission. 
     * <p><b>200</b> - Team list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId User GUID (required)
     * @return List&lt;Team&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Team> getTeamsForUser(String userId) throws RestClientException {
        return getTeamsForUserWithHttpInfo(userId).getBody();
    }

    /**
     * Get a user&#39;s teams
     * Get a list of teams that a user is on. ##### Permissions Must be authenticated as the user or have the &#x60;manage_system&#x60; permission. 
     * <p><b>200</b> - Team list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId User GUID (required)
     * @return ResponseEntity&lt;List&lt;Team&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Team>> getTeamsForUserWithHttpInfo(String userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getTeamsForUser");
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

        ParameterizedTypeReference<List<Team>> localReturnType = new ParameterizedTypeReference<List<Team>>() {};
        return apiClient.invokeAPI("/users/{user_id}/teams", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get team unreads for a user
     * Get the count for unread messages and mentions in the teams the user is a member of. ##### Permissions Must be logged in. 
     * <p><b>200</b> - Team unreads retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId User GUID (required)
     * @param excludeTeam Optional team id to be excluded from the results (required)
     * @param includeCollapsedThreads Boolean to determine whether the collapsed threads should be included or not (optional, default to false)
     * @return List&lt;TeamUnread&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TeamUnread> getTeamsUnreadForUser(String userId, String excludeTeam, Boolean includeCollapsedThreads) throws RestClientException {
        return getTeamsUnreadForUserWithHttpInfo(userId, excludeTeam, includeCollapsedThreads).getBody();
    }

    /**
     * Get team unreads for a user
     * Get the count for unread messages and mentions in the teams the user is a member of. ##### Permissions Must be logged in. 
     * <p><b>200</b> - Team unreads retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId User GUID (required)
     * @param excludeTeam Optional team id to be excluded from the results (required)
     * @param includeCollapsedThreads Boolean to determine whether the collapsed threads should be included or not (optional, default to false)
     * @return ResponseEntity&lt;List&lt;TeamUnread&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TeamUnread>> getTeamsUnreadForUserWithHttpInfo(String userId, String excludeTeam, Boolean includeCollapsedThreads) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getTeamsUnreadForUser");
        }
        
        // verify the required parameter 'excludeTeam' is set
        if (excludeTeam == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'excludeTeam' when calling getTeamsUnreadForUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "exclude_team", excludeTeam));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "include_collapsed_threads", includeCollapsedThreads));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<TeamUnread>> localReturnType = new ParameterizedTypeReference<List<TeamUnread>>() {};
        return apiClient.invokeAPI("/users/{user_id}/teams/unread", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Invite guests to the team by email
     * Invite guests to existing team channels usign the user&#39;s email.  The number of emails that can be sent is rate limited to 20 per hour with a burst of 20 emails. If the rate limit exceeds, the error message contains details on when to retry and when the timer will be reset.  ##### Permissions Must have &#x60;invite_guest&#x60; permission for the team. 
     * <p><b>200</b> - Guests invite successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>413</b>
     * @param teamId Team GUID (required)
     * @param inviteGuestsToTeamRequest Guests invite information (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK inviteGuestsToTeam(String teamId, InviteGuestsToTeamRequest inviteGuestsToTeamRequest) throws RestClientException {
        return inviteGuestsToTeamWithHttpInfo(teamId, inviteGuestsToTeamRequest).getBody();
    }

    /**
     * Invite guests to the team by email
     * Invite guests to existing team channels usign the user&#39;s email.  The number of emails that can be sent is rate limited to 20 per hour with a burst of 20 emails. If the rate limit exceeds, the error message contains details on when to retry and when the timer will be reset.  ##### Permissions Must have &#x60;invite_guest&#x60; permission for the team. 
     * <p><b>200</b> - Guests invite successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>413</b>
     * @param teamId Team GUID (required)
     * @param inviteGuestsToTeamRequest Guests invite information (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> inviteGuestsToTeamWithHttpInfo(String teamId, InviteGuestsToTeamRequest inviteGuestsToTeamRequest) throws RestClientException {
        Object localVarPostBody = inviteGuestsToTeamRequest;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling inviteGuestsToTeam");
        }
        
        // verify the required parameter 'inviteGuestsToTeamRequest' is set
        if (inviteGuestsToTeamRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inviteGuestsToTeamRequest' when calling inviteGuestsToTeam");
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

        ParameterizedTypeReference<StatusOK> localReturnType = new ParameterizedTypeReference<StatusOK>() {};
        return apiClient.invokeAPI("/teams/{team_id}/invite-guests/email", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search files in a team
     * Search for files in a team based on file name, extention and file content (if file content extraction is enabled and supported for the files). ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     * <p><b>200</b> - Files list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @param searchFilesRequest The search terms and logic to use in the search. (required)
     * @return FileInfoList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FileInfoList searchFiles(String teamId, SearchFilesRequest searchFilesRequest) throws RestClientException {
        return searchFilesWithHttpInfo(teamId, searchFilesRequest).getBody();
    }

    /**
     * Search files in a team
     * Search for files in a team based on file name, extention and file content (if file content extraction is enabled and supported for the files). ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     * <p><b>200</b> - Files list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @param searchFilesRequest The search terms and logic to use in the search. (required)
     * @return ResponseEntity&lt;FileInfoList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FileInfoList> searchFilesWithHttpInfo(String teamId, SearchFilesRequest searchFilesRequest) throws RestClientException {
        Object localVarPostBody = searchFilesRequest;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling searchFiles");
        }
        
        // verify the required parameter 'searchFilesRequest' is set
        if (searchFilesRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'searchFilesRequest' when calling searchFiles");
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

        ParameterizedTypeReference<FileInfoList> localReturnType = new ParameterizedTypeReference<FileInfoList>() {};
        return apiClient.invokeAPI("/teams/{team_id}/files/search", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a team member roles
     * Update a team member roles. Valid team roles are \&quot;team_user\&quot;, \&quot;team_admin\&quot; or both of them. Overwrites any previously assigned team roles. ##### Permissions Must be authenticated and have the &#x60;manage_team_roles&#x60; permission. 
     * <p><b>200</b> - Team member roles update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param userId User GUID (required)
     * @param updateUserRolesRequest Space-delimited team roles to assign to the user (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK updateTeamMemberRoles(String teamId, String userId, UpdateUserRolesRequest updateUserRolesRequest) throws RestClientException {
        return updateTeamMemberRolesWithHttpInfo(teamId, userId, updateUserRolesRequest).getBody();
    }

    /**
     * Update a team member roles
     * Update a team member roles. Valid team roles are \&quot;team_user\&quot;, \&quot;team_admin\&quot; or both of them. Overwrites any previously assigned team roles. ##### Permissions Must be authenticated and have the &#x60;manage_team_roles&#x60; permission. 
     * <p><b>200</b> - Team member roles update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param teamId Team GUID (required)
     * @param userId User GUID (required)
     * @param updateUserRolesRequest Space-delimited team roles to assign to the user (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> updateTeamMemberRolesWithHttpInfo(String teamId, String userId, UpdateUserRolesRequest updateUserRolesRequest) throws RestClientException {
        Object localVarPostBody = updateUserRolesRequest;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling updateTeamMemberRoles");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling updateTeamMemberRoles");
        }
        
        // verify the required parameter 'updateUserRolesRequest' is set
        if (updateUserRolesRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateUserRolesRequest' when calling updateTeamMemberRoles");
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

        ParameterizedTypeReference<StatusOK> localReturnType = new ParameterizedTypeReference<StatusOK>() {};
        return apiClient.invokeAPI("/teams/{team_id}/members/{user_id}/roles", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
