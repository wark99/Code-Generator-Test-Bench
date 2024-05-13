package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AddEmployeeRequestInner;
import org.openapitools.client.model.AddEmployeeRequestInner1;
import org.openapitools.client.model.FindEmployeeByName200ResponseInner;
import org.openapitools.client.model.UpdateCustomerRequestInner;
import org.openapitools.client.model.UpdateEmployeeById200Response;
import org.openapitools.client.model.UpdateEmployeeByIdRequest;
import org.openapitools.client.model.UpdateEmployeesRequestInner;

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
public class EmployeeApi {
    private ApiClient apiClient;

    public EmployeeApi() {
        this(new ApiClient());
    }

    public EmployeeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a new Employee to the Inventory Management System
     * Add a new Employee to the Inventory Management System
     * <p><b>200</b> - Successful operation
     * <p><b>405</b> - Invalid input
     * @param addEmployeeRequestInner Create a new Employee (required)
     * @return List&lt;AddEmployeeRequestInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AddEmployeeRequestInner> addEmployee(List<AddEmployeeRequestInner> addEmployeeRequestInner) throws RestClientException {
        return addEmployeeWithHttpInfo(addEmployeeRequestInner).getBody();
    }

    /**
     * Add a new Employee to the Inventory Management System
     * Add a new Employee to the Inventory Management System
     * <p><b>200</b> - Successful operation
     * <p><b>405</b> - Invalid input
     * @param addEmployeeRequestInner Create a new Employee (required)
     * @return ResponseEntity&lt;List&lt;AddEmployeeRequestInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AddEmployeeRequestInner>> addEmployeeWithHttpInfo(List<AddEmployeeRequestInner> addEmployeeRequestInner) throws RestClientException {
        Object localVarPostBody = addEmployeeRequestInner;
        
        // verify the required parameter 'addEmployeeRequestInner' is set
        if (addEmployeeRequestInner == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addEmployeeRequestInner' when calling addEmployee");
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
            "application/json", "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<AddEmployeeRequestInner>> localReturnType = new ParameterizedTypeReference<List<AddEmployeeRequestInner>>() {};
        return apiClient.invokeAPI("/Employee", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Deletes a Employee
     * delete a Employee
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Employee not found
     * @param apiKey  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteEmployee(String apiKey) throws RestClientException {
        deleteEmployeeWithHttpInfo(apiKey);
    }

    /**
     * Deletes a Employee
     * delete a Employee
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Employee not found
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteEmployeeWithHttpInfo(String apiKey) throws RestClientException {
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
        return apiClient.invokeAPI("/Employee/{EmployeeId}", HttpMethod.DELETE, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Finds Employee  by Name
     * Multiple Name values can be provided with comma separated strings
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid Name value
     * @param name Names values that need to be considered for filter (optional)
     * @return List&lt;FindEmployeeByName200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<FindEmployeeByName200ResponseInner> findEmployeeByName(String name) throws RestClientException {
        return findEmployeeByNameWithHttpInfo(name).getBody();
    }

    /**
     * Finds Employee  by Name
     * Multiple Name values can be provided with comma separated strings
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid Name value
     * @param name Names values that need to be considered for filter (optional)
     * @return ResponseEntity&lt;List&lt;FindEmployeeByName200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<FindEmployeeByName200ResponseInner>> findEmployeeByNameWithHttpInfo(String name) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "Name", name));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<FindEmployeeByName200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<FindEmployeeByName200ResponseInner>>() {};
        return apiClient.invokeAPI("/Employee/findByName", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Find Employee by ID
     * Returns a single Employee
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Employee not found
     * @param employeeId ID of Employee to return (required)
     * @return List&lt;AddEmployeeRequestInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AddEmployeeRequestInner> getEmployeeById(Long employeeId) throws RestClientException {
        return getEmployeeByIdWithHttpInfo(employeeId).getBody();
    }

    /**
     * Find Employee by ID
     * Returns a single Employee
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Employee not found
     * @param employeeId ID of Employee to return (required)
     * @return ResponseEntity&lt;List&lt;AddEmployeeRequestInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AddEmployeeRequestInner>> getEmployeeByIdWithHttpInfo(Long employeeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'employeeId' is set
        if (employeeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'employeeId' when calling getEmployeeById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("EmployeeId", employeeId);

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

        ParameterizedTypeReference<List<AddEmployeeRequestInner>> localReturnType = new ParameterizedTypeReference<List<AddEmployeeRequestInner>>() {};
        return apiClient.invokeAPI("/Employee/{EmployeeId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Employee by ID
     * Updates specific fields of a Employee identified by ID
     * <p><b>200</b> - Successfully updated Employee
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Employee not found
     * @param updateEmployeeByIdRequest  (required)
     * @return UpdateEmployeeById200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateEmployeeById200Response updateEmployeeById(UpdateEmployeeByIdRequest updateEmployeeByIdRequest) throws RestClientException {
        return updateEmployeeByIdWithHttpInfo(updateEmployeeByIdRequest).getBody();
    }

    /**
     * Update Employee by ID
     * Updates specific fields of a Employee identified by ID
     * <p><b>200</b> - Successfully updated Employee
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Employee not found
     * @param updateEmployeeByIdRequest  (required)
     * @return ResponseEntity&lt;UpdateEmployeeById200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UpdateEmployeeById200Response> updateEmployeeByIdWithHttpInfo(UpdateEmployeeByIdRequest updateEmployeeByIdRequest) throws RestClientException {
        Object localVarPostBody = updateEmployeeByIdRequest;
        
        // verify the required parameter 'updateEmployeeByIdRequest' is set
        if (updateEmployeeByIdRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateEmployeeByIdRequest' when calling updateEmployeeById");
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
        return apiClient.invokeAPI("/Employee/{EmployeeId}", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update an existing Employee
     * Update an existing Employee by Id
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - customer not found
     * <p><b>405</b> - Validation exception
     * @param updateEmployeesRequestInner Update an existent Employee in Inventory Management System (required)
     * @return List&lt;UpdateEmployeesRequestInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<UpdateEmployeesRequestInner> updateEmployees(List<UpdateEmployeesRequestInner> updateEmployeesRequestInner) throws RestClientException {
        return updateEmployeesWithHttpInfo(updateEmployeesRequestInner).getBody();
    }

    /**
     * Update an existing Employee
     * Update an existing Employee by Id
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - customer not found
     * <p><b>405</b> - Validation exception
     * @param updateEmployeesRequestInner Update an existent Employee in Inventory Management System (required)
     * @return ResponseEntity&lt;List&lt;UpdateEmployeesRequestInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<UpdateEmployeesRequestInner>> updateEmployeesWithHttpInfo(List<UpdateEmployeesRequestInner> updateEmployeesRequestInner) throws RestClientException {
        Object localVarPostBody = updateEmployeesRequestInner;
        
        // verify the required parameter 'updateEmployeesRequestInner' is set
        if (updateEmployeesRequestInner == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateEmployeesRequestInner' when calling updateEmployees");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "petstore_auth" };

        ParameterizedTypeReference<List<UpdateEmployeesRequestInner>> localReturnType = new ParameterizedTypeReference<List<UpdateEmployeesRequestInner>>() {};
        return apiClient.invokeAPI("/Employee", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
