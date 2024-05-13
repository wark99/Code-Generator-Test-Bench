package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ParamProfileId;
import org.openapitools.client.model.ResponseErrors;
import org.openapitools.client.model.ResponseInformation;
import org.openapitools.client.model.ResponseSuccessArrayObjects;
import org.openapitools.client.model.UploadNewFile201Response;
import org.openapitools.client.model.UploadNewFile404Response;

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
public class RecordsFilesApi {
    private ApiClient apiClient;

    public RecordsFilesApi() {
        this(new ApiClient());
    }

    public RecordsFilesApi(ApiClient apiClient) {
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
     * Upload new version of a file
     * <p><b>200</b> - OK
     * <p><b>401</b> - Authentication failed
     * <p><b>403</b> - Unauthorized access
     * <p><b>406</b> - Not Acceptable (Validation errors)
     * <p><b>422</b> - Unprocessable Entity
     * @param _file  (required)
     * @param oldNuid  (required)
     * @param profileId  (required)
     * @param sha1Check  (required)
     * @return ResponseSuccessArrayObjects
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseSuccessArrayObjects uploadFileRevision(Object _file, Object oldNuid, Object profileId, Object sha1Check) throws RestClientException {
        return uploadFileRevisionWithHttpInfo(_file, oldNuid, profileId, sha1Check).getBody();
    }

    /**
     * 
     * Upload new version of a file
     * <p><b>200</b> - OK
     * <p><b>401</b> - Authentication failed
     * <p><b>403</b> - Unauthorized access
     * <p><b>406</b> - Not Acceptable (Validation errors)
     * <p><b>422</b> - Unprocessable Entity
     * @param _file  (required)
     * @param oldNuid  (required)
     * @param profileId  (required)
     * @param sha1Check  (required)
     * @return ResponseEntity&lt;ResponseSuccessArrayObjects&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseSuccessArrayObjects> uploadFileRevisionWithHttpInfo(Object _file, Object oldNuid, Object profileId, Object sha1Check) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '_file' when calling uploadFileRevision");
        }
        
        // verify the required parameter 'oldNuid' is set
        if (oldNuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'oldNuid' when calling uploadFileRevision");
        }
        
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'profileId' when calling uploadFileRevision");
        }
        
        // verify the required parameter 'sha1Check' is set
        if (sha1Check == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sha1Check' when calling uploadFileRevision");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (_file != null)
            localVarFormParams.add("file", _file);
        if (oldNuid != null)
            localVarFormParams.add("old_nuid", oldNuid);
        if (profileId != null)
            localVarFormParams.add("profile_id", profileId);
        if (sha1Check != null)
            localVarFormParams.add("sha1_check", sha1Check);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "internal-JWT" };

        ParameterizedTypeReference<ResponseSuccessArrayObjects> localReturnType = new ParameterizedTypeReference<ResponseSuccessArrayObjects>() {};
        return apiClient.invokeAPI("/v1/records/files/replace", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Upload new file
     * <p><b>201</b> - Created
     * <p><b>401</b> - Authentication failed
     * <p><b>403</b> - Unauthorized access
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Not Acceptable (Validation errors)
     * <p><b>422</b> - Unprocessable Entity
     * @param documentId  (required)
     * @param _file  (required)
     * @param profileId  (required)
     * @param sha1Check  (required)
     * @return UploadNewFile201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UploadNewFile201Response uploadNewFile(String documentId, Object _file, Object profileId, Object sha1Check) throws RestClientException {
        return uploadNewFileWithHttpInfo(documentId, _file, profileId, sha1Check).getBody();
    }

    /**
     * 
     * Upload new file
     * <p><b>201</b> - Created
     * <p><b>401</b> - Authentication failed
     * <p><b>403</b> - Unauthorized access
     * <p><b>404</b> - Not Found
     * <p><b>406</b> - Not Acceptable (Validation errors)
     * <p><b>422</b> - Unprocessable Entity
     * @param documentId  (required)
     * @param _file  (required)
     * @param profileId  (required)
     * @param sha1Check  (required)
     * @return ResponseEntity&lt;UploadNewFile201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UploadNewFile201Response> uploadNewFileWithHttpInfo(String documentId, Object _file, Object profileId, Object sha1Check) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentId' when calling uploadNewFile");
        }
        
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '_file' when calling uploadNewFile");
        }
        
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'profileId' when calling uploadNewFile");
        }
        
        // verify the required parameter 'sha1Check' is set
        if (sha1Check == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sha1Check' when calling uploadNewFile");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (documentId != null)
            localVarFormParams.add("document_id", documentId);
        if (_file != null)
            localVarFormParams.add("file", _file);
        if (profileId != null)
            localVarFormParams.add("profile_id", profileId);
        if (sha1Check != null)
            localVarFormParams.add("sha1_check", sha1Check);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "internal-JWT" };

        ParameterizedTypeReference<UploadNewFile201Response> localReturnType = new ParameterizedTypeReference<UploadNewFile201Response>() {};
        return apiClient.invokeAPI("/v1/records/files/create", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Fetch file objects based on provided IDs
     * <p><b>200</b> - OK
     * <p><b>403</b> - Unauthorized access
     * <p><b>406</b> - Not Acceptable (Validation errors)
     * @param profileId  (required)
     * @param documentIds Send multiple IDs by duplicating the parameter name for each ID: &lt;br/&gt;&#x60;document_ids[]&#x3D;ID_1&amp;document_ids[]&#x3D;ID_2&amp;...&#x60; (required)
     * @return ResponseSuccessArrayObjects
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseSuccessArrayObjects viewRecordFiles(ParamProfileId profileId, List<String> documentIds) throws RestClientException {
        return viewRecordFilesWithHttpInfo(profileId, documentIds).getBody();
    }

    /**
     * 
     * Fetch file objects based on provided IDs
     * <p><b>200</b> - OK
     * <p><b>403</b> - Unauthorized access
     * <p><b>406</b> - Not Acceptable (Validation errors)
     * @param profileId  (required)
     * @param documentIds Send multiple IDs by duplicating the parameter name for each ID: &lt;br/&gt;&#x60;document_ids[]&#x3D;ID_1&amp;document_ids[]&#x3D;ID_2&amp;...&#x60; (required)
     * @return ResponseEntity&lt;ResponseSuccessArrayObjects&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseSuccessArrayObjects> viewRecordFilesWithHttpInfo(ParamProfileId profileId, List<String> documentIds) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'profileId' when calling viewRecordFiles");
        }
        
        // verify the required parameter 'documentIds' is set
        if (documentIds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentIds' when calling viewRecordFiles");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "profile_id", profileId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "document_ids[]", documentIds));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "internal-JWT" };

        ParameterizedTypeReference<ResponseSuccessArrayObjects> localReturnType = new ParameterizedTypeReference<ResponseSuccessArrayObjects>() {};
        return apiClient.invokeAPI("/v1/records/files/view", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
