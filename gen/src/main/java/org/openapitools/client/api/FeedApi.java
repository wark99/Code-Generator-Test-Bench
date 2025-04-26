package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ErrorResponseObject;
import org.openapitools.client.model.SearchQuestions200Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-26T20:19:29.213885611+03:00[Europe/Bucharest]", comments = "Generator version: 7.4.0")
public class FeedApi {
    private ApiClient apiClient;

    public FeedApi() {
        this(new ApiClient());
    }

    public FeedApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get user feed
     * 
     * <p><b>200</b> - Successful response
     * <p><b>401</b>
     * @param type Feed type (required)
     * @param page Page number (optional, default to 1)
     * @param pageSize Number of items per page (optional, default to 20)
     * @return SearchQuestions200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SearchQuestions200Response getUserFeed(String type, Integer page, Integer pageSize) throws RestClientException {
        return getUserFeedWithHttpInfo(type, page, pageSize).getBody();
    }

    /**
     * Get user feed
     * 
     * <p><b>200</b> - Successful response
     * <p><b>401</b>
     * @param type Feed type (required)
     * @param page Page number (optional, default to 1)
     * @param pageSize Number of items per page (optional, default to 20)
     * @return ResponseEntity&lt;SearchQuestions200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SearchQuestions200Response> getUserFeedWithHttpInfo(String type, Integer page, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling getUserFeed");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<SearchQuestions200Response> localReturnType = new ParameterizedTypeReference<SearchQuestions200Response>() {};
        return apiClient.invokeAPI("/feed", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
