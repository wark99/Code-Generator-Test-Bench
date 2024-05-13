package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.PublicApiV1AssetAssetidGet200Response;
import org.openapitools.client.model.PublicApiV1AssetAssetidGet400Response;

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
public class GetAssetInfoApi {
    private ApiClient apiClient;

    public GetAssetInfoApi() {
        this(new ApiClient());
    }

    public GetAssetInfoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Asset by ID
     * Retrieve asset information by asset ID.
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Asset Not Found
     * @param assetid The ID of the asset. (required)
     * @return PublicApiV1AssetAssetidGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PublicApiV1AssetAssetidGet200Response publicApiV1AssetAssetidGet(Integer assetid) throws RestClientException {
        return publicApiV1AssetAssetidGetWithHttpInfo(assetid).getBody();
    }

    /**
     * Get Asset by ID
     * Retrieve asset information by asset ID.
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Asset Not Found
     * @param assetid The ID of the asset. (required)
     * @return ResponseEntity&lt;PublicApiV1AssetAssetidGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PublicApiV1AssetAssetidGet200Response> publicApiV1AssetAssetidGetWithHttpInfo(Integer assetid) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'assetid' is set
        if (assetid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'assetid' when calling publicApiV1AssetAssetidGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("assetid", assetid);

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PublicApiV1AssetAssetidGet200Response> localReturnType = new ParameterizedTypeReference<PublicApiV1AssetAssetidGet200Response>() {};
        return apiClient.invokeAPI("/public-api/v1/asset/{assetid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
