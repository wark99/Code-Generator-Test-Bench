package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.SsoDomainNamePost200Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:57.815576076Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class WsbApi {
    private ApiClient apiClient;

    public WsbApi() {
        this(new ApiClient());
    }

    public WsbApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Generate WSB SSO for a domain
     * 
     * <p><b>200</b> - Success
     * @param domainName  (required)
     * @return SsoDomainNamePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SsoDomainNamePost200Response ssoDomainNamePost(String domainName) throws RestClientException {
        return ssoDomainNamePostWithHttpInfo(domainName).getBody();
    }

    /**
     * Generate WSB SSO for a domain
     * 
     * <p><b>200</b> - Success
     * @param domainName  (required)
     * @return ResponseEntity&lt;SsoDomainNamePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SsoDomainNamePost200Response> ssoDomainNamePostWithHttpInfo(String domainName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'domainName' is set
        if (domainName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'domainName' when calling ssoDomainNamePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("domainName", domainName);

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<SsoDomainNamePost200Response> localReturnType = new ParameterizedTypeReference<SsoDomainNamePost200Response>() {};
        return apiClient.invokeAPI("/sso/{domainName}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
