package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Brand;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:57.815576076Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BrandsApi {
    private ApiClient apiClient;

    public BrandsApi() {
        this(new ApiClient());
    }

    public BrandsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get information for specific brand
     * 
     * <p><b>200</b> - Success
     * @param codeName  (required)
     * @return Brand
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Brand brandsCodeNameGet(String codeName) throws RestClientException {
        return brandsCodeNameGetWithHttpInfo(codeName).getBody();
    }

    /**
     * Get information for specific brand
     * 
     * <p><b>200</b> - Success
     * @param codeName  (required)
     * @return ResponseEntity&lt;Brand&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Brand> brandsCodeNameGetWithHttpInfo(String codeName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'codeName' is set
        if (codeName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'codeName' when calling brandsCodeNameGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("codeName", codeName);

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

        ParameterizedTypeReference<Brand> localReturnType = new ParameterizedTypeReference<Brand>() {};
        return apiClient.invokeAPI("/brands/{codeName}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get brands list
     * Brands discovery endpoint.   Requires special &#x60;root&#x60; client acccess token 
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal Server Error. Contact devs
     * @param env  (optional, default to prod)
     * @return List&lt;Brand&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Brand> brandsGet(String env) throws RestClientException {
        return brandsGetWithHttpInfo(env).getBody();
    }

    /**
     * Get brands list
     * Brands discovery endpoint.   Requires special &#x60;root&#x60; client acccess token 
     * <p><b>200</b> - Success
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal Server Error. Contact devs
     * @param env  (optional, default to prod)
     * @return ResponseEntity&lt;List&lt;Brand&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Brand>> brandsGetWithHttpInfo(String env) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "env", env));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Brand>> localReturnType = new ParameterizedTypeReference<List<Brand>>() {};
        return apiClient.invokeAPI("/brands", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
