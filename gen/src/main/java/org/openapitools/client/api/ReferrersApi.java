package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IndexPhpMethodActionsGetPostRequest;
import org.openapitools.client.model.IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest;
import org.openapitools.client.model.IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest;
import org.openapitools.client.model.IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest;
import org.openapitools.client.model.IndexPhpMethodMarketingCampaignsReportingGetNamePostRequest;
import org.openapitools.client.model.IndexPhpMethodReferrersGetKeywordsPostRequest;
import org.openapitools.client.model.IndexPhpMethodReferrersGetReferrerTypePostRequest;
import org.openapitools.client.model.IndexPhpMethodReferrersGetUrlsForSocialPostRequest;

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
public class ReferrersApi {
    private ApiClient apiClient;

    public ReferrersApi() {
        this(new ApiClient());
    }

    public ReferrersApi(ApiClient apiClient) {
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
    public void indexPhpmethodReferrersGetAllPost(IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest) throws RestClientException {
        indexPhpmethodReferrersGetAllPostWithHttpInfo(indexPhpMethodActionsGetSiteSearchKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetSiteSearchKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodReferrersGetAllPostWithHttpInfo(IndexPhpMethodActionsGetSiteSearchKeywordsPostRequest indexPhpMethodActionsGetSiteSearchKeywordsPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=Referrers.getAll", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodMarketingCampaignsReportingGetNamePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodReferrersGetCampaignsPost(IndexPhpMethodMarketingCampaignsReportingGetNamePostRequest indexPhpMethodMarketingCampaignsReportingGetNamePostRequest) throws RestClientException {
        indexPhpmethodReferrersGetCampaignsPostWithHttpInfo(indexPhpMethodMarketingCampaignsReportingGetNamePostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodMarketingCampaignsReportingGetNamePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodReferrersGetCampaignsPostWithHttpInfo(IndexPhpMethodMarketingCampaignsReportingGetNamePostRequest indexPhpMethodMarketingCampaignsReportingGetNamePostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodMarketingCampaignsReportingGetNamePostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Referrers.getCampaigns", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodReferrersGetKeywordsFromCampaignIdPost(IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest) throws RestClientException {
        indexPhpmethodReferrersGetKeywordsFromCampaignIdPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodReferrersGetKeywordsFromCampaignIdPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=Referrers.getKeywordsFromCampaignId", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodReferrersGetKeywordsFromSearchEngineIdPost(IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest) throws RestClientException {
        indexPhpmethodReferrersGetKeywordsFromSearchEngineIdPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodReferrersGetKeywordsFromSearchEngineIdPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=Referrers.getKeywordsFromSearchEngineId", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodReferrersGetKeywordsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodReferrersGetKeywordsPost(IndexPhpMethodReferrersGetKeywordsPostRequest indexPhpMethodReferrersGetKeywordsPostRequest) throws RestClientException {
        indexPhpmethodReferrersGetKeywordsPostWithHttpInfo(indexPhpMethodReferrersGetKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodReferrersGetKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodReferrersGetKeywordsPostWithHttpInfo(IndexPhpMethodReferrersGetKeywordsPostRequest indexPhpMethodReferrersGetKeywordsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodReferrersGetKeywordsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Referrers.getKeywords", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodReferrersGetNumberOfDistinctCampaignsPost(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        indexPhpmethodReferrersGetNumberOfDistinctCampaignsPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodReferrersGetNumberOfDistinctCampaignsPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=Referrers.getNumberOfDistinctCampaigns", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodReferrersGetNumberOfDistinctKeywordsPost(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        indexPhpmethodReferrersGetNumberOfDistinctKeywordsPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodReferrersGetNumberOfDistinctKeywordsPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=Referrers.getNumberOfDistinctKeywords", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodReferrersGetNumberOfDistinctSearchEnginesPost(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        indexPhpmethodReferrersGetNumberOfDistinctSearchEnginesPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodReferrersGetNumberOfDistinctSearchEnginesPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=Referrers.getNumberOfDistinctSearchEngines", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodReferrersGetNumberOfDistinctSocialNetworksPost(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        indexPhpmethodReferrersGetNumberOfDistinctSocialNetworksPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodReferrersGetNumberOfDistinctSocialNetworksPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=Referrers.getNumberOfDistinctSocialNetworks", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodReferrersGetNumberOfDistinctWebsitesPost(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        indexPhpmethodReferrersGetNumberOfDistinctWebsitesPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodReferrersGetNumberOfDistinctWebsitesPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=Referrers.getNumberOfDistinctWebsites", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodReferrersGetNumberOfDistinctWebsitesUrlsPost(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
        indexPhpmethodReferrersGetNumberOfDistinctWebsitesUrlsPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodReferrersGetNumberOfDistinctWebsitesUrlsPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest indexPhpMethodCrashAnalyticsGetAllCrashMessagesPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=Referrers.getNumberOfDistinctWebsitesUrls", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodActionsGetPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodReferrersGetPost(IndexPhpMethodActionsGetPostRequest indexPhpMethodActionsGetPostRequest) throws RestClientException {
        indexPhpmethodReferrersGetPostWithHttpInfo(indexPhpMethodActionsGetPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodActionsGetPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodReferrersGetPostWithHttpInfo(IndexPhpMethodActionsGetPostRequest indexPhpMethodActionsGetPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=Referrers.get", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodReferrersGetReferrerTypePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodReferrersGetReferrerTypePost(IndexPhpMethodReferrersGetReferrerTypePostRequest indexPhpMethodReferrersGetReferrerTypePostRequest) throws RestClientException {
        indexPhpmethodReferrersGetReferrerTypePostWithHttpInfo(indexPhpMethodReferrersGetReferrerTypePostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodReferrersGetReferrerTypePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodReferrersGetReferrerTypePostWithHttpInfo(IndexPhpMethodReferrersGetReferrerTypePostRequest indexPhpMethodReferrersGetReferrerTypePostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodReferrersGetReferrerTypePostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Referrers.getReferrerType", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodReferrersGetSearchEnginesFromKeywordIdPost(IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest) throws RestClientException {
        indexPhpmethodReferrersGetSearchEnginesFromKeywordIdPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodReferrersGetSearchEnginesFromKeywordIdPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=Referrers.getSearchEnginesFromKeywordId", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodReferrersGetKeywordsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodReferrersGetSearchEnginesPost(IndexPhpMethodReferrersGetKeywordsPostRequest indexPhpMethodReferrersGetKeywordsPostRequest) throws RestClientException {
        indexPhpmethodReferrersGetSearchEnginesPostWithHttpInfo(indexPhpMethodReferrersGetKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodReferrersGetKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodReferrersGetSearchEnginesPostWithHttpInfo(IndexPhpMethodReferrersGetKeywordsPostRequest indexPhpMethodReferrersGetKeywordsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodReferrersGetKeywordsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Referrers.getSearchEngines", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodReferrersGetKeywordsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodReferrersGetSocialsPost(IndexPhpMethodReferrersGetKeywordsPostRequest indexPhpMethodReferrersGetKeywordsPostRequest) throws RestClientException {
        indexPhpmethodReferrersGetSocialsPostWithHttpInfo(indexPhpMethodReferrersGetKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodReferrersGetKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodReferrersGetSocialsPostWithHttpInfo(IndexPhpMethodReferrersGetKeywordsPostRequest indexPhpMethodReferrersGetKeywordsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodReferrersGetKeywordsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Referrers.getSocials", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodReferrersGetUrlsForSocialPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodReferrersGetUrlsForSocialPost(IndexPhpMethodReferrersGetUrlsForSocialPostRequest indexPhpMethodReferrersGetUrlsForSocialPostRequest) throws RestClientException {
        indexPhpmethodReferrersGetUrlsForSocialPostWithHttpInfo(indexPhpMethodReferrersGetUrlsForSocialPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodReferrersGetUrlsForSocialPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodReferrersGetUrlsForSocialPostWithHttpInfo(IndexPhpMethodReferrersGetUrlsForSocialPostRequest indexPhpMethodReferrersGetUrlsForSocialPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodReferrersGetUrlsForSocialPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Referrers.getUrlsForSocial", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodReferrersGetUrlsFromWebsiteIdPost(IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest) throws RestClientException {
        indexPhpmethodReferrersGetUrlsFromWebsiteIdPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodReferrersGetUrlsFromWebsiteIdPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=Referrers.getUrlsFromWebsiteId", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodReferrersGetKeywordsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodReferrersGetWebsitesPost(IndexPhpMethodReferrersGetKeywordsPostRequest indexPhpMethodReferrersGetKeywordsPostRequest) throws RestClientException {
        indexPhpmethodReferrersGetWebsitesPostWithHttpInfo(indexPhpMethodReferrersGetKeywordsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodReferrersGetKeywordsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodReferrersGetWebsitesPostWithHttpInfo(IndexPhpMethodReferrersGetKeywordsPostRequest indexPhpMethodReferrersGetKeywordsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodReferrersGetKeywordsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Referrers.getWebsites", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
