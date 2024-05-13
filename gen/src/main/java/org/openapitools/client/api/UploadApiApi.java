package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GenericError;
import org.openapitools.client.model.UploadSessionResponse;
import org.openapitools.client.model.UploadURLResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:38.356341300Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UploadApiApi {
    private ApiClient apiClient;

    public UploadApiApi() {
        this(new ApiClient());
    }

    public UploadApiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Generate upload URL
     * Generates a unique and safe URL to upload file.
     * <p><b>200</b> - Upload path generated successfully.
     * <p><b>400</b> - Validation error.
     * <p><b>401</b> - Upload session already expired.
     * <p><b>404</b> - Upload session not found.
     * @param sessionID ID of an active upload session. (optional)
     * @return UploadURLResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UploadURLResponse generateUploadURL(String sessionID) throws RestClientException {
        return generateUploadURLWithHttpInfo(sessionID).getBody();
    }

    /**
     * Generate upload URL
     * Generates a unique and safe URL to upload file.
     * <p><b>200</b> - Upload path generated successfully.
     * <p><b>400</b> - Validation error.
     * <p><b>401</b> - Upload session already expired.
     * <p><b>404</b> - Upload session not found.
     * @param sessionID ID of an active upload session. (optional)
     * @return ResponseEntity&lt;UploadURLResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UploadURLResponse> generateUploadURLWithHttpInfo(String sessionID) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sessionID", sessionID));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<UploadURLResponse> localReturnType = new ParameterizedTypeReference<UploadURLResponse>() {};
        return apiClient.invokeAPI("/upload/generate-url", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Start upload session
     * Starts a new file upload session to upload aggregator files and credit report for scoring purpose.
     * <p><b>200</b> - Upload session started successfully.
     * <p><b>400</b> - Validation error.
     * @return UploadSessionResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UploadSessionResponse startUploadSession() throws RestClientException {
        return startUploadSessionWithHttpInfo().getBody();
    }

    /**
     * Start upload session
     * Starts a new file upload session to upload aggregator files and credit report for scoring purpose.
     * <p><b>200</b> - Upload session started successfully.
     * <p><b>400</b> - Validation error.
     * @return ResponseEntity&lt;UploadSessionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UploadSessionResponse> startUploadSessionWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<UploadSessionResponse> localReturnType = new ParameterizedTypeReference<UploadSessionResponse>() {};
        return apiClient.invokeAPI("/upload/session", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
