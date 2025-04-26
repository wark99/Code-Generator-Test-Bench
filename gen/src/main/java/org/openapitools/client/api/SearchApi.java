package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.DifficultyLevel;
import org.openapitools.client.model.ErrorResponseObject;
import org.openapitools.client.model.SearchQuestions200Response;
import org.openapitools.client.model.SearchTags200Response;
import org.openapitools.client.model.SearchUsers200Response;

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
     * Search questions
     * 
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * @param q Search query (required)
     * @param tags Comma-separated list of tag IDs (optional)
     * @param difficulty Filter by difficulty level (optional)
     * @param page Page number (optional, default to 1)
     * @param pageSize Number of items per page (optional, default to 20)
     * @param sortBy Sorting type (optional, default to recommended)
     * @return SearchQuestions200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SearchQuestions200Response searchQuestions(String q, String tags, DifficultyLevel difficulty, Integer page, Integer pageSize, String sortBy) throws RestClientException {
        return searchQuestionsWithHttpInfo(q, tags, difficulty, page, pageSize, sortBy).getBody();
    }

    /**
     * Search questions
     * 
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * @param q Search query (required)
     * @param tags Comma-separated list of tag IDs (optional)
     * @param difficulty Filter by difficulty level (optional)
     * @param page Page number (optional, default to 1)
     * @param pageSize Number of items per page (optional, default to 20)
     * @param sortBy Sorting type (optional, default to recommended)
     * @return ResponseEntity&lt;SearchQuestions200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SearchQuestions200Response> searchQuestionsWithHttpInfo(String q, String tags, DifficultyLevel difficulty, Integer page, Integer pageSize, String sortBy) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'q' is set
        if (q == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'q' when calling searchQuestions");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "tags", tags));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "difficulty", difficulty));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortBy", sortBy));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<SearchQuestions200Response> localReturnType = new ParameterizedTypeReference<SearchQuestions200Response>() {};
        return apiClient.invokeAPI("/search/questions", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search tags
     * 
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * @param q Search query (required)
     * @param page Page number (optional, default to 1)
     * @param pageSize Number of items per page (optional, default to 20)
     * @return SearchTags200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SearchTags200Response searchTags(String q, Integer page, Integer pageSize) throws RestClientException {
        return searchTagsWithHttpInfo(q, page, pageSize).getBody();
    }

    /**
     * Search tags
     * 
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * @param q Search query (required)
     * @param page Page number (optional, default to 1)
     * @param pageSize Number of items per page (optional, default to 20)
     * @return ResponseEntity&lt;SearchTags200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SearchTags200Response> searchTagsWithHttpInfo(String q, Integer page, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'q' is set
        if (q == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'q' when calling searchTags");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<SearchTags200Response> localReturnType = new ParameterizedTypeReference<SearchTags200Response>() {};
        return apiClient.invokeAPI("/search/tags", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search users
     * 
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * @param q Search query (required)
     * @param page Page number (optional, default to 1)
     * @param pageSize Number of items per page (optional, default to 20)
     * @return SearchUsers200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SearchUsers200Response searchUsers(String q, Integer page, Integer pageSize) throws RestClientException {
        return searchUsersWithHttpInfo(q, page, pageSize).getBody();
    }

    /**
     * Search users
     * 
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * @param q Search query (required)
     * @param page Page number (optional, default to 1)
     * @param pageSize Number of items per page (optional, default to 20)
     * @return ResponseEntity&lt;SearchUsers200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SearchUsers200Response> searchUsersWithHttpInfo(String q, Integer page, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'q' is set
        if (q == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'q' when calling searchUsers");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<SearchUsers200Response> localReturnType = new ParameterizedTypeReference<SearchUsers200Response>() {};
        return apiClient.invokeAPI("/search/users", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
