package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.System;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:22:09.429563733Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SymbolSystemApi {
    private ApiClient apiClient;

    public SymbolSystemApi() {
        this(new ApiClient());
    }

    public SymbolSystemApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get all available Systems
     * Getting all Systems in SpaceInvader 
     * <p><b>200</b> - All Systems Resulat
     * <p><b>500</b> - Server Error
     * @return List&lt;System&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<System> searchInventory() throws RestClientException {
        return searchInventoryWithHttpInfo().getBody();
    }

    /**
     * Get all available Systems
     * Getting all Systems in SpaceInvader 
     * <p><b>200</b> - All Systems Resulat
     * <p><b>500</b> - Server Error
     * @return ResponseEntity&lt;List&lt;System&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<System>> searchInventoryWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<List<System>> localReturnType = new ParameterizedTypeReference<List<System>>() {};
        return apiClient.invokeAPI("/systems", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all information about a specific system
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>404</b> - The system you enter does not exist. Please another system
     * @param systemSymbol Enter a symbol of a system (required)
     * @return System
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public System systemsSystemSymbolGet(String systemSymbol) throws RestClientException {
        return systemsSystemSymbolGetWithHttpInfo(systemSymbol).getBody();
    }

    /**
     * Get all information about a specific system
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>404</b> - The system you enter does not exist. Please another system
     * @param systemSymbol Enter a symbol of a system (required)
     * @return ResponseEntity&lt;System&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<System> systemsSystemSymbolGetWithHttpInfo(String systemSymbol) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'systemSymbol' is set
        if (systemSymbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'systemSymbol' when calling systemsSystemSymbolGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "systemSymbol", systemSymbol));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<System> localReturnType = new ParameterizedTypeReference<System>() {};
        return apiClient.invokeAPI("/systems/systemSymbol", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all information about a specific system
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>404</b> - The system you enter does not exist. Please another system
     * @param systemSymbol Enter a symbol of a systems (required)
     * @return System
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public System systemsSystemSymbolWaypointsGet(String systemSymbol) throws RestClientException {
        return systemsSystemSymbolWaypointsGetWithHttpInfo(systemSymbol).getBody();
    }

    /**
     * Get all information about a specific system
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>404</b> - The system you enter does not exist. Please another system
     * @param systemSymbol Enter a symbol of a systems (required)
     * @return ResponseEntity&lt;System&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<System> systemsSystemSymbolWaypointsGetWithHttpInfo(String systemSymbol) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'systemSymbol' is set
        if (systemSymbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'systemSymbol' when calling systemsSystemSymbolWaypointsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("systemSymbol", systemSymbol);

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

        ParameterizedTypeReference<System> localReturnType = new ParameterizedTypeReference<System>() {};
        return apiClient.invokeAPI("/systems/{systemSymbol}/waypoints", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all information about a specific system
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>404</b> - The system you enter does not exist. Please another system
     * @param systemSymbol Enter a systemSymbol of a systems (required)
     * @param symbol Enter a systemSymbol of a systems (required)
     * @return System
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public System systemsSystemSymbolWaypointsSymbolShipyardGet(String systemSymbol, String symbol) throws RestClientException {
        return systemsSystemSymbolWaypointsSymbolShipyardGetWithHttpInfo(systemSymbol, symbol).getBody();
    }

    /**
     * Get all information about a specific system
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>404</b> - The system you enter does not exist. Please another system
     * @param systemSymbol Enter a systemSymbol of a systems (required)
     * @param symbol Enter a systemSymbol of a systems (required)
     * @return ResponseEntity&lt;System&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<System> systemsSystemSymbolWaypointsSymbolShipyardGetWithHttpInfo(String systemSymbol, String symbol) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'systemSymbol' is set
        if (systemSymbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'systemSymbol' when calling systemsSystemSymbolWaypointsSymbolShipyardGet");
        }
        
        // verify the required parameter 'symbol' is set
        if (symbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'symbol' when calling systemsSystemSymbolWaypointsSymbolShipyardGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("systemSymbol", systemSymbol);
        uriVariables.put("symbol", symbol);

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

        ParameterizedTypeReference<System> localReturnType = new ParameterizedTypeReference<System>() {};
        return apiClient.invokeAPI("/systems/{systemSymbol}/waypoints/{symbol}/shipyard", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
