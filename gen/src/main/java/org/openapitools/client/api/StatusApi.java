package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ErrorResponseInner;
import org.openapitools.client.model.StatusResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:53.009381485Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class StatusApi {
    private ApiClient apiClient;

    public StatusApi() {
        this(new ApiClient());
    }

    public StatusApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Provides status of dispatch by dispatchNumber or case number in the url
     * 
     * <p><b>200</b> - Current status of the dispatch
     * <p><b>400</b> - User request error
     * <p><b>401</b> - Authentication error
     * <p><b>5XX</b> - Unexpected server error
     * @param dispatchNumber NSA dispatchNumber (optional)
     * @param caseNumber Client provided case number (optional)
     * @return StatusResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusResponse getStatus(String dispatchNumber, String caseNumber) throws RestClientException {
        return getStatusWithHttpInfo(dispatchNumber, caseNumber).getBody();
    }

    /**
     * Provides status of dispatch by dispatchNumber or case number in the url
     * 
     * <p><b>200</b> - Current status of the dispatch
     * <p><b>400</b> - User request error
     * <p><b>401</b> - Authentication error
     * <p><b>5XX</b> - Unexpected server error
     * @param dispatchNumber NSA dispatchNumber (optional)
     * @param caseNumber Client provided case number (optional)
     * @return ResponseEntity&lt;StatusResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusResponse> getStatusWithHttpInfo(String dispatchNumber, String caseNumber) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "dispatchNumber", dispatchNumber));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "caseNumber", caseNumber));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<StatusResponse> localReturnType = new ParameterizedTypeReference<StatusResponse>() {};
        return apiClient.invokeAPI("/status/status.php", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
