package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GetStages200Response;

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
public class StagesApi {
    private ApiClient apiClient;

    public StagesApi() {
        this(new ApiClient());
    }

    public StagesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List stages
     * Retrieve a list of stages.
     * <p><b>200</b> - Returns a list of Stage objects.
     * @return GetStages200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetStages200Response getStages() throws RestClientException {
        return getStagesWithHttpInfo().getBody();
    }

    /**
     * List stages
     * Retrieve a list of stages.
     * <p><b>200</b> - Returns a list of Stage objects.
     * @return ResponseEntity&lt;GetStages200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetStages200Response> getStagesWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<GetStages200Response> localReturnType = new ParameterizedTypeReference<GetStages200Response>() {};
        return apiClient.invokeAPI("/stages", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
