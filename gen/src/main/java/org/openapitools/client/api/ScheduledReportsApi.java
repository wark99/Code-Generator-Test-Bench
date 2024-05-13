package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IndexPhpMethodScheduledReportsAddReportPostRequest;
import org.openapitools.client.model.IndexPhpMethodScheduledReportsDeleteReportPostRequest;
import org.openapitools.client.model.IndexPhpMethodScheduledReportsGenerateReportPostRequest;
import org.openapitools.client.model.IndexPhpMethodScheduledReportsGetReportsPostRequest;
import org.openapitools.client.model.IndexPhpMethodScheduledReportsSendReportPostRequest;
import org.openapitools.client.model.IndexPhpMethodScheduledReportsUpdateReportPostRequest;

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
public class ScheduledReportsApi {
    private ApiClient apiClient;

    public ScheduledReportsApi() {
        this(new ApiClient());
    }

    public ScheduledReportsApi(ApiClient apiClient) {
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
     * @param indexPhpMethodScheduledReportsAddReportPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodScheduledReportsAddReportPost(IndexPhpMethodScheduledReportsAddReportPostRequest indexPhpMethodScheduledReportsAddReportPostRequest) throws RestClientException {
        indexPhpmethodScheduledReportsAddReportPostWithHttpInfo(indexPhpMethodScheduledReportsAddReportPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodScheduledReportsAddReportPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodScheduledReportsAddReportPostWithHttpInfo(IndexPhpMethodScheduledReportsAddReportPostRequest indexPhpMethodScheduledReportsAddReportPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodScheduledReportsAddReportPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=ScheduledReports.addReport", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodScheduledReportsDeleteReportPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodScheduledReportsDeleteReportPost(IndexPhpMethodScheduledReportsDeleteReportPostRequest indexPhpMethodScheduledReportsDeleteReportPostRequest) throws RestClientException {
        indexPhpmethodScheduledReportsDeleteReportPostWithHttpInfo(indexPhpMethodScheduledReportsDeleteReportPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodScheduledReportsDeleteReportPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodScheduledReportsDeleteReportPostWithHttpInfo(IndexPhpMethodScheduledReportsDeleteReportPostRequest indexPhpMethodScheduledReportsDeleteReportPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodScheduledReportsDeleteReportPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=ScheduledReports.deleteReport", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodScheduledReportsGenerateReportPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodScheduledReportsGenerateReportPost(IndexPhpMethodScheduledReportsGenerateReportPostRequest indexPhpMethodScheduledReportsGenerateReportPostRequest) throws RestClientException {
        indexPhpmethodScheduledReportsGenerateReportPostWithHttpInfo(indexPhpMethodScheduledReportsGenerateReportPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodScheduledReportsGenerateReportPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodScheduledReportsGenerateReportPostWithHttpInfo(IndexPhpMethodScheduledReportsGenerateReportPostRequest indexPhpMethodScheduledReportsGenerateReportPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodScheduledReportsGenerateReportPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=ScheduledReports.generateReport", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodScheduledReportsGetReportsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodScheduledReportsGetReportsPost(IndexPhpMethodScheduledReportsGetReportsPostRequest indexPhpMethodScheduledReportsGetReportsPostRequest) throws RestClientException {
        indexPhpmethodScheduledReportsGetReportsPostWithHttpInfo(indexPhpMethodScheduledReportsGetReportsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodScheduledReportsGetReportsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodScheduledReportsGetReportsPostWithHttpInfo(IndexPhpMethodScheduledReportsGetReportsPostRequest indexPhpMethodScheduledReportsGetReportsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodScheduledReportsGetReportsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=ScheduledReports.getReports", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodScheduledReportsSendReportPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodScheduledReportsSendReportPost(IndexPhpMethodScheduledReportsSendReportPostRequest indexPhpMethodScheduledReportsSendReportPostRequest) throws RestClientException {
        indexPhpmethodScheduledReportsSendReportPostWithHttpInfo(indexPhpMethodScheduledReportsSendReportPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodScheduledReportsSendReportPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodScheduledReportsSendReportPostWithHttpInfo(IndexPhpMethodScheduledReportsSendReportPostRequest indexPhpMethodScheduledReportsSendReportPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodScheduledReportsSendReportPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=ScheduledReports.sendReport", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodScheduledReportsUpdateReportPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodScheduledReportsUpdateReportPost(IndexPhpMethodScheduledReportsUpdateReportPostRequest indexPhpMethodScheduledReportsUpdateReportPostRequest) throws RestClientException {
        indexPhpmethodScheduledReportsUpdateReportPostWithHttpInfo(indexPhpMethodScheduledReportsUpdateReportPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodScheduledReportsUpdateReportPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodScheduledReportsUpdateReportPostWithHttpInfo(IndexPhpMethodScheduledReportsUpdateReportPostRequest indexPhpMethodScheduledReportsUpdateReportPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodScheduledReportsUpdateReportPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=ScheduledReports.updateReport", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
