package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CommonError;
import org.openapitools.client.model.ConfigCreateScheme;
import org.openapitools.client.model.ConfigScheme;
import org.openapitools.client.model.DeviceDataScheme;
import org.openapitools.client.model.DeviceInfoScheme;
import org.openapitools.client.model.DeviceNameScheme;
import org.openapitools.client.model.FirmwareScheme;
import org.openapitools.client.model.HTTPValidationError;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:22:58.353940352Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DeviceAutoRegistrationApi {
    private ApiClient apiClient;

    public DeviceAutoRegistrationApi() {
        this(new ApiClient());
    }

    public DeviceAutoRegistrationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Saving device configuration on the IoT platform
     * Used to back up user configurations on the IoT platform for future use
     * <p><b>201</b> - Successful Response
     * <p><b>403</b> - No access
     * <p><b>422</b> - Validation Error
     * @param configCreateScheme  (required)
     * @return ConfigScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConfigScheme addConfigAutoRegistrationConfigsPost(ConfigCreateScheme configCreateScheme) throws RestClientException {
        return addConfigAutoRegistrationConfigsPostWithHttpInfo(configCreateScheme).getBody();
    }

    /**
     * Saving device configuration on the IoT platform
     * Used to back up user configurations on the IoT platform for future use
     * <p><b>201</b> - Successful Response
     * <p><b>403</b> - No access
     * <p><b>422</b> - Validation Error
     * @param configCreateScheme  (required)
     * @return ResponseEntity&lt;ConfigScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ConfigScheme> addConfigAutoRegistrationConfigsPostWithHttpInfo(ConfigCreateScheme configCreateScheme) throws RestClientException {
        Object localVarPostBody = configCreateScheme;
        
        // verify the required parameter 'configCreateScheme' is set
        if (configCreateScheme == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'configCreateScheme' when calling addConfigAutoRegistrationConfigsPost");
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

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<ConfigScheme> localReturnType = new ParameterizedTypeReference<ConfigScheme>() {};
        return apiClient.invokeAPI("/auto-registration/configs/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Adds device to the IoT platform
     * Used to add a device to the IoT platform for further use. Should only be used after at least one log operation has been successfully completed.
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - No access
     * <p><b>422</b> - Validation Error
     * @param deviceNameScheme  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object addDeviceAutoRegistrationDevicesPost(DeviceNameScheme deviceNameScheme) throws RestClientException {
        return addDeviceAutoRegistrationDevicesPostWithHttpInfo(deviceNameScheme).getBody();
    }

    /**
     * Adds device to the IoT platform
     * Used to add a device to the IoT platform for further use. Should only be used after at least one log operation has been successfully completed.
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - No access
     * <p><b>422</b> - Validation Error
     * @param deviceNameScheme  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> addDeviceAutoRegistrationDevicesPostWithHttpInfo(DeviceNameScheme deviceNameScheme) throws RestClientException {
        Object localVarPostBody = deviceNameScheme;
        
        // verify the required parameter 'deviceNameScheme' is set
        if (deviceNameScheme == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deviceNameScheme' when calling addDeviceAutoRegistrationDevicesPost");
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

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/auto-registration/devices/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Sending device measurement data to the IoT platform
     * Used to send to the IoT platform measurements of accumulated by device for the period
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - No access
     * <p><b>422</b> - Validation Error
     * @param deviceDataScheme  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object dataPushAutoRegistrationDataPushPost(DeviceDataScheme deviceDataScheme) throws RestClientException {
        return dataPushAutoRegistrationDataPushPostWithHttpInfo(deviceDataScheme).getBody();
    }

    /**
     * Sending device measurement data to the IoT platform
     * Used to send to the IoT platform measurements of accumulated by device for the period
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - No access
     * <p><b>422</b> - Validation Error
     * @param deviceDataScheme  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> dataPushAutoRegistrationDataPushPostWithHttpInfo(DeviceDataScheme deviceDataScheme) throws RestClientException {
        Object localVarPostBody = deviceDataScheme;
        
        // verify the required parameter 'deviceDataScheme' is set
        if (deviceDataScheme == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deviceDataScheme' when calling dataPushAutoRegistrationDataPushPost");
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

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/auto-registration/data/push/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Log device information
     * Used to periodically log device information. Sent automatically when the configuration software is connected to the device
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - No access
     * <p><b>422</b> - Validation Error
     * @param deviceInfoScheme  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object deviceLogAutoRegistrationDevicesLogPost(DeviceInfoScheme deviceInfoScheme) throws RestClientException {
        return deviceLogAutoRegistrationDevicesLogPostWithHttpInfo(deviceInfoScheme).getBody();
    }

    /**
     * Log device information
     * Used to periodically log device information. Sent automatically when the configuration software is connected to the device
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - No access
     * <p><b>422</b> - Validation Error
     * @param deviceInfoScheme  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> deviceLogAutoRegistrationDevicesLogPostWithHttpInfo(DeviceInfoScheme deviceInfoScheme) throws RestClientException {
        Object localVarPostBody = deviceInfoScheme;
        
        // verify the required parameter 'deviceInfoScheme' is set
        if (deviceInfoScheme == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deviceInfoScheme' when calling deviceLogAutoRegistrationDevicesLogPost");
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

        String[] localVarAuthNames = new String[] { "APIKeyHeader" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/auto-registration/devices/log/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a single device configuration
     * Get a single device configuration saved on the IoT platform
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - No access
     * <p><b>404</b> - Config not found
     * <p><b>422</b> - Validation Error
     * @param id unique config id (required)
     * @return ConfigScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConfigScheme getConfigAutoRegistrationConfigsIdGet(Integer id) throws RestClientException {
        return getConfigAutoRegistrationConfigsIdGetWithHttpInfo(id).getBody();
    }

    /**
     * Get a single device configuration
     * Get a single device configuration saved on the IoT platform
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - No access
     * <p><b>404</b> - Config not found
     * <p><b>422</b> - Validation Error
     * @param id unique config id (required)
     * @return ResponseEntity&lt;ConfigScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ConfigScheme> getConfigAutoRegistrationConfigsIdGetWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getConfigAutoRegistrationConfigsIdGet");
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

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<ConfigScheme> localReturnType = new ParameterizedTypeReference<ConfigScheme>() {};
        return apiClient.invokeAPI("/auto-registration/configs/{id}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of device configurations
     * Get a list of device configurations saved on the IoT platform
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - No access
     * <p><b>422</b> - Validation Error
     * @param modelId device model identifier (required)
     * @param firmware device firmware version (required)
     * @param name the part of the device configuration name (search by name) (optional)
     * @return List&lt;ConfigScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ConfigScheme> getConfigsAutoRegistrationConfigsGet(Integer modelId, String firmware, String name) throws RestClientException {
        return getConfigsAutoRegistrationConfigsGetWithHttpInfo(modelId, firmware, name).getBody();
    }

    /**
     * Get a list of device configurations
     * Get a list of device configurations saved on the IoT platform
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - No access
     * <p><b>422</b> - Validation Error
     * @param modelId device model identifier (required)
     * @param firmware device firmware version (required)
     * @param name the part of the device configuration name (search by name) (optional)
     * @return ResponseEntity&lt;List&lt;ConfigScheme&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ConfigScheme>> getConfigsAutoRegistrationConfigsGetWithHttpInfo(Integer modelId, String firmware, String name) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'modelId' is set
        if (modelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'modelId' when calling getConfigsAutoRegistrationConfigsGet");
        }
        
        // verify the required parameter 'firmware' is set
        if (firmware == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'firmware' when calling getConfigsAutoRegistrationConfigsGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "model_id", modelId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "firmware", firmware));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<List<ConfigScheme>> localReturnType = new ParameterizedTypeReference<List<ConfigScheme>>() {};
        return apiClient.invokeAPI("/auto-registration/configs/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a firmware data
     * Get a firmware data available on the IoT platform
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - No access
     * <p><b>404</b> - Firmware not found
     * <p><b>422</b> - Validation Error
     * @param id unique firmware id (required)
     * @return FirmwareScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FirmwareScheme getFirmwareAutoRegistrationFirmwaresIdGet(Integer id) throws RestClientException {
        return getFirmwareAutoRegistrationFirmwaresIdGetWithHttpInfo(id).getBody();
    }

    /**
     * Get a firmware data
     * Get a firmware data available on the IoT platform
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - No access
     * <p><b>404</b> - Firmware not found
     * <p><b>422</b> - Validation Error
     * @param id unique firmware id (required)
     * @return ResponseEntity&lt;FirmwareScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FirmwareScheme> getFirmwareAutoRegistrationFirmwaresIdGetWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getFirmwareAutoRegistrationFirmwaresIdGet");
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

        String[] localVarAuthNames = new String[] { "APIKeyHeader" };

        ParameterizedTypeReference<FirmwareScheme> localReturnType = new ParameterizedTypeReference<FirmwareScheme>() {};
        return apiClient.invokeAPI("/auto-registration/firmwares/{id}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of firmwares
     * Get a list of firmware available on the IoT platform
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - No access
     * <p><b>422</b> - Validation Error
     * @param modelId device model identifier (required)
     * @param name the part of the firmware name (search by name) (optional)
     * @return List&lt;FirmwareScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<FirmwareScheme> getFirmwaresAutoRegistrationFirmwaresGet(Integer modelId, String name) throws RestClientException {
        return getFirmwaresAutoRegistrationFirmwaresGetWithHttpInfo(modelId, name).getBody();
    }

    /**
     * Get a list of firmwares
     * Get a list of firmware available on the IoT platform
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - No access
     * <p><b>422</b> - Validation Error
     * @param modelId device model identifier (required)
     * @param name the part of the firmware name (search by name) (optional)
     * @return ResponseEntity&lt;List&lt;FirmwareScheme&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<FirmwareScheme>> getFirmwaresAutoRegistrationFirmwaresGetWithHttpInfo(Integer modelId, String name) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'modelId' is set
        if (modelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'modelId' when calling getFirmwaresAutoRegistrationFirmwaresGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "model_id", modelId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "APIKeyHeader" };

        ParameterizedTypeReference<List<FirmwareScheme>> localReturnType = new ParameterizedTypeReference<List<FirmwareScheme>>() {};
        return apiClient.invokeAPI("/auto-registration/firmwares/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update device configuration on the IoT platform
     * Used to back up user configurations on the IoT platform for future use
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - No access
     * <p><b>404</b> - Config not found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @param configCreateScheme  (required)
     * @return ConfigScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConfigScheme updateConfigAutoRegistrationConfigsIdPut(Integer id, ConfigCreateScheme configCreateScheme) throws RestClientException {
        return updateConfigAutoRegistrationConfigsIdPutWithHttpInfo(id, configCreateScheme).getBody();
    }

    /**
     * Update device configuration on the IoT platform
     * Used to back up user configurations on the IoT platform for future use
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - No access
     * <p><b>404</b> - Config not found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @param configCreateScheme  (required)
     * @return ResponseEntity&lt;ConfigScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ConfigScheme> updateConfigAutoRegistrationConfigsIdPutWithHttpInfo(Integer id, ConfigCreateScheme configCreateScheme) throws RestClientException {
        Object localVarPostBody = configCreateScheme;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateConfigAutoRegistrationConfigsIdPut");
        }
        
        // verify the required parameter 'configCreateScheme' is set
        if (configCreateScheme == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'configCreateScheme' when calling updateConfigAutoRegistrationConfigsIdPut");
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

        String[] localVarAuthNames = new String[] { "HTTPBasic" };

        ParameterizedTypeReference<ConfigScheme> localReturnType = new ParameterizedTypeReference<ConfigScheme>() {};
        return apiClient.invokeAPI("/auto-registration/configs/{id}/", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
