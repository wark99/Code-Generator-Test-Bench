package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiError;
import org.openapitools.client.model.Model1VodChannelChannelBrowseCopyPostRequest;
import org.openapitools.client.model.Model1VodChannelChannelBrowseDeleteRequest;
import org.openapitools.client.model.Model1VodChannelChannelBrowseFileCopyPostRequest;
import org.openapitools.client.model.Model1VodChannelChannelBrowseGet200Response;
import org.openapitools.client.model.Model1VodChannelChannelBrowseTrashFileRestorePost200Response;
import org.openapitools.client.model.Model1VodChannelChannelBrowseUpdatePutRequest;
import org.openapitools.client.model.Model1VodChannelChannelFolderFolderPlaylistGet200Response;
import org.openapitools.client.model.Model1VodChannelChannelFolderGet200Response;
import org.openapitools.client.model.Model1VodChannelChannelFolderRootGet200Response;
import org.openapitools.client.model.Model1VodChannelChannelMediaGet200Response;
import org.openapitools.client.model.Model1VodChannelChannelMediaMediaChapterChapterGet200Response;
import org.openapitools.client.model.Model1VodChannelChannelMediaMediaChapterGet200Response;
import org.openapitools.client.model.Model1VodChannelChannelMediaMediaCutPost200Response;
import org.openapitools.client.model.Model1VodChannelChannelMediaMediaGet200Response;
import org.openapitools.client.model.Model1VodChannelChannelMediaMediaThumbnailPost200Response;
import org.openapitools.client.model.Model1VodChannelChannelPlayerGet200Response;
import org.openapitools.client.model.Model1VodChannelChannelPlayerPlayerGet200Response;
import org.openapitools.client.model.Model1VodChannelChannelPlaylistPlaylistGet200Response;
import org.openapitools.client.model.Model1VodChannelChannelSharePost200Response;
import org.openapitools.client.model.Model1VodChannelChannelSharePostRequest;
import org.openapitools.client.model.Model1VodChannelChannelShareShareGet200Response;
import org.openapitools.client.model.Model1VodChannelChannelShareShareTokenPost200Response;
import org.openapitools.client.model.Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response;
import org.openapitools.client.model.Model1VodChannelChannelUploadPost200Response;
import org.openapitools.client.model.Model1VodChannelChannelUploadPostRequest;
import org.openapitools.client.model.ShortChapter;
import org.openapitools.client.model.ShortFolder;
import org.openapitools.client.model.ShortMedia;

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
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Duplicates one or many medias/folders to a given folder.
     * Duplicates one or many medias/folders to a given folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param model1VodChannelChannelBrowseCopyPostRequest  (required)
     * @return Model1VodChannelChannelBrowseGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelBrowseGet200Response call1vodChannelChannelBrowseCopyPost(String channel, Model1VodChannelChannelBrowseCopyPostRequest model1VodChannelChannelBrowseCopyPostRequest) throws RestClientException {
        return call1vodChannelChannelBrowseCopyPostWithHttpInfo(channel, model1VodChannelChannelBrowseCopyPostRequest).getBody();
    }

    /**
     * Duplicates one or many medias/folders to a given folder.
     * Duplicates one or many medias/folders to a given folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param model1VodChannelChannelBrowseCopyPostRequest  (required)
     * @return ResponseEntity&lt;Model1VodChannelChannelBrowseGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelBrowseGet200Response> call1vodChannelChannelBrowseCopyPostWithHttpInfo(String channel, Model1VodChannelChannelBrowseCopyPostRequest model1VodChannelChannelBrowseCopyPostRequest) throws RestClientException {
        Object localVarPostBody = model1VodChannelChannelBrowseCopyPostRequest;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelBrowseCopyPost");
        }
        
        // verify the required parameter 'model1VodChannelChannelBrowseCopyPostRequest' is set
        if (model1VodChannelChannelBrowseCopyPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model1VodChannelChannelBrowseCopyPostRequest' when calling call1vodChannelChannelBrowseCopyPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

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

        ParameterizedTypeReference<Model1VodChannelChannelBrowseGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelBrowseGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/browse/copy", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Moves one or many medias/folders to trash.
     * Moves one or many medias/folders to trash.
     * <p><b>200</b>
     * <p><b>204</b>
     * @param channel  (required)
     * @param model1VodChannelChannelBrowseDeleteRequest  (required)
     * @return Model1VodChannelChannelBrowseGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelBrowseGet200Response call1vodChannelChannelBrowseDelete(String channel, Model1VodChannelChannelBrowseDeleteRequest model1VodChannelChannelBrowseDeleteRequest) throws RestClientException {
        return call1vodChannelChannelBrowseDeleteWithHttpInfo(channel, model1VodChannelChannelBrowseDeleteRequest).getBody();
    }

    /**
     * Moves one or many medias/folders to trash.
     * Moves one or many medias/folders to trash.
     * <p><b>200</b>
     * <p><b>204</b>
     * @param channel  (required)
     * @param model1VodChannelChannelBrowseDeleteRequest  (required)
     * @return ResponseEntity&lt;Model1VodChannelChannelBrowseGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelBrowseGet200Response> call1vodChannelChannelBrowseDeleteWithHttpInfo(String channel, Model1VodChannelChannelBrowseDeleteRequest model1VodChannelChannelBrowseDeleteRequest) throws RestClientException {
        Object localVarPostBody = model1VodChannelChannelBrowseDeleteRequest;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelBrowseDelete");
        }
        
        // verify the required parameter 'model1VodChannelChannelBrowseDeleteRequest' is set
        if (model1VodChannelChannelBrowseDeleteRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model1VodChannelChannelBrowseDeleteRequest' when calling call1vodChannelChannelBrowseDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

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

        ParameterizedTypeReference<Model1VodChannelChannelBrowseGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelBrowseGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/browse", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Duplicates a media/folder to a given folder.
     * Duplicates a media/folder to a given folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param _file  (required)
     * @param model1VodChannelChannelBrowseFileCopyPostRequest  (required)
     * @return Model1VodChannelChannelBrowseTrashFileRestorePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelBrowseTrashFileRestorePost200Response call1vodChannelChannelBrowseFileCopyPost(String channel, String _file, Model1VodChannelChannelBrowseFileCopyPostRequest model1VodChannelChannelBrowseFileCopyPostRequest) throws RestClientException {
        return call1vodChannelChannelBrowseFileCopyPostWithHttpInfo(channel, _file, model1VodChannelChannelBrowseFileCopyPostRequest).getBody();
    }

    /**
     * Duplicates a media/folder to a given folder.
     * Duplicates a media/folder to a given folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param _file  (required)
     * @param model1VodChannelChannelBrowseFileCopyPostRequest  (required)
     * @return ResponseEntity&lt;Model1VodChannelChannelBrowseTrashFileRestorePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelBrowseTrashFileRestorePost200Response> call1vodChannelChannelBrowseFileCopyPostWithHttpInfo(String channel, String _file, Model1VodChannelChannelBrowseFileCopyPostRequest model1VodChannelChannelBrowseFileCopyPostRequest) throws RestClientException {
        Object localVarPostBody = model1VodChannelChannelBrowseFileCopyPostRequest;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelBrowseFileCopyPost");
        }
        
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '_file' when calling call1vodChannelChannelBrowseFileCopyPost");
        }
        
        // verify the required parameter 'model1VodChannelChannelBrowseFileCopyPostRequest' is set
        if (model1VodChannelChannelBrowseFileCopyPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model1VodChannelChannelBrowseFileCopyPostRequest' when calling call1vodChannelChannelBrowseFileCopyPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("file", _file);

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

        ParameterizedTypeReference<Model1VodChannelChannelBrowseTrashFileRestorePost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelBrowseTrashFileRestorePost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/browse/{file}/copy", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Moves a media/folder to trash.
     * Moves a media/folder to trash.
     * <p><b>204</b>
     * @param channel  (required)
     * @param _file  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object call1vodChannelChannelBrowseFileDelete(String channel, String _file) throws RestClientException {
        return call1vodChannelChannelBrowseFileDeleteWithHttpInfo(channel, _file).getBody();
    }

    /**
     * Moves a media/folder to trash.
     * Moves a media/folder to trash.
     * <p><b>204</b>
     * @param channel  (required)
     * @param _file  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> call1vodChannelChannelBrowseFileDeleteWithHttpInfo(String channel, String _file) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelBrowseFileDelete");
        }
        
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '_file' when calling call1vodChannelChannelBrowseFileDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("file", _file);

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

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/browse/{file}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Lists all children of a given folder.
     * Lists all children of a given folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param _file  (required)
     * @return Model1VodChannelChannelBrowseGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelBrowseGet200Response call1vodChannelChannelBrowseFileGet(String channel, String _file) throws RestClientException {
        return call1vodChannelChannelBrowseFileGetWithHttpInfo(channel, _file).getBody();
    }

    /**
     * Lists all children of a given folder.
     * Lists all children of a given folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param _file  (required)
     * @return ResponseEntity&lt;Model1VodChannelChannelBrowseGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelBrowseGet200Response> call1vodChannelChannelBrowseFileGetWithHttpInfo(String channel, String _file) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelBrowseFileGet");
        }
        
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '_file' when calling call1vodChannelChannelBrowseFileGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("file", _file);

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

        ParameterizedTypeReference<Model1VodChannelChannelBrowseGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelBrowseGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/browse/{file}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Moves a media/folder to a given folder.
     * Moves a media/folder to a given folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param _file  (required)
     * @param model1VodChannelChannelBrowseFileCopyPostRequest  (required)
     * @return Model1VodChannelChannelBrowseTrashFileRestorePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelBrowseTrashFileRestorePost200Response call1vodChannelChannelBrowseFileMovePost(String channel, String _file, Model1VodChannelChannelBrowseFileCopyPostRequest model1VodChannelChannelBrowseFileCopyPostRequest) throws RestClientException {
        return call1vodChannelChannelBrowseFileMovePostWithHttpInfo(channel, _file, model1VodChannelChannelBrowseFileCopyPostRequest).getBody();
    }

    /**
     * Moves a media/folder to a given folder.
     * Moves a media/folder to a given folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param _file  (required)
     * @param model1VodChannelChannelBrowseFileCopyPostRequest  (required)
     * @return ResponseEntity&lt;Model1VodChannelChannelBrowseTrashFileRestorePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelBrowseTrashFileRestorePost200Response> call1vodChannelChannelBrowseFileMovePostWithHttpInfo(String channel, String _file, Model1VodChannelChannelBrowseFileCopyPostRequest model1VodChannelChannelBrowseFileCopyPostRequest) throws RestClientException {
        Object localVarPostBody = model1VodChannelChannelBrowseFileCopyPostRequest;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelBrowseFileMovePost");
        }
        
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '_file' when calling call1vodChannelChannelBrowseFileMovePost");
        }
        
        // verify the required parameter 'model1VodChannelChannelBrowseFileCopyPostRequest' is set
        if (model1VodChannelChannelBrowseFileCopyPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model1VodChannelChannelBrowseFileCopyPostRequest' when calling call1vodChannelChannelBrowseFileMovePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("file", _file);

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

        ParameterizedTypeReference<Model1VodChannelChannelBrowseTrashFileRestorePost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelBrowseTrashFileRestorePost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/browse/{file}/move", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Updates a media/folder.
     * Updates a media/folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param _file  (required)
     * @param body  (required)
     * @return Model1VodChannelChannelBrowseTrashFileRestorePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelBrowseTrashFileRestorePost200Response call1vodChannelChannelBrowseFilePut(String channel, String _file, Object body) throws RestClientException {
        return call1vodChannelChannelBrowseFilePutWithHttpInfo(channel, _file, body).getBody();
    }

    /**
     * Updates a media/folder.
     * Updates a media/folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param _file  (required)
     * @param body  (required)
     * @return ResponseEntity&lt;Model1VodChannelChannelBrowseTrashFileRestorePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelBrowseTrashFileRestorePost200Response> call1vodChannelChannelBrowseFilePutWithHttpInfo(String channel, String _file, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelBrowseFilePut");
        }
        
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '_file' when calling call1vodChannelChannelBrowseFilePut");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling call1vodChannelChannelBrowseFilePut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("file", _file);

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

        ParameterizedTypeReference<Model1VodChannelChannelBrowseTrashFileRestorePost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelBrowseTrashFileRestorePost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/browse/{file}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Lists all children of the channel&#39;s root folder.
     * Lists all children of the channel&#39;s root folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * <p><b>422</b>
     * @param channel  (required)
     * @return Model1VodChannelChannelBrowseGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelBrowseGet200Response call1vodChannelChannelBrowseGet(String channel) throws RestClientException {
        return call1vodChannelChannelBrowseGetWithHttpInfo(channel).getBody();
    }

    /**
     * Lists all children of the channel&#39;s root folder.
     * Lists all children of the channel&#39;s root folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * <p><b>422</b>
     * @param channel  (required)
     * @return ResponseEntity&lt;Model1VodChannelChannelBrowseGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelBrowseGet200Response> call1vodChannelChannelBrowseGetWithHttpInfo(String channel) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelBrowseGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

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

        ParameterizedTypeReference<Model1VodChannelChannelBrowseGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelBrowseGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/browse", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Moves one or many medias/folders to a given folder.
     * Moves one or many medias/folders to a given folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param model1VodChannelChannelBrowseCopyPostRequest  (required)
     * @return Model1VodChannelChannelBrowseGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelBrowseGet200Response call1vodChannelChannelBrowseMovePost(String channel, Model1VodChannelChannelBrowseCopyPostRequest model1VodChannelChannelBrowseCopyPostRequest) throws RestClientException {
        return call1vodChannelChannelBrowseMovePostWithHttpInfo(channel, model1VodChannelChannelBrowseCopyPostRequest).getBody();
    }

    /**
     * Moves one or many medias/folders to a given folder.
     * Moves one or many medias/folders to a given folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param model1VodChannelChannelBrowseCopyPostRequest  (required)
     * @return ResponseEntity&lt;Model1VodChannelChannelBrowseGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelBrowseGet200Response> call1vodChannelChannelBrowseMovePostWithHttpInfo(String channel, Model1VodChannelChannelBrowseCopyPostRequest model1VodChannelChannelBrowseCopyPostRequest) throws RestClientException {
        Object localVarPostBody = model1VodChannelChannelBrowseCopyPostRequest;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelBrowseMovePost");
        }
        
        // verify the required parameter 'model1VodChannelChannelBrowseCopyPostRequest' is set
        if (model1VodChannelChannelBrowseCopyPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model1VodChannelChannelBrowseCopyPostRequest' when calling call1vodChannelChannelBrowseMovePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

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

        ParameterizedTypeReference<Model1VodChannelChannelBrowseGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelBrowseGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/browse/move", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Deletes a media/folder from trash, permanently.
     * Deletes a media/folder from trash, permanently.
     * <p><b>204</b>
     * @param channel  (required)
     * @param _file  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object call1vodChannelChannelBrowseTrashFileDelete(String channel, String _file) throws RestClientException {
        return call1vodChannelChannelBrowseTrashFileDeleteWithHttpInfo(channel, _file).getBody();
    }

    /**
     * Deletes a media/folder from trash, permanently.
     * Deletes a media/folder from trash, permanently.
     * <p><b>204</b>
     * @param channel  (required)
     * @param _file  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> call1vodChannelChannelBrowseTrashFileDeleteWithHttpInfo(String channel, String _file) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelBrowseTrashFileDelete");
        }
        
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '_file' when calling call1vodChannelChannelBrowseTrashFileDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("file", _file);

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

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/browse/trash/{file}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Restores a media/folder from trash to its original location.
     * Restores a media/folder from trash to its original location.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param _file  (required)
     * @return Model1VodChannelChannelBrowseTrashFileRestorePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelBrowseTrashFileRestorePost200Response call1vodChannelChannelBrowseTrashFileRestorePost(String channel, String _file) throws RestClientException {
        return call1vodChannelChannelBrowseTrashFileRestorePostWithHttpInfo(channel, _file).getBody();
    }

    /**
     * Restores a media/folder from trash to its original location.
     * Restores a media/folder from trash to its original location.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param _file  (required)
     * @return ResponseEntity&lt;Model1VodChannelChannelBrowseTrashFileRestorePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelBrowseTrashFileRestorePost200Response> call1vodChannelChannelBrowseTrashFileRestorePostWithHttpInfo(String channel, String _file) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelBrowseTrashFileRestorePost");
        }
        
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '_file' when calling call1vodChannelChannelBrowseTrashFileRestorePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("file", _file);

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

        ParameterizedTypeReference<Model1VodChannelChannelBrowseTrashFileRestorePost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelBrowseTrashFileRestorePost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/browse/trash/{file}/restore", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Lists all medias/folders in trash.
     * Lists all medias/folders in trash.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @return Model1VodChannelChannelBrowseGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelBrowseGet200Response call1vodChannelChannelBrowseTrashGet(String channel) throws RestClientException {
        return call1vodChannelChannelBrowseTrashGetWithHttpInfo(channel).getBody();
    }

    /**
     * Lists all medias/folders in trash.
     * Lists all medias/folders in trash.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @return ResponseEntity&lt;Model1VodChannelChannelBrowseGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelBrowseGet200Response> call1vodChannelChannelBrowseTrashGetWithHttpInfo(String channel) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelBrowseTrashGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

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

        ParameterizedTypeReference<Model1VodChannelChannelBrowseGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelBrowseGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/browse/trash", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Updates one or many medias/folders.
     * Updates one or many medias/folders.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param model1VodChannelChannelBrowseUpdatePutRequest  (required)
     * @return Model1VodChannelChannelBrowseGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelBrowseGet200Response call1vodChannelChannelBrowseUpdatePut(String channel, Model1VodChannelChannelBrowseUpdatePutRequest model1VodChannelChannelBrowseUpdatePutRequest) throws RestClientException {
        return call1vodChannelChannelBrowseUpdatePutWithHttpInfo(channel, model1VodChannelChannelBrowseUpdatePutRequest).getBody();
    }

    /**
     * Updates one or many medias/folders.
     * Updates one or many medias/folders.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param model1VodChannelChannelBrowseUpdatePutRequest  (required)
     * @return ResponseEntity&lt;Model1VodChannelChannelBrowseGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelBrowseGet200Response> call1vodChannelChannelBrowseUpdatePutWithHttpInfo(String channel, Model1VodChannelChannelBrowseUpdatePutRequest model1VodChannelChannelBrowseUpdatePutRequest) throws RestClientException {
        Object localVarPostBody = model1VodChannelChannelBrowseUpdatePutRequest;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelBrowseUpdatePut");
        }
        
        // verify the required parameter 'model1VodChannelChannelBrowseUpdatePutRequest' is set
        if (model1VodChannelChannelBrowseUpdatePutRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model1VodChannelChannelBrowseUpdatePutRequest' when calling call1vodChannelChannelBrowseUpdatePut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

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

        ParameterizedTypeReference<Model1VodChannelChannelBrowseGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelBrowseGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/browse/update", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Deletes a folder with all its children, recursively.
     * Deletes a folder with all its children, recursively.
     * <p><b>204</b>
     * @param channel  (required)
     * @param folder  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object call1vodChannelChannelFolderFolderDelete(String channel, String folder) throws RestClientException {
        return call1vodChannelChannelFolderFolderDeleteWithHttpInfo(channel, folder).getBody();
    }

    /**
     * Deletes a folder with all its children, recursively.
     * Deletes a folder with all its children, recursively.
     * <p><b>204</b>
     * @param channel  (required)
     * @param folder  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> call1vodChannelChannelFolderFolderDeleteWithHttpInfo(String channel, String folder) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelFolderFolderDelete");
        }
        
        // verify the required parameter 'folder' is set
        if (folder == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'folder' when calling call1vodChannelChannelFolderFolderDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("folder", folder);

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

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/folder/{folder}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns a folder.
     * Returns a folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param folder  (required)
     * @param $folderCommaNewOptionsHttp$request  (required)
     * @param with  (optional)
     * @return Model1VodChannelChannelFolderRootGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelFolderRootGet200Response call1vodChannelChannelFolderFolderGet(String channel, String folder, String $folderCommaNewOptionsHttp$request, String with) throws RestClientException {
        return call1vodChannelChannelFolderFolderGetWithHttpInfo(channel, folder, $folderCommaNewOptionsHttp$request, with).getBody();
    }

    /**
     * Returns a folder.
     * Returns a folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param folder  (required)
     * @param $folderCommaNewOptionsHttp$request  (required)
     * @param with  (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelFolderRootGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelFolderRootGet200Response> call1vodChannelChannelFolderFolderGetWithHttpInfo(String channel, String folder, String $folderCommaNewOptionsHttp$request, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelFolderFolderGet");
        }
        
        // verify the required parameter 'folder' is set
        if (folder == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'folder' when calling call1vodChannelChannelFolderFolderGet");
        }
        
        // verify the required parameter '$folderCommaNewOptionsHttp$request' is set
        if ($folderCommaNewOptionsHttp$request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '$folderCommaNewOptionsHttp$request' when calling call1vodChannelChannelFolderFolderGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("folder", folder);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "$folder, new OptionsHttp($request", $folderCommaNewOptionsHttp$request));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelFolderRootGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelFolderRootGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/folder/{folder}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Lists all playlists having a given folder attached.
     * Lists all playlists having a given folder attached.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param folder  (required)
     * @param with  (optional)
     * @return Model1VodChannelChannelFolderFolderPlaylistGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelFolderFolderPlaylistGet200Response call1vodChannelChannelFolderFolderPlaylistGet(String channel, String folder, String with) throws RestClientException {
        return call1vodChannelChannelFolderFolderPlaylistGetWithHttpInfo(channel, folder, with).getBody();
    }

    /**
     * Lists all playlists having a given folder attached.
     * Lists all playlists having a given folder attached.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param folder  (required)
     * @param with  (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelFolderFolderPlaylistGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelFolderFolderPlaylistGet200Response> call1vodChannelChannelFolderFolderPlaylistGetWithHttpInfo(String channel, String folder, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelFolderFolderPlaylistGet");
        }
        
        // verify the required parameter 'folder' is set
        if (folder == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'folder' when calling call1vodChannelChannelFolderFolderPlaylistGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("folder", folder);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelFolderFolderPlaylistGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelFolderFolderPlaylistGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/folder/{folder}/playlist", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Creates a new folder in the parent folder.
     * Creates a new folder in the parent folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param folder  (required)
     * @param shortFolder  (required)
     * @return Model1VodChannelChannelFolderRootGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelFolderRootGet200Response call1vodChannelChannelFolderFolderPost(String channel, String folder, ShortFolder shortFolder) throws RestClientException {
        return call1vodChannelChannelFolderFolderPostWithHttpInfo(channel, folder, shortFolder).getBody();
    }

    /**
     * Creates a new folder in the parent folder.
     * Creates a new folder in the parent folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param folder  (required)
     * @param shortFolder  (required)
     * @return ResponseEntity&lt;Model1VodChannelChannelFolderRootGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelFolderRootGet200Response> call1vodChannelChannelFolderFolderPostWithHttpInfo(String channel, String folder, ShortFolder shortFolder) throws RestClientException {
        Object localVarPostBody = shortFolder;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelFolderFolderPost");
        }
        
        // verify the required parameter 'folder' is set
        if (folder == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'folder' when calling call1vodChannelChannelFolderFolderPost");
        }
        
        // verify the required parameter 'shortFolder' is set
        if (shortFolder == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shortFolder' when calling call1vodChannelChannelFolderFolderPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("folder", folder);

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

        ParameterizedTypeReference<Model1VodChannelChannelFolderRootGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelFolderRootGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/folder/{folder}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Updates a folder.
     * Updates a folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param folder  (required)
     * @param shortFolder  (required)
     * @return Model1VodChannelChannelFolderRootGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelFolderRootGet200Response call1vodChannelChannelFolderFolderPut(String channel, String folder, ShortFolder shortFolder) throws RestClientException {
        return call1vodChannelChannelFolderFolderPutWithHttpInfo(channel, folder, shortFolder).getBody();
    }

    /**
     * Updates a folder.
     * Updates a folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param folder  (required)
     * @param shortFolder  (required)
     * @return ResponseEntity&lt;Model1VodChannelChannelFolderRootGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelFolderRootGet200Response> call1vodChannelChannelFolderFolderPutWithHttpInfo(String channel, String folder, ShortFolder shortFolder) throws RestClientException {
        Object localVarPostBody = shortFolder;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelFolderFolderPut");
        }
        
        // verify the required parameter 'folder' is set
        if (folder == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'folder' when calling call1vodChannelChannelFolderFolderPut");
        }
        
        // verify the required parameter 'shortFolder' is set
        if (shortFolder == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shortFolder' when calling call1vodChannelChannelFolderFolderPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("folder", folder);

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

        ParameterizedTypeReference<Model1VodChannelChannelFolderRootGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelFolderRootGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/folder/{folder}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List all folders.
     * List all folders.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param with  (optional)
     * @return Model1VodChannelChannelFolderGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelFolderGet200Response call1vodChannelChannelFolderGet(String channel, String with) throws RestClientException {
        return call1vodChannelChannelFolderGetWithHttpInfo(channel, with).getBody();
    }

    /**
     * List all folders.
     * List all folders.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param with  (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelFolderGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelFolderGet200Response> call1vodChannelChannelFolderGetWithHttpInfo(String channel, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelFolderGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelFolderGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelFolderGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/folder", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns the channel&#39;s root folder.
     * Returns the channel&#39;s root folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param with  (optional)
     * @return Model1VodChannelChannelFolderRootGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelFolderRootGet200Response call1vodChannelChannelFolderRootGet(String channel, String with) throws RestClientException {
        return call1vodChannelChannelFolderRootGetWithHttpInfo(channel, with).getBody();
    }

    /**
     * Returns the channel&#39;s root folder.
     * Returns the channel&#39;s root folder.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param with  (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelFolderRootGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelFolderRootGet200Response> call1vodChannelChannelFolderRootGetWithHttpInfo(String channel, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelFolderRootGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelFolderRootGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelFolderRootGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/folder/root", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Lists all medias.
     * Lists all medias.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param with  (optional)
     * @return Model1VodChannelChannelMediaGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelMediaGet200Response call1vodChannelChannelMediaGet(String channel, String with) throws RestClientException {
        return call1vodChannelChannelMediaGetWithHttpInfo(channel, with).getBody();
    }

    /**
     * Lists all medias.
     * Lists all medias.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param with  (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelMediaGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelMediaGet200Response> call1vodChannelChannelMediaGetWithHttpInfo(String channel, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelMediaGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelMediaGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelMediaGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/media", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns a chapter.
     * Returns a chapter.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param chapter  (required)
     * @param $mediaComma$chapterCommaNewOptionsHttp$request  (required)
     * @param with  (optional)
     * @return Model1VodChannelChannelMediaMediaChapterChapterGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelMediaMediaChapterChapterGet200Response call1vodChannelChannelMediaMediaChapterChapterGet(String channel, String media, String chapter, String $mediaComma$chapterCommaNewOptionsHttp$request, String with) throws RestClientException {
        return call1vodChannelChannelMediaMediaChapterChapterGetWithHttpInfo(channel, media, chapter, $mediaComma$chapterCommaNewOptionsHttp$request, with).getBody();
    }

    /**
     * Returns a chapter.
     * Returns a chapter.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param chapter  (required)
     * @param $mediaComma$chapterCommaNewOptionsHttp$request  (required)
     * @param with  (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelMediaMediaChapterChapterGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelMediaMediaChapterChapterGet200Response> call1vodChannelChannelMediaMediaChapterChapterGetWithHttpInfo(String channel, String media, String chapter, String $mediaComma$chapterCommaNewOptionsHttp$request, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelMediaMediaChapterChapterGet");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelMediaMediaChapterChapterGet");
        }
        
        // verify the required parameter 'chapter' is set
        if (chapter == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chapter' when calling call1vodChannelChannelMediaMediaChapterChapterGet");
        }
        
        // verify the required parameter '$mediaComma$chapterCommaNewOptionsHttp$request' is set
        if ($mediaComma$chapterCommaNewOptionsHttp$request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '$mediaComma$chapterCommaNewOptionsHttp$request' when calling call1vodChannelChannelMediaMediaChapterChapterGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);
        uriVariables.put("chapter", chapter);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "$media, $chapter, new OptionsHttp($request", $mediaComma$chapterCommaNewOptionsHttp$request));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelMediaMediaChapterChapterGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelMediaMediaChapterChapterGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/media/{media}/chapter/{chapter}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Updates a chapter.
     * Updates a chapter.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param chapter  (required)
     * @param shortChapter  (optional)
     * @return Model1VodChannelChannelMediaMediaChapterGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelMediaMediaChapterGet200Response call1vodChannelChannelMediaMediaChapterChapterPut(String channel, String media, String chapter, ShortChapter shortChapter) throws RestClientException {
        return call1vodChannelChannelMediaMediaChapterChapterPutWithHttpInfo(channel, media, chapter, shortChapter).getBody();
    }

    /**
     * Updates a chapter.
     * Updates a chapter.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param chapter  (required)
     * @param shortChapter  (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelMediaMediaChapterGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelMediaMediaChapterGet200Response> call1vodChannelChannelMediaMediaChapterChapterPutWithHttpInfo(String channel, String media, String chapter, ShortChapter shortChapter) throws RestClientException {
        Object localVarPostBody = shortChapter;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelMediaMediaChapterChapterPut");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelMediaMediaChapterChapterPut");
        }
        
        // verify the required parameter 'chapter' is set
        if (chapter == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chapter' when calling call1vodChannelChannelMediaMediaChapterChapterPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);
        uriVariables.put("chapter", chapter);

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

        ParameterizedTypeReference<Model1VodChannelChannelMediaMediaChapterGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelMediaMediaChapterGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/media/{media}/chapter/{chapter}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Lists all chapters of a given media.
     * Lists all chapters of a given media.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param with  (optional)
     * @return Model1VodChannelChannelMediaMediaChapterGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelMediaMediaChapterGet200Response call1vodChannelChannelMediaMediaChapterGet(String channel, String media, String with) throws RestClientException {
        return call1vodChannelChannelMediaMediaChapterGetWithHttpInfo(channel, media, with).getBody();
    }

    /**
     * Lists all chapters of a given media.
     * Lists all chapters of a given media.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param with  (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelMediaMediaChapterGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelMediaMediaChapterGet200Response> call1vodChannelChannelMediaMediaChapterGetWithHttpInfo(String channel, String media, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelMediaMediaChapterGet");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelMediaMediaChapterGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelMediaMediaChapterGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelMediaMediaChapterGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/media/{media}/chapter", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Creates a new chapter to a given media.
     * Creates a new chapter to a given media.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param shortChapter  (optional)
     * @return Model1VodChannelChannelMediaMediaChapterGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelMediaMediaChapterGet200Response call1vodChannelChannelMediaMediaChapterPost(String channel, String media, ShortChapter shortChapter) throws RestClientException {
        return call1vodChannelChannelMediaMediaChapterPostWithHttpInfo(channel, media, shortChapter).getBody();
    }

    /**
     * Creates a new chapter to a given media.
     * Creates a new chapter to a given media.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param shortChapter  (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelMediaMediaChapterGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelMediaMediaChapterGet200Response> call1vodChannelChannelMediaMediaChapterPostWithHttpInfo(String channel, String media, ShortChapter shortChapter) throws RestClientException {
        Object localVarPostBody = shortChapter;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelMediaMediaChapterPost");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelMediaMediaChapterPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

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

        ParameterizedTypeReference<Model1VodChannelChannelMediaMediaChapterGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelMediaMediaChapterGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/media/{media}/chapter", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Cuts a media with its encodings
     * Cuts a media with its encodings
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param body  (required)
     * @param _new creates a new trimmed media if set to 1 (optional)
     * @param from time in seconds where the trim starts, in multiples of 2 (optional)
     * @param duration duration of the trim in seconds, in multiples of 2, is (endTime-startTrimTime) (optional)
     * @param channel channel id (optional)
     * @param media media uuid (optional)
     * @return Model1VodChannelChannelMediaMediaCutPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelMediaMediaCutPost200Response call1vodChannelChannelMediaMediaCutPost(Object body, String _new, String from, String duration, String channel, String media) throws RestClientException {
        return call1vodChannelChannelMediaMediaCutPostWithHttpInfo(body, _new, from, duration, channel, media).getBody();
    }

    /**
     * Cuts a media with its encodings
     * Cuts a media with its encodings
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param body  (required)
     * @param _new creates a new trimmed media if set to 1 (optional)
     * @param from time in seconds where the trim starts, in multiples of 2 (optional)
     * @param duration duration of the trim in seconds, in multiples of 2, is (endTime-startTrimTime) (optional)
     * @param channel channel id (optional)
     * @param media media uuid (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelMediaMediaCutPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelMediaMediaCutPost200Response> call1vodChannelChannelMediaMediaCutPostWithHttpInfo(Object body, String _new, String from, String duration, String channel, String media) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling call1vodChannelChannelMediaMediaCutPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "new", _new));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "duration", duration));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelMediaMediaCutPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelMediaMediaCutPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/media/{media}/cut", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Deletes a media.
     * Deletes a media.
     * <p><b>204</b>
     * @param channel  (required)
     * @param media  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object call1vodChannelChannelMediaMediaDelete(String channel, String media) throws RestClientException {
        return call1vodChannelChannelMediaMediaDeleteWithHttpInfo(channel, media).getBody();
    }

    /**
     * Deletes a media.
     * Deletes a media.
     * <p><b>204</b>
     * @param channel  (required)
     * @param media  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> call1vodChannelChannelMediaMediaDeleteWithHttpInfo(String channel, String media) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelMediaMediaDelete");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelMediaMediaDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

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

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/media/{media}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns a media.
     * Returns a media.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param $mediaCommaNewOptionsHttp$request  (required)
     * @param with  (optional)
     * @return Model1VodChannelChannelMediaMediaGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelMediaMediaGet200Response call1vodChannelChannelMediaMediaGet(String channel, String media, String $mediaCommaNewOptionsHttp$request, String with) throws RestClientException {
        return call1vodChannelChannelMediaMediaGetWithHttpInfo(channel, media, $mediaCommaNewOptionsHttp$request, with).getBody();
    }

    /**
     * Returns a media.
     * Returns a media.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param $mediaCommaNewOptionsHttp$request  (required)
     * @param with  (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelMediaMediaGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelMediaMediaGet200Response> call1vodChannelChannelMediaMediaGetWithHttpInfo(String channel, String media, String $mediaCommaNewOptionsHttp$request, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelMediaMediaGet");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelMediaMediaGet");
        }
        
        // verify the required parameter '$mediaCommaNewOptionsHttp$request' is set
        if ($mediaCommaNewOptionsHttp$request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '$mediaCommaNewOptionsHttp$request' when calling call1vodChannelChannelMediaMediaGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "$media, new OptionsHttp($request", $mediaCommaNewOptionsHttp$request));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelMediaMediaGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelMediaMediaGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/media/{media}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Updates a media.
     * Updates a media.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param shortMedia  (required)
     * @return Model1VodChannelChannelMediaMediaGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelMediaMediaGet200Response call1vodChannelChannelMediaMediaPut(String channel, String media, ShortMedia shortMedia) throws RestClientException {
        return call1vodChannelChannelMediaMediaPutWithHttpInfo(channel, media, shortMedia).getBody();
    }

    /**
     * Updates a media.
     * Updates a media.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param shortMedia  (required)
     * @return ResponseEntity&lt;Model1VodChannelChannelMediaMediaGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelMediaMediaGet200Response> call1vodChannelChannelMediaMediaPutWithHttpInfo(String channel, String media, ShortMedia shortMedia) throws RestClientException {
        Object localVarPostBody = shortMedia;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelMediaMediaPut");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelMediaMediaPut");
        }
        
        // verify the required parameter 'shortMedia' is set
        if (shortMedia == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shortMedia' when calling call1vodChannelChannelMediaMediaPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

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

        ParameterizedTypeReference<Model1VodChannelChannelMediaMediaGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelMediaMediaGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/media/{media}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Replaces the thumbnail &amp; poster for a given media
     * Replaces the thumbnail &amp; poster for a given media  with the file provided in the request as multipart/form-data.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * <p><b>422</b>
     * @param _file The thumbnail file (required)
     * @param channel  (required)
     * @param media  (required)
     * @return Model1VodChannelChannelMediaMediaThumbnailPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelMediaMediaThumbnailPost200Response call1vodChannelChannelMediaMediaThumbnailPost(String _file, String channel, String media) throws RestClientException {
        return call1vodChannelChannelMediaMediaThumbnailPostWithHttpInfo(_file, channel, media).getBody();
    }

    /**
     * Replaces the thumbnail &amp; poster for a given media
     * Replaces the thumbnail &amp; poster for a given media  with the file provided in the request as multipart/form-data.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * <p><b>422</b>
     * @param _file The thumbnail file (required)
     * @param channel  (required)
     * @param media  (required)
     * @return ResponseEntity&lt;Model1VodChannelChannelMediaMediaThumbnailPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelMediaMediaThumbnailPost200Response> call1vodChannelChannelMediaMediaThumbnailPostWithHttpInfo(String _file, String channel, String media) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '_file' when calling call1vodChannelChannelMediaMediaThumbnailPost");
        }
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelMediaMediaThumbnailPost");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelMediaMediaThumbnailPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "file", _file));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelMediaMediaThumbnailPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelMediaMediaThumbnailPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/media/{media}/thumbnail", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Lists all players.
     * Lists all players.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param with  (optional)
     * @return Model1VodChannelChannelPlayerGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelPlayerGet200Response call1vodChannelChannelPlayerGet(String channel, String with) throws RestClientException {
        return call1vodChannelChannelPlayerGetWithHttpInfo(channel, with).getBody();
    }

    /**
     * Lists all players.
     * Lists all players.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param with  (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelPlayerGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelPlayerGet200Response> call1vodChannelChannelPlayerGetWithHttpInfo(String channel, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelPlayerGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelPlayerGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelPlayerGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/player", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns a player.
     * Returns a player.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param player  (required)
     * @param $playerCommaNewOptionsHttp$request  (required)
     * @param with  (optional)
     * @return Model1VodChannelChannelPlayerPlayerGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelPlayerPlayerGet200Response call1vodChannelChannelPlayerPlayerGet(String channel, String player, String $playerCommaNewOptionsHttp$request, String with) throws RestClientException {
        return call1vodChannelChannelPlayerPlayerGetWithHttpInfo(channel, player, $playerCommaNewOptionsHttp$request, with).getBody();
    }

    /**
     * Returns a player.
     * Returns a player.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param player  (required)
     * @param $playerCommaNewOptionsHttp$request  (required)
     * @param with  (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelPlayerPlayerGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelPlayerPlayerGet200Response> call1vodChannelChannelPlayerPlayerGetWithHttpInfo(String channel, String player, String $playerCommaNewOptionsHttp$request, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelPlayerPlayerGet");
        }
        
        // verify the required parameter 'player' is set
        if (player == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'player' when calling call1vodChannelChannelPlayerPlayerGet");
        }
        
        // verify the required parameter '$playerCommaNewOptionsHttp$request' is set
        if ($playerCommaNewOptionsHttp$request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '$playerCommaNewOptionsHttp$request' when calling call1vodChannelChannelPlayerPlayerGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("player", player);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "$player, new OptionsHttp($request", $playerCommaNewOptionsHttp$request));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelPlayerPlayerGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelPlayerPlayerGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/player/{player}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Updates a player.
     * Updates a player.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param player  (required)
     * @param body  (required)
     * @return Model1VodChannelChannelPlayerPlayerGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelPlayerPlayerGet200Response call1vodChannelChannelPlayerPlayerPut(String channel, String player, Object body) throws RestClientException {
        return call1vodChannelChannelPlayerPlayerPutWithHttpInfo(channel, player, body).getBody();
    }

    /**
     * Updates a player.
     * Updates a player.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param player  (required)
     * @param body  (required)
     * @return ResponseEntity&lt;Model1VodChannelChannelPlayerPlayerGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelPlayerPlayerGet200Response> call1vodChannelChannelPlayerPlayerPutWithHttpInfo(String channel, String player, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelPlayerPlayerPut");
        }
        
        // verify the required parameter 'player' is set
        if (player == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'player' when calling call1vodChannelChannelPlayerPlayerPut");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling call1vodChannelChannelPlayerPlayerPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("player", player);

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

        ParameterizedTypeReference<Model1VodChannelChannelPlayerPlayerGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelPlayerPlayerGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/player/{player}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Lists all playlists.
     * Lists all playlists.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param with  (optional)
     * @return Model1VodChannelChannelFolderFolderPlaylistGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelFolderFolderPlaylistGet200Response call1vodChannelChannelPlaylistGet(String channel, String with) throws RestClientException {
        return call1vodChannelChannelPlaylistGetWithHttpInfo(channel, with).getBody();
    }

    /**
     * Lists all playlists.
     * Lists all playlists.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param with  (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelFolderFolderPlaylistGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelFolderFolderPlaylistGet200Response> call1vodChannelChannelPlaylistGetWithHttpInfo(String channel, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelPlaylistGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelFolderFolderPlaylistGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelFolderFolderPlaylistGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/playlist", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns a playlist.
     * Returns a playlist.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param playlist  (required)
     * @param $playlistCommaNewOptionsHttp$request  (required)
     * @param with  (optional)
     * @return Model1VodChannelChannelPlaylistPlaylistGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelPlaylistPlaylistGet200Response call1vodChannelChannelPlaylistPlaylistGet(String channel, String playlist, String $playlistCommaNewOptionsHttp$request, String with) throws RestClientException {
        return call1vodChannelChannelPlaylistPlaylistGetWithHttpInfo(channel, playlist, $playlistCommaNewOptionsHttp$request, with).getBody();
    }

    /**
     * Returns a playlist.
     * Returns a playlist.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param playlist  (required)
     * @param $playlistCommaNewOptionsHttp$request  (required)
     * @param with  (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelPlaylistPlaylistGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelPlaylistPlaylistGet200Response> call1vodChannelChannelPlaylistPlaylistGetWithHttpInfo(String channel, String playlist, String $playlistCommaNewOptionsHttp$request, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelPlaylistPlaylistGet");
        }
        
        // verify the required parameter 'playlist' is set
        if (playlist == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'playlist' when calling call1vodChannelChannelPlaylistPlaylistGet");
        }
        
        // verify the required parameter '$playlistCommaNewOptionsHttp$request' is set
        if ($playlistCommaNewOptionsHttp$request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '$playlistCommaNewOptionsHttp$request' when calling call1vodChannelChannelPlaylistPlaylistGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("playlist", playlist);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "$playlist, new OptionsHttp($request", $playlistCommaNewOptionsHttp$request));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelPlaylistPlaylistGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelPlaylistPlaylistGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/playlist/{playlist}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Creates a new share to a given target.
     * Creates a share, returns a share having id in order to build this url : https://api.vod2.infomaniak.com/res/embed/{{ ID }}.html
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param model1VodChannelChannelSharePostRequest  (required)
     * @return Model1VodChannelChannelSharePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelSharePost200Response call1vodChannelChannelSharePost(String channel, Model1VodChannelChannelSharePostRequest model1VodChannelChannelSharePostRequest) throws RestClientException {
        return call1vodChannelChannelSharePostWithHttpInfo(channel, model1VodChannelChannelSharePostRequest).getBody();
    }

    /**
     * Creates a new share to a given target.
     * Creates a share, returns a share having id in order to build this url : https://api.vod2.infomaniak.com/res/embed/{{ ID }}.html
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param model1VodChannelChannelSharePostRequest  (required)
     * @return ResponseEntity&lt;Model1VodChannelChannelSharePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelSharePost200Response> call1vodChannelChannelSharePostWithHttpInfo(String channel, Model1VodChannelChannelSharePostRequest model1VodChannelChannelSharePostRequest) throws RestClientException {
        Object localVarPostBody = model1VodChannelChannelSharePostRequest;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelSharePost");
        }
        
        // verify the required parameter 'model1VodChannelChannelSharePostRequest' is set
        if (model1VodChannelChannelSharePostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model1VodChannelChannelSharePostRequest' when calling call1vodChannelChannelSharePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

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

        ParameterizedTypeReference<Model1VodChannelChannelSharePost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelSharePost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/share", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns a share.
     * Returns a share.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param share  (required)
     * @param $shareCommaNewOptionsHttp$request  (required)
     * @param with  (optional)
     * @return Model1VodChannelChannelShareShareGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareGet200Response call1vodChannelChannelShareShareGet(String channel, String share, String $shareCommaNewOptionsHttp$request, String with) throws RestClientException {
        return call1vodChannelChannelShareShareGetWithHttpInfo(channel, share, $shareCommaNewOptionsHttp$request, with).getBody();
    }

    /**
     * Returns a share.
     * Returns a share.
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param share  (required)
     * @param $shareCommaNewOptionsHttp$request  (required)
     * @param with  (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareGet200Response> call1vodChannelChannelShareShareGetWithHttpInfo(String channel, String share, String $shareCommaNewOptionsHttp$request, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelShareShareGet");
        }
        
        // verify the required parameter 'share' is set
        if (share == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'share' when calling call1vodChannelChannelShareShareGet");
        }
        
        // verify the required parameter '$shareCommaNewOptionsHttp$request' is set
        if ($shareCommaNewOptionsHttp$request == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '$shareCommaNewOptionsHttp$request' when calling call1vodChannelChannelShareShareGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("share", share);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "$share, new OptionsHttp($request", $shareCommaNewOptionsHttp$request));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/share/{share}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * token
     * token
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param share  (required)
     * @param body  (required)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelShareShareTokenPost(String channel, String share, Object body) throws RestClientException {
        return call1vodChannelChannelShareShareTokenPostWithHttpInfo(channel, share, body).getBody();
    }

    /**
     * token
     * token
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param share  (required)
     * @param body  (required)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelShareShareTokenPostWithHttpInfo(String channel, String share, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelShareShareTokenPost");
        }
        
        // verify the required parameter 'share' is set
        if (share == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'share' when calling call1vodChannelChannelShareShareTokenPost");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling call1vodChannelChannelShareShareTokenPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("share", share);

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

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/share/{share}/token", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * avg time
     * avg time
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String call1vodChannelChannelStatisticsAvgTimeGet(String channel, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsAvgTimeGetWithHttpInfo(channel, from).getBody();
    }

    /**
     * avg time
     * avg time
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> call1vodChannelChannelStatisticsAvgTimeGetWithHttpInfo(String channel, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsAvgTimeGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<String> localReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/avg_time", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * consumption encoding histogram
     * consumption encoding histogram
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @param per Histogram grouped by 1d,1h,1m .. (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsConsumptionEncodingsHistogramGet(String channel, String from, String per) throws RestClientException {
        return call1vodChannelChannelStatisticsConsumptionEncodingsHistogramGetWithHttpInfo(channel, from, per).getBody();
    }

    /**
     * consumption encoding histogram
     * consumption encoding histogram
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @param per Histogram grouped by 1d,1h,1m .. (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsConsumptionEncodingsHistogramGetWithHttpInfo(String channel, String from, String per) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsConsumptionEncodingsHistogramGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per", per));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/consumption/encodings/histogram", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * consumption
     * consumption
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String call1vodChannelChannelStatisticsConsumptionGet(String channel, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsConsumptionGetWithHttpInfo(channel, from).getBody();
    }

    /**
     * consumption
     * consumption
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> call1vodChannelChannelStatisticsConsumptionGetWithHttpInfo(String channel, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsConsumptionGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<String> localReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/consumption", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * top-media
     * top-media
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaGet(String channel, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsMediaGetWithHttpInfo(channel, from).getBody();
    }

    /**
     * top-media
     * top-media
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsMediaGetWithHttpInfo(String channel, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsMediaGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/media", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * media consumption encoding histogram
     * media consumption encoding histogram
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param from begin date timestamp (optional)
     * @param per Histogram grouped by 1d,1h,1m .. (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaConsumptionEncodingsHistogramGet(String channel, String media, String from, String per) throws RestClientException {
        return call1vodChannelChannelStatisticsMediaMediaConsumptionEncodingsHistogramGetWithHttpInfo(channel, media, from, per).getBody();
    }

    /**
     * media consumption encoding histogram
     * media consumption encoding histogram
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param from begin date timestamp (optional)
     * @param per Histogram grouped by 1d,1h,1m .. (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsMediaMediaConsumptionEncodingsHistogramGetWithHttpInfo(String channel, String media, String from, String per) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsMediaMediaConsumptionEncodingsHistogramGet");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelStatisticsMediaMediaConsumptionEncodingsHistogramGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per", per));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/media/{media}/consumption/encodings/histogram", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * media consumption
     * media consumption
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaConsumptionGet(String channel, String media, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsMediaMediaConsumptionGetWithHttpInfo(channel, media, from).getBody();
    }

    /**
     * media consumption
     * media consumption
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsMediaMediaConsumptionGetWithHttpInfo(String channel, String media, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsMediaMediaConsumptionGet");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelStatisticsMediaMediaConsumptionGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/media/{media}/consumption", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * media clusters
     * media clusters
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaGeolocationClustersGet(String channel, String media) throws RestClientException {
        return call1vodChannelChannelStatisticsMediaMediaGeolocationClustersGetWithHttpInfo(channel, media).getBody();
    }

    /**
     * media clusters
     * media clusters
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsMediaMediaGeolocationClustersGetWithHttpInfo(String channel, String media) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsMediaMediaGeolocationClustersGet");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelStatisticsMediaMediaGeolocationClustersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

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

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/media/{media}/geolocation/clusters", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * media countries
     * media countries
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaGeolocationCountriesGet(String channel, String media) throws RestClientException {
        return call1vodChannelChannelStatisticsMediaMediaGeolocationCountriesGetWithHttpInfo(channel, media).getBody();
    }

    /**
     * media countries
     * media countries
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsMediaMediaGeolocationCountriesGetWithHttpInfo(String channel, String media) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsMediaMediaGeolocationCountriesGet");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelStatisticsMediaMediaGeolocationCountriesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

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

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/media/{media}/geolocation/countries", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * media browsers shares
     * media browsers shares
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaTechnologiesBrowsersSharesGet(String channel, String media, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsMediaMediaTechnologiesBrowsersSharesGetWithHttpInfo(channel, media, from).getBody();
    }

    /**
     * media browsers shares
     * media browsers shares
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsMediaMediaTechnologiesBrowsersSharesGetWithHttpInfo(String channel, String media, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsMediaMediaTechnologiesBrowsersSharesGet");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelStatisticsMediaMediaTechnologiesBrowsersSharesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/media/{media}/technologies/browsers/shares", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * media os shares
     * media os shares
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaTechnologiesOsSharesGet(String channel, String media, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsMediaMediaTechnologiesOsSharesGetWithHttpInfo(channel, media, from).getBody();
    }

    /**
     * media os shares
     * media os shares
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsMediaMediaTechnologiesOsSharesGetWithHttpInfo(String channel, String media, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsMediaMediaTechnologiesOsSharesGet");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelStatisticsMediaMediaTechnologiesOsSharesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/media/{media}/technologies/os/shares", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * media playbacks shares
     * media playbacks shares
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaTechnologiesPlaybackSharesGet(String channel, String media, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsMediaMediaTechnologiesPlaybackSharesGetWithHttpInfo(channel, media, from).getBody();
    }

    /**
     * media playbacks shares
     * media playbacks shares
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsMediaMediaTechnologiesPlaybackSharesGetWithHttpInfo(String channel, String media, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsMediaMediaTechnologiesPlaybackSharesGet");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelStatisticsMediaMediaTechnologiesPlaybackSharesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/media/{media}/technologies/playback/shares", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * media players shares
     * media players shares
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaTechnologiesPlayersSharesGet(String channel, String media, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsMediaMediaTechnologiesPlayersSharesGetWithHttpInfo(channel, media, from).getBody();
    }

    /**
     * media players shares
     * media players shares
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsMediaMediaTechnologiesPlayersSharesGetWithHttpInfo(String channel, String media, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsMediaMediaTechnologiesPlayersSharesGet");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelStatisticsMediaMediaTechnologiesPlayersSharesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/media/{media}/technologies/players/shares", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * media viewers encoding histogram
     * media viewers encoding histogram
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaViewersEncodingsHistogramGet(String channel, String media, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsMediaMediaViewersEncodingsHistogramGetWithHttpInfo(channel, media, from).getBody();
    }

    /**
     * media viewers encoding histogram
     * media viewers encoding histogram
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsMediaMediaViewersEncodingsHistogramGetWithHttpInfo(String channel, String media, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsMediaMediaViewersEncodingsHistogramGet");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelStatisticsMediaMediaViewersEncodingsHistogramGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/media/{media}/viewers/encodings/histogram", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * media viewers encoding shares
     * media viewers encoding shares
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaViewersEncodingsSharesGet(String channel, String media, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsMediaMediaViewersEncodingsSharesGetWithHttpInfo(channel, media, from).getBody();
    }

    /**
     * media viewers encoding shares
     * media viewers encoding shares
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsMediaMediaViewersEncodingsSharesGetWithHttpInfo(String channel, String media, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsMediaMediaViewersEncodingsSharesGet");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelStatisticsMediaMediaViewersEncodingsSharesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/media/{media}/viewers/encodings/shares", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * media viewers
     * media viewers
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param medias Valid Media identifiers separated with comma , (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response call1vodChannelChannelStatisticsMediaMediaViewersGet(String channel, String media, String medias, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsMediaMediaViewersGetWithHttpInfo(channel, media, medias, from).getBody();
    }

    /**
     * media viewers
     * media viewers
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param medias Valid Media identifiers separated with comma , (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response> call1vodChannelChannelStatisticsMediaMediaViewersGetWithHttpInfo(String channel, String media, String medias, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsMediaMediaViewersGet");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelStatisticsMediaMediaViewersGet");
        }
        
        // verify the required parameter 'medias' is set
        if (medias == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'medias' when calling call1vodChannelChannelStatisticsMediaMediaViewersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "medias", medias));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/media/{media}/viewers", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * media viewers unique
     * media viewers unique
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param medias Valid Media identifiers separated with comma , (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response call1vodChannelChannelStatisticsMediaMediaViewersUniquesGet(String channel, String media, String medias, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsMediaMediaViewersUniquesGetWithHttpInfo(channel, media, medias, from).getBody();
    }

    /**
     * media viewers unique
     * media viewers unique
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param medias Valid Media identifiers separated with comma , (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response> call1vodChannelChannelStatisticsMediaMediaViewersUniquesGetWithHttpInfo(String channel, String media, String medias, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsMediaMediaViewersUniquesGet");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelStatisticsMediaMediaViewersUniquesGet");
        }
        
        // verify the required parameter 'medias' is set
        if (medias == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'medias' when calling call1vodChannelChannelStatisticsMediaMediaViewersUniquesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "medias", medias));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/media/{media}/viewers/uniques", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * media viewing time encoding histogram
     * media viewing time encoding histogram
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param from begin date timestamp (optional)
     * @param per Histogram grouped by 1d,1h,1m .. (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaViewingEncodingsHistogramGet(String channel, String media, String from, String per) throws RestClientException {
        return call1vodChannelChannelStatisticsMediaMediaViewingEncodingsHistogramGetWithHttpInfo(channel, media, from, per).getBody();
    }

    /**
     * media viewing time encoding histogram
     * media viewing time encoding histogram
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param from begin date timestamp (optional)
     * @param per Histogram grouped by 1d,1h,1m .. (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsMediaMediaViewingEncodingsHistogramGetWithHttpInfo(String channel, String media, String from, String per) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsMediaMediaViewingEncodingsHistogramGet");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelStatisticsMediaMediaViewingEncodingsHistogramGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per", per));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/media/{media}/viewing/encodings/histogram", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * media viewing time
     * media viewing time
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsMediaMediaViewingGet(String channel, String media, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsMediaMediaViewingGetWithHttpInfo(channel, media, from).getBody();
    }

    /**
     * media viewing time
     * media viewing time
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param media  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsMediaMediaViewingGetWithHttpInfo(String channel, String media, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsMediaMediaViewingGet");
        }
        
        // verify the required parameter 'media' is set
        if (media == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'media' when calling call1vodChannelChannelStatisticsMediaMediaViewingGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);
        uriVariables.put("media", media);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/media/{media}/viewing", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * browsers shares
     * browsers shares
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsTechnologiesBrowsersSharesGet(String channel, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsTechnologiesBrowsersSharesGetWithHttpInfo(channel, from).getBody();
    }

    /**
     * browsers shares
     * browsers shares
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsTechnologiesBrowsersSharesGetWithHttpInfo(String channel, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsTechnologiesBrowsersSharesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/technologies/browsers/shares", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * os shares
     * os shares
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsTechnologiesOsSharesGet(String channel, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsTechnologiesOsSharesGetWithHttpInfo(channel, from).getBody();
    }

    /**
     * os shares
     * os shares
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsTechnologiesOsSharesGetWithHttpInfo(String channel, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsTechnologiesOsSharesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/technologies/os/shares", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * playbacks shares
     * playbacks shares
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsTechnologiesPlaybackSharesGet(String channel, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsTechnologiesPlaybackSharesGetWithHttpInfo(channel, from).getBody();
    }

    /**
     * playbacks shares
     * playbacks shares
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsTechnologiesPlaybackSharesGetWithHttpInfo(String channel, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsTechnologiesPlaybackSharesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/technologies/playback/shares", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * players shares
     * players shares
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsTechnologiesPlayersSharesGet(String channel, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsTechnologiesPlayersSharesGetWithHttpInfo(channel, from).getBody();
    }

    /**
     * players shares
     * players shares
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsTechnologiesPlayersSharesGetWithHttpInfo(String channel, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsTechnologiesPlayersSharesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/technologies/players/shares", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * time ip
     * time ip
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * <p><b>500</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String call1vodChannelChannelStatisticsTimeIpGet(String channel, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsTimeIpGetWithHttpInfo(channel, from).getBody();
    }

    /**
     * time ip
     * time ip
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * <p><b>500</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> call1vodChannelChannelStatisticsTimeIpGetWithHttpInfo(String channel, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsTimeIpGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<String> localReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/time_ip", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * viewers encoding histogram
     * viewers encoding histogram
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsViewersEncodingsHistogramGet(String channel, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsViewersEncodingsHistogramGetWithHttpInfo(channel, from).getBody();
    }

    /**
     * viewers encoding histogram
     * viewers encoding histogram
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsViewersEncodingsHistogramGetWithHttpInfo(String channel, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsViewersEncodingsHistogramGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/viewers/encodings/histogram", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * viewers encoding shares
     * viewers encoding shares
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsViewersEncodingsSharesGet(String channel, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsViewersEncodingsSharesGetWithHttpInfo(channel, from).getBody();
    }

    /**
     * viewers encoding shares
     * viewers encoding shares
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsViewersEncodingsSharesGetWithHttpInfo(String channel, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsViewersEncodingsSharesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/viewers/encodings/shares", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * viewers
     * viewers
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsViewersGet(String channel, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsViewersGetWithHttpInfo(channel, from).getBody();
    }

    /**
     * viewers
     * viewers
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsViewersGetWithHttpInfo(String channel, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsViewersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/viewers", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * viewers histogram
     * viewers histogram
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @param per Histogram grouped by 1d,1h,1m .. (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsViewersHistogramGet(String channel, String from, String per) throws RestClientException {
        return call1vodChannelChannelStatisticsViewersHistogramGetWithHttpInfo(channel, from, per).getBody();
    }

    /**
     * viewers histogram
     * viewers histogram
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @param per Histogram grouped by 1d,1h,1m .. (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsViewersHistogramGetWithHttpInfo(String channel, String from, String per) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsViewersHistogramGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per", per));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/viewers/histogram", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * viewers medias bulk
     * viewers medias bulk
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param medias Valid Media identifiers separated with comma , (required)
     * @param from begin date timestamp (optional)
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String call1vodChannelChannelStatisticsViewersMediasGet(String channel, String medias, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsViewersMediasGetWithHttpInfo(channel, medias, from).getBody();
    }

    /**
     * viewers medias bulk
     * viewers medias bulk
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param medias Valid Media identifiers separated with comma , (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> call1vodChannelChannelStatisticsViewersMediasGetWithHttpInfo(String channel, String medias, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsViewersMediasGet");
        }
        
        // verify the required parameter 'medias' is set
        if (medias == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'medias' when calling call1vodChannelChannelStatisticsViewersMediasGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "medias", medias));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<String> localReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/viewers/medias", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * viewers unique
     * viewers unique
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsViewersUniquesGet(String channel, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsViewersUniquesGetWithHttpInfo(channel, from).getBody();
    }

    /**
     * viewers unique
     * viewers unique
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsViewersUniquesGetWithHttpInfo(String channel, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsViewersUniquesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/viewers/uniques", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * viewers medias unique bulk
     * viewers medias unique bulk
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param medias Valid Media identifiers separated with comma , (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response call1vodChannelChannelStatisticsViewersUniquesMediasGet(String channel, String medias, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsViewersUniquesMediasGetWithHttpInfo(channel, medias, from).getBody();
    }

    /**
     * viewers medias unique bulk
     * viewers medias unique bulk
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param medias Valid Media identifiers separated with comma , (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response> call1vodChannelChannelStatisticsViewersUniquesMediasGetWithHttpInfo(String channel, String medias, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsViewersUniquesMediasGet");
        }
        
        // verify the required parameter 'medias' is set
        if (medias == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'medias' when calling call1vodChannelChannelStatisticsViewersUniquesMediasGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "medias", medias));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelStatisticsMediaMediaViewersGet200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/viewers/uniques/medias", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * viewing time encoding histogram
     * viewing time encoding histogram
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsViewingEncodingsHistogramGet(String channel, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsViewingEncodingsHistogramGetWithHttpInfo(channel, from).getBody();
    }

    /**
     * viewing time encoding histogram
     * viewing time encoding histogram
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsViewingEncodingsHistogramGetWithHttpInfo(String channel, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsViewingEncodingsHistogramGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/viewing/encodings/histogram", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * viewing time
     * viewing time
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return Model1VodChannelChannelShareShareTokenPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelShareShareTokenPost200Response call1vodChannelChannelStatisticsViewingGet(String channel, String from) throws RestClientException {
        return call1vodChannelChannelStatisticsViewingGetWithHttpInfo(channel, from).getBody();
    }

    /**
     * viewing time
     * viewing time
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param from begin date timestamp (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelShareShareTokenPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelShareShareTokenPost200Response> call1vodChannelChannelStatisticsViewingGetWithHttpInfo(String channel, String from) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelStatisticsViewingGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelShareShareTokenPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/statistics/viewing", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * store
     * Creates a new upload
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param model1VodChannelChannelUploadPostRequest  (required)
     * @param digest Digest: algorythmn checksum (optional)
     * @return Model1VodChannelChannelUploadPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1VodChannelChannelUploadPost200Response call1vodChannelChannelUploadPost(String channel, Model1VodChannelChannelUploadPostRequest model1VodChannelChannelUploadPostRequest, String digest) throws RestClientException {
        return call1vodChannelChannelUploadPostWithHttpInfo(channel, model1VodChannelChannelUploadPostRequest, digest).getBody();
    }

    /**
     * store
     * Creates a new upload
     * <p><b>200</b> - Successful response
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param channel  (required)
     * @param model1VodChannelChannelUploadPostRequest  (required)
     * @param digest Digest: algorythmn checksum (optional)
     * @return ResponseEntity&lt;Model1VodChannelChannelUploadPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1VodChannelChannelUploadPost200Response> call1vodChannelChannelUploadPostWithHttpInfo(String channel, Model1VodChannelChannelUploadPostRequest model1VodChannelChannelUploadPostRequest, String digest) throws RestClientException {
        Object localVarPostBody = model1VodChannelChannelUploadPostRequest;
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling call1vodChannelChannelUploadPost");
        }
        
        // verify the required parameter 'model1VodChannelChannelUploadPostRequest' is set
        if (model1VodChannelChannelUploadPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'model1VodChannelChannelUploadPostRequest' when calling call1vodChannelChannelUploadPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channel", channel);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (digest != null)
        localVarHeaderParams.add("Digest", apiClient.parameterToString(digest));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "file"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1VodChannelChannelUploadPost200Response> localReturnType = new ParameterizedTypeReference<Model1VodChannelChannelUploadPost200Response>() {};
        return apiClient.invokeAPI("/1/vod/channel/{channel}/upload", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
