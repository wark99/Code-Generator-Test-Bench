package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CuisinesCuisineIdGet200Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:19:30.095527364Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CuisineApi {
    private ApiClient apiClient;

    public CuisineApi() {
        this(new ApiClient());
    }

    public CuisineApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get cuisine details
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param cuisineId  (required)
     * @return CuisinesCuisineIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CuisinesCuisineIdGet200Response cuisinesCuisineIdGet(Integer cuisineId) throws RestClientException {
        return cuisinesCuisineIdGetWithHttpInfo(cuisineId).getBody();
    }

    /**
     * Get cuisine details
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param cuisineId  (required)
     * @return ResponseEntity&lt;CuisinesCuisineIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CuisinesCuisineIdGet200Response> cuisinesCuisineIdGetWithHttpInfo(Integer cuisineId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'cuisineId' is set
        if (cuisineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cuisineId' when calling cuisinesCuisineIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cuisineId", cuisineId);

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<CuisinesCuisineIdGet200Response> localReturnType = new ParameterizedTypeReference<CuisinesCuisineIdGet200Response>() {};
        return apiClient.invokeAPI("/cuisines/{cuisineId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
