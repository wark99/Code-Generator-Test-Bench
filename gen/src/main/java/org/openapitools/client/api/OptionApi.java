package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut400Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response;
import org.openapitools.client.model.Model1VideosChannelOptionsGet200Response;
import org.openapitools.client.model.Model1VideosChannelOptionsVideoOptionGet200Response;

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
public class OptionApi {
    private ApiClient apiClient;

    public OptionApi() {
        this(new ApiClient());
    }

    public OptionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List option
     * This endpoint allows you to retrieve to see all option of the  channel.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1VideosChannelOptionsGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelOptionsGet200Response call1videosChannelOptionsGet(Integer channel, String with) throws RestClientException {
        return call1videosChannelOptionsGetWithHttpInfo(channel, with).getBody();
    }

    /**
     * List option
     * This endpoint allows you to retrieve to see all option of the  channel.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1VideosChannelOptionsGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelOptionsGet200Response> call1videosChannelOptionsGetWithHttpInfo(Integer channel, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsGet");
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

        ParameterizedTypeReference<Model1VideosChannelOptionsGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelOptionsGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Return option
     * This endpoint allows you to retrieve option.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param videoOption  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1VideosChannelOptionsVideoOptionGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelOptionsVideoOptionGet200Response call1videosChannelOptionsVideoOptionGet(Integer channel, String videoOption, String with) throws RestClientException {
        return call1videosChannelOptionsVideoOptionGetWithHttpInfo(channel, videoOption, with).getBody();
    }

    /**
     * Return option
     * This endpoint allows you to retrieve option.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param videoOption  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1VideosChannelOptionsVideoOptionGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelOptionsVideoOptionGet200Response> call1videosChannelOptionsVideoOptionGetWithHttpInfo(Integer channel, String videoOption, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsVideoOptionGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("video_option", videoOption);

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

        ParameterizedTypeReference<Model1VideosChannelOptionsVideoOptionGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelOptionsVideoOptionGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options/{video_option}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Undertake option
     * This WILL NOT restore an option effectively terminated, regardless of whether the option has been instantly terminated or its termination date has been reached.  If the given option has already been marked for termination for the given channel then this won&#39;t do anything.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param videoOption  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1videosChannelOptionsVideoOptionRecommitPut(Integer channel, String videoOption, String with) throws RestClientException {
        return call1videosChannelOptionsVideoOptionRecommitPutWithHttpInfo(channel, videoOption, with).getBody();
    }

    /**
     * Undertake option
     * This WILL NOT restore an option effectively terminated, regardless of whether the option has been instantly terminated or its termination date has been reached.  If the given option has already been marked for termination for the given channel then this won&#39;t do anything.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param videoOption  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1videosChannelOptionsVideoOptionRecommitPutWithHttpInfo(Integer channel, String videoOption, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsVideoOptionRecommitPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("video_option", videoOption);

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
        return apiClient.invokeAPI("/1/videos/{channel}/options/{video_option}/recommit", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Terminate option
     * This endpoint allows you to retrieve to terminate the option.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param videoOption  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1videosChannelOptionsVideoOptionTerminateDelete(Integer channel, String videoOption, String with) throws RestClientException {
        return call1videosChannelOptionsVideoOptionTerminateDeleteWithHttpInfo(channel, videoOption, with).getBody();
    }

    /**
     * Terminate option
     * This endpoint allows you to retrieve to terminate the option.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param videoOption  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response> call1videosChannelOptionsVideoOptionTerminateDeleteWithHttpInfo(Integer channel, String videoOption, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsVideoOptionTerminateDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("video_option", videoOption);

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
        return apiClient.invokeAPI("/1/videos/{channel}/options/{video_option}/terminate", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
