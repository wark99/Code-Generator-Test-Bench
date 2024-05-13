package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.SearchProfilePost400Response;
import org.openapitools.client.model.SearchProfilePostDefaultResponse;
import org.openapitools.client.model.SubscriptionActiveGet200Response;
import org.openapitools.client.model.SubscriptionCreatePost201Response;
import org.openapitools.client.model.SubscriptionCreatePostRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:24.544913406Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SubscriptionsApi {
    private ApiClient apiClient;

    public SubscriptionsApi() {
        this(new ApiClient());
    }

    public SubscriptionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieves active subscription for current user
     * This endpoint retrieves active user subscription. If user does not have any active subscription, it returns an http 400 status code
     * <p><b>200</b> - Active subscription returned
     * @return SubscriptionActiveGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionActiveGet200Response subscriptionActiveGet() throws RestClientException {
        return subscriptionActiveGetWithHttpInfo().getBody();
    }

    /**
     * Retrieves active subscription for current user
     * This endpoint retrieves active user subscription. If user does not have any active subscription, it returns an http 400 status code
     * <p><b>200</b> - Active subscription returned
     * @return ResponseEntity&lt;SubscriptionActiveGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionActiveGet200Response> subscriptionActiveGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<SubscriptionActiveGet200Response> localReturnType = new ParameterizedTypeReference<SubscriptionActiveGet200Response>() {};
        return apiClient.invokeAPI("/subscription/active", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * turn auto renew for subscription on or off
     * 
     * <p><b>204</b> - Auto renew successfully updated
     * <p><b>400</b> - Unable to update autorenew
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param state  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void subscriptionAutorenewStatePut(String state) throws RestClientException {
        subscriptionAutorenewStatePutWithHttpInfo(state);
    }

    /**
     * turn auto renew for subscription on or off
     * 
     * <p><b>204</b> - Auto renew successfully updated
     * <p><b>400</b> - Unable to update autorenew
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param state  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> subscriptionAutorenewStatePutWithHttpInfo(String state) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'state' is set
        if (state == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'state' when calling subscriptionAutorenewStatePut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("state", state);

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/subscription/autorenew/{state}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * initiate payment process for subscription package
     * 
     * <p><b>201</b> - Successfully initiated payment process
     * <p><b>400</b> - Unable to update job post
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param subscriptionCreatePostRequest  (optional)
     * @return SubscriptionCreatePost201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionCreatePost201Response subscriptionCreatePost(SubscriptionCreatePostRequest subscriptionCreatePostRequest) throws RestClientException {
        return subscriptionCreatePostWithHttpInfo(subscriptionCreatePostRequest).getBody();
    }

    /**
     * initiate payment process for subscription package
     * 
     * <p><b>201</b> - Successfully initiated payment process
     * <p><b>400</b> - Unable to update job post
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param subscriptionCreatePostRequest  (optional)
     * @return ResponseEntity&lt;SubscriptionCreatePost201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionCreatePost201Response> subscriptionCreatePostWithHttpInfo(SubscriptionCreatePostRequest subscriptionCreatePostRequest) throws RestClientException {
        Object localVarPostBody = subscriptionCreatePostRequest;
        

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<SubscriptionCreatePost201Response> localReturnType = new ParameterizedTypeReference<SubscriptionCreatePost201Response>() {};
        return apiClient.invokeAPI("/subscription/create", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
