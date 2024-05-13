package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Choreograph;
import org.openapitools.client.model.ChoreographDetails;
import org.openapitools.client.model.ChoreographUpdate;
import org.openapitools.client.model.CreateChoreograpghMetadata201Response;
import org.openapitools.client.model.CreateChoreograpghMetadataRequest;
import org.openapitools.client.model.LockRequest;
import org.openapitools.client.model.LockResponse;
import org.openapitools.client.model.UpdateOntologyMetadata200Response;

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
public class ChoreographApi {
    private ApiClient apiClient;

    public ChoreographApi() {
        this(new ApiClient());
    }

    public ChoreographApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a Choreograph
     * Create a new choreograph within a specific project.
     * <p><b>201</b> - Choreograph created successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project with the specified ID was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project in which to create the choreograph. (required)
     * @param createChoreograpghMetadataRequest  (required)
     * @return CreateChoreograpghMetadata201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateChoreograpghMetadata201Response createChoreograpghMetadata(String projectId, CreateChoreograpghMetadataRequest createChoreograpghMetadataRequest) throws RestClientException {
        return createChoreograpghMetadataWithHttpInfo(projectId, createChoreograpghMetadataRequest).getBody();
    }

    /**
     * Create a Choreograph
     * Create a new choreograph within a specific project.
     * <p><b>201</b> - Choreograph created successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project with the specified ID was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project in which to create the choreograph. (required)
     * @param createChoreograpghMetadataRequest  (required)
     * @return ResponseEntity&lt;CreateChoreograpghMetadata201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateChoreograpghMetadata201Response> createChoreograpghMetadataWithHttpInfo(String projectId, CreateChoreograpghMetadataRequest createChoreograpghMetadataRequest) throws RestClientException {
        Object localVarPostBody = createChoreograpghMetadataRequest;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling createChoreograpghMetadata");
        }
        
        // verify the required parameter 'createChoreograpghMetadataRequest' is set
        if (createChoreograpghMetadataRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createChoreograpghMetadataRequest' when calling createChoreograpghMetadata");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);

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

        ParameterizedTypeReference<CreateChoreograpghMetadata201Response> localReturnType = new ParameterizedTypeReference<CreateChoreograpghMetadata201Response>() {};
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/choreographs", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a Choreograph
     * Delete a specific choreograph within a project.
     * <p><b>204</b> - Choreograph deleted successfully.
     * <p><b>404</b> - Not Found. The project or choreograph with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the choreograph. (required)
     * @param choreographId The ID of the choreograph to delete. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteChoreograph(String projectId, String choreographId) throws RestClientException {
        deleteChoreographWithHttpInfo(projectId, choreographId);
    }

    /**
     * Delete a Choreograph
     * Delete a specific choreograph within a project.
     * <p><b>204</b> - Choreograph deleted successfully.
     * <p><b>404</b> - Not Found. The project or choreograph with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the choreograph. (required)
     * @param choreographId The ID of the choreograph to delete. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteChoreographWithHttpInfo(String projectId, String choreographId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling deleteChoreograph");
        }
        
        // verify the required parameter 'choreographId' is set
        if (choreographId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'choreographId' when calling deleteChoreograph");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("choreograph_id", choreographId);

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
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/choreographs/{choreograph_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all  Choreographs for a Project
     * Retrieve a list of choreographs for a specific project.
     * <p><b>201</b> - Successfully retrieved choreographs for the project. 
     * <p><b>404</b> - Not Found. The project with the specified ID was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project to retrieve choreographs for. (required)
     * @param page The page number for pagination (default: 0).  (optional)
     * @param limit The maximum number of choreographs to return per page (default: 10).  (optional)
     * @param sortBy Sort by field (default: modifiedOn).  (optional)
     * @param sortOrder Sort order (default: desc).  (optional)
     * @return List&lt;Choreograph&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Choreograph> getAllChoreographs(String projectId, Integer page, Integer limit, String sortBy, String sortOrder) throws RestClientException {
        return getAllChoreographsWithHttpInfo(projectId, page, limit, sortBy, sortOrder).getBody();
    }

    /**
     * Get all  Choreographs for a Project
     * Retrieve a list of choreographs for a specific project.
     * <p><b>201</b> - Successfully retrieved choreographs for the project. 
     * <p><b>404</b> - Not Found. The project with the specified ID was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project to retrieve choreographs for. (required)
     * @param page The page number for pagination (default: 0).  (optional)
     * @param limit The maximum number of choreographs to return per page (default: 10).  (optional)
     * @param sortBy Sort by field (default: modifiedOn).  (optional)
     * @param sortOrder Sort order (default: desc).  (optional)
     * @return ResponseEntity&lt;List&lt;Choreograph&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Choreograph>> getAllChoreographsWithHttpInfo(String projectId, Integer page, Integer limit, String sortBy, String sortOrder) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling getAllChoreographs");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);

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

        ParameterizedTypeReference<List<Choreograph>> localReturnType = new ParameterizedTypeReference<List<Choreograph>>() {};
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/choreographs", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Choreograph Details
     * Retrieve details of a specific choreograph within a project.
     * <p><b>200</b> - Choreograph details retrieved successfully.
     * <p><b>404</b> - Not Found. The project or choreograph with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the choreograph. (required)
     * @param choreographId The ID of the choreograph to retrieve. (required)
     * @return ChoreographDetails
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ChoreographDetails getChoreograph(String projectId, String choreographId) throws RestClientException {
        return getChoreographWithHttpInfo(projectId, choreographId).getBody();
    }

    /**
     * Get Choreograph Details
     * Retrieve details of a specific choreograph within a project.
     * <p><b>200</b> - Choreograph details retrieved successfully.
     * <p><b>404</b> - Not Found. The project or choreograph with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the choreograph. (required)
     * @param choreographId The ID of the choreograph to retrieve. (required)
     * @return ResponseEntity&lt;ChoreographDetails&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ChoreographDetails> getChoreographWithHttpInfo(String projectId, String choreographId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling getChoreograph");
        }
        
        // verify the required parameter 'choreographId' is set
        if (choreographId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'choreographId' when calling getChoreograph");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("choreograph_id", choreographId);

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

        String[] localVarAuthNames = new String[] { "studio_oauth2" };

        ParameterizedTypeReference<ChoreographDetails> localReturnType = new ParameterizedTypeReference<ChoreographDetails>() {};
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/choreographs/{choreograph_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Lock a Choreograph
     * Lock a specific choreograph within a project.
     * <p><b>200</b> - Choreograph locked successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project or choreograph with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the choreograph. (required)
     * @param choreographId The ID of the choreograph to lock. (required)
     * @param lockRequest Lock request payload. (required)
     * @return LockResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LockResponse lockChoreograph(String projectId, String choreographId, LockRequest lockRequest) throws RestClientException {
        return lockChoreographWithHttpInfo(projectId, choreographId, lockRequest).getBody();
    }

    /**
     * Lock a Choreograph
     * Lock a specific choreograph within a project.
     * <p><b>200</b> - Choreograph locked successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project or choreograph with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the choreograph. (required)
     * @param choreographId The ID of the choreograph to lock. (required)
     * @param lockRequest Lock request payload. (required)
     * @return ResponseEntity&lt;LockResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LockResponse> lockChoreographWithHttpInfo(String projectId, String choreographId, LockRequest lockRequest) throws RestClientException {
        Object localVarPostBody = lockRequest;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling lockChoreograph");
        }
        
        // verify the required parameter 'choreographId' is set
        if (choreographId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'choreographId' when calling lockChoreograph");
        }
        
        // verify the required parameter 'lockRequest' is set
        if (lockRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lockRequest' when calling lockChoreograph");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("choreograph_id", choreographId);

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

        ParameterizedTypeReference<LockResponse> localReturnType = new ParameterizedTypeReference<LockResponse>() {};
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/choreographs/{choreograph_id}/lock", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a Choreograph
     * Update a specific choreograph within a project.
     * <p><b>201</b> - Choreograph updated successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project or choreograph with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the choreograph. (required)
     * @param choreographId The ID of the choreograph to update. (required)
     * @param action The action to perform (\&quot;draft\&quot; or \&quot;published\&quot;). (required)
     * @param choreographUpdate Update request payload. (required)
     * @return UpdateOntologyMetadata200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateOntologyMetadata200Response updateChoreograph(String projectId, String choreographId, String action, ChoreographUpdate choreographUpdate) throws RestClientException {
        return updateChoreographWithHttpInfo(projectId, choreographId, action, choreographUpdate).getBody();
    }

    /**
     * Update a Choreograph
     * Update a specific choreograph within a project.
     * <p><b>201</b> - Choreograph updated successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project or choreograph with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the choreograph. (required)
     * @param choreographId The ID of the choreograph to update. (required)
     * @param action The action to perform (\&quot;draft\&quot; or \&quot;published\&quot;). (required)
     * @param choreographUpdate Update request payload. (required)
     * @return ResponseEntity&lt;UpdateOntologyMetadata200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UpdateOntologyMetadata200Response> updateChoreographWithHttpInfo(String projectId, String choreographId, String action, ChoreographUpdate choreographUpdate) throws RestClientException {
        Object localVarPostBody = choreographUpdate;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling updateChoreograph");
        }
        
        // verify the required parameter 'choreographId' is set
        if (choreographId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'choreographId' when calling updateChoreograph");
        }
        
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'action' when calling updateChoreograph");
        }
        
        // verify the required parameter 'choreographUpdate' is set
        if (choreographUpdate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'choreographUpdate' when calling updateChoreograph");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("choreograph_id", choreographId);
        uriVariables.put("action", action);

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

        ParameterizedTypeReference<UpdateOntologyMetadata200Response> localReturnType = new ParameterizedTypeReference<UpdateOntologyMetadata200Response>() {};
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/choreographs/{choreograph_id}/{action}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Choreograph Metadata
     * Update the metadata (name and description) of a specific choreograph within a project.
     * <p><b>201</b> - Choreograph metadata updated successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project or choreograph with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the choreograph. (required)
     * @param choreographId The ID of the choreograph to update. (required)
     * @param createChoreograpghMetadataRequest  (required)
     * @return UpdateOntologyMetadata200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateOntologyMetadata200Response updateChoreographMetadata(String projectId, String choreographId, CreateChoreograpghMetadataRequest createChoreograpghMetadataRequest) throws RestClientException {
        return updateChoreographMetadataWithHttpInfo(projectId, choreographId, createChoreograpghMetadataRequest).getBody();
    }

    /**
     * Update Choreograph Metadata
     * Update the metadata (name and description) of a specific choreograph within a project.
     * <p><b>201</b> - Choreograph metadata updated successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project or choreograph with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the choreograph. (required)
     * @param choreographId The ID of the choreograph to update. (required)
     * @param createChoreograpghMetadataRequest  (required)
     * @return ResponseEntity&lt;UpdateOntologyMetadata200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UpdateOntologyMetadata200Response> updateChoreographMetadataWithHttpInfo(String projectId, String choreographId, CreateChoreograpghMetadataRequest createChoreograpghMetadataRequest) throws RestClientException {
        Object localVarPostBody = createChoreograpghMetadataRequest;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling updateChoreographMetadata");
        }
        
        // verify the required parameter 'choreographId' is set
        if (choreographId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'choreographId' when calling updateChoreographMetadata");
        }
        
        // verify the required parameter 'createChoreograpghMetadataRequest' is set
        if (createChoreograpghMetadataRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createChoreograpghMetadataRequest' when calling updateChoreographMetadata");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("choreograph_id", choreographId);

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

        ParameterizedTypeReference<UpdateOntologyMetadata200Response> localReturnType = new ParameterizedTypeReference<UpdateOntologyMetadata200Response>() {};
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/choreographs/{choreograph_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
