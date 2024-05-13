package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.DevicesAutoConnectPostRequest;
import org.openapitools.client.model.DevicesConnectPost200Response;
import org.openapitools.client.model.DevicesConnectPostRequest;
import org.openapitools.client.model.DevicesStartGamePost200Response;
import org.openapitools.client.model.RecordsAddPost200Response;
import org.openapitools.client.model.RecordsAddPostRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:19:11.915359394Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * auto link device
     * used to link new device to client license when the device is launche
     * <p><b>200</b> - To test
     * @param devicesAutoConnectPostRequest  (required)
     * @return DevicesConnectPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DevicesConnectPost200Response devicesAutoConnectPost(DevicesAutoConnectPostRequest devicesAutoConnectPostRequest) throws RestClientException {
        return devicesAutoConnectPostWithHttpInfo(devicesAutoConnectPostRequest).getBody();
    }

    /**
     * auto link device
     * used to link new device to client license when the device is launche
     * <p><b>200</b> - To test
     * @param devicesAutoConnectPostRequest  (required)
     * @return ResponseEntity&lt;DevicesConnectPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DevicesConnectPost200Response> devicesAutoConnectPostWithHttpInfo(DevicesAutoConnectPostRequest devicesAutoConnectPostRequest) throws RestClientException {
        Object localVarPostBody = devicesAutoConnectPostRequest;
        
        // verify the required parameter 'devicesAutoConnectPostRequest' is set
        if (devicesAutoConnectPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'devicesAutoConnectPostRequest' when calling devicesAutoConnectPost");
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

        ParameterizedTypeReference<DevicesConnectPost200Response> localReturnType = new ParameterizedTypeReference<DevicesConnectPost200Response>() {};
        return apiClient.invokeAPI("/devices/auto_connect", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * link device
     * used to link new device to client license
     * <p><b>200</b> - To test
     * @param devicesConnectPostRequest  (required)
     * @return DevicesConnectPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DevicesConnectPost200Response devicesConnectPost(DevicesConnectPostRequest devicesConnectPostRequest) throws RestClientException {
        return devicesConnectPostWithHttpInfo(devicesConnectPostRequest).getBody();
    }

    /**
     * link device
     * used to link new device to client license
     * <p><b>200</b> - To test
     * @param devicesConnectPostRequest  (required)
     * @return ResponseEntity&lt;DevicesConnectPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DevicesConnectPost200Response> devicesConnectPostWithHttpInfo(DevicesConnectPostRequest devicesConnectPostRequest) throws RestClientException {
        Object localVarPostBody = devicesConnectPostRequest;
        
        // verify the required parameter 'devicesConnectPostRequest' is set
        if (devicesConnectPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'devicesConnectPostRequest' when calling devicesConnectPost");
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

        ParameterizedTypeReference<DevicesConnectPost200Response> localReturnType = new ParameterizedTypeReference<DevicesConnectPost200Response>() {};
        return apiClient.invokeAPI("/devices/connect", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * start game
     * used to start the game after the client presses the start session button
     * <p><b>200</b> - To test
     * @param devicesAutoConnectPostRequest  (required)
     * @return DevicesStartGamePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DevicesStartGamePost200Response devicesStartGamePost(DevicesAutoConnectPostRequest devicesAutoConnectPostRequest) throws RestClientException {
        return devicesStartGamePostWithHttpInfo(devicesAutoConnectPostRequest).getBody();
    }

    /**
     * start game
     * used to start the game after the client presses the start session button
     * <p><b>200</b> - To test
     * @param devicesAutoConnectPostRequest  (required)
     * @return ResponseEntity&lt;DevicesStartGamePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DevicesStartGamePost200Response> devicesStartGamePostWithHttpInfo(DevicesAutoConnectPostRequest devicesAutoConnectPostRequest) throws RestClientException {
        Object localVarPostBody = devicesAutoConnectPostRequest;
        
        // verify the required parameter 'devicesAutoConnectPostRequest' is set
        if (devicesAutoConnectPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'devicesAutoConnectPostRequest' when calling devicesStartGamePost");
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

        ParameterizedTypeReference<DevicesStartGamePost200Response> localReturnType = new ParameterizedTypeReference<DevicesStartGamePost200Response>() {};
        return apiClient.invokeAPI("/devices/start_game", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * add playing recored
     * used after finishing the game to record the player results in the database
     * <p><b>200</b> - To test
     * @param recordsAddPostRequest  (required)
     * @return RecordsAddPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RecordsAddPost200Response recordsAddPost(RecordsAddPostRequest recordsAddPostRequest) throws RestClientException {
        return recordsAddPostWithHttpInfo(recordsAddPostRequest).getBody();
    }

    /**
     * add playing recored
     * used after finishing the game to record the player results in the database
     * <p><b>200</b> - To test
     * @param recordsAddPostRequest  (required)
     * @return ResponseEntity&lt;RecordsAddPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RecordsAddPost200Response> recordsAddPostWithHttpInfo(RecordsAddPostRequest recordsAddPostRequest) throws RestClientException {
        Object localVarPostBody = recordsAddPostRequest;
        
        // verify the required parameter 'recordsAddPostRequest' is set
        if (recordsAddPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recordsAddPostRequest' when calling recordsAddPost");
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

        ParameterizedTypeReference<RecordsAddPost200Response> localReturnType = new ParameterizedTypeReference<RecordsAddPost200Response>() {};
        return apiClient.invokeAPI("/records/add", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
