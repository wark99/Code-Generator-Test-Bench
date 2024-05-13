package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut400Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response;
import org.openapitools.client.model.Model1VideosChannelOptionsRecordingStorageGet200Response;
import org.openapitools.client.model.Model1VideosChannelOptionsRecordingStoragePost201Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OptionRecordStorageApi {
    private ApiClient apiClient;

    public OptionRecordStorageApi() {
        this(new ApiClient());
    }

    public OptionRecordStorageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Lists all storage machine
     * This endpoint allows you to retrieve all storage machine.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1VideosChannelOptionsRecordingStorageGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelOptionsRecordingStorageGet200Response call1videosChannelOptionsRecordingStorageGet(Integer channel, String with) throws RestClientException {
        return call1videosChannelOptionsRecordingStorageGetWithHttpInfo(channel, with).getBody();
    }

    /**
     * Lists all storage machine
     * This endpoint allows you to retrieve all storage machine.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1VideosChannelOptionsRecordingStorageGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelOptionsRecordingStorageGet200Response> call1videosChannelOptionsRecordingStorageGetWithHttpInfo(Integer channel, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsRecordingStorageGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1VideosChannelOptionsRecordingStorageGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelOptionsRecordingStorageGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options/recording/storage", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Return a storage machine
     * This endpoint allows you to create a new storage machine.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1VideosChannelOptionsRecordingStoragePost201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelOptionsRecordingStoragePost201Response call1videosChannelOptionsRecordingStoragePost(Integer channel, String with) throws RestClientException {
        return call1videosChannelOptionsRecordingStoragePostWithHttpInfo(channel, with).getBody();
    }

    /**
     * Return a storage machine
     * This endpoint allows you to create a new storage machine.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1VideosChannelOptionsRecordingStoragePost201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelOptionsRecordingStoragePost201Response> call1videosChannelOptionsRecordingStoragePostWithHttpInfo(Integer channel, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsRecordingStoragePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1VideosChannelOptionsRecordingStoragePost201Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelOptionsRecordingStoragePost201Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options/recording/storage", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a storage machine
     * This endpoint allows you to test a storage machine.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1videosChannelOptionsRecordingStorageTestPost(Integer channel, String with) throws RestClientException {
        return call1videosChannelOptionsRecordingStorageTestPostWithHttpInfo(channel, with).getBody();
    }

    /**
     * Update a storage machine
     * This endpoint allows you to test a storage machine.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1videosChannelOptionsRecordingStorageTestPostWithHttpInfo(Integer channel, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsRecordingStorageTestPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options/recording/storage/test", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a storage machine
     * This endpoint allows you to delete a storage machine.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param videoStorageMachine  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1videosChannelOptionsRecordingStorageVideoStorageMachineDelete(Integer channel, String videoStorageMachine, String with) throws RestClientException {
        return call1videosChannelOptionsRecordingStorageVideoStorageMachineDeleteWithHttpInfo(channel, videoStorageMachine, with).getBody();
    }

    /**
     * Update a storage machine
     * This endpoint allows you to delete a storage machine.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param videoStorageMachine  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1videosChannelOptionsRecordingStorageVideoStorageMachineDeleteWithHttpInfo(Integer channel, String videoStorageMachine, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsRecordingStorageVideoStorageMachineDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("video_storage_machine", videoStorageMachine);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options/recording/storage/{video_storage_machine}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a storage machine
     * This endpoint allows you to retrieve a storage machine.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param videoStorageMachine  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1VideosChannelOptionsRecordingStoragePost201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelOptionsRecordingStoragePost201Response call1videosChannelOptionsRecordingStorageVideoStorageMachineGet(Integer channel, String videoStorageMachine, String with) throws RestClientException {
        return call1videosChannelOptionsRecordingStorageVideoStorageMachineGetWithHttpInfo(channel, videoStorageMachine, with).getBody();
    }

    /**
     * Create a storage machine
     * This endpoint allows you to retrieve a storage machine.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param videoStorageMachine  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1VideosChannelOptionsRecordingStoragePost201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelOptionsRecordingStoragePost201Response> call1videosChannelOptionsRecordingStorageVideoStorageMachineGetWithHttpInfo(Integer channel, String videoStorageMachine, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsRecordingStorageVideoStorageMachineGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("video_storage_machine", videoStorageMachine);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1VideosChannelOptionsRecordingStoragePost201Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelOptionsRecordingStoragePost201Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options/recording/storage/{video_storage_machine}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a storage machine
     * This endpoint allows you to update a storage machine.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param videoStorageMachine  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1VideosChannelOptionsRecordingStoragePost201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelOptionsRecordingStoragePost201Response call1videosChannelOptionsRecordingStorageVideoStorageMachinePut(Integer channel, String videoStorageMachine, String with) throws RestClientException {
        return call1videosChannelOptionsRecordingStorageVideoStorageMachinePutWithHttpInfo(channel, videoStorageMachine, with).getBody();
    }

    /**
     * Update a storage machine
     * This endpoint allows you to update a storage machine.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param videoStorageMachine  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1VideosChannelOptionsRecordingStoragePost201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelOptionsRecordingStoragePost201Response> call1videosChannelOptionsRecordingStorageVideoStorageMachinePutWithHttpInfo(Integer channel, String videoStorageMachine, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsRecordingStorageVideoStorageMachinePut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("video_storage_machine", videoStorageMachine);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1VideosChannelOptionsRecordingStoragePost201Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelOptionsRecordingStoragePost201Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options/recording/storage/{video_storage_machine}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
