package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.SearchProfilePost200Response;
import org.openapitools.client.model.SearchProfilePost400Response;
import org.openapitools.client.model.SearchProfilePostDefaultResponse;
import org.openapitools.client.model.SearchProfilePostRequest;

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
public class SearchApi {
    private ApiClient apiClient;

    public SearchApi() {
        this(new ApiClient());
    }

    public SearchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * search for user profiles
     * 
     * <p><b>200</b> - Search completed successfully
     * <p><b>400</b> - There was problem retrieving thread&#39;s messages
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param searchProfilePostRequest  (optional)
     * @return SearchProfilePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SearchProfilePost200Response searchProfilePost(SearchProfilePostRequest searchProfilePostRequest) throws RestClientException {
        return searchProfilePostWithHttpInfo(searchProfilePostRequest).getBody();
    }

    /**
     * search for user profiles
     * 
     * <p><b>200</b> - Search completed successfully
     * <p><b>400</b> - There was problem retrieving thread&#39;s messages
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param searchProfilePostRequest  (optional)
     * @return ResponseEntity&lt;SearchProfilePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SearchProfilePost200Response> searchProfilePostWithHttpInfo(SearchProfilePostRequest searchProfilePostRequest) throws RestClientException {
        Object localVarPostBody = searchProfilePostRequest;
        

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

        ParameterizedTypeReference<SearchProfilePost200Response> localReturnType = new ParameterizedTypeReference<SearchProfilePost200Response>() {};
        return apiClient.invokeAPI("/search-profile", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
