package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.RetrieveProduct200Response;
import org.openapitools.client.model.RetrieveProducts200Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:16.719976364Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogueApi {
    private ApiClient apiClient;

    public CatalogueApi() {
        this(new ApiClient());
    }

    public CatalogueApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve product details
     * Retrieve the details of the product from the path.
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param code The product code of the product object to be retrieved. (required)
     * @return RetrieveProduct200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RetrieveProduct200Response retrieveProduct(String code) throws RestClientException {
        return retrieveProductWithHttpInfo(code).getBody();
    }

    /**
     * Retrieve product details
     * Retrieve the details of the product from the path.
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param code The product code of the product object to be retrieved. (required)
     * @return ResponseEntity&lt;RetrieveProduct200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RetrieveProduct200Response> retrieveProductWithHttpInfo(String code) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'code' when calling retrieveProduct");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("code", code);

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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<RetrieveProduct200Response> localReturnType = new ParameterizedTypeReference<RetrieveProduct200Response>() {};
        return apiClient.invokeAPI("/products/{code}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve catalogue of products
     * Retrieve the catalogue of products, listing all configured products available for issuance. Can be used to discover available products and their codes.
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @return RetrieveProducts200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RetrieveProducts200Response retrieveProducts() throws RestClientException {
        return retrieveProductsWithHttpInfo().getBody();
    }

    /**
     * Retrieve catalogue of products
     * Retrieve the catalogue of products, listing all configured products available for issuance. Can be used to discover available products and their codes.
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @return ResponseEntity&lt;RetrieveProducts200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RetrieveProducts200Response> retrieveProductsWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<RetrieveProducts200Response> localReturnType = new ParameterizedTypeReference<RetrieveProducts200Response>() {};
        return apiClient.invokeAPI("/products", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
