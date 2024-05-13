package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.FilterExercisesParams;
import org.openapitools.client.model.FilterExercisesResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:41.221792118Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ExerciseApi {
    private ApiClient apiClient;

    public ExerciseApi() {
        this(new ApiClient());
    }

    public ExerciseApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Filter exercises
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b>
     * <p><b>404</b>
     * <p><b>429</b>
     * @param filterExercisesParams Parameters on which to filter exercises. Without any filters, Exercises returned implicity include all those available to the requester. (optional)
     * @return FilterExercisesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FilterExercisesResponse filterExercises(FilterExercisesParams filterExercisesParams) throws RestClientException {
        return filterExercisesWithHttpInfo(filterExercisesParams).getBody();
    }

    /**
     * Filter exercises
     * 
     * <p><b>200</b> - Success
     * <p><b>400</b>
     * <p><b>404</b>
     * <p><b>429</b>
     * @param filterExercisesParams Parameters on which to filter exercises. Without any filters, Exercises returned implicity include all those available to the requester. (optional)
     * @return ResponseEntity&lt;FilterExercisesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FilterExercisesResponse> filterExercisesWithHttpInfo(FilterExercisesParams filterExercisesParams) throws RestClientException {
        Object localVarPostBody = filterExercisesParams;
        

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<FilterExercisesResponse> localReturnType = new ParameterizedTypeReference<FilterExercisesResponse>() {};
        return apiClient.invokeAPI("/v3/exercises", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Exercises
     * Get all Exercises for the requester&#39;s organization. Same effect as POST /v3/exercises with an empty body.
     * <p><b>200</b> - Success.
     * <p><b>429</b>
     * @return FilterExercisesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FilterExercisesResponse getExercises() throws RestClientException {
        return getExercisesWithHttpInfo().getBody();
    }

    /**
     * Get Exercises
     * Get all Exercises for the requester&#39;s organization. Same effect as POST /v3/exercises with an empty body.
     * <p><b>200</b> - Success.
     * <p><b>429</b>
     * @return ResponseEntity&lt;FilterExercisesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FilterExercisesResponse> getExercisesWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<FilterExercisesResponse> localReturnType = new ParameterizedTypeReference<FilterExercisesResponse>() {};
        return apiClient.invokeAPI("/v3/exercises", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
