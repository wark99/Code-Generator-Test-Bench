package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.UsersIdPatchRequest;
import org.openapitools.client.model.UsersIdPutRequest;
import org.openapitools.client.model.UsersPostRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:19:45.736611184Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UserApi {
    private ApiClient apiClient;

    public UserApi() {
        this(new ApiClient());
    }

    public UserApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve a list of all users
     * 
     * <p><b>200</b> - The request was successful and the users are returned.
     * <p><b>400</b> - The request parameters are invalid.
     * <p><b>403</b> - The user is not authorized to perform the operation.
     * <p><b>404</b> - The requested resource could not be found.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void usersGet() throws RestClientException {
        usersGetWithHttpInfo();
    }

    /**
     * Retrieve a list of all users
     * 
     * <p><b>200</b> - The request was successful and the users are returned.
     * <p><b>400</b> - The request parameters are invalid.
     * <p><b>403</b> - The user is not authorized to perform the operation.
     * <p><b>404</b> - The requested resource could not be found.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> usersGetWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/users", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a specific user by ID
     * 
     * <p><b>200</b> - The request was successful and the user is deleted.
     * <p><b>400</b> - The request parameters are invalid.
     * <p><b>403</b> - The user is not authorized to perform the operation.
     * <p><b>404</b> - The requested resource could not be found.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @param id ID of the user to delete (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void usersIdDelete(Integer id) throws RestClientException {
        usersIdDeleteWithHttpInfo(id);
    }

    /**
     * Delete a specific user by ID
     * 
     * <p><b>200</b> - The request was successful and the user is deleted.
     * <p><b>400</b> - The request parameters are invalid.
     * <p><b>403</b> - The user is not authorized to perform the operation.
     * <p><b>404</b> - The requested resource could not be found.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @param id ID of the user to delete (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> usersIdDeleteWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling usersIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/users/{id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve the details of a specific user by ID
     * 
     * <p><b>200</b> - The request was successful and the user details are returned.
     * <p><b>400</b> - The request parameters are invalid.
     * <p><b>403</b> - The user is not authorized to perform the operation.
     * <p><b>404</b> - The requested resource could not be found.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @param id ID of the user to delete (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void usersIdGet(Integer id) throws RestClientException {
        usersIdGetWithHttpInfo(id);
    }

    /**
     * Retrieve the details of a specific user by ID
     * 
     * <p><b>200</b> - The request was successful and the user details are returned.
     * <p><b>400</b> - The request parameters are invalid.
     * <p><b>403</b> - The user is not authorized to perform the operation.
     * <p><b>404</b> - The requested resource could not be found.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @param id ID of the user to delete (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> usersIdGetWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling usersIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/users/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Apply partial updates to a specific user by ID
     * 
     * <p><b>200</b> - The request was successful and the user details are updated.
     * <p><b>400</b> - The request parameters are invalid.
     * <p><b>403</b> - The user is not authorized to perform the operation.
     * <p><b>404</b> - The requested resource could not be found.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @param id ID of the user to update (required)
     * @param usersIdPatchRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void usersIdPatch(Integer id, UsersIdPatchRequest usersIdPatchRequest) throws RestClientException {
        usersIdPatchWithHttpInfo(id, usersIdPatchRequest);
    }

    /**
     * Apply partial updates to a specific user by ID
     * 
     * <p><b>200</b> - The request was successful and the user details are updated.
     * <p><b>400</b> - The request parameters are invalid.
     * <p><b>403</b> - The user is not authorized to perform the operation.
     * <p><b>404</b> - The requested resource could not be found.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @param id ID of the user to update (required)
     * @param usersIdPatchRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> usersIdPatchWithHttpInfo(Integer id, UsersIdPatchRequest usersIdPatchRequest) throws RestClientException {
        Object localVarPostBody = usersIdPatchRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling usersIdPatch");
        }
        
        // verify the required parameter 'usersIdPatchRequest' is set
        if (usersIdPatchRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'usersIdPatchRequest' when calling usersIdPatch");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/users/{id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update the details of a specific user by ID
     * 
     * <p><b>200</b> - The request was successful and the user details are updated.
     * <p><b>400</b> - The request parameters are invalid.
     * <p><b>403</b> - The user is not authorized to perform the operation.
     * <p><b>404</b> - The requested resource could not be found.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @param id ID of the user to update (required)
     * @param usersIdPutRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void usersIdPut(Integer id, UsersIdPutRequest usersIdPutRequest) throws RestClientException {
        usersIdPutWithHttpInfo(id, usersIdPutRequest);
    }

    /**
     * Update the details of a specific user by ID
     * 
     * <p><b>200</b> - The request was successful and the user details are updated.
     * <p><b>400</b> - The request parameters are invalid.
     * <p><b>403</b> - The user is not authorized to perform the operation.
     * <p><b>404</b> - The requested resource could not be found.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @param id ID of the user to update (required)
     * @param usersIdPutRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> usersIdPutWithHttpInfo(Integer id, UsersIdPutRequest usersIdPutRequest) throws RestClientException {
        Object localVarPostBody = usersIdPutRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling usersIdPut");
        }
        
        // verify the required parameter 'usersIdPutRequest' is set
        if (usersIdPutRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'usersIdPutRequest' when calling usersIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/users/{id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a new user
     * 
     * <p><b>100</b> - The server has received the initial part of the request and requires the client to continue with the remainder of the request.
     * <p><b>200</b> - The request was successful and the user was created.
     * <p><b>400</b> - The request body is missing or contains invalid parameters.
     * <p><b>403</b> - The user is not authorized to perform the operation.
     * <p><b>404</b> - The requested resource could not be found.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @param usersPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void usersPost(UsersPostRequest usersPostRequest) throws RestClientException {
        usersPostWithHttpInfo(usersPostRequest);
    }

    /**
     * Create a new user
     * 
     * <p><b>100</b> - The server has received the initial part of the request and requires the client to continue with the remainder of the request.
     * <p><b>200</b> - The request was successful and the user was created.
     * <p><b>400</b> - The request body is missing or contains invalid parameters.
     * <p><b>403</b> - The user is not authorized to perform the operation.
     * <p><b>404</b> - The requested resource could not be found.
     * <p><b>500</b> - An unexpected error occurred on the server.
     * @param usersPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> usersPostWithHttpInfo(UsersPostRequest usersPostRequest) throws RestClientException {
        Object localVarPostBody = usersPostRequest;
        
        // verify the required parameter 'usersPostRequest' is set
        if (usersPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'usersPostRequest' when calling usersPost");
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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/users", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
