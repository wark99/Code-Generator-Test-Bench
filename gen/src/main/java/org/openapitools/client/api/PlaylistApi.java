package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiPlaylistsPost201Response;
import org.openapitools.client.model.ApiPlaylistsUserIdTimeSortSortPagePageGet204Response;
import org.openapitools.client.model.MessageBad;
import org.openapitools.client.model.MessageGood;
import org.openapitools.client.model.Playlist;
import org.openapitools.client.model.PlaylistInfor;
import org.openapitools.client.model.PlaylistInforReturn;

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
public class PlaylistApi {
    private ApiClient apiClient;

    public PlaylistApi() {
        this(new ApiClient());
    }

    public PlaylistApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete your playlist
     * Delete playlist
     * <p><b>200</b> - Delete
     * <p><b>404</b> - Dont have permission
     * @param id 0 is from all user, 1+ is from some user (required)
     * @return MessageGood
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MessageGood apiPlaylistsIdDelete(Integer id) throws RestClientException {
        return apiPlaylistsIdDeleteWithHttpInfo(id).getBody();
    }

    /**
     * Delete your playlist
     * Delete playlist
     * <p><b>200</b> - Delete
     * <p><b>404</b> - Dont have permission
     * @param id 0 is from all user, 1+ is from some user (required)
     * @return ResponseEntity&lt;MessageGood&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MessageGood> apiPlaylistsIdDeleteWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiPlaylistsIdDelete");
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
        return apiClient.invokeAPI("/api/playlists/{id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete your playlist
     * Delete playlist
     * <p><b>200</b> - Playlist with id
     * <p><b>404</b> - Dont have permission
     * @param id 0 is from all user, 1+ is from some user (required)
     * @return PlaylistInfor
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PlaylistInfor apiPlaylistsIdGet(Integer id) throws RestClientException {
        return apiPlaylistsIdGetWithHttpInfo(id).getBody();
    }

    /**
     * Delete your playlist
     * Delete playlist
     * <p><b>200</b> - Playlist with id
     * <p><b>404</b> - Dont have permission
     * @param id 0 is from all user, 1+ is from some user (required)
     * @return ResponseEntity&lt;PlaylistInfor&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PlaylistInfor> apiPlaylistsIdGetWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling apiPlaylistsIdGet");
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

        ParameterizedTypeReference<PlaylistInfor> localReturnType = new ParameterizedTypeReference<PlaylistInfor>() {};
        return apiClient.invokeAPI("/api/playlists/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Make Playlist
     * 
     * <p><b>201</b> - New playlist
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Dont have permission
     * @param playlist Must have the playlistId, name, a list of song that is valid youtube id, and a valid link to image (required)
     * @return ApiPlaylistsPost201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiPlaylistsPost201Response apiPlaylistsPost(Playlist playlist) throws RestClientException {
        return apiPlaylistsPostWithHttpInfo(playlist).getBody();
    }

    /**
     * Make Playlist
     * 
     * <p><b>201</b> - New playlist
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Dont have permission
     * @param playlist Must have the playlistId, name, a list of song that is valid youtube id, and a valid link to image (required)
     * @return ResponseEntity&lt;ApiPlaylistsPost201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiPlaylistsPost201Response> apiPlaylistsPostWithHttpInfo(Playlist playlist) throws RestClientException {
        Object localVarPostBody = playlist;
        
        // verify the required parameter 'playlist' is set
        if (playlist == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'playlist' when calling apiPlaylistsPost");
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

        ParameterizedTypeReference<ApiPlaylistsPost201Response> localReturnType = new ParameterizedTypeReference<ApiPlaylistsPost201Response>() {};
        return apiClient.invokeAPI("/api/playlists", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Playlist
     * 
     * <p><b>200</b> - Update playlist
     * <p><b>400</b> - Password not match requirement/Username too short(6-) or too long(32+)
     * <p><b>404</b> - Dont have permission
     * @param playlistInfor Mutate the object + revalidate with middleware(done) is much faster than add/remove one by one(in writing codes) (required)
     * @return MessageGood
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MessageGood apiPlaylistsPut(PlaylistInfor playlistInfor) throws RestClientException {
        return apiPlaylistsPutWithHttpInfo(playlistInfor).getBody();
    }

    /**
     * Update Playlist
     * 
     * <p><b>200</b> - Update playlist
     * <p><b>400</b> - Password not match requirement/Username too short(6-) or too long(32+)
     * <p><b>404</b> - Dont have permission
     * @param playlistInfor Mutate the object + revalidate with middleware(done) is much faster than add/remove one by one(in writing codes) (required)
     * @return ResponseEntity&lt;MessageGood&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MessageGood> apiPlaylistsPutWithHttpInfo(PlaylistInfor playlistInfor) throws RestClientException {
        Object localVarPostBody = playlistInfor;
        
        // verify the required parameter 'playlistInfor' is set
        if (playlistInfor == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'playlistInfor' when calling apiPlaylistsPut");
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

        ParameterizedTypeReference<MessageGood> localReturnType = new ParameterizedTypeReference<MessageGood>() {};
        return apiClient.invokeAPI("/api/playlists", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Playlists
     * 
     * <p><b>200</b> - Read playlist from user
     * <p><b>204</b> - No playlist
     * <p><b>400</b> - Bad request
     * @param userId 0 is from all user, 1+ is from some user (required)
     * @param sort DESC or ASC to sort by time (required)
     * @param page Pagination (optional)
     * @return PlaylistInforReturn
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PlaylistInforReturn apiPlaylistsUserIdTimesortsortpagepageGet(Integer userId, String sort, Integer page) throws RestClientException {
        return apiPlaylistsUserIdTimesortsortpagepageGetWithHttpInfo(userId, sort, page).getBody();
    }

    /**
     * Playlists
     * 
     * <p><b>200</b> - Read playlist from user
     * <p><b>204</b> - No playlist
     * <p><b>400</b> - Bad request
     * @param userId 0 is from all user, 1+ is from some user (required)
     * @param sort DESC or ASC to sort by time (required)
     * @param page Pagination (optional)
     * @return ResponseEntity&lt;PlaylistInforReturn&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PlaylistInforReturn> apiPlaylistsUserIdTimesortsortpagepageGetWithHttpInfo(Integer userId, String sort, Integer page) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling apiPlaylistsUserIdTimesortsortpagepageGet");
        }
        
        // verify the required parameter 'sort' is set
        if (sort == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sort' when calling apiPlaylistsUserIdTimesortsortpagepageGet");
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

        ParameterizedTypeReference<PlaylistInforReturn> localReturnType = new ParameterizedTypeReference<PlaylistInforReturn>() {};
        return apiClient.invokeAPI("/api/playlists/{userId}/time?sort={sort}&page={page}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Playlists
     * 
     * <p><b>200</b> - Read playlist from user
     * <p><b>204</b> - No playlist
     * <p><b>400</b> - Bad request
     * @param userId 0 is from all user, 1+ is from some user (required)
     * @param sort DESC or ASC to sort by view (required)
     * @param page Pagination (optional)
     * @return PlaylistInforReturn
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PlaylistInforReturn apiPlaylistsUserIdViewsortsortpagepageGet(Integer userId, String sort, Integer page) throws RestClientException {
        return apiPlaylistsUserIdViewsortsortpagepageGetWithHttpInfo(userId, sort, page).getBody();
    }

    /**
     * Playlists
     * 
     * <p><b>200</b> - Read playlist from user
     * <p><b>204</b> - No playlist
     * <p><b>400</b> - Bad request
     * @param userId 0 is from all user, 1+ is from some user (required)
     * @param sort DESC or ASC to sort by view (required)
     * @param page Pagination (optional)
     * @return ResponseEntity&lt;PlaylistInforReturn&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PlaylistInforReturn> apiPlaylistsUserIdViewsortsortpagepageGetWithHttpInfo(Integer userId, String sort, Integer page) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling apiPlaylistsUserIdViewsortsortpagepageGet");
        }
        
        // verify the required parameter 'sort' is set
        if (sort == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sort' when calling apiPlaylistsUserIdViewsortsortpagepageGet");
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

        ParameterizedTypeReference<PlaylistInforReturn> localReturnType = new ParameterizedTypeReference<PlaylistInforReturn>() {};
        return apiClient.invokeAPI("/api/playlists/{userId}/view?sort={sort}&page={page}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
