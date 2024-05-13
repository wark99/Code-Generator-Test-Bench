package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.io.File;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:50.441407861Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class StorageRoutesApi {
    private ApiClient apiClient;

    public StorageRoutesApi() {
        this(new ApiClient());
    }

    public StorageRoutesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * upload-image
     * 
     * <p><b>200</b> - 
     * @param contentType  (required)
     * @param image  (required)
     * @param type  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void uploadImage(String contentType, File image, String type) throws RestClientException {
        uploadImageWithHttpInfo(contentType, image, type);
    }

    /**
     * upload-image
     * 
     * <p><b>200</b> - 
     * @param contentType  (required)
     * @param image  (required)
     * @param type  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> uploadImageWithHttpInfo(String contentType, File image, String type) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contentType' when calling uploadImage");
        }
        
        // verify the required parameter 'image' is set
        if (image == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'image' when calling uploadImage");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        

        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));

        if (image != null)
            localVarFormParams.add("image", new FileSystemResource(image));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/storage/upload-image", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * upload-video
     * 
     * <p><b>200</b> - 
     * @param contentType  (required)
     * @param video  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void uploadVideo(String contentType, File video) throws RestClientException {
        uploadVideoWithHttpInfo(contentType, video);
    }

    /**
     * upload-video
     * 
     * <p><b>200</b> - 
     * @param contentType  (required)
     * @param video  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> uploadVideoWithHttpInfo(String contentType, File video) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contentType' when calling uploadVideo");
        }
        
        // verify the required parameter 'video' is set
        if (video == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'video' when calling uploadVideo");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));

        if (video != null)
            localVarFormParams.add("video", new FileSystemResource(video));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/storage/upload-video", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
