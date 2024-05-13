package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.RecipesGet200Response;
import org.openapitools.client.model.SearchUsersGet200Response;
import org.openapitools.client.model.UserProfile;
import org.openapitools.client.model.UsersFollowPostRequest;
import org.openapitools.client.model.UsersUserIdFollowingGet200Response;
import org.openapitools.client.model.UsersUserIdGet200Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:19:30.095527364Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * Get user&#39;s feed
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @param type  (required)
     * @return RecipesGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RecipesGet200Response feedGet(String type) throws RestClientException {
        return feedGetWithHttpInfo(type).getBody();
    }

    /**
     * Get user&#39;s feed
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @param type  (required)
     * @return ResponseEntity&lt;RecipesGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RecipesGet200Response> feedGetWithHttpInfo(String type) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling feedGet");
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

        ParameterizedTypeReference<RecipesGet200Response> localReturnType = new ParameterizedTypeReference<RecipesGet200Response>() {};
        return apiClient.invokeAPI("/feed", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search for users
     * 
     * <p><b>200</b> - OK
     * @param q  (optional)
     * @return SearchUsersGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SearchUsersGet200Response searchUsersGet(String q) throws RestClientException {
        return searchUsersGetWithHttpInfo(q).getBody();
    }

    /**
     * Search for users
     * 
     * <p><b>200</b> - OK
     * @param q  (optional)
     * @return ResponseEntity&lt;SearchUsersGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SearchUsersGet200Response> searchUsersGetWithHttpInfo(String q) throws RestClientException {
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

        ParameterizedTypeReference<SearchUsersGet200Response> localReturnType = new ParameterizedTypeReference<SearchUsersGet200Response>() {};
        return apiClient.invokeAPI("/search/users", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Follow a user
     * 
     * <p><b>200</b>
     * <p><b>400</b>
     * <p><b>404</b>
     * @param usersFollowPostRequest  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object usersFollowPost(UsersFollowPostRequest usersFollowPostRequest) throws RestClientException {
        return usersFollowPostWithHttpInfo(usersFollowPostRequest).getBody();
    }

    /**
     * Follow a user
     * 
     * <p><b>200</b>
     * <p><b>400</b>
     * <p><b>404</b>
     * @param usersFollowPostRequest  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> usersFollowPostWithHttpInfo(UsersFollowPostRequest usersFollowPostRequest) throws RestClientException {
        Object localVarPostBody = usersFollowPostRequest;
        
        // verify the required parameter 'usersFollowPostRequest' is set
        if (usersFollowPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'usersFollowPostRequest' when calling usersFollowPost");
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

        String[] localVarAuthNames = new String[] { "auth_jwt" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/users/follow", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Unfollow a user
     * 
     * <p><b>200</b>
     * <p><b>400</b>
     * <p><b>404</b>
     * @param usersFollowPostRequest  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object usersUnfollowPost(UsersFollowPostRequest usersFollowPostRequest) throws RestClientException {
        return usersUnfollowPostWithHttpInfo(usersFollowPostRequest).getBody();
    }

    /**
     * Unfollow a user
     * 
     * <p><b>200</b>
     * <p><b>400</b>
     * <p><b>404</b>
     * @param usersFollowPostRequest  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> usersUnfollowPostWithHttpInfo(UsersFollowPostRequest usersFollowPostRequest) throws RestClientException {
        Object localVarPostBody = usersFollowPostRequest;
        
        // verify the required parameter 'usersFollowPostRequest' is set
        if (usersFollowPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'usersFollowPostRequest' when calling usersUnfollowPost");
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

        String[] localVarAuthNames = new String[] { "auth_jwt" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/users/unfollow", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get user&#39;s followers
     * 
     * <p><b>200</b> - OK
     * @param userId  (required)
     * @return UsersUserIdFollowingGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UsersUserIdFollowingGet200Response usersUserIdFollowersGet(Integer userId) throws RestClientException {
        return usersUserIdFollowersGetWithHttpInfo(userId).getBody();
    }

    /**
     * Get user&#39;s followers
     * 
     * <p><b>200</b> - OK
     * @param userId  (required)
     * @return ResponseEntity&lt;UsersUserIdFollowingGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UsersUserIdFollowingGet200Response> usersUserIdFollowersGetWithHttpInfo(Integer userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling usersUserIdFollowersGet");
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

        ParameterizedTypeReference<UsersUserIdFollowingGet200Response> localReturnType = new ParameterizedTypeReference<UsersUserIdFollowingGet200Response>() {};
        return apiClient.invokeAPI("/users/{userId}/followers", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get users being followed
     * 
     * <p><b>200</b> - OK
     * @param userId  (required)
     * @return UsersUserIdFollowingGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UsersUserIdFollowingGet200Response usersUserIdFollowingGet(Integer userId) throws RestClientException {
        return usersUserIdFollowingGetWithHttpInfo(userId).getBody();
    }

    /**
     * Get users being followed
     * 
     * <p><b>200</b> - OK
     * @param userId  (required)
     * @return ResponseEntity&lt;UsersUserIdFollowingGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UsersUserIdFollowingGet200Response> usersUserIdFollowingGetWithHttpInfo(Integer userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling usersUserIdFollowingGet");
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

        ParameterizedTypeReference<UsersUserIdFollowingGet200Response> localReturnType = new ParameterizedTypeReference<UsersUserIdFollowingGet200Response>() {};
        return apiClient.invokeAPI("/users/{userId}/following", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get user profile
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param userId  (required)
     * @return UsersUserIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UsersUserIdGet200Response usersUserIdGet(Integer userId) throws RestClientException {
        return usersUserIdGetWithHttpInfo(userId).getBody();
    }

    /**
     * Get user profile
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param userId  (required)
     * @return ResponseEntity&lt;UsersUserIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UsersUserIdGet200Response> usersUserIdGetWithHttpInfo(Integer userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling usersUserIdGet");
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

        ParameterizedTypeReference<UsersUserIdGet200Response> localReturnType = new ParameterizedTypeReference<UsersUserIdGet200Response>() {};
        return apiClient.invokeAPI("/users/{userId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update user profile
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param userId  (required)
     * @param userProfile  (required)
     * @return UsersUserIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UsersUserIdGet200Response usersUserIdPut(Integer userId, UserProfile userProfile) throws RestClientException {
        return usersUserIdPutWithHttpInfo(userId, userProfile).getBody();
    }

    /**
     * Update user profile
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param userId  (required)
     * @param userProfile  (required)
     * @return ResponseEntity&lt;UsersUserIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UsersUserIdGet200Response> usersUserIdPutWithHttpInfo(Integer userId, UserProfile userProfile) throws RestClientException {
        Object localVarPostBody = userProfile;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling usersUserIdPut");
        }
        
        // verify the required parameter 'userProfile' is set
        if (userProfile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userProfile' when calling usersUserIdPut");
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

        ParameterizedTypeReference<UsersUserIdGet200Response> localReturnType = new ParameterizedTypeReference<UsersUserIdGet200Response>() {};
        return apiClient.invokeAPI("/users/{userId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
