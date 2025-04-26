package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ErrorResponseObject;
import org.openapitools.client.model.GetUserFollowers200Response;
import org.openapitools.client.model.GetUserProfile200Response;
import org.openapitools.client.model.UserProfileUpdate;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-26T20:19:29.213885611+03:00[Europe/Bucharest]", comments = "Generator version: 7.4.0")
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
     * Follow a user
     * 
     * <p><b>200</b> - Successfully followed the user
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void followUser(Integer userId) throws RestClientException {
        followUserWithHttpInfo(userId);
    }

    /**
     * Follow a user
     * 
     * <p><b>200</b> - Successfully followed the user
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> followUserWithHttpInfo(Integer userId) throws RestClientException {
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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/users/{userId}/follow", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get user&#39;s followers
     * 
     * <p><b>200</b> - Successful response
     * <p><b>404</b>
     * @param userId  (required)
     * @return GetUserFollowers200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetUserFollowers200Response getUserFollowers(Integer userId) throws RestClientException {
        return getUserFollowersWithHttpInfo(userId).getBody();
    }

    /**
     * Get user&#39;s followers
     * 
     * <p><b>200</b> - Successful response
     * <p><b>404</b>
     * @param userId  (required)
     * @return ResponseEntity&lt;GetUserFollowers200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetUserFollowers200Response> getUserFollowersWithHttpInfo(Integer userId) throws RestClientException {
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

        ParameterizedTypeReference<GetUserFollowers200Response> localReturnType = new ParameterizedTypeReference<GetUserFollowers200Response>() {};
        return apiClient.invokeAPI("/users/{userId}/followers", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get users being followed
     * 
     * <p><b>200</b> - Successful response
     * <p><b>404</b>
     * @param userId  (required)
     * @return GetUserFollowers200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetUserFollowers200Response getUserFollowing(Integer userId) throws RestClientException {
        return getUserFollowingWithHttpInfo(userId).getBody();
    }

    /**
     * Get users being followed
     * 
     * <p><b>200</b> - Successful response
     * <p><b>404</b>
     * @param userId  (required)
     * @return ResponseEntity&lt;GetUserFollowers200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetUserFollowers200Response> getUserFollowingWithHttpInfo(Integer userId) throws RestClientException {
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetUserFollowers200Response> localReturnType = new ParameterizedTypeReference<GetUserFollowers200Response>() {};
        return apiClient.invokeAPI("/users/{userId}/following", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get user profile
     * 
     * <p><b>200</b> - Successful response
     * <p><b>404</b>
     * @param userId  (required)
     * @return GetUserProfile200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetUserProfile200Response getUserProfile(Integer userId) throws RestClientException {
        return getUserProfileWithHttpInfo(userId).getBody();
    }

    /**
     * Get user profile
     * 
     * <p><b>200</b> - Successful response
     * <p><b>404</b>
     * @param userId  (required)
     * @return ResponseEntity&lt;GetUserProfile200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetUserProfile200Response> getUserProfileWithHttpInfo(Integer userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getUserProfile");
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

        ParameterizedTypeReference<GetUserProfile200Response> localReturnType = new ParameterizedTypeReference<GetUserProfile200Response>() {};
        return apiClient.invokeAPI("/users/{userId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Unfollow a user
     * 
     * <p><b>200</b> - Successfully unfollowed the user
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void unfollowUser(Integer userId) throws RestClientException {
        unfollowUserWithHttpInfo(userId);
    }

    /**
     * Unfollow a user
     * 
     * <p><b>200</b> - Successfully unfollowed the user
     * <p><b>401</b>
     * <p><b>404</b>
     * @param userId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> unfollowUserWithHttpInfo(Integer userId) throws RestClientException {
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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/users/{userId}/unfollow", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update user profile
     * 
     * <p><b>200</b> - Profile successfully updated
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId  (required)
     * @param userProfileUpdate  (required)
     * @return GetUserProfile200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetUserProfile200Response updateUserProfile(Integer userId, UserProfileUpdate userProfileUpdate) throws RestClientException {
        return updateUserProfileWithHttpInfo(userId, userProfileUpdate).getBody();
    }

    /**
     * Update user profile
     * 
     * <p><b>200</b> - Profile successfully updated
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId  (required)
     * @param userProfileUpdate  (required)
     * @return ResponseEntity&lt;GetUserProfile200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetUserProfile200Response> updateUserProfileWithHttpInfo(Integer userId, UserProfileUpdate userProfileUpdate) throws RestClientException {
        Object localVarPostBody = userProfileUpdate;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling updateUserProfile");
        }
        
        // verify the required parameter 'userProfileUpdate' is set
        if (userProfileUpdate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userProfileUpdate' when calling updateUserProfile");
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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GetUserProfile200Response> localReturnType = new ParameterizedTypeReference<GetUserProfile200Response>() {};
        return apiClient.invokeAPI("/users/{userId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
