package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.PatchPaymentIntentRequest;
import org.openapitools.client.model.PostPaymentIntent200Response;
import org.openapitools.client.model.PostPaymentIntentRequest;

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
public class PaymentIntentsApi {
    private ApiClient apiClient;

    public PaymentIntentsApi() {
        this(new ApiClient());
    }

    public PaymentIntentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Update a payment intent
     * Updates a payment intent.
     * <p><b>200</b> - Payment intent updated.
     * @param patchPaymentIntentRequest Updates the payment intent on Stripe. (optional)
     * @return PostPaymentIntent200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostPaymentIntent200Response patchPaymentIntent(PatchPaymentIntentRequest patchPaymentIntentRequest) throws RestClientException {
        return patchPaymentIntentWithHttpInfo(patchPaymentIntentRequest).getBody();
    }

    /**
     * Update a payment intent
     * Updates a payment intent.
     * <p><b>200</b> - Payment intent updated.
     * @param patchPaymentIntentRequest Updates the payment intent on Stripe. (optional)
     * @return ResponseEntity&lt;PostPaymentIntent200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostPaymentIntent200Response> patchPaymentIntentWithHttpInfo(PatchPaymentIntentRequest patchPaymentIntentRequest) throws RestClientException {
        Object localVarPostBody = patchPaymentIntentRequest;
        

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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<PostPaymentIntent200Response> localReturnType = new ParameterizedTypeReference<PostPaymentIntent200Response>() {};
        return apiClient.invokeAPI("/payment-intents", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a payment intent
     * Create a new payment intent.
     * <p><b>200</b> - Payment intent created.
     * @param postPaymentIntentRequest Creates a new payment intent on Stripe. (optional)
     * @return PostPaymentIntent200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostPaymentIntent200Response postPaymentIntent(PostPaymentIntentRequest postPaymentIntentRequest) throws RestClientException {
        return postPaymentIntentWithHttpInfo(postPaymentIntentRequest).getBody();
    }

    /**
     * Create a payment intent
     * Create a new payment intent.
     * <p><b>200</b> - Payment intent created.
     * @param postPaymentIntentRequest Creates a new payment intent on Stripe. (optional)
     * @return ResponseEntity&lt;PostPaymentIntent200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostPaymentIntent200Response> postPaymentIntentWithHttpInfo(PostPaymentIntentRequest postPaymentIntentRequest) throws RestClientException {
        Object localVarPostBody = postPaymentIntentRequest;
        

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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<PostPaymentIntent200Response> localReturnType = new ParameterizedTypeReference<PostPaymentIntent200Response>() {};
        return apiClient.invokeAPI("/payment-intents", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
