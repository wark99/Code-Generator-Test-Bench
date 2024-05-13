package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GetCategoriesOkResponse;
import org.openapitools.client.model.GetDataParametersOkResponse;
import org.openapitools.client.model.GetTerminalsOkResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:46.594754675Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class StaticApi {
    private ApiClient apiClient;

    public StaticApi() {
        this(new ApiClient());
    }

    public StaticApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a list of item and service categories.
     * 
     * <p><b>200</b> - OK
     * @param type  (optional)
     * @return GetCategoriesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCategoriesOkResponse getCategories(String type) throws RestClientException {
        return getCategoriesWithHttpInfo(type).getBody();
    }

    /**
     * Get a list of item and service categories.
     * 
     * <p><b>200</b> - OK
     * @param type  (optional)
     * @return ResponseEntity&lt;GetCategoriesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCategoriesOkResponse> getCategoriesWithHttpInfo(String type) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetCategoriesOkResponse> localReturnType = new ParameterizedTypeReference<GetCategoriesOkResponse>() {};
        return apiClient.invokeAPI("/categories/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of specific parameters that UEX uses for managing prices and updates.
     * 
     * <p><b>200</b> - OK
     * @return GetDataParametersOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDataParametersOkResponse getDataParameters() throws RestClientException {
        return getDataParametersWithHttpInfo().getBody();
    }

    /**
     * Retrieve a list of specific parameters that UEX uses for managing prices and updates.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;GetDataParametersOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDataParametersOkResponse> getDataParametersWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<GetDataParametersOkResponse> localReturnType = new ParameterizedTypeReference<GetDataParametersOkResponse>() {};
        return apiClient.invokeAPI("/data_parameters/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a comprehensive list of all terminals in the game, including trade terminals, item terminals, vehicle rentals, and more.
     * 
     * <p><b>200</b> - OK
     * @param type  (optional)
     * @return GetTerminalsOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetTerminalsOkResponse getTerminals(String type) throws RestClientException {
        return getTerminalsWithHttpInfo(type).getBody();
    }

    /**
     * Retrieve a comprehensive list of all terminals in the game, including trade terminals, item terminals, vehicle rentals, and more.
     * 
     * <p><b>200</b> - OK
     * @param type  (optional)
     * @return ResponseEntity&lt;GetTerminalsOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetTerminalsOkResponse> getTerminalsWithHttpInfo(String type) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetTerminalsOkResponse> localReturnType = new ParameterizedTypeReference<GetTerminalsOkResponse>() {};
        return apiClient.invokeAPI("/terminals/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
