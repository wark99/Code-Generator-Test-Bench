package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AddActionScheme;
import org.openapitools.client.model.AddProcessScheme;
import org.openapitools.client.model.CommonError;
import org.openapitools.client.model.CreateTaskTimeScheme;
import org.openapitools.client.model.HTTPValidationError;
import org.openapitools.client.model.PageTaskTimeScheme;
import org.openapitools.client.model.ProcessActionBaseScheme;
import org.openapitools.client.model.ProcessScheme;
import org.openapitools.client.model.Status;
import org.openapitools.client.model.TaskTimeBaseScheme;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:05.417254227Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TasksApi {
    private ApiClient apiClient;

    public TasksApi() {
        this(new ApiClient());
    }

    public TasksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add action
     * Add action
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param procId  (required)
     * @param addActionScheme  (required)
     * @return ProcessActionBaseScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ProcessActionBaseScheme createProcessAction(Integer procId, AddActionScheme addActionScheme) throws RestClientException {
        return createProcessActionWithHttpInfo(procId, addActionScheme).getBody();
    }

    /**
     * Add action
     * Add action
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param procId  (required)
     * @param addActionScheme  (required)
     * @return ResponseEntity&lt;ProcessActionBaseScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<ProcessActionBaseScheme> createProcessActionWithHttpInfo(Integer procId, AddActionScheme addActionScheme) throws RestClientException {
        Object localVarPostBody = addActionScheme;
        
        // verify the required parameter 'procId' is set
        if (procId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'procId' when calling createProcessAction");
        }
        
        // verify the required parameter 'addActionScheme' is set
        if (addActionScheme == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addActionScheme' when calling createProcessAction");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("proc_id", procId);

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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<ProcessActionBaseScheme> localReturnType = new ParameterizedTypeReference<ProcessActionBaseScheme>() {};
        return apiClient.invokeAPI("/tasks/process/{proc_id}/action/", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add task
     * Add task
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param createTaskTimeScheme  (required)
     * @return TaskTimeBaseScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public TaskTimeBaseScheme createTask(CreateTaskTimeScheme createTaskTimeScheme) throws RestClientException {
        return createTaskWithHttpInfo(createTaskTimeScheme).getBody();
    }

    /**
     * Add task
     * Add task
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param createTaskTimeScheme  (required)
     * @return ResponseEntity&lt;TaskTimeBaseScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<TaskTimeBaseScheme> createTaskWithHttpInfo(CreateTaskTimeScheme createTaskTimeScheme) throws RestClientException {
        Object localVarPostBody = createTaskTimeScheme;
        
        // verify the required parameter 'createTaskTimeScheme' is set
        if (createTaskTimeScheme == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createTaskTimeScheme' when calling createTask");
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<TaskTimeBaseScheme> localReturnType = new ParameterizedTypeReference<TaskTimeBaseScheme>() {};
        return apiClient.invokeAPI("/tasks/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add process
     * Add process
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param taskId  (required)
     * @param addProcessScheme  (required)
     * @return ProcessScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ProcessScheme createTaskProcess(Integer taskId, AddProcessScheme addProcessScheme) throws RestClientException {
        return createTaskProcessWithHttpInfo(taskId, addProcessScheme).getBody();
    }

    /**
     * Add process
     * Add process
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param taskId  (required)
     * @param addProcessScheme  (required)
     * @return ResponseEntity&lt;ProcessScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<ProcessScheme> createTaskProcessWithHttpInfo(Integer taskId, AddProcessScheme addProcessScheme) throws RestClientException {
        Object localVarPostBody = addProcessScheme;
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taskId' when calling createTaskProcess");
        }
        
        // verify the required parameter 'addProcessScheme' is set
        if (addProcessScheme == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addProcessScheme' when calling createTaskProcess");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("task_id", taskId);

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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<ProcessScheme> localReturnType = new ParameterizedTypeReference<ProcessScheme>() {};
        return apiClient.invokeAPI("/tasks/{task_id}/process/", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete action by id
     * Delete action by id
     * <p><b>204</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param procId  (required)
     * @param id  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public void deleteProcessAction(Integer procId, Integer id) throws RestClientException {
        deleteProcessActionWithHttpInfo(procId, id);
    }

    /**
     * Delete action by id
     * Delete action by id
     * <p><b>204</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param procId  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<Void> deleteProcessActionWithHttpInfo(Integer procId, Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'procId' is set
        if (procId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'procId' when calling deleteProcessAction");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteProcessAction");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("proc_id", procId);
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/tasks/process/{proc_id}/action/{id}/", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete task by id
     * Delete task by id
     * <p><b>204</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public void deleteTask(Integer id) throws RestClientException {
        deleteTaskWithHttpInfo(id);
    }

    /**
     * Delete task by id
     * Delete task by id
     * <p><b>204</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<Void> deleteTaskWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteTask");
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/tasks/{id}/", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete process by id
     * Delete process by id
     * <p><b>204</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param taskId  (required)
     * @param id  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public void deleteTaskProcess(Integer taskId, Integer id) throws RestClientException {
        deleteTaskProcessWithHttpInfo(taskId, id);
    }

    /**
     * Delete process by id
     * Delete process by id
     * <p><b>204</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param taskId  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<Void> deleteTaskProcessWithHttpInfo(Integer taskId, Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taskId' when calling deleteTaskProcess");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteTaskProcess");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("task_id", taskId);
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/tasks/{task_id}/process/{id}/", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get action by id
     * Get action by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param procId  (required)
     * @param id  (required)
     * @return ProcessActionBaseScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ProcessActionBaseScheme getProcessAction(Integer procId, Integer id) throws RestClientException {
        return getProcessActionWithHttpInfo(procId, id).getBody();
    }

    /**
     * Get action by id
     * Get action by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param procId  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;ProcessActionBaseScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<ProcessActionBaseScheme> getProcessActionWithHttpInfo(Integer procId, Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'procId' is set
        if (procId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'procId' when calling getProcessAction");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getProcessAction");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("proc_id", procId);
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<ProcessActionBaseScheme> localReturnType = new ParameterizedTypeReference<ProcessActionBaseScheme>() {};
        return apiClient.invokeAPI("/tasks/process/{proc_id}/action/{id}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get task by id
     * Get task by id
     * <p><b>200</b> - Successful Response
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @return TaskTimeBaseScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public TaskTimeBaseScheme getTask(Integer id) throws RestClientException {
        return getTaskWithHttpInfo(id).getBody();
    }

    /**
     * Get task by id
     * Get task by id
     * <p><b>200</b> - Successful Response
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @return ResponseEntity&lt;TaskTimeBaseScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<TaskTimeBaseScheme> getTaskWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getTask");
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<TaskTimeBaseScheme> localReturnType = new ParameterizedTypeReference<TaskTimeBaseScheme>() {};
        return apiClient.invokeAPI("/tasks/{id}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get process by id
     * Get process by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param taskId  (required)
     * @param id  (required)
     * @return ProcessScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ProcessScheme getTaskProcess(Integer taskId, Integer id) throws RestClientException {
        return getTaskProcessWithHttpInfo(taskId, id).getBody();
    }

    /**
     * Get process by id
     * Get process by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param taskId  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;ProcessScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<ProcessScheme> getTaskProcessWithHttpInfo(Integer taskId, Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taskId' when calling getTaskProcess");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getTaskProcess");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("task_id", taskId);
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<ProcessScheme> localReturnType = new ParameterizedTypeReference<ProcessScheme>() {};
        return apiClient.invokeAPI("/tasks/{task_id}/process/{id}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of tasks
     * Get a list of tasks
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param status Status:   * 1 - Inactive     * 2 - Active    (optional)
     * @param text text value for search by name (optional)
     * @param perPage  (optional, default to 1000)
     * @param page  (optional, default to 1)
     * @return PageTaskTimeScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public PageTaskTimeScheme getTasks(Status status, String text, Integer perPage, Integer page) throws RestClientException {
        return getTasksWithHttpInfo(status, text, perPage, page).getBody();
    }

    /**
     * Get a list of tasks
     * Get a list of tasks
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param status Status:   * 1 - Inactive     * 2 - Active    (optional)
     * @param text text value for search by name (optional)
     * @param perPage  (optional, default to 1000)
     * @param page  (optional, default to 1)
     * @return ResponseEntity&lt;PageTaskTimeScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<PageTaskTimeScheme> getTasksWithHttpInfo(Status status, String text, Integer perPage, Integer page) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "text", text));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<PageTaskTimeScheme> localReturnType = new ParameterizedTypeReference<PageTaskTimeScheme>() {};
        return apiClient.invokeAPI("/tasks/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update action by id
     * Update action by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param procId  (required)
     * @param id  (required)
     * @param addActionScheme  (required)
     * @return ProcessActionBaseScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ProcessActionBaseScheme updateProcessAction(Integer procId, Integer id, AddActionScheme addActionScheme) throws RestClientException {
        return updateProcessActionWithHttpInfo(procId, id, addActionScheme).getBody();
    }

    /**
     * Update action by id
     * Update action by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param procId  (required)
     * @param id  (required)
     * @param addActionScheme  (required)
     * @return ResponseEntity&lt;ProcessActionBaseScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<ProcessActionBaseScheme> updateProcessActionWithHttpInfo(Integer procId, Integer id, AddActionScheme addActionScheme) throws RestClientException {
        Object localVarPostBody = addActionScheme;
        
        // verify the required parameter 'procId' is set
        if (procId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'procId' when calling updateProcessAction");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateProcessAction");
        }
        
        // verify the required parameter 'addActionScheme' is set
        if (addActionScheme == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addActionScheme' when calling updateProcessAction");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("proc_id", procId);
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<ProcessActionBaseScheme> localReturnType = new ParameterizedTypeReference<ProcessActionBaseScheme>() {};
        return apiClient.invokeAPI("/tasks/process/{proc_id}/action/{id}/", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update task by id
     * Update task by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @param createTaskTimeScheme  (required)
     * @return TaskTimeBaseScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public TaskTimeBaseScheme updateTask(Integer id, CreateTaskTimeScheme createTaskTimeScheme) throws RestClientException {
        return updateTaskWithHttpInfo(id, createTaskTimeScheme).getBody();
    }

    /**
     * Update task by id
     * Update task by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @param createTaskTimeScheme  (required)
     * @return ResponseEntity&lt;TaskTimeBaseScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<TaskTimeBaseScheme> updateTaskWithHttpInfo(Integer id, CreateTaskTimeScheme createTaskTimeScheme) throws RestClientException {
        Object localVarPostBody = createTaskTimeScheme;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateTask");
        }
        
        // verify the required parameter 'createTaskTimeScheme' is set
        if (createTaskTimeScheme == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createTaskTimeScheme' when calling updateTask");
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<TaskTimeBaseScheme> localReturnType = new ParameterizedTypeReference<TaskTimeBaseScheme>() {};
        return apiClient.invokeAPI("/tasks/{id}/", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update process by id
     * Update process by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param taskId  (required)
     * @param id  (required)
     * @param addProcessScheme  (required)
     * @return ProcessScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ProcessScheme updateTaskProcess(Integer taskId, Integer id, AddProcessScheme addProcessScheme) throws RestClientException {
        return updateTaskProcessWithHttpInfo(taskId, id, addProcessScheme).getBody();
    }

    /**
     * Update process by id
     * Update process by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param taskId  (required)
     * @param id  (required)
     * @param addProcessScheme  (required)
     * @return ResponseEntity&lt;ProcessScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<ProcessScheme> updateTaskProcessWithHttpInfo(Integer taskId, Integer id, AddProcessScheme addProcessScheme) throws RestClientException {
        Object localVarPostBody = addProcessScheme;
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taskId' when calling updateTaskProcess");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateTaskProcess");
        }
        
        // verify the required parameter 'addProcessScheme' is set
        if (addProcessScheme == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addProcessScheme' when calling updateTaskProcess");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("task_id", taskId);
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<ProcessScheme> localReturnType = new ParameterizedTypeReference<ProcessScheme>() {};
        return apiClient.invokeAPI("/tasks/{task_id}/process/{id}/", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
