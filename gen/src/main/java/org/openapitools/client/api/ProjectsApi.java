package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AddProject200Response;
import org.openapitools.client.model.AddProjectRequest;
import org.openapitools.client.model.FindPetsByStatus200Response;
import org.openapitools.client.model.UpdateProject200Response;
import org.openapitools.client.model.UpdateProjectRequest;

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
public class ProjectsApi {
    private ApiClient apiClient;

    public ProjectsApi() {
        this(new ApiClient());
    }

    public ProjectsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new project
     * Add a new project
     * <p><b>200</b> - Project created successfully
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal Server Error
     * @param addProjectRequest Project details (required)
     * @return AddProject200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AddProject200Response addProject(AddProjectRequest addProjectRequest) throws RestClientException {
        return addProjectWithHttpInfo(addProjectRequest).getBody();
    }

    /**
     * Create a new project
     * Add a new project
     * <p><b>200</b> - Project created successfully
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal Server Error
     * @param addProjectRequest Project details (required)
     * @return ResponseEntity&lt;AddProject200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AddProject200Response> addProjectWithHttpInfo(AddProjectRequest addProjectRequest) throws RestClientException {
        Object localVarPostBody = addProjectRequest;
        
        // verify the required parameter 'addProjectRequest' is set
        if (addProjectRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addProjectRequest' when calling addProject");
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

        ParameterizedTypeReference<AddProject200Response> localReturnType = new ParameterizedTypeReference<AddProject200Response>() {};
        return apiClient.invokeAPI("/api/v1/projects", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a project
     * Delete a project by its unique ID.
     * <p><b>200</b> - Project deleted successfully
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Project not found
     * <p><b>500</b> - Internal Server Error
     * @param projectId ID of the project to delete (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteProject(String projectId) throws RestClientException {
        deleteProjectWithHttpInfo(projectId);
    }

    /**
     * Delete a project
     * Delete a project by its unique ID.
     * <p><b>200</b> - Project deleted successfully
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Project not found
     * <p><b>500</b> - Internal Server Error
     * @param projectId ID of the project to delete (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteProjectWithHttpInfo(String projectId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling deleteProject");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("projectId", projectId);

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
        return apiClient.invokeAPI("/api/v1/projects/{projectId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * list all the projects in the tenant
     * Multiple status values can be provided with comma separated strings
     * <p><b>200</b> - A list of projects
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal Server Error
     * @param page Page number (e.g., 0) (optional)
     * @param limit Number of items per page (e.g., 10) (optional)
     * @param sortBy Field to sort by (e.g., modifiedOn) (optional)
     * @param sortOrder Sort order (e.g., desc) (optional)
     * @return FindPetsByStatus200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FindPetsByStatus200Response findPetsByStatus(Integer page, Integer limit, String sortBy, String sortOrder) throws RestClientException {
        return findPetsByStatusWithHttpInfo(page, limit, sortBy, sortOrder).getBody();
    }

    /**
     * list all the projects in the tenant
     * Multiple status values can be provided with comma separated strings
     * <p><b>200</b> - A list of projects
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>500</b> - Internal Server Error
     * @param page Page number (e.g., 0) (optional)
     * @param limit Number of items per page (e.g., 10) (optional)
     * @param sortBy Field to sort by (e.g., modifiedOn) (optional)
     * @param sortOrder Sort order (e.g., desc) (optional)
     * @return ResponseEntity&lt;FindPetsByStatus200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FindPetsByStatus200Response> findPetsByStatusWithHttpInfo(Integer page, Integer limit, String sortBy, String sortOrder) throws RestClientException {
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

        ParameterizedTypeReference<FindPetsByStatus200Response> localReturnType = new ParameterizedTypeReference<FindPetsByStatus200Response>() {};
        return apiClient.invokeAPI("/api/v1/projects", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a project
     * Update specific fields of an existing project.
     * <p><b>200</b> - Project updated successfully
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Project not found
     * <p><b>500</b> - Internal Server Error
     * @param projectId ID of the project to update (required)
     * @param updateProjectRequest Fields to update (required)
     * @return UpdateProject200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateProject200Response updateProject(String projectId, UpdateProjectRequest updateProjectRequest) throws RestClientException {
        return updateProjectWithHttpInfo(projectId, updateProjectRequest).getBody();
    }

    /**
     * Update a project
     * Update specific fields of an existing project.
     * <p><b>200</b> - Project updated successfully
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Project not found
     * <p><b>500</b> - Internal Server Error
     * @param projectId ID of the project to update (required)
     * @param updateProjectRequest Fields to update (required)
     * @return ResponseEntity&lt;UpdateProject200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UpdateProject200Response> updateProjectWithHttpInfo(String projectId, UpdateProjectRequest updateProjectRequest) throws RestClientException {
        Object localVarPostBody = updateProjectRequest;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling updateProject");
        }
        
        // verify the required parameter 'updateProjectRequest' is set
        if (updateProjectRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateProjectRequest' when calling updateProject");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("projectId", projectId);

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

        ParameterizedTypeReference<UpdateProject200Response> localReturnType = new ParameterizedTypeReference<UpdateProject200Response>() {};
        return apiClient.invokeAPI("/api/v1/projects/{projectId}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
