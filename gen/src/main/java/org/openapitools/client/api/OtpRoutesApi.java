package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.SendEmailOtpRequest;
import org.openapitools.client.model.SendSmsOtpRequest;
import org.openapitools.client.model.VerifyEmailOtpRequest;
import org.openapitools.client.model.VerifySmsOtpRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:50.441407861Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OtpRoutesApi {
    private ApiClient apiClient;

    public OtpRoutesApi() {
        this(new ApiClient());
    }

    public OtpRoutesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * send-email-otp
     * 
     * <p><b>200</b> - 
     * @param sendEmailOtpRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void sendEmailOtp(SendEmailOtpRequest sendEmailOtpRequest) throws RestClientException {
        sendEmailOtpWithHttpInfo(sendEmailOtpRequest);
    }

    /**
     * send-email-otp
     * 
     * <p><b>200</b> - 
     * @param sendEmailOtpRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> sendEmailOtpWithHttpInfo(SendEmailOtpRequest sendEmailOtpRequest) throws RestClientException {
        Object localVarPostBody = sendEmailOtpRequest;
        
        // verify the required parameter 'sendEmailOtpRequest' is set
        if (sendEmailOtpRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sendEmailOtpRequest' when calling sendEmailOtp");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/otp/send-email-otp", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * send-sms-otp
     * 
     * <p><b>200</b> - 
     * @param sendSmsOtpRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void sendSmsOtp(SendSmsOtpRequest sendSmsOtpRequest) throws RestClientException {
        sendSmsOtpWithHttpInfo(sendSmsOtpRequest);
    }

    /**
     * send-sms-otp
     * 
     * <p><b>200</b> - 
     * @param sendSmsOtpRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> sendSmsOtpWithHttpInfo(SendSmsOtpRequest sendSmsOtpRequest) throws RestClientException {
        Object localVarPostBody = sendSmsOtpRequest;
        
        // verify the required parameter 'sendSmsOtpRequest' is set
        if (sendSmsOtpRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sendSmsOtpRequest' when calling sendSmsOtp");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/otp/send-sms-otp", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * verify-email-otp
     * 
     * <p><b>200</b> - 
     * @param verifyEmailOtpRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void verifyEmailOtp(VerifyEmailOtpRequest verifyEmailOtpRequest) throws RestClientException {
        verifyEmailOtpWithHttpInfo(verifyEmailOtpRequest);
    }

    /**
     * verify-email-otp
     * 
     * <p><b>200</b> - 
     * @param verifyEmailOtpRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> verifyEmailOtpWithHttpInfo(VerifyEmailOtpRequest verifyEmailOtpRequest) throws RestClientException {
        Object localVarPostBody = verifyEmailOtpRequest;
        
        // verify the required parameter 'verifyEmailOtpRequest' is set
        if (verifyEmailOtpRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'verifyEmailOtpRequest' when calling verifyEmailOtp");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/otp/verify-email-otp", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * verify-sms-otp
     * 
     * <p><b>200</b> - 
     * @param verifySmsOtpRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void verifySmsOtp(VerifySmsOtpRequest verifySmsOtpRequest) throws RestClientException {
        verifySmsOtpWithHttpInfo(verifySmsOtpRequest);
    }

    /**
     * verify-sms-otp
     * 
     * <p><b>200</b> - 
     * @param verifySmsOtpRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> verifySmsOtpWithHttpInfo(VerifySmsOtpRequest verifySmsOtpRequest) throws RestClientException {
        Object localVarPostBody = verifySmsOtpRequest;
        
        // verify the required parameter 'verifySmsOtpRequest' is set
        if (verifySmsOtpRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'verifySmsOtpRequest' when calling verifySmsOtp");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/otp/verify-sms-otp", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
