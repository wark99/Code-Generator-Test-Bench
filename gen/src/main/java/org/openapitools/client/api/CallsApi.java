package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AddCallsRequestInner;
import org.openapitools.client.model.UpdateCallsRequestInner;
import org.openapitools.client.model.UpdateEmployeeById200Response;
import org.openapitools.client.model.UpdateEmployeeByIdRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:37.514106366Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CallsApi {
    private ApiClient apiClient;

    public CallsApi() {
        this(new ApiClient());
    }

    public CallsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a new Calls to the Inventory Management System
     * Add a new Calls to the Inventory Management System
     * <p><b>200</b> - Successful operation
     * <p><b>405</b> - Invalid input
     * @param addCallsRequestInner Create a new Calls (required)
     * @return List&lt;AddCallsRequestInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AddCallsRequestInner> addCalls(List<AddCallsRequestInner> addCallsRequestInner) throws RestClientException {
        return addCallsWithHttpInfo(addCallsRequestInner).getBody();
    }

    /**
     * Add a new Calls to the Inventory Management System
     * Add a new Calls to the Inventory Management System
     * <p><b>200</b> - Successful operation
     * <p><b>405</b> - Invalid input
     * @param addCallsRequestInner Create a new Calls (required)
     * @return ResponseEntity&lt;List&lt;AddCallsRequestInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AddCallsRequestInner>> addCallsWithHttpInfo(List<AddCallsRequestInner> addCallsRequestInner) throws RestClientException {
        Object localVarPostBody = addCallsRequestInner;
        
        // verify the required parameter 'addCallsRequestInner' is set
        if (addCallsRequestInner == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addCallsRequestInner' when calling addCalls");
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

        ParameterizedTypeReference<List<AddCallsRequestInner>> localReturnType = new ParameterizedTypeReference<List<AddCallsRequestInner>>() {};
        return apiClient.invokeAPI("/Calls", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Deletes a Call
     * delete a Call
     * <p><b>400</b> - Invalid call value
     * @param apiKey  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteCalls(String apiKey) throws RestClientException {
        deleteCallsWithHttpInfo(apiKey);
    }

    /**
     * Deletes a Call
     * delete a Call
     * <p><b>400</b> - Invalid call value
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCallsWithHttpInfo(String apiKey) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (apiKey != null)
        localVarHeaderParams.add("api_key", apiClient.parameterToString(apiKey));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/Calls/findById", HttpMethod.DELETE, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Finds Calls by Id
     * Multiple Calls values can be provided with comma separated strings
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid ID value
     * <p><b>404</b> - Call not found
     * @param id IDs values that need to be considered for filter (optional)
     * @return List&lt;AddCallsRequestInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AddCallsRequestInner> findCallsById(String id) throws RestClientException {
        return findCallsByIdWithHttpInfo(id).getBody();
    }

    /**
     * Finds Calls by Id
     * Multiple Calls values can be provided with comma separated strings
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid ID value
     * <p><b>404</b> - Call not found
     * @param id IDs values that need to be considered for filter (optional)
     * @return ResponseEntity&lt;List&lt;AddCallsRequestInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AddCallsRequestInner>> findCallsByIdWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "Id", id));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<AddCallsRequestInner>> localReturnType = new ParameterizedTypeReference<List<AddCallsRequestInner>>() {};
        return apiClient.invokeAPI("/Calls/findById", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update an existing Calls
     * Update an existing Calls by Id
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Calls not found
     * <p><b>405</b> - Validation exception
     * @param updateCallsRequestInner Update an existent Calls in Inventory Management System (required)
     * @return List&lt;UpdateCallsRequestInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<UpdateCallsRequestInner> updateCalls(List<UpdateCallsRequestInner> updateCallsRequestInner) throws RestClientException {
        return updateCallsWithHttpInfo(updateCallsRequestInner).getBody();
    }

    /**
     * Update an existing Calls
     * Update an existing Calls by Id
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Calls not found
     * <p><b>405</b> - Validation exception
     * @param updateCallsRequestInner Update an existent Calls in Inventory Management System (required)
     * @return ResponseEntity&lt;List&lt;UpdateCallsRequestInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UpdateCallsRequestInner>> updateCallsWithHttpInfo(List<UpdateCallsRequestInner> updateCallsRequestInner) throws RestClientException {
        Object localVarPostBody = updateCallsRequestInner;
        
        // verify the required parameter 'updateCallsRequestInner' is set
        if (updateCallsRequestInner == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateCallsRequestInner' when calling updateCalls");
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

        ParameterizedTypeReference<List<UpdateCallsRequestInner>> localReturnType = new ParameterizedTypeReference<List<UpdateCallsRequestInner>>() {};
        return apiClient.invokeAPI("/Calls", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Calls by ID
     * Updates specific fields of a Calls identified by ID
     * <p><b>200</b> - Successfully updated Calls
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Calls not found
     * @param updateEmployeeByIdRequest  (required)
     * @return UpdateEmployeeById200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateEmployeeById200Response updateCallsById(UpdateEmployeeByIdRequest updateEmployeeByIdRequest) throws RestClientException {
        return updateCallsByIdWithHttpInfo(updateEmployeeByIdRequest).getBody();
    }

    /**
     * Update Calls by ID
     * Updates specific fields of a Calls identified by ID
     * <p><b>200</b> - Successfully updated Calls
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Calls not found
     * @param updateEmployeeByIdRequest  (required)
     * @return ResponseEntity&lt;UpdateEmployeeById200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UpdateEmployeeById200Response> updateCallsByIdWithHttpInfo(UpdateEmployeeByIdRequest updateEmployeeByIdRequest) throws RestClientException {
        Object localVarPostBody = updateEmployeeByIdRequest;
        
        // verify the required parameter 'updateEmployeeByIdRequest' is set
        if (updateEmployeeByIdRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateEmployeeByIdRequest' when calling updateCallsById");
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

        ParameterizedTypeReference<UpdateEmployeeById200Response> localReturnType = new ParameterizedTypeReference<UpdateEmployeeById200Response>() {};
        return apiClient.invokeAPI("/Calls/findById", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
