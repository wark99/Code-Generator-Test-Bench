package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ErrorResponseObject;
import org.openapitools.client.model.Login200Response;
import org.openapitools.client.model.Logout200Response;
import org.openapitools.client.model.ResetPasswordRequest;
import org.openapitools.client.model.ResetPasswordRequestRequest;
import org.openapitools.client.model.SuccessResponseObject;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T13:34:20.600907567Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * <p><b>200</b> - OK
     * <p><b>401</b>
     * @param userLogin  (required)
     * @return Login200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Login200Response login(UserLogin userLogin) throws RestClientException {
        return loginWithHttpInfo(userLogin).getBody();
    }

    /**
     * User login
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b>
     * @param userLogin  (required)
     * @return ResponseEntity&lt;Login200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Login200Response> loginWithHttpInfo(UserLogin userLogin) throws RestClientException {
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

        ParameterizedTypeReference<Login200Response> localReturnType = new ParameterizedTypeReference<Login200Response>() {};
        return apiClient.invokeAPI("/users/login", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * User logout
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @return Logout200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Logout200Response logout() throws RestClientException {
        return logoutWithHttpInfo().getBody();
    }

    /**
     * User logout
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @return ResponseEntity&lt;Logout200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Logout200Response> logoutWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<Logout200Response> localReturnType = new ParameterizedTypeReference<Logout200Response>() {};
        return apiClient.invokeAPI("/users/logout", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Resend verification email
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @return Logout200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Logout200Response resendVerificationEmail() throws RestClientException {
        return resendVerificationEmailWithHttpInfo().getBody();
    }

    /**
     * Resend verification email
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @return ResponseEntity&lt;Logout200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Logout200Response> resendVerificationEmailWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<Logout200Response> localReturnType = new ParameterizedTypeReference<Logout200Response>() {};
        return apiClient.invokeAPI("/users/resend-verification-email", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Reset password
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @param resetPasswordRequest  (required)
     * @return Logout200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Logout200Response resetPassword(ResetPasswordRequest resetPasswordRequest) throws RestClientException {
        return resetPasswordWithHttpInfo(resetPasswordRequest).getBody();
    }

    /**
     * Reset password
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @param resetPasswordRequest  (required)
     * @return ResponseEntity&lt;Logout200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Logout200Response> resetPasswordWithHttpInfo(ResetPasswordRequest resetPasswordRequest) throws RestClientException {
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

        ParameterizedTypeReference<Logout200Response> localReturnType = new ParameterizedTypeReference<Logout200Response>() {};
        return apiClient.invokeAPI("/users/reset-password", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Request password reset
     * A password reset link will be sent to the user&#39;s email if it exists. The response must always be success (even if email does not exist). This is to prevent email enumeration attacks.
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @param resetPasswordRequestRequest  (required)
     * @return Logout200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Logout200Response resetPasswordRequest(ResetPasswordRequestRequest resetPasswordRequestRequest) throws RestClientException {
        return resetPasswordRequestWithHttpInfo(resetPasswordRequestRequest).getBody();
    }

    /**
     * Request password reset
     * A password reset link will be sent to the user&#39;s email if it exists. The response must always be success (even if email does not exist). This is to prevent email enumeration attacks.
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @param resetPasswordRequestRequest  (required)
     * @return ResponseEntity&lt;Logout200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Logout200Response> resetPasswordRequestWithHttpInfo(ResetPasswordRequestRequest resetPasswordRequestRequest) throws RestClientException {
        Object localVarPostBody = resetPasswordRequestRequest;
        
        // verify the required parameter 'resetPasswordRequestRequest' is set
        if (resetPasswordRequestRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resetPasswordRequestRequest' when calling resetPasswordRequest");
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

        ParameterizedTypeReference<Logout200Response> localReturnType = new ParameterizedTypeReference<Logout200Response>() {};
        return apiClient.invokeAPI("/users/reset-password-request", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Register a new user
     * 
     * <p><b>201</b>
     * <p><b>400</b>
     * @param userRegistration  (required)
     * @return SuccessResponseObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SuccessResponseObject signup(UserRegistration userRegistration) throws RestClientException {
        return signupWithHttpInfo(userRegistration).getBody();
    }

    /**
     * Register a new user
     * 
     * <p><b>201</b>
     * <p><b>400</b>
     * @param userRegistration  (required)
     * @return ResponseEntity&lt;SuccessResponseObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SuccessResponseObject> signupWithHttpInfo(UserRegistration userRegistration) throws RestClientException {
        Object localVarPostBody = userRegistration;
        
        // verify the required parameter 'userRegistration' is set
        if (userRegistration == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userRegistration' when calling signup");
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

        ParameterizedTypeReference<SuccessResponseObject> localReturnType = new ParameterizedTypeReference<SuccessResponseObject>() {};
        return apiClient.invokeAPI("/users/signup", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Verify user&#39;s email
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @param verifyEmailRequest  (required)
     * @return Logout200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Logout200Response verifyEmail(VerifyEmailRequest verifyEmailRequest) throws RestClientException {
        return verifyEmailWithHttpInfo(verifyEmailRequest).getBody();
    }

    /**
     * Verify user&#39;s email
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @param verifyEmailRequest  (required)
     * @return ResponseEntity&lt;Logout200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Logout200Response> verifyEmailWithHttpInfo(VerifyEmailRequest verifyEmailRequest) throws RestClientException {
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

        ParameterizedTypeReference<Logout200Response> localReturnType = new ParameterizedTypeReference<Logout200Response>() {};
        return apiClient.invokeAPI("/users/verify-email", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
