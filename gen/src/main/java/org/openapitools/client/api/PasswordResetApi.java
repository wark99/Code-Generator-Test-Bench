package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ForgotPasswordSendCodePost200Response;
import org.openapitools.client.model.ForgotPasswordSendCodePostRequest;
import org.openapitools.client.model.ForgotPasswordSendEmailPostRequest;
import org.openapitools.client.model.ForgotPasswordSetNewPasswordPutRequest;
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
public class PasswordResetApi {
    private ApiClient apiClient;

    public PasswordResetApi() {
        this(new ApiClient());
    }

    public PasswordResetApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * verifies forgotten password email token
     * After user clicks on the forgotten password email link. Token from email link should be sent to this endpoint to validate and trigger mfa code 
     * <p><b>200</b> - forgotten password email token valid
     * <p><b>400</b> - Unable to create profile.
     * <p><b>0</b> - Unexpected Error
     * @param forgotPasswordSendCodePostRequest  (optional)
     * @return ForgotPasswordSendCodePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ForgotPasswordSendCodePost200Response forgotPasswordSendCodePost(ForgotPasswordSendCodePostRequest forgotPasswordSendCodePostRequest) throws RestClientException {
        return forgotPasswordSendCodePostWithHttpInfo(forgotPasswordSendCodePostRequest).getBody();
    }

    /**
     * verifies forgotten password email token
     * After user clicks on the forgotten password email link. Token from email link should be sent to this endpoint to validate and trigger mfa code 
     * <p><b>200</b> - forgotten password email token valid
     * <p><b>400</b> - Unable to create profile.
     * <p><b>0</b> - Unexpected Error
     * @param forgotPasswordSendCodePostRequest  (optional)
     * @return ResponseEntity&lt;ForgotPasswordSendCodePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ForgotPasswordSendCodePost200Response> forgotPasswordSendCodePostWithHttpInfo(ForgotPasswordSendCodePostRequest forgotPasswordSendCodePostRequest) throws RestClientException {
        Object localVarPostBody = forgotPasswordSendCodePostRequest;
        

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

        ParameterizedTypeReference<ForgotPasswordSendCodePost200Response> localReturnType = new ParameterizedTypeReference<ForgotPasswordSendCodePost200Response>() {};
        return apiClient.invokeAPI("/forgot-password/send-code", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * initiates forgotten password process
     * This sends out the forgotten password email which is the beginning of forgot password process
     * <p><b>200</b> - Forgotten password initiated successfully.
     * <p><b>400</b> - Unable to create profile.
     * <p><b>0</b> - Unexpected Error
     * @param forgotPasswordSendEmailPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void forgotPasswordSendEmailPost(ForgotPasswordSendEmailPostRequest forgotPasswordSendEmailPostRequest) throws RestClientException {
        forgotPasswordSendEmailPostWithHttpInfo(forgotPasswordSendEmailPostRequest);
    }

    /**
     * initiates forgotten password process
     * This sends out the forgotten password email which is the beginning of forgot password process
     * <p><b>200</b> - Forgotten password initiated successfully.
     * <p><b>400</b> - Unable to create profile.
     * <p><b>0</b> - Unexpected Error
     * @param forgotPasswordSendEmailPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> forgotPasswordSendEmailPostWithHttpInfo(ForgotPasswordSendEmailPostRequest forgotPasswordSendEmailPostRequest) throws RestClientException {
        Object localVarPostBody = forgotPasswordSendEmailPostRequest;
        

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
        return apiClient.invokeAPI("/forgot-password/send-email", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Sets user new password
     * After user has verified their email token and gone through mfa authentication, this url allows them to set a new password for their account 
     * <p><b>200</b> - Password successfully reset
     * <p><b>400</b> - Unable to create profile.
     * <p><b>0</b> - Unexpected Error
     * @param forgotPasswordSetNewPasswordPutRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void forgotPasswordSetNewPasswordPut(ForgotPasswordSetNewPasswordPutRequest forgotPasswordSetNewPasswordPutRequest) throws RestClientException {
        forgotPasswordSetNewPasswordPutWithHttpInfo(forgotPasswordSetNewPasswordPutRequest);
    }

    /**
     * Sets user new password
     * After user has verified their email token and gone through mfa authentication, this url allows them to set a new password for their account 
     * <p><b>200</b> - Password successfully reset
     * <p><b>400</b> - Unable to create profile.
     * <p><b>0</b> - Unexpected Error
     * @param forgotPasswordSetNewPasswordPutRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> forgotPasswordSetNewPasswordPutWithHttpInfo(ForgotPasswordSetNewPasswordPutRequest forgotPasswordSetNewPasswordPutRequest) throws RestClientException {
        Object localVarPostBody = forgotPasswordSetNewPasswordPutRequest;
        

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
        return apiClient.invokeAPI("/forgot-password/set-new-password", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
