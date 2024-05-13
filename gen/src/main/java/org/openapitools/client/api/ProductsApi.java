package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ProductsGet200ResponseInner;
import org.openapitools.client.model.SearchProfilePost400Response;
import org.openapitools.client.model.SearchProfilePostDefaultResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:24.544913406Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ProductsApi {
    private ApiClient apiClient;

    public ProductsApi() {
        this(new ApiClient());
    }

    public ProductsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * get all service packages available
     * 
     * <p><b>200</b> - All service packages retrieved
     * <p><b>400</b> - Unable to retrieve service package
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @return List&lt;ProductsGet200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ProductsGet200ResponseInner> productsGet() throws RestClientException {
        return productsGetWithHttpInfo().getBody();
    }

    /**
     * get all service packages available
     * 
     * <p><b>200</b> - All service packages retrieved
     * <p><b>400</b> - Unable to retrieve service package
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @return ResponseEntity&lt;List&lt;ProductsGet200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ProductsGet200ResponseInner>> productsGetWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<ProductsGet200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<ProductsGet200ResponseInner>>() {};
        return apiClient.invokeAPI("/products", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
