package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CreateRequest;
import org.openapitools.client.model.CreateResponse;
import org.openapitools.client.model.CreateVirtualTechRequest;
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
public class CreateDispatchApi {
    private ApiClient apiClient;

    public CreateDispatchApi() {
        this(new ApiClient());
    }

    public CreateDispatchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create new Dispatch
     * 
     * <p><b>200</b> - Successful request. 
     * <p><b>401</b> - Authentication error
     * <p><b>5XX</b> - Unexpected server error
     * @param createRequest  (optional)
     * @return CreateResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateResponse createDispatch(CreateRequest createRequest) throws RestClientException {
        return createDispatchWithHttpInfo(createRequest).getBody();
    }

    /**
     * Create new Dispatch
     * 
     * <p><b>200</b> - Successful request. 
     * <p><b>401</b> - Authentication error
     * <p><b>5XX</b> - Unexpected server error
     * @param createRequest  (optional)
     * @return ResponseEntity&lt;CreateResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateResponse> createDispatchWithHttpInfo(CreateRequest createRequest) throws RestClientException {
        Object localVarPostBody = createRequest;
        

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

        ParameterizedTypeReference<CreateResponse> localReturnType = new ParameterizedTypeReference<CreateResponse>() {};
        return apiClient.invokeAPI("/create/create.php", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create new Virtual Tech Dispatch
     * 
     * <p><b>200</b> - Successful request. 
     * <p><b>401</b> - Authentication error
     * <p><b>5XX</b> - Unexpected server error
     * @param createVirtualTechRequest  (optional)
     * @return CreateResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateResponse createVirtualTechDispatch(CreateVirtualTechRequest createVirtualTechRequest) throws RestClientException {
        return createVirtualTechDispatchWithHttpInfo(createVirtualTechRequest).getBody();
    }

    /**
     * Create new Virtual Tech Dispatch
     * 
     * <p><b>200</b> - Successful request. 
     * <p><b>401</b> - Authentication error
     * <p><b>5XX</b> - Unexpected server error
     * @param createVirtualTechRequest  (optional)
     * @return ResponseEntity&lt;CreateResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateResponse> createVirtualTechDispatchWithHttpInfo(CreateVirtualTechRequest createVirtualTechRequest) throws RestClientException {
        Object localVarPostBody = createVirtualTechRequest;
        

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

        ParameterizedTypeReference<CreateResponse> localReturnType = new ParameterizedTypeReference<CreateResponse>() {};
        return apiClient.invokeAPI("/create/createVirtualTech.php", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
