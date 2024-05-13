package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Coverage;
import org.openapitools.client.model.CoverageRequest;

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
public class CoberturasApi {
    private ApiClient apiClient;

    public CoberturasApi() {
        this(new ApiClient());
    }

    public CoberturasApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Remove coberturas existentes
     * Remove coberturas existentes
     * <p><b>204</b> - No content
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param code Código de cobertura (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteCoverages(String ocpApimSubscriptionKey, String code) throws RestClientException {
        deleteCoveragesWithHttpInfo(ocpApimSubscriptionKey, code);
    }

    /**
     * Remove coberturas existentes
     * Remove coberturas existentes
     * <p><b>204</b> - No content
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param code Código de cobertura (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCoveragesWithHttpInfo(String ocpApimSubscriptionKey, String code) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling deleteCoverages");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'code' when calling deleteCoverages");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("code", code);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (ocpApimSubscriptionKey != null)
        localVarHeaderParams.add("Ocp-Apim-Subscription-Key", apiClient.parameterToString(ocpApimSubscriptionKey));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/coverages/{code}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Consulta coberturas existentes
     * Consulta coberturas existentes
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @return List&lt;Coverage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Coverage> getCoverages(String ocpApimSubscriptionKey) throws RestClientException {
        return getCoveragesWithHttpInfo(ocpApimSubscriptionKey).getBody();
    }

    /**
     * Consulta coberturas existentes
     * Consulta coberturas existentes
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @return ResponseEntity&lt;List&lt;Coverage&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Coverage>> getCoveragesWithHttpInfo(String ocpApimSubscriptionKey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling getCoverages");
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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Coverage>> localReturnType = new ParameterizedTypeReference<List<Coverage>>() {};
        return apiClient.invokeAPI("/coverages", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Consulta coberturas de uma apólice
     * Consulta coberturas de uma apólice
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param policy Número e apólice (required)
     * @return List&lt;Coverage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Coverage> getCoveragesByPolicy(String ocpApimSubscriptionKey, String policy) throws RestClientException {
        return getCoveragesByPolicyWithHttpInfo(ocpApimSubscriptionKey, policy).getBody();
    }

    /**
     * Consulta coberturas de uma apólice
     * Consulta coberturas de uma apólice
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param policy Número e apólice (required)
     * @return ResponseEntity&lt;List&lt;Coverage&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Coverage>> getCoveragesByPolicyWithHttpInfo(String ocpApimSubscriptionKey, String policy) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling getCoveragesByPolicy");
        }
        
        // verify the required parameter 'policy' is set
        if (policy == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'policy' when calling getCoveragesByPolicy");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("policy", policy);

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

        ParameterizedTypeReference<List<Coverage>> localReturnType = new ParameterizedTypeReference<List<Coverage>>() {};
        return apiClient.invokeAPI("/coverages/{policy}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Cadastra coberturas novas
     * Cadastra coberturas novas
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param coverageRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postCoverages(String ocpApimSubscriptionKey, CoverageRequest coverageRequest) throws RestClientException {
        postCoveragesWithHttpInfo(ocpApimSubscriptionKey, coverageRequest);
    }

    /**
     * Cadastra coberturas novas
     * Cadastra coberturas novas
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param coverageRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postCoveragesWithHttpInfo(String ocpApimSubscriptionKey, CoverageRequest coverageRequest) throws RestClientException {
        Object localVarPostBody = coverageRequest;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling postCoverages");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (ocpApimSubscriptionKey != null)
        localVarHeaderParams.add("Ocp-Apim-Subscription-Key", apiClient.parameterToString(ocpApimSubscriptionKey));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/coverages", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Atualiza coberturas existentes
     * Atualiza coberturas existentes
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param code Código de cobertura (required)
     * @param coverageRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putCoverages(String ocpApimSubscriptionKey, String code, CoverageRequest coverageRequest) throws RestClientException {
        putCoveragesWithHttpInfo(ocpApimSubscriptionKey, code, coverageRequest);
    }

    /**
     * Atualiza coberturas existentes
     * Atualiza coberturas existentes
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param code Código de cobertura (required)
     * @param coverageRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putCoveragesWithHttpInfo(String ocpApimSubscriptionKey, String code, CoverageRequest coverageRequest) throws RestClientException {
        Object localVarPostBody = coverageRequest;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling putCoverages");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'code' when calling putCoverages");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("code", code);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (ocpApimSubscriptionKey != null)
        localVarHeaderParams.add("Ocp-Apim-Subscription-Key", apiClient.parameterToString(ocpApimSubscriptionKey));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/coverages/{code}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
