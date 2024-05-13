package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IndexPhpMethodLiveGetCountersPostRequest;
import org.openapitools.client.model.IndexPhpMethodLiveGetLastVisitsDetailsPostRequest;
import org.openapitools.client.model.IndexPhpMethodLiveGetMostRecentVisitorIdPostRequest;
import org.openapitools.client.model.IndexPhpMethodLiveGetVisitorProfilePostRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class LiveApi {
    private ApiClient apiClient;

    public LiveApi() {
        this(new ApiClient());
    }

    public LiveApi(ApiClient apiClient) {
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
     * 
     * @param indexPhpMethodLiveGetCountersPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodLiveGetCountersPost(IndexPhpMethodLiveGetCountersPostRequest indexPhpMethodLiveGetCountersPostRequest) throws RestClientException {
        indexPhpmethodLiveGetCountersPostWithHttpInfo(indexPhpMethodLiveGetCountersPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodLiveGetCountersPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodLiveGetCountersPostWithHttpInfo(IndexPhpMethodLiveGetCountersPostRequest indexPhpMethodLiveGetCountersPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodLiveGetCountersPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=Live.getCounters", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodLiveGetLastVisitsDetailsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodLiveGetLastVisitsDetailsPost(IndexPhpMethodLiveGetLastVisitsDetailsPostRequest indexPhpMethodLiveGetLastVisitsDetailsPostRequest) throws RestClientException {
        indexPhpmethodLiveGetLastVisitsDetailsPostWithHttpInfo(indexPhpMethodLiveGetLastVisitsDetailsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodLiveGetLastVisitsDetailsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodLiveGetLastVisitsDetailsPostWithHttpInfo(IndexPhpMethodLiveGetLastVisitsDetailsPostRequest indexPhpMethodLiveGetLastVisitsDetailsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodLiveGetLastVisitsDetailsPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=Live.getLastVisitsDetails", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodLiveGetMostRecentVisitorIdPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodLiveGetMostRecentVisitorIdPost(IndexPhpMethodLiveGetMostRecentVisitorIdPostRequest indexPhpMethodLiveGetMostRecentVisitorIdPostRequest) throws RestClientException {
        indexPhpmethodLiveGetMostRecentVisitorIdPostWithHttpInfo(indexPhpMethodLiveGetMostRecentVisitorIdPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodLiveGetMostRecentVisitorIdPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodLiveGetMostRecentVisitorIdPostWithHttpInfo(IndexPhpMethodLiveGetMostRecentVisitorIdPostRequest indexPhpMethodLiveGetMostRecentVisitorIdPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodLiveGetMostRecentVisitorIdPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=Live.getMostRecentVisitorId", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodLiveGetVisitorProfilePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodLiveGetVisitorProfilePost(IndexPhpMethodLiveGetVisitorProfilePostRequest indexPhpMethodLiveGetVisitorProfilePostRequest) throws RestClientException {
        indexPhpmethodLiveGetVisitorProfilePostWithHttpInfo(indexPhpMethodLiveGetVisitorProfilePostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodLiveGetVisitorProfilePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodLiveGetVisitorProfilePostWithHttpInfo(IndexPhpMethodLiveGetVisitorProfilePostRequest indexPhpMethodLiveGetVisitorProfilePostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodLiveGetVisitorProfilePostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=Live.getVisitorProfile", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
