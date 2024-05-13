package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiError;
import org.openapitools.client.model.AppError;
import org.openapitools.client.model.FileInfo;
import org.openapitools.client.model.FileInfoList;
import org.openapitools.client.model.SearchFilesRequest;
import org.openapitools.client.model.UploadFile201Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FilesApi {
    private ApiClient apiClient;

    public FilesApi() {
        this(new ApiClient());
    }

    public FilesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a file
     * Gets a file that has been uploaded previously. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b> - Do not have appropriate permissions
     * <p><b>404</b>
     * <p><b>501</b>
     * @param fileId The ID of the file to get (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getFile(String fileId) throws RestClientException {
        getFileWithHttpInfo(fileId);
    }

    /**
     * Get a file
     * Gets a file that has been uploaded previously. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b> - Do not have appropriate permissions
     * <p><b>404</b>
     * <p><b>501</b>
     * @param fileId The ID of the file to get (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getFileWithHttpInfo(String fileId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling getFile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("file_id", fileId);

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/files/{file_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get metadata for a file
     * Gets a file&#39;s info. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 
     * <p><b>200</b> - The stored metadata for the given file
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b> - Do not have appropriate permissions
     * <p><b>404</b>
     * <p><b>501</b>
     * @param fileId The ID of the file info to get (required)
     * @return FileInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FileInfo getFileInfo(String fileId) throws RestClientException {
        return getFileInfoWithHttpInfo(fileId).getBody();
    }

    /**
     * Get metadata for a file
     * Gets a file&#39;s info. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 
     * <p><b>200</b> - The stored metadata for the given file
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b> - Do not have appropriate permissions
     * <p><b>404</b>
     * <p><b>501</b>
     * @param fileId The ID of the file info to get (required)
     * @return ResponseEntity&lt;FileInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FileInfo> getFileInfoWithHttpInfo(String fileId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling getFileInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("file_id", fileId);

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

        ParameterizedTypeReference<FileInfo> localReturnType = new ParameterizedTypeReference<FileInfo>() {};
        return apiClient.invokeAPI("/files/{file_id}/info", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a file&#39;s preview
     * Gets a file&#39;s preview. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b> - Do not have appropriate permissions
     * <p><b>404</b>
     * <p><b>501</b>
     * @param fileId The ID of the file to get (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getFilePreview(String fileId) throws RestClientException {
        getFilePreviewWithHttpInfo(fileId);
    }

    /**
     * Get a file&#39;s preview
     * Gets a file&#39;s preview. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b> - Do not have appropriate permissions
     * <p><b>404</b>
     * <p><b>501</b>
     * @param fileId The ID of the file to get (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getFilePreviewWithHttpInfo(String fileId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling getFilePreview");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("file_id", fileId);

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/files/{file_id}/preview", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a file&#39;s thumbnail
     * Gets a file&#39;s thumbnail. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b> - Do not have appropriate permissions
     * <p><b>404</b>
     * <p><b>501</b>
     * @param fileId The ID of the file to get (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getFileThumbnail(String fileId) throws RestClientException {
        getFileThumbnailWithHttpInfo(fileId);
    }

    /**
     * Get a file&#39;s thumbnail
     * Gets a file&#39;s thumbnail. ##### Permissions Must have &#x60;read_channel&#x60; permission or be uploader of the file. 
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b> - Do not have appropriate permissions
     * <p><b>404</b>
     * <p><b>501</b>
     * @param fileId The ID of the file to get (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getFileThumbnailWithHttpInfo(String fileId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling getFileThumbnail");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("file_id", fileId);

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/files/{file_id}/thumbnail", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search files in a team
     * Search for files in a team based on file name, extention and file content (if file content extraction is enabled and supported for the files). ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     * <p><b>200</b> - Files list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @param searchFilesRequest The search terms and logic to use in the search. (required)
     * @return FileInfoList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FileInfoList searchFiles(String teamId, SearchFilesRequest searchFilesRequest) throws RestClientException {
        return searchFilesWithHttpInfo(teamId, searchFilesRequest).getBody();
    }

    /**
     * Search files in a team
     * Search for files in a team based on file name, extention and file content (if file content extraction is enabled and supported for the files). ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 
     * <p><b>200</b> - Files list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @param searchFilesRequest The search terms and logic to use in the search. (required)
     * @return ResponseEntity&lt;FileInfoList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FileInfoList> searchFilesWithHttpInfo(String teamId, SearchFilesRequest searchFilesRequest) throws RestClientException {
        Object localVarPostBody = searchFilesRequest;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling searchFiles");
        }
        
        // verify the required parameter 'searchFilesRequest' is set
        if (searchFilesRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'searchFilesRequest' when calling searchFiles");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);

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

        ParameterizedTypeReference<FileInfoList> localReturnType = new ParameterizedTypeReference<FileInfoList>() {};
        return apiClient.invokeAPI("/teams/{team_id}/files/search", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Upload a file
     * Uploads a file that can later be attached to a post.  This request can either be a multipart/form-data request with a channel_id, files and optional client_ids defined in the FormData, or it can be a request with the channel_id and filename defined as query parameters with the contents of a single file in the body of the request.  ##### Permissions Must have &#x60;upload_file&#x60; permission. 
     * <p><b>201</b> - Corresponding lists of the provided client_ids and the metadata that has been stored in the database for each one
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>413</b>
     * <p><b>501</b>
     * @param channelId The ID of the channel that this file will be uploaded to (optional)
     * @param filename The name of the file to be uploaded (optional)
     * @return UploadFile201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UploadFile201Response uploadFile(String channelId, String filename) throws RestClientException {
        return uploadFileWithHttpInfo(channelId, filename).getBody();
    }

    /**
     * Upload a file
     * Uploads a file that can later be attached to a post.  This request can either be a multipart/form-data request with a channel_id, files and optional client_ids defined in the FormData, or it can be a request with the channel_id and filename defined as query parameters with the contents of a single file in the body of the request.  ##### Permissions Must have &#x60;upload_file&#x60; permission. 
     * <p><b>201</b> - Corresponding lists of the provided client_ids and the metadata that has been stored in the database for each one
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>413</b>
     * <p><b>501</b>
     * @param channelId The ID of the channel that this file will be uploaded to (optional)
     * @param filename The name of the file to be uploaded (optional)
     * @return ResponseEntity&lt;UploadFile201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UploadFile201Response> uploadFileWithHttpInfo(String channelId, String filename) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "channel_id", channelId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filename", filename));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<UploadFile201Response> localReturnType = new ParameterizedTypeReference<UploadFile201Response>() {};
        return apiClient.invokeAPI("/files", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
