package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GetMetric200Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:35.686627593Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MetricsApi {
    private ApiClient apiClient;

    public MetricsApi() {
        this(new ApiClient());
    }

    public MetricsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a metric
     * Retrieve the metric.
     * <p><b>200</b> - Returns the trend or value metric.
     * <p><b>404</b> - Booking not found.
     * @param domain  (required)
     * @param metric  (required)
     * @param clubId ID of the organiser (optional)
     * @param filterDateRange Date range (optional)
     * @return GetMetric200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetMetric200Response getMetric(String domain, String metric, Integer clubId, String filterDateRange) throws RestClientException {
        return getMetricWithHttpInfo(domain, metric, clubId, filterDateRange).getBody();
    }

    /**
     * Get a metric
     * Retrieve the metric.
     * <p><b>200</b> - Returns the trend or value metric.
     * <p><b>404</b> - Booking not found.
     * @param domain  (required)
     * @param metric  (required)
     * @param clubId ID of the organiser (optional)
     * @param filterDateRange Date range (optional)
     * @return ResponseEntity&lt;GetMetric200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetMetric200Response> getMetricWithHttpInfo(String domain, String metric, Integer clubId, String filterDateRange) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'domain' when calling getMetric");
        }
        
        // verify the required parameter 'metric' is set
        if (metric == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'metric' when calling getMetric");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("domain", domain);
        uriVariables.put("metric", metric);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "club_id", clubId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[date_range]", filterDateRange));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<GetMetric200Response> localReturnType = new ParameterizedTypeReference<GetMetric200Response>() {};
        return apiClient.invokeAPI("/metics/{domain}/{metric}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
