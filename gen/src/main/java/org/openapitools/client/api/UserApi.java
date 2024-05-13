package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CommonError;
import org.openapitools.client.model.CreateUserScheme;
import org.openapitools.client.model.HTTPValidationError;
import org.openapitools.client.model.PageUserBaseScheme;
import org.openapitools.client.model.StatusUser;
import org.openapitools.client.model.UserBaseScheme;
import org.openapitools.client.model.UserRole;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:05.417254227Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * Add user
     * Add user
     * <p><b>201</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param createUserScheme  (required)
     * @return UserBaseScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserBaseScheme addUser(CreateUserScheme createUserScheme) throws RestClientException {
        return addUserWithHttpInfo(createUserScheme).getBody();
    }

    /**
     * Add user
     * Add user
     * <p><b>201</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param createUserScheme  (required)
     * @return ResponseEntity&lt;UserBaseScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserBaseScheme> addUserWithHttpInfo(CreateUserScheme createUserScheme) throws RestClientException {
        Object localVarPostBody = createUserScheme;
        
        // verify the required parameter 'createUserScheme' is set
        if (createUserScheme == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createUserScheme' when calling addUser");
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<UserBaseScheme> localReturnType = new ParameterizedTypeReference<UserBaseScheme>() {};
        return apiClient.invokeAPI("/users/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * User change company
     * User change company
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param companyId unique company id (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object changeCompanyUser(Integer companyId) throws RestClientException {
        return changeCompanyUserWithHttpInfo(companyId).getBody();
    }

    /**
     * User change company
     * User change company
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param companyId unique company id (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> changeCompanyUserWithHttpInfo(Integer companyId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'companyId' when calling changeCompanyUser");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "company_id", companyId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/users/change-company/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * User clear session
     * User clear session
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object clearSessionUser() throws RestClientException {
        return clearSessionUserWithHttpInfo().getBody();
    }

    /**
     * User clear session
     * User clear session
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> clearSessionUserWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/users/clear-session/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete user by id
     * Delete user by id
     * <p><b>204</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id unique user id (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteUser(Integer id) throws RestClientException {
        deleteUserWithHttpInfo(id);
    }

    /**
     * Delete user by id
     * Delete user by id
     * <p><b>204</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id unique user id (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteUserWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteUser");
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/users/{id}/", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Me
     * Get data of the current user  Args:     request: Request     curr_user: Date of the current user  Returns:     Data scheme of the current user
     * <p><b>200</b> - Successful Response
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * @return UserBaseScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserBaseScheme getMe() throws RestClientException {
        return getMeWithHttpInfo().getBody();
    }

    /**
     * Get Me
     * Get data of the current user  Args:     request: Request     curr_user: Date of the current user  Returns:     Data scheme of the current user
     * <p><b>200</b> - Successful Response
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * @return ResponseEntity&lt;UserBaseScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserBaseScheme> getMeWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<UserBaseScheme> localReturnType = new ParameterizedTypeReference<UserBaseScheme>() {};
        return apiClient.invokeAPI("/users/me/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get user by id
     * Get user by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id unique user id (required)
     * @return UserBaseScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserBaseScheme getUser(Integer id) throws RestClientException {
        return getUserWithHttpInfo(id).getBody();
    }

    /**
     * Get user by id
     * Get user by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id unique user id (required)
     * @return ResponseEntity&lt;UserBaseScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserBaseScheme> getUserWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getUser");
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<UserBaseScheme> localReturnType = new ParameterizedTypeReference<UserBaseScheme>() {};
        return apiClient.invokeAPI("/users/{id}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of users
     * Get a list of users
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param role Roles user:   * 0 - Superadmin     * 1 - Administrator     * 2 - Operator     * 3 - User     * 4 - Partner    (optional)
     * @param status Status user:   * 1 - Inactive     * 2 - New     * 3 - Active    (optional)
     * @param text text value for search by name (optional)
     * @param perPage  (optional, default to 1000)
     * @param page  (optional, default to 1)
     * @return PageUserBaseScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageUserBaseScheme getUsers(UserRole role, StatusUser status, String text, Integer perPage, Integer page) throws RestClientException {
        return getUsersWithHttpInfo(role, status, text, perPage, page).getBody();
    }

    /**
     * Get a list of users
     * Get a list of users
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param role Roles user:   * 0 - Superadmin     * 1 - Administrator     * 2 - Operator     * 3 - User     * 4 - Partner    (optional)
     * @param status Status user:   * 1 - Inactive     * 2 - New     * 3 - Active    (optional)
     * @param text text value for search by name (optional)
     * @param perPage  (optional, default to 1000)
     * @param page  (optional, default to 1)
     * @return ResponseEntity&lt;PageUserBaseScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PageUserBaseScheme> getUsersWithHttpInfo(UserRole role, StatusUser status, String text, Integer perPage, Integer page) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "role", role));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "text", text));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<PageUserBaseScheme> localReturnType = new ParameterizedTypeReference<PageUserBaseScheme>() {};
        return apiClient.invokeAPI("/users/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update user by id
     * Update user by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @param createUserScheme  (required)
     * @return UserBaseScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserBaseScheme updateUser(Integer id, CreateUserScheme createUserScheme) throws RestClientException {
        return updateUserWithHttpInfo(id, createUserScheme).getBody();
    }

    /**
     * Update user by id
     * Update user by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @param createUserScheme  (required)
     * @return ResponseEntity&lt;UserBaseScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserBaseScheme> updateUserWithHttpInfo(Integer id, CreateUserScheme createUserScheme) throws RestClientException {
        Object localVarPostBody = createUserScheme;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateUser");
        }
        
        // verify the required parameter 'createUserScheme' is set
        if (createUserScheme == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createUserScheme' when calling updateUser");
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
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<UserBaseScheme> localReturnType = new ParameterizedTypeReference<UserBaseScheme>() {};
        return apiClient.invokeAPI("/users/{id}/", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
