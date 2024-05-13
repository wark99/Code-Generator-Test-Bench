package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response;
import org.openapitools.client.model.ApiLikesUserIdUserSortSortPagePageGet200Response;
import org.openapitools.client.model.ApiPlaylistsUserIdTimeSortSortPagePageGet204Response;
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
public class LikeApi {
    private ApiClient apiClient;

    public LikeApi() {
        this(new ApiClient());
    }

    public LikeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * remove your like
     * 
     * <p><b>200</b> - Delete successfully
     * <p><b>400</b> - Bad request
     * @param likeId If comment is not from user, will fail (required)
     * @return MessageGood
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MessageGood apiLikesIdDelete(Integer likeId) throws RestClientException {
        return apiLikesIdDeleteWithHttpInfo(likeId).getBody();
    }

    /**
     * remove your like
     * 
     * <p><b>200</b> - Delete successfully
     * <p><b>400</b> - Bad request
     * @param likeId If comment is not from user, will fail (required)
     * @return ResponseEntity&lt;MessageGood&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MessageGood> apiLikesIdDeleteWithHttpInfo(Integer likeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'likeId' is set
        if (likeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'likeId' when calling apiLikesIdDelete");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "likeId", likeId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<MessageGood> localReturnType = new ParameterizedTypeReference<MessageGood>() {};
        return apiClient.invokeAPI("/api/likes/{id}", HttpMethod.DELETE, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Like from users to a playlist, sort by user
     * 
     * <p><b>200</b> - Read like of a playlist from users, sort by user
     * <p><b>204</b> - No like
     * <p><b>400</b> - Bad request
     * @param playlistId 0 is from all user, 1+ is from some user (required)
     * @param sort DESC or ASC to sort the comment (required)
     * @param page Pagination (optional)
     * @return ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response apiLikesPlaylistIdPlaylistsortsortpagepageGet(Integer playlistId, String sort, Integer page) throws RestClientException {
        return apiLikesPlaylistIdPlaylistsortsortpagepageGetWithHttpInfo(playlistId, sort, page).getBody();
    }

    /**
     * Like from users to a playlist, sort by user
     * 
     * <p><b>200</b> - Read like of a playlist from users, sort by user
     * <p><b>204</b> - No like
     * <p><b>400</b> - Bad request
     * @param playlistId 0 is from all user, 1+ is from some user (required)
     * @param sort DESC or ASC to sort the comment (required)
     * @param page Pagination (optional)
     * @return ResponseEntity&lt;ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response> apiLikesPlaylistIdPlaylistsortsortpagepageGetWithHttpInfo(Integer playlistId, String sort, Integer page) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'playlistId' is set
        if (playlistId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'playlistId' when calling apiLikesPlaylistIdPlaylistsortsortpagepageGet");
        }
        
        // verify the required parameter 'sort' is set
        if (sort == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sort' when calling apiLikesPlaylistIdPlaylistsortsortpagepageGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
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

        ParameterizedTypeReference<ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response> localReturnType = new ParameterizedTypeReference<ApiLikesPlaylistIdPlaylistSortSortPagePageGet200Response>() {};
        return apiClient.invokeAPI("/api/likes/{playlistId}/playlist?sort={sort}&page={page}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Like a playlist
     * 
     * <p><b>201</b> - Like a playlist
     * <p><b>400</b> - Bad request
     * @param playlistId 0 is from all user, 1+ is from some user (required)
     * @return MessageBad
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MessageBad apiLikesPost(Integer playlistId) throws RestClientException {
        return apiLikesPostWithHttpInfo(playlistId).getBody();
    }

    /**
     * Like a playlist
     * 
     * <p><b>201</b> - Like a playlist
     * <p><b>400</b> - Bad request
     * @param playlistId 0 is from all user, 1+ is from some user (required)
     * @return ResponseEntity&lt;MessageBad&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MessageBad> apiLikesPostWithHttpInfo(Integer playlistId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'playlistId' is set
        if (playlistId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'playlistId' when calling apiLikesPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("playlistId", playlistId);

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

        ParameterizedTypeReference<MessageBad> localReturnType = new ParameterizedTypeReference<MessageBad>() {};
        return apiClient.invokeAPI("/api/likes", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Like from a user to many playlists
     * 
     * <p><b>200</b> - Read playlist from a user like
     * <p><b>204</b> - No like
     * <p><b>400</b> - Bad request
     * @param userId 0 is from all user, 1+ is from some user (required)
     * @param sort DESC or ASC to sort the comment (required)
     * @param page Pagination (optional)
     * @return ApiLikesUserIdUserSortSortPagePageGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiLikesUserIdUserSortSortPagePageGet200Response apiLikesUserIdUsersortsortpagepageGet(Integer userId, String sort, Integer page) throws RestClientException {
        return apiLikesUserIdUsersortsortpagepageGetWithHttpInfo(userId, sort, page).getBody();
    }

    /**
     * Like from a user to many playlists
     * 
     * <p><b>200</b> - Read playlist from a user like
     * <p><b>204</b> - No like
     * <p><b>400</b> - Bad request
     * @param userId 0 is from all user, 1+ is from some user (required)
     * @param sort DESC or ASC to sort the comment (required)
     * @param page Pagination (optional)
     * @return ResponseEntity&lt;ApiLikesUserIdUserSortSortPagePageGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiLikesUserIdUserSortSortPagePageGet200Response> apiLikesUserIdUsersortsortpagepageGetWithHttpInfo(Integer userId, String sort, Integer page) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling apiLikesUserIdUsersortsortpagepageGet");
        }
        
        // verify the required parameter 'sort' is set
        if (sort == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sort' when calling apiLikesUserIdUsersortsortpagepageGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

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

        ParameterizedTypeReference<ApiLikesUserIdUserSortSortPagePageGet200Response> localReturnType = new ParameterizedTypeReference<ApiLikesUserIdUserSortSortPagePageGet200Response>() {};
        return apiClient.invokeAPI("/api/likes/{userId}/user?sort={sort}&page={page}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
