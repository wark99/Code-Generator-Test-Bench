package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IndexPhpMethodAPIGetMatomoVersionPostRequest;
import org.openapitools.client.model.IndexPhpMethodAPIGetReportPagesMetadataPostRequest;
import org.openapitools.client.model.IndexPhpMethodHeatmapSessionRecordingAddHeatmapPostRequest;
import org.openapitools.client.model.IndexPhpMethodHeatmapSessionRecordingAddSessionRecordingPostRequest;
import org.openapitools.client.model.IndexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest;
import org.openapitools.client.model.IndexPhpMethodHeatmapSessionRecordingDeleteRecordedSessionPostRequest;
import org.openapitools.client.model.IndexPhpMethodHeatmapSessionRecordingGetHeatmapsPostRequest;
import org.openapitools.client.model.IndexPhpMethodHeatmapSessionRecordingGetRecordedHeatmapMetadataPostRequest;
import org.openapitools.client.model.IndexPhpMethodHeatmapSessionRecordingGetRecordedHeatmapPostRequest;
import org.openapitools.client.model.IndexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest;
import org.openapitools.client.model.IndexPhpMethodHeatmapSessionRecordingGetRecordedSessionsPostRequest;
import org.openapitools.client.model.IndexPhpMethodHeatmapSessionRecordingTestUrlMatchPagesPostRequest;
import org.openapitools.client.model.IndexPhpMethodHeatmapSessionRecordingUpdateHeatmapPostRequest;
import org.openapitools.client.model.IndexPhpMethodHeatmapSessionRecordingUpdateSessionRecordingPostRequest;

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
public class HeatmapSessionRecordingApi {
    private ApiClient apiClient;

    public HeatmapSessionRecordingApi() {
        this(new ApiClient());
    }

    public HeatmapSessionRecordingApi(ApiClient apiClient) {
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
     * @param indexPhpMethodHeatmapSessionRecordingAddHeatmapPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingAddHeatmapPost(IndexPhpMethodHeatmapSessionRecordingAddHeatmapPostRequest indexPhpMethodHeatmapSessionRecordingAddHeatmapPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingAddHeatmapPostWithHttpInfo(indexPhpMethodHeatmapSessionRecordingAddHeatmapPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingAddHeatmapPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingAddHeatmapPostWithHttpInfo(IndexPhpMethodHeatmapSessionRecordingAddHeatmapPostRequest indexPhpMethodHeatmapSessionRecordingAddHeatmapPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodHeatmapSessionRecordingAddHeatmapPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.addHeatmap", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingAddSessionRecordingPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingAddSessionRecordingPost(IndexPhpMethodHeatmapSessionRecordingAddSessionRecordingPostRequest indexPhpMethodHeatmapSessionRecordingAddSessionRecordingPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingAddSessionRecordingPostWithHttpInfo(indexPhpMethodHeatmapSessionRecordingAddSessionRecordingPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingAddSessionRecordingPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingAddSessionRecordingPostWithHttpInfo(IndexPhpMethodHeatmapSessionRecordingAddSessionRecordingPostRequest indexPhpMethodHeatmapSessionRecordingAddSessionRecordingPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodHeatmapSessionRecordingAddSessionRecordingPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.addSessionRecording", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingDeleteHeatmapPost(IndexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingDeleteHeatmapPostWithHttpInfo(indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingDeleteHeatmapPostWithHttpInfo(IndexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.deleteHeatmap", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingDeleteHeatmapScreenshotPost(IndexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostWithHttpInfo(indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostWithHttpInfo(IndexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.deleteHeatmapScreenshot", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingDeleteRecordedPageviewPost(IndexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest indexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingDeleteRecordedPageviewPostWithHttpInfo(indexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingDeleteRecordedPageviewPostWithHttpInfo(IndexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest indexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.deleteRecordedPageview", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingDeleteRecordedSessionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingDeleteRecordedSessionPost(IndexPhpMethodHeatmapSessionRecordingDeleteRecordedSessionPostRequest indexPhpMethodHeatmapSessionRecordingDeleteRecordedSessionPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingDeleteRecordedSessionPostWithHttpInfo(indexPhpMethodHeatmapSessionRecordingDeleteRecordedSessionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingDeleteRecordedSessionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingDeleteRecordedSessionPostWithHttpInfo(IndexPhpMethodHeatmapSessionRecordingDeleteRecordedSessionPostRequest indexPhpMethodHeatmapSessionRecordingDeleteRecordedSessionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodHeatmapSessionRecordingDeleteRecordedSessionPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.deleteRecordedSession", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingDeleteSessionRecordingPost(IndexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingDeleteSessionRecordingPostWithHttpInfo(indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingDeleteSessionRecordingPostWithHttpInfo(IndexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.deleteSessionRecording", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingEndHeatmapPost(IndexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingEndHeatmapPostWithHttpInfo(indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingEndHeatmapPostWithHttpInfo(IndexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.endHeatmap", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingEndSessionRecordingPost(IndexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingEndSessionRecordingPostWithHttpInfo(indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingEndSessionRecordingPostWithHttpInfo(IndexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.endSessionRecording", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingGetAvailableDeviceTypesPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingGetAvailableDeviceTypesPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingGetAvailableDeviceTypesPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAPIGetMatomoVersionPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.getAvailableDeviceTypes", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingGetAvailableHeatmapTypesPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingGetAvailableHeatmapTypesPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingGetAvailableHeatmapTypesPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAPIGetMatomoVersionPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.getAvailableHeatmapTypes", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingGetAvailableSessionRecordingSampleLimitsPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingGetAvailableSessionRecordingSampleLimitsPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingGetAvailableSessionRecordingSampleLimitsPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAPIGetMatomoVersionPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.getAvailableSessionRecordingSampleLimits", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingGetAvailableStatusesPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingGetAvailableStatusesPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingGetAvailableStatusesPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAPIGetMatomoVersionPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.getAvailableStatuses", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingGetAvailableTargetPageRulesPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingGetAvailableTargetPageRulesPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingGetAvailableTargetPageRulesPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAPIGetMatomoVersionPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.getAvailableTargetPageRules", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingGetEmbedSessionInfoPost(IndexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest indexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingGetEmbedSessionInfoPostWithHttpInfo(indexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingGetEmbedSessionInfoPostWithHttpInfo(IndexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest indexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.getEmbedSessionInfo", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingGetEventTypesPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingGetEventTypesPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingGetEventTypesPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAPIGetMatomoVersionPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.getEventTypes", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingGetHeatmapPost(IndexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingGetHeatmapPostWithHttpInfo(indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingGetHeatmapPostWithHttpInfo(IndexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.getHeatmap", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingGetHeatmapsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingGetHeatmapsPost(IndexPhpMethodHeatmapSessionRecordingGetHeatmapsPostRequest indexPhpMethodHeatmapSessionRecordingGetHeatmapsPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingGetHeatmapsPostWithHttpInfo(indexPhpMethodHeatmapSessionRecordingGetHeatmapsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingGetHeatmapsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingGetHeatmapsPostWithHttpInfo(IndexPhpMethodHeatmapSessionRecordingGetHeatmapsPostRequest indexPhpMethodHeatmapSessionRecordingGetHeatmapsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodHeatmapSessionRecordingGetHeatmapsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.getHeatmaps", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingGetRecordedHeatmapMetadataPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingGetRecordedHeatmapMetadataPost(IndexPhpMethodHeatmapSessionRecordingGetRecordedHeatmapMetadataPostRequest indexPhpMethodHeatmapSessionRecordingGetRecordedHeatmapMetadataPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingGetRecordedHeatmapMetadataPostWithHttpInfo(indexPhpMethodHeatmapSessionRecordingGetRecordedHeatmapMetadataPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingGetRecordedHeatmapMetadataPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingGetRecordedHeatmapMetadataPostWithHttpInfo(IndexPhpMethodHeatmapSessionRecordingGetRecordedHeatmapMetadataPostRequest indexPhpMethodHeatmapSessionRecordingGetRecordedHeatmapMetadataPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodHeatmapSessionRecordingGetRecordedHeatmapMetadataPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.getRecordedHeatmapMetadata", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingGetRecordedHeatmapPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingGetRecordedHeatmapPost(IndexPhpMethodHeatmapSessionRecordingGetRecordedHeatmapPostRequest indexPhpMethodHeatmapSessionRecordingGetRecordedHeatmapPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingGetRecordedHeatmapPostWithHttpInfo(indexPhpMethodHeatmapSessionRecordingGetRecordedHeatmapPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingGetRecordedHeatmapPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingGetRecordedHeatmapPostWithHttpInfo(IndexPhpMethodHeatmapSessionRecordingGetRecordedHeatmapPostRequest indexPhpMethodHeatmapSessionRecordingGetRecordedHeatmapPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodHeatmapSessionRecordingGetRecordedHeatmapPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.getRecordedHeatmap", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingGetRecordedSessionPost(IndexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest indexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingGetRecordedSessionPostWithHttpInfo(indexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingGetRecordedSessionPostWithHttpInfo(IndexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest indexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodHeatmapSessionRecordingGetRecordedSessionPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.getRecordedSession", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingGetRecordedSessionsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingGetRecordedSessionsPost(IndexPhpMethodHeatmapSessionRecordingGetRecordedSessionsPostRequest indexPhpMethodHeatmapSessionRecordingGetRecordedSessionsPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingGetRecordedSessionsPostWithHttpInfo(indexPhpMethodHeatmapSessionRecordingGetRecordedSessionsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingGetRecordedSessionsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingGetRecordedSessionsPostWithHttpInfo(IndexPhpMethodHeatmapSessionRecordingGetRecordedSessionsPostRequest indexPhpMethodHeatmapSessionRecordingGetRecordedSessionsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodHeatmapSessionRecordingGetRecordedSessionsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.getRecordedSessions", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingGetSessionRecordingPost(IndexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingGetSessionRecordingPostWithHttpInfo(indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingGetSessionRecordingPostWithHttpInfo(IndexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodHeatmapSessionRecordingDeleteHeatmapScreenshotPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.getSessionRecording", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingGetSessionRecordingsPost(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingGetSessionRecordingsPostWithHttpInfo(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingGetSessionRecordingsPostWithHttpInfo(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.getSessionRecordings", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingTestUrlMatchPagesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingTestUrlMatchPagesPost(IndexPhpMethodHeatmapSessionRecordingTestUrlMatchPagesPostRequest indexPhpMethodHeatmapSessionRecordingTestUrlMatchPagesPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingTestUrlMatchPagesPostWithHttpInfo(indexPhpMethodHeatmapSessionRecordingTestUrlMatchPagesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingTestUrlMatchPagesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingTestUrlMatchPagesPostWithHttpInfo(IndexPhpMethodHeatmapSessionRecordingTestUrlMatchPagesPostRequest indexPhpMethodHeatmapSessionRecordingTestUrlMatchPagesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodHeatmapSessionRecordingTestUrlMatchPagesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.testUrlMatchPages", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingUpdateHeatmapPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingUpdateHeatmapPost(IndexPhpMethodHeatmapSessionRecordingUpdateHeatmapPostRequest indexPhpMethodHeatmapSessionRecordingUpdateHeatmapPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingUpdateHeatmapPostWithHttpInfo(indexPhpMethodHeatmapSessionRecordingUpdateHeatmapPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingUpdateHeatmapPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingUpdateHeatmapPostWithHttpInfo(IndexPhpMethodHeatmapSessionRecordingUpdateHeatmapPostRequest indexPhpMethodHeatmapSessionRecordingUpdateHeatmapPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodHeatmapSessionRecordingUpdateHeatmapPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.updateHeatmap", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingUpdateSessionRecordingPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodHeatmapSessionRecordingUpdateSessionRecordingPost(IndexPhpMethodHeatmapSessionRecordingUpdateSessionRecordingPostRequest indexPhpMethodHeatmapSessionRecordingUpdateSessionRecordingPostRequest) throws RestClientException {
        indexPhpmethodHeatmapSessionRecordingUpdateSessionRecordingPostWithHttpInfo(indexPhpMethodHeatmapSessionRecordingUpdateSessionRecordingPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodHeatmapSessionRecordingUpdateSessionRecordingPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodHeatmapSessionRecordingUpdateSessionRecordingPostWithHttpInfo(IndexPhpMethodHeatmapSessionRecordingUpdateSessionRecordingPostRequest indexPhpMethodHeatmapSessionRecordingUpdateSessionRecordingPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodHeatmapSessionRecordingUpdateSessionRecordingPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=HeatmapSessionRecording.updateSessionRecording", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
