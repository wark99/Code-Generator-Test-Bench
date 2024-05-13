package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.PostForgotPasswordRequest;
import org.openapitools.client.model.PostRegisterRequest;
import org.openapitools.client.model.PostResetPasswordRequest;
import org.openapitools.client.model.PostTokenRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:35.686627593Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AuthApi {
    private ApiClient apiClient;

    public AuthApi() {
        this(new ApiClient());
    }

    public AuthApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Whoami
     * Retrieve the authenticated user.
     * <p><b>200</b>
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object getWhoami() throws RestClientException {
        return getWhoamiWithHttpInfo().getBody();
    }

    /**
     * Whoami
     * Retrieve the authenticated user.
     * <p><b>200</b>
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getWhoamiWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/whoami", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Password reset link
     * Request a password reset link.
     * <p><b>200</b>
     * @param postForgotPasswordRequest Sends a new password reset email. (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object postForgotPassword(PostForgotPasswordRequest postForgotPasswordRequest) throws RestClientException {
        return postForgotPasswordWithHttpInfo(postForgotPasswordRequest).getBody();
    }

    /**
     * Password reset link
     * Request a password reset link.
     * <p><b>200</b>
     * @param postForgotPasswordRequest Sends a new password reset email. (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> postForgotPasswordWithHttpInfo(PostForgotPasswordRequest postForgotPasswordRequest) throws RestClientException {
        Object localVarPostBody = postForgotPasswordRequest;
        

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

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/auth/forgot-password", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Register a user
     * Register and retrieve a token.
     * <p><b>201</b>
     * @param postRegisterRequest Creates and authenticates a new User and generates a new Token. (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object postRegister(PostRegisterRequest postRegisterRequest) throws RestClientException {
        return postRegisterWithHttpInfo(postRegisterRequest).getBody();
    }

    /**
     * Register a user
     * Register and retrieve a token.
     * <p><b>201</b>
     * @param postRegisterRequest Creates and authenticates a new User and generates a new Token. (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> postRegisterWithHttpInfo(PostRegisterRequest postRegisterRequest) throws RestClientException {
        Object localVarPostBody = postRegisterRequest;
        

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

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/auth/register", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Reset password
     * Reset the users password.
     * <p><b>200</b>
     * @param postResetPasswordRequest Resets the User password. (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object postResetPassword(PostResetPasswordRequest postResetPasswordRequest) throws RestClientException {
        return postResetPasswordWithHttpInfo(postResetPasswordRequest).getBody();
    }

    /**
     * Reset password
     * Reset the users password.
     * <p><b>200</b>
     * @param postResetPasswordRequest Resets the User password. (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> postResetPasswordWithHttpInfo(PostResetPasswordRequest postResetPasswordRequest) throws RestClientException {
        Object localVarPostBody = postResetPasswordRequest;
        

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

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/auth/reset-password", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a token
     * Sign in and retrieve a token.
     * <p><b>200</b>
     * @param postTokenRequest Authenticates the User credentials and generates a new Token. (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object postToken(PostTokenRequest postTokenRequest) throws RestClientException {
        return postTokenWithHttpInfo(postTokenRequest).getBody();
    }

    /**
     * Get a token
     * Sign in and retrieve a token.
     * <p><b>200</b>
     * @param postTokenRequest Authenticates the User credentials and generates a new Token. (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> postTokenWithHttpInfo(PostTokenRequest postTokenRequest) throws RestClientException {
        Object localVarPostBody = postTokenRequest;
        

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

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/auth/token", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
