package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.PublicApiV1InventoryAssetsUseridAssettypeidGet200Response;
import org.openapitools.client.model.PublicApiV1InventoryCollectiblesUseridGet200Response;
import org.openapitools.client.model.PublicApiV1UsersUseridGet400Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:02.257670598Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class InventoryAndCollectiblesApi {
    private ApiClient apiClient;

    public InventoryAndCollectiblesApi() {
        this(new ApiClient());
    }

    public InventoryAndCollectiblesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get User&#39;s Assets by Type
     * Retrieve a user&#39;s assets of a specific type.
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - User Not Found
     * @param userid The ID of the user. (required)
     * @param assettypeid The ID of the asset type. Refer to the [Roblox Documentation](https://create.roblox.com/docs/reference/engine/enums/AssetType) for valid values. (required)
     * @param page The page number (optional). (optional)
     * @return PublicApiV1InventoryAssetsUseridAssettypeidGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PublicApiV1InventoryAssetsUseridAssettypeidGet200Response publicApiV1InventoryAssetsUseridAssettypeidGet(Integer userid, Integer assettypeid, Integer page) throws RestClientException {
        return publicApiV1InventoryAssetsUseridAssettypeidGetWithHttpInfo(userid, assettypeid, page).getBody();
    }

    /**
     * Get User&#39;s Assets by Type
     * Retrieve a user&#39;s assets of a specific type.
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - User Not Found
     * @param userid The ID of the user. (required)
     * @param assettypeid The ID of the asset type. Refer to the [Roblox Documentation](https://create.roblox.com/docs/reference/engine/enums/AssetType) for valid values. (required)
     * @param page The page number (optional). (optional)
     * @return ResponseEntity&lt;PublicApiV1InventoryAssetsUseridAssettypeidGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PublicApiV1InventoryAssetsUseridAssettypeidGet200Response> publicApiV1InventoryAssetsUseridAssettypeidGetWithHttpInfo(Integer userid, Integer assettypeid, Integer page) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling publicApiV1InventoryAssetsUseridAssettypeidGet");
        }
        
        // verify the required parameter 'assettypeid' is set
        if (assettypeid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assettypeid' when calling publicApiV1InventoryAssetsUseridAssettypeidGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);
        uriVariables.put("assettypeid", assettypeid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PublicApiV1InventoryAssetsUseridAssettypeidGet200Response> localReturnType = new ParameterizedTypeReference<PublicApiV1InventoryAssetsUseridAssettypeidGet200Response>() {};
        return apiClient.invokeAPI("/public-api/v1/inventory/assets/{userid}/{assettypeid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get User&#39;s Collectibles
     * Retrieve a user&#39;s collectibles.
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - User Not Found
     * @param userid The ID of the user. (required)
     * @param page The page number (optional). (optional)
     * @return PublicApiV1InventoryCollectiblesUseridGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PublicApiV1InventoryCollectiblesUseridGet200Response publicApiV1InventoryCollectiblesUseridGet(Integer userid, Integer page) throws RestClientException {
        return publicApiV1InventoryCollectiblesUseridGetWithHttpInfo(userid, page).getBody();
    }

    /**
     * Get User&#39;s Collectibles
     * Retrieve a user&#39;s collectibles.
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - User Not Found
     * @param userid The ID of the user. (required)
     * @param page The page number (optional). (optional)
     * @return ResponseEntity&lt;PublicApiV1InventoryCollectiblesUseridGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PublicApiV1InventoryCollectiblesUseridGet200Response> publicApiV1InventoryCollectiblesUseridGetWithHttpInfo(Integer userid, Integer page) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling publicApiV1InventoryCollectiblesUseridGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PublicApiV1InventoryCollectiblesUseridGet200Response> localReturnType = new ParameterizedTypeReference<PublicApiV1InventoryCollectiblesUseridGet200Response>() {};
        return apiClient.invokeAPI("/public-api/v1/inventory/collectibles/{userid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
