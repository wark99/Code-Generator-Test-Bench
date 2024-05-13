package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.MeasurementWebhook;
import org.openapitools.client.model.MeasurementWebhookBase;
import org.openapitools.client.model.MeasurementWebhookTestResult;
import java.util.UUID;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:30.476705269Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MeasurementWebhooksApi {
    private ApiClient apiClient;

    public MeasurementWebhooksApi() {
        this(new ApiClient());
    }

    public MeasurementWebhooksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List all measurement webhooks
     * 
     * <p><b>200</b> - Measurement webhooks (if any)
     * @return List&lt;MeasurementWebhook&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MeasurementWebhook> measurementWebhooksGet() throws RestClientException {
        return measurementWebhooksGetWithHttpInfo().getBody();
    }

    /**
     * List all measurement webhooks
     * 
     * <p><b>200</b> - Measurement webhooks (if any)
     * @return ResponseEntity&lt;List&lt;MeasurementWebhook&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<MeasurementWebhook>> measurementWebhooksGetWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<List<MeasurementWebhook>> localReturnType = new ParameterizedTypeReference<List<MeasurementWebhook>>() {};
        return apiClient.invokeAPI("/measurement-webhooks", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Dalate a measurement webhook
     * 
     * <p><b>204</b> - Measurement webhook deleted
     * @param id ID of the measurement webhook. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void measurementWebhooksIdDelete(UUID id) throws RestClientException {
        measurementWebhooksIdDeleteWithHttpInfo(id);
    }

    /**
     * Dalate a measurement webhook
     * 
     * <p><b>204</b> - Measurement webhook deleted
     * @param id ID of the measurement webhook. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> measurementWebhooksIdDeleteWithHttpInfo(UUID id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling measurementWebhooksIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/measurement-webhooks/{id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a single measurement webhook
     * 
     * <p><b>200</b> - Measurement webhook
     * @param id ID of the measurement webhook. (required)
     * @return MeasurementWebhook
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MeasurementWebhook measurementWebhooksIdGet(UUID id) throws RestClientException {
        return measurementWebhooksIdGetWithHttpInfo(id).getBody();
    }

    /**
     * Get a single measurement webhook
     * 
     * <p><b>200</b> - Measurement webhook
     * @param id ID of the measurement webhook. (required)
     * @return ResponseEntity&lt;MeasurementWebhook&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MeasurementWebhook> measurementWebhooksIdGetWithHttpInfo(UUID id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling measurementWebhooksIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        ParameterizedTypeReference<MeasurementWebhook> localReturnType = new ParameterizedTypeReference<MeasurementWebhook>() {};
        return apiClient.invokeAPI("/measurement-webhooks/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a measurement webhook
     * 
     * <p><b>200</b> - Measurement webhook updated
     * @param id ID of the measurement webhook. (required)
     * @param measurementWebhookBase  (required)
     * @return MeasurementWebhook
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MeasurementWebhook measurementWebhooksIdPost(UUID id, MeasurementWebhookBase measurementWebhookBase) throws RestClientException {
        return measurementWebhooksIdPostWithHttpInfo(id, measurementWebhookBase).getBody();
    }

    /**
     * Update a measurement webhook
     * 
     * <p><b>200</b> - Measurement webhook updated
     * @param id ID of the measurement webhook. (required)
     * @param measurementWebhookBase  (required)
     * @return ResponseEntity&lt;MeasurementWebhook&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MeasurementWebhook> measurementWebhooksIdPostWithHttpInfo(UUID id, MeasurementWebhookBase measurementWebhookBase) throws RestClientException {
        Object localVarPostBody = measurementWebhookBase;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling measurementWebhooksIdPost");
        }
        
        // verify the required parameter 'measurementWebhookBase' is set
        if (measurementWebhookBase == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'measurementWebhookBase' when calling measurementWebhooksIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        ParameterizedTypeReference<MeasurementWebhook> localReturnType = new ParameterizedTypeReference<MeasurementWebhook>() {};
        return apiClient.invokeAPI("/measurement-webhooks/{id}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Test a measurement webhook
     * Sends a test notification to your webhook URL and returns information about the response received.
     * <p><b>200</b> - Measurement webhook test result
     * @param id ID of the measurement webhook. (required)
     * @return MeasurementWebhookTestResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MeasurementWebhookTestResult measurementWebhooksIdTestPost(UUID id) throws RestClientException {
        return measurementWebhooksIdTestPostWithHttpInfo(id).getBody();
    }

    /**
     * Test a measurement webhook
     * Sends a test notification to your webhook URL and returns information about the response received.
     * <p><b>200</b> - Measurement webhook test result
     * @param id ID of the measurement webhook. (required)
     * @return ResponseEntity&lt;MeasurementWebhookTestResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MeasurementWebhookTestResult> measurementWebhooksIdTestPostWithHttpInfo(UUID id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling measurementWebhooksIdTestPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        ParameterizedTypeReference<MeasurementWebhookTestResult> localReturnType = new ParameterizedTypeReference<MeasurementWebhookTestResult>() {};
        return apiClient.invokeAPI("/measurement-webhooks/{id}/test", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a measurement webhook
     * 
     * <p><b>201</b> - Measurement webhook created
     * @param measurementWebhookBase  (required)
     * @return MeasurementWebhook
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MeasurementWebhook measurementWebhooksPost(MeasurementWebhookBase measurementWebhookBase) throws RestClientException {
        return measurementWebhooksPostWithHttpInfo(measurementWebhookBase).getBody();
    }

    /**
     * Create a measurement webhook
     * 
     * <p><b>201</b> - Measurement webhook created
     * @param measurementWebhookBase  (required)
     * @return ResponseEntity&lt;MeasurementWebhook&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MeasurementWebhook> measurementWebhooksPostWithHttpInfo(MeasurementWebhookBase measurementWebhookBase) throws RestClientException {
        Object localVarPostBody = measurementWebhookBase;
        
        // verify the required parameter 'measurementWebhookBase' is set
        if (measurementWebhookBase == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'measurementWebhookBase' when calling measurementWebhooksPost");
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

        ParameterizedTypeReference<MeasurementWebhook> localReturnType = new ParameterizedTypeReference<MeasurementWebhook>() {};
        return apiClient.invokeAPI("/measurement-webhooks", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
