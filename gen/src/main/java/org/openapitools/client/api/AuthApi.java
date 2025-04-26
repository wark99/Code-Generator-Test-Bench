package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ErrorResponseObject;
import org.openapitools.client.model.ResetPasswordRequest;
import org.openapitools.client.model.SignUp201Response;
import org.openapitools.client.model.UserLogin;
import org.openapitools.client.model.UserRegistration;
import org.openapitools.client.model.VerifyEmailRequest;

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
     * User login
     * 
     * <p><b>200</b> - Successful login
     * <p><b>401</b>
     * @param userLogin  (required)
     * @return SignUp201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SignUp201Response login(UserLogin userLogin) throws RestClientException {
        return loginWithHttpInfo(userLogin).getBody();
    }

    /**
     * User login
     * 
     * <p><b>200</b> - Successful login
     * <p><b>401</b>
     * @param userLogin  (required)
     * @return ResponseEntity&lt;SignUp201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SignUp201Response> loginWithHttpInfo(UserLogin userLogin) throws RestClientException {
        Object localVarPostBody = userLogin;
        
        // verify the required parameter 'userLogin' is set
        if (userLogin == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userLogin' when calling login");
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

        ParameterizedTypeReference<SignUp201Response> localReturnType = new ParameterizedTypeReference<SignUp201Response>() {};
        return apiClient.invokeAPI("/auth/login", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * User logout
     * 
     * <p><b>200</b> - Successful logout
     * <p><b>401</b>
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void logout() throws RestClientException {
        logoutWithHttpInfo();
    }

    /**
     * User logout
     * 
     * <p><b>200</b> - Successful logout
     * <p><b>401</b>
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> logoutWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/auth/logout", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Reset user&#39;s password
     * 
     * <p><b>200</b> - Password reset email sent
     * <p><b>400</b>
     * @param resetPasswordRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void resetPassword(ResetPasswordRequest resetPasswordRequest) throws RestClientException {
        resetPasswordWithHttpInfo(resetPasswordRequest);
    }

    /**
     * Reset user&#39;s password
     * 
     * <p><b>200</b> - Password reset email sent
     * <p><b>400</b>
     * @param resetPasswordRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> resetPasswordWithHttpInfo(ResetPasswordRequest resetPasswordRequest) throws RestClientException {
        Object localVarPostBody = resetPasswordRequest;
        
        // verify the required parameter 'resetPasswordRequest' is set
        if (resetPasswordRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resetPasswordRequest' when calling resetPassword");
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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/auth/reset-password", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Register a new user
     * 
     * <p><b>201</b> - User successfully registered
     * <p><b>400</b>
     * @param userRegistration  (required)
     * @return SignUp201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SignUp201Response signUp(UserRegistration userRegistration) throws RestClientException {
        return signUpWithHttpInfo(userRegistration).getBody();
    }

    /**
     * Register a new user
     * 
     * <p><b>201</b> - User successfully registered
     * <p><b>400</b>
     * @param userRegistration  (required)
     * @return ResponseEntity&lt;SignUp201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SignUp201Response> signUpWithHttpInfo(UserRegistration userRegistration) throws RestClientException {
        Object localVarPostBody = userRegistration;
        
        // verify the required parameter 'userRegistration' is set
        if (userRegistration == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userRegistration' when calling signUp");
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

        ParameterizedTypeReference<SignUp201Response> localReturnType = new ParameterizedTypeReference<SignUp201Response>() {};
        return apiClient.invokeAPI("/auth/signup", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Verify user&#39;s email
     * 
     * <p><b>200</b> - Email successfully verified
     * <p><b>400</b>
     * @param verifyEmailRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void verifyEmail(VerifyEmailRequest verifyEmailRequest) throws RestClientException {
        verifyEmailWithHttpInfo(verifyEmailRequest);
    }

    /**
     * Verify user&#39;s email
     * 
     * <p><b>200</b> - Email successfully verified
     * <p><b>400</b>
     * @param verifyEmailRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> verifyEmailWithHttpInfo(VerifyEmailRequest verifyEmailRequest) throws RestClientException {
        Object localVarPostBody = verifyEmailRequest;
        
        // verify the required parameter 'verifyEmailRequest' is set
        if (verifyEmailRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'verifyEmailRequest' when calling verifyEmail");
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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/auth/verify-email", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
