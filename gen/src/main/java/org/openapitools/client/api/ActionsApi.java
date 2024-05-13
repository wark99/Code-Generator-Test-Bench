package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IndexPhpMethodActionsGetDownloadPostRequest;
import org.openapitools.client.model.IndexPhpMethodActionsGetEntryPageUrlsPostRequest;
import org.openapitools.client.model.IndexPhpMethodActionsGetOutlinkPostRequest;
import org.openapitools.client.model.IndexPhpMethodActionsGetPageTitlePostRequest;
import org.openapitools.client.model.IndexPhpMethodActionsGetPageUrlPostRequest;
import org.openapitools.client.model.IndexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest;
import org.openapitools.client.model.IndexPhpMethodActionsGetPageUrlsPostRequest;
import org.openapitools.client.model.IndexPhpMethodActionsGetPostRequest;
import org.openapitools.client.model.IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest;

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
public class ActionsApi {
    private ApiClient apiClient;

    public ActionsApi() {
        this(new ApiClient());
    }

    public ActionsApi(ApiClient apiClient) {
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
     * @param indexPhpMethodActionsGetDownloadPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodActionsGetDownloadPost(IndexPhpMethodActionsGetDownloadPostRequest indexPhpMethodActionsGetDownloadPostRequest) throws RestClientException {
        indexPhpmethodActionsGetDownloadPostWithHttpInfo(indexPhpMethodActionsGetDownloadPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetDownloadPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodActionsGetDownloadPostWithHttpInfo(IndexPhpMethodActionsGetDownloadPostRequest indexPhpMethodActionsGetDownloadPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodActionsGetDownloadPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Actions.getDownload", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetEntryPageUrlsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodActionsGetDownloadsPost(IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest) throws RestClientException {
        indexPhpmethodActionsGetDownloadsPostWithHttpInfo(indexPhpMethodActionsGetEntryPageUrlsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetEntryPageUrlsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodActionsGetDownloadsPostWithHttpInfo(IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodActionsGetEntryPageUrlsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Actions.getDownloads", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetEntryPageUrlsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodActionsGetEntryPageTitlesPost(IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest) throws RestClientException {
        indexPhpmethodActionsGetEntryPageTitlesPostWithHttpInfo(indexPhpMethodActionsGetEntryPageUrlsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetEntryPageUrlsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodActionsGetEntryPageTitlesPostWithHttpInfo(IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodActionsGetEntryPageUrlsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Actions.getEntryPageTitles", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetEntryPageUrlsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodActionsGetEntryPageUrlsPost(IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest) throws RestClientException {
        indexPhpmethodActionsGetEntryPageUrlsPostWithHttpInfo(indexPhpMethodActionsGetEntryPageUrlsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetEntryPageUrlsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodActionsGetEntryPageUrlsPostWithHttpInfo(IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodActionsGetEntryPageUrlsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Actions.getEntryPageUrls", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetEntryPageUrlsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodActionsGetExitPageTitlesPost(IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest) throws RestClientException {
        indexPhpmethodActionsGetExitPageTitlesPostWithHttpInfo(indexPhpMethodActionsGetEntryPageUrlsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetEntryPageUrlsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodActionsGetExitPageTitlesPostWithHttpInfo(IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodActionsGetEntryPageUrlsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Actions.getExitPageTitles", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetEntryPageUrlsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodActionsGetExitPageUrlsPost(IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest) throws RestClientException {
        indexPhpmethodActionsGetExitPageUrlsPostWithHttpInfo(indexPhpMethodActionsGetEntryPageUrlsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetEntryPageUrlsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodActionsGetExitPageUrlsPostWithHttpInfo(IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodActionsGetEntryPageUrlsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Actions.getExitPageUrls", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetOutlinkPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodActionsGetOutlinkPost(IndexPhpMethodActionsGetOutlinkPostRequest indexPhpMethodActionsGetOutlinkPostRequest) throws RestClientException {
        indexPhpmethodActionsGetOutlinkPostWithHttpInfo(indexPhpMethodActionsGetOutlinkPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetOutlinkPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodActionsGetOutlinkPostWithHttpInfo(IndexPhpMethodActionsGetOutlinkPostRequest indexPhpMethodActionsGetOutlinkPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodActionsGetOutlinkPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Actions.getOutlink", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetEntryPageUrlsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodActionsGetOutlinksPost(IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest) throws RestClientException {
        indexPhpmethodActionsGetOutlinksPostWithHttpInfo(indexPhpMethodActionsGetEntryPageUrlsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetEntryPageUrlsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodActionsGetOutlinksPostWithHttpInfo(IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodActionsGetEntryPageUrlsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Actions.getOutlinks", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetPageTitlePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodActionsGetPageTitlePost(IndexPhpMethodActionsGetPageTitlePostRequest indexPhpMethodActionsGetPageTitlePostRequest) throws RestClientException {
        indexPhpmethodActionsGetPageTitlePostWithHttpInfo(indexPhpMethodActionsGetPageTitlePostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetPageTitlePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodActionsGetPageTitlePostWithHttpInfo(IndexPhpMethodActionsGetPageTitlePostRequest indexPhpMethodActionsGetPageTitlePostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodActionsGetPageTitlePostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Actions.getPageTitle", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodActionsGetPageTitlesFollowingSiteSearchPost(IndexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest indexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest) throws RestClientException {
        indexPhpmethodActionsGetPageTitlesFollowingSiteSearchPostWithHttpInfo(indexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodActionsGetPageTitlesFollowingSiteSearchPostWithHttpInfo(IndexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest indexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Actions.getPageTitlesFollowingSiteSearch", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetEntryPageUrlsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodActionsGetPageTitlesPost(IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest) throws RestClientException {
        indexPhpmethodActionsGetPageTitlesPostWithHttpInfo(indexPhpMethodActionsGetEntryPageUrlsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetEntryPageUrlsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodActionsGetPageTitlesPostWithHttpInfo(IndexPhpMethodActionsGetEntryPageUrlsPostRequest indexPhpMethodActionsGetEntryPageUrlsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodActionsGetEntryPageUrlsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Actions.getPageTitles", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetPageUrlPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodActionsGetPageUrlPost(IndexPhpMethodActionsGetPageUrlPostRequest indexPhpMethodActionsGetPageUrlPostRequest) throws RestClientException {
        indexPhpmethodActionsGetPageUrlPostWithHttpInfo(indexPhpMethodActionsGetPageUrlPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetPageUrlPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodActionsGetPageUrlPostWithHttpInfo(IndexPhpMethodActionsGetPageUrlPostRequest indexPhpMethodActionsGetPageUrlPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodActionsGetPageUrlPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Actions.getPageUrl", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodActionsGetPageUrlsFollowingSiteSearchPost(IndexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest indexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest) throws RestClientException {
        indexPhpmethodActionsGetPageUrlsFollowingSiteSearchPostWithHttpInfo(indexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodActionsGetPageUrlsFollowingSiteSearchPostWithHttpInfo(IndexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest indexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodActionsGetPageUrlsFollowingSiteSearchPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Actions.getPageUrlsFollowingSiteSearch", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetPageUrlsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodActionsGetPageUrlsPost(IndexPhpMethodActionsGetPageUrlsPostRequest indexPhpMethodActionsGetPageUrlsPostRequest) throws RestClientException {
        indexPhpmethodActionsGetPageUrlsPostWithHttpInfo(indexPhpMethodActionsGetPageUrlsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetPageUrlsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodActionsGetPageUrlsPostWithHttpInfo(IndexPhpMethodActionsGetPageUrlsPostRequest indexPhpMethodActionsGetPageUrlsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodActionsGetPageUrlsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Actions.getPageUrls", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodActionsGetPost(IndexPhpMethodActionsGetPostRequest indexPhpMethodActionsGetPostRequest) throws RestClientException {
        indexPhpmethodActionsGetPostWithHttpInfo(indexPhpMethodActionsGetPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodActionsGetPostWithHttpInfo(IndexPhpMethodActionsGetPostRequest indexPhpMethodActionsGetPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=Actions.get", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetSiteSearchKeywordsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodActionsGetSiteSearchCategoriesPost(IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest) throws RestClientException {
        indexPhpmethodActionsGetSiteSearchCategoriesPostWithHttpInfo(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetSiteSearchKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodActionsGetSiteSearchCategoriesPostWithHttpInfo(IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=Actions.getSiteSearchCategories", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetSiteSearchKeywordsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodActionsGetSiteSearchKeywordsPost(IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest) throws RestClientException {
        indexPhpmethodActionsGetSiteSearchKeywordsPostWithHttpInfo(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetSiteSearchKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodActionsGetSiteSearchKeywordsPostWithHttpInfo(IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=Actions.getSiteSearchKeywords", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetSiteSearchKeywordsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodActionsGetSiteSearchNoResultKeywordsPost(IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest) throws RestClientException {
        indexPhpmethodActionsGetSiteSearchNoResultKeywordsPostWithHttpInfo(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetSiteSearchKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodActionsGetSiteSearchNoResultKeywordsPostWithHttpInfo(IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=Actions.getSiteSearchNoResultKeywords", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
