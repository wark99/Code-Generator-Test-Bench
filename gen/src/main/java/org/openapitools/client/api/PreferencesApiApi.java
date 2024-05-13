package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.RetryPolicy;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:15:04.742654231Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PreferencesApiApi {
    private ApiClient apiClient;

    public PreferencesApiApi() {
        this(new ApiClient());
    }

    public PreferencesApiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get the retry policy for communications
     * requires preferences:read scope
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @return RetryPolicy
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RetryPolicy getRetryPolicy() throws RestClientException {
        return getRetryPolicyWithHttpInfo().getBody();
    }

    /**
     * Get the retry policy for communications
     * requires preferences:read scope
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @return ResponseEntity&lt;RetryPolicy&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RetryPolicy> getRetryPolicyWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<RetryPolicy> localReturnType = new ParameterizedTypeReference<RetryPolicy>() {};
        return apiClient.invokeAPI("/preferences/retry-policy", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update the retry policy for communications
     * requires preferences:write scope
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @return RetryPolicy
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RetryPolicy updateRetryPolicy() throws RestClientException {
        return updateRetryPolicyWithHttpInfo().getBody();
    }

    /**
     * Update the retry policy for communications
     * requires preferences:write scope
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @return ResponseEntity&lt;RetryPolicy&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RetryPolicy> updateRetryPolicyWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<RetryPolicy> localReturnType = new ParameterizedTypeReference<RetryPolicy>() {};
        return apiClient.invokeAPI("/preferences/retry-policy", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
