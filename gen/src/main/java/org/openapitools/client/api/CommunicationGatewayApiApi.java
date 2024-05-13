package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CommunicationGateway;
import org.openapitools.client.model.CreateCommunicationGateway;
import org.openapitools.client.model.GetCommunicationGateways200Response;
import java.util.UUID;

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
public class CommunicationGatewayApiApi {
    private ApiClient apiClient;

    public CommunicationGatewayApiApi() {
        this(new ApiClient());
    }

    public CommunicationGatewayApiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a communication gateway
     * requires gateway:write scope
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * @param createCommunicationGateway Communication gateway to create (required)
     * @return CommunicationGateway
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommunicationGateway createCommunicationGateway(CreateCommunicationGateway createCommunicationGateway) throws RestClientException {
        return createCommunicationGatewayWithHttpInfo(createCommunicationGateway).getBody();
    }

    /**
     * Create a communication gateway
     * requires gateway:write scope
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * <p><b>409</b> - Conflict
     * @param createCommunicationGateway Communication gateway to create (required)
     * @return ResponseEntity&lt;CommunicationGateway&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommunicationGateway> createCommunicationGatewayWithHttpInfo(CreateCommunicationGateway createCommunicationGateway) throws RestClientException {
        Object localVarPostBody = createCommunicationGateway;
        
        // verify the required parameter 'createCommunicationGateway' is set
        if (createCommunicationGateway == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createCommunicationGateway' when calling createCommunicationGateway");
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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<CommunicationGateway> localReturnType = new ParameterizedTypeReference<CommunicationGateway>() {};
        return apiClient.invokeAPI("/gateway", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a communication gateway
     * requires gateway:delete scope
     * <p><b>204</b> - No Content
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @param gatewayId ID of the communication gateway to delete (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteCommunicationGateway(UUID gatewayId) throws RestClientException {
        deleteCommunicationGatewayWithHttpInfo(gatewayId);
    }

    /**
     * Delete a communication gateway
     * requires gateway:delete scope
     * <p><b>204</b> - No Content
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @param gatewayId ID of the communication gateway to delete (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCommunicationGatewayWithHttpInfo(UUID gatewayId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gatewayId' when calling deleteCommunicationGateway");
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
        return apiClient.invokeAPI("/gateway/{gatewayId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get gateway by ID
     * requires gateway:read scope
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param gatewayId ID of the communication gateway to return (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object getCommunicationGatewayById(UUID gatewayId) throws RestClientException {
        return getCommunicationGatewayByIdWithHttpInfo(gatewayId).getBody();
    }

    /**
     * Get gateway by ID
     * requires gateway:read scope
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param gatewayId ID of the communication gateway to return (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getCommunicationGatewayByIdWithHttpInfo(UUID gatewayId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'gatewayId' is set
        if (gatewayId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gatewayId' when calling getCommunicationGatewayById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gatewayId", gatewayId);

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

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/gateway/{gatewayId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all communication gateways
     * requires gateway:read scope
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @param pageNumber The page number to retrieve (optional, default to 0)
     * @param pageSize The number of items per page (optional, default to 25)
     * @param friendlyName The friendly name to search for (optional)
     * @param endpointUrl The endpointUrl to search for (optional)
     * @return GetCommunicationGateways200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommunicationGateways200Response getCommunicationGateways(Integer pageNumber, Integer pageSize, String friendlyName, String endpointUrl) throws RestClientException {
        return getCommunicationGatewaysWithHttpInfo(pageNumber, pageSize, friendlyName, endpointUrl).getBody();
    }

    /**
     * Get all communication gateways
     * requires gateway:read scope
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * @param pageNumber The page number to retrieve (optional, default to 0)
     * @param pageSize The number of items per page (optional, default to 25)
     * @param friendlyName The friendly name to search for (optional)
     * @param endpointUrl The endpointUrl to search for (optional)
     * @return ResponseEntity&lt;GetCommunicationGateways200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommunicationGateways200Response> getCommunicationGatewaysWithHttpInfo(Integer pageNumber, Integer pageSize, String friendlyName, String endpointUrl) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "friendlyName", friendlyName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "endpointUrl", endpointUrl));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GetCommunicationGateways200Response> localReturnType = new ParameterizedTypeReference<GetCommunicationGateways200Response>() {};
        return apiClient.invokeAPI("/gateway", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a communication gateway
     * requires gateway:write scope
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param communicationGateway Communication gateway to update (required)
     * @return CommunicationGateway
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommunicationGateway updateCommunicationGateway(CommunicationGateway communicationGateway) throws RestClientException {
        return updateCommunicationGatewayWithHttpInfo(communicationGateway).getBody();
    }

    /**
     * Update a communication gateway
     * requires gateway:write scope
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorised
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param communicationGateway Communication gateway to update (required)
     * @return ResponseEntity&lt;CommunicationGateway&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommunicationGateway> updateCommunicationGatewayWithHttpInfo(CommunicationGateway communicationGateway) throws RestClientException {
        Object localVarPostBody = communicationGateway;
        
        // verify the required parameter 'communicationGateway' is set
        if (communicationGateway == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'communicationGateway' when calling updateCommunicationGateway");
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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<CommunicationGateway> localReturnType = new ParameterizedTypeReference<CommunicationGateway>() {};
        return apiClient.invokeAPI("/gateway", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
