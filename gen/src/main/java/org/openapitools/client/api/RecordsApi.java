package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CreateRecordRequest;
import org.openapitools.client.model.ResponseErrors;
import org.openapitools.client.model.ResponseInformation;
import org.openapitools.client.model.ResponseSuccessArrayObjects;
import org.openapitools.client.model.ResponseSuccessObject;
import org.openapitools.client.model.SearchRecordsRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:03.349465965Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RecordsApi {
    private ApiClient apiClient;

    public RecordsApi() {
        this(new ApiClient());
    }

    public RecordsApi(ApiClient apiClient) {
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
     * Create file containers with metadata
     * <p><b>201</b> - Created
     * <p><b>403</b> - Unauthorized access
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Not Acceptable (Validation errors)
     * <p><b>422</b> - Unprocessable Entity
     * @param createRecordRequest  (required)
     * @return ResponseSuccessObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseSuccessObject createRecord(CreateRecordRequest createRecordRequest) throws RestClientException {
        return createRecordWithHttpInfo(createRecordRequest).getBody();
    }

    /**
     * 
     * Create file containers with metadata
     * <p><b>201</b> - Created
     * <p><b>403</b> - Unauthorized access
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Not Acceptable (Validation errors)
     * <p><b>422</b> - Unprocessable Entity
     * @param createRecordRequest  (required)
     * @return ResponseEntity&lt;ResponseSuccessObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseSuccessObject> createRecordWithHttpInfo(CreateRecordRequest createRecordRequest) throws RestClientException {
        Object localVarPostBody = createRecordRequest;
        
        // verify the required parameter 'createRecordRequest' is set
        if (createRecordRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createRecordRequest' when calling createRecord");
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

        String[] localVarAuthNames = new String[] { "internal-JWT" };

        ParameterizedTypeReference<ResponseSuccessObject> localReturnType = new ParameterizedTypeReference<ResponseSuccessObject>() {};
        return apiClient.invokeAPI("/v1/records/create", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Search files and metadata in a container
     * <p><b>200</b> - OK
     * <p><b>403</b> - Unauthorized access
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Not Acceptable (Validation errors)
     * <p><b>422</b> - Not Acceptable (Validation errors)
     * @param searchRecordsRequest  (required)
     * @return ResponseSuccessArrayObjects
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseSuccessArrayObjects searchRecords(SearchRecordsRequest searchRecordsRequest) throws RestClientException {
        return searchRecordsWithHttpInfo(searchRecordsRequest).getBody();
    }

    /**
     * 
     * Search files and metadata in a container
     * <p><b>200</b> - OK
     * <p><b>403</b> - Unauthorized access
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Not Acceptable (Validation errors)
     * <p><b>422</b> - Not Acceptable (Validation errors)
     * @param searchRecordsRequest  (required)
     * @return ResponseEntity&lt;ResponseSuccessArrayObjects&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseSuccessArrayObjects> searchRecordsWithHttpInfo(SearchRecordsRequest searchRecordsRequest) throws RestClientException {
        Object localVarPostBody = searchRecordsRequest;
        
        // verify the required parameter 'searchRecordsRequest' is set
        if (searchRecordsRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'searchRecordsRequest' when calling searchRecords");
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

        String[] localVarAuthNames = new String[] { "internal-JWT" };

        ParameterizedTypeReference<ResponseSuccessArrayObjects> localReturnType = new ParameterizedTypeReference<ResponseSuccessArrayObjects>() {};
        return apiClient.invokeAPI("/v1/records/search", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
