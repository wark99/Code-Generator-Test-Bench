package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GetPrices200Response;

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
public class PricesApi {
    private ApiClient apiClient;

    public PricesApi() {
        this(new ApiClient());
    }

    public PricesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List prices
     * Retrieve a list of prices.
     * <p><b>200</b> - Returns a list of Price objects.  When the class filter is provided, the list contains only prices that are available for this class.  When the students filter is provided, the list contains only prices that are available for all students.
     * @param filterClass ID of the class (required)
     * @param filterStudents IDs of the students (required)
     * @return GetPrices200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetPrices200Response getPrices(Integer filterClass, List<String> filterStudents) throws RestClientException {
        return getPricesWithHttpInfo(filterClass, filterStudents).getBody();
    }

    /**
     * List prices
     * Retrieve a list of prices.
     * <p><b>200</b> - Returns a list of Price objects.  When the class filter is provided, the list contains only prices that are available for this class.  When the students filter is provided, the list contains only prices that are available for all students.
     * @param filterClass ID of the class (required)
     * @param filterStudents IDs of the students (required)
     * @return ResponseEntity&lt;GetPrices200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetPrices200Response> getPricesWithHttpInfo(Integer filterClass, List<String> filterStudents) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'filterClass' is set
        if (filterClass == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterClass' when calling getPrices");
        }
        
        // verify the required parameter 'filterStudents' is set
        if (filterStudents == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filterStudents' when calling getPrices");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[class]", filterClass));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "filter[students][]", filterStudents));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<GetPrices200Response> localReturnType = new ParameterizedTypeReference<GetPrices200Response>() {};
        return apiClient.invokeAPI("/prices", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
