package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiUsersPutRequest;
import org.openapitools.client.model.MessageBad;
import org.openapitools.client.model.MessageGood;
import org.openapitools.client.model.Token;
import org.openapitools.client.model.User;
import org.openapitools.client.model.UserAll;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:03.133651353Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * Make new user
     * make new user
     * <p><b>201</b> - new user
     * <p><b>400</b> - Password not match requirement/Username too short(6-) or too long(32+)/Username Exist
     * @param userAll Must have username, password (required)
     * @return UserAll
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserAll apiAuthNewPost(UserAll userAll) throws RestClientException {
        return apiAuthNewPostWithHttpInfo(userAll).getBody();
    }

    /**
     * Make new user
     * make new user
     * <p><b>201</b> - new user
     * <p><b>400</b> - Password not match requirement/Username too short(6-) or too long(32+)/Username Exist
     * @param userAll Must have username, password (required)
     * @return ResponseEntity&lt;UserAll&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserAll> apiAuthNewPostWithHttpInfo(UserAll userAll) throws RestClientException {
        Object localVarPostBody = userAll;
        
        // verify the required parameter 'userAll' is set
        if (userAll == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userAll' when calling apiAuthNewPost");
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

        ParameterizedTypeReference<UserAll> localReturnType = new ParameterizedTypeReference<UserAll>() {};
        return apiClient.invokeAPI("/api/auth/new", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Sign in
     * return a token string
     * <p><b>201</b> - Signed in
     * <p><b>400</b> - Password not match requirement/Username too short(6-) or too long(32+)
     * @param user Must have username, password (required)
     * @return Token
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Token apiAuthPost(User user) throws RestClientException {
        return apiAuthPostWithHttpInfo(user).getBody();
    }

    /**
     * Sign in
     * return a token string
     * <p><b>201</b> - Signed in
     * <p><b>400</b> - Password not match requirement/Username too short(6-) or too long(32+)
     * @param user Must have username, password (required)
     * @return ResponseEntity&lt;Token&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Token> apiAuthPostWithHttpInfo(User user) throws RestClientException {
        Object localVarPostBody = user;
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'user' when calling apiAuthPost");
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

        ParameterizedTypeReference<Token> localReturnType = new ParameterizedTypeReference<Token>() {};
        return apiClient.invokeAPI("/api/auth", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete your data
     * Delete username, password, comment, playlist
     * <p><b>200</b> - Delete
     * <p><b>404</b> - Dont have permission
     * @return MessageGood
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MessageGood apiUsersDelete() throws RestClientException {
        return apiUsersDeleteWithHttpInfo().getBody();
    }

    /**
     * Delete your data
     * Delete username, password, comment, playlist
     * <p><b>200</b> - Delete
     * <p><b>404</b> - Dont have permission
     * @return ResponseEntity&lt;MessageGood&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MessageGood> apiUsersDeleteWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<MessageGood> localReturnType = new ParameterizedTypeReference<MessageGood>() {};
        return apiClient.invokeAPI("/api/users", HttpMethod.DELETE, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Read user infor from id
     * Read user infor from id
     * <p><b>200</b> - User with id
     * <p><b>204</b> - No user
     * @param id id is 1+ (required)
     * @return UserAll
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserAll apiUsersIdGet(Integer id) throws RestClientException {
        return apiUsersIdGetWithHttpInfo(id).getBody();
    }

    /**
     * Read user infor from id
     * Read user infor from id
     * <p><b>200</b> - User with id
     * <p><b>204</b> - No user
     * @param id id is 1+ (required)
     * @return ResponseEntity&lt;UserAll&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserAll> apiUsersIdGetWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiUsersIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        ParameterizedTypeReference<UserAll> localReturnType = new ParameterizedTypeReference<UserAll>() {};
        return apiClient.invokeAPI("/api/users/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update your infor
     * Edit your infors
     * <p><b>200</b> - Updated
     * <p><b>400</b> - Password not match requirement/Username too short(6-) or too long(32+)
     * <p><b>404</b> - Dont have permission
     * @param apiUsersPutRequest Must have username, name ,password (required)
     * @return MessageGood
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MessageGood apiUsersPut(ApiUsersPutRequest apiUsersPutRequest) throws RestClientException {
        return apiUsersPutWithHttpInfo(apiUsersPutRequest).getBody();
    }

    /**
     * Update your infor
     * Edit your infors
     * <p><b>200</b> - Updated
     * <p><b>400</b> - Password not match requirement/Username too short(6-) or too long(32+)
     * <p><b>404</b> - Dont have permission
     * @param apiUsersPutRequest Must have username, name ,password (required)
     * @return ResponseEntity&lt;MessageGood&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MessageGood> apiUsersPutWithHttpInfo(ApiUsersPutRequest apiUsersPutRequest) throws RestClientException {
        Object localVarPostBody = apiUsersPutRequest;
        
        // verify the required parameter 'apiUsersPutRequest' is set
        if (apiUsersPutRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiUsersPutRequest' when calling apiUsersPut");
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

        ParameterizedTypeReference<MessageGood> localReturnType = new ParameterizedTypeReference<MessageGood>() {};
        return apiClient.invokeAPI("/api/users", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
