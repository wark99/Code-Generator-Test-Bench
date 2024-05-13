package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GetSubscriptions200Response;
import org.openapitools.client.model.PostPayBookingRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:35.686627593Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * List subscriptions
     * Retrieve a list of subscriptions.
     * <p><b>200</b> - Returns a list of Subscription objects.
     * @param filterOrganiser ID of the organiser (optional)
     * @param filterStudent ID of the student (optional)
     * @return GetSubscriptions200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetSubscriptions200Response getSubscriptions(Integer filterOrganiser, Integer filterStudent) throws RestClientException {
        return getSubscriptionsWithHttpInfo(filterOrganiser, filterStudent).getBody();
    }

    /**
     * List subscriptions
     * Retrieve a list of subscriptions.
     * <p><b>200</b> - Returns a list of Subscription objects.
     * @param filterOrganiser ID of the organiser (optional)
     * @param filterStudent ID of the student (optional)
     * @return ResponseEntity&lt;GetSubscriptions200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetSubscriptions200Response> getSubscriptionsWithHttpInfo(Integer filterOrganiser, Integer filterStudent) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[organiser]", filterOrganiser));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter[student]", filterStudent));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<GetSubscriptions200Response> localReturnType = new ParameterizedTypeReference<GetSubscriptions200Response>() {};
        return apiClient.invokeAPI("/subscriptions", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Activate subscription
     * Activate a subscription.
     * <p><b>204</b> - No content.
     * @param subscriptionId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postActivateSubscription(String subscriptionId) throws RestClientException {
        postActivateSubscriptionWithHttpInfo(subscriptionId);
    }

    /**
     * Activate subscription
     * Activate a subscription.
     * <p><b>204</b> - No content.
     * @param subscriptionId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postActivateSubscriptionWithHttpInfo(String subscriptionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionId' when calling postActivateSubscription");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/subscriptions/{subscriptionId}/activate", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Pay subscription
     * Pay a subscription.
     * <p><b>204</b> - No content.
     * @param subscriptionId  (required)
     * @param postPayBookingRequest Pays for a subscription. (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postPaySubscription(String subscriptionId, PostPayBookingRequest postPayBookingRequest) throws RestClientException {
        postPaySubscriptionWithHttpInfo(subscriptionId, postPayBookingRequest);
    }

    /**
     * Pay subscription
     * Pay a subscription.
     * <p><b>204</b> - No content.
     * @param subscriptionId  (required)
     * @param postPayBookingRequest Pays for a subscription. (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postPaySubscriptionWithHttpInfo(String subscriptionId, PostPayBookingRequest postPayBookingRequest) throws RestClientException {
        Object localVarPostBody = postPayBookingRequest;
        
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionId' when calling postPaySubscription");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/subscriptions/{subscriptionId}/pay", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
