package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IndexPhpMethodDashboardCopyDashboardToUserPostRequest;
import org.openapitools.client.model.IndexPhpMethodDashboardCreateNewDashboardForUserPostRequest;
import org.openapitools.client.model.IndexPhpMethodDashboardGetDashboardsPostRequest;
import org.openapitools.client.model.IndexPhpMethodDashboardRemoveDashboardPostRequest;

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
public class DashboardApi {
    private ApiClient apiClient;

    public DashboardApi() {
        this(new ApiClient());
    }

    public DashboardApi(ApiClient apiClient) {
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
     * @param indexPhpMethodDashboardCopyDashboardToUserPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodDashboardCopyDashboardToUserPost(IndexPhpMethodDashboardCopyDashboardToUserPostRequest indexPhpMethodDashboardCopyDashboardToUserPostRequest) throws RestClientException {
        indexPhpmethodDashboardCopyDashboardToUserPostWithHttpInfo(indexPhpMethodDashboardCopyDashboardToUserPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodDashboardCopyDashboardToUserPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodDashboardCopyDashboardToUserPostWithHttpInfo(IndexPhpMethodDashboardCopyDashboardToUserPostRequest indexPhpMethodDashboardCopyDashboardToUserPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodDashboardCopyDashboardToUserPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Dashboard.copyDashboardToUser", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodDashboardCreateNewDashboardForUserPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodDashboardCreateNewDashboardForUserPost(IndexPhpMethodDashboardCreateNewDashboardForUserPostRequest indexPhpMethodDashboardCreateNewDashboardForUserPostRequest) throws RestClientException {
        indexPhpmethodDashboardCreateNewDashboardForUserPostWithHttpInfo(indexPhpMethodDashboardCreateNewDashboardForUserPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodDashboardCreateNewDashboardForUserPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodDashboardCreateNewDashboardForUserPostWithHttpInfo(IndexPhpMethodDashboardCreateNewDashboardForUserPostRequest indexPhpMethodDashboardCreateNewDashboardForUserPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodDashboardCreateNewDashboardForUserPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Dashboard.createNewDashboardForUser", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodDashboardGetDashboardsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodDashboardGetDashboardsPost(IndexPhpMethodDashboardGetDashboardsPostRequest indexPhpMethodDashboardGetDashboardsPostRequest) throws RestClientException {
        indexPhpmethodDashboardGetDashboardsPostWithHttpInfo(indexPhpMethodDashboardGetDashboardsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodDashboardGetDashboardsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodDashboardGetDashboardsPostWithHttpInfo(IndexPhpMethodDashboardGetDashboardsPostRequest indexPhpMethodDashboardGetDashboardsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodDashboardGetDashboardsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Dashboard.getDashboards", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodDashboardRemoveDashboardPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodDashboardRemoveDashboardPost(IndexPhpMethodDashboardRemoveDashboardPostRequest indexPhpMethodDashboardRemoveDashboardPostRequest) throws RestClientException {
        indexPhpmethodDashboardRemoveDashboardPostWithHttpInfo(indexPhpMethodDashboardRemoveDashboardPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodDashboardRemoveDashboardPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodDashboardRemoveDashboardPostWithHttpInfo(IndexPhpMethodDashboardRemoveDashboardPostRequest indexPhpMethodDashboardRemoveDashboardPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodDashboardRemoveDashboardPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Dashboard.removeDashboard", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodDashboardRemoveDashboardPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodDashboardResetDashboardLayoutPost(IndexPhpMethodDashboardRemoveDashboardPostRequest indexPhpMethodDashboardRemoveDashboardPostRequest) throws RestClientException {
        indexPhpmethodDashboardResetDashboardLayoutPostWithHttpInfo(indexPhpMethodDashboardRemoveDashboardPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodDashboardRemoveDashboardPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodDashboardResetDashboardLayoutPostWithHttpInfo(IndexPhpMethodDashboardRemoveDashboardPostRequest indexPhpMethodDashboardRemoveDashboardPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodDashboardRemoveDashboardPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Dashboard.resetDashboardLayout", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
