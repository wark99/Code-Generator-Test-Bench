package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GetMarketplaceFavoritesOkResponse;
import org.openapitools.client.model.GetMarketplaceListingsOkResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:46.594754675Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MarketplaceApi {
    private ApiClient apiClient;

    public MarketplaceApi() {
        this(new ApiClient());
    }

    public MarketplaceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List all advertisements favorited by an user
     * 
     * <p><b>200</b> - OK
     * @return GetMarketplaceFavoritesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetMarketplaceFavoritesOkResponse getMarketplaceFavorites() throws RestClientException {
        return getMarketplaceFavoritesWithHttpInfo().getBody();
    }

    /**
     * List all advertisements favorited by an user
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;GetMarketplaceFavoritesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetMarketplaceFavoritesOkResponse> getMarketplaceFavoritesWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<GetMarketplaceFavoritesOkResponse> localReturnType = new ParameterizedTypeReference<GetMarketplaceFavoritesOkResponse>() {};
        return apiClient.invokeAPI("/marketplace_favorites/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List all active marketplace advertisements, limited by 100
     * 
     * <p><b>200</b> - OK
     * @param id  (optional)
     * @return GetMarketplaceListingsOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetMarketplaceListingsOkResponse getMarketplaceListings(String id) throws RestClientException {
        return getMarketplaceListingsWithHttpInfo(id).getBody();
    }

    /**
     * List all active marketplace advertisements, limited by 100
     * 
     * <p><b>200</b> - OK
     * @param id  (optional)
     * @return ResponseEntity&lt;GetMarketplaceListingsOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetMarketplaceListingsOkResponse> getMarketplaceListingsWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetMarketplaceListingsOkResponse> localReturnType = new ParameterizedTypeReference<GetMarketplaceListingsOkResponse>() {};
        return apiClient.invokeAPI("/marketplace_listings/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
