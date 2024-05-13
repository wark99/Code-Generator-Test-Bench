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
public class ShipyardApi {
    private ApiClient apiClient;

    public ShipyardApi() {
        this(new ApiClient());
    }

    public ShipyardApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Purchase a ship
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>404</b> - The header you enter does not exist. Please another system
     * @param shipType Enter a ship type (required)
     * @param waypointSymbol Enter a waypoint symbol (required)
     * @return System
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public System myShipsPost(String shipType, String waypointSymbol) throws RestClientException {
        return myShipsPostWithHttpInfo(shipType, waypointSymbol).getBody();
    }

    /**
     * Purchase a ship
     * 
     * <p><b>200</b> - Successful operation
     * <p><b>404</b> - The header you enter does not exist. Please another system
     * @param shipType Enter a ship type (required)
     * @param waypointSymbol Enter a waypoint symbol (required)
     * @return ResponseEntity&lt;System&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<System> myShipsPostWithHttpInfo(String shipType, String waypointSymbol) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'shipType' is set
        if (shipType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shipType' when calling myShipsPost");
        }
        
        // verify the required parameter 'waypointSymbol' is set
        if (waypointSymbol == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'waypointSymbol' when calling myShipsPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (shipType != null)
        localVarHeaderParams.add("shipType", apiClient.parameterToString(shipType));
        if (waypointSymbol != null)
        localVarHeaderParams.add("waypointSymbol", apiClient.parameterToString(waypointSymbol));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<System> localReturnType = new ParameterizedTypeReference<System>() {};
        return apiClient.invokeAPI("/my/ships", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
