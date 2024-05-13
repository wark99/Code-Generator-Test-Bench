package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1VideosChannelOptionsTimeshiftGet200Response;

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
public class OptionTimeshiftApi {
    private ApiClient apiClient;

    public OptionTimeshiftApi() {
        this(new ApiClient());
    }

    public OptionTimeshiftApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Return timeshift config
     * This endpoint allows you to retrieve to get a timeshift config.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1VideosChannelOptionsTimeshiftGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelOptionsTimeshiftGet200Response call1videosChannelOptionsTimeshiftGet(Integer channel, String with) throws RestClientException {
        return call1videosChannelOptionsTimeshiftGetWithHttpInfo(channel, with).getBody();
    }

    /**
     * Return timeshift config
     * This endpoint allows you to retrieve to get a timeshift config.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1VideosChannelOptionsTimeshiftGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelOptionsTimeshiftGet200Response> call1videosChannelOptionsTimeshiftGetWithHttpInfo(Integer channel, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsTimeshiftGet");
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

        ParameterizedTypeReference<Model1VideosChannelOptionsTimeshiftGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelOptionsTimeshiftGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options/timeshift", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a timeshift config.
     * This endpoint allows you to retrieve to create a timeshift config.
     * <p><b>201</b> - Created
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1VideosChannelOptionsTimeshiftGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelOptionsTimeshiftGet200Response call1videosChannelOptionsTimeshiftPost(Integer channel, String with) throws RestClientException {
        return call1videosChannelOptionsTimeshiftPostWithHttpInfo(channel, with).getBody();
    }

    /**
     * Create a timeshift config.
     * This endpoint allows you to retrieve to create a timeshift config.
     * <p><b>201</b> - Created
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1VideosChannelOptionsTimeshiftGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelOptionsTimeshiftGet200Response> call1videosChannelOptionsTimeshiftPostWithHttpInfo(Integer channel, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsTimeshiftPost");
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

        ParameterizedTypeReference<Model1VideosChannelOptionsTimeshiftGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelOptionsTimeshiftGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options/timeshift", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a timeshift config
     * This endpoint allows you to retrieve to update a timeshift config.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1VideosChannelOptionsTimeshiftGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelOptionsTimeshiftGet200Response call1videosChannelOptionsTimeshiftPut(Integer channel, String with) throws RestClientException {
        return call1videosChannelOptionsTimeshiftPutWithHttpInfo(channel, with).getBody();
    }

    /**
     * Update a timeshift config
     * This endpoint allows you to retrieve to update a timeshift config.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1VideosChannelOptionsTimeshiftGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelOptionsTimeshiftGet200Response> call1videosChannelOptionsTimeshiftPutWithHttpInfo(Integer channel, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelOptionsTimeshiftPut");
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

        ParameterizedTypeReference<Model1VideosChannelOptionsTimeshiftGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelOptionsTimeshiftGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/options/timeshift", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
