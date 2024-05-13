package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IndexPhpMethodAPIGetReportPagesMetadataPostRequest;
import org.openapitools.client.model.IndexPhpMethodActionsGetPostRequest;
import org.openapitools.client.model.IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest;
import org.openapitools.client.model.IndexPhpMethodCrashAnalyticsGetAllCrashesPostRequest;
import org.openapitools.client.model.IndexPhpMethodCrashAnalyticsGetCrashTypesPostRequest;
import org.openapitools.client.model.IndexPhpMethodCrashAnalyticsGetCrashVisitContextPostRequest;
import org.openapitools.client.model.IndexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest;
import org.openapitools.client.model.IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest;
import org.openapitools.client.model.IndexPhpMethodCrashAnalyticsGetLastCrashesOverviewPostRequest;
import org.openapitools.client.model.IndexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest;
import org.openapitools.client.model.IndexPhpMethodCrashAnalyticsSearchCrashMessagesForMergePostRequest;

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
public class CrashAnalyticsApi {
    private ApiClient apiClient;

    public CrashAnalyticsApi() {
        this(new ApiClient());
    }

    public CrashAnalyticsApi(ApiClient apiClient) {
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
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetAllCrashMessagesPost(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetAllCrashMessagesPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetAllCrashMessagesPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getAllCrashMessages", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetAllCrashesPost(IndexPhpMethodCrashAnalyticsGetAllCrashesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashesPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetAllCrashesPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetAllCrashesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetAllCrashesPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetAllCrashesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetAllCrashesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getAllCrashes", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetCrashGroupsPost(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetCrashGroupsPostWithHttpInfo(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetCrashGroupsPostWithHttpInfo(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getCrashGroups", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetCrashMessagesPost(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetCrashMessagesPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetCrashMessagesPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getCrashMessages", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetCrashSummaryPost(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetCrashSummaryPostWithHttpInfo(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetCrashSummaryPostWithHttpInfo(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getCrashSummary", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashTypesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetCrashTypesPost(IndexPhpMethodCrashAnalyticsGetCrashTypesPostRequest indexPhpMethodCrashAnalyticsGetCrashTypesPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetCrashTypesPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetCrashTypesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashTypesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetCrashTypesPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetCrashTypesPostRequest indexPhpMethodCrashAnalyticsGetCrashTypesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetCrashTypesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getCrashTypes", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashVisitContextPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetCrashVisitContextPost(IndexPhpMethodCrashAnalyticsGetCrashVisitContextPostRequest indexPhpMethodCrashAnalyticsGetCrashVisitContextPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetCrashVisitContextPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetCrashVisitContextPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashVisitContextPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetCrashVisitContextPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetCrashVisitContextPostRequest indexPhpMethodCrashAnalyticsGetCrashVisitContextPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetCrashVisitContextPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getCrashVisitContext", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetCrashesByCategoryPost(IndexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetCrashesByCategoryPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetCrashesByCategoryPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getCrashesByCategory", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetCrashesByFirstPartyPost(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetCrashesByFirstPartyPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetCrashesByFirstPartyPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getCrashesByFirstParty", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetCrashesByPageTitlePost(IndexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetCrashesByPageTitlePostWithHttpInfo(indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetCrashesByPageTitlePostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getCrashesByPageTitle", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetCrashesByPageUrlPost(IndexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetCrashesByPageUrlPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetCrashesByPageUrlPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getCrashesByPageUrl", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetCrashesBySourcePost(IndexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetCrashesBySourcePostWithHttpInfo(indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetCrashesBySourcePostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getCrashesBySource", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetCrashesByThirdPartyPost(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetCrashesByThirdPartyPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetCrashesByThirdPartyPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getCrashesByThirdParty", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetCrashesForCategoryPost(IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetCrashesForCategoryPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetCrashesForCategoryPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getCrashesForCategory", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetCrashesForPageTitlePost(IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetCrashesForPageTitlePostWithHttpInfo(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetCrashesForPageTitlePostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getCrashesForPageTitle", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetCrashesForPageUrlPost(IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetCrashesForPageUrlPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetCrashesForPageUrlPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getCrashesForPageUrl", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetCrashesForSourcePost(IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetCrashesForSourcePostWithHttpInfo(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetCrashesForSourcePostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getCrashesForSource", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetDisappearedCrashesPost(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetDisappearedCrashesPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetDisappearedCrashesPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getDisappearedCrashes", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetIgnoredCrashesPost(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetIgnoredCrashesPostWithHttpInfo(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetIgnoredCrashesPostWithHttpInfo(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getIgnoredCrashes", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetLastCrashesOverviewPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetLastCrashesOverviewPost(IndexPhpMethodCrashAnalyticsGetLastCrashesOverviewPostRequest indexPhpMethodCrashAnalyticsGetLastCrashesOverviewPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetLastCrashesOverviewPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetLastCrashesOverviewPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetLastCrashesOverviewPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetLastCrashesOverviewPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetLastCrashesOverviewPostRequest indexPhpMethodCrashAnalyticsGetLastCrashesOverviewPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetLastCrashesOverviewPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getLastCrashesOverview", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetLastDisappearedCrashesPost(IndexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetLastDisappearedCrashesPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetLastDisappearedCrashesPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getLastDisappearedCrashes", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetLastNewCrashesPost(IndexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetLastNewCrashesPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetLastNewCrashesPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getLastNewCrashes", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetLastReappearedCrashesPost(IndexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetLastReappearedCrashesPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetLastReappearedCrashesPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getLastReappearedCrashes", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetLastTopCrashesPost(IndexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetLastTopCrashesPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetLastTopCrashesPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetLastTopCrashesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getLastTopCrashes", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetNewCrashesPost(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetNewCrashesPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetNewCrashesPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getNewCrashes", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetPost(IndexPhpMethodActionsGetPostRequest indexPhpMethodActionsGetPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetPostWithHttpInfo(indexPhpMethodActionsGetPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetPostWithHttpInfo(IndexPhpMethodActionsGetPostRequest indexPhpMethodActionsGetPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodActionsGetPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.get", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetReappearedCrashesPost(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetReappearedCrashesPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetReappearedCrashesPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getReappearedCrashes", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsGetUnidentifiedCrashMessagesPost(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsGetUnidentifiedCrashMessagesPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsGetUnidentifiedCrashMessagesPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.getUnidentifiedCrashMessages", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsMergeCrashesPost(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsMergeCrashesPostWithHttpInfo(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsMergeCrashesPostWithHttpInfo(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.mergeCrashes", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsSearchCrashMessagesForMergePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsSearchCrashMessagesForMergePost(IndexPhpMethodCrashAnalyticsSearchCrashMessagesForMergePostRequest indexPhpMethodCrashAnalyticsSearchCrashMessagesForMergePostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsSearchCrashMessagesForMergePostWithHttpInfo(indexPhpMethodCrashAnalyticsSearchCrashMessagesForMergePostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsSearchCrashMessagesForMergePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsSearchCrashMessagesForMergePostWithHttpInfo(IndexPhpMethodCrashAnalyticsSearchCrashMessagesForMergePostRequest indexPhpMethodCrashAnalyticsSearchCrashMessagesForMergePostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCrashAnalyticsSearchCrashMessagesForMergePostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.searchCrashMessagesForMerge", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsSetIgnoreCrashPost(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsSetIgnoreCrashPostWithHttpInfo(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsSetIgnoreCrashPostWithHttpInfo(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.setIgnoreCrash", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCrashAnalyticsUnmergeCrashGroupPost(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
        indexPhpmethodCrashAnalyticsUnmergeCrashGroupPostWithHttpInfo(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCrashAnalyticsUnmergeCrashGroupPostWithHttpInfo(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=CrashAnalytics.unmergeCrashGroup", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
