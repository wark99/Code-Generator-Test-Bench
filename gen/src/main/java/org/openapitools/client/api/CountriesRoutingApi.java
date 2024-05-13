package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CountriesGetAllExampleResponse;
import org.openapitools.client.model.CountriesGetExampleResponse;
import org.openapitools.client.model.HTTPValidationError;

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
public class CountriesRoutingApi {
    private ApiClient apiClient;

    public CountriesRoutingApi() {
        this(new ApiClient());
    }

    public CountriesRoutingApi(ApiClient apiClient) {
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
     * @return CountriesGetAllExampleResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CountriesGetAllExampleResponse getAllApiCountryAllGet() throws RestClientException {
        return getAllApiCountryAllGetWithHttpInfo().getBody();
    }

    /**
     * Get All
     * 
     * <p><b>200</b> - Успешный запрос
     * @return ResponseEntity&lt;CountriesGetAllExampleResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CountriesGetAllExampleResponse> getAllApiCountryAllGetWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<CountriesGetAllExampleResponse> localReturnType = new ParameterizedTypeReference<CountriesGetAllExampleResponse>() {};
        return apiClient.invokeAPI("/api/country/all", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Country
     * 
     * <p><b>200</b> - Успешный запрос
     * <p><b>422</b> - Validation Error
     * @param code  (required)
     * @return CountriesGetExampleResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CountriesGetExampleResponse getCountryApiCountryGet(String code) throws RestClientException {
        return getCountryApiCountryGetWithHttpInfo(code).getBody();
    }

    /**
     * Get Country
     * 
     * <p><b>200</b> - Успешный запрос
     * <p><b>422</b> - Validation Error
     * @param code  (required)
     * @return ResponseEntity&lt;CountriesGetExampleResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CountriesGetExampleResponse> getCountryApiCountryGetWithHttpInfo(String code) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'code' when calling getCountryApiCountryGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "code", code));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<CountriesGetExampleResponse> localReturnType = new ParameterizedTypeReference<CountriesGetExampleResponse>() {};
        return apiClient.invokeAPI("/api/country", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
