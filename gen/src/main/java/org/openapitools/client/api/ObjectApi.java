package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CommonError;
import org.openapitools.client.model.ConvAttach;
import org.openapitools.client.model.CreateObjectScheme;
import org.openapitools.client.model.CreateObjectTypeScheme;
import org.openapitools.client.model.HTTPValidationError;
import org.openapitools.client.model.ObjectBaseScheme;
import org.openapitools.client.model.ObjectFullStructScheme;
import org.openapitools.client.model.ObjectTypeBaseScheme;
import org.openapitools.client.model.ObjectTypeFullStructScheme;
import org.openapitools.client.model.PageObjectBaseScheme;
import org.openapitools.client.model.PageObjectTypeBaseScheme;
import org.openapitools.client.model.Status;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:05.417254227Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ObjectApi {
    private ApiClient apiClient;

    public ObjectApi() {
        this(new ApiClient());
    }

    public ObjectApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add object
     * Add object
     * <p><b>201</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param createObjectScheme  (required)
     * @return ObjectBaseScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ObjectBaseScheme addObject(CreateObjectScheme createObjectScheme) throws RestClientException {
        return addObjectWithHttpInfo(createObjectScheme).getBody();
    }

    /**
     * Add object
     * Add object
     * <p><b>201</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param createObjectScheme  (required)
     * @return ResponseEntity&lt;ObjectBaseScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ObjectBaseScheme> addObjectWithHttpInfo(CreateObjectScheme createObjectScheme) throws RestClientException {
        Object localVarPostBody = createObjectScheme;
        
        // verify the required parameter 'createObjectScheme' is set
        if (createObjectScheme == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createObjectScheme' when calling addObject");
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<ObjectBaseScheme> localReturnType = new ParameterizedTypeReference<ObjectBaseScheme>() {};
        return apiClient.invokeAPI("/objects/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add object type
     * Add object type
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param createObjectTypeScheme  (required)
     * @return ObjectTypeFullStructScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ObjectTypeFullStructScheme createObjectType(CreateObjectTypeScheme createObjectTypeScheme) throws RestClientException {
        return createObjectTypeWithHttpInfo(createObjectTypeScheme).getBody();
    }

    /**
     * Add object type
     * Add object type
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param createObjectTypeScheme  (required)
     * @return ResponseEntity&lt;ObjectTypeFullStructScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<ObjectTypeFullStructScheme> createObjectTypeWithHttpInfo(CreateObjectTypeScheme createObjectTypeScheme) throws RestClientException {
        Object localVarPostBody = createObjectTypeScheme;
        
        // verify the required parameter 'createObjectTypeScheme' is set
        if (createObjectTypeScheme == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createObjectTypeScheme' when calling createObjectType");
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<ObjectTypeFullStructScheme> localReturnType = new ParameterizedTypeReference<ObjectTypeFullStructScheme>() {};
        return apiClient.invokeAPI("/objects/object-type/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete object by id
     * Delete object by id
     * <p><b>204</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id unique object id (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteObject(Integer id) throws RestClientException {
        deleteObjectWithHttpInfo(id);
    }

    /**
     * Delete object by id
     * Delete object by id
     * <p><b>204</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id unique object id (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteObjectWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteObject");
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/objects/{id}/", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete object type by id
     * Delete object type by id
     * <p><b>204</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id unique object id (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteObjectType(Integer id) throws RestClientException {
        deleteObjectTypeWithHttpInfo(id);
    }

    /**
     * Delete object type by id
     * Delete object type by id
     * <p><b>204</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id unique object id (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteObjectTypeWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteObjectType");
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/objects/object-type/{id}/", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add object to dashboard
     * Add object to dashboard
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param objId  (required)
     * @param dashId  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public Object favoriteObject(Integer objId, Integer dashId) throws RestClientException {
        return favoriteObjectWithHttpInfo(objId, dashId).getBody();
    }

    /**
     * Add object to dashboard
     * Add object to dashboard
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param objId  (required)
     * @param dashId  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<Object> favoriteObjectWithHttpInfo(Integer objId, Integer dashId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'objId' is set
        if (objId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'objId' when calling favoriteObject");
        }
        
        // verify the required parameter 'dashId' is set
        if (dashId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dashId' when calling favoriteObject");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "obj_id", objId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "dash_id", dashId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/objects/favorite/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Metrics of the object
     * Metrics of the object
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id unique object id (required)
     * @return ObjectFullStructScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ObjectFullStructScheme fullObjectStruct(Integer id) throws RestClientException {
        return fullObjectStructWithHttpInfo(id).getBody();
    }

    /**
     * Metrics of the object
     * Metrics of the object
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id unique object id (required)
     * @return ResponseEntity&lt;ObjectFullStructScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ObjectFullStructScheme> fullObjectStructWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling fullObjectStruct");
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<ObjectFullStructScheme> localReturnType = new ParameterizedTypeReference<ObjectFullStructScheme>() {};
        return apiClient.invokeAPI("/objects/{id}/full-object-struct/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get object by id
     * Get object by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id unique object id (required)
     * @return ObjectBaseScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ObjectBaseScheme getObject(Integer id) throws RestClientException {
        return getObjectWithHttpInfo(id).getBody();
    }

    /**
     * Get object by id
     * Get object by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id unique object id (required)
     * @return ResponseEntity&lt;ObjectBaseScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ObjectBaseScheme> getObjectWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getObject");
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<ObjectBaseScheme> localReturnType = new ParameterizedTypeReference<ObjectBaseScheme>() {};
        return apiClient.invokeAPI("/objects/{id}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get object type by id
     * Get object type by id
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param id unique object type id (required)
     * @return ObjectTypeBaseScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ObjectTypeBaseScheme getObjectType(Integer id) throws RestClientException {
        return getObjectTypeWithHttpInfo(id).getBody();
    }

    /**
     * Get object type by id
     * Get object type by id
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param id unique object type id (required)
     * @return ResponseEntity&lt;ObjectTypeBaseScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ObjectTypeBaseScheme> getObjectTypeWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getObjectType");
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<ObjectTypeBaseScheme> localReturnType = new ParameterizedTypeReference<ObjectTypeBaseScheme>() {};
        return apiClient.invokeAPI("/objects/object-types/{id}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get full struct of object type by id
     * Get full struct of object type by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id unique object type id (required)
     * @return ObjectTypeFullStructScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ObjectTypeFullStructScheme getObjectTypeFullStruct(Integer id) throws RestClientException {
        return getObjectTypeFullStructWithHttpInfo(id).getBody();
    }

    /**
     * Get full struct of object type by id
     * Get full struct of object type by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id unique object type id (required)
     * @return ResponseEntity&lt;ObjectTypeFullStructScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ObjectTypeFullStructScheme> getObjectTypeFullStructWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getObjectTypeFullStruct");
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<ObjectTypeFullStructScheme> localReturnType = new ParameterizedTypeReference<ObjectTypeFullStructScheme>() {};
        return apiClient.invokeAPI("/objects/object-types/{id}/full-struct/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of object types
     * Get a list of object types
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param convAttach ConvAttach:   * 1 - Sync     * 2 - Unsync    (optional)
     * @param status Status:   * 1 - Inactive     * 2 - Active    (optional)
     * @param text text value for search by name (optional)
     * @param perPage  (optional, default to 1000)
     * @param page  (optional, default to 1)
     * @return PageObjectTypeBaseScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageObjectTypeBaseScheme getObjectTypes(ConvAttach convAttach, Status status, String text, Integer perPage, Integer page) throws RestClientException {
        return getObjectTypesWithHttpInfo(convAttach, status, text, perPage, page).getBody();
    }

    /**
     * Get a list of object types
     * Get a list of object types
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param convAttach ConvAttach:   * 1 - Sync     * 2 - Unsync    (optional)
     * @param status Status:   * 1 - Inactive     * 2 - Active    (optional)
     * @param text text value for search by name (optional)
     * @param perPage  (optional, default to 1000)
     * @param page  (optional, default to 1)
     * @return ResponseEntity&lt;PageObjectTypeBaseScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PageObjectTypeBaseScheme> getObjectTypesWithHttpInfo(ConvAttach convAttach, Status status, String text, Integer perPage, Integer page) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "conv_attach", convAttach));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "text", text));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<PageObjectTypeBaseScheme> localReturnType = new ParameterizedTypeReference<PageObjectTypeBaseScheme>() {};
        return apiClient.invokeAPI("/objects/object-types/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of objects
     * Get a list of objects
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param addrId unique address identifier (optional)
     * @param groupIds list of unique group identifiers (optional)
     * @param status Status:   * 1 - Inactive     * 2 - Active    (optional)
     * @param text text value for search by name (optional)
     * @param perPage  (optional, default to 1000)
     * @param page  (optional, default to 1)
     * @return PageObjectBaseScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageObjectBaseScheme getObjects(Integer addrId, List<Integer> groupIds, Status status, String text, Integer perPage, Integer page) throws RestClientException {
        return getObjectsWithHttpInfo(addrId, groupIds, status, text, perPage, page).getBody();
    }

    /**
     * Get a list of objects
     * Get a list of objects
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param addrId unique address identifier (optional)
     * @param groupIds list of unique group identifiers (optional)
     * @param status Status:   * 1 - Inactive     * 2 - Active    (optional)
     * @param text text value for search by name (optional)
     * @param perPage  (optional, default to 1000)
     * @param page  (optional, default to 1)
     * @return ResponseEntity&lt;PageObjectBaseScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PageObjectBaseScheme> getObjectsWithHttpInfo(Integer addrId, List<Integer> groupIds, Status status, String text, Integer perPage, Integer page) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "addr_id", addrId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "group_ids", groupIds));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "text", text));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<PageObjectBaseScheme> localReturnType = new ParameterizedTypeReference<PageObjectBaseScheme>() {};
        return apiClient.invokeAPI("/objects/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update object by id
     * Update object by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @param createObjectScheme  (required)
     * @return ObjectBaseScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ObjectBaseScheme updateObject(Integer id, CreateObjectScheme createObjectScheme) throws RestClientException {
        return updateObjectWithHttpInfo(id, createObjectScheme).getBody();
    }

    /**
     * Update object by id
     * Update object by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @param createObjectScheme  (required)
     * @return ResponseEntity&lt;ObjectBaseScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ObjectBaseScheme> updateObjectWithHttpInfo(Integer id, CreateObjectScheme createObjectScheme) throws RestClientException {
        Object localVarPostBody = createObjectScheme;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateObject");
        }
        
        // verify the required parameter 'createObjectScheme' is set
        if (createObjectScheme == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createObjectScheme' when calling updateObject");
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<ObjectBaseScheme> localReturnType = new ParameterizedTypeReference<ObjectBaseScheme>() {};
        return apiClient.invokeAPI("/objects/{id}/", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update object type by id
     * Update object type by id
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param id unique object type id (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public Object updateObjectTypes(Integer id) throws RestClientException {
        return updateObjectTypesWithHttpInfo(id).getBody();
    }

    /**
     * Update object type by id
     * Update object type by id
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param id unique object type id (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<Object> updateObjectTypesWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateObjectTypes");
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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/objects/object-type/{id}/", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
