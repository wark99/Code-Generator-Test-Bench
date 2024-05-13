package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.PostActivateRequest;
import org.openapitools.client.model.PostConnectAcceptRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:35.686627593Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UsersApi {
    private ApiClient apiClient;

    public UsersApi() {
        this(new ApiClient());
    }

    public UsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Activate a user
     * Activate a user account.
     * <p><b>204</b> - No content.
     * @param postActivateRequest Activates the users account. (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postActivate(PostActivateRequest postActivateRequest) throws RestClientException {
        postActivateWithHttpInfo(postActivateRequest);
    }

    /**
     * Activate a user
     * Activate a user account.
     * <p><b>204</b> - No content.
     * @param postActivateRequest Activates the users account. (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postActivateWithHttpInfo(PostActivateRequest postActivateRequest) throws RestClientException {
        Object localVarPostBody = postActivateRequest;
        

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
        return apiClient.invokeAPI("/activate", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Connect accept
     * Acccept a connect request.
     * <p><b>204</b> - No content.
     * @param organiserId  (required)
     * @param postConnectAcceptRequest Accepts the organisers connect request. (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postConnectAccept(String organiserId, PostConnectAcceptRequest postConnectAcceptRequest) throws RestClientException {
        postConnectAcceptWithHttpInfo(organiserId, postConnectAcceptRequest);
    }

    /**
     * Connect accept
     * Acccept a connect request.
     * <p><b>204</b> - No content.
     * @param organiserId  (required)
     * @param postConnectAcceptRequest Accepts the organisers connect request. (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postConnectAcceptWithHttpInfo(String organiserId, PostConnectAcceptRequest postConnectAcceptRequest) throws RestClientException {
        Object localVarPostBody = postConnectAcceptRequest;
        
        // verify the required parameter 'organiserId' is set
        if (organiserId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organiserId' when calling postConnectAccept");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organiserId", organiserId);

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
        return apiClient.invokeAPI("/organisers/{organiserId}/accept", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Connect reject
     * Reject a connect request.
     * <p><b>204</b> - No content.
     * @param organiserId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postConnectReject(String organiserId) throws RestClientException {
        postConnectRejectWithHttpInfo(organiserId);
    }

    /**
     * Connect reject
     * Reject a connect request.
     * <p><b>204</b> - No content.
     * @param organiserId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postConnectRejectWithHttpInfo(String organiserId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organiserId' is set
        if (organiserId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organiserId' when calling postConnectReject");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organiserId", organiserId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/organisers/{organiserId}/reject", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
