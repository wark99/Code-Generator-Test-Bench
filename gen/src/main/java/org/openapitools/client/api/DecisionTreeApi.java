package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CreatedtMetadata201Response;
import org.openapitools.client.model.CreatedtMetadataRequest;
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
public class DecisionTreeApi {
    private ApiClient apiClient;

    public DecisionTreeApi() {
        this(new ApiClient());
    }

    public DecisionTreeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a Decision Tree
     * Create a new Decision Tree within a specific project.
     * <p><b>201</b> - dt created successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project with the specified ID was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project in which to create the dt. (required)
     * @param createdtMetadataRequest  (required)
     * @return CreatedtMetadata201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreatedtMetadata201Response createdtMetadata(String projectId, CreatedtMetadataRequest createdtMetadataRequest) throws RestClientException {
        return createdtMetadataWithHttpInfo(projectId, createdtMetadataRequest).getBody();
    }

    /**
     * Create a Decision Tree
     * Create a new Decision Tree within a specific project.
     * <p><b>201</b> - dt created successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project with the specified ID was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project in which to create the dt. (required)
     * @param createdtMetadataRequest  (required)
     * @return ResponseEntity&lt;CreatedtMetadata201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreatedtMetadata201Response> createdtMetadataWithHttpInfo(String projectId, CreatedtMetadataRequest createdtMetadataRequest) throws RestClientException {
        Object localVarPostBody = createdtMetadataRequest;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling createdtMetadata");
        }
        
        // verify the required parameter 'createdtMetadataRequest' is set
        if (createdtMetadataRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createdtMetadataRequest' when calling createdtMetadata");
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

        ParameterizedTypeReference<CreatedtMetadata201Response> localReturnType = new ParameterizedTypeReference<CreatedtMetadata201Response>() {};
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/skills/dt", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a dt
     * Delete a specific dt within a project.
     * <p><b>204</b> - dt deleted successfully.
     * <p><b>404</b> - Not Found. The project or dt with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the dt. (required)
     * @param dtId The ID of the dt to delete. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteDt(String projectId, String dtId) throws RestClientException {
        deleteDtWithHttpInfo(projectId, dtId);
    }

    /**
     * Delete a dt
     * Delete a specific dt within a project.
     * <p><b>204</b> - dt deleted successfully.
     * <p><b>404</b> - Not Found. The project or dt with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the dt. (required)
     * @param dtId The ID of the dt to delete. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteDtWithHttpInfo(String projectId, String dtId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling deleteDt");
        }
        
        // verify the required parameter 'dtId' is set
        if (dtId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dtId' when calling deleteDt");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("dt_id", dtId);

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
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/dt/{dt_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all  dts for a Project
     * Retrieve a list of choreographs for a specific project.
     * <p><b>201</b> - Successfully retrieved dts for the project. 
     * <p><b>404</b> - Not Found. The project with the specified ID was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project to retrieve choreographs for. (required)
     * @param page The page number for pagination (default: 0).  (optional)
     * @param limit The maximum number of dts to return per page (default: 10).  (optional)
     * @param sortBy Sort by field (default: modifiedOn).  (optional)
     * @param sortOrder Sort order (default: desc).  (optional)
     * @return List&lt;SkillMetadataResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SkillMetadataResponse> getAllDts(String projectId, Integer page, Integer limit, String sortBy, String sortOrder) throws RestClientException {
        return getAllDtsWithHttpInfo(projectId, page, limit, sortBy, sortOrder).getBody();
    }

    /**
     * Get all  dts for a Project
     * Retrieve a list of choreographs for a specific project.
     * <p><b>201</b> - Successfully retrieved dts for the project. 
     * <p><b>404</b> - Not Found. The project with the specified ID was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project to retrieve choreographs for. (required)
     * @param page The page number for pagination (default: 0).  (optional)
     * @param limit The maximum number of dts to return per page (default: 10).  (optional)
     * @param sortBy Sort by field (default: modifiedOn).  (optional)
     * @param sortOrder Sort order (default: desc).  (optional)
     * @return ResponseEntity&lt;List&lt;SkillMetadataResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SkillMetadataResponse>> getAllDtsWithHttpInfo(String projectId, Integer page, Integer limit, String sortBy, String sortOrder) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling getAllDts");
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
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/skills/dt", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get dt Details
     * Retrieve details of a specific dt within a project.
     * <p><b>200</b> - dt details retrieved successfully.
     * <p><b>404</b> - Not Found. The project or dt with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the dt. (required)
     * @param dtId The ID of the dt to retrieve. (required)
     * @return SkillDetails
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SkillDetails getDt(String projectId, String dtId) throws RestClientException {
        return getDtWithHttpInfo(projectId, dtId).getBody();
    }

    /**
     * Get dt Details
     * Retrieve details of a specific dt within a project.
     * <p><b>200</b> - dt details retrieved successfully.
     * <p><b>404</b> - Not Found. The project or dt with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the dt. (required)
     * @param dtId The ID of the dt to retrieve. (required)
     * @return ResponseEntity&lt;SkillDetails&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SkillDetails> getDtWithHttpInfo(String projectId, String dtId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling getDt");
        }
        
        // verify the required parameter 'dtId' is set
        if (dtId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dtId' when calling getDt");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("dt_id", dtId);

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
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/dt/{dt_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Lock a dt
     * Lock a specific dt within a project.
     * <p><b>200</b> - dt locked successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project or dt with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the dt. (required)
     * @param dtId The ID of the dt to lock. (required)
     * @param lockRequest Lock request payload. (required)
     * @return LockResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LockResponse lockDt(String projectId, String dtId, LockRequest lockRequest) throws RestClientException {
        return lockDtWithHttpInfo(projectId, dtId, lockRequest).getBody();
    }

    /**
     * Lock a dt
     * Lock a specific dt within a project.
     * <p><b>200</b> - dt locked successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project or dt with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the dt. (required)
     * @param dtId The ID of the dt to lock. (required)
     * @param lockRequest Lock request payload. (required)
     * @return ResponseEntity&lt;LockResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LockResponse> lockDtWithHttpInfo(String projectId, String dtId, LockRequest lockRequest) throws RestClientException {
        Object localVarPostBody = lockRequest;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling lockDt");
        }
        
        // verify the required parameter 'dtId' is set
        if (dtId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dtId' when calling lockDt");
        }
        
        // verify the required parameter 'lockRequest' is set
        if (lockRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lockRequest' when calling lockDt");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("dt_id", dtId);

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
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/dt/{dt_id}/lock", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a dt
     * Update a specific dt within a project.
     * <p><b>201</b> - dt updated successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project or dt with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the dt. (required)
     * @param dtId The ID of the dt to update. (required)
     * @param action The action to perform (\&quot;draft\&quot; or \&quot;published\&quot;). (required)
     * @param skillDetails Update request payload. (required)
     * @return UpdateOntologyMetadata200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateOntologyMetadata200Response updateDt(String projectId, String dtId, String action, SkillDetails skillDetails) throws RestClientException {
        return updateDtWithHttpInfo(projectId, dtId, action, skillDetails).getBody();
    }

    /**
     * Update a dt
     * Update a specific dt within a project.
     * <p><b>201</b> - dt updated successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project or dt with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the dt. (required)
     * @param dtId The ID of the dt to update. (required)
     * @param action The action to perform (\&quot;draft\&quot; or \&quot;published\&quot;). (required)
     * @param skillDetails Update request payload. (required)
     * @return ResponseEntity&lt;UpdateOntologyMetadata200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UpdateOntologyMetadata200Response> updateDtWithHttpInfo(String projectId, String dtId, String action, SkillDetails skillDetails) throws RestClientException {
        Object localVarPostBody = skillDetails;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling updateDt");
        }
        
        // verify the required parameter 'dtId' is set
        if (dtId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dtId' when calling updateDt");
        }
        
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'action' when calling updateDt");
        }
        
        // verify the required parameter 'skillDetails' is set
        if (skillDetails == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'skillDetails' when calling updateDt");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("dt_id", dtId);
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
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/dt/{dt_id}/{action}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update dt Metadata
     * Update the metadata (name and description) of a specific dt within a project.
     * <p><b>201</b> - dt metadata updated successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project or dt with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the dt. (required)
     * @param dtId The ID of the dt to update. (required)
     * @param createdtMetadataRequest  (required)
     * @return UpdateOntologyMetadata200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateOntologyMetadata200Response updateDtMetadata(String projectId, String dtId, CreatedtMetadataRequest createdtMetadataRequest) throws RestClientException {
        return updateDtMetadataWithHttpInfo(projectId, dtId, createdtMetadataRequest).getBody();
    }

    /**
     * Update dt Metadata
     * Update the metadata (name and description) of a specific dt within a project.
     * <p><b>201</b> - dt metadata updated successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>404</b> - Not Found. The project or dt with the specified IDs was not found.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param projectId The ID of the project containing the dt. (required)
     * @param dtId The ID of the dt to update. (required)
     * @param createdtMetadataRequest  (required)
     * @return ResponseEntity&lt;UpdateOntologyMetadata200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UpdateOntologyMetadata200Response> updateDtMetadataWithHttpInfo(String projectId, String dtId, CreatedtMetadataRequest createdtMetadataRequest) throws RestClientException {
        Object localVarPostBody = createdtMetadataRequest;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling updateDtMetadata");
        }
        
        // verify the required parameter 'dtId' is set
        if (dtId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dtId' when calling updateDtMetadata");
        }
        
        // verify the required parameter 'createdtMetadataRequest' is set
        if (createdtMetadataRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createdtMetadataRequest' when calling updateDtMetadata");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);
        uriVariables.put("dt_id", dtId);

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
        return apiClient.invokeAPI("/api/v1/projects/{project_id}/dt/{dt_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
