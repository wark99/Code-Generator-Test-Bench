package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ConsumerFileForVerification;
import org.openapitools.client.model.VerificationResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:38.356341300Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class VerificationApiApi {
    private ApiClient apiClient;

    public VerificationApiApi() {
        this(new ApiClient());
    }

    public VerificationApiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Verify consumer file holder of a consumer file
     * Verifies the owner of accounts and credit files in a consumer file.
     * <p><b>200</b> - Consumer file is verified successfully.
     * <p><b>400</b> - Accounts and credit files seem to belong to different persons.
     * @param consumerFileForVerification Consumer file and credit report data. (required)
     * @return VerificationResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VerificationResponse verifyConsumerFile(ConsumerFileForVerification consumerFileForVerification) throws RestClientException {
        return verifyConsumerFileWithHttpInfo(consumerFileForVerification).getBody();
    }

    /**
     * Verify consumer file holder of a consumer file
     * Verifies the owner of accounts and credit files in a consumer file.
     * <p><b>200</b> - Consumer file is verified successfully.
     * <p><b>400</b> - Accounts and credit files seem to belong to different persons.
     * @param consumerFileForVerification Consumer file and credit report data. (required)
     * @return ResponseEntity&lt;VerificationResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VerificationResponse> verifyConsumerFileWithHttpInfo(ConsumerFileForVerification consumerFileForVerification) throws RestClientException {
        Object localVarPostBody = consumerFileForVerification;
        
        // verify the required parameter 'consumerFileForVerification' is set
        if (consumerFileForVerification == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'consumerFileForVerification' when calling verifyConsumerFile");
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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<VerificationResponse> localReturnType = new ParameterizedTypeReference<VerificationResponse>() {};
        return apiClient.invokeAPI("/verify", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
