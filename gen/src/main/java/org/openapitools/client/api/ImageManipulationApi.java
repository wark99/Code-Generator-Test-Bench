package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BackgroundSwapBackgroundRequest;
import org.openapitools.client.model.BackgroundSwapBackgroundResponse;
import org.openapitools.client.model.BackgroundSwapRequest;
import org.openapitools.client.model.BackgroundSwapResponse;
import org.openapitools.client.model.BackgroundSwapSelectablesRequest;
import org.openapitools.client.model.BackgroundSwapSelectablesResponse;
import org.openapitools.client.model.BackgroundSwapSuitableRequest;
import org.openapitools.client.model.CarstockoverlayModeRequest;
import org.openapitools.client.model.CarstockoverlayModeResponse;
import org.openapitools.client.model.CarstockoverlayReorderRequest;
import org.openapitools.client.model.CarstockoverlayReorderResponse;
import org.openapitools.client.model.CarstockoverlaySelectionRequest;
import org.openapitools.client.model.CarstockoverlaySelectionResponse;
import org.openapitools.client.model.CarstockoverlaydisplayPositionRequest;
import org.openapitools.client.model.CarstockoverlaydisplayPositionResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.ManipulationOverlaysDisplayPositionPost200Response;
import org.openapitools.client.model.ManipulationOverlaysDisplayPositionPostRequest;
import org.openapitools.client.model.ManipulationOverlaysDisplayPositionUpdatePostRequest;
import org.openapitools.client.model.ManipulationOverlaysHexonPost200Response;
import org.openapitools.client.model.ManipulationOverlaysHexonPostRequest;
import org.openapitools.client.model.ManipulationOverlaysPost200ResponseInner;
import org.openapitools.client.model.MarketingSlidesActiveRequest;
import org.openapitools.client.model.MarketingSlidesActiveResponse;
import org.openapitools.client.model.MarketingSlidesPositionRequest;
import org.openapitools.client.model.MarketingSlidesPositionResponse;
import org.openapitools.client.model.MarketingSlidesRequest;
import org.openapitools.client.model.MarketingSlidesResponse;
import org.openapitools.client.model.ModePost200Response;
import org.openapitools.client.model.OverlayRequest;

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
public class ImageManipulationApi {
    private ApiClient apiClient;

    public ImageManipulationApi() {
        this(new ApiClient());
    }

    public ImageManipulationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Select and activate selected background for swap
     * Select and activate selected background for swap
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param backgroundSwapBackgroundRequest  (optional)
     * @return List&lt;BackgroundSwapBackgroundResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BackgroundSwapBackgroundResponse> manipulationBackgroundswapBackgroundPatch(BackgroundSwapBackgroundRequest backgroundSwapBackgroundRequest) throws RestClientException {
        return manipulationBackgroundswapBackgroundPatchWithHttpInfo(backgroundSwapBackgroundRequest).getBody();
    }

    /**
     * Select and activate selected background for swap
     * Select and activate selected background for swap
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param backgroundSwapBackgroundRequest  (optional)
     * @return ResponseEntity&lt;List&lt;BackgroundSwapBackgroundResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BackgroundSwapBackgroundResponse>> manipulationBackgroundswapBackgroundPatchWithHttpInfo(BackgroundSwapBackgroundRequest backgroundSwapBackgroundRequest) throws RestClientException {
        Object localVarPostBody = backgroundSwapBackgroundRequest;
        

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

        ParameterizedTypeReference<List<BackgroundSwapBackgroundResponse>> localReturnType = new ParameterizedTypeReference<List<BackgroundSwapBackgroundResponse>>() {};
        return apiClient.invokeAPI("/manipulation/backgroundswap/background", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Select and activate selected background for swap
     * Select and activate selected background for swap
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param backgroundSwapBackgroundRequest  (optional)
     * @return List&lt;BackgroundSwapBackgroundResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BackgroundSwapBackgroundResponse> manipulationBackgroundswapBackgroundPatch_0(BackgroundSwapBackgroundRequest backgroundSwapBackgroundRequest) throws RestClientException {
        return manipulationBackgroundswapBackgroundPatch_0WithHttpInfo(backgroundSwapBackgroundRequest).getBody();
    }

    /**
     * Select and activate selected background for swap
     * Select and activate selected background for swap
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param backgroundSwapBackgroundRequest  (optional)
     * @return ResponseEntity&lt;List&lt;BackgroundSwapBackgroundResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BackgroundSwapBackgroundResponse>> manipulationBackgroundswapBackgroundPatch_0WithHttpInfo(BackgroundSwapBackgroundRequest backgroundSwapBackgroundRequest) throws RestClientException {
        Object localVarPostBody = backgroundSwapBackgroundRequest;
        

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

        ParameterizedTypeReference<List<BackgroundSwapBackgroundResponse>> localReturnType = new ParameterizedTypeReference<List<BackgroundSwapBackgroundResponse>>() {};
        return apiClient.invokeAPI("/manipulation/backgroundswap/background", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve background swaps for a specific carstock
     * Retrieve background swaps for a specific carstock
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param backgroundSwapRequest  (optional)
     * @return List&lt;BackgroundSwapResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BackgroundSwapResponse> manipulationBackgroundswapPost(BackgroundSwapRequest backgroundSwapRequest) throws RestClientException {
        return manipulationBackgroundswapPostWithHttpInfo(backgroundSwapRequest).getBody();
    }

    /**
     * Retrieve background swaps for a specific carstock
     * Retrieve background swaps for a specific carstock
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param backgroundSwapRequest  (optional)
     * @return ResponseEntity&lt;List&lt;BackgroundSwapResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BackgroundSwapResponse>> manipulationBackgroundswapPostWithHttpInfo(BackgroundSwapRequest backgroundSwapRequest) throws RestClientException {
        Object localVarPostBody = backgroundSwapRequest;
        

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

        ParameterizedTypeReference<List<BackgroundSwapResponse>> localReturnType = new ParameterizedTypeReference<List<BackgroundSwapResponse>>() {};
        return apiClient.invokeAPI("/manipulation/backgroundswap", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve background swaps for a specific carstock
     * Retrieve background swaps for a specific carstock
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param backgroundSwapRequest  (optional)
     * @return List&lt;BackgroundSwapResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BackgroundSwapResponse> manipulationBackgroundswapPost_0(BackgroundSwapRequest backgroundSwapRequest) throws RestClientException {
        return manipulationBackgroundswapPost_0WithHttpInfo(backgroundSwapRequest).getBody();
    }

    /**
     * Retrieve background swaps for a specific carstock
     * Retrieve background swaps for a specific carstock
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param backgroundSwapRequest  (optional)
     * @return ResponseEntity&lt;List&lt;BackgroundSwapResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BackgroundSwapResponse>> manipulationBackgroundswapPost_0WithHttpInfo(BackgroundSwapRequest backgroundSwapRequest) throws RestClientException {
        Object localVarPostBody = backgroundSwapRequest;
        

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

        ParameterizedTypeReference<List<BackgroundSwapResponse>> localReturnType = new ParameterizedTypeReference<List<BackgroundSwapResponse>>() {};
        return apiClient.invokeAPI("/manipulation/backgroundswap", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve selectables for background swaps
     * Retrieve selectables for background swaps
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param backgroundSwapSelectablesRequest  (optional)
     * @return List&lt;BackgroundSwapSelectablesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BackgroundSwapSelectablesResponse> manipulationBackgroundswapSelectablesPost(BackgroundSwapSelectablesRequest backgroundSwapSelectablesRequest) throws RestClientException {
        return manipulationBackgroundswapSelectablesPostWithHttpInfo(backgroundSwapSelectablesRequest).getBody();
    }

    /**
     * Retrieve selectables for background swaps
     * Retrieve selectables for background swaps
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param backgroundSwapSelectablesRequest  (optional)
     * @return ResponseEntity&lt;List&lt;BackgroundSwapSelectablesResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BackgroundSwapSelectablesResponse>> manipulationBackgroundswapSelectablesPostWithHttpInfo(BackgroundSwapSelectablesRequest backgroundSwapSelectablesRequest) throws RestClientException {
        Object localVarPostBody = backgroundSwapSelectablesRequest;
        

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

        ParameterizedTypeReference<List<BackgroundSwapSelectablesResponse>> localReturnType = new ParameterizedTypeReference<List<BackgroundSwapSelectablesResponse>>() {};
        return apiClient.invokeAPI("/manipulation/backgroundswap/selectables", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve selectables for background swaps
     * Retrieve selectables for background swaps
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param backgroundSwapSelectablesRequest  (optional)
     * @return List&lt;BackgroundSwapSelectablesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BackgroundSwapSelectablesResponse> manipulationBackgroundswapSelectablesPost_0(BackgroundSwapSelectablesRequest backgroundSwapSelectablesRequest) throws RestClientException {
        return manipulationBackgroundswapSelectablesPost_0WithHttpInfo(backgroundSwapSelectablesRequest).getBody();
    }

    /**
     * Retrieve selectables for background swaps
     * Retrieve selectables for background swaps
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param backgroundSwapSelectablesRequest  (optional)
     * @return ResponseEntity&lt;List&lt;BackgroundSwapSelectablesResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BackgroundSwapSelectablesResponse>> manipulationBackgroundswapSelectablesPost_0WithHttpInfo(BackgroundSwapSelectablesRequest backgroundSwapSelectablesRequest) throws RestClientException {
        Object localVarPostBody = backgroundSwapSelectablesRequest;
        

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

        ParameterizedTypeReference<List<BackgroundSwapSelectablesResponse>> localReturnType = new ParameterizedTypeReference<List<BackgroundSwapSelectablesResponse>>() {};
        return apiClient.invokeAPI("/manipulation/backgroundswap/selectables", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Determine on what images background swap applies
     * Determine on what images background swap applies
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param backgroundSwapSuitableRequest  (optional)
     * @return List&lt;BackgroundSwapBackgroundResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BackgroundSwapBackgroundResponse> manipulationBackgroundswapSuitablePatch(BackgroundSwapSuitableRequest backgroundSwapSuitableRequest) throws RestClientException {
        return manipulationBackgroundswapSuitablePatchWithHttpInfo(backgroundSwapSuitableRequest).getBody();
    }

    /**
     * Determine on what images background swap applies
     * Determine on what images background swap applies
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param backgroundSwapSuitableRequest  (optional)
     * @return ResponseEntity&lt;List&lt;BackgroundSwapBackgroundResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BackgroundSwapBackgroundResponse>> manipulationBackgroundswapSuitablePatchWithHttpInfo(BackgroundSwapSuitableRequest backgroundSwapSuitableRequest) throws RestClientException {
        Object localVarPostBody = backgroundSwapSuitableRequest;
        

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

        ParameterizedTypeReference<List<BackgroundSwapBackgroundResponse>> localReturnType = new ParameterizedTypeReference<List<BackgroundSwapBackgroundResponse>>() {};
        return apiClient.invokeAPI("/manipulation/backgroundswap/suitable", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Determine on what images background swap applies
     * Determine on what images background swap applies
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param backgroundSwapSuitableRequest  (optional)
     * @return List&lt;BackgroundSwapBackgroundResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BackgroundSwapBackgroundResponse> manipulationBackgroundswapSuitablePatch_0(BackgroundSwapSuitableRequest backgroundSwapSuitableRequest) throws RestClientException {
        return manipulationBackgroundswapSuitablePatch_0WithHttpInfo(backgroundSwapSuitableRequest).getBody();
    }

    /**
     * Determine on what images background swap applies
     * Determine on what images background swap applies
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param backgroundSwapSuitableRequest  (optional)
     * @return ResponseEntity&lt;List&lt;BackgroundSwapBackgroundResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BackgroundSwapBackgroundResponse>> manipulationBackgroundswapSuitablePatch_0WithHttpInfo(BackgroundSwapSuitableRequest backgroundSwapSuitableRequest) throws RestClientException {
        Object localVarPostBody = backgroundSwapSuitableRequest;
        

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

        ParameterizedTypeReference<List<BackgroundSwapBackgroundResponse>> localReturnType = new ParameterizedTypeReference<List<BackgroundSwapBackgroundResponse>>() {};
        return apiClient.invokeAPI("/manipulation/backgroundswap/suitable", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Set active state of a marketing slide
     * Set active state of a marketing slide
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param marketingSlidesActiveRequest  (optional)
     * @return List&lt;MarketingSlidesActiveResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MarketingSlidesActiveResponse> manipulationMarketingslidesActivePatch(MarketingSlidesActiveRequest marketingSlidesActiveRequest) throws RestClientException {
        return manipulationMarketingslidesActivePatchWithHttpInfo(marketingSlidesActiveRequest).getBody();
    }

    /**
     * Set active state of a marketing slide
     * Set active state of a marketing slide
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param marketingSlidesActiveRequest  (optional)
     * @return ResponseEntity&lt;List&lt;MarketingSlidesActiveResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<MarketingSlidesActiveResponse>> manipulationMarketingslidesActivePatchWithHttpInfo(MarketingSlidesActiveRequest marketingSlidesActiveRequest) throws RestClientException {
        Object localVarPostBody = marketingSlidesActiveRequest;
        

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

        ParameterizedTypeReference<List<MarketingSlidesActiveResponse>> localReturnType = new ParameterizedTypeReference<List<MarketingSlidesActiveResponse>>() {};
        return apiClient.invokeAPI("/manipulation/marketingslides/active", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Set active state of a marketing slide
     * Set active state of a marketing slide
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param marketingSlidesActiveRequest  (optional)
     * @return List&lt;MarketingSlidesActiveResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MarketingSlidesActiveResponse> manipulationMarketingslidesActivePatch_0(MarketingSlidesActiveRequest marketingSlidesActiveRequest) throws RestClientException {
        return manipulationMarketingslidesActivePatch_0WithHttpInfo(marketingSlidesActiveRequest).getBody();
    }

    /**
     * Set active state of a marketing slide
     * Set active state of a marketing slide
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param marketingSlidesActiveRequest  (optional)
     * @return ResponseEntity&lt;List&lt;MarketingSlidesActiveResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<MarketingSlidesActiveResponse>> manipulationMarketingslidesActivePatch_0WithHttpInfo(MarketingSlidesActiveRequest marketingSlidesActiveRequest) throws RestClientException {
        Object localVarPostBody = marketingSlidesActiveRequest;
        

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

        ParameterizedTypeReference<List<MarketingSlidesActiveResponse>> localReturnType = new ParameterizedTypeReference<List<MarketingSlidesActiveResponse>>() {};
        return apiClient.invokeAPI("/manipulation/marketingslides/active", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update location of a marketing slide
     * Update location of a marketing slide
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param marketingSlidesPositionRequest  (optional)
     * @return List&lt;MarketingSlidesPositionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MarketingSlidesPositionResponse> manipulationMarketingslidesPositionPatch(MarketingSlidesPositionRequest marketingSlidesPositionRequest) throws RestClientException {
        return manipulationMarketingslidesPositionPatchWithHttpInfo(marketingSlidesPositionRequest).getBody();
    }

    /**
     * Update location of a marketing slide
     * Update location of a marketing slide
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param marketingSlidesPositionRequest  (optional)
     * @return ResponseEntity&lt;List&lt;MarketingSlidesPositionResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<MarketingSlidesPositionResponse>> manipulationMarketingslidesPositionPatchWithHttpInfo(MarketingSlidesPositionRequest marketingSlidesPositionRequest) throws RestClientException {
        Object localVarPostBody = marketingSlidesPositionRequest;
        

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

        ParameterizedTypeReference<List<MarketingSlidesPositionResponse>> localReturnType = new ParameterizedTypeReference<List<MarketingSlidesPositionResponse>>() {};
        return apiClient.invokeAPI("/manipulation/marketingslides/position", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update location of a marketing slide
     * Update location of a marketing slide
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param marketingSlidesPositionRequest  (optional)
     * @return List&lt;MarketingSlidesPositionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MarketingSlidesPositionResponse> manipulationMarketingslidesPositionPatch_0(MarketingSlidesPositionRequest marketingSlidesPositionRequest) throws RestClientException {
        return manipulationMarketingslidesPositionPatch_0WithHttpInfo(marketingSlidesPositionRequest).getBody();
    }

    /**
     * Update location of a marketing slide
     * Update location of a marketing slide
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param marketingSlidesPositionRequest  (optional)
     * @return ResponseEntity&lt;List&lt;MarketingSlidesPositionResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<MarketingSlidesPositionResponse>> manipulationMarketingslidesPositionPatch_0WithHttpInfo(MarketingSlidesPositionRequest marketingSlidesPositionRequest) throws RestClientException {
        Object localVarPostBody = marketingSlidesPositionRequest;
        

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

        ParameterizedTypeReference<List<MarketingSlidesPositionResponse>> localReturnType = new ParameterizedTypeReference<List<MarketingSlidesPositionResponse>>() {};
        return apiClient.invokeAPI("/manipulation/marketingslides/position", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve marketing slides for a specific carstock
     * Retrieve marketing slides for a specific carstock
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param marketingSlidesRequest  (optional)
     * @return List&lt;MarketingSlidesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MarketingSlidesResponse> manipulationMarketingslidesPost(MarketingSlidesRequest marketingSlidesRequest) throws RestClientException {
        return manipulationMarketingslidesPostWithHttpInfo(marketingSlidesRequest).getBody();
    }

    /**
     * Retrieve marketing slides for a specific carstock
     * Retrieve marketing slides for a specific carstock
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param marketingSlidesRequest  (optional)
     * @return ResponseEntity&lt;List&lt;MarketingSlidesResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<MarketingSlidesResponse>> manipulationMarketingslidesPostWithHttpInfo(MarketingSlidesRequest marketingSlidesRequest) throws RestClientException {
        Object localVarPostBody = marketingSlidesRequest;
        

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

        ParameterizedTypeReference<List<MarketingSlidesResponse>> localReturnType = new ParameterizedTypeReference<List<MarketingSlidesResponse>>() {};
        return apiClient.invokeAPI("/manipulation/marketingslides", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve marketing slides for a specific carstock
     * Retrieve marketing slides for a specific carstock
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param marketingSlidesRequest  (optional)
     * @return List&lt;MarketingSlidesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MarketingSlidesResponse> manipulationMarketingslidesPost_0(MarketingSlidesRequest marketingSlidesRequest) throws RestClientException {
        return manipulationMarketingslidesPost_0WithHttpInfo(marketingSlidesRequest).getBody();
    }

    /**
     * Retrieve marketing slides for a specific carstock
     * Retrieve marketing slides for a specific carstock
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param marketingSlidesRequest  (optional)
     * @return ResponseEntity&lt;List&lt;MarketingSlidesResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<MarketingSlidesResponse>> manipulationMarketingslidesPost_0WithHttpInfo(MarketingSlidesRequest marketingSlidesRequest) throws RestClientException {
        Object localVarPostBody = marketingSlidesRequest;
        

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

        ParameterizedTypeReference<List<MarketingSlidesResponse>> localReturnType = new ParameterizedTypeReference<List<MarketingSlidesResponse>>() {};
        return apiClient.invokeAPI("/manipulation/marketingslides", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Endpoint to retreive current tenant settings for overlay display position
     * 
     * <p><b>200</b> - Success
     * @param manipulationOverlaysDisplayPositionPostRequest  (optional)
     * @return ManipulationOverlaysDisplayPositionPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ManipulationOverlaysDisplayPositionPost200Response manipulationOverlaysDisplayPositionPost(ManipulationOverlaysDisplayPositionPostRequest manipulationOverlaysDisplayPositionPostRequest) throws RestClientException {
        return manipulationOverlaysDisplayPositionPostWithHttpInfo(manipulationOverlaysDisplayPositionPostRequest).getBody();
    }

    /**
     * Endpoint to retreive current tenant settings for overlay display position
     * 
     * <p><b>200</b> - Success
     * @param manipulationOverlaysDisplayPositionPostRequest  (optional)
     * @return ResponseEntity&lt;ManipulationOverlaysDisplayPositionPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ManipulationOverlaysDisplayPositionPost200Response> manipulationOverlaysDisplayPositionPostWithHttpInfo(ManipulationOverlaysDisplayPositionPostRequest manipulationOverlaysDisplayPositionPostRequest) throws RestClientException {
        Object localVarPostBody = manipulationOverlaysDisplayPositionPostRequest;
        

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

        ParameterizedTypeReference<ManipulationOverlaysDisplayPositionPost200Response> localReturnType = new ParameterizedTypeReference<ManipulationOverlaysDisplayPositionPost200Response>() {};
        return apiClient.invokeAPI("/manipulation/overlays/displayPosition", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Endpoint to update tenant specific settings for overlay display position
     * 
     * <p><b>200</b> - Success
     * @param manipulationOverlaysDisplayPositionUpdatePostRequest  (optional)
     * @return ModePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModePost200Response manipulationOverlaysDisplayPositionUpdatePost(ManipulationOverlaysDisplayPositionUpdatePostRequest manipulationOverlaysDisplayPositionUpdatePostRequest) throws RestClientException {
        return manipulationOverlaysDisplayPositionUpdatePostWithHttpInfo(manipulationOverlaysDisplayPositionUpdatePostRequest).getBody();
    }

    /**
     * Endpoint to update tenant specific settings for overlay display position
     * 
     * <p><b>200</b> - Success
     * @param manipulationOverlaysDisplayPositionUpdatePostRequest  (optional)
     * @return ResponseEntity&lt;ModePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModePost200Response> manipulationOverlaysDisplayPositionUpdatePostWithHttpInfo(ManipulationOverlaysDisplayPositionUpdatePostRequest manipulationOverlaysDisplayPositionUpdatePostRequest) throws RestClientException {
        Object localVarPostBody = manipulationOverlaysDisplayPositionUpdatePostRequest;
        

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
        return apiClient.invokeAPI("/manipulation/overlays/displayPosition/update", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Endpoint to cache overlays at hexon
     * 
     * <p><b>200</b> - Success
     * @param manipulationOverlaysHexonPostRequest  (optional)
     * @return ManipulationOverlaysHexonPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ManipulationOverlaysHexonPost200Response manipulationOverlaysHexonPost(ManipulationOverlaysHexonPostRequest manipulationOverlaysHexonPostRequest) throws RestClientException {
        return manipulationOverlaysHexonPostWithHttpInfo(manipulationOverlaysHexonPostRequest).getBody();
    }

    /**
     * Endpoint to cache overlays at hexon
     * 
     * <p><b>200</b> - Success
     * @param manipulationOverlaysHexonPostRequest  (optional)
     * @return ResponseEntity&lt;ManipulationOverlaysHexonPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ManipulationOverlaysHexonPost200Response> manipulationOverlaysHexonPostWithHttpInfo(ManipulationOverlaysHexonPostRequest manipulationOverlaysHexonPostRequest) throws RestClientException {
        Object localVarPostBody = manipulationOverlaysHexonPostRequest;
        

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

        ParameterizedTypeReference<ManipulationOverlaysHexonPost200Response> localReturnType = new ParameterizedTypeReference<ManipulationOverlaysHexonPost200Response>() {};
        return apiClient.invokeAPI("/manipulation/overlays/hexon", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Set the display position settings for a specific carstock to manual and set values
     * Set the display position settings for a specific carstock to manual and set values
     * <p><b>200</b> - Set the display position settings for a specific carstock to manual and set values
     * <p><b>500</b> - Internal server error
     * @param carstockoverlaydisplayPositionRequest  (optional)
     * @return List&lt;CarstockoverlaydisplayPositionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstockoverlaydisplayPositionResponse> manipulationOverlaysManualDisplayPositionPost(CarstockoverlaydisplayPositionRequest carstockoverlaydisplayPositionRequest) throws RestClientException {
        return manipulationOverlaysManualDisplayPositionPostWithHttpInfo(carstockoverlaydisplayPositionRequest).getBody();
    }

    /**
     * Set the display position settings for a specific carstock to manual and set values
     * Set the display position settings for a specific carstock to manual and set values
     * <p><b>200</b> - Set the display position settings for a specific carstock to manual and set values
     * <p><b>500</b> - Internal server error
     * @param carstockoverlaydisplayPositionRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstockoverlaydisplayPositionResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstockoverlaydisplayPositionResponse>> manipulationOverlaysManualDisplayPositionPostWithHttpInfo(CarstockoverlaydisplayPositionRequest carstockoverlaydisplayPositionRequest) throws RestClientException {
        Object localVarPostBody = carstockoverlaydisplayPositionRequest;
        

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

        ParameterizedTypeReference<List<CarstockoverlaydisplayPositionResponse>> localReturnType = new ParameterizedTypeReference<List<CarstockoverlaydisplayPositionResponse>>() {};
        return apiClient.invokeAPI("/manipulation/overlays/manual/displayPosition", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Set the display position settings for a specific carstock to manual and set values
     * Set the display position settings for a specific carstock to manual and set values
     * <p><b>200</b> - Set the display position settings for a specific carstock to manual and set values
     * <p><b>500</b> - Internal server error
     * @param carstockoverlaydisplayPositionRequest  (optional)
     * @return List&lt;CarstockoverlaydisplayPositionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstockoverlaydisplayPositionResponse> manipulationOverlaysManualDisplayPositionPost_0(CarstockoverlaydisplayPositionRequest carstockoverlaydisplayPositionRequest) throws RestClientException {
        return manipulationOverlaysManualDisplayPositionPost_0WithHttpInfo(carstockoverlaydisplayPositionRequest).getBody();
    }

    /**
     * Set the display position settings for a specific carstock to manual and set values
     * Set the display position settings for a specific carstock to manual and set values
     * <p><b>200</b> - Set the display position settings for a specific carstock to manual and set values
     * <p><b>500</b> - Internal server error
     * @param carstockoverlaydisplayPositionRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstockoverlaydisplayPositionResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstockoverlaydisplayPositionResponse>> manipulationOverlaysManualDisplayPositionPost_0WithHttpInfo(CarstockoverlaydisplayPositionRequest carstockoverlaydisplayPositionRequest) throws RestClientException {
        Object localVarPostBody = carstockoverlaydisplayPositionRequest;
        

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

        ParameterizedTypeReference<List<CarstockoverlaydisplayPositionResponse>> localReturnType = new ParameterizedTypeReference<List<CarstockoverlaydisplayPositionResponse>>() {};
        return apiClient.invokeAPI("/manipulation/overlays/manual/displayPosition", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Endpoint to set a specific overlay on active or inactive for a specific carstock. Please be aware this will set the overlay selection to manual for the given carstock
     * Endpoint to set a specific overlay on active or inactive for a specific carstock. Please be aware this will set the overlay selection to manual for the given carstock
     * <p><b>200</b> - Endpoint to set a specific overlay on active or inactive for a specific carstock. Please be aware this will set the overlay selection to manual for the given carstock
     * <p><b>500</b> - Internal server error
     * @param carstockoverlayModeRequest  (optional)
     * @return List&lt;CarstockoverlayModeResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstockoverlayModeResponse> manipulationOverlaysManualModePost(CarstockoverlayModeRequest carstockoverlayModeRequest) throws RestClientException {
        return manipulationOverlaysManualModePostWithHttpInfo(carstockoverlayModeRequest).getBody();
    }

    /**
     * Endpoint to set a specific overlay on active or inactive for a specific carstock. Please be aware this will set the overlay selection to manual for the given carstock
     * Endpoint to set a specific overlay on active or inactive for a specific carstock. Please be aware this will set the overlay selection to manual for the given carstock
     * <p><b>200</b> - Endpoint to set a specific overlay on active or inactive for a specific carstock. Please be aware this will set the overlay selection to manual for the given carstock
     * <p><b>500</b> - Internal server error
     * @param carstockoverlayModeRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstockoverlayModeResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstockoverlayModeResponse>> manipulationOverlaysManualModePostWithHttpInfo(CarstockoverlayModeRequest carstockoverlayModeRequest) throws RestClientException {
        Object localVarPostBody = carstockoverlayModeRequest;
        

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

        ParameterizedTypeReference<List<CarstockoverlayModeResponse>> localReturnType = new ParameterizedTypeReference<List<CarstockoverlayModeResponse>>() {};
        return apiClient.invokeAPI("/manipulation/overlays/manual/mode", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Endpoint to set a specific overlay on active or inactive for a specific carstock. Please be aware this will set the overlay selection to manual for the given carstock
     * Endpoint to set a specific overlay on active or inactive for a specific carstock. Please be aware this will set the overlay selection to manual for the given carstock
     * <p><b>200</b> - Endpoint to set a specific overlay on active or inactive for a specific carstock. Please be aware this will set the overlay selection to manual for the given carstock
     * <p><b>500</b> - Internal server error
     * @param carstockoverlayModeRequest  (optional)
     * @return List&lt;CarstockoverlayModeResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstockoverlayModeResponse> manipulationOverlaysManualModePost_0(CarstockoverlayModeRequest carstockoverlayModeRequest) throws RestClientException {
        return manipulationOverlaysManualModePost_0WithHttpInfo(carstockoverlayModeRequest).getBody();
    }

    /**
     * Endpoint to set a specific overlay on active or inactive for a specific carstock. Please be aware this will set the overlay selection to manual for the given carstock
     * Endpoint to set a specific overlay on active or inactive for a specific carstock. Please be aware this will set the overlay selection to manual for the given carstock
     * <p><b>200</b> - Endpoint to set a specific overlay on active or inactive for a specific carstock. Please be aware this will set the overlay selection to manual for the given carstock
     * <p><b>500</b> - Internal server error
     * @param carstockoverlayModeRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstockoverlayModeResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstockoverlayModeResponse>> manipulationOverlaysManualModePost_0WithHttpInfo(CarstockoverlayModeRequest carstockoverlayModeRequest) throws RestClientException {
        Object localVarPostBody = carstockoverlayModeRequest;
        

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

        ParameterizedTypeReference<List<CarstockoverlayModeResponse>> localReturnType = new ParameterizedTypeReference<List<CarstockoverlayModeResponse>>() {};
        return apiClient.invokeAPI("/manipulation/overlays/manual/mode", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Re-order overlays on carstock level. Please be aware that this will also set the mode to manual
     * Re-order overlays on carstock level. Please be aware that this will also set the mode to manual
     * <p><b>200</b> - Re-order overlays on carstock level. Please be aware that this will also set the mode to manual
     * <p><b>500</b> - Internal server error
     * @param carstockoverlayReorderRequest  (optional)
     * @return List&lt;CarstockoverlayReorderResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstockoverlayReorderResponse> manipulationOverlaysManualOrderPost(CarstockoverlayReorderRequest carstockoverlayReorderRequest) throws RestClientException {
        return manipulationOverlaysManualOrderPostWithHttpInfo(carstockoverlayReorderRequest).getBody();
    }

    /**
     * Re-order overlays on carstock level. Please be aware that this will also set the mode to manual
     * Re-order overlays on carstock level. Please be aware that this will also set the mode to manual
     * <p><b>200</b> - Re-order overlays on carstock level. Please be aware that this will also set the mode to manual
     * <p><b>500</b> - Internal server error
     * @param carstockoverlayReorderRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstockoverlayReorderResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstockoverlayReorderResponse>> manipulationOverlaysManualOrderPostWithHttpInfo(CarstockoverlayReorderRequest carstockoverlayReorderRequest) throws RestClientException {
        Object localVarPostBody = carstockoverlayReorderRequest;
        

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

        ParameterizedTypeReference<List<CarstockoverlayReorderResponse>> localReturnType = new ParameterizedTypeReference<List<CarstockoverlayReorderResponse>>() {};
        return apiClient.invokeAPI("/manipulation/overlays/manual/order", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Re-order overlays on carstock level. Please be aware that this will also set the mode to manual
     * Re-order overlays on carstock level. Please be aware that this will also set the mode to manual
     * <p><b>200</b> - Re-order overlays on carstock level. Please be aware that this will also set the mode to manual
     * <p><b>500</b> - Internal server error
     * @param carstockoverlayReorderRequest  (optional)
     * @return List&lt;CarstockoverlayReorderResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstockoverlayReorderResponse> manipulationOverlaysManualOrderPost_0(CarstockoverlayReorderRequest carstockoverlayReorderRequest) throws RestClientException {
        return manipulationOverlaysManualOrderPost_0WithHttpInfo(carstockoverlayReorderRequest).getBody();
    }

    /**
     * Re-order overlays on carstock level. Please be aware that this will also set the mode to manual
     * Re-order overlays on carstock level. Please be aware that this will also set the mode to manual
     * <p><b>200</b> - Re-order overlays on carstock level. Please be aware that this will also set the mode to manual
     * <p><b>500</b> - Internal server error
     * @param carstockoverlayReorderRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstockoverlayReorderResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstockoverlayReorderResponse>> manipulationOverlaysManualOrderPost_0WithHttpInfo(CarstockoverlayReorderRequest carstockoverlayReorderRequest) throws RestClientException {
        Object localVarPostBody = carstockoverlayReorderRequest;
        

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

        ParameterizedTypeReference<List<CarstockoverlayReorderResponse>> localReturnType = new ParameterizedTypeReference<List<CarstockoverlayReorderResponse>>() {};
        return apiClient.invokeAPI("/manipulation/overlays/manual/order", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Endpoint to reset a manual adjusted overlay setting for a carstock to automatic selection
     * Endpoint to reset a manual adjusted overlay setting for a carstock to automatic selection
     * <p><b>200</b> - Endpoint to reset a manual adjusted overlay setting for a carstock to automatic selection
     * <p><b>500</b> - Internal server error
     * @param carstockoverlaySelectionRequest  (optional)
     * @return List&lt;CarstockoverlaySelectionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstockoverlaySelectionResponse> manipulationOverlaysManualSelectionPost(CarstockoverlaySelectionRequest carstockoverlaySelectionRequest) throws RestClientException {
        return manipulationOverlaysManualSelectionPostWithHttpInfo(carstockoverlaySelectionRequest).getBody();
    }

    /**
     * Endpoint to reset a manual adjusted overlay setting for a carstock to automatic selection
     * Endpoint to reset a manual adjusted overlay setting for a carstock to automatic selection
     * <p><b>200</b> - Endpoint to reset a manual adjusted overlay setting for a carstock to automatic selection
     * <p><b>500</b> - Internal server error
     * @param carstockoverlaySelectionRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstockoverlaySelectionResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstockoverlaySelectionResponse>> manipulationOverlaysManualSelectionPostWithHttpInfo(CarstockoverlaySelectionRequest carstockoverlaySelectionRequest) throws RestClientException {
        Object localVarPostBody = carstockoverlaySelectionRequest;
        

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

        ParameterizedTypeReference<List<CarstockoverlaySelectionResponse>> localReturnType = new ParameterizedTypeReference<List<CarstockoverlaySelectionResponse>>() {};
        return apiClient.invokeAPI("/manipulation/overlays/manual/selection", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Endpoint to reset a manual adjusted overlay setting for a carstock to automatic selection
     * Endpoint to reset a manual adjusted overlay setting for a carstock to automatic selection
     * <p><b>200</b> - Endpoint to reset a manual adjusted overlay setting for a carstock to automatic selection
     * <p><b>500</b> - Internal server error
     * @param carstockoverlaySelectionRequest  (optional)
     * @return List&lt;CarstockoverlaySelectionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstockoverlaySelectionResponse> manipulationOverlaysManualSelectionPost_0(CarstockoverlaySelectionRequest carstockoverlaySelectionRequest) throws RestClientException {
        return manipulationOverlaysManualSelectionPost_0WithHttpInfo(carstockoverlaySelectionRequest).getBody();
    }

    /**
     * Endpoint to reset a manual adjusted overlay setting for a carstock to automatic selection
     * Endpoint to reset a manual adjusted overlay setting for a carstock to automatic selection
     * <p><b>200</b> - Endpoint to reset a manual adjusted overlay setting for a carstock to automatic selection
     * <p><b>500</b> - Internal server error
     * @param carstockoverlaySelectionRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstockoverlaySelectionResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstockoverlaySelectionResponse>> manipulationOverlaysManualSelectionPost_0WithHttpInfo(CarstockoverlaySelectionRequest carstockoverlaySelectionRequest) throws RestClientException {
        Object localVarPostBody = carstockoverlaySelectionRequest;
        

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

        ParameterizedTypeReference<List<CarstockoverlaySelectionResponse>> localReturnType = new ParameterizedTypeReference<List<CarstockoverlaySelectionResponse>>() {};
        return apiClient.invokeAPI("/manipulation/overlays/manual/selection", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve overlays for a specific carstock
     * Retrieve overlays for a specific carstock
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param overlayRequest  (optional)
     * @return List&lt;ManipulationOverlaysPost200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ManipulationOverlaysPost200ResponseInner> manipulationOverlaysPost(OverlayRequest overlayRequest) throws RestClientException {
        return manipulationOverlaysPostWithHttpInfo(overlayRequest).getBody();
    }

    /**
     * Retrieve overlays for a specific carstock
     * Retrieve overlays for a specific carstock
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param overlayRequest  (optional)
     * @return ResponseEntity&lt;List&lt;ManipulationOverlaysPost200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ManipulationOverlaysPost200ResponseInner>> manipulationOverlaysPostWithHttpInfo(OverlayRequest overlayRequest) throws RestClientException {
        Object localVarPostBody = overlayRequest;
        

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

        ParameterizedTypeReference<List<ManipulationOverlaysPost200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<ManipulationOverlaysPost200ResponseInner>>() {};
        return apiClient.invokeAPI("/manipulation/overlays", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve overlays for a specific carstock
     * Retrieve overlays for a specific carstock
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param overlayRequest  (optional)
     * @return List&lt;ManipulationOverlaysPost200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ManipulationOverlaysPost200ResponseInner> manipulationOverlaysPost_0(OverlayRequest overlayRequest) throws RestClientException {
        return manipulationOverlaysPost_0WithHttpInfo(overlayRequest).getBody();
    }

    /**
     * Retrieve overlays for a specific carstock
     * Retrieve overlays for a specific carstock
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param overlayRequest  (optional)
     * @return ResponseEntity&lt;List&lt;ManipulationOverlaysPost200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ManipulationOverlaysPost200ResponseInner>> manipulationOverlaysPost_0WithHttpInfo(OverlayRequest overlayRequest) throws RestClientException {
        Object localVarPostBody = overlayRequest;
        

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

        ParameterizedTypeReference<List<ManipulationOverlaysPost200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<ManipulationOverlaysPost200ResponseInner>>() {};
        return apiClient.invokeAPI("/manipulation/overlays", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
