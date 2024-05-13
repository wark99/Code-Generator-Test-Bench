package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.FilterSetsParams;
import org.openapitools.client.model.FilterSetsResponse;

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
public class SetApi {
    private ApiClient apiClient;

    public SetApi() {
        this(new ApiClient());
    }

    public SetApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Filter sets
     * 
     * <p><b>200</b> - Success, here are matching sets
     * <p><b>400</b>
     * <p><b>404</b>
     * <p><b>429</b>
     * @param filterSetsParams Filters on Sets. Requires at least one filter, multiple may be specified and will be combined to find matching records. If neither &#x60;user_id&#x60; nor &#x60;group_id&#x60; is specified, the default behavior or this endpoint is to return only Sets with the same &#x60;user_id&#x60; as the requester. (required)
     * @return FilterSetsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FilterSetsResponse filterSets(FilterSetsParams filterSetsParams) throws RestClientException {
        return filterSetsWithHttpInfo(filterSetsParams).getBody();
    }

    /**
     * Filter sets
     * 
     * <p><b>200</b> - Success, here are matching sets
     * <p><b>400</b>
     * <p><b>404</b>
     * <p><b>429</b>
     * @param filterSetsParams Filters on Sets. Requires at least one filter, multiple may be specified and will be combined to find matching records. If neither &#x60;user_id&#x60; nor &#x60;group_id&#x60; is specified, the default behavior or this endpoint is to return only Sets with the same &#x60;user_id&#x60; as the requester. (required)
     * @return ResponseEntity&lt;FilterSetsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FilterSetsResponse> filterSetsWithHttpInfo(FilterSetsParams filterSetsParams) throws RestClientException {
        Object localVarPostBody = filterSetsParams;
        
        // verify the required parameter 'filterSetsParams' is set
        if (filterSetsParams == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterSetsParams' when calling filterSets");
        }
        

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

        ParameterizedTypeReference<FilterSetsResponse> localReturnType = new ParameterizedTypeReference<FilterSetsResponse>() {};
        return apiClient.invokeAPI("/v3/sets", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
