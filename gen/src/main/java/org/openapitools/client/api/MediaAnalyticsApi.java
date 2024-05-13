package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IndexPhpMethodAPIGetReportPagesMetadataPostRequest;
import org.openapitools.client.model.IndexPhpMethodActionsGetPostRequest;
import org.openapitools.client.model.IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest;
import org.openapitools.client.model.IndexPhpMethodFormAnalyticsGetCountersPostRequest;
import org.openapitools.client.model.IndexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest;
import org.openapitools.client.model.IndexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest;
import org.openapitools.client.model.IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest;

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
public class MediaAnalyticsApi {
    private ApiClient apiClient;

    public MediaAnalyticsApi() {
        this(new ApiClient());
    }

    public MediaAnalyticsApi(ApiClient apiClient) {
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
    public void indexPhpmethodMediaAnalyticsGetAudioHoursPost(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        indexPhpmethodMediaAnalyticsGetAudioHoursPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMediaAnalyticsGetAudioHoursPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=MediaAnalytics.getAudioHours", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMediaAnalyticsGetAudioResourcesPost(IndexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest indexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest) throws RestClientException {
        indexPhpmethodMediaAnalyticsGetAudioResourcesPostWithHttpInfo(indexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMediaAnalyticsGetAudioResourcesPostWithHttpInfo(IndexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest indexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=MediaAnalytics.getAudioResources", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMediaAnalyticsGetAudioTitlesPost(IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest) throws RestClientException {
        indexPhpmethodMediaAnalyticsGetAudioTitlesPostWithHttpInfo(indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMediaAnalyticsGetAudioTitlesPostWithHttpInfo(IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=MediaAnalytics.getAudioTitles", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMediaAnalyticsGetCurrentMostPlaysPost(IndexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest indexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest) throws RestClientException {
        indexPhpmethodMediaAnalyticsGetCurrentMostPlaysPostWithHttpInfo(indexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMediaAnalyticsGetCurrentMostPlaysPostWithHttpInfo(IndexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest indexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=MediaAnalytics.getCurrentMostPlays", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodFormAnalyticsGetCountersPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMediaAnalyticsGetCurrentNumPlaysPost(IndexPhpMethodFormAnalyticsGetCountersPostRequest indexPhpMethodFormAnalyticsGetCountersPostRequest) throws RestClientException {
        indexPhpmethodMediaAnalyticsGetCurrentNumPlaysPostWithHttpInfo(indexPhpMethodFormAnalyticsGetCountersPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodFormAnalyticsGetCountersPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMediaAnalyticsGetCurrentNumPlaysPostWithHttpInfo(IndexPhpMethodFormAnalyticsGetCountersPostRequest indexPhpMethodFormAnalyticsGetCountersPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodFormAnalyticsGetCountersPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=MediaAnalytics.getCurrentNumPlays", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodFormAnalyticsGetCountersPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMediaAnalyticsGetCurrentSumTimeSpentPost(IndexPhpMethodFormAnalyticsGetCountersPostRequest indexPhpMethodFormAnalyticsGetCountersPostRequest) throws RestClientException {
        indexPhpmethodMediaAnalyticsGetCurrentSumTimeSpentPostWithHttpInfo(indexPhpMethodFormAnalyticsGetCountersPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodFormAnalyticsGetCountersPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMediaAnalyticsGetCurrentSumTimeSpentPostWithHttpInfo(IndexPhpMethodFormAnalyticsGetCountersPostRequest indexPhpMethodFormAnalyticsGetCountersPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodFormAnalyticsGetCountersPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=MediaAnalytics.getCurrentSumTimeSpent", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMediaAnalyticsGetGroupedAudioResourcesPost(IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest) throws RestClientException {
        indexPhpmethodMediaAnalyticsGetGroupedAudioResourcesPostWithHttpInfo(indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMediaAnalyticsGetGroupedAudioResourcesPostWithHttpInfo(IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=MediaAnalytics.getGroupedAudioResources", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMediaAnalyticsGetGroupedVideoResourcesPost(IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest) throws RestClientException {
        indexPhpmethodMediaAnalyticsGetGroupedVideoResourcesPostWithHttpInfo(indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMediaAnalyticsGetGroupedVideoResourcesPostWithHttpInfo(IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=MediaAnalytics.getGroupedVideoResources", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMediaAnalyticsGetPlayersPost(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        indexPhpmethodMediaAnalyticsGetPlayersPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMediaAnalyticsGetPlayersPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=MediaAnalytics.getPlayers", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMediaAnalyticsGetPost(IndexPhpMethodActionsGetPostRequest indexPhpMethodActionsGetPostRequest) throws RestClientException {
        indexPhpmethodMediaAnalyticsGetPostWithHttpInfo(indexPhpMethodActionsGetPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMediaAnalyticsGetPostWithHttpInfo(IndexPhpMethodActionsGetPostRequest indexPhpMethodActionsGetPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=MediaAnalytics.get", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMediaAnalyticsGetVideoHoursPost(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        indexPhpmethodMediaAnalyticsGetVideoHoursPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMediaAnalyticsGetVideoHoursPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=MediaAnalytics.getVideoHours", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMediaAnalyticsGetVideoResolutionsPost(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        indexPhpmethodMediaAnalyticsGetVideoResolutionsPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMediaAnalyticsGetVideoResolutionsPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=MediaAnalytics.getVideoResolutions", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMediaAnalyticsGetVideoResourcesPost(IndexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest indexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest) throws RestClientException {
        indexPhpmethodMediaAnalyticsGetVideoResourcesPostWithHttpInfo(indexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMediaAnalyticsGetVideoResourcesPostWithHttpInfo(IndexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest indexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodMediaAnalyticsGetVideoResourcesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=MediaAnalytics.getVideoResources", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMediaAnalyticsGetVideoTitlesPost(IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest) throws RestClientException {
        indexPhpmethodMediaAnalyticsGetVideoTitlesPostWithHttpInfo(indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMediaAnalyticsGetVideoTitlesPostWithHttpInfo(IndexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodMediaAnalyticsGetVideoTitlesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=MediaAnalytics.getVideoTitles", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMediaAnalyticsHasRecordsPost(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
        indexPhpmethodMediaAnalyticsHasRecordsPostWithHttpInfo(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMediaAnalyticsHasRecordsPostWithHttpInfo(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=MediaAnalytics.hasRecords", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
