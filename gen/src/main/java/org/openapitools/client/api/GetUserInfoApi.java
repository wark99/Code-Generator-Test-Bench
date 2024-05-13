package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.PublicApiV1EconomyMyBalanceGet400Response;
import org.openapitools.client.model.PublicApiV1UsersMyProfileGet200Response;
import org.openapitools.client.model.PublicApiV1UsersUseridGet200Response;
import org.openapitools.client.model.PublicApiV1UsersUseridGet400Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:02.257670598Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GetUserInfoApi {
    private ApiClient apiClient;

    public GetUserInfoApi() {
        this(new ApiClient());
    }

    public GetUserInfoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get My Profile
     * Retrieve the profile for the authenticated user.
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Not Logged In
     * @return PublicApiV1UsersMyProfileGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PublicApiV1UsersMyProfileGet200Response publicApiV1UsersMyProfileGet() throws RestClientException {
        return publicApiV1UsersMyProfileGetWithHttpInfo().getBody();
    }

    /**
     * Get My Profile
     * Retrieve the profile for the authenticated user.
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Not Logged In
     * @return ResponseEntity&lt;PublicApiV1UsersMyProfileGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PublicApiV1UsersMyProfileGet200Response> publicApiV1UsersMyProfileGetWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<PublicApiV1UsersMyProfileGet200Response> localReturnType = new ParameterizedTypeReference<PublicApiV1UsersMyProfileGet200Response>() {};
        return apiClient.invokeAPI("/public-api/v1/users/my-profile", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get User by ID
     * Retrieve user information by user ID.
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - User Not Found
     * @param userid The ID of the user. (required)
     * @return PublicApiV1UsersUseridGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PublicApiV1UsersUseridGet200Response publicApiV1UsersUseridGet(Integer userid) throws RestClientException {
        return publicApiV1UsersUseridGetWithHttpInfo(userid).getBody();
    }

    /**
     * Get User by ID
     * Retrieve user information by user ID.
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - User Not Found
     * @param userid The ID of the user. (required)
     * @return ResponseEntity&lt;PublicApiV1UsersUseridGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PublicApiV1UsersUseridGet200Response> publicApiV1UsersUseridGetWithHttpInfo(Integer userid) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling publicApiV1UsersUseridGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);

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

        ParameterizedTypeReference<PublicApiV1UsersUseridGet200Response> localReturnType = new ParameterizedTypeReference<PublicApiV1UsersUseridGet200Response>() {};
        return apiClient.invokeAPI("/public-api/v1/users/{userid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get User by Username
     * Retrieve user information by username.
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - User Not Found
     * @param username The username of the user. (required)
     * @return PublicApiV1UsersUseridGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PublicApiV1UsersUseridGet200Response publicApiV1UsersUsernameGet(String username) throws RestClientException {
        return publicApiV1UsersUsernameGetWithHttpInfo(username).getBody();
    }

    /**
     * Get User by Username
     * Retrieve user information by username.
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - User Not Found
     * @param username The username of the user. (required)
     * @return ResponseEntity&lt;PublicApiV1UsersUseridGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PublicApiV1UsersUseridGet200Response> publicApiV1UsersUsernameGetWithHttpInfo(String username) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling publicApiV1UsersUsernameGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);

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

        ParameterizedTypeReference<PublicApiV1UsersUseridGet200Response> localReturnType = new ParameterizedTypeReference<PublicApiV1UsersUseridGet200Response>() {};
        return apiClient.invokeAPI("/public-api/v1/users/{username}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
