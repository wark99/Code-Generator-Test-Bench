package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Distribution;
import org.openapitools.client.model.ModelApiResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:21.806739296Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FutureApi {
    private ApiClient apiClient;

    public FutureApi() {
        this(new ApiClient());
    }

    public FutureApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List Distributions
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid Request
     * <p><b>404</b> - Distribution not found
     * @param index Start at offset (paging) (required)
     * @param max Max returned (paging) (required)
     * @return List&lt;Distribution&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Distribution> listDistributions(Integer index, Integer max) throws RestClientException {
        return listDistributionsWithHttpInfo(index, max).getBody();
    }

    /**
     * List Distributions
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid Request
     * <p><b>404</b> - Distribution not found
     * @param index Start at offset (paging) (required)
     * @param max Max returned (paging) (required)
     * @return ResponseEntity&lt;List&lt;Distribution&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Distribution>> listDistributionsWithHttpInfo(Integer index, Integer max) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'index' when calling listDistributions");
        }
        
        // verify the required parameter 'max' is set
        if (max == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'max' when calling listDistributions");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "index", index));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "max", max));
        

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Distribution>> localReturnType = new ParameterizedTypeReference<List<Distribution>>() {};
        return apiClient.invokeAPI("/distributions/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
