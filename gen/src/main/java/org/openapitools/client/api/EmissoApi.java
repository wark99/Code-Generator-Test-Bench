package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IssuanceRequest;
import org.openapitools.client.model.IssuanceResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:09.376695343Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class EmissoApi {
    private ApiClient apiClient;

    public EmissoApi() {
        this(new ApiClient());
    }

    public EmissoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Efetua emissão de seguro
     * Efetua emissão de seguro
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param issuanceRequest  (optional)
     * @return IssuanceResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IssuanceResponse postIssuance(String ocpApimSubscriptionKey, IssuanceRequest issuanceRequest) throws RestClientException {
        return postIssuanceWithHttpInfo(ocpApimSubscriptionKey, issuanceRequest).getBody();
    }

    /**
     * Efetua emissão de seguro
     * Efetua emissão de seguro
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param issuanceRequest  (optional)
     * @return ResponseEntity&lt;IssuanceResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IssuanceResponse> postIssuanceWithHttpInfo(String ocpApimSubscriptionKey, IssuanceRequest issuanceRequest) throws RestClientException {
        Object localVarPostBody = issuanceRequest;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling postIssuance");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (ocpApimSubscriptionKey != null)
        localVarHeaderParams.add("Ocp-Apim-Subscription-Key", apiClient.parameterToString(ocpApimSubscriptionKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<IssuanceResponse> localReturnType = new ParameterizedTypeReference<IssuanceResponse>() {};
        return apiClient.invokeAPI("/issuances", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
