package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Product;
import org.openapitools.client.model.ProductFilterRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:45.886026141Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ProductApi {
    private ApiClient apiClient;

    public ProductApi() {
        this(new ApiClient());
    }

    public ProductApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Отфильтровать товары
     * 
     * <p><b>200</b> - OK
     * <p><b>422</b>
     * @param productFilterRequest  (required)
     * @return List&lt;Product&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Product> productFilter(ProductFilterRequest productFilterRequest) throws RestClientException {
        return productFilterWithHttpInfo(productFilterRequest).getBody();
    }

    /**
     * Отфильтровать товары
     * 
     * <p><b>200</b> - OK
     * <p><b>422</b>
     * @param productFilterRequest  (required)
     * @return ResponseEntity&lt;List&lt;Product&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Product>> productFilterWithHttpInfo(ProductFilterRequest productFilterRequest) throws RestClientException {
        Object localVarPostBody = productFilterRequest;
        
        // verify the required parameter 'productFilterRequest' is set
        if (productFilterRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'productFilterRequest' when calling productFilter");
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Product>> localReturnType = new ParameterizedTypeReference<List<Product>>() {};
        return apiClient.invokeAPI("/api/product/filter", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Получить товар по ЧПУ
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param slug ЧПУ товара (required)
     * @return Product
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Product productGet(String slug) throws RestClientException {
        return productGetWithHttpInfo(slug).getBody();
    }

    /**
     * Получить товар по ЧПУ
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param slug ЧПУ товара (required)
     * @return ResponseEntity&lt;Product&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Product> productGetWithHttpInfo(String slug) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'slug' is set
        if (slug == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'slug' when calling productGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("slug", slug);

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

        ParameterizedTypeReference<Product> localReturnType = new ParameterizedTypeReference<Product>() {};
        return apiClient.invokeAPI("/api/product/{slug}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
