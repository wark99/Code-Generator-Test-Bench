package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ModeCarStockIdTenantIdGet200Response;
import org.openapitools.client.model.ModePost200Response;
import org.openapitools.client.model.ModePostRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:48.943071954Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ImageModesApi {
    private ApiClient apiClient;

    public ImageModesApi() {
        this(new ApiClient());
    }

    public ImageModesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * get-current-image-modus
     * 
     * <p><b>200</b> - Success
     * @param carStockId  (required)
     * @param tenantId  (required)
     * @return ModeCarStockIdTenantIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModeCarStockIdTenantIdGet200Response modeCarStockIdTenantIdGet(String carStockId, String tenantId) throws RestClientException {
        return modeCarStockIdTenantIdGetWithHttpInfo(carStockId, tenantId).getBody();
    }

    /**
     * get-current-image-modus
     * 
     * <p><b>200</b> - Success
     * @param carStockId  (required)
     * @param tenantId  (required)
     * @return ResponseEntity&lt;ModeCarStockIdTenantIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModeCarStockIdTenantIdGet200Response> modeCarStockIdTenantIdGetWithHttpInfo(String carStockId, String tenantId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'carStockId' is set
        if (carStockId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'carStockId' when calling modeCarStockIdTenantIdGet");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling modeCarStockIdTenantIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("carStockId", carStockId);
        uriVariables.put("tenantId", tenantId);

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<ModeCarStockIdTenantIdGet200Response> localReturnType = new ParameterizedTypeReference<ModeCarStockIdTenantIdGet200Response>() {};
        return apiClient.invokeAPI("/mode/{carStockId}/{tenantId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * save-new-image-mode
     * 
     * <p><b>200</b> - Success
     * @param modePostRequest  (optional)
     * @return ModePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModePost200Response modePost(ModePostRequest modePostRequest) throws RestClientException {
        return modePostWithHttpInfo(modePostRequest).getBody();
    }

    /**
     * save-new-image-mode
     * 
     * <p><b>200</b> - Success
     * @param modePostRequest  (optional)
     * @return ResponseEntity&lt;ModePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModePost200Response> modePostWithHttpInfo(ModePostRequest modePostRequest) throws RestClientException {
        Object localVarPostBody = modePostRequest;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<ModePost200Response> localReturnType = new ParameterizedTypeReference<ModePost200Response>() {};
        return apiClient.invokeAPI("/mode", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
