package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CommunicationWorkflow;
import org.openapitools.client.model.GetCommunicationWorkflowTotalByQuery200Response;
import org.openapitools.client.model.GetPreviousCommunications200Response;

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
public class HistoryApiApi {
    private ApiClient apiClient;

    public HistoryApiApi() {
        this(new ApiClient());
    }

    public HistoryApiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get the workflow by its Id
     * requires history:read scope
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @param workflowId The workflowId to search for (required)
     * @return CommunicationWorkflow
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommunicationWorkflow getCommunicationWorkflowById(Integer workflowId) throws RestClientException {
        return getCommunicationWorkflowByIdWithHttpInfo(workflowId).getBody();
    }

    /**
     * Get the workflow by its Id
     * requires history:read scope
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @param workflowId The workflowId to search for (required)
     * @return ResponseEntity&lt;CommunicationWorkflow&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommunicationWorkflow> getCommunicationWorkflowByIdWithHttpInfo(Integer workflowId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'workflowId' is set
        if (workflowId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'workflowId' when calling getCommunicationWorkflowById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("workflowId", workflowId);

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

        ParameterizedTypeReference<CommunicationWorkflow> localReturnType = new ParameterizedTypeReference<CommunicationWorkflow>() {};
        return apiClient.invokeAPI("/history/workflowId/{workflowId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the total number of workflows that match the query
     * requires history:read scope
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @param userId The userId (optional)
     * @param gatewayId The gatewayId (optional)
     * @param status The integer ENUM value representing the temporal status (optional, default to 0)
     * @return GetCommunicationWorkflowTotalByQuery200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommunicationWorkflowTotalByQuery200Response getCommunicationWorkflowTotalByQuery(Integer userId, Integer gatewayId, Integer status) throws RestClientException {
        return getCommunicationWorkflowTotalByQueryWithHttpInfo(userId, gatewayId, status).getBody();
    }

    /**
     * Get the total number of workflows that match the query
     * requires history:read scope
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @param userId The userId (optional)
     * @param gatewayId The gatewayId (optional)
     * @param status The integer ENUM value representing the temporal status (optional, default to 0)
     * @return ResponseEntity&lt;GetCommunicationWorkflowTotalByQuery200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommunicationWorkflowTotalByQuery200Response> getCommunicationWorkflowTotalByQueryWithHttpInfo(Integer userId, Integer gatewayId, Integer status) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "gatewayId", gatewayId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GetCommunicationWorkflowTotalByQuery200Response> localReturnType = new ParameterizedTypeReference<GetCommunicationWorkflowTotalByQuery200Response>() {};
        return apiClient.invokeAPI("/history/total", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the previous communication workflows by status, userId or gatewayId
     * requires history:read scope
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @param userId The userId (optional)
     * @param gatewayId The gatewayId (optional)
     * @param status The integer representing the temporal status (optional, default to 0)
     * @param pageNumber The page number to retrieve (optional, default to 0)
     * @param pageSize The number of items per page (optional, default to 50)
     * @return GetPreviousCommunications200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetPreviousCommunications200Response getPreviousCommunications(Integer userId, Integer gatewayId, Integer status, Integer pageNumber, Integer pageSize) throws RestClientException {
        return getPreviousCommunicationsWithHttpInfo(userId, gatewayId, status, pageNumber, pageSize).getBody();
    }

    /**
     * Get the previous communication workflows by status, userId or gatewayId
     * requires history:read scope
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @param userId The userId (optional)
     * @param gatewayId The gatewayId (optional)
     * @param status The integer representing the temporal status (optional, default to 0)
     * @param pageNumber The page number to retrieve (optional, default to 0)
     * @param pageSize The number of items per page (optional, default to 50)
     * @return ResponseEntity&lt;GetPreviousCommunications200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetPreviousCommunications200Response> getPreviousCommunicationsWithHttpInfo(Integer userId, Integer gatewayId, Integer status, Integer pageNumber, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "gatewayId", gatewayId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GetPreviousCommunications200Response> localReturnType = new ParameterizedTypeReference<GetPreviousCommunications200Response>() {};
        return apiClient.invokeAPI("/history", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
