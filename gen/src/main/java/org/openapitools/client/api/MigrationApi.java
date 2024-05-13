package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.MigrationCreate;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:48.943071954Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MigrationApi {
    private ApiClient apiClient;

    public MigrationApi() {
        this(new ApiClient());
    }

    public MigrationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a image record in classic CIC
     * Old images of the same image source will be hidden
     * <p><b>200</b> - Success
     * <p><b>500</b> - Internal server error
     * @param migrationCreate  (optional)
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> migrationSpecificNotifyPost(MigrationCreate migrationCreate) throws RestClientException {
        return migrationSpecificNotifyPostWithHttpInfo(migrationCreate).getBody();
    }

    /**
     * Create a image record in classic CIC
     * Old images of the same image source will be hidden
     * <p><b>200</b> - Success
     * <p><b>500</b> - Internal server error
     * @param migrationCreate  (optional)
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> migrationSpecificNotifyPostWithHttpInfo(MigrationCreate migrationCreate) throws RestClientException {
        Object localVarPostBody = migrationCreate;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<String>> localReturnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI("/migration/specific/notify", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a image record in classic CIC
     * Old images of the same image source will be hidden
     * <p><b>200</b> - Success
     * <p><b>500</b> - Internal server error
     * @param migrationCreate  (optional)
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> migrationSpecificNotifyPost_0(MigrationCreate migrationCreate) throws RestClientException {
        return migrationSpecificNotifyPost_0WithHttpInfo(migrationCreate).getBody();
    }

    /**
     * Create a image record in classic CIC
     * Old images of the same image source will be hidden
     * <p><b>200</b> - Success
     * <p><b>500</b> - Internal server error
     * @param migrationCreate  (optional)
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> migrationSpecificNotifyPost_0WithHttpInfo(MigrationCreate migrationCreate) throws RestClientException {
        Object localVarPostBody = migrationCreate;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<String>> localReturnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI("/migration/specific/notify", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
