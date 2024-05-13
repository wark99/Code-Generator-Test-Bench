package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IndexPhpMethodAPIGetReportPagesMetadataPostRequest;
import org.openapitools.client.model.IndexPhpMethodFunnelsGetGoalFunnelPostRequest;
import org.openapitools.client.model.IndexPhpMethodGoalsAddGoalPostRequest;
import org.openapitools.client.model.IndexPhpMethodGoalsGetDaysToConversionPostRequest;
import org.openapitools.client.model.IndexPhpMethodGoalsGetItemsSkuPostRequest;
import org.openapitools.client.model.IndexPhpMethodGoalsGetPostRequest;
import org.openapitools.client.model.IndexPhpMethodGoalsUpdateGoalPostRequest;

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
public class GoalsApi {
    private ApiClient apiClient;

    public GoalsApi() {
        this(new ApiClient());
    }

    public GoalsApi(ApiClient apiClient) {
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
     * @param indexPhpMethodGoalsAddGoalPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodGoalsAddGoalPost(IndexPhpMethodGoalsAddGoalPostRequest indexPhpMethodGoalsAddGoalPostRequest) throws RestClientException {
        indexPhpmethodGoalsAddGoalPostWithHttpInfo(indexPhpMethodGoalsAddGoalPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodGoalsAddGoalPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodGoalsAddGoalPostWithHttpInfo(IndexPhpMethodGoalsAddGoalPostRequest indexPhpMethodGoalsAddGoalPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodGoalsAddGoalPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Goals.addGoal", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodFunnelsGetGoalFunnelPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodGoalsDeleteGoalPost(IndexPhpMethodFunnelsGetGoalFunnelPostRequest indexPhpMethodFunnelsGetGoalFunnelPostRequest) throws RestClientException {
        indexPhpmethodGoalsDeleteGoalPostWithHttpInfo(indexPhpMethodFunnelsGetGoalFunnelPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodFunnelsGetGoalFunnelPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodGoalsDeleteGoalPostWithHttpInfo(IndexPhpMethodFunnelsGetGoalFunnelPostRequest indexPhpMethodFunnelsGetGoalFunnelPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodFunnelsGetGoalFunnelPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Goals.deleteGoal", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodGoalsGetDaysToConversionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodGoalsGetDaysToConversionPost(IndexPhpMethodGoalsGetDaysToConversionPostRequest indexPhpMethodGoalsGetDaysToConversionPostRequest) throws RestClientException {
        indexPhpmethodGoalsGetDaysToConversionPostWithHttpInfo(indexPhpMethodGoalsGetDaysToConversionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodGoalsGetDaysToConversionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodGoalsGetDaysToConversionPostWithHttpInfo(IndexPhpMethodGoalsGetDaysToConversionPostRequest indexPhpMethodGoalsGetDaysToConversionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodGoalsGetDaysToConversionPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Goals.getDaysToConversion", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodFunnelsGetGoalFunnelPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodGoalsGetGoalPost(IndexPhpMethodFunnelsGetGoalFunnelPostRequest indexPhpMethodFunnelsGetGoalFunnelPostRequest) throws RestClientException {
        indexPhpmethodGoalsGetGoalPostWithHttpInfo(indexPhpMethodFunnelsGetGoalFunnelPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodFunnelsGetGoalFunnelPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodGoalsGetGoalPostWithHttpInfo(IndexPhpMethodFunnelsGetGoalFunnelPostRequest indexPhpMethodFunnelsGetGoalFunnelPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodFunnelsGetGoalFunnelPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Goals.getGoal", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodGoalsGetGoalsPost(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
        indexPhpmethodGoalsGetGoalsPostWithHttpInfo(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodGoalsGetGoalsPostWithHttpInfo(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=Goals.getGoals", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodGoalsGetItemsSkuPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodGoalsGetItemsCategoryPost(IndexPhpMethodGoalsGetItemsSkuPostRequest indexPhpMethodGoalsGetItemsSkuPostRequest) throws RestClientException {
        indexPhpmethodGoalsGetItemsCategoryPostWithHttpInfo(indexPhpMethodGoalsGetItemsSkuPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodGoalsGetItemsSkuPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodGoalsGetItemsCategoryPostWithHttpInfo(IndexPhpMethodGoalsGetItemsSkuPostRequest indexPhpMethodGoalsGetItemsSkuPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodGoalsGetItemsSkuPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Goals.getItemsCategory", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodGoalsGetItemsSkuPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodGoalsGetItemsNamePost(IndexPhpMethodGoalsGetItemsSkuPostRequest indexPhpMethodGoalsGetItemsSkuPostRequest) throws RestClientException {
        indexPhpmethodGoalsGetItemsNamePostWithHttpInfo(indexPhpMethodGoalsGetItemsSkuPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodGoalsGetItemsSkuPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodGoalsGetItemsNamePostWithHttpInfo(IndexPhpMethodGoalsGetItemsSkuPostRequest indexPhpMethodGoalsGetItemsSkuPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodGoalsGetItemsSkuPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Goals.getItemsName", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodGoalsGetItemsSkuPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodGoalsGetItemsSkuPost(IndexPhpMethodGoalsGetItemsSkuPostRequest indexPhpMethodGoalsGetItemsSkuPostRequest) throws RestClientException {
        indexPhpmethodGoalsGetItemsSkuPostWithHttpInfo(indexPhpMethodGoalsGetItemsSkuPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodGoalsGetItemsSkuPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodGoalsGetItemsSkuPostWithHttpInfo(IndexPhpMethodGoalsGetItemsSkuPostRequest indexPhpMethodGoalsGetItemsSkuPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodGoalsGetItemsSkuPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Goals.getItemsSku", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodGoalsGetPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodGoalsGetPost(IndexPhpMethodGoalsGetPostRequest indexPhpMethodGoalsGetPostRequest) throws RestClientException {
        indexPhpmethodGoalsGetPostWithHttpInfo(indexPhpMethodGoalsGetPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodGoalsGetPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodGoalsGetPostWithHttpInfo(IndexPhpMethodGoalsGetPostRequest indexPhpMethodGoalsGetPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodGoalsGetPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Goals.get", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodGoalsGetDaysToConversionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodGoalsGetVisitsUntilConversionPost(IndexPhpMethodGoalsGetDaysToConversionPostRequest indexPhpMethodGoalsGetDaysToConversionPostRequest) throws RestClientException {
        indexPhpmethodGoalsGetVisitsUntilConversionPostWithHttpInfo(indexPhpMethodGoalsGetDaysToConversionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodGoalsGetDaysToConversionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodGoalsGetVisitsUntilConversionPostWithHttpInfo(IndexPhpMethodGoalsGetDaysToConversionPostRequest indexPhpMethodGoalsGetDaysToConversionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodGoalsGetDaysToConversionPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Goals.getVisitsUntilConversion", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodGoalsUpdateGoalPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodGoalsUpdateGoalPost(IndexPhpMethodGoalsUpdateGoalPostRequest indexPhpMethodGoalsUpdateGoalPostRequest) throws RestClientException {
        indexPhpmethodGoalsUpdateGoalPostWithHttpInfo(indexPhpMethodGoalsUpdateGoalPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodGoalsUpdateGoalPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodGoalsUpdateGoalPostWithHttpInfo(IndexPhpMethodGoalsUpdateGoalPostRequest indexPhpMethodGoalsUpdateGoalPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodGoalsUpdateGoalPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Goals.updateGoal", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
