package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ErrorResponseObject;
import org.openapitools.client.model.GetDishById200Response;
import org.openapitools.client.model.SearchDishes200Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T14:05:28.913547523Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DishApi {
    private ApiClient apiClient;

    public DishApi() {
        this(new ApiClient());
    }

    public DishApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get dish details
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param dishId  (required)
     * @return GetDishById200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDishById200Response getDishById(String dishId) throws RestClientException {
        return getDishByIdWithHttpInfo(dishId).getBody();
    }

    /**
     * Get dish details
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param dishId  (required)
     * @return ResponseEntity&lt;GetDishById200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDishById200Response> getDishByIdWithHttpInfo(String dishId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'dishId' is set
        if (dishId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dishId' when calling getDishById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dishId", dishId);

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

        ParameterizedTypeReference<GetDishById200Response> localReturnType = new ParameterizedTypeReference<GetDishById200Response>() {};
        return apiClient.invokeAPI("/dishes/{dishId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search for dishes
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @param q  (optional)
     * @param cuisine  (optional)
     * @param foodType  (optional)
     * @return SearchDishes200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SearchDishes200Response searchDishes(String q, String cuisine, String foodType) throws RestClientException {
        return searchDishesWithHttpInfo(q, cuisine, foodType).getBody();
    }

    /**
     * Search for dishes
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @param q  (optional)
     * @param cuisine  (optional)
     * @param foodType  (optional)
     * @return ResponseEntity&lt;SearchDishes200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SearchDishes200Response> searchDishesWithHttpInfo(String q, String cuisine, String foodType) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "cuisine", cuisine));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "foodType", foodType));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<SearchDishes200Response> localReturnType = new ParameterizedTypeReference<SearchDishes200Response>() {};
        return apiClient.invokeAPI("/search/dishes", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
