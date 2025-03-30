package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.LoanRequest;
import org.openapitools.client.model.LoanResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-30T15:37:51.590395807Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class LoansApi {
    private ApiClient apiClient;

    public LoansApi() {
        this(new ApiClient());
    }

    public LoansApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Apply for a loan
     * One loan application request supported in the body.
     * <p><b>200</b> - OK
     * @param loanRequest loanRequest (required)
     * @return LoanResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LoanResponse applyForALoanUsingPOST(LoanRequest loanRequest) throws RestClientException {
        return applyForALoanUsingPOSTWithHttpInfo(loanRequest).getBody();
    }

    /**
     * Apply for a loan
     * One loan application request supported in the body.
     * <p><b>200</b> - OK
     * @param loanRequest loanRequest (required)
     * @return ResponseEntity&lt;LoanResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LoanResponse> applyForALoanUsingPOSTWithHttpInfo(LoanRequest loanRequest) throws RestClientException {
        Object localVarPostBody = loanRequest;
        
        // verify the required parameter 'loanRequest' is set
        if (loanRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loanRequest' when calling applyForALoanUsingPOST");
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

        ParameterizedTypeReference<LoanResponse> localReturnType = new ParameterizedTypeReference<LoanResponse>() {};
        return apiClient.invokeAPI("/loans", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
