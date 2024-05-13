package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.TagCreateUserUseridPostRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:50.441407861Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TagRoutesApi {
    private ApiClient apiClient;

    public TagRoutesApi() {
        this(new ApiClient());
    }

    public TagRoutesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * create
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param authorization  (optional)
     * @param tagCreateUserUseridPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void tagCreateUserUseridPost(String userid, String authorization, TagCreateUserUseridPostRequest tagCreateUserUseridPostRequest) throws RestClientException {
        tagCreateUserUseridPostWithHttpInfo(userid, authorization, tagCreateUserUseridPostRequest);
    }

    /**
     * create
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param authorization  (optional)
     * @param tagCreateUserUseridPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> tagCreateUserUseridPostWithHttpInfo(String userid, String authorization, TagCreateUserUseridPostRequest tagCreateUserUseridPostRequest) throws RestClientException {
        Object localVarPostBody = tagCreateUserUseridPostRequest;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling tagCreateUserUseridPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/tag/create/user/{userid}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * custom
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param authorization  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void tagCustomUserUseridGet(String userid, String authorization, Integer page, Integer limit) throws RestClientException {
        tagCustomUserUseridGetWithHttpInfo(userid, authorization, page, limit);
    }

    /**
     * custom
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param authorization  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> tagCustomUserUseridGetWithHttpInfo(String userid, String authorization, Integer page, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling tagCustomUserUseridGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/tag/custom/user/{userid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * standard
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param authorization  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void tagStandardUserUseridGet(String userid, String authorization) throws RestClientException {
        tagStandardUserUseridGetWithHttpInfo(userid, authorization);
    }

    /**
     * standard
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> tagStandardUserUseridGetWithHttpInfo(String userid, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling tagStandardUserUseridGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/tag/standard/user/{userid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * search
     * 
     * <p><b>200</b> - Successful response
     * @param query  (required)
     * @param userid  (required)
     * @param authorization  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void tagUserUseridSearchQueryGet(String query, String userid, String authorization) throws RestClientException {
        tagUserUseridSearchQueryGetWithHttpInfo(query, userid, authorization);
    }

    /**
     * search
     * 
     * <p><b>200</b> - Successful response
     * @param query  (required)
     * @param userid  (required)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> tagUserUseridSearchQueryGetWithHttpInfo(String query, String userid, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'query' when calling tagUserUseridSearchQueryGet");
        }
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling tagUserUseridSearchQueryGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("query", query);
        uriVariables.put("userid", userid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/tag/user/{userid}/search/{query}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
