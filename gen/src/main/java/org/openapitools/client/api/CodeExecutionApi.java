package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CodeExecution;
import org.openapitools.client.model.ErrorResponseObject;
import org.openapitools.client.model.ExecuteCode200Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-26T20:19:29.213885611+03:00[Europe/Bucharest]", comments = "Generator version: 7.4.0")
public class CodeExecutionApi {
    private ApiClient apiClient;

    public CodeExecutionApi() {
        this(new ApiClient());
    }

    public CodeExecutionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Execute a code snippet
     * 
     * <p><b>200</b> - Code successfully executed
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>429</b>
     * @param codeExecution  (required)
     * @return ExecuteCode200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExecuteCode200Response executeCode(CodeExecution codeExecution) throws RestClientException {
        return executeCodeWithHttpInfo(codeExecution).getBody();
    }

    /**
     * Execute a code snippet
     * 
     * <p><b>200</b> - Code successfully executed
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>429</b>
     * @param codeExecution  (required)
     * @return ResponseEntity&lt;ExecuteCode200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExecuteCode200Response> executeCodeWithHttpInfo(CodeExecution codeExecution) throws RestClientException {
        Object localVarPostBody = codeExecution;
        
        // verify the required parameter 'codeExecution' is set
        if (codeExecution == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'codeExecution' when calling executeCode");
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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<ExecuteCode200Response> localReturnType = new ParameterizedTypeReference<ExecuteCode200Response>() {};
        return apiClient.invokeAPI("/execute-code", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
