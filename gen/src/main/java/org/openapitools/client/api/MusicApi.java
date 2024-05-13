package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiMusicSearchSearchPagePageGet200Response;
import java.io.File;
import org.openapitools.client.model.MessageBad;
import org.openapitools.client.model.SongInfor;
import org.openapitools.client.model.UnauthorizedError;

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
public class MusicApi {
    private ApiClient apiClient;

    public MusicApi() {
        this(new ApiClient());
    }

    public MusicApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Download Music + Get song infors
     * 
     * <p><b>200</b> - After this api send response, /api/stream/{songId} is available to stream
     * <p><b>204</b> - No playlist
     * <p><b>401</b>
     * @param songId Valid youtube Id (required)
     * @return SongInfor
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SongInfor apiMusicSongIdGet(String songId) throws RestClientException {
        return apiMusicSongIdGetWithHttpInfo(songId).getBody();
    }

    /**
     * Download Music + Get song infors
     * 
     * <p><b>200</b> - After this api send response, /api/stream/{songId} is available to stream
     * <p><b>204</b> - No playlist
     * <p><b>401</b>
     * @param songId Valid youtube Id (required)
     * @return ResponseEntity&lt;SongInfor&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SongInfor> apiMusicSongIdGetWithHttpInfo(String songId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'songId' is set
        if (songId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'songId' when calling apiMusicSongIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("songId", songId);

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

        ParameterizedTypeReference<SongInfor> localReturnType = new ParameterizedTypeReference<SongInfor>() {};
        return apiClient.invokeAPI("/api/music/{songId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search music
     * Return data, only song that is less than 5 min
     * <p><b>200</b> - After this api send response, /api/stream/{songId} is available to stream
     * <p><b>204</b> - No playlist
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @return ApiMusicSearchSearchPagePageGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiMusicSearchSearchPagePageGet200Response apiMusicsearchsearchpagepageGet( UNKNOWN_PARAMETER_NAME,  UNKNOWN_PARAMETER_NAME2) throws RestClientException {
        return apiMusicsearchsearchpagepageGetWithHttpInfo(UNKNOWN_PARAMETER_NAME, UNKNOWN_PARAMETER_NAME2).getBody();
    }

    /**
     * Search music
     * Return data, only song that is less than 5 min
     * <p><b>200</b> - After this api send response, /api/stream/{songId} is available to stream
     * <p><b>204</b> - No playlist
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @return ResponseEntity&lt;ApiMusicSearchSearchPagePageGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiMusicSearchSearchPagePageGet200Response> apiMusicsearchsearchpagepageGetWithHttpInfo( UNKNOWN_PARAMETER_NAME,  UNKNOWN_PARAMETER_NAME2) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "", UNKNOWN_PARAMETER_NAME));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "", UNKNOWN_PARAMETER_NAME2));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ApiMusicSearchSearchPagePageGet200Response> localReturnType = new ParameterizedTypeReference<ApiMusicSearchSearchPagePageGet200Response>() {};
        return apiClient.invokeAPI("/api/music?search={search}&page={page}", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Stream Music
     * 
     * <p><b>200</b> - audio return
     * <p><b>204</b> - No playlist
     * <p><b>401</b>
     * @param songId Valid youtube Id (required)
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File apiStreamSongIdGet(String songId) throws RestClientException {
        return apiStreamSongIdGetWithHttpInfo(songId).getBody();
    }

    /**
     * Stream Music
     * 
     * <p><b>200</b> - audio return
     * <p><b>204</b> - No playlist
     * <p><b>401</b>
     * @param songId Valid youtube Id (required)
     * @return ResponseEntity&lt;File&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<File> apiStreamSongIdGetWithHttpInfo(String songId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'songId' is set
        if (songId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'songId' when calling apiStreamSongIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("songId", songId);

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

        ParameterizedTypeReference<File> localReturnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI("/api/stream/{songId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
