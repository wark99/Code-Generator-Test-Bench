package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AuthAccessTokenPost200Response;
import org.openapitools.client.model.AuthAccessTokenPostRequest;
import org.openapitools.client.model.AuthRefreshTokenPost200Response;
import org.openapitools.client.model.AuthRefreshTokenPostRequest;
import org.openapitools.client.model.AuthSendMfaCodePostRequest;
import org.openapitools.client.model.AuthValidateMfaCodePostRequest;
import org.openapitools.client.model.SearchProfilePost400Response;
import org.openapitools.client.model.SearchProfilePostDefaultResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:24.544913406Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AuthenticationApi {
    private ApiClient apiClient;

    public AuthenticationApi() {
        this(new ApiClient());
    }

    public AuthenticationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Authenticate user
     * Authenticates user and issues them JWT access and refresh tokens. Access token is valid for 1 hour and refresh token is valid for 2 hours. User mobile must be verified using /registration/verify-mobile before they can be issued a token 
     * <p><b>200</b> - Login successful
     * <p><b>400</b> - We were unable to verify your pin code
     * <p><b>0</b> - Unexpected Error
     * @param authAccessTokenPostRequest  (optional)
     * @return AuthAccessTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AuthAccessTokenPost200Response authAccessTokenPost(AuthAccessTokenPostRequest authAccessTokenPostRequest) throws RestClientException {
        return authAccessTokenPostWithHttpInfo(authAccessTokenPostRequest).getBody();
    }

    /**
     * Authenticate user
     * Authenticates user and issues them JWT access and refresh tokens. Access token is valid for 1 hour and refresh token is valid for 2 hours. User mobile must be verified using /registration/verify-mobile before they can be issued a token 
     * <p><b>200</b> - Login successful
     * <p><b>400</b> - We were unable to verify your pin code
     * <p><b>0</b> - Unexpected Error
     * @param authAccessTokenPostRequest  (optional)
     * @return ResponseEntity&lt;AuthAccessTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AuthAccessTokenPost200Response> authAccessTokenPostWithHttpInfo(AuthAccessTokenPostRequest authAccessTokenPostRequest) throws RestClientException {
        Object localVarPostBody = authAccessTokenPostRequest;
        

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

        ParameterizedTypeReference<AuthAccessTokenPost200Response> localReturnType = new ParameterizedTypeReference<AuthAccessTokenPost200Response>() {};
        return apiClient.invokeAPI("/auth/access-token", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * logs user out
     * This allows user to logout, tokens are destroyed.
     * <p><b>204</b> - User successfully logged out
     * <p><b>400</b> - Unable to logout.
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void authLogoutPost() throws RestClientException {
        authLogoutPostWithHttpInfo();
    }

    /**
     * logs user out
     * This allows user to logout, tokens are destroyed.
     * <p><b>204</b> - User successfully logged out
     * <p><b>400</b> - Unable to logout.
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> authLogoutPostWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/auth/logout", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * refreshs your expired token
     * Accepts a valid refresh token to issue you a new access token. Note that no refresh token issued.
     * <p><b>200</b> - Successfully refreshes a token
     * <p><b>400</b> - We were unable to verify your pin code
     * <p><b>0</b> - Unexpected Error
     * @param authRefreshTokenPostRequest  (optional)
     * @return AuthRefreshTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AuthRefreshTokenPost200Response authRefreshTokenPost(AuthRefreshTokenPostRequest authRefreshTokenPostRequest) throws RestClientException {
        return authRefreshTokenPostWithHttpInfo(authRefreshTokenPostRequest).getBody();
    }

    /**
     * refreshs your expired token
     * Accepts a valid refresh token to issue you a new access token. Note that no refresh token issued.
     * <p><b>200</b> - Successfully refreshes a token
     * <p><b>400</b> - We were unable to verify your pin code
     * <p><b>0</b> - Unexpected Error
     * @param authRefreshTokenPostRequest  (optional)
     * @return ResponseEntity&lt;AuthRefreshTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AuthRefreshTokenPost200Response> authRefreshTokenPostWithHttpInfo(AuthRefreshTokenPostRequest authRefreshTokenPostRequest) throws RestClientException {
        Object localVarPostBody = authRefreshTokenPostRequest;
        

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

        ParameterizedTypeReference<AuthRefreshTokenPost200Response> localReturnType = new ParameterizedTypeReference<AuthRefreshTokenPost200Response>() {};
        return apiClient.invokeAPI("/auth/refresh-token", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * send mfa code to user
     * 
     * <p><b>200</b> - Mfa code sent
     * <p><b>400</b> - There was problem sending mfa code
     * @param authSendMfaCodePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void authSendMfaCodePost(AuthSendMfaCodePostRequest authSendMfaCodePostRequest) throws RestClientException {
        authSendMfaCodePostWithHttpInfo(authSendMfaCodePostRequest);
    }

    /**
     * send mfa code to user
     * 
     * <p><b>200</b> - Mfa code sent
     * <p><b>400</b> - There was problem sending mfa code
     * @param authSendMfaCodePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> authSendMfaCodePostWithHttpInfo(AuthSendMfaCodePostRequest authSendMfaCodePostRequest) throws RestClientException {
        Object localVarPostBody = authSendMfaCodePostRequest;
        

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/auth/send-mfa-code", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * validates 6 digit mfa pin code
     * email is mandatory if user is not logged in
     * <p><b>200</b> - Successfully validated mfa pin code
     * <p><b>400</b> - There was problem validating mfa code
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param authValidateMfaCodePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void authValidateMfaCodePost(AuthValidateMfaCodePostRequest authValidateMfaCodePostRequest) throws RestClientException {
        authValidateMfaCodePostWithHttpInfo(authValidateMfaCodePostRequest);
    }

    /**
     * validates 6 digit mfa pin code
     * email is mandatory if user is not logged in
     * <p><b>200</b> - Successfully validated mfa pin code
     * <p><b>400</b> - There was problem validating mfa code
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param authValidateMfaCodePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> authValidateMfaCodePostWithHttpInfo(AuthValidateMfaCodePostRequest authValidateMfaCodePostRequest) throws RestClientException {
        Object localVarPostBody = authValidateMfaCodePostRequest;
        

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/auth/validate-mfa-code", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
