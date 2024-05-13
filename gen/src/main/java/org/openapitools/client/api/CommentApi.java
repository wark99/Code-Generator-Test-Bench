package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiCommentsPutRequest;
import org.openapitools.client.model.ApiPlaylistsUserIdTimeSortSortPagePageGet204Response;
import org.openapitools.client.model.Comment;
import org.openapitools.client.model.CommentInfor;
import org.openapitools.client.model.CommentInforReturn;
import org.openapitools.client.model.MessageBad;
import org.openapitools.client.model.MessageGood;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:03.133651353Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CommentApi {
    private ApiClient apiClient;

    public CommentApi() {
        this(new ApiClient());
    }

    public CommentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete your comment
     * 
     * <p><b>200</b> - Delete
     * <p><b>400</b> - Delete
     * @param id  (required)
     * @return MessageGood
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MessageGood apiCommentsIdDelete(Integer id) throws RestClientException {
        return apiCommentsIdDeleteWithHttpInfo(id).getBody();
    }

    /**
     * Delete your comment
     * 
     * <p><b>200</b> - Delete
     * <p><b>400</b> - Delete
     * @param id  (required)
     * @return ResponseEntity&lt;MessageGood&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MessageGood> apiCommentsIdDeleteWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiCommentsIdDelete");
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<MessageGood> localReturnType = new ParameterizedTypeReference<MessageGood>() {};
        return apiClient.invokeAPI("/api/comments/{id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Make new comment
     * 
     * <p><b>201</b> - Make new comment
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Dont have permission
     * @param comment A new comment (required)
     * @return CommentInfor
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommentInfor apiCommentsPost(Comment comment) throws RestClientException {
        return apiCommentsPostWithHttpInfo(comment).getBody();
    }

    /**
     * Make new comment
     * 
     * <p><b>201</b> - Make new comment
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Dont have permission
     * @param comment A new comment (required)
     * @return ResponseEntity&lt;CommentInfor&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommentInfor> apiCommentsPostWithHttpInfo(Comment comment) throws RestClientException {
        Object localVarPostBody = comment;
        
        // verify the required parameter 'comment' is set
        if (comment == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'comment' when calling apiCommentsPost");
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

        ParameterizedTypeReference<CommentInfor> localReturnType = new ParameterizedTypeReference<CommentInfor>() {};
        return apiClient.invokeAPI("/api/comments", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update comment
     * 
     * <p><b>200</b> - Updated comment
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Dont have permission
     * @param apiCommentsPutRequest The comment you update must come from your account (required)
     * @return ApiPlaylistsUserIdTimeSortSortPagePageGet204Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiPlaylistsUserIdTimeSortSortPagePageGet204Response apiCommentsPut(ApiCommentsPutRequest apiCommentsPutRequest) throws RestClientException {
        return apiCommentsPutWithHttpInfo(apiCommentsPutRequest).getBody();
    }

    /**
     * Update comment
     * 
     * <p><b>200</b> - Updated comment
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Dont have permission
     * @param apiCommentsPutRequest The comment you update must come from your account (required)
     * @return ResponseEntity&lt;ApiPlaylistsUserIdTimeSortSortPagePageGet204Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiPlaylistsUserIdTimeSortSortPagePageGet204Response> apiCommentsPutWithHttpInfo(ApiCommentsPutRequest apiCommentsPutRequest) throws RestClientException {
        Object localVarPostBody = apiCommentsPutRequest;
        
        // verify the required parameter 'apiCommentsPutRequest' is set
        if (apiCommentsPutRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'apiCommentsPutRequest' when calling apiCommentsPut");
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

        ParameterizedTypeReference<ApiPlaylistsUserIdTimeSortSortPagePageGet204Response> localReturnType = new ParameterizedTypeReference<ApiPlaylistsUserIdTimeSortSortPagePageGet204Response>() {};
        return apiClient.invokeAPI("/api/comments", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Read comment from user and playlist, sort by playlist
     * 
     * <p><b>200</b> - Read comment list from user and playlist
     * <p><b>204</b> - No comment
     * <p><b>400</b> - Bad request
     * @param userId 0 is from all user/playlist, 1+ is from some user/playlist (required)
     * @param sort DESC or ASC to sort the comment (required)
     * @param playlistId 0 is from all user/playlist, 1+ is from some user/playlist (required)
     * @param page Pagination (optional)
     * @return CommentInforReturn
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommentInforReturn apiCommentsUserIdPlaylistIdPlaylistsortsortpagepageGet(Integer userId, String sort, Integer playlistId, Integer page) throws RestClientException {
        return apiCommentsUserIdPlaylistIdPlaylistsortsortpagepageGetWithHttpInfo(userId, sort, playlistId, page).getBody();
    }

    /**
     * Read comment from user and playlist, sort by playlist
     * 
     * <p><b>200</b> - Read comment list from user and playlist
     * <p><b>204</b> - No comment
     * <p><b>400</b> - Bad request
     * @param userId 0 is from all user/playlist, 1+ is from some user/playlist (required)
     * @param sort DESC or ASC to sort the comment (required)
     * @param playlistId 0 is from all user/playlist, 1+ is from some user/playlist (required)
     * @param page Pagination (optional)
     * @return ResponseEntity&lt;CommentInforReturn&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommentInforReturn> apiCommentsUserIdPlaylistIdPlaylistsortsortpagepageGetWithHttpInfo(Integer userId, String sort, Integer playlistId, Integer page) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling apiCommentsUserIdPlaylistIdPlaylistsortsortpagepageGet");
        }
        
        // verify the required parameter 'sort' is set
        if (sort == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sort' when calling apiCommentsUserIdPlaylistIdPlaylistsortsortpagepageGet");
        }
        
        // verify the required parameter 'playlistId' is set
        if (playlistId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'playlistId' when calling apiCommentsUserIdPlaylistIdPlaylistsortsortpagepageGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("playlistId", playlistId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<CommentInforReturn> localReturnType = new ParameterizedTypeReference<CommentInforReturn>() {};
        return apiClient.invokeAPI("/api/comments/{userId}/{playlistId}/playlist?sort={sort}&page={page}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Read comment from user and playlist, sort by time
     * 
     * <p><b>200</b> - Read comment list from user and playlist
     * <p><b>204</b> - No comment
     * <p><b>400</b> - Bad request
     * @param userId 0 is from all user/playlist, 1+ is from some user/playlist (required)
     * @param sort DESC or ASC to sort the comment (required)
     * @param playlistId 0 is from all user/playlist, 1+ is from some user/playlist (required)
     * @param page Pagination (optional)
     * @return CommentInforReturn
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommentInforReturn apiCommentsUserIdPlaylistIdTimesortsortpagepageGet(Integer userId, String sort, Integer playlistId, Integer page) throws RestClientException {
        return apiCommentsUserIdPlaylistIdTimesortsortpagepageGetWithHttpInfo(userId, sort, playlistId, page).getBody();
    }

    /**
     * Read comment from user and playlist, sort by time
     * 
     * <p><b>200</b> - Read comment list from user and playlist
     * <p><b>204</b> - No comment
     * <p><b>400</b> - Bad request
     * @param userId 0 is from all user/playlist, 1+ is from some user/playlist (required)
     * @param sort DESC or ASC to sort the comment (required)
     * @param playlistId 0 is from all user/playlist, 1+ is from some user/playlist (required)
     * @param page Pagination (optional)
     * @return ResponseEntity&lt;CommentInforReturn&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommentInforReturn> apiCommentsUserIdPlaylistIdTimesortsortpagepageGetWithHttpInfo(Integer userId, String sort, Integer playlistId, Integer page) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling apiCommentsUserIdPlaylistIdTimesortsortpagepageGet");
        }
        
        // verify the required parameter 'sort' is set
        if (sort == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sort' when calling apiCommentsUserIdPlaylistIdTimesortsortpagepageGet");
        }
        
        // verify the required parameter 'playlistId' is set
        if (playlistId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'playlistId' when calling apiCommentsUserIdPlaylistIdTimesortsortpagepageGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("playlistId", playlistId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<CommentInforReturn> localReturnType = new ParameterizedTypeReference<CommentInforReturn>() {};
        return apiClient.invokeAPI("/api/comments/{userId}/{playlistId}/time?sort={sort}&page={page}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Read comment from user and playlist, sort by user
     * 
     * <p><b>200</b> - Read comment list from user and playlist
     * <p><b>204</b> - No comment
     * <p><b>400</b> - Bad request
     * @param userId 0 is from all user/playlist, 1+ is from some user/playlist (required)
     * @param sort DESC or ASC to sort the comment (required)
     * @param playlistId 0 is from all user/playlist, 1+ is from some user/playlist (required)
     * @param page Pagination (optional)
     * @return CommentInforReturn
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommentInforReturn apiCommentsUserIdPlaylistIdUsersortsortpagepageGet(Integer userId, String sort, Integer playlistId, Integer page) throws RestClientException {
        return apiCommentsUserIdPlaylistIdUsersortsortpagepageGetWithHttpInfo(userId, sort, playlistId, page).getBody();
    }

    /**
     * Read comment from user and playlist, sort by user
     * 
     * <p><b>200</b> - Read comment list from user and playlist
     * <p><b>204</b> - No comment
     * <p><b>400</b> - Bad request
     * @param userId 0 is from all user/playlist, 1+ is from some user/playlist (required)
     * @param sort DESC or ASC to sort the comment (required)
     * @param playlistId 0 is from all user/playlist, 1+ is from some user/playlist (required)
     * @param page Pagination (optional)
     * @return ResponseEntity&lt;CommentInforReturn&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommentInforReturn> apiCommentsUserIdPlaylistIdUsersortsortpagepageGetWithHttpInfo(Integer userId, String sort, Integer playlistId, Integer page) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling apiCommentsUserIdPlaylistIdUsersortsortpagepageGet");
        }
        
        // verify the required parameter 'sort' is set
        if (sort == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sort' when calling apiCommentsUserIdPlaylistIdUsersortsortpagepageGet");
        }
        
        // verify the required parameter 'playlistId' is set
        if (playlistId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'playlistId' when calling apiCommentsUserIdPlaylistIdUsersortsortpagepageGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("playlistId", playlistId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<CommentInforReturn> localReturnType = new ParameterizedTypeReference<CommentInforReturn>() {};
        return apiClient.invokeAPI("/api/comments/{userId}/{playlistId}/user?sort={sort}&page={page}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
