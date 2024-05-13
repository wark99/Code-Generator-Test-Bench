package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AuthResponse;
import org.openapitools.client.model.ClientId;
import org.openapitools.client.model.ClientSecret;
import org.openapitools.client.model.GrantType;
import org.openapitools.client.model.HTTPValidationError;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:21.037021681Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class LoginApi {
    private ApiClient apiClient;

    public LoginApi() {
        this(new ApiClient());
    }

    public LoginApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Login For Access Token
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param username  (required)
     * @param password  (required)
     * @param grantType  (optional)
     * @param scope  (optional, default to )
     * @param clientId  (optional)
     * @param clientSecret  (optional)
     * @return AuthResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AuthResponse loginForAccessTokenApiV1LoginTokenPost(String username, String password, GrantType grantType, String scope, ClientId clientId, ClientSecret clientSecret) throws RestClientException {
        return loginForAccessTokenApiV1LoginTokenPostWithHttpInfo(username, password, grantType, scope, clientId, clientSecret).getBody();
    }

    /**
     * Login For Access Token
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param username  (required)
     * @param password  (required)
     * @param grantType  (optional)
     * @param scope  (optional, default to )
     * @param clientId  (optional)
     * @param clientSecret  (optional)
     * @return ResponseEntity&lt;AuthResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AuthResponse> loginForAccessTokenApiV1LoginTokenPostWithHttpInfo(String username, String password, GrantType grantType, String scope, ClientId clientId, ClientSecret clientSecret) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling loginForAccessTokenApiV1LoginTokenPost");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'password' when calling loginForAccessTokenApiV1LoginTokenPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (grantType != null)
            localVarFormParams.add("grant_type", grantType);
        if (username != null)
            localVarFormParams.add("username", username);
        if (password != null)
            localVarFormParams.add("password", password);
        if (scope != null)
            localVarFormParams.add("scope", scope);
        if (clientId != null)
            localVarFormParams.add("client_id", clientId);
        if (clientSecret != null)
            localVarFormParams.add("client_secret", clientSecret);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<AuthResponse> localReturnType = new ParameterizedTypeReference<AuthResponse>() {};
        return apiClient.invokeAPI("/api/v1/login/token", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
