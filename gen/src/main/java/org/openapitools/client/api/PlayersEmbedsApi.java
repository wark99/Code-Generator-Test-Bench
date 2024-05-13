package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1VideosChannelPlayersPlayerEmbedGet200Response;
import org.openapitools.client.model.Model1VideosChannelPlayersPlayerEmbedUrlGet200Response;

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
public class PlayersEmbedsApi {
    private ApiClient apiClient;

    public PlayersEmbedsApi() {
        this(new ApiClient());
    }

    public PlayersEmbedsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Integration code
     * Integrate the player into your site by cutting / pasting the HTML5 code below.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param player The unique identifier (ID) of the player to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1VideosChannelPlayersPlayerEmbedGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelPlayersPlayerEmbedGet200Response call1videosChannelPlayersPlayerEmbedGet(Integer channel, Integer player, String with) throws RestClientException {
        return call1videosChannelPlayersPlayerEmbedGetWithHttpInfo(channel, player, with).getBody();
    }

    /**
     * Integration code
     * Integrate the player into your site by cutting / pasting the HTML5 code below.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param player The unique identifier (ID) of the player to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1VideosChannelPlayersPlayerEmbedGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelPlayersPlayerEmbedGet200Response> call1videosChannelPlayersPlayerEmbedGetWithHttpInfo(Integer channel, Integer player, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelPlayersPlayerEmbedGet");
        }
        
        // verify the required parameter 'player' is set
        if (player == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'player' when calling call1videosChannelPlayersPlayerEmbedGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("player", player);

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

        ParameterizedTypeReference<Model1VideosChannelPlayersPlayerEmbedGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelPlayersPlayerEmbedGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/players/{player}/embed", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Integration url
     * Try to retrieve the parameters needed to construct an iframe for the player identified by the given player ID for the given channel, or for the last updated player of the channel, if any. If the channels hasn&#39;t any player and that no player ID is provided, it will return parameters for a default player.  If the channels doesn&#39;t exist or that the player isn&#39;t linked to the channel, or that the channel is badly configured, this will throw an error.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param player The unique identifier (ID) of the player to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1VideosChannelPlayersPlayerEmbedUrlGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VideosChannelPlayersPlayerEmbedUrlGet200Response call1videosChannelPlayersPlayerEmbedUrlGet(Integer channel, Integer player, String with) throws RestClientException {
        return call1videosChannelPlayersPlayerEmbedUrlGetWithHttpInfo(channel, player, with).getBody();
    }

    /**
     * Integration url
     * Try to retrieve the parameters needed to construct an iframe for the player identified by the given player ID for the given channel, or for the last updated player of the channel, if any. If the channels hasn&#39;t any player and that no player ID is provided, it will return parameters for a default player.  If the channels doesn&#39;t exist or that the player isn&#39;t linked to the channel, or that the channel is badly configured, this will throw an error.
     * <p><b>200</b> - OK
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param player The unique identifier (ID) of the player to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1VideosChannelPlayersPlayerEmbedUrlGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VideosChannelPlayersPlayerEmbedUrlGet200Response> call1videosChannelPlayersPlayerEmbedUrlGetWithHttpInfo(Integer channel, Integer player, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelPlayersPlayerEmbedUrlGet");
        }
        
        // verify the required parameter 'player' is set
        if (player == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'player' when calling call1videosChannelPlayersPlayerEmbedUrlGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("player", player);

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

        ParameterizedTypeReference<Model1VideosChannelPlayersPlayerEmbedUrlGet200Response> localReturnType = new ParameterizedTypeReference<Model1VideosChannelPlayersPlayerEmbedUrlGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/players/{player}/embed/url", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
