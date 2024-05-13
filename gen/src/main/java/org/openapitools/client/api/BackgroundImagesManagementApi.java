package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.io.File;
import org.openapitools.client.model.NewManagementBackgroundIdDelete200Response;
import org.openapitools.client.model.NewManagementBackgroundListTenantIdGet200Response;
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
public class BackgroundImagesManagementApi {
    private ApiClient apiClient;

    public BackgroundImagesManagementApi() {
        this(new ApiClient());
    }

    public BackgroundImagesManagementApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * delete-background
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param id  (required)
     * @return NewManagementBackgroundIdDelete200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public NewManagementBackgroundIdDelete200Response newManagementBackgroundIdDelete(Integer id) throws RestClientException {
        return newManagementBackgroundIdDeleteWithHttpInfo(id).getBody();
    }

    /**
     * delete-background
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param id  (required)
     * @return ResponseEntity&lt;NewManagementBackgroundIdDelete200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<NewManagementBackgroundIdDelete200Response> newManagementBackgroundIdDeleteWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling newManagementBackgroundIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        ParameterizedTypeReference<NewManagementBackgroundIdDelete200Response> localReturnType = new ParameterizedTypeReference<NewManagementBackgroundIdDelete200Response>() {};
        return apiClient.invokeAPI("/new/management/background/{id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * get list backgrounds
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param tenantId  (required)
     * @return NewManagementBackgroundListTenantIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public NewManagementBackgroundListTenantIdGet200Response newManagementBackgroundListTenantIdGet(Integer tenantId) throws RestClientException {
        return newManagementBackgroundListTenantIdGetWithHttpInfo(tenantId).getBody();
    }

    /**
     * get list backgrounds
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad Request
     * @param tenantId  (required)
     * @return ResponseEntity&lt;NewManagementBackgroundListTenantIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<NewManagementBackgroundListTenantIdGet200Response> newManagementBackgroundListTenantIdGetWithHttpInfo(Integer tenantId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling newManagementBackgroundListTenantIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
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

        ParameterizedTypeReference<NewManagementBackgroundListTenantIdGet200Response> localReturnType = new ParameterizedTypeReference<NewManagementBackgroundListTenantIdGet200Response>() {};
        return apiClient.invokeAPI("/new/management/background/list/{tenantId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * add-new-background-image
     * 
     * <p><b>200</b> - Success
     * @param userId  (required)
     * @param tenantId  (required)
     * @param backgroundName  (required)
     * @param adjustImageSetting  (required)
     * @param brandIds  (optional)
     * @param dealerIds  (optional)
     * @param customImageSetting  (optional)
     * @param backgroundImage  (optional)
     * @return NewManagementBackgroundNewBackgroundPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public NewManagementBackgroundNewBackgroundPost200Response newManagementBackgroundNewBackgroundPost(Integer userId, Integer tenantId, String backgroundName, String adjustImageSetting, List<String> brandIds, List<String> dealerIds, String customImageSetting, File backgroundImage) throws RestClientException {
        return newManagementBackgroundNewBackgroundPostWithHttpInfo(userId, tenantId, backgroundName, adjustImageSetting, brandIds, dealerIds, customImageSetting, backgroundImage).getBody();
    }

    /**
     * add-new-background-image
     * 
     * <p><b>200</b> - Success
     * @param userId  (required)
     * @param tenantId  (required)
     * @param backgroundName  (required)
     * @param adjustImageSetting  (required)
     * @param brandIds  (optional)
     * @param dealerIds  (optional)
     * @param customImageSetting  (optional)
     * @param backgroundImage  (optional)
     * @return ResponseEntity&lt;NewManagementBackgroundNewBackgroundPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<NewManagementBackgroundNewBackgroundPost200Response> newManagementBackgroundNewBackgroundPostWithHttpInfo(Integer userId, Integer tenantId, String backgroundName, String adjustImageSetting, List<String> brandIds, List<String> dealerIds, String customImageSetting, File backgroundImage) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling newManagementBackgroundNewBackgroundPost");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling newManagementBackgroundNewBackgroundPost");
        }
        
        // verify the required parameter 'backgroundName' is set
        if (backgroundName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'backgroundName' when calling newManagementBackgroundNewBackgroundPost");
        }
        
        // verify the required parameter 'adjustImageSetting' is set
        if (adjustImageSetting == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'adjustImageSetting' when calling newManagementBackgroundNewBackgroundPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (userId != null)
            localVarFormParams.add("user_id", userId);
        if (tenantId != null)
            localVarFormParams.add("tenant_id", tenantId);
        if (brandIds != null)
            localVarFormParams.addAll("brand_ids", brandIds);
        if (dealerIds != null)
            localVarFormParams.addAll("dealer_ids", dealerIds);
        if (backgroundName != null)
            localVarFormParams.add("background_name", backgroundName);
        if (adjustImageSetting != null)
            localVarFormParams.add("adjust_image_setting", adjustImageSetting);
        if (customImageSetting != null)
            localVarFormParams.add("custom_image_setting", customImageSetting);
        if (backgroundImage != null)
            localVarFormParams.add("background_image", new FileSystemResource(backgroundImage));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<NewManagementBackgroundNewBackgroundPost200Response> localReturnType = new ParameterizedTypeReference<NewManagementBackgroundNewBackgroundPost200Response>() {};
        return apiClient.invokeAPI("/new/management/background/new-background", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
