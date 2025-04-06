package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ErrorResponseObject;
import org.openapitools.client.model.GetRecipesForEntity200Response;
import org.openapitools.client.model.GetUserById200Response;
import org.openapitools.client.model.GetUserFollowing200Response;
import org.openapitools.client.model.UserProfile;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T13:20:56.516679004Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UserApi {
    private ApiClient apiClient;

    public UserApi() {
        this(new ApiClient());
    }

    public UserApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Follow a user
     * 
     * <p><b>200</b> - OK - returning new user profile
     * <p><b>400</b>
     * <p><b>404</b>
     * @param userId  (required)
     * @return GetUserById200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetUserById200Response followUser(Integer userId) throws RestClientException {
        return followUserWithHttpInfo(userId).getBody();
    }

    /**
     * Follow a user
     * 
     * <p><b>200</b> - OK - returning new user profile
     * <p><b>400</b>
     * <p><b>404</b>
     * @param userId  (required)
     * @return ResponseEntity&lt;GetUserById200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetUserById200Response> followUserWithHttpInfo(Integer userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling followUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

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

        String[] localVarAuthNames = new String[] { "auth_jwt" };

        ParameterizedTypeReference<GetUserById200Response> localReturnType = new ParameterizedTypeReference<GetUserById200Response>() {};
        return apiClient.invokeAPI("/users/{userId}/follow", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get user&#39;s feed
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @param type  (required)
     * @return GetRecipesForEntity200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetRecipesForEntity200Response getFeed(String type) throws RestClientException {
        return getFeedWithHttpInfo(type).getBody();
    }

    /**
     * Get user&#39;s feed
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @param type  (required)
     * @return ResponseEntity&lt;GetRecipesForEntity200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetRecipesForEntity200Response> getFeedWithHttpInfo(String type) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling getFeed");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "auth_jwt" };

        ParameterizedTypeReference<GetRecipesForEntity200Response> localReturnType = new ParameterizedTypeReference<GetRecipesForEntity200Response>() {};
        return apiClient.invokeAPI("/feed", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get own profile
     * 
     * <p><b>200</b> - OK
     * <p><b>403</b>
     * @return GetUserById200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetUserById200Response getMe() throws RestClientException {
        return getMeWithHttpInfo().getBody();
    }

    /**
     * Get own profile
     * 
     * <p><b>200</b> - OK
     * <p><b>403</b>
     * @return ResponseEntity&lt;GetUserById200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetUserById200Response> getMeWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

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

        String[] localVarAuthNames = new String[] { "auth_jwt" };

        ParameterizedTypeReference<GetUserById200Response> localReturnType = new ParameterizedTypeReference<GetUserById200Response>() {};
        return apiClient.invokeAPI("/users/me", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get user profile
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param userId  (required)
     * @return GetUserById200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetUserById200Response getUserById(Integer userId) throws RestClientException {
        return getUserByIdWithHttpInfo(userId).getBody();
    }

    /**
     * Get user profile
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param userId  (required)
     * @return ResponseEntity&lt;GetUserById200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetUserById200Response> getUserByIdWithHttpInfo(Integer userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getUserById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

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

        String[] localVarAuthNames = new String[] { "auth_jwt" };

        ParameterizedTypeReference<GetUserById200Response> localReturnType = new ParameterizedTypeReference<GetUserById200Response>() {};
        return apiClient.invokeAPI("/users/{userId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get user&#39;s followers
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @param userId  (required)
     * @return GetUserFollowing200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetUserFollowing200Response getUserFollowers(Integer userId) throws RestClientException {
        return getUserFollowersWithHttpInfo(userId).getBody();
    }

    /**
     * Get user&#39;s followers
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @param userId  (required)
     * @return ResponseEntity&lt;GetUserFollowing200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetUserFollowing200Response> getUserFollowersWithHttpInfo(Integer userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getUserFollowers");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

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

        ParameterizedTypeReference<GetUserFollowing200Response> localReturnType = new ParameterizedTypeReference<GetUserFollowing200Response>() {};
        return apiClient.invokeAPI("/users/{userId}/followers", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get users being followed
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @param userId  (required)
     * @return GetUserFollowing200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetUserFollowing200Response getUserFollowing(Integer userId) throws RestClientException {
        return getUserFollowingWithHttpInfo(userId).getBody();
    }

    /**
     * Get users being followed
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @param userId  (required)
     * @return ResponseEntity&lt;GetUserFollowing200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetUserFollowing200Response> getUserFollowingWithHttpInfo(Integer userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getUserFollowing");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

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

        String[] localVarAuthNames = new String[] { "auth_jwt" };

        ParameterizedTypeReference<GetUserFollowing200Response> localReturnType = new ParameterizedTypeReference<GetUserFollowing200Response>() {};
        return apiClient.invokeAPI("/users/{userId}/following", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search for users
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @param q  (optional)
     * @return GetUserFollowing200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetUserFollowing200Response searchUsers(String q) throws RestClientException {
        return searchUsersWithHttpInfo(q).getBody();
    }

    /**
     * Search for users
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @param q  (optional)
     * @return ResponseEntity&lt;GetUserFollowing200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetUserFollowing200Response> searchUsersWithHttpInfo(String q) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetUserFollowing200Response> localReturnType = new ParameterizedTypeReference<GetUserFollowing200Response>() {};
        return apiClient.invokeAPI("/search/users", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Unfollow a user
     * 
     * <p><b>200</b> - OK - returning new user profile
     * <p><b>400</b>
     * <p><b>404</b>
     * @param userId  (required)
     * @return GetUserById200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetUserById200Response unfollowUser(Integer userId) throws RestClientException {
        return unfollowUserWithHttpInfo(userId).getBody();
    }

    /**
     * Unfollow a user
     * 
     * <p><b>200</b> - OK - returning new user profile
     * <p><b>400</b>
     * <p><b>404</b>
     * @param userId  (required)
     * @return ResponseEntity&lt;GetUserById200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetUserById200Response> unfollowUserWithHttpInfo(Integer userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling unfollowUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

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

        String[] localVarAuthNames = new String[] { "auth_jwt" };

        ParameterizedTypeReference<GetUserById200Response> localReturnType = new ParameterizedTypeReference<GetUserById200Response>() {};
        return apiClient.invokeAPI("/users/{userId}/follow", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update user profile
     * Can only update own profile
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param userId  (required)
     * @param userProfile  (required)
     * @return GetUserById200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetUserById200Response updateUserById(Integer userId, UserProfile userProfile) throws RestClientException {
        return updateUserByIdWithHttpInfo(userId, userProfile).getBody();
    }

    /**
     * Update user profile
     * Can only update own profile
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param userId  (required)
     * @param userProfile  (required)
     * @return ResponseEntity&lt;GetUserById200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetUserById200Response> updateUserByIdWithHttpInfo(Integer userId, UserProfile userProfile) throws RestClientException {
        Object localVarPostBody = userProfile;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling updateUserById");
        }
        
        // verify the required parameter 'userProfile' is set
        if (userProfile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userProfile' when calling updateUserById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

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

        String[] localVarAuthNames = new String[] { "auth_jwt" };

        ParameterizedTypeReference<GetUserById200Response> localReturnType = new ParameterizedTypeReference<GetUserById200Response>() {};
        return apiClient.invokeAPI("/users/{userId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
