package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CompositeModel;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:16:54.275857511Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a MessageEnvelope
     * 
     * <p><b>201</b> - MessageEnvelope was successfully created
     * <p><b>400</b> - Bad Request
     * @param compositeModel  (required)
     * @return CompositeModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CompositeModel createMessageEnvelope(CompositeModel compositeModel) throws RestClientException {
        return createMessageEnvelopeWithHttpInfo(compositeModel).getBody();
    }

    /**
     * Create a MessageEnvelope
     * 
     * <p><b>201</b> - MessageEnvelope was successfully created
     * <p><b>400</b> - Bad Request
     * @param compositeModel  (required)
     * @return ResponseEntity&lt;CompositeModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CompositeModel> createMessageEnvelopeWithHttpInfo(CompositeModel compositeModel) throws RestClientException {
        Object localVarPostBody = compositeModel;
        
        // verify the required parameter 'compositeModel' is set
        if (compositeModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'compositeModel' when calling createMessageEnvelope");
        }
        

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

        ParameterizedTypeReference<CompositeModel> localReturnType = new ParameterizedTypeReference<CompositeModel>() {};
        return apiClient.invokeAPI("/messageEnvelope", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
