package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IndexPhpMethodAPIGetReportPagesMetadataPostRequest;
import org.openapitools.client.model.IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest;

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
public class SearchEngineKeywordsPerformanceApi {
    private ApiClient apiClient;

    public SearchEngineKeywordsPerformanceApi() {
        this(new ApiClient());
    }

    public SearchEngineKeywordsPerformanceApi(ApiClient apiClient) {
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
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingErrorExamplesBingPost(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
        indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingErrorExamplesBingPostWithHttpInfo(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingErrorExamplesBingPostWithHttpInfo(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAPIGetReportPagesMetadataPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=SearchEngineKeywordsPerformance.getCrawlingErrorExamplesBing", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingOverviewBingPost(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingOverviewBingPostWithHttpInfo(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingOverviewBingPostWithHttpInfo(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=SearchEngineKeywordsPerformance.getCrawlingOverviewBing", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingOverviewYandexPost(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingOverviewYandexPostWithHttpInfo(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodSearchEngineKeywordsPerformanceGetCrawlingOverviewYandexPostWithHttpInfo(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=SearchEngineKeywordsPerformance.getCrawlingOverviewYandex", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsBingPost(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsBingPostWithHttpInfo(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsBingPostWithHttpInfo(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=SearchEngineKeywordsPerformance.getKeywordsBing", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleImagePost(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleImagePostWithHttpInfo(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleImagePostWithHttpInfo(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=SearchEngineKeywordsPerformance.getKeywordsGoogleImage", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleNewsPost(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleNewsPostWithHttpInfo(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleNewsPostWithHttpInfo(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=SearchEngineKeywordsPerformance.getKeywordsGoogleNews", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGooglePost(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGooglePostWithHttpInfo(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGooglePostWithHttpInfo(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=SearchEngineKeywordsPerformance.getKeywordsGoogle", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleVideoPost(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleVideoPostWithHttpInfo(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleVideoPostWithHttpInfo(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=SearchEngineKeywordsPerformance.getKeywordsGoogleVideo", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleWebPost(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleWebPostWithHttpInfo(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsGoogleWebPostWithHttpInfo(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=SearchEngineKeywordsPerformance.getKeywordsGoogleWeb", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsImportedPost(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsImportedPostWithHttpInfo(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsImportedPostWithHttpInfo(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=SearchEngineKeywordsPerformance.getKeywordsImported", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsPost(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsPostWithHttpInfo(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsPostWithHttpInfo(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=SearchEngineKeywordsPerformance.getKeywords", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsYandexPost(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsYandexPostWithHttpInfo(indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodSearchEngineKeywordsPerformanceGetKeywordsYandexPostWithHttpInfo(IndexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodSearchEngineKeywordsPerformanceGetKeywordsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=SearchEngineKeywordsPerformance.getKeywordsYandex", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
