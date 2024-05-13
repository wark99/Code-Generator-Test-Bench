package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Library;
import org.openapitools.client.model.ListOntologyNodes400Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:14:21.073249278Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class LibraryItemsApi {
    private ApiClient apiClient;

    public LibraryItemsApi() {
        this(new ApiClient());
    }

    public LibraryItemsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create Library
     * Create a new library.
     * <p><b>201</b> - Library created successfully
     * <p><b>400</b> - Bad Request
     * @param library  (required)
     * @return Library
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Library createLibrary(Library library) throws RestClientException {
        return createLibraryWithHttpInfo(library).getBody();
    }

    /**
     * Create Library
     * Create a new library.
     * <p><b>201</b> - Library created successfully
     * <p><b>400</b> - Bad Request
     * @param library  (required)
     * @return ResponseEntity&lt;Library&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Library> createLibraryWithHttpInfo(Library library) throws RestClientException {
        Object localVarPostBody = library;
        
        // verify the required parameter 'library' is set
        if (library == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'library' when calling createLibrary");
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

        String[] localVarAuthNames = new String[] { "studio_oauth2" };

        ParameterizedTypeReference<Library> localReturnType = new ParameterizedTypeReference<Library>() {};
        return apiClient.invokeAPI("/api/v1/libraries", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a Library
     * Remove an existing library resource.
     * <p><b>201</b> - Library deleted successfully.
     * <p><b>404</b> - Not Found. The library with the specified ID was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param id The ID of the library to delete. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteLibrary(String id) throws RestClientException {
        deleteLibraryWithHttpInfo(id);
    }

    /**
     * Delete a Library
     * Remove an existing library resource.
     * <p><b>201</b> - Library deleted successfully.
     * <p><b>404</b> - Not Found. The library with the specified ID was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param id The ID of the library to delete. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteLibraryWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteLibrary");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "studio_oauth2" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/v1/libraries/{id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Libraries
     * Retrieve a list of libraries with optional filtering and pagination.
     * <p><b>200</b> - Libraries retrieved successfully
     * <p><b>400</b> - Bad Request
     * @param page Page number (optional, default: 1, can&#39;t be negative).  (optional, default to 1)
     * @param limit Number of items per page (optional, default: 10, max: 100).  (optional, default to 10)
     * @param sortBy Field to sort by (optional, default: modifiedOn).  (optional, default to modifiedOn)
     * @param sortOrder Sort order (optional, default: desc).  (optional, default to desc)
     * @return List&lt;Library&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Library> getAllLibraries(Integer page, Integer limit, String sortBy, String sortOrder) throws RestClientException {
        return getAllLibrariesWithHttpInfo(page, limit, sortBy, sortOrder).getBody();
    }

    /**
     * Get Libraries
     * Retrieve a list of libraries with optional filtering and pagination.
     * <p><b>200</b> - Libraries retrieved successfully
     * <p><b>400</b> - Bad Request
     * @param page Page number (optional, default: 1, can&#39;t be negative).  (optional, default to 1)
     * @param limit Number of items per page (optional, default: 10, max: 100).  (optional, default to 10)
     * @param sortBy Field to sort by (optional, default: modifiedOn).  (optional, default to modifiedOn)
     * @param sortOrder Sort order (optional, default: desc).  (optional, default to desc)
     * @return ResponseEntity&lt;List&lt;Library&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Library>> getAllLibrariesWithHttpInfo(Integer page, Integer limit, String sortBy, String sortOrder) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortBy", sortBy));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortOrder", sortOrder));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "studio_oauth2" };

        ParameterizedTypeReference<List<Library>> localReturnType = new ParameterizedTypeReference<List<Library>>() {};
        return apiClient.invokeAPI("/api/v1/libraries", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a Library
     * Update an existing library resource.
     * <p><b>201</b> - Library updated successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The library with the specified ID was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param id The ID of the library to update. (required)
     * @param library Library data to update. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateLibrary(String id, Library library) throws RestClientException {
        updateLibraryWithHttpInfo(id, library);
    }

    /**
     * Update a Library
     * Update an existing library resource.
     * <p><b>201</b> - Library updated successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The library with the specified ID was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param id The ID of the library to update. (required)
     * @param library Library data to update. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateLibraryWithHttpInfo(String id, Library library) throws RestClientException {
        Object localVarPostBody = library;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateLibrary");
        }
        
        // verify the required parameter 'library' is set
        if (library == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'library' when calling updateLibrary");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "studio_oauth2" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/v1/libraries/{id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
