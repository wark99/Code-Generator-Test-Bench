package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.HTTPValidationError;
import org.openapitools.client.model.ServicesGetAllExampleResponse;
import org.openapitools.client.model.ServicesGetExampleResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:22:50.833453606Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ServicesRoutingApi {
    private ApiClient apiClient;

    public ServicesRoutingApi() {
        this(new ApiClient());
    }

    public ServicesRoutingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get All
     * 
     * <p><b>200</b> - Успешный запрос
     * @return ServicesGetAllExampleResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ServicesGetAllExampleResponse getAllApiServiceAllGet() throws RestClientException {
        return getAllApiServiceAllGetWithHttpInfo().getBody();
    }

    /**
     * Get All
     * 
     * <p><b>200</b> - Успешный запрос
     * @return ResponseEntity&lt;ServicesGetAllExampleResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ServicesGetAllExampleResponse> getAllApiServiceAllGetWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<ServicesGetAllExampleResponse> localReturnType = new ParameterizedTypeReference<ServicesGetAllExampleResponse>() {};
        return apiClient.invokeAPI("/api/service/all", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Service
     * 
     * <p><b>200</b> - Успешный запрос
     * <p><b>422</b> - Validation Error
     * @param countryCode  (required)
     * @return ServicesGetExampleResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ServicesGetExampleResponse getServiceApiServiceGet(String countryCode) throws RestClientException {
        return getServiceApiServiceGetWithHttpInfo(countryCode).getBody();
    }

    /**
     * Get Service
     * 
     * <p><b>200</b> - Успешный запрос
     * <p><b>422</b> - Validation Error
     * @param countryCode  (required)
     * @return ResponseEntity&lt;ServicesGetExampleResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ServicesGetExampleResponse> getServiceApiServiceGetWithHttpInfo(String countryCode) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling getServiceApiServiceGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "country_code", countryCode));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<ServicesGetExampleResponse> localReturnType = new ParameterizedTypeReference<ServicesGetExampleResponse>() {};
        return apiClient.invokeAPI("/api/service", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
