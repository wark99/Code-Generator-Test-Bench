package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1RadiosRadioProductIdPlayersPlayerIdGet200Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut500Response;

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
public class PlayersPicturesApi {
    private ApiClient apiClient;

    public PlayersPicturesApi() {
        this(new ApiClient());
    }

    public PlayersPicturesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Show picture
     * This endpoint allows you to retrieve a Vignette for the player.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param player The unique identifier (ID) of the player to request. (required)
     * @param thumbnail  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1RadiosRadioProductIdPlayersPlayerIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdPlayersPlayerIdGet200Response call1videosChannelPlayersPlayerThumbnailThumbnailGet(Integer channel, Integer player, String thumbnail, String with) throws RestClientException {
        return call1videosChannelPlayersPlayerThumbnailThumbnailGetWithHttpInfo(channel, player, thumbnail, with).getBody();
    }

    /**
     * Show picture
     * This endpoint allows you to retrieve a Vignette for the player.
     * <p><b>200</b> - OK
     * <p><b>500</b> - Internal Server Error
     * @param channel The unique identifier (ID) of the channel to request. (required)
     * @param player The unique identifier (ID) of the player to request. (required)
     * @param thumbnail  (optional)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdPlayersPlayerIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdPlayersPlayerIdGet200Response> call1videosChannelPlayersPlayerThumbnailThumbnailGetWithHttpInfo(Integer channel, Integer player, String thumbnail, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1videosChannelPlayersPlayerThumbnailThumbnailGet");
        }
        
        // verify the required parameter 'player' is set
        if (player == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'player' when calling call1videosChannelPlayersPlayerThumbnailThumbnailGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("player", player);
        uriVariables.put("thumbnail", thumbnail);

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

        ParameterizedTypeReference<Model1RadiosRadioProductIdPlayersPlayerIdGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdPlayersPlayerIdGet200Response>() {};
        return apiClient.invokeAPI("/1/videos/{channel}/players/{player}/thumbnail/{thumbnail}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
