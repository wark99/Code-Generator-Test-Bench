package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.HTTPValidationError;
import org.openapitools.client.model.Items;
import org.openapitools.client.model.SendGetResultExampleResponse;
import org.openapitools.client.model.SendResultExampleResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:22:50.833453606Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SendMailRoutingApi {
    private ApiClient apiClient;

    public SendMailRoutingApi() {
        this(new ApiClient());
    }

    public SendMailRoutingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Send Get Status
     * 
     * <p><b>200</b> - Успешный запрос
     * <p><b>422</b> - Validation Error
     * @param tag  (required)
     * @return SendGetResultExampleResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SendGetResultExampleResponse sendGetStatusApiSendStatusGet(String tag) throws RestClientException {
        return sendGetStatusApiSendStatusGetWithHttpInfo(tag).getBody();
    }

    /**
     * Send Get Status
     * 
     * <p><b>200</b> - Успешный запрос
     * <p><b>422</b> - Validation Error
     * @param tag  (required)
     * @return ResponseEntity&lt;SendGetResultExampleResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SendGetResultExampleResponse> sendGetStatusApiSendStatusGetWithHttpInfo(String tag) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tag' is set
        if (tag == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tag' when calling sendGetStatusApiSendStatusGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "tag", tag));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<SendGetResultExampleResponse> localReturnType = new ParameterizedTypeReference<SendGetResultExampleResponse>() {};
        return apiClient.invokeAPI("/api/send/status", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Send Mail
     * описание
     * <p><b>200</b> - Успешный запрос
     * <p><b>422</b> - Validation Error
     * @param items  (required)
     * @return SendResultExampleResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SendResultExampleResponse sendMailApiSendPost(Items items) throws RestClientException {
        return sendMailApiSendPostWithHttpInfo(items).getBody();
    }

    /**
     * Send Mail
     * описание
     * <p><b>200</b> - Успешный запрос
     * <p><b>422</b> - Validation Error
     * @param items  (required)
     * @return ResponseEntity&lt;SendResultExampleResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SendResultExampleResponse> sendMailApiSendPostWithHttpInfo(Items items) throws RestClientException {
        Object localVarPostBody = items;
        
        // verify the required parameter 'items' is set
        if (items == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'items' when calling sendMailApiSendPost");
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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<SendResultExampleResponse> localReturnType = new ParameterizedTypeReference<SendResultExampleResponse>() {};
        return apiClient.invokeAPI("/api/send", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
