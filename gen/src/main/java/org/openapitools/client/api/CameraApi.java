package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CameraRequest;
import org.openapitools.client.model.CameraResponse;
import java.io.File;
import org.openapitools.client.model.Status;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:13.609131704Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CameraApi {
    private ApiClient apiClient;

    public CameraApi() {
        this(new ApiClient());
    }

    public CameraApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Update camera attributes
     * 
     * <p><b>200</b> - **OK**
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>503</b>
     * @param cameraRequest  (required)
     * @return CameraResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CameraResponse cInfoPut(CameraRequest cameraRequest) throws RestClientException {
        return cInfoPutWithHttpInfo(cameraRequest).getBody();
    }

    /**
     * Update camera attributes
     * 
     * <p><b>200</b> - **OK**
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>503</b>
     * @param cameraRequest  (required)
     * @return ResponseEntity&lt;CameraResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CameraResponse> cInfoPutWithHttpInfo(CameraRequest cameraRequest) throws RestClientException {
        Object localVarPostBody = cameraRequest;
        
        // verify the required parameter 'cameraRequest' is set
        if (cameraRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cameraRequest' when calling cInfoPut");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Fingerprint", "Token" };

        ParameterizedTypeReference<CameraResponse> localReturnType = new ParameterizedTypeReference<CameraResponse>() {};
        return apiClient.invokeAPI("/c/info", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Upload snapshot to Connect
     * 
     * <p><b>204</b>
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>503</b>
     * @param body  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void cSnapshotPut(File body) throws RestClientException {
        cSnapshotPutWithHttpInfo(body);
    }

    /**
     * Upload snapshot to Connect
     * 
     * <p><b>204</b>
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>503</b>
     * @param body  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> cSnapshotPutWithHttpInfo(File body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling cSnapshotPut");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "image/jpg"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Fingerprint", "Token" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/c/snapshot", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
