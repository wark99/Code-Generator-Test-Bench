package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CommonError;
import org.openapitools.client.model.ConverterGroupBaseSchemeInput;
import org.openapitools.client.model.ConverterGroupBaseSchemeOutput;
import org.openapitools.client.model.CreateConverterGroupScheme;
import org.openapitools.client.model.HTTPValidationError;
import org.openapitools.client.model.PageConverterGroupBaseScheme;
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
public class DataConvertersApi {
    private ApiClient apiClient;

    public DataConvertersApi() {
        this(new ApiClient());
    }

    public DataConvertersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Copy converter group by id
     * Copy converter group by id
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param id unique object type id (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public Object copyConvGroup(Integer id) throws RestClientException {
        return copyConvGroupWithHttpInfo(id).getBody();
    }

    /**
     * Copy converter group by id
     * Copy converter group by id
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param id unique object type id (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<Object> copyConvGroupWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling copyConvGroup");
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
        return apiClient.invokeAPI("/data-converters-group/{id}/copy/", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add data converter
     * Add data converter
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param convGrId unique object type id (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public Object createDataConverter(Integer convGrId) throws RestClientException {
        return createDataConverterWithHttpInfo(convGrId).getBody();
    }

    /**
     * Add data converter
     * Add data converter
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param convGrId unique object type id (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<Object> createDataConverterWithHttpInfo(Integer convGrId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'convGrId' is set
        if (convGrId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'convGrId' when calling createDataConverter");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("conv_gr_id", convGrId);

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
        return apiClient.invokeAPI("/data-converters-group/{conv_gr_id}/data-converters/", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add data converter group
     * Add data converter group
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param createConverterGroupScheme  (required)
     * @return ConverterGroupBaseSchemeOutput
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConverterGroupBaseSchemeOutput createDataConverterGroup(CreateConverterGroupScheme createConverterGroupScheme) throws RestClientException {
        return createDataConverterGroupWithHttpInfo(createConverterGroupScheme).getBody();
    }

    /**
     * Add data converter group
     * Add data converter group
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param createConverterGroupScheme  (required)
     * @return ResponseEntity&lt;ConverterGroupBaseSchemeOutput&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ConverterGroupBaseSchemeOutput> createDataConverterGroupWithHttpInfo(CreateConverterGroupScheme createConverterGroupScheme) throws RestClientException {
        Object localVarPostBody = createConverterGroupScheme;
        
        // verify the required parameter 'createConverterGroupScheme' is set
        if (createConverterGroupScheme == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createConverterGroupScheme' when calling createDataConverterGroup");
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

        ParameterizedTypeReference<ConverterGroupBaseSchemeOutput> localReturnType = new ParameterizedTypeReference<ConverterGroupBaseSchemeOutput>() {};
        return apiClient.invokeAPI("/data-converters-group/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete data converter by id
     * Delete data converter by id
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param id unique object type id (required)
     * @param convGrId unique object type id (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public Object deleteDataConverter(Integer id, Integer convGrId) throws RestClientException {
        return deleteDataConverterWithHttpInfo(id, convGrId).getBody();
    }

    /**
     * Delete data converter by id
     * Delete data converter by id
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param id unique object type id (required)
     * @param convGrId unique object type id (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<Object> deleteDataConverterWithHttpInfo(Integer id, Integer convGrId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteDataConverter");
        }
        
        // verify the required parameter 'convGrId' is set
        if (convGrId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'convGrId' when calling deleteDataConverter");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("conv_gr_id", convGrId);

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
        return apiClient.invokeAPI("/data-converters-group/{conv_gr_id}/data-converters/{id}/", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete data converter group by id
     * Delete data converter group by id
     * <p><b>204</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteDataConverterGroup(Integer id) throws RestClientException {
        deleteDataConverterGroupWithHttpInfo(id);
    }

    /**
     * Delete data converter group by id
     * Delete data converter group by id
     * <p><b>204</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteDataConverterGroupWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteDataConverterGroup");
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
        return apiClient.invokeAPI("/data-converters-group/{id}/", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get data converter by id
     * Get data converter by id
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param id unique object type id (required)
     * @param convGrId unique object type id (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public Object getDataConverter(Integer id, Integer convGrId) throws RestClientException {
        return getDataConverterWithHttpInfo(id, convGrId).getBody();
    }

    /**
     * Get data converter by id
     * Get data converter by id
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param id unique object type id (required)
     * @param convGrId unique object type id (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<Object> getDataConverterWithHttpInfo(Integer id, Integer convGrId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDataConverter");
        }
        
        // verify the required parameter 'convGrId' is set
        if (convGrId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'convGrId' when calling getDataConverter");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("conv_gr_id", convGrId);

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
        return apiClient.invokeAPI("/data-converters-group/{conv_gr_id}/data-converters/{id}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get data converter group by id
     * Get data converter group by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @return ConverterGroupBaseSchemeOutput
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConverterGroupBaseSchemeOutput getDataConverterGroup(Integer id) throws RestClientException {
        return getDataConverterGroupWithHttpInfo(id).getBody();
    }

    /**
     * Get data converter group by id
     * Get data converter group by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @return ResponseEntity&lt;ConverterGroupBaseSchemeOutput&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ConverterGroupBaseSchemeOutput> getDataConverterGroupWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDataConverterGroup");
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

        ParameterizedTypeReference<ConverterGroupBaseSchemeOutput> localReturnType = new ParameterizedTypeReference<ConverterGroupBaseSchemeOutput>() {};
        return apiClient.invokeAPI("/data-converters-group/{id}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of data converter groups
     * Get a list of data converter groups
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param status Status:   * 1 - Inactive     * 2 - Active    (optional)
     * @param text text value for search by name (optional)
     * @param perPage  (optional, default to 1000)
     * @param page  (optional, default to 1)
     * @return PageConverterGroupBaseScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageConverterGroupBaseScheme getDataConverterGroups(Status status, String text, Integer perPage, Integer page) throws RestClientException {
        return getDataConverterGroupsWithHttpInfo(status, text, perPage, page).getBody();
    }

    /**
     * Get a list of data converter groups
     * Get a list of data converter groups
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param status Status:   * 1 - Inactive     * 2 - Active    (optional)
     * @param text text value for search by name (optional)
     * @param perPage  (optional, default to 1000)
     * @param page  (optional, default to 1)
     * @return ResponseEntity&lt;PageConverterGroupBaseScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PageConverterGroupBaseScheme> getDataConverterGroupsWithHttpInfo(Status status, String text, Integer perPage, Integer page) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

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

        ParameterizedTypeReference<PageConverterGroupBaseScheme> localReturnType = new ParameterizedTypeReference<PageConverterGroupBaseScheme>() {};
        return apiClient.invokeAPI("/data-converters-group/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of data converters
     * Get a list of data converters
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param convGrId unique object type id (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public Object getDataConverters(Integer convGrId) throws RestClientException {
        return getDataConvertersWithHttpInfo(convGrId).getBody();
    }

    /**
     * Get a list of data converters
     * Get a list of data converters
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param convGrId unique object type id (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<Object> getDataConvertersWithHttpInfo(Integer convGrId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'convGrId' is set
        if (convGrId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'convGrId' when calling getDataConverters");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("conv_gr_id", convGrId);

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
        return apiClient.invokeAPI("/data-converters-group/{conv_gr_id}/data-converters/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Set features to converter group
     * Set features to converter group
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param id unique object type id (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public Object setFeatures(Integer id) throws RestClientException {
        return setFeaturesWithHttpInfo(id).getBody();
    }

    /**
     * Set features to converter group
     * Set features to converter group
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param id unique object type id (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<Object> setFeaturesWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling setFeatures");
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
        return apiClient.invokeAPI("/data-converters-group/{id}/features/", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update data converter by id
     * Update data converter by id
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param id unique object type id (required)
     * @param convGrId unique object type id (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public Object updateDataConverter(Integer id, Integer convGrId) throws RestClientException {
        return updateDataConverterWithHttpInfo(id, convGrId).getBody();
    }

    /**
     * Update data converter by id
     * Update data converter by id
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param id unique object type id (required)
     * @param convGrId unique object type id (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<Object> updateDataConverterWithHttpInfo(Integer id, Integer convGrId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateDataConverter");
        }
        
        // verify the required parameter 'convGrId' is set
        if (convGrId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'convGrId' when calling updateDataConverter");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("conv_gr_id", convGrId);

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
        return apiClient.invokeAPI("/data-converters-group/{conv_gr_id}/data-converters/{id}/", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update data converter group by id
     * Update data converter group by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @param converterGroupBaseSchemeInput  (required)
     * @return ConverterGroupBaseSchemeOutput
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConverterGroupBaseSchemeOutput updateDataConverterGroup(Integer id, ConverterGroupBaseSchemeInput converterGroupBaseSchemeInput) throws RestClientException {
        return updateDataConverterGroupWithHttpInfo(id, converterGroupBaseSchemeInput).getBody();
    }

    /**
     * Update data converter group by id
     * Update data converter group by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @param converterGroupBaseSchemeInput  (required)
     * @return ResponseEntity&lt;ConverterGroupBaseSchemeOutput&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ConverterGroupBaseSchemeOutput> updateDataConverterGroupWithHttpInfo(Integer id, ConverterGroupBaseSchemeInput converterGroupBaseSchemeInput) throws RestClientException {
        Object localVarPostBody = converterGroupBaseSchemeInput;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateDataConverterGroup");
        }
        
        // verify the required parameter 'converterGroupBaseSchemeInput' is set
        if (converterGroupBaseSchemeInput == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'converterGroupBaseSchemeInput' when calling updateDataConverterGroup");
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

        ParameterizedTypeReference<ConverterGroupBaseSchemeOutput> localReturnType = new ParameterizedTypeReference<ConverterGroupBaseSchemeOutput>() {};
        return apiClient.invokeAPI("/data-converters-group/{id}/", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
