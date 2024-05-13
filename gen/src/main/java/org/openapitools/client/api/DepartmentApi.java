package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BaseHttpActionDeleteCorrectResponseModel;
import org.openapitools.client.model.BaseHttpActionPostCorrectResponseModel;
import org.openapitools.client.model.BaseHttpActionPutCorrectResponseModel;
import org.openapitools.client.model.DepartmentPostDTO;
import org.openapitools.client.model.DepartmentPutDTO;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:15:35.805334182Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DepartmentApi {
    private ApiClient apiClient;

    public DepartmentApi() {
        this(new ApiClient());
    }

    public DepartmentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param departmentPostDTO  (required)
     * @return BaseHttpActionPostCorrectResponseModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BaseHttpActionPostCorrectResponseModel apiDepartmentPost(DepartmentPostDTO departmentPostDTO) throws RestClientException {
        return apiDepartmentPostWithHttpInfo(departmentPostDTO).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param departmentPostDTO  (required)
     * @return ResponseEntity&lt;BaseHttpActionPostCorrectResponseModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BaseHttpActionPostCorrectResponseModel> apiDepartmentPostWithHttpInfo(DepartmentPostDTO departmentPostDTO) throws RestClientException {
        Object localVarPostBody = departmentPostDTO;
        
        // verify the required parameter 'departmentPostDTO' is set
        if (departmentPostDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'departmentPostDTO' when calling apiDepartmentPost");
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

        ParameterizedTypeReference<BaseHttpActionPostCorrectResponseModel> localReturnType = new ParameterizedTypeReference<BaseHttpActionPostCorrectResponseModel>() {};
        return apiClient.invokeAPI("/api/department", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param targetId  (required)
     * @return BaseHttpActionDeleteCorrectResponseModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BaseHttpActionDeleteCorrectResponseModel apiDepartmentTargetIdDelete(Integer targetId) throws RestClientException {
        return apiDepartmentTargetIdDeleteWithHttpInfo(targetId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param targetId  (required)
     * @return ResponseEntity&lt;BaseHttpActionDeleteCorrectResponseModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BaseHttpActionDeleteCorrectResponseModel> apiDepartmentTargetIdDeleteWithHttpInfo(Integer targetId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'targetId' is set
        if (targetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetId' when calling apiDepartmentTargetIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("target_id", targetId);

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

        ParameterizedTypeReference<BaseHttpActionDeleteCorrectResponseModel> localReturnType = new ParameterizedTypeReference<BaseHttpActionDeleteCorrectResponseModel>() {};
        return apiClient.invokeAPI("/api/department/{target_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param targetId  (required)
     * @param departmentPutDTO  (required)
     * @return BaseHttpActionPutCorrectResponseModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BaseHttpActionPutCorrectResponseModel apiDepartmentTargetIdPut(Integer targetId, DepartmentPutDTO departmentPutDTO) throws RestClientException {
        return apiDepartmentTargetIdPutWithHttpInfo(targetId, departmentPutDTO).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param targetId  (required)
     * @param departmentPutDTO  (required)
     * @return ResponseEntity&lt;BaseHttpActionPutCorrectResponseModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BaseHttpActionPutCorrectResponseModel> apiDepartmentTargetIdPutWithHttpInfo(Integer targetId, DepartmentPutDTO departmentPutDTO) throws RestClientException {
        Object localVarPostBody = departmentPutDTO;
        
        // verify the required parameter 'targetId' is set
        if (targetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetId' when calling apiDepartmentTargetIdPut");
        }
        
        // verify the required parameter 'departmentPutDTO' is set
        if (departmentPutDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'departmentPutDTO' when calling apiDepartmentTargetIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("target_id", targetId);

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

        ParameterizedTypeReference<BaseHttpActionPutCorrectResponseModel> localReturnType = new ParameterizedTypeReference<BaseHttpActionPutCorrectResponseModel>() {};
        return apiClient.invokeAPI("/api/department/{target_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
