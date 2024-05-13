package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.PostSetupIntent200Response;
import org.openapitools.client.model.PostSetupIntentRequest;

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
public class SetupIntentsApi {
    private ApiClient apiClient;

    public SetupIntentsApi() {
        this(new ApiClient());
    }

    public SetupIntentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a setup intent
     * Create a new setup intent.
     * <p><b>200</b> - Setup intent created.
     * @param postSetupIntentRequest Creates a new setup intent on Stripe. (optional)
     * @return PostSetupIntent200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostSetupIntent200Response postSetupIntent(PostSetupIntentRequest postSetupIntentRequest) throws RestClientException {
        return postSetupIntentWithHttpInfo(postSetupIntentRequest).getBody();
    }

    /**
     * Create a setup intent
     * Create a new setup intent.
     * <p><b>200</b> - Setup intent created.
     * @param postSetupIntentRequest Creates a new setup intent on Stripe. (optional)
     * @return ResponseEntity&lt;PostSetupIntent200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostSetupIntent200Response> postSetupIntentWithHttpInfo(PostSetupIntentRequest postSetupIntentRequest) throws RestClientException {
        Object localVarPostBody = postSetupIntentRequest;
        

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

        ParameterizedTypeReference<PostSetupIntent200Response> localReturnType = new ParameterizedTypeReference<PostSetupIntent200Response>() {};
        return apiClient.invokeAPI("/setup-intents", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
