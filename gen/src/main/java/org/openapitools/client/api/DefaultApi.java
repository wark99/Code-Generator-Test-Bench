package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.InstitutionsGet200Response;
import org.openapitools.client.model.InstitutionsInstitutionCoursesGet200Response;
import org.openapitools.client.model.InstitutionsInstitutionProgrammesGet200Response;
import org.openapitools.client.model.SchedulesGet200ResponseInner;
import org.openapitools.client.model.SchedulesPostRequest;
import org.openapitools.client.model.ScrapingJobScrapingIdPostRequest;
import org.openapitools.client.model.ScrapingJobsGet200Response;
import org.openapitools.client.model.ScrapingPreviewGet200Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:15:20.052181070Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List all institutions.
     * Retrieve a list of all available institutions.
     * <p><b>200</b> - A list of institutions.
     * @return InstitutionsGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InstitutionsGet200Response institutionsGet() throws RestClientException {
        return institutionsGetWithHttpInfo().getBody();
    }

    /**
     * List all institutions.
     * Retrieve a list of all available institutions.
     * <p><b>200</b> - A list of institutions.
     * @return ResponseEntity&lt;InstitutionsGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InstitutionsGet200Response> institutionsGetWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<InstitutionsGet200Response> localReturnType = new ParameterizedTypeReference<InstitutionsGet200Response>() {};
        return apiClient.invokeAPI("/institutions", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List all courses for a specific institution.
     * Retrieve all courses associated with a given institution.
     * <p><b>200</b> - List of courses.
     * <p><b>404</b> - Institution not found.
     * @param institution  (required)
     * @return InstitutionsInstitutionCoursesGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InstitutionsInstitutionCoursesGet200Response institutionsInstitutionCoursesGet(String institution) throws RestClientException {
        return institutionsInstitutionCoursesGetWithHttpInfo(institution).getBody();
    }

    /**
     * List all courses for a specific institution.
     * Retrieve all courses associated with a given institution.
     * <p><b>200</b> - List of courses.
     * <p><b>404</b> - Institution not found.
     * @param institution  (required)
     * @return ResponseEntity&lt;InstitutionsInstitutionCoursesGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InstitutionsInstitutionCoursesGet200Response> institutionsInstitutionCoursesGetWithHttpInfo(String institution) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'institution' is set
        if (institution == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'institution' when calling institutionsInstitutionCoursesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("institution", institution);

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

        ParameterizedTypeReference<InstitutionsInstitutionCoursesGet200Response> localReturnType = new ParameterizedTypeReference<InstitutionsInstitutionCoursesGet200Response>() {};
        return apiClient.invokeAPI("/institutions/{institution}/courses", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List all programmes for a specific institution.
     * Retrieve all programmes associated with a given institution.
     * <p><b>200</b> - List of programmes.
     * <p><b>404</b> - Institution not found.
     * @param institution  (required)
     * @return InstitutionsInstitutionProgrammesGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InstitutionsInstitutionProgrammesGet200Response institutionsInstitutionProgrammesGet(String institution) throws RestClientException {
        return institutionsInstitutionProgrammesGetWithHttpInfo(institution).getBody();
    }

    /**
     * List all programmes for a specific institution.
     * Retrieve all programmes associated with a given institution.
     * <p><b>200</b> - List of programmes.
     * <p><b>404</b> - Institution not found.
     * @param institution  (required)
     * @return ResponseEntity&lt;InstitutionsInstitutionProgrammesGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InstitutionsInstitutionProgrammesGet200Response> institutionsInstitutionProgrammesGetWithHttpInfo(String institution) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'institution' is set
        if (institution == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'institution' when calling institutionsInstitutionProgrammesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("institution", institution);

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

        ParameterizedTypeReference<InstitutionsInstitutionProgrammesGet200Response> localReturnType = new ParameterizedTypeReference<InstitutionsInstitutionProgrammesGet200Response>() {};
        return apiClient.invokeAPI("/institutions/{institution}/programmes", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List all schedules.
     * Retrieve a list of all active schedules.
     * <p><b>200</b> - A list of schedules.
     * @return List&lt;SchedulesGet200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SchedulesGet200ResponseInner> schedulesGet() throws RestClientException {
        return schedulesGetWithHttpInfo().getBody();
    }

    /**
     * List all schedules.
     * Retrieve a list of all active schedules.
     * <p><b>200</b> - A list of schedules.
     * @return ResponseEntity&lt;List&lt;SchedulesGet200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SchedulesGet200ResponseInner>> schedulesGetWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<List<SchedulesGet200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<SchedulesGet200ResponseInner>>() {};
        return apiClient.invokeAPI("/schedules", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Enable or disable scraping schedules.
     * 
     * <p><b>201</b> - Scheduling action executed successfully.
     * <p><b>400</b> - Invalid or missing action in request.
     * @param schedulesPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void schedulesPost(SchedulesPostRequest schedulesPostRequest) throws RestClientException {
        schedulesPostWithHttpInfo(schedulesPostRequest);
    }

    /**
     * Enable or disable scraping schedules.
     * 
     * <p><b>201</b> - Scheduling action executed successfully.
     * <p><b>400</b> - Invalid or missing action in request.
     * @param schedulesPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> schedulesPostWithHttpInfo(SchedulesPostRequest schedulesPostRequest) throws RestClientException {
        Object localVarPostBody = schedulesPostRequest;
        
        // verify the required parameter 'schedulesPostRequest' is set
        if (schedulesPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'schedulesPostRequest' when calling schedulesPost");
        }
        

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/schedules", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Approve or reject a scraping job.
     * 
     * <p><b>201</b> - Scraping data approved successfully.
     * <p><b>400</b> - Invalid input.
     * @param scrapingId  (required)
     * @param scrapingJobScrapingIdPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void scrapingJobScrapingIdPost(String scrapingId, ScrapingJobScrapingIdPostRequest scrapingJobScrapingIdPostRequest) throws RestClientException {
        scrapingJobScrapingIdPostWithHttpInfo(scrapingId, scrapingJobScrapingIdPostRequest);
    }

    /**
     * Approve or reject a scraping job.
     * 
     * <p><b>201</b> - Scraping data approved successfully.
     * <p><b>400</b> - Invalid input.
     * @param scrapingId  (required)
     * @param scrapingJobScrapingIdPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> scrapingJobScrapingIdPostWithHttpInfo(String scrapingId, ScrapingJobScrapingIdPostRequest scrapingJobScrapingIdPostRequest) throws RestClientException {
        Object localVarPostBody = scrapingJobScrapingIdPostRequest;
        
        // verify the required parameter 'scrapingId' is set
        if (scrapingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'scrapingId' when calling scrapingJobScrapingIdPost");
        }
        
        // verify the required parameter 'scrapingJobScrapingIdPostRequest' is set
        if (scrapingJobScrapingIdPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'scrapingJobScrapingIdPostRequest' when calling scrapingJobScrapingIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("scraping_id", scrapingId);

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/scraping-job/{scraping_id}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List all scraping jobs.
     * Retrieve a list of all running scraping jobs.
     * <p><b>200</b> - A list of scraping jobs.
     * @return ScrapingJobsGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ScrapingJobsGet200Response scrapingJobsGet() throws RestClientException {
        return scrapingJobsGetWithHttpInfo().getBody();
    }

    /**
     * List all scraping jobs.
     * Retrieve a list of all running scraping jobs.
     * <p><b>200</b> - A list of scraping jobs.
     * @return ResponseEntity&lt;ScrapingJobsGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ScrapingJobsGet200Response> scrapingJobsGetWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<ScrapingJobsGet200Response> localReturnType = new ParameterizedTypeReference<ScrapingJobsGet200Response>() {};
        return apiClient.invokeAPI("/scraping-jobs", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List scraping jobs for a specific institution.
     * Retrieve all scraping jobs running for a specific institution.
     * <p><b>200</b> - A list of scraping jobs.
     * @param institutionName  (required)
     * @return ScrapingJobsGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ScrapingJobsGet200Response scrapingJobsInstitutionNameGet(String institutionName) throws RestClientException {
        return scrapingJobsInstitutionNameGetWithHttpInfo(institutionName).getBody();
    }

    /**
     * List scraping jobs for a specific institution.
     * Retrieve all scraping jobs running for a specific institution.
     * <p><b>200</b> - A list of scraping jobs.
     * @param institutionName  (required)
     * @return ResponseEntity&lt;ScrapingJobsGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ScrapingJobsGet200Response> scrapingJobsInstitutionNameGetWithHttpInfo(String institutionName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'institutionName' is set
        if (institutionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'institutionName' when calling scrapingJobsInstitutionNameGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("institution_name", institutionName);

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

        ParameterizedTypeReference<ScrapingJobsGet200Response> localReturnType = new ParameterizedTypeReference<ScrapingJobsGet200Response>() {};
        return apiClient.invokeAPI("/scraping-jobs/{institution_name}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Start or stop scraping job for a institution.
     * 
     * <p><b>201</b> - Scraping job updated successfully.
     * <p><b>400</b> - Invalid action.
     * @param institutionName  (required)
     * @param schedulesPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void scrapingJobsInstitutionNamePost(String institutionName, SchedulesPostRequest schedulesPostRequest) throws RestClientException {
        scrapingJobsInstitutionNamePostWithHttpInfo(institutionName, schedulesPostRequest);
    }

    /**
     * Start or stop scraping job for a institution.
     * 
     * <p><b>201</b> - Scraping job updated successfully.
     * <p><b>400</b> - Invalid action.
     * @param institutionName  (required)
     * @param schedulesPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> scrapingJobsInstitutionNamePostWithHttpInfo(String institutionName, SchedulesPostRequest schedulesPostRequest) throws RestClientException {
        Object localVarPostBody = schedulesPostRequest;
        
        // verify the required parameter 'institutionName' is set
        if (institutionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'institutionName' when calling scrapingJobsInstitutionNamePost");
        }
        
        // verify the required parameter 'schedulesPostRequest' is set
        if (schedulesPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'schedulesPostRequest' when calling scrapingJobsInstitutionNamePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("institution_name", institutionName);

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/scraping-jobs/{institution_name}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all scraping session awaiting approval of associated data.
     * 
     * <p><b>200</b> - A list of all scraping sessions awaiting approval.
     * @return ScrapingPreviewGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ScrapingPreviewGet200Response scrapingPreviewGet() throws RestClientException {
        return scrapingPreviewGetWithHttpInfo().getBody();
    }

    /**
     * Get all scraping session awaiting approval of associated data.
     * 
     * <p><b>200</b> - A list of all scraping sessions awaiting approval.
     * @return ResponseEntity&lt;ScrapingPreviewGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ScrapingPreviewGet200Response> scrapingPreviewGetWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<ScrapingPreviewGet200Response> localReturnType = new ParameterizedTypeReference<ScrapingPreviewGet200Response>() {};
        return apiClient.invokeAPI("/scraping-preview", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get scraping sessions awaiting approval for a specific institution.
     * 
     * <p><b>200</b> - List of sessions awaiting approval for the given institution.
     * @param institution  (required)
     * @return ScrapingPreviewGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ScrapingPreviewGet200Response scrapingPreviewInstitutionGet(String institution) throws RestClientException {
        return scrapingPreviewInstitutionGetWithHttpInfo(institution).getBody();
    }

    /**
     * Get scraping sessions awaiting approval for a specific institution.
     * 
     * <p><b>200</b> - List of sessions awaiting approval for the given institution.
     * @param institution  (required)
     * @return ResponseEntity&lt;ScrapingPreviewGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ScrapingPreviewGet200Response> scrapingPreviewInstitutionGetWithHttpInfo(String institution) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'institution' is set
        if (institution == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'institution' when calling scrapingPreviewInstitutionGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("institution", institution);

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

        ParameterizedTypeReference<ScrapingPreviewGet200Response> localReturnType = new ParameterizedTypeReference<ScrapingPreviewGet200Response>() {};
        return apiClient.invokeAPI("/scraping-preview/{institution}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get preview data for a specific session by institution.
     * Retrieve a random set of data from a specific session by institution.
     * <p><b>200</b> - The session data.
     * @param institution  (required)
     * @param sessionId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void scrapingPreviewInstitutionSessionIdGet(String institution, String sessionId) throws RestClientException {
        scrapingPreviewInstitutionSessionIdGetWithHttpInfo(institution, sessionId);
    }

    /**
     * Get preview data for a specific session by institution.
     * Retrieve a random set of data from a specific session by institution.
     * <p><b>200</b> - The session data.
     * @param institution  (required)
     * @param sessionId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> scrapingPreviewInstitutionSessionIdGetWithHttpInfo(String institution, String sessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'institution' is set
        if (institution == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'institution' when calling scrapingPreviewInstitutionSessionIdGet");
        }
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling scrapingPreviewInstitutionSessionIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("institution", institution);
        uriVariables.put("session_id", sessionId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/scraping-preview/{institution}/{session_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
