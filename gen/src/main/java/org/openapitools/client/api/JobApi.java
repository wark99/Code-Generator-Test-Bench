package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.JobIdAppGet200Response;
import org.openapitools.client.model.JobIdApplyPostRequest;
import org.openapitools.client.model.JobIdEditPutRequest;
import org.openapitools.client.model.JobIdStatsGet200Response;
import org.openapitools.client.model.SearchProfilePost400Response;
import org.openapitools.client.model.SearchProfilePostDefaultResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:24.544913406Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class JobApi {
    private ApiClient apiClient;

    public JobApi() {
        this(new ApiClient());
    }

    public JobApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Reject a job application
     * allows a parent to reject job application from a provider
     * <p><b>204</b> - Job application successfully rejected
     * <p><b>400</b> - Unable to reject job application
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param id  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void jobApplicationIdRejectPut(String id) throws RestClientException {
        jobApplicationIdRejectPutWithHttpInfo(id);
    }

    /**
     * Reject a job application
     * allows a parent to reject job application from a provider
     * <p><b>204</b> - Job application successfully rejected
     * <p><b>400</b> - Unable to reject job application
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param id  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> jobApplicationIdRejectPutWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling jobApplicationIdRejectPut");
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
        return apiClient.invokeAPI("/job/application/{id}/reject", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Withdraw a job application
     * Allows a provider to withdraw a job application
     * <p><b>204</b> - Job application successfully withdrawn
     * <p><b>400</b> - Unable to withdraw job application
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param id  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void jobApplicationIdWithdrawPut(String id) throws RestClientException {
        jobApplicationIdWithdrawPutWithHttpInfo(id);
    }

    /**
     * Withdraw a job application
     * Allows a provider to withdraw a job application
     * <p><b>204</b> - Job application successfully withdrawn
     * <p><b>400</b> - Unable to withdraw job application
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param id  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> jobApplicationIdWithdrawPutWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling jobApplicationIdWithdrawPut");
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
        return apiClient.invokeAPI("/job/application/{id}/withdraw", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post a job ad
     * Posts a job ad. This feature is available to parent account
     * <p><b>201</b> - Job Add posted successfully
     * <p><b>400</b> - Unable to create profile.
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param jobIdEditPutRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void jobCreatePost(JobIdEditPutRequest jobIdEditPutRequest) throws RestClientException {
        jobCreatePostWithHttpInfo(jobIdEditPutRequest);
    }

    /**
     * Post a job ad
     * Posts a job ad. This feature is available to parent account
     * <p><b>201</b> - Job Add posted successfully
     * <p><b>400</b> - Unable to create profile.
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param jobIdEditPutRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> jobCreatePostWithHttpInfo(JobIdEditPutRequest jobIdEditPutRequest) throws RestClientException {
        Object localVarPostBody = jobIdEditPutRequest;
        

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
        return apiClient.invokeAPI("/job/create", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all job posts by currently logged in user
     * 
     * <p><b>200</b> - Job posts retrieved successfully
     * <p><b>400</b> - Unable to create profile.
     * <p><b>0</b> - Unexpected Error
     * @return List&lt;JobIdAppGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<JobIdAppGet200Response> jobGet() throws RestClientException {
        return jobGetWithHttpInfo().getBody();
    }

    /**
     * Get all job posts by currently logged in user
     * 
     * <p><b>200</b> - Job posts retrieved successfully
     * <p><b>400</b> - Unable to create profile.
     * <p><b>0</b> - Unexpected Error
     * @return ResponseEntity&lt;List&lt;JobIdAppGet200Response&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<JobIdAppGet200Response>> jobGetWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<List<JobIdAppGet200Response>> localReturnType = new ParameterizedTypeReference<List<JobIdAppGet200Response>>() {};
        return apiClient.invokeAPI("/job", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * get job post
     * This retrieves a job post and may include information about applications to that job
     * <p><b>200</b> - Job post retrieved successfully
     * <p><b>400</b> - Unable to retrieve job post
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param id  (required)
     * @param app When true job applications are retrieved with the job post otherwise set false to retrieve only job post details  (required)
     * @return JobIdAppGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public JobIdAppGet200Response jobIdAppGet(String id, Boolean app) throws RestClientException {
        return jobIdAppGetWithHttpInfo(id, app).getBody();
    }

    /**
     * get job post
     * This retrieves a job post and may include information about applications to that job
     * <p><b>200</b> - Job post retrieved successfully
     * <p><b>400</b> - Unable to retrieve job post
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param id  (required)
     * @param app When true job applications are retrieved with the job post otherwise set false to retrieve only job post details  (required)
     * @return ResponseEntity&lt;JobIdAppGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<JobIdAppGet200Response> jobIdAppGetWithHttpInfo(String id, Boolean app) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling jobIdAppGet");
        }
        
        // verify the required parameter 'app' is set
        if (app == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'app' when calling jobIdAppGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("app", app);

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

        ParameterizedTypeReference<JobIdAppGet200Response> localReturnType = new ParameterizedTypeReference<JobIdAppGet200Response>() {};
        return apiClient.invokeAPI("/job/{id}/{app}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * process job application
     * This processes job application and parent who posted the job is notified
     * <p><b>201</b> - Job application successfully submitted
     * <p><b>400</b> - Unable to submit job application
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param id  (required)
     * @param jobIdApplyPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void jobIdApplyPost(String id, JobIdApplyPostRequest jobIdApplyPostRequest) throws RestClientException {
        jobIdApplyPostWithHttpInfo(id, jobIdApplyPostRequest);
    }

    /**
     * process job application
     * This processes job application and parent who posted the job is notified
     * <p><b>201</b> - Job application successfully submitted
     * <p><b>400</b> - Unable to submit job application
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param id  (required)
     * @param jobIdApplyPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> jobIdApplyPostWithHttpInfo(String id, JobIdApplyPostRequest jobIdApplyPostRequest) throws RestClientException {
        Object localVarPostBody = jobIdApplyPostRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling jobIdApplyPost");
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
        return apiClient.invokeAPI("/job/{id}/apply", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * edit a job post
     * This allows a parent to edit a job post. A job post can&#39;t be edited if the status is &#x60;expired&#x60; or &#x60;abandoned&#x60;. If someone has already applied to the job, then title and description can&#39;t be edited. If your job post isn&#39;t already active, as in it is in a &#x60;draft&#x60; state and the start date is in future then you are allowed to change the start date. 
     * <p><b>201</b> - Job post updated successfully
     * <p><b>400</b> - Unable to update job post
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param id  (required)
     * @param jobIdEditPutRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void jobIdEditPut(String id, JobIdEditPutRequest jobIdEditPutRequest) throws RestClientException {
        jobIdEditPutWithHttpInfo(id, jobIdEditPutRequest);
    }

    /**
     * edit a job post
     * This allows a parent to edit a job post. A job post can&#39;t be edited if the status is &#x60;expired&#x60; or &#x60;abandoned&#x60;. If someone has already applied to the job, then title and description can&#39;t be edited. If your job post isn&#39;t already active, as in it is in a &#x60;draft&#x60; state and the start date is in future then you are allowed to change the start date. 
     * <p><b>201</b> - Job post updated successfully
     * <p><b>400</b> - Unable to update job post
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param id  (required)
     * @param jobIdEditPutRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> jobIdEditPutWithHttpInfo(String id, JobIdEditPutRequest jobIdEditPutRequest) throws RestClientException {
        Object localVarPostBody = jobIdEditPutRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling jobIdEditPut");
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
        return apiClient.invokeAPI("/job/{id}/edit", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * get stats for a job post
     * 
     * <p><b>200</b> - successfully returns job stats
     * <p><b>400</b> - Unable to update job post
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param id  (required)
     * @return JobIdStatsGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public JobIdStatsGet200Response jobIdStatsGet(String id) throws RestClientException {
        return jobIdStatsGetWithHttpInfo(id).getBody();
    }

    /**
     * get stats for a job post
     * 
     * <p><b>200</b> - successfully returns job stats
     * <p><b>400</b> - Unable to update job post
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param id  (required)
     * @return ResponseEntity&lt;JobIdStatsGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<JobIdStatsGet200Response> jobIdStatsGetWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling jobIdStatsGet");
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

        ParameterizedTypeReference<JobIdStatsGet200Response> localReturnType = new ParameterizedTypeReference<JobIdStatsGet200Response>() {};
        return apiClient.invokeAPI("/job/{id}/stats", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Ends a job advert
     * This terminates a job ad. The job Ad must be live before user can terminate it.
     * <p><b>204</b> - No Content. Job Terminated
     * <p><b>400</b> - Unable to create profile.
     * <p><b>0</b> - Unexpected Error
     * @param id  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void jobIdTerminatePut(String id) throws RestClientException {
        jobIdTerminatePutWithHttpInfo(id);
    }

    /**
     * Ends a job advert
     * This terminates a job ad. The job Ad must be live before user can terminate it.
     * <p><b>204</b> - No Content. Job Terminated
     * <p><b>400</b> - Unable to create profile.
     * <p><b>0</b> - Unexpected Error
     * @param id  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> jobIdTerminatePutWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling jobIdTerminatePut");
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
        return apiClient.invokeAPI("/job/{id}/terminate", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * keeps track of job views
     * keeps track of how many times a job has been viewed
     * <p><b>204</b> - Job successfully marked a viewed
     * <p><b>400</b> - Unable to mark job as viewed
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param id  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void jobIdViewedPut(String id) throws RestClientException {
        jobIdViewedPutWithHttpInfo(id);
    }

    /**
     * keeps track of job views
     * keeps track of how many times a job has been viewed
     * <p><b>204</b> - Job successfully marked a viewed
     * <p><b>400</b> - Unable to mark job as viewed
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param id  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> jobIdViewedPutWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling jobIdViewedPut");
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
        return apiClient.invokeAPI("/job/{id}/viewed", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
