package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ErrorResponseObject;
import org.openapitools.client.model.GetCuisineById200Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T13:26:31.042312843Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CuisinesApi {
    private ApiClient apiClient;

    public CuisinesApi() {
        this(new ApiClient());
    }

    public CuisinesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Follow a cuisine
     * 
     * <p><b>200</b> - OK - returning cuisine details
     * <p><b>400</b>
     * <p><b>404</b>
     * @param cuisineId  (required)
     * @return GetCuisineById200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCuisineById200Response followCuisine(Integer cuisineId) throws RestClientException {
        return followCuisineWithHttpInfo(cuisineId).getBody();
    }

    /**
     * Follow a cuisine
     * 
     * <p><b>200</b> - OK - returning cuisine details
     * <p><b>400</b>
     * <p><b>404</b>
     * @param cuisineId  (required)
     * @return ResponseEntity&lt;GetCuisineById200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCuisineById200Response> followCuisineWithHttpInfo(Integer cuisineId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'cuisineId' is set
        if (cuisineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cuisineId' when calling followCuisine");
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

        String[] localVarAuthNames = new String[] { "auth_jwt" };

        ParameterizedTypeReference<GetCuisineById200Response> localReturnType = new ParameterizedTypeReference<GetCuisineById200Response>() {};
        return apiClient.invokeAPI("/cuisines/{cuisineId}/follow", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get cuisine details
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param cuisineId  (required)
     * @param includeDishes  (optional)
     * @return GetCuisineById200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCuisineById200Response getCuisineById(Integer cuisineId, Boolean includeDishes) throws RestClientException {
        return getCuisineByIdWithHttpInfo(cuisineId, includeDishes).getBody();
    }

    /**
     * Get cuisine details
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param cuisineId  (required)
     * @param includeDishes  (optional)
     * @return ResponseEntity&lt;GetCuisineById200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCuisineById200Response> getCuisineByIdWithHttpInfo(Integer cuisineId, Boolean includeDishes) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'cuisineId' is set
        if (cuisineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cuisineId' when calling getCuisineById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cuisineId", cuisineId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeDishes", includeDishes));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetCuisineById200Response> localReturnType = new ParameterizedTypeReference<GetCuisineById200Response>() {};
        return apiClient.invokeAPI("/cuisines/{cuisineId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
