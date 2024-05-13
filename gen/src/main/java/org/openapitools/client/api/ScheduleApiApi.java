package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CommunicationSchedule;
import org.openapitools.client.model.CreateCommunicationSchedule;
import org.openapitools.client.model.GetCommunicationSchedules200Response;
import java.util.UUID;
import org.openapitools.client.model.UpdateCommunicationScheduleRequest;
import org.openapitools.client.model.UpdateCommunicationSchedulesByGatewayIdRequest;
import org.openapitools.client.model.UpdateCommunicationSchedulesByUserIdRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:15:04.742654231Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ScheduleApiApi {
    private ApiClient apiClient;

    public ScheduleApiApi() {
        this(new ApiClient());
    }

    public ScheduleApiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new communication schedule
     * requires schedule:write scope
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict - already exists
     * @param createCommunicationSchedule  (optional)
     * @return CommunicationSchedule
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommunicationSchedule createCommunicationSchedule(CreateCommunicationSchedule createCommunicationSchedule) throws RestClientException {
        return createCommunicationScheduleWithHttpInfo(createCommunicationSchedule).getBody();
    }

    /**
     * Create a new communication schedule
     * requires schedule:write scope
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict - already exists
     * @param createCommunicationSchedule  (optional)
     * @return ResponseEntity&lt;CommunicationSchedule&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommunicationSchedule> createCommunicationScheduleWithHttpInfo(CreateCommunicationSchedule createCommunicationSchedule) throws RestClientException {
        Object localVarPostBody = createCommunicationSchedule;
        

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<CommunicationSchedule> localReturnType = new ParameterizedTypeReference<CommunicationSchedule>() {};
        return apiClient.invokeAPI("/schedule", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete an existing communication schedule by id
     * requires schedule:delete scope
     * <p><b>204</b> - No Content
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @param scheduleId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteCommunicationSchedule(UUID scheduleId) throws RestClientException {
        deleteCommunicationScheduleWithHttpInfo(scheduleId);
    }

    /**
     * Delete an existing communication schedule by id
     * requires schedule:delete scope
     * <p><b>204</b> - No Content
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @param scheduleId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCommunicationScheduleWithHttpInfo(UUID scheduleId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'scheduleId' is set
        if (scheduleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'scheduleId' when calling deleteCommunicationSchedule");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("scheduleId", scheduleId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/schedule/{scheduleId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete all communication schedules by gatewayId
     * requires schedule:delete scope
     * <p><b>204</b> - No Content
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @param gatewayId The schedules to retrieve by gatewayId (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteCommunicationSchedulesByGatewayId(Integer gatewayId) throws RestClientException {
        deleteCommunicationSchedulesByGatewayIdWithHttpInfo(gatewayId);
    }

    /**
     * Delete all communication schedules by gatewayId
     * requires schedule:delete scope
     * <p><b>204</b> - No Content
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @param gatewayId The schedules to retrieve by gatewayId (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCommunicationSchedulesByGatewayIdWithHttpInfo(Integer gatewayId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gatewayId' when calling deleteCommunicationSchedulesByGatewayId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gatewayId", gatewayId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/schedule/gateway/{gatewayId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete all communication schedules by userId
     * requires schedule:delete scope
     * <p><b>204</b> - No Content
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @param userId The schedules to retrieve by userId (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteCommunicationSchedulesByUserId(Integer userId) throws RestClientException {
        deleteCommunicationSchedulesByUserIdWithHttpInfo(userId);
    }

    /**
     * Delete all communication schedules by userId
     * requires schedule:delete scope
     * <p><b>204</b> - No Content
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @param userId The schedules to retrieve by userId (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCommunicationSchedulesByUserIdWithHttpInfo(Integer userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling deleteCommunicationSchedulesByUserId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/schedule/user/{userId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all communication schedules
     * requires schedule:read scope
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @param pageNumber The page number to retrieve (optional, default to 0)
     * @param pageSize The number of items per page (optional, default to 50)
     * @return GetCommunicationSchedules200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommunicationSchedules200Response getCommunicationSchedules(Integer pageNumber, Integer pageSize) throws RestClientException {
        return getCommunicationSchedulesWithHttpInfo(pageNumber, pageSize).getBody();
    }

    /**
     * Get all communication schedules
     * requires schedule:read scope
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @param pageNumber The page number to retrieve (optional, default to 0)
     * @param pageSize The number of items per page (optional, default to 50)
     * @return ResponseEntity&lt;GetCommunicationSchedules200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommunicationSchedules200Response> getCommunicationSchedulesWithHttpInfo(Integer pageNumber, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GetCommunicationSchedules200Response> localReturnType = new ParameterizedTypeReference<GetCommunicationSchedules200Response>() {};
        return apiClient.invokeAPI("/schedule", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all communication schedules by gatewayId
     * requires schedule:read scope
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param gatewayId The schedules to retrieve by gatewayId (required)
     * @param pageNumber The page number to retrieve (optional, default to 0)
     * @param pageSize The number of items per page (optional, default to 50)
     * @return GetCommunicationSchedules200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommunicationSchedules200Response getCommunicationSchedulesByGatewayId(Integer gatewayId, Integer pageNumber, Integer pageSize) throws RestClientException {
        return getCommunicationSchedulesByGatewayIdWithHttpInfo(gatewayId, pageNumber, pageSize).getBody();
    }

    /**
     * Get all communication schedules by gatewayId
     * requires schedule:read scope
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param gatewayId The schedules to retrieve by gatewayId (required)
     * @param pageNumber The page number to retrieve (optional, default to 0)
     * @param pageSize The number of items per page (optional, default to 50)
     * @return ResponseEntity&lt;GetCommunicationSchedules200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommunicationSchedules200Response> getCommunicationSchedulesByGatewayIdWithHttpInfo(Integer gatewayId, Integer pageNumber, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gatewayId' when calling getCommunicationSchedulesByGatewayId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gatewayId", gatewayId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GetCommunicationSchedules200Response> localReturnType = new ParameterizedTypeReference<GetCommunicationSchedules200Response>() {};
        return apiClient.invokeAPI("/schedule/gateway/{gatewayId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get communication schedule by scheduleId
     * requires schedule:read scope
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param scheduleId The schedules to retrieve by scheduleId (required)
     * @return CommunicationSchedule
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommunicationSchedule getCommunicationSchedulesByScheduleId(Integer scheduleId) throws RestClientException {
        return getCommunicationSchedulesByScheduleIdWithHttpInfo(scheduleId).getBody();
    }

    /**
     * Get communication schedule by scheduleId
     * requires schedule:read scope
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param scheduleId The schedules to retrieve by scheduleId (required)
     * @return ResponseEntity&lt;CommunicationSchedule&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommunicationSchedule> getCommunicationSchedulesByScheduleIdWithHttpInfo(Integer scheduleId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'scheduleId' is set
        if (scheduleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'scheduleId' when calling getCommunicationSchedulesByScheduleId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("scheduleId", scheduleId);

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<CommunicationSchedule> localReturnType = new ParameterizedTypeReference<CommunicationSchedule>() {};
        return apiClient.invokeAPI("/schedule/{scheduleId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all communication schedules by userId
     * requires schedule:read scope
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param userId The schedules to retrieve by userId (required)
     * @param pageNumber The page number to retrieve (optional, default to 0)
     * @param pageSize The number of items per page (optional, default to 50)
     * @return GetCommunicationSchedules200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommunicationSchedules200Response getCommunicationSchedulesByUserId(Integer userId, Integer pageNumber, Integer pageSize) throws RestClientException {
        return getCommunicationSchedulesByUserIdWithHttpInfo(userId, pageNumber, pageSize).getBody();
    }

    /**
     * Get all communication schedules by userId
     * requires schedule:read scope
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param userId The schedules to retrieve by userId (required)
     * @param pageNumber The page number to retrieve (optional, default to 0)
     * @param pageSize The number of items per page (optional, default to 50)
     * @return ResponseEntity&lt;GetCommunicationSchedules200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommunicationSchedules200Response> getCommunicationSchedulesByUserIdWithHttpInfo(Integer userId, Integer pageNumber, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getCommunicationSchedulesByUserId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GetCommunicationSchedules200Response> localReturnType = new ParameterizedTypeReference<GetCommunicationSchedules200Response>() {};
        return apiClient.invokeAPI("/schedule/user/{userId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Updates an existing communication schedule
     * requires schedule:write scope
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict - already exists
     * @param updateCommunicationScheduleRequest  (optional)
     * @return CommunicationSchedule
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommunicationSchedule updateCommunicationSchedule(UpdateCommunicationScheduleRequest updateCommunicationScheduleRequest) throws RestClientException {
        return updateCommunicationScheduleWithHttpInfo(updateCommunicationScheduleRequest).getBody();
    }

    /**
     * Updates an existing communication schedule
     * requires schedule:write scope
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict - already exists
     * @param updateCommunicationScheduleRequest  (optional)
     * @return ResponseEntity&lt;CommunicationSchedule&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommunicationSchedule> updateCommunicationScheduleWithHttpInfo(UpdateCommunicationScheduleRequest updateCommunicationScheduleRequest) throws RestClientException {
        Object localVarPostBody = updateCommunicationScheduleRequest;
        

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<CommunicationSchedule> localReturnType = new ParameterizedTypeReference<CommunicationSchedule>() {};
        return apiClient.invokeAPI("/schedule", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Updates all communication schedules by gatewayId to the given request body
     * requires schedule:write scope
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict - already exists
     * @param updateCommunicationSchedulesByGatewayIdRequest  (optional)
     * @return CommunicationSchedule
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommunicationSchedule updateCommunicationSchedulesByGatewayId(UpdateCommunicationSchedulesByGatewayIdRequest updateCommunicationSchedulesByGatewayIdRequest) throws RestClientException {
        return updateCommunicationSchedulesByGatewayIdWithHttpInfo(updateCommunicationSchedulesByGatewayIdRequest).getBody();
    }

    /**
     * Updates all communication schedules by gatewayId to the given request body
     * requires schedule:write scope
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict - already exists
     * @param updateCommunicationSchedulesByGatewayIdRequest  (optional)
     * @return ResponseEntity&lt;CommunicationSchedule&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommunicationSchedule> updateCommunicationSchedulesByGatewayIdWithHttpInfo(UpdateCommunicationSchedulesByGatewayIdRequest updateCommunicationSchedulesByGatewayIdRequest) throws RestClientException {
        Object localVarPostBody = updateCommunicationSchedulesByGatewayIdRequest;
        

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<CommunicationSchedule> localReturnType = new ParameterizedTypeReference<CommunicationSchedule>() {};
        return apiClient.invokeAPI("/schedule/gateway/{gatewayId}", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Updates all communication schedules by userId to the given request body
     * requires schedule:write scope
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict - already exists
     * @param updateCommunicationSchedulesByUserIdRequest  (optional)
     * @return CommunicationSchedule
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommunicationSchedule updateCommunicationSchedulesByUserId(UpdateCommunicationSchedulesByUserIdRequest updateCommunicationSchedulesByUserIdRequest) throws RestClientException {
        return updateCommunicationSchedulesByUserIdWithHttpInfo(updateCommunicationSchedulesByUserIdRequest).getBody();
    }

    /**
     * Updates all communication schedules by userId to the given request body
     * requires schedule:write scope
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict - already exists
     * @param updateCommunicationSchedulesByUserIdRequest  (optional)
     * @return ResponseEntity&lt;CommunicationSchedule&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommunicationSchedule> updateCommunicationSchedulesByUserIdWithHttpInfo(UpdateCommunicationSchedulesByUserIdRequest updateCommunicationSchedulesByUserIdRequest) throws RestClientException {
        Object localVarPostBody = updateCommunicationSchedulesByUserIdRequest;
        

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<CommunicationSchedule> localReturnType = new ParameterizedTypeReference<CommunicationSchedule>() {};
        return apiClient.invokeAPI("/schedule/user/{userId}", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
