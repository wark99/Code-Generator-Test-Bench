package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.FetchAds200Response;
import org.openapitools.client.model.FetchAdsRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:59.315741670Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SponsorAdsApi {
    private ApiClient apiClient;

    public SponsorAdsApi() {
        this(new ApiClient());
    }

    public SponsorAdsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Fetch Contextually Relevant Ads
     * Responds with a product or service relevant to the provided conversation context.
     * <p><b>200</b> - Successful Response
     * <p><b>400</b> - Malformed Request
     * <p><b>401</b> - Invalid API Key or User ID
     * <p><b>5XX</b> - Server Issues
     * @param fetchAdsRequest  (required)
     * @return FetchAds200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FetchAds200Response fetchAds(FetchAdsRequest fetchAdsRequest) throws RestClientException {
        return fetchAdsWithHttpInfo(fetchAdsRequest).getBody();
    }

    /**
     * Fetch Contextually Relevant Ads
     * Responds with a product or service relevant to the provided conversation context.
     * <p><b>200</b> - Successful Response
     * <p><b>400</b> - Malformed Request
     * <p><b>401</b> - Invalid API Key or User ID
     * <p><b>5XX</b> - Server Issues
     * @param fetchAdsRequest  (required)
     * @return ResponseEntity&lt;FetchAds200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FetchAds200Response> fetchAdsWithHttpInfo(FetchAdsRequest fetchAdsRequest) throws RestClientException {
        Object localVarPostBody = fetchAdsRequest;
        
        // verify the required parameter 'fetchAdsRequest' is set
        if (fetchAdsRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fetchAdsRequest' when calling fetchAds");
        }
        

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

        String[] localVarAuthNames = new String[] { "BearerAuth" };

        ParameterizedTypeReference<FetchAds200Response> localReturnType = new ParameterizedTypeReference<FetchAds200Response>() {};
        return apiClient.invokeAPI("/sponsors_v2", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
