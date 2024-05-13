package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BodyCreateFormApiV1FormsPost;
import org.openapitools.client.model.HTTPValidationError;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:21.037021681Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FormsApi {
    private ApiClient apiClient;

    public FormsApi() {
        this(new ApiClient());
    }

    public FormsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create Form
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param bodyCreateFormApiV1FormsPost  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object createFormApiV1FormsPost(BodyCreateFormApiV1FormsPost bodyCreateFormApiV1FormsPost) throws RestClientException {
        return createFormApiV1FormsPostWithHttpInfo(bodyCreateFormApiV1FormsPost).getBody();
    }

    /**
     * Create Form
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param bodyCreateFormApiV1FormsPost  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> createFormApiV1FormsPostWithHttpInfo(BodyCreateFormApiV1FormsPost bodyCreateFormApiV1FormsPost) throws RestClientException {
        Object localVarPostBody = bodyCreateFormApiV1FormsPost;
        
        // verify the required parameter 'bodyCreateFormApiV1FormsPost' is set
        if (bodyCreateFormApiV1FormsPost == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bodyCreateFormApiV1FormsPost' when calling createFormApiV1FormsPost");
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

        String[] localVarAuthNames = new String[] { "OAuth2PasswordBearer" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/api/v1/forms/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get All Forms
     * 
     * <p><b>200</b> - Successful Response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object getAllFormsApiV1FormsGet() throws RestClientException {
        return getAllFormsApiV1FormsGetWithHttpInfo().getBody();
    }

    /**
     * Get All Forms
     * 
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getAllFormsApiV1FormsGetWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] { "OAuth2PasswordBearer" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/api/v1/forms/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Form Iframe
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param formId  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object getFormIframeApiV1FormsFormIdIframeGet(String formId) throws RestClientException {
        return getFormIframeApiV1FormsFormIdIframeGetWithHttpInfo(formId).getBody();
    }

    /**
     * Get Form Iframe
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param formId  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getFormIframeApiV1FormsFormIdIframeGetWithHttpInfo(String formId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'formId' is set
        if (formId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'formId' when calling getFormIframeApiV1FormsFormIdIframeGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("formId", formId);

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

        String[] localVarAuthNames = new String[] { "OAuth2PasswordBearer" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/api/v1/forms/{formId}/iframe", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
