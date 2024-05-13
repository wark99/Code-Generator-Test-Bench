package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CreateIGMetadata201Response;
import org.openapitools.client.model.CreateIGMetadataRequest;
import org.openapitools.client.model.LockRequest;
import org.openapitools.client.model.LockResponse;
import org.openapitools.client.model.SkillDetails;
import org.openapitools.client.model.SkillMetadataResponse;
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
public class InferenceGraphApi {
    private ApiClient apiClient;

    public InferenceGraphApi() {
        this(new ApiClient());
    }

    public InferenceGraphApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a Inference Graph
     * Create a new Inference Graph within a specific project.
     * <p><b>201</b> - Inference Graph created successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project with the specified ID was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project in which to create the Inference Graph. (required)
     * @param createIGMetadataRequest  (required)
     * @return CreateIGMetadata201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateIGMetadata201Response createIGMetadata(String projectId, CreateIGMetadataRequest createIGMetadataRequest) throws RestClientException {
        return createIGMetadataWithHttpInfo(projectId, createIGMetadataRequest).getBody();
    }

    /**
     * Create a Inference Graph
     * Create a new Inference Graph within a specific project.
     * <p><b>201</b> - Inference Graph created successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project with the specified ID was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project in which to create the Inference Graph. (required)
     * @param createIGMetadataRequest  (required)
     * @return ResponseEntity&lt;CreateIGMetadata201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateIGMetadata201Response> createIGMetadataWithHttpInfo(String projectId, CreateIGMetadataRequest createIGMetadataRequest) throws RestClientException {
        Object localVarPostBody = createIGMetadataRequest;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling createIGMetadata");
        }
        
        // verify the required parameter 'createIGMetadataRequest' is set
        if (createIGMetadataRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createIGMetadataRequest' when calling createIGMetadata");
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

        ParameterizedTypeReference<CreateIGMetadata201Response> localReturnType = new ParameterizedTypeReference<CreateIGMetadata201Response>() {};
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/skills/ig", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a Inference Graph
     * Delete a specific Inference Graph within a project.
     * <p><b>201</b> - Inference Graph deleted successfully.
     * <p><b>404</b> - Not Found. The project or Inference Graph with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the Inference Graph. (required)
     * @param igId The ID of the Inference Graph to delete. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteIg(String projectId, String igId) throws RestClientException {
        deleteIgWithHttpInfo(projectId, igId);
    }

    /**
     * Delete a Inference Graph
     * Delete a specific Inference Graph within a project.
     * <p><b>201</b> - Inference Graph deleted successfully.
     * <p><b>404</b> - Not Found. The project or Inference Graph with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the Inference Graph. (required)
     * @param igId The ID of the Inference Graph to delete. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteIgWithHttpInfo(String projectId, String igId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling deleteIg");
        }
        
        // verify the required parameter 'igId' is set
        if (igId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'igId' when calling deleteIg");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("ig_id", igId);

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
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/ig/{ig_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all ig&#39;s for a Project
     * Retrieve a list of Inference Graph for a specific project.
     * <p><b>201</b> - Successfully retrieved igs for the project. 
     * <p><b>404</b> - Not Found. The project with the specified ID was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project to retrieve Inference Graph for. (required)
     * @param page The page number for pagination (default: 0).  (optional)
     * @param limit The maximum number of dts to return per page (default: 10).  (optional)
     * @param sortBy Sort by field (default: modifiedOn).  (optional)
     * @param sortOrder Sort order (default: desc).  (optional)
     * @return List&lt;SkillMetadataResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SkillMetadataResponse> getAllIgs(String projectId, Integer page, Integer limit, String sortBy, String sortOrder) throws RestClientException {
        return getAllIgsWithHttpInfo(projectId, page, limit, sortBy, sortOrder).getBody();
    }

    /**
     * Get all ig&#39;s for a Project
     * Retrieve a list of Inference Graph for a specific project.
     * <p><b>201</b> - Successfully retrieved igs for the project. 
     * <p><b>404</b> - Not Found. The project with the specified ID was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project to retrieve Inference Graph for. (required)
     * @param page The page number for pagination (default: 0).  (optional)
     * @param limit The maximum number of dts to return per page (default: 10).  (optional)
     * @param sortBy Sort by field (default: modifiedOn).  (optional)
     * @param sortOrder Sort order (default: desc).  (optional)
     * @return ResponseEntity&lt;List&lt;SkillMetadataResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SkillMetadataResponse>> getAllIgsWithHttpInfo(String projectId, Integer page, Integer limit, String sortBy, String sortOrder) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling getAllIgs");
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

        ParameterizedTypeReference<List<SkillMetadataResponse>> localReturnType = new ParameterizedTypeReference<List<SkillMetadataResponse>>() {};
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/skills/ig", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Inference Graph Details
     * Retrieve details of a specific Inference Graph within a project.
     * <p><b>201</b> - Inference Graph details retrieved successfully.
     * <p><b>404</b> - Not Found. The project or Inference Graph with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the Inference Graph. (required)
     * @param igId The ID of the Inference Graph to retrieve. (required)
     * @return SkillDetails
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SkillDetails getIg(String projectId, String igId) throws RestClientException {
        return getIgWithHttpInfo(projectId, igId).getBody();
    }

    /**
     * Get Inference Graph Details
     * Retrieve details of a specific Inference Graph within a project.
     * <p><b>201</b> - Inference Graph details retrieved successfully.
     * <p><b>404</b> - Not Found. The project or Inference Graph with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the Inference Graph. (required)
     * @param igId The ID of the Inference Graph to retrieve. (required)
     * @return ResponseEntity&lt;SkillDetails&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SkillDetails> getIgWithHttpInfo(String projectId, String igId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling getIg");
        }
        
        // verify the required parameter 'igId' is set
        if (igId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'igId' when calling getIg");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("ig_id", igId);

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

        ParameterizedTypeReference<SkillDetails> localReturnType = new ParameterizedTypeReference<SkillDetails>() {};
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/ig/{ig_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Lock a Inference Graph
     * Lock a specific Inference Graph within a project.
     * <p><b>200</b> - Inference Graph locked successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project or Inference Graph with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the Inference Graph. (required)
     * @param igId The ID of the Inference Graph to lock. (required)
     * @param lockRequest Lock request payload. (required)
     * @return LockResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LockResponse lockIg(String projectId, String igId, LockRequest lockRequest) throws RestClientException {
        return lockIgWithHttpInfo(projectId, igId, lockRequest).getBody();
    }

    /**
     * Lock a Inference Graph
     * Lock a specific Inference Graph within a project.
     * <p><b>200</b> - Inference Graph locked successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project or Inference Graph with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the Inference Graph. (required)
     * @param igId The ID of the Inference Graph to lock. (required)
     * @param lockRequest Lock request payload. (required)
     * @return ResponseEntity&lt;LockResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LockResponse> lockIgWithHttpInfo(String projectId, String igId, LockRequest lockRequest) throws RestClientException {
        Object localVarPostBody = lockRequest;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling lockIg");
        }
        
        // verify the required parameter 'igId' is set
        if (igId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'igId' when calling lockIg");
        }
        
        // verify the required parameter 'lockRequest' is set
        if (lockRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lockRequest' when calling lockIg");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("ig_id", igId);

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
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/ig/{ig_id}/lock", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Inference Graph Metadata
     * Update the metadata (name and description) of a specific Inference Graph within a project.
     * <p><b>201</b> - Inference Graph metadata updated successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project or Inference Graph with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the Inference Graph. (required)
     * @param igId The ID of the Inference Graph to update. (required)
     * @param createIGMetadataRequest  (required)
     * @return UpdateOntologyMetadata200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateOntologyMetadata200Response updateIGMetadata(String projectId, String igId, CreateIGMetadataRequest createIGMetadataRequest) throws RestClientException {
        return updateIGMetadataWithHttpInfo(projectId, igId, createIGMetadataRequest).getBody();
    }

    /**
     * Update Inference Graph Metadata
     * Update the metadata (name and description) of a specific Inference Graph within a project.
     * <p><b>201</b> - Inference Graph metadata updated successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project or Inference Graph with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the Inference Graph. (required)
     * @param igId The ID of the Inference Graph to update. (required)
     * @param createIGMetadataRequest  (required)
     * @return ResponseEntity&lt;UpdateOntologyMetadata200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UpdateOntologyMetadata200Response> updateIGMetadataWithHttpInfo(String projectId, String igId, CreateIGMetadataRequest createIGMetadataRequest) throws RestClientException {
        Object localVarPostBody = createIGMetadataRequest;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling updateIGMetadata");
        }
        
        // verify the required parameter 'igId' is set
        if (igId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'igId' when calling updateIGMetadata");
        }
        
        // verify the required parameter 'createIGMetadataRequest' is set
        if (createIGMetadataRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createIGMetadataRequest' when calling updateIGMetadata");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("ig_id", igId);

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
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/ig/{ig_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a Inference Graph
     * Update a specific Inference Graph within a project.
     * <p><b>201</b> - Inference Graph updated successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project or Inference Graph with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the Inference Graph. (required)
     * @param igId The ID of the Inference Graph to update. (required)
     * @param action The action to perform (\&quot;draft\&quot; or \&quot;published\&quot;). (required)
     * @param skillDetails Update request payload. (required)
     * @return UpdateOntologyMetadata200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateOntologyMetadata200Response updateIg(String projectId, String igId, String action, SkillDetails skillDetails) throws RestClientException {
        return updateIgWithHttpInfo(projectId, igId, action, skillDetails).getBody();
    }

    /**
     * Update a Inference Graph
     * Update a specific Inference Graph within a project.
     * <p><b>201</b> - Inference Graph updated successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project or Inference Graph with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the Inference Graph. (required)
     * @param igId The ID of the Inference Graph to update. (required)
     * @param action The action to perform (\&quot;draft\&quot; or \&quot;published\&quot;). (required)
     * @param skillDetails Update request payload. (required)
     * @return ResponseEntity&lt;UpdateOntologyMetadata200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UpdateOntologyMetadata200Response> updateIgWithHttpInfo(String projectId, String igId, String action, SkillDetails skillDetails) throws RestClientException {
        Object localVarPostBody = skillDetails;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling updateIg");
        }
        
        // verify the required parameter 'igId' is set
        if (igId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'igId' when calling updateIg");
        }
        
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'action' when calling updateIg");
        }
        
        // verify the required parameter 'skillDetails' is set
        if (skillDetails == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'skillDetails' when calling updateIg");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("ig_id", igId);
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
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/ig/{ig_id}/{action}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
