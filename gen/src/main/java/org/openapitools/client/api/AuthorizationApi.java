package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApplicationLogin400Response;
import io.swagger.v3.oas.annotations.media.Schema;
import org.openapitools.client.model.SchemaAccessToken;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AuthorizationApi {
    private ApiClient apiClient;

    public AuthorizationApi() {
        this(new ApiClient());
    }

    public AuthorizationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Generate Access Token
     * Exchange &#x60;Client ID&#x60; and &#x60;Client Secret&#x60; for an &#x60;Access Token&#x60;.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Incorrect input
     * @param schema Application credentials (required)
     * @return SchemaAccessToken
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SchemaAccessToken applicationLogin(Schema schema) throws RestClientException {
        return applicationLoginWithHttpInfo(schema).getBody();
    }

    /**
     * Generate Access Token
     * Exchange &#x60;Client ID&#x60; and &#x60;Client Secret&#x60; for an &#x60;Access Token&#x60;.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Incorrect input
     * @param schema Application credentials (required)
     * @return ResponseEntity&lt;SchemaAccessToken&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SchemaAccessToken> applicationLoginWithHttpInfo(Schema schema) throws RestClientException {
        Object localVarPostBody = schema;
        
        // verify the required parameter 'schema' is set
        if (schema == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'schema' when calling applicationLogin");
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

        ParameterizedTypeReference<SchemaAccessToken> localReturnType = new ParameterizedTypeReference<SchemaAccessToken>() {};
        return apiClient.invokeAPI("/authorize", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
