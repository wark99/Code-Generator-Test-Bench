package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiError;
import org.openapitools.client.model.PostUserRecentCustomStatusDeleteRequest;
import org.openapitools.client.model.Status;
import org.openapitools.client.model.StatusOK;
import org.openapitools.client.model.UpdateUserCustomStatusRequest;
import org.openapitools.client.model.UpdateUserStatusRequest;

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
public class StatusApi {
    private ApiClient apiClient;

    public StatusApi() {
        this(new ApiClient());
    }

    public StatusApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get user status
     * Get user status by id from the server. ##### Permissions Must be authenticated. 
     * <p><b>200</b> - User status retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param userId User ID (required)
     * @return Status
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Status getUserStatus(String userId) throws RestClientException {
        return getUserStatusWithHttpInfo(userId).getBody();
    }

    /**
     * Get user status
     * Get user status by id from the server. ##### Permissions Must be authenticated. 
     * <p><b>200</b> - User status retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param userId User ID (required)
     * @return ResponseEntity&lt;Status&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Status> getUserStatusWithHttpInfo(String userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getUserStatus");
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

        ParameterizedTypeReference<Status> localReturnType = new ParameterizedTypeReference<Status>() {};
        return apiClient.invokeAPI("/users/{user_id}/status", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get user statuses by id
     * Get a list of user statuses by id from the server. ##### Permissions Must be authenticated. 
     * <p><b>200</b> - User statuses retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param requestBody List of user ids to fetch (required)
     * @return List&lt;Status&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Status> getUsersStatusesByIds(List<String> requestBody) throws RestClientException {
        return getUsersStatusesByIdsWithHttpInfo(requestBody).getBody();
    }

    /**
     * Get user statuses by id
     * Get a list of user statuses by id from the server. ##### Permissions Must be authenticated. 
     * <p><b>200</b> - User statuses retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param requestBody List of user ids to fetch (required)
     * @return ResponseEntity&lt;List&lt;Status&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Status>> getUsersStatusesByIdsWithHttpInfo(List<String> requestBody) throws RestClientException {
        Object localVarPostBody = requestBody;
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody' when calling getUsersStatusesByIds");
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

        ParameterizedTypeReference<List<Status>> localReturnType = new ParameterizedTypeReference<List<Status>>() {};
        return apiClient.invokeAPI("/users/status/ids", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete user&#39;s recent custom status
     * Deletes a user&#39;s recent custom status by removing the specific status from the recentCustomStatuses in the user&#39;s props and updates the user. ##### Permissions Must be logged in as the user whose recent custom status is being deleted. 
     * <p><b>200</b> - User recent custom status delete successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param userId User ID (required)
     * @param postUserRecentCustomStatusDeleteRequest Custom Status object that is to be removed from the recent custom statuses. (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK postUserRecentCustomStatusDelete(String userId, PostUserRecentCustomStatusDeleteRequest postUserRecentCustomStatusDeleteRequest) throws RestClientException {
        return postUserRecentCustomStatusDeleteWithHttpInfo(userId, postUserRecentCustomStatusDeleteRequest).getBody();
    }

    /**
     * Delete user&#39;s recent custom status
     * Deletes a user&#39;s recent custom status by removing the specific status from the recentCustomStatuses in the user&#39;s props and updates the user. ##### Permissions Must be logged in as the user whose recent custom status is being deleted. 
     * <p><b>200</b> - User recent custom status delete successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param userId User ID (required)
     * @param postUserRecentCustomStatusDeleteRequest Custom Status object that is to be removed from the recent custom statuses. (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> postUserRecentCustomStatusDeleteWithHttpInfo(String userId, PostUserRecentCustomStatusDeleteRequest postUserRecentCustomStatusDeleteRequest) throws RestClientException {
        Object localVarPostBody = postUserRecentCustomStatusDeleteRequest;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling postUserRecentCustomStatusDelete");
        }
        
        // verify the required parameter 'postUserRecentCustomStatusDeleteRequest' is set
        if (postUserRecentCustomStatusDeleteRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postUserRecentCustomStatusDeleteRequest' when calling postUserRecentCustomStatusDelete");
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
        return apiClient.invokeAPI("/users/{user_id}/status/custom/recent/delete", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Unsets user custom status
     * Unsets a user&#39;s custom status by updating the user&#39;s props and updates the user ##### Permissions Must be logged in as the user whose custom status is being removed. 
     * <p><b>200</b> - User custom status delete successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param userId User ID (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK unsetUserCustomStatus(String userId) throws RestClientException {
        return unsetUserCustomStatusWithHttpInfo(userId).getBody();
    }

    /**
     * Unsets user custom status
     * Unsets a user&#39;s custom status by updating the user&#39;s props and updates the user ##### Permissions Must be logged in as the user whose custom status is being removed. 
     * <p><b>200</b> - User custom status delete successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param userId User ID (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> unsetUserCustomStatusWithHttpInfo(String userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling unsetUserCustomStatus");
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

        ParameterizedTypeReference<StatusOK> localReturnType = new ParameterizedTypeReference<StatusOK>() {};
        return apiClient.invokeAPI("/users/{user_id}/status/custom", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update user custom status
     * Updates a user&#39;s custom status by setting the value in the user&#39;s props and updates the user. Also save the given custom status to the recent custom statuses in the user&#39;s props ##### Permissions Must be logged in as the user whose custom status is being updated. 
     * <p><b>200</b> - User custom status update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param userId User ID (required)
     * @param updateUserCustomStatusRequest Custom status object that is to be updated (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK updateUserCustomStatus(String userId, UpdateUserCustomStatusRequest updateUserCustomStatusRequest) throws RestClientException {
        return updateUserCustomStatusWithHttpInfo(userId, updateUserCustomStatusRequest).getBody();
    }

    /**
     * Update user custom status
     * Updates a user&#39;s custom status by setting the value in the user&#39;s props and updates the user. Also save the given custom status to the recent custom statuses in the user&#39;s props ##### Permissions Must be logged in as the user whose custom status is being updated. 
     * <p><b>200</b> - User custom status update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param userId User ID (required)
     * @param updateUserCustomStatusRequest Custom status object that is to be updated (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> updateUserCustomStatusWithHttpInfo(String userId, UpdateUserCustomStatusRequest updateUserCustomStatusRequest) throws RestClientException {
        Object localVarPostBody = updateUserCustomStatusRequest;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling updateUserCustomStatus");
        }
        
        // verify the required parameter 'updateUserCustomStatusRequest' is set
        if (updateUserCustomStatusRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateUserCustomStatusRequest' when calling updateUserCustomStatus");
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
        return apiClient.invokeAPI("/users/{user_id}/status/custom", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update user status
     * Manually set a user&#39;s status. When setting a user&#39;s status, the status will remain that value until set \&quot;online\&quot; again, which will return the status to being automatically updated based on user activity. ##### Permissions Must have &#x60;edit_other_users&#x60; permission for the team. 
     * <p><b>200</b> - User status update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param userId User ID (required)
     * @param updateUserStatusRequest Status object that is to be updated (required)
     * @return Status
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Status updateUserStatus(String userId, UpdateUserStatusRequest updateUserStatusRequest) throws RestClientException {
        return updateUserStatusWithHttpInfo(userId, updateUserStatusRequest).getBody();
    }

    /**
     * Update user status
     * Manually set a user&#39;s status. When setting a user&#39;s status, the status will remain that value until set \&quot;online\&quot; again, which will return the status to being automatically updated based on user activity. ##### Permissions Must have &#x60;edit_other_users&#x60; permission for the team. 
     * <p><b>200</b> - User status update successful
     * <p><b>400</b>
     * <p><b>401</b>
     * @param userId User ID (required)
     * @param updateUserStatusRequest Status object that is to be updated (required)
     * @return ResponseEntity&lt;Status&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Status> updateUserStatusWithHttpInfo(String userId, UpdateUserStatusRequest updateUserStatusRequest) throws RestClientException {
        Object localVarPostBody = updateUserStatusRequest;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling updateUserStatus");
        }
        
        // verify the required parameter 'updateUserStatusRequest' is set
        if (updateUserStatusRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateUserStatusRequest' when calling updateUserStatus");
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

        ParameterizedTypeReference<Status> localReturnType = new ParameterizedTypeReference<Status>() {};
        return apiClient.invokeAPI("/users/{user_id}/status", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
