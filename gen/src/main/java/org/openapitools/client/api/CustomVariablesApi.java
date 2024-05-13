package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IndexPhpMethodAPIGetReportPagesMetadataPostRequest;
import org.openapitools.client.model.IndexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest;
import org.openapitools.client.model.IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest;

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
public class CustomVariablesApi {
    private ApiClient apiClient;

    public CustomVariablesApi() {
        this(new ApiClient());
    }

    public CustomVariablesApi(ApiClient apiClient) {
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
     * @param indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCustomVariablesGetCustomVariablesPost(IndexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest) throws RestClientException {
        indexPhpmethodCustomVariablesGetCustomVariablesPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCustomVariablesGetCustomVariablesPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesByPageUrlPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=CustomVariables.getCustomVariables", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCustomVariablesGetCustomVariablesValuesFromNameIdPost(IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest) throws RestClientException {
        indexPhpmethodCustomVariablesGetCustomVariablesValuesFromNameIdPostWithHttpInfo(indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCustomVariablesGetCustomVariablesValuesFromNameIdPostWithHttpInfo(IndexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest indexPhpMethodCrashAnalyticsGetCrashesForPageUrlPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=CustomVariables.getCustomVariablesValuesFromNameId", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCustomVariablesGetUsagesOfSlotsPost(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
        indexPhpmethodCustomVariablesGetUsagesOfSlotsPostWithHttpInfo(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCustomVariablesGetUsagesOfSlotsPostWithHttpInfo(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=CustomVariables.getUsagesOfSlots", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
