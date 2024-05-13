package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.DeleteSkillTypes404Response;
import org.openapitools.client.model.ListOntologyNodes400Response;
import org.openapitools.client.model.SkillType;
import org.openapitools.client.model.SkillTypeUpdate;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:14:21.073249278Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SkillTypeApi {
    private ApiClient apiClient;

    public SkillTypeApi() {
        this(new ApiClient());
    }

    public SkillTypeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create Skill Type
     * Create a new skill type.
     * <p><b>201</b> - Skill Type created successfully
     * <p><b>400</b> - Bad Request
     * @param skillTypeUpdate  (required)
     * @return SkillType
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SkillType createSkillType(SkillTypeUpdate skillTypeUpdate) throws RestClientException {
        return createSkillTypeWithHttpInfo(skillTypeUpdate).getBody();
    }

    /**
     * Create Skill Type
     * Create a new skill type.
     * <p><b>201</b> - Skill Type created successfully
     * <p><b>400</b> - Bad Request
     * @param skillTypeUpdate  (required)
     * @return ResponseEntity&lt;SkillType&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SkillType> createSkillTypeWithHttpInfo(SkillTypeUpdate skillTypeUpdate) throws RestClientException {
        Object localVarPostBody = skillTypeUpdate;
        
        // verify the required parameter 'skillTypeUpdate' is set
        if (skillTypeUpdate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'skillTypeUpdate' when calling createSkillType");
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

        String[] localVarAuthNames = new String[] { "studio_oauth2" };

        ParameterizedTypeReference<SkillType> localReturnType = new ParameterizedTypeReference<SkillType>() {};
        return apiClient.invokeAPI("/api/v1/skill-types", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete Skill Type by ID
     * Delete a skill type by its unique ID.
     * <p><b>201</b> - Skill Type deleted successfully
     * <p><b>404</b> - Not Found
     * @param id ID of the skill type to delete (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteSkillTypes(String id) throws RestClientException {
        deleteSkillTypesWithHttpInfo(id);
    }

    /**
     * Delete Skill Type by ID
     * Delete a skill type by its unique ID.
     * <p><b>201</b> - Skill Type deleted successfully
     * <p><b>404</b> - Not Found
     * @param id ID of the skill type to delete (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteSkillTypesWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteSkillTypes");
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

        String[] localVarAuthNames = new String[] { "studio_oauth2" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/v1/skill-types/{id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Skill Types
     * Retrieve a list of skill types with optional filtering and pagination.
     * <p><b>200</b> - Skill Types retrieved successfully
     * <p><b>400</b> - Bad Request
     * @param page Page number (optional, default: 1, can&#39;t be negative).  (optional, default to 1)
     * @param limit Number of items per page (optional, default: 10, max: 100).  (optional, default to 10)
     * @param sortBy Field to sort by (optional, default: modifiedOn).  (optional, default to modifiedOn)
     * @param sortOrder Sort order (optional, default: desc).  (optional, default to desc)
     * @return List&lt;SkillType&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SkillType> getAllSkillTypes(Integer page, Integer limit, String sortBy, String sortOrder) throws RestClientException {
        return getAllSkillTypesWithHttpInfo(page, limit, sortBy, sortOrder).getBody();
    }

    /**
     * Get Skill Types
     * Retrieve a list of skill types with optional filtering and pagination.
     * <p><b>200</b> - Skill Types retrieved successfully
     * <p><b>400</b> - Bad Request
     * @param page Page number (optional, default: 1, can&#39;t be negative).  (optional, default to 1)
     * @param limit Number of items per page (optional, default: 10, max: 100).  (optional, default to 10)
     * @param sortBy Field to sort by (optional, default: modifiedOn).  (optional, default to modifiedOn)
     * @param sortOrder Sort order (optional, default: desc).  (optional, default to desc)
     * @return ResponseEntity&lt;List&lt;SkillType&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SkillType>> getAllSkillTypesWithHttpInfo(Integer page, Integer limit, String sortBy, String sortOrder) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortBy", sortBy));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortOrder", sortOrder));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "studio_oauth2" };

        ParameterizedTypeReference<List<SkillType>> localReturnType = new ParameterizedTypeReference<List<SkillType>>() {};
        return apiClient.invokeAPI("/api/v1/skill-types", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Skill Type by ID
     * Update a skill type by its unique ID.
     * <p><b>200</b> - Skill Type updated successfully
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param id ID of the skill type to update (required)
     * @param skillType  (required)
     * @return SkillTypeUpdate
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SkillTypeUpdate updateSkillTypes(String id, SkillType skillType) throws RestClientException {
        return updateSkillTypesWithHttpInfo(id, skillType).getBody();
    }

    /**
     * Update Skill Type by ID
     * Update a skill type by its unique ID.
     * <p><b>200</b> - Skill Type updated successfully
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param id ID of the skill type to update (required)
     * @param skillType  (required)
     * @return ResponseEntity&lt;SkillTypeUpdate&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SkillTypeUpdate> updateSkillTypesWithHttpInfo(String id, SkillType skillType) throws RestClientException {
        Object localVarPostBody = skillType;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateSkillTypes");
        }
        
        // verify the required parameter 'skillType' is set
        if (skillType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'skillType' when calling updateSkillTypes");
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

        String[] localVarAuthNames = new String[] { "studio_oauth2" };

        ParameterizedTypeReference<SkillTypeUpdate> localReturnType = new ParameterizedTypeReference<SkillTypeUpdate>() {};
        return apiClient.invokeAPI("/api/v1/skill-types/{id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
