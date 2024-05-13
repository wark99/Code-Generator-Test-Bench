package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AddCustomerRequestInner;
import org.openapitools.client.model.UpdateCustomerById200Response;
import org.openapitools.client.model.UpdateCustomerByIdRequest;
import org.openapitools.client.model.UpdateCustomerRequestInner;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:45.540345838Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CustomerApi {
    private ApiClient apiClient;

    public CustomerApi() {
        this(new ApiClient());
    }

    public CustomerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a new Customer to the Inventory Management System
     * Add a new Customer to the Inventory Management System
     * <p><b>200</b> - Successful operation
     * <p><b>201</b> - the resources have been successfully created on the server
     * <p><b>304</b> - Not modified
     * <p><b>404</b> - the server cannot find the requested resource
     * <p><b>405</b> - Invalid input
     * <p><b>510</b> - extensions to the request are required for the server to fulfill it.
     * @param addCustomerRequestInner Create a new Customer in the store (required)
     * @return List&lt;AddCustomerRequestInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AddCustomerRequestInner> addCustomer(List<AddCustomerRequestInner> addCustomerRequestInner) throws RestClientException {
        return addCustomerWithHttpInfo(addCustomerRequestInner).getBody();
    }

    /**
     * Add a new Customer to the Inventory Management System
     * Add a new Customer to the Inventory Management System
     * <p><b>200</b> - Successful operation
     * <p><b>201</b> - the resources have been successfully created on the server
     * <p><b>304</b> - Not modified
     * <p><b>404</b> - the server cannot find the requested resource
     * <p><b>405</b> - Invalid input
     * <p><b>510</b> - extensions to the request are required for the server to fulfill it.
     * @param addCustomerRequestInner Create a new Customer in the store (required)
     * @return ResponseEntity&lt;List&lt;AddCustomerRequestInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AddCustomerRequestInner>> addCustomerWithHttpInfo(List<AddCustomerRequestInner> addCustomerRequestInner) throws RestClientException {
        Object localVarPostBody = addCustomerRequestInner;
        
        // verify the required parameter 'addCustomerRequestInner' is set
        if (addCustomerRequestInner == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addCustomerRequestInner' when calling addCustomer");
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

        String[] localVarAuthNames = new String[] { "petstore_auth" };

        ParameterizedTypeReference<List<AddCustomerRequestInner>> localReturnType = new ParameterizedTypeReference<List<AddCustomerRequestInner>>() {};
        return apiClient.invokeAPI("/Customer", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Deletes a Customer
     * delete a Customer
     * <p><b>200</b> - Successfully updated Customer
     * <p><b>202</b> - the request has been received but not completed yet
     * <p><b>300</b> - The request has more than one possible response
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>405</b> - Invalid operation
     * <p><b>510</b> - extensions to the request are required for the server to fulfill it
     * @param apiKey  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteCustomer(String apiKey) throws RestClientException {
        deleteCustomerWithHttpInfo(apiKey);
    }

    /**
     * Deletes a Customer
     * delete a Customer
     * <p><b>200</b> - Successfully updated Customer
     * <p><b>202</b> - the request has been received but not completed yet
     * <p><b>300</b> - The request has more than one possible response
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>405</b> - Invalid operation
     * <p><b>510</b> - extensions to the request are required for the server to fulfill it
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCustomerWithHttpInfo(String apiKey) throws RestClientException {
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
        return apiClient.invokeAPI("/Customer/{CustomerId}", HttpMethod.DELETE, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Finds Customers by UserName
     * Multiple UserName values can be provided with comma separated strings
     * <p><b>200</b> - successful operation
     * <p><b>202</b> - the request has been accepted for processing
     * <p><b>400</b> - Invalid UserName
     * @param userName UserName values that need to be considered for filter (optional)
     * @return List&lt;UpdateCustomerRequestInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<UpdateCustomerRequestInner> findCustomersByName(String userName) throws RestClientException {
        return findCustomersByNameWithHttpInfo(userName).getBody();
    }

    /**
     * Finds Customers by UserName
     * Multiple UserName values can be provided with comma separated strings
     * <p><b>200</b> - successful operation
     * <p><b>202</b> - the request has been accepted for processing
     * <p><b>400</b> - Invalid UserName
     * @param userName UserName values that need to be considered for filter (optional)
     * @return ResponseEntity&lt;List&lt;UpdateCustomerRequestInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UpdateCustomerRequestInner>> findCustomersByNameWithHttpInfo(String userName) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "UserName", userName));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "petstore_auth" };

        ParameterizedTypeReference<List<UpdateCustomerRequestInner>> localReturnType = new ParameterizedTypeReference<List<UpdateCustomerRequestInner>>() {};
        return apiClient.invokeAPI("/Customer/findByUserName", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Find Customer by ID
     * Returns a single Customer
     * <p><b>200</b> - successful operation
     * <p><b>202</b> - the request has been accepted for processing
     * <p><b>302</b> - the request has been accepted for processing
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Customer not found
     * <p><b>503</b> - The server is not ready to handle the request
     * @param customerId ID of Customer to return (required)
     * @return List&lt;UpdateCustomerRequestInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<UpdateCustomerRequestInner> getCustomerById(Long customerId) throws RestClientException {
        return getCustomerByIdWithHttpInfo(customerId).getBody();
    }

    /**
     * Find Customer by ID
     * Returns a single Customer
     * <p><b>200</b> - successful operation
     * <p><b>202</b> - the request has been accepted for processing
     * <p><b>302</b> - the request has been accepted for processing
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Customer not found
     * <p><b>503</b> - The server is not ready to handle the request
     * @param customerId ID of Customer to return (required)
     * @return ResponseEntity&lt;List&lt;UpdateCustomerRequestInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UpdateCustomerRequestInner>> getCustomerByIdWithHttpInfo(Long customerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getCustomerById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("CustomerId", customerId);

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

        String[] localVarAuthNames = new String[] { "petstore_auth", "api_key" };

        ParameterizedTypeReference<List<UpdateCustomerRequestInner>> localReturnType = new ParameterizedTypeReference<List<UpdateCustomerRequestInner>>() {};
        return apiClient.invokeAPI("/Customer/{CustomerId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update an existing Customer
     * Update an existing Customer by Id
     * <p><b>200</b> - Successful operation
     * <p><b>201</b> - new resource has been created
     * <p><b>202</b> - the request has been accepted for processing
     * <p><b>304</b> - the response has not been modified
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - customer not found
     * <p><b>405</b> - Validation exception
     * @param updateCustomerRequestInner Update an existent Customer in Inventory Management System (required)
     * @return List&lt;UpdateCustomerRequestInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<UpdateCustomerRequestInner> updateCustomer(List<UpdateCustomerRequestInner> updateCustomerRequestInner) throws RestClientException {
        return updateCustomerWithHttpInfo(updateCustomerRequestInner).getBody();
    }

    /**
     * Update an existing Customer
     * Update an existing Customer by Id
     * <p><b>200</b> - Successful operation
     * <p><b>201</b> - new resource has been created
     * <p><b>202</b> - the request has been accepted for processing
     * <p><b>304</b> - the response has not been modified
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - customer not found
     * <p><b>405</b> - Validation exception
     * @param updateCustomerRequestInner Update an existent Customer in Inventory Management System (required)
     * @return ResponseEntity&lt;List&lt;UpdateCustomerRequestInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UpdateCustomerRequestInner>> updateCustomerWithHttpInfo(List<UpdateCustomerRequestInner> updateCustomerRequestInner) throws RestClientException {
        Object localVarPostBody = updateCustomerRequestInner;
        
        // verify the required parameter 'updateCustomerRequestInner' is set
        if (updateCustomerRequestInner == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateCustomerRequestInner' when calling updateCustomer");
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

        String[] localVarAuthNames = new String[] { "petstore_auth" };

        ParameterizedTypeReference<List<UpdateCustomerRequestInner>> localReturnType = new ParameterizedTypeReference<List<UpdateCustomerRequestInner>>() {};
        return apiClient.invokeAPI("/Customer", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Customer by ID
     * Updates specific fields of a Customer identified by ID
     * <p><b>200</b> - Successfully updated Customer
     * <p><b>202</b> - the request has been received but not completed yet
     * <p><b>204</b> - No Content
     * <p><b>302</b> - The URL of the requested resource has been changed temporarily
     * <p><b>404</b> - Customer not found
     * <p><b>503</b> - The server is not ready to handle the request
     * @param updateCustomerByIdRequest  (required)
     * @return UpdateCustomerById200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateCustomerById200Response updateCustomerById(UpdateCustomerByIdRequest updateCustomerByIdRequest) throws RestClientException {
        return updateCustomerByIdWithHttpInfo(updateCustomerByIdRequest).getBody();
    }

    /**
     * Update Customer by ID
     * Updates specific fields of a Customer identified by ID
     * <p><b>200</b> - Successfully updated Customer
     * <p><b>202</b> - the request has been received but not completed yet
     * <p><b>204</b> - No Content
     * <p><b>302</b> - The URL of the requested resource has been changed temporarily
     * <p><b>404</b> - Customer not found
     * <p><b>503</b> - The server is not ready to handle the request
     * @param updateCustomerByIdRequest  (required)
     * @return ResponseEntity&lt;UpdateCustomerById200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UpdateCustomerById200Response> updateCustomerByIdWithHttpInfo(UpdateCustomerByIdRequest updateCustomerByIdRequest) throws RestClientException {
        Object localVarPostBody = updateCustomerByIdRequest;
        
        // verify the required parameter 'updateCustomerByIdRequest' is set
        if (updateCustomerByIdRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateCustomerByIdRequest' when calling updateCustomerById");
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

        ParameterizedTypeReference<UpdateCustomerById200Response> localReturnType = new ParameterizedTypeReference<UpdateCustomerById200Response>() {};
        return apiClient.invokeAPI("/Customer/{CustomerId}", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
