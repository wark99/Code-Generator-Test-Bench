package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ScoreBodyModel;
import org.openapitools.client.model.ScoreResponseModel;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:16:04.261563944Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ScoreApi {
    private ApiClient apiClient;

    public ScoreApi() {
        this(new ApiClient());
    }

    public ScoreApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - all areas available
     * @param scoreBodyModel  (optional)
     * @return ScoreResponseModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ScoreResponseModel calculateScore(ScoreBodyModel scoreBodyModel) throws RestClientException {
        return calculateScoreWithHttpInfo(scoreBodyModel).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - all areas available
     * @param scoreBodyModel  (optional)
     * @return ResponseEntity&lt;ScoreResponseModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ScoreResponseModel> calculateScoreWithHttpInfo(ScoreBodyModel scoreBodyModel) throws RestClientException {
        Object localVarPostBody = scoreBodyModel;
        

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

        ParameterizedTypeReference<ScoreResponseModel> localReturnType = new ParameterizedTypeReference<ScoreResponseModel>() {};
        return apiClient.invokeAPI("/score", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
