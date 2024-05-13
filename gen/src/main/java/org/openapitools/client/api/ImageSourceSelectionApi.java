package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ImagesourceActivePost200Response;
import org.openapitools.client.model.ImagesourceActivePostRequest;

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
public class ImageSourceSelectionApi {
    private ApiClient apiClient;

    public ImageSourceSelectionApi() {
        this(new ApiClient());
    }

    public ImageSourceSelectionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * set new imagesource
     * 
     * <p><b>200</b> - Success
     * @param imagesourceActivePostRequest  (optional)
     * @return ImagesourceActivePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ImagesourceActivePost200Response imagesourceActivePost(ImagesourceActivePostRequest imagesourceActivePostRequest) throws RestClientException {
        return imagesourceActivePostWithHttpInfo(imagesourceActivePostRequest).getBody();
    }

    /**
     * set new imagesource
     * 
     * <p><b>200</b> - Success
     * @param imagesourceActivePostRequest  (optional)
     * @return ResponseEntity&lt;ImagesourceActivePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ImagesourceActivePost200Response> imagesourceActivePostWithHttpInfo(ImagesourceActivePostRequest imagesourceActivePostRequest) throws RestClientException {
        Object localVarPostBody = imagesourceActivePostRequest;
        

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

        ParameterizedTypeReference<ImagesourceActivePost200Response> localReturnType = new ParameterizedTypeReference<ImagesourceActivePost200Response>() {};
        return apiClient.invokeAPI("/imagesource/active", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * set new imagesource
     * 
     * <p><b>200</b> - Success
     * @param imagesourceActivePostRequest  (optional)
     * @return ImagesourceActivePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ImagesourceActivePost200Response imagesourceActivePost_0(ImagesourceActivePostRequest imagesourceActivePostRequest) throws RestClientException {
        return imagesourceActivePost_0WithHttpInfo(imagesourceActivePostRequest).getBody();
    }

    /**
     * set new imagesource
     * 
     * <p><b>200</b> - Success
     * @param imagesourceActivePostRequest  (optional)
     * @return ResponseEntity&lt;ImagesourceActivePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ImagesourceActivePost200Response> imagesourceActivePost_0WithHttpInfo(ImagesourceActivePostRequest imagesourceActivePostRequest) throws RestClientException {
        Object localVarPostBody = imagesourceActivePostRequest;
        

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

        ParameterizedTypeReference<ImagesourceActivePost200Response> localReturnType = new ParameterizedTypeReference<ImagesourceActivePost200Response>() {};
        return apiClient.invokeAPI("/imagesource/active", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}