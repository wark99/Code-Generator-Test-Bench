package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.MessageEnvelope;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:16:27.354224883Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * Create a Standard Message Envelope
     * 
     * <p><b>201</b> - MessageEnvelope was successfully created
     * <p><b>400</b> - Bad Request
     * @param messageEnvelope  (required)
     * @return MessageEnvelope
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MessageEnvelope createStandardMessageEnvelope(MessageEnvelope messageEnvelope) throws RestClientException {
        return createStandardMessageEnvelopeWithHttpInfo(messageEnvelope).getBody();
    }

    /**
     * Create a Standard Message Envelope
     * 
     * <p><b>201</b> - MessageEnvelope was successfully created
     * <p><b>400</b> - Bad Request
     * @param messageEnvelope  (required)
     * @return ResponseEntity&lt;MessageEnvelope&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MessageEnvelope> createStandardMessageEnvelopeWithHttpInfo(MessageEnvelope messageEnvelope) throws RestClientException {
        Object localVarPostBody = messageEnvelope;
        
        // verify the required parameter 'messageEnvelope' is set
        if (messageEnvelope == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'messageEnvelope' when calling createStandardMessageEnvelope");
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

        ParameterizedTypeReference<MessageEnvelope> localReturnType = new ParameterizedTypeReference<MessageEnvelope>() {};
        return apiClient.invokeAPI("/messageEnvelope", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
