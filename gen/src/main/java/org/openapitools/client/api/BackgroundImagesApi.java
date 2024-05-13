package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.NewBackgroundGetActiveBackgroundCarStockIdGet200Response;
import org.openapitools.client.model.NewBackgroundListPost200Response;
import org.openapitools.client.model.NewBackgroundListPostRequest;
import org.openapitools.client.model.NewBackgroundSavePostRequest;
import org.openapitools.client.model.NewManagementBackgroundNewBackgroundPost200Response;

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
public class BackgroundImagesApi {
    private ApiClient apiClient;

    public BackgroundImagesApi() {
        this(new ApiClient());
    }

    public BackgroundImagesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * get-active-background-for-carstock
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param carStockId  (required)
     * @return NewBackgroundGetActiveBackgroundCarStockIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public NewBackgroundGetActiveBackgroundCarStockIdGet200Response newBackgroundGetActiveBackgroundCarStockIdGet(Integer carStockId) throws RestClientException {
        return newBackgroundGetActiveBackgroundCarStockIdGetWithHttpInfo(carStockId).getBody();
    }

    /**
     * get-active-background-for-carstock
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param carStockId  (required)
     * @return ResponseEntity&lt;NewBackgroundGetActiveBackgroundCarStockIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<NewBackgroundGetActiveBackgroundCarStockIdGet200Response> newBackgroundGetActiveBackgroundCarStockIdGetWithHttpInfo(Integer carStockId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'carStockId' is set
        if (carStockId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'carStockId' when calling newBackgroundGetActiveBackgroundCarStockIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("carStockId", carStockId);

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

        ParameterizedTypeReference<NewBackgroundGetActiveBackgroundCarStockIdGet200Response> localReturnType = new ParameterizedTypeReference<NewBackgroundGetActiveBackgroundCarStockIdGet200Response>() {};
        return apiClient.invokeAPI("/new/background/getActiveBackground/{carStockId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * carstock-specific-background-list
     * 
     * <p><b>200</b> - Success
     * @param newBackgroundListPostRequest  (optional)
     * @return NewBackgroundListPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public NewBackgroundListPost200Response newBackgroundListPost(NewBackgroundListPostRequest newBackgroundListPostRequest) throws RestClientException {
        return newBackgroundListPostWithHttpInfo(newBackgroundListPostRequest).getBody();
    }

    /**
     * carstock-specific-background-list
     * 
     * <p><b>200</b> - Success
     * @param newBackgroundListPostRequest  (optional)
     * @return ResponseEntity&lt;NewBackgroundListPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<NewBackgroundListPost200Response> newBackgroundListPostWithHttpInfo(NewBackgroundListPostRequest newBackgroundListPostRequest) throws RestClientException {
        Object localVarPostBody = newBackgroundListPostRequest;
        

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

        ParameterizedTypeReference<NewBackgroundListPost200Response> localReturnType = new ParameterizedTypeReference<NewBackgroundListPost200Response>() {};
        return apiClient.invokeAPI("/new/background/list", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * restore-background-to-automatic
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param newBackgroundListPostRequest  (optional)
     * @return NewManagementBackgroundNewBackgroundPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public NewManagementBackgroundNewBackgroundPost200Response newBackgroundRestorePost(NewBackgroundListPostRequest newBackgroundListPostRequest) throws RestClientException {
        return newBackgroundRestorePostWithHttpInfo(newBackgroundListPostRequest).getBody();
    }

    /**
     * restore-background-to-automatic
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param newBackgroundListPostRequest  (optional)
     * @return ResponseEntity&lt;NewManagementBackgroundNewBackgroundPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<NewManagementBackgroundNewBackgroundPost200Response> newBackgroundRestorePostWithHttpInfo(NewBackgroundListPostRequest newBackgroundListPostRequest) throws RestClientException {
        Object localVarPostBody = newBackgroundListPostRequest;
        

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

        ParameterizedTypeReference<NewManagementBackgroundNewBackgroundPost200Response> localReturnType = new ParameterizedTypeReference<NewManagementBackgroundNewBackgroundPost200Response>() {};
        return apiClient.invokeAPI("/new/background/restore", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * carstock-specific-background-save
     * 
     * <p><b>200</b> - Success
     * @param newBackgroundSavePostRequest  (optional)
     * @return NewManagementBackgroundNewBackgroundPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public NewManagementBackgroundNewBackgroundPost200Response newBackgroundSavePost(NewBackgroundSavePostRequest newBackgroundSavePostRequest) throws RestClientException {
        return newBackgroundSavePostWithHttpInfo(newBackgroundSavePostRequest).getBody();
    }

    /**
     * carstock-specific-background-save
     * 
     * <p><b>200</b> - Success
     * @param newBackgroundSavePostRequest  (optional)
     * @return ResponseEntity&lt;NewManagementBackgroundNewBackgroundPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<NewManagementBackgroundNewBackgroundPost200Response> newBackgroundSavePostWithHttpInfo(NewBackgroundSavePostRequest newBackgroundSavePostRequest) throws RestClientException {
        Object localVarPostBody = newBackgroundSavePostRequest;
        

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

        ParameterizedTypeReference<NewManagementBackgroundNewBackgroundPost200Response> localReturnType = new ParameterizedTypeReference<NewManagementBackgroundNewBackgroundPost200Response>() {};
        return apiClient.invokeAPI("/new/background/save", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
