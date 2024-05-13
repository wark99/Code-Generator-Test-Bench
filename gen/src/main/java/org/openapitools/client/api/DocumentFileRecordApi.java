package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BaseHttpActionDeleteCorrectResponseModel;
import org.openapitools.client.model.BaseHttpActionPostCorrectResponseModel;
import org.openapitools.client.model.BaseHttpActionPutCorrectResponseModel;
import java.io.File;
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
public class DocumentFileRecordApi {
    private ApiClient apiClient;

    public DocumentFileRecordApi() {
        this(new ApiClient());
    }

    public DocumentFileRecordApi(ApiClient apiClient) {
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
     * @param targetId  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object apiDocumentFileRecordGet(Integer targetId) throws RestClientException {
        return apiDocumentFileRecordGetWithHttpInfo(targetId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param targetId  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> apiDocumentFileRecordGetWithHttpInfo(Integer targetId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'targetId' is set
        if (targetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetId' when calling apiDocumentFileRecordGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "target_id", targetId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/api/document-file-record", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param trainingRecordId  (required)
     * @param fileDescription  (required)
     * @param note  (required)
     * @param inputFile  (required)
     * @return BaseHttpActionPostCorrectResponseModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BaseHttpActionPostCorrectResponseModel apiDocumentFileRecordPost(Integer trainingRecordId, String fileDescription, String note, File inputFile) throws RestClientException {
        return apiDocumentFileRecordPostWithHttpInfo(trainingRecordId, fileDescription, note, inputFile).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param trainingRecordId  (required)
     * @param fileDescription  (required)
     * @param note  (required)
     * @param inputFile  (required)
     * @return ResponseEntity&lt;BaseHttpActionPostCorrectResponseModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BaseHttpActionPostCorrectResponseModel> apiDocumentFileRecordPostWithHttpInfo(Integer trainingRecordId, String fileDescription, String note, File inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'trainingRecordId' is set
        if (trainingRecordId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'trainingRecordId' when calling apiDocumentFileRecordPost");
        }
        
        // verify the required parameter 'fileDescription' is set
        if (fileDescription == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileDescription' when calling apiDocumentFileRecordPost");
        }
        
        // verify the required parameter 'note' is set
        if (note == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'note' when calling apiDocumentFileRecordPost");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling apiDocumentFileRecordPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (trainingRecordId != null)
            localVarFormParams.add("training_record_id", trainingRecordId);
        if (fileDescription != null)
            localVarFormParams.add("file_description", fileDescription);
        if (note != null)
            localVarFormParams.add("note", note);
        if (inputFile != null)
            localVarFormParams.add("input_file", new FileSystemResource(inputFile));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<BaseHttpActionPostCorrectResponseModel> localReturnType = new ParameterizedTypeReference<BaseHttpActionPostCorrectResponseModel>() {};
        return apiClient.invokeAPI("/api/document-file-record", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
    public BaseHttpActionDeleteCorrectResponseModel apiDocumentFileRecordTargetIdDelete(Integer targetId) throws RestClientException {
        return apiDocumentFileRecordTargetIdDeleteWithHttpInfo(targetId).getBody();
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
    public ResponseEntity<BaseHttpActionDeleteCorrectResponseModel> apiDocumentFileRecordTargetIdDeleteWithHttpInfo(Integer targetId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'targetId' is set
        if (targetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetId' when calling apiDocumentFileRecordTargetIdDelete");
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
        return apiClient.invokeAPI("/api/document-file-record/{target_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param targetId  (required)
     * @param trainingRecordId  (required)
     * @param fileDescription  (required)
     * @param note  (required)
     * @param inputFile  (required)
     * @return BaseHttpActionPutCorrectResponseModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BaseHttpActionPutCorrectResponseModel apiDocumentFileRecordTargetIdPut(Integer targetId, Integer trainingRecordId, String fileDescription, String note, File inputFile) throws RestClientException {
        return apiDocumentFileRecordTargetIdPutWithHttpInfo(targetId, trainingRecordId, fileDescription, note, inputFile).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param targetId  (required)
     * @param trainingRecordId  (required)
     * @param fileDescription  (required)
     * @param note  (required)
     * @param inputFile  (required)
     * @return ResponseEntity&lt;BaseHttpActionPutCorrectResponseModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BaseHttpActionPutCorrectResponseModel> apiDocumentFileRecordTargetIdPutWithHttpInfo(Integer targetId, Integer trainingRecordId, String fileDescription, String note, File inputFile) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'targetId' is set
        if (targetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'targetId' when calling apiDocumentFileRecordTargetIdPut");
        }
        
        // verify the required parameter 'trainingRecordId' is set
        if (trainingRecordId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'trainingRecordId' when calling apiDocumentFileRecordTargetIdPut");
        }
        
        // verify the required parameter 'fileDescription' is set
        if (fileDescription == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileDescription' when calling apiDocumentFileRecordTargetIdPut");
        }
        
        // verify the required parameter 'note' is set
        if (note == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'note' when calling apiDocumentFileRecordTargetIdPut");
        }
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling apiDocumentFileRecordTargetIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("target_id", targetId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (trainingRecordId != null)
            localVarFormParams.add("training_record_id", trainingRecordId);
        if (fileDescription != null)
            localVarFormParams.add("file_description", fileDescription);
        if (note != null)
            localVarFormParams.add("note", note);
        if (inputFile != null)
            localVarFormParams.add("input_file", new FileSystemResource(inputFile));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<BaseHttpActionPutCorrectResponseModel> localReturnType = new ParameterizedTypeReference<BaseHttpActionPutCorrectResponseModel>() {};
        return apiClient.invokeAPI("/api/document-file-record/{target_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
