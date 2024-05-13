package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.DataPostRequest;
import org.openapitools.client.model.HostnameLedPatchRequest;
import org.openapitools.client.model.IdracPostRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:15:49.424217909Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * Handles incoming data and process them.
     * 
     * <p><b>200</b> - Success, data processed.
     * <p><b>400</b> - Some fields are missing in the provided data.
     * <p><b>403</b> - Invalid keyring provided.
     * @param dataPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void dataPost(DataPostRequest dataPostRequest) throws RestClientException {
        dataPostWithHttpInfo(dataPostRequest);
    }

    /**
     * Handles incoming data and process them.
     * 
     * <p><b>200</b> - Success, data processed.
     * <p><b>400</b> - Some fields are missing in the provided data.
     * <p><b>403</b> - Invalid keyring provided.
     * @param dataPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> dataPostWithHttpInfo(DataPostRequest dataPostRequest) throws RestClientException {
        Object localVarPostBody = dataPostRequest;
        
        // verify the required parameter 'dataPostRequest' is set
        if (dataPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dataPostRequest' when calling dataPost");
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
        return apiClient.invokeAPI("/data", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the report of critical components.
     * 
     * <p><b>200</b> - Success, critical report returned.
     * <p><b>404</b> - The passed hostname was not found.
     * @param hostname  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void hostnameCriticalsGet(String hostname) throws RestClientException {
        hostnameCriticalsGetWithHttpInfo(hostname);
    }

    /**
     * Get the report of critical components.
     * 
     * <p><b>200</b> - Success, critical report returned.
     * <p><b>404</b> - The passed hostname was not found.
     * @param hostname  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> hostnameCriticalsGetWithHttpInfo(String hostname) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'hostname' is set
        if (hostname == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hostname' when calling hostnameCriticalsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hostname", hostname);

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
        return apiClient.invokeAPI("/{hostname}/criticals", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the fan report.
     * 
     * <p><b>200</b> - Success, fan report returned.
     * <p><b>404</b> - The passed hostname was not found.
     * @param hostname  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void hostnameFansGet(String hostname) throws RestClientException {
        hostnameFansGetWithHttpInfo(hostname);
    }

    /**
     * Get the fan report.
     * 
     * <p><b>200</b> - Success, fan report returned.
     * <p><b>404</b> - The passed hostname was not found.
     * @param hostname  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> hostnameFansGetWithHttpInfo(String hostname) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'hostname' is set
        if (hostname == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hostname' when calling hostnameFansGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hostname", hostname);

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
        return apiClient.invokeAPI("/{hostname}/fans", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the firmware report.
     * 
     * <p><b>200</b> - Success, firmware report returned.
     * <p><b>404</b> - The passed hostname was not found.
     * @param hostname  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void hostnameFirmwaresGet(String hostname) throws RestClientException {
        hostnameFirmwaresGetWithHttpInfo(hostname);
    }

    /**
     * Get the firmware report.
     * 
     * <p><b>200</b> - Success, firmware report returned.
     * <p><b>404</b> - The passed hostname was not found.
     * @param hostname  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> hostnameFirmwaresGetWithHttpInfo(String hostname) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'hostname' is set
        if (hostname == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hostname' when calling hostnameFirmwaresGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hostname", hostname);

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
        return apiClient.invokeAPI("/{hostname}/firmwares", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the full report.
     * 
     * <p><b>200</b> - Success, full report returned.
     * <p><b>404</b> - The passed hostname was not found.
     * @param hostname  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void hostnameFullreportGet(String hostname) throws RestClientException {
        hostnameFullreportGetWithHttpInfo(hostname);
    }

    /**
     * Get the full report.
     * 
     * <p><b>200</b> - Success, full report returned.
     * <p><b>404</b> - The passed hostname was not found.
     * @param hostname  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> hostnameFullreportGetWithHttpInfo(String hostname) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'hostname' is set
        if (hostname == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hostname' when calling hostnameFullreportGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hostname", hostname);

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
        return apiClient.invokeAPI("/{hostname}/fullreport", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the current state of enclosure LED for the specified hostname.
     * 
     * <p><b>200</b> - Success, led current status returned.
     * @param hostname  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void hostnameLedGet(String hostname) throws RestClientException {
        hostnameLedGetWithHttpInfo(hostname);
    }

    /**
     * Get the current state of enclosure LED for the specified hostname.
     * 
     * <p><b>200</b> - Success, led current status returned.
     * @param hostname  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> hostnameLedGetWithHttpInfo(String hostname) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'hostname' is set
        if (hostname == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hostname' when calling hostnameLedGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hostname", hostname);

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
        return apiClient.invokeAPI("/{hostname}/led", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Set enclosure LED status for the specified hostname.
     * 
     * <p><b>200</b> - Success, led state changed.
     * <p><b>400</b> - Some fields are missing in the provided data.
     * <p><b>403</b> - Invalid keyring provided.
     * <p><b>501</b> - No hostname has been passed. (Not implemented)
     * <p><b>502</b> - The endpoint is unreachable.
     * @param hostname  (required)
     * @param hostnameLedPatchRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void hostnameLedPatch(String hostname, HostnameLedPatchRequest hostnameLedPatchRequest) throws RestClientException {
        hostnameLedPatchWithHttpInfo(hostname, hostnameLedPatchRequest);
    }

    /**
     * Set enclosure LED status for the specified hostname.
     * 
     * <p><b>200</b> - Success, led state changed.
     * <p><b>400</b> - Some fields are missing in the provided data.
     * <p><b>403</b> - Invalid keyring provided.
     * <p><b>501</b> - No hostname has been passed. (Not implemented)
     * <p><b>502</b> - The endpoint is unreachable.
     * @param hostname  (required)
     * @param hostnameLedPatchRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> hostnameLedPatchWithHttpInfo(String hostname, HostnameLedPatchRequest hostnameLedPatchRequest) throws RestClientException {
        Object localVarPostBody = hostnameLedPatchRequest;
        
        // verify the required parameter 'hostname' is set
        if (hostname == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hostname' when calling hostnameLedPatch");
        }
        
        // verify the required parameter 'hostnameLedPatchRequest' is set
        if (hostnameLedPatchRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hostnameLedPatchRequest' when calling hostnameLedPatch");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hostname", hostname);

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
        return apiClient.invokeAPI("/{hostname}/led", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the memory report.
     * 
     * <p><b>200</b> - Success, memory report returned.
     * <p><b>404</b> - The passed hostname was not found.
     * @param hostname  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void hostnameMemoryGet(String hostname) throws RestClientException {
        hostnameMemoryGetWithHttpInfo(hostname);
    }

    /**
     * Get the memory report.
     * 
     * <p><b>200</b> - Success, memory report returned.
     * <p><b>404</b> - The passed hostname was not found.
     * @param hostname  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> hostnameMemoryGetWithHttpInfo(String hostname) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'hostname' is set
        if (hostname == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hostname' when calling hostnameMemoryGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hostname", hostname);

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
        return apiClient.invokeAPI("/{hostname}/memory", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the report for network hardware.
     * 
     * <p><b>200</b> - Success, report for network hardware returned.
     * <p><b>404</b> - The passed hostname was not found.
     * @param hostname  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void hostnameNetworkGet(String hostname) throws RestClientException {
        hostnameNetworkGetWithHttpInfo(hostname);
    }

    /**
     * Get the report for network hardware.
     * 
     * <p><b>200</b> - Success, report for network hardware returned.
     * <p><b>404</b> - The passed hostname was not found.
     * @param hostname  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> hostnameNetworkGetWithHttpInfo(String hostname) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'hostname' is set
        if (hostname == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hostname' when calling hostnameNetworkGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hostname", hostname);

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
        return apiClient.invokeAPI("/{hostname}/network", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the power supply report.
     * 
     * <p><b>200</b> - Success, power supply hardware report returned.
     * <p><b>404</b> - The passed hostname was not found.
     * @param hostname  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void hostnamePowerGet(String hostname) throws RestClientException {
        hostnamePowerGetWithHttpInfo(hostname);
    }

    /**
     * Get the power supply report.
     * 
     * <p><b>200</b> - Success, power supply hardware report returned.
     * <p><b>404</b> - The passed hostname was not found.
     * @param hostname  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> hostnamePowerGetWithHttpInfo(String hostname) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'hostname' is set
        if (hostname == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hostname' when calling hostnamePowerGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hostname", hostname);

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
        return apiClient.invokeAPI("/{hostname}/power", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the cpu report.
     * 
     * <p><b>200</b> - Success, cpu report returned.
     * <p><b>404</b> - The passed hostname was not found.
     * @param hostname  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void hostnameProcessorsGet(String hostname) throws RestClientException {
        hostnameProcessorsGetWithHttpInfo(hostname);
    }

    /**
     * Get the cpu report.
     * 
     * <p><b>200</b> - Success, cpu report returned.
     * <p><b>404</b> - The passed hostname was not found.
     * @param hostname  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> hostnameProcessorsGetWithHttpInfo(String hostname) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'hostname' is set
        if (hostname == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hostname' when calling hostnameProcessorsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hostname", hostname);

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
        return apiClient.invokeAPI("/{hostname}/processors", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the storage disks report for.
     * 
     * <p><b>200</b> - Success, storage disks report returned.
     * <p><b>404</b> - The passed hostname was not found.
     * @param hostname  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void hostnameStorageGet(String hostname) throws RestClientException {
        hostnameStorageGetWithHttpInfo(hostname);
    }

    /**
     * Get the storage disks report for.
     * 
     * <p><b>200</b> - Success, storage disks report returned.
     * <p><b>404</b> - The passed hostname was not found.
     * @param hostname  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> hostnameStorageGetWithHttpInfo(String hostname) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'hostname' is set
        if (hostname == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hostname' when calling hostnameStorageGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hostname", hostname);

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
        return apiClient.invokeAPI("/{hostname}/storage", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the a brief summary of hardware status.
     * 
     * <p><b>200</b> - Success, summary report returned.
     * <p><b>404</b> - The passed hostname was not found.
     * @param hostname  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void hostnameSummaryGet(String hostname) throws RestClientException {
        hostnameSummaryGetWithHttpInfo(hostname);
    }

    /**
     * Get the a brief summary of hardware status.
     * 
     * <p><b>200</b> - Success, summary report returned.
     * <p><b>404</b> - The passed hostname was not found.
     * @param hostname  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> hostnameSummaryGetWithHttpInfo(String hostname) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'hostname' is set
        if (hostname == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hostname' when calling hostnameSummaryGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hostname", hostname);

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
        return apiClient.invokeAPI("/{hostname}/summary", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the iDrac details for a given host.
     * 
     * <p><b>200</b> - Success, return idrac details.
     * <p><b>400</b> - Some fields are missing in the provided data.
     * <p><b>403</b> - Invalid keyring provided.
     * <p><b>502</b> - The cephadm agent isn&#39;t running on the node.
     * @param idracPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void idracPost(IdracPostRequest idracPostRequest) throws RestClientException {
        idracPostWithHttpInfo(idracPostRequest);
    }

    /**
     * Get the iDrac details for a given host.
     * 
     * <p><b>200</b> - Success, return idrac details.
     * <p><b>400</b> - Some fields are missing in the provided data.
     * <p><b>403</b> - Invalid keyring provided.
     * <p><b>502</b> - The cephadm agent isn&#39;t running on the node.
     * @param idracPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> idracPostWithHttpInfo(IdracPostRequest idracPostRequest) throws RestClientException {
        Object localVarPostBody = idracPostRequest;
        
        // verify the required parameter 'idracPostRequest' is set
        if (idracPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idracPostRequest' when calling idracPost");
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
        return apiClient.invokeAPI("/idrac", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
