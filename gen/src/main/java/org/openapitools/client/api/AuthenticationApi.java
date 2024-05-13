package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.OneOfResponseErrorsResponseInformation;
import org.openapitools.client.model.RequestAuthenticationClientCredentials;
import org.openapitools.client.model.ResponseErrors;
import org.openapitools.client.model.ResponseInformation;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:03.349465965Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AuthenticationApi {
    private ApiClient apiClient;

    public AuthenticationApi() {
        this(new ApiClient());
    }

    public AuthenticationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Request authentication token
     * <p><b>200</b>
     * <p><b>401</b>
     * <p><b>406</b>
     * <p><b>422</b>
     * @param requestAuthenticationClientCredentials  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object authLogin(RequestAuthenticationClientCredentials requestAuthenticationClientCredentials) throws RestClientException {
        return authLoginWithHttpInfo(requestAuthenticationClientCredentials).getBody();
    }

    /**
     * 
     * Request authentication token
     * <p><b>200</b>
     * <p><b>401</b>
     * <p><b>406</b>
     * <p><b>422</b>
     * @param requestAuthenticationClientCredentials  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> authLoginWithHttpInfo(RequestAuthenticationClientCredentials requestAuthenticationClientCredentials) throws RestClientException {
        Object localVarPostBody = requestAuthenticationClientCredentials;
        
        // verify the required parameter 'requestAuthenticationClientCredentials' is set
        if (requestAuthenticationClientCredentials == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestAuthenticationClientCredentials' when calling authLogin");
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

        String[] localVarAuthNames = new String[] { "Basic-Auth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/oauth/token", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
