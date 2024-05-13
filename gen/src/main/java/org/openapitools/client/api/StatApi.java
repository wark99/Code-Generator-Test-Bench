package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.FilterStatsParams;
import org.openapitools.client.model.FilterStatsResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:41.221792118Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class StatApi {
    private ApiClient apiClient;

    public StatApi() {
        this(new ApiClient());
    }

    public StatApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Filter stats
     * 
     * <p><b>200</b> - Success, here are matching exercises
     * <p><b>400</b>
     * <p><b>404</b>
     * <p><b>429</b>
     * @param filterStatsParams Parameters on which to filter stats. (optional)
     * @return FilterStatsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FilterStatsResponse filterStats(FilterStatsParams filterStatsParams) throws RestClientException {
        return filterStatsWithHttpInfo(filterStatsParams).getBody();
    }

    /**
     * Filter stats
     * 
     * <p><b>200</b> - Success, here are matching exercises
     * <p><b>400</b>
     * <p><b>404</b>
     * <p><b>429</b>
     * @param filterStatsParams Parameters on which to filter stats. (optional)
     * @return ResponseEntity&lt;FilterStatsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FilterStatsResponse> filterStatsWithHttpInfo(FilterStatsParams filterStatsParams) throws RestClientException {
        Object localVarPostBody = filterStatsParams;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<FilterStatsResponse> localReturnType = new ParameterizedTypeReference<FilterStatsResponse>() {};
        return apiClient.invokeAPI("/stats", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get stats for the logged in user
     * 
     * <p><b>200</b> - Success, here are all stats
     * <p><b>429</b>
     * @return FilterStatsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FilterStatsResponse getStats() throws RestClientException {
        return getStatsWithHttpInfo().getBody();
    }

    /**
     * Get stats for the logged in user
     * 
     * <p><b>200</b> - Success, here are all stats
     * <p><b>429</b>
     * @return ResponseEntity&lt;FilterStatsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FilterStatsResponse> getStatsWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<FilterStatsResponse> localReturnType = new ParameterizedTypeReference<FilterStatsResponse>() {};
        return apiClient.invokeAPI("/stats", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
