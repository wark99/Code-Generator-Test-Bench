package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut;
import org.openapitools.client.model.BodyCreateBussinesApiV1BusinessesPost;
import org.openapitools.client.model.BodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet;
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
public class BusinessesApi {
    private ApiClient apiClient;

    public BusinessesApi() {
        this(new ApiClient());
    }

    public BusinessesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Change Business Phase
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param businessId  (required)
     * @param bodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object changeBusinessPhaseApiV1BusinessesBusinessIdPhasePut(String businessId, BodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut bodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut) throws RestClientException {
        return changeBusinessPhaseApiV1BusinessesBusinessIdPhasePutWithHttpInfo(businessId, bodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut).getBody();
    }

    /**
     * Change Business Phase
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param businessId  (required)
     * @param bodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> changeBusinessPhaseApiV1BusinessesBusinessIdPhasePutWithHttpInfo(String businessId, BodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut bodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut) throws RestClientException {
        Object localVarPostBody = bodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut;
        
        // verify the required parameter 'businessId' is set
        if (businessId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'businessId' when calling changeBusinessPhaseApiV1BusinessesBusinessIdPhasePut");
        }
        
        // verify the required parameter 'bodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut' is set
        if (bodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut' when calling changeBusinessPhaseApiV1BusinessesBusinessIdPhasePut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("businessId", businessId);

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
        return apiClient.invokeAPI("/api/v1/businesses/{businessId}/phase", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create Bussines
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param bodyCreateBussinesApiV1BusinessesPost  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object createBussinesApiV1BusinessesPost(BodyCreateBussinesApiV1BusinessesPost bodyCreateBussinesApiV1BusinessesPost) throws RestClientException {
        return createBussinesApiV1BusinessesPostWithHttpInfo(bodyCreateBussinesApiV1BusinessesPost).getBody();
    }

    /**
     * Create Bussines
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param bodyCreateBussinesApiV1BusinessesPost  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> createBussinesApiV1BusinessesPostWithHttpInfo(BodyCreateBussinesApiV1BusinessesPost bodyCreateBussinesApiV1BusinessesPost) throws RestClientException {
        Object localVarPostBody = bodyCreateBussinesApiV1BusinessesPost;
        
        // verify the required parameter 'bodyCreateBussinesApiV1BusinessesPost' is set
        if (bodyCreateBussinesApiV1BusinessesPost == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bodyCreateBussinesApiV1BusinessesPost' when calling createBussinesApiV1BusinessesPost");
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
        return apiClient.invokeAPI("/api/v1/businesses/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Business
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param businessId  (required)
     * @param populate  (optional, default to false)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object getBusinessApiV1BusinessesBusinessIdGet(String businessId, Boolean populate) throws RestClientException {
        return getBusinessApiV1BusinessesBusinessIdGetWithHttpInfo(businessId, populate).getBody();
    }

    /**
     * Get Business
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param businessId  (required)
     * @param populate  (optional, default to false)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getBusinessApiV1BusinessesBusinessIdGetWithHttpInfo(String businessId, Boolean populate) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'businessId' is set
        if (businessId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'businessId' when calling getBusinessApiV1BusinessesBusinessIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("businessId", businessId);

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
        return apiClient.invokeAPI("/api/v1/businesses/{businessId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Business In Pipeline
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param pipelineId  (required)
     * @param bodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet  (required)
     * @param populate  (optional, default to false)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object getBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet(String pipelineId, BodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet bodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet, Boolean populate) throws RestClientException {
        return getBusinessInPipelineApiV1BusinessesPipelinePipelineIdGetWithHttpInfo(pipelineId, bodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet, populate).getBody();
    }

    /**
     * Get Business In Pipeline
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param pipelineId  (required)
     * @param bodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet  (required)
     * @param populate  (optional, default to false)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getBusinessInPipelineApiV1BusinessesPipelinePipelineIdGetWithHttpInfo(String pipelineId, BodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet bodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet, Boolean populate) throws RestClientException {
        Object localVarPostBody = bodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet;
        
        // verify the required parameter 'pipelineId' is set
        if (pipelineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pipelineId' when calling getBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet");
        }
        
        // verify the required parameter 'bodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet' is set
        if (bodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet' when calling getBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("pipelineId", pipelineId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "populate", populate));
        

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
        return apiClient.invokeAPI("/api/v1/businesses/pipeline/{pipelineId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
