package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CancelRequest;
import org.openapitools.client.model.ErrorResponseInner;

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
public class CancelApi {
    private ApiClient apiClient;

    public CancelApi() {
        this(new ApiClient());
    }

    public CancelApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Cancels an open dispatch
     * 
     * <p><b>200</b> - Successful cancellation
     * <p><b>400</b> - User request error
     * <p><b>401</b> - Authentication error
     * <p><b>409</b> - Cannot cancel because dispatch is not in a cancellable state
     * <p><b>5XX</b> - Unexpected server error
     * @param cancelRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void cancelDispatch(CancelRequest cancelRequest) throws RestClientException {
        cancelDispatchWithHttpInfo(cancelRequest);
    }

    /**
     * Cancels an open dispatch
     * 
     * <p><b>200</b> - Successful cancellation
     * <p><b>400</b> - User request error
     * <p><b>401</b> - Authentication error
     * <p><b>409</b> - Cannot cancel because dispatch is not in a cancellable state
     * <p><b>5XX</b> - Unexpected server error
     * @param cancelRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> cancelDispatchWithHttpInfo(CancelRequest cancelRequest) throws RestClientException {
        Object localVarPostBody = cancelRequest;
        

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

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/cancel/cancel.php", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
