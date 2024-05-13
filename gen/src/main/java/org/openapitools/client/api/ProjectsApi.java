package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CreateProjectSchema;
import org.openapitools.client.model.ProjectSchema;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:25.807394581Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * Create Project
     * Create a project.
     * <p><b>201</b> - Successful Response
     * <p><b>401</b> - Invalid or expired token.
     * @param createProjectSchema  (required)
     * @return ProjectSchema
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectSchema createProjectProjectsPost(CreateProjectSchema createProjectSchema) throws RestClientException {
        return createProjectProjectsPostWithHttpInfo(createProjectSchema).getBody();
    }

    /**
     * Create Project
     * Create a project.
     * <p><b>201</b> - Successful Response
     * <p><b>401</b> - Invalid or expired token.
     * @param createProjectSchema  (required)
     * @return ResponseEntity&lt;ProjectSchema&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProjectSchema> createProjectProjectsPostWithHttpInfo(CreateProjectSchema createProjectSchema) throws RestClientException {
        Object localVarPostBody = createProjectSchema;
        
        // verify the required parameter 'createProjectSchema' is set
        if (createProjectSchema == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createProjectSchema' when calling createProjectProjectsPost");
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

        String[] localVarAuthNames = new String[] { "HTTPBearer" };

        ParameterizedTypeReference<ProjectSchema> localReturnType = new ParameterizedTypeReference<ProjectSchema>() {};
        return apiClient.invokeAPI("/projects", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
