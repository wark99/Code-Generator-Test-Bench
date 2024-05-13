package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GetStudentStages200Response;
import org.openapitools.client.model.GetStudents200Response;
import org.openapitools.client.model.PatchStudentRequest;
import org.openapitools.client.model.PostStudent201Response;
import org.openapitools.client.model.PostStudentRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:35.686627593Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class StudentsApi {
    private ApiClient apiClient;

    public StudentsApi() {
        this(new ApiClient());
    }

    public StudentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a student
     * Retrieve the family member.
     * <p><b>200</b> - Returns a Student object.
     * <p><b>403</b> - Forbidden.
     * <p><b>404</b> - Student not found.
     * @param studentId  (required)
     * @return PostStudent201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostStudent201Response getStudent(String studentId) throws RestClientException {
        return getStudentWithHttpInfo(studentId).getBody();
    }

    /**
     * Get a student
     * Retrieve the family member.
     * <p><b>200</b> - Returns a Student object.
     * <p><b>403</b> - Forbidden.
     * <p><b>404</b> - Student not found.
     * @param studentId  (required)
     * @return ResponseEntity&lt;PostStudent201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostStudent201Response> getStudentWithHttpInfo(String studentId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'studentId' is set
        if (studentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'studentId' when calling getStudent");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("studentId", studentId);

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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<PostStudent201Response> localReturnType = new ParameterizedTypeReference<PostStudent201Response>() {};
        return apiClient.invokeAPI("/students/{studentId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List student stages
     * Retrieve a list of the family members stages.
     * <p><b>200</b> - Return a list of StudentStage objects.
     * <p><b>403</b> - Forbidden.
     * <p><b>404</b> - Student not found.
     * @param studentId  (required)
     * @return GetStudentStages200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetStudentStages200Response getStudentStages(String studentId) throws RestClientException {
        return getStudentStagesWithHttpInfo(studentId).getBody();
    }

    /**
     * List student stages
     * Retrieve a list of the family members stages.
     * <p><b>200</b> - Return a list of StudentStage objects.
     * <p><b>403</b> - Forbidden.
     * <p><b>404</b> - Student not found.
     * @param studentId  (required)
     * @return ResponseEntity&lt;GetStudentStages200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetStudentStages200Response> getStudentStagesWithHttpInfo(String studentId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'studentId' is set
        if (studentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'studentId' when calling getStudentStages");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("studentId", studentId);

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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<GetStudentStages200Response> localReturnType = new ParameterizedTypeReference<GetStudentStages200Response>() {};
        return apiClient.invokeAPI("/students/{studentId}/stages", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List students
     * Retrieve a list of family members.
     * <p><b>200</b> - Returns a list of Student objects.  When the class filter is provided, the list contains only students who qualify the class based on age.
     * @param filterClass ID of the class (optional)
     * @return GetStudents200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetStudents200Response getStudents(Integer filterClass) throws RestClientException {
        return getStudentsWithHttpInfo(filterClass).getBody();
    }

    /**
     * List students
     * Retrieve a list of family members.
     * <p><b>200</b> - Returns a list of Student objects.  When the class filter is provided, the list contains only students who qualify the class based on age.
     * @param filterClass ID of the class (optional)
     * @return ResponseEntity&lt;GetStudents200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetStudents200Response> getStudentsWithHttpInfo(Integer filterClass) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[class]", filterClass));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<GetStudents200Response> localReturnType = new ParameterizedTypeReference<GetStudents200Response>() {};
        return apiClient.invokeAPI("/students", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a student
     * Update the family member.
     * <p><b>200</b> - Returns a Student object.
     * <p><b>403</b> - Forbidden.
     * <p><b>404</b> - Student not found.
     * @param studentId  (required)
     * @param patchStudentRequest Updates the family member. (optional)
     * @return PostStudent201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostStudent201Response patchStudent(String studentId, PatchStudentRequest patchStudentRequest) throws RestClientException {
        return patchStudentWithHttpInfo(studentId, patchStudentRequest).getBody();
    }

    /**
     * Update a student
     * Update the family member.
     * <p><b>200</b> - Returns a Student object.
     * <p><b>403</b> - Forbidden.
     * <p><b>404</b> - Student not found.
     * @param studentId  (required)
     * @param patchStudentRequest Updates the family member. (optional)
     * @return ResponseEntity&lt;PostStudent201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostStudent201Response> patchStudentWithHttpInfo(String studentId, PatchStudentRequest patchStudentRequest) throws RestClientException {
        Object localVarPostBody = patchStudentRequest;
        
        // verify the required parameter 'studentId' is set
        if (studentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'studentId' when calling patchStudent");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("studentId", studentId);

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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<PostStudent201Response> localReturnType = new ParameterizedTypeReference<PostStudent201Response>() {};
        return apiClient.invokeAPI("/students/{studentId}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a student
     * Create a new family member.
     * <p><b>201</b> - Student created.
     * @param postStudentRequest Creates a new family member. (optional)
     * @return PostStudent201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostStudent201Response postStudent(PostStudentRequest postStudentRequest) throws RestClientException {
        return postStudentWithHttpInfo(postStudentRequest).getBody();
    }

    /**
     * Create a student
     * Create a new family member.
     * <p><b>201</b> - Student created.
     * @param postStudentRequest Creates a new family member. (optional)
     * @return ResponseEntity&lt;PostStudent201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostStudent201Response> postStudentWithHttpInfo(PostStudentRequest postStudentRequest) throws RestClientException {
        Object localVarPostBody = postStudentRequest;
        

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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<PostStudent201Response> localReturnType = new ParameterizedTypeReference<PostStudent201Response>() {};
        return apiClient.invokeAPI("/students", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
