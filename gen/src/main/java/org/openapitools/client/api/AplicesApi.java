package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.PolicyDetailsResponse;
import org.openapitools.client.model.PolicyResponse;

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
public class AplicesApi {
    private ApiClient apiClient;

    public AplicesApi() {
        this(new ApiClient());
    }

    public AplicesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Consulta de apólices por cliente
     * Consulta de apólices por cliente
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param documentNumber Número de documento do usuário (required)
     * @return List&lt;PolicyResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PolicyResponse> getPoliciesByDocumentNumber(String ocpApimSubscriptionKey, String documentNumber) throws RestClientException {
        return getPoliciesByDocumentNumberWithHttpInfo(ocpApimSubscriptionKey, documentNumber).getBody();
    }

    /**
     * Consulta de apólices por cliente
     * Consulta de apólices por cliente
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param documentNumber Número de documento do usuário (required)
     * @return ResponseEntity&lt;List&lt;PolicyResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PolicyResponse>> getPoliciesByDocumentNumberWithHttpInfo(String ocpApimSubscriptionKey, String documentNumber) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling getPoliciesByDocumentNumber");
        }
        
        // verify the required parameter 'documentNumber' is set
        if (documentNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentNumber' when calling getPoliciesByDocumentNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("documentNumber", documentNumber);

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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<PolicyResponse>> localReturnType = new ParameterizedTypeReference<List<PolicyResponse>>() {};
        return apiClient.invokeAPI("/policies/{documentNumber}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Consulta de detalhes e apólice
     * Consulta de detalhes e apólice
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param documentNumber Número da apólice (required)
     * @return PolicyDetailsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PolicyDetailsResponse getPoliciesDetails(String ocpApimSubscriptionKey, String documentNumber) throws RestClientException {
        return getPoliciesDetailsWithHttpInfo(ocpApimSubscriptionKey, documentNumber).getBody();
    }

    /**
     * Consulta de detalhes e apólice
     * Consulta de detalhes e apólice
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param documentNumber Número da apólice (required)
     * @return ResponseEntity&lt;PolicyDetailsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PolicyDetailsResponse> getPoliciesDetailsWithHttpInfo(String ocpApimSubscriptionKey, String documentNumber) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling getPoliciesDetails");
        }
        
        // verify the required parameter 'documentNumber' is set
        if (documentNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentNumber' when calling getPoliciesDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("documentNumber", documentNumber);

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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PolicyDetailsResponse> localReturnType = new ParameterizedTypeReference<PolicyDetailsResponse>() {};
        return apiClient.invokeAPI("/policies/{policyNumber}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
