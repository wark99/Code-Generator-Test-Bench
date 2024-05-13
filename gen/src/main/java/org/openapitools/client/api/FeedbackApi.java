package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.FeedbackSchema;

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
public class FeedbackApi {
    private ApiClient apiClient;

    public FeedbackApi() {
        this(new ApiClient());
    }

    public FeedbackApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Import Feedback
     * Import feedback for the project.
     * <p><b>201</b> - Successful Response
     * <p><b>401</b> - Invalid or expired token.
     * @param projectId Id of the project to import feedback. (required)
     * @param feedbackSchema  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object importFeedbackProjectsProjectIdFeedbackPost(String projectId, List<FeedbackSchema> feedbackSchema) throws RestClientException {
        return importFeedbackProjectsProjectIdFeedbackPostWithHttpInfo(projectId, feedbackSchema).getBody();
    }

    /**
     * Import Feedback
     * Import feedback for the project.
     * <p><b>201</b> - Successful Response
     * <p><b>401</b> - Invalid or expired token.
     * @param projectId Id of the project to import feedback. (required)
     * @param feedbackSchema  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> importFeedbackProjectsProjectIdFeedbackPostWithHttpInfo(String projectId, List<FeedbackSchema> feedbackSchema) throws RestClientException {
        Object localVarPostBody = feedbackSchema;
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling importFeedbackProjectsProjectIdFeedbackPost");
        }
        
        // verify the required parameter 'feedbackSchema' is set
        if (feedbackSchema == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'feedbackSchema' when calling importFeedbackProjectsProjectIdFeedbackPost");
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

        String[] localVarAuthNames = new String[] { "HTTPBearer" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/projects/{project_id}/feedback", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
