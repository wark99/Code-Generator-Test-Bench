package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1KmeetRoomsPost200Response;
import org.openapitools.client.model.Model1KmeetRoomsRoomIdSettingsGet403Response;
import org.openapitools.client.model.Model1KmeetRoomsRoomIdSettingsGet404Response;

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
public class RoomSettingsApi {
    private ApiClient apiClient;

    public RoomSettingsApi() {
        this(new ApiClient());
    }

    public RoomSettingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get room settings
     * This endpoint allows you to fetch room settings. 
     * <p><b>200</b> - Default response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param roomId Unique identifier of the room settings (required)
     * @return Model1KmeetRoomsPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1KmeetRoomsPost200Response call1kmeetRoomsRoomIdSettingsGet(String roomId) throws RestClientException {
        return call1kmeetRoomsRoomIdSettingsGetWithHttpInfo(roomId).getBody();
    }

    /**
     * Get room settings
     * This endpoint allows you to fetch room settings. 
     * <p><b>200</b> - Default response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param roomId Unique identifier of the room settings (required)
     * @return ResponseEntity&lt;Model1KmeetRoomsPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1KmeetRoomsPost200Response> call1kmeetRoomsRoomIdSettingsGetWithHttpInfo(String roomId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'roomId' is set
        if (roomId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'roomId' when calling call1kmeetRoomsRoomIdSettingsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("room_id", roomId);

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1KmeetRoomsPost200Response> localReturnType = new ParameterizedTypeReference<Model1KmeetRoomsPost200Response>() {};
        return apiClient.invokeAPI("/1/kmeet/rooms/{room_id}/settings", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
