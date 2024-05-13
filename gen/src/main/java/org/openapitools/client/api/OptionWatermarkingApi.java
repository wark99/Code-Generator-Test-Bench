package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut400Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut500Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdPut422Response;
import org.openapitools.client.model.Model1VideosChannelOptionsWatermarkGet200Response;

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
public class OptionWatermarkingApi {
    private ApiClient apiClient;

    public OptionWatermarkingApi() {
        this(new ApiClient());
    }

    public OptionWatermarkingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Disable watermark
     * This endpoint allows you to retrieve to enable the watermark.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1VideosChannelOptionsWatermarkGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelOptionsWatermarkGet200Response call1videosChannelOptionsWatermarkDisablePut(Integer channel, String with) throws RestClientException {
        return call1videosChannelOptionsWatermarkDisablePutWithHttpInfo(channel, with).getBody();
    }

    /**
     * Disable watermark
     * This endpoint allows you to retrieve to enable the watermark.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1VideosChannelOptionsWatermarkGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelOptionsWatermarkGet200Response> call1videosChannelOptionsWatermarkDisablePutWithHttpInfo(Integer channel, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsWatermarkDisablePut");
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

        ParameterizedTypeReference<Model1VideosChannelOptionsWatermarkGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelOptionsWatermarkGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options/watermark/disable", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Enabled watermark
     * This endpoint allows you to retrieve to enable the watermark.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1VideosChannelOptionsWatermarkGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelOptionsWatermarkGet200Response call1videosChannelOptionsWatermarkEnablePut(Integer channel, String with) throws RestClientException {
        return call1videosChannelOptionsWatermarkEnablePutWithHttpInfo(channel, with).getBody();
    }

    /**
     * Enabled watermark
     * This endpoint allows you to retrieve to enable the watermark.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1VideosChannelOptionsWatermarkGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelOptionsWatermarkGet200Response> call1videosChannelOptionsWatermarkEnablePutWithHttpInfo(Integer channel, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsWatermarkEnablePut");
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

        ParameterizedTypeReference<Model1VideosChannelOptionsWatermarkGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelOptionsWatermarkGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options/watermark/enable", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Return watermark
     * This endpoint allows you to retrieve to get the watermark.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1VideosChannelOptionsWatermarkGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelOptionsWatermarkGet200Response call1videosChannelOptionsWatermarkGet(Integer channel, String with) throws RestClientException {
        return call1videosChannelOptionsWatermarkGetWithHttpInfo(channel, with).getBody();
    }

    /**
     * Return watermark
     * This endpoint allows you to retrieve to get the watermark.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1VideosChannelOptionsWatermarkGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelOptionsWatermarkGet200Response> call1videosChannelOptionsWatermarkGetWithHttpInfo(Integer channel, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsWatermarkGet");
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

        ParameterizedTypeReference<Model1VideosChannelOptionsWatermarkGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelOptionsWatermarkGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options/watermark", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create watermark
     * This endpoint allows you to retrieve to create the watermark.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1VideosChannelOptionsWatermarkGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelOptionsWatermarkGet200Response call1videosChannelOptionsWatermarkPost(Integer channel, String with) throws RestClientException {
        return call1videosChannelOptionsWatermarkPostWithHttpInfo(channel, with).getBody();
    }

    /**
     * Create watermark
     * This endpoint allows you to retrieve to create the watermark.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1VideosChannelOptionsWatermarkGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelOptionsWatermarkGet200Response> call1videosChannelOptionsWatermarkPostWithHttpInfo(Integer channel, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsWatermarkPost");
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

        ParameterizedTypeReference<Model1VideosChannelOptionsWatermarkGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelOptionsWatermarkGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options/watermark", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update watermark
     * This endpoint allows you to retrieve to update the watermark.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1VideosChannelOptionsWatermarkGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelOptionsWatermarkGet200Response call1videosChannelOptionsWatermarkPut(Integer channel, String with) throws RestClientException {
        return call1videosChannelOptionsWatermarkPutWithHttpInfo(channel, with).getBody();
    }

    /**
     * Update watermark
     * This endpoint allows you to retrieve to update the watermark.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1VideosChannelOptionsWatermarkGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelOptionsWatermarkGet200Response> call1videosChannelOptionsWatermarkPutWithHttpInfo(Integer channel, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsWatermarkPut");
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

        ParameterizedTypeReference<Model1VideosChannelOptionsWatermarkGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelOptionsWatermarkGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options/watermark", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
