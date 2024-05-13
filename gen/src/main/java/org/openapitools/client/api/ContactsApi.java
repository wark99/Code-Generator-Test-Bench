package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BodyCreateContactApiV1ContactsPost;
import org.openapitools.client.model.BodyCreateContactSchemaApiV1ContactsSchemaPost;
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
public class ContactsApi {
    private ApiClient apiClient;

    public ContactsApi() {
        this(new ApiClient());
    }

    public ContactsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create Contact
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param bodyCreateContactApiV1ContactsPost  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object createContactApiV1ContactsPost(BodyCreateContactApiV1ContactsPost bodyCreateContactApiV1ContactsPost) throws RestClientException {
        return createContactApiV1ContactsPostWithHttpInfo(bodyCreateContactApiV1ContactsPost).getBody();
    }

    /**
     * Create Contact
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param bodyCreateContactApiV1ContactsPost  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> createContactApiV1ContactsPostWithHttpInfo(BodyCreateContactApiV1ContactsPost bodyCreateContactApiV1ContactsPost) throws RestClientException {
        Object localVarPostBody = bodyCreateContactApiV1ContactsPost;
        
        // verify the required parameter 'bodyCreateContactApiV1ContactsPost' is set
        if (bodyCreateContactApiV1ContactsPost == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bodyCreateContactApiV1ContactsPost' when calling createContactApiV1ContactsPost");
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
        return apiClient.invokeAPI("/api/v1/contacts/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create Contact Schema
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param bodyCreateContactSchemaApiV1ContactsSchemaPost  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object createContactSchemaApiV1ContactsSchemaPost(BodyCreateContactSchemaApiV1ContactsSchemaPost bodyCreateContactSchemaApiV1ContactsSchemaPost) throws RestClientException {
        return createContactSchemaApiV1ContactsSchemaPostWithHttpInfo(bodyCreateContactSchemaApiV1ContactsSchemaPost).getBody();
    }

    /**
     * Create Contact Schema
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param bodyCreateContactSchemaApiV1ContactsSchemaPost  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> createContactSchemaApiV1ContactsSchemaPostWithHttpInfo(BodyCreateContactSchemaApiV1ContactsSchemaPost bodyCreateContactSchemaApiV1ContactsSchemaPost) throws RestClientException {
        Object localVarPostBody = bodyCreateContactSchemaApiV1ContactsSchemaPost;
        
        // verify the required parameter 'bodyCreateContactSchemaApiV1ContactsSchemaPost' is set
        if (bodyCreateContactSchemaApiV1ContactsSchemaPost == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bodyCreateContactSchemaApiV1ContactsSchemaPost' when calling createContactSchemaApiV1ContactsSchemaPost");
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
        return apiClient.invokeAPI("/api/v1/contacts/schema", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Schema Fields
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param schemaId  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object getSchemaFieldsApiV1ContactsSchemaSchemaIdFieldsGet(String schemaId) throws RestClientException {
        return getSchemaFieldsApiV1ContactsSchemaSchemaIdFieldsGetWithHttpInfo(schemaId).getBody();
    }

    /**
     * Get Schema Fields
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param schemaId  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getSchemaFieldsApiV1ContactsSchemaSchemaIdFieldsGetWithHttpInfo(String schemaId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'schemaId' is set
        if (schemaId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'schemaId' when calling getSchemaFieldsApiV1ContactsSchemaSchemaIdFieldsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("schemaId", schemaId);

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
        return apiClient.invokeAPI("/api/v1/contacts/schema/{schemaId}/fields", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List Contact Schema
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param organizationId  (required)
     * @param populate  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object listContactSchemaApiV1ContactsSchemaOrganizationIdGet(String organizationId, Object populate) throws RestClientException {
        return listContactSchemaApiV1ContactsSchemaOrganizationIdGetWithHttpInfo(organizationId, populate).getBody();
    }

    /**
     * List Contact Schema
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param organizationId  (required)
     * @param populate  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> listContactSchemaApiV1ContactsSchemaOrganizationIdGetWithHttpInfo(String organizationId, Object populate) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling listContactSchemaApiV1ContactsSchemaOrganizationIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "populate", populate));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2PasswordBearer" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/api/v1/contacts/schema/{organizationId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List Contacts
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param organizationId  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object listContactsApiV1ContactsOrganizationIdGet(String organizationId) throws RestClientException {
        return listContactsApiV1ContactsOrganizationIdGetWithHttpInfo(organizationId).getBody();
    }

    /**
     * List Contacts
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param organizationId  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> listContactsApiV1ContactsOrganizationIdGetWithHttpInfo(String organizationId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'organizationId' when calling listContactsApiV1ContactsOrganizationIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("organizationId", organizationId);

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
        return apiClient.invokeAPI("/api/v1/contacts/{organizationId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
