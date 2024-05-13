package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.HTTPValidationError;
import org.openapitools.client.model.UserRegisterDTO;

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
public class PublicApi {
    private ApiClient apiClient;

    public PublicApi() {
        this(new ApiClient());
    }

    public PublicApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Form Schema
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param formId  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object getFormSchemaApiV1PublicContactFormSchemaFormIdGet(String formId) throws RestClientException {
        return getFormSchemaApiV1PublicContactFormSchemaFormIdGetWithHttpInfo(formId).getBody();
    }

    /**
     * Get Form Schema
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param formId  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getFormSchemaApiV1PublicContactFormSchemaFormIdGetWithHttpInfo(String formId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'formId' is set
        if (formId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'formId' when calling getFormSchemaApiV1PublicContactFormSchemaFormIdGet");
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/api/v1/public/contact-form/schema/{formId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post Form Data
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param formId  (required)
     * @param body  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object postFormDataApiV1PublicContactFormFormIdPost(String formId, Object body) throws RestClientException {
        return postFormDataApiV1PublicContactFormFormIdPostWithHttpInfo(formId, body).getBody();
    }

    /**
     * Post Form Data
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param formId  (required)
     * @param body  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> postFormDataApiV1PublicContactFormFormIdPostWithHttpInfo(String formId, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'formId' is set
        if (formId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'formId' when calling postFormDataApiV1PublicContactFormFormIdPost");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postFormDataApiV1PublicContactFormFormIdPost");
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
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/api/v1/public/contact-form/{formId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Register
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param userRegisterDTO  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object registerApiV1PublicUserRegisterPost(UserRegisterDTO userRegisterDTO) throws RestClientException {
        return registerApiV1PublicUserRegisterPostWithHttpInfo(userRegisterDTO).getBody();
    }

    /**
     * Register
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param userRegisterDTO  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> registerApiV1PublicUserRegisterPostWithHttpInfo(UserRegisterDTO userRegisterDTO) throws RestClientException {
        Object localVarPostBody = userRegisterDTO;
        
        // verify the required parameter 'userRegisterDTO' is set
        if (userRegisterDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userRegisterDTO' when calling registerApiV1PublicUserRegisterPost");
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

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/api/v1/public/user/register", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
