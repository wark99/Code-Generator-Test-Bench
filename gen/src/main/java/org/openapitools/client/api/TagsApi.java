package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CreateTag201Response;
import org.openapitools.client.model.ErrorResponseObject;
import org.openapitools.client.model.NewTag;

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
public class TagsApi {
    private ApiClient apiClient;

    public TagsApi() {
        this(new ApiClient());
    }

    public TagsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new tag
     * 
     * <p><b>201</b> - Tag successfully created
     * <p><b>400</b>
     * <p><b>401</b>
     * @param newTag  (required)
     * @return CreateTag201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateTag201Response createTag(NewTag newTag) throws RestClientException {
        return createTagWithHttpInfo(newTag).getBody();
    }

    /**
     * Create a new tag
     * 
     * <p><b>201</b> - Tag successfully created
     * <p><b>400</b>
     * <p><b>401</b>
     * @param newTag  (required)
     * @return ResponseEntity&lt;CreateTag201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateTag201Response> createTagWithHttpInfo(NewTag newTag) throws RestClientException {
        Object localVarPostBody = newTag;
        
        // verify the required parameter 'newTag' is set
        if (newTag == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'newTag' when calling createTag");
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

        ParameterizedTypeReference<CreateTag201Response> localReturnType = new ParameterizedTypeReference<CreateTag201Response>() {};
        return apiClient.invokeAPI("/tags", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Follow a tag
     * 
     * <p><b>200</b> - Successfully followed the tag
     * <p><b>401</b>
     * <p><b>404</b>
     * @param tagId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void followTag(Integer tagId) throws RestClientException {
        followTagWithHttpInfo(tagId);
    }

    /**
     * Follow a tag
     * 
     * <p><b>200</b> - Successfully followed the tag
     * <p><b>401</b>
     * <p><b>404</b>
     * @param tagId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> followTagWithHttpInfo(Integer tagId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tagId' when calling followTag");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tagId", tagId);

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/tags/{tagId}/follow", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get tag details
     * 
     * <p><b>200</b> - Successful response
     * <p><b>404</b>
     * @param tagId  (required)
     * @return CreateTag201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateTag201Response getTagDetails(Integer tagId) throws RestClientException {
        return getTagDetailsWithHttpInfo(tagId).getBody();
    }

    /**
     * Get tag details
     * 
     * <p><b>200</b> - Successful response
     * <p><b>404</b>
     * @param tagId  (required)
     * @return ResponseEntity&lt;CreateTag201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateTag201Response> getTagDetailsWithHttpInfo(Integer tagId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tagId' when calling getTagDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tagId", tagId);

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

        ParameterizedTypeReference<CreateTag201Response> localReturnType = new ParameterizedTypeReference<CreateTag201Response>() {};
        return apiClient.invokeAPI("/tags/{tagId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Unfollow a tag
     * 
     * <p><b>200</b> - Successfully unfollowed the tag
     * <p><b>401</b>
     * <p><b>404</b>
     * @param tagId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void unfollowTag(Integer tagId) throws RestClientException {
        unfollowTagWithHttpInfo(tagId);
    }

    /**
     * Unfollow a tag
     * 
     * <p><b>200</b> - Successfully unfollowed the tag
     * <p><b>401</b>
     * <p><b>404</b>
     * @param tagId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> unfollowTagWithHttpInfo(Integer tagId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tagId' when calling unfollowTag");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tagId", tagId);

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/tags/{tagId}/follow", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
