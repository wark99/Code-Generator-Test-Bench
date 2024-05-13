package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest;
import org.openapitools.client.model.IndexPhpMethodVisitTimeGetVisitInformationPerServerTimePostRequest;

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
public class VisitTimeApi {
    private ApiClient apiClient;

    public VisitTimeApi() {
        this(new ApiClient());
    }

    public VisitTimeApi(ApiClient apiClient) {
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
     * @param indexPhpMethodActionsGetSiteSearchKeywordsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodVisitTimeGetByDayOfWeekPost(IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest) throws RestClientException {
        indexPhpmethodVisitTimeGetByDayOfWeekPostWithHttpInfo(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetSiteSearchKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodVisitTimeGetByDayOfWeekPostWithHttpInfo(IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodActionsGetSiteSearchKeywordsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=VisitTime.getByDayOfWeek", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetSiteSearchKeywordsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodVisitTimeGetVisitInformationPerLocalTimePost(IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest) throws RestClientException {
        indexPhpmethodVisitTimeGetVisitInformationPerLocalTimePostWithHttpInfo(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetSiteSearchKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodVisitTimeGetVisitInformationPerLocalTimePostWithHttpInfo(IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodActionsGetSiteSearchKeywordsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=VisitTime.getVisitInformationPerLocalTime", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodVisitTimeGetVisitInformationPerServerTimePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodVisitTimeGetVisitInformationPerServerTimePost(IndexPhpMethodVisitTimeGetVisitInformationPerServerTimePostRequest indexPhpMethodVisitTimeGetVisitInformationPerServerTimePostRequest) throws RestClientException {
        indexPhpmethodVisitTimeGetVisitInformationPerServerTimePostWithHttpInfo(indexPhpMethodVisitTimeGetVisitInformationPerServerTimePostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodVisitTimeGetVisitInformationPerServerTimePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodVisitTimeGetVisitInformationPerServerTimePostWithHttpInfo(IndexPhpMethodVisitTimeGetVisitInformationPerServerTimePostRequest indexPhpMethodVisitTimeGetVisitInformationPerServerTimePostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodVisitTimeGetVisitInformationPerServerTimePostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=VisitTime.getVisitInformationPerServerTime", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
