package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ClientsAddDeviceGet200Response;
import org.openapitools.client.model.ClientsListDevicesGet200Response;
import org.openapitools.client.model.ClientsLoginPost200Response;
import org.openapitools.client.model.ClientsLoginPostRequest;
import org.openapitools.client.model.ClientsStartSessionPostRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:19:04.981860060Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * add new device 
     * add new device to client license using the generated code
     * <p><b>200</b> - the generated code
     * @return ClientsAddDeviceGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ClientsAddDeviceGet200Response clientsAddDeviceGet() throws RestClientException {
        return clientsAddDeviceGetWithHttpInfo().getBody();
    }

    /**
     * add new device 
     * add new device to client license using the generated code
     * <p><b>200</b> - the generated code
     * @return ResponseEntity&lt;ClientsAddDeviceGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ClientsAddDeviceGet200Response> clientsAddDeviceGetWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<ClientsAddDeviceGet200Response> localReturnType = new ParameterizedTypeReference<ClientsAddDeviceGet200Response>() {};
        return apiClient.invokeAPI("/clients/add_device", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * list devices
     * list all devices connected to client
     * <p><b>200</b> - devices list
     * @return ClientsListDevicesGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ClientsListDevicesGet200Response clientsListDevicesGet() throws RestClientException {
        return clientsListDevicesGetWithHttpInfo().getBody();
    }

    /**
     * list devices
     * list all devices connected to client
     * <p><b>200</b> - devices list
     * @return ResponseEntity&lt;ClientsListDevicesGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ClientsListDevicesGet200Response> clientsListDevicesGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "array"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ClientsListDevicesGet200Response> localReturnType = new ParameterizedTypeReference<ClientsListDevicesGet200Response>() {};
        return apiClient.invokeAPI("/clients/list_devices", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * client login
     * login using pocketbase auth with password and username
     * <p><b>200</b> - To test
     * @param clientsLoginPostRequest  (required)
     * @return ClientsLoginPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ClientsLoginPost200Response clientsLoginPost(ClientsLoginPostRequest clientsLoginPostRequest) throws RestClientException {
        return clientsLoginPostWithHttpInfo(clientsLoginPostRequest).getBody();
    }

    /**
     * client login
     * login using pocketbase auth with password and username
     * <p><b>200</b> - To test
     * @param clientsLoginPostRequest  (required)
     * @return ResponseEntity&lt;ClientsLoginPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ClientsLoginPost200Response> clientsLoginPostWithHttpInfo(ClientsLoginPostRequest clientsLoginPostRequest) throws RestClientException {
        Object localVarPostBody = clientsLoginPostRequest;
        
        // verify the required parameter 'clientsLoginPostRequest' is set
        if (clientsLoginPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientsLoginPostRequest' when calling clientsLoginPost");
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ClientsLoginPost200Response> localReturnType = new ParameterizedTypeReference<ClientsLoginPost200Response>() {};
        return apiClient.invokeAPI("/clients/login", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * start game session
     * start game session so the player can start the game from device
     * <p><b>200</b> - To test
     * @param clientsStartSessionPostRequest  (required)
     * @return ClientsLoginPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ClientsLoginPost200Response clientsStartSessionPost(ClientsStartSessionPostRequest clientsStartSessionPostRequest) throws RestClientException {
        return clientsStartSessionPostWithHttpInfo(clientsStartSessionPostRequest).getBody();
    }

    /**
     * start game session
     * start game session so the player can start the game from device
     * <p><b>200</b> - To test
     * @param clientsStartSessionPostRequest  (required)
     * @return ResponseEntity&lt;ClientsLoginPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ClientsLoginPost200Response> clientsStartSessionPostWithHttpInfo(ClientsStartSessionPostRequest clientsStartSessionPostRequest) throws RestClientException {
        Object localVarPostBody = clientsStartSessionPostRequest;
        
        // verify the required parameter 'clientsStartSessionPostRequest' is set
        if (clientsStartSessionPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientsStartSessionPostRequest' when calling clientsStartSessionPost");
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ClientsLoginPost200Response> localReturnType = new ParameterizedTypeReference<ClientsLoginPost200Response>() {};
        return apiClient.invokeAPI("/clients/start_session", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
